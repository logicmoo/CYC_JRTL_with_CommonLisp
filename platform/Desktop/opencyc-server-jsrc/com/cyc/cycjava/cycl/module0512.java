package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0512 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0512";
    public static final String myFingerPrint = "bc78ea23a7b8df4c95410d978a818839cfd6a3aae8bd10fdd26fd671639f21c7";
    public static SubLSymbol $g3846$;
    private static final SubLSymbol $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLObject $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    
    public static SubLObject f32505(final SubLObject var1, SubLObject var2) {
        if (var2 == module0512.UNPROVIDED) {
            var2 = (SubLObject)module0512.NIL;
        }
        final SubLObject var3 = module0205.f13204(module0205.f13388(var1, (SubLObject)module0512.UNPROVIDED), (SubLObject)module0512.UNPROVIDED);
        final SubLObject var4 = (SubLObject)ConsesLow.listS(module0512.$ic2$, var3, (SubLObject)module0512.$ic3$);
        final SubLObject var5 = (SubLObject)module0512.$ic4$;
        final SubLObject var6 = module0191.f11990((SubLObject)module0512.$ic5$, var5, module0512.$g3846$.getGlobalValue(), (SubLObject)module0512.$ic6$);
        final SubLObject var7 = module0191.f11990((SubLObject)module0512.$ic7$, var4, (SubLObject)module0512.UNPROVIDED, (SubLObject)module0512.UNPROVIDED);
        return Values.values(var6, (SubLObject)ConsesLow.list(var7));
    }
    
    public static SubLObject f32506() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0512", "f32505", "S#35947", 1, 1, false);
        return (SubLObject)module0512.NIL;
    }
    
    public static SubLObject f32507() {
        module0512.$g3846$ = SubLFiles.deflexical("S#35948", (module0512.NIL != Symbols.boundp((SubLObject)module0512.$ic0$)) ? module0512.$g3846$.getGlobalValue() : module0512.$ic1$);
        return (SubLObject)module0512.NIL;
    }
    
    public static SubLObject f32508() {
        module0003.f57((SubLObject)module0512.$ic0$);
        module0132.f8593((SubLObject)module0512.$ic0$, (SubLObject)module0512.NIL);
        module0340.f22941((SubLObject)module0512.$ic8$, (SubLObject)module0512.$ic9$);
        return (SubLObject)module0512.NIL;
    }
    
    public void declareFunctions() {
        f32506();
    }
    
    public void initializeVariables() {
        f32507();
    }
    
    public void runTopLevelForms() {
        f32508();
    }
    
    static {
        me = (SubLFile)new module0512();
        module0512.$g3846$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#35948", "CYC");
        $ic1$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("WorldGeographyMt"));
        $ic2$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic3$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Country")));
        $ic4$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?COUNTRY"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Country"))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("countryOfCity")), (SubLObject)SubLObjectFactory.makeSymbol("?COUNTRY"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("CityNamedFn")), (SubLObject)SubLObjectFactory.makeSymbol("??STRING"), (SubLObject)SubLObjectFactory.makeSymbol("?COUNTRY"))));
        $ic5$ = SubLObjectFactory.makeKeyword("CODE");
        $ic6$ = SubLObjectFactory.makeKeyword("TRUE-MON");
        $ic7$ = SubLObjectFactory.makeKeyword("ISA");
        $ic8$ = SubLObjectFactory.makeKeyword("REMOVAL-COUNTRY-OF-CITY-UNIFY-POS");
        $ic9$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("countryOfCity")), SubLObjectFactory.makeKeyword("REQUIRED-MT"), SubLObjectFactory.makeSymbol("S#35948", "CYC"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("countryOfCity")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("CityNamedFn")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ISA"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Country")))))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("S#1887", "CYC"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("countryOfCity")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("CityNamedFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#35949", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#35950", "CYC")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35950", "CYC"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("countryOfCity")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("CityNamedFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35949", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("S#35950", "CYC")))), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("S#35947", "CYC"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$countryOfCity <not-fully-bound> (#$cityNamedFn <city> <country>)) where <city> is a string and <country> is FORT. "), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$countryOfCity ?X (#$CityNamedFn \"Austin\" #$UnitedStatesOfAmerica)) in #$WorldGeographyMt\n    (#$countryOfCity (#$CountryFn ?X) (#$CityNamedFn \"Austin\" (#$CountryFn #$GeorgeWashington))) in #$PeopleDataMt\n    ") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0512.class
	Total time: 54 ms
	
	Decompiled with Procyon 0.5.32.
*/