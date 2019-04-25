package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0343 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0343";
    public static final String myFingerPrint = "0d667418ee325f51db33851ffce472da652ff6281080eac2e82cc579af4a5d1c";
    public static SubLSymbol $g2950$;
    public static SubLSymbol $g2951$;
    private static SubLSymbol $g2952$;
    private static SubLSymbol $g2953$;
    public static SubLSymbol $g2954$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLInteger $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLObject $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLObject $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    
    public static SubLObject f23182() {
        f23183();
        module0344.f23207();
        return (SubLObject)module0343.NIL;
    }
    
    public static SubLObject f23183() {
        if (module0343.NIL != module0343.$g2952$.getGlobalValue()) {
            Hashtables.clrhash(module0343.$g2952$.getGlobalValue());
        }
        return (SubLObject)module0343.NIL;
    }
    
    public static SubLObject f23184() {
        f23185();
        module0344.f23208();
        return (SubLObject)module0343.NIL;
    }
    
    public static SubLObject f23185() {
        if (module0343.NIL != module0343.$g2953$.getGlobalValue()) {
            Hashtables.clrhash(module0343.$g2953$.getGlobalValue());
        }
        return (SubLObject)module0343.NIL;
    }
    
    public static SubLObject f23186(final SubLObject var1, final SubLObject var2) {
        final SubLObject var3 = var1.rest();
        final SubLObject var5;
        final SubLObject var4 = var5 = var3;
        return (SubLObject)ConsesLow.listS((SubLObject)module0343.$ic3$, (SubLObject)module0343.$ic4$, ConsesLow.append(var5, (SubLObject)module0343.NIL));
    }
    
    public static SubLObject f23187(final SubLObject var6, final SubLObject var7) {
        f23188(var6, var7);
        if (module0343.NIL != assertion_handles_oc.f11041(var7, (SubLObject)module0343.UNPROVIDED)) {
            module0344.f23209(var6, var7);
        }
        return (SubLObject)module0343.NIL;
    }
    
    public static SubLObject f23188(final SubLObject var6, final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        assert module0343.NIL != module0191.f11910(var6) : var6;
        assert module0343.NIL != assertion_handles_oc.f11035(var7) : var7;
        if (module0343.NIL == module0343.$g2954$.getDynamicValue(var8) && module0343.NIL != module0178.f11284(var7)) {
            final SubLObject var9 = module0178.f11331(var7, (SubLObject)module0343.ZERO_INTEGER);
            final SubLObject var10 = module0178.f11287(var7);
            if (module0343.NIL != module0173.f10955(var9)) {
                final SubLObject var11 = module0147.f9540(var10);
                final SubLObject var12 = module0147.$g2095$.currentBinding(var8);
                final SubLObject var13 = module0147.$g2094$.currentBinding(var8);
                final SubLObject var14 = module0147.$g2096$.currentBinding(var8);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var11), var8);
                    module0147.$g2094$.bind(module0147.f9546(var11), var8);
                    module0147.$g2096$.bind(module0147.f9549(var11), var8);
                    SubLObject var15 = f23189(var9);
                    SubLObject var16 = (SubLObject)module0343.NIL;
                    var16 = var15.first();
                    while (module0343.NIL != var15) {
                        SubLObject var18;
                        final SubLObject var17 = var18 = var16;
                        SubLObject var19 = (SubLObject)module0343.NIL;
                        SubLObject var20 = (SubLObject)module0343.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var18, var17, (SubLObject)module0343.$ic7$);
                        var19 = var18.first();
                        var18 = (var20 = var18.rest());
                        if (var19.isFunctionSpec() && module0343.NIL != module0147.f9507(var20)) {
                            if (module0343.NIL == module0343.$g2950$.getDynamicValue(var8)) {
                                SubLObject var21 = (SubLObject)module0343.NIL;
                                try {
                                    var8.throwStack.push(module0343.$ic8$);
                                    final SubLObject var12_22 = Errors.$error_handler$.currentBinding(var8);
                                    try {
                                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0343.$ic9$), var8);
                                        try {
                                            f23190(var19, var6, var7);
                                        }
                                        catch (Throwable var22) {
                                            Errors.handleThrowable(var22, (SubLObject)module0343.NIL);
                                        }
                                    }
                                    finally {
                                        Errors.$error_handler$.rebind(var12_22, var8);
                                    }
                                }
                                catch (Throwable var23) {
                                    var21 = Errors.handleThrowable(var23, (SubLObject)module0343.$ic8$);
                                }
                                finally {
                                    var8.throwStack.pop();
                                }
                            }
                            else {
                                f23190(var19, var6, var7);
                            }
                        }
                        var15 = var15.rest();
                        var16 = var15.first();
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var14, var8);
                    module0147.$g2094$.rebind(var13, var8);
                    module0147.$g2095$.rebind(var12, var8);
                }
            }
        }
        return (SubLObject)module0343.NIL;
    }
    
    public static SubLObject f23191(final SubLObject var6, final SubLObject var7) {
        f23192(var6, var7);
        if (module0343.NIL != assertion_handles_oc.f11041(var7, (SubLObject)module0343.UNPROVIDED)) {
            module0344.f23213(var6, var7);
        }
        return (SubLObject)module0343.NIL;
    }
    
    public static SubLObject f23192(final SubLObject var6, final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        assert module0343.NIL != module0191.f11910(var6) : var6;
        assert module0343.NIL != assertion_handles_oc.f11035(var7) : var7;
        if (module0343.NIL != module0178.f11284(var7)) {
            final SubLObject var9 = module0178.f11331(var7, (SubLObject)module0343.ZERO_INTEGER);
            final SubLObject var10 = module0178.f11287(var7);
            if (module0343.NIL != module0173.f10955(var9)) {
                final SubLObject var11 = module0147.f9540(var10);
                final SubLObject var12 = module0147.$g2095$.currentBinding(var8);
                final SubLObject var13 = module0147.$g2094$.currentBinding(var8);
                final SubLObject var14 = module0147.$g2096$.currentBinding(var8);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var11), var8);
                    module0147.$g2094$.bind(module0147.f9546(var11), var8);
                    module0147.$g2096$.bind(module0147.f9549(var11), var8);
                    SubLObject var15 = f23193(var9);
                    SubLObject var16 = (SubLObject)module0343.NIL;
                    var16 = var15.first();
                    while (module0343.NIL != var15) {
                        SubLObject var18;
                        final SubLObject var17 = var18 = var16;
                        SubLObject var19 = (SubLObject)module0343.NIL;
                        SubLObject var20 = (SubLObject)module0343.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var18, var17, (SubLObject)module0343.$ic7$);
                        var19 = var18.first();
                        var18 = (var20 = var18.rest());
                        if (var19.isFunctionSpec() && module0343.NIL != module0147.f9507(var20)) {
                            if (module0343.NIL == module0343.$g2950$.getDynamicValue(var8)) {
                                SubLObject var21 = (SubLObject)module0343.NIL;
                                try {
                                    var8.throwStack.push(module0343.$ic8$);
                                    final SubLObject var12_28 = Errors.$error_handler$.currentBinding(var8);
                                    try {
                                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0343.$ic9$), var8);
                                        try {
                                            f23194(var19, var6, var7);
                                        }
                                        catch (Throwable var22) {
                                            Errors.handleThrowable(var22, (SubLObject)module0343.NIL);
                                        }
                                    }
                                    finally {
                                        Errors.$error_handler$.rebind(var12_28, var8);
                                    }
                                }
                                catch (Throwable var23) {
                                    var21 = Errors.handleThrowable(var23, (SubLObject)module0343.$ic8$);
                                }
                                finally {
                                    var8.throwStack.pop();
                                }
                            }
                            else {
                                f23194(var19, var6, var7);
                            }
                        }
                        var15 = var15.rest();
                        var16 = var15.first();
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var14, var8);
                    module0147.$g2094$.rebind(var13, var8);
                    module0147.$g2095$.rebind(var12, var8);
                }
            }
        }
        return (SubLObject)module0343.NIL;
    }
    
    public static SubLObject f23189(final SubLObject var9) {
        if (module0343.NIL == module0343.$g2952$.getGlobalValue()) {
            f23195();
        }
        SubLObject var10 = Hashtables.gethash_without_values(var9, module0343.$g2952$.getGlobalValue(), (SubLObject)module0343.NIL);
        if (module0343.NIL != module0222.f14636(var9)) {
            var10 = (SubLObject)ConsesLow.cons(module0222.$g2404$.getGlobalValue(), var10);
        }
        return var10;
    }
    
    public static SubLObject f23193(final SubLObject var9) {
        if (module0343.NIL == module0343.$g2953$.getGlobalValue()) {
            f23196();
        }
        SubLObject var10 = Hashtables.gethash_without_values(var9, module0343.$g2953$.getGlobalValue(), (SubLObject)module0343.NIL);
        if (module0343.NIL != module0222.f14636(var9)) {
            var10 = (SubLObject)ConsesLow.cons(module0222.$g2404$.getGlobalValue(), var10);
        }
        return var10;
    }
    
    public static SubLObject f23190(final SubLObject var30, final SubLObject var6, final SubLObject var7) {
        final SubLObject var31 = module0018.$g573$.getGlobalValue();
        SubLObject var32 = (SubLObject)module0343.NIL;
        try {
            var32 = Locks.seize_lock(var31);
            Functions.funcall(var30, var6, var7);
        }
        finally {
            if (module0343.NIL != var32) {
                Locks.release_lock(var31);
            }
        }
        return (SubLObject)module0343.NIL;
    }
    
    public static SubLObject f23194(final SubLObject var30, final SubLObject var6, final SubLObject var7) {
        final SubLObject var31 = module0018.$g573$.getGlobalValue();
        SubLObject var32 = (SubLObject)module0343.NIL;
        try {
            var32 = Locks.seize_lock(var31);
            Functions.funcall(var30, var6, var7);
        }
        finally {
            if (module0343.NIL != var32) {
                Locks.release_lock(var31);
            }
        }
        return (SubLObject)module0343.NIL;
    }
    
    public static SubLObject f23197() {
        f23198();
        module0344.f23219();
        return (SubLObject)module0343.NIL;
    }
    
    public static SubLObject f23198() {
        f23195();
        f23196();
        return (SubLObject)module0343.NIL;
    }
    
    public static SubLObject f23195() {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        if (module0343.NIL != module0343.$g2952$.getGlobalValue()) {
            Hashtables.clrhash(module0343.$g2952$.getGlobalValue());
        }
        else {
            module0343.$g2952$.setGlobalValue(Hashtables.make_hash_table((SubLObject)module0343.$ic10$, (SubLObject)module0343.UNPROVIDED, (SubLObject)module0343.UNPROVIDED));
        }
        final SubLObject var9 = module0147.$g2094$.currentBinding(var8);
        final SubLObject var10 = module0147.$g2095$.currentBinding(var8);
        try {
            module0147.$g2094$.bind((SubLObject)module0343.$ic11$, var8);
            module0147.$g2095$.bind(module0343.$ic12$, var8);
            final SubLObject var11 = module0343.$ic13$;
            if (module0343.NIL != module0158.f10038(var11)) {
                final SubLObject var12 = (SubLObject)module0343.NIL;
                final SubLObject var12_37 = module0012.$g73$.currentBinding(var8);
                final SubLObject var13_38 = module0012.$g65$.currentBinding(var8);
                final SubLObject var13 = module0012.$g67$.currentBinding(var8);
                final SubLObject var14 = module0012.$g68$.currentBinding(var8);
                final SubLObject var15 = module0012.$g66$.currentBinding(var8);
                final SubLObject var16 = module0012.$g69$.currentBinding(var8);
                final SubLObject var17 = module0012.$g70$.currentBinding(var8);
                final SubLObject var18 = module0012.$silent_progressP$.currentBinding(var8);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var8);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var8), var8);
                    module0012.$g67$.bind((SubLObject)module0343.ONE_INTEGER, var8);
                    module0012.$g68$.bind((SubLObject)module0343.ZERO_INTEGER, var8);
                    module0012.$g66$.bind((SubLObject)module0343.ZERO_INTEGER, var8);
                    module0012.$g69$.bind((SubLObject)module0343.ZERO_INTEGER, var8);
                    module0012.$g70$.bind((SubLObject)module0343.T, var8);
                    module0012.$silent_progressP$.bind((SubLObject)((module0343.NIL != var12) ? module0012.$silent_progressP$.getDynamicValue(var8) : module0343.T), var8);
                    module0012.f474(var12);
                    final SubLObject var19 = module0158.f10039(var11);
                    SubLObject var20 = (SubLObject)module0343.NIL;
                    final SubLObject var21 = (SubLObject)module0343.NIL;
                    while (module0343.NIL == var20) {
                        final SubLObject var22 = module0052.f3695(var19, var21);
                        final SubLObject var23 = (SubLObject)SubLObjectFactory.makeBoolean(!var21.eql(var22));
                        if (module0343.NIL != var23) {
                            module0012.f476();
                            SubLObject var24 = (SubLObject)module0343.NIL;
                            try {
                                var24 = module0158.f10316(var22, (SubLObject)module0343.$ic14$, (SubLObject)module0343.NIL, (SubLObject)module0343.NIL);
                                SubLObject var45_50 = (SubLObject)module0343.NIL;
                                final SubLObject var46_51 = (SubLObject)module0343.NIL;
                                while (module0343.NIL == var45_50) {
                                    final SubLObject var25 = module0052.f3695(var24, var46_51);
                                    final SubLObject var48_53 = (SubLObject)SubLObjectFactory.makeBoolean(!var46_51.eql(var25));
                                    if (module0343.NIL != var48_53) {
                                        final SubLObject var26 = module0178.f11285(var25);
                                        SubLObject var28;
                                        final SubLObject var27 = var28 = var26;
                                        SubLObject var29 = (SubLObject)module0343.NIL;
                                        SubLObject var30 = (SubLObject)module0343.NIL;
                                        SubLObject var31 = (SubLObject)module0343.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(var28, var27, (SubLObject)module0343.$ic15$);
                                        var29 = var28.first();
                                        var28 = var28.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(var28, var27, (SubLObject)module0343.$ic15$);
                                        var30 = var28.first();
                                        var28 = var28.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(var28, var27, (SubLObject)module0343.$ic15$);
                                        var31 = var28.first();
                                        var28 = var28.rest();
                                        if (module0343.NIL == var28) {
                                            if (module0343.NIL != module0173.f10969(var30)) {
                                                var31 = module0202.f12757(var31);
                                                final SubLObject var32 = (SubLObject)ConsesLow.cons(var31, module0178.f11287(var25));
                                                if (module0343.NIL == conses_high.member(var32, Hashtables.gethash(var30, module0343.$g2952$.getGlobalValue(), (SubLObject)module0343.UNPROVIDED), Symbols.symbol_function((SubLObject)module0343.EQL), Symbols.symbol_function((SubLObject)module0343.IDENTITY))) {
                                                    Hashtables.sethash(var30, module0343.$g2952$.getGlobalValue(), (SubLObject)ConsesLow.cons(var32, Hashtables.gethash(var30, module0343.$g2952$.getGlobalValue(), (SubLObject)module0343.UNPROVIDED)));
                                                }
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(var27, (SubLObject)module0343.$ic15$);
                                        }
                                    }
                                    var45_50 = (SubLObject)SubLObjectFactory.makeBoolean(module0343.NIL == var48_53);
                                }
                            }
                            finally {
                                final SubLObject var12_38 = Threads.$is_thread_performing_cleanupP$.currentBinding(var8);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0343.T, var8);
                                    if (module0343.NIL != var24) {
                                        module0158.f10319(var24);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var12_38, var8);
                                }
                            }
                        }
                        var20 = (SubLObject)SubLObjectFactory.makeBoolean(module0343.NIL == var23);
                    }
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var18, var8);
                    module0012.$g70$.rebind(var17, var8);
                    module0012.$g69$.rebind(var16, var8);
                    module0012.$g66$.rebind(var15, var8);
                    module0012.$g68$.rebind(var14, var8);
                    module0012.$g67$.rebind(var13, var8);
                    module0012.$g65$.rebind(var13_38, var8);
                    module0012.$g73$.rebind(var12_37, var8);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var10, var8);
            module0147.$g2094$.rebind(var9, var8);
        }
        return (SubLObject)module0343.NIL;
    }
    
    public static SubLObject f23196() {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        if (!module0343.$g2953$.getGlobalValue().isHashtable()) {
            module0343.$g2953$.setGlobalValue(Hashtables.make_hash_table((SubLObject)module0343.$ic10$, (SubLObject)module0343.UNPROVIDED, (SubLObject)module0343.UNPROVIDED));
        }
        else {
            Hashtables.clrhash(module0343.$g2953$.getGlobalValue());
        }
        final SubLObject var9 = module0147.$g2094$.currentBinding(var8);
        final SubLObject var10 = module0147.$g2095$.currentBinding(var8);
        try {
            module0147.$g2094$.bind((SubLObject)module0343.$ic11$, var8);
            module0147.$g2095$.bind(module0343.$ic12$, var8);
            final SubLObject var11 = module0343.$ic16$;
            if (module0343.NIL != module0158.f10038(var11)) {
                final SubLObject var12 = (SubLObject)module0343.NIL;
                final SubLObject var12_61 = module0012.$g73$.currentBinding(var8);
                final SubLObject var13_62 = module0012.$g65$.currentBinding(var8);
                final SubLObject var13 = module0012.$g67$.currentBinding(var8);
                final SubLObject var14 = module0012.$g68$.currentBinding(var8);
                final SubLObject var15 = module0012.$g66$.currentBinding(var8);
                final SubLObject var16 = module0012.$g69$.currentBinding(var8);
                final SubLObject var17 = module0012.$g70$.currentBinding(var8);
                final SubLObject var18 = module0012.$silent_progressP$.currentBinding(var8);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var8);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var8), var8);
                    module0012.$g67$.bind((SubLObject)module0343.ONE_INTEGER, var8);
                    module0012.$g68$.bind((SubLObject)module0343.ZERO_INTEGER, var8);
                    module0012.$g66$.bind((SubLObject)module0343.ZERO_INTEGER, var8);
                    module0012.$g69$.bind((SubLObject)module0343.ZERO_INTEGER, var8);
                    module0012.$g70$.bind((SubLObject)module0343.T, var8);
                    module0012.$silent_progressP$.bind((SubLObject)((module0343.NIL != var12) ? module0012.$silent_progressP$.getDynamicValue(var8) : module0343.T), var8);
                    module0012.f474(var12);
                    final SubLObject var19 = module0158.f10039(var11);
                    SubLObject var20 = (SubLObject)module0343.NIL;
                    final SubLObject var21 = (SubLObject)module0343.NIL;
                    while (module0343.NIL == var20) {
                        final SubLObject var22 = module0052.f3695(var19, var21);
                        final SubLObject var23 = (SubLObject)SubLObjectFactory.makeBoolean(!var21.eql(var22));
                        if (module0343.NIL != var23) {
                            module0012.f476();
                            SubLObject var24 = (SubLObject)module0343.NIL;
                            try {
                                var24 = module0158.f10316(var22, (SubLObject)module0343.$ic14$, (SubLObject)module0343.NIL, (SubLObject)module0343.NIL);
                                SubLObject var45_63 = (SubLObject)module0343.NIL;
                                final SubLObject var46_64 = (SubLObject)module0343.NIL;
                                while (module0343.NIL == var45_63) {
                                    final SubLObject var25 = module0052.f3695(var24, var46_64);
                                    final SubLObject var48_65 = (SubLObject)SubLObjectFactory.makeBoolean(!var46_64.eql(var25));
                                    if (module0343.NIL != var48_65) {
                                        final SubLObject var26 = module0178.f11285(var25);
                                        SubLObject var28;
                                        final SubLObject var27 = var28 = var26;
                                        SubLObject var29 = (SubLObject)module0343.NIL;
                                        SubLObject var30 = (SubLObject)module0343.NIL;
                                        SubLObject var31 = (SubLObject)module0343.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(var28, var27, (SubLObject)module0343.$ic17$);
                                        var29 = var28.first();
                                        var28 = var28.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(var28, var27, (SubLObject)module0343.$ic17$);
                                        var30 = var28.first();
                                        var28 = var28.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(var28, var27, (SubLObject)module0343.$ic17$);
                                        var31 = var28.first();
                                        var28 = var28.rest();
                                        if (module0343.NIL == var28) {
                                            if (module0343.NIL != module0173.f10969(var30)) {
                                                var31 = module0202.f12757(var31);
                                                final SubLObject var32 = (SubLObject)ConsesLow.cons(var31, module0178.f11287(var25));
                                                if (module0343.NIL == conses_high.member(var32, Hashtables.gethash(var30, module0343.$g2953$.getGlobalValue(), (SubLObject)module0343.UNPROVIDED), Symbols.symbol_function((SubLObject)module0343.EQL), Symbols.symbol_function((SubLObject)module0343.IDENTITY))) {
                                                    Hashtables.sethash(var30, module0343.$g2953$.getGlobalValue(), (SubLObject)ConsesLow.cons(var32, Hashtables.gethash(var30, module0343.$g2953$.getGlobalValue(), (SubLObject)module0343.UNPROVIDED)));
                                                }
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(var27, (SubLObject)module0343.$ic17$);
                                        }
                                    }
                                    var45_63 = (SubLObject)SubLObjectFactory.makeBoolean(module0343.NIL == var48_65);
                                }
                            }
                            finally {
                                final SubLObject var12_62 = Threads.$is_thread_performing_cleanupP$.currentBinding(var8);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0343.T, var8);
                                    if (module0343.NIL != var24) {
                                        module0158.f10319(var24);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var12_62, var8);
                                }
                            }
                        }
                        var20 = (SubLObject)SubLObjectFactory.makeBoolean(module0343.NIL == var23);
                    }
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var18, var8);
                    module0012.$g70$.rebind(var17, var8);
                    module0012.$g69$.rebind(var16, var8);
                    module0012.$g66$.rebind(var15, var8);
                    module0012.$g68$.rebind(var14, var8);
                    module0012.$g67$.rebind(var13, var8);
                    module0012.$g65$.rebind(var13_62, var8);
                    module0012.$g73$.rebind(var12_61, var8);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var10, var8);
            module0147.$g2094$.rebind(var9, var8);
        }
        return (SubLObject)module0343.NIL;
    }
    
    public static SubLObject f23199(final SubLObject var71) {
        final SubLThread var72 = SubLProcess.currentSubLThread();
        assert module0343.NIL != module0173.f10955(var71) : var71;
        if (module0343.NIL == module0343.$g2952$.getGlobalValue()) {
            f23195();
        }
        Hashtables.remhash(var71, module0343.$g2952$.getGlobalValue());
        SubLObject var73 = (SubLObject)module0343.NIL;
        final SubLObject var74 = module0147.$g2094$.currentBinding(var72);
        final SubLObject var75 = module0147.$g2095$.currentBinding(var72);
        try {
            module0147.$g2094$.bind((SubLObject)module0343.$ic11$, var72);
            module0147.$g2095$.bind(module0343.$ic12$, var72);
            final SubLObject var76 = module0343.$ic13$;
            if (module0343.NIL != module0158.f10010(var71, (SubLObject)module0343.NIL, var76)) {
                final SubLObject var77 = module0158.f10011(var71, (SubLObject)module0343.NIL, var76);
                SubLObject var78 = (SubLObject)module0343.NIL;
                final SubLObject var79 = (SubLObject)module0343.NIL;
                while (module0343.NIL == var78) {
                    final SubLObject var80 = module0052.f3695(var77, var79);
                    final SubLObject var81 = (SubLObject)SubLObjectFactory.makeBoolean(!var79.eql(var80));
                    if (module0343.NIL != var81) {
                        SubLObject var82 = (SubLObject)module0343.NIL;
                        try {
                            var82 = module0158.f10316(var80, (SubLObject)module0343.$ic14$, (SubLObject)module0343.NIL, (SubLObject)module0343.NIL);
                            SubLObject var45_75 = (SubLObject)module0343.NIL;
                            final SubLObject var46_76 = (SubLObject)module0343.NIL;
                            while (module0343.NIL == var45_75) {
                                final SubLObject var83 = module0052.f3695(var82, var46_76);
                                final SubLObject var48_77 = (SubLObject)SubLObjectFactory.makeBoolean(!var46_76.eql(var83));
                                if (module0343.NIL != var48_77 && module0343.NIL != module0178.f11299(var83)) {
                                    final SubLObject var84 = module0202.f12757(module0178.f11331(var83, (SubLObject)module0343.TWO_INTEGER));
                                    final SubLObject var85 = (SubLObject)ConsesLow.cons(var84, module0178.f11287(var83));
                                    if (module0343.NIL == conses_high.member(var85, var73, Symbols.symbol_function((SubLObject)module0343.EQL), Symbols.symbol_function((SubLObject)module0343.IDENTITY))) {
                                        var73 = (SubLObject)ConsesLow.cons(var85, var73);
                                    }
                                }
                                var45_75 = (SubLObject)SubLObjectFactory.makeBoolean(module0343.NIL == var48_77);
                            }
                        }
                        finally {
                            final SubLObject var12_78 = Threads.$is_thread_performing_cleanupP$.currentBinding(var72);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0343.T, var72);
                                if (module0343.NIL != var82) {
                                    module0158.f10319(var82);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var12_78, var72);
                            }
                        }
                    }
                    var78 = (SubLObject)SubLObjectFactory.makeBoolean(module0343.NIL == var81);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var75, var72);
            module0147.$g2094$.rebind(var74, var72);
        }
        if (module0343.NIL != var73) {
            Hashtables.sethash(var71, module0343.$g2952$.getGlobalValue(), Sequences.nreverse(var73));
        }
        return (SubLObject)module0343.NIL;
    }
    
    public static SubLObject f23200(final SubLObject var71) {
        final SubLThread var72 = SubLProcess.currentSubLThread();
        assert module0343.NIL != module0173.f10955(var71) : var71;
        if (module0343.NIL == module0343.$g2953$.getGlobalValue()) {
            f23196();
        }
        Hashtables.remhash(var71, module0343.$g2953$.getGlobalValue());
        SubLObject var73 = (SubLObject)module0343.NIL;
        final SubLObject var74 = module0147.$g2094$.currentBinding(var72);
        final SubLObject var75 = module0147.$g2095$.currentBinding(var72);
        try {
            module0147.$g2094$.bind((SubLObject)module0343.$ic11$, var72);
            module0147.$g2095$.bind(module0343.$ic12$, var72);
            final SubLObject var76 = module0343.$ic16$;
            if (module0343.NIL != module0158.f10010(var71, (SubLObject)module0343.NIL, var76)) {
                final SubLObject var77 = module0158.f10011(var71, (SubLObject)module0343.NIL, var76);
                SubLObject var78 = (SubLObject)module0343.NIL;
                final SubLObject var79 = (SubLObject)module0343.NIL;
                while (module0343.NIL == var78) {
                    final SubLObject var80 = module0052.f3695(var77, var79);
                    final SubLObject var81 = (SubLObject)SubLObjectFactory.makeBoolean(!var79.eql(var80));
                    if (module0343.NIL != var81) {
                        SubLObject var82 = (SubLObject)module0343.NIL;
                        try {
                            var82 = module0158.f10316(var80, (SubLObject)module0343.$ic14$, (SubLObject)module0343.NIL, (SubLObject)module0343.NIL);
                            SubLObject var45_79 = (SubLObject)module0343.NIL;
                            final SubLObject var46_80 = (SubLObject)module0343.NIL;
                            while (module0343.NIL == var45_79) {
                                final SubLObject var83 = module0052.f3695(var82, var46_80);
                                final SubLObject var48_81 = (SubLObject)SubLObjectFactory.makeBoolean(!var46_80.eql(var83));
                                if (module0343.NIL != var48_81 && module0343.NIL != module0178.f11299(var83)) {
                                    final SubLObject var84 = module0202.f12757(module0178.f11331(var83, (SubLObject)module0343.TWO_INTEGER));
                                    final SubLObject var85 = (SubLObject)ConsesLow.cons(var84, module0178.f11287(var83));
                                    if (module0343.NIL == conses_high.member(var85, var73, Symbols.symbol_function((SubLObject)module0343.EQL), Symbols.symbol_function((SubLObject)module0343.IDENTITY))) {
                                        var73 = (SubLObject)ConsesLow.cons(var85, var73);
                                    }
                                }
                                var45_79 = (SubLObject)SubLObjectFactory.makeBoolean(module0343.NIL == var48_81);
                            }
                        }
                        finally {
                            final SubLObject var12_82 = Threads.$is_thread_performing_cleanupP$.currentBinding(var72);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0343.T, var72);
                                if (module0343.NIL != var82) {
                                    module0158.f10319(var82);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var12_82, var72);
                            }
                        }
                    }
                    var78 = (SubLObject)SubLObjectFactory.makeBoolean(module0343.NIL == var81);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var75, var72);
            module0147.$g2094$.rebind(var74, var72);
        }
        if (module0343.NIL != var73) {
            Hashtables.sethash(var71, module0343.$g2953$.getGlobalValue(), Sequences.nreverse(var73));
        }
        return (SubLObject)module0343.NIL;
    }
    
    public static SubLObject f23201(final SubLObject var6, final SubLObject var7) {
        assert module0343.NIL != module0191.f11910(var6) : var6;
        if (module0343.NIL != module0178.f11284(var7) && module0343.NIL != module0178.f11343(var7, (SubLObject)module0343.$ic19$)) {
            final SubLObject var8 = module0178.f11285(var7);
            if (module0202.f12839(var8, (SubLObject)module0343.UNPROVIDED).numE((SubLObject)module0343.TWO_INTEGER)) {
                final SubLObject var9 = module0202.f12834(var8, (SubLObject)module0343.UNPROVIDED);
                final SubLObject var10 = module0202.f12757(module0202.f12835(var8, (SubLObject)module0343.UNPROVIDED));
                final SubLObject var11 = module0178.f11287(var7);
                if (module0343.NIL != module0173.f10955(var9) && var10.isSymbol() && module0343.NIL != Symbols.fboundp(var10) && var10 != module0343.$ic20$) {
                    f23202(var9, var10, var11);
                }
            }
        }
        return (SubLObject)module0343.NIL;
    }
    
    public static SubLObject f23202(final SubLObject var71, final SubLObject var30, final SubLObject var10) {
        final SubLThread var72 = SubLProcess.currentSubLThread();
        assert module0343.NIL != module0173.f10955(var71) : var71;
        assert module0343.NIL != Types.symbolp(var30) : var30;
        assert module0343.NIL != module0161.f10481(var10) : var10;
        if (module0343.NIL != Symbols.fboundp(var30)) {
            final SubLObject var73 = module0018.$g587$.currentBinding(var72);
            final SubLObject var74 = module0147.$g2094$.currentBinding(var72);
            final SubLObject var75 = module0147.$g2095$.currentBinding(var72);
            try {
                module0018.$g587$.bind(var30, var72);
                module0147.$g2094$.bind((SubLObject)module0343.$ic23$, var72);
                module0147.$g2095$.bind(var10, var72);
                module0219.f14478(Symbols.symbol_function((SubLObject)module0343.$ic24$), var71, (SubLObject)module0343.UNPROVIDED, (SubLObject)module0343.UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var75, var72);
                module0147.$g2094$.rebind(var74, var72);
                module0018.$g587$.rebind(var73, var72);
            }
        }
        return (SubLObject)module0343.NIL;
    }
    
    public static SubLObject f23203(final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        final SubLObject var9 = module0178.f11299(var7);
        final SubLObject var10 = module0147.$g2094$.currentBinding(var8);
        final SubLObject var11 = module0147.$g2095$.currentBinding(var8);
        try {
            module0147.$g2094$.bind((SubLObject)module0343.$ic25$, var8);
            module0147.$g2095$.bind(module0178.f11287(var7), var8);
            SubLObject var12 = var9;
            SubLObject var13 = (SubLObject)module0343.NIL;
            var13 = var12.first();
            while (module0343.NIL != var12) {
                if (module0343.NIL == module0343.$g2950$.getDynamicValue(var8)) {
                    SubLObject var14 = (SubLObject)module0343.NIL;
                    try {
                        var8.throwStack.push(module0343.$ic8$);
                        final SubLObject var12_85 = Errors.$error_handler$.currentBinding(var8);
                        try {
                            Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0343.$ic9$), var8);
                            try {
                                f23190(module0018.$g587$.getDynamicValue(var8), var13, var7);
                            }
                            catch (Throwable var15) {
                                Errors.handleThrowable(var15, (SubLObject)module0343.NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(var12_85, var8);
                        }
                    }
                    catch (Throwable var16) {
                        var14 = Errors.handleThrowable(var16, (SubLObject)module0343.$ic8$);
                    }
                    finally {
                        var8.throwStack.pop();
                    }
                }
                else {
                    f23190(module0018.$g587$.getDynamicValue(var8), var13, var7);
                }
                var12 = var12.rest();
                var13 = var12.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var11, var8);
            module0147.$g2094$.rebind(var10, var8);
        }
        return (SubLObject)module0343.NIL;
    }
    
    public static SubLObject f23204() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0343", "f23182", "S#16692", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0343", "f23183", "S#25907", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0343", "f23184", "S#16693", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0343", "f23185", "S#25908", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0343", "f23186", "S#25909");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0343", "f23187", "S#25816", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0343", "f23188", "S#25910", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0343", "f23191", "S#25817", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0343", "f23192", "S#25911", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0343", "f23189", "S#25912", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0343", "f23193", "S#25913", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0343", "f23190", "S#25914", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0343", "f23194", "S#25915", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0343", "f23197", "S#16696", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0343", "f23198", "S#25916", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0343", "f23195", "S#25917", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0343", "f23196", "S#25918", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0343", "f23199", "S#25919", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0343", "f23200", "S#25920", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0343", "f23201", "S#25921", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0343", "f23202", "S#25922", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0343", "f23203", "S#25923", 1, 0, false);
        return (SubLObject)module0343.NIL;
    }
    
    public static SubLObject f23205() {
        module0343.$g2950$ = SubLFiles.defparameter("S#25924", (SubLObject)module0343.NIL);
        module0343.$g2951$ = SubLFiles.deflexical("S#25925", (SubLObject)module0343.$ic0$);
        module0343.$g2952$ = SubLFiles.deflexical("S#25926", (SubLObject)((module0343.NIL != Symbols.boundp((SubLObject)module0343.$ic1$)) ? module0343.$g2952$.getGlobalValue() : module0343.NIL));
        module0343.$g2953$ = SubLFiles.deflexical("S#25927", (SubLObject)((module0343.NIL != Symbols.boundp((SubLObject)module0343.$ic2$)) ? module0343.$g2953$.getGlobalValue() : module0343.NIL));
        module0343.$g2954$ = SubLFiles.defparameter("S#25928", (SubLObject)module0343.NIL);
        return (SubLObject)module0343.NIL;
    }
    
    public static SubLObject f23206() {
        module0003.f57((SubLObject)module0343.$ic1$);
        module0003.f57((SubLObject)module0343.$ic2$);
        return (SubLObject)module0343.NIL;
    }
    
    public void declareFunctions() {
        f23204();
    }
    
    public void initializeVariables() {
        f23205();
    }
    
    public void runTopLevelForms() {
        f23206();
    }
    
    static {
        me = (SubLFile)new module0343();
        module0343.$g2950$ = null;
        module0343.$g2951$ = null;
        module0343.$g2952$ = null;
        module0343.$g2953$ = null;
        module0343.$g2954$ = null;
        $ic0$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("afterAdding")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("afterRemoving")));
        $ic1$ = SubLObjectFactory.makeSymbol("S#25926", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("S#25927", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("CLET");
        $ic4$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#25928", "CYC"), (SubLObject)module0343.T));
        $ic5$ = SubLObjectFactory.makeSymbol("ARGUMENT-P");
        $ic6$ = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $ic7$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#813", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25929", "CYC"));
        $ic8$ = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $ic9$ = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic10$ = SubLObjectFactory.makeInteger(100);
        $ic11$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic12$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic13$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("afterAdding"));
        $ic14$ = SubLObjectFactory.makeKeyword("GAF");
        $ic15$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#25930", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25931", "CYC"));
        $ic16$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("afterRemoving"));
        $ic17$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#25932", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25933", "CYC"));
        $ic18$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic19$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic20$ = SubLObjectFactory.makeSymbol("S#25921", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("SYMBOLP");
        $ic22$ = SubLObjectFactory.makeSymbol("S#12263", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("S#12279", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#25923", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#12278", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0343.class
	Total time: 341 ms
	
	Decompiled with Procyon 0.5.32.
*/