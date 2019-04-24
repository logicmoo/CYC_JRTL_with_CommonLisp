package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0734 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0734";
    public static final String myFingerPrint = "436699e704df1251bf4ae4b04f494e9f4be0834767d1f8783243d02632aa65c4";
    private static SubLSymbol $g5814$;
    private static SubLSymbol $g5815$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLString $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLString $ic5$;
    private static final SubLString $ic6$;
    private static final SubLString $ic7$;
    private static final SubLString $ic8$;
    private static final SubLList $ic9$;
    private static final SubLList $ic10$;
    private static final SubLString $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLString $ic13$;
    private static final SubLString $ic14$;
    
    public static SubLObject f45199(final SubLObject var1) {
        assert module0734.NIL != Types.stringp(var1) : var1;
        SubLObject var2 = f45200(var1);
        var2 = f45201(var2);
        var2 = f45202(var2);
        var2 = f45203(var2);
        var2 = f45204(var2);
        var2 = f45205(var2);
        return var2;
    }
    
    public static SubLObject f45206(final SubLObject var1) {
        assert module0734.NIL != Types.stringp(var1) : var1;
        final SubLObject var2 = f45199(var1);
        return conses_high.last(var2, (SubLObject)module0734.UNPROVIDED).first();
    }
    
    public static SubLObject f45200(final SubLObject var1) {
        return Sequences.reverse(f45207(var1, (SubLObject)module0734.NIL));
    }
    
    public static SubLObject f45207(final SubLObject var1, final SubLObject var3) {
        final SubLObject var4 = Sequences.position_if(Symbols.symbol_function((SubLObject)module0734.$ic1$), var1, (SubLObject)module0734.UNPROVIDED, (SubLObject)module0734.UNPROVIDED, (SubLObject)module0734.UNPROVIDED);
        if (module0734.NIL == var4) {
            return (SubLObject)ConsesLow.cons(var1, var3);
        }
        if (var4.numE((SubLObject)module0734.ZERO_INTEGER)) {
            if (Sequences.length(var1).numE((SubLObject)module0734.ONE_INTEGER)) {
                return (SubLObject)ConsesLow.cons(var1, var3);
            }
            return f45207(module0038.f2623(var1, Numbers.add((SubLObject)module0734.ONE_INTEGER, var4), (SubLObject)module0734.UNPROVIDED), (SubLObject)ConsesLow.cons(Strings.string(Strings.sublisp_char(var1, (SubLObject)module0734.ZERO_INTEGER)), var3));
        }
        else {
            if (var4.numG((SubLObject)module0734.ZERO_INTEGER)) {
                return f45207(module0038.f2623(var1, var4, (SubLObject)module0734.UNPROVIDED), (SubLObject)ConsesLow.cons(module0038.f2623(var1, (SubLObject)module0734.ZERO_INTEGER, var4), var3));
            }
            return (SubLObject)module0734.NIL;
        }
    }
    
    public static SubLObject f45208(final SubLObject var5) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0734.NIL == Characters.alpha_char_p(var5) && module0734.NIL == Characters.digit_char_p(var5, (SubLObject)module0734.UNPROVIDED) && module0734.NIL != Sequences.find(var5, (SubLObject)module0734.$ic2$, (SubLObject)module0734.UNPROVIDED, (SubLObject)module0734.UNPROVIDED, (SubLObject)module0734.UNPROVIDED, (SubLObject)module0734.UNPROVIDED));
    }
    
    public static SubLObject f45202(SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = module0734.$g5814$.getDynamicValue(var3);
        SubLObject var5 = (SubLObject)module0734.NIL;
        var5 = var4.first();
        while (module0734.NIL != var4) {
            SubLObject var7;
            final SubLObject var6 = var7 = var5;
            SubLObject var8 = (SubLObject)module0734.NIL;
            SubLObject var9 = (SubLObject)module0734.NIL;
            SubLObject var10 = (SubLObject)module0734.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0734.$ic4$);
            var8 = var7.first();
            var7 = var7.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0734.$ic4$);
            var9 = var7.first();
            var7 = var7.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)module0734.$ic4$);
            var10 = var7.first();
            var7 = var7.rest();
            if (module0734.NIL == var7) {
                var2 = module0035.f2233(var10, var8, var2);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var6, (SubLObject)module0734.$ic4$);
            }
            var4 = var4.rest();
            var5 = var4.first();
        }
        return var2;
    }
    
    public static SubLObject f45203(SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = f45209(var2, (SubLObject)module0734.$ic5$, Symbols.symbol_function((SubLObject)module0734.EQUAL));
        SubLObject var5 = (SubLObject)module0734.NIL;
        var5 = var4.first();
        while (module0734.NIL != var4) {
            final SubLObject var6 = f45210(var5);
            var2 = module0035.f2233((SubLObject)ConsesLow.list(var6, (SubLObject)module0734.$ic6$), (SubLObject)ConsesLow.list(PrintLow.format((SubLObject)module0734.NIL, (SubLObject)module0734.$ic7$, var6, (SubLObject)module0734.$ic8$), (SubLObject)module0734.$ic5$), var2);
            var4 = var4.rest();
            var5 = var4.first();
        }
        return var2;
    }
    
    public static SubLObject f45209(final SubLObject var17, final SubLObject var18, SubLObject var19) {
        if (var19 == module0734.UNPROVIDED) {
            var19 = Symbols.symbol_function((SubLObject)module0734.EQL);
        }
        return f45211(var17, var18, (SubLObject)module0734.NIL, (SubLObject)module0734.NIL, var19);
    }
    
    public static SubLObject f45211(final SubLObject var17, final SubLObject var18, final SubLObject var20, SubLObject var21, final SubLObject var19) {
        if (module0734.NIL == var17) {
            return var21;
        }
        if (module0734.NIL != Functions.funcall(var19, var17.first(), var18) && module0734.NIL != var20) {
            var21 = (SubLObject)ConsesLow.cons(var20, var21);
        }
        return f45211(var17.rest(), var18, var17.first(), var21, var19);
    }
    
    public static SubLObject f45210(final SubLObject var22) {
        return Strings.string_right_trim((SubLObject)module0734.$ic9$, var22);
    }
    
    public static SubLObject f45204(SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = module0734.$g5815$.getDynamicValue(var3);
        SubLObject var5 = (SubLObject)module0734.NIL;
        var5 = var4.first();
        while (module0734.NIL != var4) {
            SubLObject var7_24 = f45209(var2, var5, Symbols.symbol_function((SubLObject)module0734.EQUAL));
            SubLObject var6 = (SubLObject)module0734.NIL;
            var6 = var7_24.first();
            while (module0734.NIL != var7_24) {
                var2 = module0035.f2233((SubLObject)ConsesLow.list(PrintLow.format((SubLObject)module0734.NIL, (SubLObject)module0734.$ic7$, var6, var5)), (SubLObject)ConsesLow.list(var6, var5), var2);
                var7_24 = var7_24.rest();
                var6 = var7_24.first();
            }
            var4 = var4.rest();
            var5 = var4.first();
        }
        return var2;
    }
    
    public static SubLObject f45212(final SubLObject var26) {
        SubLObject var27 = (SubLObject)module0734.NIL;
        if (module0734.NIL == var26) {
            var27 = (SubLObject)module0734.NIL;
        }
        else if (module0734.NIL != f45213(var26.first())) {
            if (conses_high.second(var26).equal((SubLObject)module0734.$ic11$) && module0734.NIL != f45213(conses_high.third(var26))) {
                var27 = (SubLObject)ConsesLow.cons(Sequences.cconcatenate(var26.first(), new SubLObject[] { conses_high.second(var26), conses_high.third(var26) }), f45212(var26.rest().rest().rest()));
            }
            else {
                var27 = (SubLObject)ConsesLow.cons(var26.first(), f45212(var26.rest()));
            }
        }
        else {
            var27 = (SubLObject)ConsesLow.cons(var26.first(), f45212(var26.rest()));
        }
        return var27;
    }
    
    public static SubLObject f45213(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var1.isString() && Sequences.length(var1).numG((SubLObject)module0734.ZERO_INTEGER) && module0734.NIL == module0035.find_if_not(Symbols.symbol_function((SubLObject)module0734.$ic12$), var1, (SubLObject)module0734.UNPROVIDED, (SubLObject)module0734.UNPROVIDED, (SubLObject)module0734.UNPROVIDED));
    }
    
    public static SubLObject f45214(final SubLObject var22) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0734.NIL != f45213(var22) && Sequences.length(var22).numLE((SubLObject)module0734.THREE_INTEGER));
    }
    
    public static SubLObject f45215(final SubLObject var22) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0734.NIL != f45213(var22) && Sequences.length(var22).numE((SubLObject)module0734.THREE_INTEGER));
    }
    
    public static SubLObject f45201(final SubLObject var26) {
        return Sequences.nreverse(f45216(var26.first(), var26.rest(), (SubLObject)module0734.NIL));
    }
    
    public static SubLObject f45216(final SubLObject var28, final SubLObject var26, final SubLObject var29) {
        if (module0734.NIL == var28) {
            return var29;
        }
        if (module0734.NIL != f45214(var28)) {
            return f45217(var26.first(), var28, var26.rest(), var29);
        }
        return f45216(var26.first(), var26.rest(), (SubLObject)ConsesLow.cons(var28, var29));
    }
    
    public static SubLObject f45217(final SubLObject var28, final SubLObject var30, final SubLObject var26, final SubLObject var29) {
        if (module0734.NIL == var28) {
            return (SubLObject)ConsesLow.cons(var30, var29);
        }
        if (module0734.NIL != f45218(var28)) {
            return f45219(var26.first(), var30, var26.rest(), var29);
        }
        return f45216(var26.first(), var26.rest(), ConsesLow.nconc((SubLObject)ConsesLow.list(var28, var30), var29));
    }
    
    public static SubLObject f45219(final SubLObject var28, final SubLObject var30, final SubLObject var26, final SubLObject var29) {
        if (module0734.NIL == var28) {
            return (SubLObject)ConsesLow.cons(var30, var29);
        }
        if (module0734.NIL != f45215(var28)) {
            return f45217(var26.first(), PrintLow.format((SubLObject)module0734.NIL, (SubLObject)module0734.$ic7$, var30, var28), var26.rest(), var29);
        }
        return f45216(var26.first(), var26.rest(), ConsesLow.nconc((SubLObject)ConsesLow.list(var28, (SubLObject)module0734.$ic13$, var30), var29));
    }
    
    public static SubLObject f45218(final SubLObject var22) {
        return Equality.equal(var22, (SubLObject)module0734.$ic13$);
    }
    
    public static SubLObject f45205(final SubLObject var2) {
        return Sequences.delete((SubLObject)module0734.$ic14$, var2, Symbols.symbol_function((SubLObject)module0734.EQUAL), (SubLObject)module0734.UNPROVIDED, (SubLObject)module0734.UNPROVIDED, (SubLObject)module0734.UNPROVIDED, (SubLObject)module0734.UNPROVIDED);
    }
    
    public static SubLObject f45220() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0734", "f45199", "S#49410", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0734", "f45206", "S#49411", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0734", "f45200", "S#49412", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0734", "f45207", "S#49413", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0734", "f45208", "S#49414", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0734", "f45202", "S#49415", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0734", "f45203", "S#49416", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0734", "f45209", "S#49417", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0734", "f45211", "S#49418", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0734", "f45210", "S#49419", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0734", "f45204", "S#49420", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0734", "f45212", "S#49421", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0734", "f45213", "S#49422", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0734", "f45214", "S#49423", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0734", "f45215", "S#49424", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0734", "f45201", "S#49425", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0734", "f45216", "S#49426", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0734", "f45217", "S#49427", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0734", "f45219", "S#49428", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0734", "f45218", "S#49429", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0734", "f45205", "S#49430", 1, 0, false);
        return (SubLObject)module0734.NIL;
    }
    
    public static SubLObject f45221() {
        module0734.$g5814$ = SubLFiles.defparameter("S#49431", (SubLObject)module0734.$ic3$);
        module0734.$g5815$ = SubLFiles.defparameter("S#49432", (SubLObject)module0734.$ic10$);
        return (SubLObject)module0734.NIL;
    }
    
    public static SubLObject f45222() {
        return (SubLObject)module0734.NIL;
    }
    
    public void declareFunctions() {
        f45220();
    }
    
    public void initializeVariables() {
        f45221();
    }
    
    public void runTopLevelForms() {
        f45222();
    }
    
    static {
        me = (SubLFile)new module0734();
        module0734.$g5814$ = null;
        module0734.$g5815$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic1$ = SubLObjectFactory.makeSymbol("S#49414", "CYC");
        $ic2$ = SubLObjectFactory.makeString(" .,?!:;()@/#$%^&*_+=~`{}'|[]<>");
        $ic3$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("'"), (SubLObject)SubLObjectFactory.makeString("d")), (SubLObject)SubLObjectFactory.makeSymbol("S#49433", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("'d"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("'"), (SubLObject)SubLObjectFactory.makeString("m")), (SubLObject)SubLObjectFactory.makeSymbol("S#49433", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("'m"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("'"), (SubLObject)SubLObjectFactory.makeString("s")), (SubLObject)SubLObjectFactory.makeSymbol("S#49433", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("'s"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("'"), (SubLObject)SubLObjectFactory.makeString("t")), (SubLObject)SubLObjectFactory.makeSymbol("S#49433", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("'t"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("'"), (SubLObject)SubLObjectFactory.makeString("ll")), (SubLObject)SubLObjectFactory.makeSymbol("S#49433", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("'ll"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("'"), (SubLObject)SubLObjectFactory.makeString("re")), (SubLObject)SubLObjectFactory.makeSymbol("S#49433", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("'re"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("'"), (SubLObject)SubLObjectFactory.makeString("ve")), (SubLObject)SubLObjectFactory.makeSymbol("S#49433", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("'ve"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("'"), (SubLObject)SubLObjectFactory.makeString("'")), (SubLObject)SubLObjectFactory.makeSymbol("S#49433", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("''"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("`"), (SubLObject)SubLObjectFactory.makeString("`")), (SubLObject)SubLObjectFactory.makeSymbol("S#49433", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("``"))) });
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#49434", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#49433", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#49435", "CYC"));
        $ic5$ = SubLObjectFactory.makeString("'");
        $ic6$ = SubLObjectFactory.makeString("s'");
        $ic7$ = SubLObjectFactory.makeString("~A~A");
        $ic8$ = SubLObjectFactory.makeString("s");
        $ic9$ = ConsesLow.list((SubLObject)Characters.CHAR_s, (SubLObject)Characters.CHAR_S);
        $ic10$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("'d"), (SubLObject)SubLObjectFactory.makeString("'ve"), (SubLObject)SubLObjectFactory.makeString("'ll"));
        $ic11$ = SubLObjectFactory.makeString(".");
        $ic12$ = SubLObjectFactory.makeSymbol("DIGIT-CHAR-P");
        $ic13$ = SubLObjectFactory.makeString(",");
        $ic14$ = SubLObjectFactory.makeString(" ");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0734.class
	Total time: 94 ms
	
	Decompiled with Procyon 0.5.32.
*/