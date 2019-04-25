package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0297 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0297";
    public static final String myFingerPrint = "eef50d7f6683594af6a00ce10fad7d6fe81297faa6acd0caef6a76e31338ed39";
    private static SubLSymbol $g2693$;
    private static final SubLObject $ic0$;
    private static final SubLList $ic1$;
    private static final SubLInteger $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLObject $ic12$;
    
    public static SubLObject f19978(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        return module0297.$g2693$.getGlobalValue();
    }
    
    public static SubLObject f19979(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        if (module0297.NIL != module0202.f12589(var1, module0297.$ic4$) && module0297.NIL != module0202.f12589(module0205.f13368(var1, (SubLObject)module0297.UNPROVIDED), module0297.$ic5$) && module0297.NIL != module0035.f2169(module0297.$ic6$, module0291.f19623(var3, var2))) {
            return f19980(var1, var2, var3, (SubLObject)module0297.NIL);
        }
        return (SubLObject)module0297.NIL;
    }
    
    public static SubLObject f19981(final SubLObject var1, final SubLObject var4, final SubLObject var2, final SubLObject var3) {
        return f19980(var1, var2, var3, (SubLObject)module0297.T);
    }
    
    public static SubLObject f19980(SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var5) {
        SubLObject var6 = (SubLObject)module0297.NIL;
        final SubLObject var7 = module0205.f13277(var1, (SubLObject)module0297.UNPROVIDED);
        final SubLObject var8 = f19982(var7);
        if (module0297.NIL != var8) {
            if (module0297.NIL != var5) {
                var1 = module0202.f12702(var1);
            }
            final SubLObject var9 = module0205.f13368(var1, (SubLObject)module0297.UNPROVIDED);
            if (module0297.NIL != module0202.f12589(var9, module0297.$ic5$)) {
                final SubLObject var10 = module0205.f13277(var9, (SubLObject)module0297.UNPROVIDED);
                SubLObject var11;
                SubLObject var12;
                for (var11 = conses_high.cddr(var9), var12 = module0205.f13368(var9, (SubLObject)module0297.UNPROVIDED); module0297.NIL != module0202.f12606(var12); var12 = module0205.f13204(var12, (SubLObject)module0297.UNPROVIDED), var11 = conses_high.cdar(var11).rest()) {}
                if (module0297.NIL != module0202.f12595(var12)) {
                    final SubLObject var13 = module0205.f13207(var12, (SubLObject)module0297.UNPROVIDED);
                    if (module0297.NIL != Sequences.find_if((SubLObject)module0297.$ic9$, var13, (SubLObject)module0297.UNPROVIDED, (SubLObject)module0297.UNPROVIDED, (SubLObject)module0297.UNPROVIDED)) {
                        SubLObject var14 = (SubLObject)module0297.NIL;
                        SubLObject var15 = var13;
                        SubLObject var16 = (SubLObject)module0297.NIL;
                        var16 = var15.first();
                        while (module0297.NIL != var15) {
                            if (module0297.NIL == module0202.f12589(var16, module0297.$ic10$) || !var10.eql(module0205.f13203(var16, (SubLObject)module0297.UNPROVIDED)) || module0297.NIL == module0035.f2169(module0205.f13204(var16, (SubLObject)module0297.UNPROVIDED), var8)) {
                                var14 = (SubLObject)ConsesLow.cons(var16, var14);
                            }
                            var15 = var15.rest();
                            var16 = var15.first();
                        }
                        var14 = Sequences.nreverse(var14);
                        if (!var13.equal(var14)) {
                            var6 = (SubLObject)module0297.T;
                            if (module0297.NIL != var14 && module0297.NIL != var5) {
                                final SubLObject var17 = module0276.f18304(module0276.f18287(var14, (SubLObject)module0297.T), (SubLObject)module0297.UNPROVIDED);
                                ConsesLow.rplaca(var11, var17);
                            }
                        }
                    }
                }
            }
        }
        if (module0297.NIL != var5) {
            return Values.values(var1, var6);
        }
        return var6;
    }
    
    public static SubLObject f19982(final SubLObject var7) {
        if (module0297.NIL != module0173.f10955(var7)) {
            return (SubLObject)ConsesLow.list(var7);
        }
        if (module0297.NIL != module0202.f12589(var7, module0297.$ic11$)) {
            return module0205.f13207(var7, (SubLObject)module0297.UNPROVIDED);
        }
        if (module0297.NIL != module0202.f12589(var7, module0297.$ic12$)) {
            return module0205.f13207(module0205.f13203(var7, (SubLObject)module0297.UNPROVIDED), (SubLObject)module0297.UNPROVIDED);
        }
        return (SubLObject)module0297.NIL;
    }
    
    public static SubLObject f19983() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0297", "f19978", "S#22622", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0297", "f19979", "S#22623", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0297", "f19981", "S#22624", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0297", "f19980", "S#22625", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0297", "f19982", "S#22626", 1, 0, false);
        return (SubLObject)module0297.NIL;
    }
    
    public static SubLObject f19984() {
        module0297.$g2693$ = SubLFiles.deflexical("S#22627", (SubLObject)module0297.$ic2$);
        return (SubLObject)module0297.NIL;
    }
    
    public static SubLObject f19985() {
        module0292.f19698(module0297.$ic0$, (SubLObject)module0297.$ic1$);
        module0012.f419((SubLObject)module0297.$ic3$);
        module0012.f419((SubLObject)module0297.$ic7$);
        module0012.f419((SubLObject)module0297.$ic8$);
        return (SubLObject)module0297.NIL;
    }
    
    public void declareFunctions() {
        f19983();
    }
    
    public void initializeVariables() {
        f19984();
    }
    
    public void runTopLevelForms() {
        f19985();
    }
    
    static {
        me = (SubLFile)new module0297();
        module0297.$g2693$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SubcollectionSimplifierRLModule"));
        $ic1$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("S#22623", "CYC"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#22622", "CYC"), SubLObjectFactory.makeKeyword("REFORMULATE"), SubLObjectFactory.makeSymbol("S#22624", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("Simplifies a #$SubcollectionFunction NAUT by removing redundancies."), SubLObjectFactory.makeKeyword("EXAMPLE-SOURCE"), SubLObjectFactory.makeString("(#$CollectionSubsetFn #$Sheep (#$TheSetOf ?X (#$and (#$isa ?X #$Sheep) (#$hates ?X #$Bertolo))))"), SubLObjectFactory.makeKeyword("EXAMPLE-TARGET"), SubLObjectFactory.makeString("(#$CollectionSubsetFn #$Sheep (#$TheSetOf ?X (#$hates ?X #$Bertolo))") });
        $ic2$ = SubLObjectFactory.makeInteger(212);
        $ic3$ = SubLObjectFactory.makeSymbol("S#22622", "CYC");
        $ic4$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CollectionSubsetFn"));
        $ic5$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheSetOf"));
        $ic6$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ReformulatorMode-Simplify"));
        $ic7$ = SubLObjectFactory.makeSymbol("S#22623", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("S#22624", "CYC");
        $ic9$ = SubLObjectFactory.makeSymbol("S#15753", "CYC");
        $ic10$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic11$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CollectionIntersection2Fn"));
        $ic12$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CollectionIntersectionFn"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0297.class
	Total time: 86 ms
	
	Decompiled with Procyon 0.5.32.
*/