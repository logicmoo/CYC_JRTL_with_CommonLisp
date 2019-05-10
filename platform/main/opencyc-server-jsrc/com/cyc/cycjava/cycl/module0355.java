package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0355 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0355";
    public static final String myFingerPrint = "04653ae6e0875b7e9880a81e3855c467bfaebd26ebb7123610852baecaff23f3";
    private static SubLSymbol $g2996$;
    private static SubLSymbol $g2997$;
    private static final SubLList $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
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
    
    public static SubLObject f23600(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = var4;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10_11 = (SubLObject)NIL;
        while (NIL != var8) {
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)$ic0$);
            var10_11 = var8.first();
            var8 = var8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var8, var3, (SubLObject)$ic0$);
            if (NIL == conses_high.member(var10_11, (SubLObject)$ic1$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var9 = (SubLObject)T;
            }
            if (var10_11 == $ic2$) {
                var7 = var8.first();
            }
            var8 = var8.rest();
        }
        if (NIL != var9 && NIL == var7) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        }
        final SubLObject var10 = cdestructuring_bind.property_list_member((SubLObject)$ic3$, var4);
        final SubLObject var11 = (SubLObject)((NIL != var10) ? conses_high.cadr(var10) : NIL);
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic4$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)$ic5$, var4);
        final SubLObject var15 = (SubLObject)((NIL != var14) ? conses_high.cadr(var14) : NIL);
        final SubLObject var16 = cdestructuring_bind.property_list_member((SubLObject)$ic6$, var4);
        final SubLObject var17 = (SubLObject)((NIL != var16) ? conses_high.cadr(var16) : NIL);
        final SubLObject var18 = cdestructuring_bind.property_list_member((SubLObject)$ic7$, var4);
        final SubLObject var19 = (SubLObject)((NIL != var18) ? conses_high.cadr(var18) : NIL);
        final SubLObject var20;
        var4 = (var20 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)$ic8$, (SubLObject)ConsesLow.listS((SubLObject)$ic9$, (SubLObject)ConsesLow.list(var6, (SubLObject)$ic3$, var11, (SubLObject)$ic4$, var13, (SubLObject)$ic5$, var15), ConsesLow.append(var20, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic10$, var6, (SubLObject)ConsesLow.list((SubLObject)$ic11$, var19)));
    }
    
    public static SubLObject f23601(final SubLObject var23, final SubLObject var21) {
        if (NIL != var21) {
            module0067.f4886($g2997$.getGlobalValue(), var23, var21);
            SubLObject var24 = var21;
            SubLObject var25 = (SubLObject)NIL;
            var25 = var24.first();
            while (NIL != var24) {
                module0084.f5762($g2996$.getGlobalValue(), var25, var23);
                var24 = var24.rest();
                var25 = var24.first();
            }
        }
        return var23;
    }
    
    public static SubLObject f23602(final SubLObject var23, final SubLObject var25) {
        return module0004.f104(var25, module0067.f4884($g2997$.getGlobalValue(), var23, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f23603(final SubLObject var25) {
        if (var25.eql((SubLObject)$ic12$)) {
            return f23604();
        }
        if (var25.eql((SubLObject)$ic13$)) {
            return (SubLObject)NIL;
        }
        return module0067.f4884($g2996$.getGlobalValue(), var25, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f23605(final SubLObject var21) {
        SubLObject var22 = (SubLObject)NIL;
        SubLObject var23 = var21;
        SubLObject var24 = (SubLObject)NIL;
        var24 = var23.first();
        while (NIL != var23) {
            final SubLObject var25 = f23603(var24);
            var22 = conses_high.union(var22, var25, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var23 = var23.rest();
            var24 = var23.first();
        }
        return var22;
    }
    
    public static SubLObject f23606(final SubLObject var21) {
        SubLObject var22 = (SubLObject)NIL;
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var24 = (SubLObject)NIL;
        SubLObject var25 = (SubLObject)NIL;
        var23 = var21;
        var24 = var23.first();
        for (var25 = (SubLObject)ZERO_INTEGER; NIL != var23; var23 = var23.rest(), var24 = var23.first(), var25 = Numbers.add((SubLObject)ONE_INTEGER, var25)) {
            final SubLObject var26 = f23603(var24);
            if (var25.isZero()) {
                var22 = var26;
            }
            else {
                var22 = conses_high.intersection(var22, var26, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        return var22;
    }
    
    public static SubLObject f23607(final SubLObject var23) {
        return module0035.sublisp_boolean(module0067.f4884($g2997$.getGlobalValue(), var23, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f23608(final SubLObject var25) {
        return (SubLObject)makeBoolean(var25 == $ic12$ || var25 == $ic13$ || NIL != module0035.sublisp_boolean(module0067.f4884($g2996$.getGlobalValue(), var25, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f23604() {
        return module0067.f4902($g2997$.getGlobalValue());
    }
    
    public static SubLObject f23609() {
        return module0067.f4902($g2996$.getGlobalValue());
    }
    
    public static SubLObject f23610() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0355", "f23600", "S#26279");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0355", "f23601", "S#26280", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0355", "f23602", "S#26281", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0355", "f23603", "S#26282", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0355", "f23605", "S#26283", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0355", "f23606", "S#26284", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0355", "f23607", "S#26285", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0355", "f23608", "S#26286", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0355", "f23604", "S#26287", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0355", "f23609", "S#26288", 0, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23611() {
        $g2996$ = SubLFiles.deflexical("S#26289", module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g2997$ = SubLFiles.deflexical("S#26290", module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23612() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f23610();
    }
    
    public void initializeVariables() {
        f23611();
    }
    
    public void runTopLevelForms() {
        f23612();
    }
    
    static {
        me = (SubLFile)new module0355();
        $g2996$ = null;
        $g2997$ = null;
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10131", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#10127", "CYC"), (SubLObject)makeSymbol("S#10298", "CYC"), (SubLObject)makeSymbol("S#10130", "CYC"), (SubLObject)makeSymbol("S#15068", "CYC"), (SubLObject)makeSymbol("S#5852", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic1$ = ConsesLow.list((SubLObject)makeKeyword("PARENT"), (SubLObject)makeKeyword("DOCSTRING"), (SubLObject)makeKeyword("HIERARCHY"), (SubLObject)makeKeyword("GENERATED-BY"), (SubLObject)makeKeyword("PROPERTIES"));
        $ic2$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic3$ = makeKeyword("PARENT");
        $ic4$ = makeKeyword("DOCSTRING");
        $ic5$ = makeKeyword("HIERARCHY");
        $ic6$ = makeKeyword("GENERATED-BY");
        $ic7$ = makeKeyword("PROPERTIES");
        $ic8$ = makeSymbol("PROGN");
        $ic9$ = makeSymbol("S#10262", "CYC");
        $ic10$ = makeSymbol("S#26280", "CYC");
        $ic11$ = makeSymbol("QUOTE");
        $ic12$ = makeKeyword("ALL");
        $ic13$ = makeKeyword("NONE");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 68 ms
	
	Decompiled with Procyon 0.5.32.
*/