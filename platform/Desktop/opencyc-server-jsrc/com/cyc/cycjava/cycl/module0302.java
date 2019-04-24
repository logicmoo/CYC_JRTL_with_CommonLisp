package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0302 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0302";
    public static final String myFingerPrint = "178c7af20e761dce72a07e479e0d4fd2a722b1f614df2762e6453c6d1470e788";
    private static SubLSymbol $g2701$;
    private static SubLSymbol $g2702$;
    public static SubLSymbol $g2703$;
    private static SubLSymbol $g2704$;
    private static SubLSymbol $g2705$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLObject $ic28$;
    private static final SubLObject $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLObject $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLObject $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLList $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLList $ic43$;
    private static final SubLObject $ic44$;
    private static final SubLObject $ic45$;
    private static final SubLObject $ic46$;
    private static final SubLObject $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLString $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLString $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLString $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLList $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLObject $ic68$;
    private static final SubLObject $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLObject $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLList $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLObject $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLList $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLObject $ic80$;
    private static final SubLObject $ic81$;
    private static final SubLObject $ic82$;
    private static final SubLObject $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLList $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLObject $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLList $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLInteger $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLObject $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLObject $ic107$;
    private static final SubLObject $ic108$;
    private static final SubLObject $ic109$;
    private static final SubLString $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLObject $ic113$;
    
    public static SubLObject f20033(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.list((SubLObject)module0302.$ic0$, (SubLObject)module0302.$ic1$, (SubLObject)ConsesLow.list((SubLObject)module0302.$ic2$, (SubLObject)module0302.$ic3$, (SubLObject)ConsesLow.listS((SubLObject)module0302.$ic4$, (SubLObject)module0302.TEN_INTEGER, ConsesLow.append(var5, (SubLObject)module0302.NIL))));
    }
    
    public static SubLObject f20034(final SubLObject var6, final SubLObject var7, final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (module0302.NIL == module0144.$g1749$.getDynamicValue(var9)) {
            return (SubLObject)module0302.NIL;
        }
        SubLObject var10 = (SubLObject)module0302.NIL;
        SubLObject var11 = (SubLObject)module0302.NIL;
        SubLObject var12 = (SubLObject)module0302.NIL;
        final SubLObject var13 = module0302.$g2702$.currentBinding(var9);
        final SubLObject var14 = module0302.$g2703$.currentBinding(var9);
        try {
            module0302.$g2702$.bind((SubLObject)module0302.NIL, var9);
            module0302.$g2703$.bind(module0067.f4880((SubLObject)module0302.EQUAL, (SubLObject)module0302.UNPROVIDED), var9);
            if (var6.eql(module0302.$ic5$)) {
                final SubLObject var13_15 = module0206.$g2330$.currentBinding(var9);
                try {
                    module0206.$g2330$.bind((SubLObject)module0302.T, var9);
                    final SubLObject var15 = module0139.$g1630$.getDynamicValue(var9);
                    final SubLObject var13_16 = module0139.$g1631$.currentBinding(var9);
                    final SubLObject var14_18 = module0139.$g1632$.currentBinding(var9);
                    final SubLObject var16 = module0139.$g1630$.currentBinding(var9);
                    try {
                        module0139.$g1631$.bind(module0139.f9015(var15, (SubLObject)module0302.TEN_INTEGER), var9);
                        module0139.$g1632$.bind(module0139.f9016(var15), var9);
                        module0139.$g1630$.bind((SubLObject)module0302.T, var9);
                        f20035(var6, var8, (SubLObject)module0302.$ic6$);
                        if (module0302.NIL != module0302.$g2702$.getDynamicValue(var9)) {
                            final SubLObject var17 = module0035.remove_if_not((SubLObject)module0302.$ic7$, module0302.$g2702$.getDynamicValue(var9), (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED);
                            final SubLObject var18 = Sequences.remove_if((SubLObject)module0302.$ic7$, module0302.$g2702$.getDynamicValue(var9), (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED);
                            var12 = (SubLObject)module0302.T;
                            if (module0302.NIL == var11) {
                                SubLObject var19 = var17;
                                SubLObject var20 = (SubLObject)module0302.NIL;
                                var20 = var19.first();
                                while (module0302.NIL == var11 && module0302.NIL != var19) {
                                    final SubLObject var13_17 = module0152.$g2129$.currentBinding(var9);
                                    final SubLObject var14_19 = module0144.$g1870$.currentBinding(var9);
                                    try {
                                        module0152.$g2129$.bind((SubLObject)module0302.NIL, var9);
                                        module0144.$g1870$.bind((SubLObject)module0302.NIL, var9);
                                        if (module0302.NIL == module0269.f17698(var7, var20, (SubLObject)module0302.UNPROVIDED) && module0302.NIL == module0305.f20337(var20, var7, (SubLObject)module0302.UNPROVIDED)) {
                                            if (module0302.NIL != module0144.$g1796$.getDynamicValue(var9)) {
                                                f20036(f20037(var6, var7, var8, var20));
                                                f20036(module0274.f18081());
                                            }
                                            var10 = (SubLObject)module0302.T;
                                            var11 = module0303.f20199(var10);
                                        }
                                    }
                                    finally {
                                        module0144.$g1870$.rebind(var14_19, var9);
                                        module0152.$g2129$.rebind(var13_17, var9);
                                    }
                                    var19 = var19.rest();
                                    var20 = var19.first();
                                }
                            }
                            if (module0302.NIL == var11) {
                                SubLObject var19 = var18;
                                SubLObject var20 = (SubLObject)module0302.NIL;
                                var20 = var19.first();
                                while (module0302.NIL == var11 && module0302.NIL != var19) {
                                    final SubLObject var13_18 = module0152.$g2129$.currentBinding(var9);
                                    try {
                                        module0152.$g2129$.bind((SubLObject)module0302.NIL, var9);
                                        if (module0302.NIL == module0305.f20437(var7, var20, (SubLObject)module0302.UNPROVIDED)) {
                                            if (module0302.NIL != module0144.$g1796$.getDynamicValue(var9)) {
                                                f20036(f20037(var6, var7, var8, var20));
                                                f20036(module0274.f18081());
                                            }
                                            var10 = (SubLObject)module0302.T;
                                            var11 = module0303.f20199(var10);
                                        }
                                    }
                                    finally {
                                        module0152.$g2129$.rebind(var13_18, var9);
                                    }
                                    var19 = var19.rest();
                                    var20 = var19.first();
                                }
                            }
                        }
                    }
                    finally {
                        module0139.$g1630$.rebind(var16, var9);
                        module0139.$g1632$.rebind(var14_18, var9);
                        module0139.$g1631$.rebind(var13_16, var9);
                    }
                }
                finally {
                    module0206.$g2330$.rebind(var13_15, var9);
                }
            }
            else {
                final SubLObject var21 = module0139.$g1630$.getDynamicValue(var9);
                final SubLObject var13_19 = module0139.$g1631$.currentBinding(var9);
                final SubLObject var14_20 = module0139.$g1632$.currentBinding(var9);
                final SubLObject var22 = module0139.$g1630$.currentBinding(var9);
                try {
                    module0139.$g1631$.bind(module0139.f9015(var21, (SubLObject)module0302.TEN_INTEGER), var9);
                    module0139.$g1632$.bind(module0139.f9016(var21), var9);
                    module0139.$g1630$.bind((SubLObject)module0302.T, var9);
                    f20035(var6, var8, (SubLObject)module0302.$ic6$);
                    if (module0302.NIL != module0302.$g2702$.getDynamicValue(var9)) {
                        final SubLObject var23 = module0035.remove_if_not((SubLObject)module0302.$ic7$, module0302.$g2702$.getDynamicValue(var9), (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED);
                        final SubLObject var24 = Sequences.remove_if((SubLObject)module0302.$ic7$, module0302.$g2702$.getDynamicValue(var9), (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED);
                        var12 = (SubLObject)module0302.T;
                        if (module0302.NIL == var11) {
                            SubLObject var25 = var23;
                            SubLObject var26 = (SubLObject)module0302.NIL;
                            var26 = var25.first();
                            while (module0302.NIL == var11 && module0302.NIL != var25) {
                                final SubLObject var13_20 = module0152.$g2129$.currentBinding(var9);
                                final SubLObject var14_21 = module0144.$g1870$.currentBinding(var9);
                                try {
                                    module0152.$g2129$.bind((SubLObject)module0302.NIL, var9);
                                    module0144.$g1870$.bind((SubLObject)module0302.NIL, var9);
                                    if (module0302.NIL == module0269.f17698(var7, var26, (SubLObject)module0302.UNPROVIDED) && module0302.NIL == module0305.f20337(var26, var7, (SubLObject)module0302.UNPROVIDED)) {
                                        if (module0302.NIL != module0144.$g1796$.getDynamicValue(var9)) {
                                            f20036(f20037(var6, var7, var8, var26));
                                            f20036(module0274.f18081());
                                        }
                                        var10 = (SubLObject)module0302.T;
                                        var11 = module0303.f20199(var10);
                                    }
                                }
                                finally {
                                    module0144.$g1870$.rebind(var14_21, var9);
                                    module0152.$g2129$.rebind(var13_20, var9);
                                }
                                var25 = var25.rest();
                                var26 = var25.first();
                            }
                        }
                        if (module0302.NIL == var11) {
                            SubLObject var25 = var24;
                            SubLObject var26 = (SubLObject)module0302.NIL;
                            var26 = var25.first();
                            while (module0302.NIL == var11 && module0302.NIL != var25) {
                                final SubLObject var13_21 = module0152.$g2129$.currentBinding(var9);
                                try {
                                    module0152.$g2129$.bind((SubLObject)module0302.NIL, var9);
                                    if (module0302.NIL == module0305.f20437(var7, var26, (SubLObject)module0302.UNPROVIDED)) {
                                        if (module0302.NIL != module0144.$g1796$.getDynamicValue(var9)) {
                                            f20036(f20037(var6, var7, var8, var26));
                                            f20036(module0274.f18081());
                                        }
                                        var10 = (SubLObject)module0302.T;
                                        var11 = module0303.f20199(var10);
                                    }
                                }
                                finally {
                                    module0152.$g2129$.rebind(var13_21, var9);
                                }
                                var25 = var25.rest();
                                var26 = var25.first();
                            }
                        }
                    }
                }
                finally {
                    module0139.$g1630$.rebind(var22, var9);
                    module0139.$g1632$.rebind(var14_20, var9);
                    module0139.$g1631$.rebind(var13_19, var9);
                }
            }
        }
        finally {
            module0302.$g2703$.rebind(var14, var9);
            module0302.$g2702$.rebind(var13, var9);
        }
        if (module0302.NIL != module0144.f9456() && module0302.NIL == var11) {
            if (module0302.NIL != var12) {
                var10 = (SubLObject)module0302.NIL;
            }
            else {
                module0303.f20203(f20038(var6, var8, (SubLObject)module0302.UNPROVIDED));
                var10 = (SubLObject)module0302.T;
            }
        }
        return var10;
    }
    
    public static SubLObject f20037(final SubLObject var6, final SubLObject var7, final SubLObject var8, final SubLObject var23) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        final SubLObject var25 = module0067.f4884(module0302.$g2703$.getDynamicValue(var24), var23, (SubLObject)module0302.UNPROVIDED);
        SubLObject var26 = (SubLObject)module0302.NIL;
        SubLObject var27 = var25;
        SubLObject var28 = (SubLObject)module0302.NIL;
        var28 = var27.first();
        while (module0302.NIL != var27) {
            var26 = (SubLObject)ConsesLow.cons(f20039(var6, var7, var8, var23, var28), var26);
            var27 = var27.rest();
            var28 = var27.first();
        }
        return var26;
    }
    
    public static SubLObject f20039(final SubLObject var6, final SubLObject var7, final SubLObject var8, final SubLObject var23, final SubLObject var35) {
        final SubLThread var36 = SubLProcess.currentSubLThread();
        final SubLObject var37 = module0147.$g2095$.getDynamicValue(var36);
        final SubLObject var38 = (SubLObject)((module0302.NIL != module0226.f14968(var23, var37)) ? module0302.$ic8$ : module0302.$ic9$);
        return f20040(var6, var7, var8, var23, var35, var38);
    }
    
    public static SubLObject f20040(final SubLObject var6, final SubLObject var7, final SubLObject var8, final SubLObject var23, final SubLObject var35, final SubLObject var37) {
        final SubLThread var38 = SubLProcess.currentSubLThread();
        final SubLObject var39 = module0147.$g2095$.getDynamicValue(var38);
        SubLObject var40 = (SubLObject)module0302.NIL;
        SubLObject var41 = (SubLObject)module0302.NIL;
        SubLObject var42 = (SubLObject)module0302.NIL;
        SubLObject var43 = (SubLObject)module0302.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var35, var35, (SubLObject)module0302.$ic10$);
        var41 = var35.first();
        SubLObject var44 = var35.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var44, var35, (SubLObject)module0302.$ic10$);
        var42 = var44.first();
        var44 = var44.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var44, var35, (SubLObject)module0302.$ic10$);
        var43 = var44.first();
        var44 = var44.rest();
        if (module0302.NIL == var44) {
            if (var42 != module0302.$ic11$) {
                var40 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var42, var41), var40);
            }
            if (module0302.NIL == module0152.f9715()) {
                if (module0302.NIL != module0144.$g1847$.getDynamicValue(var38) && module0302.NIL != var43) {
                    var40 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0302.$ic12$, var43), var40);
                }
                var40 = ConsesLow.append(var40, f20041());
            }
            return (SubLObject)ConsesLow.listS(var37, new SubLObject[] { var7, var6, var8, var23, var39, ConsesLow.append(var40, (SubLObject)module0302.NIL) });
        }
        cdestructuring_bind.cdestructuring_bind_error(var35, (SubLObject)module0302.$ic10$);
        return (SubLObject)module0302.NIL;
    }
    
    public static SubLObject f20041() {
        SubLObject var38 = (SubLObject)module0302.NIL;
        if (module0302.NIL != module0152.f9723()) {
            var38 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0302.$ic13$, module0152.f9723()), var38);
        }
        if (module0302.NIL != module0152.f9725()) {
            var38 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0302.$ic14$, module0152.f9725()), var38);
        }
        if (module0302.NIL != module0152.f9724()) {
            var38 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0302.$ic15$, module0152.f9724()), var38);
        }
        return var38;
    }
    
    public static SubLObject f20038(final SubLObject var6, final SubLObject var8, SubLObject var36) {
        if (var36 == module0302.UNPROVIDED) {
            var36 = (SubLObject)module0302.NIL;
        }
        return (SubLObject)ConsesLow.list((SubLObject)module0302.$ic16$, var6, var8, var36);
    }
    
    public static SubLObject f20042(final SubLObject var6, final SubLObject var7, final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (module0302.NIL == module0144.$g1751$.getDynamicValue(var9)) {
            return (SubLObject)module0302.NIL;
        }
        SubLObject var10 = (SubLObject)module0302.NIL;
        SubLObject var11 = (SubLObject)module0302.NIL;
        SubLObject var12 = (SubLObject)module0302.NIL;
        final SubLObject var13 = module0302.$g2702$.currentBinding(var9);
        final SubLObject var14 = module0302.$g2703$.currentBinding(var9);
        try {
            module0302.$g2702$.bind((SubLObject)module0302.NIL, var9);
            module0302.$g2703$.bind(module0067.f4880((SubLObject)module0302.EQUAL, (SubLObject)module0302.UNPROVIDED), var9);
            if (var6.eql(module0302.$ic5$)) {
                final SubLObject var13_45 = module0206.$g2330$.currentBinding(var9);
                try {
                    module0206.$g2330$.bind((SubLObject)module0302.T, var9);
                    final SubLObject var15 = module0139.$g1630$.getDynamicValue(var9);
                    final SubLObject var13_46 = module0139.$g1631$.currentBinding(var9);
                    final SubLObject var14_47 = module0139.$g1632$.currentBinding(var9);
                    final SubLObject var16 = module0139.$g1630$.currentBinding(var9);
                    try {
                        module0139.$g1631$.bind(module0139.f9015(var15, (SubLObject)module0302.TEN_INTEGER), var9);
                        module0139.$g1632$.bind(module0139.f9016(var15), var9);
                        module0139.$g1630$.bind((SubLObject)module0302.T, var9);
                        f20035(var6, var8, (SubLObject)module0302.$ic17$);
                        if (module0302.NIL != module0302.$g2702$.getDynamicValue(var9)) {
                            final SubLObject var17 = module0035.remove_if_not((SubLObject)module0302.$ic7$, module0302.$g2702$.getDynamicValue(var9), (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED);
                            final SubLObject var18 = Sequences.remove_if((SubLObject)module0302.$ic7$, module0302.$g2702$.getDynamicValue(var9), (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED);
                            var12 = (SubLObject)module0302.T;
                            if (module0302.NIL == var11) {
                                SubLObject var19 = var17;
                                SubLObject var20 = (SubLObject)module0302.NIL;
                                var20 = var19.first();
                                while (module0302.NIL == var11 && module0302.NIL != var19) {
                                    final SubLObject var13_47 = module0152.$g2129$.currentBinding(var9);
                                    final SubLObject var14_48 = module0144.$g1870$.currentBinding(var9);
                                    try {
                                        module0152.$g2129$.bind((SubLObject)module0302.NIL, var9);
                                        module0144.$g1870$.bind((SubLObject)module0302.NIL, var9);
                                        if (module0302.NIL != module0269.f17698(var7, var20, (SubLObject)module0302.UNPROVIDED) && module0302.NIL == module0305.f20337(var20, var7, (SubLObject)module0302.UNPROVIDED)) {
                                            if (module0302.NIL != module0144.$g1796$.getDynamicValue(var9)) {
                                                f20036(f20043(var6, var7, var8, var20));
                                                f20036(module0274.f18081());
                                            }
                                            var10 = (SubLObject)module0302.T;
                                            var11 = module0303.f20199(var10);
                                        }
                                    }
                                    finally {
                                        module0144.$g1870$.rebind(var14_48, var9);
                                        module0152.$g2129$.rebind(var13_47, var9);
                                    }
                                    var19 = var19.rest();
                                    var20 = var19.first();
                                }
                            }
                            if (module0302.NIL == var11) {
                                SubLObject var19 = var18;
                                SubLObject var20 = (SubLObject)module0302.NIL;
                                var20 = var19.first();
                                while (module0302.NIL == var11 && module0302.NIL != var19) {
                                    final SubLObject var13_48 = module0152.$g2129$.currentBinding(var9);
                                    try {
                                        module0152.$g2129$.bind((SubLObject)module0302.NIL, var9);
                                        if (module0302.NIL != module0305.f20437(var7, var20, (SubLObject)module0302.UNPROVIDED)) {
                                            if (module0302.NIL != module0144.$g1796$.getDynamicValue(var9)) {
                                                f20036(f20043(var6, var7, var8, var20));
                                                f20036(module0274.f18081());
                                            }
                                            var10 = (SubLObject)module0302.T;
                                            var11 = module0303.f20199(var10);
                                        }
                                    }
                                    finally {
                                        module0152.$g2129$.rebind(var13_48, var9);
                                    }
                                    var19 = var19.rest();
                                    var20 = var19.first();
                                }
                            }
                        }
                    }
                    finally {
                        module0139.$g1630$.rebind(var16, var9);
                        module0139.$g1632$.rebind(var14_47, var9);
                        module0139.$g1631$.rebind(var13_46, var9);
                    }
                }
                finally {
                    module0206.$g2330$.rebind(var13_45, var9);
                }
            }
            else {
                final SubLObject var21 = module0139.$g1630$.getDynamicValue(var9);
                final SubLObject var13_49 = module0139.$g1631$.currentBinding(var9);
                final SubLObject var14_49 = module0139.$g1632$.currentBinding(var9);
                final SubLObject var22 = module0139.$g1630$.currentBinding(var9);
                try {
                    module0139.$g1631$.bind(module0139.f9015(var21, (SubLObject)module0302.TEN_INTEGER), var9);
                    module0139.$g1632$.bind(module0139.f9016(var21), var9);
                    module0139.$g1630$.bind((SubLObject)module0302.T, var9);
                    f20035(var6, var8, (SubLObject)module0302.$ic17$);
                    if (module0302.NIL != module0302.$g2702$.getDynamicValue(var9)) {
                        final SubLObject var23 = module0035.remove_if_not((SubLObject)module0302.$ic7$, module0302.$g2702$.getDynamicValue(var9), (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED);
                        final SubLObject var24 = Sequences.remove_if((SubLObject)module0302.$ic7$, module0302.$g2702$.getDynamicValue(var9), (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED);
                        var12 = (SubLObject)module0302.T;
                        if (module0302.NIL == var11) {
                            SubLObject var25 = var23;
                            SubLObject var26 = (SubLObject)module0302.NIL;
                            var26 = var25.first();
                            while (module0302.NIL == var11 && module0302.NIL != var25) {
                                final SubLObject var13_50 = module0152.$g2129$.currentBinding(var9);
                                final SubLObject var14_50 = module0144.$g1870$.currentBinding(var9);
                                try {
                                    module0152.$g2129$.bind((SubLObject)module0302.NIL, var9);
                                    module0144.$g1870$.bind((SubLObject)module0302.NIL, var9);
                                    if (module0302.NIL != module0269.f17698(var7, var26, (SubLObject)module0302.UNPROVIDED) && module0302.NIL == module0305.f20337(var26, var7, (SubLObject)module0302.UNPROVIDED)) {
                                        if (module0302.NIL != module0144.$g1796$.getDynamicValue(var9)) {
                                            f20036(f20043(var6, var7, var8, var26));
                                            f20036(module0274.f18081());
                                        }
                                        var10 = (SubLObject)module0302.T;
                                        var11 = module0303.f20199(var10);
                                    }
                                }
                                finally {
                                    module0144.$g1870$.rebind(var14_50, var9);
                                    module0152.$g2129$.rebind(var13_50, var9);
                                }
                                var25 = var25.rest();
                                var26 = var25.first();
                            }
                        }
                        if (module0302.NIL == var11) {
                            SubLObject var25 = var24;
                            SubLObject var26 = (SubLObject)module0302.NIL;
                            var26 = var25.first();
                            while (module0302.NIL == var11 && module0302.NIL != var25) {
                                final SubLObject var13_51 = module0152.$g2129$.currentBinding(var9);
                                try {
                                    module0152.$g2129$.bind((SubLObject)module0302.NIL, var9);
                                    if (module0302.NIL != module0305.f20437(var7, var26, (SubLObject)module0302.UNPROVIDED)) {
                                        if (module0302.NIL != module0144.$g1796$.getDynamicValue(var9)) {
                                            f20036(f20043(var6, var7, var8, var26));
                                            f20036(module0274.f18081());
                                        }
                                        var10 = (SubLObject)module0302.T;
                                        var11 = module0303.f20199(var10);
                                    }
                                }
                                finally {
                                    module0152.$g2129$.rebind(var13_51, var9);
                                }
                                var25 = var25.rest();
                                var26 = var25.first();
                            }
                        }
                    }
                }
                finally {
                    module0139.$g1630$.rebind(var22, var9);
                    module0139.$g1632$.rebind(var14_49, var9);
                    module0139.$g1631$.rebind(var13_49, var9);
                }
            }
        }
        finally {
            module0302.$g2703$.rebind(var14, var9);
            module0302.$g2702$.rebind(var13, var9);
        }
        return var10;
    }
    
    public static SubLObject f20043(final SubLObject var6, final SubLObject var7, final SubLObject var8, final SubLObject var23) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        final SubLObject var25 = module0067.f4884(module0302.$g2703$.getDynamicValue(var24), var23, (SubLObject)module0302.UNPROVIDED);
        SubLObject var26 = (SubLObject)module0302.NIL;
        SubLObject var27 = var25;
        SubLObject var28 = (SubLObject)module0302.NIL;
        var28 = var27.first();
        while (module0302.NIL != var27) {
            var26 = (SubLObject)ConsesLow.cons(f20044(var6, var7, var8, var23, var28), var26);
            var27 = var27.rest();
            var28 = var27.first();
        }
        return var26;
    }
    
    public static SubLObject f20044(final SubLObject var6, final SubLObject var7, final SubLObject var8, final SubLObject var23, final SubLObject var35) {
        final SubLObject var36 = (SubLObject)module0302.$ic18$;
        return f20045(var6, var7, var8, var23, var35, var36);
    }
    
    public static SubLObject f20045(final SubLObject var6, final SubLObject var7, final SubLObject var8, final SubLObject var23, final SubLObject var35, final SubLObject var37) {
        final SubLThread var38 = SubLProcess.currentSubLThread();
        final SubLObject var39 = module0147.$g2095$.getDynamicValue(var38);
        SubLObject var40 = (SubLObject)module0302.NIL;
        SubLObject var41 = (SubLObject)module0302.NIL;
        SubLObject var42 = (SubLObject)module0302.NIL;
        SubLObject var43 = (SubLObject)module0302.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var35, var35, (SubLObject)module0302.$ic10$);
        var41 = var35.first();
        SubLObject var44 = var35.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var44, var35, (SubLObject)module0302.$ic10$);
        var42 = var44.first();
        var44 = var44.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var44, var35, (SubLObject)module0302.$ic10$);
        var43 = var44.first();
        var44 = var44.rest();
        if (module0302.NIL == var44) {
            if (var42 != module0302.$ic11$) {
                var40 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var42, var41), var40);
            }
            if (module0302.NIL == module0152.f9715()) {
                if (module0302.NIL != module0144.$g1847$.getDynamicValue(var38) && module0302.NIL != var43) {
                    var40 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0302.$ic12$, var43), var40);
                }
                var40 = ConsesLow.append(var40, f20041());
            }
            return (SubLObject)ConsesLow.listS(var37, new SubLObject[] { var7, var6, var8, var23, var39, ConsesLow.append(var40, (SubLObject)module0302.NIL) });
        }
        cdestructuring_bind.cdestructuring_bind_error(var35, (SubLObject)module0302.$ic10$);
        return (SubLObject)module0302.NIL;
    }
    
    public static SubLObject f20046(final SubLObject var6, final SubLObject var8, SubLObject var36) {
        if (var36 == module0302.UNPROVIDED) {
            var36 = (SubLObject)module0302.NIL;
        }
        return (SubLObject)ConsesLow.list((SubLObject)module0302.$ic19$, var6, var8, var36);
    }
    
    public static SubLObject f20047(final SubLObject var6, final SubLObject var7, final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (module0302.NIL == module0144.$g1764$.getDynamicValue(var9)) {
            return (SubLObject)module0302.NIL;
        }
        SubLObject var10 = (SubLObject)module0302.NIL;
        SubLObject var11 = (SubLObject)module0302.NIL;
        final SubLObject var12 = module0302.$g2702$.currentBinding(var9);
        final SubLObject var13 = module0302.$g2703$.currentBinding(var9);
        try {
            module0302.$g2702$.bind((SubLObject)module0302.NIL, var9);
            module0302.$g2703$.bind(module0067.f4880((SubLObject)module0302.EQUAL, (SubLObject)module0302.UNPROVIDED), var9);
            if (var6.eql(module0302.$ic5$)) {
                final SubLObject var13_60 = module0206.$g2330$.currentBinding(var9);
                try {
                    module0206.$g2330$.bind((SubLObject)module0302.T, var9);
                    final SubLObject var14 = module0139.$g1630$.getDynamicValue(var9);
                    final SubLObject var13_61 = module0139.$g1631$.currentBinding(var9);
                    final SubLObject var14_62 = module0139.$g1632$.currentBinding(var9);
                    final SubLObject var15 = module0139.$g1630$.currentBinding(var9);
                    try {
                        module0139.$g1631$.bind(module0139.f9015(var14, (SubLObject)module0302.TEN_INTEGER), var9);
                        module0139.$g1632$.bind(module0139.f9016(var14), var9);
                        module0139.$g1630$.bind((SubLObject)module0302.T, var9);
                        f20035(var6, var8, (SubLObject)module0302.$ic6$);
                        if (module0302.NIL != module0302.$g2702$.getDynamicValue(var9)) {
                            final SubLObject var16 = f20048(var7, (SubLObject)module0302.$ic20$, module0144.$g1826$.getDynamicValue(var9), module0147.f9552((SubLObject)module0302.UNPROVIDED));
                            final SubLObject var13_62 = module0258.$g2489$.currentBinding(var9);
                            try {
                                module0258.$g2489$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0302.NIL == module0144.$g1768$.getDynamicValue(var9)), var9);
                                if (module0302.NIL == var11) {
                                    SubLObject var17 = module0302.$g2702$.getDynamicValue(var9);
                                    SubLObject var18 = (SubLObject)module0302.NIL;
                                    var18 = var17.first();
                                    while (module0302.NIL == var11 && module0302.NIL != var17) {
                                        final SubLObject var13_63 = module0152.$g2129$.currentBinding(var9);
                                        try {
                                            module0152.$g2129$.bind((SubLObject)module0302.NIL, var9);
                                            if (module0302.NIL != module0173.f10955(var18)) {
                                                if (module0302.NIL != module0257.f16696(var16, var18, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED)) {
                                                    if (module0302.NIL != module0144.$g1796$.getDynamicValue(var9)) {
                                                        f20036(f20049(var6, var7, var8, var18));
                                                    }
                                                    var10 = (SubLObject)module0302.T;
                                                    var11 = module0303.f20199(var10);
                                                }
                                                else if (module0302.$ic21$ != module0144.$g1826$.getDynamicValue(var9) || module0302.NIL == module0205.f13215(Symbols.symbol_function((SubLObject)module0302.$ic22$), var7, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED)) {
                                                    if (module0302.NIL != module0305.f20340(var18, var7, (SubLObject)module0302.UNPROVIDED)) {
                                                        if (module0302.NIL != module0144.$g1796$.getDynamicValue(var9)) {
                                                            f20036(f20049(var6, var7, var8, var18));
                                                            f20036(module0274.f18081());
                                                        }
                                                        var10 = (SubLObject)module0302.T;
                                                        var11 = module0303.f20199(var10);
                                                    }
                                                }
                                            }
                                        }
                                        finally {
                                            module0152.$g2129$.rebind(var13_63, var9);
                                        }
                                        var17 = var17.rest();
                                        var18 = var17.first();
                                    }
                                }
                            }
                            finally {
                                module0258.$g2489$.rebind(var13_62, var9);
                            }
                        }
                    }
                    finally {
                        module0139.$g1630$.rebind(var15, var9);
                        module0139.$g1632$.rebind(var14_62, var9);
                        module0139.$g1631$.rebind(var13_61, var9);
                    }
                }
                finally {
                    module0206.$g2330$.rebind(var13_60, var9);
                }
            }
            else {
                final SubLObject var19 = module0139.$g1630$.getDynamicValue(var9);
                final SubLObject var13_64 = module0139.$g1631$.currentBinding(var9);
                final SubLObject var14_63 = module0139.$g1632$.currentBinding(var9);
                final SubLObject var20 = module0139.$g1630$.currentBinding(var9);
                try {
                    module0139.$g1631$.bind(module0139.f9015(var19, (SubLObject)module0302.TEN_INTEGER), var9);
                    module0139.$g1632$.bind(module0139.f9016(var19), var9);
                    module0139.$g1630$.bind((SubLObject)module0302.T, var9);
                    f20035(var6, var8, (SubLObject)module0302.$ic6$);
                    if (module0302.NIL != module0302.$g2702$.getDynamicValue(var9)) {
                        final SubLObject var21 = f20048(var7, (SubLObject)module0302.$ic20$, module0144.$g1826$.getDynamicValue(var9), module0147.f9552((SubLObject)module0302.UNPROVIDED));
                        final SubLObject var13_65 = module0258.$g2489$.currentBinding(var9);
                        try {
                            module0258.$g2489$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0302.NIL == module0144.$g1768$.getDynamicValue(var9)), var9);
                            if (module0302.NIL == var11) {
                                SubLObject var22 = module0302.$g2702$.getDynamicValue(var9);
                                SubLObject var23 = (SubLObject)module0302.NIL;
                                var23 = var22.first();
                                while (module0302.NIL == var11 && module0302.NIL != var22) {
                                    final SubLObject var13_66 = module0152.$g2129$.currentBinding(var9);
                                    try {
                                        module0152.$g2129$.bind((SubLObject)module0302.NIL, var9);
                                        if (module0302.NIL != module0173.f10955(var23)) {
                                            if (module0302.NIL != module0257.f16696(var21, var23, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED)) {
                                                if (module0302.NIL != module0144.$g1796$.getDynamicValue(var9)) {
                                                    f20036(f20049(var6, var7, var8, var23));
                                                }
                                                var10 = (SubLObject)module0302.T;
                                                var11 = module0303.f20199(var10);
                                            }
                                            else if (module0302.$ic21$ != module0144.$g1826$.getDynamicValue(var9) || module0302.NIL == module0205.f13215(Symbols.symbol_function((SubLObject)module0302.$ic22$), var7, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED)) {
                                                if (module0302.NIL != module0305.f20340(var23, var7, (SubLObject)module0302.UNPROVIDED)) {
                                                    if (module0302.NIL != module0144.$g1796$.getDynamicValue(var9)) {
                                                        f20036(f20049(var6, var7, var8, var23));
                                                        f20036(module0274.f18081());
                                                    }
                                                    var10 = (SubLObject)module0302.T;
                                                    var11 = module0303.f20199(var10);
                                                }
                                            }
                                        }
                                    }
                                    finally {
                                        module0152.$g2129$.rebind(var13_66, var9);
                                    }
                                    var22 = var22.rest();
                                    var23 = var22.first();
                                }
                            }
                        }
                        finally {
                            module0258.$g2489$.rebind(var13_65, var9);
                        }
                    }
                }
                finally {
                    module0139.$g1630$.rebind(var20, var9);
                    module0139.$g1632$.rebind(var14_63, var9);
                    module0139.$g1631$.rebind(var13_64, var9);
                }
            }
        }
        finally {
            module0302.$g2703$.rebind(var13, var9);
            module0302.$g2702$.rebind(var12, var9);
        }
        return var10;
    }
    
    public static SubLObject f20049(final SubLObject var6, final SubLObject var7, final SubLObject var8, final SubLObject var23) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        final SubLObject var25 = module0067.f4884(module0302.$g2703$.getDynamicValue(var24), var23, (SubLObject)module0302.UNPROVIDED);
        SubLObject var26 = (SubLObject)module0302.NIL;
        SubLObject var27 = var25;
        SubLObject var28 = (SubLObject)module0302.NIL;
        var28 = var27.first();
        while (module0302.NIL != var27) {
            var26 = (SubLObject)ConsesLow.cons(f20050((SubLObject)module0302.$ic23$, var6, var7, var8, var23, var28), var26);
            var27 = var27.rest();
            var28 = var27.first();
        }
        return var26;
    }
    
    public static SubLObject f20050(final SubLObject var37, final SubLObject var6, final SubLObject var7, final SubLObject var8, final SubLObject var23, final SubLObject var35) {
        final SubLThread var38 = SubLProcess.currentSubLThread();
        final SubLObject var39 = module0147.$g2095$.getDynamicValue(var38);
        SubLObject var40 = (SubLObject)module0302.NIL;
        SubLObject var41 = (SubLObject)module0302.NIL;
        SubLObject var42 = (SubLObject)module0302.NIL;
        SubLObject var43 = (SubLObject)module0302.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var35, var35, (SubLObject)module0302.$ic10$);
        var41 = var35.first();
        SubLObject var44 = var35.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var44, var35, (SubLObject)module0302.$ic10$);
        var42 = var44.first();
        var44 = var44.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var44, var35, (SubLObject)module0302.$ic10$);
        var43 = var44.first();
        var44 = var44.rest();
        if (module0302.NIL == var44) {
            if (var42 != module0302.$ic11$) {
                var40 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var42, var41), var40);
            }
            if (module0302.NIL == module0152.f9715()) {
                if (module0302.NIL != module0144.$g1847$.getDynamicValue(var38) && module0302.NIL != var43) {
                    var40 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0302.$ic12$, var43), var40);
                }
                var40 = ConsesLow.append(var40, f20041());
            }
            return (SubLObject)ConsesLow.listS(var37, new SubLObject[] { var7, var6, var8, var23, var39, ConsesLow.append(var40, (SubLObject)module0302.NIL) });
        }
        cdestructuring_bind.cdestructuring_bind_error(var35, (SubLObject)module0302.$ic10$);
        return (SubLObject)module0302.NIL;
    }
    
    public static SubLObject f20051(final SubLObject var6, final SubLObject var7, final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (module0302.NIL == module0144.$g1750$.getDynamicValue(var9)) {
            return (SubLObject)module0302.NIL;
        }
        SubLObject var10 = (SubLObject)module0302.NIL;
        SubLObject var11 = (SubLObject)module0302.NIL;
        final SubLObject var12 = module0302.$g2702$.currentBinding(var9);
        final SubLObject var13 = module0302.$g2703$.currentBinding(var9);
        try {
            module0302.$g2702$.bind((SubLObject)module0302.NIL, var9);
            module0302.$g2703$.bind(module0067.f4880((SubLObject)module0302.EQUAL, (SubLObject)module0302.UNPROVIDED), var9);
            if (var6.eql(module0302.$ic5$)) {
                final SubLObject var13_73 = module0206.$g2330$.currentBinding(var9);
                try {
                    module0206.$g2330$.bind((SubLObject)module0302.T, var9);
                    final SubLObject var14 = module0139.$g1630$.getDynamicValue(var9);
                    final SubLObject var13_74 = module0139.$g1631$.currentBinding(var9);
                    final SubLObject var14_75 = module0139.$g1632$.currentBinding(var9);
                    final SubLObject var15 = module0139.$g1630$.currentBinding(var9);
                    try {
                        module0139.$g1631$.bind(module0139.f9015(var14, (SubLObject)module0302.TEN_INTEGER), var9);
                        module0139.$g1632$.bind(module0139.f9016(var14), var9);
                        module0139.$g1630$.bind((SubLObject)module0302.T, var9);
                        f20035(var6, var8, (SubLObject)module0302.$ic24$);
                        if (module0302.NIL != module0302.$g2702$.getDynamicValue(var9) && module0302.NIL == var11) {
                            SubLObject var16 = module0302.$g2702$.getDynamicValue(var9);
                            SubLObject var17 = (SubLObject)module0302.NIL;
                            var17 = var16.first();
                            while (module0302.NIL == var11 && module0302.NIL != var16) {
                                final SubLObject var13_75 = module0152.$g2129$.currentBinding(var9);
                                try {
                                    module0152.$g2129$.bind((SubLObject)module0302.NIL, var9);
                                    if (module0302.NIL == module0305.f20526(var7, var17, (SubLObject)module0302.UNPROVIDED)) {
                                        if (module0302.NIL != module0144.$g1796$.getDynamicValue(var9)) {
                                            f20036(f20052(var6, var7, var8, var17));
                                            f20036(module0274.f18081());
                                        }
                                        var10 = (SubLObject)module0302.T;
                                        var11 = module0303.f20199(var10);
                                    }
                                }
                                finally {
                                    module0152.$g2129$.rebind(var13_75, var9);
                                }
                                var16 = var16.rest();
                                var17 = var16.first();
                            }
                        }
                    }
                    finally {
                        module0139.$g1630$.rebind(var15, var9);
                        module0139.$g1632$.rebind(var14_75, var9);
                        module0139.$g1631$.rebind(var13_74, var9);
                    }
                }
                finally {
                    module0206.$g2330$.rebind(var13_73, var9);
                }
            }
            else {
                final SubLObject var18 = module0139.$g1630$.getDynamicValue(var9);
                final SubLObject var13_76 = module0139.$g1631$.currentBinding(var9);
                final SubLObject var14_76 = module0139.$g1632$.currentBinding(var9);
                final SubLObject var19 = module0139.$g1630$.currentBinding(var9);
                try {
                    module0139.$g1631$.bind(module0139.f9015(var18, (SubLObject)module0302.TEN_INTEGER), var9);
                    module0139.$g1632$.bind(module0139.f9016(var18), var9);
                    module0139.$g1630$.bind((SubLObject)module0302.T, var9);
                    f20035(var6, var8, (SubLObject)module0302.$ic24$);
                    if (module0302.NIL != module0302.$g2702$.getDynamicValue(var9) && module0302.NIL == var11) {
                        SubLObject var20 = module0302.$g2702$.getDynamicValue(var9);
                        SubLObject var21 = (SubLObject)module0302.NIL;
                        var21 = var20.first();
                        while (module0302.NIL == var11 && module0302.NIL != var20) {
                            final SubLObject var13_77 = module0152.$g2129$.currentBinding(var9);
                            try {
                                module0152.$g2129$.bind((SubLObject)module0302.NIL, var9);
                                if (module0302.NIL == module0305.f20526(var7, var21, (SubLObject)module0302.UNPROVIDED)) {
                                    if (module0302.NIL != module0144.$g1796$.getDynamicValue(var9)) {
                                        f20036(f20052(var6, var7, var8, var21));
                                        f20036(module0274.f18081());
                                    }
                                    var10 = (SubLObject)module0302.T;
                                    var11 = module0303.f20199(var10);
                                }
                            }
                            finally {
                                module0152.$g2129$.rebind(var13_77, var9);
                            }
                            var20 = var20.rest();
                            var21 = var20.first();
                        }
                    }
                }
                finally {
                    module0139.$g1630$.rebind(var19, var9);
                    module0139.$g1632$.rebind(var14_76, var9);
                    module0139.$g1631$.rebind(var13_76, var9);
                }
            }
        }
        finally {
            module0302.$g2703$.rebind(var13, var9);
            module0302.$g2702$.rebind(var12, var9);
        }
        return var10;
    }
    
    public static SubLObject f20052(final SubLObject var6, final SubLObject var7, final SubLObject var8, final SubLObject var23) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        final SubLObject var25 = module0067.f4884(module0302.$g2703$.getDynamicValue(var24), var23, (SubLObject)module0302.UNPROVIDED);
        SubLObject var26 = (SubLObject)module0302.NIL;
        SubLObject var27 = var25;
        SubLObject var28 = (SubLObject)module0302.NIL;
        var28 = var27.first();
        while (module0302.NIL != var27) {
            var26 = (SubLObject)ConsesLow.cons(f20053(var6, var7, var8, var23, var28), var26);
            var27 = var27.rest();
            var28 = var27.first();
        }
        return var26;
    }
    
    public static SubLObject f20053(final SubLObject var6, final SubLObject var7, final SubLObject var8, final SubLObject var23, final SubLObject var35) {
        final SubLThread var36 = SubLProcess.currentSubLThread();
        final SubLObject var37 = module0147.$g2095$.getDynamicValue(var36);
        final SubLObject var38 = (SubLObject)((module0302.NIL != module0226.f14972(var23, var37)) ? module0302.$ic25$ : module0302.$ic26$);
        return f20040(var6, var7, var8, var23, var35, var38);
    }
    
    public static SubLObject f20054(final SubLObject var6, final SubLObject var7, final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (module0302.NIL == module0144.$g1765$.getDynamicValue(var9)) {
            return (SubLObject)module0302.NIL;
        }
        SubLObject var10 = (SubLObject)module0302.NIL;
        SubLObject var11 = (SubLObject)module0302.NIL;
        final SubLObject var12 = module0302.$g2702$.currentBinding(var9);
        final SubLObject var13 = module0302.$g2703$.currentBinding(var9);
        try {
            module0302.$g2702$.bind((SubLObject)module0302.NIL, var9);
            module0302.$g2703$.bind(module0067.f4880((SubLObject)module0302.EQUAL, (SubLObject)module0302.UNPROVIDED), var9);
            if (var6.eql(module0302.$ic5$)) {
                final SubLObject var13_80 = module0206.$g2330$.currentBinding(var9);
                try {
                    module0206.$g2330$.bind((SubLObject)module0302.T, var9);
                    final SubLObject var14 = module0139.$g1630$.getDynamicValue(var9);
                    final SubLObject var13_81 = module0139.$g1631$.currentBinding(var9);
                    final SubLObject var14_82 = module0139.$g1632$.currentBinding(var9);
                    final SubLObject var15 = module0139.$g1630$.currentBinding(var9);
                    try {
                        module0139.$g1631$.bind(module0139.f9015(var14, (SubLObject)module0302.TEN_INTEGER), var9);
                        module0139.$g1632$.bind(module0139.f9016(var14), var9);
                        module0139.$g1630$.bind((SubLObject)module0302.T, var9);
                        f20035(var6, var8, (SubLObject)module0302.$ic24$);
                        if (module0302.NIL != module0302.$g2702$.getDynamicValue(var9)) {
                            final SubLObject var16 = f20048(var7, (SubLObject)module0302.$ic27$, module0144.$g1826$.getDynamicValue(var9), module0147.f9552((SubLObject)module0302.UNPROVIDED));
                            final SubLObject var13_82 = module0258.$g2489$.currentBinding(var9);
                            try {
                                module0258.$g2489$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0302.NIL == module0144.$g1768$.getDynamicValue(var9)), var9);
                                if (module0302.NIL == var11) {
                                    SubLObject var17 = module0302.$g2702$.getDynamicValue(var9);
                                    SubLObject var18 = (SubLObject)module0302.NIL;
                                    var18 = var17.first();
                                    while (module0302.NIL == var11 && module0302.NIL != var17) {
                                        final SubLObject var13_83 = module0152.$g2129$.currentBinding(var9);
                                        try {
                                            module0152.$g2129$.bind((SubLObject)module0302.NIL, var9);
                                            if (module0302.NIL != module0173.f10955(var18)) {
                                                if (!var6.eql(module0302.$ic28$) || !var8.eql((SubLObject)module0302.TWO_INTEGER) || !var18.eql(module0302.$ic29$) || module0302.NIL == module0305.f20423(var18, var7, (SubLObject)module0302.UNPROVIDED)) {
                                                    if (module0302.NIL != module0257.f16696(var16, var18, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED)) {
                                                        if (module0302.NIL != module0144.$g1796$.getDynamicValue(var9)) {
                                                            f20036(f20055(var6, var7, var8, var18));
                                                        }
                                                        var10 = (SubLObject)module0302.T;
                                                        var11 = module0303.f20199(var10);
                                                    }
                                                    else if (module0302.$ic21$ != module0144.$g1826$.getDynamicValue(var9) || module0302.NIL == module0205.f13215(Symbols.symbol_function((SubLObject)module0302.$ic22$), var7, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED)) {
                                                        if (module0302.NIL != module0305.f20354(var18, var7, (SubLObject)module0302.UNPROVIDED)) {
                                                            if (module0302.NIL != module0144.$g1796$.getDynamicValue(var9)) {
                                                                f20036(f20055(var6, var7, var8, var18));
                                                                f20036(module0274.f18081());
                                                            }
                                                            var10 = (SubLObject)module0302.T;
                                                            var11 = module0303.f20199(var10);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        finally {
                                            module0152.$g2129$.rebind(var13_83, var9);
                                        }
                                        var17 = var17.rest();
                                        var18 = var17.first();
                                    }
                                }
                            }
                            finally {
                                module0258.$g2489$.rebind(var13_82, var9);
                            }
                        }
                    }
                    finally {
                        module0139.$g1630$.rebind(var15, var9);
                        module0139.$g1632$.rebind(var14_82, var9);
                        module0139.$g1631$.rebind(var13_81, var9);
                    }
                }
                finally {
                    module0206.$g2330$.rebind(var13_80, var9);
                }
            }
            else {
                final SubLObject var19 = module0139.$g1630$.getDynamicValue(var9);
                final SubLObject var13_84 = module0139.$g1631$.currentBinding(var9);
                final SubLObject var14_83 = module0139.$g1632$.currentBinding(var9);
                final SubLObject var20 = module0139.$g1630$.currentBinding(var9);
                try {
                    module0139.$g1631$.bind(module0139.f9015(var19, (SubLObject)module0302.TEN_INTEGER), var9);
                    module0139.$g1632$.bind(module0139.f9016(var19), var9);
                    module0139.$g1630$.bind((SubLObject)module0302.T, var9);
                    f20035(var6, var8, (SubLObject)module0302.$ic24$);
                    if (module0302.NIL != module0302.$g2702$.getDynamicValue(var9)) {
                        final SubLObject var21 = f20048(var7, (SubLObject)module0302.$ic27$, module0144.$g1826$.getDynamicValue(var9), module0147.f9552((SubLObject)module0302.UNPROVIDED));
                        final SubLObject var13_85 = module0258.$g2489$.currentBinding(var9);
                        try {
                            module0258.$g2489$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0302.NIL == module0144.$g1768$.getDynamicValue(var9)), var9);
                            if (module0302.NIL == var11) {
                                SubLObject var22 = module0302.$g2702$.getDynamicValue(var9);
                                SubLObject var23 = (SubLObject)module0302.NIL;
                                var23 = var22.first();
                                while (module0302.NIL == var11 && module0302.NIL != var22) {
                                    final SubLObject var13_86 = module0152.$g2129$.currentBinding(var9);
                                    try {
                                        module0152.$g2129$.bind((SubLObject)module0302.NIL, var9);
                                        if (module0302.NIL != module0173.f10955(var23)) {
                                            if (!var6.eql(module0302.$ic28$) || !var8.eql((SubLObject)module0302.TWO_INTEGER) || !var23.eql(module0302.$ic29$) || module0302.NIL == module0305.f20423(var23, var7, (SubLObject)module0302.UNPROVIDED)) {
                                                if (module0302.NIL != module0257.f16696(var21, var23, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED)) {
                                                    if (module0302.NIL != module0144.$g1796$.getDynamicValue(var9)) {
                                                        f20036(f20055(var6, var7, var8, var23));
                                                    }
                                                    var10 = (SubLObject)module0302.T;
                                                    var11 = module0303.f20199(var10);
                                                }
                                                else if (module0302.$ic21$ != module0144.$g1826$.getDynamicValue(var9) || module0302.NIL == module0205.f13215(Symbols.symbol_function((SubLObject)module0302.$ic22$), var7, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED)) {
                                                    if (module0302.NIL != module0305.f20354(var23, var7, (SubLObject)module0302.UNPROVIDED)) {
                                                        if (module0302.NIL != module0144.$g1796$.getDynamicValue(var9)) {
                                                            f20036(f20055(var6, var7, var8, var23));
                                                            f20036(module0274.f18081());
                                                        }
                                                        var10 = (SubLObject)module0302.T;
                                                        var11 = module0303.f20199(var10);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    finally {
                                        module0152.$g2129$.rebind(var13_86, var9);
                                    }
                                    var22 = var22.rest();
                                    var23 = var22.first();
                                }
                            }
                        }
                        finally {
                            module0258.$g2489$.rebind(var13_85, var9);
                        }
                    }
                }
                finally {
                    module0139.$g1630$.rebind(var20, var9);
                    module0139.$g1632$.rebind(var14_83, var9);
                    module0139.$g1631$.rebind(var13_84, var9);
                }
            }
        }
        finally {
            module0302.$g2703$.rebind(var13, var9);
            module0302.$g2702$.rebind(var12, var9);
        }
        return var10;
    }
    
    public static SubLObject f20055(final SubLObject var6, final SubLObject var7, final SubLObject var8, final SubLObject var85) {
        final SubLThread var86 = SubLProcess.currentSubLThread();
        final SubLObject var87 = module0067.f4884(module0302.$g2703$.getDynamicValue(var86), var85, (SubLObject)module0302.UNPROVIDED);
        SubLObject var88 = (SubLObject)module0302.NIL;
        SubLObject var89 = var87;
        SubLObject var90 = (SubLObject)module0302.NIL;
        var90 = var89.first();
        while (module0302.NIL != var89) {
            var88 = (SubLObject)ConsesLow.cons(f20050((SubLObject)module0302.$ic30$, var6, var7, var8, var85, var90), var88);
            var89 = var89.rest();
            var90 = var89.first();
        }
        return var88;
    }
    
    public static SubLObject f20056(final SubLObject var6, final SubLObject var7, final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        SubLObject var10 = (SubLObject)module0302.NIL;
        SubLObject var11 = (SubLObject)module0302.NIL;
        final SubLObject var12 = module0302.$g2702$.currentBinding(var9);
        final SubLObject var13 = module0302.$g2703$.currentBinding(var9);
        try {
            module0302.$g2702$.bind((SubLObject)module0302.NIL, var9);
            module0302.$g2703$.bind(module0067.f4880((SubLObject)module0302.EQUAL, (SubLObject)module0302.UNPROVIDED), var9);
            if (var6.eql(module0302.$ic5$)) {
                final SubLObject var13_91 = module0206.$g2330$.currentBinding(var9);
                try {
                    module0206.$g2330$.bind((SubLObject)module0302.T, var9);
                    final SubLObject var14 = module0139.$g1630$.getDynamicValue(var9);
                    final SubLObject var13_92 = module0139.$g1631$.currentBinding(var9);
                    final SubLObject var14_93 = module0139.$g1632$.currentBinding(var9);
                    final SubLObject var15 = module0139.$g1630$.currentBinding(var9);
                    try {
                        module0139.$g1631$.bind(module0139.f9015(var14, (SubLObject)module0302.TEN_INTEGER), var9);
                        module0139.$g1632$.bind(module0139.f9016(var14), var9);
                        module0139.$g1630$.bind((SubLObject)module0302.T, var9);
                        f20035(var6, var8, (SubLObject)module0302.$ic31$);
                        if (module0302.NIL != module0302.$g2702$.getDynamicValue(var9)) {
                            if (module0302.NIL != module0269.f17710(var7)) {
                                module0302.$g2702$.setDynamicValue(Sequences.remove(module0302.$ic32$, module0302.$g2702$.getDynamicValue(var9), (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED), var9);
                            }
                            if (module0302.NIL == var11) {
                                SubLObject var16 = module0302.$g2702$.getDynamicValue(var9);
                                SubLObject var17 = (SubLObject)module0302.NIL;
                                var17 = var16.first();
                                while (module0302.NIL == var11 && module0302.NIL != var16) {
                                    if (module0302.NIL != module0173.f10955(var17) && module0302.NIL != module0305.f20374(var7, (SubLObject)module0302.UNPROVIDED) && module0302.NIL == module0256.f16576(var7, var17, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED)) {
                                        if (module0302.NIL != module0144.$g1796$.getDynamicValue(var9)) {
                                            f20036(f20057(var6, var7, var8, var17));
                                        }
                                        var10 = (SubLObject)module0302.T;
                                        var11 = module0303.f20199(var10);
                                    }
                                    var16 = var16.rest();
                                    var17 = var16.first();
                                }
                            }
                        }
                        else {
                            var10 = (SubLObject)module0302.NIL;
                        }
                    }
                    finally {
                        module0139.$g1630$.rebind(var15, var9);
                        module0139.$g1632$.rebind(var14_93, var9);
                        module0139.$g1631$.rebind(var13_92, var9);
                    }
                }
                finally {
                    module0206.$g2330$.rebind(var13_91, var9);
                }
            }
            else {
                final SubLObject var18 = module0139.$g1630$.getDynamicValue(var9);
                final SubLObject var13_93 = module0139.$g1631$.currentBinding(var9);
                final SubLObject var14_94 = module0139.$g1632$.currentBinding(var9);
                final SubLObject var19 = module0139.$g1630$.currentBinding(var9);
                try {
                    module0139.$g1631$.bind(module0139.f9015(var18, (SubLObject)module0302.TEN_INTEGER), var9);
                    module0139.$g1632$.bind(module0139.f9016(var18), var9);
                    module0139.$g1630$.bind((SubLObject)module0302.T, var9);
                    f20035(var6, var8, (SubLObject)module0302.$ic31$);
                    if (module0302.NIL != module0302.$g2702$.getDynamicValue(var9)) {
                        if (module0302.NIL != module0269.f17710(var7)) {
                            module0302.$g2702$.setDynamicValue(Sequences.remove(module0302.$ic32$, module0302.$g2702$.getDynamicValue(var9), (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED), var9);
                        }
                        if (module0302.NIL == var11) {
                            SubLObject var20 = module0302.$g2702$.getDynamicValue(var9);
                            SubLObject var21 = (SubLObject)module0302.NIL;
                            var21 = var20.first();
                            while (module0302.NIL == var11 && module0302.NIL != var20) {
                                if (module0302.NIL != module0173.f10955(var21) && module0302.NIL != module0305.f20374(var7, (SubLObject)module0302.UNPROVIDED) && module0302.NIL == module0256.f16576(var7, var21, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED)) {
                                    if (module0302.NIL != module0144.$g1796$.getDynamicValue(var9)) {
                                        f20036(f20057(var6, var7, var8, var21));
                                    }
                                    var10 = (SubLObject)module0302.T;
                                    var11 = module0303.f20199(var10);
                                }
                                var20 = var20.rest();
                                var21 = var20.first();
                            }
                        }
                    }
                    else {
                        var10 = (SubLObject)module0302.NIL;
                    }
                }
                finally {
                    module0139.$g1630$.rebind(var19, var9);
                    module0139.$g1632$.rebind(var14_94, var9);
                    module0139.$g1631$.rebind(var13_93, var9);
                }
            }
        }
        finally {
            module0302.$g2703$.rebind(var13, var9);
            module0302.$g2702$.rebind(var12, var9);
        }
        return var10;
    }
    
    public static SubLObject f20057(final SubLObject var6, final SubLObject var7, final SubLObject var8, final SubLObject var23) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        final SubLObject var25 = module0067.f4884(module0302.$g2703$.getDynamicValue(var24), var23, (SubLObject)module0302.UNPROVIDED);
        SubLObject var26 = (SubLObject)module0302.NIL;
        SubLObject var27 = var25;
        SubLObject var28 = (SubLObject)module0302.NIL;
        var28 = var27.first();
        while (module0302.NIL != var27) {
            var26 = (SubLObject)ConsesLow.cons(f20058(var6, var7, var8, var23, var28), var26);
            var27 = var27.rest();
            var28 = var27.first();
        }
        return var26;
    }
    
    public static SubLObject f20058(final SubLObject var6, final SubLObject var7, final SubLObject var8, final SubLObject var23, final SubLObject var35) {
        final SubLThread var36 = SubLProcess.currentSubLThread();
        final SubLObject var37 = module0147.$g2095$.getDynamicValue(var36);
        final SubLObject var38 = (SubLObject)module0302.$ic33$;
        SubLObject var39 = (SubLObject)module0302.NIL;
        SubLObject var40 = (SubLObject)module0302.NIL;
        SubLObject var41 = (SubLObject)module0302.NIL;
        SubLObject var42 = (SubLObject)module0302.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var35, var35, (SubLObject)module0302.$ic10$);
        var40 = var35.first();
        SubLObject var43 = var35.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var43, var35, (SubLObject)module0302.$ic10$);
        var41 = var43.first();
        var43 = var43.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var43, var35, (SubLObject)module0302.$ic10$);
        var42 = var43.first();
        var43 = var43.rest();
        if (module0302.NIL == var43) {
            if (var41 != module0302.$ic11$) {
                var39 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var41, var40), var39);
            }
            if (module0302.NIL == module0152.f9715()) {
                if (module0302.NIL != module0144.$g1847$.getDynamicValue(var36) && module0302.NIL != var42) {
                    var39 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0302.$ic12$, var42), var39);
                }
                var39 = ConsesLow.append(var39, f20041());
            }
            return (SubLObject)ConsesLow.listS(var38, new SubLObject[] { var7, var6, var8, var23, var37, ConsesLow.append(var39, (SubLObject)module0302.NIL) });
        }
        cdestructuring_bind.cdestructuring_bind_error(var35, (SubLObject)module0302.$ic10$);
        return (SubLObject)module0302.NIL;
    }
    
    public static SubLObject f20059(final SubLObject var6, final SubLObject var7, final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (module0302.NIL == module0144.$g1766$.getDynamicValue(var9)) {
            return (SubLObject)module0302.NIL;
        }
        SubLObject var10 = (SubLObject)module0302.NIL;
        SubLObject var11 = (SubLObject)module0302.NIL;
        final SubLObject var12 = module0302.$g2702$.currentBinding(var9);
        final SubLObject var13 = module0302.$g2703$.currentBinding(var9);
        try {
            module0302.$g2702$.bind((SubLObject)module0302.NIL, var9);
            module0302.$g2703$.bind(module0067.f4880((SubLObject)module0302.EQUAL, (SubLObject)module0302.UNPROVIDED), var9);
            if (var6.eql(module0302.$ic5$)) {
                final SubLObject var13_98 = module0206.$g2330$.currentBinding(var9);
                try {
                    module0206.$g2330$.bind((SubLObject)module0302.T, var9);
                    final SubLObject var14 = module0139.$g1630$.getDynamicValue(var9);
                    final SubLObject var13_99 = module0139.$g1631$.currentBinding(var9);
                    final SubLObject var14_100 = module0139.$g1632$.currentBinding(var9);
                    final SubLObject var15 = module0139.$g1630$.currentBinding(var9);
                    try {
                        module0139.$g1631$.bind(module0139.f9015(var14, (SubLObject)module0302.TEN_INTEGER), var9);
                        module0139.$g1632$.bind(module0139.f9016(var14), var9);
                        module0139.$g1630$.bind((SubLObject)module0302.T, var9);
                        f20035(var6, var8, (SubLObject)module0302.$ic31$);
                        if (module0302.NIL != module0302.$g2702$.getDynamicValue(var9)) {
                            final SubLObject var16 = f20048(var7, (SubLObject)module0302.$ic34$, module0144.$g1826$.getDynamicValue(var9), module0147.f9552((SubLObject)module0302.UNPROVIDED));
                            final SubLObject var13_100 = module0258.$g2489$.currentBinding(var9);
                            try {
                                module0258.$g2489$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0302.NIL == module0144.$g1768$.getDynamicValue(var9)), var9);
                                if (module0302.NIL == var11) {
                                    SubLObject var17 = module0302.$g2702$.getDynamicValue(var9);
                                    SubLObject var18 = (SubLObject)module0302.NIL;
                                    var18 = var17.first();
                                    while (module0302.NIL == var11 && module0302.NIL != var17) {
                                        if (module0302.NIL != module0173.f10955(var18) && module0302.NIL != module0257.f16696(var16, var18, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED)) {
                                            if (module0302.NIL != module0144.$g1796$.getDynamicValue(var9)) {
                                                f20036(f20060(var6, var7, var8, var18));
                                            }
                                            var10 = (SubLObject)module0302.T;
                                            var11 = module0303.f20199(var10);
                                        }
                                        var17 = var17.rest();
                                        var18 = var17.first();
                                    }
                                }
                            }
                            finally {
                                module0258.$g2489$.rebind(var13_100, var9);
                            }
                        }
                    }
                    finally {
                        module0139.$g1630$.rebind(var15, var9);
                        module0139.$g1632$.rebind(var14_100, var9);
                        module0139.$g1631$.rebind(var13_99, var9);
                    }
                }
                finally {
                    module0206.$g2330$.rebind(var13_98, var9);
                }
            }
            else {
                final SubLObject var19 = module0139.$g1630$.getDynamicValue(var9);
                final SubLObject var13_101 = module0139.$g1631$.currentBinding(var9);
                final SubLObject var14_101 = module0139.$g1632$.currentBinding(var9);
                final SubLObject var20 = module0139.$g1630$.currentBinding(var9);
                try {
                    module0139.$g1631$.bind(module0139.f9015(var19, (SubLObject)module0302.TEN_INTEGER), var9);
                    module0139.$g1632$.bind(module0139.f9016(var19), var9);
                    module0139.$g1630$.bind((SubLObject)module0302.T, var9);
                    f20035(var6, var8, (SubLObject)module0302.$ic31$);
                    if (module0302.NIL != module0302.$g2702$.getDynamicValue(var9)) {
                        final SubLObject var21 = f20048(var7, (SubLObject)module0302.$ic34$, module0144.$g1826$.getDynamicValue(var9), module0147.f9552((SubLObject)module0302.UNPROVIDED));
                        final SubLObject var13_102 = module0258.$g2489$.currentBinding(var9);
                        try {
                            module0258.$g2489$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0302.NIL == module0144.$g1768$.getDynamicValue(var9)), var9);
                            if (module0302.NIL == var11) {
                                SubLObject var22 = module0302.$g2702$.getDynamicValue(var9);
                                SubLObject var23 = (SubLObject)module0302.NIL;
                                var23 = var22.first();
                                while (module0302.NIL == var11 && module0302.NIL != var22) {
                                    if (module0302.NIL != module0173.f10955(var23) && module0302.NIL != module0257.f16696(var21, var23, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED)) {
                                        if (module0302.NIL != module0144.$g1796$.getDynamicValue(var9)) {
                                            f20036(f20060(var6, var7, var8, var23));
                                        }
                                        var10 = (SubLObject)module0302.T;
                                        var11 = module0303.f20199(var10);
                                    }
                                    var22 = var22.rest();
                                    var23 = var22.first();
                                }
                            }
                        }
                        finally {
                            module0258.$g2489$.rebind(var13_102, var9);
                        }
                    }
                }
                finally {
                    module0139.$g1630$.rebind(var20, var9);
                    module0139.$g1632$.rebind(var14_101, var9);
                    module0139.$g1631$.rebind(var13_101, var9);
                }
            }
        }
        finally {
            module0302.$g2703$.rebind(var13, var9);
            module0302.$g2702$.rebind(var12, var9);
        }
        return var10;
    }
    
    public static SubLObject f20060(final SubLObject var6, final SubLObject var7, final SubLObject var8, final SubLObject var103) {
        final SubLThread var104 = SubLProcess.currentSubLThread();
        final SubLObject var105 = module0067.f4884(module0302.$g2703$.getDynamicValue(var104), var103, (SubLObject)module0302.UNPROVIDED);
        final SubLObject var106 = module0147.$g2095$.getDynamicValue(var104);
        final SubLObject var107 = (SubLObject)module0302.$ic35$;
        SubLObject var108 = (SubLObject)module0302.NIL;
        SubLObject var109 = var105;
        SubLObject var110 = (SubLObject)module0302.NIL;
        var110 = var109.first();
        while (module0302.NIL != var109) {
            SubLObject var112;
            final SubLObject var111 = var112 = var110;
            SubLObject var113 = (SubLObject)module0302.NIL;
            SubLObject var114 = (SubLObject)module0302.NIL;
            SubLObject var115 = (SubLObject)module0302.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var112, var111, (SubLObject)module0302.$ic10$);
            var113 = var112.first();
            var112 = var112.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var112, var111, (SubLObject)module0302.$ic10$);
            var114 = var112.first();
            var112 = var112.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var112, var111, (SubLObject)module0302.$ic10$);
            var115 = var112.first();
            var112 = var112.rest();
            if (module0302.NIL == var112) {
                if (var113.eql(var6)) {
                    var108 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var107, var7, var6, var8, var103, var106), var108);
                }
                else {
                    var108 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var107, var7, var6, var8, var103, var106, (SubLObject)ConsesLow.list(var114, var113)), var108);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var111, (SubLObject)module0302.$ic10$);
            }
            var109 = var109.rest();
            var110 = var109.first();
        }
        return var108;
    }
    
    public static SubLObject f20061(final SubLObject var6, final SubLObject var7, final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (module0302.NIL == module0144.$g1769$.getDynamicValue(var9)) {
            return (SubLObject)module0302.NIL;
        }
        if (module0302.NIL != module0260.f17089(var6, module0302.$ic36$, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED)) {
            return (SubLObject)module0302.NIL;
        }
        SubLObject var10 = (SubLObject)module0302.NIL;
        SubLObject var11 = (SubLObject)module0302.NIL;
        final SubLObject var12 = module0302.$g2702$.currentBinding(var9);
        final SubLObject var13 = module0302.$g2703$.currentBinding(var9);
        try {
            module0302.$g2702$.bind((SubLObject)module0302.NIL, var9);
            module0302.$g2703$.bind(module0067.f4880((SubLObject)module0302.EQUAL, (SubLObject)module0302.UNPROVIDED), var9);
            if (var6.eql(module0302.$ic5$)) {
                final SubLObject var13_109 = module0206.$g2330$.currentBinding(var9);
                try {
                    module0206.$g2330$.bind((SubLObject)module0302.T, var9);
                    final SubLObject var14 = module0139.$g1630$.getDynamicValue(var9);
                    final SubLObject var13_110 = module0139.$g1631$.currentBinding(var9);
                    final SubLObject var14_111 = module0139.$g1632$.currentBinding(var9);
                    final SubLObject var15 = module0139.$g1630$.currentBinding(var9);
                    try {
                        module0139.$g1631$.bind(module0139.f9015(var14, (SubLObject)module0302.TEN_INTEGER), var9);
                        module0139.$g1632$.bind(module0139.f9016(var14), var9);
                        module0139.$g1630$.bind((SubLObject)module0302.T, var9);
                        f20035(var6, var8, (SubLObject)module0302.$ic37$);
                        if (module0302.NIL != module0302.$g2702$.getDynamicValue(var9) && module0302.NIL == var11) {
                            SubLObject var16 = module0302.$g2702$.getDynamicValue(var9);
                            SubLObject var17 = (SubLObject)module0302.NIL;
                            var17 = var16.first();
                            while (module0302.NIL == var11 && module0302.NIL != var16) {
                                final SubLObject var13_111 = module0144.$g1787$.currentBinding(var9);
                                final SubLObject var14_112 = module0144.$g1790$.currentBinding(var9);
                                try {
                                    module0144.$g1787$.bind((SubLObject)module0302.T, var9);
                                    module0144.$g1790$.bind((SubLObject)module0302.NIL, var9);
                                    if (module0302.NIL == module0309.f21021(var17, module0144.$g1828$.getDynamicValue(var9), var8, module0147.$g2095$.getDynamicValue(var9))) {
                                        if (module0302.NIL != module0144.$g1796$.getDynamicValue(var9)) {
                                            f20036(f20062(var6, var7, var8, var17));
                                        }
                                        var10 = (SubLObject)module0302.T;
                                        var11 = module0303.f20199(var10);
                                    }
                                }
                                finally {
                                    module0144.$g1790$.rebind(var14_112, var9);
                                    module0144.$g1787$.rebind(var13_111, var9);
                                }
                                var16 = var16.rest();
                                var17 = var16.first();
                            }
                        }
                    }
                    finally {
                        module0139.$g1630$.rebind(var15, var9);
                        module0139.$g1632$.rebind(var14_111, var9);
                        module0139.$g1631$.rebind(var13_110, var9);
                    }
                }
                finally {
                    module0206.$g2330$.rebind(var13_109, var9);
                }
            }
            else {
                final SubLObject var18 = module0139.$g1630$.getDynamicValue(var9);
                final SubLObject var13_112 = module0139.$g1631$.currentBinding(var9);
                final SubLObject var14_113 = module0139.$g1632$.currentBinding(var9);
                final SubLObject var19 = module0139.$g1630$.currentBinding(var9);
                try {
                    module0139.$g1631$.bind(module0139.f9015(var18, (SubLObject)module0302.TEN_INTEGER), var9);
                    module0139.$g1632$.bind(module0139.f9016(var18), var9);
                    module0139.$g1630$.bind((SubLObject)module0302.T, var9);
                    f20035(var6, var8, (SubLObject)module0302.$ic37$);
                    if (module0302.NIL != module0302.$g2702$.getDynamicValue(var9) && module0302.NIL == var11) {
                        SubLObject var20 = module0302.$g2702$.getDynamicValue(var9);
                        SubLObject var21 = (SubLObject)module0302.NIL;
                        var21 = var20.first();
                        while (module0302.NIL == var11 && module0302.NIL != var20) {
                            final SubLObject var13_113 = module0144.$g1787$.currentBinding(var9);
                            final SubLObject var14_114 = module0144.$g1790$.currentBinding(var9);
                            try {
                                module0144.$g1787$.bind((SubLObject)module0302.T, var9);
                                module0144.$g1790$.bind((SubLObject)module0302.NIL, var9);
                                if (module0302.NIL == module0309.f21021(var21, module0144.$g1828$.getDynamicValue(var9), var8, module0147.$g2095$.getDynamicValue(var9))) {
                                    if (module0302.NIL != module0144.$g1796$.getDynamicValue(var9)) {
                                        f20036(f20062(var6, var7, var8, var21));
                                    }
                                    var10 = (SubLObject)module0302.T;
                                    var11 = module0303.f20199(var10);
                                }
                            }
                            finally {
                                module0144.$g1790$.rebind(var14_114, var9);
                                module0144.$g1787$.rebind(var13_113, var9);
                            }
                            var20 = var20.rest();
                            var21 = var20.first();
                        }
                    }
                }
                finally {
                    module0139.$g1630$.rebind(var19, var9);
                    module0139.$g1632$.rebind(var14_113, var9);
                    module0139.$g1631$.rebind(var13_112, var9);
                }
            }
        }
        finally {
            module0302.$g2703$.rebind(var13, var9);
            module0302.$g2702$.rebind(var12, var9);
        }
        return var10;
    }
    
    public static SubLObject f20062(final SubLObject var6, final SubLObject var7, final SubLObject var8, final SubLObject var112) {
        final SubLThread var113 = SubLProcess.currentSubLThread();
        final SubLObject var114 = module0067.f4884(module0302.$g2703$.getDynamicValue(var113), var112, (SubLObject)module0302.UNPROVIDED);
        final SubLObject var115 = module0147.$g2095$.getDynamicValue(var113);
        final SubLObject var116 = (SubLObject)module0302.$ic38$;
        SubLObject var117 = (SubLObject)module0302.NIL;
        SubLObject var118 = var114;
        SubLObject var119 = (SubLObject)module0302.NIL;
        var119 = var118.first();
        while (module0302.NIL != var118) {
            SubLObject var121;
            final SubLObject var120 = var121 = var119;
            SubLObject var122 = (SubLObject)module0302.NIL;
            SubLObject var123 = (SubLObject)module0302.NIL;
            SubLObject var124 = (SubLObject)module0302.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var121, var120, (SubLObject)module0302.$ic10$);
            var122 = var121.first();
            var121 = var121.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var121, var120, (SubLObject)module0302.$ic10$);
            var123 = var121.first();
            var121 = var121.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var121, var120, (SubLObject)module0302.$ic10$);
            var124 = var121.first();
            var121 = var121.rest();
            if (module0302.NIL == var121) {
                if (var122.eql(var6)) {
                    var117 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var116, var7, var6, var8, var112, var115, module0144.$g1790$.getDynamicValue(var113)), var117);
                }
                else {
                    var117 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var116, var7, var6, var8, var112, var115, module0144.$g1790$.getDynamicValue(var113), (SubLObject)ConsesLow.list(var123, var122)), var117);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var120, (SubLObject)module0302.$ic10$);
            }
            var118 = var118.rest();
            var119 = var118.first();
        }
        return var117;
    }
    
    public static SubLObject f20063(final SubLObject var6, final SubLObject var121, final SubLObject var122, final SubLObject var123, final SubLObject var124) {
        final SubLThread var125 = SubLProcess.currentSubLThread();
        if (module0302.NIL == module0144.$g1755$.getDynamicValue(var125) || module0302.NIL == var6 || module0302.NIL == var121 || module0302.NIL == var123 || !var122.isInteger()) {
            return (SubLObject)module0302.NIL;
        }
        if (module0302.NIL != module0303.f20173() && module0302.NIL == module0303.f20180(var6)) {
            return (SubLObject)module0302.NIL;
        }
        SubLObject var126 = (SubLObject)module0302.NIL;
        SubLObject var127 = (SubLObject)module0302.NIL;
        final SubLObject var128 = module0302.$g2702$.currentBinding(var125);
        final SubLObject var129 = module0302.$g2703$.currentBinding(var125);
        try {
            module0302.$g2702$.bind((SubLObject)module0302.NIL, var125);
            module0302.$g2703$.bind(module0067.f4880((SubLObject)module0302.EQUAL, (SubLObject)module0302.UNPROVIDED), var125);
            if (var6.eql(module0302.$ic5$)) {
                final SubLObject var13_125 = module0206.$g2330$.currentBinding(var125);
                try {
                    module0206.$g2330$.bind((SubLObject)module0302.T, var125);
                    final SubLObject var130 = module0139.$g1630$.getDynamicValue(var125);
                    final SubLObject var13_126 = module0139.$g1631$.currentBinding(var125);
                    final SubLObject var14_127 = module0139.$g1632$.currentBinding(var125);
                    final SubLObject var131 = module0139.$g1630$.currentBinding(var125);
                    try {
                        module0139.$g1631$.bind(module0139.f9015(var130, (SubLObject)module0302.TEN_INTEGER), var125);
                        module0139.$g1632$.bind(module0139.f9016(var130), var125);
                        module0139.$g1630$.bind((SubLObject)module0302.T, var125);
                        f20064(var6, var121, var122, var124, (SubLObject)module0302.$ic39$, module0144.$g1761$.getDynamicValue(var125));
                        if (module0302.NIL != module0302.$g2702$.getDynamicValue(var125) && module0302.NIL == var127) {
                            SubLObject var132 = module0302.$g2702$.getDynamicValue(var125);
                            SubLObject var133 = (SubLObject)module0302.NIL;
                            var133 = var132.first();
                            while (module0302.NIL == var127 && module0302.NIL != var132) {
                                final SubLObject var13_127 = module0152.$g2129$.currentBinding(var125);
                                final SubLObject var14_128 = module0144.$g1870$.currentBinding(var125);
                                try {
                                    module0152.$g2129$.bind((SubLObject)module0302.NIL, var125);
                                    module0144.$g1870$.bind((SubLObject)module0302.NIL, var125);
                                    SubLObject var135;
                                    final SubLObject var134 = var135 = var133;
                                    SubLObject var136 = (SubLObject)module0302.NIL;
                                    SubLObject var137 = (SubLObject)module0302.NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp(var135, var134, (SubLObject)module0302.$ic40$);
                                    var136 = var135.first();
                                    var135 = var135.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp(var135, var134, (SubLObject)module0302.$ic40$);
                                    var137 = var135.first();
                                    var135 = var135.rest();
                                    if (module0302.NIL == var135) {
                                        if (module0302.NIL != module0173.f10955(var137)) {
                                            if (module0302.NIL == module0259.f16854(var123, var137, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED)) {
                                                if (module0302.NIL == module0305.f20337(var137, var123, (SubLObject)module0302.UNPROVIDED)) {
                                                    if (module0302.NIL != module0144.$g1796$.getDynamicValue(var125)) {
                                                        f20036(f20065(var6, var121, var122, var136, var123, var124, var137));
                                                        f20036(module0274.f18081());
                                                    }
                                                    var126 = (SubLObject)module0302.T;
                                                    var127 = module0303.f20199(var126);
                                                }
                                            }
                                        }
                                    }
                                    else {
                                        cdestructuring_bind.cdestructuring_bind_error(var134, (SubLObject)module0302.$ic40$);
                                    }
                                }
                                finally {
                                    module0144.$g1870$.rebind(var14_128, var125);
                                    module0152.$g2129$.rebind(var13_127, var125);
                                }
                                var132 = var132.rest();
                                var133 = var132.first();
                            }
                        }
                    }
                    finally {
                        module0139.$g1630$.rebind(var131, var125);
                        module0139.$g1632$.rebind(var14_127, var125);
                        module0139.$g1631$.rebind(var13_126, var125);
                    }
                }
                finally {
                    module0206.$g2330$.rebind(var13_125, var125);
                }
            }
            else {
                final SubLObject var138 = module0139.$g1630$.getDynamicValue(var125);
                final SubLObject var13_128 = module0139.$g1631$.currentBinding(var125);
                final SubLObject var14_129 = module0139.$g1632$.currentBinding(var125);
                final SubLObject var139 = module0139.$g1630$.currentBinding(var125);
                try {
                    module0139.$g1631$.bind(module0139.f9015(var138, (SubLObject)module0302.TEN_INTEGER), var125);
                    module0139.$g1632$.bind(module0139.f9016(var138), var125);
                    module0139.$g1630$.bind((SubLObject)module0302.T, var125);
                    f20064(var6, var121, var122, var124, (SubLObject)module0302.$ic39$, module0144.$g1761$.getDynamicValue(var125));
                    if (module0302.NIL != module0302.$g2702$.getDynamicValue(var125) && module0302.NIL == var127) {
                        SubLObject var140 = module0302.$g2702$.getDynamicValue(var125);
                        SubLObject var141 = (SubLObject)module0302.NIL;
                        var141 = var140.first();
                        while (module0302.NIL == var127 && module0302.NIL != var140) {
                            final SubLObject var13_129 = module0152.$g2129$.currentBinding(var125);
                            final SubLObject var14_130 = module0144.$g1870$.currentBinding(var125);
                            try {
                                module0152.$g2129$.bind((SubLObject)module0302.NIL, var125);
                                module0144.$g1870$.bind((SubLObject)module0302.NIL, var125);
                                SubLObject var143;
                                final SubLObject var142 = var143 = var141;
                                SubLObject var144 = (SubLObject)module0302.NIL;
                                SubLObject var145 = (SubLObject)module0302.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var143, var142, (SubLObject)module0302.$ic40$);
                                var144 = var143.first();
                                var143 = var143.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(var143, var142, (SubLObject)module0302.$ic40$);
                                var145 = var143.first();
                                var143 = var143.rest();
                                if (module0302.NIL == var143) {
                                    if (module0302.NIL != module0173.f10955(var145)) {
                                        if (module0302.NIL == module0259.f16854(var123, var145, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED)) {
                                            if (module0302.NIL == module0305.f20337(var145, var123, (SubLObject)module0302.UNPROVIDED)) {
                                                if (module0302.NIL != module0144.$g1796$.getDynamicValue(var125)) {
                                                    f20036(f20065(var6, var121, var122, var144, var123, var124, var145));
                                                    f20036(module0274.f18081());
                                                }
                                                var126 = (SubLObject)module0302.T;
                                                var127 = module0303.f20199(var126);
                                            }
                                        }
                                    }
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(var142, (SubLObject)module0302.$ic40$);
                                }
                            }
                            finally {
                                module0144.$g1870$.rebind(var14_130, var125);
                                module0152.$g2129$.rebind(var13_129, var125);
                            }
                            var140 = var140.rest();
                            var141 = var140.first();
                        }
                    }
                }
                finally {
                    module0139.$g1630$.rebind(var139, var125);
                    module0139.$g1632$.rebind(var14_129, var125);
                    module0139.$g1631$.rebind(var13_128, var125);
                }
            }
        }
        finally {
            module0302.$g2703$.rebind(var129, var125);
            module0302.$g2702$.rebind(var128, var125);
        }
        return var126;
    }
    
    public static SubLObject f20065(final SubLObject var6, final SubLObject var121, final SubLObject var122, final SubLObject var133, final SubLObject var123, final SubLObject var124, final SubLObject var134) {
        final SubLThread var135 = SubLProcess.currentSubLThread();
        final SubLObject var136 = (SubLObject)((module0302.NIL != module0226.f14968(var134, module0147.$g2095$.getDynamicValue(var135))) ? module0302.$ic41$ : module0302.$ic42$);
        return f20066(var136, var6, var121, var122, var133, var123, var124, var134);
    }
    
    public static SubLObject f20066(final SubLObject var37, final SubLObject var6, final SubLObject var121, final SubLObject var122, final SubLObject var141, final SubLObject var123, final SubLObject var124, final SubLObject var142) {
        final SubLThread var143 = SubLProcess.currentSubLThread();
        final SubLObject var144 = module0067.f4884(module0302.$g2703$.getDynamicValue(var143), (SubLObject)ConsesLow.list(var141, var142), (SubLObject)module0302.UNPROVIDED);
        final SubLObject var145 = module0147.$g2095$.getDynamicValue(var143);
        SubLObject var146 = (SubLObject)module0302.NIL;
        SubLObject var147 = var144;
        SubLObject var148 = (SubLObject)module0302.NIL;
        var148 = var147.first();
        while (module0302.NIL != var147) {
            SubLObject var150;
            final SubLObject var149 = var150 = var148;
            SubLObject var151 = (SubLObject)module0302.NIL;
            SubLObject var152 = (SubLObject)module0302.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var150, var149, (SubLObject)module0302.$ic43$);
            var151 = var150.first();
            var150 = var150.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var150, var149, (SubLObject)module0302.$ic43$);
            var152 = var150.first();
            var150 = var150.rest();
            if (module0302.NIL == var150) {
                if (var6.eql(var151)) {
                    var146 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(new SubLObject[] { var37, var123, var6, var124, var142, var141, var122, var121, var145 }), var146);
                }
                else {
                    var146 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(new SubLObject[] { var37, var123, var6, var124, var142, var141, var122, var121, var145, ConsesLow.list(var152, var151) }), var146);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var149, (SubLObject)module0302.$ic43$);
            }
            var147 = var147.rest();
            var148 = var147.first();
        }
        return var146;
    }
    
    public static SubLObject f20067(final SubLObject var6) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0302.NIL != module0222.f14635(module0302.$ic44$, var6, (SubLObject)module0302.ONE_INTEGER, (SubLObject)module0302.UNPROVIDED) || module0302.NIL != module0222.f14635(module0302.$ic45$, var6, (SubLObject)module0302.ONE_INTEGER, (SubLObject)module0302.UNPROVIDED) || module0302.NIL != module0222.f14635(module0302.$ic46$, var6, (SubLObject)module0302.ONE_INTEGER, (SubLObject)module0302.UNPROVIDED));
    }
    
    public static SubLObject f20068(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        SubLObject var8 = (SubLObject)module0302.NIL;
        if (module0302.NIL != module0269.f17706(var6)) {
            if (module0302.NIL == var8) {
                final SubLObject var9 = module0137.f8955(module0302.$ic47$);
                final SubLObject var10 = (SubLObject)((module0302.$ic48$ == module0302.$ic48$) ? module0302.$ic49$ : module0302.$ic50$);
                final SubLObject var11 = module0056.f4145(var10);
                SubLObject var12 = (SubLObject)module0302.NIL;
                final SubLObject var13 = module0139.$g1635$.currentBinding(var7);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var7);
                    final SubLObject var14 = (SubLObject)module0302.NIL;
                    final SubLObject var13_152 = module0141.$g1714$.currentBinding(var7);
                    final SubLObject var15 = module0141.$g1715$.currentBinding(var7);
                    try {
                        module0141.$g1714$.bind((module0302.NIL != var14) ? var14 : module0141.f9283(), var7);
                        module0141.$g1715$.bind((SubLObject)((module0302.NIL != var14) ? module0302.$ic51$ : module0141.$g1715$.getDynamicValue(var7)), var7);
                        if (module0302.NIL != var14 && module0302.NIL != module0136.f8864() && module0302.NIL == module0141.f9279(var14)) {
                            final SubLObject var16 = module0136.$g1591$.getDynamicValue(var7);
                            if (var16.eql((SubLObject)module0302.$ic52$)) {
                                module0136.f8870((SubLObject)module0302.ONE_INTEGER, (SubLObject)module0302.$ic53$, var14, (SubLObject)module0302.$ic54$, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED);
                            }
                            else if (var16.eql((SubLObject)module0302.$ic55$)) {
                                module0136.f8871((SubLObject)module0302.ONE_INTEGER, (SubLObject)module0302.$ic56$, (SubLObject)module0302.$ic53$, var14, (SubLObject)module0302.$ic54$, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED);
                            }
                            else if (var16.eql((SubLObject)module0302.$ic57$)) {
                                Errors.warn((SubLObject)module0302.$ic53$, var14, (SubLObject)module0302.$ic54$);
                            }
                            else {
                                Errors.warn((SubLObject)module0302.$ic58$, module0136.$g1591$.getDynamicValue(var7));
                                Errors.cerror((SubLObject)module0302.$ic56$, (SubLObject)module0302.$ic53$, var14, (SubLObject)module0302.$ic54$);
                            }
                        }
                        final SubLObject var13_153 = module0141.$g1670$.currentBinding(var7);
                        final SubLObject var14_155 = module0141.$g1671$.currentBinding(var7);
                        final SubLObject var17 = module0141.$g1672$.currentBinding(var7);
                        final SubLObject var18 = module0141.$g1674$.currentBinding(var7);
                        final SubLObject var19 = module0137.$g1605$.currentBinding(var7);
                        try {
                            module0141.$g1670$.bind(var9, var7);
                            module0141.$g1671$.bind(module0244.f15739(var9), var7);
                            module0141.$g1672$.bind(module0244.f15746(var9), var7);
                            module0141.$g1674$.bind((SubLObject)module0302.NIL, var7);
                            module0137.$g1605$.bind(var9, var7);
                            if (module0302.NIL != module0136.f8865() || module0302.NIL != module0244.f15795(var6, module0137.f8955((SubLObject)module0302.UNPROVIDED))) {
                                final SubLObject var13_154 = module0141.$g1677$.currentBinding(var7);
                                final SubLObject var14_156 = module0138.$g1619$.currentBinding(var7);
                                final SubLObject var19_160 = module0141.$g1674$.currentBinding(var7);
                                try {
                                    module0141.$g1677$.bind(module0141.f9208(), var7);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), var9), var7);
                                    module0141.$g1674$.bind((SubLObject)module0302.NIL, var7);
                                    module0249.f16055(var6, (SubLObject)module0302.UNPROVIDED);
                                    for (var12 = (SubLObject)ConsesLow.list(var6, module0141.f9195()); module0302.NIL != var12 && module0302.NIL == var8; var12 = module0056.f4150(var11)) {
                                        final SubLObject var147_161 = var12.first();
                                        final SubLObject var20 = conses_high.second(var12);
                                        final SubLObject var21 = var147_161;
                                        final SubLObject var13_155 = module0141.$g1674$.currentBinding(var7);
                                        try {
                                            module0141.$g1674$.bind(var20, var7);
                                            final SubLObject var22 = var20;
                                            if (module0302.NIL != f20067(var21)) {
                                                var8 = (SubLObject)module0302.T;
                                            }
                                            final SubLObject var23 = module0200.f12443(var9);
                                            SubLObject var24;
                                            SubLObject var25;
                                            SubLObject var13_156;
                                            SubLObject var14_157;
                                            SubLObject var26;
                                            SubLObject var27;
                                            SubLObject var28;
                                            SubLObject var29;
                                            SubLObject var30;
                                            SubLObject var31;
                                            SubLObject var13_157;
                                            SubLObject var174_178;
                                            SubLObject var32;
                                            SubLObject var33;
                                            SubLObject var13_158;
                                            SubLObject var34;
                                            SubLObject var35;
                                            SubLObject var36;
                                            SubLObject var37;
                                            SubLObject var38;
                                            SubLObject var39;
                                            SubLObject var40;
                                            SubLObject var41;
                                            SubLObject var167_188;
                                            SubLObject var42;
                                            SubLObject var13_159;
                                            SubLObject var44;
                                            SubLObject var43;
                                            SubLObject var45;
                                            SubLObject var46;
                                            SubLObject var47;
                                            SubLObject var48;
                                            SubLObject var49;
                                            SubLObject var50;
                                            for (var24 = (SubLObject)module0302.NIL, var24 = var23; module0302.NIL == var8 && module0302.NIL != var24; var24 = var24.rest()) {
                                                var25 = var24.first();
                                                var13_156 = module0137.$g1605$.currentBinding(var7);
                                                var14_157 = module0141.$g1674$.currentBinding(var7);
                                                try {
                                                    module0137.$g1605$.bind(var25, var7);
                                                    module0141.$g1674$.bind((SubLObject)((module0302.NIL != module0141.f9205((SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0302.NIL == module0141.$g1674$.getDynamicValue(var7)) : module0141.$g1674$.getDynamicValue(var7)), var7);
                                                    var26 = module0228.f15229(var147_161);
                                                    if (module0302.NIL != module0138.f8992(var26)) {
                                                        var27 = module0242.f15664(var26, module0137.f8955((SubLObject)module0302.UNPROVIDED));
                                                        if (module0302.NIL != var27) {
                                                            var28 = module0245.f15834(var27, module0138.f8979(), module0137.f8955((SubLObject)module0302.UNPROVIDED));
                                                            if (module0302.NIL != var28) {
                                                                for (var29 = module0066.f4838(module0067.f4891(var28)); module0302.NIL == var8 && module0302.NIL == module0066.f4841(var29); var29 = module0066.f4840(var29)) {
                                                                    var7.resetMultipleValues();
                                                                    var30 = module0066.f4839(var29);
                                                                    var31 = var7.secondMultipleValue();
                                                                    var7.resetMultipleValues();
                                                                    if (module0302.NIL != module0147.f9507(var30)) {
                                                                        var13_157 = module0138.$g1623$.currentBinding(var7);
                                                                        try {
                                                                            module0138.$g1623$.bind(var30, var7);
                                                                            for (var174_178 = module0066.f4838(module0067.f4891(var31)); module0302.NIL == var8 && module0302.NIL == module0066.f4841(var174_178); var174_178 = module0066.f4840(var174_178)) {
                                                                                var7.resetMultipleValues();
                                                                                var32 = module0066.f4839(var174_178);
                                                                                var33 = var7.secondMultipleValue();
                                                                                var7.resetMultipleValues();
                                                                                if (module0302.NIL != module0141.f9289(var32)) {
                                                                                    var13_158 = module0138.$g1624$.currentBinding(var7);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var32, var7);
                                                                                        var34 = var33;
                                                                                        if (module0302.NIL != module0077.f5302(var34)) {
                                                                                            var35 = module0077.f5333(var34);
                                                                                            for (var36 = module0032.f1741(var35), var37 = (SubLObject)module0302.NIL, var37 = module0032.f1742(var36, var35); module0302.NIL == var8 && module0302.NIL == module0032.f1744(var36, var37); var37 = module0032.f1743(var37)) {
                                                                                                var38 = module0032.f1745(var36, var37);
                                                                                                if (module0302.NIL != module0032.f1746(var37, var38) && module0302.NIL == module0249.f16059(var38, (SubLObject)module0302.UNPROVIDED)) {
                                                                                                    module0249.f16055(var38, (SubLObject)module0302.UNPROVIDED);
                                                                                                    module0056.f4149((SubLObject)ConsesLow.list(var38, module0141.f9195()), var11);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var34.isList()) {
                                                                                            if (module0302.NIL == var8) {
                                                                                                var39 = var34;
                                                                                                var40 = (SubLObject)module0302.NIL;
                                                                                                var40 = var39.first();
                                                                                                while (module0302.NIL == var8 && module0302.NIL != var39) {
                                                                                                    if (module0302.NIL == module0249.f16059(var40, (SubLObject)module0302.UNPROVIDED)) {
                                                                                                        module0249.f16055(var40, (SubLObject)module0302.UNPROVIDED);
                                                                                                        module0056.f4149((SubLObject)ConsesLow.list(var40, module0141.f9195()), var11);
                                                                                                    }
                                                                                                    var39 = var39.rest();
                                                                                                    var40 = var39.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)module0302.$ic59$, var34);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var13_158, var7);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var174_178);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var13_157, var7);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var29);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)module0302.FIVE_INTEGER, (SubLObject)module0302.$ic60$, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (module0302.NIL != module0155.f9785(var26, (SubLObject)module0302.UNPROVIDED)) {
                                                        var41 = ((module0302.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var7), module0137.f8955((SubLObject)module0302.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var7), module0137.f8955((SubLObject)module0302.UNPROVIDED)));
                                                        for (var167_188 = (SubLObject)module0302.NIL, var167_188 = var41; module0302.NIL == var8 && module0302.NIL != var167_188; var167_188 = var167_188.rest()) {
                                                            var42 = var167_188.first();
                                                            var13_159 = module0138.$g1625$.currentBinding(var7);
                                                            try {
                                                                module0138.$g1625$.bind(var42, var7);
                                                                var43 = (var44 = Functions.funcall(var42, var26));
                                                                if (module0302.NIL != module0077.f5302(var44)) {
                                                                    var45 = module0077.f5333(var44);
                                                                    for (var46 = module0032.f1741(var45), var47 = (SubLObject)module0302.NIL, var47 = module0032.f1742(var46, var45); module0302.NIL == var8 && module0302.NIL == module0032.f1744(var46, var47); var47 = module0032.f1743(var47)) {
                                                                        var48 = module0032.f1745(var46, var47);
                                                                        if (module0302.NIL != module0032.f1746(var47, var48) && module0302.NIL == module0249.f16059(var48, (SubLObject)module0302.UNPROVIDED)) {
                                                                            module0249.f16055(var48, (SubLObject)module0302.UNPROVIDED);
                                                                            module0056.f4149((SubLObject)ConsesLow.list(var48, module0141.f9195()), var11);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var44.isList()) {
                                                                    if (module0302.NIL == var8) {
                                                                        var49 = var44;
                                                                        var50 = (SubLObject)module0302.NIL;
                                                                        var50 = var49.first();
                                                                        while (module0302.NIL == var8 && module0302.NIL != var49) {
                                                                            if (module0302.NIL == module0249.f16059(var50, (SubLObject)module0302.UNPROVIDED)) {
                                                                                module0249.f16055(var50, (SubLObject)module0302.UNPROVIDED);
                                                                                module0056.f4149((SubLObject)ConsesLow.list(var50, module0141.f9195()), var11);
                                                                            }
                                                                            var49 = var49.rest();
                                                                            var50 = var49.first();
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)module0302.$ic59$, var44);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var13_159, var7);
                                                            }
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var14_157, var7);
                                                    module0137.$g1605$.rebind(var13_156, var7);
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var13_155, var7);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var19_160, var7);
                                    module0138.$g1619$.rebind(var14_156, var7);
                                    module0141.$g1677$.rebind(var13_154, var7);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)module0302.TWO_INTEGER, (SubLObject)module0302.$ic61$, var6, module0244.f15748(module0137.f8955((SubLObject)module0302.UNPROVIDED)), (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var19, var7);
                            module0141.$g1674$.rebind(var18, var7);
                            module0141.$g1672$.rebind(var17, var7);
                            module0141.$g1671$.rebind(var14_155, var7);
                            module0141.$g1670$.rebind(var13_153, var7);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var15, var7);
                        module0141.$g1714$.rebind(var13_152, var7);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var7));
                }
                finally {
                    module0139.$g1635$.rebind(var13, var7);
                }
            }
        }
        else {
            var8 = f20067(var6);
        }
        return var8;
    }
    
    public static SubLObject f20069(final SubLObject var6, final SubLObject var121, final SubLObject var122, final SubLObject var123, final SubLObject var124) {
        final SubLThread var125 = SubLProcess.currentSubLThread();
        if (module0302.NIL == module0144.$g1757$.getDynamicValue(var125) || module0302.NIL == var6 || module0302.NIL == var121 || module0302.NIL == var123 || !var122.isInteger()) {
            return (SubLObject)module0302.NIL;
        }
        if (module0302.NIL == f20068(var6)) {
            return (SubLObject)module0302.NIL;
        }
        SubLObject var126 = (SubLObject)module0302.NIL;
        SubLObject var127 = (SubLObject)module0302.NIL;
        final SubLObject var128 = module0302.$g2702$.currentBinding(var125);
        final SubLObject var129 = module0302.$g2703$.currentBinding(var125);
        try {
            module0302.$g2702$.bind((SubLObject)module0302.NIL, var125);
            module0302.$g2703$.bind(module0067.f4880((SubLObject)module0302.EQUAL, (SubLObject)module0302.UNPROVIDED), var125);
            if (var6.eql(module0302.$ic5$)) {
                final SubLObject var13_191 = module0206.$g2330$.currentBinding(var125);
                try {
                    module0206.$g2330$.bind((SubLObject)module0302.T, var125);
                    final SubLObject var130 = module0139.$g1630$.getDynamicValue(var125);
                    final SubLObject var13_192 = module0139.$g1631$.currentBinding(var125);
                    final SubLObject var14_193 = module0139.$g1632$.currentBinding(var125);
                    final SubLObject var131 = module0139.$g1630$.currentBinding(var125);
                    try {
                        module0139.$g1631$.bind(module0139.f9015(var130, (SubLObject)module0302.TEN_INTEGER), var125);
                        module0139.$g1632$.bind(module0139.f9016(var130), var125);
                        module0139.$g1630$.bind((SubLObject)module0302.T, var125);
                        f20064(var6, var121, var122, var124, (SubLObject)module0302.$ic62$, module0144.$g1762$.getDynamicValue(var125));
                        if (module0302.NIL != module0302.$g2702$.getDynamicValue(var125) && module0302.NIL == var127) {
                            SubLObject var132 = module0302.$g2702$.getDynamicValue(var125);
                            SubLObject var133 = (SubLObject)module0302.NIL;
                            var133 = var132.first();
                            while (module0302.NIL == var127 && module0302.NIL != var132) {
                                SubLObject var135;
                                final SubLObject var134 = var135 = var133;
                                SubLObject var136 = (SubLObject)module0302.NIL;
                                SubLObject var137 = (SubLObject)module0302.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var135, var134, (SubLObject)module0302.$ic63$);
                                var136 = var135.first();
                                var135 = var135.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(var135, var134, (SubLObject)module0302.$ic63$);
                                var137 = var135.first();
                                var135 = var135.rest();
                                if (module0302.NIL == var135) {
                                    if (module0302.NIL != module0173.f10955(var137) && module0302.NIL == module0256.f16576(var123, var137, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED)) {
                                        if (module0302.NIL != module0144.$g1796$.getDynamicValue(var125)) {
                                            f20036(f20070(var6, var121, var122, var136, var123, var124, var137));
                                        }
                                        var126 = (SubLObject)module0302.T;
                                        var127 = module0303.f20199(var126);
                                    }
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(var134, (SubLObject)module0302.$ic63$);
                                }
                                var132 = var132.rest();
                                var133 = var132.first();
                            }
                        }
                    }
                    finally {
                        module0139.$g1630$.rebind(var131, var125);
                        module0139.$g1632$.rebind(var14_193, var125);
                        module0139.$g1631$.rebind(var13_192, var125);
                    }
                }
                finally {
                    module0206.$g2330$.rebind(var13_191, var125);
                }
            }
            else {
                final SubLObject var138 = module0139.$g1630$.getDynamicValue(var125);
                final SubLObject var13_193 = module0139.$g1631$.currentBinding(var125);
                final SubLObject var14_194 = module0139.$g1632$.currentBinding(var125);
                final SubLObject var139 = module0139.$g1630$.currentBinding(var125);
                try {
                    module0139.$g1631$.bind(module0139.f9015(var138, (SubLObject)module0302.TEN_INTEGER), var125);
                    module0139.$g1632$.bind(module0139.f9016(var138), var125);
                    module0139.$g1630$.bind((SubLObject)module0302.T, var125);
                    f20064(var6, var121, var122, var124, (SubLObject)module0302.$ic62$, module0144.$g1762$.getDynamicValue(var125));
                    if (module0302.NIL != module0302.$g2702$.getDynamicValue(var125) && module0302.NIL == var127) {
                        SubLObject var140 = module0302.$g2702$.getDynamicValue(var125);
                        SubLObject var141 = (SubLObject)module0302.NIL;
                        var141 = var140.first();
                        while (module0302.NIL == var127 && module0302.NIL != var140) {
                            SubLObject var143;
                            final SubLObject var142 = var143 = var141;
                            SubLObject var144 = (SubLObject)module0302.NIL;
                            SubLObject var145 = (SubLObject)module0302.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var143, var142, (SubLObject)module0302.$ic63$);
                            var144 = var143.first();
                            var143 = var143.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var143, var142, (SubLObject)module0302.$ic63$);
                            var145 = var143.first();
                            var143 = var143.rest();
                            if (module0302.NIL == var143) {
                                if (module0302.NIL != module0173.f10955(var145) && module0302.NIL == module0256.f16576(var123, var145, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED)) {
                                    if (module0302.NIL != module0144.$g1796$.getDynamicValue(var125)) {
                                        f20036(f20070(var6, var121, var122, var144, var123, var124, var145));
                                    }
                                    var126 = (SubLObject)module0302.T;
                                    var127 = module0303.f20199(var126);
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var142, (SubLObject)module0302.$ic63$);
                            }
                            var140 = var140.rest();
                            var141 = var140.first();
                        }
                    }
                }
                finally {
                    module0139.$g1630$.rebind(var139, var125);
                    module0139.$g1632$.rebind(var14_194, var125);
                    module0139.$g1631$.rebind(var13_193, var125);
                }
            }
        }
        finally {
            module0302.$g2703$.rebind(var129, var125);
            module0302.$g2702$.rebind(var128, var125);
        }
        return var126;
    }
    
    public static SubLObject f20070(final SubLObject var6, final SubLObject var121, final SubLObject var122, final SubLObject var197, final SubLObject var123, final SubLObject var124, final SubLObject var198) {
        return f20066((SubLObject)module0302.$ic64$, var6, var121, var122, var197, var123, var124, var198);
    }
    
    public static SubLObject f20071(final SubLObject var6, final SubLObject var121, final SubLObject var122, final SubLObject var123, final SubLObject var124) {
        final SubLThread var125 = SubLProcess.currentSubLThread();
        if (module0302.NIL == module0144.$g1756$.getDynamicValue(var125) || module0302.NIL == var6 || module0302.NIL == var121 || module0302.NIL == var123 || !var122.isInteger()) {
            return (SubLObject)module0302.NIL;
        }
        if (module0302.NIL == f20072(var6)) {
            return (SubLObject)module0302.NIL;
        }
        SubLObject var126 = (SubLObject)module0302.NIL;
        SubLObject var127 = (SubLObject)module0302.NIL;
        final SubLObject var128 = module0302.$g2702$.currentBinding(var125);
        final SubLObject var129 = module0302.$g2703$.currentBinding(var125);
        try {
            module0302.$g2702$.bind((SubLObject)module0302.NIL, var125);
            module0302.$g2703$.bind(module0067.f4880((SubLObject)module0302.EQUAL, (SubLObject)module0302.UNPROVIDED), var125);
            if (var6.eql(module0302.$ic5$)) {
                final SubLObject var13_203 = module0206.$g2330$.currentBinding(var125);
                try {
                    module0206.$g2330$.bind((SubLObject)module0302.T, var125);
                    final SubLObject var130 = module0139.$g1630$.getDynamicValue(var125);
                    final SubLObject var13_204 = module0139.$g1631$.currentBinding(var125);
                    final SubLObject var14_205 = module0139.$g1632$.currentBinding(var125);
                    final SubLObject var131 = module0139.$g1630$.currentBinding(var125);
                    try {
                        module0139.$g1631$.bind(module0139.f9015(var130, (SubLObject)module0302.TEN_INTEGER), var125);
                        module0139.$g1632$.bind(module0139.f9016(var130), var125);
                        module0139.$g1630$.bind((SubLObject)module0302.T, var125);
                        f20064(var6, var121, var122, var124, (SubLObject)module0302.$ic65$, (SubLObject)module0302.T);
                        if (module0302.NIL != module0302.$g2702$.getDynamicValue(var125) && module0302.NIL == var127) {
                            SubLObject var132 = module0302.$g2702$.getDynamicValue(var125);
                            SubLObject var133 = (SubLObject)module0302.NIL;
                            var133 = var132.first();
                            while (module0302.NIL == var127 && module0302.NIL != var132) {
                                final SubLObject var13_205 = module0152.$g2129$.currentBinding(var125);
                                final SubLObject var14_206 = module0144.$g1870$.currentBinding(var125);
                                try {
                                    module0152.$g2129$.bind((SubLObject)module0302.NIL, var125);
                                    module0144.$g1870$.bind((SubLObject)module0302.NIL, var125);
                                    SubLObject var135;
                                    final SubLObject var134 = var135 = var133;
                                    SubLObject var136 = (SubLObject)module0302.NIL;
                                    SubLObject var137 = (SubLObject)module0302.NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp(var135, var134, (SubLObject)module0302.$ic40$);
                                    var136 = var135.first();
                                    var135 = var135.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp(var135, var134, (SubLObject)module0302.$ic40$);
                                    var137 = var135.first();
                                    var135 = var135.rest();
                                    if (module0302.NIL == var135) {
                                        if (module0302.NIL != module0173.f10955(var137)) {
                                            SubLObject var138 = (SubLObject)module0302.NIL;
                                            if (module0302.NIL != module0259.f16854(var123, var137, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED)) {
                                                var138 = (SubLObject)module0302.$ic66$;
                                                var126 = (SubLObject)module0302.T;
                                                var127 = module0303.f20199(var126);
                                            }
                                            else if (module0302.NIL != module0305.f20337(var137, var123, (SubLObject)module0302.UNPROVIDED)) {
                                                var138 = (SubLObject)module0302.$ic67$;
                                                var126 = (SubLObject)module0302.T;
                                                var127 = module0303.f20199(var126);
                                            }
                                            if (module0302.NIL != var138 && module0302.NIL != module0144.$g1796$.getDynamicValue(var125)) {
                                                f20036(f20066(var138, var6, var121, var122, var136, var123, var124, var137));
                                                f20036(module0274.f18081());
                                            }
                                        }
                                    }
                                    else {
                                        cdestructuring_bind.cdestructuring_bind_error(var134, (SubLObject)module0302.$ic40$);
                                    }
                                }
                                finally {
                                    module0144.$g1870$.rebind(var14_206, var125);
                                    module0152.$g2129$.rebind(var13_205, var125);
                                }
                                var132 = var132.rest();
                                var133 = var132.first();
                            }
                        }
                    }
                    finally {
                        module0139.$g1630$.rebind(var131, var125);
                        module0139.$g1632$.rebind(var14_205, var125);
                        module0139.$g1631$.rebind(var13_204, var125);
                    }
                }
                finally {
                    module0206.$g2330$.rebind(var13_203, var125);
                }
            }
            else {
                final SubLObject var139 = module0139.$g1630$.getDynamicValue(var125);
                final SubLObject var13_206 = module0139.$g1631$.currentBinding(var125);
                final SubLObject var14_207 = module0139.$g1632$.currentBinding(var125);
                final SubLObject var140 = module0139.$g1630$.currentBinding(var125);
                try {
                    module0139.$g1631$.bind(module0139.f9015(var139, (SubLObject)module0302.TEN_INTEGER), var125);
                    module0139.$g1632$.bind(module0139.f9016(var139), var125);
                    module0139.$g1630$.bind((SubLObject)module0302.T, var125);
                    f20064(var6, var121, var122, var124, (SubLObject)module0302.$ic65$, (SubLObject)module0302.T);
                    if (module0302.NIL != module0302.$g2702$.getDynamicValue(var125) && module0302.NIL == var127) {
                        SubLObject var141 = module0302.$g2702$.getDynamicValue(var125);
                        SubLObject var142 = (SubLObject)module0302.NIL;
                        var142 = var141.first();
                        while (module0302.NIL == var127 && module0302.NIL != var141) {
                            final SubLObject var13_207 = module0152.$g2129$.currentBinding(var125);
                            final SubLObject var14_208 = module0144.$g1870$.currentBinding(var125);
                            try {
                                module0152.$g2129$.bind((SubLObject)module0302.NIL, var125);
                                module0144.$g1870$.bind((SubLObject)module0302.NIL, var125);
                                SubLObject var144;
                                final SubLObject var143 = var144 = var142;
                                SubLObject var145 = (SubLObject)module0302.NIL;
                                SubLObject var146 = (SubLObject)module0302.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var144, var143, (SubLObject)module0302.$ic40$);
                                var145 = var144.first();
                                var144 = var144.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(var144, var143, (SubLObject)module0302.$ic40$);
                                var146 = var144.first();
                                var144 = var144.rest();
                                if (module0302.NIL == var144) {
                                    if (module0302.NIL != module0173.f10955(var146)) {
                                        SubLObject var147 = (SubLObject)module0302.NIL;
                                        if (module0302.NIL != module0259.f16854(var123, var146, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED)) {
                                            var147 = (SubLObject)module0302.$ic66$;
                                            var126 = (SubLObject)module0302.T;
                                            var127 = module0303.f20199(var126);
                                        }
                                        else if (module0302.NIL != module0305.f20337(var146, var123, (SubLObject)module0302.UNPROVIDED)) {
                                            var147 = (SubLObject)module0302.$ic67$;
                                            var126 = (SubLObject)module0302.T;
                                            var127 = module0303.f20199(var126);
                                        }
                                        if (module0302.NIL != var147 && module0302.NIL != module0144.$g1796$.getDynamicValue(var125)) {
                                            f20036(f20066(var147, var6, var121, var122, var145, var123, var124, var146));
                                            f20036(module0274.f18081());
                                        }
                                    }
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(var143, (SubLObject)module0302.$ic40$);
                                }
                            }
                            finally {
                                module0144.$g1870$.rebind(var14_208, var125);
                                module0152.$g2129$.rebind(var13_207, var125);
                            }
                            var141 = var141.rest();
                            var142 = var141.first();
                        }
                    }
                }
                finally {
                    module0139.$g1630$.rebind(var140, var125);
                    module0139.$g1632$.rebind(var14_207, var125);
                    module0139.$g1631$.rebind(var13_206, var125);
                }
            }
        }
        finally {
            module0302.$g2703$.rebind(var129, var125);
            module0302.$g2702$.rebind(var128, var125);
        }
        return var126;
    }
    
    public static SubLObject f20072(final SubLObject var6) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0302.NIL != module0222.f14635(module0302.$ic68$, var6, (SubLObject)module0302.ONE_INTEGER, (SubLObject)module0302.UNPROVIDED) || module0302.NIL != module0222.f14635(module0302.$ic69$, var6, (SubLObject)module0302.ONE_INTEGER, (SubLObject)module0302.UNPROVIDED));
    }
    
    public static SubLObject f20073(final SubLObject var6, final SubLObject var121, final SubLObject var122, final SubLObject var123, final SubLObject var124) {
        final SubLThread var125 = SubLProcess.currentSubLThread();
        if (module0302.NIL == module0144.$g1758$.getDynamicValue(var125) || module0302.NIL == var6 || module0302.NIL == var121 || module0302.NIL == var123 || !var122.isInteger()) {
            return (SubLObject)module0302.NIL;
        }
        if (module0302.NIL == f20074(var6)) {
            return (SubLObject)module0302.NIL;
        }
        SubLObject var126 = (SubLObject)module0302.NIL;
        SubLObject var127 = (SubLObject)module0302.NIL;
        final SubLObject var128 = module0302.$g2702$.currentBinding(var125);
        final SubLObject var129 = module0302.$g2703$.currentBinding(var125);
        try {
            module0302.$g2702$.bind((SubLObject)module0302.NIL, var125);
            module0302.$g2703$.bind(module0067.f4880((SubLObject)module0302.EQUAL, (SubLObject)module0302.UNPROVIDED), var125);
            if (var6.eql(module0302.$ic5$)) {
                final SubLObject var13_217 = module0206.$g2330$.currentBinding(var125);
                try {
                    module0206.$g2330$.bind((SubLObject)module0302.T, var125);
                    final SubLObject var130 = module0139.$g1630$.getDynamicValue(var125);
                    final SubLObject var13_218 = module0139.$g1631$.currentBinding(var125);
                    final SubLObject var14_219 = module0139.$g1632$.currentBinding(var125);
                    final SubLObject var131 = module0139.$g1630$.currentBinding(var125);
                    try {
                        module0139.$g1631$.bind(module0139.f9015(var130, (SubLObject)module0302.TEN_INTEGER), var125);
                        module0139.$g1632$.bind(module0139.f9016(var130), var125);
                        module0139.$g1630$.bind((SubLObject)module0302.T, var125);
                        f20064(var6, var121, var122, var124, (SubLObject)module0302.$ic70$, (SubLObject)module0302.T);
                        if (module0302.NIL != module0302.$g2702$.getDynamicValue(var125) && module0302.NIL == var127) {
                            SubLObject var132 = module0302.$g2702$.getDynamicValue(var125);
                            SubLObject var133 = (SubLObject)module0302.NIL;
                            var133 = var132.first();
                            while (module0302.NIL == var127 && module0302.NIL != var132) {
                                SubLObject var135;
                                final SubLObject var134 = var135 = var133;
                                SubLObject var136 = (SubLObject)module0302.NIL;
                                SubLObject var137 = (SubLObject)module0302.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var135, var134, (SubLObject)module0302.$ic63$);
                                var136 = var135.first();
                                var135 = var135.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(var135, var134, (SubLObject)module0302.$ic63$);
                                var137 = var135.first();
                                var135 = var135.rest();
                                if (module0302.NIL == var135) {
                                    if (module0302.NIL != module0173.f10955(var137)) {
                                        SubLObject var138 = (SubLObject)module0302.NIL;
                                        if (module0302.NIL != module0256.f16576(var123, var137, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED)) {
                                            var138 = (SubLObject)module0302.$ic71$;
                                            var126 = (SubLObject)module0302.T;
                                            var127 = module0303.f20199(var126);
                                        }
                                        else if (module0302.NIL != module0305.f20337(var137, var123, (SubLObject)module0302.UNPROVIDED)) {
                                            var138 = (SubLObject)module0302.$ic67$;
                                            var126 = (SubLObject)module0302.T;
                                            var127 = module0303.f20199(var126);
                                        }
                                        if (module0302.NIL != var138 && module0302.NIL != module0144.$g1796$.getDynamicValue(var125)) {
                                            f20036(f20066(var138, var6, var121, var122, var136, var123, var124, var137));
                                            f20036(module0274.f18081());
                                        }
                                    }
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(var134, (SubLObject)module0302.$ic63$);
                                }
                                var132 = var132.rest();
                                var133 = var132.first();
                            }
                        }
                    }
                    finally {
                        module0139.$g1630$.rebind(var131, var125);
                        module0139.$g1632$.rebind(var14_219, var125);
                        module0139.$g1631$.rebind(var13_218, var125);
                    }
                }
                finally {
                    module0206.$g2330$.rebind(var13_217, var125);
                }
            }
            else {
                final SubLObject var139 = module0139.$g1630$.getDynamicValue(var125);
                final SubLObject var13_219 = module0139.$g1631$.currentBinding(var125);
                final SubLObject var14_220 = module0139.$g1632$.currentBinding(var125);
                final SubLObject var140 = module0139.$g1630$.currentBinding(var125);
                try {
                    module0139.$g1631$.bind(module0139.f9015(var139, (SubLObject)module0302.TEN_INTEGER), var125);
                    module0139.$g1632$.bind(module0139.f9016(var139), var125);
                    module0139.$g1630$.bind((SubLObject)module0302.T, var125);
                    f20064(var6, var121, var122, var124, (SubLObject)module0302.$ic70$, (SubLObject)module0302.T);
                    if (module0302.NIL != module0302.$g2702$.getDynamicValue(var125) && module0302.NIL == var127) {
                        SubLObject var141 = module0302.$g2702$.getDynamicValue(var125);
                        SubLObject var142 = (SubLObject)module0302.NIL;
                        var142 = var141.first();
                        while (module0302.NIL == var127 && module0302.NIL != var141) {
                            SubLObject var144;
                            final SubLObject var143 = var144 = var142;
                            SubLObject var145 = (SubLObject)module0302.NIL;
                            SubLObject var146 = (SubLObject)module0302.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var144, var143, (SubLObject)module0302.$ic63$);
                            var145 = var144.first();
                            var144 = var144.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var144, var143, (SubLObject)module0302.$ic63$);
                            var146 = var144.first();
                            var144 = var144.rest();
                            if (module0302.NIL == var144) {
                                if (module0302.NIL != module0173.f10955(var146)) {
                                    SubLObject var147 = (SubLObject)module0302.NIL;
                                    if (module0302.NIL != module0256.f16576(var123, var146, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED)) {
                                        var147 = (SubLObject)module0302.$ic71$;
                                        var126 = (SubLObject)module0302.T;
                                        var127 = module0303.f20199(var126);
                                    }
                                    else if (module0302.NIL != module0305.f20337(var146, var123, (SubLObject)module0302.UNPROVIDED)) {
                                        var147 = (SubLObject)module0302.$ic67$;
                                        var126 = (SubLObject)module0302.T;
                                        var127 = module0303.f20199(var126);
                                    }
                                    if (module0302.NIL != var147 && module0302.NIL != module0144.$g1796$.getDynamicValue(var125)) {
                                        f20036(f20066(var147, var6, var121, var122, var145, var123, var124, var146));
                                        f20036(module0274.f18081());
                                    }
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var143, (SubLObject)module0302.$ic63$);
                            }
                            var141 = var141.rest();
                            var142 = var141.first();
                        }
                    }
                }
                finally {
                    module0139.$g1630$.rebind(var140, var125);
                    module0139.$g1632$.rebind(var14_220, var125);
                    module0139.$g1631$.rebind(var13_219, var125);
                }
            }
        }
        finally {
            module0302.$g2703$.rebind(var129, var125);
            module0302.$g2702$.rebind(var128, var125);
        }
        return var126;
    }
    
    public static SubLObject f20074(final SubLObject var6) {
        return module0222.f14635(module0302.$ic72$, var6, (SubLObject)module0302.ONE_INTEGER, (SubLObject)module0302.UNPROVIDED);
    }
    
    public static SubLObject f20075(final SubLObject var6, final SubLObject var121, final SubLObject var122, final SubLObject var123, final SubLObject var124) {
        final SubLThread var125 = SubLProcess.currentSubLThread();
        if (module0302.NIL == module0144.$g1760$.getDynamicValue(var125) || module0302.NIL == var6 || module0302.NIL == var121 || module0302.NIL == var123 || !var122.isInteger()) {
            return (SubLObject)module0302.NIL;
        }
        if (module0302.NIL == f20076(var6)) {
            return (SubLObject)module0302.NIL;
        }
        SubLObject var126 = (SubLObject)module0302.NIL;
        SubLObject var127 = (SubLObject)module0302.NIL;
        final SubLObject var128 = module0302.$g2702$.currentBinding(var125);
        final SubLObject var129 = module0302.$g2703$.currentBinding(var125);
        try {
            module0302.$g2702$.bind((SubLObject)module0302.NIL, var125);
            module0302.$g2703$.bind(module0067.f4880((SubLObject)module0302.EQUAL, (SubLObject)module0302.UNPROVIDED), var125);
            if (var6.eql(module0302.$ic5$)) {
                final SubLObject var13_227 = module0206.$g2330$.currentBinding(var125);
                try {
                    module0206.$g2330$.bind((SubLObject)module0302.T, var125);
                    final SubLObject var130 = module0139.$g1630$.getDynamicValue(var125);
                    final SubLObject var13_228 = module0139.$g1631$.currentBinding(var125);
                    final SubLObject var14_229 = module0139.$g1632$.currentBinding(var125);
                    final SubLObject var131 = module0139.$g1630$.currentBinding(var125);
                    try {
                        module0139.$g1631$.bind(module0139.f9015(var130, (SubLObject)module0302.TEN_INTEGER), var125);
                        module0139.$g1632$.bind(module0139.f9016(var130), var125);
                        module0139.$g1630$.bind((SubLObject)module0302.T, var125);
                        f20064(var6, var121, var122, var124, (SubLObject)module0302.$ic73$, (SubLObject)module0302.T);
                        if (module0302.NIL != module0302.$g2702$.getDynamicValue(var125) && module0302.NIL == var127) {
                            SubLObject var132 = module0302.$g2702$.getDynamicValue(var125);
                            SubLObject var133 = (SubLObject)module0302.NIL;
                            var133 = var132.first();
                            while (module0302.NIL == var127 && module0302.NIL != var132) {
                                SubLObject var135;
                                final SubLObject var134 = var135 = var133;
                                SubLObject var136 = (SubLObject)module0302.NIL;
                                SubLObject var137 = (SubLObject)module0302.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var135, var134, (SubLObject)module0302.$ic74$);
                                var136 = var135.first();
                                var135 = var135.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(var135, var134, (SubLObject)module0302.$ic74$);
                                var137 = var135.first();
                                var135 = var135.rest();
                                if (module0302.NIL == var135) {
                                    if (module0302.NIL != module0173.f10955(var137)) {
                                        SubLObject var138 = (SubLObject)module0302.NIL;
                                        if (module0302.NIL == module0259.f16854(var123, var137, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED)) {
                                            var138 = (SubLObject)module0302.$ic75$;
                                            var126 = (SubLObject)module0302.T;
                                            var127 = module0303.f20199(var126);
                                        }
                                        else if (module0302.NIL == module0305.f20337(var137, var123, (SubLObject)module0302.UNPROVIDED)) {
                                            var138 = (SubLObject)module0302.$ic75$;
                                            var126 = (SubLObject)module0302.T;
                                            var127 = module0303.f20199(var126);
                                        }
                                        if (module0302.NIL != var138 && module0302.NIL != module0144.$g1796$.getDynamicValue(var125)) {
                                            f20036(f20066(var138, var6, var121, var122, var136, var123, var124, var137));
                                            f20036(module0274.f18081());
                                        }
                                    }
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(var134, (SubLObject)module0302.$ic74$);
                                }
                                var132 = var132.rest();
                                var133 = var132.first();
                            }
                        }
                    }
                    finally {
                        module0139.$g1630$.rebind(var131, var125);
                        module0139.$g1632$.rebind(var14_229, var125);
                        module0139.$g1631$.rebind(var13_228, var125);
                    }
                }
                finally {
                    module0206.$g2330$.rebind(var13_227, var125);
                }
            }
            else {
                final SubLObject var139 = module0139.$g1630$.getDynamicValue(var125);
                final SubLObject var13_229 = module0139.$g1631$.currentBinding(var125);
                final SubLObject var14_230 = module0139.$g1632$.currentBinding(var125);
                final SubLObject var140 = module0139.$g1630$.currentBinding(var125);
                try {
                    module0139.$g1631$.bind(module0139.f9015(var139, (SubLObject)module0302.TEN_INTEGER), var125);
                    module0139.$g1632$.bind(module0139.f9016(var139), var125);
                    module0139.$g1630$.bind((SubLObject)module0302.T, var125);
                    f20064(var6, var121, var122, var124, (SubLObject)module0302.$ic73$, (SubLObject)module0302.T);
                    if (module0302.NIL != module0302.$g2702$.getDynamicValue(var125) && module0302.NIL == var127) {
                        SubLObject var141 = module0302.$g2702$.getDynamicValue(var125);
                        SubLObject var142 = (SubLObject)module0302.NIL;
                        var142 = var141.first();
                        while (module0302.NIL == var127 && module0302.NIL != var141) {
                            SubLObject var144;
                            final SubLObject var143 = var144 = var142;
                            SubLObject var145 = (SubLObject)module0302.NIL;
                            SubLObject var146 = (SubLObject)module0302.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var144, var143, (SubLObject)module0302.$ic74$);
                            var145 = var144.first();
                            var144 = var144.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var144, var143, (SubLObject)module0302.$ic74$);
                            var146 = var144.first();
                            var144 = var144.rest();
                            if (module0302.NIL == var144) {
                                if (module0302.NIL != module0173.f10955(var146)) {
                                    SubLObject var147 = (SubLObject)module0302.NIL;
                                    if (module0302.NIL == module0259.f16854(var123, var146, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED)) {
                                        var147 = (SubLObject)module0302.$ic75$;
                                        var126 = (SubLObject)module0302.T;
                                        var127 = module0303.f20199(var126);
                                    }
                                    else if (module0302.NIL == module0305.f20337(var146, var123, (SubLObject)module0302.UNPROVIDED)) {
                                        var147 = (SubLObject)module0302.$ic75$;
                                        var126 = (SubLObject)module0302.T;
                                        var127 = module0303.f20199(var126);
                                    }
                                    if (module0302.NIL != var147 && module0302.NIL != module0144.$g1796$.getDynamicValue(var125)) {
                                        f20036(f20066(var147, var6, var121, var122, var145, var123, var124, var146));
                                        f20036(module0274.f18081());
                                    }
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var143, (SubLObject)module0302.$ic74$);
                            }
                            var141 = var141.rest();
                            var142 = var141.first();
                        }
                    }
                }
                finally {
                    module0139.$g1630$.rebind(var140, var125);
                    module0139.$g1632$.rebind(var14_230, var125);
                    module0139.$g1631$.rebind(var13_229, var125);
                }
            }
        }
        finally {
            module0302.$g2703$.rebind(var129, var125);
            module0302.$g2702$.rebind(var128, var125);
        }
        return var126;
    }
    
    public static SubLObject f20076(final SubLObject var6) {
        return module0222.f14635(module0302.$ic76$, var6, (SubLObject)module0302.ONE_INTEGER, (SubLObject)module0302.UNPROVIDED);
    }
    
    public static SubLObject f20077(final SubLObject var6, final SubLObject var121, final SubLObject var122, final SubLObject var123, final SubLObject var124) {
        final SubLThread var125 = SubLProcess.currentSubLThread();
        if (module0302.NIL == module0144.$g1759$.getDynamicValue(var125) || module0302.NIL == var6 || module0302.NIL == var121 || module0302.NIL == var123 || !var122.isInteger()) {
            return (SubLObject)module0302.NIL;
        }
        if (module0302.NIL == f20078(var6)) {
            return (SubLObject)module0302.NIL;
        }
        SubLObject var126 = (SubLObject)module0302.NIL;
        SubLObject var127 = (SubLObject)module0302.NIL;
        final SubLObject var128 = module0302.$g2702$.currentBinding(var125);
        final SubLObject var129 = module0302.$g2703$.currentBinding(var125);
        try {
            module0302.$g2702$.bind((SubLObject)module0302.NIL, var125);
            module0302.$g2703$.bind(module0067.f4880((SubLObject)module0302.EQUAL, (SubLObject)module0302.UNPROVIDED), var125);
            if (var6.eql(module0302.$ic5$)) {
                final SubLObject var13_237 = module0206.$g2330$.currentBinding(var125);
                try {
                    module0206.$g2330$.bind((SubLObject)module0302.T, var125);
                    final SubLObject var130 = module0139.$g1630$.getDynamicValue(var125);
                    final SubLObject var13_238 = module0139.$g1631$.currentBinding(var125);
                    final SubLObject var14_239 = module0139.$g1632$.currentBinding(var125);
                    final SubLObject var131 = module0139.$g1630$.currentBinding(var125);
                    try {
                        module0139.$g1631$.bind(module0139.f9015(var130, (SubLObject)module0302.TEN_INTEGER), var125);
                        module0139.$g1632$.bind(module0139.f9016(var130), var125);
                        module0139.$g1630$.bind((SubLObject)module0302.T, var125);
                        f20064(var6, var121, var122, var124, (SubLObject)module0302.$ic77$, (SubLObject)module0302.T);
                        if (module0302.NIL != module0302.$g2702$.getDynamicValue(var125) && module0302.NIL == var127) {
                            SubLObject var132 = module0302.$g2702$.getDynamicValue(var125);
                            SubLObject var133 = (SubLObject)module0302.NIL;
                            var133 = var132.first();
                            while (module0302.NIL == var127 && module0302.NIL != var132) {
                                SubLObject var135;
                                final SubLObject var134 = var135 = var133;
                                SubLObject var136 = (SubLObject)module0302.NIL;
                                SubLObject var137 = (SubLObject)module0302.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var135, var134, (SubLObject)module0302.$ic78$);
                                var136 = var135.first();
                                var135 = var135.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(var135, var134, (SubLObject)module0302.$ic78$);
                                var137 = var135.first();
                                var135 = var135.rest();
                                if (module0302.NIL == var135) {
                                    if (module0302.NIL != module0173.f10955(var137)) {
                                        SubLObject var138 = (SubLObject)module0302.NIL;
                                        if (module0302.NIL == module0256.f16576(var123, var137, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED)) {
                                            var138 = (SubLObject)module0302.$ic79$;
                                            var126 = (SubLObject)module0302.T;
                                            var127 = module0303.f20199(var126);
                                        }
                                        if (module0302.NIL != var138 && module0302.NIL != module0144.$g1796$.getDynamicValue(var125)) {
                                            f20036(f20066(var138, var6, var121, var122, var136, var123, var124, var137));
                                            f20036(module0274.f18081());
                                        }
                                    }
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(var134, (SubLObject)module0302.$ic78$);
                                }
                                var132 = var132.rest();
                                var133 = var132.first();
                            }
                        }
                    }
                    finally {
                        module0139.$g1630$.rebind(var131, var125);
                        module0139.$g1632$.rebind(var14_239, var125);
                        module0139.$g1631$.rebind(var13_238, var125);
                    }
                }
                finally {
                    module0206.$g2330$.rebind(var13_237, var125);
                }
            }
            else {
                final SubLObject var139 = module0139.$g1630$.getDynamicValue(var125);
                final SubLObject var13_239 = module0139.$g1631$.currentBinding(var125);
                final SubLObject var14_240 = module0139.$g1632$.currentBinding(var125);
                final SubLObject var140 = module0139.$g1630$.currentBinding(var125);
                try {
                    module0139.$g1631$.bind(module0139.f9015(var139, (SubLObject)module0302.TEN_INTEGER), var125);
                    module0139.$g1632$.bind(module0139.f9016(var139), var125);
                    module0139.$g1630$.bind((SubLObject)module0302.T, var125);
                    f20064(var6, var121, var122, var124, (SubLObject)module0302.$ic77$, (SubLObject)module0302.T);
                    if (module0302.NIL != module0302.$g2702$.getDynamicValue(var125) && module0302.NIL == var127) {
                        SubLObject var141 = module0302.$g2702$.getDynamicValue(var125);
                        SubLObject var142 = (SubLObject)module0302.NIL;
                        var142 = var141.first();
                        while (module0302.NIL == var127 && module0302.NIL != var141) {
                            SubLObject var144;
                            final SubLObject var143 = var144 = var142;
                            SubLObject var145 = (SubLObject)module0302.NIL;
                            SubLObject var146 = (SubLObject)module0302.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var144, var143, (SubLObject)module0302.$ic78$);
                            var145 = var144.first();
                            var144 = var144.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var144, var143, (SubLObject)module0302.$ic78$);
                            var146 = var144.first();
                            var144 = var144.rest();
                            if (module0302.NIL == var144) {
                                if (module0302.NIL != module0173.f10955(var146)) {
                                    SubLObject var147 = (SubLObject)module0302.NIL;
                                    if (module0302.NIL == module0256.f16576(var123, var146, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED)) {
                                        var147 = (SubLObject)module0302.$ic79$;
                                        var126 = (SubLObject)module0302.T;
                                        var127 = module0303.f20199(var126);
                                    }
                                    if (module0302.NIL != var147 && module0302.NIL != module0144.$g1796$.getDynamicValue(var125)) {
                                        f20036(f20066(var147, var6, var121, var122, var145, var123, var124, var146));
                                        f20036(module0274.f18081());
                                    }
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var143, (SubLObject)module0302.$ic78$);
                            }
                            var141 = var141.rest();
                            var142 = var141.first();
                        }
                    }
                }
                finally {
                    module0139.$g1630$.rebind(var140, var125);
                    module0139.$g1632$.rebind(var14_240, var125);
                    module0139.$g1631$.rebind(var13_239, var125);
                }
            }
        }
        finally {
            module0302.$g2703$.rebind(var129, var125);
            module0302.$g2702$.rebind(var128, var125);
        }
        return var126;
    }
    
    public static SubLObject f20078(final SubLObject var6) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0302.NIL != module0222.f14635(module0302.$ic80$, var6, (SubLObject)module0302.ONE_INTEGER, (SubLObject)module0302.UNPROVIDED) || module0302.NIL != module0222.f14635(module0302.$ic81$, var6, (SubLObject)module0302.ONE_INTEGER, (SubLObject)module0302.UNPROVIDED) || module0302.NIL != module0222.f14635(module0302.$ic82$, var6, (SubLObject)module0302.ONE_INTEGER, (SubLObject)module0302.UNPROVIDED) || module0302.NIL != module0222.f14635(module0302.$ic83$, var6, (SubLObject)module0302.ONE_INTEGER, (SubLObject)module0302.UNPROVIDED));
    }
    
    public static SubLObject f20079(final SubLObject var6, final SubLObject var121, final SubLObject var122, final SubLObject var123, final SubLObject var124) {
        final SubLThread var125 = SubLProcess.currentSubLThread();
        if (module0302.NIL == module0144.$g1755$.getDynamicValue(var125) || module0302.NIL == module0144.$g1764$.getDynamicValue(var125) || module0302.NIL == var121 || !var122.isInteger()) {
            return (SubLObject)module0302.NIL;
        }
        if (module0302.NIL != module0303.f20173() && module0302.NIL == module0303.f20180(var6)) {
            return (SubLObject)module0302.NIL;
        }
        SubLObject var126 = (SubLObject)module0302.NIL;
        SubLObject var127 = (SubLObject)module0302.NIL;
        final SubLObject var128 = module0302.$g2702$.currentBinding(var125);
        final SubLObject var129 = module0302.$g2703$.currentBinding(var125);
        try {
            module0302.$g2702$.bind((SubLObject)module0302.NIL, var125);
            module0302.$g2703$.bind(module0067.f4880((SubLObject)module0302.EQUAL, (SubLObject)module0302.UNPROVIDED), var125);
            if (var6.eql(module0302.$ic5$)) {
                final SubLObject var13_247 = module0206.$g2330$.currentBinding(var125);
                try {
                    module0206.$g2330$.bind((SubLObject)module0302.T, var125);
                    final SubLObject var130 = module0139.$g1630$.getDynamicValue(var125);
                    final SubLObject var13_248 = module0139.$g1631$.currentBinding(var125);
                    final SubLObject var14_249 = module0139.$g1632$.currentBinding(var125);
                    final SubLObject var131 = module0139.$g1630$.currentBinding(var125);
                    try {
                        module0139.$g1631$.bind(module0139.f9015(var130, (SubLObject)module0302.TEN_INTEGER), var125);
                        module0139.$g1632$.bind(module0139.f9016(var130), var125);
                        module0139.$g1630$.bind((SubLObject)module0302.T, var125);
                        f20064(var6, var121, var122, var124, (SubLObject)module0302.$ic39$, module0144.$g1761$.getDynamicValue(var125));
                        if (module0302.NIL != module0302.$g2702$.getDynamicValue(var125) && module0302.NIL == var127) {
                            SubLObject var132 = module0302.$g2702$.getDynamicValue(var125);
                            SubLObject var133 = (SubLObject)module0302.NIL;
                            var133 = var132.first();
                            while (module0302.NIL == var127 && module0302.NIL != var132) {
                                SubLObject var135;
                                final SubLObject var134 = var135 = var133;
                                SubLObject var136 = (SubLObject)module0302.NIL;
                                SubLObject var137 = (SubLObject)module0302.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var135, var134, (SubLObject)module0302.$ic40$);
                                var136 = var135.first();
                                var135 = var135.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(var135, var134, (SubLObject)module0302.$ic40$);
                                var137 = var135.first();
                                var135 = var135.rest();
                                if (module0302.NIL == var135) {
                                    if (module0302.NIL != module0173.f10955(var137)) {
                                        final SubLObject var138 = f20048(var123, (SubLObject)module0302.$ic20$, module0144.$g1826$.getDynamicValue(var125), module0147.f9552((SubLObject)module0302.UNPROVIDED));
                                        if (module0302.NIL != module0257.f16696(var138, var137, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED)) {
                                            if (module0302.NIL != module0144.$g1796$.getDynamicValue(var125)) {
                                                f20036(f20080(var6, var121, var122, var136, var123, var124, var137));
                                            }
                                            var126 = (SubLObject)module0302.T;
                                            var127 = module0303.f20199(var126);
                                        }
                                        final SubLObject var13_249 = module0152.$g2129$.currentBinding(var125);
                                        try {
                                            module0152.$g2129$.bind((SubLObject)module0302.NIL, var125);
                                            if (module0302.NIL == var127) {
                                                if (module0302.$ic21$ != module0144.$g1826$.getDynamicValue(var125) || module0302.NIL == module0205.f13215(Symbols.symbol_function((SubLObject)module0302.$ic22$), var123, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED)) {
                                                    if (module0302.NIL != module0305.f20340(var137, var123, (SubLObject)module0302.UNPROVIDED)) {
                                                        if (module0302.NIL != module0144.$g1796$.getDynamicValue(var125)) {
                                                            f20036(f20080(var6, var121, var122, var136, var123, var124, var137));
                                                            f20036(module0274.f18081());
                                                        }
                                                        var126 = (SubLObject)module0302.T;
                                                        var127 = module0303.f20199(var126);
                                                    }
                                                }
                                            }
                                        }
                                        finally {
                                            module0152.$g2129$.rebind(var13_249, var125);
                                        }
                                    }
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(var134, (SubLObject)module0302.$ic40$);
                                }
                                var132 = var132.rest();
                                var133 = var132.first();
                            }
                        }
                    }
                    finally {
                        module0139.$g1630$.rebind(var131, var125);
                        module0139.$g1632$.rebind(var14_249, var125);
                        module0139.$g1631$.rebind(var13_248, var125);
                    }
                }
                finally {
                    module0206.$g2330$.rebind(var13_247, var125);
                }
            }
            else {
                final SubLObject var139 = module0139.$g1630$.getDynamicValue(var125);
                final SubLObject var13_250 = module0139.$g1631$.currentBinding(var125);
                final SubLObject var14_250 = module0139.$g1632$.currentBinding(var125);
                final SubLObject var140 = module0139.$g1630$.currentBinding(var125);
                try {
                    module0139.$g1631$.bind(module0139.f9015(var139, (SubLObject)module0302.TEN_INTEGER), var125);
                    module0139.$g1632$.bind(module0139.f9016(var139), var125);
                    module0139.$g1630$.bind((SubLObject)module0302.T, var125);
                    f20064(var6, var121, var122, var124, (SubLObject)module0302.$ic39$, module0144.$g1761$.getDynamicValue(var125));
                    if (module0302.NIL != module0302.$g2702$.getDynamicValue(var125) && module0302.NIL == var127) {
                        SubLObject var141 = module0302.$g2702$.getDynamicValue(var125);
                        SubLObject var142 = (SubLObject)module0302.NIL;
                        var142 = var141.first();
                        while (module0302.NIL == var127 && module0302.NIL != var141) {
                            SubLObject var144;
                            final SubLObject var143 = var144 = var142;
                            SubLObject var145 = (SubLObject)module0302.NIL;
                            SubLObject var146 = (SubLObject)module0302.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var144, var143, (SubLObject)module0302.$ic40$);
                            var145 = var144.first();
                            var144 = var144.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var144, var143, (SubLObject)module0302.$ic40$);
                            var146 = var144.first();
                            var144 = var144.rest();
                            if (module0302.NIL == var144) {
                                if (module0302.NIL != module0173.f10955(var146)) {
                                    final SubLObject var147 = f20048(var123, (SubLObject)module0302.$ic20$, module0144.$g1826$.getDynamicValue(var125), module0147.f9552((SubLObject)module0302.UNPROVIDED));
                                    if (module0302.NIL != module0257.f16696(var147, var146, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED)) {
                                        if (module0302.NIL != module0144.$g1796$.getDynamicValue(var125)) {
                                            f20036(f20080(var6, var121, var122, var145, var123, var124, var146));
                                        }
                                        var126 = (SubLObject)module0302.T;
                                        var127 = module0303.f20199(var126);
                                    }
                                    final SubLObject var13_251 = module0152.$g2129$.currentBinding(var125);
                                    try {
                                        module0152.$g2129$.bind((SubLObject)module0302.NIL, var125);
                                        if (module0302.NIL == var127) {
                                            if (module0302.$ic21$ != module0144.$g1826$.getDynamicValue(var125) || module0302.NIL == module0205.f13215(Symbols.symbol_function((SubLObject)module0302.$ic22$), var123, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED)) {
                                                if (module0302.NIL != module0305.f20340(var146, var123, (SubLObject)module0302.UNPROVIDED)) {
                                                    if (module0302.NIL != module0144.$g1796$.getDynamicValue(var125)) {
                                                        f20036(f20080(var6, var121, var122, var145, var123, var124, var146));
                                                        f20036(module0274.f18081());
                                                    }
                                                    var126 = (SubLObject)module0302.T;
                                                    var127 = module0303.f20199(var126);
                                                }
                                            }
                                        }
                                    }
                                    finally {
                                        module0152.$g2129$.rebind(var13_251, var125);
                                    }
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var143, (SubLObject)module0302.$ic40$);
                            }
                            var141 = var141.rest();
                            var142 = var141.first();
                        }
                    }
                }
                finally {
                    module0139.$g1630$.rebind(var140, var125);
                    module0139.$g1632$.rebind(var14_250, var125);
                    module0139.$g1631$.rebind(var13_250, var125);
                }
            }
        }
        finally {
            module0302.$g2703$.rebind(var129, var125);
            module0302.$g2702$.rebind(var128, var125);
        }
        return var126;
    }
    
    public static SubLObject f20080(final SubLObject var6, final SubLObject var121, final SubLObject var122, final SubLObject var133, final SubLObject var123, final SubLObject var124, final SubLObject var134) {
        return f20066((SubLObject)module0302.$ic84$, var6, var121, var122, var133, var123, var124, var134);
    }
    
    public static SubLObject f20081(final SubLObject var6, final SubLObject var121, final SubLObject var122, final SubLObject var123, final SubLObject var124) {
        final SubLThread var125 = SubLProcess.currentSubLThread();
        if (module0302.NIL == module0144.$g1757$.getDynamicValue(var125) || module0302.NIL == module0144.$g1766$.getDynamicValue(var125) || module0302.NIL == var121 || !var122.isInteger()) {
            return (SubLObject)module0302.NIL;
        }
        if (module0302.NIL == f20068(var6)) {
            return (SubLObject)module0302.NIL;
        }
        SubLObject var126 = (SubLObject)module0302.NIL;
        SubLObject var127 = (SubLObject)module0302.NIL;
        final SubLObject var128 = module0302.$g2702$.currentBinding(var125);
        final SubLObject var129 = module0302.$g2703$.currentBinding(var125);
        try {
            module0302.$g2702$.bind((SubLObject)module0302.NIL, var125);
            module0302.$g2703$.bind(module0067.f4880((SubLObject)module0302.EQUAL, (SubLObject)module0302.UNPROVIDED), var125);
            if (var6.eql(module0302.$ic5$)) {
                final SubLObject var13_258 = module0206.$g2330$.currentBinding(var125);
                try {
                    module0206.$g2330$.bind((SubLObject)module0302.T, var125);
                    final SubLObject var130 = module0139.$g1630$.getDynamicValue(var125);
                    final SubLObject var13_259 = module0139.$g1631$.currentBinding(var125);
                    final SubLObject var14_260 = module0139.$g1632$.currentBinding(var125);
                    final SubLObject var131 = module0139.$g1630$.currentBinding(var125);
                    try {
                        module0139.$g1631$.bind(module0139.f9015(var130, (SubLObject)module0302.TEN_INTEGER), var125);
                        module0139.$g1632$.bind(module0139.f9016(var130), var125);
                        module0139.$g1630$.bind((SubLObject)module0302.T, var125);
                        f20064(var6, var121, var122, var124, (SubLObject)module0302.$ic62$, module0144.$g1762$.getDynamicValue(var125));
                        if (module0302.NIL != module0302.$g2702$.getDynamicValue(var125) && module0302.NIL == var127) {
                            SubLObject var132 = module0302.$g2702$.getDynamicValue(var125);
                            SubLObject var133 = (SubLObject)module0302.NIL;
                            var133 = var132.first();
                            while (module0302.NIL == var127 && module0302.NIL != var132) {
                                SubLObject var135;
                                final SubLObject var134 = var135 = var133;
                                SubLObject var136 = (SubLObject)module0302.NIL;
                                SubLObject var137 = (SubLObject)module0302.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var135, var134, (SubLObject)module0302.$ic63$);
                                var136 = var135.first();
                                var135 = var135.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(var135, var134, (SubLObject)module0302.$ic63$);
                                var137 = var135.first();
                                var135 = var135.rest();
                                if (module0302.NIL == var135) {
                                    if (module0302.NIL != module0173.f10955(var137)) {
                                        final SubLObject var138 = f20048(var123, (SubLObject)module0302.$ic34$, module0144.$g1826$.getDynamicValue(var125), module0147.f9552((SubLObject)module0302.UNPROVIDED));
                                        if (module0302.NIL != module0257.f16696(var138, var137, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED)) {
                                            if (module0302.NIL != module0144.$g1796$.getDynamicValue(var125)) {
                                                f20036(f20082(var6, var121, var122, var136, var123, var124, var137));
                                            }
                                            var126 = (SubLObject)module0302.T;
                                            var127 = module0303.f20199(var126);
                                        }
                                    }
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(var134, (SubLObject)module0302.$ic63$);
                                }
                                var132 = var132.rest();
                                var133 = var132.first();
                            }
                        }
                    }
                    finally {
                        module0139.$g1630$.rebind(var131, var125);
                        module0139.$g1632$.rebind(var14_260, var125);
                        module0139.$g1631$.rebind(var13_259, var125);
                    }
                }
                finally {
                    module0206.$g2330$.rebind(var13_258, var125);
                }
            }
            else {
                final SubLObject var139 = module0139.$g1630$.getDynamicValue(var125);
                final SubLObject var13_260 = module0139.$g1631$.currentBinding(var125);
                final SubLObject var14_261 = module0139.$g1632$.currentBinding(var125);
                final SubLObject var140 = module0139.$g1630$.currentBinding(var125);
                try {
                    module0139.$g1631$.bind(module0139.f9015(var139, (SubLObject)module0302.TEN_INTEGER), var125);
                    module0139.$g1632$.bind(module0139.f9016(var139), var125);
                    module0139.$g1630$.bind((SubLObject)module0302.T, var125);
                    f20064(var6, var121, var122, var124, (SubLObject)module0302.$ic62$, module0144.$g1762$.getDynamicValue(var125));
                    if (module0302.NIL != module0302.$g2702$.getDynamicValue(var125) && module0302.NIL == var127) {
                        SubLObject var141 = module0302.$g2702$.getDynamicValue(var125);
                        SubLObject var142 = (SubLObject)module0302.NIL;
                        var142 = var141.first();
                        while (module0302.NIL == var127 && module0302.NIL != var141) {
                            SubLObject var144;
                            final SubLObject var143 = var144 = var142;
                            SubLObject var145 = (SubLObject)module0302.NIL;
                            SubLObject var146 = (SubLObject)module0302.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var144, var143, (SubLObject)module0302.$ic63$);
                            var145 = var144.first();
                            var144 = var144.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var144, var143, (SubLObject)module0302.$ic63$);
                            var146 = var144.first();
                            var144 = var144.rest();
                            if (module0302.NIL == var144) {
                                if (module0302.NIL != module0173.f10955(var146)) {
                                    final SubLObject var147 = f20048(var123, (SubLObject)module0302.$ic34$, module0144.$g1826$.getDynamicValue(var125), module0147.f9552((SubLObject)module0302.UNPROVIDED));
                                    if (module0302.NIL != module0257.f16696(var147, var146, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED)) {
                                        if (module0302.NIL != module0144.$g1796$.getDynamicValue(var125)) {
                                            f20036(f20082(var6, var121, var122, var145, var123, var124, var146));
                                        }
                                        var126 = (SubLObject)module0302.T;
                                        var127 = module0303.f20199(var126);
                                    }
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var143, (SubLObject)module0302.$ic63$);
                            }
                            var141 = var141.rest();
                            var142 = var141.first();
                        }
                    }
                }
                finally {
                    module0139.$g1630$.rebind(var140, var125);
                    module0139.$g1632$.rebind(var14_261, var125);
                    module0139.$g1631$.rebind(var13_260, var125);
                }
            }
        }
        finally {
            module0302.$g2703$.rebind(var129, var125);
            module0302.$g2702$.rebind(var128, var125);
        }
        return var126;
    }
    
    public static SubLObject f20082(final SubLObject var6, final SubLObject var121, final SubLObject var122, final SubLObject var197, final SubLObject var123, final SubLObject var124, final SubLObject var198) {
        return f20066((SubLObject)module0302.$ic85$, var6, var121, var122, var197, var123, var124, var198);
    }
    
    public static SubLObject f20083(final SubLObject var6, final SubLObject var121, final SubLObject var122, final SubLObject var123, final SubLObject var124) {
        final SubLThread var125 = SubLProcess.currentSubLThread();
        if (module0302.NIL == module0144.$g1779$.getDynamicValue(var125) || module0302.NIL == var121 || !var122.isInteger()) {
            return (SubLObject)module0302.NIL;
        }
        if (module0302.NIL != module0303.f20181() && module0302.NIL == module0303.f20188(var6)) {
            return (SubLObject)module0302.NIL;
        }
        SubLObject var126 = (SubLObject)module0302.NIL;
        SubLObject var127 = (SubLObject)module0302.NIL;
        final SubLObject var128 = module0302.$g2702$.currentBinding(var125);
        final SubLObject var129 = module0302.$g2703$.currentBinding(var125);
        try {
            module0302.$g2702$.bind((SubLObject)module0302.NIL, var125);
            module0302.$g2703$.bind(module0067.f4880((SubLObject)module0302.EQUAL, (SubLObject)module0302.UNPROVIDED), var125);
            if (var6.eql(module0302.$ic5$)) {
                final SubLObject var13_267 = module0206.$g2330$.currentBinding(var125);
                try {
                    module0206.$g2330$.bind((SubLObject)module0302.T, var125);
                    final SubLObject var130 = module0139.$g1630$.getDynamicValue(var125);
                    final SubLObject var13_268 = module0139.$g1631$.currentBinding(var125);
                    final SubLObject var14_269 = module0139.$g1632$.currentBinding(var125);
                    final SubLObject var131 = module0139.$g1630$.currentBinding(var125);
                    try {
                        module0139.$g1631$.bind(module0139.f9015(var130, (SubLObject)module0302.TEN_INTEGER), var125);
                        module0139.$g1632$.bind(module0139.f9016(var130), var125);
                        module0139.$g1630$.bind((SubLObject)module0302.T, var125);
                        f20064(var6, var121, var122, var124, (SubLObject)module0302.$ic86$, module0144.$g1763$.getDynamicValue(var125));
                        if (module0302.NIL != module0302.$g2702$.getDynamicValue(var125) && module0302.NIL == var127) {
                            SubLObject var132 = module0302.$g2702$.getDynamicValue(var125);
                            SubLObject var133 = (SubLObject)module0302.NIL;
                            var133 = var132.first();
                            while (module0302.NIL == var127 && module0302.NIL != var132) {
                                SubLObject var135;
                                final SubLObject var134 = var135 = var133;
                                SubLObject var136 = (SubLObject)module0302.NIL;
                                SubLObject var137 = (SubLObject)module0302.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var135, var134, (SubLObject)module0302.$ic87$);
                                var136 = var135.first();
                                var135 = var135.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(var135, var134, (SubLObject)module0302.$ic87$);
                                var137 = var135.first();
                                var135 = var135.rest();
                                if (module0302.NIL == var135) {
                                    if (module0302.NIL == module0309.f21021(var137, module0144.$g1828$.getDynamicValue(var125), var124, module0147.$g2095$.getDynamicValue(var125))) {
                                        if (module0302.NIL != module0144.$g1796$.getDynamicValue(var125)) {
                                            f20036(f20084(var6, var121, var122, var136, var123, var124, var137));
                                        }
                                        var126 = (SubLObject)module0302.T;
                                        var127 = module0303.f20199(var126);
                                    }
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(var134, (SubLObject)module0302.$ic87$);
                                }
                                var132 = var132.rest();
                                var133 = var132.first();
                            }
                        }
                    }
                    finally {
                        module0139.$g1630$.rebind(var131, var125);
                        module0139.$g1632$.rebind(var14_269, var125);
                        module0139.$g1631$.rebind(var13_268, var125);
                    }
                }
                finally {
                    module0206.$g2330$.rebind(var13_267, var125);
                }
            }
            else {
                final SubLObject var138 = module0139.$g1630$.getDynamicValue(var125);
                final SubLObject var13_269 = module0139.$g1631$.currentBinding(var125);
                final SubLObject var14_270 = module0139.$g1632$.currentBinding(var125);
                final SubLObject var139 = module0139.$g1630$.currentBinding(var125);
                try {
                    module0139.$g1631$.bind(module0139.f9015(var138, (SubLObject)module0302.TEN_INTEGER), var125);
                    module0139.$g1632$.bind(module0139.f9016(var138), var125);
                    module0139.$g1630$.bind((SubLObject)module0302.T, var125);
                    f20064(var6, var121, var122, var124, (SubLObject)module0302.$ic86$, module0144.$g1763$.getDynamicValue(var125));
                    if (module0302.NIL != module0302.$g2702$.getDynamicValue(var125) && module0302.NIL == var127) {
                        SubLObject var140 = module0302.$g2702$.getDynamicValue(var125);
                        SubLObject var141 = (SubLObject)module0302.NIL;
                        var141 = var140.first();
                        while (module0302.NIL == var127 && module0302.NIL != var140) {
                            SubLObject var143;
                            final SubLObject var142 = var143 = var141;
                            SubLObject var144 = (SubLObject)module0302.NIL;
                            SubLObject var145 = (SubLObject)module0302.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var143, var142, (SubLObject)module0302.$ic87$);
                            var144 = var143.first();
                            var143 = var143.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var143, var142, (SubLObject)module0302.$ic87$);
                            var145 = var143.first();
                            var143 = var143.rest();
                            if (module0302.NIL == var143) {
                                if (module0302.NIL == module0309.f21021(var145, module0144.$g1828$.getDynamicValue(var125), var124, module0147.$g2095$.getDynamicValue(var125))) {
                                    if (module0302.NIL != module0144.$g1796$.getDynamicValue(var125)) {
                                        f20036(f20084(var6, var121, var122, var144, var123, var124, var145));
                                    }
                                    var126 = (SubLObject)module0302.T;
                                    var127 = module0303.f20199(var126);
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var142, (SubLObject)module0302.$ic87$);
                            }
                            var140 = var140.rest();
                            var141 = var140.first();
                        }
                    }
                }
                finally {
                    module0139.$g1630$.rebind(var139, var125);
                    module0139.$g1632$.rebind(var14_270, var125);
                    module0139.$g1631$.rebind(var13_269, var125);
                }
            }
        }
        finally {
            module0302.$g2703$.rebind(var129, var125);
            module0302.$g2702$.rebind(var128, var125);
        }
        return var126;
    }
    
    public static SubLObject f20084(final SubLObject var6, final SubLObject var121, final SubLObject var122, final SubLObject var133, final SubLObject var123, final SubLObject var124, final SubLObject var273) {
        return f20066((SubLObject)module0302.$ic88$, var6, var121, var122, var133, var123, var124, var273);
    }
    
    public static SubLObject f20085(final SubLObject var6) {
        return module0222.f14635(module0302.$ic89$, var6, (SubLObject)module0302.ONE_INTEGER, (SubLObject)module0302.UNPROVIDED);
    }
    
    public static SubLObject f20086(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        SubLObject var8 = (SubLObject)module0302.NIL;
        if (module0302.NIL != module0269.f17706(var6)) {
            if (module0302.NIL == var8) {
                final SubLObject var9 = module0137.f8955(module0302.$ic47$);
                final SubLObject var10 = (SubLObject)((module0302.$ic48$ == module0302.$ic48$) ? module0302.$ic49$ : module0302.$ic50$);
                final SubLObject var11 = module0056.f4145(var10);
                SubLObject var12 = (SubLObject)module0302.NIL;
                final SubLObject var13 = module0139.$g1635$.currentBinding(var7);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var7);
                    final SubLObject var14 = (SubLObject)module0302.NIL;
                    final SubLObject var13_278 = module0141.$g1714$.currentBinding(var7);
                    final SubLObject var15 = module0141.$g1715$.currentBinding(var7);
                    try {
                        module0141.$g1714$.bind((module0302.NIL != var14) ? var14 : module0141.f9283(), var7);
                        module0141.$g1715$.bind((SubLObject)((module0302.NIL != var14) ? module0302.$ic51$ : module0141.$g1715$.getDynamicValue(var7)), var7);
                        if (module0302.NIL != var14 && module0302.NIL != module0136.f8864() && module0302.NIL == module0141.f9279(var14)) {
                            final SubLObject var16 = module0136.$g1591$.getDynamicValue(var7);
                            if (var16.eql((SubLObject)module0302.$ic52$)) {
                                module0136.f8870((SubLObject)module0302.ONE_INTEGER, (SubLObject)module0302.$ic53$, var14, (SubLObject)module0302.$ic54$, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED);
                            }
                            else if (var16.eql((SubLObject)module0302.$ic55$)) {
                                module0136.f8871((SubLObject)module0302.ONE_INTEGER, (SubLObject)module0302.$ic56$, (SubLObject)module0302.$ic53$, var14, (SubLObject)module0302.$ic54$, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED);
                            }
                            else if (var16.eql((SubLObject)module0302.$ic57$)) {
                                Errors.warn((SubLObject)module0302.$ic53$, var14, (SubLObject)module0302.$ic54$);
                            }
                            else {
                                Errors.warn((SubLObject)module0302.$ic58$, module0136.$g1591$.getDynamicValue(var7));
                                Errors.cerror((SubLObject)module0302.$ic56$, (SubLObject)module0302.$ic53$, var14, (SubLObject)module0302.$ic54$);
                            }
                        }
                        final SubLObject var13_279 = module0141.$g1670$.currentBinding(var7);
                        final SubLObject var14_280 = module0141.$g1671$.currentBinding(var7);
                        final SubLObject var17 = module0141.$g1672$.currentBinding(var7);
                        final SubLObject var18 = module0141.$g1674$.currentBinding(var7);
                        final SubLObject var19 = module0137.$g1605$.currentBinding(var7);
                        try {
                            module0141.$g1670$.bind(var9, var7);
                            module0141.$g1671$.bind(module0244.f15739(var9), var7);
                            module0141.$g1672$.bind(module0244.f15746(var9), var7);
                            module0141.$g1674$.bind((SubLObject)module0302.NIL, var7);
                            module0137.$g1605$.bind(var9, var7);
                            if (module0302.NIL != module0136.f8865() || module0302.NIL != module0244.f15795(var6, module0137.f8955((SubLObject)module0302.UNPROVIDED))) {
                                final SubLObject var13_280 = module0141.$g1677$.currentBinding(var7);
                                final SubLObject var14_281 = module0138.$g1619$.currentBinding(var7);
                                final SubLObject var19_283 = module0141.$g1674$.currentBinding(var7);
                                try {
                                    module0141.$g1677$.bind(module0141.f9208(), var7);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), var9), var7);
                                    module0141.$g1674$.bind((SubLObject)module0302.NIL, var7);
                                    module0249.f16055(var6, (SubLObject)module0302.UNPROVIDED);
                                    for (var12 = (SubLObject)ConsesLow.list(var6, module0141.f9195()); module0302.NIL != var12 && module0302.NIL == var8; var12 = module0056.f4150(var11)) {
                                        final SubLObject var147_284 = var12.first();
                                        final SubLObject var20 = conses_high.second(var12);
                                        final SubLObject var21 = var147_284;
                                        final SubLObject var13_281 = module0141.$g1674$.currentBinding(var7);
                                        try {
                                            module0141.$g1674$.bind(var20, var7);
                                            final SubLObject var22 = var20;
                                            if (module0302.NIL != f20085(var21)) {
                                                var8 = (SubLObject)module0302.T;
                                            }
                                            final SubLObject var23 = module0200.f12443(var9);
                                            SubLObject var24;
                                            SubLObject var25;
                                            SubLObject var13_282;
                                            SubLObject var14_282;
                                            SubLObject var26;
                                            SubLObject var27;
                                            SubLObject var28;
                                            SubLObject var29;
                                            SubLObject var30;
                                            SubLObject var31;
                                            SubLObject var13_283;
                                            SubLObject var174_289;
                                            SubLObject var32;
                                            SubLObject var33;
                                            SubLObject var13_284;
                                            SubLObject var34;
                                            SubLObject var35;
                                            SubLObject var36;
                                            SubLObject var37;
                                            SubLObject var38;
                                            SubLObject var39;
                                            SubLObject var40;
                                            SubLObject var41;
                                            SubLObject var167_291;
                                            SubLObject var42;
                                            SubLObject var13_285;
                                            SubLObject var44;
                                            SubLObject var43;
                                            SubLObject var45;
                                            SubLObject var46;
                                            SubLObject var47;
                                            SubLObject var48;
                                            SubLObject var49;
                                            SubLObject var50;
                                            for (var24 = (SubLObject)module0302.NIL, var24 = var23; module0302.NIL == var8 && module0302.NIL != var24; var24 = var24.rest()) {
                                                var25 = var24.first();
                                                var13_282 = module0137.$g1605$.currentBinding(var7);
                                                var14_282 = module0141.$g1674$.currentBinding(var7);
                                                try {
                                                    module0137.$g1605$.bind(var25, var7);
                                                    module0141.$g1674$.bind((SubLObject)((module0302.NIL != module0141.f9205((SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0302.NIL == module0141.$g1674$.getDynamicValue(var7)) : module0141.$g1674$.getDynamicValue(var7)), var7);
                                                    var26 = module0228.f15229(var147_284);
                                                    if (module0302.NIL != module0138.f8992(var26)) {
                                                        var27 = module0242.f15664(var26, module0137.f8955((SubLObject)module0302.UNPROVIDED));
                                                        if (module0302.NIL != var27) {
                                                            var28 = module0245.f15834(var27, module0138.f8979(), module0137.f8955((SubLObject)module0302.UNPROVIDED));
                                                            if (module0302.NIL != var28) {
                                                                for (var29 = module0066.f4838(module0067.f4891(var28)); module0302.NIL == var8 && module0302.NIL == module0066.f4841(var29); var29 = module0066.f4840(var29)) {
                                                                    var7.resetMultipleValues();
                                                                    var30 = module0066.f4839(var29);
                                                                    var31 = var7.secondMultipleValue();
                                                                    var7.resetMultipleValues();
                                                                    if (module0302.NIL != module0147.f9507(var30)) {
                                                                        var13_283 = module0138.$g1623$.currentBinding(var7);
                                                                        try {
                                                                            module0138.$g1623$.bind(var30, var7);
                                                                            for (var174_289 = module0066.f4838(module0067.f4891(var31)); module0302.NIL == var8 && module0302.NIL == module0066.f4841(var174_289); var174_289 = module0066.f4840(var174_289)) {
                                                                                var7.resetMultipleValues();
                                                                                var32 = module0066.f4839(var174_289);
                                                                                var33 = var7.secondMultipleValue();
                                                                                var7.resetMultipleValues();
                                                                                if (module0302.NIL != module0141.f9289(var32)) {
                                                                                    var13_284 = module0138.$g1624$.currentBinding(var7);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var32, var7);
                                                                                        var34 = var33;
                                                                                        if (module0302.NIL != module0077.f5302(var34)) {
                                                                                            var35 = module0077.f5333(var34);
                                                                                            for (var36 = module0032.f1741(var35), var37 = (SubLObject)module0302.NIL, var37 = module0032.f1742(var36, var35); module0302.NIL == var8 && module0302.NIL == module0032.f1744(var36, var37); var37 = module0032.f1743(var37)) {
                                                                                                var38 = module0032.f1745(var36, var37);
                                                                                                if (module0302.NIL != module0032.f1746(var37, var38) && module0302.NIL == module0249.f16059(var38, (SubLObject)module0302.UNPROVIDED)) {
                                                                                                    module0249.f16055(var38, (SubLObject)module0302.UNPROVIDED);
                                                                                                    module0056.f4149((SubLObject)ConsesLow.list(var38, module0141.f9195()), var11);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var34.isList()) {
                                                                                            if (module0302.NIL == var8) {
                                                                                                var39 = var34;
                                                                                                var40 = (SubLObject)module0302.NIL;
                                                                                                var40 = var39.first();
                                                                                                while (module0302.NIL == var8 && module0302.NIL != var39) {
                                                                                                    if (module0302.NIL == module0249.f16059(var40, (SubLObject)module0302.UNPROVIDED)) {
                                                                                                        module0249.f16055(var40, (SubLObject)module0302.UNPROVIDED);
                                                                                                        module0056.f4149((SubLObject)ConsesLow.list(var40, module0141.f9195()), var11);
                                                                                                    }
                                                                                                    var39 = var39.rest();
                                                                                                    var40 = var39.first();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)module0302.$ic59$, var34);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var13_284, var7);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var174_289);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var13_283, var7);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var29);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)module0302.FIVE_INTEGER, (SubLObject)module0302.$ic60$, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (module0302.NIL != module0155.f9785(var26, (SubLObject)module0302.UNPROVIDED)) {
                                                        var41 = ((module0302.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var7), module0137.f8955((SubLObject)module0302.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var7), module0137.f8955((SubLObject)module0302.UNPROVIDED)));
                                                        for (var167_291 = (SubLObject)module0302.NIL, var167_291 = var41; module0302.NIL == var8 && module0302.NIL != var167_291; var167_291 = var167_291.rest()) {
                                                            var42 = var167_291.first();
                                                            var13_285 = module0138.$g1625$.currentBinding(var7);
                                                            try {
                                                                module0138.$g1625$.bind(var42, var7);
                                                                var43 = (var44 = Functions.funcall(var42, var26));
                                                                if (module0302.NIL != module0077.f5302(var44)) {
                                                                    var45 = module0077.f5333(var44);
                                                                    for (var46 = module0032.f1741(var45), var47 = (SubLObject)module0302.NIL, var47 = module0032.f1742(var46, var45); module0302.NIL == var8 && module0302.NIL == module0032.f1744(var46, var47); var47 = module0032.f1743(var47)) {
                                                                        var48 = module0032.f1745(var46, var47);
                                                                        if (module0302.NIL != module0032.f1746(var47, var48) && module0302.NIL == module0249.f16059(var48, (SubLObject)module0302.UNPROVIDED)) {
                                                                            module0249.f16055(var48, (SubLObject)module0302.UNPROVIDED);
                                                                            module0056.f4149((SubLObject)ConsesLow.list(var48, module0141.f9195()), var11);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var44.isList()) {
                                                                    if (module0302.NIL == var8) {
                                                                        var49 = var44;
                                                                        var50 = (SubLObject)module0302.NIL;
                                                                        var50 = var49.first();
                                                                        while (module0302.NIL == var8 && module0302.NIL != var49) {
                                                                            if (module0302.NIL == module0249.f16059(var50, (SubLObject)module0302.UNPROVIDED)) {
                                                                                module0249.f16055(var50, (SubLObject)module0302.UNPROVIDED);
                                                                                module0056.f4149((SubLObject)ConsesLow.list(var50, module0141.f9195()), var11);
                                                                            }
                                                                            var49 = var49.rest();
                                                                            var50 = var49.first();
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)module0302.$ic59$, var44);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var13_285, var7);
                                                            }
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var14_282, var7);
                                                    module0137.$g1605$.rebind(var13_282, var7);
                                                }
                                            }
                                        }
                                        finally {
                                            module0141.$g1674$.rebind(var13_281, var7);
                                        }
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var19_283, var7);
                                    module0138.$g1619$.rebind(var14_281, var7);
                                    module0141.$g1677$.rebind(var13_280, var7);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)module0302.TWO_INTEGER, (SubLObject)module0302.$ic61$, var6, module0244.f15748(module0137.f8955((SubLObject)module0302.UNPROVIDED)), (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var19, var7);
                            module0141.$g1674$.rebind(var18, var7);
                            module0141.$g1672$.rebind(var17, var7);
                            module0141.$g1671$.rebind(var14_280, var7);
                            module0141.$g1670$.rebind(var13_279, var7);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var15, var7);
                        module0141.$g1714$.rebind(var13_278, var7);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var7));
                }
                finally {
                    module0139.$g1635$.rebind(var13, var7);
                }
            }
        }
        else {
            var8 = f20085(var6);
        }
        return var8;
    }
    
    public static SubLObject f20087(final SubLObject var6, final SubLObject var121, final SubLObject var122, final SubLObject var123, final SubLObject var124) {
        final SubLThread var125 = SubLProcess.currentSubLThread();
        if (module0302.NIL == module0144.$g1780$.getDynamicValue(var125)) {
            return (SubLObject)module0302.NIL;
        }
        if (module0302.NIL == f20086(var6)) {
            return (SubLObject)module0302.NIL;
        }
        SubLObject var126 = (SubLObject)module0302.NIL;
        SubLObject var127 = (SubLObject)module0302.NIL;
        final SubLObject var128 = module0302.$g2702$.currentBinding(var125);
        final SubLObject var129 = module0302.$g2703$.currentBinding(var125);
        try {
            module0302.$g2702$.bind((SubLObject)module0302.NIL, var125);
            module0302.$g2703$.bind(module0067.f4880((SubLObject)module0302.EQUAL, (SubLObject)module0302.UNPROVIDED), var125);
            if (var6.eql(module0302.$ic5$)) {
                final SubLObject var13_293 = module0206.$g2330$.currentBinding(var125);
                try {
                    module0206.$g2330$.bind((SubLObject)module0302.T, var125);
                    final SubLObject var130 = module0139.$g1630$.getDynamicValue(var125);
                    final SubLObject var13_294 = module0139.$g1631$.currentBinding(var125);
                    final SubLObject var14_295 = module0139.$g1632$.currentBinding(var125);
                    final SubLObject var131 = module0139.$g1630$.currentBinding(var125);
                    try {
                        module0139.$g1631$.bind(module0139.f9015(var130, (SubLObject)module0302.TEN_INTEGER), var125);
                        module0139.$g1632$.bind(module0139.f9016(var130), var125);
                        module0139.$g1630$.bind((SubLObject)module0302.T, var125);
                        f20088(var6, var121, var122, var124, (SubLObject)module0302.$ic90$, (SubLObject)module0302.T);
                        if (module0302.NIL != module0302.$g2702$.getDynamicValue(var125) && module0302.NIL == var127) {
                            SubLObject var132 = module0302.$g2702$.getDynamicValue(var125);
                            SubLObject var133 = (SubLObject)module0302.NIL;
                            var133 = var132.first();
                            while (module0302.NIL == var127 && module0302.NIL != var132) {
                                SubLObject var135;
                                final SubLObject var134 = var135 = var133;
                                SubLObject var136 = (SubLObject)module0302.NIL;
                                SubLObject var137 = (SubLObject)module0302.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var135, var134, (SubLObject)module0302.$ic91$);
                                var136 = var135.first();
                                var135 = var135.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(var135, var134, (SubLObject)module0302.$ic91$);
                                var137 = var135.first();
                                var135 = var135.rest();
                                if (module0302.NIL == var135) {
                                    if (var136.eql(var124) && var137.eql(var122) && module0302.NIL != module0331.f22370(var123, var121, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED)) {
                                        if (module0302.NIL != module0144.$g1796$.getDynamicValue(var125)) {
                                            f20036(f20089(var6, var121, var122, var123, var124));
                                        }
                                        var126 = (SubLObject)module0302.T;
                                        var127 = module0303.f20199(var126);
                                    }
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(var134, (SubLObject)module0302.$ic91$);
                                }
                                var132 = var132.rest();
                                var133 = var132.first();
                            }
                        }
                    }
                    finally {
                        module0139.$g1630$.rebind(var131, var125);
                        module0139.$g1632$.rebind(var14_295, var125);
                        module0139.$g1631$.rebind(var13_294, var125);
                    }
                }
                finally {
                    module0206.$g2330$.rebind(var13_293, var125);
                }
            }
            else {
                final SubLObject var138 = module0139.$g1630$.getDynamicValue(var125);
                final SubLObject var13_295 = module0139.$g1631$.currentBinding(var125);
                final SubLObject var14_296 = module0139.$g1632$.currentBinding(var125);
                final SubLObject var139 = module0139.$g1630$.currentBinding(var125);
                try {
                    module0139.$g1631$.bind(module0139.f9015(var138, (SubLObject)module0302.TEN_INTEGER), var125);
                    module0139.$g1632$.bind(module0139.f9016(var138), var125);
                    module0139.$g1630$.bind((SubLObject)module0302.T, var125);
                    f20088(var6, var121, var122, var124, (SubLObject)module0302.$ic90$, (SubLObject)module0302.T);
                    if (module0302.NIL != module0302.$g2702$.getDynamicValue(var125) && module0302.NIL == var127) {
                        SubLObject var140 = module0302.$g2702$.getDynamicValue(var125);
                        SubLObject var141 = (SubLObject)module0302.NIL;
                        var141 = var140.first();
                        while (module0302.NIL == var127 && module0302.NIL != var140) {
                            SubLObject var143;
                            final SubLObject var142 = var143 = var141;
                            SubLObject var144 = (SubLObject)module0302.NIL;
                            SubLObject var145 = (SubLObject)module0302.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var143, var142, (SubLObject)module0302.$ic91$);
                            var144 = var143.first();
                            var143 = var143.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var143, var142, (SubLObject)module0302.$ic91$);
                            var145 = var143.first();
                            var143 = var143.rest();
                            if (module0302.NIL == var143) {
                                if (var144.eql(var124) && var145.eql(var122) && module0302.NIL != module0331.f22370(var123, var121, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED)) {
                                    if (module0302.NIL != module0144.$g1796$.getDynamicValue(var125)) {
                                        f20036(f20089(var6, var121, var122, var123, var124));
                                    }
                                    var126 = (SubLObject)module0302.T;
                                    var127 = module0303.f20199(var126);
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var142, (SubLObject)module0302.$ic91$);
                            }
                            var140 = var140.rest();
                            var141 = var140.first();
                        }
                    }
                }
                finally {
                    module0139.$g1630$.rebind(var139, var125);
                    module0139.$g1632$.rebind(var14_296, var125);
                    module0139.$g1631$.rebind(var13_295, var125);
                }
            }
        }
        finally {
            module0302.$g2703$.rebind(var129, var125);
            module0302.$g2702$.rebind(var128, var125);
        }
        return var126;
    }
    
    public static SubLObject f20089(final SubLObject var6, final SubLObject var121, final SubLObject var122, final SubLObject var123, final SubLObject var124) {
        final SubLThread var125 = SubLProcess.currentSubLThread();
        final SubLObject var126 = module0067.f4884(module0302.$g2703$.getDynamicValue(var125), (SubLObject)ConsesLow.list(var124, var122), (SubLObject)module0302.UNPROVIDED);
        final SubLObject var127 = (SubLObject)module0302.$ic92$;
        final SubLObject var128 = module0147.$g2095$.getDynamicValue(var125);
        SubLObject var129 = (SubLObject)module0302.NIL;
        SubLObject var130 = var126;
        SubLObject var131 = (SubLObject)module0302.NIL;
        var131 = var130.first();
        while (module0302.NIL != var130) {
            SubLObject var133;
            final SubLObject var132 = var133 = var131;
            SubLObject var134 = (SubLObject)module0302.NIL;
            SubLObject var135 = (SubLObject)module0302.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var133, var132, (SubLObject)module0302.$ic43$);
            var134 = var133.first();
            var133 = var133.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var133, var132, (SubLObject)module0302.$ic43$);
            var135 = var133.first();
            var133 = var133.rest();
            if (module0302.NIL == var133) {
                if (var6.eql(var134)) {
                    var129 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var127, var6, var123, var122, var121, var124, var128), var129);
                }
                else {
                    var129 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var127, var6, var123, var122, var121, var124, var128, (SubLObject)ConsesLow.list(var135, var134)), var129);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var132, (SubLObject)module0302.$ic43$);
            }
            var130 = var130.rest();
            var131 = var130.first();
        }
        return var129;
    }
    
    public static SubLObject f20090() {
        final SubLObject var307 = module0302.$g2704$.getGlobalValue();
        if (module0302.NIL != var307) {
            module0034.f1818(var307);
        }
        return (SubLObject)module0302.NIL;
    }
    
    public static SubLObject f20091(final SubLObject var7, final SubLObject var308, final SubLObject var309, final SubLObject var310) {
        return module0034.f1829(module0302.$g2704$.getGlobalValue(), (SubLObject)ConsesLow.list(var7, var308, var309, var310), (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED);
    }
    
    public static SubLObject f20092(final SubLObject var7, final SubLObject var308, final SubLObject var309, final SubLObject var310) {
        if (var308.eql((SubLObject)module0302.$ic20$)) {
            if (var309.eql((SubLObject)module0302.$ic94$)) {
                return module0259.f16821(var7, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED);
            }
            if (var309.eql((SubLObject)module0302.$ic95$)) {
                return f20093(var7);
            }
            if (var309.eql((SubLObject)module0302.$ic21$)) {
                return f20094(var7);
            }
        }
        else if (var308.eql((SubLObject)module0302.$ic27$)) {
            if (var309.eql((SubLObject)module0302.$ic94$)) {
                return module0259.f16972(var7, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED);
            }
            if (var309.eql((SubLObject)module0302.$ic95$)) {
                return f20095(var7);
            }
            if (var309.eql((SubLObject)module0302.$ic21$)) {
                return f20096(var7);
            }
        }
        else if (var308.eql((SubLObject)module0302.$ic34$)) {
            if (var309.eql((SubLObject)module0302.$ic94$)) {
                return module0256.f16524(var7, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED);
            }
            if (var309.eql((SubLObject)module0302.$ic95$)) {
                return f20097(var7);
            }
            if (var309.eql((SubLObject)module0302.$ic21$)) {
                return f20098(var7);
            }
        }
        return (SubLObject)module0302.NIL;
    }
    
    public static SubLObject f20048(final SubLObject var7, final SubLObject var308, final SubLObject var309, final SubLObject var310) {
        SubLObject var311 = module0302.$g2704$.getGlobalValue();
        if (module0302.NIL == var311) {
            var311 = module0034.f1934((SubLObject)module0302.$ic93$, (SubLObject)module0302.$ic96$, (SubLObject)module0302.$ic97$, (SubLObject)module0302.EQUAL, (SubLObject)module0302.FOUR_INTEGER, (SubLObject)module0302.ZERO_INTEGER);
            module0034.f1940((SubLObject)module0302.$ic98$);
        }
        final SubLObject var312 = module0034.f1780(var7, var308, var309, var310);
        final SubLObject var313 = module0034.f1814(var311, var312, (SubLObject)module0302.UNPROVIDED);
        if (var313 != module0302.$ic99$) {
            SubLObject var314 = var313;
            SubLObject var315 = (SubLObject)module0302.NIL;
            var315 = var314.first();
            while (module0302.NIL != var314) {
                SubLObject var316 = var315.first();
                final SubLObject var317 = conses_high.second(var315);
                if (var7.equal(var316.first())) {
                    var316 = var316.rest();
                    if (var308.equal(var316.first())) {
                        var316 = var316.rest();
                        if (var309.equal(var316.first())) {
                            var316 = var316.rest();
                            if (module0302.NIL != var316 && module0302.NIL == var316.rest() && var310.equal(var316.first())) {
                                return module0034.f1959(var317);
                            }
                        }
                    }
                }
                var314 = var314.rest();
                var315 = var314.first();
            }
        }
        final SubLObject var318 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f20092(var7, var308, var309, var310)));
        module0034.f1836(var311, var312, var313, var318, (SubLObject)ConsesLow.list(var7, var308, var309, var310));
        return module0034.f1959(var318);
    }
    
    public static SubLObject f20093(final SubLObject var321) {
        if (module0302.NIL != module0173.f10955(var321)) {
            return module0259.f16821(var321, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED);
        }
        if (module0302.NIL != module0155.f9779(var321, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED)) {
            return module0259.f16821(module0172.f10921(var321), (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED);
        }
        return (SubLObject)module0302.NIL;
    }
    
    public static SubLObject f20094(final SubLObject var321) {
        final SubLObject var322 = module0205.f13276(var321);
        if (module0302.NIL != module0173.f10955(var322)) {
            return f20099(var321, var322);
        }
        if (module0302.NIL != module0155.f9778(var322)) {
            return f20099(var321, module0172.f10921(var322));
        }
        if (module0302.NIL != module0155.f9779(var322, Symbols.symbol_function((SubLObject)module0302.$ic100$), (SubLObject)module0302.UNPROVIDED)) {
            final SubLObject var323 = module0205.f13276(var322);
            return Sequences.remove_duplicates(ConsesLow.nconc(module0226.f15004(var323, (SubLObject)module0302.UNPROVIDED), module0226.f15007(var323, (SubLObject)module0302.UNPROVIDED)), (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED);
        }
        return (SubLObject)module0302.NIL;
    }
    
    public static SubLObject f20099(final SubLObject var321, final SubLObject var322) {
        SubLObject var323 = (SubLObject)module0302.NIL;
        var323 = module0226.f14990(var322, (SubLObject)module0302.UNPROVIDED);
        var323 = ConsesLow.nconc(var323, module0226.f15006(var321, (SubLObject)module0302.UNPROVIDED));
        var323 = ConsesLow.nconc(var323, module0226.f15005(var321, (SubLObject)module0302.UNPROVIDED));
        var323 = ConsesLow.nconc(var323, module0226.f15008(var321, (SubLObject)module0302.UNPROVIDED));
        return Sequences.remove_duplicates(var323, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED);
    }
    
    public static SubLObject f20095(final SubLObject var321) {
        if (module0302.NIL != module0173.f10955(var321)) {
            return module0259.f16972(var321, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED);
        }
        if (module0302.NIL != module0155.f9779(var321, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED)) {
            return module0259.f16972(module0172.f10921(var321), (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED);
        }
        return (SubLObject)module0302.NIL;
    }
    
    public static SubLObject f20096(final SubLObject var321) {
        final SubLObject var322 = module0205.f13276(var321);
        if (module0302.NIL != module0173.f10955(var322)) {
            return ConsesLow.nconc(module0226.f14993(var322, (SubLObject)module0302.UNPROVIDED), module0226.f14996(var322, (SubLObject)module0302.UNPROVIDED));
        }
        if (module0302.NIL != module0155.f9779(var322, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED)) {
            final SubLObject var323 = module0172.f10921(var322);
            return ConsesLow.nconc(module0226.f14993(var323, (SubLObject)module0302.UNPROVIDED), module0226.f14996(var323, (SubLObject)module0302.UNPROVIDED));
        }
        if (module0302.NIL != module0155.f9779(var322, Symbols.symbol_function((SubLObject)module0302.$ic100$), (SubLObject)module0302.UNPROVIDED)) {
            final SubLObject var324 = module0205.f13276(var322);
            return ConsesLow.nconc(module0226.f15012(var324, (SubLObject)module0302.UNPROVIDED), module0226.f15013(var324, (SubLObject)module0302.UNPROVIDED));
        }
        return (SubLObject)module0302.NIL;
    }
    
    public static SubLObject f20097(final SubLObject var321) {
        if (module0302.NIL != module0173.f10955(var321)) {
            return module0256.f16524(var321, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED);
        }
        if (module0302.NIL != module0155.f9779(var321, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED)) {
            return module0256.f16524(module0172.f10921(var321), (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED);
        }
        return (SubLObject)module0302.NIL;
    }
    
    public static SubLObject f20098(final SubLObject var321) {
        final SubLObject var322 = module0205.f13276(var321);
        if (module0302.NIL != module0173.f10955(var322)) {
            return f20100(var321, var322);
        }
        if (module0302.NIL != module0155.f9778(var322)) {
            return f20100(var321, module0172.f10921(var322));
        }
        if (module0302.NIL != module0155.f9779(var322, Symbols.symbol_function((SubLObject)module0302.$ic100$), (SubLObject)module0302.UNPROVIDED)) {
            final SubLObject var323 = module0205.f13276(var322);
            return Sequences.remove_duplicates(ConsesLow.nconc(module0226.f15015(var323, (SubLObject)module0302.UNPROVIDED), module0226.f15017(var323, (SubLObject)module0302.UNPROVIDED)), (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED);
        }
        return (SubLObject)module0302.NIL;
    }
    
    public static SubLObject f20100(final SubLObject var321, final SubLObject var322) {
        SubLObject var323 = (SubLObject)module0302.NIL;
        var323 = module0226.f15014(var322, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED);
        var323 = ConsesLow.nconc(var323, module0226.f15016(var321, (SubLObject)module0302.UNPROVIDED));
        var323 = ConsesLow.nconc(var323, module0226.f15018(var321, (SubLObject)module0302.UNPROVIDED));
        return Sequences.remove_duplicates(var323, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED);
    }
    
    public static SubLObject f20035(final SubLObject var6, final SubLObject var8, final SubLObject var308) {
        final SubLThread var309 = SubLProcess.currentSubLThread();
        final SubLObject var310 = module0152.f9722();
        final SubLObject var311 = module0147.$g2095$.currentBinding(var309);
        final SubLObject var312 = module0147.$g2094$.currentBinding(var309);
        final SubLObject var313 = module0147.$g2096$.currentBinding(var309);
        try {
            module0147.$g2095$.bind(module0147.f9545(var310), var309);
            module0147.$g2094$.bind(module0147.f9546(var310), var309);
            module0147.$g2096$.bind(module0147.f9549(var310), var309);
            final SubLObject var314 = f20101(var308, var8, var6);
            f20102(var314, var6, var8, var308, (SubLObject)module0302.$ic11$);
            if (module0302.NIL != module0173.f10955(var6)) {
                final SubLObject var315 = (SubLObject)SubLObjectFactory.makeBoolean(module0302.NIL != module0260.f17006(var6, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED) || module0302.NIL != module0260.f17008(var6, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED));
                if (module0302.NIL != module0144.$g1781$.getDynamicValue(var309) && module0302.NIL != var315) {
                    SubLObject var316 = module0260.f17032(var6, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED);
                    SubLObject var317 = (SubLObject)module0302.NIL;
                    var317 = var316.first();
                    while (module0302.NIL != var316) {
                        if (!var317.eql(var6)) {
                            f20102(var314, var317, var8, var308, (SubLObject)module0302.$ic101$);
                        }
                        var316 = var316.rest();
                        var317 = var316.first();
                    }
                }
                if (module0302.NIL != module0144.$g1782$.getDynamicValue(var309) && module0302.NIL != var315 && (var8.numE((SubLObject)module0302.ONE_INTEGER) || var8.numE((SubLObject)module0302.TWO_INTEGER))) {
                    final SubLObject var318 = f20103(var308, var8, var6);
                    final SubLObject var319 = module0226.f14913(var8);
                    SubLObject var320 = module0260.f17030(var6, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED);
                    SubLObject var321 = (SubLObject)module0302.NIL;
                    var321 = var320.first();
                    while (module0302.NIL != var320) {
                        if (!var321.eql(var6)) {
                            f20102(var318, var321, var319, var308, (SubLObject)module0302.$ic102$);
                        }
                        var320 = var320.rest();
                        var321 = var320.first();
                    }
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var313, var309);
            module0147.$g2094$.rebind(var312, var309);
            module0147.$g2095$.rebind(var311, var309);
        }
        return module0302.$g2702$.getDynamicValue(var309);
    }
    
    public static SubLObject f20102(final SubLObject var327, final SubLObject var6, final SubLObject var8, final SubLObject var308, final SubLObject var42) {
        final SubLThread var328 = SubLProcess.currentSubLThread();
        if (module0302.NIL == module0173.f10955(var327)) {
            return (SubLObject)module0302.NIL;
        }
        if (module0302.NIL == module0144.$g1796$.getDynamicValue(var328) && module0302.NIL != module0308.f20914(var327, var8)) {
            SubLObject var329 = module0308.f20908(var6, var8);
            SubLObject var330 = (SubLObject)module0302.NIL;
            var330 = var329.first();
            while (module0302.NIL != var329) {
                final SubLObject var331 = var330;
                if (module0302.NIL == conses_high.member(var331, module0302.$g2702$.getDynamicValue(var328), Symbols.symbol_function((SubLObject)module0302.EQL), Symbols.symbol_function((SubLObject)module0302.IDENTITY))) {
                    module0302.$g2702$.setDynamicValue((SubLObject)ConsesLow.cons(var331, module0302.$g2702$.getDynamicValue(var328)), var328);
                }
                var329 = var329.rest();
                var330 = var329.first();
            }
        }
        else {
            final SubLObject var332 = module0303.f20192(var327);
            if (var332.isInteger()) {
                f20104(var327, var332, var6, var42);
                f20105(var327, var8, var6, var42);
            }
        }
        f20106(var308, var327, var8, var6, var42);
        return module0302.$g2702$.getDynamicValue(var328);
    }
    
    public static SubLObject f20104(final SubLObject var327, final SubLObject var334, final SubLObject var6, final SubLObject var42) {
        final SubLThread var335 = SubLProcess.currentSubLThread();
        if (module0302.NIL != module0158.f10010(var6, (SubLObject)module0302.ONE_INTEGER, var327)) {
            final SubLObject var336 = module0158.f10011(var6, (SubLObject)module0302.ONE_INTEGER, var327);
            SubLObject var337 = (SubLObject)module0302.NIL;
            final SubLObject var338 = (SubLObject)module0302.NIL;
            while (module0302.NIL == var337) {
                final SubLObject var339 = module0052.f3695(var336, var338);
                final SubLObject var340 = (SubLObject)SubLObjectFactory.makeBoolean(!var338.eql(var339));
                if (module0302.NIL != var340) {
                    SubLObject var341 = (SubLObject)module0302.NIL;
                    try {
                        var341 = module0158.f10316(var339, (SubLObject)module0302.$ic103$, (SubLObject)module0302.$ic104$, (SubLObject)module0302.NIL);
                        SubLObject var337_342 = (SubLObject)module0302.NIL;
                        final SubLObject var338_343 = (SubLObject)module0302.NIL;
                        while (module0302.NIL == var337_342) {
                            final SubLObject var342 = module0052.f3695(var341, var338_343);
                            final SubLObject var340_345 = (SubLObject)SubLObjectFactory.makeBoolean(!var338_343.eql(var342));
                            if (module0302.NIL != var340_345 && module0302.NIL == f20107(var342)) {
                                final SubLObject var344;
                                final SubLObject var343 = var344 = module0178.f11331(var342, var334);
                                if (module0302.NIL == conses_high.member(var344, module0302.$g2702$.getDynamicValue(var335), Symbols.symbol_function((SubLObject)module0302.EQL), Symbols.symbol_function((SubLObject)module0302.IDENTITY))) {
                                    module0302.$g2702$.setDynamicValue((SubLObject)ConsesLow.cons(var344, module0302.$g2702$.getDynamicValue(var335)), var335);
                                }
                                if (module0302.NIL != module0144.$g1796$.getDynamicValue(var335)) {
                                    module0084.f5762(module0302.$g2703$.getDynamicValue(var335), var343, (SubLObject)ConsesLow.list(var6, var42, var342));
                                }
                            }
                            var337_342 = (SubLObject)SubLObjectFactory.makeBoolean(module0302.NIL == var340_345);
                        }
                    }
                    finally {
                        final SubLObject var345 = Threads.$is_thread_performing_cleanupP$.currentBinding(var335);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0302.T, var335);
                            if (module0302.NIL != var341) {
                                module0158.f10319(var341);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var345, var335);
                        }
                    }
                }
                var337 = (SubLObject)SubLObjectFactory.makeBoolean(module0302.NIL == var340);
            }
        }
        return (SubLObject)module0302.NIL;
    }
    
    public static SubLObject f20105(final SubLObject var327, final SubLObject var8, final SubLObject var6, final SubLObject var42) {
        final SubLThread var328 = SubLProcess.currentSubLThread();
        if (var327.eql(module0226.f15038(var8)) && module0302.NIL == module0004.f104(module0302.$ic105$, module0302.$g2702$.getDynamicValue(var328), Symbols.symbol_function((SubLObject)module0302.$ic106$), (SubLObject)module0302.UNPROVIDED) && module0302.NIL != module0226.f15039(var6, var8, (SubLObject)module0302.UNPROVIDED)) {
            final SubLObject var330;
            final SubLObject var329 = var330 = module0302.$ic105$;
            if (module0302.NIL == conses_high.member(var330, module0302.$g2702$.getDynamicValue(var328), Symbols.symbol_function((SubLObject)module0302.EQL), Symbols.symbol_function((SubLObject)module0302.IDENTITY))) {
                module0302.$g2702$.setDynamicValue((SubLObject)ConsesLow.cons(var330, module0302.$g2702$.getDynamicValue(var328)), var328);
            }
            if (module0302.NIL != module0144.$g1796$.getDynamicValue(var328)) {
                final SubLObject var331 = module0288.f19340((SubLObject)ConsesLow.list(module0302.$ic107$, var6, var8), (SubLObject)module0302.UNPROVIDED);
                if (module0302.NIL != var331 && module0302.NIL == f20107(var331)) {
                    module0084.f5762(module0302.$g2703$.getDynamicValue(var328), var329, (SubLObject)ConsesLow.list(var6, var42, var331));
                }
            }
        }
        return (SubLObject)module0302.NIL;
    }
    
    public static SubLObject f20106(final SubLObject var308, final SubLObject var327, final SubLObject var8, final SubLObject var6, final SubLObject var42) {
        final SubLThread var328 = SubLProcess.currentSubLThread();
        if (module0302.NIL != module0144.f9457()) {
            SubLObject var329 = f20108(var308, var8, var6);
            SubLObject var330 = (SubLObject)module0302.NIL;
            var330 = var329.first();
            while (module0302.NIL != var329) {
                if (!var330.eql(var327) && (!module0302.$ic108$.eql(var330) || module0302.NIL != module0308.f20902(var6)) && (!module0302.$ic109$.eql(var330) || module0302.NIL != module0308.f20903(var6))) {
                    final SubLObject var331 = module0303.f20192(var330);
                    final SubLObject var332 = var330;
                    if (module0302.NIL != module0158.f10010(var6, (SubLObject)module0302.ONE_INTEGER, var332)) {
                        final SubLObject var333 = module0158.f10011(var6, (SubLObject)module0302.ONE_INTEGER, var332);
                        SubLObject var334 = (SubLObject)module0302.NIL;
                        final SubLObject var335 = (SubLObject)module0302.NIL;
                        while (module0302.NIL == var334) {
                            final SubLObject var336 = module0052.f3695(var333, var335);
                            final SubLObject var337 = (SubLObject)SubLObjectFactory.makeBoolean(!var335.eql(var336));
                            if (module0302.NIL != var337) {
                                SubLObject var338 = (SubLObject)module0302.NIL;
                                try {
                                    var338 = module0158.f10316(var336, (SubLObject)module0302.$ic103$, (SubLObject)module0302.$ic104$, (SubLObject)module0302.NIL);
                                    SubLObject var337_347 = (SubLObject)module0302.NIL;
                                    final SubLObject var338_348 = (SubLObject)module0302.NIL;
                                    while (module0302.NIL == var337_347) {
                                        final SubLObject var339 = module0052.f3695(var338, var338_348);
                                        final SubLObject var340_349 = (SubLObject)SubLObjectFactory.makeBoolean(!var338_348.eql(var339));
                                        if (module0302.NIL != var340_349 && module0302.NIL == f20107(var339)) {
                                            final SubLObject var341;
                                            final SubLObject var340 = var341 = module0178.f11331(var339, var331);
                                            if (module0302.NIL == conses_high.member(var341, module0302.$g2702$.getDynamicValue(var328), Symbols.symbol_function((SubLObject)module0302.EQL), Symbols.symbol_function((SubLObject)module0302.IDENTITY))) {
                                                module0302.$g2702$.setDynamicValue((SubLObject)ConsesLow.cons(var341, module0302.$g2702$.getDynamicValue(var328)), var328);
                                            }
                                            if (module0302.NIL != module0144.$g1796$.getDynamicValue(var328)) {
                                                module0084.f5762(module0302.$g2703$.getDynamicValue(var328), var340, (SubLObject)ConsesLow.list(var6, var42, var339));
                                            }
                                        }
                                        var337_347 = (SubLObject)SubLObjectFactory.makeBoolean(module0302.NIL == var340_349);
                                    }
                                }
                                finally {
                                    final SubLObject var342 = Threads.$is_thread_performing_cleanupP$.currentBinding(var328);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0302.T, var328);
                                        if (module0302.NIL != var338) {
                                            module0158.f10319(var338);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var342, var328);
                                    }
                                }
                            }
                            var334 = (SubLObject)SubLObjectFactory.makeBoolean(module0302.NIL == var337);
                        }
                    }
                }
                var329 = var329.rest();
                var330 = var329.first();
            }
        }
        return (SubLObject)module0302.NIL;
    }
    
    public static SubLObject f20101(final SubLObject var308, final SubLObject var8, final SubLObject var6) {
        final SubLThread var309 = SubLProcess.currentSubLThread();
        if (var308.eql((SubLObject)module0302.$ic6$)) {
            return module0226.f14903(var8, var6, module0147.$g2095$.getDynamicValue(var309));
        }
        if (var308.eql((SubLObject)module0302.$ic17$)) {
            return module0226.f14906(var8, var6, module0147.$g2095$.getDynamicValue(var309));
        }
        if (var308.eql((SubLObject)module0302.$ic24$)) {
            return module0226.f14909(var8, var6, module0147.$g2095$.getDynamicValue(var309));
        }
        if (var308.eql((SubLObject)module0302.$ic31$)) {
            return module0226.f14947(var8, var6, module0147.$g2095$.getDynamicValue(var309));
        }
        if (var308.eql((SubLObject)module0302.$ic37$)) {
            return module0226.f15038(var8);
        }
        Errors.error((SubLObject)module0302.$ic110$, var308);
        return (SubLObject)module0302.NIL;
    }
    
    public static SubLObject f20108(final SubLObject var308, final SubLObject var8, final SubLObject var6) {
        final SubLThread var309 = SubLProcess.currentSubLThread();
        if (var308.eql((SubLObject)module0302.$ic6$)) {
            return module0226.f14904(var8, var6, module0147.$g2095$.getDynamicValue(var309));
        }
        if (var308.eql((SubLObject)module0302.$ic17$)) {
            return module0226.f14907(var8, var6, module0147.$g2095$.getDynamicValue(var309));
        }
        if (var308.eql((SubLObject)module0302.$ic24$)) {
            return module0226.f14901(var8, var6, module0147.$g2095$.getDynamicValue(var309));
        }
        if (var308.eql((SubLObject)module0302.$ic31$)) {
            return module0226.f14942(var8, var6, module0147.$g2095$.getDynamicValue(var309));
        }
        if (var308.eql((SubLObject)module0302.$ic37$)) {
            return (SubLObject)module0302.NIL;
        }
        Errors.error((SubLObject)module0302.$ic110$, var308);
        return (SubLObject)module0302.NIL;
    }
    
    public static SubLObject f20103(final SubLObject var308, final SubLObject var8, final SubLObject var6) {
        final SubLThread var309 = SubLProcess.currentSubLThread();
        if (var308.eql((SubLObject)module0302.$ic6$)) {
            return module0226.f14910(var8, var6, module0147.$g2095$.getDynamicValue(var309));
        }
        if (var308.eql((SubLObject)module0302.$ic17$)) {
            return module0226.f14911(var8, var6, module0147.$g2095$.getDynamicValue(var309));
        }
        if (var308.eql((SubLObject)module0302.$ic24$)) {
            return module0226.f14912(var8, var6, module0147.$g2095$.getDynamicValue(var309));
        }
        if (var308.eql((SubLObject)module0302.$ic31$)) {
            return module0226.f14948(var8, var6, module0147.$g2095$.getDynamicValue(var309));
        }
        if (var308.eql((SubLObject)module0302.$ic37$)) {
            return module0226.f15037(var8);
        }
        Errors.error((SubLObject)module0302.$ic110$, var308);
        return (SubLObject)module0302.NIL;
    }
    
    public static SubLObject f20109(final SubLObject var121, final SubLObject var308) {
        final SubLThread var309 = SubLProcess.currentSubLThread();
        if (var308.eql((SubLObject)module0302.$ic39$)) {
            module0302.$g2705$.setDynamicValue(module0259.f16840(var121, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED), var309);
        }
        else if (var308.eql((SubLObject)module0302.$ic65$)) {
            module0302.$g2705$.setDynamicValue(module0259.f16840(var121, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED), var309);
        }
        else if (var308.eql((SubLObject)module0302.$ic62$)) {
            module0302.$g2705$.setDynamicValue(module0256.f16531(var121, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED), var309);
        }
        else if (var308.eql((SubLObject)module0302.$ic70$)) {
            module0302.$g2705$.setDynamicValue(module0256.f16531(var121, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED), var309);
        }
        else if (var308.eql((SubLObject)module0302.$ic77$)) {
            module0302.$g2705$.setDynamicValue(module0259.f16840(var121, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED), var309);
        }
        else if (var308.eql((SubLObject)module0302.$ic73$)) {
            module0302.$g2705$.setDynamicValue(module0256.f16531(var121, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED), var309);
        }
        else if (var308.eql((SubLObject)module0302.$ic86$)) {
            module0302.$g2705$.setDynamicValue(module0259.f16840(var121, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED), var309);
        }
        return module0302.$g2705$.getDynamicValue(var309);
    }
    
    public static SubLObject f20110(final SubLObject var121, final SubLObject var350, final SubLObject var351, final SubLObject var308) {
        final SubLThread var352 = SubLProcess.currentSubLThread();
        if (var308 == module0302.$ic90$) {
            return (SubLObject)module0302.T;
        }
        if (var351.eql((SubLObject)module0302.$ic111$)) {
            return module0004.f104(var350, module0302.$g2705$.getDynamicValue(var352), Symbols.symbol_function((SubLObject)module0302.$ic106$), (SubLObject)module0302.UNPROVIDED);
        }
        if (!var351.eql((SubLObject)module0302.$ic112$)) {
            return (SubLObject)module0302.NIL;
        }
        if (var308.eql((SubLObject)module0302.$ic62$)) {
            return module0256.f16576(var121, var350, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED);
        }
        if (var308.eql((SubLObject)module0302.$ic73$)) {
            return module0256.f16576(var121, var350, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED);
        }
        return module0305.f20438(var121, var350, (SubLObject)module0302.UNPROVIDED);
    }
    
    public static SubLObject f20064(final SubLObject var6, final SubLObject var121, final SubLObject var122, final SubLObject var124, final SubLObject var308, final SubLObject var353) {
        final SubLThread var354 = SubLProcess.currentSubLThread();
        final SubLObject var355 = module0152.f9722();
        final SubLObject var356 = module0147.$g2095$.currentBinding(var354);
        final SubLObject var357 = module0147.$g2094$.currentBinding(var354);
        final SubLObject var358 = module0147.$g2096$.currentBinding(var354);
        final SubLObject var359 = module0302.$g2705$.currentBinding(var354);
        try {
            module0147.$g2095$.bind(module0147.f9545(var355), var354);
            module0147.$g2094$.bind(module0147.f9546(var355), var354);
            module0147.$g2096$.bind(module0147.f9549(var355), var354);
            module0302.$g2705$.bind((SubLObject)module0302.NIL, var354);
            if (module0302.NIL != module0173.f10955(var121)) {
                f20109(var121, var308);
                f20088(var6, var121, var122, var124, var308, (SubLObject)module0302.$ic111$);
            }
            else if (module0302.NIL == module0309.f20945(var121)) {
                if (module0302.NIL != var353) {
                    f20088(var6, var121, var122, var124, var308, (SubLObject)module0302.$ic112$);
                }
            }
        }
        finally {
            module0302.$g2705$.rebind(var359, var354);
            module0147.$g2096$.rebind(var358, var354);
            module0147.$g2094$.rebind(var357, var354);
            module0147.$g2095$.rebind(var356, var354);
        }
        return module0302.$g2702$.getDynamicValue(var354);
    }
    
    public static SubLObject f20088(final SubLObject var6, final SubLObject var121, final SubLObject var122, final SubLObject var124, final SubLObject var308, SubLObject var351) {
        if (var351 == module0302.UNPROVIDED) {
            var351 = (SubLObject)module0302.NIL;
        }
        final SubLThread var352 = SubLProcess.currentSubLThread();
        final SubLObject var353 = f20111(var308, var122, var124);
        if (module0302.NIL == module0173.f10955(var353)) {
            return (SubLObject)module0302.NIL;
        }
        f20112(var353, var6, var121, (SubLObject)module0302.$ic11$, var308, var351);
        if (module0302.NIL != module0173.f10955(var6)) {
            final SubLObject var354 = (SubLObject)SubLObjectFactory.makeBoolean(module0302.NIL != module0260.f17006(var6, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED) || module0302.NIL != module0260.f17008(var6, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED));
            if (module0302.NIL != module0144.$g1781$.getDynamicValue(var352) && module0302.NIL != var354) {
                SubLObject var355 = module0260.f17032(var6, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED);
                SubLObject var356 = (SubLObject)module0302.NIL;
                var356 = var355.first();
                while (module0302.NIL != var355) {
                    if (!var356.eql(var6)) {
                        f20112(var353, var356, var121, (SubLObject)module0302.$ic101$, var308, var351);
                    }
                    var355 = var355.rest();
                    var356 = var355.first();
                }
            }
            if (module0302.NIL != module0144.$g1782$.getDynamicValue(var352) && module0302.NIL != var354) {
                final SubLObject var357 = f20113(var308, var122, var124);
                SubLObject var358 = module0260.f17030(var6, (SubLObject)module0302.UNPROVIDED, (SubLObject)module0302.UNPROVIDED);
                SubLObject var359 = (SubLObject)module0302.NIL;
                var359 = var358.first();
                while (module0302.NIL != var358) {
                    if (!var359.eql(var6)) {
                        f20112(var357, var359, var121, (SubLObject)module0302.$ic102$, var308, var351);
                    }
                    var358 = var358.rest();
                    var359 = var358.first();
                }
            }
        }
        return module0302.$g2702$.getDynamicValue(var352);
    }
    
    public static SubLObject f20112(final SubLObject var327, final SubLObject var6, final SubLObject var121, final SubLObject var42, final SubLObject var351, final SubLObject var308) {
        final SubLThread var352 = SubLProcess.currentSubLThread();
        if (module0302.NIL != var327 && module0302.NIL != module0158.f10010(var6, (SubLObject)module0302.ONE_INTEGER, var327)) {
            final SubLObject var353 = module0158.f10011(var6, (SubLObject)module0302.ONE_INTEGER, var327);
            SubLObject var354 = (SubLObject)module0302.NIL;
            final SubLObject var355 = (SubLObject)module0302.NIL;
            while (module0302.NIL == var354) {
                final SubLObject var356 = module0052.f3695(var353, var355);
                final SubLObject var357 = (SubLObject)SubLObjectFactory.makeBoolean(!var355.eql(var356));
                if (module0302.NIL != var357) {
                    SubLObject var358 = (SubLObject)module0302.NIL;
                    try {
                        var358 = module0158.f10316(var356, (SubLObject)module0302.$ic103$, (SubLObject)module0302.$ic104$, (SubLObject)module0302.NIL);
                        SubLObject var337_354 = (SubLObject)module0302.NIL;
                        final SubLObject var338_355 = (SubLObject)module0302.NIL;
                        while (module0302.NIL == var337_354) {
                            final SubLObject var359 = module0052.f3695(var358, var338_355);
                            final SubLObject var340_356 = (SubLObject)SubLObjectFactory.makeBoolean(!var338_355.eql(var359));
                            if (module0302.NIL != var340_356 && module0302.NIL == f20107(var359)) {
                                final SubLObject var360 = module0178.f11335(var359);
                                final SubLObject var361 = module0178.f11336(var359);
                                final SubLObject var362 = (SubLObject)ConsesLow.list(var360, var361);
                                if (module0302.NIL != f20110(var121, var360, var308, var351)) {
                                    final SubLObject var363 = var362;
                                    if (module0302.NIL == conses_high.member(var363, module0302.$g2702$.getDynamicValue(var352), Symbols.symbol_function((SubLObject)module0302.EQL), Symbols.symbol_function((SubLObject)module0302.IDENTITY))) {
                                        module0302.$g2702$.setDynamicValue((SubLObject)ConsesLow.cons(var363, module0302.$g2702$.getDynamicValue(var352)), var352);
                                    }
                                    if (module0302.NIL != module0144.$g1796$.getDynamicValue(var352)) {
                                        module0084.f5762(module0302.$g2703$.getDynamicValue(var352), var362, (SubLObject)ConsesLow.list(var6, var42));
                                    }
                                }
                            }
                            var337_354 = (SubLObject)SubLObjectFactory.makeBoolean(module0302.NIL == var340_356);
                        }
                    }
                    finally {
                        final SubLObject var364 = Threads.$is_thread_performing_cleanupP$.currentBinding(var352);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0302.T, var352);
                            if (module0302.NIL != var358) {
                                module0158.f10319(var358);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var364, var352);
                        }
                    }
                }
                var354 = (SubLObject)SubLObjectFactory.makeBoolean(module0302.NIL == var357);
            }
        }
        return module0302.$g2702$.getDynamicValue(var352);
    }
    
    public static SubLObject f20111(final SubLObject var308, final SubLObject var122, final SubLObject var124) {
        if (var308.eql((SubLObject)module0302.$ic39$)) {
            return module0303.f20126(var122, var124);
        }
        if (var308.eql((SubLObject)module0302.$ic65$)) {
            return module0303.f20128(var122, var124);
        }
        if (var308.eql((SubLObject)module0302.$ic62$)) {
            return module0303.f20130(var122, var124);
        }
        if (var308.eql((SubLObject)module0302.$ic70$)) {
            return module0303.f20131(var122, var124);
        }
        if (var308.eql((SubLObject)module0302.$ic77$)) {
            return module0303.f20132(var122, var124);
        }
        if (var308.eql((SubLObject)module0302.$ic73$)) {
            return module0303.f20133(var122, var124);
        }
        if (var308.eql((SubLObject)module0302.$ic86$)) {
            return module0226.f15051(var122, var124);
        }
        if (var308.eql((SubLObject)module0302.$ic90$)) {
            return module0302.$ic89$;
        }
        return (SubLObject)module0302.NIL;
    }
    
    public static SubLObject f20113(final SubLObject var308, final SubLObject var121, final SubLObject var123) {
        if (var308.eql((SubLObject)module0302.$ic39$)) {
            return module0303.f20127(var121, var123);
        }
        if (var308.eql((SubLObject)module0302.$ic65$)) {
            return module0303.f20129(var121, var123);
        }
        if (var308.eql((SubLObject)module0302.$ic62$)) {
            return module0303.f20134(var121, var123);
        }
        if (var308.eql((SubLObject)module0302.$ic86$)) {
            return module0226.f15054(var121, var123);
        }
        if (var308.eql((SubLObject)module0302.$ic90$)) {
            return module0302.$ic89$;
        }
        return (SubLObject)module0302.NIL;
    }
    
    public static SubLObject f20036(final SubLObject var359) {
        SubLObject var360 = var359;
        SubLObject var361 = (SubLObject)module0302.NIL;
        var361 = var360.first();
        while (module0302.NIL != var360) {
            module0303.f20203(var361);
            var360 = var360.rest();
            var361 = var360.first();
        }
        return (SubLObject)module0302.NIL;
    }
    
    public static SubLObject f20107(final SubLObject var344) {
        final SubLObject var345 = module0178.f11287(var344);
        if (module0302.NIL != module0147.f9509() && module0302.NIL != module0222.f14635(module0302.$ic113$, var345, (SubLObject)module0302.ONE_INTEGER, (SubLObject)module0302.UNPROVIDED)) {
            return (SubLObject)module0302.T;
        }
        return (SubLObject)module0302.NIL;
    }
    
    public static SubLObject f20114() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0302", "f20033", "S#22691");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20034", "S#22692", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20037", "S#22693", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20039", "S#22694", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20040", "S#22695", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20041", "S#20665", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20038", "S#22696", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20042", "S#22697", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20043", "S#22698", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20044", "S#22699", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20045", "S#22700", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20046", "S#22701", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20047", "S#22702", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20049", "S#22703", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20050", "S#22704", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20051", "S#22705", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20052", "S#22706", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20053", "S#22707", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20054", "S#22708", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20055", "S#22709", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20056", "S#22710", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20057", "S#22711", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20058", "S#22712", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20059", "S#22713", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20060", "S#22714", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20061", "S#22715", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20062", "S#22716", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20063", "S#22717", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20065", "S#22718", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20066", "S#22719", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20067", "S#22720", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20068", "S#22721", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20069", "S#22722", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20070", "S#22723", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20071", "S#22724", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20072", "S#22725", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20073", "S#22726", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20074", "S#22727", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20075", "S#22728", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20076", "S#22729", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20077", "S#22730", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20078", "S#22731", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20079", "S#22732", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20080", "S#22733", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20081", "S#22734", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20082", "S#22735", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20083", "S#22736", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20084", "S#22737", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20085", "S#22738", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20086", "S#22739", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20087", "S#22740", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20089", "S#22741", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20090", "S#22684", 0, 0, false);
        new $f20090$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20091", "S#22742", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20092", "S#22743", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20048", "S#22744", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20093", "S#22745", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20094", "S#22746", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20099", "S#22747", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20095", "S#22748", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20096", "S#22749", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20097", "S#22750", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20098", "S#22751", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20100", "S#22752", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20035", "S#22753", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20102", "S#22754", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20104", "S#22755", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20105", "S#22756", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20106", "S#22757", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20101", "S#12456", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20108", "S#22758", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20103", "S#20499", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20109", "S#22759", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20110", "S#22760", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20064", "S#22761", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20088", "S#22762", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20112", "S#22763", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20111", "S#22764", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20113", "S#22765", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20036", "S#22766", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0302", "f20107", "S#22767", 1, 0, false);
        return (SubLObject)module0302.NIL;
    }
    
    public static SubLObject f20115() {
        module0302.$g2701$ = SubLFiles.deflexical("S#22768", (SubLObject)module0302.T);
        module0302.$g2702$ = SubLFiles.defvar("S#22769", (SubLObject)module0302.NIL);
        module0302.$g2703$ = SubLFiles.defvar("S#22770", (SubLObject)module0302.NIL);
        module0302.$g2704$ = SubLFiles.deflexical("S#22771", (SubLObject)module0302.NIL);
        module0302.$g2705$ = SubLFiles.defvar("S#22772", (SubLObject)module0302.NIL);
        return (SubLObject)module0302.NIL;
    }
    
    public static SubLObject f20116() {
        module0034.f1909((SubLObject)module0302.$ic93$);
        return (SubLObject)module0302.NIL;
    }
    
    public void declareFunctions() {
        f20114();
    }
    
    public void initializeVariables() {
        f20115();
    }
    
    public void runTopLevelForms() {
        f20116();
    }
    
    static {
        me = (SubLFile)new module0302();
        module0302.$g2701$ = null;
        module0302.$g2702$ = null;
        module0302.$g2703$ = null;
        module0302.$g2704$ = null;
        module0302.$g2705$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("CLET");
        $ic1$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#22769", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#22770", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DICTIONARY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)module0302.EQUAL))));
        $ic2$ = SubLObjectFactory.makeSymbol("S#16293", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("S#12457", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("S#11281", "CYC");
        $ic5$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Quote"));
        $ic6$ = SubLObjectFactory.makeKeyword("ARG-ISA");
        $ic7$ = SubLObjectFactory.makeSymbol("S#19515", "CYC");
        $ic8$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-COL-DEFN");
        $ic9$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-ARG-ISA");
        $ic10$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#22773", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20622", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20973", "CYC"));
        $ic11$ = SubLObjectFactory.makeKeyword("SELF");
        $ic12$ = SubLObjectFactory.makeKeyword("AT-CONSTRAINT-GAF");
        $ic13$ = SubLObjectFactory.makeKeyword("WFF-FORMULA");
        $ic14$ = SubLObjectFactory.makeKeyword("WFF-EXPANSION-FORMULA");
        $ic15$ = SubLObjectFactory.makeKeyword("WFF-ORIGINAL-FORMULA");
        $ic16$ = SubLObjectFactory.makeKeyword("MAL-RELN-WRT-ARG-ISA-REQUIRED");
        $ic17$ = SubLObjectFactory.makeKeyword("ARG-NOT-ISA");
        $ic18$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-ARG-NOT-ISA");
        $ic19$ = SubLObjectFactory.makeKeyword("MAL-RELN-WRT-ARG-NOT-ISA-REQUIRED");
        $ic20$ = SubLObjectFactory.makeKeyword("ISA");
        $ic21$ = SubLObjectFactory.makeKeyword("NAUT");
        $ic22$ = SubLObjectFactory.makeSymbol("S#22774", "CYC");
        $ic23$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-ARG-NOT-ISA-DISJOINT");
        $ic24$ = SubLObjectFactory.makeKeyword("ARG-QUOTED-ISA");
        $ic25$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-COL-QUOTED-DEFN");
        $ic26$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-ARG-QUOTED-ISA");
        $ic27$ = SubLObjectFactory.makeKeyword("QUOTED-ISA");
        $ic28$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("termOfUnit"));
        $ic29$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycLReifiableNonAtomicTerm"));
        $ic30$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-ARG-NOT-QUOTED-ISA-DISJOINT");
        $ic31$ = SubLObjectFactory.makeKeyword("ARG-GENLS");
        $ic32$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Thing"));
        $ic33$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-ARG-GENL");
        $ic34$ = SubLObjectFactory.makeKeyword("GENLS");
        $ic35$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-ARG-NOT-GENLS-DISJOINT");
        $ic36$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("equals"));
        $ic37$ = SubLObjectFactory.makeKeyword("FORMAT");
        $ic38$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-ARG-FORMAT");
        $ic39$ = SubLObjectFactory.makeKeyword("INTER-ARG-ISA");
        $ic40$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#20619", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#22775", "CYC"));
        $ic41$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-INTER-ARG-DEFN");
        $ic42$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-INTER-ARG-ISA");
        $ic43$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#22773", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20622", "CYC"));
        $ic44$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("interArgGenl1-2"));
        $ic45$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("interArgGenl2-1"));
        $ic46$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("interArgGenl2-4"));
        $ic47$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $ic48$ = SubLObjectFactory.makeKeyword("DEPTH");
        $ic49$ = SubLObjectFactory.makeKeyword("STACK");
        $ic50$ = SubLObjectFactory.makeKeyword("QUEUE");
        $ic51$ = SubLObjectFactory.makeSymbol("S#11450", "CYC");
        $ic52$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic53$ = SubLObjectFactory.makeString("~A is not a ~A");
        $ic54$ = SubLObjectFactory.makeSymbol("S#11592", "CYC");
        $ic55$ = SubLObjectFactory.makeKeyword("CERROR");
        $ic56$ = SubLObjectFactory.makeString("continue anyway");
        $ic57$ = SubLObjectFactory.makeKeyword("WARN");
        $ic58$ = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic59$ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $ic60$ = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic61$ = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic62$ = SubLObjectFactory.makeKeyword("INTER-ARG-GENL");
        $ic63$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#20623", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#22776", "CYC"));
        $ic64$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-INTER-ARG-GENL");
        $ic65$ = SubLObjectFactory.makeKeyword("INTER-ARG-NOT-ISA");
        $ic66$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-INTER-ARG-NOT-ISA");
        $ic67$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-INTER-ARG-NOT-DEFN");
        $ic68$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("interArgNotIsa1-2"));
        $ic69$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("interArgNotIsa2-1"));
        $ic70$ = SubLObjectFactory.makeKeyword("INTER-ARG-NOT-GENL");
        $ic71$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-INTER-ARG-NOT-GENL");
        $ic72$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("interArgNotGenl1-2"));
        $ic73$ = SubLObjectFactory.makeKeyword("INTER-ARG-GENL-ISA");
        $ic74$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#20623", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#22775", "CYC"));
        $ic75$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-INTER-ARG-GENL-ISA");
        $ic76$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("interArgGenlIsa2-1"));
        $ic77$ = SubLObjectFactory.makeKeyword("INTER-ARG-ISA-GENL");
        $ic78$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#20619", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#22776", "CYC"));
        $ic79$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-INTER-ARG-ISA-GENL");
        $ic80$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsaGenl1-2"));
        $ic81$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsaGenl2-1"));
        $ic82$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsaGenl2-3"));
        $ic83$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("interArgIsaGenl3-2"));
        $ic84$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-INTER-ARG-NOT-ISA-DISJOINT");
        $ic85$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-INTER-ARG-NOT-GENL-DISJOINT");
        $ic86$ = SubLObjectFactory.makeKeyword("INTER-ARG-FORMAT");
        $ic87$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#20619", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#22777", "CYC"));
        $ic88$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-INTER-ARG-FORMAT");
        $ic89$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("interArgDifferent"));
        $ic90$ = SubLObjectFactory.makeKeyword("INTER-ARG-DIFFERENT");
        $ic91$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#22778", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#22779", "CYC"));
        $ic92$ = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-INTER-ARG-DIFFERENT");
        $ic93$ = SubLObjectFactory.makeSymbol("S#22744", "CYC");
        $ic94$ = SubLObjectFactory.makeKeyword("STRONG-FORT");
        $ic95$ = SubLObjectFactory.makeKeyword("WEAK-FORT");
        $ic96$ = SubLObjectFactory.makeSymbol("S#22771", "CYC");
        $ic97$ = SubLObjectFactory.makeInteger(1024);
        $ic98$ = SubLObjectFactory.makeSymbol("S#22684", "CYC");
        $ic99$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic100$ = SubLObjectFactory.makeSymbol("S#12629", "CYC");
        $ic101$ = SubLObjectFactory.makeKeyword("VIA-GENL-PRED");
        $ic102$ = SubLObjectFactory.makeKeyword("VIA-GENL-INVERSE");
        $ic103$ = SubLObjectFactory.makeKeyword("GAF");
        $ic104$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic105$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SingleEntry"));
        $ic106$ = SubLObjectFactory.makeSymbol("S#2879", "CYC");
        $ic107$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("singleEntryFormatInArgs"));
        $ic108$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("argsIsa"));
        $ic109$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("argAndRestIsa"));
        $ic110$ = SubLObjectFactory.makeString("Unknown constraint-type ~s");
        $ic111$ = SubLObjectFactory.makeKeyword("FORT");
        $ic112$ = SubLObjectFactory.makeKeyword("NON-FORT");
        $ic113$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("wffConstraintMt"));
    }
    
    public static final class $f20090$ZeroArityFunction extends ZeroArityFunction
    {
        public $f20090$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#22684"));
        }
        
        public SubLObject processItem() {
            return module0302.f20090();
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0302.class
	Total time: 2004 ms
	
	Decompiled with Procyon 0.5.32.
*/