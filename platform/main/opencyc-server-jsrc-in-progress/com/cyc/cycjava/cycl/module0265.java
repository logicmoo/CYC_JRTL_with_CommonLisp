package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0265 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0265";
    public static final String myFingerPrint = "7814f48d3677b26e43f391c1afe10ec3fccfb9f62d2b088a92320cc9547ac0a5";
    private static final SubLObject $ic0$;
    
    public static SubLObject f17460(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0248.f15931(module0137.f8955($ic0$), var1, var2, var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17461(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0252.f16304(module0137.f8955($ic0$), var1, var2, var3);
    }
    
    public static SubLObject f17462(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0248.f15932(module0137.f8955($ic0$), var1, var2, var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17463(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0252.f16305(module0137.f8955($ic0$), var1, var2, var3);
    }
    
    public static SubLObject f17464(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0254.f16479(module0137.f8955($ic0$), var1, var2, var3);
    }
    
    public static SubLObject f17465(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0252.f16247(module0137.f8955($ic0$), var1, var2, var3);
    }
    
    public static SubLObject f17466(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0254.f16480(module0137.f8955($ic0$), var1, var2, var3);
    }
    
    public static SubLObject f17467(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return f17466(var1, var2, var3);
    }
    
    public static SubLObject f17468(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0252.f16264(module0137.f8955($ic0$), var1, var2, var3);
    }
    
    public static SubLObject f17469(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0252.f16257(module0244.f15774(module0137.f8955($ic0$)), var1, var2, var3);
    }
    
    public static SubLObject f17470(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0252.f16261(module0137.f8955($ic0$), var1, var2, var3);
    }
    
    public static SubLObject f17471(final SubLObject var4, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)ZERO_INTEGER;
        if (NIL == var5) {
            SubLObject var7 = var4;
            SubLObject var8 = (SubLObject)NIL;
            var8 = var7.first();
            while (NIL == var5 && NIL != var7) {
                var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER);
                if (NIL == var5) {
                    SubLObject var7_9 = conses_high.nthcdr(var6, var4);
                    SubLObject var9 = (SubLObject)NIL;
                    var9 = var7_9.first();
                    while (NIL == var5 && NIL != var7_9) {
                        if (NIL != f17472(var8, var9, var2, (SubLObject)UNPROVIDED)) {
                            var5 = (SubLObject)ConsesLow.list(var8, var9);
                        }
                        var7_9 = var7_9.rest();
                        var9 = var7_9.first();
                    }
                }
                var7 = var7.rest();
                var8 = var7.first();
            }
        }
        return var5;
    }
    
    public static SubLObject f17472(final SubLObject var8, final SubLObject var10, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0254.f16490(module0137.f8955($ic0$), var8, var10, var2, var3);
    }
    
    public static SubLObject f17473(final SubLObject var11, final SubLObject var10, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0254.f16494(module0137.f8955($ic0$), var11, var10, var2, var3);
    }
    
    public static SubLObject f17474(final SubLObject var11, final SubLObject var12, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0254.f16495(module0137.f8955($ic0$), var11, var12, var2, var3);
    }
    
    public static SubLObject f17475(final SubLObject var8, final SubLObject var10, SubLObject var2, SubLObject var3) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        return module0252.f16346(module0137.f8955($ic0$), var8, var10, var2, var3);
    }
    
    public static SubLObject f17476(final SubLObject var8, final SubLObject var10, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        return f17472(var8, var10, var2, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17477(final SubLObject var8, final SubLObject var10, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        return f17472(var8, var10, var2, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17478(final SubLObject var4, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)ZERO_INTEGER;
        if (NIL == var5) {
            SubLObject var7 = var4;
            SubLObject var8 = (SubLObject)NIL;
            var8 = var7.first();
            while (NIL == var5 && NIL != var7) {
                var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER);
                if (NIL == var5) {
                    SubLObject var7_14 = conses_high.nthcdr(var6, var4);
                    SubLObject var9 = (SubLObject)NIL;
                    var9 = var7_14.first();
                    while (NIL == var5 && NIL != var7_14) {
                        if (NIL != f17472(var8, var9, var2, (SubLObject)UNPROVIDED)) {
                            var5 = (SubLObject)T;
                        }
                        var7_14 = var7_14.rest();
                        var9 = var7_14.first();
                    }
                }
                var7 = var7.rest();
                var8 = var7.first();
            }
        }
        return var5;
    }
    
    public static SubLObject f17479(final SubLObject var8, final SubLObject var10, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        SubLObject var12 = (SubLObject)NIL;
        if (var8.eql(var10)) {
            final SubLObject var13 = module0137.$g1609$.currentBinding(var11);
            try {
                module0137.$g1609$.bind((SubLObject)NIL, var11);
                var12 = f17475(var8, var10, var2, (SubLObject)UNPROVIDED);
            }
            finally {
                module0137.$g1609$.rebind(var13, var11);
            }
        }
        return (SubLObject)makeBoolean((var8.eql(var10) && NIL != var12) || (!var8.eql(var10) && NIL != f17475(var8, var10, var2, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f17480(final SubLObject var8, final SubLObject var10, SubLObject var2, SubLObject var3, SubLObject var18) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        return module0254.f16498(module0137.f8955($ic0$), var8, var10, var2, var3, var18);
    }
    
    public static SubLObject f17481(final SubLObject var1) {
        return module0226.f15062(var1, module0137.f8955($ic0$), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f17482(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0248.f16007(module0137.f8955($ic0$), var1, var2);
    }
    
    public static SubLObject f17483(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0248.f16008(module0137.f8955($ic0$), var1, var2);
    }
    
    public static SubLObject f17484(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0248.f16011(module0137.f8955($ic0$), var1, var2);
    }
    
    public static SubLObject f17485(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return module0248.f16012(module0137.f8955($ic0$), var1, var2);
    }
    
    public static SubLObject f17486(final SubLObject var19, final SubLObject var20) {
        module0248.f15957(var19, var20, module0137.f8955($ic0$));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17487(final SubLObject var19, final SubLObject var20) {
        module0248.f15962(var19, var20, module0137.f8955($ic0$));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17488() {
        module0248.f16004(module0137.f8955($ic0$));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17489(final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        final SubLObject var23 = module0141.$g1670$.currentBinding(var22);
        final SubLObject var24 = module0141.$g1671$.currentBinding(var22);
        final SubLObject var25 = module0141.$g1672$.currentBinding(var22);
        final SubLObject var26 = module0141.$g1674$.currentBinding(var22);
        final SubLObject var27 = module0137.$g1605$.currentBinding(var22);
        try {
            module0141.$g1670$.bind(module0137.f8955($ic0$), var22);
            module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic0$)), var22);
            module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic0$)), var22);
            module0141.$g1674$.bind((SubLObject)NIL, var22);
            module0137.$g1605$.bind(module0137.f8955($ic0$), var22);
            if (NIL != module0269.f17707(var21)) {
                SubLObject var28 = module0248.f15925(module0137.f8955($ic0$), var21);
                SubLObject var29 = (SubLObject)NIL;
                var29 = var28.first();
                while (NIL != var28) {
                    module0248.f15999(var21, var29, (SubLObject)UNPROVIDED);
                    var28 = var28.rest();
                    var29 = var28.first();
                }
            }
        }
        finally {
            module0137.$g1605$.rebind(var27, var22);
            module0141.$g1674$.rebind(var26, var22);
            module0141.$g1672$.rebind(var25, var22);
            module0141.$g1671$.rebind(var24, var22);
            module0141.$g1670$.rebind(var23, var22);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17490(final SubLObject var1) {
        final SubLObject var2 = f17481(var1);
        f17489(var1);
        if (NIL != module0269.f17707(var1)) {
            SubLObject var3 = var2;
            SubLObject var4 = (SubLObject)NIL;
            var4 = var3.first();
            while (NIL != var3) {
                f17491(var1, var4);
                var3 = var3.rest();
                var4 = var3.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17491(final SubLObject var1, final SubLObject var2) {
        module0248.f15951(var1, var2, module0137.f8955($ic0$));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17492(SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)T;
        }
        if (NIL != var28) {
            f17488();
        }
        module0248.f15952(module0137.f8955($ic0$));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17493() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0265", "f17460", "S#19996", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0265", "f17461", "S#19997", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0265", "f17462", "S#19998", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0265", "f17463", "S#19999", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0265", "f17464", "S#20000", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0265", "f17465", "S#20001", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0265", "f17466", "S#20002", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0265", "f17467", "S#20003", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0265", "f17468", "S#20004", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0265", "f17469", "S#20005", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0265", "f17470", "S#20006", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0265", "f17471", "S#20007", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0265", "f17472", "S#20008", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0265", "f17473", "S#20009", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0265", "f17474", "S#20010", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0265", "f17475", "S#19846", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0265", "f17476", "S#20011", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0265", "f17477", "S#20012", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0265", "f17478", "S#20013", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0265", "f17479", "S#20014", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0265", "f17480", "S#20015", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0265", "f17481", "S#20016", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0265", "f17482", "S#20017", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0265", "f17483", "S#20018", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0265", "f17484", "S#20019", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0265", "f17485", "S#20020", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0265", "f17486", "S#20021", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0265", "f17487", "S#20022", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0265", "f17488", "S#20023", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0265", "f17489", "S#20024", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0265", "f17490", "S#20025", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0265", "f17491", "S#20026", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0265", "f17492", "S#20027", 0, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17494() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f17495() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f17493();
    }
    
    public void initializeVariables() {
        f17494();
    }
    
    public void runTopLevelForms() {
        f17495();
    }
    
    static {
        me = (SubLFile)new module0265();
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("negationMt"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 109 ms
	
	Decompiled with Procyon 0.5.32.
*/