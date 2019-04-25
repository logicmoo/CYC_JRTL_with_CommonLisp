package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0346 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0346";
    public static final String myFingerPrint = "45ce3e5ee15c0176e3d4e466d0e278936d00931291b11a07beb478b532741f65";
    public static SubLSymbol $g2964$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLString $ic16$;
    private static final SubLString $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    
    public static SubLObject f23311(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)$ic0$;
        }
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)$ic1$);
        var3 = var1.first();
        final SubLObject var5 = var4 = var1.rest();
        SubLObject var6 = module0191.f11980(var3);
        SubLObject var7 = var4;
        SubLObject var8 = (SubLObject)NIL;
        var8 = var7.first();
        while (NIL != var7) {
            var6 = f23312(var6, module0191.f11980(var8));
            var7 = var7.rest();
            var8 = var7.first();
        }
        return module0130.f8529(var2, var6);
    }
    
    public static SubLObject f23313(final SubLObject var10) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        assert NIL != deduction_handles_oc.f11659(var10) : var10;
        final SubLObject var12 = module0188.f11770(var10);
        final SubLObject var13 = module0191.f11926(var10);
        final SubLObject var14 = f23311(var12, module0191.f11924(var10));
        if (!var13.eql(var14)) {
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var11) && !module0130.f8524(var13).eql(module0130.f8524(var14))) {
                Errors.error((SubLObject)$ic3$, module0130.f8524(var13), module0130.f8524(var14));
            }
            module0185.f11688(var10, module0130.f8523(var14));
        }
        return var14;
    }
    
    public static SubLObject f23314(final SubLObject var14) {
        assert NIL != assertion_handles_oc.f11035(var14) : var14;
        final SubLObject var15 = module0178.f11299(var14);
        final SubLObject var16 = module0178.f11302(var14);
        final SubLObject var17 = f23315(var15);
        if (!var16.eql(var17)) {
            assertions_interface_oc.f11078(var14, module0130.f8524(var17));
            assertions_interface_oc.f11079(var14, module0130.f8523(var17));
            module0248.f15964(var14, var16);
        }
        return var17;
    }
    
    public static SubLObject f23312(final SubLObject var16, final SubLObject var17) {
        if (var16 == $ic5$ || var17 == $ic5$) {
            return (SubLObject)$ic5$;
        }
        if (var16 == $ic6$ || var17 == $ic6$) {
            return (SubLObject)$ic6$;
        }
        return (SubLObject)$ic7$;
    }
    
    public static SubLObject f23315(final SubLObject var15) {
        assert NIL != module0035.f2015(var15) : var15;
        SubLObject var16 = var15;
        SubLObject var17 = (SubLObject)NIL;
        var17 = var16.first();
        while (NIL != var16) {
            assert NIL != module0191.f11910(var17) : var17;
            var16 = var16.rest();
            var17 = var16.first();
        }
        if (NIL == var15) {
            return (SubLObject)$ic5$;
        }
        if (Sequences.length(var15).numE((SubLObject)ONE_INTEGER)) {
            return module0191.f11926(var15.first());
        }
        final SubLObject var18 = module0191.f11926(var15.first());
        SubLObject var19 = (SubLObject)NIL;
        if (NIL == var19) {
            SubLObject var20;
            SubLObject var21;
            for (var20 = var15.rest(), var21 = (SubLObject)NIL, var21 = var20.first(); NIL == var19 && NIL != var20; var19 = (SubLObject)makeBoolean(!var18.eql(module0191.f11926(var21))), var20 = var20.rest(), var21 = var20.first()) {}
        }
        if (NIL == var19) {
            return var18;
        }
        if (NIL != module0004.f104((SubLObject)$ic10$, var15, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic11$)) && NIL != conses_high.member((SubLObject)$ic12$, var15, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic11$))) {
            return f23316(var15);
        }
        if (NIL != module0004.f104((SubLObject)$ic10$, var15, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic11$))) {
            return (SubLObject)$ic10$;
        }
        if (NIL != module0004.f104((SubLObject)$ic12$, var15, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic11$))) {
            return (SubLObject)$ic12$;
        }
        final SubLObject var22 = Sequences.find_if(Symbols.symbol_function((SubLObject)$ic13$), var15, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != var22) {
            return module0191.f11926(var22);
        }
        if (NIL != module0004.f104((SubLObject)$ic14$, var15, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic11$)) && NIL != conses_high.member((SubLObject)$ic15$, var15, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic11$))) {
            return f23317(var15);
        }
        if (NIL != module0004.f104((SubLObject)$ic14$, var15, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic11$))) {
            return (SubLObject)$ic14$;
        }
        if (NIL != module0004.f104((SubLObject)$ic15$, var15, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic11$))) {
            return (SubLObject)$ic15$;
        }
        return (SubLObject)$ic5$;
    }
    
    public static SubLObject f23317(final SubLObject var15) {
        return (SubLObject)$ic5$;
    }
    
    public static SubLObject f23316(final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        if (NIL == $g2964$.getDynamicValue(var16)) {
            Errors.cerror((SubLObject)$ic16$, (SubLObject)$ic17$, var15);
        }
        return (SubLObject)$ic5$;
    }
    
    public static SubLObject f23318(final SubLObject var25) {
        return (SubLObject)makeBoolean(NIL != module0035.f2014(var25) && NIL != module0035.f1995(var25, (SubLObject)FOUR_INTEGER, (SubLObject)UNPROVIDED) && NIL != module0035.sublisp_boolean(conses_high.getf(var25, (SubLObject)$ic18$, (SubLObject)NIL)) && NIL != module0035.sublisp_boolean(conses_high.getf(var25, (SubLObject)$ic19$, (SubLObject)NIL)));
    }
    
    public static SubLObject f23319(final SubLObject var26) {
        return conses_high.getf(var26, (SubLObject)$ic19$, (SubLObject)NIL);
    }
    
    public static SubLObject f23320(final SubLObject var27) {
        assert NIL != module0035.f2015(var27) : var27;
        SubLObject var28 = var27;
        SubLObject var29 = (SubLObject)NIL;
        var29 = var28.first();
        while (NIL != var28) {
            assert NIL != f23318(var29) : var29;
            var28 = var28.rest();
            var29 = var28.first();
        }
        if (NIL == var27) {
            return (SubLObject)$ic5$;
        }
        if (Sequences.length(var27).numE((SubLObject)ONE_INTEGER)) {
            return f23319(var27.first());
        }
        final SubLObject var30 = f23319(var27.first());
        SubLObject var31 = (SubLObject)NIL;
        if (NIL == var31) {
            SubLObject var32;
            SubLObject var33;
            for (var32 = var27.rest(), var33 = (SubLObject)NIL, var33 = var32.first(); NIL == var31 && NIL != var32; var31 = (SubLObject)makeBoolean(!var30.eql(f23319(var33))), var32 = var32.rest(), var33 = var32.first()) {}
        }
        if (NIL == var31) {
            return var30;
        }
        if (NIL != module0004.f104((SubLObject)$ic10$, var27, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic21$)) && NIL != conses_high.member((SubLObject)$ic12$, var27, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic21$))) {
            return (SubLObject)$ic5$;
        }
        if (NIL != module0004.f104((SubLObject)$ic10$, var27, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic21$))) {
            return (SubLObject)$ic10$;
        }
        if (NIL != module0004.f104((SubLObject)$ic12$, var27, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic21$))) {
            return (SubLObject)$ic12$;
        }
        if (NIL != module0004.f104((SubLObject)$ic14$, var27, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic21$)) && NIL != conses_high.member((SubLObject)$ic15$, var27, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic21$))) {
            return (SubLObject)$ic5$;
        }
        if (NIL != module0004.f104((SubLObject)$ic14$, var27, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic21$))) {
            return (SubLObject)$ic14$;
        }
        if (NIL != module0004.f104((SubLObject)$ic15$, var27, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic21$))) {
            return (SubLObject)$ic15$;
        }
        return (SubLObject)$ic5$;
    }
    
    public static SubLObject f23321() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0346", "f23311", "S#25822", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0346", "f23313", "S#25821", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0346", "f23314", "S#25820", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0346", "f23312", "S#25984", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0346", "f23315", "S#25985", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0346", "f23317", "S#25986", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0346", "f23316", "S#25987", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0346", "f23318", "S#25988", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0346", "f23319", "S#25989", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0346", "f23320", "S#25990", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23322() {
        $g2964$ = SubLFiles.defvar("S#25991", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23323() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f23321();
    }
    
    public void initializeVariables() {
        f23322();
    }
    
    public void runTopLevelForms() {
        f23323();
    }
    
    static {
        me = (SubLFile)new module0346();
        $g2964$ = null;
        $ic0$ = makeKeyword("TRUE");
        $ic1$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#25992", "CYC"), (SubLObject)makeSymbol("S#25993", "CYC"));
        $ic2$ = makeSymbol("DEDUCTION-P");
        $ic3$ = makeString("~s attempted to change its truth from ~s to ~s");
        $ic4$ = makeSymbol("ASSERTION-P");
        $ic5$ = makeKeyword("UNKNOWN");
        $ic6$ = makeKeyword("DEFAULT");
        $ic7$ = makeKeyword("MONOTONIC");
        $ic8$ = makeSymbol("S#747", "CYC");
        $ic9$ = makeSymbol("ARGUMENT-P");
        $ic10$ = makeKeyword("TRUE-MON");
        $ic11$ = makeSymbol("S#14722", "CYC");
        $ic12$ = makeKeyword("FALSE-MON");
        $ic13$ = makeSymbol("ASSERTED-ARGUMENT-P");
        $ic14$ = makeKeyword("TRUE-DEF");
        $ic15$ = makeKeyword("FALSE-DEF");
        $ic16$ = makeString("Use :unknown");
        $ic17$ = makeString("~S results in a contradiction.");
        $ic18$ = makeKeyword("SUPPORTS");
        $ic19$ = makeKeyword("TV");
        $ic20$ = makeSymbol("S#25988", "CYC");
        $ic21$ = makeSymbol("S#25989", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 96 ms
	
	Decompiled with Procyon 0.5.32.
*/