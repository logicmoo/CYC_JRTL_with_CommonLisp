package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0633 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0633";
    public static final String myFingerPrint = "b5fefdb14ffa622d0bfec8ec609126e039667a3e232c1704c0cda64490bcf93c";
    public static SubLSymbol $g4938$;
    public static SubLSymbol $g4939$;
    public static SubLSymbol $g4940$;
    public static SubLSymbol $g4941$;
    public static SubLSymbol $g4942$;
    private static SubLSymbol $g4943$;
    private static SubLSymbol $g4944$;
    private static final SubLString $ic0$;
    private static final SubLString $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLObject $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLObject $ic16$;
    private static final SubLList $ic17$;
    private static final SubLObject $ic18$;
    private static final SubLObject $ic19$;
    private static final SubLObject $ic20$;
    private static final SubLObject $ic21$;
    private static final SubLObject $ic22$;
    private static final SubLObject $ic23$;
    private static final SubLObject $ic24$;
    private static final SubLObject $ic25$;
    private static final SubLObject $ic26$;
    private static final SubLList $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLObject $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLObject $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLString $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLString $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLObject $ic40$;
    private static final SubLObject $ic41$;
    private static final SubLObject $ic42$;
    private static final SubLObject $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLString $ic47$;
    private static final SubLString $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLString $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLString $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLString $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLString $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLString $ic65$;
    private static final SubLObject $ic66$;
    private static final SubLString $ic67$;
    private static final SubLString $ic68$;
    private static final SubLList $ic69$;
    private static final SubLString $ic70$;
    private static final SubLString $ic71$;
    private static final SubLString $ic72$;
    private static final SubLString $ic73$;
    private static final SubLString $ic74$;
    private static final SubLString $ic75$;
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLString $ic78$;
    private static final SubLObject $ic79$;
    private static final SubLObject $ic80$;
    private static final SubLObject $ic81$;
    private static final SubLObject $ic82$;
    private static final SubLObject $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLObject $ic89$;
    private static final SubLString $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLList $ic94$;
    
    public static SubLObject f38711() {
        module0631.f38678();
        return (SubLObject)module0633.T;
    }
    
    public static SubLObject f38712() {
        if (module0633.NIL != module0035.f2370((SubLObject)module0633.$ic3$, module0633.$g4943$.getGlobalValue(), (SubLObject)module0633.UNPROVIDED)) {
            module0131.f8585();
        }
        else {
            module0131.f8586();
        }
        return module0131.f8584();
    }
    
    public static SubLObject f38713(final SubLObject var1, SubLObject var2) {
        if (var2 == module0633.UNPROVIDED) {
            var2 = module0632.f38705();
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0633.NIL != module0426.f30110(var1)) {
            return var1;
        }
        assert module0633.NIL != module0173.f10955(var1) : var1;
        SubLObject var4 = (SubLObject)module0633.NIL;
        final SubLObject var5 = module0147.f9540(var2);
        final SubLObject var6 = module0147.$g2095$.currentBinding(var3);
        final SubLObject var7 = module0147.$g2094$.currentBinding(var3);
        final SubLObject var8 = module0147.$g2096$.currentBinding(var3);
        try {
            module0147.$g2095$.bind(module0147.f9545(var5), var3);
            module0147.$g2094$.bind(module0147.f9546(var5), var3);
            module0147.$g2096$.bind(module0147.f9549(var5), var3);
            var4 = module0220.f14553(var1, module0633.$ic5$, (SubLObject)module0633.ONE_INTEGER, (SubLObject)module0633.TWO_INTEGER, (SubLObject)module0633.$ic6$);
        }
        finally {
            module0147.$g2096$.rebind(var8, var3);
            module0147.$g2094$.rebind(var7, var3);
            module0147.$g2095$.rebind(var6, var3);
        }
        return var4;
    }
    
    public static SubLObject f38714(final SubLObject var9, SubLObject var2) {
        if (var2 == module0633.UNPROVIDED) {
            var2 = module0632.f38705();
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        if (module0633.NIL != module0426.f30110(var9)) {
            return var9;
        }
        assert module0633.NIL != module0423.f29532(var9) : var9;
        SubLObject var11 = (SubLObject)module0633.NIL;
        final SubLObject var12 = module0147.f9540(var2);
        final SubLObject var13 = module0147.$g2095$.currentBinding(var10);
        final SubLObject var14 = module0147.$g2094$.currentBinding(var10);
        final SubLObject var15 = module0147.$g2096$.currentBinding(var10);
        try {
            module0147.$g2095$.bind(module0147.f9545(var12), var10);
            module0147.$g2094$.bind(module0147.f9546(var12), var10);
            module0147.$g2096$.bind(module0147.f9549(var12), var10);
            var11 = module0220.f14562(var9, module0633.$ic5$, (SubLObject)module0633.TWO_INTEGER, (SubLObject)module0633.ONE_INTEGER, (SubLObject)module0633.$ic6$);
        }
        finally {
            module0147.$g2096$.rebind(var15, var10);
            module0147.$g2094$.rebind(var14, var10);
            module0147.$g2095$.rebind(var13, var10);
        }
        return var11;
    }
    
    public static SubLObject f38715() {
        return (SubLObject)module0633.NIL;
    }
    
    public static SubLObject f38716(final SubLObject var10, SubLObject var2) {
        if (var2 == module0633.UNPROVIDED) {
            var2 = module0632.f38705();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean((module0633.NIL != module0131.f8584() && module0633.NIL != module0173.f10955(var10) && module0633.NIL != module0259.f16854(var10, module0633.$ic8$, var2, (SubLObject)module0633.UNPROVIDED)) || module0633.NIL != module0426.f30110(var10));
    }
    
    public static SubLObject f38717(final SubLObject var10) {
        return (SubLObject)SubLObjectFactory.makeBoolean((module0633.NIL != module0131.f8584() && module0633.NIL != module0173.f10955(var10) && module0633.NIL != module0259.f16891(var10, module0633.$ic9$)) || module0633.NIL != module0426.f30110(var10));
    }
    
    public static SubLObject f38718(final SubLObject var10, SubLObject var2) {
        if (var2 == module0633.UNPROVIDED) {
            var2 = module0632.f38705();
        }
        if (module0633.NIL != module0131.f8584() && module0633.NIL != module0173.f10955(var10)) {
            return module0259.f16854(var10, module0633.$ic10$, var2, (SubLObject)module0633.UNPROVIDED);
        }
        return (SubLObject)module0633.NIL;
    }
    
    public static SubLObject f38719(final SubLObject var11, SubLObject var2) {
        if (var2 == module0633.UNPROVIDED) {
            var2 = module0632.f38705();
        }
        assert module0633.NIL != module0173.f10955(var11) : var11;
        final SubLObject var12 = module0220.f14566(var11, module0633.$ic11$, var2, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED);
        return module0035.remove_if_not(Symbols.symbol_function((SubLObject)module0633.$ic12$), var12, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED);
    }
    
    public static SubLObject f38720(final SubLObject var11, SubLObject var2) {
        if (var2 == module0633.UNPROVIDED) {
            var2 = module0632.f38705();
        }
        assert module0633.NIL != module0173.f10955(var11) : var11;
        return module0220.f14566(var11, module0633.$ic13$, var2, (SubLObject)module0633.ONE_INTEGER, (SubLObject)module0633.TWO_INTEGER, (SubLObject)module0633.$ic6$);
    }
    
    public static SubLObject f38721(final SubLObject var12, SubLObject var2) {
        if (var2 == module0633.UNPROVIDED) {
            var2 = module0632.f38705();
        }
        assert module0633.NIL != module0269.f17710(var12) : var12;
        return module0259.f16848(var12, var2, (SubLObject)module0633.UNPROVIDED);
    }
    
    public static SubLObject f38722(final SubLObject var11, SubLObject var2) {
        if (var2 == module0633.UNPROVIDED) {
            var2 = module0632.f38707((SubLObject)module0633.UNPROVIDED);
        }
        assert module0633.NIL != module0173.f10955(var11) : var11;
        return module0434.f30579((SubLObject)module0633.$ic15$, (SubLObject)ConsesLow.listS(module0633.$ic16$, var11, (SubLObject)module0633.$ic17$), var2, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED);
    }
    
    public static SubLObject f38723(final SubLObject var12, SubLObject var2) {
        if (var2 == module0633.UNPROVIDED) {
            var2 = module0632.f38707((SubLObject)module0633.UNPROVIDED);
        }
        assert module0633.NIL != module0173.f10955(var12) : var12;
        return module0434.f30579((SubLObject)module0633.$ic15$, (SubLObject)ConsesLow.listS(module0633.$ic18$, var12, (SubLObject)module0633.$ic17$), var2, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED);
    }
    
    public static SubLObject f38724(final SubLObject var11, SubLObject var2) {
        if (var2 == module0633.UNPROVIDED) {
            var2 = module0632.f38705();
        }
        if (module0633.NIL != module0426.f30110(var11)) {
            return (SubLObject)module0633.NIL;
        }
        assert module0633.NIL != module0173.f10955(var11) : var11;
        return module0220.f14566(var11, module0633.$ic19$, var2, (SubLObject)module0633.ONE_INTEGER, (SubLObject)module0633.TWO_INTEGER, (SubLObject)module0633.$ic6$);
    }
    
    public static SubLObject f38725(final SubLObject var11, SubLObject var2) {
        if (var2 == module0633.UNPROVIDED) {
            var2 = module0632.f38705();
        }
        assert module0633.NIL != module0173.f10955(var11) : var11;
        return module0220.f14554(var11, module0633.$ic20$, var2, (SubLObject)module0633.ONE_INTEGER, (SubLObject)module0633.TWO_INTEGER, (SubLObject)module0633.$ic6$);
    }
    
    public static SubLObject f38726(final SubLObject var11, SubLObject var2) {
        if (var2 == module0633.UNPROVIDED) {
            var2 = module0632.f38705();
        }
        assert module0633.NIL != module0173.f10955(var11) : var11;
        return module0205.f13304(f38725(var11, var2), (SubLObject)module0633.UNPROVIDED);
    }
    
    public static SubLObject f38727(final SubLObject var11, SubLObject var2) {
        if (var2 == module0633.UNPROVIDED) {
            var2 = module0632.f38705();
        }
        assert module0633.NIL != module0173.f10955(var11) : var11;
        return module0220.f14563(var11, module0633.$ic21$, var2, (SubLObject)module0633.ONE_INTEGER, (SubLObject)module0633.TWO_INTEGER, (SubLObject)module0633.$ic6$);
    }
    
    public static SubLObject f38728(final SubLObject var11, SubLObject var2) {
        if (var2 == module0633.UNPROVIDED) {
            var2 = module0632.f38705();
        }
        assert module0633.NIL != module0173.f10955(var11) : var11;
        return module0220.f14563(var11, module0633.$ic22$, var2, (SubLObject)module0633.ONE_INTEGER, (SubLObject)module0633.TWO_INTEGER, (SubLObject)module0633.$ic6$);
    }
    
    public static SubLObject f38729(final SubLObject var11, SubLObject var2) {
        if (var2 == module0633.UNPROVIDED) {
            var2 = module0632.f38705();
        }
        assert module0633.NIL != module0173.f10955(var11) : var11;
        return module0035.sublisp_boolean(module0220.f14545(var11, module0633.$ic23$, var2, (SubLObject)module0633.ONE_INTEGER, (SubLObject)module0633.$ic6$));
    }
    
    public static SubLObject f38730(final SubLObject var11, SubLObject var2) {
        if (var2 == module0633.UNPROVIDED) {
            var2 = module0632.f38705();
        }
        assert module0633.NIL != module0173.f10955(var11) : var11;
        return module0220.f14554(var11, module0633.$ic24$, var2, (SubLObject)module0633.ONE_INTEGER, (SubLObject)module0633.TWO_INTEGER, (SubLObject)module0633.$ic6$);
    }
    
    public static SubLObject f38731(final SubLObject var11, SubLObject var2) {
        if (var2 == module0633.UNPROVIDED) {
            var2 = module0632.f38705();
        }
        assert module0633.NIL != module0173.f10955(var11) : var11;
        return module0220.f14554(var11, module0633.$ic25$, var2, (SubLObject)module0633.ONE_INTEGER, (SubLObject)module0633.TWO_INTEGER, (SubLObject)module0633.$ic6$);
    }
    
    public static SubLObject f38732(final SubLObject var11, SubLObject var2) {
        if (var2 == module0633.UNPROVIDED) {
            var2 = module0632.f38705();
        }
        assert module0633.NIL != module0173.f10955(var11) : var11;
        return module0220.f14554(var11, module0633.$ic26$, var2, (SubLObject)module0633.ONE_INTEGER, (SubLObject)module0633.TWO_INTEGER, (SubLObject)module0633.$ic6$);
    }
    
    public static SubLObject f38733(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        SubLObject var13 = (SubLObject)module0633.NIL;
        SubLObject var14 = (SubLObject)module0633.NIL;
        final SubLObject var15 = (SubLObject)module0633.$ic27$;
        final SubLObject var16 = module0147.$g2094$.currentBinding(var12);
        final SubLObject var17 = module0147.$g2095$.currentBinding(var12);
        try {
            module0147.$g2094$.bind((SubLObject)module0633.$ic28$, var12);
            module0147.$g2095$.bind(module0633.$ic29$, var12);
            SubLObject var18 = var15;
            SubLObject var19 = (SubLObject)module0633.NIL;
            var19 = var18.first();
            while (module0633.NIL != var18) {
                final SubLObject var20 = var19;
                if (module0633.NIL != module0158.f10010(var11, (SubLObject)module0633.ONE_INTEGER, var20)) {
                    final SubLObject var21 = module0158.f10011(var11, (SubLObject)module0633.ONE_INTEGER, var20);
                    SubLObject var22 = (SubLObject)module0633.NIL;
                    final SubLObject var23 = (SubLObject)module0633.NIL;
                    while (module0633.NIL == var22) {
                        final SubLObject var24 = module0052.f3695(var21, var23);
                        final SubLObject var25 = (SubLObject)SubLObjectFactory.makeBoolean(!var23.eql(var24));
                        if (module0633.NIL != var25) {
                            SubLObject var26 = (SubLObject)module0633.NIL;
                            try {
                                var26 = module0158.f10316(var24, (SubLObject)module0633.$ic30$, (SubLObject)module0633.$ic6$, (SubLObject)module0633.NIL);
                                SubLObject var19_24 = (SubLObject)module0633.NIL;
                                final SubLObject var20_25 = (SubLObject)module0633.NIL;
                                while (module0633.NIL == var19_24) {
                                    final SubLObject var27 = module0052.f3695(var26, var20_25);
                                    final SubLObject var22_27 = (SubLObject)SubLObjectFactory.makeBoolean(!var20_25.eql(var27));
                                    if (module0633.NIL != var22_27) {
                                        final SubLObject var28 = module0178.f11287(var27);
                                        final SubLObject var30;
                                        final SubLObject var29 = var30 = module0161.f10557(var28);
                                        if (module0633.NIL == conses_high.member(var30, var13, Symbols.symbol_function((SubLObject)module0633.EQL), Symbols.symbol_function((SubLObject)module0633.IDENTITY))) {
                                            var13 = (SubLObject)ConsesLow.cons(var30, var13);
                                        }
                                    }
                                    var19_24 = (SubLObject)SubLObjectFactory.makeBoolean(module0633.NIL == var22_27);
                                }
                            }
                            finally {
                                final SubLObject var6_30 = Threads.$is_thread_performing_cleanupP$.currentBinding(var12);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0633.T, var12);
                                    if (module0633.NIL != var26) {
                                        module0158.f10319(var26);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var6_30, var12);
                                }
                            }
                        }
                        var22 = (SubLObject)SubLObjectFactory.makeBoolean(module0633.NIL == var25);
                    }
                }
                var18 = var18.rest();
                var19 = var18.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var17, var12);
            module0147.$g2094$.rebind(var16, var12);
        }
        var14 = module0262.f17370(var13, var13, (SubLObject)module0633.UNPROVIDED);
        if (module0633.NIL != module0035.f1997(var14)) {
            return var14.first();
        }
        return module0633.$ic31$;
    }
    
    public static SubLObject f38734(final SubLObject var11) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0633.NIL == f38735(var11) && module0633.$ic32$ != f38736(var11));
    }
    
    public static SubLObject f38735(final SubLObject var11) {
        if (module0633.NIL != f38716(var11, (SubLObject)module0633.UNPROVIDED)) {
            final SubLObject var12 = f38713(var11, (SubLObject)module0633.UNPROVIDED);
            if (module0633.NIL != var12) {
                return module0423.f29594(var12);
            }
        }
        return (SubLObject)module0633.NIL;
    }
    
    public static SubLObject f38736(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        if (module0633.NIL != module0426.f30110(var11)) {
            return Values.values((SubLObject)module0633.NIL, (SubLObject)module0633.NIL, (SubLObject)module0633.NIL);
        }
        SubLObject var13 = (SubLObject)module0633.NIL;
        SubLObject var14 = (SubLObject)module0633.$ic33$;
        SubLObject var15 = (SubLObject)module0633.NIL;
        if (module0633.NIL == f38716(var11, (SubLObject)module0633.UNPROVIDED)) {
            var14 = PrintLow.format((SubLObject)module0633.NIL, (SubLObject)module0633.$ic34$, var11);
            var15 = (SubLObject)ConsesLow.cons((SubLObject)module0633.$ic35$, var15);
            return Values.values((SubLObject)module0633.$ic32$, var14, Sequences.nreverse(var15));
        }
        final SubLObject var16 = f38713(var11, (SubLObject)module0633.UNPROVIDED);
        if (module0633.NIL == module0423.f29532(var16)) {
            var14 = PrintLow.format((SubLObject)module0633.NIL, (SubLObject)module0633.$ic36$, var11);
            var15 = (SubLObject)ConsesLow.cons((SubLObject)module0633.$ic37$, var15);
            return Values.values((SubLObject)module0633.$ic32$, var14, Sequences.nreverse(var15));
        }
        var12.resetMultipleValues();
        final SubLObject var17 = module0423.f29595(var16, var11);
        final SubLObject var18 = var12.secondMultipleValue();
        final SubLObject var19 = var12.thirdMultipleValue();
        var12.resetMultipleValues();
        if (module0633.NIL != var17) {
            var13 = var17;
            var14 = var18;
            var15 = ConsesLow.append(var19, var15);
        }
        if (module0633.NIL != module0423.f29582(var11)) {
            if (module0633.NIL == Functions.funcall((SubLObject)SubLObjectFactory.makeSymbol("S#32766", "CYC"), var11)) {
                var13 = (SubLObject)module0633.$ic32$;
                var14 = Sequences.cconcatenate(var14, Sequences.cconcatenate(module0006.$g11$.getGlobalValue(), new SubLObject[] { module0006.f203(var11), module0633.$ic38$ }));
                var15 = (SubLObject)ConsesLow.cons((SubLObject)module0633.$ic39$, var15);
            }
        }
        else {
            final SubLObject var20 = f38725(var11, module0632.f38705());
            final SubLObject var21 = f38729(var11, module0632.f38705());
            final SubLObject var22 = f38727(var11, module0632.f38705());
            final SubLObject var23 = f38728(var11, module0632.f38705());
            final SubLObject var24 = f38730(var11, module0632.f38705());
            final SubLObject var25 = f38731(var11, module0632.f38705());
            final SubLObject var26 = f38732(var11, module0632.f38705());
            final SubLObject var27 = module0220.f14563(var11, module0633.$ic40$, module0632.f38705(), (SubLObject)module0633.ONE_INTEGER, (SubLObject)module0633.TWO_INTEGER, (SubLObject)module0633.UNPROVIDED);
            final SubLObject var28 = module0220.f14563(var11, module0633.$ic41$, module0632.f38705(), (SubLObject)module0633.ONE_INTEGER, (SubLObject)module0633.TWO_INTEGER, (SubLObject)module0633.UNPROVIDED);
            final SubLObject var29 = module0220.f14563(var11, module0633.$ic42$, module0632.f38705(), (SubLObject)module0633.ONE_INTEGER, (SubLObject)module0633.TWO_INTEGER, (SubLObject)module0633.UNPROVIDED);
            final SubLObject var30 = module0220.f14563(var11, module0633.$ic43$, module0632.f38705(), (SubLObject)module0633.ONE_INTEGER, (SubLObject)module0633.TWO_INTEGER, (SubLObject)module0633.UNPROVIDED);
            SubLObject var31 = (SubLObject)module0633.NIL;
            SubLObject var32 = (SubLObject)module0633.NIL;
            SubLObject var33 = (SubLObject)module0633.NIL;
            if (module0633.NIL == var20 && module0633.NIL == var21 && module0633.NIL == var22 && module0633.NIL == var23 && module0633.NIL == var24 && module0633.NIL == var25 && module0633.NIL == var26 && module0633.NIL == var27 && module0633.NIL == var28 && module0633.NIL == var29 && module0633.NIL == var30) {
                var13 = (SubLObject)module0633.$ic32$;
                var14 = Sequences.cconcatenate(var14, PrintLow.format((SubLObject)module0633.NIL, (SubLObject)module0633.$ic44$, var11));
                var15 = (SubLObject)ConsesLow.cons((SubLObject)module0633.$ic39$, var15);
            }
            SubLObject var34 = module0205.f13304(var20, (SubLObject)module0633.UNPROVIDED);
            SubLObject var35 = (SubLObject)module0633.NIL;
            var35 = var34.first();
            while (module0633.NIL != var34) {
                if (module0633.NIL == module0233.f15359(var35)) {
                    var31 = (SubLObject)ConsesLow.cons(var35, var31);
                }
                var34 = var34.rest();
                var35 = var34.first();
            }
            if (module0633.NIL != var31) {
                var13 = (SubLObject)module0633.$ic32$;
                var14 = Sequences.cconcatenate(var14, PrintLow.format((SubLObject)module0633.NIL, (SubLObject)module0633.$ic45$, var11));
                var15 = (SubLObject)ConsesLow.cons((SubLObject)module0633.$ic46$, var15);
                var34 = var31;
                SubLObject var36 = (SubLObject)module0633.NIL;
                var36 = var34.first();
                while (module0633.NIL != var34) {
                    var14 = Sequences.cconcatenate(var14, PrintLow.format((SubLObject)module0633.NIL, (SubLObject)module0633.$ic47$, var36));
                    var34 = var34.rest();
                    var36 = var34.first();
                }
            }
            var34 = var22;
            var35 = (SubLObject)module0633.NIL;
            var35 = var34.first();
            while (module0633.NIL != var34) {
                if (module0633.NIL == module0233.f15359(var35)) {
                    var32 = (SubLObject)ConsesLow.cons(var35, var32);
                }
                var34 = var34.rest();
                var35 = var34.first();
            }
            if (module0633.NIL != var32) {
                var13 = (SubLObject)module0633.$ic32$;
                var14 = Sequences.cconcatenate(var14, PrintLow.format((SubLObject)module0633.NIL, (SubLObject)module0633.$ic48$, var11));
                var15 = (SubLObject)ConsesLow.cons((SubLObject)module0633.$ic49$, var15);
                var34 = var32;
                SubLObject var36 = (SubLObject)module0633.NIL;
                var36 = var34.first();
                while (module0633.NIL != var34) {
                    var14 = Sequences.cconcatenate(var14, PrintLow.format((SubLObject)module0633.NIL, (SubLObject)module0633.$ic47$, var36));
                    var34 = var34.rest();
                    var36 = var34.first();
                }
            }
            var34 = var23;
            var35 = (SubLObject)module0633.NIL;
            var35 = var34.first();
            while (module0633.NIL != var34) {
                if (module0633.NIL == module0233.f15359(var35)) {
                    var33 = (SubLObject)ConsesLow.cons(var35, var33);
                }
                var34 = var34.rest();
                var35 = var34.first();
            }
            if (module0633.NIL != var33) {
                var13 = (SubLObject)module0633.$ic32$;
                var14 = Sequences.cconcatenate(var14, PrintLow.format((SubLObject)module0633.NIL, (SubLObject)module0633.$ic50$, var11));
                var15 = (SubLObject)ConsesLow.cons((SubLObject)module0633.$ic51$, var15);
                var34 = var33;
                SubLObject var36 = (SubLObject)module0633.NIL;
                var36 = var34.first();
                while (module0633.NIL != var34) {
                    var14 = Sequences.cconcatenate(var14, PrintLow.format((SubLObject)module0633.NIL, (SubLObject)module0633.$ic47$, var36));
                    var34 = var34.rest();
                    var36 = var34.first();
                }
            }
        }
        final SubLObject var37 = f38722(var11, (SubLObject)module0633.UNPROVIDED);
        if (module0633.NIL == var37) {
            if (var13 != module0633.$ic32$) {
                var13 = (SubLObject)module0633.$ic52$;
            }
            var14 = Sequences.cconcatenate(var14, PrintLow.format((SubLObject)module0633.NIL, (SubLObject)module0633.$ic53$, var11));
            var15 = (SubLObject)ConsesLow.cons((SubLObject)module0633.$ic54$, var15);
        }
        return Values.values(var13, var14, Sequences.nreverse(var15));
    }
    
    public static SubLObject f38737() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0067.f4880(Symbols.symbol_function((SubLObject)module0633.EQUAL), (SubLObject)module0633.UNPROVIDED);
        final SubLObject var5 = module0147.$g2094$.currentBinding(var3);
        final SubLObject var6 = module0147.$g2095$.currentBinding(var3);
        try {
            module0147.$g2094$.bind((SubLObject)module0633.$ic28$, var3);
            module0147.$g2095$.bind(module0633.$ic29$, var3);
            final SubLObject var7 = module0633.$ic8$;
            final SubLObject var6_55 = module0137.$g1605$.currentBinding(var3);
            final SubLObject var7_56 = module0139.$g1636$.currentBinding(var3);
            try {
                module0137.$g1605$.bind(module0137.f8955(module0633.$ic11$), var3);
                module0139.$g1636$.bind(module0139.f9007(), var3);
                SubLObject var57_58 = var7;
                final SubLObject var8 = (SubLObject)module0633.$ic57$;
                final SubLObject var9 = module0056.f4145(var8);
                final SubLObject var6_56 = module0139.$g1635$.currentBinding(var3);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var3);
                    final SubLObject var10 = (SubLObject)module0633.NIL;
                    final SubLObject var6_57 = module0141.$g1714$.currentBinding(var3);
                    final SubLObject var7_57 = module0141.$g1715$.currentBinding(var3);
                    try {
                        module0141.$g1714$.bind((module0633.NIL != var10) ? var10 : module0141.f9283(), var3);
                        module0141.$g1715$.bind((SubLObject)((module0633.NIL != var10) ? module0633.$ic58$ : module0141.$g1715$.getDynamicValue(var3)), var3);
                        if (module0633.NIL != var10 && module0633.NIL != module0136.f8864() && module0633.NIL == module0141.f9279(var10)) {
                            final SubLObject var11 = module0136.$g1591$.getDynamicValue(var3);
                            if (var11.eql((SubLObject)module0633.$ic59$)) {
                                module0136.f8870((SubLObject)module0633.ONE_INTEGER, (SubLObject)module0633.$ic60$, var10, (SubLObject)module0633.$ic61$, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED);
                            }
                            else if (var11.eql((SubLObject)module0633.$ic62$)) {
                                module0136.f8871((SubLObject)module0633.ONE_INTEGER, (SubLObject)module0633.$ic63$, (SubLObject)module0633.$ic60$, var10, (SubLObject)module0633.$ic61$, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED);
                            }
                            else if (var11.eql((SubLObject)module0633.$ic64$)) {
                                Errors.warn((SubLObject)module0633.$ic60$, var10, (SubLObject)module0633.$ic61$);
                            }
                            else {
                                Errors.warn((SubLObject)module0633.$ic65$, module0136.$g1591$.getDynamicValue(var3));
                                Errors.cerror((SubLObject)module0633.$ic63$, (SubLObject)module0633.$ic60$, var10, (SubLObject)module0633.$ic61$);
                            }
                        }
                        final SubLObject var6_58 = module0141.$g1670$.currentBinding(var3);
                        final SubLObject var7_58 = module0141.$g1671$.currentBinding(var3);
                        final SubLObject var12 = module0141.$g1672$.currentBinding(var3);
                        final SubLObject var13 = module0141.$g1674$.currentBinding(var3);
                        final SubLObject var14 = module0137.$g1605$.currentBinding(var3);
                        try {
                            module0141.$g1670$.bind(module0244.f15771(module0137.f8955(module0633.$ic11$)), var3);
                            module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955(module0633.$ic11$))), var3);
                            module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955(module0633.$ic11$))), var3);
                            module0141.$g1674$.bind((SubLObject)module0633.NIL, var3);
                            module0137.$g1605$.bind(module0244.f15771(module0137.f8955(module0633.$ic11$)), var3);
                            if (module0633.NIL != module0136.f8865() || module0633.NIL != module0244.f15795(var7, module0137.f8955((SubLObject)module0633.UNPROVIDED))) {
                                final SubLObject var6_59 = module0141.$g1677$.currentBinding(var3);
                                final SubLObject var7_59 = module0138.$g1619$.currentBinding(var3);
                                final SubLObject var8_72 = module0141.$g1674$.currentBinding(var3);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var3);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955(module0633.$ic11$))), var3);
                                    module0141.$g1674$.bind((SubLObject)module0633.NIL, var3);
                                    module0249.f16055(var57_58, (SubLObject)module0633.UNPROVIDED);
                                    while (module0633.NIL != var57_58) {
                                        final SubLObject var15 = var57_58;
                                        SubLObject var17;
                                        final SubLObject var16 = var17 = module0200.f12443(module0137.f8955(module0633.$ic11$));
                                        SubLObject var18 = (SubLObject)module0633.NIL;
                                        var18 = var17.first();
                                        while (module0633.NIL != var17) {
                                            final SubLObject var6_60 = module0137.$g1605$.currentBinding(var3);
                                            final SubLObject var7_60 = module0141.$g1674$.currentBinding(var3);
                                            try {
                                                module0137.$g1605$.bind(var18, var3);
                                                module0141.$g1674$.bind((SubLObject)((module0633.NIL != module0141.f9205((SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0633.NIL == module0141.$g1674$.getDynamicValue(var3)) : module0141.$g1674$.getDynamicValue(var3)), var3);
                                                final SubLObject var19 = module0228.f15229(var15);
                                                if (module0633.NIL != module0138.f8992(var19)) {
                                                    final SubLObject var20 = module0242.f15664(var19, module0137.f8955((SubLObject)module0633.UNPROVIDED));
                                                    if (module0633.NIL != var20) {
                                                        final SubLObject var21 = module0245.f15834(var20, module0244.f15780(module0137.f8955(module0633.$ic11$)), module0137.f8955((SubLObject)module0633.UNPROVIDED));
                                                        if (module0633.NIL != var21) {
                                                            SubLObject var22;
                                                            for (var22 = module0066.f4838(module0067.f4891(var21)); module0633.NIL == module0066.f4841(var22); var22 = module0066.f4840(var22)) {
                                                                var3.resetMultipleValues();
                                                                final SubLObject var23 = module0066.f4839(var22);
                                                                final SubLObject var24 = var3.secondMultipleValue();
                                                                var3.resetMultipleValues();
                                                                if (module0633.NIL != module0147.f9507(var23)) {
                                                                    final SubLObject var6_61 = module0138.$g1623$.currentBinding(var3);
                                                                    try {
                                                                        module0138.$g1623$.bind(var23, var3);
                                                                        SubLObject var81_85;
                                                                        for (var81_85 = module0066.f4838(module0067.f4891(var24)); module0633.NIL == module0066.f4841(var81_85); var81_85 = module0066.f4840(var81_85)) {
                                                                            var3.resetMultipleValues();
                                                                            final SubLObject var25 = module0066.f4839(var81_85);
                                                                            final SubLObject var26 = var3.secondMultipleValue();
                                                                            var3.resetMultipleValues();
                                                                            if (module0633.NIL != module0141.f9289(var25)) {
                                                                                final SubLObject var6_62 = module0138.$g1624$.currentBinding(var3);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var25, var3);
                                                                                    final SubLObject var27 = var26;
                                                                                    if (module0633.NIL != module0077.f5302(var27)) {
                                                                                        final SubLObject var28 = module0077.f5333(var27);
                                                                                        SubLObject var29;
                                                                                        SubLObject var30;
                                                                                        SubLObject var31;
                                                                                        SubLObject var32;
                                                                                        SubLObject var33;
                                                                                        SubLObject var34;
                                                                                        SubLObject var35;
                                                                                        for (var29 = module0032.f1741(var28), var30 = (SubLObject)module0633.NIL, var30 = module0032.f1742(var29, var28); module0633.NIL == module0032.f1744(var29, var30); var30 = module0032.f1743(var30)) {
                                                                                            var31 = module0032.f1745(var29, var30);
                                                                                            if (module0633.NIL != module0032.f1746(var30, var31) && module0633.NIL == module0249.f16059(var31, module0139.$g1636$.getDynamicValue(var3))) {
                                                                                                module0249.f16055(var31, module0139.$g1636$.getDynamicValue(var3));
                                                                                                if (module0633.NIL != module0173.f10955(var31)) {
                                                                                                    var3.resetMultipleValues();
                                                                                                    var32 = f38736(var31);
                                                                                                    var33 = var3.secondMultipleValue();
                                                                                                    var34 = var3.thirdMultipleValue();
                                                                                                    var3.resetMultipleValues();
                                                                                                    if (module0633.$ic32$ == var32) {
                                                                                                        var35 = f38713(var31, (SubLObject)module0633.UNPROVIDED);
                                                                                                        if (module0633.NIL == module0259.f16867(var35, module0633.$ic66$, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED)) {
                                                                                                            var34 = Sequences.delete((SubLObject)module0633.$ic54$, var34, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED);
                                                                                                            module0084.f5762(var4, var34, var31);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var27.isList()) {
                                                                                        SubLObject var36 = var27;
                                                                                        SubLObject var37 = (SubLObject)module0633.NIL;
                                                                                        var37 = var36.first();
                                                                                        while (module0633.NIL != var36) {
                                                                                            if (module0633.NIL == module0249.f16059(var37, module0139.$g1636$.getDynamicValue(var3))) {
                                                                                                module0249.f16055(var37, module0139.$g1636$.getDynamicValue(var3));
                                                                                                if (module0633.NIL != module0173.f10955(var37)) {
                                                                                                    var3.resetMultipleValues();
                                                                                                    final SubLObject var38 = f38736(var37);
                                                                                                    final SubLObject var39 = var3.secondMultipleValue();
                                                                                                    SubLObject var40 = var3.thirdMultipleValue();
                                                                                                    var3.resetMultipleValues();
                                                                                                    if (module0633.$ic32$ == var38) {
                                                                                                        final SubLObject var41 = f38713(var37, (SubLObject)module0633.UNPROVIDED);
                                                                                                        if (module0633.NIL == module0259.f16867(var41, module0633.$ic66$, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED)) {
                                                                                                            var40 = Sequences.delete((SubLObject)module0633.$ic54$, var40, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED);
                                                                                                            module0084.f5762(var4, var40, var37);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            var36 = var36.rest();
                                                                                            var37 = var36.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0633.$ic67$, var27);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var6_62, var3);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var81_85);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var6_61, var3);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var22);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0633.FIVE_INTEGER, (SubLObject)module0633.$ic68$, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED);
                                                    }
                                                    if (module0633.NIL != module0200.f12419(var19, module0137.f8955((SubLObject)module0633.UNPROVIDED))) {
                                                        SubLObject var42 = module0248.f15995(var19);
                                                        SubLObject var43 = (SubLObject)module0633.NIL;
                                                        var43 = var42.first();
                                                        while (module0633.NIL != var42) {
                                                            SubLObject var45;
                                                            final SubLObject var44 = var45 = var43;
                                                            SubLObject var46 = (SubLObject)module0633.NIL;
                                                            SubLObject var47 = (SubLObject)module0633.NIL;
                                                            SubLObject var48 = (SubLObject)module0633.NIL;
                                                            cdestructuring_bind.destructuring_bind_must_consp(var45, var44, (SubLObject)module0633.$ic69$);
                                                            var46 = var45.first();
                                                            var45 = var45.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var45, var44, (SubLObject)module0633.$ic69$);
                                                            var47 = var45.first();
                                                            var45 = var45.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var45, var44, (SubLObject)module0633.$ic69$);
                                                            var48 = var45.first();
                                                            var45 = var45.rest();
                                                            if (module0633.NIL == var45) {
                                                                if (module0633.NIL != module0147.f9507(var47)) {
                                                                    final SubLObject var6_63 = module0138.$g1623$.currentBinding(var3);
                                                                    try {
                                                                        module0138.$g1623$.bind(var47, var3);
                                                                        if (module0633.NIL != module0141.f9289(var48)) {
                                                                            final SubLObject var6_64 = module0138.$g1624$.currentBinding(var3);
                                                                            try {
                                                                                module0138.$g1624$.bind(var48, var3);
                                                                                final SubLObject var27;
                                                                                final SubLObject var49 = var27 = (SubLObject)ConsesLow.list(var46);
                                                                                if (module0633.NIL != module0077.f5302(var27)) {
                                                                                    final SubLObject var28 = module0077.f5333(var27);
                                                                                    SubLObject var29;
                                                                                    SubLObject var30;
                                                                                    SubLObject var31;
                                                                                    SubLObject var32;
                                                                                    SubLObject var33;
                                                                                    SubLObject var34;
                                                                                    SubLObject var35;
                                                                                    for (var29 = module0032.f1741(var28), var30 = (SubLObject)module0633.NIL, var30 = module0032.f1742(var29, var28); module0633.NIL == module0032.f1744(var29, var30); var30 = module0032.f1743(var30)) {
                                                                                        var31 = module0032.f1745(var29, var30);
                                                                                        if (module0633.NIL != module0032.f1746(var30, var31) && module0633.NIL == module0249.f16059(var31, module0139.$g1636$.getDynamicValue(var3))) {
                                                                                            module0249.f16055(var31, module0139.$g1636$.getDynamicValue(var3));
                                                                                            if (module0633.NIL != module0173.f10955(var31)) {
                                                                                                var3.resetMultipleValues();
                                                                                                var32 = f38736(var31);
                                                                                                var33 = var3.secondMultipleValue();
                                                                                                var34 = var3.thirdMultipleValue();
                                                                                                var3.resetMultipleValues();
                                                                                                if (module0633.$ic32$ == var32) {
                                                                                                    var35 = f38713(var31, (SubLObject)module0633.UNPROVIDED);
                                                                                                    if (module0633.NIL == module0259.f16867(var35, module0633.$ic66$, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED)) {
                                                                                                        var34 = Sequences.delete((SubLObject)module0633.$ic54$, var34, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED);
                                                                                                        module0084.f5762(var4, var34, var31);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var27.isList()) {
                                                                                    SubLObject var98_107 = var27;
                                                                                    SubLObject var37 = (SubLObject)module0633.NIL;
                                                                                    var37 = var98_107.first();
                                                                                    while (module0633.NIL != var98_107) {
                                                                                        if (module0633.NIL == module0249.f16059(var37, module0139.$g1636$.getDynamicValue(var3))) {
                                                                                            module0249.f16055(var37, module0139.$g1636$.getDynamicValue(var3));
                                                                                            if (module0633.NIL != module0173.f10955(var37)) {
                                                                                                var3.resetMultipleValues();
                                                                                                final SubLObject var38 = f38736(var37);
                                                                                                final SubLObject var39 = var3.secondMultipleValue();
                                                                                                SubLObject var40 = var3.thirdMultipleValue();
                                                                                                var3.resetMultipleValues();
                                                                                                if (module0633.$ic32$ == var38) {
                                                                                                    final SubLObject var41 = f38713(var37, (SubLObject)module0633.UNPROVIDED);
                                                                                                    if (module0633.NIL == module0259.f16867(var41, module0633.$ic66$, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED)) {
                                                                                                        var40 = Sequences.delete((SubLObject)module0633.$ic54$, var40, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED);
                                                                                                        module0084.f5762(var4, var40, var37);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        var98_107 = var98_107.rest();
                                                                                        var37 = var98_107.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)module0633.$ic67$, var27);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var6_64, var3);
                                                                            }
                                                                        }
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var6_63, var3);
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                cdestructuring_bind.cdestructuring_bind_error(var44, (SubLObject)module0633.$ic69$);
                                                            }
                                                            var42 = var42.rest();
                                                            var43 = var42.first();
                                                        }
                                                    }
                                                }
                                                else if (module0633.NIL != module0155.f9785(var19, (SubLObject)module0633.UNPROVIDED)) {
                                                    SubLObject var15_109;
                                                    final SubLObject var50 = var15_109 = ((module0633.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955(module0633.$ic11$)), module0141.$g1714$.getDynamicValue(var3), module0137.f8955((SubLObject)module0633.UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955(module0633.$ic11$)), module0141.$g1714$.getDynamicValue(var3), module0137.f8955((SubLObject)module0633.UNPROVIDED)));
                                                    SubLObject var51 = (SubLObject)module0633.NIL;
                                                    var51 = var15_109.first();
                                                    while (module0633.NIL != var15_109) {
                                                        final SubLObject var6_65 = module0138.$g1625$.currentBinding(var3);
                                                        try {
                                                            module0138.$g1625$.bind(var51, var3);
                                                            final SubLObject var53;
                                                            final SubLObject var52 = var53 = Functions.funcall(var51, var19);
                                                            if (module0633.NIL != module0077.f5302(var53)) {
                                                                final SubLObject var54 = module0077.f5333(var53);
                                                                SubLObject var55;
                                                                SubLObject var56;
                                                                SubLObject var57;
                                                                SubLObject var58;
                                                                SubLObject var59;
                                                                SubLObject var60;
                                                                SubLObject var61;
                                                                for (var55 = module0032.f1741(var54), var56 = (SubLObject)module0633.NIL, var56 = module0032.f1742(var55, var54); module0633.NIL == module0032.f1744(var55, var56); var56 = module0032.f1743(var56)) {
                                                                    var57 = module0032.f1745(var55, var56);
                                                                    if (module0633.NIL != module0032.f1746(var56, var57) && module0633.NIL == module0249.f16059(var57, module0139.$g1636$.getDynamicValue(var3))) {
                                                                        module0249.f16055(var57, module0139.$g1636$.getDynamicValue(var3));
                                                                        if (module0633.NIL != module0173.f10955(var57)) {
                                                                            var3.resetMultipleValues();
                                                                            var58 = f38736(var57);
                                                                            var59 = var3.secondMultipleValue();
                                                                            var60 = var3.thirdMultipleValue();
                                                                            var3.resetMultipleValues();
                                                                            if (module0633.$ic32$ == var58) {
                                                                                var61 = f38713(var57, (SubLObject)module0633.UNPROVIDED);
                                                                                if (module0633.NIL == module0259.f16867(var61, module0633.$ic66$, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED)) {
                                                                                    var60 = Sequences.delete((SubLObject)module0633.$ic54$, var60, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED);
                                                                                    module0084.f5762(var4, var60, var57);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            else if (var53.isList()) {
                                                                SubLObject var62 = var53;
                                                                SubLObject var63 = (SubLObject)module0633.NIL;
                                                                var63 = var62.first();
                                                                while (module0633.NIL != var62) {
                                                                    if (module0633.NIL == module0249.f16059(var63, module0139.$g1636$.getDynamicValue(var3))) {
                                                                        module0249.f16055(var63, module0139.$g1636$.getDynamicValue(var3));
                                                                        if (module0633.NIL != module0173.f10955(var63)) {
                                                                            var3.resetMultipleValues();
                                                                            final SubLObject var64 = f38736(var63);
                                                                            final SubLObject var65 = var3.secondMultipleValue();
                                                                            SubLObject var66 = var3.thirdMultipleValue();
                                                                            var3.resetMultipleValues();
                                                                            if (module0633.$ic32$ == var64) {
                                                                                final SubLObject var67 = f38713(var63, (SubLObject)module0633.UNPROVIDED);
                                                                                if (module0633.NIL == module0259.f16867(var67, module0633.$ic66$, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED)) {
                                                                                    var66 = Sequences.delete((SubLObject)module0633.$ic54$, var66, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED);
                                                                                    module0084.f5762(var4, var66, var63);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    var62 = var62.rest();
                                                                    var63 = var62.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0633.$ic67$, var53);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var6_65, var3);
                                                        }
                                                        var15_109 = var15_109.rest();
                                                        var51 = var15_109.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var7_60, var3);
                                                module0137.$g1605$.rebind(var6_60, var3);
                                            }
                                            var17 = var17.rest();
                                            var18 = var17.first();
                                        }
                                        SubLObject var69;
                                        final SubLObject var68 = var69 = module0200.f12443(module0244.f15771(module0137.f8955(module0633.$ic11$)));
                                        SubLObject var70 = (SubLObject)module0633.NIL;
                                        var70 = var69.first();
                                        while (module0633.NIL != var69) {
                                            final SubLObject var6_66 = module0137.$g1605$.currentBinding(var3);
                                            final SubLObject var7_61 = module0141.$g1674$.currentBinding(var3);
                                            try {
                                                module0137.$g1605$.bind(var70, var3);
                                                module0141.$g1674$.bind((SubLObject)((module0633.NIL != module0141.f9205((SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0633.NIL == module0141.$g1674$.getDynamicValue(var3)) : module0141.$g1674$.getDynamicValue(var3)), var3);
                                                final SubLObject var71 = module0228.f15229(var57_58);
                                                if (module0633.NIL != module0138.f8992(var71)) {
                                                    final SubLObject var72 = module0242.f15664(var71, module0137.f8955((SubLObject)module0633.UNPROVIDED));
                                                    if (module0633.NIL != var72) {
                                                        final SubLObject var73 = module0245.f15834(var72, module0138.f8979(), module0137.f8955((SubLObject)module0633.UNPROVIDED));
                                                        if (module0633.NIL != var73) {
                                                            SubLObject var74;
                                                            for (var74 = module0066.f4838(module0067.f4891(var73)); module0633.NIL == module0066.f4841(var74); var74 = module0066.f4840(var74)) {
                                                                var3.resetMultipleValues();
                                                                final SubLObject var75 = module0066.f4839(var74);
                                                                final SubLObject var76 = var3.secondMultipleValue();
                                                                var3.resetMultipleValues();
                                                                if (module0633.NIL != module0147.f9507(var75)) {
                                                                    final SubLObject var6_67 = module0138.$g1623$.currentBinding(var3);
                                                                    try {
                                                                        module0138.$g1623$.bind(var75, var3);
                                                                        SubLObject var81_86;
                                                                        for (var81_86 = module0066.f4838(module0067.f4891(var76)); module0633.NIL == module0066.f4841(var81_86); var81_86 = module0066.f4840(var81_86)) {
                                                                            var3.resetMultipleValues();
                                                                            final SubLObject var77 = module0066.f4839(var81_86);
                                                                            final SubLObject var78 = var3.secondMultipleValue();
                                                                            var3.resetMultipleValues();
                                                                            if (module0633.NIL != module0141.f9289(var77)) {
                                                                                final SubLObject var6_68 = module0138.$g1624$.currentBinding(var3);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var77, var3);
                                                                                    final SubLObject var79 = var78;
                                                                                    if (module0633.NIL != module0077.f5302(var79)) {
                                                                                        final SubLObject var80 = module0077.f5333(var79);
                                                                                        SubLObject var81;
                                                                                        SubLObject var82;
                                                                                        SubLObject var83;
                                                                                        for (var81 = module0032.f1741(var80), var82 = (SubLObject)module0633.NIL, var82 = module0032.f1742(var81, var80); module0633.NIL == module0032.f1744(var81, var82); var82 = module0032.f1743(var82)) {
                                                                                            var83 = module0032.f1745(var81, var82);
                                                                                            if (module0633.NIL != module0032.f1746(var82, var83) && module0633.NIL == module0249.f16059(var83, (SubLObject)module0633.UNPROVIDED)) {
                                                                                                module0249.f16055(var83, (SubLObject)module0633.UNPROVIDED);
                                                                                                module0056.f4149(var83, var9);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var79.isList()) {
                                                                                        SubLObject var84 = var79;
                                                                                        SubLObject var85 = (SubLObject)module0633.NIL;
                                                                                        var85 = var84.first();
                                                                                        while (module0633.NIL != var84) {
                                                                                            if (module0633.NIL == module0249.f16059(var85, (SubLObject)module0633.UNPROVIDED)) {
                                                                                                module0249.f16055(var85, (SubLObject)module0633.UNPROVIDED);
                                                                                                module0056.f4149(var85, var9);
                                                                                            }
                                                                                            var84 = var84.rest();
                                                                                            var85 = var84.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0633.$ic67$, var79);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var6_68, var3);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var81_86);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var6_67, var3);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var74);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0633.FIVE_INTEGER, (SubLObject)module0633.$ic68$, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED);
                                                    }
                                                }
                                                else if (module0633.NIL != module0155.f9785(var71, (SubLObject)module0633.UNPROVIDED)) {
                                                    SubLObject var15_110;
                                                    final SubLObject var86 = var15_110 = ((module0633.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var3), module0137.f8955((SubLObject)module0633.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var3), module0137.f8955((SubLObject)module0633.UNPROVIDED)));
                                                    SubLObject var87 = (SubLObject)module0633.NIL;
                                                    var87 = var15_110.first();
                                                    while (module0633.NIL != var15_110) {
                                                        final SubLObject var6_69 = module0138.$g1625$.currentBinding(var3);
                                                        try {
                                                            module0138.$g1625$.bind(var87, var3);
                                                            final SubLObject var89;
                                                            final SubLObject var88 = var89 = Functions.funcall(var87, var71);
                                                            if (module0633.NIL != module0077.f5302(var89)) {
                                                                final SubLObject var90 = module0077.f5333(var89);
                                                                SubLObject var91;
                                                                SubLObject var92;
                                                                SubLObject var93;
                                                                for (var91 = module0032.f1741(var90), var92 = (SubLObject)module0633.NIL, var92 = module0032.f1742(var91, var90); module0633.NIL == module0032.f1744(var91, var92); var92 = module0032.f1743(var92)) {
                                                                    var93 = module0032.f1745(var91, var92);
                                                                    if (module0633.NIL != module0032.f1746(var92, var93) && module0633.NIL == module0249.f16059(var93, (SubLObject)module0633.UNPROVIDED)) {
                                                                        module0249.f16055(var93, (SubLObject)module0633.UNPROVIDED);
                                                                        module0056.f4149(var93, var9);
                                                                    }
                                                                }
                                                            }
                                                            else if (var89.isList()) {
                                                                SubLObject var94 = var89;
                                                                SubLObject var95 = (SubLObject)module0633.NIL;
                                                                var95 = var94.first();
                                                                while (module0633.NIL != var94) {
                                                                    if (module0633.NIL == module0249.f16059(var95, (SubLObject)module0633.UNPROVIDED)) {
                                                                        module0249.f16055(var95, (SubLObject)module0633.UNPROVIDED);
                                                                        module0056.f4149(var95, var9);
                                                                    }
                                                                    var94 = var94.rest();
                                                                    var95 = var94.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0633.$ic67$, var89);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var6_69, var3);
                                                        }
                                                        var15_110 = var15_110.rest();
                                                        var87 = var15_110.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var7_61, var3);
                                                module0137.$g1605$.rebind(var6_66, var3);
                                            }
                                            var69 = var69.rest();
                                            var70 = var69.first();
                                        }
                                        var57_58 = module0056.f4150(var9);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var8_72, var3);
                                    module0138.$g1619$.rebind(var7_59, var3);
                                    module0141.$g1677$.rebind(var6_59, var3);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)module0633.TWO_INTEGER, (SubLObject)module0633.$ic70$, var7, module0244.f15748(module0137.f8955((SubLObject)module0633.UNPROVIDED)), (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var14, var3);
                            module0141.$g1674$.rebind(var13, var3);
                            module0141.$g1672$.rebind(var12, var3);
                            module0141.$g1671$.rebind(var7_58, var3);
                            module0141.$g1670$.rebind(var6_58, var3);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var7_57, var3);
                        module0141.$g1714$.rebind(var6_57, var3);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var3));
                }
                finally {
                    module0139.$g1635$.rebind(var6_56, var3);
                }
                module0139.f9011(module0139.$g1636$.getDynamicValue(var3));
            }
            finally {
                module0139.$g1636$.rebind(var7_56, var3);
                module0137.$g1605$.rebind(var6_55, var3);
            }
        }
        finally {
            module0147.$g2095$.rebind(var6, var3);
            module0147.$g2094$.rebind(var5, var3);
        }
        return var4;
    }
    
    public static SubLObject f38738(final SubLObject var12) {
        SubLObject var13 = (SubLObject)module0633.NIL;
        SubLObject var14 = (SubLObject)module0633.$ic33$;
        if (module0633.NIL == f38718(var12, (SubLObject)module0633.UNPROVIDED)) {
            var13 = (SubLObject)module0633.$ic32$;
            var14 = Sequences.cconcatenate(var14, PrintLow.format((SubLObject)module0633.NIL, (SubLObject)module0633.$ic71$, var12));
            return Values.values(var13, var14);
        }
        final SubLObject var15 = f38723(var12, (SubLObject)module0633.UNPROVIDED);
        if (module0633.NIL == var15) {
            var13 = (SubLObject)module0633.$ic52$;
            var14 = Sequences.cconcatenate(var14, PrintLow.format((SubLObject)module0633.NIL, (SubLObject)module0633.$ic72$, var12));
        }
        final SubLObject var16 = f38721(var12, (SubLObject)module0633.UNPROVIDED);
        if (module0633.NIL == var16) {
            var13 = (SubLObject)module0633.$ic52$;
            var14 = Sequences.cconcatenate(var14, PrintLow.format((SubLObject)module0633.NIL, (SubLObject)module0633.$ic73$, var12));
        }
        return Values.values(var13, var14);
    }
    
    public static SubLObject f38739(final SubLObject var123) {
        final SubLObject var124 = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons(module0631.$g4893$.getGlobalValue(), (SubLObject)module0633.$ic74$), (SubLObject)ConsesLow.cons(module0631.$g4894$.getGlobalValue(), (SubLObject)module0633.$ic75$), (SubLObject)ConsesLow.cons(module0631.$g4895$.getGlobalValue(), (SubLObject)module0633.$ic76$));
        return conses_high.assoc(var123, var124, Symbols.symbol_function((SubLObject)module0633.EQUAL), (SubLObject)module0633.UNPROVIDED).rest();
    }
    
    public static SubLObject f38740(final SubLObject var125) {
        final SubLObject var126 = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons(module0631.$g4889$.getGlobalValue(), (SubLObject)module0633.$ic77$), (SubLObject)ConsesLow.cons(module0631.$g4890$.getGlobalValue(), (SubLObject)module0633.$ic78$));
        return conses_high.assoc(var125, var126, Symbols.symbol_function((SubLObject)module0633.EQUAL), (SubLObject)module0633.UNPROVIDED).rest();
    }
    
    public static SubLObject f38741(final SubLObject var126) {
        final SubLThread var127 = SubLProcess.currentSubLThread();
        assert module0633.NIL != module0173.f10955(var126) : var126;
        SubLObject var128 = (SubLObject)module0633.NIL;
        final SubLObject var129 = module0147.f9540(module0633.$ic79$);
        final SubLObject var130 = module0147.$g2095$.currentBinding(var127);
        final SubLObject var131 = module0147.$g2094$.currentBinding(var127);
        final SubLObject var132 = module0147.$g2096$.currentBinding(var127);
        try {
            module0147.$g2095$.bind(module0147.f9545(var129), var127);
            module0147.$g2094$.bind(module0147.f9546(var129), var127);
            module0147.$g2096$.bind(module0147.f9549(var129), var127);
            final SubLObject var134;
            final SubLObject var133 = var134 = module0220.f14593(module0633.$ic80$, module0633.$ic81$, var126, (SubLObject)module0633.THREE_INTEGER, (SubLObject)module0633.ONE_INTEGER, (SubLObject)module0633.TWO_INTEGER, (SubLObject)module0633.UNPROVIDED).first();
            if (var134.eql(module0633.$ic82$)) {
                var128 = (SubLObject)module0633.T;
            }
            else if (var134.eql(module0633.$ic83$)) {
                var128 = (SubLObject)module0633.NIL;
            }
        }
        finally {
            module0147.$g2096$.rebind(var132, var127);
            module0147.$g2094$.rebind(var131, var127);
            module0147.$g2095$.rebind(var130, var127);
        }
        return var128;
    }
    
    public static SubLObject f38742(final SubLObject var128, final SubLObject var129, final SubLObject var130) {
        return module0161.f10518((SubLObject)ConsesLow.list(var128, module0161.f10543(var129, var130)));
    }
    
    public static SubLObject f38743(final SubLObject var131, final SubLObject var132) {
        final SubLObject var133 = f38744(var131, var132);
        SubLObject var134 = module0205.f13153(var133);
        if (module0633.NIL != module0233.f15352(var131)) {
            var134 = Mapping.mapcar((SubLObject)module0633.$ic84$, var134);
        }
        return var134;
    }
    
    public static SubLObject f38744(final SubLObject var131, final SubLObject var132) {
        final SubLThread var133 = SubLProcess.currentSubLThread();
        if (module0633.NIL == var132) {
            return var131;
        }
        final SubLObject var134 = module0633.$g4944$.currentBinding(var133);
        try {
            module0633.$g4944$.bind(var132, var133);
            return module0036.f2531(var131, (SubLObject)module0633.$ic87$, (SubLObject)module0633.$ic88$, (SubLObject)module0633.UNPROVIDED);
        }
        finally {
            module0633.$g4944$.rebind(var134, var133);
        }
    }
    
    public static SubLObject f38745(final SubLObject var10) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0633.NIL != module0202.f12659(var10) && module0633.NIL != module0202.f12589(var10, module0633.$ic89$));
    }
    
    public static SubLObject f38746(final SubLObject var135) {
        final SubLThread var136 = SubLProcess.currentSubLThread();
        final SubLObject var137 = module0205.f13277(var135, (SubLObject)module0633.UNPROVIDED);
        final SubLObject var138 = module0035.f2293(module0633.$g4944$.getDynamicValue(var136), var137, (SubLObject)module0633.UNPROVIDED, (SubLObject)module0633.UNPROVIDED);
        if (module0633.NIL == var138) {
            Errors.warn((SubLObject)module0633.$ic90$, var137);
        }
        return var138;
    }
    
    public static SubLObject f38747(final SubLObject var138) {
        return f38748(conses_high.copy_list(var138));
    }
    
    public static SubLObject f38748(final SubLObject var138) {
        final SubLObject var139 = Mapping.mapcar((SubLObject)module0633.$ic91$, var138);
        final SubLObject var140 = Sort.sort(var139, (SubLObject)module0633.$ic92$, (SubLObject)module0633.$ic93$);
        return module0035.f2288(var140, Symbols.symbol_function((SubLObject)module0633.EQUAL));
    }
    
    public static SubLObject f38749(final SubLObject var141) {
        final SubLThread var142 = SubLProcess.currentSubLThread();
        SubLObject var143 = (SubLObject)module0633.NIL;
        SubLObject var144 = (SubLObject)module0633.NIL;
        SubLObject var145 = (SubLObject)module0633.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var141, var141, (SubLObject)module0633.$ic94$);
        var144 = var141.first();
        final SubLObject var146 = var145 = var141.rest();
        final SubLObject var147 = module0146.$g2018$.currentBinding(var142);
        final SubLObject var148 = module0146.$g2020$.currentBinding(var142);
        try {
            module0146.$g2018$.bind((SubLObject)module0633.NIL, var142);
            module0146.$g2020$.bind((SubLObject)module0633.NIL, var142);
            final SubLObject var149 = module0205.f13144(module0285.f18875(var145, (SubLObject)module0633.UNPROVIDED));
            var143 = module0233.f15340(var144, var149);
        }
        finally {
            module0146.$g2020$.rebind(var148, var142);
            module0146.$g2018$.rebind(var147, var142);
        }
        return var143;
    }
    
    public static SubLObject f38750(final SubLObject var145, final SubLObject var146) {
        SubLObject var147 = (SubLObject)module0633.NIL;
        SubLObject var148 = var145;
        SubLObject var149 = (SubLObject)module0633.NIL;
        var149 = var148.first();
        while (module0633.NIL != var148) {
            SubLObject var150 = (SubLObject)module0633.NIL;
            SubLObject var15_149 = var149;
            SubLObject var151 = (SubLObject)module0633.NIL;
            var151 = var15_149.first();
            while (module0633.NIL != var15_149) {
                var150 = (SubLObject)ConsesLow.cons(module0233.f15340(module0233.f15355(var151), Functions.funcall(var146, module0233.f15370(var151))), var150);
                var15_149 = var15_149.rest();
                var151 = var15_149.first();
            }
            var150 = Sequences.nreverse(var150);
            var147 = (SubLObject)ConsesLow.cons(var150, var147);
            var148 = var148.rest();
            var149 = var148.first();
        }
        var147 = Sequences.nreverse(var147);
        return var147;
    }
    
    public static SubLObject f38751(final SubLObject var10) {
        if (module0633.NIL != module0174.f11035(var10)) {
            return module0538.f33367(var10, (SubLObject)module0633.UNPROVIDED);
        }
        return var10;
    }
    
    public static SubLObject f38752() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0633", "f38711", "S#9541", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0633", "f38712", "S#41518", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0633", "f38713", "S#32761", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0633", "f38714", "S#42445", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0633", "f38715", "S#42446", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0633", "f38716", "S#32762", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0633", "f38717", "S#2628", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0633", "f38718", "S#32785", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0633", "f38719", "S#42447", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0633", "f38720", "S#42448", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0633", "f38721", "S#42449", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0633", "f38722", "S#42450", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0633", "f38723", "S#42451", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0633", "f38724", "S#32765", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0633", "f38725", "S#32772", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0633", "f38726", "S#42452", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0633", "f38727", "S#32773", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0633", "f38728", "S#32774", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0633", "f38729", "S#32771", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0633", "f38730", "S#32768", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0633", "f38731", "S#32769", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0633", "f38732", "S#32770", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0633", "f38733", "S#42453", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0633", "f38734", "S#32777", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0633", "f38735", "S#42454", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0633", "f38736", "S#32778", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0633", "f38737", "S#42455", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0633", "f38738", "S#42456", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0633", "f38739", "S#42457", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0633", "f38740", "S#42458", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0633", "f38741", "S#42459", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0633", "f38742", "S#42441", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0633", "f38743", "S#32767", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0633", "f38744", "S#42460", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0633", "f38745", "S#42461", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0633", "f38746", "S#42462", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0633", "f38747", "S#42463", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0633", "f38748", "S#42464", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0633", "f38749", "S#42465", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0633", "f38750", "S#42466", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0633", "f38751", "S#42467", 1, 0, false);
        return (SubLObject)module0633.NIL;
    }
    
    public static SubLObject f38753() {
        module0633.$g4938$ = SubLFiles.defconstant("S#42468", (SubLObject)module0633.$ic0$);
        module0633.$g4939$ = SubLFiles.defconstant("S#42469", (SubLObject)module0633.$ic1$);
        module0633.$g4940$ = SubLFiles.defparameter("S#42470", (SubLObject)module0633.NIL);
        module0633.$g4941$ = SubLFiles.defparameter("S#42471", (SubLObject)module0633.NIL);
        module0633.$g4942$ = SubLFiles.defparameter("S#42472", (SubLObject)module0633.NIL);
        module0633.$g4943$ = SubLFiles.deflexical("S#42473", (SubLObject)module0633.$ic2$);
        module0633.$g4944$ = SubLFiles.defparameter("S#42474", (SubLObject)module0633.$ic85$);
        return (SubLObject)module0633.NIL;
    }
    
    public static SubLObject f38754() {
        return (SubLObject)module0633.NIL;
    }
    
    public void declareFunctions() {
        f38752();
    }
    
    public void initializeVariables() {
        f38753();
    }
    
    public void runTopLevelForms() {
        f38754();
    }
    
    static {
        me = (SubLFile)new module0633();
        module0633.$g4938$ = null;
        module0633.$g4939$ = null;
        module0633.$g4940$ = null;
        module0633.$g4941$ = null;
        module0633.$g4942$ = null;
        module0633.$g4943$ = null;
        module0633.$g4944$ = null;
        $ic0$ = SubLObjectFactory.makeString("I");
        $ic1$ = SubLObjectFactory.makeString("C");
        $ic2$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TestVocabularyMt")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("testQuerySpecification")));
        $ic3$ = SubLObjectFactory.makeSymbol("VALID-CONSTANT?");
        $ic4$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic5$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("testQuerySpecification"));
        $ic6$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic7$ = SubLObjectFactory.makeSymbol("S#32663", "CYC");
        $ic8$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("KBContentTest-FullySpecified"));
        $ic9$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("KBContentTest"));
        $ic10$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("KBContentTestSpecificationType"));
        $ic11$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic12$ = SubLObjectFactory.makeSymbol("S#32785", "CYC");
        $ic13$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("comment"));
        $ic14$ = SubLObjectFactory.makeSymbol("COLLECTION-P");
        $ic15$ = SubLObjectFactory.makeKeyword("WHO");
        $ic16$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("testResponsibleCyclist"));
        $ic17$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WHO"));
        $ic18$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("testCollectionCyclistResponsible"));
        $ic19$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("testMetricsToGather"));
        $ic20$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("testAnswersCycL-Exact"));
        $ic21$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("testAnswersCycL-Wanted"));
        $ic22$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("testAnswersCycL-NotWanted"));
        $ic23$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("testAnswersCycLUnimportant"));
        $ic24$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("testAnswers-Cardinality-Exact"));
        $ic25$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("testAnswers-Cardinality-Min"));
        $ic26$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("testAnswers-Cardinality-Max"));
        $ic27$ = ConsesLow.list(new SubLObject[] { module0128.f8479((SubLObject)SubLObjectFactory.makeString("testAnswersCycL-Exact")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("testAnswersCycL-Wanted")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("testAnswersCycL-NotWanted")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("testAnswersCycLUnimportant")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("testAnswerSupport-Wanted")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("testAnswerSupport-NotWanted")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("testAnswerSupportedByHLSupportModule-Wanted")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("testAnswerSupportedByHLSupportModule-NotWanted")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("testResponsibleCyclist")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("testQuerySpecification")) });
        $ic28$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic29$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic30$ = SubLObjectFactory.makeKeyword("GAF");
        $ic31$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TestVocabularyMt"));
        $ic32$ = SubLObjectFactory.makeKeyword("SEVERE");
        $ic33$ = SubLObjectFactory.makeString("");
        $ic34$ = SubLObjectFactory.makeString("~%~A is not a #$KBContentTest-FullySpecified.");
        $ic35$ = SubLObjectFactory.makeKeyword("NOT-A-TEST-SPECIFICATION");
        $ic36$ = SubLObjectFactory.makeString("~%~A does not have a valid arg2 for #$testQuerySpecification.");
        $ic37$ = SubLObjectFactory.makeKeyword("NO-VALID-QUERY");
        $ic38$ = SubLObjectFactory.makeString(" has no #$testAnswer-MultipleChoice.");
        $ic39$ = SubLObjectFactory.makeKeyword("NO-TEST-EXPECTATION");
        $ic40$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("testAnswerSupport-Wanted"));
        $ic41$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("testAnswerSupport-NotWanted"));
        $ic42$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("testAnswerSupportedByHLSupportModule-Wanted"));
        $ic43$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("testAnswerSupportedByHLSupportModule-NotWanted"));
        $ic44$ = SubLObjectFactory.makeString("~%~A has no stated test expectation.");
        $ic45$ = SubLObjectFactory.makeString("~%~A's exact answer should include only #$ELInferenceBindingSets, but these are not: ");
        $ic46$ = SubLObjectFactory.makeKeyword("EXACT-ANSWER-CONTAINS-MALFORMED-INFERENCE-BINDING-SET");
        $ic47$ = SubLObjectFactory.makeString("~A ");
        $ic48$ = SubLObjectFactory.makeString("~%~A's wanted answer should be an #$ELInferenceBindingSet but isn't: ");
        $ic49$ = SubLObjectFactory.makeKeyword("WANTED-ANSWER-IS-NOT-AN-INFERENCE-BINDING-SET");
        $ic50$ = SubLObjectFactory.makeString("~%~A's unwanted answer should be an #$ELInferenceBindingSet but isn't: ");
        $ic51$ = SubLObjectFactory.makeKeyword("UNWANTED-ANSWER-IS-NOT-AN-INFERENCE-BINDING-SET");
        $ic52$ = SubLObjectFactory.makeKeyword("PROBLEM");
        $ic53$ = SubLObjectFactory.makeString("~%~A does not have a responsible Cyclist.");
        $ic54$ = SubLObjectFactory.makeKeyword("NO-RESPONSIBLE-CYCLIST");
        $ic55$ = SubLObjectFactory.makeKeyword("BREADTH");
        $ic56$ = SubLObjectFactory.makeKeyword("QUEUE");
        $ic57$ = SubLObjectFactory.makeKeyword("STACK");
        $ic58$ = SubLObjectFactory.makeSymbol("S#11450", "CYC");
        $ic59$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic60$ = SubLObjectFactory.makeString("~A is not a ~A");
        $ic61$ = SubLObjectFactory.makeSymbol("S#11592", "CYC");
        $ic62$ = SubLObjectFactory.makeKeyword("CERROR");
        $ic63$ = SubLObjectFactory.makeString("continue anyway");
        $ic64$ = SubLObjectFactory.makeKeyword("WARN");
        $ic65$ = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic66$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("AreteQuery"));
        $ic67$ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $ic68$ = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic69$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("US#4D5E436"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#1526883"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#15AA083"));
        $ic70$ = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic71$ = SubLObjectFactory.makeString("~%~A is not a #$KBContentTestSpecificationType!");
        $ic72$ = SubLObjectFactory.makeString("~%~A has no responsible Cyclists.");
        $ic73$ = SubLObjectFactory.makeString("~%~A has no instances.");
        $ic74$ = SubLObjectFactory.makeString("Sampling");
        $ic75$ = SubLObjectFactory.makeString("Hypothesize");
        $ic76$ = SubLObjectFactory.makeString("Simple");
        $ic77$ = SubLObjectFactory.makeString("Test Set");
        $ic78$ = SubLObjectFactory.makeString("Individual Test");
        $ic79$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycArchitectureMt"));
        $ic80$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycKBContentTestFramework"));
        $ic81$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("defaultSoftwareParameterValueInSoftwareObject"));
        $ic82$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("True"));
        $ic83$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("False"));
        $ic84$ = SubLObjectFactory.makeSymbol("S#42463", "CYC");
        $ic85$ = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $ic86$ = SubLObjectFactory.makeSymbol("S#5859", "CYC");
        $ic87$ = SubLObjectFactory.makeSymbol("S#42461", "CYC");
        $ic88$ = SubLObjectFactory.makeSymbol("S#42462", "CYC");
        $ic89$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("HypotheticalForVariableFn"));
        $ic90$ = SubLObjectFactory.makeString("When determining test results, could not find a hypothetical binding for the variable ~a");
        $ic91$ = SubLObjectFactory.makeSymbol("S#42465", "CYC");
        $ic92$ = SubLObjectFactory.makeSymbol("S#3846", "CYC");
        $ic93$ = SubLObjectFactory.makeSymbol("S#18076", "CYC");
        $ic94$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0633.class
	Total time: 1185 ms
	
	Decompiled with Procyon 0.5.32.
*/