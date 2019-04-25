package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kb_access_metering
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.kb_access_metering";
  public static final String myFingerPrint = "3a4ffddef5888aa8b183e3155ae0380412b3689fb1742bca3cc9967af58f7aa9";
  @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 1056L)
  public static SubLSymbol $arete_log_kb_touchesP$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 1256L)
  public static SubLSymbol $arete_log_last_kb_touchP$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 1430L)
  public static SubLSymbol $arete_log_kb_touch_countsP$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 1620L)
  public static SubLSymbol $arete_assertions_touched$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 1678L)
  public static SubLSymbol $arete_constants_touched$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 1735L)
  public static SubLSymbol $arete_narts_touched$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 1792L)
  public static SubLSymbol $arete_last_assertion_touched$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 1850L)
  public static SubLSymbol $arete_last_term_touched$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 1907L)
  public static SubLSymbol $arete_last_constant_touched$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 1964L)
  public static SubLSymbol $arete_last_nart_touched$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 2021L)
  public static SubLSymbol $arete_assertions_touched_count$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 2099L)
  public static SubLSymbol $arete_terms_touched_count$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 2171L)
  public static SubLSymbol $kb_access_metering_enabledP$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 2354L)
  public static SubLSymbol $kb_access_metering_domains$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 2457L)
  public static SubLSymbol $kb_access_metering_table$;
  private static final SubLSymbol $sym0$_ARETE_LAST_ASSERTION_TOUCHED_;
  private static final SubLSymbol $sym1$_ARETE_LAST_TERM_TOUCHED_;
  private static final SubLSymbol $sym2$_ARETE_LAST_CONSTANT_TOUCHED_;
  private static final SubLSymbol $sym3$_ARETE_LAST_NART_TOUCHED_;
  private static final SubLSymbol $sym4$_KB_ACCESS_METERING_ENABLED__;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLSymbol $kw7$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw8$DOMAINS;
  private static final SubLList $list9;
  private static final SubLSymbol $kw10$OPTIONS;
  private static final SubLSymbol $sym11$DOMAINS_VAR;
  private static final SubLSymbol $sym12$OPTIONS_VAR;
  private static final SubLSymbol $sym13$TABLE_VAR;
  private static final SubLSymbol $sym14$CLET;
  private static final SubLSymbol $sym15$NEW_KB_ACCESS_METERING_TABLE;
  private static final SubLSymbol $sym16$_KB_ACCESS_METERING_DOMAINS_;
  private static final SubLSymbol $sym17$_KB_ACCESS_METERING_TABLE_;
  private static final SubLSymbol $sym18$CUNWIND_PROTECT;
  private static final SubLSymbol $sym19$PROGN;
  private static final SubLSymbol $sym20$CSETQ;
  private static final SubLSymbol $sym21$POSTPROCESS_KB_ACCESS_METERING_TABLE;
  private static final SubLList $list22;
  private static final SubLSymbol $sym23$WITH_KB_ACCESS_METERING;
  private static final SubLSymbol $kw24$CONSTANT;
  private static final SubLSymbol $kw25$NART;
  private static final SubLSymbol $kw26$ASSERTION;
  private static final SubLList $list27;
  private static final SubLSymbol $sym28$PWHEN;
  private static final SubLList $list29;
  private static final SubLSymbol $sym30$NOTE_KB_ACCESS_SBHL_LINK;
  private static final SubLSymbol $sym31$NOTE_KB_ACCESS_SBHL_;
  private static final SubLSymbol $sym32$POSSIBLY_NOTE_KB_ACCESS_SBHL_LINK;
  private static final SubLSymbol $kw33$SBHL;
  private static final SubLSymbol $sym34$ASSERTED_WHEN;
  private static final SubLSymbol $sym35$UNIVERSAL_TIME_FOR_START_OF_UNIVERSAL_DATE;
  private static final SubLSymbol $sym36$_;
  private static final SubLSymbol $sym37$__;
  private static final SubLSymbol $sym38$SECOND;
  private static final SubLList $list39;
  private static final SubLString $str40$______A;

  @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 2558L)
  public static SubLObject with_kb_access_metering(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject result_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    result_var = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list5 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list5 );
      if( NIL == conses_high.member( current_$1, $list6, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw7$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list5 );
    }
    final SubLObject domains_tail = cdestructuring_bind.property_list_member( $kw8$DOMAINS, current );
    final SubLObject domains = ( NIL != domains_tail ) ? conses_high.cadr( domains_tail ) : $list9;
    final SubLObject options_tail = cdestructuring_bind.property_list_member( $kw10$OPTIONS, current );
    final SubLObject options = ( NIL != options_tail ) ? conses_high.cadr( options_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject domains_var = $sym11$DOMAINS_VAR;
    final SubLObject options_var = $sym12$OPTIONS_VAR;
    final SubLObject table_var = $sym13$TABLE_VAR;
    return ConsesLow.list( $sym14$CLET, ConsesLow.list( ConsesLow.list( domains_var, domains ), ConsesLow.list( options_var, options ), ConsesLow.list( table_var, ConsesLow.list( $sym15$NEW_KB_ACCESS_METERING_TABLE,
        domains_var, options_var ) ) ), ConsesLow.list( $sym14$CLET, ConsesLow.list( ConsesLow.list( $sym16$_KB_ACCESS_METERING_DOMAINS_, domains_var ), ConsesLow.list( $sym17$_KB_ACCESS_METERING_TABLE_, table_var ) ),
            ConsesLow.list( $sym18$CUNWIND_PROTECT, reader.bq_cons( $sym19$PROGN, ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym20$CSETQ, result_var, ConsesLow.list( $sym21$POSTPROCESS_KB_ACCESS_METERING_TABLE,
                table_var, domains_var, options_var ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 3401L)
  public static SubLObject eval_with_kb_access_metering(final SubLObject form, SubLObject domains, SubLObject options)
  {
    if( domains == UNPROVIDED )
    {
      domains = $list22;
    }
    if( options == UNPROVIDED )
    {
      options = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject metering_result = NIL;
    SubLObject eval_result = NIL;
    final SubLObject domains_var = domains;
    final SubLObject options_var = options;
    final SubLObject table_var = new_kb_access_metering_table( domains_var, options_var );
    final SubLObject _prev_bind_0 = $kb_access_metering_domains$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $kb_access_metering_table$.currentBinding( thread );
    try
    {
      $kb_access_metering_domains$.bind( domains_var, thread );
      $kb_access_metering_table$.bind( table_var, thread );
      try
      {
        eval_result = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( Eval.eval( form ) ) );
      }
      finally
      {
        final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          metering_result = postprocess_kb_access_metering_table( table_var, domains_var, options_var );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2, thread );
        }
      }
    }
    finally
    {
      $kb_access_metering_table$.rebind( _prev_bind_2, thread );
      $kb_access_metering_domains$.rebind( _prev_bind_0, thread );
    }
    return Values.values( metering_result, eval_result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 4061L)
  public static SubLObject new_kb_access_metering_table(final SubLObject domains, final SubLObject options)
  {
    return dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 4241L)
  public static SubLObject postprocess_kb_access_metering_table(final SubLObject table, final SubLObject domains, final SubLObject options)
  {
    return table;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 4401L)
  public static SubLObject possibly_note_kb_access_constant(final SubLObject constant)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $kb_access_metering_enabledP$.getGlobalValue() && NIL != list_utilities.member_eqP( $kw24$CONSTANT, $kb_access_metering_domains$.getDynamicValue( thread ) ) )
    {
      dictionary_utilities.dictionary_increment( $kb_access_metering_table$.getDynamicValue( thread ), constant, UNPROVIDED );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 4715L)
  public static SubLObject possibly_note_kb_access_nart(final SubLObject nart)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $kb_access_metering_enabledP$.getGlobalValue() && NIL != list_utilities.member_eqP( $kw25$NART, $kb_access_metering_domains$.getDynamicValue( thread ) ) )
    {
      dictionary_utilities.dictionary_increment( $kb_access_metering_table$.getDynamicValue( thread ), nart, UNPROVIDED );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 4946L)
  public static SubLObject possibly_note_kb_access_assertion(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $kb_access_metering_enabledP$.getGlobalValue() && NIL != list_utilities.member_eqP( $kw26$ASSERTION, $kb_access_metering_domains$.getDynamicValue( thread ) ) )
    {
      return note_kb_access_assertion( assertion );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 5166L)
  public static SubLObject note_kb_access_assertion(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    dictionary_utilities.dictionary_increment( $kb_access_metering_table$.getDynamicValue( thread ), assertion, UNPROVIDED );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 5295L)
  public static SubLObject possibly_note_kb_access_sbhl_link(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject node = NIL;
    SubLObject link_node = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list27 );
    node = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list27 );
    link_node = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym28$PWHEN, $list29, ConsesLow.list( $sym30$NOTE_KB_ACCESS_SBHL_LINK, node, link_node ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list27 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 5564L)
  public static SubLObject note_kb_access_sbhlP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return list_utilities.member_eqP( $kw33$SBHL, $kb_access_metering_domains$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 5712L)
  public static SubLObject kb_access_metering_asserted_assertions(final SubLObject kbam_result)
  {
    return list_utilities.remove_if_not( Symbols.symbol_function( $sym34$ASSERTED_WHEN ), dictionary.dictionary_keys( kbam_result ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 6029L)
  public static SubLObject mean_asserted_assertion_dates(final SubLObject kbam_result)
  {
    final SubLObject assertions = kb_access_metering_asserted_assertions( kbam_result );
    final SubLObject dates = Mapping.mapcar( Symbols.symbol_function( $sym34$ASSERTED_WHEN ), assertions );
    final SubLObject times = Mapping.mapcar( Symbols.symbol_function( $sym35$UNIVERSAL_TIME_FOR_START_OF_UNIVERSAL_DATE ), dates );
    final SubLObject mean_time = Numbers.round( number_utilities.mean( times ), UNPROVIDED );
    final SubLObject mean_date = numeric_date_utilities.get_universal_date( mean_time, UNPROVIDED );
    return mean_date;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 6384L)
  public static SubLObject median_asserted_assertion_dates(final SubLObject kbam_result)
  {
    final SubLObject assertions = kb_access_metering_asserted_assertions( kbam_result );
    final SubLObject dates = Mapping.mapcar( Symbols.symbol_function( $sym34$ASSERTED_WHEN ), assertions );
    final SubLObject times = Mapping.mapcar( Symbols.symbol_function( $sym35$UNIVERSAL_TIME_FOR_START_OF_UNIVERSAL_DATE ), dates );
    final SubLObject median_time = Numbers.round( number_utilities.median( times, UNPROVIDED, UNPROVIDED ), UNPROVIDED );
    final SubLObject median_date = numeric_date_utilities.get_universal_date( median_time, UNPROVIDED );
    return median_date;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 6751L)
  public static SubLObject weighted_mean_asserted_assertion_dates(final SubLObject kbam_result)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject times = ZERO_INTEGER;
    SubLObject total = ZERO_INTEGER;
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( kbam_result ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject assertion = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject count = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject date = assertions_high.asserted_when( assertion );
      if( NIL != date )
      {
        final SubLObject time = numeric_date_utilities.universal_time_for_start_of_universal_date( date, UNPROVIDED );
        total = Numbers.add( total, count );
        times = Numbers.add( times, Numbers.multiply( count, time ) );
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    final SubLObject mean_time = Numbers.integerDivide( times, total );
    final SubLObject mean_date = numeric_date_utilities.get_universal_date( mean_time, UNPROVIDED );
    return mean_date;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 7206L)
  public static SubLObject weighted_median_asserted_assertion_dates(final SubLObject kbam_result)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject dates = NIL;
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( kbam_result ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject assertion = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject count = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject date = assertions_high.asserted_when( assertion );
      if( NIL != date )
      {
        dates = ConsesLow.nconc( ConsesLow.make_list( count, date ), dates );
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    final SubLObject median_date = Numbers.round( number_utilities.median( dates, UNPROVIDED, UNPROVIDED ), UNPROVIDED );
    return median_date;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 7541L)
  public static SubLObject percent_before_date(final SubLObject universal_date, final SubLObject kbam_result)
  {
    final SubLObject assertions = kb_access_metering_asserted_assertions( kbam_result );
    SubLObject dates = Mapping.mapcar( Symbols.symbol_function( $sym34$ASSERTED_WHEN ), assertions );
    dates = Sort.sort( dates, Symbols.symbol_function( $sym36$_ ), UNPROVIDED );
    final SubLObject date_position = Sequences.position( universal_date, dates, Symbols.symbol_function( $sym37$__ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject percent = number_utilities.percent( date_position, Sequences.length( dates ), THREE_INTEGER );
    return percent;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 7907L)
  public static SubLObject weighted_percent_before_date(final SubLObject universal_date, final SubLObject kbam_result)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject dates = NIL;
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( kbam_result ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject assertion = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject count = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject date = assertions_high.asserted_when( assertion );
      if( NIL != date )
      {
        dates = ConsesLow.nconc( ConsesLow.make_list( count, date ), dates );
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    dates = Sort.sort( dates, Symbols.symbol_function( $sym36$_ ), UNPROVIDED );
    final SubLObject date_position = Sequences.position( universal_date, dates, Symbols.symbol_function( $sym37$__ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject percent = number_utilities.percent( date_position, Sequences.length( dates ), THREE_INTEGER );
    return percent;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-access-metering.lisp", position = 8347L)
  public static SubLObject print_asserted_assertions_by_date(final SubLObject kbam_result, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject tuples = NIL;
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( kbam_result ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject assertion = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject count = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject date = assertions_high.asserted_when( assertion );
      if( NIL != date )
      {
        tuples = ConsesLow.cons( ConsesLow.list( assertion, date, count ), tuples );
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    tuples = Sort.sort( tuples, Symbols.symbol_function( $sym36$_ ), Symbols.symbol_function( $sym38$SECOND ) );
    SubLObject previous_date = ZERO_INTEGER;
    SubLObject cdolist_list_var = tuples;
    SubLObject tuple = NIL;
    tuple = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = tuple;
      SubLObject assertion2 = NIL;
      SubLObject date2 = NIL;
      SubLObject count2 = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
      assertion2 = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
      date2 = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
      count2 = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( date2.numG( previous_date ) )
        {
          PrintLow.format( stream, $str40$______A, numeric_date_utilities.datestring( date2 ) );
          previous_date = date2;
        }
        print_high.print( assertion2, stream );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list39 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      tuple = cdolist_list_var.first();
    }
    return NIL;
  }

  public static SubLObject declare_kb_access_metering_file()
  {
    SubLFiles.declareMacro( me, "with_kb_access_metering", "WITH-KB-ACCESS-METERING" );
    SubLFiles.declareFunction( me, "eval_with_kb_access_metering", "EVAL-WITH-KB-ACCESS-METERING", 1, 2, false );
    SubLFiles.declareFunction( me, "new_kb_access_metering_table", "NEW-KB-ACCESS-METERING-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "postprocess_kb_access_metering_table", "POSTPROCESS-KB-ACCESS-METERING-TABLE", 3, 0, false );
    SubLFiles.declareFunction( me, "possibly_note_kb_access_constant", "POSSIBLY-NOTE-KB-ACCESS-CONSTANT", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_note_kb_access_nart", "POSSIBLY-NOTE-KB-ACCESS-NART", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_note_kb_access_assertion", "POSSIBLY-NOTE-KB-ACCESS-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "note_kb_access_assertion", "NOTE-KB-ACCESS-ASSERTION", 1, 0, false );
    SubLFiles.declareMacro( me, "possibly_note_kb_access_sbhl_link", "POSSIBLY-NOTE-KB-ACCESS-SBHL-LINK" );
    SubLFiles.declareFunction( me, "note_kb_access_sbhlP", "NOTE-KB-ACCESS-SBHL?", 0, 0, false );
    SubLFiles.declareFunction( me, "kb_access_metering_asserted_assertions", "KB-ACCESS-METERING-ASSERTED-ASSERTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "mean_asserted_assertion_dates", "MEAN-ASSERTED-ASSERTION-DATES", 1, 0, false );
    SubLFiles.declareFunction( me, "median_asserted_assertion_dates", "MEDIAN-ASSERTED-ASSERTION-DATES", 1, 0, false );
    SubLFiles.declareFunction( me, "weighted_mean_asserted_assertion_dates", "WEIGHTED-MEAN-ASSERTED-ASSERTION-DATES", 1, 0, false );
    SubLFiles.declareFunction( me, "weighted_median_asserted_assertion_dates", "WEIGHTED-MEDIAN-ASSERTED-ASSERTION-DATES", 1, 0, false );
    SubLFiles.declareFunction( me, "percent_before_date", "PERCENT-BEFORE-DATE", 2, 0, false );
    SubLFiles.declareFunction( me, "weighted_percent_before_date", "WEIGHTED-PERCENT-BEFORE-DATE", 2, 0, false );
    SubLFiles.declareFunction( me, "print_asserted_assertions_by_date", "PRINT-ASSERTED-ASSERTIONS-BY-DATE", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_kb_access_metering_file()
  {
    $arete_log_kb_touchesP$ = SubLFiles.defparameter( "*ARETE-LOG-KB-TOUCHES?*", NIL );
    $arete_log_last_kb_touchP$ = SubLFiles.defparameter( "*ARETE-LOG-LAST-KB-TOUCH?*", NIL );
    $arete_log_kb_touch_countsP$ = SubLFiles.defparameter( "*ARETE-LOG-KB-TOUCH-COUNTS?*", NIL );
    $arete_assertions_touched$ = SubLFiles.defparameter( "*ARETE-ASSERTIONS-TOUCHED*", NIL );
    $arete_constants_touched$ = SubLFiles.defparameter( "*ARETE-CONSTANTS-TOUCHED*", NIL );
    $arete_narts_touched$ = SubLFiles.defparameter( "*ARETE-NARTS-TOUCHED*", NIL );
    $arete_last_assertion_touched$ = SubLFiles.deflexical( "*ARETE-LAST-ASSERTION-TOUCHED*", ( maybeDefault( $sym0$_ARETE_LAST_ASSERTION_TOUCHED_, $arete_last_assertion_touched$, NIL ) ) );
    $arete_last_term_touched$ = SubLFiles.deflexical( "*ARETE-LAST-TERM-TOUCHED*", ( maybeDefault( $sym1$_ARETE_LAST_TERM_TOUCHED_, $arete_last_term_touched$, NIL ) ) );
    $arete_last_constant_touched$ = SubLFiles.deflexical( "*ARETE-LAST-CONSTANT-TOUCHED*", ( maybeDefault( $sym2$_ARETE_LAST_CONSTANT_TOUCHED_, $arete_last_constant_touched$, NIL ) ) );
    $arete_last_nart_touched$ = SubLFiles.deflexical( "*ARETE-LAST-NART-TOUCHED*", ( maybeDefault( $sym3$_ARETE_LAST_NART_TOUCHED_, $arete_last_nart_touched$, NIL ) ) );
    $arete_assertions_touched_count$ = SubLFiles.defparameter( "*ARETE-ASSERTIONS-TOUCHED-COUNT*", NIL );
    $arete_terms_touched_count$ = SubLFiles.defparameter( "*ARETE-TERMS-TOUCHED-COUNT*", NIL );
    $kb_access_metering_enabledP$ = SubLFiles.deflexical( "*KB-ACCESS-METERING-ENABLED?*", ( maybeDefault( $sym4$_KB_ACCESS_METERING_ENABLED__, $kb_access_metering_enabledP$, NIL ) ) );
    $kb_access_metering_domains$ = SubLFiles.defparameter( "*KB-ACCESS-METERING-DOMAINS*", NIL );
    $kb_access_metering_table$ = SubLFiles.defparameter( "*KB-ACCESS-METERING-TABLE*", NIL );
    return NIL;
  }

  public static SubLObject setup_kb_access_metering_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_ARETE_LAST_ASSERTION_TOUCHED_ );
    subl_macro_promotions.declare_defglobal( $sym1$_ARETE_LAST_TERM_TOUCHED_ );
    subl_macro_promotions.declare_defglobal( $sym2$_ARETE_LAST_CONSTANT_TOUCHED_ );
    subl_macro_promotions.declare_defglobal( $sym3$_ARETE_LAST_NART_TOUCHED_ );
    subl_macro_promotions.declare_defglobal( $sym4$_KB_ACCESS_METERING_ENABLED__ );
    access_macros.register_macro_helper( $sym15$NEW_KB_ACCESS_METERING_TABLE, $sym23$WITH_KB_ACCESS_METERING );
    access_macros.register_macro_helper( $sym21$POSTPROCESS_KB_ACCESS_METERING_TABLE, $sym23$WITH_KB_ACCESS_METERING );
    access_macros.register_macro_helper( $sym31$NOTE_KB_ACCESS_SBHL_, $sym32$POSSIBLY_NOTE_KB_ACCESS_SBHL_LINK );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_kb_access_metering_file();
  }

  @Override
  public void initializeVariables()
  {
    init_kb_access_metering_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_kb_access_metering_file();
  }
  static
  {
    me = new kb_access_metering();
    $arete_log_kb_touchesP$ = null;
    $arete_log_last_kb_touchP$ = null;
    $arete_log_kb_touch_countsP$ = null;
    $arete_assertions_touched$ = null;
    $arete_constants_touched$ = null;
    $arete_narts_touched$ = null;
    $arete_last_assertion_touched$ = null;
    $arete_last_term_touched$ = null;
    $arete_last_constant_touched$ = null;
    $arete_last_nart_touched$ = null;
    $arete_assertions_touched_count$ = null;
    $arete_terms_touched_count$ = null;
    $kb_access_metering_enabledP$ = null;
    $kb_access_metering_domains$ = null;
    $kb_access_metering_table$ = null;
    $sym0$_ARETE_LAST_ASSERTION_TOUCHED_ = makeSymbol( "*ARETE-LAST-ASSERTION-TOUCHED*" );
    $sym1$_ARETE_LAST_TERM_TOUCHED_ = makeSymbol( "*ARETE-LAST-TERM-TOUCHED*" );
    $sym2$_ARETE_LAST_CONSTANT_TOUCHED_ = makeSymbol( "*ARETE-LAST-CONSTANT-TOUCHED*" );
    $sym3$_ARETE_LAST_NART_TOUCHED_ = makeSymbol( "*ARETE-LAST-NART-TOUCHED*" );
    $sym4$_KB_ACCESS_METERING_ENABLED__ = makeSymbol( "*KB-ACCESS-METERING-ENABLED?*" );
    $list5 = ConsesLow.list( ConsesLow.list( makeSymbol( "RESULT-VAR" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "DOMAINS" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeSymbol( "QUOTE" ),
        ConsesLow.list( makeKeyword( "ASSERTION" ) ) ) ) ), makeSymbol( "OPTIONS" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list6 = ConsesLow.list( makeKeyword( "DOMAINS" ), makeKeyword( "OPTIONS" ) );
    $kw7$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw8$DOMAINS = makeKeyword( "DOMAINS" );
    $list9 = ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "ASSERTION" ) ) );
    $kw10$OPTIONS = makeKeyword( "OPTIONS" );
    $sym11$DOMAINS_VAR = makeUninternedSymbol( "DOMAINS-VAR" );
    $sym12$OPTIONS_VAR = makeUninternedSymbol( "OPTIONS-VAR" );
    $sym13$TABLE_VAR = makeUninternedSymbol( "TABLE-VAR" );
    $sym14$CLET = makeSymbol( "CLET" );
    $sym15$NEW_KB_ACCESS_METERING_TABLE = makeSymbol( "NEW-KB-ACCESS-METERING-TABLE" );
    $sym16$_KB_ACCESS_METERING_DOMAINS_ = makeSymbol( "*KB-ACCESS-METERING-DOMAINS*" );
    $sym17$_KB_ACCESS_METERING_TABLE_ = makeSymbol( "*KB-ACCESS-METERING-TABLE*" );
    $sym18$CUNWIND_PROTECT = makeSymbol( "CUNWIND-PROTECT" );
    $sym19$PROGN = makeSymbol( "PROGN" );
    $sym20$CSETQ = makeSymbol( "CSETQ" );
    $sym21$POSTPROCESS_KB_ACCESS_METERING_TABLE = makeSymbol( "POSTPROCESS-KB-ACCESS-METERING-TABLE" );
    $list22 = ConsesLow.list( makeKeyword( "ASSERTION" ) );
    $sym23$WITH_KB_ACCESS_METERING = makeSymbol( "WITH-KB-ACCESS-METERING" );
    $kw24$CONSTANT = makeKeyword( "CONSTANT" );
    $kw25$NART = makeKeyword( "NART" );
    $kw26$ASSERTION = makeKeyword( "ASSERTION" );
    $list27 = ConsesLow.list( makeSymbol( "NODE" ), makeSymbol( "LINK-NODE" ) );
    $sym28$PWHEN = makeSymbol( "PWHEN" );
    $list29 = ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "*KB-ACCESS-METERING-ENABLED?*" ), ConsesLow.list( makeSymbol( "NOTE-KB-ACCESS-SBHL?" ) ) );
    $sym30$NOTE_KB_ACCESS_SBHL_LINK = makeSymbol( "NOTE-KB-ACCESS-SBHL-LINK" );
    $sym31$NOTE_KB_ACCESS_SBHL_ = makeSymbol( "NOTE-KB-ACCESS-SBHL?" );
    $sym32$POSSIBLY_NOTE_KB_ACCESS_SBHL_LINK = makeSymbol( "POSSIBLY-NOTE-KB-ACCESS-SBHL-LINK" );
    $kw33$SBHL = makeKeyword( "SBHL" );
    $sym34$ASSERTED_WHEN = makeSymbol( "ASSERTED-WHEN" );
    $sym35$UNIVERSAL_TIME_FOR_START_OF_UNIVERSAL_DATE = makeSymbol( "UNIVERSAL-TIME-FOR-START-OF-UNIVERSAL-DATE" );
    $sym36$_ = makeSymbol( "<" );
    $sym37$__ = makeSymbol( "<=" );
    $sym38$SECOND = makeSymbol( "SECOND" );
    $list39 = ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "DATE" ), makeSymbol( "COUNT" ) );
    $str40$______A = makeString( "~%;; ~A" );
  }
}
/*
 * 
 * Total time: 307 ms
 * 
 */