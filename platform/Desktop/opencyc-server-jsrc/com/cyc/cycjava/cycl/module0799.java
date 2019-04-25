package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Tcp;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapper;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0799 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0799";
    public static final String myFingerPrint = "6862782f6ba599942a95e2e27e93d381d53036aa86cb9ccf14ce0342942d1354";
    private static SubLSymbol $g6374$;
    private static SubLSymbol $g6375$;
    private static final SubLSymbol $ic0$;
    private static final SubLString $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLList $ic7$;
    private static final SubLObject $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLString $ic14$;
    private static final SubLString $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLString $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLString $ic25$;
    
    public static SubLObject f51065(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4) {
        f51066();
        return (SubLObject)module0799.NIL;
    }
    
    public static SubLObject f51066() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        module0110.f7678();
        module0107.f7576((SubLObject)module0799.UNPROVIDED);
        if (module0799.NIL != module0018.f971()) {
            module0572.f35015();
            module0593.f36266();
        }
        if (module0799.NIL != module0018.f971()) {
            PrintLow.format((SubLObject)module0799.T, (SubLObject)module0799.$ic1$, module0110.$g1378$.getDynamicValue(var5));
            streams_high.force_output((SubLObject)module0799.UNPROVIDED);
            module0061.f4452((SubLObject)module0799.$ic2$, module0723.f44254());
            module0061.f4452((SubLObject)module0799.$ic3$, module0724.f44329());
            module0061.f4452((SubLObject)module0799.$ic4$, module0114.f7964());
            module0061.f4452((SubLObject)module0799.$ic5$, module0115.f7982());
            PrintLow.format((SubLObject)module0799.T, (SubLObject)module0799.$ic6$);
            streams_high.finish_output(StreamsLow.$standard_output$.getDynamicValue(var5));
            streams_high.finish_output(StreamsLow.$error_output$.getDynamicValue(var5));
            if (module0799.NIL != module0018.f971() && module0799.NIL != module0655.f39750()) {
                module0540.f33516((SubLObject)module0799.$ic7$, module0799.$ic8$, (SubLObject)module0799.UNPROVIDED);
                module0540.f33516((SubLObject)module0799.$ic9$, module0799.$ic8$, (SubLObject)module0799.UNPROVIDED);
            }
            if (module0799.NIL != f51067()) {
                module0112.$g1410$.setDynamicValue((SubLObject)module0799.T, var5);
            }
        }
        module0018.$g695$.setGlobalValue((SubLObject)module0799.T);
        return (SubLObject)module0799.T;
    }
    
    public static SubLObject f51068(final SubLObject var6, final SubLObject var7) {
        assert module0799.NIL != Types.stringp(var6) : var6;
        assert module0799.NIL != Types.stringp(var7) : var7;
        SubLObject var8 = (SubLObject)module0799.NIL;
        f51069(var6);
        var8 = f51070(var7, (SubLObject)module0799.T);
        return var8;
    }
    
    public static SubLObject f51071(final SubLObject var6, final SubLObject var7) {
        SubLObject var8 = (SubLObject)module0799.NIL;
        f51069(var6);
        f51072();
        var8 = f51070(var7, (SubLObject)module0799.T);
        if (var8 != module0799.T) {
            Errors.cerror((SubLObject)module0799.$ic14$, (SubLObject)module0799.$ic15$, var8);
        }
        return var8;
    }
    
    public static SubLObject f51073(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        f51069(var6);
        return module0029.f1574((SubLObject)module0799.$ic17$, StreamsLow.$standard_output$.getDynamicValue(var7), (SubLObject)module0799.$ic18$, (SubLObject)module0799.NIL, (SubLObject)module0799.$ic19$, (SubLObject)module0799.T, (SubLObject)module0799.T, (SubLObject)module0799.NIL, (SubLObject)module0799.$ic20$, (SubLObject)module0799.NIL, (SubLObject)module0799.NIL, (SubLObject)module0799.NIL, (SubLObject)module0799.UNPROVIDED, (SubLObject)module0799.UNPROVIDED);
    }
    
    public static SubLObject f51067() {
        return module0799.$g6375$.getGlobalValue();
    }
    
    public static SubLObject f51074() {
        module0799.$g6375$.setGlobalValue((SubLObject)module0799.T);
        return (SubLObject)module0799.NIL;
    }
    
    public static SubLObject f51072() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        module0027.f1437(StreamsLow.$standard_output$.getDynamicValue(var5), (SubLObject)module0799.$ic18$, (SubLObject)module0799.NIL, (SubLObject)module0799.T, (SubLObject)module0799.UNPROVIDED);
        module0127.f8418();
        return (SubLObject)module0799.NIL;
    }
    
    public static SubLObject f51069(final SubLObject var6) {
        assert module0799.NIL != Types.stringp(var6) : var6;
        Storage.gc_full();
        oc_dumper.load_kb(var6);
        module0110.f7677((SubLObject)module0799.$ic21$, (SubLObject)module0799.UNPROVIDED);
        return (SubLObject)module0799.NIL;
    }
    
    public static SubLObject f51070(final SubLObject var7, final SubLObject var9) {
        f51074();
        return Mapper.write_image(var7, var9);
    }
    
    public static SubLObject f51075(final SubLObject var10) {
        assert module0799.NIL != Types.booleanp(var10) : var10;
        Tcp.$tcp_localhost_onlyP$.setDynamicValue(var10);
        return (SubLObject)module0799.NIL;
    }
    
    public static SubLObject f51076(final SubLObject var10) {
        assert module0799.NIL != Types.booleanp(var10) : var10;
        if (module0799.NIL != var10) {
            Errors.warn((SubLObject)module0799.$ic25$);
        }
        else {
            module0110.$g41$.setDynamicValue(var10);
        }
        return (SubLObject)module0799.NIL;
    }
    
    public static SubLObject f51077() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0799", "f51065", "S#55670", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0799", "f51066", "S#55671", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0799", "f51068", "OPEN-CYC-BUILD-WORLD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0799", "f51071", "OPEN-CYC-BUILD-WORLD-VERIFY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0799", "f51073", "OPEN-CYC-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0799", "f51067", "S#55672", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0799", "f51074", "S#55673", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0799", "f51072", "S#55674", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0799", "f51069", "S#55675", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0799", "f51070", "S#55676", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0799", "f51075", "SET-TCP-LOCALHOST-ONLY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0799", "f51076", "SET-PERMIT-API-HOST-ACCESS", 1, 0, false);
        return (SubLObject)module0799.NIL;
    }
    
    public static SubLObject f51078() {
        module0799.$g6374$ = SubLFiles.deflexical("S#55677", (SubLObject)((module0799.NIL != Symbols.boundp((SubLObject)module0799.$ic0$)) ? module0799.$g6374$.getGlobalValue() : module0799.NIL));
        module0799.$g6375$ = SubLFiles.deflexical("S#55678", (SubLObject)((module0799.NIL != Symbols.boundp((SubLObject)module0799.$ic10$)) ? module0799.$g6375$.getGlobalValue() : module0799.NIL));
        return (SubLObject)module0799.NIL;
    }
    
    public static SubLObject f51079() {
        module0003.f57((SubLObject)module0799.$ic0$);
        module0003.f57((SubLObject)module0799.$ic10$);
        module0002.f38((SubLObject)module0799.$ic11$);
        module0002.f38((SubLObject)module0799.$ic13$);
        module0002.f38((SubLObject)module0799.$ic16$);
        module0002.f38((SubLObject)module0799.$ic22$);
        module0002.f38((SubLObject)module0799.$ic24$);
        return (SubLObject)module0799.NIL;
    }
    
    public void declareFunctions() {
        f51077();
    }
    
    public void initializeVariables() {
        f51078();
    }
    
    public void runTopLevelForms() {
        f51079();
    }
    
    static {
        me = (SubLFile)new module0799();
        module0799.$g6374$ = null;
        module0799.$g6375$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#55677", "CYC");
        $ic1$ = SubLObjectFactory.makeString("~&Enabling base TCP services to port ~S.~%~%");
        $ic2$ = SubLObjectFactory.makeKeyword("HTML");
        $ic3$ = SubLObjectFactory.makeKeyword("HTTP");
        $ic4$ = SubLObjectFactory.makeKeyword("CYC-API");
        $ic5$ = SubLObjectFactory.makeKeyword("CFASL");
        $ic6$ = SubLObjectFactory.makeString("~&Ready for services.~%");
        $ic7$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CycAdministrator")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("HumanCyclist")));
        $ic8$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CyclistDefinitionalMt"));
        $ic9$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("cyclistPrimaryProject")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CycAdministrator")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("OpenCycProject")));
        $ic10$ = SubLObjectFactory.makeSymbol("S#55678", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("OPEN-CYC-BUILD-WORLD");
        $ic12$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic13$ = SubLObjectFactory.makeSymbol("OPEN-CYC-BUILD-WORLD-VERIFY");
        $ic14$ = SubLObjectFactory.makeString("Continue and verify");
        $ic15$ = SubLObjectFactory.makeString("World build failed: ~A");
        $ic16$ = SubLObjectFactory.makeSymbol("OPEN-CYC-TEST");
        $ic17$ = SubLObjectFactory.makeString("CYC:TESTS;");
        $ic18$ = SubLObjectFactory.makeKeyword("TERSE");
        $ic19$ = SubLObjectFactory.makeKeyword("POST-BUILD");
        $ic20$ = SubLObjectFactory.makeKeyword("ALL");
        $ic21$ = SubLObjectFactory.makeKeyword("LISP");
        $ic22$ = SubLObjectFactory.makeSymbol("SET-TCP-LOCALHOST-ONLY");
        $ic23$ = SubLObjectFactory.makeSymbol("BOOLEANP");
        $ic24$ = SubLObjectFactory.makeSymbol("SET-PERMIT-API-HOST-ACCESS");
        $ic25$ = SubLObjectFactory.makeString("API host access has been disabled.  Restart this image to enable.");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0799.class
	Total time: 126 ms
	
	Decompiled with Procyon 0.5.32.
*/