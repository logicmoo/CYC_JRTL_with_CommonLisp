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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        return (SubLObject)T;
    }
    
    public static SubLObject f38712() {
        if (NIL != module0035.f2370((SubLObject)$ic3$, $g4943$.getGlobalValue(), (SubLObject)UNPROVIDED)) {
            module0131.f8585();
        }
        else {
            module0131.f8586();
        }
        return module0131.f8584();
    }
    
    public static SubLObject f38713(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0632.f38705();
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL != module0426.f30110(var1)) {
            return var1;
        }
        assert NIL != module0173.f10955(var1) : var1;
        SubLObject var4 = (SubLObject)NIL;
        final SubLObject var5 = module0147.f9540(var2);
        final SubLObject var6 = module0147.$g2095$.currentBinding(var3);
        final SubLObject var7 = module0147.$g2094$.currentBinding(var3);
        final SubLObject var8 = module0147.$g2096$.currentBinding(var3);
        try {
            module0147.$g2095$.bind(module0147.f9545(var5), var3);
            module0147.$g2094$.bind(module0147.f9546(var5), var3);
            module0147.$g2096$.bind(module0147.f9549(var5), var3);
            var4 = module0220.f14553(var1, $ic5$, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)$ic6$);
        }
        finally {
            module0147.$g2096$.rebind(var8, var3);
            module0147.$g2094$.rebind(var7, var3);
            module0147.$g2095$.rebind(var6, var3);
        }
        return var4;
    }
    
    public static SubLObject f38714(final SubLObject var9, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0632.f38705();
        }
        final SubLThread var10 = SubLProcess.currentSubLThread();
        if (NIL != module0426.f30110(var9)) {
            return var9;
        }
        assert NIL != module0423.f29532(var9) : var9;
        SubLObject var11 = (SubLObject)NIL;
        final SubLObject var12 = module0147.f9540(var2);
        final SubLObject var13 = module0147.$g2095$.currentBinding(var10);
        final SubLObject var14 = module0147.$g2094$.currentBinding(var10);
        final SubLObject var15 = module0147.$g2096$.currentBinding(var10);
        try {
            module0147.$g2095$.bind(module0147.f9545(var12), var10);
            module0147.$g2094$.bind(module0147.f9546(var12), var10);
            module0147.$g2096$.bind(module0147.f9549(var12), var10);
            var11 = module0220.f14562(var9, $ic5$, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)$ic6$);
        }
        finally {
            module0147.$g2096$.rebind(var15, var10);
            module0147.$g2094$.rebind(var14, var10);
            module0147.$g2095$.rebind(var13, var10);
        }
        return var11;
    }
    
    public static SubLObject f38715() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38716(final SubLObject var10, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0632.f38705();
        }
        return (SubLObject)makeBoolean((NIL != module0131.f8584() && NIL != module0173.f10955(var10) && NIL != module0259.f16854(var10, $ic8$, var2, (SubLObject)UNPROVIDED)) || NIL != module0426.f30110(var10));
    }
    
    public static SubLObject f38717(final SubLObject var10) {
        return (SubLObject)makeBoolean((NIL != module0131.f8584() && NIL != module0173.f10955(var10) && NIL != module0259.f16891(var10, $ic9$)) || NIL != module0426.f30110(var10));
    }
    
    public static SubLObject f38718(final SubLObject var10, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0632.f38705();
        }
        if (NIL != module0131.f8584() && NIL != module0173.f10955(var10)) {
            return module0259.f16854(var10, $ic10$, var2, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38719(final SubLObject var11, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0632.f38705();
        }
        assert NIL != module0173.f10955(var11) : var11;
        final SubLObject var12 = module0220.f14566(var11, $ic11$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return module0035.remove_if_not(Symbols.symbol_function((SubLObject)$ic12$), var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f38720(final SubLObject var11, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0632.f38705();
        }
        assert NIL != module0173.f10955(var11) : var11;
        return module0220.f14566(var11, $ic13$, var2, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)$ic6$);
    }
    
    public static SubLObject f38721(final SubLObject var12, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0632.f38705();
        }
        assert NIL != module0269.f17710(var12) : var12;
        return module0259.f16848(var12, var2, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f38722(final SubLObject var11, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0632.f38707((SubLObject)UNPROVIDED);
        }
        assert NIL != module0173.f10955(var11) : var11;
        return module0434.f30579((SubLObject)$ic15$, (SubLObject)ConsesLow.listS($ic16$, var11, (SubLObject)$ic17$), var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f38723(final SubLObject var12, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0632.f38707((SubLObject)UNPROVIDED);
        }
        assert NIL != module0173.f10955(var12) : var12;
        return module0434.f30579((SubLObject)$ic15$, (SubLObject)ConsesLow.listS($ic18$, var12, (SubLObject)$ic17$), var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f38724(final SubLObject var11, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0632.f38705();
        }
        if (NIL != module0426.f30110(var11)) {
            return (SubLObject)NIL;
        }
        assert NIL != module0173.f10955(var11) : var11;
        return module0220.f14566(var11, $ic19$, var2, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)$ic6$);
    }
    
    public static SubLObject f38725(final SubLObject var11, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0632.f38705();
        }
        assert NIL != module0173.f10955(var11) : var11;
        return module0220.f14554(var11, $ic20$, var2, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)$ic6$);
    }
    
    public static SubLObject f38726(final SubLObject var11, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0632.f38705();
        }
        assert NIL != module0173.f10955(var11) : var11;
        return module0205.f13304(f38725(var11, var2), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f38727(final SubLObject var11, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0632.f38705();
        }
        assert NIL != module0173.f10955(var11) : var11;
        return module0220.f14563(var11, $ic21$, var2, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)$ic6$);
    }
    
    public static SubLObject f38728(final SubLObject var11, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0632.f38705();
        }
        assert NIL != module0173.f10955(var11) : var11;
        return module0220.f14563(var11, $ic22$, var2, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)$ic6$);
    }
    
    public static SubLObject f38729(final SubLObject var11, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0632.f38705();
        }
        assert NIL != module0173.f10955(var11) : var11;
        return module0035.sublisp_boolean(module0220.f14545(var11, $ic23$, var2, (SubLObject)ONE_INTEGER, (SubLObject)$ic6$));
    }
    
    public static SubLObject f38730(final SubLObject var11, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0632.f38705();
        }
        assert NIL != module0173.f10955(var11) : var11;
        return module0220.f14554(var11, $ic24$, var2, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)$ic6$);
    }
    
    public static SubLObject f38731(final SubLObject var11, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0632.f38705();
        }
        assert NIL != module0173.f10955(var11) : var11;
        return module0220.f14554(var11, $ic25$, var2, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)$ic6$);
    }
    
    public static SubLObject f38732(final SubLObject var11, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = module0632.f38705();
        }
        assert NIL != module0173.f10955(var11) : var11;
        return module0220.f14554(var11, $ic26$, var2, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)$ic6$);
    }
    
    public static SubLObject f38733(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        final SubLObject var15 = (SubLObject)$ic27$;
        final SubLObject var16 = module0147.$g2094$.currentBinding(var12);
        final SubLObject var17 = module0147.$g2095$.currentBinding(var12);
        try {
            module0147.$g2094$.bind((SubLObject)$ic28$, var12);
            module0147.$g2095$.bind($ic29$, var12);
            SubLObject var18 = var15;
            SubLObject var19 = (SubLObject)NIL;
            var19 = var18.first();
            while (NIL != var18) {
                final SubLObject var20 = var19;
                if (NIL != module0158.f10010(var11, (SubLObject)ONE_INTEGER, var20)) {
                    final SubLObject var21 = module0158.f10011(var11, (SubLObject)ONE_INTEGER, var20);
                    SubLObject var22 = (SubLObject)NIL;
                    final SubLObject var23 = (SubLObject)NIL;
                    while (NIL == var22) {
                        final SubLObject var24 = module0052.f3695(var21, var23);
                        final SubLObject var25 = (SubLObject)makeBoolean(!var23.eql(var24));
                        if (NIL != var25) {
                            SubLObject var26 = (SubLObject)NIL;
                            try {
                                var26 = module0158.f10316(var24, (SubLObject)$ic30$, (SubLObject)$ic6$, (SubLObject)NIL);
                                SubLObject var19_24 = (SubLObject)NIL;
                                final SubLObject var20_25 = (SubLObject)NIL;
                                while (NIL == var19_24) {
                                    final SubLObject var27 = module0052.f3695(var26, var20_25);
                                    final SubLObject var22_27 = (SubLObject)makeBoolean(!var20_25.eql(var27));
                                    if (NIL != var22_27) {
                                        final SubLObject var28 = module0178.f11287(var27);
                                        final SubLObject var30;
                                        final SubLObject var29 = var30 = module0161.f10557(var28);
                                        if (NIL == conses_high.member(var30, var13, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                            var13 = (SubLObject)ConsesLow.cons(var30, var13);
                                        }
                                    }
                                    var19_24 = (SubLObject)makeBoolean(NIL == var22_27);
                                }
                            }
                            finally {
                                final SubLObject var6_30 = Threads.$is_thread_performing_cleanupP$.currentBinding(var12);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var12);
                                    if (NIL != var26) {
                                        module0158.f10319(var26);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var6_30, var12);
                                }
                            }
                        }
                        var22 = (SubLObject)makeBoolean(NIL == var25);
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
        var14 = module0262.f17370(var13, var13, (SubLObject)UNPROVIDED);
        if (NIL != module0035.f1997(var14)) {
            return var14.first();
        }
        return $ic31$;
    }
    
    public static SubLObject f38734(final SubLObject var11) {
        return (SubLObject)makeBoolean(NIL == f38735(var11) && $ic32$ != f38736(var11));
    }
    
    public static SubLObject f38735(final SubLObject var11) {
        if (NIL != f38716(var11, (SubLObject)UNPROVIDED)) {
            final SubLObject var12 = f38713(var11, (SubLObject)UNPROVIDED);
            if (NIL != var12) {
                return module0423.f29594(var12);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38736(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        if (NIL != module0426.f30110(var11)) {
            return Values.values((SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
        }
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)$ic33$;
        SubLObject var15 = (SubLObject)NIL;
        if (NIL == f38716(var11, (SubLObject)UNPROVIDED)) {
            var14 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic34$, var11);
            var15 = (SubLObject)ConsesLow.cons((SubLObject)$ic35$, var15);
            return Values.values((SubLObject)$ic32$, var14, Sequences.nreverse(var15));
        }
        final SubLObject var16 = f38713(var11, (SubLObject)UNPROVIDED);
        if (NIL == module0423.f29532(var16)) {
            var14 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic36$, var11);
            var15 = (SubLObject)ConsesLow.cons((SubLObject)$ic37$, var15);
            return Values.values((SubLObject)$ic32$, var14, Sequences.nreverse(var15));
        }
        var12.resetMultipleValues();
        final SubLObject var17 = module0423.f29595(var16, var11);
        final SubLObject var18 = var12.secondMultipleValue();
        final SubLObject var19 = var12.thirdMultipleValue();
        var12.resetMultipleValues();
        if (NIL != var17) {
            var13 = var17;
            var14 = var18;
            var15 = ConsesLow.append(var19, var15);
        }
        if (NIL != module0423.f29582(var11)) {
            if (NIL == Functions.funcall((SubLObject)makeSymbol("S#32766", "CYC"), var11)) {
                var13 = (SubLObject)$ic32$;
                var14 = Sequences.cconcatenate(var14, Sequences.cconcatenate(module0006.$g11$.getGlobalValue(), new SubLObject[] { module0006.f203(var11), $ic38$ }));
                var15 = (SubLObject)ConsesLow.cons((SubLObject)$ic39$, var15);
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
            final SubLObject var27 = module0220.f14563(var11, $ic40$, module0632.f38705(), (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
            final SubLObject var28 = module0220.f14563(var11, $ic41$, module0632.f38705(), (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
            final SubLObject var29 = module0220.f14563(var11, $ic42$, module0632.f38705(), (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
            final SubLObject var30 = module0220.f14563(var11, $ic43$, module0632.f38705(), (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
            SubLObject var31 = (SubLObject)NIL;
            SubLObject var32 = (SubLObject)NIL;
            SubLObject var33 = (SubLObject)NIL;
            if (NIL == var20 && NIL == var21 && NIL == var22 && NIL == var23 && NIL == var24 && NIL == var25 && NIL == var26 && NIL == var27 && NIL == var28 && NIL == var29 && NIL == var30) {
                var13 = (SubLObject)$ic32$;
                var14 = Sequences.cconcatenate(var14, PrintLow.format((SubLObject)NIL, (SubLObject)$ic44$, var11));
                var15 = (SubLObject)ConsesLow.cons((SubLObject)$ic39$, var15);
            }
            SubLObject var34 = module0205.f13304(var20, (SubLObject)UNPROVIDED);
            SubLObject var35 = (SubLObject)NIL;
            var35 = var34.first();
            while (NIL != var34) {
                if (NIL == module0233.f15359(var35)) {
                    var31 = (SubLObject)ConsesLow.cons(var35, var31);
                }
                var34 = var34.rest();
                var35 = var34.first();
            }
            if (NIL != var31) {
                var13 = (SubLObject)$ic32$;
                var14 = Sequences.cconcatenate(var14, PrintLow.format((SubLObject)NIL, (SubLObject)$ic45$, var11));
                var15 = (SubLObject)ConsesLow.cons((SubLObject)$ic46$, var15);
                var34 = var31;
                SubLObject var36 = (SubLObject)NIL;
                var36 = var34.first();
                while (NIL != var34) {
                    var14 = Sequences.cconcatenate(var14, PrintLow.format((SubLObject)NIL, (SubLObject)$ic47$, var36));
                    var34 = var34.rest();
                    var36 = var34.first();
                }
            }
            var34 = var22;
            var35 = (SubLObject)NIL;
            var35 = var34.first();
            while (NIL != var34) {
                if (NIL == module0233.f15359(var35)) {
                    var32 = (SubLObject)ConsesLow.cons(var35, var32);
                }
                var34 = var34.rest();
                var35 = var34.first();
            }
            if (NIL != var32) {
                var13 = (SubLObject)$ic32$;
                var14 = Sequences.cconcatenate(var14, PrintLow.format((SubLObject)NIL, (SubLObject)$ic48$, var11));
                var15 = (SubLObject)ConsesLow.cons((SubLObject)$ic49$, var15);
                var34 = var32;
                SubLObject var36 = (SubLObject)NIL;
                var36 = var34.first();
                while (NIL != var34) {
                    var14 = Sequences.cconcatenate(var14, PrintLow.format((SubLObject)NIL, (SubLObject)$ic47$, var36));
                    var34 = var34.rest();
                    var36 = var34.first();
                }
            }
            var34 = var23;
            var35 = (SubLObject)NIL;
            var35 = var34.first();
            while (NIL != var34) {
                if (NIL == module0233.f15359(var35)) {
                    var33 = (SubLObject)ConsesLow.cons(var35, var33);
                }
                var34 = var34.rest();
                var35 = var34.first();
            }
            if (NIL != var33) {
                var13 = (SubLObject)$ic32$;
                var14 = Sequences.cconcatenate(var14, PrintLow.format((SubLObject)NIL, (SubLObject)$ic50$, var11));
                var15 = (SubLObject)ConsesLow.cons((SubLObject)$ic51$, var15);
                var34 = var33;
                SubLObject var36 = (SubLObject)NIL;
                var36 = var34.first();
                while (NIL != var34) {
                    var14 = Sequences.cconcatenate(var14, PrintLow.format((SubLObject)NIL, (SubLObject)$ic47$, var36));
                    var34 = var34.rest();
                    var36 = var34.first();
                }
            }
        }
        final SubLObject var37 = f38722(var11, (SubLObject)UNPROVIDED);
        if (NIL == var37) {
            if (var13 != $ic32$) {
                var13 = (SubLObject)$ic52$;
            }
            var14 = Sequences.cconcatenate(var14, PrintLow.format((SubLObject)NIL, (SubLObject)$ic53$, var11));
            var15 = (SubLObject)ConsesLow.cons((SubLObject)$ic54$, var15);
        }
        return Values.values(var13, var14, Sequences.nreverse(var15));
    }
    
    public static SubLObject f38737() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0147.$g2094$.currentBinding(var3);
        final SubLObject var6 = module0147.$g2095$.currentBinding(var3);
        try {
            module0147.$g2094$.bind((SubLObject)$ic28$, var3);
            module0147.$g2095$.bind($ic29$, var3);
            final SubLObject var7 = $ic8$;
            final SubLObject var6_55 = module0137.$g1605$.currentBinding(var3);
            final SubLObject var7_56 = module0139.$g1636$.currentBinding(var3);
            try {
                module0137.$g1605$.bind(module0137.f8955($ic11$), var3);
                module0139.$g1636$.bind(module0139.f9007(), var3);
                SubLObject var57_58 = var7;
                final SubLObject var8 = (SubLObject)$ic57$;
                final SubLObject var9 = module0056.f4145(var8);
                final SubLObject var6_56 = module0139.$g1635$.currentBinding(var3);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var3);
                    final SubLObject var10 = (SubLObject)NIL;
                    final SubLObject var6_57 = module0141.$g1714$.currentBinding(var3);
                    final SubLObject var7_57 = module0141.$g1715$.currentBinding(var3);
                    try {
                        module0141.$g1714$.bind((NIL != var10) ? var10 : module0141.f9283(), var3);
                        module0141.$g1715$.bind((SubLObject)((NIL != var10) ? $ic58$ : module0141.$g1715$.getDynamicValue(var3)), var3);
                        if (NIL != var10 && NIL != module0136.f8864() && NIL == module0141.f9279(var10)) {
                            final SubLObject var11 = module0136.$g1591$.getDynamicValue(var3);
                            if (var11.eql((SubLObject)$ic59$)) {
                                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic60$, var10, (SubLObject)$ic61$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var11.eql((SubLObject)$ic62$)) {
                                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic63$, (SubLObject)$ic60$, var10, (SubLObject)$ic61$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var11.eql((SubLObject)$ic64$)) {
                                Errors.warn((SubLObject)$ic60$, var10, (SubLObject)$ic61$);
                            }
                            else {
                                Errors.warn((SubLObject)$ic65$, module0136.$g1591$.getDynamicValue(var3));
                                Errors.cerror((SubLObject)$ic63$, (SubLObject)$ic60$, var10, (SubLObject)$ic61$);
                            }
                        }
                        final SubLObject var6_58 = module0141.$g1670$.currentBinding(var3);
                        final SubLObject var7_58 = module0141.$g1671$.currentBinding(var3);
                        final SubLObject var12 = module0141.$g1672$.currentBinding(var3);
                        final SubLObject var13 = module0141.$g1674$.currentBinding(var3);
                        final SubLObject var14 = module0137.$g1605$.currentBinding(var3);
                        try {
                            module0141.$g1670$.bind(module0244.f15771(module0137.f8955($ic11$)), var3);
                            module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955($ic11$))), var3);
                            module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955($ic11$))), var3);
                            module0141.$g1674$.bind((SubLObject)NIL, var3);
                            module0137.$g1605$.bind(module0244.f15771(module0137.f8955($ic11$)), var3);
                            if (NIL != module0136.f8865() || NIL != module0244.f15795(var7, module0137.f8955((SubLObject)UNPROVIDED))) {
                                final SubLObject var6_59 = module0141.$g1677$.currentBinding(var3);
                                final SubLObject var7_59 = module0138.$g1619$.currentBinding(var3);
                                final SubLObject var8_72 = module0141.$g1674$.currentBinding(var3);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var3);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955($ic11$))), var3);
                                    module0141.$g1674$.bind((SubLObject)NIL, var3);
                                    module0249.f16055(var57_58, (SubLObject)UNPROVIDED);
                                    while (NIL != var57_58) {
                                        final SubLObject var15 = var57_58;
                                        SubLObject var17;
                                        final SubLObject var16 = var17 = module0200.f12443(module0137.f8955($ic11$));
                                        SubLObject var18 = (SubLObject)NIL;
                                        var18 = var17.first();
                                        while (NIL != var17) {
                                            final SubLObject var6_60 = module0137.$g1605$.currentBinding(var3);
                                            final SubLObject var7_60 = module0141.$g1674$.currentBinding(var3);
                                            try {
                                                module0137.$g1605$.bind(var18, var3);
                                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var3)) : module0141.$g1674$.getDynamicValue(var3)), var3);
                                                final SubLObject var19 = module0228.f15229(var15);
                                                if (NIL != module0138.f8992(var19)) {
                                                    final SubLObject var20 = module0242.f15664(var19, module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var20) {
                                                        final SubLObject var21 = module0245.f15834(var20, module0244.f15780(module0137.f8955($ic11$)), module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var21) {
                                                            SubLObject var22;
                                                            for (var22 = module0066.f4838(module0067.f4891(var21)); NIL == module0066.f4841(var22); var22 = module0066.f4840(var22)) {
                                                                var3.resetMultipleValues();
                                                                final SubLObject var23 = module0066.f4839(var22);
                                                                final SubLObject var24 = var3.secondMultipleValue();
                                                                var3.resetMultipleValues();
                                                                if (NIL != module0147.f9507(var23)) {
                                                                    final SubLObject var6_61 = module0138.$g1623$.currentBinding(var3);
                                                                    try {
                                                                        module0138.$g1623$.bind(var23, var3);
                                                                        SubLObject var81_85;
                                                                        for (var81_85 = module0066.f4838(module0067.f4891(var24)); NIL == module0066.f4841(var81_85); var81_85 = module0066.f4840(var81_85)) {
                                                                            var3.resetMultipleValues();
                                                                            final SubLObject var25 = module0066.f4839(var81_85);
                                                                            final SubLObject var26 = var3.secondMultipleValue();
                                                                            var3.resetMultipleValues();
                                                                            if (NIL != module0141.f9289(var25)) {
                                                                                final SubLObject var6_62 = module0138.$g1624$.currentBinding(var3);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var25, var3);
                                                                                    final SubLObject var27 = var26;
                                                                                    if (NIL != module0077.f5302(var27)) {
                                                                                        final SubLObject var28 = module0077.f5333(var27);
                                                                                        SubLObject var29;
                                                                                        SubLObject var30;
                                                                                        SubLObject var31;
                                                                                        SubLObject var32;
                                                                                        SubLObject var33;
                                                                                        SubLObject var34;
                                                                                        SubLObject var35;
                                                                                        for (var29 = module0032.f1741(var28), var30 = (SubLObject)NIL, var30 = module0032.f1742(var29, var28); NIL == module0032.f1744(var29, var30); var30 = module0032.f1743(var30)) {
                                                                                            var31 = module0032.f1745(var29, var30);
                                                                                            if (NIL != module0032.f1746(var30, var31) && NIL == module0249.f16059(var31, module0139.$g1636$.getDynamicValue(var3))) {
                                                                                                module0249.f16055(var31, module0139.$g1636$.getDynamicValue(var3));
                                                                                                if (NIL != module0173.f10955(var31)) {
                                                                                                    var3.resetMultipleValues();
                                                                                                    var32 = f38736(var31);
                                                                                                    var33 = var3.secondMultipleValue();
                                                                                                    var34 = var3.thirdMultipleValue();
                                                                                                    var3.resetMultipleValues();
                                                                                                    if ($ic32$ == var32) {
                                                                                                        var35 = f38713(var31, (SubLObject)UNPROVIDED);
                                                                                                        if (NIL == module0259.f16867(var35, $ic66$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                                                                                            var34 = Sequences.delete((SubLObject)$ic54$, var34, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                                                                            module0084.f5762(var4, var34, var31);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var27.isList()) {
                                                                                        SubLObject var36 = var27;
                                                                                        SubLObject var37 = (SubLObject)NIL;
                                                                                        var37 = var36.first();
                                                                                        while (NIL != var36) {
                                                                                            if (NIL == module0249.f16059(var37, module0139.$g1636$.getDynamicValue(var3))) {
                                                                                                module0249.f16055(var37, module0139.$g1636$.getDynamicValue(var3));
                                                                                                if (NIL != module0173.f10955(var37)) {
                                                                                                    var3.resetMultipleValues();
                                                                                                    final SubLObject var38 = f38736(var37);
                                                                                                    final SubLObject var39 = var3.secondMultipleValue();
                                                                                                    SubLObject var40 = var3.thirdMultipleValue();
                                                                                                    var3.resetMultipleValues();
                                                                                                    if ($ic32$ == var38) {
                                                                                                        final SubLObject var41 = f38713(var37, (SubLObject)UNPROVIDED);
                                                                                                        if (NIL == module0259.f16867(var41, $ic66$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                                                                                            var40 = Sequences.delete((SubLObject)$ic54$, var40, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
                                                                                        Errors.error((SubLObject)$ic67$, var27);
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
                                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic68$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                    if (NIL != module0200.f12419(var19, module0137.f8955((SubLObject)UNPROVIDED))) {
                                                        SubLObject var42 = module0248.f15995(var19);
                                                        SubLObject var43 = (SubLObject)NIL;
                                                        var43 = var42.first();
                                                        while (NIL != var42) {
                                                            SubLObject var45;
                                                            final SubLObject var44 = var45 = var43;
                                                            SubLObject var46 = (SubLObject)NIL;
                                                            SubLObject var47 = (SubLObject)NIL;
                                                            SubLObject var48 = (SubLObject)NIL;
                                                            cdestructuring_bind.destructuring_bind_must_consp(var45, var44, (SubLObject)$ic69$);
                                                            var46 = var45.first();
                                                            var45 = var45.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var45, var44, (SubLObject)$ic69$);
                                                            var47 = var45.first();
                                                            var45 = var45.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var45, var44, (SubLObject)$ic69$);
                                                            var48 = var45.first();
                                                            var45 = var45.rest();
                                                            if (NIL == var45) {
                                                                if (NIL != module0147.f9507(var47)) {
                                                                    final SubLObject var6_63 = module0138.$g1623$.currentBinding(var3);
                                                                    try {
                                                                        module0138.$g1623$.bind(var47, var3);
                                                                        if (NIL != module0141.f9289(var48)) {
                                                                            final SubLObject var6_64 = module0138.$g1624$.currentBinding(var3);
                                                                            try {
                                                                                module0138.$g1624$.bind(var48, var3);
                                                                                final SubLObject var27;
                                                                                final SubLObject var49 = var27 = (SubLObject)ConsesLow.list(var46);
                                                                                if (NIL != module0077.f5302(var27)) {
                                                                                    final SubLObject var28 = module0077.f5333(var27);
                                                                                    SubLObject var29;
                                                                                    SubLObject var30;
                                                                                    SubLObject var31;
                                                                                    SubLObject var32;
                                                                                    SubLObject var33;
                                                                                    SubLObject var34;
                                                                                    SubLObject var35;
                                                                                    for (var29 = module0032.f1741(var28), var30 = (SubLObject)NIL, var30 = module0032.f1742(var29, var28); NIL == module0032.f1744(var29, var30); var30 = module0032.f1743(var30)) {
                                                                                        var31 = module0032.f1745(var29, var30);
                                                                                        if (NIL != module0032.f1746(var30, var31) && NIL == module0249.f16059(var31, module0139.$g1636$.getDynamicValue(var3))) {
                                                                                            module0249.f16055(var31, module0139.$g1636$.getDynamicValue(var3));
                                                                                            if (NIL != module0173.f10955(var31)) {
                                                                                                var3.resetMultipleValues();
                                                                                                var32 = f38736(var31);
                                                                                                var33 = var3.secondMultipleValue();
                                                                                                var34 = var3.thirdMultipleValue();
                                                                                                var3.resetMultipleValues();
                                                                                                if ($ic32$ == var32) {
                                                                                                    var35 = f38713(var31, (SubLObject)UNPROVIDED);
                                                                                                    if (NIL == module0259.f16867(var35, $ic66$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                                                                                        var34 = Sequences.delete((SubLObject)$ic54$, var34, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                                                                        module0084.f5762(var4, var34, var31);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var27.isList()) {
                                                                                    SubLObject var98_107 = var27;
                                                                                    SubLObject var37 = (SubLObject)NIL;
                                                                                    var37 = var98_107.first();
                                                                                    while (NIL != var98_107) {
                                                                                        if (NIL == module0249.f16059(var37, module0139.$g1636$.getDynamicValue(var3))) {
                                                                                            module0249.f16055(var37, module0139.$g1636$.getDynamicValue(var3));
                                                                                            if (NIL != module0173.f10955(var37)) {
                                                                                                var3.resetMultipleValues();
                                                                                                final SubLObject var38 = f38736(var37);
                                                                                                final SubLObject var39 = var3.secondMultipleValue();
                                                                                                SubLObject var40 = var3.thirdMultipleValue();
                                                                                                var3.resetMultipleValues();
                                                                                                if ($ic32$ == var38) {
                                                                                                    final SubLObject var41 = f38713(var37, (SubLObject)UNPROVIDED);
                                                                                                    if (NIL == module0259.f16867(var41, $ic66$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                                                                                        var40 = Sequences.delete((SubLObject)$ic54$, var40, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
                                                                                    Errors.error((SubLObject)$ic67$, var27);
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
                                                                cdestructuring_bind.cdestructuring_bind_error(var44, (SubLObject)$ic69$);
                                                            }
                                                            var42 = var42.rest();
                                                            var43 = var42.first();
                                                        }
                                                    }
                                                }
                                                else if (NIL != module0155.f9785(var19, (SubLObject)UNPROVIDED)) {
                                                    SubLObject var15_109;
                                                    final SubLObject var50 = var15_109 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955($ic11$)), module0141.$g1714$.getDynamicValue(var3), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955($ic11$)), module0141.$g1714$.getDynamicValue(var3), module0137.f8955((SubLObject)UNPROVIDED)));
                                                    SubLObject var51 = (SubLObject)NIL;
                                                    var51 = var15_109.first();
                                                    while (NIL != var15_109) {
                                                        final SubLObject var6_65 = module0138.$g1625$.currentBinding(var3);
                                                        try {
                                                            module0138.$g1625$.bind(var51, var3);
                                                            final SubLObject var53;
                                                            final SubLObject var52 = var53 = Functions.funcall(var51, var19);
                                                            if (NIL != module0077.f5302(var53)) {
                                                                final SubLObject var54 = module0077.f5333(var53);
                                                                SubLObject var55;
                                                                SubLObject var56;
                                                                SubLObject var57;
                                                                SubLObject var58;
                                                                SubLObject var59;
                                                                SubLObject var60;
                                                                SubLObject var61;
                                                                for (var55 = module0032.f1741(var54), var56 = (SubLObject)NIL, var56 = module0032.f1742(var55, var54); NIL == module0032.f1744(var55, var56); var56 = module0032.f1743(var56)) {
                                                                    var57 = module0032.f1745(var55, var56);
                                                                    if (NIL != module0032.f1746(var56, var57) && NIL == module0249.f16059(var57, module0139.$g1636$.getDynamicValue(var3))) {
                                                                        module0249.f16055(var57, module0139.$g1636$.getDynamicValue(var3));
                                                                        if (NIL != module0173.f10955(var57)) {
                                                                            var3.resetMultipleValues();
                                                                            var58 = f38736(var57);
                                                                            var59 = var3.secondMultipleValue();
                                                                            var60 = var3.thirdMultipleValue();
                                                                            var3.resetMultipleValues();
                                                                            if ($ic32$ == var58) {
                                                                                var61 = f38713(var57, (SubLObject)UNPROVIDED);
                                                                                if (NIL == module0259.f16867(var61, $ic66$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                                                                    var60 = Sequences.delete((SubLObject)$ic54$, var60, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                                                    module0084.f5762(var4, var60, var57);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            else if (var53.isList()) {
                                                                SubLObject var62 = var53;
                                                                SubLObject var63 = (SubLObject)NIL;
                                                                var63 = var62.first();
                                                                while (NIL != var62) {
                                                                    if (NIL == module0249.f16059(var63, module0139.$g1636$.getDynamicValue(var3))) {
                                                                        module0249.f16055(var63, module0139.$g1636$.getDynamicValue(var3));
                                                                        if (NIL != module0173.f10955(var63)) {
                                                                            var3.resetMultipleValues();
                                                                            final SubLObject var64 = f38736(var63);
                                                                            final SubLObject var65 = var3.secondMultipleValue();
                                                                            SubLObject var66 = var3.thirdMultipleValue();
                                                                            var3.resetMultipleValues();
                                                                            if ($ic32$ == var64) {
                                                                                final SubLObject var67 = f38713(var63, (SubLObject)UNPROVIDED);
                                                                                if (NIL == module0259.f16867(var67, $ic66$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                                                                    var66 = Sequences.delete((SubLObject)$ic54$, var66, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
                                                                Errors.error((SubLObject)$ic67$, var53);
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
                                        final SubLObject var68 = var69 = module0200.f12443(module0244.f15771(module0137.f8955($ic11$)));
                                        SubLObject var70 = (SubLObject)NIL;
                                        var70 = var69.first();
                                        while (NIL != var69) {
                                            final SubLObject var6_66 = module0137.$g1605$.currentBinding(var3);
                                            final SubLObject var7_61 = module0141.$g1674$.currentBinding(var3);
                                            try {
                                                module0137.$g1605$.bind(var70, var3);
                                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var3)) : module0141.$g1674$.getDynamicValue(var3)), var3);
                                                final SubLObject var71 = module0228.f15229(var57_58);
                                                if (NIL != module0138.f8992(var71)) {
                                                    final SubLObject var72 = module0242.f15664(var71, module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var72) {
                                                        final SubLObject var73 = module0245.f15834(var72, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var73) {
                                                            SubLObject var74;
                                                            for (var74 = module0066.f4838(module0067.f4891(var73)); NIL == module0066.f4841(var74); var74 = module0066.f4840(var74)) {
                                                                var3.resetMultipleValues();
                                                                final SubLObject var75 = module0066.f4839(var74);
                                                                final SubLObject var76 = var3.secondMultipleValue();
                                                                var3.resetMultipleValues();
                                                                if (NIL != module0147.f9507(var75)) {
                                                                    final SubLObject var6_67 = module0138.$g1623$.currentBinding(var3);
                                                                    try {
                                                                        module0138.$g1623$.bind(var75, var3);
                                                                        SubLObject var81_86;
                                                                        for (var81_86 = module0066.f4838(module0067.f4891(var76)); NIL == module0066.f4841(var81_86); var81_86 = module0066.f4840(var81_86)) {
                                                                            var3.resetMultipleValues();
                                                                            final SubLObject var77 = module0066.f4839(var81_86);
                                                                            final SubLObject var78 = var3.secondMultipleValue();
                                                                            var3.resetMultipleValues();
                                                                            if (NIL != module0141.f9289(var77)) {
                                                                                final SubLObject var6_68 = module0138.$g1624$.currentBinding(var3);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var77, var3);
                                                                                    final SubLObject var79 = var78;
                                                                                    if (NIL != module0077.f5302(var79)) {
                                                                                        final SubLObject var80 = module0077.f5333(var79);
                                                                                        SubLObject var81;
                                                                                        SubLObject var82;
                                                                                        SubLObject var83;
                                                                                        for (var81 = module0032.f1741(var80), var82 = (SubLObject)NIL, var82 = module0032.f1742(var81, var80); NIL == module0032.f1744(var81, var82); var82 = module0032.f1743(var82)) {
                                                                                            var83 = module0032.f1745(var81, var82);
                                                                                            if (NIL != module0032.f1746(var82, var83) && NIL == module0249.f16059(var83, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var83, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149(var83, var9);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var79.isList()) {
                                                                                        SubLObject var84 = var79;
                                                                                        SubLObject var85 = (SubLObject)NIL;
                                                                                        var85 = var84.first();
                                                                                        while (NIL != var84) {
                                                                                            if (NIL == module0249.f16059(var85, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var85, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149(var85, var9);
                                                                                            }
                                                                                            var84 = var84.rest();
                                                                                            var85 = var84.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic67$, var79);
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
                                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic68$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                }
                                                else if (NIL != module0155.f9785(var71, (SubLObject)UNPROVIDED)) {
                                                    SubLObject var15_110;
                                                    final SubLObject var86 = var15_110 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var3), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var3), module0137.f8955((SubLObject)UNPROVIDED)));
                                                    SubLObject var87 = (SubLObject)NIL;
                                                    var87 = var15_110.first();
                                                    while (NIL != var15_110) {
                                                        final SubLObject var6_69 = module0138.$g1625$.currentBinding(var3);
                                                        try {
                                                            module0138.$g1625$.bind(var87, var3);
                                                            final SubLObject var89;
                                                            final SubLObject var88 = var89 = Functions.funcall(var87, var71);
                                                            if (NIL != module0077.f5302(var89)) {
                                                                final SubLObject var90 = module0077.f5333(var89);
                                                                SubLObject var91;
                                                                SubLObject var92;
                                                                SubLObject var93;
                                                                for (var91 = module0032.f1741(var90), var92 = (SubLObject)NIL, var92 = module0032.f1742(var91, var90); NIL == module0032.f1744(var91, var92); var92 = module0032.f1743(var92)) {
                                                                    var93 = module0032.f1745(var91, var92);
                                                                    if (NIL != module0032.f1746(var92, var93) && NIL == module0249.f16059(var93, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var93, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149(var93, var9);
                                                                    }
                                                                }
                                                            }
                                                            else if (var89.isList()) {
                                                                SubLObject var94 = var89;
                                                                SubLObject var95 = (SubLObject)NIL;
                                                                var95 = var94.first();
                                                                while (NIL != var94) {
                                                                    if (NIL == module0249.f16059(var95, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var95, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149(var95, var9);
                                                                    }
                                                                    var94 = var94.rest();
                                                                    var95 = var94.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)$ic67$, var89);
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
                                module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic70$, var7, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)$ic33$;
        if (NIL == f38718(var12, (SubLObject)UNPROVIDED)) {
            var13 = (SubLObject)$ic32$;
            var14 = Sequences.cconcatenate(var14, PrintLow.format((SubLObject)NIL, (SubLObject)$ic71$, var12));
            return Values.values(var13, var14);
        }
        final SubLObject var15 = f38723(var12, (SubLObject)UNPROVIDED);
        if (NIL == var15) {
            var13 = (SubLObject)$ic52$;
            var14 = Sequences.cconcatenate(var14, PrintLow.format((SubLObject)NIL, (SubLObject)$ic72$, var12));
        }
        final SubLObject var16 = f38721(var12, (SubLObject)UNPROVIDED);
        if (NIL == var16) {
            var13 = (SubLObject)$ic52$;
            var14 = Sequences.cconcatenate(var14, PrintLow.format((SubLObject)NIL, (SubLObject)$ic73$, var12));
        }
        return Values.values(var13, var14);
    }
    
    public static SubLObject f38739(final SubLObject var123) {
        final SubLObject var124 = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons(module0631.$g4893$.getGlobalValue(), (SubLObject)$ic74$), (SubLObject)ConsesLow.cons(module0631.$g4894$.getGlobalValue(), (SubLObject)$ic75$), (SubLObject)ConsesLow.cons(module0631.$g4895$.getGlobalValue(), (SubLObject)$ic76$));
        return conses_high.assoc(var123, var124, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED).rest();
    }
    
    public static SubLObject f38740(final SubLObject var125) {
        final SubLObject var126 = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons(module0631.$g4889$.getGlobalValue(), (SubLObject)$ic77$), (SubLObject)ConsesLow.cons(module0631.$g4890$.getGlobalValue(), (SubLObject)$ic78$));
        return conses_high.assoc(var125, var126, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED).rest();
    }
    
    public static SubLObject f38741(final SubLObject var126) {
        final SubLThread var127 = SubLProcess.currentSubLThread();
        assert NIL != module0173.f10955(var126) : var126;
        SubLObject var128 = (SubLObject)NIL;
        final SubLObject var129 = module0147.f9540($ic79$);
        final SubLObject var130 = module0147.$g2095$.currentBinding(var127);
        final SubLObject var131 = module0147.$g2094$.currentBinding(var127);
        final SubLObject var132 = module0147.$g2096$.currentBinding(var127);
        try {
            module0147.$g2095$.bind(module0147.f9545(var129), var127);
            module0147.$g2094$.bind(module0147.f9546(var129), var127);
            module0147.$g2096$.bind(module0147.f9549(var129), var127);
            final SubLObject var134;
            final SubLObject var133 = var134 = module0220.f14593($ic80$, $ic81$, var126, (SubLObject)THREE_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED).first();
            if (var134.eql($ic82$)) {
                var128 = (SubLObject)T;
            }
            else if (var134.eql($ic83$)) {
                var128 = (SubLObject)NIL;
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
        if (NIL != module0233.f15352(var131)) {
            var134 = Mapping.mapcar((SubLObject)$ic84$, var134);
        }
        return var134;
    }
    
    public static SubLObject f38744(final SubLObject var131, final SubLObject var132) {
        final SubLThread var133 = SubLProcess.currentSubLThread();
        if (NIL == var132) {
            return var131;
        }
        final SubLObject var134 = $g4944$.currentBinding(var133);
        try {
            $g4944$.bind(var132, var133);
            return module0036.f2531(var131, (SubLObject)$ic87$, (SubLObject)$ic88$, (SubLObject)UNPROVIDED);
        }
        finally {
            $g4944$.rebind(var134, var133);
        }
    }
    
    public static SubLObject f38745(final SubLObject var10) {
        return (SubLObject)makeBoolean(NIL != module0202.f12659(var10) && NIL != module0202.f12589(var10, $ic89$));
    }
    
    public static SubLObject f38746(final SubLObject var135) {
        final SubLThread var136 = SubLProcess.currentSubLThread();
        final SubLObject var137 = module0205.f13277(var135, (SubLObject)UNPROVIDED);
        final SubLObject var138 = module0035.f2293($g4944$.getDynamicValue(var136), var137, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL == var138) {
            Errors.warn((SubLObject)$ic90$, var137);
        }
        return var138;
    }
    
    public static SubLObject f38747(final SubLObject var138) {
        return f38748(conses_high.copy_list(var138));
    }
    
    public static SubLObject f38748(final SubLObject var138) {
        final SubLObject var139 = Mapping.mapcar((SubLObject)$ic91$, var138);
        final SubLObject var140 = Sort.sort(var139, (SubLObject)$ic92$, (SubLObject)$ic93$);
        return module0035.f2288(var140, Symbols.symbol_function((SubLObject)EQUAL));
    }
    
    public static SubLObject f38749(final SubLObject var141) {
        final SubLThread var142 = SubLProcess.currentSubLThread();
        SubLObject var143 = (SubLObject)NIL;
        SubLObject var144 = (SubLObject)NIL;
        SubLObject var145 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var141, var141, (SubLObject)$ic94$);
        var144 = var141.first();
        final SubLObject var146 = var145 = var141.rest();
        final SubLObject var147 = module0146.$g2018$.currentBinding(var142);
        final SubLObject var148 = module0146.$g2020$.currentBinding(var142);
        try {
            module0146.$g2018$.bind((SubLObject)NIL, var142);
            module0146.$g2020$.bind((SubLObject)NIL, var142);
            final SubLObject var149 = module0205.f13144(module0285.f18875(var145, (SubLObject)UNPROVIDED));
            var143 = module0233.f15340(var144, var149);
        }
        finally {
            module0146.$g2020$.rebind(var148, var142);
            module0146.$g2018$.rebind(var147, var142);
        }
        return var143;
    }
    
    public static SubLObject f38750(final SubLObject var145, final SubLObject var146) {
        SubLObject var147 = (SubLObject)NIL;
        SubLObject var148 = var145;
        SubLObject var149 = (SubLObject)NIL;
        var149 = var148.first();
        while (NIL != var148) {
            SubLObject var150 = (SubLObject)NIL;
            SubLObject var15_149 = var149;
            SubLObject var151 = (SubLObject)NIL;
            var151 = var15_149.first();
            while (NIL != var15_149) {
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
        if (NIL != assertion_handles_oc.f11035(var10)) {
            return module0538.f33367(var10, (SubLObject)UNPROVIDED);
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38753() {
        $g4938$ = SubLFiles.defconstant("S#42468", (SubLObject)$ic0$);
        $g4939$ = SubLFiles.defconstant("S#42469", (SubLObject)$ic1$);
        $g4940$ = SubLFiles.defparameter("S#42470", (SubLObject)NIL);
        $g4941$ = SubLFiles.defparameter("S#42471", (SubLObject)NIL);
        $g4942$ = SubLFiles.defparameter("S#42472", (SubLObject)NIL);
        $g4943$ = SubLFiles.deflexical("S#42473", (SubLObject)$ic2$);
        $g4944$ = SubLFiles.defparameter("S#42474", (SubLObject)$ic85$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f38754() {
        return (SubLObject)NIL;
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
        $g4938$ = null;
        $g4939$ = null;
        $g4940$ = null;
        $g4941$ = null;
        $g4942$ = null;
        $g4943$ = null;
        $g4944$ = null;
        $ic0$ = makeString("I");
        $ic1$ = makeString("C");
        $ic2$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TestVocabularyMt")), constant_handles_oc.f8479((SubLObject)makeString("testQuerySpecification")));
        $ic3$ = makeSymbol("VALID-CONSTANT?");
        $ic4$ = makeSymbol("FORT-P");
        $ic5$ = constant_handles_oc.f8479((SubLObject)makeString("testQuerySpecification"));
        $ic6$ = makeKeyword("TRUE");
        $ic7$ = makeSymbol("S#32663", "CYC");
        $ic8$ = constant_handles_oc.f8479((SubLObject)makeString("KBContentTest-FullySpecified"));
        $ic9$ = constant_handles_oc.f8479((SubLObject)makeString("KBContentTest"));
        $ic10$ = constant_handles_oc.f8479((SubLObject)makeString("KBContentTestSpecificationType"));
        $ic11$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic12$ = makeSymbol("S#32785", "CYC");
        $ic13$ = constant_handles_oc.f8479((SubLObject)makeString("comment"));
        $ic14$ = makeSymbol("COLLECTION-P");
        $ic15$ = makeKeyword("WHO");
        $ic16$ = constant_handles_oc.f8479((SubLObject)makeString("testResponsibleCyclist"));
        $ic17$ = ConsesLow.list((SubLObject)makeKeyword("WHO"));
        $ic18$ = constant_handles_oc.f8479((SubLObject)makeString("testCollectionCyclistResponsible"));
        $ic19$ = constant_handles_oc.f8479((SubLObject)makeString("testMetricsToGather"));
        $ic20$ = constant_handles_oc.f8479((SubLObject)makeString("testAnswersCycL-Exact"));
        $ic21$ = constant_handles_oc.f8479((SubLObject)makeString("testAnswersCycL-Wanted"));
        $ic22$ = constant_handles_oc.f8479((SubLObject)makeString("testAnswersCycL-NotWanted"));
        $ic23$ = constant_handles_oc.f8479((SubLObject)makeString("testAnswersCycLUnimportant"));
        $ic24$ = constant_handles_oc.f8479((SubLObject)makeString("testAnswers-Cardinality-Exact"));
        $ic25$ = constant_handles_oc.f8479((SubLObject)makeString("testAnswers-Cardinality-Min"));
        $ic26$ = constant_handles_oc.f8479((SubLObject)makeString("testAnswers-Cardinality-Max"));
        $ic27$ = ConsesLow.list(new SubLObject[] { constant_handles_oc.f8479((SubLObject)makeString("testAnswersCycL-Exact")), constant_handles_oc.f8479((SubLObject)makeString("testAnswersCycL-Wanted")), constant_handles_oc.f8479((SubLObject)makeString("testAnswersCycL-NotWanted")), constant_handles_oc.f8479((SubLObject)makeString("testAnswersCycLUnimportant")), constant_handles_oc.f8479((SubLObject)makeString("testAnswerSupport-Wanted")), constant_handles_oc.f8479((SubLObject)makeString("testAnswerSupport-NotWanted")), constant_handles_oc.f8479((SubLObject)makeString("testAnswerSupportedByHLSupportModule-Wanted")), constant_handles_oc.f8479((SubLObject)makeString("testAnswerSupportedByHLSupportModule-NotWanted")), constant_handles_oc.f8479((SubLObject)makeString("testResponsibleCyclist")), constant_handles_oc.f8479((SubLObject)makeString("testQuerySpecification")) });
        $ic28$ = makeSymbol("S#12274", "CYC");
        $ic29$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic30$ = makeKeyword("GAF");
        $ic31$ = constant_handles_oc.f8479((SubLObject)makeString("TestVocabularyMt"));
        $ic32$ = makeKeyword("SEVERE");
        $ic33$ = makeString("");
        $ic34$ = makeString("~%~A is not a #$KBContentTest-FullySpecified.");
        $ic35$ = makeKeyword("NOT-A-TEST-SPECIFICATION");
        $ic36$ = makeString("~%~A does not have a valid arg2 for #$testQuerySpecification.");
        $ic37$ = makeKeyword("NO-VALID-QUERY");
        $ic38$ = makeString(" has no #$testAnswer-MultipleChoice.");
        $ic39$ = makeKeyword("NO-TEST-EXPECTATION");
        $ic40$ = constant_handles_oc.f8479((SubLObject)makeString("testAnswerSupport-Wanted"));
        $ic41$ = constant_handles_oc.f8479((SubLObject)makeString("testAnswerSupport-NotWanted"));
        $ic42$ = constant_handles_oc.f8479((SubLObject)makeString("testAnswerSupportedByHLSupportModule-Wanted"));
        $ic43$ = constant_handles_oc.f8479((SubLObject)makeString("testAnswerSupportedByHLSupportModule-NotWanted"));
        $ic44$ = makeString("~%~A has no stated test expectation.");
        $ic45$ = makeString("~%~A's exact answer should include only #$ELInferenceBindingSets, but these are not: ");
        $ic46$ = makeKeyword("EXACT-ANSWER-CONTAINS-MALFORMED-INFERENCE-BINDING-SET");
        $ic47$ = makeString("~A ");
        $ic48$ = makeString("~%~A's wanted answer should be an #$ELInferenceBindingSet but isn't: ");
        $ic49$ = makeKeyword("WANTED-ANSWER-IS-NOT-AN-INFERENCE-BINDING-SET");
        $ic50$ = makeString("~%~A's unwanted answer should be an #$ELInferenceBindingSet but isn't: ");
        $ic51$ = makeKeyword("UNWANTED-ANSWER-IS-NOT-AN-INFERENCE-BINDING-SET");
        $ic52$ = makeKeyword("PROBLEM");
        $ic53$ = makeString("~%~A does not have a responsible Cyclist.");
        $ic54$ = makeKeyword("NO-RESPONSIBLE-CYCLIST");
        $ic55$ = makeKeyword("BREADTH");
        $ic56$ = makeKeyword("QUEUE");
        $ic57$ = makeKeyword("STACK");
        $ic58$ = makeSymbol("S#11450", "CYC");
        $ic59$ = makeKeyword("ERROR");
        $ic60$ = makeString("~A is not a ~A");
        $ic61$ = makeSymbol("S#11592", "CYC");
        $ic62$ = makeKeyword("CERROR");
        $ic63$ = makeString("continue anyway");
        $ic64$ = makeKeyword("WARN");
        $ic65$ = makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic66$ = constant_handles_oc.f8479((SubLObject)makeString("AreteQuery"));
        $ic67$ = makeString("~A is neither SET-P nor LISTP.");
        $ic68$ = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic69$ = ConsesLow.list((SubLObject)makeUninternedSymbol("US#4D5E436"), (SubLObject)makeUninternedSymbol("US#1526883"), (SubLObject)makeUninternedSymbol("US#15AA083"));
        $ic70$ = makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic71$ = makeString("~%~A is not a #$KBContentTestSpecificationType!");
        $ic72$ = makeString("~%~A has no responsible Cyclists.");
        $ic73$ = makeString("~%~A has no instances.");
        $ic74$ = makeString("Sampling");
        $ic75$ = makeString("Hypothesize");
        $ic76$ = makeString("Simple");
        $ic77$ = makeString("Test Set");
        $ic78$ = makeString("Individual Test");
        $ic79$ = constant_handles_oc.f8479((SubLObject)makeString("CycArchitectureMt"));
        $ic80$ = constant_handles_oc.f8479((SubLObject)makeString("CycKBContentTestFramework"));
        $ic81$ = constant_handles_oc.f8479((SubLObject)makeString("defaultSoftwareParameterValueInSoftwareObject"));
        $ic82$ = constant_handles_oc.f8479((SubLObject)makeString("True"));
        $ic83$ = constant_handles_oc.f8479((SubLObject)makeString("False"));
        $ic84$ = makeSymbol("S#42463", "CYC");
        $ic85$ = makeKeyword("UNINITIALIZED");
        $ic86$ = makeSymbol("S#5859", "CYC");
        $ic87$ = makeSymbol("S#42461", "CYC");
        $ic88$ = makeSymbol("S#42462", "CYC");
        $ic89$ = constant_handles_oc.f8479((SubLObject)makeString("HypotheticalForVariableFn"));
        $ic90$ = makeString("When determining test results, could not find a hypothetical binding for the variable ~a");
        $ic91$ = makeSymbol("S#42465", "CYC");
        $ic92$ = makeSymbol("S#3846", "CYC");
        $ic93$ = makeSymbol("S#18076", "CYC");
        $ic94$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("VARIABLE"), (SubLObject)makeSymbol("S#132", "CYC"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 1185 ms
	
	Decompiled with Procyon 0.5.32.
*/