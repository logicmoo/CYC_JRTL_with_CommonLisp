package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_refresher_applet extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cb_refresher_applet";
    public static final String myFingerPrint = "719ff03c3dcd41574f828c0dcde3222876582e0a619aee2078e65df8abddd59f";
    @SubLTranslatedFile.SubL(source = "cycl/cb-refresher-applet.lisp", position = 765L)
    public static SubLSymbol $cb_refresher_archive$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-refresher-applet.lisp", position = 874L)
    public static SubLSymbol $cb_refresher_codebase$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-refresher-applet.lisp", position = 939L)
    public static SubLSymbol $cb_refresher_class_file$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-refresher-applet.lisp", position = 1043L)
    public static SubLSymbol $cb_refresher_javascript_template$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-refresher-applet.lisp", position = 2540L)
    public static SubLSymbol $cb_refresher_caller$;
    private static final SubLString $str0$Refresher_jar___lib_OpenCyc_jar__;
    private static final SubLString $str1$_java_refresher;
    private static final SubLString $str2$com_cyc_common_applet_refresher_R;
    private static final SubLString $str3$_script_LANGUAGE__JavaScript_____;
    private static final SubLString $str4$_script_LANGUAGE__JavaScript_____;
    private static final SubLString $str5$_self;
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-refresher-applet.lisp", position = 2670L)
    public static SubLObject cb_refresher_applet(final SubLObject url, final SubLObject update_func, final SubLObject refresh_msecs, SubLObject extra_params, SubLObject target_name, SubLObject host_name, SubLObject port_num) {
        if (extra_params == cb_refresher_applet.UNPROVIDED) {
            extra_params = (SubLObject)cb_refresher_applet.NIL;
        }
        if (target_name == cb_refresher_applet.UNPROVIDED) {
            target_name = (SubLObject)cb_refresher_applet.$str5$_self;
        }
        if (host_name == cb_refresher_applet.UNPROVIDED) {
            host_name = cb_uia_forwarding.get_forwarding_machine_name();
        }
        if (port_num == cb_refresher_applet.UNPROVIDED) {
            port_num = cb_uia_forwarding.get_forwarding_base_port();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), cb_refresher_applet.$cb_refresher_javascript_template$.getGlobalValue(), new SubLObject[] { cb_refresher_applet.$cb_refresher_class_file$.getGlobalValue(), cb_refresher_applet.$cb_refresher_codebase$.getGlobalValue(), cb_refresher_applet.$cb_refresher_archive$.getGlobalValue(), PrintLow.write_to_string(update_func, cb_refresher_applet.EMPTY_SUBL_OBJECT_ARRAY), refresh_msecs, extra_params, host_name, port_num, target_name });
        html_utilities.html_markup(cb_refresher_applet.$cb_refresher_caller$.getGlobalValue());
        return (SubLObject)cb_refresher_applet.NIL;
    }
    
    public static SubLObject declare_cb_refresher_applet_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_refresher_applet", "cb_refresher_applet", "CB-REFRESHER-APPLET", 3, 4, false);
        return (SubLObject)cb_refresher_applet.NIL;
    }
    
    public static SubLObject init_cb_refresher_applet_file() {
        cb_refresher_applet.$cb_refresher_archive$ = SubLFiles.deflexical("*CB-REFRESHER-ARCHIVE*", (SubLObject)cb_refresher_applet.$str0$Refresher_jar___lib_OpenCyc_jar__);
        cb_refresher_applet.$cb_refresher_codebase$ = SubLFiles.deflexical("*CB-REFRESHER-CODEBASE*", (SubLObject)cb_refresher_applet.$str1$_java_refresher);
        cb_refresher_applet.$cb_refresher_class_file$ = SubLFiles.deflexical("*CB-REFRESHER-CLASS-FILE*", (SubLObject)cb_refresher_applet.$str2$com_cyc_common_applet_refresher_R);
        cb_refresher_applet.$cb_refresher_javascript_template$ = SubLFiles.deflexical("*CB-REFRESHER-JAVASCRIPT-TEMPLATE*", (SubLObject)cb_refresher_applet.$str3$_script_LANGUAGE__JavaScript_____);
        cb_refresher_applet.$cb_refresher_caller$ = SubLFiles.deflexical("*CB-REFRESHER-CALLER*", (SubLObject)cb_refresher_applet.$str4$_script_LANGUAGE__JavaScript_____);
        return (SubLObject)cb_refresher_applet.NIL;
    }
    
    public static SubLObject setup_cb_refresher_applet_file() {
        return (SubLObject)cb_refresher_applet.NIL;
    }
    
    public void declareFunctions() {
        declare_cb_refresher_applet_file();
    }
    
    public void initializeVariables() {
        init_cb_refresher_applet_file();
    }
    
    public void runTopLevelForms() {
        setup_cb_refresher_applet_file();
    }
    
    static {
        me = (SubLFile)new cb_refresher_applet();
        cb_refresher_applet.$cb_refresher_archive$ = null;
        cb_refresher_applet.$cb_refresher_codebase$ = null;
        cb_refresher_applet.$cb_refresher_class_file$ = null;
        cb_refresher_applet.$cb_refresher_javascript_template$ = null;
        cb_refresher_applet.$cb_refresher_caller$ = null;
        $str0$Refresher_jar___lib_OpenCyc_jar__ = SubLObjectFactory.makeString("Refresher.jar , lib/OpenCyc.jar , lib/jakarta-oro-2.0.3.jar");
        $str1$_java_refresher = SubLObjectFactory.makeString("/java/refresher");
        $str2$com_cyc_common_applet_refresher_R = SubLObjectFactory.makeString("com.cyc.common.applet.refresher.RefresherApplet");
        $str3$_script_LANGUAGE__JavaScript_____ = SubLObjectFactory.makeString("<script LANGUAGE=\"JavaScript\"> <!--\nfunction callRefresherApplet() {          \ndocument.write('<applet code=~S codebase=~S archive=~S height=\"1\" width=\"1\">') \ndocument.write('<param name=\"refresh_url\" value=\"' + document.URL + '\">')                                             \ndocument.write('<param name=\"refresh_function\" value=~S>')                                                           \ndocument.write('<param name=\"polling_msecs\" value=\"~S\">')                                                           \ndocument.write('<param name=\"extra_data\" value=~S>')                                                              \ndocument.write('<param name=\"host_name\" value=~S>')                                                     \ndocument.write('<param name=\"port\" value=~S>')\ndocument.write('<param name=\"target\" value=~S')                                                                    \ndocument.write('<applet>')                                                                                            \n}                                                                                                                     \n// -->                                                                                                                \n</script> \n");
        $str4$_script_LANGUAGE__JavaScript_____ = SubLObjectFactory.makeString("<script LANGUAGE=\"JavaScript\"> \n<!-- \ncallRefresherApplet() \n// --> \n</script>");
        $str5$_self = SubLObjectFactory.makeString("_self");
    }
}

/*

	Total time: 64 ms
	
*/