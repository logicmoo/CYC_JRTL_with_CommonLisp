package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0485 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0485";
    public static final String myFingerPrint = "7ae7e6c10e539db52e1209219f90f56a9302d6f96fac6c24c817fe936ba0c7ca";
    private static SubLSymbol $g3706$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLObject $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLList $ic7$;
    private static final SubLObject $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLString $ic11$;
    private static final SubLList $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLObject $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLObject $ic22$;
    private static final SubLObject $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLObject $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLList $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLList $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLList $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLList $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLList $ic37$;
    private static final SubLObject $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLList $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLList $ic42$;
    private static final SubLSymbol $ic43$;
    
    public static SubLObject f31922(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        var3.resetMultipleValues();
        final SubLObject var4 = f31923(var1, var2);
        final SubLObject var5 = var3.secondMultipleValue();
        var3.resetMultipleValues();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7_8 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var10_11 = (SubLObject)NIL;
        var6 = var4;
        var7_8 = var6.first();
        var7 = var5;
        var10_11 = var7.first();
        while (NIL != var7 || NIL != var6) {
            module0347.f23330(var7_8, (SubLObject)NIL, var10_11);
            var6 = var6.rest();
            var7_8 = var6.first();
            var7 = var7.rest();
            var10_11 = var7.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31924(final SubLObject var1, final SubLObject var2, SubLObject var12, SubLObject var5) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLThread var13 = SubLProcess.currentSubLThread();
        var13.resetMultipleValues();
        final SubLObject var14 = f31923(var1, var2);
        final SubLObject var15 = var13.secondMultipleValue();
        var13.resetMultipleValues();
        var5 = ConsesLow.append(var5, var15);
        final SubLObject var16 = module0205.f13387(var2, (SubLObject)UNPROVIDED);
        final SubLObject var17 = module0205.f13387(var16, (SubLObject)UNPROVIDED);
        final SubLObject var18 = module0205.f13388(var16, (SubLObject)UNPROVIDED);
        final SubLObject var19 = (SubLObject)((NIL != f31925(var1)) ? ConsesLow.list($ic2$, (SubLObject)ConsesLow.list($ic3$, (SubLObject)$ic4$, (SubLObject)ConsesLow.list($ic5$, (SubLObject)ConsesLow.list($ic6$, (SubLObject)ConsesLow.listS(var1, var17, (SubLObject)$ic7$)), (SubLObject)ConsesLow.list($ic8$, (SubLObject)$ic4$, var18), (SubLObject)ConsesLow.list($ic9$, (SubLObject)$ic4$, var18)))) : var2);
        if (NIL == var14) {
            module0347.f23330(module0191.f11990((SubLObject)$ic10$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var12, var5);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31923(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var3) && !var1.eql(module0205.f13210(module0205.f13387(var2, (SubLObject)UNPROVIDED)))) {
            Errors.error((SubLObject)$ic11$, var1, module0205.f13210(module0205.f13387(var2, (SubLObject)UNPROVIDED)));
        }
        final SubLObject var4 = module0205.f13387(var2, (SubLObject)UNPROVIDED);
        return Sequences.remove($g3706$.getDynamicValue(var3), f31926(var4), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31926(final SubLObject var2) {
        final SubLObject var3 = module0205.f13333(var2);
        if (NIL != module0004.f104(var3, (SubLObject)$ic12$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return f31927(var3, var2);
        }
        if (NIL != f31925(var3)) {
            return f31927(var3, var2);
        }
        return f31928(var3, var2);
    }
    
    public static SubLObject f31925(final SubLObject var18) {
        return module0220.f14583((SubLObject)ConsesLow.listS($ic13$, var18, (SubLObject)$ic14$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31927(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = module0205.f13387(var2, (SubLObject)UNPROVIDED);
        final SubLObject var4 = module0205.f13388(var2, (SubLObject)UNPROVIDED);
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        if (NIL != module0158.f10010(var3, (SubLObject)ONE_INTEGER, var1)) {
            final SubLObject var7 = module0158.f10011(var3, (SubLObject)ONE_INTEGER, var1);
            SubLObject var8 = (SubLObject)NIL;
            final SubLObject var9 = (SubLObject)NIL;
            while (NIL == var8) {
                final SubLObject var10 = module0052.f3695(var7, var9);
                final SubLObject var11 = (SubLObject)makeBoolean(!var9.eql(var10));
                if (NIL != var11) {
                    SubLObject var12 = (SubLObject)NIL;
                    try {
                        var12 = module0158.f10316(var10, (SubLObject)$ic15$, (SubLObject)$ic16$, (SubLObject)NIL);
                        SubLObject var21_26 = (SubLObject)NIL;
                        final SubLObject var22_27 = (SubLObject)NIL;
                        while (NIL == var21_26) {
                            final SubLObject var13 = module0052.f3695(var12, var22_27);
                            final SubLObject var24_28 = (SubLObject)makeBoolean(!var22_27.eql(var13));
                            if (NIL != var24_28) {
                                final SubLObject var14 = module0178.f11335(var13);
                                if (var14.equal(var4)) {
                                    final SubLObject var15 = module0178.f11287(var13);
                                    if (NIL != module0262.f17338(f31929(), var15, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                        final SubLObject var16 = module0191.f11990((SubLObject)$ic17$, (SubLObject)ConsesLow.list($ic18$, f31929(), var15), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                        var5 = (SubLObject)ConsesLow.cons(var13, var5);
                                        var6 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var16), var6);
                                    }
                                    else if (NIL != f31930()) {
                                        SubLObject var17 = (SubLObject)NIL;
                                        if (NIL == var17) {
                                            SubLObject var18 = module0178.f11299(var13);
                                            SubLObject var19 = (SubLObject)NIL;
                                            var19 = var18.first();
                                            while (NIL == var17 && NIL != var18) {
                                                if (NIL != module0191.f11932(var19)) {
                                                    var17 = (SubLObject)T;
                                                }
                                                else if (NIL == module0274.f18223(var19)) {
                                                    var17 = (SubLObject)T;
                                                }
                                                var18 = var18.rest();
                                                var19 = var18.first();
                                            }
                                        }
                                        if (NIL != var17) {
                                            var5 = (SubLObject)ConsesLow.cons(var13, var5);
                                        }
                                    }
                                }
                                else if (NIL != module0256.f16596(var14, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                    final SubLObject var20 = module0191.f11990((SubLObject)$ic19$, (SubLObject)ConsesLow.list($ic9$, var14, var4), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    var5 = (SubLObject)ConsesLow.cons(var13, var5);
                                    var6 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var20), var6);
                                }
                            }
                            var21_26 = (SubLObject)makeBoolean(NIL == var24_28);
                        }
                    }
                    finally {
                        final SubLObject var21 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                            if (NIL != var12) {
                                module0158.f10319(var12);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var21);
                        }
                    }
                }
                var8 = (SubLObject)makeBoolean(NIL == var11);
            }
        }
        return Values.values(var5, var6);
    }
    
    public static SubLObject f31928(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0205.f13385(var2, (SubLObject)UNPROVIDED);
        final SubLObject var5 = Sequences.reverse(var4);
        final SubLObject var6 = f31929();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        if (NIL != module0173.f10955(var4.first())) {
            SubLObject var9 = module0148.$g2099$.currentBinding(var3);
            SubLObject var10 = module0148.$g2097$.currentBinding(var3);
            try {
                module0148.$g2099$.bind((SubLObject)$ic20$, var3);
                module0148.$g2097$.bind(var1, var3);
                final SubLObject var11 = (SubLObject)NIL;
                if (NIL != module0158.f10010(var4.first(), (SubLObject)ONE_INTEGER, var11)) {
                    final SubLObject var12 = module0158.f10011(var4.first(), (SubLObject)ONE_INTEGER, var11);
                    SubLObject var13 = (SubLObject)NIL;
                    final SubLObject var14 = (SubLObject)NIL;
                    while (NIL == var13) {
                        final SubLObject var15 = module0052.f3695(var12, var14);
                        final SubLObject var16 = (SubLObject)makeBoolean(!var14.eql(var15));
                        if (NIL != var16) {
                            SubLObject var17 = (SubLObject)NIL;
                            try {
                                var17 = module0158.f10316(var15, (SubLObject)$ic15$, (SubLObject)$ic16$, (SubLObject)NIL);
                                SubLObject var21_39 = (SubLObject)NIL;
                                final SubLObject var22_40 = (SubLObject)NIL;
                                while (NIL == var21_39) {
                                    final SubLObject var18 = module0052.f3695(var17, var22_40);
                                    final SubLObject var24_41 = (SubLObject)makeBoolean(!var22_40.eql(var18));
                                    if (NIL != var24_41 && NIL != ((NIL != module0221.$g2399$.getDynamicValue(var3)) ? Equality.equal(module0205.f13207(module0178.f11303(var18), (SubLObject)UNPROVIDED), var5) : Equality.equal(module0205.f13207(module0178.f11303(var18), (SubLObject)UNPROVIDED), var4))) {
                                        final SubLObject var19 = module0178.f11333(var18);
                                        final SubLObject var20 = module0178.f11287(var18);
                                        if (!var19.equal(var1)) {
                                            final SubLObject var21 = (NIL != module0221.$g2399$.getDynamicValue(var3)) ? module0191.f11990((SubLObject)$ic21$, (SubLObject)ConsesLow.list($ic22$, var19, var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : module0191.f11990((SubLObject)$ic21$, (SubLObject)ConsesLow.list($ic23$, var19, var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                            var7 = (SubLObject)ConsesLow.cons(var18, var7);
                                            var8 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var21), var8);
                                        }
                                        if (NIL != module0262.f17338(var6, var20, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                            final SubLObject var21 = module0191.f11990((SubLObject)$ic17$, module0202.f12768($ic18$, var6, var20), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                            var7 = (SubLObject)ConsesLow.cons(var18, var7);
                                            var8 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var21), var8);
                                        }
                                    }
                                    var21_39 = (SubLObject)makeBoolean(NIL == var24_41);
                                }
                            }
                            finally {
                                final SubLObject var34_42 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                                    if (NIL != var17) {
                                        module0158.f10319(var17);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var34_42, var3);
                                }
                            }
                        }
                        var13 = (SubLObject)makeBoolean(NIL == var16);
                    }
                }
            }
            finally {
                module0148.$g2097$.rebind(var10, var3);
                module0148.$g2099$.rebind(var9, var3);
            }
            if (NIL != module0221.f14609(var1)) {
                var9 = module0148.$g2099$.currentBinding(var3);
                var10 = module0148.$g2097$.currentBinding(var3);
                try {
                    module0148.$g2099$.bind((SubLObject)$ic24$, var3);
                    module0148.$g2097$.bind(var1, var3);
                    final SubLObject var11 = (SubLObject)NIL;
                    if (NIL != module0158.f10010(var4.first(), module0225.f14782((SubLObject)ONE_INTEGER), var11)) {
                        final SubLObject var12 = module0158.f10011(var4.first(), module0225.f14782((SubLObject)ONE_INTEGER), var11);
                        SubLObject var13 = (SubLObject)NIL;
                        final SubLObject var14 = (SubLObject)NIL;
                        while (NIL == var13) {
                            final SubLObject var15 = module0052.f3695(var12, var14);
                            final SubLObject var16 = (SubLObject)makeBoolean(!var14.eql(var15));
                            if (NIL != var16) {
                                SubLObject var17 = (SubLObject)NIL;
                                try {
                                    var17 = module0158.f10316(var15, (SubLObject)$ic15$, (SubLObject)$ic16$, (SubLObject)NIL);
                                    SubLObject var21_40 = (SubLObject)NIL;
                                    final SubLObject var22_41 = (SubLObject)NIL;
                                    while (NIL == var21_40) {
                                        final SubLObject var18 = module0052.f3695(var17, var22_41);
                                        final SubLObject var24_42 = (SubLObject)makeBoolean(!var22_41.eql(var18));
                                        if (NIL != var24_42) {
                                            final SubLObject var34_43 = module0221.$g2399$.currentBinding(var3);
                                            try {
                                                module0221.$g2399$.bind((SubLObject)makeBoolean(NIL == module0221.$g2399$.getDynamicValue(var3)), var3);
                                                if (NIL != ((NIL != module0221.$g2399$.getDynamicValue(var3)) ? Equality.equal(module0205.f13207(module0178.f11303(var18), (SubLObject)UNPROVIDED), var5) : Equality.equal(module0205.f13207(module0178.f11303(var18), (SubLObject)UNPROVIDED), var4))) {
                                                    final SubLObject var22 = module0178.f11333(var18);
                                                    final SubLObject var23 = module0178.f11287(var18);
                                                    if (!var22.equal(var1)) {
                                                        final SubLObject var24 = (NIL != module0221.$g2399$.getDynamicValue(var3)) ? module0191.f11990((SubLObject)$ic21$, (SubLObject)ConsesLow.list($ic22$, var22, var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : module0191.f11990((SubLObject)$ic21$, (SubLObject)ConsesLow.list($ic23$, var22, var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                        var7 = (SubLObject)ConsesLow.cons(var18, var7);
                                                        var8 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var24), var8);
                                                    }
                                                    if (NIL != module0262.f17338(var6, var23, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                                        final SubLObject var24 = module0191.f11990((SubLObject)$ic17$, module0202.f12768($ic18$, var6, var23), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                        var7 = (SubLObject)ConsesLow.cons(var18, var7);
                                                        var8 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var24), var8);
                                                    }
                                                }
                                            }
                                            finally {
                                                module0221.$g2399$.rebind(var34_43, var3);
                                            }
                                        }
                                        var21_40 = (SubLObject)makeBoolean(NIL == var24_42);
                                    }
                                }
                                finally {
                                    final SubLObject var34_44 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                                        if (NIL != var17) {
                                            module0158.f10319(var17);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var34_44, var3);
                                    }
                                }
                            }
                            var13 = (SubLObject)makeBoolean(NIL == var16);
                        }
                    }
                }
                finally {
                    module0148.$g2097$.rebind(var10, var3);
                    module0148.$g2099$.rebind(var9, var3);
                }
            }
        }
        else {
            SubLObject var25 = module0260.f17034(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var26 = (SubLObject)NIL;
            var26 = var25.first();
            while (NIL != var25) {
                final SubLObject var27 = var26;
                if (NIL != module0158.f10038(var27)) {
                    final SubLObject var28 = (SubLObject)NIL;
                    final SubLObject var29 = module0012.$g73$.currentBinding(var3);
                    final SubLObject var30 = module0012.$g65$.currentBinding(var3);
                    final SubLObject var31 = module0012.$g67$.currentBinding(var3);
                    final SubLObject var32 = module0012.$g68$.currentBinding(var3);
                    final SubLObject var33 = module0012.$g66$.currentBinding(var3);
                    final SubLObject var34 = module0012.$g69$.currentBinding(var3);
                    final SubLObject var35 = module0012.$g70$.currentBinding(var3);
                    final SubLObject var36 = module0012.$silent_progressP$.currentBinding(var3);
                    try {
                        module0012.$g73$.bind(Time.get_universal_time(), var3);
                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var3), var3);
                        module0012.$g67$.bind((SubLObject)ONE_INTEGER, var3);
                        module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var3);
                        module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var3);
                        module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var3);
                        module0012.$g70$.bind((SubLObject)T, var3);
                        module0012.$silent_progressP$.bind((SubLObject)((NIL != var28) ? module0012.$silent_progressP$.getDynamicValue(var3) : T), var3);
                        module0012.f474(var28);
                        final SubLObject var37 = module0158.f10039(var27);
                        SubLObject var38 = (SubLObject)NIL;
                        final SubLObject var39 = (SubLObject)NIL;
                        while (NIL == var38) {
                            final SubLObject var40 = module0052.f3695(var37, var39);
                            final SubLObject var41 = (SubLObject)makeBoolean(!var39.eql(var40));
                            if (NIL != var41) {
                                module0012.f476();
                                SubLObject var42 = (SubLObject)NIL;
                                try {
                                    var42 = module0158.f10316(var40, (SubLObject)$ic15$, (SubLObject)$ic16$, (SubLObject)NIL);
                                    SubLObject var21_41 = (SubLObject)NIL;
                                    final SubLObject var22_42 = (SubLObject)NIL;
                                    while (NIL == var21_41) {
                                        final SubLObject var43 = module0052.f3695(var42, var22_42);
                                        final SubLObject var24_43 = (SubLObject)makeBoolean(!var22_42.eql(var43));
                                        if (NIL != var24_43 && NIL != ((NIL != module0221.$g2399$.getDynamicValue(var3)) ? Equality.equal(module0205.f13207(module0178.f11303(var43), (SubLObject)UNPROVIDED), var5) : Equality.equal(module0205.f13207(module0178.f11303(var43), (SubLObject)UNPROVIDED), var4))) {
                                            final SubLObject var44 = module0178.f11333(var43);
                                            final SubLObject var45 = module0178.f11287(var43);
                                            if (!var44.equal(var1)) {
                                                final SubLObject var46 = (NIL != module0221.$g2399$.getDynamicValue(var3)) ? module0191.f11990((SubLObject)$ic21$, (SubLObject)ConsesLow.list($ic22$, var44, var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : module0191.f11990((SubLObject)$ic21$, (SubLObject)ConsesLow.list($ic23$, var44, var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                var7 = (SubLObject)ConsesLow.cons(var43, var7);
                                                var8 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var46), var8);
                                            }
                                            if (NIL != module0262.f17338(var6, var45, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                                final SubLObject var46 = module0191.f11990((SubLObject)$ic17$, module0202.f12768($ic18$, var6, var45), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                var7 = (SubLObject)ConsesLow.cons(var43, var7);
                                                var8 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var46), var8);
                                            }
                                        }
                                        var21_41 = (SubLObject)makeBoolean(NIL == var24_43);
                                    }
                                }
                                finally {
                                    final SubLObject var34_45 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                                        if (NIL != var42) {
                                            module0158.f10319(var42);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var34_45, var3);
                                    }
                                }
                            }
                            var38 = (SubLObject)makeBoolean(NIL == var41);
                        }
                        module0012.f475();
                    }
                    finally {
                        module0012.$silent_progressP$.rebind(var36, var3);
                        module0012.$g70$.rebind(var35, var3);
                        module0012.$g69$.rebind(var34, var3);
                        module0012.$g66$.rebind(var33, var3);
                        module0012.$g68$.rebind(var32, var3);
                        module0012.$g67$.rebind(var31, var3);
                        module0012.$g65$.rebind(var30, var3);
                        module0012.$g73$.rebind(var29, var3);
                    }
                }
                var25 = var25.rest();
                var26 = var25.first();
            }
            if (NIL != module0225.f14781(var1)) {
                final SubLObject var9 = module0221.$g2399$.currentBinding(var3);
                try {
                    module0221.$g2399$.bind((SubLObject)makeBoolean(NIL == module0221.$g2399$.getDynamicValue(var3)), var3);
                    SubLObject var47 = module0260.f17035(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    SubLObject var48 = (SubLObject)NIL;
                    var48 = var47.first();
                    while (NIL != var47) {
                        final SubLObject var49 = var48;
                        if (NIL != module0158.f10038(var49)) {
                            final SubLObject var50 = (SubLObject)NIL;
                            final SubLObject var34_46 = module0012.$g73$.currentBinding(var3);
                            final SubLObject var51 = module0012.$g65$.currentBinding(var3);
                            final SubLObject var52 = module0012.$g67$.currentBinding(var3);
                            final SubLObject var53 = module0012.$g68$.currentBinding(var3);
                            final SubLObject var54 = module0012.$g66$.currentBinding(var3);
                            final SubLObject var55 = module0012.$g69$.currentBinding(var3);
                            final SubLObject var56 = module0012.$g70$.currentBinding(var3);
                            final SubLObject var57 = module0012.$silent_progressP$.currentBinding(var3);
                            try {
                                module0012.$g73$.bind(Time.get_universal_time(), var3);
                                module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var3), var3);
                                module0012.$g67$.bind((SubLObject)ONE_INTEGER, var3);
                                module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var3);
                                module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var3);
                                module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var3);
                                module0012.$g70$.bind((SubLObject)T, var3);
                                module0012.$silent_progressP$.bind((SubLObject)((NIL != var50) ? module0012.$silent_progressP$.getDynamicValue(var3) : T), var3);
                                module0012.f474(var50);
                                final SubLObject var58 = module0158.f10039(var49);
                                SubLObject var59 = (SubLObject)NIL;
                                final SubLObject var60 = (SubLObject)NIL;
                                while (NIL == var59) {
                                    final SubLObject var61 = module0052.f3695(var58, var60);
                                    final SubLObject var62 = (SubLObject)makeBoolean(!var60.eql(var61));
                                    if (NIL != var62) {
                                        module0012.f476();
                                        SubLObject var63 = (SubLObject)NIL;
                                        try {
                                            var63 = module0158.f10316(var61, (SubLObject)$ic15$, (SubLObject)$ic16$, (SubLObject)NIL);
                                            SubLObject var21_42 = (SubLObject)NIL;
                                            final SubLObject var22_43 = (SubLObject)NIL;
                                            while (NIL == var21_42) {
                                                final SubLObject var64 = module0052.f3695(var63, var22_43);
                                                final SubLObject var24_44 = (SubLObject)makeBoolean(!var22_43.eql(var64));
                                                if (NIL != var24_44 && NIL != ((NIL != module0221.$g2399$.getDynamicValue(var3)) ? Equality.equal(module0205.f13207(module0178.f11303(var64), (SubLObject)UNPROVIDED), var5) : Equality.equal(module0205.f13207(module0178.f11303(var64), (SubLObject)UNPROVIDED), var4))) {
                                                    final SubLObject var65 = module0178.f11333(var64);
                                                    final SubLObject var66 = module0178.f11287(var64);
                                                    if (!var65.equal(var1)) {
                                                        final SubLObject var67 = (NIL != module0221.$g2399$.getDynamicValue(var3)) ? module0191.f11990((SubLObject)$ic21$, (SubLObject)ConsesLow.list($ic22$, var65, var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : module0191.f11990((SubLObject)$ic21$, (SubLObject)ConsesLow.list($ic23$, var65, var1), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                        var7 = (SubLObject)ConsesLow.cons(var64, var7);
                                                        var8 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var67), var8);
                                                    }
                                                    if (NIL != module0262.f17338(var6, var66, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                                        final SubLObject var67 = module0191.f11990((SubLObject)$ic17$, module0202.f12768($ic18$, var6, var66), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                        var7 = (SubLObject)ConsesLow.cons(var64, var7);
                                                        var8 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var67), var8);
                                                    }
                                                }
                                                var21_42 = (SubLObject)makeBoolean(NIL == var24_44);
                                            }
                                        }
                                        finally {
                                            final SubLObject var34_47 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                                                if (NIL != var63) {
                                                    module0158.f10319(var63);
                                                }
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var34_47, var3);
                                            }
                                        }
                                    }
                                    var59 = (SubLObject)makeBoolean(NIL == var62);
                                }
                                module0012.f475();
                            }
                            finally {
                                module0012.$silent_progressP$.rebind(var57, var3);
                                module0012.$g70$.rebind(var56, var3);
                                module0012.$g69$.rebind(var55, var3);
                                module0012.$g66$.rebind(var54, var3);
                                module0012.$g68$.rebind(var53, var3);
                                module0012.$g67$.rebind(var52, var3);
                                module0012.$g65$.rebind(var51, var3);
                                module0012.$g73$.rebind(var34_46, var3);
                            }
                        }
                        var47 = var47.rest();
                        var48 = var47.first();
                    }
                }
                finally {
                    module0221.$g2399$.rebind(var9, var3);
                }
            }
        }
        return Values.values(var7, var8);
    }
    
    public static SubLObject f31929() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL != assertion_handles_oc.f11035($g3706$.getDynamicValue(var3)) && NIL != module0262.f17336(module0147.$g2095$.getDynamicValue(var3), module0178.f11287($g3706$.getDynamicValue(var3)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return module0178.f11287($g3706$.getDynamicValue(var3));
        }
        if (NIL != assertion_handles_oc.f11035(module0528.f32910())) {
            return module0178.f11287(module0528.f32910());
        }
        return module0147.$g2095$.getDynamicValue(var3);
    }
    
    public static SubLObject f31930() {
        return module0274.f18227(module0528.f32909());
    }
    
    public static SubLObject f31931(final SubLObject var2, SubLObject var68) {
        if (var68 == UNPROVIDED) {
            var68 = (SubLObject)NIL;
        }
        return f31922($ic25$, var2);
    }
    
    public static SubLObject f31932(final SubLObject var2, SubLObject var68) {
        if (var68 == UNPROVIDED) {
            var68 = (SubLObject)NIL;
        }
        return f31924($ic25$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31933(final SubLObject var2, SubLObject var68) {
        if (var68 == UNPROVIDED) {
            var68 = (SubLObject)NIL;
        }
        return f31922($ic9$, var2);
    }
    
    public static SubLObject f31934(final SubLObject var2, SubLObject var68) {
        if (var68 == UNPROVIDED) {
            var68 = (SubLObject)NIL;
        }
        return f31924($ic9$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31935(final SubLObject var2, SubLObject var68) {
        if (var68 == UNPROVIDED) {
            var68 = (SubLObject)NIL;
        }
        return f31922(module0205.f13333(module0205.f13387(var2, (SubLObject)UNPROVIDED)), var2);
    }
    
    public static SubLObject f31936(final SubLObject var2, SubLObject var68) {
        if (var68 == UNPROVIDED) {
            var68 = (SubLObject)NIL;
        }
        return f31924(module0205.f13333(module0205.f13387(var2, (SubLObject)UNPROVIDED)), var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31937(final SubLObject var2, SubLObject var68) {
        if (var68 == UNPROVIDED) {
            var68 = (SubLObject)NIL;
        }
        return module0479.f31686(var2, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f31938(final SubLObject var2, SubLObject var68) {
        if (var68 == UNPROVIDED) {
            var68 = (SubLObject)NIL;
        }
        final SubLThread var69 = SubLProcess.currentSubLThread();
        final SubLObject var70 = module0479.f31687(var2);
        if (NIL != var70) {
            SubLObject var73;
            for (SubLObject var71 = (SubLObject)NIL; NIL == var71; var71 = (SubLObject)makeBoolean(NIL == var73)) {
                var69.resetMultipleValues();
                final SubLObject var72 = module0052.f3693(var70);
                var73 = var69.secondMultipleValue();
                var69.resetMultipleValues();
                if (NIL != var73) {
                    SubLObject var75;
                    final SubLObject var74 = var75 = var72;
                    SubLObject var76 = (SubLObject)NIL;
                    SubLObject var77 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var75, var74, (SubLObject)$ic42$);
                    var76 = var75.first();
                    var75 = var75.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var75, var74, (SubLObject)$ic42$);
                    var77 = var75.first();
                    var75 = var75.rest();
                    if (NIL == var75) {
                        final SubLObject var78 = $g3706$.currentBinding(var69);
                        try {
                            $g3706$.bind(var77, var69);
                            final SubLObject var79 = module0233.f15361(var76, var2);
                            final SubLObject var80 = module0205.f13387(var79, (SubLObject)UNPROVIDED);
                            final SubLObject var81 = module0205.f13333(var80);
                            f31924(var81, var79, var76, (SubLObject)ConsesLow.list(var77));
                        }
                        finally {
                            $g3706$.rebind(var78, var69);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var74, (SubLObject)$ic42$);
                    }
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31939() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0485", "f31922", "S#35262", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0485", "f31924", "S#35263", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0485", "f31923", "S#35264", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0485", "f31926", "S#35265", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0485", "f31925", "S#35266", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0485", "f31927", "S#35267", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0485", "f31928", "S#35268", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0485", "f31929", "S#35269", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0485", "f31930", "S#35270", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0485", "f31931", "S#35271", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0485", "f31932", "S#35272", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0485", "f31933", "S#35273", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0485", "f31934", "S#35274", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0485", "f31935", "S#35275", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0485", "f31936", "S#35276", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0485", "f31937", "S#35277", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0485", "f31938", "S#35278", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31940() {
        $g3706$ = SubLFiles.defparameter("S#35279", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f31941() {
        module0340.f22938($ic0$);
        module0358.f23773((SubLObject)$ic1$, $ic0$);
        module0340.f22941((SubLObject)$ic26$, (SubLObject)$ic27$);
        module0340.f22941((SubLObject)$ic28$, (SubLObject)$ic29$);
        module0340.f22941((SubLObject)$ic30$, (SubLObject)$ic31$);
        module0340.f22941((SubLObject)$ic32$, (SubLObject)$ic33$);
        module0340.f22941((SubLObject)$ic34$, (SubLObject)$ic35$);
        module0340.f22941((SubLObject)$ic36$, (SubLObject)$ic37$);
        module0340.f22938($ic38$);
        module0340.f22941((SubLObject)$ic39$, (SubLObject)$ic40$);
        module0012.f419((SubLObject)$ic41$);
        module0012.f419((SubLObject)$ic43$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f31939();
    }
    
    public void initializeVariables() {
        f31940();
    }
    
    public void runTopLevelForms() {
        f31941();
    }
    
    static {
        me = (SubLFile)new module0485();
        $g3706$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("assertedMoreSpecifically"));
        $ic1$ = makeKeyword("BOTH");
        $ic2$ = constant_handles_oc.f8479((SubLObject)makeString("not"));
        $ic3$ = constant_handles_oc.f8479((SubLObject)makeString("thereExists"));
        $ic4$ = makeSymbol("?COL");
        $ic5$ = constant_handles_oc.f8479((SubLObject)makeString("and"));
        $ic6$ = constant_handles_oc.f8479((SubLObject)makeString("assertedSentence"));
        $ic7$ = ConsesLow.list((SubLObject)makeSymbol("?COL"));
        $ic8$ = constant_handles_oc.f8479((SubLObject)makeString("different"));
        $ic9$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic10$ = makeKeyword("OPAQUE");
        $ic11$ = makeString("Inconsistent operators ~s and ~s");
        $ic12$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), constant_handles_oc.f8479((SubLObject)makeString("genls")));
        $ic13$ = constant_handles_oc.f8479((SubLObject)makeString("transitiveViaArg"));
        $ic14$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genls")), (SubLObject)TWO_INTEGER);
        $ic15$ = makeKeyword("GAF");
        $ic16$ = makeKeyword("TRUE");
        $ic17$ = makeKeyword("GENLMT");
        $ic18$ = constant_handles_oc.f8479((SubLObject)makeString("genlMt"));
        $ic19$ = makeKeyword("GENLS");
        $ic20$ = makeSymbol("S#12347", "CYC");
        $ic21$ = makeKeyword("GENLPREDS");
        $ic22$ = constant_handles_oc.f8479((SubLObject)makeString("genlInverse"));
        $ic23$ = constant_handles_oc.f8479((SubLObject)makeString("genlPreds"));
        $ic24$ = makeSymbol("S#12348", "CYC");
        $ic25$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic26$ = makeKeyword("REMOVAL-ASSERTED-MORE-SPECIFICALLY-ISA-CHECK-POS");
        $ic27$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertedMoreSpecifically")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertedMoreSpecifically")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1887", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#35271", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedMoreSpecifically (#$isa <instance> <collection>)) where <instance> and <collection> are FORTs "), makeKeyword("EXAMPLE"), makeString("(#$assertedMoreSpecifically (#$isa #$genls #$Predicate)) \nfrom the asserted sentence in the KB (#isa #$genls #$VocabularyDefiningPredicate) ") });
        $ic28$ = makeKeyword("REMOVAL-ASSERTED-MORE-SPECIFICALLY-ISA-CHECK-NEG");
        $ic29$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertedMoreSpecifically")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertedMoreSpecifically")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1887", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#35272", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertedMoreSpecifically (#$isa <instance> <collection>)) where <instance> and <collection> are FORTs "), makeKeyword("EXAMPLE"), makeString("(#$not (#$assertedMoreSpecifically (#$isa #$genls #$VocabularyDefiningPredicate))) ") });
        $ic30$ = makeKeyword("REMOVAL-ASSERTED-MORE-SPECIFICALLY-GENLS-CHECK-POS");
        $ic31$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertedMoreSpecifically")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertedMoreSpecifically")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genls")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1887", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#35273", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedMoreSpecifically (#$genls <spec-collection> <genl-collection>)) where <spec-collection> and <genl-collection> are FORTs "), makeKeyword("EXAMPLE"), makeString("(#$assertedMoreSpecifically (#$genls #$BinaryPredicate #$Individual)) \nfrom the asserted sentence in the KB (#genls #$BinaryPredicate #$Predicate) ") });
        $ic32$ = makeKeyword("REMOVAL-ASSERTED-MORE-SPECIFICALLY-GENLS-CHECK-NEG");
        $ic33$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertedMoreSpecifically")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertedMoreSpecifically")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genls")), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("FORT"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1887", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#35274", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertedMoreSpecifically (#$genls <spec-collection> <genl-collection>))) where <spec-collection> and <genl-collection> are FORTs "), makeKeyword("EXAMPLE"), makeString("(#$not (#$assertedMoreSpecifically (#$genls #$BinaryPredicate #$BinaryRelation))) ") });
        $ic34$ = makeKeyword("REMOVAL-ASSERTED-MORE-SPECIFICALLY-CHECK-POS");
        $ic35$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertedMoreSpecifically")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertedMoreSpecifically")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), constant_handles_oc.f8479((SubLObject)makeString("isa"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), constant_handles_oc.f8479((SubLObject)makeString("genls")))), (SubLObject)makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1887", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#35275", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedMoreSpecifically (<pred> . <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("") });
        $ic36$ = makeKeyword("REMOVAL-ASSERTED-MORE-SPECIFICALLY-CHECK-NEG");
        $ic37$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("assertedMoreSpecifically")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertedMoreSpecifically")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), constant_handles_oc.f8479((SubLObject)makeString("isa"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), constant_handles_oc.f8479((SubLObject)makeString("genls")))), (SubLObject)makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1887", "CYC"), makeKeyword("EXPAND"), makeSymbol("S#35276", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertedMoreSpecifically (<pred> . <fully-bound>)))"), makeKeyword("EXAMPLE"), makeString("") });
        $ic38$ = constant_handles_oc.f8479((SubLObject)makeString("strongestAssertedSentence"));
        $ic39$ = makeKeyword("REMOVAL-STRONGEST-ASSERTED-SENTENCE-LOOKUP-POS");
        $ic40$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("strongestAssertedSentence")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("strongestAssertedSentence")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#26073", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("not")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#26073", "CYC")), (SubLObject)makeKeyword("ANYTHING"))))), makeKeyword("COST"), makeSymbol("S#35277", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#35278", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$strongestAssertedSentence (<predicate> <anything>))"), makeKeyword("EXAMPLE"), makeString("") });
        $ic41$ = makeSymbol("S#35277", "CYC");
        $ic42$ = ConsesLow.list((SubLObject)makeSymbol("S#713", "CYC"), (SubLObject)makeSymbol("S#12459", "CYC"));
        $ic43$ = makeSymbol("S#35278", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 640 ms
	
	Decompiled with Procyon 0.5.32.
*/