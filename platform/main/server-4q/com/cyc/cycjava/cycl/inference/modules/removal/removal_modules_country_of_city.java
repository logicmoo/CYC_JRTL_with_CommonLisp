package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_country_of_city extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "bc78ea23a7b8df4c95410d978a818839cfd6a3aae8bd10fdd26fd671639f21c7";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-country-of-city.lisp", position = 600L)
    public static SubLSymbol $country_of_city_mt$;
    private static SubLSymbol $sym0$_COUNTRY_OF_CITY_MT_;
    private static SubLObject $$WorldGeographyMt;
    private static SubLObject $$isa;
    private static SubLList $list3;
    private static SubLList $list4;
    private static SubLSymbol $CODE;
    private static SubLSymbol $TRUE_MON;
    private static SubLSymbol $ISA;
    private static SubLSymbol $REMOVAL_COUNTRY_OF_CITY_UNIFY_POS;
    private static SubLList $list9;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-country-of-city.lisp", position = 700L)
    public static SubLObject make_country_of_city_unify_pos_supports(SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == UNPROVIDED) {
            support_mt = NIL;
        }
        SubLObject country = cycl_utilities.formula_arg2(cycl_utilities.atomic_sentence_arg2(support_sentence, UNPROVIDED), UNPROVIDED);
        SubLObject isa_country = listS($$isa, country, $list3);
        SubLObject code_rule = $list4;
        SubLObject code_support = arguments.make_hl_support($CODE, code_rule, $country_of_city_mt$.getGlobalValue(), $TRUE_MON);
        SubLObject isa_support = arguments.make_hl_support($ISA, isa_country, UNPROVIDED, UNPROVIDED);
        return Values.values(code_support, list(isa_support));
    }

    public static SubLObject declare_removal_modules_country_of_city_file() {
        declareFunction("make_country_of_city_unify_pos_supports", "MAKE-COUNTRY-OF-CITY-UNIFY-POS-SUPPORTS", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_country_of_city_file() {
        $country_of_city_mt$ = deflexical("*COUNTRY-OF-CITY-MT*", maybeDefault($sym0$_COUNTRY_OF_CITY_MT_, $country_of_city_mt$, $$WorldGeographyMt));
        return NIL;
    }

    public static SubLObject setup_removal_modules_country_of_city_file() {
        subl_macro_promotions.declare_defglobal($sym0$_COUNTRY_OF_CITY_MT_);
        mt_vars.note_mt_var($sym0$_COUNTRY_OF_CITY_MT_, NIL);
        inference_modules.inference_removal_module($REMOVAL_COUNTRY_OF_CITY_UNIFY_POS, $list9);
        return NIL;
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
        me = new removal_modules_country_of_city();
        $country_of_city_mt$ = null;
        $sym0$_COUNTRY_OF_CITY_MT_ = makeSymbol("*COUNTRY-OF-CITY-MT*");
        $$WorldGeographyMt = makeConstSym(("WorldGeographyMt"));
        $$isa = makeConstSym(("isa"));
        $list3 = list(makeConstSym(("Country")));
        $list4 = list(makeConstSym(("implies")), list(makeConstSym(("isa")), makeSymbol("?COUNTRY"), makeConstSym(("Country"))), list(makeConstSym(("countryOfCity")), makeSymbol("?COUNTRY"), list(makeConstSym(("CityNamedFn")), makeSymbol("??STRING"), makeSymbol("?COUNTRY"))));
        $CODE = makeKeyword("CODE");
        $TRUE_MON = makeKeyword("TRUE-MON");
        $ISA = makeKeyword("ISA");
        $REMOVAL_COUNTRY_OF_CITY_UNIFY_POS = makeKeyword("REMOVAL-COUNTRY-OF-CITY-UNIFY-POS");
        $list9 = list(
                new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("countryOfCity")), makeKeyword("REQUIRED-MT"), makeSymbol("*COUNTRY-OF-CITY-MT*"), makeKeyword("REQUIRED-PATTERN"),
                        list(makeConstSym(("countryOfCity")), makeKeyword("NOT-FULLY-BOUND"), list(makeConstSym(("CityNamedFn")), makeKeyword("FULLY-BOUND"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("ISA"), makeConstSym(("Country")))))), makeKeyword("COST-EXPRESSION"),
                        makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                        list(makeKeyword("TEMPLATE"), list(makeConstSym(("countryOfCity")), makeKeyword("ANYTHING"), list(makeConstSym(("CityNamedFn")), list(makeKeyword("BIND"), makeSymbol("CITY")), list(makeKeyword("BIND"), makeSymbol("COUNTRY")))),
                                list(makeKeyword("VALUE"), makeSymbol("COUNTRY"))),
                        makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                        list(makeConstSym(("countryOfCity")), makeKeyword("INPUT"), list(makeConstSym(("CityNamedFn")), list(makeKeyword("VALUE"), makeSymbol("CITY")), list(makeKeyword("VALUE"), makeSymbol("COUNTRY")))), makeKeyword("SUPPORT"), makeSymbol("MAKE-COUNTRY-OF-CITY-UNIFY-POS-SUPPORTS"),
                        makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$countryOfCity <not-fully-bound> (#$cityNamedFn <city> <country>)) where <city> is a string and <country> is FORT. "), makeKeyword("EXAMPLE"),
                        makeString("(#$countryOfCity ?X (#$CityNamedFn \"Austin\" #$UnitedStatesOfAmerica)) in #$WorldGeographyMt\n    (#$countryOfCity (#$CountryFn ?X) (#$CityNamedFn \"Austin\" (#$CountryFn #$GeorgeWashington))) in #$PeopleDataMt\n    ") });
    }
}
/*
 *
 * Total time: 21 ms
 *
 */