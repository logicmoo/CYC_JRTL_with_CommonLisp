package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.czer_meta;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.arithmetic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.time_interval_utilities;
import com.cyc.cycjava.cycl.time_parameter_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_date_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_date_utilities";
  public static final String myFingerPrint = "bb07720054526272bd4ee00e6a53001ac6f24bdcac5f9b2b31c4199ad6836830";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-date-utilities.lisp", position = 1272L)
  private static SubLSymbol $default_year_of_date_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-date-utilities.lisp", position = 5115L)
  private static SubLSymbol $default_month_of_date_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-date-utilities.lisp", position = 9050L)
  private static SubLSymbol $default_day_number_of_date_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-date-utilities.lisp", position = 13113L)
  private static SubLSymbol $default_hour_number_of_date_check_cost$;
  private static final SubLObject $const0$yearOfDate;
  private static final SubLSymbol $kw1$POS;
  private static final SubLSymbol $kw2$NEG;
  private static final SubLSymbol $kw3$REMOVAL_YEAR_OF_DATE_CHECK_POS;
  private static final SubLList $list4;
  private static final SubLSymbol $kw5$REMOVAL_YEAR_OF_DATE_CHECK_NEG;
  private static final SubLList $list6;
  private static final SubLSymbol $kw7$REMOVAL_YEAR_OF_DATE_UNIFY;
  private static final SubLList $list8;
  private static final SubLObject $const9$monthOfDate;
  private static final SubLSymbol $kw10$REMOVAL_MONTH_OF_DATE_CHECK_POS;
  private static final SubLList $list11;
  private static final SubLSymbol $kw12$REMOVAL_MONTH_OF_DATE_CHECK_NEG;
  private static final SubLList $list13;
  private static final SubLSymbol $kw14$REMOVAL_MONTH_OF_DATE_UNIFY;
  private static final SubLList $list15;
  private static final SubLObject $const16$dayNumberOfDate;
  private static final SubLSymbol $kw17$REMOVAL_DAY_NUMBER_OF_DATE_CHECK_POS;
  private static final SubLList $list18;
  private static final SubLSymbol $kw19$REMOVAL_DAY_NUMBER_OF_DATE_CHECK_NEG;
  private static final SubLList $list20;
  private static final SubLSymbol $kw21$REMOVAL_DAY_NUMBER_OF_DATE_UNIFY;
  private static final SubLList $list22;
  private static final SubLObject $const23$hourNumberOfDate;
  private static final SubLSymbol $kw24$REMOVAL_HOUR_NUMBER_OF_DATE_CHECK_POS;
  private static final SubLList $list25;
  private static final SubLSymbol $kw26$REMOVAL_HOUR_NUMBER_OF_DATE_CHECK_NEG;
  private static final SubLList $list27;
  private static final SubLSymbol $kw28$REMOVAL_HOUR_NUMBER_OF_DATE_UNIFY;
  private static final SubLList $list29;
  private static final SubLSymbol $kw30$REMOVAL_DATE_INTERVALS_INTERSECT_CHECK;
  private static final SubLList $list31;
  private static final SubLSymbol $kw32$REMOVAL_DATE_INTERVAL_SUBSUMES_CHECK;
  private static final SubLList $list33;
  private static final SubLSymbol $kw34$REMOVAL_DATE_INTERVAL_DURATION_UNIFY;
  private static final SubLList $list35;
  private static final SubLSymbol $kw36$REMOVAL_DATE_INTERVAL_DURATION_CHECK;
  private static final SubLList $list37;
  private static final SubLSymbol $kw38$UNEVALUATABLE;
  private static final SubLSymbol $kw39$REMOVAL_DEFINING_TIME_UNIT_CHECK;
  private static final SubLList $list40;
  private static final SubLObject $const41$BaseKB;
  private static final SubLSymbol $kw42$REMOVAL_DEFINING_TIME_UNIT_ARG1_UNIFY;
  private static final SubLList $list43;
  private static final SubLObject $const44$definingTimeUnit;
  private static final SubLSymbol $kw45$REMOVAL_DEFINING_TIME_UNIT_ARG2_UNIFY;
  private static final SubLList $list46;
  private static final SubLObject $const47$latestDateInListBeforeDate;
  private static final SubLSymbol $kw48$REMOVAL_LATEST_DATE_IN_LIST_BEFORE_DATE;
  private static final SubLList $list49;
  private static final SubLSymbol $kw50$DATE_LIST_ARG_IS_NOT_AN_EL_LIST;
  private static final SubLSymbol $kw51$LIMIT_DATE_ARG_IS_NOT_A_DATE;
  private static final SubLSymbol $kw52$OPAQUE;
  private static final SubLObject $const53$startingDate_Precise;
  private static final SubLSymbol $kw54$REMOVAL_STARTING_DATE_PRECISE;
  private static final SubLList $list55;
  private static final SubLObject $const56$EverythingPSC;
  private static final SubLObject $const57$startingDate;
  private static final SubLObject $const58$temporallySubsumes;
  private static final SubLObject $const59$endingDate_Precise;
  private static final SubLSymbol $kw60$REMOVAL_ENDING_DATE_PRECISE;
  private static final SubLList $list61;
  private static final SubLObject $const62$endingDate;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-date-utilities.lisp", position = 881L)
  public static SubLObject inference_extract_date_year(SubLObject date)
  {
    date = date_utilities.possibly_bind_temporal_indexical_in_object( date );
    return ( NIL != date_utilities.date_p( date ) ) ? date_utilities.extract_date_year( date ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-date-utilities.lisp", position = 1058L)
  public static SubLObject year_of_dateP(final SubLObject year, final SubLObject date)
  {
    final SubLObject extracted_year = inference_extract_date_year( date );
    if( year.eql( extracted_year ) )
    {
      return extracted_year;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-date-utilities.lisp", position = 4711L)
  public static SubLObject inference_extract_date_month(SubLObject date)
  {
    date = date_utilities.possibly_bind_temporal_indexical_in_object( date );
    return ( NIL != date_utilities.date_p( date ) ) ? date_utilities.extract_date_month( date ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-date-utilities.lisp", position = 4890L)
  public static SubLObject month_of_dateP(final SubLObject month, final SubLObject date)
  {
    final SubLObject extracted_month = inference_extract_date_month( date );
    if( month.equal( extracted_month ) )
    {
      return extracted_month;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-date-utilities.lisp", position = 8614L)
  public static SubLObject inference_extract_date_day(SubLObject date)
  {
    date = date_utilities.possibly_bind_temporal_indexical_in_object( date );
    return ( NIL != date_utilities.date_p( date ) ) ? date_utilities.extract_date_day( date ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-date-utilities.lisp", position = 8789L)
  public static SubLObject day_number_of_dateP(final SubLObject day_number, final SubLObject date)
  {
    final SubLObject extracted_day_number = inference_extract_date_day( date );
    if( day_number.eql( extracted_day_number ) )
    {
      return extracted_day_number;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-date-utilities.lisp", position = 12713L)
  public static SubLObject inference_extract_date_hour(SubLObject date)
  {
    date = date_utilities.possibly_bind_temporal_indexical_in_object( date );
    return ( NIL != date_utilities.date_p( date ) ) ? date_utilities.extract_date_hour( date ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-date-utilities.lisp", position = 12890L)
  public static SubLObject hour_number_of_dateP(final SubLObject hour, final SubLObject date)
  {
    final SubLObject extracted_hour = inference_extract_date_hour( date );
    if( hour.equal( extracted_hour ) )
    {
      return extracted_hour;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-date-utilities.lisp", position = 20307L)
  public static SubLObject inference_date_interval_duration(final SubLObject date, SubLObject not_fully_bound)
  {
    if( not_fully_bound == UNPROVIDED )
    {
      not_fully_bound = NIL;
    }
    SubLObject precision = NIL;
    if( NIL != el_utilities.possibly_naut_p( not_fully_bound ) )
    {
      final SubLObject operator = cycl_utilities.formula_operator( not_fully_bound );
      if( NIL != time_parameter_utilities.duration_function_p( operator ) )
      {
        precision = operator;
      }
    }
    return time_interval_utilities.date_interval_duration( date, precision );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-date-utilities.lisp", position = 21614L)
  public static SubLObject inference_date_interval_durationP(final SubLObject interval, final SubLObject duration)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject durationP = NIL;
    SubLObject catch_this = NIL;
    try
    {
      thread.throwStack.push( $kw38$UNEVALUATABLE );
      durationP = arithmetic.cyc_numerically_equal( time_interval_utilities.date_interval_duration( interval, time_parameter_utilities.duration_precision( duration ) ), duration );
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_this = Errors.handleThrowable( ccatch_env_var, $kw38$UNEVALUATABLE );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return durationP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-date-utilities.lisp", position = 22758L)
  public static SubLObject inference_defining_time_unit_check(final SubLObject type, final SubLObject unit)
  {
    return Equality.eql( unit, date_utilities.inference_defining_time_unit( type ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-date-utilities.lisp", position = 22880L)
  public static SubLObject make_defining_time_unit_support(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return czer_meta.find_assertion_cycl( asent, $const41$BaseKB );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-date-utilities.lisp", position = 23968L)
  public static SubLObject inference_defining_time_unit_arg1_unify(final SubLObject unit)
  {
    return kb_mapping_utilities.fpred_value_in_any_mt( unit, $const44$definingTimeUnit, TWO_INTEGER, ONE_INTEGER, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-date-utilities.lisp", position = 25044L)
  public static SubLObject inference_defining_time_unit_arg2_unify(final SubLObject type)
  {
    return date_utilities.inference_defining_time_unit( type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-date-utilities.lisp", position = 26375L)
  public static SubLObject removal_latest_date_in_list_before_date_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject date_var_arg = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject date_list_arg = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject limit_date_arg = cycl_utilities.atomic_sentence_arg3( asent, UNPROVIDED );
    if( NIL == el_utilities.el_list_p( date_list_arg ) )
    {
      return Values.values( NIL, $kw50$DATE_LIST_ARG_IS_NOT_AN_EL_LIST );
    }
    if( NIL == date_utilities.date_p( limit_date_arg ) )
    {
      return Values.values( $kw51$LIMIT_DATE_ARG_IS_NOT_A_DATE );
    }
    final SubLObject date_list_items = el_utilities.el_list_items( date_list_arg );
    SubLObject latest_date_before_date = NIL;
    SubLObject cdolist_list_var = date_list_items;
    SubLObject date_item = NIL;
    date_item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != date_utilities.dateLE( date_utilities.cycl_date_initial_second( date_item ), date_utilities.cycl_date_initial_second( limit_date_arg ) ) && ( NIL == latest_date_before_date || NIL != date_utilities
          .dateGE( date_utilities.cycl_date_initial_second( date_item ), date_utilities.cycl_date_initial_second( limit_date_arg ) ) ) )
      {
        latest_date_before_date = date_item;
      }
      cdolist_list_var = cdolist_list_var.rest();
      date_item = cdolist_list_var.first();
    }
    if( NIL != latest_date_before_date )
    {
      final SubLObject v_bindings = unification_utilities.term_unify( date_var_arg, latest_date_before_date, UNPROVIDED, UNPROVIDED );
      if( NIL != v_bindings )
      {
        backward.removal_add_node( arguments.make_hl_support( $kw52$OPAQUE, bindings.apply_bindings( v_bindings, asent ), UNPROVIDED, UNPROVIDED ), v_bindings, UNPROVIDED );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-date-utilities.lisp", position = 28159L)
  public static SubLObject removal_starting_date_precise(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject thing = cycl_utilities.formula_arg1( asent, UNPROVIDED );
    final SubLObject var = cycl_utilities.formula_arg2( asent, UNPROVIDED );
    SubLObject assertions = NIL;
    final SubLObject mt_name = mt_relevance_macros.$mt$.getDynamicValue( thread );
    if( mt_name.eql( $const56$EverythingPSC ) )
    {
      assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt( thing, $const57$startingDate, ONE_INTEGER, UNPROVIDED );
    }
    else
    {
      assertions = kb_mapping_utilities.pred_value_gafs_in_mt( thing, $const57$startingDate, mt_name, UNPROVIDED, UNPROVIDED );
    }
    if( NIL == assertions )
    {
      return NIL;
    }
    if( Sequences.length( assertions ).numE( ONE_INTEGER ) )
    {
      final SubLObject assertion = cycl_utilities.formula_arg0( assertions );
      final SubLObject v_answer = cycl_utilities.formula_arg2( assertions_high.gaf_formula( assertion ), UNPROVIDED );
      final SubLObject v_bindings = unification_utilities.term_unify( var, v_answer, UNPROVIDED, UNPROVIDED );
      if( NIL != v_answer )
      {
        backward.removal_add_node( assertions.first(), v_bindings, NIL );
      }
    }
    final SubLObject most_precise_assertion = find_most_precise_date( assertions );
    if( NIL != most_precise_assertion )
    {
      final SubLObject v_answer = cycl_utilities.formula_arg2( assertions_high.gaf_formula( most_precise_assertion ), UNPROVIDED );
      final SubLObject v_bindings = unification_utilities.term_unify( var, v_answer, UNPROVIDED, UNPROVIDED );
      if( NIL != v_answer )
      {
        backward.removal_add_node( assertions.first(), v_bindings, assertions.rest() );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-date-utilities.lisp", position = 29224L)
  public static SubLObject find_most_precise_date(final SubLObject lst_of_assertions)
  {
    SubLObject current_best_assertion = cycl_utilities.formula_arg0( lst_of_assertions );
    SubLObject cdolist_list_var = cycl_utilities.formula_args( lst_of_assertions, UNPROVIDED );
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject date = cycl_utilities.formula_arg2( assertions_high.gaf_formula( assertion ), UNPROVIDED );
      final SubLObject current_best_date = cycl_utilities.formula_arg2( assertions_high.gaf_formula( assertion ), UNPROVIDED );
      if( !current_best_date.equal( date ) && NIL != sbhl_time_query_processing.true_temporal_relation_literalP( $const58$temporallySubsumes, current_best_date, date, $kw1$POS, $const41$BaseKB ) )
      {
        current_best_assertion = assertion;
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return current_best_assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-date-utilities.lisp", position = 30442L)
  public static SubLObject removal_ending_date_precise(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject thing = cycl_utilities.formula_arg1( asent, UNPROVIDED );
    final SubLObject var = cycl_utilities.formula_arg2( asent, UNPROVIDED );
    SubLObject assertions = NIL;
    final SubLObject mt_name = mt_relevance_macros.$mt$.getDynamicValue( thread );
    if( mt_name.eql( $const56$EverythingPSC ) )
    {
      assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt( thing, $const62$endingDate, ONE_INTEGER, UNPROVIDED );
    }
    else
    {
      assertions = kb_mapping_utilities.pred_value_gafs_in_mt( thing, $const62$endingDate, mt_name, UNPROVIDED, UNPROVIDED );
    }
    if( NIL == assertions )
    {
      return NIL;
    }
    if( Sequences.length( assertions ).numE( ONE_INTEGER ) )
    {
      final SubLObject assertion = cycl_utilities.formula_arg0( assertions );
      final SubLObject v_answer = cycl_utilities.formula_arg2( assertions_high.gaf_formula( assertion ), UNPROVIDED );
      final SubLObject v_bindings = unification_utilities.term_unify( var, v_answer, UNPROVIDED, UNPROVIDED );
      if( NIL != v_answer )
      {
        backward.removal_add_node( assertions.first(), v_bindings, NIL );
      }
    }
    final SubLObject most_precise_assertion = find_most_precise_date( assertions );
    if( NIL != most_precise_assertion )
    {
      final SubLObject v_answer = cycl_utilities.formula_arg2( assertions_high.gaf_formula( most_precise_assertion ), UNPROVIDED );
      final SubLObject v_bindings = unification_utilities.term_unify( var, v_answer, UNPROVIDED, UNPROVIDED );
      if( NIL != v_answer )
      {
        backward.removal_add_node( assertions.first(), v_bindings, assertions.rest() );
      }
    }
    return NIL;
  }

  public static SubLObject declare_removal_modules_date_utilities_file()
  {
    SubLFiles.declareFunction( me, "inference_extract_date_year", "INFERENCE-EXTRACT-DATE-YEAR", 1, 0, false );
    SubLFiles.declareFunction( me, "year_of_dateP", "YEAR-OF-DATE?", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_extract_date_month", "INFERENCE-EXTRACT-DATE-MONTH", 1, 0, false );
    SubLFiles.declareFunction( me, "month_of_dateP", "MONTH-OF-DATE?", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_extract_date_day", "INFERENCE-EXTRACT-DATE-DAY", 1, 0, false );
    SubLFiles.declareFunction( me, "day_number_of_dateP", "DAY-NUMBER-OF-DATE?", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_extract_date_hour", "INFERENCE-EXTRACT-DATE-HOUR", 1, 0, false );
    SubLFiles.declareFunction( me, "hour_number_of_dateP", "HOUR-NUMBER-OF-DATE?", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_date_interval_duration", "INFERENCE-DATE-INTERVAL-DURATION", 1, 1, false );
    SubLFiles.declareFunction( me, "inference_date_interval_durationP", "INFERENCE-DATE-INTERVAL-DURATION?", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_defining_time_unit_check", "INFERENCE-DEFINING-TIME-UNIT-CHECK", 2, 0, false );
    SubLFiles.declareFunction( me, "make_defining_time_unit_support", "MAKE-DEFINING-TIME-UNIT-SUPPORT", 1, 1, false );
    SubLFiles.declareFunction( me, "inference_defining_time_unit_arg1_unify", "INFERENCE-DEFINING-TIME-UNIT-ARG1-UNIFY", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_defining_time_unit_arg2_unify", "INFERENCE-DEFINING-TIME-UNIT-ARG2-UNIFY", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_latest_date_in_list_before_date_expand", "REMOVAL-LATEST-DATE-IN-LIST-BEFORE-DATE-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_starting_date_precise", "REMOVAL-STARTING-DATE-PRECISE", 1, 1, false );
    SubLFiles.declareFunction( me, "find_most_precise_date", "FIND-MOST-PRECISE-DATE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_ending_date_precise", "REMOVAL-ENDING-DATE-PRECISE", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_date_utilities_file()
  {
    $default_year_of_date_check_cost$ = SubLFiles.defparameter( "*DEFAULT-YEAR-OF-DATE-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue() );
    $default_month_of_date_check_cost$ = SubLFiles.defparameter( "*DEFAULT-MONTH-OF-DATE-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue() );
    $default_day_number_of_date_check_cost$ = SubLFiles.defparameter( "*DEFAULT-DAY-NUMBER-OF-DATE-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue() );
    $default_hour_number_of_date_check_cost$ = SubLFiles.defparameter( "*DEFAULT-HOUR-NUMBER-OF-DATE-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue() );
    return NIL;
  }

  public static SubLObject setup_removal_modules_date_utilities_file()
  {
    inference_modules.register_solely_specific_removal_module_predicate( $const0$yearOfDate );
    preference_modules.doomed_unless_arg_bindable( $kw1$POS, $const0$yearOfDate, TWO_INTEGER );
    preference_modules.doomed_unless_all_args_bindable( $kw2$NEG, $const0$yearOfDate );
    inference_modules.inference_removal_module( $kw3$REMOVAL_YEAR_OF_DATE_CHECK_POS, $list4 );
    inference_modules.inference_removal_module( $kw5$REMOVAL_YEAR_OF_DATE_CHECK_NEG, $list6 );
    inference_modules.inference_removal_module( $kw7$REMOVAL_YEAR_OF_DATE_UNIFY, $list8 );
    inference_modules.register_solely_specific_removal_module_predicate( $const9$monthOfDate );
    inference_modules.inference_removal_module( $kw10$REMOVAL_MONTH_OF_DATE_CHECK_POS, $list11 );
    inference_modules.inference_removal_module( $kw12$REMOVAL_MONTH_OF_DATE_CHECK_NEG, $list13 );
    inference_modules.inference_removal_module( $kw14$REMOVAL_MONTH_OF_DATE_UNIFY, $list15 );
    inference_modules.register_solely_specific_removal_module_predicate( $const16$dayNumberOfDate );
    inference_modules.inference_removal_module( $kw17$REMOVAL_DAY_NUMBER_OF_DATE_CHECK_POS, $list18 );
    inference_modules.inference_removal_module( $kw19$REMOVAL_DAY_NUMBER_OF_DATE_CHECK_NEG, $list20 );
    inference_modules.inference_removal_module( $kw21$REMOVAL_DAY_NUMBER_OF_DATE_UNIFY, $list22 );
    inference_modules.register_solely_specific_removal_module_predicate( $const23$hourNumberOfDate );
    inference_modules.inference_removal_module( $kw24$REMOVAL_HOUR_NUMBER_OF_DATE_CHECK_POS, $list25 );
    inference_modules.inference_removal_module( $kw26$REMOVAL_HOUR_NUMBER_OF_DATE_CHECK_NEG, $list27 );
    inference_modules.inference_removal_module( $kw28$REMOVAL_HOUR_NUMBER_OF_DATE_UNIFY, $list29 );
    inference_modules.inference_removal_module( $kw30$REMOVAL_DATE_INTERVALS_INTERSECT_CHECK, $list31 );
    inference_modules.inference_removal_module( $kw32$REMOVAL_DATE_INTERVAL_SUBSUMES_CHECK, $list33 );
    inference_modules.inference_removal_module( $kw34$REMOVAL_DATE_INTERVAL_DURATION_UNIFY, $list35 );
    inference_modules.inference_removal_module( $kw36$REMOVAL_DATE_INTERVAL_DURATION_CHECK, $list37 );
    inference_modules.inference_removal_module( $kw39$REMOVAL_DEFINING_TIME_UNIT_CHECK, $list40 );
    inference_modules.inference_removal_module( $kw42$REMOVAL_DEFINING_TIME_UNIT_ARG1_UNIFY, $list43 );
    inference_modules.inference_removal_module( $kw45$REMOVAL_DEFINING_TIME_UNIT_ARG2_UNIFY, $list46 );
    inference_modules.register_solely_specific_removal_module_predicate( $const47$latestDateInListBeforeDate );
    preference_modules.doomed_unless_arg_bindable( $kw1$POS, $const47$latestDateInListBeforeDate, TWO_INTEGER );
    preference_modules.doomed_unless_arg_bindable( $kw1$POS, $const47$latestDateInListBeforeDate, THREE_INTEGER );
    inference_modules.inference_removal_module( $kw48$REMOVAL_LATEST_DATE_IN_LIST_BEFORE_DATE, $list49 );
    inference_modules.register_solely_specific_removal_module_predicate( $const53$startingDate_Precise );
    preference_modules.doomed_unless_arg_bindable( $kw1$POS, $const53$startingDate_Precise, ONE_INTEGER );
    inference_modules.inference_removal_module( $kw54$REMOVAL_STARTING_DATE_PRECISE, $list55 );
    inference_modules.register_solely_specific_removal_module_predicate( $const59$endingDate_Precise );
    preference_modules.doomed_unless_arg_bindable( $kw1$POS, $const59$endingDate_Precise, ONE_INTEGER );
    inference_modules.inference_removal_module( $kw60$REMOVAL_ENDING_DATE_PRECISE, $list61 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_date_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_date_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_date_utilities_file();
  }
  static
  {
    me = new removal_modules_date_utilities();
    $default_year_of_date_check_cost$ = null;
    $default_month_of_date_check_cost$ = null;
    $default_day_number_of_date_check_cost$ = null;
    $default_hour_number_of_date_check_cost$ = null;
    $const0$yearOfDate = constant_handles.reader_make_constant_shell( makeString( "yearOfDate" ) );
    $kw1$POS = makeKeyword( "POS" );
    $kw2$NEG = makeKeyword( "NEG" );
    $kw3$REMOVAL_YEAR_OF_DATE_CHECK_POS = makeKeyword( "REMOVAL-YEAR-OF-DATE-CHECK-POS" );
    $list4 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "yearOfDate" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "yearOfDate" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ),
      makeSymbol( "*DEFAULT-YEAR-OF-DATE-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
          constant_handles.reader_make_constant_shell( makeString( "yearOfDate" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "YEAR" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "DATE" ) ) ),
          ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "YEAR" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list(
              makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "YEAR" ), makeSymbol( "DATE" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "YEAR-OF-DATE?" ), ConsesLow.list( makeKeyword( "VALUE" ),
                  makeSymbol( "YEAR" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE" ) ) ) ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$yearOfDate <year> <fully-bound-p>)" ), makeKeyword(
                      "EXAMPLE" ), makeString(
                          "(#$yearOfDate 2003 (#$SecondFn 54 \n                         (#$MinuteFn 48 \n                          (#$HourFn 10 \n                           (#$DayFn 28 \n                            (#$MonthFn #$August \n                             (#$YearFn 2003)))))))" )
    } );
    $kw5$REMOVAL_YEAR_OF_DATE_CHECK_NEG = makeKeyword( "REMOVAL-YEAR-OF-DATE-CHECK-NEG" );
    $list6 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "yearOfDate" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "yearOfDate" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ),
      makeSymbol( "*DEFAULT-YEAR-OF-DATE-CHECK-COST*" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
          "yearOfDate" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "YEAR" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "DATE" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ),
              makeSymbol( "YEAR" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol(
                  "YEAR" ), makeSymbol( "DATE" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "INVERT-BOOLEAN-ANSWER" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "YEAR-OF-DATE?" ), ConsesLow.list(
                      makeKeyword( "VALUE" ), makeSymbol( "YEAR" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE" ) ) ) ) ), makeKeyword( "DOCUMENTATION" ), makeString(
                          "(#$not (#$yearOfDate <year> <fully-bound-p>))" ), makeKeyword( "EXAMPLE" ), makeString(
                              "(#$not #$yearOfDate 1970 (#$SecondFn 54 \n                               (#$MinuteFn 48 \n                                 (#$HourFn 10 \n                                   (#$DayFn 28 \n                                     (#$MonthFn #$August \n                                       (#$YearFn 2003)))))))" )
    } );
    $kw7$REMOVAL_YEAR_OF_DATE_UNIFY = makeKeyword( "REMOVAL-YEAR-OF-DATE-UNIFY" );
    $list8 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "yearOfDate" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "yearOfDate" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ),
      makeSymbol( "*DEFAULT-YEAR-OF-DATE-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
          constant_handles.reader_make_constant_shell( makeString( "yearOfDate" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "DATE" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ),
              makeSymbol( "DATE" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                  "INFERENCE-EXTRACT-DATE-YEAR" ), makeKeyword( "INPUT" ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "yearOfDate" ) ),
                      makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE" ) ) ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$yearOfDate <not-fully-bound> <fully-bound>)" ), makeKeyword(
                          "EXAMPLE" ), makeString(
                              "(#$yearOfDate ?YEAR \n                        (#$SecondFn 54 \n                         (#$MinuteFn 48 \n                          (#$HourFn 10 \n                           (#$DayFn 28 \n                            (#$MonthFn #$August \n                             (#$YearFn 2003)))))))" )
    } );
    $const9$monthOfDate = constant_handles.reader_make_constant_shell( makeString( "monthOfDate" ) );
    $kw10$REMOVAL_MONTH_OF_DATE_CHECK_POS = makeKeyword( "REMOVAL-MONTH-OF-DATE-CHECK-POS" );
    $list11 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "monthOfDate" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "monthOfDate" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ),
      makeSymbol( "*DEFAULT-MONTH-OF-DATE-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
          constant_handles.reader_make_constant_shell( makeString( "monthOfDate" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "MONTH" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "DATE" ) ) ),
          ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "MONTH" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list(
              makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "MONTH" ), makeSymbol( "DATE" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "MONTH-OF-DATE?" ), ConsesLow.list( makeKeyword( "VALUE" ),
                  makeSymbol( "MONTH" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE" ) ) ) ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$monthOfDate <month> <fully-bound-p>)" ), makeKeyword(
                      "EXAMPLE" ), makeString(
                          "(#$monthOfDate #$August (#$SecondFn 54 \n                         (#$MinuteFn 48 \n                          (#$HourFn 10 \n                           (#$DayFn 28 \n                            (#$MonthFn #$August \n                             (#$YearFn 2003)))))))" )
    } );
    $kw12$REMOVAL_MONTH_OF_DATE_CHECK_NEG = makeKeyword( "REMOVAL-MONTH-OF-DATE-CHECK-NEG" );
    $list13 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "monthOfDate" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "monthOfDate" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ),
      makeSymbol( "*DEFAULT-MONTH-OF-DATE-CHECK-COST*" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
          "monthOfDate" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "MONTH" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "DATE" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ),
              makeSymbol( "MONTH" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol(
                  "MONTH" ), makeSymbol( "DATE" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "INVERT-BOOLEAN-ANSWER" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "MONTH-OF-DATE?" ), ConsesLow.list(
                      makeKeyword( "VALUE" ), makeSymbol( "MONTH" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE" ) ) ) ) ), makeKeyword( "DOCUMENTATION" ), makeString(
                          "(#$not (#$monthOfDate <month> <fully-bound-p>))" ), makeKeyword( "EXAMPLE" ), makeString(
                              "(#$not #$monthOfDate #$February (#$SecondFn 54 \n                                     (#$MinuteFn 48 \n                                      (#$HourFn 10 \n                                       (#$DayFn 28 \n                                        (#$MonthFn August \n                                         (#$YearFn 2003)))))))" )
    } );
    $kw14$REMOVAL_MONTH_OF_DATE_UNIFY = makeKeyword( "REMOVAL-MONTH-OF-DATE-UNIFY" );
    $list15 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "monthOfDate" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "monthOfDate" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword(
            "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-MONTH-OF-DATE-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword(
                "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "monthOfDate" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "DATE" ) ) ),
                ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow
                    .list( makeKeyword( "CALL" ), makeSymbol( "INFERENCE-EXTRACT-DATE-MONTH" ), makeKeyword( "INPUT" ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles
                        .reader_make_constant_shell( makeString( "monthOfDate" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE" ) ) ), makeKeyword( "DOCUMENTATION" ), makeString(
                            "(#$monthOfDate <not-fully-bound> <fully-bound>)" ), makeKeyword( "EXAMPLE" ), makeString(
                                "(#$monthOfDate ?MONTH (#$SecondFn 54 \n                           (#$MinuteFn 48 \n                            (#$HourFn 10 \n                             (#$DayFn 28 \n                              (#$MonthFn August \n                               (#$YearFn 2003)))))))" )
    } );
    $const16$dayNumberOfDate = constant_handles.reader_make_constant_shell( makeString( "dayNumberOfDate" ) );
    $kw17$REMOVAL_DAY_NUMBER_OF_DATE_CHECK_POS = makeKeyword( "REMOVAL-DAY-NUMBER-OF-DATE-CHECK-POS" );
    $list18 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "dayNumberOfDate" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "dayNumberOfDate" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword(
            "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-DAY-NUMBER-OF-DATE-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword(
                "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "dayNumberOfDate" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "DAY-NUMBER" ) ), ConsesLow.list(
                    makeKeyword( "BIND" ), makeSymbol( "DATE" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DAY-NUMBER" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                        "DATE" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "DAY-NUMBER" ), makeSymbol( "DATE" ) ), ConsesLow.list( makeKeyword(
                            "CALL" ), makeSymbol( "DAY-NUMBER-OF-DATE?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DAY-NUMBER" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE" ) ) ) ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(#$dayNumberOfDate <day-number> <fully-bound-p>)" ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$dayNumberOfDate 28 (#$SecondFn 54 \n                           (#$MinuteFn 48 \n                            (#$HourFn 10 \n                             (#$DayFn 28 \n                              (#$MonthFn #$August \n                               (#$YearFn 2003)))))))" )
    } );
    $kw19$REMOVAL_DAY_NUMBER_OF_DATE_CHECK_NEG = makeKeyword( "REMOVAL-DAY-NUMBER-OF-DATE-CHECK-NEG" );
    $list20 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "dayNumberOfDate" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "dayNumberOfDate" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword(
            "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-DAY-NUMBER-OF-DATE-CHECK-COST*" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles
                .reader_make_constant_shell( makeString( "dayNumberOfDate" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "DAY-NUMBER" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "DATE" ) ) ),
                ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DAY-NUMBER" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow
                    .list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "DAY-NUMBER" ), makeSymbol( "DATE" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "INVERT-BOOLEAN-ANSWER" ), ConsesLow.list(
                        makeKeyword( "CALL" ), makeSymbol( "DAY-NUMBER-OF-DATE?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DAY-NUMBER" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                            "DATE" ) ) ) ) ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$not (#$dayNumberOfDate <day-number> <fully-bound-p>))" ), makeKeyword( "EXAMPLE" ), makeString(
                                "(#$not #$dayNumberOfDate 1970 (#$SecondFn 54 \n                               (#$MinuteFn 48 \n                                 (#$HourFn 10 \n                                   (#$DayFn 28 \n                                     (#$MonthFn August \n                                       (#$YearFn 2003)))))))" )
    } );
    $kw21$REMOVAL_DAY_NUMBER_OF_DATE_UNIFY = makeKeyword( "REMOVAL-DAY-NUMBER-OF-DATE-UNIFY" );
    $list22 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "dayNumberOfDate" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "dayNumberOfDate" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword(
            "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-DAY-NUMBER-OF-DATE-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword(
                "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "dayNumberOfDate" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "DATE" ) ) ),
                ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow
                    .list( makeKeyword( "CALL" ), makeSymbol( "INFERENCE-EXTRACT-DATE-DAY" ), makeKeyword( "INPUT" ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles
                        .reader_make_constant_shell( makeString( "dayNumberOfDate" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE" ) ) ), makeKeyword( "DOCUMENTATION" ),
      makeString( "(#$dayNumberOfDate <not-fully-bound> <fully-bound>)" ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$dayNumberOfDate ?DAY-NUMBER\n                        (#$SecondFn 54 \n                         (#$MinuteFn 48 \n                          (#$HourFn 10 \n                           (#$DayFn 28 \n                            (#$MonthFn August \n                             (#$YearFn 2003)))))))" )
    } );
    $const23$hourNumberOfDate = constant_handles.reader_make_constant_shell( makeString( "hourNumberOfDate" ) );
    $kw24$REMOVAL_HOUR_NUMBER_OF_DATE_CHECK_POS = makeKeyword( "REMOVAL-HOUR-NUMBER-OF-DATE-CHECK-POS" );
    $list25 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "hourNumberOfDate" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "hourNumberOfDate" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword(
            "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-HOUR-NUMBER-OF-DATE-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword(
                "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "hourNumberOfDate" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "HOUR-NUMBER" ) ), ConsesLow.list(
                    makeKeyword( "BIND" ), makeSymbol( "DATE" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "HOUR-NUMBER" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                        "DATE" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "HOUR-NUMBER" ), makeSymbol( "DATE" ) ), ConsesLow.list( makeKeyword(
                            "CALL" ), makeSymbol( "HOUR-NUMBER-OF-DATE?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "HOUR-NUMBER" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE" ) ) ) ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(#$hourNumberOfDate <hour-number> <fully-bound-p>)" ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$hourNumberOfDate 28 (#$SecondFn 54 \n                           (#$MinuteFn 48 \n                            (#$HourFn 10 \n                             (#$DayFn 28 \n                              (#$MonthFn #$August \n                               (#$YearFn 2003)))))))" )
    } );
    $kw26$REMOVAL_HOUR_NUMBER_OF_DATE_CHECK_NEG = makeKeyword( "REMOVAL-HOUR-NUMBER-OF-DATE-CHECK-NEG" );
    $list27 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "hourNumberOfDate" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "hourNumberOfDate" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword(
            "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-HOUR-NUMBER-OF-DATE-CHECK-COST*" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles
                .reader_make_constant_shell( makeString( "hourNumberOfDate" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "HOUR-NUMBER" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "DATE" ) ) ),
                ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "HOUR-NUMBER" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow
                    .list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "HOUR-NUMBER" ), makeSymbol( "DATE" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "INVERT-BOOLEAN-ANSWER" ), ConsesLow.list(
                        makeKeyword( "CALL" ), makeSymbol( "HOUR-NUMBER-OF-DATE?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "HOUR-NUMBER" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                            "DATE" ) ) ) ) ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$not (#$hourNumberOfDate <hour-number> <fully-bound-p>))" ), makeKeyword( "EXAMPLE" ), makeString(
                                "(#$not #$hourNumberOfDate 1970 (#$SecondFn 54 \n                               (#$MinuteFn 48 \n                                 (#$HourFn 10 \n                                   (#$DayFn 28 \n                                     (#$MonthFn August \n                                       (#$YearFn 2003)))))))" )
    } );
    $kw28$REMOVAL_HOUR_NUMBER_OF_DATE_UNIFY = makeKeyword( "REMOVAL-HOUR-NUMBER-OF-DATE-UNIFY" );
    $list29 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "hourNumberOfDate" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "hourNumberOfDate" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword(
            "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-HOUR-NUMBER-OF-DATE-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword(
                "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "hourNumberOfDate" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "DATE" ) ) ),
                ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow
                    .list( makeKeyword( "CALL" ), makeSymbol( "INFERENCE-EXTRACT-DATE-HOUR" ), makeKeyword( "INPUT" ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles
                        .reader_make_constant_shell( makeString( "hourNumberOfDate" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE" ) ) ), makeKeyword( "DOCUMENTATION" ),
      makeString( "(#$hourNumberOfDate <not-fully-bound> <fully-bound>)" ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$hourNumberOfDate ?HOUR (#$SecondFn 54 \n                               (#$MinuteFn 48 \n                                (#$HourFn 10 \n                                 (#$DayFn 28 \n                                  (#$MonthFn August \n                                   (#$YearFn 2003)))))))" )
    } );
    $kw30$REMOVAL_DATE_INTERVALS_INTERSECT_CHECK = makeKeyword( "REMOVAL-DATE-INTERVALS-INTERSECT-CHECK" );
    $list31 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallyIntersects" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyIntersects" ) ), ConsesLow.list( makeKeyword( "OR" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "DATE-INTERVAL-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "TEMPORAL-INDEXICAL-P" ) ) ), ConsesLow.list( makeKeyword( "OR" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
                "DATE-INTERVAL-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "TEMPORAL-INDEXICAL-P" ) ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*HL-MODULE-CHECK-COST*" ), makeKeyword(
                    "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyIntersects" ) ), ConsesLow.list( makeKeyword(
                        "BIND" ), makeSymbol( "DATE1" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "DATE2" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE1" ) ), ConsesLow
                            .list( makeKeyword( "VALUE" ), makeSymbol( "DATE2" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "DATE1" ), makeSymbol(
                                "DATE2" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "DATE-INTERVALS-OR-INDEXICALS-INTERSECT?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE1" ) ), ConsesLow
                                    .list( makeKeyword( "VALUE" ), makeSymbol( "DATE2" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*TIME-INFERENCE-MT*" ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(#$temporallyIntersects <date-interval> <date-interval>)" ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$temporallyIntersects (#$IntervalEndedByFn (#$YearFn 2005)) (#$IntervalStartedBy (#$YearFn 2003)))" )
    } );
    $kw32$REMOVAL_DATE_INTERVAL_SUBSUMES_CHECK = makeKeyword( "REMOVAL-DATE-INTERVAL-SUBSUMES-CHECK" );
    $list33 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "OR" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes" ) ), ConsesLow.list( makeKeyword( "OR" ), ConsesLow.list(
            makeKeyword( "TEST" ), makeSymbol( "DATE-INTERVAL-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "TEMPORAL-INDEXICAL-P" ) ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
                "INDETERMINATE-DATE-INTERVAL-P" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
                    "INDETERMINATE-DATE-INTERVAL-P" ) ), ConsesLow.list( makeKeyword( "OR" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "DATE-INTERVAL-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
                        "TEMPORAL-INDEXICAL-P" ) ) ) ) ), makeKeyword( "EXCLUSIVE" ), makeSymbol( "TRUE" ), makeKeyword( "SUPPLANTS" ), ConsesLow.list( makeKeyword( "REMOVAL-TEMPORALLY-SUBSUMES" ) ), makeKeyword(
                            "COST-EXPRESSION" ), makeSymbol( "*HL-MODULE-CHECK-COST*" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles
                                .reader_make_constant_shell( makeString( "temporallySubsumes" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "DATE1" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol(
                                    "DATE2" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE1" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE2" ) ) ) ), makeKeyword(
                                        "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "DATE1" ), makeSymbol( "DATE2" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                                            "DATE-INTERVAL-OR-INDEXICAL-SUBSUMES?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE1" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE2" ) ) ) ),
      makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*TIME-INFERENCE-MT*" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$temporallySubsumes <date-interval> <date-interval>)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$temporallySubsumes (#$IntervalEndedByFn (#$YearFn 2005)) (#$YearFn 2003))" )
    } );
    $kw34$REMOVAL_DATE_INTERVAL_DURATION_UNIFY = makeKeyword( "REMOVAL-DATE-INTERVAL-DURATION-UNIFY" );
    $list35 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "duration" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "duration" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "DATE-INTERVAL-P" ) ), makeKeyword(
            "NOT-FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-DAY-NUMBER-OF-DATE-CHECK-COST*" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow
                .list( constant_handles.reader_make_constant_shell( makeString( "duration" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "DATE-INTERVAL" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol(
                    "NOT-FULLY-BOUND" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE-INTERVAL" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "NOT-FULLY-BOUND" ) ) ) ),
      makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "DATE-INTERVAL" ), makeSymbol( "NOT-FULLY-BOUND" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
          "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "INFERENCE-DATE-INTERVAL-DURATION" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE-INTERVAL" ) ), ConsesLow
              .list( makeKeyword( "VALUE" ), makeSymbol( "NOT-FULLY-BOUND" ) ) ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "duration" ) ),
                  ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE-INTERVAL" ) ), makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "SUPPORT-MT" ), makeSymbol(
                      "*TIME-INFERENCE-MT*" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$duration <date-interval> <not-fully-bound>)" ), makeKeyword( "EXAMPLE" ), makeString(
                          "(#$duration (#$TimeIntervalInclusiveFn (#$YearFn 2001) (#$YearFn 2004)) ?DURATION)" )
    } );
    $kw36$REMOVAL_DATE_INTERVAL_DURATION_CHECK = makeKeyword( "REMOVAL-DATE-INTERVAL-DURATION-CHECK" );
    $list37 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "duration" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "duration" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "DATE-INTERVAL-P" ) ), ConsesLow.list(
            makeKeyword( "TEST" ), makeSymbol( "DURATION-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*EXPENSIVE-HL-MODULE-CHECK-COST*" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword(
                "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "duration" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "DATE-INTERVAL" ) ), ConsesLow.list( makeKeyword(
                    "BIND" ), makeSymbol( "DURATION" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE-INTERVAL" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DURATION" ) ) ) ),
      makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "DATE-INTERVAL" ), makeSymbol( "DURATION" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
          "INFERENCE-DATE-INTERVAL-DURATION?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE-INTERVAL" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DURATION" ) ) ) ), makeKeyword(
              "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*TIME-INFERENCE-MT*" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$duration <date-interval> <duration>)" ),
      makeKeyword( "EXAMPLE" ), makeString( "(#$duration (#$TimeIntervalInclusiveFn (#$YearFn 2001) (#$YearFn 2004)) (#$YearsDuration 4))" )
    } );
    $kw38$UNEVALUATABLE = makeKeyword( "UNEVALUATABLE" );
    $kw39$REMOVAL_DEFINING_TIME_UNIT_CHECK = makeKeyword( "REMOVAL-DEFINING-TIME-UNIT-CHECK" );
    $list40 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "definingTimeUnit" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "definingTimeUnit" ) ), makeKeyword( "FORT" ), makeKeyword( "FORT" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol(
            "*CHEAP-HL-MODULE-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles
                .reader_make_constant_shell( makeString( "definingTimeUnit" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TYPE" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "UNIT" ) ) ), ConsesLow
                    .list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TYPE" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "UNIT" ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list(
                        makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "TYPE" ), makeSymbol( "UNIT" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "INFERENCE-DEFINING-TIME-UNIT-CHECK" ), ConsesLow.list(
                            makeKeyword( "VALUE" ), makeSymbol( "TYPE" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "UNIT" ) ) ) ), makeKeyword( "SUPPORT" ), makeSymbol( "MAKE-DEFINING-TIME-UNIT-SUPPORT" ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(#$definingTimeUnit <fort> <fort>)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$definingTimeUnit #$CalendarSecond #$SecondsDuration)" )
    } );
    $const41$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $kw42$REMOVAL_DEFINING_TIME_UNIT_ARG1_UNIFY = makeKeyword( "REMOVAL-DEFINING-TIME-UNIT-ARG1-UNIFY" );
    $list43 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "definingTimeUnit" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "definingTimeUnit" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "FORT" ) ), makeKeyword( "COST-EXPRESSION" ),
      ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
          makeString( "definingTimeUnit" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "UNIT" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "UNIT" ) ) ), makeKeyword(
              "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                  "INFERENCE-DEFINING-TIME-UNIT-ARG1-UNIFY" ), makeKeyword( "INPUT" ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                      "definingTimeUnit" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "UNIT" ) ) ), makeKeyword( "SUPPORT" ), makeSymbol( "MAKE-DEFINING-TIME-UNIT-SUPPORT" ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(#$definingTimeUnit <not-fully-bound> <fort>)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$definingTimeUnit ?WHAT #$SecondsDuration)" )
    } );
    $const44$definingTimeUnit = constant_handles.reader_make_constant_shell( makeString( "definingTimeUnit" ) );
    $kw45$REMOVAL_DEFINING_TIME_UNIT_ARG2_UNIFY = makeKeyword( "REMOVAL-DEFINING-TIME-UNIT-ARG2-UNIFY" );
    $list46 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "definingTimeUnit" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "definingTimeUnit" ) ), makeKeyword( "FORT" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ),
      ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
          makeString( "definingTimeUnit" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TYPE" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TYPE" ) ) ), makeKeyword(
              "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                  "INFERENCE-DEFINING-TIME-UNIT-ARG2-UNIFY" ), makeKeyword( "INPUT" ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                      "definingTimeUnit" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TYPE" ) ), makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT" ), makeSymbol( "MAKE-DEFINING-TIME-UNIT-SUPPORT" ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(#$definingTimeUnit <fort> <not-fully-bound>)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$definingTimeUnit #$CalendarSecond ?WHAT)" )
    } );
    $const47$latestDateInListBeforeDate = constant_handles.reader_make_constant_shell( makeString( "latestDateInListBeforeDate" ) );
    $kw48$REMOVAL_LATEST_DATE_IN_LIST_BEFORE_DATE = makeKeyword( "REMOVAL-LATEST-DATE-IN-LIST-BEFORE-DATE" );
    $list49 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "latestDateInListBeforeDate" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "latestDateInListBeforeDate" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ),
          makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol(
              "REMOVAL-LATEST-DATE-IN-LIST-BEFORE-DATE-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$latestDateInListBeforeDate <not-fully-bound> <fully-bound> <fully-bound>)" ), makeKeyword( "EXAMPLE" ),
      makeString(
          "(#$latestDateInListBeforeDate ?DATE \n (#$TheList \n  (#$DayFn 5 \n   (#$MonthFn #$March \n    (#$YearFn 2012))) \n  (#$DayFn 8 \n   (#$MonthFn #$February \n    (#$YearFn 2012))) \n  (#$DayFn 10 \n   (#$MonthFn #$January \n    (#$YearFn 2012))))\n (#$DayFn 15 \n  (#$MonthFn #$February \n   (#$YearFn 2012))))\n-->\n(((?DATE #$DayFn 8 (#$MonthFn #$February (#$YearFn 2012)))))" )
    } );
    $kw50$DATE_LIST_ARG_IS_NOT_AN_EL_LIST = makeKeyword( "DATE-LIST-ARG-IS-NOT-AN-EL-LIST" );
    $kw51$LIMIT_DATE_ARG_IS_NOT_A_DATE = makeKeyword( "LIMIT-DATE-ARG-IS-NOT-A-DATE" );
    $kw52$OPAQUE = makeKeyword( "OPAQUE" );
    $const53$startingDate_Precise = constant_handles.reader_make_constant_shell( makeString( "startingDate-Precise" ) );
    $kw54$REMOVAL_STARTING_DATE_PRECISE = makeKeyword( "REMOVAL-STARTING-DATE-PRECISE" );
    $list55 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "startingDate-Precise" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "startingDate-Precise" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword(
            "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-STARTING-DATE-PRECISE" ), makeKeyword( "DOCUMENTATION" ), makeString(
                "(#$startingDate-Precise <fully-bound> <not-fully-bound>)" ), makeKeyword( "EXAMPLE" ), makeString( "" )
    } );
    $const56$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const57$startingDate = constant_handles.reader_make_constant_shell( makeString( "startingDate" ) );
    $const58$temporallySubsumes = constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes" ) );
    $const59$endingDate_Precise = constant_handles.reader_make_constant_shell( makeString( "endingDate-Precise" ) );
    $kw60$REMOVAL_ENDING_DATE_PRECISE = makeKeyword( "REMOVAL-ENDING-DATE-PRECISE" );
    $list61 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "endingDate-Precise" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "endingDate-Precise" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword(
            "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-ENDING-DATE-PRECISE" ), makeKeyword( "DOCUMENTATION" ), makeString(
                "(#$endingDate-Precise <fully-bound> <not-fully-bound>)" ), makeKeyword( "EXAMPLE" ), makeString( "" )
    } );
    $const62$endingDate = constant_handles.reader_make_constant_shell( makeString( "endingDate" ) );
  }
}
/*
 * 
 * Total time: 293 ms
 * 
 */