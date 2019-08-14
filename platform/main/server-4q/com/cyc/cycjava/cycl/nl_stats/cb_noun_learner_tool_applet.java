/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.nl_stats;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.cyc_navigator_internals;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.system_parameters;
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
 *  module:      CB-NOUN-LEARNER-TOOL-APPLET
 *  source file: /cyc/top/cycl/nl-stats/cb-noun-learner-tool-applet.lisp
 *  created:     2019/07/03 17:39:02
 */
public final class cb_noun_learner_tool_applet extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_noun_learner_tool_applet() {
    }

    public static final SubLFile me = new cb_noun_learner_tool_applet();

    public static final String myName = "com.cyc.cycjava.cycl.nl_stats.cb_noun_learner_tool_applet";

    // // Definitions
    // deflexical
    private static final SubLSymbol $noun_learner_applet_code$ = makeSymbol("*NOUN-LEARNER-APPLET-CODE*");

    // deflexical
    private static final SubLSymbol $noun_learner_tool_codebase$ = makeSymbol("*NOUN-LEARNER-TOOL-CODEBASE*");

    public static final SubLObject cb_link_noun_learner(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt6$_NounLrnr_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                html_utilities.html_princ($str_alt8$cb_noun_learner);
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

    public static final SubLObject cb_noun_learner(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_noun_learner_tool);
        } else {
            cb_noun_learner_internal(args);
        }
        return NIL;
    }

    public static final SubLObject cb_noun_learner_internal(SubLObject args) {
        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_utilities.html_markup(TWO_INTEGER);
        html_utilities.html_char(CHAR_greater, UNPROVIDED);
        html_utilities.html_princ($$$Noun_Learner_Tool);
        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_utilities.html_markup(TWO_INTEGER);
        html_utilities.html_char(CHAR_greater, UNPROVIDED);
        cb_generate_noun_learner_applet();
        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_generate_noun_learner_applet() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject machine_name = Environment.get_network_name(Environment.get_machine_name($$$unknown));
                SubLObject port_base = system_parameters.$base_tcp_port$.getDynamicValue(thread);
                SubLObject archive = cyc_file_dependencies.java_applet_archive_string($$$nounLearner);
                html_utilities.html_markup(html_macros.$html_applet_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_applet_code$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($noun_learner_applet_code$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_applet_codebase$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($noun_learner_tool_codebase$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_applet_archive$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(archive);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_applet_height$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($int$670);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_applet_width$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($int$900);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($$$cycMachine);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(machine_name);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($$$cycPort);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(port_base);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($$$width);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($$$900);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($$$height);
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_param_value$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($$$670);
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
                        html_utilities.html_markup($str_alt24$__GeneralCycKE);
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

    public static final SubLObject declare_cb_noun_learner_tool_applet_file() {
        declareFunction("cb_link_noun_learner", "CB-LINK-NOUN-LEARNER", 0, 1, false);
        declareFunction("cb_noun_learner", "CB-NOUN-LEARNER", 0, 1, false);
        declareFunction("cb_noun_learner_internal", "CB-NOUN-LEARNER-INTERNAL", 1, 0, false);
        declareFunction("cb_generate_noun_learner_applet", "CB-GENERATE-NOUN-LEARNER-APPLET", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_noun_learner_tool_applet_file() {
        deflexical("*NOUN-LEARNER-APPLET-CODE*", $str_alt0$com_cyc_tool_nounLearner_NounLear);
        deflexical("*NOUN-LEARNER-TOOL-CODEBASE*", $str_alt1$_java_nounLearner);
        return NIL;
    }

    public static final SubLObject setup_cb_noun_learner_tool_applet_file() {
                cb_utilities.declare_cb_tool($NOUN_LEARNER, $$$Noun_Learner_Tool, $$$NounLrnr, $str_alt5$Refine_confirm_discard_statistica);
        cb_utilities.setup_cb_link_method($NOUN_LEARNER, CB_LINK_NOUN_LEARNER, ONE_INTEGER);
        html_macros.note_html_handler_function(CB_NOUN_LEARNER);
        return NIL;
    }

    // // Internal Constants
    static private final SubLString $str_alt0$com_cyc_tool_nounLearner_NounLear = makeString("com.cyc.tool.nounLearner.NounLearnerApplet");

    static private final SubLString $str_alt1$_java_nounLearner = makeString("/java/nounLearner");

    private static final SubLSymbol $NOUN_LEARNER = makeKeyword("NOUN-LEARNER");

    static private final SubLString $$$Noun_Learner_Tool = makeString("Noun Learner Tool");

    static private final SubLString $$$NounLrnr = makeString("NounLrnr");

    static private final SubLString $str_alt5$Refine_confirm_discard_statistica = makeString("Refine/confirm/discard statistically-induced types for nouns that are new to Cyc's vocabulary.");

    static private final SubLString $str_alt6$_NounLrnr_ = makeString("[NounLrnr]");



    static private final SubLString $str_alt8$cb_noun_learner = makeString("cb-noun-learner");

    private static final SubLSymbol CB_LINK_NOUN_LEARNER = makeSymbol("CB-LINK-NOUN-LEARNER");

    static private final SubLString $$$the_noun_learner_tool = makeString("the noun learner tool");

    private static final SubLSymbol CB_NOUN_LEARNER = makeSymbol("CB-NOUN-LEARNER");

    static private final SubLString $$$unknown = makeString("unknown");

    static private final SubLString $$$nounLearner = makeString("nounLearner");

    public static final SubLInteger $int$670 = makeInteger(670);

    public static final SubLInteger $int$900 = makeInteger(900);

    static private final SubLString $$$cycMachine = makeString("cycMachine");

    static private final SubLString $$$cycPort = makeString("cycPort");

    static private final SubLString $$$width = makeString("width");

    static private final SubLString $$$900 = makeString("900");

    static private final SubLString $$$height = makeString("height");

    static private final SubLString $$$670 = makeString("670");

    static private final SubLString $$$user = makeString("user");

    static private final SubLString $$$project = makeString("project");

    static private final SubLString $str_alt24$__GeneralCycKE = makeString("#$GeneralCycKE");

    // // Initializers
    @Override
    public void declareFunctions() {
        declare_cb_noun_learner_tool_applet_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_noun_learner_tool_applet_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_noun_learner_tool_applet_file();
    }
}

