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
 *  module:      CB-HARVESTERS
 *  source file: /cyc/top/cycl/cb-harvesters.lisp
 *  created:     2019/07/03 17:38:08
 */
public final class cb_harvesters extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_harvesters() {
    }

    public static final SubLFile me = new cb_harvesters();


    // // Definitions
    // deflexical
    private static final SubLSymbol $cb_harvesters_codebase$ = makeSymbol("*CB-HARVESTERS-CODEBASE*");

    public static final SubLObject cb_link_typical_size_harvester(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt5$_TypSize_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                html_utilities.html_princ($str_alt7$cb_typical_size_harvester);
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

    public static final SubLObject cb_typical_size_harvester(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$the_typical_size_harvester);
        } else {
            cb_typical_size_harvester_internal(args);
        }
        return NIL;
    }

    public static final SubLObject cb_typical_size_harvester_internal(SubLObject args) {
        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_utilities.html_markup(ONE_INTEGER);
        html_utilities.html_char(CHAR_greater, UNPROVIDED);
        html_utilities.html_princ($$$Typical_Size_Harvester);
        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_utilities.html_markup(ONE_INTEGER);
        html_utilities.html_char(CHAR_greater, UNPROVIDED);
        cb_generate_typical_size_applet();
        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    // deflexical
    private static final SubLSymbol $cb_typical_size_applet_code$ = makeSymbol("*CB-TYPICAL-SIZE-APPLET-CODE*");

    // deflexical
    private static final SubLSymbol $cb_typical_size_applet_archive$ = makeSymbol("*CB-TYPICAL-SIZE-APPLET-ARCHIVE*");

    // deflexical
    private static final SubLSymbol $cb_typical_size_applet_height$ = makeSymbol("*CB-TYPICAL-SIZE-APPLET-HEIGHT*");

    // deflexical
    private static final SubLSymbol $cb_typical_size_applet_width$ = makeSymbol("*CB-TYPICAL-SIZE-APPLET-WIDTH*");

    public static final SubLObject cb_generate_typical_size_applet() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            workflow_queue.set_typical_size_queue_object_user(operation_communication.the_cyclist());
            {
                SubLObject machine_name = Environment.get_network_name(Environment.get_machine_name($$$unknown));
                SubLObject port_base = system_parameters.$base_tcp_port$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_applet_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_applet_code$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($cb_typical_size_applet_code$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_applet_codebase$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($cb_harvesters_codebase$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_applet_archive$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($cb_typical_size_applet_archive$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_applet_height$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($cb_typical_size_applet_height$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_applet_width$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_markup($cb_typical_size_applet_width$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_param_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_param_name$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup($$$hostname);
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
                        html_utilities.html_markup(kb_paths.fort_name(operation_communication.the_cyclist()));
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

    public static final SubLObject declare_cb_harvesters_file() {
        declareFunction("cb_link_typical_size_harvester", "CB-LINK-TYPICAL-SIZE-HARVESTER", 0, 1, false);
        declareFunction("cb_typical_size_harvester", "CB-TYPICAL-SIZE-HARVESTER", 0, 1, false);
        declareFunction("cb_typical_size_harvester_internal", "CB-TYPICAL-SIZE-HARVESTER-INTERNAL", 1, 0, false);
        declareFunction("cb_generate_typical_size_applet", "CB-GENERATE-TYPICAL-SIZE-APPLET", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_harvesters_file() {
        deflexical("*CB-HARVESTERS-CODEBASE*", $str_alt0$_java_harvesters);
        deflexical("*CB-TYPICAL-SIZE-APPLET-CODE*", $str_alt11$com_cyc_common_applet_sizeHarvest);
        deflexical("*CB-TYPICAL-SIZE-APPLET-ARCHIVE*", $str_alt12$TypicalSizeHarvester_jar_OpenCyc_);
        deflexical("*CB-TYPICAL-SIZE-APPLET-HEIGHT*", $int$600);
        deflexical("*CB-TYPICAL-SIZE-APPLET-WIDTH*", $int$800);
        return NIL;
    }

    public static final SubLObject setup_cb_harvesters_file() {
                cb_utilities.declare_cb_tool($TYPICAL_SIZE_HARVESTER, $$$Typical_Size_Harvester, $$$TypSize, $str_alt4$Gather_information_on_the_typical);
        cb_utilities.setup_cb_link_method($TYPICAL_SIZE_HARVESTER, CB_LINK_TYPICAL_SIZE_HARVESTER, ONE_INTEGER);
        html_macros.note_html_handler_function(CB_TYPICAL_SIZE_HARVESTER);
        return NIL;
    }

    // // Internal Constants
    static private final SubLString $str_alt0$_java_harvesters = makeString("/java/harvesters");

    private static final SubLSymbol $TYPICAL_SIZE_HARVESTER = makeKeyword("TYPICAL-SIZE-HARVESTER");

    static private final SubLString $$$Typical_Size_Harvester = makeString("Typical Size Harvester");

    static private final SubLString $$$TypSize = makeString("TypSize");

    static private final SubLString $str_alt4$Gather_information_on_the_typical = makeString("Gather information on the typical size of common objects.");

    static private final SubLString $str_alt5$_TypSize_ = makeString("[TypSize]");



    static private final SubLString $str_alt7$cb_typical_size_harvester = makeString("cb-typical-size-harvester");

    private static final SubLSymbol CB_LINK_TYPICAL_SIZE_HARVESTER = makeSymbol("CB-LINK-TYPICAL-SIZE-HARVESTER");

    static private final SubLString $$$the_typical_size_harvester = makeString("the typical size harvester");

    private static final SubLSymbol CB_TYPICAL_SIZE_HARVESTER = makeSymbol("CB-TYPICAL-SIZE-HARVESTER");

    static private final SubLString $str_alt11$com_cyc_common_applet_sizeHarvest = makeString("com.cyc.common.applet.sizeHarvester.TypicalSizeHarvester");

    static private final SubLString $str_alt12$TypicalSizeHarvester_jar_OpenCyc_ = makeString("TypicalSizeHarvester.jar,OpenCyc.jar,jug.jar,jakarta-oro-2.0.3.jar,ViolinStrings.jar");

    public static final SubLInteger $int$600 = makeInteger(600);

    public static final SubLInteger $int$800 = makeInteger(800);

    static private final SubLString $$$unknown = makeString("unknown");

    static private final SubLString $$$hostname = makeString("hostname");

    static private final SubLString $$$port = makeString("port");

    static private final SubLString $$$user = makeString("user");

    // // Initializers
    @Override
    public void declareFunctions() {
        declare_cb_harvesters_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_harvesters_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_harvesters_file();
    }
}

