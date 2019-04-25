package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0221.$ic0$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0221.NIL;
        SubLObject var7 = (SubLObject)module0221.NIL;
        SubLObject var8 = (SubLObject)module0221.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0221.$ic0$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0221.$ic0$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0221.$ic0$);
        var8 = var4.first();
        var4 = var4.rest();
        SubLObject var9 = (SubLObject)module0221.NIL;
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)module0221.NIL;
        SubLObject var12_13 = (SubLObject)module0221.NIL;
        while (module0221.NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0221.$ic0$);
            var12_13 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var3, (SubLObject)module0221.$ic0$);
            if (module0221.NIL == conses_high.member(var12_13, (SubLObject)module0221.$ic1$, (SubLObject)module0221.UNPROVIDED, (SubLObject)module0221.UNPROVIDED)) {
                var11 = (SubLObject)module0221.T;
            }
            if (var12_13 == module0221.$ic2$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (module0221.NIL != var11 && module0221.NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0221.$ic0$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)module0221.$ic3$, var4);
        final SubLObject var13 = (SubLObject)((module0221.NIL != var12) ? conses_high.cadr(var12) : module0221.NIL);
        final SubLObject var14 = cdestructuring_bind.property_list_member((SubLObject)module0221.$ic4$, var4);
        final SubLObject var15 = (SubLObject)((module0221.NIL != var14) ? conses_high.cadr(var14) : module0221.NIL);
        final SubLObject var16;
        var4 = (var16 = var5);
        return (SubLObject)ConsesLow.list((SubLObject)module0221.$ic5$, (SubLObject)ConsesLow.list((SubLObject)module0221.$ic6$, var8, (SubLObject)ConsesLow.listS((SubLObject)module0221.$ic7$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)module0221.$ic3$, var13, (SubLObject)module0221.$ic8$, (SubLObject)module0221.$ic9$, (SubLObject)module0221.$ic4$, var15), ConsesLow.append(var16, (SubLObject)module0221.NIL))), (SubLObject)ConsesLow.list((SubLObject)module0221.$ic10$, (SubLObject)ConsesLow.list((SubLObject)module0221.$ic11$, var8), (SubLObject)ConsesLow.list((SubLObject)module0221.$ic12$, var8, (SubLObject)ConsesLow.list((SubLObject)module0221.$ic7$, (SubLObject)ConsesLow.list(var6, var7, (SubLObject)module0221.$ic3$, (SubLObject)ConsesLow.list((SubLObject)module0221.$ic13$, var13), (SubLObject)module0221.$ic8$, (SubLObject)module0221.$ic9$, (SubLObject)module0221.$ic4$, var15), (SubLObject)ConsesLow.listS((SubLObject)module0221.$ic14$, (SubLObject)module0221.$ic15$, ConsesLow.append(var16, (SubLObject)module0221.NIL))))));
    }
    
    public static SubLObject f14609(final SubLObject var8) {
        return module0225.f14781(var8);
    }
    
    public static SubLObject f14610(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0221.$ic17$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0221.NIL;
        SubLObject var7 = (SubLObject)module0221.NIL;
        SubLObject var8 = (SubLObject)module0221.NIL;
        SubLObject var9 = (SubLObject)module0221.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0221.$ic17$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0221.$ic17$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0221.$ic17$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0221.$ic17$);
        var9 = var4.first();
        var4 = var4.rest();
        SubLObject var10 = (SubLObject)module0221.NIL;
        SubLObject var11 = var4;
        SubLObject var12 = (SubLObject)module0221.NIL;
        SubLObject var26_27 = (SubLObject)module0221.NIL;
        while (module0221.NIL != var11) {
            cdestructuring_bind.destructuring_bind_must_consp(var11, var3, (SubLObject)module0221.$ic17$);
            var26_27 = var11.first();
            var11 = var11.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var11, var3, (SubLObject)module0221.$ic17$);
            if (module0221.NIL == conses_high.member(var26_27, (SubLObject)module0221.$ic1$, (SubLObject)module0221.UNPROVIDED, (SubLObject)module0221.UNPROVIDED)) {
                var12 = (SubLObject)module0221.T;
            }
            if (var26_27 == module0221.$ic2$) {
                var10 = var11.first();
            }
            var11 = var11.rest();
        }
        if (module0221.NIL != var12 && module0221.NIL == var10) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0221.$ic17$);
        }
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)module0221.$ic3$, var4);
        final SubLObject var14 = (SubLObject)((module0221.NIL != var13) ? conses_high.cadr(var13) : module0221.NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)module0221.$ic4$, var4);
        final SubLObject var16 = (SubLObject)((module0221.NIL != var15) ? conses_high.cadr(var15) : module0221.NIL);
        final SubLObject var17;
        var4 = (var17 = var5);
        final SubLObject var18 = (SubLObject)module0221.$ic18$;
        return (SubLObject)ConsesLow.list((SubLObject)module0221.$ic16$, (SubLObject)ConsesLow.list(var18, var7, var9, (SubLObject)module0221.$ic3$, var14, (SubLObject)module0221.$ic4$, var16), (SubLObject)ConsesLow.listS((SubLObject)module0221.$ic14$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)module0221.$ic19$, var18, var8))), ConsesLow.append(var17, (SubLObject)module0221.NIL)));
    }
    
    public static SubLObject f14611(final SubLObject var30, final SubLObject var22) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        return module0178.f11331(var30, (module0221.NIL != module0221.$g2399$.getDynamicValue(var31)) ? module0225.f14782(var22) : var22);
    }
    
    public static SubLObject f14612(final SubLObject var32, final SubLObject var7, final SubLObject var33, final SubLObject var8) {
        final SubLThread var34 = SubLProcess.currentSubLThread();
        SubLObject var35 = (SubLObject)module0221.NIL;
        try {
            var34.throwStack.push(module0221.$ic21$);
            SubLObject var36 = module0148.$g2099$.currentBinding(var34);
            SubLObject var37 = module0148.$g2097$.currentBinding(var34);
            try {
                module0148.$g2099$.bind((SubLObject)module0221.$ic22$, var34);
                module0148.$g2097$.bind(var8, var34);
                final SubLObject var38 = (SubLObject)module0221.NIL;
                if (module0221.NIL != module0158.f10010(var7, var33, var38)) {
                    final SubLObject var39 = module0158.f10011(var7, var33, var38);
                    SubLObject var40 = (SubLObject)module0221.NIL;
                    final SubLObject var41 = (SubLObject)module0221.NIL;
                    while (module0221.NIL == var40) {
                        final SubLObject var42 = module0052.f3695(var39, var41);
                        final SubLObject var43 = (SubLObject)SubLObjectFactory.makeBoolean(!var41.eql(var42));
                        if (module0221.NIL != var43) {
                            SubLObject var44 = (SubLObject)module0221.NIL;
                            try {
                                var44 = module0158.f10316(var42, (SubLObject)module0221.$ic23$, (SubLObject)module0221.$ic9$, (SubLObject)module0221.NIL);
                                SubLObject var39_44 = (SubLObject)module0221.NIL;
                                final SubLObject var40_45 = (SubLObject)module0221.NIL;
                                while (module0221.NIL == var39_44) {
                                    final SubLObject var45 = module0052.f3695(var44, var40_45);
                                    final SubLObject var42_46 = (SubLObject)SubLObjectFactory.makeBoolean(!var40_45.eql(var45));
                                    if (module0221.NIL != var42_46) {
                                        Functions.funcall(var32, var45);
                                    }
                                    var39_44 = (SubLObject)SubLObjectFactory.makeBoolean(module0221.NIL == var42_46);
                                }
                            }
                            finally {
                                final SubLObject var35_47 = Threads.$is_thread_performing_cleanupP$.currentBinding(var34);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0221.T, var34);
                                    if (module0221.NIL != var44) {
                                        module0158.f10319(var44);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var35_47, var34);
                                }
                            }
                        }
                        var40 = (SubLObject)SubLObjectFactory.makeBoolean(module0221.NIL == var43);
                    }
                }
            }
            finally {
                module0148.$g2097$.rebind(var37, var34);
                module0148.$g2099$.rebind(var36, var34);
            }
            if (module0221.NIL != f14609(var8)) {
                var36 = module0148.$g2099$.currentBinding(var34);
                var37 = module0148.$g2097$.currentBinding(var34);
                try {
                    module0148.$g2099$.bind((SubLObject)module0221.$ic24$, var34);
                    module0148.$g2097$.bind(var8, var34);
                    final SubLObject var38 = (SubLObject)module0221.NIL;
                    if (module0221.NIL != module0158.f10010(var7, module0225.f14782(var33), var38)) {
                        final SubLObject var39 = module0158.f10011(var7, module0225.f14782(var33), var38);
                        SubLObject var40 = (SubLObject)module0221.NIL;
                        final SubLObject var41 = (SubLObject)module0221.NIL;
                        while (module0221.NIL == var40) {
                            final SubLObject var42 = module0052.f3695(var39, var41);
                            final SubLObject var43 = (SubLObject)SubLObjectFactory.makeBoolean(!var41.eql(var42));
                            if (module0221.NIL != var43) {
                                SubLObject var44 = (SubLObject)module0221.NIL;
                                try {
                                    var44 = module0158.f10316(var42, (SubLObject)module0221.$ic23$, (SubLObject)module0221.$ic9$, (SubLObject)module0221.NIL);
                                    SubLObject var39_45 = (SubLObject)module0221.NIL;
                                    final SubLObject var40_46 = (SubLObject)module0221.NIL;
                                    while (module0221.NIL == var39_45) {
                                        final SubLObject var45 = module0052.f3695(var44, var40_46);
                                        final SubLObject var42_47 = (SubLObject)SubLObjectFactory.makeBoolean(!var40_46.eql(var45));
                                        if (module0221.NIL != var42_47) {
                                            final SubLObject var35_48 = module0221.$g2399$.currentBinding(var34);
                                            try {
                                                module0221.$g2399$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0221.NIL == module0221.$g2399$.getDynamicValue(var34)), var34);
                                                Functions.funcall(var32, var45);
                                            }
                                            finally {
                                                module0221.$g2399$.rebind(var35_48, var34);
                                            }
                                        }
                                        var39_45 = (SubLObject)SubLObjectFactory.makeBoolean(module0221.NIL == var42_47);
                                    }
                                }
                                finally {
                                    final SubLObject var35_49 = Threads.$is_thread_performing_cleanupP$.currentBinding(var34);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0221.T, var34);
                                        if (module0221.NIL != var44) {
                                            module0158.f10319(var44);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var35_49, var34);
                                    }
                                }
                            }
                            var40 = (SubLObject)SubLObjectFactory.makeBoolean(module0221.NIL == var43);
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
            var35 = Errors.handleThrowable(var46, (SubLObject)module0221.$ic21$);
        }
        finally {
            var34.throwStack.pop();
        }
        return (SubLObject)module0221.NIL;
    }
    
    public static SubLObject f14613(final SubLObject var7, final SubLObject var33, final SubLObject var8, SubLObject var54) {
        if (var54 == module0221.UNPROVIDED) {
            var54 = (SubLObject)module0221.NIL;
        }
        final SubLThread var55 = SubLProcess.currentSubLThread();
        SubLObject var56 = (SubLObject)module0221.NIL;
        if (module0221.NIL == var54) {
            final SubLObject var57 = module0147.$g2094$.currentBinding(var55);
            final SubLObject var58 = module0147.$g2095$.currentBinding(var55);
            try {
                module0147.$g2094$.bind((SubLObject)module0221.$ic25$, var55);
                module0147.$g2095$.bind(module0221.$ic26$, var55);
                final SubLObject var35_56 = module0148.$g2099$.currentBinding(var55);
                final SubLObject var36_57 = module0148.$g2097$.currentBinding(var55);
                try {
                    module0148.$g2099$.bind((SubLObject)module0221.$ic22$, var55);
                    module0148.$g2097$.bind(var8, var55);
                    final SubLObject var59 = (SubLObject)module0221.NIL;
                    if (module0221.NIL != module0158.f10010(var7, var33, var59)) {
                        final SubLObject var60 = module0158.f10011(var7, var33, var59);
                        SubLObject var61 = (SubLObject)module0221.NIL;
                        final SubLObject var62 = (SubLObject)module0221.NIL;
                        while (module0221.NIL == var61) {
                            final SubLObject var63 = module0052.f3695(var60, var62);
                            final SubLObject var64 = (SubLObject)SubLObjectFactory.makeBoolean(!var62.eql(var63));
                            if (module0221.NIL != var64) {
                                SubLObject var65 = (SubLObject)module0221.NIL;
                                try {
                                    var65 = module0158.f10316(var63, (SubLObject)module0221.$ic23$, (SubLObject)module0221.$ic9$, (SubLObject)module0221.NIL);
                                    SubLObject var39_58 = (SubLObject)module0221.NIL;
                                    final SubLObject var40_59 = (SubLObject)module0221.NIL;
                                    while (module0221.NIL == var39_58) {
                                        final SubLObject var66 = module0052.f3695(var65, var40_59);
                                        final SubLObject var42_60 = (SubLObject)SubLObjectFactory.makeBoolean(!var40_59.eql(var66));
                                        if (module0221.NIL != var42_60) {
                                            var56 = (SubLObject)ConsesLow.cons(var66, var56);
                                        }
                                        var39_58 = (SubLObject)SubLObjectFactory.makeBoolean(module0221.NIL == var42_60);
                                    }
                                }
                                finally {
                                    final SubLObject var35_57 = Threads.$is_thread_performing_cleanupP$.currentBinding(var55);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0221.T, var55);
                                        if (module0221.NIL != var65) {
                                            module0158.f10319(var65);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var35_57, var55);
                                    }
                                }
                            }
                            var61 = (SubLObject)SubLObjectFactory.makeBoolean(module0221.NIL == var64);
                        }
                    }
                }
                finally {
                    module0148.$g2097$.rebind(var36_57, var55);
                    module0148.$g2099$.rebind(var35_56, var55);
                }
                if (module0221.NIL != f14609(var8)) {
                    final SubLObject var35_58 = module0148.$g2099$.currentBinding(var55);
                    final SubLObject var36_58 = module0148.$g2097$.currentBinding(var55);
                    try {
                        module0148.$g2099$.bind((SubLObject)module0221.$ic24$, var55);
                        module0148.$g2097$.bind(var8, var55);
                        final SubLObject var59 = (SubLObject)module0221.NIL;
                        if (module0221.NIL != module0158.f10010(var7, module0225.f14782(var33), var59)) {
                            final SubLObject var60 = module0158.f10011(var7, module0225.f14782(var33), var59);
                            SubLObject var61 = (SubLObject)module0221.NIL;
                            final SubLObject var62 = (SubLObject)module0221.NIL;
                            while (module0221.NIL == var61) {
                                final SubLObject var63 = module0052.f3695(var60, var62);
                                final SubLObject var64 = (SubLObject)SubLObjectFactory.makeBoolean(!var62.eql(var63));
                                if (module0221.NIL != var64) {
                                    SubLObject var65 = (SubLObject)module0221.NIL;
                                    try {
                                        var65 = module0158.f10316(var63, (SubLObject)module0221.$ic23$, (SubLObject)module0221.$ic9$, (SubLObject)module0221.NIL);
                                        SubLObject var39_59 = (SubLObject)module0221.NIL;
                                        final SubLObject var40_60 = (SubLObject)module0221.NIL;
                                        while (module0221.NIL == var39_59) {
                                            final SubLObject var66 = module0052.f3695(var65, var40_60);
                                            final SubLObject var42_61 = (SubLObject)SubLObjectFactory.makeBoolean(!var40_60.eql(var66));
                                            if (module0221.NIL != var42_61) {
                                                final SubLObject var35_59 = module0221.$g2399$.currentBinding(var55);
                                                try {
                                                    module0221.$g2399$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0221.NIL == module0221.$g2399$.getDynamicValue(var55)), var55);
                                                    var56 = (SubLObject)ConsesLow.cons(var66, var56);
                                                }
                                                finally {
                                                    module0221.$g2399$.rebind(var35_59, var55);
                                                }
                                            }
                                            var39_59 = (SubLObject)SubLObjectFactory.makeBoolean(module0221.NIL == var42_61);
                                        }
                                    }
                                    finally {
                                        final SubLObject var35_60 = Threads.$is_thread_performing_cleanupP$.currentBinding(var55);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0221.T, var55);
                                            if (module0221.NIL != var65) {
                                                module0158.f10319(var65);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var35_60, var55);
                                        }
                                    }
                                }
                                var61 = (SubLObject)SubLObjectFactory.makeBoolean(module0221.NIL == var64);
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
                module0147.$g2094$.bind((SubLObject)module0221.$ic27$, var55);
                module0147.$g2095$.bind(var54, var55);
                final SubLObject var35_61 = module0148.$g2099$.currentBinding(var55);
                final SubLObject var36_59 = module0148.$g2097$.currentBinding(var55);
                try {
                    module0148.$g2099$.bind((SubLObject)module0221.$ic22$, var55);
                    module0148.$g2097$.bind(var8, var55);
                    final SubLObject var59 = (SubLObject)module0221.NIL;
                    if (module0221.NIL != module0158.f10010(var7, var33, var59)) {
                        final SubLObject var60 = module0158.f10011(var7, var33, var59);
                        SubLObject var61 = (SubLObject)module0221.NIL;
                        final SubLObject var62 = (SubLObject)module0221.NIL;
                        while (module0221.NIL == var61) {
                            final SubLObject var63 = module0052.f3695(var60, var62);
                            final SubLObject var64 = (SubLObject)SubLObjectFactory.makeBoolean(!var62.eql(var63));
                            if (module0221.NIL != var64) {
                                SubLObject var65 = (SubLObject)module0221.NIL;
                                try {
                                    var65 = module0158.f10316(var63, (SubLObject)module0221.$ic23$, (SubLObject)module0221.$ic9$, (SubLObject)module0221.NIL);
                                    SubLObject var39_60 = (SubLObject)module0221.NIL;
                                    final SubLObject var40_61 = (SubLObject)module0221.NIL;
                                    while (module0221.NIL == var39_60) {
                                        final SubLObject var66 = module0052.f3695(var65, var40_61);
                                        final SubLObject var42_62 = (SubLObject)SubLObjectFactory.makeBoolean(!var40_61.eql(var66));
                                        if (module0221.NIL != var42_62) {
                                            var56 = (SubLObject)ConsesLow.cons(var66, var56);
                                        }
                                        var39_60 = (SubLObject)SubLObjectFactory.makeBoolean(module0221.NIL == var42_62);
                                    }
                                }
                                finally {
                                    final SubLObject var35_62 = Threads.$is_thread_performing_cleanupP$.currentBinding(var55);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0221.T, var55);
                                        if (module0221.NIL != var65) {
                                            module0158.f10319(var65);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var35_62, var55);
                                    }
                                }
                            }
                            var61 = (SubLObject)SubLObjectFactory.makeBoolean(module0221.NIL == var64);
                        }
                    }
                }
                finally {
                    module0148.$g2097$.rebind(var36_59, var55);
                    module0148.$g2099$.rebind(var35_61, var55);
                }
                if (module0221.NIL != f14609(var8)) {
                    final SubLObject var35_63 = module0148.$g2099$.currentBinding(var55);
                    final SubLObject var36_60 = module0148.$g2097$.currentBinding(var55);
                    try {
                        module0148.$g2099$.bind((SubLObject)module0221.$ic24$, var55);
                        module0148.$g2097$.bind(var8, var55);
                        final SubLObject var59 = (SubLObject)module0221.NIL;
                        if (module0221.NIL != module0158.f10010(var7, module0225.f14782(var33), var59)) {
                            final SubLObject var60 = module0158.f10011(var7, module0225.f14782(var33), var59);
                            SubLObject var61 = (SubLObject)module0221.NIL;
                            final SubLObject var62 = (SubLObject)module0221.NIL;
                            while (module0221.NIL == var61) {
                                final SubLObject var63 = module0052.f3695(var60, var62);
                                final SubLObject var64 = (SubLObject)SubLObjectFactory.makeBoolean(!var62.eql(var63));
                                if (module0221.NIL != var64) {
                                    SubLObject var65 = (SubLObject)module0221.NIL;
                                    try {
                                        var65 = module0158.f10316(var63, (SubLObject)module0221.$ic23$, (SubLObject)module0221.$ic9$, (SubLObject)module0221.NIL);
                                        SubLObject var39_61 = (SubLObject)module0221.NIL;
                                        final SubLObject var40_62 = (SubLObject)module0221.NIL;
                                        while (module0221.NIL == var39_61) {
                                            final SubLObject var66 = module0052.f3695(var65, var40_62);
                                            final SubLObject var42_63 = (SubLObject)SubLObjectFactory.makeBoolean(!var40_62.eql(var66));
                                            if (module0221.NIL != var42_63) {
                                                final SubLObject var35_64 = module0221.$g2399$.currentBinding(var55);
                                                try {
                                                    module0221.$g2399$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0221.NIL == module0221.$g2399$.getDynamicValue(var55)), var55);
                                                    var56 = (SubLObject)ConsesLow.cons(var66, var56);
                                                }
                                                finally {
                                                    module0221.$g2399$.rebind(var35_64, var55);
                                                }
                                            }
                                            var39_61 = (SubLObject)SubLObjectFactory.makeBoolean(module0221.NIL == var42_63);
                                        }
                                    }
                                    finally {
                                        final SubLObject var35_65 = Threads.$is_thread_performing_cleanupP$.currentBinding(var55);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0221.T, var55);
                                            if (module0221.NIL != var65) {
                                                module0158.f10319(var65);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var35_65, var55);
                                        }
                                    }
                                }
                                var61 = (SubLObject)SubLObjectFactory.makeBoolean(module0221.NIL == var64);
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
        if (var83 == module0221.UNPROVIDED) {
            var83 = (SubLObject)module0221.ONE_INTEGER;
        }
        if (var84 == module0221.UNPROVIDED) {
            var84 = (SubLObject)module0221.TWO_INTEGER;
        }
        final SubLThread var85 = SubLProcess.currentSubLThread();
        assert module0221.NIL != module0212.f13762(var7) : var7;
        assert module0221.NIL != module0173.f10955(var82) : var82;
        assert module0221.NIL != Types.integerp(var83) : var83;
        assert module0221.NIL != Types.integerp(var84) : var84;
        SubLObject var86 = (SubLObject)module0221.NIL;
        SubLObject var87 = (SubLObject)module0221.NIL;
        SubLObject var88 = module0148.$g2099$.currentBinding(var85);
        SubLObject var89 = module0148.$g2097$.currentBinding(var85);
        try {
            module0148.$g2099$.bind((SubLObject)module0221.$ic22$, var85);
            module0148.$g2097$.bind(var82, var85);
            final SubLObject var90 = (SubLObject)module0221.NIL;
            if (module0221.NIL != module0158.f10010(var7, var83, var90)) {
                final SubLObject var91 = module0158.f10011(var7, var83, var90);
                SubLObject var92 = var86;
                final SubLObject var93 = (SubLObject)module0221.NIL;
                while (module0221.NIL == var92) {
                    final SubLObject var94 = module0052.f3695(var91, var93);
                    final SubLObject var95 = (SubLObject)SubLObjectFactory.makeBoolean(!var93.eql(var94));
                    if (module0221.NIL != var95) {
                        SubLObject var96 = (SubLObject)module0221.NIL;
                        try {
                            var96 = module0158.f10316(var94, (SubLObject)module0221.$ic23$, (SubLObject)module0221.$ic9$, (SubLObject)module0221.NIL);
                            SubLObject var39_85 = var86;
                            final SubLObject var40_86 = (SubLObject)module0221.NIL;
                            while (module0221.NIL == var39_85) {
                                final SubLObject var97 = module0052.f3695(var96, var40_86);
                                final SubLObject var42_88 = (SubLObject)SubLObjectFactory.makeBoolean(!var40_86.eql(var97));
                                if (module0221.NIL != var42_88) {
                                    final SubLObject var98 = var87 = f14611(var97, var84);
                                    var86 = (SubLObject)module0221.T;
                                }
                                var39_85 = (SubLObject)SubLObjectFactory.makeBoolean(module0221.NIL == var42_88 || module0221.NIL != var86);
                            }
                        }
                        finally {
                            final SubLObject var35_90 = Threads.$is_thread_performing_cleanupP$.currentBinding(var85);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0221.T, var85);
                                if (module0221.NIL != var96) {
                                    module0158.f10319(var96);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var35_90, var85);
                            }
                        }
                    }
                    var92 = (SubLObject)SubLObjectFactory.makeBoolean(module0221.NIL == var95 || module0221.NIL != var86);
                }
            }
        }
        finally {
            module0148.$g2097$.rebind(var89, var85);
            module0148.$g2099$.rebind(var88, var85);
        }
        if (module0221.NIL != f14609(var82)) {
            var88 = module0148.$g2099$.currentBinding(var85);
            var89 = module0148.$g2097$.currentBinding(var85);
            try {
                module0148.$g2099$.bind((SubLObject)module0221.$ic24$, var85);
                module0148.$g2097$.bind(var82, var85);
                final SubLObject var90 = (SubLObject)module0221.NIL;
                if (module0221.NIL != module0158.f10010(var7, module0225.f14782(var83), var90)) {
                    final SubLObject var91 = module0158.f10011(var7, module0225.f14782(var83), var90);
                    SubLObject var92 = var86;
                    final SubLObject var93 = (SubLObject)module0221.NIL;
                    while (module0221.NIL == var92) {
                        final SubLObject var94 = module0052.f3695(var91, var93);
                        final SubLObject var95 = (SubLObject)SubLObjectFactory.makeBoolean(!var93.eql(var94));
                        if (module0221.NIL != var95) {
                            SubLObject var96 = (SubLObject)module0221.NIL;
                            try {
                                var96 = module0158.f10316(var94, (SubLObject)module0221.$ic23$, (SubLObject)module0221.$ic9$, (SubLObject)module0221.NIL);
                                SubLObject var39_86 = var86;
                                final SubLObject var40_87 = (SubLObject)module0221.NIL;
                                while (module0221.NIL == var39_86) {
                                    final SubLObject var97 = module0052.f3695(var96, var40_87);
                                    final SubLObject var42_89 = (SubLObject)SubLObjectFactory.makeBoolean(!var40_87.eql(var97));
                                    if (module0221.NIL != var42_89) {
                                        final SubLObject var35_91 = module0221.$g2399$.currentBinding(var85);
                                        try {
                                            module0221.$g2399$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0221.NIL == module0221.$g2399$.getDynamicValue(var85)), var85);
                                            final SubLObject var99 = var87 = f14611(var97, var84);
                                            var86 = (SubLObject)module0221.T;
                                        }
                                        finally {
                                            module0221.$g2399$.rebind(var35_91, var85);
                                        }
                                    }
                                    var39_86 = (SubLObject)SubLObjectFactory.makeBoolean(module0221.NIL == var42_89 || module0221.NIL != var86);
                                }
                            }
                            finally {
                                final SubLObject var35_92 = Threads.$is_thread_performing_cleanupP$.currentBinding(var85);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0221.T, var85);
                                    if (module0221.NIL != var96) {
                                        module0158.f10319(var96);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var35_92, var85);
                                }
                            }
                        }
                        var92 = (SubLObject)SubLObjectFactory.makeBoolean(module0221.NIL == var95 || module0221.NIL != var86);
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
        if (var83 == module0221.UNPROVIDED) {
            var83 = (SubLObject)module0221.ONE_INTEGER;
        }
        if (var84 == module0221.UNPROVIDED) {
            var84 = (SubLObject)module0221.TWO_INTEGER;
        }
        final SubLThread var85 = SubLProcess.currentSubLThread();
        assert module0221.NIL != module0161.f10481(var54) : var54;
        SubLObject var86 = (SubLObject)module0221.NIL;
        final SubLObject var87 = module0147.$g2094$.currentBinding(var85);
        final SubLObject var88 = module0147.$g2095$.currentBinding(var85);
        try {
            module0147.$g2094$.bind((SubLObject)module0221.$ic32$, var85);
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
        if (var83 == module0221.UNPROVIDED) {
            var83 = (SubLObject)module0221.ONE_INTEGER;
        }
        if (var84 == module0221.UNPROVIDED) {
            var84 = (SubLObject)module0221.TWO_INTEGER;
        }
        final SubLThread var98 = SubLProcess.currentSubLThread();
        assert module0221.NIL != Types.listp(var97) : var97;
        SubLObject var99 = (SubLObject)module0221.NIL;
        final SubLObject var100 = module0147.$g2094$.currentBinding(var98);
        final SubLObject var101 = module0147.$g2096$.currentBinding(var98);
        try {
            module0147.$g2094$.bind((SubLObject)module0221.$ic34$, var98);
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
        if (var83 == module0221.UNPROVIDED) {
            var83 = (SubLObject)module0221.ONE_INTEGER;
        }
        if (var84 == module0221.UNPROVIDED) {
            var84 = (SubLObject)module0221.TWO_INTEGER;
        }
        final SubLThread var85 = SubLProcess.currentSubLThread();
        SubLObject var86 = (SubLObject)module0221.NIL;
        final SubLObject var87 = module0147.$g2094$.currentBinding(var85);
        final SubLObject var88 = module0147.$g2095$.currentBinding(var85);
        try {
            module0147.$g2094$.bind((SubLObject)module0221.$ic25$, var85);
            module0147.$g2095$.bind(module0221.$ic26$, var85);
            var86 = f14614(var7, var82, var83, var84);
        }
        finally {
            module0147.$g2095$.rebind(var88, var85);
            module0147.$g2094$.rebind(var87, var85);
        }
        return var86;
    }
    
    public static SubLObject f14618(final SubLObject var7, final SubLObject var82, SubLObject var54, SubLObject var83, SubLObject var84) {
        if (var54 == module0221.UNPROVIDED) {
            var54 = (SubLObject)module0221.NIL;
        }
        if (var83 == module0221.UNPROVIDED) {
            var83 = (SubLObject)module0221.ONE_INTEGER;
        }
        if (var84 == module0221.UNPROVIDED) {
            var84 = (SubLObject)module0221.TWO_INTEGER;
        }
        final SubLThread var85 = SubLProcess.currentSubLThread();
        SubLObject var86 = (SubLObject)module0221.NIL;
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
        if (var83 == module0221.UNPROVIDED) {
            var83 = (SubLObject)module0221.ONE_INTEGER;
        }
        if (var84 == module0221.UNPROVIDED) {
            var84 = (SubLObject)module0221.TWO_INTEGER;
        }
        final SubLThread var85 = SubLProcess.currentSubLThread();
        assert module0221.NIL != module0212.f13762(var7) : var7;
        assert module0221.NIL != module0173.f10955(var82) : var82;
        assert module0221.NIL != Types.integerp(var83) : var83;
        assert module0221.NIL != Types.integerp(var84) : var84;
        SubLObject var86 = (SubLObject)module0221.NIL;
        SubLObject var87 = module0148.$g2099$.currentBinding(var85);
        SubLObject var88 = module0148.$g2097$.currentBinding(var85);
        try {
            module0148.$g2099$.bind((SubLObject)module0221.$ic22$, var85);
            module0148.$g2097$.bind(var82, var85);
            final SubLObject var89 = (SubLObject)module0221.NIL;
            if (module0221.NIL != module0158.f10010(var7, var83, var89)) {
                final SubLObject var90 = module0158.f10011(var7, var83, var89);
                SubLObject var91 = (SubLObject)module0221.NIL;
                final SubLObject var92 = (SubLObject)module0221.NIL;
                while (module0221.NIL == var91) {
                    final SubLObject var93 = module0052.f3695(var90, var92);
                    final SubLObject var94 = (SubLObject)SubLObjectFactory.makeBoolean(!var92.eql(var93));
                    if (module0221.NIL != var94) {
                        SubLObject var95 = (SubLObject)module0221.NIL;
                        try {
                            var95 = module0158.f10316(var93, (SubLObject)module0221.$ic23$, (SubLObject)module0221.$ic9$, (SubLObject)module0221.NIL);
                            SubLObject var39_99 = (SubLObject)module0221.NIL;
                            final SubLObject var40_100 = (SubLObject)module0221.NIL;
                            while (module0221.NIL == var39_99) {
                                final SubLObject var96 = module0052.f3695(var95, var40_100);
                                final SubLObject var42_101 = (SubLObject)SubLObjectFactory.makeBoolean(!var40_100.eql(var96));
                                if (module0221.NIL != var42_101) {
                                    final SubLObject var97 = f14611(var96, var84);
                                    if (module0221.NIL != module0018.$g593$.getDynamicValue(var85)) {
                                        final SubLObject var98 = var97;
                                        if (module0221.NIL == conses_high.member(var98, var86, module0018.$g593$.getDynamicValue(var85), Symbols.symbol_function((SubLObject)module0221.IDENTITY))) {
                                            var86 = (SubLObject)ConsesLow.cons(var98, var86);
                                        }
                                    }
                                    else {
                                        var86 = (SubLObject)ConsesLow.cons(var97, var86);
                                    }
                                }
                                var39_99 = (SubLObject)SubLObjectFactory.makeBoolean(module0221.NIL == var42_101);
                            }
                        }
                        finally {
                            final SubLObject var35_103 = Threads.$is_thread_performing_cleanupP$.currentBinding(var85);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0221.T, var85);
                                if (module0221.NIL != var95) {
                                    module0158.f10319(var95);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var35_103, var85);
                            }
                        }
                    }
                    var91 = (SubLObject)SubLObjectFactory.makeBoolean(module0221.NIL == var94);
                }
            }
        }
        finally {
            module0148.$g2097$.rebind(var88, var85);
            module0148.$g2099$.rebind(var87, var85);
        }
        if (module0221.NIL != f14609(var82)) {
            var87 = module0148.$g2099$.currentBinding(var85);
            var88 = module0148.$g2097$.currentBinding(var85);
            try {
                module0148.$g2099$.bind((SubLObject)module0221.$ic24$, var85);
                module0148.$g2097$.bind(var82, var85);
                final SubLObject var89 = (SubLObject)module0221.NIL;
                if (module0221.NIL != module0158.f10010(var7, module0225.f14782(var83), var89)) {
                    final SubLObject var90 = module0158.f10011(var7, module0225.f14782(var83), var89);
                    SubLObject var91 = (SubLObject)module0221.NIL;
                    final SubLObject var92 = (SubLObject)module0221.NIL;
                    while (module0221.NIL == var91) {
                        final SubLObject var93 = module0052.f3695(var90, var92);
                        final SubLObject var94 = (SubLObject)SubLObjectFactory.makeBoolean(!var92.eql(var93));
                        if (module0221.NIL != var94) {
                            SubLObject var95 = (SubLObject)module0221.NIL;
                            try {
                                var95 = module0158.f10316(var93, (SubLObject)module0221.$ic23$, (SubLObject)module0221.$ic9$, (SubLObject)module0221.NIL);
                                SubLObject var39_100 = (SubLObject)module0221.NIL;
                                final SubLObject var40_101 = (SubLObject)module0221.NIL;
                                while (module0221.NIL == var39_100) {
                                    final SubLObject var96 = module0052.f3695(var95, var40_101);
                                    final SubLObject var42_102 = (SubLObject)SubLObjectFactory.makeBoolean(!var40_101.eql(var96));
                                    if (module0221.NIL != var42_102) {
                                        final SubLObject var35_104 = module0221.$g2399$.currentBinding(var85);
                                        try {
                                            module0221.$g2399$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0221.NIL == module0221.$g2399$.getDynamicValue(var85)), var85);
                                            final SubLObject var99 = f14611(var96, var84);
                                            if (module0221.NIL != module0018.$g593$.getDynamicValue(var85)) {
                                                final SubLObject var100 = var99;
                                                if (module0221.NIL == conses_high.member(var100, var86, module0018.$g593$.getDynamicValue(var85), Symbols.symbol_function((SubLObject)module0221.IDENTITY))) {
                                                    var86 = (SubLObject)ConsesLow.cons(var100, var86);
                                                }
                                            }
                                            else {
                                                var86 = (SubLObject)ConsesLow.cons(var99, var86);
                                            }
                                        }
                                        finally {
                                            module0221.$g2399$.rebind(var35_104, var85);
                                        }
                                    }
                                    var39_100 = (SubLObject)SubLObjectFactory.makeBoolean(module0221.NIL == var42_102);
                                }
                            }
                            finally {
                                final SubLObject var35_105 = Threads.$is_thread_performing_cleanupP$.currentBinding(var85);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0221.T, var85);
                                    if (module0221.NIL != var95) {
                                        module0158.f10319(var95);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var35_105, var85);
                                }
                            }
                        }
                        var91 = (SubLObject)SubLObjectFactory.makeBoolean(module0221.NIL == var94);
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
        if (var83 == module0221.UNPROVIDED) {
            var83 = (SubLObject)module0221.ONE_INTEGER;
        }
        if (var84 == module0221.UNPROVIDED) {
            var84 = (SubLObject)module0221.TWO_INTEGER;
        }
        final SubLThread var85 = SubLProcess.currentSubLThread();
        assert module0221.NIL != module0161.f10481(var54) : var54;
        SubLObject var86 = (SubLObject)module0221.NIL;
        final SubLObject var87 = module0147.$g2094$.currentBinding(var85);
        final SubLObject var88 = module0147.$g2095$.currentBinding(var85);
        try {
            module0147.$g2094$.bind((SubLObject)module0221.$ic32$, var85);
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
        if (var83 == module0221.UNPROVIDED) {
            var83 = (SubLObject)module0221.ONE_INTEGER;
        }
        if (var84 == module0221.UNPROVIDED) {
            var84 = (SubLObject)module0221.TWO_INTEGER;
        }
        final SubLThread var98 = SubLProcess.currentSubLThread();
        assert module0221.NIL != Types.listp(var97) : var97;
        SubLObject var99 = (SubLObject)module0221.NIL;
        final SubLObject var100 = module0147.$g2094$.currentBinding(var98);
        final SubLObject var101 = module0147.$g2096$.currentBinding(var98);
        try {
            module0147.$g2094$.bind((SubLObject)module0221.$ic34$, var98);
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
        if (var83 == module0221.UNPROVIDED) {
            var83 = (SubLObject)module0221.ONE_INTEGER;
        }
        if (var84 == module0221.UNPROVIDED) {
            var84 = (SubLObject)module0221.TWO_INTEGER;
        }
        final SubLThread var85 = SubLProcess.currentSubLThread();
        SubLObject var86 = (SubLObject)module0221.NIL;
        final SubLObject var87 = module0147.$g2094$.currentBinding(var85);
        final SubLObject var88 = module0147.$g2095$.currentBinding(var85);
        try {
            module0147.$g2094$.bind((SubLObject)module0221.$ic25$, var85);
            module0147.$g2095$.bind(module0221.$ic26$, var85);
            var86 = f14619(var7, var82, var83, var84);
        }
        finally {
            module0147.$g2095$.rebind(var88, var85);
            module0147.$g2094$.rebind(var87, var85);
        }
        return var86;
    }
    
    public static SubLObject f14623(final SubLObject var7, final SubLObject var82, SubLObject var54, SubLObject var83, SubLObject var84) {
        if (var54 == module0221.UNPROVIDED) {
            var54 = (SubLObject)module0221.NIL;
        }
        if (var83 == module0221.UNPROVIDED) {
            var83 = (SubLObject)module0221.ONE_INTEGER;
        }
        if (var84 == module0221.UNPROVIDED) {
            var84 = (SubLObject)module0221.TWO_INTEGER;
        }
        final SubLThread var85 = SubLProcess.currentSubLThread();
        SubLObject var86 = (SubLObject)module0221.NIL;
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
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0221.$ic35$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0221.NIL;
        SubLObject var7 = (SubLObject)module0221.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0221.$ic35$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0221.$ic35$);
        var7 = var4.first();
        var4 = var4.rest();
        if (module0221.NIL == var4) {
            final SubLObject var8;
            var4 = (var8 = var5);
            return (SubLObject)ConsesLow.listS((SubLObject)module0221.$ic36$, (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)module0221.$ic37$, var7)), ConsesLow.append(var8, (SubLObject)module0221.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0221.$ic35$);
        return (SubLObject)module0221.NIL;
    }
    
    public static SubLObject f14625(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0221.$ic35$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0221.NIL;
        SubLObject var7 = (SubLObject)module0221.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0221.$ic35$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0221.$ic35$);
        var7 = var4.first();
        var4 = var4.rest();
        if (module0221.NIL == var4) {
            final SubLObject var8;
            var4 = (var8 = var5);
            return (SubLObject)ConsesLow.listS((SubLObject)module0221.$ic36$, (SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)module0221.$ic38$, var7)), ConsesLow.append(var8, (SubLObject)module0221.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0221.$ic35$);
        return (SubLObject)module0221.NIL;
    }
    
    public static SubLObject f14626(final SubLObject var7, final SubLObject var82, SubLObject var54, SubLObject var83, SubLObject var115) {
        if (var54 == module0221.UNPROVIDED) {
            var54 = (SubLObject)module0221.NIL;
        }
        if (var83 == module0221.UNPROVIDED) {
            var83 = (SubLObject)module0221.ONE_INTEGER;
        }
        if (var115 == module0221.UNPROVIDED) {
            var115 = (SubLObject)module0221.$ic9$;
        }
        SubLObject var116 = module0260.f17034(var82, (SubLObject)module0221.UNPROVIDED, (SubLObject)module0221.UNPROVIDED);
        SubLObject var117 = (SubLObject)module0221.NIL;
        var117 = var116.first();
        while (module0221.NIL != var116) {
            if (module0221.NIL != module0220.f14548(var7, var117, var54, var83, var115)) {
                return (SubLObject)module0221.T;
            }
            var116 = var116.rest();
            var117 = var116.first();
        }
        return (SubLObject)module0221.NIL;
    }
    
    public static SubLObject f14627(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0221.$ic39$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0221.NIL;
        SubLObject var7 = (SubLObject)module0221.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0221.$ic39$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0221.$ic39$);
        var7 = var4.first();
        var4 = var4.rest();
        SubLObject var8 = (SubLObject)module0221.NIL;
        SubLObject var9 = var4;
        SubLObject var10 = (SubLObject)module0221.NIL;
        SubLObject var124_125 = (SubLObject)module0221.NIL;
        while (module0221.NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0221.$ic39$);
            var124_125 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var3, (SubLObject)module0221.$ic39$);
            if (module0221.NIL == conses_high.member(var124_125, (SubLObject)module0221.$ic40$, (SubLObject)module0221.UNPROVIDED, (SubLObject)module0221.UNPROVIDED)) {
                var10 = (SubLObject)module0221.T;
            }
            if (var124_125 == module0221.$ic2$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (module0221.NIL != var10 && module0221.NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0221.$ic39$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)module0221.$ic8$, var4);
        final SubLObject var12 = (SubLObject)((module0221.NIL != var11) ? conses_high.cadr(var11) : module0221.NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)module0221.$ic4$, var4);
        final SubLObject var14 = (SubLObject)((module0221.NIL != var13) ? conses_high.cadr(var13) : module0221.NIL);
        final SubLObject var15;
        var4 = (var15 = var5);
        final SubLObject var16 = (SubLObject)module0221.$ic41$;
        return (SubLObject)ConsesLow.list((SubLObject)module0221.$ic5$, (SubLObject)ConsesLow.list((SubLObject)module0221.$ic42$, (SubLObject)ConsesLow.list(var16, var7), (SubLObject)ConsesLow.listS((SubLObject)module0221.$ic43$, (SubLObject)ConsesLow.list(var6, var16, (SubLObject)module0221.$ic8$, var12, (SubLObject)module0221.$ic4$, var14), ConsesLow.append(var15, (SubLObject)module0221.NIL))), (SubLObject)ConsesLow.list((SubLObject)module0221.$ic10$, (SubLObject)ConsesLow.list((SubLObject)module0221.$ic44$, var7), (SubLObject)ConsesLow.list((SubLObject)module0221.$ic14$, (SubLObject)module0221.$ic15$, (SubLObject)ConsesLow.list((SubLObject)module0221.$ic45$, (SubLObject)ConsesLow.list(var16, var7), (SubLObject)ConsesLow.listS((SubLObject)module0221.$ic43$, (SubLObject)ConsesLow.list(var6, var16, (SubLObject)module0221.$ic8$, var12, (SubLObject)module0221.$ic4$, var14), ConsesLow.append(var15, (SubLObject)module0221.NIL))))));
    }
    
    public static SubLObject f14628(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0221.$ic46$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0221.NIL;
        SubLObject var7 = (SubLObject)module0221.NIL;
        SubLObject var8 = (SubLObject)module0221.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0221.$ic46$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0221.$ic46$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0221.$ic46$);
        var8 = var4.first();
        var4 = var4.rest();
        final SubLObject var9 = (SubLObject)(var4.isCons() ? var4.first() : module0221.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0221.$ic46$);
        var4 = var4.rest();
        if (module0221.NIL == var4) {
            final SubLObject var10;
            var4 = (var10 = var5);
            final SubLObject var11 = (SubLObject)module0221.$ic47$;
            return (SubLObject)ConsesLow.list((SubLObject)module0221.$ic48$, (SubLObject)ConsesLow.list((SubLObject)module0221.$ic42$, (SubLObject)ConsesLow.list(var11, var7), (SubLObject)ConsesLow.listS((SubLObject)module0221.$ic43$, (SubLObject)ConsesLow.list(var6, var11, (SubLObject)module0221.$ic8$, var9, (SubLObject)module0221.$ic4$, var8), ConsesLow.append(var10, (SubLObject)module0221.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0221.$ic46$);
        return (SubLObject)module0221.NIL;
    }
    
    public static SubLObject f14629(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0221.$ic49$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0221.NIL;
        SubLObject var7 = (SubLObject)module0221.NIL;
        SubLObject var8 = (SubLObject)module0221.NIL;
        SubLObject var9 = (SubLObject)module0221.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0221.$ic49$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0221.$ic49$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0221.$ic49$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0221.$ic49$);
        var9 = var4.first();
        var4 = var4.rest();
        final SubLObject var10 = (SubLObject)(var4.isCons() ? var4.first() : module0221.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0221.$ic49$);
        var4 = var4.rest();
        final SubLObject var11 = (SubLObject)(var4.isCons() ? var4.first() : module0221.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0221.$ic49$);
        var4 = var4.rest();
        if (module0221.NIL == var4) {
            final SubLObject var12;
            var4 = (var12 = var5);
            final SubLObject var13 = (SubLObject)module0221.$ic50$;
            return (SubLObject)ConsesLow.list((SubLObject)module0221.$ic42$, (SubLObject)ConsesLow.list(var13, var8), (SubLObject)ConsesLow.listS((SubLObject)module0221.$ic7$, (SubLObject)ConsesLow.list(new SubLObject[] { var6, var7, module0221.$ic51$, var13, module0221.$ic3$, var10, module0221.$ic8$, var11, module0221.$ic4$, var9 }), ConsesLow.append(var12, (SubLObject)module0221.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0221.$ic49$);
        return (SubLObject)module0221.NIL;
    }
    
    public static SubLObject f14630(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0221.$ic49$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)module0221.NIL;
        SubLObject var7 = (SubLObject)module0221.NIL;
        SubLObject var8 = (SubLObject)module0221.NIL;
        SubLObject var9 = (SubLObject)module0221.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0221.$ic49$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0221.$ic49$);
        var7 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0221.$ic49$);
        var8 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0221.$ic49$);
        var9 = var4.first();
        var4 = var4.rest();
        final SubLObject var10 = (SubLObject)(var4.isCons() ? var4.first() : module0221.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0221.$ic49$);
        var4 = var4.rest();
        final SubLObject var11 = (SubLObject)(var4.isCons() ? var4.first() : module0221.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var4, var3, (SubLObject)module0221.$ic49$);
        var4 = var4.rest();
        if (module0221.NIL == var4) {
            final SubLObject var12;
            var4 = (var12 = var5);
            return (SubLObject)ConsesLow.list((SubLObject)module0221.$ic48$, (SubLObject)ConsesLow.listS((SubLObject)module0221.$ic52$, (SubLObject)ConsesLow.list(var6, var7, var8, var9, var10, var11), ConsesLow.append(var12, (SubLObject)module0221.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)module0221.$ic49$);
        return (SubLObject)module0221.NIL;
    }
    
    public static SubLObject f14631(final SubLObject var82, SubLObject var54) {
        if (var54 == module0221.UNPROVIDED) {
            var54 = (SubLObject)module0221.NIL;
        }
        final SubLThread var83 = SubLProcess.currentSubLThread();
        SubLObject var84 = (SubLObject)module0221.ZERO_INTEGER;
        final SubLObject var85 = var54;
        final SubLObject var86 = module0147.$g2094$.currentBinding(var83);
        final SubLObject var87 = module0147.$g2095$.currentBinding(var83);
        try {
            module0147.$g2094$.bind(module0147.f9531(var85), var83);
            module0147.$g2095$.bind(module0147.f9534(var85), var83);
            SubLObject var88 = module0260.f17034(var82, (SubLObject)module0221.UNPROVIDED, (SubLObject)module0221.UNPROVIDED);
            SubLObject var89 = (SubLObject)module0221.NIL;
            var89 = var88.first();
            while (module0221.NIL != var88) {
                var84 = Numbers.add(var84, module0217.f14247(var89, (SubLObject)module0221.UNPROVIDED));
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
        return (SubLObject)module0221.NIL;
    }
    
    public static SubLObject f14633() {
        module0221.$g2399$ = SubLFiles.defparameter("S#17422", (SubLObject)module0221.NIL);
        return (SubLObject)module0221.NIL;
    }
    
    public static SubLObject f14634() {
        module0002.f50((SubLObject)module0221.$ic11$, (SubLObject)module0221.$ic16$);
        module0002.f50((SubLObject)module0221.$ic19$, (SubLObject)module0221.$ic20$);
        return (SubLObject)module0221.NIL;
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
        module0221.$g2399$ = null;
        $ic0$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#717", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#134", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic1$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic2$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic3$ = SubLObjectFactory.makeKeyword("INDEX");
        $ic4$ = SubLObjectFactory.makeKeyword("DONE");
        $ic5$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic6$ = SubLObjectFactory.makeSymbol("WITH-ALL-SPEC-PREDICATES");
        $ic7$ = SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDEX");
        $ic8$ = SubLObjectFactory.makeKeyword("TRUTH");
        $ic9$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic10$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic11$ = SubLObjectFactory.makeSymbol("S#17400", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#12358", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#17399", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("CLET");
        $ic15$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#17422", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)SubLObjectFactory.makeSymbol("S#17422", "CYC"))));
        $ic16$ = SubLObjectFactory.makeSymbol("S#12705", "CYC");
        $ic17$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("GATHER-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("S#717", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#134", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic18$ = SubLObjectFactory.makeUninternedSymbol("US#67B23EC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#17401", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#12706", "CYC");
        $ic21$ = SubLObjectFactory.makeKeyword("MAPPING-DONE");
        $ic22$ = SubLObjectFactory.makeSymbol("S#12347", "CYC");
        $ic23$ = SubLObjectFactory.makeKeyword("GAF");
        $ic24$ = SubLObjectFactory.makeSymbol("S#12348", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic26$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic27$ = SubLObjectFactory.makeSymbol("S#12276", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("INDEXED-TERM-P");
        $ic29$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic30$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic31$ = SubLObjectFactory.makeSymbol("S#12263", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("S#12278", "CYC");
        $ic33$ = SubLObjectFactory.makeSymbol("LISTP");
        $ic34$ = SubLObjectFactory.makeSymbol("S#12277", "CYC");
        $ic35$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic36$ = SubLObjectFactory.makeSymbol("CDOLIST");
        $ic37$ = SubLObjectFactory.makeSymbol("ALL-SPEC-PREDS");
        $ic38$ = SubLObjectFactory.makeSymbol("ALL-SPEC-INVERSES");
        $ic39$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic40$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic41$ = SubLObjectFactory.makeUninternedSymbol("US#1169C35");
        $ic42$ = SubLObjectFactory.makeSymbol("S#17414", "CYC");
        $ic43$ = SubLObjectFactory.makeSymbol("DO-PREDICATE-EXTENT-INDEX");
        $ic44$ = SubLObjectFactory.makeSymbol("S#17398", "CYC");
        $ic45$ = SubLObjectFactory.makeSymbol("S#17415", "CYC");
        $ic46$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic47$ = SubLObjectFactory.makeUninternedSymbol("US#1169C35");
        $ic48$ = SubLObjectFactory.makeSymbol("WITH-ALL-MTS");
        $ic49$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#134", "CYC"), (SubLObject)module0221.ONE_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("S#12576", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic50$ = SubLObjectFactory.makeUninternedSymbol("US#1169C35");
        $ic51$ = SubLObjectFactory.makeKeyword("PREDICATE");
        $ic52$ = SubLObjectFactory.makeSymbol("S#17419", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0221.class
	Total time: 694 ms
	
	Decompiled with Procyon 0.5.32.
*/