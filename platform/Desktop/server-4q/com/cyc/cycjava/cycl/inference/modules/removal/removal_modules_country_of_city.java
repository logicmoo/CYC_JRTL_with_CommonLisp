package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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

public final class removal_modules_country_of_city
    extends
      SubLTranslatedFile
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
  public static SubLObject make_country_of_city_unify_pos_supports(final SubLObject support_sentence, SubLObject support_mt)
  {
    if( support_mt == UNPROVIDED )
    {
      support_mt = NIL;
    }
    final SubLObject country = cycl_utilities.formula_arg2( cycl_utilities.atomic_sentence_arg2( support_sentence, UNPROVIDED ), UNPROVIDED );
    final SubLObject isa_country = ConsesLow.listS( $const2$isa, country, $list3 );
    final SubLObject code_rule = $list4;
    final SubLObject code_support = arguments.make_hl_support( $kw5$CODE, code_rule, $country_of_city_mt$.getGlobalValue(), $kw6$TRUE_MON );
    final SubLObject isa_support = arguments.make_hl_support( $kw7$ISA, isa_country, UNPROVIDED, UNPROVIDED );
    return Values.values( code_support, ConsesLow.list( isa_support ) );
  }

  public static SubLObject declare_removal_modules_country_of_city_file()
  {
    SubLFiles.declareFunction( me, "make_country_of_city_unify_pos_supports", "MAKE-COUNTRY-OF-CITY-UNIFY-POS-SUPPORTS", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_country_of_city_file()
  {
    $country_of_city_mt$ = SubLFiles.deflexical( "*COUNTRY-OF-CITY-MT*", maybeDefault( $sym0$_COUNTRY_OF_CITY_MT_, $country_of_city_mt$, $const1$WorldGeographyMt ) );
    return NIL;
  }

  public static SubLObject setup_removal_modules_country_of_city_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_COUNTRY_OF_CITY_MT_ );
    mt_vars.note_mt_var( $sym0$_COUNTRY_OF_CITY_MT_, NIL );
    inference_modules.inference_removal_module( $kw8$REMOVAL_COUNTRY_OF_CITY_UNIFY_POS, $list9 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_country_of_city_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_country_of_city_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_country_of_city_file();
  }
  static
  {
    me = new removal_modules_country_of_city();
    $country_of_city_mt$ = null;
    $sym0$_COUNTRY_OF_CITY_MT_ = makeSymbol( "*COUNTRY-OF-CITY-MT*" );
    $const1$WorldGeographyMt = constant_handles.reader_make_constant_shell( makeString( "WorldGeographyMt" ) );
    $const2$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $list3 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Country" ) ) );
    $list4 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?COUNTRY" ),
        constant_handles.reader_make_constant_shell( makeString( "Country" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "countryOfCity" ) ), makeSymbol( "?COUNTRY" ), ConsesLow.list(
            constant_handles.reader_make_constant_shell( makeString( "CityNamedFn" ) ), makeSymbol( "??STRING" ), makeSymbol( "?COUNTRY" ) ) ) );
    $kw5$CODE = makeKeyword( "CODE" );
    $kw6$TRUE_MON = makeKeyword( "TRUE-MON" );
    $kw7$ISA = makeKeyword( "ISA" );
    $kw8$REMOVAL_COUNTRY_OF_CITY_UNIFY_POS = makeKeyword( "REMOVAL-COUNTRY-OF-CITY-UNIFY-POS" );
    $list9 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "countryOfCity" ) ), makeKeyword(
        "REQUIRED-MT" ), makeSymbol( "*COUNTRY-OF-CITY-MT*" ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "countryOfCity" ) ), makeKeyword(
            "NOT-FULLY-BOUND" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CityNamedFn" ) ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword(
                "FULLY-BOUND" ), ConsesLow.list( makeKeyword( "ISA" ), constant_handles.reader_make_constant_shell( makeString( "Country" ) ) ) ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol(
                    "*CHEAP-HL-MODULE-CHECK-COST*" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                        "countryOfCity" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CityNamedFn" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol(
                            "CITY" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "COUNTRY" ) ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "COUNTRY" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ),
      ConsesLow.list( makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "countryOfCity" ) ), makeKeyword( "INPUT" ), ConsesLow
          .list( constant_handles.reader_make_constant_shell( makeString( "CityNamedFn" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CITY" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
              "COUNTRY" ) ) ) ), makeKeyword( "SUPPORT" ), makeSymbol( "MAKE-COUNTRY-OF-CITY-UNIFY-POS-SUPPORTS" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "DOCUMENTATION" ), makeString(
                  "(#$countryOfCity <not-fully-bound> (#$cityNamedFn <city> <country>)) where <city> is a string and <country> is FORT. " ), makeKeyword( "EXAMPLE" ), makeString(
                      "(#$countryOfCity ?X (#$CityNamedFn \"Austin\" #$UnitedStatesOfAmerica)) in #$WorldGeographyMt\n    (#$countryOfCity (#$CountryFn ?X) (#$CityNamedFn \"Austin\" (#$CountryFn #$GeorgeWashington))) in #$PeopleDataMt\n    " )
    } );
  }
}
/*
 * 
 * Total time: 21 ms
 * 
 */