package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.inference.browser.cb_query;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_random_thoughts extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cb_random_thoughts";
    public static final String myFingerPrint = "6a01f7c660586c6cc381d730523892c59ce5655047ca12a8ca2335896cf8f60b";
    @SubLTranslatedFile.SubL(source = "cycl/cb-random-thoughts.lisp", position = 5062L)
    private static SubLSymbol $random_thought_cyclists$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-random-thoughts.lisp", position = 5329L)
    private static SubLSymbol $random_thought_refresh_rate$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-random-thoughts.lisp", position = 6993L)
    private static SubLSymbol $cb_random_thoughts_evaluation_options$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-random-thoughts.lisp", position = 8574L)
    private static SubLSymbol $assert_random_thought_judgmentsP$;
    private static final SubLString $str0$_Random_Thought_;
    private static final SubLSymbol $kw1$MAIN;
    private static final SubLString $str2$cb_random_thoughts;
    private static final SubLSymbol $kw3$RANDOM_THOUGHT;
    private static final SubLSymbol $sym4$CB_LINK_RANDOM_THOUGHT;
    private static final SubLSymbol $sym5$CB_RANDOM_THOUGHTS;
    private static final SubLSymbol $kw6$HTML_HANDLER;
    private static final SubLObject $const7$Guest;
    private static final SubLString $str8$the_Random_Thought_Generator;
    private static final SubLList $list9;
    private static final SubLList $list10;
    private static final SubLString $str11$Random_Thoughts;
    private static final SubLString $str12$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str13$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw14$UNINITIALIZED;
    private static final SubLSymbol $kw15$CB_CYC;
    private static final SubLSymbol $kw16$SAM_AUTOCOMPLETE_CSS;
    private static final SubLSymbol $kw17$SHA1;
    private static final SubLString $str18$yui_skin_sam;
    private static final SubLString $str19$reloadFrameButton;
    private static final SubLString $str20$button;
    private static final SubLString $str21$reload;
    private static final SubLString $str22$Refresh_Frames;
    private static final SubLString $str23$post;
    private static final SubLString $str24$cb_handle_random_thoughts;
    private static final SubLString $str25$term;
    private static final SubLString $str26$assertion_id;
    private static final SubLString $str27$CycL__;
    private static final SubLSymbol $kw28$NEW;
    private static final SubLString $str29$New_;
    private static final SubLSymbol $kw30$RELATED;
    private static final SubLString $str31$Related_;
    private static final SubLSymbol $kw32$SAME;
    private static final SubLString $str33$Same_;
    private static final SubLString $str34$;
    private static final SubLString $str35$Topic__;
    private static final SubLString $str36$New_Thought;
    private static final SubLString $str37$new_thought;
    private static final SubLSymbol $kw38$DARK_GRAY;
    private static final SubLString $str39$_I_have_shared__S_random_thoughts;
    private static final SubLString $str40$_I_have_thought_of__S_more_things;
    private static final SubLSymbol $kw41$UNKNOWN;
    private static final SubLSymbol $sym42$CB_HANDLE_RANDOM_THOUGHTS;
    private static final SubLList $list43;
    private static final SubLList $list44;
    private static final SubLSymbol $sym45$CB_RANDOM_THOUGHT_FRAME;
    private static final SubLSymbol $kw46$TOPIC;
    private static final SubLList $list47;
    private static final SubLList $list48;
    private static final SubLString $str49$cb_handle_random_thought_frame;
    private static final SubLString $str50$cyclist;
    private static final SubLString $str51$paraphrase;
    private static final SubLString $str52$topic;
    private static final SubLString $str53$position__absolute__bottom__0pt;
    private static final SubLList $list54;
    private static final SubLString $str55$100_;
    private static final SubLString $str56$center;
    private static final SubLList $list57;
    private static final SubLString $str58$Skip;
    private static final SubLSymbol $kw59$CENTER;
    private static final SubLString $str60$right;
    private static final SubLString $str61$Your_evaluation__;
    private static final SubLString $str62$left;
    private static final SubLSymbol $kw63$RANDOM_THOUGHT_FRAME;
    private static final SubLString $str64$_New_Random_Thought_;
    private static final SubLSymbol $kw65$SELF;
    private static final SubLString $str66$cb_random_thought_frame__A__A;
    private static final SubLSymbol $sym67$CB_LINK_RANDOM_THOUGHT_FRAME;
    private static final SubLList $list68;
    private static final SubLObject $const69$CycRandomThoughtEvaluationTool;
    private static final SubLObject $const70$EvaluationOfByOnFn;
    private static final SubLObject $const71$evaluationInput;
    private static final SubLObject $const72$evaluationOfAs;
    private static final SubLObject $const73$EvaluatedSentencesFromRandomThoug;
    private static final SubLSymbol $sym74$CB_HANDLE_RANDOM_THOUGHT_FRAME;
    private static final SubLInteger $int75$3600;
    private static final SubLString $str76$cb_random_thought_frame_;
    private static final SubLString $str77$_;
    private static final SubLString $str78$random_thought;
    private static final SubLInteger $int79$75;
    private static final SubLSymbol $kw80$RIGHT;
    private static final SubLString $str81$no;
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-random-thoughts.lisp", position = 877L)
    public static SubLObject cb_link_random_thought(SubLObject linktext) {
        if (linktext == cb_random_thoughts.UNPROVIDED) {
            linktext = (SubLObject)cb_random_thoughts.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_random_thoughts.NIL == linktext) {
            linktext = (SubLObject)cb_random_thoughts.$str0$_Random_Thought_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_random_thoughts.$kw1$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_random_thoughts.$str2$cb_random_thoughts);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
        if (cb_random_thoughts.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_random_thoughts.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_random_thoughts.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_random_thoughts.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-random-thoughts.lisp", position = 1218L)
    public static SubLObject cb_random_thoughts(SubLObject args) {
        if (args == cb_random_thoughts.UNPROVIDED) {
            args = (SubLObject)cb_random_thoughts.NIL;
        }
        return cb_random_thought_for_cyclist(operation_communication.the_cyclist(), (SubLObject)cb_random_thoughts.UNPROVIDED, (SubLObject)cb_random_thoughts.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-random-thoughts.lisp", position = 1347L)
    public static SubLObject cb_random_thought_for_cyclist(final SubLObject cyclist, SubLObject last_term, SubLObject last_assertion_id) {
        if (last_term == cb_random_thoughts.UNPROVIDED) {
            last_term = (SubLObject)cb_random_thoughts.NIL;
        }
        if (last_assertion_id == cb_random_thoughts.UNPROVIDED) {
            last_assertion_id = (SubLObject)cb_random_thoughts.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_random_thoughts.NIL != kb_utilities.kbeq(cyclist, cb_random_thoughts.$const7$Guest)) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_random_thoughts.$str8$the_Random_Thought_Generator);
            return (SubLObject)cb_random_thoughts.NIL;
        }
        final SubLObject thought = random_thought_generator.next_random_thought_for_user(cyclist, (SubLObject)cb_random_thoughts.$list9);
        SubLObject current;
        final SubLObject datum = current = thought;
        SubLObject v_term = (SubLObject)cb_random_thoughts.NIL;
        SubLObject assertion = (SubLObject)cb_random_thoughts.NIL;
        SubLObject javalist = (SubLObject)cb_random_thoughts.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_random_thoughts.$list10);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_random_thoughts.$list10);
        assertion = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_random_thoughts.$list10);
        javalist = current.first();
        current = current.rest();
        if (cb_random_thoughts.NIL == current) {
            final SubLObject assertion_paraphrase = pph_utilities.pph_javalist_string(javalist);
            html_script_utilities.cb_hoverover_page_init();
            final SubLObject title_var = (SubLObject)cb_random_thoughts.$str11$Random_Thoughts;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind((cb_random_thoughts.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_random_thoughts.UNPROVIDED, (SubLObject)cb_random_thoughts.UNPROVIDED, (SubLObject)cb_random_thoughts.UNPROVIDED), thread);
                html_utilities.html_markup((SubLObject)cb_random_thoughts.$str12$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (cb_random_thoughts.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_random_thoughts.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_random_thoughts.$str13$_meta_http_equiv__X_UA_Compatible);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_random_thoughts.UNPROVIDED);
                final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                try {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_random_thoughts.$kw14$UNINITIALIZED) ? ConsesLow.list(cb_random_thoughts.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    cb_parameters.cb_head_shortcut_icon();
                    html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                    cyc_file_dependencies.css((SubLObject)cb_random_thoughts.$kw15$CB_CYC);
                    dhtml_macros.html_basic_cb_scripts();
                    if (cb_random_thoughts.NIL != title_var) {
                        html_utilities.html_source_readability_terpri((SubLObject)cb_random_thoughts.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_utilities.html_princ(title_var);
                        html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    }
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_random_thoughts.UNPROVIDED);
                    final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind((SubLObject)cb_random_thoughts.T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (cb_random_thoughts.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_random_thoughts.$str18$yui_skin_sam);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_random_thoughts.UNPROVIDED);
                        final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_random_thoughts.T, thread);
                            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_random_thoughts.$str19$reloadFrameButton);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_random_thoughts.UNPROVIDED);
                            final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_random_thoughts.T, thread);
                                html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_random_thoughts.$str20$button);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_random_thoughts.$str21$reload);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_random_thoughts.$str22$Refresh_Frames);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                                if (cb_random_thoughts.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                    html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_random_thoughts.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            if (cb_random_thoughts.NIL != title_var) {
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_random_thoughts.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_random_thoughts.UNPROVIDED);
                                html_utilities.html_princ(title_var);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_random_thoughts.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_random_thoughts.UNPROVIDED);
                            }
                            final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_random_thoughts.NIL);
                            html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                            html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_random_thoughts.$str23$post);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                            if (cb_random_thoughts.NIL != frame_name_var) {
                                html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                                html_utilities.html_markup(frame_name_var);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_random_thoughts.UNPROVIDED);
                            final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_random_thoughts.T, thread);
                                html_macros.$within_html_form$.bind((SubLObject)cb_random_thoughts.T, thread);
                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                html_utilities.html_hidden_input((SubLObject)cb_random_thoughts.$str24$cb_handle_random_thoughts, (SubLObject)cb_random_thoughts.T, (SubLObject)cb_random_thoughts.UNPROVIDED);
                                html_utilities.html_hidden_input((SubLObject)cb_random_thoughts.$str25$term, cb_utilities.cb_fort_identifier(v_term), (SubLObject)cb_random_thoughts.UNPROVIDED);
                                if (cb_random_thoughts.NIL != assertion) {
                                    html_utilities.html_hidden_input((SubLObject)cb_random_thoughts.$str26$assertion_id, assertion_handles.assertion_id(assertion), (SubLObject)cb_random_thoughts.UNPROVIDED);
                                }
                                final SubLObject connection_to_last = cb_random_thought_connection_type(v_term, last_term, last_assertion_id);
                                SubLObject hoverover_html = (SubLObject)cb_random_thoughts.NIL;
                                SubLObject stream = (SubLObject)cb_random_thoughts.NIL;
                                try {
                                    stream = streams_high.make_private_string_output_stream();
                                    final SubLObject _prev_bind_0_$6 = html_macros.$html_stream$.currentBinding(thread);
                                    try {
                                        html_macros.$html_stream$.bind(stream, thread);
                                        html_utilities.html_princ((SubLObject)cb_random_thoughts.$str27$CycL__);
                                        cb_utilities.cb_form(v_term, (SubLObject)cb_random_thoughts.UNPROVIDED, (SubLObject)cb_random_thoughts.UNPROVIDED);
                                    }
                                    finally {
                                        html_macros.$html_stream$.rebind(_prev_bind_0_$6, thread);
                                    }
                                    hoverover_html = streams_high.get_output_stream_string(stream);
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_random_thoughts.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        streams_high.close(stream, (SubLObject)cb_random_thoughts.UNPROVIDED);
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                                    }
                                }
                                cb_query.cb_princ_strong_with_explanation(Sequences.cconcatenate(format_nil.format_nil_a_no_copy((SubLObject)((connection_to_last == cb_random_thoughts.$kw28$NEW) ? cb_random_thoughts.$str29$New_ : ((connection_to_last == cb_random_thoughts.$kw30$RELATED) ? cb_random_thoughts.$str31$Related_ : ((connection_to_last == cb_random_thoughts.$kw32$SAME) ? cb_random_thoughts.$str33$Same_ : cb_random_thoughts.$str34$)))), new SubLObject[] { cb_random_thoughts.$str35$Topic__, format_nil.format_nil_s_no_copy(pph_main.generate_phrase(v_term, (SubLObject)cb_random_thoughts.UNPROVIDED, (SubLObject)cb_random_thoughts.UNPROVIDED, (SubLObject)cb_random_thoughts.UNPROVIDED, (SubLObject)cb_random_thoughts.UNPROVIDED, (SubLObject)cb_random_thoughts.UNPROVIDED, (SubLObject)cb_random_thoughts.UNPROVIDED, (SubLObject)cb_random_thoughts.UNPROVIDED)) }), hoverover_html, (SubLObject)cb_random_thoughts.NIL, (SubLObject)cb_random_thoughts.NIL, (SubLObject)cb_random_thoughts.T);
                                html_utilities.html_newline((SubLObject)cb_random_thoughts.TWO_INTEGER);
                                SubLObject hoverover_html2 = (SubLObject)cb_random_thoughts.NIL;
                                SubLObject stream2 = (SubLObject)cb_random_thoughts.NIL;
                                try {
                                    stream2 = streams_high.make_private_string_output_stream();
                                    final SubLObject _prev_bind_0_$8 = html_macros.$html_stream$.currentBinding(thread);
                                    try {
                                        html_macros.$html_stream$.bind(stream2, thread);
                                        html_utilities.html_princ((SubLObject)cb_random_thoughts.$str27$CycL__);
                                        cb_utilities.cb_form(assertion, (SubLObject)cb_random_thoughts.UNPROVIDED, (SubLObject)cb_random_thoughts.UNPROVIDED);
                                    }
                                    finally {
                                        html_macros.$html_stream$.rebind(_prev_bind_0_$8, thread);
                                    }
                                    hoverover_html2 = streams_high.get_output_stream_string(stream2);
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_random_thoughts.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        streams_high.close(stream2, (SubLObject)cb_random_thoughts.UNPROVIDED);
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_emphasized_head$.getGlobalValue());
                                cb_query.cb_princ_with_explanation(assertion_paraphrase, hoverover_html2, (SubLObject)cb_random_thoughts.NIL, (SubLObject)cb_random_thoughts.NIL, (SubLObject)cb_random_thoughts.T);
                                html_utilities.html_markup(html_macros.$html_emphasized_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                html_utilities.html_newline((SubLObject)cb_random_thoughts.UNPROVIDED);
                                html_utilities.html_newline((SubLObject)cb_random_thoughts.TWO_INTEGER);
                                html_utilities.html_submit_input((SubLObject)cb_random_thoughts.$str36$New_Thought, (SubLObject)cb_random_thoughts.$str37$new_thought, (SubLObject)cb_random_thoughts.UNPROVIDED);
                                html_utilities.html_newline((SubLObject)cb_random_thoughts.TWO_INTEGER);
                                SubLObject color_val = (SubLObject)cb_random_thoughts.$kw38$DARK_GRAY;
                                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                if (cb_random_thoughts.NIL != color_val) {
                                    html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(color_val));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_random_thoughts.UNPROVIDED);
                                final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_random_thoughts.T, thread);
                                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_random_thoughts.$str39$_I_have_shared__S_random_thoughts, random_thought_generator.number_of_used_random_thoughts_for_user(cyclist));
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                html_utilities.html_newline((SubLObject)cb_random_thoughts.UNPROVIDED);
                                color_val = (SubLObject)cb_random_thoughts.$kw38$DARK_GRAY;
                                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                if (cb_random_thoughts.NIL != color_val) {
                                    html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(color_val));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_random_thoughts.UNPROVIDED);
                                final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_random_thoughts.T, thread);
                                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_random_thoughts.$str40$_I_have_thought_of__S_more_things, random_thought_generator.number_of_queued_random_thoughts_for_user(cyclist));
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                html_utilities.html_newline((SubLObject)cb_random_thoughts.UNPROVIDED);
                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                            }
                            finally {
                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_random_thoughts.UNPROVIDED);
                            html_utilities.html_copyright_notice();
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_random_thoughts.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$2, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                }
                finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$1, thread);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_random_thoughts.UNPROVIDED);
            }
            finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_random_thoughts.$list10);
        }
        return (SubLObject)cb_random_thoughts.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-random-thoughts.lisp", position = 3676L)
    public static SubLObject cb_show_random_thought(final SubLObject assertion, final SubLObject assertion_paraphrase, SubLObject linksP, SubLObject sticky_hoveroverP) {
        if (linksP == cb_random_thoughts.UNPROVIDED) {
            linksP = (SubLObject)cb_random_thoughts.T;
        }
        if (sticky_hoveroverP == cb_random_thoughts.UNPROVIDED) {
            sticky_hoveroverP = (SubLObject)cb_random_thoughts.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hoverover_html = (SubLObject)cb_random_thoughts.NIL;
        SubLObject stream = (SubLObject)cb_random_thoughts.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
            try {
                html_macros.$html_stream$.bind(stream, thread);
                html_utilities.html_princ((SubLObject)cb_random_thoughts.$str27$CycL__);
                if (cb_random_thoughts.NIL != linksP) {
                    cb_utilities.cb_form(assertion, (SubLObject)cb_random_thoughts.UNPROVIDED, (SubLObject)cb_random_thoughts.UNPROVIDED);
                }
                else {
                    html_utilities.html_princ(assertions_high.assertion_ist_formula(assertion));
                }
            }
            finally {
                html_macros.$html_stream$.rebind(_prev_bind_0, thread);
            }
            hoverover_html = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_random_thoughts.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)cb_random_thoughts.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_emphasized_head$.getGlobalValue());
        cb_query.cb_princ_with_explanation(assertion_paraphrase, hoverover_html, (SubLObject)cb_random_thoughts.NIL, (SubLObject)cb_random_thoughts.NIL, sticky_hoveroverP);
        html_utilities.html_markup(html_macros.$html_emphasized_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-random-thoughts.lisp", position = 4165L)
    public static SubLObject cb_random_thought_connection_type(final SubLObject v_term, final SubLObject last_term, final SubLObject last_assertion_id) {
        if (cb_random_thoughts.NIL == last_term) {
            return (SubLObject)cb_random_thoughts.$kw41$UNKNOWN;
        }
        if (v_term.eql(last_term)) {
            return (SubLObject)cb_random_thoughts.$kw32$SAME;
        }
        if (cb_random_thoughts.NIL == last_assertion_id) {
            return (SubLObject)cb_random_thoughts.$kw28$NEW;
        }
        if (cb_random_thoughts.NIL != cycl_utilities.expression_find(v_term, assertion_handles.find_assertion_by_id(last_assertion_id), (SubLObject)cb_random_thoughts.T, (SubLObject)cb_random_thoughts.UNPROVIDED, (SubLObject)cb_random_thoughts.UNPROVIDED)) {
            return (SubLObject)cb_random_thoughts.$kw30$RELATED;
        }
        return (SubLObject)cb_random_thoughts.$kw28$NEW;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-random-thoughts.lisp", position = 4498L)
    public static SubLObject cb_handle_random_thoughts(final SubLObject args) {
        final SubLObject term_id = html_utilities.html_extract_input((SubLObject)cb_random_thoughts.$str25$term, args);
        final SubLObject v_term = (SubLObject)(term_id.isString() ? cb_utilities.cb_guess_fort(term_id, (SubLObject)cb_random_thoughts.UNPROVIDED) : cb_random_thoughts.NIL);
        final SubLObject assertion_id_string = html_utilities.html_extract_input((SubLObject)cb_random_thoughts.$str26$assertion_id, args);
        final SubLObject assertion_id = (SubLObject)(assertion_id_string.isString() ? reader.read_from_string(assertion_id_string, (SubLObject)cb_random_thoughts.UNPROVIDED, (SubLObject)cb_random_thoughts.UNPROVIDED, (SubLObject)cb_random_thoughts.UNPROVIDED, (SubLObject)cb_random_thoughts.UNPROVIDED, (SubLObject)cb_random_thoughts.UNPROVIDED) : cb_random_thoughts.NIL);
        return cb_random_thought_for_cyclist(operation_communication.the_cyclist(), v_term, assertion_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-random-thoughts.lisp", position = 5187L)
    public static SubLObject show_random_thought_for_user_and_topic_p(final SubLObject user, final SubLObject topic) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cb_random_thoughts.NIL != forts.fort_p(topic) && cb_random_thoughts.NIL != conses_high.member(user, cb_random_thoughts.$random_thought_cyclists$.getGlobalValue(), (SubLObject)cb_random_thoughts.UNPROVIDED, (SubLObject)cb_random_thoughts.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-random-thoughts.lisp", position = 5384L)
    public static SubLObject cb_random_thought_frame(final SubLObject args) {
        SubLObject cyclist_string = (SubLObject)cb_random_thoughts.NIL;
        SubLObject topic_string = (SubLObject)cb_random_thoughts.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_random_thoughts.$list44);
        cyclist_string = args.first();
        SubLObject current = args.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, args, (SubLObject)cb_random_thoughts.$list44);
        topic_string = current.first();
        current = current.rest();
        if (cb_random_thoughts.NIL == current) {
            final SubLObject cyclist = cb_utilities.cb_guess_fort(cyclist_string, (SubLObject)cb_random_thoughts.UNPROVIDED);
            final SubLObject topic = cb_utilities.cb_guess_fort(topic_string, (SubLObject)cb_random_thoughts.UNPROVIDED);
            return cb_random_thought_retrieve_and_display(cyclist, topic);
        }
        cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_random_thoughts.$list44);
        return (SubLObject)cb_random_thoughts.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-random-thoughts.lisp", position = 5659L)
    public static SubLObject cb_random_thought_retrieve_and_display(final SubLObject cyclist, final SubLObject topic) {
        SubLObject thought = (SubLObject)cb_random_thoughts.NIL;
        html_utilities.html_refresh(cb_random_thoughts.$random_thought_refresh_rate$.getGlobalValue(), (SubLObject)cb_random_thoughts.UNPROVIDED);
        thought = random_thought_generator.next_random_thought_for_user(cyclist, (SubLObject)ConsesLow.listS((SubLObject)cb_random_thoughts.$kw46$TOPIC, topic, (SubLObject)cb_random_thoughts.$list47));
        if (cb_random_thoughts.NIL != random_thought_generator.non_empty_random_thought_p(thought)) {
            SubLObject current;
            final SubLObject datum = current = thought;
            SubLObject topic_$12 = (SubLObject)cb_random_thoughts.NIL;
            SubLObject assertion = (SubLObject)cb_random_thoughts.NIL;
            SubLObject assertion_paraphrase = (SubLObject)cb_random_thoughts.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_random_thoughts.$list48);
            topic_$12 = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_random_thoughts.$list48);
            assertion = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_random_thoughts.$list48);
            assertion_paraphrase = current.first();
            current = current.rest();
            if (cb_random_thoughts.NIL == current) {
                return cb_random_thought_frame_internal(cyclist, topic_$12, assertion, assertion_paraphrase, (SubLObject)cb_random_thoughts.UNPROVIDED);
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_random_thoughts.$list48);
        }
        return (SubLObject)cb_random_thoughts.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-random-thoughts.lisp", position = 6148L)
    public static SubLObject cb_random_thought_frame_internal(final SubLObject cyclist, final SubLObject topic, final SubLObject assertion, final SubLObject assertion_paraphrase, SubLObject evaluation) {
        if (evaluation == cb_random_thoughts.UNPROVIDED) {
            evaluation = (SubLObject)cb_random_thoughts.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup((SubLObject)cb_random_thoughts.$str12$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_random_thoughts.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_random_thoughts.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_random_thoughts.$str13$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_random_thoughts.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_random_thoughts.$kw14$UNINITIALIZED) ? ConsesLow.list(cb_random_thoughts.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            final SubLObject _prev_bind_0_$13 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_random_thoughts.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                if (cb_random_thoughts.NIL != html_macros.$html_color_cyc_logo_lighter_violet$.getGlobalValue()) {
                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_color(html_macros.$html_color_cyc_logo_lighter_violet$.getGlobalValue()));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_random_thoughts.UNPROVIDED);
                final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_random_thoughts.T, thread);
                    final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_random_thoughts.NIL);
                    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_random_thoughts.$str23$post);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                    if (cb_random_thoughts.NIL != frame_name_var) {
                        html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                        html_utilities.html_markup(frame_name_var);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_random_thoughts.UNPROVIDED);
                    final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_random_thoughts.T, thread);
                        html_macros.$within_html_form$.bind((SubLObject)cb_random_thoughts.T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_utilities.html_hidden_input((SubLObject)cb_random_thoughts.$str49$cb_handle_random_thought_frame, (SubLObject)cb_random_thoughts.T, (SubLObject)cb_random_thoughts.UNPROVIDED);
                        html_utilities.html_hidden_input((SubLObject)cb_random_thoughts.$str26$assertion_id, assertion_handles.assertion_id(assertion), (SubLObject)cb_random_thoughts.UNPROVIDED);
                        html_utilities.html_hidden_input((SubLObject)cb_random_thoughts.$str50$cyclist, cb_utilities.cb_string_for_fort(cyclist), (SubLObject)cb_random_thoughts.UNPROVIDED);
                        html_utilities.html_hidden_input((SubLObject)cb_random_thoughts.$str51$paraphrase, assertion_paraphrase, (SubLObject)cb_random_thoughts.UNPROVIDED);
                        html_utilities.html_hidden_input((SubLObject)cb_random_thoughts.$str52$topic, topic, (SubLObject)cb_random_thoughts.UNPROVIDED);
                        html_script_utilities.cb_hoverover_page_init();
                        html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                        cb_show_random_thought(assertion, assertion_paraphrase, (SubLObject)cb_random_thoughts.NIL, (SubLObject)cb_random_thoughts.NIL);
                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_div_style$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_random_thoughts.$str53$position__absolute__bottom__0pt);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_random_thoughts.UNPROVIDED);
                        final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_random_thoughts.T, thread);
                            if (cb_random_thoughts.NIL != evaluation) {
                                cb_random_thoughts_evaluation(evaluation, cyclist, topic);
                            }
                            else {
                                cb_random_thoughts_button_bar();
                            }
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    }
                    finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_random_thoughts.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_random_thoughts.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$13, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_random_thoughts.UNPROVIDED);
        return (SubLObject)cb_random_thoughts.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-random-thoughts.lisp", position = 7293L)
    public static SubLObject cb_random_thoughts_button_bar() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_random_thoughts.$str55$100_);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_random_thoughts.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_random_thoughts.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_random_thoughts.UNPROVIDED);
            final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_random_thoughts.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_random_thoughts.$str56$center));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_random_thoughts.UNPROVIDED);
                final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_random_thoughts.T, thread);
                    SubLObject cdolist_list_var = cb_random_thoughts.$cb_random_thoughts_evaluation_options$.getGlobalValue();
                    SubLObject cons = (SubLObject)cb_random_thoughts.NIL;
                    cons = cdolist_list_var.first();
                    while (cb_random_thoughts.NIL != cdolist_list_var) {
                        SubLObject current;
                        final SubLObject datum = current = cons;
                        SubLObject key = (SubLObject)cb_random_thoughts.NIL;
                        SubLObject label = (SubLObject)cb_random_thoughts.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_random_thoughts.$list57);
                        key = current.first();
                        current = (label = current.rest());
                        html_utilities.html_submit_input(label, label, (SubLObject)cb_random_thoughts.UNPROVIDED);
                        cdolist_list_var = cdolist_list_var.rest();
                        cons = cdolist_list_var.first();
                    }
                    html_utilities.html_submit_input((SubLObject)cb_random_thoughts.$str58$Skip, (SubLObject)cb_random_thoughts.$str58$Skip, (SubLObject)cb_random_thoughts.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_random_thoughts.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)cb_random_thoughts.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-random-thoughts.lisp", position = 7599L)
    public static SubLObject cb_random_thoughts_evaluation(final SubLObject evaluation, final SubLObject cyclist, final SubLObject topic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject evaluation_string = list_utilities.alist_lookup_without_values(cb_random_thoughts.$cb_random_thoughts_evaluation_options$.getGlobalValue(), evaluation, (SubLObject)cb_random_thoughts.UNPROVIDED, (SubLObject)cb_random_thoughts.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_align$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_random_thoughts.$kw59$CENTER));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_random_thoughts.FIVE_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_random_thoughts.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_random_thoughts.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_random_thoughts.UNPROVIDED);
            final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_random_thoughts.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_random_thoughts.$str60$right));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_random_thoughts.UNPROVIDED);
                final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_random_thoughts.T, thread);
                    html_utilities.html_princ((SubLObject)cb_random_thoughts.$str61$Your_evaluation__);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ(evaluation_string);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_random_thoughts.$str62$left));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                if (cb_random_thoughts.NIL != html_macros.$html_color_white$.getGlobalValue()) {
                    html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_color_white$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_random_thoughts.UNPROVIDED);
                final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_random_thoughts.T, thread);
                    cb_utilities.cb_link((SubLObject)cb_random_thoughts.$kw63$RANDOM_THOUGHT_FRAME, cyclist, topic, (SubLObject)cb_random_thoughts.UNPROVIDED, (SubLObject)cb_random_thoughts.UNPROVIDED, (SubLObject)cb_random_thoughts.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_random_thoughts.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)cb_random_thoughts.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-random-thoughts.lisp", position = 8134L)
    public static SubLObject cb_link_random_thought_frame(final SubLObject cyclist, final SubLObject topic, SubLObject linktext) {
        if (linktext == cb_random_thoughts.UNPROVIDED) {
            linktext = (SubLObject)cb_random_thoughts.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_random_thoughts.NIL == linktext) {
            linktext = (SubLObject)cb_random_thoughts.$str64$_New_Random_Thought_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_random_thoughts.$kw65$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_random_thoughts.$str66$cb_random_thought_frame__A__A, cb_utilities.cb_string_for_fort(cyclist), cb_utilities.cb_string_for_fort(topic));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
        if (cb_random_thoughts.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_random_thoughts.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_random_thoughts.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_random_thoughts.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-random-thoughts.lisp", position = 8633L)
    public static SubLObject cb_handle_random_thought_frame(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cyclist = cb_utilities.cb_guess_fort(html_utilities.html_extract_input((SubLObject)cb_random_thoughts.$str50$cyclist, args), (SubLObject)cb_random_thoughts.UNPROVIDED);
        final SubLObject topic = cb_utilities.cb_guess_fort(html_utilities.html_extract_input((SubLObject)cb_random_thoughts.$str52$topic, args), (SubLObject)cb_random_thoughts.UNPROVIDED);
        final SubLObject assertion = cb_utilities.cb_guess_assertion(html_utilities.html_extract_input((SubLObject)cb_random_thoughts.$str26$assertion_id, args));
        final SubLObject paraphrase = html_utilities.html_extract_input((SubLObject)cb_random_thoughts.$str51$paraphrase, args);
        SubLObject judgment;
        SubLObject rest;
        SubLObject cons;
        SubLObject current;
        SubLObject datum;
        SubLObject candidate;
        SubLObject string;
        for (judgment = (SubLObject)cb_random_thoughts.NIL, rest = (SubLObject)cb_random_thoughts.NIL, rest = cb_random_thoughts.$cb_random_thoughts_evaluation_options$.getGlobalValue(); cb_random_thoughts.NIL == judgment && cb_random_thoughts.NIL != rest; rest = rest.rest()) {
            cons = rest.first();
            datum = (current = cons);
            candidate = (SubLObject)cb_random_thoughts.NIL;
            string = (SubLObject)cb_random_thoughts.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_random_thoughts.$list68);
            candidate = current.first();
            current = (string = current.rest());
            if (cb_random_thoughts.NIL != html_utilities.html_extract_input(string, args)) {
                judgment = candidate;
            }
        }
        if (cb_random_thoughts.NIL != judgment && cb_random_thoughts.NIL != cb_random_thoughts.$assert_random_thought_judgmentsP$.getGlobalValue()) {
            final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
            try {
                api_control_vars.$the_cyclist$.bind(cb_random_thoughts.$const69$CycRandomThoughtEvaluationTool, thread);
                final SubLObject evaluation = el_utilities.make_ternary_formula(cb_random_thoughts.$const70$EvaluationOfByOnFn, assertion, cyclist, date_utilities.indexical_seconds_since_1970());
                final SubLObject evaluation_input_sentence = el_utilities.make_binary_formula(cb_random_thoughts.$const71$evaluationInput, evaluation, paraphrase);
                final SubLObject judgment_sentence = el_utilities.make_ternary_formula(cb_random_thoughts.$const72$evaluationOfAs, evaluation, assertion, judgment);
                final SubLObject mt = cb_random_thoughts.$const73$EvaluatedSentencesFromRandomThoug;
                ke.ke_assert(evaluation_input_sentence, mt, (SubLObject)cb_random_thoughts.UNPROVIDED, (SubLObject)cb_random_thoughts.UNPROVIDED);
            }
            finally {
                api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
            }
        }
        return cb_random_thought_frame_internal(cyclist, topic, assertion, paraphrase, judgment);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-random-thoughts.lisp", position = 10007L)
    public static SubLObject cb_maybe_show_random_thought(final SubLObject topic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cyclist = operation_communication.the_cyclist();
        if (cb_random_thoughts.NIL != show_random_thought_for_user_and_topic_p(cyclist, topic)) {
            thread.resetMultipleValues();
            final SubLObject host = random_thought_generator.random_thought_server_hostXport();
            final SubLObject port = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (cb_random_thoughts.NIL != host && cb_random_thoughts.NIL != port) {
                final SubLObject port_offset = Numbers.subtract(port, (SubLObject)cb_random_thoughts.$int75$3600);
                final SubLObject handler = Sequences.cconcatenate((SubLObject)cb_random_thoughts.$str76$cb_random_thought_frame_, new SubLObject[] { format_nil.format_nil_a_no_copy(cb_utilities.cb_string_for_fort(cyclist)), cb_random_thoughts.$str77$_, format_nil.format_nil_a_no_copy(cb_utilities.cb_string_for_fort(topic)) });
                final SubLObject url = cb_tools.cyc_server_url(host, port_offset, handler);
                html_utilities.html_source_readability_terpri((SubLObject)cb_random_thoughts.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_iframe_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_iframe_src$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                html_utilities.html_markup(url);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_iframe_name$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_random_thoughts.$str78$random_thought);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_iframe_width$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_random_thoughts.$str55$100_);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_iframe_height$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_random_thoughts.$int79$75);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_iframe_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_random_thoughts.$kw80$RIGHT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_iframe_frameborder$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_random_thoughts.ONE_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_iframe_marginwidth$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_random_thoughts.ZERO_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_iframe_marginheight$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_random_thoughts.ZERO_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_iframe_scrolling$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_random_thoughts.$str81$no);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_random_thoughts.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_random_thoughts.UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_random_thoughts.T, thread);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_utilities.html_markup(html_macros.$html_iframe_tail$.getGlobalValue());
            }
        }
        return (SubLObject)cb_random_thoughts.NIL;
    }
    
    public static SubLObject declare_cb_random_thoughts_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_random_thoughts", "cb_link_random_thought", "CB-LINK-RANDOM-THOUGHT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_random_thoughts", "cb_random_thoughts", "CB-RANDOM-THOUGHTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_random_thoughts", "cb_random_thought_for_cyclist", "CB-RANDOM-THOUGHT-FOR-CYCLIST", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_random_thoughts", "cb_show_random_thought", "CB-SHOW-RANDOM-THOUGHT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_random_thoughts", "cb_random_thought_connection_type", "CB-RANDOM-THOUGHT-CONNECTION-TYPE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_random_thoughts", "cb_handle_random_thoughts", "CB-HANDLE-RANDOM-THOUGHTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_random_thoughts", "show_random_thought_for_user_and_topic_p", "SHOW-RANDOM-THOUGHT-FOR-USER-AND-TOPIC-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_random_thoughts", "cb_random_thought_frame", "CB-RANDOM-THOUGHT-FRAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_random_thoughts", "cb_random_thought_retrieve_and_display", "CB-RANDOM-THOUGHT-RETRIEVE-AND-DISPLAY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_random_thoughts", "cb_random_thought_frame_internal", "CB-RANDOM-THOUGHT-FRAME-INTERNAL", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_random_thoughts", "cb_random_thoughts_button_bar", "CB-RANDOM-THOUGHTS-BUTTON-BAR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_random_thoughts", "cb_random_thoughts_evaluation", "CB-RANDOM-THOUGHTS-EVALUATION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_random_thoughts", "cb_link_random_thought_frame", "CB-LINK-RANDOM-THOUGHT-FRAME", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_random_thoughts", "cb_handle_random_thought_frame", "CB-HANDLE-RANDOM-THOUGHT-FRAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_random_thoughts", "cb_maybe_show_random_thought", "CB-MAYBE-SHOW-RANDOM-THOUGHT", 1, 0, false);
        return (SubLObject)cb_random_thoughts.NIL;
    }
    
    public static SubLObject init_cb_random_thoughts_file() {
        cb_random_thoughts.$random_thought_cyclists$ = SubLFiles.deflexical("*RANDOM-THOUGHT-CYCLISTS*", (SubLObject)cb_random_thoughts.$list43);
        cb_random_thoughts.$random_thought_refresh_rate$ = SubLFiles.deflexical("*RANDOM-THOUGHT-REFRESH-RATE*", (SubLObject)cb_random_thoughts.TEN_INTEGER);
        cb_random_thoughts.$cb_random_thoughts_evaluation_options$ = SubLFiles.deflexical("*CB-RANDOM-THOUGHTS-EVALUATION-OPTIONS*", (SubLObject)cb_random_thoughts.$list54);
        cb_random_thoughts.$assert_random_thought_judgmentsP$ = SubLFiles.deflexical("*ASSERT-RANDOM-THOUGHT-JUDGMENTS?*", (SubLObject)cb_random_thoughts.T);
        return (SubLObject)cb_random_thoughts.NIL;
    }
    
    public static SubLObject setup_cb_random_thoughts_file() {
        cb_utilities.setup_cb_link_method((SubLObject)cb_random_thoughts.$kw3$RANDOM_THOUGHT, (SubLObject)cb_random_thoughts.$sym4$CB_LINK_RANDOM_THOUGHT, (SubLObject)cb_random_thoughts.ONE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_random_thoughts.$sym5$CB_RANDOM_THOUGHTS, (SubLObject)cb_random_thoughts.$kw6$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_random_thoughts.$sym42$CB_HANDLE_RANDOM_THOUGHTS, (SubLObject)cb_random_thoughts.$kw6$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_random_thoughts.$sym45$CB_RANDOM_THOUGHT_FRAME, (SubLObject)cb_random_thoughts.$kw6$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_random_thoughts.$kw63$RANDOM_THOUGHT_FRAME, (SubLObject)cb_random_thoughts.$sym67$CB_LINK_RANDOM_THOUGHT_FRAME, (SubLObject)cb_random_thoughts.THREE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_random_thoughts.$sym74$CB_HANDLE_RANDOM_THOUGHT_FRAME, (SubLObject)cb_random_thoughts.$kw6$HTML_HANDLER);
        return (SubLObject)cb_random_thoughts.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_cb_random_thoughts_file();
    }
    
    @Override
	public void initializeVariables() {
        init_cb_random_thoughts_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_cb_random_thoughts_file();
    }
    
    static {
        me = (SubLFile)new cb_random_thoughts();
        cb_random_thoughts.$random_thought_cyclists$ = null;
        cb_random_thoughts.$random_thought_refresh_rate$ = null;
        cb_random_thoughts.$cb_random_thoughts_evaluation_options$ = null;
        cb_random_thoughts.$assert_random_thought_judgmentsP$ = null;
        $str0$_Random_Thought_ = SubLObjectFactory.makeString("[Random Thought]");
        $kw1$MAIN = SubLObjectFactory.makeKeyword("MAIN");
        $str2$cb_random_thoughts = SubLObjectFactory.makeString("cb-random-thoughts");
        $kw3$RANDOM_THOUGHT = SubLObjectFactory.makeKeyword("RANDOM-THOUGHT");
        $sym4$CB_LINK_RANDOM_THOUGHT = SubLObjectFactory.makeSymbol("CB-LINK-RANDOM-THOUGHT");
        $sym5$CB_RANDOM_THOUGHTS = SubLObjectFactory.makeSymbol("CB-RANDOM-THOUGHTS");
        $kw6$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $const7$Guest = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Guest"));
        $str8$the_Random_Thought_Generator = SubLObjectFactory.makeString("the Random Thought Generator");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOW"), (SubLObject)cb_random_thoughts.NIL);
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("JAVALIST"));
        $str11$Random_Thoughts = SubLObjectFactory.makeString("Random Thoughts");
        $str12$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str13$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw14$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $kw15$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $kw16$SAM_AUTOCOMPLETE_CSS = SubLObjectFactory.makeKeyword("SAM-AUTOCOMPLETE-CSS");
        $kw17$SHA1 = SubLObjectFactory.makeKeyword("SHA1");
        $str18$yui_skin_sam = SubLObjectFactory.makeString("yui-skin-sam");
        $str19$reloadFrameButton = SubLObjectFactory.makeString("reloadFrameButton");
        $str20$button = SubLObjectFactory.makeString("button");
        $str21$reload = SubLObjectFactory.makeString("reload");
        $str22$Refresh_Frames = SubLObjectFactory.makeString("Refresh Frames");
        $str23$post = SubLObjectFactory.makeString("post");
        $str24$cb_handle_random_thoughts = SubLObjectFactory.makeString("cb-handle-random-thoughts");
        $str25$term = SubLObjectFactory.makeString("term");
        $str26$assertion_id = SubLObjectFactory.makeString("assertion-id");
        $str27$CycL__ = SubLObjectFactory.makeString("CycL: ");
        $kw28$NEW = SubLObjectFactory.makeKeyword("NEW");
        $str29$New_ = SubLObjectFactory.makeString("New ");
        $kw30$RELATED = SubLObjectFactory.makeKeyword("RELATED");
        $str31$Related_ = SubLObjectFactory.makeString("Related ");
        $kw32$SAME = SubLObjectFactory.makeKeyword("SAME");
        $str33$Same_ = SubLObjectFactory.makeString("Same ");
        $str34$ = SubLObjectFactory.makeString("");
        $str35$Topic__ = SubLObjectFactory.makeString("Topic: ");
        $str36$New_Thought = SubLObjectFactory.makeString("New Thought");
        $str37$new_thought = SubLObjectFactory.makeString("new-thought");
        $kw38$DARK_GRAY = SubLObjectFactory.makeKeyword("DARK-GRAY");
        $str39$_I_have_shared__S_random_thoughts = SubLObjectFactory.makeString("(I have shared ~S random thoughts with you so far.)");
        $str40$_I_have_thought_of__S_more_things = SubLObjectFactory.makeString("(I have thought of ~S more things to say.)");
        $kw41$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $sym42$CB_HANDLE_RANDOM_THOUGHTS = SubLObjectFactory.makeSymbol("CB-HANDLE-RANDOM-THOUGHTS");
        $list43 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Baxter")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DaveS")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Witbrock")));
        $list44 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCLIST-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("TOPIC-STRING"));
        $sym45$CB_RANDOM_THOUGHT_FRAME = SubLObjectFactory.makeSymbol("CB-RANDOM-THOUGHT-FRAME");
        $kw46$TOPIC = SubLObjectFactory.makeKeyword("TOPIC");
        $list47 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REQUIRE-TOPICAL?"), (SubLObject)cb_random_thoughts.NIL, (SubLObject)SubLObjectFactory.makeKeyword("NOW"), (SubLObject)cb_random_thoughts.NIL);
        $list48 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TOPIC"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-PARAPHRASE"));
        $str49$cb_handle_random_thought_frame = SubLObjectFactory.makeString("cb-handle-random-thought-frame");
        $str50$cyclist = SubLObjectFactory.makeString("cyclist");
        $str51$paraphrase = SubLObjectFactory.makeString("paraphrase");
        $str52$topic = SubLObjectFactory.makeString("topic");
        $str53$position__absolute__bottom__0pt = SubLObjectFactory.makeString("position: absolute; bottom: 0pt");
        $list54 = ConsesLow.list((SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TrueCycLSentence")), (SubLObject)SubLObjectFactory.makeString("True")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FalseCycLSentence")), (SubLObject)SubLObjectFactory.makeString("False")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BadlyParaphrasedCycLSentence")), (SubLObject)SubLObjectFactory.makeString("Bad Paraphrase")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UninterestingCycLSentence")), (SubLObject)SubLObjectFactory.makeString("Uninteresting")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProblematicCycLSentence")), (SubLObject)SubLObjectFactory.makeString("Other")));
        $str55$100_ = SubLObjectFactory.makeString("100%");
        $str56$center = SubLObjectFactory.makeString("center");
        $list57 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeUninternedSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("LABEL"));
        $str58$Skip = SubLObjectFactory.makeString("Skip");
        $kw59$CENTER = SubLObjectFactory.makeKeyword("CENTER");
        $str60$right = SubLObjectFactory.makeString("right");
        $str61$Your_evaluation__ = SubLObjectFactory.makeString("Your evaluation: ");
        $str62$left = SubLObjectFactory.makeString("left");
        $kw63$RANDOM_THOUGHT_FRAME = SubLObjectFactory.makeKeyword("RANDOM-THOUGHT-FRAME");
        $str64$_New_Random_Thought_ = SubLObjectFactory.makeString("[New Random Thought]");
        $kw65$SELF = SubLObjectFactory.makeKeyword("SELF");
        $str66$cb_random_thought_frame__A__A = SubLObjectFactory.makeString("cb-random-thought-frame&~A&~A");
        $sym67$CB_LINK_RANDOM_THOUGHT_FRAME = SubLObjectFactory.makeSymbol("CB-LINK-RANDOM-THOUGHT-FRAME");
        $list68 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"));
        $const69$CycRandomThoughtEvaluationTool = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRandomThoughtEvaluationTool"));
        $const70$EvaluationOfByOnFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EvaluationOfByOnFn"));
        $const71$evaluationInput = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluationInput"));
        $const72$evaluationOfAs = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluationOfAs"));
        $const73$EvaluatedSentencesFromRandomThoug = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EvaluatedSentencesFromRandomThoughtServerMt"));
        $sym74$CB_HANDLE_RANDOM_THOUGHT_FRAME = SubLObjectFactory.makeSymbol("CB-HANDLE-RANDOM-THOUGHT-FRAME");
        $int75$3600 = SubLObjectFactory.makeInteger(3600);
        $str76$cb_random_thought_frame_ = SubLObjectFactory.makeString("cb-random-thought-frame&");
        $str77$_ = SubLObjectFactory.makeString("&");
        $str78$random_thought = SubLObjectFactory.makeString("random_thought");
        $int79$75 = SubLObjectFactory.makeInteger(75);
        $kw80$RIGHT = SubLObjectFactory.makeKeyword("RIGHT");
        $str81$no = SubLObjectFactory.makeString("no");
    }
}

/*

	Total time: 476 ms
	
*/