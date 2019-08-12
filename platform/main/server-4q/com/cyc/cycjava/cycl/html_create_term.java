/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cb_parameters.*;
import static com.cyc.cycjava.cycl.cb_utilities.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.cyc_file_dependencies.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related;
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
 * module:      HTML-CREATE-TERM
 * source file: /cyc/top/cycl/html-create-term.lisp
 * created:     2019/07/03 17:38:12
 */
public final class html_create_term extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt18$ = makeString("");

    public static final SubLFile me = new html_create_term();

 public static final String myName = "com.cyc.cycjava.cycl.html_create_term";


    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $cb_categorize_generalization_possibilities$ = makeSymbol("*CB-CATEGORIZE-GENERALIZATION-POSSIBILITIES*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $ke_requirements_query$ = makeSymbol("*KE-REQUIREMENTS-QUERY*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $cb_create_info$ = makeSymbol("*CB-CREATE-INFO*");

    private static final SubLSymbol $CB_CREATE_TERM = makeKeyword("CB-CREATE-TERM");

    static private final SubLString $str2$cb_create_term_html = makeString("cb-create-term.html");

    static private final SubLString $$$the_Create_Term_page = makeString("the Create Term page");

    static private final SubLString $$$Create_Term = makeString("Create Term");

    private static final SubLString $str5$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str6$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");

    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");

    private static final SubLString $str11$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $$$post = makeString("post");

    private static final SubLString $str17$cb_handle_create_term = makeString("cb-handle-create-term");

    private static final SubLString $$$Cancel_Create = makeString("Cancel Create");

    private static final SubLString $$$Reset = makeString("Reset");

    private static final SubLString $$$Create_Constant = makeString("Create Constant");

    private static final SubLString $str23$Name__required____ = makeString("Name (required) : ");

    private static final SubLString $str24$new_name = makeString("new-name");

    private static final SubLString $$$Clear = makeString("Clear");

    private static final SubLString $$$Complete = makeString("Complete");

    private static final SubLString $str27$ = makeString("");





    private static final SubLString $str30$__one_per_line__optional____ = makeString(", one per line (optional) : ");

    private static final SubLString $str31$term_strings = makeString("term-strings");



    private static final SubLString $str34$__required____ = makeString(" (required) : ");

    private static final SubLString $$$comment = makeString("comment");

    private static final SubLInteger $int$80 = makeInteger(80);

    private static final SubLString $$$virtual = makeString("virtual");

    private static final SubLSymbol CB_CREATE_TERM = makeSymbol("CB-CREATE-TERM");

    private static final SubLString $$$Creating = makeString("Creating");

    private static final SubLString $$$No_name_was_specified = makeString("No name was specified");

    private static final SubLString $str42$_S_is_not_a_valid_constant_name = makeString("~S is not a valid constant name");

    private static final SubLString $$$No_comment_was_specified = makeString("No comment was specified");

    private static final SubLString $str44$Unable_to_create_a_constant_named = makeString("Unable to create a constant named ~S");

    private static final SubLSymbol CB_HANDLE_CREATE_TERM = makeSymbol("CB-HANDLE-CREATE-TERM");

    private static final SubLString $str47$cb_create_term = makeString("cb-create-term");

    private static final SubLSymbol CB_LINK_CREATE_TERM = makeSymbol("CB-LINK-CREATE-TERM");

    private static final SubLString $$$Crt = makeString("Crt");

    private static final SubLString $$$Cyc_Constant_Creation_Wizard = makeString("Cyc Constant Creation Wizard");



    private static final SubLSymbol CR_OR_LF = makeSymbol("CR-OR-LF");

    private static final SubLString $str57$_a_does_not_specify_a_Cyc_term = makeString("~a does not specify a Cyc term");

    private static final SubLSymbol CB_CATEGORIZE_TERM = makeSymbol("CB-CATEGORIZE-TERM");

    private static final SubLString $$$Categorize_Term = makeString("Categorize Term");

    private static final SubLString $str60$cb_categorize_term__a = makeString("cb-categorize-term&~a");

    private static final SubLSymbol CB_LINK_CATEGORIZE_TERM = makeSymbol("CB-LINK-CATEGORIZE-TERM");

    public static final SubLSymbol $cb_categorize_info$ = makeSymbol("*CB-CATEGORIZE-INFO*");

    private static final SubLSymbol $CB_CATEGORIZE_TERM = makeKeyword("CB-CATEGORIZE-TERM");

    private static final SubLString $str65$cb_categorize_term_html = makeString("cb-categorize-term.html");

    private static final SubLString $str67$cb_handle_categorize_term = makeString("cb-handle-categorize-term");

    private static final SubLString $$$Categorize = makeString("Categorize");

    private static final SubLString $$$Categorize_ = makeString("Categorize ");

    private static final SubLString $str70$_ = makeString(":");

    private static final SubLString $$$term = makeString("term");

    private static final SubLString $str72$Mt___ = makeString("Mt : ");

    private static final SubLString $$$mt = makeString("mt");



    private static final SubLString $str75$Similar_to___ = makeString("Similar to : ");

    private static final SubLString $str76$similar_to = makeString("similar-to");



    private static final SubLString $str78$Instance_of___ = makeString("Instance of : ");

    private static final SubLString $$$isa = makeString("isa");

    private static final SubLString $str80$Specialization_of___ = makeString("Specialization of : ");

    private static final SubLString $$$genl = makeString("genl");

    private static final SubLString $$$generalization = makeString("generalization");

    private static final SubLString $str83$_a_does_not_specify_a_Cyc_Microth = makeString("~a does not specify a Cyc Microtheory");

    private static final SubLSymbol CB_HANDLE_CATEGORIZE_TERM = makeSymbol("CB-HANDLE-CATEGORIZE-TERM");

    private static final SubLList $list85 = list(list(reader_make_constant_shell("genls"), reader_make_constant_shell("Collection")), list(reader_make_constant_shell("genlMt"), reader_make_constant_shell("Microtheory")), list(reader_make_constant_shell("genlPreds"), reader_make_constant_shell("Predicate")), list(reader_make_constant_shell("genlInverse"), reader_make_constant_shell("Predicate")));







    private static final SubLList $list93 = list(makeSymbol("PRED"), makeSymbol("COL"));

    private static final SubLSymbol $CB_COPY_FROM_SIMILAR = makeKeyword("CB-COPY-FROM-SIMILAR");

    private static final SubLString $str95$cb_copy_from_similar_html = makeString("cb-copy-from-similar.html");

    private static final SubLString $str96$cb_handle_copy_from_similar = makeString("cb-handle-copy-from-similar");

    private static final SubLString $$$Copy_from_ = makeString("Copy from ");

    private static final SubLString $$$_to_ = makeString(" to ");

    private static final SubLString $$$Copy_Assertions = makeString("Copy Assertions");

    private static final SubLString $$$Check_the_assertions_from_ = makeString("Check the assertions from ");

    private static final SubLString $str101$_which_you_wish_to_copy__ = makeString(" which you wish to copy: ");

    private static final SubLSymbol CB_COPY_FROM_SIMILAR_CHECKBOX = makeSymbol("CB-COPY-FROM-SIMILAR-CHECKBOX");

    private static final SubLString $$$copy_from_similar_facilities = makeString("copy from similar facilities");

    private static final SubLString $$$No_source_term_was_specified = makeString("No source term was specified");

    private static final SubLString $str105$Unable_to_determine_a_term_from__ = makeString("Unable to determine a term from ~S");

    private static final SubLString $$$No_term_was_specified = makeString("No term was specified");

    private static final SubLSymbol CB_HANDLE_COPY_FROM_SIMILAR = makeSymbol("CB-HANDLE-COPY-FROM-SIMILAR");

    private static final SubLSymbol $CB_CONCEPTUALLY_RELATED_TERMS = makeKeyword("CB-CONCEPTUALLY-RELATED-TERMS");

    private static final SubLString $str109$cb_conceptually_related_terms_htm = makeString("cb-conceptually-related-terms.html");

    private static final SubLString $$$Conceptually_Related_Suggestions = makeString("Conceptually Related Suggestions");

    private static final SubLString $str111$cb_conceptually_related_terms = makeString("cb-conceptually-related-terms");

    private static final SubLString $$$fort = makeString("fort");

    private static final SubLString $$$Clear_All = makeString("Clear All");

    private static final SubLString $str114$Term___ = makeString("Term : ");

    private static final SubLString $str115$Existing_Conceptually_Related_Ter = makeString("Existing Conceptually Related Terms : ");

    private static final SubLSymbol $CT_CR_JUSTIFY = makeKeyword("CT-CR-JUSTIFY");

    private static final SubLString $str117$_Justify_ = makeString("[Justify]");

    private static final SubLString $$$None = makeString("None");

    private static final SubLString $str119$Specify_the_Microtheory_for_new__ = makeString("Specify the Microtheory for new #$conceptuallyRelated assertions:");

    private static final SubLString $str120$_Mt___ = makeString(" Mt : ");

    private static final SubLString $str121$_Select_terms_and_or_type_in_a_te = makeString(" Select terms and/or type in a term to add as #$conceptuallyRelated to ");

    private static final SubLString $str122$__ = makeString(": ");

    private static final SubLString $$$entered = makeString("entered");

    private static final SubLString $str124$_Term___ = makeString(" Term : ");

    private static final SubLString $str125$Possible_Terms_to_Add___ = makeString("Possible Terms to Add : ");

    private static final SubLString $$$Add_Terms_Backward = makeString("Add Terms Backward");

    private static final SubLString $str127$add_backward = makeString("add-backward");

    private static final SubLString $$$_as_ = makeString(" as ");



    private static final SubLString $$$_in_MT = makeString(" in MT");

    private static final SubLString $$$Add_Terms_Forward = makeString("Add Terms Forward");

    private static final SubLString $str133$add_forward = makeString("add-forward");

    private static final SubLList $list134 = list(makeSymbol("TERM"));

    private static final SubLString $str135$Unable_to_determine_last_term__wh = makeString("Unable to determine last term (why?)");

    private static final SubLString $str136$Invalid_Mt_specified____S = makeString("Invalid Mt specified : ~S");

    private static final SubLSymbol CB_CONCEPTUALLY_RELATED_TERMS = makeSymbol("CB-CONCEPTUALLY-RELATED-TERMS");

    private static final SubLString $$$id = makeString("id");

    private static final SubLString $$$Formulas_Asserted = makeString("Formulas Asserted");

    private static final SubLString $str141$Formulas_Asserted__ = makeString("Formulas Asserted :");

    private static final SubLString $$$_in_ = makeString(" in ");

    private static final SubLSymbol $sym143$WHY_CONCEPTUALLY_RELATED_ = makeSymbol("WHY-CONCEPTUALLY-RELATED?");

    private static final SubLString $str144$Sorry__System_74_92_or_later_is_r = makeString("Sorry, System 74.92 or later is required for justification to work.");

    private static final SubLString $$$Justify_Conceptually_Related = makeString("Justify Conceptually Related");

    private static final SubLSymbol CT_CR_JUSTIFY = makeSymbol("CT-CR-JUSTIFY");

    private static final SubLString $str147$ct_cr_justify__a = makeString("ct-cr-justify&~a");

    private static final SubLSymbol CB_LINK_CT_CR_JUSTIFY = makeSymbol("CB-LINK-CT-CR-JUSTIFY");

    private static final SubLSymbol CB_ELABORATE_TERM = makeSymbol("CB-ELABORATE-TERM");

    private static final SubLString $$$Elaborate_Term = makeString("Elaborate Term");

    private static final SubLString $str151$cb_elaborate_term__a = makeString("cb-elaborate-term&~a");

    private static final SubLSymbol CB_LINK_ELABORATE_TERM = makeSymbol("CB-LINK-ELABORATE-TERM");

    private static final SubLSymbol $CB_ELABORATE_TERM = makeKeyword("CB-ELABORATE-TERM");

    private static final SubLString $str155$cb_elaborate_term_html = makeString("cb-elaborate-term.html");

    private static final SubLString $str156$cb_handle_elaborate_term = makeString("cb-handle-elaborate-term");

    private static final SubLString $$$Elaborate = makeString("Elaborate");

    private static final SubLString $$$Elaborate_ = makeString("Elaborate ");

    private static final SubLString $str159$Requirements___ = makeString("Requirements : ");

    private static final SubLString $str160$Suggestions___ = makeString("Suggestions : ");

    private static final SubLList $list161 = list(reader_make_constant_shell("keRequirement"), $TERM, makeSymbol("?FORMULA"));



    public static final SubLObject cb_create_term_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != ke.cyclist_is_guest()) {
                return cyc_navigator_internals.guest_warn($$$the_Create_Term_page);
            }
            {
                SubLObject title_var = $$$Create_Term;
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
                                    html_markup($str_alt7$yui_skin_sam);
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
                                                SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_macros.$within_html_form$.bind(T, thread);
                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                    html_hidden_input($str_alt8$cb_handle_create_term, T, UNPROVIDED);
                                                    cb_help_preamble($CB_CREATE_TERM, NIL, UNPROVIDED);
                                                    cb_back_button($SELF, $$$Cancel_Create);
                                                    html_indent(UNPROVIDED);
                                                    html_reset_input($$$Reset);
                                                    html_indent(UNPROVIDED);
                                                    html_submit_input($$$Create_Constant, UNPROVIDED, UNPROVIDED);
                                                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                    html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
                                                    html_simple_attribute(html_macros.$html_table_nowrap$.getGlobalValue());
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                            if (true) {
                                                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                html_markup(html_align($TOP));
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                    html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                            html_princ($str_alt14$Name__required____);
                                                                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                            html_script_utilities.html_clear_input_button($str_alt15$new_name, $$$Clear);
                                                                            html_complete.html_complete_button($str_alt15$new_name, $$$Complete, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                            html_newline(UNPROVIDED);
                                                                            html_text_input($str_alt15$new_name, $str_alt18$, $int$35);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                                                                        }
                                                                    }
                                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                    if (true) {
                                                                        html_markup(html_macros.$html_table_data_rowspan$.getGlobalValue());
                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_markup(TWO_INTEGER);
                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                            cb_form($$termStrings, UNPROVIDED, UNPROVIDED);
                                                                            html_princ($str_alt21$__one_per_line__optional____);
                                                                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                            html_script_utilities.html_clear_input_button($str_alt22$term_strings, $$$Clear);
                                                                            html_newline(UNPROVIDED);
                                                                            html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                                                            html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_markup($str_alt22$term_strings);
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                            if (true) {
                                                                                html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_markup($int$35);
                                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            if (true) {
                                                                                html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                                html_markup(THREE_INTEGER);
                                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                                                                }
                                                                            }
                                                                            html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                                                        }
                                                                    }
                                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                                                                }
                                                            }
                                                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                            html_source_readability_terpri(UNPROVIDED);
                                                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                            if (true) {
                                                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                html_markup(html_align($BOTTOM));
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                    html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                            cb_form($$comment, UNPROVIDED, UNPROVIDED);
                                                                            html_princ($str_alt25$__required____);
                                                                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                            html_script_utilities.html_clear_input_button($$$comment, $$$Clear);
                                                                            html_complete.html_complete_button($$$comment, $$$Complete, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                                                        }
                                                                    }
                                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
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
                                                                SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                                        SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                                                            html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_markup($$$comment);
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
                                                                                html_markup(TEN_INTEGER);
                                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                            }
                                                                            html_markup(html_macros.$html_table_wrap$.getGlobalValue());
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_markup($$$virtual);
                                                                            html_char(CHAR_quotation, UNPROVIDED);
                                                                            html_char(CHAR_greater, UNPROVIDED);
                                                                            {
                                                                                SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                                try {
                                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                                } finally {
                                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                                                                }
                                                                            }
                                                                            html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
                                                                        }
                                                                    }
                                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
                                                                }
                                                            }
                                                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                            html_source_readability_terpri(UNPROVIDED);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        }
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

    public static SubLObject cb_create_term(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ke.cyclist_is_guest()) {
            return cyc_navigator_internals.guest_warn($$$the_Create_Term_page);
        }
        final SubLObject title_var = $$$Create_Term;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str5$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str6$_meta_http_equiv__X_UA_Compatible);
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
                html_complete.html_complete_script();
                cyc_file_dependencies.css($SAM_AUTOCOMPLETE_CSS);
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
                    html_markup($str11$yui_skin_sam);
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
                        final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str17$cb_handle_create_term, T, UNPROVIDED);
                            cb_help_preamble($CB_CREATE_TERM, NIL, UNPROVIDED);
                            cb_back_button($SELF, $$$Cancel_Create);
                            html_indent(UNPROVIDED);
                            html_reset_input($$$Reset);
                            html_indent(UNPROVIDED);
                            html_submit_input($$$Create_Constant, UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
                            html_simple_attribute(html_macros.$html_table_nowrap$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_princ($str23$Name__required____);
                                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_script_utilities.html_clear_input_button($str24$new_name, $$$Clear, UNPROVIDED);
                                        html_complete.html_complete_button($str24$new_name, $$$Complete, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        html_newline(UNPROVIDED);
                                        html_text_input($str24$new_name, $str27$, $int$35);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_rowspan$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(TWO_INTEGER);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        cb_form($$termStrings, UNPROVIDED, UNPROVIDED);
                                        html_princ($str30$__one_per_line__optional____);
                                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_script_utilities.html_clear_input_button($str31$term_strings, $$$Clear, UNPROVIDED);
                                        html_newline(UNPROVIDED);
                                        html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                        html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup($str31$term_strings);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup($int$35);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(THREE_INTEGER);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                                        }
                                        html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($BOTTOM));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        cb_form($$comment, UNPROVIDED, UNPROVIDED);
                                        html_princ($str34$__required____);
                                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_script_utilities.html_clear_input_button($$$comment, $$$Clear, UNPROVIDED);
                                        html_complete.html_complete_button($$$comment, $$$Complete, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(TWO_INTEGER);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                        html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup($$$comment);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup($int$80);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(TEN_INTEGER);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_macros.$html_table_wrap$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup($$$virtual);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                                        }
                                        html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                            }
                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
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

    public static final SubLObject cb_handle_create_term_alt(SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$Creating);
            return NIL;
        }
        {
            SubLObject new_name = string_utilities.trim_whitespace(html_extract_input($str_alt15$new_name, args));
            SubLObject comment = html_extract_input($$$comment, args);
            SubLObject term_string_text = html_extract_input($str_alt22$term_strings, args);
            SubLObject term_strings = NIL;
            if ((!new_name.isString()) || new_name.equal($str_alt18$)) {
                cb_error($$$No_name_was_specified, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                if (NIL == constant_completion_high.valid_constant_name_p(new_name)) {
                    cb_error($str_alt32$_S_is_not_a_valid_constant_name, new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    {
                        SubLObject existing = constants_high.find_constant(new_name);
                        if (NIL != existing) {
                            return com.cyc.cycjava.cycl.html_create_term.cb_categorize_term_guts(existing);
                        }
                    }
                }
            }
            if ((!comment.isString()) || comment.equal($str_alt18$)) {
                cb_error($$$No_comment_was_specified, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (term_string_text.isString() && (!term_strings.equal($str_alt18$))) {
                term_strings = com.cyc.cycjava.cycl.html_create_term.cb_extract_lines(term_string_text);
            }
            {
                SubLObject new_constant = com.cyc.cycjava.cycl.html_create_term.cb_create_term_hook(new_name, comment, term_strings);
                if (NIL != constant_p(new_constant)) {
                    cb_tools.cb_add_to_constant_history(new_constant);
                    com.cyc.cycjava.cycl.html_create_term.cb_categorize_term_guts(new_constant);
                } else {
                    cb_error($str_alt34$Unable_to_create_a_constant_named, new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static SubLObject cb_handle_create_term(final SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$Creating);
            return NIL;
        }
        final SubLObject new_name = string_utilities.trim_whitespace(html_extract_input($str24$new_name, args));
        final SubLObject comment = html_extract_input($$$comment, args);
        final SubLObject term_string_text = html_extract_input($str31$term_strings, args);
        SubLObject term_strings = NIL;
        if ((!new_name.isString()) || new_name.equal($str27$)) {
            cb_error($$$No_name_was_specified, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else
            if (NIL == constant_completion_high.valid_constant_name_p(new_name)) {
                cb_error($str42$_S_is_not_a_valid_constant_name, new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                final SubLObject existing = constants_high.find_constant(new_name);
                if (NIL != existing) {
                    return cb_categorize_term_guts(existing);
                }
            }

        if ((!comment.isString()) || comment.equal($str27$)) {
            cb_error($$$No_comment_was_specified, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (term_string_text.isString() && (!term_strings.equal($str27$))) {
            term_strings = cb_extract_lines(term_string_text);
        }
        final SubLObject new_constant = cb_create_term_hook(new_name, comment, term_strings);
        if (NIL != constant_p(new_constant)) {
            cb_tools.cb_add_to_constant_history(new_constant);
            cb_categorize_term_guts(new_constant);
        } else {
            cb_error($str44$Unable_to_create_a_constant_named, new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject cb_link_create_term_alt(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $$$Create_Term;
            }
            {
                SubLObject frame_name_var = cb_frame_name($MAIN);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                html_princ($str_alt37$cb_create_term);
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

    public static SubLObject cb_link_create_term(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$Create_Term;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str47$cb_create_term);
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

    public static final SubLObject cb_create_term_hook_alt(SubLObject new_name, SubLObject comment, SubLObject term_strings) {
        if (comment == UNPROVIDED) {
            comment = NIL;
        }
        if (term_strings == UNPROVIDED) {
            term_strings = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(new_name, STRINGP);
            {
                SubLObject new_constant = NIL;
                {
                    SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                    try {
                        api_control_vars.$use_local_queueP$.bind(NIL, thread);
                        new_constant = ke.ke_create(new_name);
                        if (NIL != new_constant) {
                            if (comment.isString()) {
                                ke.ke_assert(list($$comment, new_constant, comment), mt_vars.$default_assert_mt$.getGlobalValue(), $DEFAULT, $FORWARD);
                            }
                            {
                                SubLObject cdolist_list_var = term_strings;
                                SubLObject term_string = NIL;
                                for (term_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , term_string = cdolist_list_var.first()) {
                                    SubLTrampolineFile.checkType(term_string, STRINGP);
                                    ke.ke_assert(list($$termStrings, new_constant, term_string), $$TemporaryLexicalAssertionsMt, $DEFAULT, $FORWARD);
                                }
                            }
                        }
                    } finally {
                        api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
                    }
                }
                return new_constant;
            }
        }
    }

    public static SubLObject cb_create_term_hook(final SubLObject new_name, SubLObject comment, SubLObject term_strings) {
        if (comment == UNPROVIDED) {
            comment = NIL;
        }
        if (term_strings == UNPROVIDED) {
            term_strings = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(new_name) : "! stringp(new_name) " + ("Types.stringp(new_name) " + "CommonSymbols.NIL != Types.stringp(new_name) ") + new_name;
        SubLObject new_constant = NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind(NIL, thread);
            new_constant = ke.ke_create(new_name);
            if (NIL != new_constant) {
                if (comment.isString()) {
                    ke.ke_assert(list($$comment, new_constant, comment), mt_vars.$default_assert_mt$.getGlobalValue(), $DEFAULT, $FORWARD);
                }
                SubLObject cdolist_list_var = term_strings;
                SubLObject term_string = NIL;
                term_string = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    assert NIL != stringp(term_string) : "! stringp(term_string) " + ("Types.stringp(term_string) " + "CommonSymbols.NIL != Types.stringp(term_string) ") + term_string;
                    ke.ke_assert(list($$termStrings, new_constant, term_string), $$TemporaryLexicalAssertionsMt, $DEFAULT, $FORWARD);
                    cdolist_list_var = cdolist_list_var.rest();
                    term_string = cdolist_list_var.first();
                } 
            }
        } finally {
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
        return new_constant;
    }

    public static final SubLObject cb_extract_lines_alt(SubLObject string) {
        return delete($str_alt18$, com.cyc.cycjava.cycl.html_create_term.cb_extract_lines_recursive(string, ZERO_INTEGER), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cb_extract_lines(final SubLObject string) {
        return delete($str27$, cb_extract_lines_recursive(string, ZERO_INTEGER), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cb_extract_lines_recursive_alt(SubLObject string, SubLObject start) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        {
            SubLObject position = position_if(symbol_function(CR_OR_LF), string, symbol_function(IDENTITY), start, UNPROVIDED);
            if (position.isInteger()) {
                return cons(string_utilities.trim_whitespace(subseq(string, start, position)), com.cyc.cycjava.cycl.html_create_term.cb_extract_lines_recursive(string, add(position, ONE_INTEGER)));
            } else {
                return list(string_utilities.trim_whitespace(subseq(string, start, UNPROVIDED)));
            }
        }
    }

    public static SubLObject cb_extract_lines_recursive(final SubLObject string, SubLObject start) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        final SubLObject position = position_if(symbol_function(CR_OR_LF), string, symbol_function(IDENTITY), start, UNPROVIDED);
        if (position.isInteger()) {
            return cons(string_utilities.trim_whitespace(subseq(string, start, position)), cb_extract_lines_recursive(string, add(position, ONE_INTEGER)));
        }
        return list(string_utilities.trim_whitespace(subseq(string, start, UNPROVIDED)));
    }

    public static final SubLObject cr_or_lf_alt(SubLObject v_char) {
        return makeBoolean(char_code(v_char).numE(TEN_INTEGER) || char_code(v_char).numE(THIRTEEN_INTEGER));
    }

    public static SubLObject cr_or_lf(final SubLObject v_char) {
        return makeBoolean(char_code(v_char).numE(TEN_INTEGER) || char_code(v_char).numE(THIRTEEN_INTEGER));
    }

    public static final SubLObject cb_categorize_term_alt(SubLObject args) {
        {
            SubLObject fort_spec = args.first();
            SubLObject fort = cb_guess_fort(args.first(), UNPROVIDED);
            if (NIL == forts.fort_p(fort)) {
                cb_error($str_alt47$_a_does_not_specify_a_Cyc_term, fort_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return NIL;
            }
            return com.cyc.cycjava.cycl.html_create_term.cb_categorize_term_guts(fort);
        }
    }

    public static SubLObject cb_categorize_term(final SubLObject args) {
        final SubLObject fort_spec = args.first();
        final SubLObject fort = cb_guess_fort(args.first(), UNPROVIDED);
        if (NIL == forts.fort_p(fort)) {
            cb_error($str57$_a_does_not_specify_a_Cyc_term, fort_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        return cb_categorize_term_guts(fort);
    }

    public static final SubLObject cb_link_categorize_term_alt(SubLObject v_term, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $$$Categorize_Term;
            }
            {
                SubLObject frame_name_var = cb_frame_name($MAIN);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt50$cb_categorize_term__a, cb_fort_identifier(v_term));
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

    public static SubLObject cb_link_categorize_term(final SubLObject v_term, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$Categorize_Term;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str60$cb_categorize_term__a, cb_fort_identifier(v_term));
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

    public static final SubLObject cb_categorize_term_guts_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_term, FORT_P);
            {
                SubLObject mt = mt_vars.$default_assert_mt$.getGlobalValue();
                SubLObject title_var = $$$Categorize_Term;
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
                                    html_markup($str_alt7$yui_skin_sam);
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
                                                    html_hidden_input($str_alt57$cb_handle_categorize_term, T, UNPROVIDED);
                                                    cb_help_preamble($CB_CATEGORIZE_TERM, NIL, UNPROVIDED);
                                                    cb_back_button($SELF, UNPROVIDED);
                                                    html_indent(UNPROVIDED);
                                                    html_reset_input($$$Clear);
                                                    html_indent(UNPROVIDED);
                                                    html_submit_input($$$Categorize, UNPROVIDED, UNPROVIDED);
                                                    html_newline(TWO_INTEGER);
                                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_princ($str_alt59$Categorize_);
                                                    cb_form(v_term, UNPROVIDED, UNPROVIDED);
                                                    html_princ($str_alt60$_);
                                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    {
                                                        SubLObject comment = kb_mapping_utilities.fpred_value_in_mt(v_term, $$comment, mt_vars.$default_comment_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        if (NIL == comment) {
                                                            comment = kb_mapping_utilities.fpred_value_in_any_mt(v_term, $$comment, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                        if (comment.isString()) {
                                                            html_newline(UNPROVIDED);
                                                            cb_browser.cb_c_documentation_string(comment);
                                                        }
                                                    }
                                                    html_newline(UNPROVIDED);
                                                    html_hidden_input($$$term, cb_fort_identifier(v_term), UNPROVIDED);
                                                    html_newline(UNPROVIDED);
                                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_princ($str_alt62$Mt___);
                                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    html_script_utilities.html_clear_input_button($$$mt, $$$Clear);
                                                    html_newline(UNPROVIDED);
                                                    html_complete.html_complete_button($$$mt, $$$Complete, $$Microtheory, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    html_text_input($$$mt, NIL != mt ? ((SubLObject) (cb_string_for_fort(mt))) : NIL, $cb_constant_input_width$.getDynamicValue(thread));
                                                    html_newline(UNPROVIDED);
                                                    html_newline(UNPROVIDED);
                                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_princ($str_alt65$Similar_to___);
                                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    html_script_utilities.html_clear_input_button($str_alt66$similar_to, $$$Clear);
                                                    html_newline(UNPROVIDED);
                                                    html_complete.html_complete_button($str_alt66$similar_to, $$$Complete, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    {
                                                        SubLObject last_similar = $cb_categorize_info$.getDynamicValue(thread).first();
                                                        html_text_input($str_alt66$similar_to, last_similar, $int$40);
                                                    }
                                                    html_newline(UNPROVIDED);
                                                    html_newline(UNPROVIDED);
                                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_princ($str_alt68$Instance_of___);
                                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    html_script_utilities.html_clear_input_button($$$isa, $$$Clear);
                                                    html_newline(UNPROVIDED);
                                                    html_complete.html_complete_button($$$isa, $$$Complete, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    {
                                                        SubLObject last_isa = second($cb_categorize_info$.getDynamicValue(thread));
                                                        html_text_input($$$isa, last_isa, $int$40);
                                                    }
                                                    html_newline(UNPROVIDED);
                                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_princ($str_alt70$Specialization_of___);
                                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    html_script_utilities.html_clear_input_button($$$genl, $$$Clear);
                                                    html_newline(UNPROVIDED);
                                                    html_complete.html_complete_button($$$genl, $$$Complete, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    {
                                                        SubLObject last_genl = third($cb_categorize_info$.getDynamicValue(thread));
                                                        html_text_input($$$genl, last_genl, $int$40);
                                                    }
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
            return NIL;
        }
    }

    public static SubLObject cb_categorize_term_guts(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        final SubLObject mt = mt_vars.$default_assert_mt$.getGlobalValue();
        final SubLObject title_var = $$$Categorize_Term;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str5$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str6$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$16 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$17 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str11$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
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
                        final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str67$cb_handle_categorize_term, T, UNPROVIDED);
                            cb_help_preamble($CB_CATEGORIZE_TERM, NIL, UNPROVIDED);
                            cb_back_button($SELF, UNPROVIDED);
                            html_indent(UNPROVIDED);
                            html_reset_input($$$Clear);
                            html_indent(UNPROVIDED);
                            html_submit_input($$$Categorize, UNPROVIDED, UNPROVIDED);
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($$$Categorize_);
                            cb_form(v_term, UNPROVIDED, UNPROVIDED);
                            html_princ($str70$_);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            SubLObject comment = kb_mapping_utilities.fpred_value_in_mt(v_term, $$comment, mt_vars.$default_comment_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            if (NIL == comment) {
                                comment = kb_mapping_utilities.fpred_value_in_any_mt(v_term, $$comment, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                            if (comment.isString()) {
                                html_newline(UNPROVIDED);
                                cb_browser.cb_c_documentation_string(comment);
                            }
                            html_newline(UNPROVIDED);
                            html_hidden_input($$$term, cb_fort_identifier(v_term), UNPROVIDED);
                            html_newline(UNPROVIDED);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str72$Mt___);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_script_utilities.html_clear_input_button($$$mt, $$$Clear, UNPROVIDED);
                            html_newline(UNPROVIDED);
                            html_complete.html_complete_button($$$mt, $$$Complete, $$Microtheory, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_text_input($$$mt, NIL != mt ? cb_string_for_fort(mt) : NIL, $cb_constant_input_width$.getDynamicValue(thread));
                            html_newline(UNPROVIDED);
                            html_newline(UNPROVIDED);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str75$Similar_to___);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_script_utilities.html_clear_input_button($str76$similar_to, $$$Clear, UNPROVIDED);
                            html_newline(UNPROVIDED);
                            html_complete.html_complete_button($str76$similar_to, $$$Complete, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            final SubLObject last_similar = $cb_categorize_info$.getDynamicValue(thread).first();
                            html_text_input($str76$similar_to, last_similar, $int$40);
                            html_newline(UNPROVIDED);
                            html_newline(UNPROVIDED);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str78$Instance_of___);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_script_utilities.html_clear_input_button($$$isa, $$$Clear, UNPROVIDED);
                            html_newline(UNPROVIDED);
                            html_complete.html_complete_button($$$isa, $$$Complete, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            final SubLObject last_isa = second($cb_categorize_info$.getDynamicValue(thread));
                            html_text_input($$$isa, last_isa, $int$40);
                            html_newline(UNPROVIDED);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str80$Specialization_of___);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_script_utilities.html_clear_input_button($$$genl, $$$Clear, UNPROVIDED);
                            html_newline(UNPROVIDED);
                            html_complete.html_complete_button($$$genl, $$$Complete, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            final SubLObject last_genl = third($cb_categorize_info$.getDynamicValue(thread));
                            html_text_input($$$genl, last_genl, $int$40);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$17, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$16, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject cb_handle_categorize_term_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject term_id = html_extract_input($$$term, args);
                SubLObject mt_string = html_extract_input($$$mt, args);
                SubLObject similar_to_string = html_extract_input($str_alt66$similar_to, args);
                SubLObject isa_string = html_extract_input($$$isa, args);
                SubLObject generalization_string = html_extract_input($$$generalization, args);
                SubLObject v_term = NIL;
                SubLObject mt = NIL;
                SubLObject similar_to = NIL;
                SubLObject v_isa = NIL;
                SubLObject generalization = NIL;
                v_term = cb_guess_fort(term_id, UNPROVIDED);
                if (NIL == forts.fort_p(v_term)) {
                    cb_error($str_alt47$_a_does_not_specify_a_Cyc_term, term_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    return NIL;
                }
                mt = cb_guess_fort(mt_string, UNPROVIDED);
                if (!((NIL != forts.fort_p(mt)) && (NIL != isa.isa_in_any_mtP(mt, $$Microtheory)))) {
                    cb_error($str_alt73$_a_does_not_specify_a_Cyc_Microth, mt_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    return NIL;
                }
                if (similar_to_string.isString() && (!$str_alt18$.equal(similar_to_string))) {
                    similar_to = cb_guess_fort(similar_to_string, UNPROVIDED);
                    if (NIL == forts.fort_p(similar_to)) {
                        cb_error($str_alt47$_a_does_not_specify_a_Cyc_term, similar_to_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        return NIL;
                    }
                }
                if (isa_string.isString() && (!$str_alt18$.equal(isa_string))) {
                    v_isa = cb_guess_fort(isa_string, UNPROVIDED);
                    if (NIL == forts.fort_p(v_isa)) {
                        cb_error($str_alt47$_a_does_not_specify_a_Cyc_term, isa_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        return NIL;
                    }
                }
                if (generalization_string.isString() && (!$str_alt18$.equal(generalization_string))) {
                    generalization = cb_guess_fort(generalization_string, UNPROVIDED);
                    if (NIL == forts.fort_p(generalization)) {
                        cb_error($str_alt47$_a_does_not_specify_a_Cyc_term, generalization_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        return NIL;
                    }
                }
                if (NIL == $cb_categorize_info$.getDynamicValue(thread)) {
                    $cb_categorize_info$.setDynamicValue(list($str_alt18$, $str_alt18$, $str_alt18$), thread);
                }
                set_nth(ZERO_INTEGER, $cb_categorize_info$.getDynamicValue(thread), similar_to_string);
                set_nth(ONE_INTEGER, $cb_categorize_info$.getDynamicValue(thread), isa_string);
                set_nth(TWO_INTEGER, $cb_categorize_info$.getDynamicValue(thread), generalization_string);
                if (NIL != similar_to) {
                    com.cyc.cycjava.cycl.html_create_term.cb_categorize_similar(v_term, similar_to);
                }
                if (NIL != v_isa) {
                    com.cyc.cycjava.cycl.html_create_term.cb_categorize_isa(v_term, v_isa);
                }
                if (NIL != generalization) {
                    com.cyc.cycjava.cycl.html_create_term.cb_categorize_generalization(v_term, generalization);
                }
                if (NIL != similar_to) {
                    com.cyc.cycjava.cycl.html_create_term.cb_copy_from_similar_guts(v_term, similar_to);
                } else {
                    com.cyc.cycjava.cycl.html_create_term.cb_conceptually_related_guts(v_term);
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_handle_categorize_term(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term_id = html_extract_input($$$term, args);
        final SubLObject mt_string = html_extract_input($$$mt, args);
        final SubLObject similar_to_string = html_extract_input($str76$similar_to, args);
        final SubLObject isa_string = html_extract_input($$$isa, args);
        final SubLObject generalization_string = html_extract_input($$$generalization, args);
        SubLObject v_term = NIL;
        SubLObject mt = NIL;
        SubLObject similar_to = NIL;
        SubLObject v_isa = NIL;
        SubLObject generalization = NIL;
        v_term = cb_guess_fort(term_id, UNPROVIDED);
        if (NIL == forts.fort_p(v_term)) {
            cb_error($str57$_a_does_not_specify_a_Cyc_term, term_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        mt = cb_guess_fort(mt_string, UNPROVIDED);
        if ((NIL == forts.fort_p(mt)) || (NIL == isa.isa_in_any_mtP(mt, $$Microtheory))) {
            cb_error($str83$_a_does_not_specify_a_Cyc_Microth, mt_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        if (similar_to_string.isString() && (!$str27$.equal(similar_to_string))) {
            similar_to = cb_guess_fort(similar_to_string, UNPROVIDED);
            if (NIL == forts.fort_p(similar_to)) {
                cb_error($str57$_a_does_not_specify_a_Cyc_term, similar_to_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return NIL;
            }
        }
        if (isa_string.isString() && (!$str27$.equal(isa_string))) {
            v_isa = cb_guess_fort(isa_string, UNPROVIDED);
            if (NIL == forts.fort_p(v_isa)) {
                cb_error($str57$_a_does_not_specify_a_Cyc_term, isa_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return NIL;
            }
        }
        if (generalization_string.isString() && (!$str27$.equal(generalization_string))) {
            generalization = cb_guess_fort(generalization_string, UNPROVIDED);
            if (NIL == forts.fort_p(generalization)) {
                cb_error($str57$_a_does_not_specify_a_Cyc_term, generalization_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return NIL;
            }
        }
        if (NIL == $cb_categorize_info$.getDynamicValue(thread)) {
            $cb_categorize_info$.setDynamicValue(list($str27$, $str27$, $str27$), thread);
        }
        set_nth(ZERO_INTEGER, $cb_categorize_info$.getDynamicValue(thread), similar_to_string);
        set_nth(ONE_INTEGER, $cb_categorize_info$.getDynamicValue(thread), isa_string);
        set_nth(TWO_INTEGER, $cb_categorize_info$.getDynamicValue(thread), generalization_string);
        if (NIL != similar_to) {
            cb_categorize_similar(v_term, similar_to);
        }
        if (NIL != v_isa) {
            cb_categorize_isa(v_term, v_isa);
        }
        if (NIL != generalization) {
            cb_categorize_generalization(v_term, generalization);
        }
        if (NIL != similar_to) {
            cb_copy_from_similar_guts(v_term, similar_to);
        } else {
            cb_conceptually_related_guts(v_term);
        }
        return NIL;
    }

    public static final SubLObject cb_categorize_similar_alt(SubLObject v_term, SubLObject similar_to) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_term, FORT_P);
            SubLTrampolineFile.checkType(similar_to, FORT_P);
            {
                SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                try {
                    api_control_vars.$use_local_queueP$.bind(NIL, thread);
                    {
                        SubLObject _prev_bind_0_17 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            {
                                SubLObject pred_var = $$isa;
                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(similar_to, ONE_INTEGER, pred_var)) {
                                    {
                                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(similar_to, ONE_INTEGER, pred_var);
                                        SubLObject done_var = NIL;
                                        SubLObject token_var = NIL;
                                        while (NIL == done_var) {
                                            {
                                                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                if (NIL != valid) {
                                                    {
                                                        SubLObject final_index_iterator = NIL;
                                                        try {
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                            {
                                                                SubLObject done_var_18 = NIL;
                                                                SubLObject token_var_19 = NIL;
                                                                while (NIL == done_var_18) {
                                                                    {
                                                                        SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_19);
                                                                        SubLObject valid_20 = makeBoolean(token_var_19 != ass);
                                                                        if (NIL != valid_20) {
                                                                            if (NIL != assertions_high.asserted_assertionP(ass)) {
                                                                                {
                                                                                    SubLObject mt = assertions_high.assertion_mt(ass);
                                                                                    SubLObject col = assertions_high.gaf_arg2(ass);
                                                                                    SubLObject strength = assertions_high.assertion_strength(ass);
                                                                                    ke.ke_assert(list($$isa, v_term, col), mt, strength, $FORWARD);
                                                                                }
                                                                            }
                                                                        }
                                                                        done_var_18 = makeBoolean(NIL == valid_20);
                                                                    }
                                                                } 
                                                            }
                                                        } finally {
                                                            {
                                                                SubLObject _prev_bind_0_21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    if (NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_21, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                done_var = makeBoolean(NIL == valid);
                                            }
                                        } 
                                    }
                                }
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_17, thread);
                        }
                    }
                    {
                        SubLObject cdolist_list_var = $cb_categorize_generalization_possibilities$.getGlobalValue();
                        SubLObject info = NIL;
                        for (info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , info = cdolist_list_var.first()) {
                            {
                                SubLObject pred = info.first();
                                {
                                    SubLObject _prev_bind_0_22 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                        {
                                            SubLObject pred_var = pred;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(similar_to, ONE_INTEGER, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(similar_to, ONE_INTEGER, pred_var);
                                                    SubLObject done_var = NIL;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                                        {
                                                                            SubLObject done_var_23 = NIL;
                                                                            SubLObject token_var_24 = NIL;
                                                                            while (NIL == done_var_23) {
                                                                                {
                                                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_24);
                                                                                    SubLObject valid_25 = makeBoolean(token_var_24 != ass);
                                                                                    if (NIL != valid_25) {
                                                                                        if (NIL != assertions_high.asserted_assertionP(ass)) {
                                                                                            {
                                                                                                SubLObject mt = assertions_high.assertion_mt(ass);
                                                                                                SubLObject arg2 = assertions_high.gaf_arg2(ass);
                                                                                                SubLObject strength = assertions_high.assertion_strength(ass);
                                                                                                ke.ke_assert(list(pred, v_term, arg2), mt, strength, $FORWARD);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    done_var_23 = makeBoolean(NIL == valid_25);
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0_26 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_26, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            done_var = makeBoolean(NIL == valid);
                                                        }
                                                    } 
                                                }
                                            }
                                        }
                                    } finally {
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_22, thread);
                                    }
                                }
                            }
                        }
                    }
                } finally {
                    api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_categorize_similar(final SubLObject v_term, final SubLObject similar_to) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        assert NIL != forts.fort_p(similar_to) : "! forts.fort_p(similar_to) " + ("forts.fort_p(similar_to) " + "CommonSymbols.NIL != forts.fort_p(similar_to) ") + similar_to;
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind(NIL, thread);
            final SubLObject _prev_bind_0_$21 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                final SubLObject pred_var = $$isa;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(similar_to, ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(similar_to, ONE_INTEGER, pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$22 = NIL;
                                final SubLObject token_var_$23 = NIL;
                                while (NIL == done_var_$22) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$23);
                                    final SubLObject valid_$24 = makeBoolean(!token_var_$23.eql(ass));
                                    if ((NIL != valid_$24) && (NIL != assertions_high.asserted_assertionP(ass))) {
                                        final SubLObject mt = assertions_high.assertion_mt(ass);
                                        final SubLObject col = assertions_high.gaf_arg2(ass);
                                        final SubLObject strength = assertions_high.assertion_strength(ass);
                                        ke.ke_assert(list($$isa, v_term, col), mt, strength, $FORWARD);
                                    }
                                    done_var_$22 = makeBoolean(NIL == valid_$24);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$22 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$21, thread);
            }
            SubLObject cdolist_list_var = $cb_categorize_generalization_possibilities$.getGlobalValue();
            SubLObject info = NIL;
            info = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject pred = info.first();
                final SubLObject _prev_bind_0_$23 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    final SubLObject pred_var2 = pred;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(similar_to, ONE_INTEGER, pred_var2)) {
                        final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(similar_to, ONE_INTEGER, pred_var2);
                        SubLObject done_var2 = NIL;
                        final SubLObject token_var2 = NIL;
                        while (NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                            if (NIL != valid2) {
                                SubLObject final_index_iterator2 = NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$23 = NIL;
                                    final SubLObject token_var_$24 = NIL;
                                    while (NIL == done_var_$23) {
                                        final SubLObject ass2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$24);
                                        final SubLObject valid_$25 = makeBoolean(!token_var_$24.eql(ass2));
                                        if ((NIL != valid_$25) && (NIL != assertions_high.asserted_assertionP(ass2))) {
                                            final SubLObject mt2 = assertions_high.assertion_mt(ass2);
                                            final SubLObject arg2 = assertions_high.gaf_arg2(ass2);
                                            final SubLObject strength2 = assertions_high.assertion_strength(ass2);
                                            ke.ke_assert(list(pred, v_term, arg2), mt2, strength2, $FORWARD);
                                        }
                                        done_var_$23 = makeBoolean(NIL == valid_$25);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$24 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                                    }
                                }
                            }
                            done_var2 = makeBoolean(NIL == valid2);
                        } 
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$23, thread);
                }
                cdolist_list_var = cdolist_list_var.rest();
                info = cdolist_list_var.first();
            } 
        } finally {
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject cb_categorize_isa_alt(SubLObject v_term, SubLObject collection) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_term, FORT_P);
            SubLTrampolineFile.checkType(collection, FORT_P);
            {
                SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                try {
                    api_control_vars.$use_local_queueP$.bind(NIL, thread);
                    {
                        SubLObject mts = com.cyc.cycjava.cycl.html_create_term.cb_categorize_isa_guess_mts(collection);
                        SubLObject cdolist_list_var = mts;
                        SubLObject mt = NIL;
                        for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                            ke.ke_assert(list($$isa, v_term, collection), mt, $MONOTONIC, $FORWARD);
                        }
                    }
                } finally {
                    api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_categorize_isa(final SubLObject v_term, final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        assert NIL != forts.fort_p(collection) : "! forts.fort_p(collection) " + ("forts.fort_p(collection) " + "CommonSymbols.NIL != forts.fort_p(collection) ") + collection;
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind(NIL, thread);
            SubLObject cdolist_list_var;
            final SubLObject mts = cdolist_list_var = cb_categorize_isa_guess_mts(collection);
            SubLObject mt = NIL;
            mt = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                ke.ke_assert(list($$isa, v_term, collection), mt, $MONOTONIC, $FORWARD);
                cdolist_list_var = cdolist_list_var.rest();
                mt = cdolist_list_var.first();
            } 
        } finally {
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject cb_categorize_isa_guess_mts_alt(SubLObject collection) {
        {
            SubLObject mts_where_genls = kb_indexing.key_gaf_arg_index(collection, ONE_INTEGER, $$genls);
            SubLObject mts = genl_mts.max_mts(mts_where_genls, UNPROVIDED);
            return mts;
        }
    }

    public static SubLObject cb_categorize_isa_guess_mts(final SubLObject collection) {
        final SubLObject mts_where_genls = kb_indexing.key_gaf_arg_index(collection, ONE_INTEGER, $$genls);
        final SubLObject mts = genl_mts.max_mts(mts_where_genls, UNPROVIDED);
        return mts;
    }

    public static final SubLObject cb_categorize_generalization_alt(SubLObject v_term, SubLObject generalization) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_term, FORT_P);
            SubLTrampolineFile.checkType(generalization, FORT_P);
            thread.resetMultipleValues();
            {
                SubLObject generalization_pred = com.cyc.cycjava.cycl.html_create_term.cb_categorize_guess_generalization(generalization);
                SubLObject collection = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != generalization_pred) {
                    {
                        SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                        try {
                            api_control_vars.$use_local_queueP$.bind(NIL, thread);
                            ke.ke_assert(list($$isa, v_term, collection), mt_vars.$default_assert_mt$.getGlobalValue(), $MONOTONIC, $FORWARD);
                            {
                                SubLObject mts = com.cyc.cycjava.cycl.html_create_term.cb_categorize_generalization_guess_mts(generalization, generalization_pred, collection);
                                SubLObject cdolist_list_var = mts;
                                SubLObject mt = NIL;
                                for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                                    ke.ke_assert(list(generalization_pred, v_term, generalization), mt, $MONOTONIC, $FORWARD);
                                }
                            }
                        } finally {
                            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_categorize_generalization(final SubLObject v_term, final SubLObject generalization) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        assert NIL != forts.fort_p(generalization) : "! forts.fort_p(generalization) " + ("forts.fort_p(generalization) " + "CommonSymbols.NIL != forts.fort_p(generalization) ") + generalization;
        thread.resetMultipleValues();
        final SubLObject generalization_pred = cb_categorize_guess_generalization(generalization);
        final SubLObject collection = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != generalization_pred) {
            final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
            try {
                api_control_vars.$use_local_queueP$.bind(NIL, thread);
                ke.ke_assert(list($$isa, v_term, collection), mt_vars.$default_assert_mt$.getGlobalValue(), $MONOTONIC, $FORWARD);
                SubLObject cdolist_list_var;
                final SubLObject mts = cdolist_list_var = cb_categorize_generalization_guess_mts(generalization, generalization_pred, collection);
                SubLObject mt = NIL;
                mt = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    ke.ke_assert(list(generalization_pred, v_term, generalization), mt, $MONOTONIC, $FORWARD);
                    cdolist_list_var = cdolist_list_var.rest();
                    mt = cdolist_list_var.first();
                } 
            } finally {
                api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_categorize_guess_generalization_alt(SubLObject generalization) {
        {
            SubLObject cdolist_list_var = $cb_categorize_generalization_possibilities$.getGlobalValue();
            SubLObject info = NIL;
            for (info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , info = cdolist_list_var.first()) {
                {
                    SubLObject datum = info;
                    SubLObject current = datum;
                    SubLObject pred = NIL;
                    SubLObject col = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt83);
                    pred = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt83);
                    col = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL != isa.isa_in_any_mtP(generalization, col)) {
                            return values(pred, col);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt83);
                    }
                }
            }
        }
        return values(NIL, NIL);
    }

    public static SubLObject cb_categorize_guess_generalization(final SubLObject generalization) {
        SubLObject cdolist_list_var = $cb_categorize_generalization_possibilities$.getGlobalValue();
        SubLObject info = NIL;
        info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = info;
            SubLObject pred = NIL;
            SubLObject col = NIL;
            destructuring_bind_must_consp(current, datum, $list93);
            pred = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list93);
            col = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != isa.isa_in_any_mtP(generalization, col)) {
                    return values(pred, col);
                }
            } else {
                cdestructuring_bind_error(datum, $list93);
            }
            cdolist_list_var = cdolist_list_var.rest();
            info = cdolist_list_var.first();
        } 
        return values(NIL, NIL);
    }

    public static final SubLObject cb_categorize_generalization_guess_mts_alt(SubLObject generalization, SubLObject generalization_pred, SubLObject collection) {
        {
            SubLObject mts_where_generalizations = kb_indexing.key_gaf_arg_index(generalization, ONE_INTEGER, generalization_pred);
            SubLObject mts = genl_mts.max_mts(mts_where_generalizations, UNPROVIDED);
            if (NIL != mts) {
                return mts;
            }
        }
        return isa.max_floor_mts_of_isa_paths(generalization, collection, UNPROVIDED);
    }

    public static SubLObject cb_categorize_generalization_guess_mts(final SubLObject generalization, final SubLObject generalization_pred, final SubLObject collection) {
        final SubLObject mts_where_generalizations = kb_indexing.key_gaf_arg_index(generalization, ONE_INTEGER, generalization_pred);
        final SubLObject mts = genl_mts.max_mts(mts_where_generalizations, UNPROVIDED);
        if (NIL != mts) {
            return mts;
        }
        return isa.max_floor_mts_of_isa_paths(generalization, collection, UNPROVIDED);
    }

    public static final SubLObject cb_copy_from_similar_guts_alt(SubLObject v_term, SubLObject similar_to) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_term, FORT_P);
            SubLTrampolineFile.checkType(similar_to, FORT_P);
            {
                SubLObject fort_spec = cb_fort_identifier(similar_to);
                SubLObject title_var = NIL;
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
                            SubLObject _prev_bind_0_27 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                    html_markup($str_alt7$yui_skin_sam);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_28 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_macros.$within_html_form$.bind(T, thread);
                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                    html_hidden_input($str_alt86$cb_handle_copy_from_similar, fort_spec, UNPROVIDED);
                                                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                    html_markup(ONE_INTEGER);
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    html_princ($str_alt87$Copy_from_);
                                                    cb_form(similar_to, UNPROVIDED, UNPROVIDED);
                                                    html_princ($str_alt88$_to_);
                                                    cb_form(v_term, UNPROVIDED, UNPROVIDED);
                                                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                    html_markup(ONE_INTEGER);
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    cb_help_preamble($CB_COPY_FROM_SIMILAR, UNPROVIDED, UNPROVIDED);
                                                    html_indent(UNPROVIDED);
                                                    html_submit_input($$$Copy_Assertions, UNPROVIDED, UNPROVIDED);
                                                    html_newline(TWO_INTEGER);
                                                    html_hr(UNPROVIDED, UNPROVIDED);
                                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_princ($str_alt90$Check_the_assertions_from_);
                                                    cb_form(similar_to, UNPROVIDED, UNPROVIDED);
                                                    html_princ($str_alt91$_which_you_wish_to_copy__);
                                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    html_hidden_input($str_alt66$similar_to, fort_spec, UNPROVIDED);
                                                    html_hidden_input($$$term, cb_fort_identifier(v_term), UNPROVIDED);
                                                    html_newline(TWO_INTEGER);
                                                    {
                                                        SubLObject _prev_bind_0_30 = $cb_assertion_link_hook$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_31 = $cb_c_gaf_arg_use_binary$.currentBinding(thread);
                                                        try {
                                                            $cb_assertion_link_hook$.bind(CB_COPY_FROM_SIMILAR_CHECKBOX, thread);
                                                            $cb_c_gaf_arg_use_binary$.bind(NIL, thread);
                                                            cb_frames.cb_default_content_internal(similar_to);
                                                        } finally {
                                                            $cb_c_gaf_arg_use_binary$.rebind(_prev_bind_1_31, thread);
                                                            $cb_assertion_link_hook$.rebind(_prev_bind_0_30, thread);
                                                        }
                                                    }
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        }
                                        html_source_readability_terpri(UNPROVIDED);
                                        html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_28, thread);
                                    }
                                }
                                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_27, thread);
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

    public static SubLObject cb_copy_from_similar_guts(final SubLObject v_term, final SubLObject similar_to) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        assert NIL != forts.fort_p(similar_to) : "! forts.fort_p(similar_to) " + ("forts.fort_p(similar_to) " + "CommonSymbols.NIL != forts.fort_p(similar_to) ") + similar_to;
        final SubLObject fort_spec = cb_fort_identifier(similar_to);
        final SubLObject title_var = NIL;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str5$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str6$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$31 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$32 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str11$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
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
                        final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str96$cb_handle_copy_from_similar, fort_spec, UNPROVIDED);
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(ONE_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            html_princ($$$Copy_from_);
                            cb_form(similar_to, UNPROVIDED, UNPROVIDED);
                            html_princ($$$_to_);
                            cb_form(v_term, UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(ONE_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            cb_help_preamble($CB_COPY_FROM_SIMILAR, UNPROVIDED, UNPROVIDED);
                            html_indent(UNPROVIDED);
                            html_submit_input($$$Copy_Assertions, UNPROVIDED, UNPROVIDED);
                            html_newline(TWO_INTEGER);
                            html_hr(UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($$$Check_the_assertions_from_);
                            cb_form(similar_to, UNPROVIDED, UNPROVIDED);
                            html_princ($str101$_which_you_wish_to_copy__);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_hidden_input($str76$similar_to, fort_spec, UNPROVIDED);
                            html_hidden_input($$$term, cb_fort_identifier(v_term), UNPROVIDED);
                            html_newline(TWO_INTEGER);
                            final SubLObject _prev_bind_0_$36 = $cb_assertion_link_hook$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$37 = $cb_c_gaf_arg_use_binary$.currentBinding(thread);
                            try {
                                $cb_assertion_link_hook$.bind(CB_COPY_FROM_SIMILAR_CHECKBOX, thread);
                                $cb_c_gaf_arg_use_binary$.bind(NIL, thread);
                                cb_frames.cb_default_content_internal(similar_to);
                            } finally {
                                $cb_c_gaf_arg_use_binary$.rebind(_prev_bind_1_$37, thread);
                                $cb_assertion_link_hook$.rebind(_prev_bind_0_$36, thread);
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$32, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$31, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject cb_handle_copy_from_similar_alt(SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$copy_from_similar_facilities);
            return NIL;
        }
        {
            SubLObject source_fort_string = html_extract_input($str_alt66$similar_to, args);
            SubLObject new_name = html_extract_input($$$term, args);
            SubLObject source_fort = NIL;
            SubLObject target_fort = NIL;
            if ((!source_fort_string.isString()) || source_fort_string.equal($str_alt18$)) {
                return cb_error($$$No_source_term_was_specified, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            source_fort = cb_guess_fort(source_fort_string, UNPROVIDED);
            if (NIL == forts.fort_p(source_fort)) {
                return cb_error($str_alt95$Unable_to_determine_a_term_from__, source_fort_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if ((!new_name.isString()) || new_name.equal($str_alt18$)) {
                return cb_error($$$No_term_was_specified, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            target_fort = cb_guess_fort(new_name, UNPROVIDED);
            if (NIL == forts.fort_p(target_fort)) {
                return cb_error($str_alt95$Unable_to_determine_a_term_from__, new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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
                                SubLObject assertion = assertion_handles.find_assertion_by_id(id);
                                if (NIL != assertion_handles.assertion_p(assertion)) {
                                    {
                                        SubLObject similar_formula = ke.ke_assertion_edit_formula(assertion);
                                        SubLObject mt = assertions_high.assertion_mt(assertion);
                                        SubLObject strength = assertions_high.assertion_strength(assertion);
                                        SubLObject direction = assertions_high.assertion_direction(assertion);
                                        if (NIL != list_utilities.tree_find(source_fort_el_formula, similar_formula, symbol_function(EQUAL), UNPROVIDED)) {
                                            similar_formula = subst(target_fort_el_formula, source_fort_el_formula, similar_formula, symbol_function(EQUAL), UNPROVIDED);
                                            ke.ke_assert(similar_formula, mt, strength, direction);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return com.cyc.cycjava.cycl.html_create_term.cb_conceptually_related_guts(target_fort);
        }
    }

    public static SubLObject cb_handle_copy_from_similar(final SubLObject args) {
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$copy_from_similar_facilities);
            return NIL;
        }
        final SubLObject source_fort_string = html_extract_input($str76$similar_to, args);
        final SubLObject new_name = html_extract_input($$$term, args);
        SubLObject source_fort = NIL;
        SubLObject target_fort = NIL;
        if ((!source_fort_string.isString()) || source_fort_string.equal($str27$)) {
            return cb_error($$$No_source_term_was_specified, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        source_fort = cb_guess_fort(source_fort_string, UNPROVIDED);
        if (NIL == forts.fort_p(source_fort)) {
            return cb_error($str105$Unable_to_determine_a_term_from__, source_fort_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if ((!new_name.isString()) || new_name.equal($str27$)) {
            return cb_error($$$No_term_was_specified, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        target_fort = cb_guess_fort(new_name, UNPROVIDED);
        if (NIL == forts.fort_p(target_fort)) {
            return cb_error($str105$Unable_to_determine_a_term_from__, new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != constant_p(target_fort)) {
            cb_tools.cb_add_to_constant_history(target_fort);
        } else
            if (NIL != nart_handles.nart_p(target_fort)) {
                cb_tools.cb_add_to_nat_history(target_fort);
            }

        final SubLObject source_fort_el_formula = forts.fort_el_formula(source_fort);
        final SubLObject target_fort_el_formula = forts.fort_el_formula(target_fort);
        SubLObject cdolist_list_var = nthcdr(THREE_INTEGER, args);
        SubLObject copy_spec = NIL;
        copy_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject id = read_from_string_ignoring_errors(copy_spec.first(), NIL, NIL, UNPROVIDED, UNPROVIDED);
            if (id.isInteger()) {
                final SubLObject assertion = assertion_handles.find_assertion_by_id(id);
                if (NIL != assertion_handles.assertion_p(assertion)) {
                    SubLObject similar_formula = ke.ke_assertion_edit_formula(assertion);
                    final SubLObject mt = assertions_high.assertion_mt(assertion);
                    final SubLObject strength = assertions_high.assertion_strength(assertion);
                    final SubLObject direction = assertions_high.assertion_direction(assertion);
                    if (NIL != list_utilities.tree_find(source_fort_el_formula, similar_formula, symbol_function(EQUAL), UNPROVIDED)) {
                        similar_formula = subst(target_fort_el_formula, source_fort_el_formula, similar_formula, symbol_function(EQUAL), UNPROVIDED);
                        ke.ke_assert(similar_formula, mt, strength, direction);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            copy_spec = cdolist_list_var.first();
        } 
        return cb_conceptually_related_guts(target_fort);
    }

    public static final SubLObject cb_copy_from_similar_checkbox_alt(SubLObject assertion) {
        if ((NIL != assertion_handles.assertion_p(assertion)) && (NIL != assertions_high.asserted_assertionP(assertion))) {
            {
                SubLObject id = assertion_handles.assertion_id(assertion);
                html_checkbox_input(id, T, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject cb_copy_from_similar_checkbox(final SubLObject assertion) {
        if ((NIL != assertion_handles.assertion_p(assertion)) && (NIL != assertions_high.asserted_assertionP(assertion))) {
            final SubLObject id = assertion_handles.assertion_id(assertion);
            html_checkbox_input(id, T, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject cb_suggested_conceptually_related_alt(SubLObject v_term) {
        {
            SubLObject v_answer = NIL;
            v_answer = cr_search_tool.cr_suggest_related_terms(v_term);
            return v_answer;
        }
    }

    public static SubLObject cb_suggested_conceptually_related(final SubLObject v_term) {
        final SubLObject v_answer = NIL;
        return v_answer;
    }

    public static final SubLObject cb_conceptually_related_guts_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != v_term) {
                SubLTrampolineFile.checkType(v_term, FORT_P);
                com.cyc.cycjava.cycl.html_create_term.ct_cr_setup();
                {
                    SubLObject suggestions = com.cyc.cycjava.cycl.html_create_term.cb_suggested_conceptually_related(v_term);
                    SubLObject existing_terms = NIL;
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            existing_terms = removal_modules_conceptually_related.all_conceptually_related(v_term, UNPROVIDED);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                    suggestions = set_difference(suggestions, existing_terms, UNPROVIDED, UNPROVIDED);
                    {
                        SubLObject title_var = $$$Conceptually_Related_Suggestions;
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
                                            html_markup($str_alt7$yui_skin_sam);
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
                                                            html_hidden_input($str_alt101$cb_conceptually_related_terms, T, UNPROVIDED);
                                                            html_hidden_input($$$fort, cb_fort_identifier(v_term), UNPROVIDED);
                                                            cb_help_preamble($CB_CONCEPTUALLY_RELATED_TERMS, NIL, UNPROVIDED);
                                                            cb_back_button($SELF, UNPROVIDED);
                                                            html_reset_input($$$Clear_All);
                                                            html_newline(TWO_INTEGER);
                                                            html_markup(html_macros.$html_big_head$.getGlobalValue());
                                                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                            html_princ($str_alt104$Term___);
                                                            cb_form(v_term, UNPROVIDED, UNPROVIDED);
                                                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                            html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                                            html_newline(UNPROVIDED);
                                                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                            html_princ($str_alt105$Existing_Conceptually_Related_Ter);
                                                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                            if (NIL != existing_terms) {
                                                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                                cb_link($CT_CR_JUSTIFY, v_term, $str_alt107$_Justify_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                                html_newline(TWO_INTEGER);
                                                                {
                                                                    SubLObject cdolist_list_var = existing_terms;
                                                                    SubLObject existing_term = NIL;
                                                                    for (existing_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , existing_term = cdolist_list_var.first()) {
                                                                        cb_form(existing_term, UNPROVIDED, UNPROVIDED);
                                                                        html_indent(TWO_INTEGER);
                                                                    }
                                                                }
                                                            } else {
                                                                html_princ($$$None);
                                                            }
                                                            html_hr(UNPROVIDED, UNPROVIDED);
                                                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                            html_princ($str_alt109$Specify_the_Microtheory_for_new__);
                                                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                            html_newline(UNPROVIDED);
                                                            html_complete.html_complete_button($$$mt, $$$Complete, $$Microtheory, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                            html_princ($str_alt110$_Mt___);
                                                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                            html_text_input($$$mt, string_utilities.str(mt_vars.$default_ask_mt$.getGlobalValue()), $int$40);
                                                            html_br();
                                                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                            html_princ($str_alt111$_Select_terms_and_or_type_in_a_te);
                                                            cb_form(v_term, UNPROVIDED, UNPROVIDED);
                                                            html_princ($str_alt112$__);
                                                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                            html_newline(UNPROVIDED);
                                                            html_complete.html_complete_button($$$entered, $$$Complete, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                            html_princ($str_alt114$_Term___);
                                                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                            html_text_input($$$entered, NIL, $int$40);
                                                            html_newline(UNPROVIDED);
                                                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                            html_princ($str_alt115$Possible_Terms_to_Add___);
                                                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                            html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                            html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
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
                                                                SubLObject _prev_bind_0_35 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    while (NIL != suggestions) {
                                                                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_36 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                suggestions = com.cyc.cycjava.cycl.html_create_term.ct_cr_search_show_next_suggestion(suggestions);
                                                                                suggestions = com.cyc.cycjava.cycl.html_create_term.ct_cr_search_show_next_suggestion(suggestions);
                                                                                suggestions = com.cyc.cycjava.cycl.html_create_term.ct_cr_search_show_next_suggestion(suggestions);
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_36, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                        html_source_readability_terpri(UNPROVIDED);
                                                                    } 
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_35, thread);
                                                                }
                                                            }
                                                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                                            html_newline(UNPROVIDED);
                                                            html_submit_input($$$Add_Terms_Backward, $str_alt117$add_backward, UNPROVIDED);
                                                            html_princ($str_alt118$_as_);
                                                            cb_form(list($$conceptuallyRelated, TERM, v_term), UNPROVIDED, UNPROVIDED);
                                                            html_princ($str_alt121$_in_MT);
                                                            html_newline(UNPROVIDED);
                                                            html_submit_input($$$Add_Terms_Forward, $str_alt123$add_forward, UNPROVIDED);
                                                            html_princ($str_alt118$_as_);
                                                            cb_form(listS($$conceptuallyRelated, v_term, $list_alt124), UNPROVIDED, UNPROVIDED);
                                                            html_princ($str_alt121$_in_MT);
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
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_conceptually_related_guts(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != v_term) {
            assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
            ct_cr_setup();
            SubLObject suggestions = cb_suggested_conceptually_related(v_term);
            SubLObject existing_terms = NIL;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                existing_terms = removal_modules_conceptually_related.all_conceptually_related(v_term, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            suggestions = set_difference(suggestions, existing_terms, UNPROVIDED, UNPROVIDED);
            final SubLObject title_var = $$$Conceptually_Related_Suggestions;
            final SubLObject _prev_bind_3 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                html_markup($str5$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup($str6$_meta_http_equiv__X_UA_Compatible);
                }
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$38 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                    final SubLObject _prev_bind_0_$39 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                        html_markup($str11$yui_skin_sam);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reloadFrameButton);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
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
                            final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = html_macros.$within_html_form$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_macros.$within_html_form$.bind(T, thread);
                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                html_hidden_input($str111$cb_conceptually_related_terms, T, UNPROVIDED);
                                html_hidden_input($$$fort, cb_fort_identifier(v_term), UNPROVIDED);
                                cb_help_preamble($CB_CONCEPTUALLY_RELATED_TERMS, NIL, UNPROVIDED);
                                cb_back_button($SELF, UNPROVIDED);
                                html_reset_input($$$Clear_All);
                                html_newline(TWO_INTEGER);
                                html_markup(html_macros.$html_big_head$.getGlobalValue());
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_princ($str114$Term___);
                                cb_form(v_term, UNPROVIDED, UNPROVIDED);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                html_newline(UNPROVIDED);
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_princ($str115$Existing_Conceptually_Related_Ter);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                if (NIL != existing_terms) {
                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    cb_link($CT_CR_JUSTIFY, v_term, $str117$_Justify_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    html_newline(TWO_INTEGER);
                                    SubLObject cdolist_list_var = existing_terms;
                                    SubLObject existing_term = NIL;
                                    existing_term = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        cb_form(existing_term, UNPROVIDED, UNPROVIDED);
                                        html_indent(TWO_INTEGER);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        existing_term = cdolist_list_var.first();
                                    } 
                                } else {
                                    html_princ($$$None);
                                }
                                html_hr(UNPROVIDED, UNPROVIDED);
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_princ($str119$Specify_the_Microtheory_for_new__);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_newline(UNPROVIDED);
                                html_complete.html_complete_button($$$mt, $$$Complete, $$Microtheory, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_princ($str120$_Mt___);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_text_input($$$mt, string_utilities.str(mt_vars.$default_ask_mt$.getGlobalValue()), $int$40);
                                html_br();
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_princ($str121$_Select_terms_and_or_type_in_a_te);
                                cb_form(v_term, UNPROVIDED, UNPROVIDED);
                                html_princ($str122$__);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_newline(UNPROVIDED);
                                html_complete.html_complete_button($$$entered, $$$Complete, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_princ($str124$_Term___);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_text_input($$$entered, NIL, $int$40);
                                html_newline(UNPROVIDED);
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_princ($str125$Possible_Terms_to_Add___);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
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
                                final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    while (NIL != suggestions) {
                                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            suggestions = ct_cr_search_show_next_suggestion(suggestions);
                                            suggestions = ct_cr_search_show_next_suggestion(suggestions);
                                            suggestions = ct_cr_search_show_next_suggestion(suggestions);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$44, thread);
                                        }
                                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_source_readability_terpri(UNPROVIDED);
                                    } 
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$43, thread);
                                }
                                html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                html_newline(UNPROVIDED);
                                html_submit_input($$$Add_Terms_Backward, $str127$add_backward, UNPROVIDED);
                                html_princ($$$_as_);
                                cb_form(list($$conceptuallyRelated, TERM, v_term), UNPROVIDED, UNPROVIDED);
                                html_princ($$$_in_MT);
                                html_newline(UNPROVIDED);
                                html_submit_input($$$Add_Terms_Forward, $str133$add_forward, UNPROVIDED);
                                html_princ($$$_as_);
                                cb_form(listS($$conceptuallyRelated, v_term, $list134), UNPROVIDED, UNPROVIDED);
                                html_princ($$$_in_MT);
                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                            } finally {
                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_5, thread);
                                html_macros.$within_html_form$.rebind(_prev_bind_4, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
                            }
                            html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_copyright_notice();
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$40, thread);
                        }
                        html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$39, thread);
                    }
                    html_markup(html_macros.$html_html_tail$.getGlobalValue());
                } finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$38, thread);
                }
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_3, thread);
            }
        }
        return NIL;
    }

    public static final SubLObject ct_cr_search_show_next_suggestion_alt(SubLObject suggestions) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != suggestions) {
                {
                    SubLObject suggestion = suggestions.first();
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            com.cyc.cycjava.cycl.html_create_term.ct_cr_search_show_suggestion(suggestion);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_indent(TWO_INTEGER);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                return suggestions.rest();
            }
            return NIL;
        }
    }

    public static SubLObject ct_cr_search_show_next_suggestion(final SubLObject suggestions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != suggestions) {
            final SubLObject suggestion = suggestions.first();
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                ct_cr_search_show_suggestion(suggestion);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_indent(TWO_INTEGER);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            return suggestions.rest();
        }
        return NIL;
    }

    public static final SubLObject cb_conceptually_related_terms_alt(SubLObject args) {
        {
            SubLObject fort_string = html_extract_input($$$fort, args);
            SubLObject fort = cb_guess_fort(fort_string, UNPROVIDED);
            SubLObject mt_string = html_extract_input($$$mt, args);
            SubLObject mt = cb_guess_fort(mt_string, UNPROVIDED);
            if (NIL == forts.fort_p(fort)) {
                return cb_error($str_alt125$Unable_to_determine_last_term__wh, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL == forts.fort_p(mt)) {
                return cb_error($str_alt126$Invalid_Mt_specified____S, mt_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            {
                SubLObject v_forward = html_extract_input($str_alt123$add_forward, args);
                SubLObject suggestions = com.cyc.cycjava.cycl.html_create_term.ct_cr_extract_suggestions(args);
                SubLObject direction = (NIL != v_forward) ? ((SubLObject) ($FORWARD)) : $BACKWARD;
                return com.cyc.cycjava.cycl.html_create_term.ct_cr_assertion_suggestions(fort, suggestions, mt, direction);
            }
        }
    }

    public static SubLObject cb_conceptually_related_terms(final SubLObject args) {
        final SubLObject fort_string = html_extract_input($$$fort, args);
        final SubLObject fort = cb_guess_fort(fort_string, UNPROVIDED);
        final SubLObject mt_string = html_extract_input($$$mt, args);
        final SubLObject mt = cb_guess_fort(mt_string, UNPROVIDED);
        if (NIL == forts.fort_p(fort)) {
            return cb_error($str135$Unable_to_determine_last_term__wh, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL == forts.fort_p(mt)) {
            return cb_error($str136$Invalid_Mt_specified____S, mt_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject v_forward = html_extract_input($str133$add_forward, args);
        final SubLObject suggestions = ct_cr_extract_suggestions(args);
        final SubLObject direction = (NIL != v_forward) ? $FORWARD : $BACKWARD;
        return ct_cr_assertion_suggestions(fort, suggestions, mt, direction);
    }

    public static final SubLObject ct_cr_extract_suggestions_alt(SubLObject args) {
        {
            SubLObject entered_string = html_extract_input($$$entered, args);
            SubLObject entered = NIL;
            SubLObject suggestions = NIL;
            if (NIL == entered_string) {
            } else {
                if (length(entered_string).numE(ZERO_INTEGER)) {
                } else {
                    entered = cb_guess_constant(entered_string);
                    if (NIL == forts.fort_p(entered)) {
                        return cb_error($str_alt95$Unable_to_determine_a_term_from__, entered_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    suggestions = cons(entered, suggestions);
                }
            }
            {
                SubLObject cdolist_list_var = args;
                SubLObject arg = NIL;
                for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                    if (arg.isCons()) {
                        if (arg.first().equal($$$id)) {
                            {
                                SubLObject suggestion = cb_guess_fort(second(arg), UNPROVIDED);
                                if (NIL != forts.fort_p(suggestion)) {
                                    {
                                        SubLObject item_var = suggestion;
                                        if (NIL == member(item_var, suggestions, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            suggestions = cons(item_var, suggestions);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            suggestions = nreverse(suggestions);
            return suggestions;
        }
    }

    public static SubLObject ct_cr_extract_suggestions(final SubLObject args) {
        final SubLObject entered_string = html_extract_input($$$entered, args);
        SubLObject entered = NIL;
        SubLObject suggestions = NIL;
        if (NIL != entered_string) {
            if (!length(entered_string).numE(ZERO_INTEGER)) {
                entered = cb_guess_constant(entered_string);
                if (NIL == forts.fort_p(entered)) {
                    return cb_error($str105$Unable_to_determine_a_term_from__, entered_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                suggestions = cons(entered, suggestions);
            }
        }
        SubLObject cdolist_list_var = args;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (arg.isCons() && arg.first().equal($$$id)) {
                final SubLObject suggestion = cb_guess_fort(second(arg), UNPROVIDED);
                if (NIL != forts.fort_p(suggestion)) {
                    final SubLObject item_var = suggestion;
                    if (NIL == member(item_var, suggestions, symbol_function(EQL), symbol_function(IDENTITY))) {
                        suggestions = cons(item_var, suggestions);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        suggestions = nreverse(suggestions);
        return suggestions;
    }

    public static final SubLObject ct_cr_assertion_suggestions_alt(SubLObject fort, SubLObject suggestions, SubLObject mt, SubLObject direction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject formulas = NIL;
                {
                    SubLObject cdolist_list_var = suggestions;
                    SubLObject suggestion = NIL;
                    for (suggestion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , suggestion = cdolist_list_var.first()) {
                        {
                            SubLObject formula = NIL;
                            SubLObject pcase_var = direction;
                            if (pcase_var.eql($FORWARD)) {
                                formula = list($$conceptuallyRelated, fort, suggestion);
                            } else {
                                if (pcase_var.eql($BACKWARD)) {
                                    formula = list($$conceptuallyRelated, suggestion, fort);
                                }
                            }
                            if (NIL != formula) {
                                formulas = cons(formula, formulas);
                                ke.ke_assert(formula, mt, UNPROVIDED, UNPROVIDED);
                            }
                        }
                    }
                }
                formulas = nreverse(formulas);
                {
                    SubLObject title_var = $$$Formulas_Asserted;
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
                                SubLObject _prev_bind_0_37 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                        html_markup($str_alt7$yui_skin_sam);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_38 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_39 = html_macros.$html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_macros.$within_html_form$.bind(T, thread);
                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                    cb_back_button(UNPROVIDED, UNPROVIDED);
                                                    html_newline(TWO_INTEGER);
                                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_princ($str_alt104$Term___);
                                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    cb_form(fort, UNPROVIDED, UNPROVIDED);
                                                    html_newline(TWO_INTEGER);
                                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_princ($str_alt131$Formulas_Asserted__);
                                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    if (NIL != formulas) {
                                                        {
                                                            SubLObject cdolist_list_var = formulas;
                                                            SubLObject formula = NIL;
                                                            for (formula = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , formula = cdolist_list_var.first()) {
                                                                html_newline(UNPROVIDED);
                                                                cb_form(formula, UNPROVIDED, UNPROVIDED);
                                                                html_princ($str_alt132$_in_);
                                                                cb_form(mt, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        }
                                                    } else {
                                                        html_princ($$$None);
                                                    }
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_39, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                            html_source_readability_terpri(UNPROVIDED);
                                            html_copyright_notice();
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_38, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_37, thread);
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

    public static SubLObject ct_cr_assertion_suggestions(final SubLObject fort, final SubLObject suggestions, final SubLObject mt, final SubLObject direction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject formulas = NIL;
        SubLObject cdolist_list_var = suggestions;
        SubLObject suggestion = NIL;
        suggestion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject formula = NIL;
            if (direction.eql($FORWARD)) {
                formula = list($$conceptuallyRelated, fort, suggestion);
            } else
                if (direction.eql($BACKWARD)) {
                    formula = list($$conceptuallyRelated, suggestion, fort);
                }

            if (NIL != formula) {
                formulas = cons(formula, formulas);
                ke.ke_assert(formula, mt, UNPROVIDED, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            suggestion = cdolist_list_var.first();
        } 
        formulas = nreverse(formulas);
        final SubLObject title_var = $$$Formulas_Asserted;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str5$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str6$_meta_http_equiv__X_UA_Compatible);
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
                    html_markup($str11$yui_skin_sam);
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
                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_back_button(UNPROVIDED, UNPROVIDED);
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str114$Term___);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            cb_form(fort, UNPROVIDED, UNPROVIDED);
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str141$Formulas_Asserted__);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            if (NIL != formulas) {
                                SubLObject cdolist_list_var2 = formulas;
                                SubLObject formula2 = NIL;
                                formula2 = cdolist_list_var2.first();
                                while (NIL != cdolist_list_var2) {
                                    html_newline(UNPROVIDED);
                                    cb_form(formula2, UNPROVIDED, UNPROVIDED);
                                    html_princ($$$_in_);
                                    cb_form(mt, UNPROVIDED, UNPROVIDED);
                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    formula2 = cdolist_list_var2.first();
                                } 
                            } else {
                                html_princ($$$None);
                            }
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
        return NIL;
    }

    public static final SubLObject ct_cr_justify_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject fort = cb_guess_fort(args, UNPROVIDED);
                if (NIL == forts.fort_p(fort)) {
                    return cb_error($str_alt125$Unable_to_determine_last_term__wh, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (NIL == fboundp($sym133$WHY_CONCEPTUALLY_RELATED_)) {
                    return cb_error($str_alt134$Sorry__System_74_92_or_later_is_r, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                {
                    SubLObject title_var = $$$Justify_Conceptually_Related;
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
                                SubLObject _prev_bind_0_40 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                        html_markup($str_alt7$yui_skin_sam);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_41 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_42 = html_macros.$html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_macros.$within_html_form$.bind(T, thread);
                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                    cb_back_button(UNPROVIDED, UNPROVIDED);
                                                    html_indent(UNPROVIDED);
                                                    html_newline(TWO_INTEGER);
                                                    html_markup(html_macros.$html_big_head$.getGlobalValue());
                                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_princ($str_alt104$Term___);
                                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    cb_form(fort, UNPROVIDED, UNPROVIDED);
                                                    html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                                    html_newline(TWO_INTEGER);
                                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_princ($str_alt105$Existing_Conceptually_Related_Ter);
                                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    {
                                                        SubLObject _prev_bind_0_43 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_44 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                        try {
                                                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                                            {
                                                                SubLObject existing = removal_modules_conceptually_related.all_conceptually_related(fort, UNPROVIDED);
                                                                html_markup(html_macros.$html_definition_list_head$.getGlobalValue());
                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_45 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        {
                                                                            SubLObject cdolist_list_var = existing;
                                                                            SubLObject related = NIL;
                                                                            for (related = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , related = cdolist_list_var.first()) {
                                                                                {
                                                                                    SubLObject supports = removal_modules_conceptually_related.why_conceptually_relatedP(fort, related, UNPROVIDED);
                                                                                    html_markup(html_macros.$html_definition_list_term_head$.getGlobalValue());
                                                                                    cb_form(related, UNPROVIDED, UNPROVIDED);
                                                                                    html_markup(html_macros.$html_definition_list_term_tail$.getGlobalValue());
                                                                                    html_markup(html_macros.$html_definition_list_def_head$.getGlobalValue());
                                                                                    {
                                                                                        SubLObject cdolist_list_var_46 = supports;
                                                                                        SubLObject support = NIL;
                                                                                        for (support = cdolist_list_var_46.first(); NIL != cdolist_list_var_46; cdolist_list_var_46 = cdolist_list_var_46.rest() , support = cdolist_list_var_46.first()) {
                                                                                            cb_assertion_browser.cb_show_support(support, UNPROVIDED);
                                                                                            html_newline(UNPROVIDED);
                                                                                        }
                                                                                    }
                                                                                    html_newline(UNPROVIDED);
                                                                                    html_markup(html_macros.$html_definition_list_def_tail$.getGlobalValue());
                                                                                }
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_45, thread);
                                                                    }
                                                                }
                                                                html_markup(html_macros.$html_definition_list_tail$.getGlobalValue());
                                                            }
                                                        } finally {
                                                            mt_relevance_macros.$mt$.rebind(_prev_bind_1_44, thread);
                                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_43, thread);
                                                        }
                                                    }
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_42, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                            html_source_readability_terpri(UNPROVIDED);
                                            html_copyright_notice();
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_41, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_40, thread);
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

    public static SubLObject ct_cr_justify(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fort = cb_guess_fort(args, UNPROVIDED);
        if (NIL == forts.fort_p(fort)) {
            return cb_error($str135$Unable_to_determine_last_term__wh, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL == fboundp($sym143$WHY_CONCEPTUALLY_RELATED_)) {
            return cb_error($str144$Sorry__System_74_92_or_later_is_r, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject title_var = $$$Justify_Conceptually_Related;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str5$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str6$_meta_http_equiv__X_UA_Compatible);
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
                    html_markup($str11$yui_skin_sam);
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
                            cb_back_button(UNPROVIDED, UNPROVIDED);
                            html_indent(UNPROVIDED);
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_big_head$.getGlobalValue());
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str114$Term___);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            cb_form(fort, UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_big_tail$.getGlobalValue());
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str115$Existing_Conceptually_Related_Ter);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            final SubLObject _prev_bind_0_$55 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$56 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                final SubLObject existing = removal_modules_conceptually_related.all_conceptually_related(fort, UNPROVIDED);
                                html_markup(html_macros.$html_definition_list_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$56 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    SubLObject cdolist_list_var = existing;
                                    SubLObject related = NIL;
                                    related = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        final SubLObject supports = removal_modules_conceptually_related.why_conceptually_relatedP(fort, related, UNPROVIDED);
                                        html_markup(html_macros.$html_definition_list_term_head$.getGlobalValue());
                                        cb_form(related, UNPROVIDED, UNPROVIDED);
                                        html_markup(html_macros.$html_definition_list_term_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_definition_list_def_head$.getGlobalValue());
                                        SubLObject cdolist_list_var_$58 = supports;
                                        SubLObject support = NIL;
                                        support = cdolist_list_var_$58.first();
                                        while (NIL != cdolist_list_var_$58) {
                                            cb_assertion_browser.cb_show_support(support, UNPROVIDED);
                                            html_newline(UNPROVIDED);
                                            cdolist_list_var_$58 = cdolist_list_var_$58.rest();
                                            support = cdolist_list_var_$58.first();
                                        } 
                                        html_newline(UNPROVIDED);
                                        html_markup(html_macros.$html_definition_list_def_tail$.getGlobalValue());
                                        cdolist_list_var = cdolist_list_var.rest();
                                        related = cdolist_list_var.first();
                                    } 
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$56, thread);
                                }
                                html_markup(html_macros.$html_definition_list_tail$.getGlobalValue());
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$56, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$55, thread);
                            }
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

    public static final SubLObject cb_link_ct_cr_justify_alt(SubLObject fort, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(fort, FORT_P);
            if (NIL == linktext) {
                html_princ($str_alt107$_Justify_);
            }
            {
                SubLObject frame_name_var = cb_frame_name($MAIN);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt137$ct_cr_justify__a, cb_fort_identifier(fort));
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

    public static SubLObject cb_link_ct_cr_justify(final SubLObject fort, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(fort) : "! forts.fort_p(fort) " + ("forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) ") + fort;
        if (NIL == linktext) {
            html_princ($str117$_Justify_);
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str147$ct_cr_justify__a, cb_fort_identifier(fort));
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

    public static final SubLObject ct_cr_search_show_suggestion_alt(SubLObject suggestion) {
        html_checkbox_input($$$id, cb_fort_identifier(suggestion), NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_indent(UNPROVIDED);
        cb_form(suggestion, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject ct_cr_search_show_suggestion(final SubLObject suggestion) {
        html_checkbox_input($$$id, cb_fort_identifier(suggestion), NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_indent(UNPROVIDED);
        cb_form(suggestion, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject ct_cr_setup_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != cr_search_tool.$cr_setup_in_progress$.getDynamicValue(thread)) || (NIL != cr_search_tool.$cr_irrelevant_term_table$.getGlobalValue()))) {
                cr_search_tool.$cr_setup_in_progress$.setDynamicValue(T, thread);
                com.cyc.cycjava.cycl.html_create_term.ct_cr_initialize_irrelevant_term_table();
                cr_search_tool.$cr_setup_in_progress$.setDynamicValue(NIL, thread);
            }
            return NIL;
        }
    }

    public static SubLObject ct_cr_setup() {
        return NIL;
    }

    public static final SubLObject ct_cr_initialize_irrelevant_term_table_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cr_search_tool.$cr_irrelevant_term_table$.setGlobalValue(make_hash_table(integerDivide(constant_count(), TWO_INTEGER), UNPROVIDED, UNPROVIDED));
            {
                SubLObject cdolist_list_var = cr_search_tool.$cr_irrelevant_terms$.getDynamicValue(thread);
                SubLObject v_term = NIL;
                for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                    cr_search_tool.cr_note_irrelevant_term(v_term);
                }
            }
            {
                SubLObject cdolist_list_var = cr_search_tool.$cr_irrelevant_term_classes$.getDynamicValue(thread);
                SubLObject collection = NIL;
                for (collection = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collection = cdolist_list_var.first()) {
                    cr_search_tool.cr_note_irrelevant_term_class(collection);
                }
            }
            {
                SubLObject cdolist_list_var = cr_search_tool.$cr_irrelevant_nat_functions$.getDynamicValue(thread);
                SubLObject function = NIL;
                for (function = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , function = cdolist_list_var.first()) {
                    cr_search_tool.cr_note_irrelevant_nat_function(function);
                }
            }
            {
                SubLObject cdolist_list_var = cr_search_tool.$cr_irrelevant_name_prefixes$.getDynamicValue(thread);
                SubLObject prefix = NIL;
                for (prefix = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , prefix = cdolist_list_var.first()) {
                    cr_search_tool.cr_note_irrelevant_name_prefix(prefix);
                }
            }
            return NIL;
        }
    }

    public static SubLObject ct_cr_initialize_irrelevant_term_table() {
        return NIL;
    }

    public static final SubLObject cb_elaborate_term_alt(SubLObject args) {
        {
            SubLObject fort_spec = args.first();
            SubLObject fort = cb_guess_fort(args.first(), UNPROVIDED);
            if (NIL == forts.fort_p(fort)) {
                cb_error($str_alt47$_a_does_not_specify_a_Cyc_term, fort_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return NIL;
            }
            return com.cyc.cycjava.cycl.html_create_term.cb_elaborate_term_guts(fort);
        }
    }

    public static SubLObject cb_elaborate_term(final SubLObject args) {
        final SubLObject fort_spec = args.first();
        final SubLObject fort = cb_guess_fort(args.first(), UNPROVIDED);
        if (NIL == forts.fort_p(fort)) {
            cb_error($str57$_a_does_not_specify_a_Cyc_term, fort_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        return cb_elaborate_term_guts(fort);
    }

    public static final SubLObject cb_link_elaborate_term_alt(SubLObject v_term, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $$$Elaborate_Term;
            }
            {
                SubLObject frame_name_var = cb_frame_name($MAIN);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt141$cb_elaborate_term__a, cb_fort_identifier(v_term));
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

    public static SubLObject cb_link_elaborate_term(final SubLObject v_term, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$Elaborate_Term;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str151$cb_elaborate_term__a, cb_fort_identifier(v_term));
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

    public static final SubLObject cb_elaborate_term_guts_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_term, FORT_P);
            {
                SubLObject title_var = $$$Elaborate_Term;
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
                                    html_markup($str_alt7$yui_skin_sam);
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
                                                SubLObject _prev_bind_0_49 = html_macros.$html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_macros.$within_html_form$.bind(T, thread);
                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                    html_hidden_input($str_alt146$cb_handle_elaborate_term, T, UNPROVIDED);
                                                    cb_help_preamble($CB_ELABORATE_TERM, NIL, UNPROVIDED);
                                                    cb_back_button($SELF, UNPROVIDED);
                                                    html_indent(UNPROVIDED);
                                                    html_reset_input($$$Clear);
                                                    html_indent(UNPROVIDED);
                                                    html_submit_input($$$Elaborate, UNPROVIDED, UNPROVIDED);
                                                    html_newline(TWO_INTEGER);
                                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_princ($str_alt148$Elaborate_);
                                                    cb_form(v_term, UNPROVIDED, UNPROVIDED);
                                                    html_princ($str_alt60$_);
                                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    {
                                                        SubLObject requirements = com.cyc.cycjava.cycl.html_create_term.ke_requirements(v_term);
                                                        SubLObject suggestions = com.cyc.cycjava.cycl.html_create_term.ke_suggestions(v_term);
                                                        if (NIL != requirements) {
                                                            html_newline(TWO_INTEGER);
                                                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                            html_princ($str_alt149$Requirements___);
                                                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                            {
                                                                SubLObject cdolist_list_var = requirements;
                                                                SubLObject requirement = NIL;
                                                                for (requirement = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , requirement = cdolist_list_var.first()) {
                                                                    html_newline(UNPROVIDED);
                                                                    com.cyc.cycjava.cycl.html_create_term.cb_elaborate_requirement(v_term, requirement);
                                                                }
                                                            }
                                                        }
                                                        if (NIL != suggestions) {
                                                            html_newline(TWO_INTEGER);
                                                            html_princ($str_alt150$Suggestions___);
                                                            {
                                                                SubLObject cdolist_list_var = suggestions;
                                                                SubLObject suggestion = NIL;
                                                                for (suggestion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , suggestion = cdolist_list_var.first()) {
                                                                    html_newline(UNPROVIDED);
                                                                    com.cyc.cycjava.cycl.html_create_term.cb_elaborate_suggestion(v_term, suggestion);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_49, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        }
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

    public static SubLObject cb_elaborate_term_guts(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        final SubLObject title_var = $$$Elaborate_Term;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str5$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str6$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$59 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$60 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str11$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$61 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$62 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$62, thread);
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
                        final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str156$cb_handle_elaborate_term, T, UNPROVIDED);
                            cb_help_preamble($CB_ELABORATE_TERM, NIL, UNPROVIDED);
                            cb_back_button($SELF, UNPROVIDED);
                            html_indent(UNPROVIDED);
                            html_reset_input($$$Clear);
                            html_indent(UNPROVIDED);
                            html_submit_input($$$Elaborate, UNPROVIDED, UNPROVIDED);
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($$$Elaborate_);
                            cb_form(v_term, UNPROVIDED, UNPROVIDED);
                            html_princ($str70$_);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            final SubLObject requirements = ke_requirements(v_term);
                            final SubLObject suggestions = ke_suggestions(v_term);
                            if (NIL != requirements) {
                                html_newline(TWO_INTEGER);
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_princ($str159$Requirements___);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                SubLObject cdolist_list_var = requirements;
                                SubLObject requirement = NIL;
                                requirement = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    html_newline(UNPROVIDED);
                                    cb_elaborate_requirement(v_term, requirement);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    requirement = cdolist_list_var.first();
                                } 
                            }
                            if (NIL != suggestions) {
                                html_newline(TWO_INTEGER);
                                html_princ($str160$Suggestions___);
                                SubLObject cdolist_list_var = suggestions;
                                SubLObject suggestion = NIL;
                                suggestion = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    html_newline(UNPROVIDED);
                                    cb_elaborate_suggestion(v_term, suggestion);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    suggestion = cdolist_list_var.first();
                                } 
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$63, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$61, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$60, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$59, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject ke_requirements_alt(SubLObject v_term) {
        {
            SubLObject formula = subst(v_term, $TERM, $ke_requirements_query$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
            SubLObject v_bindings = fi.fi_ask_int(formula, $$InferencePSC, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != v_bindings) {
                {
                    SubLObject v_true = NIL;
                    SubLObject unknown = NIL;
                    SubLObject cdolist_list_var = v_bindings;
                    SubLObject binding = NIL;
                    for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                        {
                            SubLObject requirement = bindings.variable_binding_value(binding.first());
                            if (NIL != fi.fi_ask_int(requirement, $$InferencePSC, NIL, ONE_INTEGER, UNPROVIDED, UNPROVIDED)) {
                                v_true = cons(requirement, v_true);
                            } else {
                                unknown = cons(requirement, unknown);
                            }
                        }
                    }
                    v_true = nreverse(v_true);
                    unknown = nreverse(unknown);
                    return values(unknown, v_true);
                }
            }
            return values(NIL, NIL);
        }
    }

    public static SubLObject ke_requirements(final SubLObject v_term) {
        final SubLObject formula = subst(v_term, $TERM, $ke_requirements_query$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
        final SubLObject v_bindings = fi.fi_ask_int(formula, $$InferencePSC, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != v_bindings) {
            SubLObject v_true = NIL;
            SubLObject unknown = NIL;
            SubLObject cdolist_list_var = v_bindings;
            SubLObject binding = NIL;
            binding = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject requirement = bindings.variable_binding_value(binding.first());
                if (NIL != fi.fi_ask_int(requirement, $$InferencePSC, NIL, ONE_INTEGER, UNPROVIDED, UNPROVIDED)) {
                    v_true = cons(requirement, v_true);
                } else {
                    unknown = cons(requirement, unknown);
                }
                cdolist_list_var = cdolist_list_var.rest();
                binding = cdolist_list_var.first();
            } 
            v_true = nreverse(v_true);
            unknown = nreverse(unknown);
            return values(unknown, v_true);
        }
        return values(NIL, NIL);
    }

    public static final SubLObject cb_elaborate_requirement_alt(SubLObject v_term, SubLObject requirement) {
        cb_form(requirement, ZERO_INTEGER, T);
        return NIL;
    }

    public static SubLObject cb_elaborate_requirement(final SubLObject v_term, final SubLObject requirement) {
        cb_form(requirement, ZERO_INTEGER, T);
        return NIL;
    }

    public static final SubLObject ke_suggestions_alt(SubLObject v_term) {
        return NIL;
    }

    public static SubLObject ke_suggestions(final SubLObject v_term) {
        return NIL;
    }

    public static final SubLObject cb_elaborate_suggestion_alt(SubLObject v_term, SubLObject suggestion) {
        return NIL;
    }

    public static SubLObject cb_elaborate_suggestion(final SubLObject v_term, final SubLObject suggestion) {
        return NIL;
    }

    public static SubLObject declare_html_create_term_file() {
        declareFunction("cb_create_term", "CB-CREATE-TERM", 0, 1, false);
        declareFunction("cb_handle_create_term", "CB-HANDLE-CREATE-TERM", 1, 0, false);
        declareFunction("cb_link_create_term", "CB-LINK-CREATE-TERM", 0, 1, false);
        declareFunction("cb_create_term_hook", "CB-CREATE-TERM-HOOK", 1, 2, false);
        declareFunction("cb_extract_lines", "CB-EXTRACT-LINES", 1, 0, false);
        declareFunction("cb_extract_lines_recursive", "CB-EXTRACT-LINES-RECURSIVE", 1, 1, false);
        declareFunction("cr_or_lf", "CR-OR-LF", 1, 0, false);
        declareFunction("cb_categorize_term", "CB-CATEGORIZE-TERM", 1, 0, false);
        declareFunction("cb_link_categorize_term", "CB-LINK-CATEGORIZE-TERM", 1, 1, false);
        declareFunction("cb_categorize_term_guts", "CB-CATEGORIZE-TERM-GUTS", 1, 0, false);
        declareFunction("cb_handle_categorize_term", "CB-HANDLE-CATEGORIZE-TERM", 1, 0, false);
        declareFunction("cb_categorize_similar", "CB-CATEGORIZE-SIMILAR", 2, 0, false);
        declareFunction("cb_categorize_isa", "CB-CATEGORIZE-ISA", 2, 0, false);
        declareFunction("cb_categorize_isa_guess_mts", "CB-CATEGORIZE-ISA-GUESS-MTS", 1, 0, false);
        declareFunction("cb_categorize_generalization", "CB-CATEGORIZE-GENERALIZATION", 2, 0, false);
        declareFunction("cb_categorize_guess_generalization", "CB-CATEGORIZE-GUESS-GENERALIZATION", 1, 0, false);
        declareFunction("cb_categorize_generalization_guess_mts", "CB-CATEGORIZE-GENERALIZATION-GUESS-MTS", 3, 0, false);
        declareFunction("cb_copy_from_similar_guts", "CB-COPY-FROM-SIMILAR-GUTS", 2, 0, false);
        declareFunction("cb_handle_copy_from_similar", "CB-HANDLE-COPY-FROM-SIMILAR", 1, 0, false);
        declareFunction("cb_copy_from_similar_checkbox", "CB-COPY-FROM-SIMILAR-CHECKBOX", 1, 0, false);
        declareFunction("cb_suggested_conceptually_related", "CB-SUGGESTED-CONCEPTUALLY-RELATED", 1, 0, false);
        declareFunction("cb_conceptually_related_guts", "CB-CONCEPTUALLY-RELATED-GUTS", 1, 0, false);
        declareFunction("ct_cr_search_show_next_suggestion", "CT-CR-SEARCH-SHOW-NEXT-SUGGESTION", 1, 0, false);
        declareFunction("cb_conceptually_related_terms", "CB-CONCEPTUALLY-RELATED-TERMS", 1, 0, false);
        declareFunction("ct_cr_extract_suggestions", "CT-CR-EXTRACT-SUGGESTIONS", 1, 0, false);
        declareFunction("ct_cr_assertion_suggestions", "CT-CR-ASSERTION-SUGGESTIONS", 4, 0, false);
        declareFunction("ct_cr_justify", "CT-CR-JUSTIFY", 1, 0, false);
        declareFunction("cb_link_ct_cr_justify", "CB-LINK-CT-CR-JUSTIFY", 1, 1, false);
        declareFunction("ct_cr_search_show_suggestion", "CT-CR-SEARCH-SHOW-SUGGESTION", 1, 0, false);
        declareFunction("ct_cr_setup", "CT-CR-SETUP", 0, 0, false);
        declareFunction("ct_cr_initialize_irrelevant_term_table", "CT-CR-INITIALIZE-IRRELEVANT-TERM-TABLE", 0, 0, false);
        declareFunction("cb_elaborate_term", "CB-ELABORATE-TERM", 1, 0, false);
        declareFunction("cb_link_elaborate_term", "CB-LINK-ELABORATE-TERM", 1, 1, false);
        declareFunction("cb_elaborate_term_guts", "CB-ELABORATE-TERM-GUTS", 1, 0, false);
        declareFunction("ke_requirements", "KE-REQUIREMENTS", 1, 0, false);
        declareFunction("cb_elaborate_requirement", "CB-ELABORATE-REQUIREMENT", 2, 0, false);
        declareFunction("ke_suggestions", "KE-SUGGESTIONS", 1, 0, false);
        declareFunction("cb_elaborate_suggestion", "CB-ELABORATE-SUGGESTION", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_html_create_term_file_alt() {
        defparameter("*CB-CREATE-INFO*", NIL);
        defparameter("*CB-CATEGORIZE-INFO*", NIL);
        deflexical("*CB-CATEGORIZE-GENERALIZATION-POSSIBILITIES*", $list_alt75);
        deflexical("*KE-REQUIREMENTS-QUERY*", $list_alt151);
        return NIL;
    }

    public static SubLObject init_html_create_term_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*CB-CREATE-INFO*", NIL);
            defparameter("*CB-CATEGORIZE-INFO*", NIL);
            deflexical("*CB-CATEGORIZE-GENERALIZATION-POSSIBILITIES*", $list85);
            deflexical("*KE-REQUIREMENTS-QUERY*", $list161);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*CB-CATEGORIZE-GENERALIZATION-POSSIBILITIES*", $list_alt75);
            deflexical("*KE-REQUIREMENTS-QUERY*", $list_alt151);
        }
        return NIL;
    }

    public static SubLObject init_html_create_term_file_Previous() {
        defparameter("*CB-CREATE-INFO*", NIL);
        defparameter("*CB-CATEGORIZE-INFO*", NIL);
        deflexical("*CB-CATEGORIZE-GENERALIZATION-POSSIBILITIES*", $list85);
        deflexical("*KE-REQUIREMENTS-QUERY*", $list161);
        return NIL;
    }

    public static final SubLObject setup_html_create_term_file_alt() {
        register_html_state_variable($cb_create_info$);
        sethash($CB_CREATE_TERM, $cb_help_definitions$.getGlobalValue(), list($str_alt2$cb_create_term_html, NIL));
        html_macros.note_html_handler_function(CB_CREATE_TERM);
        html_macros.note_html_handler_function(CB_HANDLE_CREATE_TERM);
        setup_cb_link_method($CREATE_TERM, CB_LINK_CREATE_TERM, ONE_INTEGER);
        declare_cb_tool($CREATE_TERM, $$$Create_Term, $$$Crt, $$$Cyc_Constant_Creation_Wizard);
        html_macros.note_html_handler_function(CB_CATEGORIZE_TERM);
        setup_cb_link_method($CATEGORIZE_TERM, CB_LINK_CATEGORIZE_TERM, TWO_INTEGER);
        register_html_state_variable($cb_categorize_info$);
        sethash($CB_CATEGORIZE_TERM, $cb_help_definitions$.getGlobalValue(), list($str_alt55$cb_categorize_term_html, NIL));
        html_macros.note_html_handler_function(CB_HANDLE_CATEGORIZE_TERM);
        sethash($CB_COPY_FROM_SIMILAR, $cb_help_definitions$.getGlobalValue(), list($str_alt85$cb_copy_from_similar_html, NIL));
        html_macros.note_html_handler_function(CB_HANDLE_COPY_FROM_SIMILAR);
        sethash($CB_CONCEPTUALLY_RELATED_TERMS, $cb_help_definitions$.getGlobalValue(), list($str_alt99$cb_conceptually_related_terms_htm, NIL));
        html_macros.note_html_handler_function(CB_CONCEPTUALLY_RELATED_TERMS);
        html_macros.note_html_handler_function(CT_CR_JUSTIFY);
        setup_cb_link_method($CT_CR_JUSTIFY, CB_LINK_CT_CR_JUSTIFY, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_ELABORATE_TERM);
        setup_cb_link_method($ELABORATE_TERM, CB_LINK_ELABORATE_TERM, TWO_INTEGER);
        sethash($CB_ELABORATE_TERM, $cb_help_definitions$.getGlobalValue(), list($str_alt145$cb_elaborate_term_html, NIL));
        return NIL;
    }

    public static SubLObject setup_html_create_term_file() {
        if (SubLFiles.USE_V1) {
            register_html_state_variable($cb_create_info$);
            sethash($CB_CREATE_TERM, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str2$cb_create_term_html, NIL));
            html_macros.note_cgi_handler_function(CB_CREATE_TERM, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_HANDLE_CREATE_TERM, $HTML_HANDLER);
            setup_cb_link_method($CREATE_TERM, CB_LINK_CREATE_TERM, ONE_INTEGER);
            declare_cb_tool($CREATE_TERM, $$$Create_Term, $$$Crt, $$$Cyc_Constant_Creation_Wizard);
            html_macros.note_cgi_handler_function(CB_CATEGORIZE_TERM, $HTML_HANDLER);
            setup_cb_link_method($CATEGORIZE_TERM, CB_LINK_CATEGORIZE_TERM, TWO_INTEGER);
            register_html_state_variable($cb_categorize_info$);
            sethash($CB_CATEGORIZE_TERM, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str65$cb_categorize_term_html, NIL));
            html_macros.note_cgi_handler_function(CB_HANDLE_CATEGORIZE_TERM, $HTML_HANDLER);
            sethash($CB_COPY_FROM_SIMILAR, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str95$cb_copy_from_similar_html, NIL));
            html_macros.note_cgi_handler_function(CB_HANDLE_COPY_FROM_SIMILAR, $HTML_HANDLER);
            sethash($CB_CONCEPTUALLY_RELATED_TERMS, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str109$cb_conceptually_related_terms_htm, NIL));
            html_macros.note_cgi_handler_function(CB_CONCEPTUALLY_RELATED_TERMS, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CT_CR_JUSTIFY, $HTML_HANDLER);
            setup_cb_link_method($CT_CR_JUSTIFY, CB_LINK_CT_CR_JUSTIFY, TWO_INTEGER);
            html_macros.note_cgi_handler_function(CB_ELABORATE_TERM, $HTML_HANDLER);
            setup_cb_link_method($ELABORATE_TERM, CB_LINK_ELABORATE_TERM, TWO_INTEGER);
            sethash($CB_ELABORATE_TERM, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str155$cb_elaborate_term_html, NIL));
        }
        if (SubLFiles.USE_V2) {
            html_macros.note_html_handler_function(CB_CREATE_TERM);
            html_macros.note_html_handler_function(CB_HANDLE_CREATE_TERM);
            html_macros.note_html_handler_function(CB_CATEGORIZE_TERM);
            sethash($CB_CATEGORIZE_TERM, $cb_help_definitions$.getGlobalValue(), list($str_alt55$cb_categorize_term_html, NIL));
            html_macros.note_html_handler_function(CB_HANDLE_CATEGORIZE_TERM);
            sethash($CB_COPY_FROM_SIMILAR, $cb_help_definitions$.getGlobalValue(), list($str_alt85$cb_copy_from_similar_html, NIL));
            html_macros.note_html_handler_function(CB_HANDLE_COPY_FROM_SIMILAR);
            sethash($CB_CONCEPTUALLY_RELATED_TERMS, $cb_help_definitions$.getGlobalValue(), list($str_alt99$cb_conceptually_related_terms_htm, NIL));
            html_macros.note_html_handler_function(CB_CONCEPTUALLY_RELATED_TERMS);
            html_macros.note_html_handler_function(CT_CR_JUSTIFY);
            html_macros.note_html_handler_function(CB_ELABORATE_TERM);
            sethash($CB_ELABORATE_TERM, $cb_help_definitions$.getGlobalValue(), list($str_alt145$cb_elaborate_term_html, NIL));
        }
        return NIL;
    }

    public static SubLObject setup_html_create_term_file_Previous() {
        register_html_state_variable($cb_create_info$);
        sethash($CB_CREATE_TERM, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str2$cb_create_term_html, NIL));
        html_macros.note_cgi_handler_function(CB_CREATE_TERM, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_HANDLE_CREATE_TERM, $HTML_HANDLER);
        setup_cb_link_method($CREATE_TERM, CB_LINK_CREATE_TERM, ONE_INTEGER);
        declare_cb_tool($CREATE_TERM, $$$Create_Term, $$$Crt, $$$Cyc_Constant_Creation_Wizard);
        html_macros.note_cgi_handler_function(CB_CATEGORIZE_TERM, $HTML_HANDLER);
        setup_cb_link_method($CATEGORIZE_TERM, CB_LINK_CATEGORIZE_TERM, TWO_INTEGER);
        register_html_state_variable($cb_categorize_info$);
        sethash($CB_CATEGORIZE_TERM, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str65$cb_categorize_term_html, NIL));
        html_macros.note_cgi_handler_function(CB_HANDLE_CATEGORIZE_TERM, $HTML_HANDLER);
        sethash($CB_COPY_FROM_SIMILAR, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str95$cb_copy_from_similar_html, NIL));
        html_macros.note_cgi_handler_function(CB_HANDLE_COPY_FROM_SIMILAR, $HTML_HANDLER);
        sethash($CB_CONCEPTUALLY_RELATED_TERMS, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str109$cb_conceptually_related_terms_htm, NIL));
        html_macros.note_cgi_handler_function(CB_CONCEPTUALLY_RELATED_TERMS, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CT_CR_JUSTIFY, $HTML_HANDLER);
        setup_cb_link_method($CT_CR_JUSTIFY, CB_LINK_CT_CR_JUSTIFY, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_ELABORATE_TERM, $HTML_HANDLER);
        setup_cb_link_method($ELABORATE_TERM, CB_LINK_ELABORATE_TERM, TWO_INTEGER);
        sethash($CB_ELABORATE_TERM, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str155$cb_elaborate_term_html, NIL));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_html_create_term_file();
    }

    @Override
    public void initializeVariables() {
        init_html_create_term_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_html_create_term_file();
    }

    static {
    }

    static private final SubLString $str_alt2$cb_create_term_html = makeString("cb-create-term.html");

    static private final SubLString $str_alt6$text_javascript = makeString("text/javascript");

    static private final SubLString $str_alt7$yui_skin_sam = makeString("yui-skin-sam");

    static private final SubLString $str_alt8$cb_handle_create_term = makeString("cb-handle-create-term");

    static private final SubLString $str_alt14$Name__required____ = makeString("Name (required) : ");

    static private final SubLString $str_alt15$new_name = makeString("new-name");

    static private final SubLString $str_alt21$__one_per_line__optional____ = makeString(", one per line (optional) : ");

    static private final SubLString $str_alt22$term_strings = makeString("term-strings");

    static private final SubLString $str_alt25$__required____ = makeString(" (required) : ");

    static private final SubLString $str_alt32$_S_is_not_a_valid_constant_name = makeString("~S is not a valid constant name");

    static private final SubLString $str_alt34$Unable_to_create_a_constant_named = makeString("Unable to create a constant named ~S");

    static private final SubLString $str_alt37$cb_create_term = makeString("cb-create-term");

    static private final SubLString $str_alt47$_a_does_not_specify_a_Cyc_term = makeString("~a does not specify a Cyc term");

    static private final SubLString $str_alt50$cb_categorize_term__a = makeString("cb-categorize-term&~a");

    static private final SubLString $str_alt55$cb_categorize_term_html = makeString("cb-categorize-term.html");

    static private final SubLString $str_alt57$cb_handle_categorize_term = makeString("cb-handle-categorize-term");

    static private final SubLString $str_alt59$Categorize_ = makeString("Categorize ");

    static private final SubLString $str_alt60$_ = makeString(":");

    static private final SubLString $str_alt62$Mt___ = makeString("Mt : ");

    static private final SubLString $str_alt65$Similar_to___ = makeString("Similar to : ");

    static private final SubLString $str_alt66$similar_to = makeString("similar-to");

    static private final SubLString $str_alt68$Instance_of___ = makeString("Instance of : ");

    static private final SubLString $str_alt70$Specialization_of___ = makeString("Specialization of : ");

    static private final SubLString $str_alt73$_a_does_not_specify_a_Cyc_Microth = makeString("~a does not specify a Cyc Microtheory");

    static private final SubLList $list_alt75 = list(list(reader_make_constant_shell("genls"), reader_make_constant_shell("Collection")), list(reader_make_constant_shell("genlMt"), reader_make_constant_shell("Microtheory")), list(reader_make_constant_shell("genlPreds"), reader_make_constant_shell("Predicate")), list(reader_make_constant_shell("genlInverse"), reader_make_constant_shell("Predicate")));

    static private final SubLList $list_alt83 = list(makeSymbol("PRED"), makeSymbol("COL"));

    static private final SubLString $str_alt85$cb_copy_from_similar_html = makeString("cb-copy-from-similar.html");

    static private final SubLString $str_alt86$cb_handle_copy_from_similar = makeString("cb-handle-copy-from-similar");

    static private final SubLString $str_alt87$Copy_from_ = makeString("Copy from ");

    static private final SubLString $str_alt88$_to_ = makeString(" to ");

    static private final SubLString $str_alt90$Check_the_assertions_from_ = makeString("Check the assertions from ");

    static private final SubLString $str_alt91$_which_you_wish_to_copy__ = makeString(" which you wish to copy: ");

    static private final SubLString $str_alt95$Unable_to_determine_a_term_from__ = makeString("Unable to determine a term from ~S");

    static private final SubLString $str_alt99$cb_conceptually_related_terms_htm = makeString("cb-conceptually-related-terms.html");

    static private final SubLString $str_alt101$cb_conceptually_related_terms = makeString("cb-conceptually-related-terms");

    static private final SubLString $str_alt104$Term___ = makeString("Term : ");

    static private final SubLString $str_alt105$Existing_Conceptually_Related_Ter = makeString("Existing Conceptually Related Terms : ");

    static private final SubLString $str_alt107$_Justify_ = makeString("[Justify]");

    static private final SubLString $str_alt109$Specify_the_Microtheory_for_new__ = makeString("Specify the Microtheory for new #$conceptuallyRelated assertions:");

    static private final SubLString $str_alt110$_Mt___ = makeString(" Mt : ");

    static private final SubLString $str_alt111$_Select_terms_and_or_type_in_a_te = makeString(" Select terms and/or type in a term to add as #$conceptuallyRelated to ");

    static private final SubLString $str_alt112$__ = makeString(": ");

    static private final SubLString $str_alt114$_Term___ = makeString(" Term : ");

    static private final SubLString $str_alt115$Possible_Terms_to_Add___ = makeString("Possible Terms to Add : ");

    static private final SubLString $str_alt117$add_backward = makeString("add-backward");

    static private final SubLString $str_alt118$_as_ = makeString(" as ");

    static private final SubLString $str_alt121$_in_MT = makeString(" in MT");

    static private final SubLString $str_alt123$add_forward = makeString("add-forward");

    static private final SubLList $list_alt124 = list(makeSymbol("TERM"));

    static private final SubLString $str_alt125$Unable_to_determine_last_term__wh = makeString("Unable to determine last term (why?)");

    static private final SubLString $str_alt126$Invalid_Mt_specified____S = makeString("Invalid Mt specified : ~S");

    static private final SubLString $str_alt131$Formulas_Asserted__ = makeString("Formulas Asserted :");

    static private final SubLString $str_alt132$_in_ = makeString(" in ");

    static private final SubLSymbol $sym133$WHY_CONCEPTUALLY_RELATED_ = makeSymbol("WHY-CONCEPTUALLY-RELATED?");

    static private final SubLString $str_alt134$Sorry__System_74_92_or_later_is_r = makeString("Sorry, System 74.92 or later is required for justification to work.");

    static private final SubLString $str_alt137$ct_cr_justify__a = makeString("ct-cr-justify&~a");

    static private final SubLString $str_alt141$cb_elaborate_term__a = makeString("cb-elaborate-term&~a");

    static private final SubLString $str_alt145$cb_elaborate_term_html = makeString("cb-elaborate-term.html");

    static private final SubLString $str_alt146$cb_handle_elaborate_term = makeString("cb-handle-elaborate-term");

    static private final SubLString $str_alt148$Elaborate_ = makeString("Elaborate ");

    static private final SubLString $str_alt149$Requirements___ = makeString("Requirements : ");

    static private final SubLString $str_alt150$Suggestions___ = makeString("Suggestions : ");

    static private final SubLList $list_alt151 = list(reader_make_constant_shell("keRequirement"), $TERM, makeSymbol("?FORMULA"));
}

/**
 * Total time: 1071 ms
 */
