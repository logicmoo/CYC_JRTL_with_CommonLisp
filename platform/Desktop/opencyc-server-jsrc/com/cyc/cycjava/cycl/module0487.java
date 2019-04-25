package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0487 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0487";
    public static final String myFingerPrint = "2ba04d75e6613f80b13183db713fc9c04c4683f5c4869c614497bdf6201aa819";
    public static SubLSymbol $g3707$;
    public static SubLSymbol $g3708$;
    private static SubLSymbol $g3709$;
    private static SubLSymbol $g3710$;
    private static SubLSymbol $g3711$;
    private static SubLSymbol $g3712$;
    private static SubLSymbol $g3713$;
    private static SubLSymbol $g3714$;
    private static SubLSymbol $g3715$;
    private static SubLSymbol $g3716$;
    private static SubLSymbol $g3717$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLObject $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLObject $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLList $ic22$;
    private static final SubLInteger $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLList $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLList $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLList $ic32$;
    
    public static SubLObject f31954() {
        return Hashtables.make_hash_table((SubLObject)module0487.TWENTY_INTEGER, (SubLObject)module0487.UNPROVIDED, (SubLObject)module0487.UNPROVIDED);
    }
    
    public static SubLObject f31955() {
        return Hashtables.make_hash_table((SubLObject)module0487.TEN_INTEGER, (SubLObject)module0487.UNPROVIDED, (SubLObject)module0487.UNPROVIDED);
    }
    
    public static SubLObject f31956(final SubLObject var1, final SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var3 == module0487.UNPROVIDED) {
            var3 = (SubLObject)module0487.NIL;
        }
        if (var4 == module0487.UNPROVIDED) {
            var4 = (SubLObject)module0487.T;
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        assert module0487.NIL != module0173.f10955(var1) : var1;
        SubLObject var6 = (SubLObject)module0487.NIL;
        final SubLObject var7 = module0487.$g3711$.currentBinding(var5);
        final SubLObject var8 = module0487.$g3712$.currentBinding(var5);
        final SubLObject var9 = module0487.$g3709$.currentBinding(var5);
        try {
            module0487.$g3711$.bind(f31954(), var5);
            module0487.$g3712$.bind(var2, var5);
            module0487.$g3709$.bind((SubLObject)module0487.NIL, var5);
            SubLObject var10 = (SubLObject)module0487.NIL;
            try {
                var5.throwStack.push(module0487.$ic1$);
                final SubLObject var11 = var3;
                final SubLObject var7_12 = module0147.$g2095$.currentBinding(var5);
                final SubLObject var8_13 = module0147.$g2094$.currentBinding(var5);
                final SubLObject var9_14 = module0147.$g2096$.currentBinding(var5);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var11), var5);
                    module0147.$g2094$.bind(module0147.f9546(var11), var5);
                    module0147.$g2096$.bind(module0147.f9549(var11), var5);
                    f31957(var1);
                    if (module0487.NIL != var4) {
                        SubLObject var12 = (SubLObject)module0487.NIL;
                        final SubLObject var13 = module0487.$ic2$;
                        if (module0487.NIL != module0158.f10010(var1, (SubLObject)module0487.ONE_INTEGER, var13)) {
                            final SubLObject var14 = module0158.f10011(var1, (SubLObject)module0487.ONE_INTEGER, var13);
                            SubLObject var15 = (SubLObject)module0487.NIL;
                            final SubLObject var16 = (SubLObject)module0487.NIL;
                            while (module0487.NIL == var15) {
                                final SubLObject var17 = module0052.f3695(var14, var16);
                                final SubLObject var18 = (SubLObject)SubLObjectFactory.makeBoolean(!var16.eql(var17));
                                if (module0487.NIL != var18) {
                                    SubLObject var19 = (SubLObject)module0487.NIL;
                                    try {
                                        var19 = module0158.f10316(var17, (SubLObject)module0487.$ic3$, (SubLObject)module0487.$ic4$, (SubLObject)module0487.NIL);
                                        SubLObject var18_23 = (SubLObject)module0487.NIL;
                                        final SubLObject var19_24 = (SubLObject)module0487.NIL;
                                        while (module0487.NIL == var18_23) {
                                            final SubLObject var20 = module0052.f3695(var19, var19_24);
                                            final SubLObject var21_26 = (SubLObject)SubLObjectFactory.makeBoolean(!var19_24.eql(var20));
                                            if (module0487.NIL != var21_26) {
                                                var12 = module0178.f11331(var20, (SubLObject)module0487.TWO_INTEGER);
                                                final SubLObject var7_13 = module0487.$g3713$.currentBinding(var5);
                                                final SubLObject var8_14 = module0487.$g3714$.currentBinding(var5);
                                                try {
                                                    module0487.$g3713$.bind(var12, var5);
                                                    module0487.$g3714$.bind((SubLObject)module0487.NIL, var5);
                                                    f31958(var12);
                                                }
                                                finally {
                                                    module0487.$g3714$.rebind(var8_14, var5);
                                                    module0487.$g3713$.rebind(var7_13, var5);
                                                }
                                            }
                                            var18_23 = (SubLObject)SubLObjectFactory.makeBoolean(module0487.NIL == var21_26);
                                        }
                                    }
                                    finally {
                                        final SubLObject var7_14 = Threads.$is_thread_performing_cleanupP$.currentBinding(var5);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0487.T, var5);
                                            if (module0487.NIL != var19) {
                                                module0158.f10319(var19);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var7_14, var5);
                                        }
                                    }
                                }
                                var15 = (SubLObject)SubLObjectFactory.makeBoolean(module0487.NIL == var18);
                            }
                        }
                        final SubLObject var7_15 = module0487.$g3713$.currentBinding(var5);
                        final SubLObject var8_15 = module0487.$g3714$.currentBinding(var5);
                        try {
                            module0487.$g3713$.bind(var1, var5);
                            module0487.$g3714$.bind((SubLObject)module0487.NIL, var5);
                            SubLObject var21 = (SubLObject)module0487.NIL;
                            final SubLObject var22 = module0487.$ic5$;
                            if (module0487.NIL != module0158.f10010(var1, (SubLObject)module0487.ONE_INTEGER, var22)) {
                                final SubLObject var23 = module0158.f10011(var1, (SubLObject)module0487.ONE_INTEGER, var22);
                                SubLObject var24 = (SubLObject)module0487.NIL;
                                final SubLObject var25 = (SubLObject)module0487.NIL;
                                while (module0487.NIL == var24) {
                                    final SubLObject var26 = module0052.f3695(var23, var25);
                                    final SubLObject var27 = (SubLObject)SubLObjectFactory.makeBoolean(!var25.eql(var26));
                                    if (module0487.NIL != var27) {
                                        SubLObject var28 = (SubLObject)module0487.NIL;
                                        try {
                                            var28 = module0158.f10316(var26, (SubLObject)module0487.$ic3$, (SubLObject)module0487.$ic4$, (SubLObject)module0487.NIL);
                                            SubLObject var18_24 = (SubLObject)module0487.NIL;
                                            final SubLObject var19_25 = (SubLObject)module0487.NIL;
                                            while (module0487.NIL == var18_24) {
                                                final SubLObject var29 = module0052.f3695(var28, var19_25);
                                                final SubLObject var21_27 = (SubLObject)SubLObjectFactory.makeBoolean(!var19_25.eql(var29));
                                                if (module0487.NIL != var21_27) {
                                                    var21 = module0178.f11331(var29, (SubLObject)module0487.TWO_INTEGER);
                                                    f31958(var21);
                                                }
                                                var18_24 = (SubLObject)SubLObjectFactory.makeBoolean(module0487.NIL == var21_27);
                                            }
                                        }
                                        finally {
                                            final SubLObject var7_16 = Threads.$is_thread_performing_cleanupP$.currentBinding(var5);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0487.T, var5);
                                                if (module0487.NIL != var28) {
                                                    module0158.f10319(var28);
                                                }
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var7_16, var5);
                                            }
                                        }
                                    }
                                    var24 = (SubLObject)SubLObjectFactory.makeBoolean(module0487.NIL == var27);
                                }
                            }
                        }
                        finally {
                            module0487.$g3714$.rebind(var8_15, var5);
                            module0487.$g3713$.rebind(var7_15, var5);
                        }
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var9_14, var5);
                    module0147.$g2094$.rebind(var8_13, var5);
                    module0147.$g2095$.rebind(var7_12, var5);
                }
            }
            catch (Throwable var30) {
                var10 = Errors.handleThrowable(var30, (SubLObject)module0487.$ic1$);
            }
            finally {
                var5.throwStack.pop();
            }
            var6 = module0487.$g3709$.getDynamicValue(var5);
        }
        finally {
            module0487.$g3709$.rebind(var9, var5);
            module0487.$g3712$.rebind(var8, var5);
            module0487.$g3711$.rebind(var7, var5);
        }
        return var6;
    }
    
    public static SubLObject f31959(final SubLObject var1, final SubLObject var38, final SubLObject var39, SubLObject var3) {
        if (var3 == module0487.UNPROVIDED) {
            var3 = (SubLObject)module0487.NIL;
        }
        final SubLThread var40 = SubLProcess.currentSubLThread();
        assert module0487.NIL != module0173.f10955(var1) : var1;
        SubLObject var41 = (SubLObject)module0487.NIL;
        final SubLObject var42 = module0487.$g3707$.currentBinding(var40);
        final SubLObject var43 = module0487.$g3708$.currentBinding(var40);
        try {
            module0487.$g3707$.bind(var38, var40);
            module0487.$g3708$.bind(var39, var40);
            var41 = f31960(var1, var3);
        }
        finally {
            module0487.$g3708$.rebind(var43, var40);
            module0487.$g3707$.rebind(var42, var40);
        }
        return var41;
    }
    
    public static SubLObject f31961(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        if (var40.equal(module0487.$g3712$.getDynamicValue(var41))) {
            module0487.$g3709$.setDynamicValue((SubLObject)module0487.T, var41);
            module0012.f425();
        }
        return (SubLObject)module0487.NIL;
    }
    
    public static SubLObject f31957(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        if (module0487.NIL == Hashtables.gethash(var40, module0487.$g3711$.getDynamicValue(var41), (SubLObject)module0487.UNPROVIDED)) {
            Hashtables.sethash(var40, module0487.$g3711$.getDynamicValue(var41), (SubLObject)module0487.T);
            if (module0487.NIL != module0173.f10955(var40)) {
                SubLObject var42 = module0148.$g2099$.currentBinding(var41);
                SubLObject var43 = module0148.$g2097$.currentBinding(var41);
                try {
                    module0148.$g2099$.bind((SubLObject)module0487.$ic6$, var41);
                    module0148.$g2097$.bind(module0487.$ic7$, var41);
                    final SubLObject var44 = (SubLObject)module0487.NIL;
                    if (module0487.NIL != module0158.f10010(var40, (SubLObject)module0487.ONE_INTEGER, var44)) {
                        final SubLObject var45 = module0158.f10011(var40, (SubLObject)module0487.ONE_INTEGER, var44);
                        SubLObject var46 = (SubLObject)module0487.NIL;
                        final SubLObject var47 = (SubLObject)module0487.NIL;
                        while (module0487.NIL == var46) {
                            final SubLObject var48 = module0052.f3695(var45, var47);
                            final SubLObject var49 = (SubLObject)SubLObjectFactory.makeBoolean(!var47.eql(var48));
                            if (module0487.NIL != var49) {
                                SubLObject var50 = (SubLObject)module0487.NIL;
                                try {
                                    var50 = module0158.f10316(var48, (SubLObject)module0487.$ic3$, (SubLObject)module0487.$ic4$, (SubLObject)module0487.NIL);
                                    SubLObject var18_41 = (SubLObject)module0487.NIL;
                                    final SubLObject var19_42 = (SubLObject)module0487.NIL;
                                    while (module0487.NIL == var18_41) {
                                        final SubLObject var51 = module0052.f3695(var50, var19_42);
                                        final SubLObject var21_44 = (SubLObject)SubLObjectFactory.makeBoolean(!var19_42.eql(var51));
                                        if (module0487.NIL != var21_44) {
                                            final SubLObject var52 = module0221.f14611(var51, (SubLObject)module0487.TWO_INTEGER);
                                            f31961(var52);
                                        }
                                        var18_41 = (SubLObject)SubLObjectFactory.makeBoolean(module0487.NIL == var21_44);
                                    }
                                }
                                finally {
                                    final SubLObject var7_46 = Threads.$is_thread_performing_cleanupP$.currentBinding(var41);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0487.T, var41);
                                        if (module0487.NIL != var50) {
                                            module0158.f10319(var50);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var7_46, var41);
                                    }
                                }
                            }
                            var46 = (SubLObject)SubLObjectFactory.makeBoolean(module0487.NIL == var49);
                        }
                    }
                }
                finally {
                    module0148.$g2097$.rebind(var43, var41);
                    module0148.$g2099$.rebind(var42, var41);
                }
                if (module0487.NIL != module0221.f14609(module0487.$ic7$)) {
                    var42 = module0148.$g2099$.currentBinding(var41);
                    var43 = module0148.$g2097$.currentBinding(var41);
                    try {
                        module0148.$g2099$.bind((SubLObject)module0487.$ic8$, var41);
                        module0148.$g2097$.bind(module0487.$ic7$, var41);
                        final SubLObject var44 = (SubLObject)module0487.NIL;
                        if (module0487.NIL != module0158.f10010(var40, module0225.f14782((SubLObject)module0487.ONE_INTEGER), var44)) {
                            final SubLObject var45 = module0158.f10011(var40, module0225.f14782((SubLObject)module0487.ONE_INTEGER), var44);
                            SubLObject var46 = (SubLObject)module0487.NIL;
                            final SubLObject var47 = (SubLObject)module0487.NIL;
                            while (module0487.NIL == var46) {
                                final SubLObject var48 = module0052.f3695(var45, var47);
                                final SubLObject var49 = (SubLObject)SubLObjectFactory.makeBoolean(!var47.eql(var48));
                                if (module0487.NIL != var49) {
                                    SubLObject var50 = (SubLObject)module0487.NIL;
                                    try {
                                        var50 = module0158.f10316(var48, (SubLObject)module0487.$ic3$, (SubLObject)module0487.$ic4$, (SubLObject)module0487.NIL);
                                        SubLObject var18_42 = (SubLObject)module0487.NIL;
                                        final SubLObject var19_43 = (SubLObject)module0487.NIL;
                                        while (module0487.NIL == var18_42) {
                                            final SubLObject var51 = module0052.f3695(var50, var19_43);
                                            final SubLObject var21_45 = (SubLObject)SubLObjectFactory.makeBoolean(!var19_43.eql(var51));
                                            if (module0487.NIL != var21_45) {
                                                final SubLObject var7_47 = module0221.$g2399$.currentBinding(var41);
                                                try {
                                                    module0221.$g2399$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0487.NIL == module0221.$g2399$.getDynamicValue(var41)), var41);
                                                    final SubLObject var53 = module0221.f14611(var51, (SubLObject)module0487.TWO_INTEGER);
                                                    f31961(var53);
                                                }
                                                finally {
                                                    module0221.$g2399$.rebind(var7_47, var41);
                                                }
                                            }
                                            var18_42 = (SubLObject)SubLObjectFactory.makeBoolean(module0487.NIL == var21_45);
                                        }
                                    }
                                    finally {
                                        final SubLObject var7_48 = Threads.$is_thread_performing_cleanupP$.currentBinding(var41);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0487.T, var41);
                                            if (module0487.NIL != var50) {
                                                module0158.f10319(var50);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var7_48, var41);
                                        }
                                    }
                                }
                                var46 = (SubLObject)SubLObjectFactory.makeBoolean(module0487.NIL == var49);
                            }
                        }
                    }
                    finally {
                        module0148.$g2097$.rebind(var43, var41);
                        module0148.$g2099$.rebind(var42, var41);
                    }
                }
            }
        }
        return (SubLObject)module0487.NIL;
    }
    
    public static SubLObject f31958(final SubLObject var52) {
        final SubLThread var53 = SubLProcess.currentSubLThread();
        if (module0487.NIL == Hashtables.gethash(var52, module0487.$g3711$.getDynamicValue(var53), (SubLObject)module0487.UNPROVIDED) && module0487.NIL != f31962(var52)) {
            f31957(var52);
            if (module0487.NIL != module0173.f10955(var52)) {
                SubLObject var54 = (SubLObject)module0487.NIL;
                final SubLObject var55 = module0487.$ic5$;
                if (module0487.NIL != module0158.f10010(var52, (SubLObject)module0487.ONE_INTEGER, var55)) {
                    final SubLObject var56 = module0158.f10011(var52, (SubLObject)module0487.ONE_INTEGER, var55);
                    SubLObject var57 = (SubLObject)module0487.NIL;
                    final SubLObject var58 = (SubLObject)module0487.NIL;
                    while (module0487.NIL == var57) {
                        final SubLObject var59 = module0052.f3695(var56, var58);
                        final SubLObject var60 = (SubLObject)SubLObjectFactory.makeBoolean(!var58.eql(var59));
                        if (module0487.NIL != var60) {
                            SubLObject var61 = (SubLObject)module0487.NIL;
                            try {
                                var61 = module0158.f10316(var59, (SubLObject)module0487.$ic3$, (SubLObject)module0487.$ic4$, (SubLObject)module0487.NIL);
                                SubLObject var18_53 = (SubLObject)module0487.NIL;
                                final SubLObject var19_54 = (SubLObject)module0487.NIL;
                                while (module0487.NIL == var18_53) {
                                    final SubLObject var62 = module0052.f3695(var61, var19_54);
                                    final SubLObject var21_55 = (SubLObject)SubLObjectFactory.makeBoolean(!var19_54.eql(var62));
                                    if (module0487.NIL != var21_55) {
                                        var54 = module0178.f11331(var62, (SubLObject)module0487.TWO_INTEGER);
                                        f31958(var54);
                                    }
                                    var18_53 = (SubLObject)SubLObjectFactory.makeBoolean(module0487.NIL == var21_55);
                                }
                            }
                            finally {
                                final SubLObject var63 = Threads.$is_thread_performing_cleanupP$.currentBinding(var53);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0487.T, var53);
                                    if (module0487.NIL != var61) {
                                        module0158.f10319(var61);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var63, var53);
                                }
                            }
                        }
                        var57 = (SubLObject)SubLObjectFactory.makeBoolean(module0487.NIL == var60);
                    }
                }
            }
        }
        return (SubLObject)module0487.NIL;
    }
    
    public static SubLObject f31962(final SubLObject var52) {
        final SubLThread var53 = SubLProcess.currentSubLThread();
        if (module0487.NIL == module0487.$g3707$.getDynamicValue(var53) && module0487.NIL == module0487.$g3708$.getDynamicValue(var53)) {
            return (SubLObject)module0487.T;
        }
        if (module0487.NIL == module0173.f10955(var52)) {
            return (SubLObject)module0487.NIL;
        }
        final SubLObject var54 = module0549.f33906(var52);
        if (module0487.NIL == module0487.$g3714$.getDynamicValue(var53)) {
            module0487.$g3714$.setDynamicValue(module0549.f33906(module0487.$g3713$.getDynamicValue(var53)), var53);
        }
        if (module0487.NIL != module0487.$g3707$.getDynamicValue(var53) && var54.numLE(module0487.$g3707$.getDynamicValue(var53))) {
            return (SubLObject)module0487.T;
        }
        if (module0487.NIL == module0487.$g3708$.getDynamicValue(var53)) {
            return (SubLObject)module0487.T;
        }
        if (module0487.$g3708$.getDynamicValue(var53).numE((SubLObject)module0487.ZERO_INTEGER)) {
            return (SubLObject)module0487.NIL;
        }
        if (module0487.$g3714$.getDynamicValue(var53).numE((SubLObject)module0487.ZERO_INTEGER)) {
            return (SubLObject)module0487.NIL;
        }
        return Numbers.numLE(var54, Numbers.multiply(module0487.$g3708$.getDynamicValue(var53), module0487.$g3714$.getDynamicValue(var53)));
    }
    
    public static SubLObject f31960(final SubLObject var1, SubLObject var3) {
        if (var3 == module0487.UNPROVIDED) {
            var3 = (SubLObject)module0487.NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        assert module0487.NIL != module0173.f10955(var1) : var1;
        SubLObject var5 = (SubLObject)module0487.NIL;
        final SubLObject var6 = module0487.$g3711$.currentBinding(var4);
        final SubLObject var7 = module0487.$g3710$.currentBinding(var4);
        final SubLObject var8 = module0487.$g3709$.currentBinding(var4);
        try {
            module0487.$g3711$.bind(f31954(), var4);
            module0487.$g3710$.bind(f31955(), var4);
            module0487.$g3709$.bind((SubLObject)module0487.NIL, var4);
            final SubLObject var9 = var3;
            final SubLObject var7_57 = module0147.$g2095$.currentBinding(var4);
            final SubLObject var8_58 = module0147.$g2094$.currentBinding(var4);
            final SubLObject var9_59 = module0147.$g2096$.currentBinding(var4);
            try {
                module0147.$g2095$.bind(module0147.f9545(var9), var4);
                module0147.$g2094$.bind(module0147.f9546(var9), var4);
                module0147.$g2096$.bind(module0147.f9549(var9), var4);
                f31963(var1);
                SubLObject var10 = (SubLObject)module0487.NIL;
                final SubLObject var11 = module0487.$ic2$;
                if (module0487.NIL != module0158.f10010(var1, (SubLObject)module0487.ONE_INTEGER, var11)) {
                    final SubLObject var12 = module0158.f10011(var1, (SubLObject)module0487.ONE_INTEGER, var11);
                    SubLObject var13 = (SubLObject)module0487.NIL;
                    final SubLObject var14 = (SubLObject)module0487.NIL;
                    while (module0487.NIL == var13) {
                        final SubLObject var15 = module0052.f3695(var12, var14);
                        final SubLObject var16 = (SubLObject)SubLObjectFactory.makeBoolean(!var14.eql(var15));
                        if (module0487.NIL != var16) {
                            SubLObject var17 = (SubLObject)module0487.NIL;
                            try {
                                var17 = module0158.f10316(var15, (SubLObject)module0487.$ic3$, (SubLObject)module0487.$ic4$, (SubLObject)module0487.NIL);
                                SubLObject var18_60 = (SubLObject)module0487.NIL;
                                final SubLObject var19_61 = (SubLObject)module0487.NIL;
                                while (module0487.NIL == var18_60) {
                                    final SubLObject var18 = module0052.f3695(var17, var19_61);
                                    final SubLObject var21_62 = (SubLObject)SubLObjectFactory.makeBoolean(!var19_61.eql(var18));
                                    if (module0487.NIL != var21_62) {
                                        var10 = module0178.f11331(var18, (SubLObject)module0487.TWO_INTEGER);
                                        final SubLObject var7_58 = module0487.$g3713$.currentBinding(var4);
                                        final SubLObject var8_59 = module0487.$g3714$.currentBinding(var4);
                                        try {
                                            module0487.$g3713$.bind(var10, var4);
                                            module0487.$g3714$.bind((SubLObject)module0487.NIL, var4);
                                            f31964(var10);
                                        }
                                        finally {
                                            module0487.$g3714$.rebind(var8_59, var4);
                                            module0487.$g3713$.rebind(var7_58, var4);
                                        }
                                    }
                                    var18_60 = (SubLObject)SubLObjectFactory.makeBoolean(module0487.NIL == var21_62);
                                }
                            }
                            finally {
                                final SubLObject var7_59 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0487.T, var4);
                                    if (module0487.NIL != var17) {
                                        module0158.f10319(var17);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var7_59, var4);
                                }
                            }
                        }
                        var13 = (SubLObject)SubLObjectFactory.makeBoolean(module0487.NIL == var16);
                    }
                }
                final SubLObject var7_60 = module0487.$g3713$.currentBinding(var4);
                final SubLObject var8_60 = module0487.$g3714$.currentBinding(var4);
                try {
                    module0487.$g3713$.bind(var1, var4);
                    module0487.$g3714$.bind((SubLObject)module0487.NIL, var4);
                    SubLObject var19 = (SubLObject)module0487.NIL;
                    final SubLObject var20 = module0487.$ic5$;
                    if (module0487.NIL != module0158.f10010(var1, (SubLObject)module0487.ONE_INTEGER, var20)) {
                        final SubLObject var21 = module0158.f10011(var1, (SubLObject)module0487.ONE_INTEGER, var20);
                        SubLObject var22 = (SubLObject)module0487.NIL;
                        final SubLObject var23 = (SubLObject)module0487.NIL;
                        while (module0487.NIL == var22) {
                            final SubLObject var24 = module0052.f3695(var21, var23);
                            final SubLObject var25 = (SubLObject)SubLObjectFactory.makeBoolean(!var23.eql(var24));
                            if (module0487.NIL != var25) {
                                SubLObject var26 = (SubLObject)module0487.NIL;
                                try {
                                    var26 = module0158.f10316(var24, (SubLObject)module0487.$ic3$, (SubLObject)module0487.$ic4$, (SubLObject)module0487.NIL);
                                    SubLObject var18_61 = (SubLObject)module0487.NIL;
                                    final SubLObject var19_62 = (SubLObject)module0487.NIL;
                                    while (module0487.NIL == var18_61) {
                                        final SubLObject var27 = module0052.f3695(var26, var19_62);
                                        final SubLObject var21_63 = (SubLObject)SubLObjectFactory.makeBoolean(!var19_62.eql(var27));
                                        if (module0487.NIL != var21_63) {
                                            var19 = module0178.f11331(var27, (SubLObject)module0487.TWO_INTEGER);
                                            f31964(var19);
                                        }
                                        var18_61 = (SubLObject)SubLObjectFactory.makeBoolean(module0487.NIL == var21_63);
                                    }
                                }
                                finally {
                                    final SubLObject var7_61 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0487.T, var4);
                                        if (module0487.NIL != var26) {
                                            module0158.f10319(var26);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var7_61, var4);
                                    }
                                }
                            }
                            var22 = (SubLObject)SubLObjectFactory.makeBoolean(module0487.NIL == var25);
                        }
                    }
                }
                finally {
                    module0487.$g3714$.rebind(var8_60, var4);
                    module0487.$g3713$.rebind(var7_60, var4);
                }
            }
            finally {
                module0147.$g2096$.rebind(var9_59, var4);
                module0147.$g2094$.rebind(var8_58, var4);
                module0147.$g2095$.rebind(var7_57, var4);
            }
            var5 = Sequences.nreverse(module0487.$g3709$.getDynamicValue(var4));
        }
        finally {
            module0487.$g3709$.rebind(var8, var4);
            module0487.$g3710$.rebind(var7, var4);
            module0487.$g3711$.rebind(var6, var4);
        }
        return var5;
    }
    
    public static SubLObject f31965(final SubLObject var1, final SubLObject var38, final SubLObject var39, SubLObject var3) {
        if (var3 == module0487.UNPROVIDED) {
            var3 = (SubLObject)module0487.NIL;
        }
        final SubLThread var40 = SubLProcess.currentSubLThread();
        assert module0487.NIL != module0173.f10955(var1) : var1;
        SubLObject var41 = (SubLObject)module0487.NIL;
        final SubLObject var42 = module0487.$g3707$.currentBinding(var40);
        final SubLObject var43 = module0487.$g3708$.currentBinding(var40);
        try {
            module0487.$g3707$.bind(var38, var40);
            module0487.$g3708$.bind(var39, var40);
            var41 = f31960(var1, var3);
        }
        finally {
            module0487.$g3708$.rebind(var43, var40);
            module0487.$g3707$.rebind(var42, var40);
        }
        return var41;
    }
    
    public static SubLObject f31966(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        if (module0487.NIL == Hashtables.gethash(var40, module0487.$g3710$.getDynamicValue(var41), (SubLObject)module0487.UNPROVIDED)) {
            Hashtables.sethash(var40, module0487.$g3710$.getDynamicValue(var41), (SubLObject)module0487.T);
            module0487.$g3709$.setDynamicValue((SubLObject)ConsesLow.cons(var40, module0487.$g3709$.getDynamicValue(var41)), var41);
        }
        return (SubLObject)module0487.NIL;
    }
    
    public static SubLObject f31963(final SubLObject var40) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        if (module0487.NIL == Hashtables.gethash(var40, module0487.$g3711$.getDynamicValue(var41), (SubLObject)module0487.UNPROVIDED)) {
            Hashtables.sethash(var40, module0487.$g3711$.getDynamicValue(var41), (SubLObject)module0487.T);
            if (module0487.NIL != module0173.f10955(var40)) {
                SubLObject var42 = module0148.$g2099$.currentBinding(var41);
                SubLObject var43 = module0148.$g2097$.currentBinding(var41);
                try {
                    module0148.$g2099$.bind((SubLObject)module0487.$ic6$, var41);
                    module0148.$g2097$.bind(module0487.$ic7$, var41);
                    final SubLObject var44 = (SubLObject)module0487.NIL;
                    if (module0487.NIL != module0158.f10010(var40, (SubLObject)module0487.ONE_INTEGER, var44)) {
                        final SubLObject var45 = module0158.f10011(var40, (SubLObject)module0487.ONE_INTEGER, var44);
                        SubLObject var46 = (SubLObject)module0487.NIL;
                        final SubLObject var47 = (SubLObject)module0487.NIL;
                        while (module0487.NIL == var46) {
                            final SubLObject var48 = module0052.f3695(var45, var47);
                            final SubLObject var49 = (SubLObject)SubLObjectFactory.makeBoolean(!var47.eql(var48));
                            if (module0487.NIL != var49) {
                                SubLObject var50 = (SubLObject)module0487.NIL;
                                try {
                                    var50 = module0158.f10316(var48, (SubLObject)module0487.$ic3$, (SubLObject)module0487.$ic4$, (SubLObject)module0487.NIL);
                                    SubLObject var18_72 = (SubLObject)module0487.NIL;
                                    final SubLObject var19_73 = (SubLObject)module0487.NIL;
                                    while (module0487.NIL == var18_72) {
                                        final SubLObject var51 = module0052.f3695(var50, var19_73);
                                        final SubLObject var21_74 = (SubLObject)SubLObjectFactory.makeBoolean(!var19_73.eql(var51));
                                        if (module0487.NIL != var21_74) {
                                            final SubLObject var52 = module0221.f14611(var51, (SubLObject)module0487.TWO_INTEGER);
                                            f31966(var52);
                                        }
                                        var18_72 = (SubLObject)SubLObjectFactory.makeBoolean(module0487.NIL == var21_74);
                                    }
                                }
                                finally {
                                    final SubLObject var7_75 = Threads.$is_thread_performing_cleanupP$.currentBinding(var41);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0487.T, var41);
                                        if (module0487.NIL != var50) {
                                            module0158.f10319(var50);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var7_75, var41);
                                    }
                                }
                            }
                            var46 = (SubLObject)SubLObjectFactory.makeBoolean(module0487.NIL == var49);
                        }
                    }
                }
                finally {
                    module0148.$g2097$.rebind(var43, var41);
                    module0148.$g2099$.rebind(var42, var41);
                }
                if (module0487.NIL != module0221.f14609(module0487.$ic7$)) {
                    var42 = module0148.$g2099$.currentBinding(var41);
                    var43 = module0148.$g2097$.currentBinding(var41);
                    try {
                        module0148.$g2099$.bind((SubLObject)module0487.$ic8$, var41);
                        module0148.$g2097$.bind(module0487.$ic7$, var41);
                        final SubLObject var44 = (SubLObject)module0487.NIL;
                        if (module0487.NIL != module0158.f10010(var40, module0225.f14782((SubLObject)module0487.ONE_INTEGER), var44)) {
                            final SubLObject var45 = module0158.f10011(var40, module0225.f14782((SubLObject)module0487.ONE_INTEGER), var44);
                            SubLObject var46 = (SubLObject)module0487.NIL;
                            final SubLObject var47 = (SubLObject)module0487.NIL;
                            while (module0487.NIL == var46) {
                                final SubLObject var48 = module0052.f3695(var45, var47);
                                final SubLObject var49 = (SubLObject)SubLObjectFactory.makeBoolean(!var47.eql(var48));
                                if (module0487.NIL != var49) {
                                    SubLObject var50 = (SubLObject)module0487.NIL;
                                    try {
                                        var50 = module0158.f10316(var48, (SubLObject)module0487.$ic3$, (SubLObject)module0487.$ic4$, (SubLObject)module0487.NIL);
                                        SubLObject var18_73 = (SubLObject)module0487.NIL;
                                        final SubLObject var19_74 = (SubLObject)module0487.NIL;
                                        while (module0487.NIL == var18_73) {
                                            final SubLObject var51 = module0052.f3695(var50, var19_74);
                                            final SubLObject var21_75 = (SubLObject)SubLObjectFactory.makeBoolean(!var19_74.eql(var51));
                                            if (module0487.NIL != var21_75) {
                                                final SubLObject var7_76 = module0221.$g2399$.currentBinding(var41);
                                                try {
                                                    module0221.$g2399$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0487.NIL == module0221.$g2399$.getDynamicValue(var41)), var41);
                                                    final SubLObject var53 = module0221.f14611(var51, (SubLObject)module0487.TWO_INTEGER);
                                                    f31966(var53);
                                                }
                                                finally {
                                                    module0221.$g2399$.rebind(var7_76, var41);
                                                }
                                            }
                                            var18_73 = (SubLObject)SubLObjectFactory.makeBoolean(module0487.NIL == var21_75);
                                        }
                                    }
                                    finally {
                                        final SubLObject var7_77 = Threads.$is_thread_performing_cleanupP$.currentBinding(var41);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0487.T, var41);
                                            if (module0487.NIL != var50) {
                                                module0158.f10319(var50);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var7_77, var41);
                                        }
                                    }
                                }
                                var46 = (SubLObject)SubLObjectFactory.makeBoolean(module0487.NIL == var49);
                            }
                        }
                    }
                    finally {
                        module0148.$g2097$.rebind(var43, var41);
                        module0148.$g2099$.rebind(var42, var41);
                    }
                }
            }
        }
        return (SubLObject)module0487.NIL;
    }
    
    public static SubLObject f31964(final SubLObject var52) {
        final SubLThread var53 = SubLProcess.currentSubLThread();
        if (module0487.NIL == Hashtables.gethash(var52, module0487.$g3711$.getDynamicValue(var53), (SubLObject)module0487.UNPROVIDED) && module0487.NIL != f31962(var52)) {
            f31963(var52);
            if (module0487.NIL != module0173.f10955(var52)) {
                SubLObject var54 = (SubLObject)module0487.NIL;
                final SubLObject var55 = module0487.$ic5$;
                if (module0487.NIL != module0158.f10010(var52, (SubLObject)module0487.ONE_INTEGER, var55)) {
                    final SubLObject var56 = module0158.f10011(var52, (SubLObject)module0487.ONE_INTEGER, var55);
                    SubLObject var57 = (SubLObject)module0487.NIL;
                    final SubLObject var58 = (SubLObject)module0487.NIL;
                    while (module0487.NIL == var57) {
                        final SubLObject var59 = module0052.f3695(var56, var58);
                        final SubLObject var60 = (SubLObject)SubLObjectFactory.makeBoolean(!var58.eql(var59));
                        if (module0487.NIL != var60) {
                            SubLObject var61 = (SubLObject)module0487.NIL;
                            try {
                                var61 = module0158.f10316(var59, (SubLObject)module0487.$ic3$, (SubLObject)module0487.$ic4$, (SubLObject)module0487.NIL);
                                SubLObject var18_81 = (SubLObject)module0487.NIL;
                                final SubLObject var19_82 = (SubLObject)module0487.NIL;
                                while (module0487.NIL == var18_81) {
                                    final SubLObject var62 = module0052.f3695(var61, var19_82);
                                    final SubLObject var21_83 = (SubLObject)SubLObjectFactory.makeBoolean(!var19_82.eql(var62));
                                    if (module0487.NIL != var21_83) {
                                        var54 = module0178.f11331(var62, (SubLObject)module0487.TWO_INTEGER);
                                        f31964(var54);
                                    }
                                    var18_81 = (SubLObject)SubLObjectFactory.makeBoolean(module0487.NIL == var21_83);
                                }
                            }
                            finally {
                                final SubLObject var63 = Threads.$is_thread_performing_cleanupP$.currentBinding(var53);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0487.T, var53);
                                    if (module0487.NIL != var61) {
                                        module0158.f10319(var61);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var63, var53);
                                }
                            }
                        }
                        var57 = (SubLObject)SubLObjectFactory.makeBoolean(module0487.NIL == var60);
                    }
                }
            }
        }
        return (SubLObject)module0487.NIL;
    }
    
    public static SubLObject f31967(final SubLObject var2, SubLObject var3) {
        if (var3 == module0487.UNPROVIDED) {
            var3 = (SubLObject)module0487.NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        assert module0487.NIL != module0173.f10955(var2) : var2;
        SubLObject var5 = (SubLObject)module0487.NIL;
        final SubLObject var6 = var3;
        final SubLObject var7 = module0147.$g2095$.currentBinding(var4);
        final SubLObject var8 = module0147.$g2094$.currentBinding(var4);
        final SubLObject var9 = module0147.$g2096$.currentBinding(var4);
        try {
            module0147.$g2095$.bind(module0147.f9545(var6), var4);
            module0147.$g2094$.bind(module0147.f9546(var6), var4);
            module0147.$g2096$.bind(module0147.f9549(var6), var4);
            final SubLObject var7_85 = module0148.$g2099$.currentBinding(var4);
            final SubLObject var8_86 = module0148.$g2097$.currentBinding(var4);
            try {
                module0148.$g2099$.bind((SubLObject)module0487.$ic6$, var4);
                module0148.$g2097$.bind(module0487.$ic7$, var4);
                final SubLObject var10 = (SubLObject)module0487.NIL;
                if (module0487.NIL != module0158.f10010(var2, (SubLObject)module0487.TWO_INTEGER, var10)) {
                    final SubLObject var11 = module0158.f10011(var2, (SubLObject)module0487.TWO_INTEGER, var10);
                    SubLObject var12 = (SubLObject)module0487.NIL;
                    final SubLObject var13 = (SubLObject)module0487.NIL;
                    while (module0487.NIL == var12) {
                        final SubLObject var14 = module0052.f3695(var11, var13);
                        final SubLObject var15 = (SubLObject)SubLObjectFactory.makeBoolean(!var13.eql(var14));
                        if (module0487.NIL != var15) {
                            SubLObject var16 = (SubLObject)module0487.NIL;
                            try {
                                var16 = module0158.f10316(var14, (SubLObject)module0487.$ic3$, (SubLObject)module0487.$ic4$, (SubLObject)module0487.NIL);
                                SubLObject var18_87 = (SubLObject)module0487.NIL;
                                final SubLObject var19_88 = (SubLObject)module0487.NIL;
                                while (module0487.NIL == var18_87) {
                                    final SubLObject var17 = module0052.f3695(var16, var19_88);
                                    final SubLObject var21_89 = (SubLObject)SubLObjectFactory.makeBoolean(!var19_88.eql(var17));
                                    if (module0487.NIL != var21_89) {
                                        final SubLObject var19;
                                        final SubLObject var18 = var19 = module0221.f14611(var17, (SubLObject)module0487.ONE_INTEGER);
                                        if (module0487.NIL == conses_high.member(var19, var5, Symbols.symbol_function((SubLObject)module0487.EQUAL), Symbols.symbol_function((SubLObject)module0487.IDENTITY))) {
                                            var5 = (SubLObject)ConsesLow.cons(var19, var5);
                                        }
                                    }
                                    var18_87 = (SubLObject)SubLObjectFactory.makeBoolean(module0487.NIL == var21_89);
                                }
                            }
                            finally {
                                final SubLObject var7_86 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0487.T, var4);
                                    if (module0487.NIL != var16) {
                                        module0158.f10319(var16);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var7_86, var4);
                                }
                            }
                        }
                        var12 = (SubLObject)SubLObjectFactory.makeBoolean(module0487.NIL == var15);
                    }
                }
            }
            finally {
                module0148.$g2097$.rebind(var8_86, var4);
                module0148.$g2099$.rebind(var7_85, var4);
            }
            if (module0487.NIL != module0221.f14609(module0487.$ic7$)) {
                final SubLObject var7_87 = module0148.$g2099$.currentBinding(var4);
                final SubLObject var8_87 = module0148.$g2097$.currentBinding(var4);
                try {
                    module0148.$g2099$.bind((SubLObject)module0487.$ic8$, var4);
                    module0148.$g2097$.bind(module0487.$ic7$, var4);
                    final SubLObject var10 = (SubLObject)module0487.NIL;
                    if (module0487.NIL != module0158.f10010(var2, module0225.f14782((SubLObject)module0487.TWO_INTEGER), var10)) {
                        final SubLObject var11 = module0158.f10011(var2, module0225.f14782((SubLObject)module0487.TWO_INTEGER), var10);
                        SubLObject var12 = (SubLObject)module0487.NIL;
                        final SubLObject var13 = (SubLObject)module0487.NIL;
                        while (module0487.NIL == var12) {
                            final SubLObject var14 = module0052.f3695(var11, var13);
                            final SubLObject var15 = (SubLObject)SubLObjectFactory.makeBoolean(!var13.eql(var14));
                            if (module0487.NIL != var15) {
                                SubLObject var16 = (SubLObject)module0487.NIL;
                                try {
                                    var16 = module0158.f10316(var14, (SubLObject)module0487.$ic3$, (SubLObject)module0487.$ic4$, (SubLObject)module0487.NIL);
                                    SubLObject var18_88 = (SubLObject)module0487.NIL;
                                    final SubLObject var19_89 = (SubLObject)module0487.NIL;
                                    while (module0487.NIL == var18_88) {
                                        final SubLObject var17 = module0052.f3695(var16, var19_89);
                                        final SubLObject var21_90 = (SubLObject)SubLObjectFactory.makeBoolean(!var19_89.eql(var17));
                                        if (module0487.NIL != var21_90) {
                                            final SubLObject var7_88 = module0221.$g2399$.currentBinding(var4);
                                            try {
                                                module0221.$g2399$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0487.NIL == module0221.$g2399$.getDynamicValue(var4)), var4);
                                                final SubLObject var21;
                                                final SubLObject var20 = var21 = module0221.f14611(var17, (SubLObject)module0487.ONE_INTEGER);
                                                if (module0487.NIL == conses_high.member(var21, var5, Symbols.symbol_function((SubLObject)module0487.EQUAL), Symbols.symbol_function((SubLObject)module0487.IDENTITY))) {
                                                    var5 = (SubLObject)ConsesLow.cons(var21, var5);
                                                }
                                            }
                                            finally {
                                                module0221.$g2399$.rebind(var7_88, var4);
                                            }
                                        }
                                        var18_88 = (SubLObject)SubLObjectFactory.makeBoolean(module0487.NIL == var21_90);
                                    }
                                }
                                finally {
                                    final SubLObject var7_89 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0487.T, var4);
                                        if (module0487.NIL != var16) {
                                            module0158.f10319(var16);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var7_89, var4);
                                    }
                                }
                            }
                            var12 = (SubLObject)SubLObjectFactory.makeBoolean(module0487.NIL == var15);
                        }
                    }
                }
                finally {
                    module0148.$g2097$.rebind(var8_87, var4);
                    module0148.$g2099$.rebind(var7_87, var4);
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var9, var4);
            module0147.$g2094$.rebind(var8, var4);
            module0147.$g2095$.rebind(var7, var4);
        }
        return Sequences.nreverse(var5);
    }
    
    public static SubLObject f31968(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == module0487.UNPROVIDED) {
            var3 = (SubLObject)module0487.NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)module0487.NIL;
        if (module0487.NIL != module0173.f10955(var1) && module0487.NIL != module0173.f10955(var2)) {
            final SubLObject var6 = module0110.$g1374$.currentBinding(var4);
            try {
                module0110.$g1374$.bind((SubLObject)module0487.T, var4);
                var5 = (SubLObject)SubLObjectFactory.makeBoolean(module0487.NIL != module0256.f16596(var1, var2, var3, (SubLObject)module0487.UNPROVIDED) || module0487.NIL != module0256.f16596(var2, var1, var3, (SubLObject)module0487.UNPROVIDED) || module0487.NIL != module0259.f16854(var1, var2, var3, (SubLObject)module0487.UNPROVIDED) || module0487.NIL != module0259.f16854(var2, var1, var3, (SubLObject)module0487.UNPROVIDED));
            }
            finally {
                module0110.$g1374$.rebind(var6, var4);
            }
        }
        return var5;
    }
    
    public static SubLObject f31969(final SubLObject var1, final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0487.NIL;
        SubLObject var5;
        final SubLObject var4 = var5 = f31970(var1, var2, module0487.$ic9$, (SubLObject)module0487.NIL);
        SubLObject var6 = (SubLObject)module0487.NIL;
        var6 = var5.first();
        while (module0487.NIL != var5) {
            SubLObject var102_104 = module0333.f22440(var6);
            SubLObject var7 = (SubLObject)module0487.NIL;
            var7 = var102_104.first();
            while (module0487.NIL != var102_104) {
                final SubLObject var8 = var7;
                if (module0487.NIL == conses_high.member(var8, var3, Symbols.symbol_function((SubLObject)module0487.$ic10$), Symbols.symbol_function((SubLObject)module0487.IDENTITY))) {
                    var3 = (SubLObject)ConsesLow.cons(var8, var3);
                }
                var102_104 = var102_104.rest();
                var7 = var102_104.first();
            }
            var5 = var5.rest();
            var6 = var5.first();
        }
        return module0035.f2467(var3, Symbols.symbol_function((SubLObject)module0487.$ic11$), (SubLObject)module0487.UNPROVIDED);
    }
    
    public static SubLObject f31971(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == module0487.UNPROVIDED) {
            var3 = (SubLObject)module0487.NIL;
        }
        assert module0487.NIL != module0173.f10955(var1) : var1;
        assert module0487.NIL != module0173.f10955(var2) : var2;
        return f31970(var1, var2, var3, (SubLObject)module0487.T).first();
    }
    
    public static SubLObject f31970(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var105) {
        final SubLThread var106 = SubLProcess.currentSubLThread();
        SubLObject var107 = (SubLObject)module0487.NIL;
        SubLObject var108 = (SubLObject)module0487.NIL;
        final SubLObject var109 = module0147.$g2095$.currentBinding(var106);
        final SubLObject var110 = module0147.$g2094$.currentBinding(var106);
        final SubLObject var111 = module0147.$g2096$.currentBinding(var106);
        try {
            module0147.$g2095$.bind(module0147.f9545(var3), var106);
            module0147.$g2094$.bind(module0147.f9546(var3), var106);
            module0147.$g2096$.bind(module0147.f9549(var3), var106);
            final SubLObject var7_107 = module0148.$g2099$.currentBinding(var106);
            final SubLObject var8_108 = module0148.$g2097$.currentBinding(var106);
            try {
                module0148.$g2099$.bind((SubLObject)module0487.$ic6$, var106);
                module0148.$g2097$.bind(module0487.$ic7$, var106);
                final SubLObject var112 = (SubLObject)module0487.NIL;
                if (module0487.NIL != module0158.f10010(var2, (SubLObject)module0487.TWO_INTEGER, var112)) {
                    final SubLObject var113 = module0158.f10011(var2, (SubLObject)module0487.TWO_INTEGER, var112);
                    SubLObject var114 = var108;
                    final SubLObject var115 = (SubLObject)module0487.NIL;
                    while (module0487.NIL == var114) {
                        final SubLObject var116 = module0052.f3695(var113, var115);
                        final SubLObject var117 = (SubLObject)SubLObjectFactory.makeBoolean(!var115.eql(var116));
                        if (module0487.NIL != var117) {
                            SubLObject var118 = (SubLObject)module0487.NIL;
                            try {
                                var118 = module0158.f10316(var116, (SubLObject)module0487.$ic3$, (SubLObject)module0487.$ic4$, (SubLObject)module0487.NIL);
                                SubLObject var18_109 = var108;
                                final SubLObject var19_110 = (SubLObject)module0487.NIL;
                                while (module0487.NIL == var18_109) {
                                    final SubLObject var119 = module0052.f3695(var118, var19_110);
                                    final SubLObject var21_112 = (SubLObject)SubLObjectFactory.makeBoolean(!var19_110.eql(var119));
                                    if (module0487.NIL != var21_112) {
                                        final SubLObject var120 = module0178.f11332(var119);
                                        final SubLObject var121 = module0178.f11334(var119);
                                        final SubLObject var122 = module0178.f11335(var119);
                                        final SubLObject var123 = (module0487.NIL != module0221.$g2399$.getDynamicValue(var106)) ? var122 : var121;
                                        SubLObject var124 = (SubLObject)module0487.NIL;
                                        SubLObject var125 = (SubLObject)module0487.NIL;
                                        if (var1.eql(var123)) {
                                            var125 = (SubLObject)module0487.T;
                                            var108 = var105;
                                        }
                                        else if (module0487.NIL != module0256.f16596(var1, var123, (SubLObject)module0487.UNPROVIDED, (SubLObject)module0487.UNPROVIDED)) {
                                            var125 = (SubLObject)module0487.T;
                                            var108 = var105;
                                            final SubLObject var126 = (SubLObject)ConsesLow.list(module0487.$ic5$, var1, var123);
                                            var124 = (SubLObject)ConsesLow.cons(module0191.f11990((SubLObject)module0487.$ic12$, var126, (SubLObject)module0487.UNPROVIDED, (SubLObject)module0487.UNPROVIDED), var124);
                                        }
                                        else if (module0487.NIL != module0259.f16854(var1, var123, (SubLObject)module0487.UNPROVIDED, (SubLObject)module0487.UNPROVIDED)) {
                                            var125 = (SubLObject)module0487.T;
                                            var108 = var105;
                                            final SubLObject var126 = (SubLObject)ConsesLow.list(module0487.$ic2$, var1, var123);
                                            var124 = (SubLObject)ConsesLow.cons(module0191.f11990((SubLObject)module0487.$ic13$, var126, (SubLObject)module0487.UNPROVIDED, (SubLObject)module0487.UNPROVIDED), var124);
                                        }
                                        if (module0487.NIL != var125) {
                                            var124 = (SubLObject)ConsesLow.cons(var119, var124);
                                            if (!var120.eql(module0487.$ic7$)) {
                                                if (module0487.NIL != module0221.$g2399$.getDynamicValue(var106)) {
                                                    final SubLObject var126 = (SubLObject)ConsesLow.listS(module0487.$ic14$, var120, (SubLObject)module0487.$ic15$);
                                                    var124 = (SubLObject)ConsesLow.cons(module0191.f11990((SubLObject)module0487.$ic16$, var126, (SubLObject)module0487.UNPROVIDED, (SubLObject)module0487.UNPROVIDED), var124);
                                                }
                                                else {
                                                    final SubLObject var126 = (SubLObject)ConsesLow.listS(module0487.$ic17$, var120, (SubLObject)module0487.$ic15$);
                                                    var124 = (SubLObject)ConsesLow.cons(module0191.f11990((SubLObject)module0487.$ic16$, var126, (SubLObject)module0487.UNPROVIDED, (SubLObject)module0487.UNPROVIDED), var124);
                                                }
                                            }
                                            var107 = (SubLObject)ConsesLow.cons(var124, var107);
                                        }
                                    }
                                    var18_109 = (SubLObject)SubLObjectFactory.makeBoolean(module0487.NIL == var21_112 || module0487.NIL != var108);
                                }
                            }
                            finally {
                                final SubLObject var7_108 = Threads.$is_thread_performing_cleanupP$.currentBinding(var106);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0487.T, var106);
                                    if (module0487.NIL != var118) {
                                        module0158.f10319(var118);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var7_108, var106);
                                }
                            }
                        }
                        var114 = (SubLObject)SubLObjectFactory.makeBoolean(module0487.NIL == var117 || module0487.NIL != var108);
                    }
                }
            }
            finally {
                module0148.$g2097$.rebind(var8_108, var106);
                module0148.$g2099$.rebind(var7_107, var106);
            }
            if (module0487.NIL != module0221.f14609(module0487.$ic7$)) {
                final SubLObject var7_109 = module0148.$g2099$.currentBinding(var106);
                final SubLObject var8_109 = module0148.$g2097$.currentBinding(var106);
                try {
                    module0148.$g2099$.bind((SubLObject)module0487.$ic8$, var106);
                    module0148.$g2097$.bind(module0487.$ic7$, var106);
                    final SubLObject var112 = (SubLObject)module0487.NIL;
                    if (module0487.NIL != module0158.f10010(var2, module0225.f14782((SubLObject)module0487.TWO_INTEGER), var112)) {
                        final SubLObject var113 = module0158.f10011(var2, module0225.f14782((SubLObject)module0487.TWO_INTEGER), var112);
                        SubLObject var114 = var108;
                        final SubLObject var115 = (SubLObject)module0487.NIL;
                        while (module0487.NIL == var114) {
                            final SubLObject var116 = module0052.f3695(var113, var115);
                            final SubLObject var117 = (SubLObject)SubLObjectFactory.makeBoolean(!var115.eql(var116));
                            if (module0487.NIL != var117) {
                                SubLObject var118 = (SubLObject)module0487.NIL;
                                try {
                                    var118 = module0158.f10316(var116, (SubLObject)module0487.$ic3$, (SubLObject)module0487.$ic4$, (SubLObject)module0487.NIL);
                                    SubLObject var18_110 = var108;
                                    final SubLObject var19_111 = (SubLObject)module0487.NIL;
                                    while (module0487.NIL == var18_110) {
                                        final SubLObject var119 = module0052.f3695(var118, var19_111);
                                        final SubLObject var21_113 = (SubLObject)SubLObjectFactory.makeBoolean(!var19_111.eql(var119));
                                        if (module0487.NIL != var21_113) {
                                            final SubLObject var7_110 = module0221.$g2399$.currentBinding(var106);
                                            try {
                                                module0221.$g2399$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0487.NIL == module0221.$g2399$.getDynamicValue(var106)), var106);
                                                final SubLObject var127 = module0178.f11332(var119);
                                                final SubLObject var128 = module0178.f11334(var119);
                                                final SubLObject var129 = module0178.f11335(var119);
                                                final SubLObject var130 = (module0487.NIL != module0221.$g2399$.getDynamicValue(var106)) ? var129 : var128;
                                                SubLObject var131 = (SubLObject)module0487.NIL;
                                                SubLObject var132 = (SubLObject)module0487.NIL;
                                                if (var1.eql(var130)) {
                                                    var132 = (SubLObject)module0487.T;
                                                    var108 = var105;
                                                }
                                                else if (module0487.NIL != module0256.f16596(var1, var130, (SubLObject)module0487.UNPROVIDED, (SubLObject)module0487.UNPROVIDED)) {
                                                    var132 = (SubLObject)module0487.T;
                                                    var108 = var105;
                                                    final SubLObject var133 = (SubLObject)ConsesLow.list(module0487.$ic5$, var1, var130);
                                                    var131 = (SubLObject)ConsesLow.cons(module0191.f11990((SubLObject)module0487.$ic12$, var133, (SubLObject)module0487.UNPROVIDED, (SubLObject)module0487.UNPROVIDED), var131);
                                                }
                                                else if (module0487.NIL != module0259.f16854(var1, var130, (SubLObject)module0487.UNPROVIDED, (SubLObject)module0487.UNPROVIDED)) {
                                                    var132 = (SubLObject)module0487.T;
                                                    var108 = var105;
                                                    final SubLObject var133 = (SubLObject)ConsesLow.list(module0487.$ic2$, var1, var130);
                                                    var131 = (SubLObject)ConsesLow.cons(module0191.f11990((SubLObject)module0487.$ic13$, var133, (SubLObject)module0487.UNPROVIDED, (SubLObject)module0487.UNPROVIDED), var131);
                                                }
                                                if (module0487.NIL != var132) {
                                                    var131 = (SubLObject)ConsesLow.cons(var119, var131);
                                                    if (!var127.eql(module0487.$ic7$)) {
                                                        if (module0487.NIL != module0221.$g2399$.getDynamicValue(var106)) {
                                                            final SubLObject var133 = (SubLObject)ConsesLow.listS(module0487.$ic14$, var127, (SubLObject)module0487.$ic15$);
                                                            var131 = (SubLObject)ConsesLow.cons(module0191.f11990((SubLObject)module0487.$ic16$, var133, (SubLObject)module0487.UNPROVIDED, (SubLObject)module0487.UNPROVIDED), var131);
                                                        }
                                                        else {
                                                            final SubLObject var133 = (SubLObject)ConsesLow.listS(module0487.$ic17$, var127, (SubLObject)module0487.$ic15$);
                                                            var131 = (SubLObject)ConsesLow.cons(module0191.f11990((SubLObject)module0487.$ic16$, var133, (SubLObject)module0487.UNPROVIDED, (SubLObject)module0487.UNPROVIDED), var131);
                                                        }
                                                    }
                                                    var107 = (SubLObject)ConsesLow.cons(var131, var107);
                                                }
                                            }
                                            finally {
                                                module0221.$g2399$.rebind(var7_110, var106);
                                            }
                                        }
                                        var18_110 = (SubLObject)SubLObjectFactory.makeBoolean(module0487.NIL == var21_113 || module0487.NIL != var108);
                                    }
                                }
                                finally {
                                    final SubLObject var7_111 = Threads.$is_thread_performing_cleanupP$.currentBinding(var106);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0487.T, var106);
                                        if (module0487.NIL != var118) {
                                            module0158.f10319(var118);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var7_111, var106);
                                    }
                                }
                            }
                            var114 = (SubLObject)SubLObjectFactory.makeBoolean(module0487.NIL == var117 || module0487.NIL != var108);
                        }
                    }
                }
                finally {
                    module0148.$g2097$.rebind(var8_109, var106);
                    module0148.$g2099$.rebind(var7_109, var106);
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var111, var106);
            module0147.$g2094$.rebind(var110, var106);
            module0147.$g2095$.rebind(var109, var106);
        }
        return var107;
    }
    
    public static SubLObject f31972(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == module0487.UNPROVIDED) {
            var3 = (SubLObject)module0487.NIL;
        }
        return (SubLObject)module0487.NIL;
    }
    
    public static SubLObject f31973(final SubLObject var127, SubLObject var128) {
        if (var128 == module0487.UNPROVIDED) {
            var128 = (SubLObject)module0487.NIL;
        }
        final SubLObject var129 = module0205.f13387(var127, (SubLObject)module0487.UNPROVIDED);
        final SubLObject var130 = module0205.f13388(var127, (SubLObject)module0487.UNPROVIDED);
        if (module0487.NIL != f31956(var129, var130, (SubLObject)module0487.UNPROVIDED, (SubLObject)module0487.UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)module0487.$ic20$, var127, (SubLObject)module0487.UNPROVIDED, (SubLObject)module0487.UNPROVIDED), (SubLObject)module0487.UNPROVIDED, (SubLObject)module0487.UNPROVIDED);
        }
        return (SubLObject)module0487.NIL;
    }
    
    public static SubLObject f31974(final SubLObject var127, SubLObject var128) {
        if (var128 == module0487.UNPROVIDED) {
            var128 = (SubLObject)module0487.NIL;
        }
        final SubLThread var129 = SubLProcess.currentSubLThread();
        final SubLObject var130 = module0205.f13387(var127, (SubLObject)module0487.UNPROVIDED);
        final SubLObject var131 = module0205.f13388(var127, (SubLObject)module0487.UNPROVIDED);
        SubLObject var133;
        final SubLObject var132 = var133 = f31960(var130, (SubLObject)module0487.UNPROVIDED);
        SubLObject var134 = (SubLObject)module0487.NIL;
        var134 = var133.first();
        while (module0487.NIL != var133) {
            var129.resetMultipleValues();
            final SubLObject var135 = module0235.f15474(var131, var134, (SubLObject)module0487.T, (SubLObject)module0487.T);
            final SubLObject var136 = var129.secondMultipleValue();
            var129.resetMultipleValues();
            final SubLObject var137 = (SubLObject)ConsesLow.list(module0487.$ic7$, var130, var134);
            module0347.f23330(module0191.f11990((SubLObject)module0487.$ic20$, var137, (SubLObject)module0487.UNPROVIDED, (SubLObject)module0487.UNPROVIDED), var135, var136);
            var133 = var133.rest();
            var134 = var133.first();
        }
        return (SubLObject)module0487.NIL;
    }
    
    public static SubLObject f31975(final SubLObject var127, SubLObject var128) {
        if (var128 == module0487.UNPROVIDED) {
            var128 = (SubLObject)module0487.NIL;
        }
        final SubLThread var129 = SubLProcess.currentSubLThread();
        return Numbers.max(module0487.$g3717$.getDynamicValue(var129), module0217.f14223(module0205.f13388(var127, (SubLObject)module0487.UNPROVIDED), (SubLObject)module0487.TWO_INTEGER, module0487.$ic7$));
    }
    
    public static SubLObject f31976(final SubLObject var127, SubLObject var128) {
        if (var128 == module0487.UNPROVIDED) {
            var128 = (SubLObject)module0487.NIL;
        }
        final SubLThread var129 = SubLProcess.currentSubLThread();
        final SubLObject var130 = module0205.f13387(var127, (SubLObject)module0487.UNPROVIDED);
        final SubLObject var131 = module0205.f13388(var127, (SubLObject)module0487.UNPROVIDED);
        SubLObject var133;
        final SubLObject var132 = var133 = f31967(var131, (SubLObject)module0487.UNPROVIDED);
        SubLObject var134 = (SubLObject)module0487.NIL;
        var134 = var133.first();
        while (module0487.NIL != var133) {
            var129.resetMultipleValues();
            final SubLObject var135 = module0235.f15474(var130, var134, (SubLObject)module0487.T, (SubLObject)module0487.T);
            final SubLObject var136 = var129.secondMultipleValue();
            var129.resetMultipleValues();
            final SubLObject var137 = (SubLObject)ConsesLow.list(module0487.$ic7$, var134, var131);
            module0347.f23330(module0191.f11990((SubLObject)module0487.$ic20$, var137, (SubLObject)module0487.UNPROVIDED, (SubLObject)module0487.UNPROVIDED), var135, var136);
            var133 = var133.rest();
            var134 = var133.first();
        }
        return (SubLObject)module0487.NIL;
    }
    
    public static SubLObject f31977(final SubLObject var127, SubLObject var128) {
        if (var128 == module0487.UNPROVIDED) {
            var128 = (SubLObject)module0487.NIL;
        }
        final SubLThread var129 = SubLProcess.currentSubLThread();
        final SubLObject var130 = module0205.f13387(var127, (SubLObject)module0487.UNPROVIDED);
        final SubLObject var131 = module0205.f13388(var127, (SubLObject)module0487.UNPROVIDED);
        if (module0487.NIL != module0018.$g646$.getDynamicValue(var129) && module0487.NIL == f31956(var130, var131, (SubLObject)module0487.UNPROVIDED, (SubLObject)module0487.UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)module0487.$ic30$, module0205.f13338(var127), (SubLObject)module0487.UNPROVIDED, (SubLObject)module0487.UNPROVIDED), (SubLObject)module0487.UNPROVIDED, (SubLObject)module0487.UNPROVIDED);
        }
        else if (module0487.NIL != f31968(var130, var131, (SubLObject)module0487.UNPROVIDED)) {
            module0347.f23330(module0191.f11990((SubLObject)module0487.$ic20$, module0205.f13338(var127), (SubLObject)module0487.UNPROVIDED, (SubLObject)module0487.UNPROVIDED), (SubLObject)module0487.UNPROVIDED, (SubLObject)module0487.UNPROVIDED);
        }
        return (SubLObject)module0487.NIL;
    }
    
    public static SubLObject f31978() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0487", "f31954", "S#35291", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0487", "f31955", "S#35292", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0487", "f31956", "S#24948", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0487", "f31959", "S#35293", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0487", "f31961", "S#35294", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0487", "f31957", "S#35295", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0487", "f31958", "S#35296", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0487", "f31962", "S#35297", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0487", "f31960", "S#35298", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0487", "f31965", "S#35299", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0487", "f31966", "S#35300", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0487", "f31963", "S#35301", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0487", "f31964", "S#35302", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0487", "f31967", "S#35303", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0487", "f31968", "S#24949", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0487", "f31969", "S#24952", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0487", "f31971", "S#24950", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0487", "f31970", "S#35304", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0487", "f31972", "S#24951", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0487", "f31973", "S#35305", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0487", "f31974", "S#35306", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0487", "f31975", "S#35307", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0487", "f31976", "S#35308", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0487", "f31977", "S#35309", 1, 1, false);
        return (SubLObject)module0487.NIL;
    }
    
    public static SubLObject f31979() {
        module0487.$g3707$ = SubLFiles.defparameter("S#35310", (SubLObject)module0487.NIL);
        module0487.$g3708$ = SubLFiles.defparameter("S#35311", (SubLObject)module0487.NIL);
        module0487.$g3709$ = SubLFiles.defparameter("S#35312", (SubLObject)module0487.NIL);
        module0487.$g3710$ = SubLFiles.defparameter("S#35313", (SubLObject)module0487.NIL);
        module0487.$g3711$ = SubLFiles.defparameter("S#35314", (SubLObject)module0487.NIL);
        module0487.$g3712$ = SubLFiles.defparameter("S#35315", (SubLObject)module0487.NIL);
        module0487.$g3713$ = SubLFiles.defparameter("S#35316", (SubLObject)module0487.NIL);
        module0487.$g3714$ = SubLFiles.defparameter("S#35317", (SubLObject)module0487.NIL);
        module0487.$g3715$ = SubLFiles.defparameter("S#35318", (SubLObject)module0487.ONE_INTEGER);
        module0487.$g3716$ = SubLFiles.defparameter("S#35319", (SubLObject)module0487.$ic23$);
        module0487.$g3717$ = SubLFiles.defparameter("S#35320", (SubLObject)module0487.TWENTY_INTEGER);
        return (SubLObject)module0487.NIL;
    }
    
    public static SubLObject f31980() {
        module0340.f22938(module0487.$ic7$);
        module0358.f23774((SubLObject)module0487.$ic18$, module0487.$ic7$);
        module0358.f23773((SubLObject)module0487.$ic19$, module0487.$ic7$);
        module0340.f22941((SubLObject)module0487.$ic21$, (SubLObject)module0487.$ic22$);
        module0340.f22941((SubLObject)module0487.$ic24$, (SubLObject)module0487.$ic25$);
        module0340.f22941((SubLObject)module0487.$ic26$, (SubLObject)module0487.$ic27$);
        module0358.f23730((SubLObject)module0487.$ic28$, (SubLObject)module0487.$ic29$);
        module0340.f22941((SubLObject)module0487.$ic31$, (SubLObject)module0487.$ic32$);
        return (SubLObject)module0487.NIL;
    }
    
    public void declareFunctions() {
        f31978();
    }
    
    public void initializeVariables() {
        f31979();
    }
    
    public void runTopLevelForms() {
        f31980();
    }
    
    static {
        me = (SubLFile)new module0487();
        module0487.$g3707$ = null;
        module0487.$g3708$ = null;
        module0487.$g3709$ = null;
        module0487.$g3710$ = null;
        module0487.$g3711$ = null;
        module0487.$g3712$ = null;
        module0487.$g3713$ = null;
        module0487.$g3714$ = null;
        module0487.$g3715$ = null;
        module0487.$g3716$ = null;
        module0487.$g3717$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic1$ = SubLObjectFactory.makeKeyword("MAPPING-DONE");
        $ic2$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic3$ = SubLObjectFactory.makeKeyword("GAF");
        $ic4$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic5$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic6$ = SubLObjectFactory.makeSymbol("S#12347", "CYC");
        $ic7$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("conceptuallyRelated"));
        $ic8$ = SubLObjectFactory.makeSymbol("S#12348", "CYC");
        $ic9$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $ic10$ = SubLObjectFactory.makeSymbol("S#12762", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#19882", "CYC");
        $ic12$ = SubLObjectFactory.makeKeyword("GENLS");
        $ic13$ = SubLObjectFactory.makeKeyword("ISA");
        $ic14$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $ic15$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("conceptuallyRelated")));
        $ic16$ = SubLObjectFactory.makeKeyword("GENLPREDS");
        $ic17$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $ic18$ = SubLObjectFactory.makeKeyword("POS");
        $ic19$ = SubLObjectFactory.makeKeyword("NEG");
        $ic20$ = SubLObjectFactory.makeKeyword("CONCEPTUALLY-RELATED");
        $ic21$ = SubLObjectFactory.makeKeyword("REMOVAL-CONCEPTUALLY-RELATED");
        $ic22$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("conceptuallyRelated")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("conceptuallyRelated")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35318", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35305", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$conceptuallyRelated <fort> <fully bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$conceptuallyRelated #$Dog #$DogFood)") });
        $ic23$ = SubLObjectFactory.makeInteger(40);
        $ic24$ = SubLObjectFactory.makeKeyword("REMOVAL-ALL-CONCEPTUALLY-RELATED");
        $ic25$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("conceptuallyRelated")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("conceptuallyRelated")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35319", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35306", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$conceptuallyRelated <fort> <variable>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$conceptuallyRelated #$Dog ?WHAT)") });
        $ic26$ = SubLObjectFactory.makeKeyword("REMOVAL-MAX-CONCEPTUALLY-RELATED-TO");
        $ic27$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("conceptuallyRelated")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("conceptuallyRelated")), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#35307", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35308", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$conceptuallyRelated <variable> <fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$conceptuallyRelated ?WHAT #$DogFood)") });
        $ic28$ = SubLObjectFactory.makeKeyword("MAX-CONCEPTUALLY-RELATED-TO-POS");
        $ic29$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("conceptuallyRelated")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("conceptuallyRelated")), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("GROSSLY-DISPREFERRED"));
        $ic30$ = SubLObjectFactory.makeKeyword("MINIMIZE");
        $ic31$ = SubLObjectFactory.makeKeyword("REMOVAL-NOT-CONCEPTUALLY-RELATED");
        $ic32$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("conceptuallyRelated")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("conceptuallyRelated")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#35318", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#35309", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$conceptuallyRelated <fort> <fort>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$conceptuallyRelated #$Dog #$Animal))") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0487.class
	Total time: 825 ms
	
	Decompiled with Procyon 0.5.32.
*/