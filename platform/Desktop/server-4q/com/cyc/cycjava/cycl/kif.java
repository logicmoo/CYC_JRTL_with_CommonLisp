package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kif
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.kif";
  public static final String myFingerPrint = "6ab85fde3a073e263e893d77e981002a0ab2d035dbb6ab75a2decb7f25592d95";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1598L)
  private static SubLSymbol $within_cycl_to_kif$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1647L)
  private static SubLSymbol $additional_kif_definitions$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2053L)
  public static SubLSymbol $cycl_to_kif_error_method$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2232L)
  private static SubLSymbol $default_kif_term_print_method$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2380L)
  public static SubLSymbol $kif_term_print_method$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6482L)
  private static SubLSymbol $kb_to_kif_file_preamble$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6712L)
  private static SubLSymbol $mt_to_kif_file_preamble$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10344L)
  public static SubLSymbol $dtp_kif_term$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10809L)
  private static SubLSymbol $kif_term_table$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12825L)
  private static SubLSymbol $cycl_to_kif_method_table$;
  private static final SubLSymbol $sym0$CCATCH_IGNORE;
  private static final SubLSymbol $kw1$ABORT_CYCL_TO_KIF;
  private static final SubLSymbol $sym2$CLET;
  private static final SubLList $list3;
  private static final SubLSymbol $kw4$ABORT;
  private static final SubLSymbol $sym5$WRITE_KIF_TERM_MIXED_CASE;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$PRINT_METHOD;
  private static final SubLSymbol $sym8$WITH_TEXT_FILE;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$WRITE_KB_CONTENT_COPYRIGHT_NOTICE;
  private static final SubLSymbol $sym11$_KIF_TERM_PRINT_METHOD_;
  private static final SubLSymbol $sym12$FIF;
  private static final SubLList $list13;
  private static final SubLList $list14;
  private static final SubLSymbol $sym15$STRINGP;
  private static final SubLSymbol $kw16$OUTPUT;
  private static final SubLString $str17$Unable_to_open__S;
  private static final SubLString $str18$Converting_KB_to_KIF;
  private static final SubLSymbol $kw19$SKIP;
  private static final SubLSymbol $kw20$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym21$IGNORE_ERRORS_HANDLER;
  private static final SubLSymbol $sym22$HLMT_P;
  private static final SubLSymbol $kw23$MT;
  private static final SubLSymbol $kw24$BROAD_MT;
  private static final SubLString $str25$do_broad_mt_index;
  private static final SubLSymbol $sym26$ASSERTION_P;
  private static final SubLList $list27;
  private static final SubLList $list28;
  private static final SubLSymbol $kw29$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw30$DIRECTION;
  private static final SubLSymbol $kw31$MONOTONICITY;
  private static final SubLSymbol $kw32$MICROTHEORY;
  private static final SubLSymbol $kw33$CREATOR;
  private static final SubLSymbol $kw34$CREATION_DATE;
  private static final SubLSymbol $kw35$KIF;
  private static final SubLString $str36$_____;
  private static final SubLString $str37$_DIRECTION__S;
  private static final SubLString $str38$__MONOTONICITY__S;
  private static final SubLString $str39$__CREATOR__S;
  private static final SubLString $str40$__CREATION_DATE__S;
  private static final SubLString $str41$____MICROTHEORY__S;
  private static final SubLString $str42$____KIF;
  private static final SubLString $str43$___;
  private static final SubLString $str44$_____KIF_assertion_specs_for_enti;
  private static final SubLString $str45$_____KIF_assertion_specs_for_micr;
  private static final SubLSymbol $sym46$CHAR_UPCASE;
  private static final SubLSymbol $sym47$CHAR_DOWNCASE;
  private static final SubLSymbol $kw48$IGNORE;
  private static final SubLSymbol $kw49$WARN;
  private static final SubLSymbol $sym50$WARN;
  private static final SubLSymbol $kw51$CERROR;
  private static final SubLSymbol $sym52$CERROR;
  private static final SubLString $str53$Use_NIL;
  private static final SubLSymbol $kw54$ERROR;
  private static final SubLSymbol $sym55$ERROR;
  private static final SubLList $list56;
  private static final SubLSymbol $sym57$PUNLESS;
  private static final SubLSymbol $sym58$_SUSPEND_TYPE_CHECKING__;
  private static final SubLSymbol $sym59$CYCL_TO_KIF_ERROR;
  private static final SubLString $str60$_A_is_not_a__A;
  private static final SubLSymbol $sym61$QUOTE;
  private static final SubLSymbol $sym62$KIF_TERM;
  private static final SubLSymbol $sym63$KIF_TERM_P;
  private static final SubLList $list64;
  private static final SubLList $list65;
  private static final SubLList $list66;
  private static final SubLList $list67;
  private static final SubLSymbol $sym68$PRINT_KIF_TERM;
  private static final SubLSymbol $sym69$KIF_TERM_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list70;
  private static final SubLSymbol $sym71$KIF_PRINT_STRING;
  private static final SubLSymbol $sym72$_CSETF_KIF_PRINT_STRING;
  private static final SubLSymbol $kw73$PRINT_STRING;
  private static final SubLString $str74$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw75$BEGIN;
  private static final SubLSymbol $sym76$MAKE_KIF_TERM;
  private static final SubLSymbol $kw77$SLOT;
  private static final SubLSymbol $kw78$END;
  private static final SubLSymbol $sym79$VISIT_DEFSTRUCT_OBJECT_KIF_TERM_METHOD;
  private static final SubLSymbol $sym80$SXHASH_KIF_TERM_METHOD;
  private static final SubLSymbol $sym81$_KIF_TERM_TABLE_;
  private static final SubLSymbol $sym82$CYCL_TO_KIF_FUNCTOR_P;
  private static final SubLSymbol $sym83$SYMBOLP;
  private static final SubLInteger $int84$50;
  private static final SubLList $list85;
  private static final SubLString $str86$CYCL_TO_KIF__A_METHOD;
  private static final SubLSymbol $sym87$PROGN;
  private static final SubLSymbol $sym88$DEFINE_PRIVATE;
  private static final SubLSymbol $sym89$REGISTER_CYCL_TO_KIF_METHOD;
  private static final SubLList $list90;
  private static final SubLSymbol $sym91$EL_VAR_;
  private static final SubLObject $const92$trueSentence;
  private static final SubLSymbol $sym93$CYCL_2_TERM_TO_KIF;
  private static final SubLString $str94$Expecting_a_variable___S;
  private static final SubLString $str95$Invalid_represented_first_order_t;
  private static final SubLList $list96;
  private static final SubLObject $const97$True;
  private static final SubLString $str98$true;
  private static final SubLObject $const99$False;
  private static final SubLString $str100$false;
  private static final SubLObject $const101$not;
  private static final SubLString $str102$not;
  private static final SubLList $list103;
  private static final SubLSymbol $sym104$CYCL_TO_KIF_NOT_METHOD;
  private static final SubLObject $const105$and;
  private static final SubLString $str106$and;
  private static final SubLList $list107;
  private static final SubLSymbol $sym108$CYCL_FORMULA_TO_KIF;
  private static final SubLSymbol $sym109$CYCL_TO_KIF_AND_METHOD;
  private static final SubLObject $const110$or;
  private static final SubLString $str111$or;
  private static final SubLList $list112;
  private static final SubLSymbol $sym113$CYCL_TO_KIF_OR_METHOD;
  private static final SubLObject $const114$implies;
  private static final SubLString $str115$__;
  private static final SubLList $list116;
  private static final SubLSymbol $sym117$CYCL_TO_KIF_IMPLIES_METHOD;
  private static final SubLObject $const118$equiv;
  private static final SubLString $str119$___;
  private static final SubLList $list120;
  private static final SubLSymbol $sym121$CYCL_TO_KIF_EQUIV_METHOD;
  private static final SubLList $list122;
  private static final SubLObject $const123$xor;
  private static final SubLSymbol $sym124$CYCL_TO_KIF_XOR_METHOD;
  private static final SubLList $list125;
  private static final SubLSymbol $sym126$CYCL_TO_KIF_TRUESENTENCE_METHOD;
  private static final SubLObject $const127$forAll;
  private static final SubLString $str128$forall;
  private static final SubLList $list129;
  private static final SubLSymbol $sym130$CYCL_TO_KIF_FORALL_METHOD;
  private static final SubLObject $const131$thereExists;
  private static final SubLString $str132$exists;
  private static final SubLList $list133;
  private static final SubLSymbol $sym134$CYCL_TO_KIF_THEREEXISTS_METHOD;
  private static final SubLObject $const135$thereExistExactly;
  private static final SubLSymbol $sym136$CYCL_TO_KIF_THEREEXISTEXACTLY_METHOD;
  private static final SubLObject $const137$thereExistAtLeast;
  private static final SubLSymbol $sym138$CYCL_TO_KIF_THEREEXISTATLEAST_METHOD;
  private static final SubLObject $const139$thereExistAtMost;
  private static final SubLSymbol $sym140$CYCL_TO_KIF_THEREEXISTATMOST_METHOD;
  private static final SubLList $list141;
  private static final SubLObject $const142$equals;
  private static final SubLString $str143$_;
  private static final SubLList $list144;
  private static final SubLObject $const145$ist;
  private static final SubLSymbol $sym146$CYCL_TO_KIF_IST_METHOD;
  private static final SubLList $list147;
  private static final SubLObject $const148$goals;
  private static final SubLSymbol $sym149$CYCL_TO_KIF_GOALS_METHOD;
  private static final SubLObject $const150$TheList;
  private static final SubLString $str151$listof;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1703L)
  public static SubLObject until_cycl_to_kif_aborted(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym0$CCATCH_IGNORE, $kw1$ABORT_CYCL_TO_KIF, ConsesLow.listS( $sym2$CLET, $list3, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1893L)
  public static SubLObject abort_cycl_to_kif()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $within_cycl_to_kif$.getDynamicValue( thread ) )
    {
      return Dynamic.sublisp_throw( $kw1$ABORT_CYCL_TO_KIF, NIL );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2516L)
  public static SubLObject writing_kif_file(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject stream = NIL;
    SubLObject filename = NIL;
    SubLObject kif_term_print_method = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
    stream = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
    filename = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
    kif_term_print_method = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject print_method = $sym7$PRINT_METHOD;
      return ConsesLow.list( $sym8$WITH_TEXT_FILE, ConsesLow.listS( stream, filename, $list9 ), ConsesLow.list( $sym10$WRITE_KB_CONTENT_COPYRIGHT_NOTICE, stream ), ConsesLow.listS( $sym2$CLET, ConsesLow.listS( ConsesLow
          .list( print_method, kif_term_print_method ), ConsesLow.list( $sym11$_KIF_TERM_PRINT_METHOD_, ConsesLow.listS( $sym12$FIF, print_method, print_method, $list13 ) ), $list14 ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list6 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2951L)
  public static SubLObject write_kb_to_kif_file(final SubLObject filename, SubLObject kif_term_print_method)
  {
    if( kif_term_print_method == UNPROVIDED )
    {
      kif_term_print_method = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( filename ) : filename;
    SubLObject written = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = compatibility.open_text( filename, $kw16$OUTPUT );
      if( !stream.isStream() )
      {
        Errors.error( $str17$Unable_to_open__S, filename );
      }
      final SubLObject stream_$1 = stream;
      misc_utilities.write_kb_content_copyright_notice( stream_$1 );
      final SubLObject print_method = kif_term_print_method;
      final SubLObject _prev_bind_0 = $kif_term_print_method$.currentBinding( thread );
      final SubLObject _prev_bind_2 = $cycl_to_kif_error_method$.currentBinding( thread );
      try
      {
        $kif_term_print_method$.bind( ( NIL != print_method ) ? print_method : $kif_term_print_method$.getDynamicValue( thread ), thread );
        $cycl_to_kif_error_method$.bind( $kw4$ABORT, thread );
        write_kb_to_kif_file_preamble( stream_$1 );
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = $str18$Converting_KB_to_KIF;
        final SubLObject total = id_index.id_index_count( idx );
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != Types.stringp( mess ) : mess;
        final SubLObject _prev_bind_0_$2 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
        final SubLObject _prev_bind_1_$3 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
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
            final SubLObject idx_$4 = idx;
            if( NIL == id_index.id_index_objects_empty_p( idx_$4, $kw19$SKIP ) )
            {
              final SubLObject idx_$5 = idx_$4;
              if( NIL == id_index.id_index_dense_objects_empty_p( idx_$5, $kw19$SKIP ) )
              {
                final SubLObject vector_var = id_index.id_index_dense_objects( idx_$5 );
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject a_id;
                SubLObject a_handle;
                SubLObject assertion;
                SubLObject ignore_errors_tag;
                SubLObject _prev_bind_0_$3;
                for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
                {
                  a_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                  a_handle = Vectors.aref( vector_var, a_id );
                  if( NIL == id_index.id_index_tombstone_p( a_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw19$SKIP ) )
                  {
                    if( NIL != id_index.id_index_tombstone_p( a_handle ) )
                    {
                      a_handle = $kw19$SKIP;
                    }
                    assertion = assertion_handles.resolve_assertion_id_value_pair( a_id, a_handle );
                    ignore_errors_tag = NIL;
                    try
                    {
                      thread.throwStack.push( $kw20$IGNORE_ERRORS_TARGET );
                      _prev_bind_0_$3 = Errors.$error_handler$.currentBinding( thread );
                      try
                      {
                        Errors.$error_handler$.bind( Symbols.symbol_function( $sym21$IGNORE_ERRORS_HANDLER ), thread );
                        try
                        {
                          assertion_kif_formula_to_stream( assertion, stream_$1 );
                        }
                        catch( final Throwable catch_var )
                        {
                          Errors.handleThrowable( catch_var, NIL );
                        }
                      }
                      finally
                      {
                        Errors.$error_handler$.rebind( _prev_bind_0_$3, thread );
                      }
                    }
                    catch( final Throwable ccatch_env_var )
                    {
                      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw20$IGNORE_ERRORS_TARGET );
                    }
                    finally
                    {
                      thread.throwStack.pop();
                    }
                    sofar = Numbers.add( sofar, ONE_INTEGER );
                    utilities_macros.note_percent_progress( sofar, total );
                  }
                }
              }
              final SubLObject idx_$6 = idx_$4;
              if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$6 ) || NIL == id_index.id_index_skip_tombstones_p( $kw19$SKIP ) )
              {
                final SubLObject sparse = id_index.id_index_sparse_objects( idx_$6 );
                SubLObject a_id2 = id_index.id_index_sparse_id_threshold( idx_$6 );
                final SubLObject end_id = id_index.id_index_next_id( idx_$6 );
                final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw19$SKIP ) ) ? NIL : $kw19$SKIP;
                while ( a_id2.numL( end_id ))
                {
                  final SubLObject a_handle2 = Hashtables.gethash_without_values( a_id2, sparse, v_default );
                  if( NIL == id_index.id_index_skip_tombstones_p( $kw19$SKIP ) || NIL == id_index.id_index_tombstone_p( a_handle2 ) )
                  {
                    final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair( a_id2, a_handle2 );
                    SubLObject ignore_errors_tag2 = NIL;
                    try
                    {
                      thread.throwStack.push( $kw20$IGNORE_ERRORS_TARGET );
                      final SubLObject _prev_bind_0_$4 = Errors.$error_handler$.currentBinding( thread );
                      try
                      {
                        Errors.$error_handler$.bind( Symbols.symbol_function( $sym21$IGNORE_ERRORS_HANDLER ), thread );
                        try
                        {
                          assertion_kif_formula_to_stream( assertion2, stream_$1 );
                        }
                        catch( final Throwable catch_var2 )
                        {
                          Errors.handleThrowable( catch_var2, NIL );
                        }
                      }
                      finally
                      {
                        Errors.$error_handler$.rebind( _prev_bind_0_$4, thread );
                      }
                    }
                    catch( final Throwable ccatch_env_var2 )
                    {
                      ignore_errors_tag2 = Errors.handleThrowable( ccatch_env_var2, $kw20$IGNORE_ERRORS_TARGET );
                    }
                    finally
                    {
                      thread.throwStack.pop();
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
            final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              utilities_macros.noting_percent_progress_postamble();
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$5, thread );
            }
          }
        }
        finally
        {
          utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
          utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
          utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1_$3, thread );
          utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$2, thread );
        }
        written = T;
      }
      finally
      {
        $cycl_to_kif_error_method$.rebind( _prev_bind_2, thread );
        $kif_term_print_method$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values2 = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_5, thread );
      }
    }
    return written;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3573L)
  public static SubLObject write_mt_to_kif_file(final SubLObject mt, final SubLObject filename, SubLObject kif_term_print_method)
  {
    if( kif_term_print_method == UNPROVIDED )
    {
      kif_term_print_method = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != hlmt.hlmt_p( mt ) : mt;
    assert NIL != Types.stringp( filename ) : filename;
    SubLObject written = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = compatibility.open_text( filename, $kw16$OUTPUT );
      if( !stream.isStream() )
      {
        Errors.error( $str17$Unable_to_open__S, filename );
      }
      final SubLObject stream_$10 = stream;
      misc_utilities.write_kb_content_copyright_notice( stream_$10 );
      final SubLObject print_method = kif_term_print_method;
      final SubLObject _prev_bind_0 = $kif_term_print_method$.currentBinding( thread );
      final SubLObject _prev_bind_2 = $cycl_to_kif_error_method$.currentBinding( thread );
      try
      {
        $kif_term_print_method$.bind( ( NIL != print_method ) ? print_method : $kif_term_print_method$.getDynamicValue( thread ), thread );
        $cycl_to_kif_error_method$.bind( $kw4$ABORT, thread );
        write_mt_to_kif_file_preamble( mt, stream_$10 );
        final SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method( mt );
        if( pcase_var.eql( $kw23$MT ) )
        {
          if( NIL != kb_mapping_macros.do_mt_index_key_validator( mt, NIL ) )
          {
            final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec( mt );
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, NIL, NIL, NIL );
              SubLObject done_var = NIL;
              final SubLObject token_var = NIL;
              while ( NIL == done_var)
              {
                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var );
                final SubLObject valid = makeBoolean( !token_var.eql( assertion ) );
                if( NIL != valid )
                {
                  SubLObject ignore_errors_tag = NIL;
                  try
                  {
                    thread.throwStack.push( $kw20$IGNORE_ERRORS_TARGET );
                    final SubLObject _prev_bind_0_$11 = Errors.$error_handler$.currentBinding( thread );
                    try
                    {
                      Errors.$error_handler$.bind( Symbols.symbol_function( $sym21$IGNORE_ERRORS_HANDLER ), thread );
                      try
                      {
                        assertion_kif_formula_to_stream( assertion, stream_$10 );
                      }
                      catch( final Throwable catch_var )
                      {
                        Errors.handleThrowable( catch_var, NIL );
                      }
                    }
                    finally
                    {
                      Errors.$error_handler$.rebind( _prev_bind_0_$11, thread );
                    }
                  }
                  catch( final Throwable ccatch_env_var )
                  {
                    ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw20$IGNORE_ERRORS_TARGET );
                  }
                  finally
                  {
                    thread.throwStack.pop();
                  }
                }
                done_var = makeBoolean( NIL == valid );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$12, thread );
              }
            }
          }
        }
        else if( pcase_var.eql( $kw24$BROAD_MT ) && NIL != kb_mapping_macros.do_broad_mt_index_key_validator( mt, NIL ) )
        {
          final SubLObject idx = assertion_handles.do_assertions_table();
          final SubLObject mess = $str25$do_broad_mt_index;
          final SubLObject total = id_index.id_index_count( idx );
          SubLObject sofar = ZERO_INTEGER;
          assert NIL != Types.stringp( mess ) : mess;
          final SubLObject _prev_bind_0_$13 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
          final SubLObject _prev_bind_1_$14 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
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
              final SubLObject idx_$15 = idx;
              if( NIL == id_index.id_index_objects_empty_p( idx_$15, $kw19$SKIP ) )
              {
                final SubLObject idx_$16 = idx_$15;
                if( NIL == id_index.id_index_dense_objects_empty_p( idx_$16, $kw19$SKIP ) )
                {
                  final SubLObject vector_var = id_index.id_index_dense_objects( idx_$16 );
                  final SubLObject backwardP_var = NIL;
                  SubLObject length;
                  SubLObject v_iteration;
                  SubLObject a_id;
                  SubLObject a_handle;
                  SubLObject assertion2;
                  SubLObject ignore_errors_tag2;
                  SubLObject _prev_bind_0_$14;
                  for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
                  {
                    a_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                    a_handle = Vectors.aref( vector_var, a_id );
                    if( NIL == id_index.id_index_tombstone_p( a_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw19$SKIP ) )
                    {
                      if( NIL != id_index.id_index_tombstone_p( a_handle ) )
                      {
                        a_handle = $kw19$SKIP;
                      }
                      assertion2 = assertion_handles.resolve_assertion_id_value_pair( a_id, a_handle );
                      if( NIL != kb_mapping_macros.do_broad_mt_index_match_p( assertion2, mt, NIL, NIL ) )
                      {
                        ignore_errors_tag2 = NIL;
                        try
                        {
                          thread.throwStack.push( $kw20$IGNORE_ERRORS_TARGET );
                          _prev_bind_0_$14 = Errors.$error_handler$.currentBinding( thread );
                          try
                          {
                            Errors.$error_handler$.bind( Symbols.symbol_function( $sym21$IGNORE_ERRORS_HANDLER ), thread );
                            try
                            {
                              assertion_kif_formula_to_stream( assertion2, stream_$10 );
                            }
                            catch( final Throwable catch_var2 )
                            {
                              Errors.handleThrowable( catch_var2, NIL );
                            }
                          }
                          finally
                          {
                            Errors.$error_handler$.rebind( _prev_bind_0_$14, thread );
                          }
                        }
                        catch( final Throwable ccatch_env_var2 )
                        {
                          ignore_errors_tag2 = Errors.handleThrowable( ccatch_env_var2, $kw20$IGNORE_ERRORS_TARGET );
                        }
                        finally
                        {
                          thread.throwStack.pop();
                        }
                      }
                      sofar = Numbers.add( sofar, ONE_INTEGER );
                      utilities_macros.note_percent_progress( sofar, total );
                    }
                  }
                }
                final SubLObject idx_$17 = idx_$15;
                if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$17 ) || NIL == id_index.id_index_skip_tombstones_p( $kw19$SKIP ) )
                {
                  final SubLObject sparse = id_index.id_index_sparse_objects( idx_$17 );
                  SubLObject a_id2 = id_index.id_index_sparse_id_threshold( idx_$17 );
                  final SubLObject end_id = id_index.id_index_next_id( idx_$17 );
                  final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw19$SKIP ) ) ? NIL : $kw19$SKIP;
                  while ( a_id2.numL( end_id ))
                  {
                    final SubLObject a_handle2 = Hashtables.gethash_without_values( a_id2, sparse, v_default );
                    if( NIL == id_index.id_index_skip_tombstones_p( $kw19$SKIP ) || NIL == id_index.id_index_tombstone_p( a_handle2 ) )
                    {
                      final SubLObject assertion3 = assertion_handles.resolve_assertion_id_value_pair( a_id2, a_handle2 );
                      if( NIL != kb_mapping_macros.do_broad_mt_index_match_p( assertion3, mt, NIL, NIL ) )
                      {
                        SubLObject ignore_errors_tag3 = NIL;
                        try
                        {
                          thread.throwStack.push( $kw20$IGNORE_ERRORS_TARGET );
                          final SubLObject _prev_bind_0_$15 = Errors.$error_handler$.currentBinding( thread );
                          try
                          {
                            Errors.$error_handler$.bind( Symbols.symbol_function( $sym21$IGNORE_ERRORS_HANDLER ), thread );
                            try
                            {
                              assertion_kif_formula_to_stream( assertion3, stream_$10 );
                            }
                            catch( final Throwable catch_var3 )
                            {
                              Errors.handleThrowable( catch_var3, NIL );
                            }
                          }
                          finally
                          {
                            Errors.$error_handler$.rebind( _prev_bind_0_$15, thread );
                          }
                        }
                        catch( final Throwable ccatch_env_var3 )
                        {
                          ignore_errors_tag3 = Errors.handleThrowable( ccatch_env_var3, $kw20$IGNORE_ERRORS_TARGET );
                        }
                        finally
                        {
                          thread.throwStack.pop();
                        }
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
              final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                utilities_macros.noting_percent_progress_postamble();
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$16, thread );
              }
            }
          }
          finally
          {
            utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
            utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
            utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1_$14, thread );
            utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$13, thread );
          }
        }
        written = T;
      }
      finally
      {
        $cycl_to_kif_error_method$.rebind( _prev_bind_2, thread );
        $kif_term_print_method$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values3 = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values3 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_5, thread );
      }
    }
    return written;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4142L)
  public static SubLObject assertion_kif_formula_to_stream(final SubLObject assertion, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    final SubLObject kif_spec = assertion_kif_formula( assertion );
    if( NIL != kif_spec )
    {
      final SubLObject current;
      final SubLObject datum = current = kif_spec;
      SubLObject allow_other_keys_p = NIL;
      SubLObject rest = current;
      SubLObject bad = NIL;
      SubLObject current_$21 = NIL;
      while ( NIL != rest)
      {
        cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list27 );
        current_$21 = rest.first();
        rest = rest.rest();
        cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list27 );
        if( NIL == conses_high.member( current_$21, $list28, UNPROVIDED, UNPROVIDED ) )
        {
          bad = T;
        }
        if( current_$21 == $kw29$ALLOW_OTHER_KEYS )
        {
          allow_other_keys_p = rest.first();
        }
        rest = rest.rest();
      }
      if( NIL != bad && NIL == allow_other_keys_p )
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list27 );
      }
      final SubLObject direction_tail = cdestructuring_bind.property_list_member( $kw30$DIRECTION, current );
      final SubLObject direction = ( NIL != direction_tail ) ? conses_high.cadr( direction_tail ) : NIL;
      final SubLObject monotonicity_tail = cdestructuring_bind.property_list_member( $kw31$MONOTONICITY, current );
      final SubLObject monotonicity = ( NIL != monotonicity_tail ) ? conses_high.cadr( monotonicity_tail ) : NIL;
      final SubLObject microtheory_tail = cdestructuring_bind.property_list_member( $kw32$MICROTHEORY, current );
      final SubLObject microtheory = ( NIL != microtheory_tail ) ? conses_high.cadr( microtheory_tail ) : NIL;
      final SubLObject creator_tail = cdestructuring_bind.property_list_member( $kw33$CREATOR, current );
      final SubLObject creator = ( NIL != creator_tail ) ? conses_high.cadr( creator_tail ) : NIL;
      final SubLObject creation_date_tail = cdestructuring_bind.property_list_member( $kw34$CREATION_DATE, current );
      final SubLObject creation_date = ( NIL != creation_date_tail ) ? conses_high.cadr( creation_date_tail ) : NIL;
      final SubLObject kif_tail = cdestructuring_bind.property_list_member( $kw35$KIF, current );
      final SubLObject v_kif = ( NIL != kif_tail ) ? conses_high.cadr( kif_tail ) : NIL;
      PrintLow.format( stream, $str36$_____ );
      PrintLow.format( stream, $str37$_DIRECTION__S, direction );
      PrintLow.format( stream, $str38$__MONOTONICITY__S, monotonicity );
      PrintLow.format( stream, $str39$__CREATOR__S, creator );
      PrintLow.format( stream, $str40$__CREATION_DATE__S, creation_date );
      PrintLow.format( stream, $str41$____MICROTHEORY__S, microtheory );
      PrintLow.format( stream, $str42$____KIF );
      format_cycl_expression.format_cycl_expression( v_kif, stream, ONE_INTEGER );
      PrintLow.format( stream, $str43$___ );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4937L)
  public static SubLObject assertion_kif_formula(final SubLObject assertion)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( NIL != assertions_high.valid_assertion( assertion, UNPROVIDED ) )
    {
      final SubLObject el_formula = uncanonicalizer.assertion_el_formula( assertion );
      if( NIL != el_formula )
      {
        final SubLObject kif_formula = cycl_to_kif( el_formula );
        if( NIL != kif_formula )
        {
          final SubLObject mt = assertions_high.assertion_mt( assertion );
          final SubLObject kif_mt = cycl_to_kif( mt );
          if( NIL != kif_mt )
          {
            final SubLObject direction = assertions_high.assertion_direction( assertion );
            final SubLObject strength = assertions_high.assertion_strength( assertion );
            SubLObject asserted_by = NIL;
            SubLObject asserted_when = NIL;
            if( NIL != assertions_high.asserted_assertionP( assertion ) )
            {
              asserted_by = assertions_high.asserted_by( assertion );
              asserted_when = assertions_high.asserted_when( assertion );
              if( NIL != asserted_by )
              {
                asserted_by = cycl_to_kif( asserted_by );
              }
            }
            if( NIL != kif_formula && NIL != kif_mt )
            {
              return ConsesLow.list( new SubLObject[] { $kw30$DIRECTION, direction, $kw31$MONOTONICITY, strength, $kw32$MICROTHEORY, kif_mt, $kw33$CREATOR, asserted_by, $kw34$CREATION_DATE, asserted_when, $kw35$KIF,
                kif_formula
              } );
            }
          }
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5986L)
  public static SubLObject meld_to_kif(final SubLObject meld)
  {
    return cycl_to_kif( meld );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6127L)
  public static SubLObject cycl_to_kif(final SubLObject cycl)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    SubLObject catch_var = NIL;
    try
    {
      thread.throwStack.push( $kw1$ABORT_CYCL_TO_KIF );
      final SubLObject _prev_bind_0 = $additional_kif_definitions$.currentBinding( thread );
      final SubLObject _prev_bind_2 = $within_cycl_to_kif$.currentBinding( thread );
      try
      {
        $additional_kif_definitions$.bind( NIL, thread );
        $within_cycl_to_kif$.bind( T, thread );
        final SubLObject v_kif = cycl_formula_to_kif( cycl );
        final SubLObject definitions = additional_kif_definitions();
        if( NIL != definitions )
        {
          v_answer = reader.bq_cons( v_kif, ConsesLow.append( definitions, NIL ) );
        }
        else
        {
          v_answer = v_kif;
        }
      }
      finally
      {
        $within_cycl_to_kif$.rebind( _prev_bind_2, thread );
        $additional_kif_definitions$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var = Errors.handleThrowable( ccatch_env_var, $kw1$ABORT_CYCL_TO_KIF );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6600L)
  public static SubLObject write_kb_to_kif_file_preamble(final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return PrintLow.format( stream, $kb_to_kif_file_preamble$.getDynamicValue( thread ), numeric_date_utilities.timestring( UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6823L)
  public static SubLObject write_mt_to_kif_file_preamble(final SubLObject mt, final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return PrintLow.format( stream, $mt_to_kif_file_preamble$.getDynamicValue( thread ), mt, numeric_date_utilities.timestring( UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6989L)
  public static SubLObject write_kif_term_mixed_case(final SubLObject print_string, final SubLObject stream)
  {
    return print_high.princ( print_string, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7213L)
  public static SubLObject write_kif_term_upcase(final SubLObject print_string, final SubLObject stream)
  {
    SubLObject cdotimes_end_var;
    SubLObject i;
    for( cdotimes_end_var = Sequences.length( print_string ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      streams_high.write_char( Characters.char_upcase( Strings.sublisp_char( print_string, i ) ), stream );
    }
    return print_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7435L)
  public static SubLObject write_kif_term_downcase(final SubLObject print_string, final SubLObject stream)
  {
    SubLObject cdotimes_end_var;
    SubLObject i;
    for( cdotimes_end_var = Sequences.length( print_string ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      streams_high.write_char( Characters.char_downcase( Strings.sublisp_char( print_string, i ) ), stream );
    }
    return print_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7661L)
  public static SubLObject write_kif_term_hyphen_mixed_case(final SubLObject print_string, final SubLObject stream)
  {
    return write_kif_term_hyphenate( print_string, stream, IDENTITY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7852L)
  public static SubLObject write_kif_term_hyphen_upcase(final SubLObject print_string, final SubLObject stream)
  {
    return write_kif_term_hyphenate( print_string, stream, $sym46$CHAR_UPCASE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8040L)
  public static SubLObject write_kif_term_hyphen_downcase(final SubLObject print_string, final SubLObject stream)
  {
    return write_kif_term_hyphenate( print_string, stream, $sym47$CHAR_DOWNCASE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8232L)
  public static SubLObject write_kif_term_hyphenate(final SubLObject print_string, final SubLObject stream, final SubLObject char_conversion_func)
  {
    final SubLObject length = Sequences.length( print_string );
    SubLObject last_char = NIL;
    SubLObject this_char = NIL;
    SubLObject index;
    for( index = NIL, index = ZERO_INTEGER; !index.numE( length ); index = Numbers.add( index, ONE_INTEGER ) )
    {
      last_char = this_char;
      this_char = Strings.sublisp_char( print_string, index );
      if( NIL != write_kif_term_insert_hyphen( last_char, this_char ) )
      {
        streams_high.write_char( Characters.CHAR_hyphen, stream );
      }
      streams_high.write_char( Functions.funcall( char_conversion_func, this_char ), stream );
    }
    return print_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8706L)
  public static SubLObject write_kif_term_insert_hyphen(final SubLObject last_char, final SubLObject this_char)
  {
    return makeBoolean( NIL != last_char && NIL != this_char && ( ( NIL != Characters.alpha_char_p( last_char ) && NIL != Characters.digit_char_p( this_char, UNPROVIDED ) ) || ( NIL != Characters.digit_char_p( last_char,
        UNPROVIDED ) && NIL != Characters.alpha_char_p( this_char ) ) || ( NIL != Characters.lower_case_p( last_char ) && NIL != Characters.upper_case_p( this_char ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9231L)
  public static SubLObject cycl_to_kif_error(final SubLObject format_string, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4)
  {
    if( arg1 == UNPROVIDED )
    {
      arg1 = NIL;
    }
    if( arg2 == UNPROVIDED )
    {
      arg2 = NIL;
    }
    if( arg3 == UNPROVIDED )
    {
      arg3 = NIL;
    }
    if( arg4 == UNPROVIDED )
    {
      arg4 = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pcase_var = $cycl_to_kif_error_method$.getDynamicValue( thread );
    if( pcase_var.eql( $kw4$ABORT ) )
    {
      abort_cycl_to_kif();
    }
    else if( !pcase_var.eql( $kw48$IGNORE ) )
    {
      if( pcase_var.eql( $kw49$WARN ) )
      {
        Functions.funcall( Symbols.symbol_function( $sym50$WARN ), format_string, arg1, arg2, arg3, arg4 );
      }
      else if( pcase_var.eql( $kw51$CERROR ) )
      {
        Functions.funcall( Symbols.symbol_function( $sym52$CERROR ), $str53$Use_NIL, format_string, arg1, arg2, arg3, arg4 );
      }
      else if( pcase_var.eql( $kw54$ERROR ) )
      {
        Functions.funcall( Symbols.symbol_function( $sym55$ERROR ), format_string, arg1, arg2, arg3, arg4 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9788L)
  public static SubLObject cycl_to_kif_check(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_object = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list56 );
    v_object = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list56 );
    pred = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym57$PUNLESS, $sym58$_SUSPEND_TYPE_CHECKING__, ConsesLow.list( $sym57$PUNLESS, ConsesLow.list( pred, v_object ), ConsesLow.list( $sym59$CYCL_TO_KIF_ERROR, $str60$_A_is_not_a__A, v_object,
          ConsesLow.list( $sym61$QUOTE, pred ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list56 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9982L)
  public static SubLObject register_kif_definition(final SubLObject kif_definition)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $within_cycl_to_kif$.getDynamicValue( thread ) )
    {
      $additional_kif_definitions$.setDynamicValue( ConsesLow.cons( kif_definition, $additional_kif_definitions$.getDynamicValue( thread ) ), thread );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10185L)
  public static SubLObject additional_kif_definitions()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $within_cycl_to_kif$.getDynamicValue( thread ) )
    {
      final SubLObject definitions = $additional_kif_definitions$.getDynamicValue( thread );
      return definitions;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10344L)
  public static SubLObject kif_term_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_kif_term( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10344L)
  public static SubLObject kif_term_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $kif_term_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10344L)
  public static SubLObject kif_print_string(final SubLObject v_object)
  {
    assert NIL != kif_term_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10344L)
  public static SubLObject _csetf_kif_print_string(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != kif_term_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10344L)
  public static SubLObject make_kif_term(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $kif_term_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw73$PRINT_STRING ) )
      {
        _csetf_kif_print_string( v_new, current_value );
      }
      else
      {
        Errors.error( $str74$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10344L)
  public static SubLObject visit_defstruct_kif_term(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw75$BEGIN, $sym76$MAKE_KIF_TERM, ONE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw77$SLOT, $kw73$PRINT_STRING, kif_print_string( obj ) );
    Functions.funcall( visitor_fn, obj, $kw78$END, $sym76$MAKE_KIF_TERM, ONE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10344L)
  public static SubLObject visit_defstruct_object_kif_term_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_kif_term( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10525L)
  public static SubLObject sxhash_kif_term_method(final SubLObject v_object)
  {
    return Sxhash.sxhash( kif_print_string( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10612L)
  public static SubLObject print_kif_term(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject print_string = kif_print_string( v_object );
    Functions.funcall( $kif_term_print_method$.getDynamicValue( thread ), print_string, stream );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11020L)
  public static SubLObject cycl_to_kif_standard_mapping(final SubLObject cycl_term, final SubLObject print_string)
  {
    if( NIL != $kif_term_table$.getGlobalValue() )
    {
      Hashtables.remhash( cycl_term, $kif_term_table$.getGlobalValue() );
    }
    return intern_kif_term( cycl_term, print_string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11305L)
  public static SubLObject find_kif_term(final SubLObject cycl_term)
  {
    if( NIL != $kif_term_table$.getGlobalValue() )
    {
      return Values.values( Hashtables.gethash( cycl_term, $kif_term_table$.getGlobalValue(), UNPROVIDED ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11516L)
  public static SubLObject intern_kif_term(final SubLObject cycl_term, SubLObject print_string)
  {
    if( print_string == UNPROVIDED )
    {
      print_string = NIL;
    }
    SubLObject kif_term = find_kif_term( cycl_term );
    if( NIL == kif_term )
    {
      kif_term = new_kif_term( string_for_kif_term( cycl_term, print_string ) );
      note_kif_term( cycl_term, kif_term );
    }
    return kif_term;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11944L)
  public static SubLObject note_kif_term(final SubLObject cycl_term, final SubLObject kif_term)
  {
    assert NIL != kif_term_p( kif_term ) : kif_term;
    if( NIL == $kif_term_table$.getGlobalValue() )
    {
      $kif_term_table$.setGlobalValue( Hashtables.make_hash_table( constant_handles.constant_count(), UNPROVIDED, UNPROVIDED ) );
    }
    Hashtables.sethash( cycl_term, $kif_term_table$.getGlobalValue(), kif_term );
    return kif_term;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12275L)
  public static SubLObject new_kif_term(final SubLObject print_string)
  {
    final SubLObject kif_term = make_kif_term( UNPROVIDED );
    _csetf_kif_print_string( kif_term, print_string );
    return kif_term;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12431L)
  public static SubLObject string_for_kif_term(final SubLObject cycl_term, SubLObject print_string)
  {
    if( print_string == UNPROVIDED )
    {
      print_string = NIL;
    }
    if( print_string.isString() )
    {
      return print_string;
    }
    if( NIL != constant_handles.constant_p( cycl_term ) )
    {
      return constants_high.constant_name( cycl_term );
    }
    if( cycl_term.isString() )
    {
      return cycl_term;
    }
    if( cycl_term.isSymbol() )
    {
      return Symbols.symbol_name( cycl_term );
    }
    return print_high.princ_to_string( cycl_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13044L)
  public static SubLObject cycl_to_kif_method(final SubLObject cycl_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $cycl_to_kif_method_table$.getDynamicValue( thread ) && NIL != cycl_to_kif_functor_p( cycl_term ) )
    {
      return Hashtables.gethash( cycl_to_kif_functor_string( cycl_term ), $cycl_to_kif_method_table$.getDynamicValue( thread ), UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13345L)
  public static SubLObject register_cycl_to_kif_method(final SubLObject cycl_term, final SubLObject function_symbol)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != cycl_to_kif_functor_p( cycl_term ) : cycl_term;
    assert NIL != Types.symbolp( function_symbol ) : function_symbol;
    if( NIL == $cycl_to_kif_method_table$.getDynamicValue( thread ) )
    {
      $cycl_to_kif_method_table$.setDynamicValue( Hashtables.make_hash_table( $int84$50, UNPROVIDED, UNPROVIDED ), thread );
    }
    Hashtables.sethash( cycl_to_kif_functor_string( cycl_term ), $cycl_to_kif_method_table$.getDynamicValue( thread ), function_symbol );
    return function_symbol;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13830L)
  public static SubLObject deregister_cycl_to_kif_method(final SubLObject cycl_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != cycl_to_kif_functor_p( cycl_term ) : cycl_term;
    if( NIL != $cycl_to_kif_method_table$.getDynamicValue( thread ) )
    {
      return Hashtables.remhash( cycl_to_kif_functor_string( cycl_term ), $cycl_to_kif_method_table$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14118L)
  public static SubLObject cycl_to_kif_functor_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != constant_handles.constant_p( v_object ) || NIL != predefined_kif_symbol( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14237L)
  public static SubLObject predefined_kif_symbol(final SubLObject v_object)
  {
    return makeBoolean( v_object.isSymbol() && !v_object.isKeyword() && NIL == cycl_variables.el_varP( v_object ) && NIL != find_kif_term( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14408L)
  public static SubLObject cycl_to_kif_functor_string(final SubLObject functor)
  {
    assert NIL != cycl_to_kif_functor_p( functor ) : functor;
    if( NIL != constant_handles.constant_p( functor ) )
    {
      return constants_high.constant_name( functor );
    }
    if( functor.isSymbol() )
    {
      return Symbols.symbol_name( functor );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14637L)
  public static SubLObject define_cycl_to_kif_method(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject cycl_term = NIL;
    SubLObject arglist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list85 );
    cycl_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list85 );
    arglist = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject name = Strings.string_upcase( ( NIL != constant_handles.constant_p( cycl_term ) ) ? constants_high.constant_name( cycl_term ) : ( cycl_term.isSymbol() ? Symbols.symbol_name( cycl_term ) : NIL ),
        UNPROVIDED, UNPROVIDED );
    final SubLObject function_name = PrintLow.format( NIL, $str86$CYCL_TO_KIF__A_METHOD, name );
    final SubLObject function = Packages.intern( function_name, UNPROVIDED );
    return ConsesLow.list( $sym87$PROGN, ConsesLow.listS( $sym88$DEFINE_PRIVATE, function, arglist, ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym89$REGISTER_CYCL_TO_KIF_METHOD, ConsesLow.list( $sym61$QUOTE,
        cycl_term ), ConsesLow.list( $sym61$QUOTE, function ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15179L)
  public static SubLObject cycl_formula_to_kif(final SubLObject formula)
  {
    if( formula.isAtom() )
    {
      return cycl_1_term_to_kif( formula );
    }
    final SubLObject functor = formula.first();
    final SubLObject method = cycl_to_kif_method( functor );
    if( NIL != method )
    {
      return Functions.funcall( method, formula );
    }
    return cycl_atomic_sentence_to_kif( formula );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15616L)
  public static SubLObject cycl_atomic_sentence_to_kif(final SubLObject atomic_sentence)
  {
    SubLObject predicate = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( atomic_sentence, atomic_sentence, $list90 );
    predicate = atomic_sentence.first();
    SubLObject v_arguments;
    final SubLObject current = v_arguments = atomic_sentence.rest();
    predicate = cycl_rep_1_term_to_kif( predicate );
    v_arguments = cycl_atomic_sentence_args_to_kif( v_arguments );
    if( NIL != list_utilities.tree_find_if( Symbols.symbol_function( $sym91$EL_VAR_ ), predicate, UNPROVIDED ) )
    {
      final SubLObject true_sentence = cycl_constant_to_kif( $const92$trueSentence );
      return ConsesLow.list( true_sentence, reader.bq_cons( predicate, ConsesLow.append( v_arguments, NIL ) ) );
    }
    return reader.bq_cons( predicate, ConsesLow.append( v_arguments, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16110L)
  public static SubLObject cycl_atomic_sentence_args_to_kif(final SubLObject v_arguments)
  {
    if( NIL != list_utilities.proper_list_p( v_arguments ) )
    {
      return Mapping.mapcar( Symbols.symbol_function( $sym93$CYCL_2_TERM_TO_KIF ), v_arguments );
    }
    return cycl_atomic_sentence_args_to_kif_recursive( v_arguments );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16390L)
  public static SubLObject cycl_atomic_sentence_args_to_kif_recursive(final SubLObject v_arguments)
  {
    if( NIL == v_arguments )
    {
      return NIL;
    }
    if( NIL != cycl_variables.el_varP( v_arguments ) )
    {
      return ConsesLow.list( cycl_dotted_el_var_to_kif( v_arguments ) );
    }
    if( v_arguments.isAtom() )
    {
      cycl_to_kif_error( $str94$Expecting_a_variable___S, v_arguments, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return NIL;
    }
    final SubLObject first = cycl_2_term_to_kif( v_arguments.first() );
    final SubLObject rest = cycl_atomic_sentence_args_to_kif_recursive( v_arguments.rest() );
    return reader.bq_cons( first, ConsesLow.append( rest, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16957L)
  public static SubLObject cycl_2_term_to_kif(final SubLObject v_term)
  {
    return cycl_1_term_to_kif( v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17089L)
  public static SubLObject cycl_1_term_to_kif(final SubLObject v_term)
  {
    if( v_term.isString() || v_term.isNumber() || v_term.isChar() )
    {
      return v_term;
    }
    if( v_term.isSymbol() && ( v_term.isKeyword() || ( NIL == cycl_variables.el_varP( v_term ) && NIL == find_kif_term( v_term ) ) ) )
    {
      return v_term;
    }
    return cycl_rep_1_term_to_kif( v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17463L)
  public static SubLObject cycl_rep_1_term_to_kif(final SubLObject v_term)
  {
    if( NIL != constant_handles.constant_p( v_term ) )
    {
      return cycl_constant_to_kif( v_term );
    }
    if( NIL != nart_handles.nart_p( v_term ) )
    {
      return cycl_rep_1_term_to_kif( narts_high.nart_el_formula( v_term ) );
    }
    if( NIL != cycl_variables.el_varP( v_term ) )
    {
      return cycl_el_variable_to_kif( v_term );
    }
    if( v_term.isCons() )
    {
      final SubLObject function = v_term.first();
      final SubLObject method = cycl_to_kif_method( function );
      if( NIL != method )
      {
        return Functions.funcall( method, v_term );
      }
      return cycl_function_exp_to_kif( v_term );
    }
    else
    {
      if( v_term.isSymbol() && !v_term.isKeyword() && NIL != find_kif_term( v_term ) )
      {
        return find_kif_term( v_term );
      }
      cycl_to_kif_error( $str95$Invalid_represented_first_order_t, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return NIL;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18179L)
  public static SubLObject cycl_function_exp_to_kif(final SubLObject function_expression)
  {
    SubLObject function = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( function_expression, function_expression, $list96 );
    function = function_expression.first();
    final SubLObject v_arguments;
    final SubLObject current = v_arguments = function_expression.rest();
    return ConsesLow.cons( cycl_rep_1_term_to_kif( function ), cycl_function_exp_args_to_kif( v_arguments ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18465L)
  public static SubLObject cycl_function_exp_args_to_kif(final SubLObject v_arguments)
  {
    if( NIL != list_utilities.proper_list_p( v_arguments ) )
    {
      return Mapping.mapcar( Symbols.symbol_function( $sym93$CYCL_2_TERM_TO_KIF ), v_arguments );
    }
    return cycl_function_exp_args_to_kif_recursive( v_arguments );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18743L)
  public static SubLObject cycl_function_exp_args_to_kif_recursive(final SubLObject v_arguments)
  {
    if( NIL == v_arguments )
    {
      return NIL;
    }
    if( NIL != cycl_variables.el_varP( v_arguments ) )
    {
      return ConsesLow.list( cycl_dotted_el_var_to_kif( v_arguments ) );
    }
    if( v_arguments.isAtom() )
    {
      cycl_to_kif_error( $str94$Expecting_a_variable___S, v_arguments, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return NIL;
    }
    final SubLObject first = cycl_2_term_to_kif( v_arguments.first() );
    final SubLObject rest = cycl_function_exp_args_to_kif_recursive( v_arguments.rest() );
    return reader.bq_cons( first, ConsesLow.append( rest, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19301L)
  public static SubLObject cycl_constant_to_kif(final SubLObject constant)
  {
    return intern_kif_term( constant, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19426L)
  public static SubLObject cycl_el_variable_to_kif(final SubLObject el_variable)
  {
    return el_variable;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19545L)
  public static SubLObject cycl_dotted_el_var_to_kif(final SubLObject el_variable)
  {
    final SubLObject name = string_utilities.copy_string( Symbols.symbol_name( el_variable ) );
    Strings.set_char( name, ZERO_INTEGER, Characters.CHAR_at );
    return Values.values( Packages.intern( name, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20256L)
  public static SubLObject cycl_to_kif_not_method(final SubLObject formula)
  {
    SubLObject not = NIL;
    SubLObject subformula = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( formula, formula, $list103 );
    not = formula.first();
    SubLObject current = formula.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, formula, $list103 );
    subformula = current.first();
    current = current.rest();
    if( NIL == current )
    {
      not = cycl_constant_to_kif( $const101$not );
      subformula = cycl_formula_to_kif( subformula );
      return ConsesLow.list( not, subformula );
    }
    cdestructuring_bind.cdestructuring_bind_error( formula, $list103 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20547L)
  public static SubLObject cycl_to_kif_and_method(final SubLObject formula)
  {
    SubLObject and = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( formula, formula, $list107 );
    and = formula.first();
    SubLObject subformulas;
    final SubLObject current = subformulas = formula.rest();
    and = cycl_constant_to_kif( $const105$and );
    subformulas = Mapping.mapcar( Symbols.symbol_function( $sym108$CYCL_FORMULA_TO_KIF ), subformulas );
    return reader.bq_cons( and, ConsesLow.append( subformulas, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20856L)
  public static SubLObject cycl_to_kif_or_method(final SubLObject formula)
  {
    SubLObject or = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( formula, formula, $list112 );
    or = formula.first();
    SubLObject subformulas;
    final SubLObject current = subformulas = formula.rest();
    or = cycl_constant_to_kif( $const110$or );
    subformulas = Mapping.mapcar( Symbols.symbol_function( $sym108$CYCL_FORMULA_TO_KIF ), subformulas );
    return reader.bq_cons( or, ConsesLow.append( subformulas, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21164L)
  public static SubLObject cycl_to_kif_implies_method(final SubLObject formula)
  {
    SubLObject implies = NIL;
    SubLObject antecedent = NIL;
    SubLObject consequent = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( formula, formula, $list116 );
    implies = formula.first();
    SubLObject current = formula.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, formula, $list116 );
    antecedent = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, formula, $list116 );
    consequent = current.first();
    current = current.rest();
    if( NIL == current )
    {
      implies = cycl_constant_to_kif( $const114$implies );
      antecedent = cycl_formula_to_kif( antecedent );
      consequent = cycl_formula_to_kif( consequent );
      return ConsesLow.list( implies, antecedent, consequent );
    }
    cdestructuring_bind.cdestructuring_bind_error( formula, $list116 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21552L)
  public static SubLObject cycl_to_kif_equiv_method(final SubLObject formula)
  {
    SubLObject equiv = NIL;
    SubLObject antecedent = NIL;
    SubLObject consequent = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( formula, formula, $list120 );
    equiv = formula.first();
    SubLObject current = formula.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, formula, $list120 );
    antecedent = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, formula, $list120 );
    consequent = current.first();
    current = current.rest();
    if( NIL == current )
    {
      equiv = cycl_constant_to_kif( $const118$equiv );
      antecedent = cycl_formula_to_kif( antecedent );
      consequent = cycl_formula_to_kif( consequent );
      return ConsesLow.list( equiv, antecedent, consequent );
    }
    cdestructuring_bind.cdestructuring_bind_error( formula, $list120 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21881L)
  public static SubLObject cycl_to_kif_xor_method(final SubLObject formula)
  {
    SubLObject xor = NIL;
    SubLObject subformula1 = NIL;
    SubLObject subformula2 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( formula, formula, $list122 );
    xor = formula.first();
    SubLObject current = formula.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, formula, $list122 );
    subformula1 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, formula, $list122 );
    subformula2 = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return cycl_formula_to_kif( ConsesLow.list( $const118$equiv, subformula1, ConsesLow.list( $const101$not, subformula2 ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( formula, $list122 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22115L)
  public static SubLObject cycl_to_kif_truesentence_method(final SubLObject formula)
  {
    SubLObject truesentence = NIL;
    SubLObject subformula = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( formula, formula, $list125 );
    truesentence = formula.first();
    SubLObject current = formula.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, formula, $list125 );
    subformula = current.first();
    current = current.rest();
    if( NIL == current )
    {
      truesentence = cycl_constant_to_kif( $const92$trueSentence );
      subformula = cycl_formula_to_kif( subformula );
      return ConsesLow.list( truesentence, subformula );
    }
    cdestructuring_bind.cdestructuring_bind_error( formula, $list125 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22514L)
  public static SubLObject cycl_to_kif_forall_method(final SubLObject formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject forall = NIL;
    SubLObject variable = NIL;
    SubLObject subformula = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( formula, formula, $list129 );
    forall = formula.first();
    SubLObject current = formula.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, formula, $list129 );
    variable = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, formula, $list129 );
    subformula = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( NIL == Types.$suspend_type_checkingP$.getDynamicValue( thread ) && NIL == cycl_variables.el_varP( variable ) )
      {
        cycl_to_kif_error( $str60$_A_is_not_a__A, variable, $sym91$EL_VAR_, UNPROVIDED, UNPROVIDED );
      }
      forall = cycl_constant_to_kif( $const127$forAll );
      variable = cycl_el_variable_to_kif( variable );
      subformula = cycl_formula_to_kif( subformula );
      return ConsesLow.list( forall, ConsesLow.list( variable ), subformula );
    }
    cdestructuring_bind.cdestructuring_bind_error( formula, $list129 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22948L)
  public static SubLObject cycl_to_kif_thereexists_method(final SubLObject formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject thereexists = NIL;
    SubLObject variable = NIL;
    SubLObject subformula = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( formula, formula, $list133 );
    thereexists = formula.first();
    SubLObject current = formula.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, formula, $list133 );
    variable = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, formula, $list133 );
    subformula = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( NIL == Types.$suspend_type_checkingP$.getDynamicValue( thread ) && NIL == cycl_variables.el_varP( variable ) )
      {
        cycl_to_kif_error( $str60$_A_is_not_a__A, variable, $sym91$EL_VAR_, UNPROVIDED, UNPROVIDED );
      }
      thereexists = cycl_constant_to_kif( $const131$thereExists );
      variable = cycl_el_variable_to_kif( variable );
      subformula = cycl_formula_to_kif( subformula );
      return ConsesLow.list( thereexists, ConsesLow.list( variable ), subformula );
    }
    cdestructuring_bind.cdestructuring_bind_error( formula, $list133 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23356L)
  public static SubLObject cycl_to_kif_thereexistexactly_method(final SubLObject formula)
  {
    return cycl_there_exists_variant_to_kif( formula );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23510L)
  public static SubLObject cycl_to_kif_thereexistatleast_method(final SubLObject formula)
  {
    return cycl_there_exists_variant_to_kif( formula );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23663L)
  public static SubLObject cycl_to_kif_thereexistatmost_method(final SubLObject formula)
  {
    return cycl_there_exists_variant_to_kif( formula );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23814L)
  public static SubLObject cycl_there_exists_variant_to_kif(final SubLObject formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject there_exists_variant = NIL;
    SubLObject num = NIL;
    SubLObject variable = NIL;
    SubLObject subformula = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( formula, formula, $list141 );
    there_exists_variant = formula.first();
    SubLObject current = formula.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, formula, $list141 );
    num = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, formula, $list141 );
    variable = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, formula, $list141 );
    subformula = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( NIL == Types.$suspend_type_checkingP$.getDynamicValue( thread ) && NIL == cycl_variables.el_varP( variable ) )
      {
        cycl_to_kif_error( $str60$_A_is_not_a__A, variable, $sym91$EL_VAR_, UNPROVIDED, UNPROVIDED );
      }
      there_exists_variant = cycl_constant_to_kif( there_exists_variant );
      num = cycl_2_term_to_kif( num );
      variable = cycl_el_variable_to_kif( variable );
      subformula = cycl_formula_to_kif( subformula );
      final SubLObject true_sentence = cycl_constant_to_kif( $const92$trueSentence );
      return ConsesLow.list( true_sentence, ConsesLow.list( there_exists_variant, num, variable, subformula ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( formula, $list141 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24466L)
  public static SubLObject cycl_to_kif_ist_method(final SubLObject formula)
  {
    SubLObject ist = NIL;
    SubLObject mt = NIL;
    SubLObject subformula = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( formula, formula, $list144 );
    ist = formula.first();
    SubLObject current = formula.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, formula, $list144 );
    mt = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, formula, $list144 );
    subformula = current.first();
    current = current.rest();
    if( NIL == current )
    {
      ist = cycl_constant_to_kif( $const145$ist );
      mt = cycl_2_term_to_kif( mt );
      subformula = cycl_formula_to_kif( subformula );
      return ConsesLow.list( ist, mt, subformula );
    }
    cdestructuring_bind.cdestructuring_bind_error( formula, $list144 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25069L)
  public static SubLObject cycl_to_kif_goals_method(final SubLObject formula)
  {
    SubLObject goals = NIL;
    SubLObject agent = NIL;
    SubLObject subformula = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( formula, formula, $list147 );
    goals = formula.first();
    SubLObject current = formula.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, formula, $list147 );
    agent = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, formula, $list147 );
    subformula = current.first();
    current = current.rest();
    if( NIL == current )
    {
      goals = cycl_constant_to_kif( $const148$goals );
      agent = cycl_2_term_to_kif( agent );
      subformula = cycl_formula_to_kif( subformula );
      return ConsesLow.list( goals, agent, subformula );
    }
    cdestructuring_bind.cdestructuring_bind_error( formula, $list147 );
    return NIL;
  }

  public static SubLObject declare_kif_file()
  {
    SubLFiles.declareMacro( me, "until_cycl_to_kif_aborted", "UNTIL-CYCL-TO-KIF-ABORTED" );
    SubLFiles.declareFunction( me, "abort_cycl_to_kif", "ABORT-CYCL-TO-KIF", 0, 0, false );
    SubLFiles.declareMacro( me, "writing_kif_file", "WRITING-KIF-FILE" );
    SubLFiles.declareFunction( me, "write_kb_to_kif_file", "WRITE-KB-TO-KIF-FILE", 1, 1, false );
    SubLFiles.declareFunction( me, "write_mt_to_kif_file", "WRITE-MT-TO-KIF-FILE", 2, 1, false );
    SubLFiles.declareFunction( me, "assertion_kif_formula_to_stream", "ASSERTION-KIF-FORMULA-TO-STREAM", 1, 1, false );
    SubLFiles.declareFunction( me, "assertion_kif_formula", "ASSERTION-KIF-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "meld_to_kif", "MELD-TO-KIF", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_to_kif", "CYCL-TO-KIF", 1, 0, false );
    SubLFiles.declareFunction( me, "write_kb_to_kif_file_preamble", "WRITE-KB-TO-KIF-FILE-PREAMBLE", 1, 0, false );
    SubLFiles.declareFunction( me, "write_mt_to_kif_file_preamble", "WRITE-MT-TO-KIF-FILE-PREAMBLE", 2, 0, false );
    SubLFiles.declareFunction( me, "write_kif_term_mixed_case", "WRITE-KIF-TERM-MIXED-CASE", 2, 0, false );
    SubLFiles.declareFunction( me, "write_kif_term_upcase", "WRITE-KIF-TERM-UPCASE", 2, 0, false );
    SubLFiles.declareFunction( me, "write_kif_term_downcase", "WRITE-KIF-TERM-DOWNCASE", 2, 0, false );
    SubLFiles.declareFunction( me, "write_kif_term_hyphen_mixed_case", "WRITE-KIF-TERM-HYPHEN-MIXED-CASE", 2, 0, false );
    SubLFiles.declareFunction( me, "write_kif_term_hyphen_upcase", "WRITE-KIF-TERM-HYPHEN-UPCASE", 2, 0, false );
    SubLFiles.declareFunction( me, "write_kif_term_hyphen_downcase", "WRITE-KIF-TERM-HYPHEN-DOWNCASE", 2, 0, false );
    SubLFiles.declareFunction( me, "write_kif_term_hyphenate", "WRITE-KIF-TERM-HYPHENATE", 3, 0, false );
    SubLFiles.declareFunction( me, "write_kif_term_insert_hyphen", "WRITE-KIF-TERM-INSERT-HYPHEN", 2, 0, false );
    SubLFiles.declareFunction( me, "cycl_to_kif_error", "CYCL-TO-KIF-ERROR", 1, 4, false );
    SubLFiles.declareMacro( me, "cycl_to_kif_check", "CYCL-TO-KIF-CHECK" );
    SubLFiles.declareFunction( me, "register_kif_definition", "REGISTER-KIF-DEFINITION", 1, 0, false );
    SubLFiles.declareFunction( me, "additional_kif_definitions", "ADDITIONAL-KIF-DEFINITIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "kif_term_print_function_trampoline", "KIF-TERM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "kif_term_p", "KIF-TERM-P", 1, 0, false );
    new $kif_term_p$UnaryFunction();
    SubLFiles.declareFunction( me, "kif_print_string", "KIF-PRINT-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_kif_print_string", "_CSETF-KIF-PRINT-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "make_kif_term", "MAKE-KIF-TERM", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_kif_term", "VISIT-DEFSTRUCT-KIF-TERM", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_kif_term_method", "VISIT-DEFSTRUCT-OBJECT-KIF-TERM-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "sxhash_kif_term_method", "SXHASH-KIF-TERM-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "print_kif_term", "PRINT-KIF-TERM", 3, 0, false );
    SubLFiles.declareFunction( me, "cycl_to_kif_standard_mapping", "CYCL-TO-KIF-STANDARD-MAPPING", 2, 0, false );
    SubLFiles.declareFunction( me, "find_kif_term", "FIND-KIF-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "intern_kif_term", "INTERN-KIF-TERM", 1, 1, false );
    SubLFiles.declareFunction( me, "note_kif_term", "NOTE-KIF-TERM", 2, 0, false );
    SubLFiles.declareFunction( me, "new_kif_term", "NEW-KIF-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "string_for_kif_term", "STRING-FOR-KIF-TERM", 1, 1, false );
    SubLFiles.declareFunction( me, "cycl_to_kif_method", "CYCL-TO-KIF-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "register_cycl_to_kif_method", "REGISTER-CYCL-TO-KIF-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "deregister_cycl_to_kif_method", "DEREGISTER-CYCL-TO-KIF-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_to_kif_functor_p", "CYCL-TO-KIF-FUNCTOR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "predefined_kif_symbol", "PREDEFINED-KIF-SYMBOL", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_to_kif_functor_string", "CYCL-TO-KIF-FUNCTOR-STRING", 1, 0, false );
    SubLFiles.declareMacro( me, "define_cycl_to_kif_method", "DEFINE-CYCL-TO-KIF-METHOD" );
    SubLFiles.declareFunction( me, "cycl_formula_to_kif", "CYCL-FORMULA-TO-KIF", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_atomic_sentence_to_kif", "CYCL-ATOMIC-SENTENCE-TO-KIF", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_atomic_sentence_args_to_kif", "CYCL-ATOMIC-SENTENCE-ARGS-TO-KIF", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_atomic_sentence_args_to_kif_recursive", "CYCL-ATOMIC-SENTENCE-ARGS-TO-KIF-RECURSIVE", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_2_term_to_kif", "CYCL-2-TERM-TO-KIF", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_1_term_to_kif", "CYCL-1-TERM-TO-KIF", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_rep_1_term_to_kif", "CYCL-REP-1-TERM-TO-KIF", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_function_exp_to_kif", "CYCL-FUNCTION-EXP-TO-KIF", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_function_exp_args_to_kif", "CYCL-FUNCTION-EXP-ARGS-TO-KIF", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_function_exp_args_to_kif_recursive", "CYCL-FUNCTION-EXP-ARGS-TO-KIF-RECURSIVE", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_constant_to_kif", "CYCL-CONSTANT-TO-KIF", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_el_variable_to_kif", "CYCL-EL-VARIABLE-TO-KIF", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_dotted_el_var_to_kif", "CYCL-DOTTED-EL-VAR-TO-KIF", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_to_kif_not_method", "CYCL-TO-KIF-NOT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_to_kif_and_method", "CYCL-TO-KIF-AND-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_to_kif_or_method", "CYCL-TO-KIF-OR-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_to_kif_implies_method", "CYCL-TO-KIF-IMPLIES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_to_kif_equiv_method", "CYCL-TO-KIF-EQUIV-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_to_kif_xor_method", "CYCL-TO-KIF-XOR-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_to_kif_truesentence_method", "CYCL-TO-KIF-TRUESENTENCE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_to_kif_forall_method", "CYCL-TO-KIF-FORALL-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_to_kif_thereexists_method", "CYCL-TO-KIF-THEREEXISTS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_to_kif_thereexistexactly_method", "CYCL-TO-KIF-THEREEXISTEXACTLY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_to_kif_thereexistatleast_method", "CYCL-TO-KIF-THEREEXISTATLEAST-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_to_kif_thereexistatmost_method", "CYCL-TO-KIF-THEREEXISTATMOST-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_there_exists_variant_to_kif", "CYCL-THERE-EXISTS-VARIANT-TO-KIF", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_to_kif_ist_method", "CYCL-TO-KIF-IST-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_to_kif_goals_method", "CYCL-TO-KIF-GOALS-METHOD", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_kif_file()
  {
    $within_cycl_to_kif$ = SubLFiles.defparameter( "*WITHIN-CYCL-TO-KIF*", NIL );
    $additional_kif_definitions$ = SubLFiles.defparameter( "*ADDITIONAL-KIF-DEFINITIONS*", NIL );
    $cycl_to_kif_error_method$ = SubLFiles.defparameter( "*CYCL-TO-KIF-ERROR-METHOD*", $kw4$ABORT );
    $default_kif_term_print_method$ = SubLFiles.defparameter( "*DEFAULT-KIF-TERM-PRINT-METHOD*", $sym5$WRITE_KIF_TERM_MIXED_CASE );
    $kif_term_print_method$ = SubLFiles.defparameter( "*KIF-TERM-PRINT-METHOD*", $default_kif_term_print_method$.getDynamicValue() );
    $kb_to_kif_file_preamble$ = SubLFiles.defparameter( "*KB-TO-KIF-FILE-PREAMBLE*", $str44$_____KIF_assertion_specs_for_enti );
    $mt_to_kif_file_preamble$ = SubLFiles.defparameter( "*MT-TO-KIF-FILE-PREAMBLE*", $str45$_____KIF_assertion_specs_for_micr );
    $dtp_kif_term$ = SubLFiles.defconstant( "*DTP-KIF-TERM*", $sym62$KIF_TERM );
    $kif_term_table$ = SubLFiles.deflexical( "*KIF-TERM-TABLE*", ( maybeDefault( $sym81$_KIF_TERM_TABLE_, $kif_term_table$, NIL ) ) );
    $cycl_to_kif_method_table$ = SubLFiles.defparameter( "*CYCL-TO-KIF-METHOD-TABLE*", NIL );
    return NIL;
  }

  public static SubLObject setup_kif_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_kif_term$.getGlobalValue(), Symbols.symbol_function( $sym69$KIF_TERM_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list70 );
    Structures.def_csetf( $sym71$KIF_PRINT_STRING, $sym72$_CSETF_KIF_PRINT_STRING );
    Equality.identity( $sym62$KIF_TERM );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_kif_term$.getGlobalValue(), Symbols.symbol_function( $sym79$VISIT_DEFSTRUCT_OBJECT_KIF_TERM_METHOD ) );
    Structures.register_method( Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_kif_term$.getGlobalValue(), Symbols.symbol_function( $sym80$SXHASH_KIF_TERM_METHOD ) );
    subl_macro_promotions.declare_defglobal( $sym81$_KIF_TERM_TABLE_ );
    cycl_to_kif_standard_mapping( $const97$True, $str98$true );
    cycl_to_kif_standard_mapping( $const99$False, $str100$false );
    cycl_to_kif_standard_mapping( $const101$not, $str102$not );
    register_cycl_to_kif_method( $const101$not, $sym104$CYCL_TO_KIF_NOT_METHOD );
    cycl_to_kif_standard_mapping( $const105$and, $str106$and );
    register_cycl_to_kif_method( $const105$and, $sym109$CYCL_TO_KIF_AND_METHOD );
    cycl_to_kif_standard_mapping( $const110$or, $str111$or );
    register_cycl_to_kif_method( $const110$or, $sym113$CYCL_TO_KIF_OR_METHOD );
    cycl_to_kif_standard_mapping( $const114$implies, $str115$__ );
    register_cycl_to_kif_method( $const114$implies, $sym117$CYCL_TO_KIF_IMPLIES_METHOD );
    cycl_to_kif_standard_mapping( $const118$equiv, $str119$___ );
    register_cycl_to_kif_method( $const118$equiv, $sym121$CYCL_TO_KIF_EQUIV_METHOD );
    register_cycl_to_kif_method( $const123$xor, $sym124$CYCL_TO_KIF_XOR_METHOD );
    register_cycl_to_kif_method( $const92$trueSentence, $sym126$CYCL_TO_KIF_TRUESENTENCE_METHOD );
    cycl_to_kif_standard_mapping( $const127$forAll, $str128$forall );
    register_cycl_to_kif_method( $const127$forAll, $sym130$CYCL_TO_KIF_FORALL_METHOD );
    cycl_to_kif_standard_mapping( $const131$thereExists, $str132$exists );
    register_cycl_to_kif_method( $const131$thereExists, $sym134$CYCL_TO_KIF_THEREEXISTS_METHOD );
    register_cycl_to_kif_method( $const135$thereExistExactly, $sym136$CYCL_TO_KIF_THEREEXISTEXACTLY_METHOD );
    register_cycl_to_kif_method( $const137$thereExistAtLeast, $sym138$CYCL_TO_KIF_THEREEXISTATLEAST_METHOD );
    register_cycl_to_kif_method( $const139$thereExistAtMost, $sym140$CYCL_TO_KIF_THEREEXISTATMOST_METHOD );
    cycl_to_kif_standard_mapping( $const142$equals, $str143$_ );
    register_cycl_to_kif_method( $const145$ist, $sym146$CYCL_TO_KIF_IST_METHOD );
    register_cycl_to_kif_method( $const148$goals, $sym149$CYCL_TO_KIF_GOALS_METHOD );
    cycl_to_kif_standard_mapping( $const150$TheList, $str151$listof );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_kif_file();
  }

  @Override
  public void initializeVariables()
  {
    init_kif_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_kif_file();
  }
  static
  {
    me = new kif();
    $within_cycl_to_kif$ = null;
    $additional_kif_definitions$ = null;
    $cycl_to_kif_error_method$ = null;
    $default_kif_term_print_method$ = null;
    $kif_term_print_method$ = null;
    $kb_to_kif_file_preamble$ = null;
    $mt_to_kif_file_preamble$ = null;
    $dtp_kif_term$ = null;
    $kif_term_table$ = null;
    $cycl_to_kif_method_table$ = null;
    $sym0$CCATCH_IGNORE = makeSymbol( "CCATCH-IGNORE" );
    $kw1$ABORT_CYCL_TO_KIF = makeKeyword( "ABORT-CYCL-TO-KIF" );
    $sym2$CLET = makeSymbol( "CLET" );
    $list3 = ConsesLow.list( ConsesLow.list( makeSymbol( "*ADDITIONAL-KIF-DEFINITIONS*" ), NIL ), ConsesLow.list( makeSymbol( "*WITHIN-CYCL-TO-KIF*" ), T ) );
    $kw4$ABORT = makeKeyword( "ABORT" );
    $sym5$WRITE_KIF_TERM_MIXED_CASE = makeSymbol( "WRITE-KIF-TERM-MIXED-CASE" );
    $list6 = ConsesLow.list( ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "FILENAME" ), makeSymbol( "KIF-TERM-PRINT-METHOD" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym7$PRINT_METHOD = makeUninternedSymbol( "PRINT-METHOD" );
    $sym8$WITH_TEXT_FILE = makeSymbol( "WITH-TEXT-FILE" );
    $list9 = ConsesLow.list( makeKeyword( "OUTPUT" ) );
    $sym10$WRITE_KB_CONTENT_COPYRIGHT_NOTICE = makeSymbol( "WRITE-KB-CONTENT-COPYRIGHT-NOTICE" );
    $sym11$_KIF_TERM_PRINT_METHOD_ = makeSymbol( "*KIF-TERM-PRINT-METHOD*" );
    $sym12$FIF = makeSymbol( "FIF" );
    $list13 = ConsesLow.list( makeSymbol( "*KIF-TERM-PRINT-METHOD*" ) );
    $list14 = ConsesLow.list( ConsesLow.list( makeSymbol( "*CYCL-TO-KIF-ERROR-METHOD*" ), makeKeyword( "ABORT" ) ) );
    $sym15$STRINGP = makeSymbol( "STRINGP" );
    $kw16$OUTPUT = makeKeyword( "OUTPUT" );
    $str17$Unable_to_open__S = makeString( "Unable to open ~S" );
    $str18$Converting_KB_to_KIF = makeString( "Converting KB to KIF" );
    $kw19$SKIP = makeKeyword( "SKIP" );
    $kw20$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym21$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $sym22$HLMT_P = makeSymbol( "HLMT-P" );
    $kw23$MT = makeKeyword( "MT" );
    $kw24$BROAD_MT = makeKeyword( "BROAD-MT" );
    $str25$do_broad_mt_index = makeString( "do-broad-mt-index" );
    $sym26$ASSERTION_P = makeSymbol( "ASSERTION-P" );
    $list27 = ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "DIRECTION" ), makeSymbol( "MONOTONICITY" ), makeSymbol( "MICROTHEORY" ), makeSymbol( "CREATOR" ), makeSymbol( "CREATION-DATE" ), makeSymbol( "KIF" ) );
    $list28 = ConsesLow.list( makeKeyword( "DIRECTION" ), makeKeyword( "MONOTONICITY" ), makeKeyword( "MICROTHEORY" ), makeKeyword( "CREATOR" ), makeKeyword( "CREATION-DATE" ), makeKeyword( "KIF" ) );
    $kw29$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw30$DIRECTION = makeKeyword( "DIRECTION" );
    $kw31$MONOTONICITY = makeKeyword( "MONOTONICITY" );
    $kw32$MICROTHEORY = makeKeyword( "MICROTHEORY" );
    $kw33$CREATOR = makeKeyword( "CREATOR" );
    $kw34$CREATION_DATE = makeKeyword( "CREATION-DATE" );
    $kw35$KIF = makeKeyword( "KIF" );
    $str36$_____ = makeString( "~%~%(" );
    $str37$_DIRECTION__S = makeString( ":DIRECTION ~S" );
    $str38$__MONOTONICITY__S = makeString( " :MONOTONICITY ~S" );
    $str39$__CREATOR__S = makeString( " :CREATOR ~S" );
    $str40$__CREATION_DATE__S = makeString( " :CREATION-DATE ~S" );
    $str41$____MICROTHEORY__S = makeString( "~% :MICROTHEORY ~S" );
    $str42$____KIF = makeString( "~% :KIF" );
    $str43$___ = makeString( "~%)" );
    $str44$_____KIF_assertion_specs_for_enti = makeString( "\n\n;; KIF assertion-specs for entire KB\n;; ~A" );
    $str45$_____KIF_assertion_specs_for_micr = makeString( "\n\n;; KIF assertion-specs for microtheory : ~S\n;; ~A" );
    $sym46$CHAR_UPCASE = makeSymbol( "CHAR-UPCASE" );
    $sym47$CHAR_DOWNCASE = makeSymbol( "CHAR-DOWNCASE" );
    $kw48$IGNORE = makeKeyword( "IGNORE" );
    $kw49$WARN = makeKeyword( "WARN" );
    $sym50$WARN = makeSymbol( "WARN" );
    $kw51$CERROR = makeKeyword( "CERROR" );
    $sym52$CERROR = makeSymbol( "CERROR" );
    $str53$Use_NIL = makeString( "Use NIL" );
    $kw54$ERROR = makeKeyword( "ERROR" );
    $sym55$ERROR = makeSymbol( "ERROR" );
    $list56 = ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "PRED" ) );
    $sym57$PUNLESS = makeSymbol( "PUNLESS" );
    $sym58$_SUSPEND_TYPE_CHECKING__ = makeSymbol( "*SUSPEND-TYPE-CHECKING?*" );
    $sym59$CYCL_TO_KIF_ERROR = makeSymbol( "CYCL-TO-KIF-ERROR" );
    $str60$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym61$QUOTE = makeSymbol( "QUOTE" );
    $sym62$KIF_TERM = makeSymbol( "KIF-TERM" );
    $sym63$KIF_TERM_P = makeSymbol( "KIF-TERM-P" );
    $list64 = ConsesLow.list( makeSymbol( "PRINT-STRING" ) );
    $list65 = ConsesLow.list( makeKeyword( "PRINT-STRING" ) );
    $list66 = ConsesLow.list( makeSymbol( "KIF-PRINT-STRING" ) );
    $list67 = ConsesLow.list( makeSymbol( "_CSETF-KIF-PRINT-STRING" ) );
    $sym68$PRINT_KIF_TERM = makeSymbol( "PRINT-KIF-TERM" );
    $sym69$KIF_TERM_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "KIF-TERM-PRINT-FUNCTION-TRAMPOLINE" );
    $list70 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "KIF-TERM-P" ) );
    $sym71$KIF_PRINT_STRING = makeSymbol( "KIF-PRINT-STRING" );
    $sym72$_CSETF_KIF_PRINT_STRING = makeSymbol( "_CSETF-KIF-PRINT-STRING" );
    $kw73$PRINT_STRING = makeKeyword( "PRINT-STRING" );
    $str74$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw75$BEGIN = makeKeyword( "BEGIN" );
    $sym76$MAKE_KIF_TERM = makeSymbol( "MAKE-KIF-TERM" );
    $kw77$SLOT = makeKeyword( "SLOT" );
    $kw78$END = makeKeyword( "END" );
    $sym79$VISIT_DEFSTRUCT_OBJECT_KIF_TERM_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-KIF-TERM-METHOD" );
    $sym80$SXHASH_KIF_TERM_METHOD = makeSymbol( "SXHASH-KIF-TERM-METHOD" );
    $sym81$_KIF_TERM_TABLE_ = makeSymbol( "*KIF-TERM-TABLE*" );
    $sym82$CYCL_TO_KIF_FUNCTOR_P = makeSymbol( "CYCL-TO-KIF-FUNCTOR-P" );
    $sym83$SYMBOLP = makeSymbol( "SYMBOLP" );
    $int84$50 = makeInteger( 50 );
    $list85 = ConsesLow.list( makeSymbol( "CYCL-TERM" ), makeSymbol( "ARGLIST" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $str86$CYCL_TO_KIF__A_METHOD = makeString( "CYCL-TO-KIF-~A-METHOD" );
    $sym87$PROGN = makeSymbol( "PROGN" );
    $sym88$DEFINE_PRIVATE = makeSymbol( "DEFINE-PRIVATE" );
    $sym89$REGISTER_CYCL_TO_KIF_METHOD = makeSymbol( "REGISTER-CYCL-TO-KIF-METHOD" );
    $list90 = ConsesLow.list( makeSymbol( "PREDICATE" ), makeSymbol( "&REST" ), makeSymbol( "ARGUMENTS" ) );
    $sym91$EL_VAR_ = makeSymbol( "EL-VAR?" );
    $const92$trueSentence = constant_handles.reader_make_constant_shell( makeString( "trueSentence" ) );
    $sym93$CYCL_2_TERM_TO_KIF = makeSymbol( "CYCL-2-TERM-TO-KIF" );
    $str94$Expecting_a_variable___S = makeString( "Expecting a variable: ~S" );
    $str95$Invalid_represented_first_order_t = makeString( "Invalid represented first order term : ~S" );
    $list96 = ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "&REST" ), makeSymbol( "ARGUMENTS" ) );
    $const97$True = constant_handles.reader_make_constant_shell( makeString( "True" ) );
    $str98$true = makeString( "true" );
    $const99$False = constant_handles.reader_make_constant_shell( makeString( "False" ) );
    $str100$false = makeString( "false" );
    $const101$not = constant_handles.reader_make_constant_shell( makeString( "not" ) );
    $str102$not = makeString( "not" );
    $list103 = ConsesLow.list( makeSymbol( "NOT" ), makeSymbol( "SUBFORMULA" ) );
    $sym104$CYCL_TO_KIF_NOT_METHOD = makeSymbol( "CYCL-TO-KIF-NOT-METHOD" );
    $const105$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $str106$and = makeString( "and" );
    $list107 = ConsesLow.list( makeSymbol( "AND" ), makeSymbol( "&REST" ), makeSymbol( "SUBFORMULAS" ) );
    $sym108$CYCL_FORMULA_TO_KIF = makeSymbol( "CYCL-FORMULA-TO-KIF" );
    $sym109$CYCL_TO_KIF_AND_METHOD = makeSymbol( "CYCL-TO-KIF-AND-METHOD" );
    $const110$or = constant_handles.reader_make_constant_shell( makeString( "or" ) );
    $str111$or = makeString( "or" );
    $list112 = ConsesLow.list( makeSymbol( "OR" ), makeSymbol( "&REST" ), makeSymbol( "SUBFORMULAS" ) );
    $sym113$CYCL_TO_KIF_OR_METHOD = makeSymbol( "CYCL-TO-KIF-OR-METHOD" );
    $const114$implies = constant_handles.reader_make_constant_shell( makeString( "implies" ) );
    $str115$__ = makeString( "=>" );
    $list116 = ConsesLow.list( makeSymbol( "IMPLIES" ), makeSymbol( "ANTECEDENT" ), makeSymbol( "CONSEQUENT" ) );
    $sym117$CYCL_TO_KIF_IMPLIES_METHOD = makeSymbol( "CYCL-TO-KIF-IMPLIES-METHOD" );
    $const118$equiv = constant_handles.reader_make_constant_shell( makeString( "equiv" ) );
    $str119$___ = makeString( "<=>" );
    $list120 = ConsesLow.list( makeSymbol( "EQUIV" ), makeSymbol( "ANTECEDENT" ), makeSymbol( "CONSEQUENT" ) );
    $sym121$CYCL_TO_KIF_EQUIV_METHOD = makeSymbol( "CYCL-TO-KIF-EQUIV-METHOD" );
    $list122 = ConsesLow.list( makeSymbol( "XOR" ), makeSymbol( "SUBFORMULA1" ), makeSymbol( "SUBFORMULA2" ) );
    $const123$xor = constant_handles.reader_make_constant_shell( makeString( "xor" ) );
    $sym124$CYCL_TO_KIF_XOR_METHOD = makeSymbol( "CYCL-TO-KIF-XOR-METHOD" );
    $list125 = ConsesLow.list( makeSymbol( "TRUESENTENCE" ), makeSymbol( "SUBFORMULA" ) );
    $sym126$CYCL_TO_KIF_TRUESENTENCE_METHOD = makeSymbol( "CYCL-TO-KIF-TRUESENTENCE-METHOD" );
    $const127$forAll = constant_handles.reader_make_constant_shell( makeString( "forAll" ) );
    $str128$forall = makeString( "forall" );
    $list129 = ConsesLow.list( makeSymbol( "FORALL" ), makeSymbol( "VARIABLE" ), makeSymbol( "SUBFORMULA" ) );
    $sym130$CYCL_TO_KIF_FORALL_METHOD = makeSymbol( "CYCL-TO-KIF-FORALL-METHOD" );
    $const131$thereExists = constant_handles.reader_make_constant_shell( makeString( "thereExists" ) );
    $str132$exists = makeString( "exists" );
    $list133 = ConsesLow.list( makeSymbol( "THEREEXISTS" ), makeSymbol( "VARIABLE" ), makeSymbol( "SUBFORMULA" ) );
    $sym134$CYCL_TO_KIF_THEREEXISTS_METHOD = makeSymbol( "CYCL-TO-KIF-THEREEXISTS-METHOD" );
    $const135$thereExistExactly = constant_handles.reader_make_constant_shell( makeString( "thereExistExactly" ) );
    $sym136$CYCL_TO_KIF_THEREEXISTEXACTLY_METHOD = makeSymbol( "CYCL-TO-KIF-THEREEXISTEXACTLY-METHOD" );
    $const137$thereExistAtLeast = constant_handles.reader_make_constant_shell( makeString( "thereExistAtLeast" ) );
    $sym138$CYCL_TO_KIF_THEREEXISTATLEAST_METHOD = makeSymbol( "CYCL-TO-KIF-THEREEXISTATLEAST-METHOD" );
    $const139$thereExistAtMost = constant_handles.reader_make_constant_shell( makeString( "thereExistAtMost" ) );
    $sym140$CYCL_TO_KIF_THEREEXISTATMOST_METHOD = makeSymbol( "CYCL-TO-KIF-THEREEXISTATMOST-METHOD" );
    $list141 = ConsesLow.list( makeSymbol( "THERE-EXISTS-VARIANT" ), makeSymbol( "NUM" ), makeSymbol( "VARIABLE" ), makeSymbol( "SUBFORMULA" ) );
    $const142$equals = constant_handles.reader_make_constant_shell( makeString( "equals" ) );
    $str143$_ = makeString( "=" );
    $list144 = ConsesLow.list( makeSymbol( "IST" ), makeSymbol( "MT" ), makeSymbol( "SUBFORMULA" ) );
    $const145$ist = constant_handles.reader_make_constant_shell( makeString( "ist" ) );
    $sym146$CYCL_TO_KIF_IST_METHOD = makeSymbol( "CYCL-TO-KIF-IST-METHOD" );
    $list147 = ConsesLow.list( makeSymbol( "GOALS" ), makeSymbol( "AGENT" ), makeSymbol( "SUBFORMULA" ) );
    $const148$goals = constant_handles.reader_make_constant_shell( makeString( "goals" ) );
    $sym149$CYCL_TO_KIF_GOALS_METHOD = makeSymbol( "CYCL-TO-KIF-GOALS-METHOD" );
    $const150$TheList = constant_handles.reader_make_constant_shell( makeString( "TheList" ) );
    $str151$listof = makeString( "listof" );
  }

  public static final class $kif_term_native
      extends
        SubLStructNative
  {
    public SubLObject $print_string;
    private static final SubLStructDeclNative structDecl;

    public $kif_term_native()
    {
      this.$print_string = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $kif_term_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$print_string;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$print_string = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $kif_term_native.class, $sym62$KIF_TERM, $sym63$KIF_TERM_P, $list64, $list65, new String[] { "$print_string"
      }, $list66, $list67, $sym68$PRINT_KIF_TERM );
    }
  }

  public static final class $kif_term_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $kif_term_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "KIF-TERM-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return kif_term_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 636 ms
 * 
 */