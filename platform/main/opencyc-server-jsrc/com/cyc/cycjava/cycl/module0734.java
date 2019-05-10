package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        assert NIL != Types.stringp(var1) : var1;
        SubLObject var2 = f45200(var1);
        var2 = f45201(var2);
        var2 = f45202(var2);
        var2 = f45203(var2);
        var2 = f45204(var2);
        var2 = f45205(var2);
        return var2;
    }
    
    public static SubLObject f45206(final SubLObject var1) {
        assert NIL != Types.stringp(var1) : var1;
        final SubLObject var2 = f45199(var1);
        return conses_high.last(var2, (SubLObject)UNPROVIDED).first();
    }
    
    public static SubLObject f45200(final SubLObject var1) {
        return Sequences.reverse(f45207(var1, (SubLObject)NIL));
    }
    
    public static SubLObject f45207(final SubLObject var1, final SubLObject var3) {
        final SubLObject var4 = Sequences.position_if(Symbols.symbol_function((SubLObject)$ic1$), var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL == var4) {
            return (SubLObject)ConsesLow.cons(var1, var3);
        }
        if (var4.numE((SubLObject)ZERO_INTEGER)) {
            if (Sequences.length(var1).numE((SubLObject)ONE_INTEGER)) {
                return (SubLObject)ConsesLow.cons(var1, var3);
            }
            return f45207(module0038.f2623(var1, Numbers.add((SubLObject)ONE_INTEGER, var4), (SubLObject)UNPROVIDED), (SubLObject)ConsesLow.cons(Strings.string(Strings.sublisp_char(var1, (SubLObject)ZERO_INTEGER)), var3));
        }
        else {
            if (var4.numG((SubLObject)ZERO_INTEGER)) {
                return f45207(module0038.f2623(var1, var4, (SubLObject)UNPROVIDED), (SubLObject)ConsesLow.cons(module0038.f2623(var1, (SubLObject)ZERO_INTEGER, var4), var3));
            }
            return (SubLObject)NIL;
        }
    }
    
    public static SubLObject f45208(final SubLObject var5) {
        return (SubLObject)makeBoolean(NIL == Characters.alpha_char_p(var5) && NIL == Characters.digit_char_p(var5, (SubLObject)UNPROVIDED) && NIL != Sequences.find(var5, (SubLObject)$ic2$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f45202(SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = $g5814$.getDynamicValue(var3);
        SubLObject var5 = (SubLObject)NIL;
        var5 = var4.first();
        while (NIL != var4) {
            SubLObject var7;
            final SubLObject var6 = var7 = var5;
            SubLObject var8 = (SubLObject)NIL;
            SubLObject var9 = (SubLObject)NIL;
            SubLObject var10 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic4$);
            var8 = var7.first();
            var7 = var7.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic4$);
            var9 = var7.first();
            var7 = var7.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var7, var6, (SubLObject)$ic4$);
            var10 = var7.first();
            var7 = var7.rest();
            if (NIL == var7) {
                var2 = module0035.f2233(var10, var8, var2);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var6, (SubLObject)$ic4$);
            }
            var4 = var4.rest();
            var5 = var4.first();
        }
        return var2;
    }
    
    public static SubLObject f45203(SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = f45209(var2, (SubLObject)$ic5$, Symbols.symbol_function((SubLObject)EQUAL));
        SubLObject var5 = (SubLObject)NIL;
        var5 = var4.first();
        while (NIL != var4) {
            final SubLObject var6 = f45210(var5);
            var2 = module0035.f2233((SubLObject)ConsesLow.list(var6, (SubLObject)$ic6$), (SubLObject)ConsesLow.list(PrintLow.format((SubLObject)NIL, (SubLObject)$ic7$, var6, (SubLObject)$ic8$), (SubLObject)$ic5$), var2);
            var4 = var4.rest();
            var5 = var4.first();
        }
        return var2;
    }
    
    public static SubLObject f45209(final SubLObject var17, final SubLObject var18, SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = Symbols.symbol_function((SubLObject)EQL);
        }
        return f45211(var17, var18, (SubLObject)NIL, (SubLObject)NIL, var19);
    }
    
    public static SubLObject f45211(final SubLObject var17, final SubLObject var18, final SubLObject var20, SubLObject var21, final SubLObject var19) {
        if (NIL == var17) {
            return var21;
        }
        if (NIL != Functions.funcall(var19, var17.first(), var18) && NIL != var20) {
            var21 = (SubLObject)ConsesLow.cons(var20, var21);
        }
        return f45211(var17.rest(), var18, var17.first(), var21, var19);
    }
    
    public static SubLObject f45210(final SubLObject var22) {
        return Strings.string_right_trim((SubLObject)$ic9$, var22);
    }
    
    public static SubLObject f45204(SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = $g5815$.getDynamicValue(var3);
        SubLObject var5 = (SubLObject)NIL;
        var5 = var4.first();
        while (NIL != var4) {
            SubLObject var7_24 = f45209(var2, var5, Symbols.symbol_function((SubLObject)EQUAL));
            SubLObject var6 = (SubLObject)NIL;
            var6 = var7_24.first();
            while (NIL != var7_24) {
                var2 = module0035.f2233((SubLObject)ConsesLow.list(PrintLow.format((SubLObject)NIL, (SubLObject)$ic7$, var6, var5)), (SubLObject)ConsesLow.list(var6, var5), var2);
                var7_24 = var7_24.rest();
                var6 = var7_24.first();
            }
            var4 = var4.rest();
            var5 = var4.first();
        }
        return var2;
    }
    
    public static SubLObject f45212(final SubLObject var26) {
        SubLObject var27 = (SubLObject)NIL;
        if (NIL == var26) {
            var27 = (SubLObject)NIL;
        }
        else if (NIL != f45213(var26.first())) {
            if (conses_high.second(var26).equal((SubLObject)$ic11$) && NIL != f45213(conses_high.third(var26))) {
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
        return (SubLObject)makeBoolean(var1.isString() && Sequences.length(var1).numG((SubLObject)ZERO_INTEGER) && NIL == module0035.find_if_not(Symbols.symbol_function((SubLObject)$ic12$), var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f45214(final SubLObject var22) {
        return (SubLObject)makeBoolean(NIL != f45213(var22) && Sequences.length(var22).numLE((SubLObject)THREE_INTEGER));
    }
    
    public static SubLObject f45215(final SubLObject var22) {
        return (SubLObject)makeBoolean(NIL != f45213(var22) && Sequences.length(var22).numE((SubLObject)THREE_INTEGER));
    }
    
    public static SubLObject f45201(final SubLObject var26) {
        return Sequences.nreverse(f45216(var26.first(), var26.rest(), (SubLObject)NIL));
    }
    
    public static SubLObject f45216(final SubLObject var28, final SubLObject var26, final SubLObject var29) {
        if (NIL == var28) {
            return var29;
        }
        if (NIL != f45214(var28)) {
            return f45217(var26.first(), var28, var26.rest(), var29);
        }
        return f45216(var26.first(), var26.rest(), (SubLObject)ConsesLow.cons(var28, var29));
    }
    
    public static SubLObject f45217(final SubLObject var28, final SubLObject var30, final SubLObject var26, final SubLObject var29) {
        if (NIL == var28) {
            return (SubLObject)ConsesLow.cons(var30, var29);
        }
        if (NIL != f45218(var28)) {
            return f45219(var26.first(), var30, var26.rest(), var29);
        }
        return f45216(var26.first(), var26.rest(), ConsesLow.nconc((SubLObject)ConsesLow.list(var28, var30), var29));
    }
    
    public static SubLObject f45219(final SubLObject var28, final SubLObject var30, final SubLObject var26, final SubLObject var29) {
        if (NIL == var28) {
            return (SubLObject)ConsesLow.cons(var30, var29);
        }
        if (NIL != f45215(var28)) {
            return f45217(var26.first(), PrintLow.format((SubLObject)NIL, (SubLObject)$ic7$, var30, var28), var26.rest(), var29);
        }
        return f45216(var26.first(), var26.rest(), ConsesLow.nconc((SubLObject)ConsesLow.list(var28, (SubLObject)$ic13$, var30), var29));
    }
    
    public static SubLObject f45218(final SubLObject var22) {
        return Equality.equal(var22, (SubLObject)$ic13$);
    }
    
    public static SubLObject f45205(final SubLObject var2) {
        return Sequences.delete((SubLObject)$ic14$, var2, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45221() {
        $g5814$ = SubLFiles.defparameter("S#49431", (SubLObject)$ic3$);
        $g5815$ = SubLFiles.defparameter("S#49432", (SubLObject)$ic10$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f45222() {
        return (SubLObject)NIL;
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
        $g5814$ = null;
        $g5815$ = null;
        $ic0$ = makeSymbol("STRINGP");
        $ic1$ = makeSymbol("S#49414", "CYC");
        $ic2$ = makeString(" .,?!:;()@/#$%^&*_+=~`{}'|[]<>");
        $ic3$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("'"), (SubLObject)makeString("d")), (SubLObject)makeSymbol("S#49433", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeString("'d"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("'"), (SubLObject)makeString("m")), (SubLObject)makeSymbol("S#49433", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeString("'m"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("'"), (SubLObject)makeString("s")), (SubLObject)makeSymbol("S#49433", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeString("'s"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("'"), (SubLObject)makeString("t")), (SubLObject)makeSymbol("S#49433", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeString("'t"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("'"), (SubLObject)makeString("ll")), (SubLObject)makeSymbol("S#49433", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeString("'ll"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("'"), (SubLObject)makeString("re")), (SubLObject)makeSymbol("S#49433", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeString("'re"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("'"), (SubLObject)makeString("ve")), (SubLObject)makeSymbol("S#49433", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeString("'ve"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("'"), (SubLObject)makeString("'")), (SubLObject)makeSymbol("S#49433", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeString("''"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("`"), (SubLObject)makeString("`")), (SubLObject)makeSymbol("S#49433", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeString("``"))) });
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("S#49434", "CYC"), (SubLObject)makeSymbol("S#49433", "CYC"), (SubLObject)makeSymbol("S#49435", "CYC"));
        $ic5$ = makeString("'");
        $ic6$ = makeString("s'");
        $ic7$ = makeString("~A~A");
        $ic8$ = makeString("s");
        $ic9$ = ConsesLow.list((SubLObject)Characters.CHAR_s, (SubLObject)Characters.CHAR_S);
        $ic10$ = ConsesLow.list((SubLObject)makeString("'d"), (SubLObject)makeString("'ve"), (SubLObject)makeString("'ll"));
        $ic11$ = makeString(".");
        $ic12$ = makeSymbol("DIGIT-CHAR-P");
        $ic13$ = makeString(",");
        $ic14$ = makeString(" ");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 94 ms
	
	Decompiled with Procyon 0.5.32.
*/