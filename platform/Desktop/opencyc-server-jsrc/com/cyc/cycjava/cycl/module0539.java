package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0539 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0539";
    public static final String myFingerPrint = "5e63efaf0c4abecba62228f463ba077a2e4985a20a041af661f568e9b8b4de47";
    public static SubLSymbol $g3935$;
    public static SubLSymbol $g3936$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    
    public static SubLObject f33488(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic2$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic4$, var5)), ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f33489(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic5$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        final SubLObject var7 = (SubLObject)$ic6$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, var5), (SubLObject)ConsesLow.list((SubLObject)$ic7$, (SubLObject)ConsesLow.list((SubLObject)$ic8$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic9$, (SubLObject)ConsesLow.list((SubLObject)$ic10$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic11$, (SubLObject)ConsesLow.list((SubLObject)$ic12$, var7)), (SubLObject)ConsesLow.list((SubLObject)$ic13$, (SubLObject)ConsesLow.list((SubLObject)$ic14$, var7))), (SubLObject)ConsesLow.listS((SubLObject)$ic1$, (SubLObject)$ic15$, ConsesLow.append(var6, (SubLObject)NIL)));
    }
    
    public static SubLObject f33490(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic2$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        if (NIL != var5) {
            return (SubLObject)ConsesLow.listS((SubLObject)$ic1$, var5, ConsesLow.append(var6, (SubLObject)NIL));
        }
        return reader.bq_cons((SubLObject)$ic16$, ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f33491(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic3$, (SubLObject)$ic17$, ConsesLow.append(var5, (SubLObject)NIL));
    }
    
    public static SubLObject f33492() {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        return $g3936$.getDynamicValue(var15);
    }
    
    public static SubLObject f33493() {
        return (SubLObject)makeBoolean(NIL != $g3935$.getGlobalValue() && NIL != f33492());
    }
    
    public static SubLObject f33494(SubLObject var16, SubLObject var17, SubLObject var18, SubLObject var19) {
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        SubLObject var20 = (SubLObject)NIL;
        if (NIL != var19) {
            var20 = ConsesLow.nconc((SubLObject)ConsesLow.list((SubLObject)$ic19$, var19), var20);
        }
        if (NIL != var18) {
            var20 = ConsesLow.nconc((SubLObject)ConsesLow.list((SubLObject)$ic20$, var18), var20);
        }
        if (NIL != var17) {
            var20 = ConsesLow.nconc((SubLObject)ConsesLow.list((SubLObject)$ic21$, var17), var20);
        }
        if (NIL != var16) {
            var20 = ConsesLow.nconc((SubLObject)ConsesLow.list((SubLObject)$ic22$, var16), var20);
        }
        return var20;
    }
    
    public static SubLObject f33495(final SubLObject var9) {
        assert NIL != assertion_handles_oc.f11035(var9) : var9;
        final SubLObject var10 = module0178.f11295(var9);
        final SubLObject var11 = module0178.f11296(var9);
        final SubLObject var12 = module0178.f11297(var9);
        final SubLObject var13 = module0178.f11298(var9);
        return f33494(var10, var11, var12, var13);
    }
    
    public static SubLObject f33496(final SubLObject var21) {
        return conses_high.getf(f33492(), var21, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f33497(final SubLObject var22) {
        if (NIL != f33493()) {
            final SubLObject var23 = f33496((SubLObject)$ic22$);
            final SubLObject var24 = f33496((SubLObject)$ic21$);
            final SubLObject var25 = f33496((SubLObject)$ic20$);
            final SubLObject var26 = f33496((SubLObject)$ic19$);
            return module0538.f33447(var23, var24, var25, var26);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33498(final SubLObject var9) {
        if (NIL != f33493()) {
            final SubLObject var10 = f33496((SubLObject)$ic22$);
            final SubLObject var11 = f33496((SubLObject)$ic21$);
            final SubLObject var12 = f33496((SubLObject)$ic20$);
            final SubLObject var13 = f33496((SubLObject)$ic19$);
            return module0538.f33371(var10, var11, var12, var13);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33499() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0539", "f33488", "WITH-BOOKKEEPING-INFO");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0539", "f33489", "S#36895");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0539", "f33490", "S#36896");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0539", "f33491", "S#36897");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0539", "f33492", "S#36898", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0539", "f33493", "S#36899", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0539", "f33494", "NEW-BOOKKEEPING-INFO", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0539", "f33495", "S#36900", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0539", "f33496", "S#36901", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0539", "f33497", "S#36902", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0539", "f33498", "S#36903", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33500() {
        $g3935$ = SubLFiles.deflexical("S#36904", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic0$)) ? $g3935$.getGlobalValue() : T));
        $g3936$ = SubLFiles.defparameter("S#9974", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f33501() {
        module0003.f57((SubLObject)$ic0$);
        module0002.f38((SubLObject)$ic1$);
        module0002.f38((SubLObject)$ic18$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f33499();
    }
    
    public void initializeVariables() {
        f33500();
    }
    
    public void runTopLevelForms() {
        f33501();
    }
    
    static {
        me = (SubLFile)new module0539();
        $g3935$ = null;
        $g3936$ = null;
        $ic0$ = makeSymbol("S#36904", "CYC");
        $ic1$ = makeSymbol("WITH-BOOKKEEPING-INFO");
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("S#36905", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic3$ = makeSymbol("CLET");
        $ic4$ = makeSymbol("S#9974", "CYC");
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("ASSERTION", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic6$ = makeUninternedSymbol("US#7D717B6");
        $ic7$ = makeSymbol("*THE-CYCLIST*");
        $ic8$ = makeSymbol("ASSERTED-BY");
        $ic9$ = makeSymbol("S#36874", "CYC");
        $ic10$ = makeSymbol("ASSERTED-WHEN");
        $ic11$ = makeSymbol("*KE-PURPOSE*");
        $ic12$ = makeSymbol("ASSERTED-WHY");
        $ic13$ = makeSymbol("S#36875", "CYC");
        $ic14$ = makeSymbol("ASSERTED-SECOND");
        $ic15$ = ConsesLow.list((SubLObject)makeSymbol("NEW-BOOKKEEPING-INFO"), (SubLObject)makeSymbol("*THE-CYCLIST*"), (SubLObject)makeSymbol("S#36874", "CYC"), (SubLObject)makeSymbol("*KE-PURPOSE*"), (SubLObject)makeSymbol("S#36875", "CYC"));
        $ic16$ = makeSymbol("PROGN");
        $ic17$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#9974", "CYC"), (SubLObject)NIL));
        $ic18$ = makeSymbol("NEW-BOOKKEEPING-INFO");
        $ic19$ = makeKeyword("SECOND");
        $ic20$ = makeKeyword("PURPOSE");
        $ic21$ = makeKeyword("WHEN");
        $ic22$ = makeKeyword("WHO");
        $ic23$ = makeSymbol("ASSERTION-P");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 64 ms
	
	Decompiled with Procyon 0.5.32.
*/