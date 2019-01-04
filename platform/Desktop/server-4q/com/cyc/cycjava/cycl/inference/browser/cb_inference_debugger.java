package com.cyc.cycjava.cycl.inference.browser;

import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered;
import com.cyc.cycjava.cycl.inference.harness.balancing_tactician;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_czer;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_inference_debugger extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger";
    public static final String myFingerPrint = "394517dbd1c887a7bc290f34af643b0da73ba152e06e768c343e0fe886e2cea4";
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 1515L)
    public static SubLSymbol $cb_debug_icon$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 3319L)
    public static SubLSymbol $cb_debug_indent_quantum$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 3361L)
    private static SubLSymbol $cb_debug_depth$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 3443L)
    private static SubLSymbol $cb_debug_duplicate_tree$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 3591L)
    private static SubLSymbol $cb_debug_tree$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 3645L)
    public static SubLSymbol $cb_current_debug_options$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 10938L)
    private static SubLSymbol $cb_debug_options$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 12755L)
    private static SubLSymbol $cb_show_hide_value_linktext_pairs$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 27522L)
    private static SubLSymbol $cb_debug_max_depth$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 27690L)
    private static SubLSymbol $cb_debug_next_object_id$;
    private static final SubLSymbol $kw0$RED_DIAMOND;
    private static final SubLSymbol $sym1$_CB_DEBUG_ICON_;
    private static final SubLSymbol $sym2$_CB_DEBUG_INDENT_QUANTUM_;
    private static final SubLSymbol $kw3$UNINITIALIZED;
    private static final SubLSymbol $sym4$_CB_CURRENT_DEBUG_OPTIONS_;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$HTML_DOCUMENT;
    private static final SubLList $list7;
    private static final SubLSymbol $sym8$HTML_FANCY_BODY;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$CB_SHOW_RELEVANT_INFERENCE_DEBUGGING_LINKS;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$CLET;
    private static final SubLList $list13;
    private static final SubLString $str14$_Debug_Inference__A__A_;
    private static final SubLString $str15$cb_debug_inference_handler;
    private static final SubLSymbol $kw16$DEBUG_INFERENCE;
    private static final SubLSymbol $sym17$CB_LINK_DEBUG_INFERENCE;
    private static final SubLList $list18;
    private static final SubLString $str19$_A_did_not_specify_an_inference;
    private static final SubLSymbol $sym20$CB_DEBUG_OPTION_P;
    private static final SubLString $str21$_A_did_not_specify_valid_debugger;
    private static final SubLString $str22$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str23$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw24$CB_CYC;
    private static final SubLString $str25$Inference_Debugging_Tree_for_;
    private static final SubLSymbol $kw26$INFERENCE;
    private static final SubLSymbol $kw27$VERY_VERBOSE;
    private static final SubLSymbol $sym28$CB_DEBUG_INFERENCE_HANDLER;
    private static final SubLSymbol $kw29$HTML_HANDLER;
    private static final SubLSymbol $kw30$TACTICAL;
    private static final SubLString $str31$_Debug_Problem__A__A_;
    private static final SubLString $str32$_Debug_Problem__A__A_wrt_s_A_;
    private static final SubLString $str33$cb_debug_problem_handler;
    private static final SubLSymbol $kw34$DEBUG_PROBLEM;
    private static final SubLSymbol $sym35$CB_LINK_DEBUG_PROBLEM;
    private static final SubLList $list36;
    private static final SubLString $str37$_A_did_not_specify_a_problem;
    private static final SubLString $str38$_A_did_not_specify_a_strategic_co;
    private static final SubLSymbol $kw39$PROBLEM;
    private static final SubLString $str40$_wrt_;
    private static final SubLSymbol $kw41$STRATEGY;
    private static final SubLSymbol $sym42$CB_DEBUG_PROBLEM_HANDLER;
    private static final SubLString $str43$_Debug_Link__A__A_;
    private static final SubLString $str44$_Debug_Link__A__A_wrt_s_A_;
    private static final SubLString $str45$cb_debug_problem_link_handler;
    private static final SubLSymbol $kw46$DEBUG_PROBLEM_LINK;
    private static final SubLSymbol $sym47$CB_LINK_DEBUG_PROBLEM_LINK;
    private static final SubLList $list48;
    private static final SubLString $str49$_A_did_not_specify_a_link;
    private static final SubLSymbol $kw50$PROBLEM_LINK;
    private static final SubLSymbol $kw51$VERBOSE;
    private static final SubLSymbol $sym52$CB_DEBUG_PROBLEM_LINK_HANDLER;
    private static final SubLSymbol $kw53$SELF;
    private static final SubLString $str54$_A__A__A__A__A;
    private static final SubLString $str55$_A__A__A__A;
    private static final SubLSymbol $kw56$TOP;
    private static final SubLString $str57$Unexpected_cb_debug_link_object__;
    private static final SubLList $list58;
    private static final SubLList $list59;
    private static final SubLSymbol $kw60$SHOW_SIBLINGS_;
    private static final SubLString $str61$Siblings_;
    private static final SubLSymbol $kw62$SHOW_AUNTS_;
    private static final SubLString $str63$Aunts_;
    private static final SubLSymbol $kw64$DEBUG_NON_NEW_ROOTS_;
    private static final SubLString $str65$Non_New_Roots_;
    private static final SubLSymbol $kw66$DEBUG_GOOD_PROBLEMS_;
    private static final SubLString $str67$Good_Problems_;
    private static final SubLList $list68;
    private static final SubLSymbol $kw69$SHOW_WHICH_QUERIES;
    private static final SubLString $str70$Queries_;
    private static final SubLList $list71;
    private static final SubLSymbol $kw72$SHOW_RULES_;
    private static final SubLString $str73$Rules_;
    private static final SubLSymbol $kw74$SQUARE_PLUS;
    private static final SubLSymbol $kw75$CENTER;
    private static final SubLSymbol $kw76$SQUARE_MINUS;
    private static final SubLString $str77$_;
    private static final SubLSymbol $kw78$DHTML_VISIBILITY;
    private static final SubLString $str79$;
    private static final SubLList $list80;
    private static final SubLString $str81$Ancestor_Depth_;
    private static final SubLString $str82$_;
    private static final SubLString $str83$_;
    private static final SubLSymbol $kw84$ANCESTOR_DEPTH;
    private static final SubLList $list85;
    private static final SubLList $list86;
    private static final SubLSymbol $sym87$PROPERTY_LIST_P;
    private static final SubLSymbol $kw88$GOOD;
    private static final SubLSymbol $kw89$NEUTRAL;
    private static final SubLSymbol $kw90$NO_GOOD;
    private static final SubLSymbol $kw91$ALL;
    private static final SubLSymbol $kw92$DEAD_END;
    private static final SubLSymbol $kw93$ELLIPSIS;
    private static final SubLSymbol $kw94$RESTRICTION;
    private static final SubLSymbol $sym95$KEYWORDP;
    private static final SubLSymbol $sym96$CB_DEBUG_ARGUMENT_LINK__;
    private static final SubLSymbol $sym97$CB_DEBUG_SUPPORTING_PROBLEM__;
    private static final SubLInteger $int98$212;
    private static final SubLString $str99$root;
    private static final SubLSymbol $kw100$VISIBLE;
    private static final SubLSymbol $kw101$NONE;
    private static final SubLSymbol $kw102$TEXT;
    private static final SubLList $list103;
    private static final SubLSymbol $kw104$SQUARE_BLANK;
    private static final SubLString $str105$___;
    private static final SubLList $list106;
    private static final SubLSymbol $kw107$BLANK_TRIANGLE;
    private static final SubLString $str108$cbd;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 3690L)
    public static SubLObject html_inference_debug_page(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_inference_debugger.$list5);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject focal_object = (SubLObject)cb_inference_debugger.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_inference_debugger.$list5);
        focal_object = current.first();
        current = current.rest();
        if (cb_inference_debugger.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)cb_inference_debugger.$sym6$HTML_DOCUMENT, (SubLObject)cb_inference_debugger.$list7, (SubLObject)ConsesLow.listS((SubLObject)cb_inference_debugger.$sym8$HTML_FANCY_BODY, (SubLObject)cb_inference_debugger.$list9, (SubLObject)ConsesLow.list((SubLObject)cb_inference_debugger.$sym10$CB_SHOW_RELEVANT_INFERENCE_DEBUGGING_LINKS, focal_object), (SubLObject)cb_inference_debugger.$list11, ConsesLow.append(body, (SubLObject)cb_inference_debugger.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_inference_debugger.$list5);
        return (SubLObject)cb_inference_debugger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 4130L)
    public static SubLObject with_debug_inference_indentation_and_recursion_handling(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)cb_inference_debugger.$sym12$CLET, (SubLObject)cb_inference_debugger.$list13, ConsesLow.append(body, (SubLObject)cb_inference_debugger.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 4348L)
    public static SubLObject cb_link_debug_inference(final SubLObject inference, SubLObject linktext, SubLObject options) {
        if (linktext == cb_inference_debugger.UNPROVIDED) {
            linktext = (SubLObject)cb_inference_debugger.NIL;
        }
        if (options == cb_inference_debugger.UNPROVIDED) {
            options = (SubLObject)cb_inference_debugger.NIL;
        }
        final SubLObject inference_id = inference_datastructures_inference.inference_suid(inference);
        final SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
        final SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(store);
        if (cb_inference_debugger.NIL == linktext) {
            linktext = PrintLow.format((SubLObject)cb_inference_debugger.NIL, (SubLObject)cb_inference_debugger.$str14$_Debug_Inference__A__A_, store_id, inference_id);
        }
        final SubLObject options_glob_id = cb_parameters.cb_glob_id(options);
        cb_debug_handler_link((SubLObject)cb_inference_debugger.$str15$cb_debug_inference_handler, linktext, store_id, inference_id, (SubLObject)cb_inference_debugger.NIL, options_glob_id);
        return (SubLObject)cb_inference_debugger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 4912L)
    public static SubLObject cb_debug_inference_handler(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject store_id_string = (SubLObject)cb_inference_debugger.NIL;
        SubLObject inference_id_string = (SubLObject)cb_inference_debugger.NIL;
        SubLObject options_glob_id_string = (SubLObject)cb_inference_debugger.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_inference_debugger.$list18);
        store_id_string = args.first();
        SubLObject current = args.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, args, (SubLObject)cb_inference_debugger.$list18);
        inference_id_string = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, args, (SubLObject)cb_inference_debugger.$list18);
        options_glob_id_string = current.first();
        current = current.rest();
        if (cb_inference_debugger.NIL == current) {
            final SubLObject inference = cb_query.cb_guess_inference(store_id_string, inference_id_string);
            final SubLObject options = cb_lookup_options_by_glob_string(options_glob_id_string);
            if (cb_inference_debugger.NIL == inference_datastructures_inference.inference_p(inference)) {
                return cb_utilities.cb_error((SubLObject)cb_inference_debugger.$str19$_A_did_not_specify_an_inference, args, (SubLObject)cb_inference_debugger.UNPROVIDED, (SubLObject)cb_inference_debugger.UNPROVIDED, (SubLObject)cb_inference_debugger.UNPROVIDED, (SubLObject)cb_inference_debugger.UNPROVIDED);
            }
            if (cb_inference_debugger.NIL == list_utilities.plist_of_type_p(options, (SubLObject)cb_inference_debugger.$sym20$CB_DEBUG_OPTION_P)) {
                return cb_utilities.cb_error((SubLObject)cb_inference_debugger.$str21$_A_did_not_specify_valid_debugger, args, (SubLObject)cb_inference_debugger.UNPROVIDED, (SubLObject)cb_inference_debugger.UNPROVIDED, (SubLObject)cb_inference_debugger.UNPROVIDED, (SubLObject)cb_inference_debugger.UNPROVIDED);
            }
            html_utilities.html_markup((SubLObject)cb_inference_debugger.$str22$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_inference_debugger.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_inference_debugger.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_inference_debugger.$str23$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_inference_debugger.UNPROVIDED);
            final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_inference_debugger.$kw3$UNINITIALIZED) ? ConsesLow.list(cb_inference_debugger.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_inference_debugger.$kw24$CB_CYC);
                dhtml_macros.dhtml_with_dom_script();
                dhtml_macros.dhtml_with_toggle_visibility_support();
                dhtml_macros.basic_ajax_scripts();
                dhtml_macros.dhtml_creation_scripts();
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_inference_debugger.UNPROVIDED);
                final SubLObject _prev_bind_0_$1 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_inference_debugger.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inference_debugger.UNPROVIDED);
                    final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_inference_debugger.T, thread);
                        cb_inference_browser.cb_show_relevant_inference_debugging_links(inference);
                        html_utilities.html_princ_strong((SubLObject)cb_inference_debugger.$str25$Inference_Debugging_Tree_for_);
                        cb_utilities.cb_link((SubLObject)cb_inference_debugger.$kw26$INFERENCE, inference, (SubLObject)cb_inference_debugger.$kw27$VERY_VERBOSE, (SubLObject)cb_inference_debugger.UNPROVIDED, (SubLObject)cb_inference_debugger.UNPROVIDED, (SubLObject)cb_inference_debugger.UNPROVIDED);
                        cb_show_inference_debugger_option_tweaking_links(inference, inference_datastructures_inference.simplest_inference_strategy(inference), options);
                        html_utilities.html_hr((SubLObject)cb_inference_debugger.UNPROVIDED, (SubLObject)cb_inference_debugger.UNPROVIDED);
                        cb_debug_inference(inference, options);
                        html_utilities.html_source_readability_terpri((SubLObject)cb_inference_debugger.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$2, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_inference_debugger.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$1, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_inference_debugger.UNPROVIDED);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_inference_debugger.$list18);
        }
        return (SubLObject)cb_inference_debugger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 5705L)
    public static SubLObject cb_link_debug_problem(final SubLObject problem, final SubLObject strategic_context, SubLObject linktext, SubLObject options) {
        if (linktext == cb_inference_debugger.UNPROVIDED) {
            linktext = (SubLObject)cb_inference_debugger.NIL;
        }
        if (options == cb_inference_debugger.UNPROVIDED) {
            options = (SubLObject)cb_inference_debugger.NIL;
        }
        final SubLObject problem_id = inference_datastructures_problem.problem_suid(problem);
        final SubLObject strategic_context_id = inference_worker.strategic_context_suid(strategic_context);
        final SubLObject store = inference_datastructures_problem.problem_store(problem);
        final SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(store);
        if (cb_inference_debugger.NIL == linktext) {
            if (cb_inference_debugger.$kw30$TACTICAL == strategic_context) {
                linktext = PrintLow.format((SubLObject)cb_inference_debugger.NIL, (SubLObject)cb_inference_debugger.$str31$_Debug_Problem__A__A_, store_id, problem_id);
            }
            else {
                linktext = PrintLow.format((SubLObject)cb_inference_debugger.NIL, (SubLObject)cb_inference_debugger.$str32$_Debug_Problem__A__A_wrt_s_A_, new SubLObject[] { store_id, problem_id, strategic_context_id });
            }
        }
        final SubLObject options_glob_id = cb_parameters.cb_glob_id(options);
        cb_debug_handler_link((SubLObject)cb_inference_debugger.$str33$cb_debug_problem_handler, linktext, store_id, problem_id, strategic_context_id, options_glob_id);
        return (SubLObject)cb_inference_debugger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 6568L)
    public static SubLObject cb_debug_problem_handler(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject store_id_string = (SubLObject)cb_inference_debugger.NIL;
        SubLObject problem_id_string = (SubLObject)cb_inference_debugger.NIL;
        SubLObject strategic_context_id_string = (SubLObject)cb_inference_debugger.NIL;
        SubLObject options_glob_id_string = (SubLObject)cb_inference_debugger.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_inference_debugger.$list36);
        store_id_string = args.first();
        SubLObject current = args.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, args, (SubLObject)cb_inference_debugger.$list36);
        problem_id_string = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, args, (SubLObject)cb_inference_debugger.$list36);
        strategic_context_id_string = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, args, (SubLObject)cb_inference_debugger.$list36);
        options_glob_id_string = current.first();
        current = current.rest();
        if (cb_inference_debugger.NIL == current) {
            final SubLObject problem = cb_inference_browser.cb_guess_problem(store_id_string, problem_id_string);
            final SubLObject strategic_context = cb_inference_browser.cb_guess_strategic_context(store_id_string, strategic_context_id_string);
            final SubLObject options = cb_lookup_options_by_glob_string(options_glob_id_string);
            if (cb_inference_debugger.NIL == inference_datastructures_problem.problem_p(problem)) {
                return cb_utilities.cb_error((SubLObject)cb_inference_debugger.$str37$_A_did_not_specify_a_problem, args, (SubLObject)cb_inference_debugger.UNPROVIDED, (SubLObject)cb_inference_debugger.UNPROVIDED, (SubLObject)cb_inference_debugger.UNPROVIDED, (SubLObject)cb_inference_debugger.UNPROVIDED);
            }
            if (cb_inference_debugger.NIL == inference_worker.strategic_context_p(strategic_context)) {
                return cb_utilities.cb_error((SubLObject)cb_inference_debugger.$str38$_A_did_not_specify_a_strategic_co, args, (SubLObject)cb_inference_debugger.UNPROVIDED, (SubLObject)cb_inference_debugger.UNPROVIDED, (SubLObject)cb_inference_debugger.UNPROVIDED, (SubLObject)cb_inference_debugger.UNPROVIDED);
            }
            if (cb_inference_debugger.NIL == list_utilities.plist_of_type_p(options, (SubLObject)cb_inference_debugger.$sym20$CB_DEBUG_OPTION_P)) {
                return cb_utilities.cb_error((SubLObject)cb_inference_debugger.$str21$_A_did_not_specify_valid_debugger, args, (SubLObject)cb_inference_debugger.UNPROVIDED, (SubLObject)cb_inference_debugger.UNPROVIDED, (SubLObject)cb_inference_debugger.UNPROVIDED, (SubLObject)cb_inference_debugger.UNPROVIDED);
            }
            html_utilities.html_markup((SubLObject)cb_inference_debugger.$str22$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_inference_debugger.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_inference_debugger.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_inference_debugger.$str23$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_inference_debugger.UNPROVIDED);
            final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_inference_debugger.$kw3$UNINITIALIZED) ? ConsesLow.list(cb_inference_debugger.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_inference_debugger.$kw24$CB_CYC);
                dhtml_macros.dhtml_with_dom_script();
                dhtml_macros.dhtml_with_toggle_visibility_support();
                dhtml_macros.basic_ajax_scripts();
                dhtml_macros.dhtml_creation_scripts();
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_inference_debugger.UNPROVIDED);
                final SubLObject _prev_bind_0_$3 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_inference_debugger.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inference_debugger.UNPROVIDED);
                    final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_inference_debugger.T, thread);
                        cb_inference_browser.cb_show_relevant_inference_debugging_links(problem);
                        html_utilities.html_princ_strong((SubLObject)cb_inference_debugger.$str25$Inference_Debugging_Tree_for_);
                        cb_utilities.cb_link((SubLObject)cb_inference_debugger.$kw39$PROBLEM, problem, (SubLObject)cb_inference_debugger.UNPROVIDED, (SubLObject)cb_inference_debugger.UNPROVIDED, (SubLObject)cb_inference_debugger.UNPROVIDED, (SubLObject)cb_inference_debugger.UNPROVIDED);
                        if (cb_inference_debugger.NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
                            html_utilities.html_princ((SubLObject)cb_inference_debugger.$str40$_wrt_);
                            cb_utilities.cb_link((SubLObject)cb_inference_debugger.$kw41$STRATEGY, strategic_context, (SubLObject)cb_inference_debugger.UNPROVIDED, (SubLObject)cb_inference_debugger.UNPROVIDED, (SubLObject)cb_inference_debugger.UNPROVIDED, (SubLObject)cb_inference_debugger.UNPROVIDED);
                        }
                        cb_show_inference_debugger_option_tweaking_links(problem, strategic_context, options);
                        html_utilities.html_hr((SubLObject)cb_inference_debugger.UNPROVIDED, (SubLObject)cb_inference_debugger.UNPROVIDED);
                        cb_debug_problem(problem, strategic_context, options);
                        html_utilities.html_source_readability_terpri((SubLObject)cb_inference_debugger.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_inference_debugger.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$3, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_inference_debugger.UNPROVIDED);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_inference_debugger.$list36);
        }
        return (SubLObject)cb_inference_debugger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 7682L)
    public static SubLObject cb_link_debug_problem_link(final SubLObject link, final SubLObject strategic_context, SubLObject linktext, SubLObject options) {
        if (linktext == cb_inference_debugger.UNPROVIDED) {
            linktext = (SubLObject)cb_inference_debugger.NIL;
        }
        if (options == cb_inference_debugger.UNPROVIDED) {
            options = (SubLObject)cb_inference_debugger.NIL;
        }
        final SubLObject link_id = inference_datastructures_problem_link.problem_link_suid(link);
        final SubLObject strategic_context_id = inference_worker.strategic_context_suid(strategic_context);
        final SubLObject store = inference_datastructures_problem_link.problem_link_store(link);
        final SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(store);
        if (cb_inference_debugger.NIL == linktext) {
            if (strategic_context == cb_inference_debugger.$kw30$TACTICAL) {
                linktext = PrintLow.format((SubLObject)cb_inference_debugger.NIL, (SubLObject)cb_inference_debugger.$str43$_Debug_Link__A__A_, store_id, link_id);
            }
            else {
                linktext = PrintLow.format((SubLObject)cb_inference_debugger.NIL, (SubLObject)cb_inference_debugger.$str44$_Debug_Link__A__A_wrt_s_A_, new SubLObject[] { store_id, link_id, strategic_context_id });
            }
        }
        final SubLObject options_glob_id = cb_parameters.cb_glob_id(options);
        cb_debug_handler_link((SubLObject)cb_inference_debugger.$str45$cb_debug_problem_link_handler, linktext, store_id, link_id, strategic_context_id, options_glob_id);
        return (SubLObject)cb_inference_debugger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 8538L)
    public static SubLObject cb_debug_problem_link_handler(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject store_id_string = (SubLObject)cb_inference_debugger.NIL;
        SubLObject link_id_string = (SubLObject)cb_inference_debugger.NIL;
        SubLObject strategic_context_id_string = (SubLObject)cb_inference_debugger.NIL;
        SubLObject options_glob_id_string = (SubLObject)cb_inference_debugger.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_inference_debugger.$list48);
        store_id_string = args.first();
        SubLObject current = args.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, args, (SubLObject)cb_inference_debugger.$list48);
        link_id_string = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, args, (SubLObject)cb_inference_debugger.$list48);
        strategic_context_id_string = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, args, (SubLObject)cb_inference_debugger.$list48);
        options_glob_id_string = current.first();
        current = current.rest();
        if (cb_inference_debugger.NIL == current) {
            final SubLObject link = cb_inference_browser.cb_guess_problem_link(store_id_string, link_id_string);
            final SubLObject strategic_context = cb_inference_browser.cb_guess_strategic_context(store_id_string, strategic_context_id_string);
            final SubLObject options = cb_lookup_options_by_glob_string(options_glob_id_string);
            if (cb_inference_debugger.NIL == inference_datastructures_problem_link.problem_link_p(link)) {
                return cb_utilities.cb_error((SubLObject)cb_inference_debugger.$str49$_A_did_not_specify_a_link, args, (SubLObject)cb_inference_debugger.UNPROVIDED, (SubLObject)cb_inference_debugger.UNPROVIDED, (SubLObject)cb_inference_debugger.UNPROVIDED, (SubLObject)cb_inference_debugger.UNPROVIDED);
            }
            if (cb_inference_debugger.NIL == inference_worker.strategic_context_p(strategic_context)) {
                return cb_utilities.cb_error((SubLObject)cb_inference_debugger.$str38$_A_did_not_specify_a_strategic_co, args, (SubLObject)cb_inference_debugger.UNPROVIDED, (SubLObject)cb_inference_debugger.UNPROVIDED, (SubLObject)cb_inference_debugger.UNPROVIDED, (SubLObject)cb_inference_debugger.UNPROVIDED);
            }
            if (cb_inference_debugger.NIL == list_utilities.plist_of_type_p(options, (SubLObject)cb_inference_debugger.$sym20$CB_DEBUG_OPTION_P)) {
                return cb_utilities.cb_error((SubLObject)cb_inference_debugger.$str21$_A_did_not_specify_valid_debugger, args, (SubLObject)cb_inference_debugger.UNPROVIDED, (SubLObject)cb_inference_debugger.UNPROVIDED, (SubLObject)cb_inference_debugger.UNPROVIDED, (SubLObject)cb_inference_debugger.UNPROVIDED);
            }
            html_utilities.html_markup((SubLObject)cb_inference_debugger.$str22$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_inference_debugger.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_inference_debugger.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_inference_debugger.$str23$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_inference_debugger.UNPROVIDED);
            final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_inference_debugger.$kw3$UNINITIALIZED) ? ConsesLow.list(cb_inference_debugger.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_inference_debugger.$kw24$CB_CYC);
                dhtml_macros.dhtml_with_dom_script();
                dhtml_macros.dhtml_with_toggle_visibility_support();
                dhtml_macros.basic_ajax_scripts();
                dhtml_macros.dhtml_creation_scripts();
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_inference_debugger.UNPROVIDED);
                final SubLObject _prev_bind_0_$5 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_inference_debugger.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inference_debugger.UNPROVIDED);
                    final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_inference_debugger.T, thread);
                        cb_inference_browser.cb_show_relevant_inference_debugging_links(link);
                        html_utilities.html_princ_strong((SubLObject)cb_inference_debugger.$str25$Inference_Debugging_Tree_for_);
                        cb_utilities.cb_link((SubLObject)cb_inference_debugger.$kw50$PROBLEM_LINK, link, (SubLObject)cb_inference_debugger.$kw51$VERBOSE, (SubLObject)cb_inference_debugger.UNPROVIDED, (SubLObject)cb_inference_debugger.UNPROVIDED, (SubLObject)cb_inference_debugger.UNPROVIDED);
                        if (cb_inference_debugger.NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
                            html_utilities.html_princ((SubLObject)cb_inference_debugger.$str40$_wrt_);
                            cb_utilities.cb_link((SubLObject)cb_inference_debugger.$kw41$STRATEGY, strategic_context, (SubLObject)cb_inference_debugger.UNPROVIDED, (SubLObject)cb_inference_debugger.UNPROVIDED, (SubLObject)cb_inference_debugger.UNPROVIDED, (SubLObject)cb_inference_debugger.UNPROVIDED);
                        }
                        cb_show_inference_debugger_option_tweaking_links(link, strategic_context, options);
                        html_utilities.html_hr((SubLObject)cb_inference_debugger.UNPROVIDED, (SubLObject)cb_inference_debugger.UNPROVIDED);
                        cb_debug_problem_link(link, strategic_context, options);
                        html_utilities.html_source_readability_terpri((SubLObject)cb_inference_debugger.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_inference_debugger.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$5, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_inference_debugger.UNPROVIDED);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_inference_debugger.$list48);
        }
        return (SubLObject)cb_inference_debugger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 9662L)
    public static SubLObject cb_debug_handler_link(final SubLObject handler_string, final SubLObject linktext, final SubLObject store_id, final SubLObject object_id, final SubLObject strategic_context_id, final SubLObject options_glob_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_inference_debugger.$kw53$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        if (cb_inference_debugger.NIL != strategic_context_id) {
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_inference_debugger.$str54$_A__A__A__A__A, new SubLObject[] { handler_string, store_id, object_id, strategic_context_id, options_glob_id });
        }
        else {
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_inference_debugger.$str55$_A__A__A__A, new SubLObject[] { handler_string, store_id, object_id, options_glob_id });
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
        if (cb_inference_debugger.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inference_debugger.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_inference_debugger.T, thread);
            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            if (linktext.isKeyword()) {
                final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path(linktext);
                final SubLObject align = (SubLObject)cb_inference_debugger.$kw56$TOP;
                final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string(linktext);
                final SubLObject border = (SubLObject)cb_inference_debugger.ZERO_INTEGER;
                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
                html_utilities.html_markup(image_src);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
                if (cb_inference_debugger.NIL != alt) {
                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
                    html_utilities.html_markup(alt);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
                }
                if (cb_inference_debugger.NIL != align) {
                    html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align(align));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
                }
                if (cb_inference_debugger.NIL != border) {
                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
                    html_utilities.html_markup(border);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inference_debugger.UNPROVIDED);
                final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_inference_debugger.T, thread);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                }
                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
            }
            else {
                html_utilities.html_princ(linktext);
            }
            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_inference_debugger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 10141L)
    public static SubLObject cb_debug_link(final SubLObject v_object, final SubLObject strategic_context, final SubLObject linktext, final SubLObject options) {
        SubLObject keyword = (SubLObject)cb_inference_debugger.NIL;
        if (cb_inference_debugger.NIL != inference_datastructures_problem.problem_p(v_object)) {
            keyword = (SubLObject)cb_inference_debugger.$kw34$DEBUG_PROBLEM;
        }
        else if (cb_inference_debugger.NIL != inference_datastructures_problem_link.problem_link_p(v_object)) {
            keyword = (SubLObject)cb_inference_debugger.$kw46$DEBUG_PROBLEM_LINK;
        }
        else if (cb_inference_debugger.NIL != inference_datastructures_inference.inference_p(v_object)) {
            keyword = (SubLObject)cb_inference_debugger.$kw16$DEBUG_INFERENCE;
        }
        else {
            Errors.error((SubLObject)cb_inference_debugger.$str57$Unexpected_cb_debug_link_object__, v_object);
        }
        SubLObject arg2 = (SubLObject)cb_inference_debugger.NIL;
        SubLObject arg3 = (SubLObject)cb_inference_debugger.NIL;
        SubLObject arg4 = (SubLObject)cb_inference_debugger.NIL;
        final SubLObject arg5 = (SubLObject)cb_inference_debugger.NIL;
        if (cb_inference_debugger.$kw16$DEBUG_INFERENCE == keyword) {
            arg2 = linktext;
            arg3 = options;
        }
        else {
            arg2 = strategic_context;
            arg3 = linktext;
            arg4 = options;
        }
        cb_utilities.cb_link(keyword, v_object, arg2, arg3, arg4, arg5);
        return (SubLObject)cb_inference_debugger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 10758L)
    public static SubLObject cb_lookup_options_by_glob_string(final SubLObject string) {
        final SubLObject options = cb_parameters.cb_glob_lookup_by_string(string);
        cb_inference_debugger.$cb_current_debug_options$.setDynamicValue(options);
        return options;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 12336L)
    public static SubLObject cb_debug_option_p(final SubLObject v_object) {
        return list_utilities.alist_has_keyP(cb_inference_debugger.$cb_debug_options$.getGlobalValue(), v_object, (SubLObject)cb_inference_debugger.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 12432L)
    public static SubLObject cb_debug_option_default(final SubLObject option) {
        assert cb_inference_debugger.NIL != cb_debug_option_p(option) : option;
        return list_utilities.alist_lookup_without_values(cb_inference_debugger.$cb_debug_options$.getGlobalValue(), option, (SubLObject)cb_inference_debugger.UNPROVIDED, (SubLObject)cb_inference_debugger.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 12587L)
    public static SubLObject cb_debug_option_value(final SubLObject option, final SubLObject options) {
        assert cb_inference_debugger.NIL != cb_debug_option_p(option) : option;
        return list_utilities.plist_lookup(options, option, cb_debug_option_default(option));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 12870L)
    public static SubLObject cb_show_inference_debugger_option_tweaking_links(final SubLObject v_object, final SubLObject strategic_context, final SubLObject options) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_newline((SubLObject)cb_inference_debugger.UNPROVIDED);
        if (cb_inference_debugger.NIL == inference_datastructures_inference.inference_p(v_object)) {
            cb_show_ancestor_depth_tweaking_links(v_object, strategic_context, options);
            html_utilities.html_indent((SubLObject)cb_inference_debugger.TWO_INTEGER);
            cb_show_option_tweaking_links(v_object, strategic_context, options, (SubLObject)cb_inference_debugger.$kw60$SHOW_SIBLINGS_, (SubLObject)cb_inference_debugger.$str61$Siblings_, cb_inference_debugger.$cb_show_hide_value_linktext_pairs$.getGlobalValue());
            html_utilities.html_indent((SubLObject)cb_inference_debugger.TWO_INTEGER);
            cb_show_option_tweaking_links(v_object, strategic_context, options, (SubLObject)cb_inference_debugger.$kw62$SHOW_AUNTS_, (SubLObject)cb_inference_debugger.$str63$Aunts_, cb_inference_debugger.$cb_show_hide_value_linktext_pairs$.getGlobalValue());
            html_utilities.html_indent((SubLObject)cb_inference_debugger.TWO_INTEGER);
        }
        cb_show_option_tweaking_links(v_object, strategic_context, options, (SubLObject)cb_inference_debugger.$kw64$DEBUG_NON_NEW_ROOTS_, (SubLObject)cb_inference_debugger.$str65$Non_New_Roots_, cb_inference_debugger.$cb_show_hide_value_linktext_pairs$.getGlobalValue());
        html_utilities.html_indent((SubLObject)cb_inference_debugger.TWO_INTEGER);
        cb_show_option_tweaking_links(v_object, strategic_context, options, (SubLObject)cb_inference_debugger.$kw66$DEBUG_GOOD_PROBLEMS_, (SubLObject)cb_inference_debugger.$str67$Good_Problems_, (SubLObject)cb_inference_debugger.$list68);
        html_utilities.html_indent((SubLObject)cb_inference_debugger.TWO_INTEGER);
        cb_show_option_tweaking_links(v_object, strategic_context, options, (SubLObject)cb_inference_debugger.$kw69$SHOW_WHICH_QUERIES, (SubLObject)cb_inference_debugger.$str70$Queries_, (SubLObject)cb_inference_debugger.$list71);
        html_utilities.html_indent((SubLObject)cb_inference_debugger.TWO_INTEGER);
        cb_show_option_tweaking_links(v_object, strategic_context, options, (SubLObject)cb_inference_debugger.$kw72$SHOW_RULES_, (SubLObject)cb_inference_debugger.$str73$Rules_, cb_inference_debugger.$cb_show_hide_value_linktext_pairs$.getGlobalValue());
        html_utilities.html_indent((SubLObject)cb_inference_debugger.TWO_INTEGER);
        SubLObject image_src = Sequences.cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src((SubLObject)cb_inference_debugger.$kw74$SQUARE_PLUS));
        SubLObject align = (SubLObject)cb_inference_debugger.$kw56$TOP;
        SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string((SubLObject)cb_inference_debugger.$kw74$SQUARE_PLUS);
        SubLObject border = (SubLObject)cb_inference_debugger.ZERO_INTEGER;
        html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
        html_utilities.html_markup(image_src);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
        if (cb_inference_debugger.NIL != alt) {
            html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
            html_utilities.html_markup(alt);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
        }
        if (cb_inference_debugger.NIL != align) {
            html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
            html_utilities.html_markup(html_utilities.html_align(align));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
        }
        if (cb_inference_debugger.NIL != border) {
            html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
            html_utilities.html_markup(border);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inference_debugger.UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_inference_debugger.T, thread);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
        image_src = Sequences.cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src((SubLObject)cb_inference_debugger.$kw76$SQUARE_MINUS));
        align = (SubLObject)cb_inference_debugger.$kw56$TOP;
        alt = cyc_file_dependencies.get_html_icon_alt_string((SubLObject)cb_inference_debugger.$kw76$SQUARE_MINUS);
        border = (SubLObject)cb_inference_debugger.ZERO_INTEGER;
        html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
        html_utilities.html_markup(image_src);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
        if (cb_inference_debugger.NIL != alt) {
            html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
            html_utilities.html_markup(alt);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
        }
        if (cb_inference_debugger.NIL != align) {
            html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
            html_utilities.html_markup(html_utilities.html_align(align));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
        }
        if (cb_inference_debugger.NIL != border) {
            html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
            html_utilities.html_markup(border);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inference_debugger.UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_inference_debugger.T, thread);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_inference_debugger.$str77$_);
        cb_show_option_tweaking_links(v_object, strategic_context, options, (SubLObject)cb_inference_debugger.$kw78$DHTML_VISIBILITY, (SubLObject)cb_inference_debugger.$str79$, (SubLObject)cb_inference_debugger.$list80);
        return (SubLObject)cb_inference_debugger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 14364L)
    public static SubLObject cb_show_ancestor_depth_tweaking_links(final SubLObject v_object, final SubLObject strategic_context, final SubLObject options) {
        html_utilities.html_princ((SubLObject)cb_inference_debugger.$str81$Ancestor_Depth_);
        SubLObject cdolist_list_var = (SubLObject)cb_inference_debugger.$list85;
        SubLObject depth = (SubLObject)cb_inference_debugger.NIL;
        depth = cdolist_list_var.first();
        while (cb_inference_debugger.NIL != cdolist_list_var) {
            final SubLObject linktext = Sequences.cconcatenate((SubLObject)cb_inference_debugger.$str82$_, new SubLObject[] { format_nil.format_nil_a_no_copy(depth), cb_inference_debugger.$str83$_ });
            cb_show_option_tweaking_link(v_object, strategic_context, options, (SubLObject)cb_inference_debugger.$kw84$ANCESTOR_DEPTH, depth, linktext);
            cdolist_list_var = cdolist_list_var.rest();
            depth = cdolist_list_var.first();
        }
        return (SubLObject)cb_inference_debugger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 14692L)
    public static SubLObject cb_show_option_tweaking_links(final SubLObject v_object, final SubLObject strategic_context, final SubLObject options, final SubLObject option, final SubLObject label, final SubLObject value_linktext_pairs) {
        html_utilities.html_princ(label);
        SubLObject cdolist_list_var = value_linktext_pairs;
        SubLObject pair = (SubLObject)cb_inference_debugger.NIL;
        pair = cdolist_list_var.first();
        while (cb_inference_debugger.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject value = (SubLObject)cb_inference_debugger.NIL;
            SubLObject linktext = (SubLObject)cb_inference_debugger.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_inference_debugger.$list86);
            value = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_inference_debugger.$list86);
            linktext = current.first();
            current = current.rest();
            if (cb_inference_debugger.NIL == current) {
                html_utilities.html_indent((SubLObject)cb_inference_debugger.UNPROVIDED);
                cb_show_option_tweaking_link(v_object, strategic_context, options, option, value, linktext);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_inference_debugger.$list86);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        }
        return (SubLObject)cb_inference_debugger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 15042L)
    public static SubLObject cb_show_option_tweaking_link(final SubLObject v_object, final SubLObject strategic_context, final SubLObject options, final SubLObject option, final SubLObject value, final SubLObject linktext) {
        final SubLObject current_value = cb_debug_option_value(option, options);
        final SubLObject sameP = Equality.eq(value, current_value);
        SubLObject new_options = (cb_inference_debugger.NIL != sameP) ? options : conses_high.copy_list(options);
        if (cb_inference_debugger.NIL == sameP) {
            new_options = conses_high.putf(new_options, option, value);
        }
        final SubLObject strong_var = sameP;
        final SubLObject head = (cb_inference_debugger.NIL != strong_var) ? html_macros.$html_strong_head$.getGlobalValue() : string_utilities.$empty_string$.getGlobalValue();
        final SubLObject tail = (cb_inference_debugger.NIL != strong_var) ? html_macros.$html_strong_tail$.getGlobalValue() : string_utilities.$empty_string$.getGlobalValue();
        html_utilities.html_markup(head);
        cb_debug_link(v_object, strategic_context, linktext, new_options);
        html_utilities.html_markup(tail);
        return (SubLObject)cb_inference_debugger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 15491L)
    public static SubLObject cb_debug_inference(final SubLObject inference, final SubLObject options) {
        assert cb_inference_debugger.NIL != list_utilities.property_list_p(options) : options;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = (SubLObject)cb_inference_debugger.NIL, remainder = options; cb_inference_debugger.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            assert cb_inference_debugger.NIL != cb_debug_option_p(property) : property;
        }
        return cb_debug_problem_link(inference_datastructures_inference.inference_root_link(inference), inference_datastructures_inference.simplest_inference_strategy(inference), options);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 15744L)
    public static SubLObject cb_debug_problem(final SubLObject problem, final SubLObject strategic_context, final SubLObject options) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_inference_debugger.NIL != list_utilities.property_list_p(options) : options;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = (SubLObject)cb_inference_debugger.NIL, remainder = options; cb_inference_debugger.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            assert cb_inference_debugger.NIL != cb_debug_option_p(property) : property;
        }
        thread.resetMultipleValues();
        final SubLObject ancestor_layers = cb_debug_compute_ancestor_layers(problem, options);
        final SubLObject ancestors_to_display = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject _prev_bind_0 = cb_inference_debugger.$cb_debug_depth$.currentBinding(thread);
        final SubLObject _prev_bind_2 = cb_inference_debugger.$cb_debug_tree$.currentBinding(thread);
        final SubLObject _prev_bind_3 = cb_inference_debugger.$cb_debug_duplicate_tree$.currentBinding(thread);
        try {
            cb_inference_debugger.$cb_debug_depth$.bind((SubLObject)cb_inference_debugger.ZERO_INTEGER, thread);
            cb_inference_debugger.$cb_debug_tree$.bind((SubLObject)cb_inference_debugger.NIL, thread);
            cb_inference_debugger.$cb_debug_duplicate_tree$.bind(set.new_set(Symbols.symbol_function((SubLObject)cb_inference_debugger.EQ), (SubLObject)cb_inference_debugger.UNPROVIDED), thread);
            if (cb_inference_debugger.NIL != ancestor_layers) {
                cb_debug_ancestors(ancestor_layers, strategic_context, problem, ancestors_to_display, options);
            }
            else {
                cb_debug_problem_int(problem, strategic_context, problem, (SubLObject)cb_inference_debugger.NIL, options);
            }
            cb_debug_display_tree(Sequences.nreverse(cb_inference_debugger.$cb_debug_tree$.getDynamicValue(thread)), strategic_context, options);
        }
        finally {
            cb_inference_debugger.$cb_debug_duplicate_tree$.rebind(_prev_bind_3, thread);
            cb_inference_debugger.$cb_debug_tree$.rebind(_prev_bind_2, thread);
            cb_inference_debugger.$cb_debug_depth$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_inference_debugger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 16391L)
    public static SubLObject cb_debug_problem_link(final SubLObject link, final SubLObject strategic_context, final SubLObject options) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_inference_debugger.NIL != list_utilities.property_list_p(options) : options;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = (SubLObject)cb_inference_debugger.NIL, remainder = options; cb_inference_debugger.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            assert cb_inference_debugger.NIL != cb_debug_option_p(property) : property;
        }
        final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
        SubLObject ancestor_layers = (SubLObject)cb_inference_debugger.NIL;
        SubLObject ancestors_to_display = (SubLObject)cb_inference_debugger.NIL;
        if (cb_inference_debugger.NIL != supported_problem) {
            thread.resetMultipleValues();
            final SubLObject ancestor_layers_$8 = cb_debug_compute_ancestor_layers(supported_problem, options);
            final SubLObject ancestors_to_display_$9 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            ancestor_layers = ancestor_layers_$8;
            ancestors_to_display = ancestors_to_display_$9;
            set.set_add(link, ancestors_to_display);
        }
        final SubLObject _prev_bind_0 = cb_inference_debugger.$cb_debug_depth$.currentBinding(thread);
        final SubLObject _prev_bind_2 = cb_inference_debugger.$cb_debug_tree$.currentBinding(thread);
        final SubLObject _prev_bind_3 = cb_inference_debugger.$cb_debug_duplicate_tree$.currentBinding(thread);
        try {
            cb_inference_debugger.$cb_debug_depth$.bind((SubLObject)cb_inference_debugger.ZERO_INTEGER, thread);
            cb_inference_debugger.$cb_debug_tree$.bind((SubLObject)cb_inference_debugger.NIL, thread);
            cb_inference_debugger.$cb_debug_duplicate_tree$.bind(set.new_set(Symbols.symbol_function((SubLObject)cb_inference_debugger.EQ), (SubLObject)cb_inference_debugger.UNPROVIDED), thread);
            if (cb_inference_debugger.NIL != ancestor_layers) {
                cb_debug_ancestors(ancestor_layers, strategic_context, link, ancestors_to_display, options);
            }
            else {
                cb_debug_problem_link_int(link, strategic_context, link, (SubLObject)cb_inference_debugger.NIL, options);
            }
            cb_debug_display_tree(Sequences.nreverse(cb_inference_debugger.$cb_debug_tree$.getDynamicValue(thread)), strategic_context, options);
        }
        finally {
            cb_inference_debugger.$cb_debug_duplicate_tree$.rebind(_prev_bind_3, thread);
            cb_inference_debugger.$cb_debug_tree$.rebind(_prev_bind_2, thread);
            cb_inference_debugger.$cb_debug_depth$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_inference_debugger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 17229L)
    public static SubLObject cb_debug_ancestors(final SubLObject ancestor_layers, final SubLObject strategic_context, final SubLObject focal_object, final SubLObject ancestors_to_display, final SubLObject options) {
        final SubLObject first_layer = ancestor_layers.first();
        if (cb_inference_debugger.NIL != set.set_emptyP(first_layer)) {
            final SubLObject set_var = conses_high.second(ancestor_layers);
            final SubLObject set_contents_var = set.do_set_internal(set_var);
            SubLObject basis_object;
            SubLObject state;
            SubLObject root_link;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)cb_inference_debugger.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); cb_inference_debugger.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                root_link = set_contents.do_set_contents_next(basis_object, state);
                if (cb_inference_debugger.NIL != set_contents.do_set_contents_element_validP(state, root_link)) {
                    cb_debug_problem_link_int(root_link, strategic_context, focal_object, ancestors_to_display, options);
                }
            }
        }
        else {
            final SubLObject set_contents_var2 = set.do_set_internal(first_layer);
            SubLObject basis_object2;
            SubLObject state2;
            SubLObject root_problem;
            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)cb_inference_debugger.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); cb_inference_debugger.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                root_problem = set_contents.do_set_contents_next(basis_object2, state2);
                if (cb_inference_debugger.NIL != set_contents.do_set_contents_element_validP(state2, root_problem)) {
                    cb_debug_problem_int(root_problem, strategic_context, focal_object, ancestors_to_display, options);
                }
            }
        }
        return (SubLObject)cb_inference_debugger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 17742L)
    public static SubLObject cb_debug_compute_ancestor_layers(final SubLObject start_problem, final SubLObject options) {
        SubLObject layer = set.new_set(Symbols.symbol_function((SubLObject)cb_inference_debugger.EQ), (SubLObject)cb_inference_debugger.ONE_INTEGER);
        final SubLObject all_ancestors_set = set.new_set(Symbols.symbol_function((SubLObject)cb_inference_debugger.EQ), (SubLObject)cb_inference_debugger.ONE_INTEGER);
        SubLObject ancestor_layers = (SubLObject)cb_inference_debugger.NIL;
        final SubLObject ancestor_depth = cb_debug_option_value((SubLObject)cb_inference_debugger.$kw84$ANCESTOR_DEPTH, options);
        set.set_add(start_problem, layer);
        set.set_add(start_problem, all_ancestors_set);
        while (cb_inference_debugger.NIL == set.set_emptyP(layer) && !ancestor_depth.numE(Numbers.integerDivide(Sequences.length(ancestor_layers), (SubLObject)cb_inference_debugger.TWO_INTEGER))) {
            final SubLObject new_layer = set.new_set(Symbols.symbol_function((SubLObject)cb_inference_debugger.EQ), (SubLObject)cb_inference_debugger.UNPROVIDED);
            if (cb_inference_debugger.NIL != inference_datastructures_problem.problem_p(set_utilities.set_arbitrary_element(layer))) {
                final SubLObject set_contents_var = set.do_set_internal(layer);
                SubLObject basis_object;
                SubLObject state;
                SubLObject problem;
                SubLObject set_contents_var_$10;
                SubLObject basis_object_$11;
                SubLObject state_$12;
                SubLObject link;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)cb_inference_debugger.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); cb_inference_debugger.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    problem = set_contents.do_set_contents_next(basis_object, state);
                    if (cb_inference_debugger.NIL != set_contents.do_set_contents_element_validP(state, problem)) {
                        set_contents_var_$10 = inference_datastructures_problem.problem_dependent_links(problem);
                        for (basis_object_$11 = set_contents.do_set_contents_basis_object(set_contents_var_$10), state_$12 = (SubLObject)cb_inference_debugger.NIL, state_$12 = set_contents.do_set_contents_initial_state(basis_object_$11, set_contents_var_$10); cb_inference_debugger.NIL == set_contents.do_set_contents_doneP(basis_object_$11, state_$12); state_$12 = set_contents.do_set_contents_update_state(state_$12)) {
                            link = set_contents.do_set_contents_next(basis_object_$11, state_$12);
                            if (cb_inference_debugger.NIL != set_contents.do_set_contents_element_validP(state_$12, link) && cb_inference_debugger.NIL == set.set_memberP(link, all_ancestors_set)) {
                                set.set_add(link, new_layer);
                                set.set_add(link, all_ancestors_set);
                            }
                        }
                    }
                }
            }
            else {
                final SubLObject set_contents_var = set.do_set_internal(layer);
                SubLObject basis_object;
                SubLObject state;
                SubLObject link2;
                SubLObject problem2;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)cb_inference_debugger.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); cb_inference_debugger.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    link2 = set_contents.do_set_contents_next(basis_object, state);
                    if (cb_inference_debugger.NIL != set_contents.do_set_contents_element_validP(state, link2)) {
                        problem2 = inference_datastructures_problem_link.problem_link_supported_object(link2);
                        if (cb_inference_debugger.NIL != inference_datastructures_problem.problem_p(problem2) && cb_inference_debugger.NIL == set.set_memberP(problem2, all_ancestors_set)) {
                            set.set_add(problem2, new_layer);
                            set.set_add(problem2, all_ancestors_set);
                        }
                    }
                }
            }
            ancestor_layers = (SubLObject)ConsesLow.cons(new_layer, ancestor_layers);
            layer = new_layer;
        }
        if (cb_inference_debugger.NIL != cb_debug_option_value((SubLObject)cb_inference_debugger.$kw60$SHOW_SIBLINGS_, options)) {
            final SubLObject parents_set = list_utilities.nth_from_end((SubLObject)cb_inference_debugger.ONE_INTEGER, ancestor_layers);
            if (cb_inference_debugger.NIL != parents_set) {
                final SubLObject set_contents_var = set.do_set_internal(parents_set);
                SubLObject basis_object;
                SubLObject state;
                SubLObject parent_problem;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)cb_inference_debugger.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); cb_inference_debugger.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    parent_problem = set_contents.do_set_contents_next(basis_object, state);
                    if (cb_inference_debugger.NIL != set_contents.do_set_contents_element_validP(state, parent_problem)) {
                        cb_debug_add_children_and_links_to_set(parent_problem, all_ancestors_set);
                    }
                }
            }
        }
        if (cb_inference_debugger.NIL != cb_debug_option_value((SubLObject)cb_inference_debugger.$kw62$SHOW_AUNTS_, options)) {
            final SubLObject grandparents_set = list_utilities.nth_from_end((SubLObject)cb_inference_debugger.THREE_INTEGER, ancestor_layers);
            if (cb_inference_debugger.NIL != grandparents_set) {
                final SubLObject set_contents_var = set.do_set_internal(grandparents_set);
                SubLObject basis_object;
                SubLObject state;
                SubLObject grandparent_problem;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)cb_inference_debugger.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); cb_inference_debugger.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    grandparent_problem = set_contents.do_set_contents_next(basis_object, state);
                    if (cb_inference_debugger.NIL != set_contents.do_set_contents_element_validP(state, grandparent_problem)) {
                        cb_debug_add_children_and_links_to_set(grandparent_problem, all_ancestors_set);
                    }
                }
            }
        }
        return Values.values(ancestor_layers, all_ancestors_set);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 19700L)
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
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)cb_inference_debugger.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); cb_inference_debugger.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            child_link = set_contents.do_set_contents_next(basis_object, state);
            if (cb_inference_debugger.NIL != set_contents.do_set_contents_element_validP(state, child_link)) {
                set.set_add(child_link, v_set);
                link_var = child_link;
                cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
                supporting_mapped_problem = (SubLObject)cb_inference_debugger.NIL;
                supporting_mapped_problem = cdolist_list_var.first();
                while (cb_inference_debugger.NIL != cdolist_list_var) {
                    if (cb_inference_debugger.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)cb_inference_debugger.NIL, link_var, supporting_mapped_problem)) {
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
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 20007L)
    public static SubLObject cb_debug_problem_int(final SubLObject problem, final SubLObject strategic_context, final SubLObject focal_object, final SubLObject display_only_these, final SubLObject options) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_inference_debugger.NIL != display_only_these && cb_inference_debugger.NIL == set.set_memberP(problem, display_only_these)) {
            return (SubLObject)cb_inference_debugger.NIL;
        }
        final SubLObject ellipsisP = (SubLObject)SubLObjectFactory.makeBoolean(cb_inference_debugger.NIL == set.set_add(problem, cb_inference_debugger.$cb_debug_duplicate_tree$.getDynamicValue(thread)));
        final SubLObject pcase_var = inference_datastructures_strategy.problem_provability_status(problem, strategic_context);
        if (pcase_var.eql((SubLObject)cb_inference_debugger.$kw88$GOOD)) {
            final SubLObject debug_goodsP = cb_debug_option_value((SubLObject)cb_inference_debugger.$kw66$DEBUG_GOOD_PROBLEMS_, options);
            cb_debug_problem_parametrized(problem, strategic_context, debug_goodsP, debug_goodsP, ellipsisP, focal_object, display_only_these, options);
        }
        else if (pcase_var.eql((SubLObject)cb_inference_debugger.$kw89$NEUTRAL)) {
            cb_debug_problem_parametrized(problem, strategic_context, (SubLObject)cb_inference_debugger.T, (SubLObject)cb_inference_debugger.T, ellipsisP, focal_object, display_only_these, options);
        }
        else if (pcase_var.eql((SubLObject)cb_inference_debugger.$kw90$NO_GOOD)) {
            cb_debug_problem_parametrized(problem, strategic_context, (SubLObject)cb_inference_debugger.T, (SubLObject)cb_inference_debugger.NIL, ellipsisP, focal_object, display_only_these, options);
        }
        return (SubLObject)cb_inference_debugger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 21050L)
    public static SubLObject cb_debug_problem_parametrized(final SubLObject problem, final SubLObject strategic_context, final SubLObject show_queryP, SubLObject compute_and_show_argument_linksP, final SubLObject ellipsisP, final SubLObject focal_object, SubLObject display_only_these, final SubLObject options) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject is_focal_objectP = (SubLObject)cb_inference_debugger.NIL;
        if (problem.eql(focal_object)) {
            is_focal_objectP = (SubLObject)cb_inference_debugger.T;
            display_only_these = (SubLObject)cb_inference_debugger.NIL;
        }
        if (cb_inference_debugger.NIL != display_only_these) {
            compute_and_show_argument_linksP = (SubLObject)cb_inference_debugger.T;
        }
        if (cb_inference_debugger.NIL != ellipsisP) {
            compute_and_show_argument_linksP = (SubLObject)cb_inference_debugger.NIL;
        }
        SubLObject argument_links = (SubLObject)cb_inference_debugger.NIL;
        if (cb_inference_debugger.NIL != compute_and_show_argument_linksP) {
            SubLObject cdolist_list_var;
            final SubLObject all_argument_links = cdolist_list_var = inference_datastructures_problem.problem_all_argument_links(problem);
            SubLObject link = (SubLObject)cb_inference_debugger.NIL;
            link = cdolist_list_var.first();
            while (cb_inference_debugger.NIL != cdolist_list_var) {
                if (cb_inference_debugger.NIL != ((cb_inference_debugger.NIL != display_only_these) ? set.set_memberP(link, display_only_these) : cb_show_problem_link_for_debuggingP(link, strategic_context, options))) {
                    argument_links = (SubLObject)ConsesLow.cons(link, argument_links);
                }
                cdolist_list_var = cdolist_list_var.rest();
                link = cdolist_list_var.first();
            }
            argument_links = cb_debug_sort_argument_links(argument_links);
        }
        SubLObject query = (SubLObject)cb_inference_debugger.NIL;
        if (cb_inference_debugger.NIL != show_queryP) {
            final SubLObject show_which_queries = cb_debug_option_value((SubLObject)cb_inference_debugger.$kw69$SHOW_WHICH_QUERIES, options);
            if (cb_inference_debugger.$kw91$ALL == show_which_queries || (cb_inference_debugger.$kw92$DEAD_END == show_which_queries && cb_inference_debugger.NIL == argument_links)) {
                query = inference_czer.problem_query_formula(inference_datastructures_problem.problem_query(problem));
            }
        }
        cb_debug_add_node_to_tree((SubLObject)cb_inference_debugger.$kw39$PROBLEM, (SubLObject)ConsesLow.list(problem, is_focal_objectP, query));
        if (cb_inference_debugger.NIL != ellipsisP) {
            final SubLObject _prev_bind_0 = cb_inference_debugger.$cb_debug_depth$.currentBinding(thread);
            try {
                cb_inference_debugger.$cb_debug_depth$.bind(number_utilities.f_1X(cb_inference_debugger.$cb_debug_depth$.getDynamicValue(thread)), thread);
                cb_debug_add_node_to_tree((SubLObject)cb_inference_debugger.$kw93$ELLIPSIS, (SubLObject)cb_inference_debugger.NIL);
            }
            finally {
                cb_inference_debugger.$cb_debug_depth$.rebind(_prev_bind_0, thread);
            }
        }
        if (cb_inference_debugger.NIL != compute_and_show_argument_linksP) {
            final SubLObject _prev_bind_0 = cb_inference_debugger.$cb_debug_depth$.currentBinding(thread);
            try {
                cb_inference_debugger.$cb_debug_depth$.bind(number_utilities.f_1X(cb_inference_debugger.$cb_debug_depth$.getDynamicValue(thread)), thread);
                SubLObject cdolist_list_var = argument_links;
                SubLObject link = (SubLObject)cb_inference_debugger.NIL;
                link = cdolist_list_var.first();
                while (cb_inference_debugger.NIL != cdolist_list_var) {
                    cb_debug_problem_link_int(link, strategic_context, focal_object, display_only_these, options);
                    cdolist_list_var = cdolist_list_var.rest();
                    link = cdolist_list_var.first();
                }
            }
            finally {
                cb_inference_debugger.$cb_debug_depth$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)cb_inference_debugger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 22898L)
    public static SubLObject cb_show_problem_link_for_debuggingP(final SubLObject link, final SubLObject strategic_context, final SubLObject options) {
        if (cb_inference_debugger.NIL != inference_worker.connected_conjunction_link_p(link) && cb_inference_debugger.NIL != inference_datastructures_problem_link.problem_link_closedP(link)) {
            return (SubLObject)cb_inference_debugger.NIL;
        }
        if (cb_inference_debugger.NIL != balancing_tactician.balancing_tactician_p(strategic_context)) {
            if (cb_inference_debugger.NIL != cb_debug_option_value((SubLObject)cb_inference_debugger.$kw64$DEBUG_NON_NEW_ROOTS_, options)) {
                return (SubLObject)cb_inference_debugger.T;
            }
            SubLObject link_leads_to_new_rootP;
            SubLObject rest;
            SubLObject supporting_mapped_problem;
            SubLObject supporting_problem;
            SubLObject variable_map;
            for (link_leads_to_new_rootP = (SubLObject)cb_inference_debugger.NIL, rest = (SubLObject)cb_inference_debugger.NIL, rest = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link); cb_inference_debugger.NIL == link_leads_to_new_rootP && cb_inference_debugger.NIL != rest; rest = rest.rest()) {
                supporting_mapped_problem = rest.first();
                if (cb_inference_debugger.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)cb_inference_debugger.NIL, link, supporting_mapped_problem)) {
                    supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                    variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                    if (cb_inference_debugger.NIL != balancing_tactician.balancing_tactician_problem_motivated_wrt_nP(strategic_context, supporting_problem)) {
                        link_leads_to_new_rootP = (SubLObject)cb_inference_debugger.T;
                    }
                }
            }
            if (cb_inference_debugger.NIL != inference_worker_join_ordered.join_ordered_link_p(link) && cb_inference_debugger.NIL != inference_worker_join_ordered.join_ordered_link_non_focal_manifestedP(link)) {
                final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(inference_worker_join_ordered.join_ordered_link_non_focal_problem(link));
                SubLObject basis_object;
                SubLObject state;
                SubLObject restriction_link;
                SubLObject restricted_non_focal;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)cb_inference_debugger.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); cb_inference_debugger.NIL == link_leads_to_new_rootP && cb_inference_debugger.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    restriction_link = set_contents.do_set_contents_next(basis_object, state);
                    if (cb_inference_debugger.NIL != set_contents.do_set_contents_element_validP(state, restriction_link) && cb_inference_debugger.NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, (SubLObject)cb_inference_debugger.$kw94$RESTRICTION) && cb_inference_debugger.NIL != inference_worker_join_ordered.non_focal_restriction_link_with_corresponding_focal_proofP(restriction_link, link)) {
                        restricted_non_focal = inference_datastructures_problem_link.problem_link_sole_supporting_problem(restriction_link);
                        if (cb_inference_debugger.NIL != balancing_tactician.balancing_tactician_problem_motivated_wrt_nP(strategic_context, restricted_non_focal)) {
                            link_leads_to_new_rootP = (SubLObject)cb_inference_debugger.T;
                        }
                    }
                }
            }
            if (cb_inference_debugger.NIL == link_leads_to_new_rootP) {
                return (SubLObject)cb_inference_debugger.NIL;
            }
        }
        return (SubLObject)cb_inference_debugger.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 24000L)
    public static SubLObject cb_debug_problem_link_int(final SubLObject link, final SubLObject strategic_context, final SubLObject focal_object, SubLObject display_only_these, final SubLObject options) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject is_focal_objectP = (SubLObject)cb_inference_debugger.NIL;
        if (link.eql(focal_object)) {
            is_focal_objectP = (SubLObject)cb_inference_debugger.T;
            display_only_these = (SubLObject)cb_inference_debugger.NIL;
        }
        if (cb_inference_debugger.NIL != display_only_these && cb_inference_debugger.NIL == set.set_memberP(link, display_only_these)) {
            return (SubLObject)cb_inference_debugger.NIL;
        }
        SubLObject rule = (SubLObject)cb_inference_debugger.NIL;
        if (cb_inference_debugger.NIL != cb_debug_option_value((SubLObject)cb_inference_debugger.$kw72$SHOW_RULES_, options) && cb_inference_debugger.NIL != inference_worker_transformation.generalized_transformation_link_p(link)) {
            rule = inference_worker_transformation.generalized_transformation_link_rule_assertion(link);
        }
        cb_debug_add_node_to_tree((SubLObject)cb_inference_debugger.$kw50$PROBLEM_LINK, (SubLObject)ConsesLow.list(link, is_focal_objectP, rule));
        final SubLObject _prev_bind_0 = cb_inference_debugger.$cb_debug_depth$.currentBinding(thread);
        try {
            cb_inference_debugger.$cb_debug_depth$.bind(number_utilities.f_1X(cb_inference_debugger.$cb_debug_depth$.getDynamicValue(thread)), thread);
            final SubLObject supporting_problems = cb_debug_sort_supporting_problems(inference_datastructures_problem_link.problem_link_supporting_problems(link));
            if (cb_inference_debugger.NIL != inference_worker_join_ordered.join_ordered_link_p(link)) {
                cb_debug_join_ordered_link_guts(link, strategic_context, focal_object, display_only_these, options);
            }
            else {
                SubLObject cdolist_list_var = supporting_problems;
                SubLObject problem = (SubLObject)cb_inference_debugger.NIL;
                problem = cdolist_list_var.first();
                while (cb_inference_debugger.NIL != cdolist_list_var) {
                    cb_debug_problem_int(problem, strategic_context, focal_object, display_only_these, options);
                    cdolist_list_var = cdolist_list_var.rest();
                    problem = cdolist_list_var.first();
                }
            }
        }
        finally {
            cb_inference_debugger.$cb_debug_depth$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_inference_debugger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 25135L)
    public static SubLObject cb_debug_join_ordered_link_guts(final SubLObject join_ordered_link, final SubLObject strategic_context, final SubLObject focal_object, final SubLObject display_only_these, final SubLObject options) {
        final SubLObject focal_problem = inference_worker_join_ordered.join_ordered_link_focal_problem(join_ordered_link);
        cb_debug_problem_int(focal_problem, strategic_context, focal_object, display_only_these, options);
        if (cb_inference_debugger.NIL != inference_worker_join_ordered.join_ordered_link_non_focal_manifestedP(join_ordered_link)) {
            final SubLObject non_focal_problem = inference_worker_join_ordered.join_ordered_link_non_focal_problem(join_ordered_link);
            if (cb_inference_debugger.NIL != inference_worker.good_problem_p(focal_problem, strategic_context)) {
                final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(non_focal_problem);
                SubLObject basis_object;
                SubLObject state;
                SubLObject restriction_link;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)cb_inference_debugger.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); cb_inference_debugger.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    restriction_link = set_contents.do_set_contents_next(basis_object, state);
                    if (cb_inference_debugger.NIL != set_contents.do_set_contents_element_validP(state, restriction_link) && cb_inference_debugger.NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, (SubLObject)cb_inference_debugger.$kw94$RESTRICTION) && cb_inference_debugger.NIL != cb_show_problem_link_for_debuggingP(restriction_link, strategic_context, options)) {
                        cb_debug_problem_link_int(restriction_link, strategic_context, focal_object, display_only_these, options);
                    }
                }
            }
            else {
                cb_debug_problem_int(non_focal_problem, strategic_context, focal_object, display_only_these, options);
            }
        }
        return (SubLObject)cb_inference_debugger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 26070L)
    public static SubLObject cb_debug_add_node_to_tree(final SubLObject node_type, final SubLObject data) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_inference_debugger.NIL != Types.keywordp(node_type) : node_type;
        final SubLObject node = (SubLObject)ConsesLow.listS(node_type, cb_inference_debugger.$cb_debug_depth$.getDynamicValue(thread), data);
        cb_inference_debugger.$cb_debug_tree$.setDynamicValue((SubLObject)ConsesLow.cons(node, cb_inference_debugger.$cb_debug_tree$.getDynamicValue(thread)), thread);
        return node;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 26292L)
    public static SubLObject cb_debug_sort_argument_links(final SubLObject links) {
        return Sort.sort(links, (SubLObject)cb_inference_debugger.$sym96$CB_DEBUG_ARGUMENT_LINK__, (SubLObject)cb_inference_debugger.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 26394L)
    public static SubLObject cb_debug_argument_link_L(final SubLObject link1, final SubLObject link2) {
        if (cb_inference_debugger.NIL != good_problem_link_p(link1)) {
            if (cb_inference_debugger.NIL != good_problem_link_p(link2)) {
                return problem_link_suid_L(link1, link2);
            }
            return (SubLObject)cb_inference_debugger.T;
        }
        else {
            if (cb_inference_debugger.NIL != good_problem_link_p(link2)) {
                return (SubLObject)cb_inference_debugger.NIL;
            }
            return problem_link_suid_L(link1, link2);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 26687L)
    public static SubLObject problem_link_suid_L(final SubLObject link1, final SubLObject link2) {
        return Numbers.numL(inference_datastructures_problem_link.problem_link_suid(link1), inference_datastructures_problem_link.problem_link_suid(link2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 26803L)
    public static SubLObject good_problem_link_p(final SubLObject link) {
        return inference_datastructures_problem_link.problem_link_has_some_proofP(link, (SubLObject)cb_inference_debugger.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 26892L)
    public static SubLObject cb_debug_sort_supporting_problems(final SubLObject problems) {
        return Sort.sort(problems, (SubLObject)cb_inference_debugger.$sym97$CB_DEBUG_SUPPORTING_PROBLEM__, (SubLObject)cb_inference_debugger.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 27011L)
    public static SubLObject cb_debug_supporting_problem_L(final SubLObject problem1, final SubLObject problem2) {
        if (cb_inference_debugger.NIL != inference_datastructures_problem.tactically_good_problem_p(problem1)) {
            if (cb_inference_debugger.NIL != inference_datastructures_problem.tactically_good_problem_p(problem2)) {
                return problem_suid_L(problem1, problem2);
            }
            return (SubLObject)cb_inference_debugger.T;
        }
        else {
            if (cb_inference_debugger.NIL != inference_datastructures_problem.tactically_good_problem_p(problem2)) {
                return (SubLObject)cb_inference_debugger.NIL;
            }
            return problem_suid_L(problem1, problem2);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 27409L)
    public static SubLObject problem_suid_L(final SubLObject problem1, final SubLObject problem2) {
        return Numbers.numL(inference_datastructures_problem.problem_suid(problem1), inference_datastructures_problem.problem_suid(problem2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 27779L)
    public static SubLObject cb_debug_display_tree(final SubLObject debug_tree, final SubLObject strategic_context, final SubLObject options) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = cb_inference_debugger.$cb_debug_next_object_id$.currentBinding(thread);
        try {
            cb_inference_debugger.$cb_debug_next_object_id$.bind((SubLObject)cb_inference_debugger.ZERO_INTEGER, thread);
            cb_debug_display_tree_children(debug_tree, (SubLObject)cb_inference_debugger.ZERO_INTEGER, (SubLObject)cb_inference_debugger.$str99$root, strategic_context, options);
        }
        finally {
            cb_inference_debugger.$cb_debug_next_object_id$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_inference_debugger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 27994L)
    public static SubLObject cb_debug_display_tree_children(final SubLObject debug_tree, final SubLObject exact_depth, final SubLObject parent_id, final SubLObject strategic_context, final SubLObject options) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject visibility = cb_debug_option_value((SubLObject)cb_inference_debugger.$kw78$DHTML_VISIBILITY, options);
        if (cb_inference_debugger.$str99$root.equal(parent_id)) {
            visibility = (SubLObject)cb_inference_debugger.$kw100$VISIBLE;
        }
        if (cb_inference_debugger.$kw101$NONE == visibility) {
            cb_debug_display_tree_children_int(debug_tree, exact_depth, strategic_context, options);
        }
        else {
            dhtml_macros.dhtml_set_switched_visibility(parent_id, visibility, (SubLObject)cb_inference_debugger.$kw102$TEXT);
            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
            if (cb_inference_debugger.NIL != parent_id) {
                html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
                html_utilities.html_markup(parent_id);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inference_debugger.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_inference_debugger.T, thread);
                cb_debug_display_tree_children_int(debug_tree, exact_depth, strategic_context, options);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_inference_debugger.UNPROVIDED);
        }
        return (SubLObject)cb_inference_debugger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 28630L)
    public static SubLObject cb_debug_display_tree_children_int(final SubLObject debug_tree, final SubLObject exact_depth, final SubLObject strategic_context, final SubLObject options) {
        SubLObject done_with_this_subtreeP;
        SubLObject subtree;
        SubLObject child_node;
        SubLObject child_depth;
        for (done_with_this_subtreeP = (SubLObject)cb_inference_debugger.NIL, subtree = (SubLObject)cb_inference_debugger.NIL, subtree = debug_tree; cb_inference_debugger.NIL != subtree && cb_inference_debugger.NIL == done_with_this_subtreeP; subtree = subtree.rest()) {
            child_node = subtree.first();
            child_depth = conses_high.second(child_node);
            if (child_depth.eql(exact_depth)) {
                cb_debug_display_tree_int(subtree, strategic_context, options);
            }
            else if (child_depth.numL(exact_depth)) {
                done_with_this_subtreeP = (SubLObject)cb_inference_debugger.T;
            }
        }
        return (SubLObject)cb_inference_debugger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 29150L)
    public static SubLObject cb_debug_display_tree_int(final SubLObject debug_tree, final SubLObject strategic_context, final SubLObject options) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject node = debug_tree.first();
        final SubLObject lookhead_node = conses_high.second(debug_tree);
        SubLObject current;
        final SubLObject datum = current = node;
        SubLObject node_type = (SubLObject)cb_inference_debugger.NIL;
        SubLObject depth = (SubLObject)cb_inference_debugger.NIL;
        SubLObject data = (SubLObject)cb_inference_debugger.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_inference_debugger.$list103);
        node_type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_inference_debugger.$list103);
        depth = current.first();
        current = (data = current.rest());
        if (depth.numG(cb_inference_debugger.$cb_debug_max_depth$.getGlobalValue())) {
            node_type = (SubLObject)cb_inference_debugger.$kw93$ELLIPSIS;
        }
        if (cb_inference_debugger.$kw93$ELLIPSIS == node_type) {
            cb_debug_indent_the_right_amount(depth);
            if (cb_inference_debugger.$kw101$NONE != cb_debug_option_value((SubLObject)cb_inference_debugger.$kw78$DHTML_VISIBILITY, options)) {
                final SubLObject image_src = Sequences.cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src((SubLObject)cb_inference_debugger.$kw104$SQUARE_BLANK));
                final SubLObject align = (SubLObject)cb_inference_debugger.$kw56$TOP;
                final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string((SubLObject)cb_inference_debugger.$kw104$SQUARE_BLANK);
                final SubLObject border = (SubLObject)cb_inference_debugger.ZERO_INTEGER;
                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
                html_utilities.html_markup(image_src);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
                if (cb_inference_debugger.NIL != alt) {
                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
                    html_utilities.html_markup(alt);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
                }
                if (cb_inference_debugger.NIL != align) {
                    html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align(align));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
                }
                if (cb_inference_debugger.NIL != border) {
                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
                    html_utilities.html_markup(border);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inference_debugger.UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_inference_debugger.T, thread);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                html_utilities.html_indent((SubLObject)cb_inference_debugger.UNPROVIDED);
            }
            html_utilities.html_princ((SubLObject)cb_inference_debugger.$str105$___);
            html_utilities.html_newline((SubLObject)cb_inference_debugger.UNPROVIDED);
        }
        else {
            SubLObject current_$15;
            final SubLObject datum_$14 = current_$15 = data;
            SubLObject v_object = (SubLObject)cb_inference_debugger.NIL;
            SubLObject is_focal_objectP = (SubLObject)cb_inference_debugger.NIL;
            SubLObject query_or_rule = (SubLObject)cb_inference_debugger.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$15, datum_$14, (SubLObject)cb_inference_debugger.$list106);
            v_object = current_$15.first();
            current_$15 = current_$15.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$15, datum_$14, (SubLObject)cb_inference_debugger.$list106);
            is_focal_objectP = current_$15.first();
            current_$15 = current_$15.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$15, datum_$14, (SubLObject)cb_inference_debugger.$list106);
            query_or_rule = current_$15.first();
            current_$15 = current_$15.rest();
            if (cb_inference_debugger.NIL == current_$15) {
                final SubLObject object_id = cb_debug_next_object_id_string();
                cb_debug_indent_the_right_amount(depth);
                if (cb_inference_debugger.$kw101$NONE != cb_debug_option_value((SubLObject)cb_inference_debugger.$kw78$DHTML_VISIBILITY, options)) {
                    if (cb_inference_debugger.NIL == lookhead_node || cb_inference_debugger.$kw93$ELLIPSIS == lookhead_node.first() || conses_high.second(lookhead_node).numLE(depth)) {
                        final SubLObject image_src2 = Sequences.cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src((SubLObject)cb_inference_debugger.$kw107$BLANK_TRIANGLE));
                        final SubLObject align2 = (SubLObject)cb_inference_debugger.$kw56$TOP;
                        final SubLObject alt2 = cyc_file_dependencies.get_html_icon_alt_string((SubLObject)cb_inference_debugger.$kw107$BLANK_TRIANGLE);
                        final SubLObject border2 = (SubLObject)cb_inference_debugger.ZERO_INTEGER;
                        html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
                        html_utilities.html_markup(image_src2);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
                        if (cb_inference_debugger.NIL != alt2) {
                            html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
                            html_utilities.html_markup(alt2);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
                        }
                        if (cb_inference_debugger.NIL != align2) {
                            html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align(align2));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
                        }
                        if (cb_inference_debugger.NIL != border2) {
                            html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
                            html_utilities.html_markup(border2);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inference_debugger.UNPROVIDED);
                        final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_inference_debugger.T, thread);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                        html_utilities.html_indent((SubLObject)cb_inference_debugger.UNPROVIDED);
                    }
                    else {
                        dhtml_macros.dhtml_switch_visibility_links_plus_minus(object_id, (SubLObject)cb_inference_debugger.$str79$);
                    }
                }
                cb_debug_link(v_object, strategic_context, cb_inference_debugger.$cb_debug_icon$.getDynamicValue(thread), options);
                if (cb_inference_debugger.NIL != is_focal_objectP) {
                    final SubLObject size_val = (SubLObject)cb_inference_debugger.FIVE_INTEGER;
                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                    if (cb_inference_debugger.NIL != size_val) {
                        html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
                        html_utilities.html_markup(size_val);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inference_debugger.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inference_debugger.UNPROVIDED);
                    final SubLObject _prev_bind_3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_inference_debugger.T, thread);
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        cb_utilities.cb_link(node_type, v_object, (SubLObject)cb_inference_debugger.$kw51$VERBOSE, (SubLObject)cb_inference_debugger.UNPROVIDED, (SubLObject)cb_inference_debugger.UNPROVIDED, (SubLObject)cb_inference_debugger.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_3, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                }
                else {
                    cb_utilities.cb_link(node_type, v_object, (SubLObject)cb_inference_debugger.$kw51$VERBOSE, (SubLObject)cb_inference_debugger.UNPROVIDED, (SubLObject)cb_inference_debugger.UNPROVIDED, (SubLObject)cb_inference_debugger.UNPROVIDED);
                }
                if (cb_inference_debugger.NIL != query_or_rule) {
                    cb_debug_inference_form(query_or_rule, depth);
                }
                html_utilities.html_newline((SubLObject)cb_inference_debugger.UNPROVIDED);
                cb_debug_display_tree_children(debug_tree.rest(), number_utilities.f_1X(depth), object_id, strategic_context, options);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum_$14, (SubLObject)cb_inference_debugger.$list106);
            }
        }
        return (SubLObject)cb_inference_debugger.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 30984L)
    public static SubLObject cb_debug_next_object_id_string() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject string = Sequences.cconcatenate((SubLObject)cb_inference_debugger.$str108$cbd, string_utilities.str(cb_inference_debugger.$cb_debug_next_object_id$.getDynamicValue(thread)));
        cb_inference_debugger.$cb_debug_next_object_id$.setDynamicValue(Numbers.add(cb_inference_debugger.$cb_debug_next_object_id$.getDynamicValue(thread), (SubLObject)cb_inference_debugger.ONE_INTEGER), thread);
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 31163L)
    public static SubLObject cb_debug_indent_the_right_amount(final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_indent(Numbers.multiply(depth, cb_inference_debugger.$cb_debug_indent_quantum$.getDynamicValue(thread)));
        return depth;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 31288L)
    public static SubLObject cb_debug_inference_form(final SubLObject v_object, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cb_utilities.cb_form(v_object, Numbers.add((SubLObject)cb_inference_debugger.TWO_INTEGER, Numbers.integerDivide(Numbers.multiply(depth, cb_inference_debugger.$cb_debug_indent_quantum$.getDynamicValue(thread)), (SubLObject)cb_inference_debugger.TWO_INTEGER)), (SubLObject)cb_inference_debugger.T);
    }
    
    public static SubLObject declare_cb_inference_debugger_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger", "html_inference_debug_page", "HTML-INFERENCE-DEBUG-PAGE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger", "with_debug_inference_indentation_and_recursion_handling", "WITH-DEBUG-INFERENCE-INDENTATION-AND-RECURSION-HANDLING");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger", "cb_link_debug_inference", "CB-LINK-DEBUG-INFERENCE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger", "cb_debug_inference_handler", "CB-DEBUG-INFERENCE-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger", "cb_link_debug_problem", "CB-LINK-DEBUG-PROBLEM", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger", "cb_debug_problem_handler", "CB-DEBUG-PROBLEM-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger", "cb_link_debug_problem_link", "CB-LINK-DEBUG-PROBLEM-LINK", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger", "cb_debug_problem_link_handler", "CB-DEBUG-PROBLEM-LINK-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger", "cb_debug_handler_link", "CB-DEBUG-HANDLER-LINK", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger", "cb_debug_link", "CB-DEBUG-LINK", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger", "cb_lookup_options_by_glob_string", "CB-LOOKUP-OPTIONS-BY-GLOB-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger", "cb_debug_option_p", "CB-DEBUG-OPTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger", "cb_debug_option_default", "CB-DEBUG-OPTION-DEFAULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger", "cb_debug_option_value", "CB-DEBUG-OPTION-VALUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger", "cb_show_inference_debugger_option_tweaking_links", "CB-SHOW-INFERENCE-DEBUGGER-OPTION-TWEAKING-LINKS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger", "cb_show_ancestor_depth_tweaking_links", "CB-SHOW-ANCESTOR-DEPTH-TWEAKING-LINKS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger", "cb_show_option_tweaking_links", "CB-SHOW-OPTION-TWEAKING-LINKS", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger", "cb_show_option_tweaking_link", "CB-SHOW-OPTION-TWEAKING-LINK", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger", "cb_debug_inference", "CB-DEBUG-INFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger", "cb_debug_problem", "CB-DEBUG-PROBLEM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger", "cb_debug_problem_link", "CB-DEBUG-PROBLEM-LINK", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger", "cb_debug_ancestors", "CB-DEBUG-ANCESTORS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger", "cb_debug_compute_ancestor_layers", "CB-DEBUG-COMPUTE-ANCESTOR-LAYERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger", "cb_debug_add_children_and_links_to_set", "CB-DEBUG-ADD-CHILDREN-AND-LINKS-TO-SET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger", "cb_debug_problem_int", "CB-DEBUG-PROBLEM-INT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger", "cb_debug_problem_parametrized", "CB-DEBUG-PROBLEM-PARAMETRIZED", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger", "cb_show_problem_link_for_debuggingP", "CB-SHOW-PROBLEM-LINK-FOR-DEBUGGING?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger", "cb_debug_problem_link_int", "CB-DEBUG-PROBLEM-LINK-INT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger", "cb_debug_join_ordered_link_guts", "CB-DEBUG-JOIN-ORDERED-LINK-GUTS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger", "cb_debug_add_node_to_tree", "CB-DEBUG-ADD-NODE-TO-TREE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger", "cb_debug_sort_argument_links", "CB-DEBUG-SORT-ARGUMENT-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger", "cb_debug_argument_link_L", "CB-DEBUG-ARGUMENT-LINK-<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger", "problem_link_suid_L", "PROBLEM-LINK-SUID-<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger", "good_problem_link_p", "GOOD-PROBLEM-LINK-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger", "cb_debug_sort_supporting_problems", "CB-DEBUG-SORT-SUPPORTING-PROBLEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger", "cb_debug_supporting_problem_L", "CB-DEBUG-SUPPORTING-PROBLEM-<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger", "problem_suid_L", "PROBLEM-SUID-<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger", "cb_debug_display_tree", "CB-DEBUG-DISPLAY-TREE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger", "cb_debug_display_tree_children", "CB-DEBUG-DISPLAY-TREE-CHILDREN", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger", "cb_debug_display_tree_children_int", "CB-DEBUG-DISPLAY-TREE-CHILDREN-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger", "cb_debug_display_tree_int", "CB-DEBUG-DISPLAY-TREE-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger", "cb_debug_next_object_id_string", "CB-DEBUG-NEXT-OBJECT-ID-STRING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger", "cb_debug_indent_the_right_amount", "CB-DEBUG-INDENT-THE-RIGHT-AMOUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger", "cb_debug_inference_form", "CB-DEBUG-INFERENCE-FORM", 2, 0, false);
        return (SubLObject)cb_inference_debugger.NIL;
    }
    
    public static SubLObject init_cb_inference_debugger_file() {
        cb_inference_debugger.$cb_debug_icon$ = SubLFiles.defvar("*CB-DEBUG-ICON*", (SubLObject)cb_inference_debugger.$kw0$RED_DIAMOND);
        cb_inference_debugger.$cb_debug_indent_quantum$ = SubLFiles.defvar("*CB-DEBUG-INDENT-QUANTUM*", (SubLObject)cb_inference_debugger.FOUR_INTEGER);
        cb_inference_debugger.$cb_debug_depth$ = SubLFiles.defparameter("*CB-DEBUG-DEPTH*", (SubLObject)cb_inference_debugger.$kw3$UNINITIALIZED);
        cb_inference_debugger.$cb_debug_duplicate_tree$ = SubLFiles.defparameter("*CB-DEBUG-DUPLICATE-TREE*", (SubLObject)cb_inference_debugger.$kw3$UNINITIALIZED);
        cb_inference_debugger.$cb_debug_tree$ = SubLFiles.defparameter("*CB-DEBUG-TREE*", (SubLObject)cb_inference_debugger.$kw3$UNINITIALIZED);
        cb_inference_debugger.$cb_current_debug_options$ = SubLFiles.defvar("*CB-CURRENT-DEBUG-OPTIONS*", (SubLObject)cb_inference_debugger.NIL);
        cb_inference_debugger.$cb_debug_options$ = SubLFiles.deflexical("*CB-DEBUG-OPTIONS*", (SubLObject)cb_inference_debugger.$list58);
        cb_inference_debugger.$cb_show_hide_value_linktext_pairs$ = SubLFiles.deflexical("*CB-SHOW-HIDE-VALUE-LINKTEXT-PAIRS*", (SubLObject)cb_inference_debugger.$list59);
        cb_inference_debugger.$cb_debug_max_depth$ = SubLFiles.deflexical("*CB-DEBUG-MAX-DEPTH*", (SubLObject)cb_inference_debugger.$int98$212);
        cb_inference_debugger.$cb_debug_next_object_id$ = SubLFiles.defparameter("*CB-DEBUG-NEXT-OBJECT-ID*", (SubLObject)cb_inference_debugger.$kw3$UNINITIALIZED);
        return (SubLObject)cb_inference_debugger.NIL;
    }
    
    public static SubLObject setup_cb_inference_debugger_file() {
        utilities_macros.register_html_state_variable((SubLObject)cb_inference_debugger.$sym1$_CB_DEBUG_ICON_);
        utilities_macros.register_html_state_variable((SubLObject)cb_inference_debugger.$sym2$_CB_DEBUG_INDENT_QUANTUM_);
        utilities_macros.register_html_state_variable((SubLObject)cb_inference_debugger.$sym4$_CB_CURRENT_DEBUG_OPTIONS_);
        cb_utilities.setup_cb_link_method((SubLObject)cb_inference_debugger.$kw16$DEBUG_INFERENCE, (SubLObject)cb_inference_debugger.$sym17$CB_LINK_DEBUG_INFERENCE, (SubLObject)cb_inference_debugger.THREE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_inference_debugger.$sym28$CB_DEBUG_INFERENCE_HANDLER, (SubLObject)cb_inference_debugger.$kw29$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_inference_debugger.$kw34$DEBUG_PROBLEM, (SubLObject)cb_inference_debugger.$sym35$CB_LINK_DEBUG_PROBLEM, (SubLObject)cb_inference_debugger.FOUR_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_inference_debugger.$sym42$CB_DEBUG_PROBLEM_HANDLER, (SubLObject)cb_inference_debugger.$kw29$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_inference_debugger.$kw46$DEBUG_PROBLEM_LINK, (SubLObject)cb_inference_debugger.$sym47$CB_LINK_DEBUG_PROBLEM_LINK, (SubLObject)cb_inference_debugger.FOUR_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_inference_debugger.$sym52$CB_DEBUG_PROBLEM_LINK_HANDLER, (SubLObject)cb_inference_debugger.$kw29$HTML_HANDLER);
        return (SubLObject)cb_inference_debugger.NIL;
    }
    
    public void declareFunctions() {
        declare_cb_inference_debugger_file();
    }
    
    public void initializeVariables() {
        init_cb_inference_debugger_file();
    }
    
    public void runTopLevelForms() {
        setup_cb_inference_debugger_file();
    }
    
    static {
        me = (SubLFile)new cb_inference_debugger();
        cb_inference_debugger.$cb_debug_icon$ = null;
        cb_inference_debugger.$cb_debug_indent_quantum$ = null;
        cb_inference_debugger.$cb_debug_depth$ = null;
        cb_inference_debugger.$cb_debug_duplicate_tree$ = null;
        cb_inference_debugger.$cb_debug_tree$ = null;
        cb_inference_debugger.$cb_current_debug_options$ = null;
        cb_inference_debugger.$cb_debug_options$ = null;
        cb_inference_debugger.$cb_show_hide_value_linktext_pairs$ = null;
        cb_inference_debugger.$cb_debug_max_depth$ = null;
        cb_inference_debugger.$cb_debug_next_object_id$ = null;
        $kw0$RED_DIAMOND = SubLObjectFactory.makeKeyword("RED-DIAMOND");
        $sym1$_CB_DEBUG_ICON_ = SubLObjectFactory.makeSymbol("*CB-DEBUG-ICON*");
        $sym2$_CB_DEBUG_INDENT_QUANTUM_ = SubLObjectFactory.makeSymbol("*CB-DEBUG-INDENT-QUANTUM*");
        $kw3$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $sym4$_CB_CURRENT_DEBUG_OPTIONS_ = SubLObjectFactory.makeSymbol("*CB-CURRENT-DEBUG-OPTIONS*");
        $list5 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FOCAL-OBJECT")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym6$HTML_DOCUMENT = SubLObjectFactory.makeSymbol("HTML-DOCUMENT");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DHTML-WITH-DOM-SCRIPT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DHTML-WITH-TOGGLE-VISIBILITY-SUPPORT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BASIC-AJAX-SCRIPTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DHTML-CREATION-SCRIPTS")));
        $sym8$HTML_FANCY_BODY = SubLObjectFactory.makeSymbol("HTML-FANCY-BODY");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SHOW-COPYRIGHT"), (SubLObject)cb_inference_debugger.NIL);
        $sym10$CB_SHOW_RELEVANT_INFERENCE_DEBUGGING_LINKS = SubLObjectFactory.makeSymbol("CB-SHOW-RELEVANT-INFERENCE-DEBUGGING-LINKS");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC-STRONG"), (SubLObject)SubLObjectFactory.makeString("Inference Debugging Tree for "));
        $sym12$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list13 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CB-DEBUG-DEPTH*"), (SubLObject)cb_inference_debugger.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CB-DEBUG-TREE*"), (SubLObject)cb_inference_debugger.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CB-DEBUG-DUPLICATE-TREE*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)cb_inference_debugger.EQ))));
        $str14$_Debug_Inference__A__A_ = SubLObjectFactory.makeString("[Debug Inference ~A.~A]");
        $str15$cb_debug_inference_handler = SubLObjectFactory.makeString("cb-debug-inference-handler");
        $kw16$DEBUG_INFERENCE = SubLObjectFactory.makeKeyword("DEBUG-INFERENCE");
        $sym17$CB_LINK_DEBUG_INFERENCE = SubLObjectFactory.makeSymbol("CB-LINK-DEBUG-INFERENCE");
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STORE-ID-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-ID-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("OPTIONS-GLOB-ID-STRING"));
        $str19$_A_did_not_specify_an_inference = SubLObjectFactory.makeString("~A did not specify an inference");
        $sym20$CB_DEBUG_OPTION_P = SubLObjectFactory.makeSymbol("CB-DEBUG-OPTION-P");
        $str21$_A_did_not_specify_valid_debugger = SubLObjectFactory.makeString("~A did not specify valid debugger options");
        $str22$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str23$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw24$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $str25$Inference_Debugging_Tree_for_ = SubLObjectFactory.makeString("Inference Debugging Tree for ");
        $kw26$INFERENCE = SubLObjectFactory.makeKeyword("INFERENCE");
        $kw27$VERY_VERBOSE = SubLObjectFactory.makeKeyword("VERY-VERBOSE");
        $sym28$CB_DEBUG_INFERENCE_HANDLER = SubLObjectFactory.makeSymbol("CB-DEBUG-INFERENCE-HANDLER");
        $kw29$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $kw30$TACTICAL = SubLObjectFactory.makeKeyword("TACTICAL");
        $str31$_Debug_Problem__A__A_ = SubLObjectFactory.makeString("[Debug Problem ~A.~A]");
        $str32$_Debug_Problem__A__A_wrt_s_A_ = SubLObjectFactory.makeString("[Debug Problem ~A.~A wrt s~A]");
        $str33$cb_debug_problem_handler = SubLObjectFactory.makeString("cb-debug-problem-handler");
        $kw34$DEBUG_PROBLEM = SubLObjectFactory.makeKeyword("DEBUG-PROBLEM");
        $sym35$CB_LINK_DEBUG_PROBLEM = SubLObjectFactory.makeSymbol("CB-LINK-DEBUG-PROBLEM");
        $list36 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STORE-ID-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-ID-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRATEGIC-CONTEXT-ID-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("OPTIONS-GLOB-ID-STRING"));
        $str37$_A_did_not_specify_a_problem = SubLObjectFactory.makeString("~A did not specify a problem");
        $str38$_A_did_not_specify_a_strategic_co = SubLObjectFactory.makeString("~A did not specify a strategic context");
        $kw39$PROBLEM = SubLObjectFactory.makeKeyword("PROBLEM");
        $str40$_wrt_ = SubLObjectFactory.makeString(" wrt ");
        $kw41$STRATEGY = SubLObjectFactory.makeKeyword("STRATEGY");
        $sym42$CB_DEBUG_PROBLEM_HANDLER = SubLObjectFactory.makeSymbol("CB-DEBUG-PROBLEM-HANDLER");
        $str43$_Debug_Link__A__A_ = SubLObjectFactory.makeString("[Debug Link ~A.~A]");
        $str44$_Debug_Link__A__A_wrt_s_A_ = SubLObjectFactory.makeString("[Debug Link ~A.~A wrt s~A]");
        $str45$cb_debug_problem_link_handler = SubLObjectFactory.makeString("cb-debug-problem-link-handler");
        $kw46$DEBUG_PROBLEM_LINK = SubLObjectFactory.makeKeyword("DEBUG-PROBLEM-LINK");
        $sym47$CB_LINK_DEBUG_PROBLEM_LINK = SubLObjectFactory.makeSymbol("CB-LINK-DEBUG-PROBLEM-LINK");
        $list48 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STORE-ID-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("LINK-ID-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRATEGIC-CONTEXT-ID-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("OPTIONS-GLOB-ID-STRING"));
        $str49$_A_did_not_specify_a_link = SubLObjectFactory.makeString("~A did not specify a link");
        $kw50$PROBLEM_LINK = SubLObjectFactory.makeKeyword("PROBLEM-LINK");
        $kw51$VERBOSE = SubLObjectFactory.makeKeyword("VERBOSE");
        $sym52$CB_DEBUG_PROBLEM_LINK_HANDLER = SubLObjectFactory.makeSymbol("CB-DEBUG-PROBLEM-LINK-HANDLER");
        $kw53$SELF = SubLObjectFactory.makeKeyword("SELF");
        $str54$_A__A__A__A__A = SubLObjectFactory.makeString("~A&~A&~A&~A&~A");
        $str55$_A__A__A__A = SubLObjectFactory.makeString("~A&~A&~A&~A");
        $kw56$TOP = SubLObjectFactory.makeKeyword("TOP");
        $str57$Unexpected_cb_debug_link_object__ = SubLObjectFactory.makeString("Unexpected cb-debug-link object: ~a");
        $list58 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("ANCESTOR-DEPTH"), (SubLObject)SubLObjectFactory.makeInteger(21)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SHOW-SIBLINGS?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SHOW-AUNTS?")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("DEBUG-GOOD-PROBLEMS?"), (SubLObject)cb_inference_debugger.T), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("DEBUG-NON-NEW-ROOTS?"), (SubLObject)cb_inference_debugger.T), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SHOW-WHICH-QUERIES"), (SubLObject)SubLObjectFactory.makeKeyword("NONE")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SHOW-RULES?"), (SubLObject)cb_inference_debugger.T), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("DHTML-VISIBILITY"), (SubLObject)SubLObjectFactory.makeKeyword("VISIBLE")));
        $list59 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)cb_inference_debugger.T, (SubLObject)SubLObjectFactory.makeString("[Show]")), (SubLObject)ConsesLow.list((SubLObject)cb_inference_debugger.NIL, (SubLObject)SubLObjectFactory.makeString("[Hide]")));
        $kw60$SHOW_SIBLINGS_ = SubLObjectFactory.makeKeyword("SHOW-SIBLINGS?");
        $str61$Siblings_ = SubLObjectFactory.makeString("Siblings:");
        $kw62$SHOW_AUNTS_ = SubLObjectFactory.makeKeyword("SHOW-AUNTS?");
        $str63$Aunts_ = SubLObjectFactory.makeString("Aunts:");
        $kw64$DEBUG_NON_NEW_ROOTS_ = SubLObjectFactory.makeKeyword("DEBUG-NON-NEW-ROOTS?");
        $str65$Non_New_Roots_ = SubLObjectFactory.makeString("Non-New Roots:");
        $kw66$DEBUG_GOOD_PROBLEMS_ = SubLObjectFactory.makeKeyword("DEBUG-GOOD-PROBLEMS?");
        $str67$Good_Problems_ = SubLObjectFactory.makeString("Good Problems:");
        $list68 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)cb_inference_debugger.T, (SubLObject)SubLObjectFactory.makeString("[Descend]")), (SubLObject)ConsesLow.list((SubLObject)cb_inference_debugger.NIL, (SubLObject)SubLObjectFactory.makeString("[Stop]")));
        $kw69$SHOW_WHICH_QUERIES = SubLObjectFactory.makeKeyword("SHOW-WHICH-QUERIES");
        $str70$Queries_ = SubLObjectFactory.makeString("Queries:");
        $list71 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALL"), (SubLObject)SubLObjectFactory.makeString("[All]")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DEAD-END"), (SubLObject)SubLObjectFactory.makeString("[Dead Ends]")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NONE"), (SubLObject)SubLObjectFactory.makeString("[None]")));
        $kw72$SHOW_RULES_ = SubLObjectFactory.makeKeyword("SHOW-RULES?");
        $str73$Rules_ = SubLObjectFactory.makeString("Rules:");
        $kw74$SQUARE_PLUS = SubLObjectFactory.makeKeyword("SQUARE-PLUS");
        $kw75$CENTER = SubLObjectFactory.makeKeyword("CENTER");
        $kw76$SQUARE_MINUS = SubLObjectFactory.makeKeyword("SQUARE-MINUS");
        $str77$_ = SubLObjectFactory.makeString(":");
        $kw78$DHTML_VISIBILITY = SubLObjectFactory.makeKeyword("DHTML-VISIBILITY");
        $str79$ = SubLObjectFactory.makeString("");
        $list80 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VISIBLE"), (SubLObject)SubLObjectFactory.makeString("[Open All]")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INVISIBLE"), (SubLObject)SubLObjectFactory.makeString("[Close All]")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NONE"), (SubLObject)SubLObjectFactory.makeString("[Turn Off]")));
        $str81$Ancestor_Depth_ = SubLObjectFactory.makeString("Ancestor Depth:");
        $str82$_ = SubLObjectFactory.makeString("[");
        $str83$_ = SubLObjectFactory.makeString("]");
        $kw84$ANCESTOR_DEPTH = SubLObjectFactory.makeKeyword("ANCESTOR-DEPTH");
        $list85 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(212), (SubLObject)SubLObjectFactory.makeInteger(21), (SubLObject)cb_inference_debugger.TWELVE_INTEGER, (SubLObject)cb_inference_debugger.THREE_INTEGER, (SubLObject)cb_inference_debugger.TWO_INTEGER, (SubLObject)cb_inference_debugger.ONE_INTEGER, (SubLObject)cb_inference_debugger.ZERO_INTEGER);
        $list86 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("LINKTEXT"));
        $sym87$PROPERTY_LIST_P = SubLObjectFactory.makeSymbol("PROPERTY-LIST-P");
        $kw88$GOOD = SubLObjectFactory.makeKeyword("GOOD");
        $kw89$NEUTRAL = SubLObjectFactory.makeKeyword("NEUTRAL");
        $kw90$NO_GOOD = SubLObjectFactory.makeKeyword("NO-GOOD");
        $kw91$ALL = SubLObjectFactory.makeKeyword("ALL");
        $kw92$DEAD_END = SubLObjectFactory.makeKeyword("DEAD-END");
        $kw93$ELLIPSIS = SubLObjectFactory.makeKeyword("ELLIPSIS");
        $kw94$RESTRICTION = SubLObjectFactory.makeKeyword("RESTRICTION");
        $sym95$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $sym96$CB_DEBUG_ARGUMENT_LINK__ = SubLObjectFactory.makeSymbol("CB-DEBUG-ARGUMENT-LINK-<");
        $sym97$CB_DEBUG_SUPPORTING_PROBLEM__ = SubLObjectFactory.makeSymbol("CB-DEBUG-SUPPORTING-PROBLEM-<");
        $int98$212 = SubLObjectFactory.makeInteger(212);
        $str99$root = SubLObjectFactory.makeString("root");
        $kw100$VISIBLE = SubLObjectFactory.makeKeyword("VISIBLE");
        $kw101$NONE = SubLObjectFactory.makeKeyword("NONE");
        $kw102$TEXT = SubLObjectFactory.makeKeyword("TEXT");
        $list103 = ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("NODE-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"), (SubLObject)SubLObjectFactory.makeSymbol("DATA"));
        $kw104$SQUARE_BLANK = SubLObjectFactory.makeKeyword("SQUARE-BLANK");
        $str105$___ = SubLObjectFactory.makeString("...");
        $list106 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("IS-FOCAL-OBJECT?"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-OR-RULE"));
        $kw107$BLANK_TRIANGLE = SubLObjectFactory.makeKeyword("BLANK-TRIANGLE");
        $str108$cbd = SubLObjectFactory.makeString("cbd");
    }
}

/*

	Total time: 412 ms
	
*/