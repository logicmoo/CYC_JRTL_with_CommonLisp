package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0523 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0523";
    public static final String myFingerPrint = "d1d990d34b4d5902ba6d51b765f0af2938c0d6ce38cf598b342384f760f86471";
    private static SubLSymbol $g3859$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    
    public static SubLObject f32661(final SubLObject var1, SubLObject var2) {
        if (var2 == module0523.UNPROVIDED) {
            var2 = (SubLObject)module0523.NIL;
        }
        final SubLObject var3 = module0205.f13387(var1, (SubLObject)module0523.UNPROVIDED);
        final SubLObject var4 = module0205.f13388(var1, (SubLObject)module0523.UNPROVIDED);
        return f32662(var3, var4);
    }
    
    public static SubLObject f32662(final SubLObject var3, final SubLObject var5) {
        if (module0523.NIL != module0193.f12105(var5)) {
            return module0523.$g3859$.getGlobalValue();
        }
        if (module0523.NIL != module0202.f12925(var5)) {
            if (var3.eql(module0523.$ic3$)) {
                return module0411.f28638(var5, (SubLObject)module0523.$ic4$, (SubLObject)module0523.UNPROVIDED, (SubLObject)module0523.UNPROVIDED);
            }
        }
        else if (module0523.NIL != module0202.f12595(var5) && var3.eql(module0523.$ic3$)) {
            return module0522.f32650(var5);
        }
        return (SubLObject)module0523.NIL;
    }
    
    public static SubLObject f32663(final SubLObject var1, SubLObject var2) {
        if (var2 == module0523.UNPROVIDED) {
            var2 = (SubLObject)module0523.NIL;
        }
        final SubLObject var3 = module0205.f13387(var1, (SubLObject)module0523.UNPROVIDED);
        final SubLObject var4 = module0205.f13388(var1, (SubLObject)module0523.UNPROVIDED);
        final SubLObject var5 = module0373.f26143();
        if (var3.eql(module0523.$ic3$)) {
            return module0522.f32654(var4, var5, var2);
        }
        return (SubLObject)module0523.NIL;
    }
    
    public static SubLObject f32664(final SubLObject var1, SubLObject var2) {
        if (var2 == module0523.UNPROVIDED) {
            var2 = (SubLObject)module0523.NIL;
        }
        return module0523.$g3859$.getGlobalValue();
    }
    
    public static SubLObject f32665(final SubLObject var1, SubLObject var2) {
        if (var2 == module0523.UNPROVIDED) {
            var2 = (SubLObject)module0523.NIL;
        }
        final SubLObject var3 = module0205.f13387(var1, (SubLObject)module0523.UNPROVIDED);
        final SubLObject var4 = module0205.f13388(var1, (SubLObject)module0523.UNPROVIDED);
        final SubLObject var5 = module0373.f26143();
        if (var3.eql(module0523.$ic3$)) {
            return module0522.f32657(var4, var5, var2);
        }
        return (SubLObject)module0523.NIL;
    }
    
    public static SubLObject f32666() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0523", "f32661", "S#36107", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0523", "f32662", "S#36108", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0523", "f32663", "S#36109", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0523", "f32664", "S#36110", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0523", "f32665", "S#36111", 1, 1, false);
        return (SubLObject)module0523.NIL;
    }
    
    public static SubLObject f32667() {
        module0523.$g3859$ = SubLFiles.deflexical("S#36112", module0018.$g661$.getGlobalValue());
        return (SubLObject)module0523.NIL;
    }
    
    public static SubLObject f32668() {
        module0340.f22938(module0523.$ic0$);
        module0340.f22941((SubLObject)module0523.$ic1$, (SubLObject)module0523.$ic2$);
        module0340.f22941((SubLObject)module0523.$ic5$, (SubLObject)module0523.$ic6$);
        return (SubLObject)module0523.NIL;
    }
    
    public void declareFunctions() {
        f32666();
    }
    
    public void initializeVariables() {
        f32667();
    }
    
    public void runTopLevelForms() {
        f32668();
    }
    
    static {
        me = (SubLFile)new module0523();
        module0523.$g3859$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("sourceSentence"));
        $ic1$ = SubLObjectFactory.makeKeyword("REMOVAL-SOURCE-SENTENCE-LOOKUP-POS");
        $ic2$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("sourceSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("sourceSentence")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26073", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#36107", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#36109", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$sourceSentence <SOURCE> \n                      (:or\n                        (:fully-bound . :fully-bound)\n                        ((:test inference-predicate-p) . :anything)\n                        (#$and . :anything)\n                      ))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$sourceSentence #$NWS-KS (#$weather #$CityOfLosAngelesCA ?WHAT))") });
        $ic3$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheCurrentCycKB"));
        $ic4$ = SubLObjectFactory.makeKeyword("POS");
        $ic5$ = SubLObjectFactory.makeKeyword("REMOVAL-SOURCE-SENTENCE-CHECK-NEG");
        $ic6$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("sourceSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("sourceSentence")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#26073", "CYC")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("S#36110", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("S#36111", "CYC"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$sourceSentence <fully-bound> <fully-bound>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$sourceSentence #$NWS-KS (#$weather #$CityOfLosAngelesCA #$Snowy)))") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0523.class
	Total time: 77 ms
	
	Decompiled with Procyon 0.5.32.
*/