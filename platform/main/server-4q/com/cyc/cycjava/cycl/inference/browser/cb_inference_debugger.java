package com.cyc.cycjava.cycl.inference.browser;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.harness.balancing_tactician;
import com.cyc.cycjava.cycl.inference.harness.inference_czer;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class cb_inference_debugger extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "394517dbd1c887a7bc290f34af643b0da73ba152e06e768c343e0fe886e2cea4";
    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 1500L)
    public static SubLSymbol $cb_debug_icon$;
    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 3300L)
    public static SubLSymbol $cb_debug_indent_quantum$;
    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 3300L)
    private static SubLSymbol $cb_debug_depth$;
    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 3400L)
    private static SubLSymbol $cb_debug_duplicate_tree$;
    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 3500L)
    private static SubLSymbol $cb_debug_tree$;
    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 3600L)
    public static SubLSymbol $cb_current_debug_options$;
    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 10900L)
    private static SubLSymbol $cb_debug_options$;
    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 12700L)
    private static SubLSymbol $cb_show_hide_value_linktext_pairs$;
    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 27500L)
    private static SubLSymbol $cb_debug_max_depth$;
    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 27600L)
    private static SubLSymbol $cb_debug_next_object_id$;
    private static SubLSymbol $RED_DIAMOND;
    private static SubLSymbol $sym1$_CB_DEBUG_ICON_;
    private static SubLSymbol $sym2$_CB_DEBUG_INDENT_QUANTUM_;
    private static SubLSymbol $UNINITIALIZED;
    private static SubLSymbol $sym4$_CB_CURRENT_DEBUG_OPTIONS_;
    private static SubLList $list5;
    private static SubLSymbol $sym6$HTML_DOCUMENT;
    private static SubLList $list7;
    private static SubLSymbol $sym8$HTML_FANCY_BODY;
    private static SubLList $list9;
    private static SubLSymbol $sym10$CB_SHOW_RELEVANT_INFERENCE_DEBUGGING_LINKS;
    private static SubLList $list11;
    private static SubLSymbol $sym12$CLET;
    private static SubLList $list13;
    private static SubLString $str14$_Debug_Inference__A__A_;
    private static SubLString $str15$cb_debug_inference_handler;
    private static SubLSymbol $DEBUG_INFERENCE;
    private static SubLSymbol $sym17$CB_LINK_DEBUG_INFERENCE;
    private static SubLList $list18;
    private static SubLString $str19$_A_did_not_specify_an_inference;
    private static SubLSymbol $sym20$CB_DEBUG_OPTION_P;
    private static SubLString $str21$_A_did_not_specify_valid_debugger;
    private static SubLString $str22$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static SubLString $str23$_meta_http_equiv__X_UA_Compatible;
    private static SubLSymbol $CB_CYC;
    private static SubLString $str25$Inference_Debugging_Tree_for_;
    private static SubLSymbol $INFERENCE;
    private static SubLSymbol $VERY_VERBOSE;
    private static SubLSymbol $sym28$CB_DEBUG_INFERENCE_HANDLER;
    private static SubLSymbol $HTML_HANDLER;
    private static SubLSymbol $TACTICAL;
    private static SubLString $str31$_Debug_Problem__A__A_;
    private static SubLString $str32$_Debug_Problem__A__A_wrt_s_A_;
    private static SubLString $str33$cb_debug_problem_handler;
    private static SubLSymbol $DEBUG_PROBLEM;
    private static SubLSymbol $sym35$CB_LINK_DEBUG_PROBLEM;
    private static SubLList $list36;
    private static SubLString $str37$_A_did_not_specify_a_problem;
    private static SubLString $str38$_A_did_not_specify_a_strategic_co;
    private static SubLSymbol $PROBLEM;
    private static SubLString $str40$_wrt_;
    private static SubLSymbol $STRATEGY;
    private static SubLSymbol $sym42$CB_DEBUG_PROBLEM_HANDLER;
    private static SubLString $str43$_Debug_Link__A__A_;
    private static SubLString $str44$_Debug_Link__A__A_wrt_s_A_;
    private static SubLString $str45$cb_debug_problem_link_handler;
    private static SubLSymbol $DEBUG_PROBLEM_LINK;
    private static SubLSymbol $sym47$CB_LINK_DEBUG_PROBLEM_LINK;
    private static SubLList $list48;
    private static SubLString $str49$_A_did_not_specify_a_link;
    private static SubLSymbol $PROBLEM_LINK;
    private static SubLSymbol $VERBOSE;
    private static SubLSymbol $sym52$CB_DEBUG_PROBLEM_LINK_HANDLER;
    private static SubLSymbol $SELF;
    private static SubLString $str54$_A__A__A__A__A;
    private static SubLString $str55$_A__A__A__A;
    private static SubLSymbol $TOP;
    private static SubLString $str57$Unexpected_cb_debug_link_object__;
    private static SubLList $list58;
    private static SubLList $list59;
    private static SubLSymbol $SHOW_SIBLINGS_;
    private static SubLString $str61$Siblings_;
    private static SubLSymbol $SHOW_AUNTS_;
    private static SubLString $str63$Aunts_;
    private static SubLSymbol $DEBUG_NON_NEW_ROOTS_;
    private static SubLString $str65$Non_New_Roots_;
    private static SubLSymbol $DEBUG_GOOD_PROBLEMS_;
    private static SubLString $str67$Good_Problems_;
    private static SubLList $list68;
    private static SubLSymbol $SHOW_WHICH_QUERIES;
    private static SubLString $str70$Queries_;
    private static SubLList $list71;
    private static SubLSymbol $SHOW_RULES_;
    private static SubLString $str73$Rules_;
    private static SubLSymbol $SQUARE_PLUS;
    private static SubLSymbol $CENTER;
    private static SubLSymbol $SQUARE_MINUS;
    private static SubLString $str77$_;
    private static SubLSymbol $DHTML_VISIBILITY;
    private static SubLString $str79$;
    private static SubLList $list80;
    private static SubLString $str81$Ancestor_Depth_;
    private static SubLString $str82$_;
    private static SubLString $str83$_;
    private static SubLSymbol $ANCESTOR_DEPTH;
    private static SubLList $list85;
    private static SubLList $list86;
    private static SubLSymbol $sym87$PROPERTY_LIST_P;
    private static SubLSymbol $GOOD;
    private static SubLSymbol $NEUTRAL;
    private static SubLSymbol $NO_GOOD;
    private static SubLSymbol $ALL;
    private static SubLSymbol $DEAD_END;
    private static SubLSymbol $ELLIPSIS;
    private static SubLSymbol $RESTRICTION;
    private static SubLSymbol $sym95$KEYWORDP;
    private static SubLSymbol $sym96$CB_DEBUG_ARGUMENT_LINK__;
    private static SubLSymbol $sym97$CB_DEBUG_SUPPORTING_PROBLEM__;
    private static SubLInteger $int$212;
    private static SubLString $str99$root;
    private static SubLSymbol $VISIBLE;
    private static SubLSymbol $NONE;
    private static SubLSymbol $TEXT;
    private static SubLList $list103;
    private static SubLSymbol $SQUARE_BLANK;
    private static SubLString $str105$___;
    private static SubLList $list106;
    private static SubLSymbol $BLANK_TRIANGLE;
    private static SubLString $str108$cbd;

    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 3600L)
    public static SubLObject html_inference_debug_page(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list5);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject focal_object = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list5);
        focal_object = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject body;
            current = (body = temp);
            return list($sym6$HTML_DOCUMENT, $list7, listS($sym8$HTML_FANCY_BODY, $list9, list($sym10$CB_SHOW_RELEVANT_INFERENCE_DEBUGGING_LINKS, focal_object), $list11, append(body, NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list5);
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 4100L)
    public static SubLObject with_debug_inference_indentation_and_recursion_handling(SubLObject macroform, SubLObject environment) {
        SubLObject datum = macroform.rest();
        SubLObject body;
        SubLObject current = body = datum;
        return listS($sym12$CLET, $list13, append(body, NIL));
    }

    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 4300L)
    public static SubLObject cb_link_debug_inference(SubLObject inference, SubLObject linktext, SubLObject options) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (options == UNPROVIDED) {
            options = NIL;
        }
        SubLObject inference_id = inference_datastructures_inference.inference_suid(inference);
        SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
        SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(store);
        if (NIL == linktext) {
            linktext = PrintLow.format(NIL, $str14$_Debug_Inference__A__A_, store_id, inference_id);
        }
        SubLObject options_glob_id = cb_parameters.cb_glob_id(options);
        cb_debug_handler_link($str15$cb_debug_inference_handler, linktext, store_id, inference_id, NIL, options_glob_id);
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 4900L)
    public static SubLObject cb_debug_inference_handler(SubLObject args) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject store_id_string = NIL;
        SubLObject inference_id_string = NIL;
        SubLObject options_glob_id_string = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, $list18);
        store_id_string = args.first();
        SubLObject current = args.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, args, $list18);
        inference_id_string = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, args, $list18);
        options_glob_id_string = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject inference = cb_query.cb_guess_inference(store_id_string, inference_id_string);
            SubLObject options = cb_lookup_options_by_glob_string(options_glob_id_string);
            if (NIL == inference_datastructures_inference.inference_p(inference)) {
                return cb_utilities.cb_error($str19$_A_did_not_specify_an_inference, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL == list_utilities.plist_of_type_p(options, $sym20$CB_DEBUG_OPTION_P)) {
                return cb_utilities.cb_error($str21$_A_did_not_specify_valid_debugger, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            html_utilities.html_markup($str22$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup($str23$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED) ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                dhtml_macros.dhtml_with_dom_script();
                dhtml_macros.dhtml_with_toggle_visibility_support();
                dhtml_macros.basic_ajax_scripts();
                dhtml_macros.dhtml_creation_scripts();
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                SubLObject _prev_bind_0_$1 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_inference_browser.cb_show_relevant_inference_debugging_links(inference);
                        html_utilities.html_princ_strong($str25$Inference_Debugging_Tree_for_);
                        cb_utilities.cb_link($INFERENCE, inference, $VERY_VERBOSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        cb_show_inference_debugger_option_tweaking_links(inference, inference_datastructures_inference.simplest_inference_strategy(inference), options);
                        html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                        cb_debug_inference(inference, options);
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$2, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$1, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_source_readability_terpri(UNPROVIDED);
        } else {
            cdestructuring_bind.cdestructuring_bind_error(args, $list18);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 5700L)
    public static SubLObject cb_link_debug_problem(SubLObject problem, SubLObject strategic_context, SubLObject linktext, SubLObject options) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (options == UNPROVIDED) {
            options = NIL;
        }
        SubLObject problem_id = inference_datastructures_problem.problem_suid(problem);
        SubLObject strategic_context_id = inference_worker.strategic_context_suid(strategic_context);
        SubLObject store = inference_datastructures_problem.problem_store(problem);
        SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(store);
        if (NIL == linktext) {
            if ($TACTICAL == strategic_context) {
                linktext = PrintLow.format(NIL, $str31$_Debug_Problem__A__A_, store_id, problem_id);
            } else {
                linktext = PrintLow.format(NIL, $str32$_Debug_Problem__A__A_wrt_s_A_, new SubLObject[] { store_id, problem_id, strategic_context_id });
            }
        }
        SubLObject options_glob_id = cb_parameters.cb_glob_id(options);
        cb_debug_handler_link($str33$cb_debug_problem_handler, linktext, store_id, problem_id, strategic_context_id, options_glob_id);
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 6500L)
    public static SubLObject cb_debug_problem_handler(SubLObject args) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject store_id_string = NIL;
        SubLObject problem_id_string = NIL;
        SubLObject strategic_context_id_string = NIL;
        SubLObject options_glob_id_string = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, $list36);
        store_id_string = args.first();
        SubLObject current = args.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, args, $list36);
        problem_id_string = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, args, $list36);
        strategic_context_id_string = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, args, $list36);
        options_glob_id_string = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject problem = cb_inference_browser.cb_guess_problem(store_id_string, problem_id_string);
            SubLObject strategic_context = cb_inference_browser.cb_guess_strategic_context(store_id_string, strategic_context_id_string);
            SubLObject options = cb_lookup_options_by_glob_string(options_glob_id_string);
            if (NIL == inference_datastructures_problem.problem_p(problem)) {
                return cb_utilities.cb_error($str37$_A_did_not_specify_a_problem, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL == inference_worker.strategic_context_p(strategic_context)) {
                return cb_utilities.cb_error($str38$_A_did_not_specify_a_strategic_co, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL == list_utilities.plist_of_type_p(options, $sym20$CB_DEBUG_OPTION_P)) {
                return cb_utilities.cb_error($str21$_A_did_not_specify_valid_debugger, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            html_utilities.html_markup($str22$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup($str23$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED) ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                dhtml_macros.dhtml_with_dom_script();
                dhtml_macros.dhtml_with_toggle_visibility_support();
                dhtml_macros.basic_ajax_scripts();
                dhtml_macros.dhtml_creation_scripts();
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                SubLObject _prev_bind_0_$3 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_inference_browser.cb_show_relevant_inference_debugging_links(problem);
                        html_utilities.html_princ_strong($str25$Inference_Debugging_Tree_for_);
                        cb_utilities.cb_link($PROBLEM, problem, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
                            html_utilities.html_princ($str40$_wrt_);
                            cb_utilities.cb_link($STRATEGY, strategic_context, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        cb_show_inference_debugger_option_tweaking_links(problem, strategic_context, options);
                        html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                        cb_debug_problem(problem, strategic_context, options);
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$3, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_source_readability_terpri(UNPROVIDED);
        } else {
            cdestructuring_bind.cdestructuring_bind_error(args, $list36);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 7600L)
    public static SubLObject cb_link_debug_problem_link(SubLObject link, SubLObject strategic_context, SubLObject linktext, SubLObject options) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (options == UNPROVIDED) {
            options = NIL;
        }
        SubLObject link_id = inference_datastructures_problem_link.problem_link_suid(link);
        SubLObject strategic_context_id = inference_worker.strategic_context_suid(strategic_context);
        SubLObject store = inference_datastructures_problem_link.problem_link_store(link);
        SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(store);
        if (NIL == linktext) {
            if (strategic_context == $TACTICAL) {
                linktext = PrintLow.format(NIL, $str43$_Debug_Link__A__A_, store_id, link_id);
            } else {
                linktext = PrintLow.format(NIL, $str44$_Debug_Link__A__A_wrt_s_A_, new SubLObject[] { store_id, link_id, strategic_context_id });
            }
        }
        SubLObject options_glob_id = cb_parameters.cb_glob_id(options);
        cb_debug_handler_link($str45$cb_debug_problem_link_handler, linktext, store_id, link_id, strategic_context_id, options_glob_id);
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 8500L)
    public static SubLObject cb_debug_problem_link_handler(SubLObject args) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject store_id_string = NIL;
        SubLObject link_id_string = NIL;
        SubLObject strategic_context_id_string = NIL;
        SubLObject options_glob_id_string = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, $list48);
        store_id_string = args.first();
        SubLObject current = args.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, args, $list48);
        link_id_string = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, args, $list48);
        strategic_context_id_string = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, args, $list48);
        options_glob_id_string = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject link = cb_inference_browser.cb_guess_problem_link(store_id_string, link_id_string);
            SubLObject strategic_context = cb_inference_browser.cb_guess_strategic_context(store_id_string, strategic_context_id_string);
            SubLObject options = cb_lookup_options_by_glob_string(options_glob_id_string);
            if (NIL == inference_datastructures_problem_link.problem_link_p(link)) {
                return cb_utilities.cb_error($str49$_A_did_not_specify_a_link, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL == inference_worker.strategic_context_p(strategic_context)) {
                return cb_utilities.cb_error($str38$_A_did_not_specify_a_strategic_co, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL == list_utilities.plist_of_type_p(options, $sym20$CB_DEBUG_OPTION_P)) {
                return cb_utilities.cb_error($str21$_A_did_not_specify_valid_debugger, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            html_utilities.html_markup($str22$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                html_utilities.html_markup($str23$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED) ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                dhtml_macros.dhtml_with_dom_script();
                dhtml_macros.dhtml_with_toggle_visibility_support();
                dhtml_macros.basic_ajax_scripts();
                dhtml_macros.dhtml_creation_scripts();
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri(UNPROVIDED);
                SubLObject _prev_bind_0_$5 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_inference_browser.cb_show_relevant_inference_debugging_links(link);
                        html_utilities.html_princ_strong($str25$Inference_Debugging_Tree_for_);
                        cb_utilities.cb_link($PROBLEM_LINK, link, $VERBOSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
                            html_utilities.html_princ($str40$_wrt_);
                            cb_utilities.cb_link($STRATEGY, strategic_context, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        cb_show_inference_debugger_option_tweaking_links(link, strategic_context, options);
                        html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
                        cb_debug_problem_link(link, strategic_context, options);
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$5, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_source_readability_terpri(UNPROVIDED);
        } else {
            cdestructuring_bind.cdestructuring_bind_error(args, $list48);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 9600L)
    public static SubLObject cb_debug_handler_link(SubLObject handler_string, SubLObject linktext, SubLObject store_id, SubLObject object_id, SubLObject strategic_context_id, SubLObject options_glob_id) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        if (NIL != strategic_context_id) {
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str54$_A__A__A__A__A, new SubLObject[] { handler_string, store_id, object_id, strategic_context_id, options_glob_id });
        } else {
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), $str55$_A__A__A__A, new SubLObject[] { handler_string, store_id, object_id, options_glob_id });
        }
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        }
        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            if (linktext.isKeyword()) {
                SubLObject image_src = cyc_file_dependencies.cb_icon_file_path(linktext);
                SubLObject align = $TOP;
                SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string(linktext);
                SubLObject border = ZERO_INTEGER;
                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(image_src);
                html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                if (NIL != alt) {
                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(alt);
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                }
                if (NIL != align) {
                    html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align(align));
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                }
                if (NIL != border) {
                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(border);
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                }
                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
            } else {
                html_utilities.html_princ(linktext);
            }
            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 10100L)
    public static SubLObject cb_debug_link(SubLObject v_object, SubLObject strategic_context, SubLObject linktext, SubLObject options) {
        SubLObject keyword = NIL;
        if (NIL != inference_datastructures_problem.problem_p(v_object)) {
            keyword = $DEBUG_PROBLEM;
        } else if (NIL != inference_datastructures_problem_link.problem_link_p(v_object)) {
            keyword = $DEBUG_PROBLEM_LINK;
        } else if (NIL != inference_datastructures_inference.inference_p(v_object)) {
            keyword = $DEBUG_INFERENCE;
        } else {
            Errors.error($str57$Unexpected_cb_debug_link_object__, v_object);
        }
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
        cb_utilities.cb_link(keyword, v_object, arg2, arg3, arg4, arg5);
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 10700L)
    public static SubLObject cb_lookup_options_by_glob_string(SubLObject string) {
        SubLObject options = cb_parameters.cb_glob_lookup_by_string(string);
        $cb_current_debug_options$.setDynamicValue(options);
        return options;
    }

    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 12300L)
    public static SubLObject cb_debug_option_p(SubLObject v_object) {
        return list_utilities.alist_has_keyP($cb_debug_options$.getGlobalValue(), v_object, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 12400L)
    public static SubLObject cb_debug_option_default(SubLObject option) {
        assert NIL != cb_debug_option_p(option) : option;
        return list_utilities.alist_lookup_without_values($cb_debug_options$.getGlobalValue(), option, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 12500L)
    public static SubLObject cb_debug_option_value(SubLObject option, SubLObject options) {
        assert NIL != cb_debug_option_p(option) : option;
        return list_utilities.plist_lookup(options, option, cb_debug_option_default(option));
    }

    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 12800L)
    public static SubLObject cb_show_inference_debugger_option_tweaking_links(SubLObject v_object, SubLObject strategic_context, SubLObject options) {
        SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_newline(UNPROVIDED);
        if (NIL == inference_datastructures_inference.inference_p(v_object)) {
            cb_show_ancestor_depth_tweaking_links(v_object, strategic_context, options);
            html_utilities.html_indent(TWO_INTEGER);
            cb_show_option_tweaking_links(v_object, strategic_context, options, $SHOW_SIBLINGS_, $str61$Siblings_, $cb_show_hide_value_linktext_pairs$.getGlobalValue());
            html_utilities.html_indent(TWO_INTEGER);
            cb_show_option_tweaking_links(v_object, strategic_context, options, $SHOW_AUNTS_, $str63$Aunts_, $cb_show_hide_value_linktext_pairs$.getGlobalValue());
            html_utilities.html_indent(TWO_INTEGER);
        }
        cb_show_option_tweaking_links(v_object, strategic_context, options, $DEBUG_NON_NEW_ROOTS_, $str65$Non_New_Roots_, $cb_show_hide_value_linktext_pairs$.getGlobalValue());
        html_utilities.html_indent(TWO_INTEGER);
        cb_show_option_tweaking_links(v_object, strategic_context, options, $DEBUG_GOOD_PROBLEMS_, $str67$Good_Problems_, $list68);
        html_utilities.html_indent(TWO_INTEGER);
        cb_show_option_tweaking_links(v_object, strategic_context, options, $SHOW_WHICH_QUERIES, $str70$Queries_, $list71);
        html_utilities.html_indent(TWO_INTEGER);
        cb_show_option_tweaking_links(v_object, strategic_context, options, $SHOW_RULES_, $str73$Rules_, $cb_show_hide_value_linktext_pairs$.getGlobalValue());
        html_utilities.html_indent(TWO_INTEGER);
        SubLObject image_src = Sequences.cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src($SQUARE_PLUS));
        SubLObject align = $TOP;
        SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string($SQUARE_PLUS);
        SubLObject border = ZERO_INTEGER;
        html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        html_utilities.html_markup(image_src);
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        if (NIL != alt) {
            html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(alt);
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        }
        if (NIL != align) {
            html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(html_utilities.html_align(align));
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        }
        if (NIL != border) {
            html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(border);
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        }
        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
        image_src = Sequences.cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src($SQUARE_MINUS));
        align = $TOP;
        alt = cyc_file_dependencies.get_html_icon_alt_string($SQUARE_MINUS);
        border = ZERO_INTEGER;
        html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        html_utilities.html_markup(image_src);
        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        if (NIL != alt) {
            html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(alt);
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        }
        if (NIL != align) {
            html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(html_utilities.html_align(align));
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        }
        if (NIL != border) {
            html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            html_utilities.html_markup(border);
            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
        }
        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
        html_utilities.html_princ($str77$_);
        cb_show_option_tweaking_links(v_object, strategic_context, options, $DHTML_VISIBILITY, $str79$, $list80);
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 14300L)
    public static SubLObject cb_show_ancestor_depth_tweaking_links(SubLObject v_object, SubLObject strategic_context, SubLObject options) {
        html_utilities.html_princ($str81$Ancestor_Depth_);
        SubLObject cdolist_list_var = $list85;
        SubLObject depth = NIL;
        depth = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject linktext = Sequences.cconcatenate($str82$_, new SubLObject[] { format_nil.format_nil_a_no_copy(depth), $str83$_ });
            cb_show_option_tweaking_link(v_object, strategic_context, options, $ANCESTOR_DEPTH, depth, linktext);
            cdolist_list_var = cdolist_list_var.rest();
            depth = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 14600L)
    public static SubLObject cb_show_option_tweaking_links(SubLObject v_object, SubLObject strategic_context, SubLObject options, SubLObject option, SubLObject label, SubLObject value_linktext_pairs) {
        html_utilities.html_princ(label);
        SubLObject cdolist_list_var = value_linktext_pairs;
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            SubLObject datum = current = pair;
            SubLObject value = NIL;
            SubLObject linktext = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list86);
            value = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list86);
            linktext = current.first();
            current = current.rest();
            if (NIL == current) {
                html_utilities.html_indent(UNPROVIDED);
                cb_show_option_tweaking_link(v_object, strategic_context, options, option, value, linktext);
            } else {
                cdestructuring_bind.cdestructuring_bind_error(datum, $list86);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 15000L)
    public static SubLObject cb_show_option_tweaking_link(SubLObject v_object, SubLObject strategic_context, SubLObject options, SubLObject option, SubLObject value, SubLObject linktext) {
        SubLObject current_value = cb_debug_option_value(option, options);
        SubLObject sameP = Equality.eq(value, current_value);
        SubLObject new_options = (NIL != sameP) ? options : conses_high.copy_list(options);
        if (NIL == sameP) {
            new_options = conses_high.putf(new_options, option, value);
        }
        SubLObject strong_var = sameP;
        SubLObject head = (NIL != strong_var) ? html_macros.$html_strong_head$.getGlobalValue() : string_utilities.$empty_string$.getGlobalValue();
        SubLObject tail = (NIL != strong_var) ? html_macros.$html_strong_tail$.getGlobalValue() : string_utilities.$empty_string$.getGlobalValue();
        html_utilities.html_markup(head);
        cb_debug_link(v_object, strategic_context, linktext, new_options);
        html_utilities.html_markup(tail);
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 15400L)
    public static SubLObject cb_debug_inference(SubLObject inference, SubLObject options) {
        assert NIL != list_utilities.property_list_p(options) : options;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = options; NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            assert NIL != cb_debug_option_p(property) : property;
        }
        return cb_debug_problem_link(inference_datastructures_inference.inference_root_link(inference), inference_datastructures_inference.simplest_inference_strategy(inference), options);
    }

    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 15700L)
    public static SubLObject cb_debug_problem(SubLObject problem, SubLObject strategic_context, SubLObject options) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != list_utilities.property_list_p(options) : options;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = options; NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            assert NIL != cb_debug_option_p(property) : property;
        }
        thread.resetMultipleValues();
        SubLObject ancestor_layers = cb_debug_compute_ancestor_layers(problem, options);
        SubLObject ancestors_to_display = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject _prev_bind_0 = $cb_debug_depth$.currentBinding(thread);
        SubLObject _prev_bind_2 = $cb_debug_tree$.currentBinding(thread);
        SubLObject _prev_bind_3 = $cb_debug_duplicate_tree$.currentBinding(thread);
        try {
            $cb_debug_depth$.bind(ZERO_INTEGER, thread);
            $cb_debug_tree$.bind(NIL, thread);
            $cb_debug_duplicate_tree$.bind(set.new_set(Symbols.symbol_function(EQ), UNPROVIDED), thread);
            if (NIL != ancestor_layers) {
                cb_debug_ancestors(ancestor_layers, strategic_context, problem, ancestors_to_display, options);
            } else {
                cb_debug_problem_int(problem, strategic_context, problem, NIL, options);
            }
            cb_debug_display_tree(Sequences.nreverse($cb_debug_tree$.getDynamicValue(thread)), strategic_context, options);
        } finally {
            $cb_debug_duplicate_tree$.rebind(_prev_bind_3, thread);
            $cb_debug_tree$.rebind(_prev_bind_2, thread);
            $cb_debug_depth$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 16300L)
    public static SubLObject cb_debug_problem_link(SubLObject link, SubLObject strategic_context, SubLObject options) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != list_utilities.property_list_p(options) : options;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = options; NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            assert NIL != cb_debug_option_p(property) : property;
        }
        SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
        SubLObject ancestor_layers = NIL;
        SubLObject ancestors_to_display = NIL;
        if (NIL != supported_problem) {
            thread.resetMultipleValues();
            SubLObject ancestor_layers_$8 = cb_debug_compute_ancestor_layers(supported_problem, options);
            SubLObject ancestors_to_display_$9 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            ancestor_layers = ancestor_layers_$8;
            ancestors_to_display = ancestors_to_display_$9;
            set.set_add(link, ancestors_to_display);
        }
        SubLObject _prev_bind_0 = $cb_debug_depth$.currentBinding(thread);
        SubLObject _prev_bind_2 = $cb_debug_tree$.currentBinding(thread);
        SubLObject _prev_bind_3 = $cb_debug_duplicate_tree$.currentBinding(thread);
        try {
            $cb_debug_depth$.bind(ZERO_INTEGER, thread);
            $cb_debug_tree$.bind(NIL, thread);
            $cb_debug_duplicate_tree$.bind(set.new_set(Symbols.symbol_function(EQ), UNPROVIDED), thread);
            if (NIL != ancestor_layers) {
                cb_debug_ancestors(ancestor_layers, strategic_context, link, ancestors_to_display, options);
            } else {
                cb_debug_problem_link_int(link, strategic_context, link, NIL, options);
            }
            cb_debug_display_tree(Sequences.nreverse($cb_debug_tree$.getDynamicValue(thread)), strategic_context, options);
        } finally {
            $cb_debug_duplicate_tree$.rebind(_prev_bind_3, thread);
            $cb_debug_tree$.rebind(_prev_bind_2, thread);
            $cb_debug_depth$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 17200L)
    public static SubLObject cb_debug_ancestors(SubLObject ancestor_layers, SubLObject strategic_context, SubLObject focal_object, SubLObject ancestors_to_display, SubLObject options) {
        SubLObject first_layer = ancestor_layers.first();
        if (NIL != set.set_emptyP(first_layer)) {
            SubLObject set_var = conses_high.second(ancestor_layers);
            SubLObject set_contents_var = set.do_set_internal(set_var);
            SubLObject basis_object;
            SubLObject state;
            SubLObject root_link;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                    state); state = set_contents.do_set_contents_update_state(state)) {
                root_link = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, root_link)) {
                    cb_debug_problem_link_int(root_link, strategic_context, focal_object, ancestors_to_display, options);
                }
            }
        } else {
            SubLObject set_contents_var2 = set.do_set_internal(first_layer);
            SubLObject basis_object2;
            SubLObject state2;
            SubLObject root_problem;
            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2,
                    state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                root_problem = set_contents.do_set_contents_next(basis_object2, state2);
                if (NIL != set_contents.do_set_contents_element_validP(state2, root_problem)) {
                    cb_debug_problem_int(root_problem, strategic_context, focal_object, ancestors_to_display, options);
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 17700L)
    public static SubLObject cb_debug_compute_ancestor_layers(SubLObject start_problem, SubLObject options) {
        SubLObject layer = set.new_set(Symbols.symbol_function(EQ), ONE_INTEGER);
        SubLObject all_ancestors_set = set.new_set(Symbols.symbol_function(EQ), ONE_INTEGER);
        SubLObject ancestor_layers = NIL;
        SubLObject ancestor_depth = cb_debug_option_value($ANCESTOR_DEPTH, options);
        set.set_add(start_problem, layer);
        set.set_add(start_problem, all_ancestors_set);
        while (NIL == set.set_emptyP(layer) && !ancestor_depth.numE(Numbers.integerDivide(Sequences.length(ancestor_layers), TWO_INTEGER))) {
            SubLObject new_layer = set.new_set(Symbols.symbol_function(EQ), UNPROVIDED);
            if (NIL != inference_datastructures_problem.problem_p(set_utilities.set_arbitrary_element(layer))) {
                SubLObject set_contents_var = set.do_set_internal(layer);
                SubLObject basis_object;
                SubLObject state;
                SubLObject problem;
                SubLObject set_contents_var_$10;
                SubLObject basis_object_$11;
                SubLObject state_$12;
                SubLObject link;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                        state); state = set_contents.do_set_contents_update_state(state)) {
                    problem = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, problem)) {
                        set_contents_var_$10 = inference_datastructures_problem.problem_dependent_links(problem);
                        for (basis_object_$11 = set_contents.do_set_contents_basis_object(set_contents_var_$10), state_$12 = NIL, state_$12 = set_contents.do_set_contents_initial_state(basis_object_$11, set_contents_var_$10); NIL == set_contents.do_set_contents_doneP(basis_object_$11,
                                state_$12); state_$12 = set_contents.do_set_contents_update_state(state_$12)) {
                            link = set_contents.do_set_contents_next(basis_object_$11, state_$12);
                            if (NIL != set_contents.do_set_contents_element_validP(state_$12, link) && NIL == set.set_memberP(link, all_ancestors_set)) {
                                set.set_add(link, new_layer);
                                set.set_add(link, all_ancestors_set);
                            }
                        }
                    }
                }
            } else {
                SubLObject set_contents_var = set.do_set_internal(layer);
                SubLObject basis_object;
                SubLObject state;
                SubLObject link2;
                SubLObject problem2;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                        state); state = set_contents.do_set_contents_update_state(state)) {
                    link2 = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, link2)) {
                        problem2 = inference_datastructures_problem_link.problem_link_supported_object(link2);
                        if (NIL != inference_datastructures_problem.problem_p(problem2) && NIL == set.set_memberP(problem2, all_ancestors_set)) {
                            set.set_add(problem2, new_layer);
                            set.set_add(problem2, all_ancestors_set);
                        }
                    }
                }
            }
            ancestor_layers = cons(new_layer, ancestor_layers);
            layer = new_layer;
        }
        if (NIL != cb_debug_option_value($SHOW_SIBLINGS_, options)) {
            SubLObject parents_set = list_utilities.nth_from_end(ONE_INTEGER, ancestor_layers);
            if (NIL != parents_set) {
                SubLObject set_contents_var = set.do_set_internal(parents_set);
                SubLObject basis_object;
                SubLObject state;
                SubLObject parent_problem;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                        state); state = set_contents.do_set_contents_update_state(state)) {
                    parent_problem = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, parent_problem)) {
                        cb_debug_add_children_and_links_to_set(parent_problem, all_ancestors_set);
                    }
                }
            }
        }
        if (NIL != cb_debug_option_value($SHOW_AUNTS_, options)) {
            SubLObject grandparents_set = list_utilities.nth_from_end(THREE_INTEGER, ancestor_layers);
            if (NIL != grandparents_set) {
                SubLObject set_contents_var = set.do_set_internal(grandparents_set);
                SubLObject basis_object;
                SubLObject state;
                SubLObject grandparent_problem;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                        state); state = set_contents.do_set_contents_update_state(state)) {
                    grandparent_problem = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, grandparent_problem)) {
                        cb_debug_add_children_and_links_to_set(grandparent_problem, all_ancestors_set);
                    }
                }
            }
        }
        return Values.values(ancestor_layers, all_ancestors_set);
    }

    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 19700L)
    public static SubLObject cb_debug_add_children_and_links_to_set(SubLObject problem, SubLObject v_set) {
        SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject child_link;
        SubLObject link_var;
        SubLObject cdolist_list_var;
        SubLObject supporting_mapped_problem;
        SubLObject child_problem;
        SubLObject variable_map;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
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

    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 20000L)
    public static SubLObject cb_debug_problem_int(SubLObject problem, SubLObject strategic_context, SubLObject focal_object, SubLObject display_only_these, SubLObject options) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != display_only_these && NIL == set.set_memberP(problem, display_only_these)) {
            return NIL;
        }
        SubLObject ellipsisP = makeBoolean(NIL == set.set_add(problem, $cb_debug_duplicate_tree$.getDynamicValue(thread)));
        SubLObject pcase_var = inference_datastructures_strategy.problem_provability_status(problem, strategic_context);
        if (pcase_var.eql($GOOD)) {
            SubLObject debug_goodsP = cb_debug_option_value($DEBUG_GOOD_PROBLEMS_, options);
            cb_debug_problem_parametrized(problem, strategic_context, debug_goodsP, debug_goodsP, ellipsisP, focal_object, display_only_these, options);
        } else if (pcase_var.eql($NEUTRAL)) {
            cb_debug_problem_parametrized(problem, strategic_context, T, T, ellipsisP, focal_object, display_only_these, options);
        } else if (pcase_var.eql($NO_GOOD)) {
            cb_debug_problem_parametrized(problem, strategic_context, T, NIL, ellipsisP, focal_object, display_only_these, options);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 21000L)
    public static SubLObject cb_debug_problem_parametrized(SubLObject problem, SubLObject strategic_context, SubLObject show_queryP, SubLObject compute_and_show_argument_linksP, SubLObject ellipsisP, SubLObject focal_object, SubLObject display_only_these, SubLObject options) {
        SubLThread thread = SubLProcess.currentSubLThread();
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
            SubLObject all_argument_links = cdolist_list_var = inference_datastructures_problem.problem_all_argument_links(problem);
            SubLObject link = NIL;
            link = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != ((NIL != display_only_these) ? set.set_memberP(link, display_only_these) : cb_show_problem_link_for_debuggingP(link, strategic_context, options))) {
                    argument_links = cons(link, argument_links);
                }
                cdolist_list_var = cdolist_list_var.rest();
                link = cdolist_list_var.first();
            }
            argument_links = cb_debug_sort_argument_links(argument_links);
        }
        SubLObject query = NIL;
        if (NIL != show_queryP) {
            SubLObject show_which_queries = cb_debug_option_value($SHOW_WHICH_QUERIES, options);
            if ($ALL == show_which_queries || ($DEAD_END == show_which_queries && NIL == argument_links)) {
                query = inference_czer.problem_query_formula(inference_datastructures_problem.problem_query(problem));
            }
        }
        cb_debug_add_node_to_tree($PROBLEM, list(problem, is_focal_objectP, query));
        if (NIL != ellipsisP) {
            SubLObject _prev_bind_0 = $cb_debug_depth$.currentBinding(thread);
            try {
                $cb_debug_depth$.bind(number_utilities.f_1X($cb_debug_depth$.getDynamicValue(thread)), thread);
                cb_debug_add_node_to_tree($ELLIPSIS, NIL);
            } finally {
                $cb_debug_depth$.rebind(_prev_bind_0, thread);
            }
        }
        if (NIL != compute_and_show_argument_linksP) {
            SubLObject _prev_bind_0 = $cb_debug_depth$.currentBinding(thread);
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

    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 22800L)
    public static SubLObject cb_show_problem_link_for_debuggingP(SubLObject link, SubLObject strategic_context, SubLObject options) {
        if (NIL != inference_worker.connected_conjunction_link_p(link) && NIL != inference_datastructures_problem_link.problem_link_closedP(link)) {
            return NIL;
        }
        if (NIL != balancing_tactician.balancing_tactician_p(strategic_context)) {
            if (NIL != cb_debug_option_value($DEBUG_NON_NEW_ROOTS_, options)) {
                return T;
            }
            SubLObject link_leads_to_new_rootP;
            SubLObject rest;
            SubLObject supporting_mapped_problem;
            SubLObject supporting_problem;
            SubLObject variable_map;
            for (link_leads_to_new_rootP = NIL, rest = NIL, rest = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link); NIL == link_leads_to_new_rootP && NIL != rest; rest = rest.rest()) {
                supporting_mapped_problem = rest.first();
                if (NIL != inference_macros.do_problem_link_open_matchP(NIL, link, supporting_mapped_problem)) {
                    supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                    variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                    if (NIL != balancing_tactician.balancing_tactician_problem_motivated_wrt_nP(strategic_context, supporting_problem)) {
                        link_leads_to_new_rootP = T;
                    }
                }
            }
            if (NIL != inference_worker_join_ordered.join_ordered_link_p(link) && NIL != inference_worker_join_ordered.join_ordered_link_non_focal_manifestedP(link)) {
                SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(inference_worker_join_ordered.join_ordered_link_non_focal_problem(link));
                SubLObject basis_object;
                SubLObject state;
                SubLObject restriction_link;
                SubLObject restricted_non_focal;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == link_leads_to_new_rootP
                        && NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    restriction_link = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, restriction_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $RESTRICTION)
                            && NIL != inference_worker_join_ordered.non_focal_restriction_link_with_corresponding_focal_proofP(restriction_link, link)) {
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

    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 24000L)
    public static SubLObject cb_debug_problem_link_int(SubLObject link, SubLObject strategic_context, SubLObject focal_object, SubLObject display_only_these, SubLObject options) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject is_focal_objectP = NIL;
        if (link.eql(focal_object)) {
            is_focal_objectP = T;
            display_only_these = NIL;
        }
        if (NIL != display_only_these && NIL == set.set_memberP(link, display_only_these)) {
            return NIL;
        }
        SubLObject rule = NIL;
        if (NIL != cb_debug_option_value($SHOW_RULES_, options) && NIL != inference_worker_transformation.generalized_transformation_link_p(link)) {
            rule = inference_worker_transformation.generalized_transformation_link_rule_assertion(link);
        }
        cb_debug_add_node_to_tree($PROBLEM_LINK, list(link, is_focal_objectP, rule));
        SubLObject _prev_bind_0 = $cb_debug_depth$.currentBinding(thread);
        try {
            $cb_debug_depth$.bind(number_utilities.f_1X($cb_debug_depth$.getDynamicValue(thread)), thread);
            SubLObject supporting_problems = cb_debug_sort_supporting_problems(inference_datastructures_problem_link.problem_link_supporting_problems(link));
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

    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 25100L)
    public static SubLObject cb_debug_join_ordered_link_guts(SubLObject join_ordered_link, SubLObject strategic_context, SubLObject focal_object, SubLObject display_only_these, SubLObject options) {
        SubLObject focal_problem = inference_worker_join_ordered.join_ordered_link_focal_problem(join_ordered_link);
        cb_debug_problem_int(focal_problem, strategic_context, focal_object, display_only_these, options);
        if (NIL != inference_worker_join_ordered.join_ordered_link_non_focal_manifestedP(join_ordered_link)) {
            SubLObject non_focal_problem = inference_worker_join_ordered.join_ordered_link_non_focal_problem(join_ordered_link);
            if (NIL != inference_worker.good_problem_p(focal_problem, strategic_context)) {
                SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(non_focal_problem);
                SubLObject basis_object;
                SubLObject state;
                SubLObject restriction_link;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                        state); state = set_contents.do_set_contents_update_state(state)) {
                    restriction_link = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, restriction_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $RESTRICTION) && NIL != cb_show_problem_link_for_debuggingP(restriction_link, strategic_context, options)) {
                        cb_debug_problem_link_int(restriction_link, strategic_context, focal_object, display_only_these, options);
                    }
                }
            } else {
                cb_debug_problem_int(non_focal_problem, strategic_context, focal_object, display_only_these, options);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 26000L)
    public static SubLObject cb_debug_add_node_to_tree(SubLObject node_type, SubLObject data) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != Types.keywordp(node_type) : node_type;
        SubLObject node = listS(node_type, $cb_debug_depth$.getDynamicValue(thread), data);
        $cb_debug_tree$.setDynamicValue(cons(node, $cb_debug_tree$.getDynamicValue(thread)), thread);
        return node;
    }

    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 26200L)
    public static SubLObject cb_debug_sort_argument_links(SubLObject links) {
        return Sort.sort(links, $sym96$CB_DEBUG_ARGUMENT_LINK__, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 26300L)
    public static SubLObject cb_debug_argument_link_L(SubLObject link1, SubLObject link2) {
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

    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 26600L)
    public static SubLObject problem_link_suid_L(SubLObject link1, SubLObject link2) {
        return Numbers.numL(inference_datastructures_problem_link.problem_link_suid(link1), inference_datastructures_problem_link.problem_link_suid(link2));
    }

    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 26800L)
    public static SubLObject good_problem_link_p(SubLObject link) {
        return inference_datastructures_problem_link.problem_link_has_some_proofP(link, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 26800L)
    public static SubLObject cb_debug_sort_supporting_problems(SubLObject problems) {
        return Sort.sort(problems, $sym97$CB_DEBUG_SUPPORTING_PROBLEM__, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 27000L)
    public static SubLObject cb_debug_supporting_problem_L(SubLObject problem1, SubLObject problem2) {
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

    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 27400L)
    public static SubLObject problem_suid_L(SubLObject problem1, SubLObject problem2) {
        return Numbers.numL(inference_datastructures_problem.problem_suid(problem1), inference_datastructures_problem.problem_suid(problem2));
    }

    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 27700L)
    public static SubLObject cb_debug_display_tree(SubLObject debug_tree, SubLObject strategic_context, SubLObject options) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject _prev_bind_0 = $cb_debug_next_object_id$.currentBinding(thread);
        try {
            $cb_debug_next_object_id$.bind(ZERO_INTEGER, thread);
            cb_debug_display_tree_children(debug_tree, ZERO_INTEGER, $str99$root, strategic_context, options);
        } finally {
            $cb_debug_next_object_id$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 27900L)
    public static SubLObject cb_debug_display_tree_children(SubLObject debug_tree, SubLObject exact_depth, SubLObject parent_id, SubLObject strategic_context, SubLObject options) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject visibility = cb_debug_option_value($DHTML_VISIBILITY, options);
        if ($str99$root.equal(parent_id)) {
            visibility = $VISIBLE;
        }
        if ($NONE == visibility) {
            cb_debug_display_tree_children_int(debug_tree, exact_depth, strategic_context, options);
        } else {
            dhtml_macros.dhtml_set_switched_visibility(parent_id, visibility, $TEXT);
            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
            if (NIL != parent_id) {
                html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(parent_id);
                html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
            }
            html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                cb_debug_display_tree_children_int(debug_tree, exact_depth, strategic_context, options);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 28600L)
    public static SubLObject cb_debug_display_tree_children_int(SubLObject debug_tree, SubLObject exact_depth, SubLObject strategic_context, SubLObject options) {
        SubLObject done_with_this_subtreeP;
        SubLObject subtree;
        SubLObject child_node;
        SubLObject child_depth;
        for (done_with_this_subtreeP = NIL, subtree = NIL, subtree = debug_tree; NIL != subtree && NIL == done_with_this_subtreeP; subtree = subtree.rest()) {
            child_node = subtree.first();
            child_depth = conses_high.second(child_node);
            if (child_depth.eql(exact_depth)) {
                cb_debug_display_tree_int(subtree, strategic_context, options);
            } else if (child_depth.numL(exact_depth)) {
                done_with_this_subtreeP = T;
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 29100L)
    public static SubLObject cb_debug_display_tree_int(SubLObject debug_tree, SubLObject strategic_context, SubLObject options) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject node = debug_tree.first();
        SubLObject lookhead_node = conses_high.second(debug_tree);
        SubLObject current;
        SubLObject datum = current = node;
        SubLObject node_type = NIL;
        SubLObject depth = NIL;
        SubLObject data = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list103);
        node_type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list103);
        depth = current.first();
        current = (data = current.rest());
        if (depth.numG($cb_debug_max_depth$.getGlobalValue())) {
            node_type = $ELLIPSIS;
        }
        if ($ELLIPSIS == node_type) {
            cb_debug_indent_the_right_amount(depth);
            if ($NONE != cb_debug_option_value($DHTML_VISIBILITY, options)) {
                SubLObject image_src = Sequences.cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src($SQUARE_BLANK));
                SubLObject align = $TOP;
                SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string($SQUARE_BLANK);
                SubLObject border = ZERO_INTEGER;
                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(image_src);
                html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                if (NIL != alt) {
                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(alt);
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                }
                if (NIL != align) {
                    html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align(align));
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                }
                if (NIL != border) {
                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(border);
                    html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                html_utilities.html_indent(UNPROVIDED);
            }
            html_utilities.html_princ($str105$___);
            html_utilities.html_newline(UNPROVIDED);
        } else {
            SubLObject current_$15;
            SubLObject datum_$14 = current_$15 = data;
            SubLObject v_object = NIL;
            SubLObject is_focal_objectP = NIL;
            SubLObject query_or_rule = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$15, datum_$14, $list106);
            v_object = current_$15.first();
            current_$15 = current_$15.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$15, datum_$14, $list106);
            is_focal_objectP = current_$15.first();
            current_$15 = current_$15.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$15, datum_$14, $list106);
            query_or_rule = current_$15.first();
            current_$15 = current_$15.rest();
            if (NIL == current_$15) {
                SubLObject object_id = cb_debug_next_object_id_string();
                cb_debug_indent_the_right_amount(depth);
                if ($NONE != cb_debug_option_value($DHTML_VISIBILITY, options)) {
                    if (NIL == lookhead_node || $ELLIPSIS == lookhead_node.first() || conses_high.second(lookhead_node).numLE(depth)) {
                        SubLObject image_src2 = Sequences.cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src($BLANK_TRIANGLE));
                        SubLObject align2 = $TOP;
                        SubLObject alt2 = cyc_file_dependencies.get_html_icon_alt_string($BLANK_TRIANGLE);
                        SubLObject border2 = ZERO_INTEGER;
                        html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(image_src2);
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        if (NIL != alt2) {
                            html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(alt2);
                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        }
                        if (NIL != align2) {
                            html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align(align2));
                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        }
                        if (NIL != border2) {
                            html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(border2);
                            html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                        SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                        html_utilities.html_indent(UNPROVIDED);
                    } else {
                        dhtml_macros.dhtml_switch_visibility_links_plus_minus(object_id, $str79$);
                    }
                }
                cb_debug_link(v_object, strategic_context, $cb_debug_icon$.getDynamicValue(thread), options);
                if (NIL != is_focal_objectP) {
                    SubLObject size_val = FIVE_INTEGER;
                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                    if (NIL != size_val) {
                        html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(size_val);
                        html_utilities.html_char(Characters.CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(Characters.CHAR_greater, UNPROVIDED);
                    SubLObject _prev_bind_3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        cb_utilities.cb_link(node_type, v_object, $VERBOSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_3, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                } else {
                    cb_utilities.cb_link(node_type, v_object, $VERBOSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (NIL != query_or_rule) {
                    cb_debug_inference_form(query_or_rule, depth);
                }
                html_utilities.html_newline(UNPROVIDED);
                cb_debug_display_tree_children(debug_tree.rest(), number_utilities.f_1X(depth), object_id, strategic_context, options);
            } else {
                cdestructuring_bind.cdestructuring_bind_error(datum_$14, $list106);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 30900L)
    public static SubLObject cb_debug_next_object_id_string() {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject string = Sequences.cconcatenate($str108$cbd, string_utilities.str($cb_debug_next_object_id$.getDynamicValue(thread)));
        $cb_debug_next_object_id$.setDynamicValue(Numbers.add($cb_debug_next_object_id$.getDynamicValue(thread), ONE_INTEGER), thread);
        return string;
    }

    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 31100L)
    public static SubLObject cb_debug_indent_the_right_amount(SubLObject depth) {
        SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_indent(Numbers.multiply(depth, $cb_debug_indent_quantum$.getDynamicValue(thread)));
        return depth;
    }

    @SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 31200L)
    public static SubLObject cb_debug_inference_form(SubLObject v_object, SubLObject depth) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return cb_utilities.cb_form(v_object, Numbers.add(TWO_INTEGER, Numbers.integerDivide(Numbers.multiply(depth, $cb_debug_indent_quantum$.getDynamicValue(thread)), TWO_INTEGER)), T);
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

    public static SubLObject init_cb_inference_debugger_file() {
        $cb_debug_icon$ = defvar("*CB-DEBUG-ICON*", $RED_DIAMOND);
        $cb_debug_indent_quantum$ = defvar("*CB-DEBUG-INDENT-QUANTUM*", FOUR_INTEGER);
        $cb_debug_depth$ = defparameter("*CB-DEBUG-DEPTH*", $UNINITIALIZED);
        $cb_debug_duplicate_tree$ = defparameter("*CB-DEBUG-DUPLICATE-TREE*", $UNINITIALIZED);
        $cb_debug_tree$ = defparameter("*CB-DEBUG-TREE*", $UNINITIALIZED);
        $cb_current_debug_options$ = defvar("*CB-CURRENT-DEBUG-OPTIONS*", NIL);
        $cb_debug_options$ = deflexical("*CB-DEBUG-OPTIONS*", $list58);
        $cb_show_hide_value_linktext_pairs$ = deflexical("*CB-SHOW-HIDE-VALUE-LINKTEXT-PAIRS*", $list59);
        $cb_debug_max_depth$ = deflexical("*CB-DEBUG-MAX-DEPTH*", $int$212);
        $cb_debug_next_object_id$ = defparameter("*CB-DEBUG-NEXT-OBJECT-ID*", $UNINITIALIZED);
        return NIL;
    }

    public static SubLObject setup_cb_inference_debugger_file() {
        utilities_macros.register_html_state_variable($sym1$_CB_DEBUG_ICON_);
        utilities_macros.register_html_state_variable($sym2$_CB_DEBUG_INDENT_QUANTUM_);
        utilities_macros.register_html_state_variable($sym4$_CB_CURRENT_DEBUG_OPTIONS_);
        cb_utilities.setup_cb_link_method($DEBUG_INFERENCE, $sym17$CB_LINK_DEBUG_INFERENCE, THREE_INTEGER);
        html_macros.note_cgi_handler_function($sym28$CB_DEBUG_INFERENCE_HANDLER, $HTML_HANDLER);
        cb_utilities.setup_cb_link_method($DEBUG_PROBLEM, $sym35$CB_LINK_DEBUG_PROBLEM, FOUR_INTEGER);
        html_macros.note_cgi_handler_function($sym42$CB_DEBUG_PROBLEM_HANDLER, $HTML_HANDLER);
        cb_utilities.setup_cb_link_method($DEBUG_PROBLEM_LINK, $sym47$CB_LINK_DEBUG_PROBLEM_LINK, FOUR_INTEGER);
        html_macros.note_cgi_handler_function($sym52$CB_DEBUG_PROBLEM_LINK_HANDLER, $HTML_HANDLER);
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
        me = new cb_inference_debugger();
        $cb_debug_icon$ = null;
        $cb_debug_indent_quantum$ = null;
        $cb_debug_depth$ = null;
        $cb_debug_duplicate_tree$ = null;
        $cb_debug_tree$ = null;
        $cb_current_debug_options$ = null;
        $cb_debug_options$ = null;
        $cb_show_hide_value_linktext_pairs$ = null;
        $cb_debug_max_depth$ = null;
        $cb_debug_next_object_id$ = null;
        $RED_DIAMOND = makeKeyword("RED-DIAMOND");
        $sym1$_CB_DEBUG_ICON_ = makeSymbol("*CB-DEBUG-ICON*");
        $sym2$_CB_DEBUG_INDENT_QUANTUM_ = makeSymbol("*CB-DEBUG-INDENT-QUANTUM*");
        $UNINITIALIZED = makeKeyword("UNINITIALIZED");
        $sym4$_CB_CURRENT_DEBUG_OPTIONS_ = makeSymbol("*CB-CURRENT-DEBUG-OPTIONS*");
        $list5 = list(list(makeSymbol("FOCAL-OBJECT")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym6$HTML_DOCUMENT = makeSymbol("HTML-DOCUMENT");
        $list7 = list(makeSymbol("CB-HEAD"), list(makeSymbol("DHTML-WITH-DOM-SCRIPT")), list(makeSymbol("DHTML-WITH-TOGGLE-VISIBILITY-SUPPORT")), list(makeSymbol("BASIC-AJAX-SCRIPTS")), list(makeSymbol("DHTML-CREATION-SCRIPTS")));
        $sym8$HTML_FANCY_BODY = makeSymbol("HTML-FANCY-BODY");
        $list9 = list(makeKeyword("SHOW-COPYRIGHT"), NIL);
        $sym10$CB_SHOW_RELEVANT_INFERENCE_DEBUGGING_LINKS = makeSymbol("CB-SHOW-RELEVANT-INFERENCE-DEBUGGING-LINKS");
        $list11 = list(makeSymbol("HTML-PRINC-STRONG"), makeString("Inference Debugging Tree for "));
        $sym12$CLET = makeSymbol("CLET");
        $list13 = list(list(makeSymbol("*CB-DEBUG-DEPTH*"), ZERO_INTEGER), list(makeSymbol("*CB-DEBUG-TREE*"), NIL), list(makeSymbol("*CB-DEBUG-DUPLICATE-TREE*"), list(makeSymbol("NEW-SET"), list(makeSymbol("FUNCTION"), EQ))));
        $str14$_Debug_Inference__A__A_ = makeString("[Debug Inference ~A.~A]");
        $str15$cb_debug_inference_handler = makeString("cb-debug-inference-handler");
        $DEBUG_INFERENCE = makeKeyword("DEBUG-INFERENCE");
        $sym17$CB_LINK_DEBUG_INFERENCE = makeSymbol("CB-LINK-DEBUG-INFERENCE");
        $list18 = list(makeSymbol("STORE-ID-STRING"), makeSymbol("INFERENCE-ID-STRING"), makeSymbol("OPTIONS-GLOB-ID-STRING"));
        $str19$_A_did_not_specify_an_inference = makeString("~A did not specify an inference");
        $sym20$CB_DEBUG_OPTION_P = makeSymbol("CB-DEBUG-OPTION-P");
        $str21$_A_did_not_specify_valid_debugger = makeString("~A did not specify valid debugger options");
        $str22$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str23$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $CB_CYC = makeKeyword("CB-CYC");
        $str25$Inference_Debugging_Tree_for_ = makeString("Inference Debugging Tree for ");
        $INFERENCE = makeKeyword("INFERENCE");
        $VERY_VERBOSE = makeKeyword("VERY-VERBOSE");
        $sym28$CB_DEBUG_INFERENCE_HANDLER = makeSymbol("CB-DEBUG-INFERENCE-HANDLER");
        $HTML_HANDLER = makeKeyword("HTML-HANDLER");
        $TACTICAL = makeKeyword("TACTICAL");
        $str31$_Debug_Problem__A__A_ = makeString("[Debug Problem ~A.~A]");
        $str32$_Debug_Problem__A__A_wrt_s_A_ = makeString("[Debug Problem ~A.~A wrt s~A]");
        $str33$cb_debug_problem_handler = makeString("cb-debug-problem-handler");
        $DEBUG_PROBLEM = makeKeyword("DEBUG-PROBLEM");
        $sym35$CB_LINK_DEBUG_PROBLEM = makeSymbol("CB-LINK-DEBUG-PROBLEM");
        $list36 = list(makeSymbol("STORE-ID-STRING"), makeSymbol("PROBLEM-ID-STRING"), makeSymbol("STRATEGIC-CONTEXT-ID-STRING"), makeSymbol("OPTIONS-GLOB-ID-STRING"));
        $str37$_A_did_not_specify_a_problem = makeString("~A did not specify a problem");
        $str38$_A_did_not_specify_a_strategic_co = makeString("~A did not specify a strategic context");
        $PROBLEM = makeKeyword("PROBLEM");
        $str40$_wrt_ = makeString(" wrt ");
        $STRATEGY = makeKeyword("STRATEGY");
        $sym42$CB_DEBUG_PROBLEM_HANDLER = makeSymbol("CB-DEBUG-PROBLEM-HANDLER");
        $str43$_Debug_Link__A__A_ = makeString("[Debug Link ~A.~A]");
        $str44$_Debug_Link__A__A_wrt_s_A_ = makeString("[Debug Link ~A.~A wrt s~A]");
        $str45$cb_debug_problem_link_handler = makeString("cb-debug-problem-link-handler");
        $DEBUG_PROBLEM_LINK = makeKeyword("DEBUG-PROBLEM-LINK");
        $sym47$CB_LINK_DEBUG_PROBLEM_LINK = makeSymbol("CB-LINK-DEBUG-PROBLEM-LINK");
        $list48 = list(makeSymbol("STORE-ID-STRING"), makeSymbol("LINK-ID-STRING"), makeSymbol("STRATEGIC-CONTEXT-ID-STRING"), makeSymbol("OPTIONS-GLOB-ID-STRING"));
        $str49$_A_did_not_specify_a_link = makeString("~A did not specify a link");
        $PROBLEM_LINK = makeKeyword("PROBLEM-LINK");
        $VERBOSE = makeKeyword("VERBOSE");
        $sym52$CB_DEBUG_PROBLEM_LINK_HANDLER = makeSymbol("CB-DEBUG-PROBLEM-LINK-HANDLER");
        $SELF = makeKeyword("SELF");
        $str54$_A__A__A__A__A = makeString("~A&~A&~A&~A&~A");
        $str55$_A__A__A__A = makeString("~A&~A&~A&~A");
        $TOP = makeKeyword("TOP");
        $str57$Unexpected_cb_debug_link_object__ = makeString("Unexpected cb-debug-link object: ~a");
        $list58 = list(cons(makeKeyword("ANCESTOR-DEPTH"), makeInteger(21)), list(makeKeyword("SHOW-SIBLINGS?")), list(makeKeyword("SHOW-AUNTS?")), cons(makeKeyword("DEBUG-GOOD-PROBLEMS?"), T), cons(makeKeyword("DEBUG-NON-NEW-ROOTS?"), T),
                cons(makeKeyword("SHOW-WHICH-QUERIES"), makeKeyword("NONE")), cons(makeKeyword("SHOW-RULES?"), T), cons(makeKeyword("DHTML-VISIBILITY"), makeKeyword("VISIBLE")));
        $list59 = list(list(T, makeString("[Show]")), list(NIL, makeString("[Hide]")));
        $SHOW_SIBLINGS_ = makeKeyword("SHOW-SIBLINGS?");
        $str61$Siblings_ = makeString("Siblings:");
        $SHOW_AUNTS_ = makeKeyword("SHOW-AUNTS?");
        $str63$Aunts_ = makeString("Aunts:");
        $DEBUG_NON_NEW_ROOTS_ = makeKeyword("DEBUG-NON-NEW-ROOTS?");
        $str65$Non_New_Roots_ = makeString("Non-New Roots:");
        $DEBUG_GOOD_PROBLEMS_ = makeKeyword("DEBUG-GOOD-PROBLEMS?");
        $str67$Good_Problems_ = makeString("Good Problems:");
        $list68 = list(list(T, makeString("[Descend]")), list(NIL, makeString("[Stop]")));
        $SHOW_WHICH_QUERIES = makeKeyword("SHOW-WHICH-QUERIES");
        $str70$Queries_ = makeString("Queries:");
        $list71 = list(list(makeKeyword("ALL"), makeString("[All]")), list(makeKeyword("DEAD-END"), makeString("[Dead Ends]")), list(makeKeyword("NONE"), makeString("[None]")));
        $SHOW_RULES_ = makeKeyword("SHOW-RULES?");
        $str73$Rules_ = makeString("Rules:");
        $SQUARE_PLUS = makeKeyword("SQUARE-PLUS");
        $CENTER = makeKeyword("CENTER");
        $SQUARE_MINUS = makeKeyword("SQUARE-MINUS");
        $str77$_ = makeString(":");
        $DHTML_VISIBILITY = makeKeyword("DHTML-VISIBILITY");
        $str79$ = makeString("");
        $list80 = list(list(makeKeyword("VISIBLE"), makeString("[Open All]")), list(makeKeyword("INVISIBLE"), makeString("[Close All]")), list(makeKeyword("NONE"), makeString("[Turn Off]")));
        $str81$Ancestor_Depth_ = makeString("Ancestor Depth:");
        $str82$_ = makeString("[");
        $str83$_ = makeString("]");
        $ANCESTOR_DEPTH = makeKeyword("ANCESTOR-DEPTH");
        $list85 = list(makeInteger(212), makeInteger(21), TWELVE_INTEGER, THREE_INTEGER, TWO_INTEGER, ONE_INTEGER, ZERO_INTEGER);
        $list86 = list(makeSymbol("VALUE"), makeSymbol("LINKTEXT"));
        $sym87$PROPERTY_LIST_P = makeSymbol("PROPERTY-LIST-P");
        $GOOD = makeKeyword("GOOD");
        $NEUTRAL = makeKeyword("NEUTRAL");
        $NO_GOOD = makeKeyword("NO-GOOD");
        $ALL = makeKeyword("ALL");
        $DEAD_END = makeKeyword("DEAD-END");
        $ELLIPSIS = makeKeyword("ELLIPSIS");
        $RESTRICTION = makeKeyword("RESTRICTION");
        $sym95$KEYWORDP = makeSymbol("KEYWORDP");
        $sym96$CB_DEBUG_ARGUMENT_LINK__ = makeSymbol("CB-DEBUG-ARGUMENT-LINK-<");
        $sym97$CB_DEBUG_SUPPORTING_PROBLEM__ = makeSymbol("CB-DEBUG-SUPPORTING-PROBLEM-<");
        $int$212 = makeInteger(212);
        $str99$root = makeString("root");
        $VISIBLE = makeKeyword("VISIBLE");
        $NONE = makeKeyword("NONE");
        $TEXT = makeKeyword("TEXT");
        $list103 = listS(makeSymbol("NODE-TYPE"), makeSymbol("DEPTH"), makeSymbol("DATA"));
        $SQUARE_BLANK = makeKeyword("SQUARE-BLANK");
        $str105$___ = makeString("...");
        $list106 = list(makeSymbol("OBJECT"), makeSymbol("IS-FOCAL-OBJECT?"), makeSymbol("QUERY-OR-RULE"));
        $BLANK_TRIANGLE = makeKeyword("BLANK-TRIANGLE");
        $str108$cbd = makeString("cbd");
    }
}
/*
 *
 * Total time: 412 ms
 *
 */