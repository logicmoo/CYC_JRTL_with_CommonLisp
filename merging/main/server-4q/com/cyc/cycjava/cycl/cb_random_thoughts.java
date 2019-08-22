/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_followP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_indexP$;
import static com.cyc.cycjava.cycl.cb_parameters.cb_head_shortcut_icon;
import static com.cyc.cycjava.cycl.cb_parameters.cyc_cgi_url_int;
import static com.cyc.cycjava.cycl.cb_utilities.cb_form;
import static com.cyc.cycjava.cycl.cb_utilities.cb_fort_identifier;
import static com.cyc.cycjava.cycl.cb_utilities.cb_frame_name;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_assertion;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_fort;
import static com.cyc.cycjava.cycl.cb_utilities.cb_link;
import static com.cyc.cycjava.cycl.cb_utilities.cb_string_for_fort;
import static com.cyc.cycjava.cycl.cb_utilities.declare_cb_tool;
import static com.cyc.cycjava.cycl.cb_utilities.setup_cb_link_method;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_ternary_formula;
import static com.cyc.cycjava.cycl.html_utilities.html_align;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_color;
import static com.cyc.cycjava.cycl.html_utilities.html_copyright_notice;
import static com.cyc.cycjava.cycl.html_utilities.html_extract_input;
import static com.cyc.cycjava.cycl.html_utilities.html_hidden_input;
import static com.cyc.cycjava.cycl.html_utilities.html_indent;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_meta_robot_instructions;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_refresh;
import static com.cyc.cycjava.cycl.html_utilities.html_simple_attribute;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.cycjava.cycl.html_utilities.html_submit_input;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.butler.web_game;
import com.cyc.cycjava.cycl.inference.browser.cb_query;
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
 * module:      CB-RANDOM-THOUGHTS
 * source file: /cyc/top/cycl/cb-random-thoughts.lisp
 * created:     2019/07/03 17:38:08
 */
public final class cb_random_thoughts extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt24$ = makeString("");

    public static final SubLFile me = new cb_random_thoughts();

 public static final String myName = "com.cyc.cycjava.cycl.cb_random_thoughts";


    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $random_thought_cyclists$ = makeSymbol("*RANDOM-THOUGHT-CYCLISTS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $random_thought_refresh_rate$ = makeSymbol("*RANDOM-THOUGHT-REFRESH-RATE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $cb_random_thoughts_evaluation_options$ = makeSymbol("*CB-RANDOM-THOUGHTS-EVALUATION-OPTIONS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $assert_random_thought_judgmentsP$ = makeSymbol("*ASSERT-RANDOM-THOUGHT-JUDGMENTS?*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str0$_Random_Thought_ = makeString("[Random Thought]");

    static private final SubLString $str2$cb_random_thoughts = makeString("cb-random-thoughts");

    private static final SubLSymbol CB_LINK_RANDOM_THOUGHT = makeSymbol("CB-LINK-RANDOM-THOUGHT");

    private static final SubLSymbol CB_RANDOM_THOUGHTS = makeSymbol("CB-RANDOM-THOUGHTS");



    private static final SubLString $$$the_Random_Thought_Generator = makeString("the Random Thought Generator");

    static private final SubLList $list9 = list(makeKeyword("NOW"), NIL);

    private static final SubLList $list10 = list(makeSymbol("TERM"), makeSymbol("ASSERTION"), makeSymbol("JAVALIST"));

    private static final SubLString $$$Random_Thoughts = makeString("Random Thoughts");

    private static final SubLString $str12$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str13$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");

    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");

    private static final SubLString $str18$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $$$post = makeString("post");

    private static final SubLString $str24$cb_handle_random_thoughts = makeString("cb-handle-random-thoughts");

    private static final SubLString $$$term = makeString("term");

    private static final SubLString $str26$assertion_id = makeString("assertion-id");

    private static final SubLString $str27$CycL__ = makeString("CycL: ");

    private static final SubLString $$$New_ = makeString("New ");

    private static final SubLString $$$Related_ = makeString("Related ");

    private static final SubLString $$$Same_ = makeString("Same ");

    private static final SubLString $str34$ = makeString("");

    private static final SubLString $str35$Topic__ = makeString("Topic: ");

    private static final SubLString $$$New_Thought = makeString("New Thought");

    private static final SubLString $str37$new_thought = makeString("new-thought");

    private static final SubLString $str39$_I_have_shared__S_random_thoughts = makeString("(I have shared ~S random thoughts with you so far.)");

    private static final SubLString $str40$_I_have_thought_of__S_more_things = makeString("(I have thought of ~S more things to say.)");

    private static final SubLSymbol CB_HANDLE_RANDOM_THOUGHTS = makeSymbol("CB-HANDLE-RANDOM-THOUGHTS");

    private static final SubLList $list43 = list(reader_make_constant_shell("Baxter"), reader_make_constant_shell("DaveS"), reader_make_constant_shell("Witbrock"));

    private static final SubLList $list44 = list(makeSymbol("CYCLIST-STRING"), makeSymbol("TOPIC-STRING"));

    private static final SubLSymbol CB_RANDOM_THOUGHT_FRAME = makeSymbol("CB-RANDOM-THOUGHT-FRAME");

    static private final SubLList $list47 = list(makeKeyword("REQUIRE-TOPICAL?"), NIL, makeKeyword("NOW"), NIL);

    private static final SubLList $list48 = list(makeSymbol("TOPIC"), makeSymbol("ASSERTION"), makeSymbol("ASSERTION-PARAPHRASE"));

    private static final SubLString $str49$cb_handle_random_thought_frame = makeString("cb-handle-random-thought-frame");

    private static final SubLString $$$cyclist = makeString("cyclist");

    private static final SubLString $$$paraphrase = makeString("paraphrase");

    private static final SubLString $$$topic = makeString("topic");

    private static final SubLString $str53$position__absolute__bottom__0pt = makeString("position: absolute; bottom: 0pt");

    private static final SubLList $list54 = list(cons(reader_make_constant_shell("TrueCycLSentence"), makeString("True")), cons(reader_make_constant_shell("FalseCycLSentence"), makeString("False")), cons(reader_make_constant_shell("BadlyParaphrasedCycLSentence"), makeString("Bad Paraphrase")), cons(reader_make_constant_shell("UninterestingCycLSentence"), makeString("Uninteresting")), cons(reader_make_constant_shell("ProblematicCycLSentence"), makeString("Other")));

    private static final SubLString $str55$100_ = makeString("100%");

    private static final SubLString $$$center = makeString("center");

    private static final SubLList $list57 = cons(makeUninternedSymbol("KEY"), makeSymbol("LABEL"));

    private static final SubLString $$$Skip = makeString("Skip");

    private static final SubLString $$$right = makeString("right");

    private static final SubLString $str61$Your_evaluation__ = makeString("Your evaluation: ");

    private static final SubLString $$$left = makeString("left");

    private static final SubLSymbol $RANDOM_THOUGHT_FRAME = makeKeyword("RANDOM-THOUGHT-FRAME");

    private static final SubLString $str64$_New_Random_Thought_ = makeString("[New Random Thought]");

    private static final SubLString $str66$cb_random_thought_frame__A__A = makeString("cb-random-thought-frame&~A&~A");

    private static final SubLSymbol CB_LINK_RANDOM_THOUGHT_FRAME = makeSymbol("CB-LINK-RANDOM-THOUGHT-FRAME");

    private static final SubLList $list68 = cons(makeSymbol("CANDIDATE"), makeSymbol("STRING"));









    private static final SubLObject $const73$EvaluatedSentencesFromRandomThoug = reader_make_constant_shell("EvaluatedSentencesFromRandomThoughtServerMt");

    private static final SubLSymbol CB_HANDLE_RANDOM_THOUGHT_FRAME = makeSymbol("CB-HANDLE-RANDOM-THOUGHT-FRAME");

    private static final SubLInteger $int$3600 = makeInteger(3600);

    private static final SubLString $str76$cb_random_thought_frame_ = makeString("cb-random-thought-frame&");

    private static final SubLString $str77$_ = makeString("&");

    private static final SubLString $str78$random_thought = makeString("random_thought");

    private static final SubLInteger $int$75 = makeInteger(75);

    private static final SubLString $$$no = makeString("no");

    // Definitions
    /**
     * Define HTML link for displaying random thought about some term
     */
    @LispMethod(comment = "Define HTML link for displaying random thought about some term")
    public static final SubLObject cb_link_random_thought_alt(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt0$_Random_Thought_;
            }
            {
                SubLObject frame_name_var = cb_frame_name($MAIN);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt2$cb_random_thoughts);
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

    // Definitions
    /**
     * Define HTML link for displaying random thought about some term
     */
    @LispMethod(comment = "Define HTML link for displaying random thought about some term")
    public static SubLObject cb_link_random_thought(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str0$_Random_Thought_;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str2$cb_random_thoughts);
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

    public static final SubLObject cb_random_thoughts_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        return com.cyc.cycjava.cycl.cb_random_thoughts.cb_random_thought_for_cyclist(operation_communication.the_cyclist(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cb_random_thoughts(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        return cb_random_thought_for_cyclist(operation_communication.the_cyclist(), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cb_random_thought_for_cyclist_alt(SubLObject cyclist, SubLObject last_term, SubLObject last_assertion_id) {
        if (last_term == UNPROVIDED) {
            last_term = NIL;
        }
        if (last_assertion_id == UNPROVIDED) {
            last_assertion_id = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (cyclist == $$Guest) {
                cyc_navigator_internals.guest_warn($$$the_Random_Thought_Generator);
                return NIL;
            }
            {
                SubLObject thought = random_thought_generator.next_random_thought_for_user(cyclist, $list_alt8);
                SubLObject datum = thought;
                SubLObject current = datum;
                SubLObject v_term = NIL;
                SubLObject assertion = NIL;
                SubLObject javalist = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt9);
                v_term = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt9);
                assertion = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt9);
                javalist = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject assertion_paraphrase = pph_utilities.pph_javalist_string(javalist);
                        html_script_utilities.cb_hoverover_page_init();
                        {
                            SubLObject title_var = $$$Random_Thoughts;
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
                                                html_markup($str_alt13$yui_skin_sam);
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
                                                                html_hidden_input($str_alt14$cb_handle_random_thoughts, T, UNPROVIDED);
                                                                html_hidden_input($$$term, cb_fort_identifier(v_term), UNPROVIDED);
                                                                if (NIL != assertion) {
                                                                    html_hidden_input($str_alt16$assertion_id, assertion_handles.assertion_id(assertion), UNPROVIDED);
                                                                }
                                                                {
                                                                    SubLObject connection_to_last = com.cyc.cycjava.cycl.cb_random_thoughts.cb_random_thought_connection_type(v_term, last_term, last_assertion_id);
                                                                    SubLObject hoverover_html = NIL;
                                                                    SubLObject stream = NIL;
                                                                    try {
                                                                        stream = make_private_string_output_stream();
                                                                        {
                                                                            SubLObject _prev_bind_0_4 = html_macros.$html_stream$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_stream$.bind(stream, thread);
                                                                                html_princ($str_alt17$CycL__);
                                                                                cb_form(v_term, UNPROVIDED, UNPROVIDED);
                                                                            } finally {
                                                                                html_macros.$html_stream$.rebind(_prev_bind_0_4, thread);
                                                                            }
                                                                        }
                                                                        hoverover_html = get_output_stream_string(stream);
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                close(stream, UNPROVIDED);
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_5, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    cb_query.cb_princ_strong_with_explanation(cconcatenate(format_nil.format_nil_a_no_copy(connection_to_last == $NEW ? ((SubLObject) ($str_alt19$New_)) : connection_to_last == $RELATED ? ((SubLObject) ($str_alt21$Related_)) : connection_to_last == $SAME ? ((SubLObject) ($str_alt23$Same_)) : $str_alt24$), new SubLObject[]{ $str_alt25$Topic__, format_nil.format_nil_s_no_copy(pph_main.generate_phrase(v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) }), hoverover_html, NIL, NIL, T);
                                                                }
                                                                html_newline(TWO_INTEGER);
                                                                {
                                                                    SubLObject hoverover_html = NIL;
                                                                    SubLObject stream = NIL;
                                                                    try {
                                                                        stream = make_private_string_output_stream();
                                                                        {
                                                                            SubLObject _prev_bind_0_6 = html_macros.$html_stream$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_stream$.bind(stream, thread);
                                                                                html_princ($str_alt17$CycL__);
                                                                                cb_form(assertion, UNPROVIDED, UNPROVIDED);
                                                                            } finally {
                                                                                html_macros.$html_stream$.rebind(_prev_bind_0_6, thread);
                                                                            }
                                                                        }
                                                                        hoverover_html = get_output_stream_string(stream);
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0_7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                close(stream, UNPROVIDED);
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_7, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    html_markup(html_macros.$html_big_head$.getGlobalValue());
                                                                    html_markup(html_macros.$html_emphasized_head$.getGlobalValue());
                                                                    cb_query.cb_princ_with_explanation(assertion_paraphrase, hoverover_html, NIL, NIL, T);
                                                                    html_markup(html_macros.$html_emphasized_tail$.getGlobalValue());
                                                                    html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                                                    html_indent(UNPROVIDED);
                                                                    cb_assertion_browser.cb_paraphrase_bugzilla_link(assertion, assertion_paraphrase, UNPROVIDED);
                                                                    html_newline(UNPROVIDED);
                                                                }
                                                                html_newline(TWO_INTEGER);
                                                                html_submit_input($$$New_Thought, $str_alt27$new_thought, UNPROVIDED);
                                                                html_newline(TWO_INTEGER);
                                                                {
                                                                    SubLObject color_val = $DARK_GRAY;
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
                                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt29$_I_have_shared__S_random_thoughts, random_thought_generator.number_of_used_random_thoughts_for_user(cyclist));
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                                                        }
                                                                    }
                                                                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                                }
                                                                html_newline(UNPROVIDED);
                                                                {
                                                                    SubLObject color_val = $DARK_GRAY;
                                                                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                                    if (NIL != color_val) {
                                                                        html_markup(html_macros.$html_font_color$.getGlobalValue());
                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_markup(html_color(color_val));
                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt30$_I_have_thought_of__S_more_things, random_thought_generator.number_of_queued_random_thoughts_for_user(cyclist));
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
                                                                        }
                                                                    }
                                                                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                                }
                                                                html_newline(UNPROVIDED);
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
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt9);
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_random_thought_for_cyclist(final SubLObject cyclist, SubLObject last_term, SubLObject last_assertion_id) {
        if (last_term == UNPROVIDED) {
            last_term = NIL;
        }
        if (last_assertion_id == UNPROVIDED) {
            last_assertion_id = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != kb_utilities.kbeq(cyclist, $$Guest)) {
            cyc_navigator_internals.guest_warn($$$the_Random_Thought_Generator);
            return NIL;
        }
        final SubLObject thought = random_thought_generator.next_random_thought_for_user(cyclist, $list9);
        SubLObject current;
        final SubLObject datum = current = thought;
        SubLObject v_term = NIL;
        SubLObject assertion = NIL;
        SubLObject javalist = NIL;
        destructuring_bind_must_consp(current, datum, $list10);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list10);
        assertion = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list10);
        javalist = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject assertion_paraphrase = pph_utilities.pph_javalist_string(javalist);
            html_script_utilities.cb_hoverover_page_init();
            final SubLObject title_var = $$$Random_Thoughts;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                html_markup($str12$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup($str13$_meta_http_equiv__X_UA_Compatible);
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
                        html_markup($str18$yui_skin_sam);
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
                                html_hidden_input($str24$cb_handle_random_thoughts, T, UNPROVIDED);
                                html_hidden_input($$$term, cb_fort_identifier(v_term), UNPROVIDED);
                                if (NIL != assertion) {
                                    html_hidden_input($str26$assertion_id, assertion_handles.assertion_id(assertion), UNPROVIDED);
                                }
                                final SubLObject connection_to_last = cb_random_thought_connection_type(v_term, last_term, last_assertion_id);
                                SubLObject hoverover_html = NIL;
                                SubLObject stream = NIL;
                                try {
                                    stream = make_private_string_output_stream();
                                    final SubLObject _prev_bind_0_$6 = html_macros.$html_stream$.currentBinding(thread);
                                    try {
                                        html_macros.$html_stream$.bind(stream, thread);
                                        html_princ($str27$CycL__);
                                        cb_form(v_term, UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        html_macros.$html_stream$.rebind(_prev_bind_0_$6, thread);
                                    }
                                    hoverover_html = get_output_stream_string(stream);
                                } finally {
                                    final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        close(stream, UNPROVIDED);
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                                    }
                                }
                                cb_query.cb_princ_strong_with_explanation(cconcatenate(format_nil.format_nil_a_no_copy(connection_to_last == $NEW ? $$$New_ : connection_to_last == $RELATED ? $$$Related_ : connection_to_last == $SAME ? $$$Same_ : $str34$), new SubLObject[]{ $str35$Topic__, format_nil.format_nil_s_no_copy(pph_main.generate_phrase(v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) }), hoverover_html, NIL, NIL, T);
                                html_newline(TWO_INTEGER);
                                SubLObject hoverover_html2 = NIL;
                                SubLObject stream2 = NIL;
                                try {
                                    stream2 = make_private_string_output_stream();
                                    final SubLObject _prev_bind_0_$8 = html_macros.$html_stream$.currentBinding(thread);
                                    try {
                                        html_macros.$html_stream$.bind(stream2, thread);
                                        html_princ($str27$CycL__);
                                        cb_form(assertion, UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        html_macros.$html_stream$.rebind(_prev_bind_0_$8, thread);
                                    }
                                    hoverover_html2 = get_output_stream_string(stream2);
                                } finally {
                                    final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        close(stream2, UNPROVIDED);
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                                    }
                                }
                                html_markup(html_macros.$html_big_head$.getGlobalValue());
                                html_markup(html_macros.$html_emphasized_head$.getGlobalValue());
                                cb_query.cb_princ_with_explanation(assertion_paraphrase, hoverover_html2, NIL, NIL, T);
                                html_markup(html_macros.$html_emphasized_tail$.getGlobalValue());
                                html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                html_newline(UNPROVIDED);
                                html_newline(TWO_INTEGER);
                                html_submit_input($$$New_Thought, $str37$new_thought, UNPROVIDED);
                                html_newline(TWO_INTEGER);
                                SubLObject color_val = $DARK_GRAY;
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
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str39$_I_have_shared__S_random_thoughts, random_thought_generator.number_of_used_random_thoughts_for_user(cyclist));
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                                }
                                html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                html_newline(UNPROVIDED);
                                color_val = $DARK_GRAY;
                                html_markup(html_macros.$html_font_head$.getGlobalValue());
                                if (NIL != color_val) {
                                    html_markup(html_macros.$html_font_color$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_color(color_val));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str40$_I_have_thought_of__S_more_things, random_thought_generator.number_of_queued_random_thoughts_for_user(cyclist));
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                                }
                                html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                html_newline(UNPROVIDED);
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
        } else {
            cdestructuring_bind_error(datum, $list10);
        }
        return NIL;
    }

    public static final SubLObject cb_show_random_thought_alt(SubLObject assertion, SubLObject assertion_paraphrase, SubLObject linksP, SubLObject sticky_hoveroverP) {
        if (linksP == UNPROVIDED) {
            linksP = T;
        }
        if (sticky_hoveroverP == UNPROVIDED) {
            sticky_hoveroverP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject hoverover_html = NIL;
                SubLObject stream = NIL;
                try {
                    stream = make_private_string_output_stream();
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
                        try {
                            html_macros.$html_stream$.bind(stream, thread);
                            html_princ($str_alt17$CycL__);
                            if (NIL != linksP) {
                                cb_form(assertion, UNPROVIDED, UNPROVIDED);
                            } else {
                                html_princ(assertions_high.assertion_ist_formula(assertion));
                            }
                        } finally {
                            html_macros.$html_stream$.rebind(_prev_bind_0, thread);
                        }
                    }
                    hoverover_html = get_output_stream_string(stream);
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            close(stream, UNPROVIDED);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                html_markup(html_macros.$html_big_head$.getGlobalValue());
                html_markup(html_macros.$html_emphasized_head$.getGlobalValue());
                cb_query.cb_princ_with_explanation(assertion_paraphrase, hoverover_html, NIL, NIL, sticky_hoveroverP);
                html_markup(html_macros.$html_emphasized_tail$.getGlobalValue());
                html_markup(html_macros.$html_big_tail$.getGlobalValue());
                return assertion;
            }
        }
    }

    public static SubLObject cb_show_random_thought(final SubLObject assertion, final SubLObject assertion_paraphrase, SubLObject linksP, SubLObject sticky_hoveroverP) {
        if (linksP == UNPROVIDED) {
            linksP = T;
        }
        if (sticky_hoveroverP == UNPROVIDED) {
            sticky_hoveroverP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hoverover_html = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
            try {
                html_macros.$html_stream$.bind(stream, thread);
                html_princ($str27$CycL__);
                if (NIL != linksP) {
                    cb_form(assertion, UNPROVIDED, UNPROVIDED);
                } else {
                    html_princ(assertions_high.assertion_ist_formula(assertion));
                }
            } finally {
                html_macros.$html_stream$.rebind(_prev_bind_0, thread);
            }
            hoverover_html = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        html_markup(html_macros.$html_big_head$.getGlobalValue());
        html_markup(html_macros.$html_emphasized_head$.getGlobalValue());
        cb_query.cb_princ_with_explanation(assertion_paraphrase, hoverover_html, NIL, NIL, sticky_hoveroverP);
        html_markup(html_macros.$html_emphasized_tail$.getGlobalValue());
        html_markup(html_macros.$html_big_tail$.getGlobalValue());
        return assertion;
    }

    public static final SubLObject cb_random_thought_connection_type_alt(SubLObject v_term, SubLObject last_term, SubLObject last_assertion_id) {
        if (NIL == last_term) {
            return $UNKNOWN;
        } else {
            if (v_term.eql(last_term)) {
                return $SAME;
            } else {
                if (NIL == last_assertion_id) {
                    return $NEW;
                } else {
                    if (NIL != cycl_utilities.expression_find(v_term, assertion_handles.find_assertion_by_id(last_assertion_id), T, UNPROVIDED, UNPROVIDED)) {
                        return $RELATED;
                    } else {
                        return $NEW;
                    }
                }
            }
        }
    }

    public static SubLObject cb_random_thought_connection_type(final SubLObject v_term, final SubLObject last_term, final SubLObject last_assertion_id) {
        if (NIL == last_term) {
            return $UNKNOWN;
        }
        if (v_term.eql(last_term)) {
            return $SAME;
        }
        if (NIL == last_assertion_id) {
            return $NEW;
        }
        if (NIL != cycl_utilities.expression_find(v_term, assertion_handles.find_assertion_by_id(last_assertion_id), T, UNPROVIDED, UNPROVIDED)) {
            return $RELATED;
        }
        return $NEW;
    }

    public static final SubLObject cb_handle_random_thoughts_alt(SubLObject args) {
        {
            SubLObject term_id = html_extract_input($$$term, args);
            SubLObject v_term = (term_id.isString()) ? ((SubLObject) (cb_guess_fort(term_id, UNPROVIDED))) : NIL;
            SubLObject assertion_id_string = html_extract_input($str_alt16$assertion_id, args);
            SubLObject assertion_id = (assertion_id_string.isString()) ? ((SubLObject) (read_from_string(assertion_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : NIL;
            return com.cyc.cycjava.cycl.cb_random_thoughts.cb_random_thought_for_cyclist(operation_communication.the_cyclist(), v_term, assertion_id);
        }
    }

    public static SubLObject cb_handle_random_thoughts(final SubLObject args) {
        final SubLObject term_id = html_extract_input($$$term, args);
        final SubLObject v_term = (term_id.isString()) ? cb_guess_fort(term_id, UNPROVIDED) : NIL;
        final SubLObject assertion_id_string = html_extract_input($str26$assertion_id, args);
        final SubLObject assertion_id = (assertion_id_string.isString()) ? read_from_string(assertion_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
        return cb_random_thought_for_cyclist(operation_communication.the_cyclist(), v_term, assertion_id);
    }

    public static final SubLObject show_random_thought_for_user_and_topic_p_alt(SubLObject user, SubLObject topic) {
        return makeBoolean((NIL != forts.fort_p(topic)) && (NIL != member(user, $random_thought_cyclists$.getGlobalValue(), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject show_random_thought_for_user_and_topic_p(final SubLObject user, final SubLObject topic) {
        return makeBoolean((NIL != forts.fort_p(topic)) && (NIL != member(user, $random_thought_cyclists$.getGlobalValue(), UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject cb_random_thought_frame_alt(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject cyclist_string = NIL;
            SubLObject topic_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt37);
            cyclist_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt37);
            topic_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject cyclist = cb_guess_fort(cyclist_string, UNPROVIDED);
                    SubLObject topic = cb_guess_fort(topic_string, UNPROVIDED);
                    return com.cyc.cycjava.cycl.cb_random_thoughts.cb_random_thought_retrieve_and_display(cyclist, topic);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt37);
            }
        }
        return NIL;
    }

    public static SubLObject cb_random_thought_frame(final SubLObject args) {
        SubLObject cyclist_string = NIL;
        SubLObject topic_string = NIL;
        destructuring_bind_must_consp(args, args, $list44);
        cyclist_string = args.first();
        SubLObject current = args.rest();
        destructuring_bind_must_consp(current, args, $list44);
        topic_string = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject cyclist = cb_guess_fort(cyclist_string, UNPROVIDED);
            final SubLObject topic = cb_guess_fort(topic_string, UNPROVIDED);
            return cb_random_thought_retrieve_and_display(cyclist, topic);
        }
        cdestructuring_bind_error(args, $list44);
        return NIL;
    }

    public static final SubLObject cb_random_thought_retrieve_and_display_alt(SubLObject cyclist, SubLObject topic) {
        {
            SubLObject thought = NIL;
            html_refresh($random_thought_refresh_rate$.getGlobalValue());
            thought = random_thought_generator.next_random_thought_for_user(cyclist, listS($TOPIC, topic, $list_alt40));
            if (NIL != random_thought_generator.non_empty_random_thought_p(thought)) {
                {
                    SubLObject datum = thought;
                    SubLObject current = datum;
                    SubLObject topic_10 = NIL;
                    SubLObject assertion = NIL;
                    SubLObject assertion_paraphrase = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt41);
                    topic_10 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt41);
                    assertion = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt41);
                    assertion_paraphrase = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        return com.cyc.cycjava.cycl.cb_random_thoughts.cb_random_thought_frame_internal(cyclist, topic_10, assertion, assertion_paraphrase, UNPROVIDED);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt41);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject cb_random_thought_retrieve_and_display(final SubLObject cyclist, final SubLObject topic) {
        SubLObject thought = NIL;
        html_refresh($random_thought_refresh_rate$.getGlobalValue(), UNPROVIDED);
        thought = random_thought_generator.next_random_thought_for_user(cyclist, listS($TOPIC, topic, $list47));
        if (NIL != random_thought_generator.non_empty_random_thought_p(thought)) {
            SubLObject current;
            final SubLObject datum = current = thought;
            SubLObject topic_$12 = NIL;
            SubLObject assertion = NIL;
            SubLObject assertion_paraphrase = NIL;
            destructuring_bind_must_consp(current, datum, $list48);
            topic_$12 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list48);
            assertion = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list48);
            assertion_paraphrase = current.first();
            current = current.rest();
            if (NIL == current) {
                return cb_random_thought_frame_internal(cyclist, topic_$12, assertion, assertion_paraphrase, UNPROVIDED);
            }
            cdestructuring_bind_error(datum, $list48);
        }
        return NIL;
    }

    public static final SubLObject cb_random_thought_frame_internal_alt(SubLObject cyclist, SubLObject topic, SubLObject assertion, SubLObject assertion_paraphrase, SubLObject evaluation) {
        if (evaluation == UNPROVIDED) {
            evaluation = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            {
                SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (NIL != html_macros.$html_color_cyc_logo_lighter_violet$.getDynamicValue(thread)) {
                        html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_color(html_macros.$html_color_cyc_logo_lighter_violet$.getDynamicValue(thread)));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
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
                                    SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_macros.$within_html_form$.bind(T, thread);
                                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                        html_hidden_input($str_alt42$cb_handle_random_thought_frame, T, UNPROVIDED);
                                        html_hidden_input($str_alt16$assertion_id, assertion_handles.assertion_id(assertion), UNPROVIDED);
                                        html_hidden_input($$$cyclist, cb_string_for_fort(cyclist), UNPROVIDED);
                                        html_hidden_input($$$paraphrase, assertion_paraphrase, UNPROVIDED);
                                        html_hidden_input($$$topic, topic, UNPROVIDED);
                                        html_script_utilities.cb_hoverover_page_init();
                                        html_markup(html_macros.$html_center_head$.getGlobalValue());
                                        html_markup(html_macros.$html_small_head$.getGlobalValue());
                                        com.cyc.cycjava.cycl.cb_random_thoughts.cb_show_random_thought(assertion, assertion_paraphrase, NIL, NIL);
                                        html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                                        html_markup(html_macros.$html_div_style$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup($str_alt46$position__absolute__bottom__0pt);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                if (NIL != evaluation) {
                                                    com.cyc.cycjava.cycl.cb_random_thoughts.cb_random_thoughts_evaluation(evaluation, cyclist, topic);
                                                } else {
                                                    com.cyc.cycjava.cycl.cb_random_thoughts.cb_random_thoughts_button_bar();
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_center_tail$.getGlobalValue());
                                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                    } finally {
                                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                        html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
                                    }
                                }
                                html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
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
            return NIL;
        }
    }

    public static SubLObject cb_random_thought_frame_internal(final SubLObject cyclist, final SubLObject topic, final SubLObject assertion, final SubLObject assertion_paraphrase, SubLObject evaluation) {
        if (evaluation == UNPROVIDED) {
            evaluation = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup($str12$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str13$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            final SubLObject _prev_bind_0_$13 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                if (NIL != html_macros.$html_color_cyc_logo_lighter_violet$.getGlobalValue()) {
                    html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_color(html_macros.$html_color_cyc_logo_lighter_violet$.getGlobalValue()));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
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
                    final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_macros.$within_html_form$.bind(T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_hidden_input($str49$cb_handle_random_thought_frame, T, UNPROVIDED);
                        html_hidden_input($str26$assertion_id, assertion_handles.assertion_id(assertion), UNPROVIDED);
                        html_hidden_input($$$cyclist, cb_string_for_fort(cyclist), UNPROVIDED);
                        html_hidden_input($$$paraphrase, assertion_paraphrase, UNPROVIDED);
                        html_hidden_input($$$topic, topic, UNPROVIDED);
                        html_script_utilities.cb_hoverover_page_init();
                        html_markup(html_macros.$html_center_head$.getGlobalValue());
                        html_markup(html_macros.$html_small_head$.getGlobalValue());
                        cb_show_random_thought(assertion, assertion_paraphrase, NIL, NIL);
                        html_markup(html_macros.$html_small_tail$.getGlobalValue());
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_div_style$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str53$position__absolute__bottom__0pt);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            if (NIL != evaluation) {
                                cb_random_thoughts_evaluation(evaluation, cyclist, topic);
                            } else {
                                cb_random_thoughts_button_bar();
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        html_markup(html_macros.$html_center_tail$.getGlobalValue());
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                    }
                    html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$13, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_random_thoughts_button_bar_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            if (true) {
                html_markup(html_macros.$html_table_width$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str_alt48$100_);
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
                        SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($$$center));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    {
                                        SubLObject cdolist_list_var = $cb_random_thoughts_evaluation_options$.getGlobalValue();
                                        SubLObject cons = NIL;
                                        for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                                            {
                                                SubLObject datum = cons;
                                                SubLObject current = datum;
                                                SubLObject key = NIL;
                                                SubLObject label = NIL;
                                                destructuring_bind_must_consp(current, datum, $list_alt50);
                                                key = current.first();
                                                current = current.rest();
                                                label = current;
                                                html_submit_input(label, label, UNPROVIDED);
                                            }
                                        }
                                        html_submit_input($$$Skip, $$$Skip, UNPROVIDED);
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
            return NIL;
        }
    }

    public static SubLObject cb_random_thoughts_button_bar() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_table_width$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str55$100_);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($$$center));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    SubLObject cdolist_list_var = $cb_random_thoughts_evaluation_options$.getGlobalValue();
                    SubLObject cons = NIL;
                    cons = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject current;
                        final SubLObject datum = current = cons;
                        SubLObject key = NIL;
                        SubLObject label = NIL;
                        destructuring_bind_must_consp(current, datum, $list57);
                        key = current.first();
                        current = label = current.rest();
                        html_submit_input(label, label, UNPROVIDED);
                        cdolist_list_var = cdolist_list_var.rest();
                        cons = cdolist_list_var.first();
                    } 
                    html_submit_input($$$Skip, $$$Skip, UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_random_thoughts_evaluation_alt(SubLObject evaluation, SubLObject cyclist, SubLObject topic) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject evaluation_string = list_utilities.alist_lookup_without_values($cb_random_thoughts_evaluation_options$.getGlobalValue(), evaluation, UNPROVIDED, UNPROVIDED);
                html_markup(html_macros.$html_table_head$.getGlobalValue());
                if (true) {
                    html_markup(html_macros.$html_table_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (true) {
                    html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(FIVE_INTEGER);
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
                            SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($$$right));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($str_alt54$Your_evaluation__);
                                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_princ(evaluation_string);
                                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($$$left));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (NIL != html_macros.$html_color_white$.getDynamicValue(thread)) {
                                    html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_color_white$.getDynamicValue(thread));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        cb_link($RANDOM_THOUGHT_FRAME, cyclist, topic, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
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

    public static SubLObject cb_random_thoughts_evaluation(final SubLObject evaluation, final SubLObject cyclist, final SubLObject topic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject evaluation_string = list_utilities.alist_lookup_without_values($cb_random_thoughts_evaluation_options$.getGlobalValue(), evaluation, UNPROVIDED, UNPROVIDED);
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_table_align$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_align($CENTER));
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(FIVE_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($$$right));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($str61$Your_evaluation__);
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ(evaluation_string);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($$$left));
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != html_macros.$html_color_white$.getGlobalValue()) {
                    html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_color_white$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    cb_link($RANDOM_THOUGHT_FRAME, cyclist, topic, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    /**
     * Define HTML link for displaying random thought about some term
     */
    @LispMethod(comment = "Define HTML link for displaying random thought about some term")
    public static final SubLObject cb_link_random_thought_frame_alt(SubLObject cyclist, SubLObject topic, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt57$_New_Random_Thought_;
            }
            {
                SubLObject frame_name_var = cb_frame_name($SELF);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt59$cb_random_thought_frame__A__A, cb_string_for_fort(cyclist), cb_string_for_fort(topic));
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

    /**
     * Define HTML link for displaying random thought about some term
     */
    @LispMethod(comment = "Define HTML link for displaying random thought about some term")
    public static SubLObject cb_link_random_thought_frame(final SubLObject cyclist, final SubLObject topic, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str64$_New_Random_Thought_;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str66$cb_random_thought_frame__A__A, cb_string_for_fort(cyclist), cb_string_for_fort(topic));
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
    }/**
     * Define HTML link for displaying random thought about some term
     */


    public static final SubLObject cb_handle_random_thought_frame_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cyclist = cb_guess_fort(html_extract_input($$$cyclist, args), UNPROVIDED);
                SubLObject topic = cb_guess_fort(html_extract_input($$$topic, args), UNPROVIDED);
                SubLObject assertion = cb_guess_assertion(html_extract_input($str_alt16$assertion_id, args));
                SubLObject paraphrase = html_extract_input($$$paraphrase, args);
                SubLObject judgment = NIL;
                SubLObject rest = NIL;
                for (rest = $cb_random_thoughts_evaluation_options$.getGlobalValue(); !((NIL != judgment) || (NIL == rest)); rest = rest.rest()) {
                    {
                        SubLObject cons = rest.first();
                        SubLObject datum = cons;
                        SubLObject current = datum;
                        SubLObject candidate = NIL;
                        SubLObject string = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt61);
                        candidate = current.first();
                        current = current.rest();
                        string = current;
                        if (NIL != html_extract_input(string, args)) {
                            judgment = candidate;
                        }
                    }
                }
                if (NIL != judgment) {
                    if (NIL != $assert_random_thought_judgmentsP$.getGlobalValue()) {
                        {
                            SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                            try {
                                api_control_vars.$the_cyclist$.bind($$CycRandomThoughtEvaluationTool, thread);
                                {
                                    SubLObject evaluation = make_ternary_formula($$EvaluationOfByOnFn, assertion, cyclist, date_utilities.indexical_seconds_since_1970());
                                    SubLObject evaluation_input_sentence = make_binary_formula($$evaluationInput, evaluation, paraphrase);
                                    SubLObject judgment_sentence = make_ternary_formula($$evaluationOfAs, evaluation, assertion, judgment);
                                    SubLObject mt = $const66$EvaluatedSentencesFromRandomThoug;
                                    ke.ke_assert(evaluation_input_sentence, mt, UNPROVIDED, UNPROVIDED);
                                    web_game.note_user_evaluation_of_sentence(assertions_high.assertion_ist_formula(assertion), cb_string_for_fort(cyclist), judgment, mt);
                                }
                            } finally {
                                api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return com.cyc.cycjava.cycl.cb_random_thoughts.cb_random_thought_frame_internal(cyclist, topic, assertion, paraphrase, judgment);
            }
        }
    }

    public static SubLObject cb_handle_random_thought_frame(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cyclist = cb_guess_fort(html_extract_input($$$cyclist, args), UNPROVIDED);
        final SubLObject topic = cb_guess_fort(html_extract_input($$$topic, args), UNPROVIDED);
        final SubLObject assertion = cb_guess_assertion(html_extract_input($str26$assertion_id, args));
        final SubLObject paraphrase = html_extract_input($$$paraphrase, args);
        SubLObject judgment;
        SubLObject rest;
        SubLObject cons;
        SubLObject current;
        SubLObject datum;
        SubLObject candidate;
        SubLObject string;
        for (judgment = NIL, rest = NIL, rest = $cb_random_thoughts_evaluation_options$.getGlobalValue(); (NIL == judgment) && (NIL != rest); rest = rest.rest()) {
            cons = rest.first();
            datum = current = cons;
            candidate = NIL;
            string = NIL;
            destructuring_bind_must_consp(current, datum, $list68);
            candidate = current.first();
            current = string = current.rest();
            if (NIL != html_extract_input(string, args)) {
                judgment = candidate;
            }
        }
        if ((NIL != judgment) && (NIL != $assert_random_thought_judgmentsP$.getGlobalValue())) {
            final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
            try {
                api_control_vars.$the_cyclist$.bind($$CycRandomThoughtEvaluationTool, thread);
                final SubLObject evaluation = make_ternary_formula($$EvaluationOfByOnFn, assertion, cyclist, date_utilities.indexical_seconds_since_1970());
                final SubLObject evaluation_input_sentence = make_binary_formula($$evaluationInput, evaluation, paraphrase);
                final SubLObject judgment_sentence = make_ternary_formula($$evaluationOfAs, evaluation, assertion, judgment);
                final SubLObject mt = $const73$EvaluatedSentencesFromRandomThoug;
                ke.ke_assert(evaluation_input_sentence, mt, UNPROVIDED, UNPROVIDED);
            } finally {
                api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
            }
        }
        return cb_random_thought_frame_internal(cyclist, topic, assertion, paraphrase, judgment);
    }

    public static final SubLObject cb_maybe_show_random_thought_alt(SubLObject topic) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cyclist = operation_communication.the_cyclist();
                if (NIL != com.cyc.cycjava.cycl.cb_random_thoughts.show_random_thought_for_user_and_topic_p(cyclist, topic)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject host = random_thought_generator.random_thought_server_hostXport();
                        SubLObject port = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if ((NIL != host) && (NIL != port)) {
                            {
                                SubLObject port_offset = subtract(port, $int$3600);
                                SubLObject handler = cconcatenate($str_alt69$cb_random_thought_frame_, new SubLObject[]{ format_nil.format_nil_a_no_copy(cb_string_for_fort(cyclist)), $str_alt70$_, format_nil.format_nil_a_no_copy(cb_string_for_fort(topic)) });
                                SubLObject url = cb_tools.cyc_server_url(host, port_offset, handler);
                                html_source_readability_terpri(UNPROVIDED);
                                html_markup(html_macros.$html_iframe_head$.getGlobalValue());
                                html_markup(html_macros.$html_iframe_src$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(url);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_iframe_name$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($str_alt71$random_thought);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_iframe_width$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($str_alt48$100_);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_iframe_height$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($int$75);
                                html_char(CHAR_quotation, UNPROVIDED);
                                if (true) {
                                    html_markup(html_macros.$html_iframe_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($RIGHT));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_markup(html_macros.$html_iframe_frameborder$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(ONE_INTEGER);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_markup(html_macros.$html_iframe_marginwidth$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(ZERO_INTEGER);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_markup(html_macros.$html_iframe_marginheight$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(ZERO_INTEGER);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_markup(html_macros.$html_iframe_scrolling$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup($$$no);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                html_markup(html_macros.$html_iframe_tail$.getGlobalValue());
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_maybe_show_random_thought(final SubLObject topic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cyclist = operation_communication.the_cyclist();
        if (NIL != show_random_thought_for_user_and_topic_p(cyclist, topic)) {
            thread.resetMultipleValues();
            final SubLObject host = random_thought_generator.random_thought_server_hostXport();
            final SubLObject port = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != host) && (NIL != port)) {
                final SubLObject port_offset = subtract(port, $int$3600);
                final SubLObject handler = cconcatenate($str76$cb_random_thought_frame_, new SubLObject[]{ format_nil.format_nil_a_no_copy(cb_string_for_fort(cyclist)), $str77$_, format_nil.format_nil_a_no_copy(cb_string_for_fort(topic)) });
                final SubLObject url = cb_tools.cyc_server_url(host, port_offset, handler);
                html_source_readability_terpri(UNPROVIDED);
                html_markup(html_macros.$html_iframe_head$.getGlobalValue());
                html_markup(html_macros.$html_iframe_src$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(url);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_iframe_name$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str78$random_thought);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_iframe_width$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str55$100_);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_iframe_height$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($int$75);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_iframe_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($RIGHT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_iframe_frameborder$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(ONE_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_iframe_marginwidth$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(ZERO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_iframe_marginheight$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(ZERO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_iframe_scrolling$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($$$no);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_iframe_tail$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject declare_cb_random_thoughts_file() {
        declareFunction("cb_link_random_thought", "CB-LINK-RANDOM-THOUGHT", 0, 1, false);
        declareFunction("cb_random_thoughts", "CB-RANDOM-THOUGHTS", 0, 1, false);
        declareFunction("cb_random_thought_for_cyclist", "CB-RANDOM-THOUGHT-FOR-CYCLIST", 1, 2, false);
        declareFunction("cb_show_random_thought", "CB-SHOW-RANDOM-THOUGHT", 2, 2, false);
        declareFunction("cb_random_thought_connection_type", "CB-RANDOM-THOUGHT-CONNECTION-TYPE", 3, 0, false);
        declareFunction("cb_handle_random_thoughts", "CB-HANDLE-RANDOM-THOUGHTS", 1, 0, false);
        declareFunction("show_random_thought_for_user_and_topic_p", "SHOW-RANDOM-THOUGHT-FOR-USER-AND-TOPIC-P", 2, 0, false);
        declareFunction("cb_random_thought_frame", "CB-RANDOM-THOUGHT-FRAME", 1, 0, false);
        declareFunction("cb_random_thought_retrieve_and_display", "CB-RANDOM-THOUGHT-RETRIEVE-AND-DISPLAY", 2, 0, false);
        declareFunction("cb_random_thought_frame_internal", "CB-RANDOM-THOUGHT-FRAME-INTERNAL", 4, 1, false);
        declareFunction("cb_random_thoughts_button_bar", "CB-RANDOM-THOUGHTS-BUTTON-BAR", 0, 0, false);
        declareFunction("cb_random_thoughts_evaluation", "CB-RANDOM-THOUGHTS-EVALUATION", 3, 0, false);
        declareFunction("cb_link_random_thought_frame", "CB-LINK-RANDOM-THOUGHT-FRAME", 2, 1, false);
        declareFunction("cb_handle_random_thought_frame", "CB-HANDLE-RANDOM-THOUGHT-FRAME", 1, 0, false);
        declareFunction("cb_maybe_show_random_thought", "CB-MAYBE-SHOW-RANDOM-THOUGHT", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_random_thoughts_file_alt() {
        deflexical("*RANDOM-THOUGHT-CYCLISTS*", $list_alt36);
        deflexical("*RANDOM-THOUGHT-REFRESH-RATE*", TEN_INTEGER);
        deflexical("*CB-RANDOM-THOUGHTS-EVALUATION-OPTIONS*", $list_alt47);
        deflexical("*ASSERT-RANDOM-THOUGHT-JUDGMENTS?*", T);
        return NIL;
    }

    public static SubLObject init_cb_random_thoughts_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*RANDOM-THOUGHT-CYCLISTS*", $list43);
            deflexical("*RANDOM-THOUGHT-REFRESH-RATE*", TEN_INTEGER);
            deflexical("*CB-RANDOM-THOUGHTS-EVALUATION-OPTIONS*", $list54);
            deflexical("*ASSERT-RANDOM-THOUGHT-JUDGMENTS?*", T);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*RANDOM-THOUGHT-CYCLISTS*", $list_alt36);
            deflexical("*CB-RANDOM-THOUGHTS-EVALUATION-OPTIONS*", $list_alt47);
        }
        return NIL;
    }

    public static SubLObject init_cb_random_thoughts_file_Previous() {
        deflexical("*RANDOM-THOUGHT-CYCLISTS*", $list43);
        deflexical("*RANDOM-THOUGHT-REFRESH-RATE*", TEN_INTEGER);
        deflexical("*CB-RANDOM-THOUGHTS-EVALUATION-OPTIONS*", $list54);
        deflexical("*ASSERT-RANDOM-THOUGHT-JUDGMENTS?*", T);
        return NIL;
    }

    public static final SubLObject setup_cb_random_thoughts_file_alt() {
        setup_cb_link_method($RANDOM_THOUGHT, CB_LINK_RANDOM_THOUGHT, ONE_INTEGER);
        html_macros.note_html_handler_function(CB_RANDOM_THOUGHTS);
        html_macros.note_html_handler_function(CB_HANDLE_RANDOM_THOUGHTS);
        declare_cb_tool($RANDOM_THOUGHT, $$$Random_Thought_Generator, $$$RTG, $str_alt35$Generate_and_Display_random_thoug);
        html_macros.note_html_handler_function(CB_RANDOM_THOUGHT_FRAME);
        setup_cb_link_method($RANDOM_THOUGHT_FRAME, CB_LINK_RANDOM_THOUGHT_FRAME, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_HANDLE_RANDOM_THOUGHT_FRAME);
        return NIL;
    }

    public static SubLObject setup_cb_random_thoughts_file() {
        if (SubLFiles.USE_V1) {
            setup_cb_link_method($RANDOM_THOUGHT, CB_LINK_RANDOM_THOUGHT, ONE_INTEGER);
            html_macros.note_cgi_handler_function(CB_RANDOM_THOUGHTS, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_HANDLE_RANDOM_THOUGHTS, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_RANDOM_THOUGHT_FRAME, $HTML_HANDLER);
            setup_cb_link_method($RANDOM_THOUGHT_FRAME, CB_LINK_RANDOM_THOUGHT_FRAME, THREE_INTEGER);
            html_macros.note_cgi_handler_function(CB_HANDLE_RANDOM_THOUGHT_FRAME, $HTML_HANDLER);
        }
        if (SubLFiles.USE_V2) {
            html_macros.note_html_handler_function(CB_RANDOM_THOUGHTS);
            html_macros.note_html_handler_function(CB_HANDLE_RANDOM_THOUGHTS);
            declare_cb_tool($RANDOM_THOUGHT, $$$Random_Thought_Generator, $$$RTG, $str_alt35$Generate_and_Display_random_thoug);
            html_macros.note_html_handler_function(CB_RANDOM_THOUGHT_FRAME);
            html_macros.note_html_handler_function(CB_HANDLE_RANDOM_THOUGHT_FRAME);
        }
        return NIL;
    }

    public static SubLObject setup_cb_random_thoughts_file_Previous() {
        setup_cb_link_method($RANDOM_THOUGHT, CB_LINK_RANDOM_THOUGHT, ONE_INTEGER);
        html_macros.note_cgi_handler_function(CB_RANDOM_THOUGHTS, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_HANDLE_RANDOM_THOUGHTS, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_RANDOM_THOUGHT_FRAME, $HTML_HANDLER);
        setup_cb_link_method($RANDOM_THOUGHT_FRAME, CB_LINK_RANDOM_THOUGHT_FRAME, THREE_INTEGER);
        html_macros.note_cgi_handler_function(CB_HANDLE_RANDOM_THOUGHT_FRAME, $HTML_HANDLER);
        return NIL;
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

    

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$_Random_Thought_ = makeString("[Random Thought]");

    static private final SubLString $str_alt2$cb_random_thoughts = makeString("cb-random-thoughts");

    static private final SubLList $list_alt8 = list(makeKeyword("NOW"), NIL);

    static private final SubLList $list_alt9 = list(makeSymbol("TERM"), makeSymbol("ASSERTION"), makeSymbol("JAVALIST"));

    static private final SubLString $str_alt12$text_javascript = makeString("text/javascript");

    static private final SubLString $str_alt13$yui_skin_sam = makeString("yui-skin-sam");

    static private final SubLString $str_alt14$cb_handle_random_thoughts = makeString("cb-handle-random-thoughts");

    static private final SubLString $str_alt16$assertion_id = makeString("assertion-id");

    static private final SubLString $str_alt17$CycL__ = makeString("CycL: ");

    static private final SubLString $str_alt19$New_ = makeString("New ");

    static private final SubLString $str_alt21$Related_ = makeString("Related ");

    static private final SubLString $str_alt23$Same_ = makeString("Same ");

    static private final SubLString $str_alt25$Topic__ = makeString("Topic: ");

    static private final SubLString $str_alt27$new_thought = makeString("new-thought");

    static private final SubLString $str_alt29$_I_have_shared__S_random_thoughts = makeString("(I have shared ~S random thoughts with you so far.)");

    static private final SubLString $str_alt30$_I_have_thought_of__S_more_things = makeString("(I have thought of ~S more things to say.)");

    static private final SubLString $$$Random_Thought_Generator = makeString("Random Thought Generator");

    static private final SubLString $$$RTG = makeString("RTG");

    static private final SubLString $str_alt35$Generate_and_Display_random_thoug = makeString("Generate and Display random thoughts from Cyc");

    static private final SubLList $list_alt36 = list(reader_make_constant_shell("Baxter"), reader_make_constant_shell("DaveS"), reader_make_constant_shell("Witbrock"));

    static private final SubLList $list_alt37 = list(makeSymbol("CYCLIST-STRING"), makeSymbol("TOPIC-STRING"));

    static private final SubLList $list_alt40 = list(makeKeyword("REQUIRE-TOPICAL?"), NIL, makeKeyword("NOW"), NIL);

    static private final SubLList $list_alt41 = list(makeSymbol("TOPIC"), makeSymbol("ASSERTION"), makeSymbol("ASSERTION-PARAPHRASE"));

    static private final SubLString $str_alt42$cb_handle_random_thought_frame = makeString("cb-handle-random-thought-frame");

    static private final SubLString $str_alt46$position__absolute__bottom__0pt = makeString("position: absolute; bottom: 0pt");

    static private final SubLList $list_alt47 = list(cons(reader_make_constant_shell("TrueCycLSentence"), makeString("True")), cons(reader_make_constant_shell("FalseCycLSentence"), makeString("False")), cons(reader_make_constant_shell("BadlyParaphrasedCycLSentence"), makeString("Bad Paraphrase")), cons(reader_make_constant_shell("UninterestingCycLSentence"), makeString("Uninteresting")), cons(reader_make_constant_shell("ProblematicCycLSentence"), makeString("Other")));

    static private final SubLString $str_alt48$100_ = makeString("100%");

    static private final SubLList $list_alt50 = cons(makeUninternedSymbol("KEY"), makeSymbol("LABEL"));

    static private final SubLString $str_alt54$Your_evaluation__ = makeString("Your evaluation: ");

    static private final SubLString $str_alt57$_New_Random_Thought_ = makeString("[New Random Thought]");

    static private final SubLString $str_alt59$cb_random_thought_frame__A__A = makeString("cb-random-thought-frame&~A&~A");

    static private final SubLList $list_alt61 = cons(makeSymbol("CANDIDATE"), makeSymbol("STRING"));

    public static final SubLObject $const66$EvaluatedSentencesFromRandomThoug = reader_make_constant_shell("EvaluatedSentencesFromRandomThoughtServerMt");

    static private final SubLString $str_alt69$cb_random_thought_frame_ = makeString("cb-random-thought-frame&");

    static private final SubLString $str_alt70$_ = makeString("&");

    static private final SubLString $str_alt71$random_thought = makeString("random_thought");
}

/**
 * Total time: 476 ms
 */
