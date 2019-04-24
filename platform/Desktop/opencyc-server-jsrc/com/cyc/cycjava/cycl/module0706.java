package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0706 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0706";
    public static final String myFingerPrint = "b8601ee5fbaa414fc7fab1a66fdbbef0aa2142cab8b3aa25998b3c7f8cb669b6";
    private static SubLSymbol $g5527$;
    private static SubLSymbol $g5528$;
    private static final SubLInteger $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLString $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLString $ic5$;
    private static final SubLString $ic6$;
    private static final SubLString $ic7$;
    private static final SubLString $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
    private static final SubLString $ic11$;
    private static final SubLInteger $ic12$;
    private static final SubLInteger $ic13$;
    private static final SubLString $ic14$;
    
    public static SubLObject f42971(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0701.f42625();
        SubLObject var4 = (SubLObject)module0706.NIL;
        try {
            final SubLObject var5 = stream_macros.$stream_requires_locking$.currentBinding(var2);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)module0706.NIL, var2);
                var4 = compatibility.open_text(var1, (SubLObject)module0706.$ic1$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var5, var2);
            }
            if (!var4.isStream()) {
                Errors.error((SubLObject)module0706.$ic2$, var1);
            }
            final SubLObject var6 = var4;
            if (var6.isStream()) {
                final SubLObject var8_9 = var6;
                SubLObject var7 = (SubLObject)module0706.NIL;
                SubLObject var8 = (SubLObject)module0706.NIL;
                var7 = (SubLObject)module0706.ZERO_INTEGER;
                for (var8 = module0075.f5202(var8_9); module0706.NIL != var8; var8 = module0075.f5202(var8_9)) {
                    f42972(var8, var3);
                    var7 = module0048.f_1X(var7);
                }
            }
        }
        finally {
            final SubLObject var9 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0706.T, var2);
                if (var4.isStream()) {
                    streams_high.close(var4, (SubLObject)module0706.UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var9, var2);
            }
        }
        return var3;
    }
    
    public static SubLObject f42972(final SubLObject var11, final SubLObject var3) {
        final SubLObject var12 = Strings.string_right_trim(module0706.$g5528$.getGlobalValue(), Strings.string_left_trim(module0706.$g5527$.getGlobalValue(), var11));
        if (module0706.NIL == module0038.f2608(var12) && module0706.NIL == f42973(var12)) {
            f42974(var12, var3);
        }
        return (SubLObject)module0706.NIL;
    }
    
    public static SubLObject f42973(final SubLObject var12) {
        return Equality.eql(module0038.f2636(var12), (SubLObject)Characters.CHAR_hash);
    }
    
    public static SubLObject f42974(final SubLObject var13, final SubLObject var3) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        var14.resetMultipleValues();
        final SubLObject var15 = f42975(var13);
        final SubLObject var16 = var14.secondMultipleValue();
        final SubLObject var17 = var14.thirdMultipleValue();
        var14.resetMultipleValues();
        final SubLObject var18 = f42976(var15, var3);
        final SubLObject var19 = f42977(var16);
        final SubLObject var20 = f42978(var17, var3);
        module0701.f42627(var3, var18, var19, var20);
        return (SubLObject)module0706.NIL;
    }
    
    public static SubLObject f42975(final SubLObject var13) {
        SubLObject var14 = (SubLObject)module0706.$ic3$;
        SubLObject var15 = (SubLObject)module0706.NIL;
        SubLObject var16 = streams_high.make_private_string_output_stream();
        SubLObject var17 = (SubLObject)module0706.NIL;
        SubLObject var18 = (SubLObject)module0706.NIL;
        SubLObject var19 = (SubLObject)module0706.NIL;
        SubLObject var20 = (SubLObject)module0706.NIL;
        final SubLObject var21 = Sequences.length(var13);
        if (module0706.NIL == var20) {
            SubLObject var26_27;
            SubLObject var22;
            SubLObject var23;
            SubLObject var24;
            for (var26_27 = var21, var22 = (SubLObject)module0706.NIL, var22 = (SubLObject)module0706.ZERO_INTEGER; module0706.NIL == var20 && !var22.numGE(var26_27); var22 = module0048.f_1X(var22)) {
                var23 = Strings.sublisp_char(var13, var22);
                var24 = var14;
                if (var24.eql((SubLObject)module0706.$ic3$)) {
                    if (module0706.NIL == conses_high.member(var23, module0706.$g5527$.getGlobalValue(), (SubLObject)module0706.UNPROVIDED, (SubLObject)module0706.UNPROVIDED)) {
                        print_high.princ(var23, var16);
                        var15 = Equality.eql((SubLObject)Characters.CHAR_quotation, var23);
                        var14 = (SubLObject)module0706.$ic4$;
                    }
                }
                else if (var24.eql((SubLObject)module0706.$ic4$)) {
                    if (module0706.NIL != var15 || module0706.NIL == conses_high.member(var23, module0706.$g5527$.getGlobalValue(), (SubLObject)module0706.UNPROVIDED, (SubLObject)module0706.UNPROVIDED)) {
                        print_high.princ(var23, var16);
                        var15 = (SubLObject)SubLObjectFactory.makeBoolean(module0706.NIL != var15 && (var17.eql((SubLObject)Characters.CHAR_backslash) || !Characters.CHAR_quotation.eql(var23)));
                    }
                    else if (module0706.NIL == var18) {
                        var18 = streams_high.get_output_stream_string(var16);
                        var16 = streams_high.make_private_string_output_stream();
                        var14 = (SubLObject)module0706.$ic3$;
                    }
                    else if (module0706.NIL == var19) {
                        var19 = streams_high.get_output_stream_string(var16);
                        var16 = streams_high.make_private_string_output_stream();
                        var14 = (SubLObject)module0706.$ic3$;
                    }
                    else if (module0706.NIL == var20) {
                        var20 = streams_high.get_output_stream_string(var16);
                    }
                }
                var17 = var23;
            }
        }
        return Values.values(var18, var19, var20);
    }
    
    public static SubLObject f42976(final SubLObject var14, final SubLObject var3) {
        final SubLObject var15 = module0038.f2636(var14);
        if (var15.eql((SubLObject)Characters.CHAR_less)) {
            return f42979(var14);
        }
        if (var15.eql((SubLObject)Characters.CHAR_underbar)) {
            return f42980(var14, var3);
        }
        Errors.error((SubLObject)module0706.$ic5$, var14);
        return (SubLObject)module0706.NIL;
    }
    
    public static SubLObject f42977(final SubLObject var15) {
        final SubLObject var16 = module0038.f2636(var15);
        if (var16.eql((SubLObject)Characters.CHAR_less)) {
            return f42979(var15);
        }
        Errors.error((SubLObject)module0706.$ic6$, var15);
        return (SubLObject)module0706.NIL;
    }
    
    public static SubLObject f42978(final SubLObject var16, final SubLObject var3) {
        final SubLObject var17 = module0038.f2636(var16);
        if (var17.eql((SubLObject)Characters.CHAR_less)) {
            return f42979(var16);
        }
        if (var17.eql((SubLObject)Characters.CHAR_quotation)) {
            return f42981(var16);
        }
        if (var17.eql((SubLObject)Characters.CHAR_underbar)) {
            return f42980(var16, var3);
        }
        Errors.error((SubLObject)module0706.$ic7$, var16);
        return (SubLObject)module0706.NIL;
    }
    
    public static SubLObject f42979(final SubLObject var31) {
        return f42982(module0038.f2674(module0038.f2621(var31, (SubLObject)module0706.$ic8$, (SubLObject)module0706.UNPROVIDED), (SubLObject)module0706.$ic9$, (SubLObject)module0706.UNPROVIDED));
    }
    
    public static SubLObject f42981(final SubLObject var32) {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        SubLObject var34;
        for (var34 = Sequences.position((SubLObject)Characters.CHAR_quotation, var32, Symbols.symbol_function((SubLObject)module0706.EQL), Symbols.symbol_function((SubLObject)module0706.IDENTITY), (SubLObject)module0706.ONE_INTEGER, (SubLObject)module0706.UNPROVIDED); module0706.NIL != var34 && Characters.CHAR_backslash.eql(Strings.sublisp_char(var32, module0048.f_1_(var34))); var34 = Sequences.position((SubLObject)Characters.CHAR_quotation, var32, Symbols.symbol_function((SubLObject)module0706.EQL), Symbols.symbol_function((SubLObject)module0706.IDENTITY), module0048.f_1X(var34), (SubLObject)module0706.UNPROVIDED)) {}
        if (module0706.NIL == Errors.$ignore_mustsP$.getDynamicValue(var33) && module0706.NIL == var34) {
            Errors.error((SubLObject)module0706.$ic10$, var32);
        }
        final SubLObject var35 = f42982(module0038.f2623(var32, (SubLObject)module0706.ONE_INTEGER, var34));
        SubLObject var36 = (SubLObject)module0706.NIL;
        SubLObject var37 = (SubLObject)module0706.NIL;
        if (module0706.NIL == module0035.f1995(var32, module0048.f_1X(var34), (SubLObject)module0706.UNPROVIDED)) {
            if (Strings.sublisp_char(var32, module0048.f_1X(var34)).eql((SubLObject)Characters.CHAR_at)) {
                var36 = module0038.f2623(var32, Numbers.add(var34, (SubLObject)module0706.TWO_INTEGER), (SubLObject)module0706.UNPROVIDED);
            }
            else if (Strings.sublisp_char(var32, module0048.f_1X(var34)).eql((SubLObject)Characters.CHAR_caret)) {
                var37 = f42979(module0038.f2623(var32, Numbers.add(var34, (SubLObject)module0706.THREE_INTEGER), (SubLObject)module0706.UNPROVIDED));
            }
            else {
                Errors.error((SubLObject)module0706.$ic11$, var32);
            }
        }
        return module0704.f42898(var35, var36, var37);
    }
    
    public static SubLObject f42982(final SubLObject var37) {
        if (module0706.NIL == Sequences.find((SubLObject)Characters.CHAR_backslash, var37, (SubLObject)module0706.UNPROVIDED, (SubLObject)module0706.UNPROVIDED, (SubLObject)module0706.UNPROVIDED, (SubLObject)module0706.UNPROVIDED)) {
            return var37;
        }
        return module0039.f3048(module0039.f3018(f42983(var37), (SubLObject)module0706.UNPROVIDED, (SubLObject)module0706.UNPROVIDED));
    }
    
    public static SubLObject f42983(final SubLObject var37) {
        SubLObject var38 = (SubLObject)module0706.NIL;
        for (SubLObject var39 = (SubLObject)module0706.ZERO_INTEGER; module0706.NIL != module0035.f2002(var37, var39, (SubLObject)module0706.UNPROVIDED); var39 = Numbers.add(var39, (SubLObject)module0706.ONE_INTEGER)) {
            final SubLObject var40 = Strings.sublisp_char(var37, var39);
            SubLObject var41 = Characters.char_code(var40);
            if (var40.eql((SubLObject)Characters.CHAR_backslash)) {
                final SubLObject var42 = Strings.sublisp_char(var37, module0048.f_1X(var39));
                if (var42.eql((SubLObject)Characters.CHAR_u)) {
                    final SubLObject var43 = module0038.f2623(var37, Numbers.add(var39, (SubLObject)module0706.TWO_INTEGER), Numbers.add(var39, (SubLObject)module0706.SIX_INTEGER));
                    var41 = module0048.f3439(var43);
                    var39 = Numbers.add(var39, (SubLObject)module0706.FIVE_INTEGER);
                }
                else if (var42.eql((SubLObject)Characters.CHAR_U)) {
                    final SubLObject var43 = module0038.f2623(var37, Numbers.add(var39, (SubLObject)module0706.TWO_INTEGER), Numbers.add(var39, (SubLObject)module0706.TEN_INTEGER));
                    var41 = module0048.f3439(var43);
                    var39 = Numbers.add(var39, (SubLObject)module0706.NINE_INTEGER);
                }
                else if (var42.eql((SubLObject)Characters.CHAR_t)) {
                    var41 = (SubLObject)module0706.NINE_INTEGER;
                    var39 = Numbers.add(var39, (SubLObject)module0706.ONE_INTEGER);
                }
                else if (var42.eql((SubLObject)Characters.CHAR_n)) {
                    var41 = (SubLObject)module0706.TEN_INTEGER;
                    var39 = Numbers.add(var39, (SubLObject)module0706.ONE_INTEGER);
                }
                else if (var42.eql((SubLObject)Characters.CHAR_r)) {
                    var41 = (SubLObject)module0706.THIRTEEN_INTEGER;
                    var39 = Numbers.add(var39, (SubLObject)module0706.ONE_INTEGER);
                }
                else if (var42.eql((SubLObject)Characters.CHAR_quotation)) {
                    var41 = (SubLObject)module0706.$ic12$;
                    var39 = Numbers.add(var39, (SubLObject)module0706.ONE_INTEGER);
                }
                else if (var42.eql((SubLObject)Characters.CHAR_backslash)) {
                    var41 = (SubLObject)module0706.$ic13$;
                    var39 = Numbers.add(var39, (SubLObject)module0706.ONE_INTEGER);
                }
                else {
                    Errors.error((SubLObject)module0706.$ic14$, var40, var39);
                }
            }
            var38 = (SubLObject)ConsesLow.cons(var41, var38);
        }
        return module0035.f2105(Sequences.nreverse(var38));
    }
    
    public static SubLObject f42980(final SubLObject var42, final SubLObject var3) {
        return module0701.f42671(var3, module0038.f2623(var42, (SubLObject)module0706.TWO_INTEGER, (SubLObject)module0706.UNPROVIDED));
    }
    
    public static SubLObject f42984() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0706", "f42971", "S#47004", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0706", "f42972", "S#47005", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0706", "f42973", "S#47006", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0706", "f42974", "S#47007", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0706", "f42975", "S#47008", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0706", "f42976", "S#47009", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0706", "f42977", "S#47010", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0706", "f42978", "S#47011", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0706", "f42979", "S#47012", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0706", "f42981", "S#47013", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0706", "f42982", "S#47014", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0706", "f42983", "S#47015", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0706", "f42980", "S#47016", 2, 0, false);
        return (SubLObject)module0706.NIL;
    }
    
    public static SubLObject f42985() {
        module0706.$g5527$ = SubLFiles.deflexical("S#47017", (SubLObject)ConsesLow.list(Characters.code_char((SubLObject)module0706.$ic0$), Characters.code_char((SubLObject)module0706.NINE_INTEGER)));
        module0706.$g5528$ = SubLFiles.deflexical("S#47018", (SubLObject)ConsesLow.list(Characters.code_char((SubLObject)module0706.THIRTEEN_INTEGER), Characters.code_char((SubLObject)module0706.TEN_INTEGER)));
        return (SubLObject)module0706.NIL;
    }
    
    public static SubLObject f42986() {
        return (SubLObject)module0706.NIL;
    }
    
    public void declareFunctions() {
        f42984();
    }
    
    public void initializeVariables() {
        f42985();
    }
    
    public void runTopLevelForms() {
        f42986();
    }
    
    static {
        me = (SubLFile)new module0706();
        module0706.$g5527$ = null;
        module0706.$g5528$ = null;
        $ic0$ = SubLObjectFactory.makeInteger(32);
        $ic1$ = SubLObjectFactory.makeKeyword("INPUT");
        $ic2$ = SubLObjectFactory.makeString("Unable to open ~S");
        $ic3$ = SubLObjectFactory.makeKeyword("BETWEEN-TOKENS");
        $ic4$ = SubLObjectFactory.makeKeyword("READING-TOKEN");
        $ic5$ = SubLObjectFactory.makeString("Illegal n-subject: ~S");
        $ic6$ = SubLObjectFactory.makeString("Illegal n-predicate: ~S");
        $ic7$ = SubLObjectFactory.makeString("Illegal n-object: ~S");
        $ic8$ = SubLObjectFactory.makeString(">");
        $ic9$ = SubLObjectFactory.makeString("<");
        $ic10$ = SubLObjectFactory.makeString("No close quote in ~A");
        $ic11$ = SubLObjectFactory.makeString("Invalid n-literal: ~A");
        $ic12$ = SubLObjectFactory.makeInteger(34);
        $ic13$ = SubLObjectFactory.makeInteger(92);
        $ic14$ = SubLObjectFactory.makeString("Invalid n-triple escape char ~S at ~D");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0706.class
	Total time: 143 ms
	
	Decompiled with Procyon 0.5.32.
*/