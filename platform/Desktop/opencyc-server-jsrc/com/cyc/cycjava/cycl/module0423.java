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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        return (SubLObject)makeBoolean(NIL != module0259.f16891(var1, $ic0$) || NIL != module0426.f30110(var1));
    }
    
    public static SubLObject f29533(final SubLObject var2, final SubLObject var3, final SubLObject var4, final SubLObject var5, final SubLObject var6, final SubLObject var7, final SubLObject var8) {
        assert NIL != module0206.f13425(var3) : var3;
        if (NIL != var7 && !areAssertionsDisabledFor(me) && NIL == module0206.f13425(var7)) {
            throw new AssertionError(var7);
        }
        assert NIL != module0161.f10479(var4) : var4;
        assert NIL != module0360.f23784(var5) : var5;
        assert NIL != module0161.f10479(var6) : var6;
        if (NIL != module0686.f42138(var8)) {
            module0543.f33631((SubLObject)ConsesLow.listS($ic4$, var2, (SubLObject)$ic5$), module0132.$g1555$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else {
            module0543.f33631((SubLObject)ConsesLow.listS($ic4$, var2, (SubLObject)$ic6$), module0132.$g1555$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        f29534(var2, var3, var6);
        if (NIL != var7) {
            f29535(var2, var7, var6);
        }
        f29536(var2, var4, var6);
        SubLObject var9;
        SubLObject var10;
        SubLObject var11;
        for (var9 = (SubLObject)NIL, var9 = module0412.f28670(var5); NIL != var9; var9 = conses_high.cddr(var9)) {
            var10 = var9.first();
            var11 = conses_high.cadr(var9);
            f29537(var2, var10, var11, var6);
        }
        SubLObject var12 = var8;
        SubLObject var13 = (SubLObject)NIL;
        var13 = var12.first();
        while (NIL != var12) {
            f29538(var2, var13, var6);
            var12 = var12.rest();
            var13 = var12.first();
        }
        return var2;
    }
    
    public static SubLObject f29539(final SubLObject var2, final SubLObject var3, final SubLObject var4, final SubLObject var5, final SubLObject var6, final SubLObject var7, final SubLObject var8) {
        assert NIL != module0206.f13425(var3) : var3;
        if (NIL != var7 && !areAssertionsDisabledFor(me) && NIL == module0206.f13425(var7)) {
            throw new AssertionError(var7);
        }
        assert NIL != module0161.f10479(var4) : var4;
        assert NIL != module0360.f23784(var5) : var5;
        assert NIL != module0161.f10479(var6) : var6;
        if (NIL != module0686.f42138(var8)) {
            module0543.f33631((SubLObject)ConsesLow.listS($ic4$, var2, (SubLObject)$ic5$), module0132.$g1555$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else {
            module0543.f33631((SubLObject)ConsesLow.listS($ic4$, var2, (SubLObject)$ic6$), module0132.$g1555$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        f29540(var2, var3, var6);
        f29541(var2, var7, var6);
        f29542(var2, var4, var6);
        SubLObject var9;
        SubLObject var10;
        SubLObject var11;
        for (var9 = (SubLObject)NIL, var9 = var5; NIL != var9; var9 = conses_high.cddr(var9)) {
            var10 = var9.first();
            var11 = conses_high.cadr(var9);
            f29543(var2, var10, var11, var6);
        }
        SubLObject var12 = var8;
        SubLObject var13 = (SubLObject)NIL;
        var13 = var12.first();
        while (NIL != var12) {
            f29544(var2, var13, var6);
            var12 = var12.rest();
            var13 = var12.first();
        }
        return var2;
    }
    
    public static SubLObject f29545(final SubLObject var2, final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        SubLObject var16 = (SubLObject)NIL;
        final SubLObject var17 = module0147.$g2094$.currentBinding(var15);
        final SubLObject var18 = module0147.$g2095$.currentBinding(var15);
        try {
            module0147.$g2094$.bind((SubLObject)$ic7$, var15);
            module0147.$g2095$.bind($ic8$, var15);
            if ($ic9$.eql(var14)) {
                final SubLObject var19 = $ic10$;
                if (NIL != module0158.f10010(var2, (SubLObject)TWO_INTEGER, var19)) {
                    final SubLObject var20 = module0158.f10011(var2, (SubLObject)TWO_INTEGER, var19);
                    SubLObject var21 = (SubLObject)NIL;
                    final SubLObject var22 = (SubLObject)NIL;
                    while (NIL == var21) {
                        final SubLObject var23 = module0052.f3695(var20, var22);
                        final SubLObject var24 = (SubLObject)makeBoolean(!var22.eql(var23));
                        if (NIL != var24) {
                            SubLObject var25 = (SubLObject)NIL;
                            try {
                                var25 = module0158.f10316(var23, (SubLObject)$ic11$, (SubLObject)$ic12$, (SubLObject)NIL);
                                SubLObject var21_26 = (SubLObject)NIL;
                                final SubLObject var22_27 = (SubLObject)NIL;
                                while (NIL == var21_26) {
                                    final SubLObject var26 = module0052.f3695(var25, var22_27);
                                    final SubLObject var24_29 = (SubLObject)makeBoolean(!var22_27.eql(var26));
                                    if (NIL != var24_29) {
                                        var16 = (SubLObject)ConsesLow.cons(var26, var16);
                                    }
                                    var21_26 = (SubLObject)makeBoolean(NIL == var24_29);
                                }
                            }
                            finally {
                                final SubLObject var17_30 = Threads.$is_thread_performing_cleanupP$.currentBinding(var15);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var15);
                                    if (NIL != var25) {
                                        module0158.f10319(var25);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var17_30, var15);
                                }
                            }
                        }
                        var21 = (SubLObject)makeBoolean(NIL == var24);
                    }
                }
            }
            else if ($ic13$.eql(var14)) {
                final SubLObject var19 = $ic14$;
                if (NIL != module0158.f10010(var2, (SubLObject)TWO_INTEGER, var19)) {
                    final SubLObject var20 = module0158.f10011(var2, (SubLObject)TWO_INTEGER, var19);
                    SubLObject var21 = (SubLObject)NIL;
                    final SubLObject var22 = (SubLObject)NIL;
                    while (NIL == var21) {
                        final SubLObject var23 = module0052.f3695(var20, var22);
                        final SubLObject var24 = (SubLObject)makeBoolean(!var22.eql(var23));
                        if (NIL != var24) {
                            SubLObject var25 = (SubLObject)NIL;
                            try {
                                var25 = module0158.f10316(var23, (SubLObject)$ic11$, (SubLObject)$ic12$, (SubLObject)NIL);
                                SubLObject var21_27 = (SubLObject)NIL;
                                final SubLObject var22_28 = (SubLObject)NIL;
                                while (NIL == var21_27) {
                                    final SubLObject var26 = module0052.f3695(var25, var22_28);
                                    final SubLObject var24_30 = (SubLObject)makeBoolean(!var22_28.eql(var26));
                                    if (NIL != var24_30) {
                                        var16 = (SubLObject)ConsesLow.cons(var26, var16);
                                    }
                                    var21_27 = (SubLObject)makeBoolean(NIL == var24_30);
                                }
                            }
                            finally {
                                final SubLObject var17_31 = Threads.$is_thread_performing_cleanupP$.currentBinding(var15);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var15);
                                    if (NIL != var25) {
                                        module0158.f10319(var25);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var17_31, var15);
                                }
                            }
                        }
                        var21 = (SubLObject)makeBoolean(NIL == var24);
                    }
                }
            }
            else if ($ic15$.eql(var14)) {
                final SubLObject var19 = $ic16$;
                if (NIL != module0158.f10010(var2, (SubLObject)TWO_INTEGER, var19)) {
                    final SubLObject var20 = module0158.f10011(var2, (SubLObject)TWO_INTEGER, var19);
                    SubLObject var21 = (SubLObject)NIL;
                    final SubLObject var22 = (SubLObject)NIL;
                    while (NIL == var21) {
                        final SubLObject var23 = module0052.f3695(var20, var22);
                        final SubLObject var24 = (SubLObject)makeBoolean(!var22.eql(var23));
                        if (NIL != var24) {
                            SubLObject var25 = (SubLObject)NIL;
                            try {
                                var25 = module0158.f10316(var23, (SubLObject)$ic11$, (SubLObject)$ic12$, (SubLObject)NIL);
                                SubLObject var21_28 = (SubLObject)NIL;
                                final SubLObject var22_29 = (SubLObject)NIL;
                                while (NIL == var21_28) {
                                    final SubLObject var26 = module0052.f3695(var25, var22_29);
                                    final SubLObject var24_31 = (SubLObject)makeBoolean(!var22_29.eql(var26));
                                    if (NIL != var24_31) {
                                        var16 = (SubLObject)ConsesLow.cons(var26, var16);
                                    }
                                    var21_28 = (SubLObject)makeBoolean(NIL == var24_31);
                                }
                            }
                            finally {
                                final SubLObject var17_32 = Threads.$is_thread_performing_cleanupP$.currentBinding(var15);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var15);
                                    if (NIL != var25) {
                                        module0158.f10319(var25);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var17_32, var15);
                                }
                            }
                        }
                        var21 = (SubLObject)makeBoolean(NIL == var24);
                    }
                }
            }
            else {
                final SubLObject var19 = $ic17$;
                if (NIL != module0158.f10010(var2, (SubLObject)THREE_INTEGER, var19)) {
                    final SubLObject var20 = module0158.f10011(var2, (SubLObject)THREE_INTEGER, var19);
                    SubLObject var21 = (SubLObject)NIL;
                    final SubLObject var22 = (SubLObject)NIL;
                    while (NIL == var21) {
                        final SubLObject var23 = module0052.f3695(var20, var22);
                        final SubLObject var24 = (SubLObject)makeBoolean(!var22.eql(var23));
                        if (NIL != var24) {
                            SubLObject var25 = (SubLObject)NIL;
                            try {
                                var25 = module0158.f10316(var23, (SubLObject)$ic11$, (SubLObject)$ic12$, (SubLObject)NIL);
                                SubLObject var21_29 = (SubLObject)NIL;
                                final SubLObject var22_30 = (SubLObject)NIL;
                                while (NIL == var21_29) {
                                    final SubLObject var27 = module0052.f3695(var25, var22_30);
                                    final SubLObject var24_32 = (SubLObject)makeBoolean(!var22_30.eql(var27));
                                    if (NIL != var24_32 && module0178.f11334(var27).eql(var14)) {
                                        var16 = (SubLObject)ConsesLow.cons(var27, var16);
                                    }
                                    var21_29 = (SubLObject)makeBoolean(NIL == var24_32);
                                }
                            }
                            finally {
                                final SubLObject var17_33 = Threads.$is_thread_performing_cleanupP$.currentBinding(var15);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var15);
                                    if (NIL != var25) {
                                        module0158.f10319(var25);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var17_33, var15);
                                }
                            }
                        }
                        var21 = (SubLObject)makeBoolean(NIL == var24);
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
        final SubLObject var7 = var8 = f29545(var2, $ic9$);
        SubLObject var9 = (SubLObject)NIL;
        var9 = var8.first();
        while (NIL != var8) {
            if (!module0178.f11287(var9).eql(var6) || !module0178.f11335(var9).equal(var3)) {
                module0543.f33630(var9);
            }
            var8 = var8.rest();
            var9 = var8.first();
        }
        if (NIL == module0410.f28544((SubLObject)ConsesLow.list($ic18$, var6, f29546(var3, var2)), $ic19$, (SubLObject)UNPROVIDED)) {
            f29534(var2, var3, var6);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29534(final SubLObject var2, final SubLObject var3, final SubLObject var6) {
        return module0543.f33631(f29546(var3, var2), var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29546(final SubLObject var3, final SubLObject var2) {
        return (SubLObject)ConsesLow.list($ic10$, (SubLObject)ConsesLow.list($ic20$, var3), var2);
    }
    
    public static SubLObject f29547(final SubLObject var46, final SubLObject var2, SubLObject var47) {
        if (var47 == UNPROVIDED) {
            var47 = (SubLObject)NIL;
        }
        SubLObject var48 = (SubLObject)NIL;
        if (NIL != var47) {
            var48 = (SubLObject)ConsesLow.list($ic20$, var46);
        }
        else {
            var48 = (SubLObject)ConsesLow.list($ic20$, (SubLObject)ConsesLow.list($ic21$, var46));
        }
        return (SubLObject)ConsesLow.list($ic10$, var48, var2);
    }
    
    public static SubLObject f29542(final SubLObject var2, final SubLObject var4, final SubLObject var6) {
        final SubLObject var7 = f29545(var2, $ic13$);
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var7;
        SubLObject var10 = (SubLObject)NIL;
        var10 = var9.first();
        while (NIL != var9) {
            if (module0178.f11287(var10).eql(var6) && module0178.f11335(var10).equal(var4)) {
                var8 = (SubLObject)T;
            }
            else {
                module0543.f33630(var10);
            }
            var9 = var9.rest();
            var10 = var9.first();
        }
        if (NIL == var8) {
            f29536(var2, var4, var6);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29536(final SubLObject var2, final SubLObject var4, final SubLObject var6) {
        return module0543.f33631((SubLObject)ConsesLow.list($ic14$, var4, var2), var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29543(final SubLObject var2, final SubLObject var52, final SubLObject var11, final SubLObject var6) {
        final SubLObject var53 = f29548(var52);
        final SubLObject var54 = f29545(var2, var53);
        SubLObject var55 = (SubLObject)NIL;
        final SubLObject var56 = f29549(var11, var52);
        SubLObject var57 = var54;
        SubLObject var58 = (SubLObject)NIL;
        var58 = var57.first();
        while (NIL != var57) {
            if (module0178.f11287(var58).eql(var6) && module0178.f11335(var58).equal(var56)) {
                var55 = (SubLObject)T;
            }
            else {
                module0543.f33630(var58);
            }
            var57 = var57.rest();
            var58 = var57.first();
        }
        if (NIL == var55) {
            f29537(var2, var52, var11, var6);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29537(final SubLObject var2, final SubLObject var52, final SubLObject var11, final SubLObject var6) {
        final SubLObject var53 = f29548(var52);
        final SubLObject var54 = f29549(var11, var52);
        if (NIL != module0173.f10955(var53)) {
            return f29550(var2, var53, var54, var6);
        }
        Errors.warn((SubLObject)$ic22$, var52);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29550(final SubLObject var2, final SubLObject var53, final SubLObject var11, final SubLObject var6) {
        if ($ic15$.eql(var53)) {
            return module0543.f33631((SubLObject)ConsesLow.list($ic16$, var11, var2), var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if ($ic23$.eql(var53) && var11.isList()) {
            SubLObject var54 = var11;
            SubLObject var55 = (SubLObject)NIL;
            var55 = var54.first();
            while (NIL != var54) {
                module0543.f33631((SubLObject)ConsesLow.list($ic24$, var2, var55), var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var54 = var54.rest();
                var55 = var54.first();
            }
            return (SubLObject)NIL;
        }
        return module0543.f33631((SubLObject)ConsesLow.list($ic17$, var53, var11, var2), var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29541(final SubLObject var2, final SubLObject var7, final SubLObject var6) {
        return f29543(var2, (SubLObject)$ic25$, (SubLObject)ConsesLow.list($ic20$, var7), var6);
    }
    
    public static SubLObject f29535(final SubLObject var2, final SubLObject var7, final SubLObject var6) {
        return f29537(var2, (SubLObject)$ic25$, (SubLObject)ConsesLow.list($ic20$, var7), var6);
    }
    
    public static SubLObject f29544(final SubLObject var2, final SubLObject var13, final SubLObject var6) {
        if (NIL == module0035.f2171(var13, f29551(var2))) {
            SubLObject var14 = (SubLObject)NIL;
            SubLObject var15 = (SubLObject)NIL;
            SubLObject var16 = (SubLObject)NIL;
            SubLObject var17 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var13, var13, (SubLObject)$ic26$);
            var14 = var13.first();
            SubLObject var18 = var13.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var18, var13, (SubLObject)$ic26$);
            var15 = var18.first();
            var18 = var18.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var18, var13, (SubLObject)$ic26$);
            var16 = var18.first();
            var18 = var18.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var18, var13, (SubLObject)$ic26$);
            var17 = var18.first();
            var18 = var18.rest();
            if (NIL == var18) {
                if (NIL != var17) {
                    assert NIL != Types.integerp(var14) : var14;
                    assert NIL != Types.stringp(var15) : var15;
                    assert NIL != Types.stringp(var16) : var16;
                    assert NIL != module0233.f15360(var17) : var17;
                    final SubLObject var19 = module0172.f10921((SubLObject)ConsesLow.list($ic30$, var2, var14));
                    if (NIL != var19) {
                        module0543.f33626(var19);
                    }
                    if (NIL == module0038.f2608(var15)) {
                        module0543.f33631((SubLObject)ConsesLow.list($ic31$, (SubLObject)ConsesLow.list($ic30$, var2, var14), var15), var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    if (NIL == module0038.f2608(var16)) {
                        module0543.f33631((SubLObject)ConsesLow.list($ic32$, (SubLObject)ConsesLow.list($ic30$, var2, var14), var16), var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    module0543.f33631((SubLObject)ConsesLow.list($ic33$, (SubLObject)ConsesLow.list($ic30$, var2, var14), var17), var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)$ic26$);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29538(final SubLObject var2, final SubLObject var13, final SubLObject var6) {
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var17 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var13, var13, (SubLObject)$ic26$);
        var14 = var13.first();
        SubLObject var18 = var13.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var18, var13, (SubLObject)$ic26$);
        var15 = var18.first();
        var18 = var18.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var18, var13, (SubLObject)$ic26$);
        var16 = var18.first();
        var18 = var18.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var18, var13, (SubLObject)$ic26$);
        var17 = var18.first();
        var18 = var18.rest();
        if (NIL == var18) {
            if (NIL != var17) {
                assert NIL != Types.integerp(var14) : var14;
                assert NIL != Types.stringp(var15) : var15;
                assert NIL != Types.stringp(var16) : var16;
                assert NIL != module0233.f15360(var17) : var17;
                if (NIL == module0038.f2608(var15)) {
                    module0543.f33631((SubLObject)ConsesLow.list($ic31$, (SubLObject)ConsesLow.list($ic30$, var2, var14), var15), var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                if (NIL == module0038.f2608(var16)) {
                    module0543.f33631((SubLObject)ConsesLow.list($ic32$, (SubLObject)ConsesLow.list($ic30$, var2, var14), var16), var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                module0543.f33631((SubLObject)ConsesLow.list($ic33$, (SubLObject)ConsesLow.list($ic30$, var2, var14), var17), var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)$ic26$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29552(final SubLObject var2, final SubLObject var68, final SubLObject var6) {
        final SubLThread var69 = SubLProcess.currentSubLThread();
        SubLObject var70 = (SubLObject)NIL;
        final SubLObject var71 = module0147.$g2094$.currentBinding(var69);
        final SubLObject var72 = module0147.$g2095$.currentBinding(var69);
        try {
            module0147.$g2094$.bind((SubLObject)$ic7$, var69);
            module0147.$g2095$.bind($ic8$, var69);
            final SubLObject var73 = $ic34$;
            if (NIL != module0158.f10010(var2, (SubLObject)ONE_INTEGER, var73)) {
                final SubLObject var74 = module0158.f10011(var2, (SubLObject)ONE_INTEGER, var73);
                SubLObject var75 = (SubLObject)NIL;
                final SubLObject var76 = (SubLObject)NIL;
                while (NIL == var75) {
                    final SubLObject var77 = module0052.f3695(var74, var76);
                    final SubLObject var78 = (SubLObject)makeBoolean(!var76.eql(var77));
                    if (NIL != var78) {
                        SubLObject var79 = (SubLObject)NIL;
                        try {
                            var79 = module0158.f10316(var77, (SubLObject)$ic11$, (SubLObject)$ic12$, (SubLObject)NIL);
                            SubLObject var21_70 = (SubLObject)NIL;
                            final SubLObject var22_71 = (SubLObject)NIL;
                            while (NIL == var21_70) {
                                final SubLObject var80 = module0052.f3695(var79, var22_71);
                                final SubLObject var24_72 = (SubLObject)makeBoolean(!var22_71.eql(var80));
                                if (NIL != var24_72) {
                                    var70 = (SubLObject)ConsesLow.cons(var80, var70);
                                }
                                var21_70 = (SubLObject)makeBoolean(NIL == var24_72);
                            }
                        }
                        finally {
                            final SubLObject var17_73 = Threads.$is_thread_performing_cleanupP$.currentBinding(var69);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var69);
                                if (NIL != var79) {
                                    module0158.f10319(var79);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var17_73, var69);
                            }
                        }
                    }
                    var75 = (SubLObject)makeBoolean(NIL == var78);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var72, var69);
            module0147.$g2094$.rebind(var71, var69);
        }
        SubLObject var81 = var70;
        SubLObject var82 = (SubLObject)NIL;
        var82 = var81.first();
        while (NIL != var81) {
            final SubLObject var83 = module0178.f11335(var82);
            final SubLObject var84 = module0178.f11287(var82);
            if (!var84.eql(var6) || NIL == conses_high.member(var83, var68, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
                module0543.f33630(var82);
            }
            var81 = var81.rest();
            var82 = var81.first();
        }
        SubLObject var85 = var68;
        SubLObject var86 = (SubLObject)NIL;
        var86 = var85.first();
        while (NIL != var85) {
            if (NIL == module0220.f14584((SubLObject)ConsesLow.listS($ic34$, var2, (SubLObject)$ic35$), var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                f29553(var2, var86, var6);
            }
            var85 = var85.rest();
            var86 = var85.first();
        }
        return var2;
    }
    
    public static SubLObject f29553(final SubLObject var2, final SubLObject var76, final SubLObject var6) {
        return module0543.f33631((SubLObject)ConsesLow.list($ic34$, var2, var76), var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29554(final SubLObject var2, SubLObject var77, final SubLObject var78, final SubLObject var79, final SubLObject var6) {
        final SubLObject var80 = f29555(var2);
        if (NIL != var80 && NIL != var77 && !var80.eql(var77)) {
            Errors.error((SubLObject)$ic36$, var77, var2, var80);
        }
        if (NIL != var80) {
            var77 = var80;
        }
        if (NIL == var77) {
            var77 = module0202.f12683($ic37$, (SubLObject)ConsesLow.list(var2), (SubLObject)UNPROVIDED);
        }
        SubLObject var81 = var78;
        SubLObject var82 = (SubLObject)NIL;
        var82 = var81.first();
        while (NIL != var81) {
            f29556(var77, var82, var6);
            var81 = var81.rest();
            var82 = var81.first();
        }
        var81 = var79;
        SubLObject var83 = (SubLObject)NIL;
        var83 = var81.first();
        while (NIL != var81) {
            SubLObject var85;
            final SubLObject var84 = var85 = var83;
            SubLObject var86 = (SubLObject)NIL;
            SubLObject var87 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)$ic38$);
            var86 = var85.first();
            var85 = var85.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var85, var84, (SubLObject)$ic38$);
            var87 = var85.first();
            var85 = var85.rest();
            if (NIL == var85) {
                f29557(var77, var86, var87);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var84, (SubLObject)$ic38$);
            }
            var81 = var81.rest();
            var83 = var81.first();
        }
        return var77;
    }
    
    public static SubLObject f29558(final SubLObject var2, SubLObject var77, final SubLObject var78, final SubLObject var79, final SubLObject var6) {
        final SubLObject var80 = f29555(var2);
        if (NIL != var80 && NIL != var77 && !var80.eql(var77)) {
            Errors.error((SubLObject)$ic36$, var77, var2, var80);
        }
        if (NIL != var80) {
            var77 = var80;
        }
        if (NIL == var77) {
            var77 = module0202.f12683($ic37$, (SubLObject)ConsesLow.list(var2), (SubLObject)UNPROVIDED);
        }
        f29559(var77, var78, var6);
        f29560(var77, var79);
        return var77;
    }
    
    public static SubLObject f29559(final SubLObject var77, final SubLObject var78, final SubLObject var6) {
        final SubLThread var79 = SubLProcess.currentSubLThread();
        SubLObject var80 = (SubLObject)NIL;
        if (NIL != module0173.f10955(var77)) {
            final SubLObject var81 = module0147.$g2094$.currentBinding(var79);
            final SubLObject var82 = module0147.$g2095$.currentBinding(var79);
            try {
                module0147.$g2094$.bind((SubLObject)$ic7$, var79);
                module0147.$g2095$.bind($ic8$, var79);
                final SubLObject var83 = $ic39$;
                if (NIL != module0158.f10010(var77, (SubLObject)ONE_INTEGER, var83)) {
                    final SubLObject var84 = module0158.f10011(var77, (SubLObject)ONE_INTEGER, var83);
                    SubLObject var85 = (SubLObject)NIL;
                    final SubLObject var86 = (SubLObject)NIL;
                    while (NIL == var85) {
                        final SubLObject var87 = module0052.f3695(var84, var86);
                        final SubLObject var88 = (SubLObject)makeBoolean(!var86.eql(var87));
                        if (NIL != var88) {
                            SubLObject var89 = (SubLObject)NIL;
                            try {
                                var89 = module0158.f10316(var87, (SubLObject)$ic11$, (SubLObject)$ic12$, (SubLObject)NIL);
                                SubLObject var21_87 = (SubLObject)NIL;
                                final SubLObject var22_88 = (SubLObject)NIL;
                                while (NIL == var21_87) {
                                    final SubLObject var90 = module0052.f3695(var89, var22_88);
                                    final SubLObject var24_89 = (SubLObject)makeBoolean(!var22_88.eql(var90));
                                    if (NIL != var24_89) {
                                        var80 = (SubLObject)ConsesLow.cons(var90, var80);
                                    }
                                    var21_87 = (SubLObject)makeBoolean(NIL == var24_89);
                                }
                            }
                            finally {
                                final SubLObject var17_90 = Threads.$is_thread_performing_cleanupP$.currentBinding(var79);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var79);
                                    if (NIL != var89) {
                                        module0158.f10319(var89);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var17_90, var79);
                                }
                            }
                        }
                        var85 = (SubLObject)makeBoolean(NIL == var88);
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var82, var79);
                module0147.$g2094$.rebind(var81, var79);
            }
        }
        SubLObject var91 = var80;
        SubLObject var92 = (SubLObject)NIL;
        var92 = var91.first();
        while (NIL != var91) {
            final SubLObject var93 = module0178.f11335(var92);
            final SubLObject var94 = module0178.f11287(var92);
            if (!var94.eql(var6) || NIL == conses_high.member(var93, var78, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
                module0543.f33630(var92);
            }
            var91 = var91.rest();
            var92 = var91.first();
        }
        SubLObject var95 = var78;
        SubLObject var96 = (SubLObject)NIL;
        var96 = var95.first();
        while (NIL != var95) {
            if (NIL == module0220.f14584((SubLObject)ConsesLow.list($ic39$, var77, var96), var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                f29556(var77, var96, var6);
            }
            var95 = var95.rest();
            var96 = var95.first();
        }
        return var77;
    }
    
    public static SubLObject f29556(final SubLObject var77, final SubLObject var81, final SubLObject var6) {
        return module0543.f33631((SubLObject)ConsesLow.list($ic39$, var77, var81), var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29560(final SubLObject var77, final SubLObject var79) {
        SubLObject var81;
        final SubLObject var80 = var81 = (SubLObject)((NIL != module0173.f10955(var77)) ? f29561(var77) : NIL);
        SubLObject var82 = (SubLObject)NIL;
        var82 = var81.first();
        while (NIL != var81) {
            if (NIL == module0004.f104(var82, var79, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
                SubLObject var84;
                final SubLObject var83 = var84 = var82;
                SubLObject var85 = (SubLObject)NIL;
                SubLObject var86 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic38$);
                var85 = var84.first();
                var84 = var84.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var84, var83, (SubLObject)$ic38$);
                var86 = var84.first();
                var84 = var84.rest();
                if (NIL == var84) {
                    module0543.f33658((SubLObject)ConsesLow.list($ic40$, var85, var77), var86);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var83, (SubLObject)$ic38$);
                }
            }
            var81 = var81.rest();
            var82 = var81.first();
        }
        var81 = var79;
        SubLObject var87 = (SubLObject)NIL;
        var87 = var81.first();
        while (NIL != var81) {
            if (NIL == module0004.f104(var87, var80, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
                SubLObject var89;
                final SubLObject var88 = var89 = var87;
                SubLObject var85 = (SubLObject)NIL;
                SubLObject var86 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var89, var88, (SubLObject)$ic38$);
                var85 = var89.first();
                var89 = var89.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var89, var88, (SubLObject)$ic38$);
                var86 = var89.first();
                var89 = var89.rest();
                if (NIL == var89) {
                    f29557(var77, var85, var86);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var88, (SubLObject)$ic38$);
                }
            }
            var81 = var81.rest();
            var87 = var81.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29557(final SubLObject var77, final SubLObject var85, final SubLObject var4) {
        return module0543.f33631((SubLObject)ConsesLow.list($ic40$, var85, var77), var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29562(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        var3.resetMultipleValues();
        final SubLObject var4 = module0337.f22630(var2, (SubLObject)$ic41$);
        final SubLObject var5 = var3.secondMultipleValue();
        var3.resetMultipleValues();
        if (NIL != var4) {
            final SubLObject var6 = module0035.f2294(var5, (SubLObject)$ic42$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return (SubLObject)ConsesLow.list(module0285.f18933(var6, (SubLObject)UNPROVIDED));
        }
        final SubLObject var7 = conses_high.union(module0220.f14565(var2, $ic10$, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)$ic12$), module0220.f14596(var2, $ic17$, $ic9$, (SubLObject)THREE_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)$ic12$), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var7;
        SubLObject var10 = (SubLObject)NIL;
        var10 = var9.first();
        while (NIL != var9) {
            var8 = (SubLObject)ConsesLow.cons(module0285.f18933(var10, (SubLObject)UNPROVIDED), var8);
            var9 = var9.rest();
            var10 = var9.first();
        }
        return Sequences.nreverse(var8);
    }
    
    public static SubLObject f29563(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        var3.resetMultipleValues();
        final SubLObject var4 = module0337.f22630(var2, (SubLObject)$ic41$);
        final SubLObject var5 = var3.secondMultipleValue();
        var3.resetMultipleValues();
        if (NIL != var4) {
            final SubLObject var6 = module0035.f2294(var5, (SubLObject)$ic42$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return module0285.f18933(var6, (SubLObject)UNPROVIDED);
        }
        final SubLObject var7 = f29562(var2);
        if (NIL != module0035.f1997(var7)) {
            return var7.first();
        }
        if (NIL == var7) {
            Errors.error((SubLObject)$ic43$, var2);
        }
        else {
            Errors.error((SubLObject)$ic44$, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29564(final SubLObject var2) {
        return module0202.f12691(f29563(var2), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29565(final SubLObject var2) {
        return (SubLObject)makeBoolean(NIL == f29564(var2));
    }
    
    public static SubLObject f29566(final SubLObject var2) {
        final SubLObject var3 = module0285.f18933(module0220.f14596(var2, $ic17$, $ic45$, (SubLObject)THREE_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED).first(), (SubLObject)UNPROVIDED);
        return f29567(var3, (SubLObject)$ic25$);
    }
    
    public static SubLObject f29568(final SubLObject var2) {
        return module0220.f14565(var2, $ic14$, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)$ic12$);
    }
    
    public static SubLObject f29569(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        var3.resetMultipleValues();
        final SubLObject var4 = module0337.f22630(var2, (SubLObject)$ic46$);
        final SubLObject var5 = var3.secondMultipleValue();
        var3.resetMultipleValues();
        if (NIL != var4) {
            final SubLObject var6 = module0035.f2294(var5, (SubLObject)$ic47$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return var6;
        }
        final SubLObject var7 = f29568(var2);
        final SubLObject var8 = f29563(var2);
        if (NIL != module0202.f12888(var8)) {
            return (SubLObject)NIL;
        }
        if (NIL == var7) {
            return $ic48$;
        }
        if (NIL != module0035.f1997(var7)) {
            return module0285.f18875(var7.first(), (SubLObject)UNPROVIDED);
        }
        Errors.error((SubLObject)$ic49$, var2);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29570(final SubLObject var2) {
        final SubLObject var3 = f29569(var2);
        if (NIL != var3) {
            return module0162.f10628(var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29571(final SubLObject var2) {
        final SubLObject var3 = module0220.f14565(var2, $ic34$, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)$ic12$);
        return var3;
    }
    
    public static SubLObject f29572(final SubLObject var104) {
        final SubLObject var105 = module0220.f14565(var104, $ic39$, (SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER, (SubLObject)$ic12$);
        return var105;
    }
    
    public static SubLObject f29555(final SubLObject var2) {
        final SubLObject var3 = module0220.f14556(var2, $ic50$, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)$ic12$);
        return var3;
    }
    
    public static SubLObject f29561(final SubLObject var77) {
        final SubLThread var78 = SubLProcess.currentSubLThread();
        SubLObject var79 = (SubLObject)NIL;
        final SubLObject var80 = module0147.$g2094$.currentBinding(var78);
        final SubLObject var81 = module0147.$g2095$.currentBinding(var78);
        try {
            module0147.$g2094$.bind((SubLObject)$ic7$, var78);
            module0147.$g2095$.bind($ic8$, var78);
            final SubLObject var82 = $ic40$;
            if (NIL != module0158.f10010(var77, (SubLObject)TWO_INTEGER, var82)) {
                final SubLObject var83 = module0158.f10011(var77, (SubLObject)TWO_INTEGER, var82);
                SubLObject var84 = (SubLObject)NIL;
                final SubLObject var85 = (SubLObject)NIL;
                while (NIL == var84) {
                    final SubLObject var86 = module0052.f3695(var83, var85);
                    final SubLObject var87 = (SubLObject)makeBoolean(!var85.eql(var86));
                    if (NIL != var87) {
                        SubLObject var88 = (SubLObject)NIL;
                        try {
                            var88 = module0158.f10316(var86, (SubLObject)$ic11$, (SubLObject)$ic12$, (SubLObject)NIL);
                            SubLObject var21_105 = (SubLObject)NIL;
                            final SubLObject var22_106 = (SubLObject)NIL;
                            while (NIL == var21_105) {
                                final SubLObject var89 = module0052.f3695(var88, var22_106);
                                final SubLObject var24_107 = (SubLObject)makeBoolean(!var22_106.eql(var89));
                                if (NIL != var24_107) {
                                    final SubLObject var90 = module0178.f11334(var89);
                                    final SubLObject var91 = module0178.f11287(var89);
                                    var79 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var90, var91), var79);
                                }
                                var21_105 = (SubLObject)makeBoolean(NIL == var24_107);
                            }
                        }
                        finally {
                            final SubLObject var17_108 = Threads.$is_thread_performing_cleanupP$.currentBinding(var78);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var78);
                                if (NIL != var88) {
                                    module0158.f10319(var88);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var17_108, var78);
                            }
                        }
                    }
                    var84 = (SubLObject)makeBoolean(NIL == var87);
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
        var2 = module0285.f18875(var2, (SubLObject)UNPROVIDED);
        final SubLObject var3 = f29574(var2);
        SubLObject var4 = f29575(var3);
        if (NIL != module0371.f26052()) {
            var4 = module0035.f2341(var4, module0371.f26054(var2));
        }
        if (NIL != f29576()) {
            var4 = module0035.f2341(var4, f29577(var2));
        }
        return var4;
    }
    
    public static SubLObject f29576() {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        return $g3440$.getDynamicValue(var15);
    }
    
    public static SubLObject f29577(final SubLObject var2) {
        final SubLObject var3 = module0684.f41933(var2);
        final SubLObject var4 = (SubLObject)((NIL != var3) ? ConsesLow.list((SubLObject)$ic52$, var3) : NIL);
        return var4;
    }
    
    public static SubLObject f29578(final SubLObject var2, final SubLObject var52) {
        assert NIL != module0360.f23781(var52) : var52;
        final SubLObject var53 = f29573(var2);
        return module0408.f28408(var53, var52);
    }
    
    public static SubLObject f29579(final SubLObject var2) {
        return module0408.f28408(f29573(var2), (SubLObject)$ic52$);
    }
    
    public static SubLObject f29580() {
        return $ic54$;
    }
    
    public static SubLObject f29581(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        final SubLObject var6 = module0147.$g2094$.currentBinding(var3);
        final SubLObject var7 = module0147.$g2095$.currentBinding(var3);
        try {
            module0147.$g2094$.bind((SubLObject)$ic7$, var3);
            module0147.$g2095$.bind($ic8$, var3);
            SubLObject var8 = $ic10$;
            if (NIL != module0158.f10010(var2, (SubLObject)TWO_INTEGER, var8)) {
                final SubLObject var9 = module0158.f10011(var2, (SubLObject)TWO_INTEGER, var8);
                SubLObject var10 = (SubLObject)NIL;
                final SubLObject var11 = (SubLObject)NIL;
                while (NIL == var10) {
                    final SubLObject var12 = module0052.f3695(var9, var11);
                    final SubLObject var13 = (SubLObject)makeBoolean(!var11.eql(var12));
                    if (NIL != var13) {
                        SubLObject var14 = (SubLObject)NIL;
                        try {
                            var14 = module0158.f10316(var12, (SubLObject)$ic11$, (SubLObject)$ic12$, (SubLObject)NIL);
                            SubLObject var21_114 = (SubLObject)NIL;
                            final SubLObject var22_115 = (SubLObject)NIL;
                            while (NIL == var21_114) {
                                final SubLObject var15 = module0052.f3695(var14, var22_115);
                                final SubLObject var24_116 = (SubLObject)makeBoolean(!var22_115.eql(var15));
                                if (NIL != var24_116) {
                                    final SubLObject var16 = module0178.f11287(var15);
                                    final SubLObject var18;
                                    final SubLObject var17 = var18 = module0161.f10557(var16);
                                    if (NIL == conses_high.member(var18, var4, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                        var4 = (SubLObject)ConsesLow.cons(var18, var4);
                                    }
                                }
                                var21_114 = (SubLObject)makeBoolean(NIL == var24_116);
                            }
                        }
                        finally {
                            final SubLObject var17_119 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                                if (NIL != var14) {
                                    module0158.f10319(var14);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var17_119, var3);
                            }
                        }
                    }
                    var10 = (SubLObject)makeBoolean(NIL == var13);
                }
            }
            var8 = $ic14$;
            if (NIL != module0158.f10010(var2, (SubLObject)TWO_INTEGER, var8)) {
                final SubLObject var9 = module0158.f10011(var2, (SubLObject)TWO_INTEGER, var8);
                SubLObject var10 = (SubLObject)NIL;
                final SubLObject var11 = (SubLObject)NIL;
                while (NIL == var10) {
                    final SubLObject var12 = module0052.f3695(var9, var11);
                    final SubLObject var13 = (SubLObject)makeBoolean(!var11.eql(var12));
                    if (NIL != var13) {
                        SubLObject var14 = (SubLObject)NIL;
                        try {
                            var14 = module0158.f10316(var12, (SubLObject)$ic11$, (SubLObject)$ic12$, (SubLObject)NIL);
                            SubLObject var21_115 = (SubLObject)NIL;
                            final SubLObject var22_116 = (SubLObject)NIL;
                            while (NIL == var21_115) {
                                final SubLObject var15 = module0052.f3695(var14, var22_116);
                                final SubLObject var24_117 = (SubLObject)makeBoolean(!var22_116.eql(var15));
                                if (NIL != var24_117) {
                                    final SubLObject var16 = module0178.f11287(var15);
                                    final SubLObject var18;
                                    final SubLObject var17 = var18 = module0161.f10557(var16);
                                    if (NIL == conses_high.member(var18, var4, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                        var4 = (SubLObject)ConsesLow.cons(var18, var4);
                                    }
                                }
                                var21_115 = (SubLObject)makeBoolean(NIL == var24_117);
                            }
                        }
                        finally {
                            final SubLObject var17_120 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                                if (NIL != var14) {
                                    module0158.f10319(var14);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var17_120, var3);
                            }
                        }
                    }
                    var10 = (SubLObject)makeBoolean(NIL == var13);
                }
            }
            var8 = $ic16$;
            if (NIL != module0158.f10010(var2, (SubLObject)TWO_INTEGER, var8)) {
                final SubLObject var9 = module0158.f10011(var2, (SubLObject)TWO_INTEGER, var8);
                SubLObject var10 = (SubLObject)NIL;
                final SubLObject var11 = (SubLObject)NIL;
                while (NIL == var10) {
                    final SubLObject var12 = module0052.f3695(var9, var11);
                    final SubLObject var13 = (SubLObject)makeBoolean(!var11.eql(var12));
                    if (NIL != var13) {
                        SubLObject var14 = (SubLObject)NIL;
                        try {
                            var14 = module0158.f10316(var12, (SubLObject)$ic11$, (SubLObject)$ic12$, (SubLObject)NIL);
                            SubLObject var21_116 = (SubLObject)NIL;
                            final SubLObject var22_117 = (SubLObject)NIL;
                            while (NIL == var21_116) {
                                final SubLObject var15 = module0052.f3695(var14, var22_117);
                                final SubLObject var24_118 = (SubLObject)makeBoolean(!var22_117.eql(var15));
                                if (NIL != var24_118) {
                                    final SubLObject var16 = module0178.f11287(var15);
                                    final SubLObject var18;
                                    final SubLObject var17 = var18 = module0161.f10557(var16);
                                    if (NIL == conses_high.member(var18, var4, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                        var4 = (SubLObject)ConsesLow.cons(var18, var4);
                                    }
                                }
                                var21_116 = (SubLObject)makeBoolean(NIL == var24_118);
                            }
                        }
                        finally {
                            final SubLObject var17_121 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                                if (NIL != var14) {
                                    module0158.f10319(var14);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var17_121, var3);
                            }
                        }
                    }
                    var10 = (SubLObject)makeBoolean(NIL == var13);
                }
            }
            var8 = $ic17$;
            if (NIL != module0158.f10010(var2, (SubLObject)THREE_INTEGER, var8)) {
                final SubLObject var9 = module0158.f10011(var2, (SubLObject)THREE_INTEGER, var8);
                SubLObject var10 = (SubLObject)NIL;
                final SubLObject var11 = (SubLObject)NIL;
                while (NIL == var10) {
                    final SubLObject var12 = module0052.f3695(var9, var11);
                    final SubLObject var13 = (SubLObject)makeBoolean(!var11.eql(var12));
                    if (NIL != var13) {
                        SubLObject var14 = (SubLObject)NIL;
                        try {
                            var14 = module0158.f10316(var12, (SubLObject)$ic11$, (SubLObject)$ic12$, (SubLObject)NIL);
                            SubLObject var21_117 = (SubLObject)NIL;
                            final SubLObject var22_118 = (SubLObject)NIL;
                            while (NIL == var21_117) {
                                final SubLObject var19 = module0052.f3695(var14, var22_118);
                                final SubLObject var24_119 = (SubLObject)makeBoolean(!var22_118.eql(var19));
                                if (NIL != var24_119) {
                                    final SubLObject var16 = module0178.f11287(var19);
                                    final SubLObject var18;
                                    final SubLObject var17 = var18 = module0161.f10557(var16);
                                    if (NIL == conses_high.member(var18, var4, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                        var4 = (SubLObject)ConsesLow.cons(var18, var4);
                                    }
                                }
                                var21_117 = (SubLObject)makeBoolean(NIL == var24_119);
                            }
                        }
                        finally {
                            final SubLObject var17_122 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                                if (NIL != var14) {
                                    module0158.f10319(var14);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var17_122, var3);
                            }
                        }
                    }
                    var10 = (SubLObject)makeBoolean(NIL == var13);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var7, var3);
            module0147.$g2094$.rebind(var6, var3);
        }
        var5 = module0262.f17370(var4, var4, (SubLObject)UNPROVIDED);
        if (NIL != module0035.f1997(var5)) {
            return var5.first();
        }
        return f29580();
    }
    
    public static SubLObject f29582(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var1) && NIL != module0259.f16891(var1, $ic55$));
    }
    
    public static SubLObject f29583(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var1) && NIL != module0259.f16891(var1, $ic56$));
    }
    
    public static SubLObject f29551(final SubLObject var2) {
        return f29584(var2, (SubLObject)NIL);
    }
    
    public static SubLObject f29585(final SubLObject var2, final SubLObject var132) {
        return f29584(var2, var132).first();
    }
    
    public static SubLObject f29584(final SubLObject var2, final SubLObject var133) {
        assert NIL != f29532(var2) : var2;
        final SubLObject var134 = module0067.f4880(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
        if (NIL != f29583(var2)) {
            final SubLObject var135 = $ic58$;
            if (NIL != module0158.f10010(var2, (SubLObject)NIL, var135)) {
                final SubLObject var136 = module0158.f10011(var2, (SubLObject)NIL, var135);
                SubLObject var137 = (SubLObject)NIL;
                final SubLObject var138 = (SubLObject)NIL;
                while (NIL == var137) {
                    final SubLObject var139 = module0052.f3695(var136, var138);
                    final SubLObject var140 = (SubLObject)makeBoolean(!var138.eql(var139));
                    if (NIL != var140) {
                        SubLObject var141 = (SubLObject)NIL;
                        try {
                            var141 = module0158.f10316(var139, (SubLObject)$ic11$, (SubLObject)$ic12$, (SubLObject)NIL);
                            SubLObject var21_135 = (SubLObject)NIL;
                            final SubLObject var22_136 = (SubLObject)NIL;
                            while (NIL == var21_135) {
                                final SubLObject var142 = module0052.f3695(var141, var22_136);
                                final SubLObject var24_137 = (SubLObject)makeBoolean(!var22_136.eql(var142));
                                if (NIL != var24_137) {
                                    final SubLObject var143 = module0178.f11335(var142);
                                    final SubLObject var144 = module0178.f11336(var142);
                                    final SubLObject var145 = module0220.f14553(var144, $ic31$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    final SubLObject var146 = module0220.f14553(var144, $ic32$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    final SubLObject var147 = module0220.f14553(var144, $ic33$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    if (NIL == var133 || var143.equal(var133)) {
                                        module0067.f4886(var134, var144, (SubLObject)ConsesLow.list(var143, var145, var146, var147));
                                    }
                                }
                                var21_135 = (SubLObject)makeBoolean(NIL == var24_137);
                            }
                        }
                        finally {
                            final SubLObject var148 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                if (NIL != var141) {
                                    module0158.f10319(var141);
                                }
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var148);
                            }
                        }
                    }
                    var137 = (SubLObject)makeBoolean(NIL == var140);
                }
            }
        }
        return Sort.sort(module0067.f4903(var134), Symbols.symbol_function((SubLObject)$ic59$), Symbols.symbol_function((SubLObject)$ic60$));
    }
    
    public static SubLObject f29586(final SubLObject var2, final SubLObject var110, final SubLObject var6) {
        SubLObject var111;
        SubLObject var112;
        SubLObject var113;
        for (var111 = (SubLObject)NIL, var111 = var110; NIL != var111; var111 = conses_high.cddr(var111)) {
            var112 = var111.first();
            var113 = conses_high.cadr(var111);
            f29537(var2, var112, var113, var6);
        }
        return var2;
    }
    
    public static SubLObject f29575(final SubLObject var109) {
        SubLObject var110 = (SubLObject)NIL;
        SubLObject var111 = var109;
        SubLObject var112 = (SubLObject)NIL;
        var112 = var111.first();
        while (NIL != var111) {
            SubLObject var114;
            final SubLObject var113 = var114 = var112;
            SubLObject var115 = (SubLObject)NIL;
            SubLObject var116 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var114, var113, (SubLObject)$ic61$);
            var115 = var114.first();
            var114 = var114.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var114, var113, (SubLObject)$ic61$);
            var116 = var114.first();
            var114 = var114.rest();
            if (NIL == var114) {
                final SubLObject var117 = f29587(var115);
                final SubLObject var118 = f29567(var116, var117);
                var110 = conses_high.putf(var110, var117, var118);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var113, (SubLObject)$ic61$);
            }
            var111 = var111.rest();
            var112 = var111.first();
        }
        return var110;
    }
    
    public static SubLObject f29567(final SubLObject var11, final SubLObject var143) {
        if (var143.eql((SubLObject)$ic62$) || var143.eql((SubLObject)$ic63$)) {
            return f29588(var11);
        }
        if (var143.eql((SubLObject)$ic25$)) {
            return module0285.f18933(module0231.f15291(var11), (SubLObject)UNPROVIDED);
        }
        if (!var143.eql((SubLObject)$ic52$)) {
            return module0231.f15291(var11);
        }
        if (NIL != module0202.f12674(var11)) {
            SubLObject var144 = (SubLObject)NIL;
            SubLObject var146;
            final SubLObject var145 = var146 = module0205.f13207(var11, (SubLObject)$ic64$);
            SubLObject var147 = (SubLObject)NIL;
            var147 = var146.first();
            while (NIL != var146) {
                if (NIL != module0290.f19515(var147)) {
                    var147 = module0290.f19510(var147);
                }
                else if (NIL != module0202.f12883(var147, (SubLObject)UNPROVIDED)) {
                    var147 = module0288.f19338(var147, (SubLObject)UNPROVIDED);
                }
                final SubLObject var148 = var147;
                if (NIL != var148) {
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
        if (var143.eql((SubLObject)$ic62$) || var143.eql((SubLObject)$ic63$)) {
            return var11.isInteger() ? f29589(var11) : $ic65$;
        }
        if (var143.eql((SubLObject)$ic66$) || var143.eql((SubLObject)$ic25$) || var143.eql((SubLObject)$ic52$) || var143.eql((SubLObject)$ic67$) || var143.eql((SubLObject)$ic68$) || var143.eql((SubLObject)$ic69$) || var143.eql((SubLObject)$ic70$)) {
            return (NIL != var11) ? var11 : $ic65$;
        }
        return module0231.f15292(var11);
    }
    
    public static SubLObject f29574(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = module0231.f15288(var2);
        if (NIL != module0212.f13762(var2)) {
            final SubLObject var5 = f29590(var2);
            final SubLObject var6 = conses_high.second(var5);
            if (NIL != var6) {
                var4 = (SubLObject)ConsesLow.cons(var5, var4);
            }
            if (NIL != module0018.$g740$.getDynamicValue(var3)) {
                final SubLObject var7 = module0220.f14565(var2, $ic24$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL != var7) {
                    var4 = Sequences.delete($ic23$, var4, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic60$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    var4 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list($ic23$, module0202.f12787(var7, (SubLObject)UNPROVIDED)), var4);
                }
            }
        }
        var4 = Sequences.delete($ic9$, var4, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic60$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        var4 = Sequences.delete($ic13$, var4, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic60$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var4;
    }
    
    public static SubLObject f29590(final SubLObject var2) {
        assert NIL != module0173.f10955(var2) : var2;
        final SubLObject var3 = module0220.f14556(var2, $ic16$, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)$ic12$);
        return f29591(var3);
    }
    
    public static SubLObject f29591(final SubLObject var11) {
        return (SubLObject)ConsesLow.list($ic15$, var11);
    }
    
    public static SubLObject f29592(final SubLObject var151) {
        if (NIL != constant_handles_oc.f8449(var151)) {
            final SubLObject var152 = module0617.f37871(var151, (SubLObject)UNPROVIDED);
            if (NIL != var152) {
                return var152;
            }
        }
        if (NIL != module0167.f10813(var151) && $ic72$.eql(module0205.f13276(var151))) {
            return f29592(module0205.f13277(var151, (SubLObject)UNPROVIDED));
        }
        if (NIL != module0212.f13762(var151)) {
            return module0226.f15112(var151);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29593(final SubLObject var2) {
        return (SubLObject)makeBoolean(NIL == f29594(var2) && $ic73$ != f29595(var2, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f29594(final SubLObject var2) {
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var2) && NIL != module0259.f16891(var2, $ic74$));
    }
    
    public static SubLObject f29595(final SubLObject var2, SubLObject var153) {
        if (var153 == UNPROVIDED) {
            var153 = (SubLObject)NIL;
        }
        if (NIL == var153) {
            var153 = var2;
        }
        if (NIL != module0426.f30110(var2)) {
            return Values.values((SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
        }
        if (NIL == module0202.f12589(var2, $ic75$)) {
            SubLObject var154 = (SubLObject)NIL;
            SubLObject var155 = (SubLObject)$ic81$;
            SubLObject var156 = (SubLObject)NIL;
            final SubLObject var157 = f29568(var2);
            final SubLObject var158 = f29562(var2);
            final SubLObject var159 = Sequences.find_if((SubLObject)$ic82$, var158, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL == module0035.f1997(var158)) {
                var154 = (SubLObject)$ic73$;
                if (Sequences.length(var158).numE((SubLObject)ZERO_INTEGER)) {
                    var155 = Sequences.cconcatenate(var155, PrintLow.format((SubLObject)NIL, (SubLObject)$ic77$, var153));
                    var156 = (SubLObject)ConsesLow.cons((SubLObject)$ic78$, var156);
                }
                else {
                    var155 = Sequences.cconcatenate(var155, PrintLow.format((SubLObject)NIL, (SubLObject)$ic83$, var153));
                    var156 = (SubLObject)ConsesLow.cons((SubLObject)$ic84$, var156);
                }
            }
            if (NIL == module0035.f1997(var157)) {
                if (Sequences.length(var157).numE((SubLObject)ZERO_INTEGER)) {
                    if (NIL == var159) {
                        var154 = (SubLObject)$ic73$;
                        var155 = Sequences.cconcatenate(var155, PrintLow.format((SubLObject)NIL, (SubLObject)$ic85$, var153));
                        var156 = (SubLObject)ConsesLow.cons((SubLObject)$ic86$, var156);
                    }
                }
                else {
                    var154 = (SubLObject)$ic73$;
                    var155 = Sequences.cconcatenate(var155, PrintLow.format((SubLObject)NIL, (SubLObject)$ic87$, var153));
                    var156 = (SubLObject)ConsesLow.cons((SubLObject)$ic88$, var156);
                }
            }
            return Values.values(var154, var155, Sequences.nreverse(var156));
        }
        SubLObject var161;
        final SubLObject var160 = var161 = module0205.f13304(var2, (SubLObject)UNPROVIDED);
        final SubLObject var162 = (SubLObject)(var161.isCons() ? var161.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var161, var160, (SubLObject)$ic76$);
        var161 = var161.rest();
        final SubLObject var163 = (SubLObject)(var161.isCons() ? var161.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var161, var160, (SubLObject)$ic76$);
        final SubLObject var164;
        var161 = (var164 = var161.rest());
        if (NIL == var162) {
            return Values.values((SubLObject)$ic73$, PrintLow.format((SubLObject)NIL, (SubLObject)$ic77$, var153), (SubLObject)ConsesLow.list((SubLObject)$ic78$));
        }
        if (NIL != var164) {
            return Values.values((SubLObject)$ic73$, PrintLow.format((SubLObject)NIL, (SubLObject)$ic79$, var153), (SubLObject)ConsesLow.list((SubLObject)$ic80$));
        }
        return Values.values((SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
    }
    
    public static SubLObject f29596(final SubLObject var151) {
        return (SubLObject)makeBoolean(ZERO_INTEGER.eql(f29578(var151, (SubLObject)$ic69$)) || NIL == f29578(var151, (SubLObject)$ic89$));
    }
    
    public static SubLObject f29597(final SubLObject var151) {
        return (SubLObject)makeBoolean(NIL != f29578(var151, (SubLObject)$ic89$) && NIL == f29596(var151));
    }
    
    public static SubLObject f29598(final SubLObject var151) {
        return (SubLObject)makeBoolean(NIL != f29596(var151) && NIL != module0424.f30041(var151) && $ic90$.eql(f29578(var151, (SubLObject)$ic66$)) && NIL == f29578(var151, (SubLObject)$ic67$) && NIL == f29578(var151, (SubLObject)$ic62$) && NIL == f29578(var151, (SubLObject)$ic68$));
    }
    
    public static SubLObject f29599(final SubLObject var151) {
        return (SubLObject)makeBoolean(NIL != f29596(var151) && NIL == f29598(var151));
    }
    
    public static SubLObject f29600(final SubLObject var151) {
        return (SubLObject)makeBoolean(NIL != f29597(var151) && ONE_INTEGER.eql(f29578(var151, (SubLObject)$ic69$)));
    }
    
    public static SubLObject f29601(final SubLObject var151) {
        return (SubLObject)makeBoolean(NIL != f29597(var151) && NIL == f29600(var151));
    }
    
    public static SubLObject f29602(final SubLObject var151) {
        final SubLObject var152 = f29573(var151);
        return module0035.sublisp_boolean(module0408.f28408(var152, (SubLObject)$ic91$));
    }
    
    public static SubLObject f29603(final SubLObject var2, SubLObject var161) {
        if (var161 == UNPROVIDED) {
            var161 = (SubLObject)NIL;
        }
        final SubLThread var162 = SubLProcess.currentSubLThread();
        final SubLObject var163 = var161;
        assert NIL != module0035.f2327(var163) : var163;
        SubLObject var164;
        SubLObject var165;
        SubLObject var166;
        for (var164 = (SubLObject)NIL, var164 = var163; NIL != var164; var164 = conses_high.cddr(var164)) {
            var165 = var164.first();
            var166 = conses_high.cadr(var164);
            assert NIL != module0360.f23781(var165) : var165;
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
        if (var161 == UNPROVIDED) {
            var161 = (SubLObject)NIL;
        }
        final SubLThread var167 = SubLProcess.currentSubLThread();
        final SubLObject var168 = var161;
        assert NIL != module0035.f2327(var168) : var168;
        SubLObject var169;
        SubLObject var170;
        SubLObject var171;
        for (var169 = (SubLObject)NIL, var169 = var168; NIL != var169; var169 = conses_high.cddr(var169)) {
            var170 = var169.first();
            var171 = conses_high.cadr(var169);
            assert NIL != module0360.f23781(var170) : var170;
        }
        SubLObject var172 = (SubLObject)NIL;
        SubLObject var173 = (SubLObject)NIL;
        var167.resetMultipleValues();
        final SubLObject var174 = f29604(var2);
        final SubLObject var175 = var167.secondMultipleValue();
        SubLObject var176 = var167.thirdMultipleValue();
        var167.resetMultipleValues();
        var176 = module0360.f23788(var176, var161);
        var176 = module0035.f2329(var176, Symbols.symbol_function((SubLObject)$ic93$));
        SubLObject var177 = (SubLObject)NIL;
        SubLObject var178 = (SubLObject)NIL;
        SubLObject var179 = (SubLObject)NIL;
        SubLObject var180 = (SubLObject)NIL;
        SubLObject var181 = (SubLObject)NIL;
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
        SubLObject var185 = (SubLObject)NIL;
        SubLObject var186 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var184, var183, (SubLObject)$ic94$);
        var185 = var184.first();
        var184 = var184.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var184, var183, (SubLObject)$ic94$);
        var186 = var184.first();
        var184 = var184.rest();
        if (NIL == var184) {
            final SubLObject var173_184 = Time.get_internal_real_time();
            var172 = module0347.f23334(var186, var185, (SubLObject)$ic12$, var176);
            var178 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var173_184), time_high.$internal_time_units_per_second$.getGlobalValue());
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var183, (SubLObject)$ic94$);
        }
        var177 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var182), time_high.$internal_time_units_per_second$.getGlobalValue());
        var173 = f29606(var166, var172, var177, var178);
        return Values.values(var172, var173);
    }
    
    public static SubLObject f29606(final SubLObject var77, final SubLObject var102, final SubLObject var168, final SubLObject var169) {
        SubLObject var170 = conses_high.copy_tree(var77);
        SubLObject var172;
        final SubLObject var171 = var172 = module0035.f2399(var77, Symbols.symbol_function((SubLObject)$ic95$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var173 = (SubLObject)NIL;
        var173 = var172.first();
        while (NIL != var172) {
            final SubLObject var174 = var173;
            if (var174.eql((SubLObject)$ic96$)) {
                final SubLObject var175 = Sequences.length(var102);
                var170 = conses_high.nsubst(var175, (SubLObject)$ic96$, var170, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
            }
            else if (var174.eql((SubLObject)$ic97$)) {
                final SubLObject var176 = (SubLObject)((NIL != var102) ? var169 : NIL);
                var170 = conses_high.nsubst(var176, (SubLObject)$ic97$, var170, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
            }
            else if (var174.eql((SubLObject)$ic98$)) {
                final SubLObject var177 = (SubLObject)((NIL != var102) ? var169 : NIL);
                var170 = conses_high.nsubst(var177, (SubLObject)$ic98$, var170, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
            }
            else if (var174.eql((SubLObject)$ic99$)) {
                var170 = conses_high.nsubst(var169, (SubLObject)$ic99$, var170, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
            }
            else if (var174.eql((SubLObject)$ic100$)) {
                var170 = conses_high.nsubst(var168, (SubLObject)$ic100$, var170, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
            }
            else if (var174.eql((SubLObject)$ic101$)) {
                final SubLObject var175 = Sequences.length(var102);
                SubLObject var178 = (SubLObject)NIL;
                if (var169.isNumber() && NIL != module0004.f105(var175)) {
                    var178 = Numbers.divide(var169, var175);
                }
                var170 = conses_high.nsubst(var178, (SubLObject)$ic101$, var170, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
            }
            else if (var174.eql((SubLObject)$ic102$)) {
                final SubLObject var179 = module0035.f2410(var169, var169);
                var170 = conses_high.nsubst(var179, (SubLObject)$ic102$, var170, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
            }
            else {
                Errors.sublisp_break((SubLObject)$ic103$, new SubLObject[] { var173 });
            }
            var172 = var172.rest();
            var173 = var172.first();
        }
        return var170;
    }
    
    public static SubLObject f29607(final SubLObject var192, final SubLObject var2, SubLObject var161) {
        if (var161 == UNPROVIDED) {
            var161 = (SubLObject)NIL;
        }
        final SubLThread var193 = SubLProcess.currentSubLThread();
        final SubLObject var194 = var161;
        assert NIL != module0035.f2327(var194) : var194;
        SubLObject var195;
        SubLObject var196;
        SubLObject var197;
        for (var195 = (SubLObject)NIL, var195 = var194; NIL != var195; var195 = conses_high.cddr(var195)) {
            var196 = var195.first();
            var197 = conses_high.cadr(var195);
            assert NIL != module0360.f23781(var196) : var196;
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
        if (var161 == UNPROVIDED) {
            var161 = (SubLObject)NIL;
        }
        final SubLThread var162 = SubLProcess.currentSubLThread();
        final SubLObject var163 = var161;
        assert NIL != module0035.f2327(var163) : var163;
        SubLObject var164;
        SubLObject var165;
        SubLObject var166;
        for (var164 = (SubLObject)NIL, var164 = var163; NIL != var164; var164 = conses_high.cddr(var164)) {
            var165 = var164.first();
            var166 = conses_high.cadr(var164);
            assert NIL != module0360.f23781(var165) : var165;
        }
        SubLObject var167 = (SubLObject)NIL;
        SubLObject var168 = (SubLObject)NIL;
        SubLObject var169 = (SubLObject)NIL;
        SubLObject var170 = (SubLObject)NIL;
        final SubLObject var171 = module0018.$g694$.currentBinding(var162);
        try {
            module0018.$g694$.bind((SubLObject)NIL, var162);
            if (NIL != module0426.f30115(var2)) {
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
        if (var161 == UNPROVIDED) {
            var161 = (SubLObject)NIL;
        }
        return f29608(var2, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29610(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        var3.resetMultipleValues();
        final SubLObject var4 = f29604(var2);
        SubLObject var5 = var3.secondMultipleValue();
        SubLObject var6 = var3.thirdMultipleValue();
        var3.resetMultipleValues();
        if (NIL == var5) {
            var5 = module0147.f9551();
        }
        var6 = conses_high.putf(var6, (SubLObject)$ic104$, (SubLObject)T);
        return module0409.f28506(var4, var5, var6);
    }
    
    public static SubLObject f29604(final SubLObject var2) {
        if (NIL != module0202.f12589(var2, $ic75$)) {
            return f29611(var2);
        }
        if (NIL != module0337.f22630(var2, (SubLObject)$ic105$)) {
            return f29612(var2);
        }
        if (NIL == module0426.f30114(var2)) {
            final SubLObject var3 = f29563(var2);
            final SubLObject var4 = f29569(var2);
            final SubLObject var5 = f29573(var2);
            return Values.values(var3, var4, var5);
        }
        SubLObject var7;
        final SubLObject var6 = var7 = module0571.f34994(var2);
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic106$);
        var8 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic106$);
        var9 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic106$);
        var10 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic106$);
        var11 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic106$);
        var12 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic106$);
        var13 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic106$);
        var14 = var7.first();
        var7 = var7.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic106$);
        var15 = var7.first();
        var7 = var7.rest();
        if (NIL == var7) {
            var12 = module0426.f30166(var12);
            return Values.values(var10, var11, var12);
        }
        cdestructuring_bind.cdestructuring_bind_error(var6, (SubLObject)$ic106$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29611(final SubLObject var219) {
        SubLObject var221;
        final SubLObject var220 = var221 = module0205.f13304(var219, (SubLObject)UNPROVIDED);
        final SubLObject var222 = (SubLObject)(var221.isCons() ? var221.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var221, var220, (SubLObject)$ic107$);
        var221 = var221.rest();
        final SubLObject var223 = var221.isCons() ? var221.first() : $ic65$;
        cdestructuring_bind.destructuring_bind_must_listp(var221, var220, (SubLObject)$ic107$);
        var221 = var221.rest();
        if (NIL == var221) {
            final SubLObject var224 = module0285.f18933(var222, (SubLObject)UNPROVIDED);
            SubLObject var225 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic108$), module0202.f12684(var223));
            final SubLObject var226 = conses_high.second(conses_high.assoc($ic13$, var225, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            var225 = module0035.f2309(var225, $ic9$, (SubLObject)UNPROVIDED);
            var225 = module0035.f2309(var225, $ic13$, (SubLObject)UNPROVIDED);
            final SubLObject var227 = f29575(var225);
            return Values.values(var224, var226, var227);
        }
        cdestructuring_bind.cdestructuring_bind_error(var220, (SubLObject)$ic107$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29612(final SubLObject var223) {
        SubLObject var225;
        final SubLObject var224 = var225 = module0205.f13304(var223, (SubLObject)UNPROVIDED);
        SubLObject var226 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var225, var224, (SubLObject)$ic109$);
        var226 = var225.first();
        var225 = var225.rest();
        final SubLObject var227 = var225.isCons() ? var225.first() : $ic65$;
        cdestructuring_bind.destructuring_bind_must_listp(var225, var224, (SubLObject)$ic109$);
        var225 = var225.rest();
        if (NIL == var225) {
            final SubLObject var228 = module0205.f13277(var226, (SubLObject)UNPROVIDED);
            final SubLObject var229 = module0205.f13368(var226, (SubLObject)UNPROVIDED);
            SubLObject var230 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic108$), module0202.f12684(var227));
            final SubLObject var231 = conses_high.second(conses_high.assoc($ic13$, var230, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            var230 = module0035.f2309(var230, $ic9$, (SubLObject)UNPROVIDED);
            var230 = module0035.f2309(var230, $ic13$, (SubLObject)UNPROVIDED);
            final SubLObject var232 = f29575(var230);
            return Values.values(var229, var231, var232);
        }
        cdestructuring_bind.cdestructuring_bind_error(var224, (SubLObject)$ic109$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29548(final SubLObject var143) {
        assert NIL != Types.keywordp(var143) : var143;
        return module0231.f15289(var143, $ic111$);
    }
    
    public static SubLObject f29587(final SubLObject var14) {
        assert NIL != module0173.f10955(var14) : var14;
        return module0231.f15290(var14);
    }
    
    public static SubLObject f29613(final SubLObject var143) {
        assert NIL != Types.keywordp(var143) : var143;
        return module0594.f36340(var143, $ic112$);
    }
    
    public static SubLObject f29614(final SubLObject var228) {
        assert NIL != constant_handles_oc.f8449(var228) : var228;
        return module0594.f36343(var228);
    }
    
    public static SubLObject f29615(final SubLObject var229) {
        assert NIL != Types.keywordp(var229) : var229;
        return module0594.f36340(var229, $ic114$);
    }
    
    public static SubLObject f29616(final SubLObject var230) {
        assert NIL != module0173.f10955(var230) : var230;
        return module0594.f36343(var230);
    }
    
    public static SubLObject f29588(final SubLObject var11) {
        if (var11.isInteger()) {
            return var11;
        }
        if (NIL == module0202.f12659(var11)) {
            return (SubLObject)NIL;
        }
        final SubLObject var12 = module0205.f13365(var11);
        final SubLObject var13 = module0205.f13277(var11, (SubLObject)UNPROVIDED);
        SubLObject var14 = (SubLObject)NIL;
        if (var12.eql($ic115$)) {
            return var13;
        }
        if (NIL != module0610.f37203($ic115$, var12)) {
            var14 = module0610.f37206($ic115$, var12, var13, (SubLObject)UNPROVIDED);
        }
        if (NIL == var14) {
            Errors.error((SubLObject)$ic116$, var12);
        }
        return var14;
    }
    
    public static SubLObject f29589(final SubLObject var234) {
        assert NIL != Types.integerp(var234) : var234;
        return module0202.f12720($ic115$, (SubLObject)ConsesLow.list(var234), (SubLObject)UNPROVIDED);
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29618() {
        $g3440$ = SubLFiles.defparameter("S#32745", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29619() {
        module0002.f38((SubLObject)$ic51$);
        return (SubLObject)NIL;
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
        $g3440$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("CycLQuerySpecification"));
        $ic1$ = makeSymbol("CYCL-SENTENCE-P");
        $ic2$ = makeSymbol("S#12264", "CYC");
        $ic3$ = makeSymbol("S#26487", "CYC");
        $ic4$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic5$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("MultipleChoiceQuerySpecification")));
        $ic6$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("CycLQuerySpecification")));
        $ic7$ = makeSymbol("S#12274", "CYC");
        $ic8$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic9$ = constant_handles_oc.f8479((SubLObject)makeString("InferenceSentenceParameter"));
        $ic10$ = constant_handles_oc.f8479((SubLObject)makeString("sentenceParameterValueInSpecification"));
        $ic11$ = makeKeyword("GAF");
        $ic12$ = makeKeyword("TRUE");
        $ic13$ = constant_handles_oc.f8479((SubLObject)makeString("InferenceMicrotheoryParameter"));
        $ic14$ = constant_handles_oc.f8479((SubLObject)makeString("microtheoryParameterValueInSpecification"));
        $ic15$ = constant_handles_oc.f8479((SubLObject)makeString("InferenceModeParameter"));
        $ic16$ = constant_handles_oc.f8479((SubLObject)makeString("inferenceModeParameterValueInSpecification"));
        $ic17$ = constant_handles_oc.f8479((SubLObject)makeString("softwareParameterValueInSpecification"));
        $ic18$ = constant_handles_oc.f8479((SubLObject)makeString("ist-Asserted"));
        $ic19$ = constant_handles_oc.f8479((SubLObject)makeString("BaseKB"));
        $ic20$ = constant_handles_oc.f8479((SubLObject)makeString("Quote"));
        $ic21$ = constant_handles_oc.f8479((SubLObject)makeString("EscapeQuote"));
        $ic22$ = makeString("Inference Parameter ~S unknown by the KB.");
        $ic23$ = constant_handles_oc.f8479((SubLObject)makeString("InferenceAllowedRulesParameter"));
        $ic24$ = constant_handles_oc.f8479((SubLObject)makeString("queryPracticeRules"));
        $ic25$ = makeKeyword("NON-EXPLANATORY-SENTENCE");
        $ic26$ = ConsesLow.list((SubLObject)makeSymbol("S#32746", "CYC"), (SubLObject)makeSymbol("S#32747", "CYC"), (SubLObject)makeSymbol("S#32748", "CYC"), (SubLObject)makeSymbol("S#5858", "CYC"));
        $ic27$ = makeSymbol("INTEGERP");
        $ic28$ = makeSymbol("STRINGP");
        $ic29$ = makeSymbol("S#18096", "CYC");
        $ic30$ = constant_handles_oc.f8479((SubLObject)makeString("MCQuestionNthOptionFn"));
        $ic31$ = constant_handles_oc.f8479((SubLObject)makeString("multipleChoiceOptionFullLabel"));
        $ic32$ = constant_handles_oc.f8479((SubLObject)makeString("multipleChoiceOptionIndexLabel"));
        $ic33$ = constant_handles_oc.f8479((SubLObject)makeString("multipleChoiceOptionPayload"));
        $ic34$ = constant_handles_oc.f8479((SubLObject)makeString("comment"));
        $ic35$ = ConsesLow.list((SubLObject)makeSymbol("COMMENT"));
        $ic36$ = makeString("The template, ~A, passed for the query spec, ~A, is not the one known in the KB (~A).");
        $ic37$ = constant_handles_oc.f8479((SubLObject)makeString("TemplateFromTestQueryFn"));
        $ic38$ = ConsesLow.list((SubLObject)makeSymbol("S#32749", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic39$ = constant_handles_oc.f8479((SubLObject)makeString("formulaTemplateGloss"));
        $ic40$ = constant_handles_oc.f8479((SubLObject)makeString("folderContainsResource"));
        $ic41$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("QueryFn")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#32750", "CYC")), (SubLObject)makeKeyword("ANYTHING"));
        $ic42$ = makeSymbol("S#32750", "CYC");
        $ic43$ = makeString("The query specification, ~A, has no #$InferenceSentenceParameter.");
        $ic44$ = makeString("The query specification, ~A, has more than one #$InferenceSentenceParameter.");
        $ic45$ = constant_handles_oc.f8479((SubLObject)makeString("InferenceNonExplanatorySentenceParameter"));
        $ic46$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("QueryFn")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Quote")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ist")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#11445", "CYC")), (SubLObject)makeKeyword("ANYTHING"))), (SubLObject)makeKeyword("ANYTHING"));
        $ic47$ = makeSymbol("S#11445", "CYC");
        $ic48$ = constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"));
        $ic49$ = makeString("The query specification, ~A, has more than one #$InferenceMicrotheoryParameter.");
        $ic50$ = constant_handles_oc.f8479((SubLObject)makeString("querySpecificationForFormulaTemplate"));
        $ic51$ = makeSymbol("KBQ-QUERY-PROPERTIES");
        $ic52$ = makeKeyword("ALLOWED-RULES");
        $ic53$ = makeSymbol("QUERY-PROPERTY-P");
        $ic54$ = constant_handles_oc.f8479((SubLObject)makeString("TestVocabularyMt"));
        $ic55$ = constant_handles_oc.f8479((SubLObject)makeString("MultipleChoiceKBContentTest"));
        $ic56$ = constant_handles_oc.f8479((SubLObject)makeString("MultipleChoiceQuerySpecification"));
        $ic57$ = makeSymbol("S#32663", "CYC");
        $ic58$ = constant_handles_oc.f8479((SubLObject)makeString("mcQuestionNthOption"));
        $ic59$ = makeSymbol("S#3700", "CYC");
        $ic60$ = makeSymbol("FIRST");
        $ic61$ = ConsesLow.list((SubLObject)makeSymbol("S#723", "CYC"), (SubLObject)makeSymbol("S#32751", "CYC"));
        $ic62$ = makeKeyword("MAX-TIME");
        $ic63$ = makeKeyword("FORWARD-MAX-TIME");
        $ic64$ = makeKeyword("IGNORE");
        $ic65$ = constant_handles_oc.f8479((SubLObject)makeString("TheEmptySet"));
        $ic66$ = makeKeyword("RESULT-UNIQUENESS");
        $ic67$ = makeKeyword("MAX-NUMBER");
        $ic68$ = makeKeyword("MAX-PROOF-DEPTH");
        $ic69$ = makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $ic70$ = makeKeyword("METRICS");
        $ic71$ = makeSymbol("FORT-P");
        $ic72$ = constant_handles_oc.f8479((SubLObject)makeString("TestQueryFn"));
        $ic73$ = makeKeyword("SEVERE");
        $ic74$ = constant_handles_oc.f8479((SubLObject)makeString("UnrunnableQuery"));
        $ic75$ = constant_handles_oc.f8479((SubLObject)makeString("QueryFn"));
        $ic76$ = ConsesLow.list((SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#14349", "CYC"), (SubLObject)makeSymbol("S#32752", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("REST"));
        $ic77$ = makeString("~%~A has no query sentence.");
        $ic78$ = makeKeyword("NO-QUERY-SENTENCE");
        $ic79$ = makeString("~%~A has too many arguments.");
        $ic80$ = makeKeyword("TOO-MANY-ARGUMENTS");
        $ic81$ = makeString("");
        $ic82$ = makeSymbol("S#15780", "CYC");
        $ic83$ = makeString("~%~A has more than one query sentence.");
        $ic84$ = makeKeyword("MORE-THAN-ONE-QUERY-SENTENCE");
        $ic85$ = makeString("~%~A has no query Mt.");
        $ic86$ = makeKeyword("NO-QUERY-MT");
        $ic87$ = makeString("~%~A has more than one query Mt.");
        $ic88$ = makeKeyword("MORE-THAN-ONE-QUERY-MT");
        $ic89$ = makeKeyword("TRANSFORMATION-ALLOWED?");
        $ic90$ = makeKeyword("BINDINGS");
        $ic91$ = makeKeyword("CONDITIONAL-SENTENCE?");
        $ic92$ = makeSymbol("S#748", "CYC");
        $ic93$ = makeSymbol("S#26012", "CYC");
        $ic94$ = ConsesLow.list((SubLObject)makeSymbol("S#28817", "CYC"), (SubLObject)makeSymbol("S#31680", "CYC"));
        $ic95$ = makeSymbol("S#26502", "CYC");
        $ic96$ = makeKeyword("ANSWER-COUNT");
        $ic97$ = makeKeyword("TIME-TO-FIRST-ANSWER");
        $ic98$ = makeKeyword("TIME-TO-LAST-ANSWER");
        $ic99$ = makeKeyword("TOTAL-TIME");
        $ic100$ = makeKeyword("COMPLETE-TOTAL-TIME");
        $ic101$ = makeKeyword("TIME-PER-ANSWER");
        $ic102$ = makeKeyword("LATENCY-IMPROVEMENT-FROM-ITERATIVITY");
        $ic103$ = makeString("time to implement metric ~S");
        $ic104$ = makeKeyword("CACHE-INFERENCE-RESULTS?");
        $ic105$ = ConsesLow.listS(constant_handles_oc.f8479((SubLObject)makeString("PredicateQueryFn")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Kappa")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)makeKeyword("ANYTHING"));
        $ic106$ = ConsesLow.list((SubLObject)makeSymbol("S#32753", "CYC"), (SubLObject)makeSymbol("TYPE"), (SubLObject)makeSymbol("S#14349", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#32187", "CYC"), (SubLObject)makeSymbol("S#32375", "CYC"), (SubLObject)makeSymbol("S#32377", "CYC"), (SubLObject)makeSymbol("S#150", "CYC"));
        $ic107$ = ConsesLow.list((SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#32750", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#32754", "CYC"), constant_handles_oc.f8479((SubLObject)makeString("TheEmptySet"))));
        $ic108$ = makeSymbol("S#15664", "CYC");
        $ic109$ = ConsesLow.list((SubLObject)makeSymbol("S#32755", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#32754", "CYC"), constant_handles_oc.f8479((SubLObject)makeString("TheEmptySet"))));
        $ic110$ = makeSymbol("KEYWORDP");
        $ic111$ = constant_handles_oc.f8479((SubLObject)makeString("InferenceParameter"));
        $ic112$ = constant_handles_oc.f8479((SubLObject)makeString("CycHLSupportModule"));
        $ic113$ = makeSymbol("CONSTANT-P");
        $ic114$ = constant_handles_oc.f8479((SubLObject)makeString("CycHLTruthValue"));
        $ic115$ = constant_handles_oc.f8479((SubLObject)makeString("SecondsDuration"));
        $ic116$ = makeString("Unit ~A can't be converted to seconds.");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 896 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/