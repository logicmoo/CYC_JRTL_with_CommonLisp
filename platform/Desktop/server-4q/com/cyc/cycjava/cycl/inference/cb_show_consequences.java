package com.cyc.cycjava.cycl.inference;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.cb_assertion_browser;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_show_consequences extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.cb_show_consequences";
    public static final String myFingerPrint = "554e1a12a942f08d937484f458a68142c1d93bd4271899122baa9eaae89ad45f";
    @SubLTranslatedFile.SubL(source = "cycl/inference/cb-show-consequences.lisp", position = 862L)
    public static SubLSymbol $cb_show_consequences_link_enabledP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/cb-show-consequences.lisp", position = 929L)
    public static SubLSymbol $cb_show_consequences_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/cb-show-consequences.lisp", position = 993L)
    private static SubLSymbol $cb_show_consequences_max_time$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/cb-show-consequences.lisp", position = 2733L)
    private static SubLSymbol $show_consequences_rules_from_mt_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/cb-show-consequences.lisp", position = 3028L)
    private static SubLSymbol $biology_practice_rules_caching_state$;
    private static final SubLObject $const0$BiologyMt;
    private static final SubLInteger $int1$30;
    private static final SubLSymbol $kw2$ALL;
    private static final SubLString $str3$_Show_Consequences_;
    private static final SubLSymbol $kw4$SELF;
    private static final SubLString $str5$cb_show_consequences__a__a;
    private static final SubLSymbol $kw6$SHOW_CONSEQUENCES;
    private static final SubLSymbol $sym7$CB_LINK_SHOW_CONSEQUENCES;
    private static final SubLList $list8;
    private static final SubLString $str9$Show_Consequences;
    private static final SubLString $str10$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str11$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw12$UNINITIALIZED;
    private static final SubLSymbol $kw13$CB_CYC;
    private static final SubLSymbol $kw14$SAM_AUTOCOMPLETE_CSS;
    private static final SubLSymbol $kw15$SHA1;
    private static final SubLString $str16$yui_skin_sam;
    private static final SubLString $str17$reloadFrameButton;
    private static final SubLString $str18$button;
    private static final SubLString $str19$reload;
    private static final SubLString $str20$Refresh_Frames;
    private static final SubLString $str21$Generating_consequences_of_;
    private static final SubLString $str22$__considering__a_rules___;
    private static final SubLString $str23$all;
    private static final SubLObject $const24$InferencePSC;
    private static final SubLSymbol $kw25$MAX_TIME;
    private static final SubLString $str26$Timed_out_after__a_second_P_;
    private static final SubLSymbol $sym27$CB_SHOW_CONSEQUENCES;
    private static final SubLSymbol $kw28$HTML_HANDLER;
    private static final SubLList $list29;
    private static final SubLString $str30$In_Mt__;
    private static final SubLSymbol $kw31$SENTENCE_QUERY_SIMILAR;
    private static final SubLString $str32$_Query_;
    private static final SubLString $str33$Justification_;
    private static final SubLSymbol $sym34$SHOW_CONSEQUENCES_RULES_FROM_MT;
    private static final SubLSymbol $sym35$HLMT_P;
    private static final SubLSymbol $kw36$MT;
    private static final SubLSymbol $kw37$BROAD_MT;
    private static final SubLString $str38$do_broad_mt_index;
    private static final SubLSymbol $sym39$STRINGP;
    private static final SubLSymbol $kw40$SKIP;
    private static final SubLSymbol $sym41$_SHOW_CONSEQUENCES_RULES_FROM_MT_CACHING_STATE_;
    private static final SubLSymbol $sym42$BIOLOGY_PRACTICE_RULES;
    private static final SubLSymbol $sym43$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const44$EverythingPSC;
    private static final SubLObject $const45$queryPracticeRules;
    private static final SubLSymbol $kw46$GAF;
    private static final SubLObject $const47$CytologicalProcessProjectKBConten;
    private static final SubLSymbol $sym48$_BIOLOGY_PRACTICE_RULES_CACHING_STATE_;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/cb-show-consequences.lisp", position = 1052L)
    public static SubLObject cb_link_show_consequences(final SubLObject gaf, SubLObject rules, SubLObject linktext) {
        if (rules == cb_show_consequences.UNPROVIDED) {
            rules = (SubLObject)cb_show_consequences.$kw2$ALL;
        }
        if (linktext == cb_show_consequences.UNPROVIDED) {
            linktext = (SubLObject)cb_show_consequences.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_show_consequences.NIL == linktext) {
            linktext = (SubLObject)cb_show_consequences.$str3$_Show_Consequences_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_show_consequences.$kw4$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_show_consequences.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_show_consequences.$str5$cb_show_consequences__a__a, assertion_handles.assertion_id(gaf), cb_parameters.cb_glob_id(rules));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_show_consequences.UNPROVIDED);
        if (cb_show_consequences.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_show_consequences.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_show_consequences.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_show_consequences.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_show_consequences.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return gaf;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/cb-show-consequences.lisp", position = 1347L)
    public static SubLObject cb_show_consequences(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertion_id = (SubLObject)cb_show_consequences.NIL;
        SubLObject rules_id = (SubLObject)cb_show_consequences.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_show_consequences.$list8);
        assertion_id = args.first();
        SubLObject current = args.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, args, (SubLObject)cb_show_consequences.$list8);
        rules_id = current.first();
        current = current.rest();
        if (cb_show_consequences.NIL == current) {
            final SubLObject gaf = cb_utilities.cb_guess_assertion(assertion_id);
            final SubLObject rules = cb_parameters.cb_glob_lookup_by_string(rules_id);
            final SubLObject title_var = (SubLObject)cb_show_consequences.$str9$Show_Consequences;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind((cb_show_consequences.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_show_consequences.UNPROVIDED, (SubLObject)cb_show_consequences.UNPROVIDED, (SubLObject)cb_show_consequences.UNPROVIDED), thread);
                html_utilities.html_markup((SubLObject)cb_show_consequences.$str10$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (cb_show_consequences.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_show_consequences.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_show_consequences.$str11$_meta_http_equiv__X_UA_Compatible);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_show_consequences.UNPROVIDED);
                final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                try {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_show_consequences.$kw12$UNINITIALIZED) ? ConsesLow.list(cb_show_consequences.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    cb_parameters.cb_head_shortcut_icon();
                    html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                    cyc_file_dependencies.css((SubLObject)cb_show_consequences.$kw13$CB_CYC);
                    dhtml_macros.html_basic_cb_scripts();
                    if (cb_show_consequences.NIL != title_var) {
                        html_utilities.html_source_readability_terpri((SubLObject)cb_show_consequences.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_utilities.html_princ(title_var);
                        html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    }
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_show_consequences.UNPROVIDED);
                    final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind((SubLObject)cb_show_consequences.T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (cb_show_consequences.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_show_consequences.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_show_consequences.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_show_consequences.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_show_consequences.$str16$yui_skin_sam);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_show_consequences.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_show_consequences.UNPROVIDED);
                        final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_show_consequences.T, thread);
                            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_show_consequences.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_show_consequences.$str17$reloadFrameButton);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_show_consequences.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_show_consequences.UNPROVIDED);
                            final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_show_consequences.T, thread);
                                html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_show_consequences.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_show_consequences.$str18$button);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_show_consequences.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_show_consequences.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_show_consequences.$str19$reload);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_show_consequences.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_show_consequences.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_show_consequences.$str20$Refresh_Frames);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_show_consequences.UNPROVIDED);
                                if (cb_show_consequences.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                    html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_show_consequences.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            if (cb_show_consequences.NIL != title_var) {
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_show_consequences.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_show_consequences.UNPROVIDED);
                                html_utilities.html_princ(title_var);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_show_consequences.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_show_consequences.UNPROVIDED);
                            }
                            html_utilities.html_princ((SubLObject)cb_show_consequences.$str21$Generating_consequences_of_);
                            cb_utilities.cb_form(gaf, (SubLObject)cb_show_consequences.UNPROVIDED, (SubLObject)cb_show_consequences.UNPROVIDED);
                            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_show_consequences.$str22$__considering__a_rules___, (SubLObject)((cb_show_consequences.$kw2$ALL == rules) ? cb_show_consequences.$str23$all : Sequences.length(rules)));
                            html_utilities.html_newline((SubLObject)cb_show_consequences.UNPROVIDED);
                            streams_high.force_output(html_macros.$html_stream$.getDynamicValue(thread));
                            html_utilities.html_hr((SubLObject)cb_show_consequences.UNPROVIDED, (SubLObject)cb_show_consequences.UNPROVIDED);
                            thread.resetMultipleValues();
                            final SubLObject queryables = forward_propagate_assertions.generate_consequences(gaf, rules, cb_show_consequences.$const24$InferencePSC, cb_show_consequences.$cb_show_consequences_max_time$.getDynamicValue(thread));
                            final SubLObject halt_reason = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (cb_show_consequences.$kw25$MAX_TIME == halt_reason) {
                                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_show_consequences.$str26$Timed_out_after__a_second_P_, cb_show_consequences.$cb_show_consequences_max_time$.getDynamicValue(thread), cb_show_consequences.$cb_show_consequences_max_time$.getDynamicValue(thread));
                            }
                            else {
                                SubLObject cdolist_list_var = queryables;
                                SubLObject queryable = (SubLObject)cb_show_consequences.NIL;
                                queryable = cdolist_list_var.first();
                                while (cb_show_consequences.NIL != cdolist_list_var) {
                                    cb_display_consequence(queryable);
                                    html_utilities.html_hr((SubLObject)cb_show_consequences.UNPROVIDED, (SubLObject)cb_show_consequences.UNPROVIDED);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    queryable = cdolist_list_var.first();
                                }
                            }
                            html_utilities.html_source_readability_terpri((SubLObject)cb_show_consequences.UNPROVIDED);
                            html_utilities.html_copyright_notice();
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_show_consequences.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$2, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                }
                finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$1, thread);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_show_consequences.UNPROVIDED);
            }
            finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_show_consequences.$list8);
        }
        return (SubLObject)cb_show_consequences.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/cb-show-consequences.lisp", position = 2195L)
    public static SubLObject cb_display_consequence(final SubLObject queryable) {
        SubLObject query_el_formula = (SubLObject)cb_show_consequences.NIL;
        SubLObject mt = (SubLObject)cb_show_consequences.NIL;
        SubLObject justification = (SubLObject)cb_show_consequences.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(queryable, queryable, (SubLObject)cb_show_consequences.$list29);
        query_el_formula = queryable.first();
        SubLObject current = queryable.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, queryable, (SubLObject)cb_show_consequences.$list29);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, queryable, (SubLObject)cb_show_consequences.$list29);
        justification = current.first();
        current = current.rest();
        if (cb_show_consequences.NIL == current) {
            html_utilities.html_princ_strong((SubLObject)cb_show_consequences.$str30$In_Mt__);
            cb_utilities.cb_form(mt, (SubLObject)cb_show_consequences.UNPROVIDED, (SubLObject)cb_show_consequences.UNPROVIDED);
            html_utilities.html_newline((SubLObject)cb_show_consequences.ONE_INTEGER);
            final SubLObject ist_sentence = el_utilities.make_ist_sentence(mt, query_el_formula);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            cb_utilities.cb_link((SubLObject)cb_show_consequences.$kw31$SENTENCE_QUERY_SIMILAR, ist_sentence, (SubLObject)cb_show_consequences.$str32$_Query_, (SubLObject)cb_show_consequences.UNPROVIDED, (SubLObject)cb_show_consequences.UNPROVIDED, (SubLObject)cb_show_consequences.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_indent((SubLObject)cb_show_consequences.UNPROVIDED);
            cb_utilities.cb_form(query_el_formula, (SubLObject)cb_show_consequences.UNPROVIDED, (SubLObject)cb_show_consequences.UNPROVIDED);
            html_utilities.html_newline((SubLObject)cb_show_consequences.TWO_INTEGER);
            html_utilities.html_princ_strong((SubLObject)cb_show_consequences.$str33$Justification_);
            html_utilities.html_newline((SubLObject)cb_show_consequences.UNPROVIDED);
            cb_assertion_browser.cb_show_justification_readably(justification, (SubLObject)cb_show_consequences.UNPROVIDED);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(queryable, (SubLObject)cb_show_consequences.$list29);
        }
        return (SubLObject)cb_show_consequences.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/cb-show-consequences.lisp", position = 2733L)
    public static SubLObject clear_show_consequences_rules_from_mt() {
        final SubLObject cs = cb_show_consequences.$show_consequences_rules_from_mt_caching_state$.getGlobalValue();
        if (cb_show_consequences.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)cb_show_consequences.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/cb-show-consequences.lisp", position = 2733L)
    public static SubLObject remove_show_consequences_rules_from_mt(final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args(cb_show_consequences.$show_consequences_rules_from_mt_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(mt), (SubLObject)cb_show_consequences.UNPROVIDED, (SubLObject)cb_show_consequences.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/cb-show-consequences.lisp", position = 2733L)
    public static SubLObject show_consequences_rules_from_mt_internal(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_show_consequences.NIL != hlmt.hlmt_p(mt) : mt;
        final SubLObject rule_set = set.new_set(Symbols.symbol_function((SubLObject)cb_show_consequences.EQL), (SubLObject)cb_show_consequences.UNPROVIDED);
        final SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(mt);
        if (pcase_var.eql((SubLObject)cb_show_consequences.$kw36$MT)) {
            if (cb_show_consequences.NIL != kb_mapping_macros.do_mt_index_key_validator(mt, (SubLObject)cb_show_consequences.NIL)) {
                final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(mt);
                SubLObject final_index_iterator = (SubLObject)cb_show_consequences.NIL;
                try {
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)cb_show_consequences.NIL, (SubLObject)cb_show_consequences.NIL, (SubLObject)cb_show_consequences.NIL);
                    SubLObject done_var = (SubLObject)cb_show_consequences.NIL;
                    final SubLObject token_var = (SubLObject)cb_show_consequences.NIL;
                    while (cb_show_consequences.NIL == done_var) {
                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(assertion));
                        if (cb_show_consequences.NIL != valid && cb_show_consequences.NIL != assertions_high.rule_assertionP(assertion)) {
                            set.set_add(assertion, rule_set);
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(cb_show_consequences.NIL == valid);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_show_consequences.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        if (cb_show_consequences.NIL != final_index_iterator) {
                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                        }
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
        }
        else if (pcase_var.eql((SubLObject)cb_show_consequences.$kw37$BROAD_MT) && cb_show_consequences.NIL != kb_mapping_macros.do_broad_mt_index_key_validator(mt, (SubLObject)cb_show_consequences.NIL)) {
            final SubLObject idx = assertion_handles.do_assertions_table();
            final SubLObject mess = (SubLObject)cb_show_consequences.$str38$do_broad_mt_index;
            final SubLObject total = id_index.id_index_count(idx);
            SubLObject sofar = (SubLObject)cb_show_consequences.ZERO_INTEGER;
            assert cb_show_consequences.NIL != Types.stringp(mess) : mess;
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)cb_show_consequences.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)cb_show_consequences.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)cb_show_consequences.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(mess);
                    final SubLObject idx_$5 = idx;
                    if (cb_show_consequences.NIL == id_index.id_index_objects_empty_p(idx_$5, (SubLObject)cb_show_consequences.$kw40$SKIP)) {
                        final SubLObject idx_$6 = idx_$5;
                        if (cb_show_consequences.NIL == id_index.id_index_dense_objects_empty_p(idx_$6, (SubLObject)cb_show_consequences.$kw40$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$6);
                            final SubLObject backwardP_var = (SubLObject)cb_show_consequences.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject a_id;
                            SubLObject a_handle;
                            SubLObject assertion2;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)cb_show_consequences.NIL, v_iteration = (SubLObject)cb_show_consequences.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)cb_show_consequences.ONE_INTEGER)) {
                                a_id = ((cb_show_consequences.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)cb_show_consequences.ONE_INTEGER) : v_iteration);
                                a_handle = Vectors.aref(vector_var, a_id);
                                if (cb_show_consequences.NIL == id_index.id_index_tombstone_p(a_handle) || cb_show_consequences.NIL == id_index.id_index_skip_tombstones_p((SubLObject)cb_show_consequences.$kw40$SKIP)) {
                                    if (cb_show_consequences.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                        a_handle = (SubLObject)cb_show_consequences.$kw40$SKIP;
                                    }
                                    assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                    if (cb_show_consequences.NIL != kb_mapping_macros.do_broad_mt_index_match_p(assertion2, mt, (SubLObject)cb_show_consequences.NIL, (SubLObject)cb_show_consequences.NIL) && cb_show_consequences.NIL != assertions_high.rule_assertionP(assertion2)) {
                                        set.set_add(assertion2, rule_set);
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)cb_show_consequences.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$7 = idx_$5;
                        if (cb_show_consequences.NIL == id_index.id_index_sparse_objects_empty_p(idx_$7) || cb_show_consequences.NIL == id_index.id_index_skip_tombstones_p((SubLObject)cb_show_consequences.$kw40$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$7);
                            SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$7);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$7);
                            final SubLObject v_default = (SubLObject)((cb_show_consequences.NIL != id_index.id_index_skip_tombstones_p((SubLObject)cb_show_consequences.$kw40$SKIP)) ? cb_show_consequences.NIL : cb_show_consequences.$kw40$SKIP);
                            while (a_id2.numL(end_id)) {
                                final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                                if (cb_show_consequences.NIL == id_index.id_index_skip_tombstones_p((SubLObject)cb_show_consequences.$kw40$SKIP) || cb_show_consequences.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                    final SubLObject assertion3 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                    if (cb_show_consequences.NIL != kb_mapping_macros.do_broad_mt_index_match_p(assertion3, mt, (SubLObject)cb_show_consequences.NIL, (SubLObject)cb_show_consequences.NIL) && cb_show_consequences.NIL != assertions_high.rule_assertionP(assertion3)) {
                                        set.set_add(assertion3, rule_set);
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)cb_show_consequences.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                                a_id2 = Numbers.add(a_id2, (SubLObject)cb_show_consequences.ONE_INTEGER);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_show_consequences.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_5, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_2, thread);
            }
        }
        return set.set_element_list(rule_set);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/cb-show-consequences.lisp", position = 2733L)
    public static SubLObject show_consequences_rules_from_mt(final SubLObject mt) {
        SubLObject caching_state = cb_show_consequences.$show_consequences_rules_from_mt_caching_state$.getGlobalValue();
        if (cb_show_consequences.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)cb_show_consequences.$sym34$SHOW_CONSEQUENCES_RULES_FROM_MT, (SubLObject)cb_show_consequences.$sym41$_SHOW_CONSEQUENCES_RULES_FROM_MT_CACHING_STATE_, (SubLObject)cb_show_consequences.NIL, (SubLObject)cb_show_consequences.EQL, (SubLObject)cb_show_consequences.ONE_INTEGER, (SubLObject)cb_show_consequences.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(show_consequences_rules_from_mt_internal(mt)));
            memoization_state.caching_state_put(caching_state, mt, results, (SubLObject)cb_show_consequences.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/cb-show-consequences.lisp", position = 3028L)
    public static SubLObject clear_biology_practice_rules() {
        final SubLObject cs = cb_show_consequences.$biology_practice_rules_caching_state$.getGlobalValue();
        if (cb_show_consequences.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)cb_show_consequences.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/cb-show-consequences.lisp", position = 3028L)
    public static SubLObject remove_biology_practice_rules() {
        return memoization_state.caching_state_remove_function_results_with_args(cb_show_consequences.$biology_practice_rules_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(cb_show_consequences.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)cb_show_consequences.UNPROVIDED, (SubLObject)cb_show_consequences.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/cb-show-consequences.lisp", position = 3028L)
    public static SubLObject biology_practice_rules_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rule_set = set.new_set(Symbols.symbol_function((SubLObject)cb_show_consequences.EQL), (SubLObject)cb_show_consequences.UNPROVIDED);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)cb_show_consequences.$sym43$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(cb_show_consequences.$const44$EverythingPSC, thread);
            final SubLObject pred_var = cb_show_consequences.$const45$queryPracticeRules;
            if (cb_show_consequences.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = (SubLObject)cb_show_consequences.NIL;
                final SubLObject _prev_bind_0_$9 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$10 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)cb_show_consequences.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)cb_show_consequences.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)cb_show_consequences.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)cb_show_consequences.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((cb_show_consequences.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : cb_show_consequences.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = (SubLObject)cb_show_consequences.NIL;
                    final SubLObject token_var = (SubLObject)cb_show_consequences.NIL;
                    while (cb_show_consequences.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (cb_show_consequences.NIL != valid) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator = (SubLObject)cb_show_consequences.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)cb_show_consequences.$kw46$GAF, (SubLObject)cb_show_consequences.NIL, (SubLObject)cb_show_consequences.NIL);
                                SubLObject done_var_$11 = (SubLObject)cb_show_consequences.NIL;
                                final SubLObject token_var_$12 = (SubLObject)cb_show_consequences.NIL;
                                while (cb_show_consequences.NIL == done_var_$11) {
                                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$12);
                                    final SubLObject valid_$13 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$12.eql(gaf));
                                    if (cb_show_consequences.NIL != valid_$13) {
                                        final SubLObject query = assertions_high.gaf_arg1(gaf);
                                        final SubLObject rule = assertions_high.gaf_arg2(gaf);
                                        if (cb_show_consequences.NIL != isa.isaP(query, cb_show_consequences.$const47$CytologicalProcessProjectKBConten, (SubLObject)cb_show_consequences.UNPROVIDED, (SubLObject)cb_show_consequences.UNPROVIDED)) {
                                            set.set_add(rule, rule_set);
                                        }
                                    }
                                    done_var_$11 = (SubLObject)SubLObjectFactory.makeBoolean(cb_show_consequences.NIL == valid_$13);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_show_consequences.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (cb_show_consequences.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(cb_show_consequences.NIL == valid);
                    }
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$10, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$9, thread);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return set.set_element_list(rule_set);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/cb-show-consequences.lisp", position = 3028L)
    public static SubLObject biology_practice_rules() {
        SubLObject caching_state = cb_show_consequences.$biology_practice_rules_caching_state$.getGlobalValue();
        if (cb_show_consequences.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)cb_show_consequences.$sym42$BIOLOGY_PRACTICE_RULES, (SubLObject)cb_show_consequences.$sym48$_BIOLOGY_PRACTICE_RULES_CACHING_STATE_, (SubLObject)cb_show_consequences.NIL, (SubLObject)cb_show_consequences.EQL, (SubLObject)cb_show_consequences.ZERO_INTEGER, (SubLObject)cb_show_consequences.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)cb_show_consequences.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(biology_practice_rules_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)cb_show_consequences.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    public static SubLObject declare_cb_show_consequences_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.cb_show_consequences", "cb_link_show_consequences", "CB-LINK-SHOW-CONSEQUENCES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.cb_show_consequences", "cb_show_consequences", "CB-SHOW-CONSEQUENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.cb_show_consequences", "cb_display_consequence", "CB-DISPLAY-CONSEQUENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.cb_show_consequences", "clear_show_consequences_rules_from_mt", "CLEAR-SHOW-CONSEQUENCES-RULES-FROM-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.cb_show_consequences", "remove_show_consequences_rules_from_mt", "REMOVE-SHOW-CONSEQUENCES-RULES-FROM-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.cb_show_consequences", "show_consequences_rules_from_mt_internal", "SHOW-CONSEQUENCES-RULES-FROM-MT-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.cb_show_consequences", "show_consequences_rules_from_mt", "SHOW-CONSEQUENCES-RULES-FROM-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.cb_show_consequences", "clear_biology_practice_rules", "CLEAR-BIOLOGY-PRACTICE-RULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.cb_show_consequences", "remove_biology_practice_rules", "REMOVE-BIOLOGY-PRACTICE-RULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.cb_show_consequences", "biology_practice_rules_internal", "BIOLOGY-PRACTICE-RULES-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.cb_show_consequences", "biology_practice_rules", "BIOLOGY-PRACTICE-RULES", 0, 0, false);
        return (SubLObject)cb_show_consequences.NIL;
    }
    
    public static SubLObject init_cb_show_consequences_file() {
        cb_show_consequences.$cb_show_consequences_link_enabledP$ = SubLFiles.defparameter("*CB-SHOW-CONSEQUENCES-LINK-ENABLED?*", (SubLObject)cb_show_consequences.NIL);
        cb_show_consequences.$cb_show_consequences_mt$ = SubLFiles.defparameter("*CB-SHOW-CONSEQUENCES-MT*", cb_show_consequences.$const0$BiologyMt);
        cb_show_consequences.$cb_show_consequences_max_time$ = SubLFiles.defparameter("*CB-SHOW-CONSEQUENCES-MAX-TIME*", (SubLObject)cb_show_consequences.$int1$30);
        cb_show_consequences.$show_consequences_rules_from_mt_caching_state$ = SubLFiles.deflexical("*SHOW-CONSEQUENCES-RULES-FROM-MT-CACHING-STATE*", (SubLObject)cb_show_consequences.NIL);
        cb_show_consequences.$biology_practice_rules_caching_state$ = SubLFiles.deflexical("*BIOLOGY-PRACTICE-RULES-CACHING-STATE*", (SubLObject)cb_show_consequences.NIL);
        return (SubLObject)cb_show_consequences.NIL;
    }
    
    public static SubLObject setup_cb_show_consequences_file() {
        cb_utilities.setup_cb_link_method((SubLObject)cb_show_consequences.$kw6$SHOW_CONSEQUENCES, (SubLObject)cb_show_consequences.$sym7$CB_LINK_SHOW_CONSEQUENCES, (SubLObject)cb_show_consequences.THREE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_show_consequences.$sym27$CB_SHOW_CONSEQUENCES, (SubLObject)cb_show_consequences.$kw28$HTML_HANDLER);
        memoization_state.note_globally_cached_function((SubLObject)cb_show_consequences.$sym34$SHOW_CONSEQUENCES_RULES_FROM_MT);
        memoization_state.note_globally_cached_function((SubLObject)cb_show_consequences.$sym42$BIOLOGY_PRACTICE_RULES);
        return (SubLObject)cb_show_consequences.NIL;
    }
    
    public void declareFunctions() {
        declare_cb_show_consequences_file();
    }
    
    public void initializeVariables() {
        init_cb_show_consequences_file();
    }
    
    public void runTopLevelForms() {
        setup_cb_show_consequences_file();
    }
    
    static {
        me = (SubLFile)new cb_show_consequences();
        cb_show_consequences.$cb_show_consequences_link_enabledP$ = null;
        cb_show_consequences.$cb_show_consequences_mt$ = null;
        cb_show_consequences.$cb_show_consequences_max_time$ = null;
        cb_show_consequences.$show_consequences_rules_from_mt_caching_state$ = null;
        cb_show_consequences.$biology_practice_rules_caching_state$ = null;
        $const0$BiologyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BiologyMt"));
        $int1$30 = SubLObjectFactory.makeInteger(30);
        $kw2$ALL = SubLObjectFactory.makeKeyword("ALL");
        $str3$_Show_Consequences_ = SubLObjectFactory.makeString("[Show Consequences]");
        $kw4$SELF = SubLObjectFactory.makeKeyword("SELF");
        $str5$cb_show_consequences__a__a = SubLObjectFactory.makeString("cb-show-consequences&~a&~a");
        $kw6$SHOW_CONSEQUENCES = SubLObjectFactory.makeKeyword("SHOW-CONSEQUENCES");
        $sym7$CB_LINK_SHOW_CONSEQUENCES = SubLObjectFactory.makeSymbol("CB-LINK-SHOW-CONSEQUENCES");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-ID"), (SubLObject)SubLObjectFactory.makeSymbol("RULES-ID"));
        $str9$Show_Consequences = SubLObjectFactory.makeString("Show Consequences");
        $str10$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str11$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw12$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $kw13$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $kw14$SAM_AUTOCOMPLETE_CSS = SubLObjectFactory.makeKeyword("SAM-AUTOCOMPLETE-CSS");
        $kw15$SHA1 = SubLObjectFactory.makeKeyword("SHA1");
        $str16$yui_skin_sam = SubLObjectFactory.makeString("yui-skin-sam");
        $str17$reloadFrameButton = SubLObjectFactory.makeString("reloadFrameButton");
        $str18$button = SubLObjectFactory.makeString("button");
        $str19$reload = SubLObjectFactory.makeString("reload");
        $str20$Refresh_Frames = SubLObjectFactory.makeString("Refresh Frames");
        $str21$Generating_consequences_of_ = SubLObjectFactory.makeString("Generating consequences of ");
        $str22$__considering__a_rules___ = SubLObjectFactory.makeString(", considering ~a rules...");
        $str23$all = SubLObjectFactory.makeString("all");
        $const24$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $kw25$MAX_TIME = SubLObjectFactory.makeKeyword("MAX-TIME");
        $str26$Timed_out_after__a_second_P_ = SubLObjectFactory.makeString("Timed out after ~a second~P.");
        $sym27$CB_SHOW_CONSEQUENCES = SubLObjectFactory.makeSymbol("CB-SHOW-CONSEQUENCES");
        $kw28$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-EL-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("JUSTIFICATION"));
        $str30$In_Mt__ = SubLObjectFactory.makeString("In Mt: ");
        $kw31$SENTENCE_QUERY_SIMILAR = SubLObjectFactory.makeKeyword("SENTENCE-QUERY-SIMILAR");
        $str32$_Query_ = SubLObjectFactory.makeString("[Query]");
        $str33$Justification_ = SubLObjectFactory.makeString("Justification:");
        $sym34$SHOW_CONSEQUENCES_RULES_FROM_MT = SubLObjectFactory.makeSymbol("SHOW-CONSEQUENCES-RULES-FROM-MT");
        $sym35$HLMT_P = SubLObjectFactory.makeSymbol("HLMT-P");
        $kw36$MT = SubLObjectFactory.makeKeyword("MT");
        $kw37$BROAD_MT = SubLObjectFactory.makeKeyword("BROAD-MT");
        $str38$do_broad_mt_index = SubLObjectFactory.makeString("do-broad-mt-index");
        $sym39$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw40$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $sym41$_SHOW_CONSEQUENCES_RULES_FROM_MT_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*SHOW-CONSEQUENCES-RULES-FROM-MT-CACHING-STATE*");
        $sym42$BIOLOGY_PRACTICE_RULES = SubLObjectFactory.makeSymbol("BIOLOGY-PRACTICE-RULES");
        $sym43$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const44$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const45$queryPracticeRules = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("queryPracticeRules"));
        $kw46$GAF = SubLObjectFactory.makeKeyword("GAF");
        $const47$CytologicalProcessProjectKBConten = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CytologicalProcessProjectKBContentTestQuery"));
        $sym48$_BIOLOGY_PRACTICE_RULES_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*BIOLOGY-PRACTICE-RULES-CACHING-STATE*");
    }
}

/*

	Total time: 222 ms
	
*/