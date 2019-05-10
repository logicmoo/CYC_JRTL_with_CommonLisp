package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.collection_defns;
import com.cyc.cycjava.cycl.extended_numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_min_quant_value
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_min_quant_value";
  public static final String myFingerPrint = "f223cd7326915c4bc9031648da21417954d9fdb3abfe4b53d984219f34cd80a1";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-min-quant-value.lisp", position = 1900L)
  public static SubLSymbol $min_quant_value_defining_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-min-quant-value.lisp", position = 3502L)
  public static SubLSymbol $max_quant_value_defining_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-min-quant-value.lisp", position = 5199L)
  public static SubLSymbol $quantity_unit_defining_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-min-quant-value.lisp", position = 6903L)
  public static SubLSymbol $quantity_measure_defining_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-min-quant-value.lisp", position = 8166L)
  public static SubLSymbol $multiplication_units_defining_mt$;
  private static final SubLObject $const0$minQuantValue;
  private static final SubLSymbol $kw1$POS;
  private static final SubLSymbol $kw2$REMOVAL_LOOKUP_POS;
  private static final SubLSymbol $sym3$_MIN_QUANT_VALUE_DEFINING_MT_;
  private static final SubLObject $const4$UniversalVocabularyMt;
  private static final SubLObject $const5$MinQuantValueFn;
  private static final SubLSymbol $kw6$REMOVAL_MIN_QUANT_VALUE_POS;
  private static final SubLList $list7;
  private static final SubLObject $const8$maxQuantValue;
  private static final SubLSymbol $sym9$_MAX_QUANT_VALUE_DEFINING_MT_;
  private static final SubLObject $const10$MaxQuantValueFn;
  private static final SubLSymbol $kw11$REMOVAL_MAX_QUANT_VALUE_POS;
  private static final SubLList $list12;
  private static final SubLObject $const13$quantityUnit;
  private static final SubLSymbol $kw14$META_REMOVAL_COMPLETELY_ENUMERABLE_POS;
  private static final SubLSymbol $sym15$_QUANTITY_UNIT_DEFINING_MT_;
  private static final SubLObject $const16$QuantityUnitFn;
  private static final SubLSymbol $kw17$REMOVAL_QUANTITY_UNIT_POS;
  private static final SubLList $list18;
  private static final SubLObject $const19$quantityMeasure;
  private static final SubLSymbol $sym20$_QUANTITY_MEASURE_DEFINING_MT_;
  private static final SubLObject $const21$QuantityMeasureFn;
  private static final SubLSymbol $kw22$REMOVAL_QUANTITY_MEASURE_POS;
  private static final SubLList $list23;
  private static final SubLSymbol $sym24$_MULTIPLICATION_UNITS_DEFINING_MT_;
  private static final SubLObject $const25$multiplicationUnits;
  private static final SubLSymbol $kw26$MULTIPLICATION_UNITS;
  private static final SubLList $list27;
  private static final SubLSymbol $kw28$REMOVAL_MULTIPLICATION_UNITS_UNITY_ARG1;
  private static final SubLList $list29;
  private static final SubLSymbol $kw30$REMOVAL_MULTIPLICATION_UNITS_UNITY_ARG2;
  private static final SubLList $list31;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-min-quant-value.lisp", position = 1016L)
  public static SubLObject unreified_quantity_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != extended_numbers.possibly_infinite_or_extended_number_p( v_object ) || NIL != collection_defns.ibqeP( v_object, UNPROVIDED ) || NIL != collection_defns
        .cyc_fractional_measurable_quantity_simple_p( v_object ) || NIL != collection_defns.cyc_fractional_measurable_quantity_mixed_p( v_object ) || NIL != collection_defns.cyc_fractional_measurable_quantity_decimal_p(
            v_object ) || NIL != collection_defns.simple_fractionP( v_object, UNPROVIDED ) || NIL != collection_defns.mixed_fractionP( v_object, UNPROVIDED ) || NIL != collection_defns.decimal_fractionP( v_object,
                UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-min-quant-value.lisp", position = 2048L)
  public static SubLObject removal_min_quant_value(final SubLObject quantity)
  {
    return relation_evaluation.cyc_evaluate( ConsesLow.list( $const5$MinQuantValueFn, quantity ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-min-quant-value.lisp", position = 3650L)
  public static SubLObject removal_max_quant_value(final SubLObject quantity)
  {
    return relation_evaluation.cyc_evaluate( ConsesLow.list( $const10$MaxQuantValueFn, quantity ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-min-quant-value.lisp", position = 5343L)
  public static SubLObject removal_quantity_unit(final SubLObject quantity)
  {
    return relation_evaluation.cyc_evaluate( el_utilities.make_unary_formula( $const16$QuantityUnitFn, quantity ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-min-quant-value.lisp", position = 7056L)
  public static SubLObject removal_quantity_measure(final SubLObject quantity)
  {
    return relation_evaluation.cyc_evaluate( el_utilities.make_unary_formula( $const21$QuantityMeasureFn, quantity ) );
  }

  public static SubLObject declare_removal_modules_min_quant_value_file()
  {
    SubLFiles.declareFunction( me, "unreified_quantity_p", "UNREIFIED-QUANTITY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_min_quant_value", "REMOVAL-MIN-QUANT-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_max_quant_value", "REMOVAL-MAX-QUANT-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_quantity_unit", "REMOVAL-QUANTITY-UNIT", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_quantity_measure", "REMOVAL-QUANTITY-MEASURE", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_min_quant_value_file()
  {
    $min_quant_value_defining_mt$ = SubLFiles.deflexical( "*MIN-QUANT-VALUE-DEFINING-MT*", maybeDefault( $sym3$_MIN_QUANT_VALUE_DEFINING_MT_, $min_quant_value_defining_mt$, $const4$UniversalVocabularyMt ) );
    $max_quant_value_defining_mt$ = SubLFiles.deflexical( "*MAX-QUANT-VALUE-DEFINING-MT*", maybeDefault( $sym9$_MAX_QUANT_VALUE_DEFINING_MT_, $max_quant_value_defining_mt$, $const4$UniversalVocabularyMt ) );
    $quantity_unit_defining_mt$ = SubLFiles.deflexical( "*QUANTITY-UNIT-DEFINING-MT*", maybeDefault( $sym15$_QUANTITY_UNIT_DEFINING_MT_, $quantity_unit_defining_mt$, $const4$UniversalVocabularyMt ) );
    $quantity_measure_defining_mt$ = SubLFiles.deflexical( "*QUANTITY-MEASURE-DEFINING-MT*", maybeDefault( $sym20$_QUANTITY_MEASURE_DEFINING_MT_, $quantity_measure_defining_mt$, $const4$UniversalVocabularyMt ) );
    $multiplication_units_defining_mt$ = SubLFiles.deflexical( "*MULTIPLICATION-UNITS-DEFINING-MT*", maybeDefault( $sym24$_MULTIPLICATION_UNITS_DEFINING_MT_, $multiplication_units_defining_mt$,
        $const4$UniversalVocabularyMt ) );
    return NIL;
  }

  public static SubLObject setup_removal_modules_min_quant_value_file()
  {
    inference_modules.register_solely_specific_removal_module_predicate( $const0$minQuantValue );
    preference_modules.doomed_unless_arg_bindable( $kw1$POS, $const0$minQuantValue, ONE_INTEGER );
    inference_modules.inference_removal_module_use_generic( $const0$minQuantValue, $kw2$REMOVAL_LOOKUP_POS );
    subl_macro_promotions.declare_defglobal( $sym3$_MIN_QUANT_VALUE_DEFINING_MT_ );
    mt_vars.note_mt_var( $sym3$_MIN_QUANT_VALUE_DEFINING_MT_, $const0$minQuantValue );
    inference_modules.inference_removal_module( $kw6$REMOVAL_MIN_QUANT_VALUE_POS, $list7 );
    inference_modules.register_solely_specific_removal_module_predicate( $const8$maxQuantValue );
    preference_modules.doomed_unless_arg_bindable( $kw1$POS, $const8$maxQuantValue, ONE_INTEGER );
    inference_modules.inference_removal_module_use_generic( $const8$maxQuantValue, $kw2$REMOVAL_LOOKUP_POS );
    subl_macro_promotions.declare_defglobal( $sym9$_MAX_QUANT_VALUE_DEFINING_MT_ );
    mt_vars.note_mt_var( $sym9$_MAX_QUANT_VALUE_DEFINING_MT_, $const8$maxQuantValue );
    inference_modules.inference_removal_module( $kw11$REMOVAL_MAX_QUANT_VALUE_POS, $list12 );
    inference_modules.register_solely_specific_removal_module_predicate( $const13$quantityUnit );
    inference_modules.inference_removal_module_use_generic( $const13$quantityUnit, $kw2$REMOVAL_LOOKUP_POS );
    inference_modules.inference_removal_module_use_meta_removal( $const13$quantityUnit, $kw14$META_REMOVAL_COMPLETELY_ENUMERABLE_POS );
    preference_modules.doomed_unless_arg_bindable( $kw1$POS, $const13$quantityUnit, ONE_INTEGER );
    subl_macro_promotions.declare_defglobal( $sym15$_QUANTITY_UNIT_DEFINING_MT_ );
    mt_vars.note_mt_var( $sym15$_QUANTITY_UNIT_DEFINING_MT_, $const13$quantityUnit );
    inference_modules.inference_removal_module( $kw17$REMOVAL_QUANTITY_UNIT_POS, $list18 );
    inference_modules.register_solely_specific_removal_module_predicate( $const19$quantityMeasure );
    inference_modules.inference_removal_module_use_generic( $const19$quantityMeasure, $kw2$REMOVAL_LOOKUP_POS );
    inference_modules.inference_removal_module_use_meta_removal( $const19$quantityMeasure, $kw14$META_REMOVAL_COMPLETELY_ENUMERABLE_POS );
    preference_modules.doomed_unless_arg_bindable( $kw1$POS, $const19$quantityMeasure, ONE_INTEGER );
    subl_macro_promotions.declare_defglobal( $sym20$_QUANTITY_MEASURE_DEFINING_MT_ );
    mt_vars.note_mt_var( $sym20$_QUANTITY_MEASURE_DEFINING_MT_, $const19$quantityMeasure );
    inference_modules.inference_removal_module( $kw22$REMOVAL_QUANTITY_MEASURE_POS, $list23 );
    subl_macro_promotions.declare_defglobal( $sym24$_MULTIPLICATION_UNITS_DEFINING_MT_ );
    mt_vars.note_mt_var( $sym24$_MULTIPLICATION_UNITS_DEFINING_MT_, $const25$multiplicationUnits );
    preference_modules.inference_preference_module( $kw26$MULTIPLICATION_UNITS, $list27 );
    inference_modules.inference_removal_module( $kw28$REMOVAL_MULTIPLICATION_UNITS_UNITY_ARG1, $list29 );
    inference_modules.inference_removal_module( $kw30$REMOVAL_MULTIPLICATION_UNITS_UNITY_ARG2, $list31 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_min_quant_value_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_min_quant_value_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_min_quant_value_file();
  }
  static
  {
    me = new removal_modules_min_quant_value();
    $min_quant_value_defining_mt$ = null;
    $max_quant_value_defining_mt$ = null;
    $quantity_unit_defining_mt$ = null;
    $quantity_measure_defining_mt$ = null;
    $multiplication_units_defining_mt$ = null;
    $const0$minQuantValue = constant_handles.reader_make_constant_shell( makeString( "minQuantValue" ) );
    $kw1$POS = makeKeyword( "POS" );
    $kw2$REMOVAL_LOOKUP_POS = makeKeyword( "REMOVAL-LOOKUP-POS" );
    $sym3$_MIN_QUANT_VALUE_DEFINING_MT_ = makeSymbol( "*MIN-QUANT-VALUE-DEFINING-MT*" );
    $const4$UniversalVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) );
    $const5$MinQuantValueFn = constant_handles.reader_make_constant_shell( makeString( "MinQuantValueFn" ) );
    $kw6$REMOVAL_MIN_QUANT_VALUE_POS = makeKeyword( "REMOVAL-MIN-QUANT-VALUE-POS" );
    $list7 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "minQuantValue" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "minQuantValue" ) ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list( makeKeyword(
            "TEST" ), makeSymbol( "UNREIFIED-QUANTITY-P" ) ) ), makeKeyword( "ANYTHING" ) ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword(
                "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "minQuantValue" ) ), ConsesLow.list( makeKeyword( "BIND" ),
                    makeSymbol( "QUANTITY" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "QUANTITY" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword(
                        "CALL" ), makeSymbol( "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-MIN-QUANT-VALUE" ), makeKeyword( "INPUT" ) ) ), makeKeyword(
                            "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "minQuantValue" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "QUANTITY" ) ),
                                makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*MIN-QUANT-VALUE-DEFINING-MT*" ), makeKeyword(
                                    "DOCUMENTATION" ), makeString(
                                        "(#$minQuantValue <numberp> <whatever>) or\n    (#$minQuantValue (<unit> <min/max>) <whatever>) or\n    (#$minQuantValue (<unit> <min> <max>) <whatever>)" ), makeKeyword(
                                            "EXAMPLE" ), makeString( "(#$minQuantValue 212 ?VAL)\n    (#$minQuantValue (#$Unity 212) 212)\n    (#$minQuantValue (#$Meter 2 3) (#$Meter ?VAL)" )
    } );
    $const8$maxQuantValue = constant_handles.reader_make_constant_shell( makeString( "maxQuantValue" ) );
    $sym9$_MAX_QUANT_VALUE_DEFINING_MT_ = makeSymbol( "*MAX-QUANT-VALUE-DEFINING-MT*" );
    $const10$MaxQuantValueFn = constant_handles.reader_make_constant_shell( makeString( "MaxQuantValueFn" ) );
    $kw11$REMOVAL_MAX_QUANT_VALUE_POS = makeKeyword( "REMOVAL-MAX-QUANT-VALUE-POS" );
    $list12 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "maxQuantValue" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "maxQuantValue" ) ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list( makeKeyword(
            "TEST" ), makeSymbol( "UNREIFIED-QUANTITY-P" ) ) ), makeKeyword( "ANYTHING" ) ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword(
                "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "maxQuantValue" ) ), ConsesLow.list( makeKeyword( "BIND" ),
                    makeSymbol( "QUANTITY" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "QUANTITY" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword(
                        "CALL" ), makeSymbol( "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-MAX-QUANT-VALUE" ), makeKeyword( "INPUT" ) ) ), makeKeyword(
                            "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "maxQuantValue" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "QUANTITY" ) ),
                                makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*MAX-QUANT-VALUE-DEFINING-MT*" ), makeKeyword(
                                    "DOCUMENTATION" ), makeString(
                                        "(#$maxQuantValue <numberp> <whatever>) or\n    (#$maxQuantValue (<unit> <min/max>) <whatever>) or\n    (#$maxQuantValue (<unit> <min> <max>) <whatever>)" ), makeKeyword(
                                            "EXAMPLE" ), makeString( "(#$maxQuantValue 212 ?VAL)\n    (#$maxQuantValue (#$Unity 212) 212)\n    (#$maxQuantValue (#$Meter 2 3) (#$Meter ?VAL)" )
    } );
    $const13$quantityUnit = constant_handles.reader_make_constant_shell( makeString( "quantityUnit" ) );
    $kw14$META_REMOVAL_COMPLETELY_ENUMERABLE_POS = makeKeyword( "META-REMOVAL-COMPLETELY-ENUMERABLE-POS" );
    $sym15$_QUANTITY_UNIT_DEFINING_MT_ = makeSymbol( "*QUANTITY-UNIT-DEFINING-MT*" );
    $const16$QuantityUnitFn = constant_handles.reader_make_constant_shell( makeString( "QuantityUnitFn" ) );
    $kw17$REMOVAL_QUANTITY_UNIT_POS = makeKeyword( "REMOVAL-QUANTITY-UNIT-POS" );
    $list18 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "quantityUnit" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "quantityUnit" ) ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list( makeKeyword(
            "TEST" ), makeSymbol( "UNREIFIED-QUANTITY-P" ) ) ), makeKeyword( "ANYTHING" ) ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword(
                "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "quantityUnit" ) ), ConsesLow.list( makeKeyword( "BIND" ),
                    makeSymbol( "QUANTITY" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "QUANTITY" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword(
                        "CALL" ), makeSymbol( "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-QUANTITY-UNIT" ), makeKeyword( "INPUT" ) ) ), makeKeyword(
                            "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "quantityUnit" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "QUANTITY" ) ),
                                makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*QUANTITY-UNIT-DEFINING-MT*" ), makeKeyword(
                                    "DOCUMENTATION" ), makeString(
                                        "(#$quantityUnit <numberp> <whatever>) or\n    (#$quantityUnit (<unit> <min/max>) <whatever>) or\n    (#$quantityUnit (<unit> <min> <max>) <whatever>)" ), makeKeyword( "EXAMPLE" ),
      makeString( "(#$quantityUnit 212 ?VAL)\n    (#$quantityUnit (#$Unity 212) #$Unity)\n    (#$quantityUnit (#$Meter 2 3) #$Meter)" )
    } );
    $const19$quantityMeasure = constant_handles.reader_make_constant_shell( makeString( "quantityMeasure" ) );
    $sym20$_QUANTITY_MEASURE_DEFINING_MT_ = makeSymbol( "*QUANTITY-MEASURE-DEFINING-MT*" );
    $const21$QuantityMeasureFn = constant_handles.reader_make_constant_shell( makeString( "QuantityMeasureFn" ) );
    $kw22$REMOVAL_QUANTITY_MEASURE_POS = makeKeyword( "REMOVAL-QUANTITY-MEASURE-POS" );
    $list23 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "quantityMeasure" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "quantityMeasure" ) ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list(
            makeKeyword( "TEST" ), makeSymbol( "UNREIFIED-QUANTITY-P" ) ) ), makeKeyword( "ANYTHING" ) ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "quantityMeasure" ) ), ConsesLow.list( makeKeyword(
          "BIND" ), makeSymbol( "QUANTITY" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "QUANTITY" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword(
              "CALL" ), makeSymbol( "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-QUANTITY-MEASURE" ), makeKeyword( "INPUT" ) ) ), makeKeyword(
                  "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "quantityMeasure" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "QUANTITY" ) ),
                      makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*QUANTITY-MEASURE-DEFINING-MT*" ), makeKeyword( "DOCUMENTATION" ),
      makeString( "(#$quantityMeasure <numberp> <whatever>) or\n    (#$quantityMeasure (<unit> <min/max>) <whatever>) or\n    (#$quantityMeasure (<unit> <min> <max>) <whatever>)" ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$quantityMeasure 212 ?VAL)\n    (#$quantityMeasure (#$Unity 212) 212)\n    (#$quantityMeasure (#$Meter 2 3) (#$Unity 2 3)" )
    } );
    $sym24$_MULTIPLICATION_UNITS_DEFINING_MT_ = makeSymbol( "*MULTIPLICATION-UNITS-DEFINING-MT*" );
    $const25$multiplicationUnits = constant_handles.reader_make_constant_shell( makeString( "multiplicationUnits" ) );
    $kw26$MULTIPLICATION_UNITS = makeKeyword( "MULTIPLICATION-UNITS" );
    $list27 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "multiplicationUnits" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "OR" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "multiplicationUnits" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword(
            "NOT-FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "multiplicationUnits" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword(
                "ANYTHING" ), makeKeyword( "NOT-FULLY-BOUND" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "multiplicationUnits" ) ), makeKeyword( "ANYTHING" ), makeKeyword(
                    "NOT-FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ) ) ), makeKeyword( "PREFERENCE-LEVEL" ), makeKeyword( "GROSSLY-DISPREFERRED" ) );
    $kw28$REMOVAL_MULTIPLICATION_UNITS_UNITY_ARG1 = makeKeyword( "REMOVAL-MULTIPLICATION-UNITS-UNITY-ARG1" );
    $list29 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "multiplicationUnits" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "OR" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "multiplicationUnits" ) ), constant_handles.reader_make_constant_shell(
            makeString( "Unity" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "multiplicationUnits" ) ), constant_handles
                .reader_make_constant_shell( makeString( "Unity" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "FULLY-BOUND" ) ) ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ),
      makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( makeKeyword( "OR" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
          makeString( "multiplicationUnits" ) ), constant_handles.reader_make_constant_shell( makeString( "Unity" ) ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list( makeKeyword(
              "BIND" ), makeSymbol( "UNIT" ) ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "multiplicationUnits" ) ), constant_handles
                  .reader_make_constant_shell( makeString( "Unity" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol(
                      "UNIT" ) ) ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "UNIT" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "INPUT" ) ), makeKeyword(
                          "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "multiplicationUnits" ) ), constant_handles.reader_make_constant_shell( makeString(
                              "Unity" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "UNIT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "UNIT" ) ) ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword(
                                  "MONOTONIC" ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*MULTIPLICATION-UNITS-DEFINING-MT*" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                      "(#$multiplicationUnits #$Unity <unit> <whatever>) or\n    (#$multiplicationUnits #$Unity <whatever> <unit>)" ), makeKeyword( "EXAMPLE" ), makeString(
                                          "(#$multiplicationUnits #$Unity #$Meter ?WHAT)\n    (#$multiplicationUnits #$Unity ?WHAT #$Meter)" )
    } );
    $kw30$REMOVAL_MULTIPLICATION_UNITS_UNITY_ARG2 = makeKeyword( "REMOVAL-MULTIPLICATION-UNITS-UNITY-ARG2" );
    $list31 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "multiplicationUnits" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "OR" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "multiplicationUnits" ) ), makeKeyword( "FULLY-BOUND" ), constant_handles
            .reader_make_constant_shell( makeString( "Unity" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "multiplicationUnits" ) ), makeKeyword(
                "ANYTHING" ), constant_handles.reader_make_constant_shell( makeString( "Unity" ) ), makeKeyword( "FULLY-BOUND" ) ) ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ),
      makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( makeKeyword( "OR" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
          makeString( "multiplicationUnits" ) ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "UNIT" ) ) ), constant_handles
              .reader_make_constant_shell( makeString( "Unity" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "multiplicationUnits" ) ), makeKeyword(
                  "ANYTHING" ), constant_handles.reader_make_constant_shell( makeString( "Unity" ) ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol(
                      "UNIT" ) ) ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "UNIT" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "INPUT" ) ), makeKeyword(
                          "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "multiplicationUnits" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "UNIT" ) ),
                              constant_handles.reader_make_constant_shell( makeString( "Unity" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "UNIT" ) ) ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword(
                                  "MONOTONIC" ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*MULTIPLICATION-UNITS-DEFINING-MT*" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                      "(#$multiplicationUnits <unit> #$Unity <whatever>) or\n    (#$multiplicationUnits <whatever> #$Unity <unit>)" ), makeKeyword( "EXAMPLE" ), makeString(
                                          "(#$multiplicationUnits #$Volt #$Unity ?WHAT)\n    (#$multiplicationUnits ?WHAT #$Unity #$Volt)" )
    } );
  }
}
/*
 * 
 * Total time: 68 ms
 * 
 */