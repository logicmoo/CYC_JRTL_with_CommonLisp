package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0231 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0231";
    public static final String myFingerPrint = "ddc3341a9be35f9e7f55de87f1206006dc6ec6b7560655f7d80e29e68582c735";
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLObject $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLObject $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLObject $ic15$;
    private static final SubLObject $ic16$;
    private static final SubLObject $ic17$;
    private static final SubLObject $ic18$;
    private static final SubLObject $ic19$;
    private static final SubLObject $ic20$;
    private static final SubLObject $ic21$;
    private static final SubLObject $ic22$;
    
    public static SubLObject f15288(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        var2.resetMultipleValues();
        final SubLObject var3 = module0337.f22630(var1, (SubLObject)$ic0$);
        final SubLObject var4 = var2.secondMultipleValue();
        var2.resetMultipleValues();
        if (NIL != var3) {
            final SubLObject var5 = module0035.f2294(var4, (SubLObject)$ic1$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var6 = (SubLObject)NIL;
            SubLObject var7 = module0202.f12792(var5);
            SubLObject var8 = (SubLObject)NIL;
            var8 = var7.first();
            while (NIL != var7) {
                var6 = (SubLObject)ConsesLow.cons(module0202.f12751(var8), var6);
                var7 = var7.rest();
                var8 = var7.first();
            }
            return var6;
        }
        assert NIL != module0173.f10955(var1) : var1;
        SubLObject var9 = module0220.f14601(var1, $ic3$, (SubLObject)THREE_INTEGER, (SubLObject)$ic4$, (SubLObject)UNPROVIDED);
        var9 = Sequences.delete_duplicates(var9, Symbols.symbol_function((SubLObject)EQ), Symbols.symbol_function((SubLObject)$ic5$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var9;
    }
    
    public static SubLObject f15289(final SubLObject var9, final SubLObject var10) {
        assert NIL != Types.keywordp(var9) : var9;
        return module0594.f36340(var9, var10);
    }
    
    public static SubLObject f15290(final SubLObject var11) {
        assert NIL != module0173.f10955(var11) : var11;
        return module0594.f36343(var11);
    }
    
    public static SubLObject f15291(final SubLObject var12) {
        if (var12.eql($ic7$)) {
            return (SubLObject)NIL;
        }
        if (var12.eql($ic8$)) {
            return (SubLObject)T;
        }
        if (var12.eql($ic9$)) {
            return (SubLObject)NIL;
        }
        if (var12.eql($ic10$)) {
            return (SubLObject)$ic11$;
        }
        if (NIL != module0202.f12639(var12)) {
            return module0202.f12759(var12);
        }
        if (NIL != module0202.f12674(var12)) {
            return module0202.f12751(var12);
        }
        return var12;
    }
    
    public static SubLObject f15292(final SubLObject var12) {
        if (var12 == NIL) {
            return $ic7$;
        }
        if (var12 == T) {
            return $ic8$;
        }
        if (var12 == $ic11$) {
            return $ic10$;
        }
        if (var12.isKeyword()) {
            return module0202.f12790(var12);
        }
        if (var12.isCons()) {
            return module0202.f12787(var12, (SubLObject)UNPROVIDED);
        }
        return var12;
    }
    
    public static SubLObject f15293(final SubLObject var11, final SubLObject var13) {
        return module0220.f14554(var11, $ic12$, var13, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)$ic13$);
    }
    
    public static SubLObject f15294(final SubLObject var11, final SubLObject var13) {
        return module0220.f14554(var11, $ic14$, var13, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)$ic13$);
    }
    
    public static SubLObject f15295(final SubLObject var11, final SubLObject var14, final SubLObject var13) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = module0220.f14575($ic15$, var11, var14, var13, (SubLObject)ONE_INTEGER, (SubLObject)THREE_INTEGER, (SubLObject)$ic13$);
        if (NIL != var16) {
            SubLObject var17 = module0178.f11335(var16);
            if (NIL != module0173.f10955(var17)) {
                var15.resetMultipleValues();
                final SubLObject var18 = f15296(var17);
                final SubLObject var19 = var15.secondMultipleValue();
                var15.resetMultipleValues();
                if (NIL != var19) {
                    var17 = var18;
                }
            }
            return var17;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15296(final SubLObject var11) {
        final SubLObject var12 = module0220.f14554(var11, $ic16$, $ic17$, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)$ic13$);
        if (NIL != module0202.f12589(var12, $ic18$)) {
            return Values.values(module0205.f13277(var12, (SubLObject)UNPROVIDED), (SubLObject)T);
        }
        return Values.values(var12, module0035.sublisp_boolean(var12));
    }
    
    public static SubLObject f15297(final SubLObject var11, final SubLObject var14, final SubLObject var13) {
        final SubLObject var15 = module0220.f14575($ic19$, var11, var14, var13, (SubLObject)ONE_INTEGER, (SubLObject)THREE_INTEGER, (SubLObject)$ic13$);
        if (NIL != var15) {
            return module0178.f11335(var15);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15298(final SubLObject var11, final SubLObject var14, final SubLObject var13) {
        final SubLObject var15 = module0220.f14575($ic20$, var11, var14, var13, (SubLObject)ONE_INTEGER, (SubLObject)THREE_INTEGER, (SubLObject)$ic13$);
        if (NIL != var15) {
            return module0178.f11335(var15);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15299(final SubLObject var11, final SubLObject var13) {
        return module0220.f14554(var11, $ic21$, var13, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)$ic13$);
    }
    
    public static SubLObject f15300(final SubLObject var11, final SubLObject var13) {
        return module0220.f14554(var11, $ic22$, var13, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)$ic13$);
    }
    
    public static SubLObject f15301() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0231", "f15288", "S#18044", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0231", "f15289", "S#18045", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0231", "f15290", "S#18046", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0231", "f15291", "S#18047", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0231", "f15292", "S#18048", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0231", "f15293", "S#18049", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0231", "f15294", "S#18050", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0231", "f15295", "S#18051", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0231", "f15296", "S#18052", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0231", "f15297", "S#18053", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0231", "f15298", "S#18054", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0231", "f15299", "S#18055", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0231", "f15300", "S#18056", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15302() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15303() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f15301();
    }
    
    public void initializeVariables() {
        f15302();
    }
    
    public void runTopLevelForms() {
        f15303();
    }
    
    static {
        me = (SubLFile)new module0231();
        $ic0$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("QueryFn")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#18057", "CYC")));
        $ic1$ = makeSymbol("S#18057", "CYC");
        $ic2$ = makeSymbol("FORT-P");
        $ic3$ = constant_handles_oc.f8479((SubLObject)makeString("softwareParameterValueInSpecification"));
        $ic4$ = ConsesLow.list((SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER);
        $ic5$ = makeSymbol("FIRST");
        $ic6$ = makeSymbol("KEYWORDP");
        $ic7$ = constant_handles_oc.f8479((SubLObject)makeString("False"));
        $ic8$ = constant_handles_oc.f8479((SubLObject)makeString("True"));
        $ic9$ = constant_handles_oc.f8479((SubLObject)makeString("TheEmptySet"));
        $ic10$ = constant_handles_oc.f8479((SubLObject)makeString("PlusInfinity"));
        $ic11$ = makeKeyword("POSITIVE-INFINITY");
        $ic12$ = constant_handles_oc.f8479((SubLObject)makeString("softwareParameterShortDescription"));
        $ic13$ = makeKeyword("TRUE");
        $ic14$ = constant_handles_oc.f8479((SubLObject)makeString("softwareParameterLongDescription"));
        $ic15$ = constant_handles_oc.f8479((SubLObject)makeString("defaultSoftwareParameterValueInSoftwareObject"));
        $ic16$ = constant_handles_oc.f8479((SubLObject)makeString("subLIdentifier"));
        $ic17$ = constant_handles_oc.f8479((SubLObject)makeString("CycAPIMt"));
        $ic18$ = constant_handles_oc.f8479((SubLObject)makeString("SubLQuoteFn"));
        $ic19$ = constant_handles_oc.f8479((SubLObject)makeString("alternateSoftwareParameterValueInSoftwareObject"));
        $ic20$ = constant_handles_oc.f8479((SubLObject)makeString("softwareParameterValueDomainInSoftwareObject"));
        $ic21$ = constant_handles_oc.f8479((SubLObject)makeString("softwareParameterValueShortDescription"));
        $ic22$ = constant_handles_oc.f8479((SubLObject)makeString("softwareParameterValueLongDescription"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 94 ms
	
	Decompiled with Procyon 0.5.32.
*/