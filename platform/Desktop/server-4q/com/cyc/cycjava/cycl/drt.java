package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class drt
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.drt";
  public static final String myFingerPrint = "2690ac962e6aac2ae1bab3b6761c6f1f388be248bd63481dca1aea0d67313975";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 750L)
  public static SubLSymbol $drt_drs_list$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1307L)
  public static SubLSymbol $drt_coreferences$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1552L)
  public static SubLSymbol $drt_last_drs_for_speaker$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3015L)
  public static SubLSymbol $drt_trace_level$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3253L)
  public static SubLSymbol $drt_trace_stream$;
  private static final SubLInteger $int0$100;
  private static final SubLList $list1;
  private static final SubLSymbol $sym2$PWHEN;
  private static final SubLList $list3;
  private static final SubLSymbol $sym4$WARN;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$COR;
  private static final SubLList $list7;
  private static final SubLSymbol $sym8$__;
  private static final SubLSymbol $sym9$_DRT_TRACE_LEVEL_;
  private static final SubLList $list10;
  private static final SubLSymbol $sym11$DRT_TRACER_OUTPUT;
  private static final SubLSymbol $sym12$LIST;
  private static final SubLSymbol $sym13$FORMAT;
  private static final SubLSymbol $sym14$PROCESS;
  private static final SubLSymbol $sym15$CONSTRUCT_CYCL;
  private static final SubLString $str16$Discourse_Representation_Theory_T;
  private static final SubLString $str17$Discourse_Representation_Theory_T;
  private static final SubLList $list18;
  private static final SubLList $list19;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1776L)
  public static SubLObject clear_drt_coreferences()
  {
    $drt_coreferences$.setDynamicValue( Hashtables.make_hash_table( TEN_INTEGER, UNPROVIDED, UNPROVIDED ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1953L)
  public static SubLObject drt_get_coreference(final SubLObject rm)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Hashtables.gethash( rm, $drt_coreferences$.getDynamicValue( thread ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2073L)
  public static SubLObject drt_set_coreference(final SubLObject rm, final SubLObject target_rm)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Hashtables.sethash( rm, $drt_coreferences$.getDynamicValue( thread ), target_rm );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2223L)
  public static SubLObject clear_drt_last_drs_for_speaker()
  {
    $drt_last_drs_for_speaker$.setDynamicValue( Hashtables.make_hash_table( TEN_INTEGER, UNPROVIDED, UNPROVIDED ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2426L)
  public static SubLObject drt_get_last_drs_for_speaker(final SubLObject speaker)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Hashtables.gethash( speaker, $drt_last_drs_for_speaker$.getDynamicValue( thread ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2573L)
  public static SubLObject drt_set_last_drs_for_speaker(final SubLObject speaker, final SubLObject drs)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Hashtables.sethash( speaker, $drt_last_drs_for_speaker$.getDynamicValue( thread ), drs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2728L)
  public static SubLObject drt_initialize()
  {
    $drt_drs_list$.setDynamicValue( NIL );
    clear_drt_coreferences();
    clear_drt_last_drs_for_speaker();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3354L)
  public static SubLObject drt_warn(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject format_string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
    format_string = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    return ConsesLow.list( $sym2$PWHEN, $list3, ConsesLow.listS( $sym4$WARN, format_string, ConsesLow.append( args, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3486L)
  public static SubLObject drt_trace_progn(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject level = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    level = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym2$PWHEN, ConsesLow.list( $sym6$COR, $list7, ConsesLow.list( $sym8$__, $sym9$_DRT_TRACE_LEVEL_, level ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3646L)
  public static SubLObject drt_trace_out(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject level = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
    level = current.first();
    final SubLObject options;
    current = ( options = current.rest() );
    return ConsesLow.list( $sym2$PWHEN, ConsesLow.list( $sym6$COR, $list7, ConsesLow.list( $sym8$__, $sym9$_DRT_TRACE_LEVEL_, level ) ), ConsesLow.list( $sym11$DRT_TRACER_OUTPUT, level, reader.bq_cons( $sym12$LIST,
        ConsesLow.append( options, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3910L)
  public static SubLObject drt_tracer_output(final SubLObject level, final SubLObject format_control)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    Functions.apply( Symbols.symbol_function( $sym13$FORMAT ), ConsesLow.cons( $drt_trace_stream$.getDynamicValue( thread ), format_control ) );
    return $drt_trace_level$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4250L)
  public static SubLObject drt_trace(SubLObject level)
  {
    if( level == UNPROVIDED )
    {
      level = ZERO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    $drt_trace_level$.setDynamicValue( level, thread );
    return $drt_trace_level$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4432L)
  public static SubLObject drt_map_best_coreferences(final SubLObject possible_coreferences)
  {
    SubLObject cdolist_list_var = possible_coreferences;
    SubLObject possible_coreference = NIL;
    possible_coreference = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject source_rm = drt_drs.possible_rm_coreference_source_rm( possible_coreference );
      final SubLObject possible_coreference_targets = drt_drs.possible_rm_coreference_targets( possible_coreference );
      SubLObject chosen_target_probability = NIL;
      SubLObject chosen_target_rm = NIL;
      SubLObject cdolist_list_var_$1 = possible_coreference_targets;
      SubLObject possible_coreference_target = NIL;
      possible_coreference_target = cdolist_list_var_$1.first();
      while ( NIL != cdolist_list_var_$1)
      {
        final SubLObject target_rm = drt_drs.possible_rm_coreference_target_rm( possible_coreference_target );
        final SubLObject target_probability = drt_drs.possible_rm_coreference_target_probability( possible_coreference_target );
        if( NIL == chosen_target_rm )
        {
          chosen_target_rm = target_rm;
          chosen_target_probability = target_probability;
        }
        else if( target_probability.numG( chosen_target_probability ) )
        {
          chosen_target_rm = target_rm;
          chosen_target_probability = target_probability;
        }
        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
        possible_coreference_target = cdolist_list_var_$1.first();
      }
      if( NIL != chosen_target_rm )
      {
        drt_rm.map_rm( source_rm, chosen_target_rm );
      }
      cdolist_list_var = cdolist_list_var.rest();
      possible_coreference = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5746L)
  public static SubLObject drt_best_guess(final SubLObject formula, final SubLObject interaction_mt, final SubLObject parsing_mt, SubLObject speaker, SubLObject audience)
  {
    if( speaker == UNPROVIDED )
    {
      speaker = NIL;
    }
    if( audience == UNPROVIDED )
    {
      audience = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject drs = drt_drs.create_drs_from_formula( formula, interaction_mt, parsing_mt, speaker, audience );
    final SubLObject possible_coreferences = methods.funcall_instance_method_with_0_args( drs, $sym14$PROCESS );
    SubLObject result_cycl = NIL;
    if( possible_coreferences == T )
    {
      result_cycl = T;
    }
    else
    {
      drt_map_best_coreferences( possible_coreferences );
      result_cycl = methods.funcall_instance_method_with_0_args( drs, $sym15$CONSTRUCT_CYCL );
    }
    if( result_cycl.isList() )
    {
      thread.resetMultipleValues();
      final SubLObject v_object = list_utilities.tree_find( NIL, result_cycl, UNPROVIDED, UNPROVIDED );
      final SubLObject foundP = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != foundP )
      {
        result_cycl = T;
      }
    }
    return result_cycl;
  }

  public static SubLObject declare_drt_file()
  {
    SubLFiles.declareFunction( me, "clear_drt_coreferences", "CLEAR-DRT-COREFERENCES", 0, 0, false );
    SubLFiles.declareFunction( me, "drt_get_coreference", "DRT-GET-COREFERENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "drt_set_coreference", "DRT-SET-COREFERENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_drt_last_drs_for_speaker", "CLEAR-DRT-LAST-DRS-FOR-SPEAKER", 0, 0, false );
    SubLFiles.declareFunction( me, "drt_get_last_drs_for_speaker", "DRT-GET-LAST-DRS-FOR-SPEAKER", 1, 0, false );
    SubLFiles.declareFunction( me, "drt_set_last_drs_for_speaker", "DRT-SET-LAST-DRS-FOR-SPEAKER", 2, 0, false );
    SubLFiles.declareFunction( me, "drt_initialize", "DRT-INITIALIZE", 0, 0, false );
    SubLFiles.declareMacro( me, "drt_warn", "DRT-WARN" );
    SubLFiles.declareMacro( me, "drt_trace_progn", "DRT-TRACE-PROGN" );
    SubLFiles.declareMacro( me, "drt_trace_out", "DRT-TRACE-OUT" );
    SubLFiles.declareFunction( me, "drt_tracer_output", "DRT-TRACER-OUTPUT", 2, 0, false );
    SubLFiles.declareFunction( me, "drt_trace", "DRT-TRACE", 0, 1, false );
    SubLFiles.declareFunction( me, "drt_map_best_coreferences", "DRT-MAP-BEST-COREFERENCES", 1, 0, false );
    SubLFiles.declareFunction( me, "drt_best_guess", "DRT-BEST-GUESS", 3, 2, false );
    return NIL;
  }

  public static SubLObject init_drt_file()
  {
    $drt_drs_list$ = SubLFiles.defparameter( "*DRT-DRS-LIST*", NIL );
    $drt_coreferences$ = SubLFiles.defparameter( "*DRT-COREFERENCES*", Hashtables.make_hash_table( $int0$100, UNPROVIDED, UNPROVIDED ) );
    $drt_last_drs_for_speaker$ = SubLFiles.defparameter( "*DRT-LAST-DRS-FOR-SPEAKER*", Hashtables.make_hash_table( TEN_INTEGER, UNPROVIDED, UNPROVIDED ) );
    $drt_trace_level$ = SubLFiles.defparameter( "*DRT-TRACE-LEVEL*", ZERO_INTEGER );
    $drt_trace_stream$ = SubLFiles.defparameter( "*DRT-TRACE-STREAM*", T );
    return NIL;
  }

  public static SubLObject setup_drt_file()
  {
    sunit_external.define_test_category( $str16$Discourse_Representation_Theory_T, UNPROVIDED );
    sunit_external.define_test_suite( $str17$Discourse_Representation_Theory_T, $list18, $list19, UNPROVIDED );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_drt_file();
  }

  @Override
  public void initializeVariables()
  {
    init_drt_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_drt_file();
  }
  static
  {
    me = new drt();
    $drt_drs_list$ = null;
    $drt_coreferences$ = null;
    $drt_last_drs_for_speaker$ = null;
    $drt_trace_level$ = null;
    $drt_trace_stream$ = null;
    $int0$100 = makeInteger( 100 );
    $list1 = ConsesLow.list( makeSymbol( "FORMAT-STRING" ), makeSymbol( "&REST" ), makeSymbol( "ARGS" ) );
    $sym2$PWHEN = makeSymbol( "PWHEN" );
    $list3 = ConsesLow.list( makeSymbol( ">=" ), makeSymbol( "*DRT-TRACE-LEVEL*" ), ONE_INTEGER );
    $sym4$WARN = makeSymbol( "WARN" );
    $list5 = ConsesLow.list( makeSymbol( "LEVEL" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym6$COR = makeSymbol( "COR" );
    $list7 = ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "NUMBERP" ), makeSymbol( "*DRT-TRACE-LEVEL*" ) ) );
    $sym8$__ = makeSymbol( ">=" );
    $sym9$_DRT_TRACE_LEVEL_ = makeSymbol( "*DRT-TRACE-LEVEL*" );
    $list10 = ConsesLow.list( makeSymbol( "LEVEL" ), makeSymbol( "&REST" ), makeSymbol( "OPTIONS" ) );
    $sym11$DRT_TRACER_OUTPUT = makeSymbol( "DRT-TRACER-OUTPUT" );
    $sym12$LIST = makeSymbol( "LIST" );
    $sym13$FORMAT = makeSymbol( "FORMAT" );
    $sym14$PROCESS = makeSymbol( "PROCESS" );
    $sym15$CONSTRUCT_CYCL = makeSymbol( "CONSTRUCT-CYCL" );
    $str16$Discourse_Representation_Theory_T = makeString( "Discourse Representation Theory Test Category" );
    $str17$Discourse_Representation_Theory_T = makeString( "Discourse Representation Theory Test Suite" );
    $list18 = ConsesLow.list( makeString( "Discourse Representation Theory Test Category" ) );
    $list19 = ConsesLow.list( ConsesLow.list( makeString( "drt" ), makeString( "cycl" ) ), ConsesLow.list( makeString( "drt-rm" ), makeString( "cycl" ) ), ConsesLow.list( makeString( "drt-drs" ), makeString(
        "cycl" ) ) );
  }
}
/*
 * 
 * Total time: 88 ms
 * 
 */