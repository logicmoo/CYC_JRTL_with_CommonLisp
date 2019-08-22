package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;

import com.cyc.cycjava.cycl.collection_defns;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_fractions
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_fractions";
  public static final String myFingerPrint = "94310db00d16239ec1bf48b04a9bfdc3d7cda5323835b156c73c135b3735eee0";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-fractions.lisp", position = 1479L)
  public static SubLSymbol $numerator_defining_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-fractions.lisp", position = 6978L)
  public static SubLSymbol $denominator_defining_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-fractions.lisp", position = 12514L)
  public static SubLSymbol $whole_in_mixed_fraction_defining_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-fractions.lisp", position = 15449L)
  public static SubLSymbol $fractional_part_in_mixed_fraction_defining_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-fractions.lisp", position = 18627L)
  public static SubLSymbol $significand_defining_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-fractions.lisp", position = 21955L)
  public static SubLSymbol $decimal_position_defining_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-fractions.lisp", position = 25390L)
  public static SubLSymbol $repeating_end_sequence_defining_mt$;
  private static final SubLObject $const0$numerator;
  private static final SubLSymbol $kw1$REMOVAL_LOOKUP_POS;
  private static final SubLSymbol $kw2$META_REMOVAL_COMPLETELY_ENUMERABLE_POS;
  private static final SubLSymbol $kw3$POS;
  private static final SubLSymbol $sym4$_NUMERATOR_DEFINING_MT_;
  private static final SubLObject $const5$UniversalVocabularyMt;
  private static final SubLSymbol $kw6$REMOVAL_NUMERATOR_SIMPLE_FRACTION_POS;
  private static final SubLList $list7;
  private static final SubLSymbol $kw8$REMOVAL_NUMERATOR_SIMPLE_FRACTION_WITH_MEASURE_POS;
  private static final SubLList $list9;
  private static final SubLSymbol $kw10$REMOVAL_NUMERATOR_MIXED_FRACTION_POS;
  private static final SubLList $list11;
  private static final SubLSymbol $kw12$REMOVAL_NUMERATOR_MIXED_FRACTION_WITH_MEASURE_POS;
  private static final SubLList $list13;
  private static final SubLObject $const14$UnitOfMeasure;
  private static final SubLObject $const15$MixedFractionFn;
  private static final SubLObject $const16$NegativeMixedFractionFn;
  private static final SubLObject $const17$SimpleFractionFn;
  private static final SubLObject $const18$denominator;
  private static final SubLSymbol $sym19$_DENOMINATOR_DEFINING_MT_;
  private static final SubLSymbol $kw20$REMOVAL_DENOMINATOR_SIMPLE_FRACTION_POS;
  private static final SubLList $list21;
  private static final SubLSymbol $kw22$REMOVAL_DENOMINATOR_SIMPLE_FRACTION_WITH_MEASURE_POS;
  private static final SubLList $list23;
  private static final SubLSymbol $kw24$REMOVAL_DENOMINATOR_MIXED_FRACTION_POS;
  private static final SubLList $list25;
  private static final SubLSymbol $kw26$REMOVAL_DENOMINATOR_MIXED_FRACTION_WITH_MEASURE_POS;
  private static final SubLList $list27;
  private static final SubLObject $const28$wholeInMixedFraction;
  private static final SubLSymbol $sym29$_WHOLE_IN_MIXED_FRACTION_DEFINING_MT_;
  private static final SubLSymbol $kw30$REMOVAL_WHOLE_IN_MIXED_FRACTION_POS;
  private static final SubLList $list31;
  private static final SubLSymbol $kw32$REMOVAL_WHOLE_IN_MIXED_FRACTION_WITH_MEASURE_POS;
  private static final SubLList $list33;
  private static final SubLObject $const34$fractionalPartInMixedFraction;
  private static final SubLSymbol $sym35$_FRACTIONAL_PART_IN_MIXED_FRACTION_DEFINING_MT_;
  private static final SubLSymbol $kw36$REMOVAL_FRACTIONAL_PART_IN_MIXED_FRACTION_POS;
  private static final SubLList $list37;
  private static final SubLSymbol $kw38$REMOVAL_FRACTIONAL_PART_IN_MIXED_FRACTION_WITH_MEASURE_POS;
  private static final SubLList $list39;
  private static final SubLObject $const40$significand;
  private static final SubLSymbol $sym41$_SIGNIFICAND_DEFINING_MT_;
  private static final SubLSymbol $kw42$REMOVAL_SIGNIFICAND_POS;
  private static final SubLList $list43;
  private static final SubLSymbol $kw44$REMOVAL_SIGNIFICAND_WITH_MEASURE_POS;
  private static final SubLList $list45;
  private static final SubLObject $const46$decimalPosition;
  private static final SubLSymbol $sym47$_DECIMAL_POSITION_DEFINING_MT_;
  private static final SubLSymbol $kw48$REMOVAL_DECIMAL_POSITION_POS;
  private static final SubLList $list49;
  private static final SubLSymbol $kw50$REMOVAL_DECIMAL_POSITION_WITH_MEASURE_POS;
  private static final SubLList $list51;
  private static final SubLObject $const52$repeatingEndSequence;
  private static final SubLSymbol $sym53$_REPEATING_END_SEQUENCE_DEFINING_MT_;
  private static final SubLSymbol $kw54$REMOVAL_REPEATING_END_SEQUENCE_POS;
  private static final SubLList $list55;
  private static final SubLSymbol $kw56$REMOVAL_REPEATING_END_SEQUENCE_WITH_MEASURE_POS;
  private static final SubLList $list57;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-fractions.lisp", position = 5677L)
  public static SubLObject removal_fraction_with_measure_pos_check(final SubLObject cycl_input)
  {
    return isa.isaP( conses_high.second( cycl_input ), $const14$UnitOfMeasure, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-fractions.lisp", position = 5802L)
  public static SubLObject el_fraction_numerator(SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    if( NIL != el_utilities.possibly_naut_p( v_term ) )
    {
      if( NIL != collection_defns.unit_of_measureP( cycl_utilities.naut_functor( v_term ), mt ) && ( NIL == cycl_utilities.naut_arg2( v_term, UNPROVIDED ) || NIL != czer_utilities.equals_elP( cycl_utilities.naut_arg1(
          v_term, UNPROVIDED ), cycl_utilities.naut_arg2( v_term, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) )
      {
        v_term = cycl_utilities.naut_arg1( v_term, UNPROVIDED );
      }
      if( NIL != cycl_utilities.naut_with_functor_p( v_term, $const15$MixedFractionFn ) )
      {
        return cycl_utilities.naut_arg2( v_term, UNPROVIDED );
      }
      if( NIL != cycl_utilities.naut_with_functor_p( v_term, $const16$NegativeMixedFractionFn ) )
      {
        return cycl_utilities.naut_arg2( v_term, UNPROVIDED );
      }
      if( NIL != cycl_utilities.naut_with_functor_p( v_term, $const17$SimpleFractionFn ) )
      {
        return cycl_utilities.naut_arg1( v_term, UNPROVIDED );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-fractions.lisp", position = 11285L)
  public static SubLObject el_fraction_denominator(SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    if( NIL != el_utilities.possibly_naut_p( v_term ) )
    {
      if( NIL != collection_defns.unit_of_measureP( cycl_utilities.naut_functor( v_term ), mt ) && ( NIL == cycl_utilities.naut_arg2( v_term, UNPROVIDED ) || NIL != czer_utilities.equals_elP( cycl_utilities.naut_arg1(
          v_term, UNPROVIDED ), cycl_utilities.naut_arg2( v_term, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) )
      {
        v_term = cycl_utilities.naut_arg1( v_term, UNPROVIDED );
      }
      if( NIL != cycl_utilities.naut_with_functor_p( v_term, $const15$MixedFractionFn ) )
      {
        return cycl_utilities.naut_arg3( v_term, UNPROVIDED );
      }
      if( NIL != cycl_utilities.naut_with_functor_p( v_term, $const16$NegativeMixedFractionFn ) )
      {
        return cycl_utilities.naut_arg3( v_term, UNPROVIDED );
      }
      if( NIL != cycl_utilities.naut_with_functor_p( v_term, $const17$SimpleFractionFn ) )
      {
        return cycl_utilities.naut_arg2( v_term, UNPROVIDED );
      }
    }
    return NIL;
  }

  public static SubLObject declare_removal_modules_fractions_file()
  {
    SubLFiles.declareFunction( me, "removal_fraction_with_measure_pos_check", "REMOVAL-FRACTION-WITH-MEASURE-POS-CHECK", 1, 0, false );
    SubLFiles.declareFunction( me, "el_fraction_numerator", "EL-FRACTION-NUMERATOR", 1, 1, false );
    SubLFiles.declareFunction( me, "el_fraction_denominator", "EL-FRACTION-DENOMINATOR", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_fractions_file()
  {
    $numerator_defining_mt$ = SubLFiles.deflexical( "*NUMERATOR-DEFINING-MT*", maybeDefault( $sym4$_NUMERATOR_DEFINING_MT_, $numerator_defining_mt$, $const5$UniversalVocabularyMt ) );
    $denominator_defining_mt$ = SubLFiles.deflexical( "*DENOMINATOR-DEFINING-MT*", maybeDefault( $sym19$_DENOMINATOR_DEFINING_MT_, $denominator_defining_mt$, $const5$UniversalVocabularyMt ) );
    $whole_in_mixed_fraction_defining_mt$ = SubLFiles.deflexical( "*WHOLE-IN-MIXED-FRACTION-DEFINING-MT*", maybeDefault( $sym29$_WHOLE_IN_MIXED_FRACTION_DEFINING_MT_, $whole_in_mixed_fraction_defining_mt$,
        $const5$UniversalVocabularyMt ) );
    $fractional_part_in_mixed_fraction_defining_mt$ = SubLFiles.deflexical( "*FRACTIONAL-PART-IN-MIXED-FRACTION-DEFINING-MT*", maybeDefault( $sym35$_FRACTIONAL_PART_IN_MIXED_FRACTION_DEFINING_MT_,
        $fractional_part_in_mixed_fraction_defining_mt$, $const5$UniversalVocabularyMt ) );
    $significand_defining_mt$ = SubLFiles.deflexical( "*SIGNIFICAND-DEFINING-MT*", maybeDefault( $sym41$_SIGNIFICAND_DEFINING_MT_, $significand_defining_mt$, $const5$UniversalVocabularyMt ) );
    $decimal_position_defining_mt$ = SubLFiles.deflexical( "*DECIMAL-POSITION-DEFINING-MT*", maybeDefault( $sym47$_DECIMAL_POSITION_DEFINING_MT_, $decimal_position_defining_mt$, $const5$UniversalVocabularyMt ) );
    $repeating_end_sequence_defining_mt$ = SubLFiles.deflexical( "*REPEATING-END-SEQUENCE-DEFINING-MT*", maybeDefault( $sym53$_REPEATING_END_SEQUENCE_DEFINING_MT_, $repeating_end_sequence_defining_mt$,
        $const5$UniversalVocabularyMt ) );
    return NIL;
  }

  public static SubLObject setup_removal_modules_fractions_file()
  {
    inference_modules.register_solely_specific_removal_module_predicate( $const0$numerator );
    inference_modules.inference_removal_module_use_generic( $const0$numerator, $kw1$REMOVAL_LOOKUP_POS );
    inference_modules.inference_removal_module_use_meta_removal( $const0$numerator, $kw2$META_REMOVAL_COMPLETELY_ENUMERABLE_POS );
    preference_modules.doomed_unless_arg_bindable( $kw3$POS, $const0$numerator, ONE_INTEGER );
    subl_macro_promotions.declare_defglobal( $sym4$_NUMERATOR_DEFINING_MT_ );
    mt_vars.note_mt_var( $sym4$_NUMERATOR_DEFINING_MT_, $const0$numerator );
    inference_modules.inference_removal_module( $kw6$REMOVAL_NUMERATOR_SIMPLE_FRACTION_POS, $list7 );
    inference_modules.inference_removal_module( $kw8$REMOVAL_NUMERATOR_SIMPLE_FRACTION_WITH_MEASURE_POS, $list9 );
    inference_modules.inference_removal_module( $kw10$REMOVAL_NUMERATOR_MIXED_FRACTION_POS, $list11 );
    inference_modules.inference_removal_module( $kw12$REMOVAL_NUMERATOR_MIXED_FRACTION_WITH_MEASURE_POS, $list13 );
    inference_modules.register_solely_specific_removal_module_predicate( $const18$denominator );
    inference_modules.inference_removal_module_use_generic( $const18$denominator, $kw1$REMOVAL_LOOKUP_POS );
    inference_modules.inference_removal_module_use_meta_removal( $const18$denominator, $kw2$META_REMOVAL_COMPLETELY_ENUMERABLE_POS );
    preference_modules.doomed_unless_arg_bindable( $kw3$POS, $const18$denominator, ONE_INTEGER );
    subl_macro_promotions.declare_defglobal( $sym19$_DENOMINATOR_DEFINING_MT_ );
    mt_vars.note_mt_var( $sym19$_DENOMINATOR_DEFINING_MT_, $const18$denominator );
    inference_modules.inference_removal_module( $kw20$REMOVAL_DENOMINATOR_SIMPLE_FRACTION_POS, $list21 );
    inference_modules.inference_removal_module( $kw22$REMOVAL_DENOMINATOR_SIMPLE_FRACTION_WITH_MEASURE_POS, $list23 );
    inference_modules.inference_removal_module( $kw24$REMOVAL_DENOMINATOR_MIXED_FRACTION_POS, $list25 );
    inference_modules.inference_removal_module( $kw26$REMOVAL_DENOMINATOR_MIXED_FRACTION_WITH_MEASURE_POS, $list27 );
    inference_modules.register_solely_specific_removal_module_predicate( $const28$wholeInMixedFraction );
    inference_modules.inference_removal_module_use_generic( $const28$wholeInMixedFraction, $kw1$REMOVAL_LOOKUP_POS );
    inference_modules.inference_removal_module_use_meta_removal( $const28$wholeInMixedFraction, $kw2$META_REMOVAL_COMPLETELY_ENUMERABLE_POS );
    preference_modules.doomed_unless_arg_bindable( $kw3$POS, $const28$wholeInMixedFraction, ONE_INTEGER );
    subl_macro_promotions.declare_defglobal( $sym29$_WHOLE_IN_MIXED_FRACTION_DEFINING_MT_ );
    mt_vars.note_mt_var( $sym29$_WHOLE_IN_MIXED_FRACTION_DEFINING_MT_, $const28$wholeInMixedFraction );
    inference_modules.inference_removal_module( $kw30$REMOVAL_WHOLE_IN_MIXED_FRACTION_POS, $list31 );
    inference_modules.inference_removal_module( $kw32$REMOVAL_WHOLE_IN_MIXED_FRACTION_WITH_MEASURE_POS, $list33 );
    inference_modules.register_solely_specific_removal_module_predicate( $const34$fractionalPartInMixedFraction );
    inference_modules.inference_removal_module_use_generic( $const34$fractionalPartInMixedFraction, $kw1$REMOVAL_LOOKUP_POS );
    inference_modules.inference_removal_module_use_meta_removal( $const34$fractionalPartInMixedFraction, $kw2$META_REMOVAL_COMPLETELY_ENUMERABLE_POS );
    preference_modules.doomed_unless_arg_bindable( $kw3$POS, $const34$fractionalPartInMixedFraction, ONE_INTEGER );
    subl_macro_promotions.declare_defglobal( $sym35$_FRACTIONAL_PART_IN_MIXED_FRACTION_DEFINING_MT_ );
    mt_vars.note_mt_var( $sym35$_FRACTIONAL_PART_IN_MIXED_FRACTION_DEFINING_MT_, $const34$fractionalPartInMixedFraction );
    inference_modules.inference_removal_module( $kw36$REMOVAL_FRACTIONAL_PART_IN_MIXED_FRACTION_POS, $list37 );
    inference_modules.inference_removal_module( $kw38$REMOVAL_FRACTIONAL_PART_IN_MIXED_FRACTION_WITH_MEASURE_POS, $list39 );
    inference_modules.register_solely_specific_removal_module_predicate( $const40$significand );
    inference_modules.inference_removal_module_use_generic( $const40$significand, $kw1$REMOVAL_LOOKUP_POS );
    inference_modules.inference_removal_module_use_meta_removal( $const40$significand, $kw2$META_REMOVAL_COMPLETELY_ENUMERABLE_POS );
    preference_modules.doomed_unless_arg_bindable( $kw3$POS, $const40$significand, ONE_INTEGER );
    subl_macro_promotions.declare_defglobal( $sym41$_SIGNIFICAND_DEFINING_MT_ );
    mt_vars.note_mt_var( $sym41$_SIGNIFICAND_DEFINING_MT_, $const40$significand );
    inference_modules.inference_removal_module( $kw42$REMOVAL_SIGNIFICAND_POS, $list43 );
    inference_modules.inference_removal_module( $kw44$REMOVAL_SIGNIFICAND_WITH_MEASURE_POS, $list45 );
    inference_modules.register_solely_specific_removal_module_predicate( $const46$decimalPosition );
    inference_modules.inference_removal_module_use_generic( $const46$decimalPosition, $kw1$REMOVAL_LOOKUP_POS );
    inference_modules.inference_removal_module_use_meta_removal( $const46$decimalPosition, $kw2$META_REMOVAL_COMPLETELY_ENUMERABLE_POS );
    preference_modules.doomed_unless_arg_bindable( $kw3$POS, $const46$decimalPosition, ONE_INTEGER );
    subl_macro_promotions.declare_defglobal( $sym47$_DECIMAL_POSITION_DEFINING_MT_ );
    mt_vars.note_mt_var( $sym47$_DECIMAL_POSITION_DEFINING_MT_, $const46$decimalPosition );
    inference_modules.inference_removal_module( $kw48$REMOVAL_DECIMAL_POSITION_POS, $list49 );
    inference_modules.inference_removal_module( $kw50$REMOVAL_DECIMAL_POSITION_WITH_MEASURE_POS, $list51 );
    inference_modules.register_solely_specific_removal_module_predicate( $const52$repeatingEndSequence );
    inference_modules.inference_removal_module_use_generic( $const52$repeatingEndSequence, $kw1$REMOVAL_LOOKUP_POS );
    inference_modules.inference_removal_module_use_meta_removal( $const52$repeatingEndSequence, $kw2$META_REMOVAL_COMPLETELY_ENUMERABLE_POS );
    preference_modules.doomed_unless_arg_bindable( $kw3$POS, $const52$repeatingEndSequence, ONE_INTEGER );
    subl_macro_promotions.declare_defglobal( $sym53$_REPEATING_END_SEQUENCE_DEFINING_MT_ );
    mt_vars.note_mt_var( $sym53$_REPEATING_END_SEQUENCE_DEFINING_MT_, $const52$repeatingEndSequence );
    inference_modules.inference_removal_module( $kw54$REMOVAL_REPEATING_END_SEQUENCE_POS, $list55 );
    inference_modules.inference_removal_module( $kw56$REMOVAL_REPEATING_END_SEQUENCE_WITH_MEASURE_POS, $list57 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_fractions_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_fractions_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_fractions_file();
  }
  static
  {
    me = new removal_modules_fractions();
    $numerator_defining_mt$ = null;
    $denominator_defining_mt$ = null;
    $whole_in_mixed_fraction_defining_mt$ = null;
    $fractional_part_in_mixed_fraction_defining_mt$ = null;
    $significand_defining_mt$ = null;
    $decimal_position_defining_mt$ = null;
    $repeating_end_sequence_defining_mt$ = null;
    $const0$numerator = constant_handles.reader_make_constant_shell( makeString( "numerator" ) );
    $kw1$REMOVAL_LOOKUP_POS = makeKeyword( "REMOVAL-LOOKUP-POS" );
    $kw2$META_REMOVAL_COMPLETELY_ENUMERABLE_POS = makeKeyword( "META-REMOVAL-COMPLETELY-ENUMERABLE-POS" );
    $kw3$POS = makeKeyword( "POS" );
    $sym4$_NUMERATOR_DEFINING_MT_ = makeSymbol( "*NUMERATOR-DEFINING-MT*" );
    $const5$UniversalVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) );
    $kw6$REMOVAL_NUMERATOR_SIMPLE_FRACTION_POS = makeKeyword( "REMOVAL-NUMERATOR-SIMPLE-FRACTION-POS" );
    $list7 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "numerator" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "numerator" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SimpleFractionFn" ) ),
            makeKeyword( "INTEGER" ), makeKeyword( "INTEGER" ) ), makeKeyword( "ANYTHING" ) ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword(
                "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "numerator" ) ), ConsesLow.list( makeKeyword( "AND" ),
                    ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "FRACTION" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SimpleFractionFn" ) ), ConsesLow.list( makeKeyword(
                        "BIND" ), makeSymbol( "NUMERATOR" ) ), makeKeyword( "ANYTHING" ) ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FRACTION" ) ), ConsesLow
                            .list( makeKeyword( "VALUE" ), makeSymbol( "NUMERATOR" ) ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ),
      ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "FRACTION" ), makeSymbol( "NUMERATOR" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "numerator" ) ), ConsesLow
          .list( makeKeyword( "VALUE" ), makeSymbol( "FRACTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "NUMERATOR" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "CODE" ), makeKeyword(
              "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*NUMERATOR-DEFINING-MT*" ), makeKeyword( "DOCUMENTATION" ), makeString(
                  "(#$numerator (#$SimpleFractionFn <integer> <integer>) <whatever>)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$numerator (#$SimpleFractionFn 5 9) 5)\n    (#$numerator (#$SimpleFractionFn 5 9) ?NUM)" )
    } );
    $kw8$REMOVAL_NUMERATOR_SIMPLE_FRACTION_WITH_MEASURE_POS = makeKeyword( "REMOVAL-NUMERATOR-SIMPLE-FRACTION-WITH-MEASURE-POS" );
    $list9 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "numerator" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "numerator" ) ), ConsesLow.list( makeKeyword( "ANYTHING" ), ConsesLow.list( constant_handles
            .reader_make_constant_shell( makeString( "SimpleFractionFn" ) ), makeKeyword( "INTEGER" ), makeKeyword( "INTEGER" ) ) ), makeKeyword( "ANYTHING" ) ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER,
      makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
          "numerator" ) ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "FRACTION" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "CYCL-FUNCTION" ) ),
              ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SimpleFractionFn" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "NUMERATOR" ) ), makeKeyword( "ANYTHING" ) ) ) ),
          makeKeyword( "ANYTHING" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FRACTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-FUNCTION" ) ), ConsesLow.list(
              makeKeyword( "VALUE" ), makeSymbol( "NUMERATOR" ) ) ) ), makeKeyword( "INPUT-VERIFY-PATTERN" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "REMOVAL-FRACTION-WITH-MEASURE-POS-CHECK" ) ), makeKeyword(
                  "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "FRACTION" ),
                      makeSymbol( "CYCL-FUNCTION" ), makeSymbol( "NUMERATOR" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "numerator" ) ), ConsesLow.list( makeKeyword( "VALUE" ),
                          makeSymbol( "FRACTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "NUMERATOR" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "CODE" ), makeKeyword( "SUPPORT-STRENGTH" ),
      makeKeyword( "MONOTONIC" ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*NUMERATOR-DEFINING-MT*" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$numerator (<unit of measure> (#$SimpleFractionFn <integer> <integer>)) <whatever>)" ), makeKeyword( "EXAMPLE" ), makeString(
              "(#$numerator (#$Inch (#$SimpleFractionFn 5 9)) 5)\n    (#$numerator (#$Inch (#$SimpleFractionFn 5 9)) ?NUM)" )
    } );
    $kw10$REMOVAL_NUMERATOR_MIXED_FRACTION_POS = makeKeyword( "REMOVAL-NUMERATOR-MIXED-FRACTION-POS" );
    $list11 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "numerator" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "numerator" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MixedFractionFn" ) ),
            makeKeyword( "INTEGER" ), makeKeyword( "INTEGER" ), makeKeyword( "INTEGER" ) ), makeKeyword( "ANYTHING" ) ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword(
                "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "numerator" ) ), ConsesLow.list(
                    makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "FRACTION" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MixedFractionFn" ) ), makeKeyword(
                        "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "NUMERATOR" ) ), makeKeyword( "ANYTHING" ) ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( ConsesLow.list( makeKeyword(
                            "VALUE" ), makeSymbol( "FRACTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "NUMERATOR" ) ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword(
                                "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "FRACTION" ), makeSymbol( "NUMERATOR" ) ), ConsesLow.list(
                                    constant_handles.reader_make_constant_shell( makeString( "numerator" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FRACTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ),
                                        makeSymbol( "NUMERATOR" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "CODE" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "SUPPORT-MT" ),
      makeSymbol( "*NUMERATOR-DEFINING-MT*" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$numerator (#$MixedFractionFn <integer> <integer> <integer>) <whatever>)" ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$numerator (#$MixedFractionFn 3 5 9) 5)\n    (#$numerator (#$MixedFractionFn 3 5 9) ?NUM)" )
    } );
    $kw12$REMOVAL_NUMERATOR_MIXED_FRACTION_WITH_MEASURE_POS = makeKeyword( "REMOVAL-NUMERATOR-MIXED-FRACTION-WITH-MEASURE-POS" );
    $list13 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "numerator" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "numerator" ) ), ConsesLow.list( makeKeyword( "ANYTHING" ), ConsesLow.list( constant_handles
            .reader_make_constant_shell( makeString( "MixedFractionFn" ) ), makeKeyword( "INTEGER" ), makeKeyword( "INTEGER" ), makeKeyword( "INTEGER" ) ) ), makeKeyword( "ANYTHING" ) ), makeKeyword( "COST-EXPRESSION" ),
      ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
          makeString( "numerator" ) ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "FRACTION" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "BIND" ), makeSymbol(
              "CYCL-FUNCTION" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MixedFractionFn" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol(
                  "NUMERATOR" ) ), makeKeyword( "ANYTHING" ) ) ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FRACTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ),
                      makeSymbol( "CYCL-FUNCTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "NUMERATOR" ) ) ) ), makeKeyword( "INPUT-VERIFY-PATTERN" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
                          "REMOVAL-FRACTION-WITH-MEASURE-POS-CHECK" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list(
                              makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "FRACTION" ), makeSymbol( "CYCL-FUNCTION" ), makeSymbol( "NUMERATOR" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                  makeString( "numerator" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FRACTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "NUMERATOR" ) ) ) ), makeKeyword(
                                      "SUPPORT-MODULE" ), makeKeyword( "CODE" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*NUMERATOR-DEFINING-MT*" ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(#$numerator (<unit of measure> (#$MixedFractionFn <integer> <integer> <integer>)) <whatever>)" ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$numerator (#$Inch (#$MixedFractionFn 3 5 9)) 5)\n    (#$numerator (#$Inch (#$MixedFractionFn 3 5 9)) ?NUM)" )
    } );
    $const14$UnitOfMeasure = constant_handles.reader_make_constant_shell( makeString( "UnitOfMeasure" ) );
    $const15$MixedFractionFn = constant_handles.reader_make_constant_shell( makeString( "MixedFractionFn" ) );
    $const16$NegativeMixedFractionFn = constant_handles.reader_make_constant_shell( makeString( "NegativeMixedFractionFn" ) );
    $const17$SimpleFractionFn = constant_handles.reader_make_constant_shell( makeString( "SimpleFractionFn" ) );
    $const18$denominator = constant_handles.reader_make_constant_shell( makeString( "denominator" ) );
    $sym19$_DENOMINATOR_DEFINING_MT_ = makeSymbol( "*DENOMINATOR-DEFINING-MT*" );
    $kw20$REMOVAL_DENOMINATOR_SIMPLE_FRACTION_POS = makeKeyword( "REMOVAL-DENOMINATOR-SIMPLE-FRACTION-POS" );
    $list21 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "denominator" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "denominator" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SimpleFractionFn" ) ),
            makeKeyword( "INTEGER" ), makeKeyword( "INTEGER" ) ), makeKeyword( "ANYTHING" ) ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword(
                "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "denominator" ) ), ConsesLow.list( makeKeyword( "AND" ),
                    ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "FRACTION" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SimpleFractionFn" ) ), makeKeyword( "ANYTHING" ), ConsesLow
                        .list( makeKeyword( "BIND" ), makeSymbol( "DENOMINATOR" ) ) ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FRACTION" ) ), ConsesLow.list(
                            makeKeyword( "VALUE" ), makeSymbol( "DENOMINATOR" ) ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ),
      ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "FRACTION" ), makeSymbol( "DENOMINATOR" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "denominator" ) ), ConsesLow
          .list( makeKeyword( "VALUE" ), makeSymbol( "FRACTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DENOMINATOR" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "CODE" ), makeKeyword(
              "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*DENOMINATOR-DEFINING-MT*" ), makeKeyword( "DOCUMENTATION" ), makeString(
                  "(#$denominator (#$SimpleFractionFn <integer> <integer>) <whatever>)" ), makeKeyword( "EXAMPLE" ), makeString(
                      "(#$denominator (#$SimpleFractionFn 5 9) 9)\n    (#$denominator (#$SimpleFractionFn 5 9) ?NUM)" )
    } );
    $kw22$REMOVAL_DENOMINATOR_SIMPLE_FRACTION_WITH_MEASURE_POS = makeKeyword( "REMOVAL-DENOMINATOR-SIMPLE-FRACTION-WITH-MEASURE-POS" );
    $list23 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "denominator" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "denominator" ) ), ConsesLow.list( makeKeyword( "ANYTHING" ), ConsesLow.list( constant_handles
            .reader_make_constant_shell( makeString( "SimpleFractionFn" ) ), makeKeyword( "INTEGER" ), makeKeyword( "INTEGER" ) ) ), makeKeyword( "ANYTHING" ) ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER,
      makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
          "denominator" ) ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "FRACTION" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "BIND" ), makeSymbol(
              "CYCL-FUNCTION" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SimpleFractionFn" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol(
                  "DENOMINATOR" ) ) ) ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FRACTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                      "CYCL-FUNCTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DENOMINATOR" ) ) ) ), makeKeyword( "INPUT-VERIFY-PATTERN" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
                          "REMOVAL-FRACTION-WITH-MEASURE-POS-CHECK" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list(
                              makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "FRACTION" ), makeSymbol( "CYCL-FUNCTION" ), makeSymbol( "DENOMINATOR" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                  makeString( "denominator" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FRACTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DENOMINATOR" ) ) ) ), makeKeyword(
                                      "SUPPORT-MODULE" ), makeKeyword( "CODE" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*DENOMINATOR-DEFINING-MT*" ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(#$denominator (<unit of measure> (#$SimpleFractionFn <integer> <integer>)) <whatever>)" ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$denominator (#$Inch (#$SimpleFractionFn 5 9)) 9)\n    (#$denominator (#$Inch (#$SimpleFractionFn 5 9)) ?NUM)" )
    } );
    $kw24$REMOVAL_DENOMINATOR_MIXED_FRACTION_POS = makeKeyword( "REMOVAL-DENOMINATOR-MIXED-FRACTION-POS" );
    $list25 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "denominator" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "denominator" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MixedFractionFn" ) ),
            makeKeyword( "INTEGER" ), makeKeyword( "INTEGER" ), makeKeyword( "INTEGER" ) ), makeKeyword( "ANYTHING" ) ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword(
                "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "denominator" ) ), ConsesLow.list(
                    makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "FRACTION" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MixedFractionFn" ) ), makeKeyword(
                        "ANYTHING" ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "DENOMINATOR" ) ) ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( ConsesLow.list( makeKeyword(
                            "VALUE" ), makeSymbol( "FRACTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DENOMINATOR" ) ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword(
                                "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "FRACTION" ), makeSymbol( "DENOMINATOR" ) ), ConsesLow.list(
                                    constant_handles.reader_make_constant_shell( makeString( "denominator" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FRACTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ),
                                        makeSymbol( "DENOMINATOR" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "CODE" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword(
                                            "SUPPORT-MT" ), makeSymbol( "*DENOMINATOR-DEFINING-MT*" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                                "(#$denominator (#$MixedFractionFn <integer> <integer> <integer>) <whatever>)" ), makeKeyword( "EXAMPLE" ), makeString(
                                                    "(#$denominator (#$MixedFractionFn 3 5 9) 9)\n    (#$denominator (#$MixedFractionFn 3 5 9) ?NUM)" )
    } );
    $kw26$REMOVAL_DENOMINATOR_MIXED_FRACTION_WITH_MEASURE_POS = makeKeyword( "REMOVAL-DENOMINATOR-MIXED-FRACTION-WITH-MEASURE-POS" );
    $list27 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "denominator" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "denominator" ) ), ConsesLow.list( makeKeyword( "ANYTHING" ), ConsesLow.list( constant_handles
            .reader_make_constant_shell( makeString( "MixedFractionFn" ) ), makeKeyword( "INTEGER" ), makeKeyword( "INTEGER" ), makeKeyword( "INTEGER" ) ) ), makeKeyword( "ANYTHING" ) ), makeKeyword( "COST-EXPRESSION" ),
      ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
          makeString( "denominator" ) ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "FRACTION" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "BIND" ), makeSymbol(
              "CYCL-FUNCTION" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MixedFractionFn" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword(
                  "BIND" ), makeSymbol( "DENOMINATOR" ) ) ) ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FRACTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ),
                      makeSymbol( "CYCL-FUNCTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DENOMINATOR" ) ) ) ), makeKeyword( "INPUT-VERIFY-PATTERN" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
                          "REMOVAL-FRACTION-WITH-MEASURE-POS-CHECK" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list(
                              makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "FRACTION" ), makeSymbol( "CYCL-FUNCTION" ), makeSymbol( "DENOMINATOR" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                  makeString( "denominator" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FRACTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DENOMINATOR" ) ) ) ), makeKeyword(
                                      "SUPPORT-MODULE" ), makeKeyword( "CODE" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*DENOMINATOR-DEFINING-MT*" ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(#$denominator (<unit of measure> (#$MixedFractionFn <integer> <integer> <integer>)) <whatever>)" ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$denominator (#$Inch (#$MixedFractionFn 3 5 9)) 9)\n    (#$denominator (#$Inch (#$MixedFractionFn 3 5 9)) ?NUM)" )
    } );
    $const28$wholeInMixedFraction = constant_handles.reader_make_constant_shell( makeString( "wholeInMixedFraction" ) );
    $sym29$_WHOLE_IN_MIXED_FRACTION_DEFINING_MT_ = makeSymbol( "*WHOLE-IN-MIXED-FRACTION-DEFINING-MT*" );
    $kw30$REMOVAL_WHOLE_IN_MIXED_FRACTION_POS = makeKeyword( "REMOVAL-WHOLE-IN-MIXED-FRACTION-POS" );
    $list31 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "wholeInMixedFraction" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "wholeInMixedFraction" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
            "MixedFractionFn" ) ), makeKeyword( "INTEGER" ), makeKeyword( "INTEGER" ), makeKeyword( "INTEGER" ) ), makeKeyword( "ANYTHING" ) ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword(
                "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                    "wholeInMixedFraction" ) ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "FRACTION" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                        makeString( "MixedFractionFn" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "WHOLE" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ) ) ), makeKeyword( "ANYTHING" ) ), ConsesLow
                            .list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FRACTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "WHOLE" ) ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ),
      ConsesLow.list( makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "FRACTION" ), makeSymbol( "WHOLE" ) ), ConsesLow.list(
          constant_handles.reader_make_constant_shell( makeString( "wholeInMixedFraction" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FRACTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
              "WHOLE" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "CODE" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "SUPPORT-MT" ), makeSymbol(
                  "*WHOLE-IN-MIXED-FRACTION-DEFINING-MT*" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$wholeInMixedFraction (#$MixedFractionFn <integer> <integer> <integer>) <whatever>)" ), makeKeyword(
                      "EXAMPLE" ), makeString( "(#$wholeInMixedFraction (#$MixedFractionFn 3 5 9) 3)\n    (#$wholeInMixedFraction (#$MixedFractionFn 3 5 9) ?NUM)" )
    } );
    $kw32$REMOVAL_WHOLE_IN_MIXED_FRACTION_WITH_MEASURE_POS = makeKeyword( "REMOVAL-WHOLE-IN-MIXED-FRACTION-WITH-MEASURE-POS" );
    $list33 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "wholeInMixedFraction" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "wholeInMixedFraction" ) ), ConsesLow.list( makeKeyword( "ANYTHING" ), ConsesLow.list( constant_handles
            .reader_make_constant_shell( makeString( "MixedFractionFn" ) ), makeKeyword( "INTEGER" ), makeKeyword( "INTEGER" ), makeKeyword( "INTEGER" ) ) ), makeKeyword( "ANYTHING" ) ), makeKeyword( "COST-EXPRESSION" ),
      ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
          makeString( "wholeInMixedFraction" ) ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "FRACTION" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "BIND" ),
              makeSymbol( "CYCL-FUNCTION" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MixedFractionFn" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "WHOLE" ) ), makeKeyword(
                  "ANYTHING" ), makeKeyword( "ANYTHING" ) ) ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FRACTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ),
                      makeSymbol( "CYCL-FUNCTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "WHOLE" ) ) ) ), makeKeyword( "INPUT-VERIFY-PATTERN" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
                          "REMOVAL-FRACTION-WITH-MEASURE-POS-CHECK" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list(
                              makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "FRACTION" ), makeSymbol( "CYCL-FUNCTION" ), makeSymbol( "WHOLE" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                  makeString( "wholeInMixedFraction" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FRACTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "WHOLE" ) ) ) ),
      makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "CODE" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*WHOLE-IN-MIXED-FRACTION-DEFINING-MT*" ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(#$wholeInMixedFraction (<unit of measure>(#$MixedFractionFn <integer> <integer> <integer>)) <whatever>)" ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$wholeInMixedFraction (#$Inch (#$MixedFractionFn 3 5 9)) 3)\n    (#$wholeInMixedFraction (#$Inch (#$MixedFractionFn 3 5 9)) ?NUM)" )
    } );
    $const34$fractionalPartInMixedFraction = constant_handles.reader_make_constant_shell( makeString( "fractionalPartInMixedFraction" ) );
    $sym35$_FRACTIONAL_PART_IN_MIXED_FRACTION_DEFINING_MT_ = makeSymbol( "*FRACTIONAL-PART-IN-MIXED-FRACTION-DEFINING-MT*" );
    $kw36$REMOVAL_FRACTIONAL_PART_IN_MIXED_FRACTION_POS = makeKeyword( "REMOVAL-FRACTIONAL-PART-IN-MIXED-FRACTION-POS" );
    $list37 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "fractionalPartInMixedFraction" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "fractionalPartInMixedFraction" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
          makeString( "MixedFractionFn" ) ), makeKeyword( "INTEGER" ), makeKeyword( "INTEGER" ), makeKeyword( "INTEGER" ) ), makeKeyword( "ANYTHING" ) ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword(
              "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                  "fractionalPartInMixedFraction" ) ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "FRACTION" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                      makeString( "MixedFractionFn" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "NUM" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "DEN" ) ) ) ),
                  makeKeyword( "ANYTHING" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FRACTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "NUM" ) ), ConsesLow.list(
                      makeKeyword( "VALUE" ), makeSymbol( "DEN" ) ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list(
                          makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "FRACTION" ), makeSymbol( "NUM" ), makeSymbol( "DEN" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                              "fractionalPartInMixedFraction" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FRACTION" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                  "SimpleFractionFn" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "NUM" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DEN" ) ) ) ) ), makeKeyword(
                                      "SUPPORT-MODULE" ), makeKeyword( "CODE" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "SUPPORT-MT" ), makeSymbol(
                                          "*FRACTIONAL-PART-IN-MIXED-FRACTION-DEFINING-MT*" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                              "(#$fractionalPartInMixedFraction (#$MixedFractionFn <integer> <integer> <integer>) <whatever>)" ), makeKeyword( "EXAMPLE" ), makeString(
                                                  "(#$fractionalPartInMixedFraction (#$MixedFractionFn 3 5 9) (#$SimpleFractionFn 5 9))\n    (#$fractionalPartInMixedFraction (#$MixedFractionFn 3 5 9) ?NUM)" )
    } );
    $kw38$REMOVAL_FRACTIONAL_PART_IN_MIXED_FRACTION_WITH_MEASURE_POS = makeKeyword( "REMOVAL-FRACTIONAL-PART-IN-MIXED-FRACTION-WITH-MEASURE-POS" );
    $list39 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "fractionalPartInMixedFraction" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "fractionalPartInMixedFraction" ) ), ConsesLow.list( makeKeyword( "ANYTHING" ), ConsesLow.list(
          constant_handles.reader_make_constant_shell( makeString( "MixedFractionFn" ) ), makeKeyword( "INTEGER" ), makeKeyword( "INTEGER" ), makeKeyword( "INTEGER" ) ) ), makeKeyword( "ANYTHING" ) ), makeKeyword(
              "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
                  constant_handles.reader_make_constant_shell( makeString( "fractionalPartInMixedFraction" ) ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "FRACTION" ) ),
                      ConsesLow.list( ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "CYCL-FUNCTION" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MixedFractionFn" ) ), makeKeyword(
                          "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "NUM" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "DEN" ) ) ) ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list(
                              ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FRACTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYCL-FUNCTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ),
                                  makeSymbol( "NUM" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DEN" ) ) ) ), makeKeyword( "INPUT-VERIFY-PATTERN" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
                                      "REMOVAL-FRACTION-WITH-MEASURE-POS-CHECK" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ),
      ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "FRACTION" ), makeSymbol( "CYCL-FUNCTION" ), makeSymbol( "NUM" ), makeSymbol( "DEN" ) ), ConsesLow.list( constant_handles
          .reader_make_constant_shell( makeString( "fractionalPartInMixedFraction" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FRACTION" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
              makeString( "SimpleFractionFn" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "NUM" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DEN" ) ) ) ) ), makeKeyword( "SUPPORT-MODULE" ),
      makeKeyword( "CODE" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*FRACTIONAL-PART-IN-MIXED-FRACTION-DEFINING-MT*" ), makeKeyword( "DOCUMENTATION" ),
      makeString( "(#$fractionalPartInMixedFraction (<unit of measure>(#$MixedFractionFn <integer> <integer> <integer>)) <whatever>)" ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$fractionalPartInMixedFraction (#$Inch (#$MixedFractionFn 3 5 9)) (#$SimpleFractionFn 5 9))\n    (#$fractionalPartInMixedFraction (#$Inch (#$MixedFractionFn 3 5 9)) ?NUM)" )
    } );
    $const40$significand = constant_handles.reader_make_constant_shell( makeString( "significand" ) );
    $sym41$_SIGNIFICAND_DEFINING_MT_ = makeSymbol( "*SIGNIFICAND-DEFINING-MT*" );
    $kw42$REMOVAL_SIGNIFICAND_POS = makeKeyword( "REMOVAL-SIGNIFICAND-POS" );
    $list43 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "significand" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "significand" ) ), ConsesLow.list( makeKeyword( "OR" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
            makeString( "DecimalFractionFn" ) ), makeKeyword( "INTEGER" ), makeKeyword( "INTEGER" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DecimalFractionFn" ) ), makeKeyword(
                "INTEGER" ), makeKeyword( "INTEGER" ), makeKeyword( "INTEGER" ) ) ), makeKeyword( "ANYTHING" ) ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "significand" ) ), ConsesLow.list( makeKeyword( "AND" ),
          ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "FRACTION" ) ), ConsesLow.listS( constant_handles.reader_make_constant_shell( makeString( "DecimalFractionFn" ) ), ConsesLow.list( makeKeyword( "BIND" ),
              makeSymbol( "SIGNIFICAND" ) ), makeKeyword( "ANYTHING" ) ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FRACTION" ) ), ConsesLow.list( makeKeyword(
                  "VALUE" ), makeSymbol( "SIGNIFICAND" ) ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( makeKeyword(
                      "TUPLE" ), ConsesLow.list( makeSymbol( "FRACTION" ), makeSymbol( "SIGNIFICAND" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "significand" ) ), ConsesLow.list(
                          makeKeyword( "VALUE" ), makeSymbol( "FRACTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SIGNIFICAND" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "CODE" ),
      makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*SIGNIFICAND-DEFINING-MT*" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$significand (#$DecimalFractionFn <integer> <integer>) <whatever>)\n    (#$significand (#$DecimalFractionFn <integer> <integer> <integer>) <whatever>)" ), makeKeyword( "EXAMPLE" ), makeString(
              "(#$significand (#$DecimalFractionFn     125 2)       125)\n    (#$significand (#$DecimalFractionFn     125 2)      ?NUM)\n    (#$significand (#$DecimalFractionFn 3142857 6 6) 3142857)\n    (#$significand (#$DecimalFractionFn 3142857 6 6)    ?NUM)" )
    } );
    $kw44$REMOVAL_SIGNIFICAND_WITH_MEASURE_POS = makeKeyword( "REMOVAL-SIGNIFICAND-WITH-MEASURE-POS" );
    $list45 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "significand" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "significand" ) ), ConsesLow.list( makeKeyword( "OR" ), ConsesLow.list( makeKeyword( "ANYTHING" ), ConsesLow.list(
            constant_handles.reader_make_constant_shell( makeString( "DecimalFractionFn" ) ), makeKeyword( "INTEGER" ), makeKeyword( "INTEGER" ) ) ), ConsesLow.list( makeKeyword( "ANYTHING" ), ConsesLow.list(
                constant_handles.reader_make_constant_shell( makeString( "DecimalFractionFn" ) ), makeKeyword( "INTEGER" ), makeKeyword( "INTEGER" ), makeKeyword( "INTEGER" ) ) ) ), makeKeyword( "ANYTHING" ) ),
      makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
          constant_handles.reader_make_constant_shell( makeString( "significand" ) ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "FRACTION" ) ), ConsesLow.list( ConsesLow
              .list( makeKeyword( "BIND" ), makeSymbol( "CYC-FUNCTION" ) ), ConsesLow.listS( constant_handles.reader_make_constant_shell( makeString( "DecimalFractionFn" ) ), ConsesLow.list( makeKeyword( "BIND" ),
                  makeSymbol( "SIGNIFICAND" ) ), makeKeyword( "ANYTHING" ) ) ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FRACTION" ) ), ConsesLow.list(
                      makeKeyword( "VALUE" ), makeSymbol( "CYC-FUNCTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SIGNIFICAND" ) ) ) ), makeKeyword( "INPUT-VERIFY-PATTERN" ), ConsesLow.list( makeKeyword(
                          "TEST" ), makeSymbol( "REMOVAL-FRACTION-WITH-MEASURE-POS-CHECK" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "INPUT" ) ), makeKeyword(
                              "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "FRACTION" ), makeSymbol( "CYC-FUNCTION" ), makeSymbol( "SIGNIFICAND" ) ), ConsesLow.list(
                                  constant_handles.reader_make_constant_shell( makeString( "significand" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FRACTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ),
                                      makeSymbol( "SIGNIFICAND" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "CODE" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "SUPPORT-MT" ),
      makeSymbol( "*SIGNIFICAND-DEFINING-MT*" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$significand (<unit of measure> (#$DecimalFractionFn <integer> <integer>)) <whatever>)\n    (#$significand (<unit of measure> (#$DecimalFractionFn <integer> <integer> <integer>)) <whatever>)" ), makeKeyword(
              "EXAMPLE" ), makeString(
                  "(#$significand (#$Inch (#$DecimalFractionFn     125 2))       125)\n    (#$significand (#$Inch (#$DecimalFractionFn     125 2))      ?NUM)\n    (#$significand (#$Inch (#$DecimalFractionFn 3142857 6 6)) 3142857)\n    (#$significand (#$Inch (#$DecimalFractionFn 3142857 6 6))    ?NUM)" )
    } );
    $const46$decimalPosition = constant_handles.reader_make_constant_shell( makeString( "decimalPosition" ) );
    $sym47$_DECIMAL_POSITION_DEFINING_MT_ = makeSymbol( "*DECIMAL-POSITION-DEFINING-MT*" );
    $kw48$REMOVAL_DECIMAL_POSITION_POS = makeKeyword( "REMOVAL-DECIMAL-POSITION-POS" );
    $list49 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "decimalPosition" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "decimalPosition" ) ), ConsesLow.list( makeKeyword( "OR" ), ConsesLow.list( constant_handles
            .reader_make_constant_shell( makeString( "DecimalFractionFn" ) ), makeKeyword( "INTEGER" ), makeKeyword( "INTEGER" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                "DecimalFractionFn" ) ), makeKeyword( "INTEGER" ), makeKeyword( "INTEGER" ), makeKeyword( "INTEGER" ) ) ), makeKeyword( "ANYTHING" ) ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword(
                    "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                        "decimalPosition" ) ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "FRACTION" ) ), ConsesLow.listS( constant_handles.reader_make_constant_shell(
                            makeString( "DecimalFractionFn" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "POSITION" ) ), makeKeyword( "ANYTHING" ) ) ), makeKeyword( "ANYTHING" ) ),
                        ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FRACTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "POSITION" ) ) ) ), makeKeyword(
                            "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol(
                                "FRACTION" ), makeSymbol( "POSITION" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "decimalPosition" ) ), ConsesLow.list( makeKeyword( "VALUE" ),
                                    makeSymbol( "FRACTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "POSITION" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "CODE" ), makeKeyword(
                                        "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*DECIMAL-POSITION-DEFINING-MT*" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                            "(#$decimalPosition (#$DecimalFractionFn <integer> <integer>) <whatever>)\n    (#$decimalPosition (#$DecimalFractionFn <integer> <integer> <integer>) <whatever>)" ),
      makeKeyword( "EXAMPLE" ), makeString(
          "(#$decimalPosition (#$DecimalFractionFn     125 2)      2)\n    (#$decimalPosition (#$DecimalFractionFn     125 2)   ?NUM)\n    (#$decimalPosition (#$DecimalFractionFn 3142857 6 6)    6)\n    (#$decimalPosition (#$DecimalFractionFn 3142857 6 6) ?NUM)" )
    } );
    $kw50$REMOVAL_DECIMAL_POSITION_WITH_MEASURE_POS = makeKeyword( "REMOVAL-DECIMAL-POSITION-WITH-MEASURE-POS" );
    $list51 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "decimalPosition" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "decimalPosition" ) ), ConsesLow.list( makeKeyword( "OR" ), ConsesLow.list( makeKeyword( "ANYTHING" ), ConsesLow
            .list( constant_handles.reader_make_constant_shell( makeString( "DecimalFractionFn" ) ), makeKeyword( "INTEGER" ), makeKeyword( "INTEGER" ) ) ), ConsesLow.list( makeKeyword( "ANYTHING" ), ConsesLow.list(
                constant_handles.reader_make_constant_shell( makeString( "DecimalFractionFn" ) ), makeKeyword( "INTEGER" ), makeKeyword( "INTEGER" ), makeKeyword( "INTEGER" ) ) ) ), makeKeyword( "ANYTHING" ) ),
      makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
          constant_handles.reader_make_constant_shell( makeString( "decimalPosition" ) ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "FRACTION" ) ), ConsesLow.list( ConsesLow
              .list( makeKeyword( "BIND" ), makeSymbol( "CYC-FUNCTION" ) ), ConsesLow.listS( constant_handles.reader_make_constant_shell( makeString( "DecimalFractionFn" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list(
                  makeKeyword( "BIND" ), makeSymbol( "POSITION" ) ), makeKeyword( "ANYTHING" ) ) ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FRACTION" ) ),
                      ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYC-FUNCTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "POSITION" ) ) ) ), makeKeyword( "INPUT-VERIFY-PATTERN" ), ConsesLow.list(
                          makeKeyword( "TEST" ), makeSymbol( "REMOVAL-FRACTION-WITH-MEASURE-POS-CHECK" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "INPUT" ) ), makeKeyword(
                              "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "FRACTION" ), makeSymbol( "CYC-FUNCTION" ), makeSymbol( "POSITION" ) ), ConsesLow.list(
                                  constant_handles.reader_make_constant_shell( makeString( "decimalPosition" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FRACTION" ) ), ConsesLow.list( makeKeyword(
                                      "VALUE" ), makeSymbol( "POSITION" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "CODE" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword(
                                          "SUPPORT-MT" ), makeSymbol( "*DECIMAL-POSITION-DEFINING-MT*" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                              "(#$decimalPosition (<unit of measure> (#$DecimalFractionFn <integer> <integer>)) <whatever>)\n    (#$decimalPosition (<unit of measure> (#$DecimalFractionFn <integer> <integer> <integer>)) <whatever>)" ),
      makeKeyword( "EXAMPLE" ), makeString(
          "(#$decimalPosition (#$Inch (#$DecimalFractionFn     125 2))      2)\n    (#$decimalPosition (#$Inch (#$DecimalFractionFn     125 2))   ?NUM)\n    (#$decimalPosition (#$Inch (#$DecimalFractionFn 3142857 6 6))    6)\n    (#$decimalPosition (#$Inch (#$DecimalFractionFn 3142857 6 6)) ?NUM)" )
    } );
    $const52$repeatingEndSequence = constant_handles.reader_make_constant_shell( makeString( "repeatingEndSequence" ) );
    $sym53$_REPEATING_END_SEQUENCE_DEFINING_MT_ = makeSymbol( "*REPEATING-END-SEQUENCE-DEFINING-MT*" );
    $kw54$REMOVAL_REPEATING_END_SEQUENCE_POS = makeKeyword( "REMOVAL-REPEATING-END-SEQUENCE-POS" );
    $list55 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "repeatingEndSequence" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "repeatingEndSequence" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
            "DecimalFractionFn" ) ), makeKeyword( "INTEGER" ), makeKeyword( "INTEGER" ), makeKeyword( "INTEGER" ) ), makeKeyword( "ANYTHING" ) ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword(
                "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                    "repeatingEndSequence" ) ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "FRACTION" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                        makeString( "DecimalFractionFn" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "REPEAT" ) ) ) ), makeKeyword( "ANYTHING" ) ),
                    ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FRACTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "REPEAT" ) ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ),
      ConsesLow.list( makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "FRACTION" ), makeSymbol( "REPEAT" ) ), ConsesLow.list(
          constant_handles.reader_make_constant_shell( makeString( "repeatingEndSequence" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FRACTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
              "REPEAT" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "CODE" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "SUPPORT-MT" ), makeSymbol(
                  "*REPEATING-END-SEQUENCE-DEFINING-MT*" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$repeatingEndSequence (#$DecimalFractionFn <integer> <integer> <integer>) <whatever>)" ), makeKeyword(
                      "EXAMPLE" ), makeString( "(#$repeatingEndSequence (#$DecimalFractionFn 3142857 6 6)    6)\n    (#$repeatingEndSequence (#$DecimalFractionFn 3142857 6 6) ?NUM)" )
    } );
    $kw56$REMOVAL_REPEATING_END_SEQUENCE_WITH_MEASURE_POS = makeKeyword( "REMOVAL-REPEATING-END-SEQUENCE-WITH-MEASURE-POS" );
    $list57 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "repeatingEndSequence" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "repeatingEndSequence" ) ), ConsesLow.list( makeKeyword( "ANYTHING" ), ConsesLow.list( constant_handles
            .reader_make_constant_shell( makeString( "DecimalFractionFn" ) ), makeKeyword( "INTEGER" ), makeKeyword( "INTEGER" ), makeKeyword( "INTEGER" ) ) ), makeKeyword( "ANYTHING" ) ), makeKeyword(
                "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
                    constant_handles.reader_make_constant_shell( makeString( "repeatingEndSequence" ) ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "FRACTION" ) ), ConsesLow
                        .list( ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "CYC-FUNCTION" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DecimalFractionFn" ) ), makeKeyword(
                            "ANYTHING" ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "REPEAT" ) ) ) ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( ConsesLow.list( makeKeyword(
                                "VALUE" ), makeSymbol( "FRACTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "CYC-FUNCTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "REPEAT" ) ) ) ),
      makeKeyword( "INPUT-VERIFY-PATTERN" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "REMOVAL-FRACTION-WITH-MEASURE-POS-CHECK" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword(
          "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "FRACTION" ), makeSymbol( "CYC-FUNCTION" ), makeSymbol( "REPEAT" ) ), ConsesLow.list(
              constant_handles.reader_make_constant_shell( makeString( "repeatingEndSequence" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "FRACTION" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                  "REPEAT" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "CODE" ), makeKeyword( "SUPPORT-STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "SUPPORT-MT" ), makeSymbol(
                      "*REPEATING-END-SEQUENCE-DEFINING-MT*" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$repeatingEndSequence (<unit of measure> (#$DecimalFractionFn <integer> <integer> <integer>)) <whatever>)" ),
      makeKeyword( "EXAMPLE" ), makeString( "(#$repeatingEndSequence (#$Inch (#$DecimalFractionFn 3142857 6 6))    6)\n    (#$repeatingEndSequence (#$Inch (#$DecimalFractionFn 3142857 6 6)) ?NUM)" )
    } );
  }
}
/*
 * 
 * Total time: 258 ms
 * 
 */