/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.browser;


import static com.cyc.cycjava.cycl.cb_parameters.*;
import static com.cyc.cycjava.cycl.cb_utilities.*;
import static com.cyc.cycjava.cycl.cyc_file_dependencies.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.inference.harness.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
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
 * module:      CB-INFERENCE-DEBUGGER
 * source file: /cyc/top/cycl/inference/browser/cb-inference-debugger.lisp
 * created:     2019/07/03 17:38:08
 */
public final class cb_inference_debugger extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt75$ = makeString("");

    public static final SubLFile me = new cb_inference_debugger();

 public static final String myName = "com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger";


    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $cb_debug_depth$ = makeSymbol("*CB-DEBUG-DEPTH*");

    // defparameter
    /**
     * A set to avoid infinite recursion and make the inference debugger look
     * tree-like.
     */
    @LispMethod(comment = "A set to avoid infinite recursion and make the inference debugger look\r\ntree-like.\ndefparameter\nA set to avoid infinite recursion and make the inference debugger look\ntree-like.")
    private static final SubLSymbol $cb_debug_duplicate_tree$ = makeSymbol("*CB-DEBUG-DUPLICATE-TREE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $cb_debug_tree$ = makeSymbol("*CB-DEBUG-TREE*");

    // deflexical
    /**
     * A table of the options for the inference debugger, paired with their default
     * values.
     */
    @LispMethod(comment = "A table of the options for the inference debugger, paired with their default\r\nvalues.\ndeflexical\nA table of the options for the inference debugger, paired with their default\nvalues.")
    private static final SubLSymbol $cb_debug_options$ = makeSymbol("*CB-DEBUG-OPTIONS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $cb_show_hide_value_linktext_pairs$ = makeSymbol("*CB-SHOW-HIDE-VALUE-LINKTEXT-PAIRS*");

    // deflexical
    // If it gets any deeper than this, show ellipses to avoid blowing the stack
    /**
     * If it gets any deeper than this, show ellipses to avoid blowing the stack
     */
    @LispMethod(comment = "If it gets any deeper than this, show ellipses to avoid blowing the stack\ndeflexical")
    private static final SubLSymbol $cb_debug_max_depth$ = makeSymbol("*CB-DEBUG-MAX-DEPTH*");

    // defparameter
    // for div uniquification
    /**
     * for div uniquification
     */
    @LispMethod(comment = "for div uniquification\ndefparameter")
    private static final SubLSymbol $cb_debug_next_object_id$ = makeSymbol("*CB-DEBUG-NEXT-OBJECT-ID*");

    public static final SubLSymbol $cb_debug_icon$ = makeSymbol("*CB-DEBUG-ICON*");

    public static final SubLSymbol $cb_debug_indent_quantum$ = makeSymbol("*CB-DEBUG-INDENT-QUANTUM*");

    public static final SubLSymbol $cb_current_debug_options$ = makeSymbol("*CB-CURRENT-DEBUG-OPTIONS*");

    static private final SubLList $list5 = list(list(makeSymbol("FOCAL-OBJECT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list7 = list(makeSymbol("CB-HEAD"), list(makeSymbol("DHTML-WITH-DOM-SCRIPT")), list(makeSymbol("DHTML-WITH-TOGGLE-VISIBILITY-SUPPORT")), list(makeSymbol("BASIC-AJAX-SCRIPTS")), list(makeSymbol("DHTML-CREATION-SCRIPTS")));

    static private final SubLList $list9 = list(makeKeyword("SHOW-COPYRIGHT"), NIL);

    private static final SubLSymbol CB_SHOW_RELEVANT_INFERENCE_DEBUGGING_LINKS = makeSymbol("CB-SHOW-RELEVANT-INFERENCE-DEBUGGING-LINKS");

    static private final SubLList $list11 = list(makeSymbol("HTML-PRINC-STRONG"), makeString("Inference Debugging Tree for "));

    static private final SubLList $list13 = list(list(makeSymbol("*CB-DEBUG-DEPTH*"), ZERO_INTEGER), list(makeSymbol("*CB-DEBUG-TREE*"), NIL), list(makeSymbol("*CB-DEBUG-DUPLICATE-TREE*"), list(makeSymbol("NEW-SET"), list(makeSymbol("FUNCTION"), EQ))));

    static private final SubLString $str14$_Debug_Inference__A__A_ = makeString("[Debug Inference ~A.~A]");

    static private final SubLString $str15$cb_debug_inference_handler = makeString("cb-debug-inference-handler");

    private static final SubLSymbol CB_LINK_DEBUG_INFERENCE = makeSymbol("CB-LINK-DEBUG-INFERENCE");

    static private final SubLList $list18 = list(makeSymbol("STORE-ID-STRING"), makeSymbol("INFERENCE-ID-STRING"), makeSymbol("OPTIONS-GLOB-ID-STRING"));

    static private final SubLString $str19$_A_did_not_specify_an_inference = makeString("~A did not specify an inference");

    private static final SubLSymbol CB_DEBUG_OPTION_P = makeSymbol("CB-DEBUG-OPTION-P");

    static private final SubLString $str21$_A_did_not_specify_valid_debugger = makeString("~A did not specify valid debugger options");

    private static final SubLString $str22$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str23$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");

    private static final SubLString $$$Inference_Debugging_Tree_for_ = makeString("Inference Debugging Tree for ");

    private static final SubLSymbol CB_DEBUG_INFERENCE_HANDLER = makeSymbol("CB-DEBUG-INFERENCE-HANDLER");

    private static final SubLString $str31$_Debug_Problem__A__A_ = makeString("[Debug Problem ~A.~A]");

    private static final SubLString $str32$_Debug_Problem__A__A_wrt_s_A_ = makeString("[Debug Problem ~A.~A wrt s~A]");

    private static final SubLString $str33$cb_debug_problem_handler = makeString("cb-debug-problem-handler");

    private static final SubLSymbol CB_LINK_DEBUG_PROBLEM = makeSymbol("CB-LINK-DEBUG-PROBLEM");

    private static final SubLList $list36 = list(makeSymbol("STORE-ID-STRING"), makeSymbol("PROBLEM-ID-STRING"), makeSymbol("STRATEGIC-CONTEXT-ID-STRING"), makeSymbol("OPTIONS-GLOB-ID-STRING"));

    private static final SubLString $str37$_A_did_not_specify_a_problem = makeString("~A did not specify a problem");

    private static final SubLString $str38$_A_did_not_specify_a_strategic_co = makeString("~A did not specify a strategic context");

    private static final SubLString $$$_wrt_ = makeString(" wrt ");

    private static final SubLSymbol CB_DEBUG_PROBLEM_HANDLER = makeSymbol("CB-DEBUG-PROBLEM-HANDLER");

    private static final SubLString $str43$_Debug_Link__A__A_ = makeString("[Debug Link ~A.~A]");

    private static final SubLString $str44$_Debug_Link__A__A_wrt_s_A_ = makeString("[Debug Link ~A.~A wrt s~A]");

    private static final SubLString $str45$cb_debug_problem_link_handler = makeString("cb-debug-problem-link-handler");

    private static final SubLSymbol $DEBUG_PROBLEM_LINK = makeKeyword("DEBUG-PROBLEM-LINK");

    private static final SubLSymbol CB_LINK_DEBUG_PROBLEM_LINK = makeSymbol("CB-LINK-DEBUG-PROBLEM-LINK");

    private static final SubLList $list48 = list(makeSymbol("STORE-ID-STRING"), makeSymbol("LINK-ID-STRING"), makeSymbol("STRATEGIC-CONTEXT-ID-STRING"), makeSymbol("OPTIONS-GLOB-ID-STRING"));

    private static final SubLString $str49$_A_did_not_specify_a_link = makeString("~A did not specify a link");

    private static final SubLSymbol CB_DEBUG_PROBLEM_LINK_HANDLER = makeSymbol("CB-DEBUG-PROBLEM-LINK-HANDLER");

    private static final SubLString $str54$_A__A__A__A__A = makeString("~A&~A&~A&~A&~A");

    private static final SubLString $str55$_A__A__A__A = makeString("~A&~A&~A&~A");

    private static final SubLString $str57$Unexpected_cb_debug_link_object__ = makeString("Unexpected cb-debug-link object: ~a");

    private static final SubLList $list58 = list(cons(makeKeyword("ANCESTOR-DEPTH"), makeInteger(21)), list(makeKeyword("SHOW-SIBLINGS?")), list(makeKeyword("SHOW-AUNTS?")), cons(makeKeyword("DEBUG-GOOD-PROBLEMS?"), T), cons(makeKeyword("DEBUG-NON-NEW-ROOTS?"), T), cons(makeKeyword("SHOW-WHICH-QUERIES"), $NONE), cons(makeKeyword("SHOW-RULES?"), T), cons(makeKeyword("DHTML-VISIBILITY"), makeKeyword("VISIBLE")));

    private static final SubLList $list59 = list(list(T, makeString("[Show]")), list(NIL, makeString("[Hide]")));

    private static final SubLSymbol $kw60$SHOW_SIBLINGS_ = makeKeyword("SHOW-SIBLINGS?");

    private static final SubLString $str61$Siblings_ = makeString("Siblings:");

    private static final SubLSymbol $kw62$SHOW_AUNTS_ = makeKeyword("SHOW-AUNTS?");

    private static final SubLString $str63$Aunts_ = makeString("Aunts:");

    private static final SubLSymbol $kw64$DEBUG_NON_NEW_ROOTS_ = makeKeyword("DEBUG-NON-NEW-ROOTS?");

    private static final SubLString $str65$Non_New_Roots_ = makeString("Non-New Roots:");

    private static final SubLSymbol $kw66$DEBUG_GOOD_PROBLEMS_ = makeKeyword("DEBUG-GOOD-PROBLEMS?");

    private static final SubLString $str67$Good_Problems_ = makeString("Good Problems:");

    private static final SubLList $list68 = list(list(T, makeString("[Descend]")), list(NIL, makeString("[Stop]")));

    private static final SubLSymbol $SHOW_WHICH_QUERIES = makeKeyword("SHOW-WHICH-QUERIES");

    private static final SubLString $str70$Queries_ = makeString("Queries:");

    private static final SubLList $list71 = list(list(makeKeyword("ALL"), makeString("[All]")), list(makeKeyword("DEAD-END"), makeString("[Dead Ends]")), list($NONE, makeString("[None]")));

    private static final SubLSymbol $kw72$SHOW_RULES_ = makeKeyword("SHOW-RULES?");

    private static final SubLString $str73$Rules_ = makeString("Rules:");

    private static final SubLString $str77$_ = makeString(":");

    private static final SubLString $str79$ = makeString("");

    private static final SubLList $list80 = list(list(makeKeyword("VISIBLE"), makeString("[Open All]")), list(makeKeyword("INVISIBLE"), makeString("[Close All]")), list($NONE, makeString("[Turn Off]")));

    private static final SubLString $str81$Ancestor_Depth_ = makeString("Ancestor Depth:");

    private static final SubLString $str82$_ = makeString("[");

    private static final SubLString $str83$_ = makeString("]");

    private static final SubLList $list85 = list(makeInteger(212), makeInteger(21), TWELVE_INTEGER, THREE_INTEGER, TWO_INTEGER, ONE_INTEGER, ZERO_INTEGER);

    private static final SubLList $list86 = list(makeSymbol("VALUE"), makeSymbol("LINKTEXT"));

    private static final SubLSymbol $sym96$CB_DEBUG_ARGUMENT_LINK__ = makeSymbol("CB-DEBUG-ARGUMENT-LINK-<");

    private static final SubLSymbol $sym97$CB_DEBUG_SUPPORTING_PROBLEM__ = makeSymbol("CB-DEBUG-SUPPORTING-PROBLEM-<");

    private static final SubLInteger $int$212 = makeInteger(212);

    private static final SubLString $$$root = makeString("root");

    private static final SubLList $list103 = listS(makeSymbol("NODE-TYPE"), makeSymbol("DEPTH"), makeSymbol("DATA"));

    private static final SubLString $str105$___ = makeString("...");

    private static final SubLList $list106 = list(makeSymbol("OBJECT"), makeSymbol("IS-FOCAL-OBJECT?"), makeSymbol("QUERY-OR-RULE"));

    private static final SubLString $$$cbd = makeString("cbd");

    public static final SubLObject html_inference_debug_page_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt5);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject focal_object = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt5);
                    focal_object = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(HTML_DOCUMENT, $list_alt7, listS(HTML_FANCY_BODY, $list_alt9, list(CB_SHOW_RELEVANT_INFERENCE_DEBUGGING_LINKS, focal_object), $list_alt11, append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt5);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject html_inference_debug_page(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject focal_object = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        focal_object = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(HTML_DOCUMENT, $list7, listS(HTML_FANCY_BODY, $list9, list(CB_SHOW_RELEVANT_INFERENCE_DEBUGGING_LINKS, focal_object), $list11, append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list5);
        return NIL;
    }

    public static final SubLObject with_debug_inference_indentation_and_recursion_handling_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt13, append(body, NIL));
        }
    }

    public static SubLObject with_debug_inference_indentation_and_recursion_handling(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list13, append(body, NIL));
    }

    public static final SubLObject cb_link_debug_inference_alt(SubLObject inference, SubLObject linktext, SubLObject options) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (options == UNPROVIDED) {
            options = NIL;
        }
        {
            SubLObject inference_id = inference_datastructures_inference.inference_suid(inference);
            SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
            SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(store);
            if (NIL == linktext) {
                linktext = format(NIL, $str_alt14$_Debug_Inference__A__A_, store_id, inference_id);
            }
            {
                SubLObject options_glob_id = cb_glob_id(options);
                com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_handler_link($str_alt15$cb_debug_inference_handler, linktext, store_id, inference_id, NIL, options_glob_id);
            }
            return NIL;
        }
    }

    public static SubLObject cb_link_debug_inference(final SubLObject inference, SubLObject linktext, SubLObject options) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (options == UNPROVIDED) {
            options = NIL;
        }
        final SubLObject inference_id = inference_datastructures_inference.inference_suid(inference);
        final SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
        final SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(store);
        if (NIL == linktext) {
            linktext = format(NIL, $str14$_Debug_Inference__A__A_, store_id, inference_id);
        }
        final SubLObject options_glob_id = cb_glob_id(options);
        cb_debug_handler_link($str15$cb_debug_inference_handler, linktext, store_id, inference_id, NIL, options_glob_id);
        return NIL;
    }

    public static final SubLObject cb_debug_inference_handler_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject store_id_string = NIL;
                SubLObject inference_id_string = NIL;
                SubLObject options_glob_id_string = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt18);
                store_id_string = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt18);
                inference_id_string = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt18);
                options_glob_id_string = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject inference = cb_query.cb_guess_inference(store_id_string, inference_id_string);
                        SubLObject options = com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_lookup_options_by_glob_string(options_glob_id_string);
                        if (NIL == inference_datastructures_inference.inference_p(inference)) {
                            return cb_error($str_alt19$_A_did_not_specify_an_inference, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        if (NIL == list_utilities.plist_of_type_p(options, CB_DEBUG_OPTION_P)) {
                            return cb_error($str_alt21$_A_did_not_specify_valid_debugger, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_head_shortcut_icon();
                        html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                        dhtml_macros.dhtml_with_dom_script();
                        dhtml_macros.dhtml_with_toggle_visibility_support();
                        dhtml_macros.basic_ajax_scripts();
                        dhtml_macros.dhtml_creation_scripts();
                        html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_markup(html_macros.$html_body_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_1 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        cb_inference_browser.cb_show_relevant_inference_debugging_links(inference);
                                        html_princ_strong($str_alt22$Inference_Debugging_Tree_for_);
                                        cb_link($INFERENCE, inference, $VERY_VERBOSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_show_inference_debugger_option_tweaking_links(inference, inference_datastructures_inference.simplest_inference_strategy(inference), options);
                                        html_hr(UNPROVIDED, UNPROVIDED);
                                        com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_inference(inference, options);
                                        html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_1, thread);
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
                    cdestructuring_bind_error(datum, $list_alt18);
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_debug_inference_handler(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject store_id_string = NIL;
        SubLObject inference_id_string = NIL;
        SubLObject options_glob_id_string = NIL;
        destructuring_bind_must_consp(args, args, $list18);
        store_id_string = args.first();
        SubLObject current = args.rest();
        destructuring_bind_must_consp(current, args, $list18);
        inference_id_string = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, args, $list18);
        options_glob_id_string = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject inference = cb_query.cb_guess_inference(store_id_string, inference_id_string);
            final SubLObject options = cb_lookup_options_by_glob_string(options_glob_id_string);
            if (NIL == inference_datastructures_inference.inference_p(inference)) {
                return cb_error($str19$_A_did_not_specify_an_inference, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL == list_utilities.plist_of_type_p(options, CB_DEBUG_OPTION_P)) {
                return cb_error($str21$_A_did_not_specify_valid_debugger, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            html_markup($str22$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str23$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                dhtml_macros.dhtml_with_dom_script();
                dhtml_macros.dhtml_with_toggle_visibility_support();
                dhtml_macros.basic_ajax_scripts();
                dhtml_macros.dhtml_creation_scripts();
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$1 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_inference_browser.cb_show_relevant_inference_debugging_links(inference);
                        html_princ_strong($$$Inference_Debugging_Tree_for_);
                        cb_link($INFERENCE, inference, $VERY_VERBOSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        cb_show_inference_debugger_option_tweaking_links(inference, inference_datastructures_inference.simplest_inference_strategy(inference), options);
                        html_hr(UNPROVIDED, UNPROVIDED);
                        cb_debug_inference(inference, options);
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$2, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$1, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } else {
            cdestructuring_bind_error(args, $list18);
        }
        return NIL;
    }

    /**
     *
     *
     * @param LINKTEXT
     * 		stringp or keywordp (overridden to be an icon keyword instead of text
     */
    @LispMethod(comment = "@param LINKTEXT\r\n\t\tstringp or keywordp (overridden to be an icon keyword instead of text")
    public static final SubLObject cb_link_debug_problem_alt(SubLObject problem, SubLObject strategic_context, SubLObject linktext, SubLObject options) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (options == UNPROVIDED) {
            options = NIL;
        }
        {
            SubLObject problem_id = inference_datastructures_problem.problem_suid(problem);
            SubLObject strategic_context_id = inference_worker.strategic_context_suid(strategic_context);
            SubLObject store = inference_datastructures_problem.problem_store(problem);
            SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(store);
            if (NIL == linktext) {
                if ($TACTICAL == strategic_context) {
                    linktext = format(NIL, $str_alt27$_Debug_Problem__A__A_, store_id, problem_id);
                } else {
                    linktext = format(NIL, $str_alt28$_Debug_Problem__A__A_wrt_s_A_, new SubLObject[]{ store_id, problem_id, strategic_context_id });
                }
            }
            {
                SubLObject options_glob_id = cb_glob_id(options);
                com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_handler_link($str_alt29$cb_debug_problem_handler, linktext, store_id, problem_id, strategic_context_id, options_glob_id);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param LINKTEXT
     * 		stringp or keywordp (overridden to be an icon keyword instead of text
     */
    @LispMethod(comment = "@param LINKTEXT\r\n\t\tstringp or keywordp (overridden to be an icon keyword instead of text")
    public static SubLObject cb_link_debug_problem(final SubLObject problem, final SubLObject strategic_context, SubLObject linktext, SubLObject options) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (options == UNPROVIDED) {
            options = NIL;
        }
        final SubLObject problem_id = inference_datastructures_problem.problem_suid(problem);
        final SubLObject strategic_context_id = inference_worker.strategic_context_suid(strategic_context);
        final SubLObject store = inference_datastructures_problem.problem_store(problem);
        final SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(store);
        if (NIL == linktext) {
            if ($TACTICAL == strategic_context) {
                linktext = format(NIL, $str31$_Debug_Problem__A__A_, store_id, problem_id);
            } else {
                linktext = format(NIL, $str32$_Debug_Problem__A__A_wrt_s_A_, new SubLObject[]{ store_id, problem_id, strategic_context_id });
            }
        }
        final SubLObject options_glob_id = cb_glob_id(options);
        cb_debug_handler_link($str33$cb_debug_problem_handler, linktext, store_id, problem_id, strategic_context_id, options_glob_id);
        return NIL;
    }

    public static final SubLObject cb_debug_problem_handler_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject store_id_string = NIL;
                SubLObject problem_id_string = NIL;
                SubLObject strategic_context_id_string = NIL;
                SubLObject options_glob_id_string = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt32);
                store_id_string = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt32);
                problem_id_string = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt32);
                strategic_context_id_string = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt32);
                options_glob_id_string = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject problem = cb_inference_browser.cb_guess_problem(store_id_string, problem_id_string);
                        SubLObject strategic_context = cb_inference_browser.cb_guess_strategic_context(store_id_string, strategic_context_id_string);
                        SubLObject options = com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_lookup_options_by_glob_string(options_glob_id_string);
                        if (NIL == inference_datastructures_problem.problem_p(problem)) {
                            return cb_error($str_alt33$_A_did_not_specify_a_problem, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        if (NIL == inference_worker.strategic_context_p(strategic_context)) {
                            return cb_error($str_alt34$_A_did_not_specify_a_strategic_co, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        if (NIL == list_utilities.plist_of_type_p(options, CB_DEBUG_OPTION_P)) {
                            return cb_error($str_alt21$_A_did_not_specify_valid_debugger, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_head_shortcut_icon();
                        html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                        dhtml_macros.dhtml_with_dom_script();
                        dhtml_macros.dhtml_with_toggle_visibility_support();
                        dhtml_macros.basic_ajax_scripts();
                        dhtml_macros.dhtml_creation_scripts();
                        html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_markup(html_macros.$html_body_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        cb_inference_browser.cb_show_relevant_inference_debugging_links(problem);
                                        html_princ_strong($str_alt22$Inference_Debugging_Tree_for_);
                                        cb_link($PROBLEM, problem, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        if (NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
                                            html_princ($str_alt36$_wrt_);
                                            cb_link($STRATEGY, strategic_context, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                        com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_show_inference_debugger_option_tweaking_links(problem, strategic_context, options);
                                        html_hr(UNPROVIDED, UNPROVIDED);
                                        com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_problem(problem, strategic_context, options);
                                        html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
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
                    cdestructuring_bind_error(datum, $list_alt32);
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_debug_problem_handler(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject store_id_string = NIL;
        SubLObject problem_id_string = NIL;
        SubLObject strategic_context_id_string = NIL;
        SubLObject options_glob_id_string = NIL;
        destructuring_bind_must_consp(args, args, $list36);
        store_id_string = args.first();
        SubLObject current = args.rest();
        destructuring_bind_must_consp(current, args, $list36);
        problem_id_string = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, args, $list36);
        strategic_context_id_string = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, args, $list36);
        options_glob_id_string = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject problem = cb_inference_browser.cb_guess_problem(store_id_string, problem_id_string);
            final SubLObject strategic_context = cb_inference_browser.cb_guess_strategic_context(store_id_string, strategic_context_id_string);
            final SubLObject options = cb_lookup_options_by_glob_string(options_glob_id_string);
            if (NIL == inference_datastructures_problem.problem_p(problem)) {
                return cb_error($str37$_A_did_not_specify_a_problem, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL == inference_worker.strategic_context_p(strategic_context)) {
                return cb_error($str38$_A_did_not_specify_a_strategic_co, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL == list_utilities.plist_of_type_p(options, CB_DEBUG_OPTION_P)) {
                return cb_error($str21$_A_did_not_specify_valid_debugger, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            html_markup($str22$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str23$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                dhtml_macros.dhtml_with_dom_script();
                dhtml_macros.dhtml_with_toggle_visibility_support();
                dhtml_macros.basic_ajax_scripts();
                dhtml_macros.dhtml_creation_scripts();
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$3 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_inference_browser.cb_show_relevant_inference_debugging_links(problem);
                        html_princ_strong($$$Inference_Debugging_Tree_for_);
                        cb_link($PROBLEM, problem, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
                            html_princ($$$_wrt_);
                            cb_link($STRATEGY, strategic_context, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        cb_show_inference_debugger_option_tweaking_links(problem, strategic_context, options);
                        html_hr(UNPROVIDED, UNPROVIDED);
                        cb_debug_problem(problem, strategic_context, options);
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$3, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } else {
            cdestructuring_bind_error(args, $list36);
        }
        return NIL;
    }

    /**
     *
     *
     * @param LINKTEXT
     * 		stringp or keywordp (overridden to be an icon keyword instead of text
     */
    @LispMethod(comment = "@param LINKTEXT\r\n\t\tstringp or keywordp (overridden to be an icon keyword instead of text")
    public static final SubLObject cb_link_debug_problem_link_alt(SubLObject link, SubLObject strategic_context, SubLObject linktext, SubLObject options) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (options == UNPROVIDED) {
            options = NIL;
        }
        {
            SubLObject link_id = inference_datastructures_problem_link.problem_link_suid(link);
            SubLObject strategic_context_id = inference_worker.strategic_context_suid(strategic_context);
            SubLObject store = inference_datastructures_problem_link.problem_link_store(link);
            SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(store);
            if (NIL == linktext) {
                if (strategic_context == $TACTICAL) {
                    linktext = format(NIL, $str_alt39$_Debug_Link__A__A_, store_id, link_id);
                } else {
                    linktext = format(NIL, $str_alt40$_Debug_Link__A__A_wrt_s_A_, new SubLObject[]{ store_id, link_id, strategic_context_id });
                }
            }
            {
                SubLObject options_glob_id = cb_glob_id(options);
                com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_handler_link($str_alt41$cb_debug_problem_link_handler, linktext, store_id, link_id, strategic_context_id, options_glob_id);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param LINKTEXT
     * 		stringp or keywordp (overridden to be an icon keyword instead of text
     */
    @LispMethod(comment = "@param LINKTEXT\r\n\t\tstringp or keywordp (overridden to be an icon keyword instead of text")
    public static SubLObject cb_link_debug_problem_link(final SubLObject link, final SubLObject strategic_context, SubLObject linktext, SubLObject options) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (options == UNPROVIDED) {
            options = NIL;
        }
        final SubLObject link_id = inference_datastructures_problem_link.problem_link_suid(link);
        final SubLObject strategic_context_id = inference_worker.strategic_context_suid(strategic_context);
        final SubLObject store = inference_datastructures_problem_link.problem_link_store(link);
        final SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(store);
        if (NIL == linktext) {
            if (strategic_context == $TACTICAL) {
                linktext = format(NIL, $str43$_Debug_Link__A__A_, store_id, link_id);
            } else {
                linktext = format(NIL, $str44$_Debug_Link__A__A_wrt_s_A_, new SubLObject[]{ store_id, link_id, strategic_context_id });
            }
        }
        final SubLObject options_glob_id = cb_glob_id(options);
        cb_debug_handler_link($str45$cb_debug_problem_link_handler, linktext, store_id, link_id, strategic_context_id, options_glob_id);
        return NIL;
    }

    public static final SubLObject cb_debug_problem_link_handler_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject store_id_string = NIL;
                SubLObject link_id_string = NIL;
                SubLObject strategic_context_id_string = NIL;
                SubLObject options_glob_id_string = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt44);
                store_id_string = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt44);
                link_id_string = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt44);
                strategic_context_id_string = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt44);
                options_glob_id_string = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject link = cb_inference_browser.cb_guess_problem_link(store_id_string, link_id_string);
                        SubLObject strategic_context = cb_inference_browser.cb_guess_strategic_context(store_id_string, strategic_context_id_string);
                        SubLObject options = com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_lookup_options_by_glob_string(options_glob_id_string);
                        if (NIL == inference_datastructures_problem_link.problem_link_p(link)) {
                            return cb_error($str_alt45$_A_did_not_specify_a_link, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        if (NIL == inference_worker.strategic_context_p(strategic_context)) {
                            return cb_error($str_alt34$_A_did_not_specify_a_strategic_co, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        if (NIL == list_utilities.plist_of_type_p(options, CB_DEBUG_OPTION_P)) {
                            return cb_error($str_alt21$_A_did_not_specify_valid_debugger, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_head_shortcut_icon();
                        html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                        dhtml_macros.dhtml_with_dom_script();
                        dhtml_macros.dhtml_with_toggle_visibility_support();
                        dhtml_macros.basic_ajax_scripts();
                        dhtml_macros.dhtml_creation_scripts();
                        html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_markup(html_macros.$html_body_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        cb_inference_browser.cb_show_relevant_inference_debugging_links(link);
                                        html_princ_strong($str_alt22$Inference_Debugging_Tree_for_);
                                        cb_link($PROBLEM_LINK, link, $VERBOSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        if (NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
                                            html_princ($str_alt36$_wrt_);
                                            cb_link($STRATEGY, strategic_context, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                        com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_show_inference_debugger_option_tweaking_links(link, strategic_context, options);
                                        html_hr(UNPROVIDED, UNPROVIDED);
                                        com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_problem_link(link, strategic_context, options);
                                        html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
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
                    cdestructuring_bind_error(datum, $list_alt44);
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_debug_problem_link_handler(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject store_id_string = NIL;
        SubLObject link_id_string = NIL;
        SubLObject strategic_context_id_string = NIL;
        SubLObject options_glob_id_string = NIL;
        destructuring_bind_must_consp(args, args, $list48);
        store_id_string = args.first();
        SubLObject current = args.rest();
        destructuring_bind_must_consp(current, args, $list48);
        link_id_string = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, args, $list48);
        strategic_context_id_string = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, args, $list48);
        options_glob_id_string = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject link = cb_inference_browser.cb_guess_problem_link(store_id_string, link_id_string);
            final SubLObject strategic_context = cb_inference_browser.cb_guess_strategic_context(store_id_string, strategic_context_id_string);
            final SubLObject options = cb_lookup_options_by_glob_string(options_glob_id_string);
            if (NIL == inference_datastructures_problem_link.problem_link_p(link)) {
                return cb_error($str49$_A_did_not_specify_a_link, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL == inference_worker.strategic_context_p(strategic_context)) {
                return cb_error($str38$_A_did_not_specify_a_strategic_co, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL == list_utilities.plist_of_type_p(options, CB_DEBUG_OPTION_P)) {
                return cb_error($str21$_A_did_not_specify_valid_debugger, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            html_markup($str22$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str23$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                dhtml_macros.dhtml_with_dom_script();
                dhtml_macros.dhtml_with_toggle_visibility_support();
                dhtml_macros.basic_ajax_scripts();
                dhtml_macros.dhtml_creation_scripts();
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$5 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_inference_browser.cb_show_relevant_inference_debugging_links(link);
                        html_princ_strong($$$Inference_Debugging_Tree_for_);
                        cb_link($PROBLEM_LINK, link, $VERBOSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
                            html_princ($$$_wrt_);
                            cb_link($STRATEGY, strategic_context, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        cb_show_inference_debugger_option_tweaking_links(link, strategic_context, options);
                        html_hr(UNPROVIDED, UNPROVIDED);
                        cb_debug_problem_link(link, strategic_context, options);
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$5, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } else {
            cdestructuring_bind_error(args, $list48);
        }
        return NIL;
    }

    public static final SubLObject cb_debug_handler_link_alt(SubLObject handler_string, SubLObject linktext, SubLObject store_id, SubLObject object_id, SubLObject strategic_context_id, SubLObject options_glob_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_frame_name($SELF);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                if (NIL != strategic_context_id) {
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt50$_A__A__A__A__A, new SubLObject[]{ handler_string, store_id, object_id, strategic_context_id, options_glob_id });
                } else {
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt51$_A__A__A__A, new SubLObject[]{ handler_string, store_id, object_id, options_glob_id });
                }
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
                        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        if (linktext.isKeyword()) {
                            {
                                SubLObject image_src = cb_icon_file_path(linktext);
                                SubLObject align = $TOP;
                                SubLObject alt = cb_get_icon_alt_string(linktext);
                                SubLObject border = ZERO_INTEGER;
                                html_markup(html_macros.$html_image_head$.getGlobalValue());
                                html_markup(html_macros.$html_image_src$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(image_src);
                                html_char(CHAR_quotation, UNPROVIDED);
                                if (NIL != alt) {
                                    html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(alt);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (NIL != align) {
                                    html_markup(html_macros.$html_image_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align(align));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (NIL != border) {
                                    html_markup(html_macros.$html_image_border$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(border);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                    }
                                }
                                html_markup(html_macros.$html_image_tail$.getGlobalValue());
                            }
                        } else {
                            html_princ(linktext);
                        }
                        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static SubLObject cb_debug_handler_link(final SubLObject handler_string, final SubLObject linktext, final SubLObject store_id, final SubLObject object_id, final SubLObject strategic_context_id, final SubLObject options_glob_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        if (NIL != strategic_context_id) {
            format(html_macros.$html_stream$.getDynamicValue(thread), $str54$_A__A__A__A__A, new SubLObject[]{ handler_string, store_id, object_id, strategic_context_id, options_glob_id });
        } else {
            format(html_macros.$html_stream$.getDynamicValue(thread), $str55$_A__A__A__A, new SubLObject[]{ handler_string, store_id, object_id, options_glob_id });
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
            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            if (linktext.isKeyword()) {
                final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path(linktext);
                final SubLObject align = $TOP;
                final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string(linktext);
                final SubLObject border = ZERO_INTEGER;
                html_markup(html_macros.$html_image_head$.getGlobalValue());
                html_markup(html_macros.$html_image_src$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(image_src);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != alt) {
                    html_markup(html_macros.$html_image_alt$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(alt);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != align) {
                    html_markup(html_macros.$html_image_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align(align));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != border) {
                    html_markup(html_macros.$html_image_border$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(border);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                }
                html_markup(html_macros.$html_image_tail$.getGlobalValue());
            } else {
                html_princ(linktext);
            }
            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_debug_link_alt(SubLObject v_object, SubLObject strategic_context, SubLObject linktext, SubLObject options) {
        {
            SubLObject keyword = NIL;
            if (NIL != inference_datastructures_problem.problem_p(v_object)) {
                keyword = $DEBUG_PROBLEM;
            } else {
                if (NIL != inference_datastructures_problem_link.problem_link_p(v_object)) {
                    keyword = $DEBUG_PROBLEM_LINK;
                } else {
                    if (NIL != inference_datastructures_inference.inference_p(v_object)) {
                        keyword = $DEBUG_INFERENCE;
                    } else {
                        Errors.error($str_alt53$Unexpected_cb_debug_link_object__, v_object);
                    }
                }
            }
            {
                SubLObject arg2 = NIL;
                SubLObject arg3 = NIL;
                SubLObject arg4 = NIL;
                SubLObject arg5 = NIL;
                if ($DEBUG_INFERENCE == keyword) {
                    arg2 = linktext;
                    arg3 = options;
                } else {
                    arg2 = strategic_context;
                    arg3 = linktext;
                    arg4 = options;
                }
                cb_link(keyword, v_object, arg2, arg3, arg4, arg5);
            }
        }
        return NIL;
    }

    public static SubLObject cb_debug_link(final SubLObject v_object, final SubLObject strategic_context, final SubLObject linktext, final SubLObject options) {
        SubLObject keyword = NIL;
        if (NIL != inference_datastructures_problem.problem_p(v_object)) {
            keyword = $DEBUG_PROBLEM;
        } else
            if (NIL != inference_datastructures_problem_link.problem_link_p(v_object)) {
                keyword = $DEBUG_PROBLEM_LINK;
            } else
                if (NIL != inference_datastructures_inference.inference_p(v_object)) {
                    keyword = $DEBUG_INFERENCE;
                } else {
                    Errors.error($str57$Unexpected_cb_debug_link_object__, v_object);
                }


        SubLObject arg2 = NIL;
        SubLObject arg3 = NIL;
        SubLObject arg4 = NIL;
        final SubLObject arg5 = NIL;
        if ($DEBUG_INFERENCE == keyword) {
            arg2 = linktext;
            arg3 = options;
        } else {
            arg2 = strategic_context;
            arg3 = linktext;
            arg4 = options;
        }
        cb_link(keyword, v_object, arg2, arg3, arg4, arg5);
        return NIL;
    }

    public static final SubLObject cb_lookup_options_by_glob_string_alt(SubLObject string) {
        {
            SubLObject options = cb_glob_lookup_by_string(string);
            $cb_current_debug_options$.setDynamicValue(options);
            return options;
        }
    }

    public static SubLObject cb_lookup_options_by_glob_string(final SubLObject string) {
        final SubLObject options = cb_glob_lookup_by_string(string);
        $cb_current_debug_options$.setDynamicValue(options);
        return options;
    }

    public static final SubLObject cb_debug_option_p_alt(SubLObject v_object) {
        return list_utilities.alist_has_keyP($cb_debug_options$.getGlobalValue(), v_object, UNPROVIDED);
    }

    public static SubLObject cb_debug_option_p(final SubLObject v_object) {
        return list_utilities.alist_has_keyP($cb_debug_options$.getGlobalValue(), v_object, UNPROVIDED);
    }

    public static final SubLObject cb_debug_option_default_alt(SubLObject option) {
        SubLTrampolineFile.checkType(option, CB_DEBUG_OPTION_P);
        return list_utilities.alist_lookup_without_values($cb_debug_options$.getGlobalValue(), option, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cb_debug_option_default(final SubLObject option) {
        assert NIL != cb_debug_option_p(option) : "! cb_inference_debugger.cb_debug_option_p(option) " + ("cb_inference_debugger.cb_debug_option_p(option) " + "CommonSymbols.NIL != cb_inference_debugger.cb_debug_option_p(option) ") + option;
        return list_utilities.alist_lookup_without_values($cb_debug_options$.getGlobalValue(), option, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cb_debug_option_value_alt(SubLObject option, SubLObject options) {
        SubLTrampolineFile.checkType(option, CB_DEBUG_OPTION_P);
        return list_utilities.plist_lookup(options, option, com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_option_default(option));
    }

    public static SubLObject cb_debug_option_value(final SubLObject option, final SubLObject options) {
        assert NIL != cb_debug_option_p(option) : "! cb_inference_debugger.cb_debug_option_p(option) " + ("cb_inference_debugger.cb_debug_option_p(option) " + "CommonSymbols.NIL != cb_inference_debugger.cb_debug_option_p(option) ") + option;
        return list_utilities.plist_lookup(options, option, cb_debug_option_default(option));
    }

    public static final SubLObject cb_show_inference_debugger_option_tweaking_links_alt(SubLObject v_object, SubLObject strategic_context, SubLObject options) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_newline(UNPROVIDED);
            if (NIL == inference_datastructures_inference.inference_p(v_object)) {
                com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_show_ancestor_depth_tweaking_links(v_object, strategic_context, options);
                html_indent(TWO_INTEGER);
                com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_show_option_tweaking_links(v_object, strategic_context, options, $kw56$SHOW_SIBLINGS_, $str_alt57$Siblings_, $cb_show_hide_value_linktext_pairs$.getGlobalValue());
                html_indent(TWO_INTEGER);
                com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_show_option_tweaking_links(v_object, strategic_context, options, $kw58$SHOW_AUNTS_, $str_alt59$Aunts_, $cb_show_hide_value_linktext_pairs$.getGlobalValue());
                html_indent(TWO_INTEGER);
            }
            com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_show_option_tweaking_links(v_object, strategic_context, options, $kw60$DEBUG_NON_NEW_ROOTS_, $str_alt61$Non_New_Roots_, $cb_show_hide_value_linktext_pairs$.getGlobalValue());
            html_indent(TWO_INTEGER);
            com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_show_option_tweaking_links(v_object, strategic_context, options, $kw62$DEBUG_GOOD_PROBLEMS_, $str_alt63$Good_Problems_, $list_alt64);
            html_indent(TWO_INTEGER);
            com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_show_option_tweaking_links(v_object, strategic_context, options, $SHOW_WHICH_QUERIES, $str_alt66$Queries_, $list_alt67);
            html_indent(TWO_INTEGER);
            com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_show_option_tweaking_links(v_object, strategic_context, options, $kw68$SHOW_RULES_, $str_alt69$Rules_, $cb_show_hide_value_linktext_pairs$.getGlobalValue());
            html_indent(TWO_INTEGER);
            {
                SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), html_icon_src($SQUARE_PLUS));
                SubLObject align = (true) ? ((SubLObject) ($TOP)) : $CENTER;
                SubLObject alt = get_html_icon_alt_string($SQUARE_PLUS);
                SubLObject border = ZERO_INTEGER;
                html_markup(html_macros.$html_image_head$.getGlobalValue());
                html_markup(html_macros.$html_image_src$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(image_src);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != alt) {
                    html_markup(html_macros.$html_image_alt$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(alt);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != align) {
                    html_markup(html_macros.$html_image_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align(align));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != border) {
                    html_markup(html_macros.$html_image_border$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(border);
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
                html_markup(html_macros.$html_image_tail$.getGlobalValue());
            }
            {
                SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), html_icon_src($SQUARE_MINUS));
                SubLObject align = (true) ? ((SubLObject) ($TOP)) : $CENTER;
                SubLObject alt = get_html_icon_alt_string($SQUARE_MINUS);
                SubLObject border = ZERO_INTEGER;
                html_markup(html_macros.$html_image_head$.getGlobalValue());
                html_markup(html_macros.$html_image_src$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(image_src);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != alt) {
                    html_markup(html_macros.$html_image_alt$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(alt);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != align) {
                    html_markup(html_macros.$html_image_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align(align));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != border) {
                    html_markup(html_macros.$html_image_border$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(border);
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
                html_markup(html_macros.$html_image_tail$.getGlobalValue());
            }
            html_princ($str_alt73$_);
            com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_show_option_tweaking_links(v_object, strategic_context, options, $DHTML_VISIBILITY, $str_alt75$, $list_alt76);
            return NIL;
        }
    }

    public static SubLObject cb_show_inference_debugger_option_tweaking_links(final SubLObject v_object, final SubLObject strategic_context, final SubLObject options) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_newline(UNPROVIDED);
        if (NIL == inference_datastructures_inference.inference_p(v_object)) {
            cb_show_ancestor_depth_tweaking_links(v_object, strategic_context, options);
            html_indent(TWO_INTEGER);
            cb_show_option_tweaking_links(v_object, strategic_context, options, $kw60$SHOW_SIBLINGS_, $str61$Siblings_, $cb_show_hide_value_linktext_pairs$.getGlobalValue());
            html_indent(TWO_INTEGER);
            cb_show_option_tweaking_links(v_object, strategic_context, options, $kw62$SHOW_AUNTS_, $str63$Aunts_, $cb_show_hide_value_linktext_pairs$.getGlobalValue());
            html_indent(TWO_INTEGER);
        }
        cb_show_option_tweaking_links(v_object, strategic_context, options, $kw64$DEBUG_NON_NEW_ROOTS_, $str65$Non_New_Roots_, $cb_show_hide_value_linktext_pairs$.getGlobalValue());
        html_indent(TWO_INTEGER);
        cb_show_option_tweaking_links(v_object, strategic_context, options, $kw66$DEBUG_GOOD_PROBLEMS_, $str67$Good_Problems_, $list68);
        html_indent(TWO_INTEGER);
        cb_show_option_tweaking_links(v_object, strategic_context, options, $SHOW_WHICH_QUERIES, $str70$Queries_, $list71);
        html_indent(TWO_INTEGER);
        cb_show_option_tweaking_links(v_object, strategic_context, options, $kw72$SHOW_RULES_, $str73$Rules_, $cb_show_hide_value_linktext_pairs$.getGlobalValue());
        html_indent(TWO_INTEGER);
        SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src($SQUARE_PLUS));
        SubLObject align = $TOP;
        SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string($SQUARE_PLUS);
        SubLObject border = ZERO_INTEGER;
        html_markup(html_macros.$html_image_head$.getGlobalValue());
        html_markup(html_macros.$html_image_src$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(image_src);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != alt) {
            html_markup(html_macros.$html_image_alt$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(alt);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != align) {
            html_markup(html_macros.$html_image_align$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align(align));
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != border) {
            html_markup(html_macros.$html_image_border$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(border);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_image_tail$.getGlobalValue());
        image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src($SQUARE_MINUS));
        align = $TOP;
        alt = cyc_file_dependencies.get_html_icon_alt_string($SQUARE_MINUS);
        border = ZERO_INTEGER;
        html_markup(html_macros.$html_image_head$.getGlobalValue());
        html_markup(html_macros.$html_image_src$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(image_src);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != alt) {
            html_markup(html_macros.$html_image_alt$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(alt);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != align) {
            html_markup(html_macros.$html_image_align$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align(align));
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != border) {
            html_markup(html_macros.$html_image_border$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(border);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_image_tail$.getGlobalValue());
        html_princ($str77$_);
        cb_show_option_tweaking_links(v_object, strategic_context, options, $DHTML_VISIBILITY, $str79$, $list80);
        return NIL;
    }

    public static final SubLObject cb_show_ancestor_depth_tweaking_links_alt(SubLObject v_object, SubLObject strategic_context, SubLObject options) {
        html_princ($str_alt77$Ancestor_Depth_);
        {
            SubLObject cdolist_list_var = $list_alt81;
            SubLObject depth = NIL;
            for (depth = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , depth = cdolist_list_var.first()) {
                {
                    SubLObject linktext = cconcatenate($str_alt78$_, new SubLObject[]{ format_nil.format_nil_a_no_copy(depth), $str_alt79$_ });
                    com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_show_option_tweaking_link(v_object, strategic_context, options, $ANCESTOR_DEPTH, depth, linktext);
                }
            }
        }
        return NIL;
    }

    public static SubLObject cb_show_ancestor_depth_tweaking_links(final SubLObject v_object, final SubLObject strategic_context, final SubLObject options) {
        html_princ($str81$Ancestor_Depth_);
        SubLObject cdolist_list_var = $list85;
        SubLObject depth = NIL;
        depth = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject linktext = cconcatenate($str82$_, new SubLObject[]{ format_nil.format_nil_a_no_copy(depth), $str83$_ });
            cb_show_option_tweaking_link(v_object, strategic_context, options, $ANCESTOR_DEPTH, depth, linktext);
            cdolist_list_var = cdolist_list_var.rest();
            depth = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject cb_show_option_tweaking_links_alt(SubLObject v_object, SubLObject strategic_context, SubLObject options, SubLObject option, SubLObject label, SubLObject value_linktext_pairs) {
        html_princ(label);
        {
            SubLObject cdolist_list_var = value_linktext_pairs;
            SubLObject pair = NIL;
            for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                {
                    SubLObject datum = pair;
                    SubLObject current = datum;
                    SubLObject value = NIL;
                    SubLObject linktext = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt82);
                    value = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt82);
                    linktext = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        html_indent(UNPROVIDED);
                        com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_show_option_tweaking_link(v_object, strategic_context, options, option, value, linktext);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt82);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject cb_show_option_tweaking_links(final SubLObject v_object, final SubLObject strategic_context, final SubLObject options, final SubLObject option, final SubLObject label, final SubLObject value_linktext_pairs) {
        html_princ(label);
        SubLObject cdolist_list_var = value_linktext_pairs;
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject value = NIL;
            SubLObject linktext = NIL;
            destructuring_bind_must_consp(current, datum, $list86);
            value = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list86);
            linktext = current.first();
            current = current.rest();
            if (NIL == current) {
                html_indent(UNPROVIDED);
                cb_show_option_tweaking_link(v_object, strategic_context, options, option, value, linktext);
            } else {
                cdestructuring_bind_error(datum, $list86);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject cb_show_option_tweaking_link_alt(SubLObject v_object, SubLObject strategic_context, SubLObject options, SubLObject option, SubLObject value, SubLObject linktext) {
        {
            SubLObject current_value = com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_option_value(option, options);
            SubLObject sameP = eq(value, current_value);
            SubLObject new_options = (NIL != sameP) ? ((SubLObject) (options)) : copy_list(options);
            if (NIL == sameP) {
                new_options = putf(new_options, option, value);
            }
            {
                SubLObject strong_var = sameP;
                SubLObject head = (NIL != strong_var) ? ((SubLObject) (html_macros.$html_strong_head$.getGlobalValue())) : string_utilities.$empty_string$.getGlobalValue();
                SubLObject tail = (NIL != strong_var) ? ((SubLObject) (html_macros.$html_strong_tail$.getGlobalValue())) : string_utilities.$empty_string$.getGlobalValue();
                html_markup(head);
                com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_link(v_object, strategic_context, linktext, new_options);
                html_markup(tail);
            }
        }
        return NIL;
    }

    public static SubLObject cb_show_option_tweaking_link(final SubLObject v_object, final SubLObject strategic_context, final SubLObject options, final SubLObject option, final SubLObject value, final SubLObject linktext) {
        final SubLObject current_value = cb_debug_option_value(option, options);
        final SubLObject sameP = eq(value, current_value);
        SubLObject new_options = (NIL != sameP) ? options : copy_list(options);
        if (NIL == sameP) {
            new_options = putf(new_options, option, value);
        }
        final SubLObject strong_var = sameP;
        final SubLObject head = (NIL != strong_var) ? html_macros.$html_strong_head$.getGlobalValue() : string_utilities.$empty_string$.getGlobalValue();
        final SubLObject tail = (NIL != strong_var) ? html_macros.$html_strong_tail$.getGlobalValue() : string_utilities.$empty_string$.getGlobalValue();
        html_markup(head);
        cb_debug_link(v_object, strategic_context, linktext, new_options);
        html_markup(tail);
        return NIL;
    }

    public static final SubLObject cb_debug_inference_alt(SubLObject inference, SubLObject options) {
        {
            SubLObject plist_var = options;
            SubLTrampolineFile.checkType(plist_var, PROPERTY_LIST_P);
            {
                SubLObject remainder = NIL;
                for (remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
                    {
                        SubLObject property = remainder.first();
                        SubLObject value = cadr(remainder);
                        SubLTrampolineFile.checkType(property, CB_DEBUG_OPTION_P);
                    }
                }
            }
        }
        return com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_problem_link(inference_datastructures_inference.inference_root_link(inference), inference_datastructures_inference.simplest_inference_strategy(inference), options);
    }

    public static SubLObject cb_debug_inference(final SubLObject inference, final SubLObject options) {
        assert NIL != list_utilities.property_list_p(options) : "! list_utilities.property_list_p(options) " + ("list_utilities.property_list_p(options) " + "CommonSymbols.NIL != list_utilities.property_list_p(options) ") + options;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = options; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            assert NIL != cb_debug_option_p(property) : "! cb_inference_debugger.cb_debug_option_p(property) " + ("cb_inference_debugger.cb_debug_option_p(property) " + "CommonSymbols.NIL != cb_inference_debugger.cb_debug_option_p(property) ") + property;
        }
        return cb_debug_problem_link(inference_datastructures_inference.inference_root_link(inference), inference_datastructures_inference.simplest_inference_strategy(inference), options);
    }

    public static final SubLObject cb_debug_problem_alt(SubLObject problem, SubLObject strategic_context, SubLObject options) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject plist_var = options;
                SubLTrampolineFile.checkType(plist_var, PROPERTY_LIST_P);
                {
                    SubLObject remainder = NIL;
                    for (remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
                        {
                            SubLObject property = remainder.first();
                            SubLObject value = cadr(remainder);
                            SubLTrampolineFile.checkType(property, CB_DEBUG_OPTION_P);
                        }
                    }
                }
            }
            thread.resetMultipleValues();
            {
                SubLObject ancestor_layers = com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_compute_ancestor_layers(problem, options);
                SubLObject ancestors_to_display = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject _prev_bind_0 = $cb_debug_depth$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $cb_debug_tree$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $cb_debug_duplicate_tree$.currentBinding(thread);
                    try {
                        $cb_debug_depth$.bind(ZERO_INTEGER, thread);
                        $cb_debug_tree$.bind(NIL, thread);
                        $cb_debug_duplicate_tree$.bind(set.new_set(symbol_function(EQ), UNPROVIDED), thread);
                        if (NIL != ancestor_layers) {
                            com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_ancestors(ancestor_layers, strategic_context, problem, ancestors_to_display, options);
                        } else {
                            com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_problem_int(problem, strategic_context, problem, NIL, options);
                        }
                        com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_display_tree(nreverse($cb_debug_tree$.getDynamicValue(thread)), strategic_context, options);
                    } finally {
                        $cb_debug_duplicate_tree$.rebind(_prev_bind_2, thread);
                        $cb_debug_tree$.rebind(_prev_bind_1, thread);
                        $cb_debug_depth$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_debug_problem(final SubLObject problem, final SubLObject strategic_context, final SubLObject options) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != list_utilities.property_list_p(options) : "! list_utilities.property_list_p(options) " + ("list_utilities.property_list_p(options) " + "CommonSymbols.NIL != list_utilities.property_list_p(options) ") + options;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = options; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            assert NIL != cb_debug_option_p(property) : "! cb_inference_debugger.cb_debug_option_p(property) " + ("cb_inference_debugger.cb_debug_option_p(property) " + "CommonSymbols.NIL != cb_inference_debugger.cb_debug_option_p(property) ") + property;
        }
        thread.resetMultipleValues();
        final SubLObject ancestor_layers = cb_debug_compute_ancestor_layers(problem, options);
        final SubLObject ancestors_to_display = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject _prev_bind_0 = $cb_debug_depth$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $cb_debug_tree$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $cb_debug_duplicate_tree$.currentBinding(thread);
        try {
            $cb_debug_depth$.bind(ZERO_INTEGER, thread);
            $cb_debug_tree$.bind(NIL, thread);
            $cb_debug_duplicate_tree$.bind(set.new_set(symbol_function(EQ), UNPROVIDED), thread);
            if (NIL != ancestor_layers) {
                cb_debug_ancestors(ancestor_layers, strategic_context, problem, ancestors_to_display, options);
            } else {
                cb_debug_problem_int(problem, strategic_context, problem, NIL, options);
            }
            cb_debug_display_tree(nreverse($cb_debug_tree$.getDynamicValue(thread)), strategic_context, options);
        } finally {
            $cb_debug_duplicate_tree$.rebind(_prev_bind_3, thread);
            $cb_debug_tree$.rebind(_prev_bind_2, thread);
            $cb_debug_depth$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject cb_debug_problem_link_alt(SubLObject link, SubLObject strategic_context, SubLObject options) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject plist_var = options;
                SubLTrampolineFile.checkType(plist_var, PROPERTY_LIST_P);
                {
                    SubLObject remainder = NIL;
                    for (remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
                        {
                            SubLObject property = remainder.first();
                            SubLObject value = cadr(remainder);
                            SubLTrampolineFile.checkType(property, CB_DEBUG_OPTION_P);
                        }
                    }
                }
            }
            {
                SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                SubLObject ancestor_layers = NIL;
                SubLObject ancestors_to_display = NIL;
                if (NIL != supported_problem) {
                    thread.resetMultipleValues();
                    {
                        SubLObject ancestor_layers_5 = com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_compute_ancestor_layers(supported_problem, options);
                        SubLObject ancestors_to_display_6 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        ancestor_layers = ancestor_layers_5;
                        ancestors_to_display = ancestors_to_display_6;
                    }
                    set.set_add(link, ancestors_to_display);
                }
                {
                    SubLObject _prev_bind_0 = $cb_debug_depth$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $cb_debug_tree$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $cb_debug_duplicate_tree$.currentBinding(thread);
                    try {
                        $cb_debug_depth$.bind(ZERO_INTEGER, thread);
                        $cb_debug_tree$.bind(NIL, thread);
                        $cb_debug_duplicate_tree$.bind(set.new_set(symbol_function(EQ), UNPROVIDED), thread);
                        if (NIL != ancestor_layers) {
                            com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_ancestors(ancestor_layers, strategic_context, link, ancestors_to_display, options);
                        } else {
                            com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_problem_link_int(link, strategic_context, link, NIL, options);
                        }
                        com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_display_tree(nreverse($cb_debug_tree$.getDynamicValue(thread)), strategic_context, options);
                    } finally {
                        $cb_debug_duplicate_tree$.rebind(_prev_bind_2, thread);
                        $cb_debug_tree$.rebind(_prev_bind_1, thread);
                        $cb_debug_depth$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_debug_problem_link(final SubLObject link, final SubLObject strategic_context, final SubLObject options) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != list_utilities.property_list_p(options) : "! list_utilities.property_list_p(options) " + ("list_utilities.property_list_p(options) " + "CommonSymbols.NIL != list_utilities.property_list_p(options) ") + options;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = options; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            assert NIL != cb_debug_option_p(property) : "! cb_inference_debugger.cb_debug_option_p(property) " + ("cb_inference_debugger.cb_debug_option_p(property) " + "CommonSymbols.NIL != cb_inference_debugger.cb_debug_option_p(property) ") + property;
        }
        final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
        SubLObject ancestor_layers = NIL;
        SubLObject ancestors_to_display = NIL;
        if (NIL != supported_problem) {
            thread.resetMultipleValues();
            final SubLObject ancestor_layers_$8 = cb_debug_compute_ancestor_layers(supported_problem, options);
            final SubLObject ancestors_to_display_$9 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            ancestor_layers = ancestor_layers_$8;
            ancestors_to_display = ancestors_to_display_$9;
            set.set_add(link, ancestors_to_display);
        }
        final SubLObject _prev_bind_0 = $cb_debug_depth$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $cb_debug_tree$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $cb_debug_duplicate_tree$.currentBinding(thread);
        try {
            $cb_debug_depth$.bind(ZERO_INTEGER, thread);
            $cb_debug_tree$.bind(NIL, thread);
            $cb_debug_duplicate_tree$.bind(set.new_set(symbol_function(EQ), UNPROVIDED), thread);
            if (NIL != ancestor_layers) {
                cb_debug_ancestors(ancestor_layers, strategic_context, link, ancestors_to_display, options);
            } else {
                cb_debug_problem_link_int(link, strategic_context, link, NIL, options);
            }
            cb_debug_display_tree(nreverse($cb_debug_tree$.getDynamicValue(thread)), strategic_context, options);
        } finally {
            $cb_debug_duplicate_tree$.rebind(_prev_bind_3, thread);
            $cb_debug_tree$.rebind(_prev_bind_2, thread);
            $cb_debug_depth$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject cb_debug_ancestors_alt(SubLObject ancestor_layers, SubLObject strategic_context, SubLObject focal_object, SubLObject ancestors_to_display, SubLObject options) {
        {
            SubLObject first_layer = ancestor_layers.first();
            if (NIL != set.set_emptyP(first_layer)) {
                {
                    SubLObject set_contents_var = set.do_set_internal(second(ancestor_layers));
                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                    SubLObject state = NIL;
                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        {
                            SubLObject root_link = set_contents.do_set_contents_next(basis_object, state);
                            if (NIL != set_contents.do_set_contents_element_validP(state, root_link)) {
                                com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_problem_link_int(root_link, strategic_context, focal_object, ancestors_to_display, options);
                            }
                        }
                    }
                }
            } else {
                {
                    SubLObject set_contents_var = set.do_set_internal(first_layer);
                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                    SubLObject state = NIL;
                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        {
                            SubLObject root_problem = set_contents.do_set_contents_next(basis_object, state);
                            if (NIL != set_contents.do_set_contents_element_validP(state, root_problem)) {
                                com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_problem_int(root_problem, strategic_context, focal_object, ancestors_to_display, options);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject cb_debug_ancestors(final SubLObject ancestor_layers, final SubLObject strategic_context, final SubLObject focal_object, final SubLObject ancestors_to_display, final SubLObject options) {
        final SubLObject first_layer = ancestor_layers.first();
        if (NIL != set.set_emptyP(first_layer)) {
            final SubLObject set_var = second(ancestor_layers);
            final SubLObject set_contents_var = set.do_set_internal(set_var);
            SubLObject basis_object;
            SubLObject state;
            SubLObject root_link;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                root_link = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, root_link)) {
                    cb_debug_problem_link_int(root_link, strategic_context, focal_object, ancestors_to_display, options);
                }
            }
        } else {
            final SubLObject set_contents_var2 = set.do_set_internal(first_layer);
            SubLObject basis_object2;
            SubLObject state2;
            SubLObject root_problem;
            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                root_problem = set_contents.do_set_contents_next(basis_object2, state2);
                if (NIL != set_contents.do_set_contents_element_validP(state2, root_problem)) {
                    cb_debug_problem_int(root_problem, strategic_context, focal_object, ancestors_to_display, options);
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return listp of set-p, each set being the problems at a certain depth.  starts with problems closest to the inference.
     */
    @LispMethod(comment = "@return listp of set-p, each set being the problems at a certain depth.  starts with problems closest to the inference.")
    public static final SubLObject cb_debug_compute_ancestor_layers_alt(SubLObject start_problem, SubLObject options) {
        {
            SubLObject layer = set.new_set(symbol_function(EQ), ONE_INTEGER);
            SubLObject all_ancestors_set = set.new_set(symbol_function(EQ), ONE_INTEGER);
            SubLObject ancestor_layers = NIL;
            SubLObject ancestor_depth = com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_option_value($ANCESTOR_DEPTH, options);
            set.set_add(start_problem, layer);
            set.set_add(start_problem, all_ancestors_set);
            while (!((NIL != set.set_emptyP(layer)) || ancestor_depth.numE(integerDivide(length(ancestor_layers), TWO_INTEGER)))) {
                {
                    SubLObject new_layer = set.new_set(symbol_function(EQ), UNPROVIDED);
                    if (NIL != inference_datastructures_problem.problem_p(set_utilities.set_arbitrary_element(layer))) {
                        {
                            SubLObject set_contents_var = set.do_set_internal(layer);
                            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                            SubLObject state = NIL;
                            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                {
                                    SubLObject problem = set_contents.do_set_contents_next(basis_object, state);
                                    if (NIL != set_contents.do_set_contents_element_validP(state, problem)) {
                                        {
                                            SubLObject set_contents_var_7 = inference_datastructures_problem.problem_dependent_links(problem);
                                            SubLObject basis_object_8 = set_contents.do_set_contents_basis_object(set_contents_var_7);
                                            SubLObject state_9 = NIL;
                                            for (state_9 = set_contents.do_set_contents_initial_state(basis_object_8, set_contents_var_7); NIL == set_contents.do_set_contents_doneP(basis_object_8, state_9); state_9 = set_contents.do_set_contents_update_state(state_9)) {
                                                {
                                                    SubLObject link = set_contents.do_set_contents_next(basis_object_8, state_9);
                                                    if (NIL != set_contents.do_set_contents_element_validP(state_9, link)) {
                                                        if (NIL == set.set_memberP(link, all_ancestors_set)) {
                                                            set.set_add(link, new_layer);
                                                            set.set_add(link, all_ancestors_set);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        {
                            SubLObject set_contents_var = set.do_set_internal(layer);
                            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                            SubLObject state = NIL;
                            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                {
                                    SubLObject link = set_contents.do_set_contents_next(basis_object, state);
                                    if (NIL != set_contents.do_set_contents_element_validP(state, link)) {
                                        {
                                            SubLObject problem = inference_datastructures_problem_link.problem_link_supported_object(link);
                                            if (NIL != inference_datastructures_problem.problem_p(problem)) {
                                                if (NIL == set.set_memberP(problem, all_ancestors_set)) {
                                                    set.set_add(problem, new_layer);
                                                    set.set_add(problem, all_ancestors_set);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    ancestor_layers = cons(new_layer, ancestor_layers);
                    layer = new_layer;
                }
            } 
            if (NIL != com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_option_value($kw56$SHOW_SIBLINGS_, options)) {
                {
                    SubLObject parents_set = list_utilities.nth_from_end(ONE_INTEGER, ancestor_layers);
                    if (NIL != parents_set) {
                        {
                            SubLObject set_contents_var = set.do_set_internal(parents_set);
                            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                            SubLObject state = NIL;
                            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                {
                                    SubLObject parent_problem = set_contents.do_set_contents_next(basis_object, state);
                                    if (NIL != set_contents.do_set_contents_element_validP(state, parent_problem)) {
                                        com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_add_children_and_links_to_set(parent_problem, all_ancestors_set);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (NIL != com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_option_value($kw58$SHOW_AUNTS_, options)) {
                {
                    SubLObject grandparents_set = list_utilities.nth_from_end(THREE_INTEGER, ancestor_layers);
                    if (NIL != grandparents_set) {
                        {
                            SubLObject set_contents_var = set.do_set_internal(grandparents_set);
                            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                            SubLObject state = NIL;
                            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                {
                                    SubLObject grandparent_problem = set_contents.do_set_contents_next(basis_object, state);
                                    if (NIL != set_contents.do_set_contents_element_validP(state, grandparent_problem)) {
                                        com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_add_children_and_links_to_set(grandparent_problem, all_ancestors_set);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return values(ancestor_layers, all_ancestors_set);
        }
    }

    /**
     *
     *
     * @return listp of set-p, each set being the problems at a certain depth.  starts with problems closest to the inference.
     */
    @LispMethod(comment = "@return listp of set-p, each set being the problems at a certain depth.  starts with problems closest to the inference.")
    public static SubLObject cb_debug_compute_ancestor_layers(final SubLObject start_problem, final SubLObject options) {
        SubLObject layer = set.new_set(symbol_function(EQ), ONE_INTEGER);
        final SubLObject all_ancestors_set = set.new_set(symbol_function(EQ), ONE_INTEGER);
        SubLObject ancestor_layers = NIL;
        final SubLObject ancestor_depth = cb_debug_option_value($ANCESTOR_DEPTH, options);
        set.set_add(start_problem, layer);
        set.set_add(start_problem, all_ancestors_set);
        while ((NIL == set.set_emptyP(layer)) && (!ancestor_depth.numE(integerDivide(length(ancestor_layers), TWO_INTEGER)))) {
            final SubLObject new_layer = set.new_set(symbol_function(EQ), UNPROVIDED);
            if (NIL != inference_datastructures_problem.problem_p(set_utilities.set_arbitrary_element(layer))) {
                final SubLObject set_contents_var = set.do_set_internal(layer);
                SubLObject basis_object;
                SubLObject state;
                SubLObject problem;
                SubLObject set_contents_var_$10;
                SubLObject basis_object_$11;
                SubLObject state_$12;
                SubLObject link;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    problem = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, problem)) {
                        set_contents_var_$10 = inference_datastructures_problem.problem_dependent_links(problem);
                        for (basis_object_$11 = set_contents.do_set_contents_basis_object(set_contents_var_$10), state_$12 = NIL, state_$12 = set_contents.do_set_contents_initial_state(basis_object_$11, set_contents_var_$10); NIL == set_contents.do_set_contents_doneP(basis_object_$11, state_$12); state_$12 = set_contents.do_set_contents_update_state(state_$12)) {
                            link = set_contents.do_set_contents_next(basis_object_$11, state_$12);
                            if ((NIL != set_contents.do_set_contents_element_validP(state_$12, link)) && (NIL == set.set_memberP(link, all_ancestors_set))) {
                                set.set_add(link, new_layer);
                                set.set_add(link, all_ancestors_set);
                            }
                        }
                    }
                }
            } else {
                final SubLObject set_contents_var = set.do_set_internal(layer);
                SubLObject basis_object;
                SubLObject state;
                SubLObject link2;
                SubLObject problem2;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    link2 = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, link2)) {
                        problem2 = inference_datastructures_problem_link.problem_link_supported_object(link2);
                        if ((NIL != inference_datastructures_problem.problem_p(problem2)) && (NIL == set.set_memberP(problem2, all_ancestors_set))) {
                            set.set_add(problem2, new_layer);
                            set.set_add(problem2, all_ancestors_set);
                        }
                    }
                }
            }
            ancestor_layers = cons(new_layer, ancestor_layers);
            layer = new_layer;
        } 
        if (NIL != cb_debug_option_value($kw60$SHOW_SIBLINGS_, options)) {
            final SubLObject parents_set = list_utilities.nth_from_end(ONE_INTEGER, ancestor_layers);
            if (NIL != parents_set) {
                final SubLObject set_contents_var = set.do_set_internal(parents_set);
                SubLObject basis_object;
                SubLObject state;
                SubLObject parent_problem;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    parent_problem = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, parent_problem)) {
                        cb_debug_add_children_and_links_to_set(parent_problem, all_ancestors_set);
                    }
                }
            }
        }
        if (NIL != cb_debug_option_value($kw62$SHOW_AUNTS_, options)) {
            final SubLObject grandparents_set = list_utilities.nth_from_end(THREE_INTEGER, ancestor_layers);
            if (NIL != grandparents_set) {
                final SubLObject set_contents_var = set.do_set_internal(grandparents_set);
                SubLObject basis_object;
                SubLObject state;
                SubLObject grandparent_problem;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    grandparent_problem = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, grandparent_problem)) {
                        cb_debug_add_children_and_links_to_set(grandparent_problem, all_ancestors_set);
                    }
                }
            }
        }
        return values(ancestor_layers, all_ancestors_set);
    }

    public static final SubLObject cb_debug_add_children_and_links_to_set_alt(SubLObject problem, SubLObject v_set) {
        {
            SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject child_link = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, child_link)) {
                        set.set_add(child_link, v_set);
                        {
                            SubLObject link_var = child_link;
                            SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
                            SubLObject supporting_mapped_problem = NIL;
                            for (supporting_mapped_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , supporting_mapped_problem = cdolist_list_var.first()) {
                                if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem)) {
                                    {
                                        SubLObject child_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                                        SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                                        set.set_add(child_problem, v_set);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return v_set;
    }

    public static SubLObject cb_debug_add_children_and_links_to_set(final SubLObject problem, final SubLObject v_set) {
        final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject child_link;
        SubLObject link_var;
        SubLObject cdolist_list_var;
        SubLObject supporting_mapped_problem;
        SubLObject child_problem;
        SubLObject variable_map;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            child_link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, child_link)) {
                set.set_add(child_link, v_set);
                link_var = child_link;
                cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
                supporting_mapped_problem = NIL;
                supporting_mapped_problem = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem)) {
                        child_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                        variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                        set.set_add(child_problem, v_set);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    supporting_mapped_problem = cdolist_list_var.first();
                } 
            }
        }
        return v_set;
    }

    public static final SubLObject cb_debug_problem_int_alt(SubLObject problem, SubLObject strategic_context, SubLObject focal_object, SubLObject display_only_these, SubLObject options) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != display_only_these) && (NIL == set.set_memberP(problem, display_only_these))) {
                return NIL;
            }
            {
                SubLObject ellipsisP = makeBoolean(NIL == set.set_add(problem, $cb_debug_duplicate_tree$.getDynamicValue(thread)));
                SubLObject pcase_var = inference_datastructures_strategy.problem_provability_status(problem, strategic_context);
                if (pcase_var.eql($GOOD)) {
                    {
                        SubLObject debug_goodsP = com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_option_value($kw62$DEBUG_GOOD_PROBLEMS_, options);
                        com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_problem_parametrized(problem, strategic_context, debug_goodsP, debug_goodsP, ellipsisP, focal_object, display_only_these, options);
                    }
                } else {
                    if (pcase_var.eql($NEUTRAL)) {
                        com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_problem_parametrized(problem, strategic_context, T, T, ellipsisP, focal_object, display_only_these, options);
                    } else {
                        if (pcase_var.eql($NO_GOOD)) {
                            com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_problem_parametrized(problem, strategic_context, T, NIL, ellipsisP, focal_object, display_only_these, options);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_debug_problem_int(final SubLObject problem, final SubLObject strategic_context, final SubLObject focal_object, final SubLObject display_only_these, final SubLObject options) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != display_only_these) && (NIL == set.set_memberP(problem, display_only_these))) {
            return NIL;
        }
        final SubLObject ellipsisP = makeBoolean(NIL == set.set_add(problem, $cb_debug_duplicate_tree$.getDynamicValue(thread)));
        final SubLObject pcase_var = inference_datastructures_strategy.problem_provability_status(problem, strategic_context);
        if (pcase_var.eql($GOOD)) {
            final SubLObject debug_goodsP = cb_debug_option_value($kw66$DEBUG_GOOD_PROBLEMS_, options);
            cb_debug_problem_parametrized(problem, strategic_context, debug_goodsP, debug_goodsP, ellipsisP, focal_object, display_only_these, options);
        } else
            if (pcase_var.eql($NEUTRAL)) {
                cb_debug_problem_parametrized(problem, strategic_context, T, T, ellipsisP, focal_object, display_only_these, options);
            } else
                if (pcase_var.eql($NO_GOOD)) {
                    cb_debug_problem_parametrized(problem, strategic_context, T, NIL, ellipsisP, focal_object, display_only_these, options);
                }


        return NIL;
    }

    public static final SubLObject cb_debug_problem_parametrized_alt(SubLObject problem, SubLObject strategic_context, SubLObject show_queryP, SubLObject compute_and_show_argument_linksP, SubLObject ellipsisP, SubLObject focal_object, SubLObject display_only_these, SubLObject options) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject is_focal_objectP = NIL;
                if (problem == focal_object) {
                    is_focal_objectP = T;
                    display_only_these = NIL;
                }
                if (NIL != display_only_these) {
                    compute_and_show_argument_linksP = T;
                }
                if (NIL != ellipsisP) {
                    compute_and_show_argument_linksP = NIL;
                }
                {
                    SubLObject argument_links = NIL;
                    if (NIL != compute_and_show_argument_linksP) {
                        {
                            SubLObject all_argument_links = inference_datastructures_problem.problem_all_argument_links(problem);
                            SubLObject cdolist_list_var = all_argument_links;
                            SubLObject link = NIL;
                            for (link = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , link = cdolist_list_var.first()) {
                                if (NIL != (NIL != display_only_these ? ((SubLObject) (set.set_memberP(link, display_only_these))) : com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_show_problem_link_for_debuggingP(link, strategic_context, options))) {
                                    argument_links = cons(link, argument_links);
                                }
                            }
                        }
                        argument_links = com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_sort_argument_links(argument_links);
                    }
                    {
                        SubLObject query = NIL;
                        if (NIL != show_queryP) {
                            {
                                SubLObject show_which_queries = com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_option_value($SHOW_WHICH_QUERIES, options);
                                if (($ALL == show_which_queries) || (($DEAD_END == show_which_queries) && (NIL == argument_links))) {
                                    query = inference_czer.problem_query_formula(inference_datastructures_problem.problem_query(problem));
                                }
                            }
                        }
                        com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_add_node_to_tree($PROBLEM, list(problem, is_focal_objectP, query));
                    }
                    if (NIL != ellipsisP) {
                        {
                            SubLObject _prev_bind_0 = $cb_debug_depth$.currentBinding(thread);
                            try {
                                $cb_debug_depth$.bind(number_utilities.f_1X($cb_debug_depth$.getDynamicValue(thread)), thread);
                                com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_add_node_to_tree($ELLIPSIS, NIL);
                            } finally {
                                $cb_debug_depth$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    if (NIL != compute_and_show_argument_linksP) {
                        {
                            SubLObject _prev_bind_0 = $cb_debug_depth$.currentBinding(thread);
                            try {
                                $cb_debug_depth$.bind(number_utilities.f_1X($cb_debug_depth$.getDynamicValue(thread)), thread);
                                {
                                    SubLObject cdolist_list_var = argument_links;
                                    SubLObject link = NIL;
                                    for (link = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , link = cdolist_list_var.first()) {
                                        com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_problem_link_int(link, strategic_context, focal_object, display_only_these, options);
                                    }
                                }
                            } finally {
                                $cb_debug_depth$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_debug_problem_parametrized(final SubLObject problem, final SubLObject strategic_context, final SubLObject show_queryP, SubLObject compute_and_show_argument_linksP, final SubLObject ellipsisP, final SubLObject focal_object, SubLObject display_only_these, final SubLObject options) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject is_focal_objectP = NIL;
        if (problem.eql(focal_object)) {
            is_focal_objectP = T;
            display_only_these = NIL;
        }
        if (NIL != display_only_these) {
            compute_and_show_argument_linksP = T;
        }
        if (NIL != ellipsisP) {
            compute_and_show_argument_linksP = NIL;
        }
        SubLObject argument_links = NIL;
        if (NIL != compute_and_show_argument_linksP) {
            SubLObject cdolist_list_var;
            final SubLObject all_argument_links = cdolist_list_var = inference_datastructures_problem.problem_all_argument_links(problem);
            SubLObject link = NIL;
            link = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != (NIL != display_only_these ? set.set_memberP(link, display_only_these) : cb_show_problem_link_for_debuggingP(link, strategic_context, options))) {
                    argument_links = cons(link, argument_links);
                }
                cdolist_list_var = cdolist_list_var.rest();
                link = cdolist_list_var.first();
            } 
            argument_links = cb_debug_sort_argument_links(argument_links);
        }
        SubLObject query = NIL;
        if (NIL != show_queryP) {
            final SubLObject show_which_queries = cb_debug_option_value($SHOW_WHICH_QUERIES, options);
            if (($ALL == show_which_queries) || (($DEAD_END == show_which_queries) && (NIL == argument_links))) {
                query = inference_czer.problem_query_formula(inference_datastructures_problem.problem_query(problem));
            }
        }
        cb_debug_add_node_to_tree($PROBLEM, list(problem, is_focal_objectP, query));
        if (NIL != ellipsisP) {
            final SubLObject _prev_bind_0 = $cb_debug_depth$.currentBinding(thread);
            try {
                $cb_debug_depth$.bind(number_utilities.f_1X($cb_debug_depth$.getDynamicValue(thread)), thread);
                cb_debug_add_node_to_tree($ELLIPSIS, NIL);
            } finally {
                $cb_debug_depth$.rebind(_prev_bind_0, thread);
            }
        }
        if (NIL != compute_and_show_argument_linksP) {
            final SubLObject _prev_bind_0 = $cb_debug_depth$.currentBinding(thread);
            try {
                $cb_debug_depth$.bind(number_utilities.f_1X($cb_debug_depth$.getDynamicValue(thread)), thread);
                SubLObject cdolist_list_var = argument_links;
                SubLObject link = NIL;
                link = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    cb_debug_problem_link_int(link, strategic_context, focal_object, display_only_these, options);
                    cdolist_list_var = cdolist_list_var.rest();
                    link = cdolist_list_var.first();
                } 
            } finally {
                $cb_debug_depth$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_show_problem_link_for_debuggingP_alt(SubLObject link, SubLObject strategic_context, SubLObject options) {
        if ((NIL != inference_worker.connected_conjunction_link_p(link)) && (NIL != inference_datastructures_problem_link.problem_link_closedP(link))) {
            return NIL;
        }
        if (NIL != balancing_tactician.balancing_tactician_p(strategic_context)) {
            if (NIL != com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_option_value($kw60$DEBUG_NON_NEW_ROOTS_, options)) {
                return T;
            }
            {
                SubLObject link_leads_to_new_rootP = NIL;
                SubLObject link_var = link;
                SubLObject rest = NIL;
                for (rest = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var); !((NIL != link_leads_to_new_rootP) || (NIL == rest)); rest = rest.rest()) {
                    {
                        SubLObject supporting_mapped_problem = rest.first();
                        if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem)) {
                            {
                                SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                                SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                                if (NIL != balancing_tactician.balancing_tactician_problem_motivated_wrt_nP(strategic_context, supporting_problem)) {
                                    link_leads_to_new_rootP = T;
                                }
                            }
                        }
                    }
                }
                if ((NIL != inference_worker_join_ordered.join_ordered_link_p(link)) && (NIL != inference_worker_join_ordered.join_ordered_link_non_focal_manifestedP(link))) {
                    {
                        SubLObject link_var_10 = link;
                        SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(inference_worker_join_ordered.join_ordered_link_non_focal_problem(link_var_10));
                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                        SubLObject state = NIL;
                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); !((NIL != link_leads_to_new_rootP) || (NIL != set_contents.do_set_contents_doneP(basis_object, state))); state = set_contents.do_set_contents_update_state(state)) {
                            {
                                SubLObject restriction_link = set_contents.do_set_contents_next(basis_object, state);
                                if (NIL != set_contents.do_set_contents_element_validP(state, restriction_link)) {
                                    if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $RESTRICTION)) {
                                        if (NIL != inference_worker_join_ordered.non_focal_restriction_link_with_corresponding_focal_proofP(restriction_link, link_var_10)) {
                                            {
                                                SubLObject restricted_non_focal = inference_datastructures_problem_link.problem_link_sole_supporting_problem(restriction_link);
                                                if (NIL != balancing_tactician.balancing_tactician_problem_motivated_wrt_nP(strategic_context, restricted_non_focal)) {
                                                    link_leads_to_new_rootP = T;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (NIL == link_leads_to_new_rootP) {
                    return NIL;
                }
            }
        }
        return T;
    }

    public static SubLObject cb_show_problem_link_for_debuggingP(final SubLObject link, final SubLObject strategic_context, final SubLObject options) {
        if ((NIL != inference_worker.connected_conjunction_link_p(link)) && (NIL != inference_datastructures_problem_link.problem_link_closedP(link))) {
            return NIL;
        }
        if (NIL != balancing_tactician.balancing_tactician_p(strategic_context)) {
            if (NIL != cb_debug_option_value($kw64$DEBUG_NON_NEW_ROOTS_, options)) {
                return T;
            }
            SubLObject link_leads_to_new_rootP;
            SubLObject rest;
            SubLObject supporting_mapped_problem;
            SubLObject supporting_problem;
            SubLObject variable_map;
            for (link_leads_to_new_rootP = NIL, rest = NIL, rest = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link); (NIL == link_leads_to_new_rootP) && (NIL != rest); rest = rest.rest()) {
                supporting_mapped_problem = rest.first();
                if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link, supporting_mapped_problem)) {
                    supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                    variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                    if (NIL != balancing_tactician.balancing_tactician_problem_motivated_wrt_nP(strategic_context, supporting_problem)) {
                        link_leads_to_new_rootP = T;
                    }
                }
            }
            if ((NIL != inference_worker_join_ordered.join_ordered_link_p(link)) && (NIL != inference_worker_join_ordered.join_ordered_link_non_focal_manifestedP(link))) {
                final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(inference_worker_join_ordered.join_ordered_link_non_focal_problem(link));
                SubLObject basis_object;
                SubLObject state;
                SubLObject restriction_link;
                SubLObject restricted_non_focal;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == link_leads_to_new_rootP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                    restriction_link = set_contents.do_set_contents_next(basis_object, state);
                    if (((NIL != set_contents.do_set_contents_element_validP(state, restriction_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $RESTRICTION))) && (NIL != inference_worker_join_ordered.non_focal_restriction_link_with_corresponding_focal_proofP(restriction_link, link))) {
                        restricted_non_focal = inference_datastructures_problem_link.problem_link_sole_supporting_problem(restriction_link);
                        if (NIL != balancing_tactician.balancing_tactician_problem_motivated_wrt_nP(strategic_context, restricted_non_focal)) {
                            link_leads_to_new_rootP = T;
                        }
                    }
                }
            }
            if (NIL == link_leads_to_new_rootP) {
                return NIL;
            }
        }
        return T;
    }

    public static final SubLObject cb_debug_problem_link_int_alt(SubLObject link, SubLObject strategic_context, SubLObject focal_object, SubLObject display_only_these, SubLObject options) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject is_focal_objectP = NIL;
                if (link == focal_object) {
                    is_focal_objectP = T;
                    display_only_these = NIL;
                }
                if ((NIL != display_only_these) && (NIL == set.set_memberP(link, display_only_these))) {
                    return NIL;
                }
                {
                    SubLObject rule = NIL;
                    if (NIL != com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_option_value($kw68$SHOW_RULES_, options)) {
                        if (NIL != inference_worker_transformation.generalized_transformation_link_p(link)) {
                            rule = inference_worker_transformation.generalized_transformation_link_rule_assertion(link);
                        }
                    }
                    com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_add_node_to_tree($PROBLEM_LINK, list(link, is_focal_objectP, rule));
                }
            }
            {
                SubLObject _prev_bind_0 = $cb_debug_depth$.currentBinding(thread);
                try {
                    $cb_debug_depth$.bind(number_utilities.f_1X($cb_debug_depth$.getDynamicValue(thread)), thread);
                    {
                        SubLObject supporting_problems = com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_sort_supporting_problems(inference_datastructures_problem_link.problem_link_supporting_problems(link));
                        if (NIL != inference_worker_join_ordered.join_ordered_link_p(link)) {
                            com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_join_ordered_link_guts(link, strategic_context, focal_object, display_only_these, options);
                        } else {
                            {
                                SubLObject cdolist_list_var = supporting_problems;
                                SubLObject problem = NIL;
                                for (problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , problem = cdolist_list_var.first()) {
                                    com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_problem_int(problem, strategic_context, focal_object, display_only_these, options);
                                }
                            }
                        }
                    }
                } finally {
                    $cb_debug_depth$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_debug_problem_link_int(final SubLObject link, final SubLObject strategic_context, final SubLObject focal_object, SubLObject display_only_these, final SubLObject options) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject is_focal_objectP = NIL;
        if (link.eql(focal_object)) {
            is_focal_objectP = T;
            display_only_these = NIL;
        }
        if ((NIL != display_only_these) && (NIL == set.set_memberP(link, display_only_these))) {
            return NIL;
        }
        SubLObject rule = NIL;
        if ((NIL != cb_debug_option_value($kw72$SHOW_RULES_, options)) && (NIL != inference_worker_transformation.generalized_transformation_link_p(link))) {
            rule = inference_worker_transformation.generalized_transformation_link_rule_assertion(link);
        }
        cb_debug_add_node_to_tree($PROBLEM_LINK, list(link, is_focal_objectP, rule));
        final SubLObject _prev_bind_0 = $cb_debug_depth$.currentBinding(thread);
        try {
            $cb_debug_depth$.bind(number_utilities.f_1X($cb_debug_depth$.getDynamicValue(thread)), thread);
            final SubLObject supporting_problems = cb_debug_sort_supporting_problems(inference_datastructures_problem_link.problem_link_supporting_problems(link));
            if (NIL != inference_worker_join_ordered.join_ordered_link_p(link)) {
                cb_debug_join_ordered_link_guts(link, strategic_context, focal_object, display_only_these, options);
            } else {
                SubLObject cdolist_list_var = supporting_problems;
                SubLObject problem = NIL;
                problem = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    cb_debug_problem_int(problem, strategic_context, focal_object, display_only_these, options);
                    cdolist_list_var = cdolist_list_var.rest();
                    problem = cdolist_list_var.first();
                } 
            }
        } finally {
            $cb_debug_depth$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject cb_debug_join_ordered_link_guts_alt(SubLObject join_ordered_link, SubLObject strategic_context, SubLObject focal_object, SubLObject display_only_these, SubLObject options) {
        {
            SubLObject focal_problem = inference_worker_join_ordered.join_ordered_link_focal_problem(join_ordered_link);
            com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_problem_int(focal_problem, strategic_context, focal_object, display_only_these, options);
            if (NIL != inference_worker_join_ordered.join_ordered_link_non_focal_manifestedP(join_ordered_link)) {
                {
                    SubLObject non_focal_problem = inference_worker_join_ordered.join_ordered_link_non_focal_problem(join_ordered_link);
                    if (NIL != inference_worker.good_problem_p(focal_problem, strategic_context)) {
                        {
                            SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(non_focal_problem);
                            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                            SubLObject state = NIL;
                            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                {
                                    SubLObject restriction_link = set_contents.do_set_contents_next(basis_object, state);
                                    if (NIL != set_contents.do_set_contents_element_validP(state, restriction_link)) {
                                        if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $RESTRICTION)) {
                                            if (NIL != com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_show_problem_link_for_debuggingP(restriction_link, strategic_context, options)) {
                                                com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_problem_link_int(restriction_link, strategic_context, focal_object, display_only_these, options);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_problem_int(non_focal_problem, strategic_context, focal_object, display_only_these, options);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject cb_debug_join_ordered_link_guts(final SubLObject join_ordered_link, final SubLObject strategic_context, final SubLObject focal_object, final SubLObject display_only_these, final SubLObject options) {
        final SubLObject focal_problem = inference_worker_join_ordered.join_ordered_link_focal_problem(join_ordered_link);
        cb_debug_problem_int(focal_problem, strategic_context, focal_object, display_only_these, options);
        if (NIL != inference_worker_join_ordered.join_ordered_link_non_focal_manifestedP(join_ordered_link)) {
            final SubLObject non_focal_problem = inference_worker_join_ordered.join_ordered_link_non_focal_problem(join_ordered_link);
            if (NIL != inference_worker.good_problem_p(focal_problem, strategic_context)) {
                final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(non_focal_problem);
                SubLObject basis_object;
                SubLObject state;
                SubLObject restriction_link;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    restriction_link = set_contents.do_set_contents_next(basis_object, state);
                    if (((NIL != set_contents.do_set_contents_element_validP(state, restriction_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $RESTRICTION))) && (NIL != cb_show_problem_link_for_debuggingP(restriction_link, strategic_context, options))) {
                        cb_debug_problem_link_int(restriction_link, strategic_context, focal_object, display_only_these, options);
                    }
                }
            } else {
                cb_debug_problem_int(non_focal_problem, strategic_context, focal_object, display_only_these, options);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_debug_add_node_to_tree_alt(SubLObject node_type, SubLObject data) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(node_type, KEYWORDP);
            {
                SubLObject node = listS(node_type, $cb_debug_depth$.getDynamicValue(thread), data);
                $cb_debug_tree$.setDynamicValue(cons(node, $cb_debug_tree$.getDynamicValue(thread)), thread);
                return node;
            }
        }
    }

    public static SubLObject cb_debug_add_node_to_tree(final SubLObject node_type, final SubLObject data) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != keywordp(node_type) : "! keywordp(node_type) " + ("Types.keywordp(node_type) " + "CommonSymbols.NIL != Types.keywordp(node_type) ") + node_type;
        final SubLObject node = listS(node_type, $cb_debug_depth$.getDynamicValue(thread), data);
        $cb_debug_tree$.setDynamicValue(cons(node, $cb_debug_tree$.getDynamicValue(thread)), thread);
        return node;
    }

    public static final SubLObject cb_debug_sort_argument_links_alt(SubLObject links) {
        return Sort.sort(links, $sym92$CB_DEBUG_ARGUMENT_LINK__, UNPROVIDED);
    }

    public static SubLObject cb_debug_sort_argument_links(final SubLObject links) {
        return Sort.sort(links, $sym96$CB_DEBUG_ARGUMENT_LINK__, UNPROVIDED);
    }

    public static final SubLObject cb_debug_argument_link_L_alt(SubLObject link1, SubLObject link2) {
        if (NIL != com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.good_problem_link_p(link1)) {
            if (NIL != com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.good_problem_link_p(link2)) {
                return com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.problem_link_suid_L(link1, link2);
            } else {
                return T;
            }
        } else {
            if (NIL != com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.good_problem_link_p(link2)) {
                return NIL;
            } else {
                return com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.problem_link_suid_L(link1, link2);
            }
        }
    }

    public static SubLObject cb_debug_argument_link_L(final SubLObject link1, final SubLObject link2) {
        if (NIL != good_problem_link_p(link1)) {
            if (NIL != good_problem_link_p(link2)) {
                return problem_link_suid_L(link1, link2);
            }
            return T;
        } else {
            if (NIL != good_problem_link_p(link2)) {
                return NIL;
            }
            return problem_link_suid_L(link1, link2);
        }
    }

    public static final SubLObject problem_link_suid_L_alt(SubLObject link1, SubLObject link2) {
        return numL(inference_datastructures_problem_link.problem_link_suid(link1), inference_datastructures_problem_link.problem_link_suid(link2));
    }

    public static SubLObject problem_link_suid_L(final SubLObject link1, final SubLObject link2) {
        return numL(inference_datastructures_problem_link.problem_link_suid(link1), inference_datastructures_problem_link.problem_link_suid(link2));
    }

    public static final SubLObject good_problem_link_p_alt(SubLObject link) {
        return inference_datastructures_problem_link.problem_link_has_some_proofP(link, UNPROVIDED);
    }

    public static SubLObject good_problem_link_p(final SubLObject link) {
        return inference_datastructures_problem_link.problem_link_has_some_proofP(link, UNPROVIDED);
    }

    public static final SubLObject cb_debug_sort_supporting_problems_alt(SubLObject problems) {
        return Sort.sort(problems, $sym93$CB_DEBUG_SUPPORTING_PROBLEM__, UNPROVIDED);
    }

    public static SubLObject cb_debug_sort_supporting_problems(final SubLObject problems) {
        return Sort.sort(problems, $sym97$CB_DEBUG_SUPPORTING_PROBLEM__, UNPROVIDED);
    }

    public static final SubLObject cb_debug_supporting_problem_L_alt(SubLObject problem1, SubLObject problem2) {
        if (NIL != inference_datastructures_problem.tactically_good_problem_p(problem1)) {
            if (NIL != inference_datastructures_problem.tactically_good_problem_p(problem2)) {
                return com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.problem_suid_L(problem1, problem2);
            } else {
                return T;
            }
        } else {
            if (NIL != inference_datastructures_problem.tactically_good_problem_p(problem2)) {
                return NIL;
            } else {
                return com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.problem_suid_L(problem1, problem2);
            }
        }
    }

    public static SubLObject cb_debug_supporting_problem_L(final SubLObject problem1, final SubLObject problem2) {
        if (NIL != inference_datastructures_problem.tactically_good_problem_p(problem1)) {
            if (NIL != inference_datastructures_problem.tactically_good_problem_p(problem2)) {
                return problem_suid_L(problem1, problem2);
            }
            return T;
        } else {
            if (NIL != inference_datastructures_problem.tactically_good_problem_p(problem2)) {
                return NIL;
            }
            return problem_suid_L(problem1, problem2);
        }
    }

    public static final SubLObject problem_suid_L_alt(SubLObject problem1, SubLObject problem2) {
        return numL(inference_datastructures_problem.problem_suid(problem1), inference_datastructures_problem.problem_suid(problem2));
    }

    public static SubLObject problem_suid_L(final SubLObject problem1, final SubLObject problem2) {
        return numL(inference_datastructures_problem.problem_suid(problem1), inference_datastructures_problem.problem_suid(problem2));
    }

    public static final SubLObject cb_debug_display_tree_alt(SubLObject debug_tree, SubLObject strategic_context, SubLObject options) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $cb_debug_next_object_id$.currentBinding(thread);
                try {
                    $cb_debug_next_object_id$.bind(ZERO_INTEGER, thread);
                    com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_display_tree_children(debug_tree, ZERO_INTEGER, $$$root, strategic_context, options);
                } finally {
                    $cb_debug_next_object_id$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_debug_display_tree(final SubLObject debug_tree, final SubLObject strategic_context, final SubLObject options) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $cb_debug_next_object_id$.currentBinding(thread);
        try {
            $cb_debug_next_object_id$.bind(ZERO_INTEGER, thread);
            cb_debug_display_tree_children(debug_tree, ZERO_INTEGER, $$$root, strategic_context, options);
        } finally {
            $cb_debug_next_object_id$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject cb_debug_display_tree_children_alt(SubLObject debug_tree, SubLObject exact_depth, SubLObject parent_id, SubLObject strategic_context, SubLObject options) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject visibility = com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_option_value($DHTML_VISIBILITY, options);
                if ($$$root.equal(parent_id)) {
                    visibility = $VISIBLE;
                }
                if ($NONE == visibility) {
                    com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_display_tree_children_int(debug_tree, exact_depth, strategic_context, options);
                } else {
                    dhtml_macros.dhtml_set_switched_visibility(parent_id, visibility, $TEXT);
                    html_markup(html_macros.$html_div_head$.getGlobalValue());
                    if (NIL != parent_id) {
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(parent_id);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_display_tree_children_int(debug_tree, exact_depth, strategic_context, options);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_debug_display_tree_children(final SubLObject debug_tree, final SubLObject exact_depth, final SubLObject parent_id, final SubLObject strategic_context, final SubLObject options) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject visibility = cb_debug_option_value($DHTML_VISIBILITY, options);
        if ($$$root.equal(parent_id)) {
            visibility = $VISIBLE;
        }
        if ($NONE == visibility) {
            cb_debug_display_tree_children_int(debug_tree, exact_depth, strategic_context, options);
        } else {
            dhtml_macros.dhtml_set_switched_visibility(parent_id, visibility, $TEXT);
            html_markup(html_macros.$html_div_head$.getGlobalValue());
            if (NIL != parent_id) {
                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(parent_id);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                cb_debug_display_tree_children_int(debug_tree, exact_depth, strategic_context, options);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_div_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject cb_debug_display_tree_children_int_alt(SubLObject debug_tree, SubLObject exact_depth, SubLObject strategic_context, SubLObject options) {
        {
            SubLObject done_with_this_subtreeP = NIL;
            SubLObject subtree = NIL;
            for (subtree = debug_tree; !((NIL == subtree) || (NIL != done_with_this_subtreeP)); subtree = subtree.rest()) {
                {
                    SubLObject child_node = subtree.first();
                    SubLObject child_depth = second(child_node);
                    if (child_depth == exact_depth) {
                        com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_display_tree_int(subtree, strategic_context, options);
                    } else {
                        if (child_depth.numL(exact_depth)) {
                            done_with_this_subtreeP = T;
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject cb_debug_display_tree_children_int(final SubLObject debug_tree, final SubLObject exact_depth, final SubLObject strategic_context, final SubLObject options) {
        SubLObject done_with_this_subtreeP;
        SubLObject subtree;
        SubLObject child_node;
        SubLObject child_depth;
        for (done_with_this_subtreeP = NIL, subtree = NIL, subtree = debug_tree; (NIL != subtree) && (NIL == done_with_this_subtreeP); subtree = subtree.rest()) {
            child_node = subtree.first();
            child_depth = second(child_node);
            if (child_depth.eql(exact_depth)) {
                cb_debug_display_tree_int(subtree, strategic_context, options);
            } else
                if (child_depth.numL(exact_depth)) {
                    done_with_this_subtreeP = T;
                }

        }
        return NIL;
    }

    public static final SubLObject cb_debug_display_tree_int_alt(SubLObject debug_tree, SubLObject strategic_context, SubLObject options) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject node = debug_tree.first();
                SubLObject lookhead_node = second(debug_tree);
                SubLObject datum = node;
                SubLObject current = datum;
                SubLObject node_type = NIL;
                SubLObject depth = NIL;
                SubLObject data = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt99);
                node_type = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt99);
                depth = current.first();
                current = current.rest();
                data = current;
                if (depth.numG($cb_debug_max_depth$.getGlobalValue())) {
                    node_type = $ELLIPSIS;
                }
                if ($ELLIPSIS == node_type) {
                    com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_indent_the_right_amount(depth);
                    if ($NONE != com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_option_value($DHTML_VISIBILITY, options)) {
                        {
                            SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), html_icon_src($SQUARE_BLANK));
                            SubLObject align = (true) ? ((SubLObject) ($TOP)) : $CENTER;
                            SubLObject alt = get_html_icon_alt_string($SQUARE_BLANK);
                            SubLObject border = (true) ? ((SubLObject) (ZERO_INTEGER)) : ZERO_INTEGER;
                            html_markup(html_macros.$html_image_head$.getGlobalValue());
                            html_markup(html_macros.$html_image_src$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(image_src);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != alt) {
                                html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(alt);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != align) {
                                html_markup(html_macros.$html_image_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align(align));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != border) {
                                html_markup(html_macros.$html_image_border$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(border);
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
                            html_markup(html_macros.$html_image_tail$.getGlobalValue());
                        }
                        html_indent(UNPROVIDED);
                    }
                    html_princ($str_alt101$___);
                    html_newline(UNPROVIDED);
                } else {
                    {
                        SubLObject datum_11 = data;
                        SubLObject current_12 = datum_11;
                        SubLObject v_object = NIL;
                        SubLObject is_focal_objectP = NIL;
                        SubLObject query_or_rule = NIL;
                        destructuring_bind_must_consp(current_12, datum_11, $list_alt102);
                        v_object = current_12.first();
                        current_12 = current_12.rest();
                        destructuring_bind_must_consp(current_12, datum_11, $list_alt102);
                        is_focal_objectP = current_12.first();
                        current_12 = current_12.rest();
                        destructuring_bind_must_consp(current_12, datum_11, $list_alt102);
                        query_or_rule = current_12.first();
                        current_12 = current_12.rest();
                        if (NIL == current_12) {
                            {
                                SubLObject object_id = com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_next_object_id_string();
                                com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_indent_the_right_amount(depth);
                                if ($NONE != com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_option_value($DHTML_VISIBILITY, options)) {
                                    if (((NIL == lookhead_node) || ($ELLIPSIS == lookhead_node.first())) || second(lookhead_node).numLE(depth)) {
                                        {
                                            SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), html_icon_src($BLANK_TRIANGLE));
                                            SubLObject align = (true) ? ((SubLObject) ($TOP)) : $CENTER;
                                            SubLObject alt = get_html_icon_alt_string($BLANK_TRIANGLE);
                                            SubLObject border = (true) ? ((SubLObject) (ZERO_INTEGER)) : ZERO_INTEGER;
                                            html_markup(html_macros.$html_image_head$.getGlobalValue());
                                            html_markup(html_macros.$html_image_src$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(image_src);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != alt) {
                                                html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(alt);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (NIL != align) {
                                                html_markup(html_macros.$html_image_align$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(html_align(align));
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (NIL != border) {
                                                html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(border);
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
                                            html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                            html_indent(UNPROVIDED);
                                        }
                                    } else {
                                        dhtml_macros.dhtml_switch_visibility_links_plus_minus(object_id, $str_alt75$);
                                    }
                                }
                                com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_link(v_object, strategic_context, $cb_debug_icon$.getDynamicValue(thread), options);
                                if (NIL != is_focal_objectP) {
                                    {
                                        SubLObject size_val = FIVE_INTEGER;
                                        html_markup(html_macros.$html_font_head$.getGlobalValue());
                                        if (NIL != size_val) {
                                            html_markup(html_macros.$html_font_size$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(size_val);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                cb_link(node_type, v_object, $VERBOSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                    }
                                } else {
                                    cb_link(node_type, v_object, $VERBOSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                                if (NIL != query_or_rule) {
                                    com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_inference_form(query_or_rule, depth);
                                }
                                html_newline(UNPROVIDED);
                                com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger.cb_debug_display_tree_children(debug_tree.rest(), number_utilities.f_1X(depth), object_id, strategic_context, options);
                            }
                        } else {
                            cdestructuring_bind_error(datum_11, $list_alt102);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_debug_display_tree_int(final SubLObject debug_tree, final SubLObject strategic_context, final SubLObject options) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject node = debug_tree.first();
        final SubLObject lookhead_node = second(debug_tree);
        SubLObject current;
        final SubLObject datum = current = node;
        SubLObject node_type = NIL;
        SubLObject depth = NIL;
        SubLObject data = NIL;
        destructuring_bind_must_consp(current, datum, $list103);
        node_type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list103);
        depth = current.first();
        current = data = current.rest();
        if (depth.numG($cb_debug_max_depth$.getGlobalValue())) {
            node_type = $ELLIPSIS;
        }
        if ($ELLIPSIS == node_type) {
            cb_debug_indent_the_right_amount(depth);
            if ($NONE != cb_debug_option_value($DHTML_VISIBILITY, options)) {
                final SubLObject image_src = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src($SQUARE_BLANK));
                final SubLObject align = $TOP;
                final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string($SQUARE_BLANK);
                final SubLObject border = ZERO_INTEGER;
                html_markup(html_macros.$html_image_head$.getGlobalValue());
                html_markup(html_macros.$html_image_src$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(image_src);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != alt) {
                    html_markup(html_macros.$html_image_alt$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(alt);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != align) {
                    html_markup(html_macros.$html_image_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align(align));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != border) {
                    html_markup(html_macros.$html_image_border$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(border);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_image_tail$.getGlobalValue());
                html_indent(UNPROVIDED);
            }
            html_princ($str105$___);
            html_newline(UNPROVIDED);
        } else {
            SubLObject current_$15;
            final SubLObject datum_$14 = current_$15 = data;
            SubLObject v_object = NIL;
            SubLObject is_focal_objectP = NIL;
            SubLObject query_or_rule = NIL;
            destructuring_bind_must_consp(current_$15, datum_$14, $list106);
            v_object = current_$15.first();
            current_$15 = current_$15.rest();
            destructuring_bind_must_consp(current_$15, datum_$14, $list106);
            is_focal_objectP = current_$15.first();
            current_$15 = current_$15.rest();
            destructuring_bind_must_consp(current_$15, datum_$14, $list106);
            query_or_rule = current_$15.first();
            current_$15 = current_$15.rest();
            if (NIL == current_$15) {
                final SubLObject object_id = cb_debug_next_object_id_string();
                cb_debug_indent_the_right_amount(depth);
                if ($NONE != cb_debug_option_value($DHTML_VISIBILITY, options)) {
                    if (((NIL == lookhead_node) || ($ELLIPSIS == lookhead_node.first())) || second(lookhead_node).numLE(depth)) {
                        final SubLObject image_src2 = cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src($BLANK_TRIANGLE));
                        final SubLObject align2 = $TOP;
                        final SubLObject alt2 = cyc_file_dependencies.get_html_icon_alt_string($BLANK_TRIANGLE);
                        final SubLObject border2 = ZERO_INTEGER;
                        html_markup(html_macros.$html_image_head$.getGlobalValue());
                        html_markup(html_macros.$html_image_src$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(image_src2);
                        html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != alt2) {
                            html_markup(html_macros.$html_image_alt$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(alt2);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (NIL != align2) {
                            html_markup(html_macros.$html_image_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align(align2));
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (NIL != border2) {
                            html_markup(html_macros.$html_image_border$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(border2);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                        }
                        html_markup(html_macros.$html_image_tail$.getGlobalValue());
                        html_indent(UNPROVIDED);
                    } else {
                        dhtml_macros.dhtml_switch_visibility_links_plus_minus(object_id, $str79$);
                    }
                }
                cb_debug_link(v_object, strategic_context, $cb_debug_icon$.getDynamicValue(thread), options);
                if (NIL != is_focal_objectP) {
                    final SubLObject size_val = FIVE_INTEGER;
                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                    if (NIL != size_val) {
                        html_markup(html_macros.$html_font_size$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(size_val);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        cb_link(node_type, v_object, $VERBOSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_3, thread);
                    }
                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                } else {
                    cb_link(node_type, v_object, $VERBOSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (NIL != query_or_rule) {
                    cb_debug_inference_form(query_or_rule, depth);
                }
                html_newline(UNPROVIDED);
                cb_debug_display_tree_children(debug_tree.rest(), number_utilities.f_1X(depth), object_id, strategic_context, options);
            } else {
                cdestructuring_bind_error(datum_$14, $list106);
            }
        }
        return NIL;
    }

    public static final SubLObject cb_debug_next_object_id_string_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject string = cconcatenate($$$cbd, string_utilities.str($cb_debug_next_object_id$.getDynamicValue(thread)));
                $cb_debug_next_object_id$.setDynamicValue(add($cb_debug_next_object_id$.getDynamicValue(thread), ONE_INTEGER), thread);
                return string;
            }
        }
    }

    public static SubLObject cb_debug_next_object_id_string() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject string = cconcatenate($$$cbd, string_utilities.str($cb_debug_next_object_id$.getDynamicValue(thread)));
        $cb_debug_next_object_id$.setDynamicValue(add($cb_debug_next_object_id$.getDynamicValue(thread), ONE_INTEGER), thread);
        return string;
    }

    public static final SubLObject cb_debug_indent_the_right_amount_alt(SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_indent(multiply(depth, $cb_debug_indent_quantum$.getDynamicValue(thread)));
            return depth;
        }
    }

    public static SubLObject cb_debug_indent_the_right_amount(final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_indent(multiply(depth, $cb_debug_indent_quantum$.getDynamicValue(thread)));
        return depth;
    }

    public static final SubLObject cb_debug_inference_form_alt(SubLObject v_object, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return cb_form(v_object, add(TWO_INTEGER, integerDivide(multiply(depth, $cb_debug_indent_quantum$.getDynamicValue(thread)), TWO_INTEGER)), T);
        }
    }

    public static SubLObject cb_debug_inference_form(final SubLObject v_object, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cb_form(v_object, add(TWO_INTEGER, integerDivide(multiply(depth, $cb_debug_indent_quantum$.getDynamicValue(thread)), TWO_INTEGER)), T);
    }

    public static SubLObject declare_cb_inference_debugger_file() {
        declareMacro("html_inference_debug_page", "HTML-INFERENCE-DEBUG-PAGE");
        declareMacro("with_debug_inference_indentation_and_recursion_handling", "WITH-DEBUG-INFERENCE-INDENTATION-AND-RECURSION-HANDLING");
        declareFunction("cb_link_debug_inference", "CB-LINK-DEBUG-INFERENCE", 1, 2, false);
        declareFunction("cb_debug_inference_handler", "CB-DEBUG-INFERENCE-HANDLER", 1, 0, false);
        declareFunction("cb_link_debug_problem", "CB-LINK-DEBUG-PROBLEM", 2, 2, false);
        declareFunction("cb_debug_problem_handler", "CB-DEBUG-PROBLEM-HANDLER", 1, 0, false);
        declareFunction("cb_link_debug_problem_link", "CB-LINK-DEBUG-PROBLEM-LINK", 2, 2, false);
        declareFunction("cb_debug_problem_link_handler", "CB-DEBUG-PROBLEM-LINK-HANDLER", 1, 0, false);
        declareFunction("cb_debug_handler_link", "CB-DEBUG-HANDLER-LINK", 6, 0, false);
        declareFunction("cb_debug_link", "CB-DEBUG-LINK", 4, 0, false);
        declareFunction("cb_lookup_options_by_glob_string", "CB-LOOKUP-OPTIONS-BY-GLOB-STRING", 1, 0, false);
        declareFunction("cb_debug_option_p", "CB-DEBUG-OPTION-P", 1, 0, false);
        declareFunction("cb_debug_option_default", "CB-DEBUG-OPTION-DEFAULT", 1, 0, false);
        declareFunction("cb_debug_option_value", "CB-DEBUG-OPTION-VALUE", 2, 0, false);
        declareFunction("cb_show_inference_debugger_option_tweaking_links", "CB-SHOW-INFERENCE-DEBUGGER-OPTION-TWEAKING-LINKS", 3, 0, false);
        declareFunction("cb_show_ancestor_depth_tweaking_links", "CB-SHOW-ANCESTOR-DEPTH-TWEAKING-LINKS", 3, 0, false);
        declareFunction("cb_show_option_tweaking_links", "CB-SHOW-OPTION-TWEAKING-LINKS", 6, 0, false);
        declareFunction("cb_show_option_tweaking_link", "CB-SHOW-OPTION-TWEAKING-LINK", 6, 0, false);
        declareFunction("cb_debug_inference", "CB-DEBUG-INFERENCE", 2, 0, false);
        declareFunction("cb_debug_problem", "CB-DEBUG-PROBLEM", 3, 0, false);
        declareFunction("cb_debug_problem_link", "CB-DEBUG-PROBLEM-LINK", 3, 0, false);
        declareFunction("cb_debug_ancestors", "CB-DEBUG-ANCESTORS", 5, 0, false);
        declareFunction("cb_debug_compute_ancestor_layers", "CB-DEBUG-COMPUTE-ANCESTOR-LAYERS", 2, 0, false);
        declareFunction("cb_debug_add_children_and_links_to_set", "CB-DEBUG-ADD-CHILDREN-AND-LINKS-TO-SET", 2, 0, false);
        declareFunction("cb_debug_problem_int", "CB-DEBUG-PROBLEM-INT", 5, 0, false);
        declareFunction("cb_debug_problem_parametrized", "CB-DEBUG-PROBLEM-PARAMETRIZED", 8, 0, false);
        declareFunction("cb_show_problem_link_for_debuggingP", "CB-SHOW-PROBLEM-LINK-FOR-DEBUGGING?", 3, 0, false);
        declareFunction("cb_debug_problem_link_int", "CB-DEBUG-PROBLEM-LINK-INT", 5, 0, false);
        declareFunction("cb_debug_join_ordered_link_guts", "CB-DEBUG-JOIN-ORDERED-LINK-GUTS", 5, 0, false);
        declareFunction("cb_debug_add_node_to_tree", "CB-DEBUG-ADD-NODE-TO-TREE", 2, 0, false);
        declareFunction("cb_debug_sort_argument_links", "CB-DEBUG-SORT-ARGUMENT-LINKS", 1, 0, false);
        declareFunction("cb_debug_argument_link_L", "CB-DEBUG-ARGUMENT-LINK-<", 2, 0, false);
        declareFunction("problem_link_suid_L", "PROBLEM-LINK-SUID-<", 2, 0, false);
        declareFunction("good_problem_link_p", "GOOD-PROBLEM-LINK-P", 1, 0, false);
        declareFunction("cb_debug_sort_supporting_problems", "CB-DEBUG-SORT-SUPPORTING-PROBLEMS", 1, 0, false);
        declareFunction("cb_debug_supporting_problem_L", "CB-DEBUG-SUPPORTING-PROBLEM-<", 2, 0, false);
        declareFunction("problem_suid_L", "PROBLEM-SUID-<", 2, 0, false);
        declareFunction("cb_debug_display_tree", "CB-DEBUG-DISPLAY-TREE", 3, 0, false);
        declareFunction("cb_debug_display_tree_children", "CB-DEBUG-DISPLAY-TREE-CHILDREN", 5, 0, false);
        declareFunction("cb_debug_display_tree_children_int", "CB-DEBUG-DISPLAY-TREE-CHILDREN-INT", 4, 0, false);
        declareFunction("cb_debug_display_tree_int", "CB-DEBUG-DISPLAY-TREE-INT", 3, 0, false);
        declareFunction("cb_debug_next_object_id_string", "CB-DEBUG-NEXT-OBJECT-ID-STRING", 0, 0, false);
        declareFunction("cb_debug_indent_the_right_amount", "CB-DEBUG-INDENT-THE-RIGHT-AMOUNT", 1, 0, false);
        declareFunction("cb_debug_inference_form", "CB-DEBUG-INFERENCE-FORM", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_inference_debugger_file_alt() {
        defvar("*CB-DEBUG-ICON*", $RED_DIAMOND);
        defvar("*CB-DEBUG-INDENT-QUANTUM*", FOUR_INTEGER);
        defparameter("*CB-DEBUG-DEPTH*", $UNINITIALIZED);
        defparameter("*CB-DEBUG-DUPLICATE-TREE*", $UNINITIALIZED);
        defparameter("*CB-DEBUG-TREE*", $UNINITIALIZED);
        defvar("*CB-CURRENT-DEBUG-OPTIONS*", NIL);
        deflexical("*CB-DEBUG-OPTIONS*", $list_alt54);
        deflexical("*CB-SHOW-HIDE-VALUE-LINKTEXT-PAIRS*", $list_alt55);
        deflexical("*CB-DEBUG-MAX-DEPTH*", $int$212);
        defparameter("*CB-DEBUG-NEXT-OBJECT-ID*", $UNINITIALIZED);
        return NIL;
    }

    public static SubLObject init_cb_inference_debugger_file() {
        if (SubLFiles.USE_V1) {
            defvar("*CB-DEBUG-ICON*", $RED_DIAMOND);
            defvar("*CB-DEBUG-INDENT-QUANTUM*", FOUR_INTEGER);
            defparameter("*CB-DEBUG-DEPTH*", $UNINITIALIZED);
            defparameter("*CB-DEBUG-DUPLICATE-TREE*", $UNINITIALIZED);
            defparameter("*CB-DEBUG-TREE*", $UNINITIALIZED);
            defvar("*CB-CURRENT-DEBUG-OPTIONS*", NIL);
            deflexical("*CB-DEBUG-OPTIONS*", $list58);
            deflexical("*CB-SHOW-HIDE-VALUE-LINKTEXT-PAIRS*", $list59);
            deflexical("*CB-DEBUG-MAX-DEPTH*", $int$212);
            defparameter("*CB-DEBUG-NEXT-OBJECT-ID*", $UNINITIALIZED);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*CB-DEBUG-OPTIONS*", $list_alt54);
            deflexical("*CB-SHOW-HIDE-VALUE-LINKTEXT-PAIRS*", $list_alt55);
        }
        return NIL;
    }

    public static SubLObject init_cb_inference_debugger_file_Previous() {
        defvar("*CB-DEBUG-ICON*", $RED_DIAMOND);
        defvar("*CB-DEBUG-INDENT-QUANTUM*", FOUR_INTEGER);
        defparameter("*CB-DEBUG-DEPTH*", $UNINITIALIZED);
        defparameter("*CB-DEBUG-DUPLICATE-TREE*", $UNINITIALIZED);
        defparameter("*CB-DEBUG-TREE*", $UNINITIALIZED);
        defvar("*CB-CURRENT-DEBUG-OPTIONS*", NIL);
        deflexical("*CB-DEBUG-OPTIONS*", $list58);
        deflexical("*CB-SHOW-HIDE-VALUE-LINKTEXT-PAIRS*", $list59);
        deflexical("*CB-DEBUG-MAX-DEPTH*", $int$212);
        defparameter("*CB-DEBUG-NEXT-OBJECT-ID*", $UNINITIALIZED);
        return NIL;
    }

    public static final SubLObject setup_cb_inference_debugger_file_alt() {
        register_html_state_variable($cb_debug_icon$);
        register_html_state_variable($cb_debug_indent_quantum$);
        register_html_state_variable($cb_current_debug_options$);
        setup_cb_link_method($DEBUG_INFERENCE, CB_LINK_DEBUG_INFERENCE, THREE_INTEGER);
        html_macros.note_html_handler_function(CB_DEBUG_INFERENCE_HANDLER);
        setup_cb_link_method($DEBUG_PROBLEM, CB_LINK_DEBUG_PROBLEM, FOUR_INTEGER);
        html_macros.note_html_handler_function(CB_DEBUG_PROBLEM_HANDLER);
        setup_cb_link_method($DEBUG_PROBLEM_LINK, CB_LINK_DEBUG_PROBLEM_LINK, FOUR_INTEGER);
        html_macros.note_html_handler_function(CB_DEBUG_PROBLEM_LINK_HANDLER);
        return NIL;
    }

    public static SubLObject setup_cb_inference_debugger_file() {
        if (SubLFiles.USE_V1) {
            register_html_state_variable($cb_debug_icon$);
            register_html_state_variable($cb_debug_indent_quantum$);
            register_html_state_variable($cb_current_debug_options$);
            setup_cb_link_method($DEBUG_INFERENCE, CB_LINK_DEBUG_INFERENCE, THREE_INTEGER);
            html_macros.note_cgi_handler_function(CB_DEBUG_INFERENCE_HANDLER, $HTML_HANDLER);
            setup_cb_link_method($DEBUG_PROBLEM, CB_LINK_DEBUG_PROBLEM, FOUR_INTEGER);
            html_macros.note_cgi_handler_function(CB_DEBUG_PROBLEM_HANDLER, $HTML_HANDLER);
            setup_cb_link_method($DEBUG_PROBLEM_LINK, CB_LINK_DEBUG_PROBLEM_LINK, FOUR_INTEGER);
            html_macros.note_cgi_handler_function(CB_DEBUG_PROBLEM_LINK_HANDLER, $HTML_HANDLER);
        }
        if (SubLFiles.USE_V2) {
            html_macros.note_html_handler_function(CB_DEBUG_INFERENCE_HANDLER);
            html_macros.note_html_handler_function(CB_DEBUG_PROBLEM_HANDLER);
            html_macros.note_html_handler_function(CB_DEBUG_PROBLEM_LINK_HANDLER);
        }
        return NIL;
    }

    public static SubLObject setup_cb_inference_debugger_file_Previous() {
        register_html_state_variable($cb_debug_icon$);
        register_html_state_variable($cb_debug_indent_quantum$);
        register_html_state_variable($cb_current_debug_options$);
        setup_cb_link_method($DEBUG_INFERENCE, CB_LINK_DEBUG_INFERENCE, THREE_INTEGER);
        html_macros.note_cgi_handler_function(CB_DEBUG_INFERENCE_HANDLER, $HTML_HANDLER);
        setup_cb_link_method($DEBUG_PROBLEM, CB_LINK_DEBUG_PROBLEM, FOUR_INTEGER);
        html_macros.note_cgi_handler_function(CB_DEBUG_PROBLEM_HANDLER, $HTML_HANDLER);
        setup_cb_link_method($DEBUG_PROBLEM_LINK, CB_LINK_DEBUG_PROBLEM_LINK, FOUR_INTEGER);
        html_macros.note_cgi_handler_function(CB_DEBUG_PROBLEM_LINK_HANDLER, $HTML_HANDLER);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_inference_debugger_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_inference_debugger_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_inference_debugger_file();
    }

    static {
    }

    static private final SubLList $list_alt5 = list(list(makeSymbol("FOCAL-OBJECT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt7 = list(makeSymbol("CB-HEAD"), list(makeSymbol("DHTML-WITH-DOM-SCRIPT")), list(makeSymbol("DHTML-WITH-TOGGLE-VISIBILITY-SUPPORT")), list(makeSymbol("BASIC-AJAX-SCRIPTS")), list(makeSymbol("DHTML-CREATION-SCRIPTS")));

    static private final SubLList $list_alt9 = list(makeKeyword("SHOW-COPYRIGHT"), NIL);

    static private final SubLList $list_alt11 = list(makeSymbol("HTML-PRINC-STRONG"), makeString("Inference Debugging Tree for "));

    static private final SubLList $list_alt13 = list(list(makeSymbol("*CB-DEBUG-DEPTH*"), ZERO_INTEGER), list(makeSymbol("*CB-DEBUG-TREE*"), NIL), list(makeSymbol("*CB-DEBUG-DUPLICATE-TREE*"), list(makeSymbol("NEW-SET"), list(makeSymbol("FUNCTION"), EQ))));

    static private final SubLString $str_alt14$_Debug_Inference__A__A_ = makeString("[Debug Inference ~A.~A]");

    static private final SubLString $str_alt15$cb_debug_inference_handler = makeString("cb-debug-inference-handler");

    static private final SubLList $list_alt18 = list(makeSymbol("STORE-ID-STRING"), makeSymbol("INFERENCE-ID-STRING"), makeSymbol("OPTIONS-GLOB-ID-STRING"));

    static private final SubLString $str_alt19$_A_did_not_specify_an_inference = makeString("~A did not specify an inference");

    static private final SubLString $str_alt21$_A_did_not_specify_valid_debugger = makeString("~A did not specify valid debugger options");

    static private final SubLString $str_alt22$Inference_Debugging_Tree_for_ = makeString("Inference Debugging Tree for ");

    static private final SubLString $str_alt27$_Debug_Problem__A__A_ = makeString("[Debug Problem ~A.~A]");

    static private final SubLString $str_alt28$_Debug_Problem__A__A_wrt_s_A_ = makeString("[Debug Problem ~A.~A wrt s~A]");

    static private final SubLString $str_alt29$cb_debug_problem_handler = makeString("cb-debug-problem-handler");

    static private final SubLList $list_alt32 = list(makeSymbol("STORE-ID-STRING"), makeSymbol("PROBLEM-ID-STRING"), makeSymbol("STRATEGIC-CONTEXT-ID-STRING"), makeSymbol("OPTIONS-GLOB-ID-STRING"));

    static private final SubLString $str_alt33$_A_did_not_specify_a_problem = makeString("~A did not specify a problem");

    static private final SubLString $str_alt34$_A_did_not_specify_a_strategic_co = makeString("~A did not specify a strategic context");

    static private final SubLString $str_alt36$_wrt_ = makeString(" wrt ");

    static private final SubLString $str_alt39$_Debug_Link__A__A_ = makeString("[Debug Link ~A.~A]");

    static private final SubLString $str_alt40$_Debug_Link__A__A_wrt_s_A_ = makeString("[Debug Link ~A.~A wrt s~A]");

    static private final SubLString $str_alt41$cb_debug_problem_link_handler = makeString("cb-debug-problem-link-handler");

    static private final SubLList $list_alt44 = list(makeSymbol("STORE-ID-STRING"), makeSymbol("LINK-ID-STRING"), makeSymbol("STRATEGIC-CONTEXT-ID-STRING"), makeSymbol("OPTIONS-GLOB-ID-STRING"));

    static private final SubLString $str_alt45$_A_did_not_specify_a_link = makeString("~A did not specify a link");

    static private final SubLString $str_alt50$_A__A__A__A__A = makeString("~A&~A&~A&~A&~A");

    static private final SubLString $str_alt51$_A__A__A__A = makeString("~A&~A&~A&~A");

    static private final SubLString $str_alt53$Unexpected_cb_debug_link_object__ = makeString("Unexpected cb-debug-link object: ~a");

    static private final SubLList $list_alt54 = list(cons(makeKeyword("ANCESTOR-DEPTH"), TWO_INTEGER), cons(makeKeyword("SHOW-SIBLINGS?"), T), cons(makeKeyword("SHOW-AUNTS?"), T), cons(makeKeyword("DEBUG-GOOD-PROBLEMS?"), T), list(makeKeyword("DEBUG-NON-NEW-ROOTS?")), cons(makeKeyword("SHOW-WHICH-QUERIES"), $NONE), cons(makeKeyword("SHOW-RULES?"), T), cons(makeKeyword("DHTML-VISIBILITY"), makeKeyword("VISIBLE")));

    static private final SubLList $list_alt55 = list(list(T, makeString("[Show]")), list(NIL, makeString("[Hide]")));

    public static final SubLSymbol $kw56$SHOW_SIBLINGS_ = makeKeyword("SHOW-SIBLINGS?");

    static private final SubLString $str_alt57$Siblings_ = makeString("Siblings:");

    public static final SubLSymbol $kw58$SHOW_AUNTS_ = makeKeyword("SHOW-AUNTS?");

    static private final SubLString $str_alt59$Aunts_ = makeString("Aunts:");

    public static final SubLSymbol $kw60$DEBUG_NON_NEW_ROOTS_ = makeKeyword("DEBUG-NON-NEW-ROOTS?");

    static private final SubLString $str_alt61$Non_New_Roots_ = makeString("Non-New Roots:");

    public static final SubLSymbol $kw62$DEBUG_GOOD_PROBLEMS_ = makeKeyword("DEBUG-GOOD-PROBLEMS?");

    static private final SubLString $str_alt63$Good_Problems_ = makeString("Good Problems:");

    static private final SubLList $list_alt64 = list(list(T, makeString("[Descend]")), list(NIL, makeString("[Stop]")));

    static private final SubLString $str_alt66$Queries_ = makeString("Queries:");

    static private final SubLList $list_alt67 = list(list(makeKeyword("ALL"), makeString("[All]")), list(makeKeyword("DEAD-END"), makeString("[Dead Ends]")), list($NONE, makeString("[None]")));

    public static final SubLSymbol $kw68$SHOW_RULES_ = makeKeyword("SHOW-RULES?");

    static private final SubLString $str_alt69$Rules_ = makeString("Rules:");

    static private final SubLString $str_alt73$_ = makeString(":");

    static private final SubLList $list_alt76 = list(list(makeKeyword("VISIBLE"), makeString("[Open All]")), list(makeKeyword("INVISIBLE"), makeString("[Close All]")), list($NONE, makeString("[Turn Off]")));

    static private final SubLString $str_alt77$Ancestor_Depth_ = makeString("Ancestor Depth:");

    static private final SubLString $str_alt78$_ = makeString("[");

    static private final SubLString $str_alt79$_ = makeString("]");

    static private final SubLList $list_alt81 = list(makeInteger(212), TEN_INTEGER, THREE_INTEGER, TWO_INTEGER, ONE_INTEGER, ZERO_INTEGER);

    static private final SubLList $list_alt82 = list(makeSymbol("VALUE"), makeSymbol("LINKTEXT"));

    static private final SubLSymbol $sym92$CB_DEBUG_ARGUMENT_LINK__ = makeSymbol("CB-DEBUG-ARGUMENT-LINK-<");

    static private final SubLSymbol $sym93$CB_DEBUG_SUPPORTING_PROBLEM__ = makeSymbol("CB-DEBUG-SUPPORTING-PROBLEM-<");

    static private final SubLList $list_alt99 = listS(makeSymbol("NODE-TYPE"), makeSymbol("DEPTH"), makeSymbol("DATA"));

    static private final SubLString $str_alt101$___ = makeString("...");

    static private final SubLList $list_alt102 = list(makeSymbol("OBJECT"), makeSymbol("IS-FOCAL-OBJECT?"), makeSymbol("QUERY-OR-RULE"));
}

/**
 * Total time: 412 ms
 */
