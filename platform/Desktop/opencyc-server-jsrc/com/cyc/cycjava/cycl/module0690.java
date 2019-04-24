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

public final class module0690 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0690";
    public static final String myFingerPrint = "719ff03c3dcd41574f828c0dcde3222876582e0a619aee2078e65df8abddd59f";
    public static SubLSymbol $g5439$;
    public static SubLSymbol $g5440$;
    public static SubLSymbol $g5441$;
    public static SubLSymbol $g5442$;
    public static SubLSymbol $g5443$;
    private static final SubLString $ic0$;
    private static final SubLString $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLString $ic4$;
    private static final SubLString $ic5$;
    
    public static SubLObject f42261(final SubLObject var1, final SubLObject var2, final SubLObject var3, SubLObject var4, SubLObject var5, SubLObject var6, SubLObject var7) {
        if (var4 == module0690.UNPROVIDED) {
            var4 = (SubLObject)module0690.NIL;
        }
        if (var5 == module0690.UNPROVIDED) {
            var5 = (SubLObject)module0690.$ic5$;
        }
        if (var6 == module0690.UNPROVIDED) {
            var6 = module0689.f42250();
        }
        if (var7 == module0690.UNPROVIDED) {
            var7 = module0689.f42251();
        }
        final SubLThread var8 = SubLProcess.currentSubLThread();
        PrintLow.format(module0015.$g131$.getDynamicValue(var8), module0690.$g5442$.getGlobalValue(), new SubLObject[] { module0690.$g5441$.getGlobalValue(), module0690.$g5440$.getGlobalValue(), module0690.$g5439$.getGlobalValue(), PrintLow.write_to_string(var2, module0690.EMPTY_SUBL_OBJECT_ARRAY), var3, var4, var6, var7, var5 });
        module0642.f39020(module0690.$g5443$.getGlobalValue());
        return (SubLObject)module0690.NIL;
    }
    
    public static SubLObject f42262() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0690", "f42261", "S#46266", 3, 4, false);
        return (SubLObject)module0690.NIL;
    }
    
    public static SubLObject f42263() {
        module0690.$g5439$ = SubLFiles.deflexical("S#46267", (SubLObject)module0690.$ic0$);
        module0690.$g5440$ = SubLFiles.deflexical("S#46268", (SubLObject)module0690.$ic1$);
        module0690.$g5441$ = SubLFiles.deflexical("S#46269", (SubLObject)module0690.$ic2$);
        module0690.$g5442$ = SubLFiles.deflexical("S#46270", (SubLObject)module0690.$ic3$);
        module0690.$g5443$ = SubLFiles.deflexical("S#46271", (SubLObject)module0690.$ic4$);
        return (SubLObject)module0690.NIL;
    }
    
    public static SubLObject f42264() {
        return (SubLObject)module0690.NIL;
    }
    
    public void declareFunctions() {
        f42262();
    }
    
    public void initializeVariables() {
        f42263();
    }
    
    public void runTopLevelForms() {
        f42264();
    }
    
    static {
        me = (SubLFile)new module0690();
        module0690.$g5439$ = null;
        module0690.$g5440$ = null;
        module0690.$g5441$ = null;
        module0690.$g5442$ = null;
        module0690.$g5443$ = null;
        $ic0$ = SubLObjectFactory.makeString("Refresher.jar , lib/OpenCyc.jar , lib/jakarta-oro-2.0.3.jar");
        $ic1$ = SubLObjectFactory.makeString("/java/refresher");
        $ic2$ = SubLObjectFactory.makeString("com.cyc.common.applet.refresher.RefresherApplet");
        $ic3$ = SubLObjectFactory.makeString("<script LANGUAGE=\"JavaScript\"> <!--\nfunction callRefresherApplet() {          \ndocument.write('<applet code=~S codebase=~S archive=~S height=\"1\" width=\"1\">') \ndocument.write('<param name=\"refresh_url\" value=\"' + document.URL + '\">')                                             \ndocument.write('<param name=\"refresh_function\" value=~S>')                                                           \ndocument.write('<param name=\"polling_msecs\" value=\"~S\">')                                                           \ndocument.write('<param name=\"extra_data\" value=~S>')                                                              \ndocument.write('<param name=\"host_name\" value=~S>')                                                     \ndocument.write('<param name=\"port\" value=~S>')\ndocument.write('<param name=\"target\" value=~S')                                                                    \ndocument.write('<applet>')                                                                                            \n}                                                                                                                     \n// -->                                                                                                                \n</script> \n");
        $ic4$ = SubLObjectFactory.makeString("<script LANGUAGE=\"JavaScript\"> \n<!-- \ncallRefresherApplet() \n// --> \n</script>");
        $ic5$ = SubLObjectFactory.makeString("_self");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0690.class
	Total time: 30 ms
	
	Decompiled with Procyon 0.5.32.
*/