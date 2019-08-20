package com.cyc.cycjava.cycl.inference;


import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_followP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_indexP$;
import static com.cyc.cycjava.cycl.cb_parameters.cb_glob_id;
import static com.cyc.cycjava.cycl.cb_parameters.cb_glob_lookup_by_string;
import static com.cyc.cycjava.cycl.cb_parameters.cb_head_shortcut_icon;
import static com.cyc.cycjava.cycl.cb_parameters.cyc_cgi_url_int;
import static com.cyc.cycjava.cycl.cb_utilities.cb_form;
import static com.cyc.cycjava.cycl.cb_utilities.cb_frame_name;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_assertion;
import static com.cyc.cycjava.cycl.cb_utilities.cb_link;
import static com.cyc.cycjava.cycl.cb_utilities.setup_cb_link_method;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.make_ist_sentence;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_color;
import static com.cyc.cycjava.cycl.html_utilities.html_copyright_notice;
import static com.cyc.cycjava.cycl.html_utilities.html_hr;
import static com.cyc.cycjava.cycl.html_utilities.html_indent;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_meta_robot_instructions;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_princ_strong;
import static com.cyc.cycjava.cycl.html_utilities.html_simple_attribute;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.cycjava.cycl.id_index.id_index_count;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_id_threshold;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_elapsed_seconds_for_notification$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_last_pacification_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_notification_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_pacifications_since_last_nl$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$suppress_all_progress_faster_than_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.note_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V10;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.cb_assertion_browser;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class cb_show_consequences extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new cb_show_consequences();



    // defparameter
    public static final SubLSymbol $cb_show_consequences_link_enabledP$ = makeSymbol("*CB-SHOW-CONSEQUENCES-LINK-ENABLED?*");

    // defparameter
    public static final SubLSymbol $cb_show_consequences_mt$ = makeSymbol("*CB-SHOW-CONSEQUENCES-MT*");

    // defparameter
    private static final SubLSymbol $cb_show_consequences_max_time$ = makeSymbol("*CB-SHOW-CONSEQUENCES-MAX-TIME*");





    private static final SubLObject $$BiologyMt = reader_make_constant_shell(makeString("BiologyMt"));

    private static final SubLInteger $int$30 = makeInteger(30);



    private static final SubLString $str3$_Show_Consequences_ = makeString("[Show Consequences]");



    private static final SubLString $str5$cb_show_consequences__a__a = makeString("cb-show-consequences&~a&~a");

    private static final SubLSymbol $SHOW_CONSEQUENCES = makeKeyword("SHOW-CONSEQUENCES");

    private static final SubLSymbol CB_LINK_SHOW_CONSEQUENCES = makeSymbol("CB-LINK-SHOW-CONSEQUENCES");

    private static final SubLList $list8 = list(makeSymbol("ASSERTION-ID"), makeSymbol("RULES-ID"));

    private static final SubLString $$$Show_Consequences = makeString("Show Consequences");

    private static final SubLString $str10$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str11$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");





    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");



    private static final SubLString $str16$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $$$Generating_consequences_of_ = makeString("Generating consequences of ");

    private static final SubLString $str22$__considering__a_rules___ = makeString(", considering ~a rules...");

    private static final SubLString $$$all = makeString("all");

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));



    private static final SubLString $str26$Timed_out_after__a_second_P_ = makeString("Timed out after ~a second~P.");

    private static final SubLSymbol CB_SHOW_CONSEQUENCES = makeSymbol("CB-SHOW-CONSEQUENCES");



    private static final SubLList $list29 = list(makeSymbol("QUERY-EL-FORMULA"), makeSymbol("MT"), makeSymbol("JUSTIFICATION"));

    private static final SubLString $str30$In_Mt__ = makeString("In Mt: ");

    private static final SubLSymbol $SENTENCE_QUERY_SIMILAR = makeKeyword("SENTENCE-QUERY-SIMILAR");

    private static final SubLString $str32$_Query_ = makeString("[Query]");

    private static final SubLString $str33$Justification_ = makeString("Justification:");

    private static final SubLSymbol SHOW_CONSEQUENCES_RULES_FROM_MT = makeSymbol("SHOW-CONSEQUENCES-RULES-FROM-MT");







    private static final SubLString $str38$do_broad_mt_index = makeString("do-broad-mt-index");





    private static final SubLSymbol $show_consequences_rules_from_mt_caching_state$ = makeSymbol("*SHOW-CONSEQUENCES-RULES-FROM-MT-CACHING-STATE*");

    private static final SubLSymbol BIOLOGY_PRACTICE_RULES = makeSymbol("BIOLOGY-PRACTICE-RULES");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLObject $$queryPracticeRules = reader_make_constant_shell(makeString("queryPracticeRules"));



    private static final SubLObject $const47$CytologicalProcessProjectKBConten = reader_make_constant_shell(makeString("CytologicalProcessProjectKBContentTestQuery"));

    private static final SubLSymbol $biology_practice_rules_caching_state$ = makeSymbol("*BIOLOGY-PRACTICE-RULES-CACHING-STATE*");

    public static SubLObject cb_link_show_consequences(final SubLObject gaf, SubLObject rules, SubLObject linktext) {
        if (rules == UNPROVIDED) {
            rules = $ALL;
        }
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str3$_Show_Consequences_;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str5$cb_show_consequences__a__a, assertion_handles.assertion_id(gaf), cb_glob_id(rules));
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
        return gaf;
    }

    public static SubLObject cb_show_consequences(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertion_id = NIL;
        SubLObject rules_id = NIL;
        destructuring_bind_must_consp(args, args, $list8);
        assertion_id = args.first();
        SubLObject current = args.rest();
        destructuring_bind_must_consp(current, args, $list8);
        rules_id = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject gaf = cb_guess_assertion(assertion_id);
            final SubLObject rules = cb_glob_lookup_by_string(rules_id);
            final SubLObject title_var = $$$Show_Consequences;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                html_markup($str10$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup($str11$_meta_http_equiv__X_UA_Compatible);
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
                        html_markup($str16$yui_skin_sam);
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
                            html_princ($$$Generating_consequences_of_);
                            cb_form(gaf, UNPROVIDED, UNPROVIDED);
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str22$__considering__a_rules___, $ALL == rules ? $$$all : length(rules));
                            html_newline(UNPROVIDED);
                            force_output(html_macros.$html_stream$.getDynamicValue(thread));
                            html_hr(UNPROVIDED, UNPROVIDED);
                            thread.resetMultipleValues();
                            final SubLObject queryables = forward_propagate_assertions.generate_consequences(gaf, rules, $$InferencePSC, $cb_show_consequences_max_time$.getDynamicValue(thread));
                            final SubLObject halt_reason = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if ($MAX_TIME == halt_reason) {
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str26$Timed_out_after__a_second_P_, $cb_show_consequences_max_time$.getDynamicValue(thread), $cb_show_consequences_max_time$.getDynamicValue(thread));
                            } else {
                                SubLObject cdolist_list_var = queryables;
                                SubLObject queryable = NIL;
                                queryable = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    cb_display_consequence(queryable);
                                    html_hr(UNPROVIDED, UNPROVIDED);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    queryable = cdolist_list_var.first();
                                } 
                            }
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
        } else {
            cdestructuring_bind_error(args, $list8);
        }
        return NIL;
    }

    public static SubLObject cb_display_consequence(final SubLObject queryable) {
        SubLObject query_el_formula = NIL;
        SubLObject mt = NIL;
        SubLObject justification = NIL;
        destructuring_bind_must_consp(queryable, queryable, $list29);
        query_el_formula = queryable.first();
        SubLObject current = queryable.rest();
        destructuring_bind_must_consp(current, queryable, $list29);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, queryable, $list29);
        justification = current.first();
        current = current.rest();
        if (NIL == current) {
            html_princ_strong($str30$In_Mt__);
            cb_form(mt, UNPROVIDED, UNPROVIDED);
            html_newline(ONE_INTEGER);
            final SubLObject ist_sentence = make_ist_sentence(mt, query_el_formula);
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            cb_link($SENTENCE_QUERY_SIMILAR, ist_sentence, $str32$_Query_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_indent(UNPROVIDED);
            cb_form(query_el_formula, UNPROVIDED, UNPROVIDED);
            html_newline(TWO_INTEGER);
            html_princ_strong($str33$Justification_);
            html_newline(UNPROVIDED);
            cb_assertion_browser.cb_show_justification_readably(justification, UNPROVIDED);
        } else {
            cdestructuring_bind_error(queryable, $list29);
        }
        return NIL;
    }

    public static SubLObject clear_show_consequences_rules_from_mt() {
        final SubLObject cs = $show_consequences_rules_from_mt_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_show_consequences_rules_from_mt(final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($show_consequences_rules_from_mt_caching_state$.getGlobalValue(), list(mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject show_consequences_rules_from_mt_internal(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != hlmt.hlmt_p(mt) : "hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) " + mt;
        final SubLObject rule_set = set.new_set(symbol_function(EQL), UNPROVIDED);
        final SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(mt);
        if (pcase_var.eql($MT)) {
            if (NIL != kb_mapping_macros.do_mt_index_key_validator(mt, NIL)) {
                final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(mt);
                SubLObject final_index_iterator = NIL;
                try {
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(assertion));
                        if ((NIL != valid) && (NIL != assertions_high.rule_assertionP(assertion))) {
                            set.set_add(assertion, rule_set);
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                } finally {
                    final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        if (NIL != final_index_iterator) {
                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                        }
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
        } else
            if (pcase_var.eql($BROAD_MT) && (NIL != kb_mapping_macros.do_broad_mt_index_key_validator(mt, NIL))) {
                final SubLObject idx = assertion_handles.do_assertions_table();
                final SubLObject mess = $str38$do_broad_mt_index;
                final SubLObject total = id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
                final SubLObject _prev_bind_2 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble(mess);
                        final SubLObject idx_$5 = idx;
                        if (NIL == id_index_objects_empty_p(idx_$5, $SKIP)) {
                            final SubLObject idx_$6 = idx_$5;
                            if (NIL == id_index_dense_objects_empty_p(idx_$6, $SKIP)) {
                                final SubLObject vector_var = id_index_dense_objects(idx_$6);
                                final SubLObject backwardP_var = NIL;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject a_id;
                                SubLObject a_handle;
                                SubLObject assertion2;
                                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                    a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                    a_handle = aref(vector_var, a_id);
                                    if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                        if (NIL != id_index_tombstone_p(a_handle)) {
                                            a_handle = $SKIP;
                                        }
                                        assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                        if ((NIL != kb_mapping_macros.do_broad_mt_index_match_p(assertion2, mt, NIL, NIL)) && (NIL != assertions_high.rule_assertionP(assertion2))) {
                                            set.set_add(assertion2, rule_set);
                                        }
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total);
                                    }
                                }
                            }
                            final SubLObject idx_$7 = idx_$5;
                            if ((NIL == id_index_sparse_objects_empty_p(idx_$7)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                final SubLObject sparse = id_index_sparse_objects(idx_$7);
                                SubLObject a_id2 = id_index_sparse_id_threshold(idx_$7);
                                final SubLObject end_id = id_index_next_id(idx_$7);
                                final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                while (a_id2.numL(end_id)) {
                                    final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                                    if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                        final SubLObject assertion3 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                        if ((NIL != kb_mapping_macros.do_broad_mt_index_match_p(assertion3, mt, NIL, NIL)) && (NIL != assertions_high.rule_assertionP(assertion3))) {
                                            set.set_add(assertion3, rule_set);
                                        }
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total);
                                    }
                                    a_id2 = add(a_id2, ONE_INTEGER);
                                } 
                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_5, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_2, thread);
                }
            }

        return set.set_element_list(rule_set);
    }

    public static SubLObject show_consequences_rules_from_mt(final SubLObject mt) {
        SubLObject caching_state = $show_consequences_rules_from_mt_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(SHOW_CONSEQUENCES_RULES_FROM_MT, $show_consequences_rules_from_mt_caching_state$, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(show_consequences_rules_from_mt_internal(mt)));
            memoization_state.caching_state_put(caching_state, mt, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_biology_practice_rules() {
        final SubLObject cs = $biology_practice_rules_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_biology_practice_rules() {
        return memoization_state.caching_state_remove_function_results_with_args($biology_practice_rules_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject biology_practice_rules_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rule_set = set.new_set(symbol_function(EQL), UNPROVIDED);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject pred_var = $$queryPracticeRules;
            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = NIL;
                final SubLObject _prev_bind_0_$9 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$10 = $progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
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
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
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
                                SubLObject done_var_$11 = NIL;
                                final SubLObject token_var_$12 = NIL;
                                while (NIL == done_var_$11) {
                                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$12);
                                    final SubLObject valid_$13 = makeBoolean(!token_var_$12.eql(gaf));
                                    if (NIL != valid_$13) {
                                        final SubLObject query = assertions_high.gaf_arg1(gaf);
                                        final SubLObject rule = assertions_high.gaf_arg2(gaf);
                                        if (NIL != isa.isaP(query, $const47$CytologicalProcessProjectKBConten, UNPROVIDED, UNPROVIDED)) {
                                            set.set_add(rule, rule_set);
                                        }
                                    }
                                    done_var_$11 = makeBoolean(NIL == valid_$13);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
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
                    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    $progress_last_pacification_time$.rebind(_prev_bind_1_$10, thread);
                    $progress_start_time$.rebind(_prev_bind_0_$9, thread);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return set.set_element_list(rule_set);
    }

    public static SubLObject biology_practice_rules() {
        SubLObject caching_state = $biology_practice_rules_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(BIOLOGY_PRACTICE_RULES, $biology_practice_rules_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(biology_practice_rules_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject declare_cb_show_consequences_file() {
        declareFunction("cb_link_show_consequences", "CB-LINK-SHOW-CONSEQUENCES", 1, 2, false);
        declareFunction("cb_show_consequences", "CB-SHOW-CONSEQUENCES", 1, 0, false);
        declareFunction("cb_display_consequence", "CB-DISPLAY-CONSEQUENCE", 1, 0, false);
        declareFunction("clear_show_consequences_rules_from_mt", "CLEAR-SHOW-CONSEQUENCES-RULES-FROM-MT", 0, 0, false);
        declareFunction("remove_show_consequences_rules_from_mt", "REMOVE-SHOW-CONSEQUENCES-RULES-FROM-MT", 1, 0, false);
        declareFunction("show_consequences_rules_from_mt_internal", "SHOW-CONSEQUENCES-RULES-FROM-MT-INTERNAL", 1, 0, false);
        declareFunction("show_consequences_rules_from_mt", "SHOW-CONSEQUENCES-RULES-FROM-MT", 1, 0, false);
        declareFunction("clear_biology_practice_rules", "CLEAR-BIOLOGY-PRACTICE-RULES", 0, 0, false);
        declareFunction("remove_biology_practice_rules", "REMOVE-BIOLOGY-PRACTICE-RULES", 0, 0, false);
        declareFunction("biology_practice_rules_internal", "BIOLOGY-PRACTICE-RULES-INTERNAL", 0, 0, false);
        declareFunction("biology_practice_rules", "BIOLOGY-PRACTICE-RULES", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_cb_show_consequences_file() {
        defparameter("*CB-SHOW-CONSEQUENCES-LINK-ENABLED?*", NIL);
        defparameter("*CB-SHOW-CONSEQUENCES-MT*", $$BiologyMt);
        defparameter("*CB-SHOW-CONSEQUENCES-MAX-TIME*", $int$30);
        deflexical("*SHOW-CONSEQUENCES-RULES-FROM-MT-CACHING-STATE*", NIL);
        deflexical("*BIOLOGY-PRACTICE-RULES-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_cb_show_consequences_file() {
        setup_cb_link_method($SHOW_CONSEQUENCES, CB_LINK_SHOW_CONSEQUENCES, THREE_INTEGER);
        html_macros.note_cgi_handler_function(CB_SHOW_CONSEQUENCES, $HTML_HANDLER);
        memoization_state.note_globally_cached_function(SHOW_CONSEQUENCES_RULES_FROM_MT);
        memoization_state.note_globally_cached_function(BIOLOGY_PRACTICE_RULES);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_show_consequences_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_show_consequences_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_show_consequences_file();
    }

    static {























































    }
}

/**
 * Total time: 222 ms
 */
