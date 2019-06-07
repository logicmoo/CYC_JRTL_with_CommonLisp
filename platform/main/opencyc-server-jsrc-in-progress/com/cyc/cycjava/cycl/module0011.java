package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0011 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0011";
    public static final String myFingerPrint = "87c436ffbec68a3168168699e95f3eb1a9542207cb63010c0c9870fe77385236";
    public static SubLSymbol $g34$;
    public static SubLSymbol $g35$;
    private static SubLSymbol $g37$;
    private static SubLSymbol $g38$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
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
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLString $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    
    public static SubLObject f326(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (NIL == conses_high.member(var1, $g35$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            $g35$.setGlobalValue((SubLObject)ConsesLow.cons(var1, $g35$.getGlobalValue()));
        }
        if (NIL == conses_high.member(var1, reader.$features$.getDynamicValue(var2), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            reader.$features$.setDynamicValue((SubLObject)ConsesLow.cons(var1, reader.$features$.getDynamicValue(var2)), var2);
        }
        return var1;
    }
    
    public static SubLObject f327(final SubLObject var4, final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        final SubLObject var7 = var4.rest();
        if (NIL != var7) {
            cdestructuring_bind.cdestructuring_bind_error(var7, (SubLObject)NIL);
        }
        SubLObject var8 = $g35$.getGlobalValue();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10;
        var8 = (var10 = Sort.sort(conses_high.copy_list(var8), Symbols.symbol_function((SubLObject)$ic1$), Symbols.symbol_function((SubLObject)$ic2$)));
        SubLObject var11 = (SubLObject)NIL;
        var11 = var10.first();
        while (NIL != var10) {
            if (NIL != conses_high.member(var11, reader.$features$.getDynamicValue(var6), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var9 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic3$, var11), var9);
            }
            var10 = var10.rest();
            var11 = var10.first();
        }
        return reader.bq_cons((SubLObject)$ic4$, ConsesLow.append(Sequences.nreverse(var9), (SubLObject)NIL));
    }
    
    public static SubLObject f328(final SubLObject var4, final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        SubLObject var8;
        final SubLObject var7 = var8 = var4.rest();
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)$ic19$);
        var9 = var8.first();
        var8 = var8.rest();
        if (NIL == var8) {
            return (SubLObject)makeBoolean(NIL != conses_high.member(var9, reader.$features$.getDynamicValue(var6), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        cdestructuring_bind.cdestructuring_bind_error(var7, (SubLObject)$ic19$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f329() {
        return (SubLObject)T;
    }
    
    public static SubLObject f330() {
        return (SubLObject)T;
    }
    
    public static SubLObject f331() {
        return (SubLObject)T;
    }
    
    public static SubLObject f332() {
        return (SubLObject)T;
    }
    
    public static SubLObject f333() {
        return (SubLObject)T;
    }
    
    public static SubLObject f334() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f335() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f336() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f337() {
        return (SubLObject)T;
    }
    
    public static SubLObject f338() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f339() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f340() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f341() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f342() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f343() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f344() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f345() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f346() {
        return (SubLObject)T;
    }
    
    public static SubLObject f347() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f348() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f349(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        return Equality.eq(module0110.$g36$.getDynamicValue(var13), var12);
    }
    
    public static SubLObject f350() {
        return f349((SubLObject)$ic20$);
    }
    
    public static SubLObject f351() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return module0010.$g22$.getDynamicValue(var2);
    }
    
    public static SubLObject f352() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return Sequences.cconcatenate((SubLObject)$ic23$, module0006.f203(Sequences.substitute((SubLObject)Characters.CHAR_p, (SubLObject)Characters.CHAR_period, module0010.$g22$.getDynamicValue(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f353() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return module0010.$g21$.getDynamicValue(var2);
    }
    
    public static SubLObject f354(SubLObject var13) {
        if (var13 == UNPROVIDED) {
            var13 = Time.get_universal_time();
        }
        $g37$.setGlobalValue(var13);
        return $g37$.getGlobalValue();
    }
    
    public static SubLObject f355() {
        return $g37$.getGlobalValue();
    }
    
    public static SubLObject f356() {
        return Numbers.subtract(Time.get_universal_time(), f355());
    }
    
    public static SubLObject f357(final SubLObject var14, final SubLObject var15, final SubLObject var16, final SubLObject var17) {
        f358();
        return Functions.funcall($g38$.getGlobalValue(), var14, var15, module0035.sublisp_boolean(var16), module0035.sublisp_boolean(var17));
    }
    
    public static SubLObject f358() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        Packages.$package$.setDynamicValue(Packages.find_package((SubLObject)$ic29$), var2);
        PrintLow.format(StreamsLow.$standard_output$.getDynamicValue(var2), (SubLObject)$ic30$, Environment.get_process_id((SubLObject)UNPROVIDED));
        PrintLow.format(StreamsLow.$standard_output$.getDynamicValue(var2), (SubLObject)$ic31$, f351(), module0018.f971());
        PrintLow.format(StreamsLow.$standard_output$.getDynamicValue(var2), (SubLObject)$ic32$, module0075.f5178());
        streams_high.force_output(StreamsLow.$terminal_io$.getDynamicValue(var2));
        return (SubLObject)T;
    }
    
    public static SubLObject f359() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0011", "f326", "S#330", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0011", "f327", "S#331");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0011", "f328", "S#332");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0011", "f329", "CYC-HTML-FEATURE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0011", "f330", "S#333", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0011", "f331", "S#334", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0011", "f332", "S#335", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0011", "f333", "S#336", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0011", "f334", "S#337", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0011", "f335", "S#338", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0011", "f336", "S#339", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0011", "f337", "S#340", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0011", "f338", "S#341", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0011", "f339", "CYC-THESAURUS-FEATURE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0011", "f340", "S#342", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0011", "f341", "S#343", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0011", "f342", "S#344", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0011", "f343", "S#345", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0011", "f344", "S#346", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0011", "f345", "S#347", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0011", "f346", "CYC-OPENCYC-FEATURE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0011", "f347", "CYC-RESEARCHCYC-FEATURE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0011", "f348", "S#348", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0011", "f349", "S#349", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0011", "f350", "S#350", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0011", "f351", "CYC-REVISION-STRING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0011", "f352", "CYC-REVISION-STRING-S1P-FORMAT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0011", "f353", "CYC-REVISION-NUMBERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0011", "f354", "S#351", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0011", "f355", "CYCL-START-TIME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0011", "f356", "S#352", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0011", "f357", "S#353", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0011", "f358", "S#354", 0, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f360() {
        $g34$ = SubLFiles.deflexical("S#355", Filesys.construct_filename((SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)T));
        $g35$ = SubLFiles.deflexical("S#356", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic0$)) ? $g35$.getGlobalValue() : NIL));
        $g37$ = SubLFiles.deflexical("S#357", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic25$)) ? $g37$.getGlobalValue() : NIL));
        $g38$ = SubLFiles.deflexical("S#358", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic27$)) ? $g38$.getGlobalValue() : NIL));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f361() {
        f326((SubLObject)$ic5$);
        f326((SubLObject)$ic6$);
        f326((SubLObject)$ic7$);
        f326((SubLObject)$ic8$);
        f326((SubLObject)$ic9$);
        f326((SubLObject)$ic10$);
        f326((SubLObject)$ic11$);
        f326((SubLObject)$ic12$);
        f326((SubLObject)$ic13$);
        f326((SubLObject)$ic14$);
        f326((SubLObject)$ic15$);
        f326((SubLObject)$ic16$);
        f326((SubLObject)$ic17$);
        f326((SubLObject)$ic18$);
        module0002.f38((SubLObject)$ic21$);
        module0002.f38((SubLObject)$ic22$);
        module0002.f38((SubLObject)$ic24$);
        module0003.f57((SubLObject)$ic25$);
        module0002.f38((SubLObject)$ic26$);
        module0003.f57((SubLObject)$ic27$);
        $g38$.setGlobalValue(Eval.get_initial_continuation());
        Eval.set_initial_continuation((SubLObject)$ic28$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f359();
    }
    
    public void initializeVariables() {
        f360();
    }
    
    public void runTopLevelForms() {
        f361();
    }
    
    static {
        me = (SubLFile)new module0011();
        $g34$ = null;
        $g35$ = null;
        $g37$ = null;
        $g38$ = null;
        $ic0$ = makeSymbol("S#356", "CYC");
        $ic1$ = makeSymbol("STRING<");
        $ic2$ = makeSymbol("SYMBOL-NAME");
        $ic3$ = makeSymbol("S#330", "CYC");
        $ic4$ = makeSymbol("PROGN");
        $ic5$ = makeKeyword("CYC-API-LOCKDOWN");
        $ic6$ = makeKeyword("CYC-BROWSER");
        $ic7$ = makeKeyword("CYC-DATE");
        $ic8$ = makeKeyword("CYC-EVENT");
        $ic9$ = makeKeyword("CYC-GRAPHER");
        $ic10$ = makeKeyword("CYC-HTML");
        $ic11$ = makeKeyword("CYC-LEXICON");
        $ic12$ = makeKeyword("CYC-OPENCYC");
        $ic13$ = makeKeyword("CYC-PPH");
        $ic14$ = makeKeyword("CYC-QUANT");
        $ic15$ = makeKeyword("CYC-REFORMULATOR");
        $ic16$ = makeKeyword("CYC-REGEX");
        $ic17$ = makeKeyword("CYC-TIME");
        $ic18$ = makeKeyword("CYC-WORDNET");
        $ic19$ = ConsesLow.list((SubLObject)makeSymbol("S#359", "CYC"));
        $ic20$ = makeKeyword("CYCORP");
        $ic21$ = makeSymbol("CYC-REVISION-STRING");
        $ic22$ = makeSymbol("CYC-REVISION-STRING-S1P-FORMAT");
        $ic23$ = makeString("s");
        $ic24$ = makeSymbol("CYC-REVISION-NUMBERS");
        $ic25$ = makeSymbol("S#357", "CYC");
        $ic26$ = makeSymbol("CYCL-START-TIME");
        $ic27$ = makeSymbol("S#358", "CYC");
        $ic28$ = makeSymbol("S#353", "CYC");
        $ic29$ = makeString("CYC");
        $ic30$ = makeString("Process ID: ~D~%");
        $ic31$ = makeString("System ~:[<unknown>~;~:*~A~]~@[ KB ~D~].~%");
        $ic32$ = makeString("Working Directory: ~A~%");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 86 ms
	
	Decompiled with Procyon 0.5.32.
*/