package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0781 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0781";
    public static final String myFingerPrint = "cf9d04e744c398cbaca3f3b197dc403b7d1d2b3c3c2fab39e9549619c501e3ab";
    public static SubLSymbol $g6287$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLString $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLString $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLString $ic16$;
    
    public static SubLObject f50281(final SubLObject var1) {
        final SubLObject var2 = module0577.f35456(var1);
        final SubLObject var3 = module0577.f35443(var2);
        final SubLObject var4 = var3.isList() ? var3.first() : var3;
        module0642.f39019((SubLObject)$ic3$);
        module0656.f39804(var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)T;
    }
    
    public static SubLObject f50282(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        final SubLObject var7 = var5.first();
        final SubLObject var8 = module0577.f35456(var7);
        final SubLObject var9 = module0577.f35443(var8);
        final SubLObject var10 = var9.isList() ? var9.first() : var9;
        final SubLObject var11 = (SubLObject)(var9.isList() ? conses_high.second(var9) : NIL);
        SubLObject var12 = (SubLObject)NIL;
        module0778.f50230((SubLObject)UNPROVIDED);
        final SubLObject var13 = module0778.$g6268$.currentBinding(var6);
        try {
            module0778.$g6268$.bind(module0778.f50204(module0778.$g6268$.getDynamicValue(var6)), var6);
            module0778.f50174(module0778.$g6268$.getDynamicValue(var6), module0777.f50123(var10));
            module0778.f50175(module0778.$g6268$.getDynamicValue(var6), var11);
            module0778.f50191(module0778.$g6268$.getDynamicValue(var6), var8);
            var12 = module0779.f50237((SubLObject)UNPROVIDED);
        }
        finally {
            module0778.$g6268$.rebind(var13, var6);
        }
        return var12;
    }
    
    public static SubLObject f50283(final SubLObject var5) {
        return module0779.f50244(var5);
    }
    
    public static SubLObject f50284() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50285(final SubLObject var11, SubLObject var12, SubLObject var13) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)NIL;
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        if (NIL == var12) {
            var12 = (SubLObject)$ic6$;
        }
        final SubLObject var15 = module0656.f39832((SubLObject)$ic7$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var14), (SubLObject)$ic8$, module0656.f39842(var11));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var15) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var15);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var16 = module0015.$g533$.currentBinding(var14);
        try {
            module0015.$g533$.bind((SubLObject)T, var14);
            module0642.f39019(var12);
        }
        finally {
            module0015.$g533$.rebind(var16, var14);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        if (NIL != var13) {}
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50286(final SubLObject var11, SubLObject var12) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        final SubLThread var13 = SubLProcess.currentSubLThread();
        if (NIL == var12) {
            var12 = (SubLObject)$ic6$;
        }
        final SubLObject var14 = module0656.f39832((SubLObject)$ic7$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var13), (SubLObject)$ic11$, module0656.f39842(var11));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var14) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var14);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var15 = module0015.$g533$.currentBinding(var13);
        try {
            module0015.$g533$.bind((SubLObject)T, var13);
            module0642.f39019(var12);
        }
        finally {
            module0015.$g533$.rebind(var15, var13);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50287(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)NIL;
        return f50288(var5, var6);
    }
    
    public static SubLObject f50289(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        return f50288(var5, (SubLObject)T);
    }
    
    public static SubLObject f50288(SubLObject var5, SubLObject var15) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        if (var15 == UNPROVIDED) {
            var15 = $g6287$.getDynamicValue();
        }
        final SubLThread var16 = SubLProcess.currentSubLThread();
        final SubLObject var17 = var5.first();
        final SubLObject var18 = module0656.f39943(var17, (SubLObject)UNPROVIDED);
        final SubLObject var19 = (SubLObject)((NIL != var18) ? module0777.f50040(var18, (SubLObject)UNPROVIDED) : $ic16$);
        SubLObject var20 = (SubLObject)NIL;
        module0778.f50230((SubLObject)UNPROVIDED);
        final SubLObject var21 = module0778.$g6268$.currentBinding(var16);
        try {
            module0778.$g6268$.bind(module0778.f50204(module0778.$g6268$.getDynamicValue(var16)), var16);
            module0778.f50174(module0778.$g6268$.getDynamicValue(var16), module0777.f50123(var18));
            module0778.f50175(module0778.$g6268$.getDynamicValue(var16), var19);
            var20 = ((NIL != var15) ? f50284() : module0779.f50237((SubLObject)UNPROVIDED));
        }
        finally {
            module0778.$g6268$.rebind(var21, var16);
        }
        return var20;
    }
    
    public static SubLObject f50290() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0781", "f50281", "S#54849", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0781", "f50282", "DISPLAY-LEX-TODO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0781", "f50283", "HANDLE-LEX-TODO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0781", "f50284", "S#54850", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0781", "f50285", "S#54851", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0781", "f50286", "S#54852", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0781", "f50287", "LEXIFY-TERM-WITH-ID", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0781", "f50289", "SME-LEXIFY-TERM-WITH-ID", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0781", "f50288", "S#54853", 0, 2, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50291() {
        $g6287$ = SubLFiles.defvar("S#54854", (SubLObject)T);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f50292() {
        module0012.f441((SubLObject)$ic0$);
        module0012.f444((SubLObject)$ic0$);
        final SubLObject var17 = module0577.f35431((SubLObject)$ic1$);
        module0577.f35427(var17, (SubLObject)$ic2$);
        Hashtables.sethash(module0577.f35423(var17), module0577.$g4225$.getDynamicValue(), var17);
        module0015.f873((SubLObject)$ic4$);
        module0015.f873((SubLObject)$ic5$);
        module0656.f39840((SubLObject)$ic9$, (SubLObject)$ic10$, (SubLObject)THREE_INTEGER);
        module0656.f39840((SubLObject)$ic12$, (SubLObject)$ic13$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic14$);
        module0015.f873((SubLObject)$ic15$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f50290();
    }
    
    public void initializeVariables() {
        f50291();
    }
    
    public void runTopLevelForms() {
        f50292();
    }
    
    static {
        me = (SubLFile)new module0781();
        $g6287$ = null;
        $ic0$ = makeSymbol("S#54854", "CYC");
        $ic1$ = ConsesLow.list((SubLObject)makeKeyword("SUMMARY-FN"), (SubLObject)makeSymbol("S#54849", "CYC"), (SubLObject)makeKeyword("DISPLAY-FN"), (SubLObject)makeSymbol("DISPLAY-LEX-TODO"), (SubLObject)makeKeyword("HANDLER-FN"), (SubLObject)makeSymbol("HANDLE-LEX-TODO"));
        $ic2$ = makeKeyword("LEXIFICATION-NEEDED");
        $ic3$ = makeString("Perform lexification for ");
        $ic4$ = makeSymbol("DISPLAY-LEX-TODO");
        $ic5$ = makeSymbol("HANDLE-LEX-TODO");
        $ic6$ = makeString("[Lexify]");
        $ic7$ = makeKeyword("MAIN");
        $ic8$ = makeString("lexify-term-with-id&~A");
        $ic9$ = makeKeyword("LEXIFY-TERM");
        $ic10$ = makeSymbol("S#54851", "CYC");
        $ic11$ = makeString("sme-lexify-term-with-id&~A");
        $ic12$ = makeKeyword("SME-LEXIFY-TERM");
        $ic13$ = makeSymbol("S#54852", "CYC");
        $ic14$ = makeSymbol("LEXIFY-TERM-WITH-ID");
        $ic15$ = makeSymbol("SME-LEXIFY-TERM-WITH-ID");
        $ic16$ = makeString("");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 97 ms
	
	Decompiled with Procyon 0.5.32.
*/