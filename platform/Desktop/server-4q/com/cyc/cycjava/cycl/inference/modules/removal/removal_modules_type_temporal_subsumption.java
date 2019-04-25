package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.czer_meta;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.ghl_search_methods;
import com.cyc.cycjava.cycl.ghl_search_vars;
import com.cyc.cycjava.cycl.time_interval_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.gt_methods;
import com.cyc.cycjava.cycl.gt_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.hlmt_relevance;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.time_parameter_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.isa;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_type_temporal_subsumption
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption";
  public static final String myFingerPrint = "efae72f8f77143e2b7d587957ec170eec753a7f1712b066ca67bfcd5e13dc62e";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 1734L)
  private static SubLSymbol $default_temporally_subsumes_typetype_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 6060L)
  private static SubLSymbol $default_temporally_subsumes_instype_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 10132L)
  private static SubLSymbol $default_temporally_subsumed_by_instype_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 13931L)
  private static SubLSymbol $time_point_subsumed_rule$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 14379L)
  private static SubLSymbol $null_param_subsumes_rule$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 14702L)
  private static SubLSymbol $temporally_subsumes_typetype_reflexive_rule$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 14932L)
  private static SubLSymbol $rae_defining_temporally_subsumes_typetype_rule$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 15256L)
  private static SubLSymbol $temporal_subsumption_of_sliding_types_rule$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 15629L)
  private static SubLSymbol $period_plus_duration_subsumes_gappy_type$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 22402L)
  private static SubLSymbol $always_subsumes_everything_support$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 22730L)
  private static SubLSymbol $time_point_subsumed_by_everything_support$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 22967L)
  private static SubLSymbol $cooriginating_interval_of_lesser_duration_is_subsumed_support$;
  private static final SubLSymbol $kw0$TEMPORALLY_SUBSUMES_TYPETYPE_DELAY_POS;
  private static final SubLList $list1;
  private static final SubLSymbol $kw2$TEMPORALLY_SUBSUMES_TYPETYPE_GENERATE_POS;
  private static final SubLList $list3;
  private static final SubLSymbol $kw4$REMOVAL_TEMPORALLY_SUBSUMES_TYPETYPE_CHECK;
  private static final SubLList $list5;
  private static final SubLSymbol $kw6$REMOVAL_TEMPORALLY_SUBSUMES_TYPETYPE_GENERATE;
  private static final SubLList $list7;
  private static final SubLObject $const8$TimeParameter;
  private static final SubLSymbol $kw9$REMOVAL_TEMPORALLY_SUBSUMED_TYPETYPE_GENERATE;
  private static final SubLList $list10;
  private static final SubLSymbol $kw11$TEMPORALLY_SUBSUMES_INSTYPE_DELAY_POS;
  private static final SubLList $list12;
  private static final SubLSymbol $kw13$TEMPORALLY_SUBSUMES_INSTYPE_GENERATE_POS;
  private static final SubLList $list14;
  private static final SubLSymbol $kw15$REMOVAL_TEMPORALLY_SUBSUMES_INSTYPE_CHECK;
  private static final SubLList $list16;
  private static final SubLSymbol $kw17$REMOVAL_TEMPORALLY_SUBSUMES_INSTYPE_GENERATE_TYPES;
  private static final SubLList $list18;
  private static final SubLSymbol $kw19$REMOVAL_TEMPORALLY_SUBSUMED_INSTYPE_GENERATE_INTERVALS;
  private static final SubLList $list20;
  private static final SubLObject $const21$temporallySubsumedBy_InsType;
  private static final SubLSymbol $kw22$POS;
  private static final SubLSymbol $kw23$REMOVAL_TEMPORALLY_SUBSUMED_BY_INSTYPE_CHECK;
  private static final SubLList $list24;
  private static final SubLObject $const25$Null_TimeParameter;
  private static final SubLObject $const26$TimePoint;
  private static final SubLList $list27;
  private static final SubLList $list28;
  private static final SubLObject $const29$temporallySubsumes_TypeType;
  private static final SubLSymbol $kw30$UNINITIALIZED;
  private static final SubLSymbol $sym31$_TIME_POINT_SUBSUMED_RULE_;
  private static final SubLSymbol $sym32$_TIME_POINT_SUBSUMED_RULE__INITIALIZER;
  private static final SubLList $list33;
  private static final SubLSymbol $sym34$_NULL_PARAM_SUBSUMES_RULE_;
  private static final SubLSymbol $sym35$_NULL_PARAM_SUBSUMES_RULE__INITIALIZER;
  private static final SubLList $list36;
  private static final SubLSymbol $sym37$_TEMPORALLY_SUBSUMES_TYPETYPE_REFLEXIVE_RULE_;
  private static final SubLSymbol $sym38$_TEMPORALLY_SUBSUMES_TYPETYPE_REFLEXIVE_RULE__INITIALIZER;
  private static final SubLList $list39;
  private static final SubLSymbol $sym40$_RAE_DEFINING_TEMPORALLY_SUBSUMES_TYPETYPE_RULE_;
  private static final SubLSymbol $sym41$_RAE_DEFINING_TEMPORALLY_SUBSUMES_TYPETYPE_RULE__INITIALIZER;
  private static final SubLList $list42;
  private static final SubLSymbol $sym43$_TEMPORAL_SUBSUMPTION_OF_SLIDING_TYPES_RULE_;
  private static final SubLSymbol $sym44$_TEMPORAL_SUBSUMPTION_OF_SLIDING_TYPES_RULE__INITIALIZER;
  private static final SubLList $list45;
  private static final SubLSymbol $sym46$_PERIOD_PLUS_DURATION_SUBSUMES_GAPPY_TYPE_;
  private static final SubLSymbol $sym47$_PERIOD_PLUS_DURATION_SUBSUMES_GAPPY_TYPE__INITIALIZER;
  private static final SubLList $list48;
  private static final SubLSymbol $kw49$TRANSITIVITY;
  private static final SubLObject $const50$UniversalVocabularyMt;
  private static final SubLSymbol $kw51$EVAL;
  private static final SubLObject $const52$lessThanOrEqualTo;
  private static final SubLObject $const53$evaluate;
  private static final SubLObject $const54$QuotientFn;
  private static final SubLList $list55;
  private static final SubLObject $const56$TimesFn;
  private static final SubLSymbol $sym57$FIRST_PARAMETER__PREVIOUS_SLIDING_TYPE;
  private static final SubLSymbol $kw58$TIME;
  private static final SubLSymbol $kw59$ISA;
  private static final SubLObject $const60$isa;
  private static final SubLList $list61;
  private static final SubLSymbol $kw62$QUERY;
  private static final SubLObject $const63$periodOfTimeIntervalSeries;
  private static final SubLObject $const64$durationOfType;
  private static final SubLObject $const65$PlusFn;
  private static final SubLSymbol $sym66$FIRST_PARAMETER__PREVIOUS_SLIDING_TYPE;
  private static final SubLSymbol $sym67$_ALWAYS_SUBSUMES_EVERYTHING_SUPPORT_;
  private static final SubLSymbol $sym68$_ALWAYS_SUBSUMES_EVERYTHING_SUPPORT__INITIALIZER;
  private static final SubLList $list69;
  private static final SubLSymbol $sym70$_TIME_POINT_SUBSUMED_BY_EVERYTHING_SUPPORT_;
  private static final SubLSymbol $sym71$_TIME_POINT_SUBSUMED_BY_EVERYTHING_SUPPORT__INITIALIZER;
  private static final SubLList $list72;
  private static final SubLSymbol $sym73$_COORIGINATING_INTERVAL_OF_LESSER_DURATION_IS_SUBSUMED_SUPPORT_;
  private static final SubLSymbol $sym74$_COORIGINATING_INTERVAL_OF_LESSER_DURATION_IS_SUBSUMED_SUPPORT__I;
  private static final SubLList $list75;
  private static final SubLObject $const76$Always_TimeInterval;
  private static final SubLObject $const77$temporallySubsumes;
  private static final SubLSymbol $kw78$OPAQUE;
  private static final SubLObject $const79$duration;
  private static final SubLObject $const80$thereExists;
  private static final SubLSymbol $sym81$_INTERVAL;
  private static final SubLObject $const82$and;
  private static final SubLObject $const83$temporallyCooriginating;
  private static final SubLSymbol $kw84$DEPTH_FIRST;
  private static final SubLObject $const85$temporallySubsumes_InsType;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 3650L)
  public static SubLObject inference_temporally_subsumes_typetype(final SubLObject type)
  {
    return all_types_temporally_subsumed_by_type( type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 3767L)
  public static SubLObject removal_temporally_subsumes_typetype_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return Numbers.divide( Sequences.length( isa.all_fort_instances( $const8$TimeParameter, UNPROVIDED, UNPROVIDED ) ), TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 4958L)
  public static SubLObject inference_temporally_subsumed_typetype(final SubLObject type)
  {
    return all_types_temporally_subsuming_type( type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 5073L)
  public static SubLObject removal_temporally_subsumed_typetype_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return Numbers.divide( Sequences.length( isa.all_fort_instances( $const8$TimeParameter, UNPROVIDED, UNPROVIDED ) ), TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 8062L)
  public static SubLObject inference_temporally_subsumes_instype_generate_types(final SubLObject interval)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 8228L)
  public static SubLObject removal_temporally_subsumes_instype_generate_types_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return TEN_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 9430L)
  public static SubLObject inference_temporally_subsumed_instype_generate_intervals(final SubLObject type)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 9592L)
  public static SubLObject removal_temporally_subsumed_instype_generate_intervals_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return TEN_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 11120L)
  public static SubLObject all_types_temporally_subsumed_by_type(final SubLObject type)
  {
    if( type.eql( $const25$Null_TimeParameter ) )
    {
      return isa.all_fort_instances( $const8$TimeParameter, UNPROVIDED, UNPROVIDED );
    }
    if( type.eql( $const26$TimePoint ) )
    {
      return $list27;
    }
    if( NIL != time_parameter_utilities.sliding_time_type_p( type ) )
    {
      return all_types_subsumed_by_sliding_type( type );
    }
    return all_types_subsumed_by_conventional_type( type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 11967L)
  public static SubLObject all_types_temporally_subsuming_type(final SubLObject type)
  {
    if( type.eql( $const25$Null_TimeParameter ) )
    {
      return $list28;
    }
    if( type.eql( $const26$TimePoint ) )
    {
      return isa.all_fort_instances( $const8$TimeParameter, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != time_parameter_utilities.sliding_time_type_p( type ) )
    {
      return all_types_subsuming_sliding_type( type );
    }
    return all_types_subsuming_conventional_type( type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 12459L)
  public static SubLObject all_intervals_temporally_subsuming_type(final SubLObject type)
  {
    return ConsesLow.list( type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 12693L)
  public static SubLObject all_types_temporally_subsumed_by_interval(final SubLObject interval)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 12899L)
  public static SubLObject all_types_subsumed_by_sliding_type(final SubLObject type)
  {
    final SubLObject params = isa.all_fort_instances( $const8$TimeParameter, UNPROVIDED, UNPROVIDED );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = params;
    SubLObject param = NIL;
    param = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != hlmt_relevance.bigger_time_typeP( type, param ) )
      {
        result = ConsesLow.cons( param, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      param = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 13218L)
  public static SubLObject all_types_subsumed_by_conventional_type(final SubLObject type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = gt_vars.$suspend_gt_type_checkingP$.currentBinding( thread );
    try
    {
      gt_vars.$suspend_gt_type_checkingP$.bind( T, thread );
      result = gt_methods.gt_all_superiors( $const29$temporallySubsumes_TypeType, type, UNPROVIDED );
    }
    finally
    {
      gt_vars.$suspend_gt_type_checkingP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 13424L)
  public static SubLObject all_types_subsuming_sliding_type(final SubLObject type)
  {
    final SubLObject params = isa.all_fort_instances( $const8$TimeParameter, UNPROVIDED, UNPROVIDED );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = params;
    SubLObject param = NIL;
    param = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != hlmt_relevance.bigger_time_typeP( param, type ) )
      {
        result = ConsesLow.cons( param, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      param = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 13727L)
  public static SubLObject all_types_subsuming_conventional_type(final SubLObject type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = gt_vars.$suspend_gt_type_checkingP$.currentBinding( thread );
    try
    {
      gt_vars.$suspend_gt_type_checkingP$.bind( T, thread );
      result = gt_methods.gt_all_inferiors( $const29$temporallySubsumes_TypeType, type, UNPROVIDED );
    }
    finally
    {
      gt_vars.$suspend_gt_type_checkingP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 13931L)
  public static SubLObject time_point_subsumed_ruleX_initializer()
  {
    return hl_supports.find_assertion_or_make_support( $list33, hlmt_relevance.$time_inference_mt$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 14379L)
  public static SubLObject null_param_subsumes_ruleX_initializer()
  {
    return hl_supports.find_assertion_or_make_support( $list36, hlmt_relevance.$time_inference_mt$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 14702L)
  public static SubLObject temporally_subsumes_typetype_reflexive_ruleX_initializer()
  {
    return hl_supports.find_assertion_or_make_support( $list39, hlmt_relevance.$time_inference_mt$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 14932L)
  public static SubLObject rae_defining_temporally_subsumes_typetype_ruleX_initializer()
  {
    return hl_supports.find_assertion_or_make_support( $list42, hlmt_relevance.$time_inference_mt$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 15256L)
  public static SubLObject temporal_subsumption_of_sliding_types_ruleX_initializer()
  {
    return hl_supports.find_assertion_or_make_support( $list45, hlmt_relevance.$time_inference_mt$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 15629L)
  public static SubLObject period_plus_duration_subsumes_gappy_typeX_initializer()
  {
    return hl_supports.find_assertion_or_make_support( $list48, hlmt_relevance.$time_inference_mt$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 16099L)
  public static SubLObject why_bigger_time_typeP(final SubLObject big, final SubLObject small)
  {
    return why_temporally_subsumes_typetypeP( big, small );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 16359L)
  public static SubLObject why_temporally_subsumes_typetypeP(final SubLObject big, final SubLObject small)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( big.equal( small ) )
    {
      return ConsesLow.list( $temporally_subsumes_typetype_reflexive_rule$.getDynamicValue( thread ) );
    }
    if( big.eql( $const25$Null_TimeParameter ) )
    {
      return ConsesLow.list( $null_param_subsumes_rule$.getDynamicValue( thread ) );
    }
    if( small.eql( $const26$TimePoint ) )
    {
      return ConsesLow.list( $time_point_subsumed_rule$.getDynamicValue( thread ) );
    }
    if( NIL != time_parameter_utilities.sliding_time_type_p( big ) && NIL != time_parameter_utilities.sliding_time_type_p( small ) )
    {
      return why_sliding_time_typeLE( small, big );
    }
    if( NIL != time_parameter_utilities.conventional_time_series_p( big ) && NIL != time_parameter_utilities.sliding_time_type_p( small ) )
    {
      return why_covering_type_subsumes_sliding_typeP( big, small );
    }
    if( NIL != time_parameter_utilities.sliding_time_type_p( big ) && NIL != time_parameter_utilities.conventional_time_series_p( small ) )
    {
      return why_sliding_type_subsumes_covering_typeP( big, small );
    }
    return ConsesLow.list( arguments.make_hl_support( $kw49$TRANSITIVITY, ConsesLow.list( $const29$temporallySubsumes_TypeType, big, small ), $const50$UniversalVocabularyMt, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 17446L)
  public static SubLObject why_sliding_time_typeLE(final SubLObject small, final SubLObject big)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject small_unit = time_parameter_utilities.extract_sliding_time_type( small );
    final SubLObject big_unit = time_parameter_utilities.extract_sliding_time_type( big );
    final SubLObject small_amount = time_parameter_utilities.extract_sliding_type_amount( small );
    final SubLObject big_amount = time_parameter_utilities.extract_sliding_type_amount( big );
    if( small_unit.eql( big_unit ) )
    {
      return ConsesLow.list( $rae_defining_temporally_subsumes_typetype_rule$.getDynamicValue( thread ), $temporal_subsumption_of_sliding_types_rule$.getDynamicValue( thread ), arguments.make_hl_support( $kw51$EVAL,
          ConsesLow.list( $const52$lessThanOrEqualTo, small_amount, big_amount ), UNPROVIDED, UNPROVIDED ) );
    }
    if( NIL != time_parameter_utilities.duration_typeL( small_unit, big_unit ) )
    {
      final SubLObject quotient = time_parameter_utilities.find_duration_quotient( small_unit, big_unit, UNPROVIDED );
      final SubLObject product = Numbers.multiply( quotient, big_amount );
      return ConsesLow.list( $rae_defining_temporally_subsumes_typetype_rule$.getDynamicValue( thread ), $temporal_subsumption_of_sliding_types_rule$.getDynamicValue( thread ), arguments.make_hl_support( $kw51$EVAL,
          ConsesLow.list( $const53$evaluate, quotient, ConsesLow.list( $const54$QuotientFn, reader.bq_cons( big_unit, $list55 ), reader.bq_cons( small_unit, $list55 ) ) ), UNPROVIDED, UNPROVIDED ), arguments
              .make_hl_support( $kw51$EVAL, ConsesLow.list( $const53$evaluate, ConsesLow.list( small_unit, product ), ConsesLow.list( $const56$TimesFn, ConsesLow.list( small_unit, quotient ), big_amount ) ), UNPROVIDED,
                  UNPROVIDED ), arguments.make_hl_support( $kw51$EVAL, ConsesLow.list( $const52$lessThanOrEqualTo, small_amount, product ), UNPROVIDED, UNPROVIDED ) );
    }
    final SubLObject quotient = time_parameter_utilities.find_duration_quotient( big_unit, small_unit, UNPROVIDED );
    final SubLObject product = Numbers.multiply( quotient, small_amount );
    return ConsesLow.list( $rae_defining_temporally_subsumes_typetype_rule$.getDynamicValue( thread ), $temporal_subsumption_of_sliding_types_rule$.getDynamicValue( thread ), arguments.make_hl_support( $kw51$EVAL,
        ConsesLow.list( $const53$evaluate, quotient, ConsesLow.list( $const54$QuotientFn, reader.bq_cons( small_unit, $list55 ), reader.bq_cons( big_unit, $list55 ) ) ), UNPROVIDED, UNPROVIDED ), arguments
            .make_hl_support( $kw51$EVAL, ConsesLow.list( $const53$evaluate, ConsesLow.list( big_unit, product ), ConsesLow.list( $const56$TimesFn, ConsesLow.list( big_unit, quotient ), small_amount ) ), UNPROVIDED,
                UNPROVIDED ), arguments.make_hl_support( $kw51$EVAL, ConsesLow.list( $const52$lessThanOrEqualTo, product, big_amount ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 19179L)
  public static SubLObject why_covering_type_subsumes_sliding_typeP(final SubLObject covering_type, final SubLObject sliding_type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject subsumed_sliding_type = NIL;
    final SubLObject _prev_bind_0 = hlmt_relevance.$hlmt_sliding_type$.currentBinding( thread );
    final SubLObject _prev_bind_2 = gt_vars.$suspend_gt_type_checkingP$.currentBinding( thread );
    try
    {
      hlmt_relevance.$hlmt_sliding_type$.bind( sliding_type, thread );
      gt_vars.$suspend_gt_type_checkingP$.bind( T, thread );
      subsumed_sliding_type = gt_methods.gt_gather_superior( $const29$temporallySubsumes_TypeType, covering_type, $sym57$FIRST_PARAMETER__PREVIOUS_SLIDING_TYPE, $const50$UniversalVocabularyMt );
    }
    finally
    {
      gt_vars.$suspend_gt_type_checkingP$.rebind( _prev_bind_2, thread );
      hlmt_relevance.$hlmt_sliding_type$.rebind( _prev_bind_0, thread );
    }
    if( NIL != subsumed_sliding_type )
    {
      return ConsesLow.list( arguments.make_hl_support( $kw49$TRANSITIVITY, ConsesLow.list( $const29$temporallySubsumes_TypeType, covering_type, subsumed_sliding_type ), UNPROVIDED, UNPROVIDED ), arguments
          .make_hl_support( $kw58$TIME, ConsesLow.list( $const29$temporallySubsumes_TypeType, subsumed_sliding_type, sliding_type ), UNPROVIDED, UNPROVIDED ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 19925L)
  public static SubLObject first_parameterGEprevious_sliding_type(final SubLObject time_parameter)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != time_parameter_utilities.sliding_time_type_p( time_parameter ) && NIL != hlmt_relevance.sliding_time_typeLE( hlmt_relevance.$hlmt_sliding_type$.getDynamicValue( thread ), time_parameter ) )
    {
      return time_parameter;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 20156L)
  public static SubLObject why_sliding_type_subsumes_covering_typeP(final SubLObject sliding_type, final SubLObject covering_type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != time_parameter_utilities.gappy_time_type_p( covering_type ) )
    {
      final SubLObject min_subsuming_slider = hlmt_relevance.minimally_subsuming_sliding_type_for_gappy_type( covering_type );
      SubLObject result = NIL;
      if( NIL != hlmt_relevance.sliding_time_typeLE( min_subsuming_slider, sliding_type ) )
      {
        final SubLObject period_dur = time_parameter_utilities.gappy_type_period( covering_type );
        final SubLObject type_dur = time_parameter_utilities.gappy_type_duration( covering_type );
        result = ConsesLow.list( $period_plus_duration_subsumes_gappy_type$.getDynamicValue( thread ), arguments.make_hl_support( $kw59$ISA, ConsesLow.listS( $const60$isa, sliding_type, $list61 ), UNPROVIDED,
            UNPROVIDED ), arguments.make_hl_support( $kw62$QUERY, ConsesLow.list( $const63$periodOfTimeIntervalSeries, covering_type, period_dur ), UNPROVIDED, UNPROVIDED ), arguments.make_hl_support( $kw62$QUERY,
                ConsesLow.list( $const64$durationOfType, covering_type, type_dur ), UNPROVIDED, UNPROVIDED ), arguments.make_hl_support( $kw51$EVAL, ConsesLow.list( $const53$evaluate, time_parameter_utilities
                    .extract_sliding_type( min_subsuming_slider ), ConsesLow.list( $const65$PlusFn, period_dur, type_dur ) ), UNPROVIDED, UNPROVIDED ) );
        if( !min_subsuming_slider.equal( sliding_type ) )
        {
          result = ConsesLow.cons( arguments.make_hl_support( $kw58$TIME, ConsesLow.list( $const29$temporallySubsumes_TypeType, sliding_type, min_subsuming_slider ), UNPROVIDED, UNPROVIDED ), result );
        }
        return result;
      }
    }
    SubLObject subsuming_sliding_type = NIL;
    final SubLObject _prev_bind_0 = hlmt_relevance.$hlmt_sliding_type$.currentBinding( thread );
    final SubLObject _prev_bind_2 = gt_vars.$suspend_gt_type_checkingP$.currentBinding( thread );
    try
    {
      hlmt_relevance.$hlmt_sliding_type$.bind( sliding_type, thread );
      gt_vars.$suspend_gt_type_checkingP$.bind( T, thread );
      subsuming_sliding_type = gt_methods.gt_gather_inferior( $const29$temporallySubsumes_TypeType, covering_type, $sym66$FIRST_PARAMETER__PREVIOUS_SLIDING_TYPE, $const50$UniversalVocabularyMt );
    }
    finally
    {
      gt_vars.$suspend_gt_type_checkingP$.rebind( _prev_bind_2, thread );
      hlmt_relevance.$hlmt_sliding_type$.rebind( _prev_bind_0, thread );
    }
    if( NIL != subsuming_sliding_type )
    {
      return ConsesLow.list( arguments.make_hl_support( $kw49$TRANSITIVITY, ConsesLow.list( $const29$temporallySubsumes_TypeType, subsuming_sliding_type, covering_type ), UNPROVIDED, UNPROVIDED ), arguments
          .make_hl_support( $kw58$TIME, ConsesLow.list( $const29$temporallySubsumes_TypeType, sliding_type, subsuming_sliding_type ), UNPROVIDED, UNPROVIDED ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 22171L)
  public static SubLObject first_parameterLEprevious_sliding_type(final SubLObject time_parameter)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != time_parameter_utilities.sliding_time_type_p( time_parameter ) && NIL != hlmt_relevance.sliding_time_typeLE( time_parameter, hlmt_relevance.$hlmt_sliding_type$.getDynamicValue( thread ) ) )
    {
      return time_parameter;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 22402L)
  public static SubLObject always_subsumes_everything_supportX_initializer()
  {
    return hl_supports.find_assertion_or_make_support( $list69, hlmt_relevance.$time_inference_mt$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 22730L)
  public static SubLObject time_point_subsumed_by_everything_supportX_initializer()
  {
    return hl_supports.find_assertion_or_make_support( $list72, hlmt_relevance.$time_inference_mt$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 22967L)
  public static SubLObject cooriginating_interval_of_lesser_duration_is_subsumed_supportX_initializer()
  {
    return hl_supports.find_assertion_or_make_support( $list75, hlmt_relevance.$time_inference_mt$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 23459L)
  public static SubLObject why_time_interval_subsumes_typeP(final SubLObject interval, final SubLObject type)
  {
    return why_temporally_subsumes_instypeP( interval, type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 23700L)
  public static SubLObject why_temporally_subsumes_instypeP(final SubLObject interval, final SubLObject type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( interval.eql( $const76$Always_TimeInterval ) )
    {
      return ConsesLow.list( $always_subsumes_everything_support$.getDynamicValue( thread ) );
    }
    if( type.eql( $const26$TimePoint ) )
    {
      return ConsesLow.list( $time_point_subsumed_by_everything_support$.getDynamicValue( thread ) );
    }
    if( NIL != time_interval_utilities.date_interval_p( interval ) )
    {
      return why_date_interval_subsumes_typeP( interval, type );
    }
    return why_arbitrary_interval_subsumes_typeP( interval, type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 24338L)
  public static SubLObject why_date_interval_subsumes_typeP(final SubLObject interval, final SubLObject type)
  {
    final SubLObject witness = time_parameter_utilities.nth_type_starting_no_earlier_than_start_of_interval( interval, type, ZERO_INTEGER );
    return witness.equal( interval ) ? ConsesLow.list( arguments.make_hl_support( $kw59$ISA, ConsesLow.list( $const60$isa, witness, type ), UNPROVIDED, UNPROVIDED ) )
        : ConsesLow.list( arguments.make_hl_support( $kw59$ISA, ConsesLow.list( $const60$isa, witness, type ), UNPROVIDED, UNPROVIDED ), arguments.make_hl_support( $kw58$TIME, ConsesLow.list( $const77$temporallySubsumes,
            interval, witness ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 25834L)
  public static SubLObject interval_subsumes_cooriginating_type_justification(final SubLObject type, final SubLObject interval)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject type_duration = time_parameter_utilities.get_duration_of_type( type );
    final SubLObject interval_duration = time_parameter_utilities.get_duration_of_interval( interval );
    return ( NIL != type_duration && NIL != interval_duration ) ? ConsesLow.list( make_cooriginating_interval_support( type, interval ), arguments.make_hl_support( $kw62$QUERY, ConsesLow.list( $const64$durationOfType,
        type, type_duration ), UNPROVIDED, UNPROVIDED ), arguments.make_hl_support( $kw78$OPAQUE, ConsesLow.list( $const79$duration, interval, interval_duration ), UNPROVIDED, UNPROVIDED ), arguments.make_hl_support(
            $kw51$EVAL, ConsesLow.list( $const52$lessThanOrEqualTo, type_duration, interval_duration ), UNPROVIDED, UNPROVIDED ), $cooriginating_interval_of_lesser_duration_is_subsumed_support$.getDynamicValue(
                thread ) ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 26462L)
  public static SubLObject make_cooriginating_interval_support(final SubLObject type, final SubLObject interval)
  {
    return arguments.make_hl_support( $kw78$OPAQUE, ConsesLow.list( $const80$thereExists, $sym81$_INTERVAL, ConsesLow.list( $const82$and, ConsesLow.list( $const60$isa, $sym81$_INTERVAL, type ), ConsesLow.list(
        $const83$temporallyCooriginating, $sym81$_INTERVAL, interval ) ) ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 26697L)
  public static SubLObject why_arbitrary_interval_subsumes_typeP(final SubLObject interval, final SubLObject type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject subsumed_type = NIL;
    final SubLObject iterator = ghl_search_methods.new_ghl_closure_iterator( $const77$temporallySubsumes, interval, ghl_search_vars.ghl_forward_direction(), NIL, NIL, $kw84$DEPTH_FIRST, UNPROVIDED );
    SubLObject valid;
    for( SubLObject done_var = subsumed_type; NIL == done_var; done_var = makeBoolean( NIL == valid || NIL != subsumed_type ) )
    {
      thread.resetMultipleValues();
      final SubLObject subsumed_interval = iteration.iteration_next( iterator );
      valid = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != valid && NIL != hlmt_relevance.arbitrary_interval_subsumes_typeP_int( subsumed_type, type ) )
      {
        subsumed_type = subsumed_interval;
      }
    }
    if( NIL == subsumed_type )
    {
      return NIL;
    }
    if( NIL != time_interval_utilities.date_interval_p( subsumed_type ) )
    {
      return ConsesLow.list( arguments.make_hl_support( $kw49$TRANSITIVITY, ConsesLow.list( $const77$temporallySubsumes, interval, subsumed_type ), UNPROVIDED, UNPROVIDED ), arguments.make_hl_support( $kw58$TIME,
          ConsesLow.list( $const85$temporallySubsumes_InsType, subsumed_type, type ), UNPROVIDED, UNPROVIDED ) );
    }
    return ConsesLow.list( arguments.make_hl_support( $kw49$TRANSITIVITY, ConsesLow.list( $const77$temporallySubsumes, interval, subsumed_type ), UNPROVIDED, UNPROVIDED ), czer_meta.find_assertion_cycl( ConsesLow.list(
        $const85$temporallySubsumes_InsType, interval, subsumed_type ), UNPROVIDED ) );
  }

  public static SubLObject declare_removal_modules_type_temporal_subsumption_file()
  {
    SubLFiles.declareFunction( me, "inference_temporally_subsumes_typetype", "INFERENCE-TEMPORALLY-SUBSUMES-TYPETYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_temporally_subsumes_typetype_cost", "REMOVAL-TEMPORALLY-SUBSUMES-TYPETYPE-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "inference_temporally_subsumed_typetype", "INFERENCE-TEMPORALLY-SUBSUMED-TYPETYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_temporally_subsumed_typetype_cost", "REMOVAL-TEMPORALLY-SUBSUMED-TYPETYPE-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "inference_temporally_subsumes_instype_generate_types", "INFERENCE-TEMPORALLY-SUBSUMES-INSTYPE-GENERATE-TYPES", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_temporally_subsumes_instype_generate_types_cost", "REMOVAL-TEMPORALLY-SUBSUMES-INSTYPE-GENERATE-TYPES-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "inference_temporally_subsumed_instype_generate_intervals", "INFERENCE-TEMPORALLY-SUBSUMED-INSTYPE-GENERATE-INTERVALS", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_temporally_subsumed_instype_generate_intervals_cost", "REMOVAL-TEMPORALLY-SUBSUMED-INSTYPE-GENERATE-INTERVALS-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "all_types_temporally_subsumed_by_type", "ALL-TYPES-TEMPORALLY-SUBSUMED-BY-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "all_types_temporally_subsuming_type", "ALL-TYPES-TEMPORALLY-SUBSUMING-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "all_intervals_temporally_subsuming_type", "ALL-INTERVALS-TEMPORALLY-SUBSUMING-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "all_types_temporally_subsumed_by_interval", "ALL-TYPES-TEMPORALLY-SUBSUMED-BY-INTERVAL", 1, 0, false );
    SubLFiles.declareFunction( me, "all_types_subsumed_by_sliding_type", "ALL-TYPES-SUBSUMED-BY-SLIDING-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "all_types_subsumed_by_conventional_type", "ALL-TYPES-SUBSUMED-BY-CONVENTIONAL-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "all_types_subsuming_sliding_type", "ALL-TYPES-SUBSUMING-SLIDING-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "all_types_subsuming_conventional_type", "ALL-TYPES-SUBSUMING-CONVENTIONAL-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "time_point_subsumed_ruleX_initializer", "*TIME-POINT-SUBSUMED-RULE*-INITIALIZER", 0, 0, false );
    SubLFiles.declareFunction( me, "null_param_subsumes_ruleX_initializer", "*NULL-PARAM-SUBSUMES-RULE*-INITIALIZER", 0, 0, false );
    SubLFiles.declareFunction( me, "temporally_subsumes_typetype_reflexive_ruleX_initializer", "*TEMPORALLY-SUBSUMES-TYPETYPE-REFLEXIVE-RULE*-INITIALIZER", 0, 0, false );
    SubLFiles.declareFunction( me, "rae_defining_temporally_subsumes_typetype_ruleX_initializer", "*RAE-DEFINING-TEMPORALLY-SUBSUMES-TYPETYPE-RULE*-INITIALIZER", 0, 0, false );
    SubLFiles.declareFunction( me, "temporal_subsumption_of_sliding_types_ruleX_initializer", "*TEMPORAL-SUBSUMPTION-OF-SLIDING-TYPES-RULE*-INITIALIZER", 0, 0, false );
    SubLFiles.declareFunction( me, "period_plus_duration_subsumes_gappy_typeX_initializer", "*PERIOD-PLUS-DURATION-SUBSUMES-GAPPY-TYPE*-INITIALIZER", 0, 0, false );
    SubLFiles.declareFunction( me, "why_bigger_time_typeP", "WHY-BIGGER-TIME-TYPE?", 2, 0, false );
    SubLFiles.declareFunction( me, "why_temporally_subsumes_typetypeP", "WHY-TEMPORALLY-SUBSUMES-TYPETYPE?", 2, 0, false );
    SubLFiles.declareFunction( me, "why_sliding_time_typeLE", "WHY-SLIDING-TIME-TYPE<=", 2, 0, false );
    SubLFiles.declareFunction( me, "why_covering_type_subsumes_sliding_typeP", "WHY-COVERING-TYPE-SUBSUMES-SLIDING-TYPE?", 2, 0, false );
    SubLFiles.declareFunction( me, "first_parameterGEprevious_sliding_type", "FIRST-PARAMETER>=PREVIOUS-SLIDING-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "why_sliding_type_subsumes_covering_typeP", "WHY-SLIDING-TYPE-SUBSUMES-COVERING-TYPE?", 2, 0, false );
    SubLFiles.declareFunction( me, "first_parameterLEprevious_sliding_type", "FIRST-PARAMETER<=PREVIOUS-SLIDING-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "always_subsumes_everything_supportX_initializer", "*ALWAYS-SUBSUMES-EVERYTHING-SUPPORT*-INITIALIZER", 0, 0, false );
    SubLFiles.declareFunction( me, "time_point_subsumed_by_everything_supportX_initializer", "*TIME-POINT-SUBSUMED-BY-EVERYTHING-SUPPORT*-INITIALIZER", 0, 0, false );
    SubLFiles.declareFunction( me, "cooriginating_interval_of_lesser_duration_is_subsumed_supportX_initializer", "*COORIGINATING-INTERVAL-OF-LESSER-DURATION-IS-SUBSUMED-SUPPORT*-INITIALIZER", 0, 0, false );
    SubLFiles.declareFunction( me, "why_time_interval_subsumes_typeP", "WHY-TIME-INTERVAL-SUBSUMES-TYPE?", 2, 0, false );
    SubLFiles.declareFunction( me, "why_temporally_subsumes_instypeP", "WHY-TEMPORALLY-SUBSUMES-INSTYPE?", 2, 0, false );
    SubLFiles.declareFunction( me, "why_date_interval_subsumes_typeP", "WHY-DATE-INTERVAL-SUBSUMES-TYPE?", 2, 0, false );
    SubLFiles.declareFunction( me, "interval_subsumes_cooriginating_type_justification", "INTERVAL-SUBSUMES-COORIGINATING-TYPE-JUSTIFICATION", 2, 0, false );
    SubLFiles.declareFunction( me, "make_cooriginating_interval_support", "MAKE-COORIGINATING-INTERVAL-SUPPORT", 2, 0, false );
    SubLFiles.declareFunction( me, "why_arbitrary_interval_subsumes_typeP", "WHY-ARBITRARY-INTERVAL-SUBSUMES-TYPE?", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_type_temporal_subsumption_file()
  {
    $default_temporally_subsumes_typetype_check_cost$ = SubLFiles.defparameter( "*DEFAULT-TEMPORALLY-SUBSUMES-TYPETYPE-CHECK-COST*", ONE_INTEGER );
    $default_temporally_subsumes_instype_check_cost$ = SubLFiles.defparameter( "*DEFAULT-TEMPORALLY-SUBSUMES-INSTYPE-CHECK-COST*", ONE_INTEGER );
    $default_temporally_subsumed_by_instype_check_cost$ = SubLFiles.defparameter( "*DEFAULT-TEMPORALLY-SUBSUMED-BY-INSTYPE-CHECK-COST*", ONE_INTEGER );
    $time_point_subsumed_rule$ = SubLFiles.defvar( "*TIME-POINT-SUBSUMED-RULE*", $kw30$UNINITIALIZED );
    $null_param_subsumes_rule$ = SubLFiles.defvar( "*NULL-PARAM-SUBSUMES-RULE*", $kw30$UNINITIALIZED );
    $temporally_subsumes_typetype_reflexive_rule$ = SubLFiles.defvar( "*TEMPORALLY-SUBSUMES-TYPETYPE-REFLEXIVE-RULE*", $kw30$UNINITIALIZED );
    $rae_defining_temporally_subsumes_typetype_rule$ = SubLFiles.defvar( "*RAE-DEFINING-TEMPORALLY-SUBSUMES-TYPETYPE-RULE*", $kw30$UNINITIALIZED );
    $temporal_subsumption_of_sliding_types_rule$ = SubLFiles.defvar( "*TEMPORAL-SUBSUMPTION-OF-SLIDING-TYPES-RULE*", $kw30$UNINITIALIZED );
    $period_plus_duration_subsumes_gappy_type$ = SubLFiles.defvar( "*PERIOD-PLUS-DURATION-SUBSUMES-GAPPY-TYPE*", $kw30$UNINITIALIZED );
    $always_subsumes_everything_support$ = SubLFiles.defvar( "*ALWAYS-SUBSUMES-EVERYTHING-SUPPORT*", $kw30$UNINITIALIZED );
    $time_point_subsumed_by_everything_support$ = SubLFiles.defvar( "*TIME-POINT-SUBSUMED-BY-EVERYTHING-SUPPORT*", $kw30$UNINITIALIZED );
    $cooriginating_interval_of_lesser_duration_is_subsumed_support$ = SubLFiles.defvar( "*COORIGINATING-INTERVAL-OF-LESSER-DURATION-IS-SUBSUMED-SUPPORT*", $kw30$UNINITIALIZED );
    return NIL;
  }

  public static SubLObject setup_removal_modules_type_temporal_subsumption_file()
  {
    preference_modules.inference_preference_module( $kw0$TEMPORALLY_SUBSUMES_TYPETYPE_DELAY_POS, $list1 );
    preference_modules.inference_preference_module( $kw2$TEMPORALLY_SUBSUMES_TYPETYPE_GENERATE_POS, $list3 );
    inference_modules.inference_removal_module( $kw4$REMOVAL_TEMPORALLY_SUBSUMES_TYPETYPE_CHECK, $list5 );
    inference_modules.inference_removal_module( $kw6$REMOVAL_TEMPORALLY_SUBSUMES_TYPETYPE_GENERATE, $list7 );
    inference_modules.inference_removal_module( $kw9$REMOVAL_TEMPORALLY_SUBSUMED_TYPETYPE_GENERATE, $list10 );
    preference_modules.inference_preference_module( $kw11$TEMPORALLY_SUBSUMES_INSTYPE_DELAY_POS, $list12 );
    preference_modules.inference_preference_module( $kw13$TEMPORALLY_SUBSUMES_INSTYPE_GENERATE_POS, $list14 );
    inference_modules.inference_removal_module( $kw15$REMOVAL_TEMPORALLY_SUBSUMES_INSTYPE_CHECK, $list16 );
    inference_modules.inference_removal_module( $kw17$REMOVAL_TEMPORALLY_SUBSUMES_INSTYPE_GENERATE_TYPES, $list18 );
    inference_modules.inference_removal_module( $kw19$REMOVAL_TEMPORALLY_SUBSUMED_INSTYPE_GENERATE_INTERVALS, $list20 );
    inference_modules.register_solely_specific_removal_module_predicate( $const21$temporallySubsumedBy_InsType );
    preference_modules.doomed_unless_all_args_bindable( $kw22$POS, $const21$temporallySubsumedBy_InsType );
    inference_modules.inference_removal_module( $kw23$REMOVAL_TEMPORALLY_SUBSUMED_BY_INSTYPE_CHECK, $list24 );
    utilities_macros.register_kb_variable_initialization( $sym31$_TIME_POINT_SUBSUMED_RULE_, $sym32$_TIME_POINT_SUBSUMED_RULE__INITIALIZER );
    utilities_macros.register_kb_variable_initialization( $sym34$_NULL_PARAM_SUBSUMES_RULE_, $sym35$_NULL_PARAM_SUBSUMES_RULE__INITIALIZER );
    utilities_macros.register_kb_variable_initialization( $sym37$_TEMPORALLY_SUBSUMES_TYPETYPE_REFLEXIVE_RULE_, $sym38$_TEMPORALLY_SUBSUMES_TYPETYPE_REFLEXIVE_RULE__INITIALIZER );
    utilities_macros.register_kb_variable_initialization( $sym40$_RAE_DEFINING_TEMPORALLY_SUBSUMES_TYPETYPE_RULE_, $sym41$_RAE_DEFINING_TEMPORALLY_SUBSUMES_TYPETYPE_RULE__INITIALIZER );
    utilities_macros.register_kb_variable_initialization( $sym43$_TEMPORAL_SUBSUMPTION_OF_SLIDING_TYPES_RULE_, $sym44$_TEMPORAL_SUBSUMPTION_OF_SLIDING_TYPES_RULE__INITIALIZER );
    utilities_macros.register_kb_variable_initialization( $sym46$_PERIOD_PLUS_DURATION_SUBSUMES_GAPPY_TYPE_, $sym47$_PERIOD_PLUS_DURATION_SUBSUMES_GAPPY_TYPE__INITIALIZER );
    utilities_macros.register_kb_variable_initialization( $sym67$_ALWAYS_SUBSUMES_EVERYTHING_SUPPORT_, $sym68$_ALWAYS_SUBSUMES_EVERYTHING_SUPPORT__INITIALIZER );
    utilities_macros.register_kb_variable_initialization( $sym70$_TIME_POINT_SUBSUMED_BY_EVERYTHING_SUPPORT_, $sym71$_TIME_POINT_SUBSUMED_BY_EVERYTHING_SUPPORT__INITIALIZER );
    utilities_macros.register_kb_variable_initialization( $sym73$_COORIGINATING_INTERVAL_OF_LESSER_DURATION_IS_SUBSUMED_SUPPORT_, $sym74$_COORIGINATING_INTERVAL_OF_LESSER_DURATION_IS_SUBSUMED_SUPPORT__I );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_type_temporal_subsumption_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_type_temporal_subsumption_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_type_temporal_subsumption_file();
  }
  static
  {
    me = new removal_modules_type_temporal_subsumption();
    $default_temporally_subsumes_typetype_check_cost$ = null;
    $default_temporally_subsumes_instype_check_cost$ = null;
    $default_temporally_subsumed_by_instype_check_cost$ = null;
    $time_point_subsumed_rule$ = null;
    $null_param_subsumes_rule$ = null;
    $temporally_subsumes_typetype_reflexive_rule$ = null;
    $rae_defining_temporally_subsumes_typetype_rule$ = null;
    $temporal_subsumption_of_sliding_types_rule$ = null;
    $period_plus_duration_subsumes_gappy_type$ = null;
    $always_subsumes_everything_support$ = null;
    $time_point_subsumed_by_everything_support$ = null;
    $cooriginating_interval_of_lesser_duration_is_subsumed_support$ = null;
    $kw0$TEMPORALLY_SUBSUMES_TYPETYPE_DELAY_POS = makeKeyword( "TEMPORALLY-SUBSUMES-TYPETYPE-DELAY-POS" );
    $list1 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes-TypeType" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes-TypeType" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword(
            "PREFERENCE-LEVEL" ), makeKeyword( "DISALLOWED" ) );
    $kw2$TEMPORALLY_SUBSUMES_TYPETYPE_GENERATE_POS = makeKeyword( "TEMPORALLY-SUBSUMES-TYPETYPE-GENERATE-POS" );
    $list3 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes-TypeType" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "OR" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes-TypeType" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword(
            "NOT-FULLY-BOUND" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes-TypeType" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ) ),
        makeKeyword( "PREFERENCE-LEVEL" ), makeKeyword( "GROSSLY-DISPREFERRED" ) );
    $kw4$REMOVAL_TEMPORALLY_SUBSUMES_TYPETYPE_CHECK = makeKeyword( "REMOVAL-TEMPORALLY-SUBSUMES-TYPETYPE-CHECK" );
    $list5 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes-TypeType" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes-TypeType" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ),
      makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-TEMPORALLY-SUBSUMES-TYPETYPE-CHECK-COST*" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
          constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes-TypeType" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "BIG" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol(
              "SMALL" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "BIG" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SMALL" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ),
      ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "BIG" ), makeSymbol( "SMALL" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "BIGGER-TIME-TYPE?" ), ConsesLow.list( makeKeyword(
          "VALUE" ), makeSymbol( "BIG" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SMALL" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ), makeString(
              "(#$temporallySubsumes-TypeType TYPE1 TYPE2)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$temporallySubsumes-TypeType #$CalendarDay #$CalendarHour)" )
    } );
    $kw6$REMOVAL_TEMPORALLY_SUBSUMES_TYPETYPE_GENERATE = makeKeyword( "REMOVAL-TEMPORALLY-SUBSUMES-TYPETYPE-GENERATE" );
    $list7 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes-TypeType" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes-TypeType" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ) ),
      makeKeyword( "COST" ), makeSymbol( "REMOVAL-TEMPORALLY-SUBSUMES-TYPETYPE-COST" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles
          .reader_make_constant_shell( makeString( "temporallySubsumes-TypeType" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "BIG" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ),
              makeSymbol( "BIG" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "INFERENCE-TEMPORALLY-SUBSUMES-TYPETYPE" ), makeKeyword( "INPUT" ) ), makeKeyword(
                  "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes-TypeType" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "BIG" ) ),
                      makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$temporallySubsumes-TypeType TYPE ?X)" ), makeKeyword( "EXAMPLE" ),
      makeString( "(#$temporallySubsumes-TypeType #$CalendarDay ?WHAT) ->\n    #$CalendarHour, #$CalendarMinute, (#$SameLengthTimeIntervalTypeFn (#$DaysDuration 1)), etc " )
    } );
    $const8$TimeParameter = constant_handles.reader_make_constant_shell( makeString( "TimeParameter" ) );
    $kw9$REMOVAL_TEMPORALLY_SUBSUMED_TYPETYPE_GENERATE = makeKeyword( "REMOVAL-TEMPORALLY-SUBSUMED-TYPETYPE-GENERATE" );
    $list10 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes-TypeType" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes-TypeType" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ),
      makeKeyword( "COST" ), makeSymbol( "REMOVAL-TEMPORALLY-SUBSUMED-TYPETYPE-COST" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles
          .reader_make_constant_shell( makeString( "temporallySubsumes-TypeType" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "SMALL" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ),
              makeSymbol( "SMALL" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "INFERENCE-TEMPORALLY-SUBSUMED-TYPETYPE" ), makeKeyword( "INPUT" ) ), makeKeyword(
                  "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes-TypeType" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ),
                      makeSymbol( "SMALL" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$temporallySubsumes-TypeType ?X TYPE)" ), makeKeyword( "EXAMPLE" ),
      makeString( "(#$temporallySubsumes-TypeType ?WHAT #$CalendarDay) ->\n    #$CalendarWeek, #$CalendarMonth, (#$SameLengthTimeIntervalTypeFn (#$DaysDuration 2)), etc" )
    } );
    $kw11$TEMPORALLY_SUBSUMES_INSTYPE_DELAY_POS = makeKeyword( "TEMPORALLY-SUBSUMES-INSTYPE-DELAY-POS" );
    $list12 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes-InsType" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes-InsType" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword(
            "PREFERENCE-LEVEL" ), makeKeyword( "DISALLOWED" ) );
    $kw13$TEMPORALLY_SUBSUMES_INSTYPE_GENERATE_POS = makeKeyword( "TEMPORALLY-SUBSUMES-INSTYPE-GENERATE-POS" );
    $list14 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes-InsType" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "OR" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes-InsType" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword(
            "NOT-FULLY-BOUND" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes-InsType" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ) ),
        makeKeyword( "PREFERENCE-LEVEL" ), makeKeyword( "GROSSLY-DISPREFERRED" ) );
    $kw15$REMOVAL_TEMPORALLY_SUBSUMES_INSTYPE_CHECK = makeKeyword( "REMOVAL-TEMPORALLY-SUBSUMES-INSTYPE-CHECK" );
    $list16 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes-InsType" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes-InsType" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ),
      makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-TEMPORALLY-SUBSUMES-INSTYPE-CHECK-COST*" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
          constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes-InsType" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "INTERVAL" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol(
              "TYPE" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "INTERVAL" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TYPE" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ),
      ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "INTERVAL" ), makeSymbol( "TYPE" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "TIME-INTERVAL-SUBSUMES-TYPE?" ), ConsesLow.list(
          makeKeyword( "VALUE" ), makeSymbol( "INTERVAL" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TYPE" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ),
      makeString( "(#$temporallySubsumes-InsType INTERVAL TYPE)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$temporallySubsumes-InsType #$TheYear2000 #$CalendarYear)" )
    } );
    $kw17$REMOVAL_TEMPORALLY_SUBSUMES_INSTYPE_GENERATE_TYPES = makeKeyword( "REMOVAL-TEMPORALLY-SUBSUMES-INSTYPE-GENERATE-TYPES" );
    $list18 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes-InsType" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes-InsType" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ) ),
      makeKeyword( "COST" ), makeSymbol( "REMOVAL-TEMPORALLY-SUBSUMES-INSTYPE-GENERATE-TYPES-COST" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles
          .reader_make_constant_shell( makeString( "temporallySubsumes-InsType" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "INTERVAL" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ),
              makeSymbol( "INTERVAL" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "INFERENCE-TEMPORALLY-SUBSUMES-INSTYPE-GENERATE-TYPES" ), makeKeyword( "INPUT" ) ),
      makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes-InsType" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
          "INTERVAL" ) ), makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$temporallySubsumes-InsType Interval ?X)" ), makeKeyword(
              "EXAMPLE" ), makeString( "(#$temporallySubsumes-InsType #$TheYear2000 ?WHAT) ->\n    #$CalendarYear, #$CalendarDay, (#$SameLengthTimeIntervalTypeFn (#$YearsDuration 1)), etc" )
    } );
    $kw19$REMOVAL_TEMPORALLY_SUBSUMED_INSTYPE_GENERATE_INTERVALS = makeKeyword( "REMOVAL-TEMPORALLY-SUBSUMED-INSTYPE-GENERATE-INTERVALS" );
    $list20 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes-InsType" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes-InsType" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ),
      makeKeyword( "COST" ), makeSymbol( "REMOVAL-TEMPORALLY-SUBSUMED-INSTYPE-GENERATE-INTERVALS-COST" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
          constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes-InsType" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TYPE" ) ) ), ConsesLow.list(
              makeKeyword( "VALUE" ), makeSymbol( "TYPE" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "INFERENCE-TEMPORALLY-SUBSUMED-INSTYPE-GENERATE-INTERVALS" ),
                  makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes-InsType" ) ), makeKeyword( "INPUT" ),
                      ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TYPE" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ), makeString(
                          "(#$temporallySubsumes-InsType ?WHAT TYPE)" ), makeKeyword( "EXAMPLE" ), makeString(
                              "(#$temporallySubsumes-InsType ?WHAT #$CalendarDay) ->\n    #$TheYear2000, (#$DayFn 4 (#$MonthFn #$July (#$YearFn 1776))), etc" )
    } );
    $const21$temporallySubsumedBy_InsType = constant_handles.reader_make_constant_shell( makeString( "temporallySubsumedBy-InsType" ) );
    $kw22$POS = makeKeyword( "POS" );
    $kw23$REMOVAL_TEMPORALLY_SUBSUMED_BY_INSTYPE_CHECK = makeKeyword( "REMOVAL-TEMPORALLY-SUBSUMED-BY-INSTYPE-CHECK" );
    $list24 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallySubsumedBy-InsType" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallySubsumedBy-InsType" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ),
      makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-TEMPORALLY-SUBSUMED-BY-INSTYPE-CHECK-COST*" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
          constant_handles.reader_make_constant_shell( makeString( "temporallySubsumedBy-InsType" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "INTERVAL" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol(
              "TYPE" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "INTERVAL" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TYPE" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ),
      ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "INTERVAL" ), makeSymbol( "TYPE" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "TIME-INTERVAL-SUBSUMED-BY-TYPE?" ), ConsesLow.list(
          makeKeyword( "VALUE" ), makeSymbol( "INTERVAL" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TYPE" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ),
      makeString( "(#$temporallySubsumedBy-InsType INTERVAL TYPE)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$temporallySubsumedBy-InsType #$TheYear2000 #$CalendarYear)" )
    } );
    $const25$Null_TimeParameter = constant_handles.reader_make_constant_shell( makeString( "Null-TimeParameter" ) );
    $const26$TimePoint = constant_handles.reader_make_constant_shell( makeString( "TimePoint" ) );
    $list27 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimePoint" ) ) );
    $list28 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Null-TimeParameter" ) ) );
    $const29$temporallySubsumes_TypeType = constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes-TypeType" ) );
    $kw30$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $sym31$_TIME_POINT_SUBSUMED_RULE_ = makeSymbol( "*TIME-POINT-SUBSUMED-RULE*" );
    $sym32$_TIME_POINT_SUBSUMED_RULE__INITIALIZER = makeSymbol( "*TIME-POINT-SUBSUMED-RULE*-INITIALIZER" );
    $list33 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "TimeParameter" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
            makeString( "different" ) ), constant_handles.reader_make_constant_shell( makeString( "TimePoint" ) ), makeSymbol( "?X" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                "temporallySubsumes-TypeType" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "TimePoint" ) ) ) );
    $sym34$_NULL_PARAM_SUBSUMES_RULE_ = makeSymbol( "*NULL-PARAM-SUBSUMES-RULE*" );
    $sym35$_NULL_PARAM_SUBSUMES_RULE__INITIALIZER = makeSymbol( "*NULL-PARAM-SUBSUMES-RULE*-INITIALIZER" );
    $list36 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "TimeParameter" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
            makeString( "different" ) ), constant_handles.reader_make_constant_shell( makeString( "Null-TimeParameter" ) ), makeSymbol( "?X" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                "temporallySubsumes-TypeType" ) ), constant_handles.reader_make_constant_shell( makeString( "Null-TimeParameter" ) ), makeSymbol( "?X" ) ) );
    $sym37$_TEMPORALLY_SUBSUMES_TYPETYPE_REFLEXIVE_RULE_ = makeSymbol( "*TEMPORALLY-SUBSUMES-TYPETYPE-REFLEXIVE-RULE*" );
    $sym38$_TEMPORALLY_SUBSUMES_TYPETYPE_REFLEXIVE_RULE__INITIALIZER = makeSymbol( "*TEMPORALLY-SUBSUMES-TYPETYPE-REFLEXIVE-RULE*-INITIALIZER" );
    $list39 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes-TypeType" ) ), constant_handles
        .reader_make_constant_shell( makeString( "ReflexiveBinaryPredicate" ) ) );
    $sym40$_RAE_DEFINING_TEMPORALLY_SUBSUMES_TYPETYPE_RULE_ = makeSymbol( "*RAE-DEFINING-TEMPORALLY-SUBSUMES-TYPETYPE-RULE*" );
    $sym41$_RAE_DEFINING_TEMPORALLY_SUBSUMES_TYPETYPE_RULE__INITIALIZER = makeSymbol( "*RAE-DEFINING-TEMPORALLY-SUBSUMES-TYPETYPE-RULE*-INITIALIZER" );
    $list42 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "relationAllExists" ) ), constant_handles
        .reader_make_constant_shell( makeString( "temporallySubsumes" ) ), makeSymbol( "?LONGER-TYPE" ), makeSymbol( "?SHORTER-TYPE" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
            "temporallySubsumes-TypeType" ) ), makeSymbol( "?LONGER-TYPE" ), makeSymbol( "?SHORTER-TYPE" ) ) );
    $sym43$_TEMPORAL_SUBSUMPTION_OF_SLIDING_TYPES_RULE_ = makeSymbol( "*TEMPORAL-SUBSUMPTION-OF-SLIDING-TYPES-RULE*" );
    $sym44$_TEMPORAL_SUBSUMPTION_OF_SLIDING_TYPES_RULE__INITIALIZER = makeSymbol( "*TEMPORAL-SUBSUMPTION-OF-SLIDING-TYPES-RULE*-INITIALIZER" );
    $list45 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?INT1" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SameLengthTimeIntervalTypeFn" ) ), makeSymbol( "?DUR1" ) ) ),
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?INT2" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
            "SameLengthTimeIntervalTypeFn" ) ), makeSymbol( "?DUR2" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "lessThanOrEqualTo" ) ), makeSymbol( "?DUR1" ), makeSymbol(
                "?DUR2" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes" ) ), makeSymbol( "?INT2" ), makeSymbol( "?INT1" ) ) );
    $sym46$_PERIOD_PLUS_DURATION_SUBSUMES_GAPPY_TYPE_ = makeSymbol( "*PERIOD-PLUS-DURATION-SUBSUMES-GAPPY-TYPE*" );
    $sym47$_PERIOD_PLUS_DURATION_SUBSUMES_GAPPY_TYPE__INITIALIZER = makeSymbol( "*PERIOD-PLUS-DURATION-SUBSUMES-GAPPY-TYPE*-INITIALIZER" );
    $list48 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?TYPE" ), constant_handles.reader_make_constant_shell( makeString( "ConventionallyClassifiedTimeIntervalSeries-DisjointWithGaps" ) ) ), ConsesLow
            .list( constant_handles.reader_make_constant_shell( makeString( "periodOfTimeIntervalSeries" ) ), makeSymbol( "?TYPE" ), makeSymbol( "?DURATION1" ) ), ConsesLow.list( constant_handles
                .reader_make_constant_shell( makeString( "durationOfType" ) ), makeSymbol( "?TYPE" ), makeSymbol( "?DURATION2" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                    "temporallySubsumes-TypeType" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SameLengthTimeIntervalTypeFn" ) ), ConsesLow.list( constant_handles
                        .reader_make_constant_shell( makeString( "PlusFn" ) ), makeSymbol( "?DURATION1" ), makeSymbol( "?DURATION2" ) ) ), makeSymbol( "?TYPE" ) ) );
    $kw49$TRANSITIVITY = makeKeyword( "TRANSITIVITY" );
    $const50$UniversalVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) );
    $kw51$EVAL = makeKeyword( "EVAL" );
    $const52$lessThanOrEqualTo = constant_handles.reader_make_constant_shell( makeString( "lessThanOrEqualTo" ) );
    $const53$evaluate = constant_handles.reader_make_constant_shell( makeString( "evaluate" ) );
    $const54$QuotientFn = constant_handles.reader_make_constant_shell( makeString( "QuotientFn" ) );
    $list55 = ConsesLow.list( ONE_INTEGER );
    $const56$TimesFn = constant_handles.reader_make_constant_shell( makeString( "TimesFn" ) );
    $sym57$FIRST_PARAMETER__PREVIOUS_SLIDING_TYPE = makeSymbol( "FIRST-PARAMETER>=PREVIOUS-SLIDING-TYPE" );
    $kw58$TIME = makeKeyword( "TIME" );
    $kw59$ISA = makeKeyword( "ISA" );
    $const60$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $list61 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ConventionallyClassifiedTimeIntervalSeries-DisjointWithGaps" ) ) );
    $kw62$QUERY = makeKeyword( "QUERY" );
    $const63$periodOfTimeIntervalSeries = constant_handles.reader_make_constant_shell( makeString( "periodOfTimeIntervalSeries" ) );
    $const64$durationOfType = constant_handles.reader_make_constant_shell( makeString( "durationOfType" ) );
    $const65$PlusFn = constant_handles.reader_make_constant_shell( makeString( "PlusFn" ) );
    $sym66$FIRST_PARAMETER__PREVIOUS_SLIDING_TYPE = makeSymbol( "FIRST-PARAMETER<=PREVIOUS-SLIDING-TYPE" );
    $sym67$_ALWAYS_SUBSUMES_EVERYTHING_SUPPORT_ = makeSymbol( "*ALWAYS-SUBSUMES-EVERYTHING-SUPPORT*" );
    $sym68$_ALWAYS_SUBSUMES_EVERYTHING_SUPPORT__INITIALIZER = makeSymbol( "*ALWAYS-SUBSUMES-EVERYTHING-SUPPORT*-INITIALIZER" );
    $list69 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "relationInstanceAll" ) ), constant_handles.reader_make_constant_shell( makeString( "timeSlices" ) ), constant_handles
        .reader_make_constant_shell( makeString( "Always-TimeInterval" ) ), constant_handles.reader_make_constant_shell( makeString( "TimeInterval" ) ) );
    $sym70$_TIME_POINT_SUBSUMED_BY_EVERYTHING_SUPPORT_ = makeSymbol( "*TIME-POINT-SUBSUMED-BY-EVERYTHING-SUPPORT*" );
    $sym71$_TIME_POINT_SUBSUMED_BY_EVERYTHING_SUPPORT__INITIALIZER = makeSymbol( "*TIME-POINT-SUBSUMED-BY-EVERYTHING-SUPPORT*-INITIALIZER" );
    $list72 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "relationAllInstance" ) ), constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes" ) ), constant_handles
        .reader_make_constant_shell( makeString( "TimeInterval" ) ), constant_handles.reader_make_constant_shell( makeString( "TimePoint" ) ) );
    $sym73$_COORIGINATING_INTERVAL_OF_LESSER_DURATION_IS_SUBSUMED_SUPPORT_ = makeSymbol( "*COORIGINATING-INTERVAL-OF-LESSER-DURATION-IS-SUBSUMED-SUPPORT*" );
    $sym74$_COORIGINATING_INTERVAL_OF_LESSER_DURATION_IS_SUBSUMED_SUPPORT__I = makeSymbol( "*COORIGINATING-INTERVAL-OF-LESSER-DURATION-IS-SUBSUMED-SUPPORT*-INITIALIZER" );
    $list75 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?INTERVAL1" ), constant_handles.reader_make_constant_shell( makeString( "TimeInterval" ) ) ), ConsesLow.list( constant_handles
            .reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?INTERVAL2" ), constant_handles.reader_make_constant_shell( makeString( "TimeInterval" ) ) ), ConsesLow.list( constant_handles
                .reader_make_constant_shell( makeString( "duration" ) ), makeSymbol( "?INTERVAL1" ), makeSymbol( "?DUR1" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "duration" ) ),
                    makeSymbol( "?INTERVAL2" ), makeSymbol( "?DUR2" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "lessThanOrEqualTo" ) ), makeSymbol( "?DUR2" ), makeSymbol( "?DUR1" ) ),
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyCooriginating" ) ), makeSymbol( "?INTERVAL1" ), makeSymbol( "?INTERVAL2" ) ) ), ConsesLow.list( constant_handles
            .reader_make_constant_shell( makeString( "temporallySubsumes" ) ), makeSymbol( "?INTERVAL1" ), makeSymbol( "?INTERVAL2" ) ) );
    $const76$Always_TimeInterval = constant_handles.reader_make_constant_shell( makeString( "Always-TimeInterval" ) );
    $const77$temporallySubsumes = constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes" ) );
    $kw78$OPAQUE = makeKeyword( "OPAQUE" );
    $const79$duration = constant_handles.reader_make_constant_shell( makeString( "duration" ) );
    $const80$thereExists = constant_handles.reader_make_constant_shell( makeString( "thereExists" ) );
    $sym81$_INTERVAL = makeSymbol( "?INTERVAL" );
    $const82$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $const83$temporallyCooriginating = constant_handles.reader_make_constant_shell( makeString( "temporallyCooriginating" ) );
    $kw84$DEPTH_FIRST = makeKeyword( "DEPTH-FIRST" );
    $const85$temporallySubsumes_InsType = constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes-InsType" ) );
  }
}
/*
 * 
 * Total time: 220 ms
 * 
 */