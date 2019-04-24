package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0705 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0705";
    public static final String myFingerPrint = "b240a92bfa79ec66d578cbd47b93fc6881664e866657f8b386c5df71f6716ff4";
    private static SubLSymbol $g5517$;
    private static SubLSymbol $g5518$;
    private static SubLSymbol $g5519$;
    private static SubLSymbol $g5520$;
    private static SubLSymbol $g5521$;
    private static SubLSymbol $g5522$;
    private static SubLSymbol $g5523$;
    private static SubLSymbol $g5524$;
    private static SubLSymbol $g5525$;
    private static SubLSymbol $g5526$;
    private static final SubLString $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLString $ic3$;
    private static final SubLString $ic4$;
    private static final SubLString $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
    private static final SubLInteger $ic11$;
    private static final SubLString $ic12$;
    private static final SubLInteger $ic13$;
    private static final SubLString $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLString $ic16$;
    private static final SubLString $ic17$;
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLString $ic23$;
    private static final SubLString $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLList $ic40$;
    private static final SubLString $ic41$;
    private static final SubLString $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLString $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLString $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLString $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLString $ic56$;
    private static final SubLString $ic57$;
    private static final SubLString $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLString $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLString $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLString $ic67$;
    private static final SubLString $ic68$;
    private static final SubLString $ic69$;
    
    public static SubLObject f42913(final SubLObject var1, SubLObject var2) {
        if (var2 == module0705.UNPROVIDED) {
            var2 = Sequences.cconcatenate((SubLObject)module0705.$ic0$, var1);
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        enforceType(var1, module0705.$ic1$);
        SubLObject var4 = (SubLObject)module0705.NIL;
        SubLObject var5 = (SubLObject)module0705.NIL;
        try {
            final SubLObject var6 = stream_macros.$stream_requires_locking$.currentBinding(var3);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0705.NIL, var3);
                var5 = compatibility.open_text(var1, (SubLObject)module0705.$ic2$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var6, var3);
            }
            if (!var5.isStream()) {
                Errors.error((SubLObject)module0705.$ic3$, var1);
            }
            final SubLObject var7 = var5;
            var4 = f42914(var7, var2);
            module0701.f42754(var4, var1);
        }
        finally {
            final SubLObject var8 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0705.T, var3);
                if (var5.isStream()) {
                    streams_high.close(var5, (SubLObject)module0705.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var8, var3);
            }
        }
        return var4;
    }
    
    public static SubLObject f42915(final SubLObject var1) {
        assert module0705.NIL != module0075.f5218(var1) : var1;
        final SubLObject var2 = f42913(var1, (SubLObject)module0705.UNPROVIDED);
        final SubLObject var3 = module0701.f42662(var2, module0701.f42634(var2, module0708.f43016((SubLObject)module0705.$ic4$), (SubLObject)module0705.UNPROVIDED, (SubLObject)module0705.UNPROVIDED), module0701.f42634(var2, module0699.f42531((SubLObject)module0705.$ic5$), (SubLObject)module0705.UNPROVIDED, (SubLObject)module0705.UNPROVIDED)).first();
        final SubLObject var4 = (SubLObject)((module0705.NIL != var3) ? module0700.f42612(var3) : module0705.NIL);
        if (module0705.NIL != module0702.f42828(var4)) {
            module0701.f42755(var2, var4);
        }
        return var2;
    }
    
    public static SubLObject f42916(final SubLObject var10, SubLObject var2) {
        if (var2 == module0705.UNPROVIDED) {
            var2 = var10;
        }
        assert module0705.NIL != module0589.f35909(var10) : var10;
        final SubLObject var11 = module0699.f42601(var10, (SubLObject)module0705.UNPROVIDED);
        final SubLObject var12 = (SubLObject)((module0705.NIL != var11) ? f42913(var11, var2) : module0705.NIL);
        if (module0705.NIL != var12) {
            module0701.f42755(var12, module0702.f42814(var10, (SubLObject)module0705.UNPROVIDED, (SubLObject)module0705.UNPROVIDED));
        }
        return var12;
    }
    
    public static SubLObject f42914(final SubLObject var7, final SubLObject var2) {
        return f42917(var7, var2, module0701.f42625());
    }
    
    public static SubLObject f42918(final SubLObject var12, final SubLObject var13, SubLObject var2) {
        if (var2 == module0705.UNPROVIDED) {
            var2 = Sequences.cconcatenate((SubLObject)module0705.$ic0$, var12);
        }
        final SubLThread var14 = SubLProcess.currentSubLThread();
        enforceType(var12, module0705.$ic1$);
        SubLObject var15 = (SubLObject)module0705.NIL;
        SubLObject var16 = (SubLObject)module0705.NIL;
        try {
            final SubLObject var17 = stream_macros.$stream_requires_locking$.currentBinding(var14);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0705.NIL, var14);
                var16 = compatibility.open_text(var12, (SubLObject)module0705.$ic2$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var17, var14);
            }
            if (!var16.isStream()) {
                Errors.error((SubLObject)module0705.$ic3$, var12);
            }
            final SubLObject var18 = var16;
            var15 = f42919(var18, var2, var13);
        }
        finally {
            final SubLObject var19 = Threads.$is_thread_performing_cleanupP$.currentBinding(var14);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0705.T, var14);
                if (var16.isStream()) {
                    streams_high.close(var16, (SubLObject)module0705.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var19, var14);
            }
        }
        return var15;
    }
    
    public static SubLObject f42919(final SubLObject var7, final SubLObject var2, final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        SubLObject var18 = (SubLObject)module0705.NIL;
        try {
            final SubLObject var19 = stream_macros.$stream_requires_locking$.currentBinding(var17);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0705.NIL, var17);
                var18 = compatibility.open_text(var16, (SubLObject)module0705.$ic7$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var19, var17);
            }
            if (!var18.isStream()) {
                Errors.error((SubLObject)module0705.$ic3$, var16);
            }
            final SubLObject var20 = var18;
            final SubLObject var21 = module0705.$g5520$.currentBinding(var17);
            final SubLObject var22 = module0705.$g5519$.currentBinding(var17);
            try {
                module0705.$g5520$.bind(module0065.f4745((SubLObject)module0705.UNPROVIDED, (SubLObject)module0705.UNPROVIDED), var17);
                module0705.$g5519$.bind(module0057.f4173((SubLObject)module0705.UNPROVIDED, (SubLObject)module0705.UNPROVIDED, (SubLObject)module0705.UNPROVIDED), var17);
                f42920(var7, var2, var20);
            }
            finally {
                module0705.$g5519$.rebind(var22, var17);
                module0705.$g5520$.rebind(var21, var17);
            }
        }
        finally {
            final SubLObject var23 = Threads.$is_thread_performing_cleanupP$.currentBinding(var17);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0705.T, var17);
                if (var18.isStream()) {
                    streams_high.close(var18, (SubLObject)module0705.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var23, var17);
            }
        }
        return var16;
    }
    
    public static SubLObject f42917(final SubLObject var7, final SubLObject var2, final SubLObject var4) {
        assert module0705.NIL != module0701.f42628(var4) : var4;
        return f42920(var7, var2, var4);
    }
    
    public static SubLObject f42920(final SubLObject var7, final SubLObject var2, final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        final SubLObject var22 = module0590.f35985(var7, (SubLObject)module0705.T, (SubLObject)module0705.T, (SubLObject)module0705.NIL);
        final SubLObject var23 = (SubLObject)ConsesLow.list(reader.bq_cons(module0709.f43161((SubLObject)module0705.$ic9$), var2));
        if (module0705.NIL == module0052.f3687(var22)) {
            module0590.f36024(var22);
            final SubLObject var24 = module0052.f3796(var22);
            final SubLObject var25 = module0590.f36044(var24);
            final SubLObject var26 = var25.rest();
            final SubLObject var27 = module0035.f2294(var26, module0709.f43161((SubLObject)module0705.$ic10$), Symbols.symbol_function((SubLObject)module0705.EQUAL), (SubLObject)module0705.UNPROVIDED);
            final SubLObject var28 = module0705.$g5517$.currentBinding(var21);
            final SubLObject var29 = module0705.$g5518$.currentBinding(var21);
            try {
                module0705.$g5517$.bind((module0705.NIL != var27) ? var27 : module0705.$g5517$.getDynamicValue(var21), var21);
                module0705.$g5518$.bind(module0077.f5313(Symbols.symbol_function((SubLObject)module0705.EQUAL), (SubLObject)module0705.UNPROVIDED), var21);
                if (module0705.NIL != module0701.f42628(var20)) {
                    module0701.f42759(var20, var26);
                }
                final SubLObject var6_27 = module0012.$silent_progressP$.currentBinding(var21);
                final SubLObject var19_28 = module0012.$g75$.currentBinding(var21);
                final SubLObject var30 = module0012.$g76$.currentBinding(var21);
                final SubLObject var31 = module0012.$g77$.currentBinding(var21);
                final SubLObject var32 = module0012.$g78$.currentBinding(var21);
                try {
                    module0012.$silent_progressP$.bind(Numbers.numL(streams_high.file_length(var7), (SubLObject)module0705.$ic11$), var21);
                    module0012.$g75$.bind((SubLObject)module0705.ZERO_INTEGER, var21);
                    module0012.$g76$.bind((SubLObject)module0705.NIL, var21);
                    module0012.$g77$.bind((SubLObject)module0705.T, var21);
                    module0012.$g78$.bind(Time.get_universal_time(), var21);
                    module0012.f478((SubLObject)module0705.$ic12$);
                    if (module0705.NIL != f42921(var24)) {
                        module0052.f3693(var22);
                        final SubLObject var33 = (SubLObject)ConsesLow.list(var26, var23);
                        SubLObject var34 = (SubLObject)module0705.NIL;
                        final SubLObject var35 = (SubLObject)module0705.$ic13$;
                        final SubLObject var36 = (SubLObject)module0705.FIVE_INTEGER;
                        SubLObject var37 = (SubLObject)module0705.ZERO_INTEGER;
                        while (module0705.NIL == var34) {
                            var21.resetMultipleValues();
                            final SubLObject var37_38 = f42922(var22, var20, var33, var35, var36, var37);
                            final SubLObject var39_40 = var21.secondMultipleValue();
                            var21.resetMultipleValues();
                            var34 = var37_38;
                            var37 = var39_40;
                        }
                    }
                    else {
                        final SubLObject var38 = module0590.f36087(var22, (SubLObject)module0705.UNPROVIDED);
                        f42923(var38, var20, (SubLObject)ConsesLow.list(var26, var23));
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var32, var21);
                    module0012.$g77$.rebind(var31, var21);
                    module0012.$g76$.rebind(var30, var21);
                    module0012.$g75$.rebind(var19_28, var21);
                    module0012.$silent_progressP$.rebind(var6_27, var21);
                }
            }
            finally {
                module0705.$g5518$.rebind(var29, var21);
                module0705.$g5517$.rebind(var28, var21);
            }
        }
        return var20;
    }
    
    public static SubLObject f42922(final SubLObject var21, final SubLObject var42, final SubLObject var32, final SubLObject var34, final SubLObject var35, SubLObject var36) {
        final SubLThread var43 = SubLProcess.currentSubLThread();
        SubLObject var44 = module0052.f3687(var21);
        if (module0705.NIL == var44) {
            module0590.f36024(var21);
            if (module0705.NIL != f42921(module0052.f3796(var21)) && module0705.NIL != module0590.f36042(module0052.f3796(var21))) {
                var44 = (SubLObject)module0705.T;
            }
            else {
                final SubLObject var45 = module0590.f36087(var21, (SubLObject)module0705.UNPROVIDED);
                f42923(var45, var42, var32);
            }
            var43.resetMultipleValues();
            final SubLObject var46 = module0590.f36026(var21);
            final SubLObject var47 = var43.secondMultipleValue();
            var43.resetMultipleValues();
            module0012.note_percent_progress(var46, var47);
            final SubLObject var48 = Numbers.multiply(var34, module0048.f_1X(var36));
            if (module0077.f5311(module0705.$g5518$.getDynamicValue(var43)).numGE(var48)) {
                var36 = Numbers.add(var36, (SubLObject)module0705.ONE_INTEGER);
                if (Numbers.mod(var36, var35).isZero()) {
                    print_high.princ(var48, (SubLObject)module0705.UNPROVIDED);
                }
                else {
                    print_high.princ((SubLObject)module0705.$ic14$, (SubLObject)module0705.UNPROVIDED);
                }
                streams_high.force_output((SubLObject)module0705.UNPROVIDED);
            }
        }
        return Values.values(var44, var36);
    }
    
    public static SubLObject f42924() {
        f42925();
        f42926();
        return (SubLObject)module0705.NIL;
    }
    
    public static SubLObject f42923(final SubLObject var41, final SubLObject var42, final SubLObject var32) {
        final SubLObject var43 = module0590.f36092(var41);
        final SubLObject var44 = f42927(var41, var42, var32);
        f42928(var44, var42, var43, module0590.f36095(var41), module0590.f36094(var41, (SubLObject)module0705.UNPROVIDED), var32);
        return var44;
    }
    
    public static SubLObject f42928(final SubLObject var48, final SubLObject var42, final SubLObject var47, final SubLObject var49, final SubLObject var50, final SubLObject var32) {
        final SubLThread var51 = SubLProcess.currentSubLThread();
        final SubLObject var52 = module0035.f2293(var49, module0709.f43161((SubLObject)module0705.$ic10$), Symbols.symbol_function((SubLObject)module0705.EQUAL), (SubLObject)module0705.UNPROVIDED);
        final SubLObject var53 = f42929(var47, var32, (SubLObject)module0705.UNPROVIDED);
        enforceType(var53, module0705.$ic15$);
        if (module0705.NIL != module0035.f2293(var49, module0699.f42535((SubLObject)module0705.$ic16$), Symbols.symbol_function((SubLObject)module0705.EQUAL), (SubLObject)module0705.UNPROVIDED)) {
            Errors.error((SubLObject)module0705.$ic17$);
        }
        if (module0705.NIL == f42930(var53)) {
            f42931(var42, var48, f42932(var42), var53);
        }
        if (module0705.NIL != module0701.f42628(var42) && module0705.NIL == module0705.$g5522$.getDynamicValue(var51)) {
            module0701.f42757(var42, module0701.f42632(var48, var42));
        }
        final SubLObject var54 = module0705.$g5517$.currentBinding(var51);
        final SubLObject var55 = module0705.$g5521$.currentBinding(var51);
        final SubLObject var56 = module0705.$g5522$.currentBinding(var51);
        try {
            module0705.$g5517$.bind((module0705.NIL != var52) ? var52 : module0705.$g5517$.getDynamicValue(var51), var51);
            module0705.$g5521$.bind((SubLObject)module0705.ONE_INTEGER, var51);
            module0705.$g5522$.bind((SubLObject)module0705.T, var51);
            f42933(var48, var42, var49, var32);
            SubLObject var57 = var50;
            SubLObject var58 = (SubLObject)module0705.NIL;
            var58 = var57.first();
            while (module0705.NIL != var57) {
                f42934(var48, var58, var42, (SubLObject)ConsesLow.cons(var49, var32));
                var57 = var57.rest();
                var58 = var57.first();
            }
        }
        finally {
            module0705.$g5522$.rebind(var56, var51);
            module0705.$g5521$.rebind(var55, var51);
            module0705.$g5517$.rebind(var54, var51);
        }
        return var48;
    }
    
    public static SubLObject f42930(final SubLObject var51) {
        return module0702.f42838(var51, (SubLObject)module0705.$ic18$);
    }
    
    public static SubLObject f42934(final SubLObject var53, final SubLObject var54, final SubLObject var4, final SubLObject var32) {
        final SubLThread var55 = SubLProcess.currentSubLThread();
        final SubLObject var56 = module0590.f36092(var54);
        final SubLObject var57 = module0590.f36096(var54, module0709.f43161((SubLObject)module0705.$ic10$));
        final SubLObject var58 = module0705.$g5517$.currentBinding(var55);
        try {
            module0705.$g5517$.bind((module0705.NIL != var57) ? var57 : module0705.$g5517$.getDynamicValue(var55), var55);
            SubLObject var59 = f42929(var56, (SubLObject)ConsesLow.cons(module0590.f36095(var54), var32), (SubLObject)module0705.UNPROVIDED);
            if (module0705.NIL != module0702.f42838(var59, (SubLObject)module0705.$ic16$)) {
                var59 = f42935(var4, Sequences.cconcatenate((SubLObject)module0705.$ic19$, module0006.f207(module0705.$g5521$.getDynamicValue(var55))));
                module0705.$g5521$.setDynamicValue(Numbers.add(module0705.$g5521$.getDynamicValue(var55), (SubLObject)module0705.ONE_INTEGER), var55);
            }
            if (module0705.NIL != module0590.f36096(var54, module0699.f42535((SubLObject)module0705.$ic20$)) && module0705.NIL != f42936(var54)) {
                Errors.error((SubLObject)module0705.$ic21$);
            }
            final SubLObject var60 = f42937(var59);
            if (module0705.NIL != var60 && module0705.NIL != f42936(var54)) {
                f42938(var53, var54, var59, var4, var32);
            }
            else if (module0705.NIL != var60 && module0705.NIL != module0035.f2012(module0590.f36094(var54, (SubLObject)module0705.UNPROVIDED))) {
                f42939(var53, var54, var59, var4, var32);
            }
            else if (module0705.NIL != var60 && module0705.$ic22$.equal(module0590.f36096(var54, module0699.f42535((SubLObject)module0705.$ic23$)))) {
                f42940(var53, var54, var59, var4, var32);
            }
            else if (module0705.NIL != var60 && module0705.$ic24$.equal(module0590.f36096(var54, module0699.f42535((SubLObject)module0705.$ic23$)))) {
                f42941(var53, var54, var59, var4, var32);
            }
            else if (module0705.NIL != var60 && module0705.NIL != module0590.f36096(var54, module0699.f42535((SubLObject)module0705.$ic23$))) {
                Errors.error((SubLObject)module0705.$ic25$);
            }
            else if (module0705.NIL != var60 && module0705.NIL != module0035.f1997(module0590.f36094(var54, (SubLObject)module0705.UNPROVIDED)) && module0035.f2113(module0590.f36094(var54, (SubLObject)module0705.UNPROVIDED)).isList()) {
                final SubLObject var61 = f42923(module0035.f2113(module0590.f36094(var54, (SubLObject)module0705.UNPROVIDED)), var4, var32);
                final SubLObject var62 = module0590.f36096(var54, module0699.f42535((SubLObject)module0705.$ic26$));
                final SubLObject var63 = (module0705.NIL != var62) ? f42942(var62, var32) : var59;
                f42931(var4, var53, var63, var61);
            }
            else if (module0705.NIL != var60 && module0705.NIL != module0035.f1997(module0590.f36094(var54, (SubLObject)module0705.UNPROVIDED)) && module0035.f2113(module0590.f36094(var54, (SubLObject)module0705.UNPROVIDED)).isString()) {
                f42943(var53, var54, var59, var4, var32);
            }
            else {
                SubLObject var64 = (SubLObject)module0705.NIL;
                SubLObject var65 = (SubLObject)module0705.NIL;
                try {
                    var65 = streams_high.make_private_string_output_stream();
                    final SubLObject var6_61 = module0587.$g4457$.currentBinding(var55);
                    try {
                        module0587.$g4457$.bind(var65, var55);
                        module0601.f36801(var54);
                    }
                    finally {
                        module0587.$g4457$.rebind(var6_61, var55);
                    }
                    var64 = streams_high.get_output_stream_string(var65);
                }
                finally {
                    final SubLObject var6_62 = Threads.$is_thread_performing_cleanupP$.currentBinding(var55);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0705.T, var55);
                        streams_high.close(var65, (SubLObject)module0705.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var6_62, var55);
                    }
                }
                Errors.error((SubLObject)module0705.$ic27$, var64);
            }
        }
        finally {
            module0705.$g5517$.rebind(var58, var55);
        }
        return var4;
    }
    
    public static SubLObject f42938(final SubLObject var53, final SubLObject var54, final SubLObject var51, final SubLObject var4, final SubLObject var32) {
        if (module0705.NIL != Sequences.find_if((SubLObject)module0705.$ic28$, f42944(module0035.f2062(module0590.f36095(var54)), var32), (SubLObject)module0705.UNPROVIDED, (SubLObject)module0705.UNPROVIDED, (SubLObject)module0705.UNPROVIDED)) {
            Errors.error((SubLObject)module0705.$ic29$);
        }
        final SubLObject var55 = f42945(var4, module0590.f36094(var54, (SubLObject)module0705.UNPROVIDED), var32);
        final SubLObject var56 = module0590.f36096(var54, module0699.f42535((SubLObject)module0705.$ic26$));
        final SubLObject var57 = (module0705.NIL != var56) ? f42942(var56, var32) : var51;
        f42931(var4, var53, var57, var55);
        return (SubLObject)module0705.NIL;
    }
    
    public static SubLObject f42943(final SubLObject var53, final SubLObject var54, final SubLObject var51, final SubLObject var4, final SubLObject var32) {
        final SubLThread var55 = SubLProcess.currentSubLThread();
        final SubLObject var56 = module0035.f2113(module0590.f36094(var54, (SubLObject)module0705.UNPROVIDED));
        final SubLObject var57 = module0590.f36096(var54, module0699.f42535((SubLObject)module0705.$ic30$));
        final SubLObject var58 = (SubLObject)((module0705.NIL != var57) ? var57 : module0705.NIL);
        final SubLObject var59 = (SubLObject)((module0705.NIL != var58) ? module0705.NIL : module0705.$g5517$.getDynamicValue(var55));
        final SubLObject var60 = f42946(var4, var56, var59, var58);
        final SubLObject var61 = module0590.f36096(var54, module0699.f42535((SubLObject)module0705.$ic26$));
        f42931(var4, var53, var51, var60);
        if (module0705.NIL != var61) {
            f42947(var4, f42942(var61, var32), var53, var51, var60);
        }
        return (SubLObject)module0705.NIL;
    }
    
    public static SubLObject f42940(final SubLObject var53, final SubLObject var54, final SubLObject var51, final SubLObject var4, final SubLObject var32) {
        final SubLObject var55 = f42948(var4);
        final SubLObject var56 = module0590.f36096(var54, module0699.f42535((SubLObject)module0705.$ic26$));
        final SubLObject var57 = (module0705.NIL != var56) ? f42942(var56, var32) : var51;
        f42931(var4, var53, var57, var55);
        if (module0705.NIL == module0590.f36098(var54)) {
            f42928(var55, var4, f42935(var4, (SubLObject)module0705.$ic18$), module0590.f36095(var54), module0590.f36094(var54, (SubLObject)module0705.UNPROVIDED), var32);
        }
        return (SubLObject)module0705.NIL;
    }
    
    public static SubLObject f42939(final SubLObject var53, final SubLObject var54, final SubLObject var51, final SubLObject var4, final SubLObject var32) {
        final SubLThread var55 = SubLProcess.currentSubLThread();
        final SubLObject var56 = module0590.f36095(var54);
        SubLObject var57 = (SubLObject)module0705.NIL;
        if (module0705.NIL == Sequences.remove(module0699.f42535((SubLObject)module0705.$ic26$), module0035.f2062(var56), Symbols.symbol_function((SubLObject)module0705.EQUAL), (SubLObject)module0705.UNPROVIDED, (SubLObject)module0705.UNPROVIDED, (SubLObject)module0705.UNPROVIDED, (SubLObject)module0705.UNPROVIDED)) {
            final SubLObject var58 = (SubLObject)module0705.$ic31$;
            var57 = f42946(var4, var58, module0705.$g5517$.getDynamicValue(var55), (SubLObject)module0705.UNPROVIDED);
        }
        else {
            var57 = f42949(var54, var4, var32);
            final SubLObject var59 = f42933(var57, var4, var56, var32);
            if (module0705.NIL != var59 && module0705.NIL != f42936(var54)) {
                Errors.error((SubLObject)module0705.$ic29$);
            }
        }
        final SubLObject var60 = module0590.f36096(var54, module0699.f42535((SubLObject)module0705.$ic26$));
        f42931(var4, var53, var51, var57);
        if (module0705.NIL != var60) {
            f42947(var4, f42942(var60, var32), var53, var51, var57);
        }
        return (SubLObject)module0705.NIL;
    }
    
    public static SubLObject f42947(final SubLObject var4, final SubLObject var57, final SubLObject var48, final SubLObject var69, final SubLObject var56) {
        f42931(var4, var57, f42935(var4, (SubLObject)module0705.$ic5$), f42935(var4, (SubLObject)module0705.$ic32$));
        f42931(var4, var57, f42935(var4, (SubLObject)module0705.$ic33$), var48);
        f42931(var4, var57, f42935(var4, (SubLObject)module0705.$ic34$), var69);
        f42931(var4, var57, f42935(var4, (SubLObject)module0705.$ic35$), var56);
        return (SubLObject)module0705.NIL;
    }
    
    public static SubLObject f42941(final SubLObject var53, final SubLObject var54, final SubLObject var51, final SubLObject var4, final SubLObject var32) {
        final SubLObject var55 = module0590.f36096(var54, module0699.f42535((SubLObject)module0705.$ic26$));
        final SubLObject var56 = (module0705.NIL != var55) ? f42942(var55, var32) : var51;
        if (module0705.NIL != module0590.f36098(var54)) {
            f42931(var4, var53, var56, f42935(var4, (SubLObject)module0705.$ic36$));
        }
        else {
            SubLObject var57 = (SubLObject)module0705.NIL;
            SubLObject var58 = module0590.f36094(var54, (SubLObject)module0705.UNPROVIDED);
            SubLObject var59 = (SubLObject)module0705.NIL;
            var59 = var58.first();
            while (module0705.NIL != var58) {
                final SubLObject var60 = f42948(var4);
                if (module0705.NIL == var57) {
                    f42931(var4, var53, var56, var60);
                }
                else {
                    f42931(var4, var57, f42935(var4, (SubLObject)module0705.$ic37$), var60);
                }
                f42931(var4, var60, f42935(var4, (SubLObject)module0705.$ic38$), f42923(var59, var4, var32));
                var57 = var60;
                var58 = var58.rest();
                var59 = var58.first();
            }
            f42931(var4, var57, f42935(var4, (SubLObject)module0705.$ic37$), f42935(var4, (SubLObject)module0705.$ic36$));
        }
        return (SubLObject)module0705.NIL;
    }
    
    public static SubLObject f42936(final SubLObject var41) {
        return Equality.equal((SubLObject)module0705.$ic39$, module0590.f36096(var41, module0699.f42535((SubLObject)module0705.$ic23$)));
    }
    
    public static SubLObject f42933(final SubLObject var48, final SubLObject var4, final SubLObject var25, final SubLObject var32) {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        SubLObject var50 = (SubLObject)module0705.NIL;
        SubLObject var51 = var25;
        SubLObject var52 = (SubLObject)module0705.NIL;
        var52 = var51.first();
        while (module0705.NIL != var51) {
            SubLObject var54;
            final SubLObject var53 = var54 = var52;
            SubLObject var55 = (SubLObject)module0705.NIL;
            SubLObject var56 = (SubLObject)module0705.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var54, var53, (SubLObject)module0705.$ic40$);
            var55 = var54.first();
            var54 = (var56 = var54.rest());
            if (module0705.NIL == module0038.f2684(var55, (SubLObject)module0705.$ic41$)) {
                if (module0705.NIL != f42950(f42929(var55, var32, (SubLObject)module0705.UNPROVIDED))) {
                    Errors.error((SubLObject)module0705.$ic42$, var55);
                }
                else if (var55.equal(module0699.f42535((SubLObject)module0705.$ic5$))) {
                    final SubLObject var57 = f42929(var56, var32, (SubLObject)module0705.UNPROVIDED);
                    f42931(var4, var48, f42932(var4), var57);
                }
                else if (module0705.NIL != f42951(f42929(var55, var32, (SubLObject)module0705.UNPROVIDED))) {
                    final SubLObject var58 = f42929(var55, var32, (SubLObject)module0705.UNPROVIDED);
                    final SubLObject var59 = f42946(var4, var56, module0705.$g5517$.getDynamicValue(var49), (SubLObject)module0705.UNPROVIDED);
                    f42931(var4, var48, var58, var59);
                    var50 = (SubLObject)module0705.T;
                }
            }
            var51 = var51.rest();
            var52 = var51.first();
        }
        return var50;
    }
    
    public static SubLObject f42945(final SubLObject var4, final SubLObject var78, final SubLObject var32) {
        final SubLObject var79 = module0699.f42585(var78, var32);
        return f42946(var4, var79, (SubLObject)module0705.NIL, f42952());
    }
    
    public static SubLObject f42944(final SubLObject var80, final SubLObject var32) {
        SubLObject var81 = (SubLObject)module0705.NIL;
        SubLObject var82 = var80;
        SubLObject var83 = (SubLObject)module0705.NIL;
        var83 = var82.first();
        while (module0705.NIL != var82) {
            var81 = (SubLObject)ConsesLow.cons(f42929(var83, var32, (SubLObject)module0705.UNPROVIDED), var81);
            var82 = var82.rest();
            var83 = var82.first();
        }
        return Sequences.nreverse(var81);
    }
    
    public static SubLObject f42929(final SubLObject var51, final SubLObject var32, SubLObject var82) {
        if (var82 == module0705.UNPROVIDED) {
            var82 = (SubLObject)module0705.NIL;
        }
        if (module0705.NIL != module0702.f42828(var51)) {
            return var51;
        }
        SubLObject var83 = (SubLObject)module0705.NIL;
        if (module0705.NIL == var83) {
            SubLObject var84;
            SubLObject var85;
            for (var84 = var32, var85 = (SubLObject)module0705.NIL, var85 = var84.first(); module0705.NIL == var83 && module0705.NIL != var84; var83 = f42953(var51, var85, var82), var84 = var84.rest(), var85 = var84.first()) {}
        }
        return (module0705.NIL != var83) ? var83 : var51;
    }
    
    public static SubLObject f42925() {
        final SubLObject var84 = module0705.$g5523$.getGlobalValue();
        if (module0705.NIL != var84) {
            module0034.f1818(var84);
        }
        return (SubLObject)module0705.NIL;
    }
    
    public static SubLObject f42954(final SubLObject var51, final SubLObject var85, SubLObject var82) {
        if (var82 == module0705.UNPROVIDED) {
            var82 = (SubLObject)module0705.NIL;
        }
        return module0034.f1829(module0705.$g5523$.getGlobalValue(), (SubLObject)ConsesLow.list(var51, var85, var82), (SubLObject)module0705.UNPROVIDED, (SubLObject)module0705.UNPROVIDED);
    }
    
    public static SubLObject f42955(final SubLObject var51, final SubLObject var85, final SubLObject var82) {
        final SubLObject var86 = Sequences.position((SubLObject)Characters.CHAR_colon, var51, (SubLObject)module0705.UNPROVIDED, (SubLObject)module0705.UNPROVIDED, (SubLObject)module0705.UNPROVIDED, (SubLObject)module0705.UNPROVIDED);
        if (module0705.NIL != module0004.f105(var86) && module0705.NIL != module0035.f2002(var51, module0048.f_1X(var86), (SubLObject)module0705.UNPROVIDED)) {
            final SubLObject var87 = module0038.f2623(var51, (SubLObject)module0705.ZERO_INTEGER, var86);
            final SubLObject var88 = f42956(var87, var85);
            final SubLObject var89 = module0038.f2623(var51, module0048.f_1X(var86), (SubLObject)module0705.UNPROVIDED);
            return (SubLObject)((module0705.NIL != var88) ? module0702.f42852(var88, var89) : module0705.NIL);
        }
        if (module0705.NIL == var82) {
            final SubLObject var90 = module0035.f2293(var85, (SubLObject)module0705.$ic44$, Symbols.symbol_function((SubLObject)module0705.EQUAL), (SubLObject)module0705.UNPROVIDED);
            return (SubLObject)((module0705.NIL != var90) ? module0702.f42854(var90, var51) : module0705.NIL);
        }
        final SubLObject var91 = f42957(module0035.f2293(var85, module0709.f43161((SubLObject)module0705.$ic9$), Symbols.symbol_function((SubLObject)module0705.EQUAL), (SubLObject)module0705.UNPROVIDED));
        if (module0705.NIL != var91) {
            return module0702.f42854(var91, var51);
        }
        return (SubLObject)module0705.NIL;
    }
    
    public static SubLObject f42953(final SubLObject var51, final SubLObject var85, SubLObject var82) {
        if (var82 == module0705.UNPROVIDED) {
            var82 = (SubLObject)module0705.NIL;
        }
        SubLObject var86 = module0705.$g5523$.getGlobalValue();
        if (module0705.NIL == var86) {
            var86 = module0034.f1934((SubLObject)module0705.$ic43$, (SubLObject)module0705.$ic45$, (SubLObject)module0705.NIL, (SubLObject)module0705.EQUAL, (SubLObject)module0705.THREE_INTEGER, (SubLObject)module0705.ZERO_INTEGER);
        }
        final SubLObject var87 = module0034.f1781(var51, var85, var82);
        final SubLObject var88 = module0034.f1814(var86, var87, (SubLObject)module0705.UNPROVIDED);
        if (var88 != module0705.$ic46$) {
            SubLObject var89 = var88;
            SubLObject var90 = (SubLObject)module0705.NIL;
            var90 = var89.first();
            while (module0705.NIL != var89) {
                SubLObject var91 = var90.first();
                final SubLObject var92 = conses_high.second(var90);
                if (var51.equal(var91.first())) {
                    var91 = var91.rest();
                    if (var85.equal(var91.first())) {
                        var91 = var91.rest();
                        if (module0705.NIL != var91 && module0705.NIL == var91.rest() && var82.equal(var91.first())) {
                            return module0034.f1959(var92);
                        }
                    }
                }
                var89 = var89.rest();
                var90 = var89.first();
            }
        }
        final SubLObject var93 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f42955(var51, var85, var82)));
        module0034.f1836(var86, var87, var88, var93, (SubLObject)ConsesLow.list(var51, var85, var82));
        return module0034.f1959(var93);
    }
    
    public static SubLObject f42957(final SubLObject var51) {
        SubLObject var52 = var51;
        if (var51.isString()) {
            final SubLObject var53 = Sequences.position((SubLObject)Characters.CHAR_hash, var51, (SubLObject)module0705.UNPROVIDED, (SubLObject)module0705.UNPROVIDED, (SubLObject)module0705.UNPROVIDED, (SubLObject)module0705.UNPROVIDED);
            if (module0705.NIL != var53) {
                var52 = module0038.f2623(var51, (SubLObject)module0705.ZERO_INTEGER, var53);
            }
        }
        return var52;
    }
    
    public static SubLObject f42926() {
        final SubLObject var84 = module0705.$g5524$.getGlobalValue();
        if (module0705.NIL != var84) {
            module0034.f1818(var84);
        }
        return (SubLObject)module0705.NIL;
    }
    
    public static SubLObject f42958(final SubLObject var87, final SubLObject var85) {
        return module0034.f1829(module0705.$g5524$.getGlobalValue(), (SubLObject)ConsesLow.list(var87, var85), (SubLObject)module0705.UNPROVIDED, (SubLObject)module0705.UNPROVIDED);
    }
    
    public static SubLObject f42959(final SubLObject var87, final SubLObject var85) {
        return module0035.f2293(var85, Sequences.cconcatenate((SubLObject)module0705.$ic48$, var87), Symbols.symbol_function((SubLObject)module0705.EQUAL), (SubLObject)module0705.NIL);
    }
    
    public static SubLObject f42956(final SubLObject var87, final SubLObject var85) {
        SubLObject var88 = module0705.$g5524$.getGlobalValue();
        if (module0705.NIL == var88) {
            var88 = module0034.f1934((SubLObject)module0705.$ic47$, (SubLObject)module0705.$ic49$, (SubLObject)module0705.NIL, (SubLObject)module0705.EQUAL, (SubLObject)module0705.TWO_INTEGER, (SubLObject)module0705.ZERO_INTEGER);
        }
        final SubLObject var89 = module0034.f1782(var87, var85);
        final SubLObject var90 = module0034.f1814(var88, var89, (SubLObject)module0705.UNPROVIDED);
        if (var90 != module0705.$ic46$) {
            SubLObject var91 = var90;
            SubLObject var92 = (SubLObject)module0705.NIL;
            var92 = var91.first();
            while (module0705.NIL != var91) {
                SubLObject var93 = var92.first();
                final SubLObject var94 = conses_high.second(var92);
                if (var87.equal(var93.first())) {
                    var93 = var93.rest();
                    if (module0705.NIL != var93 && module0705.NIL == var93.rest() && var85.equal(var93.first())) {
                        return module0034.f1959(var94);
                    }
                }
                var91 = var91.rest();
                var92 = var91.first();
            }
        }
        final SubLObject var95 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f42959(var87, var85)));
        module0034.f1836(var88, var89, var90, var95, (SubLObject)ConsesLow.list(var87, var85));
        return module0034.f1959(var95);
    }
    
    public static SubLObject f42960(final SubLObject var56) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0705.NIL != module0702.f42828(var56) && module0705.NIL == module0702.f42838(var56, (SubLObject)module0705.$ic16$) && module0705.NIL == f42961(var56) && module0705.NIL == f42950(var56));
    }
    
    public static SubLObject f42951(final SubLObject var56) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0705.NIL != module0702.f42828(var56) && module0705.NIL == module0702.f42838(var56, (SubLObject)module0705.$ic16$) && module0705.NIL == f42930(var56) && module0705.NIL == f42961(var56) && module0705.NIL == f42950(var56));
    }
    
    public static SubLObject f42937(final SubLObject var56) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0705.NIL != module0702.f42828(var56) && module0705.NIL == f42930(var56) && module0705.NIL == f42961(var56) && module0705.NIL == f42950(var56));
    }
    
    public static SubLObject f42962() {
        if (module0705.$g5525$.getGlobalValue() == module0705.$ic50$) {
            final SubLObject var100 = module0035.f2105((SubLObject)ConsesLow.list(module0699.f42531((SubLObject)module0705.$ic51$), module0699.f42531((SubLObject)module0705.$ic26$), module0699.f42531((SubLObject)module0705.$ic52$), module0699.f42531((SubLObject)module0705.$ic23$), module0699.f42531((SubLObject)module0705.$ic20$), module0699.f42531((SubLObject)module0705.$ic53$), module0699.f42531((SubLObject)module0705.$ic30$)));
            if (var100 == module0705.$ic50$) {
                Errors.error((SubLObject)module0705.$ic54$, module0705.$g5525$.getGlobalValue());
            }
            module0705.$g5525$.setGlobalValue(var100);
        }
        return module0705.$g5525$.getGlobalValue();
    }
    
    public static SubLObject f42961(final SubLObject var56) {
        return Sequences.find(var56, f42962(), Symbols.symbol_function((SubLObject)module0705.$ic55$), (SubLObject)module0705.UNPROVIDED, (SubLObject)module0705.UNPROVIDED, (SubLObject)module0705.UNPROVIDED);
    }
    
    public static SubLObject f42963() {
        if (module0705.$g5526$.getGlobalValue() == module0705.$ic50$) {
            final SubLObject var100 = module0035.f2105((SubLObject)ConsesLow.list(module0699.f42531((SubLObject)module0705.$ic56$), module0699.f42531((SubLObject)module0705.$ic57$), module0699.f42531((SubLObject)module0705.$ic58$)));
            if (var100 == module0705.$ic50$) {
                Errors.error((SubLObject)module0705.$ic54$, module0705.$g5526$.getGlobalValue());
            }
            module0705.$g5526$.setGlobalValue(var100);
        }
        return module0705.$g5526$.getGlobalValue();
    }
    
    public static SubLObject f42950(final SubLObject var56) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0705.NIL != module0702.f42828(var56) && module0705.NIL != Sequences.find(var56, f42963(), Symbols.symbol_function((SubLObject)module0705.$ic55$), (SubLObject)module0705.UNPROVIDED, (SubLObject)module0705.UNPROVIDED, (SubLObject)module0705.UNPROVIDED));
    }
    
    public static SubLObject f42952() {
        return module0699.f42531((SubLObject)module0705.$ic59$);
    }
    
    public static SubLObject f42932(final SubLObject var42) {
        return f42935(var42, (SubLObject)module0705.$ic5$);
    }
    
    public static SubLObject f42927(final SubLObject var41, final SubLObject var42, final SubLObject var32) {
        final SubLObject var43 = module0590.f36096(var41, module0699.f42535((SubLObject)module0705.$ic26$));
        final SubLObject var44 = module0590.f36096(var41, module0699.f42535((SubLObject)module0705.$ic52$));
        final SubLObject var45 = module0590.f36096(var41, module0699.f42535((SubLObject)module0705.$ic20$));
        final SubLObject var46 = module0590.f36096(var41, module0699.f42535((SubLObject)module0705.$ic53$));
        SubLObject var47 = (SubLObject)module0705.NIL;
        if (module0705.NIL != var43) {
            if (module0705.NIL != var46) {
                Errors.error((SubLObject)module0705.$ic60$);
            }
            if (module0705.NIL != var44) {
                Errors.error((SubLObject)module0705.$ic61$);
            }
            final SubLObject var48 = f42942(var43, (SubLObject)ConsesLow.cons(module0590.f36095(var41), var32));
            f42964(var48);
            var47 = var48;
        }
        else if (module0705.NIL != var46) {
            if (module0705.NIL != var43) {
                Errors.error((SubLObject)module0705.$ic60$);
            }
            if (module0705.NIL != var44) {
                Errors.error((SubLObject)module0705.$ic62$);
            }
            if (module0705.NIL != var45) {
                Errors.error((SubLObject)module0705.$ic63$);
            }
            enforceType(var46, module0705.$ic64$);
            var47 = f42965(var42, var46);
        }
        else if (module0705.NIL != module0590.f36096(var41, module0699.f42535((SubLObject)module0705.$ic52$))) {
            if (module0705.NIL != var46) {
                Errors.error((SubLObject)module0705.$ic62$);
            }
            if (module0705.NIL != var43) {
                Errors.error((SubLObject)module0705.$ic61$);
            }
            final SubLObject var48 = var47 = f42929(module0590.f36096(var41, module0699.f42535((SubLObject)module0705.$ic52$)), var32, (SubLObject)module0705.T);
        }
        else {
            var47 = f42948(var42);
        }
        return var47;
    }
    
    public static SubLObject f42964(final SubLObject var57) {
        final SubLThread var58 = SubLProcess.currentSubLThread();
        final SubLObject var59 = module0077.f5326(var57, module0705.$g5518$.getDynamicValue(var58));
        if (module0705.NIL == var59) {
            Errors.error((SubLObject)module0705.$ic65$, var57);
        }
        return (SubLObject)module0705.NIL;
    }
    
    public static SubLObject f42949(final SubLObject var41, final SubLObject var4, final SubLObject var32) {
        final SubLObject var42 = module0590.f36096(var41, module0699.f42535((SubLObject)module0705.$ic20$));
        final SubLObject var43 = module0590.f36096(var41, module0699.f42535((SubLObject)module0705.$ic53$));
        SubLObject var44 = (SubLObject)module0705.NIL;
        if (module0705.NIL != var42) {
            if (module0705.NIL != var43) {
                Errors.error((SubLObject)module0705.$ic63$);
            }
            var44 = f42929(var42, var32, (SubLObject)module0705.T);
        }
        else if (module0705.NIL != var43) {
            if (module0705.NIL != var42) {
                Errors.error((SubLObject)module0705.$ic63$);
            }
            enforceType(var43, module0705.$ic64$);
            var44 = f42965(var4, var43);
        }
        else {
            var44 = f42948(var4);
        }
        return var44;
    }
    
    public static SubLObject f42966(final SubLObject var56) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0705.NIL != module0601.f36767(var56) && module0705.NIL == Sequences.find((SubLObject)Characters.CHAR_colon, var56, Symbols.symbol_function((SubLObject)module0705.EQL), Symbols.symbol_function((SubLObject)module0705.IDENTITY), (SubLObject)module0705.ONE_INTEGER, (SubLObject)module0705.UNPROVIDED));
    }
    
    public static SubLObject f42942(final SubLObject var106, final SubLObject var32) {
        enforceType(var106, module0705.$ic66$);
        final SubLObject var107 = Sequences.cconcatenate((SubLObject)module0705.$ic67$, var106);
        final SubLObject var108 = f42929(var107, var32, (SubLObject)module0705.T);
        if (var107.equal(var108)) {
            Errors.error((SubLObject)module0705.$ic68$, var106);
        }
        return var108;
    }
    
    public static SubLObject f42967(final SubLObject var56) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0705.NIL != Strings.stringE(module0590.f36092(var56), module0699.f42535((SubLObject)module0705.$ic51$), (SubLObject)module0705.UNPROVIDED, (SubLObject)module0705.UNPROVIDED, (SubLObject)module0705.UNPROVIDED, (SubLObject)module0705.UNPROVIDED) || module0705.NIL != Strings.stringE(module0590.f36092(var56), (SubLObject)module0705.$ic51$, (SubLObject)module0705.UNPROVIDED, (SubLObject)module0705.UNPROVIDED, (SubLObject)module0705.UNPROVIDED, (SubLObject)module0705.UNPROVIDED));
    }
    
    public static SubLObject f42921(final SubLObject var56) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var56.isString() && (module0705.NIL != module0590.f36071(var56, module0699.f42535((SubLObject)module0705.$ic51$)) || module0705.NIL != module0590.f36071(var56, (SubLObject)module0705.$ic51$)));
    }
    
    public static SubLObject f42931(final SubLObject var4, final SubLObject var48, final SubLObject var69, final SubLObject var56) {
        if (module0705.NIL != module0701.f42628(var4)) {
            module0701.f42627(var4, var48, var69, var56);
        }
        else if (module0705.NIL != streams_high.output_stream_p(var4)) {
            module0707.f42987(module0700.f42615(var48, var69, var56), var4);
        }
        else {
            Errors.error((SubLObject)module0705.$ic69$, var4);
        }
        return (SubLObject)module0705.NIL;
    }
    
    public static SubLObject f42935(final SubLObject var42, final SubLObject var108) {
        if (module0705.NIL != module0701.f42628(var42)) {
            return module0701.f42667(var42, var108);
        }
        return module0702.f42814(module0699.f42527(), module0038.$g916$.getGlobalValue(), var108);
    }
    
    public static SubLObject f42946(final SubLObject var4, final SubLObject var109, SubLObject var66, SubLObject var65) {
        if (var66 == module0705.UNPROVIDED) {
            var66 = (SubLObject)module0705.NIL;
        }
        if (var65 == module0705.UNPROVIDED) {
            var65 = (SubLObject)module0705.NIL;
        }
        if (module0705.NIL != module0701.f42628(var4)) {
            return module0701.f42635(var4, var109, var66, var65);
        }
        return module0704.f42898(var109, var66, var65);
    }
    
    public static SubLObject f42948(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        if (module0705.NIL != module0701.f42628(var4)) {
            return module0701.f42673(var4);
        }
        final SubLObject var6 = module0057.f4175(module0705.$g5519$.getDynamicValue(var5));
        final SubLObject var7 = module0703.f42873(var6);
        module0065.f4753(module0705.$g5520$.getDynamicValue(var5), var6, var7);
        return var7;
    }
    
    public static SubLObject f42965(final SubLObject var4, final SubLObject var57) {
        final SubLThread var58 = SubLProcess.currentSubLThread();
        if (module0705.NIL != module0701.f42628(var4)) {
            return module0701.f42671(var4, var57);
        }
        return module0703.f42873(module0057.f4175(module0705.$g5519$.getDynamicValue(var58)));
    }
    
    public static SubLObject f42968() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42913", "S#46940", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42915", "S#46941", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42916", "S#46644", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42914", "S#46942", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42918", "S#46943", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42919", "S#46944", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42917", "S#46945", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42920", "S#46946", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42922", "S#46947", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42924", "S#46948", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42923", "S#46949", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42928", "S#46950", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42930", "S#46951", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42934", "S#46952", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42938", "S#46953", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42943", "S#46954", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42940", "S#46955", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42939", "S#46956", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42947", "S#46957", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42941", "S#46958", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42936", "S#46959", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42933", "S#46960", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42945", "S#46961", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42944", "S#46962", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42929", "S#46963", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42925", "S#46964", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42954", "S#46965", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42955", "S#46966", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42953", "S#46967", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42957", "S#46968", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42926", "S#46969", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42958", "S#46970", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42959", "S#46971", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42956", "S#46972", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42960", "S#46973", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42951", "S#46974", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42937", "S#46975", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42962", "S#46976", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42961", "S#46977", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42963", "S#46978", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42950", "S#46979", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42952", "S#46980", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42932", "S#46981", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42927", "S#46982", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42964", "S#46983", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42949", "S#46984", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42966", "S#46985", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42942", "S#46986", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42967", "S#46987", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42921", "S#46988", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42931", "S#46989", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42935", "S#46990", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42946", "S#46991", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42948", "S#46992", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0705", "f42965", "S#46993", 2, 0, false);
        return (SubLObject)module0705.NIL;
    }
    
    public static SubLObject f42969() {
        module0705.$g5517$ = SubLFiles.defparameter("S#46994", (SubLObject)module0705.NIL);
        module0705.$g5518$ = SubLFiles.defparameter("S#46995", module0107.f7627());
        module0705.$g5519$ = SubLFiles.defparameter("S#46996", module0107.f7627());
        module0705.$g5520$ = SubLFiles.defparameter("S#46997", module0107.f7627());
        module0705.$g5521$ = SubLFiles.defparameter("S#46998", module0107.f7627());
        module0705.$g5522$ = SubLFiles.defparameter("S#46999", (SubLObject)module0705.NIL);
        module0705.$g5523$ = SubLFiles.deflexical("S#47000", (SubLObject)module0705.NIL);
        module0705.$g5524$ = SubLFiles.deflexical("S#47001", (SubLObject)module0705.NIL);
        module0705.$g5525$ = SubLFiles.deflexical("S#47002", (SubLObject)module0705.$ic50$);
        module0705.$g5526$ = SubLFiles.deflexical("S#47003", (SubLObject)module0705.$ic50$);
        return (SubLObject)module0705.NIL;
    }
    
    public static SubLObject f42970() {
        module0034.f1909((SubLObject)module0705.$ic43$);
        module0034.f1909((SubLObject)module0705.$ic47$);
        return (SubLObject)module0705.NIL;
    }
    
    public void declareFunctions() {
        f42968();
    }
    
    public void initializeVariables() {
        f42969();
    }
    
    public void runTopLevelForms() {
        f42970();
    }
    
    static {
        me = (SubLFile)new module0705();
        module0705.$g5517$ = null;
        module0705.$g5518$ = null;
        module0705.$g5519$ = null;
        module0705.$g5520$ = null;
        module0705.$g5521$ = null;
        module0705.$g5522$ = null;
        module0705.$g5523$ = null;
        module0705.$g5524$ = null;
        module0705.$g5525$ = null;
        module0705.$g5526$ = null;
        $ic0$ = SubLObjectFactory.makeString("file:/");
        $ic1$ = SubLObjectFactory.makeSymbol("S#6825", "CYC");
        $ic2$ = SubLObjectFactory.makeKeyword("INPUT");
        $ic3$ = SubLObjectFactory.makeString("Unable to open ~S");
        $ic4$ = SubLObjectFactory.makeString("Ontology");
        $ic5$ = SubLObjectFactory.makeString("type");
        $ic6$ = SubLObjectFactory.makeSymbol("URL-P");
        $ic7$ = SubLObjectFactory.makeKeyword("OUTPUT");
        $ic8$ = SubLObjectFactory.makeSymbol("S#46652", "CYC");
        $ic9$ = SubLObjectFactory.makeString("base");
        $ic10$ = SubLObjectFactory.makeString("lang");
        $ic11$ = SubLObjectFactory.makeInteger(10000);
        $ic12$ = SubLObjectFactory.makeString("Parsing RDF/XML stream...");
        $ic13$ = SubLObjectFactory.makeInteger(1000);
        $ic14$ = SubLObjectFactory.makeString(".");
        $ic15$ = SubLObjectFactory.makeSymbol("S#46973", "CYC");
        $ic16$ = SubLObjectFactory.makeString("li");
        $ic17$ = SubLObjectFactory.makeString("rdf:li is not allowed as as an attribute");
        $ic18$ = SubLObjectFactory.makeString("Description");
        $ic19$ = SubLObjectFactory.makeString("_");
        $ic20$ = SubLObjectFactory.makeString("resource");
        $ic21$ = SubLObjectFactory.makeString("This is not legal RDF; specifying an rdf:parseType of \"Literal\" and an rdf:resource attribute at the same time is an error.");
        $ic22$ = SubLObjectFactory.makeString("Resource");
        $ic23$ = SubLObjectFactory.makeString("parseType");
        $ic24$ = SubLObjectFactory.makeString("Collection");
        $ic25$ = SubLObjectFactory.makeString("parseTypeOtherPropertyElt not yet implemented (7.2.20).");
        $ic26$ = SubLObjectFactory.makeString("ID");
        $ic27$ = SubLObjectFactory.makeString("Can't handle property element: ~A");
        $ic28$ = SubLObjectFactory.makeSymbol("S#46974", "CYC");
        $ic29$ = SubLObjectFactory.makeString("rdf:parseType=\"Literal\" is forbidden here since we're creating an additional resource node.");
        $ic30$ = SubLObjectFactory.makeString("datatype");
        $ic31$ = SubLObjectFactory.makeString("");
        $ic32$ = SubLObjectFactory.makeString("Statement");
        $ic33$ = SubLObjectFactory.makeString("subject");
        $ic34$ = SubLObjectFactory.makeString("predicate");
        $ic35$ = SubLObjectFactory.makeString("object");
        $ic36$ = SubLObjectFactory.makeString("nil");
        $ic37$ = SubLObjectFactory.makeString("rest");
        $ic38$ = SubLObjectFactory.makeString("first");
        $ic39$ = SubLObjectFactory.makeString("Literal");
        $ic40$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#1737", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
        $ic41$ = SubLObjectFactory.makeString("xml");
        $ic42$ = SubLObjectFactory.makeString("~S has been removed from the RDF specification.");
        $ic43$ = SubLObjectFactory.makeSymbol("S#46967", "CYC");
        $ic44$ = SubLObjectFactory.makeString("xmlns");
        $ic45$ = SubLObjectFactory.makeSymbol("S#47000", "CYC");
        $ic46$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic47$ = SubLObjectFactory.makeSymbol("S#46972", "CYC");
        $ic48$ = SubLObjectFactory.makeString("xmlns:");
        $ic49$ = SubLObjectFactory.makeSymbol("S#47001", "CYC");
        $ic50$ = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $ic51$ = SubLObjectFactory.makeString("RDF");
        $ic52$ = SubLObjectFactory.makeString("about");
        $ic53$ = SubLObjectFactory.makeString("nodeID");
        $ic54$ = SubLObjectFactory.makeString("Unable to initialize ~A~%");
        $ic55$ = SubLObjectFactory.makeSymbol("S#46518", "CYC");
        $ic56$ = SubLObjectFactory.makeString("aboutEach");
        $ic57$ = SubLObjectFactory.makeString("aboutEachPrefix");
        $ic58$ = SubLObjectFactory.makeString("bagID");
        $ic59$ = SubLObjectFactory.makeString("XMLLiteral");
        $ic60$ = SubLObjectFactory.makeString("Cannot have rdf:nodeID and rdf:ID.");
        $ic61$ = SubLObjectFactory.makeString("Cannot have rdf:about and rdf:ID.");
        $ic62$ = SubLObjectFactory.makeString("Cannot have rdf:nodeID and rdf:about");
        $ic63$ = SubLObjectFactory.makeString("Cannot have rdf:nodeID and rdf:resource");
        $ic64$ = SubLObjectFactory.makeSymbol("S#46985", "CYC");
        $ic65$ = SubLObjectFactory.makeString("Name clash: Graph already has node with ID ~S");
        $ic66$ = SubLObjectFactory.makeSymbol("S#39767", "CYC");
        $ic67$ = SubLObjectFactory.makeString("#");
        $ic68$ = SubLObjectFactory.makeString("Couldn't resolve local name ~S");
        $ic69$ = SubLObjectFactory.makeString("Output must be to either an RDF Graph or an output stream, not ~S");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0705.class
	Total time: 340 ms
	
	Decompiled with Procyon 0.5.32.
*/