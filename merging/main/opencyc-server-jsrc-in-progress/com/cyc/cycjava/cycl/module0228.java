package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0228 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0228";
    public static final String myFingerPrint = "b7d38e1cde99fae0249365131971f16f9bdbb349f15e23980124121ae9dd9e6b";
    public static SubLSymbol $g2418$;
    public static SubLSymbol $g2419$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLInteger $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    
    public static SubLObject f15205(final SubLObject var1) {
        if (NIL != module0167.f10813(var1)) {
            return module0172.f10915(var1);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15206(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        assert NIL != module0167.f10813(var1) : var1;
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = module0147.$g2094$.currentBinding(var2);
        final SubLObject var5 = module0147.$g2095$.currentBinding(var2);
        try {
            module0147.$g2094$.bind((SubLObject)$ic2$, var2);
            module0147.$g2095$.bind(module0132.$g1558$.getGlobalValue(), var2);
            final SubLObject var6 = $ic3$;
            if (NIL != module0158.f10010(var1, (SubLObject)ONE_INTEGER, var6)) {
                final SubLObject var7 = module0158.f10011(var1, (SubLObject)ONE_INTEGER, var6);
                SubLObject var8 = var3;
                final SubLObject var9 = (SubLObject)NIL;
                while (NIL == var8) {
                    final SubLObject var10 = module0052.f3695(var7, var9);
                    final SubLObject var11 = (SubLObject)makeBoolean(!var9.eql(var10));
                    if (NIL != var11) {
                        SubLObject var12 = (SubLObject)NIL;
                        try {
                            var12 = module0158.f10316(var10, (SubLObject)$ic4$, (SubLObject)NIL, (SubLObject)NIL);
                            SubLObject var8_13 = var3;
                            final SubLObject var9_14 = (SubLObject)NIL;
                            while (NIL == var8_13) {
                                final SubLObject var13 = module0052.f3695(var12, var9_14);
                                final SubLObject var11_16 = (SubLObject)makeBoolean(!var9_14.eql(var13));
                                if (NIL != var11_16) {
                                    var3 = var13;
                                }
                                var8_13 = (SubLObject)makeBoolean(NIL == var11_16 || NIL != var3);
                            }
                        }
                        finally {
                            final SubLObject var4_17 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                                if (NIL != var12) {
                                    module0158.f10319(var12);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var4_17, var2);
                            }
                        }
                    }
                    var8 = (SubLObject)makeBoolean(NIL == var11 || NIL != var3);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var5, var2);
            module0147.$g2094$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f15207(final SubLObject var1) {
        final SubLObject var2 = f15206(var1);
        if (NIL != var2) {
            return module0178.f11335(var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15208(final SubLObject var19) {
        return module0211.f13649(var19, $ic3$);
    }
    
    public static SubLObject f15209(final SubLObject var15) {
        return f15208(var15);
    }
    
    public static SubLObject f15210(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        SubLObject var21 = (SubLObject)NIL;
        final SubLObject var22 = module0147.$g2094$.currentBinding(var20);
        final SubLObject var23 = module0147.$g2095$.currentBinding(var20);
        try {
            module0147.$g2094$.bind((SubLObject)$ic5$, var20);
            module0147.$g2095$.bind($ic6$, var20);
            var21 = f15211(var19);
        }
        finally {
            module0147.$g2095$.rebind(var23, var20);
            module0147.$g2094$.rebind(var22, var20);
        }
        return var21;
    }
    
    public static SubLObject f15212(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        if (NIL == module0018.$g617$.getDynamicValue(var21)) {
            return (SubLObject)T;
        }
        return Numbers.numLE(f15210(var20), module0018.$g617$.getDynamicValue(var21));
    }
    
    public static SubLObject f15211(final SubLObject var19) {
        final SubLObject var20 = Structures.method_func(var19, $g2418$.getGlobalValue());
        if (NIL != var20) {
            return Functions.funcall(var20, var19);
        }
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f15213(final SubLObject var19) {
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f15214(final SubLObject var19) {
        return f15215(var19);
    }
    
    public static SubLObject f15215(final SubLObject var1) {
        return f15210(module0172.f10915(var1));
    }
    
    public static SubLObject f15216(final SubLObject var19) {
        SubLObject var20 = (SubLObject)NIL;
        SubLObject var21 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var19, var19, (SubLObject)$ic10$);
        var20 = var19.first();
        final SubLObject var22 = var21 = var19.rest();
        if (NIL != module0173.f10955(var20) && NIL == module0269.f17725(var20)) {
            return (SubLObject)ZERO_INTEGER;
        }
        SubLObject var23 = f15211(var20);
        SubLObject var24;
        SubLObject var25;
        SubLObject var26;
        for (var24 = (SubLObject)NIL, var24 = var21; !var24.isAtom(); var24 = var24.rest()) {
            var25 = var24.first();
            var26 = f15211(var25);
            var23 = Numbers.max(var23, var26);
        }
        return Numbers.add(var23, (SubLObject)ONE_INTEGER);
    }
    
    public static SubLObject f15217(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        SubLObject var21 = (SubLObject)NIL;
        final SubLObject var22 = module0147.$g2094$.currentBinding(var20);
        final SubLObject var23 = module0147.$g2095$.currentBinding(var20);
        try {
            module0147.$g2094$.bind((SubLObject)$ic5$, var20);
            module0147.$g2095$.bind($ic6$, var20);
            var21 = f15218(var19);
        }
        finally {
            module0147.$g2095$.rebind(var23, var20);
            module0147.$g2094$.rebind(var22, var20);
        }
        return var21;
    }
    
    public static SubLObject f15219(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        if (NIL == module0018.$g618$.getDynamicValue(var21)) {
            return (SubLObject)T;
        }
        return Numbers.numLE(f15217(var20), module0018.$g618$.getDynamicValue(var21));
    }
    
    public static SubLObject f15220(final SubLObject var30, final SubLObject var31) {
        if (var31.isAtom()) {
            return (SubLObject)NIL;
        }
        if (NIL == var30) {
            return (SubLObject)NIL;
        }
        if (var30.isAtom()) {
            return (SubLObject)T;
        }
        final SubLObject var32 = f15217(var30);
        final SubLObject var33 = f15217(var31);
        if (var32.numL(var33)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15218(final SubLObject var19) {
        final SubLObject var20 = Structures.method_func(var19, $g2419$.getGlobalValue());
        if (NIL != var20) {
            return Functions.funcall(var20, var19);
        }
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f15221(final SubLObject var19) {
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f15222(final SubLObject var19) {
        return f15223(var19);
    }
    
    public static SubLObject f15223(final SubLObject var1) {
        return f15217(module0172.f10915(var1));
    }
    
    public static SubLObject f15224(final SubLObject var19) {
        SubLObject var20 = (SubLObject)NIL;
        SubLObject var21 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var19, var19, (SubLObject)$ic14$);
        var20 = var19.first();
        final SubLObject var22 = var21 = var19.rest();
        SubLObject var23 = f15218(var20);
        SubLObject var24 = var21;
        SubLObject var25 = (SubLObject)NIL;
        var25 = var24.first();
        while (NIL != var24) {
            final SubLObject var26 = f15218(var25);
            var23 = Numbers.max(var23, var26);
            var24 = var24.rest();
            var25 = var24.first();
        }
        return Numbers.add(var23, (SubLObject)ONE_INTEGER);
    }
    
    public static SubLObject f15225(final SubLObject var19) {
        return module0202.f12659(var19);
    }
    
    public static SubLObject f15226(final SubLObject var24) {
        assert NIL != module0173.f10955(var24) : var24;
        SubLObject var25 = (SubLObject)NIL;
        if (NIL != module0158.f10078(var24)) {
            final SubLObject var26 = module0158.f10080(var24);
            SubLObject var27 = (SubLObject)NIL;
            try {
                var27 = module0158.f10316(var26, (SubLObject)$ic4$, (SubLObject)NIL, (SubLObject)NIL);
                SubLObject var28 = (SubLObject)NIL;
                final SubLObject var29 = (SubLObject)NIL;
                while (NIL == var28) {
                    final SubLObject var30 = module0052.f3695(var27, var29);
                    final SubLObject var31 = (SubLObject)makeBoolean(!var29.eql(var30));
                    if (NIL != var31) {
                        final SubLObject var32 = module0178.f11334(var30);
                        var25 = (SubLObject)ConsesLow.cons(var32, var25);
                    }
                    var28 = (SubLObject)makeBoolean(NIL == var31);
                }
            }
            finally {
                final SubLObject var33 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                    if (NIL != var27) {
                        module0158.f10319(var27);
                    }
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var33);
                }
            }
        }
        return Sequences.nreverse(var25);
    }
    
    public static SubLObject f15227(final SubLObject var24, final SubLObject var20, SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)ONE_INTEGER;
        }
        final SubLThread var29 = SubLProcess.currentSubLThread();
        assert NIL != module0173.f10955(var24) : var24;
        assert NIL != module0173.f10955(var20) : var20;
        assert NIL != Types.integerp(var28) : var28;
        SubLObject var30 = (SubLObject)NIL;
        final SubLObject var31 = module0147.$g2094$.currentBinding(var29);
        final SubLObject var32 = module0147.$g2095$.currentBinding(var29);
        try {
            module0147.$g2094$.bind((SubLObject)$ic2$, var29);
            module0147.$g2095$.bind(module0132.$g1558$.getGlobalValue(), var29);
            if (NIL != module0158.f10054(var20, var28, var24)) {
                final SubLObject var33 = module0158.f10055(var20, var28, var24);
                SubLObject var34 = (SubLObject)NIL;
                final SubLObject var35 = (SubLObject)NIL;
                while (NIL == var34) {
                    final SubLObject var36 = module0052.f3695(var33, var35);
                    final SubLObject var37 = (SubLObject)makeBoolean(!var35.eql(var36));
                    if (NIL != var37) {
                        SubLObject var38 = (SubLObject)NIL;
                        try {
                            var38 = module0158.f10316(var36, (SubLObject)$ic4$, (SubLObject)NIL, (SubLObject)NIL);
                            SubLObject var8_43 = (SubLObject)NIL;
                            final SubLObject var9_44 = (SubLObject)NIL;
                            while (NIL == var8_43) {
                                final SubLObject var39 = module0052.f3695(var38, var9_44);
                                final SubLObject var11_45 = (SubLObject)makeBoolean(!var9_44.eql(var39));
                                if (NIL != var11_45) {
                                    final SubLObject var40 = module0178.f11334(var39);
                                    var30 = (SubLObject)ConsesLow.cons(var40, var30);
                                }
                                var8_43 = (SubLObject)makeBoolean(NIL == var11_45);
                            }
                        }
                        finally {
                            final SubLObject var4_46 = Threads.$is_thread_performing_cleanupP$.currentBinding(var29);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var29);
                                if (NIL != var38) {
                                    module0158.f10319(var38);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var4_46, var29);
                            }
                        }
                    }
                    var34 = (SubLObject)makeBoolean(NIL == var37);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var32, var29);
            module0147.$g2094$.rebind(var31, var29);
        }
        return Sequences.nreverse(var30);
    }
    
    public static SubLObject f15228(final SubLObject var47) {
        SubLObject var48 = (SubLObject)NIL;
        SubLObject var49 = (SubLObject)NIL;
        SubLObject var50 = var47;
        SubLObject var51 = (SubLObject)NIL;
        var51 = var50.first();
        while (NIL != var50) {
            if (NIL != module0210.f13576(var51, (SubLObject)UNPROVIDED)) {
                var49 = module0172.f10921(var51);
                if (NIL != var49) {
                    var48 = (SubLObject)ConsesLow.cons(var49, var48);
                }
            }
            else {
                var48 = (SubLObject)ConsesLow.cons(var51, var48);
            }
            var50 = var50.rest();
            var51 = var50.first();
        }
        return Sequences.nreverse(var48);
    }
    
    public static SubLObject f15229(final SubLObject var49) {
        if (NIL != module0202.f12659(var49)) {
            final SubLObject var50 = module0172.f10921(var49);
            return (NIL != var50) ? var50 : var49;
        }
        return var49;
    }
    
    public static SubLObject f15230(final SubLObject var49) {
        if (NIL != module0167.f10813(var49)) {
            return module0172.f10920(var49);
        }
        return var49;
    }
    
    public static SubLObject f15231() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0228", "f15205", "TERM-OF-UNIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0228", "f15206", "S#13713", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0228", "f15207", "S#17962", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0228", "f15208", "S#12747", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0228", "f15209", "S#17963", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0228", "f15210", "S#17964", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0228", "f15212", "S#16409", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0228", "f15211", "S#17965", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0228", "f15213", "S#17966", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0228", "f15214", "S#17967", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0228", "f15215", "S#17968", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0228", "f15216", "S#17969", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0228", "f15217", "S#17970", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0228", "f15219", "S#17971", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0228", "f15220", "S#17972", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0228", "f15218", "S#17973", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0228", "f15221", "S#17974", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0228", "f15222", "S#17975", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0228", "f15223", "S#17976", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0228", "f15224", "S#17977", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0228", "f15225", "S#13650", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0228", "f15226", "S#17978", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0228", "f15227", "S#17979", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0228", "f15228", "S#17302", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0228", "f15229", "NAUT-TO-NART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0228", "f15230", "S#16702", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15232() {
        $g2418$ = SubLFiles.deflexical("S#17980", Vectors.make_vector((SubLObject)$ic7$, (SubLObject)NIL));
        $g2419$ = SubLFiles.deflexical("S#17981", Vectors.make_vector((SubLObject)$ic7$, (SubLObject)NIL));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15233() {
        module0002.f35((SubLObject)$ic0$, (SubLObject)NIL);
        Structures.register_method($g2418$.getGlobalValue(), constant_handles_oc.$g1501$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic8$));
        Structures.register_method($g2418$.getGlobalValue(), module0167.$g2182$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic9$));
        Structures.register_method($g2418$.getGlobalValue(), Types.$dtp_cons$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic11$));
        Structures.register_method($g2419$.getGlobalValue(), constant_handles_oc.$g1501$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic12$));
        Structures.register_method($g2419$.getGlobalValue(), module0167.$g2182$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic13$));
        Structures.register_method($g2419$.getGlobalValue(), Types.$dtp_cons$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic15$));
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f15231();
    }
    
    public void initializeVariables() {
        f15232();
    }
    
    public void runTopLevelForms() {
        f15233();
    }
    
    static {
        me = (SubLFile)new module0228();
        $g2418$ = null;
        $g2419$ = null;
        $ic0$ = makeSymbol("TERM-OF-UNIT");
        $ic1$ = makeSymbol("NART-P");
        $ic2$ = makeSymbol("S#12276", "CYC");
        $ic3$ = constant_handles_oc.f8479((SubLObject)makeString("termOfUnit"));
        $ic4$ = makeKeyword("GAF");
        $ic5$ = makeSymbol("S#12274", "CYC");
        $ic6$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic7$ = makeInteger(256);
        $ic8$ = makeSymbol("S#17966", "CYC");
        $ic9$ = makeSymbol("S#17967", "CYC");
        $ic10$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("S#105", "CYC"));
        $ic11$ = makeSymbol("S#17969", "CYC");
        $ic12$ = makeSymbol("S#17974", "CYC");
        $ic13$ = makeSymbol("S#17975", "CYC");
        $ic14$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#17572", "CYC"), (SubLObject)makeSymbol("S#105", "CYC"));
        $ic15$ = makeSymbol("S#17977", "CYC");
        $ic16$ = makeSymbol("FORT-P");
        $ic17$ = makeSymbol("INTEGERP");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 174 ms
	
	Decompiled with Procyon 0.5.32.
*/