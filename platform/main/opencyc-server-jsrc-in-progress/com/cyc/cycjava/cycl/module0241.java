package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0241 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0241";
    public static final String myFingerPrint = "73841efc4c29225ce49dcc5e559d81fe3a50b4ec29822e9d63d0a2b87f5c35a9";
    private static final SubLSymbol $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLObject $ic4$;
    
    public static SubLObject f15630(final SubLObject var1) {
        return Types.hash_table_p(var1);
    }
    
    public static SubLObject f15631(final SubLObject var2, final SubLObject var3, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = Symbols.symbol_function((SubLObject)EQUAL);
        }
        if (NIL != module0035.sublisp_boolean(module0134.f8752(var2))) {
            return Functions.funcall(module0134.f8752(var2), var2, var3);
        }
        if (module0134.f8751(var2).isList()) {
            return module0004.f104(var3, module0134.f8751(var2), var4, (SubLObject)UNPROVIDED);
        }
        return Functions.funcall(var4, module0134.f8751(var2), var3);
    }
    
    public static SubLObject f15632(final SubLObject var2, final SubLObject var3, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = Symbols.symbol_function((SubLObject)EQUAL);
        }
        if (NIL != f15630(module0134.f8745(var2)) && NIL != module0240.f15616(var3, module0134.f8745(var2))) {
            return (SubLObject)T;
        }
        if (NIL != module0238.f15580(module0134.f8751(var2))) {
            return Functions.funcall(var4, module0134.f8751(var2), var3);
        }
        if (module0134.f8751(var2).isList()) {
            return module0004.f104(var3, module0134.f8751(var2), var4, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15633(final SubLObject var5, final SubLObject var3) {
        if (NIL != module0244.f15730(var5)) {
            return module0244.f15794(var3, module0137.f8955(var5));
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f15634(final SubLObject var5, final SubLObject var3) {
        final SubLObject var6 = (NIL != module0244.f15730(var5)) ? module0244.f15786(module0137.f8955(var5), var3) : module0549.f33956(var5, var3);
        final SubLObject var7 = (SubLObject)ZERO_INTEGER;
        return Numbers.add(var6, var7);
    }
    
    public static SubLObject f15635(final SubLObject var5, final SubLObject var3) {
        final SubLObject var6 = (NIL != module0244.f15730(var5)) ? module0244.f15785(module0137.f8955(var5), var3) : module0549.f33957(var5, var3);
        final SubLObject var7 = (SubLObject)ZERO_INTEGER;
        return Numbers.add(var6, var7);
    }
    
    public static SubLObject f15636(final SubLObject var2, final SubLObject var3) {
        if (NIL == module0134.f8749(var2)) {
            module0134.f8793(var2, var3);
        }
        module0134.f8792(var2, (SubLObject)T);
        module0237.$g2444$.setDynamicValue((SubLObject)T);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15637(final SubLObject var2, final SubLObject var8) {
        module0134.f8795(var2, var8, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15638(final SubLObject var2, final SubLObject var5, final SubLObject var3, final SubLObject var9, final SubLObject var10, final SubLObject var11) {
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        if (NIL != module0134.f8801(var10)) {
            var12 = (SubLObject)ConsesLow.list(var5, var3, var9);
        }
        else {
            var12 = (SubLObject)ConsesLow.list(var5, var9, var3);
        }
        var13 = module0217.f14421(var12, var11);
        if (NIL != var13) {
            module0134.f8795(var2, var13, (SubLObject)UNPROVIDED);
            return (SubLObject)NIL;
        }
        if (NIL == module0244.f15779(module0137.f8955(var5))) {
            if (NIL != module0134.f8801(var10)) {
                var13 = module0217.f14421((SubLObject)ConsesLow.list(var5, var9, var3), var11);
            }
            else {
                var13 = module0217.f14421((SubLObject)ConsesLow.list(var5, var3, var9), var11);
            }
            if (NIL != var13) {
                module0134.f8795(var2, var13, (SubLObject)UNPROVIDED);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15639(final SubLObject var2, final SubLObject var3, final SubLObject var14) {
        final SubLObject var15 = (SubLObject)ConsesLow.list(var14, module0191.f11990((SubLObject)$ic0$, (SubLObject)ConsesLow.listS($ic1$, module0178.f11332(var14), (SubLObject)$ic2$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        module0134.f8796(var2, var15);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15640(final SubLObject var2, final SubLObject var3) {
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        if (NIL != module0158.f10010(var3, (SubLObject)ONE_INTEGER, var5)) {
            final SubLObject var6 = module0158.f10011(var3, (SubLObject)ONE_INTEGER, var5);
            SubLObject var7 = var4;
            final SubLObject var8 = (SubLObject)NIL;
            while (NIL == var7) {
                final SubLObject var9 = module0052.f3695(var6, var8);
                final SubLObject var10 = (SubLObject)makeBoolean(!var8.eql(var9));
                if (NIL != var10) {
                    SubLObject var11 = (SubLObject)NIL;
                    try {
                        var11 = module0158.f10316(var9, (SubLObject)$ic3$, (SubLObject)NIL, (SubLObject)NIL);
                        SubLObject var19_24 = var4;
                        final SubLObject var20_25 = (SubLObject)NIL;
                        while (NIL == var19_24) {
                            final SubLObject var12 = module0052.f3695(var11, var20_25);
                            final SubLObject var22_26 = (SubLObject)makeBoolean(!var20_25.eql(var12));
                            if (NIL != var22_26) {
                                final SubLObject var13 = module0178.f11332(var12);
                                if (NIL != module0147.f9507(module0178.f11287(var12)) && NIL != module0134.f8775(var2, var13) && NIL != module0259.f16854(var13, $ic4$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                    var4 = var12;
                                }
                            }
                            var19_24 = (SubLObject)makeBoolean(NIL == var22_26 || NIL != var4);
                        }
                    }
                    finally {
                        final SubLObject var14 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                            if (NIL != var11) {
                                module0158.f10319(var11);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var14);
                        }
                    }
                }
                var7 = (SubLObject)makeBoolean(NIL == var10 || NIL != var4);
            }
        }
        var5 = (SubLObject)NIL;
        if (NIL != module0158.f10010(var3, (SubLObject)TWO_INTEGER, var5)) {
            final SubLObject var6 = module0158.f10011(var3, (SubLObject)TWO_INTEGER, var5);
            SubLObject var7 = var4;
            final SubLObject var8 = (SubLObject)NIL;
            while (NIL == var7) {
                final SubLObject var9 = module0052.f3695(var6, var8);
                final SubLObject var10 = (SubLObject)makeBoolean(!var8.eql(var9));
                if (NIL != var10) {
                    SubLObject var11 = (SubLObject)NIL;
                    try {
                        var11 = module0158.f10316(var9, (SubLObject)$ic3$, (SubLObject)NIL, (SubLObject)NIL);
                        SubLObject var19_25 = var4;
                        final SubLObject var20_26 = (SubLObject)NIL;
                        while (NIL == var19_25) {
                            final SubLObject var12 = module0052.f3695(var11, var20_26);
                            final SubLObject var22_27 = (SubLObject)makeBoolean(!var20_26.eql(var12));
                            if (NIL != var22_27) {
                                final SubLObject var13 = module0178.f11332(var12);
                                if (NIL != module0147.f9507(module0178.f11287(var12)) && NIL != module0134.f8775(var2, var13) && NIL != module0259.f16854(var13, $ic4$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                    var4 = var12;
                                }
                            }
                            var19_25 = (SubLObject)makeBoolean(NIL == var22_27 || NIL != var4);
                        }
                    }
                    finally {
                        final SubLObject var15 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                            if (NIL != var11) {
                                module0158.f10319(var11);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var15);
                        }
                    }
                }
                var7 = (SubLObject)makeBoolean(NIL == var10 || NIL != var4);
            }
        }
        return var4;
    }
    
    public static SubLObject f15641() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0241", "f15630", "S#18393", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0241", "f15631", "S#18394", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0241", "f15632", "S#18395", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0241", "f15633", "S#18396", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0241", "f15634", "S#18397", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0241", "f15635", "S#18398", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0241", "f15636", "S#18399", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0241", "f15637", "S#18400", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0241", "f15638", "S#18401", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0241", "f15639", "S#18402", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0241", "f15640", "S#18403", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15642() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15643() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f15641();
    }
    
    public void initializeVariables() {
        f15642();
    }
    
    public void runTopLevelForms() {
        f15643();
    }
    
    static {
        me = (SubLFile)new module0241();
        $ic0$ = makeKeyword("ISA");
        $ic1$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic2$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ReflexiveBinaryPredicate")));
        $ic3$ = makeKeyword("GAF");
        $ic4$ = constant_handles_oc.f8479((SubLObject)makeString("ReflexiveBinaryPredicate"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 147 ms
	
	Decompiled with Procyon 0.5.32.
*/