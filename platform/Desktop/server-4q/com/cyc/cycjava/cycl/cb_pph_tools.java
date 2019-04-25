package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_pph_tools extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cb_pph_tools";
    public static final String myFingerPrint = "8ea34399b1dd473e5ea054f3cec44d967a907d5a87c63957a0ea809793754a50";
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-tools.lisp", position = 1455L)
    private static SubLSymbol $test_current_formula$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-tools.lisp", position = 1600L)
    private static SubLSymbol $batch_test$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-tools.lisp", position = 8410L)
    private static SubLSymbol $current_test_gen_template_reln$;
    private static final SubLString $str0$_Test_Paraphrase_;
    private static final SubLSymbol $kw1$SELF;
    private static final SubLString $str2$cb_test_gen_template__A;
    private static final SubLSymbol $kw3$TEST_GEN_TEMPLATE;
    private static final SubLSymbol $sym4$CB_LINK_TEST_GEN_TEMPLATE;
    private static final SubLList $list5;
    private static final SubLString $str6$_S_did_not_specify_an_assertion_;
    private static final SubLSymbol $sym7$CB_TEST_GEN_TEMPLATE;
    private static final SubLSymbol $kw8$HTML_HANDLER;
    private static final SubLString $str9$batch;
    private static final SubLSymbol $sym10$CB_HANDLE_TEST_GEN_TEMPLATE;
    private static final SubLString $str11$Test_Current_Formula;
    private static final SubLString $str12$Batch_Test;
    private static final SubLString $str13$Test_Paraphrase_Template;
    private static final SubLString $str14$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str15$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw16$UNINITIALIZED;
    private static final SubLSymbol $kw17$CB_CYC;
    private static final SubLString $str18$yui_skin_sam;
    private static final SubLString $str19$post;
    private static final SubLString $str20$id;
    private static final SubLString $str21$Reset_All_Fields;
    private static final SubLString $str22$Back;
    private static final SubLString $str23$test;
    private static final SubLString $str24$batch_size;
    private static final SubLInteger $int25$25;
    private static final SubLInteger $int26$50;
    private static final SubLInteger $int27$100;
    private static final SubLInteger $int28$250;
    private static final SubLInteger $int29$500;
    private static final SubLObject $const30$genTemplate_QuerySentence;
    private static final SubLString $str31$Sentential_Force_;
    private static final SubLString $str32$force;
    private static final SubLList $list33;
    private static final SubLSymbol $kw34$QUERY;
    private static final SubLSymbol $kw35$ASSERT;
    private static final SubLSymbol $kw36$INPUT_NAME;
    private static final SubLString $str37$formula;
    private static final SubLSymbol $kw38$PRETTY_NAME;
    private static final SubLString $str39$Formula;
    private static final SubLSymbol $kw40$COMPLETE_LABEL;
    private static final SubLString $str41$Complete;
    private static final SubLSymbol $kw42$CYCLIFY_LABEL;
    private static final SubLString $str43$Cyclify;
    private static final SubLSymbol $kw44$CLEAR_LABEL;
    private static final SubLString $str45$Clear;
    private static final SubLSymbol $kw46$HEIGHT;
    private static final SubLSymbol $kw47$WIDTH;
    private static final SubLInteger $int48$80;
    private static final SubLSymbol $kw49$MODE;
    private static final SubLSymbol $kw50$RED;
    private static final SubLString $str51$_br_;
    private static final SubLString $str52$Result_;
    private static final SubLString $str53$Test_Paraphrase_Template___Batch;
    private static final SubLList $list54;
    private static final SubLString $str55$Couldn_t_paraphrase_formula_with_;
    private static final SubLSymbol $sym56$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $sym57$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__;
    private static final SubLList $list58;
    private static final SubLInteger $int59$300;
    private static final SubLSymbol $kw60$QUIET;
    private static final SubLSymbol $sym61$CSETQ;
    private static final SubLObject $const62$genTemplate_Constrained;
    private static final SubLString $str63$Formula_does_not_meet_this_assert;
    private static final SubLList $list64;
    private static final SubLString $str65$_S_does_not_use__S_as_the_arg0_;
    private static final SubLSymbol $kw66$INTERROGATIVE;
    private static final SubLSymbol $kw67$DECLARATIVE;
    private static final SubLSymbol $kw68$NONE;
    private static final SubLSymbol $sym69$HYPOTHETICAL_TERM_P;
    private static final SubLSymbol $sym70$SKOLEM_FORT_P;
    private static final SubLSymbol $sym71$FORMULA_ARG0;
    private static final SubLSymbol $sym72$_EXIT;
    private static final SubLList $list73;
    private static final SubLObject $const74$InferencePSC;
    private static final SubLList $list75;
    private static final SubLSymbol $kw76$MAX_NUMBER;
    private static final SubLList $list77;
    private static final SubLString $str78$Query_timed_out;
    private static final SubLString $str79$Something_went_wrong;
    private static final SubLList $list80;
    private static final SubLList $list81;
    private static final SubLList $list82;
    private static final SubLSymbol $sym83$EL_VAR_;
    private static final SubLSymbol $sym84$VARIABLE_BINDING_VARIABLE;
    private static final SubLSymbol $kw85$MAX_TIME;
    private static final SubLSymbol $kw86$ANSWER_LANGUAGE;
    private static final SubLSymbol $kw87$EL;
    private static final SubLObject $const88$exampleSentences;
    private static final SubLSymbol $kw89$TRUE;
    private static final SubLList $list90;
    private static final SubLSymbol $kw91$GAF;
    private static final SubLObject $const92$denotes;
    private static final SubLList $list93;
    private static final SubLSymbol $sym94$_FORMULA;
    private static final SubLList $list95;
    private static final SubLSymbol $sym96$FORMULA_OKAY_FOR_GEN_TEMPLATE_TEST_;
    private static final SubLString $str97$padding_top_5px__padding_bottom_5;
    private static final SubLString $str98$__min_width_2em__padding_right_0_;
    private static final SubLSymbol $kw99$RIGHT;
    private static final SubLSymbol $kw100$TOP;
    private static final SubLString $str101$_D_;
    private static final SubLList $list102;
    private static final SubLString $str103$Problem_with_genTemplate_paraphra;
    private static final SubLString $str104$_for__A;
    private static final SubLString $str105$Result____A;
    private static final SubLSymbol $kw106$HTML;
    private static final SubLString $str107$____Generation_Assertion____A;
    private static final SubLString $str108$____Test_Formula____A;
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-tools.lisp", position = 559L)
    public static SubLObject cb_link_test_gen_template(final SubLObject assertion, SubLObject verbosity, SubLObject linktext) {
        if (verbosity == cb_pph_tools.UNPROVIDED) {
            verbosity = (SubLObject)cb_pph_tools.NIL;
        }
        if (linktext == cb_pph_tools.UNPROVIDED) {
            linktext = (SubLObject)cb_pph_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_pph_tools.NIL == linktext) {
            linktext = (SubLObject)cb_pph_tools.$str0$_Test_Paraphrase_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_pph_tools.$kw1$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_tools.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_pph_tools.$str2$cb_test_gen_template__A, assertion_handles.assertion_id(assertion));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_tools.UNPROVIDED);
        if (cb_pph_tools.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_tools.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_tools.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_pph_tools.T, thread);
            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            html_utilities.html_princ(linktext);
            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_pph_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-tools.lisp", position = 938L)
    public static SubLObject cb_test_gen_template(final SubLObject args) {
        SubLObject id = (SubLObject)cb_pph_tools.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_pph_tools.$list5);
        id = args.first();
        final SubLObject current = args.rest();
        if (cb_pph_tools.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_pph_tools.$list5);
            return (SubLObject)cb_pph_tools.NIL;
        }
        final SubLObject assertion = cb_utilities.cb_guess_assertion(id);
        if (cb_pph_tools.NIL == assertion_handles.assertion_p(assertion)) {
            return cb_utilities.cb_error((SubLObject)cb_pph_tools.$str6$_S_did_not_specify_an_assertion_, args.first(), (SubLObject)cb_pph_tools.UNPROVIDED, (SubLObject)cb_pph_tools.UNPROVIDED, (SubLObject)cb_pph_tools.UNPROVIDED, (SubLObject)cb_pph_tools.UNPROVIDED);
        }
        return cb_test_gen_template_int(assertion, (SubLObject)cb_pph_tools.UNPROVIDED, (SubLObject)cb_pph_tools.UNPROVIDED, (SubLObject)cb_pph_tools.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-tools.lisp", position = 1284L)
    public static SubLObject cb_handle_test_gen_template(final SubLObject args) {
        if (cb_pph_tools.NIL != html_utilities.html_extract_input((SubLObject)cb_pph_tools.$str9$batch, args)) {
            return cb_batch_button(args);
        }
        return cb_test_button(args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-tools.lisp", position = 1647L)
    public static SubLObject cb_test_gen_template_int(final SubLObject assertion, SubLObject formula, SubLObject v_pph_phrase, SubLObject err_msg) {
        if (formula == cb_pph_tools.UNPROVIDED) {
            formula = (SubLObject)cb_pph_tools.NIL;
        }
        if (v_pph_phrase == cb_pph_tools.UNPROVIDED) {
            v_pph_phrase = (SubLObject)cb_pph_tools.NIL;
        }
        if (err_msg == cb_pph_tools.UNPROVIDED) {
            err_msg = (SubLObject)cb_pph_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title = (SubLObject)cb_pph_tools.$str13$Test_Paraphrase_Template;
        final SubLObject id = assertion_handles.assertion_id(assertion);
        final SubLObject resultsP = (SubLObject)SubLObjectFactory.makeBoolean(cb_pph_tools.NIL != v_pph_phrase || cb_pph_tools.NIL != err_msg);
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_pph_tools.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_pph_tools.UNPROVIDED, (SubLObject)cb_pph_tools.UNPROVIDED, (SubLObject)cb_pph_tools.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_pph_tools.$str14$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_pph_tools.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_pph_tools.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_pph_tools.$str15$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_pph_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_pph_tools.$kw16$UNINITIALIZED) ? ConsesLow.list(cb_pph_tools.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_pph_tools.$kw17$CB_CYC);
                html_utilities.html_source_readability_terpri((SubLObject)cb_pph_tools.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ(title);
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_complete.html_complete_script();
                dhtml_macros.dhtml_with_toggle_visibility_support();
                dhtml_macros.html_basic_cb_scripts();
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_pph_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_pph_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_tools.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_pph_tools.$str18$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_pph_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                        html_utilities.html_markup((SubLObject)cb_pph_tools.TWO_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_tools.UNPROVIDED);
                        html_utilities.html_princ(title);
                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                        html_utilities.html_markup((SubLObject)cb_pph_tools.TWO_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_tools.UNPROVIDED);
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_pph_tools.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_tools.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_tools.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_tools.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_pph_tools.$str19$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_tools.UNPROVIDED);
                        if (cb_pph_tools.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_tools.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_tools.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_pph_tools.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_pph_tools.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_pph_tools.$sym10$CB_HANDLE_TEST_GEN_TEMPLATE, (SubLObject)cb_pph_tools.T, (SubLObject)cb_pph_tools.UNPROVIDED);
                            html_utilities.html_hidden_input((SubLObject)cb_pph_tools.$str20$id, id, (SubLObject)cb_pph_tools.UNPROVIDED);
                            if (cb_pph_tools.NIL == resultsP) {
                                html_utilities.html_reset_input((SubLObject)cb_pph_tools.$str21$Reset_All_Fields);
                                html_utilities.html_indent((SubLObject)cb_pph_tools.ONE_INTEGER);
                            }
                            if (cb_pph_tools.NIL != resultsP) {
                                cb_utilities.cb_back_button((SubLObject)cb_pph_tools.$kw1$SELF, (SubLObject)cb_pph_tools.$str22$Back);
                                html_utilities.html_indent((SubLObject)cb_pph_tools.ONE_INTEGER);
                            }
                            html_utilities.html_submit_input(cb_pph_tools.$test_current_formula$.getGlobalValue(), (SubLObject)cb_pph_tools.$str23$test, (SubLObject)cb_pph_tools.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_pph_tools.ONE_INTEGER);
                            html_utilities.html_submit_input(cb_pph_tools.$batch_test$.getGlobalValue(), (SubLObject)cb_pph_tools.$str9$batch, (SubLObject)cb_pph_tools.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_pph_tools.ONE_INTEGER);
                            html_utilities.html_create_simple_dropdown_list((SubLObject)cb_pph_tools.$str24$batch_size, (SubLObject)ConsesLow.list((SubLObject)cb_pph_tools.TEN_INTEGER, (SubLObject)cb_pph_tools.$int25$25, (SubLObject)cb_pph_tools.$int26$50, (SubLObject)cb_pph_tools.$int27$100, (SubLObject)cb_pph_tools.$int28$250, (SubLObject)cb_pph_tools.$int29$500), (SubLObject)cb_pph_tools.TEN_INTEGER);
                            html_utilities.html_hr((SubLObject)cb_pph_tools.UNPROVIDED, (SubLObject)cb_pph_tools.UNPROVIDED);
                            cb_utilities.cb_form(assertion, (SubLObject)cb_pph_tools.ZERO_INTEGER, (SubLObject)cb_pph_tools.T);
                            html_utilities.html_hr((SubLObject)cb_pph_tools.UNPROVIDED, (SubLObject)cb_pph_tools.UNPROVIDED);
                            final SubLObject default_force = default_force_for_gen_template_assertion(assertion);
                            if (cb_pph_tools.NIL == fort_types_interface.isa_functionP(assertions_high.gaf_arg1(assertion), (SubLObject)cb_pph_tools.UNPROVIDED) && !assertions_high.gaf_arg0(assertion).eql(cb_pph_tools.$const30$genTemplate_QuerySentence)) {
                                html_utilities.html_princ_strong((SubLObject)cb_pph_tools.$str31$Sentential_Force_);
                                SubLObject cdolist_list_var = (SubLObject)cb_pph_tools.$list33;
                                SubLObject force = (SubLObject)cb_pph_tools.NIL;
                                force = cdolist_list_var.first();
                                while (cb_pph_tools.NIL != cdolist_list_var) {
                                    html_utilities.html_indent((SubLObject)cb_pph_tools.UNPROVIDED);
                                    html_utilities.html_radio_input((SubLObject)cb_pph_tools.$str32$force, force, Equality.eql(force, default_force), (SubLObject)cb_pph_tools.UNPROVIDED);
                                    html_utilities.html_princ(Strings.string_downcase(print_high.princ_to_string(force), (SubLObject)cb_pph_tools.UNPROVIDED, (SubLObject)cb_pph_tools.UNPROVIDED));
                                    cdolist_list_var = cdolist_list_var.rest();
                                    force = cdolist_list_var.first();
                                }
                                html_utilities.html_newline((SubLObject)cb_pph_tools.UNPROVIDED);
                            }
                            final SubLObject mode = (SubLObject)(assertions_high.gaf_arg0(assertion).eql(cb_pph_tools.$const30$genTemplate_QuerySentence) ? cb_pph_tools.$kw34$QUERY : cb_pph_tools.$kw35$ASSERT);
                            final SubLObject display_options = (SubLObject)ConsesLow.list(new SubLObject[] { cb_pph_tools.$kw36$INPUT_NAME, cb_pph_tools.$str37$formula, cb_pph_tools.$kw38$PRETTY_NAME, cb_pph_tools.$str39$Formula, cb_pph_tools.$kw40$COMPLETE_LABEL, cb_pph_tools.$str41$Complete, cb_pph_tools.$kw42$CYCLIFY_LABEL, cb_pph_tools.$str43$Cyclify, cb_pph_tools.$kw44$CLEAR_LABEL, cb_pph_tools.$str45$Clear, cb_pph_tools.$kw46$HEIGHT, cb_pph_tools.FIVE_INTEGER, cb_pph_tools.$kw47$WIDTH, cb_pph_tools.$int48$80, cb_pph_tools.$kw49$MODE, mode });
                            if (cb_pph_tools.NIL == formula) {
                                formula = default_test_formula_for_gen_template(assertion);
                            }
                            cb_form_widgets.cb_el_formula_input_section(formula, display_options);
                            if (cb_pph_tools.NIL == resultsP) {
                                thread.resetMultipleValues();
                                final SubLObject v_pph_phrase_$5 = gen_template_test_phrase(assertion, formula, default_force);
                                final SubLObject err_msg_$6 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                v_pph_phrase = v_pph_phrase_$5;
                                err_msg = err_msg_$6;
                            }
                            if (cb_pph_tools.NIL != err_msg) {
                                html_utilities.html_newline((SubLObject)cb_pph_tools.UNPROVIDED);
                                final SubLObject color_val = (SubLObject)cb_pph_tools.$kw50$RED;
                                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                if (cb_pph_tools.NIL != color_val) {
                                    html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_tools.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(color_val));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_tools.UNPROVIDED);
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_tools.UNPROVIDED);
                                final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_pph_tools.T, thread);
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_utilities.html_markup(string_utilities.string_substitute((SubLObject)cb_pph_tools.$str51$_br_, Strings.make_string((SubLObject)cb_pph_tools.ONE_INTEGER, (SubLObject)Characters.CHAR_newline), err_msg, (SubLObject)cb_pph_tools.UNPROVIDED));
                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                html_utilities.html_hr((SubLObject)cb_pph_tools.UNPROVIDED, (SubLObject)cb_pph_tools.UNPROVIDED);
                            }
                            if (cb_pph_tools.NIL != pph_phrase.pph_phrase_p(v_pph_phrase, (SubLObject)cb_pph_tools.UNPROVIDED)) {
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_pph_tools.THREE_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_tools.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_pph_tools.$str52$Result_);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_pph_tools.THREE_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_tools.UNPROVIDED);
                                cb_utilities.cb_form(v_pph_phrase, (SubLObject)cb_pph_tools.UNPROVIDED, (SubLObject)cb_pph_tools.UNPROVIDED);
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_pph_tools.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_pph_tools.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$2, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$1, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_pph_tools.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_pph_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-tools.lisp", position = 4823L)
    public static SubLObject cb_test_gen_template_batch_int(final SubLObject assertion, final SubLObject batch_size) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title = (SubLObject)cb_pph_tools.$str53$Test_Paraphrase_Template___Batch;
        final SubLObject id = assertion_handles.assertion_id(assertion);
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_pph_tools.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_pph_tools.UNPROVIDED, (SubLObject)cb_pph_tools.UNPROVIDED, (SubLObject)cb_pph_tools.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_pph_tools.$str14$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_pph_tools.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_pph_tools.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_pph_tools.$str15$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_pph_tools.UNPROVIDED);
            final SubLObject _prev_bind_0_$8 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_pph_tools.$kw16$UNINITIALIZED) ? ConsesLow.list(cb_pph_tools.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_pph_tools.$kw17$CB_CYC);
                html_utilities.html_source_readability_terpri((SubLObject)cb_pph_tools.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ(title);
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_complete.html_complete_script();
                dhtml_macros.dhtml_with_toggle_visibility_support();
                dhtml_macros.html_basic_cb_scripts();
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_pph_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$9 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_pph_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_tools.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_pph_tools.$str18$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_pph_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                        html_utilities.html_markup((SubLObject)cb_pph_tools.TWO_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_tools.UNPROVIDED);
                        html_utilities.html_princ(title);
                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                        html_utilities.html_markup((SubLObject)cb_pph_tools.TWO_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_tools.UNPROVIDED);
                        html_utilities.html_hidden_input((SubLObject)cb_pph_tools.$str20$id, id, (SubLObject)cb_pph_tools.UNPROVIDED);
                        cb_utilities.cb_back_button((SubLObject)cb_pph_tools.$kw1$SELF, (SubLObject)cb_pph_tools.$str22$Back);
                        html_utilities.html_newline((SubLObject)cb_pph_tools.UNPROVIDED);
                        html_utilities.html_hr((SubLObject)cb_pph_tools.UNPROVIDED, (SubLObject)cb_pph_tools.UNPROVIDED);
                        cb_utilities.cb_form(assertion, (SubLObject)cb_pph_tools.ZERO_INTEGER, (SubLObject)cb_pph_tools.T);
                        html_utilities.html_hr((SubLObject)cb_pph_tools.UNPROVIDED, (SubLObject)cb_pph_tools.UNPROVIDED);
                        output_batch_paraphrase_results(gather_batch_paraphrase_formulas(assertion, batch_size), assertion);
                        html_utilities.html_source_readability_terpri((SubLObject)cb_pph_tools.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_pph_tools.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$9, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$8, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_pph_tools.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_pph_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-tools.lisp", position = 5807L)
    public static SubLObject cb_test_button(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject formula = cb_form_widgets.cb_extract_el_formula_input(args, (SubLObject)cb_pph_tools.$list54);
        final SubLObject formula_error = thread.secondMultipleValue();
        final SubLObject formula_error_string = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (cb_pph_tools.NIL != formula_error) {
            return cb_form_widgets.cb_el_formula_error(formula_error, formula_error_string, (SubLObject)cb_pph_tools.UNPROVIDED);
        }
        final SubLObject id = html_utilities.html_extract_input((SubLObject)cb_pph_tools.$str20$id, args);
        final SubLObject assertion = cb_utilities.cb_guess_assertion(id);
        final SubLObject force_string = html_utilities.html_extract_input((SubLObject)cb_pph_tools.$str32$force, args);
        final SubLObject force = (cb_pph_tools.NIL != force_string) ? Symbols.make_keyword(force_string) : default_force_for_gen_template_assertion(assertion);
        thread.resetMultipleValues();
        final SubLObject v_pph_phrase = gen_template_test_phrase(assertion, formula, force);
        SubLObject err_msg = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (cb_pph_tools.NIL == err_msg && cb_pph_tools.NIL == pph_phrase.pph_phrase_p(v_pph_phrase, (SubLObject)cb_pph_tools.UNPROVIDED)) {
            err_msg = (SubLObject)cb_pph_tools.$str55$Couldn_t_paraphrase_formula_with_;
        }
        return cb_test_gen_template_int(assertion, formula, v_pph_phrase, err_msg);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-tools.lisp", position = 6640L)
    public static SubLObject gen_template_test_phrase(final SubLObject assertion, final SubLObject formula, final SubLObject force) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_pph_phrase = (SubLObject)cb_pph_tools.NIL;
        SubLObject err_msg = (SubLObject)cb_pph_tools.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)cb_pph_tools.$sym56$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject was_appendingP = Eval.eval((SubLObject)cb_pph_tools.$sym57$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
                    Eval.eval((SubLObject)cb_pph_tools.$list58);
                    try {
                        validate_gen_template_test_formula(assertion, formula, force);
                        final SubLObject old_grace_period = delayed_processor.delayed_processor_get_delay_seconds(pph_phrase.pph_phrase_destroyer());
                        pph_phrase.set_pph_phrase_destruction_grace_period(Numbers.max(old_grace_period, (SubLObject)cb_pph_tools.$int59$300));
                        final SubLObject _prev_bind_0_$11 = pph_vars.$bypass_pph_phrase_destroyerP$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = pph_macros.$new_pph_phrases$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
                        try {
                            pph_vars.$bypass_pph_phrase_destroyerP$.bind((SubLObject)cb_pph_tools.NIL, thread);
                            pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
                            pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
                            pph_macros.$destroy_new_pph_phrasesP$.bind((SubLObject)cb_pph_tools.T, thread);
                            try {
                                final SubLObject _prev_bind_0_$12 = pph_error.$pph_break_on_errorP$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$13 = pph_vars.$pph_problem_reporting_mode$.currentBinding(thread);
                                try {
                                    pph_error.$pph_break_on_errorP$.bind((SubLObject)cb_pph_tools.T, thread);
                                    pph_vars.$pph_problem_reporting_mode$.bind((SubLObject)((cb_pph_tools.NIL != pph_vars.pph_problem_reporting_on_p()) ? pph_vars.$pph_problem_reporting_mode$.getDynamicValue(thread) : cb_pph_tools.$kw60$QUIET), thread);
                                    v_pph_phrase = pph_methods_formulas.new_pph_phrase_for_formula_and_gen_template_assertion(formula, assertion, force);
                                }
                                finally {
                                    pph_vars.$pph_problem_reporting_mode$.rebind(_prev_bind_1_$13, thread);
                                    pph_error.$pph_break_on_errorP$.rebind(_prev_bind_0_$12, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_pph_tools.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    pph_macros.destroy_new_pph_phrases();
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                                }
                            }
                        }
                        finally {
                            pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_4, thread);
                            pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_3, thread);
                            pph_macros.$new_pph_phrases$.rebind(_prev_bind_2, thread);
                            pph_vars.$bypass_pph_phrase_destroyerP$.rebind(_prev_bind_0_$11, thread);
                        }
                        pph_phrase.set_pph_phrase_destruction_grace_period(old_grace_period);
                    }
                    finally {
                        final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_pph_tools.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            Eval.eval((SubLObject)ConsesLow.list((SubLObject)cb_pph_tools.$sym61$CSETQ, (SubLObject)cb_pph_tools.$sym57$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)cb_pph_tools.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            err_msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        return Values.values(v_pph_phrase, err_msg);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-tools.lisp", position = 7309L)
    public static SubLObject validate_gen_template_test_formula(final SubLObject assertion, final SubLObject formula, final SubLObject force) {
        if (cb_pph_tools.$const62$genTemplate_Constrained.eql(assertions_high.gaf_arg0(assertion)) && cb_pph_tools.NIL == pph_templates.gen_template_constraint_passesP_internal(assertions_high.gaf_arg2(assertion), formula, (SubLObject)cb_pph_tools.NIL)) {
            Errors.error((SubLObject)cb_pph_tools.$str63$Formula_does_not_meet_this_assert);
        }
        else if (cb_pph_tools.NIL != conses_high.member(assertions_high.gaf_arg0(assertion), (SubLObject)cb_pph_tools.$list64, (SubLObject)cb_pph_tools.UNPROVIDED, (SubLObject)cb_pph_tools.UNPROVIDED) && !assertions_high.gaf_arg1(assertion).equal(narts_high.nart_substitute(cycl_utilities.formula_arg0(formula)))) {
            Errors.error((SubLObject)cb_pph_tools.$str65$_S_does_not_use__S_as_the_arg0_, formula, assertions_high.gaf_arg1(assertion));
        }
        return (SubLObject)cb_pph_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-tools.lisp", position = 7933L)
    public static SubLObject default_force_for_gen_template_assertion(final SubLObject assertion) {
        return (SubLObject)(cb_pph_tools.$const30$genTemplate_QuerySentence.eql(assertions_high.gaf_arg0(assertion)) ? cb_pph_tools.$kw66$INTERROGATIVE : ((cb_pph_tools.NIL != fort_types_interface.isa_predicateP(assertions_high.gaf_arg1(assertion), (SubLObject)cb_pph_tools.UNPROVIDED)) ? cb_pph_tools.$kw67$DECLARATIVE : cb_pph_tools.$kw68$NONE));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-tools.lisp", position = 8164L)
    public static SubLObject cb_batch_button(final SubLObject args) {
        final SubLObject id = html_utilities.html_extract_input((SubLObject)cb_pph_tools.$str20$id, args);
        final SubLObject assertion = cb_utilities.cb_guess_assertion(id);
        final SubLObject batch_size = html_utilities.html_extract_integer((SubLObject)cb_pph_tools.$str24$batch_size, args, (SubLObject)cb_pph_tools.UNPROVIDED);
        return cb_test_gen_template_batch_int(assertion, batch_size);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-tools.lisp", position = 8572L)
    public static SubLObject formula_okay_for_gen_template_testP(final SubLObject formula, SubLObject reln) {
        if (reln == cb_pph_tools.UNPROVIDED) {
            reln = cb_pph_tools.$current_test_gen_template_reln$.getDynamicValue();
        }
        if (cb_pph_tools.NIL == el_utilities.el_formula_with_operator_p(formula, reln)) {
            return (SubLObject)cb_pph_tools.NIL;
        }
        if (cb_pph_tools.NIL != cycl_utilities.expression_find_if((SubLObject)cb_pph_tools.$sym69$HYPOTHETICAL_TERM_P, formula, (SubLObject)cb_pph_tools.UNPROVIDED, (SubLObject)cb_pph_tools.UNPROVIDED)) {
            return (SubLObject)cb_pph_tools.NIL;
        }
        if (cb_pph_tools.NIL != cycl_utilities.expression_find_if((SubLObject)cb_pph_tools.$sym70$SKOLEM_FORT_P, formula, (SubLObject)cb_pph_tools.UNPROVIDED, (SubLObject)cb_pph_tools.UNPROVIDED)) {
            return (SubLObject)cb_pph_tools.NIL;
        }
        return (SubLObject)cb_pph_tools.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-tools.lisp", position = 8911L)
    public static SubLObject default_test_formula_for_gen_template(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject gen_template_pred = assertions_high.gaf_arg0(assertion);
        final SubLObject dummy_formula = pph_utilities.pph_dummy_formula(assertions_high.gaf_arg1(assertion), (SubLObject)cb_pph_tools.UNPROVIDED);
        if (gen_template_pred.eql(cb_pph_tools.$const30$genTemplate_QuerySentence)) {
            return default_test_gen_template_query_sentence(assertion, (SubLObject)cb_pph_tools.UNPROVIDED);
        }
        if (gen_template_pred.eql(cb_pph_tools.$const62$genTemplate_Constrained)) {
            final SubLObject formula = assertions_high.gaf_arg3(assertion);
            if (cb_pph_tools.NIL != cycl_utilities.expression_find(pph_functions.bestbindingsphrasefn(), formula, (SubLObject)cb_pph_tools.T, Symbols.symbol_function((SubLObject)cb_pph_tools.EQL), Symbols.symbol_function((SubLObject)cb_pph_tools.$sym71$FORMULA_ARG0))) {
                return default_test_gen_template_with_best_bindings_phrase(assertion);
            }
            return default_test_gen_template_constrained(assertion, dummy_formula);
        }
        else {
            final SubLObject formula = assertions_high.gaf_arg2(assertion);
            if (cb_pph_tools.NIL != cycl_utilities.expression_find(pph_functions.bestbindingsphrasefn(), formula, (SubLObject)cb_pph_tools.T, Symbols.symbol_function((SubLObject)cb_pph_tools.EQL), Symbols.symbol_function((SubLObject)cb_pph_tools.$sym71$FORMULA_ARG0))) {
                return default_test_gen_template_with_best_bindings_phrase(assertion);
            }
            final SubLObject _prev_bind_0 = cb_pph_tools.$current_test_gen_template_reln$.currentBinding(thread);
            try {
                cb_pph_tools.$current_test_gen_template_reln$.bind(assertions_high.gaf_arg(assertion, lexicon_utilities.denotatum_arg_of_pred_cached(gen_template_pred)), thread);
                return default_test_gen_template_formula_for_reln(cb_pph_tools.$current_test_gen_template_reln$.getDynamicValue(thread));
            }
            finally {
                cb_pph_tools.$current_test_gen_template_reln$.rebind(_prev_bind_0, thread);
            }
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-tools.lisp", position = 9988L)
    public static SubLObject default_test_gen_template_constrained(final SubLObject assertion, final SubLObject dummy_formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject timed_outP = (SubLObject)cb_pph_tools.NIL;
        SubLObject v_bindings = (SubLObject)cb_pph_tools.NIL;
        final SubLObject _prev_bind_0 = wff_vars.$permit_keyword_variablesP$.currentBinding(thread);
        try {
            wff_vars.$permit_keyword_variablesP$.bind((SubLObject)cb_pph_tools.T, thread);
            final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
            try {
                thread.throwStack.push(tag);
                final SubLObject _prev_bind_0_$16 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                try {
                    subl_macro_promotions.$within_with_timeout$.bind((SubLObject)cb_pph_tools.T, thread);
                    SubLObject timer = (SubLObject)cb_pph_tools.NIL;
                    try {
                        final SubLObject _prev_bind_0_$17 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                        try {
                            subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)cb_pph_tools.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                            timer = subl_macro_promotions.with_timeout_start_timer((SubLObject)cb_pph_tools.THREE_INTEGER, tag);
                            SubLObject current;
                            final SubLObject datum = current = assertions_high.gaf_args(assertion);
                            SubLObject pred = (SubLObject)cb_pph_tools.NIL;
                            SubLObject template = (SubLObject)cb_pph_tools.NIL;
                            SubLObject recipe = (SubLObject)cb_pph_tools.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_pph_tools.$list73);
                            pred = current.first();
                            current = current.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_pph_tools.$list73);
                            template = current.first();
                            current = current.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_pph_tools.$list73);
                            recipe = current.first();
                            current = current.rest();
                            if (cb_pph_tools.NIL == current) {
                                v_bindings = inference_kernel.new_cyc_query(simplifier.conjoin((SubLObject)ConsesLow.list(dummy_formula, template), (SubLObject)cb_pph_tools.UNPROVIDED), cb_pph_tools.$const74$InferencePSC, (SubLObject)cb_pph_tools.$list75).first();
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_pph_tools.$list73);
                            }
                        }
                        finally {
                            subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$17, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_pph_tools.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            subl_macro_promotions.with_timeout_stop_timer(timer);
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                        }
                    }
                }
                finally {
                    subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0_$16, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
            }
            finally {
                thread.throwStack.pop();
            }
            if (cb_pph_tools.NIL != timed_outP) {
                return dummy_formula;
            }
            if (cb_pph_tools.NIL != v_bindings) {
                return bindings.apply_bindings(v_bindings, dummy_formula);
            }
            return dummy_formula;
        }
        finally {
            wff_vars.$permit_keyword_variablesP$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-tools.lisp", position = 10585L)
    public static SubLObject default_test_gen_template_constrained_batch(final SubLObject assertion, final SubLObject number) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject timed_outP = (SubLObject)cb_pph_tools.NIL;
        SubLObject v_bindings = (SubLObject)cb_pph_tools.NIL;
        SubLObject tests = (SubLObject)cb_pph_tools.NIL;
        final SubLObject _prev_bind_0 = wff_vars.$permit_keyword_variablesP$.currentBinding(thread);
        try {
            wff_vars.$permit_keyword_variablesP$.bind((SubLObject)cb_pph_tools.T, thread);
            final SubLObject dummy_formula = pph_utilities.pph_dummy_formula(assertions_high.gaf_arg1(assertion), (SubLObject)cb_pph_tools.UNPROVIDED);
            final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
            try {
                thread.throwStack.push(tag);
                final SubLObject _prev_bind_0_$19 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                try {
                    subl_macro_promotions.$within_with_timeout$.bind((SubLObject)cb_pph_tools.T, thread);
                    SubLObject timer = (SubLObject)cb_pph_tools.NIL;
                    try {
                        final SubLObject _prev_bind_0_$20 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                        try {
                            subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)cb_pph_tools.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                            timer = subl_macro_promotions.with_timeout_start_timer((SubLObject)cb_pph_tools.TWENTY_INTEGER, tag);
                            final SubLObject template = assertions_high.gaf_arg2(assertion);
                            v_bindings = inference_kernel.new_cyc_query(simplifier.conjoin((SubLObject)ConsesLow.list(dummy_formula, template), (SubLObject)cb_pph_tools.UNPROVIDED), cb_pph_tools.$const74$InferencePSC, (SubLObject)ConsesLow.listS((SubLObject)cb_pph_tools.$kw76$MAX_NUMBER, number, (SubLObject)cb_pph_tools.$list77));
                        }
                        finally {
                            subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$20, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_pph_tools.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            subl_macro_promotions.with_timeout_stop_timer(timer);
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                        }
                    }
                }
                finally {
                    subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0_$19, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
            }
            finally {
                thread.throwStack.pop();
            }
            if (cb_pph_tools.NIL != timed_outP) {
                Errors.warn((SubLObject)cb_pph_tools.$str78$Query_timed_out);
            }
            else {
                if (cb_pph_tools.NIL != v_bindings) {
                    SubLObject cdolist_list_var = v_bindings;
                    SubLObject binding = (SubLObject)cb_pph_tools.NIL;
                    binding = cdolist_list_var.first();
                    while (cb_pph_tools.NIL != cdolist_list_var) {
                        tests = ConsesLow.append(tests, (SubLObject)ConsesLow.list(bindings.apply_bindings(binding, dummy_formula)));
                        cdolist_list_var = cdolist_list_var.rest();
                        binding = cdolist_list_var.first();
                    }
                    return tests;
                }
                Errors.warn((SubLObject)cb_pph_tools.$str79$Something_went_wrong);
            }
        }
        finally {
            wff_vars.$permit_keyword_variablesP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_pph_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-tools.lisp", position = 11285L)
    public static SubLObject default_test_gen_template_with_best_bindings_phrase(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject timed_out_1P = (SubLObject)cb_pph_tools.NIL;
        SubLObject timed_out_2P = (SubLObject)cb_pph_tools.NIL;
        SubLObject suggested_test = (SubLObject)cb_pph_tools.NIL;
        final SubLObject _prev_bind_0 = wff_vars.$permit_keyword_variablesP$.currentBinding(thread);
        try {
            wff_vars.$permit_keyword_variablesP$.bind((SubLObject)cb_pph_tools.T, thread);
            final SubLObject dummy_formula = pph_utilities.pph_dummy_formula(assertions_high.gaf_arg1(assertion), (SubLObject)cb_pph_tools.UNPROVIDED);
            if (assertions_high.gaf_arg0(assertion).eql(cb_pph_tools.$const62$genTemplate_Constrained)) {
                final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
                try {
                    thread.throwStack.push(tag);
                    final SubLObject _prev_bind_0_$22 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                    try {
                        subl_macro_promotions.$within_with_timeout$.bind((SubLObject)cb_pph_tools.T, thread);
                        SubLObject timer = (SubLObject)cb_pph_tools.NIL;
                        try {
                            final SubLObject _prev_bind_0_$23 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                            try {
                                subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)cb_pph_tools.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                timer = subl_macro_promotions.with_timeout_start_timer((SubLObject)cb_pph_tools.TWO_INTEGER, tag);
                                final SubLObject recipe = assertions_high.gaf_arg3(assertion);
                                final SubLObject binding = conses_high.second(cycl_utilities.expression_find(pph_functions.bestbindingsphrasefn(), recipe, (SubLObject)cb_pph_tools.T, Symbols.symbol_function((SubLObject)cb_pph_tools.EQL), Symbols.symbol_function((SubLObject)cb_pph_tools.$sym71$FORMULA_ARG0)));
                                final SubLObject v_bindings = inference_kernel.new_cyc_query(simplifier.conjoin((SubLObject)ConsesLow.list(dummy_formula, binding), (SubLObject)cb_pph_tools.UNPROVIDED), cb_pph_tools.$const74$InferencePSC, (SubLObject)cb_pph_tools.$list80).first();
                                suggested_test = bindings.apply_bindings(v_bindings, dummy_formula);
                            }
                            finally {
                                subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$23, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$24 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_pph_tools.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                subl_macro_promotions.with_timeout_stop_timer(timer);
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                            }
                        }
                    }
                    finally {
                        subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0_$22, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    timed_out_1P = Errors.handleThrowable(ccatch_env_var, tag);
                }
                finally {
                    thread.throwStack.pop();
                }
                if (cb_pph_tools.NIL != timed_out_1P) {
                    return dummy_formula;
                }
                if (cb_pph_tools.NIL != pph_templates.gen_template_constraint_passesP_internal(assertions_high.gaf_arg2(assertion), suggested_test, (SubLObject)cb_pph_tools.NIL)) {
                    return suggested_test;
                }
                return dummy_formula;
            }
            else {
                final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
                try {
                    thread.throwStack.push(tag);
                    final SubLObject _prev_bind_0_$25 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                    try {
                        subl_macro_promotions.$within_with_timeout$.bind((SubLObject)cb_pph_tools.T, thread);
                        SubLObject timer = (SubLObject)cb_pph_tools.NIL;
                        try {
                            final SubLObject _prev_bind_0_$26 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                            try {
                                subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)cb_pph_tools.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                timer = subl_macro_promotions.with_timeout_start_timer((SubLObject)cb_pph_tools.TWO_INTEGER, tag);
                                SubLObject current;
                                final SubLObject datum = current = assertions_high.gaf_args(assertion);
                                SubLObject pred = (SubLObject)cb_pph_tools.NIL;
                                SubLObject recipe2 = (SubLObject)cb_pph_tools.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_pph_tools.$list81);
                                pred = current.first();
                                current = current.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_pph_tools.$list81);
                                recipe2 = current.first();
                                current = current.rest();
                                if (cb_pph_tools.NIL == current) {
                                    final SubLObject dummy_formula_$27 = pph_utilities.pph_dummy_formula(pred, (SubLObject)cb_pph_tools.UNPROVIDED);
                                    final SubLObject binding2 = conses_high.second(cycl_utilities.expression_find(pph_functions.bestbindingsphrasefn(), recipe2, (SubLObject)cb_pph_tools.T, Symbols.symbol_function((SubLObject)cb_pph_tools.EQL), Symbols.symbol_function((SubLObject)cb_pph_tools.$sym71$FORMULA_ARG0)));
                                    final SubLObject v_bindings2 = inference_kernel.new_cyc_query(simplifier.conjoin((SubLObject)ConsesLow.list(dummy_formula_$27, binding2), (SubLObject)cb_pph_tools.UNPROVIDED), cb_pph_tools.$const74$InferencePSC, (SubLObject)cb_pph_tools.$list80).first();
                                    suggested_test = bindings.apply_bindings(v_bindings2, dummy_formula_$27);
                                    SubLObject remaining_bindings = (SubLObject)cb_pph_tools.NIL;
                                    final SubLObject tag_$28 = subl_macro_promotions.with_timeout_make_tag();
                                    try {
                                        thread.throwStack.push(tag_$28);
                                        final SubLObject _prev_bind_0_$27 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                                        try {
                                            subl_macro_promotions.$within_with_timeout$.bind((SubLObject)cb_pph_tools.T, thread);
                                            SubLObject timer_$30 = (SubLObject)cb_pph_tools.NIL;
                                            try {
                                                final SubLObject _prev_bind_0_$28 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                                                try {
                                                    subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)cb_pph_tools.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                    timer_$30 = subl_macro_promotions.with_timeout_start_timer((SubLObject)cb_pph_tools.TWO_INTEGER, tag_$28);
                                                    remaining_bindings = inference_kernel.new_cyc_query(suggested_test, cb_pph_tools.$const74$InferencePSC, (SubLObject)cb_pph_tools.$list80).first();
                                                }
                                                finally {
                                                    subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$28, thread);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$29 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_pph_tools.T, thread);
                                                    final SubLObject _values2 = Values.getValuesAsVector();
                                                    subl_macro_promotions.with_timeout_stop_timer(timer_$30);
                                                    Values.restoreValuesFromVector(_values2);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$29, thread);
                                                }
                                            }
                                        }
                                        finally {
                                            subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0_$27, thread);
                                        }
                                    }
                                    catch (Throwable ccatch_env_var2) {
                                        timed_out_2P = Errors.handleThrowable(ccatch_env_var2, tag_$28);
                                    }
                                    finally {
                                        thread.throwStack.pop();
                                    }
                                    if (cb_pph_tools.NIL != remaining_bindings) {
                                        return bindings.apply_bindings(remaining_bindings, suggested_test);
                                    }
                                    return suggested_test;
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_pph_tools.$list81);
                                }
                            }
                            finally {
                                subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$26, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$30 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_pph_tools.T, thread);
                                final SubLObject _values3 = Values.getValuesAsVector();
                                subl_macro_promotions.with_timeout_stop_timer(timer);
                                Values.restoreValuesFromVector(_values3);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                            }
                        }
                    }
                    finally {
                        subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0_$25, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    timed_out_1P = Errors.handleThrowable(ccatch_env_var, tag);
                }
                finally {
                    thread.throwStack.pop();
                }
            }
        }
        finally {
            wff_vars.$permit_keyword_variablesP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_pph_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-tools.lisp", position = 12984L)
    public static SubLObject default_test_gen_template_with_best_bindings_phrase_batch(final SubLObject assertion, final SubLObject number) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject timed_out_1P = (SubLObject)cb_pph_tools.NIL;
        SubLObject timed_out_2P = (SubLObject)cb_pph_tools.NIL;
        SubLObject suggested_tests = (SubLObject)cb_pph_tools.NIL;
        SubLObject tests = (SubLObject)cb_pph_tools.NIL;
        final SubLObject _prev_bind_0 = wff_vars.$permit_keyword_variablesP$.currentBinding(thread);
        try {
            wff_vars.$permit_keyword_variablesP$.bind((SubLObject)cb_pph_tools.T, thread);
            final SubLObject dummy_formula = pph_utilities.pph_dummy_formula(assertions_high.gaf_arg1(assertion), (SubLObject)cb_pph_tools.UNPROVIDED);
            if (assertions_high.gaf_arg0(assertion).eql(cb_pph_tools.$const62$genTemplate_Constrained)) {
                final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
                try {
                    thread.throwStack.push(tag);
                    final SubLObject _prev_bind_0_$34 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                    try {
                        subl_macro_promotions.$within_with_timeout$.bind((SubLObject)cb_pph_tools.T, thread);
                        SubLObject timer = (SubLObject)cb_pph_tools.NIL;
                        try {
                            final SubLObject _prev_bind_0_$35 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                            try {
                                subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)cb_pph_tools.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                timer = subl_macro_promotions.with_timeout_start_timer((SubLObject)cb_pph_tools.TWENTY_INTEGER, tag);
                                final SubLObject recipe = assertions_high.gaf_arg3(assertion);
                                final SubLObject binding = conses_high.second(cycl_utilities.expression_find(pph_functions.bestbindingsphrasefn(), recipe, (SubLObject)cb_pph_tools.T, Symbols.symbol_function((SubLObject)cb_pph_tools.EQL), Symbols.symbol_function((SubLObject)cb_pph_tools.$sym71$FORMULA_ARG0)));
                                SubLObject cdolist_list_var;
                                final SubLObject v_bindings = cdolist_list_var = inference_kernel.new_cyc_query(simplifier.conjoin((SubLObject)ConsesLow.list(dummy_formula, binding), (SubLObject)cb_pph_tools.UNPROVIDED), cb_pph_tools.$const74$InferencePSC, (SubLObject)ConsesLow.listS((SubLObject)cb_pph_tools.$kw76$MAX_NUMBER, number, (SubLObject)cb_pph_tools.$list77));
                                SubLObject binding_$36 = (SubLObject)cb_pph_tools.NIL;
                                binding_$36 = cdolist_list_var.first();
                                while (cb_pph_tools.NIL != cdolist_list_var) {
                                    suggested_tests = ConsesLow.append(suggested_tests, (SubLObject)ConsesLow.list(bindings.apply_bindings(binding_$36, dummy_formula)));
                                    cdolist_list_var = cdolist_list_var.rest();
                                    binding_$36 = cdolist_list_var.first();
                                }
                                SubLObject cdolist_list_var2 = suggested_tests;
                                SubLObject suggested_test = (SubLObject)cb_pph_tools.NIL;
                                suggested_test = cdolist_list_var2.first();
                                while (cb_pph_tools.NIL != cdolist_list_var2) {
                                    if (cb_pph_tools.NIL != timed_out_1P) {
                                        Errors.warn((SubLObject)cb_pph_tools.$str78$Query_timed_out);
                                    }
                                    else if (cb_pph_tools.NIL != pph_templates.gen_template_constraint_passesP_internal(assertions_high.gaf_arg2(assertion), suggested_test, (SubLObject)cb_pph_tools.NIL)) {
                                        tests = ConsesLow.append(tests, (SubLObject)ConsesLow.list(suggested_test));
                                    }
                                    else {
                                        Errors.warn((SubLObject)cb_pph_tools.$str79$Something_went_wrong);
                                    }
                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    suggested_test = cdolist_list_var2.first();
                                }
                            }
                            finally {
                                subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$35, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$36 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_pph_tools.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                subl_macro_promotions.with_timeout_stop_timer(timer);
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$36, thread);
                            }
                        }
                    }
                    finally {
                        subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0_$34, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    timed_out_1P = Errors.handleThrowable(ccatch_env_var, tag);
                }
                finally {
                    thread.throwStack.pop();
                }
            }
            else {
                final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
                try {
                    thread.throwStack.push(tag);
                    final SubLObject _prev_bind_0_$37 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                    try {
                        subl_macro_promotions.$within_with_timeout$.bind((SubLObject)cb_pph_tools.T, thread);
                        SubLObject timer = (SubLObject)cb_pph_tools.NIL;
                        try {
                            final SubLObject _prev_bind_0_$38 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                            try {
                                subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)cb_pph_tools.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                timer = subl_macro_promotions.with_timeout_start_timer((SubLObject)cb_pph_tools.TWENTY_INTEGER, tag);
                                SubLObject current;
                                final SubLObject datum = current = assertions_high.gaf_args(assertion);
                                SubLObject pred = (SubLObject)cb_pph_tools.NIL;
                                SubLObject recipe2 = (SubLObject)cb_pph_tools.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_pph_tools.$list81);
                                pred = current.first();
                                current = current.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_pph_tools.$list81);
                                recipe2 = current.first();
                                current = current.rest();
                                if (cb_pph_tools.NIL == current) {
                                    final SubLObject dummy_formula_$40 = pph_utilities.pph_dummy_formula(pred, (SubLObject)cb_pph_tools.UNPROVIDED);
                                    final SubLObject binding2 = conses_high.second(cycl_utilities.expression_find(pph_functions.bestbindingsphrasefn(), recipe2, (SubLObject)cb_pph_tools.T, Symbols.symbol_function((SubLObject)cb_pph_tools.EQL), Symbols.symbol_function((SubLObject)cb_pph_tools.$sym71$FORMULA_ARG0)));
                                    SubLObject cdolist_list_var3;
                                    final SubLObject v_bindings2 = cdolist_list_var3 = inference_kernel.new_cyc_query(simplifier.conjoin((SubLObject)ConsesLow.list(dummy_formula_$40, binding2), (SubLObject)cb_pph_tools.UNPROVIDED), cb_pph_tools.$const74$InferencePSC, (SubLObject)ConsesLow.listS((SubLObject)cb_pph_tools.$kw76$MAX_NUMBER, number, (SubLObject)cb_pph_tools.$list77));
                                    SubLObject binding_$37 = (SubLObject)cb_pph_tools.NIL;
                                    binding_$37 = cdolist_list_var3.first();
                                    while (cb_pph_tools.NIL != cdolist_list_var3) {
                                        suggested_tests = ConsesLow.append(suggested_tests, (SubLObject)ConsesLow.list(bindings.apply_bindings(binding_$37, dummy_formula_$40)));
                                        cdolist_list_var3 = cdolist_list_var3.rest();
                                        binding_$37 = cdolist_list_var3.first();
                                    }
                                    SubLObject cdolist_list_var4 = suggested_tests;
                                    SubLObject suggested_test2 = (SubLObject)cb_pph_tools.NIL;
                                    suggested_test2 = cdolist_list_var4.first();
                                    while (cb_pph_tools.NIL != cdolist_list_var4) {
                                        SubLObject remaining_bindings = (SubLObject)cb_pph_tools.NIL;
                                        final SubLObject tag_$42 = subl_macro_promotions.with_timeout_make_tag();
                                        try {
                                            thread.throwStack.push(tag_$42);
                                            final SubLObject _prev_bind_0_$39 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                                            try {
                                                subl_macro_promotions.$within_with_timeout$.bind((SubLObject)cb_pph_tools.T, thread);
                                                SubLObject timer_$44 = (SubLObject)cb_pph_tools.NIL;
                                                try {
                                                    final SubLObject _prev_bind_0_$40 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                                                    try {
                                                        subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)cb_pph_tools.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                        timer_$44 = subl_macro_promotions.with_timeout_start_timer((SubLObject)cb_pph_tools.TWENTY_INTEGER, tag_$42);
                                                        remaining_bindings = inference_kernel.new_cyc_query(suggested_test2, cb_pph_tools.$const74$InferencePSC, (SubLObject)ConsesLow.listS((SubLObject)cb_pph_tools.$kw76$MAX_NUMBER, number, (SubLObject)cb_pph_tools.$list77));
                                                    }
                                                    finally {
                                                        subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$40, thread);
                                                    }
                                                }
                                                finally {
                                                    final SubLObject _prev_bind_0_$41 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_pph_tools.T, thread);
                                                        final SubLObject _values2 = Values.getValuesAsVector();
                                                        subl_macro_promotions.with_timeout_stop_timer(timer_$44);
                                                        Values.restoreValuesFromVector(_values2);
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$41, thread);
                                                    }
                                                }
                                            }
                                            finally {
                                                subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0_$39, thread);
                                            }
                                        }
                                        catch (Throwable ccatch_env_var2) {
                                            timed_out_2P = Errors.handleThrowable(ccatch_env_var2, tag_$42);
                                        }
                                        finally {
                                            thread.throwStack.pop();
                                        }
                                        if (cb_pph_tools.NIL != remaining_bindings) {
                                            SubLObject cdolist_list_var_$47 = remaining_bindings;
                                            SubLObject remaining_binding = (SubLObject)cb_pph_tools.NIL;
                                            remaining_binding = cdolist_list_var_$47.first();
                                            while (cb_pph_tools.NIL != cdolist_list_var_$47) {
                                                tests = ConsesLow.append(tests, (SubLObject)ConsesLow.list(bindings.apply_bindings(remaining_binding, suggested_test2)));
                                                cdolist_list_var_$47 = cdolist_list_var_$47.rest();
                                                remaining_binding = cdolist_list_var_$47.first();
                                            }
                                        }
                                        else {
                                            tests = ConsesLow.append(tests, (SubLObject)ConsesLow.list(suggested_test2));
                                        }
                                        cdolist_list_var4 = cdolist_list_var4.rest();
                                        suggested_test2 = cdolist_list_var4.first();
                                    }
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_pph_tools.$list81);
                                }
                            }
                            finally {
                                subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$38, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$42 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_pph_tools.T, thread);
                                final SubLObject _values3 = Values.getValuesAsVector();
                                subl_macro_promotions.with_timeout_stop_timer(timer);
                                Values.restoreValuesFromVector(_values3);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$42, thread);
                            }
                        }
                    }
                    finally {
                        subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0_$37, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    timed_out_1P = Errors.handleThrowable(ccatch_env_var, tag);
                }
                finally {
                    thread.throwStack.pop();
                }
            }
            return tests;
        }
        finally {
            wff_vars.$permit_keyword_variablesP$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-tools.lisp", position = 15108L)
    public static SubLObject default_test_gen_template_query_sentence(final SubLObject assertion, SubLObject batch_size) {
        if (batch_size == cb_pph_tools.UNPROVIDED) {
            batch_size = (SubLObject)cb_pph_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject timed_outP = (SubLObject)cb_pph_tools.NIL;
        final SubLObject _prev_bind_0 = wff_vars.$permit_keyword_variablesP$.currentBinding(thread);
        try {
            wff_vars.$permit_keyword_variablesP$.bind((SubLObject)cb_pph_tools.T, thread);
            final SubLObject max_number = (SubLObject)((cb_pph_tools.NIL != batch_size) ? batch_size : cb_pph_tools.ONE_INTEGER);
            SubLObject sentences = (SubLObject)cb_pph_tools.NIL;
            SubLObject current;
            final SubLObject datum = current = assertions_high.gaf_args(assertion);
            SubLObject template = (SubLObject)cb_pph_tools.NIL;
            SubLObject recipe = (SubLObject)cb_pph_tools.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_pph_tools.$list82);
            template = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_pph_tools.$list82);
            recipe = current.first();
            current = current.rest();
            if (cb_pph_tools.NIL == current) {
                template = cycl_utilities.naut_substitute(template);
                final SubLObject bindings_phrase = cycl_utilities.expression_find(pph_functions.bestbindingsphrasefn(), recipe, (SubLObject)cb_pph_tools.T, Symbols.symbol_function((SubLObject)cb_pph_tools.EQL), Symbols.symbol_function((SubLObject)cb_pph_tools.$sym71$FORMULA_ARG0));
                final SubLObject binding_q = (SubLObject)((cb_pph_tools.NIL != bindings_phrase) ? cycl_utilities.nat_arg1(bindings_phrase, (SubLObject)cb_pph_tools.UNPROVIDED) : cb_pph_tools.NIL);
                final SubLObject query_sentence = (cb_pph_tools.NIL != binding_q) ? simplifier.conjoin((SubLObject)ConsesLow.list(binding_q, template), (SubLObject)cb_pph_tools.UNPROVIDED) : template;
                final SubLObject max_time = (SubLObject)((cb_pph_tools.NIL != binding_q) ? cb_pph_tools.EIGHT_INTEGER : cb_pph_tools.ONE_INTEGER);
                SubLObject cdolist_list_var = inference_kernel.new_cyc_query(query_sentence, cb_pph_tools.$const74$InferencePSC, (SubLObject)ConsesLow.list((SubLObject)cb_pph_tools.$kw76$MAX_NUMBER, max_number, (SubLObject)cb_pph_tools.$kw85$MAX_TIME, max_time, (SubLObject)cb_pph_tools.$kw86$ANSWER_LANGUAGE, (SubLObject)cb_pph_tools.$kw87$EL));
                SubLObject v_bindings = (SubLObject)cb_pph_tools.NIL;
                v_bindings = cdolist_list_var.first();
                while (cb_pph_tools.NIL != cdolist_list_var) {
                    sentences = (SubLObject)ConsesLow.cons(bindings.apply_bindings(Sequences.remove_if((SubLObject)cb_pph_tools.$sym83$EL_VAR_, v_bindings, (SubLObject)cb_pph_tools.$sym84$VARIABLE_BINDING_VARIABLE, (SubLObject)cb_pph_tools.UNPROVIDED, (SubLObject)cb_pph_tools.UNPROVIDED, (SubLObject)cb_pph_tools.UNPROVIDED), template), sentences);
                    cdolist_list_var = cdolist_list_var.rest();
                    v_bindings = cdolist_list_var.first();
                }
                if (cb_pph_tools.NIL != list_utilities.empty_list_p(sentences)) {
                    sentences = (SubLObject)ConsesLow.cons(template, sentences);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_pph_tools.$list82);
            }
            return (cb_pph_tools.NIL != batch_size) ? Sequences.delete_duplicates(sentences, Symbols.symbol_function((SubLObject)cb_pph_tools.EQUAL), (SubLObject)cb_pph_tools.UNPROVIDED, (SubLObject)cb_pph_tools.UNPROVIDED, (SubLObject)cb_pph_tools.UNPROVIDED) : sentences.first();
        }
        finally {
            wff_vars.$permit_keyword_variablesP$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-tools.lisp", position = 16169L)
    public static SubLObject default_test_gen_template_formula_for_reln(final SubLObject reln) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = cb_pph_tools.$const74$InferencePSC;
        final SubLObject var = variables.get_variable((SubLObject)cb_pph_tools.ZERO_INTEGER);
        SubLObject cdolist_list_var;
        final SubLObject examples = cdolist_list_var = backward.removal_ask_hl_variable(var, (SubLObject)ConsesLow.list(cb_pph_tools.$const88$exampleSentences, reln, var), mt, (SubLObject)cb_pph_tools.$kw89$TRUE, (SubLObject)cb_pph_tools.$list90);
        SubLObject example = (SubLObject)cb_pph_tools.NIL;
        example = cdolist_list_var.first();
        while (cb_pph_tools.NIL != cdolist_list_var) {
            final SubLObject elf = cycl_utilities.hl_to_el(example);
            if (cb_pph_tools.NIL != formula_okay_for_gen_template_testP(elf, reln)) {
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
            if (cb_pph_tools.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(reln)) {
                final SubLObject str = (SubLObject)cb_pph_tools.NIL;
                final SubLObject _prev_bind_0_$49 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$50 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_2_$51 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)cb_pph_tools.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)cb_pph_tools.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)cb_pph_tools.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)cb_pph_tools.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((cb_pph_tools.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : cb_pph_tools.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(reln);
                    SubLObject done_var = (SubLObject)cb_pph_tools.NIL;
                    final SubLObject token_var = (SubLObject)cb_pph_tools.NIL;
                    while (cb_pph_tools.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (cb_pph_tools.NIL != valid) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator = (SubLObject)cb_pph_tools.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)cb_pph_tools.$kw91$GAF, (SubLObject)cb_pph_tools.NIL, (SubLObject)cb_pph_tools.NIL);
                                SubLObject done_var_$52 = (SubLObject)cb_pph_tools.NIL;
                                final SubLObject token_var_$53 = (SubLObject)cb_pph_tools.NIL;
                                while (cb_pph_tools.NIL == done_var_$52) {
                                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$53);
                                    final SubLObject valid_$54 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$53.eql(gaf));
                                    if (cb_pph_tools.NIL != valid_$54) {
                                        final SubLObject elf2 = cycl_utilities.hl_to_el(assertions_high.gaf_el_formula(gaf));
                                        if (cb_pph_tools.NIL != formula_okay_for_gen_template_testP(elf2, reln)) {
                                            return elf2;
                                        }
                                    }
                                    done_var_$52 = (SubLObject)SubLObjectFactory.makeBoolean(cb_pph_tools.NIL == valid_$54);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$50 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_pph_tools.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (cb_pph_tools.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$50, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(cb_pph_tools.NIL == valid);
                    }
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$51, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$50, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$49, thread);
                }
            }
            if (cb_pph_tools.NIL != kb_mapping_macros.do_function_extent_index_key_validator(reln)) {
                final SubLObject final_index_spec2 = kb_mapping_macros.function_extent_final_index_spec(reln);
                SubLObject final_index_iterator2 = (SubLObject)cb_pph_tools.NIL;
                try {
                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)cb_pph_tools.$kw91$GAF, (SubLObject)cb_pph_tools.NIL, (SubLObject)cb_pph_tools.NIL);
                    SubLObject done_var2 = (SubLObject)cb_pph_tools.NIL;
                    final SubLObject token_var2 = (SubLObject)cb_pph_tools.NIL;
                    while (cb_pph_tools.NIL == done_var2) {
                        final SubLObject tou = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var2);
                        final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(tou));
                        if (cb_pph_tools.NIL != valid2) {
                            final SubLObject nart = assertions_high.gaf_arg1(tou);
                            final SubLObject elf3 = narts_high.nart_el_formula(nart);
                            if (cb_pph_tools.NIL != formula_okay_for_gen_template_testP(elf3, reln)) {
                                return elf3;
                            }
                        }
                        done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(cb_pph_tools.NIL == valid2);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$51 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_pph_tools.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        if (cb_pph_tools.NIL != final_index_iterator2) {
                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                        }
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$51, thread);
                    }
                }
            }
            return cycl_utilities.hl_to_el(pph_utilities.pph_dummy_formula(reln, (SubLObject)cb_pph_tools.T));
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-tools.lisp", position = 17015L)
    public static SubLObject default_test_gen_template_formulas_for_reln(final SubLObject reln, final SubLObject number) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject timed_outP = (SubLObject)cb_pph_tools.NIL;
        final SubLObject _prev_bind_0 = wff_vars.$permit_keyword_variablesP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = cb_pph_tools.$current_test_gen_template_reln$.currentBinding(thread);
        try {
            wff_vars.$permit_keyword_variablesP$.bind((SubLObject)cb_pph_tools.T, thread);
            cb_pph_tools.$current_test_gen_template_reln$.bind(reln, thread);
            final SubLObject dummy_formula = pph_utilities.pph_dummy_formula(reln, (SubLObject)cb_pph_tools.UNPROVIDED);
            final SubLObject predicateP = fort_types_interface.isa_predicateP(reln, (SubLObject)cb_pph_tools.UNPROVIDED);
            final SubLObject query_sentence = (SubLObject)((cb_pph_tools.NIL != predicateP) ? dummy_formula : ConsesLow.list(cb_pph_tools.$const92$denotes, (SubLObject)cb_pph_tools.$list93, dummy_formula));
            final SubLObject template = (SubLObject)((cb_pph_tools.NIL != predicateP) ? dummy_formula : cb_pph_tools.$sym94$_FORMULA);
            SubLObject formulas = (SubLObject)cb_pph_tools.NIL;
            final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
            try {
                thread.throwStack.push(tag);
                final SubLObject _prev_bind_0_$57 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                try {
                    subl_macro_promotions.$within_with_timeout$.bind((SubLObject)cb_pph_tools.T, thread);
                    SubLObject timer = (SubLObject)cb_pph_tools.NIL;
                    try {
                        final SubLObject _prev_bind_0_$58 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                        try {
                            subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)cb_pph_tools.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                            timer = subl_macro_promotions.with_timeout_start_timer((SubLObject)cb_pph_tools.TWENTY_INTEGER, tag);
                            final SubLObject items_var = ask_utilities.query_template(template, query_sentence, cb_pph_tools.$const74$InferencePSC, (SubLObject)ConsesLow.listS((SubLObject)cb_pph_tools.$kw76$MAX_NUMBER, number, (SubLObject)cb_pph_tools.$list95));
                            if (items_var.isVector()) {
                                final SubLObject vector_var = items_var;
                                final SubLObject backwardP_var = (SubLObject)cb_pph_tools.NIL;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject element_num;
                                SubLObject item;
                                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)cb_pph_tools.NIL, v_iteration = (SubLObject)cb_pph_tools.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)cb_pph_tools.ONE_INTEGER)) {
                                    element_num = ((cb_pph_tools.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)cb_pph_tools.ONE_INTEGER) : v_iteration);
                                    item = Vectors.aref(vector_var, element_num);
                                    formulas = (SubLObject)ConsesLow.cons(item, formulas);
                                }
                            }
                            else {
                                SubLObject cdolist_list_var = items_var;
                                SubLObject item2 = (SubLObject)cb_pph_tools.NIL;
                                item2 = cdolist_list_var.first();
                                while (cb_pph_tools.NIL != cdolist_list_var) {
                                    formulas = (SubLObject)ConsesLow.cons(item2, formulas);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    item2 = cdolist_list_var.first();
                                }
                            }
                        }
                        finally {
                            subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$58, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$59 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_pph_tools.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            subl_macro_promotions.with_timeout_stop_timer(timer);
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$59, thread);
                        }
                    }
                }
                finally {
                    subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0_$57, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
            }
            finally {
                thread.throwStack.pop();
            }
            if (cb_pph_tools.NIL != timed_outP) {
                Errors.warn((SubLObject)cb_pph_tools.$str78$Query_timed_out);
            }
            if (cb_pph_tools.NIL != list_utilities.empty_list_p(formulas)) {
                formulas = (SubLObject)ConsesLow.cons(dummy_formula, formulas);
            }
            return list_utilities.remove_if_not((SubLObject)cb_pph_tools.$sym96$FORMULA_OKAY_FOR_GEN_TEMPLATE_TEST_, formulas, (SubLObject)cb_pph_tools.UNPROVIDED, (SubLObject)cb_pph_tools.UNPROVIDED, (SubLObject)cb_pph_tools.UNPROVIDED, (SubLObject)cb_pph_tools.UNPROVIDED);
        }
        finally {
            cb_pph_tools.$current_test_gen_template_reln$.rebind(_prev_bind_2, thread);
            wff_vars.$permit_keyword_variablesP$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-tools.lisp", position = 17845L)
    public static SubLObject gather_batch_paraphrase_formulas(final SubLObject assertion, final SubLObject number) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject gen_template_pred = assertions_high.gaf_arg0(assertion);
        if (gen_template_pred.eql(cb_pph_tools.$const62$genTemplate_Constrained)) {
            final SubLObject formula = assertions_high.gaf_arg3(assertion);
            if (cb_pph_tools.NIL != cycl_utilities.expression_find(pph_functions.bestbindingsphrasefn(), formula, (SubLObject)cb_pph_tools.T, Symbols.symbol_function((SubLObject)cb_pph_tools.EQL), Symbols.symbol_function((SubLObject)cb_pph_tools.$sym71$FORMULA_ARG0))) {
                return default_test_gen_template_with_best_bindings_phrase_batch(assertion, number);
            }
            return default_test_gen_template_constrained_batch(assertion, number);
        }
        else {
            if (gen_template_pred.eql(cb_pph_tools.$const30$genTemplate_QuerySentence)) {
                return default_test_gen_template_query_sentence(assertion, number);
            }
            final SubLObject formula = assertions_high.gaf_arg2(assertion);
            if (cb_pph_tools.NIL != cycl_utilities.expression_find(pph_functions.bestbindingsphrasefn(), formula, (SubLObject)cb_pph_tools.T, Symbols.symbol_function((SubLObject)cb_pph_tools.EQL), Symbols.symbol_function((SubLObject)cb_pph_tools.$sym71$FORMULA_ARG0))) {
                return default_test_gen_template_with_best_bindings_phrase_batch(assertion, number);
            }
            final SubLObject _prev_bind_0 = cb_pph_tools.$current_test_gen_template_reln$.currentBinding(thread);
            try {
                cb_pph_tools.$current_test_gen_template_reln$.bind(assertions_high.gaf_arg(assertion, lexicon_utilities.denotatum_arg_of_pred_cached(gen_template_pred)), thread);
                return default_test_gen_template_formulas_for_reln(cb_pph_tools.$current_test_gen_template_reln$.getDynamicValue(thread), number);
            }
            finally {
                cb_pph_tools.$current_test_gen_template_reln$.rebind(_prev_bind_0, thread);
            }
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-tools.lisp", position = 18979L)
    public static SubLObject output_batch_paraphrase_results(final SubLObject tests, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_tools.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_pph_tools.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_tools.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_tools.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_pph_tools.T, thread);
            SubLObject bgcolor = (SubLObject)cb_pph_tools.NIL;
            SubLObject err_msg = (SubLObject)cb_pph_tools.NIL;
            SubLObject v_pph_phrase = (SubLObject)cb_pph_tools.NIL;
            SubLObject color_toggle = (SubLObject)cb_pph_tools.NIL;
            SubLObject list_var = (SubLObject)cb_pph_tools.NIL;
            SubLObject test = (SubLObject)cb_pph_tools.NIL;
            SubLObject i = (SubLObject)cb_pph_tools.NIL;
            list_var = tests;
            test = list_var.first();
            for (i = (SubLObject)cb_pph_tools.ZERO_INTEGER; cb_pph_tools.NIL != list_var; list_var = list_var.rest(), test = list_var.first(), i = Numbers.add((SubLObject)cb_pph_tools.ONE_INTEGER, i)) {
                if (cb_pph_tools.NIL != color_toggle) {
                    color_toggle = (SubLObject)cb_pph_tools.NIL;
                }
                else {
                    color_toggle = (SubLObject)cb_pph_tools.T;
                }
                bgcolor = ((cb_pph_tools.NIL != color_toggle) ? html_macros.$html_color_lightest_grey$.getGlobalValue() : html_macros.$html_color_white$.getGlobalValue());
                try {
                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0_$60 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind((SubLObject)cb_pph_tools.$sym56$CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            final SubLObject old_grace_period = delayed_processor.delayed_processor_get_delay_seconds(pph_phrase.pph_phrase_destroyer());
                            pph_phrase.set_pph_phrase_destruction_grace_period(Numbers.max(old_grace_period, (SubLObject)cb_pph_tools.$int59$300));
                            final SubLObject _prev_bind_0_$61 = pph_vars.$bypass_pph_phrase_destroyerP$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = pph_macros.$new_pph_phrases$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
                            try {
                                pph_vars.$bypass_pph_phrase_destroyerP$.bind((SubLObject)cb_pph_tools.NIL, thread);
                                pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
                                pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
                                pph_macros.$destroy_new_pph_phrasesP$.bind((SubLObject)cb_pph_tools.T, thread);
                                try {
                                    final SubLObject force = (SubLObject)cb_pph_tools.$kw67$DECLARATIVE;
                                    final SubLObject _prev_bind_0_$62 = pph_vars.$pph_problem_reporting_mode$.currentBinding(thread);
                                    try {
                                        pph_vars.$pph_problem_reporting_mode$.bind((SubLObject)((cb_pph_tools.NIL != pph_vars.pph_problem_reporting_on_p()) ? pph_vars.$pph_problem_reporting_mode$.getDynamicValue(thread) : cb_pph_tools.$kw60$QUIET), thread);
                                        v_pph_phrase = pph_methods_formulas.new_pph_phrase_for_formula_and_gen_template_assertion(test, assertion, force);
                                    }
                                    finally {
                                        pph_vars.$pph_problem_reporting_mode$.rebind(_prev_bind_0_$62, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$63 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_pph_tools.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        pph_macros.destroy_new_pph_phrases();
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$63, thread);
                                    }
                                }
                            }
                            finally {
                                pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_4, thread);
                                pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_3, thread);
                                pph_macros.$new_pph_phrases$.rebind(_prev_bind_2, thread);
                                pph_vars.$bypass_pph_phrase_destroyerP$.rebind(_prev_bind_0_$61, thread);
                            }
                            pph_phrase.set_pph_phrase_destruction_grace_period(old_grace_period);
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)cb_pph_tools.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$60, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    err_msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                }
                finally {
                    thread.throwStack.pop();
                }
                if (cb_pph_tools.NIL == err_msg && cb_pph_tools.NIL == pph_phrase.pph_phrase_p(v_pph_phrase, (SubLObject)cb_pph_tools.UNPROVIDED)) {
                    err_msg = (SubLObject)cb_pph_tools.$str55$Couldn_t_paraphrase_formula_with_;
                }
                final SubLObject base_style = (SubLObject)cb_pph_tools.$str97$padding_top_5px__padding_bottom_5;
                final SubLObject num_style = Sequences.cconcatenate(base_style, (SubLObject)cb_pph_tools.$str98$__min_width_2em__padding_right_0_);
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                if (cb_pph_tools.NIL != bgcolor) {
                    html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_tools.UNPROVIDED);
                    html_utilities.html_markup(bgcolor);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_tools.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_tools.UNPROVIDED);
                final SubLObject _prev_bind_0_$64 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_pph_tools.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_tools.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_pph_tools.$kw99$RIGHT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_tools.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_tools.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_pph_tools.$kw100$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_tools.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$65 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_pph_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_div_style$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_tools.UNPROVIDED);
                        html_utilities.html_markup(num_style);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$66 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_pph_tools.T, thread);
                            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_pph_tools.$str101$_D_, number_utilities.f_1X(i));
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$66, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$65, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_tools.UNPROVIDED);
                    final SubLObject _prev_bind_0_$67 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_pph_tools.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_div_style$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_tools.UNPROVIDED);
                        html_utilities.html_markup(base_style);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_tools.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_tools.UNPROVIDED);
                        final SubLObject _prev_bind_0_$68 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_pph_tools.T, thread);
                            if (cb_pph_tools.NIL != v_pph_phrase) {
                                cb_utilities.cb_form(v_pph_phrase, (SubLObject)cb_pph_tools.UNPROVIDED, (SubLObject)cb_pph_tools.UNPROVIDED);
                            }
                            else if (cb_pph_tools.NIL != err_msg) {
                                final SubLObject color_val = (SubLObject)cb_pph_tools.$kw50$RED;
                                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                if (cb_pph_tools.NIL != color_val) {
                                    html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_tools.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(color_val));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_tools.UNPROVIDED);
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_tools.UNPROVIDED);
                                final SubLObject _prev_bind_0_$69 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_pph_tools.T, thread);
                                    html_utilities.html_princ_strong(err_msg);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$69, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            }
                            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_tools.UNPROVIDED);
                            final SubLObject _prev_bind_0_$70 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_pph_tools.T, thread);
                                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_tools.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_pph_tools.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_tools.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_tools.UNPROVIDED);
                                final SubLObject _prev_bind_0_$71 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_pph_tools.T, thread);
                                    cb_utilities.cb_form(test, (SubLObject)cb_pph_tools.ZERO_INTEGER, (SubLObject)cb_pph_tools.T);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$71, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$70, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$68, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$67, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$64, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_pph_tools.UNPROVIDED);
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)cb_pph_tools.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-tools.lisp", position = 20474L)
    public static SubLObject cb_test_gen_template_jira_link(SubLObject phrase, SubLObject assertion, SubLObject formula) {
        if (phrase == cb_pph_tools.UNPROVIDED) {
            phrase = (SubLObject)cb_pph_tools.NIL;
        }
        if (assertion == cb_pph_tools.UNPROVIDED) {
            assertion = (SubLObject)cb_pph_tools.NIL;
        }
        if (formula == cb_pph_tools.UNPROVIDED) {
            formula = (SubLObject)cb_pph_tools.NIL;
        }
        return Functions.funcall((SubLObject)SubLObjectFactory.makeSymbol("CB-JIRA-LINK"), create_test_gen_template_jira_issue_url(phrase, assertion, formula));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-tools.lisp", position = 20826L)
    public static SubLObject create_test_gen_template_jira_issue_url(SubLObject phrase, SubLObject assertion, SubLObject formula) {
        if (phrase == cb_pph_tools.UNPROVIDED) {
            phrase = (SubLObject)cb_pph_tools.NIL;
        }
        if (assertion == cb_pph_tools.UNPROVIDED) {
            assertion = (SubLObject)cb_pph_tools.NIL;
        }
        if (formula == cb_pph_tools.UNPROVIDED) {
            formula = (SubLObject)cb_pph_tools.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject summary = create_test_gen_template_issue_description(phrase, assertion, formula);
        final SubLObject description = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Functions.funcall((SubLObject)SubLObjectFactory.makeSymbol("CREATE-JIRA-ISSUE-URL"), summary, description, (SubLObject)cb_pph_tools.$list102);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-tools.lisp", position = 21367L)
    public static SubLObject create_test_gen_template_issue_description(SubLObject phrase, SubLObject assertion, SubLObject formula) {
        if (phrase == cb_pph_tools.UNPROVIDED) {
            phrase = (SubLObject)cb_pph_tools.NIL;
        }
        if (assertion == cb_pph_tools.UNPROVIDED) {
            assertion = (SubLObject)cb_pph_tools.NIL;
        }
        if (formula == cb_pph_tools.UNPROVIDED) {
            formula = (SubLObject)cb_pph_tools.NIL;
        }
        SubLObject summary = (SubLObject)cb_pph_tools.NIL;
        SubLObject description = (SubLObject)cb_pph_tools.NIL;
        SubLObject s = (SubLObject)cb_pph_tools.NIL;
        try {
            s = streams_high.make_private_string_output_stream();
            PrintLow.format(s, (SubLObject)cb_pph_tools.$str103$Problem_with_genTemplate_paraphra);
            if (cb_pph_tools.NIL != assertion) {
                PrintLow.format(s, (SubLObject)cb_pph_tools.$str104$_for__A, misc_kb_utilities.coerce_name(assertions_high.gaf_arg1(assertion)));
            }
            summary = streams_high.get_output_stream_string(s);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)cb_pph_tools.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(s, (SubLObject)cb_pph_tools.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        s = (SubLObject)cb_pph_tools.NIL;
        try {
            s = streams_high.make_private_string_output_stream();
            if (cb_pph_tools.NIL != phrase) {
                PrintLow.format(s, (SubLObject)cb_pph_tools.$str105$Result____A, pph_string.pph_string_to_output_format(pph_phrase.pph_phrase_string(phrase, (SubLObject)cb_pph_tools.UNPROVIDED), (SubLObject)cb_pph_tools.$kw106$HTML));
            }
            if (cb_pph_tools.NIL != assertion) {
                PrintLow.format(s, (SubLObject)cb_pph_tools.$str107$____Generation_Assertion____A, format_cycl_expression.get_pretty_formatted_string(assertions_high.gaf_formula(assertion), (SubLObject)cb_pph_tools.UNPROVIDED, (SubLObject)cb_pph_tools.UNPROVIDED));
            }
            if (cb_pph_tools.NIL != formula) {
                PrintLow.format(s, (SubLObject)cb_pph_tools.$str108$____Test_Formula____A, format_cycl_expression.get_pretty_formatted_string(formula, (SubLObject)cb_pph_tools.UNPROVIDED, (SubLObject)cb_pph_tools.UNPROVIDED));
            }
            description = streams_high.get_output_stream_string(s);
        }
        finally {
            final SubLObject _prev_bind_2 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)cb_pph_tools.T);
                final SubLObject _values2 = Values.getValuesAsVector();
                streams_high.close(s, (SubLObject)cb_pph_tools.UNPROVIDED);
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_2);
            }
        }
        return Values.values(summary, description);
    }
    
    public static SubLObject declare_cb_pph_tools_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_tools", "cb_link_test_gen_template", "CB-LINK-TEST-GEN-TEMPLATE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_tools", "cb_test_gen_template", "CB-TEST-GEN-TEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_tools", "cb_handle_test_gen_template", "CB-HANDLE-TEST-GEN-TEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_tools", "cb_test_gen_template_int", "CB-TEST-GEN-TEMPLATE-INT", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_tools", "cb_test_gen_template_batch_int", "CB-TEST-GEN-TEMPLATE-BATCH-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_tools", "cb_test_button", "CB-TEST-BUTTON", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_tools", "gen_template_test_phrase", "GEN-TEMPLATE-TEST-PHRASE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_tools", "validate_gen_template_test_formula", "VALIDATE-GEN-TEMPLATE-TEST-FORMULA", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_tools", "default_force_for_gen_template_assertion", "DEFAULT-FORCE-FOR-GEN-TEMPLATE-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_tools", "cb_batch_button", "CB-BATCH-BUTTON", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_tools", "formula_okay_for_gen_template_testP", "FORMULA-OKAY-FOR-GEN-TEMPLATE-TEST?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_tools", "default_test_formula_for_gen_template", "DEFAULT-TEST-FORMULA-FOR-GEN-TEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_tools", "default_test_gen_template_constrained", "DEFAULT-TEST-GEN-TEMPLATE-CONSTRAINED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_tools", "default_test_gen_template_constrained_batch", "DEFAULT-TEST-GEN-TEMPLATE-CONSTRAINED-BATCH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_tools", "default_test_gen_template_with_best_bindings_phrase", "DEFAULT-TEST-GEN-TEMPLATE-WITH-BEST-BINDINGS-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_tools", "default_test_gen_template_with_best_bindings_phrase_batch", "DEFAULT-TEST-GEN-TEMPLATE-WITH-BEST-BINDINGS-PHRASE-BATCH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_tools", "default_test_gen_template_query_sentence", "DEFAULT-TEST-GEN-TEMPLATE-QUERY-SENTENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_tools", "default_test_gen_template_formula_for_reln", "DEFAULT-TEST-GEN-TEMPLATE-FORMULA-FOR-RELN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_tools", "default_test_gen_template_formulas_for_reln", "DEFAULT-TEST-GEN-TEMPLATE-FORMULAS-FOR-RELN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_tools", "gather_batch_paraphrase_formulas", "GATHER-BATCH-PARAPHRASE-FORMULAS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_tools", "output_batch_paraphrase_results", "OUTPUT-BATCH-PARAPHRASE-RESULTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_tools", "cb_test_gen_template_jira_link", "CB-TEST-GEN-TEMPLATE-JIRA-LINK", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_tools", "create_test_gen_template_jira_issue_url", "CREATE-TEST-GEN-TEMPLATE-JIRA-ISSUE-URL", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_tools", "create_test_gen_template_issue_description", "CREATE-TEST-GEN-TEMPLATE-ISSUE-DESCRIPTION", 0, 3, false);
        return (SubLObject)cb_pph_tools.NIL;
    }
    
    public static SubLObject init_cb_pph_tools_file() {
        cb_pph_tools.$test_current_formula$ = SubLFiles.deflexical("*TEST-CURRENT-FORMULA*", (SubLObject)cb_pph_tools.$str11$Test_Current_Formula);
        cb_pph_tools.$batch_test$ = SubLFiles.deflexical("*BATCH-TEST*", (SubLObject)cb_pph_tools.$str12$Batch_Test);
        cb_pph_tools.$current_test_gen_template_reln$ = SubLFiles.defparameter("*CURRENT-TEST-GEN-TEMPLATE-RELN*", misc_utilities.uninitialized());
        return (SubLObject)cb_pph_tools.NIL;
    }
    
    public static SubLObject setup_cb_pph_tools_file() {
        cb_utilities.setup_cb_link_method((SubLObject)cb_pph_tools.$kw3$TEST_GEN_TEMPLATE, (SubLObject)cb_pph_tools.$sym4$CB_LINK_TEST_GEN_TEMPLATE, (SubLObject)cb_pph_tools.THREE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_pph_tools.$sym7$CB_TEST_GEN_TEMPLATE, (SubLObject)cb_pph_tools.$kw8$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_pph_tools.$sym10$CB_HANDLE_TEST_GEN_TEMPLATE, (SubLObject)cb_pph_tools.$kw8$HTML_HANDLER);
        return (SubLObject)cb_pph_tools.NIL;
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
        me = (SubLFile)new cb_pph_tools();
        cb_pph_tools.$test_current_formula$ = null;
        cb_pph_tools.$batch_test$ = null;
        cb_pph_tools.$current_test_gen_template_reln$ = null;
        $str0$_Test_Paraphrase_ = SubLObjectFactory.makeString("[Test Paraphrase]");
        $kw1$SELF = SubLObjectFactory.makeKeyword("SELF");
        $str2$cb_test_gen_template__A = SubLObjectFactory.makeString("cb-test-gen-template&~A");
        $kw3$TEST_GEN_TEMPLATE = SubLObjectFactory.makeKeyword("TEST-GEN-TEMPLATE");
        $sym4$CB_LINK_TEST_GEN_TEMPLATE = SubLObjectFactory.makeSymbol("CB-LINK-TEST-GEN-TEMPLATE");
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"));
        $str6$_S_did_not_specify_an_assertion_ = SubLObjectFactory.makeString("~S did not specify an assertion.");
        $sym7$CB_TEST_GEN_TEMPLATE = SubLObjectFactory.makeSymbol("CB-TEST-GEN-TEMPLATE");
        $kw8$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $str9$batch = SubLObjectFactory.makeString("batch");
        $sym10$CB_HANDLE_TEST_GEN_TEMPLATE = SubLObjectFactory.makeSymbol("CB-HANDLE-TEST-GEN-TEMPLATE");
        $str11$Test_Current_Formula = SubLObjectFactory.makeString("Test Current Formula");
        $str12$Batch_Test = SubLObjectFactory.makeString("Batch Test");
        $str13$Test_Paraphrase_Template = SubLObjectFactory.makeString("Test Paraphrase Template");
        $str14$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str15$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw16$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $kw17$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $str18$yui_skin_sam = SubLObjectFactory.makeString("yui-skin-sam");
        $str19$post = SubLObjectFactory.makeString("post");
        $str20$id = SubLObjectFactory.makeString("id");
        $str21$Reset_All_Fields = SubLObjectFactory.makeString("Reset All Fields");
        $str22$Back = SubLObjectFactory.makeString("Back");
        $str23$test = SubLObjectFactory.makeString("test");
        $str24$batch_size = SubLObjectFactory.makeString("batch-size");
        $int25$25 = SubLObjectFactory.makeInteger(25);
        $int26$50 = SubLObjectFactory.makeInteger(50);
        $int27$100 = SubLObjectFactory.makeInteger(100);
        $int28$250 = SubLObjectFactory.makeInteger(250);
        $int29$500 = SubLObjectFactory.makeInteger(500);
        $const30$genTemplate_QuerySentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genTemplate-QuerySentence"));
        $str31$Sentential_Force_ = SubLObjectFactory.makeString("Sentential Force:");
        $str32$force = SubLObjectFactory.makeString("force");
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DECLARATIVE"), (SubLObject)SubLObjectFactory.makeKeyword("INTERROGATIVE"));
        $kw34$QUERY = SubLObjectFactory.makeKeyword("QUERY");
        $kw35$ASSERT = SubLObjectFactory.makeKeyword("ASSERT");
        $kw36$INPUT_NAME = SubLObjectFactory.makeKeyword("INPUT-NAME");
        $str37$formula = SubLObjectFactory.makeString("formula");
        $kw38$PRETTY_NAME = SubLObjectFactory.makeKeyword("PRETTY-NAME");
        $str39$Formula = SubLObjectFactory.makeString("Formula");
        $kw40$COMPLETE_LABEL = SubLObjectFactory.makeKeyword("COMPLETE-LABEL");
        $str41$Complete = SubLObjectFactory.makeString("Complete");
        $kw42$CYCLIFY_LABEL = SubLObjectFactory.makeKeyword("CYCLIFY-LABEL");
        $str43$Cyclify = SubLObjectFactory.makeString("Cyclify");
        $kw44$CLEAR_LABEL = SubLObjectFactory.makeKeyword("CLEAR-LABEL");
        $str45$Clear = SubLObjectFactory.makeString("Clear");
        $kw46$HEIGHT = SubLObjectFactory.makeKeyword("HEIGHT");
        $kw47$WIDTH = SubLObjectFactory.makeKeyword("WIDTH");
        $int48$80 = SubLObjectFactory.makeInteger(80);
        $kw49$MODE = SubLObjectFactory.makeKeyword("MODE");
        $kw50$RED = SubLObjectFactory.makeKeyword("RED");
        $str51$_br_ = SubLObjectFactory.makeString("<br>");
        $str52$Result_ = SubLObjectFactory.makeString("Result:");
        $str53$Test_Paraphrase_Template___Batch = SubLObjectFactory.makeString("Test Paraphrase Template - Batch");
        $list54 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT-NAME"), (SubLObject)SubLObjectFactory.makeString("formula"));
        $str55$Couldn_t_paraphrase_formula_with_ = SubLObjectFactory.makeString("Couldn't paraphrase formula with assertion.");
        $sym56$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $sym57$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ = SubLObjectFactory.makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");
        $list58 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), (SubLObject)cb_pph_tools.NIL);
        $int59$300 = SubLObjectFactory.makeInteger(300);
        $kw60$QUIET = SubLObjectFactory.makeKeyword("QUIET");
        $sym61$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $const62$genTemplate_Constrained = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genTemplate-Constrained"));
        $str63$Formula_does_not_meet_this_assert = SubLObjectFactory.makeString("Formula does not meet this assertion's constraints.");
        $list64 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genTemplate-Constrained")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genTemplate")));
        $str65$_S_does_not_use__S_as_the_arg0_ = SubLObjectFactory.makeString("~S does not use ~S as the arg0.");
        $kw66$INTERROGATIVE = SubLObjectFactory.makeKeyword("INTERROGATIVE");
        $kw67$DECLARATIVE = SubLObjectFactory.makeKeyword("DECLARATIVE");
        $kw68$NONE = SubLObjectFactory.makeKeyword("NONE");
        $sym69$HYPOTHETICAL_TERM_P = SubLObjectFactory.makeSymbol("HYPOTHETICAL-TERM-P");
        $sym70$SKOLEM_FORT_P = SubLObjectFactory.makeSymbol("SKOLEM-FORT-P");
        $sym71$FORMULA_ARG0 = SubLObjectFactory.makeSymbol("FORMULA-ARG0");
        $sym72$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $list73 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("RECIPE"));
        $const74$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $list75 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)cb_pph_tools.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("MAX-TIME"), (SubLObject)cb_pph_tools.TWO_INTEGER);
        $kw76$MAX_NUMBER = SubLObjectFactory.makeKeyword("MAX-NUMBER");
        $list77 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-TIME"), (SubLObject)cb_pph_tools.FIFTEEN_INTEGER);
        $str78$Query_timed_out = SubLObjectFactory.makeString("Query timed out");
        $str79$Something_went_wrong = SubLObjectFactory.makeString("Something went wrong");
        $list80 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)cb_pph_tools.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("MAX-TIME"), (SubLObject)cb_pph_tools.ONE_INTEGER);
        $list81 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("RECIPE"));
        $list82 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("RECIPE"));
        $sym83$EL_VAR_ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $sym84$VARIABLE_BINDING_VARIABLE = SubLObjectFactory.makeSymbol("VARIABLE-BINDING-VARIABLE");
        $kw85$MAX_TIME = SubLObjectFactory.makeKeyword("MAX-TIME");
        $kw86$ANSWER_LANGUAGE = SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE");
        $kw87$EL = SubLObjectFactory.makeKeyword("EL");
        $const88$exampleSentences = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("exampleSentences"));
        $kw89$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $list90 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)cb_pph_tools.ONE_INTEGER);
        $kw91$GAF = SubLObjectFactory.makeKeyword("GAF");
        $const92$denotes = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotes"));
        $list93 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuasiQuote")), (SubLObject)SubLObjectFactory.makeSymbol("?FORMULA"));
        $sym94$_FORMULA = SubLObjectFactory.makeSymbol("?FORMULA");
        $list95 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-TIME"), (SubLObject)cb_pph_tools.FIFTEEN_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("EL"));
        $sym96$FORMULA_OKAY_FOR_GEN_TEMPLATE_TEST_ = SubLObjectFactory.makeSymbol("FORMULA-OKAY-FOR-GEN-TEMPLATE-TEST?");
        $str97$padding_top_5px__padding_bottom_5 = SubLObjectFactory.makeString("padding-top:5px; padding-bottom:5px");
        $str98$__min_width_2em__padding_right_0_ = SubLObjectFactory.makeString("; min-width:2em; padding-right:0.3em");
        $kw99$RIGHT = SubLObjectFactory.makeKeyword("RIGHT");
        $kw100$TOP = SubLObjectFactory.makeKeyword("TOP");
        $str101$_D_ = SubLObjectFactory.makeString("~D.");
        $list102 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PID"), (SubLObject)SubLObjectFactory.makeInteger(10800), (SubLObject)SubLObjectFactory.makeKeyword("ISSUETYPE"), (SubLObject)cb_pph_tools.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("PRIORITY"), (SubLObject)cb_pph_tools.THREE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("ASSIGNEE"), (SubLObject)SubLObjectFactory.makeString("jessica"));
        $str103$Problem_with_genTemplate_paraphra = SubLObjectFactory.makeString("Problem with genTemplate paraphrase");
        $str104$_for__A = SubLObjectFactory.makeString(" for ~A");
        $str105$Result____A = SubLObjectFactory.makeString("Result:~%~A");
        $kw106$HTML = SubLObjectFactory.makeKeyword("HTML");
        $str107$____Generation_Assertion____A = SubLObjectFactory.makeString("~%~%Generation Assertion:~%~A");
        $str108$____Test_Formula____A = SubLObjectFactory.makeString("~%~%Test Formula:~%~A");
    }
}

/*

	Total time: 1164 ms
	
*/