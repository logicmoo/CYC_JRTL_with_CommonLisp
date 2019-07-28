package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.cycjava.cycl.cb_pph_tools;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.utilities_macros;
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
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.cb_parameters.*;
import static com.cyc.cycjava.cycl.cb_pph_tools.*;
import static com.cyc.cycjava.cycl.cb_utilities.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_newline;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EIGHT_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIFTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWENTY_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class cb_pph_tools extends SubLTranslatedFile {
    public static final SubLFile me = new cb_pph_tools();

    public static final String myName = "com.cyc.cycjava.cycl.cb_pph_tools";

    public static final String myFingerPrint = "8ea34399b1dd473e5ea054f3cec44d967a907d5a87c63957a0ea809793754a50";

    // deflexical
    private static final SubLSymbol $test_current_formula$ = makeSymbol("*TEST-CURRENT-FORMULA*");

    // deflexical
    private static final SubLSymbol $batch_test$ = makeSymbol("*BATCH-TEST*");

    // defparameter
    private static final SubLSymbol $current_test_gen_template_reln$ = makeSymbol("*CURRENT-TEST-GEN-TEMPLATE-RELN*");

    private static final SubLString $str0$_Test_Paraphrase_ = makeString("[Test Paraphrase]");



    private static final SubLString $str2$cb_test_gen_template__A = makeString("cb-test-gen-template&~A");

    private static final SubLSymbol $TEST_GEN_TEMPLATE = makeKeyword("TEST-GEN-TEMPLATE");

    private static final SubLSymbol CB_LINK_TEST_GEN_TEMPLATE = makeSymbol("CB-LINK-TEST-GEN-TEMPLATE");

    private static final SubLList $list5 = list(makeSymbol("ID"));

    private static final SubLString $str6$_S_did_not_specify_an_assertion_ = makeString("~S did not specify an assertion.");

    private static final SubLSymbol CB_TEST_GEN_TEMPLATE = makeSymbol("CB-TEST-GEN-TEMPLATE");



    private static final SubLString $$$batch = makeString("batch");

    private static final SubLSymbol CB_HANDLE_TEST_GEN_TEMPLATE = makeSymbol("CB-HANDLE-TEST-GEN-TEMPLATE");

    private static final SubLString $$$Test_Current_Formula = makeString("Test Current Formula");

    private static final SubLString $$$Batch_Test = makeString("Batch Test");

    private static final SubLString $$$Test_Paraphrase_Template = makeString("Test Paraphrase Template");

    private static final SubLString $str14$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str15$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");





    private static final SubLString $str18$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$post = makeString("post");

    private static final SubLString $$$id = makeString("id");

    private static final SubLString $$$Reset_All_Fields = makeString("Reset All Fields");

    private static final SubLString $$$Back = makeString("Back");

    private static final SubLString $$$test = makeString("test");

    private static final SubLString $str24$batch_size = makeString("batch-size");

    private static final SubLInteger $int$25 = makeInteger(25);

    private static final SubLInteger $int$50 = makeInteger(50);



    private static final SubLInteger $int$250 = makeInteger(250);

    private static final SubLInteger $int$500 = makeInteger(500);

    private static final SubLObject $$genTemplate_QuerySentence = reader_make_constant_shell(makeString("genTemplate-QuerySentence"));

    private static final SubLString $str31$Sentential_Force_ = makeString("Sentential Force:");

    private static final SubLString $$$force = makeString("force");

    private static final SubLList $list33 = list(makeKeyword("DECLARATIVE"), makeKeyword("INTERROGATIVE"));







    private static final SubLString $$$formula = makeString("formula");



    private static final SubLString $$$Formula = makeString("Formula");



    private static final SubLString $$$Complete = makeString("Complete");



    private static final SubLString $$$Cyclify = makeString("Cyclify");



    private static final SubLString $$$Clear = makeString("Clear");





    private static final SubLInteger $int$80 = makeInteger(80);





    private static final SubLString $str51$_br_ = makeString("<br>");

    private static final SubLString $str52$Result_ = makeString("Result:");

    private static final SubLString $str53$Test_Paraphrase_Template___Batch = makeString("Test Paraphrase Template - Batch");

    private static final SubLList $list54 = list(makeKeyword("INPUT-NAME"), makeString("formula"));

    private static final SubLString $str55$Couldn_t_paraphrase_formula_with_ = makeString("Couldn't paraphrase formula with assertion.");



    private static final SubLSymbol $sym57$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ = makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");

    private static final SubLList $list58 = list(makeSymbol("CSETQ"), makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), NIL);

    private static final SubLInteger $int$300 = makeInteger(300);





    private static final SubLObject $$genTemplate_Constrained = reader_make_constant_shell(makeString("genTemplate-Constrained"));

    private static final SubLString $str63$Formula_does_not_meet_this_assert = makeString("Formula does not meet this assertion's constraints.");

    private static final SubLList $list64 = list(reader_make_constant_shell(makeString("genTemplate-Constrained")), reader_make_constant_shell(makeString("genTemplate")));

    private static final SubLString $str65$_S_does_not_use__S_as_the_arg0_ = makeString("~S does not use ~S as the arg0.");







    private static final SubLSymbol HYPOTHETICAL_TERM_P = makeSymbol("HYPOTHETICAL-TERM-P");

    private static final SubLSymbol SKOLEM_FORT_P = makeSymbol("SKOLEM-FORT-P");



    private static final SubLSymbol $sym72$_EXIT = makeSymbol("%EXIT");

    private static final SubLList $list73 = list(makeSymbol("PRED"), makeSymbol("TEMPLATE"), makeSymbol("RECIPE"));

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    private static final SubLList $list75 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("MAX-TIME"), TWO_INTEGER);



    private static final SubLList $list77 = list(makeKeyword("MAX-TIME"), FIFTEEN_INTEGER);

    private static final SubLString $$$Query_timed_out = makeString("Query timed out");

    private static final SubLString $$$Something_went_wrong = makeString("Something went wrong");

    private static final SubLList $list80 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("MAX-TIME"), ONE_INTEGER);

    private static final SubLList $list81 = list(makeSymbol("PRED"), makeSymbol("RECIPE"));

    private static final SubLList $list82 = list(makeSymbol("TEMPLATE"), makeSymbol("RECIPE"));

    private static final SubLSymbol $sym83$EL_VAR_ = makeSymbol("EL-VAR?");

    private static final SubLSymbol VARIABLE_BINDING_VARIABLE = makeSymbol("VARIABLE-BINDING-VARIABLE");







    private static final SubLObject $$exampleSentences = reader_make_constant_shell(makeString("exampleSentences"));



    private static final SubLList $list90 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER);



    private static final SubLObject $$denotes = reader_make_constant_shell(makeString("denotes"));

    private static final SubLList $list93 = list(reader_make_constant_shell(makeString("QuasiQuote")), makeSymbol("?FORMULA"));

    private static final SubLSymbol $sym94$_FORMULA = makeSymbol("?FORMULA");

    private static final SubLList $list95 = list(makeKeyword("MAX-TIME"), FIFTEEN_INTEGER, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("EL"));

    private static final SubLSymbol $sym96$FORMULA_OKAY_FOR_GEN_TEMPLATE_TEST_ = makeSymbol("FORMULA-OKAY-FOR-GEN-TEMPLATE-TEST?");

    private static final SubLString $str97$padding_top_5px__padding_bottom_5 = makeString("padding-top:5px; padding-bottom:5px");

    private static final SubLString $str98$__min_width_2em__padding_right_0_ = makeString("; min-width:2em; padding-right:0.3em");





    private static final SubLString $str101$_D_ = makeString("~D.");

    private static final SubLList $list102 = list(makeKeyword("PID"), makeInteger(10800), makeKeyword("ISSUETYPE"), ONE_INTEGER, makeKeyword("PRIORITY"), THREE_INTEGER, makeKeyword("ASSIGNEE"), makeString("jessica"));

    private static final SubLString $str103$Problem_with_genTemplate_paraphra = makeString("Problem with genTemplate paraphrase");

    private static final SubLString $str104$_for__A = makeString(" for ~A");

    private static final SubLString $str105$Result____A = makeString("Result:~%~A");



    private static final SubLString $str107$____Generation_Assertion____A = makeString("~%~%Generation Assertion:~%~A");

    private static final SubLString $str108$____Test_Formula____A = makeString("~%~%Test Formula:~%~A");

    public static SubLObject cb_link_test_gen_template(final SubLObject assertion, SubLObject verbosity, SubLObject linktext) {
        if (verbosity == UNPROVIDED) {
            verbosity = NIL;
        }
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str0$_Test_Paraphrase_;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str2$cb_test_gen_template__A, assertion_handles.assertion_id(assertion));
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
            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            html_princ(linktext);
            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_test_gen_template(final SubLObject args) {
        SubLObject id = NIL;
        destructuring_bind_must_consp(args, args, $list5);
        id = args.first();
        final SubLObject current = args.rest();
        if (NIL != current) {
            cdestructuring_bind_error(args, $list5);
            return NIL;
        }
        final SubLObject assertion = cb_guess_assertion(id);
        if (NIL == assertion_handles.assertion_p(assertion)) {
            return cb_error($str6$_S_did_not_specify_an_assertion_, args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return cb_test_gen_template_int(assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cb_handle_test_gen_template(final SubLObject args) {
        if (NIL != html_extract_input($$$batch, args)) {
            return cb_batch_button(args);
        }
        return cb_test_button(args);
    }

    public static SubLObject cb_test_gen_template_int(final SubLObject assertion, SubLObject formula, SubLObject v_pph_phrase, SubLObject err_msg) {
        if (formula == UNPROVIDED) {
            formula = NIL;
        }
        if (v_pph_phrase == UNPROVIDED) {
            v_pph_phrase = NIL;
        }
        if (err_msg == UNPROVIDED) {
            err_msg = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title = $$$Test_Paraphrase_Template;
        final SubLObject id = assertion_handles.assertion_id(assertion);
        final SubLObject resultsP = makeBoolean((NIL != v_pph_phrase) || (NIL != err_msg));
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str14$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str15$_meta_http_equiv__X_UA_Compatible);
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
                html_source_readability_terpri(UNPROVIDED);
                html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_princ(title);
                html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_complete.html_complete_script();
                dhtml_macros.dhtml_with_toggle_visibility_support();
                dhtml_macros.html_basic_cb_scripts();
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str18$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
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
                        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input(CB_HANDLE_TEST_GEN_TEMPLATE, T, UNPROVIDED);
                            html_hidden_input($$$id, id, UNPROVIDED);
                            if (NIL == resultsP) {
                                html_reset_input($$$Reset_All_Fields);
                                html_indent(ONE_INTEGER);
                            }
                            if (NIL != resultsP) {
                                cb_back_button($SELF, $$$Back);
                                html_indent(ONE_INTEGER);
                            }
                            html_submit_input($test_current_formula$.getGlobalValue(), $$$test, UNPROVIDED);
                            html_indent(ONE_INTEGER);
                            html_submit_input($batch_test$.getGlobalValue(), $$$batch, UNPROVIDED);
                            html_indent(ONE_INTEGER);
                            html_create_simple_dropdown_list($str24$batch_size, list(TEN_INTEGER, $int$25, $int$50, $int$100, $int$250, $int$500), TEN_INTEGER);
                            html_hr(UNPROVIDED, UNPROVIDED);
                            cb_form(assertion, ZERO_INTEGER, T);
                            html_hr(UNPROVIDED, UNPROVIDED);
                            final SubLObject default_force = default_force_for_gen_template_assertion(assertion);
                            if ((NIL == fort_types_interface.isa_functionP(assertions_high.gaf_arg1(assertion), UNPROVIDED)) && (!assertions_high.gaf_arg0(assertion).eql($$genTemplate_QuerySentence))) {
                                html_princ_strong($str31$Sentential_Force_);
                                SubLObject cdolist_list_var = $list33;
                                SubLObject force = NIL;
                                force = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    html_indent(UNPROVIDED);
                                    html_radio_input($$$force, force, eql(force, default_force), UNPROVIDED);
                                    html_princ(Strings.string_downcase(princ_to_string(force), UNPROVIDED, UNPROVIDED));
                                    cdolist_list_var = cdolist_list_var.rest();
                                    force = cdolist_list_var.first();
                                } 
                                html_newline(UNPROVIDED);
                            }
                            final SubLObject mode = (assertions_high.gaf_arg0(assertion).eql($$genTemplate_QuerySentence)) ? $QUERY : $ASSERT;
                            final SubLObject display_options = list(new SubLObject[]{ $INPUT_NAME, $$$formula, $PRETTY_NAME, $$$Formula, $COMPLETE_LABEL, $$$Complete, $CYCLIFY_LABEL, $$$Cyclify, $CLEAR_LABEL, $$$Clear, $HEIGHT, FIVE_INTEGER, $WIDTH, $int$80, $MODE, mode });
                            if (NIL == formula) {
                                formula = default_test_formula_for_gen_template(assertion);
                            }
                            cb_form_widgets.cb_el_formula_input_section(formula, display_options);
                            if (NIL == resultsP) {
                                thread.resetMultipleValues();
                                final SubLObject v_pph_phrase_$5 = gen_template_test_phrase(assertion, formula, default_force);
                                final SubLObject err_msg_$6 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                v_pph_phrase = v_pph_phrase_$5;
                                err_msg = err_msg_$6;
                            }
                            if (NIL != err_msg) {
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
                                final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_markup(string_utilities.string_substitute($str51$_br_, Strings.make_string(ONE_INTEGER, CHAR_newline), err_msg, UNPROVIDED));
                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                                }
                                html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                html_hr(UNPROVIDED, UNPROVIDED);
                            }
                            if (NIL != pph_phrase.pph_phrase_p(v_pph_phrase, UNPROVIDED)) {
                                html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_markup(THREE_INTEGER);
                                html_char(CHAR_greater, UNPROVIDED);
                                html_princ($str52$Result_);
                                html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_markup(THREE_INTEGER);
                                html_char(CHAR_greater, UNPROVIDED);
                                cb_form(v_pph_phrase, UNPROVIDED, UNPROVIDED);
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
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

    public static SubLObject cb_test_gen_template_batch_int(final SubLObject assertion, final SubLObject batch_size) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title = $str53$Test_Paraphrase_Template___Batch;
        final SubLObject id = assertion_handles.assertion_id(assertion);
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str14$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str15$_meta_http_equiv__X_UA_Compatible);
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
                html_source_readability_terpri(UNPROVIDED);
                html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_princ(title);
                html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_complete.html_complete_script();
                dhtml_macros.dhtml_with_toggle_visibility_support();
                dhtml_macros.html_basic_cb_scripts();
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$9 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str18$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_heading_head$.getGlobalValue());
                        html_markup(TWO_INTEGER);
                        html_char(CHAR_greater, UNPROVIDED);
                        html_princ(title);
                        html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                        html_markup(TWO_INTEGER);
                        html_char(CHAR_greater, UNPROVIDED);
                        html_hidden_input($$$id, id, UNPROVIDED);
                        cb_back_button($SELF, $$$Back);
                        html_newline(UNPROVIDED);
                        html_hr(UNPROVIDED, UNPROVIDED);
                        cb_form(assertion, ZERO_INTEGER, T);
                        html_hr(UNPROVIDED, UNPROVIDED);
                        output_batch_paraphrase_results(gather_batch_paraphrase_formulas(assertion, batch_size), assertion);
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
        return NIL;
    }

    public static SubLObject cb_test_button(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject formula = cb_form_widgets.cb_extract_el_formula_input(args, $list54);
        final SubLObject formula_error = thread.secondMultipleValue();
        final SubLObject formula_error_string = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != formula_error) {
            return cb_form_widgets.cb_el_formula_error(formula_error, formula_error_string, UNPROVIDED);
        }
        final SubLObject id = html_extract_input($$$id, args);
        final SubLObject assertion = cb_guess_assertion(id);
        final SubLObject force_string = html_extract_input($$$force, args);
        final SubLObject force = (NIL != force_string) ? make_keyword(force_string) : default_force_for_gen_template_assertion(assertion);
        thread.resetMultipleValues();
        final SubLObject v_pph_phrase = gen_template_test_phrase(assertion, formula, force);
        SubLObject err_msg = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL == err_msg) && (NIL == pph_phrase.pph_phrase_p(v_pph_phrase, UNPROVIDED))) {
            err_msg = $str55$Couldn_t_paraphrase_formula_with_;
        }
        return cb_test_gen_template_int(assertion, formula, v_pph_phrase, err_msg);
    }

    public static SubLObject gen_template_test_phrase(final SubLObject assertion, final SubLObject formula, final SubLObject force) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_pph_phrase = NIL;
        SubLObject err_msg = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject was_appendingP = eval($sym57$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
                    eval($list58);
                    try {
                        validate_gen_template_test_formula(assertion, formula, force);
                        final SubLObject old_grace_period = delayed_processor.delayed_processor_get_delay_seconds(pph_phrase.pph_phrase_destroyer());
                        pph_phrase.set_pph_phrase_destruction_grace_period(max(old_grace_period, $int$300));
                        final SubLObject _prev_bind_0_$11 = pph_vars.$bypass_pph_phrase_destroyerP$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = pph_macros.$new_pph_phrases$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
                        try {
                            pph_vars.$bypass_pph_phrase_destroyerP$.bind(NIL, thread);
                            pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
                            pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
                            pph_macros.$destroy_new_pph_phrasesP$.bind(T, thread);
                            try {
                                final SubLObject _prev_bind_0_$12 = pph_error.$pph_break_on_errorP$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$13 = pph_vars.$pph_problem_reporting_mode$.currentBinding(thread);
                                try {
                                    pph_error.$pph_break_on_errorP$.bind(T, thread);
                                    pph_vars.$pph_problem_reporting_mode$.bind(NIL != pph_vars.pph_problem_reporting_on_p() ? pph_vars.$pph_problem_reporting_mode$.getDynamicValue(thread) : $QUIET, thread);
                                    v_pph_phrase = pph_methods_formulas.new_pph_phrase_for_formula_and_gen_template_assertion(formula, assertion, force);
                                } finally {
                                    pph_vars.$pph_problem_reporting_mode$.rebind(_prev_bind_1_$13, thread);
                                    pph_error.$pph_break_on_errorP$.rebind(_prev_bind_0_$12, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    pph_macros.destroy_new_pph_phrases();
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                                }
                            }
                        } finally {
                            pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_4, thread);
                            pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_3, thread);
                            pph_macros.$new_pph_phrases$.rebind(_prev_bind_2, thread);
                            pph_vars.$bypass_pph_phrase_destroyerP$.rebind(_prev_bind_0_$11, thread);
                        }
                        pph_phrase.set_pph_phrase_destruction_grace_period(old_grace_period);
                    } finally {
                        final SubLObject _prev_bind_0_$14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            eval(list(CSETQ, $sym57$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                        }
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            err_msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        return values(v_pph_phrase, err_msg);
    }

    public static SubLObject validate_gen_template_test_formula(final SubLObject assertion, final SubLObject formula, final SubLObject force) {
        if ($$genTemplate_Constrained.eql(assertions_high.gaf_arg0(assertion)) && (NIL == pph_templates.gen_template_constraint_passesP_internal(assertions_high.gaf_arg2(assertion), formula, NIL))) {
            Errors.error($str63$Formula_does_not_meet_this_assert);
        } else
            if ((NIL != member(assertions_high.gaf_arg0(assertion), $list64, UNPROVIDED, UNPROVIDED)) && (!assertions_high.gaf_arg1(assertion).equal(narts_high.nart_substitute(cycl_utilities.formula_arg0(formula))))) {
                Errors.error($str65$_S_does_not_use__S_as_the_arg0_, formula, assertions_high.gaf_arg1(assertion));
            }

        return NIL;
    }

    public static SubLObject default_force_for_gen_template_assertion(final SubLObject assertion) {
        return $$genTemplate_QuerySentence.eql(assertions_high.gaf_arg0(assertion)) ? $INTERROGATIVE : NIL != fort_types_interface.isa_predicateP(assertions_high.gaf_arg1(assertion), UNPROVIDED) ? $DECLARATIVE : $NONE;
    }

    public static SubLObject cb_batch_button(final SubLObject args) {
        final SubLObject id = html_extract_input($$$id, args);
        final SubLObject assertion = cb_guess_assertion(id);
        final SubLObject batch_size = html_extract_integer($str24$batch_size, args, UNPROVIDED);
        return cb_test_gen_template_batch_int(assertion, batch_size);
    }

    public static SubLObject formula_okay_for_gen_template_testP(final SubLObject formula, SubLObject reln) {
        if (reln == UNPROVIDED) {
            reln = $current_test_gen_template_reln$.getDynamicValue();
        }
        if (NIL == el_formula_with_operator_p(formula, reln)) {
            return NIL;
        }
        if (NIL != cycl_utilities.expression_find_if(HYPOTHETICAL_TERM_P, formula, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        if (NIL != cycl_utilities.expression_find_if(SKOLEM_FORT_P, formula, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        return T;
    }

    public static SubLObject default_test_formula_for_gen_template(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject gen_template_pred = assertions_high.gaf_arg0(assertion);
        final SubLObject dummy_formula = pph_utilities.pph_dummy_formula(assertions_high.gaf_arg1(assertion), UNPROVIDED);
        if (gen_template_pred.eql($$genTemplate_QuerySentence)) {
            return default_test_gen_template_query_sentence(assertion, UNPROVIDED);
        }
        if (gen_template_pred.eql($$genTemplate_Constrained)) {
            final SubLObject formula = assertions_high.gaf_arg3(assertion);
            if (NIL != cycl_utilities.expression_find(pph_functions.bestbindingsphrasefn(), formula, T, symbol_function(EQL), symbol_function(FORMULA_ARG0))) {
                return default_test_gen_template_with_best_bindings_phrase(assertion);
            }
            return default_test_gen_template_constrained(assertion, dummy_formula);
        } else {
            final SubLObject formula = assertions_high.gaf_arg2(assertion);
            if (NIL != cycl_utilities.expression_find(pph_functions.bestbindingsphrasefn(), formula, T, symbol_function(EQL), symbol_function(FORMULA_ARG0))) {
                return default_test_gen_template_with_best_bindings_phrase(assertion);
            }
            final SubLObject _prev_bind_0 = $current_test_gen_template_reln$.currentBinding(thread);
            try {
                $current_test_gen_template_reln$.bind(assertions_high.gaf_arg(assertion, lexicon_utilities.denotatum_arg_of_pred_cached(gen_template_pred)), thread);
                return default_test_gen_template_formula_for_reln($current_test_gen_template_reln$.getDynamicValue(thread));
            } finally {
                $current_test_gen_template_reln$.rebind(_prev_bind_0, thread);
            }
        }
    }

    public static SubLObject default_test_gen_template_constrained(final SubLObject assertion, final SubLObject dummy_formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject timed_outP = NIL;
        SubLObject v_bindings = NIL;
        final SubLObject _prev_bind_0 = wff_vars.$permit_keyword_variablesP$.currentBinding(thread);
        try {
            wff_vars.$permit_keyword_variablesP$.bind(T, thread);
            final SubLObject tag = with_timeout_make_tag();
            try {
                thread.throwStack.push(tag);
                final SubLObject _prev_bind_0_$16 = $within_with_timeout$.currentBinding(thread);
                try {
                    $within_with_timeout$.bind(T, thread);
                    SubLObject timer = NIL;
                    try {
                        final SubLObject _prev_bind_0_$17 = $with_timeout_nesting_depth$.currentBinding(thread);
                        try {
                            $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                            timer = with_timeout_start_timer(THREE_INTEGER, tag);
                            SubLObject current;
                            final SubLObject datum = current = assertions_high.gaf_args(assertion);
                            SubLObject pred = NIL;
                            SubLObject template = NIL;
                            SubLObject recipe = NIL;
                            destructuring_bind_must_consp(current, datum, $list73);
                            pred = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list73);
                            template = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list73);
                            recipe = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                v_bindings = inference_kernel.new_cyc_query(simplifier.conjoin(list(dummy_formula, template), UNPROVIDED), $$InferencePSC, $list75).first();
                            } else {
                                cdestructuring_bind_error(datum, $list73);
                            }
                        } finally {
                            $with_timeout_nesting_depth$.rebind(_prev_bind_0_$17, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            with_timeout_stop_timer(timer);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                        }
                    }
                } finally {
                    $within_with_timeout$.rebind(_prev_bind_0_$16, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
            } finally {
                thread.throwStack.pop();
            }
            if (NIL != timed_outP) {
                return dummy_formula;
            }
            if (NIL != v_bindings) {
                return bindings.apply_bindings(v_bindings, dummy_formula);
            }
            return dummy_formula;
        } finally {
            wff_vars.$permit_keyword_variablesP$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject default_test_gen_template_constrained_batch(final SubLObject assertion, final SubLObject number) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject timed_outP = NIL;
        SubLObject v_bindings = NIL;
        SubLObject tests = NIL;
        final SubLObject _prev_bind_0 = wff_vars.$permit_keyword_variablesP$.currentBinding(thread);
        try {
            wff_vars.$permit_keyword_variablesP$.bind(T, thread);
            final SubLObject dummy_formula = pph_utilities.pph_dummy_formula(assertions_high.gaf_arg1(assertion), UNPROVIDED);
            final SubLObject tag = with_timeout_make_tag();
            try {
                thread.throwStack.push(tag);
                final SubLObject _prev_bind_0_$19 = $within_with_timeout$.currentBinding(thread);
                try {
                    $within_with_timeout$.bind(T, thread);
                    SubLObject timer = NIL;
                    try {
                        final SubLObject _prev_bind_0_$20 = $with_timeout_nesting_depth$.currentBinding(thread);
                        try {
                            $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                            timer = with_timeout_start_timer(TWENTY_INTEGER, tag);
                            final SubLObject template = assertions_high.gaf_arg2(assertion);
                            v_bindings = inference_kernel.new_cyc_query(simplifier.conjoin(list(dummy_formula, template), UNPROVIDED), $$InferencePSC, listS($MAX_NUMBER, number, $list77));
                        } finally {
                            $with_timeout_nesting_depth$.rebind(_prev_bind_0_$20, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            with_timeout_stop_timer(timer);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                        }
                    }
                } finally {
                    $within_with_timeout$.rebind(_prev_bind_0_$19, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
            } finally {
                thread.throwStack.pop();
            }
            if (NIL != timed_outP) {
                Errors.warn($$$Query_timed_out);
            } else {
                if (NIL != v_bindings) {
                    SubLObject cdolist_list_var = v_bindings;
                    SubLObject binding = NIL;
                    binding = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        tests = append(tests, list(bindings.apply_bindings(binding, dummy_formula)));
                        cdolist_list_var = cdolist_list_var.rest();
                        binding = cdolist_list_var.first();
                    } 
                    return tests;
                }
                Errors.warn($$$Something_went_wrong);
            }
        } finally {
            wff_vars.$permit_keyword_variablesP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject default_test_gen_template_with_best_bindings_phrase(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject timed_out_1P = NIL;
        SubLObject timed_out_2P = NIL;
        SubLObject suggested_test = NIL;
        final SubLObject _prev_bind_0 = wff_vars.$permit_keyword_variablesP$.currentBinding(thread);
        try {
            wff_vars.$permit_keyword_variablesP$.bind(T, thread);
            final SubLObject dummy_formula = pph_utilities.pph_dummy_formula(assertions_high.gaf_arg1(assertion), UNPROVIDED);
            if (assertions_high.gaf_arg0(assertion).eql($$genTemplate_Constrained)) {
                final SubLObject tag = with_timeout_make_tag();
                try {
                    thread.throwStack.push(tag);
                    final SubLObject _prev_bind_0_$22 = $within_with_timeout$.currentBinding(thread);
                    try {
                        $within_with_timeout$.bind(T, thread);
                        SubLObject timer = NIL;
                        try {
                            final SubLObject _prev_bind_0_$23 = $with_timeout_nesting_depth$.currentBinding(thread);
                            try {
                                $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                timer = with_timeout_start_timer(TWO_INTEGER, tag);
                                final SubLObject recipe = assertions_high.gaf_arg3(assertion);
                                final SubLObject binding = second(cycl_utilities.expression_find(pph_functions.bestbindingsphrasefn(), recipe, T, symbol_function(EQL), symbol_function(FORMULA_ARG0)));
                                final SubLObject v_bindings = inference_kernel.new_cyc_query(simplifier.conjoin(list(dummy_formula, binding), UNPROVIDED), $$InferencePSC, $list80).first();
                                suggested_test = bindings.apply_bindings(v_bindings, dummy_formula);
                            } finally {
                                $with_timeout_nesting_depth$.rebind(_prev_bind_0_$23, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$24 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                with_timeout_stop_timer(timer);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                            }
                        }
                    } finally {
                        $within_with_timeout$.rebind(_prev_bind_0_$22, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    timed_out_1P = Errors.handleThrowable(ccatch_env_var, tag);
                } finally {
                    thread.throwStack.pop();
                }
                if (NIL != timed_out_1P) {
                    return dummy_formula;
                }
                if (NIL != pph_templates.gen_template_constraint_passesP_internal(assertions_high.gaf_arg2(assertion), suggested_test, NIL)) {
                    return suggested_test;
                }
                return dummy_formula;
            } else {
                final SubLObject tag = with_timeout_make_tag();
                try {
                    thread.throwStack.push(tag);
                    final SubLObject _prev_bind_0_$25 = $within_with_timeout$.currentBinding(thread);
                    try {
                        $within_with_timeout$.bind(T, thread);
                        SubLObject timer = NIL;
                        try {
                            final SubLObject _prev_bind_0_$26 = $with_timeout_nesting_depth$.currentBinding(thread);
                            try {
                                $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                timer = with_timeout_start_timer(TWO_INTEGER, tag);
                                SubLObject current;
                                final SubLObject datum = current = assertions_high.gaf_args(assertion);
                                SubLObject pred = NIL;
                                SubLObject recipe2 = NIL;
                                destructuring_bind_must_consp(current, datum, $list81);
                                pred = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list81);
                                recipe2 = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    final SubLObject dummy_formula_$27 = pph_utilities.pph_dummy_formula(pred, UNPROVIDED);
                                    final SubLObject binding2 = second(cycl_utilities.expression_find(pph_functions.bestbindingsphrasefn(), recipe2, T, symbol_function(EQL), symbol_function(FORMULA_ARG0)));
                                    final SubLObject v_bindings2 = inference_kernel.new_cyc_query(simplifier.conjoin(list(dummy_formula_$27, binding2), UNPROVIDED), $$InferencePSC, $list80).first();
                                    suggested_test = bindings.apply_bindings(v_bindings2, dummy_formula_$27);
                                    SubLObject remaining_bindings = NIL;
                                    final SubLObject tag_$28 = with_timeout_make_tag();
                                    try {
                                        thread.throwStack.push(tag_$28);
                                        final SubLObject _prev_bind_0_$27 = $within_with_timeout$.currentBinding(thread);
                                        try {
                                            $within_with_timeout$.bind(T, thread);
                                            SubLObject timer_$30 = NIL;
                                            try {
                                                final SubLObject _prev_bind_0_$28 = $with_timeout_nesting_depth$.currentBinding(thread);
                                                try {
                                                    $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                    timer_$30 = with_timeout_start_timer(TWO_INTEGER, tag_$28);
                                                    remaining_bindings = inference_kernel.new_cyc_query(suggested_test, $$InferencePSC, $list80).first();
                                                } finally {
                                                    $with_timeout_nesting_depth$.rebind(_prev_bind_0_$28, thread);
                                                }
                                            } finally {
                                                final SubLObject _prev_bind_0_$29 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values2 = getValuesAsVector();
                                                    with_timeout_stop_timer(timer_$30);
                                                    restoreValuesFromVector(_values2);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$29, thread);
                                                }
                                            }
                                        } finally {
                                            $within_with_timeout$.rebind(_prev_bind_0_$27, thread);
                                        }
                                    } catch (final Throwable ccatch_env_var2) {
                                        timed_out_2P = Errors.handleThrowable(ccatch_env_var2, tag_$28);
                                    } finally {
                                        thread.throwStack.pop();
                                    }
                                    if (NIL != remaining_bindings) {
                                        return bindings.apply_bindings(remaining_bindings, suggested_test);
                                    }
                                    return suggested_test;
                                } else {
                                    cdestructuring_bind_error(datum, $list81);
                                }
                            } finally {
                                $with_timeout_nesting_depth$.rebind(_prev_bind_0_$26, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$30 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values3 = getValuesAsVector();
                                with_timeout_stop_timer(timer);
                                restoreValuesFromVector(_values3);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                            }
                        }
                    } finally {
                        $within_with_timeout$.rebind(_prev_bind_0_$25, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    timed_out_1P = Errors.handleThrowable(ccatch_env_var, tag);
                } finally {
                    thread.throwStack.pop();
                }
            }
        } finally {
            wff_vars.$permit_keyword_variablesP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject default_test_gen_template_with_best_bindings_phrase_batch(final SubLObject assertion, final SubLObject number) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject timed_out_1P = NIL;
        SubLObject timed_out_2P = NIL;
        SubLObject suggested_tests = NIL;
        SubLObject tests = NIL;
        final SubLObject _prev_bind_0 = wff_vars.$permit_keyword_variablesP$.currentBinding(thread);
        try {
            wff_vars.$permit_keyword_variablesP$.bind(T, thread);
            final SubLObject dummy_formula = pph_utilities.pph_dummy_formula(assertions_high.gaf_arg1(assertion), UNPROVIDED);
            if (assertions_high.gaf_arg0(assertion).eql($$genTemplate_Constrained)) {
                final SubLObject tag = with_timeout_make_tag();
                try {
                    thread.throwStack.push(tag);
                    final SubLObject _prev_bind_0_$34 = $within_with_timeout$.currentBinding(thread);
                    try {
                        $within_with_timeout$.bind(T, thread);
                        SubLObject timer = NIL;
                        try {
                            final SubLObject _prev_bind_0_$35 = $with_timeout_nesting_depth$.currentBinding(thread);
                            try {
                                $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                timer = with_timeout_start_timer(TWENTY_INTEGER, tag);
                                final SubLObject recipe = assertions_high.gaf_arg3(assertion);
                                final SubLObject binding = second(cycl_utilities.expression_find(pph_functions.bestbindingsphrasefn(), recipe, T, symbol_function(EQL), symbol_function(FORMULA_ARG0)));
                                SubLObject cdolist_list_var;
                                final SubLObject v_bindings = cdolist_list_var = inference_kernel.new_cyc_query(simplifier.conjoin(list(dummy_formula, binding), UNPROVIDED), $$InferencePSC, listS($MAX_NUMBER, number, $list77));
                                SubLObject binding_$36 = NIL;
                                binding_$36 = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    suggested_tests = append(suggested_tests, list(bindings.apply_bindings(binding_$36, dummy_formula)));
                                    cdolist_list_var = cdolist_list_var.rest();
                                    binding_$36 = cdolist_list_var.first();
                                } 
                                SubLObject cdolist_list_var2 = suggested_tests;
                                SubLObject suggested_test = NIL;
                                suggested_test = cdolist_list_var2.first();
                                while (NIL != cdolist_list_var2) {
                                    if (NIL != timed_out_1P) {
                                        Errors.warn($$$Query_timed_out);
                                    } else
                                        if (NIL != pph_templates.gen_template_constraint_passesP_internal(assertions_high.gaf_arg2(assertion), suggested_test, NIL)) {
                                            tests = append(tests, list(suggested_test));
                                        } else {
                                            Errors.warn($$$Something_went_wrong);
                                        }

                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    suggested_test = cdolist_list_var2.first();
                                } 
                            } finally {
                                $with_timeout_nesting_depth$.rebind(_prev_bind_0_$35, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$36 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                with_timeout_stop_timer(timer);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$36, thread);
                            }
                        }
                    } finally {
                        $within_with_timeout$.rebind(_prev_bind_0_$34, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    timed_out_1P = Errors.handleThrowable(ccatch_env_var, tag);
                } finally {
                    thread.throwStack.pop();
                }
            } else {
                final SubLObject tag = with_timeout_make_tag();
                try {
                    thread.throwStack.push(tag);
                    final SubLObject _prev_bind_0_$37 = $within_with_timeout$.currentBinding(thread);
                    try {
                        $within_with_timeout$.bind(T, thread);
                        SubLObject timer = NIL;
                        try {
                            final SubLObject _prev_bind_0_$38 = $with_timeout_nesting_depth$.currentBinding(thread);
                            try {
                                $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                timer = with_timeout_start_timer(TWENTY_INTEGER, tag);
                                SubLObject current;
                                final SubLObject datum = current = assertions_high.gaf_args(assertion);
                                SubLObject pred = NIL;
                                SubLObject recipe2 = NIL;
                                destructuring_bind_must_consp(current, datum, $list81);
                                pred = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list81);
                                recipe2 = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    final SubLObject dummy_formula_$40 = pph_utilities.pph_dummy_formula(pred, UNPROVIDED);
                                    final SubLObject binding2 = second(cycl_utilities.expression_find(pph_functions.bestbindingsphrasefn(), recipe2, T, symbol_function(EQL), symbol_function(FORMULA_ARG0)));
                                    SubLObject cdolist_list_var3;
                                    final SubLObject v_bindings2 = cdolist_list_var3 = inference_kernel.new_cyc_query(simplifier.conjoin(list(dummy_formula_$40, binding2), UNPROVIDED), $$InferencePSC, listS($MAX_NUMBER, number, $list77));
                                    SubLObject binding_$37 = NIL;
                                    binding_$37 = cdolist_list_var3.first();
                                    while (NIL != cdolist_list_var3) {
                                        suggested_tests = append(suggested_tests, list(bindings.apply_bindings(binding_$37, dummy_formula_$40)));
                                        cdolist_list_var3 = cdolist_list_var3.rest();
                                        binding_$37 = cdolist_list_var3.first();
                                    } 
                                    SubLObject cdolist_list_var4 = suggested_tests;
                                    SubLObject suggested_test2 = NIL;
                                    suggested_test2 = cdolist_list_var4.first();
                                    while (NIL != cdolist_list_var4) {
                                        SubLObject remaining_bindings = NIL;
                                        final SubLObject tag_$42 = with_timeout_make_tag();
                                        try {
                                            thread.throwStack.push(tag_$42);
                                            final SubLObject _prev_bind_0_$39 = $within_with_timeout$.currentBinding(thread);
                                            try {
                                                $within_with_timeout$.bind(T, thread);
                                                SubLObject timer_$44 = NIL;
                                                try {
                                                    final SubLObject _prev_bind_0_$40 = $with_timeout_nesting_depth$.currentBinding(thread);
                                                    try {
                                                        $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                        timer_$44 = with_timeout_start_timer(TWENTY_INTEGER, tag_$42);
                                                        remaining_bindings = inference_kernel.new_cyc_query(suggested_test2, $$InferencePSC, listS($MAX_NUMBER, number, $list77));
                                                    } finally {
                                                        $with_timeout_nesting_depth$.rebind(_prev_bind_0_$40, thread);
                                                    }
                                                } finally {
                                                    final SubLObject _prev_bind_0_$41 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        final SubLObject _values2 = getValuesAsVector();
                                                        with_timeout_stop_timer(timer_$44);
                                                        restoreValuesFromVector(_values2);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$41, thread);
                                                    }
                                                }
                                            } finally {
                                                $within_with_timeout$.rebind(_prev_bind_0_$39, thread);
                                            }
                                        } catch (final Throwable ccatch_env_var2) {
                                            timed_out_2P = Errors.handleThrowable(ccatch_env_var2, tag_$42);
                                        } finally {
                                            thread.throwStack.pop();
                                        }
                                        if (NIL != remaining_bindings) {
                                            SubLObject cdolist_list_var_$47 = remaining_bindings;
                                            SubLObject remaining_binding = NIL;
                                            remaining_binding = cdolist_list_var_$47.first();
                                            while (NIL != cdolist_list_var_$47) {
                                                tests = append(tests, list(bindings.apply_bindings(remaining_binding, suggested_test2)));
                                                cdolist_list_var_$47 = cdolist_list_var_$47.rest();
                                                remaining_binding = cdolist_list_var_$47.first();
                                            } 
                                        } else {
                                            tests = append(tests, list(suggested_test2));
                                        }
                                        cdolist_list_var4 = cdolist_list_var4.rest();
                                        suggested_test2 = cdolist_list_var4.first();
                                    } 
                                } else {
                                    cdestructuring_bind_error(datum, $list81);
                                }
                            } finally {
                                $with_timeout_nesting_depth$.rebind(_prev_bind_0_$38, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$42 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values3 = getValuesAsVector();
                                with_timeout_stop_timer(timer);
                                restoreValuesFromVector(_values3);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$42, thread);
                            }
                        }
                    } finally {
                        $within_with_timeout$.rebind(_prev_bind_0_$37, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    timed_out_1P = Errors.handleThrowable(ccatch_env_var, tag);
                } finally {
                    thread.throwStack.pop();
                }
            }
            return tests;
        } finally {
            wff_vars.$permit_keyword_variablesP$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject default_test_gen_template_query_sentence(final SubLObject assertion, SubLObject batch_size) {
        if (batch_size == UNPROVIDED) {
            batch_size = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject timed_outP = NIL;
        final SubLObject _prev_bind_0 = wff_vars.$permit_keyword_variablesP$.currentBinding(thread);
        try {
            wff_vars.$permit_keyword_variablesP$.bind(T, thread);
            final SubLObject max_number = (NIL != batch_size) ? batch_size : ONE_INTEGER;
            SubLObject sentences = NIL;
            SubLObject current;
            final SubLObject datum = current = assertions_high.gaf_args(assertion);
            SubLObject template = NIL;
            SubLObject recipe = NIL;
            destructuring_bind_must_consp(current, datum, $list82);
            template = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list82);
            recipe = current.first();
            current = current.rest();
            if (NIL == current) {
                template = cycl_utilities.naut_substitute(template);
                final SubLObject bindings_phrase = cycl_utilities.expression_find(pph_functions.bestbindingsphrasefn(), recipe, T, symbol_function(EQL), symbol_function(FORMULA_ARG0));
                final SubLObject binding_q = (NIL != bindings_phrase) ? cycl_utilities.nat_arg1(bindings_phrase, UNPROVIDED) : NIL;
                final SubLObject query_sentence = (NIL != binding_q) ? simplifier.conjoin(list(binding_q, template), UNPROVIDED) : template;
                final SubLObject max_time = (NIL != binding_q) ? EIGHT_INTEGER : ONE_INTEGER;
                SubLObject cdolist_list_var = inference_kernel.new_cyc_query(query_sentence, $$InferencePSC, list($MAX_NUMBER, max_number, $MAX_TIME, max_time, $ANSWER_LANGUAGE, $EL));
                SubLObject v_bindings = NIL;
                v_bindings = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    sentences = cons(bindings.apply_bindings(remove_if($sym83$EL_VAR_, v_bindings, VARIABLE_BINDING_VARIABLE, UNPROVIDED, UNPROVIDED, UNPROVIDED), template), sentences);
                    cdolist_list_var = cdolist_list_var.rest();
                    v_bindings = cdolist_list_var.first();
                } 
                if (NIL != list_utilities.empty_list_p(sentences)) {
                    sentences = cons(template, sentences);
                }
            } else {
                cdestructuring_bind_error(datum, $list82);
            }
            return NIL != batch_size ? delete_duplicates(sentences, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED) : sentences.first();
        } finally {
            wff_vars.$permit_keyword_variablesP$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject default_test_gen_template_formula_for_reln(final SubLObject reln) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = $$InferencePSC;
        final SubLObject var = variables.get_variable(ZERO_INTEGER);
        SubLObject cdolist_list_var;
        final SubLObject examples = cdolist_list_var = backward.removal_ask_hl_variable(var, list($$exampleSentences, reln, var), mt, $TRUE, $list90);
        SubLObject example = NIL;
        example = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject elf = cycl_utilities.hl_to_el(example);
            if (NIL != formula_okay_for_gen_template_testP(elf, reln)) {
                return elf;
            }
            cdolist_list_var = cdolist_list_var.rest();
            example = cdolist_list_var.first();
        } 
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(reln)) {
                final SubLObject str = NIL;
                final SubLObject _prev_bind_0_$49 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$50 = $progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_2_$51 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
                try {
                    $progress_start_time$.bind(get_universal_time(), thread);
                    $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                    $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    $progress_notification_count$.bind(ZERO_INTEGER, thread);
                    $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                    $progress_count$.bind(ZERO_INTEGER, thread);
                    $is_noting_progressP$.bind(T, thread);
                    $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                    noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(reln);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            note_progress();
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                SubLObject done_var_$52 = NIL;
                                final SubLObject token_var_$53 = NIL;
                                while (NIL == done_var_$52) {
                                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$53);
                                    final SubLObject valid_$54 = makeBoolean(!token_var_$53.eql(gaf));
                                    if (NIL != valid_$54) {
                                        final SubLObject elf2 = cycl_utilities.hl_to_el(assertions_high.gaf_el_formula(gaf));
                                        if (NIL != formula_okay_for_gen_template_testP(elf2, reln)) {
                                            return elf2;
                                        }
                                    }
                                    done_var_$52 = makeBoolean(NIL == valid_$54);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$50 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$50, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                    noting_progress_postamble();
                } finally {
                    $silent_progressP$.rebind(_prev_bind_8, thread);
                    $is_noting_progressP$.rebind(_prev_bind_7, thread);
                    $progress_count$.rebind(_prev_bind_6, thread);
                    $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    $progress_notification_count$.rebind(_prev_bind_4, thread);
                    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$51, thread);
                    $progress_last_pacification_time$.rebind(_prev_bind_1_$50, thread);
                    $progress_start_time$.rebind(_prev_bind_0_$49, thread);
                }
            }
            if (NIL != kb_mapping_macros.do_function_extent_index_key_validator(reln)) {
                final SubLObject final_index_spec2 = kb_mapping_macros.function_extent_final_index_spec(reln);
                SubLObject final_index_iterator2 = NIL;
                try {
                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, NIL, NIL);
                    SubLObject done_var2 = NIL;
                    final SubLObject token_var2 = NIL;
                    while (NIL == done_var2) {
                        final SubLObject tou = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var2);
                        final SubLObject valid2 = makeBoolean(!token_var2.eql(tou));
                        if (NIL != valid2) {
                            final SubLObject nart = assertions_high.gaf_arg1(tou);
                            final SubLObject elf3 = narts_high.nart_el_formula(nart);
                            if (NIL != formula_okay_for_gen_template_testP(elf3, reln)) {
                                return elf3;
                            }
                        }
                        done_var2 = makeBoolean(NIL == valid2);
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$51 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        if (NIL != final_index_iterator2) {
                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                        }
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$51, thread);
                    }
                }
            }
            return cycl_utilities.hl_to_el(pph_utilities.pph_dummy_formula(reln, T));
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject default_test_gen_template_formulas_for_reln(final SubLObject reln, final SubLObject number) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject timed_outP = NIL;
        final SubLObject _prev_bind_0 = wff_vars.$permit_keyword_variablesP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $current_test_gen_template_reln$.currentBinding(thread);
        try {
            wff_vars.$permit_keyword_variablesP$.bind(T, thread);
            $current_test_gen_template_reln$.bind(reln, thread);
            final SubLObject dummy_formula = pph_utilities.pph_dummy_formula(reln, UNPROVIDED);
            final SubLObject predicateP = fort_types_interface.isa_predicateP(reln, UNPROVIDED);
            final SubLObject query_sentence = (NIL != predicateP) ? dummy_formula : list($$denotes, $list93, dummy_formula);
            final SubLObject template = (NIL != predicateP) ? dummy_formula : $sym94$_FORMULA;
            SubLObject formulas = NIL;
            final SubLObject tag = with_timeout_make_tag();
            try {
                thread.throwStack.push(tag);
                final SubLObject _prev_bind_0_$57 = $within_with_timeout$.currentBinding(thread);
                try {
                    $within_with_timeout$.bind(T, thread);
                    SubLObject timer = NIL;
                    try {
                        final SubLObject _prev_bind_0_$58 = $with_timeout_nesting_depth$.currentBinding(thread);
                        try {
                            $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                            timer = with_timeout_start_timer(TWENTY_INTEGER, tag);
                            final SubLObject items_var = ask_utilities.query_template(template, query_sentence, $$InferencePSC, listS($MAX_NUMBER, number, $list95));
                            if (items_var.isVector()) {
                                final SubLObject vector_var = items_var;
                                final SubLObject backwardP_var = NIL;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject element_num;
                                SubLObject item;
                                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                    item = aref(vector_var, element_num);
                                    formulas = cons(item, formulas);
                                }
                            } else {
                                SubLObject cdolist_list_var = items_var;
                                SubLObject item2 = NIL;
                                item2 = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    formulas = cons(item2, formulas);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    item2 = cdolist_list_var.first();
                                } 
                            }
                        } finally {
                            $with_timeout_nesting_depth$.rebind(_prev_bind_0_$58, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$59 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            with_timeout_stop_timer(timer);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$59, thread);
                        }
                    }
                } finally {
                    $within_with_timeout$.rebind(_prev_bind_0_$57, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
            } finally {
                thread.throwStack.pop();
            }
            if (NIL != timed_outP) {
                Errors.warn($$$Query_timed_out);
            }
            if (NIL != list_utilities.empty_list_p(formulas)) {
                formulas = cons(dummy_formula, formulas);
            }
            return list_utilities.remove_if_not($sym96$FORMULA_OKAY_FOR_GEN_TEMPLATE_TEST_, formulas, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            $current_test_gen_template_reln$.rebind(_prev_bind_2, thread);
            wff_vars.$permit_keyword_variablesP$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject gather_batch_paraphrase_formulas(final SubLObject assertion, final SubLObject number) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject gen_template_pred = assertions_high.gaf_arg0(assertion);
        if (gen_template_pred.eql($$genTemplate_Constrained)) {
            final SubLObject formula = assertions_high.gaf_arg3(assertion);
            if (NIL != cycl_utilities.expression_find(pph_functions.bestbindingsphrasefn(), formula, T, symbol_function(EQL), symbol_function(FORMULA_ARG0))) {
                return default_test_gen_template_with_best_bindings_phrase_batch(assertion, number);
            }
            return default_test_gen_template_constrained_batch(assertion, number);
        } else {
            if (gen_template_pred.eql($$genTemplate_QuerySentence)) {
                return default_test_gen_template_query_sentence(assertion, number);
            }
            final SubLObject formula = assertions_high.gaf_arg2(assertion);
            if (NIL != cycl_utilities.expression_find(pph_functions.bestbindingsphrasefn(), formula, T, symbol_function(EQL), symbol_function(FORMULA_ARG0))) {
                return default_test_gen_template_with_best_bindings_phrase_batch(assertion, number);
            }
            final SubLObject _prev_bind_0 = $current_test_gen_template_reln$.currentBinding(thread);
            try {
                $current_test_gen_template_reln$.bind(assertions_high.gaf_arg(assertion, lexicon_utilities.denotatum_arg_of_pred_cached(gen_template_pred)), thread);
                return default_test_gen_template_formulas_for_reln($current_test_gen_template_reln$.getDynamicValue(thread), number);
            } finally {
                $current_test_gen_template_reln$.rebind(_prev_bind_0, thread);
            }
        }
    }

    public static SubLObject output_batch_paraphrase_results(final SubLObject tests, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            SubLObject bgcolor = NIL;
            SubLObject err_msg = NIL;
            SubLObject v_pph_phrase = NIL;
            SubLObject color_toggle = NIL;
            SubLObject list_var = NIL;
            SubLObject test = NIL;
            SubLObject i = NIL;
            list_var = tests;
            test = list_var.first();
            for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , test = list_var.first() , i = add(ONE_INTEGER, i)) {
                if (NIL != color_toggle) {
                    color_toggle = NIL;
                } else {
                    color_toggle = T;
                }
                bgcolor = (NIL != color_toggle) ? html_macros.$html_color_lightest_grey$.getGlobalValue() : html_macros.$html_color_white$.getGlobalValue();
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0_$60 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            final SubLObject old_grace_period = delayed_processor.delayed_processor_get_delay_seconds(pph_phrase.pph_phrase_destroyer());
                            pph_phrase.set_pph_phrase_destruction_grace_period(max(old_grace_period, $int$300));
                            final SubLObject _prev_bind_0_$61 = pph_vars.$bypass_pph_phrase_destroyerP$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = pph_macros.$new_pph_phrases$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
                            try {
                                pph_vars.$bypass_pph_phrase_destroyerP$.bind(NIL, thread);
                                pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
                                pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
                                pph_macros.$destroy_new_pph_phrasesP$.bind(T, thread);
                                try {
                                    final SubLObject force = $DECLARATIVE;
                                    final SubLObject _prev_bind_0_$62 = pph_vars.$pph_problem_reporting_mode$.currentBinding(thread);
                                    try {
                                        pph_vars.$pph_problem_reporting_mode$.bind(NIL != pph_vars.pph_problem_reporting_on_p() ? pph_vars.$pph_problem_reporting_mode$.getDynamicValue(thread) : $QUIET, thread);
                                        v_pph_phrase = pph_methods_formulas.new_pph_phrase_for_formula_and_gen_template_assertion(test, assertion, force);
                                    } finally {
                                        pph_vars.$pph_problem_reporting_mode$.rebind(_prev_bind_0_$62, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$63 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        pph_macros.destroy_new_pph_phrases();
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$63, thread);
                                    }
                                }
                            } finally {
                                pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_4, thread);
                                pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_3, thread);
                                pph_macros.$new_pph_phrases$.rebind(_prev_bind_2, thread);
                                pph_vars.$bypass_pph_phrase_destroyerP$.rebind(_prev_bind_0_$61, thread);
                            }
                            pph_phrase.set_pph_phrase_destruction_grace_period(old_grace_period);
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$60, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    err_msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
                if ((NIL == err_msg) && (NIL == pph_phrase.pph_phrase_p(v_pph_phrase, UNPROVIDED))) {
                    err_msg = $str55$Couldn_t_paraphrase_formula_with_;
                }
                final SubLObject base_style = $str97$padding_top_5px__padding_bottom_5;
                final SubLObject num_style = cconcatenate(base_style, $str98$__min_width_2em__padding_right_0_);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                if (NIL != bgcolor) {
                    html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(bgcolor);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$64 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($RIGHT));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$65 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_div_style$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(num_style);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$66 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str101$_D_, number_utilities.f_1X(i));
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$66, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$65, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$67 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_div_style$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(base_style);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$68 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            if (NIL != v_pph_phrase) {
                                cb_form(v_pph_phrase, UNPROVIDED, UNPROVIDED);
                            } else
                                if (NIL != err_msg) {
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
                                        html_princ_strong(err_msg);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$69, thread);
                                    }
                                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                }

                            html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$70 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_font_head$.getGlobalValue());
                                html_markup(html_macros.$html_font_size$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(TWO_INTEGER);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$71 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cb_form(test, ZERO_INTEGER, T);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$71, thread);
                                }
                                html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$70, thread);
                            }
                            html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$68, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$67, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$64, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_test_gen_template_jira_link(SubLObject phrase, SubLObject assertion, SubLObject formula) {
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        if (assertion == UNPROVIDED) {
            assertion = NIL;
        }
        if (formula == UNPROVIDED) {
            formula = NIL;
        }
        return funcall(makeSymbol("CB-JIRA-LINK"), create_test_gen_template_jira_issue_url(phrase, assertion, formula));
    }

    public static SubLObject create_test_gen_template_jira_issue_url(SubLObject phrase, SubLObject assertion, SubLObject formula) {
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        if (assertion == UNPROVIDED) {
            assertion = NIL;
        }
        if (formula == UNPROVIDED) {
            formula = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject summary = create_test_gen_template_issue_description(phrase, assertion, formula);
        final SubLObject description = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return funcall(makeSymbol("CREATE-JIRA-ISSUE-URL"), summary, description, $list102);
    }

    public static SubLObject create_test_gen_template_issue_description(SubLObject phrase, SubLObject assertion, SubLObject formula) {
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        if (assertion == UNPROVIDED) {
            assertion = NIL;
        }
        if (formula == UNPROVIDED) {
            formula = NIL;
        }
        SubLObject summary = NIL;
        SubLObject description = NIL;
        SubLObject s = NIL;
        try {
            s = make_private_string_output_stream();
            format(s, $str103$Problem_with_genTemplate_paraphra);
            if (NIL != assertion) {
                format(s, $str104$_for__A, misc_kb_utilities.coerce_name(assertions_high.gaf_arg1(assertion)));
            }
            summary = get_output_stream_string(s);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close(s, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        s = NIL;
        try {
            s = make_private_string_output_stream();
            if (NIL != phrase) {
                format(s, $str105$Result____A, pph_string.pph_string_to_output_format(pph_phrase.pph_phrase_string(phrase, UNPROVIDED), $HTML));
            }
            if (NIL != assertion) {
                format(s, $str107$____Generation_Assertion____A, format_cycl_expression.get_pretty_formatted_string(assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED));
            }
            if (NIL != formula) {
                format(s, $str108$____Test_Formula____A, format_cycl_expression.get_pretty_formatted_string(formula, UNPROVIDED, UNPROVIDED));
            }
            description = get_output_stream_string(s);
        } finally {
            final SubLObject _prev_bind_2 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values2 = getValuesAsVector();
                close(s, UNPROVIDED);
                restoreValuesFromVector(_values2);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_2);
            }
        }
        return values(summary, description);
    }

    public static SubLObject declare_cb_pph_tools_file() {
        declareFunction(me, "cb_link_test_gen_template", "CB-LINK-TEST-GEN-TEMPLATE", 1, 2, false);
        declareFunction(me, "cb_test_gen_template", "CB-TEST-GEN-TEMPLATE", 1, 0, false);
        declareFunction(me, "cb_handle_test_gen_template", "CB-HANDLE-TEST-GEN-TEMPLATE", 1, 0, false);
        declareFunction(me, "cb_test_gen_template_int", "CB-TEST-GEN-TEMPLATE-INT", 1, 3, false);
        declareFunction(me, "cb_test_gen_template_batch_int", "CB-TEST-GEN-TEMPLATE-BATCH-INT", 2, 0, false);
        declareFunction(me, "cb_test_button", "CB-TEST-BUTTON", 1, 0, false);
        declareFunction(me, "gen_template_test_phrase", "GEN-TEMPLATE-TEST-PHRASE", 3, 0, false);
        declareFunction(me, "validate_gen_template_test_formula", "VALIDATE-GEN-TEMPLATE-TEST-FORMULA", 3, 0, false);
        declareFunction(me, "default_force_for_gen_template_assertion", "DEFAULT-FORCE-FOR-GEN-TEMPLATE-ASSERTION", 1, 0, false);
        declareFunction(me, "cb_batch_button", "CB-BATCH-BUTTON", 1, 0, false);
        declareFunction(me, "formula_okay_for_gen_template_testP", "FORMULA-OKAY-FOR-GEN-TEMPLATE-TEST?", 1, 1, false);
        declareFunction(me, "default_test_formula_for_gen_template", "DEFAULT-TEST-FORMULA-FOR-GEN-TEMPLATE", 1, 0, false);
        declareFunction(me, "default_test_gen_template_constrained", "DEFAULT-TEST-GEN-TEMPLATE-CONSTRAINED", 2, 0, false);
        declareFunction(me, "default_test_gen_template_constrained_batch", "DEFAULT-TEST-GEN-TEMPLATE-CONSTRAINED-BATCH", 2, 0, false);
        declareFunction(me, "default_test_gen_template_with_best_bindings_phrase", "DEFAULT-TEST-GEN-TEMPLATE-WITH-BEST-BINDINGS-PHRASE", 1, 0, false);
        declareFunction(me, "default_test_gen_template_with_best_bindings_phrase_batch", "DEFAULT-TEST-GEN-TEMPLATE-WITH-BEST-BINDINGS-PHRASE-BATCH", 2, 0, false);
        declareFunction(me, "default_test_gen_template_query_sentence", "DEFAULT-TEST-GEN-TEMPLATE-QUERY-SENTENCE", 1, 1, false);
        declareFunction(me, "default_test_gen_template_formula_for_reln", "DEFAULT-TEST-GEN-TEMPLATE-FORMULA-FOR-RELN", 1, 0, false);
        declareFunction(me, "default_test_gen_template_formulas_for_reln", "DEFAULT-TEST-GEN-TEMPLATE-FORMULAS-FOR-RELN", 2, 0, false);
        declareFunction(me, "gather_batch_paraphrase_formulas", "GATHER-BATCH-PARAPHRASE-FORMULAS", 2, 0, false);
        declareFunction(me, "output_batch_paraphrase_results", "OUTPUT-BATCH-PARAPHRASE-RESULTS", 2, 0, false);
        declareFunction(me, "cb_test_gen_template_jira_link", "CB-TEST-GEN-TEMPLATE-JIRA-LINK", 0, 3, false);
        declareFunction(me, "create_test_gen_template_jira_issue_url", "CREATE-TEST-GEN-TEMPLATE-JIRA-ISSUE-URL", 0, 3, false);
        declareFunction(me, "create_test_gen_template_issue_description", "CREATE-TEST-GEN-TEMPLATE-ISSUE-DESCRIPTION", 0, 3, false);
        return NIL;
    }

    public static SubLObject init_cb_pph_tools_file() {
        deflexical("*TEST-CURRENT-FORMULA*", $$$Test_Current_Formula);
        deflexical("*BATCH-TEST*", $$$Batch_Test);
        defparameter("*CURRENT-TEST-GEN-TEMPLATE-RELN*", misc_utilities.uninitialized());
        return NIL;
    }

    public static SubLObject setup_cb_pph_tools_file() {
        setup_cb_link_method($TEST_GEN_TEMPLATE, CB_LINK_TEST_GEN_TEMPLATE, THREE_INTEGER);
        html_macros.note_cgi_handler_function(CB_TEST_GEN_TEMPLATE, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_HANDLE_TEST_GEN_TEMPLATE, $HTML_HANDLER);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_pph_tools_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_pph_tools_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_pph_tools_file();
    }

    static {

















































































































    }
}

/**
 * Total time: 1164 ms
 */
