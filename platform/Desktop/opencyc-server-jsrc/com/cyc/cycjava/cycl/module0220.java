package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0220 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0220";
    public static final String myFingerPrint = "82bad8ee97fac986f5eff816a8e49cc32688b6130ca8ddab742200b8f2b26fea";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLString $ic8$;
    private static final SubLList $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLString $ic15$;
    private static final SubLList $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLList $ic20$;
    private static final SubLString $ic21$;
    private static final SubLList $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLObject $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLString $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLList $ic28$;
    private static final SubLString $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLList $ic32$;
    private static final SubLString $ic33$;
    private static final SubLList $ic34$;
    private static final SubLList $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLList $ic37$;
    private static final SubLString $ic38$;
    private static final SubLList $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLList $ic41$;
    private static final SubLString $ic42$;
    private static final SubLList $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLString $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLList $ic47$;
    private static final SubLString $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLString $ic50$;
    private static final SubLList $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLString $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLString $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLString $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLString $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLList $ic61$;
    private static final SubLString $ic62$;
    private static final SubLList $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLList $ic65$;
    private static final SubLString $ic66$;
    private static final SubLList $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLList $ic69$;
    private static final SubLString $ic70$;
    private static final SubLList $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLString $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLList $ic75$;
    private static final SubLString $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLList $ic79$;
    private static final SubLString $ic80$;
    private static final SubLList $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLList $ic83$;
    private static final SubLString $ic84$;
    private static final SubLList $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLList $ic87$;
    private static final SubLString $ic88$;
    private static final SubLList $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLString $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLList $ic93$;
    private static final SubLString $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLString $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLList $ic98$;
    private static final SubLString $ic99$;
    private static final SubLList $ic100$;
    private static final SubLList $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLList $ic103$;
    private static final SubLString $ic104$;
    private static final SubLList $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLList $ic107$;
    private static final SubLString $ic108$;
    private static final SubLList $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLString $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLList $ic113$;
    private static final SubLString $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    
    public static SubLObject f14544(final SubLObject var1, final SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var3 == module0220.UNPROVIDED) {
            var3 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        assert module0220.NIL != module0212.f13762(var1) : var1;
        assert module0220.NIL != module0173.f10955(var2) : var2;
        assert module0220.NIL != Types.integerp(var3) : var3;
        assert module0220.NIL != module0130.f8511(var4) : var4;
        SubLObject var6 = (SubLObject)module0220.NIL;
        if (module0220.NIL != module0158.f10010(var1, var3, var2)) {
            final SubLObject var7 = module0158.f10011(var1, var3, var2);
            SubLObject var8 = var6;
            final SubLObject var9 = (SubLObject)module0220.NIL;
            while (module0220.NIL == var8) {
                final SubLObject var10 = module0052.f3695(var7, var9);
                final SubLObject var11 = (SubLObject)SubLObjectFactory.makeBoolean(!var9.eql(var10));
                if (module0220.NIL != var11) {
                    SubLObject var12 = (SubLObject)module0220.NIL;
                    try {
                        var12 = module0158.f10316(var10, (SubLObject)module0220.$ic5$, var4, (SubLObject)module0220.NIL);
                        SubLObject var9_14 = var6;
                        final SubLObject var10_15 = (SubLObject)module0220.NIL;
                        while (module0220.NIL == var9_14) {
                            final SubLObject var13 = module0052.f3695(var12, var10_15);
                            final SubLObject var12_17 = (SubLObject)SubLObjectFactory.makeBoolean(!var10_15.eql(var13));
                            if (module0220.NIL != var12_17) {
                                if (module0220.NIL != module0018.$g604$.getDynamicValue(var5)) {
                                    Functions.funcall(module0018.$g604$.getDynamicValue(var5), var13);
                                }
                                var6 = (SubLObject)module0220.T;
                            }
                            var9_14 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var12_17 || module0220.NIL != var6);
                        }
                    }
                    finally {
                        final SubLObject var14 = Threads.$is_thread_performing_cleanupP$.currentBinding(var5);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0220.T, var5);
                            if (module0220.NIL != var12) {
                                module0158.f10319(var12);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var14, var5);
                        }
                    }
                }
                var8 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var11 || module0220.NIL != var6);
            }
        }
        return var6;
    }
    
    public static SubLObject f14545(final SubLObject var1, final SubLObject var2, final SubLObject var19, SubLObject var3, SubLObject var4) {
        if (var3 == module0220.UNPROVIDED) {
            var3 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var20 = SubLProcess.currentSubLThread();
        assert module0220.NIL != module0212.f13762(var1) : var1;
        assert module0220.NIL != module0173.f10955(var2) : var2;
        assert module0220.NIL != module0161.f10481(var19) : var19;
        assert module0220.NIL != Types.integerp(var3) : var3;
        assert module0220.NIL != module0130.f8511(var4) : var4;
        SubLObject var21 = (SubLObject)module0220.NIL;
        final SubLObject var22 = module0147.$g2094$.currentBinding(var20);
        final SubLObject var23 = module0147.$g2095$.currentBinding(var20);
        try {
            module0147.$g2094$.bind((SubLObject)module0220.$ic12$, var20);
            module0147.$g2095$.bind(var19, var20);
            var21 = f14544(var1, var2, var3, var4);
        }
        finally {
            module0147.$g2095$.rebind(var23, var20);
            module0147.$g2094$.rebind(var22, var20);
        }
        return var21;
    }
    
    public static SubLObject f14546(final SubLObject var1, final SubLObject var2, final SubLObject var21, SubLObject var3, SubLObject var4) {
        if (var3 == module0220.UNPROVIDED) {
            var3 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var22 = SubLProcess.currentSubLThread();
        assert module0220.NIL != module0212.f13762(var1) : var1;
        assert module0220.NIL != module0173.f10955(var2) : var2;
        assert module0220.NIL != Types.listp(var21) : var21;
        assert module0220.NIL != Types.integerp(var3) : var3;
        assert module0220.NIL != module0130.f8511(var4) : var4;
        SubLObject var23 = (SubLObject)module0220.NIL;
        final SubLObject var24 = module0147.$g2094$.currentBinding(var22);
        final SubLObject var25 = module0147.$g2096$.currentBinding(var22);
        try {
            module0147.$g2094$.bind((SubLObject)module0220.$ic18$, var22);
            module0147.$g2096$.bind(var21, var22);
            var23 = f14544(var1, var2, var3, var4);
        }
        finally {
            module0147.$g2096$.rebind(var25, var22);
            module0147.$g2094$.rebind(var24, var22);
        }
        return var23;
    }
    
    public static SubLObject f14547(final SubLObject var1, final SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var3 == module0220.UNPROVIDED) {
            var3 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        assert module0220.NIL != module0212.f13762(var1) : var1;
        assert module0220.NIL != module0173.f10955(var2) : var2;
        assert module0220.NIL != Types.integerp(var3) : var3;
        assert module0220.NIL != module0130.f8511(var4) : var4;
        SubLObject var6 = (SubLObject)module0220.NIL;
        final SubLObject var7 = module0147.$g2094$.currentBinding(var5);
        final SubLObject var8 = module0147.$g2095$.currentBinding(var5);
        try {
            module0147.$g2094$.bind((SubLObject)module0220.$ic23$, var5);
            module0147.$g2095$.bind(module0220.$ic24$, var5);
            var6 = f14544(var1, var2, var3, var4);
        }
        finally {
            module0147.$g2095$.rebind(var8, var5);
            module0147.$g2094$.rebind(var7, var5);
        }
        return var6;
    }
    
    public static SubLObject f14548(final SubLObject var1, final SubLObject var2, SubLObject var19, SubLObject var3, SubLObject var4) {
        if (var19 == module0220.UNPROVIDED) {
            var19 = (SubLObject)module0220.NIL;
        }
        if (var3 == module0220.UNPROVIDED) {
            var3 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var20 = SubLProcess.currentSubLThread();
        assert module0220.NIL != module0212.f13762(var1) : var1;
        assert module0220.NIL != module0173.f10955(var2) : var2;
        assert module0220.NIL != Types.integerp(var3) : var3;
        assert module0220.NIL != module0130.f8511(var4) : var4;
        SubLObject var21 = (SubLObject)module0220.NIL;
        final SubLObject var22 = var19;
        final SubLObject var23 = module0147.$g2094$.currentBinding(var20);
        final SubLObject var24 = module0147.$g2095$.currentBinding(var20);
        try {
            module0147.$g2094$.bind(module0147.f9531(var22), var20);
            module0147.$g2095$.bind(module0147.f9534(var22), var20);
            var21 = f14544(var1, var2, var3, var4);
        }
        finally {
            module0147.$g2095$.rebind(var24, var20);
            module0147.$g2094$.rebind(var23, var20);
        }
        return var21;
    }
    
    public static SubLObject f14549(final SubLObject var1, final SubLObject var2, final SubLObject var23, SubLObject var3, SubLObject var4) {
        if (var3 == module0220.UNPROVIDED) {
            var3 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var24 = SubLProcess.currentSubLThread();
        assert module0220.NIL != module0212.f13762(var1) : var1;
        assert module0220.NIL != module0173.f10955(var2) : var2;
        assert module0220.NIL != Types.function_spec_p(var23) : var23;
        assert module0220.NIL != Types.integerp(var3) : var3;
        assert module0220.NIL != module0130.f8511(var4) : var4;
        SubLObject var25 = (SubLObject)module0220.NIL;
        if (module0220.NIL != module0158.f10010(var1, var3, var2)) {
            final SubLObject var26 = module0158.f10011(var1, var3, var2);
            SubLObject var27 = var25;
            final SubLObject var28 = (SubLObject)module0220.NIL;
            while (module0220.NIL == var27) {
                final SubLObject var29 = module0052.f3695(var26, var28);
                final SubLObject var30 = (SubLObject)SubLObjectFactory.makeBoolean(!var28.eql(var29));
                if (module0220.NIL != var30) {
                    SubLObject var31 = (SubLObject)module0220.NIL;
                    try {
                        var31 = module0158.f10316(var29, (SubLObject)module0220.$ic5$, var4, (SubLObject)module0220.NIL);
                        SubLObject var9_24 = var25;
                        final SubLObject var10_25 = (SubLObject)module0220.NIL;
                        while (module0220.NIL == var9_24) {
                            final SubLObject var32 = module0052.f3695(var31, var10_25);
                            final SubLObject var12_26 = (SubLObject)SubLObjectFactory.makeBoolean(!var10_25.eql(var32));
                            if (module0220.NIL != var12_26 && module0220.NIL != Functions.funcall(var23, var32)) {
                                if (module0220.NIL != module0018.$g604$.getDynamicValue(var24)) {
                                    Functions.funcall(module0018.$g604$.getDynamicValue(var24), var32);
                                }
                                var25 = (SubLObject)module0220.T;
                            }
                            var9_24 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var12_26 || module0220.NIL != var25);
                        }
                    }
                    finally {
                        final SubLObject var33 = Threads.$is_thread_performing_cleanupP$.currentBinding(var24);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0220.T, var24);
                            if (module0220.NIL != var31) {
                                module0158.f10319(var31);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var33, var24);
                        }
                    }
                }
                var27 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var30 || module0220.NIL != var25);
            }
        }
        return var25;
    }
    
    public static SubLObject f14550(final SubLObject var1, final SubLObject var2, SubLObject var27, SubLObject var4) {
        if (var27 == module0220.UNPROVIDED) {
            var27 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var28 = SubLProcess.currentSubLThread();
        SubLObject var29 = (SubLObject)module0220.NIL;
        if (module0220.NIL != module0158.f10010(var1, var27, var2)) {
            final SubLObject var30 = module0158.f10011(var1, var27, var2);
            SubLObject var31 = var29;
            final SubLObject var32 = (SubLObject)module0220.NIL;
            while (module0220.NIL == var31) {
                final SubLObject var33 = module0052.f3695(var30, var32);
                final SubLObject var34 = (SubLObject)SubLObjectFactory.makeBoolean(!var32.eql(var33));
                if (module0220.NIL != var34) {
                    SubLObject var35 = (SubLObject)module0220.NIL;
                    try {
                        var35 = module0158.f10316(var33, (SubLObject)module0220.$ic5$, var4, (SubLObject)module0220.NIL);
                        SubLObject var9_28 = var29;
                        final SubLObject var10_29 = (SubLObject)module0220.NIL;
                        while (module0220.NIL == var9_28) {
                            final SubLObject var36 = module0052.f3695(var35, var10_29);
                            final SubLObject var12_30 = (SubLObject)SubLObjectFactory.makeBoolean(!var10_29.eql(var36));
                            if (module0220.NIL != var12_30) {
                                if (module0220.NIL != module0018.$g604$.getDynamicValue(var28)) {
                                    Functions.funcall(module0018.$g604$.getDynamicValue(var28), var36);
                                }
                                var29 = var36;
                            }
                            var9_28 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var12_30 || module0220.NIL != var29);
                        }
                    }
                    finally {
                        final SubLObject var37 = Threads.$is_thread_performing_cleanupP$.currentBinding(var28);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0220.T, var28);
                            if (module0220.NIL != var35) {
                                module0158.f10319(var35);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var37, var28);
                        }
                    }
                }
                var31 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var34 || module0220.NIL != var29);
            }
        }
        return var29;
    }
    
    public static SubLObject f14551(final SubLObject var1, final SubLObject var2, SubLObject var19, SubLObject var27, SubLObject var4) {
        if (var19 == module0220.UNPROVIDED) {
            var19 = (SubLObject)module0220.NIL;
        }
        if (var27 == module0220.UNPROVIDED) {
            var27 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var28 = SubLProcess.currentSubLThread();
        SubLObject var29 = (SubLObject)module0220.NIL;
        final SubLObject var30 = var19;
        final SubLObject var31 = module0147.$g2094$.currentBinding(var28);
        final SubLObject var32 = module0147.$g2095$.currentBinding(var28);
        try {
            module0147.$g2094$.bind(module0147.f9531(var30), var28);
            module0147.$g2095$.bind(module0147.f9534(var30), var28);
            var29 = f14550(var1, var2, var27, var4);
        }
        finally {
            module0147.$g2095$.rebind(var32, var28);
            module0147.$g2094$.rebind(var31, var28);
        }
        return var29;
    }
    
    public static SubLObject f14552(final SubLObject var1, final SubLObject var2, SubLObject var27, SubLObject var4) {
        if (var27 == module0220.UNPROVIDED) {
            var27 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var28 = SubLProcess.currentSubLThread();
        SubLObject var29 = (SubLObject)module0220.NIL;
        final SubLObject var30 = module0147.$g2094$.currentBinding(var28);
        final SubLObject var31 = module0147.$g2095$.currentBinding(var28);
        try {
            module0147.$g2094$.bind((SubLObject)module0220.$ic23$, var28);
            module0147.$g2095$.bind(module0220.$ic24$, var28);
            var29 = f14550(var1, var2, var27, var4);
        }
        finally {
            module0147.$g2095$.rebind(var31, var28);
            module0147.$g2094$.rebind(var30, var28);
        }
        return var29;
    }
    
    public static SubLObject f14553(final SubLObject var1, final SubLObject var2, SubLObject var3, SubLObject var31, SubLObject var4) {
        if (var3 == module0220.UNPROVIDED) {
            var3 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var31 == module0220.UNPROVIDED) {
            var31 = (SubLObject)module0220.TWO_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        assert module0220.NIL != module0212.f13762(var1) : var1;
        assert module0220.NIL != module0173.f10955(var2) : var2;
        assert module0220.NIL != Types.integerp(var3) : var3;
        assert module0220.NIL != Types.integerp(var31) : var31;
        assert module0220.NIL != module0130.f8511(var4) : var4;
        final SubLObject var32 = f14550(var1, var2, var3, var4);
        if (module0220.NIL != var32) {
            return module0178.f11331(var32, var31);
        }
        return (SubLObject)module0220.NIL;
    }
    
    public static SubLObject f14554(final SubLObject var1, final SubLObject var2, final SubLObject var19, SubLObject var3, SubLObject var31, SubLObject var4) {
        if (var3 == module0220.UNPROVIDED) {
            var3 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var31 == module0220.UNPROVIDED) {
            var31 = (SubLObject)module0220.TWO_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var32 = SubLProcess.currentSubLThread();
        assert module0220.NIL != module0212.f13762(var1) : var1;
        assert module0220.NIL != module0173.f10955(var2) : var2;
        assert module0220.NIL != module0161.f10481(var19) : var19;
        assert module0220.NIL != Types.integerp(var3) : var3;
        assert module0220.NIL != Types.integerp(var31) : var31;
        assert module0220.NIL != module0130.f8511(var4) : var4;
        SubLObject var33 = (SubLObject)module0220.NIL;
        final SubLObject var34 = module0147.$g2094$.currentBinding(var32);
        final SubLObject var35 = module0147.$g2095$.currentBinding(var32);
        try {
            module0147.$g2094$.bind((SubLObject)module0220.$ic12$, var32);
            module0147.$g2095$.bind(var19, var32);
            var33 = f14553(var1, var2, var3, var31, var4);
        }
        finally {
            module0147.$g2095$.rebind(var35, var32);
            module0147.$g2094$.rebind(var34, var32);
        }
        return var33;
    }
    
    public static SubLObject f14555(final SubLObject var1, final SubLObject var2, final SubLObject var21, SubLObject var3, SubLObject var31, SubLObject var4) {
        if (var3 == module0220.UNPROVIDED) {
            var3 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var31 == module0220.UNPROVIDED) {
            var31 = (SubLObject)module0220.TWO_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var32 = SubLProcess.currentSubLThread();
        assert module0220.NIL != module0212.f13762(var1) : var1;
        assert module0220.NIL != module0173.f10955(var2) : var2;
        assert module0220.NIL != Types.listp(var21) : var21;
        assert module0220.NIL != Types.integerp(var3) : var3;
        assert module0220.NIL != Types.integerp(var31) : var31;
        assert module0220.NIL != module0130.f8511(var4) : var4;
        SubLObject var33 = (SubLObject)module0220.NIL;
        final SubLObject var34 = module0147.$g2094$.currentBinding(var32);
        final SubLObject var35 = module0147.$g2096$.currentBinding(var32);
        try {
            module0147.$g2094$.bind((SubLObject)module0220.$ic18$, var32);
            module0147.$g2096$.bind(var21, var32);
            var33 = f14553(var1, var2, var3, var31, var4);
        }
        finally {
            module0147.$g2096$.rebind(var35, var32);
            module0147.$g2094$.rebind(var34, var32);
        }
        return var33;
    }
    
    public static SubLObject f14556(final SubLObject var1, final SubLObject var2, SubLObject var3, SubLObject var31, SubLObject var4) {
        if (var3 == module0220.UNPROVIDED) {
            var3 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var31 == module0220.UNPROVIDED) {
            var31 = (SubLObject)module0220.TWO_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var32 = SubLProcess.currentSubLThread();
        assert module0220.NIL != module0212.f13762(var1) : var1;
        assert module0220.NIL != module0173.f10955(var2) : var2;
        assert module0220.NIL != Types.integerp(var3) : var3;
        assert module0220.NIL != Types.integerp(var31) : var31;
        assert module0220.NIL != module0130.f8511(var4) : var4;
        SubLObject var33 = (SubLObject)module0220.NIL;
        final SubLObject var34 = module0147.$g2094$.currentBinding(var32);
        final SubLObject var35 = module0147.$g2095$.currentBinding(var32);
        try {
            module0147.$g2094$.bind((SubLObject)module0220.$ic23$, var32);
            module0147.$g2095$.bind(module0220.$ic24$, var32);
            var33 = f14553(var1, var2, var3, var31, var4);
        }
        finally {
            module0147.$g2095$.rebind(var35, var32);
            module0147.$g2094$.rebind(var34, var32);
        }
        return var33;
    }
    
    public static SubLObject f14557(final SubLObject var1, final SubLObject var2, SubLObject var19, SubLObject var3, SubLObject var31, SubLObject var4) {
        if (var19 == module0220.UNPROVIDED) {
            var19 = (SubLObject)module0220.NIL;
        }
        if (var3 == module0220.UNPROVIDED) {
            var3 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var31 == module0220.UNPROVIDED) {
            var31 = (SubLObject)module0220.TWO_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var32 = SubLProcess.currentSubLThread();
        assert module0220.NIL != module0212.f13762(var1) : var1;
        assert module0220.NIL != module0173.f10955(var2) : var2;
        assert module0220.NIL != Types.integerp(var3) : var3;
        assert module0220.NIL != Types.integerp(var31) : var31;
        assert module0220.NIL != module0130.f8511(var4) : var4;
        SubLObject var33 = (SubLObject)module0220.NIL;
        final SubLObject var34 = var19;
        final SubLObject var35 = module0147.$g2094$.currentBinding(var32);
        final SubLObject var36 = module0147.$g2095$.currentBinding(var32);
        try {
            module0147.$g2094$.bind(module0147.f9531(var34), var32);
            module0147.$g2095$.bind(module0147.f9534(var34), var32);
            var33 = f14553(var1, var2, var3, var31, var4);
        }
        finally {
            module0147.$g2095$.rebind(var36, var32);
            module0147.$g2094$.rebind(var35, var32);
        }
        return var33;
    }
    
    public static SubLObject f14558(final SubLObject var1, final SubLObject var2, SubLObject var27, SubLObject var4) {
        if (var27 == module0220.UNPROVIDED) {
            var27 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var28 = SubLProcess.currentSubLThread();
        SubLObject var29 = (SubLObject)module0220.NIL;
        if (module0220.NIL != module0158.f10010(var1, var27, var2)) {
            final SubLObject var30 = module0158.f10011(var1, var27, var2);
            SubLObject var31 = (SubLObject)module0220.NIL;
            final SubLObject var32 = (SubLObject)module0220.NIL;
            while (module0220.NIL == var31) {
                final SubLObject var33 = module0052.f3695(var30, var32);
                final SubLObject var34 = (SubLObject)SubLObjectFactory.makeBoolean(!var32.eql(var33));
                if (module0220.NIL != var34) {
                    SubLObject var35 = (SubLObject)module0220.NIL;
                    try {
                        var35 = module0158.f10316(var33, (SubLObject)module0220.$ic5$, var4, (SubLObject)module0220.NIL);
                        SubLObject var9_33 = (SubLObject)module0220.NIL;
                        final SubLObject var10_34 = (SubLObject)module0220.NIL;
                        while (module0220.NIL == var9_33) {
                            final SubLObject var36 = module0052.f3695(var35, var10_34);
                            final SubLObject var12_35 = (SubLObject)SubLObjectFactory.makeBoolean(!var10_34.eql(var36));
                            if (module0220.NIL != var12_35) {
                                if (module0220.NIL != module0018.$g604$.getDynamicValue(var28)) {
                                    Functions.funcall(module0018.$g604$.getDynamicValue(var28), var36);
                                }
                                var29 = (SubLObject)ConsesLow.cons(var36, var29);
                            }
                            var9_33 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var12_35);
                        }
                    }
                    finally {
                        final SubLObject var37 = Threads.$is_thread_performing_cleanupP$.currentBinding(var28);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0220.T, var28);
                            if (module0220.NIL != var35) {
                                module0158.f10319(var35);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var37, var28);
                        }
                    }
                }
                var31 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var34);
            }
        }
        return var29;
    }
    
    public static SubLObject f14559(final SubLObject var1, final SubLObject var2, final SubLObject var19, SubLObject var27, SubLObject var4) {
        if (var27 == module0220.UNPROVIDED) {
            var27 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var28 = SubLProcess.currentSubLThread();
        SubLObject var29 = (SubLObject)module0220.NIL;
        final SubLObject var30 = module0147.$g2094$.currentBinding(var28);
        final SubLObject var31 = module0147.$g2095$.currentBinding(var28);
        try {
            module0147.$g2094$.bind((SubLObject)module0220.$ic12$, var28);
            module0147.$g2095$.bind(var19, var28);
            var29 = f14558(var1, var2, var27, var4);
        }
        finally {
            module0147.$g2095$.rebind(var31, var28);
            module0147.$g2094$.rebind(var30, var28);
        }
        return var29;
    }
    
    public static SubLObject f14560(final SubLObject var1, final SubLObject var2, SubLObject var19, SubLObject var27, SubLObject var4) {
        if (var19 == module0220.UNPROVIDED) {
            var19 = (SubLObject)module0220.NIL;
        }
        if (var27 == module0220.UNPROVIDED) {
            var27 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var28 = SubLProcess.currentSubLThread();
        SubLObject var29 = (SubLObject)module0220.NIL;
        final SubLObject var30 = var19;
        final SubLObject var31 = module0147.$g2094$.currentBinding(var28);
        final SubLObject var32 = module0147.$g2095$.currentBinding(var28);
        try {
            module0147.$g2094$.bind(module0147.f9531(var30), var28);
            module0147.$g2095$.bind(module0147.f9534(var30), var28);
            var29 = f14558(var1, var2, var27, var4);
        }
        finally {
            module0147.$g2095$.rebind(var32, var28);
            module0147.$g2094$.rebind(var31, var28);
        }
        return var29;
    }
    
    public static SubLObject f14561(final SubLObject var1, final SubLObject var2, SubLObject var27, SubLObject var4) {
        if (var27 == module0220.UNPROVIDED) {
            var27 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var28 = SubLProcess.currentSubLThread();
        SubLObject var29 = (SubLObject)module0220.NIL;
        final SubLObject var30 = module0147.$g2094$.currentBinding(var28);
        final SubLObject var31 = module0147.$g2095$.currentBinding(var28);
        try {
            module0147.$g2094$.bind((SubLObject)module0220.$ic23$, var28);
            module0147.$g2095$.bind(module0220.$ic24$, var28);
            var29 = f14558(var1, var2, var27, var4);
        }
        finally {
            module0147.$g2095$.rebind(var31, var28);
            module0147.$g2094$.rebind(var30, var28);
        }
        return var29;
    }
    
    public static SubLObject f14562(final SubLObject var1, final SubLObject var2, SubLObject var3, SubLObject var31, SubLObject var4) {
        if (var3 == module0220.UNPROVIDED) {
            var3 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var31 == module0220.UNPROVIDED) {
            var31 = (SubLObject)module0220.TWO_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var32 = SubLProcess.currentSubLThread();
        assert module0220.NIL != module0212.f13762(var1) : var1;
        assert module0220.NIL != module0173.f10955(var2) : var2;
        assert module0220.NIL != Types.integerp(var3) : var3;
        assert module0220.NIL != Types.integerp(var31) : var31;
        assert module0220.NIL != module0130.f8511(var4) : var4;
        SubLObject var33 = (SubLObject)module0220.NIL;
        if (module0220.NIL != module0158.f10010(var1, var3, var2)) {
            final SubLObject var34 = module0158.f10011(var1, var3, var2);
            SubLObject var35 = (SubLObject)module0220.NIL;
            final SubLObject var36 = (SubLObject)module0220.NIL;
            while (module0220.NIL == var35) {
                final SubLObject var37 = module0052.f3695(var34, var36);
                final SubLObject var38 = (SubLObject)SubLObjectFactory.makeBoolean(!var36.eql(var37));
                if (module0220.NIL != var38) {
                    SubLObject var39 = (SubLObject)module0220.NIL;
                    try {
                        var39 = module0158.f10316(var37, (SubLObject)module0220.$ic5$, var4, (SubLObject)module0220.NIL);
                        SubLObject var9_37 = (SubLObject)module0220.NIL;
                        final SubLObject var10_38 = (SubLObject)module0220.NIL;
                        while (module0220.NIL == var9_37) {
                            final SubLObject var40 = module0052.f3695(var39, var10_38);
                            final SubLObject var12_39 = (SubLObject)SubLObjectFactory.makeBoolean(!var10_38.eql(var40));
                            if (module0220.NIL != var12_39) {
                                if (module0220.NIL != module0018.$g604$.getDynamicValue(var32)) {
                                    Functions.funcall(module0018.$g604$.getDynamicValue(var32), var40);
                                }
                                final SubLObject var41 = module0178.f11331(var40, var31);
                                if (module0220.NIL != module0018.$g593$.getDynamicValue(var32)) {
                                    final SubLObject var42 = var41;
                                    if (module0220.NIL == conses_high.member(var42, var33, module0018.$g593$.getDynamicValue(var32), Symbols.symbol_function((SubLObject)module0220.IDENTITY))) {
                                        var33 = (SubLObject)ConsesLow.cons(var42, var33);
                                    }
                                }
                                else {
                                    var33 = (SubLObject)ConsesLow.cons(var41, var33);
                                }
                            }
                            var9_37 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var12_39);
                        }
                    }
                    finally {
                        final SubLObject var43 = Threads.$is_thread_performing_cleanupP$.currentBinding(var32);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0220.T, var32);
                            if (module0220.NIL != var39) {
                                module0158.f10319(var39);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var43, var32);
                        }
                    }
                }
                var35 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var38);
            }
        }
        return var33;
    }
    
    public static SubLObject f14563(final SubLObject var1, final SubLObject var2, final SubLObject var19, SubLObject var3, SubLObject var31, SubLObject var4) {
        if (var3 == module0220.UNPROVIDED) {
            var3 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var31 == module0220.UNPROVIDED) {
            var31 = (SubLObject)module0220.TWO_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var32 = SubLProcess.currentSubLThread();
        assert module0220.NIL != module0212.f13762(var1) : var1;
        assert module0220.NIL != module0173.f10955(var2) : var2;
        assert module0220.NIL != module0161.f10481(var19) : var19;
        assert module0220.NIL != Types.integerp(var3) : var3;
        assert module0220.NIL != Types.integerp(var31) : var31;
        assert module0220.NIL != module0130.f8511(var4) : var4;
        SubLObject var33 = (SubLObject)module0220.NIL;
        final SubLObject var34 = module0147.$g2094$.currentBinding(var32);
        final SubLObject var35 = module0147.$g2095$.currentBinding(var32);
        try {
            module0147.$g2094$.bind((SubLObject)module0220.$ic12$, var32);
            module0147.$g2095$.bind(var19, var32);
            var33 = f14562(var1, var2, var3, var31, var4);
        }
        finally {
            module0147.$g2095$.rebind(var35, var32);
            module0147.$g2094$.rebind(var34, var32);
        }
        return var33;
    }
    
    public static SubLObject f14564(final SubLObject var1, final SubLObject var2, final SubLObject var21, SubLObject var3, SubLObject var31, SubLObject var4) {
        if (var3 == module0220.UNPROVIDED) {
            var3 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var31 == module0220.UNPROVIDED) {
            var31 = (SubLObject)module0220.TWO_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var32 = SubLProcess.currentSubLThread();
        assert module0220.NIL != module0212.f13762(var1) : var1;
        assert module0220.NIL != module0173.f10955(var2) : var2;
        assert module0220.NIL != Types.listp(var21) : var21;
        assert module0220.NIL != Types.integerp(var3) : var3;
        assert module0220.NIL != Types.integerp(var31) : var31;
        assert module0220.NIL != module0130.f8511(var4) : var4;
        SubLObject var33 = (SubLObject)module0220.NIL;
        final SubLObject var34 = module0147.$g2094$.currentBinding(var32);
        final SubLObject var35 = module0147.$g2096$.currentBinding(var32);
        try {
            module0147.$g2094$.bind((SubLObject)module0220.$ic18$, var32);
            module0147.$g2096$.bind(var21, var32);
            var33 = f14562(var1, var2, var3, var31, var4);
        }
        finally {
            module0147.$g2096$.rebind(var35, var32);
            module0147.$g2094$.rebind(var34, var32);
        }
        return var33;
    }
    
    public static SubLObject f14565(final SubLObject var1, final SubLObject var2, SubLObject var3, SubLObject var31, SubLObject var4) {
        if (var3 == module0220.UNPROVIDED) {
            var3 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var31 == module0220.UNPROVIDED) {
            var31 = (SubLObject)module0220.TWO_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var32 = SubLProcess.currentSubLThread();
        assert module0220.NIL != module0212.f13762(var1) : var1;
        assert module0220.NIL != module0173.f10955(var2) : var2;
        assert module0220.NIL != Types.integerp(var3) : var3;
        assert module0220.NIL != Types.integerp(var31) : var31;
        assert module0220.NIL != module0130.f8511(var4) : var4;
        SubLObject var33 = (SubLObject)module0220.NIL;
        final SubLObject var34 = module0147.$g2094$.currentBinding(var32);
        final SubLObject var35 = module0147.$g2095$.currentBinding(var32);
        try {
            module0147.$g2094$.bind((SubLObject)module0220.$ic23$, var32);
            module0147.$g2095$.bind(module0220.$ic24$, var32);
            var33 = f14562(var1, var2, var3, var31, var4);
        }
        finally {
            module0147.$g2095$.rebind(var35, var32);
            module0147.$g2094$.rebind(var34, var32);
        }
        return var33;
    }
    
    public static SubLObject f14566(final SubLObject var1, final SubLObject var2, SubLObject var19, SubLObject var3, SubLObject var31, SubLObject var4) {
        if (var19 == module0220.UNPROVIDED) {
            var19 = (SubLObject)module0220.NIL;
        }
        if (var3 == module0220.UNPROVIDED) {
            var3 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var31 == module0220.UNPROVIDED) {
            var31 = (SubLObject)module0220.TWO_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var32 = SubLProcess.currentSubLThread();
        assert module0220.NIL != module0212.f13762(var1) : var1;
        assert module0220.NIL != module0173.f10955(var2) : var2;
        assert module0220.NIL != Types.integerp(var3) : var3;
        assert module0220.NIL != Types.integerp(var31) : var31;
        assert module0220.NIL != module0130.f8511(var4) : var4;
        SubLObject var33 = (SubLObject)module0220.NIL;
        final SubLObject var34 = var19;
        final SubLObject var35 = module0147.$g2094$.currentBinding(var32);
        final SubLObject var36 = module0147.$g2095$.currentBinding(var32);
        try {
            module0147.$g2094$.bind(module0147.f9531(var34), var32);
            module0147.$g2095$.bind(module0147.f9534(var34), var32);
            var33 = f14562(var1, var2, var3, var31, var4);
        }
        finally {
            module0147.$g2095$.rebind(var36, var32);
            module0147.$g2094$.rebind(var35, var32);
        }
        return var33;
    }
    
    public static SubLObject f14567(final SubLObject var2, SubLObject var31, SubLObject var4) {
        if (var31 == module0220.UNPROVIDED) {
            var31 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var32 = SubLProcess.currentSubLThread();
        assert module0220.NIL != module0173.f10955(var2) : var2;
        assert module0220.NIL != Types.integerp(var31) : var31;
        assert module0220.NIL != module0130.f8511(var4) : var4;
        SubLObject var33 = (SubLObject)module0220.NIL;
        if (module0220.NIL != module0158.f10038(var2)) {
            final SubLObject var34 = (SubLObject)module0220.NIL;
            final SubLObject var35 = module0012.$g73$.currentBinding(var32);
            final SubLObject var36 = module0012.$g65$.currentBinding(var32);
            final SubLObject var37 = module0012.$g67$.currentBinding(var32);
            final SubLObject var38 = module0012.$g68$.currentBinding(var32);
            final SubLObject var39 = module0012.$g66$.currentBinding(var32);
            final SubLObject var40 = module0012.$g69$.currentBinding(var32);
            final SubLObject var41 = module0012.$g70$.currentBinding(var32);
            final SubLObject var42 = module0012.$silent_progressP$.currentBinding(var32);
            try {
                module0012.$g73$.bind(Time.get_universal_time(), var32);
                module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var32), var32);
                module0012.$g67$.bind((SubLObject)module0220.ONE_INTEGER, var32);
                module0012.$g68$.bind((SubLObject)module0220.ZERO_INTEGER, var32);
                module0012.$g66$.bind((SubLObject)module0220.ZERO_INTEGER, var32);
                module0012.$g69$.bind((SubLObject)module0220.ZERO_INTEGER, var32);
                module0012.$g70$.bind((SubLObject)module0220.T, var32);
                module0012.$silent_progressP$.bind((SubLObject)((module0220.NIL != var34) ? module0012.$silent_progressP$.getDynamicValue(var32) : module0220.T), var32);
                module0012.f474(var34);
                final SubLObject var43 = module0158.f10039(var2);
                SubLObject var44 = (SubLObject)module0220.NIL;
                final SubLObject var45 = (SubLObject)module0220.NIL;
                while (module0220.NIL == var44) {
                    final SubLObject var46 = module0052.f3695(var43, var45);
                    final SubLObject var47 = (SubLObject)SubLObjectFactory.makeBoolean(!var45.eql(var46));
                    if (module0220.NIL != var47) {
                        module0012.f476();
                        SubLObject var48 = (SubLObject)module0220.NIL;
                        try {
                            var48 = module0158.f10316(var46, (SubLObject)module0220.$ic5$, var4, (SubLObject)module0220.NIL);
                            SubLObject var9_51 = (SubLObject)module0220.NIL;
                            final SubLObject var10_52 = (SubLObject)module0220.NIL;
                            while (module0220.NIL == var9_51) {
                                final SubLObject var49 = module0052.f3695(var48, var10_52);
                                final SubLObject var12_53 = (SubLObject)SubLObjectFactory.makeBoolean(!var10_52.eql(var49));
                                if (module0220.NIL != var12_53) {
                                    if (module0220.NIL != module0018.$g604$.getDynamicValue(var32)) {
                                        Functions.funcall(module0018.$g604$.getDynamicValue(var32), var49);
                                    }
                                    if (module0220.NIL != module0018.$g593$.getDynamicValue(var32)) {
                                        final SubLObject var50 = module0178.f11331(var49, var31);
                                        if (module0220.NIL == conses_high.member(var50, var33, module0018.$g593$.getDynamicValue(var32), Symbols.symbol_function((SubLObject)module0220.IDENTITY))) {
                                            var33 = (SubLObject)ConsesLow.cons(var50, var33);
                                        }
                                    }
                                    else {
                                        var33 = (SubLObject)ConsesLow.cons(module0178.f11331(var49, var31), var33);
                                    }
                                }
                                var9_51 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var12_53);
                            }
                        }
                        finally {
                            final SubLObject var18_54 = Threads.$is_thread_performing_cleanupP$.currentBinding(var32);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0220.T, var32);
                                if (module0220.NIL != var48) {
                                    module0158.f10319(var48);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var18_54, var32);
                            }
                        }
                    }
                    var44 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var47);
                }
                module0012.f475();
            }
            finally {
                module0012.$silent_progressP$.rebind(var42, var32);
                module0012.$g70$.rebind(var41, var32);
                module0012.$g69$.rebind(var40, var32);
                module0012.$g66$.rebind(var39, var32);
                module0012.$g68$.rebind(var38, var32);
                module0012.$g67$.rebind(var37, var32);
                module0012.$g65$.rebind(var36, var32);
                module0012.$g73$.rebind(var35, var32);
            }
        }
        return var33;
    }
    
    public static SubLObject f14568(final SubLObject var2, final SubLObject var19, SubLObject var31, SubLObject var4) {
        if (var31 == module0220.UNPROVIDED) {
            var31 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var32 = SubLProcess.currentSubLThread();
        assert module0220.NIL != module0173.f10955(var2) : var2;
        assert module0220.NIL != module0161.f10481(var19) : var19;
        assert module0220.NIL != Types.integerp(var31) : var31;
        assert module0220.NIL != module0130.f8511(var4) : var4;
        SubLObject var33 = (SubLObject)module0220.NIL;
        final SubLObject var34 = module0147.$g2094$.currentBinding(var32);
        final SubLObject var35 = module0147.$g2095$.currentBinding(var32);
        try {
            module0147.$g2094$.bind((SubLObject)module0220.$ic12$, var32);
            module0147.$g2095$.bind(var19, var32);
            var33 = f14567(var2, var31, var4);
        }
        finally {
            module0147.$g2095$.rebind(var35, var32);
            module0147.$g2094$.rebind(var34, var32);
        }
        return var33;
    }
    
    public static SubLObject f14569(final SubLObject var2, final SubLObject var21, SubLObject var31, SubLObject var4) {
        if (var31 == module0220.UNPROVIDED) {
            var31 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var32 = SubLProcess.currentSubLThread();
        assert module0220.NIL != module0173.f10955(var2) : var2;
        assert module0220.NIL != Types.listp(var21) : var21;
        assert module0220.NIL != Types.integerp(var31) : var31;
        assert module0220.NIL != module0130.f8511(var4) : var4;
        SubLObject var33 = (SubLObject)module0220.NIL;
        final SubLObject var34 = module0147.$g2094$.currentBinding(var32);
        final SubLObject var35 = module0147.$g2096$.currentBinding(var32);
        try {
            module0147.$g2094$.bind((SubLObject)module0220.$ic18$, var32);
            module0147.$g2096$.bind(var21, var32);
            var33 = f14567(var2, var31, var4);
        }
        finally {
            module0147.$g2096$.rebind(var35, var32);
            module0147.$g2094$.rebind(var34, var32);
        }
        return var33;
    }
    
    public static SubLObject f14570(final SubLObject var2, SubLObject var31, SubLObject var4) {
        if (var31 == module0220.UNPROVIDED) {
            var31 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var32 = SubLProcess.currentSubLThread();
        assert module0220.NIL != module0173.f10955(var2) : var2;
        assert module0220.NIL != Types.integerp(var31) : var31;
        assert module0220.NIL != module0130.f8511(var4) : var4;
        SubLObject var33 = (SubLObject)module0220.NIL;
        final SubLObject var34 = module0147.$g2094$.currentBinding(var32);
        final SubLObject var35 = module0147.$g2095$.currentBinding(var32);
        try {
            module0147.$g2094$.bind((SubLObject)module0220.$ic23$, var32);
            module0147.$g2095$.bind(module0220.$ic24$, var32);
            var33 = f14567(var2, var31, var4);
        }
        finally {
            module0147.$g2095$.rebind(var35, var32);
            module0147.$g2094$.rebind(var34, var32);
        }
        return var33;
    }
    
    public static SubLObject f14571(final SubLObject var2, SubLObject var19, SubLObject var31, SubLObject var4) {
        if (var19 == module0220.UNPROVIDED) {
            var19 = (SubLObject)module0220.NIL;
        }
        if (var31 == module0220.UNPROVIDED) {
            var31 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var32 = SubLProcess.currentSubLThread();
        assert module0220.NIL != module0173.f10955(var2) : var2;
        assert module0220.NIL != Types.integerp(var31) : var31;
        assert module0220.NIL != module0130.f8511(var4) : var4;
        SubLObject var33 = (SubLObject)module0220.NIL;
        final SubLObject var34 = var19;
        final SubLObject var35 = module0147.$g2094$.currentBinding(var32);
        final SubLObject var36 = module0147.$g2095$.currentBinding(var32);
        try {
            module0147.$g2094$.bind(module0147.f9531(var34), var32);
            module0147.$g2095$.bind(module0147.f9534(var34), var32);
            var33 = f14567(var2, var31, var4);
        }
        finally {
            module0147.$g2095$.rebind(var36, var32);
            module0147.$g2094$.rebind(var35, var32);
        }
        return var33;
    }
    
    public static SubLObject f14572(final SubLObject var2, final SubLObject var55, final SubLObject var56, SubLObject var57, SubLObject var58, SubLObject var4) {
        if (var57 == module0220.UNPROVIDED) {
            var57 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var58 == module0220.UNPROVIDED) {
            var58 = (SubLObject)module0220.TWO_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var59 = SubLProcess.currentSubLThread();
        SubLObject var60 = (SubLObject)module0220.NIL;
        if (module0220.NIL != module0158.f10010(var55, var57, var2)) {
            final SubLObject var61 = module0158.f10011(var55, var57, var2);
            SubLObject var62 = (SubLObject)module0220.NIL;
            final SubLObject var63 = (SubLObject)module0220.NIL;
            while (module0220.NIL == var62) {
                final SubLObject var64 = module0052.f3695(var61, var63);
                final SubLObject var65 = (SubLObject)SubLObjectFactory.makeBoolean(!var63.eql(var64));
                if (module0220.NIL != var65) {
                    SubLObject var66 = (SubLObject)module0220.NIL;
                    try {
                        var66 = module0158.f10316(var64, (SubLObject)module0220.$ic5$, var4, (SubLObject)module0220.NIL);
                        SubLObject var9_59 = (SubLObject)module0220.NIL;
                        final SubLObject var10_60 = (SubLObject)module0220.NIL;
                        while (module0220.NIL == var9_59) {
                            final SubLObject var67 = module0052.f3695(var66, var10_60);
                            final SubLObject var12_61 = (SubLObject)SubLObjectFactory.makeBoolean(!var10_60.eql(var67));
                            if (module0220.NIL != var12_61 && module0220.NIL != Functions.funcall(module0018.$g593$.getDynamicValue(var59), module0178.f11331(var67, var58), var56)) {
                                if (module0220.NIL != module0018.$g604$.getDynamicValue(var59)) {
                                    Functions.funcall(module0018.$g604$.getDynamicValue(var59), var67);
                                }
                                var60 = (SubLObject)ConsesLow.cons(var67, var60);
                            }
                            var9_59 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var12_61);
                        }
                    }
                    finally {
                        final SubLObject var68 = Threads.$is_thread_performing_cleanupP$.currentBinding(var59);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0220.T, var59);
                            if (module0220.NIL != var66) {
                                module0158.f10319(var66);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var68, var59);
                        }
                    }
                }
                var62 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var65);
            }
        }
        return var60;
    }
    
    public static SubLObject f14573(final SubLObject var2, final SubLObject var55, final SubLObject var56, SubLObject var57, SubLObject var58, SubLObject var4) {
        if (var57 == module0220.UNPROVIDED) {
            var57 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var58 == module0220.UNPROVIDED) {
            var58 = (SubLObject)module0220.TWO_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var59 = SubLProcess.currentSubLThread();
        SubLObject var60 = (SubLObject)module0220.NIL;
        if (module0220.NIL != module0158.f10010(var55, var57, var2)) {
            final SubLObject var61 = module0158.f10011(var55, var57, var2);
            SubLObject var62 = var60;
            final SubLObject var63 = (SubLObject)module0220.NIL;
            while (module0220.NIL == var62) {
                final SubLObject var64 = module0052.f3695(var61, var63);
                final SubLObject var65 = (SubLObject)SubLObjectFactory.makeBoolean(!var63.eql(var64));
                if (module0220.NIL != var65) {
                    SubLObject var66 = (SubLObject)module0220.NIL;
                    try {
                        var66 = module0158.f10316(var64, (SubLObject)module0220.$ic5$, var4, (SubLObject)module0220.NIL);
                        SubLObject var9_62 = var60;
                        final SubLObject var10_63 = (SubLObject)module0220.NIL;
                        while (module0220.NIL == var9_62) {
                            final SubLObject var67 = module0052.f3695(var66, var10_63);
                            final SubLObject var12_64 = (SubLObject)SubLObjectFactory.makeBoolean(!var10_63.eql(var67));
                            if (module0220.NIL != var12_64 && module0220.NIL != Functions.funcall(module0018.$g593$.getDynamicValue(var59), module0178.f11331(var67, var58), var56)) {
                                if (module0220.NIL != module0018.$g604$.getDynamicValue(var59)) {
                                    Functions.funcall(module0018.$g604$.getDynamicValue(var59), var67);
                                }
                                var60 = var67;
                            }
                            var9_62 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var12_64 || module0220.NIL != var60);
                        }
                    }
                    finally {
                        final SubLObject var68 = Threads.$is_thread_performing_cleanupP$.currentBinding(var59);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0220.T, var59);
                            if (module0220.NIL != var66) {
                                module0158.f10319(var66);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var68, var59);
                        }
                    }
                }
                var62 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var65 || module0220.NIL != var60);
            }
        }
        return var60;
    }
    
    public static SubLObject f14574(final SubLObject var2, final SubLObject var55, final SubLObject var56, SubLObject var19, SubLObject var57, SubLObject var58, SubLObject var4) {
        if (var19 == module0220.UNPROVIDED) {
            var19 = (SubLObject)module0220.NIL;
        }
        if (var57 == module0220.UNPROVIDED) {
            var57 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var58 == module0220.UNPROVIDED) {
            var58 = (SubLObject)module0220.TWO_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var59 = SubLProcess.currentSubLThread();
        SubLObject var60 = (SubLObject)module0220.NIL;
        final SubLObject var61 = var19;
        final SubLObject var62 = module0147.$g2094$.currentBinding(var59);
        final SubLObject var63 = module0147.$g2095$.currentBinding(var59);
        try {
            module0147.$g2094$.bind(module0147.f9531(var61), var59);
            module0147.$g2095$.bind(module0147.f9534(var61), var59);
            var60 = f14572(var2, var55, var56, var57, var58, var4);
        }
        finally {
            module0147.$g2095$.rebind(var63, var59);
            module0147.$g2094$.rebind(var62, var59);
        }
        return var60;
    }
    
    public static SubLObject f14575(final SubLObject var2, final SubLObject var55, final SubLObject var56, SubLObject var19, SubLObject var57, SubLObject var58, SubLObject var4) {
        if (var19 == module0220.UNPROVIDED) {
            var19 = (SubLObject)module0220.NIL;
        }
        if (var57 == module0220.UNPROVIDED) {
            var57 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var58 == module0220.UNPROVIDED) {
            var58 = (SubLObject)module0220.TWO_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var59 = SubLProcess.currentSubLThread();
        SubLObject var60 = (SubLObject)module0220.NIL;
        final SubLObject var61 = var19;
        final SubLObject var62 = module0147.$g2094$.currentBinding(var59);
        final SubLObject var63 = module0147.$g2095$.currentBinding(var59);
        try {
            module0147.$g2094$.bind(module0147.f9531(var61), var59);
            module0147.$g2095$.bind(module0147.f9534(var61), var59);
            var60 = f14573(var2, var55, var56, var57, var58, var4);
        }
        finally {
            module0147.$g2095$.rebind(var63, var59);
            module0147.$g2094$.rebind(var62, var59);
        }
        return var60;
    }
    
    public static SubLObject f14576(final SubLObject var2, final SubLObject var55, final SubLObject var56, SubLObject var57, SubLObject var58, SubLObject var4) {
        if (var57 == module0220.UNPROVIDED) {
            var57 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var58 == module0220.UNPROVIDED) {
            var58 = (SubLObject)module0220.TWO_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var59 = SubLProcess.currentSubLThread();
        SubLObject var60 = (SubLObject)module0220.NIL;
        final SubLObject var61 = module0147.$g2094$.currentBinding(var59);
        final SubLObject var62 = module0147.$g2095$.currentBinding(var59);
        try {
            module0147.$g2094$.bind((SubLObject)module0220.$ic23$, var59);
            module0147.$g2095$.bind(module0220.$ic24$, var59);
            var60 = f14572(var2, var55, var56, var57, var58, var4);
        }
        finally {
            module0147.$g2095$.rebind(var62, var59);
            module0147.$g2094$.rebind(var61, var59);
        }
        return var60;
    }
    
    public static SubLObject f14577(final SubLObject var2, final SubLObject var55, final SubLObject var56, SubLObject var57, SubLObject var58, SubLObject var4) {
        if (var57 == module0220.UNPROVIDED) {
            var57 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var58 == module0220.UNPROVIDED) {
            var58 = (SubLObject)module0220.TWO_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var59 = SubLProcess.currentSubLThread();
        SubLObject var60 = (SubLObject)module0220.NIL;
        final SubLObject var61 = module0147.$g2094$.currentBinding(var59);
        final SubLObject var62 = module0147.$g2095$.currentBinding(var59);
        try {
            module0147.$g2094$.bind((SubLObject)module0220.$ic23$, var59);
            module0147.$g2095$.bind(module0220.$ic24$, var59);
            var60 = f14573(var2, var55, var56, var57, var58, var4);
        }
        finally {
            module0147.$g2095$.rebind(var62, var59);
            module0147.$g2094$.rebind(var61, var59);
        }
        return var60;
    }
    
    public static SubLObject f14578(final SubLObject var2, final SubLObject var55, final SubLObject var56, SubLObject var57, SubLObject var58, SubLObject var4) {
        if (var57 == module0220.UNPROVIDED) {
            var57 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var58 == module0220.UNPROVIDED) {
            var58 = (SubLObject)module0220.TWO_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var59 = SubLProcess.currentSubLThread();
        assert module0220.NIL != module0173.f10955(var2) : var2;
        assert module0220.NIL != module0212.f13762(var55) : var55;
        assert module0220.NIL != module0210.f13572(var56) : var56;
        assert module0220.NIL != Types.integerp(var57) : var57;
        assert module0220.NIL != Types.integerp(var58) : var58;
        assert module0220.NIL != module0130.f8511(var4) : var4;
        SubLObject var60 = (SubLObject)module0220.NIL;
        if (module0220.NIL != module0158.f10010(var55, var57, var2)) {
            final SubLObject var61 = module0158.f10011(var55, var57, var2);
            SubLObject var62 = var60;
            final SubLObject var63 = (SubLObject)module0220.NIL;
            while (module0220.NIL == var62) {
                final SubLObject var64 = module0052.f3695(var61, var63);
                final SubLObject var65 = (SubLObject)SubLObjectFactory.makeBoolean(!var63.eql(var64));
                if (module0220.NIL != var65) {
                    SubLObject var66 = (SubLObject)module0220.NIL;
                    try {
                        var66 = module0158.f10316(var64, (SubLObject)module0220.$ic5$, var4, (SubLObject)module0220.NIL);
                        SubLObject var9_65 = var60;
                        final SubLObject var10_66 = (SubLObject)module0220.NIL;
                        while (module0220.NIL == var9_65) {
                            final SubLObject var67 = module0052.f3695(var66, var10_66);
                            final SubLObject var12_67 = (SubLObject)SubLObjectFactory.makeBoolean(!var10_66.eql(var67));
                            if (module0220.NIL != var12_67 && module0220.NIL != Functions.funcall(module0018.$g593$.getDynamicValue(var59), module0178.f11331(var67, var58), var56)) {
                                if (module0220.NIL != module0018.$g604$.getDynamicValue(var59)) {
                                    Functions.funcall(module0018.$g604$.getDynamicValue(var59), var67);
                                }
                                var60 = (SubLObject)module0220.T;
                            }
                            var9_65 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var12_67 || module0220.NIL != var60);
                        }
                    }
                    finally {
                        final SubLObject var68 = Threads.$is_thread_performing_cleanupP$.currentBinding(var59);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0220.T, var59);
                            if (module0220.NIL != var66) {
                                module0158.f10319(var66);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var68, var59);
                        }
                    }
                }
                var62 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var65 || module0220.NIL != var60);
            }
        }
        return var60;
    }
    
    public static SubLObject f14579(final SubLObject var2, final SubLObject var55, final SubLObject var56, final SubLObject var19, SubLObject var57, SubLObject var58, SubLObject var4) {
        if (var57 == module0220.UNPROVIDED) {
            var57 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var58 == module0220.UNPROVIDED) {
            var58 = (SubLObject)module0220.TWO_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var59 = SubLProcess.currentSubLThread();
        assert module0220.NIL != module0173.f10955(var2) : var2;
        assert module0220.NIL != module0212.f13762(var55) : var55;
        assert module0220.NIL != module0210.f13572(var56) : var56;
        assert module0220.NIL != module0161.f10481(var19) : var19;
        assert module0220.NIL != Types.integerp(var57) : var57;
        assert module0220.NIL != Types.integerp(var58) : var58;
        assert module0220.NIL != module0130.f8511(var4) : var4;
        SubLObject var60 = (SubLObject)module0220.NIL;
        final SubLObject var61 = module0147.$g2094$.currentBinding(var59);
        final SubLObject var62 = module0147.$g2095$.currentBinding(var59);
        try {
            module0147.$g2094$.bind((SubLObject)module0220.$ic12$, var59);
            module0147.$g2095$.bind(var19, var59);
            var60 = f14578(var2, var55, var56, var57, var58, var4);
        }
        finally {
            module0147.$g2095$.rebind(var62, var59);
            module0147.$g2094$.rebind(var61, var59);
        }
        return var60;
    }
    
    public static SubLObject f14580(final SubLObject var2, final SubLObject var55, final SubLObject var56, final SubLObject var21, SubLObject var57, SubLObject var58, SubLObject var4) {
        if (var57 == module0220.UNPROVIDED) {
            var57 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var58 == module0220.UNPROVIDED) {
            var58 = (SubLObject)module0220.TWO_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var59 = SubLProcess.currentSubLThread();
        assert module0220.NIL != module0173.f10955(var2) : var2;
        assert module0220.NIL != module0212.f13762(var55) : var55;
        assert module0220.NIL != module0210.f13572(var56) : var56;
        assert module0220.NIL != Types.listp(var21) : var21;
        assert module0220.NIL != Types.integerp(var57) : var57;
        assert module0220.NIL != Types.integerp(var58) : var58;
        assert module0220.NIL != module0130.f8511(var4) : var4;
        SubLObject var60 = (SubLObject)module0220.NIL;
        final SubLObject var61 = module0147.$g2094$.currentBinding(var59);
        final SubLObject var62 = module0147.$g2096$.currentBinding(var59);
        try {
            module0147.$g2094$.bind((SubLObject)module0220.$ic18$, var59);
            module0147.$g2096$.bind(var21, var59);
            var60 = f14578(var2, var55, var56, var57, var58, var4);
        }
        finally {
            module0147.$g2096$.rebind(var62, var59);
            module0147.$g2094$.rebind(var61, var59);
        }
        return var60;
    }
    
    public static SubLObject f14581(final SubLObject var2, final SubLObject var55, final SubLObject var56, SubLObject var57, SubLObject var58, SubLObject var4) {
        if (var57 == module0220.UNPROVIDED) {
            var57 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var58 == module0220.UNPROVIDED) {
            var58 = (SubLObject)module0220.TWO_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var59 = SubLProcess.currentSubLThread();
        assert module0220.NIL != module0173.f10955(var2) : var2;
        assert module0220.NIL != module0212.f13762(var55) : var55;
        assert module0220.NIL != module0210.f13572(var56) : var56;
        assert module0220.NIL != Types.integerp(var57) : var57;
        assert module0220.NIL != Types.integerp(var58) : var58;
        assert module0220.NIL != module0130.f8511(var4) : var4;
        SubLObject var60 = (SubLObject)module0220.NIL;
        final SubLObject var61 = module0147.$g2094$.currentBinding(var59);
        final SubLObject var62 = module0147.$g2095$.currentBinding(var59);
        try {
            module0147.$g2094$.bind((SubLObject)module0220.$ic23$, var59);
            module0147.$g2095$.bind(module0220.$ic24$, var59);
            var60 = f14578(var2, var55, var56, var57, var58, var4);
        }
        finally {
            module0147.$g2095$.rebind(var62, var59);
            module0147.$g2094$.rebind(var61, var59);
        }
        return var60;
    }
    
    public static SubLObject f14582(final SubLObject var2, final SubLObject var55, final SubLObject var56, SubLObject var19, SubLObject var57, SubLObject var58, SubLObject var4) {
        if (var19 == module0220.UNPROVIDED) {
            var19 = (SubLObject)module0220.NIL;
        }
        if (var57 == module0220.UNPROVIDED) {
            var57 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var58 == module0220.UNPROVIDED) {
            var58 = (SubLObject)module0220.TWO_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var59 = SubLProcess.currentSubLThread();
        assert module0220.NIL != module0173.f10955(var2) : var2;
        assert module0220.NIL != module0212.f13762(var55) : var55;
        assert module0220.NIL != module0210.f13572(var56) : var56;
        assert module0220.NIL != Types.integerp(var57) : var57;
        assert module0220.NIL != Types.integerp(var58) : var58;
        assert module0220.NIL != module0130.f8511(var4) : var4;
        SubLObject var60 = (SubLObject)module0220.NIL;
        final SubLObject var61 = var19;
        final SubLObject var62 = module0147.$g2094$.currentBinding(var59);
        final SubLObject var63 = module0147.$g2095$.currentBinding(var59);
        try {
            module0147.$g2094$.bind(module0147.f9531(var61), var59);
            module0147.$g2095$.bind(module0147.f9534(var61), var59);
            var60 = f14578(var2, var55, var56, var57, var58, var4);
        }
        finally {
            module0147.$g2095$.rebind(var63, var59);
            module0147.$g2094$.rebind(var62, var59);
        }
        return var60;
    }
    
    public static SubLObject f14583(final SubLObject var68, SubLObject var3, SubLObject var4) {
        if (var3 == module0220.UNPROVIDED) {
            var3 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var69 = SubLProcess.currentSubLThread();
        assert module0220.NIL != Types.consp(var68) : var68;
        assert module0220.NIL != Types.integerp(var3) : var3;
        assert module0220.NIL != module0130.f8511(var4) : var4;
        final SubLObject var70 = module0205.f13333(var68);
        final SubLObject var71 = module0205.f13384(var68, var3, (SubLObject)module0220.UNPROVIDED);
        assert module0220.NIL != module0173.f10955(var70) : var70;
        assert module0220.NIL != module0212.f13762(var71) : var71;
        SubLObject var72 = (SubLObject)module0220.NIL;
        final SubLObject var73 = var70;
        if (module0220.NIL != module0158.f10010(var71, var3, var73)) {
            final SubLObject var74 = module0158.f10011(var71, var3, var73);
            SubLObject var75 = var72;
            final SubLObject var76 = (SubLObject)module0220.NIL;
            while (module0220.NIL == var75) {
                final SubLObject var77 = module0052.f3695(var74, var76);
                final SubLObject var78 = (SubLObject)SubLObjectFactory.makeBoolean(!var76.eql(var77));
                if (module0220.NIL != var78) {
                    SubLObject var79 = (SubLObject)module0220.NIL;
                    try {
                        var79 = module0158.f10316(var77, (SubLObject)module0220.$ic5$, var4, (SubLObject)module0220.NIL);
                        SubLObject var9_70 = var72;
                        final SubLObject var10_71 = (SubLObject)module0220.NIL;
                        while (module0220.NIL == var9_70) {
                            final SubLObject var80 = module0052.f3695(var79, var10_71);
                            final SubLObject var12_72 = (SubLObject)SubLObjectFactory.makeBoolean(!var10_71.eql(var80));
                            if (module0220.NIL != var12_72 && module0178.f11285(var80).equal(var68)) {
                                if (module0220.NIL != module0018.$g604$.getDynamicValue(var69)) {
                                    Functions.funcall(module0018.$g604$.getDynamicValue(var69), var80);
                                }
                                var72 = (SubLObject)module0220.T;
                            }
                            var9_70 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var12_72 || module0220.NIL != var72);
                        }
                    }
                    finally {
                        final SubLObject var81 = Threads.$is_thread_performing_cleanupP$.currentBinding(var69);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0220.T, var69);
                            if (module0220.NIL != var79) {
                                module0158.f10319(var79);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var81, var69);
                        }
                    }
                }
                var75 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var78 || module0220.NIL != var72);
            }
        }
        return var72;
    }
    
    public static SubLObject f14584(final SubLObject var68, final SubLObject var19, SubLObject var3, SubLObject var4) {
        if (var3 == module0220.UNPROVIDED) {
            var3 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var69 = SubLProcess.currentSubLThread();
        assert module0220.NIL != module0161.f10481(var19) : var19;
        SubLObject var70 = (SubLObject)module0220.NIL;
        final SubLObject var71 = module0147.$g2094$.currentBinding(var69);
        final SubLObject var72 = module0147.$g2095$.currentBinding(var69);
        try {
            module0147.$g2094$.bind((SubLObject)module0220.$ic12$, var69);
            module0147.$g2095$.bind(var19, var69);
            var70 = f14583(var68, var3, var4);
        }
        finally {
            module0147.$g2095$.rebind(var72, var69);
            module0147.$g2094$.rebind(var71, var69);
        }
        return var70;
    }
    
    public static SubLObject f14585(final SubLObject var68, final SubLObject var21, SubLObject var3, SubLObject var4) {
        if (var3 == module0220.UNPROVIDED) {
            var3 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var69 = SubLProcess.currentSubLThread();
        assert module0220.NIL != Types.listp(var21) : var21;
        SubLObject var70 = (SubLObject)module0220.NIL;
        final SubLObject var71 = module0147.$g2094$.currentBinding(var69);
        final SubLObject var72 = module0147.$g2096$.currentBinding(var69);
        try {
            module0147.$g2094$.bind((SubLObject)module0220.$ic18$, var69);
            module0147.$g2096$.bind(var21, var69);
            var70 = f14583(var68, var3, var4);
        }
        finally {
            module0147.$g2096$.rebind(var72, var69);
            module0147.$g2094$.rebind(var71, var69);
        }
        return var70;
    }
    
    public static SubLObject f14586(final SubLObject var68, SubLObject var3, SubLObject var4) {
        if (var3 == module0220.UNPROVIDED) {
            var3 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var69 = SubLProcess.currentSubLThread();
        SubLObject var70 = (SubLObject)module0220.NIL;
        final SubLObject var71 = module0147.$g2094$.currentBinding(var69);
        final SubLObject var72 = module0147.$g2095$.currentBinding(var69);
        try {
            module0147.$g2094$.bind((SubLObject)module0220.$ic23$, var69);
            module0147.$g2095$.bind(module0220.$ic24$, var69);
            var70 = f14583(var68, var3, var4);
        }
        finally {
            module0147.$g2095$.rebind(var72, var69);
            module0147.$g2094$.rebind(var71, var69);
        }
        return var70;
    }
    
    public static SubLObject f14587(final SubLObject var68, SubLObject var19, SubLObject var3, SubLObject var4) {
        if (var19 == module0220.UNPROVIDED) {
            var19 = (SubLObject)module0220.NIL;
        }
        if (var3 == module0220.UNPROVIDED) {
            var3 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var69 = SubLProcess.currentSubLThread();
        SubLObject var70 = (SubLObject)module0220.NIL;
        final SubLObject var71 = var19;
        final SubLObject var72 = module0147.$g2094$.currentBinding(var69);
        final SubLObject var73 = module0147.$g2095$.currentBinding(var69);
        try {
            module0147.$g2094$.bind(module0147.f9531(var71), var69);
            module0147.$g2095$.bind(module0147.f9534(var71), var69);
            var70 = f14583(var68, var3, var4);
        }
        finally {
            module0147.$g2095$.rebind(var73, var69);
            module0147.$g2094$.rebind(var72, var69);
        }
        return var70;
    }
    
    public static SubLObject f14588(final SubLObject var1, final SubLObject var2, final SubLObject var73, SubLObject var3, SubLObject var31, SubLObject var4) {
        if (var3 == module0220.UNPROVIDED) {
            var3 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var31 == module0220.UNPROVIDED) {
            var31 = (SubLObject)module0220.TWO_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var74 = SubLProcess.currentSubLThread();
        assert module0220.NIL != module0212.f13762(var1) : var1;
        assert module0220.NIL != module0173.f10955(var2) : var2;
        assert module0220.NIL != module0210.f13572(var73) : var73;
        assert module0220.NIL != Types.integerp(var3) : var3;
        assert module0220.NIL != Types.integerp(var31) : var31;
        assert module0220.NIL != module0130.f8511(var4) : var4;
        SubLObject var75 = (SubLObject)module0220.NIL;
        if (module0220.NIL != module0158.f10010(var1, var3, var2)) {
            final SubLObject var76 = module0158.f10011(var1, var3, var2);
            SubLObject var77 = (SubLObject)module0220.NIL;
            final SubLObject var78 = (SubLObject)module0220.NIL;
            while (module0220.NIL == var77) {
                final SubLObject var79 = module0052.f3695(var76, var78);
                final SubLObject var80 = (SubLObject)SubLObjectFactory.makeBoolean(!var78.eql(var79));
                if (module0220.NIL != var80) {
                    SubLObject var81 = (SubLObject)module0220.NIL;
                    try {
                        var81 = module0158.f10316(var79, (SubLObject)module0220.$ic5$, var4, (SubLObject)module0220.NIL);
                        SubLObject var9_74 = (SubLObject)module0220.NIL;
                        final SubLObject var10_75 = (SubLObject)module0220.NIL;
                        while (module0220.NIL == var9_74) {
                            final SubLObject var82 = module0052.f3695(var81, var10_75);
                            final SubLObject var12_76 = (SubLObject)SubLObjectFactory.makeBoolean(!var10_75.eql(var82));
                            if (module0220.NIL != var12_76) {
                                final SubLObject var83 = module0178.f11331(var82, var31);
                                if (module0220.NIL != module0035.f2428(var73, var83, (SubLObject)module0220.UNPROVIDED, (SubLObject)module0220.UNPROVIDED)) {
                                    if (module0220.NIL != module0018.$g604$.getDynamicValue(var74)) {
                                        Functions.funcall(module0018.$g604$.getDynamicValue(var74), var82);
                                    }
                                    if (module0220.NIL != module0018.$g593$.getDynamicValue(var74)) {
                                        final SubLObject var84 = var83;
                                        if (module0220.NIL == conses_high.member(var84, var75, module0018.$g593$.getDynamicValue(var74), Symbols.symbol_function((SubLObject)module0220.IDENTITY))) {
                                            var75 = (SubLObject)ConsesLow.cons(var84, var75);
                                        }
                                    }
                                    else {
                                        var75 = (SubLObject)ConsesLow.cons(var83, var75);
                                    }
                                }
                            }
                            var9_74 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var12_76);
                        }
                    }
                    finally {
                        final SubLObject var85 = Threads.$is_thread_performing_cleanupP$.currentBinding(var74);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0220.T, var74);
                            if (module0220.NIL != var81) {
                                module0158.f10319(var81);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var85, var74);
                        }
                    }
                }
                var77 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var80);
            }
        }
        return var75;
    }
    
    public static SubLObject f14589(final SubLObject var1, final SubLObject var2, final SubLObject var73, final SubLObject var19, SubLObject var3, SubLObject var31, SubLObject var4) {
        if (var3 == module0220.UNPROVIDED) {
            var3 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var31 == module0220.UNPROVIDED) {
            var31 = (SubLObject)module0220.TWO_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var74 = SubLProcess.currentSubLThread();
        assert module0220.NIL != module0161.f10481(var19) : var19;
        SubLObject var75 = (SubLObject)module0220.NIL;
        final SubLObject var76 = module0147.$g2094$.currentBinding(var74);
        final SubLObject var77 = module0147.$g2095$.currentBinding(var74);
        try {
            module0147.$g2094$.bind((SubLObject)module0220.$ic12$, var74);
            module0147.$g2095$.bind(var19, var74);
            var75 = f14588(var1, var2, var73, var3, var31, var4);
        }
        finally {
            module0147.$g2095$.rebind(var77, var74);
            module0147.$g2094$.rebind(var76, var74);
        }
        return var75;
    }
    
    public static SubLObject f14590(final SubLObject var1, final SubLObject var2, final SubLObject var73, final SubLObject var21, SubLObject var3, SubLObject var31, SubLObject var4) {
        if (var3 == module0220.UNPROVIDED) {
            var3 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var31 == module0220.UNPROVIDED) {
            var31 = (SubLObject)module0220.TWO_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var74 = SubLProcess.currentSubLThread();
        assert module0220.NIL != Types.listp(var21) : var21;
        SubLObject var75 = (SubLObject)module0220.NIL;
        final SubLObject var76 = module0147.$g2094$.currentBinding(var74);
        final SubLObject var77 = module0147.$g2096$.currentBinding(var74);
        try {
            module0147.$g2094$.bind((SubLObject)module0220.$ic18$, var74);
            module0147.$g2096$.bind(var21, var74);
            var75 = f14588(var1, var2, var73, var3, var31, var4);
        }
        finally {
            module0147.$g2096$.rebind(var77, var74);
            module0147.$g2094$.rebind(var76, var74);
        }
        return var75;
    }
    
    public static SubLObject f14591(final SubLObject var1, final SubLObject var2, final SubLObject var73, SubLObject var3, SubLObject var31, SubLObject var4) {
        if (var3 == module0220.UNPROVIDED) {
            var3 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var31 == module0220.UNPROVIDED) {
            var31 = (SubLObject)module0220.TWO_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var74 = SubLProcess.currentSubLThread();
        SubLObject var75 = (SubLObject)module0220.NIL;
        final SubLObject var76 = module0147.$g2094$.currentBinding(var74);
        final SubLObject var77 = module0147.$g2095$.currentBinding(var74);
        try {
            module0147.$g2094$.bind((SubLObject)module0220.$ic23$, var74);
            module0147.$g2095$.bind(module0220.$ic24$, var74);
            var75 = f14588(var1, var2, var73, var3, var31, var4);
        }
        finally {
            module0147.$g2095$.rebind(var77, var74);
            module0147.$g2094$.rebind(var76, var74);
        }
        return var75;
    }
    
    public static SubLObject f14592(final SubLObject var1, final SubLObject var2, final SubLObject var73, SubLObject var19, SubLObject var3, SubLObject var31, SubLObject var4) {
        if (var19 == module0220.UNPROVIDED) {
            var19 = (SubLObject)module0220.NIL;
        }
        if (var3 == module0220.UNPROVIDED) {
            var3 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var31 == module0220.UNPROVIDED) {
            var31 = (SubLObject)module0220.TWO_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var74 = SubLProcess.currentSubLThread();
        SubLObject var75 = (SubLObject)module0220.NIL;
        final SubLObject var76 = var19;
        final SubLObject var77 = module0147.$g2094$.currentBinding(var74);
        final SubLObject var78 = module0147.$g2095$.currentBinding(var74);
        try {
            module0147.$g2094$.bind(module0147.f9531(var76), var74);
            module0147.$g2095$.bind(module0147.f9534(var76), var74);
            var75 = f14588(var1, var2, var73, var3, var31, var4);
        }
        finally {
            module0147.$g2095$.rebind(var78, var74);
            module0147.$g2094$.rebind(var77, var74);
        }
        return var75;
    }
    
    public static SubLObject f14593(final SubLObject var1, final SubLObject var2, final SubLObject var77, SubLObject var78, SubLObject var79, SubLObject var80, SubLObject var4) {
        if (var78 == module0220.UNPROVIDED) {
            var78 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var79 == module0220.UNPROVIDED) {
            var79 = (SubLObject)module0220.TWO_INTEGER;
        }
        if (var80 == module0220.UNPROVIDED) {
            var80 = (SubLObject)module0220.THREE_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var81 = SubLProcess.currentSubLThread();
        assert module0220.NIL != module0212.f13762(var1) : var1;
        assert module0220.NIL != module0173.f10955(var2) : var2;
        assert module0220.NIL != Types.integerp(var78) : var78;
        assert module0220.NIL != Types.integerp(var79) : var79;
        assert module0220.NIL != Types.integerp(var80) : var80;
        assert module0220.NIL != module0130.f8511(var4) : var4;
        SubLObject var82 = (SubLObject)module0220.NIL;
        if (module0220.NIL != module0158.f10010(var1, var78, var2)) {
            final SubLObject var83 = module0158.f10011(var1, var78, var2);
            SubLObject var84 = (SubLObject)module0220.NIL;
            final SubLObject var85 = (SubLObject)module0220.NIL;
            while (module0220.NIL == var84) {
                final SubLObject var86 = module0052.f3695(var83, var85);
                final SubLObject var87 = (SubLObject)SubLObjectFactory.makeBoolean(!var85.eql(var86));
                if (module0220.NIL != var87) {
                    SubLObject var88 = (SubLObject)module0220.NIL;
                    try {
                        var88 = module0158.f10316(var86, (SubLObject)module0220.$ic5$, var4, (SubLObject)module0220.NIL);
                        SubLObject var9_81 = (SubLObject)module0220.NIL;
                        final SubLObject var10_82 = (SubLObject)module0220.NIL;
                        while (module0220.NIL == var9_81) {
                            final SubLObject var89 = module0052.f3695(var88, var10_82);
                            final SubLObject var12_83 = (SubLObject)SubLObjectFactory.makeBoolean(!var10_82.eql(var89));
                            if (module0220.NIL != var12_83 && var77.equalp(module0178.f11331(var89, var79))) {
                                if (module0220.NIL != module0018.$g604$.getDynamicValue(var81)) {
                                    Functions.funcall(module0018.$g604$.getDynamicValue(var81), var89);
                                }
                                if (module0220.NIL != module0018.$g593$.getDynamicValue(var81)) {
                                    final SubLObject var90 = module0178.f11331(var89, var80);
                                    if (module0220.NIL == conses_high.member(var90, var82, module0018.$g593$.getDynamicValue(var81), Symbols.symbol_function((SubLObject)module0220.IDENTITY))) {
                                        var82 = (SubLObject)ConsesLow.cons(var90, var82);
                                    }
                                }
                                else {
                                    var82 = (SubLObject)ConsesLow.cons(module0178.f11331(var89, var80), var82);
                                }
                            }
                            var9_81 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var12_83);
                        }
                    }
                    finally {
                        final SubLObject var91 = Threads.$is_thread_performing_cleanupP$.currentBinding(var81);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0220.T, var81);
                            if (module0220.NIL != var88) {
                                module0158.f10319(var88);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var91, var81);
                        }
                    }
                }
                var84 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var87);
            }
        }
        return var82;
    }
    
    public static SubLObject f14594(final SubLObject var1, final SubLObject var2, final SubLObject var77, final SubLObject var19, SubLObject var78, SubLObject var79, SubLObject var80, SubLObject var4) {
        if (var78 == module0220.UNPROVIDED) {
            var78 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var79 == module0220.UNPROVIDED) {
            var79 = (SubLObject)module0220.TWO_INTEGER;
        }
        if (var80 == module0220.UNPROVIDED) {
            var80 = (SubLObject)module0220.THREE_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var81 = SubLProcess.currentSubLThread();
        assert module0220.NIL != module0161.f10481(var19) : var19;
        SubLObject var82 = (SubLObject)module0220.NIL;
        final SubLObject var83 = module0147.$g2094$.currentBinding(var81);
        final SubLObject var84 = module0147.$g2095$.currentBinding(var81);
        try {
            module0147.$g2094$.bind((SubLObject)module0220.$ic12$, var81);
            module0147.$g2095$.bind(var19, var81);
            var82 = f14593(var1, var2, var77, var78, var79, var80, var4);
        }
        finally {
            module0147.$g2095$.rebind(var84, var81);
            module0147.$g2094$.rebind(var83, var81);
        }
        return var82;
    }
    
    public static SubLObject f14595(final SubLObject var1, final SubLObject var2, final SubLObject var77, final SubLObject var21, SubLObject var78, SubLObject var79, SubLObject var80, SubLObject var4) {
        if (var78 == module0220.UNPROVIDED) {
            var78 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var79 == module0220.UNPROVIDED) {
            var79 = (SubLObject)module0220.TWO_INTEGER;
        }
        if (var80 == module0220.UNPROVIDED) {
            var80 = (SubLObject)module0220.THREE_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var81 = SubLProcess.currentSubLThread();
        assert module0220.NIL != Types.listp(var21) : var21;
        SubLObject var82 = (SubLObject)module0220.NIL;
        final SubLObject var83 = module0147.$g2094$.currentBinding(var81);
        final SubLObject var84 = module0147.$g2096$.currentBinding(var81);
        try {
            module0147.$g2094$.bind((SubLObject)module0220.$ic18$, var81);
            module0147.$g2096$.bind(var21, var81);
            var82 = f14593(var1, var2, var77, var78, var79, var80, var4);
        }
        finally {
            module0147.$g2096$.rebind(var84, var81);
            module0147.$g2094$.rebind(var83, var81);
        }
        return var82;
    }
    
    public static SubLObject f14596(final SubLObject var1, final SubLObject var2, final SubLObject var77, SubLObject var78, SubLObject var79, SubLObject var80, SubLObject var4) {
        if (var78 == module0220.UNPROVIDED) {
            var78 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var79 == module0220.UNPROVIDED) {
            var79 = (SubLObject)module0220.TWO_INTEGER;
        }
        if (var80 == module0220.UNPROVIDED) {
            var80 = (SubLObject)module0220.THREE_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var81 = SubLProcess.currentSubLThread();
        SubLObject var82 = (SubLObject)module0220.NIL;
        final SubLObject var83 = module0147.$g2094$.currentBinding(var81);
        final SubLObject var84 = module0147.$g2095$.currentBinding(var81);
        try {
            module0147.$g2094$.bind((SubLObject)module0220.$ic23$, var81);
            module0147.$g2095$.bind(module0220.$ic24$, var81);
            var82 = f14593(var1, var2, var77, var78, var79, var80, var4);
        }
        finally {
            module0147.$g2095$.rebind(var84, var81);
            module0147.$g2094$.rebind(var83, var81);
        }
        return var82;
    }
    
    public static SubLObject f14597(final SubLObject var1, final SubLObject var2, final SubLObject var77, SubLObject var19, SubLObject var78, SubLObject var79, SubLObject var80, SubLObject var4) {
        if (var19 == module0220.UNPROVIDED) {
            var19 = (SubLObject)module0220.NIL;
        }
        if (var78 == module0220.UNPROVIDED) {
            var78 = (SubLObject)module0220.ONE_INTEGER;
        }
        if (var79 == module0220.UNPROVIDED) {
            var79 = (SubLObject)module0220.TWO_INTEGER;
        }
        if (var80 == module0220.UNPROVIDED) {
            var80 = (SubLObject)module0220.THREE_INTEGER;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var81 = SubLProcess.currentSubLThread();
        SubLObject var82 = (SubLObject)module0220.NIL;
        final SubLObject var83 = var19;
        final SubLObject var84 = module0147.$g2094$.currentBinding(var81);
        final SubLObject var85 = module0147.$g2095$.currentBinding(var81);
        try {
            module0147.$g2094$.bind(module0147.f9531(var83), var81);
            module0147.$g2095$.bind(module0147.f9534(var83), var81);
            var82 = f14593(var1, var2, var77, var78, var79, var80, var4);
        }
        finally {
            module0147.$g2095$.rebind(var85, var81);
            module0147.$g2094$.rebind(var84, var81);
        }
        return var82;
    }
    
    public static SubLObject f14598(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var84, SubLObject var4) {
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var85 = SubLProcess.currentSubLThread();
        assert module0220.NIL != module0212.f13762(var1) : var1;
        assert module0220.NIL != module0173.f10955(var2) : var2;
        assert module0220.NIL != Types.integerp(var3) : var3;
        assert module0220.NIL != Types.listp(var84) : var84;
        assert module0220.NIL != module0130.f8511(var4) : var4;
        if (module0220.NIL == Errors.$ignore_mustsP$.getDynamicValue(var85) && module0220.NIL == module0035.f2370(Symbols.symbol_function((SubLObject)module0220.$ic3$), var84, (SubLObject)module0220.UNPROVIDED)) {
            Errors.error((SubLObject)module0220.$ic96$);
        }
        SubLObject var86 = (SubLObject)module0220.NIL;
        if (module0220.NIL != module0158.f10010(var1, var3, var2)) {
            final SubLObject var87 = module0158.f10011(var1, var3, var2);
            SubLObject var88 = (SubLObject)module0220.NIL;
            final SubLObject var89 = (SubLObject)module0220.NIL;
            while (module0220.NIL == var88) {
                final SubLObject var90 = module0052.f3695(var87, var89);
                final SubLObject var91 = (SubLObject)SubLObjectFactory.makeBoolean(!var89.eql(var90));
                if (module0220.NIL != var91) {
                    SubLObject var92 = (SubLObject)module0220.NIL;
                    try {
                        var92 = module0158.f10316(var90, (SubLObject)module0220.$ic5$, var4, (SubLObject)module0220.NIL);
                        SubLObject var9_85 = (SubLObject)module0220.NIL;
                        final SubLObject var10_86 = (SubLObject)module0220.NIL;
                        while (module0220.NIL == var9_85) {
                            final SubLObject var93 = module0052.f3695(var92, var10_86);
                            final SubLObject var12_87 = (SubLObject)SubLObjectFactory.makeBoolean(!var10_86.eql(var93));
                            if (module0220.NIL != var12_87) {
                                SubLObject var94 = (SubLObject)module0220.NIL;
                                SubLObject var95 = var84;
                                SubLObject var96 = (SubLObject)module0220.NIL;
                                var96 = var95.first();
                                while (module0220.NIL != var95) {
                                    var94 = (SubLObject)ConsesLow.cons(module0178.f11331(var93, var96), var94);
                                    var95 = var95.rest();
                                    var96 = var95.first();
                                }
                                var94 = Sequences.nreverse(var94);
                                if (module0220.NIL != module0018.$g604$.getDynamicValue(var85)) {
                                    Functions.funcall(module0018.$g604$.getDynamicValue(var85), var93);
                                }
                                if (module0220.NIL != module0018.$g593$.getDynamicValue(var85)) {
                                    final SubLObject var97 = var94;
                                    if (module0220.NIL == conses_high.member(var97, var86, module0018.$g593$.getDynamicValue(var85), Symbols.symbol_function((SubLObject)module0220.IDENTITY))) {
                                        var86 = (SubLObject)ConsesLow.cons(var97, var86);
                                    }
                                }
                                else {
                                    var86 = (SubLObject)ConsesLow.cons(var94, var86);
                                }
                            }
                            var9_85 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var12_87);
                        }
                    }
                    finally {
                        final SubLObject var98 = Threads.$is_thread_performing_cleanupP$.currentBinding(var85);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0220.T, var85);
                            if (module0220.NIL != var92) {
                                module0158.f10319(var92);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var98, var85);
                        }
                    }
                }
                var88 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var91);
            }
        }
        return var86;
    }
    
    public static SubLObject f14599(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var84, final SubLObject var19, SubLObject var4) {
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var85 = SubLProcess.currentSubLThread();
        assert module0220.NIL != module0212.f13762(var1) : var1;
        assert module0220.NIL != module0173.f10955(var2) : var2;
        assert module0220.NIL != Types.integerp(var3) : var3;
        assert module0220.NIL != Types.listp(var84) : var84;
        assert module0220.NIL != module0161.f10481(var19) : var19;
        assert module0220.NIL != module0130.f8511(var4) : var4;
        SubLObject var86 = (SubLObject)module0220.NIL;
        final SubLObject var87 = module0147.$g2094$.currentBinding(var85);
        final SubLObject var88 = module0147.$g2095$.currentBinding(var85);
        try {
            module0147.$g2094$.bind((SubLObject)module0220.$ic12$, var85);
            module0147.$g2095$.bind(var19, var85);
            var86 = f14598(var1, var2, var3, var84, var4);
        }
        finally {
            module0147.$g2095$.rebind(var88, var85);
            module0147.$g2094$.rebind(var87, var85);
        }
        return var86;
    }
    
    public static SubLObject f14600(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var84, final SubLObject var21, SubLObject var4) {
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var85 = SubLProcess.currentSubLThread();
        assert module0220.NIL != module0212.f13762(var1) : var1;
        assert module0220.NIL != module0173.f10955(var2) : var2;
        assert module0220.NIL != Types.integerp(var3) : var3;
        assert module0220.NIL != Types.listp(var84) : var84;
        assert module0220.NIL != Types.listp(var21) : var21;
        assert module0220.NIL != module0130.f8511(var4) : var4;
        SubLObject var86 = (SubLObject)module0220.NIL;
        final SubLObject var87 = module0147.$g2094$.currentBinding(var85);
        final SubLObject var88 = module0147.$g2096$.currentBinding(var85);
        try {
            module0147.$g2094$.bind((SubLObject)module0220.$ic18$, var85);
            module0147.$g2096$.bind(var21, var85);
            var86 = f14598(var1, var2, var3, var84, var4);
        }
        finally {
            module0147.$g2096$.rebind(var88, var85);
            module0147.$g2094$.rebind(var87, var85);
        }
        return var86;
    }
    
    public static SubLObject f14601(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var84, SubLObject var4) {
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var85 = SubLProcess.currentSubLThread();
        assert module0220.NIL != module0212.f13762(var1) : var1;
        assert module0220.NIL != module0173.f10955(var2) : var2;
        assert module0220.NIL != Types.integerp(var3) : var3;
        assert module0220.NIL != Types.listp(var84) : var84;
        assert module0220.NIL != module0130.f8511(var4) : var4;
        SubLObject var86 = (SubLObject)module0220.NIL;
        final SubLObject var87 = module0147.$g2094$.currentBinding(var85);
        final SubLObject var88 = module0147.$g2095$.currentBinding(var85);
        try {
            module0147.$g2094$.bind((SubLObject)module0220.$ic23$, var85);
            module0147.$g2095$.bind(module0220.$ic24$, var85);
            var86 = f14598(var1, var2, var3, var84, var4);
        }
        finally {
            module0147.$g2095$.rebind(var88, var85);
            module0147.$g2094$.rebind(var87, var85);
        }
        return var86;
    }
    
    public static SubLObject f14602(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var84, SubLObject var19, SubLObject var4) {
        if (var19 == module0220.UNPROVIDED) {
            var19 = (SubLObject)module0220.NIL;
        }
        if (var4 == module0220.UNPROVIDED) {
            var4 = (SubLObject)module0220.$ic0$;
        }
        final SubLThread var85 = SubLProcess.currentSubLThread();
        assert module0220.NIL != module0212.f13762(var1) : var1;
        assert module0220.NIL != module0173.f10955(var2) : var2;
        assert module0220.NIL != Types.integerp(var3) : var3;
        assert module0220.NIL != Types.listp(var84) : var84;
        assert module0220.NIL != module0130.f8511(var4) : var4;
        SubLObject var86 = (SubLObject)module0220.NIL;
        final SubLObject var87 = var19;
        final SubLObject var88 = module0147.$g2094$.currentBinding(var85);
        final SubLObject var89 = module0147.$g2095$.currentBinding(var85);
        try {
            module0147.$g2094$.bind(module0147.f9531(var87), var85);
            module0147.$g2095$.bind(module0147.f9534(var87), var85);
            var86 = f14598(var1, var2, var3, var84, var4);
        }
        finally {
            module0147.$g2095$.rebind(var89, var85);
            module0147.$g2094$.rebind(var88, var85);
        }
        return var86;
    }
    
    public static SubLObject f14603(final SubLObject var89) {
        final SubLThread var90 = SubLProcess.currentSubLThread();
        SubLObject var91 = (SubLObject)module0220.NIL;
        final SubLObject var92 = module0217.f14404(var89, (SubLObject)module0220.NIL, (SubLObject)module0220.NIL);
        final SubLObject var94;
        final SubLObject var93 = var94 = module0158.f10294(var92);
        if (var94.eql((SubLObject)module0220.$ic115$)) {
            var90.resetMultipleValues();
            final SubLObject var95 = module0158.f10297(var92);
            final SubLObject var96 = var90.secondMultipleValue();
            final SubLObject var97 = var90.thirdMultipleValue();
            var90.resetMultipleValues();
            if (module0220.NIL != var96) {
                if (module0220.NIL != var97) {
                    final SubLObject var98 = var97;
                    if (module0220.NIL != module0158.f10010(var95, var96, var98)) {
                        final SubLObject var99 = module0158.f10011(var95, var96, var98);
                        SubLObject var100 = var91;
                        final SubLObject var101 = (SubLObject)module0220.NIL;
                        while (module0220.NIL == var100) {
                            final SubLObject var102 = module0052.f3695(var99, var101);
                            final SubLObject var103 = (SubLObject)SubLObjectFactory.makeBoolean(!var101.eql(var102));
                            if (module0220.NIL != var103) {
                                SubLObject var104 = (SubLObject)module0220.NIL;
                                try {
                                    var104 = module0158.f10316(var102, (SubLObject)module0220.$ic5$, (SubLObject)module0220.NIL, (SubLObject)module0220.NIL);
                                    SubLObject var9_96 = var91;
                                    final SubLObject var10_97 = (SubLObject)module0220.NIL;
                                    while (module0220.NIL == var9_96) {
                                        final SubLObject var105 = module0052.f3695(var104, var10_97);
                                        final SubLObject var12_98 = (SubLObject)SubLObjectFactory.makeBoolean(!var10_97.eql(var105));
                                        if (module0220.NIL != var12_98 && module0220.NIL != module0235.f15475(var89, module0178.f11285(var105), (SubLObject)module0220.UNPROVIDED, (SubLObject)module0220.UNPROVIDED)) {
                                            var91 = module0178.f11292(var105);
                                        }
                                        var9_96 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var12_98 || module0220.NIL != var91);
                                    }
                                }
                                finally {
                                    final SubLObject var106 = Threads.$is_thread_performing_cleanupP$.currentBinding(var90);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0220.T, var90);
                                        if (module0220.NIL != var104) {
                                            module0158.f10319(var104);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var106, var90);
                                    }
                                }
                            }
                            var100 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var103 || module0220.NIL != var91);
                        }
                    }
                }
                else {
                    final SubLObject var98 = (SubLObject)module0220.NIL;
                    if (module0220.NIL != module0158.f10010(var95, var96, var98)) {
                        final SubLObject var99 = module0158.f10011(var95, var96, var98);
                        SubLObject var100 = var91;
                        final SubLObject var101 = (SubLObject)module0220.NIL;
                        while (module0220.NIL == var100) {
                            final SubLObject var102 = module0052.f3695(var99, var101);
                            final SubLObject var103 = (SubLObject)SubLObjectFactory.makeBoolean(!var101.eql(var102));
                            if (module0220.NIL != var103) {
                                SubLObject var104 = (SubLObject)module0220.NIL;
                                try {
                                    var104 = module0158.f10316(var102, (SubLObject)module0220.$ic5$, (SubLObject)module0220.NIL, (SubLObject)module0220.NIL);
                                    SubLObject var9_97 = var91;
                                    final SubLObject var10_98 = (SubLObject)module0220.NIL;
                                    while (module0220.NIL == var9_97) {
                                        final SubLObject var105 = module0052.f3695(var104, var10_98);
                                        final SubLObject var12_99 = (SubLObject)SubLObjectFactory.makeBoolean(!var10_98.eql(var105));
                                        if (module0220.NIL != var12_99 && module0220.NIL != module0235.f15475(var89, module0178.f11285(var105), (SubLObject)module0220.UNPROVIDED, (SubLObject)module0220.UNPROVIDED)) {
                                            var91 = module0178.f11292(var105);
                                        }
                                        var9_97 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var12_99 || module0220.NIL != var91);
                                    }
                                }
                                finally {
                                    final SubLObject var107 = Threads.$is_thread_performing_cleanupP$.currentBinding(var90);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0220.T, var90);
                                        if (module0220.NIL != var104) {
                                            module0158.f10319(var104);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var107, var90);
                                    }
                                }
                            }
                            var100 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var103 || module0220.NIL != var91);
                        }
                    }
                }
            }
            else if (module0220.NIL != var97) {
                final SubLObject var98 = var97;
                if (module0220.NIL != module0158.f10010(var95, (SubLObject)module0220.NIL, var98)) {
                    final SubLObject var99 = module0158.f10011(var95, (SubLObject)module0220.NIL, var98);
                    SubLObject var100 = var91;
                    final SubLObject var101 = (SubLObject)module0220.NIL;
                    while (module0220.NIL == var100) {
                        final SubLObject var102 = module0052.f3695(var99, var101);
                        final SubLObject var103 = (SubLObject)SubLObjectFactory.makeBoolean(!var101.eql(var102));
                        if (module0220.NIL != var103) {
                            SubLObject var104 = (SubLObject)module0220.NIL;
                            try {
                                var104 = module0158.f10316(var102, (SubLObject)module0220.$ic5$, (SubLObject)module0220.NIL, (SubLObject)module0220.NIL);
                                SubLObject var9_98 = var91;
                                final SubLObject var10_99 = (SubLObject)module0220.NIL;
                                while (module0220.NIL == var9_98) {
                                    final SubLObject var105 = module0052.f3695(var104, var10_99);
                                    final SubLObject var12_100 = (SubLObject)SubLObjectFactory.makeBoolean(!var10_99.eql(var105));
                                    if (module0220.NIL != var12_100 && module0220.NIL != module0235.f15475(var89, module0178.f11285(var105), (SubLObject)module0220.UNPROVIDED, (SubLObject)module0220.UNPROVIDED)) {
                                        var91 = module0178.f11292(var105);
                                    }
                                    var9_98 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var12_100 || module0220.NIL != var91);
                                }
                            }
                            finally {
                                final SubLObject var108 = Threads.$is_thread_performing_cleanupP$.currentBinding(var90);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0220.T, var90);
                                    if (module0220.NIL != var104) {
                                        module0158.f10319(var104);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var108, var90);
                                }
                            }
                        }
                        var100 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var103 || module0220.NIL != var91);
                    }
                }
            }
            else {
                final SubLObject var98 = (SubLObject)module0220.NIL;
                if (module0220.NIL != module0158.f10010(var95, (SubLObject)module0220.NIL, var98)) {
                    final SubLObject var99 = module0158.f10011(var95, (SubLObject)module0220.NIL, var98);
                    SubLObject var100 = var91;
                    final SubLObject var101 = (SubLObject)module0220.NIL;
                    while (module0220.NIL == var100) {
                        final SubLObject var102 = module0052.f3695(var99, var101);
                        final SubLObject var103 = (SubLObject)SubLObjectFactory.makeBoolean(!var101.eql(var102));
                        if (module0220.NIL != var103) {
                            SubLObject var104 = (SubLObject)module0220.NIL;
                            try {
                                var104 = module0158.f10316(var102, (SubLObject)module0220.$ic5$, (SubLObject)module0220.NIL, (SubLObject)module0220.NIL);
                                SubLObject var9_99 = var91;
                                final SubLObject var10_100 = (SubLObject)module0220.NIL;
                                while (module0220.NIL == var9_99) {
                                    final SubLObject var105 = module0052.f3695(var104, var10_100);
                                    final SubLObject var12_101 = (SubLObject)SubLObjectFactory.makeBoolean(!var10_100.eql(var105));
                                    if (module0220.NIL != var12_101 && module0220.NIL != module0235.f15475(var89, module0178.f11285(var105), (SubLObject)module0220.UNPROVIDED, (SubLObject)module0220.UNPROVIDED)) {
                                        var91 = module0178.f11292(var105);
                                    }
                                    var9_99 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var12_101 || module0220.NIL != var91);
                                }
                            }
                            finally {
                                final SubLObject var109 = Threads.$is_thread_performing_cleanupP$.currentBinding(var90);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0220.T, var90);
                                    if (module0220.NIL != var104) {
                                        module0158.f10319(var104);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var109, var90);
                                }
                            }
                        }
                        var100 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var103 || module0220.NIL != var91);
                    }
                }
            }
        }
        else if (var94.eql((SubLObject)module0220.$ic116$)) {
            final SubLObject var110 = module0158.f10299(var92);
            if (module0220.NIL != module0158.f10038(var110)) {
                final SubLObject var111 = (SubLObject)module0220.NIL;
                final SubLObject var112 = module0012.$g73$.currentBinding(var90);
                final SubLObject var113 = module0012.$g65$.currentBinding(var90);
                final SubLObject var114 = module0012.$g67$.currentBinding(var90);
                final SubLObject var115 = module0012.$g68$.currentBinding(var90);
                final SubLObject var116 = module0012.$g66$.currentBinding(var90);
                final SubLObject var117 = module0012.$g69$.currentBinding(var90);
                final SubLObject var118 = module0012.$g70$.currentBinding(var90);
                final SubLObject var119 = module0012.$silent_progressP$.currentBinding(var90);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var90);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var90), var90);
                    module0012.$g67$.bind((SubLObject)module0220.ONE_INTEGER, var90);
                    module0012.$g68$.bind((SubLObject)module0220.ZERO_INTEGER, var90);
                    module0012.$g66$.bind((SubLObject)module0220.ZERO_INTEGER, var90);
                    module0012.$g69$.bind((SubLObject)module0220.ZERO_INTEGER, var90);
                    module0012.$g70$.bind((SubLObject)module0220.T, var90);
                    module0012.$silent_progressP$.bind((SubLObject)((module0220.NIL != var111) ? module0012.$silent_progressP$.getDynamicValue(var90) : module0220.T), var90);
                    module0012.f474(var111);
                    final SubLObject var120 = module0158.f10039(var110);
                    SubLObject var121 = var91;
                    final SubLObject var122 = (SubLObject)module0220.NIL;
                    while (module0220.NIL == var121) {
                        final SubLObject var123 = module0052.f3695(var120, var122);
                        final SubLObject var124 = (SubLObject)SubLObjectFactory.makeBoolean(!var122.eql(var123));
                        if (module0220.NIL != var124) {
                            module0012.f476();
                            SubLObject var125 = (SubLObject)module0220.NIL;
                            try {
                                var125 = module0158.f10316(var123, (SubLObject)module0220.$ic5$, (SubLObject)module0220.NIL, (SubLObject)module0220.NIL);
                                SubLObject var9_100 = var91;
                                final SubLObject var10_101 = (SubLObject)module0220.NIL;
                                while (module0220.NIL == var9_100) {
                                    final SubLObject var126 = module0052.f3695(var125, var10_101);
                                    final SubLObject var12_102 = (SubLObject)SubLObjectFactory.makeBoolean(!var10_101.eql(var126));
                                    if (module0220.NIL != var12_102 && module0220.NIL != module0235.f15475(var89, module0178.f11285(var126), (SubLObject)module0220.UNPROVIDED, (SubLObject)module0220.UNPROVIDED)) {
                                        var91 = module0178.f11292(var126);
                                    }
                                    var9_100 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var12_102 || module0220.NIL != var91);
                                }
                            }
                            finally {
                                final SubLObject var18_111 = Threads.$is_thread_performing_cleanupP$.currentBinding(var90);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0220.T, var90);
                                    if (module0220.NIL != var125) {
                                        module0158.f10319(var125);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var18_111, var90);
                                }
                            }
                        }
                        var121 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var124 || module0220.NIL != var91);
                    }
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var119, var90);
                    module0012.$g70$.rebind(var118, var90);
                    module0012.$g69$.rebind(var117, var90);
                    module0012.$g66$.rebind(var116, var90);
                    module0012.$g68$.rebind(var115, var90);
                    module0012.$g67$.rebind(var114, var90);
                    module0012.$g65$.rebind(var113, var90);
                    module0012.$g73$.rebind(var112, var90);
                }
            }
        }
        else if (var94.eql((SubLObject)module0220.$ic117$)) {
            SubLObject var127;
            SubLObject var128;
            for (var127 = (SubLObject)module0220.NIL, var127 = module0218.f14453(module0158.f10301(var92), (SubLObject)module0220.UNPROVIDED); module0220.NIL == var91 && module0220.NIL != var127; var127 = var127.rest()) {
                var128 = var127.first();
                if (module0220.NIL != module0235.f15475(var89, module0178.f11285(var128), (SubLObject)module0220.UNPROVIDED, (SubLObject)module0220.UNPROVIDED)) {
                    var91 = module0178.f11292(var128);
                }
            }
        }
        else {
            module0158.f10295(var92, var93);
        }
        return var91;
    }
    
    public static SubLObject f14604(final SubLObject var113) {
        final SubLThread var114 = SubLProcess.currentSubLThread();
        final SubLObject var115 = module0217.f14404(var113, (SubLObject)module0220.NIL, (SubLObject)module0220.NIL);
        final SubLObject var117;
        final SubLObject var116 = var117 = module0158.f10294(var115);
        if (var117.eql((SubLObject)module0220.$ic115$)) {
            var114.resetMultipleValues();
            final SubLObject var118 = module0158.f10297(var115);
            final SubLObject var119 = var114.secondMultipleValue();
            final SubLObject var120 = var114.thirdMultipleValue();
            var114.resetMultipleValues();
            if (module0220.NIL != var119) {
                if (module0220.NIL != var120) {
                    final SubLObject var121 = var120;
                    if (module0220.NIL != module0158.f10010(var118, var119, var121)) {
                        final SubLObject var122 = module0158.f10011(var118, var119, var121);
                        SubLObject var123 = (SubLObject)module0220.NIL;
                        final SubLObject var124 = (SubLObject)module0220.NIL;
                        while (module0220.NIL == var123) {
                            final SubLObject var125 = module0052.f3695(var122, var124);
                            final SubLObject var126 = (SubLObject)SubLObjectFactory.makeBoolean(!var124.eql(var125));
                            if (module0220.NIL != var126) {
                                SubLObject var127 = (SubLObject)module0220.NIL;
                                try {
                                    var127 = module0158.f10316(var125, (SubLObject)module0220.$ic5$, (SubLObject)module0220.NIL, (SubLObject)module0220.NIL);
                                    SubLObject var9_114 = (SubLObject)module0220.NIL;
                                    final SubLObject var10_115 = (SubLObject)module0220.NIL;
                                    while (module0220.NIL == var9_114) {
                                        final SubLObject var128 = module0052.f3695(var127, var10_115);
                                        final SubLObject var12_116 = (SubLObject)SubLObjectFactory.makeBoolean(!var10_115.eql(var128));
                                        if (module0220.NIL != var12_116 && module0220.NIL != module0235.f15475(var113, module0178.f11285(var128), (SubLObject)module0220.UNPROVIDED, (SubLObject)module0220.UNPROVIDED) && module0220.$ic0$ == module0178.f11292(var128)) {
                                            return (SubLObject)module0220.T;
                                        }
                                        var9_114 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var12_116);
                                    }
                                }
                                finally {
                                    final SubLObject var129 = Threads.$is_thread_performing_cleanupP$.currentBinding(var114);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0220.T, var114);
                                        if (module0220.NIL != var127) {
                                            module0158.f10319(var127);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var129, var114);
                                    }
                                }
                            }
                            var123 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var126);
                        }
                    }
                }
                else {
                    final SubLObject var121 = (SubLObject)module0220.NIL;
                    if (module0220.NIL != module0158.f10010(var118, var119, var121)) {
                        final SubLObject var122 = module0158.f10011(var118, var119, var121);
                        SubLObject var123 = (SubLObject)module0220.NIL;
                        final SubLObject var124 = (SubLObject)module0220.NIL;
                        while (module0220.NIL == var123) {
                            final SubLObject var125 = module0052.f3695(var122, var124);
                            final SubLObject var126 = (SubLObject)SubLObjectFactory.makeBoolean(!var124.eql(var125));
                            if (module0220.NIL != var126) {
                                SubLObject var127 = (SubLObject)module0220.NIL;
                                try {
                                    var127 = module0158.f10316(var125, (SubLObject)module0220.$ic5$, (SubLObject)module0220.NIL, (SubLObject)module0220.NIL);
                                    SubLObject var9_115 = (SubLObject)module0220.NIL;
                                    final SubLObject var10_116 = (SubLObject)module0220.NIL;
                                    while (module0220.NIL == var9_115) {
                                        final SubLObject var128 = module0052.f3695(var127, var10_116);
                                        final SubLObject var12_117 = (SubLObject)SubLObjectFactory.makeBoolean(!var10_116.eql(var128));
                                        if (module0220.NIL != var12_117 && module0220.NIL != module0235.f15475(var113, module0178.f11285(var128), (SubLObject)module0220.UNPROVIDED, (SubLObject)module0220.UNPROVIDED) && module0220.$ic0$ == module0178.f11292(var128)) {
                                            return (SubLObject)module0220.T;
                                        }
                                        var9_115 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var12_117);
                                    }
                                }
                                finally {
                                    final SubLObject var130 = Threads.$is_thread_performing_cleanupP$.currentBinding(var114);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0220.T, var114);
                                        if (module0220.NIL != var127) {
                                            module0158.f10319(var127);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var130, var114);
                                    }
                                }
                            }
                            var123 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var126);
                        }
                    }
                }
            }
            else if (module0220.NIL != var120) {
                final SubLObject var121 = var120;
                if (module0220.NIL != module0158.f10010(var118, (SubLObject)module0220.NIL, var121)) {
                    final SubLObject var122 = module0158.f10011(var118, (SubLObject)module0220.NIL, var121);
                    SubLObject var123 = (SubLObject)module0220.NIL;
                    final SubLObject var124 = (SubLObject)module0220.NIL;
                    while (module0220.NIL == var123) {
                        final SubLObject var125 = module0052.f3695(var122, var124);
                        final SubLObject var126 = (SubLObject)SubLObjectFactory.makeBoolean(!var124.eql(var125));
                        if (module0220.NIL != var126) {
                            SubLObject var127 = (SubLObject)module0220.NIL;
                            try {
                                var127 = module0158.f10316(var125, (SubLObject)module0220.$ic5$, (SubLObject)module0220.NIL, (SubLObject)module0220.NIL);
                                SubLObject var9_116 = (SubLObject)module0220.NIL;
                                final SubLObject var10_117 = (SubLObject)module0220.NIL;
                                while (module0220.NIL == var9_116) {
                                    final SubLObject var128 = module0052.f3695(var127, var10_117);
                                    final SubLObject var12_118 = (SubLObject)SubLObjectFactory.makeBoolean(!var10_117.eql(var128));
                                    if (module0220.NIL != var12_118 && module0220.NIL != module0235.f15475(var113, module0178.f11285(var128), (SubLObject)module0220.UNPROVIDED, (SubLObject)module0220.UNPROVIDED) && module0220.$ic0$ == module0178.f11292(var128)) {
                                        return (SubLObject)module0220.T;
                                    }
                                    var9_116 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var12_118);
                                }
                            }
                            finally {
                                final SubLObject var131 = Threads.$is_thread_performing_cleanupP$.currentBinding(var114);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0220.T, var114);
                                    if (module0220.NIL != var127) {
                                        module0158.f10319(var127);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var131, var114);
                                }
                            }
                        }
                        var123 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var126);
                    }
                }
            }
            else {
                final SubLObject var121 = (SubLObject)module0220.NIL;
                if (module0220.NIL != module0158.f10010(var118, (SubLObject)module0220.NIL, var121)) {
                    final SubLObject var122 = module0158.f10011(var118, (SubLObject)module0220.NIL, var121);
                    SubLObject var123 = (SubLObject)module0220.NIL;
                    final SubLObject var124 = (SubLObject)module0220.NIL;
                    while (module0220.NIL == var123) {
                        final SubLObject var125 = module0052.f3695(var122, var124);
                        final SubLObject var126 = (SubLObject)SubLObjectFactory.makeBoolean(!var124.eql(var125));
                        if (module0220.NIL != var126) {
                            SubLObject var127 = (SubLObject)module0220.NIL;
                            try {
                                var127 = module0158.f10316(var125, (SubLObject)module0220.$ic5$, (SubLObject)module0220.NIL, (SubLObject)module0220.NIL);
                                SubLObject var9_117 = (SubLObject)module0220.NIL;
                                final SubLObject var10_118 = (SubLObject)module0220.NIL;
                                while (module0220.NIL == var9_117) {
                                    final SubLObject var128 = module0052.f3695(var127, var10_118);
                                    final SubLObject var12_119 = (SubLObject)SubLObjectFactory.makeBoolean(!var10_118.eql(var128));
                                    if (module0220.NIL != var12_119 && module0220.NIL != module0235.f15475(var113, module0178.f11285(var128), (SubLObject)module0220.UNPROVIDED, (SubLObject)module0220.UNPROVIDED) && module0220.$ic0$ == module0178.f11292(var128)) {
                                        return (SubLObject)module0220.T;
                                    }
                                    var9_117 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var12_119);
                                }
                            }
                            finally {
                                final SubLObject var132 = Threads.$is_thread_performing_cleanupP$.currentBinding(var114);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0220.T, var114);
                                    if (module0220.NIL != var127) {
                                        module0158.f10319(var127);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var132, var114);
                                }
                            }
                        }
                        var123 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var126);
                    }
                }
            }
        }
        else if (var117.eql((SubLObject)module0220.$ic116$)) {
            final SubLObject var133 = module0158.f10299(var115);
            if (module0220.NIL != module0158.f10038(var133)) {
                final SubLObject var134 = (SubLObject)module0220.NIL;
                final SubLObject var135 = module0012.$g73$.currentBinding(var114);
                final SubLObject var136 = module0012.$g65$.currentBinding(var114);
                final SubLObject var137 = module0012.$g67$.currentBinding(var114);
                final SubLObject var138 = module0012.$g68$.currentBinding(var114);
                final SubLObject var139 = module0012.$g66$.currentBinding(var114);
                final SubLObject var140 = module0012.$g69$.currentBinding(var114);
                final SubLObject var141 = module0012.$g70$.currentBinding(var114);
                final SubLObject var142 = module0012.$silent_progressP$.currentBinding(var114);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var114);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var114), var114);
                    module0012.$g67$.bind((SubLObject)module0220.ONE_INTEGER, var114);
                    module0012.$g68$.bind((SubLObject)module0220.ZERO_INTEGER, var114);
                    module0012.$g66$.bind((SubLObject)module0220.ZERO_INTEGER, var114);
                    module0012.$g69$.bind((SubLObject)module0220.ZERO_INTEGER, var114);
                    module0012.$g70$.bind((SubLObject)module0220.T, var114);
                    module0012.$silent_progressP$.bind((SubLObject)((module0220.NIL != var134) ? module0012.$silent_progressP$.getDynamicValue(var114) : module0220.T), var114);
                    module0012.f474(var134);
                    final SubLObject var143 = module0158.f10039(var133);
                    SubLObject var144 = (SubLObject)module0220.NIL;
                    final SubLObject var145 = (SubLObject)module0220.NIL;
                    while (module0220.NIL == var144) {
                        final SubLObject var146 = module0052.f3695(var143, var145);
                        final SubLObject var147 = (SubLObject)SubLObjectFactory.makeBoolean(!var145.eql(var146));
                        if (module0220.NIL != var147) {
                            module0012.f476();
                            SubLObject var148 = (SubLObject)module0220.NIL;
                            try {
                                var148 = module0158.f10316(var146, (SubLObject)module0220.$ic5$, (SubLObject)module0220.NIL, (SubLObject)module0220.NIL);
                                SubLObject var9_118 = (SubLObject)module0220.NIL;
                                final SubLObject var10_119 = (SubLObject)module0220.NIL;
                                while (module0220.NIL == var9_118) {
                                    final SubLObject var149 = module0052.f3695(var148, var10_119);
                                    final SubLObject var12_120 = (SubLObject)SubLObjectFactory.makeBoolean(!var10_119.eql(var149));
                                    if (module0220.NIL != var12_120 && module0220.NIL != module0235.f15475(var113, module0178.f11285(var149), (SubLObject)module0220.UNPROVIDED, (SubLObject)module0220.UNPROVIDED) && module0220.$ic0$ == module0178.f11292(var149)) {
                                        return (SubLObject)module0220.T;
                                    }
                                    var9_118 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var12_120);
                                }
                            }
                            finally {
                                final SubLObject var18_129 = Threads.$is_thread_performing_cleanupP$.currentBinding(var114);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0220.T, var114);
                                    if (module0220.NIL != var148) {
                                        module0158.f10319(var148);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var18_129, var114);
                                }
                            }
                        }
                        var144 = (SubLObject)SubLObjectFactory.makeBoolean(module0220.NIL == var147);
                    }
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var142, var114);
                    module0012.$g70$.rebind(var141, var114);
                    module0012.$g69$.rebind(var140, var114);
                    module0012.$g66$.rebind(var139, var114);
                    module0012.$g68$.rebind(var138, var114);
                    module0012.$g67$.rebind(var137, var114);
                    module0012.$g65$.rebind(var136, var114);
                    module0012.$g73$.rebind(var135, var114);
                }
            }
        }
        else if (var117.eql((SubLObject)module0220.$ic117$)) {
            SubLObject var150 = module0218.f14453(module0158.f10301(var115), (SubLObject)module0220.UNPROVIDED);
            SubLObject var151 = (SubLObject)module0220.NIL;
            var151 = var150.first();
            while (module0220.NIL != var150) {
                if (module0220.NIL != module0235.f15475(var113, module0178.f11285(var151), (SubLObject)module0220.UNPROVIDED, (SubLObject)module0220.UNPROVIDED) && module0220.$ic0$ == module0178.f11292(var151)) {
                    return (SubLObject)module0220.T;
                }
                var150 = var150.rest();
                var151 = var150.first();
            }
        }
        else {
            module0158.f10295(var115, var116);
        }
        return (SubLObject)module0220.NIL;
    }
    
    public static SubLObject f14605() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14544", "SOME-PRED-VALUE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14545", "SOME-PRED-VALUE-IN-MT", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14546", "SOME-PRED-VALUE-IN-MTS", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14547", "SOME-PRED-VALUE-IN-ANY-MT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14548", "SOME-PRED-VALUE-IN-RELEVANT-MTS", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14549", "S#17363", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14550", "S#17364", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14551", "S#17365", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14552", "S#17366", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14553", "FPRED-VALUE", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14554", "FPRED-VALUE-IN-MT", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14555", "FPRED-VALUE-IN-MTS", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14556", "FPRED-VALUE-IN-ANY-MT", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14557", "FPRED-VALUE-IN-RELEVANT-MTS", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14558", "S#16448", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14559", "S#17367", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14560", "S#17368", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14561", "S#17369", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14562", "PRED-VALUES", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14563", "PRED-VALUES-IN-MT", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14564", "PRED-VALUES-IN-MTS", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14565", "PRED-VALUES-IN-ANY-MT", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14566", "PRED-VALUES-IN-RELEVANT-MTS", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14567", "PRED-REFS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14568", "PRED-REFS-IN-MT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14569", "PRED-REFS-IN-MTS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14570", "PRED-REFS-IN-ANY-MT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14571", "PRED-REFS-IN-RELEVANT-MTS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14572", "S#17370", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14573", "S#17371", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14574", "S#17372", 3, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14575", "S#17373", 3, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14576", "S#17374", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14577", "S#17375", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14578", "PRED-U-V-HOLDS", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14579", "PRED-U-V-HOLDS-IN-MT", 4, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14580", "PRED-U-V-HOLDS-IN-MTS", 4, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14581", "PRED-U-V-HOLDS-IN-ANY-MT", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14582", "PRED-U-V-HOLDS-IN-RELEVANT-MTS", 3, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14583", "S#17376", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14584", "S#17377", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14585", "S#17378", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14586", "S#17379", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14587", "S#17380", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14588", "S#17381", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14589", "S#17382", 4, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14590", "S#17383", 4, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14591", "S#17384", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14592", "S#17385", 3, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14593", "S#17386", 3, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14594", "S#17387", 4, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14595", "S#17388", 4, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14596", "S#17389", 3, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14597", "S#17390", 3, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14598", "PRED-VALUE-TUPLES", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14599", "PRED-VALUE-TUPLES-IN-MT", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14600", "PRED-VALUE-TUPLES-IN-MTS", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14601", "PRED-VALUE-TUPLES-IN-ANY-MT", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14602", "PRED-VALUE-TUPLES-IN-RELEVANT-MTS", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14603", "S#17391", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0220", "f14604", "S#17392", 1, 0, false);
        return (SubLObject)module0220.NIL;
    }
    
    public static SubLObject f14606() {
        return (SubLObject)module0220.NIL;
    }
    
    public static SubLObject f14607() {
        module0012.f368((SubLObject)module0220.$ic6$, (SubLObject)module0220.$ic7$, (SubLObject)module0220.$ic8$, (SubLObject)module0220.$ic9$, (SubLObject)module0220.$ic10$);
        module0012.f368((SubLObject)module0220.$ic13$, (SubLObject)module0220.$ic14$, (SubLObject)module0220.$ic15$, (SubLObject)module0220.$ic16$, (SubLObject)module0220.$ic10$);
        module0012.f368((SubLObject)module0220.$ic19$, (SubLObject)module0220.$ic20$, (SubLObject)module0220.$ic21$, (SubLObject)module0220.$ic22$, (SubLObject)module0220.$ic10$);
        module0012.f368((SubLObject)module0220.$ic25$, (SubLObject)module0220.$ic7$, (SubLObject)module0220.$ic26$, (SubLObject)module0220.$ic9$, (SubLObject)module0220.$ic10$);
        module0012.f368((SubLObject)module0220.$ic27$, (SubLObject)module0220.$ic28$, (SubLObject)module0220.$ic29$, (SubLObject)module0220.$ic9$, (SubLObject)module0220.$ic10$);
        module0012.f368((SubLObject)module0220.$ic31$, (SubLObject)module0220.$ic32$, (SubLObject)module0220.$ic33$, (SubLObject)module0220.$ic34$, (SubLObject)module0220.$ic35$);
        module0012.f368((SubLObject)module0220.$ic36$, (SubLObject)module0220.$ic37$, (SubLObject)module0220.$ic38$, (SubLObject)module0220.$ic39$, (SubLObject)module0220.$ic35$);
        module0012.f368((SubLObject)module0220.$ic40$, (SubLObject)module0220.$ic41$, (SubLObject)module0220.$ic42$, (SubLObject)module0220.$ic43$, (SubLObject)module0220.$ic35$);
        module0012.f368((SubLObject)module0220.$ic44$, (SubLObject)module0220.$ic32$, (SubLObject)module0220.$ic45$, (SubLObject)module0220.$ic34$, (SubLObject)module0220.$ic35$);
        module0012.f368((SubLObject)module0220.$ic46$, (SubLObject)module0220.$ic47$, (SubLObject)module0220.$ic48$, (SubLObject)module0220.$ic34$, (SubLObject)module0220.$ic35$);
        module0012.f368((SubLObject)module0220.$ic49$, (SubLObject)module0220.$ic32$, (SubLObject)module0220.$ic50$, (SubLObject)module0220.$ic34$, (SubLObject)module0220.$ic51$);
        module0012.f368((SubLObject)module0220.$ic52$, (SubLObject)module0220.$ic37$, (SubLObject)module0220.$ic53$, (SubLObject)module0220.$ic39$, (SubLObject)module0220.$ic51$);
        module0012.f368((SubLObject)module0220.$ic54$, (SubLObject)module0220.$ic41$, (SubLObject)module0220.$ic55$, (SubLObject)module0220.$ic43$, (SubLObject)module0220.$ic51$);
        module0012.f368((SubLObject)module0220.$ic56$, (SubLObject)module0220.$ic32$, (SubLObject)module0220.$ic57$, (SubLObject)module0220.$ic34$, (SubLObject)module0220.$ic51$);
        module0012.f368((SubLObject)module0220.$ic58$, (SubLObject)module0220.$ic47$, (SubLObject)module0220.$ic59$, (SubLObject)module0220.$ic34$, (SubLObject)module0220.$ic51$);
        module0012.f368((SubLObject)module0220.$ic60$, (SubLObject)module0220.$ic61$, (SubLObject)module0220.$ic62$, (SubLObject)module0220.$ic63$, (SubLObject)module0220.$ic51$);
        module0012.f368((SubLObject)module0220.$ic64$, (SubLObject)module0220.$ic65$, (SubLObject)module0220.$ic66$, (SubLObject)module0220.$ic67$, (SubLObject)module0220.$ic51$);
        module0012.f368((SubLObject)module0220.$ic68$, (SubLObject)module0220.$ic69$, (SubLObject)module0220.$ic70$, (SubLObject)module0220.$ic71$, (SubLObject)module0220.$ic51$);
        module0012.f368((SubLObject)module0220.$ic72$, (SubLObject)module0220.$ic61$, (SubLObject)module0220.$ic73$, (SubLObject)module0220.$ic63$, (SubLObject)module0220.$ic51$);
        module0012.f368((SubLObject)module0220.$ic74$, (SubLObject)module0220.$ic75$, (SubLObject)module0220.$ic76$, (SubLObject)module0220.$ic63$, (SubLObject)module0220.$ic51$);
        module0012.f368((SubLObject)module0220.$ic78$, (SubLObject)module0220.$ic79$, (SubLObject)module0220.$ic80$, (SubLObject)module0220.$ic81$, (SubLObject)module0220.$ic10$);
        module0012.f368((SubLObject)module0220.$ic82$, (SubLObject)module0220.$ic83$, (SubLObject)module0220.$ic84$, (SubLObject)module0220.$ic85$, (SubLObject)module0220.$ic10$);
        module0012.f368((SubLObject)module0220.$ic86$, (SubLObject)module0220.$ic87$, (SubLObject)module0220.$ic88$, (SubLObject)module0220.$ic89$, (SubLObject)module0220.$ic10$);
        module0012.f368((SubLObject)module0220.$ic90$, (SubLObject)module0220.$ic79$, (SubLObject)module0220.$ic91$, (SubLObject)module0220.$ic81$, (SubLObject)module0220.$ic10$);
        module0012.f368((SubLObject)module0220.$ic92$, (SubLObject)module0220.$ic93$, (SubLObject)module0220.$ic94$, (SubLObject)module0220.$ic81$, (SubLObject)module0220.$ic10$);
        module0012.f368((SubLObject)module0220.$ic97$, (SubLObject)module0220.$ic98$, (SubLObject)module0220.$ic99$, (SubLObject)module0220.$ic100$, (SubLObject)module0220.$ic101$);
        module0012.f368((SubLObject)module0220.$ic102$, (SubLObject)module0220.$ic103$, (SubLObject)module0220.$ic104$, (SubLObject)module0220.$ic105$, (SubLObject)module0220.$ic101$);
        module0012.f368((SubLObject)module0220.$ic106$, (SubLObject)module0220.$ic107$, (SubLObject)module0220.$ic108$, (SubLObject)module0220.$ic109$, (SubLObject)module0220.$ic101$);
        module0012.f368((SubLObject)module0220.$ic110$, (SubLObject)module0220.$ic98$, (SubLObject)module0220.$ic111$, (SubLObject)module0220.$ic100$, (SubLObject)module0220.$ic101$);
        module0012.f368((SubLObject)module0220.$ic112$, (SubLObject)module0220.$ic113$, (SubLObject)module0220.$ic114$, (SubLObject)module0220.$ic100$, (SubLObject)module0220.$ic101$);
        return (SubLObject)module0220.NIL;
    }
    
    public void declareFunctions() {
        f14605();
    }
    
    public void initializeVariables() {
        f14606();
    }
    
    public void runTopLevelForms() {
        f14607();
    }
    
    static {
        me = (SubLFile)new module0220();
        $ic0$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic1$ = SubLObjectFactory.makeSymbol("INDEXED-TERM-P");
        $ic2$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic3$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic4$ = SubLObjectFactory.makeSymbol("TRUTH-P");
        $ic5$ = SubLObjectFactory.makeKeyword("GAF");
        $ic6$ = SubLObjectFactory.makeSymbol("SOME-PRED-VALUE");
        $ic7$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11198", "CYC"), (SubLObject)module0220.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")));
        $ic8$ = SubLObjectFactory.makeString("Find the first gaf assertion such that:\n (a) the assertion is in a relevant microtheory (relevance is established outside)\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return T if such an assertion exists, otherwise return NIL.");
        $ic9$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-TERM-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11198", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH-P")));
        $ic10$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $ic11$ = SubLObjectFactory.makeSymbol("S#12263", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#12276", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("SOME-PRED-VALUE-IN-MT");
        $ic14$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11198", "CYC"), (SubLObject)module0220.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")));
        $ic15$ = SubLObjectFactory.makeString("Find the first gaf assertion such that:\n (a) the assertion is in microtheory MT\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return T if such an assertion exists, otherwise return NIL.");
        $ic16$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-TERM-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12263", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11198", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH-P")));
        $ic17$ = SubLObjectFactory.makeSymbol("LISTP");
        $ic18$ = SubLObjectFactory.makeSymbol("S#12277", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("SOME-PRED-VALUE-IN-MTS");
        $ic20$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12701", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11198", "CYC"), (SubLObject)module0220.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")));
        $ic21$ = SubLObjectFactory.makeString("Find the first gaf assertion such that:\n (a) the assertion is in one of the microtheories in the list MTS\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return T if such an assertion exists, otherwise return NIL.");
        $ic22$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-TERM-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12701", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11198", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH-P")));
        $ic23$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic24$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic25$ = SubLObjectFactory.makeSymbol("SOME-PRED-VALUE-IN-ANY-MT");
        $ic26$ = SubLObjectFactory.makeString("Find the first gaf assertion such that:\n (a) the assertion is allowed to be in any microtheory\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return T if such an assertion exists, otherwise return NIL.");
        $ic27$ = SubLObjectFactory.makeSymbol("SOME-PRED-VALUE-IN-RELEVANT-MTS");
        $ic28$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11198", "CYC"), (SubLObject)module0220.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")));
        $ic29$ = SubLObjectFactory.makeString("If MT is NIL, behaves like SOME-PRED-VALUE.  Otherwise, behaves like SOME-PRED-VALUE-IN-MT");
        $ic30$ = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $ic31$ = SubLObjectFactory.makeSymbol("FPRED-VALUE");
        $ic32$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11198", "CYC"), (SubLObject)module0220.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12702", "CYC"), (SubLObject)module0220.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")));
        $ic33$ = SubLObjectFactory.makeString("Find the first gaf assertion such that:\n (a) the assertion is in a relevant microtheory (relevance is established outside)\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return the term in the GATHER-ARG position if such an assertion exists.\n Otherwise, return NIL.");
        $ic34$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-TERM-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11198", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12702", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH-P")));
        $ic35$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#664", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("HL-TERM-P")));
        $ic36$ = SubLObjectFactory.makeSymbol("FPRED-VALUE-IN-MT");
        $ic37$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11198", "CYC"), (SubLObject)module0220.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12702", "CYC"), (SubLObject)module0220.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")));
        $ic38$ = SubLObjectFactory.makeString("Find the first gaf assertion such that:\n (a) the assertion is in microtheory MT\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return the term in the GATHER-ARG position if such an assertion exists.\n Otherwise, return NIL.");
        $ic39$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-TERM-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12263", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11198", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12702", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH-P")));
        $ic40$ = SubLObjectFactory.makeSymbol("FPRED-VALUE-IN-MTS");
        $ic41$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12701", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11198", "CYC"), (SubLObject)module0220.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12702", "CYC"), (SubLObject)module0220.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")));
        $ic42$ = SubLObjectFactory.makeString("Find the first gaf assertion such that:\n (a) the assertion is in one of the microtheories in the list MTS\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return the term in the GATHER-ARG position if such an assertion exists.\n Otherwise, return NIL.");
        $ic43$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-TERM-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12701", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11198", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12702", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH-P")));
        $ic44$ = SubLObjectFactory.makeSymbol("FPRED-VALUE-IN-ANY-MT");
        $ic45$ = SubLObjectFactory.makeString("Find the first gaf assertion such that:\n (a) the assertion is allowed to be in any microtheory\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return the term in the GATHER-ARG position if such an assertion exists.\n Otherwise, return NIL.");
        $ic46$ = SubLObjectFactory.makeSymbol("FPRED-VALUE-IN-RELEVANT-MTS");
        $ic47$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11198", "CYC"), (SubLObject)module0220.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12702", "CYC"), (SubLObject)module0220.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")));
        $ic48$ = SubLObjectFactory.makeString("If MT is NIL, behaves like FPRED-VALUE.  Otherwise, looks in all genlMts of MT.");
        $ic49$ = SubLObjectFactory.makeSymbol("PRED-VALUES");
        $ic50$ = SubLObjectFactory.makeString("Find all gaf assertions such that:\n (a) the assertion is in a relevant microtheory (relevance is established outside)\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return a list of the terms in the GATHER-ARG position of all such assertions.");
        $ic51$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("HL-TERM-P")));
        $ic52$ = SubLObjectFactory.makeSymbol("PRED-VALUES-IN-MT");
        $ic53$ = SubLObjectFactory.makeString("Find all gaf assertions such that:\n (a) the assertion is in microtheory MT\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return a list of the terms in the GATHER-ARG position of all such assertions.");
        $ic54$ = SubLObjectFactory.makeSymbol("PRED-VALUES-IN-MTS");
        $ic55$ = SubLObjectFactory.makeString("Find all gaf assertions such that:\n (a) the assertion is in one of the microtheories in the list MTS\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return a list of the terms in the GATHER-ARG position of all such assertions.");
        $ic56$ = SubLObjectFactory.makeSymbol("PRED-VALUES-IN-ANY-MT");
        $ic57$ = SubLObjectFactory.makeString("Find all gaf assertions such that:\n (a) the assertion is allowed to be in any microtheory\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return a list of the terms in the GATHER-ARG position of all such assertions.");
        $ic58$ = SubLObjectFactory.makeSymbol("PRED-VALUES-IN-RELEVANT-MTS");
        $ic59$ = SubLObjectFactory.makeString("If MT is NIL, behaves like PRED-VALUES.  Otherwise, behaves like PRED-VALUES-IN-MT");
        $ic60$ = SubLObjectFactory.makeSymbol("PRED-REFS");
        $ic61$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12702", "CYC"), (SubLObject)module0220.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")));
        $ic62$ = SubLObjectFactory.makeString("Find all gaf assertions such that:\n (a) the assertion is in a relevant microtheory (relevance is established outside)\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n Return a list of the terms in the GATHER-ARG position of all such assertions.");
        $ic63$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12702", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH-P")));
        $ic64$ = SubLObjectFactory.makeSymbol("PRED-REFS-IN-MT");
        $ic65$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12702", "CYC"), (SubLObject)module0220.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")));
        $ic66$ = SubLObjectFactory.makeString("Find all gaf assertions such that:\n (a) the assertion is in microtheory MT\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n Return a list of the terms in the GATHER-ARG position of all such assertions.");
        $ic67$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12263", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12702", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH-P")));
        $ic68$ = SubLObjectFactory.makeSymbol("PRED-REFS-IN-MTS");
        $ic69$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12701", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12702", "CYC"), (SubLObject)module0220.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")));
        $ic70$ = SubLObjectFactory.makeString("Find all gaf assertions such that:\n (a) the assertion is in one of the microtheories in the list MTS\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n Return a list of the terms in the GATHER-ARG position of all such assertions.");
        $ic71$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12701", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12702", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH-P")));
        $ic72$ = SubLObjectFactory.makeSymbol("PRED-REFS-IN-ANY-MT");
        $ic73$ = SubLObjectFactory.makeString("Find all gaf assertions such that:\n (a) the assertion is allowed to be in any microtheory\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n Return a list of the terms in the GATHER-ARG position of all such assertions.");
        $ic74$ = SubLObjectFactory.makeSymbol("PRED-REFS-IN-RELEVANT-MTS");
        $ic75$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12702", "CYC"), (SubLObject)module0220.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")));
        $ic76$ = SubLObjectFactory.makeString("If MT is NIL, behaves like PRED-REFS.  Otherwise, behaves like PRED-REFS-IN-MT");
        $ic77$ = SubLObjectFactory.makeSymbol("HL-TERM-P");
        $ic78$ = SubLObjectFactory.makeSymbol("PRED-U-V-HOLDS");
        $ic79$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#17393", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#17394", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#17395", "CYC"), (SubLObject)module0220.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#17396", "CYC"), (SubLObject)module0220.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")));
        $ic80$ = SubLObjectFactory.makeString("Find the first gaf assertion such that:\n (a) the assertion is in a relevant microtheory (relevance is established outside)\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) U is the term in the U-ARG position.\n (e) V is the term in the V-ARG position.\n Return T if such an assertion exists, otherwise return NIL.");
        $ic81$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#17393", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-TERM-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#17394", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("HL-TERM-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#17395", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#17396", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH-P")));
        $ic82$ = SubLObjectFactory.makeSymbol("PRED-U-V-HOLDS-IN-MT");
        $ic83$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#17393", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#17394", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#17395", "CYC"), (SubLObject)module0220.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#17396", "CYC"), (SubLObject)module0220.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")));
        $ic84$ = SubLObjectFactory.makeString("Find the first gaf assertion such that:\n (a) the assertion is in microtheory MT\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) U is the term in the U-ARG position.\n (e) V is the term in the V-ARG position.\n Return T if such an assertion exists, otherwise return NIL.");
        $ic85$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#17393", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-TERM-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#17394", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("HL-TERM-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12263", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#17395", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#17396", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH-P")));
        $ic86$ = SubLObjectFactory.makeSymbol("PRED-U-V-HOLDS-IN-MTS");
        $ic87$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#17393", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#17394", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12701", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#17395", "CYC"), (SubLObject)module0220.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#17396", "CYC"), (SubLObject)module0220.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")));
        $ic88$ = SubLObjectFactory.makeString("Find the first gaf assertion such that:\n (a) the assertion is in one of the microtheories in the list MTS\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) U is the term in the U-ARG position.\n (e) V is the term in the V-ARG position.\n Return T if such an assertion exists, otherwise return NIL.");
        $ic89$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#17393", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-TERM-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#17394", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("HL-TERM-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12701", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#17395", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#17396", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH-P")));
        $ic90$ = SubLObjectFactory.makeSymbol("PRED-U-V-HOLDS-IN-ANY-MT");
        $ic91$ = SubLObjectFactory.makeString("Find the first gaf assertion such that:\n (a) the assertion is allowed to be in any microtheory\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) U is the term in the U-ARG position.\n (e) V is the term in the V-ARG position.\n Return T if such an assertion exists, otherwise return NIL.");
        $ic92$ = SubLObjectFactory.makeSymbol("PRED-U-V-HOLDS-IN-RELEVANT-MTS");
        $ic93$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#17393", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#17394", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#17395", "CYC"), (SubLObject)module0220.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#17396", "CYC"), (SubLObject)module0220.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")));
        $ic94$ = SubLObjectFactory.makeString("If MT is NIL, behaves like PRED-U-V-HOLDS.  Otherwise, behaves like PRED-U-V-HOLDS-IN-MT");
        $ic95$ = SubLObjectFactory.makeSymbol("CONSP");
        $ic96$ = SubLObjectFactory.makeString("~S is not a valid arg-position list");
        $ic97$ = SubLObjectFactory.makeSymbol("PRED-VALUE-TUPLES");
        $ic98$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11198", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#17397", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")));
        $ic99$ = SubLObjectFactory.makeString("Find all gaf assertions such that:\n (a) the assertion is in a relevant microtheory (relevance is established outside)\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return a list of tuples formed from the GATHER-ARGS positions of all such assertions.");
        $ic100$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-TERM-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11198", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#17397", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH-P")));
        $ic101$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")));
        $ic102$ = SubLObjectFactory.makeSymbol("PRED-VALUE-TUPLES-IN-MT");
        $ic103$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11198", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#17397", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")));
        $ic104$ = SubLObjectFactory.makeString("Find all gaf assertions such that:\n (a) the assertion is microtheory MT\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return a list of tuples formed from the GATHER-ARGS positions of all such assertions.");
        $ic105$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-TERM-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11198", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#17397", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12263", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH-P")));
        $ic106$ = SubLObjectFactory.makeSymbol("PRED-VALUE-TUPLES-IN-MTS");
        $ic107$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11198", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#17397", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12701", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")));
        $ic108$ = SubLObjectFactory.makeString("Find all gaf assertions such that:\n (a) the assertion is in one of the microtheories in the list MTS\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return a list of tuples formed from the GATHER-ARGS positions of all such assertions.");
        $ic109$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-TERM-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11198", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#17397", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12701", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH-P")));
        $ic110$ = SubLObjectFactory.makeSymbol("PRED-VALUE-TUPLES-IN-ANY-MT");
        $ic111$ = SubLObjectFactory.makeString("Find all gaf assertions such that:\n (a) the assertion is allowed to be from any microtheory\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return a list of tuples formed from the GATHER-ARGS positions of all such assertions.");
        $ic112$ = SubLObjectFactory.makeSymbol("PRED-VALUE-TUPLES-IN-RELEVANT-MTS");
        $ic113$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11198", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#17397", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")));
        $ic114$ = SubLObjectFactory.makeString("If MT is NIL, behaves like PRED-VALUE-TUPLES.  Otherwise, behaves like PRED-VALUE-TUPLES-IN-MT");
        $ic115$ = SubLObjectFactory.makeKeyword("GAF-ARG");
        $ic116$ = SubLObjectFactory.makeKeyword("PREDICATE-EXTENT");
        $ic117$ = SubLObjectFactory.makeKeyword("OVERLAP");
        $ic118$ = SubLObjectFactory.makeSymbol("S#5859", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0220.class
	Total time: 1376 ms
	
	Decompiled with Procyon 0.5.32.
*/