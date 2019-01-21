package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_country_of_city extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_country_of_city";
    public static final String myFingerPrint = "bc78ea23a7b8df4c95410d978a818839cfd6a3aae8bd10fdd26fd671639f21c7";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-country-of-city.lisp", position = 689L)
    public static SubLSymbol $country_of_city_mt$;
    private static final SubLSymbol $sym0$_COUNTRY_OF_CITY_MT_;
    private static final SubLObject $const1$WorldGeographyMt;
    private static final SubLObject $const2$isa;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLSymbol $kw5$CODE;
    private static final SubLSymbol $kw6$TRUE_MON;
    private static final SubLSymbol $kw7$ISA;
    private static final SubLSymbol $kw8$REMOVAL_COUNTRY_OF_CITY_UNIFY_POS;
    private static final SubLList $list9;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-country-of-city.lisp", position = 749L)
    public static SubLObject make_country_of_city_unify_pos_supports(final SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == removal_modules_country_of_city.UNPROVIDED) {
            support_mt = (SubLObject)removal_modules_country_of_city.NIL;
        }
        final SubLObject country = cycl_utilities.formula_arg2(cycl_utilities.atomic_sentence_arg2(support_sentence, (SubLObject)removal_modules_country_of_city.UNPROVIDED), (SubLObject)removal_modules_country_of_city.UNPROVIDED);
        final SubLObject isa_country = (SubLObject)ConsesLow.listS(removal_modules_country_of_city.$const2$isa, country, (SubLObject)removal_modules_country_of_city.$list3);
        final SubLObject code_rule = (SubLObject)removal_modules_country_of_city.$list4;
        final SubLObject code_support = arguments.make_hl_support((SubLObject)removal_modules_country_of_city.$kw5$CODE, code_rule, removal_modules_country_of_city.$country_of_city_mt$.getGlobalValue(), (SubLObject)removal_modules_country_of_city.$kw6$TRUE_MON);
        final SubLObject isa_support = arguments.make_hl_support((SubLObject)removal_modules_country_of_city.$kw7$ISA, isa_country, (SubLObject)removal_modules_country_of_city.UNPROVIDED, (SubLObject)removal_modules_country_of_city.UNPROVIDED);
        return Values.values(code_support, (SubLObject)ConsesLow.list(isa_support));
    }
    
    public static SubLObject declare_removal_modules_country_of_city_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_country_of_city", "make_country_of_city_unify_pos_supports", "MAKE-COUNTRY-OF-CITY-UNIFY-POS-SUPPORTS", 1, 1, false);
        return (SubLObject)removal_modules_country_of_city.NIL;
    }
    
    public static SubLObject init_removal_modules_country_of_city_file() {
        removal_modules_country_of_city.$country_of_city_mt$ = SubLFiles.deflexical("*COUNTRY-OF-CITY-MT*", (removal_modules_country_of_city.NIL != Symbols.boundp((SubLObject)removal_modules_country_of_city.$sym0$_COUNTRY_OF_CITY_MT_)) ? removal_modules_country_of_city.$country_of_city_mt$.getGlobalValue() : removal_modules_country_of_city.$const1$WorldGeographyMt);
        return (SubLObject)removal_modules_country_of_city.NIL;
    }
    
    public static SubLObject setup_removal_modules_country_of_city_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)removal_modules_country_of_city.$sym0$_COUNTRY_OF_CITY_MT_);
        mt_vars.note_mt_var((SubLObject)removal_modules_country_of_city.$sym0$_COUNTRY_OF_CITY_MT_, (SubLObject)removal_modules_country_of_city.NIL);
        inference_modules.inference_removal_module((SubLObject)removal_modules_country_of_city.$kw8$REMOVAL_COUNTRY_OF_CITY_UNIFY_POS, (SubLObject)removal_modules_country_of_city.$list9);
        return (SubLObject)removal_modules_country_of_city.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_removal_modules_country_of_city_file();
    }
    
    @Override
	public void initializeVariables() {
        init_removal_modules_country_of_city_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_removal_modules_country_of_city_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_country_of_city();
        removal_modules_country_of_city.$country_of_city_mt$ = null;
        $sym0$_COUNTRY_OF_CITY_MT_ = SubLObjectFactory.makeSymbol("*COUNTRY-OF-CITY-MT*");
        $const1$WorldGeographyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WorldGeographyMt"));
        $const2$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $list3 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Country")));
        $list4 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?COUNTRY"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Country"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("countryOfCity")), (SubLObject)SubLObjectFactory.makeSymbol("?COUNTRY"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CityNamedFn")), (SubLObject)SubLObjectFactory.makeSymbol("??STRING"), (SubLObject)SubLObjectFactory.makeSymbol("?COUNTRY"))));
        $kw5$CODE = SubLObjectFactory.makeKeyword("CODE");
        $kw6$TRUE_MON = SubLObjectFactory.makeKeyword("TRUE-MON");
        $kw7$ISA = SubLObjectFactory.makeKeyword("ISA");
        $kw8$REMOVAL_COUNTRY_OF_CITY_UNIFY_POS = SubLObjectFactory.makeKeyword("REMOVAL-COUNTRY-OF-CITY-UNIFY-POS");
        $list9 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("countryOfCity")), SubLObjectFactory.makeKeyword("REQUIRED-MT"), SubLObjectFactory.makeSymbol("*COUNTRY-OF-CITY-MT*"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("countryOfCity")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CityNamedFn")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ISA"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Country")))))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("countryOfCity")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CityNamedFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("CITY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("COUNTRY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("COUNTRY"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("countryOfCity")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CityNamedFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CITY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("COUNTRY")))), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-COUNTRY-OF-CITY-UNIFY-POS-SUPPORTS"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$countryOfCity <not-fully-bound> (#$cityNamedFn <city> <country>)) where <city> is a string and <country> is FORT. "), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$countryOfCity ?X (#$CityNamedFn \"Austin\" #$UnitedStatesOfAmerica)) in #$WorldGeographyMt\n    (#$countryOfCity (#$CountryFn ?X) (#$CityNamedFn \"Austin\" (#$CountryFn #$GeorgeWashington))) in #$PeopleDataMt\n    ") });
    }
}

/*

	Total time: 21 ms
	
*/