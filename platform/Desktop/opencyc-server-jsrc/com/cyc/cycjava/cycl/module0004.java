package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Tcp;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0004 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0004";
    public static final String myFingerPrint = "95f047b4e9872c764f492fb18c324c10eb389096e96b62a89a270507e9e3b51a";
    private static SubLSymbol $g6$;
    private static SubLSymbol $g7$;
    private static SubLSymbol $g8$;
    private static SubLSymbol $g9$;
    private static final SubLSymbol $ic0$;
    private static final SubLString $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLString $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLString $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLString $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLList $ic24$;
    private static final SubLList $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLList $ic30$;
    
    public static SubLObject f78(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != Types.stringp(var1) : var1;
        assert NIL != Types.function_spec_p(var2) : var2;
        assert NIL != Types.listp(var3) : var3;
        if (NIL == var3) {
            return Threads.make_process(var1, var2);
        }
        SubLObject var4 = (SubLObject)NIL;
        final SubLObject var5 = $g7$.getGlobalValue();
        SubLObject var6 = (SubLObject)NIL;
        try {
            var6 = Locks.seize_lock(var5);
            var4 = Threads.make_process(var1, (SubLObject)$ic5$);
            $g6$.setGlobalValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var4, var2, var3), $g6$.getGlobalValue()));
        }
        finally {
            if (NIL != var6) {
                Locks.release_lock(var5);
            }
        }
        return var4;
    }
    
    public static SubLObject f79() {
        final SubLObject var7 = Threads.current_process();
        SubLObject var8 = (SubLObject)NIL;
        final SubLObject var9 = $g7$.getGlobalValue();
        SubLObject var10 = (SubLObject)NIL;
        try {
            var10 = Locks.seize_lock(var9);
            var8 = conses_high.assoc(var7, $g6$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != var8) {
                $g6$.setGlobalValue(Sequences.delete(var8, $g6$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            }
        }
        finally {
            if (NIL != var10) {
                Locks.release_lock(var9);
            }
        }
        if (NIL == var8) {
            return Errors.error((SubLObject)$ic6$, var7);
        }
        SubLObject var12;
        final SubLObject var11 = var12 = var8;
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var11, (SubLObject)$ic7$);
        var13 = var12.first();
        var12 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var12, var11, (SubLObject)$ic7$);
        var14 = var12.first();
        var12 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var12, var11, (SubLObject)$ic7$);
        var15 = var12.first();
        var12 = var12.rest();
        if (NIL == var12) {
            return Functions.apply(var14, var15);
        }
        cdestructuring_bind.cdestructuring_bind_error(var11, (SubLObject)$ic7$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f80(final SubLObject var13, final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != Types.processp(var13) : var13;
        assert NIL != Types.function_spec_p(var2) : var2;
        assert NIL != Types.listp(var3) : var3;
        if (var13.eql(Threads.current_process())) {
            Functions.apply(var2, var3);
            return (SubLObject)NIL;
        }
        if (NIL == var3) {
            return Threads.interrupt_process(var13, var2);
        }
        final SubLObject var14 = $g9$.getGlobalValue();
        SubLObject var15 = (SubLObject)NIL;
        try {
            var15 = Locks.seize_lock(var14);
            $g8$.setGlobalValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var13, var2, var3), $g8$.getGlobalValue()));
        }
        finally {
            if (NIL != var15) {
                Locks.release_lock(var14);
            }
        }
        return Threads.interrupt_process(var13, (SubLObject)$ic11$);
    }
    
    public static SubLObject f81() {
        final SubLObject var7 = Threads.current_process();
        SubLObject var8 = (SubLObject)NIL;
        final SubLObject var9 = $g9$.getGlobalValue();
        SubLObject var10 = (SubLObject)NIL;
        try {
            var10 = Locks.seize_lock(var9);
            var8 = conses_high.assoc(var7, $g8$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != var8) {
                $g8$.setGlobalValue(Sequences.delete(var8, $g8$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            }
        }
        finally {
            if (NIL != var10) {
                Locks.release_lock(var9);
            }
        }
        if (NIL == var8) {
            return Errors.error((SubLObject)$ic12$, var7);
        }
        SubLObject var12;
        final SubLObject var11 = var12 = var8;
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = (SubLObject)NIL;
        SubLObject var15 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var12, var11, (SubLObject)$ic7$);
        var13 = var12.first();
        var12 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var12, var11, (SubLObject)$ic7$);
        var14 = var12.first();
        var12 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var12, var11, (SubLObject)$ic7$);
        var15 = var12.first();
        var12 = var12.rest();
        if (NIL == var12) {
            return Functions.apply(var14, var15);
        }
        cdestructuring_bind.cdestructuring_bind_error(var11, (SubLObject)$ic7$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f82(final SubLObject var20, final SubLObject var21, SubLObject var22, SubLObject var23) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        if (var23 == UNPROVIDED) {
            var23 = (SubLObject)$ic13$;
        }
        final SubLThread var24 = SubLProcess.currentSubLThread();
        if (NIL == var22) {
            return f83(var20, var21, var23);
        }
        assert NIL != module0048.f3294(var22) : var22;
        SubLObject var25 = (SubLObject)NIL;
        SubLObject var26 = (SubLObject)NIL;
        SubLObject var27 = (SubLObject)NIL;
        final SubLObject var28 = module0003.f61();
        try {
            var24.throwStack.push(var28);
            final SubLObject var29 = module0003.$g4$.currentBinding(var24);
            try {
                module0003.$g4$.bind((SubLObject)T, var24);
                SubLObject var30 = (SubLObject)NIL;
                try {
                    final SubLObject var29_31 = module0003.$g5$.currentBinding(var24);
                    try {
                        module0003.$g5$.bind(Numbers.add((SubLObject)ONE_INTEGER, module0003.$g5$.getDynamicValue(var24)), var24);
                        var30 = module0003.f62(var22, var28);
                        try {
                            var24.throwStack.push(module0003.$g3$.getGlobalValue());
                            final SubLObject var29_32 = Errors.$error_handler$.currentBinding(var24);
                            try {
                                Errors.$error_handler$.bind((SubLObject)$ic15$, var24);
                                try {
                                    var27 = f83(var20, var21, var23);
                                }
                                catch (Throwable var31) {
                                    Errors.handleThrowable(var31, (SubLObject)NIL);
                                }
                            }
                            finally {
                                Errors.$error_handler$.rebind(var29_32, var24);
                            }
                        }
                        catch (Throwable var32) {
                            var25 = Errors.handleThrowable(var32, module0003.$g3$.getGlobalValue());
                        }
                        finally {
                            var24.throwStack.pop();
                        }
                    }
                    finally {
                        module0003.$g5$.rebind(var29_31, var24);
                    }
                }
                finally {
                    final SubLObject var29_33 = Threads.$is_thread_performing_cleanupP$.currentBinding(var24);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var24);
                        module0003.f64(var30);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var29_33, var24);
                    }
                }
            }
            finally {
                module0003.$g4$.rebind(var29, var24);
            }
        }
        catch (Throwable var33) {
            var26 = Errors.handleThrowable(var33, var28);
        }
        finally {
            var24.throwStack.pop();
        }
        if (NIL != var25) {
            Errors.error((SubLObject)$ic16$, var25);
        }
        return var27;
    }
    
    public static SubLObject f83(final SubLObject var20, final SubLObject var21, SubLObject var23) {
        if (var23 == UNPROVIDED) {
            var23 = (SubLObject)$ic13$;
        }
        final SubLThread var24 = SubLProcess.currentSubLThread();
        assert NIL != f84(var23) : var23;
        SubLObject var25 = (SubLObject)NIL;
        final SubLObject var26 = var23;
        if (var26.eql((SubLObject)$ic18$)) {
            final SubLObject var27 = stream_macros.$stream_requires_locking$.currentBinding(var24);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var24);
                var25 = Tcp.open_tcp_stream(var20, var21);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var27, var24);
            }
        }
        else {
            var25 = Tcp.open_tcp_stream(var20, var21);
        }
        return var25;
    }
    
    public static SubLObject f84(final SubLObject var37) {
        return conses_high.member(var37, (SubLObject)$ic19$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject values_list(final SubLObject var38) {
        return Functions.apply(Symbols.symbol_function((SubLObject)$ic20$), var38);
    }
    
    public static SubLObject f85(final SubLObject var37) {
        return (SubLObject)makeBoolean(var37.isSymbol() && NIL != Symbols.fboundp(var37) && Symbols.symbol_function(var37).isFunction());
    }
    
    public static SubLObject f86(final SubLObject var39) {
        assert NIL != Types.symbolp(var39) : var39;
        return Functions.funcall((SubLObject)$ic22$, var39);
    }
    
    public static SubLObject f87(final SubLObject var40, final SubLObject var41, SubLObject var42, SubLObject var43) {
        if (var42 == UNPROVIDED) {
            var42 = Symbols.symbol_function((SubLObject)EQL);
        }
        if (var43 == UNPROVIDED) {
            var43 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        assert NIL != Types.function_spec_p(var42) : var42;
        assert NIL != Types.function_spec_p(var43) : var43;
        if (!Symbols.symbol_function((SubLObject)IDENTITY).eql(var43)) {
            return f88(var40, var41, var42, var43);
        }
        if (!Symbols.symbol_function((SubLObject)EQL).eql(var42)) {
            return f89(var40, var41, var42);
        }
        return f90(var40, var41);
    }
    
    public static SubLObject f91(final SubLObject var40, final SubLObject var41, SubLObject var42, SubLObject var43) {
        if (var42 == UNPROVIDED) {
            var42 = Symbols.symbol_function((SubLObject)EQL);
        }
        if (var43 == UNPROVIDED) {
            var43 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        assert NIL != Types.function_spec_p(var42) : var42;
        assert NIL != Types.function_spec_p(var43) : var43;
        if (!Symbols.symbol_function((SubLObject)IDENTITY).eql(var43)) {
            return f92(var40, var41, var42, var43);
        }
        if (!Symbols.symbol_function((SubLObject)EQL).eql(var42)) {
            return f93(var40, var41, var42);
        }
        return f94(var40, var41);
    }
    
    public static SubLObject f90(final SubLObject var40, final SubLObject var41) {
        SubLObject var42 = var40;
        SubLObject var43 = (SubLObject)NIL;
        var43 = var42.first();
        while (NIL != var42) {
            if (NIL != var43 && var43.rest().eql(var41)) {
                return var43.first();
            }
            var42 = var42.rest();
            var43 = var42.first();
        }
        if (var41.isAtom()) {
            return var41;
        }
        final SubLObject var44 = var41.first();
        final SubLObject var45 = var41.rest();
        final SubLObject var46 = f90(var40, var44);
        final SubLObject var47 = f90(var40, var45);
        return module0035.f2071(var46, var47, var41);
    }
    
    public static SubLObject f94(final SubLObject var40, final SubLObject var41) {
        SubLObject var42 = var40;
        SubLObject var43 = (SubLObject)NIL;
        var43 = var42.first();
        while (NIL != var42) {
            if (NIL != var43 && var43.rest().eql(var41)) {
                return var43.first();
            }
            var42 = var42.rest();
            var43 = var42.first();
        }
        if (var41.isAtom()) {
            return var41;
        }
        final SubLObject var44 = var41.first();
        final SubLObject var45 = var41.rest();
        final SubLObject var46 = f94(var40, var44);
        final SubLObject var47 = f94(var40, var45);
        return module0035.f2072(var46, var47, var41);
    }
    
    public static SubLObject f89(final SubLObject var40, final SubLObject var41, final SubLObject var42) {
        SubLObject var43 = var40;
        SubLObject var44 = (SubLObject)NIL;
        var44 = var43.first();
        while (NIL != var43) {
            if (NIL != var44 && NIL != Functions.funcall(var42, var44.rest(), var41)) {
                return var44.first();
            }
            var43 = var43.rest();
            var44 = var43.first();
        }
        if (var41.isAtom()) {
            return var41;
        }
        final SubLObject var45 = var41.first();
        final SubLObject var46 = var41.rest();
        final SubLObject var47 = f89(var40, var45, var42);
        final SubLObject var48 = f89(var40, var46, var42);
        return module0035.f2071(var47, var48, var41);
    }
    
    public static SubLObject f93(final SubLObject var40, final SubLObject var41, final SubLObject var42) {
        SubLObject var43 = var40;
        SubLObject var44 = (SubLObject)NIL;
        var44 = var43.first();
        while (NIL != var43) {
            if (NIL != var44 && NIL != Functions.funcall(var42, var44.rest(), var41)) {
                return var44.first();
            }
            var43 = var43.rest();
            var44 = var43.first();
        }
        if (var41.isAtom()) {
            return var41;
        }
        final SubLObject var45 = var41.first();
        final SubLObject var46 = var41.rest();
        final SubLObject var47 = f93(var40, var45, var42);
        final SubLObject var48 = f93(var40, var46, var42);
        return module0035.f2072(var47, var48, var41);
    }
    
    public static SubLObject f88(final SubLObject var40, final SubLObject var41, final SubLObject var42, final SubLObject var43) {
        final SubLObject var44 = Functions.funcall(var43, var41);
        SubLObject var45 = var40;
        SubLObject var46 = (SubLObject)NIL;
        var46 = var45.first();
        while (NIL != var45) {
            if (NIL != var46 && NIL != Functions.funcall(var42, var46.rest(), var44)) {
                return var46.first();
            }
            var45 = var45.rest();
            var46 = var45.first();
        }
        if (var41.isAtom()) {
            return var41;
        }
        final SubLObject var47 = var41.first();
        final SubLObject var48 = var41.rest();
        final SubLObject var49 = f88(var40, var47, var42, var43);
        final SubLObject var50 = f88(var40, var48, var42, var43);
        return module0035.f2071(var49, var50, var41);
    }
    
    public static SubLObject f92(final SubLObject var40, final SubLObject var41, final SubLObject var42, final SubLObject var43) {
        final SubLObject var44 = Functions.funcall(var43, var41);
        SubLObject var45 = var40;
        SubLObject var46 = (SubLObject)NIL;
        var46 = var45.first();
        while (NIL != var45) {
            if (NIL != var46 && NIL != Functions.funcall(var42, var46.rest(), var44)) {
                return var46.first();
            }
            var45 = var45.rest();
            var46 = var45.first();
        }
        if (var41.isAtom()) {
            return var41;
        }
        final SubLObject var47 = var41.first();
        final SubLObject var48 = var41.rest();
        final SubLObject var49 = f92(var40, var47, var42, var43);
        final SubLObject var50 = f92(var40, var48, var42, var43);
        return module0035.f2072(var49, var50, var41);
    }
    
    public static SubLObject f95() {
        final SubLObject var51 = Threads.all_processes();
        if (NIL != var51) {
            return conses_high.last(var51, (SubLObject)UNPROVIDED).first();
        }
        final SubLObject var52 = Threads.current_process();
        if (NIL != var52) {
            return var52;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f96(final SubLObject var53, final SubLObject var54, final SubLObject var55) {
        assert NIL != Types.sequencep(var53) : var53;
        if (var53.isList()) {
            ConsesLow.set_nth(var54, var53, var55);
        }
        else if (var53.isVector()) {
            Vectors.set_aref(var53, var54, var55);
        }
        else if (var53.isString()) {
            Strings.set_char(var53, var54, var55);
        }
        return var53;
    }
    
    public static SubLObject f97(final SubLObject var56) {
        return Functions.funcall(var56);
    }
    
    public static SubLObject f98(final SubLObject var56, final SubLObject var57) {
        return Functions.funcall(var56, var57);
    }
    
    public static SubLObject f99(final SubLObject var56, final SubLObject var57, final SubLObject var58) {
        return Functions.funcall(var56, var57, var58);
    }
    
    public static SubLObject f100(final SubLObject var56, final SubLObject var57, final SubLObject var58, final SubLObject var59) {
        return Functions.funcall(var56, var57, var58, var59);
    }
    
    public static SubLObject f101(final SubLObject var56, final SubLObject var57, final SubLObject var58, final SubLObject var59, final SubLObject var60) {
        return Functions.funcall(var56, var57, var58, var59, var60);
    }
    
    public static SubLObject f102(final SubLObject var61, SubLObject var62) {
        if (var62 == UNPROVIDED) {
            var62 = (SubLObject)NIL;
        }
        if (NIL == var62) {
            var62 = Time.get_universal_time();
        }
        return Numbers.subtract(var62, var61);
    }
    
    public static SubLObject f103(final SubLObject var63) {
        assert NIL != Types.stringp(var63) : var63;
        return var63;
    }
    
    public static SubLObject f104(final SubLObject var65, final SubLObject var38, SubLObject var42, SubLObject var43) {
        if (var42 == UNPROVIDED) {
            var42 = Symbols.symbol_function((SubLObject)EQL);
        }
        if (var43 == UNPROVIDED) {
            var43 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        return (SubLObject)makeBoolean(NIL != Sequences.position(var65, var38, var42, var43, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f105(final SubLObject var37) {
        return (SubLObject)makeBoolean(var37.isInteger() && var37.isPositive());
    }
    
    public static SubLObject f106(final SubLObject var37) {
        return (SubLObject)makeBoolean(var37.isInteger() && !var37.isNegative());
    }
    
    public static SubLObject f107(final SubLObject var37) {
        return (SubLObject)makeBoolean(var37.isInteger() && !var37.isPositive());
    }
    
    public static SubLObject f108(final SubLObject var37) {
        return (SubLObject)makeBoolean(var37.isInteger() && var37.isNegative());
    }
    
    public static SubLObject f109(final SubLObject var37) {
        return (SubLObject)makeBoolean(var37.isInteger() && !var37.isZero());
    }
    
    public static SubLObject f110(final SubLObject var37) {
        return (SubLObject)makeBoolean(var37.isInteger() && NIL != Numbers.oddp(var37));
    }
    
    public static SubLObject f111(final SubLObject var37) {
        return (SubLObject)makeBoolean(var37.isInteger() && NIL != Numbers.evenp(var37));
    }
    
    public static SubLObject f112(final SubLObject var66) {
        final SubLThread var67 = SubLProcess.currentSubLThread();
        return Tcp.$remote_hostname$.getDynamicValue(var67);
    }
    
    public static SubLObject f113(final SubLObject var66) {
        final SubLThread var67 = SubLProcess.currentSubLThread();
        SubLObject var69;
        final SubLObject var68 = var69 = Numbers.disassemble_integer_to_fixnums(Tcp.$remote_address$.getDynamicValue(var67));
        SubLObject var70 = (SubLObject)NIL;
        SubLObject var71 = (SubLObject)NIL;
        SubLObject var72 = (SubLObject)NIL;
        SubLObject var73 = (SubLObject)NIL;
        SubLObject var74 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic25$);
        var70 = var69.first();
        var69 = var69.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic25$);
        var71 = var69.first();
        var69 = var69.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic25$);
        var72 = var69.first();
        var69 = var69.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic25$);
        var73 = var69.first();
        var69 = var69.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var69, var68, (SubLObject)$ic25$);
        var74 = var69.first();
        var69 = var69.rest();
        final SubLObject var75 = (SubLObject)(var69.isCons() ? var69.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var69, var68, (SubLObject)$ic25$);
        var69 = var69.rest();
        final SubLObject var76 = (SubLObject)(var69.isCons() ? var69.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var69, var68, (SubLObject)$ic25$);
        var69 = var69.rest();
        if (NIL == var69) {
            return (NIL != var75) ? PrintLow.format((SubLObject)NIL, (SubLObject)$ic26$, new SubLObject[] { var76, var75, var74, var73, var72, var71 }) : PrintLow.format((SubLObject)NIL, (SubLObject)$ic27$, new SubLObject[] { var74, var73, var72, var71 });
        }
        cdestructuring_bind.cdestructuring_bind_error(var68, (SubLObject)$ic25$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f114(final SubLObject var76) {
        return Symbols.get(var76, (SubLObject)$ic28$, (SubLObject)$ic29$);
    }
    
    public static SubLObject f115(final SubLObject var37) {
        return module0035.f2169(var37, (SubLObject)$ic30$);
    }
    
    public static SubLObject f116() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0004", "f78", "MAKE-PROCESS-WITH-ARGS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0004", "f79", "S#69", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0004", "f80", "S#36", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0004", "f81", "S#70", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0004", "f82", "S#61", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0004", "f83", "S#71", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0004", "f84", "S#72", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0004", "values_list", "VALUES-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0004", "f85", "S#73", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0004", "f86", "S#74", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0004", "f87", "RSUBLIS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0004", "f91", "S#75", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0004", "f90", "S#76", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0004", "f94", "S#77", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0004", "f89", "S#78", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0004", "f93", "S#79", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0004", "f88", "S#80", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0004", "f92", "S#81", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0004", "f95", "S#82", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0004", "f96", "S#83", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0004", "f97", "S#84", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0004", "f98", "S#85", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0004", "f99", "S#86", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0004", "f100", "S#87", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0004", "f101", "S#88", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0004", "f102", "S#89", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0004", "f103", "S#90", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0004", "f104", "MEMBER?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0004", "f105", "POSITIVE-INTEGER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0004", "f106", "NON-NEGATIVE-INTEGER-P", 1, 0, false);
        new $f106$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0004", "f107", "S#91", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0004", "f108", "S#92", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0004", "f109", "S#93", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0004", "f110", "S#94", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0004", "f111", "S#95", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0004", "f112", "S#96", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0004", "f113", "S#97", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0004", "f114", "S#98", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0004", "f115", "S#99", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f117() {
        $g6$ = SubLFiles.deflexical("S#100", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic0$)) ? $g6$.getGlobalValue() : NIL));
        $g7$ = SubLFiles.deflexical("S#101", Locks.make_lock((SubLObject)$ic1$));
        $g8$ = SubLFiles.deflexical("S#102", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic8$)) ? $g8$.getGlobalValue() : NIL));
        $g9$ = SubLFiles.deflexical("S#103", Locks.make_lock((SubLObject)$ic9$));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f118() {
        module0003.f57((SubLObject)$ic0$);
        module0003.f57((SubLObject)$ic8$);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic24$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f116();
    }
    
    public void initializeVariables() {
        f117();
    }
    
    public void runTopLevelForms() {
        f118();
    }
    
    static {
        me = (SubLFile)new module0004();
        $g6$ = null;
        $g7$ = null;
        $g8$ = null;
        $g9$ = null;
        $ic0$ = makeSymbol("S#100", "CYC");
        $ic1$ = makeString("MAKE-PROCESS-WITH-ARGS-TABLE");
        $ic2$ = makeSymbol("STRINGP");
        $ic3$ = makeSymbol("FUNCTION-SPEC-P");
        $ic4$ = makeSymbol("LISTP");
        $ic5$ = makeSymbol("S#69", "CYC");
        $ic6$ = makeString("Unable to get make-process args for ~S");
        $ic7$ = ConsesLow.list((SubLObject)makeSymbol("S#104", "CYC"), (SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("S#105", "CYC"));
        $ic8$ = makeSymbol("S#102", "CYC");
        $ic9$ = makeString("INTERRUPT-PROCESS-WITH-ARGS-TABLE");
        $ic10$ = makeSymbol("PROCESSP");
        $ic11$ = makeSymbol("S#70", "CYC");
        $ic12$ = makeString("Unable to get interrupt-process args for ~S");
        $ic13$ = makeKeyword("PUBLIC");
        $ic14$ = makeSymbol("S#65", "CYC");
        $ic15$ = makeSymbol("S#38", "CYC");
        $ic16$ = makeString("~A");
        $ic17$ = makeSymbol("S#72", "CYC");
        $ic18$ = makeKeyword("PRIVATE");
        $ic19$ = ConsesLow.list((SubLObject)makeKeyword("PUBLIC"), (SubLObject)makeKeyword("PRIVATE"));
        $ic20$ = makeSymbol("VALUES");
        $ic21$ = makeSymbol("SYMBOLP");
        $ic22$ = makeSymbol("ARGLIST", "SUBLISP");
        $ic23$ = makeSymbol("SEQUENCEP");
        $ic24$ = ConsesLow.list((SubLObject)makeSymbol("INLINE"), (SubLObject)makeSymbol("MEMBER?"));
        $ic25$ = ConsesLow.list((SubLObject)makeSymbol("S#106", "CYC"), (SubLObject)makeSymbol("S#107", "CYC"), (SubLObject)makeSymbol("S#108", "CYC"), (SubLObject)makeSymbol("S#109", "CYC"), (SubLObject)makeSymbol("S#110", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#111", "CYC"), (SubLObject)makeSymbol("S#112", "CYC"));
        $ic26$ = makeString("~D.~D.~D.~D.~D.~D");
        $ic27$ = makeString("~D.~D.~D.~D");
        $ic28$ = makeKeyword("INITIALIZATION-TYPE");
        $ic29$ = makeKeyword("UNSPECIFIED");
        $ic30$ = ConsesLow.list((SubLObject)makeKeyword("INITIALIZER"), (SubLObject)makeKeyword("WORLD"));
    }
    
    public static final class $f106$UnaryFunction extends UnaryFunction
    {
        public $f106$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("NON-NEGATIVE-INTEGER-P"));
        }
        
        public SubLObject processItem(final SubLObject var57) {
            return f106(var57);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 174 ms
	
	Decompiled with Procyon 0.5.32.
*/