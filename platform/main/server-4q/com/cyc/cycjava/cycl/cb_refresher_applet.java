/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CB-REFRESHER-APPLET
 * source file: /cyc/top/cycl/cb-refresher-applet.lisp
 * created:     2019/07/03 17:38:09
 */
public final class cb_refresher_applet extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new cb_refresher_applet();

 public static final String myName = "com.cyc.cycjava.cycl.cb_refresher_applet";


    // deflexical
    // Definitions
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $cb_refresher_archive$ = makeSymbol("*CB-REFRESHER-ARCHIVE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $cb_refresher_codebase$ = makeSymbol("*CB-REFRESHER-CODEBASE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $cb_refresher_class_file$ = makeSymbol("*CB-REFRESHER-CLASS-FILE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $cb_refresher_javascript_template$ = makeSymbol("*CB-REFRESHER-JAVASCRIPT-TEMPLATE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $cb_refresher_caller$ = makeSymbol("*CB-REFRESHER-CALLER*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str0$Refresher_jar___lib_OpenCyc_jar__ = makeString("Refresher.jar , lib/OpenCyc.jar , lib/jakarta-oro-2.0.3.jar");

    static private final SubLString $str1$_java_refresher = makeString("/java/refresher");

    static private final SubLString $str2$com_cyc_common_applet_refresher_R = makeString("com.cyc.common.applet.refresher.RefresherApplet");

    static private final SubLString $str3$_script_LANGUAGE__JavaScript_____ = makeString("<script LANGUAGE=\"JavaScript\"> <!--\nfunction callRefresherApplet() {          \ndocument.write(\'<applet code=~S codebase=~S archive=~S height=\"1\" width=\"1\">\') \ndocument.write(\'<param name=\"refresh_url\" value=\"\' + document.URL + \'\">\')                                             \ndocument.write(\'<param name=\"refresh_function\" value=~S>\')                                                           \ndocument.write(\'<param name=\"polling_msecs\" value=\"~S\">\')                                                           \ndocument.write(\'<param name=\"extra_data\" value=~S>\')                                                              \ndocument.write(\'<param name=\"host_name\" value=~S>\')                                                     \ndocument.write(\'<param name=\"port\" value=~S>\')\ndocument.write(\'<param name=\"target\" value=~S\')                                                                    \ndocument.write(\'<applet>\')                                                                                            \n}                                                                                                                     \n// -->                                                                                                                \n</script> \n");

    static private final SubLString $str4$_script_LANGUAGE__JavaScript_____ = makeString("<script LANGUAGE=\"JavaScript\"> \n<!-- \ncallRefresherApplet() \n// --> \n</script>");

    static private final SubLString $str5$_self = makeString("_self");

    /**
     * Print out everything necessary to get a refresher applet running on the page.  The refresher applet
     * will check at regular intervals to see if a page should be updated, doing so if required.
     *
     * @param EXTRA-PARAMS
     * 		string; a string that will be added directly after the name of UPDATE-FUNC.  It will be
     * 		received by Cyc not as a string, but rather as whatever parameters are sent in.  For example, the function
     * 		UPDATE? and the string '1' will result in a call to cyc of the form (update? 1).
     * @param UPDATE-FUNC,
     * 		a function that the applet will call to see if the page should be updated
     * @param HOST-NAME
     * 		string; this should not normally be used, since the ports might be forwarded, in which case
     * 		the default value will still be right.
     * @param PORT-NUM
     * 		string; this should not normally be used, since the ports might be forwarded, in which case
     * 		the default value will still be right.
     */
    @LispMethod(comment = "Print out everything necessary to get a refresher applet running on the page.  The refresher applet\r\nwill check at regular intervals to see if a page should be updated, doing so if required.\r\n\r\n@param EXTRA-PARAMS\r\n\t\tstring; a string that will be added directly after the name of UPDATE-FUNC.  It will be\r\n\t\treceived by Cyc not as a string, but rather as whatever parameters are sent in.  For example, the function\r\n\t\tUPDATE? and the string \'1\' will result in a call to cyc of the form (update? 1).\r\n@param UPDATE-FUNC,\r\n\t\ta function that the applet will call to see if the page should be updated\r\n@param HOST-NAME\r\n\t\tstring; this should not normally be used, since the ports might be forwarded, in which case\r\n\t\tthe default value will still be right.\r\n@param PORT-NUM\r\n\t\tstring; this should not normally be used, since the ports might be forwarded, in which case\r\n\t\tthe default value will still be right.\nPrint out everything necessary to get a refresher applet running on the page.  The refresher applet\nwill check at regular intervals to see if a page should be updated, doing so if required.")
    public static final SubLObject cb_refresher_applet_alt(SubLObject url, SubLObject update_func, SubLObject refresh_msecs, SubLObject extra_params, SubLObject target_name, SubLObject host_name, SubLObject port_num) {
        if (extra_params == UNPROVIDED) {
            extra_params = NIL;
        }
        if (target_name == UNPROVIDED) {
            target_name = $str_alt5$_self;
        }
        if (host_name == UNPROVIDED) {
            host_name = cb_uia_forwarding.get_forwarding_machine_name();
        }
        if (port_num == UNPROVIDED) {
            port_num = cb_uia_forwarding.get_forwarding_base_port();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            format(html_macros.$html_stream$.getDynamicValue(thread), $cb_refresher_javascript_template$.getGlobalValue(), new SubLObject[]{ $cb_refresher_class_file$.getGlobalValue(), $cb_refresher_codebase$.getGlobalValue(), $cb_refresher_archive$.getGlobalValue(), write_to_string(update_func, EMPTY_SUBL_OBJECT_ARRAY), refresh_msecs, extra_params, host_name, port_num, target_name });
            html_markup($cb_refresher_caller$.getGlobalValue());
            return NIL;
        }
    }

    /**
     * Print out everything necessary to get a refresher applet running on the page.  The refresher applet
     * will check at regular intervals to see if a page should be updated, doing so if required.
     *
     * @param EXTRA-PARAMS
     * 		string; a string that will be added directly after the name of UPDATE-FUNC.  It will be
     * 		received by Cyc not as a string, but rather as whatever parameters are sent in.  For example, the function
     * 		UPDATE? and the string '1' will result in a call to cyc of the form (update? 1).
     * @param UPDATE-FUNC,
     * 		a function that the applet will call to see if the page should be updated
     * @param HOST-NAME
     * 		string; this should not normally be used, since the ports might be forwarded, in which case
     * 		the default value will still be right.
     * @param PORT-NUM
     * 		string; this should not normally be used, since the ports might be forwarded, in which case
     * 		the default value will still be right.
     */
    @LispMethod(comment = "Print out everything necessary to get a refresher applet running on the page.  The refresher applet\r\nwill check at regular intervals to see if a page should be updated, doing so if required.\r\n\r\n@param EXTRA-PARAMS\r\n\t\tstring; a string that will be added directly after the name of UPDATE-FUNC.  It will be\r\n\t\treceived by Cyc not as a string, but rather as whatever parameters are sent in.  For example, the function\r\n\t\tUPDATE? and the string \'1\' will result in a call to cyc of the form (update? 1).\r\n@param UPDATE-FUNC,\r\n\t\ta function that the applet will call to see if the page should be updated\r\n@param HOST-NAME\r\n\t\tstring; this should not normally be used, since the ports might be forwarded, in which case\r\n\t\tthe default value will still be right.\r\n@param PORT-NUM\r\n\t\tstring; this should not normally be used, since the ports might be forwarded, in which case\r\n\t\tthe default value will still be right.\nPrint out everything necessary to get a refresher applet running on the page.  The refresher applet\nwill check at regular intervals to see if a page should be updated, doing so if required.")
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
        declareFunction("cb_refresher_applet", "CB-REFRESHER-APPLET", 3, 4, false);
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$Refresher_jar___lib_OpenCyc_jar__ = makeString("Refresher.jar , lib/OpenCyc.jar , lib/jakarta-oro-2.0.3.jar");

    public static SubLObject init_cb_refresher_applet_file() {
        deflexical("*CB-REFRESHER-ARCHIVE*", $str0$Refresher_jar___lib_OpenCyc_jar__);
        deflexical("*CB-REFRESHER-CODEBASE*", $str1$_java_refresher);
        deflexical("*CB-REFRESHER-CLASS-FILE*", $str2$com_cyc_common_applet_refresher_R);
        deflexical("*CB-REFRESHER-JAVASCRIPT-TEMPLATE*", $str3$_script_LANGUAGE__JavaScript_____);
        deflexical("*CB-REFRESHER-CALLER*", $str4$_script_LANGUAGE__JavaScript_____);
        return NIL;
    }

    static private final SubLString $str_alt1$_java_refresher = makeString("/java/refresher");

    static private final SubLString $str_alt2$com_cyc_common_applet_refresher_R = makeString("com.cyc.common.applet.refresher.RefresherApplet");

    static private final SubLString $str_alt3$_script_LANGUAGE__JavaScript_____ = makeString("<script LANGUAGE=\"JavaScript\"> <!--\nfunction callRefresherApplet() {          \ndocument.write(\'<applet code=~S codebase=~S archive=~S height=\"1\" width=\"1\">\') \ndocument.write(\'<param name=\"refresh_url\" value=\"\' + document.URL + \'\">\')                                             \ndocument.write(\'<param name=\"refresh_function\" value=~S>\')                                                           \ndocument.write(\'<param name=\"polling_msecs\" value=\"~S\">\')                                                           \ndocument.write(\'<param name=\"extra_data\" value=~S>\')                                                              \ndocument.write(\'<param name=\"host_name\" value=~S>\')                                                     \ndocument.write(\'<param name=\"port\" value=~S>\')\ndocument.write(\'<param name=\"target\" value=~S\')                                                                    \ndocument.write(\'<applet>\')                                                                                            \n}                                                                                                                     \n// -->                                                                                                                \n</script> \n");

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

    static private final SubLString $str_alt4$_script_LANGUAGE__JavaScript_____ = makeString("<script LANGUAGE=\"JavaScript\"> \n<!-- \ncallRefresherApplet() \n// --> \n</script>");

    static private final SubLString $str_alt5$_self = makeString("_self");
}

/**
 * Total time: 64 ms
 */
