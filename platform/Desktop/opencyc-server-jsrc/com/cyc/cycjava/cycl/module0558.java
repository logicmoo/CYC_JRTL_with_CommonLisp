package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0558 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0558";
    public static final String myFingerPrint = "51932f7a98ae34559a6031e472155504ae2cfbbf601a59d0ecf9621e7a485785";
    private static SubLSymbol $g4026$;
    private static SubLSymbol $g4027$;
    private static SubLSymbol $g4028$;
    private static SubLSymbol $g4029$;
    private static SubLSymbol $g4030$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLFloat $ic6$;
    private static final SubLString $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLString $ic12$;
    private static final SubLList $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLString $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLFloat $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLList $ic22$;
    private static final SubLList $ic23$;
    private static final SubLList $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLList $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLList $ic33$;
    private static final SubLList $ic34$;
    
    public static SubLObject f34308(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0558.NIL;
        SubLObject var6 = (SubLObject)module0558.NIL;
        SubLObject var7 = (SubLObject)module0558.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0558.$ic0$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0558.$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0558.$ic0$);
        var7 = var4.first();
        var4 = var4.rest();
        if (module0558.NIL == var4) {
            return (SubLObject)ConsesLow.list((SubLObject)module0558.$ic1$, (SubLObject)ConsesLow.list((SubLObject)module0558.$ic2$, var7), (SubLObject)ConsesLow.list((SubLObject)module0558.$ic3$, var5, var6));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0558.$ic0$);
        return (SubLObject)module0558.NIL;
    }
    
    public static SubLObject f34309(final SubLObject var8, final SubLObject var9, SubLObject var10, SubLObject var7) {
        if (var10 == module0558.UNPROVIDED) {
            var10 = (SubLObject)module0558.NIL;
        }
        if (var7 == module0558.UNPROVIDED) {
            var7 = (SubLObject)module0558.NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        var11.resetMultipleValues();
        final SubLObject var12 = f34310(var8, var9, var10, var7);
        final SubLObject var13 = var11.secondMultipleValue();
        final SubLObject var14 = var11.thirdMultipleValue();
        var11.resetMultipleValues();
        final SubLObject var15 = (SubLObject)SubLObjectFactory.makeBoolean(module0558.$ic4$ == var12 || module0558.$ic5$ == var12);
        return Values.values(var15, var13, var14);
    }
    
    public static SubLObject f34310(final SubLObject var8, final SubLObject var9, SubLObject var10, SubLObject var7) {
        if (var10 == module0558.UNPROVIDED) {
            var10 = (SubLObject)module0558.NIL;
        }
        if (var7 == module0558.UNPROVIDED) {
            var7 = (SubLObject)module0558.NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        SubLObject var12 = (SubLObject)module0558.NIL;
        var11.resetMultipleValues();
        final SubLObject var13 = f34311(var8, var9, var10, var7);
        final SubLObject var14 = var11.secondMultipleValue();
        final SubLObject var15 = var11.thirdMultipleValue();
        var11.resetMultipleValues();
        if (module0558.MINUS_ONE_INTEGER.numG(var13) || module0558.ONE_INTEGER.numL(var13)) {
            Errors.error((SubLObject)module0558.$ic7$, var13);
        }
        else if (module0558.MINUS_ONE_INTEGER.numE(var13)) {
            var12 = (SubLObject)module0558.$ic8$;
        }
        else if (module0558.ONE_INTEGER.numE(var13)) {
            var12 = (SubLObject)module0558.$ic4$;
        }
        else if (Numbers.minus(module0558.$g4026$.getDynamicValue(var11)).numG(var13)) {
            var12 = (SubLObject)module0558.$ic9$;
        }
        else if (module0558.$g4026$.getDynamicValue(var11).numL(var13)) {
            var12 = (SubLObject)module0558.$ic5$;
        }
        else {
            var12 = (SubLObject)module0558.$ic10$;
        }
        return Values.values(var12, var14, var15);
    }
    
    public static SubLObject f34311(final SubLObject var8, final SubLObject var9, SubLObject var10, SubLObject var7) {
        if (var10 == module0558.UNPROVIDED) {
            var10 = (SubLObject)module0558.NIL;
        }
        if (var7 == module0558.UNPROVIDED) {
            var7 = (SubLObject)module0558.NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        assert module0558.NIL != module0173.f10955(var8) : var8;
        assert module0558.NIL != module0173.f10955(var9) : var9;
        SubLObject var12 = (SubLObject)module0558.ZERO_INTEGER;
        SubLObject var13 = (SubLObject)module0558.NIL;
        SubLObject var14 = (SubLObject)module0558.NIL;
        SubLObject var15 = (SubLObject)module0558.NIL;
        final SubLObject var16 = var10;
        final SubLObject var17 = module0147.$g2095$.currentBinding(var11);
        final SubLObject var18 = module0147.$g2094$.currentBinding(var11);
        final SubLObject var19 = module0147.$g2096$.currentBinding(var11);
        try {
            module0147.$g2095$.bind(module0147.f9545(var16), var11);
            module0147.$g2094$.bind(module0147.f9546(var16), var11);
            module0147.$g2096$.bind(module0147.f9549(var16), var11);
            if (module0558.NIL != module0331.f22386(var8, var9)) {
                var12 = (SubLObject)module0558.MINUS_ONE_INTEGER;
                if (module0558.NIL != f34312(var7)) {
                    var15 = module0331.f22392(var8, var9);
                }
                var13 = (SubLObject)module0558.T;
            }
            else if (module0558.NIL != module0331.f22370(var8, var9, (SubLObject)module0558.UNPROVIDED, (SubLObject)module0558.UNPROVIDED)) {
                var12 = (SubLObject)module0558.ONE_INTEGER;
                if (module0558.NIL != f34312(var7)) {
                    var14 = module0331.f22373(var8, var9, (SubLObject)module0558.UNPROVIDED, (SubLObject)module0558.UNPROVIDED);
                }
                var13 = (SubLObject)module0558.T;
            }
            else if (module0558.NIL != module0257.f16692(var8, var9, (SubLObject)module0558.UNPROVIDED, (SubLObject)module0558.UNPROVIDED)) {
                var12 = (SubLObject)module0558.MINUS_ONE_INTEGER;
                if (module0558.NIL != f34312(var7)) {
                    var15 = module0257.f16694(var8, var9, (SubLObject)module0558.UNPROVIDED, (SubLObject)module0558.UNPROVIDED);
                }
                var13 = (SubLObject)module0558.T;
            }
            else {
                var11.resetMultipleValues();
                final SubLObject var22_23 = f34313(var8, var9, var10, var7);
                final SubLObject var24_25 = var11.secondMultipleValue();
                final SubLObject var26_27 = var11.thirdMultipleValue();
                final SubLObject var28_29 = var11.fourthMultipleValue();
                var11.resetMultipleValues();
                var12 = var22_23;
                var13 = var24_25;
                var14 = var26_27;
                var15 = var28_29;
            }
        }
        finally {
            module0147.$g2096$.rebind(var19, var11);
            module0147.$g2094$.rebind(var18, var11);
            module0147.$g2095$.rebind(var17, var11);
        }
        return Values.values(var12, var13, (SubLObject)ConsesLow.list(var14, var15));
    }
    
    public static SubLObject f34313(final SubLObject var8, final SubLObject var9, final SubLObject var10, SubLObject var7) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        SubLObject var12 = (SubLObject)module0558.ZERO_INTEGER;
        SubLObject var13 = (SubLObject)module0558.NIL;
        SubLObject var14 = (SubLObject)module0558.NIL;
        SubLObject var15 = (SubLObject)module0558.NIL;
        final SubLObject var17;
        final SubLObject var16 = var17 = module0034.f1888();
        final SubLObject var18 = module0034.$g879$.currentBinding(var11);
        try {
            module0034.$g879$.bind(var17, var11);
            SubLObject var19 = (SubLObject)module0558.NIL;
            if (module0558.NIL != var17 && module0558.NIL == module0034.f1842(var17)) {
                var19 = module0034.f1869(var17);
                final SubLObject var20 = Threads.current_process();
                if (module0558.NIL == var19) {
                    module0034.f1873(var17, var20);
                }
                else if (!var19.eql(var20)) {
                    Errors.error((SubLObject)module0558.$ic12$);
                }
            }
            try {
                var7 = f34314(var7);
            }
            finally {
                final SubLObject var19_34 = Threads.$is_thread_performing_cleanupP$.currentBinding(var11);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0558.T, var11);
                    var11.resetMultipleValues();
                    final SubLObject var21 = f34315(var8, var9, var10, var7);
                    final SubLObject var22 = var11.secondMultipleValue();
                    final SubLObject var23 = var11.thirdMultipleValue();
                    final SubLObject var24 = var11.fourthMultipleValue();
                    var11.resetMultipleValues();
                    if (module0558.NIL != var22) {
                        var12 = (SubLObject)module0558.MINUS_ONE_INTEGER;
                        SubLObject var26;
                        final SubLObject var25 = var26 = var22;
                        SubLObject var27 = (SubLObject)module0558.NIL;
                        SubLObject var28 = (SubLObject)module0558.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var26, var25, (SubLObject)module0558.$ic13$);
                        var27 = var26.first();
                        var26 = var26.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var26, var25, (SubLObject)module0558.$ic13$);
                        var28 = var26.first();
                        var26 = var26.rest();
                        if (module0558.NIL == var26) {
                            if (module0558.NIL != f34312(var7)) {
                                var15 = (SubLObject)ConsesLow.cons(var27, var28);
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var25, (SubLObject)module0558.$ic13$);
                        }
                        var13 = (SubLObject)module0558.T;
                    }
                    else if (module0558.NIL == var21) {
                        var12 = f34316(var8, var9, var23, var24);
                        var13 = (SubLObject)module0558.T;
                    }
                    else {
                        var11.resetMultipleValues();
                        final SubLObject var42_43 = f34317(var8, var9, var21, var23, var24, var7);
                        final SubLObject var44_45 = var11.secondMultipleValue();
                        final SubLObject var46_47 = var11.thirdMultipleValue();
                        var11.resetMultipleValues();
                        var12 = var42_43;
                        var14 = var44_45;
                        var15 = var46_47;
                        var13 = (SubLObject)module0558.T;
                    }
                    if (module0558.NIL != f34318(var7)) {
                        module0361.f24005(f34319(var7));
                    }
                    if (module0558.NIL != var17 && module0558.NIL == var19) {
                        module0034.f1873(var17, (SubLObject)module0558.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var19_34, var11);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var18, var11);
        }
        return Values.values(var12, var13, var14, var15);
    }
    
    public static SubLObject f34315(final SubLObject var8, final SubLObject var9, final SubLObject var10, final SubLObject var7) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        var11.resetMultipleValues();
        final SubLObject var12 = f34320(var8, var9, var10, var7);
        final SubLObject var13 = var11.secondMultipleValue();
        final SubLObject var14 = var11.thirdMultipleValue();
        var11.resetMultipleValues();
        if (module0558.NIL != var13) {
            return Values.values((SubLObject)module0558.NIL, var13, (SubLObject)module0558.NIL, (SubLObject)module0558.NIL);
        }
        var11.resetMultipleValues();
        final SubLObject var15 = f34320(var9, var8, var10, var7);
        final SubLObject var16 = var11.secondMultipleValue();
        final SubLObject var17 = var11.thirdMultipleValue();
        var11.resetMultipleValues();
        if (module0558.NIL != var16) {
            return Values.values((SubLObject)module0558.NIL, var16, (SubLObject)module0558.NIL, (SubLObject)module0558.NIL);
        }
        final SubLObject var18 = Sequences.delete_duplicates(ConsesLow.append(var12, var15), (SubLObject)module0558.$ic14$, (SubLObject)module0558.UNPROVIDED, (SubLObject)module0558.UNPROVIDED, (SubLObject)module0558.UNPROVIDED);
        return Values.values(var18, (SubLObject)module0558.NIL, var14, var17);
    }
    
    public static SubLObject f34320(final SubLObject var52, final SubLObject var53, final SubLObject var10, final SubLObject var7) {
        final SubLThread var54 = SubLProcess.currentSubLThread();
        final SubLObject var55 = module0205.f13144(var52);
        final SubLObject var56 = module0205.f13144(var53);
        SubLObject var57 = (SubLObject)module0558.NIL;
        SubLObject var58 = (SubLObject)module0558.NIL;
        SubLObject var59 = (SubLObject)module0558.NIL;
        if (module0558.NIL == var58) {
            SubLObject var60 = f34321(var52, var7);
            SubLObject var61 = (SubLObject)module0558.NIL;
            var61 = var60.first();
            while (module0558.NIL == var58 && module0558.NIL != var60) {
                var54.resetMultipleValues();
                final SubLObject var62 = f34322(var61, var55, var56, var10, var7);
                final SubLObject var63 = var54.secondMultipleValue();
                var54.resetMultipleValues();
                final SubLObject var64 = var62;
                if (var64.eql((SubLObject)module0558.$ic15$)) {
                    var57 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var61), var63), var57);
                }
                else if (var64.eql((SubLObject)module0558.$ic16$)) {
                    var58 = (SubLObject)ConsesLow.list(var61, var63);
                }
                else if (var64.eql((SubLObject)module0558.$ic10$)) {
                    var59 = (SubLObject)ConsesLow.cons(var61, var59);
                }
                else {
                    Errors.error((SubLObject)module0558.$ic17$, var62);
                }
                var60 = var60.rest();
                var61 = var60.first();
            }
        }
        return Values.values(var57, var58, var59);
    }
    
    public static SubLObject f34322(final SubLObject var41, final SubLObject var52, final SubLObject var53, final SubLObject var10, final SubLObject var7) {
        final SubLThread var54 = SubLProcess.currentSubLThread();
        final SubLObject var55 = module0205.f13144(module0178.f11303(var41));
        final SubLObject var56 = module0205.f13250(var53, var52, var55, Symbols.symbol_function((SubLObject)module0558.EQUAL), (SubLObject)module0558.UNPROVIDED);
        var54.resetMultipleValues();
        final SubLObject var57 = f34323(module0205.f13338(var56), var10, var7);
        final SubLObject var58 = var54.secondMultipleValue();
        var54.resetMultipleValues();
        var54.resetMultipleValues();
        final SubLObject var59 = f34323(var56, var10, var7);
        final SubLObject var60 = var54.secondMultipleValue();
        var54.resetMultipleValues();
        if (module0558.NIL != var57 && module0558.NIL != var59) {
            return Values.values((SubLObject)module0558.$ic10$, conses_high.union(var58, var60, Symbols.symbol_function((SubLObject)module0558.EQUAL), (SubLObject)module0558.UNPROVIDED));
        }
        if (module0558.NIL != var57) {
            return Values.values((SubLObject)module0558.$ic16$, var58);
        }
        if (module0558.NIL != var59) {
            return Values.values((SubLObject)module0558.$ic15$, var60);
        }
        return Values.values((SubLObject)module0558.$ic10$, (SubLObject)module0558.NIL);
    }
    
    public static SubLObject f34321(final SubLObject var67, final SubLObject var7) {
        SubLObject var68 = (SubLObject)module0558.NIL;
        if (module0558.NIL != module0158.f10282(var67, (SubLObject)module0558.NIL)) {
            final SubLObject var69 = module0158.f10283(var67, (SubLObject)module0558.NIL);
            SubLObject var70 = (SubLObject)module0558.NIL;
            final SubLObject var71 = (SubLObject)module0558.NIL;
            while (module0558.NIL == var70) {
                final SubLObject var72 = module0052.f3695(var69, var71);
                final SubLObject var73 = (SubLObject)SubLObjectFactory.makeBoolean(!var71.eql(var72));
                if (module0558.NIL != var73) {
                    SubLObject var74 = (SubLObject)module0558.NIL;
                    try {
                        var74 = module0158.f10316(var72, (SubLObject)module0558.NIL, (SubLObject)module0558.NIL, (SubLObject)module0558.NIL);
                        SubLObject var70_75 = (SubLObject)module0558.NIL;
                        final SubLObject var71_76 = (SubLObject)module0558.NIL;
                        while (module0558.NIL == var70_75) {
                            final SubLObject var75 = module0052.f3695(var74, var71_76);
                            final SubLObject var73_77 = (SubLObject)SubLObjectFactory.makeBoolean(!var71_76.eql(var75));
                            if (module0558.NIL != var73_77 && module0558.NIL != module0158.f10284(var75, var72) && module0558.NIL == f34324(var75, var67, var7)) {
                                var68 = (SubLObject)ConsesLow.cons(var75, var68);
                            }
                            var70_75 = (SubLObject)SubLObjectFactory.makeBoolean(module0558.NIL == var73_77);
                        }
                    }
                    finally {
                        final SubLObject var76 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0558.T);
                            if (module0558.NIL != var74) {
                                module0158.f10319(var74);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var76);
                        }
                    }
                }
                var70 = (SubLObject)SubLObjectFactory.makeBoolean(module0558.NIL == var73);
            }
        }
        var68 = module0035.f2462(var68, (SubLObject)module0558.$ic18$, (SubLObject)module0558.UNPROVIDED);
        return var68;
    }
    
    public static SubLObject f34324(final SubLObject var41, final SubLObject var67, final SubLObject var7) {
        final SubLThread var68 = SubLProcess.currentSubLThread();
        if (module0558.NIL == module0178.f11284(var41)) {
            return (SubLObject)module0558.T;
        }
        if (module0558.NIL != module0228.f15209(var41)) {
            return (SubLObject)module0558.T;
        }
        if (module0558.NIL == f34325(var7) && module0558.NIL != module0178.f11324(var41)) {
            return (SubLObject)module0558.T;
        }
        if (module0558.NIL != module0035.f2169(module0178.f11332(var41), f34326(var7))) {
            return (SubLObject)module0558.T;
        }
        SubLObject var69 = (SubLObject)module0558.NIL;
        final SubLObject var70 = module0205.$g2314$.currentBinding(var68);
        try {
            module0205.$g2314$.bind((SubLObject)module0558.$ic19$, var68);
            var69 = (SubLObject)SubLObjectFactory.makeBoolean(module0558.NIL == module0205.f13220(var67, var41, (SubLObject)module0558.T, (SubLObject)module0558.UNPROVIDED, (SubLObject)module0558.UNPROVIDED));
        }
        finally {
            module0205.$g2314$.rebind(var70, var68);
        }
        return var69;
    }
    
    public static SubLObject f34327(final SubLObject var79, final SubLObject var80) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var79.eql(var80) || (module0178.f11303(var79).equal(module0178.f11303(var80)) && module0558.NIL != module0262.f17336(module0178.f11287(var79), module0178.f11287(var80), (SubLObject)module0558.UNPROVIDED, (SubLObject)module0558.UNPROVIDED)));
    }
    
    public static SubLObject f34323(final SubLObject var81, final SubLObject var10, final SubLObject var7) {
        final SubLThread var82 = SubLProcess.currentSubLThread();
        final SubLObject var83 = f34328(var81, var7);
        var82.resetMultipleValues();
        final SubLObject var84 = module0409.f28506(var81, var10, var83);
        final SubLObject var85 = var82.secondMultipleValue();
        final SubLObject var86 = var82.thirdMultipleValue();
        final SubLObject var87 = var82.fourthMultipleValue();
        var82.resetMultipleValues();
        if (module0558.NIL != var84) {
            final SubLObject var88 = var84.first();
            final SubLObject var89 = conses_high.second(var88);
            return Values.values((SubLObject)module0558.T, var89);
        }
        return Values.values((SubLObject)module0558.NIL, (SubLObject)module0558.NIL);
    }
    
    public static SubLObject f34316(final SubLObject var8, final SubLObject var9, final SubLObject var37, final SubLObject var38) {
        final SubLThread var39 = SubLProcess.currentSubLThread();
        return f34329(var37, var38, module0558.$g4027$.getDynamicValue(var39));
    }
    
    public static SubLObject f34329(final SubLObject var37, final SubLObject var38, final SubLObject var88) {
        assert module0558.NIL != Types.numberp(var88) : var88;
        final SubLObject var89 = Sequences.length(var37);
        final SubLObject var90 = Sequences.length(var38);
        return Numbers.add((SubLObject)module0558.MINUS_ONE_INTEGER, Numbers.expt(var88, Numbers.minus(Numbers.min(var89, var90))));
    }
    
    public static SubLObject f34317(final SubLObject var8, final SubLObject var9, final SubLObject var35, final SubLObject var37, final SubLObject var38, final SubLObject var7) {
        final SubLThread var39 = SubLProcess.currentSubLThread();
        SubLObject var40 = (SubLObject)module0558.ZERO_INTEGER;
        SubLObject var41 = (SubLObject)module0558.NIL;
        SubLObject var42 = (SubLObject)module0558.NIL;
        var40 = Numbers.add(var40, f34330(var35, module0558.$g4028$.getDynamicValue(var39)));
        if (module0558.NIL != f34312(var7)) {
            var41 = var35;
        }
        var40 = Numbers.add(var40, f34329(var37, var38, module0558.$g4029$.getDynamicValue(var39)));
        if (module0558.NIL != f34312(var7)) {
            var42 = ConsesLow.append(var37, var38);
        }
        return Values.values(var40, var41, var42);
    }
    
    public static SubLObject f34330(final SubLObject var35, final SubLObject var88) {
        final SubLThread var89 = SubLProcess.currentSubLThread();
        SubLObject var90 = (SubLObject)module0558.ZERO_INTEGER;
        SubLObject var91 = var35;
        SubLObject var92 = (SubLObject)module0558.NIL;
        var92 = var91.first();
        while (module0558.NIL != var91) {
            SubLObject var94;
            final SubLObject var93 = var94 = var92;
            cdestructuring_bind.destructuring_bind_must_consp(var94, var93, (SubLObject)module0558.$ic22$);
            final SubLObject var95 = var94.rest();
            var94 = var94.first();
            SubLObject var96 = (SubLObject)module0558.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var94, var93, (SubLObject)module0558.$ic22$);
            var96 = var94.first();
            var94 = var94.rest();
            if (module0558.NIL == var94) {
                var94 = var95;
                SubLObject var97 = (SubLObject)module0558.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var94, var93, (SubLObject)module0558.$ic22$);
                var97 = var94.first();
                var94 = var94.rest();
                if (module0558.NIL == var94) {
                    final SubLObject var98 = module0178.f11287(var96);
                    final SubLObject var99 = (SubLObject)((module0558.NIL != module0132.f8596(var98)) ? module0558.$g4030$.getDynamicValue(var89) : module0558.ONE_INTEGER);
                    var90 = Numbers.add(var90, var99);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var93, (SubLObject)module0558.$ic22$);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var93, (SubLObject)module0558.$ic22$);
            }
            var91 = var91.rest();
            var92 = var91.first();
        }
        return Numbers.subtract((SubLObject)module0558.ONE_INTEGER, Numbers.expt(var88, Numbers.minus(var90)));
    }
    
    public static SubLObject f34331(final SubLObject var98, final SubLObject var99) {
        SubLObject var100 = (SubLObject)module0558.NIL;
        SubLObject var101 = (SubLObject)module0558.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var98, var98, (SubLObject)module0558.$ic23$);
        var100 = var98.first();
        SubLObject var102 = var98.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var102, var98, (SubLObject)module0558.$ic23$);
        var101 = var102.first();
        var102 = var102.rest();
        if (module0558.NIL == var102) {
            SubLObject var103 = (SubLObject)module0558.NIL;
            SubLObject var104 = (SubLObject)module0558.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var99, var99, (SubLObject)module0558.$ic24$);
            var103 = var99.first();
            SubLObject var106_107 = var99.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var106_107, var99, (SubLObject)module0558.$ic24$);
            var104 = var106_107.first();
            var106_107 = var106_107.rest();
            if (module0558.NIL == var106_107) {
                if ((module0558.NIL != module0035.f2201(var100, var103, Symbols.symbol_function((SubLObject)module0558.EQUAL)) && module0558.NIL != module0035.f2201(var101, var104, Symbols.symbol_function((SubLObject)module0558.EQUAL))) || (module0558.NIL != module0035.f2201(var100, var104, Symbols.symbol_function((SubLObject)module0558.EQUAL)) && module0558.NIL != module0035.f2201(var101, var103, Symbols.symbol_function((SubLObject)module0558.EQUAL)))) {
                    return (SubLObject)module0558.T;
                }
                final SubLObject var105 = module0333.f22430(var100);
                final SubLObject var106 = module0333.f22430(var101);
                final SubLObject var107 = module0333.f22430(var103);
                final SubLObject var108 = module0333.f22430(var104);
                return (SubLObject)SubLObjectFactory.makeBoolean((module0558.NIL != module0035.f2201(var105, var107, (SubLObject)module0558.UNPROVIDED) && module0558.NIL != module0035.f2201(var106, var108, (SubLObject)module0558.UNPROVIDED)) || (module0558.NIL != module0035.f2201(var105, var108, (SubLObject)module0558.UNPROVIDED) && module0558.NIL != module0035.f2201(var106, var107, (SubLObject)module0558.UNPROVIDED)));
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var99, (SubLObject)module0558.$ic24$);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var98, (SubLObject)module0558.$ic23$);
        }
        return (SubLObject)module0558.NIL;
    }
    
    public static SubLObject f34332(final SubLObject var114, final SubLObject var115) {
        if (module0558.NIL != module0035.f2201(var114, var115, Symbols.symbol_function((SubLObject)module0558.EQUAL))) {
            return (SubLObject)module0558.T;
        }
        final SubLObject var116 = module0333.f22430(var114);
        final SubLObject var117 = module0333.f22430(var115);
        return module0035.f2201(var116, var117, Symbols.symbol_function((SubLObject)module0558.EQUAL));
    }
    
    public static SubLObject f34333(final SubLObject var114, final SubLObject var115) {
        final SubLThread var116 = SubLProcess.currentSubLThread();
        final SubLObject var117 = module0034.$g879$.getDynamicValue(var116);
        SubLObject var118 = (SubLObject)module0558.NIL;
        if (module0558.NIL == var117) {
            return f34332(var114, var115);
        }
        var118 = module0034.f1857(var117, (SubLObject)module0558.$ic25$, (SubLObject)module0558.UNPROVIDED);
        if (module0558.NIL == var118) {
            var118 = module0034.f1807(module0034.f1842(var117), (SubLObject)module0558.$ic25$, (SubLObject)module0558.TWO_INTEGER, (SubLObject)module0558.NIL, (SubLObject)module0558.EQUAL, (SubLObject)module0558.UNPROVIDED);
            module0034.f1860(var117, (SubLObject)module0558.$ic25$, var118);
        }
        final SubLObject var119 = module0034.f1782(var114, var115);
        final SubLObject var120 = module0034.f1814(var118, var119, (SubLObject)module0558.UNPROVIDED);
        if (var120 != module0558.$ic26$) {
            SubLObject var121 = var120;
            SubLObject var122 = (SubLObject)module0558.NIL;
            var122 = var121.first();
            while (module0558.NIL != var121) {
                SubLObject var123 = var122.first();
                final SubLObject var124 = conses_high.second(var122);
                if (var114.equal(var123.first())) {
                    var123 = var123.rest();
                    if (module0558.NIL != var123 && module0558.NIL == var123.rest() && var115.equal(var123.first())) {
                        return module0034.f1959(var124);
                    }
                }
                var121 = var121.rest();
                var122 = var121.first();
            }
        }
        final SubLObject var125 = Values.arg2(var116.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f34332(var114, var115)));
        module0034.f1836(var118, var119, var120, var125, (SubLObject)ConsesLow.list(var114, var115));
        return module0034.f1959(var125);
    }
    
    public static SubLObject f34314(SubLObject var7) {
        SubLObject var8 = f34319(var7);
        if (module0558.NIL == module0361.f24009(var8)) {
            final SubLObject var9 = module0339.f22757();
            if (module0558.NIL != oc_inference_datastructures_inference.f25275(var9)) {
                var8 = oc_inference_datastructures_inference.f25421(var9);
            }
            else {
                var8 = module0361.f24136((SubLObject)module0558.$ic27$);
                var7 = conses_high.putf(var7, (SubLObject)module0558.$ic28$, (SubLObject)module0558.T);
            }
            var7 = conses_high.putf(var7, (SubLObject)module0558.$ic29$, var8);
        }
        return var7;
    }
    
    public static SubLObject f34312(final SubLObject var7) {
        return conses_high.getf(var7, (SubLObject)module0558.$ic30$, (SubLObject)module0558.UNPROVIDED);
    }
    
    public static SubLObject f34319(final SubLObject var7) {
        return conses_high.getf(var7, (SubLObject)module0558.$ic29$, (SubLObject)module0558.UNPROVIDED);
    }
    
    public static SubLObject f34318(final SubLObject var7) {
        return conses_high.getf(var7, (SubLObject)module0558.$ic28$, (SubLObject)module0558.UNPROVIDED);
    }
    
    public static SubLObject f34325(final SubLObject var7) {
        return conses_high.getf(var7, (SubLObject)module0558.$ic31$, (SubLObject)module0558.UNPROVIDED);
    }
    
    public static SubLObject f34326(final SubLObject var7) {
        return conses_high.getf(var7, (SubLObject)module0558.$ic32$, (SubLObject)module0558.$ic33$);
    }
    
    public static SubLObject f34328(final SubLObject var62, final SubLObject var7) {
        final SubLObject var63 = f34319(var7);
        final SubLObject var64 = (SubLObject)ConsesLow.listS((SubLObject)module0558.$ic29$, var63, (SubLObject)module0558.$ic34$);
        return var64;
    }
    
    public static SubLObject f34334() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0558", "f34308", "S#37562");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0558", "f34309", "S#37563", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0558", "f34310", "S#37564", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0558", "f34311", "S#37565", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0558", "f34313", "S#37566", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0558", "f34315", "S#37567", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0558", "f34320", "S#37568", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0558", "f34322", "S#37569", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0558", "f34321", "S#37570", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0558", "f34324", "S#37571", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0558", "f34327", "S#37572", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0558", "f34323", "S#37573", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0558", "f34316", "S#37574", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0558", "f34329", "S#37575", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0558", "f34317", "S#37576", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0558", "f34330", "S#37577", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0558", "f34331", "S#37578", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0558", "f34332", "S#37579", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0558", "f34333", "S#37580", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0558", "f34314", "S#37581", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0558", "f34312", "S#37582", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0558", "f34319", "S#37583", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0558", "f34318", "S#37584", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0558", "f34325", "S#37585", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0558", "f34326", "S#37586", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0558", "f34328", "S#37587", 2, 0, false);
        return (SubLObject)module0558.NIL;
    }
    
    public static SubLObject f34335() {
        module0558.$g4026$ = SubLFiles.defparameter("S#37588", (SubLObject)module0558.$ic6$);
        module0558.$g4027$ = SubLFiles.defparameter("S#37589", (SubLObject)module0558.$ic20$);
        module0558.$g4028$ = SubLFiles.defparameter("S#37590", (SubLObject)module0558.$ic20$);
        module0558.$g4029$ = SubLFiles.defparameter("S#37591", (SubLObject)module0558.$ic20$);
        module0558.$g4030$ = SubLFiles.defparameter("S#37592", (SubLObject)module0558.$ic6$);
        return (SubLObject)module0558.NIL;
    }
    
    public static SubLObject f34336() {
        module0034.f1895((SubLObject)module0558.$ic25$);
        return (SubLObject)module0558.NIL;
    }
    
    public void declareFunctions() {
        f34334();
    }
    
    public void initializeVariables() {
        f34335();
    }
    
    public void runTopLevelForms() {
        f34336();
    }
    
    static {
        me = (SubLFile)new module0558();
        module0558.$g4026$ = null;
        module0558.$g4027$ = null;
        module0558.$g4028$ = null;
        module0558.$g4029$ = null;
        module0558.$g4030$ = null;
        $ic0$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("S#14271", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5852", "CYC"));
        $ic1$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic2$ = SubLObjectFactory.makeSymbol("S#37582", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic4$ = SubLObjectFactory.makeKeyword("EQUAL");
        $ic5$ = SubLObjectFactory.makeKeyword("PROBABLY-EQUAL");
        $ic6$ = (SubLFloat)SubLObjectFactory.makeDouble(0.2);
        $ic7$ = SubLObjectFactory.makeString("Similarity ~s out of bounds.");
        $ic8$ = SubLObjectFactory.makeKeyword("DIFFERENT");
        $ic9$ = SubLObjectFactory.makeKeyword("PROBABLY-DIFFERENT");
        $ic10$ = SubLObjectFactory.makeKeyword("UNKNOWN");
        $ic11$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic12$ = SubLObjectFactory.makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic13$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#14271", "CYC"));
        $ic14$ = SubLObjectFactory.makeSymbol("S#37578", "CYC");
        $ic15$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic16$ = SubLObjectFactory.makeKeyword("FALSE");
        $ic17$ = SubLObjectFactory.makeString("Unknown truth value ~s");
        $ic18$ = SubLObjectFactory.makeSymbol("S#37572", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#16025", "CYC");
        $ic20$ = (SubLFloat)SubLObjectFactory.makeDouble(1.2);
        $ic21$ = SubLObjectFactory.makeSymbol("NUMBERP");
        $ic22$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("S#14271", "CYC"));
        $ic23$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#37593", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#37594", "CYC"));
        $ic24$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#37595", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#37596", "CYC"));
        $ic25$ = SubLObjectFactory.makeSymbol("S#37580", "CYC");
        $ic26$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic27$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TRANSFORMATION-ALLOWED?"), (SubLObject)module0558.NIL);
        $ic28$ = SubLObjectFactory.makeKeyword("DESTROY-PROBLEM-STORE-ON-COMPLETION?");
        $ic29$ = SubLObjectFactory.makeKeyword("PROBLEM-STORE");
        $ic30$ = SubLObjectFactory.makeKeyword("JUSTIFY?");
        $ic31$ = SubLObjectFactory.makeKeyword("CONSIDER-META-ASSERTIONS?");
        $ic32$ = SubLObjectFactory.makeKeyword("IRRELEVANT-PREDICATES");
        $ic33$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa")));
        $ic34$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RETURN"), (SubLObject)SubLObjectFactory.makeKeyword("BINDINGS-AND-SUPPORTS"), (SubLObject)SubLObjectFactory.makeKeyword("CONTINUABLE?"), (SubLObject)module0558.NIL);
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0558.class
	Total time: 252 ms
	
	Decompiled with Procyon 0.5.32.
*/