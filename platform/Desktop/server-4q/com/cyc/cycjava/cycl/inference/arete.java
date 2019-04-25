package com.cyc.cycjava.cycl.inference;

import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.assertions_low;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.plot_generation;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.kb_access_metering;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class arete
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.arete";
  public static final String myFingerPrint = "4603bf74af0a23a8fe40584f19192c2c08027b002b3f5d8becabdf75976f18f0";
  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 5045L)
  private static SubLSymbol $arete_experiment_directory$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 5467L)
  private static SubLSymbol $arete_analysis_directory$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 6348L)
  private static SubLSymbol $kbq_control_query_set_run$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 6920L)
  public static SubLSymbol $arete_outlier_timeout$;
  private static final SubLString $str0$_cyc_projects_inference_arete_exp;
  private static final SubLString $str1$_;
  private static final SubLString $str2$cfasl;
  private static final SubLString $str3$_cyc_projects_inference_arete_ana;
  private static final SubLString $str4$txt;
  private static final SubLSymbol $kw5$MACHINE;
  private static final SubLSymbol $kw6$DATE;
  private static final SubLString $str7$kbq__8D__6D__A;
  private static final SubLSymbol $sym8$_KBQ_CONTROL_QUERY_SET_RUN_;
  private static final SubLSymbol $kw9$UNINITIALIZED;
  private static final SubLString $str10$tkb_training_with_auto_destroy_re;
  private static final SubLList $list11;
  private static final SubLList $list12;
  private static final SubLSymbol $kw13$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw14$QUERY_SPEC_SET;
  private static final SubLSymbol $kw15$FILENAME;
  private static final SubLSymbol $kw16$COMMENT;
  private static final SubLSymbol $kw17$OVERRIDING_QUERY_PROPERTIES;
  private static final SubLSymbol $kw18$METRICS;
  private static final SubLList $list19;
  private static final SubLSymbol $kw20$OUTLIER_TIMEOUT;
  private static final SubLSymbol $sym21$_ARETE_OUTLIER_TIMEOUT_;
  private static final SubLSymbol $kw22$INCREMENTAL;
  private static final SubLSymbol $kw23$INCLUDE_RESULTS;
  private static final SubLSymbol $kw24$SKIP;
  private static final SubLSymbol $kw25$COUNT;
  private static final SubLSymbol $kw26$DIRECTORY;
  private static final SubLSymbol $sym27$FILENAME_VAR;
  private static final SubLSymbol $sym28$FULL_FILENAME;
  private static final SubLSymbol $sym29$CLET;
  private static final SubLSymbol $sym30$FWHEN;
  private static final SubLSymbol $sym31$ARETE_EXPERIMENT_FULL_FILENAME;
  private static final SubLSymbol $sym32$RUN_KBQ_EXPERIMENT;
  private static final SubLSymbol $kw33$UNDEFINED;
  private static final SubLSymbol $kw34$BASELINE;
  private static final SubLSymbol $kw35$EXPERIMENT;
  private static final SubLString $str36$_s_already_exists__specify_OVERWR;
  private static final SubLSymbol $kw37$OUTPUT;
  private static final SubLString $str38$Unable_to_open__S;
  private static final SubLString $str39$_________________________________;
  private static final SubLString $str40$_a__;
  private static final SubLList $list41;
  private static final SubLString $str42$Summary_Statistics___;
  private static final SubLList $list43;
  private static final SubLString $str44$_________________________________;
  private static final SubLSymbol $kw45$HALT_REASON;
  private static final SubLSymbol $kw46$ANSWER_COUNT;
  private static final SubLSymbol $kw47$TOTAL_TIME;
  private static final SubLSymbol $kw48$TIME_TO_FIRST_ANSWER;
  private static final SubLSymbol $kw49$TIME_TO_LAST_ANSWER;
  private static final SubLSymbol $kw50$MAX_TRANSFORMATION_DEPTH;
  private static final SubLSymbol $kw51$BROWSABLE_;
  private static final SubLSymbol $kw52$CONTINUABLE_;
  private static final SubLList $list53;
  private static final SubLList $list54;
  private static final SubLList $list55;
  private static final SubLSymbol $sym56$SAFE_DIFFERENCE;
  private static final SubLList $list57;
  private static final SubLList $list58;
  private static final SubLList $list59;
  private static final SubLString $str60$_s_Histogram___;
  private static final SubLSymbol $sym61$SAFE__;
  private static final SubLString $str62$_s_Data___;
  private static final SubLString $str63$_s_Tuples___;
  private static final SubLSymbol $sym64$FIRST;
  private static final SubLString $str65$_s_applied_to__s___;
  private static final SubLSymbol $sym66$MAPCAR;
  private static final SubLSymbol $sym67$LIST;
  private static final SubLString $str68$_s_____s__;
  private static final SubLSymbol $sym69$ARETE_GENERATE_PROPERTY_CORRELATION_PLOT;
  private static final SubLList $list70;
  private static final SubLSymbol $sym71$ARETE_GENERATE_SORTED_PROPERTY_COMPARISON;
  private static final SubLList $list72;
  private static final SubLSymbol $kw73$BOTH;
  private static final SubLSymbol $sym74$ARETE_GENERATE_SORTED_PROPERTIES_COMPARISON;
  private static final SubLList $list75;
  private static final SubLSymbol $kw76$ALL;
  private static final SubLSymbol $sym77$ARETE_GENERATE_SORTED_PROPERTY_DISPLAY;
  private static final SubLList $list78;
  private static final SubLString $str79$Interning_all_assertion_conses;
  private static final SubLSymbol $sym80$STRINGP;
  private static final SubLString $str81$Looking_for_shared_nauts;
  private static final SubLSymbol $sym82$KBQ_QUERY_RUN_BETTER_;
  private static final SubLSymbol $kw83$ORIGIN;
  private static final SubLSymbol $kw84$QUERY_RUNS;
  private static final SubLString $str85$;
  private static final SubLString $str86$__Hybridized_with___;
  private static final SubLSymbol $sym87$SUBL_PERFORMATIVE_P;
  private static final SubLObject $const88$performSubL;
  private static final SubLObject $const89$trueSubL;
  private static final SubLSymbol $kw90$CONDITIONAL_SENTENCE_;
  private static final SubLObject $const91$and;
  private static final SubLSymbol $kw92$IGNORE;
  private static final SubLSymbol $sym93$CONSTANT_P;
  private static final SubLList $list94;

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 845L)
  public static SubLObject arete_enable_global_logging()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    kb_access_metering.$arete_log_last_kb_touchP$.setDynamicValue( T, thread );
    kb_access_metering.$arete_log_kb_touchesP$.setDynamicValue( T, thread );
    kb_access_metering.$arete_assertions_touched$.setDynamicValue( ( NIL != set.set_p( kb_access_metering.$arete_assertions_touched$.getDynamicValue( thread ) ) ) ? kb_access_metering.$arete_assertions_touched$
        .getDynamicValue( thread ) : set.new_set( UNPROVIDED, UNPROVIDED ), thread );
    kb_access_metering.$arete_constants_touched$.setDynamicValue( ( NIL != set.set_p( kb_access_metering.$arete_constants_touched$.getDynamicValue( thread ) ) ) ? kb_access_metering.$arete_constants_touched$
        .getDynamicValue( thread ) : set.new_set( UNPROVIDED, UNPROVIDED ), thread );
    kb_access_metering.$arete_narts_touched$.setDynamicValue( ( NIL != set.set_p( kb_access_metering.$arete_narts_touched$.getDynamicValue( thread ) ) ) ? kb_access_metering.$arete_narts_touched$.getDynamicValue(
        thread ) : set.new_set( UNPROVIDED, UNPROVIDED ), thread );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 1485L)
  public static SubLObject arete_disable_global_logging()
  {
    kb_access_metering.$arete_log_last_kb_touchP$.setDynamicValue( NIL );
    kb_access_metering.$arete_log_kb_touchesP$.setDynamicValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 1637L)
  public static SubLObject arete_clear_global_logging()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    kb_access_metering.$arete_assertions_touched$.setDynamicValue( ( NIL != set.set_p( kb_access_metering.$arete_assertions_touched$.getDynamicValue( thread ) ) ) ? set.new_set( UNPROVIDED, UNPROVIDED ) : NIL, thread );
    kb_access_metering.$arete_constants_touched$.setDynamicValue( ( NIL != set.set_p( kb_access_metering.$arete_constants_touched$.getDynamicValue( thread ) ) ) ? set.new_set( UNPROVIDED, UNPROVIDED ) : NIL, thread );
    kb_access_metering.$arete_narts_touched$.setDynamicValue( ( NIL != set.set_p( kb_access_metering.$arete_narts_touched$.getDynamicValue( thread ) ) ) ? set.new_set( UNPROVIDED, UNPROVIDED ) : NIL, thread );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 2004L)
  public static SubLObject arete_note_assertion_touched(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != assertion_handles.valid_assertionP( assertion, UNPROVIDED ) )
    {
      kb_access_metering.possibly_note_kb_access_assertion( assertion );
      if( NIL != kb_access_metering.$arete_log_kb_touch_countsP$.getDynamicValue( thread ) && kb_access_metering.$arete_assertions_touched_count$.getDynamicValue( thread ).isNumber() )
      {
        kb_access_metering.$arete_assertions_touched_count$.setDynamicValue( Numbers.add( kb_access_metering.$arete_assertions_touched_count$.getDynamicValue( thread ), ONE_INTEGER ), thread );
      }
      if( NIL != kb_access_metering.$arete_log_last_kb_touchP$.getDynamicValue( thread ) )
      {
        kb_access_metering.$arete_last_assertion_touched$.setGlobalValue( assertion );
      }
      if( NIL != kb_access_metering.$arete_log_kb_touchesP$.getDynamicValue( thread ) && NIL != set.set_p( kb_access_metering.$arete_assertions_touched$.getDynamicValue( thread ) ) )
      {
        set.set_add( assertion, kb_access_metering.$arete_assertions_touched$.getDynamicValue( thread ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 2679L)
  public static SubLObject arete_note_constant_touched(final SubLObject constant)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != kb_access_metering.$arete_log_kb_touch_countsP$.getDynamicValue( thread ) && kb_access_metering.$arete_terms_touched_count$.getDynamicValue( thread ).isNumber() )
    {
      kb_access_metering.$arete_terms_touched_count$.setDynamicValue( Numbers.add( kb_access_metering.$arete_terms_touched_count$.getDynamicValue( thread ), ONE_INTEGER ), thread );
    }
    if( NIL != kb_access_metering.$arete_log_last_kb_touchP$.getDynamicValue( thread ) )
    {
      kb_access_metering.$arete_last_constant_touched$.setGlobalValue( constant );
      kb_access_metering.$arete_last_term_touched$.setGlobalValue( constant );
    }
    if( NIL != kb_access_metering.$arete_log_kb_touchesP$.getDynamicValue( thread ) && NIL != set.set_p( kb_access_metering.$arete_constants_touched$.getDynamicValue( thread ) ) )
    {
      set.set_add( constant, kb_access_metering.$arete_constants_touched$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 3247L)
  public static SubLObject arete_note_nart_touched(final SubLObject nart)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != kb_access_metering.$arete_log_kb_touch_countsP$.getDynamicValue( thread ) && kb_access_metering.$arete_terms_touched_count$.getDynamicValue( thread ).isNumber() )
    {
      kb_access_metering.$arete_terms_touched_count$.setDynamicValue( Numbers.add( kb_access_metering.$arete_terms_touched_count$.getDynamicValue( thread ), ONE_INTEGER ), thread );
    }
    if( NIL != kb_access_metering.$arete_log_last_kb_touchP$.getDynamicValue( thread ) )
    {
      kb_access_metering.$arete_last_nart_touched$.setGlobalValue( nart );
      kb_access_metering.$arete_last_term_touched$.setGlobalValue( nart );
    }
    if( NIL != kb_access_metering.$arete_log_kb_touchesP$.getDynamicValue( thread ) && NIL != set.set_p( kb_access_metering.$arete_narts_touched$.getDynamicValue( thread ) ) )
    {
      set.set_add( nart, kb_access_metering.$arete_narts_touched$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 3869L)
  public static SubLObject arete_note_object_touched(final SubLObject v_object)
  {
    if( NIL != constant_handles.constant_p( v_object ) )
    {
      arete_note_constant_touched( v_object );
    }
    else if( NIL != nart_handles.nart_p( v_object ) )
    {
      arete_note_nart_touched( v_object );
    }
    else if( NIL != assertion_handles.assertion_p( v_object ) )
    {
      arete_note_assertion_touched( v_object );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 4138L)
  public static SubLObject arete_last_assertion_touched()
  {
    return kb_access_metering.$arete_last_assertion_touched$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 4229L)
  public static SubLObject arete_last_constant_touched()
  {
    return kb_access_metering.$arete_last_constant_touched$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 4318L)
  public static SubLObject arete_last_nart_touched()
  {
    return kb_access_metering.$arete_last_nart_touched$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 4399L)
  public static SubLObject arete_last_term_touched()
  {
    return kb_access_metering.$arete_last_term_touched$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 4480L)
  public static SubLObject arete_assertions_touched_count()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != set.set_p( kb_access_metering.$arete_assertions_touched$.getDynamicValue( thread ) ) ) ? set.set_size( kb_access_metering.$arete_assertions_touched$.getDynamicValue( thread ) ) : ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 4634L)
  public static SubLObject arete_constants_touched_count()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != set.set_p( kb_access_metering.$arete_constants_touched$.getDynamicValue( thread ) ) ) ? set.set_size( kb_access_metering.$arete_constants_touched$.getDynamicValue( thread ) ) : ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 4785L)
  public static SubLObject arete_narts_touched_count()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != set.set_p( kb_access_metering.$arete_narts_touched$.getDynamicValue( thread ) ) ) ? set.set_size( kb_access_metering.$arete_narts_touched$.getDynamicValue( thread ) ) : ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 4924L)
  public static SubLObject arete_terms_touched_count()
  {
    return Numbers.add( arete_constants_touched_count(), arete_narts_touched_count() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 5200L)
  public static SubLObject arete_experiment_full_filename(final SubLObject filename, SubLObject directory)
  {
    if( directory == UNPROVIDED )
    {
      directory = $arete_experiment_directory$.getGlobalValue();
    }
    return Sequences.cconcatenate( directory, new SubLObject[] { filename, $str1$_, $str2$cfasl
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 5562L)
  public static SubLObject arete_analysis_full_filename(final SubLObject filename)
  {
    return Sequences.cconcatenate( $arete_analysis_directory$.getGlobalValue(), new SubLObject[] { filename, $str1$_, $str4$txt
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 5785L)
  public static SubLObject load_arete_experiment(final SubLObject filename)
  {
    final SubLObject full_filename = arete_experiment_full_filename( filename, UNPROVIDED );
    return kbq_query_run.kbq_load_query_set_run( full_filename );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 5954L)
  public static SubLObject suggest_filename_for_query_set_run(final SubLObject query_set_run)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject machine_tail = cdestructuring_bind.property_list_member( $kw5$MACHINE, query_set_run );
    final SubLObject machine = ( NIL != machine_tail ) ? conses_high.cadr( machine_tail ) : NIL;
    final SubLObject date_tail = cdestructuring_bind.property_list_member( $kw6$DATE, query_set_run );
    final SubLObject date = ( NIL != date_tail ) ? conses_high.cadr( date_tail ) : NIL;
    thread.resetMultipleValues();
    final SubLObject universal_date = numeric_date_utilities.universal_date_and_second_from_time( date );
    final SubLObject universal_second = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject machine_string = Sequences.substitute( Characters.CHAR_underbar, Characters.CHAR_period, machine, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return PrintLow.format( NIL, $str7$kbq__8D__6D__A, new SubLObject[] { universal_date, universal_second, machine_string
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 6413L)
  public static SubLObject kbq_load_control_query_set_run(SubLObject filename)
  {
    if( filename == UNPROVIDED )
    {
      filename = NIL;
    }
    if( NIL == filename )
    {
      filename = arete_experiment_full_filename( $str10$tkb_training_with_auto_destroy_re, UNPROVIDED );
    }
    $kbq_control_query_set_run$.setGlobalValue( kbq_query_run.kbq_load_query_set_run( filename ) );
    return $kbq_control_query_set_run$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 6756L)
  public static SubLObject kbq_compare_query_set_run_answers_to_control(final SubLObject query_set_run)
  {
    return kbq_query_run.kbq_compare_query_set_run_answers( $kbq_control_query_set_run$.getGlobalValue(), query_set_run );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 7071L)
  public static SubLObject run_arete_experiment(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list11 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list11 );
      if( NIL == conses_high.member( current_$1, $list12, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw13$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list11 );
    }
    final SubLObject query_spec_set_tail = cdestructuring_bind.property_list_member( $kw14$QUERY_SPEC_SET, current );
    final SubLObject query_spec_set = ( NIL != query_spec_set_tail ) ? conses_high.cadr( query_spec_set_tail ) : NIL;
    final SubLObject filename_tail = cdestructuring_bind.property_list_member( $kw15$FILENAME, current );
    final SubLObject filename = ( NIL != filename_tail ) ? conses_high.cadr( filename_tail ) : NIL;
    final SubLObject comment_tail = cdestructuring_bind.property_list_member( $kw16$COMMENT, current );
    final SubLObject comment = ( NIL != comment_tail ) ? conses_high.cadr( comment_tail ) : NIL;
    final SubLObject overriding_query_properties_tail = cdestructuring_bind.property_list_member( $kw17$OVERRIDING_QUERY_PROPERTIES, current );
    final SubLObject overriding_query_properties = ( NIL != overriding_query_properties_tail ) ? conses_high.cadr( overriding_query_properties_tail ) : NIL;
    final SubLObject metrics_tail = cdestructuring_bind.property_list_member( $kw18$METRICS, current );
    final SubLObject metrics = ( NIL != metrics_tail ) ? conses_high.cadr( metrics_tail ) : $list19;
    final SubLObject outlier_timeout_tail = cdestructuring_bind.property_list_member( $kw20$OUTLIER_TIMEOUT, current );
    final SubLObject outlier_timeout = ( NIL != outlier_timeout_tail ) ? conses_high.cadr( outlier_timeout_tail ) : $sym21$_ARETE_OUTLIER_TIMEOUT_;
    final SubLObject incremental_tail = cdestructuring_bind.property_list_member( $kw22$INCREMENTAL, current );
    final SubLObject incremental = ( NIL != incremental_tail ) ? conses_high.cadr( incremental_tail ) : NIL;
    final SubLObject include_results_tail = cdestructuring_bind.property_list_member( $kw23$INCLUDE_RESULTS, current );
    final SubLObject include_results = ( NIL != include_results_tail ) ? conses_high.cadr( include_results_tail ) : T;
    final SubLObject skip_tail = cdestructuring_bind.property_list_member( $kw24$SKIP, current );
    final SubLObject skip = ( NIL != skip_tail ) ? conses_high.cadr( skip_tail ) : ZERO_INTEGER;
    final SubLObject count_tail = cdestructuring_bind.property_list_member( $kw25$COUNT, current );
    final SubLObject count = ( NIL != count_tail ) ? conses_high.cadr( count_tail ) : NIL;
    final SubLObject directory_tail = cdestructuring_bind.property_list_member( $kw26$DIRECTORY, current );
    final SubLObject directory = ( NIL != directory_tail ) ? conses_high.cadr( directory_tail ) : $arete_experiment_directory$.getGlobalValue();
    final SubLObject filename_var = $sym27$FILENAME_VAR;
    final SubLObject full_filename = $sym28$FULL_FILENAME;
    return ConsesLow.list( $sym29$CLET, ConsesLow.list( ConsesLow.list( filename_var, filename ), ConsesLow.list( full_filename, ConsesLow.list( $sym30$FWHEN, filename_var, ConsesLow.list(
        $sym31$ARETE_EXPERIMENT_FULL_FILENAME, filename_var, directory ) ) ) ), ConsesLow.list( new SubLObject[]
        { $sym32$RUN_KBQ_EXPERIMENT, $kw14$QUERY_SPEC_SET, query_spec_set, $kw15$FILENAME, full_filename, $kw16$COMMENT, comment, $kw17$OVERRIDING_QUERY_PROPERTIES, overriding_query_properties, $kw18$METRICS, metrics,
          $kw20$OUTLIER_TIMEOUT, outlier_timeout, $kw22$INCREMENTAL, incremental, $kw23$INCLUDE_RESULTS, include_results, $kw24$SKIP, skip, $kw25$COUNT, count
    } ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 7939L)
  public static SubLObject kbq_query_set_run_scaling_factors(final SubLObject query_set_run_1, final SubLObject query_set_run_2, SubLObject metrics)
  {
    if( metrics == UNPROVIDED )
    {
      metrics = inference_datastructures_enumerated_types.all_arete_query_metrics();
    }
    final SubLObject analysis = kbq_query_run.kbq_analyze_query_set_runs( query_set_run_1, query_set_run_2, metrics );
    return kbq_compute_scaling_factors_from_analysis( analysis );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 8462L)
  public static SubLObject kbq_compute_scaling_factors_from_analysis(final SubLObject analysis)
  {
    SubLObject new_plist = NIL;
    SubLObject remainder;
    SubLObject indicator;
    SubLObject value;
    SubLObject first;
    SubLObject second;
    SubLObject ratio;
    for( remainder = NIL, remainder = analysis; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      indicator = remainder.first();
      value = conses_high.cadr( remainder );
      first = value.first();
      second = conses_high.second( value );
      ratio = ( NIL == first || first.isZero() ) ? $kw33$UNDEFINED : Numbers.divide( second, first );
      new_plist = conses_high.putf( new_plist, indicator, ratio );
    }
    return new_plist;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 8823L)
  public static SubLObject kbq_scale_analysis(final SubLObject analysis, final SubLObject scaling_factors, final SubLObject scale_which)
  {
    SubLObject new_plist = NIL;
    SubLObject remainder;
    SubLObject statistic_name;
    SubLObject statistic_list;
    SubLObject baseline_value;
    SubLObject experiment_value;
    SubLObject scaling_factor;
    for( remainder = NIL, remainder = analysis; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      statistic_name = remainder.first();
      statistic_list = conses_high.cadr( remainder );
      baseline_value = statistic_list.first();
      experiment_value = conses_high.second( statistic_list );
      scaling_factor = conses_high.getf( scaling_factors, statistic_name, UNPROVIDED );
      if( scaling_factor.isNumber() )
      {
        if( $kw34$BASELINE == scale_which )
        {
          baseline_value = number_utilities.significant_digits( Numbers.multiply( baseline_value, scaling_factor ), FOUR_INTEGER );
        }
        if( $kw35$EXPERIMENT == scale_which )
        {
          experiment_value = number_utilities.significant_digits( Numbers.multiply( experiment_value, scaling_factor ), FOUR_INTEGER );
        }
        new_plist = conses_high.putf( new_plist, statistic_name, ConsesLow.list( baseline_value, experiment_value ) );
      }
    }
    return new_plist;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 9782L)
  public static SubLObject multiply_scaling_factors(final SubLObject scaling_factors_1, final SubLObject scaling_factors_2)
  {
    SubLObject new_scaling_factors = NIL;
    SubLObject remainder;
    SubLObject indicator;
    SubLObject value;
    SubLObject scaling_factor;
    for( remainder = NIL, remainder = scaling_factors_1; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      indicator = remainder.first();
      value = conses_high.cadr( remainder );
      scaling_factor = conses_high.getf( scaling_factors_2, indicator, UNPROVIDED );
      if( scaling_factor.isNumber() && value.isNumber() )
      {
        value = Numbers.multiply( value, scaling_factor );
      }
      new_scaling_factors = conses_high.putf( new_scaling_factors, indicator, value );
    }
    return new_scaling_factors;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 10322L)
  public static SubLObject invert_scaling_factors(final SubLObject scaling_factors)
  {
    SubLObject new_scaling_factors = NIL;
    SubLObject remainder;
    SubLObject indicator;
    SubLObject value;
    for( remainder = NIL, remainder = scaling_factors; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      indicator = remainder.first();
      value = conses_high.cadr( remainder );
      if( value.isNumber() && !value.isZero() )
      {
        value = Numbers.invert( value );
      }
      new_scaling_factors = conses_high.putf( new_scaling_factors, indicator, value );
    }
    return new_scaling_factors;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 10716L)
  public static SubLObject kbq_save_report(final SubLObject query_set_run, final SubLObject filename, SubLObject overwriteP)
  {
    if( overwriteP == UNPROVIDED )
    {
      overwriteP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject full_filename = arete_analysis_full_filename( filename );
    if( NIL == overwriteP && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != Filesys.probe_file( full_filename ) )
    {
      Errors.error( $str36$_s_already_exists__specify_OVERWR, full_filename );
    }
    SubLObject stream = NIL;
    try
    {
      stream = compatibility.open_text( full_filename, $kw37$OUTPUT );
      if( !stream.isStream() )
      {
        Errors.error( $str38$Unable_to_open__S, full_filename );
      }
      final SubLObject stream_$2 = stream;
      kbq_print_report( query_set_run, stream_$2 );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 11192L)
  public static SubLObject kbq_print_report(final SubLObject query_set_run, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    PrintLow.format( stream, $str39$_________________________________ );
    final SubLObject comment = kbq_query_run.kbq_query_set_run_comment( query_set_run );
    PrintLow.format( stream, $str40$_a__, comment );
    final SubLObject date = conses_high.getf( query_set_run, $kw6$DATE, UNPROVIDED );
    PrintLow.format( stream, $str40$_a__, numeric_date_utilities.timestring( date ) );
    final SubLObject rest_of_header_info = list_utilities.plist_except( query_set_run, $list41 );
    list_utilities.pretty_print_plist( rest_of_header_info, stream );
    PrintLow.format( stream, $str39$_________________________________ );
    PrintLow.format( stream, $str42$Summary_Statistics___ );
    final SubLObject query_runs = kbq_query_run.kbq_query_set_run_query_runs( query_set_run );
    final SubLObject metrics = $list43;
    final SubLObject metrics_database = kbq_query_run.kbq_analyze_query_runs( query_runs, metrics );
    list_utilities.pretty_print_plist( metrics_database, stream );
    PrintLow.format( stream, $str44$_________________________________ );
    kbq_print_histogram( query_set_run, stream, $kw45$HALT_REASON );
    kbq_print_data( query_set_run, stream, $kw46$ANSWER_COUNT );
    kbq_print_data( query_set_run, stream, $kw47$TOTAL_TIME );
    kbq_print_data( query_set_run, stream, $kw48$TIME_TO_FIRST_ANSWER );
    kbq_print_data( query_set_run, stream, $kw49$TIME_TO_LAST_ANSWER );
    kbq_print_histogram( query_set_run, stream, $kw50$MAX_TRANSFORMATION_DEPTH );
    kbq_print_histogram( query_set_run, stream, $kw51$BROWSABLE_ );
    kbq_print_histogram( query_set_run, stream, $kw52$CONTINUABLE_ );
    kbq_print_tuples( query_set_run, stream, $list53 );
    kbq_print_tuples( query_set_run, stream, $list54 );
    kbq_print_func_of_tuples( query_set_run, stream, $list55, $sym56$SAFE_DIFFERENCE );
    kbq_print_histogram( query_set_run, stream, $list57 );
    kbq_print_histogram( query_set_run, stream, $list58 );
    kbq_print_tuples( query_set_run, stream, $list59 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 13245L)
  public static SubLObject kbq_print_histogram(final SubLObject query_set_run, final SubLObject stream, final SubLObject property)
  {
    PrintLow.format( stream, $str60$_s_Histogram___, property );
    final SubLObject values = kbq_query_run.kbq_extract_property_values( query_set_run, property, UNPROVIDED );
    final SubLObject histogram_plist = list_utilities.histogram_as_plist( values, Symbols.symbol_function( $sym61$SAFE__ ), Symbols.symbol_function( EQUAL ), UNPROVIDED );
    list_utilities.pretty_print_plist( histogram_plist, stream );
    PrintLow.format( stream, $str44$_________________________________ );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 13631L)
  public static SubLObject kbq_print_data(final SubLObject query_set_run, final SubLObject stream, final SubLObject property)
  {
    PrintLow.format( stream, $str62$_s_Data___, property );
    final SubLObject values = kbq_query_run.kbq_extract_property_values( query_set_run, property, UNPROVIDED );
    final SubLObject sorted_values = Sort.sort( conses_high.copy_list( values ), Symbols.symbol_function( $sym61$SAFE__ ), UNPROVIDED );
    format_nil.print_one_per_line( sorted_values, stream );
    streams_high.terpri( stream );
    PrintLow.format( stream, $str44$_________________________________ );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 14013L)
  public static SubLObject kbq_print_tuples(final SubLObject query_set_run, final SubLObject stream, final SubLObject v_properties)
  {
    PrintLow.format( stream, $str63$_s_Tuples___, v_properties );
    final SubLObject tuples = kbq_compute_tuples( query_set_run, v_properties );
    final SubLObject sorted_tuples = Sort.sort( conses_high.copy_list( tuples ), Symbols.symbol_function( $sym61$SAFE__ ), Symbols.symbol_function( $sym64$FIRST ) );
    format_nil.print_one_per_line( sorted_tuples, stream );
    streams_high.terpri( stream );
    PrintLow.format( stream, $str44$_________________________________ );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 14397L)
  public static SubLObject kbq_print_func_of_tuples(final SubLObject query_set_run, final SubLObject stream, final SubLObject v_properties, final SubLObject func)
  {
    PrintLow.format( stream, $str65$_s_applied_to__s___, func, v_properties );
    final SubLObject tuples = kbq_compute_tuples( query_set_run, v_properties );
    SubLObject values = NIL;
    SubLObject cdolist_list_var = tuples;
    SubLObject tuple = NIL;
    tuple = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject value = Functions.apply( func, tuple.first(), tuple.rest() );
      values = ConsesLow.cons( value, values );
      cdolist_list_var = cdolist_list_var.rest();
      tuple = cdolist_list_var.first();
    }
    values = Sequences.nreverse( values );
    final SubLObject sorted_values = Sort.sort( conses_high.copy_list( values ), Symbols.symbol_function( $sym61$SAFE__ ), UNPROVIDED );
    format_nil.print_one_per_line( sorted_values, stream );
    streams_high.terpri( stream );
    PrintLow.format( stream, $str44$_________________________________ );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 14980L)
  public static SubLObject kbq_compute_tuples(final SubLObject query_set_run, final SubLObject v_properties)
  {
    SubLObject values_lists = NIL;
    SubLObject cdolist_list_var = v_properties;
    SubLObject property = NIL;
    property = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject values = kbq_query_run.kbq_extract_property_values( query_set_run, property, UNPROVIDED );
      values_lists = ConsesLow.cons( values, values_lists );
      cdolist_list_var = cdolist_list_var.rest();
      property = cdolist_list_var.first();
    }
    values_lists = Sequences.nreverse( values_lists );
    final SubLObject tuples = Functions.apply( Symbols.symbol_function( $sym66$MAPCAR ), ConsesLow.listS( Symbols.symbol_function( $sym67$LIST ), values_lists ) );
    return tuples;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 15350L)
  public static SubLObject kbq_print_error_queries(final SubLObject query_set_run)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cdolist_list_var = kbq_query_run.kbq_query_set_run_query_runs( query_set_run );
    SubLObject query_run = NIL;
    query_run = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject halt_reason = kbq_query_run.kbq_extract_query_run_metric_value( query_run, $kw45$HALT_REASON, UNPROVIDED );
      if( NIL != inference_datastructures_enumerated_types.inference_error_suspend_status_p( halt_reason ) )
      {
        final SubLObject query = kbq_query_run.kbq_query_run_query( query_run );
        final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding( thread );
        try
        {
          print_high.$print_pretty$.bind( NIL, thread );
          PrintLow.format( T, $str68$_s_____s__, query, halt_reason );
        }
        finally
        {
          print_high.$print_pretty$.rebind( _prev_bind_0, thread );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      query_run = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 15766L)
  public static SubLObject arete_generate_property_correlation_plot(final SubLObject baseline_run, final SubLObject experiment_run, final SubLObject property, SubLObject plot_properties, SubLObject display)
  {
    if( plot_properties == UNPROVIDED )
    {
      plot_properties = NIL;
    }
    if( display == UNPROVIDED )
    {
      display = NIL;
    }
    return plot_generation.kbq_generate_property_correlation_plot( baseline_run, experiment_run, property, plot_properties, display );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 16128L)
  public static SubLObject arete_generate_sorted_property_comparison(final SubLObject baseline_run, final SubLObject experiment_run, final SubLObject property, SubLObject plot_properties, SubLObject sort_by,
      SubLObject display)
  {
    if( plot_properties == UNPROVIDED )
    {
      plot_properties = NIL;
    }
    if( sort_by == UNPROVIDED )
    {
      sort_by = $kw73$BOTH;
    }
    if( display == UNPROVIDED )
    {
      display = NIL;
    }
    return plot_generation.kbq_generate_sorted_property_comparison( baseline_run, experiment_run, property, plot_properties, sort_by, display );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 16459L)
  public static SubLObject arete_generate_sorted_properties_comparison(final SubLObject query_set_run, final SubLObject v_properties, SubLObject plot_properties, SubLObject sort_by, SubLObject display)
  {
    if( plot_properties == UNPROVIDED )
    {
      plot_properties = NIL;
    }
    if( sort_by == UNPROVIDED )
    {
      sort_by = $kw76$ALL;
    }
    if( display == UNPROVIDED )
    {
      display = NIL;
    }
    return plot_generation.kbq_generate_sorted_properties_comparison( query_set_run, v_properties, plot_properties, sort_by, display );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 16771L)
  public static SubLObject arete_generate_sorted_property_display(final SubLObject query_set_run, final SubLObject property, SubLObject classifications, SubLObject plot_properties, SubLObject display)
  {
    if( classifications == UNPROVIDED )
    {
      classifications = NIL;
    }
    if( plot_properties == UNPROVIDED )
    {
      plot_properties = NIL;
    }
    if( display == UNPROVIDED )
    {
      display = NIL;
    }
    return plot_generation.kbq_generate_sorted_property_display( query_set_run, property, classifications, plot_properties, display );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 17073L)
  public static SubLObject assertion_cons_sharing_dictionary()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_dictionary = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), assertion_handles.assertion_count() );
    final SubLObject idx = assertion_handles.do_assertions_table();
    final SubLObject mess = $str79$Interning_all_assertion_conses;
    final SubLObject total = id_index.id_index_count( idx );
    SubLObject sofar = ZERO_INTEGER;
    assert NIL != Types.stringp( mess ) : mess;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( mess );
        final SubLObject idx_$3 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$3, $kw24$SKIP ) )
        {
          final SubLObject idx_$4 = idx_$3;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$4, $kw24$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$4 );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject a_id;
            SubLObject a_handle;
            SubLObject ass;
            SubLObject cons;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              a_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              a_handle = Vectors.aref( vector_var, a_id );
              if( NIL == id_index.id_index_tombstone_p( a_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw24$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( a_handle ) )
                {
                  a_handle = $kw24$SKIP;
                }
                ass = assertion_handles.resolve_assertion_id_value_pair( a_id, a_handle );
                for( cons = NIL, cons = assertions_low.assertion_formula_data( ass ); !cons.isAtom(); cons = cons.rest() )
                {
                  dictionary_utilities.dictionary_increment( v_dictionary, cons, UNPROVIDED );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$5 = idx_$3;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$5 ) || NIL == id_index.id_index_skip_tombstones_p( $kw24$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$5 );
            SubLObject a_id2 = id_index.id_index_sparse_id_threshold( idx_$5 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$5 );
            final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw24$SKIP ) ) ? NIL : $kw24$SKIP;
            while ( a_id2.numL( end_id ))
            {
              final SubLObject a_handle2 = Hashtables.gethash_without_values( a_id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw24$SKIP ) || NIL == id_index.id_index_tombstone_p( a_handle2 ) )
              {
                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair( a_id2, a_handle2 );
                SubLObject cons2;
                for( cons2 = NIL, cons2 = assertions_low.assertion_formula_data( ass2 ); !cons2.isAtom(); cons2 = cons2.rest() )
                {
                  dictionary_utilities.dictionary_increment( v_dictionary, cons2, UNPROVIDED );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
              a_id2 = Numbers.add( a_id2, ONE_INTEGER );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$6, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return v_dictionary;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 17509L)
  public static SubLObject conses_saved_and_total_conses(final SubLObject v_dictionary)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject conses_saved = ZERO_INTEGER;
    SubLObject total_conses = ZERO_INTEGER;
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( v_dictionary ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject key = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject count = thread.secondMultipleValue();
      thread.resetMultipleValues();
      total_conses = Numbers.add( total_conses, count );
      if( count.numG( ONE_INTEGER ) )
      {
        conses_saved = Numbers.add( conses_saved, Numbers.subtract( count, ONE_INTEGER ) );
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return Values.values( conses_saved, total_conses, Numbers.divide( conses_saved, total_conses ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 17829L)
  public static SubLObject nauts_shared_and_unshared(final SubLObject v_dictionary)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject naut_count = ZERO_INTEGER;
    SubLObject nauts_shared = ZERO_INTEGER;
    SubLObject naut_share_count = ZERO_INTEGER;
    SubLObject so_far = ZERO_INTEGER;
    final SubLObject total = dictionary.dictionary_length( v_dictionary );
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( $str81$Looking_for_shared_nauts );
        SubLObject iteration_state;
        for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( v_dictionary ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
            iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
        {
          thread.resetMultipleValues();
          final SubLObject naut = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
          final SubLObject count = thread.secondMultipleValue();
          thread.resetMultipleValues();
          final SubLObject functor = cycl_utilities.formula_operator( naut );
          if( NIL != forts.fort_p( functor ) && NIL != fort_types_interface.functor_p( functor ) )
          {
            naut_count = Numbers.add( naut_count, ONE_INTEGER );
            if( count.numG( ONE_INTEGER ) )
            {
              nauts_shared = Numbers.add( nauts_shared, ONE_INTEGER );
            }
            naut_share_count = Numbers.add( naut_share_count, Numbers.subtract( count, ONE_INTEGER ) );
          }
          so_far = Numbers.add( so_far, ONE_INTEGER );
          utilities_macros.note_percent_progress( so_far, total );
        }
        dictionary_contents.do_dictionary_contents_finalize( iteration_state );
      }
      finally
      {
        final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$7, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return Values.values( naut_count, nauts_shared, naut_share_count );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 18326L)
  public static SubLObject kbq_hybridize_query_set_runs(final SubLObject query_set_runs, SubLObject metric, SubLObject compare_func, SubLObject comment, SubLObject tag)
  {
    if( metric == UNPROVIDED )
    {
      metric = $kw47$TOTAL_TIME;
    }
    if( compare_func == UNPROVIDED )
    {
      compare_func = $sym82$KBQ_QUERY_RUN_BETTER_;
    }
    if( comment == UNPROVIDED )
    {
      comment = NIL;
    }
    if( tag == UNPROVIDED )
    {
      tag = $kw83$ORIGIN;
    }
    SubLObject tagged_query_set_runs;
    SubLObject hybrid_query_set_run;
    for( tagged_query_set_runs = kbq_tag_query_set_runs( query_set_runs, tag ), hybrid_query_set_run = tagged_query_set_runs.first(); NIL != tagged_query_set_runs; tagged_query_set_runs = tagged_query_set_runs
        .rest(), hybrid_query_set_run = kbq_hybridize_two_query_set_runs( hybrid_query_set_run, tagged_query_set_runs.first(), metric, compare_func, comment ) )
    {
    }
    return hybrid_query_set_run;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 18983L)
  public static SubLObject kbq_tag_query_set_runs(final SubLObject query_set_runs, final SubLObject tag)
  {
    SubLObject tagged_query_set_runs = NIL;
    SubLObject list_var = NIL;
    SubLObject query_set_run = NIL;
    SubLObject tag_value = NIL;
    list_var = query_set_runs;
    query_set_run = list_var.first();
    for( tag_value = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), query_set_run = list_var.first(), tag_value = Numbers.add( ONE_INTEGER, tag_value ) )
    {
      tagged_query_set_runs = ConsesLow.cons( kbq_query_run.kbq_query_set_run_put_query_run_property( query_set_run, tag, tag_value ), tagged_query_set_runs );
    }
    tagged_query_set_runs = Sequences.nreverse( tagged_query_set_runs );
    return tagged_query_set_runs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 19355L)
  public static SubLObject kbq_hybridize_two_query_set_runs(final SubLObject query_set_run_1, final SubLObject query_set_run_2, SubLObject metric, SubLObject compare_func, SubLObject comment)
  {
    if( metric == UNPROVIDED )
    {
      metric = $kw47$TOTAL_TIME;
    }
    if( compare_func == UNPROVIDED )
    {
      compare_func = $sym82$KBQ_QUERY_RUN_BETTER_;
    }
    if( comment == UNPROVIDED )
    {
      comment = NIL;
    }
    SubLObject hybrid_query_set_run = conses_high.copy_list( query_set_run_1 );
    final SubLObject query_runs_1 = kbq_query_run.kbq_query_set_run_query_runs( query_set_run_1 );
    final SubLObject query_runs_2 = kbq_query_run.kbq_query_set_run_query_runs( query_set_run_2 );
    SubLObject hybrid_query_runs = NIL;
    SubLObject query_run_1 = NIL;
    SubLObject query_run_1_$8 = NIL;
    SubLObject query_run_2 = NIL;
    SubLObject query_run_2_$9 = NIL;
    query_run_1 = query_runs_1;
    query_run_1_$8 = query_run_1.first();
    query_run_2 = query_runs_2;
    query_run_2_$9 = query_run_2.first();
    while ( NIL != query_run_2 || NIL != query_run_1)
    {
      final SubLObject better_query_run = kbq_better_query_run( query_run_1_$8, query_run_2_$9, metric, compare_func );
      hybrid_query_runs = ConsesLow.cons( better_query_run, hybrid_query_runs );
      query_run_1 = query_run_1.rest();
      query_run_1_$8 = query_run_1.first();
      query_run_2 = query_run_2.rest();
      query_run_2_$9 = query_run_2.first();
    }
    hybrid_query_runs = Sequences.nreverse( hybrid_query_runs );
    hybrid_query_set_run = conses_high.putf( hybrid_query_set_run, $kw84$QUERY_RUNS, hybrid_query_runs );
    if( NIL == comment )
    {
      comment = Sequences.cconcatenate( conses_high.getf( query_set_run_1, $kw16$COMMENT, $str85$ ), new SubLObject[] { PrintLow.format( NIL, $str86$__Hybridized_with___ ), conses_high.getf( query_set_run_2,
          $kw16$COMMENT, $str85$ )
      } );
    }
    hybrid_query_set_run = conses_high.putf( hybrid_query_set_run, $kw16$COMMENT, comment );
    return hybrid_query_set_run;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 20542L)
  public static SubLObject kbq_better_query_run(final SubLObject query_run_1, final SubLObject query_run_2, SubLObject metric, SubLObject compare_func)
  {
    if( metric == UNPROVIDED )
    {
      metric = $kw47$TOTAL_TIME;
    }
    if( compare_func == UNPROVIDED )
    {
      compare_func = $sym82$KBQ_QUERY_RUN_BETTER_;
    }
    if( NIL != Functions.funcall( compare_func, query_run_2, query_run_1, metric ) )
    {
      return query_run_2;
    }
    return query_run_1;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 20788L)
  public static SubLObject kbq_query_run_betterP(final SubLObject query_run_1, final SubLObject query_run_2, SubLObject metric)
  {
    if( metric == UNPROVIDED )
    {
      metric = $kw47$TOTAL_TIME;
    }
    final SubLObject answer_count_1 = kbq_query_run.kbq_extract_query_run_metric_value( query_run_1, $kw46$ANSWER_COUNT, ZERO_INTEGER );
    final SubLObject answer_count_2 = kbq_query_run.kbq_extract_query_run_metric_value( query_run_2, $kw46$ANSWER_COUNT, ZERO_INTEGER );
    if( answer_count_1.numG( answer_count_2 ) )
    {
      return T;
    }
    if( answer_count_1.numL( answer_count_2 ) )
    {
      return NIL;
    }
    final SubLObject time_1 = kbq_query_run.kbq_extract_query_run_metric_value( query_run_1, metric, UNPROVIDED );
    final SubLObject time_2 = kbq_query_run.kbq_extract_query_run_metric_value( query_run_2, metric, UNPROVIDED );
    return list_utilities.safe_L( time_1, time_2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 21506L)
  public static SubLObject kbq_query_run_better_per_answerP(final SubLObject query_run_1, final SubLObject query_run_2, SubLObject metric)
  {
    if( metric == UNPROVIDED )
    {
      metric = $kw47$TOTAL_TIME;
    }
    final SubLObject answer_count_1 = kbq_query_run.kbq_extract_query_run_metric_value( query_run_1, $kw46$ANSWER_COUNT, ZERO_INTEGER );
    final SubLObject answer_count_2 = kbq_query_run.kbq_extract_query_run_metric_value( query_run_2, $kw46$ANSWER_COUNT, ZERO_INTEGER );
    if( answer_count_1.isZero() && answer_count_2.isZero() )
    {
      final SubLObject time_1 = kbq_query_run.kbq_extract_query_run_metric_value( query_run_1, metric, UNPROVIDED );
      final SubLObject time_2 = kbq_query_run.kbq_extract_query_run_metric_value( query_run_2, metric, UNPROVIDED );
      return list_utilities.safe_L( time_1, time_2 );
    }
    if( answer_count_1.isZero() )
    {
      return NIL;
    }
    if( answer_count_2.isZero() )
    {
      return T;
    }
    final SubLObject time_1 = kbq_query_run.kbq_extract_query_run_metric_value( query_run_1, metric, UNPROVIDED );
    final SubLObject time_per_answer_1 = Numbers.divide( time_1, answer_count_1 );
    final SubLObject time_3 = kbq_query_run.kbq_extract_query_run_metric_value( query_run_2, metric, UNPROVIDED );
    final SubLObject time_per_answer_2 = Numbers.divide( time_3, answer_count_2 );
    return list_utilities.safe_L( time_per_answer_1, time_per_answer_2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 22647L)
  public static SubLObject kbq_query_run_better_wrt_timeP(final SubLObject query_run_1, final SubLObject query_run_2, SubLObject metric)
  {
    if( metric == UNPROVIDED )
    {
      metric = $kw47$TOTAL_TIME;
    }
    final SubLObject answer_count_1 = kbq_query_run.kbq_extract_query_run_metric_value( query_run_1, $kw46$ANSWER_COUNT, ZERO_INTEGER );
    final SubLObject answer_count_2 = kbq_query_run.kbq_extract_query_run_metric_value( query_run_2, $kw46$ANSWER_COUNT, ZERO_INTEGER );
    if( answer_count_1.isZero() && answer_count_2.isZero() )
    {
      final SubLObject time_1 = kbq_query_run.kbq_extract_query_run_metric_value( query_run_1, metric, UNPROVIDED );
      final SubLObject time_2 = kbq_query_run.kbq_extract_query_run_metric_value( query_run_2, metric, UNPROVIDED );
      return list_utilities.safe_L( time_1, time_2 );
    }
    if( answer_count_1.isZero() )
    {
      return NIL;
    }
    if( answer_count_2.isZero() )
    {
      return T;
    }
    final SubLObject time_1 = kbq_query_run.kbq_extract_query_run_metric_value( query_run_1, metric, UNPROVIDED );
    final SubLObject time_2 = kbq_query_run.kbq_extract_query_run_metric_value( query_run_2, metric, UNPROVIDED );
    return list_utilities.safe_L( time_1, time_2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 23731L)
  public static SubLObject kbq_may_have_harmful_side_effectsP(final SubLObject query_spec)
  {
    return query_may_have_harmful_side_effectsP( kb_query.kbq_sentence( query_spec ), kb_query.kbq_mt( query_spec ), kb_query.kbq_query_properties( query_spec ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 24005L)
  public static SubLObject query_may_have_harmful_side_effectsP(final SubLObject sentence, SubLObject mt, SubLObject query_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    if( NIL != sentence_contains_subl_performativeP( sentence ) )
    {
      return T;
    }
    if( NIL != conditional_sentence_with_closed_decontextualized_antecedent_literalP( sentence, query_properties ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 24318L)
  public static SubLObject sentence_contains_subl_performativeP(final SubLObject sentence)
  {
    return cycl_utilities.expression_find_if( $sym87$SUBL_PERFORMATIVE_P, sentence, T, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 24444L)
  public static SubLObject subl_performative_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.eql( $const88$performSubL ) || v_object.eql( $const89$trueSubL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 24684L)
  public static SubLObject conditional_sentence_with_closed_decontextualized_antecedent_literalP(final SubLObject sentence, final SubLObject query_properties)
  {
    final SubLObject conditional_sentenceP = conses_high.getf( query_properties, $kw90$CONDITIONAL_SENTENCE_, UNPROVIDED );
    if( NIL != conditional_sentenceP && NIL != el_utilities.el_implication_p( sentence ) )
    {
      SubLObject antecedent = cycl_utilities.sentence_arg1( sentence, UNPROVIDED );
      if( NIL == el_utilities.el_conjunction_p( antecedent ) )
      {
        antecedent = ConsesLow.list( $const91$and, antecedent );
      }
      SubLObject cdolist_list_var;
      final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( antecedent, $kw92$IGNORE );
      SubLObject literal = NIL;
      literal = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != el_utilities.closedP( literal, UNPROVIDED ) && NIL != kb_accessors.decontextualized_literalP( literal ) )
        {
          return T;
        }
        cdolist_list_var = cdolist_list_var.rest();
        literal = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 25239L)
  public static SubLObject kbq_numeric_quantification_queryP(final SubLObject query)
  {
    final SubLObject sentence = kb_query.kbq_sentence( query );
    final SubLObject constants = cycl_utilities.expression_gather( sentence, Symbols.symbol_function( $sym93$CONSTANT_P ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject witness = NIL;
    if( NIL == witness )
    {
      SubLObject csome_list_var = constants;
      SubLObject constant = NIL;
      constant = csome_list_var.first();
      while ( NIL == witness && NIL != csome_list_var)
      {
        if( NIL != subl_promotions.memberP( constant, $list94, Symbols.symbol_function( EQL ), UNPROVIDED ) )
        {
          witness = constant;
        }
        csome_list_var = csome_list_var.rest();
        constant = csome_list_var.first();
      }
    }
    return witness;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/lisp", position = 25806L)
  public static SubLObject kbq_not_numeric_quantification_queryP(final SubLObject query)
  {
    return makeBoolean( NIL == kbq_numeric_quantification_queryP( query ) );
  }

  public static SubLObject declare_arete_file()
  {
    SubLFiles.declareFunction( me, "arete_enable_global_logging", "ARETE-ENABLE-GLOBAL-LOGGING", 0, 0, false );
    SubLFiles.declareFunction( me, "arete_disable_global_logging", "ARETE-DISABLE-GLOBAL-LOGGING", 0, 0, false );
    SubLFiles.declareFunction( me, "arete_clear_global_logging", "ARETE-CLEAR-GLOBAL-LOGGING", 0, 0, false );
    SubLFiles.declareFunction( me, "arete_note_assertion_touched", "ARETE-NOTE-ASSERTION-TOUCHED", 1, 0, false );
    SubLFiles.declareFunction( me, "arete_note_constant_touched", "ARETE-NOTE-CONSTANT-TOUCHED", 1, 0, false );
    SubLFiles.declareFunction( me, "arete_note_nart_touched", "ARETE-NOTE-NART-TOUCHED", 1, 0, false );
    SubLFiles.declareFunction( me, "arete_note_object_touched", "ARETE-NOTE-OBJECT-TOUCHED", 1, 0, false );
    SubLFiles.declareFunction( me, "arete_last_assertion_touched", "ARETE-LAST-ASSERTION-TOUCHED", 0, 0, false );
    SubLFiles.declareFunction( me, "arete_last_constant_touched", "ARETE-LAST-CONSTANT-TOUCHED", 0, 0, false );
    SubLFiles.declareFunction( me, "arete_last_nart_touched", "ARETE-LAST-NART-TOUCHED", 0, 0, false );
    SubLFiles.declareFunction( me, "arete_last_term_touched", "ARETE-LAST-TERM-TOUCHED", 0, 0, false );
    SubLFiles.declareFunction( me, "arete_assertions_touched_count", "ARETE-ASSERTIONS-TOUCHED-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "arete_constants_touched_count", "ARETE-CONSTANTS-TOUCHED-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "arete_narts_touched_count", "ARETE-NARTS-TOUCHED-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "arete_terms_touched_count", "ARETE-TERMS-TOUCHED-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "arete_experiment_full_filename", "ARETE-EXPERIMENT-FULL-FILENAME", 1, 1, false );
    SubLFiles.declareFunction( me, "arete_analysis_full_filename", "ARETE-ANALYSIS-FULL-FILENAME", 1, 0, false );
    SubLFiles.declareFunction( me, "load_arete_experiment", "LOAD-ARETE-EXPERIMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "suggest_filename_for_query_set_run", "SUGGEST-FILENAME-FOR-QUERY-SET-RUN", 1, 0, false );
    SubLFiles.declareFunction( me, "kbq_load_control_query_set_run", "KBQ-LOAD-CONTROL-QUERY-SET-RUN", 0, 1, false );
    SubLFiles.declareFunction( me, "kbq_compare_query_set_run_answers_to_control", "KBQ-COMPARE-QUERY-SET-RUN-ANSWERS-TO-CONTROL", 1, 0, false );
    SubLFiles.declareMacro( me, "run_arete_experiment", "RUN-ARETE-EXPERIMENT" );
    SubLFiles.declareFunction( me, "kbq_query_set_run_scaling_factors", "KBQ-QUERY-SET-RUN-SCALING-FACTORS", 2, 1, false );
    SubLFiles.declareFunction( me, "kbq_compute_scaling_factors_from_analysis", "KBQ-COMPUTE-SCALING-FACTORS-FROM-ANALYSIS", 1, 0, false );
    SubLFiles.declareFunction( me, "kbq_scale_analysis", "KBQ-SCALE-ANALYSIS", 3, 0, false );
    SubLFiles.declareFunction( me, "multiply_scaling_factors", "MULTIPLY-SCALING-FACTORS", 2, 0, false );
    SubLFiles.declareFunction( me, "invert_scaling_factors", "INVERT-SCALING-FACTORS", 1, 0, false );
    SubLFiles.declareFunction( me, "kbq_save_report", "KBQ-SAVE-REPORT", 2, 1, false );
    SubLFiles.declareFunction( me, "kbq_print_report", "KBQ-PRINT-REPORT", 1, 1, false );
    SubLFiles.declareFunction( me, "kbq_print_histogram", "KBQ-PRINT-HISTOGRAM", 3, 0, false );
    SubLFiles.declareFunction( me, "kbq_print_data", "KBQ-PRINT-DATA", 3, 0, false );
    SubLFiles.declareFunction( me, "kbq_print_tuples", "KBQ-PRINT-TUPLES", 3, 0, false );
    SubLFiles.declareFunction( me, "kbq_print_func_of_tuples", "KBQ-PRINT-FUNC-OF-TUPLES", 4, 0, false );
    SubLFiles.declareFunction( me, "kbq_compute_tuples", "KBQ-COMPUTE-TUPLES", 2, 0, false );
    SubLFiles.declareFunction( me, "kbq_print_error_queries", "KBQ-PRINT-ERROR-QUERIES", 1, 0, false );
    SubLFiles.declareFunction( me, "arete_generate_property_correlation_plot", "ARETE-GENERATE-PROPERTY-CORRELATION-PLOT", 3, 2, false );
    SubLFiles.declareFunction( me, "arete_generate_sorted_property_comparison", "ARETE-GENERATE-SORTED-PROPERTY-COMPARISON", 3, 3, false );
    SubLFiles.declareFunction( me, "arete_generate_sorted_properties_comparison", "ARETE-GENERATE-SORTED-PROPERTIES-COMPARISON", 2, 3, false );
    SubLFiles.declareFunction( me, "arete_generate_sorted_property_display", "ARETE-GENERATE-SORTED-PROPERTY-DISPLAY", 2, 3, false );
    SubLFiles.declareFunction( me, "assertion_cons_sharing_dictionary", "ASSERTION-CONS-SHARING-DICTIONARY", 0, 0, false );
    SubLFiles.declareFunction( me, "conses_saved_and_total_conses", "CONSES-SAVED-AND-TOTAL-CONSES", 1, 0, false );
    SubLFiles.declareFunction( me, "nauts_shared_and_unshared", "NAUTS-SHARED-AND-UNSHARED", 1, 0, false );
    SubLFiles.declareFunction( me, "kbq_hybridize_query_set_runs", "KBQ-HYBRIDIZE-QUERY-SET-RUNS", 1, 4, false );
    SubLFiles.declareFunction( me, "kbq_tag_query_set_runs", "KBQ-TAG-QUERY-SET-RUNS", 2, 0, false );
    SubLFiles.declareFunction( me, "kbq_hybridize_two_query_set_runs", "KBQ-HYBRIDIZE-TWO-QUERY-SET-RUNS", 2, 3, false );
    SubLFiles.declareFunction( me, "kbq_better_query_run", "KBQ-BETTER-QUERY-RUN", 2, 2, false );
    SubLFiles.declareFunction( me, "kbq_query_run_betterP", "KBQ-QUERY-RUN-BETTER?", 2, 1, false );
    SubLFiles.declareFunction( me, "kbq_query_run_better_per_answerP", "KBQ-QUERY-RUN-BETTER-PER-ANSWER?", 2, 1, false );
    SubLFiles.declareFunction( me, "kbq_query_run_better_wrt_timeP", "KBQ-QUERY-RUN-BETTER-WRT-TIME?", 2, 1, false );
    SubLFiles.declareFunction( me, "kbq_may_have_harmful_side_effectsP", "KBQ-MAY-HAVE-HARMFUL-SIDE-EFFECTS?", 1, 0, false );
    SubLFiles.declareFunction( me, "query_may_have_harmful_side_effectsP", "QUERY-MAY-HAVE-HARMFUL-SIDE-EFFECTS?", 1, 2, false );
    SubLFiles.declareFunction( me, "sentence_contains_subl_performativeP", "SENTENCE-CONTAINS-SUBL-PERFORMATIVE?", 1, 0, false );
    SubLFiles.declareFunction( me, "subl_performative_p", "SUBL-PERFORMATIVE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "conditional_sentence_with_closed_decontextualized_antecedent_literalP", "CONDITIONAL-SENTENCE-WITH-CLOSED-DECONTEXTUALIZED-ANTECEDENT-LITERAL?", 2, 0, false );
    SubLFiles.declareFunction( me, "kbq_numeric_quantification_queryP", "KBQ-NUMERIC-QUANTIFICATION-QUERY?", 1, 0, false );
    SubLFiles.declareFunction( me, "kbq_not_numeric_quantification_queryP", "KBQ-NOT-NUMERIC-QUANTIFICATION-QUERY?", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_arete_file()
  {
    $arete_experiment_directory$ = SubLFiles.deflexical( "*ARETE-EXPERIMENT-DIRECTORY*", $str0$_cyc_projects_inference_arete_exp );
    $arete_analysis_directory$ = SubLFiles.deflexical( "*ARETE-ANALYSIS-DIRECTORY*", $str3$_cyc_projects_inference_arete_ana );
    $kbq_control_query_set_run$ = SubLFiles.deflexical( "*KBQ-CONTROL-QUERY-SET-RUN*", ( maybeDefault( $sym8$_KBQ_CONTROL_QUERY_SET_RUN_, $kbq_control_query_set_run$, $kw9$UNINITIALIZED ) ) );
    $arete_outlier_timeout$ = SubLFiles.deflexical( "*ARETE-OUTLIER-TIMEOUT*", kbq_query_run.$kbq_default_outlier_timeout$.getGlobalValue() );
    return NIL;
  }

  public static SubLObject setup_arete_file()
  {
    subl_macro_promotions.declare_defglobal( $sym8$_KBQ_CONTROL_QUERY_SET_RUN_ );
    access_macros.define_obsolete_register( $sym69$ARETE_GENERATE_PROPERTY_CORRELATION_PLOT, $list70 );
    access_macros.define_obsolete_register( $sym71$ARETE_GENERATE_SORTED_PROPERTY_COMPARISON, $list72 );
    access_macros.define_obsolete_register( $sym74$ARETE_GENERATE_SORTED_PROPERTIES_COMPARISON, $list75 );
    access_macros.define_obsolete_register( $sym77$ARETE_GENERATE_SORTED_PROPERTY_DISPLAY, $list78 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_arete_file();
  }

  @Override
  public void initializeVariables()
  {
    init_arete_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_arete_file();
  }
  static
  {
    me = new arete();
    $arete_experiment_directory$ = null;
    $arete_analysis_directory$ = null;
    $kbq_control_query_set_run$ = null;
    $arete_outlier_timeout$ = null;
    $str0$_cyc_projects_inference_arete_exp = makeString( "/cyc/projects/inference/arete/experiments/" );
    $str1$_ = makeString( "." );
    $str2$cfasl = makeString( "cfasl" );
    $str3$_cyc_projects_inference_arete_ana = makeString( "/cyc/projects/inference/arete/analysis/" );
    $str4$txt = makeString( "txt" );
    $kw5$MACHINE = makeKeyword( "MACHINE" );
    $kw6$DATE = makeKeyword( "DATE" );
    $str7$kbq__8D__6D__A = makeString( "kbq-~8D-~6D-~A" );
    $sym8$_KBQ_CONTROL_QUERY_SET_RUN_ = makeSymbol( "*KBQ-CONTROL-QUERY-SET-RUN*" );
    $kw9$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $str10$tkb_training_with_auto_destroy_re = makeString( "tkb-training-with-auto-destroy-real-time" );
    $list11 = ConsesLow.list( new SubLObject[] { makeSymbol( "&KEY" ), makeSymbol( "QUERY-SPEC-SET" ), makeSymbol( "FILENAME" ), makeSymbol( "COMMENT" ), makeSymbol( "OVERRIDING-QUERY-PROPERTIES" ), ConsesLow.list(
        makeSymbol( "METRICS" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeSymbol( "ALL-ARETE-QUERY-METRICS" ) ) ) ), ConsesLow.list( makeSymbol( "OUTLIER-TIMEOUT" ), ConsesLow.list( makeSymbol(
            "QUOTE" ), makeSymbol( "*ARETE-OUTLIER-TIMEOUT*" ) ) ), makeSymbol( "INCREMENTAL" ), ConsesLow.list( makeSymbol( "INCLUDE-RESULTS" ), T ), ConsesLow.list( makeSymbol( "SKIP" ), ZERO_INTEGER ), makeSymbol(
                "COUNT" ), ConsesLow.list( makeSymbol( "DIRECTORY" ), makeSymbol( "*ARETE-EXPERIMENT-DIRECTORY*" ) )
    } );
    $list12 = ConsesLow.list( new SubLObject[] { makeKeyword( "QUERY-SPEC-SET" ), makeKeyword( "FILENAME" ), makeKeyword( "COMMENT" ), makeKeyword( "OVERRIDING-QUERY-PROPERTIES" ), makeKeyword( "METRICS" ), makeKeyword(
        "OUTLIER-TIMEOUT" ), makeKeyword( "INCREMENTAL" ), makeKeyword( "INCLUDE-RESULTS" ), makeKeyword( "SKIP" ), makeKeyword( "COUNT" ), makeKeyword( "DIRECTORY" )
    } );
    $kw13$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw14$QUERY_SPEC_SET = makeKeyword( "QUERY-SPEC-SET" );
    $kw15$FILENAME = makeKeyword( "FILENAME" );
    $kw16$COMMENT = makeKeyword( "COMMENT" );
    $kw17$OVERRIDING_QUERY_PROPERTIES = makeKeyword( "OVERRIDING-QUERY-PROPERTIES" );
    $kw18$METRICS = makeKeyword( "METRICS" );
    $list19 = ConsesLow.list( makeSymbol( "ALL-ARETE-QUERY-METRICS" ) );
    $kw20$OUTLIER_TIMEOUT = makeKeyword( "OUTLIER-TIMEOUT" );
    $sym21$_ARETE_OUTLIER_TIMEOUT_ = makeSymbol( "*ARETE-OUTLIER-TIMEOUT*" );
    $kw22$INCREMENTAL = makeKeyword( "INCREMENTAL" );
    $kw23$INCLUDE_RESULTS = makeKeyword( "INCLUDE-RESULTS" );
    $kw24$SKIP = makeKeyword( "SKIP" );
    $kw25$COUNT = makeKeyword( "COUNT" );
    $kw26$DIRECTORY = makeKeyword( "DIRECTORY" );
    $sym27$FILENAME_VAR = makeUninternedSymbol( "FILENAME-VAR" );
    $sym28$FULL_FILENAME = makeUninternedSymbol( "FULL-FILENAME" );
    $sym29$CLET = makeSymbol( "CLET" );
    $sym30$FWHEN = makeSymbol( "FWHEN" );
    $sym31$ARETE_EXPERIMENT_FULL_FILENAME = makeSymbol( "ARETE-EXPERIMENT-FULL-FILENAME" );
    $sym32$RUN_KBQ_EXPERIMENT = makeSymbol( "RUN-KBQ-EXPERIMENT" );
    $kw33$UNDEFINED = makeKeyword( "UNDEFINED" );
    $kw34$BASELINE = makeKeyword( "BASELINE" );
    $kw35$EXPERIMENT = makeKeyword( "EXPERIMENT" );
    $str36$_s_already_exists__specify_OVERWR = makeString( "~s already exists, specify OVERWRITE? T if you want to overwrite it" );
    $kw37$OUTPUT = makeKeyword( "OUTPUT" );
    $str38$Unable_to_open__S = makeString( "Unable to open ~S" );
    $str39$_________________________________ = makeString( "=========================================~%" );
    $str40$_a__ = makeString( "~a~%" );
    $list41 = ConsesLow.list( makeKeyword( "COMMENT" ), makeKeyword( "DATE" ), makeKeyword( "QUERY-RUNS" ) );
    $str42$Summary_Statistics___ = makeString( "Summary Statistics:~%" );
    $list43 = ConsesLow.list( makeKeyword( "ANSWER-COUNT" ), makeKeyword( "TOTAL-TIME" ), makeKeyword( "TIME-TO-FIRST-ANSWER" ), makeKeyword( "TIME-TO-LAST-ANSWER" ) );
    $str44$_________________________________ = makeString( "-----------------------------------------~%" );
    $kw45$HALT_REASON = makeKeyword( "HALT-REASON" );
    $kw46$ANSWER_COUNT = makeKeyword( "ANSWER-COUNT" );
    $kw47$TOTAL_TIME = makeKeyword( "TOTAL-TIME" );
    $kw48$TIME_TO_FIRST_ANSWER = makeKeyword( "TIME-TO-FIRST-ANSWER" );
    $kw49$TIME_TO_LAST_ANSWER = makeKeyword( "TIME-TO-LAST-ANSWER" );
    $kw50$MAX_TRANSFORMATION_DEPTH = makeKeyword( "MAX-TRANSFORMATION-DEPTH" );
    $kw51$BROWSABLE_ = makeKeyword( "BROWSABLE?" );
    $kw52$CONTINUABLE_ = makeKeyword( "CONTINUABLE?" );
    $list53 = ConsesLow.list( makeKeyword( "TOTAL-TIME" ), makeKeyword( "MAX-TRANSFORMATION-DEPTH" ) );
    $list54 = ConsesLow.list( makeKeyword( "TOTAL-TIME" ), makeKeyword( "MAX-TIME" ) );
    $list55 = ConsesLow.list( makeKeyword( "MAX-TIME" ), makeKeyword( "TOTAL-TIME" ) );
    $sym56$SAFE_DIFFERENCE = makeSymbol( "SAFE-DIFFERENCE" );
    $list57 = ConsesLow.list( makeKeyword( "QUERY-FUNCALL" ), makeSymbol( "KBQ-SENTENCE-CLOSED?" ) );
    $list58 = ConsesLow.list( makeKeyword( "QUERY-FUNCALL" ), makeSymbol( "KBQ-CANONICAL-MT" ) );
    $list59 = ConsesLow.list( makeKeyword( "TOTAL-TIME" ), ConsesLow.list( makeKeyword( "QUERY-FUNCALL" ), makeSymbol( "KBQ-CANONICAL-MT" ) ) );
    $str60$_s_Histogram___ = makeString( "~s Histogram:~%" );
    $sym61$SAFE__ = makeSymbol( "SAFE-<" );
    $str62$_s_Data___ = makeString( "~s Data:~%" );
    $str63$_s_Tuples___ = makeString( "~s Tuples:~%" );
    $sym64$FIRST = makeSymbol( "FIRST" );
    $str65$_s_applied_to__s___ = makeString( "~s applied to ~s:~%" );
    $sym66$MAPCAR = makeSymbol( "MAPCAR" );
    $sym67$LIST = makeSymbol( "LIST" );
    $str68$_s_____s__ = makeString( "~s -> ~s~%" );
    $sym69$ARETE_GENERATE_PROPERTY_CORRELATION_PLOT = makeSymbol( "ARETE-GENERATE-PROPERTY-CORRELATION-PLOT" );
    $list70 = ConsesLow.list( makeSymbol( "KBQ-GENERATE-PROPERTY-CORRELATION-PLOT" ) );
    $sym71$ARETE_GENERATE_SORTED_PROPERTY_COMPARISON = makeSymbol( "ARETE-GENERATE-SORTED-PROPERTY-COMPARISON" );
    $list72 = ConsesLow.list( makeSymbol( "KBQ-GENERATE-SORTED-PROPERTY-COMPARISON" ) );
    $kw73$BOTH = makeKeyword( "BOTH" );
    $sym74$ARETE_GENERATE_SORTED_PROPERTIES_COMPARISON = makeSymbol( "ARETE-GENERATE-SORTED-PROPERTIES-COMPARISON" );
    $list75 = ConsesLow.list( makeSymbol( "KBQ-GENERATE-SORTED-PROPERTIES-COMPARISON" ) );
    $kw76$ALL = makeKeyword( "ALL" );
    $sym77$ARETE_GENERATE_SORTED_PROPERTY_DISPLAY = makeSymbol( "ARETE-GENERATE-SORTED-PROPERTY-DISPLAY" );
    $list78 = ConsesLow.list( makeSymbol( "KBQ-GENERATE-SORTED-PROPERTY-DISPLAY" ) );
    $str79$Interning_all_assertion_conses = makeString( "Interning all assertion conses" );
    $sym80$STRINGP = makeSymbol( "STRINGP" );
    $str81$Looking_for_shared_nauts = makeString( "Looking for shared nauts" );
    $sym82$KBQ_QUERY_RUN_BETTER_ = makeSymbol( "KBQ-QUERY-RUN-BETTER?" );
    $kw83$ORIGIN = makeKeyword( "ORIGIN" );
    $kw84$QUERY_RUNS = makeKeyword( "QUERY-RUNS" );
    $str85$ = makeString( "" );
    $str86$__Hybridized_with___ = makeString( "~%Hybridized with:~%" );
    $sym87$SUBL_PERFORMATIVE_P = makeSymbol( "SUBL-PERFORMATIVE-P" );
    $const88$performSubL = constant_handles.reader_make_constant_shell( makeString( "performSubL" ) );
    $const89$trueSubL = constant_handles.reader_make_constant_shell( makeString( "trueSubL" ) );
    $kw90$CONDITIONAL_SENTENCE_ = makeKeyword( "CONDITIONAL-SENTENCE?" );
    $const91$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $kw92$IGNORE = makeKeyword( "IGNORE" );
    $sym93$CONSTANT_P = makeSymbol( "CONSTANT-P" );
    $list94 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nthLargestElement" ) ), constant_handles.reader_make_constant_shell( makeString( "extentCardinality" ) ), constant_handles
        .reader_make_constant_shell( makeString( "PlusAll" ) ), constant_handles.reader_make_constant_shell( makeString( "Average" ) ), constant_handles.reader_make_constant_shell( makeString(
            "ratioOfCollectionToDifferentiatedCollection" ) ), constant_handles.reader_make_constant_shell( makeString( "performsActsOfType-Percentage" ) ) );
  }
}
/*
 *
 * Total time: 386 ms
 *
 */