/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CB-INTERNAL-REVIEWER
 *  source file: /cyc/top/cycl/cb-internal-reviewer.lisp
 *  created:     2019/07/03 17:38:09
 */
public final class cb_internal_reviewer extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_internal_reviewer() {
    }

    public static final SubLFile me = new cb_internal_reviewer();


    // // Definitions
    // deflexical
    private static final SubLSymbol $cb_internal_reviewer_codebase$ = makeSymbol("*CB-INTERNAL-REVIEWER-CODEBASE*");

    public static final SubLObject cb_link_internal_reviewer(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt5$_IntRev_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                html_utilities.html_princ($str_alt7$cb_internal_reviewer);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_princ(linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject cb_internal_reviewer(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_internal_rule_reviewer);
        } else {
            cb_internal_reviewer_internal(args);
        }
        return NIL;
    }

    public static final SubLObject cb_internal_reviewer_internal(SubLObject args) {
        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_utilities.html_markup(ONE_INTEGER);
        html_utilities.html_char(CHAR_greater, UNPROVIDED);
        html_utilities.html_princ($$$Internal_Rule_Reviewer);
        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_utilities.html_markup(ONE_INTEGER);
        html_utilities.html_char(CHAR_greater, UNPROVIDED);
        cb_generate_internal_reviewer_applet();
        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    // deflexical
    private static final SubLSymbol $cb_internal_reviewer_applet_code$ = makeSymbol("*CB-INTERNAL-REVIEWER-APPLET-CODE*");

    // deflexical
    public static final SubLSymbol $cb_internal_reviewer_applet_archive$ = makeSymbol("*CB-INTERNAL-REVIEWER-APPLET-ARCHIVE*");

    // deflexical
    private static final SubLSymbol $cb_internal_reviewer_window_height$ = makeSymbol("*CB-INTERNAL-REVIEWER-WINDOW-HEIGHT*");

    // deflexical
    private static final SubLSymbol $cb_internal_reviewer_window_width$ = makeSymbol("*CB-INTERNAL-REVIEWER-WINDOW-WIDTH*");

    // deflexical
    private static final SubLSymbol $cb_internal_reviewer_applet_height$ = makeSymbol("*CB-INTERNAL-REVIEWER-APPLET-HEIGHT*");

    // deflexical
    private static final SubLSymbol $cb_internal_reviewer_applet_width$ = makeSymbol("*CB-INTERNAL-REVIEWER-APPLET-WIDTH*");

    // deflexical
    public static final SubLSymbol $cb_internal_reviewer_applet_cached_tasks$ = makeSymbol("*CB-INTERNAL-REVIEWER-APPLET-CACHED-TASKS*");

    // deflexical
    private static final SubLSymbol $cb_internal_reviewer_applet_retrieval_mt$ = makeSymbol("*CB-INTERNAL-REVIEWER-APPLET-RETRIEVAL-MT*");

    // deflexical
    private static final SubLSymbol $cb_internal_reviewer_applet_assertion_mt$ = makeSymbol("*CB-INTERNAL-REVIEWER-APPLET-ASSERTION-MT*");

    // deflexical
    private static final SubLSymbol $cb_internal_reviewer_applet_project_name$ = makeSymbol("*CB-INTERNAL-REVIEWER-APPLET-PROJECT-NAME*");

    public static final SubLObject cb_generate_internal_reviewer_applet() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject machine_name = Environment.get_network_name(Environment.get_machine_name($$$unknown));
                SubLObject port_base = system_parameters.$base_tcp_port$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_applet_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_applet_code$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($cb_internal_reviewer_applet_code$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_applet_codebase$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($cb_internal_reviewer_codebase$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_applet_archive$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($cb_internal_reviewer_applet_archive$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_applet_height$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($cb_internal_reviewer_applet_height$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_applet_width$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($cb_internal_reviewer_applet_width$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($str_alt20$host_name);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(machine_name);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($$$port);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(port_base);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($$$user);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(string_utilities.to_string(operation_communication.the_cyclist()));
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($$$project);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($cb_internal_reviewer_applet_project_name$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($$$assertionMt);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($cb_internal_reviewer_applet_assertion_mt$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($$$retrievalMt);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($cb_internal_reviewer_applet_retrieval_mt$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($$$width);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($cb_internal_reviewer_window_width$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($$$height);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($cb_internal_reviewer_window_height$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($$$cachedTasks);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($cb_internal_reviewer_applet_cached_tasks$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_applet_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject declare_cb_internal_reviewer_file() {
        declareFunction("cb_link_internal_reviewer", "CB-LINK-INTERNAL-REVIEWER", 0, 1, false);
        declareFunction("cb_internal_reviewer", "CB-INTERNAL-REVIEWER", 0, 1, false);
        declareFunction("cb_internal_reviewer_internal", "CB-INTERNAL-REVIEWER-INTERNAL", 1, 0, false);
        declareFunction("cb_generate_internal_reviewer_applet", "CB-GENERATE-INTERNAL-REVIEWER-APPLET", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_internal_reviewer_file() {
        deflexical("*CB-INTERNAL-REVIEWER-CODEBASE*", $str_alt0$_java_internalRuleReviewer);
        deflexical("*CB-INTERNAL-REVIEWER-APPLET-CODE*", $str_alt11$com_cyc_tool_internalRuleReviewer);
        deflexical("*CB-INTERNAL-REVIEWER-APPLET-ARCHIVE*", $str_alt12$InternalRuleReviewer_jar_OpenCyc_);
        deflexical("*CB-INTERNAL-REVIEWER-WINDOW-HEIGHT*", $int$700);
        deflexical("*CB-INTERNAL-REVIEWER-WINDOW-WIDTH*", $int$600);
        deflexical("*CB-INTERNAL-REVIEWER-APPLET-HEIGHT*", $int$400);
        deflexical("*CB-INTERNAL-REVIEWER-APPLET-WIDTH*", $int$500);
        deflexical("*CB-INTERNAL-REVIEWER-APPLET-CACHED-TASKS*", THREE_INTEGER);
        deflexical("*CB-INTERNAL-REVIEWER-APPLET-RETRIEVAL-MT*", $str_alt17$__SuggestedRulesMt);
        deflexical("*CB-INTERNAL-REVIEWER-APPLET-ASSERTION-MT*", $str_alt17$__SuggestedRulesMt);
        deflexical("*CB-INTERNAL-REVIEWER-APPLET-PROJECT-NAME*", $str_alt18$__GeneralCycKE);
        return NIL;
    }

    public static final SubLObject setup_cb_internal_reviewer_file() {
                cb_utilities.declare_cb_tool($INTERNAL_REVIEWER, $$$Internal_Rule_Reviewer, $$$REV, $str_alt4$Review_potential_rules_for_accura);
        cb_utilities.setup_cb_link_method($INTERNAL_REVIEWER, CB_LINK_INTERNAL_REVIEWER, ONE_INTEGER);
        html_macros.note_html_handler_function(CB_INTERNAL_REVIEWER);
        return NIL;
    }

    // // Internal Constants
    static private final SubLString $str_alt0$_java_internalRuleReviewer = makeString("/java/internalRuleReviewer");

    private static final SubLSymbol $INTERNAL_REVIEWER = makeKeyword("INTERNAL-REVIEWER");

    static private final SubLString $$$Internal_Rule_Reviewer = makeString("Internal Rule Reviewer");

    static private final SubLString $$$REV = makeString("REV");

    static private final SubLString $str_alt4$Review_potential_rules_for_accura = makeString("Review potential rules for accuracy.");

    static private final SubLString $str_alt5$_IntRev_ = makeString("[IntRev]");



    static private final SubLString $str_alt7$cb_internal_reviewer = makeString("cb-internal-reviewer");

    private static final SubLSymbol CB_LINK_INTERNAL_REVIEWER = makeSymbol("CB-LINK-INTERNAL-REVIEWER");

    static private final SubLString $$$the_internal_rule_reviewer = makeString("the internal rule reviewer");

    private static final SubLSymbol CB_INTERNAL_REVIEWER = makeSymbol("CB-INTERNAL-REVIEWER");

    static private final SubLString $str_alt11$com_cyc_tool_internalRuleReviewer = makeString("com.cyc.tool.internalRuleReviewer.InternalRuleReviewerApplet");

    static private final SubLString $str_alt12$InternalRuleReviewer_jar_OpenCyc_ = makeString("InternalRuleReviewer.jar,OpenCyc.jar,jug.jar,jakarta-oro-2.0.3.jar,ViolinStrings.jar,cyc-common.jar,cyc-framework.jar");

    public static final SubLInteger $int$700 = makeInteger(700);

    public static final SubLInteger $int$600 = makeInteger(600);

    public static final SubLInteger $int$400 = makeInteger(400);

    public static final SubLInteger $int$500 = makeInteger(500);

    static private final SubLString $str_alt17$__SuggestedRulesMt = makeString("#$SuggestedRulesMt");

    static private final SubLString $str_alt18$__GeneralCycKE = makeString("#$GeneralCycKE");

    static private final SubLString $$$unknown = makeString("unknown");

    static private final SubLString $str_alt20$host_name = makeString("host_name");

    static private final SubLString $$$port = makeString("port");

    static private final SubLString $$$user = makeString("user");

    static private final SubLString $$$project = makeString("project");

    static private final SubLString $$$assertionMt = makeString("assertionMt");

    static private final SubLString $$$retrievalMt = makeString("retrievalMt");

    static private final SubLString $$$width = makeString("width");

    static private final SubLString $$$height = makeString("height");

    static private final SubLString $$$cachedTasks = makeString("cachedTasks");

    // // Initializers
    @Override
    public void declareFunctions() {
        declare_cb_internal_reviewer_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_internal_reviewer_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_internal_reviewer_file();
    }
}

