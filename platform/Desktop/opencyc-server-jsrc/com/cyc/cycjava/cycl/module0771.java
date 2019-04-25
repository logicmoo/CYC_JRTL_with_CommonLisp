package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0771 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0771";
    public static final String myFingerPrint = "9a5eb078c4f5f5c61813e2bbbfdc82eab3affb5f7d59bc51c3baa0c0e929ee15";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLString $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLString $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
    private static final SubLList $ic11$;
    private static final SubLObject $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLObject $ic15$;
    private static final SubLString $ic16$;
    private static final SubLObject $ic17$;
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    private static final SubLObject $ic21$;
    
    public static SubLObject f49124(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = f49125(var1);
        final SubLObject var5 = f49126(var1);
        final SubLObject var6 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic3$, module0205.f13203(var1, (SubLObject)UNPROVIDED));
        final SubLObject var7 = f49127(var5, var4);
        return Sequences.cconcatenate(var6, var7);
    }
    
    public static SubLObject f49125(final SubLObject var8) {
        final SubLObject var9 = Hashtables.make_hash_table((SubLObject)SIXTEEN_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var11;
        final SubLObject var10 = var11 = f49128(var8);
        SubLObject var12 = (SubLObject)NIL;
        var12 = var11.first();
        while (NIL != var11) {
            f49129(var12, var9, var8);
            var11 = var11.rest();
            var12 = var11.first();
        }
        return var9;
    }
    
    public static SubLObject f49128(final SubLObject var8) {
        return module0035.f2399(var8, Symbols.symbol_function((SubLObject)$ic4$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49129(final SubLObject var12, final SubLObject var9, final SubLObject var8) {
        final SubLObject var13 = f49130(var12, var8);
        SubLObject var14 = (SubLObject)NIL;
        final SubLObject var15 = f49131(var12, var8, var9);
        if (NIL != var15) {
            var14 = (SubLObject)ConsesLow.list($ic5$, f49132(var13, var12, var15, var9));
        }
        else {
            var14 = (SubLObject)ConsesLow.list($ic5$, var13);
        }
        if (NIL != module0578.f35470((SubLObject)TWO_INTEGER)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic6$, var12, var14);
        }
        Hashtables.sethash(var12, var9, var14);
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var17 = (SubLObject)NIL;
        final Iterator var18 = Hashtables.getEntrySetIterator(var9);
        try {
            while (Hashtables.iteratorHasNext(var18)) {
                final Map.Entry var19 = Hashtables.iteratorNextEntry(var18);
                var16 = Hashtables.getEntryKey(var19);
                var17 = Hashtables.getEntryValue(var19);
                Hashtables.sethash(var16, var9, conses_high.subst(var14, var12, var17, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var18);
        }
        return var14;
    }
    
    public static SubLObject f49131(final SubLObject var12, final SubLObject var8, final SubLObject var9) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = module0205.f13207(module0205.f13204(var8, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
        SubLObject var15 = (SubLObject)NIL;
        var15 = var14.first();
        while (NIL != var14) {
            if (NIL == module0202.f12589(var15, $ic7$) && NIL != conses_high.member(var12, var15, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                SubLObject var16 = (SubLObject)NIL;
                if (NIL == var16) {
                    SubLObject var17 = module0205.f13207(var15, (SubLObject)UNPROVIDED);
                    SubLObject var18 = (SubLObject)NIL;
                    var18 = var17.first();
                    while (NIL == var16 && NIL != var17) {
                        if (var18.isKeyword() && !var18.eql(var12) && NIL == Hashtables.gethash(var18, var9, (SubLObject)UNPROVIDED)) {
                            var16 = (SubLObject)T;
                        }
                        var17 = var17.rest();
                        var18 = var17.first();
                    }
                }
                if (NIL == var16) {
                    final SubLObject var19 = var15;
                    if (NIL == conses_high.member(var19, var13, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var13 = (SubLObject)ConsesLow.cons(var19, var13);
                    }
                }
            }
            var14 = var14.rest();
            var15 = var14.first();
        }
        return var13;
    }
    
    public static SubLObject f49132(final SubLObject var13, final SubLObject var12, final SubLObject var15, final SubLObject var9) {
        SubLObject var16 = var13;
        SubLObject var17 = var15;
        SubLObject var18 = (SubLObject)NIL;
        var18 = var17.first();
        while (NIL != var17) {
            if (NIL == module0202.f12598(var18)) {
                final SubLObject var19 = Sequences.cconcatenate((SubLObject)$ic8$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic9$, module0006.f203((SubLObject)$ic10$) });
                module0578.f35476(var19, (SubLObject)ConsesLow.list(var18));
            }
            SubLObject var21;
            final SubLObject var20 = var21 = var18;
            SubLObject var22 = (SubLObject)NIL;
            SubLObject var23 = (SubLObject)NIL;
            SubLObject var24 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)$ic11$);
            var22 = var21.first();
            var21 = var21.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)$ic11$);
            var23 = var21.first();
            var21 = var21.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)$ic11$);
            var24 = var21.first();
            var21 = var21.rest();
            if (NIL == var21) {
                if (var23.eql(var12)) {
                    var16 = (SubLObject)ConsesLow.list($ic12$, var16, var22, var24);
                }
                else {
                    var16 = (SubLObject)ConsesLow.list($ic13$, var16, var22, var23);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)$ic11$);
            }
            var17 = var17.rest();
            var18 = var17.first();
        }
        return var16;
    }
    
    public static SubLObject f49130(final SubLObject var12, final SubLObject var8) {
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = module0205.f13207(module0205.f13204(var8, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
        SubLObject var15 = (SubLObject)NIL;
        var15 = var14.first();
        while (NIL != var14) {
            if (NIL != module0202.f12589(var15, $ic7$) && module0205.f13203(var15, (SubLObject)UNPROVIDED).eql(var12)) {
                final SubLObject var16 = module0205.f13204(var15, (SubLObject)UNPROVIDED);
                if (NIL == conses_high.member(var16, var13, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var13 = (SubLObject)ConsesLow.cons(var16, var13);
                }
            }
            var14 = var14.rest();
            var15 = var14.first();
        }
        if (NIL != module0035.f1995(var13, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {
            return var13.first();
        }
        if (NIL == var13 && var12 == $ic14$) {
            return $ic15$;
        }
        final SubLObject var17 = Sequences.cconcatenate((SubLObject)$ic8$, new SubLObject[] { module0006.f205((SubLObject)ONE_INTEGER), $ic9$, module0006.f203((SubLObject)$ic16$) });
        module0578.f35476(var17, (SubLObject)ConsesLow.list(Sequences.length(var13), var12));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49126(final SubLObject var8) {
        SubLObject var9 = (SubLObject)NIL;
        if (NIL == var9) {
            SubLObject var10 = module0205.f13207(module0205.f13204(var8, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
            SubLObject var11 = (SubLObject)NIL;
            var11 = var10.first();
            while (NIL == var9 && NIL != var10) {
                if (NIL != module0202.f12590(var11) && NIL != module0751.f46849(module0205.f13136(var11), $ic17$, (SubLObject)UNPROVIDED)) {
                    var9 = var11;
                }
                var10 = var10.rest();
                var11 = var10.first();
            }
        }
        return var9;
    }
    
    public static SubLObject f49127(final SubLObject var5, final SubLObject var4) {
        final SubLObject var6 = module0205.f13207(module0205.f13203(var5, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        SubLObject var11;
        for (var8 = Sequences.length(var6), var9 = (SubLObject)NIL, var9 = (SubLObject)ZERO_INTEGER; var9.numL(var8); var9 = Numbers.add(var9, (SubLObject)ONE_INTEGER)) {
            var10 = ConsesLow.nth(var9, var6);
            var11 = f49133(var10, var4);
            var7 = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)NIL, (SubLObject)$ic18$, Numbers.add(var9, (SubLObject)ONE_INTEGER), module0770.f49095(var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), var7);
        }
        return module0038.f2761(Sequences.nreverse(var7), (SubLObject)Characters.CHAR_newline);
    }
    
    public static SubLObject f49133(final SubLObject var41, final SubLObject var4) {
        if (NIL == module0202.f12590(var41)) {
            return var41;
        }
        SubLObject var42 = (SubLObject)NIL;
        SubLObject var43 = var41;
        SubLObject var44 = (SubLObject)NIL;
        var44 = var43.first();
        while (NIL != var43) {
            SubLObject var45 = var44;
            if (var44.isKeyword()) {
                SubLObject var47;
                final SubLObject var46 = var47 = Hashtables.gethash(var44, var4, (SubLObject)UNPROVIDED);
                if (var46.isCons()) {
                    SubLObject var48 = (SubLObject)NIL;
                    SubLObject var11_46 = var46;
                    SubLObject var49 = (SubLObject)NIL;
                    var49 = var11_46.first();
                    while (NIL != var11_46) {
                        var48 = (SubLObject)ConsesLow.cons(f49133(var49, var4), var48);
                        var11_46 = var11_46.rest();
                        var49 = var11_46.first();
                    }
                    var47 = Sequences.reverse(var48);
                }
                if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic19$, var47, var44);
                }
                var45 = var47;
                if (NIL != module0035.f2428(var44, var41, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != module0202.f12589(var47, $ic5$)) {
                    if (NIL != module0578.f35470((SubLObject)ONE_INTEGER)) {
                        PrintLow.format((SubLObject)T, (SubLObject)$ic20$, var47, (SubLObject)ConsesLow.list($ic21$, module0205.f13203(var47, (SubLObject)UNPROVIDED)));
                    }
                    Hashtables.sethash(var44, var4, (SubLObject)ConsesLow.list($ic21$, module0205.f13203(var47, (SubLObject)UNPROVIDED)));
                }
            }
            var42 = (SubLObject)ConsesLow.cons(var45, var42);
            var43 = var43.rest();
            var44 = var43.first();
        }
        return Sequences.reverse(var42);
    }
    
    public static SubLObject f49134() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0771", "f49124", "S#53581", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0771", "f49125", "S#53582", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0771", "f49128", "S#53583", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0771", "f49129", "S#53584", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0771", "f49131", "S#53585", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0771", "f49132", "S#53586", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0771", "f49130", "S#53587", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0771", "f49126", "S#53588", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0771", "f49127", "S#53589", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0771", "f49133", "S#53590", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49135() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49136() {
        module0762.f48147((SubLObject)$ic0$, (SubLObject)$ic1$, (SubLObject)$ic2$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f49134();
    }
    
    public void initializeVariables() {
        f49135();
    }
    
    public void runTopLevelForms() {
        f49136();
    }
    
    static {
        me = (SubLFile)new module0771();
        $ic0$ = makeSymbol("S#53581", "CYC");
        $ic1$ = makeKeyword("SCRIPT-EXPANSION");
        $ic2$ = makeKeyword("DECENT");
        $ic3$ = makeString("The steps in the script ~S:~%~%");
        $ic4$ = makeSymbol("S#15431", "CYC");
        $ic5$ = constant_handles_oc.f8479((SubLObject)makeString("SomeFn"));
        $ic6$ = makeString("PPH-HASH-ONE-ARG-KEYWORD: Hashing ~S -> ~S.~%");
        $ic7$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic8$ = makeString("(PPH error level ");
        $ic9$ = makeString(") ");
        $ic10$ = makeString("~&PPH-ADD-CONSTRAINTS: Non-binary constraint: ~S.~%");
        $ic11$ = ConsesLow.list((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#750", "CYC"), (SubLObject)makeSymbol("S#751", "CYC"));
        $ic12$ = constant_handles_oc.f8479((SubLObject)makeString("SubcollectionOfWithRelationToFn"));
        $ic13$ = constant_handles_oc.f8479((SubLObject)makeString("SubcollectionOfWithRelationFromFn"));
        $ic14$ = makeKeyword("ARG1");
        $ic15$ = constant_handles_oc.f8479((SubLObject)makeString("Agent-Generic"));
        $ic16$ = makeString("PPH-ISA-CONSTRAINT-ON-ARG-KEYWORD: ~D #$isa constraints on ~S.~%");
        $ic17$ = constant_handles_oc.f8479((SubLObject)makeString("eventSequence"));
        $ic18$ = makeString("~D. ~A");
        $ic19$ = makeString("~&PPH-REPHRASE-CLAUSE: Substituting ~S for~% ~S.~%");
        $ic20$ = makeString("~&PPH-REPHRASE-CLAUSE: Replacing ~s with ~s.~%");
        $ic21$ = constant_handles_oc.f8479((SubLObject)makeString("TheInstance"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 137 ms
	
	Decompiled with Procyon 0.5.32.
*/