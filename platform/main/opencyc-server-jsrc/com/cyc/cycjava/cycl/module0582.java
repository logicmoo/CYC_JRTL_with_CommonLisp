package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0582 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0582";
    public static final String myFingerPrint = "94447e5cf4ec5d4e6110478a69562e148c74bcaf802ed5ff3577eae5b461da5d";
    private static SubLSymbol $g4381$;
    private static SubLSymbol $g4382$;
    private static SubLSymbol $g4383$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
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
    private static final SubLList $ic17$;
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLList $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLList $ic30$;
    private static final SubLList $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLList $ic33$;
    private static final SubLList $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLList $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLString $ic41$;
    private static final SubLString $ic42$;
    private static final SubLList $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLList $ic45$;
    private static final SubLList $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLList $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLList $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLString $ic61$;
    
    public static SubLObject f35694() {
        return $g4381$.getGlobalValue();
    }
    
    public static SubLObject f35695(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic3$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic3$);
        var6 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic3$);
        var7 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var8;
            var4 = (var8 = var5);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic4$, (SubLObject)ConsesLow.listS(var6, var7, (SubLObject)$ic5$), ConsesLow.append(var8, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic3$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35696(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic6$);
        var5 = var4.first();
        var4 = var4.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic6$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL != var4) {
            cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic6$);
            return (SubLObject)NIL;
        }
        final SubLObject var7 = (SubLObject)$ic7$;
        if (NIL != conses_high.getf(var6, (SubLObject)$ic8$, (SubLObject)NIL)) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic9$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, var6)), (SubLObject)ConsesLow.list((SubLObject)$ic10$, var5, var7), (SubLObject)ConsesLow.list((SubLObject)$ic11$, var5, var7));
        }
        return (SubLObject)ConsesLow.list((SubLObject)$ic12$, (SubLObject)ConsesLow.list((SubLObject)$ic13$, var5, var6), (SubLObject)ConsesLow.list((SubLObject)$ic9$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, var6)), (SubLObject)ConsesLow.list((SubLObject)$ic14$, var7, (SubLObject)$ic8$, (SubLObject)ConsesLow.list((SubLObject)$ic15$, var5)), (SubLObject)ConsesLow.list((SubLObject)$ic10$, var5, var7), (SubLObject)ConsesLow.list((SubLObject)$ic11$, var5, var7)));
    }
    
    public static SubLObject f35697(final SubLObject var11, final SubLObject var13) {
        return module0067.f4886($g4381$.getGlobalValue(), var11, var13);
    }
    
    public static SubLObject f35698(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var5;
        final SubLObject var4 = var5 = var1.rest();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic17$);
        var6 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic17$);
        var7 = var5.first();
        var5 = var5.rest();
        if (NIL == var5) {
            var3.resetMultipleValues();
            final SubLObject var8 = f35699(var6);
            final SubLObject var9 = var3.secondMultipleValue();
            var3.resetMultipleValues();
            final SubLObject var10 = Sequences.cconcatenate((SubLObject)$ic18$, new SubLObject[] { module0006.f205(var6), $ic19$, module0006.$g11$.getGlobalValue() });
            final SubLObject var11 = Eval.eval(var7);
            final SubLObject var12 = f35700(var11);
            final SubLObject var13 = conses_high.getf(var11, (SubLObject)$ic20$, (SubLObject)$ic21$);
            return (SubLObject)ConsesLow.list((SubLObject)$ic12$, (SubLObject)ConsesLow.listS((SubLObject)$ic22$, new SubLObject[] { var9, $ic23$, ConsesLow.list((SubLObject)$ic24$, var8), var10, ConsesLow.list((SubLObject)$ic25$, (SubLObject)$ic26$, var13), $ic27$, ConsesLow.listS((SubLObject)$ic28$, (SubLObject)$ic29$, var6, (SubLObject)$ic30$), $ic31$ }), (SubLObject)ConsesLow.list((SubLObject)$ic32$, var8, (SubLObject)$ic33$, var10, reader.bq_cons(var12, (SubLObject)$ic34$), (SubLObject)ConsesLow.list((SubLObject)$ic35$, (SubLObject)$ic36$, (SubLObject)ConsesLow.list((SubLObject)$ic37$, (SubLObject)ConsesLow.list((SubLObject)$ic38$, (SubLObject)$ic39$, (SubLObject)$ic29$, (SubLObject)$ic26$, (SubLObject)ConsesLow.list((SubLObject)$ic40$, var9))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic17$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35701(final SubLObject var23, final SubLObject var11, final SubLObject var7) {
        module0067.f4886(var23, var11, var7);
        return var23;
    }
    
    public static SubLObject f35702(final SubLObject var24, final SubLObject var23, final SubLObject var7, final SubLObject var19) {
        return (SubLObject)ConsesLow.list((SubLObject)$ic9$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var23, var24)), (SubLObject)ConsesLow.list(var19, var23, var7));
    }
    
    public static SubLObject f35699(final SubLObject var25) {
        final SubLObject var26 = Symbols.symbol_name(var25);
        final SubLObject var27 = Packages.intern(Symbols.make_symbol(Sequences.cconcatenate((SubLObject)$ic41$, var26)), (SubLObject)UNPROVIDED);
        final SubLObject var28 = Packages.intern(Symbols.make_symbol(Sequences.cconcatenate((SubLObject)$ic41$, new SubLObject[] { var26, $ic42$ })), (SubLObject)UNPROVIDED);
        return Values.values(var27, var28);
    }
    
    public static SubLObject f35700(final SubLObject var12) {
        SubLObject var13 = (SubLObject)NIL;
        final SubLObject var14 = conses_high.getf(var12, (SubLObject)$ic20$, (SubLObject)UNPROVIDED);
        if (NIL != Symbols.fboundp(var14)) {
            var13 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic26$, var14), var13);
        }
        var13 = (SubLObject)ConsesLow.cons((SubLObject)$ic43$, var13);
        var13 = (SubLObject)ConsesLow.cons((SubLObject)$ic44$, var13);
        return var13;
    }
    
    public static SubLObject f35703(final SubLObject var11) {
        return module0067.f4887($g4381$.getGlobalValue(), var11);
    }
    
    public static SubLObject f35704(final SubLObject var27) {
        return module0004.f104(var27, $g4383$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f35705(final SubLObject var11, final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        assert NIL != Types.keywordp(var11) : var11;
        SubLObject var14;
        SubLObject var15;
        SubLObject var16;
        SubLObject var17;
        for (var14 = (SubLObject)NIL, var14 = var12; NIL != var14; var14 = conses_high.cddr(var14)) {
            var15 = var14.first();
            var16 = conses_high.cadr(var14);
            var17 = module0035.f2293($g4382$.getGlobalValue(), var15, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var13) && NIL == Symbols.fboundp(var17)) {
                Errors.error((SubLObject)$ic48$, var15);
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var13) && NIL == Functions.funcall(var17, var16)) {
                Errors.error((SubLObject)$ic49$, var16, var17, var15);
            }
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f35706(final SubLObject var6) {
        final SubLObject var7 = module0067.f4885(f35694(), var6, (SubLObject)NIL);
        return conses_high.getf(var7, (SubLObject)$ic50$, (SubLObject)NIL);
    }
    
    public static SubLObject f35707(final SubLObject var6) {
        final SubLObject var7 = module0067.f4885(f35694(), var6, (SubLObject)NIL);
        return conses_high.getf(var7, (SubLObject)$ic51$, (SubLObject)NIL);
    }
    
    public static SubLObject f35708(final SubLObject var6, final SubLObject var7) {
        final SubLObject var8 = module0067.f4885(f35694(), var6, (SubLObject)UNPROVIDED);
        final SubLObject var9 = conses_high.getf(var8, (SubLObject)$ic20$, (SubLObject)UNPROVIDED);
        if (NIL == var8) {
            return (SubLObject)NIL;
        }
        if (NIL != Symbols.fboundp(var9)) {
            return Functions.funcall(var9, var7);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35709(final SubLObject var6) {
        final SubLObject var7 = module0067.f4885(f35694(), var6, (SubLObject)NIL);
        final SubLObject var8 = conses_high.getf(var7, (SubLObject)$ic51$, (SubLObject)NIL);
        final SubLObject var9 = conses_high.getf(var7, (SubLObject)$ic52$, (SubLObject)NIL);
        return (NIL != var8) ? Symbols.symbol_value(var8) : Eval.eval(var9);
    }
    
    public static SubLObject f35710(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic53$);
        final SubLObject var5 = var4.rest();
        var4 = var4.first();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)$ic53$);
        var6 = var4.first();
        var4 = var4.rest();
        if (NIL == var4) {
            final SubLObject var7;
            var4 = (var7 = var5);
            final SubLObject var8 = (SubLObject)$ic54$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic55$, reader.bq_cons(var8, (SubLObject)$ic56$), (SubLObject)ConsesLow.listS((SubLObject)$ic9$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var6, (SubLObject)ConsesLow.list((SubLObject)$ic57$, var8))), ConsesLow.append(var7, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var3, (SubLObject)$ic53$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35711() {
        return module0067.f4889(f35694());
    }
    
    public static SubLObject f35712(final SubLObject var6) {
        final SubLObject var7 = module0067.f4885(f35694(), var6, (SubLObject)UNPROVIDED);
        final SubLObject var8 = conses_high.getf(var7, (SubLObject)$ic8$, (SubLObject)UNPROVIDED);
        final SubLObject var9 = conses_high.getf(var7, (SubLObject)$ic60$, (SubLObject)UNPROVIDED);
        final SubLObject var10 = conses_high.getf(var7, (SubLObject)$ic20$, (SubLObject)UNPROVIDED);
        PrintLow.format((SubLObject)T, (SubLObject)$ic61$, new SubLObject[] { var6, var9, Strings.string_downcase(Symbols.symbol_name(var8), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), f35709(var6), var10 });
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35713() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0582", "f35694", "S#39368", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0582", "f35695", "S#39369");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0582", "f35696", "S#39370");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0582", "f35697", "S#39371", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0582", "f35698", "S#39372");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0582", "f35701", "S#39373", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0582", "f35702", "S#39374", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0582", "f35699", "S#39375", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0582", "f35700", "S#39376", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0582", "f35703", "S#39377", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0582", "f35704", "S#39378", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0582", "f35705", "S#39379", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0582", "f35706", "S#39380", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0582", "f35707", "S#39381", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0582", "f35708", "S#39382", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0582", "f35709", "S#39383", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0582", "f35710", "S#39384");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0582", "f35711", "S#39385", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0582", "f35712", "S#39386", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35714() {
        $g4381$ = SubLFiles.deflexical("S#39387", (NIL != Symbols.boundp((SubLObject)$ic0$)) ? $g4381$.getGlobalValue() : module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g4382$ = SubLFiles.deflexical("S#39388", (SubLObject)$ic45$);
        $g4383$ = SubLFiles.deflexical("S#39389", (SubLObject)$ic46$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35715() {
        module0003.f57((SubLObject)$ic0$);
        module0002.f50((SubLObject)$ic1$, (SubLObject)$ic2$);
        module0002.f50((SubLObject)$ic11$, (SubLObject)$ic16$);
        module0002.f50((SubLObject)$ic13$, (SubLObject)$ic16$);
        module0002.f50((SubLObject)$ic38$, (SubLObject)$ic13$);
        module0002.f50((SubLObject)$ic15$, (SubLObject)$ic13$);
        module0002.f50((SubLObject)$ic10$, (SubLObject)$ic16$);
        module0002.f50((SubLObject)$ic58$, (SubLObject)$ic59$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f35713();
    }
    
    public void initializeVariables() {
        f35714();
    }
    
    public void runTopLevelForms() {
        f35715();
    }
    
    static {
        me = (SubLFile)new module0582();
        $g4381$ = null;
        $g4382$ = null;
        $g4383$ = null;
        $ic0$ = makeSymbol("S#39387", "CYC");
        $ic1$ = makeSymbol("S#39368", "CYC");
        $ic2$ = makeSymbol("S#39369", "CYC");
        $ic3$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#5251", "CYC"), (SubLObject)makeSymbol("S#132", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic4$ = makeSymbol("DO-DICTIONARY");
        $ic5$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39368", "CYC")));
        $ic6$ = ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("S#138", "CYC"));
        $ic7$ = makeUninternedSymbol("US#5DF6C20");
        $ic8$ = makeKeyword("SETTER");
        $ic9$ = makeSymbol("CLET");
        $ic10$ = makeSymbol("S#39379", "CYC");
        $ic11$ = makeSymbol("S#39371", "CYC");
        $ic12$ = makeSymbol("PROGN");
        $ic13$ = makeSymbol("S#39372", "CYC");
        $ic14$ = makeSymbol("S#3634", "CYC");
        $ic15$ = makeSymbol("S#39375", "CYC");
        $ic16$ = makeSymbol("S#39370", "CYC");
        $ic17$ = ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("S#39390", "CYC"));
        $ic18$ = makeString("Set value of ");
        $ic19$ = makeString(" in PARAMS to VALUE.");
        $ic20$ = makeKeyword("CHECK-TYPE");
        $ic21$ = makeSymbol("TRUE");
        $ic22$ = makeSymbol("DEFINE-MACRO-HELPER");
        $ic23$ = ConsesLow.list((SubLObject)makeSymbol("S#39391", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"));
        $ic24$ = makeKeyword("MACRO");
        $ic25$ = makeSymbol("CHECK-TYPE");
        $ic26$ = makeSymbol("S#132", "CYC");
        $ic27$ = ConsesLow.list((SubLObject)makeSymbol("CHECK-TYPE"), (SubLObject)makeSymbol("S#39391", "CYC"), (SubLObject)makeSymbol("S#39392", "CYC"));
        $ic28$ = makeSymbol("S#39373", "CYC");
        $ic29$ = makeSymbol("S#39391", "CYC");
        $ic30$ = ConsesLow.list((SubLObject)makeSymbol("S#132", "CYC"));
        $ic31$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("RET"), (SubLObject)makeSymbol("S#39391", "CYC")));
        $ic32$ = makeSymbol("S#373", "CYC");
        $ic33$ = ConsesLow.list((SubLObject)makeSymbol("S#39393", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"));
        $ic34$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("RETURN-TYPES"), (SubLObject)makeSymbol("S#39394", "CYC")));
        $ic35$ = makeSymbol("S#1", "CYC");
        $ic36$ = ConsesLow.list((SubLObject)makeSymbol("S#39391", "CYC"));
        $ic37$ = makeSymbol("RET");
        $ic38$ = makeSymbol("S#39374", "CYC");
        $ic39$ = makeSymbol("S#39393", "CYC");
        $ic40$ = makeSymbol("QUOTE");
        $ic41$ = makeString("SET-");
        $ic42$ = makeString("-INTERNAL");
        $ic43$ = ConsesLow.list((SubLObject)makeSymbol("S#39391", "CYC"), (SubLObject)makeSymbol("S#39392", "CYC"));
        $ic44$ = makeKeyword("ARGUMENT-TYPES");
        $ic45$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)makeKeyword("CORRESPONDING-GLOBAL"), (SubLObject)makeSymbol("SYMBOLP")), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("SETTER"), (SubLObject)makeSymbol("SYMBOLP")), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("TYPE"), (SubLObject)makeSymbol("S#39378", "CYC")), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("CHECK-TYPE"), (SubLObject)makeSymbol("SYMBOLP")), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("DOCUMENTATION"), (SubLObject)makeSymbol("STRINGP")), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("DEFAULT-VALUE-FORM"), (SubLObject)makeSymbol("TRUE")));
        $ic46$ = ConsesLow.list((SubLObject)makeKeyword("TOP-LEVEL"), (SubLObject)makeKeyword("PPH-GOODNESS"), (SubLObject)makeKeyword("PPH-FORMAT"), (SubLObject)makeKeyword("PPH-FORMALITY"), (SubLObject)makeKeyword("PPH-PRECISION"), (SubLObject)makeKeyword("PPH-MISC"));
        $ic47$ = makeSymbol("KEYWORDP");
        $ic48$ = makeString("Unrecognized property in declaration: ~S");
        $ic49$ = makeString("Value ~S fails test ~S for ~S");
        $ic50$ = makeKeyword("TYPE");
        $ic51$ = makeKeyword("CORRESPONDING-GLOBAL");
        $ic52$ = makeKeyword("DEFAULT-VALUE-FORM");
        $ic53$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#5251", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic54$ = makeUninternedSymbol("US#156825B");
        $ic55$ = makeSymbol("S#5129", "CYC");
        $ic56$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#39385", "CYC")));
        $ic57$ = makeSymbol("FIRST");
        $ic58$ = makeSymbol("S#39385", "CYC");
        $ic59$ = makeSymbol("S#39384", "CYC");
        $ic60$ = makeKeyword("DOCUMENTATION");
        $ic61$ = makeString("~%===~S===\n* '''Description''' ~A\n* '''Setter Macro''' <tt>~A</tt>\n* '''Default Value''' <tt>~S</tt>\n* '''Values must pass ~A.~%");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 104 ms
	
	Decompiled with Procyon 0.5.32.
*/