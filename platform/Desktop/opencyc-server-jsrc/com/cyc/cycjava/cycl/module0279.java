package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0279 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0279";
    public static final String myFingerPrint = "c17056a518b9d1f459b4ee94c3a3ede5fac9c6a5edec64c66cba4ef45c413f50";
    private static SubLSymbol $g2606$;
    private static SubLSymbol $g2607$;
    private static SubLSymbol $g2608$;
    private static SubLSymbol $g2609$;
    private static SubLSymbol $g2610$;
    private static SubLSymbol $g2611$;
    private static SubLSymbol $g2612$;
    private static SubLSymbol $g2614$;
    private static final SubLSymbol $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLList $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLList $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLList $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLList $ic12$;
    private static final SubLList $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLString $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLString $ic19$;
    private static final SubLObject $ic20$;
    private static final SubLObject $ic21$;
    private static final SubLObject $ic22$;
    private static final SubLObject $ic23$;
    private static final SubLObject $ic24$;
    private static final SubLObject $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLObject $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLInteger $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLObject $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLObject $ic46$;
    private static final SubLObject $ic47$;
    private static final SubLObject $ic48$;
    private static final SubLObject $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLObject $ic55$;
    private static final SubLString $ic56$;
    private static final SubLObject $ic57$;
    private static final SubLObject $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLString $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLObject $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLObject $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLString $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLString $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLObject $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLString $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLObject $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLList $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLObject $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLString $ic111$;
    private static final SubLString $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLString $ic114$;
    private static final SubLString $ic115$;
    private static final SubLString $ic116$;
    private static final SubLString $ic117$;
    private static final SubLString $ic118$;
    private static final SubLString $ic119$;
    private static final SubLString $ic120$;
    private static final SubLString $ic121$;
    private static final SubLString $ic122$;
    private static final SubLString $ic123$;
    private static final SubLObject $ic124$;
    
    public static SubLObject f18436(final SubLObject var1, SubLObject var2) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = (SubLObject)module0279.NIL;
        }
        if (module0279.NIL != module0173.f10955(var1) && module0279.NIL != f18437(var1)) {
            SubLObject var3 = module0146.$g2045$.getGlobalValue();
            SubLObject var4 = (SubLObject)module0279.NIL;
            var4 = var3.first();
            while (module0279.NIL != var3) {
                if (module0279.NIL != module0220.f14548(var1, var4, var2, (SubLObject)module0279.ONE_INTEGER, (SubLObject)module0279.$ic0$)) {
                    return (SubLObject)module0279.T;
                }
                var3 = var3.rest();
                var4 = var3.first();
            }
        }
        return (SubLObject)module0279.NIL;
    }
    
    public static SubLObject f18437(final SubLObject var1) {
        if (module0279.NIL != module0173.f10955(var1)) {
            SubLObject var2 = (SubLObject)module0279.NIL;
            if (module0279.NIL == var2) {
                SubLObject var3 = module0146.$g2045$.getGlobalValue();
                SubLObject var4 = (SubLObject)module0279.NIL;
                var4 = var3.first();
                while (module0279.NIL == var2 && module0279.NIL != var3) {
                    if (module0279.NIL != module0222.f14635(var4, var1, (SubLObject)module0279.ONE_INTEGER, (SubLObject)module0279.UNPROVIDED)) {
                        var2 = (SubLObject)module0279.T;
                    }
                    var3 = var3.rest();
                    var4 = var3.first();
                }
            }
            return var2;
        }
        return (SubLObject)module0279.NIL;
    }
    
    public static SubLObject f18438(final SubLObject var1, final SubLObject var7, final SubLObject var8, final SubLObject var2) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        SubLObject var10 = (SubLObject)module0279.NIL;
        if (module0279.NIL == f18437(var1)) {
            return (SubLObject)module0279.NIL;
        }
        final SubLObject var11 = module0147.$g2094$.currentBinding(var9);
        final SubLObject var12 = module0147.$g2095$.currentBinding(var9);
        try {
            module0147.$g2094$.bind(module0147.f9531(var2), var9);
            module0147.$g2095$.bind(module0147.f9534(var2), var9);
            SubLObject var13 = module0279.$ic1$;
            if (module0279.NIL != module0158.f10010(var1, (SubLObject)module0279.ONE_INTEGER, var13)) {
                final SubLObject var14 = module0158.f10011(var1, (SubLObject)module0279.ONE_INTEGER, var13);
                SubLObject var15 = var10;
                final SubLObject var16 = (SubLObject)module0279.NIL;
                while (module0279.NIL == var15) {
                    final SubLObject var17 = module0052.f3695(var14, var16);
                    final SubLObject var18 = (SubLObject)SubLObjectFactory.makeBoolean(!var16.eql(var17));
                    if (module0279.NIL != var18) {
                        SubLObject var19 = (SubLObject)module0279.NIL;
                        try {
                            var19 = module0158.f10316(var17, (SubLObject)module0279.$ic2$, (SubLObject)module0279.$ic0$, (SubLObject)module0279.NIL);
                            SubLObject var16_21 = var10;
                            final SubLObject var17_22 = (SubLObject)module0279.NIL;
                            while (module0279.NIL == var16_21) {
                                final SubLObject var20 = module0052.f3695(var19, var17_22);
                                final SubLObject var19_24 = (SubLObject)SubLObjectFactory.makeBoolean(!var17_22.eql(var20));
                                if (module0279.NIL != var19_24) {
                                    final SubLObject var21 = module0178.f11335(var20);
                                    final SubLObject var22 = module0178.f11336(var20);
                                    var10 = (SubLObject)SubLObjectFactory.makeBoolean(var7.eql(var21) && module0279.NIL != module0213.f14081(var8, var22));
                                }
                                var16_21 = (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL == var19_24 || module0279.NIL != var10);
                            }
                        }
                        finally {
                            final SubLObject var12_27 = Threads.$is_thread_performing_cleanupP$.currentBinding(var9);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0279.T, var9);
                                if (module0279.NIL != var19) {
                                    module0158.f10319(var19);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var12_27, var9);
                            }
                        }
                    }
                    var15 = (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL == var18 || module0279.NIL != var10);
                }
            }
            var13 = module0279.$ic3$;
            if (module0279.NIL != module0158.f10010(var1, (SubLObject)module0279.ONE_INTEGER, var13)) {
                final SubLObject var14 = module0158.f10011(var1, (SubLObject)module0279.ONE_INTEGER, var13);
                SubLObject var15 = var10;
                final SubLObject var16 = (SubLObject)module0279.NIL;
                while (module0279.NIL == var15) {
                    final SubLObject var17 = module0052.f3695(var14, var16);
                    final SubLObject var18 = (SubLObject)SubLObjectFactory.makeBoolean(!var16.eql(var17));
                    if (module0279.NIL != var18) {
                        SubLObject var19 = (SubLObject)module0279.NIL;
                        try {
                            var19 = module0158.f10316(var17, (SubLObject)module0279.$ic2$, (SubLObject)module0279.$ic0$, (SubLObject)module0279.NIL);
                            SubLObject var16_22 = var10;
                            final SubLObject var17_23 = (SubLObject)module0279.NIL;
                            while (module0279.NIL == var16_22) {
                                final SubLObject var20 = module0052.f3695(var19, var17_23);
                                final SubLObject var19_25 = (SubLObject)SubLObjectFactory.makeBoolean(!var17_23.eql(var20));
                                if (module0279.NIL != var19_25) {
                                    final SubLObject var21 = module0178.f11335(var20);
                                    final SubLObject var22 = module0178.f11336(var20);
                                    var10 = (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL != module0004.f106(var21) && var7.numGE(var21) && module0279.NIL != module0213.f14081(var8, var22));
                                }
                                var16_22 = (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL == var19_25 || module0279.NIL != var10);
                            }
                        }
                        finally {
                            final SubLObject var12_28 = Threads.$is_thread_performing_cleanupP$.currentBinding(var9);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0279.T, var9);
                                if (module0279.NIL != var19) {
                                    module0158.f10319(var19);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var12_28, var9);
                            }
                        }
                    }
                    var15 = (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL == var18 || module0279.NIL != var10);
                }
            }
            var13 = module0279.$ic4$;
            if (module0279.NIL != module0158.f10010(var1, (SubLObject)module0279.ONE_INTEGER, var13)) {
                final SubLObject var14 = module0158.f10011(var1, (SubLObject)module0279.ONE_INTEGER, var13);
                SubLObject var15 = var10;
                final SubLObject var16 = (SubLObject)module0279.NIL;
                while (module0279.NIL == var15) {
                    final SubLObject var17 = module0052.f3695(var14, var16);
                    final SubLObject var18 = (SubLObject)SubLObjectFactory.makeBoolean(!var16.eql(var17));
                    if (module0279.NIL != var18) {
                        SubLObject var19 = (SubLObject)module0279.NIL;
                        try {
                            var19 = module0158.f10316(var17, (SubLObject)module0279.$ic2$, (SubLObject)module0279.$ic0$, (SubLObject)module0279.NIL);
                            SubLObject var16_23 = var10;
                            final SubLObject var17_24 = (SubLObject)module0279.NIL;
                            while (module0279.NIL == var16_23) {
                                final SubLObject var20 = module0052.f3695(var19, var17_24);
                                final SubLObject var19_26 = (SubLObject)SubLObjectFactory.makeBoolean(!var17_24.eql(var20));
                                if (module0279.NIL != var19_26) {
                                    final SubLObject var23 = module0178.f11335(var20);
                                    var10 = module0213.f14081(var8, var23);
                                }
                                var16_23 = (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL == var19_26 || module0279.NIL != var10);
                            }
                        }
                        finally {
                            final SubLObject var12_29 = Threads.$is_thread_performing_cleanupP$.currentBinding(var9);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0279.T, var9);
                                if (module0279.NIL != var19) {
                                    module0158.f10319(var19);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var12_29, var9);
                            }
                        }
                    }
                    var15 = (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL == var18 || module0279.NIL != var10);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var12, var9);
            module0147.$g2094$.rebind(var11, var9);
        }
        if (module0279.NIL == var10) {
            SubLObject var24 = f18439(var8);
            SubLObject var25 = (SubLObject)module0279.NIL;
            var25 = var24.first();
            while (module0279.NIL == var10 && module0279.NIL != var24) {
                if (module0279.NIL != f18438(var1, var7, var25, var2)) {
                    var10 = (SubLObject)module0279.T;
                }
                var24 = var24.rest();
                var25 = var24.first();
            }
        }
        return var10;
    }
    
    public static SubLObject f18440(final SubLObject var8) {
        if (var8.eql(module0279.$ic5$)) {
            return (SubLObject)module0279.$ic6$;
        }
        if (var8.eql(module0279.$ic7$)) {
            return (SubLObject)module0279.$ic8$;
        }
        if (var8.eql(module0279.$ic9$)) {
            return (SubLObject)module0279.$ic10$;
        }
        return (SubLObject)module0279.NIL;
    }
    
    public static SubLObject f18439(final SubLObject var8) {
        if (var8.eql(module0279.$ic11$)) {
            return (SubLObject)module0279.$ic12$;
        }
        if (var8.eql(module0279.$ic5$)) {
            return (SubLObject)module0279.$ic13$;
        }
        if (var8.eql(module0279.$ic9$)) {
            return (SubLObject)module0279.$ic13$;
        }
        if (var8.eql(module0279.$ic14$)) {
            return (SubLObject)module0279.$ic15$;
        }
        return (SubLObject)module0279.NIL;
    }
    
    public static SubLObject f18441(final SubLObject var38, SubLObject var39) {
        if (var39 == module0279.UNPROVIDED) {
            var39 = module0146.$g2002$.getDynamicValue();
        }
        final SubLObject var40 = var39;
        if (var40.eql((SubLObject)module0279.$ic16$)) {
            return module0201.f12550(PrintLow.format((SubLObject)module0279.NIL, (SubLObject)module0279.$ic17$, var38));
        }
        if (var40.eql((SubLObject)module0279.$ic18$)) {
            return module0193.f12079(var38);
        }
        return (SubLObject)module0279.NIL;
    }
    
    public static SubLObject f18442(final SubLObject var40) {
        if (module0279.NIL != module0206.f13497(var40)) {
            final SubLObject var41 = module0201.f12548(var40);
            final SubLObject var42 = module0038.f2623(var41, (SubLObject)module0279.THREE_INTEGER, (SubLObject)module0279.UNPROVIDED);
            final SubLObject var43 = module0038.f2642(var42);
            if (var43.isInteger()) {
                return var43;
            }
        }
        else if (module0279.NIL != module0206.f13500(var40)) {
            return module0193.f12073(var40);
        }
        return Errors.error((SubLObject)module0279.$ic19$, var40);
    }
    
    public static SubLObject f18443(final SubLObject var44, final SubLObject var7, SubLObject var2) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = (SubLObject)module0279.NIL;
        }
        if (var7.numG((SubLObject)module0279.ZERO_INTEGER)) {
            return f18438(var44, var7, module0279.$ic14$, var2);
        }
        return (SubLObject)module0279.NIL;
    }
    
    public static SubLObject f18444(final SubLObject var44, final SubLObject var7, SubLObject var2) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = (SubLObject)module0279.NIL;
        }
        if (var7.numG((SubLObject)module0279.ZERO_INTEGER)) {
            return f18438(var44, var7, module0279.$ic9$, var2);
        }
        return (SubLObject)module0279.NIL;
    }
    
    public static SubLObject f18445(final SubLObject var1, final SubLObject var7, SubLObject var2) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = (SubLObject)module0279.NIL;
        }
        return f18438(var1, var7, module0279.$ic20$, var2);
    }
    
    public static SubLObject f18446(final SubLObject var1, SubLObject var2) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = (SubLObject)module0279.NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0279.NIL;
        if (module0279.NIL == f18437(var1)) {
            return (SubLObject)module0279.NIL;
        }
        final SubLObject var5 = var2;
        final SubLObject var6 = module0147.$g2094$.currentBinding(var3);
        final SubLObject var7 = module0147.$g2095$.currentBinding(var3);
        try {
            module0147.$g2094$.bind(module0147.f9531(var5), var3);
            module0147.$g2095$.bind(module0147.f9534(var5), var3);
            SubLObject var9;
            SubLObject var8 = var9 = module0220.f14572(module0279.$ic1$, var1, module0279.$ic21$, (SubLObject)module0279.ONE_INTEGER, (SubLObject)module0279.THREE_INTEGER, (SubLObject)module0279.$ic0$);
            SubLObject var10 = (SubLObject)module0279.NIL;
            var10 = var9.first();
            while (module0279.NIL != var9) {
                final SubLObject var11 = module0178.f11335(var10);
                if (module0279.NIL != module0004.f106(var11)) {
                    var4 = (SubLObject)ConsesLow.cons(var11, var4);
                }
                var9 = var9.rest();
                var10 = var9.first();
            }
            var8 = (var9 = module0220.f14572(module0279.$ic3$, var1, module0279.$ic21$, (SubLObject)module0279.ONE_INTEGER, (SubLObject)module0279.THREE_INTEGER, (SubLObject)module0279.$ic0$));
            var10 = (SubLObject)module0279.NIL;
            var10 = var9.first();
            while (module0279.NIL != var9) {
                final SubLObject var11 = module0178.f11335(var10);
                final SubLObject var12 = module0225.f14739(var1);
                if (module0279.NIL != module0004.f106(var11)) {
                    SubLObject var13;
                    SubLObject var14;
                    for (var13 = Numbers.add(var12, (SubLObject)module0279.ONE_INTEGER), var14 = (SubLObject)module0279.NIL, var14 = var11; !var14.numGE(var13); var14 = module0048.f_1X(var14)) {
                        var4 = (SubLObject)ConsesLow.cons(var14, var4);
                    }
                }
                var9 = var9.rest();
                var10 = var9.first();
            }
            var8 = module0220.f14572(module0279.$ic4$, var1, module0279.$ic21$, (SubLObject)module0279.ONE_INTEGER, (SubLObject)module0279.TWO_INTEGER, (SubLObject)module0279.$ic0$);
            if (module0279.NIL != var8) {
                final SubLObject var15 = module0225.f14739(var1);
                SubLObject var16;
                SubLObject var17;
                for (var16 = Numbers.add(var15, (SubLObject)module0279.ONE_INTEGER), var17 = (SubLObject)module0279.NIL, var17 = (SubLObject)module0279.ONE_INTEGER; !var17.numGE(var16); var17 = module0048.f_1X(var17)) {
                    var4 = (SubLObject)ConsesLow.cons(var17, var4);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var7, var3);
            module0147.$g2094$.rebind(var6, var3);
        }
        return module0035.f2269(var4, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED);
    }
    
    public static SubLObject f18447(final SubLObject var1, final SubLObject var7, SubLObject var2) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = (SubLObject)module0279.NIL;
        }
        if (var7.numG((SubLObject)module0279.ZERO_INTEGER)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL != module0256.f16604(module0146.$g1979$.getGlobalValue(), module0226.f14882(var1, var7, var2), var2, (SubLObject)module0279.UNPROVIDED) || module0279.NIL != module0256.f16604(module0146.$g1979$.getGlobalValue(), module0226.f14895(var1, var7, var2), var2, (SubLObject)module0279.UNPROVIDED));
        }
        return (SubLObject)module0279.NIL;
    }
    
    public static SubLObject f18448(final SubLObject var1, final SubLObject var7, SubLObject var2) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = (SubLObject)module0279.NIL;
        }
        if (var7.numG((SubLObject)module0279.ZERO_INTEGER)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL != module0256.f16604(module0146.$g1978$.getGlobalValue(), module0226.f14882(var1, var7, var2), var2, (SubLObject)module0279.UNPROVIDED) || module0279.NIL != module0256.f16604(module0146.$g1978$.getGlobalValue(), module0226.f14895(var1, var7, var2), var2, (SubLObject)module0279.UNPROVIDED));
        }
        return (SubLObject)module0279.NIL;
    }
    
    public static SubLObject f18449(final SubLObject var44, final SubLObject var49) {
        if (var49.numG((SubLObject)module0279.ZERO_INTEGER)) {
            SubLObject var50 = (SubLObject)module0279.NIL;
            if (module0279.NIL == var50) {
                SubLObject var51 = module0226.f14882(var44, var49, (SubLObject)module0279.UNPROVIDED);
                SubLObject var52 = (SubLObject)module0279.NIL;
                var52 = var51.first();
                while (module0279.NIL == var50 && module0279.NIL != var51) {
                    if (module0279.NIL != module0256.f16596(var52, module0279.$ic22$, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED)) {
                        var50 = (SubLObject)module0279.T;
                    }
                    var51 = var51.rest();
                    var52 = var51.first();
                }
            }
            return var50;
        }
        return (SubLObject)module0279.NIL;
    }
    
    public static SubLObject f18450(final SubLObject var1, final SubLObject var7, SubLObject var2) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = (SubLObject)module0279.NIL;
        }
        if (module0279.NIL == module0173.f10955(var1) || !var7.isNumber() || !var7.numG((SubLObject)module0279.ZERO_INTEGER)) {
            return (SubLObject)module0279.NIL;
        }
        if (module0279.NIL != module0202.f12628(var1)) {
            return (SubLObject)module0279.T;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL != module0256.f16604(module0279.$ic23$, module0226.f14882(var1, var7, var2), var2, (SubLObject)module0279.UNPROVIDED) || module0279.NIL != module0256.f16604(module0279.$ic23$, module0226.f14895(var1, var7, var2), var2, (SubLObject)module0279.UNPROVIDED));
    }
    
    public static SubLObject f18451(final SubLObject var1, final SubLObject var7, SubLObject var2) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = (SubLObject)module0279.NIL;
        }
        if (module0279.NIL == module0173.f10955(var1) || !var7.isNumber() || !var7.numG((SubLObject)module0279.ZERO_INTEGER)) {
            return (SubLObject)module0279.NIL;
        }
        if (module0279.NIL != module0202.f12628(var1)) {
            return (SubLObject)module0279.T;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL != module0256.f16604(module0279.$ic24$, module0226.f14882(var1, var7, var2), var2, (SubLObject)module0279.UNPROVIDED) || module0279.NIL != module0256.f16604(module0279.$ic24$, module0226.f14895(var1, var7, var2), var2, (SubLObject)module0279.UNPROVIDED));
    }
    
    public static SubLObject f18452(final SubLObject var1, final SubLObject var7, SubLObject var2) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = (SubLObject)module0279.NIL;
        }
        if (module0279.NIL == module0173.f10955(var1) || !var7.isNumber() || !var7.numG((SubLObject)module0279.ZERO_INTEGER)) {
            return (SubLObject)module0279.NIL;
        }
        if (module0279.NIL != module0202.f12628(var1)) {
            return (SubLObject)module0279.T;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL != module0256.f16604(module0279.$ic25$, module0226.f14882(var1, var7, var2), var2, (SubLObject)module0279.UNPROVIDED) || module0279.NIL != module0256.f16604(module0279.$ic25$, module0226.f14895(var1, var7, var2), var2, (SubLObject)module0279.UNPROVIDED));
    }
    
    public static SubLObject f18453(final SubLObject var1, final SubLObject var7, SubLObject var2) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        if (module0279.NIL == module0173.f10955(var1) || !var7.isInteger() || !var7.numG((SubLObject)module0279.ZERO_INTEGER)) {
            return (SubLObject)module0279.NIL;
        }
        if (module0279.NIL != module0202.f12628(var1)) {
            return (SubLObject)module0279.T;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL != f18454(var1, var7, var2) || module0279.NIL != f18455(var1, var7, var2));
    }
    
    public static SubLObject f18456() {
        final SubLObject var51 = module0279.$g2606$.getGlobalValue();
        if (module0279.NIL != var51) {
            module0034.f1818(var51);
        }
        return (SubLObject)module0279.NIL;
    }
    
    public static SubLObject f18457(final SubLObject var1, final SubLObject var7, SubLObject var2) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = (SubLObject)module0279.NIL;
        }
        return module0034.f1829(module0279.$g2606$.getGlobalValue(), (SubLObject)ConsesLow.list(var1, var7, var2), (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED);
    }
    
    public static SubLObject f18458(final SubLObject var1, final SubLObject var7, final SubLObject var2) {
        return module0256.f16604(module0279.$ic27$, module0226.f14882(var1, var7, var2), var2, (SubLObject)module0279.UNPROVIDED);
    }
    
    public static SubLObject f18454(final SubLObject var1, final SubLObject var7, SubLObject var2) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = (SubLObject)module0279.NIL;
        }
        SubLObject var8 = module0279.$g2606$.getGlobalValue();
        if (module0279.NIL == var8) {
            var8 = module0034.f1934((SubLObject)module0279.$ic26$, (SubLObject)module0279.$ic28$, (SubLObject)module0279.$ic29$, (SubLObject)module0279.EQUAL, (SubLObject)module0279.THREE_INTEGER, (SubLObject)module0279.ZERO_INTEGER);
        }
        final SubLObject var9 = module0034.f1781(var1, var7, var2);
        final SubLObject var10 = module0034.f1814(var8, var9, (SubLObject)module0279.UNPROVIDED);
        if (var10 != module0279.$ic30$) {
            SubLObject var11 = var10;
            SubLObject var12 = (SubLObject)module0279.NIL;
            var12 = var11.first();
            while (module0279.NIL != var11) {
                SubLObject var13 = var12.first();
                final SubLObject var14 = conses_high.second(var12);
                if (var1.equal(var13.first())) {
                    var13 = var13.rest();
                    if (var7.equal(var13.first())) {
                        var13 = var13.rest();
                        if (module0279.NIL != var13 && module0279.NIL == var13.rest() && var2.equal(var13.first())) {
                            return module0034.f1959(var14);
                        }
                    }
                }
                var11 = var11.rest();
                var12 = var11.first();
            }
        }
        final SubLObject var15 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f18458(var1, var7, var2)));
        module0034.f1836(var8, var9, var10, var15, (SubLObject)ConsesLow.list(var1, var7, var2));
        return module0034.f1959(var15);
    }
    
    public static SubLObject f18459() {
        final SubLObject var51 = module0279.$g2607$.getGlobalValue();
        if (module0279.NIL != var51) {
            module0034.f1818(var51);
        }
        return (SubLObject)module0279.NIL;
    }
    
    public static SubLObject f18460(final SubLObject var1, final SubLObject var7, SubLObject var2) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = (SubLObject)module0279.NIL;
        }
        return module0034.f1829(module0279.$g2607$.getGlobalValue(), (SubLObject)ConsesLow.list(var1, var7, var2), (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED);
    }
    
    public static SubLObject f18461(final SubLObject var1, final SubLObject var7, final SubLObject var2) {
        return module0256.f16604(module0279.$ic27$, module0226.f14895(var1, var7, var2), var2, (SubLObject)module0279.UNPROVIDED);
    }
    
    public static SubLObject f18455(final SubLObject var1, final SubLObject var7, SubLObject var2) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = (SubLObject)module0279.NIL;
        }
        SubLObject var8 = module0279.$g2607$.getGlobalValue();
        if (module0279.NIL == var8) {
            var8 = module0034.f1934((SubLObject)module0279.$ic31$, (SubLObject)module0279.$ic32$, (SubLObject)module0279.$ic29$, (SubLObject)module0279.EQUAL, (SubLObject)module0279.THREE_INTEGER, (SubLObject)module0279.ZERO_INTEGER);
        }
        final SubLObject var9 = module0034.f1781(var1, var7, var2);
        final SubLObject var10 = module0034.f1814(var8, var9, (SubLObject)module0279.UNPROVIDED);
        if (var10 != module0279.$ic30$) {
            SubLObject var11 = var10;
            SubLObject var12 = (SubLObject)module0279.NIL;
            var12 = var11.first();
            while (module0279.NIL != var11) {
                SubLObject var13 = var12.first();
                final SubLObject var14 = conses_high.second(var12);
                if (var1.equal(var13.first())) {
                    var13 = var13.rest();
                    if (var7.equal(var13.first())) {
                        var13 = var13.rest();
                        if (module0279.NIL != var13 && module0279.NIL == var13.rest() && var2.equal(var13.first())) {
                            return module0034.f1959(var14);
                        }
                    }
                }
                var11 = var11.rest();
                var12 = var11.first();
            }
        }
        final SubLObject var15 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f18461(var1, var7, var2)));
        module0034.f1836(var8, var9, var10, var15, (SubLObject)ConsesLow.list(var1, var7, var2));
        return module0034.f1959(var15);
    }
    
    public static SubLObject f18462(final SubLObject var1, final SubLObject var7, SubLObject var2) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        if (module0279.NIL == module0173.f10955(var1) || !var7.isInteger() || !var7.numG((SubLObject)module0279.ZERO_INTEGER)) {
            return (SubLObject)module0279.NIL;
        }
        if (module0279.NIL != module0202.f12628(var1)) {
            return (SubLObject)module0279.T;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL != f18463(var1, var7, var2) || module0279.NIL != f18464(var1, var7, var2));
    }
    
    public static SubLObject f18465() {
        final SubLObject var51 = module0279.$g2608$.getGlobalValue();
        if (module0279.NIL != var51) {
            module0034.f1818(var51);
        }
        return (SubLObject)module0279.NIL;
    }
    
    public static SubLObject f18466(final SubLObject var1, final SubLObject var7, final SubLObject var2) {
        return module0034.f1829(module0279.$g2608$.getGlobalValue(), (SubLObject)ConsesLow.list(var1, var7, var2), (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED);
    }
    
    public static SubLObject f18467(final SubLObject var1, final SubLObject var7, final SubLObject var2) {
        return module0256.f16604(module0279.$ic34$, module0226.f14882(var1, var7, var2), var2, (SubLObject)module0279.UNPROVIDED);
    }
    
    public static SubLObject f18463(final SubLObject var1, final SubLObject var7, final SubLObject var2) {
        SubLObject var8 = module0279.$g2608$.getGlobalValue();
        if (module0279.NIL == var8) {
            var8 = module0034.f1934((SubLObject)module0279.$ic33$, (SubLObject)module0279.$ic35$, (SubLObject)module0279.$ic29$, (SubLObject)module0279.EQUAL, (SubLObject)module0279.THREE_INTEGER, (SubLObject)module0279.ZERO_INTEGER);
            module0034.f1951((SubLObject)module0279.$ic36$);
        }
        final SubLObject var9 = module0034.f1781(var1, var7, var2);
        final SubLObject var10 = module0034.f1814(var8, var9, (SubLObject)module0279.UNPROVIDED);
        if (var10 != module0279.$ic30$) {
            SubLObject var11 = var10;
            SubLObject var12 = (SubLObject)module0279.NIL;
            var12 = var11.first();
            while (module0279.NIL != var11) {
                SubLObject var13 = var12.first();
                final SubLObject var14 = conses_high.second(var12);
                if (var1.equal(var13.first())) {
                    var13 = var13.rest();
                    if (var7.equal(var13.first())) {
                        var13 = var13.rest();
                        if (module0279.NIL != var13 && module0279.NIL == var13.rest() && var2.equal(var13.first())) {
                            return module0034.f1959(var14);
                        }
                    }
                }
                var11 = var11.rest();
                var12 = var11.first();
            }
        }
        final SubLObject var15 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f18467(var1, var7, var2)));
        module0034.f1836(var8, var9, var10, var15, (SubLObject)ConsesLow.list(var1, var7, var2));
        return module0034.f1959(var15);
    }
    
    public static SubLObject f18468() {
        final SubLObject var51 = module0279.$g2609$.getGlobalValue();
        if (module0279.NIL != var51) {
            module0034.f1818(var51);
        }
        return (SubLObject)module0279.NIL;
    }
    
    public static SubLObject f18469(final SubLObject var1, final SubLObject var7, final SubLObject var2) {
        return module0034.f1829(module0279.$g2609$.getGlobalValue(), (SubLObject)ConsesLow.list(var1, var7, var2), (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED);
    }
    
    public static SubLObject f18470(final SubLObject var1, final SubLObject var7, final SubLObject var2) {
        return module0256.f16604(module0279.$ic34$, module0226.f14895(var1, var7, var2), var2, (SubLObject)module0279.UNPROVIDED);
    }
    
    public static SubLObject f18464(final SubLObject var1, final SubLObject var7, final SubLObject var2) {
        SubLObject var8 = module0279.$g2609$.getGlobalValue();
        if (module0279.NIL == var8) {
            var8 = module0034.f1934((SubLObject)module0279.$ic37$, (SubLObject)module0279.$ic38$, (SubLObject)module0279.$ic29$, (SubLObject)module0279.EQUAL, (SubLObject)module0279.THREE_INTEGER, (SubLObject)module0279.ZERO_INTEGER);
            module0034.f1951((SubLObject)module0279.$ic39$);
        }
        final SubLObject var9 = module0034.f1781(var1, var7, var2);
        final SubLObject var10 = module0034.f1814(var8, var9, (SubLObject)module0279.UNPROVIDED);
        if (var10 != module0279.$ic30$) {
            SubLObject var11 = var10;
            SubLObject var12 = (SubLObject)module0279.NIL;
            var12 = var11.first();
            while (module0279.NIL != var11) {
                SubLObject var13 = var12.first();
                final SubLObject var14 = conses_high.second(var12);
                if (var1.equal(var13.first())) {
                    var13 = var13.rest();
                    if (var7.equal(var13.first())) {
                        var13 = var13.rest();
                        if (module0279.NIL != var13 && module0279.NIL == var13.rest() && var2.equal(var13.first())) {
                            return module0034.f1959(var14);
                        }
                    }
                }
                var11 = var11.rest();
                var12 = var11.first();
            }
        }
        final SubLObject var15 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f18470(var1, var7, var2)));
        module0034.f1836(var8, var9, var10, var15, (SubLObject)ConsesLow.list(var1, var7, var2));
        return module0034.f1959(var15);
    }
    
    public static SubLObject f18471(final SubLObject var44, SubLObject var2) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL != f18472(var44, var2) || module0279.NIL != f18473(var44, var2));
    }
    
    public static SubLObject f18474() {
        final SubLObject var51 = module0279.$g2610$.getGlobalValue();
        if (module0279.NIL != var51) {
            module0034.f1818(var51);
        }
        return (SubLObject)module0279.NIL;
    }
    
    public static SubLObject f18475(final SubLObject var1, final SubLObject var2) {
        return module0034.f1829(module0279.$g2610$.getGlobalValue(), (SubLObject)ConsesLow.list(var1, var2), (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED);
    }
    
    public static SubLObject f18476(final SubLObject var1, final SubLObject var2) {
        return module0256.f16604(module0279.$ic34$, module0226.f14919(var1, var2), var2, (SubLObject)module0279.UNPROVIDED);
    }
    
    public static SubLObject f18472(final SubLObject var1, final SubLObject var2) {
        SubLObject var3 = module0279.$g2610$.getGlobalValue();
        if (module0279.NIL == var3) {
            var3 = module0034.f1934((SubLObject)module0279.$ic40$, (SubLObject)module0279.$ic41$, (SubLObject)module0279.$ic29$, (SubLObject)module0279.EQUAL, (SubLObject)module0279.TWO_INTEGER, (SubLObject)module0279.ZERO_INTEGER);
            module0034.f1951((SubLObject)module0279.$ic42$);
        }
        final SubLObject var4 = module0034.f1782(var1, var2);
        final SubLObject var5 = module0034.f1814(var3, var4, (SubLObject)module0279.UNPROVIDED);
        if (var5 != module0279.$ic30$) {
            SubLObject var6 = var5;
            SubLObject var7 = (SubLObject)module0279.NIL;
            var7 = var6.first();
            while (module0279.NIL != var6) {
                SubLObject var8 = var7.first();
                final SubLObject var9 = conses_high.second(var7);
                if (var1.equal(var8.first())) {
                    var8 = var8.rest();
                    if (module0279.NIL != var8 && module0279.NIL == var8.rest() && var2.equal(var8.first())) {
                        return module0034.f1959(var9);
                    }
                }
                var6 = var6.rest();
                var7 = var6.first();
            }
        }
        final SubLObject var10 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f18476(var1, var2)));
        module0034.f1836(var3, var4, var5, var10, (SubLObject)ConsesLow.list(var1, var2));
        return module0034.f1959(var10);
    }
    
    public static SubLObject f18477() {
        final SubLObject var51 = module0279.$g2611$.getGlobalValue();
        if (module0279.NIL != var51) {
            module0034.f1818(var51);
        }
        return (SubLObject)module0279.NIL;
    }
    
    public static SubLObject f18478(final SubLObject var1, final SubLObject var2) {
        return module0034.f1829(module0279.$g2611$.getGlobalValue(), (SubLObject)ConsesLow.list(var1, var2), (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED);
    }
    
    public static SubLObject f18479(final SubLObject var1, final SubLObject var2) {
        return module0256.f16604(module0279.$ic34$, module0226.f14922(var1, var2), var2, (SubLObject)module0279.UNPROVIDED);
    }
    
    public static SubLObject f18473(final SubLObject var1, final SubLObject var2) {
        SubLObject var3 = module0279.$g2611$.getGlobalValue();
        if (module0279.NIL == var3) {
            var3 = module0034.f1934((SubLObject)module0279.$ic43$, (SubLObject)module0279.$ic44$, (SubLObject)module0279.$ic29$, (SubLObject)module0279.EQUAL, (SubLObject)module0279.TWO_INTEGER, (SubLObject)module0279.ZERO_INTEGER);
            module0034.f1951((SubLObject)module0279.$ic45$);
        }
        final SubLObject var4 = module0034.f1782(var1, var2);
        final SubLObject var5 = module0034.f1814(var3, var4, (SubLObject)module0279.UNPROVIDED);
        if (var5 != module0279.$ic30$) {
            SubLObject var6 = var5;
            SubLObject var7 = (SubLObject)module0279.NIL;
            var7 = var6.first();
            while (module0279.NIL != var6) {
                SubLObject var8 = var7.first();
                final SubLObject var9 = conses_high.second(var7);
                if (var1.equal(var8.first())) {
                    var8 = var8.rest();
                    if (module0279.NIL != var8 && module0279.NIL == var8.rest() && var2.equal(var8.first())) {
                        return module0034.f1959(var9);
                    }
                }
                var6 = var6.rest();
                var7 = var6.first();
            }
        }
        final SubLObject var10 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f18479(var1, var2)));
        module0034.f1836(var3, var4, var5, var10, (SubLObject)ConsesLow.list(var1, var2));
        return module0034.f1959(var10);
    }
    
    public static SubLObject f18480(final SubLObject var1, final SubLObject var7, SubLObject var2) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = (SubLObject)module0279.NIL;
        }
        if (module0279.NIL == module0173.f10955(var1) || !var7.isNumber() || !var7.numG((SubLObject)module0279.ZERO_INTEGER)) {
            return (SubLObject)module0279.NIL;
        }
        if (module0279.NIL != module0202.f12628(var1)) {
            return (SubLObject)module0279.T;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL != module0256.f16604(module0279.$ic46$, module0226.f14882(var1, var7, var2), var2, (SubLObject)module0279.UNPROVIDED) || module0279.NIL != module0256.f16604(module0279.$ic46$, module0226.f14895(var1, var7, var2), var2, (SubLObject)module0279.UNPROVIDED));
    }
    
    public static SubLObject f18481(final SubLObject var1, final SubLObject var7, SubLObject var2) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = (SubLObject)module0279.NIL;
        }
        if (module0279.NIL == module0173.f10955(var1) || !var7.isNumber() || !var7.numG((SubLObject)module0279.ZERO_INTEGER)) {
            return (SubLObject)module0279.NIL;
        }
        if (module0279.NIL != module0202.f12628(var1)) {
            return (SubLObject)module0279.T;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL != module0256.f16604(module0279.$ic47$, module0226.f14882(var1, var7, var2), var2, (SubLObject)module0279.UNPROVIDED) || module0279.NIL != module0256.f16604(module0279.$ic47$, module0226.f14895(var1, var7, var2), var2, (SubLObject)module0279.UNPROVIDED));
    }
    
    public static SubLObject f18482(final SubLObject var1, final SubLObject var7, SubLObject var2) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = (SubLObject)module0279.NIL;
        }
        if (module0279.NIL == module0173.f10955(var1) || !var7.isNumber() || !var7.numG((SubLObject)module0279.ZERO_INTEGER)) {
            return (SubLObject)module0279.NIL;
        }
        if (module0279.NIL != module0202.f12628(var1)) {
            return (SubLObject)module0279.T;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL != module0256.f16604(module0279.$ic46$, module0226.f14882(var1, var7, var2), var2, (SubLObject)module0279.UNPROVIDED) || module0279.NIL != module0256.f16604(module0279.$ic46$, module0226.f14895(var1, var7, var2), var2, (SubLObject)module0279.UNPROVIDED));
    }
    
    public static SubLObject f18483(final SubLObject var1, final SubLObject var7, SubLObject var2) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = (SubLObject)module0279.NIL;
        }
        if (module0279.NIL == module0173.f10955(var1) || !var7.isNumber() || !var7.numG((SubLObject)module0279.ZERO_INTEGER)) {
            return (SubLObject)module0279.NIL;
        }
        if (module0279.NIL != module0202.f12628(var1)) {
            return (SubLObject)module0279.T;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL != module0256.f16604(module0279.$ic47$, module0226.f14882(var1, var7, var2), var2, (SubLObject)module0279.UNPROVIDED) || module0279.NIL != module0256.f16604(module0279.$ic47$, module0226.f14895(var1, var7, var2), var2, (SubLObject)module0279.UNPROVIDED));
    }
    
    public static SubLObject f18484(final SubLObject var1, final SubLObject var7, SubLObject var2) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = (SubLObject)module0279.NIL;
        }
        if (module0279.NIL != module0173.f10955(var1) && var7.isNumber() && var7.numG((SubLObject)module0279.ZERO_INTEGER)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL != module0256.f16604(module0279.$ic48$, module0226.f14882(var1, var7, var2), var2, (SubLObject)module0279.UNPROVIDED) || module0279.NIL != module0256.f16604(module0279.$ic48$, module0226.f14895(var1, var7, var2), var2, (SubLObject)module0279.UNPROVIDED));
        }
        return (SubLObject)module0279.NIL;
    }
    
    public static SubLObject f18485(final SubLObject var1, final SubLObject var7, SubLObject var2) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = (SubLObject)module0279.NIL;
        }
        return f18438(var1, var7, module0279.$ic5$, var2);
    }
    
    public static SubLObject f18486(final SubLObject var1, final SubLObject var7, SubLObject var2) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = (SubLObject)module0279.NIL;
        }
        return f18438(var1, var7, module0279.$ic11$, var2);
    }
    
    public static SubLObject f18487(final SubLObject var1, final SubLObject var7, SubLObject var2) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = (SubLObject)module0279.NIL;
        }
        final SubLThread var8 = SubLProcess.currentSubLThread();
        if (module0279.NIL != module0173.f10955(var1) && var7.isNumber() && var7.numG((SubLObject)module0279.ZERO_INTEGER)) {
            SubLObject var9 = (SubLObject)module0279.NIL;
            final SubLObject var10 = module0226.f14909(var7, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED);
            if (module0279.NIL != var10) {
                final SubLObject var11 = var2;
                final SubLObject var12 = module0147.$g2094$.currentBinding(var8);
                final SubLObject var13 = module0147.$g2095$.currentBinding(var8);
                try {
                    module0147.$g2094$.bind(module0147.f9531(var11), var8);
                    module0147.$g2095$.bind(module0147.f9534(var11), var8);
                    var9 = module0220.f14553(var1, module0226.f14909(var7, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED), (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED);
                }
                finally {
                    module0147.$g2095$.rebind(var13, var8);
                    module0147.$g2094$.rebind(var12, var8);
                }
            }
            return var9;
        }
        return (SubLObject)module0279.NIL;
    }
    
    public static SubLObject f18488(final SubLObject var61) {
        return module0269.f17765(var61);
    }
    
    public static SubLObject f18489(final SubLObject var62, SubLObject var2) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = (SubLObject)module0279.NIL;
        }
        final SubLObject var63 = f18490(var62, var2);
        if (module0279.NIL != module0210.f13566(var63)) {
            return var63;
        }
        if (module0279.NIL != var2) {
            return (SubLObject)ConsesLow.list(module0279.$ic49$, var2, var62);
        }
        return var62;
    }
    
    public static SubLObject f18491(final SubLObject var62, final SubLObject var2) {
        final SubLObject var63 = f18490(var62, var2);
        if (module0279.NIL != module0210.f13566(var63)) {
            return var63;
        }
        return (SubLObject)module0279.NIL;
    }
    
    public static SubLObject f18490(final SubLObject var62, final SubLObject var2) {
        final SubLThread var63 = SubLProcess.currentSubLThread();
        SubLObject var64 = (SubLObject)module0279.NIL;
        SubLObject var65 = (SubLObject)module0279.NIL;
        try {
            var63.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var66 = Errors.$error_handler$.currentBinding(var63);
            try {
                Errors.$error_handler$.bind((SubLObject)module0279.$ic50$, var63);
                try {
                    var64 = module0217.f14424(var62, var2);
                }
                catch (Throwable var67) {
                    Errors.handleThrowable(var67, (SubLObject)module0279.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var66, var63);
            }
        }
        catch (Throwable var68) {
            var65 = Errors.handleThrowable(var68, module0003.$g3$.getGlobalValue());
        }
        finally {
            var63.throwStack.pop();
        }
        return var64;
    }
    
    public static SubLObject f18492(final SubLObject var68) {
        SubLObject var69 = var68.first();
        final SubLObject var70 = conses_high.second(var68);
        var69 = f18493(var69);
        SubLObject var71 = var70;
        SubLObject var72 = (SubLObject)module0279.NIL;
        var72 = var71.first();
        while (module0279.NIL != var71) {
            var69 = conses_high.nsubst(var72.first(), var72.rest(), var69, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED);
            var71 = var71.rest();
            var72 = var71.first();
        }
        return var69;
    }
    
    public static SubLObject f18494(final SubLObject var68) {
        SubLObject var69 = var68.first();
        final SubLObject var70 = conses_high.second(var68);
        var69 = f18493(conses_high.copy_tree(var69));
        SubLObject var71 = var70;
        SubLObject var72 = (SubLObject)module0279.NIL;
        var72 = var71.first();
        while (module0279.NIL != var71) {
            var69 = conses_high.nsubst(var72.first(), var72.rest(), var69, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED);
            var71 = var71.rest();
            var72 = var71.first();
        }
        return var69;
    }
    
    public static SubLObject f18495(final SubLObject var72) {
        if (!var72.isCons()) {
            return (SubLObject)module0279.NIL;
        }
        SubLObject var73 = var72;
        SubLObject var74 = (SubLObject)module0279.NIL;
        var74 = var73.first();
        while (module0279.NIL != var73) {
            if (module0279.NIL == module0035.f1994(var74, (SubLObject)module0279.THREE_INTEGER, (SubLObject)module0279.UNPROVIDED) || module0279.NIL == module0232.f15320(var74.first()) || module0279.NIL == module0233.f15350(conses_high.second(var74))) {
                return (SubLObject)module0279.NIL;
            }
            var73 = var73.rest();
            var74 = var73.first();
        }
        return (SubLObject)module0279.T;
    }
    
    public static SubLObject f18496(final SubLObject var74) {
        return (module0279.NIL != f18495(var74)) ? Mapping.mapcar((SubLObject)module0279.$ic51$, var74) : var74;
    }
    
    public static SubLObject f18497(final SubLObject var74) {
        return (module0279.NIL != f18495(var74)) ? Mapping.mapcar((SubLObject)module0279.$ic52$, var74) : var74;
    }
    
    public static SubLObject f18498(final SubLObject var74) {
        return (module0279.NIL != f18495(var74)) ? Mapping.mapcar((SubLObject)module0279.$ic53$, var74) : var74;
    }
    
    public static SubLObject f18499(final SubLObject var74) {
        return (module0279.NIL != f18495(var74)) ? module0035.f2076((SubLObject)module0279.$ic53$, var74) : var74;
    }
    
    public static SubLObject f18500(final SubLObject var74) {
        return (module0279.NIL != f18495(var74)) ? Mapping.mapcar((SubLObject)module0279.$ic54$, var74) : var74;
    }
    
    public static SubLObject f18501(final SubLObject var74) {
        return (module0279.NIL != f18495(var74)) ? module0035.f2076((SubLObject)module0279.$ic54$, var74) : var74;
    }
    
    public static SubLObject f18502(final SubLObject var75, final SubLObject var76) {
        SubLObject var77 = (SubLObject)module0279.NIL;
        if (module0279.NIL == var77) {
            SubLObject var78 = module0202.f12845(var76);
            SubLObject var79 = (SubLObject)module0279.NIL;
            var79 = var78.first();
            while (module0279.NIL == var77 && module0279.NIL != var78) {
                if (var75.equal(module0202.f12835(var79, (SubLObject)module0279.UNPROVIDED))) {
                    var77 = var79;
                }
                var78 = var78.rest();
                var79 = var78.first();
            }
        }
        return var77;
    }
    
    public static SubLObject f18503(final SubLObject var75, final SubLObject var76) {
        SubLObject var77 = (SubLObject)module0279.NIL;
        if (module0279.NIL == var77) {
            SubLObject var78 = module0202.f12846(var76);
            SubLObject var79 = (SubLObject)module0279.NIL;
            var79 = var78.first();
            while (module0279.NIL == var77 && module0279.NIL != var78) {
                if (var75.equal(conses_high.third(var79))) {
                    var77 = var79;
                }
                var78 = var78.rest();
                var79 = var78.first();
            }
        }
        return var77;
    }
    
    public static SubLObject f18504(final SubLObject var75, final SubLObject var76, SubLObject var80) {
        if (var80 == module0279.UNPROVIDED) {
            var80 = Symbols.symbol_function((SubLObject)module0279.EQUAL);
        }
        SubLObject var81 = (SubLObject)module0279.NIL;
        if (module0279.NIL == var81) {
            SubLObject var82 = var76;
            SubLObject var83 = (SubLObject)module0279.NIL;
            var83 = var82.first();
            while (module0279.NIL == var81 && module0279.NIL != var82) {
                if (module0279.NIL != module0202.f12877(var83, (SubLObject)module0279.UNPROVIDED) && module0279.NIL != Functions.funcall(var80, var75, module0202.f12835(var83, (SubLObject)module0279.UNPROVIDED))) {
                    var81 = var83;
                }
                var82 = var82.rest();
                var83 = var82.first();
            }
        }
        return var81;
    }
    
    public static SubLObject f18505(final SubLObject var75, final SubLObject var76, SubLObject var80) {
        if (var80 == module0279.UNPROVIDED) {
            var80 = Symbols.symbol_function((SubLObject)module0279.EQUAL);
        }
        final SubLThread var81 = SubLProcess.currentSubLThread();
        if (module0279.NIL == module0279.$g2612$.getDynamicValue(var81)) {
            return (SubLObject)module0279.T;
        }
        SubLObject var82 = (SubLObject)module0279.NIL;
        if (module0279.NIL == var82) {
            SubLObject var83 = var76;
            SubLObject var84 = (SubLObject)module0279.NIL;
            var84 = var83.first();
            while (module0279.NIL == var82 && module0279.NIL != var83) {
                final SubLObject var85 = module0205.f13333(var84);
                if ((module0279.NIL == module0173.f10955(var85) || module0279.NIL == module0229.f15236(var85, (SubLObject)module0279.UNPROVIDED)) && module0279.NIL != module0035.f2428(var75, var84, var80, (SubLObject)module0279.UNPROVIDED)) {
                    var82 = var84;
                }
                var83 = var83.rest();
                var84 = var83.first();
            }
        }
        return var82;
    }
    
    public static SubLObject f18506(final SubLObject var75) {
        return module0202.f12768(module0279.$ic55$, f18507(module0205.f13132(var75)), var75);
    }
    
    public static SubLObject f18507(final SubLObject var84) {
        final SubLThread var85 = SubLProcess.currentSubLThread();
        if (module0279.NIL != module0107.f7629(module0285.$g2613$.getDynamicValue(var85))) {
            final SubLObject var86 = module0035.f2293(module0285.$g2613$.getDynamicValue(var85), var84, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED);
            if (module0279.NIL != var86) {
                return var86;
            }
        }
        return module0201.f12550(f18508((SubLObject)((module0279.NIL != module0173.f10955(var84)) ? module0166.f10743(var84) : module0279.$ic56$)));
    }
    
    public static SubLObject f18509(final SubLObject var75) {
        return module0202.f12768(module0279.$ic57$, module0201.f12550(f18508((SubLObject)((module0279.NIL != module0173.f10955(module0205.f13132(var75))) ? module0166.f10743(module0205.f13132(var75)) : module0279.$ic56$))), var75);
    }
    
    public static SubLObject f18510(final SubLObject var75) {
        return module0202.f12768(module0279.$ic58$, module0201.f12550(f18508((SubLObject)((module0279.NIL != module0173.f10955(module0205.f13132(var75))) ? module0166.f10743(module0205.f13132(var75)) : module0279.$ic56$))), var75);
    }
    
    public static SubLObject f18508(final SubLObject var41) {
        final SubLThread var42 = SubLProcess.currentSubLThread();
        final SubLObject var43 = f18511(var41, module0146.$g2030$.getDynamicValue(var42));
        if (module0279.NIL == module0004.f104(var43, module0146.$g2030$.getDynamicValue(var42), Symbols.symbol_function((SubLObject)module0279.$ic59$), (SubLObject)module0279.UNPROVIDED)) {
            module0146.$g2030$.setDynamicValue((SubLObject)ConsesLow.cons(var43, module0146.$g2030$.getDynamicValue(var42)), var42);
        }
        return var43;
    }
    
    public static SubLObject f18511(final SubLObject var87, final SubLObject var88) {
        SubLObject var89 = (SubLObject)module0279.NIL;
        SubLObject var90 = (SubLObject)module0279.NIL;
        SubLObject var91 = (SubLObject)module0279.NIL;
        SubLObject var92 = (SubLObject)module0279.NIL;
        var89 = (SubLObject)module0279.ZERO_INTEGER;
        var90 = (SubLObject)module0279.$ic60$;
        for (var91 = Sequences.cconcatenate(var87, var90), var92 = f18512(var91); module0279.NIL != module0004.f104(var92, var88, Symbols.symbol_function((SubLObject)module0279.$ic59$), (SubLObject)module0279.UNPROVIDED); var92 = f18512(var91)) {
            var89 = Numbers.add(var89, (SubLObject)module0279.ONE_INTEGER);
            var90 = PrintLow.format((SubLObject)module0279.NIL, (SubLObject)module0279.$ic61$, var89);
            var91 = Sequences.cconcatenate(var87, var90);
        }
        return var92;
    }
    
    public static SubLObject f18513(final SubLObject var92, SubLObject var93) {
        if (var93 == module0279.UNPROVIDED) {
            var93 = (SubLObject)module0279.$ic62$;
        }
        SubLObject var94;
        for (var94 = var93; module0279.NIL != module0205.f13220(var94, var92, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED); var94 = module0285.f19070(var94)) {}
        return var94;
    }
    
    public static SubLObject f18514(final SubLObject var92, SubLObject var95) {
        if (var95 == module0279.UNPROVIDED) {
            var95 = (SubLObject)module0279.NIL;
        }
        SubLObject var96;
        SubLObject var97;
        SubLObject var98;
        for (var96 = module0193.f12077(), var97 = (SubLObject)module0279.NIL, var97 = (SubLObject)module0279.ZERO_INTEGER; !var97.numGE(var96); var97 = module0048.f_1X(var97)) {
            var98 = module0193.f12079(var97);
            if (module0279.NIL == module0205.f13220(var98, var92, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED) && module0279.NIL == module0205.f13220(var98, var95, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED)) {
                return var98;
            }
        }
        return Errors.error((SubLObject)module0279.$ic63$, var92);
    }
    
    public static SubLObject f18512(final SubLObject var87) {
        return module0201.f12548(module0201.f12550(var87));
    }
    
    public static SubLObject f18515(final SubLObject var98) {
        final SubLThread var99 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL != var98 && module0279.NIL != ((module0146.$g2001$.getDynamicValue(var99) == module0279.$ic64$) ? module0201.f12580(var98) : Functions.funcall(module0146.$g2001$.getDynamicValue(var99), var98)));
    }
    
    public static SubLObject f18516(final SubLObject var62) {
        if (module0279.NIL == module0202.f12592(var62)) {
            return module0202.f12875(var62);
        }
        return (SubLObject)module0279.NIL;
    }
    
    public static SubLObject f18517(final SubLObject var62, SubLObject var100) {
        if (var100 == module0279.UNPROVIDED) {
            var100 = (SubLObject)module0279.$ic65$;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL != f18516(var62) && module0279.NIL != module0202.f12592(module0205.f13203(var62, (SubLObject)module0279.UNPROVIDED)) && module0279.NIL != Functions.funcall(var100, module0205.f13203(module0205.f13203(var62, (SubLObject)module0279.UNPROVIDED), (SubLObject)module0279.UNPROVIDED)));
    }
    
    public static SubLObject f18518(final SubLObject var62) {
        if (module0279.NIL != f18516(var62)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL != module0202.f12592(module0205.f13203(var62, (SubLObject)module0279.UNPROVIDED)) || module0279.NIL != module0202.f12670(module0205.f13203(var62, (SubLObject)module0279.UNPROVIDED)));
        }
        return (SubLObject)module0279.NIL;
    }
    
    public static SubLObject f18519(final SubLObject var62, SubLObject var100) {
        if (var100 == module0279.UNPROVIDED) {
            var100 = (SubLObject)module0279.$ic65$;
        }
        if (module0279.NIL != f18516(var62)) {
            return Functions.funcall(var100, module0205.f13203(var62, (SubLObject)module0279.UNPROVIDED));
        }
        return (SubLObject)module0279.NIL;
    }
    
    public static SubLObject f18520(final SubLObject var62) {
        final SubLThread var63 = SubLProcess.currentSubLThread();
        if (module0279.NIL != module0202.f12707(var62, (SubLObject)module0279.UNPROVIDED)) {
            if (module0279.NIL != module0146.$g2027$.getDynamicValue(var63) && module0279.NIL != module0202.f12590(var62) && module0279.NIL != module0202.f12628(module0205.f13136(var62)) && module0279.NIL != module0274.f18101(var62, (SubLObject)module0279.UNPROVIDED)) {
                return module0146.$g2027$.getDynamicValue(var63);
            }
            SubLObject var64 = (SubLObject)module0279.NIL;
            final SubLObject var62_103;
            final SubLObject var65 = var62_103 = ((module0279.NIL != module0202.f12707(var62, (SubLObject)module0279.UNPROVIDED)) ? module0202.f12712(var62) : var62);
            var64 = f18520(var62_103);
            return var64;
        }
        else {
            if (module0279.NIL != module0146.$g2027$.getDynamicValue(var63) && module0279.NIL != module0201.f12546(var62)) {
                return module0146.$g2027$.getDynamicValue(var63);
            }
            if (module0279.NIL != module0146.$g2028$.getDynamicValue(var63) && module0279.NIL != f18521(var62)) {
                return module0146.$g2028$.getDynamicValue(var63);
            }
            return (SubLObject)module0279.NIL;
        }
    }
    
    public static SubLObject f18522(final SubLObject var62, SubLObject var100) {
        if (var100 == module0279.UNPROVIDED) {
            var100 = (SubLObject)module0279.$ic65$;
        }
        if (module0279.NIL != module0202.f12707(var62, (SubLObject)module0279.UNPROVIDED)) {
            return module0202.f12643(module0279.$ic66$, var62);
        }
        if (module0279.NIL != Functions.funcall(var100, var62)) {
            return f18523(var62);
        }
        if (module0279.NIL != f18521(var62)) {
            return f18524(var62);
        }
        return var62;
    }
    
    public static SubLObject f18521(final SubLObject var62) {
        return (SubLObject)SubLObjectFactory.makeBoolean((module0279.NIL != f18525() && module0279.NIL == f18526() && ((module0279.NIL != module0202.f12604(var62) && (module0279.NIL == module0202.f12670(var62) || module0279.NIL == f18527())) || ((module0279.NIL != module0202.f12606(var62) || module0279.NIL != module0202.f12623(var62)) && (module0279.NIL != f18527() || module0279.NIL != module0202.f12670(var62))))) || (module0279.NIL != module0018.f979() && ((module0279.NIL != f18527() && (module0279.NIL != module0202.f12606(var62) || module0279.NIL != module0202.f12623(var62))) || (module0279.NIL == f18527() && module0279.NIL != module0202.f12604(var62)))));
    }
    
    public static SubLObject f18523(final SubLObject var40) {
        return module0202.f12643(module0279.$ic66$, var40);
    }
    
    public static SubLObject f18524(final SubLObject var62) {
        if (module0279.NIL != module0018.f979() && module0279.NIL != f18527() && module0279.NIL != module0202.f12625(var62)) {
            return f18528(var62);
        }
        if (module0279.NIL != f18527()) {
            return module0202.f12643(module0279.$ic66$, var62);
        }
        if (module0279.NIL != module0018.f979()) {
            return module0202.f12643(module0279.$ic66$, var62);
        }
        return f18528(var62);
    }
    
    public static SubLObject f18528(final SubLObject var62) {
        final SubLThread var63 = SubLProcess.currentSubLThread();
        SubLObject var64 = (SubLObject)module0279.NIL;
        final SubLObject var65 = module0146.$g2028$.currentBinding(var63);
        try {
            module0146.$g2028$.bind((SubLObject)module0279.NIL, var63);
            var64 = module0205.f13338(module0202.f12643(module0279.$ic66$, module0276.f18293(module0282.f18667(module0205.f13338(var62)), (SubLObject)module0279.UNPROVIDED)));
        }
        finally {
            module0146.$g2028$.rebind(var65, var63);
        }
        return var64;
    }
    
    public static SubLObject f18529(final SubLObject var62, SubLObject var2) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = (SubLObject)module0279.NIL;
        }
        assert module0279.NIL != module0202.f12590(var62) : var62;
        return f18530(module0205.f13136(var62), var2);
    }
    
    public static SubLObject f18530(final SubLObject var1, SubLObject var2) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = (SubLObject)module0279.NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0279.NIL != module0173.f10955(var1)) {
            SubLObject var4 = (SubLObject)module0279.NIL;
            final SubLObject var5 = var2;
            final SubLObject var6 = module0147.$g2094$.currentBinding(var3);
            final SubLObject var7 = module0147.$g2095$.currentBinding(var3);
            try {
                module0147.$g2094$.bind(module0147.f9531(var5), var3);
                module0147.$g2095$.bind(module0147.f9534(var5), var3);
                var4 = module0278.f18422(var1);
            }
            finally {
                module0147.$g2095$.rebind(var7, var3);
                module0147.$g2094$.rebind(var6, var3);
            }
            return var4;
        }
        return (SubLObject)module0279.NIL;
    }
    
    public static SubLObject f18527() {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        return module0146.$g2032$.getDynamicValue(var9);
    }
    
    public static SubLObject f18525() {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        return module0144.$g1801$.getDynamicValue(var9);
    }
    
    public static SubLObject f18531() {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        return module0144.$g1802$.getDynamicValue(var9);
    }
    
    public static SubLObject f18526() {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        return module0144.$g1803$.getDynamicValue(var9);
    }
    
    public static SubLObject f18532(final SubLObject var104, final SubLObject var105, SubLObject var2) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = (SubLObject)module0279.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL != module0173.f10955(var104) && module0279.NIL != module0173.f10955(var105) && (module0279.NIL != module0220.f14582(module0279.$ic68$, var104, var105, var2, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED) || module0279.NIL != module0220.f14582(module0279.$ic68$, var105, var104, var2, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED)));
    }
    
    public static SubLObject f18533(final SubLObject var106, SubLObject var2) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = (SubLObject)module0279.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean((module0279.NIL != module0173.f10955(var106) || module0279.NIL != module0210.f13598(var106)) && module0279.NIL != module0269.f17791(var106, var2));
    }
    
    public static SubLObject f18534(final SubLObject var107, SubLObject var2) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = (SubLObject)module0279.NIL;
        }
        final SubLThread var108 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL != module0202.f12590(var107) && module0279.NIL != ((module0279.NIL != module0146.$g2012$.getDynamicValue(var108)) ? SubLObjectFactory.makeBoolean(module0279.NIL != module0201.f12580(module0205.f13276(var107)) || module0279.NIL != f18533(module0205.f13276(var107), var2)) : SubLObjectFactory.makeBoolean(module0279.NIL != f18533(module0205.f13276(var107), var2) && module0279.NIL != module0210.f13618(var107))));
    }
    
    public static SubLObject f18535(final SubLObject var107, SubLObject var2) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = (SubLObject)module0279.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL != f18534(var107, var2) && module0279.NIL != module0274.f18172(var107, var2, (SubLObject)module0279.UNPROVIDED));
    }
    
    public static SubLObject f18536(final SubLObject var107) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL != module0173.f10955(var107) || module0279.NIL != f18534(var107, (SubLObject)module0279.UNPROVIDED) || module0279.NIL != module0210.f13588(var107));
    }
    
    public static SubLObject f18537(final SubLObject var107) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL == module0128.f8449(var107) && module0279.NIL != f18536(var107));
    }
    
    public static SubLObject f18538(final SubLObject var107) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL != f18537(var107) && module0279.NIL == module0167.f10813(var107) && module0279.NIL == module0172.f10921(var107));
    }
    
    public static SubLObject f18539(final SubLObject var107, SubLObject var100, SubLObject var2) {
        if (var100 == module0279.UNPROVIDED) {
            var100 = Symbols.symbol_function((SubLObject)module0279.$ic65$);
        }
        if (var2 == module0279.UNPROVIDED) {
            var2 = (SubLObject)module0279.NIL;
        }
        if (module0279.NIL != module0210.f13595(var107, var100)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL != f18534(var107, var2) || module0279.NIL != module0172.f10921(var107));
        }
        return (SubLObject)module0279.NIL;
    }
    
    public static SubLObject f18540(final SubLObject var107) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL != module0173.f10955(var107) || module0279.NIL != f18541(var107));
    }
    
    public static SubLObject f18542(final SubLObject var108) {
        return module0035.f2192((SubLObject)module0279.$ic69$, var108);
    }
    
    public static SubLObject f18541(final SubLObject var107) {
        if (module0279.NIL != module0210.f13593(var107, Symbols.symbol_function((SubLObject)module0279.$ic70$))) {
            return module0035.sublisp_boolean(module0172.f10921(var107));
        }
        return (SubLObject)module0279.NIL;
    }
    
    public static SubLObject f18543(final SubLObject var109, SubLObject var2) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = (SubLObject)module0279.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL != module0173.f10955(var109) && module0279.NIL != module0269.f17770(var109));
    }
    
    public static SubLObject f18544(final SubLObject var107, SubLObject var2) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = (SubLObject)module0279.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL != module0202.f12590(var107) && module0279.NIL != f18543(module0205.f13276(var107), var2));
    }
    
    public static SubLObject f18545(final SubLObject var110) {
        final SubLObject var111 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0279.$ic71$), module0232.f15306(var110));
        final SubLObject var112 = module0232.f15308(var110);
        return module0276.f18280(conses_high.nunion(var111, var112, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED), (SubLObject)module0279.UNPROVIDED);
    }
    
    public static SubLObject f18546(final SubLObject var113) {
        final SubLObject var114 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0279.$ic71$), module0232.f15306(var113));
        final SubLObject var115 = module0232.f15308(var113);
        return module0276.f18287(conses_high.nunion(var114, var115, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED), (SubLObject)module0279.UNPROVIDED);
    }
    
    public static SubLObject f18547(final SubLObject var114, final SubLObject var115, SubLObject var2, SubLObject var116) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        if (var116 == module0279.UNPROVIDED) {
            var116 = (SubLObject)module0279.$ic73$;
        }
        return f18548(var114, var115, var2, var116, (SubLObject)module0279.T, (SubLObject)module0279.T);
    }
    
    public static SubLObject f18549(final SubLObject var114, final SubLObject var115, SubLObject var2, SubLObject var116) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        if (var116 == module0279.UNPROVIDED) {
            var116 = (SubLObject)module0279.$ic73$;
        }
        final SubLThread var117 = SubLProcess.currentSubLThread();
        final SubLObject var118 = module0034.$g879$.getDynamicValue(var117);
        SubLObject var119 = (SubLObject)module0279.NIL;
        if (module0279.NIL == var118) {
            return f18547(var114, var115, var2, var116);
        }
        var119 = module0034.f1857(var118, (SubLObject)module0279.$ic72$, (SubLObject)module0279.UNPROVIDED);
        if (module0279.NIL == var119) {
            var119 = module0034.f1807(module0034.f1842(var118), (SubLObject)module0279.$ic72$, (SubLObject)module0279.FOUR_INTEGER, (SubLObject)module0279.NIL, (SubLObject)module0279.EQUAL, (SubLObject)module0279.UNPROVIDED);
            module0034.f1860(var118, (SubLObject)module0279.$ic72$, var119);
        }
        final SubLObject var120 = module0034.f1780(var114, var115, var2, var116);
        final SubLObject var121 = module0034.f1814(var119, var120, (SubLObject)module0279.UNPROVIDED);
        if (var121 != module0279.$ic30$) {
            SubLObject var122 = var121;
            SubLObject var123 = (SubLObject)module0279.NIL;
            var123 = var122.first();
            while (module0279.NIL != var122) {
                SubLObject var124 = var123.first();
                final SubLObject var125 = conses_high.second(var123);
                if (var114.equal(var124.first())) {
                    var124 = var124.rest();
                    if (var115.equal(var124.first())) {
                        var124 = var124.rest();
                        if (var2.equal(var124.first())) {
                            var124 = var124.rest();
                            if (module0279.NIL != var124 && module0279.NIL == var124.rest() && var116.equal(var124.first())) {
                                return module0034.f1959(var125);
                            }
                        }
                    }
                }
                var122 = var122.rest();
                var123 = var122.first();
            }
        }
        final SubLObject var126 = Values.arg2(var117.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f18547(var114, var115, var2, var116)));
        module0034.f1836(var119, var120, var121, var126, (SubLObject)ConsesLow.list(var114, var115, var2, var116));
        return module0034.f1959(var126);
    }
    
    public static SubLObject f18550(final SubLObject var122, final SubLObject var123, SubLObject var2) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        return f18551(var122, var123, var2, (SubLObject)module0279.$ic74$, (SubLObject)module0279.UNPROVIDED);
    }
    
    public static SubLObject f18552(final SubLObject var124, final SubLObject var125, SubLObject var126) {
        if (var126 == module0279.UNPROVIDED) {
            var126 = module0018.$g624$.getDynamicValue();
        }
        final SubLThread var127 = SubLProcess.currentSubLThread();
        SubLObject var128 = (SubLObject)module0279.NIL;
        final SubLObject var129 = module0018.$g624$.currentBinding(var127);
        try {
            module0018.$g624$.bind(var126, var127);
            var128 = (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL != module0331.f22370(var124, var125, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED) || module0279.NIL != module0331.f22370(module0205.f13144(var124), module0205.f13144(var125), (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED));
        }
        finally {
            module0018.$g624$.rebind(var129, var127);
        }
        return var128;
    }
    
    public static SubLObject f18551(final SubLObject var114, final SubLObject var115, SubLObject var2, SubLObject var116, SubLObject var127) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        if (var116 == module0279.UNPROVIDED) {
            var116 = (SubLObject)module0279.$ic73$;
        }
        if (var127 == module0279.UNPROVIDED) {
            var127 = (SubLObject)module0279.T;
        }
        return f18548(var114, var115, var2, var116, (SubLObject)module0279.NIL, var127);
    }
    
    public static SubLObject f18548(final SubLObject var114, final SubLObject var115, final SubLObject var2, final SubLObject var116, final SubLObject var128, final SubLObject var127) {
        assert module0279.NIL != module0204.f13042(var116) : var116;
        assert module0279.NIL != Types.booleanp(var128) : var128;
        if (module0279.NIL != module0331.f22370(var114, var115, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED)) {
            return (SubLObject)module0279.T;
        }
        if (module0279.NIL != module0174.f11035(var114)) {
            if (module0279.NIL != module0174.f11035(var115)) {
                return module0331.f22370(module0289.f19402(var114), module0289.f19402(var115), (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED);
            }
            if (module0279.NIL != module0202.f12590(var115)) {
                return f18548(module0289.f19402(var114), var115, var2, var116, var128, var127);
            }
        }
        else if (module0279.NIL != module0174.f11035(var115)) {
            if (module0279.NIL != module0202.f12590(var114)) {
                return f18548(var114, module0289.f19402(var115), var2, var116, var128, var127);
            }
        }
        else if (module0279.NIL != module0167.f10813(var114)) {
            if (module0279.NIL != module0202.f12659(var115)) {
                return f18548(module0172.f10915(var114), var115, var2, var116, var128, var127);
            }
        }
        else {
            if (module0279.NIL != module0167.f10813(var115) && module0279.NIL != module0202.f12659(var114)) {
                return f18548(var114, module0172.f10915(var115), var2, var116, var128, var127);
            }
            if (module0279.NIL != module0201.f12580(var114) && module0279.NIL != module0201.f12580(var115)) {
                return (SubLObject)module0279.T;
            }
            if (module0279.NIL != module0202.f12590(var114) && module0279.NIL != module0202.f12590(var115)) {
                return (SubLObject)((module0279.NIL != var127) ? f18553(var114, var115, var2, var116, var128) : module0279.NIL);
            }
        }
        return (SubLObject)module0279.NIL;
    }
    
    public static SubLObject f18553(final SubLObject var129, final SubLObject var130, SubLObject var2, SubLObject var116, SubLObject var128) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        if (var116 == module0279.UNPROVIDED) {
            var116 = (SubLObject)module0279.NIL;
        }
        if (var128 == module0279.UNPROVIDED) {
            var128 = (SubLObject)module0279.NIL;
        }
        final SubLObject var131 = f18554(var129, var2, var116, var128);
        final SubLObject var132 = f18554(var130, var2, var116, var128);
        if (module0279.NIL != module0202.f12590(var131) && module0279.NIL != module0202.f12590(var132)) {
            return f18555(module0235.f15481(module0035.f2076(Symbols.symbol_function((SubLObject)module0279.$ic53$), var131), module0035.f2076(Symbols.symbol_function((SubLObject)module0279.$ic53$), var132), (SubLObject)module0279.T, (SubLObject)module0279.UNPROVIDED));
        }
        final SubLObject var133 = (module0279.NIL != var128) ? module0285.f18879(var129, var2) : module0285.f18875(var129, var2);
        final SubLObject var134 = (module0279.NIL != var128) ? module0285.f18879(var130, var2) : module0285.f18875(var130, var2);
        return module0331.f22370(var133, var134, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED);
    }
    
    public static SubLObject f18554(final SubLObject var92, final SubLObject var2, final SubLObject var116, final SubLObject var128) {
        if (var116.eql((SubLObject)module0279.$ic73$)) {
            if (module0279.NIL != var128) {
                return module0285.f18899(var92, var2);
            }
            return module0285.f18874(var92, var2);
        }
        else {
            if (!var116.eql((SubLObject)module0279.$ic74$)) {
                return Errors.error((SubLObject)module0279.$ic77$, var116);
            }
            if (module0279.NIL != var128) {
                return module0285.f18903(var92, var2);
            }
            return module0285.f18906(var92, var2);
        }
    }
    
    public static SubLObject f18555(final SubLObject var135) {
        if (module0279.NIL != module0035.f1997(var135) && module0279.NIL != module0233.f15393(var135.first())) {
            return (SubLObject)module0279.T;
        }
        if (module0279.NIL == var135) {
            return (SubLObject)module0279.NIL;
        }
        if (module0279.NIL == module0035.f2439((SubLObject)module0279.$ic78$, var135, (SubLObject)module0279.UNPROVIDED)) {
            return (SubLObject)module0279.T;
        }
        return (SubLObject)module0279.NIL;
    }
    
    public static SubLObject f18556(final SubLObject var136, final SubLObject var137) {
        return f18557(var136, var137, (SubLObject)module0279.T);
    }
    
    public static SubLObject f18558(final SubLObject var114, final SubLObject var115) {
        return f18557(var114, var115, (SubLObject)module0279.NIL);
    }
    
    public static SubLObject f18557(SubLObject var114, SubLObject var115, final SubLObject var138) {
        if (var114.equal(var115)) {
            return (SubLObject)module0279.T;
        }
        if (module0279.NIL == module0035.f2439((SubLObject)module0279.$ic79$, var114, (SubLObject)module0279.UNPROVIDED)) {
            return (SubLObject)module0279.NIL;
        }
        if (module0279.NIL == module0035.f2439((SubLObject)module0279.$ic79$, var115, (SubLObject)module0279.UNPROVIDED)) {
            return (SubLObject)module0279.NIL;
        }
        final SubLObject var139 = module0036.f2531(var114, (SubLObject)module0279.$ic79$, (SubLObject)module0279.$ic80$, (SubLObject)module0279.UNPROVIDED);
        final SubLObject var140 = module0036.f2531(var115, (SubLObject)module0279.$ic79$, (SubLObject)module0279.$ic80$, (SubLObject)module0279.UNPROVIDED);
        if (var139.equal(var140)) {
            if (module0279.NIL != var138) {
                var114 = module0370.f25910(var114);
                var115 = module0370.f25910(var115);
            }
            return f18551(var114, var115, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED);
        }
        return (SubLObject)module0279.NIL;
    }
    
    public static SubLObject f18559(SubLObject var141) {
        if (var141 == module0279.UNPROVIDED) {
            var141 = (SubLObject)module0279.NIL;
        }
        return (SubLObject)module0279.$ic81$;
    }
    
    public static SubLObject f18560(final SubLObject var72) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL != var72 && module0279.NIL != module0202.f12691(var72, (SubLObject)module0279.UNPROVIDED));
    }
    
    public static SubLObject f18561(final SubLObject var142) {
        final SubLThread var143 = SubLProcess.currentSubLThread();
        assert module0279.NIL != module0035.f2015(var142) : var142;
        SubLObject var144 = (SubLObject)module0279.NIL;
        final SubLObject var146;
        final SubLObject var145 = var146 = module0034.f1854((SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED);
        final SubLObject var147 = module0034.$g879$.currentBinding(var143);
        try {
            module0034.$g879$.bind(var146, var143);
            SubLObject var148 = (SubLObject)module0279.NIL;
            if (module0279.NIL != var146 && module0279.NIL == module0034.f1842(var146)) {
                var148 = module0034.f1869(var146);
                final SubLObject var149 = Threads.current_process();
                if (module0279.NIL == var148) {
                    module0034.f1873(var146, var149);
                }
                else if (!var148.eql(var149)) {
                    Errors.error((SubLObject)module0279.$ic83$);
                }
            }
            try {
                SubLObject var150 = var142;
                SubLObject var151 = (SubLObject)module0279.NIL;
                var151 = var150.first();
                while (module0279.NIL != var150) {
                    if (module0279.NIL != module0205.f13155(var151)) {
                        var144 = Sequences.delete(var151, var144, (SubLObject)module0279.$ic72$, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED);
                        var144 = (SubLObject)ConsesLow.cons(var151, var144);
                    }
                    else {
                        final SubLObject var152 = var151;
                        if (module0279.NIL == conses_high.member(var152, var144, (SubLObject)module0279.$ic72$, Symbols.symbol_function((SubLObject)module0279.IDENTITY))) {
                            var144 = (SubLObject)ConsesLow.cons(var152, var144);
                        }
                    }
                    var150 = var150.rest();
                    var151 = var150.first();
                }
            }
            finally {
                final SubLObject var12_148 = Threads.$is_thread_performing_cleanupP$.currentBinding(var143);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0279.T, var143);
                    if (module0279.NIL != var146 && module0279.NIL == var148) {
                        module0034.f1873(var146, (SubLObject)module0279.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var12_148, var143);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var147, var143);
        }
        return Sequences.nreverse(var144);
    }
    
    public static SubLObject f18562(final SubLObject var149, final SubLObject var150, SubLObject var100) {
        if (var100 == module0279.UNPROVIDED) {
            var100 = Symbols.symbol_function((SubLObject)module0279.$ic70$);
        }
        return Equality.equal(module0285.f18932(module0285.f19030(module0285.f18939(var149), var100), (SubLObject)module0279.UNPROVIDED).first(), module0285.f18932(module0285.f19030(module0285.f18939(var150), var100), (SubLObject)module0279.UNPROVIDED).first());
    }
    
    public static SubLObject f18563(final SubLObject var149, final SubLObject var150, SubLObject var100) {
        if (var100 == module0279.UNPROVIDED) {
            var100 = Symbols.symbol_function((SubLObject)module0279.$ic70$);
        }
        return Equality.equal(module0285.f18932(module0285.f19030(var149, var100), var100).first(), module0285.f18932(module0285.f19030(var150, var100), var100).first());
    }
    
    public static SubLObject f18564(final SubLObject var149, final SubLObject var150, SubLObject var100) {
        if (var100 == module0279.UNPROVIDED) {
            var100 = Symbols.symbol_function((SubLObject)module0279.$ic70$);
        }
        return Equality.equal(module0285.f18932(module0285.f18939(var149), var100).first(), module0285.f18932(module0285.f18939(var150), var100).first());
    }
    
    public static SubLObject f18565(final SubLObject var149, final SubLObject var150) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL != f18566(module0232.f15306(var149), module0232.f15306(var150)) && module0279.NIL != f18566(module0232.f15308(var149), module0232.f15308(var150)));
    }
    
    public static SubLObject f18566(final SubLObject var151, final SubLObject var152) {
        return (SubLObject)SubLObjectFactory.makeBoolean(Sequences.length(var151).numE(Sequences.length(var152)) && module0279.NIL != f18567(var151, var152) && module0279.NIL != f18567(var152, var151));
    }
    
    public static SubLObject f18567(final SubLObject var151, final SubLObject var152) {
        SubLObject var153;
        SubLObject var154;
        SubLObject var155;
        SubLObject var156;
        SubLObject var157;
        for (var153 = (SubLObject)module0279.NIL, var154 = (SubLObject)module0279.NIL, var155 = (SubLObject)module0279.NIL, var156 = (SubLObject)module0279.NIL, var157 = (SubLObject)module0279.NIL, var154 = var151, var155 = var152, var156 = var154.first(), var157 = var155.first(); module0279.NIL == var153 && module0279.NIL != var156 && module0279.NIL != var157; var153 = (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL == module0235.f15475(var156, var157, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED)), var154 = var154.rest(), var155 = var155.rest(), var156 = var154.first(), var157 = var155.first()) {}
        return (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL == var153);
    }
    
    public static SubLObject f18568(final SubLObject var158) {
        final SubLThread var159 = SubLProcess.currentSubLThread();
        SubLObject var160 = module0285.f18992(var158, (SubLObject)module0279.T, (SubLObject)module0279.NIL, (SubLObject)module0279.UNPROVIDED);
        if (module0279.NIL != module0167.f10813(var160)) {
            return var160;
        }
        if (module0279.NIL != f18569()) {
            final SubLObject var161 = module0018.$g580$.currentBinding(var159);
            try {
                module0018.$g580$.bind((SubLObject)module0279.$ic84$, var159);
                var160 = module0172.f10921(var160);
            }
            finally {
                module0018.$g580$.rebind(var161, var159);
            }
            return var160;
        }
        return (SubLObject)module0279.NIL;
    }
    
    public static SubLObject f18570(final SubLObject var72) {
        if (module0279.NIL != module0202.f12659(var72)) {
            final SubLObject var73 = f18568(var72);
            if (module0279.NIL != module0167.f10813(var73)) {
                return var73;
            }
        }
        return (SubLObject)module0279.NIL;
    }
    
    public static SubLObject f18571(final SubLObject var161, final SubLObject var162) {
        return Equality.equal(f18572(var161), var162);
    }
    
    public static SubLObject f18572(final SubLObject var159) {
        final SubLThread var160 = SubLProcess.currentSubLThread();
        if (module0279.NIL != module0146.$g2010$.getDynamicValue(var160)) {
            return var159;
        }
        SubLObject var161 = (SubLObject)module0279.NIL;
        final SubLObject var162 = module0146.$g2010$.currentBinding(var160);
        try {
            module0146.$g2010$.bind((SubLObject)module0279.T, var160);
            var161 = module0285.f18875(var159, (SubLObject)module0279.UNPROVIDED);
        }
        finally {
            module0146.$g2010$.rebind(var162, var160);
        }
        if (module0279.NIL != module0167.f10813(var161)) {
            return module0172.f10915(var161);
        }
        return var161;
    }
    
    public static SubLObject f18569() {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (module0279.$ic64$ == module0146.$g2009$.getDynamicValue(var9)) {
            return (SubLObject)module0279.NIL;
        }
        return module0146.$g2009$.getDynamicValue(var9);
    }
    
    public static SubLObject f18573(final SubLObject var163) {
        final SubLThread var164 = SubLProcess.currentSubLThread();
        assert module0279.NIL != module0035.f2015(var163) : var163;
        SubLObject var165 = var163;
        SubLObject var166 = (SubLObject)module0279.NIL;
        var166 = var165.first();
        while (module0279.NIL != var165) {
            assert module0279.NIL != module0173.f10955(var166) : var166;
            var165 = var165.rest();
            var166 = var165.first();
        }
        SubLObject var167 = (SubLObject)module0279.NIL;
        final SubLObject var168 = module0146.$g1985$.currentBinding(var164);
        try {
            module0146.$g1985$.bind((SubLObject)module0279.T, var164);
            var167 = module0205.f13207(module0285.f18875(reader.bq_cons(module0279.$ic86$, ConsesLow.append(var163, (SubLObject)module0279.NIL)), (SubLObject)module0279.UNPROVIDED), (SubLObject)module0279.UNPROVIDED);
        }
        finally {
            module0146.$g1985$.rebind(var168, var164);
        }
        return var167;
    }
    
    public static SubLObject f18574(final SubLObject var76) {
        SubLObject var77 = (SubLObject)module0279.NIL;
        SubLObject var78 = (SubLObject)module0279.NIL;
        SubLObject var79 = (SubLObject)module0279.NIL;
        SubLObject var80 = var76;
        SubLObject var81 = (SubLObject)module0279.NIL;
        var81 = var80.first();
        while (module0279.NIL != var80) {
            if (module0279.NIL != module0202.f12859(var81)) {
                var77 = (SubLObject)ConsesLow.cons(var81, var77);
            }
            else if (module0279.NIL != module0202.f12864(var81)) {
                var77 = (SubLObject)ConsesLow.cons(var81, var77);
            }
            else if (module0279.NIL != module0202.f12869(var81)) {
                var77 = (SubLObject)ConsesLow.cons(var81, var77);
            }
            else if (module0279.NIL != module0202.f12865(var81)) {
                var78 = (SubLObject)ConsesLow.cons(var81, var78);
            }
            else if (module0279.NIL != module0202.f12870(var81)) {
                var78 = (SubLObject)ConsesLow.cons(var81, var78);
            }
            else {
                var79 = (SubLObject)ConsesLow.cons(var81, var79);
            }
            var80 = var80.rest();
            var81 = var80.first();
        }
        return ConsesLow.nconc(Sequences.nreverse(var77), Sequences.nreverse(var78), Sequences.nreverse(var79));
    }
    
    public static SubLObject f18575(final SubLObject var62) {
        return module0036.f2547(var62, (SubLObject)module0279.$ic87$, (SubLObject)module0279.$ic88$, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED);
    }
    
    public static SubLObject f18576(final SubLObject var169, final SubLObject var2) {
        return f18577(var169, var2, (SubLObject)module0279.T);
    }
    
    public static SubLObject f18578(final SubLObject var169, SubLObject var2) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = (SubLObject)module0279.NIL;
        }
        return f18577(var169, var2, (SubLObject)module0279.NIL);
    }
    
    public static SubLObject f18579(final SubLObject var169, SubLObject var2) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = (SubLObject)module0279.NIL;
        }
        return f18580(var169, var2, (SubLObject)module0279.T);
    }
    
    public static SubLObject f18581(final SubLObject var169, SubLObject var2) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = (SubLObject)module0279.NIL;
        }
        return f18580(var169, var2, (SubLObject)module0279.NIL);
    }
    
    public static SubLObject f18580(SubLObject var169, SubLObject var2, final SubLObject var170) {
        final SubLThread var171 = SubLProcess.currentSubLThread();
        final SubLObject var172 = var2;
        var171.resetMultipleValues();
        final SubLObject var172_173 = f18577(var169, var2, var170);
        final SubLObject var174_175 = var171.secondMultipleValue();
        var171.resetMultipleValues();
        var169 = var172_173;
        var2 = var174_175;
        if (module0279.NIL == module0161.f10513(var172, var2)) {
            var2 = module0285.f18914(var2);
        }
        return Values.values(var169, var2);
    }
    
    public static SubLObject f18577(SubLObject var169, SubLObject var2, final SubLObject var170) {
        final SubLThread var171 = SubLProcess.currentSubLThread();
        var171.resetMultipleValues();
        final SubLObject var176_177 = f18582(var169, var2);
        final SubLObject var178_179 = var171.secondMultipleValue();
        var171.resetMultipleValues();
        var169 = var176_177;
        var2 = var178_179;
        if (module0279.NIL != var170 && module0279.NIL == Errors.$ignore_mustsP$.getDynamicValue(var171) && module0279.NIL == var2) {
            Errors.error((SubLObject)module0279.$ic89$, var169, var2);
        }
        return Values.values(var169, var2);
    }
    
    public static SubLObject f18582(final SubLObject var169, final SubLObject var2) {
        if (module0279.NIL != module0202.f12883(var169, (SubLObject)module0279.UNPROVIDED) && module0279.NIL != module0161.f10485(module0205.f13379(var169, (SubLObject)module0279.UNPROVIDED))) {
            return f18582(module0205.f13380(var169, (SubLObject)module0279.UNPROVIDED), module0205.f13379(var169, (SubLObject)module0279.UNPROVIDED));
        }
        return Values.values(var169, var2);
    }
    
    public static SubLObject f18583(final SubLObject var72) {
        return module0206.f13486(f18584(var72));
    }
    
    public static SubLObject f18584(final SubLObject var92) {
        if (module0279.NIL != module0206.f13470(var92)) {
            return f18584(module0205.f13203(var92, (SubLObject)module0279.UNPROVIDED));
        }
        return var92;
    }
    
    public static SubLObject f18585(final SubLObject var72) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL != module0206.f13472(var72) && module0279.NIL != module0205.f13145(Symbols.symbol_function((SubLObject)module0279.$ic90$), var72, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED));
    }
    
    public static SubLObject f18586(final SubLObject var107) {
        return (module0279.NIL != module0206.f13473(var107)) ? var107 : module0202.f12643(module0279.$ic91$, var107);
    }
    
    public static SubLObject f18587(final SubLObject var72, SubLObject var180) {
        if (var180 == module0279.UNPROVIDED) {
            var180 = (SubLObject)module0279.NIL;
        }
        if (module0279.NIL == module0205.f13145((SubLObject)module0279.$ic92$, var72, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED)) {
            return var72;
        }
        if (module0279.NIL != var180) {
            return f18493(var72);
        }
        return f18588(var72);
    }
    
    public static SubLObject f18588(final SubLObject var72) {
        return f18493(conses_high.copy_tree(var72));
    }
    
    public static SubLObject f18493(final SubLObject var72) {
        if (module0279.NIL != module0206.f13472(var72)) {
            return module0035.f2425(var72, (SubLObject)module0279.$ic90$, (SubLObject)module0279.$ic93$, (SubLObject)module0279.UNPROVIDED);
        }
        if (var72.isCons()) {
            return ConsesLow.rplacd(ConsesLow.rplaca(var72, f18493(var72.first())), (module0279.NIL != module0035.f2015(var72)) ? module0035.f2076((SubLObject)module0279.$ic94$, var72.rest()) : f18493(var72.rest()));
        }
        return var72;
    }
    
    public static SubLObject f18589(final SubLObject var181) {
        return module0035.f2370((SubLObject)module0279.$ic95$, var181, (SubLObject)module0279.UNPROVIDED);
    }
    
    public static SubLObject f18590(final SubLObject var69) {
        SubLObject var70;
        SubLObject var71;
        SubLObject var72;
        for (var70 = (SubLObject)module0279.NIL, var71 = (SubLObject)module0279.NIL, var71 = module0232.f15306(var69); module0279.NIL == var70 && module0279.NIL != var71; var71 = var71.rest()) {
            var72 = var71.first();
            if (module0279.NIL == module0226.f14824(var72)) {
                var70 = (SubLObject)module0279.T;
            }
        }
        for (var71 = (SubLObject)module0279.NIL, var71 = module0232.f15308(var69); module0279.NIL == var70 && module0279.NIL != var71; var71 = var71.rest()) {
            var72 = var71.first();
            if (module0279.NIL == module0226.f14824(var72)) {
                var70 = (SubLObject)module0279.T;
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL == var70);
    }
    
    public static SubLObject f18591(final SubLObject var181) {
        if (module0279.NIL == module0206.f13427(var181)) {
            return module0035.f2370((SubLObject)module0279.$ic96$, var181, (SubLObject)module0279.UNPROVIDED);
        }
        return (SubLObject)module0279.NIL;
    }
    
    public static SubLObject f18592(final SubLObject var69) {
        SubLObject var70;
        SubLObject var71;
        SubLObject var72;
        for (var70 = (SubLObject)module0279.NIL, var71 = (SubLObject)module0279.NIL, var71 = module0232.f15306(var69); module0279.NIL == var70 && module0279.NIL != var71; var71 = var71.rest()) {
            var72 = var71.first();
            if (module0279.NIL == f18593(var72)) {
                var70 = (SubLObject)module0279.T;
            }
        }
        for (var71 = (SubLObject)module0279.NIL, var71 = module0232.f15308(var69); module0279.NIL == var70 && module0279.NIL != var71; var71 = var71.rest()) {
            var72 = var71.first();
            if (module0279.NIL == f18593(var72)) {
                var70 = (SubLObject)module0279.T;
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL == var70);
    }
    
    public static SubLObject f18593(final SubLObject var72) {
        return module0205.f13334(var72, (SubLObject)module0279.$ic97$);
    }
    
    public static SubLObject f18594(final SubLObject var62, final SubLObject var7) {
        final SubLThread var63 = SubLProcess.currentSubLThread();
        if (module0279.NIL != module0205.f13133(var62, var7)) {
            final SubLObject var64 = module0205.f13134(var62, var7, (SubLObject)module0279.UNPROVIDED);
            final SubLObject var65 = module0279.$g2614$.getDynamicValue(var63);
            if (module0279.NIL != module0035.f2428(var65, var64, Symbols.symbol_function((SubLObject)module0279.EQUAL), (SubLObject)module0279.UNPROVIDED)) {
                f18595(var65, var62);
            }
            return (SubLObject)module0279.T;
        }
        return (SubLObject)module0279.NIL;
    }
    
    public static SubLObject f18595(final SubLObject var107, final SubLObject var62) {
        return Dynamic.sublisp_throw((SubLObject)module0279.$ic99$, var62);
    }
    
    public static SubLObject f18596(final SubLObject var62, final SubLObject var107, SubLObject var188) {
        if (var188 == module0279.UNPROVIDED) {
            var188 = (SubLObject)module0279.NIL;
        }
        final SubLThread var189 = SubLProcess.currentSubLThread();
        assert module0279.NIL != module0206.f13486(var62) : var62;
        SubLObject var190 = (SubLObject)module0279.NIL;
        try {
            var189.throwStack.push(module0279.$ic99$);
            final SubLObject var191 = module0279.$g2614$.currentBinding(var189);
            final SubLObject var192 = module0205.$g2314$.currentBinding(var189);
            try {
                module0279.$g2614$.bind(var107, var189);
                module0205.$g2314$.bind((SubLObject)module0279.$ic98$, var189);
                module0205.f13220(var107, var62, var188, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED);
            }
            finally {
                module0205.$g2314$.rebind(var192, var189);
                module0279.$g2614$.rebind(var191, var189);
            }
        }
        catch (Throwable var193) {
            var190 = Errors.handleThrowable(var193, (SubLObject)module0279.$ic99$);
        }
        finally {
            var189.throwStack.pop();
        }
        return module0035.sublisp_boolean(var190);
    }
    
    public static SubLObject f18597(final SubLObject var63, final SubLObject var107, SubLObject var188) {
        if (var188 == module0279.UNPROVIDED) {
            var188 = (SubLObject)module0279.NIL;
        }
        final SubLThread var189 = SubLProcess.currentSubLThread();
        assert module0279.NIL != module0174.f11035(var63) : var63;
        SubLObject var190 = (SubLObject)module0279.NIL;
        try {
            var189.throwStack.push(module0279.$ic99$);
            final SubLObject var191 = module0279.$g2614$.currentBinding(var189);
            final SubLObject var192 = module0205.$g2314$.currentBinding(var189);
            try {
                module0279.$g2614$.bind(var107, var189);
                module0205.$g2314$.bind((SubLObject)module0279.$ic98$, var189);
                module0205.f13222(var107, var63, var188, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED);
            }
            finally {
                module0205.$g2314$.rebind(var192, var189);
                module0279.$g2614$.rebind(var191, var189);
            }
        }
        catch (Throwable var193) {
            var190 = Errors.handleThrowable(var193, (SubLObject)module0279.$ic99$);
        }
        finally {
            var189.throwStack.pop();
        }
        return module0035.sublisp_boolean(var190);
    }
    
    public static SubLObject f18598(final SubLObject var189, final SubLObject var107, SubLObject var188) {
        if (var188 == module0279.UNPROVIDED) {
            var188 = (SubLObject)module0279.NIL;
        }
        assert module0279.NIL != module0179.f11424(var189) : var189;
        final SubLObject var190 = module0183.f11564(var189);
        return f18596(var190, var107, var188);
    }
    
    public static SubLObject f18599(final SubLObject var190, final SubLObject var107, SubLObject var188) {
        if (var188 == module0279.UNPROVIDED) {
            var188 = (SubLObject)module0279.NIL;
        }
        assert module0279.NIL != module0191.f11952(var190) : var190;
        final SubLObject var191 = module0191.f11971(var190);
        return f18596(var191, var107, var188);
    }
    
    public static SubLObject f18600(final SubLObject var191, final SubLObject var107, SubLObject var188) {
        if (var188 == module0279.UNPROVIDED) {
            var188 = (SubLObject)module0279.NIL;
        }
        if (module0279.NIL != module0174.f11035(var191)) {
            return f18597(var191, var107, var188);
        }
        if (module0279.NIL != module0179.f11424(var191)) {
            return f18598(var191, var107, var188);
        }
        return f18599(var191, var107, var188);
    }
    
    public static SubLObject f18601(final SubLObject var192, final SubLObject var107, SubLObject var188) {
        if (var188 == module0279.UNPROVIDED) {
            var188 = (SubLObject)module0279.NIL;
        }
        assert module0279.NIL != module0184.f11659(var192) : var192;
        final SubLObject var193 = module0188.f11781(var192);
        if (module0279.NIL != f18600(var193, var188, (SubLObject)module0279.UNPROVIDED)) {
            return (SubLObject)module0279.T;
        }
        SubLObject var194 = module0188.f11770(var192);
        SubLObject var195 = (SubLObject)module0279.NIL;
        var195 = var194.first();
        while (module0279.NIL != var194) {
            if (module0279.NIL != f18600(var195, var107, (SubLObject)module0279.UNPROVIDED)) {
                return (SubLObject)module0279.T;
            }
            var194 = var194.rest();
            var195 = var194.first();
        }
        return (SubLObject)module0279.NIL;
    }
    
    public static SubLObject f18602(final SubLObject var107, SubLObject var2) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = (SubLObject)module0279.NIL;
        }
        final SubLThread var108 = SubLProcess.currentSubLThread();
        assert module0279.NIL != module0212.f13762(var107) : var107;
        final SubLObject var109 = module0030.f1593(Symbols.symbol_function((SubLObject)module0279.$ic106$));
        SubLObject var110 = module0032.f1726((SubLObject)module0279.ZERO_INTEGER, var109);
        final SubLObject var111 = var2;
        final SubLObject var112 = module0147.$g2095$.currentBinding(var108);
        final SubLObject var113 = module0147.$g2094$.currentBinding(var108);
        final SubLObject var114 = module0147.$g2096$.currentBinding(var108);
        try {
            module0147.$g2095$.bind(module0147.f9545(var111), var108);
            module0147.$g2094$.bind(module0147.f9546(var111), var108);
            module0147.$g2096$.bind(module0147.f9549(var111), var108);
            if (module0279.NIL != module0158.f10282(var107, (SubLObject)module0279.NIL)) {
                final SubLObject var115 = module0158.f10283(var107, (SubLObject)module0279.NIL);
                SubLObject var116 = (SubLObject)module0279.NIL;
                final SubLObject var117 = (SubLObject)module0279.NIL;
                while (module0279.NIL == var116) {
                    final SubLObject var118 = module0052.f3695(var115, var117);
                    final SubLObject var119 = (SubLObject)SubLObjectFactory.makeBoolean(!var117.eql(var118));
                    if (module0279.NIL != var119) {
                        SubLObject var120 = (SubLObject)module0279.NIL;
                        try {
                            var120 = module0158.f10316(var118, (SubLObject)module0279.NIL, (SubLObject)module0279.NIL, (SubLObject)module0279.NIL);
                            SubLObject var16_196 = (SubLObject)module0279.NIL;
                            final SubLObject var17_197 = (SubLObject)module0279.NIL;
                            while (module0279.NIL == var16_196) {
                                final SubLObject var121 = module0052.f3695(var120, var17_197);
                                final SubLObject var19_198 = (SubLObject)SubLObjectFactory.makeBoolean(!var17_197.eql(var121));
                                if (module0279.NIL != var19_198 && module0279.NIL != module0158.f10284(var121, var118) && module0279.NIL != f18597(var121, var107, (SubLObject)module0279.NIL)) {
                                    var110 = module0032.f1736(var121, var110, var109);
                                }
                                var16_196 = (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL == var19_198);
                            }
                        }
                        finally {
                            final SubLObject var12_199 = Threads.$is_thread_performing_cleanupP$.currentBinding(var108);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0279.T, var108);
                                if (module0279.NIL != var120) {
                                    module0158.f10319(var120);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var12_199, var108);
                            }
                        }
                    }
                    var116 = (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL == var119);
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var114, var108);
            module0147.$g2094$.rebind(var113, var108);
            module0147.$g2095$.rebind(var112, var108);
        }
        return module0032.f1753(var110);
    }
    
    public static SubLObject f18603(final SubLObject var107) {
        return f18602(var107, module0279.$ic107$);
    }
    
    public static SubLObject f18604(final SubLObject var107, SubLObject var2) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = (SubLObject)module0279.NIL;
        }
        final SubLThread var108 = SubLProcess.currentSubLThread();
        assert module0279.NIL != module0212.f13762(var107) : var107;
        final SubLObject var109 = module0030.f1593(Symbols.symbol_function((SubLObject)module0279.$ic106$));
        SubLObject var110 = module0032.f1726((SubLObject)module0279.ZERO_INTEGER, var109);
        final SubLObject var111 = var2;
        final SubLObject var112 = module0147.$g2095$.currentBinding(var108);
        final SubLObject var113 = module0147.$g2094$.currentBinding(var108);
        final SubLObject var114 = module0147.$g2096$.currentBinding(var108);
        try {
            module0147.$g2095$.bind(module0147.f9545(var111), var108);
            module0147.$g2094$.bind(module0147.f9546(var111), var108);
            module0147.$g2096$.bind(module0147.f9549(var111), var108);
            if (module0279.NIL != module0158.f10282(var107, (SubLObject)module0279.NIL)) {
                final SubLObject var115 = module0158.f10283(var107, (SubLObject)module0279.NIL);
                SubLObject var116 = (SubLObject)module0279.NIL;
                final SubLObject var117 = (SubLObject)module0279.NIL;
                while (module0279.NIL == var116) {
                    final SubLObject var118 = module0052.f3695(var115, var117);
                    final SubLObject var119 = (SubLObject)SubLObjectFactory.makeBoolean(!var117.eql(var118));
                    if (module0279.NIL != var119) {
                        SubLObject var120 = (SubLObject)module0279.NIL;
                        try {
                            var120 = module0158.f10316(var118, (SubLObject)module0279.NIL, (SubLObject)module0279.NIL, (SubLObject)module0279.NIL);
                            SubLObject var16_201 = (SubLObject)module0279.NIL;
                            final SubLObject var17_202 = (SubLObject)module0279.NIL;
                            while (module0279.NIL == var16_201) {
                                final SubLObject var121 = module0052.f3695(var120, var17_202);
                                final SubLObject var19_203 = (SubLObject)SubLObjectFactory.makeBoolean(!var17_202.eql(var121));
                                if (module0279.NIL != var19_203 && module0279.NIL != module0158.f10284(var121, var118)) {
                                    SubLObject var122 = module0178.f11299(var121);
                                    SubLObject var123 = (SubLObject)module0279.NIL;
                                    var123 = var122.first();
                                    while (module0279.NIL != var122) {
                                        if (module0279.NIL != module0184.f11659(var123) && module0279.NIL != f18601(var123, var107, (SubLObject)module0279.NIL)) {
                                            var110 = module0032.f1736(var123, var110, var109);
                                        }
                                        var122 = var122.rest();
                                        var123 = var122.first();
                                    }
                                }
                                var16_201 = (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL == var19_203);
                            }
                        }
                        finally {
                            final SubLObject var12_204 = Threads.$is_thread_performing_cleanupP$.currentBinding(var108);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0279.T, var108);
                                if (module0279.NIL != var120) {
                                    module0158.f10319(var120);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var12_204, var108);
                            }
                        }
                    }
                    var116 = (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL == var119);
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var114, var108);
            module0147.$g2094$.rebind(var113, var108);
            module0147.$g2095$.rebind(var112, var108);
        }
        return module0032.f1753(var110);
    }
    
    public static SubLObject f18605(final SubLObject var107) {
        return f18604(var107, module0279.$ic107$);
    }
    
    public static SubLObject f18606(final SubLObject var169, final SubLObject var2, SubLObject var205) {
        if (var205 == module0279.UNPROVIDED) {
            var205 = (SubLObject)module0279.NIL;
        }
        assert module0279.NIL != module0206.f13486(var169) : var169;
        final SubLObject var206 = module0285.f18867(var169, var2);
        SubLObject var207 = (SubLObject)module0279.NIL;
        if (module0279.NIL != var205) {
            var207 = module0205.f13144(f18498(var206));
        }
        else {
            var207 = f18497(var206);
        }
        return module0289.f19419(var207, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED);
    }
    
    public static SubLObject f18607(final SubLObject var208, final SubLObject var209, SubLObject var2, SubLObject var210, SubLObject var211) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        if (var210 == module0279.UNPROVIDED) {
            var210 = (SubLObject)module0279.NIL;
        }
        if (var211 == module0279.UNPROVIDED) {
            var211 = (SubLObject)module0279.NIL;
        }
        final SubLThread var212 = SubLProcess.currentSubLThread();
        SubLObject var213 = (SubLObject)module0279.NIL;
        SubLObject var214 = (SubLObject)module0279.NIL;
        if (module0279.NIL == var210 || module0279.NIL == var211) {
            var212.resetMultipleValues();
            final SubLObject var214_215 = module0285.f18897(var208, var2);
            final SubLObject var216_217 = var212.secondMultipleValue();
            var212.resetMultipleValues();
            var210 = var214_215;
            var213 = var216_217;
            var212.resetMultipleValues();
            final SubLObject var218_219 = module0285.f18897(var209, var2);
            final SubLObject var220_221 = var212.secondMultipleValue();
            var212.resetMultipleValues();
            var211 = var218_219;
            var214 = var220_221;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL != f18608(var210, var211, (SubLObject)module0279.UNPROVIDED) && module0279.NIL != module0161.f10514(var213, var214));
    }
    
    public static SubLObject f18609(final SubLObject var122, final SubLObject var123, SubLObject var2, SubLObject var222, SubLObject var223) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        if (var222 == module0279.UNPROVIDED) {
            var222 = (SubLObject)module0279.NIL;
        }
        if (var223 == module0279.UNPROVIDED) {
            var223 = (SubLObject)module0279.NIL;
        }
        final SubLThread var224 = SubLProcess.currentSubLThread();
        SubLObject var225 = (SubLObject)module0279.NIL;
        SubLObject var226 = (SubLObject)module0279.NIL;
        if (module0279.NIL == var222 || module0279.NIL == var223) {
            var224.resetMultipleValues();
            final SubLObject var224_225 = module0285.f18909(var122, var2);
            final SubLObject var226_227 = var224.secondMultipleValue();
            var224.resetMultipleValues();
            var222 = var224_225;
            var225 = var226_227;
            var224.resetMultipleValues();
            final SubLObject var228_229 = module0285.f18909(var123, var2);
            final SubLObject var230_231 = var224.secondMultipleValue();
            var224.resetMultipleValues();
            var223 = var228_229;
            var226 = var230_231;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL != f18608(var222, var223, (SubLObject)module0279.UNPROVIDED) && module0279.NIL != module0161.f10514(var225, var226));
    }
    
    public static SubLObject f18610(final SubLObject var208, final SubLObject var209, SubLObject var2, SubLObject var210, SubLObject var211) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        if (var210 == module0279.UNPROVIDED) {
            var210 = (SubLObject)module0279.NIL;
        }
        if (var211 == module0279.UNPROVIDED) {
            var211 = (SubLObject)module0279.NIL;
        }
        final SubLThread var212 = SubLProcess.currentSubLThread();
        SubLObject var213 = (SubLObject)module0279.NIL;
        SubLObject var214 = (SubLObject)module0279.NIL;
        if (module0279.NIL == var210 || module0279.NIL == var211) {
            var212.resetMultipleValues();
            final SubLObject var232_233 = module0285.f18915(var208, var2);
            final SubLObject var234_235 = var212.secondMultipleValue();
            var212.resetMultipleValues();
            var210 = var232_233;
            var213 = var234_235;
            var212.resetMultipleValues();
            final SubLObject var236_237 = module0285.f18915(var209, var2);
            final SubLObject var238_239 = var212.secondMultipleValue();
            var212.resetMultipleValues();
            var211 = var236_237;
            var214 = var238_239;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL != f18608(var210, var211, (SubLObject)module0279.UNPROVIDED) && module0279.NIL != module0161.f10514(var213, var214));
    }
    
    public static SubLObject f18611(final SubLObject var208, final SubLObject var209, SubLObject var2, SubLObject var210, SubLObject var211) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        if (var210 == module0279.UNPROVIDED) {
            var210 = (SubLObject)module0279.NIL;
        }
        if (var211 == module0279.UNPROVIDED) {
            var211 = (SubLObject)module0279.NIL;
        }
        final SubLThread var212 = SubLProcess.currentSubLThread();
        SubLObject var213 = (SubLObject)module0279.NIL;
        SubLObject var214 = (SubLObject)module0279.NIL;
        if (module0279.NIL == var210 || module0279.NIL == var211) {
            var212.resetMultipleValues();
            final SubLObject var240_241 = module0285.f18915(var208, var2);
            final SubLObject var242_243 = var212.secondMultipleValue();
            var212.resetMultipleValues();
            var210 = var240_241;
            var213 = var242_243;
            var212.resetMultipleValues();
            final SubLObject var244_245 = module0285.f18915(var209, var2);
            final SubLObject var246_247 = var212.secondMultipleValue();
            var212.resetMultipleValues();
            var211 = var244_245;
            var214 = var246_247;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL != f18612(var210, var211, (SubLObject)module0279.UNPROVIDED) && module0279.NIL != module0161.f10514(var213, var214));
    }
    
    public static SubLObject f18608(final SubLObject var210, final SubLObject var211, SubLObject var80) {
        if (var80 == module0279.UNPROVIDED) {
            var80 = Symbols.symbol_function((SubLObject)module0279.EQUAL);
        }
        if (var210.isAtom() || var211.isAtom()) {
            return module0213.f14081(var210, var211);
        }
        return module0035.f2201(Mapping.mapcar(Symbols.symbol_function((SubLObject)module0279.$ic53$), var210), Mapping.mapcar(Symbols.symbol_function((SubLObject)module0279.$ic53$), var211), var80);
    }
    
    public static SubLObject f18612(final SubLObject var210, final SubLObject var211, SubLObject var80) {
        if (var80 == module0279.UNPROVIDED) {
            var80 = Symbols.symbol_function((SubLObject)module0279.EQUAL);
        }
        if (var210.isAtom() || var211.isAtom()) {
            return module0213.f14081(var210, var211);
        }
        final SubLObject var212 = module0205.f13188(var210, (SubLObject)module0279.$ic108$, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED);
        final SubLObject var213 = module0205.f13188(var211, (SubLObject)module0279.$ic108$, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED);
        final SubLObject var214 = Hashtables.make_hash_table((SubLObject)module0279.TEN_INTEGER, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED);
        if (!Sequences.length(var212).numE(Sequences.length(var213))) {
            return (SubLObject)module0279.NIL;
        }
        SubLObject var215 = var212;
        SubLObject var216 = (SubLObject)module0279.NIL;
        var216 = var215.first();
        while (module0279.NIL != var215) {
            SubLObject var217 = (SubLObject)module0279.NIL;
            SubLObject var3_253 = module0226.f15106(var216, (SubLObject)module0279.UNPROVIDED);
            SubLObject var218 = (SubLObject)module0279.NIL;
            var218 = var3_253.first();
            while (module0279.NIL != var3_253) {
                if (module0279.NIL == module0806.f51299(var218, var216, (SubLObject)module0279.NIL)) {
                    var217 = (SubLObject)ConsesLow.cons(module0035.f2457(module0178.f11303(var218), var216, (SubLObject)module0279.NIL), var217);
                }
                var3_253 = var3_253.rest();
                var218 = var3_253.first();
            }
            Hashtables.sethash(var216, var214, var217);
            var215 = var215.rest();
            var216 = var215.first();
        }
        var215 = var213;
        SubLObject var219 = (SubLObject)module0279.NIL;
        var219 = var215.first();
        while (module0279.NIL != var215) {
            SubLObject var217 = (SubLObject)module0279.NIL;
            SubLObject var3_254 = module0226.f15106(var219, (SubLObject)module0279.UNPROVIDED);
            SubLObject var218 = (SubLObject)module0279.NIL;
            var218 = var3_254.first();
            while (module0279.NIL != var3_254) {
                if (module0279.NIL == module0806.f51299(var218, var219, (SubLObject)module0279.NIL)) {
                    var217 = (SubLObject)ConsesLow.cons(module0035.f2457(module0178.f11303(var218), var219, (SubLObject)module0279.NIL), var217);
                }
                var3_254 = var3_254.rest();
                var218 = var3_254.first();
            }
            Hashtables.sethash(var219, var214, var217);
            var215 = var215.rest();
            var219 = var215.first();
        }
        var215 = module0035.f2475(var212, (SubLObject)module0279.UNPROVIDED);
        SubLObject var220 = (SubLObject)module0279.NIL;
        var220 = var215.first();
        while (module0279.NIL != var215) {
            SubLObject var221 = var211;
            SubLObject var222 = (SubLObject)module0279.NIL;
            SubLObject var223 = (SubLObject)module0279.NIL;
            SubLObject var255_261 = (SubLObject)module0279.NIL;
            SubLObject var224 = (SubLObject)module0279.NIL;
            SubLObject var251_263 = (SubLObject)module0279.NIL;
            var223 = var213;
            var255_261 = var223.first();
            var224 = var220;
            var251_263 = var224.first();
            while (module0279.NIL != var224 || module0279.NIL != var223) {
                if (module0279.NIL == module0035.f2170(var255_261, var222) && module0279.NIL != module0035.f2201(Hashtables.gethash(var251_263, var214, (SubLObject)module0279.UNPROVIDED), Hashtables.gethash(var255_261, var214, (SubLObject)module0279.UNPROVIDED), Symbols.symbol_function((SubLObject)module0279.EQUAL))) {
                    var222 = (SubLObject)ConsesLow.cons(var255_261, var222);
                    var221 = module0035.f2457(var221, var255_261, var251_263);
                }
                var223 = var223.rest();
                var255_261 = var223.first();
                var224 = var224.rest();
                var251_263 = var224.first();
            }
            if (module0279.NIL != module0035.f2201(Mapping.mapcar(Symbols.symbol_function((SubLObject)module0279.$ic53$), var210), Mapping.mapcar(Symbols.symbol_function((SubLObject)module0279.$ic53$), var221), var80)) {
                return (SubLObject)module0279.T;
            }
            var215 = var215.rest();
            var220 = var215.first();
        }
        return (SubLObject)module0279.NIL;
    }
    
    public static SubLObject f18613(final SubLObject var208, final SubLObject var209, SubLObject var2, SubLObject var80, SubLObject var264, SubLObject var265) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        if (var80 == module0279.UNPROVIDED) {
            var80 = Symbols.symbol_function((SubLObject)module0279.EQUAL);
        }
        if (var264 == module0279.UNPROVIDED) {
            var264 = (SubLObject)module0279.NIL;
        }
        if (var265 == module0279.UNPROVIDED) {
            var265 = (SubLObject)module0279.NIL;
        }
        final SubLThread var266 = SubLProcess.currentSubLThread();
        SubLObject var267 = (SubLObject)module0279.NIL;
        SubLObject var268 = (SubLObject)module0279.NIL;
        SubLObject var269 = (SubLObject)module0279.NIL;
        SubLObject var270 = (SubLObject)module0279.NIL;
        SubLObject var271 = (SubLObject)module0279.NIL;
        if (module0279.NIL != var264) {
            var268 = var208;
            var269 = var264;
        }
        else {
            var266.resetMultipleValues();
            final SubLObject var272 = module0285.f18898(var208, var2);
            final SubLObject var273 = var266.secondMultipleValue();
            final SubLObject var274 = var266.thirdMultipleValue();
            var266.resetMultipleValues();
            var268 = var272;
            var269 = var274;
        }
        if (module0279.NIL != var265) {
            var270 = var209;
            var271 = var265;
        }
        else {
            var266.resetMultipleValues();
            final SubLObject var272 = module0285.f18898(var209, var2);
            final SubLObject var273 = var266.secondMultipleValue();
            final SubLObject var274 = var266.thirdMultipleValue();
            var266.resetMultipleValues();
            var270 = var272;
            var271 = var274;
        }
        SubLObject var275 = var269;
        SubLObject var276 = (SubLObject)module0279.NIL;
        var276 = var275.first();
        while (module0279.NIL != var275) {
            var268 = conses_high.subst(var276.first(), var276.rest(), var268, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED);
            var275 = var275.rest();
            var276 = var275.first();
        }
        var275 = var271;
        var276 = (SubLObject)module0279.NIL;
        var276 = var275.first();
        while (module0279.NIL != var275) {
            var270 = conses_high.subst(var276.first(), var276.rest(), var270, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED);
            var275 = var275.rest();
            var276 = var275.first();
        }
        var267 = f18608(var268, var270, var80);
        return var267;
    }
    
    public static SubLObject f18614(final SubLObject var273, final SubLObject var62) {
        if (module0279.NIL != f18615(var273, var62, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED)) {
            return (SubLObject)module0279.T;
        }
        return (SubLObject)module0279.NIL;
    }
    
    public static SubLObject f18616(final SubLObject var62, SubLObject var2) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var63 = SubLProcess.currentSubLThread();
        SubLObject var64 = (SubLObject)module0279.NIL;
        SubLObject var65 = (SubLObject)module0279.NIL;
        var63.resetMultipleValues();
        final SubLObject var66 = module0285.f18898(var62, var2);
        final SubLObject var67 = var63.secondMultipleValue();
        final SubLObject var68 = var63.thirdMultipleValue();
        var63.resetMultipleValues();
        var64 = var66;
        var65 = var68;
        SubLObject var70;
        final SubLObject var69 = var70 = Sequences.remove_duplicates(Mapping.mapcar(Symbols.symbol_function((SubLObject)module0279.$ic53$), module0035.f2077(Symbols.symbol_function((SubLObject)module0279.$ic54$), var64)), (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED);
        SubLObject var71 = (SubLObject)module0279.NIL;
        var71 = var70.first();
        while (module0279.NIL != var70) {
            if (module0279.NIL != conses_high.rassoc(var71, var65, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED)) {
                var65 = Sequences.delete(var71, var65, Symbols.symbol_function((SubLObject)module0279.EQL), Symbols.symbol_function((SubLObject)module0279.$ic109$), (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED);
            }
            var70 = var70.rest();
            var71 = var70.first();
        }
        return Values.values(var64, var65);
    }
    
    public static SubLObject f18615(final SubLObject var72, final SubLObject var276, SubLObject var80, SubLObject var277) {
        if (var80 == module0279.UNPROVIDED) {
            var80 = Symbols.symbol_function((SubLObject)module0279.EQL);
        }
        if (var277 == module0279.UNPROVIDED) {
            var277 = Symbols.symbol_function((SubLObject)module0279.IDENTITY);
        }
        if (module0279.NIL != Functions.funcall(var80, var72, Functions.funcall(var277, var276))) {
            if (module0279.NIL != var276) {
                return var276;
            }
            return (SubLObject)module0279.T;
        }
        else {
            if (!var276.isCons()) {
                return (SubLObject)module0279.NIL;
            }
            final SubLObject var278 = f18615(var72, var276.first(), var80, var277);
            final SubLObject var279 = (SubLObject)((module0279.NIL != var278 || module0279.NIL == var276.rest()) ? module0279.NIL : f18615(var72, var276.rest(), var80, var277));
            if (module0279.NIL != var278) {
                return var278;
            }
            if (module0279.NIL != var279) {
                return var279;
            }
            return (SubLObject)module0279.NIL;
        }
    }
    
    public static SubLObject f18617(final SubLObject var72, final SubLObject var276, SubLObject var80, SubLObject var277, SubLObject var280) {
        if (var80 == module0279.UNPROVIDED) {
            var80 = Symbols.symbol_function((SubLObject)module0279.EQL);
        }
        if (var277 == module0279.UNPROVIDED) {
            var277 = Symbols.symbol_function((SubLObject)module0279.IDENTITY);
        }
        if (var280 == module0279.UNPROVIDED) {
            var280 = (SubLObject)module0279.NIL;
        }
        if (module0279.NIL != Functions.funcall(var80, var72, Functions.funcall(var277, var276))) {
            if (module0279.NIL != var276) {
                return (SubLObject)ConsesLow.cons(var276, var280);
            }
            return (SubLObject)ConsesLow.cons((SubLObject)module0279.T, var280);
        }
        else {
            if (var276.isCons()) {
                return (module0279.NIL == var276.rest()) ? f18617(var72, var276.first(), var80, var277, var280) : f18617(var72, var276.rest(), var80, var277, f18617(var72, var276.first(), var80, var277, var280));
            }
            return var280;
        }
    }
    
    public static SubLObject f18618(final SubLObject var281, final SubLObject var2) {
        final SubLThread var282 = SubLProcess.currentSubLThread();
        SubLObject var283 = (SubLObject)module0279.NIL;
        final SubLObject var284 = module0111.$g1406$.currentBinding(var282);
        try {
            module0111.$g1406$.bind((SubLObject)module0279.NIL, var282);
            if (module0279.NIL == module0538.f33333((SubLObject)module0279.$ic110$, var281, var2, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED)) {
                PrintLow.format((SubLObject)module0279.T, (SubLObject)module0279.$ic111$, var281);
            }
            else {
                final SubLObject var285 = module0288.f19345(var281, var2);
                if (module0279.NIL == var285) {
                    PrintLow.format((SubLObject)module0279.T, (SubLObject)module0279.$ic112$);
                }
                else {
                    final SubLObject var286 = module0289.f19396(var285);
                    module0538.f33333((SubLObject)module0279.$ic113$, var281, var2, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED);
                    var283 = var286;
                }
            }
        }
        finally {
            module0111.$g1406$.rebind(var284, var282);
        }
        return var283;
    }
    
    public static SubLObject f18619(final SubLObject var281, final SubLObject var2) {
        return f18620(var281, var2, (SubLObject)module0279.T, (SubLObject)module0279.UNPROVIDED);
    }
    
    public static SubLObject f18620(final SubLObject var281, final SubLObject var2, SubLObject var283, SubLObject var284) {
        if (var283 == module0279.UNPROVIDED) {
            var283 = (SubLObject)module0279.NIL;
        }
        if (var284 == module0279.UNPROVIDED) {
            var284 = (SubLObject)module0279.NIL;
        }
        final SubLThread var285 = SubLProcess.currentSubLThread();
        SubLObject var286 = (SubLObject)module0279.T;
        final SubLObject var287 = module0111.$g1406$.currentBinding(var285);
        try {
            module0111.$g1406$.bind((SubLObject)module0279.NIL, var285);
            if (module0279.NIL != var284) {
                PrintLow.format((SubLObject)module0279.T, (SubLObject)module0279.$ic114$, var281, var2);
            }
            if (module0279.NIL == module0538.f33333((SubLObject)module0279.$ic110$, var281, var2, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED)) {
                PrintLow.format((SubLObject)module0279.T, (SubLObject)module0279.$ic115$);
            }
            else {
                final SubLObject var288 = module0288.f19342(var281, var2);
                if (module0279.NIL == var288) {
                    PrintLow.format((SubLObject)module0279.T, (SubLObject)module0279.$ic116$, var281);
                }
                else {
                    SubLObject var289 = var288;
                    SubLObject var290 = (SubLObject)module0279.NIL;
                    var290 = var289.first();
                    while (module0279.NIL != var289) {
                        if (module0279.NIL != var284) {
                            PrintLow.format((SubLObject)module0279.T, (SubLObject)module0279.$ic117$, var290);
                        }
                        var285.resetMultipleValues();
                        final SubLObject var291 = module0289.f19396(var290);
                        final SubLObject var292 = var285.secondMultipleValue();
                        var285.resetMultipleValues();
                        if (module0279.NIL != var284) {
                            PrintLow.format((SubLObject)module0279.T, (SubLObject)module0279.$ic118$, var291, var292);
                        }
                        if (!var281.equal(var291) || !var2.equal(var292)) {
                            if (module0279.NIL != var283) {
                                var286 = (SubLObject)module0279.NIL;
                            }
                            else {
                                module0538.f33333((SubLObject)module0279.$ic113$, var281, var2, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED);
                                module0538.f33333((SubLObject)module0279.$ic110$, var291, var292, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED);
                                final SubLObject var46_286 = module0288.f19342(var291, var292);
                                if (module0279.NIL == var46_286) {
                                    PrintLow.format((SubLObject)module0279.T, (SubLObject)module0279.$ic119$, var291, var292);
                                }
                                else {
                                    SubLObject var293 = (SubLObject)module0279.NIL;
                                    if (module0279.NIL == var293) {
                                        SubLObject var294 = var46_286;
                                        SubLObject var295 = (SubLObject)module0279.NIL;
                                        var295 = var294.first();
                                        while (module0279.NIL == var293 && module0279.NIL != var294) {
                                            var285.resetMultipleValues();
                                            final SubLObject var296 = module0289.f19396(var295);
                                            final SubLObject var297 = var285.secondMultipleValue();
                                            var285.resetMultipleValues();
                                            if (module0279.NIL != var284) {
                                                PrintLow.format((SubLObject)module0279.T, (SubLObject)module0279.$ic120$, var296, var297);
                                            }
                                            if (!var291.equal(var296) || !var292.equal(var297)) {
                                                PrintLow.format((SubLObject)module0279.T, (SubLObject)module0279.$ic121$, var296, var291);
                                                var286 = (SubLObject)module0279.NIL;
                                                var293 = (SubLObject)module0279.T;
                                            }
                                            var294 = var294.rest();
                                            var295 = var294.first();
                                        }
                                    }
                                }
                                module0538.f33333((SubLObject)module0279.$ic113$, var291, var2, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED);
                            }
                        }
                        var289 = var289.rest();
                        var290 = var289.first();
                    }
                }
                module0538.f33333((SubLObject)module0279.$ic113$, var281, var2, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED);
            }
        }
        finally {
            module0111.$g1406$.rebind(var287, var285);
        }
        return var286;
    }
    
    public static SubLObject f18621(final SubLObject var291, final SubLObject var209, final SubLObject var2) {
        final SubLThread var292 = SubLProcess.currentSubLThread();
        SubLObject var293 = (SubLObject)module0279.NIL;
        final SubLObject var294 = module0111.$g1406$.currentBinding(var292);
        try {
            module0111.$g1406$.bind((SubLObject)module0279.NIL, var292);
            SubLObject var295 = var291;
            SubLObject var296 = (SubLObject)module0279.NIL;
            var296 = var295.first();
            while (module0279.NIL != var295) {
                if (module0279.NIL == module0538.f33333((SubLObject)module0279.$ic110$, var296, var2, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED)) {
                    PrintLow.format((SubLObject)module0279.T, (SubLObject)module0279.$ic122$, var296);
                }
                var295 = var295.rest();
                var296 = var295.first();
            }
            final SubLObject var297 = f18618(var209, var2);
            SubLObject var298 = var291;
            SubLObject var299 = (SubLObject)module0279.NIL;
            var299 = var298.first();
            while (module0279.NIL != var298) {
                if (module0279.NIL == module0538.f33333((SubLObject)module0279.$ic113$, var299, var2, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED)) {
                    PrintLow.format((SubLObject)module0279.T, (SubLObject)module0279.$ic123$, var299);
                }
                var298 = var298.rest();
                var299 = var298.first();
            }
            var293 = var297;
        }
        finally {
            module0111.$g1406$.rebind(var294, var292);
        }
        return var293;
    }
    
    public static SubLObject f18622(final SubLObject var62, SubLObject var2) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLObject var63 = module0285.f18868(var62, var2);
        return f18623(var63);
    }
    
    public static SubLObject f18624(final SubLObject var62, SubLObject var2) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLObject var63 = module0285.f18906(var62, var2);
        return f18623(var63);
    }
    
    public static SubLObject f18625(final SubLObject var62, SubLObject var2) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLObject var63 = module0285.f18870(var62, var2, (SubLObject)module0279.UNPROVIDED, (SubLObject)module0279.UNPROVIDED);
        return f18623(var63);
    }
    
    public static SubLObject f18626(final SubLObject var62, SubLObject var2) {
        if (var2 == module0279.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLObject var63 = module0285.f18912(var62, var2);
        return f18623(var63);
    }
    
    public static SubLObject f18623(final SubLObject var62) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0279.NIL == var62 || module0279.NIL != module0213.f14081(module0279.$ic124$, var62));
    }
    
    public static SubLObject f18627() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18436", "S#21058", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18437", "S#21059", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18438", "S#21060", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18440", "S#21061", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18439", "S#21062", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18441", "S#21063", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18442", "S#21064", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18443", "S#20878", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18444", "S#20877", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18445", "S#21065", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18446", "S#21066", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18447", "S#20648", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18448", "S#20651", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18449", "S#20880", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18450", "S#20644", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18451", "S#21067", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18452", "S#21068", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18453", "S#21069", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18456", "S#21070", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18457", "S#21071", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18458", "S#21072", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18454", "S#21073", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18459", "S#21074", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18460", "S#21075", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18461", "S#21076", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18455", "S#21077", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18462", "S#20879", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18465", "S#21078", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18466", "S#21079", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18467", "S#21080", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18463", "S#21081", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18468", "S#21082", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18469", "S#21083", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18470", "S#21084", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18464", "S#21085", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18471", "S#20881", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18474", "S#21086", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18475", "S#21087", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18476", "S#21088", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18472", "S#21089", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18477", "S#21090", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18478", "S#21091", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18479", "S#21092", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18473", "S#21093", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18480", "S#20645", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18481", "S#21094", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18482", "S#21095", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18483", "S#21096", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18484", "S#21097", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18485", "S#12584", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18486", "S#15532", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18487", "S#21098", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18488", "S#21099", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18489", "S#20497", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18491", "S#20498", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18490", "S#21100", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18492", "S#21101", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18494", "S#21102", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18495", "S#21103", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18496", "S#21104", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18497", "EXTRACT-EL-CLAUSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18498", "S#21105", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18499", "S#21106", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18500", "S#21107", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18501", "S#21108", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18502", "S#21109", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18503", "S#21110", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18504", "S#21111", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18505", "S#21112", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18506", "S#21113", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18507", "S#21114", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18509", "S#21115", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18510", "S#21116", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18508", "S#21117", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18511", "S#21118", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18513", "S#16713", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18514", "S#21119", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18512", "S#21120", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18515", "S#21041", 1, 0, false);
        new $f18515$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18516", "S#20873", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18517", "S#21121", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18518", "S#21122", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18519", "S#21123", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18520", "S#21124", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18522", "S#21125", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18521", "S#21126", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18523", "S#21127", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18524", "S#21128", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18528", "S#21129", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18529", "S#21130", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18530", "S#17989", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18527", "S#20649", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18525", "S#20874", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18531", "S#20875", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18526", "S#21131", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18532", "S#21132", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18533", "REIFIABLE-FUNCTOR?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18534", "REIFIABLE-FUNCTION-TERM?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18535", "S#21133", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18536", "S#16277", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18537", "S#21134", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18538", "S#21135", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18539", "S#12587", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18540", "S#21136", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18542", "S#21137", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18541", "S#12586", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18543", "S#21138", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18544", "S#21139", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18545", "S#21140", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18546", "S#21141", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18547", "S#21142", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18549", "S#15919", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18550", "S#21143", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18552", "S#21144", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18551", "EQUALS-EL?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18548", "S#21145", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18553", "S#21146", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18554", "S#21147", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18555", "S#21148", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18556", "S#21149", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18558", "S#21150", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18557", "S#21151", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18559", "S#21152", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18560", "S#21153", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18561", "S#21154", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18562", "S#21155", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18563", "S#21156", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18564", "S#21157", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18565", "S#21158", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18566", "S#21159", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18567", "S#21160", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18568", "EL-FIND-NART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18570", "S#16271", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18571", "S#21161", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18572", "S#21162", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18569", "S#21163", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18573", "S#21164", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18574", "S#21165", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18575", "S#20889", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18576", "S#16032", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18578", "UNWRAP-IF-IST-PERMISSIVE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18579", "S#21166", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18581", "S#21167", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18580", "S#21168", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18577", "S#21169", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18582", "S#21170", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18583", "S#21171", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18584", "S#21172", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18585", "S#21051", 1, 0, false);
        new $f18585$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18586", "S#21173", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18587", "S#13809", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18588", "S#21174", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18493", "S#21175", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18589", "S#21176", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18590", "S#21177", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18591", "S#21178", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18592", "S#21052", 1, 0, false);
        new $f18592$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18593", "S#21179", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18594", "S#21180", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18595", "S#21181", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18596", "S#21182", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18597", "S#21183", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18598", "S#21184", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18599", "S#21185", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18600", "S#21186", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18601", "S#21187", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18602", "S#21188", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18603", "S#21189", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18604", "S#21190", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18605", "S#21191", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18606", "S#21192", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18607", "CANON-EQUAL?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18609", "CANON-QUERY-EQUAL?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18610", "CANON-ASSERT-EQUAL?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18611", "CANON-ASSERT-ISOMORPHIC?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18608", "CANON-FORMS-EQUAL?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18612", "S#21193", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18613", "CANON-EQUAL-HL-NAMES?", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18614", "S#21194", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18616", "CANONICALIZE-AND-RETURN-SKOLEM-VARS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18615", "S#21195", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18617", "S#21196", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18618", "RETURN-UNCANON", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18619", "S#21197", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18620", "UNCANON-TEST", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18621", "ASSERT-RETURN-UNCANON", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18622", "S#21198", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18624", "S#21199", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18625", "S#21200", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18626", "S#21201", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0279", "f18623", "S#21202", 1, 0, false);
        return (SubLObject)module0279.NIL;
    }
    
    public static SubLObject f18628() {
        module0279.$g2606$ = SubLFiles.deflexical("S#21203", (SubLObject)module0279.NIL);
        module0279.$g2607$ = SubLFiles.deflexical("S#21204", (SubLObject)module0279.NIL);
        module0279.$g2608$ = SubLFiles.deflexical("S#21205", (SubLObject)module0279.NIL);
        module0279.$g2609$ = SubLFiles.deflexical("S#21206", (SubLObject)module0279.NIL);
        module0279.$g2610$ = SubLFiles.deflexical("S#21207", (SubLObject)module0279.NIL);
        module0279.$g2611$ = SubLFiles.deflexical("S#21208", (SubLObject)module0279.NIL);
        module0279.$g2612$ = SubLFiles.defparameter("S#21209", (SubLObject)module0279.NIL);
        module0279.$g2614$ = SubLFiles.defparameter("S#21210", (SubLObject)module0279.NIL);
        return (SubLObject)module0279.NIL;
    }
    
    public static SubLObject f18629() {
        module0034.f1909((SubLObject)module0279.$ic26$);
        module0034.f1909((SubLObject)module0279.$ic31$);
        module0034.f1909((SubLObject)module0279.$ic33$);
        module0034.f1909((SubLObject)module0279.$ic37$);
        module0034.f1909((SubLObject)module0279.$ic40$);
        module0034.f1909((SubLObject)module0279.$ic43$);
        module0034.f1895((SubLObject)module0279.$ic72$);
        module0012.f419((SubLObject)module0279.$ic80$);
        module0012.f419((SubLObject)module0279.$ic98$);
        return (SubLObject)module0279.NIL;
    }
    
    public void declareFunctions() {
        f18627();
    }
    
    public void initializeVariables() {
        f18628();
    }
    
    public void runTopLevelForms() {
        f18629();
    }
    
    static {
        me = (SubLFile)new module0279();
        module0279.$g2606$ = null;
        module0279.$g2607$ = null;
        module0279.$g2608$ = null;
        module0279.$g2609$ = null;
        module0279.$g2610$ = null;
        module0279.$g2611$ = null;
        module0279.$g2612$ = null;
        module0279.$g2614$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic1$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("canonicalizerDirectiveForArg"));
        $ic2$ = SubLObjectFactory.makeKeyword("GAF");
        $ic3$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("canonicalizerDirectiveForArgAndRest"));
        $ic4$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("canonicalizerDirectiveForAllArgs"));
        $ic5$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("LeaveSomeTermsAtEL"));
        $ic6$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("LeaveVariablesAtEL")));
        $ic7$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("LeaveSomeTermsAtELAndAllowKeywordVariables"));
        $ic8$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("LeaveSomeTermsAtEL")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("AllowKeywordVariables")));
        $ic9$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("AllowKeywordVariables"));
        $ic10$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("AllowGenericArgVariables")));
        $ic11$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("LeaveVariablesAtEL"));
        $ic12$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("LeaveSomeTermsAtEL")));
        $ic13$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("LeaveSomeTermsAtELAndAllowKeywordVariables")));
        $ic14$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("AllowGenericArgVariables"));
        $ic15$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("AllowKeywordVariables")));
        $ic16$ = SubLObjectFactory.makeKeyword("EL-VAR");
        $ic17$ = SubLObjectFactory.makeString("X-~d");
        $ic18$ = SubLObjectFactory.makeKeyword("KB-VAR");
        $ic19$ = SubLObjectFactory.makeString("~a was not a canonical variable");
        $ic20$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("RelaxArgTypeConstraintsForVariables"));
        $ic21$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("DontReOrderCommutativeTerms"));
        $ic22$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycLIndexedTerm"));
        $ic23$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycLExpression"));
        $ic24$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycLExpression-Assertible"));
        $ic25$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycLExpression-Askable"));
        $ic26$ = SubLObjectFactory.makeSymbol("S#21073", "CYC");
        $ic27$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycLFormula"));
        $ic28$ = SubLObjectFactory.makeSymbol("S#21203", "CYC");
        $ic29$ = SubLObjectFactory.makeInteger(1024);
        $ic30$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic31$ = SubLObjectFactory.makeSymbol("S#21077", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("S#21204", "CYC");
        $ic33$ = SubLObjectFactory.makeSymbol("S#21081", "CYC");
        $ic34$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycLSentence"));
        $ic35$ = SubLObjectFactory.makeSymbol("S#21205", "CYC");
        $ic36$ = SubLObjectFactory.makeSymbol("S#21078", "CYC");
        $ic37$ = SubLObjectFactory.makeSymbol("S#21085", "CYC");
        $ic38$ = SubLObjectFactory.makeSymbol("S#21206", "CYC");
        $ic39$ = SubLObjectFactory.makeSymbol("S#21082", "CYC");
        $ic40$ = SubLObjectFactory.makeSymbol("S#21089", "CYC");
        $ic41$ = SubLObjectFactory.makeSymbol("S#21207", "CYC");
        $ic42$ = SubLObjectFactory.makeSymbol("S#21086", "CYC");
        $ic43$ = SubLObjectFactory.makeSymbol("S#21093", "CYC");
        $ic44$ = SubLObjectFactory.makeSymbol("S#21208", "CYC");
        $ic45$ = SubLObjectFactory.makeSymbol("S#21090", "CYC");
        $ic46$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycLSentence-Askable"));
        $ic47$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycLSentence-Assertible"));
        $ic48$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycLDenotationalTerm"));
        $ic49$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ist"));
        $ic50$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic51$ = SubLObjectFactory.makeSymbol("S#21101", "CYC");
        $ic52$ = SubLObjectFactory.makeSymbol("S#21102", "CYC");
        $ic53$ = SubLObjectFactory.makeSymbol("FIRST");
        $ic54$ = SubLObjectFactory.makeSymbol("SECOND");
        $ic55$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("termOfUnit"));
        $ic56$ = SubLObjectFactory.makeString("function");
        $ic57$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("equals"));
        $ic58$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("evaluate"));
        $ic59$ = SubLObjectFactory.makeSymbol("STRING=");
        $ic60$ = SubLObjectFactory.makeString("");
        $ic61$ = SubLObjectFactory.makeString("-~s");
        $ic62$ = SubLObjectFactory.makeSymbol("?X");
        $ic63$ = SubLObjectFactory.makeString("Could not create a unique HL var wrt ~a");
        $ic64$ = SubLObjectFactory.makeKeyword("DEFAULT");
        $ic65$ = SubLObjectFactory.makeSymbol("S#12629", "CYC");
        $ic66$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("trueSentence"));
        $ic67$ = SubLObjectFactory.makeSymbol("S#12753", "CYC");
        $ic68$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("functionCommutesWith"));
        $ic69$ = SubLObjectFactory.makeSymbol("S#21136", "CYC");
        $ic70$ = SubLObjectFactory.makeSymbol("VARIABLE-P");
        $ic71$ = SubLObjectFactory.makeSymbol("S#16020", "CYC");
        $ic72$ = SubLObjectFactory.makeSymbol("S#15919", "CYC");
        $ic73$ = SubLObjectFactory.makeKeyword("CNF");
        $ic74$ = SubLObjectFactory.makeKeyword("DNF");
        $ic75$ = SubLObjectFactory.makeSymbol("S#15944", "CYC");
        $ic76$ = SubLObjectFactory.makeSymbol("BOOLEANP");
        $ic77$ = SubLObjectFactory.makeString("Unexpected clausal form ~s");
        $ic78$ = SubLObjectFactory.makeSymbol("S#21153", "CYC");
        $ic79$ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $ic80$ = SubLObjectFactory.makeSymbol("S#21152", "CYC");
        $ic81$ = SubLObjectFactory.makeKeyword("OPAQUIFIED-EL-VARIABLE");
        $ic82$ = SubLObjectFactory.makeSymbol("S#747", "CYC");
        $ic83$ = SubLObjectFactory.makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic84$ = SubLObjectFactory.makeSymbol("S#21161", "CYC");
        $ic85$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic86$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheSet"));
        $ic87$ = SubLObjectFactory.makeSymbol("S#17997", "CYC");
        $ic88$ = SubLObjectFactory.makeSymbol("S#21211", "CYC");
        $ic89$ = SubLObjectFactory.makeString("~s ~s does not adequately specify a microtheory.");
        $ic90$ = SubLObjectFactory.makeSymbol("S#15433", "CYC");
        $ic91$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EscapeQuote"));
        $ic92$ = SubLObjectFactory.makeSymbol("S#21051", "CYC");
        $ic93$ = SubLObjectFactory.makeSymbol("S#21173", "CYC");
        $ic94$ = SubLObjectFactory.makeSymbol("S#21175", "CYC");
        $ic95$ = SubLObjectFactory.makeSymbol("S#21177", "CYC");
        $ic96$ = SubLObjectFactory.makeSymbol("S#21052", "CYC");
        $ic97$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("ist")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("ist-Asserted")));
        $ic98$ = SubLObjectFactory.makeSymbol("S#21180", "CYC");
        $ic99$ = SubLObjectFactory.makeKeyword("OPAQUE-ARG-FOUND");
        $ic100$ = SubLObjectFactory.makeSymbol("S#16331", "CYC");
        $ic101$ = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $ic102$ = SubLObjectFactory.makeSymbol("KB-HL-SUPPORT-P");
        $ic103$ = SubLObjectFactory.makeSymbol("HL-SUPPORT-P");
        $ic104$ = SubLObjectFactory.makeSymbol("DEDUCTION-P");
        $ic105$ = SubLObjectFactory.makeSymbol("INDEXED-TERM-P");
        $ic106$ = SubLObjectFactory.makeSymbol("S#2879", "CYC");
        $ic107$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic108$ = SubLObjectFactory.makeSymbol("SKOLEM-NART?");
        $ic109$ = SubLObjectFactory.makeSymbol("CDR");
        $ic110$ = SubLObjectFactory.makeKeyword("ASSERT");
        $ic111$ = SubLObjectFactory.makeString("~%Error: assert failed ~S.~%");
        $ic112$ = SubLObjectFactory.makeString("~%Error: Can't find assertion:~%");
        $ic113$ = SubLObjectFactory.makeKeyword("UNASSERT");
        $ic114$ = SubLObjectFactory.makeString("~%Form: ~A in ~A~%");
        $ic115$ = SubLObjectFactory.makeString("~%Error: assert failed~%");
        $ic116$ = SubLObjectFactory.makeString("~%Error: Can't find assertions: ~A~%");
        $ic117$ = SubLObjectFactory.makeString("~%The assertion is ~S.~%");
        $ic118$ = SubLObjectFactory.makeString("~%Its EL form is ~S in ~S.~%");
        $ic119$ = SubLObjectFactory.makeString("~%Error: Can't find assertions: ~A in ~A~%");
        $ic120$ = SubLObjectFactory.makeString("~%Its New EL form is ~S in ~S.~%");
        $ic121$ = SubLObjectFactory.makeString("~%Error: EL mismatch:~%Original: ~A ~%From assertion: ~A");
        $ic122$ = SubLObjectFactory.makeString("~%Error: assert failed: ~S~%");
        $ic123$ = SubLObjectFactory.makeString("~%Error: unassert failed: ~S~%");
        $ic124$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("False"));
    }
    
    public static final class $f18515$UnaryFunction extends UnaryFunction
    {
        public $f18515$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#21041"));
        }
        
        public SubLObject processItem(final SubLObject var99) {
            return module0279.f18515(var99);
        }
    }
    
    public static final class $f18585$UnaryFunction extends UnaryFunction
    {
        public $f18585$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#21051"));
        }
        
        public SubLObject processItem(final SubLObject var99) {
            return module0279.f18585(var99);
        }
    }
    
    public static final class $f18592$UnaryFunction extends UnaryFunction
    {
        public $f18592$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#21052"));
        }
        
        public SubLObject processItem(final SubLObject var99) {
            return module0279.f18592(var99);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0279.class
	Total time: 1070 ms
	
	Decompiled with Procyon 0.5.32.
*/