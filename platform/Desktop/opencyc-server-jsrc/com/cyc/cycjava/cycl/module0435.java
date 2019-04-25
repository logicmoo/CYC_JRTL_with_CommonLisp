package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0435 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0435";
    public static final String myFingerPrint = "bab082c2b86823f5fd6d3a14560488abd4ca75f913c17f579f3586d6aeb7d173";
    private static SubLSymbol $g3534$;
    private static SubLSymbol $g3535$;
    private static SubLSymbol $g3536$;
    private static SubLSymbol $g3537$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLObject $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLString $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
    private static final SubLString $ic11$;
    private static final SubLString $ic12$;
    private static final SubLString $ic13$;
    private static final SubLString $ic14$;
    private static final SubLString $ic15$;
    private static final SubLString $ic16$;
    private static final SubLString $ic17$;
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLList $ic30$;
    private static final SubLList $ic31$;
    private static final SubLList $ic32$;
    private static final SubLList $ic33$;
    
    public static SubLObject f30612(final SubLObject var1, final SubLObject var2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0435.NIL == module0193.f12105(var1));
    }
    
    public static SubLObject f30613(final SubLObject var3) {
        final SubLObject var4 = Numbers.subtract((SubLObject)module0435.ONE_INTEGER, var3);
        return Numbers.min((SubLObject)module0435.ONE_INTEGER, Numbers.max((SubLObject)module0435.ZERO_INTEGER, var4));
    }
    
    public static SubLObject f30614(final SubLObject var5) {
        return (SubLObject)ConsesLow.list(var5);
    }
    
    public static SubLObject f30615(final SubLObject var5) {
        return (SubLObject)((module0435.NIL != var5) ? f30614(var5) : module0435.NIL);
    }
    
    public static SubLObject f30616(final SubLObject var5) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0435.NIL == var5);
    }
    
    public static SubLObject f30617(final SubLObject var6, final SubLObject var7) {
        final SubLObject var8 = (SubLObject)ConsesLow.list(module0435.$ic0$, var6, var7);
        final SubLObject var9 = module0191.f11990((SubLObject)module0435.$ic1$, var8, (SubLObject)module0435.UNPROVIDED, (SubLObject)module0435.UNPROVIDED);
        return var9;
    }
    
    public static SubLObject f30618(final SubLObject var6, final SubLObject var7) {
        return (SubLObject)ConsesLow.list(f30617(var6, var7));
    }
    
    public static SubLObject f30619(final SubLObject var10, final SubLObject var11) {
        final SubLObject var12 = (SubLObject)ConsesLow.list(module0435.$ic2$, var10, var11);
        final SubLObject var13 = module0191.f11990((SubLObject)module0435.$ic3$, var12, (SubLObject)module0435.UNPROVIDED, (SubLObject)module0435.UNPROVIDED);
        return var13;
    }
    
    public static SubLObject f30620(final SubLObject var10, final SubLObject var11) {
        if (!var10.eql(var11)) {
            return (SubLObject)ConsesLow.list(f30619(var10, var11));
        }
        return (SubLObject)module0435.NIL;
    }
    
    public static SubLObject f30621(final SubLObject var10, final SubLObject var11) {
        final SubLObject var12 = (SubLObject)ConsesLow.list(module0435.$ic4$, var10, var11);
        final SubLObject var13 = module0191.f11990((SubLObject)module0435.$ic3$, var12, (SubLObject)module0435.UNPROVIDED, (SubLObject)module0435.UNPROVIDED);
        return var13;
    }
    
    public static SubLObject f30622(final SubLObject var10, final SubLObject var11) {
        if (!var10.eql(var11)) {
            return (SubLObject)ConsesLow.list(f30621(var10, var11));
        }
        return (SubLObject)module0435.NIL;
    }
    
    public static SubLObject f30623() {
        return module0191.f11990((SubLObject)module0435.$ic5$, (SubLObject)module0435.$ic6$, module0132.$g1562$.getGlobalValue(), (SubLObject)module0435.$ic7$);
    }
    
    public static SubLObject f30624() {
        return Numbers.add(new SubLObject[] { module0340.f22914(), module0340.f22968(), module0340.f22960(), module0340.f22977(), module0340.f22982(), module0340.f22998(), module0340.f23002(), module0530.f33015(), module0195.f12188(), module0592.f36112(), module0592.f36127() });
    }
    
    public static SubLObject f30625(SubLObject var12) {
        if (var12 == module0435.UNPROVIDED) {
            var12 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject var13 = module0340.f22914();
        final SubLObject var14 = module0340.f22968();
        final SubLObject var15 = module0340.f22960();
        final SubLObject var16 = module0340.f22977();
        final SubLObject var17 = module0340.f22982();
        final SubLObject var18 = module0340.f22998();
        final SubLObject var19 = module0340.f23002();
        final SubLObject var20 = module0530.f33015();
        final SubLObject var21 = module0195.f12188();
        final SubLObject var22 = module0592.f36112();
        final SubLObject var23 = module0592.f36127();
        final SubLObject var24 = Numbers.add(new SubLObject[] { var13, var14, var15, var16, var17, var20, var21, var22, var23 });
        PrintLow.format(var12, (SubLObject)module0435.$ic8$, module0011.f351());
        PrintLow.format(var12, (SubLObject)module0435.$ic9$, var24);
        PrintLow.format(var12, (SubLObject)module0435.$ic10$, var13);
        PrintLow.format(var12, (SubLObject)module0435.$ic11$, var14);
        PrintLow.format(var12, (SubLObject)module0435.$ic12$, var15);
        PrintLow.format(var12, (SubLObject)module0435.$ic13$, var16);
        PrintLow.format(var12, (SubLObject)module0435.$ic14$, var17);
        PrintLow.format(var12, (SubLObject)module0435.$ic15$, var18);
        PrintLow.format(var12, (SubLObject)module0435.$ic16$, var19);
        PrintLow.format(var12, (SubLObject)module0435.$ic17$, var20);
        PrintLow.format(var12, (SubLObject)module0435.$ic18$, var21);
        PrintLow.format(var12, (SubLObject)module0435.$ic19$, var22);
        PrintLow.format(var12, (SubLObject)module0435.$ic20$, var23);
        streams_high.terpri(var12);
        return (SubLObject)module0435.NIL;
    }
    
    public static SubLObject f30626(final SubLObject var25, final SubLObject var2) {
        final SubLObject var26 = ConsesLow.append(module0038.f2818(), (SubLObject)module0435.$ic21$);
        SubLObject var27 = Sequences.delete_if((SubLObject)module0435.$ic22$, module0038.f2738(var25, var26, (SubLObject)module0435.UNPROVIDED, (SubLObject)module0435.UNPROVIDED, (SubLObject)module0435.UNPROVIDED, (SubLObject)module0435.UNPROVIDED, (SubLObject)module0435.UNPROVIDED), (SubLObject)module0435.UNPROVIDED, (SubLObject)module0435.UNPROVIDED, (SubLObject)module0435.UNPROVIDED, (SubLObject)module0435.UNPROVIDED);
        if (var2.eql((SubLObject)module0435.$ic23$)) {
            var27 = module0035.f1973((SubLObject)module0435.$ic24$, var27);
        }
        else if (var2.eql((SubLObject)module0435.$ic25$)) {
            if (module0435.NIL != module0038.f2668((SubLObject)module0435.$ic26$, var27.first(), Symbols.symbol_function((SubLObject)module0435.EQUALP), (SubLObject)module0435.UNPROVIDED, (SubLObject)module0435.UNPROVIDED)) {
                var27 = module0035.f1973((SubLObject)module0435.$ic27$, var27.rest());
            }
            else {
                var27 = module0035.f1973((SubLObject)module0435.$ic27$, var27);
            }
        }
        return f30627(var27);
    }
    
    public static SubLObject f30627(final SubLObject var27) {
        final SubLObject var28 = Strings.string_upcase(module0038.f2761(var27, (SubLObject)Characters.CHAR_hyphen), (SubLObject)module0435.UNPROVIDED, (SubLObject)module0435.UNPROVIDED);
        final SubLObject var29 = Symbols.gensym(var28);
        final SubLObject var30 = Symbols.make_keyword(var29);
        return var30;
    }
    
    public static SubLObject f30628() {
        final SubLObject var31 = module0373.f26113();
        if (module0435.NIL != var31) {
            return module0361.f24172(var31);
        }
        return module0410.f28551((SubLObject)module0435.$ic28$);
    }
    
    public static SubLObject f30629(final SubLObject var32) {
        return module0035.f2169(var32, module0435.$g3534$.getGlobalValue());
    }
    
    public static SubLObject f30630(final SubLObject var32, final SubLObject var9) {
        SubLObject var33 = module0435.$g3535$.getGlobalValue();
        SubLObject var34 = (SubLObject)module0435.NIL;
        var34 = var33.first();
        while (module0435.NIL != var33) {
            SubLObject var36;
            final SubLObject var35 = var36 = var34;
            SubLObject var37 = (SubLObject)module0435.NIL;
            SubLObject var38 = (SubLObject)module0435.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)module0435.$ic31$);
            var37 = var36.first();
            var36 = (var38 = var36.rest());
            if (var32.eql(var37) && var9.eql(var38)) {
                return (SubLObject)module0435.T;
            }
            var33 = var33.rest();
            var34 = var33.first();
        }
        return (SubLObject)module0435.NIL;
    }
    
    public static SubLObject f30631(final SubLObject var32) {
        return module0035.f2169(var32, module0435.$g3536$.getGlobalValue());
    }
    
    public static SubLObject f30632(final SubLObject var32) {
        return module0035.f2169(var32, module0435.$g3537$.getGlobalValue());
    }
    
    public static SubLObject f30633() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0435", "f30612", "S#33873", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0435", "f30613", "S#33874", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0435", "f30614", "S#33875", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0435", "f30615", "S#10716", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0435", "f30616", "S#33876", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0435", "f30617", "S#33877", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0435", "f30618", "S#33878", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0435", "f30619", "S#24290", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0435", "f30620", "S#33879", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0435", "f30621", "S#24291", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0435", "f30622", "S#33880", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0435", "f30623", "S#33881", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0435", "f30624", "S#33882", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0435", "f30625", "S#33883", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0435", "f30626", "S#26339", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0435", "f30627", "S#33884", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0435", "f30628", "S#33885", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0435", "f30629", "S#31812", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0435", "f30630", "S#31813", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0435", "f30631", "S#31811", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0435", "f30632", "S#31810", 1, 0, false);
        return (SubLObject)module0435.NIL;
    }
    
    public static SubLObject f30634() {
        module0435.$g3534$ = SubLFiles.deflexical("S#33886", (SubLObject)module0435.$ic29$);
        module0435.$g3535$ = SubLFiles.deflexical("S#33887", (SubLObject)module0435.$ic30$);
        module0435.$g3536$ = SubLFiles.deflexical("S#33888", (SubLObject)module0435.$ic32$);
        module0435.$g3537$ = SubLFiles.deflexical("S#33889", (SubLObject)module0435.$ic33$);
        return (SubLObject)module0435.NIL;
    }
    
    public static SubLObject f30635() {
        return (SubLObject)module0435.NIL;
    }
    
    public void declareFunctions() {
        f30633();
    }
    
    public void initializeVariables() {
        f30634();
    }
    
    public void runTopLevelForms() {
        f30635();
    }
    
    static {
        me = (SubLFile)new module0435();
        module0435.$g3534$ = null;
        module0435.$g3535$ = null;
        module0435.$g3536$ = null;
        module0435.$g3537$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic1$ = SubLObjectFactory.makeKeyword("ISA");
        $ic2$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $ic3$ = SubLObjectFactory.makeKeyword("GENLPREDS");
        $ic4$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $ic5$ = SubLObjectFactory.makeKeyword("CODE");
        $ic6$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?X"));
        $ic7$ = SubLObjectFactory.makeKeyword("TRUE-MON");
        $ic8$ = SubLObjectFactory.makeString("~%;;; System ~a HL module statistics");
        $ic9$ = SubLObjectFactory.makeString("~%HL Modules                   : ~6,' D");
        $ic10$ = SubLObjectFactory.makeString("~% Removal Modules             : ~6,' D");
        $ic11$ = SubLObjectFactory.makeString("~% Meta-Removal Modules        : ~6,' D");
        $ic12$ = SubLObjectFactory.makeString("~% Conjunctive Removal Modules : ~6,' D");
        $ic13$ = SubLObjectFactory.makeString("~% Transformation Modules      : ~6,' D");
        $ic14$ = SubLObjectFactory.makeString("~% Meta-Transformation Modules : ~6,' D");
        $ic15$ = SubLObjectFactory.makeString("~% Structural Modules          : ~6,' D");
        $ic16$ = SubLObjectFactory.makeString("~% Meta-Structural Modules     : ~6,' D");
        $ic17$ = SubLObjectFactory.makeString("~% Forward Modules             : ~6,' D");
        $ic18$ = SubLObjectFactory.makeString("~% Storage Modules             : ~6,' D");
        $ic19$ = SubLObjectFactory.makeString("~% Evaluatable Predicates      : ~6,' D");
        $ic20$ = SubLObjectFactory.makeString("~% Evaluatable Functions       : ~6,' D");
        $ic21$ = ConsesLow.list((SubLObject)Characters.CHAR_lparen, (SubLObject)Characters.CHAR_rparen, (SubLObject)Characters.CHAR_less, (SubLObject)Characters.CHAR_greater, (SubLObject)SubLObjectFactory.makeString("#$"), (SubLObject)Characters.CHAR_period);
        $ic22$ = SubLObjectFactory.makeSymbol("S#3962", "CYC");
        $ic23$ = SubLObjectFactory.makeKeyword("POS");
        $ic24$ = SubLObjectFactory.makeString("pos");
        $ic25$ = SubLObjectFactory.makeKeyword("NEG");
        $ic26$ = SubLObjectFactory.makeString("not");
        $ic27$ = SubLObjectFactory.makeString("neg");
        $ic28$ = SubLObjectFactory.makeKeyword("NEW-TERMS-ALLOWED?");
        $ic29$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("REMOVAL-NOT-ISA-COLLECTION-CHECK"), SubLObjectFactory.makeKeyword("REMOVAL-NOT-QUOTED-ISA-COLLECTION-CHECK"), SubLObjectFactory.makeKeyword("REMOVAL-NOT-CONCEPTUALLY-RELATED"), SubLObjectFactory.makeKeyword("REMOVAL-NOT-DISJOINTWITH-CHECK"), SubLObjectFactory.makeKeyword("REMOVAL-NOT-GENLINVERSE-CHECK"), SubLObjectFactory.makeKeyword("REMOVAL-NOT-GENLMT-CHECK"), SubLObjectFactory.makeKeyword("REMOVAL-NOT-GENLPREDS-CHECK"), SubLObjectFactory.makeKeyword("REMOVAL-NOT-SUPERSET"), SubLObjectFactory.makeKeyword("REMOVAL-MINIMIZE-EXTENT"), SubLObjectFactory.makeKeyword("REMOVAL-NOT-NEGATIONINVERSE-CHECK"), SubLObjectFactory.makeKeyword("REMOVAL-NOT-NEGATIONPREDS-CHECK"), SubLObjectFactory.makeKeyword("REMOVAL-NOT-STARTS-AFTER-STARTING-OF"), SubLObjectFactory.makeKeyword("REMOVAL-NOT-STARTS-AFTER-ENDING-OF"), SubLObjectFactory.makeKeyword("REMOVAL-NOT-ENDS-AFTER-STARTING-OF"), SubLObjectFactory.makeKeyword("REMOVAL-NOT-ENDS-AFTER-ENDING-OF"), SubLObjectFactory.makeKeyword("REMOVAL-NOT-TEMPORALLY-SUBSUMES"), SubLObjectFactory.makeKeyword("REMOVAL-NOT-DATE-OF-EVENT"), SubLObjectFactory.makeKeyword("REMOVAL-NOT-COTEMPORAL"), SubLObjectFactory.makeKeyword("REMOVAL-NOT-TEMPORALLY-INTERSECTS"), SubLObjectFactory.makeKeyword("REMOVAL-NOT-TEMPORALLY-DISJOINT"), SubLObjectFactory.makeKeyword("REMOVAL-NOT-TEMPORAL-BOUNDS-CONTAIN"), SubLObjectFactory.makeKeyword("REMOVAL-NOT-TEMPORAL-BOUNDS-SUBSUME"), SubLObjectFactory.makeKeyword("REMOVAL-NOT-TEMPORAL-BOUNDS-INTERSECT"), SubLObjectFactory.makeKeyword("REMOVAL-NOT-TEMPORAL-BOUNDS-IDENTICAL"), SubLObjectFactory.makeKeyword("REMOVAL-NOT-TEMPORALLY-COORIGINATING"), SubLObjectFactory.makeKeyword("REMOVAL-NOT-TEMPORALLY-COTERMINAL"), SubLObjectFactory.makeKeyword("REMOVAL-NOT-CONTIGUOUS-AFTER"), SubLObjectFactory.makeKeyword("REMOVAL-NOT-STARTS-DURING"), SubLObjectFactory.makeKeyword("REMOVAL-NOT-ENDS-DURING"), SubLObjectFactory.makeKeyword("REMOVAL-NOT-STARTING-DATE"), SubLObjectFactory.makeKeyword("REMOVAL-NOT-ENDING-DATE"), SubLObjectFactory.makeKeyword("REMOVAL-NOT-BIRTH-DATE"), SubLObjectFactory.makeKeyword("REMOVAL-NOT-DATE-OF-DEATH"), SubLObjectFactory.makeKeyword("REMOVAL-NOT-TEMPORALLY-STARTED-BY"), SubLObjectFactory.makeKeyword("REMOVAL-NOT-TEMPORALLY-FINISHED-BY"), SubLObjectFactory.makeKeyword("REMOVAL-NOT-OVERLAPS-START") });
        $ic30$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-NOT-ISA-COLLECTION-CHECK"), (SubLObject)SubLObjectFactory.makeKeyword("ISA")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-ISA-DEFN-REJECT"), (SubLObject)SubLObjectFactory.makeKeyword("ISA")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-NOT-QUOTED-ISA-COLLECTION-CHECK"), (SubLObject)SubLObjectFactory.makeKeyword("ISA")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-QUOTED-ISA-DEFN-REJECT"), (SubLObject)SubLObjectFactory.makeKeyword("ISA")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-COMPLETELY-DECIDABLE-NEG"), (SubLObject)SubLObjectFactory.makeKeyword("MINIMIZE")));
        $ic31$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#205", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#14595", "CYC"));
        $ic32$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("REMOVAL-SKOLEMIZE-CREATE"), SubLObjectFactory.makeKeyword("REMOVAL-RELATION-ALL-EXISTS-UNIFY"), SubLObjectFactory.makeKeyword("REMOVAL-RELATION-EXISTS-ALL-UNIFY"), SubLObjectFactory.makeKeyword("REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG1"), SubLObjectFactory.makeKeyword("REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG2"), SubLObjectFactory.makeKeyword("REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG1"), SubLObjectFactory.makeKeyword("REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG2"), SubLObjectFactory.makeKeyword("REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG1"), SubLObjectFactory.makeKeyword("REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG2"), SubLObjectFactory.makeKeyword("REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG1"), SubLObjectFactory.makeKeyword("REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG2") });
        $ic33$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-PERFORM-SUBL-POS"), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-PERFORM-SUBL-NEG"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0435.class
	Total time: 133 ms
	
	Decompiled with Procyon 0.5.32.
*/