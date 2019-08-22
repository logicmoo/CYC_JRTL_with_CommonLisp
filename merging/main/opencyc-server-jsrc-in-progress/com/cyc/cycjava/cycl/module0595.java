package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0595 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0595";
    public static final String myFingerPrint = "d93639e8e7755ce0f56ab3540489144c9764ec37f9ea045177125ba649b08e68";
    private static SubLSymbol $g4555$;
    private static final SubLObject $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    
    public static SubLObject f36366(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4, final SubLObject var5) {
        SubLObject var6 = module0205.f13394(var1, var3, (SubLObject)UNPROVIDED);
        SubLObject var7 = conses_high.copy_tree(var1);
        if (NIL == module0193.f12067(var6)) {
            var6 = module0279.f18513(var1, (SubLObject)UNPROVIDED);
            var7 = module0205.f13267(var6, var3, var7);
        }
        return f36367(var7, var2, var4, var5, var6);
    }
    
    public static SubLObject f36367(final SubLObject var8, final SubLObject var9, final SubLObject var10, final SubLObject var11, final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        final SubLObject var14 = f36368(var10);
        SubLObject var15 = (SubLObject)NIL;
        if (var9.eql($ic0$) || var9.eql($ic1$)) {
            final SubLObject var16 = module0147.$g2094$.currentBinding(var13);
            final SubLObject var17 = module0147.$g2095$.currentBinding(var13);
            try {
                module0147.$g2094$.bind((SubLObject)$ic2$, var13);
                module0147.$g2095$.bind($ic0$, var13);
                var15 = f36369(var8, var10, var9, var12, var14);
            }
            finally {
                module0147.$g2095$.rebind(var17, var13);
                module0147.$g2094$.rebind(var16, var13);
            }
            var15 = Sequences.remove_duplicates(var15, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (var11.eql($ic0$) || var11.eql($ic1$)) {
            final SubLObject var16 = module0147.$g2094$.currentBinding(var13);
            final SubLObject var17 = module0147.$g2095$.currentBinding(var13);
            try {
                module0147.$g2094$.bind((SubLObject)$ic2$, var13);
                module0147.$g2095$.bind($ic0$, var13);
                var15 = f36369(var8, var10, var11, var12, var14);
            }
            finally {
                module0147.$g2095$.rebind(var17, var13);
                module0147.$g2094$.rebind(var16, var13);
            }
            var15 = Sequences.remove_duplicates(var15, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else {
            final SubLObject var18 = f36369(var8, var10, var9, var12, var14);
            final SubLObject var19 = f36369(var8, var10, var11, var12, var14);
            SubLObject var20 = (SubLObject)NIL;
            var20 = ConsesLow.append(var18, var19);
            SubLObject var21;
            var20 = (var21 = Sequences.remove_duplicates(var20, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            SubLObject var22 = (SubLObject)NIL;
            var22 = var21.first();
            while (NIL != var21) {
                if (NIL != module0004.f104(var22, var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != module0004.f104(var22, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var15 = (SubLObject)ConsesLow.cons(var22, var15);
                }
                var21 = var21.rest();
                var22 = var21.first();
            }
        }
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var24 = var15;
        SubLObject var25 = (SubLObject)NIL;
        var25 = var24.first();
        while (NIL != var24) {
            final SubLObject var26 = module0067.f4884(var14, var25, (SubLObject)UNPROVIDED);
            if (NIL != var26) {
                var23 = (SubLObject)ConsesLow.cons(var26, var23);
            }
            else {
                var23 = (SubLObject)ConsesLow.cons(var25, var23);
            }
            var24 = var24.rest();
            var25 = var24.first();
        }
        return var23;
    }
    
    public static SubLObject f36369(final SubLObject var8, final SubLObject var10, final SubLObject var2, final SubLObject var12, final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var17 = (SubLObject)NIL;
        final SubLObject var18 = module0152.$g2122$.currentBinding(var15);
        try {
            module0152.$g2122$.bind((SubLObject)T, var15);
            var17 = module0307.f20765(var8, var2, (SubLObject)$ic3$, (SubLObject)NIL);
        }
        finally {
            module0152.$g2122$.rebind(var18, var15);
        }
        final SubLObject var19 = module0067.f4884(var17, var12, (SubLObject)UNPROVIDED);
        final SubLObject var20 = var19.first();
        final SubLObject var21 = conses_high.second(var19);
        final SubLObject var22 = conses_high.third(var19);
        if (NIL == var19) {
            return (SubLObject)NIL;
        }
        var16 = f36370(var12, var20, var21, var10, var2);
        SubLObject var23;
        for (var23 = module0066.f4838(module0067.f4891(var14)); NIL == module0066.f4841(var23); var23 = module0066.f4840(var23)) {
            var15.resetMultipleValues();
            final SubLObject var24 = module0066.f4839(var23);
            final SubLObject var25 = var15.secondMultipleValue();
            var15.resetMultipleValues();
            var16 = ConsesLow.append(var16, f36371(var12, var20, var21, var10, var2, var25, var24));
        }
        module0066.f4842(var23);
        return var16;
    }
    
    public static SubLObject f36371(final SubLObject var12, final SubLObject var29, final SubLObject var30, final SubLObject var1, final SubLObject var2, final SubLObject var25, final SubLObject var33) {
        final SubLObject var34 = conses_high.subst(var33, var25, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return f36370(var12, var29, var30, var34, var2);
    }
    
    public static SubLObject f36370(final SubLObject var12, final SubLObject var29, final SubLObject var30, final SubLObject var1, final SubLObject var2) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        SubLObject var32 = (SubLObject)NIL;
        final SubLObject var33 = module0035.f2399(var1, (SubLObject)$ic3$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var34 = (SubLObject)NIL;
        final SubLObject var35 = module0152.$g2122$.currentBinding(var31);
        try {
            module0152.$g2122$.bind((SubLObject)T, var31);
            var34 = module0307.f20765(var1, var2, (SubLObject)$ic3$, (SubLObject)NIL);
        }
        finally {
            module0152.$g2122$.rebind(var35, var31);
        }
        SubLObject var36;
        for (var36 = module0066.f4838(module0067.f4891(var34)); NIL == module0066.f4841(var36); var36 = module0066.f4840(var36)) {
            var31.resetMultipleValues();
            final SubLObject var37 = module0066.f4839(var36);
            final SubLObject var38 = var31.secondMultipleValue();
            var31.resetMultipleValues();
            if (NIL != var37 && NIL != module0004.f104(var37, var33, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != f36372(var12, var29, var38.first(), (SubLObject)$ic4$, var2) && NIL != f36372(var12, var30, conses_high.second(var38), (SubLObject)$ic5$, var2)) {
                var32 = (SubLObject)ConsesLow.cons(var37, var32);
            }
        }
        module0066.f4842(var36);
        return var32;
    }
    
    public static SubLObject f36372(final SubLObject var22, final SubLObject var39, final SubLObject var40, final SubLObject var41, final SubLObject var2) {
        SubLObject var42 = ConsesLow.append(var39, var40);
        var42 = (SubLObject)ConsesLow.cons(var22, var42);
        return module0307.f20894((SubLObject)ConsesLow.list(var42), var41, var2);
    }
    
    public static SubLObject f36368(final SubLObject var1) {
        final SubLObject var2 = f36373(var1);
        SubLObject var3 = conses_high.copy_list(var1);
        final SubLObject var4 = module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var5 = var2;
        SubLObject var6 = (SubLObject)NIL;
        var6 = var5.first();
        while (NIL != var5) {
            final SubLObject var7 = module0279.f18513(var3, (SubLObject)UNPROVIDED);
            module0067.f4886(var4, var7, var6);
            var3 = conses_high.subst(var7, var6, var3, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
            var5 = var5.rest();
            var6 = var5.first();
        }
        return var4;
    }
    
    public static SubLObject f36373(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        if (NIL != module0202.f12635(var1) || NIL != module0202.f12627(var1)) {
            SubLObject var3 = module0205.f13207(var1, (SubLObject)UNPROVIDED);
            SubLObject var4 = (SubLObject)NIL;
            var4 = var3.first();
            while (NIL != var3) {
                if (NIL != module0202.f12590(var4)) {
                    var2 = ConsesLow.append(var2, f36373(var4));
                }
                var3 = var3.rest();
                var4 = var3.first();
            }
            var2 = Sequences.remove_duplicates(var2, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else {
            SubLObject var6;
            final SubLObject var5 = var6 = module0205.f13207(var1, (SubLObject)UNPROVIDED);
            SubLObject var7 = (SubLObject)NIL;
            var7 = var6.first();
            while (NIL != var6) {
                if (NIL == module0201.f12546(var7)) {
                    var2 = (SubLObject)ConsesLow.cons(var7, var2);
                }
                var6 = var6.rest();
                var7 = var6.first();
            }
        }
        return var2;
    }
    
    public static SubLObject f36374(final SubLObject var50, final SubLObject var25, SubLObject var51) {
        if (var51 == UNPROVIDED) {
            var51 = (SubLObject)NIL;
        }
        final SubLThread var52 = SubLProcess.currentSubLThread();
        final SubLObject var53 = var51;
        assert NIL != module0035.f2327(var53) : var53;
        SubLObject var54;
        SubLObject var55;
        SubLObject var56;
        for (var54 = (SubLObject)NIL, var54 = var53; NIL != var54; var54 = conses_high.cddr(var54)) {
            var55 = var54.first();
            var56 = conses_high.cadr(var54);
            assert NIL != module0360.f23781(var55) : var55;
        }
        SubLObject var57 = (SubLObject)NIL;
        SubLObject var58 = (SubLObject)NIL;
        SubLObject var59 = (SubLObject)NIL;
        SubLObject var60 = (SubLObject)NIL;
        var52.resetMultipleValues();
        final SubLObject var61 = module0423.f29604(var50);
        final SubLObject var62 = var52.secondMultipleValue();
        SubLObject var63 = var52.thirdMultipleValue();
        var52.resetMultipleValues();
        var63 = module0360.f23788(var63, var51);
        final SubLObject var64 = f36375(var25, var61);
        final SubLObject var65 = f36375(var25, var62);
        var52.resetMultipleValues();
        final SubLObject var63_64 = module0409.f28506(var64, var65, var63);
        final SubLObject var65_66 = var52.secondMultipleValue();
        final SubLObject var67_68 = var52.thirdMultipleValue();
        final SubLObject var69_70 = var52.fourthMultipleValue();
        var52.resetMultipleValues();
        var57 = var63_64;
        var58 = var65_66;
        var59 = var67_68;
        var60 = var69_70;
        return Values.values(var57, var58, var59, var60);
    }
    
    public static SubLObject f36376(final SubLObject var71) {
        final SubLThread var72 = SubLProcess.currentSubLThread();
        return $g4555$.getDynamicValue(var72);
    }
    
    public static SubLObject f36377(final SubLObject var72) {
        final SubLThread var73 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(!$g4555$.getDynamicValue(var73).equal(var72) && NIL != module0226.f15157(var72) && NIL == module0347.f23344((SubLObject)$ic9$, (SubLObject)ConsesLow.listS($ic10$, var72, (SubLObject)$ic11$), $ic1$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL == module0229.f15243(var72) && NIL == module0205.f13220(var72, $g4555$.getDynamicValue(var73), (SubLObject)NIL, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f36375(final SubLObject var25, final SubLObject var73) {
        final SubLThread var74 = SubLProcess.currentSubLThread();
        SubLObject var75 = (SubLObject)NIL;
        final SubLObject var76 = $g4555$.currentBinding(var74);
        try {
            $g4555$.bind(var25, var74);
            var75 = module0205.f13147(module0205.f13144(var73), (SubLObject)$ic12$, (SubLObject)$ic13$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            $g4555$.rebind(var76, var74);
        }
        return var75;
    }
    
    public static SubLObject f36378() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0595", "f36366", "S#40093", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0595", "f36367", "S#40094", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0595", "f36369", "S#40095", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0595", "f36371", "S#40096", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0595", "f36370", "S#40097", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0595", "f36372", "S#40098", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0595", "f36368", "S#40099", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0595", "f36373", "S#40100", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0595", "f36374", "S#33714", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0595", "f36376", "S#40101", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0595", "f36377", "S#40102", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0595", "f36375", "S#40103", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36379() {
        $g4555$ = SubLFiles.defparameter("S#40104", (SubLObject)$ic8$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36380() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f36378();
    }
    
    public void initializeVariables() {
        f36379();
    }
    
    public void runTopLevelForms() {
        f36380();
    }
    
    static {
        me = (SubLFile)new module0595();
        $g4555$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic1$ = constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"));
        $ic2$ = makeSymbol("S#12274", "CYC");
        $ic3$ = makeSymbol("S#12629", "CYC");
        $ic4$ = makeKeyword("ISA");
        $ic5$ = makeKeyword("GENLS");
        $ic6$ = makeSymbol("S#748", "CYC");
        $ic7$ = makeSymbol("QUERY-PROPERTY-P");
        $ic8$ = makeKeyword("UNINITIALIZED");
        $ic9$ = makeSymbol("?REFERENT");
        $ic10$ = constant_handles_oc.f8479((SubLObject)makeString("indexicalReferent"));
        $ic11$ = ConsesLow.list((SubLObject)makeSymbol("?REFERENT"));
        $ic12$ = makeSymbol("S#40102", "CYC");
        $ic13$ = makeSymbol("S#40101", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 151 ms
	
	Decompiled with Procyon 0.5.32.
*/