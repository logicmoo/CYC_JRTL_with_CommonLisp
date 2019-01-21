package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class apps_shared extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.apps_shared";
    public static final String myFingerPrint = "db882b64d0f38661d301cf5325c4c30dc53933518fc3f2b2c17308ad5861a7cb";
    @SubLTranslatedFile.SubL(source = "cycl/apps-shared.lisp", position = 782L)
    public static SubLSymbol $app_communication_mode_map$;
    @SubLTranslatedFile.SubL(source = "cycl/apps-shared.lisp", position = 1054L)
    public static SubLSymbol $app_color_name_map$;
    @SubLTranslatedFile.SubL(source = "cycl/apps-shared.lisp", position = 1624L)
    public static SubLSymbol $app_color_map$;
    private static final SubLList $list0;
    private static final SubLList $list1;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$STRING_LESSP;
    private static final SubLSymbol $sym4$CDR; 
    
    @SubLTranslatedFile.SubL(source = "cycl/apps-shared.lisp", position = 1803L)
    public static SubLObject set_app_colors() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = apps_shared.$app_color_map$.getDynamicValue(thread);
        SubLObject form = (SubLObject)apps_shared.NIL;
        form = cdolist_list_var.first();
        while (apps_shared.NIL != cdolist_list_var) {
            final SubLObject item_var = form;
            if (apps_shared.NIL == conses_high.member(item_var, html_macros.$html_color_map$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)apps_shared.EQUAL), Symbols.symbol_function((SubLObject)apps_shared.IDENTITY))) {
                html_macros.$html_color_map$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, html_macros.$html_color_map$.getDynamicValue(thread)), thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            form = cdolist_list_var.first();
        }
        return (SubLObject)apps_shared.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/apps-shared.lisp", position = 1923L)
    public static SubLObject sort_app_color_name_map() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        apps_shared.$app_color_name_map$.setDynamicValue(Sort.sort(conses_high.copy_list(apps_shared.$app_color_name_map$.getDynamicValue(thread)), Symbols.symbol_function((SubLObject)apps_shared.$sym3$STRING_LESSP), Symbols.symbol_function((SubLObject)apps_shared.$sym4$CDR)), thread);
        return (SubLObject)apps_shared.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/apps-shared.lisp", position = 2066L)
    public static SubLObject configure_app_colors() {
        set_app_colors();
        sort_app_color_name_map();
        return (SubLObject)apps_shared.NIL;
    }
    
    public static SubLObject declare_apps_shared_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.apps_shared", "set_app_colors", "SET-APP-COLORS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.apps_shared", "sort_app_color_name_map", "SORT-APP-COLOR-NAME-MAP", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.apps_shared", "configure_app_colors", "CONFIGURE-APP-COLORS", 0, 0, false);
        return (SubLObject)apps_shared.NIL;
    }
    
    public static SubLObject init_apps_shared_file() {
        apps_shared.$app_communication_mode_map$ = SubLFiles.defparameter("*APP-COMMUNICATION-MODE-MAP*", (SubLObject)apps_shared.$list0);
        apps_shared.$app_color_name_map$ = SubLFiles.defparameter("*APP-COLOR-NAME-MAP*", (SubLObject)apps_shared.$list1);
        apps_shared.$app_color_map$ = SubLFiles.defparameter("*APP-COLOR-MAP*", (SubLObject)apps_shared.$list2);
        return (SubLObject)apps_shared.NIL;
    }
    
    public static SubLObject setup_apps_shared_file() {
        return (SubLObject)apps_shared.NIL;
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
    
    static {
        me = (SubLFile)new apps_shared();
        apps_shared.$app_communication_mode_map$ = null;
        apps_shared.$app_color_name_map$ = null;
        apps_shared.$app_color_map$ = null;
        $list0 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("transmit and receive"), (SubLObject)SubLObjectFactory.makeKeyword("TRANSMIT-AND-RECEIVE")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("receive only"), (SubLObject)SubLObjectFactory.makeKeyword("RECEIVE-ONLY")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("deaf"), (SubLObject)SubLObjectFactory.makeKeyword("DEAF")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("dead"), (SubLObject)SubLObjectFactory.makeKeyword("DEAD")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("isolated"), (SubLObject)SubLObjectFactory.makeKeyword("ISOLATED")));
        $list1 = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("BLACK"), (SubLObject)SubLObjectFactory.makeString("black")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("BLUE"), (SubLObject)SubLObjectFactory.makeString("blue")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("GREEN"), (SubLObject)SubLObjectFactory.makeString("green")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("CYAN"), (SubLObject)SubLObjectFactory.makeString("cyan")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("RED"), (SubLObject)SubLObjectFactory.makeString("red")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("MAGENTA"), (SubLObject)SubLObjectFactory.makeString("magenta")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("YELLOW"), (SubLObject)SubLObjectFactory.makeString("yellow")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("WHITE"), (SubLObject)SubLObjectFactory.makeString("white")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("LIGHT-BLUE"), (SubLObject)SubLObjectFactory.makeString("light blue")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("LIGHT-RED"), (SubLObject)SubLObjectFactory.makeString("light red")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("LIGHT-YELLOW"), (SubLObject)SubLObjectFactory.makeString("light yellow")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("LIGHT-GRAY"), (SubLObject)SubLObjectFactory.makeString("light grey")), ConsesLow.cons((SubLObject)apps_shared.NIL, (SubLObject)SubLObjectFactory.makeString("default")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("PERIWINKLE"), (SubLObject)SubLObjectFactory.makeString("periwinkle")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SEA-GREEN"), (SubLObject)SubLObjectFactory.makeString("sea green")) });
        $list2 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("PERIWINKLE"), (SubLObject)SubLObjectFactory.makeString("CDCDFF")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SEA-GREEN"), (SubLObject)SubLObjectFactory.makeString("CDFFCD")));
        $sym3$STRING_LESSP = SubLObjectFactory.makeSymbol("STRING-LESSP");
        $sym4$CDR = SubLObjectFactory.makeSymbol("CDR");
    }
}

/*

	Total time: 95 ms
	
*/