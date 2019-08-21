package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.cb_refresher_applet;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.cb_refresher_applet.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class cb_refresher_applet extends SubLTranslatedFile {
    public static final SubLFile me = new cb_refresher_applet();

    public static final String myName = "com.cyc.cycjava.cycl.cb_refresher_applet";

    public static final String myFingerPrint = "719ff03c3dcd41574f828c0dcde3222876582e0a619aee2078e65df8abddd59f";

    // deflexical
    // Definitions
    public static final SubLSymbol $cb_refresher_archive$ = makeSymbol("*CB-REFRESHER-ARCHIVE*");

    // deflexical
    public static final SubLSymbol $cb_refresher_codebase$ = makeSymbol("*CB-REFRESHER-CODEBASE*");

    // deflexical
    public static final SubLSymbol $cb_refresher_class_file$ = makeSymbol("*CB-REFRESHER-CLASS-FILE*");

    // deflexical
    public static final SubLSymbol $cb_refresher_javascript_template$ = makeSymbol("*CB-REFRESHER-JAVASCRIPT-TEMPLATE*");

    // deflexical
    public static final SubLSymbol $cb_refresher_caller$ = makeSymbol("*CB-REFRESHER-CALLER*");

    // Internal Constants
    public static final SubLString $str0$Refresher_jar___lib_OpenCyc_jar__ = makeString("Refresher.jar , lib/OpenCyc.jar , lib/jakarta-oro-2.0.3.jar");

    public static final SubLString $str1$_java_refresher = makeString("/java/refresher");

    public static final SubLString $str2$com_cyc_common_applet_refresher_R = makeString("com.cyc.common.applet.refresher.RefresherApplet");

    public static final SubLString $str3$_script_LANGUAGE__JavaScript_____ = makeString("<script LANGUAGE=\"JavaScript\"> <!--\nfunction callRefresherApplet() {          \ndocument.write(\'<applet code=~S codebase=~S archive=~S height=\"1\" width=\"1\">\') \ndocument.write(\'<param name=\"refresh_url\" value=\"\' + document.URL + \'\">\')                                             \ndocument.write(\'<param name=\"refresh_function\" value=~S>\')                                                           \ndocument.write(\'<param name=\"polling_msecs\" value=\"~S\">\')                                                           \ndocument.write(\'<param name=\"extra_data\" value=~S>\')                                                              \ndocument.write(\'<param name=\"host_name\" value=~S>\')                                                     \ndocument.write(\'<param name=\"port\" value=~S>\')\ndocument.write(\'<param name=\"target\" value=~S\')                                                                    \ndocument.write(\'<applet>\')                                                                                            \n}                                                                                                                     \n// -->                                                                                                                \n</script> \n");

    public static final SubLString $str4$_script_LANGUAGE__JavaScript_____ = makeString("<script LANGUAGE=\"JavaScript\"> \n<!-- \ncallRefresherApplet() \n// --> \n</script>");

    public static final SubLString $str5$_self = makeString("_self");

    public static SubLObject cb_refresher_applet(final SubLObject url, final SubLObject update_func, final SubLObject refresh_msecs, SubLObject extra_params, SubLObject target_name, SubLObject host_name, SubLObject port_num) {
        if (extra_params == UNPROVIDED) {
            extra_params = NIL;
        }
        if (target_name == UNPROVIDED) {
            target_name = $str5$_self;
        }
        if (host_name == UNPROVIDED) {
            host_name = cb_uia_forwarding.get_forwarding_machine_name();
        }
        if (port_num == UNPROVIDED) {
            port_num = cb_uia_forwarding.get_forwarding_base_port();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        format(html_macros.$html_stream$.getDynamicValue(thread), $cb_refresher_javascript_template$.getGlobalValue(), new SubLObject[]{ $cb_refresher_class_file$.getGlobalValue(), $cb_refresher_codebase$.getGlobalValue(), $cb_refresher_archive$.getGlobalValue(), write_to_string(update_func, EMPTY_SUBL_OBJECT_ARRAY), refresh_msecs, extra_params, host_name, port_num, target_name });
        html_markup($cb_refresher_caller$.getGlobalValue());
        return NIL;
    }

    public static SubLObject declare_cb_refresher_applet_file() {
        declareFunction(me, "cb_refresher_applet", "CB-REFRESHER-APPLET", 3, 4, false);
        return NIL;
    }

    public static SubLObject init_cb_refresher_applet_file() {
        deflexical("*CB-REFRESHER-ARCHIVE*", $str0$Refresher_jar___lib_OpenCyc_jar__);
        deflexical("*CB-REFRESHER-CODEBASE*", $str1$_java_refresher);
        deflexical("*CB-REFRESHER-CLASS-FILE*", $str2$com_cyc_common_applet_refresher_R);
        deflexical("*CB-REFRESHER-JAVASCRIPT-TEMPLATE*", $str3$_script_LANGUAGE__JavaScript_____);
        deflexical("*CB-REFRESHER-CALLER*", $str4$_script_LANGUAGE__JavaScript_____);
        return NIL;
    }

    public static SubLObject setup_cb_refresher_applet_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_refresher_applet_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_refresher_applet_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_refresher_applet_file();
    }

    static {












    }
}

/**
 * Total time: 64 ms
 */
