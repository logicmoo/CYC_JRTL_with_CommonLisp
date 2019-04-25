package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0522 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0522";
    public static final String myFingerPrint = "665bef54de72dfaf42b09baae2b592fd7dcec9d5e88c253dd51d9edfd4b4b7fc";
    private static SubLSymbol $g3857$;
    private static SubLSymbol $g3858$;
    private static final SubLObject $ic0$;
    private static final SubLList $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLFloat $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    
    public static SubLObject f32648(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        return f32649(var3);
    }
    
    public static SubLObject f32649(final SubLObject var4) {
        if (NIL != module0193.f12105(var4)) {
            return $g3857$.getGlobalValue();
        }
        if (NIL != module0202.f12925(var4)) {
            return module0411.f28638(var4, (SubLObject)$ic2$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0202.f12595(var4)) {
            return f32650(var4);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32650(final SubLObject var5) {
        final SubLObject var6 = module0205.f13207(var5, (SubLObject)UNPROVIDED);
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = var6;
        SubLObject var9 = (SubLObject)NIL;
        var9 = var8.first();
        while (NIL != var8) {
            final SubLObject var10 = f32649(var9);
            if (NIL != var10) {
                var7 = (SubLObject)ConsesLow.cons(var10, var7);
            }
            var8 = var8.rest();
            var9 = var8.first();
        }
        return f32651(var7);
    }
    
    public static SubLObject f32651(final SubLObject var7) {
        if (NIL != var7) {
            final SubLObject var8 = Functions.apply((SubLObject)$ic3$, var7);
            return var8.isZero() ? var8 : Numbers.max(f32652(var8), (SubLObject)$ic4$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32652(final SubLObject var12) {
        return Numbers.divide(var12, (SubLObject)THREE_INTEGER);
    }
    
    public static SubLObject f32653(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var4 = module0373.f26143();
        return f32654(var3, var4, var2);
    }
    
    public static SubLObject f32654(final SubLObject var3, final SubLObject var13, final SubLObject var2) {
        SubLObject var15;
        final SubLObject var14 = var15 = module0434.f30592(var3, var13, (SubLObject)ConsesLow.list((SubLObject)$ic5$, (SubLObject)$ic6$, (SubLObject)$ic7$, $g3858$.getGlobalValue()));
        SubLObject var16 = (SubLObject)NIL;
        var16 = var15.first();
        while (NIL != var15) {
            SubLObject var18;
            final SubLObject var17 = var18 = var16;
            SubLObject var19 = (SubLObject)NIL;
            SubLObject var20 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var18, var17, (SubLObject)$ic8$);
            var19 = var18.first();
            var18 = var18.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var18, var17, (SubLObject)$ic8$);
            var20 = var18.first();
            var18 = var18.rest();
            if (NIL == var18) {
                module0347.f23330(var20.first(), var19, var20.rest());
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var17, (SubLObject)$ic8$);
            }
            var15 = var15.rest();
            var16 = var15.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32655(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        return $g3857$.getGlobalValue();
    }
    
    public static SubLObject f32656(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = module0205.f13387(var1, (SubLObject)UNPROVIDED);
        final SubLObject var4 = module0373.f26143();
        return f32657(var3, var4, var2);
    }
    
    public static SubLObject f32657(final SubLObject var3, final SubLObject var13, final SubLObject var2) {
        final SubLObject var14 = module0434.f30592(var3, var13, (SubLObject)ConsesLow.list((SubLObject)$ic7$, $g3858$.getGlobalValue()));
        if (NIL == var14) {
            module0347.f23330(module0191.f11990((SubLObject)$ic11$, module0202.f12771(var3), var13, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32658() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0522", "f32648", "S#36095", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0522", "f32649", "S#36096", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0522", "f32650", "S#36097", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0522", "f32651", "S#36098", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0522", "f32652", "S#36099", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0522", "f32653", "S#36100", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0522", "f32654", "S#36101", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0522", "f32655", "S#36102", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0522", "f32656", "S#36103", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0522", "f32657", "S#36104", 3, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32659() {
        $g3857$ = SubLFiles.deflexical("S#36105", module0018.$g661$.getGlobalValue());
        $g3858$ = SubLFiles.deflexical("S#36106", (SubLObject)$ic1$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32660() {
        module0340.f22938($ic0$);
        module0340.f22941((SubLObject)$ic9$, (SubLObject)$ic10$);
        module0340.f22941((SubLObject)$ic12$, (SubLObject)$ic13$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f32658();
    }
    
    public void initializeVariables() {
        f32659();
    }
    
    public void runTopLevelForms() {
        f32660();
    }
    
    static {
        me = (SubLFile)new module0522();
        $g3857$ = null;
        $g3858$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("kbSentence"));
        $ic1$ = ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("MODULE-SUBTYPE"), (SubLObject)makeKeyword("KB")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("MODULE-TYPE"), (SubLObject)makeKeyword("REMOVAL"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("NOT"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("MODULE-TYPE"), (SubLObject)makeKeyword("REMOVAL-CONJUNCTIVE")))));
        $ic2$ = makeKeyword("POS");
        $ic3$ = makeSymbol("MIN");
        $ic4$ = (SubLFloat)makeDouble(0.01);
        $ic5$ = makeKeyword("RETURN");
        $ic6$ = makeKeyword("BINDINGS-AND-SUPPORTS");
        $ic7$ = makeKeyword("ALLOWED-MODULES");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("S#713", "CYC"), (SubLObject)makeSymbol("S#14510", "CYC"));
        $ic9$ = makeKeyword("REMOVAL-KB-SENTENCE-LOOKUP-POS");
        $ic10$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("kbSentence")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("kbSentence")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)ConsesLow.cons((SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#26073", "CYC")), (SubLObject)makeKeyword("ANYTHING")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)makeKeyword("ANYTHING")))), makeKeyword("COST"), makeSymbol("S#36095", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#36100", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$kbSentence (<non-predicate> . <fully-bound>)) or \n    (#$kbSentence (<predicate> . <anything>)) or\n    (#$kbSentence (#$and . <anything>))\n    by recursively asking sentence w/o any sksi support\n    and succeeding if the ask succeeds"), makeKeyword("EXAMPLE"), makeString("(#$kbSentence\n     (#$thereExists ?SPEC\n      (#$genls ?SPEC #$BinaryRelation)))") });
        $ic11$ = makeKeyword("OPAQUE");
        $ic12$ = makeKeyword("REMOVAL-KB-SENTENCE-CHECK-NEG");
        $ic13$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("kbSentence")), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("kbSentence")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("OR"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#26073", "CYC")), (SubLObject)makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("not")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#26073", "CYC")), (SubLObject)makeKeyword("FULLY-BOUND"))))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#36105", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("S#36103", "CYC"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$kbSentence (<predicate> . <fully-bound>))) or\n    (#$not (#$kbSentence (#$not (<predicate> . <fully-bound>))))\n    by recursively asking sentence (<predicate> . <fully-bound>) or \n                                   (#$not (<predicate> . <fully-bound>))\n    without any sksi support\n    and succeeding if the ask succeeds"), makeKeyword("EXAMPLE"), makeString("(#$not (#$kbSentence\n     (#$not (#$genls #$Microtheory #$BinaryPredicate))))") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 94 ms
	
	Decompiled with Procyon 0.5.32.
*/