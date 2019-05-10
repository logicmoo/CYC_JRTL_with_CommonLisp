package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class parsing_macros
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.parsing_macros";
  public static final String myFingerPrint = "e90cf7d0bfb32707a32f8fdb6ebd04ce84cb90f2d1845bfc1406ce0e838ec290";
  @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 796L)
  public static SubLSymbol $parsing_timeout_time$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 849L)
  public static SubLSymbol $parsing_timeout_reachedP$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 905L)
  public static SubLSymbol $parsing_timeout_time_check_count$;
  @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 6074L)
  public static SubLSymbol $psp_sbhl_resourcing_limit$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$CLET;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$_PARSING_TIMEOUT_TIME_;
  private static final SubLSymbol $sym4$PARSING_COMPUTE_TIMEOUT_TIME;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$PUNLESS;
  private static final SubLSymbol $sym8$_PARSING_TIMEOUT_REACHED__;
  private static final SubLSymbol $sym9$CSETQ;
  private static final SubLList $list10;
  private static final SubLSymbol $sym11$PIF;
  private static final SubLSymbol $sym12$WITH_PARSING_TIMEOUT;
  private static final SubLSymbol $sym13$PROGN;
  private static final SubLList $list14;
  private static final SubLList $list15;
  private static final SubLSymbol $sym16$CHART;
  private static final SubLSymbol $sym17$WITH_MEMOIZATION_STATE;
  private static final SubLSymbol $sym18$PSP_CHART_MEMOIZATION_STATE;
  private static final SubLSymbol $sym19$_PSP_CHART_;
  private static final SubLList $list20;
  private static final SubLList $list21;
  private static final SubLSymbol $kw22$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw23$GAP_TYPE;
  private static final SubLSymbol $kw24$NONE;
  private static final SubLSymbol $sym25$START_INDEX;
  private static final SubLSymbol $sym26$END_INDEX;
  private static final SubLSymbol $sym27$CHART;
  private static final SubLSymbol $sym28$PWHEN;
  private static final SubLSymbol $sym29$COR;
  private static final SubLList $list30;
  private static final SubLSymbol $sym31$PSP_CHART_MATCHES_GAP_TYPE_P;
  private static final SubLSymbol $sym32$CMULTIPLE_VALUE_SETQ;
  private static final SubLSymbol $sym33$PSP_FIND_STRING_IN_CHARTS;
  private static final SubLList $list34;
  private static final SubLSymbol $sym35$_PSP_CHART_START_INDEX_;
  private static final SubLSymbol $sym36$_PSP_CHART_END_INDEX_;
  private static final SubLSymbol $sym37$PSP_CHART_DO_SYNTACTIC_PARSING;
  private static final SubLList $list38;
  private static final SubLSymbol $sym39$WITH_PSP_CHART;
  private static final SubLSymbol $sym40$PSP_CHART_FOR_STRING;
  private static final SubLList $list41;
  private static final SubLList $list42;
  private static final SubLSymbol $sym43$GET_PSP_LEXICON;
  private static final SubLSymbol $sym44$WITH_PSP_CHART_FOR_STRING;
  private static final SubLList $list45;
  private static final SubLSymbol $sym46$_PSP_EXTRA_CHARTS_;
  private static final SubLSymbol $sym47$WITH_INFERENCE_MT_RELEVANCE;
  private static final SubLList $list48;
  private static final SubLList $list49;
  private static final SubLList $list50;
  private static final SubLSymbol $kw51$DONE;
  private static final SubLSymbol $sym52$CSOME;
  private static final SubLSymbol $sym53$PSP_EDGE_DTRS;
  private static final SubLList $list54;
  private static final SubLSymbol $sym55$I;
  private static final SubLSymbol $sym56$CSOME_NUMBERED;
  private static final SubLSymbol $sym57$1_;
  private static final SubLSymbol $sym58$WITH_SBHL_RESOURCED_MARKING_SPACES;
  private static final SubLSymbol $sym59$_PSP_SBHL_RESOURCING_LIMIT_;
  private static final SubLList $list60;
  private static final SubLSymbol $sym61$CHECK_TYPE;
  private static final SubLList $list62;
  private static final SubLSymbol $sym63$_PARSER_CYCL_BLACKLIST_;
  private static final SubLList $list64;
  private static final SubLList $list65;
  private static final SubLSymbol $sym66$ENVIRONMENT;
  private static final SubLSymbol $sym67$STRING;
  private static final SubLSymbol $sym68$BEST;
  private static final SubLSymbol $sym69$REST;
  private static final SubLSymbol $sym70$EDGE;
  private static final SubLSymbol $sym71$EDGE_SETS;
  private static final SubLSymbol $sym72$_OPTIONAL;
  private static final SubLList $list73;
  private static final SubLString $str74$_CACHED;
  private static final SubLString $str75$CLEAR_;
  private static final SubLString $str76$_CACHED_INTERNAL;
  private static final SubLString $str77$_EDGE_SETS;
  private static final SubLString $str78$_EDGE_CYCLS;
  private static final SubLSymbol $sym79$DECLAIM;
  private static final SubLSymbol $sym80$FACCESS;
  private static final SubLSymbol $sym81$PRIVATE;
  private static final SubLSymbol $sym82$DEFINE_CACHED_NEW;
  private static final SubLList $list83;
  private static final SubLSymbol $sym84$IGNORE;
  private static final SubLList $list85;
  private static final SubLSymbol $sym86$CAND;
  private static final SubLSymbol $sym87$_REIFY_PARSE_NODES__;
  private static final SubLSymbol $sym88$SET_PARSE_ROOT_NODE;
  private static final SubLSymbol $sym89$PSP_FIND_OR_CREATE_NODE_FOR_EDGES;
  private static final SubLSymbol $sym90$SET_UNION;
  private static final SubLList $list91;
  private static final SubLSymbol $sym92$PSP_ACCUMULATE_ANSWERS;
  private static final SubLSymbol $sym93$RET;
  private static final SubLSymbol $sym94$VALUES;
  private static final SubLSymbol $sym95$DEFINE;
  private static final SubLList $list96;
  private static final SubLList $list97;
  private static final SubLSymbol $sym98$DEFINE_PRIVATE;
  private static final SubLList $list99;
  private static final SubLList $list100;
  private static final SubLSymbol $sym101$WITH_PSP_SBHL_RESOURCING;
  private static final SubLList $list102;
  private static final SubLSymbol $sym103$DEFINE_PSP_INTERFACE_HELPER;
  private static final SubLSymbol $sym104$BYPASS_PSP_CACHES_;
  private static final SubLList $list105;
  private static final SubLList $list106;
  private static final SubLSymbol $sym107$BOUNDP;
  private static final SubLList $list108;
  private static final SubLList $list109;
  private static final SubLList $list110;
  private static final SubLSymbol $sym111$NL_TAG_TEMPLATES;
  private static final SubLSymbol $sym112$PSP_STRIP_AND_REMEMBER_NL_TAGS;
  private static final SubLSymbol $sym113$PSP_ADD_NL_TAG_TEMPLATES;
  private static final SubLSymbol $sym114$PSP_PROMOTING_NL_TAGS;
  private static final SubLList $list115;
  private static final SubLSymbol $sym116$_SPEAKER_REFERENT_;
  private static final SubLList $list117;
  private static final SubLSymbol $sym118$_NPP_USE_STRINGS_FOR_SEMANTICS__;

  @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 967L)
  public static SubLObject with_parsing_timeout(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject delay_in_seconds = NIL;
    SubLObject timed_outP = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    delay_in_seconds = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    timed_outP = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym1$CLET, ConsesLow.listS( $list2, ConsesLow.list( $sym3$_PARSING_TIMEOUT_TIME_, ConsesLow.list( $sym4$PARSING_COMPUTE_TIMEOUT_TIME, delay_in_seconds ) ), $list5 ), $list6, ConsesLow.listS(
          $sym7$PUNLESS, $sym8$_PARSING_TIMEOUT_REACHED__, ConsesLow.append( body, NIL ) ), ConsesLow.listS( $sym9$CSETQ, timed_outP, $list10 ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 1976L)
  public static SubLObject possibly_with_parsing_timeout(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject delay_in_seconds = NIL;
    SubLObject timed_outP = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    delay_in_seconds = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    timed_outP = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym11$PIF, delay_in_seconds, ConsesLow.listS( $sym12$WITH_PARSING_TIMEOUT, ConsesLow.list( delay_in_seconds, timed_outP ), ConsesLow.append( body, NIL ) ), reader.bq_cons( $sym13$PROGN,
          ConsesLow.append( body, ConsesLow.list( ConsesLow.listS( $sym9$CSETQ, timed_outP, $list14 ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 2222L)
  public static SubLObject parsing_timeout_time_reachedP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !$parsing_timeout_time$.getDynamicValue( thread ).isNumber() )
    {
      return NIL;
    }
    if( NIL != $parsing_timeout_reachedP$.getDynamicValue( thread ) )
    {
      return T;
    }
    if( parsing_timeout_current_time().numGE( $parsing_timeout_time$.getDynamicValue( thread ) ) )
    {
      $parsing_timeout_reachedP$.setDynamicValue( T, thread );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 2574L)
  public static SubLObject parsing_timeout_time_passed_by()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != parsing_timeout_time_reachedP() )
    {
      return Numbers.subtract( parsing_timeout_current_time(), $parsing_timeout_time$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 2836L)
  public static SubLObject parsing_timeout_time_remaining()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !$parsing_timeout_time$.getDynamicValue( thread ).isNumber() )
    {
      return NIL;
    }
    if( NIL != $parsing_timeout_reachedP$.getDynamicValue( thread ) )
    {
      return ZERO_INTEGER;
    }
    final SubLObject computed = Numbers.subtract( $parsing_timeout_time$.getDynamicValue( thread ), parsing_timeout_current_time() );
    if( NIL == number_utilities.positive_number_p( computed ) )
    {
      $parsing_timeout_reachedP$.setDynamicValue( T, thread );
    }
    return ( NIL != $parsing_timeout_reachedP$.getDynamicValue( thread ) ) ? ZERO_INTEGER : Numbers.divide( computed, time_high.$internal_time_units_per_second$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 3336L)
  public static SubLObject parsing_timeout_current_time()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $parsing_timeout_time_check_count$.setDynamicValue( Numbers.add( $parsing_timeout_time_check_count$.getDynamicValue( thread ), ONE_INTEGER ), thread );
    return Time.get_internal_real_time();
  }

  @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 3465L)
  public static SubLObject parsing_compute_timeout_time(final SubLObject delay_in_seconds)
  {
    final SubLObject current_time = parsing_timeout_current_time();
    final SubLObject offset = Numbers.floor( Numbers.multiply( delay_in_seconds, time_high.$internal_time_units_per_second$.getGlobalValue() ), UNPROVIDED );
    return Numbers.add( current_time, offset );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 3732L)
  public static SubLObject with_psp_chart(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject chart_form = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
    chart_form = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject chart = $sym16$CHART;
    return ConsesLow.list( $sym1$CLET, ConsesLow.list( ConsesLow.list( chart, chart_form ) ), ConsesLow.list( $sym17$WITH_MEMOIZATION_STATE, ConsesLow.list( ConsesLow.list( $sym18$PSP_CHART_MEMOIZATION_STATE, chart ) ),
        ConsesLow.listS( $sym1$CLET, ConsesLow.list( ConsesLow.list( $sym19$_PSP_CHART_, chart ) ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 4091L)
  public static SubLObject with_psp_chart_for_string(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject input_string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
    input_string = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list20 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list20 );
      if( NIL == conses_high.member( current_$1, $list21, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw22$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list20 );
    }
    final SubLObject gap_type_tail = cdestructuring_bind.property_list_member( $kw23$GAP_TYPE, current );
    final SubLObject gap_type = ( NIL != gap_type_tail ) ? conses_high.cadr( gap_type_tail ) : $kw24$NONE;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject start_index = $sym25$START_INDEX;
    final SubLObject end_index = $sym26$END_INDEX;
    final SubLObject chart = $sym27$CHART;
    return ConsesLow.list( $sym1$CLET, ConsesLow.list( reader.bq_cons( start_index, $list14 ), reader.bq_cons( end_index, $list14 ), reader.bq_cons( chart, $list14 ) ), ConsesLow.list( $sym28$PWHEN, ConsesLow.list(
        $sym29$COR, $list30, ConsesLow.list( $sym31$PSP_CHART_MATCHES_GAP_TYPE_P, $sym19$_PSP_CHART_, gap_type ) ), ConsesLow.list( $sym32$CMULTIPLE_VALUE_SETQ, ConsesLow.list( start_index, end_index, chart ), ConsesLow
            .listS( $sym33$PSP_FIND_STRING_IN_CHARTS, input_string, $list34 ) ) ), ConsesLow.list( $sym11$PIF, start_index, ConsesLow.listS( $sym1$CLET, ConsesLow.list( ConsesLow.list( $sym35$_PSP_CHART_START_INDEX_,
                start_index ), ConsesLow.list( $sym36$_PSP_CHART_END_INDEX_, end_index ), ConsesLow.list( $sym19$_PSP_CHART_, chart ) ), ConsesLow.list( $sym37$PSP_CHART_DO_SYNTACTIC_PARSING, chart ), ConsesLow.append(
                    body, NIL ) ), ConsesLow.list( $sym1$CLET, $list38, ConsesLow.listS( $sym39$WITH_PSP_CHART, ConsesLow.list( $sym40$PSP_CHART_FOR_STRING, input_string, $list41, gap_type ), ConsesLow.append( body,
                        $list42 ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 5070L)
  public static SubLObject get_psp_lexicon()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != misc_utilities.initialized_p( parsing_vars.$psp_lexicon$.getDynamicValue( thread ) ) ) ? parsing_vars.$psp_lexicon$.getDynamicValue( thread )
        : psp_lexicon.get_default_psp_lexicon( UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 5243L)
  public static SubLObject psp_chart_matches_gap_type_p(final SubLObject chart, final SubLObject gap_type)
  {
    return makeBoolean( NIL != psp_chart.phrase_structure_parser_chart_p( chart ) && psp_chart.psp_chart_gap_type( chart ).equal( gap_type ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 5454L)
  public static SubLObject with_extra_psp_charts(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list45 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject charts = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list45 );
    charts = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym1$CLET, ConsesLow.list( ConsesLow.list( $sym46$_PSP_EXTRA_CHARTS_, charts ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list45 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 5577L)
  public static SubLObject with_psp_lexicon_mt_relevance(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym47$WITH_INFERENCE_MT_RELEVANCE, $list48, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 5713L)
  public static SubLObject psp_edge_do_dtrs(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject dtr = NIL;
    SubLObject edge = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
    dtr = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list49 );
    edge = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list49 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list49 );
      if( NIL == conses_high.member( current_$2, $list50, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw22$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list49 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw51$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym52$CSOME, ConsesLow.list( dtr, ConsesLow.list( $sym53$PSP_EDGE_DTRS, edge ), done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 5848L)
  public static SubLObject psp_edge_do_dtrs_numbered(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list54 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject dtr = NIL;
    SubLObject dtr_num = NIL;
    SubLObject edge = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list54 );
    dtr = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list54 );
    dtr_num = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list54 );
    edge = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$3 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list54 );
      current_$3 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list54 );
      if( NIL == conses_high.member( current_$3, $list50, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$3 == $kw22$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list54 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw51$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject i = $sym55$I;
    return ConsesLow.list( $sym56$CSOME_NUMBERED, ConsesLow.list( dtr, i, ConsesLow.list( $sym53$PSP_EDGE_DTRS, edge ), done ), ConsesLow.listS( $sym1$CLET, ConsesLow.list( ConsesLow.list( dtr_num, ConsesLow.list(
        $sym57$1_, i ) ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 6222L)
  public static SubLObject with_psp_sbhl_resourcing(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym58$WITH_SBHL_RESOURCED_MARKING_SPACES, $sym59$_PSP_SBHL_RESOURCING_LIMIT_, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 6366L)
  public static SubLObject with_parser_blacklist(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject blacklist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list60 );
    blacklist = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym13$PROGN, ConsesLow.listS( $sym61$CHECK_TYPE, blacklist, $list62 ), ConsesLow.listS( $sym1$CLET, ConsesLow.list( ConsesLow.list( $sym63$_PARSER_CYCL_BLACKLIST_, blacklist ) ), ConsesLow
        .append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 6608L)
  public static SubLObject with_pos_pred_parse_filter(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym1$CLET, $list64, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 6758L)
  public static SubLObject define_psp_interface_helper(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject edge_set_args = NIL;
    SubLObject edge_set_fn_def = NIL;
    SubLObject edge_cycls_fn_def = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list65 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list65 );
    edge_set_args = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list65 );
    edge_set_fn_def = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list65 );
    edge_cycls_fn_def = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject environment_$4 = $sym66$ENVIRONMENT;
      final SubLObject string = $sym67$STRING;
      final SubLObject best = $sym68$BEST;
      final SubLObject rest = $sym69$REST;
      final SubLObject edge = $sym70$EDGE;
      final SubLObject edge_sets = $sym71$EDGE_SETS;
      final SubLObject basic_arg_list = ConsesLow.cons( string, edge_set_args );
      final SubLObject full_arg_list = ConsesLow.append( basic_arg_list, ConsesLow.list( $sym72$_OPTIONAL, reader.bq_cons( environment_$4, $list73 ) ) );
      final SubLObject cached_fn = Packages.intern( Sequences.cconcatenate( Symbols.symbol_name( name ), $str74$_CACHED ), UNPROVIDED );
      final SubLObject clearer = Packages.intern( Sequences.cconcatenate( $str75$CLEAR_, Symbols.symbol_name( cached_fn ) ), UNPROVIDED );
      final SubLObject cached_internal_fn = Packages.intern( Sequences.cconcatenate( Symbols.symbol_name( name ), $str76$_CACHED_INTERNAL ), UNPROVIDED );
      final SubLObject edge_set_fn = Packages.intern( Sequences.cconcatenate( Symbols.symbol_name( name ), $str77$_EDGE_SETS ), UNPROVIDED );
      final SubLObject edge_cycls_fn = Packages.intern( Sequences.cconcatenate( Symbols.symbol_name( name ), $str78$_EDGE_CYCLS ), UNPROVIDED );
      final SubLObject item_var = clearer;
      if( NIL == conses_high.member( item_var, parsing_vars.$psp_cached_interface_helper_clearing_functions$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        parsing_vars.$psp_cached_interface_helper_clearing_functions$.setGlobalValue( ConsesLow.cons( item_var, parsing_vars.$psp_cached_interface_helper_clearing_functions$.getGlobalValue() ) );
      }
      return ConsesLow.list( $sym13$PROGN, ConsesLow.list( $sym79$DECLAIM, ConsesLow.list( $sym80$FACCESS, $sym81$PRIVATE, name, cached_fn, cached_internal_fn ) ), ConsesLow.list( $sym82$DEFINE_CACHED_NEW, cached_fn,
          full_arg_list, $list83, ConsesLow.list( $sym84$IGNORE, environment_$4 ), ConsesLow.list( $sym1$CLET, ConsesLow.list( reader.bq_cons( best, $list14 ), reader.bq_cons( rest, $list14 ) ), ConsesLow.list(
              $sym44$WITH_PSP_CHART_FOR_STRING, reader.bq_cons( string, $list85 ), ConsesLow.list( $sym1$CLET, ConsesLow.list( ConsesLow.list( edge_sets, reader.bq_cons( edge_set_fn, edge_set_args ) ) ), ConsesLow.list(
                  $sym28$PWHEN, ConsesLow.list( $sym86$CAND, $sym87$_REIFY_PARSE_NODES__, edge_sets ), ConsesLow.list( $sym88$SET_PARSE_ROOT_NODE, ConsesLow.list( $sym89$PSP_FIND_OR_CREATE_NODE_FOR_EDGES, ConsesLow
                      .listS( $sym90$SET_UNION, edge_sets, $list91 ) ) ) ), ConsesLow.list( $sym92$PSP_ACCUMULATE_ANSWERS, ConsesLow.list( edge, edge_sets, best, rest ), ConsesLow.list( edge_cycls_fn, edge ) ) ) ),
              ConsesLow.list( $sym93$RET, ConsesLow.list( $sym94$VALUES, best, rest ) ) ) ), ConsesLow.list( $sym95$DEFINE, name, basic_arg_list, ConsesLow.list( $sym11$PIF, $list96, ConsesLow.list( $sym93$RET, reader
                  .bq_cons( cached_internal_fn, ConsesLow.append( basic_arg_list, ConsesLow.list( $list97 ) ) ) ), ConsesLow.list( $sym93$RET, reader.bq_cons( cached_fn, basic_arg_list ) ) ) ), ConsesLow.list(
                      $sym98$DEFINE_PRIVATE, edge_set_fn, edge_set_args, edge_set_fn_def ), ConsesLow.list( $sym98$DEFINE_PRIVATE, edge_cycls_fn, $list99, ConsesLow.listS( $sym1$CLET, $list100, ConsesLow.list(
                          $sym101$WITH_PSP_SBHL_RESOURCING, edge_cycls_fn_def ), $list102 ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list65 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 9117L)
  public static SubLObject set_parse_root_node(final SubLObject node)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    parsing_vars.$parse_root_node$.setDynamicValue( node, thread );
    return parsing_vars.$parse_root_node$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 9265L)
  public static SubLObject bypass_psp_cachesP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != parsing_vars.$reify_parse_nodesP$.getDynamicValue( thread ) || NIL != parsing_vars.$bypass_psp_cachesP$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 9410L)
  public static SubLObject setting_parse_root_node(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list105 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject root_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list105 );
    root_var = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym1$CLET, ConsesLow.list( $list106, ConsesLow.list( $sym87$_REIFY_PARSE_NODES__, ConsesLow.list( $sym107$BOUNDP, root_var ) ) ), ConsesLow.append( body, ConsesLow.list( ConsesLow.listS(
          $sym9$CSETQ, root_var, $list108 ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list105 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 9734L)
  public static SubLObject with_new_variable_uniquification_state(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym1$CLET, $list109, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 9896L)
  public static SubLObject psp_promoting_nl_tags(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list110 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject from_psp_cycl = NIL;
    SubLObject to_psp_cycl = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list110 );
    from_psp_cycl = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list110 );
    to_psp_cycl = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject nl_tag_templates = $sym111$NL_TAG_TEMPLATES;
      return ConsesLow.listS( $sym1$CLET, ConsesLow.list( nl_tag_templates ), ConsesLow.list( $sym32$CMULTIPLE_VALUE_SETQ, ConsesLow.list( from_psp_cycl, nl_tag_templates ), ConsesLow.list(
          $sym112$PSP_STRIP_AND_REMEMBER_NL_TAGS, from_psp_cycl ) ), ConsesLow.append( body, ConsesLow.list( ConsesLow.list( $sym9$CSETQ, to_psp_cycl, ConsesLow.list( $sym113$PSP_ADD_NL_TAG_TEMPLATES, to_psp_cycl,
              nl_tag_templates ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list110 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 10400L)
  public static SubLObject psp_strip_and_remember_nl_tags(final SubLObject psp_cycl)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != psp_semantics.psp_weighted_cycl_p( psp_cycl ) )
    {
      final SubLObject cycl = psp_semantics.psp_cycl_cycl( psp_cycl );
      thread.resetMultipleValues();
      final SubLObject stripped = parsing_utilities.strip_nl_tags_top_level( cycl );
      final SubLObject nl_tag_templates = thread.secondMultipleValue();
      thread.resetMultipleValues();
      psp_semantics.psp_weighted_cycl_set_cycl( psp_cycl, stripped );
      return Values.values( psp_cycl, nl_tag_templates );
    }
    return parsing_utilities.strip_nl_tags_top_level( psp_cycl );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 10819L)
  public static SubLObject psp_add_nl_tag_templates(SubLObject psp_cycl, final SubLObject nl_tag_templates)
  {
    SubLObject cdolist_list_var = nl_tag_templates;
    SubLObject nl_tag_template = NIL;
    nl_tag_template = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      psp_cycl = psp_add_nl_tag_template( psp_cycl, nl_tag_template );
      cdolist_list_var = cdolist_list_var.rest();
      nl_tag_template = cdolist_list_var.first();
    }
    return psp_cycl;
  }

  @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 11064L)
  public static SubLObject psp_add_nl_tag_template(final SubLObject psp_cycl, final SubLObject nl_tag_template)
  {
    if( NIL != psp_semantics.psp_weighted_cycl_p( psp_cycl ) )
    {
      final SubLObject cycl = psp_semantics.psp_cycl_cycl( psp_cycl );
      final SubLObject replaced = psp_add_nl_tag_template( cycl, nl_tag_template );
      psp_semantics.psp_weighted_cycl_set_cycl( psp_cycl, replaced );
      return psp_cycl;
    }
    return parsing_utilities.add_nl_tag_template( psp_cycl, nl_tag_template );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 11411L)
  public static SubLObject with_speaker_referent(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject referent = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list115 );
    referent = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym1$CLET, ConsesLow.list( ConsesLow.list( $sym116$_SPEAKER_REFERENT_, referent ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/parsing-macros.lisp", position = 11610L)
  public static SubLObject with_new_ncs_using_stringsP(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject new_string_based_ncsP = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list117 );
    new_string_based_ncsP = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym1$CLET, ConsesLow.list( ConsesLow.list( $sym118$_NPP_USE_STRINGS_FOR_SEMANTICS__, new_string_based_ncsP ) ), ConsesLow.append( body, NIL ) );
  }

  public static SubLObject declare_parsing_macros_file()
  {
    SubLFiles.declareMacro( me, "with_parsing_timeout", "WITH-PARSING-TIMEOUT" );
    SubLFiles.declareMacro( me, "possibly_with_parsing_timeout", "POSSIBLY-WITH-PARSING-TIMEOUT" );
    SubLFiles.declareFunction( me, "parsing_timeout_time_reachedP", "PARSING-TIMEOUT-TIME-REACHED?", 0, 0, false );
    SubLFiles.declareFunction( me, "parsing_timeout_time_passed_by", "PARSING-TIMEOUT-TIME-PASSED-BY", 0, 0, false );
    SubLFiles.declareFunction( me, "parsing_timeout_time_remaining", "PARSING-TIMEOUT-TIME-REMAINING", 0, 0, false );
    SubLFiles.declareFunction( me, "parsing_timeout_current_time", "PARSING-TIMEOUT-CURRENT-TIME", 0, 0, false );
    SubLFiles.declareFunction( me, "parsing_compute_timeout_time", "PARSING-COMPUTE-TIMEOUT-TIME", 1, 0, false );
    SubLFiles.declareMacro( me, "with_psp_chart", "WITH-PSP-CHART" );
    SubLFiles.declareMacro( me, "with_psp_chart_for_string", "WITH-PSP-CHART-FOR-STRING" );
    SubLFiles.declareFunction( me, "get_psp_lexicon", "GET-PSP-LEXICON", 0, 0, false );
    SubLFiles.declareFunction( me, "psp_chart_matches_gap_type_p", "PSP-CHART-MATCHES-GAP-TYPE-P", 2, 0, false );
    SubLFiles.declareMacro( me, "with_extra_psp_charts", "WITH-EXTRA-PSP-CHARTS" );
    SubLFiles.declareMacro( me, "with_psp_lexicon_mt_relevance", "WITH-PSP-LEXICON-MT-RELEVANCE" );
    SubLFiles.declareMacro( me, "psp_edge_do_dtrs", "PSP-EDGE-DO-DTRS" );
    SubLFiles.declareMacro( me, "psp_edge_do_dtrs_numbered", "PSP-EDGE-DO-DTRS-NUMBERED" );
    SubLFiles.declareMacro( me, "with_psp_sbhl_resourcing", "WITH-PSP-SBHL-RESOURCING" );
    SubLFiles.declareMacro( me, "with_parser_blacklist", "WITH-PARSER-BLACKLIST" );
    SubLFiles.declareMacro( me, "with_pos_pred_parse_filter", "WITH-POS-PRED-PARSE-FILTER" );
    SubLFiles.declareMacro( me, "define_psp_interface_helper", "DEFINE-PSP-INTERFACE-HELPER" );
    SubLFiles.declareFunction( me, "set_parse_root_node", "SET-PARSE-ROOT-NODE", 1, 0, false );
    SubLFiles.declareFunction( me, "bypass_psp_cachesP", "BYPASS-PSP-CACHES?", 0, 0, false );
    SubLFiles.declareMacro( me, "setting_parse_root_node", "SETTING-PARSE-ROOT-NODE" );
    SubLFiles.declareMacro( me, "with_new_variable_uniquification_state", "WITH-NEW-VARIABLE-UNIQUIFICATION-STATE" );
    SubLFiles.declareMacro( me, "psp_promoting_nl_tags", "PSP-PROMOTING-NL-TAGS" );
    SubLFiles.declareFunction( me, "psp_strip_and_remember_nl_tags", "PSP-STRIP-AND-REMEMBER-NL-TAGS", 1, 0, false );
    SubLFiles.declareFunction( me, "psp_add_nl_tag_templates", "PSP-ADD-NL-TAG-TEMPLATES", 2, 0, false );
    SubLFiles.declareFunction( me, "psp_add_nl_tag_template", "PSP-ADD-NL-TAG-TEMPLATE", 2, 0, false );
    SubLFiles.declareMacro( me, "with_speaker_referent", "WITH-SPEAKER-REFERENT" );
    SubLFiles.declareMacro( me, "with_new_ncs_using_stringsP", "WITH-NEW-NCS-USING-STRINGS?" );
    return NIL;
  }

  public static SubLObject init_parsing_macros_file()
  {
    $parsing_timeout_time$ = SubLFiles.defparameter( "*PARSING-TIMEOUT-TIME*", NIL );
    $parsing_timeout_reachedP$ = SubLFiles.defparameter( "*PARSING-TIMEOUT-REACHED?*", NIL );
    $parsing_timeout_time_check_count$ = SubLFiles.defparameter( "*PARSING-TIMEOUT-TIME-CHECK-COUNT*", ZERO_INTEGER );
    $psp_sbhl_resourcing_limit$ = SubLFiles.defconstant( "*PSP-SBHL-RESOURCING-LIMIT*", SIX_INTEGER );
    return NIL;
  }

  public static SubLObject setup_parsing_macros_file()
  {
    access_macros.register_macro_helper( $sym4$PARSING_COMPUTE_TIMEOUT_TIME, $sym12$WITH_PARSING_TIMEOUT );
    access_macros.register_macro_helper( $sym43$GET_PSP_LEXICON, $sym44$WITH_PSP_CHART_FOR_STRING );
    access_macros.register_macro_helper( $sym31$PSP_CHART_MATCHES_GAP_TYPE_P, $sym44$WITH_PSP_CHART_FOR_STRING );
    access_macros.register_macro_helper( $sym88$SET_PARSE_ROOT_NODE, $sym103$DEFINE_PSP_INTERFACE_HELPER );
    access_macros.register_macro_helper( $sym104$BYPASS_PSP_CACHES_, $sym103$DEFINE_PSP_INTERFACE_HELPER );
    access_macros.register_macro_helper( $sym112$PSP_STRIP_AND_REMEMBER_NL_TAGS, $sym114$PSP_PROMOTING_NL_TAGS );
    access_macros.register_macro_helper( $sym113$PSP_ADD_NL_TAG_TEMPLATES, $sym114$PSP_PROMOTING_NL_TAGS );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_parsing_macros_file();
  }

  @Override
  public void initializeVariables()
  {
    init_parsing_macros_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_parsing_macros_file();
  }
  static
  {
    me = new parsing_macros();
    $parsing_timeout_time$ = null;
    $parsing_timeout_reachedP$ = null;
    $parsing_timeout_time_check_count$ = null;
    $psp_sbhl_resourcing_limit$ = null;
    $list0 = ConsesLow.list( ConsesLow.list( makeSymbol( "DELAY-IN-SECONDS" ), makeSymbol( "TIMED-OUT?" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym1$CLET = makeSymbol( "CLET" );
    $list2 = ConsesLow.list( makeSymbol( "*PARSING-TIMEOUT-TIME-CHECK-COUNT*" ), ZERO_INTEGER );
    $sym3$_PARSING_TIMEOUT_TIME_ = makeSymbol( "*PARSING-TIMEOUT-TIME*" );
    $sym4$PARSING_COMPUTE_TIMEOUT_TIME = makeSymbol( "PARSING-COMPUTE-TIMEOUT-TIME" );
    $list5 = ConsesLow.list( ConsesLow.list( makeSymbol( "*PARSING-TIMEOUT-REACHED?*" ), makeSymbol( "*PARSING-TIMEOUT-REACHED?*" ) ) );
    $list6 = ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "*PARSING-TIMEOUT-REACHED?*" ), ConsesLow.list( makeSymbol( "PARSING-TIMEOUT-TIME-REACHED?" ) ) );
    $sym7$PUNLESS = makeSymbol( "PUNLESS" );
    $sym8$_PARSING_TIMEOUT_REACHED__ = makeSymbol( "*PARSING-TIMEOUT-REACHED?*" );
    $sym9$CSETQ = makeSymbol( "CSETQ" );
    $list10 = ConsesLow.list( ConsesLow.list( makeSymbol( "PARSING-TIMEOUT-TIME-REACHED?" ) ) );
    $sym11$PIF = makeSymbol( "PIF" );
    $sym12$WITH_PARSING_TIMEOUT = makeSymbol( "WITH-PARSING-TIMEOUT" );
    $sym13$PROGN = makeSymbol( "PROGN" );
    $list14 = ConsesLow.list( NIL );
    $list15 = ConsesLow.list( makeSymbol( "CHART-FORM" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym16$CHART = makeUninternedSymbol( "CHART" );
    $sym17$WITH_MEMOIZATION_STATE = makeSymbol( "WITH-MEMOIZATION-STATE" );
    $sym18$PSP_CHART_MEMOIZATION_STATE = makeSymbol( "PSP-CHART-MEMOIZATION-STATE" );
    $sym19$_PSP_CHART_ = makeSymbol( "*PSP-CHART*" );
    $list20 = ConsesLow.list( ConsesLow.list( makeSymbol( "INPUT-STRING" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "GAP-TYPE" ), makeKeyword( "NONE" ) ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list21 = ConsesLow.list( makeKeyword( "GAP-TYPE" ) );
    $kw22$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw23$GAP_TYPE = makeKeyword( "GAP-TYPE" );
    $kw24$NONE = makeKeyword( "NONE" );
    $sym25$START_INDEX = makeUninternedSymbol( "START-INDEX" );
    $sym26$END_INDEX = makeUninternedSymbol( "END-INDEX" );
    $sym27$CHART = makeUninternedSymbol( "CHART" );
    $sym28$PWHEN = makeSymbol( "PWHEN" );
    $sym29$COR = makeSymbol( "COR" );
    $list30 = ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "*PSP-CHART*" ) );
    $sym31$PSP_CHART_MATCHES_GAP_TYPE_P = makeSymbol( "PSP-CHART-MATCHES-GAP-TYPE-P" );
    $sym32$CMULTIPLE_VALUE_SETQ = makeSymbol( "CMULTIPLE-VALUE-SETQ" );
    $sym33$PSP_FIND_STRING_IN_CHARTS = makeSymbol( "PSP-FIND-STRING-IN-CHARTS" );
    $list34 = ConsesLow.list( makeSymbol( "*PSP-CHART*" ), makeSymbol( "*PSP-EXTRA-CHARTS*" ) );
    $sym35$_PSP_CHART_START_INDEX_ = makeSymbol( "*PSP-CHART-START-INDEX*" );
    $sym36$_PSP_CHART_END_INDEX_ = makeSymbol( "*PSP-CHART-END-INDEX*" );
    $sym37$PSP_CHART_DO_SYNTACTIC_PARSING = makeSymbol( "PSP-CHART-DO-SYNTACTIC-PARSING" );
    $list38 = ConsesLow.list( ConsesLow.list( makeSymbol( "*PSP-CHART-START-INDEX*" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "*PSP-CHART-END-INDEX*" ), NIL ) );
    $sym39$WITH_PSP_CHART = makeSymbol( "WITH-PSP-CHART" );
    $sym40$PSP_CHART_FOR_STRING = makeSymbol( "PSP-CHART-FOR-STRING" );
    $list41 = ConsesLow.list( makeSymbol( "GET-PSP-LEXICON" ) );
    $list42 = ConsesLow.list( ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "*PSP-DONT-DESTROY-CHART?*" ), ConsesLow.list( makeSymbol( "DESTROY-PSP-CHART" ) ) ) );
    $sym43$GET_PSP_LEXICON = makeSymbol( "GET-PSP-LEXICON" );
    $sym44$WITH_PSP_CHART_FOR_STRING = makeSymbol( "WITH-PSP-CHART-FOR-STRING" );
    $list45 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHARTS" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym46$_PSP_EXTRA_CHARTS_ = makeSymbol( "*PSP-EXTRA-CHARTS*" );
    $sym47$WITH_INFERENCE_MT_RELEVANCE = makeSymbol( "WITH-INFERENCE-MT-RELEVANCE" );
    $list48 = ConsesLow.list( makeSymbol( "PSP-LEXICON-ROOT-MT" ) );
    $list49 = ConsesLow.list( ConsesLow.list( makeSymbol( "DTR" ), makeSymbol( "EDGE" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list50 = ConsesLow.list( makeKeyword( "DONE" ) );
    $kw51$DONE = makeKeyword( "DONE" );
    $sym52$CSOME = makeSymbol( "CSOME" );
    $sym53$PSP_EDGE_DTRS = makeSymbol( "PSP-EDGE-DTRS" );
    $list54 = ConsesLow.list( ConsesLow.list( makeSymbol( "DTR" ), makeSymbol( "DTR-NUM" ), makeSymbol( "EDGE" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym55$I = makeUninternedSymbol( "I" );
    $sym56$CSOME_NUMBERED = makeSymbol( "CSOME-NUMBERED" );
    $sym57$1_ = makeSymbol( "1+" );
    $sym58$WITH_SBHL_RESOURCED_MARKING_SPACES = makeSymbol( "WITH-SBHL-RESOURCED-MARKING-SPACES" );
    $sym59$_PSP_SBHL_RESOURCING_LIMIT_ = makeSymbol( "*PSP-SBHL-RESOURCING-LIMIT*" );
    $list60 = ConsesLow.list( makeSymbol( "BLACKLIST" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym61$CHECK_TYPE = makeSymbol( "CHECK-TYPE" );
    $list62 = ConsesLow.list( makeSymbol( "LISTP" ) );
    $sym63$_PARSER_CYCL_BLACKLIST_ = makeSymbol( "*PARSER-CYCL-BLACKLIST*" );
    $list64 = ConsesLow.list( ConsesLow.list( makeSymbol( "*PSP-POS-PRED-FILTER?*" ), T ) );
    $list65 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "EDGE-SET-ARGS" ), makeSymbol( "EDGE-SET-FN-DEF" ), makeSymbol( "EDGE-CYCLS-FN-DEF" ) );
    $sym66$ENVIRONMENT = makeUninternedSymbol( "ENVIRONMENT" );
    $sym67$STRING = makeUninternedSymbol( "STRING" );
    $sym68$BEST = makeUninternedSymbol( "BEST" );
    $sym69$REST = makeUninternedSymbol( "REST" );
    $sym70$EDGE = makeUninternedSymbol( "EDGE" );
    $sym71$EDGE_SETS = makeUninternedSymbol( "EDGE-SETS" );
    $sym72$_OPTIONAL = makeSymbol( "&OPTIONAL" );
    $list73 = ConsesLow.list( ConsesLow.list( makeSymbol( "PSP-ENVIRONMENTAL-STATE" ) ) );
    $str74$_CACHED = makeString( "-CACHED" );
    $str75$CLEAR_ = makeString( "CLEAR-" );
    $str76$_CACHED_INTERNAL = makeString( "-CACHED-INTERNAL" );
    $str77$_EDGE_SETS = makeString( "-EDGE-SETS" );
    $str78$_EDGE_CYCLS = makeString( "-EDGE-CYCLS" );
    $sym79$DECLAIM = makeSymbol( "DECLAIM" );
    $sym80$FACCESS = makeSymbol( "FACCESS" );
    $sym81$PRIVATE = makeSymbol( "PRIVATE" );
    $sym82$DEFINE_CACHED_NEW = makeSymbol( "DEFINE-CACHED-NEW" );
    $list83 = ConsesLow.list( makeKeyword( "SIZE" ), makeInteger( 256 ), makeKeyword( "TEST" ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQUAL ) );
    $sym84$IGNORE = makeSymbol( "IGNORE" );
    $list85 = ConsesLow.list( makeKeyword( "GAP-TYPE" ), makeSymbol( "*PSP-GAP-TYPE-ALLOWED*" ) );
    $sym86$CAND = makeSymbol( "CAND" );
    $sym87$_REIFY_PARSE_NODES__ = makeSymbol( "*REIFY-PARSE-NODES?*" );
    $sym88$SET_PARSE_ROOT_NODE = makeSymbol( "SET-PARSE-ROOT-NODE" );
    $sym89$PSP_FIND_OR_CREATE_NODE_FOR_EDGES = makeSymbol( "PSP-FIND-OR-CREATE-NODE-FOR-EDGES" );
    $sym90$SET_UNION = makeSymbol( "SET-UNION" );
    $list91 = ConsesLow.list( ConsesLow.list( makeSymbol( "FUNCTION" ), EQL ) );
    $sym92$PSP_ACCUMULATE_ANSWERS = makeSymbol( "PSP-ACCUMULATE-ANSWERS" );
    $sym93$RET = makeSymbol( "RET" );
    $sym94$VALUES = makeSymbol( "VALUES" );
    $sym95$DEFINE = makeSymbol( "DEFINE" );
    $list96 = ConsesLow.list( makeSymbol( "BYPASS-PSP-CACHES?" ) );
    $list97 = ConsesLow.list( makeSymbol( "PSP-ENVIRONMENTAL-STATE" ) );
    $sym98$DEFINE_PRIVATE = makeSymbol( "DEFINE-PRIVATE" );
    $list99 = ConsesLow.list( makeSymbol( "EDGE" ) );
    $list100 = ConsesLow.list( ConsesLow.list( makeSymbol( "CYCLS" ), NIL ) );
    $sym101$WITH_PSP_SBHL_RESOURCING = makeSymbol( "WITH-PSP-SBHL-RESOURCING" );
    $list102 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "CYCLS" ) ) );
    $sym103$DEFINE_PSP_INTERFACE_HELPER = makeSymbol( "DEFINE-PSP-INTERFACE-HELPER" );
    $sym104$BYPASS_PSP_CACHES_ = makeSymbol( "BYPASS-PSP-CACHES?" );
    $list105 = ConsesLow.list( ConsesLow.list( makeSymbol( "ROOT-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list106 = ConsesLow.list( makeSymbol( "*PARSE-ROOT-NODE*" ), NIL );
    $sym107$BOUNDP = makeSymbol( "BOUNDP" );
    $list108 = ConsesLow.list( makeSymbol( "*PARSE-ROOT-NODE*" ) );
    $list109 = ConsesLow.list( ConsesLow.list( makeSymbol( "*VARIABLE-UNIQUIFICATION-STORE*" ), ConsesLow.list( makeSymbol( "NEW-DICTIONARY" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQUALP ) ) ) );
    $list110 = ConsesLow.list( ConsesLow.list( makeSymbol( "FROM-PSP-CYCL" ), makeSymbol( "TO-PSP-CYCL" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym111$NL_TAG_TEMPLATES = makeUninternedSymbol( "NL-TAG-TEMPLATES" );
    $sym112$PSP_STRIP_AND_REMEMBER_NL_TAGS = makeSymbol( "PSP-STRIP-AND-REMEMBER-NL-TAGS" );
    $sym113$PSP_ADD_NL_TAG_TEMPLATES = makeSymbol( "PSP-ADD-NL-TAG-TEMPLATES" );
    $sym114$PSP_PROMOTING_NL_TAGS = makeSymbol( "PSP-PROMOTING-NL-TAGS" );
    $list115 = ConsesLow.list( makeSymbol( "REFERENT" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym116$_SPEAKER_REFERENT_ = makeSymbol( "*SPEAKER-REFERENT*" );
    $list117 = ConsesLow.list( makeSymbol( "NEW-STRING-BASED-NCS?" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym118$_NPP_USE_STRINGS_FOR_SEMANTICS__ = makeSymbol( "*NPP-USE-STRINGS-FOR-SEMANTICS?*" );
  }
}
/*
 * 
 * Total time: 195 ms
 * 
 */