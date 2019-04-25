package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0314 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0314";
    public static final String myFingerPrint = "8936f3726fb4bb7aca108a590d95d3207b0dc0e831be5ae570212910225d9279";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLString $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLString $ic8$;
    private static final SubLString $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLString $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLInteger $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLObject $ic26$;
    private static final SubLList $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLObject $ic31$;
    private static final SubLObject $ic32$;
    private static final SubLObject $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLString $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLInteger $ic46$;
    private static final SubLString $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLList $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    
    
    public static SubLObject f21163() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        if (module0314.NIL != module0221.$g2399$.getDynamicValue(var1)) {
            return module0225.f14782(module0145.$g1891$.getDynamicValue(var1));
        }
        return module0145.$g1891$.getDynamicValue(var1);
    }
    
    public static SubLObject f21164() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        if (module0314.NIL != module0221.$g2399$.getDynamicValue(var1)) {
            return module0225.f14782(module0145.$g1892$.getDynamicValue(var1));
        }
        return module0145.$g1892$.getDynamicValue(var1);
    }
    
    public static SubLObject f21165(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0145.$g1895$.getDynamicValue(var3);
        if (var4.eql((SubLObject)module0314.$ic0$)) {
            return module0178.f11331(var2, f21164());
        }
        if (var4.eql((SubLObject)module0314.$ic1$)) {
            return module0178.f11331(var2, f21164());
        }
        if (var4.eql((SubLObject)module0314.$ic2$)) {
            return module0178.f11331(var2, f21163());
        }
        if (var4.eql((SubLObject)module0314.$ic3$)) {
            return module0178.f11331(var2, f21163());
        }
        module0313.f21151((SubLObject)module0314.THREE_INTEGER, (SubLObject)module0314.$ic4$, module0145.$g1895$.getDynamicValue(var3), (SubLObject)module0314.UNPROVIDED, (SubLObject)module0314.UNPROVIDED, (SubLObject)module0314.UNPROVIDED, (SubLObject)module0314.UNPROVIDED);
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21166(final SubLObject var2) {
        return Values.values(f21165(var2), module0178.f11287(var2));
    }
    
    public static SubLObject f21167(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)module0314.NIL;
        final SubLObject var7 = module0145.$g1902$.currentBinding(var5);
        try {
            module0145.$g1902$.bind((SubLObject)module0314.NIL, var5);
            try {
                assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic5$) : module0314.$ic5$;
                final SubLObject var6_7 = module0145.$g1904$.currentBinding(var5);
                try {
                    module0145.$g1904$.bind((SubLObject)module0314.$ic5$, var5);
                    f21168(var4, (SubLObject)module0314.UNPROVIDED);
                }
                finally {
                    module0145.$g1904$.rebind(var6_7, var5);
                }
            }
            finally {
                final SubLObject var6_8 = Threads.$is_thread_performing_cleanupP$.currentBinding(var5);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0314.T, var5);
                    Hashtables.clrhash(module0145.$g1924$.getDynamicValue(var5));
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var6_8, var5);
                }
            }
            var6 = module0145.$g1902$.getDynamicValue(var5);
        }
        finally {
            module0145.$g1902$.rebind(var7, var5);
        }
        return var6;
    }
    
    public static SubLObject f21169(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11 = (SubLObject)module0314.NIL;
        if (module0314.NIL != module0145.$g1932$.getDynamicValue(var10) && module0145.$g1934$.getDynamicValue(var10).numGE(module0145.$g1933$.getDynamicValue(var10))) {
            module0012.f425();
            var11 = (SubLObject)module0314.T;
        }
        if (module0314.NIL == var11) {
            module0145.$g1934$.setDynamicValue(Numbers.add(module0145.$g1934$.getDynamicValue(var10), (SubLObject)module0314.ONE_INTEGER), var10);
            module0145.$g1902$.setDynamicValue((SubLObject)ConsesLow.cons(var9, module0145.$g1902$.getDynamicValue(var10)), var10);
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21170(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        if (module0314.NIL != module0313.f21137(var11)) {
            if (module0314.NIL == f21171(var11)) {
                f21169(var11);
                f21172(var11);
                module0313.f21153(var11);
            }
        }
        else if (module0314.NIL != module0145.$g1910$.getDynamicValue(var12)) {
            if (module0314.NIL == conses_high.member(var11, module0145.$g1902$.getDynamicValue(var12), module0145.$g1910$.getDynamicValue(var12), Symbols.symbol_function((SubLObject)module0314.IDENTITY))) {
                module0145.$g1902$.setDynamicValue((SubLObject)ConsesLow.cons(var11, module0145.$g1902$.getDynamicValue(var12)), var12);
            }
        }
        else {
            module0145.$g1902$.setDynamicValue((SubLObject)ConsesLow.cons(var11, module0145.$g1902$.getDynamicValue(var12)), var12);
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21173(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = f21165(var2);
        final SubLObject var5 = module0178.f11287(var2);
        if (module0314.NIL != module0313.f21137(var4)) {
            if (module0314.NIL != module0145.$g1937$.getDynamicValue(var3)) {
                module0145.$g1936$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0178.f11334(var2), module0178.f11335(var2)), module0145.$g1936$.getDynamicValue(var3)), var3);
            }
            f21169((SubLObject)ConsesLow.cons(var4, var5));
        }
        else if (module0314.NIL != module0145.$g1910$.getDynamicValue(var3)) {
            final SubLObject var6 = (SubLObject)ConsesLow.cons(var4, var5);
            if (module0314.NIL == conses_high.member(var6, module0145.$g1902$.getDynamicValue(var3), module0145.$g1910$.getDynamicValue(var3), Symbols.symbol_function((SubLObject)module0314.IDENTITY))) {
                module0145.$g1902$.setDynamicValue((SubLObject)ConsesLow.cons(var6, module0145.$g1902$.getDynamicValue(var3)), var3);
            }
        }
        else {
            module0145.$g1902$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var4, var5), module0145.$g1902$.getDynamicValue(var3)), var3);
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21174(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)module0314.NIL;
        final SubLObject var7 = module0145.$g1902$.currentBinding(var5);
        try {
            module0145.$g1902$.bind((SubLObject)module0314.NIL, var5);
            try {
                assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic7$) : module0314.$ic7$;
                final SubLObject var6_14 = module0145.$g1904$.currentBinding(var5);
                try {
                    module0145.$g1904$.bind((SubLObject)module0314.$ic7$, var5);
                    f21168(var4, (SubLObject)module0314.UNPROVIDED);
                }
                finally {
                    module0145.$g1904$.rebind(var6_14, var5);
                }
            }
            finally {
                final SubLObject var6_15 = Threads.$is_thread_performing_cleanupP$.currentBinding(var5);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0314.T, var5);
                    Hashtables.clrhash(module0145.$g1924$.getDynamicValue(var5));
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var6_15, var5);
                }
            }
            var6 = module0145.$g1902$.getDynamicValue(var5);
        }
        finally {
            module0145.$g1902$.rebind(var7, var5);
        }
        return var6;
    }
    
    public static SubLObject f21175(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        if (module0314.NIL != module0313.f21137(var11) && module0314.NIL == f21171(var11)) {
            f21172(var11);
            final SubLObject var13 = module0145.$g1895$.getDynamicValue(var12);
            if (var13.eql((SubLObject)module0314.$ic1$)) {
                if (module0314.NIL == Errors.$ignore_mustsP$.getDynamicValue(var12) && module0314.NIL == module0313.f21138((SubLObject)module0314.$ic2$)) {
                    Errors.error((SubLObject)module0314.$ic8$, (SubLObject)module0314.$ic2$);
                }
                final SubLObject var14 = module0145.$g1895$.currentBinding(var12);
                try {
                    module0145.$g1895$.bind((SubLObject)module0314.$ic2$, var12);
                    assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic5$) : module0314.$ic5$;
                    final SubLObject var6_16 = module0145.$g1904$.currentBinding(var12);
                    try {
                        module0145.$g1904$.bind((SubLObject)module0314.$ic5$, var12);
                        f21168(var11, (SubLObject)module0314.UNPROVIDED);
                    }
                    finally {
                        module0145.$g1904$.rebind(var6_16, var12);
                    }
                }
                finally {
                    module0145.$g1895$.rebind(var14, var12);
                }
            }
            else if (var13.eql((SubLObject)module0314.$ic2$)) {
                if (module0314.NIL == Errors.$ignore_mustsP$.getDynamicValue(var12) && module0314.NIL == module0313.f21138((SubLObject)module0314.$ic1$)) {
                    Errors.error((SubLObject)module0314.$ic8$, (SubLObject)module0314.$ic1$);
                }
                final SubLObject var14 = module0145.$g1895$.currentBinding(var12);
                try {
                    module0145.$g1895$.bind((SubLObject)module0314.$ic1$, var12);
                    assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic5$) : module0314.$ic5$;
                    final SubLObject var6_17 = module0145.$g1904$.currentBinding(var12);
                    try {
                        module0145.$g1904$.bind((SubLObject)module0314.$ic5$, var12);
                        f21168(var11, (SubLObject)module0314.UNPROVIDED);
                    }
                    finally {
                        module0145.$g1904$.rebind(var6_17, var12);
                    }
                }
                finally {
                    module0145.$g1895$.rebind(var14, var12);
                }
            }
            else {
                module0313.f21151((SubLObject)module0314.FIVE_INTEGER, (SubLObject)module0314.$ic9$, module0145.$g1895$.getDynamicValue(var12), (SubLObject)module0314.UNPROVIDED, (SubLObject)module0314.UNPROVIDED, (SubLObject)module0314.UNPROVIDED, (SubLObject)module0314.UNPROVIDED);
            }
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21176(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)module0314.NIL;
        final SubLObject var7 = module0145.$g1902$.currentBinding(var5);
        try {
            module0145.$g1902$.bind((SubLObject)module0314.NIL, var5);
            assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic10$) : module0314.$ic10$;
            final SubLObject var6_18 = module0145.$g1905$.currentBinding(var5);
            try {
                module0145.$g1905$.bind((SubLObject)module0314.$ic10$, var5);
                if (module0314.NIL != module0313.f21140()) {
                    f21169(var4);
                }
                assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic5$) : module0314.$ic5$;
                final SubLObject var6_19 = module0145.$g1904$.currentBinding(var5);
                try {
                    module0145.$g1904$.bind((SubLObject)module0314.$ic5$, var5);
                    f21168(var4, (SubLObject)module0314.UNPROVIDED);
                }
                finally {
                    module0145.$g1904$.rebind(var6_19, var5);
                }
            }
            finally {
                module0145.$g1905$.rebind(var6_18, var5);
            }
            var6 = module0145.$g1902$.getDynamicValue(var5);
        }
        finally {
            module0145.$g1902$.rebind(var7, var5);
        }
        return var6;
    }
    
    public static SubLObject f21177(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)module0314.NIL;
        final SubLObject var7 = module0145.$g1902$.currentBinding(var5);
        try {
            module0145.$g1902$.bind((SubLObject)module0314.NIL, var5);
            SubLObject var8 = (SubLObject)module0314.NIL;
            assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic5$) : module0314.$ic5$;
            final SubLObject var6_21 = module0145.$g1904$.currentBinding(var5);
            try {
                module0145.$g1904$.bind((SubLObject)module0314.$ic5$, var5);
                try {
                    final SubLObject var6_22 = module0145.$g1891$.currentBinding(var5);
                    final SubLObject var9 = module0145.$g1892$.currentBinding(var5);
                    final SubLObject var10 = module0145.$g1888$.currentBinding(var5);
                    final SubLObject var11 = module0145.$g1897$.currentBinding(var5);
                    final SubLObject var12 = module0145.$g1902$.currentBinding(var5);
                    try {
                        module0145.$g1891$.bind(module0145.$g1951$.getDynamicValue(var5), var5);
                        module0145.$g1892$.bind(module0145.$g1952$.getDynamicValue(var5), var5);
                        module0145.$g1888$.bind(module0145.$g1948$.getDynamicValue(var5), var5);
                        module0145.$g1897$.bind(module0145.$g1953$.getDynamicValue(var5), var5);
                        module0145.$g1902$.bind((SubLObject)module0314.NIL, var5);
                        f21168(var4, (SubLObject)module0314.UNPROVIDED);
                        var8 = module0145.$g1902$.getDynamicValue(var5);
                    }
                    finally {
                        module0145.$g1902$.rebind(var12, var5);
                        module0145.$g1897$.rebind(var11, var5);
                        module0145.$g1888$.rebind(var10, var5);
                        module0145.$g1892$.rebind(var9, var5);
                        module0145.$g1891$.rebind(var6_22, var5);
                    }
                    if (module0314.NIL != ((module0314.NIL != module0145.$g1955$.getDynamicValue(var5)) ? module0314.$ic10$ : module0314.NIL) && !module0314.areAssertionsDisabledFor(me) && module0314.NIL == Types.function_spec_p((SubLObject)((module0314.NIL != module0145.$g1955$.getDynamicValue(var5)) ? module0314.$ic10$ : module0314.NIL))) {
                        throw new AssertionError((module0314.NIL != module0145.$g1955$.getDynamicValue(var5)) ? module0314.$ic10$ : module0314.NIL);
                    }
                    final SubLObject var6_23 = module0145.$g1905$.currentBinding(var5);
                    try {
                        module0145.$g1905$.bind((SubLObject)((module0314.NIL != module0145.$g1955$.getDynamicValue(var5)) ? module0314.$ic10$ : module0314.NIL), var5);
                        SubLObject var13 = var8;
                        SubLObject var14 = (SubLObject)module0314.NIL;
                        var14 = var13.first();
                        while (module0314.NIL != var13) {
                            if (module0314.NIL != module0313.f21137(var14)) {
                                f21168(var14, (SubLObject)module0314.UNPROVIDED);
                            }
                            var13 = var13.rest();
                            var14 = var13.first();
                        }
                    }
                    finally {
                        module0145.$g1905$.rebind(var6_23, var5);
                    }
                    module0145.$g1902$.setDynamicValue(ConsesLow.nconc(var8, module0145.$g1902$.getDynamicValue(var5)), var5);
                }
                finally {
                    final SubLObject var6_24 = Threads.$is_thread_performing_cleanupP$.currentBinding(var5);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0314.T, var5);
                        Hashtables.clrhash(module0145.$g1924$.getDynamicValue(var5));
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var6_24, var5);
                    }
                }
            }
            finally {
                module0145.$g1904$.rebind(var6_21, var5);
            }
            if (module0314.NIL != module0226.f14795(module0145.$g1948$.getDynamicValue(var5))) {
                module0145.$g1902$.setDynamicValue((SubLObject)ConsesLow.cons(var4, module0145.$g1902$.getDynamicValue(var5)), var5);
            }
            var6 = module0145.$g1902$.getDynamicValue(var5);
        }
        finally {
            module0145.$g1902$.rebind(var7, var5);
        }
        return var6;
    }
    
    public static SubLObject f21178(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)module0314.NIL;
        final SubLObject var7 = module0145.$g1902$.currentBinding(var5);
        try {
            module0145.$g1902$.bind((SubLObject)module0314.NIL, var5);
            assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic10$) : module0314.$ic10$;
            final SubLObject var6_30 = module0145.$g1905$.currentBinding(var5);
            try {
                module0145.$g1905$.bind((SubLObject)module0314.$ic10$, var5);
                try {
                    assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic11$) : module0314.$ic11$;
                    final SubLObject var6_31 = module0145.$g1904$.currentBinding(var5);
                    try {
                        module0145.$g1904$.bind((SubLObject)module0314.$ic11$, var5);
                        f21168(var4, (SubLObject)module0314.UNPROVIDED);
                    }
                    finally {
                        module0145.$g1904$.rebind(var6_31, var5);
                    }
                }
                finally {
                    final SubLObject var6_32 = Threads.$is_thread_performing_cleanupP$.currentBinding(var5);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0314.T, var5);
                        Hashtables.clrhash(module0145.$g1924$.getDynamicValue(var5));
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var6_32, var5);
                    }
                }
            }
            finally {
                module0145.$g1905$.rebind(var6_30, var5);
            }
            if (module0314.NIL != module0145.$g1902$.getDynamicValue(var5)) {
                var6 = module0145.$g1902$.getDynamicValue(var5);
            }
            else if (module0314.NIL != module0313.f21140()) {
                var6 = (SubLObject)ConsesLow.cons(var4, var6);
            }
        }
        finally {
            module0145.$g1902$.rebind(var7, var5);
        }
        return var6;
    }
    
    public static SubLObject f21179(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        SubLObject var13 = (SubLObject)module0314.NIL;
        SubLObject var14 = (SubLObject)module0314.NIL;
        if (module0314.NIL != module0313.f21137(var11)) {
            if (module0314.NIL != f21171(var11)) {
                module0145.$g1900$.setDynamicValue((SubLObject)module0314.T, var12);
            }
            else {
                f21172(var11);
                final SubLObject var15 = module0145.$g1902$.currentBinding(var12);
                final SubLObject var16 = module0145.$g1900$.currentBinding(var12);
                try {
                    module0145.$g1902$.bind((SubLObject)module0314.NIL, var12);
                    module0145.$g1900$.bind((SubLObject)module0314.NIL, var12);
                    module0313.f21153(var11);
                    var14 = (SubLObject)SubLObjectFactory.makeBoolean(module0314.NIL != var14 || module0314.NIL != module0145.$g1900$.getDynamicValue(var12));
                    var13 = module0145.$g1902$.getDynamicValue(var12);
                }
                finally {
                    module0145.$g1900$.rebind(var16, var12);
                    module0145.$g1902$.rebind(var15, var12);
                }
                if (module0314.NIL != var13) {
                    module0145.$g1902$.setDynamicValue(ConsesLow.nconc(var13, module0145.$g1902$.getDynamicValue(var12)), var12);
                }
                else if (module0314.NIL != var14) {
                    module0145.$g1900$.setDynamicValue(var14, var12);
                }
                else {
                    f21169(var11);
                }
            }
        }
        return module0145.$g1902$.getDynamicValue(var12);
    }
    
    public static SubLObject f21180(final SubLObject var4, final SubLObject var35, SubLObject var36) {
        if (var36 == module0314.UNPROVIDED) {
            var36 = (SubLObject)module0314.EQL;
        }
        final SubLThread var37 = SubLProcess.currentSubLThread();
        SubLObject var38 = (SubLObject)module0314.NIL;
        final SubLObject var39 = module0145.$g1902$.currentBinding(var37);
        final SubLObject var40 = module0145.$g1899$.currentBinding(var37);
        try {
            module0145.$g1902$.bind((SubLObject)module0314.NIL, var37);
            module0145.$g1899$.bind((SubLObject)module0314.NIL, var37);
            final SubLObject var6_37 = module0145.$g1901$.currentBinding(var37);
            try {
                module0145.$g1901$.bind(var35, var37);
                assert module0314.NIL != Types.function_spec_p(var36) : var36;
                final SubLObject var6_38 = module0145.$g1909$.currentBinding(var37);
                try {
                    module0145.$g1909$.bind(var36, var37);
                    assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic10$) : module0314.$ic10$;
                    final SubLObject var6_39 = module0145.$g1905$.currentBinding(var37);
                    try {
                        module0145.$g1905$.bind((SubLObject)module0314.$ic10$, var37);
                        try {
                            assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic12$) : module0314.$ic12$;
                            final SubLObject var6_40 = module0145.$g1904$.currentBinding(var37);
                            try {
                                module0145.$g1904$.bind((SubLObject)module0314.$ic12$, var37);
                                f21168(var4, (SubLObject)module0314.UNPROVIDED);
                            }
                            finally {
                                module0145.$g1904$.rebind(var6_40, var37);
                            }
                        }
                        finally {
                            final SubLObject var6_41 = Threads.$is_thread_performing_cleanupP$.currentBinding(var37);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0314.T, var37);
                                Hashtables.clrhash(module0145.$g1924$.getDynamicValue(var37));
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var6_41, var37);
                            }
                        }
                    }
                    finally {
                        module0145.$g1905$.rebind(var6_39, var37);
                    }
                }
                finally {
                    module0145.$g1909$.rebind(var6_38, var37);
                }
            }
            finally {
                module0145.$g1901$.rebind(var6_37, var37);
            }
            var38 = module0145.$g1902$.getDynamicValue(var37);
        }
        finally {
            module0145.$g1899$.rebind(var40, var37);
            module0145.$g1902$.rebind(var39, var37);
        }
        return var38;
    }
    
    public static SubLObject f21181(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        if (module0314.NIL != module0313.f21156(var11, module0145.$g1901$.getDynamicValue(var12))) {
            f21182((SubLObject)module0314.T);
        }
        else if (module0314.NIL != module0313.f21137(var11) && module0314.NIL == f21171(var11)) {
            f21172(var11);
            module0313.f21153(var11);
        }
        return module0145.$g1902$.getDynamicValue(var12);
    }
    
    public static SubLObject f21183(final SubLObject var42, final SubLObject var43) {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        SubLObject var45 = (SubLObject)module0314.NIL;
        final SubLObject var46 = module0145.$g1902$.currentBinding(var44);
        final SubLObject var47 = module0145.$g1899$.currentBinding(var44);
        try {
            module0145.$g1902$.bind((SubLObject)module0314.NIL, var44);
            module0145.$g1899$.bind((SubLObject)module0314.NIL, var44);
            if (module0314.NIL == Errors.$ignore_mustsP$.getDynamicValue(var44) && !var43.isFunctionSpec()) {
                Errors.error((SubLObject)module0314.$ic13$, var43);
            }
            final SubLObject var6_44 = module0145.$g1907$.currentBinding(var44);
            try {
                module0145.$g1907$.bind(var43, var44);
                assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic10$) : module0314.$ic10$;
                final SubLObject var6_45 = module0145.$g1905$.currentBinding(var44);
                try {
                    module0145.$g1905$.bind((SubLObject)module0314.$ic10$, var44);
                    try {
                        assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic14$) : module0314.$ic14$;
                        final SubLObject var6_46 = module0145.$g1904$.currentBinding(var44);
                        try {
                            module0145.$g1904$.bind((SubLObject)module0314.$ic14$, var44);
                            f21168(var42, (SubLObject)module0314.UNPROVIDED);
                        }
                        finally {
                            module0145.$g1904$.rebind(var6_46, var44);
                        }
                    }
                    finally {
                        final SubLObject var6_47 = Threads.$is_thread_performing_cleanupP$.currentBinding(var44);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0314.T, var44);
                            Hashtables.clrhash(module0145.$g1924$.getDynamicValue(var44));
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var6_47, var44);
                        }
                    }
                }
                finally {
                    module0145.$g1905$.rebind(var6_45, var44);
                }
            }
            finally {
                module0145.$g1907$.rebind(var6_44, var44);
            }
            var45 = module0145.$g1902$.getDynamicValue(var44);
        }
        finally {
            module0145.$g1899$.rebind(var47, var44);
            module0145.$g1902$.rebind(var46, var44);
        }
        return var45;
    }
    
    public static SubLObject f21184(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        final SubLObject var13 = Functions.funcall(module0145.$g1907$.getDynamicValue(var12), var11);
        if (module0314.NIL != var13) {
            f21182(var13);
        }
        else if (module0314.NIL != module0313.f21137(var11) && module0314.NIL == f21171(var11)) {
            f21172(var11);
            module0313.f21153(var11);
        }
        return module0145.$g1902$.getDynamicValue(var12);
    }
    
    public static SubLObject f21185(final SubLObject var49, SubLObject var50, SubLObject var13) {
        if (var50 == module0314.UNPROVIDED) {
            var50 = (SubLObject)module0314.NIL;
        }
        if (var13 == module0314.UNPROVIDED) {
            var13 = (SubLObject)module0314.NIL;
        }
        final SubLThread var51 = SubLProcess.currentSubLThread();
        SubLObject var52 = (SubLObject)module0314.NIL;
        final SubLObject var53 = var13;
        final SubLObject var54 = module0147.$g2095$.currentBinding(var51);
        final SubLObject var55 = module0147.$g2094$.currentBinding(var51);
        final SubLObject var56 = module0147.$g2096$.currentBinding(var51);
        try {
            module0147.$g2095$.bind(module0147.f9545(var53), var51);
            module0147.$g2094$.bind(module0147.f9546(var53), var51);
            module0147.$g2096$.bind(module0147.f9549(var53), var51);
            SubLObject var57 = (SubLObject)module0314.NIL;
            final SubLObject var6_54 = module0145.$g1925$.currentBinding(var51);
            final SubLObject var23_55 = module0145.$g1924$.currentBinding(var51);
            try {
                module0145.$g1925$.bind(module0145.$g1924$.getDynamicValue(var51), var51);
                module0145.$g1924$.bind((SubLObject)module0314.NIL, var51);
                module0145.$g1924$.setDynamicValue(Hashtables.make_hash_table((SubLObject)module0314.$ic15$, (SubLObject)module0314.UNPROVIDED, (SubLObject)module0314.UNPROVIDED), var51);
                var57 = f21176(var49.first());
            }
            finally {
                module0145.$g1924$.rebind(var23_55, var51);
                module0145.$g1925$.rebind(var6_54, var51);
            }
            SubLObject var58 = var49;
            SubLObject var59 = (SubLObject)module0314.NIL;
            var59 = var58.first();
            while (module0314.NIL != var58) {
                f21186(var59, var59);
                var58 = var58.rest();
                var59 = var58.first();
            }
            var58 = var57;
            SubLObject var60 = (SubLObject)module0314.NIL;
            var60 = var58.first();
            while (module0314.NIL != var58) {
                if (module0314.NIL != f21187(var60, var49, (SubLObject)module0314.UNPROVIDED)) {
                    if (module0314.NIL == var50) {
                        var52 = (SubLObject)ConsesLow.cons(var60, var52);
                    }
                    else if (module0314.NIL != module0004.f104(var60, var50, (SubLObject)module0314.UNPROVIDED, (SubLObject)module0314.UNPROVIDED)) {
                        var52 = (SubLObject)ConsesLow.cons(var60, var52);
                    }
                }
                var58 = var58.rest();
                var60 = var58.first();
            }
        }
        finally {
            module0147.$g2096$.rebind(var56, var51);
            module0147.$g2094$.rebind(var55, var51);
            module0147.$g2095$.rebind(var54, var51);
        }
        return var52;
    }
    
    public static SubLObject f21188(final SubLObject var4, final SubLObject var57, SubLObject var58) {
        if (var58 == module0314.UNPROVIDED) {
            var58 = module0145.$g1908$.getDynamicValue();
        }
        final SubLThread var59 = SubLProcess.currentSubLThread();
        SubLObject var60 = (SubLObject)module0314.NIL;
        final SubLObject var61 = module0145.$g1902$.currentBinding(var59);
        try {
            module0145.$g1902$.bind((SubLObject)module0314.NIL, var59);
            assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic10$) : module0314.$ic10$;
            final SubLObject var6_59 = module0145.$g1905$.currentBinding(var59);
            try {
                module0145.$g1905$.bind((SubLObject)module0314.$ic10$, var59);
                if (module0314.NIL != module0313.f21140()) {
                    SubLObject var62 = (SubLObject)module0314.NIL;
                    if (module0314.NIL != module0145.$g1932$.getDynamicValue(var59) && module0145.$g1934$.getDynamicValue(var59).numGE(module0145.$g1933$.getDynamicValue(var59))) {
                        module0012.f425();
                        var62 = (SubLObject)module0314.T;
                    }
                    if (module0314.NIL == var62) {
                        module0145.$g1934$.setDynamicValue(Numbers.add(module0145.$g1934$.getDynamicValue(var59), (SubLObject)module0314.ONE_INTEGER), var59);
                        module0145.$g1902$.setDynamicValue(Functions.funcall(var58, Functions.funcall(var57, var4), module0145.$g1902$.getDynamicValue(var59)), var59);
                    }
                }
                assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic16$) : module0314.$ic16$;
                final SubLObject var6_60 = module0145.$g1904$.currentBinding(var59);
                try {
                    module0145.$g1904$.bind((SubLObject)module0314.$ic16$, var59);
                    assert module0314.NIL != Types.function_spec_p(var58) : var58;
                    final SubLObject var6_61 = module0145.$g1908$.currentBinding(var59);
                    try {
                        module0145.$g1908$.bind(var58, var59);
                        assert module0314.NIL != Types.function_spec_p(var57) : var57;
                        final SubLObject var6_62 = module0145.$g1906$.currentBinding(var59);
                        try {
                            module0145.$g1906$.bind(var57, var59);
                            f21168(var4, (SubLObject)module0314.UNPROVIDED);
                        }
                        finally {
                            module0145.$g1906$.rebind(var6_62, var59);
                        }
                    }
                    finally {
                        module0145.$g1908$.rebind(var6_61, var59);
                    }
                }
                finally {
                    module0145.$g1904$.rebind(var6_60, var59);
                }
            }
            finally {
                module0145.$g1905$.rebind(var6_59, var59);
            }
            var60 = module0145.$g1902$.getDynamicValue(var59);
        }
        finally {
            module0145.$g1902$.rebind(var61, var59);
        }
        return var60;
    }
    
    public static SubLObject f21189(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        if (module0314.NIL != module0313.f21137(var11)) {
            SubLObject var13 = (SubLObject)module0314.NIL;
            if (module0314.NIL != module0145.$g1932$.getDynamicValue(var12) && module0145.$g1934$.getDynamicValue(var12).numGE(module0145.$g1933$.getDynamicValue(var12))) {
                module0012.f425();
                var13 = (SubLObject)module0314.T;
            }
            if (module0314.NIL == var13) {
                module0145.$g1934$.setDynamicValue(Numbers.add(module0145.$g1934$.getDynamicValue(var12), (SubLObject)module0314.ONE_INTEGER), var12);
                if (module0314.NIL == f21171(var11)) {
                    f21172(var11);
                    module0313.f21153(var11);
                    module0145.$g1902$.setDynamicValue(Functions.funcall(module0145.$g1908$.getDynamicValue(var12), Functions.funcall(module0145.$g1906$.getDynamicValue(var12), var11), module0145.$g1902$.getDynamicValue(var12)), var12);
                }
            }
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21190(final SubLObject var4, final SubLObject var63, SubLObject var58) {
        if (var58 == module0314.UNPROVIDED) {
            var58 = (SubLObject)module0314.$ic17$;
        }
        final SubLThread var64 = SubLProcess.currentSubLThread();
        SubLObject var65 = (SubLObject)module0314.NIL;
        final SubLObject var66 = module0145.$g1902$.currentBinding(var64);
        try {
            module0145.$g1902$.bind((SubLObject)module0314.NIL, var64);
            assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic10$) : module0314.$ic10$;
            final SubLObject var6_64 = module0145.$g1905$.currentBinding(var64);
            try {
                module0145.$g1905$.bind((SubLObject)module0314.$ic10$, var64);
                try {
                    assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic18$) : module0314.$ic18$;
                    final SubLObject var6_65 = module0145.$g1904$.currentBinding(var64);
                    try {
                        module0145.$g1904$.bind((SubLObject)module0314.$ic18$, var64);
                        assert module0314.NIL != Types.function_spec_p(var58) : var58;
                        final SubLObject var6_66 = module0145.$g1908$.currentBinding(var64);
                        try {
                            module0145.$g1908$.bind(var58, var64);
                            assert module0314.NIL != Types.function_spec_p(var63) : var63;
                            final SubLObject var6_67 = module0145.$g1906$.currentBinding(var64);
                            try {
                                module0145.$g1906$.bind(var63, var64);
                                f21168(var4, (SubLObject)module0314.UNPROVIDED);
                            }
                            finally {
                                module0145.$g1906$.rebind(var6_67, var64);
                            }
                        }
                        finally {
                            module0145.$g1908$.rebind(var6_66, var64);
                        }
                    }
                    finally {
                        module0145.$g1904$.rebind(var6_65, var64);
                    }
                }
                finally {
                    final SubLObject var6_68 = Threads.$is_thread_performing_cleanupP$.currentBinding(var64);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0314.T, var64);
                        Hashtables.clrhash(module0145.$g1924$.getDynamicValue(var64));
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var6_68, var64);
                    }
                }
            }
            finally {
                module0145.$g1905$.rebind(var6_64, var64);
            }
            if (module0314.NIL != module0313.f21140() && module0314.NIL != Functions.funcall(var63, var4)) {
                module0145.$g1902$.setDynamicValue(Functions.funcall(var58, var4, module0145.$g1902$.getDynamicValue(var64)), var64);
            }
            var65 = module0145.$g1902$.getDynamicValue(var64);
        }
        finally {
            module0145.$g1902$.rebind(var66, var64);
        }
        return var65;
    }
    
    public static SubLObject f21191(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        if (module0314.NIL != module0313.f21137(var11) && module0314.NIL == f21171(var11)) {
            f21172(var11);
            module0313.f21153(var11);
            if (module0314.NIL != Functions.funcall(module0145.$g1906$.getDynamicValue(var12), var11)) {
                module0145.$g1902$.setDynamicValue(Functions.funcall(module0145.$g1908$.getDynamicValue(var12), var11, module0145.$g1902$.getDynamicValue(var12)), var12);
            }
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21192(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)module0314.NIL;
        final SubLObject var7 = module0313.f21140();
        final SubLObject var8 = module0145.$g1902$.currentBinding(var5);
        try {
            module0145.$g1902$.bind((SubLObject)module0314.NIL, var5);
            assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic10$) : module0314.$ic10$;
            final SubLObject var6_70 = module0145.$g1905$.currentBinding(var5);
            try {
                module0145.$g1905$.bind((SubLObject)module0314.$ic10$, var5);
                try {
                    f21172(var4);
                    assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic19$) : module0314.$ic19$;
                    final SubLObject var6_71 = module0145.$g1904$.currentBinding(var5);
                    try {
                        module0145.$g1904$.bind((SubLObject)module0314.$ic19$, var5);
                        f21168(var4, (SubLObject)module0314.UNPROVIDED);
                    }
                    finally {
                        module0145.$g1904$.rebind(var6_71, var5);
                    }
                    f21193(var4);
                    f21194(var4);
                    if (module0314.NIL != var7 && module0314.NIL != module0313.f21150(var4)) {
                        module0145.$g1902$.setDynamicValue((SubLObject)ConsesLow.cons(var4, module0145.$g1902$.getDynamicValue(var5)), var5);
                    }
                }
                finally {
                    final SubLObject var6_72 = Threads.$is_thread_performing_cleanupP$.currentBinding(var5);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0314.T, var5);
                        f21195(var4);
                        assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic20$) : module0314.$ic20$;
                        final SubLObject var6_73 = module0145.$g1904$.currentBinding(var5);
                        try {
                            module0145.$g1904$.bind((SubLObject)module0314.$ic20$, var5);
                            f21168(var4, (SubLObject)module0314.UNPROVIDED);
                        }
                        finally {
                            module0145.$g1904$.rebind(var6_73, var5);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var6_72, var5);
                    }
                }
            }
            finally {
                module0145.$g1905$.rebind(var6_70, var5);
            }
            var6 = module0145.$g1902$.getDynamicValue(var5);
        }
        finally {
            module0145.$g1902$.rebind(var8, var5);
        }
        return var6;
    }
    
    public static SubLObject f21194(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = module0145.$g1925$.currentBinding(var5);
        final SubLObject var7 = module0145.$g1924$.currentBinding(var5);
        try {
            module0145.$g1925$.bind(module0145.$g1924$.getDynamicValue(var5), var5);
            module0145.$g1924$.bind((SubLObject)module0314.NIL, var5);
            module0145.$g1924$.setDynamicValue(Hashtables.make_hash_table((SubLObject)module0314.$ic15$, (SubLObject)module0314.UNPROVIDED, (SubLObject)module0314.UNPROVIDED), var5);
            try {
                assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic21$) : module0314.$ic21$;
                final SubLObject var6_74 = module0145.$g1904$.currentBinding(var5);
                try {
                    module0145.$g1904$.bind((SubLObject)module0314.$ic21$, var5);
                    assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic17$) : module0314.$ic17$;
                    final SubLObject var6_75 = module0145.$g1908$.currentBinding(var5);
                    try {
                        module0145.$g1908$.bind((SubLObject)module0314.$ic17$, var5);
                        f21168(var4, (SubLObject)module0314.UNPROVIDED);
                    }
                    finally {
                        module0145.$g1908$.rebind(var6_75, var5);
                    }
                }
                finally {
                    module0145.$g1904$.rebind(var6_74, var5);
                }
            }
            finally {
                final SubLObject var6_76 = Threads.$is_thread_performing_cleanupP$.currentBinding(var5);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0314.T, var5);
                    assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic20$) : module0314.$ic20$;
                    final SubLObject var6_77 = module0145.$g1904$.currentBinding(var5);
                    try {
                        module0145.$g1904$.bind((SubLObject)module0314.$ic20$, var5);
                        f21168(var4, (SubLObject)module0314.UNPROVIDED);
                    }
                    finally {
                        module0145.$g1904$.rebind(var6_77, var5);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var6_76, var5);
                }
            }
        }
        finally {
            module0145.$g1924$.rebind(var7, var5);
            module0145.$g1925$.rebind(var6, var5);
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21196(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        if (module0314.NIL != module0313.f21137(var11) && module0314.NIL == f21171(var11)) {
            f21172(var11);
            if (module0314.NIL != f21197(var11, (SubLObject)module0314.UNPROVIDED)) {
                module0313.f21153(var11);
                module0145.$g1902$.setDynamicValue(Functions.funcall(module0145.$g1908$.getDynamicValue(var12), var11, module0145.$g1902$.getDynamicValue(var12)), var12);
                f21198(var11, module0145.$g1925$.getDynamicValue(var12));
            }
        }
        return module0145.$g1902$.getDynamicValue(var12);
    }
    
    public static SubLObject f21193(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = module0145.$g1925$.currentBinding(var5);
        final SubLObject var7 = module0145.$g1924$.currentBinding(var5);
        try {
            module0145.$g1925$.bind(module0145.$g1924$.getDynamicValue(var5), var5);
            module0145.$g1924$.bind((SubLObject)module0314.NIL, var5);
            module0145.$g1924$.setDynamicValue(Hashtables.make_hash_table((SubLObject)module0314.$ic15$, (SubLObject)module0314.UNPROVIDED, (SubLObject)module0314.UNPROVIDED), var5);
            try {
                assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic22$) : module0314.$ic22$;
                final SubLObject var6_78 = module0145.$g1904$.currentBinding(var5);
                try {
                    module0145.$g1904$.bind((SubLObject)module0314.$ic22$, var5);
                    assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic23$) : module0314.$ic23$;
                    final SubLObject var6_79 = module0145.$g1906$.currentBinding(var5);
                    try {
                        module0145.$g1906$.bind((SubLObject)module0314.$ic23$, var5);
                        f21168(var4, (SubLObject)module0314.UNPROVIDED);
                    }
                    finally {
                        module0145.$g1906$.rebind(var6_79, var5);
                    }
                }
                finally {
                    module0145.$g1904$.rebind(var6_78, var5);
                }
            }
            finally {
                final SubLObject var6_80 = Threads.$is_thread_performing_cleanupP$.currentBinding(var5);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0314.T, var5);
                    assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic20$) : module0314.$ic20$;
                    final SubLObject var6_81 = module0145.$g1904$.currentBinding(var5);
                    try {
                        module0145.$g1904$.bind((SubLObject)module0314.$ic20$, var5);
                        f21168(var4, (SubLObject)module0314.UNPROVIDED);
                    }
                    finally {
                        module0145.$g1904$.rebind(var6_81, var5);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var6_80, var5);
                }
            }
        }
        finally {
            module0145.$g1924$.rebind(var7, var5);
            module0145.$g1925$.rebind(var6, var5);
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21199(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        if (module0314.NIL != module0313.f21137(var11) && module0314.NIL == f21171(var11)) {
            f21172(var11);
            if (module0314.NIL != f21197(var11, (SubLObject)module0314.UNPROVIDED)) {
                final SubLObject var13 = module0145.$g1924$.currentBinding(var12);
                try {
                    module0145.$g1924$.bind(module0145.$g1925$.getDynamicValue(var12), var12);
                    if (module0314.NIL == Functions.funcall(module0145.$g1906$.getDynamicValue(var12), var11)) {
                        f21195(var11);
                        assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic20$) : module0314.$ic20$;
                        final SubLObject var6_82 = module0145.$g1904$.currentBinding(var12);
                        try {
                            module0145.$g1904$.bind((SubLObject)module0314.$ic20$, var12);
                            f21168(var11, (SubLObject)module0314.UNPROVIDED);
                        }
                        finally {
                            module0145.$g1904$.rebind(var6_82, var12);
                        }
                    }
                }
                finally {
                    module0145.$g1924$.rebind(var13, var12);
                }
                module0313.f21153(var11);
            }
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21200(final SubLObject var4, final SubLObject var83) {
        final SubLThread var84 = SubLProcess.currentSubLThread();
        SubLObject var85 = (SubLObject)module0314.NIL;
        final SubLObject var86 = module0313.f21140();
        final SubLObject var87 = module0145.$g1902$.currentBinding(var84);
        try {
            module0145.$g1902$.bind((SubLObject)module0314.NIL, var84);
            if (module0314.NIL != ((module0314.NIL == module0145.$g1948$.getDynamicValue(var84) || module0314.NIL != module0145.$g1955$.getDynamicValue(var84)) ? module0314.$ic10$ : module0314.NIL) && !module0314.areAssertionsDisabledFor(me) && module0314.NIL == Types.function_spec_p((SubLObject)((module0314.NIL == module0145.$g1948$.getDynamicValue(var84) || module0314.NIL != module0145.$g1955$.getDynamicValue(var84)) ? module0314.$ic10$ : module0314.NIL))) {
                throw new AssertionError((module0314.NIL == module0145.$g1948$.getDynamicValue(var84) || module0314.NIL != module0145.$g1955$.getDynamicValue(var84)) ? module0314.$ic10$ : module0314.NIL);
            }
            final SubLObject var6_84 = module0145.$g1905$.currentBinding(var84);
            try {
                module0145.$g1905$.bind((SubLObject)((module0314.NIL == module0145.$g1948$.getDynamicValue(var84) || module0314.NIL != module0145.$g1955$.getDynamicValue(var84)) ? module0314.$ic10$ : module0314.NIL), var84);
                try {
                    assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic24$) : module0314.$ic24$;
                    final SubLObject var6_85 = module0145.$g1904$.currentBinding(var84);
                    try {
                        module0145.$g1904$.bind((SubLObject)module0314.$ic24$, var84);
                        assert module0314.NIL != module0173.f10955(var83) : var83;
                        final SubLObject var6_86 = module0145.$g1911$.currentBinding(var84);
                        try {
                            module0145.$g1911$.bind(var83, var84);
                            f21168(var4, (SubLObject)module0314.UNPROVIDED);
                            if (module0314.NIL != var86) {
                                f21201(var4);
                            }
                        }
                        finally {
                            module0145.$g1911$.rebind(var6_86, var84);
                        }
                    }
                    finally {
                        module0145.$g1904$.rebind(var6_85, var84);
                    }
                }
                finally {
                    final SubLObject var6_87 = Threads.$is_thread_performing_cleanupP$.currentBinding(var84);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0314.T, var84);
                        Hashtables.clrhash(module0145.$g1924$.getDynamicValue(var84));
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var6_87, var84);
                    }
                }
            }
            finally {
                module0145.$g1905$.rebind(var6_84, var84);
            }
            var85 = module0145.$g1902$.getDynamicValue(var84);
        }
        finally {
            module0145.$g1902$.rebind(var87, var84);
        }
        return var85;
    }
    
    public static SubLObject f21202(final SubLObject var11) {
        if (module0314.NIL != module0313.f21137(var11) && module0314.NIL == f21171(var11)) {
            f21172(var11);
            try {
                module0313.f21153(var11);
                final SubLObject var12 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0314.T);
                    f21201(var11);
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var12);
                }
            }
            finally {
                final SubLObject var13 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0314.T);
                    f21201(var11);
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var13);
                }
            }
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21201(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        final SubLObject var13 = module0145.$g1888$.currentBinding(var12);
        final SubLObject var14 = module0145.$g1891$.currentBinding(var12);
        final SubLObject var15 = module0145.$g1892$.currentBinding(var12);
        final SubLObject var16 = module0145.$g1905$.currentBinding(var12);
        try {
            module0145.$g1888$.bind(module0145.$g1911$.getDynamicValue(var12), var12);
            module0145.$g1891$.bind(module0145.$g1912$.getDynamicValue(var12), var12);
            module0145.$g1892$.bind(module0145.$g1913$.getDynamicValue(var12), var12);
            module0145.$g1905$.bind((SubLObject)module0314.NIL, var12);
            if (module0314.NIL == Errors.$ignore_mustsP$.getDynamicValue(var12) && module0314.NIL == module0313.f21138((SubLObject)module0314.$ic0$)) {
                Errors.error((SubLObject)module0314.$ic8$, (SubLObject)module0314.$ic0$);
            }
            final SubLObject var6_88 = module0145.$g1895$.currentBinding(var12);
            try {
                module0145.$g1895$.bind((SubLObject)module0314.$ic0$, var12);
                assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic5$) : module0314.$ic5$;
                final SubLObject var6_89 = module0145.$g1904$.currentBinding(var12);
                try {
                    module0145.$g1904$.bind((SubLObject)module0314.$ic5$, var12);
                    f21168(var11, (SubLObject)module0314.UNPROVIDED);
                }
                finally {
                    module0145.$g1904$.rebind(var6_89, var12);
                }
            }
            finally {
                module0145.$g1895$.rebind(var6_88, var12);
            }
        }
        finally {
            module0145.$g1905$.rebind(var16, var12);
            module0145.$g1892$.rebind(var15, var12);
            module0145.$g1891$.rebind(var14, var12);
            module0145.$g1888$.rebind(var13, var12);
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21203(final SubLObject var4, final SubLObject var35) {
        final SubLThread var36 = SubLProcess.currentSubLThread();
        SubLObject var37 = (SubLObject)module0314.NIL;
        if (var35.equal(var4)) {
            if (module0314.NIL != module0313.f21140()) {
                var37 = (SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)ConsesLow.list(module0314.$ic26$, var35, var4), (SubLObject)module0314.$ic27$));
            }
        }
        else {
            final SubLObject var38 = module0145.$g1902$.currentBinding(var36);
            final SubLObject var39 = module0145.$g1899$.currentBinding(var36);
            try {
                module0145.$g1902$.bind((SubLObject)module0314.NIL, var36);
                module0145.$g1899$.bind((SubLObject)module0314.NIL, var36);
                final SubLObject var6_90 = module0145.$g1901$.currentBinding(var36);
                try {
                    module0145.$g1901$.bind(var35, var36);
                    assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.EQL) : module0314.EQL;
                    final SubLObject var6_91 = module0145.$g1909$.currentBinding(var36);
                    try {
                        module0145.$g1909$.bind((SubLObject)module0314.EQL, var36);
                        assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic10$) : module0314.$ic10$;
                        final SubLObject var6_92 = module0145.$g1905$.currentBinding(var36);
                        try {
                            module0145.$g1905$.bind((SubLObject)module0314.$ic10$, var36);
                            try {
                                assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic28$) : module0314.$ic28$;
                                final SubLObject var6_93 = module0145.$g1904$.currentBinding(var36);
                                try {
                                    module0145.$g1904$.bind((SubLObject)module0314.$ic28$, var36);
                                    f21168(var4, (SubLObject)module0314.UNPROVIDED);
                                }
                                finally {
                                    module0145.$g1904$.rebind(var6_93, var36);
                                }
                            }
                            finally {
                                final SubLObject var6_94 = Threads.$is_thread_performing_cleanupP$.currentBinding(var36);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0314.T, var36);
                                    Hashtables.clrhash(module0145.$g1924$.getDynamicValue(var36));
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var6_94, var36);
                                }
                            }
                        }
                        finally {
                            module0145.$g1905$.rebind(var6_92, var36);
                        }
                    }
                    finally {
                        module0145.$g1909$.rebind(var6_91, var36);
                    }
                }
                finally {
                    module0145.$g1901$.rebind(var6_90, var36);
                }
                var37 = module0145.$g1902$.getDynamicValue(var36);
            }
            finally {
                module0145.$g1899$.rebind(var39, var36);
                module0145.$g1902$.rebind(var38, var36);
            }
        }
        return var37;
    }
    
    public static SubLObject f21204(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        final SubLObject var13 = module0145.f9471();
        if (module0314.NIL != module0313.f21156(var11, module0145.$g1901$.getDynamicValue(var12))) {
            module0145.$g1902$.setDynamicValue((SubLObject)ConsesLow.cons(var13, module0145.$g1902$.getDynamicValue(var12)), var12);
            f21182((SubLObject)module0314.UNPROVIDED);
        }
        else if (module0314.NIL != module0313.f21137(var11) && module0314.NIL == module0145.$g1902$.getDynamicValue(var12) && module0314.NIL == f21171(var11)) {
            f21172(var11);
            module0313.f21153(var11);
            if (module0314.NIL != module0145.$g1902$.getDynamicValue(var12)) {
                module0145.$g1902$.setDynamicValue((SubLObject)ConsesLow.cons(var13, module0145.$g1902$.getDynamicValue(var12)), var12);
            }
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21205(final SubLObject var4, final SubLObject var35) {
        final SubLThread var36 = SubLProcess.currentSubLThread();
        SubLObject var37 = (SubLObject)module0314.NIL;
        if (var35.equal(var4)) {
            if (module0314.NIL != module0313.f21140()) {
                var37 = (SubLObject)ConsesLow.list(var4);
            }
        }
        else {
            final SubLObject var38 = module0145.$g1902$.currentBinding(var36);
            final SubLObject var39 = module0145.$g1899$.currentBinding(var36);
            try {
                module0145.$g1902$.bind((SubLObject)module0314.NIL, var36);
                module0145.$g1899$.bind((SubLObject)module0314.NIL, var36);
                final SubLObject var6_96 = module0145.$g1901$.currentBinding(var36);
                try {
                    module0145.$g1901$.bind(var35, var36);
                    assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.EQL) : module0314.EQL;
                    final SubLObject var6_97 = module0145.$g1909$.currentBinding(var36);
                    try {
                        module0145.$g1909$.bind((SubLObject)module0314.EQL, var36);
                        assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic10$) : module0314.$ic10$;
                        final SubLObject var6_98 = module0145.$g1905$.currentBinding(var36);
                        try {
                            module0145.$g1905$.bind((SubLObject)module0314.$ic10$, var36);
                            try {
                                assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic29$) : module0314.$ic29$;
                                final SubLObject var6_99 = module0145.$g1904$.currentBinding(var36);
                                try {
                                    module0145.$g1904$.bind((SubLObject)module0314.$ic29$, var36);
                                    f21168(var4, (SubLObject)module0314.UNPROVIDED);
                                }
                                finally {
                                    module0145.$g1904$.rebind(var6_99, var36);
                                }
                            }
                            finally {
                                final SubLObject var6_100 = Threads.$is_thread_performing_cleanupP$.currentBinding(var36);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0314.T, var36);
                                    Hashtables.clrhash(module0145.$g1924$.getDynamicValue(var36));
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var6_100, var36);
                                }
                            }
                        }
                        finally {
                            module0145.$g1905$.rebind(var6_98, var36);
                        }
                    }
                    finally {
                        module0145.$g1909$.rebind(var6_97, var36);
                    }
                }
                finally {
                    module0145.$g1901$.rebind(var6_96, var36);
                }
                var37 = module0145.$g1902$.getDynamicValue(var36);
            }
            finally {
                module0145.$g1899$.rebind(var39, var36);
                module0145.$g1902$.rebind(var38, var36);
            }
        }
        return var37;
    }
    
    public static SubLObject f21206(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        if (module0314.NIL != module0313.f21156(var11, module0145.$g1901$.getDynamicValue(var12))) {
            module0145.$g1902$.setDynamicValue((SubLObject)ConsesLow.cons(var11, module0145.$g1902$.getDynamicValue(var12)), var12);
            f21182((SubLObject)module0314.UNPROVIDED);
        }
        else if (module0314.NIL != module0313.f21137(var11) && module0314.NIL == module0145.$g1902$.getDynamicValue(var12) && module0314.NIL == f21171(var11)) {
            f21172(var11);
            module0313.f21153(var11);
            if (module0314.NIL != module0145.$g1902$.getDynamicValue(var12)) {
                module0145.$g1902$.setDynamicValue((SubLObject)ConsesLow.cons(var11, module0145.$g1902$.getDynamicValue(var12)), var12);
            }
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21207(final SubLObject var101, final SubLObject var102) {
        final SubLThread var103 = SubLProcess.currentSubLThread();
        SubLObject var104 = (SubLObject)module0314.NIL;
        final SubLObject var105 = module0147.$g2094$.currentBinding(var103);
        final SubLObject var106 = module0147.$g2095$.currentBinding(var103);
        try {
            module0147.$g2094$.bind((SubLObject)module0314.$ic30$, var103);
            module0147.$g2095$.bind(module0314.$ic31$, var103);
            var104 = module0315.f21304(var102, var101, (SubLObject)module0314.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var106, var103);
            module0147.$g2094$.rebind(var105, var103);
        }
        if (var104.equal((SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)ConsesLow.list(module0314.$ic26$, var102, var101), (SubLObject)module0314.$ic27$)))) {
            return module0259.f16933(module0145.$g1888$.getDynamicValue(var103), module0314.$ic32$, (SubLObject)module0314.UNPROVIDED);
        }
        SubLObject var107 = (SubLObject)module0314.NIL;
        SubLObject var108 = var104;
        SubLObject var109 = (SubLObject)module0314.NIL;
        var109 = var108.first();
        while (module0314.NIL != var108) {
            if (module0314.NIL != module0210.f13566(var109)) {
                var107 = (SubLObject)ConsesLow.cons(module0178.f11287(var109), var107);
            }
            var108 = var108.rest();
            var109 = var108.first();
        }
        if (module0314.NIL != var107) {
            var107 = module0262.f17364(module0035.f2272(var107), (SubLObject)module0314.UNPROVIDED);
            return (SubLObject)ConsesLow.list(var107);
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21208(final SubLObject var105, final SubLObject var106) {
        SubLObject var107 = var105;
        SubLObject var108 = (SubLObject)module0314.NIL;
        SubLObject var109 = (SubLObject)module0314.NIL;
        if (module0314.NIL != var107) {
            if (var107.isAtom()) {
                var107 = (SubLObject)ConsesLow.list(var107);
            }
            SubLObject var110 = var107;
            SubLObject var111 = (SubLObject)module0314.NIL;
            var111 = var110.first();
            while (module0314.NIL != var110) {
                var108 = (SubLObject)ConsesLow.list(var111, var106);
                var109 = (SubLObject)ConsesLow.cons(module0315.f21330(module0314.$ic33$, module0315.f21321(module0314.$ic33$, var108, (SubLObject)module0314.UNPROVIDED), (SubLObject)module0314.UNPROVIDED, (SubLObject)module0314.UNPROVIDED), var109);
                var110 = var110.rest();
                var111 = var110.first();
            }
        }
        else {
            var109 = var106;
        }
        return module0035.f2119(var109);
    }
    
    public static SubLObject f21209(final SubLObject var110) {
        final SubLThread var111 = SubLProcess.currentSubLThread();
        final SubLObject var112 = module0145.$g1921$.getDynamicValue(var111).first();
        final SubLObject var113 = f21171(var110);
        final SubLObject var114 = f21171(var112);
        final SubLObject var115 = module0145.f9472();
        final SubLObject var116 = module0145.$g1921$.currentBinding(var111);
        try {
            module0145.$g1921$.bind(module0145.$g1921$.getDynamicValue(var111), var111);
            SubLObject var117 = (SubLObject)module0314.NIL;
            if (module0314.NIL == module0004.f104(var110, module0145.$g1921$.getDynamicValue(var111), (SubLObject)module0314.UNPROVIDED, (SubLObject)module0314.UNPROVIDED)) {
                module0145.$g1921$.setDynamicValue((SubLObject)ConsesLow.cons(var110, module0145.$g1921$.getDynamicValue(var111)), var111);
                final SubLObject var6_115 = module0145.$g1925$.currentBinding(var111);
                SubLObject var118 = module0145.$g1924$.currentBinding(var111);
                try {
                    module0145.$g1925$.bind(module0145.$g1924$.getDynamicValue(var111), var111);
                    module0145.$g1924$.bind((SubLObject)module0314.NIL, var111);
                    module0145.$g1924$.setDynamicValue(Hashtables.make_hash_table((SubLObject)module0314.$ic15$, (SubLObject)module0314.UNPROVIDED, (SubLObject)module0314.UNPROVIDED), var111);
                    var117 = f21208(var114, var115);
                }
                finally {
                    module0145.$g1924$.rebind(var118, var111);
                    module0145.$g1925$.rebind(var6_115, var111);
                }
                if (module0314.NIL != var113) {
                    final SubLObject var6_116 = module0145.$g1925$.currentBinding(var111);
                    var118 = module0145.$g1924$.currentBinding(var111);
                    try {
                        module0145.$g1925$.bind(module0145.$g1924$.getDynamicValue(var111), var111);
                        module0145.$g1924$.bind((SubLObject)module0314.NIL, var111);
                        module0145.$g1924$.setDynamicValue(Hashtables.make_hash_table((SubLObject)module0314.$ic15$, (SubLObject)module0314.UNPROVIDED, (SubLObject)module0314.UNPROVIDED), var111);
                        var117 = module0315.f21322(module0314.$ic33$, ConsesLow.append(var113, var117), (SubLObject)module0314.UNPROVIDED, (SubLObject)module0314.UNPROVIDED);
                    }
                    finally {
                        module0145.$g1924$.rebind(var118, var111);
                        module0145.$g1925$.rebind(var6_116, var111);
                    }
                    if (module0314.NIL == module0035.f2201(var113, var117, (SubLObject)module0314.UNPROVIDED)) {
                        f21210(var110, var117);
                        module0313.f21153(var110);
                    }
                }
                else {
                    f21210(var110, var117);
                    module0313.f21153(var110);
                }
            }
        }
        finally {
            module0145.$g1921$.rebind(var116, var111);
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21211(final SubLObject var11) {
        final SubLObject var12 = f21171(var11);
        if (module0314.NIL != var12) {
            f21169((SubLObject)ConsesLow.cons(var11, var12));
            f21195(var11);
            module0313.f21153(var11);
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21212(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        assert module0314.NIL != module0130.f8511((SubLObject)module0314.$ic34$) : module0314.$ic34$;
        final SubLObject var13 = module0145.$g1897$.currentBinding(var12);
        try {
            module0145.$g1897$.bind((SubLObject)module0314.$ic34$, var12);
            assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic10$) : module0314.$ic10$;
            final SubLObject var6_117 = module0145.$g1905$.currentBinding(var12);
            try {
                module0145.$g1905$.bind((SubLObject)module0314.$ic10$, var12);
                assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic36$) : module0314.$ic36$;
                final SubLObject var6_118 = module0145.$g1904$.currentBinding(var12);
                try {
                    module0145.$g1904$.bind((SubLObject)module0314.$ic36$, var12);
                    f21168(var11, (SubLObject)module0314.UNPROVIDED);
                }
                finally {
                    module0145.$g1904$.rebind(var6_118, var12);
                }
            }
            finally {
                module0145.$g1905$.rebind(var6_117, var12);
            }
        }
        finally {
            module0145.$g1897$.rebind(var13, var12);
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21213(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)module0314.NIL;
        final SubLObject var7 = module0145.$g1921$.currentBinding(var5);
        final SubLObject var8 = module0145.$g1902$.currentBinding(var5);
        try {
            module0145.$g1921$.bind((SubLObject)module0314.NIL, var5);
            module0145.$g1902$.bind((SubLObject)module0314.NIL, var5);
            module0145.$g1921$.setDynamicValue((SubLObject)ConsesLow.cons(var4, module0145.$g1921$.getDynamicValue(var5)), var5);
            assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic10$) : module0314.$ic10$;
            final SubLObject var6_119 = module0145.$g1905$.currentBinding(var5);
            try {
                module0145.$g1905$.bind((SubLObject)module0314.$ic10$, var5);
                assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic37$) : module0314.$ic37$;
                final SubLObject var6_120 = module0145.$g1904$.currentBinding(var5);
                try {
                    module0145.$g1904$.bind((SubLObject)module0314.$ic37$, var5);
                    f21168(var4, (SubLObject)module0314.UNPROVIDED);
                }
                finally {
                    module0145.$g1904$.rebind(var6_120, var5);
                }
            }
            finally {
                module0145.$g1905$.rebind(var6_119, var5);
            }
            f21212(var4);
            var6 = module0145.$g1902$.getDynamicValue(var5);
        }
        finally {
            module0145.$g1902$.rebind(var8, var5);
            module0145.$g1921$.rebind(var7, var5);
        }
        return var6;
    }
    
    public static SubLObject f21214(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        final SubLObject var13 = module0145.f9471();
        final SubLObject var14 = (SubLObject)ConsesLow.list(module0178.f11334(var13), module0178.f11335(var13));
        final SubLObject var15 = f21171(var11);
        final SubLObject var16 = module0145.$g1936$.currentBinding(var12);
        final SubLObject var17 = module0145.$g1921$.currentBinding(var12);
        try {
            module0145.$g1936$.bind((SubLObject)ConsesLow.cons(var14, module0145.$g1936$.getDynamicValue(var12)), var12);
            module0145.$g1921$.bind(module0145.$g1921$.getDynamicValue(var12), var12);
            if (var11.equalp(module0145.$g1935$.getDynamicValue(var12))) {
                module0145.$g1902$.setDynamicValue(ConsesLow.append(module0145.$g1936$.getDynamicValue(var12), module0145.$g1902$.getDynamicValue(var12)), var12);
                SubLObject var18 = module0145.$g1936$.getDynamicValue(var12);
                SubLObject var121_123 = (SubLObject)module0314.NIL;
                var121_123 = var18.first();
                while (module0314.NIL != var18) {
                    f21210(var121_123.first(), (SubLObject)module0314.TWO_INTEGER);
                    var18 = var18.rest();
                    var121_123 = var18.first();
                }
                module0145.$g1936$.setDynamicValue((SubLObject)module0314.NIL, var12);
            }
            else {
                final SubLObject var19 = var15;
                if (var19.eql((SubLObject)module0314.$ic38$) || var19.eql((SubLObject)module0314.NIL)) {
                    f21210(var11, (SubLObject)module0314.ONE_INTEGER);
                    module0145.$g1921$.setDynamicValue((SubLObject)ConsesLow.cons(var11, module0145.$g1921$.getDynamicValue(var12)), var12);
                    module0313.f21153(var11);
                }
                else if (var19.eql((SubLObject)module0314.ONE_INTEGER)) {
                    if (module0314.NIL != module0004.f104(var11, module0145.$g1921$.getDynamicValue(var12), (SubLObject)module0314.UNPROVIDED, (SubLObject)module0314.UNPROVIDED)) {
                        module0145.$g1939$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var11, module0145.$g1936$.getDynamicValue(var12)), module0145.$g1939$.getDynamicValue(var12)), var12);
                    }
                }
                else if (var19.eql((SubLObject)module0314.TWO_INTEGER)) {
                    module0145.$g1902$.setDynamicValue(ConsesLow.append(module0145.$g1936$.getDynamicValue(var12), module0145.$g1902$.getDynamicValue(var12)), var12);
                    SubLObject var20 = module0145.$g1936$.getDynamicValue(var12);
                    SubLObject var121_124 = (SubLObject)module0314.NIL;
                    var121_124 = var20.first();
                    while (module0314.NIL != var20) {
                        f21210(var121_124.first(), (SubLObject)module0314.TWO_INTEGER);
                        var20 = var20.rest();
                        var121_124 = var20.first();
                    }
                    module0145.$g1936$.setDynamicValue((SubLObject)module0314.NIL, var12);
                }
            }
        }
        finally {
            module0145.$g1921$.rebind(var17, var12);
            module0145.$g1936$.rebind(var16, var12);
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21215() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = module0145.$g1939$.getDynamicValue(var1);
        SubLObject var3 = (SubLObject)module0314.NIL;
        var3 = var2.first();
        while (module0314.NIL != var2) {
            if (f21171(var3.first()).eql((SubLObject)module0314.TWO_INTEGER)) {
                module0145.$g1902$.setDynamicValue(ConsesLow.append(conses_high.cadr(var3), module0145.$g1902$.getDynamicValue(var1)), var1);
            }
            var2 = var2.rest();
            var3 = var2.first();
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21216(final SubLObject var126) {
        final SubLThread var127 = SubLProcess.currentSubLThread();
        SubLObject var128 = (SubLObject)module0314.NIL;
        final SubLObject var129 = module0145.$g1902$.currentBinding(var127);
        final SubLObject var130 = module0145.$g1939$.currentBinding(var127);
        try {
            module0145.$g1902$.bind((SubLObject)module0314.NIL, var127);
            module0145.$g1939$.bind((SubLObject)module0314.NIL, var127);
            assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic10$) : module0314.$ic10$;
            final SubLObject var6_127 = module0145.$g1905$.currentBinding(var127);
            try {
                module0145.$g1905$.bind((SubLObject)module0314.$ic10$, var127);
                assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic39$) : module0314.$ic39$;
                final SubLObject var6_128 = module0145.$g1904$.currentBinding(var127);
                try {
                    module0145.$g1904$.bind((SubLObject)module0314.$ic39$, var127);
                    f21168(var126, (SubLObject)module0314.UNPROVIDED);
                }
                finally {
                    module0145.$g1904$.rebind(var6_128, var127);
                }
            }
            finally {
                module0145.$g1905$.rebind(var6_127, var127);
            }
            f21215();
            var128 = module0145.$g1902$.getDynamicValue(var127);
        }
        finally {
            module0145.$g1939$.rebind(var130, var127);
            module0145.$g1902$.rebind(var129, var127);
        }
        return var128;
    }
    
    public static SubLObject f21217(final SubLObject var126) {
        final SubLThread var127 = SubLProcess.currentSubLThread();
        SubLObject var128 = (SubLObject)module0314.NIL;
        final SubLObject var129 = module0145.$g1902$.currentBinding(var127);
        try {
            module0145.$g1902$.bind((SubLObject)module0314.NIL, var127);
            assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic40$) : module0314.$ic40$;
            final SubLObject var6_129 = module0145.$g1905$.currentBinding(var127);
            try {
                module0145.$g1905$.bind((SubLObject)module0314.$ic40$, var127);
                assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic41$) : module0314.$ic41$;
                final SubLObject var6_130 = module0145.$g1904$.currentBinding(var127);
                try {
                    module0145.$g1904$.bind((SubLObject)module0314.$ic41$, var127);
                    f21218(var126, (SubLObject)module0314.UNPROVIDED);
                }
                finally {
                    module0145.$g1904$.rebind(var6_130, var127);
                }
            }
            finally {
                module0145.$g1905$.rebind(var6_129, var127);
            }
            var128 = module0145.$g1902$.getDynamicValue(var127);
        }
        finally {
            module0145.$g1902$.rebind(var129, var127);
        }
        return var128;
    }
    
    public static SubLObject f21219(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        final SubLObject var13 = module0145.f9471();
        final SubLObject var14 = module0145.$g1938$.currentBinding(var12);
        try {
            module0145.$g1938$.bind((SubLObject)ConsesLow.cons(var13, module0145.$g1938$.getDynamicValue(var12)), var12);
            if (var11.equalp(module0145.$g1935$.getDynamicValue(var12))) {
                SubLObject var15 = module0145.$g1938$.getDynamicValue(var12);
                SubLObject var2_131 = (SubLObject)module0314.NIL;
                var2_131 = var15.first();
                while (module0314.NIL != var15) {
                    f21195(module0178.f11335(var2_131));
                    var15 = var15.rest();
                    var2_131 = var15.first();
                }
                module0145.$g1902$.setDynamicValue((SubLObject)ConsesLow.cons(module0145.$g1938$.getDynamicValue(var12), module0145.$g1902$.getDynamicValue(var12)), var12);
            }
            else if (module0314.NIL == f21171(var11)) {
                f21172(var11);
                module0313.f21153(var11);
            }
        }
        finally {
            module0145.$g1938$.rebind(var14, var12);
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21220(final SubLObject var126) {
        final SubLThread var127 = SubLProcess.currentSubLThread();
        SubLObject var128 = (SubLObject)module0314.NIL;
        final SubLObject var129 = module0145.$g1902$.currentBinding(var127);
        try {
            module0145.$g1902$.bind((SubLObject)module0314.NIL, var127);
            assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic40$) : module0314.$ic40$;
            final SubLObject var6_132 = module0145.$g1905$.currentBinding(var127);
            try {
                module0145.$g1905$.bind((SubLObject)module0314.$ic40$, var127);
                assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic42$) : module0314.$ic42$;
                final SubLObject var6_133 = module0145.$g1904$.currentBinding(var127);
                try {
                    module0145.$g1904$.bind((SubLObject)module0314.$ic42$, var127);
                    f21218(var126, (SubLObject)module0314.UNPROVIDED);
                }
                finally {
                    module0145.$g1904$.rebind(var6_133, var127);
                }
            }
            finally {
                module0145.$g1905$.rebind(var6_132, var127);
            }
            var128 = module0145.$g1902$.getDynamicValue(var127);
        }
        finally {
            module0145.$g1902$.rebind(var129, var127);
        }
        return var128;
    }
    
    public static SubLObject f21218(final SubLObject var4, SubLObject var134) {
        if (var134 == module0314.UNPROVIDED) {
            var134 = module0145.$g1904$.getDynamicValue();
        }
        final SubLThread var135 = SubLProcess.currentSubLThread();
        final SubLObject var136 = module0145.$g1894$.getDynamicValue(var135);
        if (var136.eql((SubLObject)module0314.$ic43$)) {
            f21221(var4, var134);
        }
        else {
            module0313.f21151((SubLObject)module0314.THREE_INTEGER, (SubLObject)module0314.$ic44$, module0145.$g1894$.getDynamicValue(var135), (SubLObject)module0314.UNPROVIDED, (SubLObject)module0314.UNPROVIDED, (SubLObject)module0314.UNPROVIDED, (SubLObject)module0314.UNPROVIDED);
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21222(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        final SubLObject var13 = module0145.f9472();
        final SubLObject var14 = module0145.f9473();
        SubLObject var15 = (SubLObject)module0314.NIL;
        SubLObject var16 = (SubLObject)module0314.NIL;
        SubLObject var17 = (SubLObject)module0314.NIL;
        final SubLObject var18 = module0145.$g1922$.currentBinding(var12);
        final SubLObject var19 = module0145.$g1923$.currentBinding(var12);
        final SubLObject var20 = module0145.$g1921$.currentBinding(var12);
        final SubLObject var21 = module0145.$g1920$.currentBinding(var12);
        try {
            module0145.$g1922$.bind(module0145.$g1922$.getDynamicValue(var12), var12);
            module0145.$g1923$.bind(module0145.$g1923$.getDynamicValue(var12), var12);
            module0145.$g1921$.bind(module0145.$g1921$.getDynamicValue(var12), var12);
            module0145.$g1920$.bind(module0145.$g1920$.getDynamicValue(var12), var12);
            if (!var14.eql(module0145.$g1888$.getDynamicValue(var12))) {
                var15 = ((module0314.NIL != module0260.f17089(var14, module0145.$g1888$.getDynamicValue(var12), (SubLObject)module0314.UNPROVIDED, (SubLObject)module0314.UNPROVIDED)) ? module0260.f17139(var14, module0145.$g1888$.getDynamicValue(var12)).first() : module0260.f17144(var14, module0145.$g1888$.getDynamicValue(var12), (SubLObject)module0314.UNPROVIDED).first());
            }
            f21223(var13);
            if (module0314.NIL != var15) {
                f21223(var15);
            }
            var16 = f21171(var11);
            var17 = module0145.$g1920$.getDynamicValue(var12);
            if (var11.equalp(module0145.$g1919$.getDynamicValue(var12))) {
                f21224(module0145.$g1920$.getDynamicValue(var12));
            }
            else if (module0314.NIL == module0004.f104(var11, module0145.$g1921$.getDynamicValue(var12), (SubLObject)module0314.$ic45$, (SubLObject)module0314.UNPROVIDED) && module0314.NIL == f21225(var17, var16)) {
                f21226(var11, var17);
                module0145.$g1921$.setDynamicValue((SubLObject)ConsesLow.cons(var11, module0145.$g1921$.getDynamicValue(var12)), var12);
                module0145.$g1923$.setDynamicValue((SubLObject)ConsesLow.cons(module0145.$g1922$.getDynamicValue(var12), module0145.$g1923$.getDynamicValue(var12)), var12);
                module0313.f21153(var11);
            }
        }
        finally {
            module0145.$g1920$.rebind(var21, var12);
            module0145.$g1921$.rebind(var20, var12);
            module0145.$g1923$.rebind(var19, var12);
            module0145.$g1922$.rebind(var18, var12);
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21224(final SubLObject var140) {
        final SubLThread var141 = SubLProcess.currentSubLThread();
        final SubLObject var142 = module0349.f23437(var140, (SubLObject)module0314.UNPROVIDED);
        if (module0314.NIL != var142) {
            module0145.$g1918$.setDynamicValue(ConsesLow.append(module0145.$g1918$.getDynamicValue(var141), var142), var141);
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21225(final SubLObject var141, final SubLObject var142) {
        final SubLThread var143 = SubLProcess.currentSubLThread();
        SubLObject var144 = (SubLObject)module0314.NIL;
        SubLObject var145 = (SubLObject)module0314.NIL;
        SubLObject var146 = var142;
        if (module0314.NIL == var144) {
            SubLObject var147 = module0145.$g1923$.getDynamicValue(var143);
            SubLObject var148 = (SubLObject)module0314.NIL;
            var148 = var147.first();
            while (module0314.NIL == var144 && module0314.NIL != var147) {
                if (var148.eql(module0145.$g1922$.getDynamicValue(var143)) && module0314.NIL != f21227(var141, var146.first())) {
                    var145 = (SubLObject)module0314.T;
                    var144 = (SubLObject)module0314.T;
                }
                else {
                    var146 = var146.rest();
                }
                var147 = var147.rest();
                var148 = var147.first();
            }
        }
        return var145;
    }
    
    public static SubLObject f21227(final SubLObject var147, final SubLObject var148) {
        SubLObject var149 = (SubLObject)module0314.NIL;
        final SubLObject var150 = Hashtables.make_hash_table((SubLObject)module0314.$ic46$, (SubLObject)module0314.UNPROVIDED, (SubLObject)module0314.UNPROVIDED);
        SubLObject var151 = (SubLObject)module0314.T;
        if (module0314.NIL == var148 && module0314.NIL != var147) {
            var151 = (SubLObject)module0314.NIL;
        }
        SubLObject var152 = var147;
        SubLObject var153 = (SubLObject)module0314.NIL;
        var153 = var152.first();
        while (module0314.NIL != var152) {
            f21228(var153, (SubLObject)module0314.T, var150);
            var152 = var152.rest();
            var153 = var152.first();
        }
        if (module0314.NIL == var149) {
            SubLObject var154 = var148;
            var153 = (SubLObject)module0314.NIL;
            var153 = var154.first();
            while (module0314.NIL == var149 && module0314.NIL != var154) {
                if (module0314.NIL == f21197(var153, var150)) {
                    var151 = (SubLObject)module0314.NIL;
                    var149 = (SubLObject)module0314.T;
                }
                var154 = var154.rest();
                var153 = var154.first();
            }
        }
        return var151;
    }
    
    public static SubLObject f21223(final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0004.f104(var13, module0145.$g1920$.getDynamicValue(var14), (SubLObject)module0314.$ic45$, (SubLObject)module0314.UNPROVIDED);
        if (module0314.NIL == var15) {
            module0145.$g1920$.setDynamicValue((SubLObject)ConsesLow.cons(var13, module0145.$g1920$.getDynamicValue(var14)), var14);
            module0145.$g1922$.setDynamicValue(Numbers.add(module0145.$g1922$.getDynamicValue(var14), (SubLObject)module0314.ONE_INTEGER), var14);
        }
        return var15;
    }
    
    public static SubLObject f21182(SubLObject var5) {
        if (var5 == module0314.UNPROVIDED) {
            var5 = (SubLObject)module0314.NIL;
        }
        if (module0314.NIL != var5) {
            module0145.$g1902$.setDynamicValue(var5);
        }
        module0012.f425();
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21168(final SubLObject var4, SubLObject var134) {
        if (var134 == module0314.UNPROVIDED) {
            var134 = module0145.$g1904$.getDynamicValue();
        }
        final SubLThread var135 = SubLProcess.currentSubLThread();
        SubLObject var136 = (SubLObject)module0314.NIL;
        final SubLObject var137 = module0153.$g2135$.currentBinding(var135);
        final SubLObject var138 = module0145.$g1926$.currentBinding(var135);
        try {
            module0153.$g2135$.bind((SubLObject)(module0153.$g2135$.getDynamicValue(var135).isInteger() ? Numbers.subtract(module0153.$g2135$.getDynamicValue(var135), (SubLObject)module0314.ONE_INTEGER) : module0314.NIL), var135);
            module0145.$g1926$.bind(Numbers.subtract(module0145.$g1926$.getDynamicValue(var135), (SubLObject)module0314.ONE_INTEGER), var135);
            if (module0153.$g2135$.getDynamicValue(var135).isInteger() && module0153.$g2135$.getDynamicValue(var135).numL((SubLObject)module0314.ZERO_INTEGER)) {
                Errors.error((SubLObject)module0314.$ic47$);
            }
            if (module0314.NIL != module0145.$g1927$.getDynamicValue(var135) && module0145.$g1926$.getDynamicValue(var135).numL((SubLObject)module0314.ZERO_INTEGER)) {
                var136 = (SubLObject)module0314.T;
            }
            if (module0314.NIL != module0145.$g1929$.getDynamicValue(var135) && module0145.$g1930$.getDynamicValue(var135).numL(Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), module0145.$g1931$.getDynamicValue(var135)), time_high.$internal_time_units_per_second$.getGlobalValue()))) {
                var136 = (SubLObject)module0314.T;
            }
            if (module0314.NIL == var136) {
                final SubLObject var139 = module0145.$g1894$.getDynamicValue(var135);
                if (var139.eql((SubLObject)module0314.$ic43$)) {
                    f21221(var4, var134);
                }
                else if (var139.eql((SubLObject)module0314.$ic48$)) {
                    f21229(var4, var134);
                }
                else {
                    module0313.f21151((SubLObject)module0314.THREE_INTEGER, (SubLObject)module0314.$ic44$, module0145.$g1894$.getDynamicValue(var135), (SubLObject)module0314.UNPROVIDED, (SubLObject)module0314.UNPROVIDED, (SubLObject)module0314.UNPROVIDED, (SubLObject)module0314.UNPROVIDED);
                }
            }
        }
        finally {
            module0145.$g1926$.rebind(var138, var135);
            module0153.$g2135$.rebind(var137, var135);
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21221(final SubLObject var4, final SubLObject var134) {
        final SubLThread var135 = SubLProcess.currentSubLThread();
        final SubLObject var136 = module0221.$g2399$.currentBinding(var135);
        try {
            module0221.$g2399$.bind((SubLObject)module0314.NIL, var135);
            final SubLObject var137 = module0145.$g1895$.getDynamicValue(var135);
            if (var137.eql((SubLObject)module0314.$ic0$)) {
                f21230(var134, var4, module0145.$g1891$.getDynamicValue(var135), module0145.$g1888$.getDynamicValue(var135), module0145.$g1897$.getDynamicValue(var135));
            }
            else if (var137.eql((SubLObject)module0314.$ic3$)) {
                f21230(var134, var4, module0145.$g1892$.getDynamicValue(var135), module0145.$g1888$.getDynamicValue(var135), module0145.$g1897$.getDynamicValue(var135));
            }
            else if (var137.eql((SubLObject)module0314.$ic1$)) {
                f21230(var134, var4, module0145.$g1891$.getDynamicValue(var135), module0145.$g1888$.getDynamicValue(var135), module0145.$g1897$.getDynamicValue(var135));
            }
            else if (var137.eql((SubLObject)module0314.$ic2$)) {
                f21230(var134, var4, module0145.$g1892$.getDynamicValue(var135), module0145.$g1888$.getDynamicValue(var135), module0145.$g1897$.getDynamicValue(var135));
            }
            else if (var137.eql((SubLObject)module0314.$ic49$)) {
                if (module0314.NIL == Errors.$ignore_mustsP$.getDynamicValue(var135) && module0314.NIL == module0313.f21138((SubLObject)module0314.$ic1$)) {
                    Errors.error((SubLObject)module0314.$ic8$, (SubLObject)module0314.$ic1$);
                }
                final SubLObject var6_151 = module0145.$g1895$.currentBinding(var135);
                try {
                    module0145.$g1895$.bind((SubLObject)module0314.$ic1$, var135);
                    f21230(var134, var4, module0145.$g1891$.getDynamicValue(var135), module0145.$g1888$.getDynamicValue(var135), module0145.$g1897$.getDynamicValue(var135));
                }
                finally {
                    module0145.$g1895$.rebind(var6_151, var135);
                }
                Hashtables.clrhash(module0145.$g1924$.getDynamicValue(var135));
                if (module0314.NIL == Errors.$ignore_mustsP$.getDynamicValue(var135) && module0314.NIL == module0313.f21138((SubLObject)module0314.$ic2$)) {
                    Errors.error((SubLObject)module0314.$ic8$, (SubLObject)module0314.$ic2$);
                }
                final SubLObject var6_152 = module0145.$g1895$.currentBinding(var135);
                try {
                    module0145.$g1895$.bind((SubLObject)module0314.$ic2$, var135);
                    f21230(var134, var4, module0145.$g1892$.getDynamicValue(var135), module0145.$g1888$.getDynamicValue(var135), module0145.$g1897$.getDynamicValue(var135));
                }
                finally {
                    module0145.$g1895$.rebind(var6_152, var135);
                }
            }
            else {
                module0313.f21151((SubLObject)module0314.FIVE_INTEGER, (SubLObject)module0314.$ic4$, module0145.$g1895$.getDynamicValue(var135), (SubLObject)module0314.UNPROVIDED, (SubLObject)module0314.UNPROVIDED, (SubLObject)module0314.UNPROVIDED, (SubLObject)module0314.UNPROVIDED);
            }
        }
        finally {
            module0221.$g2399$.rebind(var136, var135);
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21229(final SubLObject var4, final SubLObject var134) {
        final SubLThread var135 = SubLProcess.currentSubLThread();
        SubLObject var136 = module0145.$g1893$.getDynamicValue(var135);
        SubLObject var137 = (SubLObject)module0314.NIL;
        var137 = var136.first();
        while (module0314.NIL != var136) {
            if (var137.isCons()) {
                SubLObject var139;
                final SubLObject var138 = var139 = var137;
                final SubLObject var140 = module0145.$g1888$.currentBinding(var135);
                final SubLObject var141 = module0145.$g1891$.currentBinding(var135);
                final SubLObject var142 = module0145.$g1892$.currentBinding(var135);
                try {
                    module0145.$g1888$.bind((SubLObject)module0314.NIL, var135);
                    module0145.$g1891$.bind((SubLObject)module0314.NIL, var135);
                    module0145.$g1892$.bind((SubLObject)module0314.NIL, var135);
                    cdestructuring_bind.destructuring_bind_must_consp(var139, var138, (SubLObject)module0314.$ic50$);
                    module0145.$g1888$.setDynamicValue(var139.first(), var135);
                    var139 = var139.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var139, var138, (SubLObject)module0314.$ic50$);
                    module0145.$g1891$.setDynamicValue(var139.first(), var135);
                    var139 = var139.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var139, var138, (SubLObject)module0314.$ic50$);
                    module0145.$g1892$.setDynamicValue(var139.first(), var135);
                    var139 = var139.rest();
                    if (module0314.NIL == var139) {
                        f21221(var4, var134);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var138, (SubLObject)module0314.$ic50$);
                    }
                }
                finally {
                    module0145.$g1892$.rebind(var142, var135);
                    module0145.$g1891$.rebind(var141, var135);
                    module0145.$g1888$.rebind(var140, var135);
                }
            }
            var136 = var136.rest();
            var137 = var136.first();
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21230(final SubLObject var156, final SubLObject var42, final SubLObject var157, final SubLObject var83, SubLObject var158) {
        if (var158 == module0314.UNPROVIDED) {
            var158 = (SubLObject)module0314.NIL;
        }
        final SubLThread var159 = SubLProcess.currentSubLThread();
        final SubLObject var160 = module0139.$g1630$.getDynamicValue(var159);
        final SubLObject var161 = module0139.$g1631$.currentBinding(var159);
        final SubLObject var162 = module0139.$g1632$.currentBinding(var159);
        final SubLObject var163 = module0139.$g1630$.currentBinding(var159);
        try {
            module0139.$g1631$.bind(module0139.f9015(var160, (SubLObject)module0314.SIX_INTEGER), var159);
            module0139.$g1632$.bind(module0139.f9016(var160), var159);
            module0139.$g1630$.bind((SubLObject)module0314.T, var159);
            if (module0314.NIL != module0145.$g1915$.getDynamicValue(var159)) {
                f21231(var156, var42, var157, var83);
            }
            else {
                f21232(var156, var42, var157, var83, var158);
            }
        }
        finally {
            module0139.$g1630$.rebind(var163, var159);
            module0139.$g1632$.rebind(var162, var159);
            module0139.$g1631$.rebind(var161, var159);
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21231(final SubLObject var156, final SubLObject var42, final SubLObject var157, final SubLObject var83) {
        final SubLThread var158 = SubLProcess.currentSubLThread();
        SubLObject var159 = (SubLObject)module0314.NIL;
        try {
            var158.throwStack.push(module0314.$ic51$);
            SubLObject var160 = module0148.$g2099$.currentBinding(var158);
            SubLObject var161 = module0148.$g2097$.currentBinding(var158);
            try {
                module0148.$g2099$.bind((SubLObject)module0314.$ic52$, var158);
                module0148.$g2097$.bind(var83, var158);
                final SubLObject var162 = (SubLObject)module0314.NIL;
                if (module0314.NIL != module0158.f10010(var42, var157, var162)) {
                    final SubLObject var163 = module0158.f10011(var42, var157, var162);
                    SubLObject var164 = (SubLObject)module0314.NIL;
                    final SubLObject var165 = (SubLObject)module0314.NIL;
                    while (module0314.NIL == var164) {
                        final SubLObject var166 = module0052.f3695(var163, var165);
                        final SubLObject var167 = (SubLObject)SubLObjectFactory.makeBoolean(!var165.eql(var166));
                        if (module0314.NIL != var167) {
                            SubLObject var168 = (SubLObject)module0314.NIL;
                            try {
                                var168 = module0158.f10316(var166, (SubLObject)module0314.$ic53$, (SubLObject)module0314.$ic34$, (SubLObject)module0314.NIL);
                                SubLObject var163_168 = (SubLObject)module0314.NIL;
                                final SubLObject var164_169 = (SubLObject)module0314.NIL;
                                while (module0314.NIL == var163_168) {
                                    final SubLObject var169 = module0052.f3695(var168, var164_169);
                                    final SubLObject var166_170 = (SubLObject)SubLObjectFactory.makeBoolean(!var164_169.eql(var169));
                                    if (module0314.NIL != var166_170) {
                                        final SubLObject var6_171 = module0145.$g1917$.currentBinding(var158);
                                        try {
                                            module0145.$g1917$.bind(var169, var158);
                                            final SubLObject var170 = f21165(var169);
                                            module0313.f21157(var156, var170);
                                        }
                                        finally {
                                            module0145.$g1917$.rebind(var6_171, var158);
                                        }
                                    }
                                    var163_168 = (SubLObject)SubLObjectFactory.makeBoolean(module0314.NIL == var166_170);
                                }
                            }
                            finally {
                                final SubLObject var6_172 = Threads.$is_thread_performing_cleanupP$.currentBinding(var158);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0314.T, var158);
                                    if (module0314.NIL != var168) {
                                        module0158.f10319(var168);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var6_172, var158);
                                }
                            }
                        }
                        var164 = (SubLObject)SubLObjectFactory.makeBoolean(module0314.NIL == var167);
                    }
                }
            }
            finally {
                module0148.$g2097$.rebind(var161, var158);
                module0148.$g2099$.rebind(var160, var158);
            }
            if (module0314.NIL != module0221.f14609(var83)) {
                var160 = module0148.$g2099$.currentBinding(var158);
                var161 = module0148.$g2097$.currentBinding(var158);
                try {
                    module0148.$g2099$.bind((SubLObject)module0314.$ic54$, var158);
                    module0148.$g2097$.bind(var83, var158);
                    final SubLObject var162 = (SubLObject)module0314.NIL;
                    if (module0314.NIL != module0158.f10010(var42, module0225.f14782(var157), var162)) {
                        final SubLObject var163 = module0158.f10011(var42, module0225.f14782(var157), var162);
                        SubLObject var164 = (SubLObject)module0314.NIL;
                        final SubLObject var165 = (SubLObject)module0314.NIL;
                        while (module0314.NIL == var164) {
                            final SubLObject var166 = module0052.f3695(var163, var165);
                            final SubLObject var167 = (SubLObject)SubLObjectFactory.makeBoolean(!var165.eql(var166));
                            if (module0314.NIL != var167) {
                                SubLObject var168 = (SubLObject)module0314.NIL;
                                try {
                                    var168 = module0158.f10316(var166, (SubLObject)module0314.$ic53$, (SubLObject)module0314.$ic34$, (SubLObject)module0314.NIL);
                                    SubLObject var163_169 = (SubLObject)module0314.NIL;
                                    final SubLObject var164_170 = (SubLObject)module0314.NIL;
                                    while (module0314.NIL == var163_169) {
                                        final SubLObject var169 = module0052.f3695(var168, var164_170);
                                        final SubLObject var166_171 = (SubLObject)SubLObjectFactory.makeBoolean(!var164_170.eql(var169));
                                        if (module0314.NIL != var166_171) {
                                            final SubLObject var6_173 = module0221.$g2399$.currentBinding(var158);
                                            final SubLObject var23_177 = module0145.$g1917$.currentBinding(var158);
                                            try {
                                                module0221.$g2399$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0314.NIL == module0221.$g2399$.getDynamicValue(var158)), var158);
                                                module0145.$g1917$.bind(var169, var158);
                                                final SubLObject var171 = f21165(var169);
                                                module0313.f21157(var156, var171);
                                            }
                                            finally {
                                                module0145.$g1917$.rebind(var23_177, var158);
                                                module0221.$g2399$.rebind(var6_173, var158);
                                            }
                                        }
                                        var163_169 = (SubLObject)SubLObjectFactory.makeBoolean(module0314.NIL == var166_171);
                                    }
                                }
                                finally {
                                    final SubLObject var6_174 = Threads.$is_thread_performing_cleanupP$.currentBinding(var158);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0314.T, var158);
                                        if (module0314.NIL != var168) {
                                            module0158.f10319(var168);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var6_174, var158);
                                    }
                                }
                            }
                            var164 = (SubLObject)SubLObjectFactory.makeBoolean(module0314.NIL == var167);
                        }
                    }
                }
                finally {
                    module0148.$g2097$.rebind(var161, var158);
                    module0148.$g2099$.rebind(var160, var158);
                }
            }
        }
        catch (Throwable var172) {
            var159 = Errors.handleThrowable(var172, (SubLObject)module0314.$ic51$);
        }
        finally {
            var158.throwStack.pop();
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21232(final SubLObject var156, final SubLObject var42, final SubLObject var157, final SubLObject var83, final SubLObject var158) {
        final SubLThread var159 = SubLProcess.currentSubLThread();
        SubLObject var160 = (SubLObject)module0314.NIL;
        try {
            var159.throwStack.push(module0314.$ic51$);
            f21233(var156, var42, var157, var83, var158, (SubLObject)module0314.UNPROVIDED);
        }
        catch (Throwable var161) {
            var160 = Errors.handleThrowable(var161, (SubLObject)module0314.$ic51$);
        }
        finally {
            var159.throwStack.pop();
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21233(final SubLObject var156, final SubLObject var42, final SubLObject var180, SubLObject var83, SubLObject var158, SubLObject var13) {
        if (var83 == module0314.UNPROVIDED) {
            var83 = (SubLObject)module0314.NIL;
        }
        if (var158 == module0314.UNPROVIDED) {
            var158 = (SubLObject)module0314.NIL;
        }
        if (var13 == module0314.UNPROVIDED) {
            var13 = (SubLObject)module0314.NIL;
        }
        final SubLThread var181 = SubLProcess.currentSubLThread();
        assert module0314.NIL != Types.function_spec_p(var156) : var156;
        assert module0314.NIL != module0004.f105(var180) : var180;
        SubLObject var182 = (SubLObject)module0314.NIL;
        try {
            var181.throwStack.push(module0314.$ic51$);
            final SubLObject var183 = var13;
            final SubLObject var184 = module0147.$g2094$.currentBinding(var181);
            final SubLObject var185 = module0147.$g2095$.currentBinding(var181);
            try {
                module0147.$g2094$.bind(module0147.f9536(var183), var181);
                module0147.$g2095$.bind(module0147.f9537(var183), var181);
                if (module0314.NIL != var83 && module0314.NIL != var158) {
                    final SubLObject var186 = var83;
                    if (module0314.NIL != module0158.f10010(var42, var180, var186)) {
                        final SubLObject var187 = module0158.f10011(var42, var180, var186);
                        SubLObject var188 = (SubLObject)module0314.NIL;
                        final SubLObject var189 = (SubLObject)module0314.NIL;
                        while (module0314.NIL == var188) {
                            final SubLObject var190 = module0052.f3695(var187, var189);
                            final SubLObject var191 = (SubLObject)SubLObjectFactory.makeBoolean(!var189.eql(var190));
                            if (module0314.NIL != var191) {
                                SubLObject var192 = (SubLObject)module0314.NIL;
                                try {
                                    var192 = module0158.f10316(var190, (SubLObject)module0314.$ic53$, var158, (SubLObject)module0314.NIL);
                                    SubLObject var163_182 = (SubLObject)module0314.NIL;
                                    final SubLObject var164_183 = (SubLObject)module0314.NIL;
                                    while (module0314.NIL == var163_182) {
                                        final SubLObject var193 = module0052.f3695(var192, var164_183);
                                        final SubLObject var166_185 = (SubLObject)SubLObjectFactory.makeBoolean(!var164_183.eql(var193));
                                        if (module0314.NIL != var166_185) {
                                            final SubLObject var6_186 = module0145.$g1917$.currentBinding(var181);
                                            try {
                                                module0145.$g1917$.bind(var193, var181);
                                                final SubLObject var194 = f21165(var193);
                                                Functions.funcall(var156, var194);
                                            }
                                            finally {
                                                module0145.$g1917$.rebind(var6_186, var181);
                                            }
                                        }
                                        var163_182 = (SubLObject)SubLObjectFactory.makeBoolean(module0314.NIL == var166_185);
                                    }
                                }
                                finally {
                                    final SubLObject var6_187 = Threads.$is_thread_performing_cleanupP$.currentBinding(var181);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0314.T, var181);
                                        if (module0314.NIL != var192) {
                                            module0158.f10319(var192);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var6_187, var181);
                                    }
                                }
                            }
                            var188 = (SubLObject)SubLObjectFactory.makeBoolean(module0314.NIL == var191);
                        }
                    }
                }
                else if (module0314.NIL != var83 && module0314.NIL == var158) {
                    final SubLObject var186 = var83;
                    if (module0314.NIL != module0158.f10010(var42, var180, var186)) {
                        final SubLObject var187 = module0158.f10011(var42, var180, var186);
                        SubLObject var188 = (SubLObject)module0314.NIL;
                        final SubLObject var189 = (SubLObject)module0314.NIL;
                        while (module0314.NIL == var188) {
                            final SubLObject var190 = module0052.f3695(var187, var189);
                            final SubLObject var191 = (SubLObject)SubLObjectFactory.makeBoolean(!var189.eql(var190));
                            if (module0314.NIL != var191) {
                                SubLObject var192 = (SubLObject)module0314.NIL;
                                try {
                                    var192 = module0158.f10316(var190, (SubLObject)module0314.$ic53$, (SubLObject)module0314.NIL, (SubLObject)module0314.NIL);
                                    SubLObject var163_183 = (SubLObject)module0314.NIL;
                                    final SubLObject var164_184 = (SubLObject)module0314.NIL;
                                    while (module0314.NIL == var163_183) {
                                        final SubLObject var193 = module0052.f3695(var192, var164_184);
                                        final SubLObject var166_186 = (SubLObject)SubLObjectFactory.makeBoolean(!var164_184.eql(var193));
                                        if (module0314.NIL != var166_186) {
                                            final SubLObject var6_188 = module0145.$g1917$.currentBinding(var181);
                                            try {
                                                module0145.$g1917$.bind(var193, var181);
                                                final SubLObject var194 = f21165(var193);
                                                Functions.funcall(var156, var194);
                                            }
                                            finally {
                                                module0145.$g1917$.rebind(var6_188, var181);
                                            }
                                        }
                                        var163_183 = (SubLObject)SubLObjectFactory.makeBoolean(module0314.NIL == var166_186);
                                    }
                                }
                                finally {
                                    final SubLObject var6_189 = Threads.$is_thread_performing_cleanupP$.currentBinding(var181);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0314.T, var181);
                                        if (module0314.NIL != var192) {
                                            module0158.f10319(var192);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var6_189, var181);
                                    }
                                }
                            }
                            var188 = (SubLObject)SubLObjectFactory.makeBoolean(module0314.NIL == var191);
                        }
                    }
                }
                else if (module0314.NIL == var83 && module0314.NIL != var158) {
                    final SubLObject var186 = (SubLObject)module0314.NIL;
                    if (module0314.NIL != module0158.f10010(var42, var180, var186)) {
                        final SubLObject var187 = module0158.f10011(var42, var180, var186);
                        SubLObject var188 = (SubLObject)module0314.NIL;
                        final SubLObject var189 = (SubLObject)module0314.NIL;
                        while (module0314.NIL == var188) {
                            final SubLObject var190 = module0052.f3695(var187, var189);
                            final SubLObject var191 = (SubLObject)SubLObjectFactory.makeBoolean(!var189.eql(var190));
                            if (module0314.NIL != var191) {
                                SubLObject var192 = (SubLObject)module0314.NIL;
                                try {
                                    var192 = module0158.f10316(var190, (SubLObject)module0314.$ic53$, var158, (SubLObject)module0314.NIL);
                                    SubLObject var163_184 = (SubLObject)module0314.NIL;
                                    final SubLObject var164_185 = (SubLObject)module0314.NIL;
                                    while (module0314.NIL == var163_184) {
                                        final SubLObject var193 = module0052.f3695(var192, var164_185);
                                        final SubLObject var166_187 = (SubLObject)SubLObjectFactory.makeBoolean(!var164_185.eql(var193));
                                        if (module0314.NIL != var166_187) {
                                            final SubLObject var6_190 = module0145.$g1917$.currentBinding(var181);
                                            try {
                                                module0145.$g1917$.bind(var193, var181);
                                                final SubLObject var194 = f21165(var193);
                                                Functions.funcall(var156, var194);
                                            }
                                            finally {
                                                module0145.$g1917$.rebind(var6_190, var181);
                                            }
                                        }
                                        var163_184 = (SubLObject)SubLObjectFactory.makeBoolean(module0314.NIL == var166_187);
                                    }
                                }
                                finally {
                                    final SubLObject var6_191 = Threads.$is_thread_performing_cleanupP$.currentBinding(var181);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0314.T, var181);
                                        if (module0314.NIL != var192) {
                                            module0158.f10319(var192);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var6_191, var181);
                                    }
                                }
                            }
                            var188 = (SubLObject)SubLObjectFactory.makeBoolean(module0314.NIL == var191);
                        }
                    }
                }
                else if (module0314.NIL == var83 && module0314.NIL == var158) {
                    final SubLObject var186 = (SubLObject)module0314.NIL;
                    if (module0314.NIL != module0158.f10010(var42, var180, var186)) {
                        final SubLObject var187 = module0158.f10011(var42, var180, var186);
                        SubLObject var188 = (SubLObject)module0314.NIL;
                        final SubLObject var189 = (SubLObject)module0314.NIL;
                        while (module0314.NIL == var188) {
                            final SubLObject var190 = module0052.f3695(var187, var189);
                            final SubLObject var191 = (SubLObject)SubLObjectFactory.makeBoolean(!var189.eql(var190));
                            if (module0314.NIL != var191) {
                                SubLObject var192 = (SubLObject)module0314.NIL;
                                try {
                                    var192 = module0158.f10316(var190, (SubLObject)module0314.$ic53$, (SubLObject)module0314.NIL, (SubLObject)module0314.NIL);
                                    SubLObject var163_185 = (SubLObject)module0314.NIL;
                                    final SubLObject var164_186 = (SubLObject)module0314.NIL;
                                    while (module0314.NIL == var163_185) {
                                        final SubLObject var193 = module0052.f3695(var192, var164_186);
                                        final SubLObject var166_188 = (SubLObject)SubLObjectFactory.makeBoolean(!var164_186.eql(var193));
                                        if (module0314.NIL != var166_188) {
                                            final SubLObject var6_192 = module0145.$g1917$.currentBinding(var181);
                                            try {
                                                module0145.$g1917$.bind(var193, var181);
                                                final SubLObject var194 = f21165(var193);
                                                Functions.funcall(var156, var194);
                                            }
                                            finally {
                                                module0145.$g1917$.rebind(var6_192, var181);
                                            }
                                        }
                                        var163_185 = (SubLObject)SubLObjectFactory.makeBoolean(module0314.NIL == var166_188);
                                    }
                                }
                                finally {
                                    final SubLObject var6_193 = Threads.$is_thread_performing_cleanupP$.currentBinding(var181);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0314.T, var181);
                                        if (module0314.NIL != var192) {
                                            module0158.f10319(var192);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var6_193, var181);
                                    }
                                }
                            }
                            var188 = (SubLObject)SubLObjectFactory.makeBoolean(module0314.NIL == var191);
                        }
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var185, var181);
                module0147.$g2094$.rebind(var184, var181);
            }
        }
        catch (Throwable var195) {
            var182 = Errors.handleThrowable(var195, (SubLObject)module0314.$ic51$);
        }
        finally {
            var181.throwStack.pop();
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21172(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        if (module0314.NIL != module0313.f21137(var11)) {
            Hashtables.sethash(var11, module0145.$g1924$.getDynamicValue(var12), (SubLObject)module0314.T);
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21195(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        if (module0314.NIL != module0313.f21137(var11)) {
            Hashtables.sethash(var11, module0145.$g1924$.getDynamicValue(var12), (SubLObject)module0314.NIL);
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21171(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        if (module0314.NIL != module0313.f21137(var11)) {
            return Hashtables.gethash(var11, module0145.$g1924$.getDynamicValue(var12), (SubLObject)module0314.UNPROVIDED);
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21226(final SubLObject var11, final SubLObject var203) {
        final SubLThread var204 = SubLProcess.currentSubLThread();
        if (module0314.NIL != module0313.f21137(var11)) {
            SubLObject var205 = (SubLObject)module0314.NIL;
            var205 = Hashtables.gethash(var11, module0145.$g1924$.getDynamicValue(var204), (SubLObject)module0314.UNPROVIDED);
            Hashtables.sethash(var11, module0145.$g1924$.getDynamicValue(var204), conses_high.adjoin(var203, var205, (SubLObject)module0314.UNPROVIDED, (SubLObject)module0314.UNPROVIDED));
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21210(final SubLObject var11, final SubLObject var122) {
        final SubLThread var123 = SubLProcess.currentSubLThread();
        if (module0314.NIL != module0313.f21137(var11)) {
            Hashtables.sethash(var11, module0145.$g1924$.getDynamicValue(var123), var122);
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21234(final SubLObject var11, final SubLObject var203, SubLObject var205) {
        if (var205 == module0314.UNPROVIDED) {
            var205 = (SubLObject)module0314.EQL;
        }
        final SubLThread var206 = SubLProcess.currentSubLThread();
        if (module0314.NIL != module0313.f21137(var11)) {
            return module0004.f104(var203, Hashtables.gethash(var11, module0145.$g1924$.getDynamicValue(var206), (SubLObject)module0314.UNPROVIDED), var205, (SubLObject)module0314.UNPROVIDED);
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21187(final SubLObject var206, final SubLObject var207, SubLObject var205) {
        if (var205 == module0314.UNPROVIDED) {
            var205 = (SubLObject)module0314.EQL;
        }
        SubLObject var208 = (SubLObject)module0314.NIL;
        if (module0314.NIL == var208) {
            SubLObject var209;
            SubLObject var210;
            for (var209 = var207, var210 = (SubLObject)module0314.NIL, var210 = var209.first(); module0314.NIL == var208 && module0314.NIL != var209; var208 = (SubLObject)SubLObjectFactory.makeBoolean(module0314.NIL == f21234(var206, var210, var205)), var209 = var209.rest(), var210 = var209.first()) {}
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0314.NIL == var208);
    }
    
    public static SubLObject f21197(final SubLObject var11, SubLObject var209) {
        if (var209 == module0314.UNPROVIDED) {
            var209 = module0145.$g1925$.getDynamicValue();
        }
        if (module0314.NIL != module0313.f21137(var11)) {
            return Hashtables.gethash(var11, var209, (SubLObject)module0314.UNPROVIDED);
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21198(final SubLObject var11, SubLObject var210) {
        if (var210 == module0314.UNPROVIDED) {
            var210 = module0145.$g1924$.getDynamicValue();
        }
        if (module0314.NIL != module0313.f21137(var11)) {
            Hashtables.remhash(var11, var210);
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21228(final SubLObject var11, final SubLObject var211, final SubLObject var209) {
        if (module0314.NIL != module0313.f21137(var11)) {
            Hashtables.sethash(var11, var209, var211);
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21235(final SubLObject var2) {
        final SubLObject var3 = f21165(var2);
        if (module0314.NIL != module0313.f21137(var3) && module0314.NIL == f21171(var3)) {
            f21172(var3);
            module0313.f21153(var3);
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21236(final SubLObject var11) {
        if (module0314.NIL != module0313.f21137(var11) && module0314.NIL == f21171(var11)) {
            f21172(var11);
            module0313.f21153(var11);
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21237(final SubLObject var2) {
        final SubLObject var3 = f21165(var2);
        if (module0314.NIL != module0313.f21137(var3) && module0314.NIL != f21171(var3)) {
            f21195(var3);
            module0313.f21153(var3);
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21238(final SubLObject var11) {
        if (module0314.NIL != module0313.f21137(var11) && module0314.NIL != f21171(var11)) {
            f21195(var11);
            module0313.f21153(var11);
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21239(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = f21165(var2);
        if (module0314.NIL != module0313.f21137(var4) && module0314.NIL == f21234(var4, module0145.$g1903$.getDynamicValue(var3), (SubLObject)module0314.UNPROVIDED)) {
            f21226(var4, module0145.$g1903$.getDynamicValue(var3));
            module0313.f21153(var4);
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21240(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        if (module0314.NIL != module0313.f21137(var11) && module0314.NIL == f21234(var11, module0145.$g1903$.getDynamicValue(var12), (SubLObject)module0314.UNPROVIDED)) {
            f21226(var11, module0145.$g1903$.getDynamicValue(var12));
            module0313.f21153(var11);
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21241(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        if (module0314.NIL == Errors.$ignore_mustsP$.getDynamicValue(var12) && module0314.NIL == module0313.f21138((SubLObject)module0314.$ic1$)) {
            Errors.error((SubLObject)module0314.$ic8$, (SubLObject)module0314.$ic1$);
        }
        final SubLObject var13 = module0145.$g1895$.currentBinding(var12);
        try {
            module0145.$g1895$.bind((SubLObject)module0314.$ic1$, var12);
            f21242(var11);
        }
        finally {
            module0145.$g1895$.rebind(var13, var12);
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21243(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        if (module0314.NIL == Errors.$ignore_mustsP$.getDynamicValue(var12) && module0314.NIL == module0313.f21138((SubLObject)module0314.$ic1$)) {
            Errors.error((SubLObject)module0314.$ic8$, (SubLObject)module0314.$ic1$);
        }
        final SubLObject var13 = module0145.$g1895$.currentBinding(var12);
        try {
            module0145.$g1895$.bind((SubLObject)module0314.$ic1$, var12);
            f21244(var11);
        }
        finally {
            module0145.$g1895$.rebind(var13, var12);
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21245(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        if (module0314.NIL == Errors.$ignore_mustsP$.getDynamicValue(var12) && module0314.NIL == module0313.f21138((SubLObject)module0314.$ic2$)) {
            Errors.error((SubLObject)module0314.$ic8$, (SubLObject)module0314.$ic2$);
        }
        final SubLObject var13 = module0145.$g1895$.currentBinding(var12);
        try {
            module0145.$g1895$.bind((SubLObject)module0314.$ic2$, var12);
            f21242(var11);
        }
        finally {
            module0145.$g1895$.rebind(var13, var12);
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21246(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        if (module0314.NIL == Errors.$ignore_mustsP$.getDynamicValue(var12) && module0314.NIL == module0313.f21138((SubLObject)module0314.$ic2$)) {
            Errors.error((SubLObject)module0314.$ic8$, (SubLObject)module0314.$ic2$);
        }
        final SubLObject var13 = module0145.$g1895$.currentBinding(var12);
        try {
            module0145.$g1895$.bind((SubLObject)module0314.$ic2$, var12);
            f21244(var11);
        }
        finally {
            module0145.$g1895$.rebind(var13, var12);
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21242(final SubLObject var11) {
        f21172(var11);
        f21244(var11);
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21244(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        assert module0314.NIL != module0130.f8511((SubLObject)module0314.$ic34$) : module0314.$ic34$;
        final SubLObject var13 = module0145.$g1897$.currentBinding(var12);
        try {
            module0145.$g1897$.bind((SubLObject)module0314.$ic34$, var12);
            assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic10$) : module0314.$ic10$;
            final SubLObject var6_212 = module0145.$g1905$.currentBinding(var12);
            try {
                module0145.$g1905$.bind((SubLObject)module0314.$ic10$, var12);
                assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic19$) : module0314.$ic19$;
                final SubLObject var6_213 = module0145.$g1904$.currentBinding(var12);
                try {
                    module0145.$g1904$.bind((SubLObject)module0314.$ic19$, var12);
                    f21168(var11, (SubLObject)module0314.UNPROVIDED);
                }
                finally {
                    module0145.$g1904$.rebind(var6_213, var12);
                }
            }
            finally {
                module0145.$g1905$.rebind(var6_212, var12);
            }
        }
        finally {
            module0145.$g1897$.rebind(var13, var12);
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21247(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        if (module0314.NIL == Errors.$ignore_mustsP$.getDynamicValue(var12) && module0314.NIL == module0313.f21138((SubLObject)module0314.$ic1$)) {
            Errors.error((SubLObject)module0314.$ic8$, (SubLObject)module0314.$ic1$);
        }
        final SubLObject var13 = module0145.$g1895$.currentBinding(var12);
        try {
            module0145.$g1895$.bind((SubLObject)module0314.$ic1$, var12);
            f21248(var11);
        }
        finally {
            module0145.$g1895$.rebind(var13, var12);
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21249(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        if (module0314.NIL == Errors.$ignore_mustsP$.getDynamicValue(var12) && module0314.NIL == module0313.f21138((SubLObject)module0314.$ic1$)) {
            Errors.error((SubLObject)module0314.$ic8$, (SubLObject)module0314.$ic1$);
        }
        final SubLObject var13 = module0145.$g1895$.currentBinding(var12);
        try {
            module0145.$g1895$.bind((SubLObject)module0314.$ic1$, var12);
            f21250(var11);
        }
        finally {
            module0145.$g1895$.rebind(var13, var12);
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21251(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        if (module0314.NIL == Errors.$ignore_mustsP$.getDynamicValue(var12) && module0314.NIL == module0313.f21138((SubLObject)module0314.$ic2$)) {
            Errors.error((SubLObject)module0314.$ic8$, (SubLObject)module0314.$ic2$);
        }
        final SubLObject var13 = module0145.$g1895$.currentBinding(var12);
        try {
            module0145.$g1895$.bind((SubLObject)module0314.$ic2$, var12);
            f21248(var11);
        }
        finally {
            module0145.$g1895$.rebind(var13, var12);
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21252(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        if (module0314.NIL == Errors.$ignore_mustsP$.getDynamicValue(var12) && module0314.NIL == module0313.f21138((SubLObject)module0314.$ic2$)) {
            Errors.error((SubLObject)module0314.$ic8$, (SubLObject)module0314.$ic2$);
        }
        final SubLObject var13 = module0145.$g1895$.currentBinding(var12);
        try {
            module0145.$g1895$.bind((SubLObject)module0314.$ic2$, var12);
            f21250(var11);
        }
        finally {
            module0145.$g1895$.rebind(var13, var12);
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21248(final SubLObject var11) {
        f21195(var11);
        f21250(var11);
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21250(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        assert module0314.NIL != module0130.f8511((SubLObject)module0314.$ic34$) : module0314.$ic34$;
        final SubLObject var13 = module0145.$g1897$.currentBinding(var12);
        try {
            module0145.$g1897$.bind((SubLObject)module0314.$ic34$, var12);
            assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic10$) : module0314.$ic10$;
            final SubLObject var6_214 = module0145.$g1905$.currentBinding(var12);
            try {
                module0145.$g1905$.bind((SubLObject)module0314.$ic10$, var12);
                assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic20$) : module0314.$ic20$;
                final SubLObject var6_215 = module0145.$g1904$.currentBinding(var12);
                try {
                    module0145.$g1904$.bind((SubLObject)module0314.$ic20$, var12);
                    f21168(var11, (SubLObject)module0314.UNPROVIDED);
                }
                finally {
                    module0145.$g1904$.rebind(var6_215, var12);
                }
            }
            finally {
                module0145.$g1905$.rebind(var6_214, var12);
            }
        }
        finally {
            module0145.$g1897$.rebind(var13, var12);
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21186(final SubLObject var11, final SubLObject var203) {
        if (module0314.NIL != module0313.f21137(var11)) {
            f21226(var11, var203);
            f21253(var11, var203);
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21253(final SubLObject var11, final SubLObject var203) {
        final SubLThread var204 = SubLProcess.currentSubLThread();
        assert module0314.NIL != module0130.f8511((SubLObject)module0314.$ic34$) : module0314.$ic34$;
        final SubLObject var205 = module0145.$g1897$.currentBinding(var204);
        try {
            module0145.$g1897$.bind((SubLObject)module0314.$ic34$, var204);
            assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic10$) : module0314.$ic10$;
            final SubLObject var6_216 = module0145.$g1905$.currentBinding(var204);
            try {
                module0145.$g1905$.bind((SubLObject)module0314.$ic10$, var204);
                assert module0314.NIL != Types.function_spec_p((SubLObject)module0314.$ic56$) : module0314.$ic56$;
                final SubLObject var6_217 = module0145.$g1904$.currentBinding(var204);
                final SubLObject var206 = module0145.$g1903$.currentBinding(var204);
                try {
                    module0145.$g1904$.bind((SubLObject)module0314.$ic56$, var204);
                    module0145.$g1903$.bind(var203, var204);
                    f21168(var11, (SubLObject)module0314.UNPROVIDED);
                }
                finally {
                    module0145.$g1903$.rebind(var206, var204);
                    module0145.$g1904$.rebind(var6_217, var204);
                }
            }
            finally {
                module0145.$g1905$.rebind(var6_216, var204);
            }
        }
        finally {
            module0145.$g1897$.rebind(var205, var204);
        }
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21254() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21163", "S#23782", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21164", "S#23783", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21165", "S#23784", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21166", "S#23785", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21167", "S#23786", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21169", "S#23787", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21170", "S#23756", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21173", "S#23788", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21174", "S#23789", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21175", "S#23790", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21176", "S#23791", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21177", "S#23792", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21178", "S#23793", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21179", "S#23794", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21180", "S#23795", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21181", "S#23757", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21183", "S#23796", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21184", "S#23797", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21185", "S#23798", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21188", "S#23799", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21189", "S#23800", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21190", "S#23801", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21191", "S#23802", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21192", "S#23803", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21194", "S#23804", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21196", "S#23805", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21193", "S#23806", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21199", "S#23807", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21200", "S#23808", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21202", "S#23809", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21201", "S#23810", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21203", "S#23811", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21204", "S#23759", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21205", "S#23812", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21206", "S#23813", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21207", "S#23814", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21208", "S#23815", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21209", "S#23816", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21211", "S#23817", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21212", "S#23818", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21213", "S#23819", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21214", "S#23820", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21215", "S#23821", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21216", "S#23822", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21217", "S#23823", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21219", "S#23824", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21220", "S#23825", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21218", "S#23755", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21222", "S#23758", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21224", "S#23826", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21225", "S#23827", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21227", "S#23828", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21223", "S#23829", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21182", "S#20117", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21168", "S#23754", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21221", "S#23830", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21229", "S#23831", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21230", "S#23832", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21231", "S#23833", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21232", "S#23834", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21233", "S#23835", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21172", "S#23836", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21195", "S#23837", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21171", "S#23780", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21226", "S#23838", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21210", "S#23839", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21234", "S#23840", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21187", "S#23841", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21197", "S#23842", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21198", "S#23843", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21228", "S#23844", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21235", "S#23845", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21236", "S#23846", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21237", "S#23847", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21238", "S#23848", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21239", "S#23849", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21240", "S#23850", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21241", "S#23851", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21243", "S#23852", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21245", "S#23853", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21246", "S#23854", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21242", "S#23855", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21244", "S#23856", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21247", "S#23857", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21249", "S#23858", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21251", "S#23859", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21252", "S#23860", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21248", "S#23861", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21250", "S#23862", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21186", "S#23863", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0314", "f21253", "S#23864", 2, 0, false);
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21255() {
        return (SubLObject)module0314.NIL;
    }
    
    public static SubLObject f21256() {
        return (SubLObject)module0314.NIL;
    }
    
    public void declareFunctions() {
        f21254();
    }
    
    public void initializeVariables() {
        f21255();
    }
    
    public void runTopLevelForms() {
        f21256();
    }
    
    static {
        me = (SubLFile)new module0314();
        $ic0$ = SubLObjectFactory.makeKeyword("DIRECTED");
        $ic1$ = SubLObjectFactory.makeKeyword("SUPERIOR");
        $ic2$ = SubLObjectFactory.makeKeyword("INFERIOR");
        $ic3$ = SubLObjectFactory.makeKeyword("INVERSE");
        $ic4$ = SubLObjectFactory.makeString("illegal value of *gt-mode*: ~s");
        $ic5$ = SubLObjectFactory.makeSymbol("S#23756", "CYC");
        $ic6$ = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $ic7$ = SubLObjectFactory.makeSymbol("S#23790", "CYC");
        $ic8$ = SubLObjectFactory.makeString("invalid gt mode: ~a");
        $ic9$ = SubLObjectFactory.makeString("illegal value of *gt-mode*");
        $ic10$ = SubLObjectFactory.makeSymbol("S#23754", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#23794", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#23757", "CYC");
        $ic13$ = SubLObjectFactory.makeString("~a is not a function");
        $ic14$ = SubLObjectFactory.makeSymbol("S#23797", "CYC");
        $ic15$ = SubLObjectFactory.makeInteger(128);
        $ic16$ = SubLObjectFactory.makeSymbol("S#23800", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("CONS");
        $ic18$ = SubLObjectFactory.makeSymbol("S#23802", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#23846", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#23848", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#23805", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#23807", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("S#23772", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#23809", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic26$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equals"));
        $ic27$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TRUE"));
        $ic28$ = SubLObjectFactory.makeSymbol("S#23759", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("S#23813", "CYC");
        $ic30$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic31$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic32$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ReflexiveBinaryPredicate"));
        $ic33$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $ic34$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic35$ = SubLObjectFactory.makeSymbol("TRUTH-P");
        $ic36$ = SubLObjectFactory.makeSymbol("S#23817", "CYC");
        $ic37$ = SubLObjectFactory.makeSymbol("S#23816", "CYC");
        $ic38$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic39$ = SubLObjectFactory.makeSymbol("S#23820", "CYC");
        $ic40$ = SubLObjectFactory.makeSymbol("S#23755", "CYC");
        $ic41$ = SubLObjectFactory.makeSymbol("S#23824", "CYC");
        $ic42$ = SubLObjectFactory.makeSymbol("S#23758", "CYC");
        $ic43$ = SubLObjectFactory.makeKeyword("ASSERTION");
        $ic44$ = SubLObjectFactory.makeString("illegal value of *gt-link-type*: ~s");
        $ic45$ = SubLObjectFactory.makeSymbol("HLMT-EQUAL");
        $ic46$ = SubLObjectFactory.makeInteger(512);
        $ic47$ = SubLObjectFactory.makeString("GT recursion limit reached.");
        $ic48$ = SubLObjectFactory.makeKeyword("ACCESSORS");
        $ic49$ = SubLObjectFactory.makeKeyword("ACCESSIBLE");
        $ic50$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12012", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12015", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12016", "CYC"));
        $ic51$ = SubLObjectFactory.makeKeyword("MAPPING-DONE");
        $ic52$ = SubLObjectFactory.makeSymbol("S#12347", "CYC");
        $ic53$ = SubLObjectFactory.makeKeyword("GAF");
        $ic54$ = SubLObjectFactory.makeSymbol("S#12348", "CYC");
        $ic55$ = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $ic56$ = SubLObjectFactory.makeSymbol("S#23850", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0314.class
	Total time: 1145 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/