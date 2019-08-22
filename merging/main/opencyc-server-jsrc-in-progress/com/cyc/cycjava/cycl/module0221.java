package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0221 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0221";
    public static final String myFingerPrint = "4991f980f0679868b49fd1b6e5e2a893962cd62fea598ccc50ae3e3ba22a7c1d";
    public static SubLSymbol $g2399$;
    private static final SubLList $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLObject $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLList $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLList $ic39$;
    private static final SubLList $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLList $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLList $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    
    public static SubLObject f14608(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic0$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12_13 = (SubLObject)NIL;
        while (NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic0$);
            var12_13 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)$ic0$);
            if (NIL == conses_high.member(var12_13, (SubLObject)$ic1$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var11 = (SubLObject)T;
            }
            if (var12_13 == $ic2$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (NIL != var11 && NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic0$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic3$, var4);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)$ic4$, var4);
        final SubLObject var15 = (SubLObject)((NIL != var14) ? conses_high.cadr(var14) : NIL);
        final SubLObject var16;
        var4 = (var16 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)$ic5$, (SubLObject)ConsesLow.list((SubLObject)$ic6$, var8, (SubLObject)ConsesLow.listS((SubLObject)$ic7$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)$ic3$, var13, (SubLObject)$ic8$, (SubLObject)$ic9$, (SubLObject)$ic4$, var15), ConsesLow.append(var16, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)$ic10$, (SubLObject)ConsesLow.list((SubLObject)$ic11$, var8), (SubLObject)ConsesLow.list((SubLObject)$ic12$, var8, (SubLObject)ConsesLow.list((SubLObject)$ic7$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)$ic3$, (SubLObject)ConsesLow.list((SubLObject)$ic13$, var13), (SubLObject)$ic8$, (SubLObject)$ic9$, (SubLObject)$ic4$, var15), (SubLObject)ConsesLow.listS((SubLObject)$ic14$, (SubLObject)$ic15$, ConsesLow.append(var16, (SubLObject)NIL))))));
    }
    
    public static SubLObject f14609(final SubLObject var8) {
        return module0225.f14781(var8);
    }
    
    public static SubLObject f14610(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic17$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic17$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic17$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic17$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic17$);
        var9 = var4.first();
        var4 = var4.rest();
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = var4;
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var26_27 = (SubLObject)NIL;
        while (NIL != var11) {
            cdestructuring_bind.destructuring_bind_must_consp(var11, var3, (SubLObject)$ic17$);
            var26_27 = var11.first();
            var11 = var11.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var11, var3, (SubLObject)$ic17$);
            if (NIL == conses_high.member(var26_27, (SubLObject)$ic1$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var12 = (SubLObject)T;
            }
            if (var26_27 == $ic2$) {
                var10 = var11.first();
            }
            var11 = var11.rest();
        }
        if (NIL != var12 && NIL == var10) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic17$);
        }
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic3$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)$ic4$, var4);
        final SubLObject var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : NIL);
        final SubLObject var17;
        var4 = (var17 = var5);
        final SubLObject var18 = (SubLObject)$ic18$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic16$, (SubLObject)ConsesLow.list(var18, var7, var9, (SubLObject)$ic3$, var14, (SubLObject)$ic4$, var16), (SubLObject)ConsesLow.listS((SubLObject)$ic14$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic19$, var18, var8))), ConsesLow.append(var17, (SubLObject)NIL)));
    }
    
    public static SubLObject f14611(final SubLObject var30, final SubLObject var22) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        return module0178.f11331(var30, (NIL != $g2399$.getDynamicValue(var31)) ? module0225.f14782(var22) : var22);
    }
    
    public static SubLObject f14612(final SubLObject var32, final SubLObject var7, final SubLObject var33, final SubLObject var8) {
        final SubLThread var34 = SubLProcess.currentSubLThread();
        SubLObject var35 = (SubLObject)NIL;
        try {
            var34.throwStack.push($ic21$);
            SubLObject var36 = module0148.$g2099$.currentBinding(var34);
            SubLObject var37 = module0148.$g2097$.currentBinding(var34);
            try {
                module0148.$g2099$.bind((SubLObject)$ic22$, var34);
                module0148.$g2097$.bind(var8, var34);
                final SubLObject var38 = (SubLObject)NIL;
                if (NIL != module0158.f10010(var7, var33, var38)) {
                    final SubLObject var39 = module0158.f10011(var7, var33, var38);
                    SubLObject var40 = (SubLObject)NIL;
                    final SubLObject var41 = (SubLObject)NIL;
                    while (NIL == var40) {
                        final SubLObject var42 = module0052.f3695(var39, var41);
                        final SubLObject var43 = (SubLObject)makeBoolean(!var41.eql(var42));
                        if (NIL != var43) {
                            SubLObject var44 = (SubLObject)NIL;
                            try {
                                var44 = module0158.f10316(var42, (SubLObject)$ic23$, (SubLObject)$ic9$, (SubLObject)NIL);
                                SubLObject var39_44 = (SubLObject)NIL;
                                final SubLObject var40_45 = (SubLObject)NIL;
                                while (NIL == var39_44) {
                                    final SubLObject var45 = module0052.f3695(var44, var40_45);
                                    final SubLObject var42_46 = (SubLObject)makeBoolean(!var40_45.eql(var45));
                                    if (NIL != var42_46) {
                                        Functions.funcall(var32, var45);
                                    }
                                    var39_44 = (SubLObject)makeBoolean(NIL == var42_46);
                                }
                            }
                            finally {
                                final SubLObject var35_47 = Threads.$is_thread_performing_cleanupP$.currentBinding(var34);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var34);
                                    if (NIL != var44) {
                                        module0158.f10319(var44);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var35_47, var34);
                                }
                            }
                        }
                        var40 = (SubLObject)makeBoolean(NIL == var43);
                    }
                }
            }
            finally {
                module0148.$g2097$.rebind(var37, var34);
                module0148.$g2099$.rebind(var36, var34);
            }
            if (NIL != f14609(var8)) {
                var36 = module0148.$g2099$.currentBinding(var34);
                var37 = module0148.$g2097$.currentBinding(var34);
                try {
                    module0148.$g2099$.bind((SubLObject)$ic24$, var34);
                    module0148.$g2097$.bind(var8, var34);
                    final SubLObject var38 = (SubLObject)NIL;
                    if (NIL != module0158.f10010(var7, module0225.f14782(var33), var38)) {
                        final SubLObject var39 = module0158.f10011(var7, module0225.f14782(var33), var38);
                        SubLObject var40 = (SubLObject)NIL;
                        final SubLObject var41 = (SubLObject)NIL;
                        while (NIL == var40) {
                            final SubLObject var42 = module0052.f3695(var39, var41);
                            final SubLObject var43 = (SubLObject)makeBoolean(!var41.eql(var42));
                            if (NIL != var43) {
                                SubLObject var44 = (SubLObject)NIL;
                                try {
                                    var44 = module0158.f10316(var42, (SubLObject)$ic23$, (SubLObject)$ic9$, (SubLObject)NIL);
                                    SubLObject var39_45 = (SubLObject)NIL;
                                    final SubLObject var40_46 = (SubLObject)NIL;
                                    while (NIL == var39_45) {
                                        final SubLObject var45 = module0052.f3695(var44, var40_46);
                                        final SubLObject var42_47 = (SubLObject)makeBoolean(!var40_46.eql(var45));
                                        if (NIL != var42_47) {
                                            final SubLObject var35_48 = $g2399$.currentBinding(var34);
                                            try {
                                                $g2399$.bind((SubLObject)makeBoolean(NIL == $g2399$.getDynamicValue(var34)), var34);
                                                Functions.funcall(var32, var45);
                                            }
                                            finally {
                                                $g2399$.rebind(var35_48, var34);
                                            }
                                        }
                                        var39_45 = (SubLObject)makeBoolean(NIL == var42_47);
                                    }
                                }
                                finally {
                                    final SubLObject var35_49 = Threads.$is_thread_performing_cleanupP$.currentBinding(var34);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var34);
                                        if (NIL != var44) {
                                            module0158.f10319(var44);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var35_49, var34);
                                    }
                                }
                            }
                            var40 = (SubLObject)makeBoolean(NIL == var43);
                        }
                    }
                }
                finally {
                    module0148.$g2097$.rebind(var37, var34);
                    module0148.$g2099$.rebind(var36, var34);
                }
            }
        }
        catch (Throwable var46) {
            var35 = Errors.handleThrowable(var46, (SubLObject)$ic21$);
        }
        finally {
            var34.throwStack.pop();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14613(final SubLObject var7, final SubLObject var33, final SubLObject var8, SubLObject var54) {
        if (var54 == UNPROVIDED) {
            var54 = (SubLObject)NIL;
        }
        final SubLThread var55 = SubLProcess.currentSubLThread();
        SubLObject var56 = (SubLObject)NIL;
        if (NIL == var54) {
            final SubLObject var57 = module0147.$g2094$.currentBinding(var55);
            final SubLObject var58 = module0147.$g2095$.currentBinding(var55);
            try {
                module0147.$g2094$.bind((SubLObject)$ic25$, var55);
                module0147.$g2095$.bind($ic26$, var55);
                final SubLObject var35_56 = module0148.$g2099$.currentBinding(var55);
                final SubLObject var36_57 = module0148.$g2097$.currentBinding(var55);
                try {
                    module0148.$g2099$.bind((SubLObject)$ic22$, var55);
                    module0148.$g2097$.bind(var8, var55);
                    final SubLObject var59 = (SubLObject)NIL;
                    if (NIL != module0158.f10010(var7, var33, var59)) {
                        final SubLObject var60 = module0158.f10011(var7, var33, var59);
                        SubLObject var61 = (SubLObject)NIL;
                        final SubLObject var62 = (SubLObject)NIL;
                        while (NIL == var61) {
                            final SubLObject var63 = module0052.f3695(var60, var62);
                            final SubLObject var64 = (SubLObject)makeBoolean(!var62.eql(var63));
                            if (NIL != var64) {
                                SubLObject var65 = (SubLObject)NIL;
                                try {
                                    var65 = module0158.f10316(var63, (SubLObject)$ic23$, (SubLObject)$ic9$, (SubLObject)NIL);
                                    SubLObject var39_58 = (SubLObject)NIL;
                                    final SubLObject var40_59 = (SubLObject)NIL;
                                    while (NIL == var39_58) {
                                        final SubLObject var66 = module0052.f3695(var65, var40_59);
                                        final SubLObject var42_60 = (SubLObject)makeBoolean(!var40_59.eql(var66));
                                        if (NIL != var42_60) {
                                            var56 = (SubLObject)ConsesLow.cons(var66, var56);
                                        }
                                        var39_58 = (SubLObject)makeBoolean(NIL == var42_60);
                                    }
                                }
                                finally {
                                    final SubLObject var35_57 = Threads.$is_thread_performing_cleanupP$.currentBinding(var55);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var55);
                                        if (NIL != var65) {
                                            module0158.f10319(var65);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var35_57, var55);
                                    }
                                }
                            }
                            var61 = (SubLObject)makeBoolean(NIL == var64);
                        }
                    }
                }
                finally {
                    module0148.$g2097$.rebind(var36_57, var55);
                    module0148.$g2099$.rebind(var35_56, var55);
                }
                if (NIL != f14609(var8)) {
                    final SubLObject var35_58 = module0148.$g2099$.currentBinding(var55);
                    final SubLObject var36_58 = module0148.$g2097$.currentBinding(var55);
                    try {
                        module0148.$g2099$.bind((SubLObject)$ic24$, var55);
                        module0148.$g2097$.bind(var8, var55);
                        final SubLObject var59 = (SubLObject)NIL;
                        if (NIL != module0158.f10010(var7, module0225.f14782(var33), var59)) {
                            final SubLObject var60 = module0158.f10011(var7, module0225.f14782(var33), var59);
                            SubLObject var61 = (SubLObject)NIL;
                            final SubLObject var62 = (SubLObject)NIL;
                            while (NIL == var61) {
                                final SubLObject var63 = module0052.f3695(var60, var62);
                                final SubLObject var64 = (SubLObject)makeBoolean(!var62.eql(var63));
                                if (NIL != var64) {
                                    SubLObject var65 = (SubLObject)NIL;
                                    try {
                                        var65 = module0158.f10316(var63, (SubLObject)$ic23$, (SubLObject)$ic9$, (SubLObject)NIL);
                                        SubLObject var39_59 = (SubLObject)NIL;
                                        final SubLObject var40_60 = (SubLObject)NIL;
                                        while (NIL == var39_59) {
                                            final SubLObject var66 = module0052.f3695(var65, var40_60);
                                            final SubLObject var42_61 = (SubLObject)makeBoolean(!var40_60.eql(var66));
                                            if (NIL != var42_61) {
                                                final SubLObject var35_59 = $g2399$.currentBinding(var55);
                                                try {
                                                    $g2399$.bind((SubLObject)makeBoolean(NIL == $g2399$.getDynamicValue(var55)), var55);
                                                    var56 = (SubLObject)ConsesLow.cons(var66, var56);
                                                }
                                                finally {
                                                    $g2399$.rebind(var35_59, var55);
                                                }
                                            }
                                            var39_59 = (SubLObject)makeBoolean(NIL == var42_61);
                                        }
                                    }
                                    finally {
                                        final SubLObject var35_60 = Threads.$is_thread_performing_cleanupP$.currentBinding(var55);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var55);
                                            if (NIL != var65) {
                                                module0158.f10319(var65);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var35_60, var55);
                                        }
                                    }
                                }
                                var61 = (SubLObject)makeBoolean(NIL == var64);
                            }
                        }
                    }
                    finally {
                        module0148.$g2097$.rebind(var36_58, var55);
                        module0148.$g2099$.rebind(var35_58, var55);
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var58, var55);
                module0147.$g2094$.rebind(var57, var55);
            }
        }
        else {
            final SubLObject var57 = module0147.$g2094$.currentBinding(var55);
            final SubLObject var58 = module0147.$g2095$.currentBinding(var55);
            try {
                module0147.$g2094$.bind((SubLObject)$ic27$, var55);
                module0147.$g2095$.bind(var54, var55);
                final SubLObject var35_61 = module0148.$g2099$.currentBinding(var55);
                final SubLObject var36_59 = module0148.$g2097$.currentBinding(var55);
                try {
                    module0148.$g2099$.bind((SubLObject)$ic22$, var55);
                    module0148.$g2097$.bind(var8, var55);
                    final SubLObject var59 = (SubLObject)NIL;
                    if (NIL != module0158.f10010(var7, var33, var59)) {
                        final SubLObject var60 = module0158.f10011(var7, var33, var59);
                        SubLObject var61 = (SubLObject)NIL;
                        final SubLObject var62 = (SubLObject)NIL;
                        while (NIL == var61) {
                            final SubLObject var63 = module0052.f3695(var60, var62);
                            final SubLObject var64 = (SubLObject)makeBoolean(!var62.eql(var63));
                            if (NIL != var64) {
                                SubLObject var65 = (SubLObject)NIL;
                                try {
                                    var65 = module0158.f10316(var63, (SubLObject)$ic23$, (SubLObject)$ic9$, (SubLObject)NIL);
                                    SubLObject var39_60 = (SubLObject)NIL;
                                    final SubLObject var40_61 = (SubLObject)NIL;
                                    while (NIL == var39_60) {
                                        final SubLObject var66 = module0052.f3695(var65, var40_61);
                                        final SubLObject var42_62 = (SubLObject)makeBoolean(!var40_61.eql(var66));
                                        if (NIL != var42_62) {
                                            var56 = (SubLObject)ConsesLow.cons(var66, var56);
                                        }
                                        var39_60 = (SubLObject)makeBoolean(NIL == var42_62);
                                    }
                                }
                                finally {
                                    final SubLObject var35_62 = Threads.$is_thread_performing_cleanupP$.currentBinding(var55);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var55);
                                        if (NIL != var65) {
                                            module0158.f10319(var65);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var35_62, var55);
                                    }
                                }
                            }
                            var61 = (SubLObject)makeBoolean(NIL == var64);
                        }
                    }
                }
                finally {
                    module0148.$g2097$.rebind(var36_59, var55);
                    module0148.$g2099$.rebind(var35_61, var55);
                }
                if (NIL != f14609(var8)) {
                    final SubLObject var35_63 = module0148.$g2099$.currentBinding(var55);
                    final SubLObject var36_60 = module0148.$g2097$.currentBinding(var55);
                    try {
                        module0148.$g2099$.bind((SubLObject)$ic24$, var55);
                        module0148.$g2097$.bind(var8, var55);
                        final SubLObject var59 = (SubLObject)NIL;
                        if (NIL != module0158.f10010(var7, module0225.f14782(var33), var59)) {
                            final SubLObject var60 = module0158.f10011(var7, module0225.f14782(var33), var59);
                            SubLObject var61 = (SubLObject)NIL;
                            final SubLObject var62 = (SubLObject)NIL;
                            while (NIL == var61) {
                                final SubLObject var63 = module0052.f3695(var60, var62);
                                final SubLObject var64 = (SubLObject)makeBoolean(!var62.eql(var63));
                                if (NIL != var64) {
                                    SubLObject var65 = (SubLObject)NIL;
                                    try {
                                        var65 = module0158.f10316(var63, (SubLObject)$ic23$, (SubLObject)$ic9$, (SubLObject)NIL);
                                        SubLObject var39_61 = (SubLObject)NIL;
                                        final SubLObject var40_62 = (SubLObject)NIL;
                                        while (NIL == var39_61) {
                                            final SubLObject var66 = module0052.f3695(var65, var40_62);
                                            final SubLObject var42_63 = (SubLObject)makeBoolean(!var40_62.eql(var66));
                                            if (NIL != var42_63) {
                                                final SubLObject var35_64 = $g2399$.currentBinding(var55);
                                                try {
                                                    $g2399$.bind((SubLObject)makeBoolean(NIL == $g2399$.getDynamicValue(var55)), var55);
                                                    var56 = (SubLObject)ConsesLow.cons(var66, var56);
                                                }
                                                finally {
                                                    $g2399$.rebind(var35_64, var55);
                                                }
                                            }
                                            var39_61 = (SubLObject)makeBoolean(NIL == var42_63);
                                        }
                                    }
                                    finally {
                                        final SubLObject var35_65 = Threads.$is_thread_performing_cleanupP$.currentBinding(var55);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var55);
                                            if (NIL != var65) {
                                                module0158.f10319(var65);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var35_65, var55);
                                        }
                                    }
                                }
                                var61 = (SubLObject)makeBoolean(NIL == var64);
                            }
                        }
                    }
                    finally {
                        module0148.$g2097$.rebind(var36_60, var55);
                        module0148.$g2099$.rebind(var35_63, var55);
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var58, var55);
                module0147.$g2094$.rebind(var57, var55);
            }
        }
        return var56;
    }
    
    public static SubLObject f14614(final SubLObject var7, final SubLObject var82, SubLObject var83, SubLObject var84) {
        if (var83 == UNPROVIDED) {
            var83 = (SubLObject)ONE_INTEGER;
        }
        if (var84 == UNPROVIDED) {
            var84 = (SubLObject)TWO_INTEGER;
        }
        final SubLThread var85 = SubLProcess.currentSubLThread();
        assert NIL != module0212.f13762(var7) : var7;
        assert NIL != module0173.f10955(var82) : var82;
        assert NIL != Types.integerp(var83) : var83;
        assert NIL != Types.integerp(var84) : var84;
        SubLObject var86 = (SubLObject)NIL;
        SubLObject var87 = (SubLObject)NIL;
        SubLObject var88 = module0148.$g2099$.currentBinding(var85);
        SubLObject var89 = module0148.$g2097$.currentBinding(var85);
        try {
            module0148.$g2099$.bind((SubLObject)$ic22$, var85);
            module0148.$g2097$.bind(var82, var85);
            final SubLObject var90 = (SubLObject)NIL;
            if (NIL != module0158.f10010(var7, var83, var90)) {
                final SubLObject var91 = module0158.f10011(var7, var83, var90);
                SubLObject var92 = var86;
                final SubLObject var93 = (SubLObject)NIL;
                while (NIL == var92) {
                    final SubLObject var94 = module0052.f3695(var91, var93);
                    final SubLObject var95 = (SubLObject)makeBoolean(!var93.eql(var94));
                    if (NIL != var95) {
                        SubLObject var96 = (SubLObject)NIL;
                        try {
                            var96 = module0158.f10316(var94, (SubLObject)$ic23$, (SubLObject)$ic9$, (SubLObject)NIL);
                            SubLObject var39_85 = var86;
                            final SubLObject var40_86 = (SubLObject)NIL;
                            while (NIL == var39_85) {
                                final SubLObject var97 = module0052.f3695(var96, var40_86);
                                final SubLObject var42_88 = (SubLObject)makeBoolean(!var40_86.eql(var97));
                                if (NIL != var42_88) {
                                    final SubLObject var98 = var87 = f14611(var97, var84);
                                    var86 = (SubLObject)T;
                                }
                                var39_85 = (SubLObject)makeBoolean(NIL == var42_88 || NIL != var86);
                            }
                        }
                        finally {
                            final SubLObject var35_90 = Threads.$is_thread_performing_cleanupP$.currentBinding(var85);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var85);
                                if (NIL != var96) {
                                    module0158.f10319(var96);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var35_90, var85);
                            }
                        }
                    }
                    var92 = (SubLObject)makeBoolean(NIL == var95 || NIL != var86);
                }
            }
        }
        finally {
            module0148.$g2097$.rebind(var89, var85);
            module0148.$g2099$.rebind(var88, var85);
        }
        if (NIL != f14609(var82)) {
            var88 = module0148.$g2099$.currentBinding(var85);
            var89 = module0148.$g2097$.currentBinding(var85);
            try {
                module0148.$g2099$.bind((SubLObject)$ic24$, var85);
                module0148.$g2097$.bind(var82, var85);
                final SubLObject var90 = (SubLObject)NIL;
                if (NIL != module0158.f10010(var7, module0225.f14782(var83), var90)) {
                    final SubLObject var91 = module0158.f10011(var7, module0225.f14782(var83), var90);
                    SubLObject var92 = var86;
                    final SubLObject var93 = (SubLObject)NIL;
                    while (NIL == var92) {
                        final SubLObject var94 = module0052.f3695(var91, var93);
                        final SubLObject var95 = (SubLObject)makeBoolean(!var93.eql(var94));
                        if (NIL != var95) {
                            SubLObject var96 = (SubLObject)NIL;
                            try {
                                var96 = module0158.f10316(var94, (SubLObject)$ic23$, (SubLObject)$ic9$, (SubLObject)NIL);
                                SubLObject var39_86 = var86;
                                final SubLObject var40_87 = (SubLObject)NIL;
                                while (NIL == var39_86) {
                                    final SubLObject var97 = module0052.f3695(var96, var40_87);
                                    final SubLObject var42_89 = (SubLObject)makeBoolean(!var40_87.eql(var97));
                                    if (NIL != var42_89) {
                                        final SubLObject var35_91 = $g2399$.currentBinding(var85);
                                        try {
                                            $g2399$.bind((SubLObject)makeBoolean(NIL == $g2399$.getDynamicValue(var85)), var85);
                                            final SubLObject var99 = var87 = f14611(var97, var84);
                                            var86 = (SubLObject)T;
                                        }
                                        finally {
                                            $g2399$.rebind(var35_91, var85);
                                        }
                                    }
                                    var39_86 = (SubLObject)makeBoolean(NIL == var42_89 || NIL != var86);
                                }
                            }
                            finally {
                                final SubLObject var35_92 = Threads.$is_thread_performing_cleanupP$.currentBinding(var85);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var85);
                                    if (NIL != var96) {
                                        module0158.f10319(var96);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var35_92, var85);
                                }
                            }
                        }
                        var92 = (SubLObject)makeBoolean(NIL == var95 || NIL != var86);
                    }
                }
            }
            finally {
                module0148.$g2097$.rebind(var89, var85);
                module0148.$g2099$.rebind(var88, var85);
            }
        }
        return var87;
    }
    
    public static SubLObject f14615(final SubLObject var7, final SubLObject var82, final SubLObject var54, SubLObject var83, SubLObject var84) {
        if (var83 == UNPROVIDED) {
            var83 = (SubLObject)ONE_INTEGER;
        }
        if (var84 == UNPROVIDED) {
            var84 = (SubLObject)TWO_INTEGER;
        }
        final SubLThread var85 = SubLProcess.currentSubLThread();
        assert NIL != module0161.f10481(var54) : var54;
        SubLObject var86 = (SubLObject)NIL;
        final SubLObject var87 = module0147.$g2094$.currentBinding(var85);
        final SubLObject var88 = module0147.$g2095$.currentBinding(var85);
        try {
            module0147.$g2094$.bind((SubLObject)$ic32$, var85);
            module0147.$g2095$.bind(var54, var85);
            var86 = f14614(var7, var82, var83, var84);
        }
        finally {
            module0147.$g2095$.rebind(var88, var85);
            module0147.$g2094$.rebind(var87, var85);
        }
        return var86;
    }
    
    public static SubLObject f14616(final SubLObject var7, final SubLObject var82, final SubLObject var97, SubLObject var83, SubLObject var84) {
        if (var83 == UNPROVIDED) {
            var83 = (SubLObject)ONE_INTEGER;
        }
        if (var84 == UNPROVIDED) {
            var84 = (SubLObject)TWO_INTEGER;
        }
        final SubLThread var98 = SubLProcess.currentSubLThread();
        assert NIL != Types.listp(var97) : var97;
        SubLObject var99 = (SubLObject)NIL;
        final SubLObject var100 = module0147.$g2094$.currentBinding(var98);
        final SubLObject var101 = module0147.$g2096$.currentBinding(var98);
        try {
            module0147.$g2094$.bind((SubLObject)$ic34$, var98);
            module0147.$g2096$.bind(var97, var98);
            var99 = f14614(var7, var82, var83, var84);
        }
        finally {
            module0147.$g2096$.rebind(var101, var98);
            module0147.$g2094$.rebind(var100, var98);
        }
        return var99;
    }
    
    public static SubLObject f14617(final SubLObject var7, final SubLObject var82, SubLObject var83, SubLObject var84) {
        if (var83 == UNPROVIDED) {
            var83 = (SubLObject)ONE_INTEGER;
        }
        if (var84 == UNPROVIDED) {
            var84 = (SubLObject)TWO_INTEGER;
        }
        final SubLThread var85 = SubLProcess.currentSubLThread();
        SubLObject var86 = (SubLObject)NIL;
        final SubLObject var87 = module0147.$g2094$.currentBinding(var85);
        final SubLObject var88 = module0147.$g2095$.currentBinding(var85);
        try {
            module0147.$g2094$.bind((SubLObject)$ic25$, var85);
            module0147.$g2095$.bind($ic26$, var85);
            var86 = f14614(var7, var82, var83, var84);
        }
        finally {
            module0147.$g2095$.rebind(var88, var85);
            module0147.$g2094$.rebind(var87, var85);
        }
        return var86;
    }
    
    public static SubLObject f14618(final SubLObject var7, final SubLObject var82, SubLObject var54, SubLObject var83, SubLObject var84) {
        if (var54 == UNPROVIDED) {
            var54 = (SubLObject)NIL;
        }
        if (var83 == UNPROVIDED) {
            var83 = (SubLObject)ONE_INTEGER;
        }
        if (var84 == UNPROVIDED) {
            var84 = (SubLObject)TWO_INTEGER;
        }
        final SubLThread var85 = SubLProcess.currentSubLThread();
        SubLObject var86 = (SubLObject)NIL;
        final SubLObject var87 = var54;
        final SubLObject var88 = module0147.$g2094$.currentBinding(var85);
        final SubLObject var89 = module0147.$g2095$.currentBinding(var85);
        try {
            module0147.$g2094$.bind(module0147.f9531(var87), var85);
            module0147.$g2095$.bind(module0147.f9534(var87), var85);
            var86 = f14614(var7, var82, var83, var84);
        }
        finally {
            module0147.$g2095$.rebind(var89, var85);
            module0147.$g2094$.rebind(var88, var85);
        }
        return var86;
    }
    
    public static SubLObject f14619(final SubLObject var7, final SubLObject var82, SubLObject var83, SubLObject var84) {
        if (var83 == UNPROVIDED) {
            var83 = (SubLObject)ONE_INTEGER;
        }
        if (var84 == UNPROVIDED) {
            var84 = (SubLObject)TWO_INTEGER;
        }
        final SubLThread var85 = SubLProcess.currentSubLThread();
        assert NIL != module0212.f13762(var7) : var7;
        assert NIL != module0173.f10955(var82) : var82;
        assert NIL != Types.integerp(var83) : var83;
        assert NIL != Types.integerp(var84) : var84;
        SubLObject var86 = (SubLObject)NIL;
        SubLObject var87 = module0148.$g2099$.currentBinding(var85);
        SubLObject var88 = module0148.$g2097$.currentBinding(var85);
        try {
            module0148.$g2099$.bind((SubLObject)$ic22$, var85);
            module0148.$g2097$.bind(var82, var85);
            final SubLObject var89 = (SubLObject)NIL;
            if (NIL != module0158.f10010(var7, var83, var89)) {
                final SubLObject var90 = module0158.f10011(var7, var83, var89);
                SubLObject var91 = (SubLObject)NIL;
                final SubLObject var92 = (SubLObject)NIL;
                while (NIL == var91) {
                    final SubLObject var93 = module0052.f3695(var90, var92);
                    final SubLObject var94 = (SubLObject)makeBoolean(!var92.eql(var93));
                    if (NIL != var94) {
                        SubLObject var95 = (SubLObject)NIL;
                        try {
                            var95 = module0158.f10316(var93, (SubLObject)$ic23$, (SubLObject)$ic9$, (SubLObject)NIL);
                            SubLObject var39_99 = (SubLObject)NIL;
                            final SubLObject var40_100 = (SubLObject)NIL;
                            while (NIL == var39_99) {
                                final SubLObject var96 = module0052.f3695(var95, var40_100);
                                final SubLObject var42_101 = (SubLObject)makeBoolean(!var40_100.eql(var96));
                                if (NIL != var42_101) {
                                    final SubLObject var97 = f14611(var96, var84);
                                    if (NIL != module0018.$g593$.getDynamicValue(var85)) {
                                        final SubLObject var98 = var97;
                                        if (NIL == conses_high.member(var98, var86, module0018.$g593$.getDynamicValue(var85), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                            var86 = (SubLObject)ConsesLow.cons(var98, var86);
                                        }
                                    }
                                    else {
                                        var86 = (SubLObject)ConsesLow.cons(var97, var86);
                                    }
                                }
                                var39_99 = (SubLObject)makeBoolean(NIL == var42_101);
                            }
                        }
                        finally {
                            final SubLObject var35_103 = Threads.$is_thread_performing_cleanupP$.currentBinding(var85);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var85);
                                if (NIL != var95) {
                                    module0158.f10319(var95);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var35_103, var85);
                            }
                        }
                    }
                    var91 = (SubLObject)makeBoolean(NIL == var94);
                }
            }
        }
        finally {
            module0148.$g2097$.rebind(var88, var85);
            module0148.$g2099$.rebind(var87, var85);
        }
        if (NIL != f14609(var82)) {
            var87 = module0148.$g2099$.currentBinding(var85);
            var88 = module0148.$g2097$.currentBinding(var85);
            try {
                module0148.$g2099$.bind((SubLObject)$ic24$, var85);
                module0148.$g2097$.bind(var82, var85);
                final SubLObject var89 = (SubLObject)NIL;
                if (NIL != module0158.f10010(var7, module0225.f14782(var83), var89)) {
                    final SubLObject var90 = module0158.f10011(var7, module0225.f14782(var83), var89);
                    SubLObject var91 = (SubLObject)NIL;
                    final SubLObject var92 = (SubLObject)NIL;
                    while (NIL == var91) {
                        final SubLObject var93 = module0052.f3695(var90, var92);
                        final SubLObject var94 = (SubLObject)makeBoolean(!var92.eql(var93));
                        if (NIL != var94) {
                            SubLObject var95 = (SubLObject)NIL;
                            try {
                                var95 = module0158.f10316(var93, (SubLObject)$ic23$, (SubLObject)$ic9$, (SubLObject)NIL);
                                SubLObject var39_100 = (SubLObject)NIL;
                                final SubLObject var40_101 = (SubLObject)NIL;
                                while (NIL == var39_100) {
                                    final SubLObject var96 = module0052.f3695(var95, var40_101);
                                    final SubLObject var42_102 = (SubLObject)makeBoolean(!var40_101.eql(var96));
                                    if (NIL != var42_102) {
                                        final SubLObject var35_104 = $g2399$.currentBinding(var85);
                                        try {
                                            $g2399$.bind((SubLObject)makeBoolean(NIL == $g2399$.getDynamicValue(var85)), var85);
                                            final SubLObject var99 = f14611(var96, var84);
                                            if (NIL != module0018.$g593$.getDynamicValue(var85)) {
                                                final SubLObject var100 = var99;
                                                if (NIL == conses_high.member(var100, var86, module0018.$g593$.getDynamicValue(var85), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                                    var86 = (SubLObject)ConsesLow.cons(var100, var86);
                                                }
                                            }
                                            else {
                                                var86 = (SubLObject)ConsesLow.cons(var99, var86);
                                            }
                                        }
                                        finally {
                                            $g2399$.rebind(var35_104, var85);
                                        }
                                    }
                                    var39_100 = (SubLObject)makeBoolean(NIL == var42_102);
                                }
                            }
                            finally {
                                final SubLObject var35_105 = Threads.$is_thread_performing_cleanupP$.currentBinding(var85);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var85);
                                    if (NIL != var95) {
                                        module0158.f10319(var95);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var35_105, var85);
                                }
                            }
                        }
                        var91 = (SubLObject)makeBoolean(NIL == var94);
                    }
                }
            }
            finally {
                module0148.$g2097$.rebind(var88, var85);
                module0148.$g2099$.rebind(var87, var85);
            }
        }
        return var86;
    }
    
    public static SubLObject f14620(final SubLObject var7, final SubLObject var82, final SubLObject var54, SubLObject var83, SubLObject var84) {
        if (var83 == UNPROVIDED) {
            var83 = (SubLObject)ONE_INTEGER;
        }
        if (var84 == UNPROVIDED) {
            var84 = (SubLObject)TWO_INTEGER;
        }
        final SubLThread var85 = SubLProcess.currentSubLThread();
        assert NIL != module0161.f10481(var54) : var54;
        SubLObject var86 = (SubLObject)NIL;
        final SubLObject var87 = module0147.$g2094$.currentBinding(var85);
        final SubLObject var88 = module0147.$g2095$.currentBinding(var85);
        try {
            module0147.$g2094$.bind((SubLObject)$ic32$, var85);
            module0147.$g2095$.bind(var54, var85);
            var86 = f14619(var7, var82, var83, var84);
        }
        finally {
            module0147.$g2095$.rebind(var88, var85);
            module0147.$g2094$.rebind(var87, var85);
        }
        return var86;
    }
    
    public static SubLObject f14621(final SubLObject var7, final SubLObject var82, final SubLObject var97, SubLObject var83, SubLObject var84) {
        if (var83 == UNPROVIDED) {
            var83 = (SubLObject)ONE_INTEGER;
        }
        if (var84 == UNPROVIDED) {
            var84 = (SubLObject)TWO_INTEGER;
        }
        final SubLThread var98 = SubLProcess.currentSubLThread();
        assert NIL != Types.listp(var97) : var97;
        SubLObject var99 = (SubLObject)NIL;
        final SubLObject var100 = module0147.$g2094$.currentBinding(var98);
        final SubLObject var101 = module0147.$g2096$.currentBinding(var98);
        try {
            module0147.$g2094$.bind((SubLObject)$ic34$, var98);
            module0147.$g2096$.bind(var97, var98);
            var99 = f14619(var7, var82, var83, var84);
        }
        finally {
            module0147.$g2096$.rebind(var101, var98);
            module0147.$g2094$.rebind(var100, var98);
        }
        return var99;
    }
    
    public static SubLObject f14622(final SubLObject var7, final SubLObject var82, SubLObject var83, SubLObject var84) {
        if (var83 == UNPROVIDED) {
            var83 = (SubLObject)ONE_INTEGER;
        }
        if (var84 == UNPROVIDED) {
            var84 = (SubLObject)TWO_INTEGER;
        }
        final SubLThread var85 = SubLProcess.currentSubLThread();
        SubLObject var86 = (SubLObject)NIL;
        final SubLObject var87 = module0147.$g2094$.currentBinding(var85);
        final SubLObject var88 = module0147.$g2095$.currentBinding(var85);
        try {
            module0147.$g2094$.bind((SubLObject)$ic25$, var85);
            module0147.$g2095$.bind($ic26$, var85);
            var86 = f14619(var7, var82, var83, var84);
        }
        finally {
            module0147.$g2095$.rebind(var88, var85);
            module0147.$g2094$.rebind(var87, var85);
        }
        return var86;
    }
    
    public static SubLObject f14623(final SubLObject var7, final SubLObject var82, SubLObject var54, SubLObject var83, SubLObject var84) {
        if (var54 == UNPROVIDED) {
            var54 = (SubLObject)NIL;
        }
        if (var83 == UNPROVIDED) {
            var83 = (SubLObject)ONE_INTEGER;
        }
        if (var84 == UNPROVIDED) {
            var84 = (SubLObject)TWO_INTEGER;
        }
        final SubLThread var85 = SubLProcess.currentSubLThread();
        SubLObject var86 = (SubLObject)NIL;
        final SubLObject var87 = var54;
        final SubLObject var88 = module0147.$g2094$.currentBinding(var85);
        final SubLObject var89 = module0147.$g2095$.currentBinding(var85);
        try {
            module0147.$g2094$.bind(module0147.f9531(var87), var85);
            module0147.$g2095$.bind(module0147.f9534(var87), var85);
            var86 = f14619(var7, var82, var83, var84);
        }
        finally {
            module0147.$g2095$.rebind(var89, var85);
            module0147.$g2094$.rebind(var88, var85);
        }
        return var86;
    }
    
    public static SubLObject f14624(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic35$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic35$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic35$);
        var7 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var8;
            var4 = (var8 = var5);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic36$, (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic37$, var7)), ConsesLow.append(var8, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic35$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14625(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic35$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic35$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic35$);
        var7 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var8;
            var4 = (var8 = var5);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic36$, (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic38$, var7)), ConsesLow.append(var8, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic35$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14626(final SubLObject var7, final SubLObject var82, SubLObject var54, SubLObject var83, SubLObject var115) {
        if (var54 == UNPROVIDED) {
            var54 = (SubLObject)NIL;
        }
        if (var83 == UNPROVIDED) {
            var83 = (SubLObject)ONE_INTEGER;
        }
        if (var115 == UNPROVIDED) {
            var115 = (SubLObject)$ic9$;
        }
        SubLObject var116 = module0260.f17034(var82, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var117 = (SubLObject)NIL;
        var117 = var116.first();
        while (NIL != var116) {
            if (NIL != module0220.f14548(var7, var117, var54, var83, var115)) {
                return (SubLObject)T;
            }
            var116 = var116.rest();
            var117 = var116.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14627(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic39$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic39$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic39$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var124_125 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic39$);
            var124_125 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)$ic39$);
            if (NIL == conses_high.member(var124_125, (SubLObject)$ic40$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var124_125 == $ic2$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic39$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic8$, var4);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic4$, var4);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15;
        var4 = (var15 = var5);
        final SubLObject var16 = (SubLObject)$ic41$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic5$, (SubLObject)ConsesLow.list((SubLObject)$ic42$, (SubLObject)ConsesLow.list(var16, var7), (SubLObject)ConsesLow.listS((SubLObject)$ic43$, (SubLObject)ConsesLow.list(var6, var16, (SubLObject)$ic8$, var12, (SubLObject)$ic4$, var14), ConsesLow.append(var15, (SubLObject)NIL))), (SubLObject)ConsesLow.list((SubLObject)$ic10$, (SubLObject)ConsesLow.list((SubLObject)$ic44$, var7), (SubLObject)ConsesLow.list((SubLObject)$ic14$, (SubLObject)$ic15$, (SubLObject)ConsesLow.list((SubLObject)$ic45$, (SubLObject)ConsesLow.list(var16, var7), (SubLObject)ConsesLow.listS((SubLObject)$ic43$, (SubLObject)ConsesLow.list(var6, var16, (SubLObject)$ic8$, var12, (SubLObject)$ic4$, var14), ConsesLow.append(var15, (SubLObject)NIL))))));
    }
    
    public static SubLObject f14628(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic46$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic46$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic46$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic46$);
        var8 = var4.first();
        var4 = var4.rest();
        final SubLObject var9 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic46$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var10;
            var4 = (var10 = var5);
            final SubLObject var11 = (SubLObject)$ic47$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic48$, (SubLObject)ConsesLow.list((SubLObject)$ic42$, (SubLObject)ConsesLow.list(var11, var7), (SubLObject)ConsesLow.listS((SubLObject)$ic43$, (SubLObject)ConsesLow.list(var6, var11, (SubLObject)$ic8$, var9, (SubLObject)$ic4$, var8), ConsesLow.append(var10, (SubLObject)NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic46$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14629(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic49$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic49$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic49$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic49$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic49$);
        var9 = var4.first();
        var4 = var4.rest();
        final SubLObject var10 = (SubLObject)(var4.isCons() ? var4.first() : ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic49$);
        var4 = var4.rest();
        final SubLObject var11 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic49$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var12;
            var4 = (var12 = var5);
            final SubLObject var13 = (SubLObject)$ic50$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic42$, (SubLObject)ConsesLow.list(var13, var8), (SubLObject)ConsesLow.listS((SubLObject)$ic7$, (SubLObject)ConsesLow.list(new SubLObject[] { var6, var7, $ic51$, var13, $ic3$, var10, $ic8$, var11, $ic4$, var9 }), ConsesLow.append(var12, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic49$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14630(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic49$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic49$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic49$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic49$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic49$);
        var9 = var4.first();
        var4 = var4.rest();
        final SubLObject var10 = (SubLObject)(var4.isCons() ? var4.first() : ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic49$);
        var4 = var4.rest();
        final SubLObject var11 = (SubLObject)(var4.isCons() ? var4.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)$ic49$);
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var12;
            var4 = (var12 = var5);
            return (SubLObject)ConsesLow.list((SubLObject)$ic48$, (SubLObject)ConsesLow.listS((SubLObject)$ic52$, (SubLObject)ConsesLow.list(var6, var7, var8, var9, var10, var11), ConsesLow.append(var12, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic49$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14631(final SubLObject var82, SubLObject var54) {
        if (var54 == UNPROVIDED) {
            var54 = (SubLObject)NIL;
        }
        final SubLThread var83 = SubLProcess.currentSubLThread();
        SubLObject var84 = (SubLObject)ZERO_INTEGER;
        final SubLObject var85 = var54;
        final SubLObject var86 = module0147.$g2094$.currentBinding(var83);
        final SubLObject var87 = module0147.$g2095$.currentBinding(var83);
        try {
            module0147.$g2094$.bind(module0147.f9531(var85), var83);
            module0147.$g2095$.bind(module0147.f9534(var85), var83);
            SubLObject var88 = module0260.f17034(var82, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var89 = (SubLObject)NIL;
            var89 = var88.first();
            while (NIL != var88) {
                var84 = Numbers.add(var84, module0217.f14247(var89, (SubLObject)UNPROVIDED));
                var88 = var88.rest();
                var89 = var88.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var87, var83);
            module0147.$g2094$.rebind(var86, var83);
        }
        return var84;
    }
    
    public static SubLObject f14632() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0221", "f14608", "S#12705");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0221", "f14609", "S#17400", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0221", "f14610", "S#12706");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0221", "f14611", "S#17401", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0221", "f14612", "S#17402", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0221", "f14613", "S#17403", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0221", "f14614", "S#17404", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0221", "f14615", "S#17405", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0221", "f14616", "S#17406", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0221", "f14617", "S#17407", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0221", "f14618", "S#17408", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0221", "f14619", "S#17409", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0221", "f14620", "S#17410", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0221", "f14621", "S#17411", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0221", "f14622", "S#17412", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0221", "f14623", "S#17413", 2, 3, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0221", "f14624", "S#17414");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0221", "f14625", "S#17415");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0221", "f14626", "S#17416", 2, 3, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0221", "f14627", "S#17417");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0221", "f14628", "S#17418");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0221", "f14629", "S#17419");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0221", "f14630", "S#17420");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0221", "f14631", "S#17421", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14633() {
        $g2399$ = SubLFiles.defparameter("S#17422", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f14634() {
        module0002.f50((SubLObject)$ic11$, (SubLObject)$ic16$);
        module0002.f50((SubLObject)$ic19$, (SubLObject)$ic20$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f14632();
    }
    
    public void initializeVariables() {
        f14633();
    }
    
    public void runTopLevelForms() {
        f14634();
    }
    
    static {
        me = (SubLFile)new module0221();
        $g2399$ = null;
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("S#717", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#134", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic1$ = ConsesLow.list((SubLObject)makeKeyword("INDEX"), (SubLObject)makeKeyword("DONE"));
        $ic2$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic3$ = makeKeyword("INDEX");
        $ic4$ = makeKeyword("DONE");
        $ic5$ = makeSymbol("PROGN");
        $ic6$ = makeSymbol("WITH-ALL-SPEC-PREDICATES");
        $ic7$ = makeSymbol("DO-GAF-ARG-INDEX");
        $ic8$ = makeKeyword("TRUTH");
        $ic9$ = makeKeyword("TRUE");
        $ic10$ = makeSymbol("PWHEN");
        $ic11$ = makeSymbol("S#17400", "CYC");
        $ic12$ = makeSymbol("S#12358", "CYC");
        $ic13$ = makeSymbol("S#17399", "CYC");
        $ic14$ = makeSymbol("CLET");
        $ic15$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#17422", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("CNOT"), (SubLObject)makeSymbol("S#17422", "CYC"))));
        $ic16$ = makeSymbol("S#12705", "CYC");
        $ic17$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("GATHER-INDEX"), (SubLObject)makeSymbol("S#717", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#134", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic18$ = makeUninternedSymbol("US#67B23EC");
        $ic19$ = makeSymbol("S#17401", "CYC");
        $ic20$ = makeSymbol("S#12706", "CYC");
        $ic21$ = makeKeyword("MAPPING-DONE");
        $ic22$ = makeSymbol("S#12347", "CYC");
        $ic23$ = makeKeyword("GAF");
        $ic24$ = makeSymbol("S#12348", "CYC");
        $ic25$ = makeSymbol("S#12274", "CYC");
        $ic26$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic27$ = makeSymbol("S#12276", "CYC");
        $ic28$ = makeSymbol("INDEXED-TERM-P");
        $ic29$ = makeSymbol("FORT-P");
        $ic30$ = makeSymbol("INTEGERP");
        $ic31$ = makeSymbol("S#12263", "CYC");
        $ic32$ = makeSymbol("S#12278", "CYC");
        $ic33$ = makeSymbol("LISTP");
        $ic34$ = makeSymbol("S#12277", "CYC");
        $ic35$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#155", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic36$ = makeSymbol("CDOLIST");
        $ic37$ = makeSymbol("ALL-SPEC-PREDS");
        $ic38$ = makeSymbol("ALL-SPEC-INVERSES");
        $ic39$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#12576", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic40$ = ConsesLow.list((SubLObject)makeKeyword("TRUTH"), (SubLObject)makeKeyword("DONE"));
        $ic41$ = makeUninternedSymbol("US#1169C35");
        $ic42$ = makeSymbol("S#17414", "CYC");
        $ic43$ = makeSymbol("DO-PREDICATE-EXTENT-INDEX");
        $ic44$ = makeSymbol("S#17398", "CYC");
        $ic45$ = makeSymbol("S#17415", "CYC");
        $ic46$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#127", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#12576", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic47$ = makeUninternedSymbol("US#1169C35");
        $ic48$ = makeSymbol("WITH-ALL-MTS");
        $ic49$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#12141", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#127", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#134", "CYC"), (SubLObject)ONE_INTEGER), (SubLObject)makeSymbol("S#12576", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic50$ = makeUninternedSymbol("US#1169C35");
        $ic51$ = makeKeyword("PREDICATE");
        $ic52$ = makeSymbol("S#17419", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 694 ms
	
	Decompiled with Procyon 0.5.32.
*/