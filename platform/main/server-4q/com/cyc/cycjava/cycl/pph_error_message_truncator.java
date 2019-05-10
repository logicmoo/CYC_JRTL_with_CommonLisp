package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pph_error_message_truncator
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.pph_error_message_truncator";
  public static final String myFingerPrint = "fb5333e695978600ee095978478b69e6eb131400c8e0017ed3545ed86d42c2c8";
  @SubLTranslatedFile.SubL(source = "cycl/pph-error-message-truncator.lisp", position = 1994L)
  private static SubLSymbol $pph_error_msg_truncator_id_index$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-error-message-truncator.lisp", position = 2077L)
  private static SubLSymbol $pph_error_msg_truncator_ids$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-error-message-truncator.lisp", position = 2196L)
  private static SubLSymbol $active_pph_error_msg_ids$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-error-message-truncator.lisp", position = 2247L)
  private static SubLSymbol $max_active_pph_error_msg_ids$;
  private static final SubLString $str0$___See_PPH_Error__;
  private static final SubLString $str1$__for_remaining_lines_of_error_me;
  private static final SubLString $str2$PPH_Error___D____;
  private static final SubLString $str3$_A__;
  private static final SubLInteger $int4$500;
  private static final SubLList $list5;

  @SubLTranslatedFile.SubL(source = "cycl/pph-error-message-truncator.lisp", position = 929L)
  public static SubLObject truncate_pph_error_message(final SubLObject error_message)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject matches = match_pph_error_msg( error_message );
    final SubLObject matched_line_count = thread.secondMultipleValue();
    final SubLObject lines = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    SubLObject new_message_lines = conses_high.copy_list( lines );
    SubLObject new_error_message = NIL;
    if( NIL != matches && NIL != list_utilities.lengthG( lines, matched_line_count, UNPROVIDED ) )
    {
      final SubLObject match = matches.first().rest().first();
      final SubLObject new_line = Sequences.cconcatenate( $str0$___See_PPH_Error__, new SubLObject[] { format_nil.format_nil_d_no_copy( match ), $str1$__for_remaining_lines_of_error_me
      } );
      new_message_lines = ConsesLow.cons( new_line, Sequences.subseq( new_message_lines, number_utilities.f_1_( matched_line_count ), UNPROVIDED ) );
    }
    final SubLObject id = get_new_pph_error_msg_id();
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      PrintLow.format( stream, $str2$PPH_Error___D____, id );
      SubLObject cdolist_list_var = Sequences.nreverse( new_message_lines );
      SubLObject line = NIL;
      line = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        PrintLow.format( stream, $str3$_A__, line );
        cdolist_list_var = cdolist_list_var.rest();
        line = cdolist_list_var.first();
      }
      new_error_message = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    if( NIL == list_utilities.lengthE( lines, matched_line_count, UNPROVIDED ) )
    {
      index_pph_error_msg_lines( lines, id );
    }
    note_pph_error_message_referenced( id );
    SubLObject cdolist_list_var = matches;
    SubLObject match2 = NIL;
    match2 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$1 = match2.rest();
      SubLObject matched_id = NIL;
      matched_id = cdolist_list_var_$1.first();
      while ( NIL != cdolist_list_var_$1)
      {
        note_pph_error_message_referenced( matched_id );
        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
        matched_id = cdolist_list_var_$1.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      match2 = cdolist_list_var.first();
    }
    return new_error_message;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-error-message-truncator.lisp", position = 2303L)
  public static SubLObject tokenize_pph_error_msg(final SubLObject error_msg)
  {
    return Sequences.nreverse( string_utilities.string_tokenize( error_msg, $list5, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-error-message-truncator.lisp", position = 2416L)
  public static SubLObject index_pph_error_msg(final SubLObject error_msg, final SubLObject id)
  {
    final SubLObject lines = tokenize_pph_error_msg( error_msg );
    return index_pph_error_msg_lines( lines, id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-error-message-truncator.lisp", position = 2570L)
  public static SubLObject index_pph_error_msg_lines(final SubLObject lines, final SubLObject id)
  {
    strie.strie_replace( $pph_error_msg_truncator_ids$.getGlobalValue(), lines, id );
    return id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-error-message-truncator.lisp", position = 2693L)
  public static SubLObject get_new_pph_error_msg_id()
  {
    return id_index.id_index_reserve( $pph_error_msg_truncator_id_index$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-error-message-truncator.lisp", position = 2801L)
  public static SubLObject unindex_pph_error_msg(final SubLObject id)
  {
    strie.strie_remove( $pph_error_msg_truncator_ids$.getGlobalValue(), id_index.id_index_lookup( $pph_error_msg_truncator_id_index$.getGlobalValue(), id, UNPROVIDED ) );
    id_index.id_index_remove( $pph_error_msg_truncator_id_index$.getGlobalValue(), id );
    return id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-error-message-truncator.lisp", position = 3020L)
  public static SubLObject note_pph_error_message_referenced(final SubLObject id)
  {
    $active_pph_error_msg_ids$.setGlobalValue( list_utilities.add_to_end( id, Sequences.delete( id, conses_high.copy_list( $active_pph_error_msg_ids$.getGlobalValue() ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED ) ) );
    if( NIL != list_utilities.lengthG( $active_pph_error_msg_ids$.getGlobalValue(), $max_active_pph_error_msg_ids$.getGlobalValue(), UNPROVIDED ) )
    {
      final SubLObject doomed_id = $active_pph_error_msg_ids$.getGlobalValue().first();
      $active_pph_error_msg_ids$.setGlobalValue( $active_pph_error_msg_ids$.getGlobalValue().rest() );
      unindex_pph_error_msg( doomed_id );
    }
    return id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-error-message-truncator.lisp", position = 3410L)
  public static SubLObject match_pph_error_msg(final SubLObject error_msg)
  {
    final SubLObject lines = tokenize_pph_error_msg( error_msg );
    SubLObject completions = NIL;
    SubLObject key_size = ZERO_INTEGER;
    SubLObject doneP = NIL;
    if( NIL == doneP )
    {
      SubLObject end_var;
      SubLObject i;
      SubLObject new_completions;
      for( end_var = number_utilities.f_1X( Sequences.length( lines ) ), i = NIL, i = ONE_INTEGER; NIL == doneP && !i.numGE( end_var ); i = number_utilities.f_1X( i ) )
      {
        new_completions = strie.strie_completions( $pph_error_msg_truncator_ids$.getGlobalValue(), Sequences.subseq( lines, ZERO_INTEGER, i ) );
        if( NIL != list_utilities.empty_list_p( new_completions ) )
        {
          doneP = T;
        }
        else
        {
          completions = new_completions;
          key_size = i;
        }
      }
    }
    return Values.values( completions, key_size, lines );
  }

  public static SubLObject declare_pph_error_message_truncator_file()
  {
    SubLFiles.declareFunction( me, "truncate_pph_error_message", "TRUNCATE-PPH-ERROR-MESSAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "tokenize_pph_error_msg", "TOKENIZE-PPH-ERROR-MSG", 1, 0, false );
    SubLFiles.declareFunction( me, "index_pph_error_msg", "INDEX-PPH-ERROR-MSG", 2, 0, false );
    SubLFiles.declareFunction( me, "index_pph_error_msg_lines", "INDEX-PPH-ERROR-MSG-LINES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_new_pph_error_msg_id", "GET-NEW-PPH-ERROR-MSG-ID", 0, 0, false );
    SubLFiles.declareFunction( me, "unindex_pph_error_msg", "UNINDEX-PPH-ERROR-MSG", 1, 0, false );
    SubLFiles.declareFunction( me, "note_pph_error_message_referenced", "NOTE-PPH-ERROR-MESSAGE-REFERENCED", 1, 0, false );
    SubLFiles.declareFunction( me, "match_pph_error_msg", "MATCH-PPH-ERROR-MSG", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_pph_error_message_truncator_file()
  {
    $pph_error_msg_truncator_id_index$ = SubLFiles.deflexical( "*PPH-ERROR-MSG-TRUNCATOR-ID-INDEX*", id_index.new_id_index( UNPROVIDED, UNPROVIDED ) );
    $pph_error_msg_truncator_ids$ = SubLFiles.deflexical( "*PPH-ERROR-MSG-TRUNCATOR-IDS*", strie.new_strie( Symbols.symbol_function( EQUAL ) ) );
    $active_pph_error_msg_ids$ = SubLFiles.deflexical( "*ACTIVE-PPH-ERROR-MSG-IDS*", NIL );
    $max_active_pph_error_msg_ids$ = SubLFiles.deflexical( "*MAX-ACTIVE-PPH-ERROR-MSG-IDS*", $int4$500 );
    return NIL;
  }

  public static SubLObject setup_pph_error_message_truncator_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_pph_error_message_truncator_file();
  }

  @Override
  public void initializeVariables()
  {
    init_pph_error_message_truncator_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_pph_error_message_truncator_file();
  }
  static
  {
    me = new pph_error_message_truncator();
    $pph_error_msg_truncator_id_index$ = null;
    $pph_error_msg_truncator_ids$ = null;
    $active_pph_error_msg_ids$ = null;
    $max_active_pph_error_msg_ids$ = null;
    $str0$___See_PPH_Error__ = makeString( "...See PPH Error [" );
    $str1$__for_remaining_lines_of_error_me = makeString( "] for remaining lines of error message." );
    $str2$PPH_Error___D____ = makeString( "PPH Error [~D]:~%" );
    $str3$_A__ = makeString( "~A~%" );
    $int4$500 = makeInteger( 500 );
    $list5 = ConsesLow.list( Characters.CHAR_newline );
  }
}
/*
 * 
 * Total time: 89 ms
 * 
 */