package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0227 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0227";
    public static final String myFingerPrint = "50dcf4c03b8f4ff033f161ded1890503a808cca9051a18fdb7dddb7c49222058";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLInteger $ic11$;
    private static final SubLList $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLString $ic14$;
    private static final SubLObject $ic15$;
    private static final SubLList $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    
    public static SubLObject f15177(final SubLObject var1, final SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        return module0052.f3709(module0219.f14509(var1, var2, var3, var4, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f15178(final SubLObject var1, final SubLObject var2, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        return module0052.f3709(module0219.f14511(var1, var2, var5));
    }
    
    public static SubLObject f15179(final SubLObject var3, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = (SubLObject)NIL;
        }
        return module0052.f3709(module0219.f14512(var3, var4, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f15180(final SubLObject var5) {
        return module0052.f3709(module0219.f14513(var5));
    }
    
    public static SubLObject f15181(final SubLObject var1) {
        return module0052.f3709(module0219.f14524(var1));
    }
    
    public static SubLObject f15182(final SubLObject var6, SubLObject var7, SubLObject var8) {
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)NIL;
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        final SubLObject var10 = module0217.f14404(var6, var7, var8);
        final SubLObject var12;
        final SubLObject var11 = var12 = module0217.f14396(var10, (SubLObject)$ic0$, (SubLObject)UNPROVIDED);
        if (var12.eql((SubLObject)$ic1$)) {
            final SubLObject var13 = module0217.f14396(var10, (SubLObject)$ic2$, (SubLObject)UNPROVIDED);
            final SubLObject var14 = module0217.f14396(var10, (SubLObject)$ic3$, (SubLObject)UNPROVIDED);
            final SubLObject var15 = module0217.f14396(var10, (SubLObject)$ic4$, (SubLObject)UNPROVIDED);
            return f15177(var13, var14, var15, (SubLObject)UNPROVIDED);
        }
        if (var12.eql((SubLObject)$ic5$)) {
            final SubLObject var16 = module0217.f14396(var10, (SubLObject)$ic4$, (SubLObject)UNPROVIDED);
            return f15179(var16, (SubLObject)UNPROVIDED);
        }
        SubLObject var17 = (SubLObject)NIL;
        final SubLObject var18 = var10;
        final SubLObject var12_17;
        final SubLObject var19 = var12_17 = module0158.f10294(var18);
        if (var12_17.eql((SubLObject)$ic1$)) {
            var9.resetMultipleValues();
            final SubLObject var20 = module0158.f10297(var18);
            final SubLObject var21 = var9.secondMultipleValue();
            final SubLObject var22 = var9.thirdMultipleValue();
            var9.resetMultipleValues();
            if (NIL != var21) {
                if (NIL != var22) {
                    final SubLObject var23 = var22;
                    if (NIL != module0158.f10010(var20, var21, var23)) {
                        final SubLObject var24 = module0158.f10011(var20, var21, var23);
                        SubLObject var25 = (SubLObject)NIL;
                        final SubLObject var26 = (SubLObject)NIL;
                        while (NIL == var25) {
                            final SubLObject var27 = module0052.f3695(var24, var26);
                            final SubLObject var28 = (SubLObject)makeBoolean(!var26.eql(var27));
                            if (NIL != var28) {
                                SubLObject var29 = (SubLObject)NIL;
                                try {
                                    var29 = module0158.f10316(var27, (SubLObject)$ic6$, var7, (SubLObject)NIL);
                                    SubLObject var23_28 = (SubLObject)NIL;
                                    final SubLObject var24_29 = (SubLObject)NIL;
                                    while (NIL == var23_28) {
                                        final SubLObject var30 = module0052.f3695(var29, var24_29);
                                        final SubLObject var26_31 = (SubLObject)makeBoolean(!var24_29.eql(var30));
                                        if (NIL != var26_31) {
                                            var17 = (SubLObject)ConsesLow.cons(var30, var17);
                                        }
                                        var23_28 = (SubLObject)makeBoolean(NIL == var26_31);
                                    }
                                }
                                finally {
                                    final SubLObject var31 = Threads.$is_thread_performing_cleanupP$.currentBinding(var9);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var9);
                                        if (NIL != var29) {
                                            module0158.f10319(var29);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var31, var9);
                                    }
                                }
                            }
                            var25 = (SubLObject)makeBoolean(NIL == var28);
                        }
                    }
                }
                else {
                    final SubLObject var23 = (SubLObject)NIL;
                    if (NIL != module0158.f10010(var20, var21, var23)) {
                        final SubLObject var24 = module0158.f10011(var20, var21, var23);
                        SubLObject var25 = (SubLObject)NIL;
                        final SubLObject var26 = (SubLObject)NIL;
                        while (NIL == var25) {
                            final SubLObject var27 = module0052.f3695(var24, var26);
                            final SubLObject var28 = (SubLObject)makeBoolean(!var26.eql(var27));
                            if (NIL != var28) {
                                SubLObject var29 = (SubLObject)NIL;
                                try {
                                    var29 = module0158.f10316(var27, (SubLObject)$ic6$, var7, (SubLObject)NIL);
                                    SubLObject var23_29 = (SubLObject)NIL;
                                    final SubLObject var24_30 = (SubLObject)NIL;
                                    while (NIL == var23_29) {
                                        final SubLObject var30 = module0052.f3695(var29, var24_30);
                                        final SubLObject var26_32 = (SubLObject)makeBoolean(!var24_30.eql(var30));
                                        if (NIL != var26_32) {
                                            var17 = (SubLObject)ConsesLow.cons(var30, var17);
                                        }
                                        var23_29 = (SubLObject)makeBoolean(NIL == var26_32);
                                    }
                                }
                                finally {
                                    final SubLObject var32 = Threads.$is_thread_performing_cleanupP$.currentBinding(var9);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var9);
                                        if (NIL != var29) {
                                            module0158.f10319(var29);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var32, var9);
                                    }
                                }
                            }
                            var25 = (SubLObject)makeBoolean(NIL == var28);
                        }
                    }
                }
            }
            else if (NIL != var22) {
                final SubLObject var23 = var22;
                if (NIL != module0158.f10010(var20, (SubLObject)NIL, var23)) {
                    final SubLObject var24 = module0158.f10011(var20, (SubLObject)NIL, var23);
                    SubLObject var25 = (SubLObject)NIL;
                    final SubLObject var26 = (SubLObject)NIL;
                    while (NIL == var25) {
                        final SubLObject var27 = module0052.f3695(var24, var26);
                        final SubLObject var28 = (SubLObject)makeBoolean(!var26.eql(var27));
                        if (NIL != var28) {
                            SubLObject var29 = (SubLObject)NIL;
                            try {
                                var29 = module0158.f10316(var27, (SubLObject)$ic6$, var7, (SubLObject)NIL);
                                SubLObject var23_30 = (SubLObject)NIL;
                                final SubLObject var24_31 = (SubLObject)NIL;
                                while (NIL == var23_30) {
                                    final SubLObject var30 = module0052.f3695(var29, var24_31);
                                    final SubLObject var26_33 = (SubLObject)makeBoolean(!var24_31.eql(var30));
                                    if (NIL != var26_33) {
                                        var17 = (SubLObject)ConsesLow.cons(var30, var17);
                                    }
                                    var23_30 = (SubLObject)makeBoolean(NIL == var26_33);
                                }
                            }
                            finally {
                                final SubLObject var33 = Threads.$is_thread_performing_cleanupP$.currentBinding(var9);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var9);
                                    if (NIL != var29) {
                                        module0158.f10319(var29);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var33, var9);
                                }
                            }
                        }
                        var25 = (SubLObject)makeBoolean(NIL == var28);
                    }
                }
            }
            else {
                final SubLObject var23 = (SubLObject)NIL;
                if (NIL != module0158.f10010(var20, (SubLObject)NIL, var23)) {
                    final SubLObject var24 = module0158.f10011(var20, (SubLObject)NIL, var23);
                    SubLObject var25 = (SubLObject)NIL;
                    final SubLObject var26 = (SubLObject)NIL;
                    while (NIL == var25) {
                        final SubLObject var27 = module0052.f3695(var24, var26);
                        final SubLObject var28 = (SubLObject)makeBoolean(!var26.eql(var27));
                        if (NIL != var28) {
                            SubLObject var29 = (SubLObject)NIL;
                            try {
                                var29 = module0158.f10316(var27, (SubLObject)$ic6$, var7, (SubLObject)NIL);
                                SubLObject var23_31 = (SubLObject)NIL;
                                final SubLObject var24_32 = (SubLObject)NIL;
                                while (NIL == var23_31) {
                                    final SubLObject var30 = module0052.f3695(var29, var24_32);
                                    final SubLObject var26_34 = (SubLObject)makeBoolean(!var24_32.eql(var30));
                                    if (NIL != var26_34) {
                                        var17 = (SubLObject)ConsesLow.cons(var30, var17);
                                    }
                                    var23_31 = (SubLObject)makeBoolean(NIL == var26_34);
                                }
                            }
                            finally {
                                final SubLObject var34 = Threads.$is_thread_performing_cleanupP$.currentBinding(var9);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var9);
                                    if (NIL != var29) {
                                        module0158.f10319(var29);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var34, var9);
                                }
                            }
                        }
                        var25 = (SubLObject)makeBoolean(NIL == var28);
                    }
                }
            }
        }
        else if (var12_17.eql((SubLObject)$ic5$)) {
            final SubLObject var35 = module0158.f10299(var18);
            if (NIL != module0158.f10038(var35)) {
                final SubLObject var36 = (SubLObject)NIL;
                final SubLObject var37 = module0012.$g73$.currentBinding(var9);
                final SubLObject var38 = module0012.$g65$.currentBinding(var9);
                final SubLObject var39 = module0012.$g67$.currentBinding(var9);
                final SubLObject var40 = module0012.$g68$.currentBinding(var9);
                final SubLObject var41 = module0012.$g66$.currentBinding(var9);
                final SubLObject var42 = module0012.$g69$.currentBinding(var9);
                final SubLObject var43 = module0012.$g70$.currentBinding(var9);
                final SubLObject var44 = module0012.$silent_progressP$.currentBinding(var9);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var9);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var9), var9);
                    module0012.$g67$.bind((SubLObject)ONE_INTEGER, var9);
                    module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var9);
                    module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var9);
                    module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var9);
                    module0012.$g70$.bind((SubLObject)T, var9);
                    module0012.$silent_progressP$.bind((SubLObject)((NIL != var36) ? module0012.$silent_progressP$.getDynamicValue(var9) : T), var9);
                    module0012.f474(var36);
                    final SubLObject var45 = module0158.f10039(var35);
                    SubLObject var46 = (SubLObject)NIL;
                    final SubLObject var47 = (SubLObject)NIL;
                    while (NIL == var46) {
                        final SubLObject var48 = module0052.f3695(var45, var47);
                        final SubLObject var49 = (SubLObject)makeBoolean(!var47.eql(var48));
                        if (NIL != var49) {
                            module0012.f476();
                            SubLObject var50 = (SubLObject)NIL;
                            try {
                                var50 = module0158.f10316(var48, (SubLObject)$ic6$, var7, (SubLObject)NIL);
                                SubLObject var23_32 = (SubLObject)NIL;
                                final SubLObject var24_33 = (SubLObject)NIL;
                                while (NIL == var23_32) {
                                    final SubLObject var51 = module0052.f3695(var50, var24_33);
                                    final SubLObject var26_35 = (SubLObject)makeBoolean(!var24_33.eql(var51));
                                    if (NIL != var26_35) {
                                        var17 = (SubLObject)ConsesLow.cons(var51, var17);
                                    }
                                    var23_32 = (SubLObject)makeBoolean(NIL == var26_35);
                                }
                            }
                            finally {
                                final SubLObject var32_55 = Threads.$is_thread_performing_cleanupP$.currentBinding(var9);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var9);
                                    if (NIL != var50) {
                                        module0158.f10319(var50);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var32_55, var9);
                                }
                            }
                        }
                        var46 = (SubLObject)makeBoolean(NIL == var49);
                    }
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var44, var9);
                    module0012.$g70$.rebind(var43, var9);
                    module0012.$g69$.rebind(var42, var9);
                    module0012.$g66$.rebind(var41, var9);
                    module0012.$g68$.rebind(var40, var9);
                    module0012.$g67$.rebind(var39, var9);
                    module0012.$g65$.rebind(var38, var9);
                    module0012.$g73$.rebind(var37, var9);
                }
            }
        }
        else if (var12_17.eql((SubLObject)$ic7$)) {
            SubLObject var52 = module0218.f14453(module0158.f10301(var18), (SubLObject)UNPROVIDED);
            SubLObject var53 = (SubLObject)NIL;
            var53 = var52.first();
            while (NIL != var52) {
                if (NIL == var7 || NIL != module0178.f11343(var53, var7)) {
                    var17 = (SubLObject)ConsesLow.cons(var53, var17);
                }
                var52 = var52.rest();
                var53 = var52.first();
            }
        }
        else {
            module0158.f10295(var18, var19);
        }
        return module0052.f3709(Sequences.nreverse(var17));
    }
    
    public static SubLObject f15183(final SubLObject var57) {
        assert NIL != module0173.f10955(var57) : var57;
        return module0052.f3709(module0256.f16531(var57, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f15184(final SubLObject var58) {
        assert NIL != module0173.f10955(var58) : var58;
        return module0052.f3709(module0259.f16840(var58, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f15185(final SubLObject var57) {
        assert NIL != module0173.f10955(var57) : var57;
        return module0052.f3689(f15186(var57), Symbols.symbol_function((SubLObject)$ic9$), Symbols.symbol_function((SubLObject)$ic10$), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15186(final SubLObject var57) {
        final SubLObject var58 = module0055.f4017();
        final SubLObject var59 = Hashtables.make_hash_table((SubLObject)$ic11$, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
        module0055.f4021(var57, var58);
        Hashtables.sethash(var57, var59, (SubLObject)T);
        return (SubLObject)ConsesLow.list(var58, var59);
    }
    
    public static SubLObject f15187(final SubLObject var61) {
        return module0055.f4019(var61.first());
    }
    
    public static SubLObject f15188(final SubLObject var61) {
        final SubLThread var62 = SubLProcess.currentSubLThread();
        SubLObject var63 = (SubLObject)NIL;
        SubLObject var64 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var61, var61, (SubLObject)$ic12$);
        var63 = var61.first();
        SubLObject var65 = var61.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var65, var61, (SubLObject)$ic12$);
        var64 = var65.first();
        var65 = var65.rest();
        if (NIL == var65) {
            SubLObject var66 = (SubLObject)NIL;
            while (NIL == module0055.f4019(var63) && NIL == var66) {
                var66 = module0055.f4023(var63);
                final SubLObject var67 = module0137.$g1605$.currentBinding(var62);
                try {
                    module0137.$g1605$.bind((NIL != module0137.f8955($ic13$)) ? module0137.f8955($ic13$) : module0137.$g1605$.getDynamicValue(var62), var62);
                    final SubLObject var68 = module0242.f15664(var66, module0137.f8955($ic13$));
                    if (NIL == var68) {
                        continue;
                    }
                    SubLObject var69 = module0244.f15784(module0137.f8955($ic13$));
                    SubLObject var70 = (SubLObject)NIL;
                    var70 = var69.first();
                    while (NIL != var69) {
                        final SubLObject var71 = module0245.f15834(var68, var70, module0137.f8955($ic13$));
                        if (NIL != var71 && var70.eql(module0244.f15780(module0137.f8955($ic13$)))) {
                            SubLObject var72;
                            for (var72 = module0066.f4838(module0067.f4891(var71)); NIL == module0066.f4841(var72); var72 = module0066.f4840(var72)) {
                                var62.resetMultipleValues();
                                final SubLObject var73 = module0066.f4839(var72);
                                final SubLObject var74 = var62.secondMultipleValue();
                                var62.resetMultipleValues();
                                SubLObject var68_71;
                                for (var68_71 = module0066.f4838(module0067.f4891(var74)); NIL == module0066.f4841(var68_71); var68_71 = module0066.f4840(var68_71)) {
                                    var62.resetMultipleValues();
                                    final SubLObject var75 = module0066.f4839(var68_71);
                                    final SubLObject var76 = var62.secondMultipleValue();
                                    var62.resetMultipleValues();
                                    if (NIL != module0141.f9279(var75)) {
                                        final SubLObject var77 = var76;
                                        if (NIL != module0077.f5302(var77)) {
                                            final SubLObject var78 = module0077.f5333(var77);
                                            SubLObject var79;
                                            SubLObject var77_78;
                                            SubLObject var80;
                                            for (var79 = module0032.f1741(var78), var77_78 = (SubLObject)NIL, var77_78 = module0032.f1742(var79, var78); NIL == module0032.f1744(var79, var77_78); var77_78 = module0032.f1743(var77_78)) {
                                                var80 = module0032.f1745(var79, var77_78);
                                                if (NIL != module0032.f1746(var77_78, var80) && NIL != module0147.f9507(var73) && NIL == Hashtables.gethash(var80, var64, (SubLObject)UNPROVIDED)) {
                                                    Hashtables.sethash(var80, var64, (SubLObject)T);
                                                    module0055.f4021(var80, var63);
                                                }
                                            }
                                        }
                                        else if (var77.isList()) {
                                            SubLObject var81 = var77;
                                            SubLObject var82 = (SubLObject)NIL;
                                            var82 = var81.first();
                                            while (NIL != var81) {
                                                if (NIL != module0147.f9507(var73) && NIL == Hashtables.gethash(var82, var64, (SubLObject)UNPROVIDED)) {
                                                    Hashtables.sethash(var82, var64, (SubLObject)T);
                                                    module0055.f4021(var82, var63);
                                                }
                                                var81 = var81.rest();
                                                var82 = var81.first();
                                            }
                                        }
                                        else {
                                            Errors.error((SubLObject)$ic14$, var77);
                                        }
                                    }
                                }
                                module0066.f4842(var68_71);
                            }
                            module0066.f4842(var72);
                        }
                        var69 = var69.rest();
                        var70 = var69.first();
                    }
                }
                finally {
                    module0137.$g1605$.rebind(var67, var62);
                }
            }
            return Values.values(var66, var61, (SubLObject)NIL);
        }
        cdestructuring_bind.cdestructuring_bind_error(var61, (SubLObject)$ic12$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15189(final SubLObject var57) {
        final SubLThread var58 = SubLProcess.currentSubLThread();
        assert NIL != module0173.f10955(var57) : var57;
        SubLObject var59 = (SubLObject)NIL;
        final SubLObject var60 = module0137.$g1605$.currentBinding(var58);
        try {
            module0137.$g1605$.bind((NIL != module0137.f8955($ic15$)) ? module0137.f8955($ic15$) : module0137.$g1605$.getDynamicValue(var58), var58);
            final SubLObject var61 = module0242.f15664(var57, module0137.f8955($ic15$));
            if (NIL != var61) {
                SubLObject var62 = module0244.f15784(module0137.f8955($ic15$));
                SubLObject var63 = (SubLObject)NIL;
                var63 = var62.first();
                while (NIL != var62) {
                    final SubLObject var64 = module0245.f15834(var61, var63, module0137.f8955($ic15$));
                    if (NIL != var64 && var63.eql(module0244.f15780(module0137.f8955($ic15$)))) {
                        SubLObject var65;
                        for (var65 = module0066.f4838(module0067.f4891(var64)); NIL == module0066.f4841(var65); var65 = module0066.f4840(var65)) {
                            var58.resetMultipleValues();
                            final SubLObject var66 = module0066.f4839(var65);
                            final SubLObject var67 = var58.secondMultipleValue();
                            var58.resetMultipleValues();
                            SubLObject var68_83;
                            for (var68_83 = module0066.f4838(module0067.f4891(var67)); NIL == module0066.f4841(var68_83); var68_83 = module0066.f4840(var68_83)) {
                                var58.resetMultipleValues();
                                final SubLObject var68 = module0066.f4839(var68_83);
                                final SubLObject var69 = var58.secondMultipleValue();
                                var58.resetMultipleValues();
                                if (NIL != module0141.f9279(var68)) {
                                    final SubLObject var70 = var69;
                                    if (NIL != module0077.f5302(var70)) {
                                        final SubLObject var71 = module0077.f5333(var70);
                                        SubLObject var72;
                                        SubLObject var73;
                                        SubLObject var74;
                                        for (var72 = module0032.f1741(var71), var73 = (SubLObject)NIL, var73 = module0032.f1742(var72, var71); NIL == module0032.f1744(var72, var73); var73 = module0032.f1743(var73)) {
                                            var74 = module0032.f1745(var72, var73);
                                            if (NIL != module0032.f1746(var73, var74) && NIL != module0147.f9507(var66)) {
                                                var59 = (SubLObject)ConsesLow.cons(var74, var59);
                                            }
                                        }
                                    }
                                    else if (var70.isList()) {
                                        SubLObject var75 = var70;
                                        SubLObject var76 = (SubLObject)NIL;
                                        var76 = var75.first();
                                        while (NIL != var75) {
                                            if (NIL != module0147.f9507(var66)) {
                                                var59 = (SubLObject)ConsesLow.cons(var76, var59);
                                            }
                                            var75 = var75.rest();
                                            var76 = var75.first();
                                        }
                                    }
                                    else {
                                        Errors.error((SubLObject)$ic14$, var70);
                                    }
                                }
                            }
                            module0066.f4842(var68_83);
                        }
                        module0066.f4842(var65);
                    }
                    var62 = var62.rest();
                    var63 = var62.first();
                }
            }
        }
        finally {
            module0137.$g1605$.rebind(var60, var58);
        }
        SubLObject var77 = module0248.f15995(var57);
        SubLObject var78 = (SubLObject)NIL;
        var78 = var77.first();
        while (NIL != var77) {
            SubLObject var80;
            final SubLObject var79 = var80 = var78;
            SubLObject var81 = (SubLObject)NIL;
            SubLObject var82 = (SubLObject)NIL;
            SubLObject var83 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic16$);
            var81 = var80.first();
            var80 = var80.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic16$);
            var82 = var80.first();
            var80 = var80.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var80, var79, (SubLObject)$ic16$);
            var83 = var80.first();
            var80 = var80.rest();
            if (NIL == var80) {
                if (NIL != module0141.f9279(var83) && NIL != module0147.f9507(var82)) {
                    var59 = (SubLObject)ConsesLow.cons(var81, var59);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var79, (SubLObject)$ic16$);
            }
            var77 = var77.rest();
            var78 = var77.first();
        }
        return module0052.f3709(Sequences.nreverse(var59));
    }
    
    public static SubLObject f15190(final SubLObject var57) {
        assert NIL != module0173.f10955(var57) : var57;
        return module0052.f3689(f15191(var57), Symbols.symbol_function((SubLObject)$ic17$), Symbols.symbol_function((SubLObject)$ic18$), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15191(final SubLObject var57) {
        final SubLObject var58 = f15185(var57);
        final SubLObject var59 = (SubLObject)NIL;
        final SubLObject var60 = Hashtables.make_hash_table((SubLObject)$ic11$, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        return (SubLObject)ConsesLow.list(var58, var59, var60);
    }
    
    public static SubLObject f15192(final SubLObject var61) {
        return (SubLObject)makeBoolean(NIL == var61.first() && NIL == conses_high.second(var61));
    }
    
    public static SubLObject f15193(final SubLObject var61) {
        SubLObject var62 = (SubLObject)NIL;
        SubLObject var63 = (SubLObject)NIL;
        SubLObject var64 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var61, var61, (SubLObject)$ic19$);
        var62 = var61.first();
        SubLObject var65 = var61.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var65, var61, (SubLObject)$ic19$);
        var63 = var65.first();
        var65 = var65.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var65, var61, (SubLObject)$ic19$);
        var64 = var65.first();
        var65 = var65.rest();
        if (NIL != var65) {
            cdestructuring_bind.cdestructuring_bind_error(var61, (SubLObject)$ic19$);
            return (SubLObject)NIL;
        }
        while (true) {
            if (NIL != var63 && NIL == module0052.f3687(var63)) {
                final SubLObject var66 = module0052.f3693(var63);
                if (NIL == Hashtables.gethash(var66, var64, (SubLObject)UNPROVIDED)) {
                    Hashtables.sethash(var66, var64, (SubLObject)T);
                    return Values.values(var66, var61, (SubLObject)NIL);
                }
                continue;
            }
            else if (NIL != var63) {
                var63 = (SubLObject)NIL;
                ConsesLow.set_nth((SubLObject)ONE_INTEGER, var61, var63);
            }
            else {
                if (NIL != module0052.f3687(var62)) {
                    var62 = (SubLObject)NIL;
                    ConsesLow.set_nth((SubLObject)ZERO_INTEGER, var61, var62);
                    return Values.values((SubLObject)NIL, var61, (SubLObject)T);
                }
                final SubLObject var67 = module0052.f3693(var62);
                var63 = f15189(var67);
                ConsesLow.set_nth((SubLObject)ONE_INTEGER, var61, var63);
            }
        }
    }
    
    public static SubLObject f15194(final SubLObject var57) {
        assert NIL != module0173.f10955(var57) : var57;
        return module0052.f3689(f15195(var57), Symbols.symbol_function((SubLObject)$ic20$), Symbols.symbol_function((SubLObject)$ic21$), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15195(final SubLObject var57) {
        final SubLObject var58 = module0055.f4017();
        final SubLObject var59 = module0055.f4017();
        final SubLObject var60 = Hashtables.make_hash_table(Numbers.add(module0549.f33901(var57), module0549.f33895(var57)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0055.f4021(var57, var58);
        Hashtables.sethash(var57, var60, (SubLObject)T);
        return (SubLObject)ConsesLow.list(var58, var59, var60);
    }
    
    public static SubLObject f15196(final SubLObject var61) {
        return (SubLObject)makeBoolean(NIL != module0055.f4019(var61.first()) && NIL != module0055.f4019(conses_high.second(var61)));
    }
    
    public static SubLObject f15197(final SubLObject var61) {
        final SubLThread var62 = SubLProcess.currentSubLThread();
        final SubLObject var63 = var61.first();
        final SubLObject var64 = conses_high.second(var61);
        final SubLObject var65 = conses_high.third(var61);
        SubLObject var66 = (SubLObject)NIL;
        if (NIL == module0055.f4019(var63)) {
            var66 = module0055.f4023(var63);
            SubLObject var67 = module0137.$g1605$.currentBinding(var62);
            try {
                module0137.$g1605$.bind((NIL != module0137.f8955($ic13$)) ? module0137.f8955($ic13$) : module0137.$g1605$.getDynamicValue(var62), var62);
                final SubLObject var68 = module0242.f15664(var66, module0137.f8955($ic13$));
                if (NIL != var68) {
                    SubLObject var69 = module0244.f15784(module0137.f8955($ic13$));
                    SubLObject var70 = (SubLObject)NIL;
                    var70 = var69.first();
                    while (NIL != var69) {
                        final SubLObject var71 = module0245.f15834(var68, var70, module0137.f8955($ic13$));
                        if (NIL != var71 && var70.eql(module0244.f15780(module0137.f8955($ic13$)))) {
                            SubLObject var72;
                            for (var72 = module0066.f4838(module0067.f4891(var71)); NIL == module0066.f4841(var72); var72 = module0066.f4840(var72)) {
                                var62.resetMultipleValues();
                                final SubLObject var73 = module0066.f4839(var72);
                                final SubLObject var74 = var62.secondMultipleValue();
                                var62.resetMultipleValues();
                                SubLObject var68_97;
                                for (var68_97 = module0066.f4838(module0067.f4891(var74)); NIL == module0066.f4841(var68_97); var68_97 = module0066.f4840(var68_97)) {
                                    var62.resetMultipleValues();
                                    final SubLObject var75 = module0066.f4839(var68_97);
                                    final SubLObject var76 = var62.secondMultipleValue();
                                    var62.resetMultipleValues();
                                    if (NIL != module0141.f9279(var75)) {
                                        final SubLObject var77 = var76;
                                        if (NIL != module0077.f5302(var77)) {
                                            final SubLObject var78 = module0077.f5333(var77);
                                            SubLObject var79;
                                            SubLObject var77_98;
                                            SubLObject var80;
                                            for (var79 = module0032.f1741(var78), var77_98 = (SubLObject)NIL, var77_98 = module0032.f1742(var79, var78); NIL == module0032.f1744(var79, var77_98); var77_98 = module0032.f1743(var77_98)) {
                                                var80 = module0032.f1745(var79, var77_98);
                                                if (NIL != module0032.f1746(var77_98, var80) && NIL != module0147.f9507(var73) && NIL == Hashtables.gethash(var80, var65, (SubLObject)UNPROVIDED)) {
                                                    Hashtables.sethash(var80, var65, (SubLObject)T);
                                                    module0055.f4021(var80, var63);
                                                }
                                            }
                                        }
                                        else if (var77.isList()) {
                                            SubLObject var81 = var77;
                                            SubLObject var82 = (SubLObject)NIL;
                                            var82 = var81.first();
                                            while (NIL != var81) {
                                                if (NIL != module0147.f9507(var73) && NIL == Hashtables.gethash(var82, var65, (SubLObject)UNPROVIDED)) {
                                                    Hashtables.sethash(var82, var65, (SubLObject)T);
                                                    module0055.f4021(var82, var63);
                                                }
                                                var81 = var81.rest();
                                                var82 = var81.first();
                                            }
                                        }
                                        else {
                                            Errors.error((SubLObject)$ic14$, var77);
                                        }
                                    }
                                }
                                module0066.f4842(var68_97);
                            }
                            module0066.f4842(var72);
                        }
                        var69 = var69.rest();
                        var70 = var69.first();
                    }
                }
            }
            finally {
                module0137.$g1605$.rebind(var67, var62);
            }
            var67 = module0137.$g1605$.currentBinding(var62);
            try {
                module0137.$g1605$.bind((NIL != module0137.f8955($ic15$)) ? module0137.f8955($ic15$) : module0137.$g1605$.getDynamicValue(var62), var62);
                final SubLObject var68 = module0242.f15664(var66, module0137.f8955($ic15$));
                if (NIL != var68) {
                    SubLObject var69 = module0244.f15784(module0137.f8955($ic15$));
                    SubLObject var70 = (SubLObject)NIL;
                    var70 = var69.first();
                    while (NIL != var69) {
                        final SubLObject var71 = module0245.f15834(var68, var70, module0137.f8955($ic15$));
                        if (NIL != var71 && var70.eql(module0244.f15780(module0137.f8955($ic15$)))) {
                            SubLObject var72;
                            for (var72 = module0066.f4838(module0067.f4891(var71)); NIL == module0066.f4841(var72); var72 = module0066.f4840(var72)) {
                                var62.resetMultipleValues();
                                final SubLObject var83 = module0066.f4839(var72);
                                final SubLObject var74 = var62.secondMultipleValue();
                                var62.resetMultipleValues();
                                SubLObject var68_98;
                                for (var68_98 = module0066.f4838(module0067.f4891(var74)); NIL == module0066.f4841(var68_98); var68_98 = module0066.f4840(var68_98)) {
                                    var62.resetMultipleValues();
                                    final SubLObject var84 = module0066.f4839(var68_98);
                                    final SubLObject var76 = var62.secondMultipleValue();
                                    var62.resetMultipleValues();
                                    if (NIL != module0141.f9279(var84)) {
                                        final SubLObject var77 = var76;
                                        if (NIL != module0077.f5302(var77)) {
                                            final SubLObject var78 = module0077.f5333(var77);
                                            SubLObject var79;
                                            SubLObject var77_99;
                                            SubLObject var85;
                                            for (var79 = module0032.f1741(var78), var77_99 = (SubLObject)NIL, var77_99 = module0032.f1742(var79, var78); NIL == module0032.f1744(var79, var77_99); var77_99 = module0032.f1743(var77_99)) {
                                                var85 = module0032.f1745(var79, var77_99);
                                                if (NIL != module0032.f1746(var77_99, var85) && NIL != module0147.f9507(var83) && NIL == Hashtables.gethash(var85, var65, (SubLObject)UNPROVIDED)) {
                                                    Hashtables.sethash(var85, var65, (SubLObject)T);
                                                    module0055.f4021(var85, var64);
                                                }
                                            }
                                        }
                                        else if (var77.isList()) {
                                            SubLObject var81 = var77;
                                            SubLObject var86 = (SubLObject)NIL;
                                            var86 = var81.first();
                                            while (NIL != var81) {
                                                if (NIL != module0147.f9507(var83) && NIL == Hashtables.gethash(var86, var65, (SubLObject)UNPROVIDED)) {
                                                    Hashtables.sethash(var86, var65, (SubLObject)T);
                                                    module0055.f4021(var86, var64);
                                                }
                                                var81 = var81.rest();
                                                var86 = var81.first();
                                            }
                                        }
                                        else {
                                            Errors.error((SubLObject)$ic14$, var77);
                                        }
                                    }
                                }
                                module0066.f4842(var68_98);
                            }
                            module0066.f4842(var72);
                        }
                        var69 = var69.rest();
                        var70 = var69.first();
                    }
                }
            }
            finally {
                module0137.$g1605$.rebind(var67, var62);
            }
            SubLObject var87 = module0248.f15995(var66);
            SubLObject var88 = (SubLObject)NIL;
            var88 = var87.first();
            while (NIL != var87) {
                SubLObject var90;
                final SubLObject var89 = var90 = var88;
                SubLObject var91 = (SubLObject)NIL;
                SubLObject var92 = (SubLObject)NIL;
                SubLObject var93 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var90, var89, (SubLObject)$ic16$);
                var91 = var90.first();
                var90 = var90.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var90, var89, (SubLObject)$ic16$);
                var92 = var90.first();
                var90 = var90.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var90, var89, (SubLObject)$ic16$);
                var93 = var90.first();
                var90 = var90.rest();
                if (NIL == var90) {
                    if (NIL != module0141.f9279(var93) && NIL != module0147.f9507(var92) && NIL == Hashtables.gethash(var91, var65, (SubLObject)UNPROVIDED)) {
                        Hashtables.sethash(var91, var65, (SubLObject)T);
                        module0055.f4021(var91, var64);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var89, (SubLObject)$ic16$);
                }
                var87 = var87.rest();
                var88 = var87.first();
            }
            return Values.values(var66, var61);
        }
        if (NIL == module0055.f4019(var64)) {
            var66 = module0055.f4023(var64);
            return Values.values(var66, var61);
        }
        return Values.values((SubLObject)NIL, var61, (SubLObject)T);
    }
    
    public static SubLObject f15198(final SubLObject var58, final SubLObject var103, SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = (SubLObject)ONE_INTEGER;
        }
        assert NIL != module0173.f10955(var58) : var58;
        assert NIL != module0173.f10955(var103) : var103;
        return module0052.f3689(f15199(var58, var103, var13), Symbols.symbol_function((SubLObject)$ic22$), Symbols.symbol_function((SubLObject)$ic23$), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f15199(final SubLObject var58, final SubLObject var103, final SubLObject var104) {
        final SubLObject var105 = module0055.f4017();
        final SubLObject var106 = Hashtables.make_hash_table((SubLObject)TEN_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0055.f4021(var58, var105);
        Hashtables.sethash(var58, var106, (SubLObject)T);
        return Vectors.vector(new SubLObject[] { var105, var106, var103, var104 });
    }
    
    public static SubLObject f15200(final SubLObject var61) {
        return module0055.f4019(Vectors.aref(var61, (SubLObject)ZERO_INTEGER));
    }
    
    public static SubLObject f15201(final SubLObject var61) {
        final SubLObject var62 = Vectors.aref(var61, (SubLObject)ZERO_INTEGER);
        final SubLObject var63 = Vectors.aref(var61, (SubLObject)ONE_INTEGER);
        final SubLObject var64 = Vectors.aref(var61, (SubLObject)TWO_INTEGER);
        final SubLObject var65 = Vectors.aref(var61, (SubLObject)THREE_INTEGER);
        final SubLObject var66 = (SubLObject)(var65.eql((SubLObject)ONE_INTEGER) ? TWO_INTEGER : ONE_INTEGER);
        SubLObject var67 = (SubLObject)NIL;
        while (NIL == module0055.f4019(var62) && NIL == var67) {
            var67 = module0055.f4023(var62);
            SubLObject var68 = (SubLObject)NIL;
            final SubLObject var69 = var64;
            if (NIL != module0158.f10010(var67, var65, var69)) {
                final SubLObject var70 = module0158.f10011(var67, var65, var69);
                SubLObject var71 = (SubLObject)NIL;
                final SubLObject var72 = (SubLObject)NIL;
                while (NIL == var71) {
                    final SubLObject var73 = module0052.f3695(var70, var72);
                    final SubLObject var74 = (SubLObject)makeBoolean(!var72.eql(var73));
                    if (NIL != var74) {
                        SubLObject var75 = (SubLObject)NIL;
                        try {
                            var75 = module0158.f10316(var73, (SubLObject)$ic6$, (SubLObject)$ic24$, (SubLObject)NIL);
                            SubLObject var23_106 = (SubLObject)NIL;
                            final SubLObject var24_107 = (SubLObject)NIL;
                            while (NIL == var23_106) {
                                final SubLObject var76 = module0052.f3695(var75, var24_107);
                                final SubLObject var26_109 = (SubLObject)makeBoolean(!var24_107.eql(var76));
                                if (NIL != var26_109) {
                                    var68 = module0178.f11331(var76, var66);
                                    if (NIL == Hashtables.gethash(var68, var63, (SubLObject)UNPROVIDED)) {
                                        Hashtables.sethash(var68, var63, (SubLObject)T);
                                        module0055.f4021(var68, var62);
                                    }
                                }
                                var23_106 = (SubLObject)makeBoolean(NIL == var26_109);
                            }
                        }
                        finally {
                            final SubLObject var77 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                if (NIL != var75) {
                                    module0158.f10319(var75);
                                }
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var77);
                            }
                        }
                    }
                    var71 = (SubLObject)makeBoolean(NIL == var74);
                }
            }
        }
        return Values.values(var67, var61, (SubLObject)NIL);
    }
    
    public static SubLObject f15202() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0227", "f15177", "S#17933", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0227", "f15178", "S#17934", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0227", "f15179", "S#17935", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0227", "f15180", "S#17936", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0227", "f15181", "S#17937", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0227", "f15182", "S#17938", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0227", "f15183", "S#17939", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0227", "f15184", "S#17940", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0227", "f15185", "S#17941", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0227", "f15186", "S#17942", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0227", "f15187", "S#17943", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0227", "f15188", "S#17944", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0227", "f15189", "S#17945", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0227", "f15190", "S#17946", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0227", "f15191", "S#17947", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0227", "f15192", "S#17948", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0227", "f15193", "S#17949", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0227", "f15194", "S#17950", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0227", "f15195", "S#17951", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0227", "f15196", "S#17952", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0227", "f15197", "S#17953", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0227", "f15198", "S#17954", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0227", "f15199", "S#17955", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0227", "f15200", "S#17956", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0227", "f15201", "S#17957", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15203() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f15204() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f15202();
    }
    
    public void initializeVariables() {
        f15203();
    }
    
    public void runTopLevelForms() {
        f15204();
    }
    
    static {
        me = (SubLFile)new module0227();
        $ic0$ = makeKeyword("INDEX-TYPE");
        $ic1$ = makeKeyword("GAF-ARG");
        $ic2$ = makeKeyword("TERM");
        $ic3$ = makeKeyword("ARGNUM");
        $ic4$ = makeKeyword("PREDICATE");
        $ic5$ = makeKeyword("PREDICATE-EXTENT");
        $ic6$ = makeKeyword("GAF");
        $ic7$ = makeKeyword("OVERLAP");
        $ic8$ = makeSymbol("FORT-P");
        $ic9$ = makeSymbol("S#17943", "CYC");
        $ic10$ = makeSymbol("S#17944", "CYC");
        $ic11$ = makeInteger(100);
        $ic12$ = ConsesLow.list((SubLObject)makeSymbol("S#17958", "CYC"), (SubLObject)makeSymbol("S#17959", "CYC"));
        $ic13$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic14$ = makeString("~A is neither SET-P nor LISTP.");
        $ic15$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic16$ = ConsesLow.list((SubLObject)makeSymbol("S#10388", "CYC"), (SubLObject)makeUninternedSymbol("US#346C856"), (SubLObject)makeUninternedSymbol("US#34E0056"));
        $ic17$ = makeSymbol("S#17948", "CYC");
        $ic18$ = makeSymbol("S#17949", "CYC");
        $ic19$ = ConsesLow.list((SubLObject)makeSymbol("S#17960", "CYC"), (SubLObject)makeSymbol("S#17961", "CYC"), (SubLObject)makeSymbol("S#17959", "CYC"));
        $ic20$ = makeSymbol("S#17952", "CYC");
        $ic21$ = makeSymbol("S#17953", "CYC");
        $ic22$ = makeSymbol("S#17956", "CYC");
        $ic23$ = makeSymbol("S#17957", "CYC");
        $ic24$ = makeKeyword("TRUE");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 539 ms
	
	Decompiled with Procyon 0.5.32.
*/