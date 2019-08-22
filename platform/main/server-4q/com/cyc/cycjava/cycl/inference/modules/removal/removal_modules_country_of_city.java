package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_country_of_city extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_country_of_city();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_country_of_city";

    public static final String myFingerPrint = "bc78ea23a7b8df4c95410d978a818839cfd6a3aae8bd10fdd26fd671639f21c7";



    // Internal Constants
    public static final SubLSymbol $country_of_city_mt$ = makeSymbol("*COUNTRY-OF-CITY-MT*");

    private static final SubLObject $$WorldGeographyMt = reader_make_constant_shell(makeString("WorldGeographyMt"));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    public static final SubLList $list3 = list(reader_make_constant_shell(makeString("Country")));

    public static final SubLList $list4 = list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?COUNTRY"), reader_make_constant_shell(makeString("Country"))), list(reader_make_constant_shell(makeString("countryOfCity")), makeSymbol("?COUNTRY"), list(reader_make_constant_shell(makeString("CityNamedFn")), makeSymbol("??STRING"), makeSymbol("?COUNTRY"))));







    private static final SubLSymbol $REMOVAL_COUNTRY_OF_CITY_UNIFY_POS = makeKeyword("REMOVAL-COUNTRY-OF-CITY-UNIFY-POS");

    public static final SubLList $list9 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("countryOfCity")), makeKeyword("REQUIRED-MT"), makeSymbol("*COUNTRY-OF-CITY-MT*"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("countryOfCity")), makeKeyword("NOT-FULLY-BOUND"), list(reader_make_constant_shell(makeString("CityNamedFn")), makeKeyword("FULLY-BOUND"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("ISA"), reader_make_constant_shell(makeString("Country")))))), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("countryOfCity")), makeKeyword("ANYTHING"), list(reader_make_constant_shell(makeString("CityNamedFn")), list(makeKeyword("BIND"), makeSymbol("CITY")), list(makeKeyword("BIND"), makeSymbol("COUNTRY")))), list(makeKeyword("VALUE"), makeSymbol("COUNTRY"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("countryOfCity")), makeKeyword("INPUT"), list(reader_make_constant_shell(makeString("CityNamedFn")), list(makeKeyword("VALUE"), makeSymbol("CITY")), list(makeKeyword("VALUE"), makeSymbol("COUNTRY")))), makeKeyword("SUPPORT"), makeSymbol("MAKE-COUNTRY-OF-CITY-UNIFY-POS-SUPPORTS"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$countryOfCity <not-fully-bound> (#$cityNamedFn <city> <country>)) where <city> is a string and <country> is FORT. "), makeKeyword("EXAMPLE"), makeString("(#$countryOfCity ?X (#$CityNamedFn \"Austin\" #$UnitedStatesOfAmerica)) in #$WorldGeographyMt\n    (#$countryOfCity (#$CountryFn ?X) (#$CityNamedFn \"Austin\" (#$CountryFn #$GeorgeWashington))) in #$PeopleDataMt\n    ") });

    public static SubLObject make_country_of_city_unify_pos_supports(final SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == UNPROVIDED) {
            support_mt = NIL;
        }
        final SubLObject country = cycl_utilities.formula_arg2(cycl_utilities.atomic_sentence_arg2(support_sentence, UNPROVIDED), UNPROVIDED);
        final SubLObject isa_country = listS($$isa, country, $list3);
        final SubLObject code_rule = $list4;
        final SubLObject code_support = arguments.make_hl_support($CODE, code_rule, $country_of_city_mt$.getGlobalValue(), $TRUE_MON);
        final SubLObject isa_support = arguments.make_hl_support($ISA, isa_country, UNPROVIDED, UNPROVIDED);
        return values(code_support, list(isa_support));
    }

    public static SubLObject declare_removal_modules_country_of_city_file() {
        declareFunction(me, "make_country_of_city_unify_pos_supports", "MAKE-COUNTRY-OF-CITY-UNIFY-POS-SUPPORTS", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_country_of_city_file() {
        deflexical("*COUNTRY-OF-CITY-MT*", SubLTrampolineFile.maybeDefault($country_of_city_mt$, $country_of_city_mt$, $$WorldGeographyMt));
        return NIL;
    }

    public static SubLObject setup_removal_modules_country_of_city_file() {
        declare_defglobal($country_of_city_mt$);
        mt_vars.note_mt_var($country_of_city_mt$, NIL);
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

    
}

/**
 * Total time: 21 ms
 */
