/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
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
 *  module:      CB-POPULATOR
 *  source file: /cyc/top/cycl/cb-populator.lisp
 *  created:     2019/07/03 17:38:09
 */
public final class cb_populator extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_populator() {
    }

    public static final SubLFile me = new cb_populator();


    // // Definitions
    // deflexical
    private static final SubLSymbol $cb_predicate_populator_codebase$ = makeSymbol("*CB-PREDICATE-POPULATOR-CODEBASE*");

    public static final SubLObject cb_link_predicate_populator(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt5$_PredPop_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                html_utilities.html_princ($str_alt7$cb_predicate_populator);
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

    public static final SubLObject cb_predicate_populator(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_predicate_populator);
        } else {
            cb_predicate_populator_internal(args);
        }
        return NIL;
    }

    public static final SubLObject cb_predicate_populator_internal(SubLObject args) {
        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_utilities.html_markup(ONE_INTEGER);
        html_utilities.html_char(CHAR_greater, UNPROVIDED);
        html_utilities.html_princ($$$Predicate_Populator);
        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_utilities.html_markup(ONE_INTEGER);
        html_utilities.html_char(CHAR_greater, UNPROVIDED);
        cb_generate_predicate_populator_applet();
        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    // deflexical
    private static final SubLSymbol $cb_predicate_populator_applet_code$ = makeSymbol("*CB-PREDICATE-POPULATOR-APPLET-CODE*");

    // deflexical
    private static final SubLSymbol $cb_predicate_populator_applet_archive$ = makeSymbol("*CB-PREDICATE-POPULATOR-APPLET-ARCHIVE*");

    // deflexical
    private static final SubLSymbol $cb_predicate_populator_applet_height$ = makeSymbol("*CB-PREDICATE-POPULATOR-APPLET-HEIGHT*");

    // deflexical
    private static final SubLSymbol $cb_predicate_populator_applet_width$ = makeSymbol("*CB-PREDICATE-POPULATOR-APPLET-WIDTH*");

    // deflexical
    public static final SubLSymbol $cb_predicate_populator_applet_displayed_tasks$ = makeSymbol("*CB-PREDICATE-POPULATOR-APPLET-DISPLAYED-TASKS*");

    // deflexical
    public static final SubLSymbol $cb_predicate_populator_applet_cached_tasks$ = makeSymbol("*CB-PREDICATE-POPULATOR-APPLET-CACHED-TASKS*");

    // deflexical
    private static final SubLSymbol $cb_predicate_populator_applet_retrieval_mt$ = makeSymbol("*CB-PREDICATE-POPULATOR-APPLET-RETRIEVAL-MT*");

    // deflexical
    private static final SubLSymbol $cb_predicate_populator_applet_assertion_mt$ = makeSymbol("*CB-PREDICATE-POPULATOR-APPLET-ASSERTION-MT*");

    // deflexical
    private static final SubLSymbol $cb_predicate_populator_applet_project_name$ = makeSymbol("*CB-PREDICATE-POPULATOR-APPLET-PROJECT-NAME*");

    public static final SubLObject cb_generate_predicate_populator_applet() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject machine_name = Environment.get_network_name(Environment.get_machine_name($$$unknown));
                SubLObject port_base = system_parameters.$base_tcp_port$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_applet_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_applet_code$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($cb_predicate_populator_applet_code$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_applet_codebase$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($cb_predicate_populator_codebase$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_applet_archive$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($cb_predicate_populator_applet_archive$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_applet_height$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($cb_predicate_populator_applet_height$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_applet_width$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($cb_predicate_populator_applet_width$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($str_alt19$host_name);
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
                        html_utilities.html_markup($cb_predicate_populator_applet_project_name$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($$$assertionMt);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($cb_predicate_populator_applet_assertion_mt$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($$$retrievalMt);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($cb_predicate_populator_applet_retrieval_mt$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($$$width);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($cb_predicate_populator_applet_width$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($$$height);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($cb_predicate_populator_applet_height$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($$$cachedTasks);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($cb_predicate_populator_applet_cached_tasks$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($$$displayedTasks);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($cb_predicate_populator_applet_displayed_tasks$.getGlobalValue());
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

    public static final SubLObject declare_cb_populator_file() {
        declareFunction("cb_link_predicate_populator", "CB-LINK-PREDICATE-POPULATOR", 0, 1, false);
        declareFunction("cb_predicate_populator", "CB-PREDICATE-POPULATOR", 0, 1, false);
        declareFunction("cb_predicate_populator_internal", "CB-PREDICATE-POPULATOR-INTERNAL", 1, 0, false);
        declareFunction("cb_generate_predicate_populator_applet", "CB-GENERATE-PREDICATE-POPULATOR-APPLET", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_populator_file() {
        deflexical("*CB-PREDICATE-POPULATOR-CODEBASE*", $str_alt0$_java_predicatePopulator);
        deflexical("*CB-PREDICATE-POPULATOR-APPLET-CODE*", $str_alt12$com_cyc_tool_predicatePopulator_P);
        deflexical("*CB-PREDICATE-POPULATOR-APPLET-ARCHIVE*", $str_alt13$PredicatePopulator_jar_OpenCyc_ja);
        deflexical("*CB-PREDICATE-POPULATOR-APPLET-HEIGHT*", $int$600);
        deflexical("*CB-PREDICATE-POPULATOR-APPLET-WIDTH*", $int$800);
        deflexical("*CB-PREDICATE-POPULATOR-APPLET-DISPLAYED-TASKS*", TEN_INTEGER);
        deflexical("*CB-PREDICATE-POPULATOR-APPLET-CACHED-TASKS*", TEN_INTEGER);
        deflexical("*CB-PREDICATE-POPULATOR-APPLET-RETRIEVAL-MT*", $str_alt16$__PredicatePopulationMt);
        deflexical("*CB-PREDICATE-POPULATOR-APPLET-ASSERTION-MT*", $str_alt16$__PredicatePopulationMt);
        deflexical("*CB-PREDICATE-POPULATOR-APPLET-PROJECT-NAME*", $str_alt17$__GeneralCycKE);
        return NIL;
    }

    public static final SubLObject setup_cb_populator_file() {
                cb_utilities.declare_cb_tool($PREDICATE_POPULATOR, $str_alt2$Semi_Automated_Predicate_Populato, $$$SAPP, $str_alt4$Review_potential_ground_facts_for);
        cb_utilities.setup_cb_link_method($PREDICATE_POPULATOR, CB_LINK_PREDICATE_POPULATOR, ONE_INTEGER);
        html_macros.note_html_handler_function(CB_PREDICATE_POPULATOR);
        return NIL;
    }

    // // Internal Constants
    static private final SubLString $str_alt0$_java_predicatePopulator = makeString("/java/predicatePopulator");

    private static final SubLSymbol $PREDICATE_POPULATOR = makeKeyword("PREDICATE-POPULATOR");

    static private final SubLString $str_alt2$Semi_Automated_Predicate_Populato = makeString("Semi-Automated Predicate Populator");

    static private final SubLString $$$SAPP = makeString("SAPP");

    static private final SubLString $str_alt4$Review_potential_ground_facts_for = makeString("Review potential ground facts for accuracy.");

    static private final SubLString $str_alt5$_PredPop_ = makeString("[PredPop]");



    static private final SubLString $str_alt7$cb_predicate_populator = makeString("cb-predicate-populator");

    private static final SubLSymbol CB_LINK_PREDICATE_POPULATOR = makeSymbol("CB-LINK-PREDICATE-POPULATOR");

    static private final SubLString $$$the_predicate_populator = makeString("the predicate populator");

    private static final SubLSymbol CB_PREDICATE_POPULATOR = makeSymbol("CB-PREDICATE-POPULATOR");

    static private final SubLString $$$Predicate_Populator = makeString("Predicate Populator");

    static private final SubLString $str_alt12$com_cyc_tool_predicatePopulator_P = makeString("com.cyc.tool.predicatePopulator.PredicatePopulatorApplet");

    static private final SubLString $str_alt13$PredicatePopulator_jar_OpenCyc_ja = makeString("PredicatePopulator.jar,OpenCyc.jar,jug.jar,jakarta-oro-2.0.3.jar,ViolinStrings.jar,cyc-common.jar,cyc-framework.jar");

    public static final SubLInteger $int$600 = makeInteger(600);

    public static final SubLInteger $int$800 = makeInteger(800);

    static private final SubLString $str_alt16$__PredicatePopulationMt = makeString("#$PredicatePopulationMt");

    static private final SubLString $str_alt17$__GeneralCycKE = makeString("#$GeneralCycKE");

    static private final SubLString $$$unknown = makeString("unknown");

    static private final SubLString $str_alt19$host_name = makeString("host_name");

    static private final SubLString $$$port = makeString("port");

    static private final SubLString $$$user = makeString("user");

    static private final SubLString $$$project = makeString("project");

    static private final SubLString $$$assertionMt = makeString("assertionMt");

    static private final SubLString $$$retrievalMt = makeString("retrievalMt");

    static private final SubLString $$$width = makeString("width");

    static private final SubLString $$$height = makeString("height");

    static private final SubLString $$$cachedTasks = makeString("cachedTasks");

    static private final SubLString $$$displayedTasks = makeString("displayedTasks");

    // // Initializers
    @Override
    public void declareFunctions() {
        declare_cb_populator_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_populator_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_populator_file();
    }
}

