package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_classification
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_classification";
  public static final String myFingerPrint = "05f03f1656e3ea4de9bf9e9d09d875d645a2362755488d6a9b44c44425aa6595";
  private static final SubLSymbol $kw0$REMOVAL_INSTANCE_GENERATOR_DAY_FN_FROM_DAY_OF_YEAR_FN;
  private static final SubLList $list1;
  private static final SubLSymbol $kw2$REMOVAL_CLASSIFY_DAY_FN_TO_DAY_OF_YEAR_FN;
  private static final SubLList $list3;
  private static final SubLSymbol $kw4$REMOVAL_INSTANCE_GENERATOR_DAY_FN_FROM_DAY_OF_MONTH_FN;
  private static final SubLList $list5;
  private static final SubLSymbol $kw6$REMOVAL_CLASSIFY_DAY_FN_TO_DAY_OF_MONTH_FN;
  private static final SubLList $list7;
  private static final SubLSymbol $kw8$REMOVAL_CLASSIFY_HOUR_FN_TO_HOUR_OF_DAY_FN;
  private static final SubLList $list9;

  public static SubLObject declare_removal_modules_classification_file()
  {
    return NIL;
  }

  public static SubLObject init_removal_modules_classification_file()
  {
    return NIL;
  }

  public static SubLObject setup_removal_modules_classification_file()
  {
    inference_modules.inference_removal_module( $kw0$REMOVAL_INSTANCE_GENERATOR_DAY_FN_FROM_DAY_OF_YEAR_FN, $list1 );
    inference_modules.inference_removal_module( $kw2$REMOVAL_CLASSIFY_DAY_FN_TO_DAY_OF_YEAR_FN, $list3 );
    inference_modules.inference_removal_module( $kw4$REMOVAL_INSTANCE_GENERATOR_DAY_FN_FROM_DAY_OF_MONTH_FN, $list5 );
    inference_modules.inference_removal_module( $kw6$REMOVAL_CLASSIFY_DAY_FN_TO_DAY_OF_MONTH_FN, $list7 );
    inference_modules.inference_removal_module( $kw8$REMOVAL_CLASSIFY_HOUR_FN_TO_HOUR_OF_DAY_FN, $list9 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_classification_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_classification_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_classification_file();
  }
  static
  {
    me = new removal_modules_classification();
    $kw0$REMOVAL_INSTANCE_GENERATOR_DAY_FN_FROM_DAY_OF_YEAR_FN = makeKeyword( "REMOVAL-INSTANCE-GENERATOR-DAY-FN-FROM-DAY-OF-YEAR-FN" );
    $list1 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
            makeString( "DayFn" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "FULLY-BOUND" ) ) ) ),
            ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayOfYearFn" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ) ) ), makeKeyword(
                "COST-EXPRESSION" ), makeSymbol( "*CHEAP-HL-MODULE-CHECK-COST*" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles
                    .reader_make_constant_shell( makeString( "isa" ) ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), makeKeyword(
                        "ANYTHING" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol(
                            "YEAR" ) ) ) ) ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayOfYearFn" ) ), ConsesLow.list( makeKeyword( "BIND" ),
                                makeSymbol( "MONTH" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "DAY" ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), ConsesLow
                                    .list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DAY" ) ), ConsesLow.list( constant_handles
                                        .reader_make_constant_shell( makeString( "MonthFn" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "MONTH" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                                            "YEAR" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayOfYearFn" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "MONTH" ) ),
                                                ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DAY" ) ) ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "INPUT" ) ), makeKeyword(
                                                    "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "SUPPORT-MT" ), constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) ),
      makeKeyword( "DOCUMENTATION" ), makeString( "Generate a matching #$DayFn term that would be an instance of a #$DayOfYearFn term." ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$isa (#$DayFn ?DAY (#$MonthFn ?MONTH (#$YearFn 2002))) (#$DayOfYearFn #$May 1))" )
    } );
    $kw2$REMOVAL_CLASSIFY_DAY_FN_TO_DAY_OF_YEAR_FN = makeKeyword( "REMOVAL-CLASSIFY-DAY-FN-TO-DAY-OF-YEAR-FN" );
    $list3 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
            makeString( "DayFn" ) ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ) ) ),
            makeKeyword( "ANYTHING" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*CHEAP-HL-MODULE-CHECK-COST*" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
                constant_handles.reader_make_constant_shell( makeString( "isa" ) ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), ConsesLow
                    .list( makeKeyword( "BIND" ), makeSymbol( "DAY" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol(
                        "MONTH" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "YEAR" ) ) ) ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ),
                            ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DAY" ) ), ConsesLow.list( constant_handles
                                .reader_make_constant_shell( makeString( "MonthFn" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "MONTH" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "YEAR" ) ) ) ),
                            ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayOfYearFn" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "MONTH" ) ), ConsesLow.list( makeKeyword(
                                "VALUE" ), makeSymbol( "DAY" ) ) ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ),
      makeKeyword( "SUPPORT-MT" ), constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) ), makeKeyword( "DOCUMENTATION" ), makeString(
          "Classify a #$DayFn term into a corresponding #$DayOfYearFn term." ), makeKeyword( "EXAMPLE" ), makeString( "(#$isa (#$DayFn 1 (#$MonthFn #$May (#$YearFn 2002))) (#$DayOfYearFn ?MONTH ?DAY))" )
    } );
    $kw4$REMOVAL_INSTANCE_GENERATOR_DAY_FN_FROM_DAY_OF_MONTH_FN = makeKeyword( "REMOVAL-INSTANCE-GENERATOR-DAY-FN-FROM-DAY-OF-MONTH-FN" );
    $list5 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
            makeString( "DayFn" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ) ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                "DayOfMonthFn" ) ), makeKeyword( "FULLY-BOUND" ) ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*CHEAP-HL-MODULE-CHECK-COST*" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword(
                    "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                        makeString( "DayFn" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "MONTH" ) ) ) ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.list( constant_handles
                            .reader_make_constant_shell( makeString( "DayOfMonthFn" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "DAY" ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                makeString( "isa" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DAY" ) ), ConsesLow.list(
                                    makeKeyword( "VALUE" ), makeSymbol( "MONTH" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayOfMonthFn" ) ), ConsesLow.list( makeKeyword( "VALUE" ),
                                        makeSymbol( "DAY" ) ) ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ),
      makeKeyword( "SUPPORT-MT" ), constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) ), makeKeyword( "DOCUMENTATION" ), makeString(
          "Generate a matching #$DayFn term that would be an instance of a #$DayOfMonthFn term." ), makeKeyword( "EXAMPLE" ), makeString( "(#$isa (#$DayFn ?DAY (#$MonthFn #$May (#$YearFn 2002))) (#$DayOfMonthFn 1))" )
    } );
    $kw6$REMOVAL_CLASSIFY_DAY_FN_TO_DAY_OF_MONTH_FN = makeKeyword( "REMOVAL-CLASSIFY-DAY-FN-TO-DAY-OF-MONTH-FN" );
    $list7 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
            makeString( "DayFn" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ) ), makeKeyword( "ANYTHING" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*CHEAP-HL-MODULE-CHECK-COST*" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow
          .list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "DAY" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "MONTH" ) ) ) ),
          makeKeyword( "ANYTHING" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), ConsesLow
              .list( makeKeyword( "VALUE" ), makeSymbol( "DAY" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "MONTH" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                  "DayOfMonthFn" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DAY" ) ) ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "INPUT" ) ), makeKeyword(
                      "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "SUPPORT-MT" ), constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) ), makeKeyword( "DOCUMENTATION" ),
      makeString( "Classify a #$DayFn term into a corresponding #$DayOfMonthFn term." ), makeKeyword( "EXAMPLE" ), makeString( "(#$isa (#$DayFn 1 (#$MonthFn #$May (#$YearFn 2002))) (#$DayOfMonthFn ?DAY))" )
    } );
    $kw8$REMOVAL_CLASSIFY_HOUR_FN_TO_HOUR_OF_DAY_FN = makeKeyword( "REMOVAL-CLASSIFY-HOUR-FN-TO-HOUR-OF-DAY-FN" );
    $list9 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
            makeString( "HourFn" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ) ), makeKeyword( "ANYTHING" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*CHEAP-HL-MODULE-CHECK-COST*" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), ConsesLow.list( makeKeyword( "NAT" ), ConsesLow
          .list( constant_handles.reader_make_constant_shell( makeString( "HourFn" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "HOUR" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "DAY" ) ) ) ),
          makeKeyword( "ANYTHING" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "HourFn" ) ), ConsesLow
              .list( makeKeyword( "VALUE" ), makeSymbol( "HOUR" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DAY" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                  "HourOfDayFn" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "HOUR" ) ) ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "INPUT" ) ), makeKeyword(
                      "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "SUPPORT-MT" ), constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) ), makeKeyword( "DOCUMENTATION" ),
      makeString( "Classify a #$HourFn term into a corresponding #$HourOfDayFn term." ), makeKeyword( "EXAMPLE" ), makeString( "(#$isa (#$HourFn 1 (#$DayFn 12 (#$MonthFn #$May (#$YearFn 2002)))) (#$HourOfDayFn ?HOUR))" )
    } );
  }
}
/*
 * 
 * Total time: 45 ms
 * 
 */