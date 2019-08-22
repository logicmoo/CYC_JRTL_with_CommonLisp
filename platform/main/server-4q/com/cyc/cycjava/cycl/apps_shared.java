package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class apps_shared extends SubLTranslatedFile {
    public static final SubLFile me = new apps_shared();

    public static final String myName = "com.cyc.cycjava.cycl.apps_shared";

    public static final String myFingerPrint = "db882b64d0f38661d301cf5325c4c30dc53933518fc3f2b2c17308ad5861a7cb";

    // defparameter
    // Definitions
    public static final SubLSymbol $app_communication_mode_map$ = makeSymbol("*APP-COMMUNICATION-MODE-MAP*");

    // defparameter
    // Namestrings for the colors listed in *html-color-map*
    public static final SubLSymbol $app_color_name_map$ = makeSymbol("*APP-COLOR-NAME-MAP*");

    // defparameter
    // Extra pukey colors not part of the html color specification.
    public static final SubLSymbol $app_color_map$ = makeSymbol("*APP-COLOR-MAP*");

    // Internal Constants
    public static final SubLList $list0 = list(cons(makeString("transmit and receive"), makeKeyword("TRANSMIT-AND-RECEIVE")), cons(makeString("receive only"), makeKeyword("RECEIVE-ONLY")), cons(makeString("deaf"), makeKeyword("DEAF")), cons(makeString("dead"), makeKeyword("DEAD")), cons(makeString("isolated"), makeKeyword("ISOLATED")));

    public static final SubLList $list1 = list(new SubLObject[]{ cons(makeKeyword("BLACK"), makeString("black")), cons(makeKeyword("BLUE"), makeString("blue")), cons(makeKeyword("GREEN"), makeString("green")), cons(makeKeyword("CYAN"), makeString("cyan")), cons(makeKeyword("RED"), makeString("red")), cons(makeKeyword("MAGENTA"), makeString("magenta")), cons(makeKeyword("YELLOW"), makeString("yellow")), cons(makeKeyword("WHITE"), makeString("white")), cons(makeKeyword("LIGHT-BLUE"), makeString("light blue")), cons(makeKeyword("LIGHT-RED"), makeString("light red")), cons(makeKeyword("LIGHT-YELLOW"), makeString("light yellow")), cons(makeKeyword("LIGHT-GRAY"), makeString("light grey")), cons(NIL, makeString("default")), cons(makeKeyword("PERIWINKLE"), makeString("periwinkle")), cons(makeKeyword("SEA-GREEN"), makeString("sea green")) });

    public static final SubLList $list2 = list(cons(makeKeyword("PERIWINKLE"), makeString("CDCDFF")), cons(makeKeyword("SEA-GREEN"), makeString("CDFFCD")));





    public static SubLObject set_app_colors() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = $app_color_map$.getDynamicValue(thread);
        SubLObject form = NIL;
        form = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject item_var = form;
            if (NIL == member(item_var, html_macros.$html_color_map$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(IDENTITY))) {
                html_macros.$html_color_map$.setDynamicValue(cons(item_var, html_macros.$html_color_map$.getDynamicValue(thread)), thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            form = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject sort_app_color_name_map() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $app_color_name_map$.setDynamicValue(Sort.sort(copy_list($app_color_name_map$.getDynamicValue(thread)), symbol_function(STRING_LESSP), symbol_function(CDR)), thread);
        return NIL;
    }

    public static SubLObject configure_app_colors() {
        set_app_colors();
        sort_app_color_name_map();
        return NIL;
    }

    public static SubLObject declare_apps_shared_file() {
        declareFunction(me, "set_app_colors", "SET-APP-COLORS", 0, 0, false);
        declareFunction(me, "sort_app_color_name_map", "SORT-APP-COLOR-NAME-MAP", 0, 0, false);
        declareFunction(me, "configure_app_colors", "CONFIGURE-APP-COLORS", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_apps_shared_file() {
        defparameter("*APP-COMMUNICATION-MODE-MAP*", $list0);
        defparameter("*APP-COLOR-NAME-MAP*", $list1);
        defparameter("*APP-COLOR-MAP*", $list2);
        return NIL;
    }

    public static SubLObject setup_apps_shared_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_apps_shared_file();
    }

    @Override
    public void initializeVariables() {
        init_apps_shared_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_apps_shared_file();
    }

    
}

/**
 * Total time: 95 ms
 */
