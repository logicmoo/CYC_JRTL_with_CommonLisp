package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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
        if (var4 == module0241.UNPROVIDED) {
            var4 = Symbols.symbol_function((SubLObject)module0241.EQUAL);
        }
        if (module0241.NIL != module0035.sublisp_boolean(module0134.f8752(var2))) {
            return Functions.funcall(module0134.f8752(var2), var2, var3);
        }
        if (module0134.f8751(var2).isList()) {
            return module0004.f104(var3, module0134.f8751(var2), var4, (SubLObject)module0241.UNPROVIDED);
        }
        return Functions.funcall(var4, module0134.f8751(var2), var3);
    }
    
    public static SubLObject f15632(final SubLObject var2, final SubLObject var3, SubLObject var4) {
        if (var4 == module0241.UNPROVIDED) {
            var4 = Symbols.symbol_function((SubLObject)module0241.EQUAL);
        }
        if (module0241.NIL != f15630(module0134.f8745(var2)) && module0241.NIL != module0240.f15616(var3, module0134.f8745(var2))) {
            return (SubLObject)module0241.T;
        }
        if (module0241.NIL != module0238.f15580(module0134.f8751(var2))) {
            return Functions.funcall(var4, module0134.f8751(var2), var3);
        }
        if (module0134.f8751(var2).isList()) {
            return module0004.f104(var3, module0134.f8751(var2), var4, (SubLObject)module0241.UNPROVIDED);
        }
        return (SubLObject)module0241.NIL;
    }
    
    public static SubLObject f15633(final SubLObject var5, final SubLObject var3) {
        if (module0241.NIL != module0244.f15730(var5)) {
            return module0244.f15794(var3, module0137.f8955(var5));
        }
        return (SubLObject)module0241.T;
    }
    
    public static SubLObject f15634(final SubLObject var5, final SubLObject var3) {
        final SubLObject var6 = (module0241.NIL != module0244.f15730(var5)) ? module0244.f15786(module0137.f8955(var5), var3) : module0549.f33956(var5, var3);
        final SubLObject var7 = (SubLObject)module0241.ZERO_INTEGER;
        return Numbers.add(var6, var7);
    }
    
    public static SubLObject f15635(final SubLObject var5, final SubLObject var3) {
        final SubLObject var6 = (module0241.NIL != module0244.f15730(var5)) ? module0244.f15785(module0137.f8955(var5), var3) : module0549.f33957(var5, var3);
        final SubLObject var7 = (SubLObject)module0241.ZERO_INTEGER;
        return Numbers.add(var6, var7);
    }
    
    public static SubLObject f15636(final SubLObject var2, final SubLObject var3) {
        if (module0241.NIL == module0134.f8749(var2)) {
            module0134.f8793(var2, var3);
        }
        module0134.f8792(var2, (SubLObject)module0241.T);
        module0237.$g2444$.setDynamicValue((SubLObject)module0241.T);
        return (SubLObject)module0241.NIL;
    }
    
    public static SubLObject f15637(final SubLObject var2, final SubLObject var8) {
        module0134.f8795(var2, var8, (SubLObject)module0241.UNPROVIDED);
        return (SubLObject)module0241.NIL;
    }
    
    public static SubLObject f15638(final SubLObject var2, final SubLObject var5, final SubLObject var3, final SubLObject var9, final SubLObject var10, final SubLObject var11) {
        SubLObject var12 = (SubLObject)module0241.NIL;
        SubLObject var13 = (SubLObject)module0241.NIL;
        if (module0241.NIL != module0134.f8801(var10)) {
            var12 = (SubLObject)ConsesLow.list(var5, var3, var9);
        }
        else {
            var12 = (SubLObject)ConsesLow.list(var5, var9, var3);
        }
        var13 = module0217.f14421(var12, var11);
        if (module0241.NIL != var13) {
            module0134.f8795(var2, var13, (SubLObject)module0241.UNPROVIDED);
            return (SubLObject)module0241.NIL;
        }
        if (module0241.NIL == module0244.f15779(module0137.f8955(var5))) {
            if (module0241.NIL != module0134.f8801(var10)) {
                var13 = module0217.f14421((SubLObject)ConsesLow.list(var5, var9, var3), var11);
            }
            else {
                var13 = module0217.f14421((SubLObject)ConsesLow.list(var5, var3, var9), var11);
            }
            if (module0241.NIL != var13) {
                module0134.f8795(var2, var13, (SubLObject)module0241.UNPROVIDED);
            }
        }
        return (SubLObject)module0241.NIL;
    }
    
    public static SubLObject f15639(final SubLObject var2, final SubLObject var3, final SubLObject var14) {
        final SubLObject var15 = (SubLObject)ConsesLow.list(var14, module0191.f11990((SubLObject)module0241.$ic0$, (SubLObject)ConsesLow.listS(module0241.$ic1$, module0178.f11332(var14), (SubLObject)module0241.$ic2$), (SubLObject)module0241.UNPROVIDED, (SubLObject)module0241.UNPROVIDED));
        module0134.f8796(var2, var15);
        return (SubLObject)module0241.NIL;
    }
    
    public static SubLObject f15640(final SubLObject var2, final SubLObject var3) {
        SubLObject var4 = (SubLObject)module0241.NIL;
        SubLObject var5 = (SubLObject)module0241.NIL;
        if (module0241.NIL != module0158.f10010(var3, (SubLObject)module0241.ONE_INTEGER, var5)) {
            final SubLObject var6 = module0158.f10011(var3, (SubLObject)module0241.ONE_INTEGER, var5);
            SubLObject var7 = var4;
            final SubLObject var8 = (SubLObject)module0241.NIL;
            while (module0241.NIL == var7) {
                final SubLObject var9 = module0052.f3695(var6, var8);
                final SubLObject var10 = (SubLObject)SubLObjectFactory.makeBoolean(!var8.eql(var9));
                if (module0241.NIL != var10) {
                    SubLObject var11 = (SubLObject)module0241.NIL;
                    try {
                        var11 = module0158.f10316(var9, (SubLObject)module0241.$ic3$, (SubLObject)module0241.NIL, (SubLObject)module0241.NIL);
                        SubLObject var19_24 = var4;
                        final SubLObject var20_25 = (SubLObject)module0241.NIL;
                        while (module0241.NIL == var19_24) {
                            final SubLObject var12 = module0052.f3695(var11, var20_25);
                            final SubLObject var22_26 = (SubLObject)SubLObjectFactory.makeBoolean(!var20_25.eql(var12));
                            if (module0241.NIL != var22_26) {
                                final SubLObject var13 = module0178.f11332(var12);
                                if (module0241.NIL != module0147.f9507(module0178.f11287(var12)) && module0241.NIL != module0134.f8775(var2, var13) && module0241.NIL != module0259.f16854(var13, module0241.$ic4$, (SubLObject)module0241.UNPROVIDED, (SubLObject)module0241.UNPROVIDED)) {
                                    var4 = var12;
                                }
                            }
                            var19_24 = (SubLObject)SubLObjectFactory.makeBoolean(module0241.NIL == var22_26 || module0241.NIL != var4);
                        }
                    }
                    finally {
                        final SubLObject var14 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0241.T);
                            if (module0241.NIL != var11) {
                                module0158.f10319(var11);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var14);
                        }
                    }
                }
                var7 = (SubLObject)SubLObjectFactory.makeBoolean(module0241.NIL == var10 || module0241.NIL != var4);
            }
        }
        var5 = (SubLObject)module0241.NIL;
        if (module0241.NIL != module0158.f10010(var3, (SubLObject)module0241.TWO_INTEGER, var5)) {
            final SubLObject var6 = module0158.f10011(var3, (SubLObject)module0241.TWO_INTEGER, var5);
            SubLObject var7 = var4;
            final SubLObject var8 = (SubLObject)module0241.NIL;
            while (module0241.NIL == var7) {
                final SubLObject var9 = module0052.f3695(var6, var8);
                final SubLObject var10 = (SubLObject)SubLObjectFactory.makeBoolean(!var8.eql(var9));
                if (module0241.NIL != var10) {
                    SubLObject var11 = (SubLObject)module0241.NIL;
                    try {
                        var11 = module0158.f10316(var9, (SubLObject)module0241.$ic3$, (SubLObject)module0241.NIL, (SubLObject)module0241.NIL);
                        SubLObject var19_25 = var4;
                        final SubLObject var20_26 = (SubLObject)module0241.NIL;
                        while (module0241.NIL == var19_25) {
                            final SubLObject var12 = module0052.f3695(var11, var20_26);
                            final SubLObject var22_27 = (SubLObject)SubLObjectFactory.makeBoolean(!var20_26.eql(var12));
                            if (module0241.NIL != var22_27) {
                                final SubLObject var13 = module0178.f11332(var12);
                                if (module0241.NIL != module0147.f9507(module0178.f11287(var12)) && module0241.NIL != module0134.f8775(var2, var13) && module0241.NIL != module0259.f16854(var13, module0241.$ic4$, (SubLObject)module0241.UNPROVIDED, (SubLObject)module0241.UNPROVIDED)) {
                                    var4 = var12;
                                }
                            }
                            var19_25 = (SubLObject)SubLObjectFactory.makeBoolean(module0241.NIL == var22_27 || module0241.NIL != var4);
                        }
                    }
                    finally {
                        final SubLObject var15 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0241.T);
                            if (module0241.NIL != var11) {
                                module0158.f10319(var11);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var15);
                        }
                    }
                }
                var7 = (SubLObject)SubLObjectFactory.makeBoolean(module0241.NIL == var10 || module0241.NIL != var4);
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
        return (SubLObject)module0241.NIL;
    }
    
    public static SubLObject f15642() {
        return (SubLObject)module0241.NIL;
    }
    
    public static SubLObject f15643() {
        return (SubLObject)module0241.NIL;
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
        $ic0$ = SubLObjectFactory.makeKeyword("ISA");
        $ic1$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic2$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("ReflexiveBinaryPredicate")));
        $ic3$ = SubLObjectFactory.makeKeyword("GAF");
        $ic4$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ReflexiveBinaryPredicate"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0241.class
	Total time: 147 ms
	
	Decompiled with Procyon 0.5.32.
*/