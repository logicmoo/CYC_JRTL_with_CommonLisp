/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

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
 *  module:      CB-EXTERNAL-REVIEWER
 *  source file: /cyc/top/cycl/cb-external-reviewer.lisp
 *  created:     2019/07/03 17:38:09
 */
public final class cb_external_reviewer extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_external_reviewer() {
    }

    public static final SubLFile me = new cb_external_reviewer();

    public static final String myName = "com.cyc.cycjava.cycl.cb_external_reviewer";

    // // Definitions
    // deflexical
    private static final SubLSymbol $cb_external_reviewer_codebase$ = makeSymbol("*CB-EXTERNAL-REVIEWER-CODEBASE*");

    public static final SubLObject cb_link_external_reviewer(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt5$_ExtRev_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                html_utilities.html_princ($str_alt7$cb_external_reviewer);
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

    public static final SubLObject cb_external_reviewer(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_external_rule_reviewer);
        } else {
            cb_external_reviewer_external(args);
        }
        return NIL;
    }

    public static final SubLObject cb_external_reviewer_external(SubLObject args) {
        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_utilities.html_markup(ONE_INTEGER);
        html_utilities.html_char(CHAR_greater, UNPROVIDED);
        html_utilities.html_princ($$$External_Rule_Reviewer);
        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_utilities.html_markup(ONE_INTEGER);
        html_utilities.html_char(CHAR_greater, UNPROVIDED);
        cb_generate_external_reviewer_applet();
        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    // deflexical
    private static final SubLSymbol $cb_external_reviewer_applet_code$ = makeSymbol("*CB-EXTERNAL-REVIEWER-APPLET-CODE*");

    // deflexical
    private static final SubLSymbol $cb_external_reviewer_applet_archive$ = makeSymbol("*CB-EXTERNAL-REVIEWER-APPLET-ARCHIVE*");

    // deflexical
    private static final SubLSymbol $cb_external_reviewer_window_height$ = makeSymbol("*CB-EXTERNAL-REVIEWER-WINDOW-HEIGHT*");

    // deflexical
    private static final SubLSymbol $cb_external_reviewer_window_width$ = makeSymbol("*CB-EXTERNAL-REVIEWER-WINDOW-WIDTH*");

    // deflexical
    private static final SubLSymbol $cb_external_reviewer_applet_height$ = makeSymbol("*CB-EXTERNAL-REVIEWER-APPLET-HEIGHT*");

    // deflexical
    private static final SubLSymbol $cb_external_reviewer_applet_width$ = makeSymbol("*CB-EXTERNAL-REVIEWER-APPLET-WIDTH*");

    // deflexical
    public static final SubLSymbol $cb_external_reviewer_applet_cached_tasks$ = makeSymbol("*CB-EXTERNAL-REVIEWER-APPLET-CACHED-TASKS*");

    // deflexical
    private static final SubLSymbol $cb_external_reviewer_applet_retrieval_mt$ = makeSymbol("*CB-EXTERNAL-REVIEWER-APPLET-RETRIEVAL-MT*");

    // deflexical
    private static final SubLSymbol $cb_external_reviewer_applet_assertion_mt$ = makeSymbol("*CB-EXTERNAL-REVIEWER-APPLET-ASSERTION-MT*");

    // deflexical
    private static final SubLSymbol $cb_external_reviewer_applet_project_name$ = makeSymbol("*CB-EXTERNAL-REVIEWER-APPLET-PROJECT-NAME*");

    public static final SubLObject cb_generate_external_reviewer_applet() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject machine_name = Environment.get_network_name(Environment.get_machine_name($$$unknown));
                SubLObject port_base = system_parameters.$base_tcp_port$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_applet_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_applet_code$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($cb_external_reviewer_applet_code$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_applet_codebase$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($cb_external_reviewer_codebase$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_applet_archive$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($cb_external_reviewer_applet_archive$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_applet_height$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($cb_external_reviewer_applet_height$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_applet_width$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($cb_external_reviewer_applet_width$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($$$assertionMt);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($cb_external_reviewer_applet_assertion_mt$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($$$cachedTasks);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($cb_external_reviewer_applet_cached_tasks$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($$$height);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($cb_external_reviewer_window_height$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($str_alt24$host_name);
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
                        html_utilities.html_markup($$$project);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($cb_external_reviewer_applet_project_name$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($$$retrievalMt);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($cb_external_reviewer_applet_retrieval_mt$.getGlobalValue());
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
                        html_utilities.html_markup($$$width);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($cb_external_reviewer_window_width$.getGlobalValue());
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

    public static final SubLObject declare_cb_external_reviewer_file() {
        declareFunction("cb_link_external_reviewer", "CB-LINK-EXTERNAL-REVIEWER", 0, 1, false);
        declareFunction("cb_external_reviewer", "CB-EXTERNAL-REVIEWER", 0, 1, false);
        declareFunction("cb_external_reviewer_external", "CB-EXTERNAL-REVIEWER-EXTERNAL", 1, 0, false);
        declareFunction("cb_generate_external_reviewer_applet", "CB-GENERATE-EXTERNAL-REVIEWER-APPLET", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_external_reviewer_file() {
        deflexical("*CB-EXTERNAL-REVIEWER-CODEBASE*", $str_alt0$_java_externalRuleReviewer);
        deflexical("*CB-EXTERNAL-REVIEWER-APPLET-CODE*", $str_alt11$com_cyc_tool_externalRuleReviewer);
        deflexical("*CB-EXTERNAL-REVIEWER-APPLET-ARCHIVE*", cconcatenate($str_alt12$ExternalRuleReviewer_jar, new SubLObject[]{ $str_alt13$_, cb_internal_reviewer.$cb_internal_reviewer_applet_archive$.getGlobalValue() }));
        deflexical("*CB-EXTERNAL-REVIEWER-WINDOW-HEIGHT*", $int$700);
        deflexical("*CB-EXTERNAL-REVIEWER-WINDOW-WIDTH*", $int$600);
        deflexical("*CB-EXTERNAL-REVIEWER-APPLET-HEIGHT*", $int$400);
        deflexical("*CB-EXTERNAL-REVIEWER-APPLET-WIDTH*", $int$500);
        deflexical("*CB-EXTERNAL-REVIEWER-APPLET-CACHED-TASKS*", THREE_INTEGER);
        deflexical("*CB-EXTERNAL-REVIEWER-APPLET-RETRIEVAL-MT*", $str_alt18$__SuggestedRulesMt);
        deflexical("*CB-EXTERNAL-REVIEWER-APPLET-ASSERTION-MT*", $str_alt18$__SuggestedRulesMt);
        deflexical("*CB-EXTERNAL-REVIEWER-APPLET-PROJECT-NAME*", $str_alt19$__GeneralCycKE);
        return NIL;
    }

    public static final SubLObject setup_cb_external_reviewer_file() {
                cb_utilities.declare_cb_tool($EXTERNAL_REVIEWER, $$$External_Rule_Reviewer, $$$REV, $str_alt4$Review_potential_rules_for_accura);
        cb_utilities.setup_cb_link_method($EXTERNAL_REVIEWER, CB_LINK_EXTERNAL_REVIEWER, ONE_INTEGER);
        html_macros.note_html_handler_function(CB_EXTERNAL_REVIEWER);
        return NIL;
    }

    // // Internal Constants
    static private final SubLString $str_alt0$_java_externalRuleReviewer = makeString("/java/externalRuleReviewer");

    private static final SubLSymbol $EXTERNAL_REVIEWER = makeKeyword("EXTERNAL-REVIEWER");

    static private final SubLString $$$External_Rule_Reviewer = makeString("External Rule Reviewer");

    static private final SubLString $$$REV = makeString("REV");

    static private final SubLString $str_alt4$Review_potential_rules_for_accura = makeString("Review potential rules for accuracy.");

    static private final SubLString $str_alt5$_ExtRev_ = makeString("[ExtRev]");



    static private final SubLString $str_alt7$cb_external_reviewer = makeString("cb-external-reviewer");

    private static final SubLSymbol CB_LINK_EXTERNAL_REVIEWER = makeSymbol("CB-LINK-EXTERNAL-REVIEWER");

    static private final SubLString $$$the_external_rule_reviewer = makeString("the external rule reviewer");

    private static final SubLSymbol CB_EXTERNAL_REVIEWER = makeSymbol("CB-EXTERNAL-REVIEWER");

    static private final SubLString $str_alt11$com_cyc_tool_externalRuleReviewer = makeString("com.cyc.tool.externalRuleReviewer.ExternalRuleReviewerApplet3");

    static private final SubLString $str_alt12$ExternalRuleReviewer_jar = makeString("ExternalRuleReviewer.jar");

    static private final SubLString $str_alt13$_ = makeString(",");

    public static final SubLInteger $int$700 = makeInteger(700);

    public static final SubLInteger $int$600 = makeInteger(600);

    public static final SubLInteger $int$400 = makeInteger(400);

    public static final SubLInteger $int$500 = makeInteger(500);

    static private final SubLString $str_alt18$__SuggestedRulesMt = makeString("#$SuggestedRulesMt");

    static private final SubLString $str_alt19$__GeneralCycKE = makeString("#$GeneralCycKE");

    static private final SubLString $$$unknown = makeString("unknown");

    static private final SubLString $$$assertionMt = makeString("assertionMt");

    static private final SubLString $$$cachedTasks = makeString("cachedTasks");

    static private final SubLString $$$height = makeString("height");

    static private final SubLString $str_alt24$host_name = makeString("host_name");

    static private final SubLString $$$port = makeString("port");

    static private final SubLString $$$project = makeString("project");

    static private final SubLString $$$retrievalMt = makeString("retrievalMt");

    static private final SubLString $$$user = makeString("user");

    static private final SubLString $$$width = makeString("width");

    // // Initializers
    @Override
    public void declareFunctions() {
        declare_cb_external_reviewer_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_external_reviewer_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_external_reviewer_file();
    }
}

