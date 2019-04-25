package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0423 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0423";
    public static final String myFingerPrint = "f39b6750a485e2573d0999265d0d1b047aed30688f2df9909e4837112c2069c1";
    public static SubLSymbol $g3440$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLObject $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLObject $ic15$;
    private static final SubLObject $ic16$;
    private static final SubLObject $ic17$;
    private static final SubLObject $ic18$;
    private static final SubLObject $ic19$;
    private static final SubLObject $ic20$;
    private static final SubLObject $ic21$;
    private static final SubLString $ic22$;
    private static final SubLObject $ic23$;
    private static final SubLObject $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLList $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLObject $ic30$;
    private static final SubLObject $ic31$;
    private static final SubLObject $ic32$;
    private static final SubLObject $ic33$;
    private static final SubLObject $ic34$;
    private static final SubLList $ic35$;
    private static final SubLString $ic36$;
    private static final SubLObject $ic37$;
    private static final SubLList $ic38$;
    private static final SubLObject $ic39$;
    private static final SubLObject $ic40$;
    private static final SubLList $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLString $ic43$;
    private static final SubLString $ic44$;
    private static final SubLObject $ic45$;
    private static final SubLList $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLObject $ic48$;
    private static final SubLString $ic49$;
    private static final SubLObject $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLObject $ic54$;
    private static final SubLObject $ic55$;
    private static final SubLObject $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLObject $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLList $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLObject $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLObject $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLObject $ic74$;
    private static final SubLObject $ic75$;
    private static final SubLList $ic76$;
    private static final SubLString $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLString $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLString $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLString $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLString $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLString $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLList $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLString $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLList $ic105$;
    private static final SubLList $ic106$;
    private static final SubLList $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLList $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLObject $ic111$;
    private static final SubLObject $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLObject $ic114$;
    private static final SubLObject $ic115$;
    private static final SubLString $ic116$;
    
    
    public static SubLObject f29532(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0423.NIL != module0259.f16891(var1, module0423.$ic0$) || module0423.NIL != module0426.f30110(var1));
    }
    
    public static SubLObject f29533(final SubLObject var2, final SubLObject var3, final SubLObject var4, final SubLObject var5, final SubLObject var6, final SubLObject var7, final SubLObject var8) {
        assert module0423.NIL != module0206.f13425(var3) : var3;
        if (module0423.NIL != var7 && !module0423.areAssertionsDisabledFor(me) && module0423.NIL == module0206.f13425(var7)) {
            throw new AssertionError(var7);
        }
        assert module0423.NIL != module0161.f10479(var4) : var4;
        assert module0423.NIL != module0360.f23784(var5) : var5;
        assert module0423.NIL != module0161.f10479(var6) : var6;
        if (module0423.NIL != module0686.f42138(var8)) {
            module0543.f33631((SubLObject)ConsesLow.listS(module0423.$ic4$, var2, (SubLObject)module0423.$ic5$), module0132.$g1555$.getGlobalValue(), (SubLObject)module0423.UNPROVIDED, (SubLObject)module0423.UNPROVIDED);
        }
        else {
            module0543.f33631((SubLObject)ConsesLow.listS(module0423.$ic4$, var2, (SubLObject)module0423.$ic6$), module0132.$g1555$.getGlobalValue(), (SubLObject)module0423.UNPROVIDED, (SubLObject)module0423.UNPROVIDED);
        }
        f29534(var2, var3, var6);
        if (module0423.NIL != var7) {
            f29535(var2, var7, var6);
        }
        f29536(var2, var4, var6);
        SubLObject var9;
        SubLObject var10;
        SubLObject var11;
        for (var9 = (SubLObject)module0423.NIL, var9 = module0412.f28670(var5); module0423.NIL != var9; var9 = conses_high.cddr(var9)) {
            var10 = var9.first();
            var11 = conses_high.cadr(var9);
            f29537(var2, var10, var11, var6);
        }
        SubLObject var12 = var8;
        SubLObject var13 = (SubLObject)module0423.NIL;
        var13 = var12.first();
        while (module0423.NIL != var12) {
            f29538(var2, var13, var6);
            var12 = var12.rest();
            var13 = var12.first();
        }
        return var2;
    }
    
    public static SubLObject f29539(final SubLObject var2, final SubLObject var3, final SubLObject var4, final SubLObject var5, final SubLObject var6, final SubLObject var7, final SubLObject var8) {
        assert module0423.NIL != module0206.f13425(var3) : var3;
        if (module0423.NIL != var7 && !module0423.areAssertionsDisabledFor(me) && module0423.NIL == module0206.f13425(var7)) {
            throw new AssertionError(var7);
        }
        assert module0423.NIL != module0161.f10479(var4) : var4;
        assert module0423.NIL != module0360.f23784(var5) : var5;
        assert module0423.NIL != module0161.f10479(var6) : var6;
        if (module0423.NIL != module0686.f42138(var8)) {
            module0543.f33631((SubLObject)ConsesLow.listS(module0423.$ic4$, var2, (SubLObject)module0423.$ic5$), module0132.$g1555$.getGlobalValue(), (SubLObject)module0423.UNPROVIDED, (SubLObject)module0423.UNPROVIDED);
        }
        else {
            module0543.f33631((SubLObject)ConsesLow.listS(module0423.$ic4$, var2, (SubLObject)module0423.$ic6$), module0132.$g1555$.getGlobalValue(), (SubLObject)module0423.UNPROVIDED, (SubLObject)module0423.UNPROVIDED);
        }
        f29540(var2, var3, var6);
        f29541(var2, var7, var6);
        f29542(var2, var4, var6);
        SubLObject var9;
        SubLObject var10;
        SubLObject var11;
        for (var9 = (SubLObject)module0423.NIL, var9 = var5; module0423.NIL != var9; var9 = conses_high.cddr(var9)) {
            var10 = var9.first();
            var11 = conses_high.cadr(var9);
            f29543(var2, var10, var11, var6);
        }
        SubLObject var12 = var8;
        SubLObject var13 = (SubLObject)module0423.NIL;
        var13 = var12.first();
        while (module0423.NIL != var12) {
            f29544(var2, var13, var6);
            var12 = var12.rest();
            var13 = var12.first();
        }
        return var2;
    }
    
    public static SubLObject f29545(final SubLObject var2, final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        SubLObject var16 = (SubLObject)module0423.NIL;
        final SubLObject var17 = module0147.$g2094$.currentBinding(var15);
        final SubLObject var18 = module0147.$g2095$.currentBinding(var15);
        try {
            module0147.$g2094$.bind((SubLObject)module0423.$ic7$, var15);
            module0147.$g2095$.bind(module0423.$ic8$, var15);
            if (module0423.$ic9$.eql(var14)) {
                final SubLObject var19 = module0423.$ic10$;
                if (module0423.NIL != module0158.f10010(var2, (SubLObject)module0423.TWO_INTEGER, var19)) {
                    final SubLObject var20 = module0158.f10011(var2, (SubLObject)module0423.TWO_INTEGER, var19);
                    SubLObject var21 = (SubLObject)module0423.NIL;
                    final SubLObject var22 = (SubLObject)module0423.NIL;
                    while (module0423.NIL == var21) {
                        final SubLObject var23 = module0052.f3695(var20, var22);
                        final SubLObject var24 = (SubLObject)SubLObjectFactory.makeBoolean(!var22.eql(var23));
                        if (module0423.NIL != var24) {
                            SubLObject var25 = (SubLObject)module0423.NIL;
                            try {
                                var25 = module0158.f10316(var23, (SubLObject)module0423.$ic11$, (SubLObject)module0423.$ic12$, (SubLObject)module0423.NIL);
                                SubLObject var21_26 = (SubLObject)module0423.NIL;
                                final SubLObject var22_27 = (SubLObject)module0423.NIL;
                                while (module0423.NIL == var21_26) {
                                    final SubLObject var26 = module0052.f3695(var25, var22_27);
                                    final SubLObject var24_29 = (SubLObject)SubLObjectFactory.makeBoolean(!var22_27.eql(var26));
                                    if (module0423.NIL != var24_29) {
                                        var16 = (SubLObject)ConsesLow.cons(var26, var16);
                                    }
                                    var21_26 = (SubLObject)SubLObjectFactory.makeBoolean(module0423.NIL == var24_29);
                                }
                            }
                            finally {
                                final SubLObject var17_30 = Threads.$is_thread_performing_cleanupP$.currentBinding(var15);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0423.T, var15);
                                    if (module0423.NIL != var25) {
                                        module0158.f10319(var25);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var17_30, var15);
                                }
                            }
                        }
                        var21 = (SubLObject)SubLObjectFactory.makeBoolean(module0423.NIL == var24);
                    }
                }
            }
            else if (module0423.$ic13$.eql(var14)) {
                final SubLObject var19 = module0423.$ic14$;
                if (module0423.NIL != module0158.f10010(var2, (SubLObject)module0423.TWO_INTEGER, var19)) {
                    final SubLObject var20 = module0158.f10011(var2, (SubLObject)module0423.TWO_INTEGER, var19);
                    SubLObject var21 = (SubLObject)module0423.NIL;
                    final SubLObject var22 = (SubLObject)module0423.NIL;
                    while (module0423.NIL == var21) {
                        final SubLObject var23 = module0052.f3695(var20, var22);
                        final SubLObject var24 = (SubLObject)SubLObjectFactory.makeBoolean(!var22.eql(var23));
                        if (module0423.NIL != var24) {
                            SubLObject var25 = (SubLObject)module0423.NIL;
                            try {
                                var25 = module0158.f10316(var23, (SubLObject)module0423.$ic11$, (SubLObject)module0423.$ic12$, (SubLObject)module0423.NIL);
                                SubLObject var21_27 = (SubLObject)module0423.NIL;
                                final SubLObject var22_28 = (SubLObject)module0423.NIL;
                                while (module0423.NIL == var21_27) {
                                    final SubLObject var26 = module0052.f3695(var25, var22_28);
                                    final SubLObject var24_30 = (SubLObject)SubLObjectFactory.makeBoolean(!var22_28.eql(var26));
                                    if (module0423.NIL != var24_30) {
                                        var16 = (SubLObject)ConsesLow.cons(var26, var16);
                                    }
                                    var21_27 = (SubLObject)SubLObjectFactory.makeBoolean(module0423.NIL == var24_30);
                                }
                            }
                            finally {
                                final SubLObject var17_31 = Threads.$is_thread_performing_cleanupP$.currentBinding(var15);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0423.T, var15);
                                    if (module0423.NIL != var25) {
                                        module0158.f10319(var25);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var17_31, var15);
                                }
                            }
                        }
                        var21 = (SubLObject)SubLObjectFactory.makeBoolean(module0423.NIL == var24);
                    }
                }
            }
            else if (module0423.$ic15$.eql(var14)) {
                final SubLObject var19 = module0423.$ic16$;
                if (module0423.NIL != module0158.f10010(var2, (SubLObject)module0423.TWO_INTEGER, var19)) {
                    final SubLObject var20 = module0158.f10011(var2, (SubLObject)module0423.TWO_INTEGER, var19);
                    SubLObject var21 = (SubLObject)module0423.NIL;
                    final SubLObject var22 = (SubLObject)module0423.NIL;
                    while (module0423.NIL == var21) {
                        final SubLObject var23 = module0052.f3695(var20, var22);
                        final SubLObject var24 = (SubLObject)SubLObjectFactory.makeBoolean(!var22.eql(var23));
                        if (module0423.NIL != var24) {
                            SubLObject var25 = (SubLObject)module0423.NIL;
                            try {
                                var25 = module0158.f10316(var23, (SubLObject)module0423.$ic11$, (SubLObject)module0423.$ic12$, (SubLObject)module0423.NIL);
                                SubLObject var21_28 = (SubLObject)module0423.NIL;
                                final SubLObject var22_29 = (SubLObject)module0423.NIL;
                                while (module0423.NIL == var21_28) {
                                    final SubLObject var26 = module0052.f3695(var25, var22_29);
                                    final SubLObject var24_31 = (SubLObject)SubLObjectFactory.makeBoolean(!var22_29.eql(var26));
                                    if (module0423.NIL != var24_31) {
                                        var16 = (SubLObject)ConsesLow.cons(var26, var16);
                                    }
                                    var21_28 = (SubLObject)SubLObjectFactory.makeBoolean(module0423.NIL == var24_31);
                                }
                            }
                            finally {
                                final SubLObject var17_32 = Threads.$is_thread_performing_cleanupP$.currentBinding(var15);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0423.T, var15);
                                    if (module0423.NIL != var25) {
                                        module0158.f10319(var25);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var17_32, var15);
                                }
                            }
                        }
                        var21 = (SubLObject)SubLObjectFactory.makeBoolean(module0423.NIL == var24);
                    }
                }
            }
            else {
                final SubLObject var19 = module0423.$ic17$;
                if (module0423.NIL != module0158.f10010(var2, (SubLObject)module0423.THREE_INTEGER, var19)) {
                    final SubLObject var20 = module0158.f10011(var2, (SubLObject)module0423.THREE_INTEGER, var19);
                    SubLObject var21 = (SubLObject)module0423.NIL;
                    final SubLObject var22 = (SubLObject)module0423.NIL;
                    while (module0423.NIL == var21) {
                        final SubLObject var23 = module0052.f3695(var20, var22);
                        final SubLObject var24 = (SubLObject)SubLObjectFactory.makeBoolean(!var22.eql(var23));
                        if (module0423.NIL != var24) {
                            SubLObject var25 = (SubLObject)module0423.NIL;
                            try {
                                var25 = module0158.f10316(var23, (SubLObject)module0423.$ic11$, (SubLObject)module0423.$ic12$, (SubLObject)module0423.NIL);
                                SubLObject var21_29 = (SubLObject)module0423.NIL;
                                final SubLObject var22_30 = (SubLObject)module0423.NIL;
                                while (module0423.NIL == var21_29) {
                                    final SubLObject var27 = module0052.f3695(var25, var22_30);
                                    final SubLObject var24_32 = (SubLObject)SubLObjectFactory.makeBoolean(!var22_30.eql(var27));
                                    if (module0423.NIL != var24_32 && module0178.f11334(var27).eql(var14)) {
                                        var16 = (SubLObject)ConsesLow.cons(var27, var16);
                                    }
                                    var21_29 = (SubLObject)SubLObjectFactory.makeBoolean(module0423.NIL == var24_32);
                                }
                            }
                            finally {
                                final SubLObject var17_33 = Threads.$is_thread_performing_cleanupP$.currentBinding(var15);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0423.T, var15);
                                    if (module0423.NIL != var25) {
                                        module0158.f10319(var25);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var17_33, var15);
                                }
                            }
                        }
                        var21 = (SubLObject)SubLObjectFactory.makeBoolean(module0423.NIL == var24);
                    }
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var18, var15);
            module0147.$g2094$.rebind(var17, var15);
        }
        return var16;
    }
    
    public static SubLObject f29540(final SubLObject var2, final SubLObject var3, final SubLObject var6) {
        SubLObject var8;
        final SubLObject var7 = var8 = f29545(var2, module0423.$ic9$);
        SubLObject var9 = (SubLObject)module0423.NIL;
        var9 = var8.first();
        while (module0423.NIL != var8) {
            if (!module0178.f11287(var9).eql(var6) || !module0178.f11335(var9).equal(var3)) {
                module0543.f33630(var9);
            }
            var8 = var8.rest();
            var9 = var8.first();
        }
        if (module0423.NIL == module0410.f28544((SubLObject)ConsesLow.list(module0423.$ic18$, var6, f29546(var3, var2)), module0423.$ic19$, (SubLObject)module0423.UNPROVIDED)) {
            f29534(var2, var3, var6);
        }
        return (SubLObject)module0423.NIL;
    }
    
    public static SubLObject f29534(final SubLObject var2, final SubLObject var3, final SubLObject var6) {
        return module0543.f33631(f29546(var3, var2), var6, (SubLObject)module0423.UNPROVIDED, (SubLObject)module0423.UNPROVIDED);
    }
    
    public static SubLObject f29546(final SubLObject var3, final SubLObject var2) {
        return (SubLObject)ConsesLow.list(module0423.$ic10$, (SubLObject)ConsesLow.list(module0423.$ic20$, var3), var2);
    }
    
    public static SubLObject f29547(final SubLObject var46, final SubLObject var2, SubLObject var47) {
        if (var47 == module0423.UNPROVIDED) {
            var47 = (SubLObject)module0423.NIL;
        }
        SubLObject var48 = (SubLObject)module0423.NIL;
        if (module0423.NIL != var47) {
            var48 = (SubLObject)ConsesLow.list(module0423.$ic20$, var46);
        }
        else {
            var48 = (SubLObject)ConsesLow.list(module0423.$ic20$, (SubLObject)ConsesLow.list(module0423.$ic21$, var46));
        }
        return (SubLObject)ConsesLow.list(module0423.$ic10$, var48, var2);
    }
    
    public static SubLObject f29542(final SubLObject var2, final SubLObject var4, final SubLObject var6) {
        final SubLObject var7 = f29545(var2, module0423.$ic13$);
        SubLObject var8 = (SubLObject)module0423.NIL;
        SubLObject var9 = var7;
        SubLObject var10 = (SubLObject)module0423.NIL;
        var10 = var9.first();
        while (module0423.NIL != var9) {
            if (module0178.f11287(var10).eql(var6) && module0178.f11335(var10).equal(var4)) {
                var8 = (SubLObject)module0423.T;
            }
            else {
                module0543.f33630(var10);
            }
            var9 = var9.rest();
            var10 = var9.first();
        }
        if (module0423.NIL == var8) {
            f29536(var2, var4, var6);
        }
        return (SubLObject)module0423.NIL;
    }
    
    public static SubLObject f29536(final SubLObject var2, final SubLObject var4, final SubLObject var6) {
        return module0543.f33631((SubLObject)ConsesLow.list(module0423.$ic14$, var4, var2), var6, (SubLObject)module0423.UNPROVIDED, (SubLObject)module0423.UNPROVIDED);
    }
    
    public static SubLObject f29543(final SubLObject var2, final SubLObject var52, final SubLObject var11, final SubLObject var6) {
        final SubLObject var53 = f29548(var52);
        final SubLObject var54 = f29545(var2, var53);
        SubLObject var55 = (SubLObject)module0423.NIL;
        final SubLObject var56 = f29549(var11, var52);
        SubLObject var57 = var54;
        SubLObject var58 = (SubLObject)module0423.NIL;
        var58 = var57.first();
        while (module0423.NIL != var57) {
            if (module0178.f11287(var58).eql(var6) && module0178.f11335(var58).equal(var56)) {
                var55 = (SubLObject)module0423.T;
            }
            else {
                module0543.f33630(var58);
            }
            var57 = var57.rest();
            var58 = var57.first();
        }
        if (module0423.NIL == var55) {
            f29537(var2, var52, var11, var6);
        }
        return (SubLObject)module0423.NIL;
    }
    
    public static SubLObject f29537(final SubLObject var2, final SubLObject var52, final SubLObject var11, final SubLObject var6) {
        final SubLObject var53 = f29548(var52);
        final SubLObject var54 = f29549(var11, var52);
        if (module0423.NIL != module0173.f10955(var53)) {
            return f29550(var2, var53, var54, var6);
        }
        Errors.warn((SubLObject)module0423.$ic22$, var52);
        return (SubLObject)module0423.NIL;
    }
    
    public static SubLObject f29550(final SubLObject var2, final SubLObject var53, final SubLObject var11, final SubLObject var6) {
        if (module0423.$ic15$.eql(var53)) {
            return module0543.f33631((SubLObject)ConsesLow.list(module0423.$ic16$, var11, var2), var6, (SubLObject)module0423.UNPROVIDED, (SubLObject)module0423.UNPROVIDED);
        }
        if (module0423.$ic23$.eql(var53) && var11.isList()) {
            SubLObject var54 = var11;
            SubLObject var55 = (SubLObject)module0423.NIL;
            var55 = var54.first();
            while (module0423.NIL != var54) {
                module0543.f33631((SubLObject)ConsesLow.list(module0423.$ic24$, var2, var55), var6, (SubLObject)module0423.UNPROVIDED, (SubLObject)module0423.UNPROVIDED);
                var54 = var54.rest();
                var55 = var54.first();
            }
            return (SubLObject)module0423.NIL;
        }
        return module0543.f33631((SubLObject)ConsesLow.list(module0423.$ic17$, var53, var11, var2), var6, (SubLObject)module0423.UNPROVIDED, (SubLObject)module0423.UNPROVIDED);
    }
    
    public static SubLObject f29541(final SubLObject var2, final SubLObject var7, final SubLObject var6) {
        return f29543(var2, (SubLObject)module0423.$ic25$, (SubLObject)ConsesLow.list(module0423.$ic20$, var7), var6);
    }
    
    public static SubLObject f29535(final SubLObject var2, final SubLObject var7, final SubLObject var6) {
        return f29537(var2, (SubLObject)module0423.$ic25$, (SubLObject)ConsesLow.list(module0423.$ic20$, var7), var6);
    }
    
    public static SubLObject f29544(final SubLObject var2, final SubLObject var13, final SubLObject var6) {
        if (module0423.NIL == module0035.f2171(var13, f29551(var2))) {
            SubLObject var14 = (SubLObject)module0423.NIL;
            SubLObject var15 = (SubLObject)module0423.NIL;
            SubLObject var16 = (SubLObject)module0423.NIL;
            SubLObject var17 = (SubLObject)module0423.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var13, var13, (SubLObject)module0423.$ic26$);
            var14 = var13.first();
            SubLObject var18 = var13.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var18, var13, (SubLObject)module0423.$ic26$);
            var15 = var18.first();
            var18 = var18.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var18, var13, (SubLObject)module0423.$ic26$);
            var16 = var18.first();
            var18 = var18.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var18, var13, (SubLObject)module0423.$ic26$);
            var17 = var18.first();
            var18 = var18.rest();
            if (module0423.NIL == var18) {
                if (module0423.NIL != var17) {
                    assert module0423.NIL != Types.integerp(var14) : var14;
                    assert module0423.NIL != Types.stringp(var15) : var15;
                    assert module0423.NIL != Types.stringp(var16) : var16;
                    assert module0423.NIL != module0233.f15360(var17) : var17;
                    final SubLObject var19 = module0172.f10921((SubLObject)ConsesLow.list(module0423.$ic30$, var2, var14));
                    if (module0423.NIL != var19) {
                        module0543.f33626(var19);
                    }
                    if (module0423.NIL == module0038.f2608(var15)) {
                        module0543.f33631((SubLObject)ConsesLow.list(module0423.$ic31$, (SubLObject)ConsesLow.list(module0423.$ic30$, var2, var14), var15), var6, (SubLObject)module0423.UNPROVIDED, (SubLObject)module0423.UNPROVIDED);
                    }
                    if (module0423.NIL == module0038.f2608(var16)) {
                        module0543.f33631((SubLObject)ConsesLow.list(module0423.$ic32$, (SubLObject)ConsesLow.list(module0423.$ic30$, var2, var14), var16), var6, (SubLObject)module0423.UNPROVIDED, (SubLObject)module0423.UNPROVIDED);
                    }
                    module0543.f33631((SubLObject)ConsesLow.list(module0423.$ic33$, (SubLObject)ConsesLow.list(module0423.$ic30$, var2, var14), var17), var6, (SubLObject)module0423.UNPROVIDED, (SubLObject)module0423.UNPROVIDED);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)module0423.$ic26$);
            }
        }
        return (SubLObject)module0423.NIL;
    }
    
    public static SubLObject f29538(final SubLObject var2, final SubLObject var13, final SubLObject var6) {
        SubLObject var14 = (SubLObject)module0423.NIL;
        SubLObject var15 = (SubLObject)module0423.NIL;
        SubLObject var16 = (SubLObject)module0423.NIL;
        SubLObject var17 = (SubLObject)module0423.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var13, var13, (SubLObject)module0423.$ic26$);
        var14 = var13.first();
        SubLObject var18 = var13.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var18, var13, (SubLObject)module0423.$ic26$);
        var15 = var18.first();
        var18 = var18.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var18, var13, (SubLObject)module0423.$ic26$);
        var16 = var18.first();
        var18 = var18.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var18, var13, (SubLObject)module0423.$ic26$);
        var17 = var18.first();
        var18 = var18.rest();
        if (module0423.NIL == var18) {
            if (module0423.NIL != var17) {
                assert module0423.NIL != Types.integerp(var14) : var14;
                assert module0423.NIL != Types.stringp(var15) : var15;
                assert module0423.NIL != Types.stringp(var16) : var16;
                assert module0423.NIL != module0233.f15360(var17) : var17;
                if (module0423.NIL == module0038.f2608(var15)) {
                    module0543.f33631((SubLObject)ConsesLow.list(module0423.$ic31$, (SubLObject)ConsesLow.list(module0423.$ic30$, var2, var14), var15), var6, (SubLObject)module0423.UNPROVIDED, (SubLObject)module0423.UNPROVIDED);
                }
                if (module0423.NIL == module0038.f2608(var16)) {
                    module0543.f33631((SubLObject)ConsesLow.list(module0423.$ic32$, (SubLObject)ConsesLow.list(module0423.$ic30$, var2, var14), var16), var6, (SubLObject)module0423.UNPROVIDED, (SubLObject)module0423.UNPROVIDED);
                }
                module0543.f33631((SubLObject)ConsesLow.list(module0423.$ic33$, (SubLObject)ConsesLow.list(module0423.$ic30$, var2, var14), var17), var6, (SubLObject)module0423.UNPROVIDED, (SubLObject)module0423.UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)module0423.$ic26$);
        }
        return (SubLObject)module0423.NIL;
    }
    
    public static SubLObject f29552(final SubLObject var2, final SubLObject var68, final SubLObject var6) {
        final SubLThread var69 = SubLProcess.currentSubLThread();
        SubLObject var70 = (SubLObject)module0423.NIL;
        final SubLObject var71 = module0147.$g2094$.currentBinding(var69);
        final SubLObject var72 = module0147.$g2095$.currentBinding(var69);
        try {
            module0147.$g2094$.bind((SubLObject)module0423.$ic7$, var69);
            module0147.$g2095$.bind(module0423.$ic8$, var69);
            final SubLObject var73 = module0423.$ic34$;
            if (module0423.NIL != module0158.f10010(var2, (SubLObject)module0423.ONE_INTEGER, var73)) {
                final SubLObject var74 = module0158.f10011(var2, (SubLObject)module0423.ONE_INTEGER, var73);
                SubLObject var75 = (SubLObject)module0423.NIL;
                final SubLObject var76 = (SubLObject)module0423.NIL;
                while (module0423.NIL == var75) {
                    final SubLObject var77 = module0052.f3695(var74, var76);
                    final SubLObject var78 = (SubLObject)SubLObjectFactory.makeBoolean(!var76.eql(var77));
                    if (module0423.NIL != var78) {
                        SubLObject var79 = (SubLObject)module0423.NIL;
                        try {
                            var79 = module0158.f10316(var77, (SubLObject)module0423.$ic11$, (SubLObject)module0423.$ic12$, (SubLObject)module0423.NIL);
                            SubLObject var21_70 = (SubLObject)module0423.NIL;
                            final SubLObject var22_71 = (SubLObject)module0423.NIL;
                            while (module0423.NIL == var21_70) {
                                final SubLObject var80 = module0052.f3695(var79, var22_71);
                                final SubLObject var24_72 = (SubLObject)SubLObjectFactory.makeBoolean(!var22_71.eql(var80));
                                if (module0423.NIL != var24_72) {
                                    var70 = (SubLObject)ConsesLow.cons(var80, var70);
                                }
                                var21_70 = (SubLObject)SubLObjectFactory.makeBoolean(module0423.NIL == var24_72);
                            }
                        }
                        finally {
                            final SubLObject var17_73 = Threads.$is_thread_performing_cleanupP$.currentBinding(var69);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0423.T, var69);
                                if (module0423.NIL != var79) {
                                    module0158.f10319(var79);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var17_73, var69);
                            }
                        }
                    }
                    var75 = (SubLObject)SubLObjectFactory.makeBoolean(module0423.NIL == var78);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var72, var69);
            module0147.$g2094$.rebind(var71, var69);
        }
        SubLObject var81 = var70;
        SubLObject var82 = (SubLObject)module0423.NIL;
        var82 = var81.first();
        while (module0423.NIL != var81) {
            final SubLObject var83 = module0178.f11335(var82);
            final SubLObject var84 = module0178.f11287(var82);
            if (!var84.eql(var6) || module0423.NIL == conses_high.member(var83, var68, Symbols.symbol_function((SubLObject)module0423.EQUAL), (SubLObject)module0423.UNPROVIDED)) {
                module0543.f33630(var82);
            }
            var81 = var81.rest();
            var82 = var81.first();
        }
        SubLObject var85 = var68;
        SubLObject var86 = (SubLObject)module0423.NIL;
        var86 = var85.first();
        while (module0423.NIL != var85) {
            if (module0423.NIL == module0220.f14584((SubLObject)ConsesLow.listS(module0423.$ic34$, var2, (SubLObject)module0423.$ic35$), var6, (SubLObject)module0423.UNPROVIDED, (SubLObject)module0423.UNPROVIDED)) {
                f29553(var2, var86, var6);
            }
            var85 = var85.rest();
            var86 = var85.first();
        }
        return var2;
    }
    
    public static SubLObject f29553(final SubLObject var2, final SubLObject var76, final SubLObject var6) {
        return module0543.f33631((SubLObject)ConsesLow.list(module0423.$ic34$, var2, var76), var6, (SubLObject)module0423.UNPROVIDED, (SubLObject)module0423.UNPROVIDED);
    }
    
    public static SubLObject f29554(final SubLObject var2, SubLObject var77, final SubLObject var78, final SubLObject var79, final SubLObject var6) {
        final SubLObject var80 = f29555(var2);
        if (module0423.NIL != var80 && module0423.NIL != var77 && !var80.eql(var77)) {
            Errors.error((SubLObject)module0423.$ic36$, var77, var2, var80);
        }
        if (module0423.NIL != var80) {
            var77 = var80;
        }
        if (module0423.NIL == var77) {
            var77 = module0202.f12683(module0423.$ic37$, (SubLObject)ConsesLow.list(var2), (SubLObject)module0423.UNPROVIDED);
        }
        SubLObject var81 = var78;
        SubLObject var82 = (SubLObject)module0423.NIL;
        var82 = var81.first();
        while (module0423.NIL != var81) {
            f29556(var77, var82, var6);
            var81 = var81.rest();
            var82 = var81.first();
        }
        var81 = var79;
        SubLObject var83 = (SubLObject)module0423.NIL;
        var83 = var81.first();
        while (module0423.NIL != var81) {
            SubLObject var85;
            final SubLObject var84 = var85 = var83;
            SubLObject var86 = (SubLObject)module0423.NIL;
            SubLObject var87 = (SubLObject)module0423.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)module0423.$ic38$);
            var86 = var85.first();
            var85 = var85.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)module0423.$ic38$);
            var87 = var85.first();
            var85 = var85.rest();
            if (module0423.NIL == var85) {
                f29557(var77, var86, var87);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var84, (SubLObject)module0423.$ic38$);
            }
            var81 = var81.rest();
            var83 = var81.first();
        }
        return var77;
    }
    
    public static SubLObject f29558(final SubLObject var2, SubLObject var77, final SubLObject var78, final SubLObject var79, final SubLObject var6) {
        final SubLObject var80 = f29555(var2);
        if (module0423.NIL != var80 && module0423.NIL != var77 && !var80.eql(var77)) {
            Errors.error((SubLObject)module0423.$ic36$, var77, var2, var80);
        }
        if (module0423.NIL != var80) {
            var77 = var80;
        }
        if (module0423.NIL == var77) {
            var77 = module0202.f12683(module0423.$ic37$, (SubLObject)ConsesLow.list(var2), (SubLObject)module0423.UNPROVIDED);
        }
        f29559(var77, var78, var6);
        f29560(var77, var79);
        return var77;
    }
    
    public static SubLObject f29559(final SubLObject var77, final SubLObject var78, final SubLObject var6) {
        final SubLThread var79 = SubLProcess.currentSubLThread();
        SubLObject var80 = (SubLObject)module0423.NIL;
        if (module0423.NIL != module0173.f10955(var77)) {
            final SubLObject var81 = module0147.$g2094$.currentBinding(var79);
            final SubLObject var82 = module0147.$g2095$.currentBinding(var79);
            try {
                module0147.$g2094$.bind((SubLObject)module0423.$ic7$, var79);
                module0147.$g2095$.bind(module0423.$ic8$, var79);
                final SubLObject var83 = module0423.$ic39$;
                if (module0423.NIL != module0158.f10010(var77, (SubLObject)module0423.ONE_INTEGER, var83)) {
                    final SubLObject var84 = module0158.f10011(var77, (SubLObject)module0423.ONE_INTEGER, var83);
                    SubLObject var85 = (SubLObject)module0423.NIL;
                    final SubLObject var86 = (SubLObject)module0423.NIL;
                    while (module0423.NIL == var85) {
                        final SubLObject var87 = module0052.f3695(var84, var86);
                        final SubLObject var88 = (SubLObject)SubLObjectFactory.makeBoolean(!var86.eql(var87));
                        if (module0423.NIL != var88) {
                            SubLObject var89 = (SubLObject)module0423.NIL;
                            try {
                                var89 = module0158.f10316(var87, (SubLObject)module0423.$ic11$, (SubLObject)module0423.$ic12$, (SubLObject)module0423.NIL);
                                SubLObject var21_87 = (SubLObject)module0423.NIL;
                                final SubLObject var22_88 = (SubLObject)module0423.NIL;
                                while (module0423.NIL == var21_87) {
                                    final SubLObject var90 = module0052.f3695(var89, var22_88);
                                    final SubLObject var24_89 = (SubLObject)SubLObjectFactory.makeBoolean(!var22_88.eql(var90));
                                    if (module0423.NIL != var24_89) {
                                        var80 = (SubLObject)ConsesLow.cons(var90, var80);
                                    }
                                    var21_87 = (SubLObject)SubLObjectFactory.makeBoolean(module0423.NIL == var24_89);
                                }
                            }
                            finally {
                                final SubLObject var17_90 = Threads.$is_thread_performing_cleanupP$.currentBinding(var79);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0423.T, var79);
                                    if (module0423.NIL != var89) {
                                        module0158.f10319(var89);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var17_90, var79);
                                }
                            }
                        }
                        var85 = (SubLObject)SubLObjectFactory.makeBoolean(module0423.NIL == var88);
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var82, var79);
                module0147.$g2094$.rebind(var81, var79);
            }
        }
        SubLObject var91 = var80;
        SubLObject var92 = (SubLObject)module0423.NIL;
        var92 = var91.first();
        while (module0423.NIL != var91) {
            final SubLObject var93 = module0178.f11335(var92);
            final SubLObject var94 = module0178.f11287(var92);
            if (!var94.eql(var6) || module0423.NIL == conses_high.member(var93, var78, Symbols.symbol_function((SubLObject)module0423.EQUAL), (SubLObject)module0423.UNPROVIDED)) {
                module0543.f33630(var92);
            }
            var91 = var91.rest();
            var92 = var91.first();
        }
        SubLObject var95 = var78;
        SubLObject var96 = (SubLObject)module0423.NIL;
        var96 = var95.first();
        while (module0423.NIL != var95) {
            if (module0423.NIL == module0220.f14584((SubLObject)ConsesLow.list(module0423.$ic39$, var77, var96), var6, (SubLObject)module0423.UNPROVIDED, (SubLObject)module0423.UNPROVIDED)) {
                f29556(var77, var96, var6);
            }
            var95 = var95.rest();
            var96 = var95.first();
        }
        return var77;
    }
    
    public static SubLObject f29556(final SubLObject var77, final SubLObject var81, final SubLObject var6) {
        return module0543.f33631((SubLObject)ConsesLow.list(module0423.$ic39$, var77, var81), var6, (SubLObject)module0423.UNPROVIDED, (SubLObject)module0423.UNPROVIDED);
    }
    
    public static SubLObject f29560(final SubLObject var77, final SubLObject var79) {
        SubLObject var81;
        final SubLObject var80 = var81 = (SubLObject)((module0423.NIL != module0173.f10955(var77)) ? f29561(var77) : module0423.NIL);
        SubLObject var82 = (SubLObject)module0423.NIL;
        var82 = var81.first();
        while (module0423.NIL != var81) {
            if (module0423.NIL == module0004.f104(var82, var79, Symbols.symbol_function((SubLObject)module0423.EQUAL), (SubLObject)module0423.UNPROVIDED)) {
                SubLObject var84;
                final SubLObject var83 = var84 = var82;
                SubLObject var85 = (SubLObject)module0423.NIL;
                SubLObject var86 = (SubLObject)module0423.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0423.$ic38$);
                var85 = var84.first();
                var84 = var84.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)module0423.$ic38$);
                var86 = var84.first();
                var84 = var84.rest();
                if (module0423.NIL == var84) {
                    module0543.f33658((SubLObject)ConsesLow.list(module0423.$ic40$, var85, var77), var86);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)module0423.$ic38$);
                }
            }
            var81 = var81.rest();
            var82 = var81.first();
        }
        var81 = var79;
        SubLObject var87 = (SubLObject)module0423.NIL;
        var87 = var81.first();
        while (module0423.NIL != var81) {
            if (module0423.NIL == module0004.f104(var87, var80, Symbols.symbol_function((SubLObject)module0423.EQUAL), (SubLObject)module0423.UNPROVIDED)) {
                SubLObject var89;
                final SubLObject var88 = var89 = var87;
                SubLObject var85 = (SubLObject)module0423.NIL;
                SubLObject var86 = (SubLObject)module0423.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var89, var88, (SubLObject)module0423.$ic38$);
                var85 = var89.first();
                var89 = var89.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var89, var88, (SubLObject)module0423.$ic38$);
                var86 = var89.first();
                var89 = var89.rest();
                if (module0423.NIL == var89) {
                    f29557(var77, var85, var86);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var88, (SubLObject)module0423.$ic38$);
                }
            }
            var81 = var81.rest();
            var87 = var81.first();
        }
        return (SubLObject)module0423.NIL;
    }
    
    public static SubLObject f29557(final SubLObject var77, final SubLObject var85, final SubLObject var4) {
        return module0543.f33631((SubLObject)ConsesLow.list(module0423.$ic40$, var85, var77), var4, (SubLObject)module0423.UNPROVIDED, (SubLObject)module0423.UNPROVIDED);
    }
    
    public static SubLObject f29562(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        var3.resetMultipleValues();
        final SubLObject var4 = module0337.f22630(var2, (SubLObject)module0423.$ic41$);
        final SubLObject var5 = var3.secondMultipleValue();
        var3.resetMultipleValues();
        if (module0423.NIL != var4) {
            final SubLObject var6 = module0035.f2294(var5, (SubLObject)module0423.$ic42$, (SubLObject)module0423.UNPROVIDED, (SubLObject)module0423.UNPROVIDED);
            return (SubLObject)ConsesLow.list(module0285.f18933(var6, (SubLObject)module0423.UNPROVIDED));
        }
        final SubLObject var7 = conses_high.union(module0220.f14565(var2, module0423.$ic10$, (SubLObject)module0423.TWO_INTEGER, (SubLObject)module0423.ONE_INTEGER, (SubLObject)module0423.$ic12$), module0220.f14596(var2, module0423.$ic17$, module0423.$ic9$, (SubLObject)module0423.THREE_INTEGER, (SubLObject)module0423.ONE_INTEGER, (SubLObject)module0423.TWO_INTEGER, (SubLObject)module0423.$ic12$), Symbols.symbol_function((SubLObject)module0423.EQUAL), (SubLObject)module0423.UNPROVIDED);
        SubLObject var8 = (SubLObject)module0423.NIL;
        SubLObject var9 = var7;
        SubLObject var10 = (SubLObject)module0423.NIL;
        var10 = var9.first();
        while (module0423.NIL != var9) {
            var8 = (SubLObject)ConsesLow.cons(module0285.f18933(var10, (SubLObject)module0423.UNPROVIDED), var8);
            var9 = var9.rest();
            var10 = var9.first();
        }
        return Sequences.nreverse(var8);
    }
    
    public static SubLObject f29563(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        var3.resetMultipleValues();
        final SubLObject var4 = module0337.f22630(var2, (SubLObject)module0423.$ic41$);
        final SubLObject var5 = var3.secondMultipleValue();
        var3.resetMultipleValues();
        if (module0423.NIL != var4) {
            final SubLObject var6 = module0035.f2294(var5, (SubLObject)module0423.$ic42$, (SubLObject)module0423.UNPROVIDED, (SubLObject)module0423.UNPROVIDED);
            return module0285.f18933(var6, (SubLObject)module0423.UNPROVIDED);
        }
        final SubLObject var7 = f29562(var2);
        if (module0423.NIL != module0035.f1997(var7)) {
            return var7.first();
        }
        if (module0423.NIL == var7) {
            Errors.error((SubLObject)module0423.$ic43$, var2);
        }
        else {
            Errors.error((SubLObject)module0423.$ic44$, var2);
        }
        return (SubLObject)module0423.NIL;
    }
    
    public static SubLObject f29564(final SubLObject var2) {
        return module0202.f12691(f29563(var2), (SubLObject)module0423.UNPROVIDED);
    }
    
    public static SubLObject f29565(final SubLObject var2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0423.NIL == f29564(var2));
    }
    
    public static SubLObject f29566(final SubLObject var2) {
        final SubLObject var3 = module0285.f18933(module0220.f14596(var2, module0423.$ic17$, module0423.$ic45$, (SubLObject)module0423.THREE_INTEGER, (SubLObject)module0423.ONE_INTEGER, (SubLObject)module0423.TWO_INTEGER, (SubLObject)module0423.UNPROVIDED).first(), (SubLObject)module0423.UNPROVIDED);
        return f29567(var3, (SubLObject)module0423.$ic25$);
    }
    
    public static SubLObject f29568(final SubLObject var2) {
        return module0220.f14565(var2, module0423.$ic14$, (SubLObject)module0423.TWO_INTEGER, (SubLObject)module0423.ONE_INTEGER, (SubLObject)module0423.$ic12$);
    }
    
    public static SubLObject f29569(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        var3.resetMultipleValues();
        final SubLObject var4 = module0337.f22630(var2, (SubLObject)module0423.$ic46$);
        final SubLObject var5 = var3.secondMultipleValue();
        var3.resetMultipleValues();
        if (module0423.NIL != var4) {
            final SubLObject var6 = module0035.f2294(var5, (SubLObject)module0423.$ic47$, (SubLObject)module0423.UNPROVIDED, (SubLObject)module0423.UNPROVIDED);
            return var6;
        }
        final SubLObject var7 = f29568(var2);
        final SubLObject var8 = f29563(var2);
        if (module0423.NIL != module0202.f12888(var8)) {
            return (SubLObject)module0423.NIL;
        }
        if (module0423.NIL == var7) {
            return module0423.$ic48$;
        }
        if (module0423.NIL != module0035.f1997(var7)) {
            return module0285.f18875(var7.first(), (SubLObject)module0423.UNPROVIDED);
        }
        Errors.error((SubLObject)module0423.$ic49$, var2);
        return (SubLObject)module0423.NIL;
    }
    
    public static SubLObject f29570(final SubLObject var2) {
        final SubLObject var3 = f29569(var2);
        if (module0423.NIL != var3) {
            return module0162.f10628(var3);
        }
        return (SubLObject)module0423.NIL;
    }
    
    public static SubLObject f29571(final SubLObject var2) {
        final SubLObject var3 = module0220.f14565(var2, module0423.$ic34$, (SubLObject)module0423.ONE_INTEGER, (SubLObject)module0423.TWO_INTEGER, (SubLObject)module0423.$ic12$);
        return var3;
    }
    
    public static SubLObject f29572(final SubLObject var104) {
        final SubLObject var105 = module0220.f14565(var104, module0423.$ic39$, (SubLObject)module0423.ONE_INTEGER, (SubLObject)module0423.TWO_INTEGER, (SubLObject)module0423.$ic12$);
        return var105;
    }
    
    public static SubLObject f29555(final SubLObject var2) {
        final SubLObject var3 = module0220.f14556(var2, module0423.$ic50$, (SubLObject)module0423.TWO_INTEGER, (SubLObject)module0423.ONE_INTEGER, (SubLObject)module0423.$ic12$);
        return var3;
    }
    
    public static SubLObject f29561(final SubLObject var77) {
        final SubLThread var78 = SubLProcess.currentSubLThread();
        SubLObject var79 = (SubLObject)module0423.NIL;
        final SubLObject var80 = module0147.$g2094$.currentBinding(var78);
        final SubLObject var81 = module0147.$g2095$.currentBinding(var78);
        try {
            module0147.$g2094$.bind((SubLObject)module0423.$ic7$, var78);
            module0147.$g2095$.bind(module0423.$ic8$, var78);
            final SubLObject var82 = module0423.$ic40$;
            if (module0423.NIL != module0158.f10010(var77, (SubLObject)module0423.TWO_INTEGER, var82)) {
                final SubLObject var83 = module0158.f10011(var77, (SubLObject)module0423.TWO_INTEGER, var82);
                SubLObject var84 = (SubLObject)module0423.NIL;
                final SubLObject var85 = (SubLObject)module0423.NIL;
                while (module0423.NIL == var84) {
                    final SubLObject var86 = module0052.f3695(var83, var85);
                    final SubLObject var87 = (SubLObject)SubLObjectFactory.makeBoolean(!var85.eql(var86));
                    if (module0423.NIL != var87) {
                        SubLObject var88 = (SubLObject)module0423.NIL;
                        try {
                            var88 = module0158.f10316(var86, (SubLObject)module0423.$ic11$, (SubLObject)module0423.$ic12$, (SubLObject)module0423.NIL);
                            SubLObject var21_105 = (SubLObject)module0423.NIL;
                            final SubLObject var22_106 = (SubLObject)module0423.NIL;
                            while (module0423.NIL == var21_105) {
                                final SubLObject var89 = module0052.f3695(var88, var22_106);
                                final SubLObject var24_107 = (SubLObject)SubLObjectFactory.makeBoolean(!var22_106.eql(var89));
                                if (module0423.NIL != var24_107) {
                                    final SubLObject var90 = module0178.f11334(var89);
                                    final SubLObject var91 = module0178.f11287(var89);
                                    var79 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var90, var91), var79);
                                }
                                var21_105 = (SubLObject)SubLObjectFactory.makeBoolean(module0423.NIL == var24_107);
                            }
                        }
                        finally {
                            final SubLObject var17_108 = Threads.$is_thread_performing_cleanupP$.currentBinding(var78);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0423.T, var78);
                                if (module0423.NIL != var88) {
                                    module0158.f10319(var88);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var17_108, var78);
                            }
                        }
                    }
                    var84 = (SubLObject)SubLObjectFactory.makeBoolean(module0423.NIL == var87);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var81, var78);
            module0147.$g2094$.rebind(var80, var78);
        }
        return Sequences.nreverse(var79);
    }
    
    public static SubLObject f29573(SubLObject var2) {
        var2 = module0285.f18875(var2, (SubLObject)module0423.UNPROVIDED);
        final SubLObject var3 = f29574(var2);
        SubLObject var4 = f29575(var3);
        if (module0423.NIL != module0371.f26052()) {
            var4 = module0035.f2341(var4, module0371.f26054(var2));
        }
        if (module0423.NIL != f29576()) {
            var4 = module0035.f2341(var4, f29577(var2));
        }
        return var4;
    }
    
    public static SubLObject f29576() {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        return module0423.$g3440$.getDynamicValue(var15);
    }
    
    public static SubLObject f29577(final SubLObject var2) {
        final SubLObject var3 = module0684.f41933(var2);
        final SubLObject var4 = (SubLObject)((module0423.NIL != var3) ? ConsesLow.list((SubLObject)module0423.$ic52$, var3) : module0423.NIL);
        return var4;
    }
    
    public static SubLObject f29578(final SubLObject var2, final SubLObject var52) {
        assert module0423.NIL != module0360.f23781(var52) : var52;
        final SubLObject var53 = f29573(var2);
        return module0408.f28408(var53, var52);
    }
    
    public static SubLObject f29579(final SubLObject var2) {
        return module0408.f28408(f29573(var2), (SubLObject)module0423.$ic52$);
    }
    
    public static SubLObject f29580() {
        return module0423.$ic54$;
    }
    
    public static SubLObject f29581(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0423.NIL;
        SubLObject var5 = (SubLObject)module0423.NIL;
        final SubLObject var6 = module0147.$g2094$.currentBinding(var3);
        final SubLObject var7 = module0147.$g2095$.currentBinding(var3);
        try {
            module0147.$g2094$.bind((SubLObject)module0423.$ic7$, var3);
            module0147.$g2095$.bind(module0423.$ic8$, var3);
            SubLObject var8 = module0423.$ic10$;
            if (module0423.NIL != module0158.f10010(var2, (SubLObject)module0423.TWO_INTEGER, var8)) {
                final SubLObject var9 = module0158.f10011(var2, (SubLObject)module0423.TWO_INTEGER, var8);
                SubLObject var10 = (SubLObject)module0423.NIL;
                final SubLObject var11 = (SubLObject)module0423.NIL;
                while (module0423.NIL == var10) {
                    final SubLObject var12 = module0052.f3695(var9, var11);
                    final SubLObject var13 = (SubLObject)SubLObjectFactory.makeBoolean(!var11.eql(var12));
                    if (module0423.NIL != var13) {
                        SubLObject var14 = (SubLObject)module0423.NIL;
                        try {
                            var14 = module0158.f10316(var12, (SubLObject)module0423.$ic11$, (SubLObject)module0423.$ic12$, (SubLObject)module0423.NIL);
                            SubLObject var21_114 = (SubLObject)module0423.NIL;
                            final SubLObject var22_115 = (SubLObject)module0423.NIL;
                            while (module0423.NIL == var21_114) {
                                final SubLObject var15 = module0052.f3695(var14, var22_115);
                                final SubLObject var24_116 = (SubLObject)SubLObjectFactory.makeBoolean(!var22_115.eql(var15));
                                if (module0423.NIL != var24_116) {
                                    final SubLObject var16 = module0178.f11287(var15);
                                    final SubLObject var18;
                                    final SubLObject var17 = var18 = module0161.f10557(var16);
                                    if (module0423.NIL == conses_high.member(var18, var4, Symbols.symbol_function((SubLObject)module0423.EQL), Symbols.symbol_function((SubLObject)module0423.IDENTITY))) {
                                        var4 = (SubLObject)ConsesLow.cons(var18, var4);
                                    }
                                }
                                var21_114 = (SubLObject)SubLObjectFactory.makeBoolean(module0423.NIL == var24_116);
                            }
                        }
                        finally {
                            final SubLObject var17_119 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0423.T, var3);
                                if (module0423.NIL != var14) {
                                    module0158.f10319(var14);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var17_119, var3);
                            }
                        }
                    }
                    var10 = (SubLObject)SubLObjectFactory.makeBoolean(module0423.NIL == var13);
                }
            }
            var8 = module0423.$ic14$;
            if (module0423.NIL != module0158.f10010(var2, (SubLObject)module0423.TWO_INTEGER, var8)) {
                final SubLObject var9 = module0158.f10011(var2, (SubLObject)module0423.TWO_INTEGER, var8);
                SubLObject var10 = (SubLObject)module0423.NIL;
                final SubLObject var11 = (SubLObject)module0423.NIL;
                while (module0423.NIL == var10) {
                    final SubLObject var12 = module0052.f3695(var9, var11);
                    final SubLObject var13 = (SubLObject)SubLObjectFactory.makeBoolean(!var11.eql(var12));
                    if (module0423.NIL != var13) {
                        SubLObject var14 = (SubLObject)module0423.NIL;
                        try {
                            var14 = module0158.f10316(var12, (SubLObject)module0423.$ic11$, (SubLObject)module0423.$ic12$, (SubLObject)module0423.NIL);
                            SubLObject var21_115 = (SubLObject)module0423.NIL;
                            final SubLObject var22_116 = (SubLObject)module0423.NIL;
                            while (module0423.NIL == var21_115) {
                                final SubLObject var15 = module0052.f3695(var14, var22_116);
                                final SubLObject var24_117 = (SubLObject)SubLObjectFactory.makeBoolean(!var22_116.eql(var15));
                                if (module0423.NIL != var24_117) {
                                    final SubLObject var16 = module0178.f11287(var15);
                                    final SubLObject var18;
                                    final SubLObject var17 = var18 = module0161.f10557(var16);
                                    if (module0423.NIL == conses_high.member(var18, var4, Symbols.symbol_function((SubLObject)module0423.EQL), Symbols.symbol_function((SubLObject)module0423.IDENTITY))) {
                                        var4 = (SubLObject)ConsesLow.cons(var18, var4);
                                    }
                                }
                                var21_115 = (SubLObject)SubLObjectFactory.makeBoolean(module0423.NIL == var24_117);
                            }
                        }
                        finally {
                            final SubLObject var17_120 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0423.T, var3);
                                if (module0423.NIL != var14) {
                                    module0158.f10319(var14);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var17_120, var3);
                            }
                        }
                    }
                    var10 = (SubLObject)SubLObjectFactory.makeBoolean(module0423.NIL == var13);
                }
            }
            var8 = module0423.$ic16$;
            if (module0423.NIL != module0158.f10010(var2, (SubLObject)module0423.TWO_INTEGER, var8)) {
                final SubLObject var9 = module0158.f10011(var2, (SubLObject)module0423.TWO_INTEGER, var8);
                SubLObject var10 = (SubLObject)module0423.NIL;
                final SubLObject var11 = (SubLObject)module0423.NIL;
                while (module0423.NIL == var10) {
                    final SubLObject var12 = module0052.f3695(var9, var11);
                    final SubLObject var13 = (SubLObject)SubLObjectFactory.makeBoolean(!var11.eql(var12));
                    if (module0423.NIL != var13) {
                        SubLObject var14 = (SubLObject)module0423.NIL;
                        try {
                            var14 = module0158.f10316(var12, (SubLObject)module0423.$ic11$, (SubLObject)module0423.$ic12$, (SubLObject)module0423.NIL);
                            SubLObject var21_116 = (SubLObject)module0423.NIL;
                            final SubLObject var22_117 = (SubLObject)module0423.NIL;
                            while (module0423.NIL == var21_116) {
                                final SubLObject var15 = module0052.f3695(var14, var22_117);
                                final SubLObject var24_118 = (SubLObject)SubLObjectFactory.makeBoolean(!var22_117.eql(var15));
                                if (module0423.NIL != var24_118) {
                                    final SubLObject var16 = module0178.f11287(var15);
                                    final SubLObject var18;
                                    final SubLObject var17 = var18 = module0161.f10557(var16);
                                    if (module0423.NIL == conses_high.member(var18, var4, Symbols.symbol_function((SubLObject)module0423.EQL), Symbols.symbol_function((SubLObject)module0423.IDENTITY))) {
                                        var4 = (SubLObject)ConsesLow.cons(var18, var4);
                                    }
                                }
                                var21_116 = (SubLObject)SubLObjectFactory.makeBoolean(module0423.NIL == var24_118);
                            }
                        }
                        finally {
                            final SubLObject var17_121 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0423.T, var3);
                                if (module0423.NIL != var14) {
                                    module0158.f10319(var14);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var17_121, var3);
                            }
                        }
                    }
                    var10 = (SubLObject)SubLObjectFactory.makeBoolean(module0423.NIL == var13);
                }
            }
            var8 = module0423.$ic17$;
            if (module0423.NIL != module0158.f10010(var2, (SubLObject)module0423.THREE_INTEGER, var8)) {
                final SubLObject var9 = module0158.f10011(var2, (SubLObject)module0423.THREE_INTEGER, var8);
                SubLObject var10 = (SubLObject)module0423.NIL;
                final SubLObject var11 = (SubLObject)module0423.NIL;
                while (module0423.NIL == var10) {
                    final SubLObject var12 = module0052.f3695(var9, var11);
                    final SubLObject var13 = (SubLObject)SubLObjectFactory.makeBoolean(!var11.eql(var12));
                    if (module0423.NIL != var13) {
                        SubLObject var14 = (SubLObject)module0423.NIL;
                        try {
                            var14 = module0158.f10316(var12, (SubLObject)module0423.$ic11$, (SubLObject)module0423.$ic12$, (SubLObject)module0423.NIL);
                            SubLObject var21_117 = (SubLObject)module0423.NIL;
                            final SubLObject var22_118 = (SubLObject)module0423.NIL;
                            while (module0423.NIL == var21_117) {
                                final SubLObject var19 = module0052.f3695(var14, var22_118);
                                final SubLObject var24_119 = (SubLObject)SubLObjectFactory.makeBoolean(!var22_118.eql(var19));
                                if (module0423.NIL != var24_119) {
                                    final SubLObject var16 = module0178.f11287(var19);
                                    final SubLObject var18;
                                    final SubLObject var17 = var18 = module0161.f10557(var16);
                                    if (module0423.NIL == conses_high.member(var18, var4, Symbols.symbol_function((SubLObject)module0423.EQL), Symbols.symbol_function((SubLObject)module0423.IDENTITY))) {
                                        var4 = (SubLObject)ConsesLow.cons(var18, var4);
                                    }
                                }
                                var21_117 = (SubLObject)SubLObjectFactory.makeBoolean(module0423.NIL == var24_119);
                            }
                        }
                        finally {
                            final SubLObject var17_122 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0423.T, var3);
                                if (module0423.NIL != var14) {
                                    module0158.f10319(var14);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var17_122, var3);
                            }
                        }
                    }
                    var10 = (SubLObject)SubLObjectFactory.makeBoolean(module0423.NIL == var13);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var7, var3);
            module0147.$g2094$.rebind(var6, var3);
        }
        var5 = module0262.f17370(var4, var4, (SubLObject)module0423.UNPROVIDED);
        if (module0423.NIL != module0035.f1997(var5)) {
            return var5.first();
        }
        return f29580();
    }
    
    public static SubLObject f29582(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0423.NIL != module0173.f10955(var1) && module0423.NIL != module0259.f16891(var1, module0423.$ic55$));
    }
    
    public static SubLObject f29583(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0423.NIL != module0173.f10955(var1) && module0423.NIL != module0259.f16891(var1, module0423.$ic56$));
    }
    
    public static SubLObject f29551(final SubLObject var2) {
        return f29584(var2, (SubLObject)module0423.NIL);
    }
    
    public static SubLObject f29585(final SubLObject var2, final SubLObject var132) {
        return f29584(var2, var132).first();
    }
    
    public static SubLObject f29584(final SubLObject var2, final SubLObject var133) {
        assert module0423.NIL != f29532(var2) : var2;
        final SubLObject var134 = module0067.f4880(Symbols.symbol_function((SubLObject)module0423.EQL), (SubLObject)module0423.UNPROVIDED);
        if (module0423.NIL != f29583(var2)) {
            final SubLObject var135 = module0423.$ic58$;
            if (module0423.NIL != module0158.f10010(var2, (SubLObject)module0423.NIL, var135)) {
                final SubLObject var136 = module0158.f10011(var2, (SubLObject)module0423.NIL, var135);
                SubLObject var137 = (SubLObject)module0423.NIL;
                final SubLObject var138 = (SubLObject)module0423.NIL;
                while (module0423.NIL == var137) {
                    final SubLObject var139 = module0052.f3695(var136, var138);
                    final SubLObject var140 = (SubLObject)SubLObjectFactory.makeBoolean(!var138.eql(var139));
                    if (module0423.NIL != var140) {
                        SubLObject var141 = (SubLObject)module0423.NIL;
                        try {
                            var141 = module0158.f10316(var139, (SubLObject)module0423.$ic11$, (SubLObject)module0423.$ic12$, (SubLObject)module0423.NIL);
                            SubLObject var21_135 = (SubLObject)module0423.NIL;
                            final SubLObject var22_136 = (SubLObject)module0423.NIL;
                            while (module0423.NIL == var21_135) {
                                final SubLObject var142 = module0052.f3695(var141, var22_136);
                                final SubLObject var24_137 = (SubLObject)SubLObjectFactory.makeBoolean(!var22_136.eql(var142));
                                if (module0423.NIL != var24_137) {
                                    final SubLObject var143 = module0178.f11335(var142);
                                    final SubLObject var144 = module0178.f11336(var142);
                                    final SubLObject var145 = module0220.f14553(var144, module0423.$ic31$, (SubLObject)module0423.UNPROVIDED, (SubLObject)module0423.UNPROVIDED, (SubLObject)module0423.UNPROVIDED);
                                    final SubLObject var146 = module0220.f14553(var144, module0423.$ic32$, (SubLObject)module0423.UNPROVIDED, (SubLObject)module0423.UNPROVIDED, (SubLObject)module0423.UNPROVIDED);
                                    final SubLObject var147 = module0220.f14553(var144, module0423.$ic33$, (SubLObject)module0423.UNPROVIDED, (SubLObject)module0423.UNPROVIDED, (SubLObject)module0423.UNPROVIDED);
                                    if (module0423.NIL == var133 || var143.equal(var133)) {
                                        module0067.f4886(var134, var144, (SubLObject)ConsesLow.list(var143, var145, var146, var147));
                                    }
                                }
                                var21_135 = (SubLObject)SubLObjectFactory.makeBoolean(module0423.NIL == var24_137);
                            }
                        }
                        finally {
                            final SubLObject var148 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0423.T);
                                if (module0423.NIL != var141) {
                                    module0158.f10319(var141);
                                }
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var148);
                            }
                        }
                    }
                    var137 = (SubLObject)SubLObjectFactory.makeBoolean(module0423.NIL == var140);
                }
            }
        }
        return Sort.sort(module0067.f4903(var134), Symbols.symbol_function((SubLObject)module0423.$ic59$), Symbols.symbol_function((SubLObject)module0423.$ic60$));
    }
    
    public static SubLObject f29586(final SubLObject var2, final SubLObject var110, final SubLObject var6) {
        SubLObject var111;
        SubLObject var112;
        SubLObject var113;
        for (var111 = (SubLObject)module0423.NIL, var111 = var110; module0423.NIL != var111; var111 = conses_high.cddr(var111)) {
            var112 = var111.first();
            var113 = conses_high.cadr(var111);
            f29537(var2, var112, var113, var6);
        }
        return var2;
    }
    
    public static SubLObject f29575(final SubLObject var109) {
        SubLObject var110 = (SubLObject)module0423.NIL;
        SubLObject var111 = var109;
        SubLObject var112 = (SubLObject)module0423.NIL;
        var112 = var111.first();
        while (module0423.NIL != var111) {
            SubLObject var114;
            final SubLObject var113 = var114 = var112;
            SubLObject var115 = (SubLObject)module0423.NIL;
            SubLObject var116 = (SubLObject)module0423.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var114, var113, (SubLObject)module0423.$ic61$);
            var115 = var114.first();
            var114 = var114.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var114, var113, (SubLObject)module0423.$ic61$);
            var116 = var114.first();
            var114 = var114.rest();
            if (module0423.NIL == var114) {
                final SubLObject var117 = f29587(var115);
                final SubLObject var118 = f29567(var116, var117);
                var110 = conses_high.putf(var110, var117, var118);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var113, (SubLObject)module0423.$ic61$);
            }
            var111 = var111.rest();
            var112 = var111.first();
        }
        return var110;
    }
    
    public static SubLObject f29567(final SubLObject var11, final SubLObject var143) {
        if (var143.eql((SubLObject)module0423.$ic62$) || var143.eql((SubLObject)module0423.$ic63$)) {
            return f29588(var11);
        }
        if (var143.eql((SubLObject)module0423.$ic25$)) {
            return module0285.f18933(module0231.f15291(var11), (SubLObject)module0423.UNPROVIDED);
        }
        if (!var143.eql((SubLObject)module0423.$ic52$)) {
            return module0231.f15291(var11);
        }
        if (module0423.NIL != module0202.f12674(var11)) {
            SubLObject var144 = (SubLObject)module0423.NIL;
            SubLObject var146;
            final SubLObject var145 = var146 = module0205.f13207(var11, (SubLObject)module0423.$ic64$);
            SubLObject var147 = (SubLObject)module0423.NIL;
            var147 = var146.first();
            while (module0423.NIL != var146) {
                if (module0423.NIL != module0290.f19515(var147)) {
                    var147 = module0290.f19510(var147);
                }
                else if (module0423.NIL != module0202.f12883(var147, (SubLObject)module0423.UNPROVIDED)) {
                    var147 = module0288.f19338(var147, (SubLObject)module0423.UNPROVIDED);
                }
                final SubLObject var148 = var147;
                if (module0423.NIL != var148) {
                    var144 = (SubLObject)ConsesLow.cons(var148, var144);
                }
                var146 = var146.rest();
                var147 = var146.first();
            }
            return Sequences.nreverse(var144);
        }
        return module0231.f15291(var11);
    }
    
    public static SubLObject f29549(final SubLObject var11, final SubLObject var143) {
        if (var143.eql((SubLObject)module0423.$ic62$) || var143.eql((SubLObject)module0423.$ic63$)) {
            return var11.isInteger() ? f29589(var11) : module0423.$ic65$;
        }
        if (var143.eql((SubLObject)module0423.$ic66$) || var143.eql((SubLObject)module0423.$ic25$) || var143.eql((SubLObject)module0423.$ic52$) || var143.eql((SubLObject)module0423.$ic67$) || var143.eql((SubLObject)module0423.$ic68$) || var143.eql((SubLObject)module0423.$ic69$) || var143.eql((SubLObject)module0423.$ic70$)) {
            return (module0423.NIL != var11) ? var11 : module0423.$ic65$;
        }
        return module0231.f15292(var11);
    }
    
    public static SubLObject f29574(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = module0231.f15288(var2);
        if (module0423.NIL != module0212.f13762(var2)) {
            final SubLObject var5 = f29590(var2);
            final SubLObject var6 = conses_high.second(var5);
            if (module0423.NIL != var6) {
                var4 = (SubLObject)ConsesLow.cons(var5, var4);
            }
            if (module0423.NIL != module0018.$g740$.getDynamicValue(var3)) {
                final SubLObject var7 = module0220.f14565(var2, module0423.$ic24$, (SubLObject)module0423.UNPROVIDED, (SubLObject)module0423.UNPROVIDED, (SubLObject)module0423.UNPROVIDED);
                if (module0423.NIL != var7) {
                    var4 = Sequences.delete(module0423.$ic23$, var4, Symbols.symbol_function((SubLObject)module0423.EQL), Symbols.symbol_function((SubLObject)module0423.$ic60$), (SubLObject)module0423.UNPROVIDED, (SubLObject)module0423.UNPROVIDED, (SubLObject)module0423.UNPROVIDED);
                    var4 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0423.$ic23$, module0202.f12787(var7, (SubLObject)module0423.UNPROVIDED)), var4);
                }
            }
        }
        var4 = Sequences.delete(module0423.$ic9$, var4, Symbols.symbol_function((SubLObject)module0423.EQL), Symbols.symbol_function((SubLObject)module0423.$ic60$), (SubLObject)module0423.UNPROVIDED, (SubLObject)module0423.UNPROVIDED, (SubLObject)module0423.UNPROVIDED);
        var4 = Sequences.delete(module0423.$ic13$, var4, Symbols.symbol_function((SubLObject)module0423.EQL), Symbols.symbol_function((SubLObject)module0423.$ic60$), (SubLObject)module0423.UNPROVIDED, (SubLObject)module0423.UNPROVIDED, (SubLObject)module0423.UNPROVIDED);
        return var4;
    }
    
    public static SubLObject f29590(final SubLObject var2) {
        assert module0423.NIL != module0173.f10955(var2) : var2;
        final SubLObject var3 = module0220.f14556(var2, module0423.$ic16$, (SubLObject)module0423.TWO_INTEGER, (SubLObject)module0423.ONE_INTEGER, (SubLObject)module0423.$ic12$);
        return f29591(var3);
    }
    
    public static SubLObject f29591(final SubLObject var11) {
        return (SubLObject)ConsesLow.list(module0423.$ic15$, var11);
    }
    
    public static SubLObject f29592(final SubLObject var151) {
        if (module0423.NIL != constant_handles_oc.f8449(var151)) {
            final SubLObject var152 = module0617.f37871(var151, (SubLObject)module0423.UNPROVIDED);
            if (module0423.NIL != var152) {
                return var152;
            }
        }
        if (module0423.NIL != module0167.f10813(var151) && module0423.$ic72$.eql(module0205.f13276(var151))) {
            return f29592(module0205.f13277(var151, (SubLObject)module0423.UNPROVIDED));
        }
        if (module0423.NIL != module0212.f13762(var151)) {
            return module0226.f15112(var151);
        }
        return (SubLObject)module0423.NIL;
    }
    
    public static SubLObject f29593(final SubLObject var2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0423.NIL == f29594(var2) && module0423.$ic73$ != f29595(var2, (SubLObject)module0423.UNPROVIDED));
    }
    
    public static SubLObject f29594(final SubLObject var2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0423.NIL != module0173.f10955(var2) && module0423.NIL != module0259.f16891(var2, module0423.$ic74$));
    }
    
    public static SubLObject f29595(final SubLObject var2, SubLObject var153) {
        if (var153 == module0423.UNPROVIDED) {
            var153 = (SubLObject)module0423.NIL;
        }
        if (module0423.NIL == var153) {
            var153 = var2;
        }
        if (module0423.NIL != module0426.f30110(var2)) {
            return Values.values((SubLObject)module0423.NIL, (SubLObject)module0423.NIL, (SubLObject)module0423.NIL);
        }
        if (module0423.NIL == module0202.f12589(var2, module0423.$ic75$)) {
            SubLObject var154 = (SubLObject)module0423.NIL;
            SubLObject var155 = (SubLObject)module0423.$ic81$;
            SubLObject var156 = (SubLObject)module0423.NIL;
            final SubLObject var157 = f29568(var2);
            final SubLObject var158 = f29562(var2);
            final SubLObject var159 = Sequences.find_if((SubLObject)module0423.$ic82$, var158, (SubLObject)module0423.UNPROVIDED, (SubLObject)module0423.UNPROVIDED, (SubLObject)module0423.UNPROVIDED);
            if (module0423.NIL == module0035.f1997(var158)) {
                var154 = (SubLObject)module0423.$ic73$;
                if (Sequences.length(var158).numE((SubLObject)module0423.ZERO_INTEGER)) {
                    var155 = Sequences.cconcatenate(var155, PrintLow.format((SubLObject)module0423.NIL, (SubLObject)module0423.$ic77$, var153));
                    var156 = (SubLObject)ConsesLow.cons((SubLObject)module0423.$ic78$, var156);
                }
                else {
                    var155 = Sequences.cconcatenate(var155, PrintLow.format((SubLObject)module0423.NIL, (SubLObject)module0423.$ic83$, var153));
                    var156 = (SubLObject)ConsesLow.cons((SubLObject)module0423.$ic84$, var156);
                }
            }
            if (module0423.NIL == module0035.f1997(var157)) {
                if (Sequences.length(var157).numE((SubLObject)module0423.ZERO_INTEGER)) {
                    if (module0423.NIL == var159) {
                        var154 = (SubLObject)module0423.$ic73$;
                        var155 = Sequences.cconcatenate(var155, PrintLow.format((SubLObject)module0423.NIL, (SubLObject)module0423.$ic85$, var153));
                        var156 = (SubLObject)ConsesLow.cons((SubLObject)module0423.$ic86$, var156);
                    }
                }
                else {
                    var154 = (SubLObject)module0423.$ic73$;
                    var155 = Sequences.cconcatenate(var155, PrintLow.format((SubLObject)module0423.NIL, (SubLObject)module0423.$ic87$, var153));
                    var156 = (SubLObject)ConsesLow.cons((SubLObject)module0423.$ic88$, var156);
                }
            }
            return Values.values(var154, var155, Sequences.nreverse(var156));
        }
        SubLObject var161;
        final SubLObject var160 = var161 = module0205.f13304(var2, (SubLObject)module0423.UNPROVIDED);
        final SubLObject var162 = (SubLObject)(var161.isCons() ? var161.first() : module0423.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var161, var160, (SubLObject)module0423.$ic76$);
        var161 = var161.rest();
        final SubLObject var163 = (SubLObject)(var161.isCons() ? var161.first() : module0423.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var161, var160, (SubLObject)module0423.$ic76$);
        final SubLObject var164;
        var161 = (var164 = var161.rest());
        if (module0423.NIL == var162) {
            return Values.values((SubLObject)module0423.$ic73$, PrintLow.format((SubLObject)module0423.NIL, (SubLObject)module0423.$ic77$, var153), (SubLObject)ConsesLow.list((SubLObject)module0423.$ic78$));
        }
        if (module0423.NIL != var164) {
            return Values.values((SubLObject)module0423.$ic73$, PrintLow.format((SubLObject)module0423.NIL, (SubLObject)module0423.$ic79$, var153), (SubLObject)ConsesLow.list((SubLObject)module0423.$ic80$));
        }
        return Values.values((SubLObject)module0423.NIL, (SubLObject)module0423.NIL, (SubLObject)module0423.NIL);
    }
    
    public static SubLObject f29596(final SubLObject var151) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0423.ZERO_INTEGER.eql(f29578(var151, (SubLObject)module0423.$ic69$)) || module0423.NIL == f29578(var151, (SubLObject)module0423.$ic89$));
    }
    
    public static SubLObject f29597(final SubLObject var151) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0423.NIL != f29578(var151, (SubLObject)module0423.$ic89$) && module0423.NIL == f29596(var151));
    }
    
    public static SubLObject f29598(final SubLObject var151) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0423.NIL != f29596(var151) && module0423.NIL != module0424.f30041(var151) && module0423.$ic90$.eql(f29578(var151, (SubLObject)module0423.$ic66$)) && module0423.NIL == f29578(var151, (SubLObject)module0423.$ic67$) && module0423.NIL == f29578(var151, (SubLObject)module0423.$ic62$) && module0423.NIL == f29578(var151, (SubLObject)module0423.$ic68$));
    }
    
    public static SubLObject f29599(final SubLObject var151) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0423.NIL != f29596(var151) && module0423.NIL == f29598(var151));
    }
    
    public static SubLObject f29600(final SubLObject var151) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0423.NIL != f29597(var151) && module0423.ONE_INTEGER.eql(f29578(var151, (SubLObject)module0423.$ic69$)));
    }
    
    public static SubLObject f29601(final SubLObject var151) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0423.NIL != f29597(var151) && module0423.NIL == f29600(var151));
    }
    
    public static SubLObject f29602(final SubLObject var151) {
        final SubLObject var152 = f29573(var151);
        return module0035.sublisp_boolean(module0408.f28408(var152, (SubLObject)module0423.$ic91$));
    }
    
    public static SubLObject f29603(final SubLObject var2, SubLObject var161) {
        if (var161 == module0423.UNPROVIDED) {
            var161 = (SubLObject)module0423.NIL;
        }
        final SubLThread var162 = SubLProcess.currentSubLThread();
        final SubLObject var163 = var161;
        assert module0423.NIL != module0035.f2327(var163) : var163;
        SubLObject var164;
        SubLObject var165;
        SubLObject var166;
        for (var164 = (SubLObject)module0423.NIL, var164 = var163; module0423.NIL != var164; var164 = conses_high.cddr(var164)) {
            var165 = var164.first();
            var166 = conses_high.cadr(var164);
            assert module0423.NIL != module0360.f23781(var165) : var165;
        }
        var162.resetMultipleValues();
        final SubLObject var167 = f29604(var2);
        final SubLObject var168 = var162.secondMultipleValue();
        SubLObject var169 = var162.thirdMultipleValue();
        var162.resetMultipleValues();
        var169 = module0360.f23788(var169, var161);
        final SubLObject var170 = module0360.f23800(var169);
        return module0409.f28515(var167, var168, var170);
    }
    
    public static SubLObject f29605(final SubLObject var2, final SubLObject var166, SubLObject var161) {
        if (var161 == module0423.UNPROVIDED) {
            var161 = (SubLObject)module0423.NIL;
        }
        final SubLThread var167 = SubLProcess.currentSubLThread();
        final SubLObject var168 = var161;
        assert module0423.NIL != module0035.f2327(var168) : var168;
        SubLObject var169;
        SubLObject var170;
        SubLObject var171;
        for (var169 = (SubLObject)module0423.NIL, var169 = var168; module0423.NIL != var169; var169 = conses_high.cddr(var169)) {
            var170 = var169.first();
            var171 = conses_high.cadr(var169);
            assert module0423.NIL != module0360.f23781(var170) : var170;
        }
        SubLObject var172 = (SubLObject)module0423.NIL;
        SubLObject var173 = (SubLObject)module0423.NIL;
        var167.resetMultipleValues();
        final SubLObject var174 = f29604(var2);
        final SubLObject var175 = var167.secondMultipleValue();
        SubLObject var176 = var167.thirdMultipleValue();
        var167.resetMultipleValues();
        var176 = module0360.f23788(var176, var161);
        var176 = module0035.f2329(var176, Symbols.symbol_function((SubLObject)module0423.$ic93$));
        SubLObject var177 = (SubLObject)module0423.NIL;
        SubLObject var178 = (SubLObject)module0423.NIL;
        SubLObject var179 = (SubLObject)module0423.NIL;
        SubLObject var180 = (SubLObject)module0423.NIL;
        SubLObject var181 = (SubLObject)module0423.NIL;
        final SubLObject var182 = Time.get_internal_real_time();
        var167.resetMultipleValues();
        final SubLObject var174_175 = module0370.f25893(var174, var175, module0360.$g3101$.getGlobalValue());
        final SubLObject var176_177 = var167.secondMultipleValue();
        final SubLObject var178_179 = var167.thirdMultipleValue();
        var167.resetMultipleValues();
        var179 = var174_175;
        var180 = var176_177;
        var181 = var178_179;
        SubLObject var184;
        final SubLObject var183 = var184 = module0232.f15308(var179.first()).first();
        SubLObject var185 = (SubLObject)module0423.NIL;
        SubLObject var186 = (SubLObject)module0423.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var184, var183, (SubLObject)module0423.$ic94$);
        var185 = var184.first();
        var184 = var184.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var184, var183, (SubLObject)module0423.$ic94$);
        var186 = var184.first();
        var184 = var184.rest();
        if (module0423.NIL == var184) {
            final SubLObject var173_184 = Time.get_internal_real_time();
            var172 = module0347.f23334(var186, var185, (SubLObject)module0423.$ic12$, var176);
            var178 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var173_184), time_high.$internal_time_units_per_second$.getGlobalValue());
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var183, (SubLObject)module0423.$ic94$);
        }
        var177 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var182), time_high.$internal_time_units_per_second$.getGlobalValue());
        var173 = f29606(var166, var172, var177, var178);
        return Values.values(var172, var173);
    }
    
    public static SubLObject f29606(final SubLObject var77, final SubLObject var102, final SubLObject var168, final SubLObject var169) {
        SubLObject var170 = conses_high.copy_tree(var77);
        SubLObject var172;
        final SubLObject var171 = var172 = module0035.f2399(var77, Symbols.symbol_function((SubLObject)module0423.$ic95$), (SubLObject)module0423.UNPROVIDED, (SubLObject)module0423.UNPROVIDED, (SubLObject)module0423.UNPROVIDED);
        SubLObject var173 = (SubLObject)module0423.NIL;
        var173 = var172.first();
        while (module0423.NIL != var172) {
            final SubLObject var174 = var173;
            if (var174.eql((SubLObject)module0423.$ic96$)) {
                final SubLObject var175 = Sequences.length(var102);
                var170 = conses_high.nsubst(var175, (SubLObject)module0423.$ic96$, var170, Symbols.symbol_function((SubLObject)module0423.EQ), (SubLObject)module0423.UNPROVIDED);
            }
            else if (var174.eql((SubLObject)module0423.$ic97$)) {
                final SubLObject var176 = (SubLObject)((module0423.NIL != var102) ? var169 : module0423.NIL);
                var170 = conses_high.nsubst(var176, (SubLObject)module0423.$ic97$, var170, Symbols.symbol_function((SubLObject)module0423.EQ), (SubLObject)module0423.UNPROVIDED);
            }
            else if (var174.eql((SubLObject)module0423.$ic98$)) {
                final SubLObject var177 = (SubLObject)((module0423.NIL != var102) ? var169 : module0423.NIL);
                var170 = conses_high.nsubst(var177, (SubLObject)module0423.$ic98$, var170, Symbols.symbol_function((SubLObject)module0423.EQ), (SubLObject)module0423.UNPROVIDED);
            }
            else if (var174.eql((SubLObject)module0423.$ic99$)) {
                var170 = conses_high.nsubst(var169, (SubLObject)module0423.$ic99$, var170, Symbols.symbol_function((SubLObject)module0423.EQ), (SubLObject)module0423.UNPROVIDED);
            }
            else if (var174.eql((SubLObject)module0423.$ic100$)) {
                var170 = conses_high.nsubst(var168, (SubLObject)module0423.$ic100$, var170, Symbols.symbol_function((SubLObject)module0423.EQ), (SubLObject)module0423.UNPROVIDED);
            }
            else if (var174.eql((SubLObject)module0423.$ic101$)) {
                final SubLObject var175 = Sequences.length(var102);
                SubLObject var178 = (SubLObject)module0423.NIL;
                if (var169.isNumber() && module0423.NIL != module0004.f105(var175)) {
                    var178 = Numbers.divide(var169, var175);
                }
                var170 = conses_high.nsubst(var178, (SubLObject)module0423.$ic101$, var170, Symbols.symbol_function((SubLObject)module0423.EQ), (SubLObject)module0423.UNPROVIDED);
            }
            else if (var174.eql((SubLObject)module0423.$ic102$)) {
                final SubLObject var179 = module0035.f2410(var169, var169);
                var170 = conses_high.nsubst(var179, (SubLObject)module0423.$ic102$, var170, Symbols.symbol_function((SubLObject)module0423.EQ), (SubLObject)module0423.UNPROVIDED);
            }
            else {
                Errors.sublisp_break((SubLObject)module0423.$ic103$, new SubLObject[] { var173 });
            }
            var172 = var172.rest();
            var173 = var172.first();
        }
        return var170;
    }
    
    public static SubLObject f29607(final SubLObject var192, final SubLObject var2, SubLObject var161) {
        if (var161 == module0423.UNPROVIDED) {
            var161 = (SubLObject)module0423.NIL;
        }
        final SubLThread var193 = SubLProcess.currentSubLThread();
        final SubLObject var194 = var161;
        assert module0423.NIL != module0035.f2327(var194) : var194;
        SubLObject var195;
        SubLObject var196;
        SubLObject var197;
        for (var195 = (SubLObject)module0423.NIL, var195 = var194; module0423.NIL != var195; var195 = conses_high.cddr(var195)) {
            var196 = var195.first();
            var197 = conses_high.cadr(var195);
            assert module0423.NIL != module0360.f23781(var196) : var196;
        }
        var193.resetMultipleValues();
        final SubLObject var198 = f29604(var2);
        final SubLObject var199 = var193.secondMultipleValue();
        SubLObject var200 = var193.thirdMultipleValue();
        var193.resetMultipleValues();
        var200 = module0360.f23788(var200, var161);
        final SubLObject var201 = module0360.f23805(var200);
        return module0409.f28521(var192, var201);
    }
    
    public static SubLObject f29608(final SubLObject var2, SubLObject var161) {
        if (var161 == module0423.UNPROVIDED) {
            var161 = (SubLObject)module0423.NIL;
        }
        final SubLThread var162 = SubLProcess.currentSubLThread();
        final SubLObject var163 = var161;
        assert module0423.NIL != module0035.f2327(var163) : var163;
        SubLObject var164;
        SubLObject var165;
        SubLObject var166;
        for (var164 = (SubLObject)module0423.NIL, var164 = var163; module0423.NIL != var164; var164 = conses_high.cddr(var164)) {
            var165 = var164.first();
            var166 = conses_high.cadr(var164);
            assert module0423.NIL != module0360.f23781(var165) : var165;
        }
        SubLObject var167 = (SubLObject)module0423.NIL;
        SubLObject var168 = (SubLObject)module0423.NIL;
        SubLObject var169 = (SubLObject)module0423.NIL;
        SubLObject var170 = (SubLObject)module0423.NIL;
        final SubLObject var171 = module0018.$g694$.currentBinding(var162);
        try {
            module0018.$g694$.bind((SubLObject)module0423.NIL, var162);
            if (module0423.NIL != module0426.f30115(var2)) {
                var162.resetMultipleValues();
                final SubLObject var196_197 = module0426.f30162(var2);
                final SubLObject var198_199 = var162.secondMultipleValue();
                final SubLObject var200_201 = var162.thirdMultipleValue();
                final SubLObject var202_203 = var162.fourthMultipleValue();
                var162.resetMultipleValues();
                var167 = var196_197;
                var168 = var198_199;
                var169 = var200_201;
                var170 = var202_203;
            }
            else {
                var162.resetMultipleValues();
                final SubLObject var172 = f29604(var2);
                final SubLObject var173 = var162.secondMultipleValue();
                SubLObject var174 = var162.thirdMultipleValue();
                var162.resetMultipleValues();
                var174 = module0360.f23788(var174, var161);
                var162.resetMultipleValues();
                final SubLObject var204_205 = module0409.f28506(var172, var173, var174);
                final SubLObject var206_207 = var162.secondMultipleValue();
                final SubLObject var208_209 = var162.thirdMultipleValue();
                final SubLObject var210_211 = var162.fourthMultipleValue();
                var162.resetMultipleValues();
                var167 = var204_205;
                var168 = var206_207;
                var169 = var208_209;
                var170 = var210_211;
            }
        }
        finally {
            module0018.$g694$.rebind(var171, var162);
        }
        return Values.values(var167, var168, var169, var170);
    }
    
    public static SubLObject f29609(final SubLObject var2, SubLObject var161) {
        if (var161 == module0423.UNPROVIDED) {
            var161 = (SubLObject)module0423.NIL;
        }
        return f29608(var2, (SubLObject)module0423.UNPROVIDED);
    }
    
    public static SubLObject f29610(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        var3.resetMultipleValues();
        final SubLObject var4 = f29604(var2);
        SubLObject var5 = var3.secondMultipleValue();
        SubLObject var6 = var3.thirdMultipleValue();
        var3.resetMultipleValues();
        if (module0423.NIL == var5) {
            var5 = module0147.f9551();
        }
        var6 = conses_high.putf(var6, (SubLObject)module0423.$ic104$, (SubLObject)module0423.T);
        return module0409.f28506(var4, var5, var6);
    }
    
    public static SubLObject f29604(final SubLObject var2) {
        if (module0423.NIL != module0202.f12589(var2, module0423.$ic75$)) {
            return f29611(var2);
        }
        if (module0423.NIL != module0337.f22630(var2, (SubLObject)module0423.$ic105$)) {
            return f29612(var2);
        }
        if (module0423.NIL == module0426.f30114(var2)) {
            final SubLObject var3 = f29563(var2);
            final SubLObject var4 = f29569(var2);
            final SubLObject var5 = f29573(var2);
            return Values.values(var3, var4, var5);
        }
        SubLObject var7;
        final SubLObject var6 = var7 = module0571.f34994(var2);
        SubLObject var8 = (SubLObject)module0423.NIL;
        SubLObject var9 = (SubLObject)module0423.NIL;
        SubLObject var10 = (SubLObject)module0423.NIL;
        SubLObject var11 = (SubLObject)module0423.NIL;
        SubLObject var12 = (SubLObject)module0423.NIL;
        SubLObject var13 = (SubLObject)module0423.NIL;
        SubLObject var14 = (SubLObject)module0423.NIL;
        SubLObject var15 = (SubLObject)module0423.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0423.$ic106$);
        var8 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0423.$ic106$);
        var9 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0423.$ic106$);
        var10 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0423.$ic106$);
        var11 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0423.$ic106$);
        var12 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0423.$ic106$);
        var13 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0423.$ic106$);
        var14 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0423.$ic106$);
        var15 = var7.first();
        var7 = var7.rest();
        if (module0423.NIL == var7) {
            var12 = module0426.f30166(var12);
            return Values.values(var10, var11, var12);
        }
        cdestructuring_bind.cdestructuring_bind_error(var6, (SubLObject)module0423.$ic106$);
        return (SubLObject)module0423.NIL;
    }
    
    public static SubLObject f29611(final SubLObject var219) {
        SubLObject var221;
        final SubLObject var220 = var221 = module0205.f13304(var219, (SubLObject)module0423.UNPROVIDED);
        final SubLObject var222 = (SubLObject)(var221.isCons() ? var221.first() : module0423.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var221, var220, (SubLObject)module0423.$ic107$);
        var221 = var221.rest();
        final SubLObject var223 = var221.isCons() ? var221.first() : module0423.$ic65$;
        cdestructuring_bind.destructuring_bind_must_listp(var221, var220, (SubLObject)module0423.$ic107$);
        var221 = var221.rest();
        if (module0423.NIL == var221) {
            final SubLObject var224 = module0285.f18933(var222, (SubLObject)module0423.UNPROVIDED);
            SubLObject var225 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0423.$ic108$), module0202.f12684(var223));
            final SubLObject var226 = conses_high.second(conses_high.assoc(module0423.$ic13$, var225, (SubLObject)module0423.UNPROVIDED, (SubLObject)module0423.UNPROVIDED));
            var225 = module0035.f2309(var225, module0423.$ic9$, (SubLObject)module0423.UNPROVIDED);
            var225 = module0035.f2309(var225, module0423.$ic13$, (SubLObject)module0423.UNPROVIDED);
            final SubLObject var227 = f29575(var225);
            return Values.values(var224, var226, var227);
        }
        cdestructuring_bind.cdestructuring_bind_error(var220, (SubLObject)module0423.$ic107$);
        return (SubLObject)module0423.NIL;
    }
    
    public static SubLObject f29612(final SubLObject var223) {
        SubLObject var225;
        final SubLObject var224 = var225 = module0205.f13304(var223, (SubLObject)module0423.UNPROVIDED);
        SubLObject var226 = (SubLObject)module0423.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var225, var224, (SubLObject)module0423.$ic109$);
        var226 = var225.first();
        var225 = var225.rest();
        final SubLObject var227 = var225.isCons() ? var225.first() : module0423.$ic65$;
        cdestructuring_bind.destructuring_bind_must_listp(var225, var224, (SubLObject)module0423.$ic109$);
        var225 = var225.rest();
        if (module0423.NIL == var225) {
            final SubLObject var228 = module0205.f13277(var226, (SubLObject)module0423.UNPROVIDED);
            final SubLObject var229 = module0205.f13368(var226, (SubLObject)module0423.UNPROVIDED);
            SubLObject var230 = Mapping.mapcar(Symbols.symbol_function((SubLObject)module0423.$ic108$), module0202.f12684(var227));
            final SubLObject var231 = conses_high.second(conses_high.assoc(module0423.$ic13$, var230, (SubLObject)module0423.UNPROVIDED, (SubLObject)module0423.UNPROVIDED));
            var230 = module0035.f2309(var230, module0423.$ic9$, (SubLObject)module0423.UNPROVIDED);
            var230 = module0035.f2309(var230, module0423.$ic13$, (SubLObject)module0423.UNPROVIDED);
            final SubLObject var232 = f29575(var230);
            return Values.values(var229, var231, var232);
        }
        cdestructuring_bind.cdestructuring_bind_error(var224, (SubLObject)module0423.$ic109$);
        return (SubLObject)module0423.NIL;
    }
    
    public static SubLObject f29548(final SubLObject var143) {
        assert module0423.NIL != Types.keywordp(var143) : var143;
        return module0231.f15289(var143, module0423.$ic111$);
    }
    
    public static SubLObject f29587(final SubLObject var14) {
        assert module0423.NIL != module0173.f10955(var14) : var14;
        return module0231.f15290(var14);
    }
    
    public static SubLObject f29613(final SubLObject var143) {
        assert module0423.NIL != Types.keywordp(var143) : var143;
        return module0594.f36340(var143, module0423.$ic112$);
    }
    
    public static SubLObject f29614(final SubLObject var228) {
        assert module0423.NIL != constant_handles_oc.f8449(var228) : var228;
        return module0594.f36343(var228);
    }
    
    public static SubLObject f29615(final SubLObject var229) {
        assert module0423.NIL != Types.keywordp(var229) : var229;
        return module0594.f36340(var229, module0423.$ic114$);
    }
    
    public static SubLObject f29616(final SubLObject var230) {
        assert module0423.NIL != module0173.f10955(var230) : var230;
        return module0594.f36343(var230);
    }
    
    public static SubLObject f29588(final SubLObject var11) {
        if (var11.isInteger()) {
            return var11;
        }
        if (module0423.NIL == module0202.f12659(var11)) {
            return (SubLObject)module0423.NIL;
        }
        final SubLObject var12 = module0205.f13365(var11);
        final SubLObject var13 = module0205.f13277(var11, (SubLObject)module0423.UNPROVIDED);
        SubLObject var14 = (SubLObject)module0423.NIL;
        if (var12.eql(module0423.$ic115$)) {
            return var13;
        }
        if (module0423.NIL != module0610.f37203(module0423.$ic115$, var12)) {
            var14 = module0610.f37206(module0423.$ic115$, var12, var13, (SubLObject)module0423.UNPROVIDED);
        }
        if (module0423.NIL == var14) {
            Errors.error((SubLObject)module0423.$ic116$, var12);
        }
        return var14;
    }
    
    public static SubLObject f29589(final SubLObject var234) {
        assert module0423.NIL != Types.integerp(var234) : var234;
        return module0202.f12720(module0423.$ic115$, (SubLObject)ConsesLow.list(var234), (SubLObject)module0423.UNPROVIDED);
    }
    
    public static SubLObject f29617() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29532", "S#32663", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29533", "S#32664", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29539", "S#32665", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29545", "S#32666", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29540", "S#32667", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29534", "S#32668", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29546", "S#32669", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29547", "S#32670", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29542", "S#32671", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29536", "S#32672", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29543", "S#32673", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29537", "S#32674", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29550", "S#32675", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29541", "S#32676", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29535", "S#32677", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29544", "S#32678", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29538", "S#32679", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29552", "S#32680", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29553", "S#32681", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29554", "S#32682", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29558", "S#32683", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29559", "S#32684", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29556", "S#32685", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29560", "S#32686", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29557", "S#32687", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29562", "S#32688", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29563", "S#28959", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29564", "S#32689", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29565", "S#32690", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29566", "S#32691", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29568", "S#32692", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29569", "S#28960", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29570", "S#32693", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29571", "S#32694", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29572", "S#32695", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29555", "S#32696", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29561", "S#32697", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29573", "KBQ-QUERY-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29576", "S#32698", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29577", "S#32699", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29578", "S#32700", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29579", "S#32701", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29580", "S#32702", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29581", "S#32703", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29582", "S#32704", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29583", "S#32705", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29551", "S#32706", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29585", "S#32707", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29584", "S#32708", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29586", "S#32709", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29575", "S#32710", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29567", "S#32711", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29549", "S#32712", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29574", "S#32713", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29590", "S#32714", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29591", "S#32715", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29592", "S#32716", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29593", "S#32717", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29594", "S#32718", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29595", "S#32719", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29596", "S#32720", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29597", "S#32721", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29598", "S#32722", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29599", "S#32723", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29600", "S#32724", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29601", "S#32725", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29602", "S#32726", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29603", "S#32727", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29605", "S#32728", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29606", "S#32729", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29607", "S#32730", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29608", "S#32731", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29609", "S#32732", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29610", "S#32733", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29604", "S#32734", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29611", "S#32735", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29612", "S#32736", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29548", "S#32737", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29587", "S#32738", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29613", "S#32739", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29614", "S#32740", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29615", "S#32741", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29616", "S#32742", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29588", "S#32743", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0423", "f29589", "S#32744", 1, 0, false);
        return (SubLObject)module0423.NIL;
    }
    
    public static SubLObject f29618() {
        module0423.$g3440$ = SubLFiles.defparameter("S#32745", (SubLObject)module0423.NIL);
        return (SubLObject)module0423.NIL;
    }
    
    public static SubLObject f29619() {
        module0002.f38((SubLObject)module0423.$ic51$);
        return (SubLObject)module0423.NIL;
    }
    
    public void declareFunctions() {
        f29617();
    }
    
    public void initializeVariables() {
        f29618();
    }
    
    public void runTopLevelForms() {
        f29619();
    }
    
    static {
        me = (SubLFile)new module0423();
        module0423.$g3440$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CycLQuerySpecification"));
        $ic1$ = SubLObjectFactory.makeSymbol("CYCL-SENTENCE-P");
        $ic2$ = SubLObjectFactory.makeSymbol("S#12264", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("S#26487", "CYC");
        $ic4$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic5$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("MultipleChoiceQuerySpecification")));
        $ic6$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CycLQuerySpecification")));
        $ic7$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic8$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic9$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("InferenceSentenceParameter"));
        $ic10$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("sentenceParameterValueInSpecification"));
        $ic11$ = SubLObjectFactory.makeKeyword("GAF");
        $ic12$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic13$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("InferenceMicrotheoryParameter"));
        $ic14$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("microtheoryParameterValueInSpecification"));
        $ic15$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("InferenceModeParameter"));
        $ic16$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("inferenceModeParameterValueInSpecification"));
        $ic17$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("softwareParameterValueInSpecification"));
        $ic18$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ist-Asserted"));
        $ic19$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $ic20$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Quote"));
        $ic21$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EscapeQuote"));
        $ic22$ = SubLObjectFactory.makeString("Inference Parameter ~S unknown by the KB.");
        $ic23$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("InferenceAllowedRulesParameter"));
        $ic24$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("queryPracticeRules"));
        $ic25$ = SubLObjectFactory.makeKeyword("NON-EXPLANATORY-SENTENCE");
        $ic26$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#32746", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#32747", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#32748", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5858", "CYC"));
        $ic27$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic28$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic29$ = SubLObjectFactory.makeSymbol("S#18096", "CYC");
        $ic30$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("MCQuestionNthOptionFn"));
        $ic31$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("multipleChoiceOptionFullLabel"));
        $ic32$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("multipleChoiceOptionIndexLabel"));
        $ic33$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("multipleChoiceOptionPayload"));
        $ic34$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("comment"));
        $ic35$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMMENT"));
        $ic36$ = SubLObjectFactory.makeString("The template, ~A, passed for the query spec, ~A, is not the one known in the KB (~A).");
        $ic37$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TemplateFromTestQueryFn"));
        $ic38$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#32749", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"));
        $ic39$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("formulaTemplateGloss"));
        $ic40$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("folderContainsResource"));
        $ic41$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("QueryFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#32750", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $ic42$ = SubLObjectFactory.makeSymbol("S#32750", "CYC");
        $ic43$ = SubLObjectFactory.makeString("The query specification, ~A, has no #$InferenceSentenceParameter.");
        $ic44$ = SubLObjectFactory.makeString("The query specification, ~A, has more than one #$InferenceSentenceParameter.");
        $ic45$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("InferenceNonExplanatorySentenceParameter"));
        $ic46$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("QueryFn")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Quote")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ist")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $ic47$ = SubLObjectFactory.makeSymbol("S#11445", "CYC");
        $ic48$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $ic49$ = SubLObjectFactory.makeString("The query specification, ~A, has more than one #$InferenceMicrotheoryParameter.");
        $ic50$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("querySpecificationForFormulaTemplate"));
        $ic51$ = SubLObjectFactory.makeSymbol("KBQ-QUERY-PROPERTIES");
        $ic52$ = SubLObjectFactory.makeKeyword("ALLOWED-RULES");
        $ic53$ = SubLObjectFactory.makeSymbol("QUERY-PROPERTY-P");
        $ic54$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TestVocabularyMt"));
        $ic55$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("MultipleChoiceKBContentTest"));
        $ic56$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("MultipleChoiceQuerySpecification"));
        $ic57$ = SubLObjectFactory.makeSymbol("S#32663", "CYC");
        $ic58$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("mcQuestionNthOption"));
        $ic59$ = SubLObjectFactory.makeSymbol("S#3700", "CYC");
        $ic60$ = SubLObjectFactory.makeSymbol("FIRST");
        $ic61$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#723", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#32751", "CYC"));
        $ic62$ = SubLObjectFactory.makeKeyword("MAX-TIME");
        $ic63$ = SubLObjectFactory.makeKeyword("FORWARD-MAX-TIME");
        $ic64$ = SubLObjectFactory.makeKeyword("IGNORE");
        $ic65$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheEmptySet"));
        $ic66$ = SubLObjectFactory.makeKeyword("RESULT-UNIQUENESS");
        $ic67$ = SubLObjectFactory.makeKeyword("MAX-NUMBER");
        $ic68$ = SubLObjectFactory.makeKeyword("MAX-PROOF-DEPTH");
        $ic69$ = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $ic70$ = SubLObjectFactory.makeKeyword("METRICS");
        $ic71$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic72$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TestQueryFn"));
        $ic73$ = SubLObjectFactory.makeKeyword("SEVERE");
        $ic74$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("UnrunnableQuery"));
        $ic75$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("QueryFn"));
        $ic76$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#14349", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#32752", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("REST"));
        $ic77$ = SubLObjectFactory.makeString("~%~A has no query sentence.");
        $ic78$ = SubLObjectFactory.makeKeyword("NO-QUERY-SENTENCE");
        $ic79$ = SubLObjectFactory.makeString("~%~A has too many arguments.");
        $ic80$ = SubLObjectFactory.makeKeyword("TOO-MANY-ARGUMENTS");
        $ic81$ = SubLObjectFactory.makeString("");
        $ic82$ = SubLObjectFactory.makeSymbol("S#15780", "CYC");
        $ic83$ = SubLObjectFactory.makeString("~%~A has more than one query sentence.");
        $ic84$ = SubLObjectFactory.makeKeyword("MORE-THAN-ONE-QUERY-SENTENCE");
        $ic85$ = SubLObjectFactory.makeString("~%~A has no query Mt.");
        $ic86$ = SubLObjectFactory.makeKeyword("NO-QUERY-MT");
        $ic87$ = SubLObjectFactory.makeString("~%~A has more than one query Mt.");
        $ic88$ = SubLObjectFactory.makeKeyword("MORE-THAN-ONE-QUERY-MT");
        $ic89$ = SubLObjectFactory.makeKeyword("TRANSFORMATION-ALLOWED?");
        $ic90$ = SubLObjectFactory.makeKeyword("BINDINGS");
        $ic91$ = SubLObjectFactory.makeKeyword("CONDITIONAL-SENTENCE?");
        $ic92$ = SubLObjectFactory.makeSymbol("S#748", "CYC");
        $ic93$ = SubLObjectFactory.makeSymbol("S#26012", "CYC");
        $ic94$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#28817", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#31680", "CYC"));
        $ic95$ = SubLObjectFactory.makeSymbol("S#26502", "CYC");
        $ic96$ = SubLObjectFactory.makeKeyword("ANSWER-COUNT");
        $ic97$ = SubLObjectFactory.makeKeyword("TIME-TO-FIRST-ANSWER");
        $ic98$ = SubLObjectFactory.makeKeyword("TIME-TO-LAST-ANSWER");
        $ic99$ = SubLObjectFactory.makeKeyword("TOTAL-TIME");
        $ic100$ = SubLObjectFactory.makeKeyword("COMPLETE-TOTAL-TIME");
        $ic101$ = SubLObjectFactory.makeKeyword("TIME-PER-ANSWER");
        $ic102$ = SubLObjectFactory.makeKeyword("LATENCY-IMPROVEMENT-FROM-ITERATIVITY");
        $ic103$ = SubLObjectFactory.makeString("time to implement metric ~S");
        $ic104$ = SubLObjectFactory.makeKeyword("CACHE-INFERENCE-RESULTS?");
        $ic105$ = ConsesLow.listS(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("PredicateQueryFn")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Kappa")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $ic106$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#32753", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("S#14349", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#32187", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#32375", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#32377", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#150", "CYC"));
        $ic107$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#32750", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#32754", "CYC"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheEmptySet"))));
        $ic108$ = SubLObjectFactory.makeSymbol("S#15664", "CYC");
        $ic109$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#32755", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#32754", "CYC"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheEmptySet"))));
        $ic110$ = SubLObjectFactory.makeSymbol("KEYWORDP");
        $ic111$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("InferenceParameter"));
        $ic112$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CycHLSupportModule"));
        $ic113$ = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $ic114$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CycHLTruthValue"));
        $ic115$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SecondsDuration"));
        $ic116$ = SubLObjectFactory.makeString("Unit ~A can't be converted to seconds.");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0423.class
	Total time: 896 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/