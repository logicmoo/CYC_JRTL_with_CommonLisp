package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = module0205.f13204(module0205.f13388(var1, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
        final SubLObject var4 = (SubLObject)ConsesLow.listS($ic2$, var3, (SubLObject)$ic3$);
        final SubLObject var5 = (SubLObject)$ic4$;
        final SubLObject var6 = module0191.f11990((SubLObject)$ic5$, var5, $g3846$.getGlobalValue(), (SubLObject)$ic6$);
        final SubLObject var7 = module0191.f11990((SubLObject)$ic7$, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return Values.values(var6, (SubLObject)ConsesLow.list(var7));
    }
    
    public static SubLObject f32506() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0512", "f32505", "S#35947", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32507() {
        $g3846$ = SubLFiles.deflexical("S#35948", (NIL != Symbols.boundp((SubLObject)$ic0$)) ? $g3846$.getGlobalValue() : $ic1$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f32508() {
        module0003.f57((SubLObject)$ic0$);
        module0132.f8593((SubLObject)$ic0$, (SubLObject)NIL);
        module0340.f22941((SubLObject)$ic8$, (SubLObject)$ic9$);
        return (SubLObject)NIL;
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
        $g3846$ = null;
        $ic0$ = makeSymbol("S#35948", "CYC");
        $ic1$ = constant_handles_oc.f8479((SubLObject)makeString("WorldGeographyMt"));
        $ic2$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic3$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Country")));
        $ic4$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("implies")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?COUNTRY"), constant_handles_oc.f8479((SubLObject)makeString("Country"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("countryOfCity")), (SubLObject)makeSymbol("?COUNTRY"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("CityNamedFn")), (SubLObject)makeSymbol("??STRING"), (SubLObject)makeSymbol("?COUNTRY"))));
        $ic5$ = makeKeyword("CODE");
        $ic6$ = makeKeyword("TRUE-MON");
        $ic7$ = makeKeyword("ISA");
        $ic8$ = makeKeyword("REMOVAL-COUNTRY-OF-CITY-UNIFY-POS");
        $ic9$ = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles_oc.f8479((SubLObject)makeString("countryOfCity")), makeKeyword("REQUIRED-MT"), makeSymbol("S#35948", "CYC"), makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("countryOfCity")), (SubLObject)makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("CityNamedFn")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("AND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("ISA"), constant_handles_oc.f8479((SubLObject)makeString("Country")))))), makeKeyword("COST-EXPRESSION"), makeSymbol("S#1887", "CYC"), makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("countryOfCity")), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("CityNamedFn")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35949", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#35950", "CYC")))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35950", "CYC"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("countryOfCity")), (SubLObject)makeKeyword("INPUT"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("CityNamedFn")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35949", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeSymbol("S#35950", "CYC")))), makeKeyword("SUPPORT"), makeSymbol("S#35947", "CYC"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$countryOfCity <not-fully-bound> (#$cityNamedFn <city> <country>)) where <city> is a string and <country> is FORT. "), makeKeyword("EXAMPLE"), makeString("(#$countryOfCity ?X (#$CityNamedFn \"Austin\" #$UnitedStatesOfAmerica)) in #$WorldGeographyMt\n    (#$countryOfCity (#$CountryFn ?X) (#$CityNamedFn \"Austin\" (#$CountryFn #$GeorgeWashington))) in #$PeopleDataMt\n    ") });
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 54 ms
	
	Decompiled with Procyon 0.5.32.
*/