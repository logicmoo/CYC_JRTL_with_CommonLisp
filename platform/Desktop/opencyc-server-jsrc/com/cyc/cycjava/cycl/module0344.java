package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0344 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0344";
    public static final String myFingerPrint = "0e7a823bd51bc74ba604db023a0bda43ca065e6a6a3b66988f6ceb31f65372a5";
    public static SubLSymbol $g2955$;
    private static SubLSymbol $g2956$;
    private static SubLSymbol $g2957$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLInteger $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    
    public static SubLObject f23207() {
        if (NIL != $g2956$.getGlobalValue()) {
            Hashtables.clrhash($g2956$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23208() {
        if (NIL != $g2957$.getGlobalValue()) {
            Hashtables.clrhash($g2957$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23209(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        assert NIL != module0191.f11910(var1) : var1;
        assert NIL != assertion_handles_oc.f11035(var2) : var2;
        if (NIL == module0343.$g2954$.getDynamicValue(var3) && NIL != module0178.f11290(var2)) {
            final SubLObject var4 = module0178.f11282(var2);
            SubLObject var5 = module0232.f15306(var4);
            SubLObject var6 = (SubLObject)NIL;
            var6 = var5.first();
            while (NIL != var5) {
                f23210(var1, var6, var2);
                var5 = var5.rest();
                var6 = var5.first();
            }
            var5 = module0232.f15308(var4);
            var6 = (SubLObject)NIL;
            var6 = var5.first();
            while (NIL != var5) {
                f23210(var1, var6, var2);
                var5 = var5.rest();
                var6 = var5.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23210(final SubLObject var1, final SubLObject var6, final SubLObject var2) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = module0202.f12831(var6, (SubLObject)ZERO_INTEGER, (SubLObject)UNPROVIDED);
        final SubLObject var9 = module0178.f11287(var2);
        if (NIL != module0173.f10955(var8)) {
            final SubLObject var10 = module0147.f9540(var9);
            final SubLObject var11 = module0147.$g2095$.currentBinding(var7);
            final SubLObject var12 = module0147.$g2094$.currentBinding(var7);
            final SubLObject var13 = module0147.$g2096$.currentBinding(var7);
            try {
                module0147.$g2095$.bind(module0147.f9545(var10), var7);
                module0147.$g2094$.bind(module0147.f9546(var10), var7);
                module0147.$g2096$.bind(module0147.f9549(var10), var7);
                SubLObject var14 = f23211(var8);
                SubLObject var15 = (SubLObject)NIL;
                var15 = var14.first();
                while (NIL != var14) {
                    SubLObject var17;
                    final SubLObject var16 = var17 = var15;
                    SubLObject var18 = (SubLObject)NIL;
                    SubLObject var19 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic4$);
                    var18 = var17.first();
                    var17 = (var19 = var17.rest());
                    if (var18.isFunctionSpec() && NIL != module0147.f9507(var19)) {
                        SubLObject var20 = (SubLObject)NIL;
                        try {
                            var7.throwStack.push($ic5$);
                            final SubLObject var10_19 = Errors.$error_handler$.currentBinding(var7);
                            try {
                                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic6$), var7);
                                try {
                                    f23212(var18, var1, var6, var2);
                                }
                                catch (Throwable var21) {
                                    Errors.handleThrowable(var21, (SubLObject)NIL);
                                }
                            }
                            finally {
                                Errors.$error_handler$.rebind(var10_19, var7);
                            }
                        }
                        catch (Throwable var22) {
                            var20 = Errors.handleThrowable(var22, (SubLObject)$ic5$);
                        }
                        finally {
                            var7.throwStack.pop();
                        }
                    }
                    var14 = var14.rest();
                    var15 = var14.first();
                }
            }
            finally {
                module0147.$g2096$.rebind(var13, var7);
                module0147.$g2094$.rebind(var12, var7);
                module0147.$g2095$.rebind(var11, var7);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23213(final SubLObject var1, final SubLObject var2) {
        assert NIL != module0191.f11910(var1) : var1;
        assert NIL != assertion_handles_oc.f11035(var2) : var2;
        if (NIL != module0178.f11290(var2)) {
            final SubLObject var3 = module0178.f11282(var2);
            SubLObject var4 = module0232.f15306(var3);
            SubLObject var5 = (SubLObject)NIL;
            var5 = var4.first();
            while (NIL != var4) {
                f23214(var1, var5, var2);
                var4 = var4.rest();
                var5 = var4.first();
            }
            var4 = module0232.f15308(var3);
            var5 = (SubLObject)NIL;
            var5 = var4.first();
            while (NIL != var4) {
                f23214(var1, var5, var2);
                var4 = var4.rest();
                var5 = var4.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23214(final SubLObject var1, final SubLObject var6, final SubLObject var2) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = module0202.f12831(var2, (SubLObject)ZERO_INTEGER, (SubLObject)UNPROVIDED);
        final SubLObject var9 = module0178.f11287(var2);
        if (NIL != module0173.f10955(var8)) {
            final SubLObject var10 = module0147.f9540(var9);
            final SubLObject var11 = module0147.$g2095$.currentBinding(var7);
            final SubLObject var12 = module0147.$g2094$.currentBinding(var7);
            final SubLObject var13 = module0147.$g2096$.currentBinding(var7);
            try {
                module0147.$g2095$.bind(module0147.f9545(var10), var7);
                module0147.$g2094$.bind(module0147.f9546(var10), var7);
                module0147.$g2096$.bind(module0147.f9549(var10), var7);
                SubLObject var14 = f23215(var8);
                SubLObject var15 = (SubLObject)NIL;
                var15 = var14.first();
                while (NIL != var14) {
                    SubLObject var17;
                    final SubLObject var16 = var17 = var15;
                    SubLObject var18 = (SubLObject)NIL;
                    SubLObject var19 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic4$);
                    var18 = var17.first();
                    var17 = (var19 = var17.rest());
                    if (var18.isFunctionSpec() && NIL != module0147.f9507(var19)) {
                        SubLObject var20 = (SubLObject)NIL;
                        try {
                            var7.throwStack.push($ic5$);
                            final SubLObject var10_25 = Errors.$error_handler$.currentBinding(var7);
                            try {
                                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic6$), var7);
                                try {
                                    f23216(var18, var1, var6, var2);
                                }
                                catch (Throwable var21) {
                                    Errors.handleThrowable(var21, (SubLObject)NIL);
                                }
                            }
                            finally {
                                Errors.$error_handler$.rebind(var10_25, var7);
                            }
                        }
                        catch (Throwable var22) {
                            var20 = Errors.handleThrowable(var22, (SubLObject)$ic5$);
                        }
                        finally {
                            var7.throwStack.pop();
                        }
                    }
                    var14 = var14.rest();
                    var15 = var14.first();
                }
            }
            finally {
                module0147.$g2096$.rebind(var13, var7);
                module0147.$g2094$.rebind(var12, var7);
                module0147.$g2095$.rebind(var11, var7);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23211(final SubLObject var7) {
        if (NIL == $g2956$.getGlobalValue()) {
            f23217();
        }
        return Hashtables.gethash_without_values(var7, $g2956$.getGlobalValue(), (SubLObject)NIL);
    }
    
    public static SubLObject f23215(final SubLObject var7) {
        if (NIL == $g2957$.getGlobalValue()) {
            f23218();
        }
        return Hashtables.gethash_without_values(var7, $g2957$.getGlobalValue(), (SubLObject)NIL);
    }
    
    public static SubLObject f23212(final SubLObject var26, final SubLObject var1, final SubLObject var6, final SubLObject var2) {
        final SubLObject var27 = module0018.$g573$.getGlobalValue();
        SubLObject var28 = (SubLObject)NIL;
        try {
            var28 = Locks.seize_lock(var27);
            Functions.funcall(var26, var1, var6, var2);
        }
        finally {
            if (NIL != var28) {
                Locks.release_lock(var27);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23216(final SubLObject var26, final SubLObject var1, final SubLObject var6, final SubLObject var2) {
        final SubLObject var27 = module0018.$g573$.getGlobalValue();
        SubLObject var28 = (SubLObject)NIL;
        try {
            var28 = Locks.seize_lock(var27);
            Functions.funcall(var26, var1, var6, var2);
        }
        finally {
            if (NIL != var28) {
                Locks.release_lock(var27);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23219() {
        f23217();
        f23218();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23217() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL != $g2956$.getGlobalValue()) {
            Hashtables.clrhash($g2956$.getGlobalValue());
        }
        else {
            $g2956$.setGlobalValue(Hashtables.make_hash_table((SubLObject)$ic7$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        final SubLObject var4 = module0147.$g2094$.currentBinding(var3);
        final SubLObject var5 = module0147.$g2095$.currentBinding(var3);
        try {
            module0147.$g2094$.bind((SubLObject)$ic8$, var3);
            module0147.$g2095$.bind($ic9$, var3);
            final SubLObject var6 = $ic10$;
            if (NIL != module0158.f10038(var6)) {
                final SubLObject var7 = (SubLObject)NIL;
                final SubLObject var10_33 = module0012.$g73$.currentBinding(var3);
                final SubLObject var11_34 = module0012.$g65$.currentBinding(var3);
                final SubLObject var8 = module0012.$g67$.currentBinding(var3);
                final SubLObject var9 = module0012.$g68$.currentBinding(var3);
                final SubLObject var10 = module0012.$g66$.currentBinding(var3);
                final SubLObject var11 = module0012.$g69$.currentBinding(var3);
                final SubLObject var12 = module0012.$g70$.currentBinding(var3);
                final SubLObject var13 = module0012.$silent_progressP$.currentBinding(var3);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var3);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var3), var3);
                    module0012.$g67$.bind((SubLObject)ONE_INTEGER, var3);
                    module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var3);
                    module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var3);
                    module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var3);
                    module0012.$g70$.bind((SubLObject)T, var3);
                    module0012.$silent_progressP$.bind((SubLObject)((NIL != var7) ? module0012.$silent_progressP$.getDynamicValue(var3) : T), var3);
                    module0012.f474(var7);
                    final SubLObject var14 = module0158.f10039(var6);
                    SubLObject var15 = (SubLObject)NIL;
                    final SubLObject var16 = (SubLObject)NIL;
                    while (NIL == var15) {
                        final SubLObject var17 = module0052.f3695(var14, var16);
                        final SubLObject var18 = (SubLObject)makeBoolean(!var16.eql(var17));
                        if (NIL != var18) {
                            module0012.f476();
                            SubLObject var19 = (SubLObject)NIL;
                            try {
                                var19 = module0158.f10316(var17, (SubLObject)$ic11$, (SubLObject)NIL, (SubLObject)NIL);
                                SubLObject var41_46 = (SubLObject)NIL;
                                final SubLObject var42_47 = (SubLObject)NIL;
                                while (NIL == var41_46) {
                                    final SubLObject var20 = module0052.f3695(var19, var42_47);
                                    final SubLObject var44_49 = (SubLObject)makeBoolean(!var42_47.eql(var20));
                                    if (NIL != var44_49) {
                                        final SubLObject var21 = module0178.f11285(var20);
                                        SubLObject var23;
                                        final SubLObject var22 = var23 = var21;
                                        SubLObject var24 = (SubLObject)NIL;
                                        SubLObject var25 = (SubLObject)NIL;
                                        SubLObject var26 = (SubLObject)NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)$ic12$);
                                        var24 = var23.first();
                                        var23 = var23.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)$ic12$);
                                        var25 = var23.first();
                                        var23 = var23.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)$ic12$);
                                        var26 = var23.first();
                                        var23 = var23.rest();
                                        if (NIL == var23) {
                                            if (NIL != module0173.f10969(var25)) {
                                                var26 = module0202.f12757(var26);
                                                final SubLObject var27 = (SubLObject)ConsesLow.cons(var26, module0178.f11287(var20));
                                                if (NIL == conses_high.member(var27, Hashtables.gethash(var25, $g2956$.getGlobalValue(), (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                                    Hashtables.sethash(var25, $g2956$.getGlobalValue(), (SubLObject)ConsesLow.cons(var27, Hashtables.gethash(var25, $g2956$.getGlobalValue(), (SubLObject)UNPROVIDED)));
                                                }
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(var22, (SubLObject)$ic12$);
                                        }
                                    }
                                    var41_46 = (SubLObject)makeBoolean(NIL == var44_49);
                                }
                            }
                            finally {
                                final SubLObject var10_34 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                                    if (NIL != var19) {
                                        module0158.f10319(var19);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var10_34, var3);
                                }
                            }
                        }
                        var15 = (SubLObject)makeBoolean(NIL == var18);
                    }
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var13, var3);
                    module0012.$g70$.rebind(var12, var3);
                    module0012.$g69$.rebind(var11, var3);
                    module0012.$g66$.rebind(var10, var3);
                    module0012.$g68$.rebind(var9, var3);
                    module0012.$g67$.rebind(var8, var3);
                    module0012.$g65$.rebind(var11_34, var3);
                    module0012.$g73$.rebind(var10_33, var3);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var5, var3);
            module0147.$g2094$.rebind(var4, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23218() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (!$g2957$.getGlobalValue().isHashtable()) {
            $g2957$.setGlobalValue(Hashtables.make_hash_table((SubLObject)$ic7$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        else {
            Hashtables.clrhash($g2957$.getGlobalValue());
        }
        final SubLObject var4 = module0147.$g2094$.currentBinding(var3);
        final SubLObject var5 = module0147.$g2095$.currentBinding(var3);
        try {
            module0147.$g2094$.bind((SubLObject)$ic8$, var3);
            module0147.$g2095$.bind($ic9$, var3);
            final SubLObject var6 = $ic13$;
            if (NIL != module0158.f10038(var6)) {
                final SubLObject var7 = (SubLObject)NIL;
                final SubLObject var10_57 = module0012.$g73$.currentBinding(var3);
                final SubLObject var11_58 = module0012.$g65$.currentBinding(var3);
                final SubLObject var8 = module0012.$g67$.currentBinding(var3);
                final SubLObject var9 = module0012.$g68$.currentBinding(var3);
                final SubLObject var10 = module0012.$g66$.currentBinding(var3);
                final SubLObject var11 = module0012.$g69$.currentBinding(var3);
                final SubLObject var12 = module0012.$g70$.currentBinding(var3);
                final SubLObject var13 = module0012.$silent_progressP$.currentBinding(var3);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var3);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var3), var3);
                    module0012.$g67$.bind((SubLObject)ONE_INTEGER, var3);
                    module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var3);
                    module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var3);
                    module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var3);
                    module0012.$g70$.bind((SubLObject)T, var3);
                    module0012.$silent_progressP$.bind((SubLObject)((NIL != var7) ? module0012.$silent_progressP$.getDynamicValue(var3) : T), var3);
                    module0012.f474(var7);
                    final SubLObject var14 = module0158.f10039(var6);
                    SubLObject var15 = (SubLObject)NIL;
                    final SubLObject var16 = (SubLObject)NIL;
                    while (NIL == var15) {
                        final SubLObject var17 = module0052.f3695(var14, var16);
                        final SubLObject var18 = (SubLObject)makeBoolean(!var16.eql(var17));
                        if (NIL != var18) {
                            module0012.f476();
                            SubLObject var19 = (SubLObject)NIL;
                            try {
                                var19 = module0158.f10316(var17, (SubLObject)$ic11$, (SubLObject)NIL, (SubLObject)NIL);
                                SubLObject var41_59 = (SubLObject)NIL;
                                final SubLObject var42_60 = (SubLObject)NIL;
                                while (NIL == var41_59) {
                                    final SubLObject var20 = module0052.f3695(var19, var42_60);
                                    final SubLObject var44_61 = (SubLObject)makeBoolean(!var42_60.eql(var20));
                                    if (NIL != var44_61) {
                                        final SubLObject var21 = module0178.f11285(var20);
                                        SubLObject var23;
                                        final SubLObject var22 = var23 = var21;
                                        SubLObject var24 = (SubLObject)NIL;
                                        SubLObject var25 = (SubLObject)NIL;
                                        SubLObject var26 = (SubLObject)NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)$ic14$);
                                        var24 = var23.first();
                                        var23 = var23.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)$ic14$);
                                        var25 = var23.first();
                                        var23 = var23.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)$ic14$);
                                        var26 = var23.first();
                                        var23 = var23.rest();
                                        if (NIL == var23) {
                                            if (NIL != module0173.f10969(var25)) {
                                                var26 = module0202.f12757(var26);
                                                final SubLObject var27 = (SubLObject)ConsesLow.cons(var26, module0178.f11287(var20));
                                                if (NIL == conses_high.member(var27, Hashtables.gethash(var25, $g2957$.getGlobalValue(), (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                                    Hashtables.sethash(var25, $g2957$.getGlobalValue(), (SubLObject)ConsesLow.cons(var27, Hashtables.gethash(var25, $g2957$.getGlobalValue(), (SubLObject)UNPROVIDED)));
                                                }
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(var22, (SubLObject)$ic14$);
                                        }
                                    }
                                    var41_59 = (SubLObject)makeBoolean(NIL == var44_61);
                                }
                            }
                            finally {
                                final SubLObject var10_58 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                                    if (NIL != var19) {
                                        module0158.f10319(var19);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var10_58, var3);
                                }
                            }
                        }
                        var15 = (SubLObject)makeBoolean(NIL == var18);
                    }
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var13, var3);
                    module0012.$g70$.rebind(var12, var3);
                    module0012.$g69$.rebind(var11, var3);
                    module0012.$g66$.rebind(var10, var3);
                    module0012.$g68$.rebind(var9, var3);
                    module0012.$g67$.rebind(var8, var3);
                    module0012.$g65$.rebind(var11_58, var3);
                    module0012.$g73$.rebind(var10_57, var3);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var5, var3);
            module0147.$g2094$.rebind(var4, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23220(final SubLObject var67) {
        final SubLThread var68 = SubLProcess.currentSubLThread();
        assert NIL != module0173.f10955(var67) : var67;
        if (NIL == $g2956$.getGlobalValue()) {
            f23217();
        }
        Hashtables.remhash(var67, $g2956$.getGlobalValue());
        SubLObject var69 = (SubLObject)NIL;
        final SubLObject var70 = module0147.$g2094$.currentBinding(var68);
        final SubLObject var71 = module0147.$g2095$.currentBinding(var68);
        try {
            module0147.$g2094$.bind((SubLObject)$ic8$, var68);
            module0147.$g2095$.bind($ic9$, var68);
            final SubLObject var72 = $ic10$;
            if (NIL != module0158.f10010(var67, (SubLObject)NIL, var72)) {
                final SubLObject var73 = module0158.f10011(var67, (SubLObject)NIL, var72);
                SubLObject var74 = (SubLObject)NIL;
                final SubLObject var75 = (SubLObject)NIL;
                while (NIL == var74) {
                    final SubLObject var76 = module0052.f3695(var73, var75);
                    final SubLObject var77 = (SubLObject)makeBoolean(!var75.eql(var76));
                    if (NIL != var77) {
                        SubLObject var78 = (SubLObject)NIL;
                        try {
                            var78 = module0158.f10316(var76, (SubLObject)$ic11$, (SubLObject)NIL, (SubLObject)NIL);
                            SubLObject var41_71 = (SubLObject)NIL;
                            final SubLObject var42_72 = (SubLObject)NIL;
                            while (NIL == var41_71) {
                                final SubLObject var79 = module0052.f3695(var78, var42_72);
                                final SubLObject var44_73 = (SubLObject)makeBoolean(!var42_72.eql(var79));
                                if (NIL != var44_73 && NIL != module0178.f11299(var79)) {
                                    final SubLObject var80 = module0202.f12757(module0178.f11331(var79, (SubLObject)TWO_INTEGER));
                                    final SubLObject var81 = (SubLObject)ConsesLow.cons(var80, module0178.f11287(var79));
                                    if (NIL == conses_high.member(var81, var69, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                        var69 = (SubLObject)ConsesLow.cons(var81, var69);
                                    }
                                }
                                var41_71 = (SubLObject)makeBoolean(NIL == var44_73);
                            }
                        }
                        finally {
                            final SubLObject var10_74 = Threads.$is_thread_performing_cleanupP$.currentBinding(var68);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var68);
                                if (NIL != var78) {
                                    module0158.f10319(var78);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var10_74, var68);
                            }
                        }
                    }
                    var74 = (SubLObject)makeBoolean(NIL == var77);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var71, var68);
            module0147.$g2094$.rebind(var70, var68);
        }
        if (NIL != var69) {
            Hashtables.sethash(var67, $g2956$.getGlobalValue(), Sequences.nreverse(var69));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23221(final SubLObject var67) {
        final SubLThread var68 = SubLProcess.currentSubLThread();
        assert NIL != module0173.f10955(var67) : var67;
        if (NIL == $g2957$.getGlobalValue()) {
            f23218();
        }
        Hashtables.remhash(var67, $g2957$.getGlobalValue());
        SubLObject var69 = (SubLObject)NIL;
        final SubLObject var70 = module0147.$g2094$.currentBinding(var68);
        final SubLObject var71 = module0147.$g2095$.currentBinding(var68);
        try {
            module0147.$g2094$.bind((SubLObject)$ic8$, var68);
            module0147.$g2095$.bind($ic9$, var68);
            final SubLObject var72 = $ic13$;
            if (NIL != module0158.f10010(var67, (SubLObject)NIL, var72)) {
                final SubLObject var73 = module0158.f10011(var67, (SubLObject)NIL, var72);
                SubLObject var74 = (SubLObject)NIL;
                final SubLObject var75 = (SubLObject)NIL;
                while (NIL == var74) {
                    final SubLObject var76 = module0052.f3695(var73, var75);
                    final SubLObject var77 = (SubLObject)makeBoolean(!var75.eql(var76));
                    if (NIL != var77) {
                        SubLObject var78 = (SubLObject)NIL;
                        try {
                            var78 = module0158.f10316(var76, (SubLObject)$ic11$, (SubLObject)NIL, (SubLObject)NIL);
                            SubLObject var41_75 = (SubLObject)NIL;
                            final SubLObject var42_76 = (SubLObject)NIL;
                            while (NIL == var41_75) {
                                final SubLObject var79 = module0052.f3695(var78, var42_76);
                                final SubLObject var44_77 = (SubLObject)makeBoolean(!var42_76.eql(var79));
                                if (NIL != var44_77 && NIL != module0178.f11299(var79)) {
                                    final SubLObject var80 = module0202.f12757(module0178.f11331(var79, (SubLObject)TWO_INTEGER));
                                    final SubLObject var81 = (SubLObject)ConsesLow.cons(var80, module0178.f11287(var79));
                                    if (NIL == conses_high.member(var81, var69, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                        var69 = (SubLObject)ConsesLow.cons(var81, var69);
                                    }
                                }
                                var41_75 = (SubLObject)makeBoolean(NIL == var44_77);
                            }
                        }
                        finally {
                            final SubLObject var10_78 = Threads.$is_thread_performing_cleanupP$.currentBinding(var68);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var68);
                                if (NIL != var78) {
                                    module0158.f10319(var78);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var10_78, var68);
                            }
                        }
                    }
                    var74 = (SubLObject)makeBoolean(NIL == var77);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var71, var68);
            module0147.$g2094$.rebind(var70, var68);
        }
        if (NIL != var69) {
            Hashtables.sethash(var67, $g2957$.getGlobalValue(), Sequences.nreverse(var69));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23222(final SubLObject var1, final SubLObject var2) {
        assert NIL != module0191.f11910(var1) : var1;
        if (NIL != module0178.f11284(var2) && NIL != module0178.f11343(var2, (SubLObject)$ic16$)) {
            final SubLObject var3 = module0178.f11285(var2);
            if (module0202.f12839(var3, (SubLObject)UNPROVIDED).numE((SubLObject)TWO_INTEGER)) {
                final SubLObject var4 = module0202.f12834(var3, (SubLObject)UNPROVIDED);
                final SubLObject var5 = module0202.f12757(module0202.f12835(var3, (SubLObject)UNPROVIDED));
                final SubLObject var6 = module0178.f11287(var2);
                if (NIL != module0173.f10955(var4) && var5.isSymbol() && NIL != Symbols.fboundp(var5) && var5 != $ic17$) {
                    f23223(var4, var5, var6);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23223(final SubLObject var67, final SubLObject var26, final SubLObject var8) {
        final SubLThread var68 = SubLProcess.currentSubLThread();
        assert NIL != module0173.f10955(var67) : var67;
        assert NIL != Types.symbolp(var26) : var26;
        assert NIL != module0161.f10481(var8) : var8;
        if (NIL != Symbols.fboundp(var26)) {
            final SubLObject var69 = module0018.$g587$.currentBinding(var68);
            final SubLObject var70 = module0147.$g2094$.currentBinding(var68);
            final SubLObject var71 = module0147.$g2095$.currentBinding(var68);
            try {
                module0018.$g587$.bind(var26, var68);
                module0147.$g2094$.bind((SubLObject)$ic20$, var68);
                module0147.$g2095$.bind(var8, var68);
                if (NIL != module0158.f10084(var67, (SubLObject)NIL, (SubLObject)NIL)) {
                    final SubLObject var72 = module0158.f10085(var67, (SubLObject)NIL, (SubLObject)NIL);
                    SubLObject var73 = (SubLObject)NIL;
                    final SubLObject var74 = (SubLObject)NIL;
                    while (NIL == var73) {
                        final SubLObject var75 = module0052.f3695(var72, var74);
                        final SubLObject var76 = (SubLObject)makeBoolean(!var74.eql(var75));
                        if (NIL != var76) {
                            SubLObject var77 = (SubLObject)NIL;
                            try {
                                var77 = module0158.f10316(var75, (SubLObject)$ic21$, (SubLObject)NIL, (SubLObject)NIL);
                                SubLObject var41_80 = (SubLObject)NIL;
                                final SubLObject var42_81 = (SubLObject)NIL;
                                while (NIL == var41_80) {
                                    final SubLObject var78 = module0052.f3695(var77, var42_81);
                                    final SubLObject var44_82 = (SubLObject)makeBoolean(!var42_81.eql(var78));
                                    if (NIL != var44_82) {
                                        f23224(var78, var67);
                                    }
                                    var41_80 = (SubLObject)makeBoolean(NIL == var44_82);
                                }
                            }
                            finally {
                                final SubLObject var10_83 = Threads.$is_thread_performing_cleanupP$.currentBinding(var68);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var68);
                                    if (NIL != var77) {
                                        module0158.f10319(var77);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var10_83, var68);
                                }
                            }
                        }
                        var73 = (SubLObject)makeBoolean(NIL == var76);
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var71, var68);
                module0147.$g2094$.rebind(var70, var68);
                module0018.$g587$.rebind(var69, var68);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23224(final SubLObject var2, final SubLObject var67) {
        final SubLThread var68 = SubLProcess.currentSubLThread();
        final SubLObject var69 = module0178.f11299(var2);
        final SubLObject var70 = module0147.$g2094$.currentBinding(var68);
        final SubLObject var71 = module0147.$g2095$.currentBinding(var68);
        try {
            module0147.$g2094$.bind((SubLObject)$ic22$, var68);
            module0147.$g2095$.bind(module0178.f11287(var2), var68);
            SubLObject var72 = var69;
            SubLObject var73 = (SubLObject)NIL;
            var73 = var72.first();
            while (NIL != var72) {
                SubLObject var74 = (SubLObject)NIL;
                try {
                    var68.throwStack.push($ic5$);
                    final SubLObject var10_86 = Errors.$error_handler$.currentBinding(var68);
                    try {
                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic6$), var68);
                        try {
                            SubLObject var5_87 = f23225(var2, var67);
                            SubLObject var75 = (SubLObject)NIL;
                            var75 = var5_87.first();
                            while (NIL != var5_87) {
                                f23212(module0018.$g587$.getDynamicValue(var68), var73, var75, var2);
                                var5_87 = var5_87.rest();
                                var75 = var5_87.first();
                            }
                        }
                        catch (Throwable var76) {
                            Errors.handleThrowable(var76, (SubLObject)NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(var10_86, var68);
                    }
                }
                catch (Throwable var77) {
                    var74 = Errors.handleThrowable(var77, (SubLObject)$ic5$);
                }
                finally {
                    var68.throwStack.pop();
                }
                var72 = var72.rest();
                var73 = var72.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var71, var68);
            module0147.$g2094$.rebind(var70, var68);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23225(final SubLObject var2, final SubLObject var7) {
        SubLObject var8 = (SubLObject)NIL;
        final SubLObject var9 = module0225.f14739(var7);
        final SubLObject var10 = module0178.f11282(var2);
        SubLObject var11 = module0232.f15308(var10);
        SubLObject var12 = (SubLObject)NIL;
        var12 = var11.first();
        while (NIL != var11) {
            if (var7.eql(module0202.f12831(var12, (SubLObject)ZERO_INTEGER, (SubLObject)UNPROVIDED)) && NIL != module0202.f12734(var12, var9, (SubLObject)UNPROVIDED)) {
                var8 = (SubLObject)ConsesLow.cons(var12, var8);
            }
            var11 = var11.rest();
            var12 = var11.first();
        }
        return var8;
    }
    
    public static SubLObject f23226() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0344", "f23207", "S#25902", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0344", "f23208", "S#25903", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0344", "f23209", "S#25904", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0344", "f23210", "S#25934", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0344", "f23213", "S#25905", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0344", "f23214", "S#25935", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0344", "f23211", "S#25936", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0344", "f23215", "S#25937", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0344", "f23212", "S#25938", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0344", "f23216", "S#25939", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0344", "f23219", "S#25906", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0344", "f23217", "S#25940", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0344", "f23218", "S#25941", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0344", "f23220", "S#25942", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0344", "f23221", "S#25943", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0344", "f23222", "S#25944", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0344", "f23223", "S#25945", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0344", "f23224", "S#25946", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0344", "f23225", "S#25947", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23227() {
        $g2955$ = SubLFiles.deflexical("S#25948", (SubLObject)NIL);
        $g2956$ = SubLFiles.deflexical("S#25949", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic0$)) ? $g2956$.getGlobalValue() : NIL));
        $g2957$ = SubLFiles.deflexical("S#25950", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic1$)) ? $g2957$.getGlobalValue() : NIL));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23228() {
        module0003.f57((SubLObject)$ic0$);
        module0003.f57((SubLObject)$ic1$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f23226();
    }
    
    public void initializeVariables() {
        f23227();
    }
    
    public void runTopLevelForms() {
        f23228();
    }
    
    static {
        me = (SubLFile)new module0344();
        $g2955$ = null;
        $g2956$ = null;
        $g2957$ = null;
        $ic0$ = makeSymbol("S#25949", "CYC");
        $ic1$ = makeSymbol("S#25950", "CYC");
        $ic2$ = makeSymbol("ARGUMENT-P");
        $ic3$ = makeSymbol("ASSERTION-P");
        $ic4$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#813", "CYC"), (SubLObject)makeSymbol("S#25929", "CYC"));
        $ic5$ = makeKeyword("IGNORE-ERRORS-TARGET");
        $ic6$ = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic7$ = makeInteger(100);
        $ic8$ = makeSymbol("S#12274", "CYC");
        $ic9$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic10$ = constant_handles_oc.f8479((SubLObject)makeString("ruleAfterAdding"));
        $ic11$ = makeKeyword("GAF");
        $ic12$ = ConsesLow.list((SubLObject)makeSymbol("S#25951", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#25952", "CYC"));
        $ic13$ = constant_handles_oc.f8479((SubLObject)makeString("ruleAfterRemoving"));
        $ic14$ = ConsesLow.list((SubLObject)makeSymbol("S#25953", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#25954", "CYC"));
        $ic15$ = makeSymbol("FORT-P");
        $ic16$ = makeKeyword("TRUE");
        $ic17$ = makeSymbol("S#25944", "CYC");
        $ic18$ = makeSymbol("SYMBOLP");
        $ic19$ = makeSymbol("S#12263", "CYC");
        $ic20$ = makeSymbol("S#12279", "CYC");
        $ic21$ = makeKeyword("RULE");
        $ic22$ = makeSymbol("S#12278", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 356 ms
	
	Decompiled with Procyon 0.5.32.
*/