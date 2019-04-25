package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0578 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0578";
    public static final String myFingerPrint = "a9b511520e488f7acfa1d20a1c90d2f72d31dcbe4d26347c498a2d614af95443";
    private static SubLSymbol $g4230$;
    public static SubLSymbol $g4231$;
    public static SubLSymbol $g4232$;
    public static SubLSymbol $g4233$;
    public static SubLSymbol $g4234$;
    public static SubLSymbol $g4235$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLList $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLString $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLString $ic27$;
    private static final SubLList $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLString $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLString $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    
    public static SubLObject f35466(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (NIL != var1) {
            f35467(var1);
        }
        else {
            f35468();
        }
        return $g4231$.getDynamicValue(var2);
    }
    
    public static SubLObject f35469() {
        return f35467($g4230$.getGlobalValue());
    }
    
    public static SubLObject f35467(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (!var1.isInteger()) {
            return $g4231$.getDynamicValue(var2);
        }
        if (var1.numL($g4230$.getGlobalValue())) {
            $g4231$.setDynamicValue($g4230$.getGlobalValue(), var2);
        }
        else {
            $g4231$.setDynamicValue(var1, var2);
        }
        return $g4231$.getDynamicValue(var2);
    }
    
    public static SubLObject f35468() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        $g4231$.setDynamicValue(Numbers.add($g4231$.getDynamicValue(var2), (SubLObject)ONE_INTEGER), var2);
        return $g4231$.getDynamicValue(var2);
    }
    
    public static SubLObject f35470(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = (SubLObject)(module0579.f35487().isPositive() ? module0048.f_1_(module0579.f35487()) : ZERO_INTEGER);
        final SubLObject var4 = Numbers.subtract($g4231$.getDynamicValue(var2), var3);
        final SubLObject var5 = Numbers.numGE(var4, var1);
        return var5;
    }
    
    public static SubLObject f35471(final SubLObject var6, final SubLObject var7) {
        SubLObject var9;
        final SubLObject var8 = var9 = var6.rest();
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic2$);
        var10 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic2$);
        var11 = var9.first();
        final SubLObject var12;
        var9 = (var12 = var9.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic0$, var10), (SubLObject)ConsesLow.listS((SubLObject)$ic4$, (SubLObject)T, var11, ConsesLow.append(var12, (SubLObject)NIL)));
    }
    
    public static SubLObject f35472() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return module0035.sublisp_boolean($g4232$.getDynamicValue(var2));
    }
    
    public static SubLObject f35473() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return $g4233$.getDynamicValue(var2);
    }
    
    public static SubLObject f35474(final SubLObject var6, final SubLObject var7) {
        SubLObject var9;
        final SubLObject var8 = var9 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic5$);
        final SubLObject var10 = var9.rest();
        var9 = var9.first();
        SubLObject var11 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic5$);
        var11 = var9.first();
        var9 = var9.rest();
        if (NIL == var9) {
            final SubLObject var12;
            var9 = (var12 = var10);
            return (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)$ic7$, (SubLObject)ConsesLow.list((SubLObject)$ic8$, (SubLObject)$ic9$, reader.bq_cons((SubLObject)$ic10$, ConsesLow.append(var12, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic10$, (SubLObject)ConsesLow.listS((SubLObject)$ic11$, (SubLObject)ConsesLow.list(var11), ConsesLow.append(var12, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic12$, var11), (SubLObject)ConsesLow.list((SubLObject)$ic13$, (SubLObject)$ic14$, (SubLObject)ConsesLow.listS((SubLObject)$ic15$, (SubLObject)ConsesLow.listS((SubLObject)$ic16$, (SubLObject)ConsesLow.list((SubLObject)$ic17$, var11), (SubLObject)$ic18$), (SubLObject)$ic19$))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)$ic5$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35475(final SubLObject var6, final SubLObject var7) {
        SubLObject var9;
        final SubLObject var8 = var9 = var6.rest();
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic2$);
        var10 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic2$);
        var11 = var9.first();
        final SubLObject var12;
        var9 = (var12 = var9.rest());
        final SubLObject var13 = (SubLObject)$ic20$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var13, (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)$ic22$, var10, var11))), (SubLObject)ConsesLow.list((SubLObject)$ic23$, var13, reader.bq_cons((SubLObject)$ic24$, ConsesLow.append(var12, (SubLObject)NIL))));
    }
    
    public static SubLObject f35476(final SubLObject var20, final SubLObject var11) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        if (NIL != $g4234$.getDynamicValue(var21)) {
            Functions.apply((SubLObject)$ic26$, (SubLObject)ConsesLow.listS((SubLObject)$ic27$, var20, var11));
        }
        else if (NIL == f35477()) {
            Functions.apply((SubLObject)$ic15$, reader.bq_cons(var20, var11));
        }
        return $g4234$.getDynamicValue(var21);
    }
    
    public static SubLObject f35477() {
        return (SubLObject)T;
    }
    
    public static SubLObject f35478(final SubLObject var6, final SubLObject var7) {
        SubLObject var9;
        final SubLObject var8 = var9 = var6.rest();
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic2$);
        var10 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic2$);
        var11 = var9.first();
        final SubLObject var12;
        var9 = (var12 = var9.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic0$, var10), (SubLObject)ConsesLow.list((SubLObject)$ic13$, (SubLObject)$ic14$, (SubLObject)ConsesLow.listS((SubLObject)$ic15$, var11, ConsesLow.append(var12, (SubLObject)NIL))));
    }
    
    public static SubLObject f35479(final SubLObject var6, final SubLObject var7) {
        SubLObject var9;
        final SubLObject var8 = var9 = var6.rest();
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic28$);
        var10 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic28$);
        var11 = var9.first();
        var9 = var9.rest();
        if (NIL == var9) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic29$, (SubLObject)ConsesLow.list((SubLObject)$ic30$, (SubLObject)ConsesLow.list((SubLObject)$ic13$, (SubLObject)ConsesLow.list((SubLObject)$ic31$, (SubLObject)$ic32$, (SubLObject)ConsesLow.list(var11, var10)), (SubLObject)ConsesLow.list((SubLObject)$ic25$, (SubLObject)ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)$ic33$, var10, (SubLObject)ConsesLow.list((SubLObject)$ic34$, var11))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)$ic28$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35480(final SubLObject var6, final SubLObject var7) {
        SubLObject var9;
        final SubLObject var8 = var9 = var6.rest();
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic28$);
        var10 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic28$);
        var11 = var9.first();
        var9 = var9.rest();
        if (NIL == var9) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic29$, (SubLObject)ConsesLow.list((SubLObject)$ic30$, (SubLObject)ConsesLow.list((SubLObject)$ic13$, (SubLObject)ConsesLow.list((SubLObject)$ic31$, (SubLObject)$ic32$, (SubLObject)ConsesLow.list((SubLObject)$ic35$, (SubLObject)ConsesLow.list((SubLObject)$ic34$, var11), var10)), (SubLObject)ConsesLow.list((SubLObject)$ic25$, (SubLObject)ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)$ic21$, (SubLObject)$ic36$, var10, (SubLObject)ConsesLow.list((SubLObject)$ic34$, var11))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)$ic28$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35481(final SubLObject var6, final SubLObject var7) {
        SubLObject var9;
        final SubLObject var8 = var9 = var6.rest();
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic28$);
        var10 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic28$);
        var11 = var9.first();
        var9 = var9.rest();
        if (NIL == var9) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic29$, (SubLObject)ConsesLow.list((SubLObject)$ic30$, (SubLObject)ConsesLow.list((SubLObject)$ic13$, (SubLObject)ConsesLow.list((SubLObject)$ic37$, var10), (SubLObject)ConsesLow.list((SubLObject)$ic38$, var10, var11))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)$ic28$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35482() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0578", "f35466", "S#38903", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0578", "f35469", "S#38904", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0578", "f35467", "S#38905", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0578", "f35468", "S#38906", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0578", "f35470", "S#38907", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0578", "f35471", "S#38908");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0578", "f35472", "S#38909", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0578", "f35473", "S#38910", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0578", "f35474", "S#38911");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0578", "f35475", "S#38912");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0578", "f35476", "S#38913", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0578", "f35477", "S#38914", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0578", "f35478", "S#38915");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0578", "f35479", "S#38916");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0578", "f35480", "S#38917");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0578", "f35481", "S#38918");
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35483() {
        $g4230$ = SubLFiles.defconstant("S#38919", (SubLObject)ZERO_INTEGER);
        $g4231$ = SubLFiles.defparameter("S#38920", $g4230$.getGlobalValue());
        $g4232$ = SubLFiles.defparameter("S#38921", (SubLObject)T);
        $g4233$ = SubLFiles.defparameter("S#38922", (SubLObject)NIL);
        $g4234$ = SubLFiles.defparameter("S#38923", (SubLObject)NIL);
        $g4235$ = SubLFiles.defparameter("S#38924", (SubLObject)T);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35484() {
        module0002.f50((SubLObject)$ic0$, (SubLObject)$ic1$);
        module0002.f50((SubLObject)$ic23$, (SubLObject)$ic25$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f35482();
    }
    
    public void initializeVariables() {
        f35483();
    }
    
    public void runTopLevelForms() {
        f35484();
    }
    
    static {
        me = (SubLFile)new module0578();
        $g4230$ = null;
        $g4231$ = null;
        $g4232$ = null;
        $g4233$ = null;
        $g4234$ = null;
        $g4235$ = null;
        $ic0$ = makeSymbol("S#38907", "CYC");
        $ic1$ = ConsesLow.list((SubLObject)makeSymbol("S#38908", "CYC"), (SubLObject)makeSymbol("S#38915", "CYC"), (SubLObject)makeSymbol("S#38912", "CYC"));
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("S#696", "CYC"), (SubLObject)makeSymbol("S#38925", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#105", "CYC"));
        $ic3$ = makeSymbol("PWHEN");
        $ic4$ = makeSymbol("FORMAT");
        $ic5$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#5851", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic6$ = makeSymbol("CLET");
        $ic7$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("*CONTINUE-CERROR?*"), (SubLObject)NIL), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#38923", "CYC"), (SubLObject)T));
        $ic8$ = makeSymbol("PIF");
        $ic9$ = ConsesLow.list((SubLObject)makeSymbol("S#38910", "CYC"));
        $ic10$ = makeSymbol("PROGN");
        $ic11$ = makeSymbol("CATCH-ERROR-MESSAGE");
        $ic12$ = makeSymbol("STRINGP");
        $ic13$ = makeSymbol("PUNLESS");
        $ic14$ = ConsesLow.list((SubLObject)makeSymbol("S#38914", "CYC"));
        $ic15$ = makeSymbol("WARN");
        $ic16$ = makeSymbol("CCONCATENATE");
        $ic17$ = makeSymbol("S#38926", "CYC");
        $ic18$ = ConsesLow.list((SubLObject)makeString("~% Top-level CycL: ~S"));
        $ic19$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#38927", "CYC")));
        $ic20$ = makeUninternedSymbol("US#2B7F546");
        $ic21$ = makeSymbol("S#176", "CYC");
        $ic22$ = makeString("(PPH error level ~S) ~a");
        $ic23$ = makeSymbol("S#38913", "CYC");
        $ic24$ = makeSymbol("LIST");
        $ic25$ = makeSymbol("S#38912", "CYC");
        $ic26$ = makeSymbol("CERROR");
        $ic27$ = makeString("continue anyway");
        $ic28$ = ConsesLow.list((SubLObject)makeSymbol("OBJECT", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"));
        $ic29$ = makeSymbol("PCASE-FEATURE");
        $ic30$ = makeKeyword("CYC-MAINT");
        $ic31$ = makeSymbol("COR");
        $ic32$ = makeSymbol("S#38924", "CYC");
        $ic33$ = makeString("~S is not a ~S");
        $ic34$ = makeSymbol("QUOTE");
        $ic35$ = makeSymbol("S#3789", "CYC");
        $ic36$ = makeString("~S is not a list of ~S");
        $ic37$ = makeSymbol("NULL");
        $ic38$ = makeSymbol("S#38916", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 82 ms
	
	Decompiled with Procyon 0.5.32.
*/