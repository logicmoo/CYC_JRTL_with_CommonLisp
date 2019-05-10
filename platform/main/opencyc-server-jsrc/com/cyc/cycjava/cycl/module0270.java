package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0270 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0270";
    public static final String myFingerPrint = "debabc2b5dc920f7484bc68aa5fe3b982302003b6170422ed65c97133723544c";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    
    public static SubLObject f17855() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0146.$g2042$.getDynamicValue(var1);
    }
    
    public static SubLObject f17856() {
        return module0034.f1839(f17855());
    }
    
    public static SubLObject f17857(final SubLObject var2) {
        if (NIL != module0202.f12590(var2)) {
            final SubLObject var3 = module0205.f13136(var2);
            return module0269.f17795(var3, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17858(final SubLObject var3) {
        return module0226.f15099(var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17859(final SubLObject var2) {
        final SubLObject var3 = module0205.f13136(var2);
        SubLObject var4 = (SubLObject)NIL;
        if (NIL != module0173.f10955(var3)) {
            final SubLObject var5 = f17858(var3);
            final SubLObject var6 = module0206.f13501(var3);
            SubLObject var7 = (SubLObject)ZERO_INTEGER;
            SubLObject var9;
            final SubLObject var8 = var9 = module0205.f13207(var2, (SubLObject)$ic0$);
            SubLObject var10 = (SubLObject)NIL;
            var10 = var9.first();
            while (NIL != var9) {
                var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                if (NIL != module0004.f104(var7, var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    if (NIL != var6) {
                        SubLObject var9_12;
                        final SubLObject var11 = var9_12 = module0205.f13180(var10, (SubLObject)$ic1$);
                        SubLObject var12 = (SubLObject)NIL;
                        var12 = var9_12.first();
                        while (NIL != var9_12) {
                            var4 = (SubLObject)ConsesLow.cons(var12, var4);
                            var9_12 = var9_12.rest();
                            var12 = var9_12.first();
                        }
                    }
                    else if (NIL != module0201.f12580(var10)) {
                        var4 = (SubLObject)ConsesLow.cons(var10, var4);
                    }
                    else if (NIL != module0206.f13473(var10) || NIL != module0206.f13471(var10) || NIL != module0201.f12580(module0205.f13203(var10, (SubLObject)UNPROVIDED))) {
                        var4 = (SubLObject)ConsesLow.cons(var10, var4);
                    }
                    else if (NIL != module0202.f12590(var10)) {
                        SubLObject var9_13;
                        final SubLObject var11 = var9_13 = module0205.f13180(var10, (SubLObject)$ic0$);
                        SubLObject var13 = (SubLObject)NIL;
                        var13 = var9_13.first();
                        while (NIL != var9_13) {
                            if (NIL != module0201.f12580(var13)) {
                                var4 = (SubLObject)ConsesLow.cons(var13, var4);
                            }
                            var9_13 = var9_13.rest();
                            var13 = var9_13.first();
                        }
                    }
                }
                var9 = var9.rest();
                var10 = var9.first();
            }
        }
        return Sequences.nreverse(var4);
    }
    
    public static SubLObject f17860(final SubLObject var3, final SubLObject var7, final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        SubLObject var18 = (SubLObject)NIL;
        if (NIL != module0147.f9491(var16, (SubLObject)$ic3$)) {
            final SubLObject var19 = module0147.$g2094$.currentBinding(var17);
            final SubLObject var20 = module0147.$g2095$.currentBinding(var17);
            try {
                module0147.$g2094$.bind((SubLObject)$ic3$, var17);
                module0147.$g2095$.bind($ic4$, var17);
                var18 = module0226.f14896(var3, var7, (SubLObject)NIL);
            }
            finally {
                module0147.$g2095$.rebind(var20, var17);
                module0147.$g2094$.rebind(var19, var17);
            }
        }
        else if (NIL != module0147.f9491(var16, (SubLObject)$ic5$)) {
            final SubLObject var19 = module0147.$g2094$.currentBinding(var17);
            final SubLObject var20 = module0147.$g2095$.currentBinding(var17);
            try {
                module0147.$g2094$.bind((SubLObject)$ic5$, var17);
                module0147.$g2095$.bind($ic6$, var17);
                var18 = module0226.f14896(var3, var7, (SubLObject)NIL);
            }
            finally {
                module0147.$g2095$.rebind(var20, var17);
                module0147.$g2094$.rebind(var19, var17);
            }
        }
        else if (NIL != module0161.f10488(var16)) {
            final SubLObject var19 = module0147.$g2094$.currentBinding(var17);
            final SubLObject var20 = module0147.$g2096$.currentBinding(var17);
            try {
                module0147.$g2094$.bind((SubLObject)$ic7$, var17);
                module0147.$g2096$.bind(module0161.f10522(var16), var17);
                var18 = module0226.f14896(var3, var7, (SubLObject)NIL);
            }
            finally {
                module0147.$g2096$.rebind(var20, var17);
                module0147.$g2094$.rebind(var19, var17);
            }
        }
        else {
            final SubLObject var19 = module0147.$g2094$.currentBinding(var17);
            final SubLObject var20 = module0147.$g2095$.currentBinding(var17);
            try {
                module0147.$g2094$.bind((SubLObject)$ic8$, var17);
                module0147.$g2095$.bind(var16, var17);
                var18 = module0226.f14896(var3, var7, (SubLObject)NIL);
            }
            finally {
                module0147.$g2095$.rebind(var20, var17);
                module0147.$g2094$.rebind(var19, var17);
            }
        }
        return var18;
    }
    
    public static SubLObject f17861(final SubLObject var3, final SubLObject var7, final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = module0034.$g879$.getDynamicValue(var17);
        SubLObject var19 = (SubLObject)NIL;
        if (NIL == var18) {
            return f17860(var3, var7, var16);
        }
        var19 = module0034.f1857(var18, (SubLObject)$ic2$, (SubLObject)UNPROVIDED);
        if (NIL == var19) {
            var19 = module0034.f1807(module0034.f1842(var18), (SubLObject)$ic2$, (SubLObject)THREE_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var18, (SubLObject)$ic2$, var19);
        }
        final SubLObject var20 = module0034.f1781(var3, var7, var16);
        final SubLObject var21 = module0034.f1814(var19, var20, (SubLObject)UNPROVIDED);
        if (var21 != $ic9$) {
            SubLObject var22 = var21;
            SubLObject var23 = (SubLObject)NIL;
            var23 = var22.first();
            while (NIL != var22) {
                SubLObject var24 = var23.first();
                final SubLObject var25 = conses_high.second(var23);
                if (var3.equal(var24.first())) {
                    var24 = var24.rest();
                    if (var7.equal(var24.first())) {
                        var24 = var24.rest();
                        if (NIL != var24 && NIL == var24.rest() && var16.equal(var24.first())) {
                            return module0034.f1959(var25);
                        }
                    }
                }
                var22 = var22.rest();
                var23 = var22.first();
            }
        }
        final SubLObject var26 = Values.arg2(var17.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f17860(var3, var7, var16)));
        module0034.f1836(var19, var20, var21, var26, (SubLObject)ConsesLow.list(var3, var7, var16));
        return module0034.f1959(var26);
    }
    
    public static SubLObject f17862() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0270", "f17855", "S#20385", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0270", "f17856", "S#17586", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0270", "f17857", "S#20386", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0270", "f17858", "S#20387", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0270", "f17859", "S#20388", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0270", "f17860", "S#20389", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0270", "f17861", "S#17587", 3, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17863() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17864() {
        module0034.f1895((SubLObject)$ic2$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f17862();
    }
    
    public void initializeVariables() {
        f17863();
    }
    
    public void runTopLevelForms() {
        f17864();
    }
    
    static {
        me = (SubLFile)new module0270();
        $ic0$ = makeKeyword("IGNORE");
        $ic1$ = makeKeyword("REGULARIZE");
        $ic2$ = makeSymbol("S#17587", "CYC");
        $ic3$ = makeSymbol("S#12274", "CYC");
        $ic4$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic5$ = makeSymbol("S#12275", "CYC");
        $ic6$ = constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"));
        $ic7$ = makeSymbol("S#12280", "CYC");
        $ic8$ = makeSymbol("S#12278", "CYC");
        $ic9$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 128 ms
	
	Decompiled with Procyon 0.5.32.
*/