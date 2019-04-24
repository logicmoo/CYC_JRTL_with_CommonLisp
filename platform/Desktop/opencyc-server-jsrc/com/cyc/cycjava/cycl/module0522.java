package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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
        if (var2 == module0522.UNPROVIDED) {
            var2 = (SubLObject)module0522.NIL;
        }
        final SubLObject var3 = module0205.f13387(var1, (SubLObject)module0522.UNPROVIDED);
        return f32649(var3);
    }
    
    public static SubLObject f32649(final SubLObject var4) {
        if (module0522.NIL != module0193.f12105(var4)) {
            return module0522.$g3857$.getGlobalValue();
        }
        if (module0522.NIL != module0202.f12925(var4)) {
            return module0411.f28638(var4, (SubLObject)module0522.$ic2$, (SubLObject)module0522.UNPROVIDED, (SubLObject)module0522.UNPROVIDED);
        }
        if (module0522.NIL != module0202.f12595(var4)) {
            return f32650(var4);
        }
        return (SubLObject)module0522.NIL;
    }
    
    public static SubLObject f32650(final SubLObject var5) {
        final SubLObject var6 = module0205.f13207(var5, (SubLObject)module0522.UNPROVIDED);
        SubLObject var7 = (SubLObject)module0522.NIL;
        SubLObject var8 = var6;
        SubLObject var9 = (SubLObject)module0522.NIL;
        var9 = var8.first();
        while (module0522.NIL != var8) {
            final SubLObject var10 = f32649(var9);
            if (module0522.NIL != var10) {
                var7 = (SubLObject)ConsesLow.cons(var10, var7);
            }
            var8 = var8.rest();
            var9 = var8.first();
        }
        return f32651(var7);
    }
    
    public static SubLObject f32651(final SubLObject var7) {
        if (module0522.NIL != var7) {
            final SubLObject var8 = Functions.apply((SubLObject)module0522.$ic3$, var7);
            return var8.isZero() ? var8 : Numbers.max(f32652(var8), (SubLObject)module0522.$ic4$);
        }
        return (SubLObject)module0522.NIL;
    }
    
    public static SubLObject f32652(final SubLObject var12) {
        return Numbers.divide(var12, (SubLObject)module0522.THREE_INTEGER);
    }
    
    public static SubLObject f32653(final SubLObject var1, SubLObject var2) {
        if (var2 == module0522.UNPROVIDED) {
            var2 = (SubLObject)module0522.NIL;
        }
        final SubLObject var3 = module0205.f13387(var1, (SubLObject)module0522.UNPROVIDED);
        final SubLObject var4 = module0373.f26143();
        return f32654(var3, var4, var2);
    }
    
    public static SubLObject f32654(final SubLObject var3, final SubLObject var13, final SubLObject var2) {
        SubLObject var15;
        final SubLObject var14 = var15 = module0434.f30592(var3, var13, (SubLObject)ConsesLow.list((SubLObject)module0522.$ic5$, (SubLObject)module0522.$ic6$, (SubLObject)module0522.$ic7$, module0522.$g3858$.getGlobalValue()));
        SubLObject var16 = (SubLObject)module0522.NIL;
        var16 = var15.first();
        while (module0522.NIL != var15) {
            SubLObject var18;
            final SubLObject var17 = var18 = var16;
            SubLObject var19 = (SubLObject)module0522.NIL;
            SubLObject var20 = (SubLObject)module0522.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var18, var17, (SubLObject)module0522.$ic8$);
            var19 = var18.first();
            var18 = var18.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var18, var17, (SubLObject)module0522.$ic8$);
            var20 = var18.first();
            var18 = var18.rest();
            if (module0522.NIL == var18) {
                module0347.f23330(var20.first(), var19, var20.rest());
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var17, (SubLObject)module0522.$ic8$);
            }
            var15 = var15.rest();
            var16 = var15.first();
        }
        return (SubLObject)module0522.NIL;
    }
    
    public static SubLObject f32655(final SubLObject var1, SubLObject var2) {
        if (var2 == module0522.UNPROVIDED) {
            var2 = (SubLObject)module0522.NIL;
        }
        return module0522.$g3857$.getGlobalValue();
    }
    
    public static SubLObject f32656(final SubLObject var1, SubLObject var2) {
        if (var2 == module0522.UNPROVIDED) {
            var2 = (SubLObject)module0522.NIL;
        }
        final SubLObject var3 = module0205.f13387(var1, (SubLObject)module0522.UNPROVIDED);
        final SubLObject var4 = module0373.f26143();
        return f32657(var3, var4, var2);
    }
    
    public static SubLObject f32657(final SubLObject var3, final SubLObject var13, final SubLObject var2) {
        final SubLObject var14 = module0434.f30592(var3, var13, (SubLObject)ConsesLow.list((SubLObject)module0522.$ic7$, module0522.$g3858$.getGlobalValue()));
        if (module0522.NIL == var14) {
            module0347.f23330(module0191.f11990((SubLObject)module0522.$ic11$, module0202.f12771(var3), var13, (SubLObject)module0522.UNPROVIDED), (SubLObject)module0522.UNPROVIDED, (SubLObject)module0522.UNPROVIDED);
        }
        return (SubLObject)module0522.NIL;
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
        return (SubLObject)module0522.NIL;
    }
    
    public static SubLObject f32659() {
        module0522.$g3857$ = SubLFiles.deflexical("S#36105", module0018.$g661$.getGlobalValue());
        module0522.$g3858$ = SubLFiles.deflexical("S#36106", (SubLObject)module0522.$ic1$);
        return (SubLObject)module0522.NIL;
    }
    
    public static SubLObject f32660() {
        module0340.f22938(module0522.$ic0$);
        module0340.f22941((SubLObject)module0522.$ic9$, (SubLObject)module0522.$ic10$);
        module0340.f22941((SubLObject)module0522.$ic12$, (SubLObject)module0522.$ic13$);
        return (SubLObject)module0522.NIL;
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
        module0522.$g3857$ = null;
        module0522.$g3858$ = null;
        $ic0$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("kbSentence"));
        $ic1$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MODULE-SUBTYPE"), (SubLObject)SubLObjectFactory.makeKeyword("KB")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MODULE-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MODULE-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-CONJUNCTIVE")))));
        $ic2$ = SubLObjectFactory.makeKeyword("POS");
        $ic3$ = SubLObjectFactory.makeSymbol("MIN");
        $ic4$ = (SubLFloat)SubLObjectFactory.makeDouble(0.01);
        $ic5$ = SubLObjectFactory.makeKeyword("RETURN");
        $ic6$ = SubLObjectFactory.makeKeyword("BINDINGS-AND-SUPPORTS");
        $ic7$ = SubLObjectFactory.makeKeyword("ALLOWED-MODULES");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#14510", "CYC"));
        $ic9$ = SubLObjectFactory.makeKeyword("REMOVAL-KB-SENTENCE-LOOKUP-POS");
        $ic10$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("kbSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("kbSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26073", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.cons(module0128.f8479((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#36095", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#36100", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$kbSentence (<non-predicate> . <fully-bound>)) or \n    (#$kbSentence (<predicate> . <anything>)) or\n    (#$kbSentence (#$and . <anything>))\n    by recursively asking sentence w/o any sksi support\n    and succeeding if the ask succeeds"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$kbSentence\n     (#$thereExists ?SPEC\n      (#$genls ?SPEC #$BinaryRelation)))") });
        $ic11$ = SubLObjectFactory.makeKeyword("OPAQUE");
        $ic12$ = SubLObjectFactory.makeKeyword("REMOVAL-KB-SENTENCE-CHECK-NEG");
        $ic13$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("kbSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("kbSentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26073", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26073", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#36105", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#36103", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$kbSentence (<predicate> . <fully-bound>))) or\n    (#$not (#$kbSentence (#$not (<predicate> . <fully-bound>))))\n    by recursively asking sentence (<predicate> . <fully-bound>) or \n                                   (#$not (<predicate> . <fully-bound>))\n    without any sksi support\n    and succeeding if the ask succeeds"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$kbSentence\n     (#$not (#$genls #$Microtheory #$BinaryPredicate))))") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0522.class
	Total time: 94 ms
	
	Decompiled with Procyon 0.5.32.
*/