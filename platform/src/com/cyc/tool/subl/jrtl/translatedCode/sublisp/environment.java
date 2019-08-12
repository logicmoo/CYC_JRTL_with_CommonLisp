/**
 *
 */
/**
 * For LarKC
 */
/**
 *
 */
package com.cyc.tool.subl.jrtl.translatedCode.sublisp;


import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SystemInfo;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.environment;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.environment.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public class environment extends SubLTranslatedFile {
    public static SubLObject declare_environment_file() {
        declareFunction("my_getf", "MY-GETF", 2, 1, false);
        return SubLNil.NIL;
    }

    public static SubLObject get_machine_name(SubLObject v_default) {
        if (v_default == UNPROVIDED)
            v_default = SubLNil.NIL;

        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject machine_name = my_getf(SystemInfo.$system_info$.getDynamicValue(thread), $MACHINE_INSTANCE, UNPROVIDED);
        if (SubLNil.NIL != machine_name)
            return machine_name;

        return my_getf(SystemInfo.$system_info$.getDynamicValue(thread), $NETWORK_NAME, v_default);
    }

    public static SubLObject get_network_name(SubLObject v_default) {
        if (v_default == UNPROVIDED)
            v_default = SubLNil.NIL;

        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject network_name = my_getf(SystemInfo.$system_info$.getDynamicValue(thread), $NETWORK_NAME, UNPROVIDED);
        if (SubLNil.NIL != network_name)
            return network_name;

        return my_getf(SystemInfo.$system_info$.getDynamicValue(thread), $MACHINE_INSTANCE, v_default);
    }

    public static SubLObject get_process_id(SubLObject v_default) {
        if (v_default == UNPROVIDED)
            v_default = SubLNil.NIL;

        SubLThread thread = SubLProcess.currentSubLThread();
        return my_getf(SystemInfo.$system_info$.getDynamicValue(thread), $PROCESS_ID, v_default);
    }

    public static SubLObject get_user_name(SubLObject v_default) {
        if (v_default == UNPROVIDED)
            v_default = SubLNil.NIL;

        SubLThread thread = SubLProcess.currentSubLThread();
        return my_getf(SystemInfo.$system_info$.getDynamicValue(thread), $USER, v_default);
    }

    public static SubLObject init_environment_file() {
        return SubLNil.NIL;
    }

    public static SubLObject lisp_implementation_type() {
        SubLThread thread = SubLProcess.currentSubLThread();
        return my_getf(SystemInfo.$system_info$.getDynamicValue(thread), $LISP_IMPLEMENTATION_TYPE, UNPROVIDED);
    }

    public static SubLObject lisp_implementation_version() {
        SubLThread thread = SubLProcess.currentSubLThread();
        return my_getf(SystemInfo.$system_info$.getDynamicValue(thread), $LISP_IMPLEMENTATION_VERSION, UNPROVIDED);
    }

    public static SubLObject long_site_name() {
        SubLThread thread = SubLProcess.currentSubLThread();
        return my_getf(SystemInfo.$system_info$.getDynamicValue(thread), $LONG_SITE_NAME, UNPROVIDED);
    }

    public static SubLObject machine_instance() {
        SubLThread thread = SubLProcess.currentSubLThread();
        return my_getf(SystemInfo.$system_info$.getDynamicValue(thread), $MACHINE_INSTANCE, UNPROVIDED);
    }

    public static SubLObject machine_type() {
        SubLThread thread = SubLProcess.currentSubLThread();
        return my_getf(SystemInfo.$system_info$.getDynamicValue(thread), $MACHINE_TYPE, UNPROVIDED);
    }

    public static SubLObject machine_version() {
        SubLThread thread = SubLProcess.currentSubLThread();
        return my_getf(SystemInfo.$system_info$.getDynamicValue(thread), $MACHINE_VERSION, UNPROVIDED);
    }

    public static SubLObject my_getf(SubLObject plist, SubLObject indicator, SubLObject v_default) {
        if (v_default == UNPROVIDED)
            v_default = SubLNil.NIL;

        SubLObject next = SubLNil.NIL;
        SubLObject key = SubLNil.NIL;
        next = plist;
        key = next.first();
        while (SubLNil.NIL != next) {
            if (indicator == key)
                return cadr(next);

            next = cddr(next);
            key = next.first();
        } 
        return v_default;
    }

    public static SubLObject setup_environment_file() {
        return SubLNil.NIL;
    }

    public static SubLObject short_site_name() {
        SubLThread thread = SubLProcess.currentSubLThread();
        return my_getf(SystemInfo.$system_info$.getDynamicValue(thread), $SHORT_SITE_NAME, UNPROVIDED);
    }

    public static SubLObject software_type() {
        SubLThread thread = SubLProcess.currentSubLThread();
        return my_getf(SystemInfo.$system_info$.getDynamicValue(thread), $SOFTWARE_TYPE, UNPROVIDED);
    }

    public static SubLObject software_version() {
        SubLThread thread = SubLProcess.currentSubLThread();
        return my_getf(SystemInfo.$system_info$.getDynamicValue(thread), $SOFTWARE_VERSION, UNPROVIDED);
    }

    public static final SubLFile me = new environment();

    public static final String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.environment";

    // Internal Constants
    public static final SubLSymbol $LISP_IMPLEMENTATION_TYPE = makeKeyword("LISP-IMPLEMENTATION-TYPE");

    public static final SubLSymbol $LISP_IMPLEMENTATION_VERSION = makeKeyword("LISP-IMPLEMENTATION-VERSION");

    public static final SubLSymbol $SHORT_SITE_NAME = makeKeyword("SHORT-SITE-NAME");

    public static final SubLSymbol $LONG_SITE_NAME = makeKeyword("LONG-SITE-NAME");

    public static final SubLSymbol $MACHINE_INSTANCE = makeKeyword("MACHINE-INSTANCE");

    public static final SubLSymbol $MACHINE_TYPE = makeKeyword("MACHINE-TYPE");

    public static final SubLSymbol $MACHINE_VERSION = makeKeyword("MACHINE-VERSION");

    public static final SubLSymbol $SOFTWARE_TYPE = makeKeyword("SOFTWARE-TYPE");

    public static final SubLSymbol $SOFTWARE_VERSION = makeKeyword("SOFTWARE-VERSION");



    public static final SubLSymbol $PROCESS_ID = makeKeyword("PROCESS-ID");

    public static final SubLSymbol $NETWORK_NAME = makeKeyword("NETWORK-NAME");

    static {













    }

    @Override
    public void declareFunctions() {
        declare_environment_file();
    }

    @Override
    public void initializeVariables() {
        init_environment_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_environment_file();
    }
}

