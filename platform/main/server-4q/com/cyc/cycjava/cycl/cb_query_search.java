package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_followP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_indexP$;
import static com.cyc.cycjava.cycl.cb_parameters.cb_head_shortcut_icon;
import static com.cyc.cycjava.cycl.cb_parameters.cyc_cgi_url_int;
import static com.cyc.cycjava.cycl.cb_utilities.cb_form;
import static com.cyc.cycjava.cycl.cb_utilities.cb_frame_name;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_term;
import static com.cyc.cycjava.cycl.cb_utilities.setup_cb_link_method;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.html_utilities.html_align;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_checkbox_input;
import static com.cyc.cycjava.cycl.html_utilities.html_color;
import static com.cyc.cycjava.cycl.html_utilities.html_copyright_notice;
import static com.cyc.cycjava.cycl.html_utilities.html_extract_input;
import static com.cyc.cycjava.cycl.html_utilities.html_hidden_input;
import static com.cyc.cycjava.cycl.html_utilities.html_indent;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_meta_robot_instructions;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_princ_strong;
import static com.cyc.cycjava.cycl.html_utilities.html_simple_attribute;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.cycjava.cycl.html_utilities.html_submit_input;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_interface_variable;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_state_variable;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class cb_query_search extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new cb_query_search();



    // defparameter
    public static final SubLSymbol $cb_query_search_width$ = makeSymbol("*CB-QUERY-SEARCH-WIDTH*");

    // defparameter
    public static final SubLSymbol $cb_query_search_height$ = makeSymbol("*CB-QUERY-SEARCH-HEIGHT*");

    // defparameter
    public static final SubLSymbol $cb_query_search_return_fragmentsP$ = makeSymbol("*CB-QUERY-SEARCH-RETURN-FRAGMENTS?*");

    // defparameter
    public static final SubLSymbol $cb_query_search_return_kbqsP$ = makeSymbol("*CB-QUERY-SEARCH-RETURN-KBQS?*");







    private static final SubLInteger $int$80 = makeInteger(80);

    private static final SubLSymbol $sym1$_CB_QUERY_SEARCH_RETURN_FRAGMENTS__ = makeSymbol("*CB-QUERY-SEARCH-RETURN-FRAGMENTS?*");

    private static final SubLSymbol $sym2$_CB_QUERY_SEARCH_RETURN_KBQS__ = makeSymbol("*CB-QUERY-SEARCH-RETURN-KBQS?*");

    private static final SubLList $list3 = list(makeKeyword("QUERY-SENTENCE"), makeKeyword("GLOSS"), makeKeyword("SUPPORTS"));

    public static final SubLSymbol $cb_query_search_kbq_info_to_show$ = makeSymbol("*CB-QUERY-SEARCH-KBQ-INFO-TO-SHOW*");

    private static final SubLObject $$CycLQuerySpecification = reader_make_constant_shell(makeString("CycLQuerySpecification"));

    public static final SubLSymbol $cb_query_search_query_type$ = makeSymbol("*CB-QUERY-SEARCH-QUERY-TYPE*");

    private static final SubLObject $$GeneralCycKETask_Allotment = reader_make_constant_shell(makeString("GeneralCycKETask-Allotment"));

    public static final SubLSymbol $cb_query_search_task$ = makeSymbol("*CB-QUERY-SEARCH-TASK*");

    private static final SubLString $$$Query_Search = makeString("Query Search");

    private static final SubLString $str10$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str11$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");





    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");



    private static final SubLString $str16$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $$$post = makeString("post");

    private static final SubLString $str22$cb_handle_query_search = makeString("cb-handle-query-search");

    private static final SubLString $str23$default_task = makeString("default-task");

    private static final SubLString $str24$kbqs_ = makeString("kbqs?");

    private static final SubLString $str25$fragments_ = makeString("fragments?");

    private static final SubLString $str26$query_type = makeString("query-type");

    private static final SubLString $str27$show_kbq_sentence_ = makeString("show-kbq-sentence?");



    private static final SubLString $str29$show_kbq_gloss_ = makeString("show-kbq-gloss?");



    private static final SubLString $str31$show_kbq_supports_ = makeString("show-kbq-supports?");



    private static final SubLString $str33$search_string = makeString("search-string");

    private static final SubLSymbol CB_HANDLE_QUERY_SEARCH = makeSymbol("CB-HANDLE-QUERY-SEARCH");



    private static final SubLString $str36$Results_for__S_ = makeString("Results for ~S:");



    private static final SubLString $str38$Please_select_Fragments_and_or_Re = makeString("Please select Fragments and/or Reified Queries.");

    private static final SubLList $list39 = list(makeSymbol("RESULT-STRING"), makeSymbol("RESULT-KBQS"));

    private static final SubLString $str40$No_reified_queries_found_ = makeString("No reified queries found.");

    private static final SubLList $list41 = list(new SubLObject[]{ makeKeyword("INPUT-NAME"), makeString("default-task"), makeKeyword("COMPLETE-LABEL"), NIL, makeKeyword("WIDTH"), makeInteger(500), makeKeyword("PRETTY-NAME"), makeString("Task"), makeKeyword("CLEAR-LABEL"), NIL, makeKeyword("COMPLETE-TYPE"), reader_make_constant_shell(makeString("CAEAnalysisTask")) });

    private static final SubLString $$$Filter_collection = makeString("Filter collection");

    private static final SubLString $str43$A_query_type_for_reified_queries_ = makeString("A query type for reified queries.");

    private static final SubLInteger $int$300 = makeInteger(300);

    private static final SubLString $str45$nd___ = makeString("nd();");







    private static final SubLInteger $int$500 = makeInteger(500);







    private static final SubLObject $$SpecsFn = reader_make_constant_shell(makeString("SpecsFn"));

    private static final SubLString $str54$Query_types__ = makeString("Query types :");

    private static final SubLString $str55$Should_we_construct_fragments_ = makeString("Should we construct fragments?");

    private static final SubLString $str56$Fragments__ = makeString("Fragments? ");

    private static final SubLString $$$t = makeString("t");

    private static final SubLString $str58$Should_we_retrieve_reified_querie = makeString("Should we retrieve reified queries?");

    private static final SubLString $str59$Reified_Queries__ = makeString("Reified Queries? ");

    private static final SubLString $str60$__Show_query_sentence__ = makeString(" (Show query sentence? ");

    private static final SubLString $str61$_Gloss__ = makeString(" Gloss? ");

    private static final SubLString $str62$_Supports__ = makeString(" Supports? ");

    private static final SubLString $str63$_ = makeString(")");

    private static final SubLString $str64$Enter_A_Search_String__ = makeString("Enter A Search String :");

    private static final SubLString $$$Eval = makeString("Eval");

    private static final SubLString $$$Clear = makeString("Clear");



    private static final SubLString $$$Reified_Query = makeString("Reified Query");

    private static final SubLString $$$Score = makeString("Score");

    private static final SubLList $list70 = cons(makeSymbol("KBQ"), makeSymbol("SUPPORTS"));

    private static final SubLString $str71$Gloss__ = makeString("Gloss: ");

    private static final SubLString $str72$cycl_ = makeString("cycl-");

    private static final SubLString $str73$ = makeString("");

    private static final SubLString $str74$Query_Sentence__ = makeString("Query Sentence: ");





    private static final SubLString $str77$Supports__ = makeString("Supports: ");

    private static final SubLList $list78 = list(makeSymbol("TOKEN-RECORD"), makeSymbol("TERM"));

    private static final SubLString $$$_is_mapped_to_ = makeString(" is mapped to ");

    private static final SubLString $$$_with_a_score_of_ = makeString(" with a score of ");

    private static final SubLString $str81$_ = makeString(".");

    private static final SubLString $str82$_S____ = makeString("~S -> ");

    private static final SubLString $str83$___D_ = makeString(" (~D)");

    private static final SubLObject $$queryContentString = reader_make_constant_shell(makeString("queryContentString"));

    private static final SubLObject $$formulaTemplateGloss = reader_make_constant_shell(makeString("formulaTemplateGloss"));





    private static final SubLSymbol $QUERY_SEARCH = makeKeyword("QUERY-SEARCH");

    private static final SubLSymbol CB_LINK_QUERY_SEARCH = makeSymbol("CB-LINK-QUERY-SEARCH");

    public static SubLObject cb_handle_query_search(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $$$Query_Search;
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
                        html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_head_shortcut_icon();
                        html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                        cyc_file_dependencies.css($CB_CYC);
                        dhtml_macros.dhtml_with_dom_script();
                        dhtml_macros.dhtml_with_toggle_visibility_support();
                        html_script_utilities.cb_hoverover_page_init();
                        html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
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
                            html_hidden_input($str22$cb_handle_query_search, T, UNPROVIDED);
                            if (NIL != args) {
                                $cb_query_search_task$.setDynamicValue(cb_guess_term(html_extract_input($str23$default_task, args), UNPROVIDED), thread);
                                $cb_query_search_return_kbqsP$.setDynamicValue(list_utilities.sublisp_boolean(html_extract_input($str24$kbqs_, args)), thread);
                                $cb_query_search_return_fragmentsP$.setDynamicValue(list_utilities.sublisp_boolean(html_extract_input($str25$fragments_, args)), thread);
                                $cb_query_search_query_type$.setDynamicValue(cb_guess_term(html_extract_input($str26$query_type, args), UNPROVIDED), thread);
                                $cb_query_search_kbq_info_to_show$.setDynamicValue(NIL, thread);
                                if (NIL != list_utilities.sublisp_boolean(html_extract_input($str27$show_kbq_sentence_, args))) {
                                    $cb_query_search_kbq_info_to_show$.setDynamicValue(cons($QUERY_SENTENCE, $cb_query_search_kbq_info_to_show$.getDynamicValue(thread)), thread);
                                }
                                if (NIL != list_utilities.sublisp_boolean(html_extract_input($str29$show_kbq_gloss_, args))) {
                                    $cb_query_search_kbq_info_to_show$.setDynamicValue(cons($GLOSS, $cb_query_search_kbq_info_to_show$.getDynamicValue(thread)), thread);
                                }
                                if (NIL != list_utilities.sublisp_boolean(html_extract_input($str31$show_kbq_supports_, args))) {
                                    $cb_query_search_kbq_info_to_show$.setDynamicValue(cons($SUPPORTS, $cb_query_search_kbq_info_to_show$.getDynamicValue(thread)), thread);
                                }
                            }
                            final SubLObject input_string = html_extract_input($str33$search_string, args);
                            final SubLObject _prev_bind_0_$6 = cae_query_search.$current_cae_task$.currentBinding(thread);
                            try {
                                cae_query_search.$current_cae_task$.bind($cb_query_search_task$.getDynamicValue(thread), thread);
                                final SubLObject results = cb_query_search_results(input_string);
                                cb_show_handle_query_search(input_string, results);
                            } finally {
                                cae_query_search.$current_cae_task$.rebind(_prev_bind_0_$6, thread);
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

    public static SubLObject cb_show_handle_query_search(final SubLObject input_string, final SubLObject results) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_show_handle_query_search_form(input_string);
        if (NIL != input_string) {
            html_newline(TWO_INTEGER);
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            format(html_macros.$html_stream$.getDynamicValue(thread), $str36$Results_for__S_, input_string);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_newline(UNPROVIDED);
            if ((NIL == $cb_query_search_return_kbqsP$.getDynamicValue(thread)) && (NIL == $cb_query_search_return_fragmentsP$.getDynamicValue(thread))) {
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
                    html_princ_strong($str38$Please_select_Fragments_and_or_Re);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_font_tail$.getGlobalValue());
            }
            SubLObject result_string = NIL;
            SubLObject result_kbqs = NIL;
            destructuring_bind_must_consp(results, results, $list39);
            result_string = results.first();
            SubLObject current = results.rest();
            destructuring_bind_must_consp(current, results, $list39);
            result_kbqs = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != result_string) {
                    html_macros.verify_not_within_html_pre();
                    html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                    final SubLObject _prev_bind_2 = html_macros.$within_html_pre$.currentBinding(thread);
                    try {
                        html_macros.$within_html_pre$.bind(T, thread);
                        html_princ(result_string);
                    } finally {
                        html_macros.$within_html_pre$.rebind(_prev_bind_2, thread);
                    }
                    html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                }
                if (NIL != $cb_query_search_return_kbqsP$.getDynamicValue(thread)) {
                    if (NIL != list_utilities.empty_list_p(result_kbqs)) {
                        html_princ($str40$No_reified_queries_found_);
                    } else {
                        show_reified_query_search_results(result_kbqs);
                    }
                }
            } else {
                cdestructuring_bind_error(results, $list39);
            }
        }
        return NIL;
    }

    public static SubLObject cb_show_handle_query_search_form(final SubLObject input_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        cb_form_widgets.cb_el_term_input_section($cb_query_search_task$.getDynamicValue(thread), $list41);
        final SubLObject complete_genl = $$CycLQuerySpecification;
        final SubLObject pretty_name = $$$Filter_collection;
        if ($str43$A_query_type_for_reified_queries_.isString()) {
            final SubLObject onmouseover = html_script_utilities.html_hoverover_anchor_onmouseover($str43$A_query_type_for_reified_queries_, NIL, $int$300, NIL);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_onmouseover$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(onmouseover);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_anchor_onmouseout$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str45$nd___);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                cb_form_widgets.cb_el_term_input_section($cb_query_search_query_type$.getDynamicValue(thread), list(new SubLObject[]{ $INPUT_NAME, $str26$query_type, $COMPLETE_LABEL, NIL, $WIDTH, $int$500, $PRETTY_NAME, pretty_name, $CLEAR_LABEL, NIL, $COMPLETE_TYPE, list($$SpecsFn, complete_genl) }));
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        html_princ_strong($str54$Query_types__);
        html_indent(THREE_INTEGER);
        if ($str55$Should_we_construct_fragments_.isString()) {
            final SubLObject onmouseover2 = html_script_utilities.html_hoverover_anchor_onmouseover($str55$Should_we_construct_fragments_, NIL, $int$300, NIL);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_onmouseover$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(onmouseover2);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_anchor_onmouseout$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str45$nd___);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ($str56$Fragments__);
                html_checkbox_input($str25$fragments_, $$$t, $cb_query_search_return_fragmentsP$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        html_indent(THREE_INTEGER);
        final SubLObject return_kbqsP = $cb_query_search_return_kbqsP$.getDynamicValue(thread);
        if ($str58$Should_we_retrieve_reified_querie.isString()) {
            final SubLObject onmouseover3 = html_script_utilities.html_hoverover_anchor_onmouseover($str58$Should_we_retrieve_reified_querie, NIL, $int$300, NIL);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_onmouseover$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(onmouseover3);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_anchor_onmouseout$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str45$nd___);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_3 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ($str59$Reified_Queries__);
                html_checkbox_input($str24$kbqs_, $$$t, return_kbqsP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_3, thread);
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        html_princ($str60$__Show_query_sentence__);
        html_checkbox_input($str27$show_kbq_sentence_, $$$t, subl_promotions.memberP($QUERY_SENTENCE, $cb_query_search_kbq_info_to_show$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_princ($str61$_Gloss__);
        html_checkbox_input($str29$show_kbq_gloss_, $$$t, subl_promotions.memberP($GLOSS, $cb_query_search_kbq_info_to_show$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_princ($str62$_Supports__);
        html_checkbox_input($str31$show_kbq_supports_, $$$t, subl_promotions.memberP($SUPPORTS, $cb_query_search_kbq_info_to_show$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_princ($str63$_);
        html_newline(TWO_INTEGER);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($str64$Enter_A_Search_String__);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_indent(TWO_INTEGER);
        html_submit_input($$$Eval, UNPROVIDED, UNPROVIDED);
        html_indent(UNPROVIDED);
        html_script_utilities.html_clear_input_button($str33$search_string, $$$Clear, UNPROVIDED);
        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        html_newline(UNPROVIDED);
        html_markup(html_macros.$html_textarea_head$.getGlobalValue());
        html_markup(html_macros.$html_textarea_name$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str33$search_string);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != $cb_query_search_width$.getDynamicValue(thread)) {
            html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($cb_query_search_width$.getDynamicValue(thread));
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != $cb_query_search_height$.getDynamicValue(thread)) {
            html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($cb_query_search_height$.getDynamicValue(thread));
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_4 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            if (NIL != input_string) {
                html_princ(input_string);
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_4, thread);
        }
        html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject show_reified_query_search_results(final SubLObject result_kbqs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            SubLObject bgcolor = html_macros.$html_color_cyc_logo_lighter_violet$.getGlobalValue();
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            if (NIL != bgcolor) {
                html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(bgcolor);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($CENTER));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ_strong($$$Reified_Query);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($CENTER));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ_strong($$$Score);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            SubLObject color_toggle = NIL;
            SubLObject list_var = NIL;
            SubLObject pair = NIL;
            SubLObject index = NIL;
            list_var = result_kbqs;
            pair = list_var.first();
            for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , pair = list_var.first() , index = add(ONE_INTEGER, index)) {
                if (NIL != color_toggle) {
                    color_toggle = NIL;
                } else {
                    color_toggle = T;
                }
                bgcolor = (NIL != color_toggle) ? html_macros.$html_color_cyc_logo_lighter_violet$.getGlobalValue() : html_macros.$html_color_cyc_logo_light_violet$.getGlobalValue();
                SubLObject current;
                final SubLObject datum = current = pair;
                SubLObject kbq = NIL;
                SubLObject supports = NIL;
                destructuring_bind_must_consp(current, datum, $list70);
                kbq = current.first();
                current = supports = current.rest();
                final SubLObject score = cae_query_search.reified_query_search_score_from_supports(supports);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                if (NIL != bgcolor) {
                    html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(bgcolor);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_form(kbq, UNPROVIDED, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ(score);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                if (NIL != subl_promotions.memberP($GLOSS, $cb_query_search_kbq_info_to_show$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                    final SubLObject gloss = get_kbq_gloss(kbq);
                    if (NIL != gloss) {
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        if (NIL != bgcolor) {
                            html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(bgcolor);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
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
                                html_princ($str71$Gloss__);
                                html_markup(html_macros.$html_emphasized_head$.getGlobalValue());
                                html_princ(gloss);
                                html_markup(html_macros.$html_emphasized_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    }
                }
                if (NIL != subl_promotions.memberP($QUERY_SENTENCE, $cb_query_search_kbq_info_to_show$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    if (NIL != bgcolor) {
                        html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(bgcolor);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(TWO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            final SubLObject dhtml_object_id = cconcatenate($str72$cycl_, format_nil.format_nil_d_no_copy(index));
                            dhtml_macros.dhtml_switch_visibility_links_arrows(dhtml_object_id, $str73$);
                            html_princ($str74$Query_Sentence__);
                            dhtml_macros.dhtml_set_switched_visibility(dhtml_object_id, $INVISIBLE, $TEXT);
                            html_markup(html_macros.$html_div_head$.getGlobalValue());
                            if (NIL != dhtml_object_id) {
                                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(dhtml_object_id);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                cb_form(kb_query.kbq_sentence(kbq), ONE_INTEGER, T);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                            }
                            html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                }
                if (NIL != subl_promotions.memberP($SUPPORTS, $cb_query_search_kbq_info_to_show$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    if (NIL != bgcolor) {
                        html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(bgcolor);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(TWO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ($str77$Supports__);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    SubLObject cdolist_list_var = supports;
                    SubLObject support = NIL;
                    support = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject current_$21;
                        final SubLObject datum_$20 = current_$21 = support;
                        SubLObject token_record = NIL;
                        SubLObject v_term = NIL;
                        destructuring_bind_must_consp(current_$21, datum_$20, $list78);
                        token_record = current_$21.first();
                        current_$21 = current_$21.rest();
                        destructuring_bind_must_consp(current_$21, datum_$20, $list78);
                        v_term = current_$21.first();
                        current_$21 = current_$21.rest();
                        if (NIL == current_$21) {
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            if (NIL != bgcolor) {
                                html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(bgcolor);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(TWO_INTEGER);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    final SubLObject focal_string = cae_query_search.token_record_focal_string(token_record);
                                    final SubLObject score_$24 = cae_query_search.reified_query_search_score_from_support(support);
                                    final SubLObject explanation = cconcatenate(format_nil.format_nil_s_no_copy(focal_string), new SubLObject[]{ $$$_is_mapped_to_, format_nil.format_nil_s_no_copy(v_term), $$$_with_a_score_of_, format_nil.format_nil_d_no_copy(score_$24), $str81$_ });
                                    if (explanation.isString()) {
                                        final SubLObject onmouseover = html_script_utilities.html_hoverover_anchor_onmouseover(explanation, NIL, $int$300, NIL);
                                        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                        html_markup(html_macros.$html_anchor_onmouseover$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(onmouseover);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_macros.$html_anchor_onmouseout$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup($str45$nd___);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_indent(THREE_INTEGER);
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str82$_S____, focal_string);
                                            cb_form(v_term, UNPROVIDED, UNPROVIDED);
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str83$___D_, score_$24);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                                        }
                                        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } else {
                            cdestructuring_bind_error(datum_$20, $list78);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        support = cdolist_list_var.first();
                    } 
                }
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject get_kbq_gloss(final SubLObject kbq) {
        SubLObject gloss = kb_mapping_utilities.fpred_value_in_any_mt(kbq, $$queryContentString, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == gloss) {
            final SubLObject formula_template = kb_query.kbq_template(kbq);
            if (NIL != formula_template) {
                gloss = kb_mapping_utilities.fpred_value_in_any_mt(formula_template, $$formulaTemplateGloss, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return gloss;
    }

    public static SubLObject cb_query_search_results(final SubLObject search_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_string = NIL;
        SubLObject kbqs = NIL;
        SubLObject err = NIL;
        if (NIL != string_utilities.non_empty_string_p(search_string)) {
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        if (NIL != $cb_query_search_return_fragmentsP$.getDynamicValue(thread)) {
                            SubLObject stream = NIL;
                            try {
                                stream = make_private_string_output_stream();
                                cae_query_search.debug_query_search_string(search_string, $cb_query_search_task$.getDynamicValue(thread), NIL, stream, UNPROVIDED);
                                result_string = get_output_stream_string(stream);
                            } finally {
                                final SubLObject _prev_bind_0_$26 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    close(stream, UNPROVIDED);
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                                }
                            }
                        }
                        if (NIL != $cb_query_search_return_kbqsP$.getDynamicValue(thread)) {
                            kbqs = cae_query_search.get_reified_queries_from_string(search_string, $cb_query_search_task$.getDynamicValue(thread), $cb_query_search_query_type$.getDynamicValue(thread));
                        }
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                err = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
            if (NIL != err) {
                result_string = err;
            }
        }
        return list(result_string, kbqs);
    }

    public static SubLObject cb_link_query_search(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$Query_Search;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str22$cb_handle_query_search);
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

    public static SubLObject declare_cb_query_search_file() {
        declareFunction("cb_handle_query_search", "CB-HANDLE-QUERY-SEARCH", 0, 1, false);
        declareFunction("cb_show_handle_query_search", "CB-SHOW-HANDLE-QUERY-SEARCH", 2, 0, false);
        declareFunction("cb_show_handle_query_search_form", "CB-SHOW-HANDLE-QUERY-SEARCH-FORM", 1, 0, false);
        declareFunction("show_reified_query_search_results", "SHOW-REIFIED-QUERY-SEARCH-RESULTS", 1, 0, false);
        declareFunction("get_kbq_gloss", "GET-KBQ-GLOSS", 1, 0, false);
        declareFunction("cb_query_search_results", "CB-QUERY-SEARCH-RESULTS", 1, 0, false);
        declareFunction("cb_link_query_search", "CB-LINK-QUERY-SEARCH", 0, 1, false);
        return NIL;
    }

    public static SubLObject init_cb_query_search_file() {
        defparameter("*CB-QUERY-SEARCH-WIDTH*", $int$80);
        defparameter("*CB-QUERY-SEARCH-HEIGHT*", THREE_INTEGER);
        defparameter("*CB-QUERY-SEARCH-RETURN-FRAGMENTS?*", NIL);
        defparameter("*CB-QUERY-SEARCH-RETURN-KBQS?*", T);
        defparameter("*CB-QUERY-SEARCH-KBQ-INFO-TO-SHOW*", $list3);
        defparameter("*CB-QUERY-SEARCH-QUERY-TYPE*", $$CycLQuerySpecification);
        defparameter("*CB-QUERY-SEARCH-TASK*", $$GeneralCycKETask_Allotment);
        return NIL;
    }

    public static SubLObject setup_cb_query_search_file() {
        register_html_state_variable($sym1$_CB_QUERY_SEARCH_RETURN_FRAGMENTS__);
        register_html_interface_variable($sym1$_CB_QUERY_SEARCH_RETURN_FRAGMENTS__);
        register_html_state_variable($sym2$_CB_QUERY_SEARCH_RETURN_KBQS__);
        register_html_interface_variable($sym2$_CB_QUERY_SEARCH_RETURN_KBQS__);
        register_html_state_variable($cb_query_search_kbq_info_to_show$);
        register_html_interface_variable($cb_query_search_kbq_info_to_show$);
        register_html_state_variable($cb_query_search_query_type$);
        register_html_interface_variable($cb_query_search_query_type$);
        register_html_state_variable($cb_query_search_task$);
        register_html_interface_variable($cb_query_search_task$);
        html_macros.note_cgi_handler_function(CB_HANDLE_QUERY_SEARCH, $HTML_HANDLER);
        setup_cb_link_method($QUERY_SEARCH, CB_LINK_QUERY_SEARCH, ONE_INTEGER);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_query_search_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_query_search_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_query_search_file();
    }

    static {


































































































    }
}

/**
 * Total time: 623 ms
 */
