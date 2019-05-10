package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf_date;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class date_defns
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.date_defns";
  public static final String myFingerPrint = "7b6322811ffb005818b235514782f2229ecc700bcd71e6c8b90f8939d7267970";
  private static final SubLSymbol $kw0$OPAQUE;
  private static final SubLObject $const1$indexicalReferent;
  private static final SubLObject $const2$BaseKB;
  private static final SubLSymbol $sym3$CYC_DAY_OF_WEEK_DEFN;
  private static final SubLObject $const4$CalendarDay;
  private static final SubLSymbol $sym5$CYC_DATE_AFTER;
  private static final SubLSymbol $sym6$CYC_DATE_AFTER_PRECISE;
  private static final SubLSymbol $sym7$CYC_DATE_AFTER_DURATION_START_PRECISE;
  private static final SubLString $str8$A_KB_dependent_date_specific_func;
  private static final SubLSymbol $sym9$CYC_DATE_BEFORE;
  private static final SubLSymbol $sym10$CYC_DATE_BEFORE_PRECISE;
  private static final SubLSymbol $sym11$CYC_DATE_FROM_INTEGER;
  private static final SubLSymbol $sym12$CYC_DATE_INITIAL_SECOND;
  private static final SubLSymbol $sym13$CYC_DATE_FINAL_SECOND;
  private static final SubLSymbol $sym14$CYC_DATE_ENCODE_STRING;
  private static final SubLSymbol $sym15$CYC_DATE_DECODE_STRING;
  private static final SubLSymbol $sym16$CYC_DATE_FROM_STRING;
  private static final SubLSymbol $sym17$CYC_DAY_OF_DATE;
  private static final SubLSymbol $sym18$CYC_HOUR_OF_DATE;
  private static final SubLSymbol $sym19$CYC_MINUTE_OF_DATE;
  private static final SubLList $list20;
  private static final SubLSymbol $sym21$CYC_TIME_ELAPSED_ENCODE_STRING;
  private static final SubLSymbol $sym22$CYC_TIME_ELAPSED_DECODE_STRING;
  private static final SubLSymbol $kw23$FAIL;
  private static final SubLSymbol $sym24$CYC_TIME_INTERVAL_OF_SPEC_STRING;
  private static final SubLSymbol $sym25$CYC_LATER_THAN;
  private static final SubLSymbol $sym26$CYC_DATE_SUBSUMES;
  private static final SubLSymbol $sym27$CYC_TIME_ELAPSED;
  private static final SubLSymbol $sym28$CYC_DAY_OF_WEEK_OF_DATE;
  private static final SubLSymbol $sym29$CYC_DAY_OF_WEEK_PRIOR_TO_DATE;
  private static final SubLSymbol $sym30$CYC_DAY_OF_WEEK_PRIOR_TO_DATE_INCLUSIVE;
  private static final SubLSymbol $sym31$CYC_DAY_OF_WEEK_AFTER_DATE;
  private static final SubLSymbol $sym32$CYC_DAY_OF_WEEK_AFTER_DATE_INCLUSIVE;
  private static final SubLSymbol $sym33$CYC_CURRENT_ITERATED_CYCLIC_INTERVAL;
  private static final SubLSymbol $sym34$CYC_NEXT_ITERATED_CYCLIC_INTERVAL;
  private static final SubLSymbol $sym35$CYC_YEAR_OF_DATE;
  private static final SubLSymbol $sym36$CYC_MONTH_OF_DATE;
  private static final SubLSymbol $sym37$CYC_DAY_NUMBER_OF_DATE;
  private static final SubLSymbol $sym38$CYC_EVALUATE_DATE_HELPER;
  private static final SubLSymbol $sym39$DATE_P;
  private static final SubLSymbol $sym40$DATE_;
  private static final SubLObject $const41$TimeIntervalInclusiveFn;
  private static final SubLSymbol $sym42$CYC_MINIMAL_TIME_INTERVAL_COVERING_DATES;

  @SubLTranslatedFile.SubL(source = "cycl/date-defns.lisp", position = 924L)
  public static SubLObject cyc_evaluate_date_helper(SubLObject date)
  {
    if( NIL != date_utilities.temporal_indexical_p( date ) )
    {
      final SubLObject indexical_value = removal_modules_indexical_referent.temporal_indexical_expand( date );
      relation_evaluation.cyc_evaluate_note_support( arguments.make_hl_support( $kw0$OPAQUE, el_utilities.make_binary_formula( $const1$indexicalReferent, date, indexical_value ), $const2$BaseKB, UNPROVIDED ) );
      date = indexical_value;
    }
    return date;
  }

  @SubLTranslatedFile.SubL(source = "cycl/date-defns.lisp", position = 1570L)
  public static SubLObject cyc_day_of_week_defn(final SubLObject v_object)
  {
    if( NIL != date_utilities.date_p( v_object ) && $const4$CalendarDay.eql( date_utilities.date_precision( v_object ) ) )
    {
      final SubLObject col = at_vars.defn_collection();
      return Equality.eq( col, date_utilities.day_of_week_of_date( v_object ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/date-defns.lisp", position = 1791L)
  public static SubLObject cyc_date_after(SubLObject date, final SubLObject time)
  {
    date = cyc_evaluate_date_helper( date );
    if( NIL == date_utilities.date_p( date ) || NIL == time_parameter_utilities.duration_p( time ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject result = date_utilities.date_after( date, time );
    if( NIL == result )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/date-defns.lisp", position = 2439L)
  public static SubLObject cyc_date_after_precise(SubLObject date, final SubLObject time)
  {
    date = cyc_evaluate_date_helper( date );
    if( NIL == date_utilities.date_p( date ) || NIL == time_parameter_utilities.duration_p( time ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject result = date_utilities.date_after_precise( date, time );
    if( NIL == result )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/date-defns.lisp", position = 2790L)
  public static SubLObject cyc_date_after_duration_start_precise(SubLObject date, final SubLObject time)
  {
    date = cyc_evaluate_date_helper( date );
    if( NIL == date_utilities.date_p( date ) || NIL == time_parameter_utilities.duration_p( time ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject result = date_utilities.date_after_duration_start_precise( date, time );
    if( NIL == result )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/date-defns.lisp", position = 3184L)
  public static SubLObject cyc_date_before(SubLObject date, final SubLObject time)
  {
    if( NIL == kb_control_vars.date_kb_loaded_p() )
    {
      Errors.error( $str8$A_KB_dependent_date_specific_func );
    }
    date = cyc_evaluate_date_helper( date );
    if( NIL == date_utilities.date_p( date ) || NIL == time_parameter_utilities.duration_p( time ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject result = date_utilities.date_before( date, time );
    if( NIL == result )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/date-defns.lisp", position = 3692L)
  public static SubLObject cyc_date_before_precise(SubLObject date, final SubLObject time)
  {
    if( NIL == kb_control_vars.date_kb_loaded_p() )
    {
      Errors.error( $str8$A_KB_dependent_date_specific_func );
    }
    date = cyc_evaluate_date_helper( date );
    if( NIL == date_utilities.date_p( date ) || NIL == time_parameter_utilities.duration_p( time ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject result = date_utilities.date_before_precise( date, time );
    if( NIL == result )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/date-defns.lisp", position = 4204L)
  public static SubLObject cyc_date_from_integer(final SubLObject universal_date)
  {
    if( !universal_date.isInteger() )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return date_utilities.universal_date_to_cycl_date( universal_date );
  }

  @SubLTranslatedFile.SubL(source = "cycl/date-defns.lisp", position = 4457L)
  public static SubLObject cyc_date_initial_second(SubLObject date)
  {
    date = cyc_evaluate_date_helper( date );
    if( NIL == date_utilities.date_p( date ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return time_interval_utilities.cycl_interval_initial_second( date );
  }

  @SubLTranslatedFile.SubL(source = "cycl/date-defns.lisp", position = 4683L)
  public static SubLObject cyc_date_final_second(SubLObject date)
  {
    date = cyc_evaluate_date_helper( date );
    if( NIL == date_utilities.date_p( date ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return time_interval_utilities.cycl_interval_final_second( date );
  }

  @SubLTranslatedFile.SubL(source = "cycl/date-defns.lisp", position = 4903L)
  public static SubLObject cyc_date_encode_string(final SubLObject template, SubLObject date)
  {
    date = cyc_evaluate_date_helper( date );
    if( !template.isString() || NIL == date_utilities.date_p( date ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject date_string = date_utilities.cyc_date_encode_string_internal( template, date );
    if( NIL == date_string )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return date_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/date-defns.lisp", position = 5389L)
  public static SubLObject cyc_date_decode_string(final SubLObject template, final SubLObject date_string)
  {
    if( !template.isString() || !date_string.isString() )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject date = date_utilities.cyc_date_decode_string_internal( template, date_string );
    if( NIL == date )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return date;
  }

  @SubLTranslatedFile.SubL(source = "cycl/date-defns.lisp", position = 5731L)
  public static SubLObject cyc_date_from_string(final SubLObject date_string)
  {
    if( !date_string.isString() )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject dates = date_utilities.cyc_date_from_string_internal( date_string );
    if( NIL != dates )
    {
      return dates.first();
    }
    relation_evaluation.throw_unevaluatable();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/date-defns.lisp", position = 6227L)
  public static SubLObject cyc_day_of_date(SubLObject date)
  {
    date = cyc_evaluate_date_helper( date );
    if( NIL == date_utilities.date_p( date ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject day = date_utilities.day_of_date( date );
    if( NIL == narts_high.naut_p( day ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return day;
  }

  @SubLTranslatedFile.SubL(source = "cycl/date-defns.lisp", position = 6519L)
  public static SubLObject cyc_hour_of_date(SubLObject date)
  {
    date = cyc_evaluate_date_helper( date );
    if( NIL == date_utilities.date_p( date ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject day = date_utilities.hour_of_date( date );
    if( NIL == narts_high.naut_p( day ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return day;
  }

  @SubLTranslatedFile.SubL(source = "cycl/date-defns.lisp", position = 6819L)
  public static SubLObject cyc_minute_of_date(SubLObject date)
  {
    date = cyc_evaluate_date_helper( date );
    if( NIL == date_utilities.date_p( date ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject day = date_utilities.minute_of_date( date );
    if( NIL == narts_high.naut_p( day ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return day;
  }

  @SubLTranslatedFile.SubL(source = "cycl/date-defns.lisp", position = 7125L)
  public static SubLObject cyc_time_elapsed_encode_string(final SubLObject template, final SubLObject time_quant)
  {
    if( !template.isString() || NIL == el_utilities.el_formula_p( time_quant ) || NIL == subl_promotions.memberP( cycl_utilities.formula_operator( time_quant ), $list20, UNPROVIDED, UNPROVIDED ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject time_string = date_utilities.cyc_time_elapsed_encode_string_internal( template, time_quant );
    if( NIL == time_string )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return time_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/date-defns.lisp", position = 7739L)
  public static SubLObject cyc_time_elapsed_decode_string(final SubLObject template, final SubLObject time_string)
  {
    if( !template.isString() || !time_string.isString() )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject time_quant = date_utilities.cyc_time_elapsed_decode_string_internal( template, time_string );
    if( NIL == time_quant )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return time_quant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/date-defns.lisp", position = 8122L)
  public static SubLObject cyc_time_interval_of_spec_string(final SubLObject spec_string)
  {
    final SubLObject time_interval = removal_modules_rdf_date.rdf_time_interval_to_cycl( spec_string );
    if( $kw23$FAIL.eql( time_interval ) )
    {
      relation_evaluation.throw_unevaluatable();
      return NIL;
    }
    return time_interval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/date-defns.lisp", position = 8496L)
  public static SubLObject cyc_later_than(SubLObject late_date, SubLObject early_date)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    late_date = cyc_evaluate_date_helper( late_date );
    early_date = cyc_evaluate_date_helper( early_date );
    thread.resetMultipleValues();
    final SubLObject result = date_utilities.later_than( late_date, early_date );
    final SubLObject unevaluatableP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != unevaluatableP )
    {
      relation_evaluation.throw_unevaluatable();
      return NIL;
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/date-defns.lisp", position = 9027L)
  public static SubLObject cyc_date_subsumes(SubLObject date1, SubLObject date2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    date1 = cyc_evaluate_date_helper( date1 );
    date2 = cyc_evaluate_date_helper( date2 );
    thread.resetMultipleValues();
    final SubLObject result = date_utilities.date_subsumes( date1, date2 );
    final SubLObject valid = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL == valid )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/date-defns.lisp", position = 9419L)
  public static SubLObject cyc_time_elapsed(SubLObject date1, SubLObject date2)
  {
    date1 = cyc_evaluate_date_helper( date1 );
    date2 = cyc_evaluate_date_helper( date2 );
    if( NIL == date_utilities.date_p( date1 ) || NIL == date_utilities.date_p( date2 ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return date_utilities.time_elapsed( date1, date2, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/date-defns.lisp", position = 9780L)
  public static SubLObject cyc_day_of_week_of_date(SubLObject date)
  {
    date = cyc_evaluate_date_helper( date );
    if( NIL == date_utilities.date_p( date ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject weekday = date_utilities.day_of_week_of_date( date );
    if( NIL == weekday )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return weekday;
  }

  @SubLTranslatedFile.SubL(source = "cycl/date-defns.lisp", position = 10181L)
  public static SubLObject cyc_day_of_week_prior_to_date(final SubLObject day_of_week, SubLObject date)
  {
    date = cyc_evaluate_date_helper( date );
    if( NIL == date_utilities.day_of_week_p( day_of_week ) || NIL == date_utilities.date_p( date ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject result = date_utilities.day_of_week_prior_to_date( day_of_week, date );
    if( NIL == result )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/date-defns.lisp", position = 10653L)
  public static SubLObject cyc_day_of_week_prior_to_date_inclusive(final SubLObject day_of_week, SubLObject date)
  {
    date = cyc_evaluate_date_helper( date );
    if( NIL == date_utilities.day_of_week_p( day_of_week ) || NIL == date_utilities.date_p( date ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject result = date_utilities.day_of_week_prior_to_date_inclusive( day_of_week, date );
    if( NIL == result )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/date-defns.lisp", position = 11185L)
  public static SubLObject cyc_day_of_week_after_date(final SubLObject day_of_week, SubLObject date)
  {
    date = cyc_evaluate_date_helper( date );
    if( NIL == date_utilities.day_of_week_p( day_of_week ) || NIL == date_utilities.date_p( date ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject result = date_utilities.day_of_week_after_date( day_of_week, date );
    if( NIL == result )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/date-defns.lisp", position = 11643L)
  public static SubLObject cyc_day_of_week_after_date_inclusive(final SubLObject day_of_week, SubLObject date)
  {
    date = cyc_evaluate_date_helper( date );
    if( NIL == date_utilities.day_of_week_p( day_of_week ) || NIL == date_utilities.date_p( date ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject result = date_utilities.day_of_week_after_date_inclusive( day_of_week, date );
    if( NIL == result )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/date-defns.lisp", position = 12161L)
  public static SubLObject cyc_current_iterated_cyclic_interval(final SubLObject cyclic_interval_type_on_calendar_scale)
  {
    if( NIL == cyclic_interval_type_on_calendar_scale )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject result = date_utilities.current_time_interval_of_type( cyclic_interval_type_on_calendar_scale );
    if( NIL == result )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/date-defns.lisp", position = 12658L)
  public static SubLObject cyc_next_iterated_cyclic_interval(final SubLObject cyclic_interval_type_on_calendar_scale)
  {
    if( NIL == cyclic_interval_type_on_calendar_scale )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject result = date_utilities.next_iterated_cyclic_interval_inclusive( cyclic_interval_type_on_calendar_scale, UNPROVIDED );
    if( NIL == result )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/date-defns.lisp", position = 13157L)
  public static SubLObject cyc_year_of_date(SubLObject date)
  {
    date = cyc_evaluate_date_helper( date );
    if( NIL == date_utilities.date_p( date ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject year = date_utilities.extract_date_year( date );
    if( !year.isInteger() )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return year;
  }

  @SubLTranslatedFile.SubL(source = "cycl/date-defns.lisp", position = 13538L)
  public static SubLObject cyc_month_of_date(SubLObject date)
  {
    date = cyc_evaluate_date_helper( date );
    if( NIL == date_utilities.date_p( date ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject month = date_utilities.extract_date_month( date );
    if( NIL == constant_handles.constant_p( month ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return month;
  }

  @SubLTranslatedFile.SubL(source = "cycl/date-defns.lisp", position = 13927L)
  public static SubLObject cyc_day_number_of_date(SubLObject date)
  {
    date = cyc_evaluate_date_helper( date );
    if( NIL == date_utilities.date_p( date ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject day = date_utilities.extract_date_day( date );
    if( !day.isInteger() )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return day;
  }

  @SubLTranslatedFile.SubL(source = "cycl/date-defns.lisp", position = 14315L)
  public static SubLObject cyc_minimal_time_interval_covering_dates(SubLObject args)
  {
    args = Mapping.mapcar( $sym38$CYC_EVALUATE_DATE_HELPER, args );
    if( NIL == list_utilities.lengthGE( args, ONE_INTEGER, UNPROVIDED ) || NIL == list_utilities.list_of_type_p( $sym39$DATE_P, args ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    final SubLObject sorted_dates = Sort.sort( remove_subsumed_dates( list_utilities.fast_delete_duplicates( conses_high.copy_list( args ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ), $sym40$DATE_,
        UNPROVIDED );
    if( NIL == sorted_dates )
    {
      return NIL;
    }
    if( NIL != list_utilities.singletonP( sorted_dates ) )
    {
      return sorted_dates.first();
    }
    return el_utilities.make_el_formula( $const41$TimeIntervalInclusiveFn, ConsesLow.list( sorted_dates.first(), list_utilities.last_one( sorted_dates ) ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/date-defns.lisp", position = 15048L)
  public static SubLObject remove_subsumed_dates(final SubLObject dates)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = dates;
    SubLObject date1 = NIL;
    date1 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject subsumedP = NIL;
      if( NIL == subsumedP )
      {
        SubLObject csome_list_var = Sequences.remove( date1, dates, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject date2 = NIL;
        date2 = csome_list_var.first();
        while ( NIL == subsumedP && NIL != csome_list_var)
        {
          if( NIL != cyc_date_subsumes( date2, date1 ) )
          {
            subsumedP = T;
          }
          csome_list_var = csome_list_var.rest();
          date2 = csome_list_var.first();
        }
      }
      if( NIL == subsumedP )
      {
        result = ConsesLow.cons( date1, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      date1 = cdolist_list_var.first();
    }
    return result;
  }

  public static SubLObject declare_date_defns_file()
  {
    SubLFiles.declareFunction( me, "cyc_evaluate_date_helper", "CYC-EVALUATE-DATE-HELPER", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_day_of_week_defn", "CYC-DAY-OF-WEEK-DEFN", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_date_after", "CYC-DATE-AFTER", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_date_after_precise", "CYC-DATE-AFTER-PRECISE", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_date_after_duration_start_precise", "CYC-DATE-AFTER-DURATION-START-PRECISE", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_date_before", "CYC-DATE-BEFORE", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_date_before_precise", "CYC-DATE-BEFORE-PRECISE", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_date_from_integer", "CYC-DATE-FROM-INTEGER", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_date_initial_second", "CYC-DATE-INITIAL-SECOND", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_date_final_second", "CYC-DATE-FINAL-SECOND", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_date_encode_string", "CYC-DATE-ENCODE-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_date_decode_string", "CYC-DATE-DECODE-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_date_from_string", "CYC-DATE-FROM-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_day_of_date", "CYC-DAY-OF-DATE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_hour_of_date", "CYC-HOUR-OF-DATE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_minute_of_date", "CYC-MINUTE-OF-DATE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_time_elapsed_encode_string", "CYC-TIME-ELAPSED-ENCODE-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_time_elapsed_decode_string", "CYC-TIME-ELAPSED-DECODE-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_time_interval_of_spec_string", "CYC-TIME-INTERVAL-OF-SPEC-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_later_than", "CYC-LATER-THAN", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_date_subsumes", "CYC-DATE-SUBSUMES", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_time_elapsed", "CYC-TIME-ELAPSED", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_day_of_week_of_date", "CYC-DAY-OF-WEEK-OF-DATE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_day_of_week_prior_to_date", "CYC-DAY-OF-WEEK-PRIOR-TO-DATE", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_day_of_week_prior_to_date_inclusive", "CYC-DAY-OF-WEEK-PRIOR-TO-DATE-INCLUSIVE", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_day_of_week_after_date", "CYC-DAY-OF-WEEK-AFTER-DATE", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_day_of_week_after_date_inclusive", "CYC-DAY-OF-WEEK-AFTER-DATE-INCLUSIVE", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_current_iterated_cyclic_interval", "CYC-CURRENT-ITERATED-CYCLIC-INTERVAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_next_iterated_cyclic_interval", "CYC-NEXT-ITERATED-CYCLIC-INTERVAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_year_of_date", "CYC-YEAR-OF-DATE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_month_of_date", "CYC-MONTH-OF-DATE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_day_number_of_date", "CYC-DAY-NUMBER-OF-DATE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_minimal_time_interval_covering_dates", "CYC-MINIMAL-TIME-INTERVAL-COVERING-DATES", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_subsumed_dates", "REMOVE-SUBSUMED-DATES", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_date_defns_file()
  {
    return NIL;
  }

  public static SubLObject setup_date_defns_file()
  {
    if( $sym3$CYC_DAY_OF_WEEK_DEFN.isSymbol() )
    {
      final SubLObject item_var = $sym3$CYC_DAY_OF_WEEK_DEFN;
      if( NIL == conses_high.member( item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        at_vars.$at_collection_specific_defns$.setDynamicValue( ConsesLow.cons( item_var, at_vars.$at_collection_specific_defns$.getDynamicValue() ) );
      }
    }
    utilities_macros.register_kb_function( $sym3$CYC_DAY_OF_WEEK_DEFN );
    utilities_macros.register_kb_function( $sym5$CYC_DATE_AFTER );
    utilities_macros.register_kb_function( $sym6$CYC_DATE_AFTER_PRECISE );
    utilities_macros.register_kb_function( $sym7$CYC_DATE_AFTER_DURATION_START_PRECISE );
    utilities_macros.register_kb_function( $sym9$CYC_DATE_BEFORE );
    utilities_macros.register_kb_function( $sym10$CYC_DATE_BEFORE_PRECISE );
    utilities_macros.register_kb_function( $sym11$CYC_DATE_FROM_INTEGER );
    utilities_macros.register_kb_function( $sym12$CYC_DATE_INITIAL_SECOND );
    utilities_macros.register_kb_function( $sym13$CYC_DATE_FINAL_SECOND );
    utilities_macros.register_kb_function( $sym14$CYC_DATE_ENCODE_STRING );
    utilities_macros.register_kb_function( $sym15$CYC_DATE_DECODE_STRING );
    utilities_macros.register_kb_function( $sym16$CYC_DATE_FROM_STRING );
    utilities_macros.register_kb_function( $sym17$CYC_DAY_OF_DATE );
    utilities_macros.register_kb_function( $sym18$CYC_HOUR_OF_DATE );
    utilities_macros.register_kb_function( $sym19$CYC_MINUTE_OF_DATE );
    utilities_macros.register_kb_function( $sym21$CYC_TIME_ELAPSED_ENCODE_STRING );
    utilities_macros.register_kb_function( $sym22$CYC_TIME_ELAPSED_DECODE_STRING );
    utilities_macros.register_kb_function( $sym24$CYC_TIME_INTERVAL_OF_SPEC_STRING );
    utilities_macros.register_kb_function( $sym25$CYC_LATER_THAN );
    utilities_macros.register_kb_function( $sym26$CYC_DATE_SUBSUMES );
    utilities_macros.register_kb_function( $sym27$CYC_TIME_ELAPSED );
    utilities_macros.register_kb_function( $sym28$CYC_DAY_OF_WEEK_OF_DATE );
    utilities_macros.register_kb_function( $sym29$CYC_DAY_OF_WEEK_PRIOR_TO_DATE );
    utilities_macros.register_kb_function( $sym30$CYC_DAY_OF_WEEK_PRIOR_TO_DATE_INCLUSIVE );
    utilities_macros.register_kb_function( $sym31$CYC_DAY_OF_WEEK_AFTER_DATE );
    utilities_macros.register_kb_function( $sym32$CYC_DAY_OF_WEEK_AFTER_DATE_INCLUSIVE );
    utilities_macros.register_kb_function( $sym33$CYC_CURRENT_ITERATED_CYCLIC_INTERVAL );
    utilities_macros.register_kb_function( $sym34$CYC_NEXT_ITERATED_CYCLIC_INTERVAL );
    utilities_macros.register_kb_function( $sym35$CYC_YEAR_OF_DATE );
    utilities_macros.register_kb_function( $sym36$CYC_MONTH_OF_DATE );
    utilities_macros.register_kb_function( $sym37$CYC_DAY_NUMBER_OF_DATE );
    utilities_macros.register_kb_function( $sym42$CYC_MINIMAL_TIME_INTERVAL_COVERING_DATES );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_date_defns_file();
  }

  @Override
  public void initializeVariables()
  {
    init_date_defns_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_date_defns_file();
  }
  static
  {
    me = new date_defns();
    $kw0$OPAQUE = makeKeyword( "OPAQUE" );
    $const1$indexicalReferent = constant_handles.reader_make_constant_shell( makeString( "indexicalReferent" ) );
    $const2$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $sym3$CYC_DAY_OF_WEEK_DEFN = makeSymbol( "CYC-DAY-OF-WEEK-DEFN" );
    $const4$CalendarDay = constant_handles.reader_make_constant_shell( makeString( "CalendarDay" ) );
    $sym5$CYC_DATE_AFTER = makeSymbol( "CYC-DATE-AFTER" );
    $sym6$CYC_DATE_AFTER_PRECISE = makeSymbol( "CYC-DATE-AFTER-PRECISE" );
    $sym7$CYC_DATE_AFTER_DURATION_START_PRECISE = makeSymbol( "CYC-DATE-AFTER-DURATION-START-PRECISE" );
    $str8$A_KB_dependent_date_specific_func = makeString( "A KB-dependent date-specific function was called, but the current Cyc KB does not contain knowledge about dates." );
    $sym9$CYC_DATE_BEFORE = makeSymbol( "CYC-DATE-BEFORE" );
    $sym10$CYC_DATE_BEFORE_PRECISE = makeSymbol( "CYC-DATE-BEFORE-PRECISE" );
    $sym11$CYC_DATE_FROM_INTEGER = makeSymbol( "CYC-DATE-FROM-INTEGER" );
    $sym12$CYC_DATE_INITIAL_SECOND = makeSymbol( "CYC-DATE-INITIAL-SECOND" );
    $sym13$CYC_DATE_FINAL_SECOND = makeSymbol( "CYC-DATE-FINAL-SECOND" );
    $sym14$CYC_DATE_ENCODE_STRING = makeSymbol( "CYC-DATE-ENCODE-STRING" );
    $sym15$CYC_DATE_DECODE_STRING = makeSymbol( "CYC-DATE-DECODE-STRING" );
    $sym16$CYC_DATE_FROM_STRING = makeSymbol( "CYC-DATE-FROM-STRING" );
    $sym17$CYC_DAY_OF_DATE = makeSymbol( "CYC-DAY-OF-DATE" );
    $sym18$CYC_HOUR_OF_DATE = makeSymbol( "CYC-HOUR-OF-DATE" );
    $sym19$CYC_MINUTE_OF_DATE = makeSymbol( "CYC-MINUTE-OF-DATE" );
    $list20 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "HoursDuration" ) ), constant_handles.reader_make_constant_shell( makeString( "MinutesDuration" ) ), constant_handles
        .reader_make_constant_shell( makeString( "SecondsDuration" ) ) );
    $sym21$CYC_TIME_ELAPSED_ENCODE_STRING = makeSymbol( "CYC-TIME-ELAPSED-ENCODE-STRING" );
    $sym22$CYC_TIME_ELAPSED_DECODE_STRING = makeSymbol( "CYC-TIME-ELAPSED-DECODE-STRING" );
    $kw23$FAIL = makeKeyword( "FAIL" );
    $sym24$CYC_TIME_INTERVAL_OF_SPEC_STRING = makeSymbol( "CYC-TIME-INTERVAL-OF-SPEC-STRING" );
    $sym25$CYC_LATER_THAN = makeSymbol( "CYC-LATER-THAN" );
    $sym26$CYC_DATE_SUBSUMES = makeSymbol( "CYC-DATE-SUBSUMES" );
    $sym27$CYC_TIME_ELAPSED = makeSymbol( "CYC-TIME-ELAPSED" );
    $sym28$CYC_DAY_OF_WEEK_OF_DATE = makeSymbol( "CYC-DAY-OF-WEEK-OF-DATE" );
    $sym29$CYC_DAY_OF_WEEK_PRIOR_TO_DATE = makeSymbol( "CYC-DAY-OF-WEEK-PRIOR-TO-DATE" );
    $sym30$CYC_DAY_OF_WEEK_PRIOR_TO_DATE_INCLUSIVE = makeSymbol( "CYC-DAY-OF-WEEK-PRIOR-TO-DATE-INCLUSIVE" );
    $sym31$CYC_DAY_OF_WEEK_AFTER_DATE = makeSymbol( "CYC-DAY-OF-WEEK-AFTER-DATE" );
    $sym32$CYC_DAY_OF_WEEK_AFTER_DATE_INCLUSIVE = makeSymbol( "CYC-DAY-OF-WEEK-AFTER-DATE-INCLUSIVE" );
    $sym33$CYC_CURRENT_ITERATED_CYCLIC_INTERVAL = makeSymbol( "CYC-CURRENT-ITERATED-CYCLIC-INTERVAL" );
    $sym34$CYC_NEXT_ITERATED_CYCLIC_INTERVAL = makeSymbol( "CYC-NEXT-ITERATED-CYCLIC-INTERVAL" );
    $sym35$CYC_YEAR_OF_DATE = makeSymbol( "CYC-YEAR-OF-DATE" );
    $sym36$CYC_MONTH_OF_DATE = makeSymbol( "CYC-MONTH-OF-DATE" );
    $sym37$CYC_DAY_NUMBER_OF_DATE = makeSymbol( "CYC-DAY-NUMBER-OF-DATE" );
    $sym38$CYC_EVALUATE_DATE_HELPER = makeSymbol( "CYC-EVALUATE-DATE-HELPER" );
    $sym39$DATE_P = makeSymbol( "DATE-P" );
    $sym40$DATE_ = makeSymbol( "DATE<" );
    $const41$TimeIntervalInclusiveFn = constant_handles.reader_make_constant_shell( makeString( "TimeIntervalInclusiveFn" ) );
    $sym42$CYC_MINIMAL_TIME_INTERVAL_COVERING_DATES = makeSymbol( "CYC-MINIMAL-TIME-INTERVAL-COVERING-DATES" );
  }
}
/*
 * 
 * Total time: 186 ms
 * 
 */