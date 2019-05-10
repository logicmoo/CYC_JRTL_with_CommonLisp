package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class batch_ke
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.batch_ke";
  public static final String myFingerPrint = "e3c54f72709dab935a69074b21f1fdb11ece8e0e15423074327848c50c16cf8b";
  @SubLTranslatedFile.SubL(source = "cycl/batch-ke.lisp", position = 1597L)
  private static SubLSymbol $batch_ke_stream$;
  @SubLTranslatedFile.SubL(source = "cycl/batch-ke.lisp", position = 1641L)
  private static SubLSymbol $batch_ke_current_output_method$;
  @SubLTranslatedFile.SubL(source = "cycl/batch-ke.lisp", position = 1760L)
  private static SubLSymbol $batch_ke_output_methods$;
  @SubLTranslatedFile.SubL(source = "cycl/batch-ke.lisp", position = 3900L)
  private static SubLSymbol $batch_ke_current_mapping_method$;
  @SubLTranslatedFile.SubL(source = "cycl/batch-ke.lisp", position = 4025L)
  private static SubLSymbol $batch_ke_mapping_methods$;
  @SubLTranslatedFile.SubL(source = "cycl/batch-ke.lisp", position = 14194L)
  private static SubLSymbol $archive_constant_table$;
  @SubLTranslatedFile.SubL(source = "cycl/batch-ke.lisp", position = 14308L)
  private static SubLSymbol $archive_constant_stream$;
  private static final SubLList $list0;
  private static final SubLString $str1$_S_was_not_a_valid_batch_ke_outpu;
  private static final SubLString $str2$_a_is_not_a_known_batch_ke_output;
  private static final SubLString $str3$CODE_Assertion;
  private static final SubLString $str4$REMOTE_Assertion;
  private static final SubLString $str5$________A;
  private static final SubLString $str6$_____Formula____S;
  private static final SubLString $str7$_____Mt_________S;
  private static final SubLString $str8$_____Strength___S;
  private static final SubLString $str9$_____Dir________S;
  private static final SubLList $list10;
  private static final SubLString $str11$_S_was_not_a_valid_batch_ke_inclu;
  private static final SubLSymbol $kw12$LOCAL;
  private static final SubLSymbol $kw13$UNASSERT_ASSERT;
  private static final SubLSymbol $kw14$OUTPUT;
  private static final SubLString $str15$Unable_to_open__S;
  private static final SubLSymbol $sym16$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const17$EverythingPSC;
  private static final SubLSymbol $kw18$POS;
  private static final SubLSymbol $kw19$NEG;
  private static final SubLString $str20$________Mode__LISP__Package__CYC_;
  private static final SubLString $str21$____;
  private static final SubLString $str22$_____Created_on__A;
  private static final SubLString $str23$_____CycL__A__KB__S;
  private static final SubLString $str24$____;
  private static final SubLString $str25$___ke_assert__;
  private static final SubLString $str26$____s__s__s_;
  private static final SubLString $str27$_____ke_unassert___s__s_;
  private static final SubLSymbol $sym28$STRINGP;
  private static final SubLSymbol $sym29$INTEGERP;
  private static final SubLSymbol $kw30$FILE_NOT_FOUND;
  private static final SubLString $str31$__File__A_was_not_found__or_is_in;
  private static final SubLSymbol $kw32$SUCCESS;
  private static final SubLString $str33$__File_completely_processed;
  private static final SubLString $str34$___S_initial_operations_skipped;
  private static final SubLString $str35$___S_operations_successfully_proc;
  private static final SubLString $str36$__File_incompletely_processed_;
  private static final SubLString $str37$__Error_after_file_position__S_;
  private static final SubLString $str38$_____A;
  private static final SubLString $str39$____After_fixing_the_file__use_a_;
  private static final SubLSymbol $kw40$INPUT;
  private static final SubLSymbol $kw41$ABORT_KE_LOAD;
  private static final SubLString $str42$Loading_KE_forms;
  private static final SubLSymbol $kw43$ERROR;
  private static final SubLSymbol $kw44$EOF;
  private static final SubLString $str45$Eval_error_in_form__S_starting_at;
  private static final SubLString $str46$Read_error_in_form_after__S_start;
  private static final SubLSymbol $sym47$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLList $list48;
  private static final SubLSymbol $sym49$ERROR;
  private static final SubLString $str50$Last_operation___S__;
  private static final SubLString $str51$FI_error___A;
  private static final SubLSymbol $sym52$CONSTANT_P;
  private static final SubLString $str53$___Archive_of__S;
  private static final SubLString $str54$_____fi_find_or_create__S__S_;
  private static final SubLSymbol $sym55$ARCHIVE_CONSTANT_INTERNAL;
  private static final SubLList $list56;
  private static final SubLString $str57$_____ke_assert__;
  private static final SubLString $str58$_____S;
  private static final SubLString $str59$____S__S_;

  @SubLTranslatedFile.SubL(source = "cycl/batch-ke.lisp", position = 2026L)
  public static SubLObject batch_ke_output_method(SubLObject output_method)
  {
    if( output_method == UNPROVIDED )
    {
      output_method = $batch_ke_current_output_method$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject function = conses_high.second( conses_high.assoc( output_method, $batch_ke_output_methods$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) );
    if( NIL == function )
    {
      Errors.error( $str1$_S_was_not_a_valid_batch_ke_outpu, output_method );
    }
    return function;
  }

  @SubLTranslatedFile.SubL(source = "cycl/batch-ke.lisp", position = 2321L)
  public static SubLObject batch_ke_output_via_current_method(final SubLObject ass)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject method = batch_ke_output_method( $batch_ke_current_output_method$.getDynamicValue( thread ) );
    if( NIL != method )
    {
      return Functions.funcall( method, ass );
    }
    Errors.error( $str2$_a_is_not_a_known_batch_ke_output, $batch_ke_current_output_method$.getDynamicValue( thread ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/batch-ke.lisp", position = 2604L)
  public static SubLObject batch_ke_output_ke_assert_unassert(final SubLObject ass)
  {
    final SubLObject formula = fi.assertion_fi_formula( ass, UNPROVIDED );
    final SubLObject mt = assertions_high.assertion_mt( ass );
    final SubLObject strength = assertions_high.assertion_strength( ass );
    final SubLObject dir = assertions_high.assertion_direction( ass );
    batch_ke_format_unassert( formula, mt );
    batch_ke_format_assert( formula, mt, strength, dir );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/batch-ke.lisp", position = 2939L)
  public static SubLObject batch_ke_output_ke_assert(final SubLObject ass)
  {
    final SubLObject formula = fi.assertion_fi_formula( ass, UNPROVIDED );
    final SubLObject mt = assertions_high.assertion_mt( ass );
    final SubLObject strength = assertions_high.assertion_strength( ass );
    final SubLObject dir = assertions_high.assertion_direction( ass );
    batch_ke_format_assert( formula, mt, strength, dir );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/batch-ke.lisp", position = 3201L)
  public static SubLObject batch_ke_output_ke_unassert(final SubLObject ass)
  {
    final SubLObject formula = fi.assertion_fi_formula( ass, UNPROVIDED );
    final SubLObject mt = assertions_high.assertion_mt( ass );
    batch_ke_format_unassert( formula, mt );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/batch-ke.lisp", position = 3381L)
  public static SubLObject batch_ke_output_commented(final SubLObject ass)
  {
    final SubLObject formula = fi.assertion_fi_formula( ass, UNPROVIDED );
    final SubLObject mt = assertions_high.assertion_mt( ass );
    final SubLObject strength = assertions_high.assertion_strength( ass );
    final SubLObject dir = assertions_high.assertion_direction( ass );
    final SubLObject comment = ( NIL != assertions_high.code_assertionP( ass ) ) ? $str3$CODE_Assertion : $str4$REMOTE_Assertion;
    batch_ke_format( $str5$________A, comment, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    batch_ke_format( $str6$_____Formula____S, formula, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    batch_ke_format( $str7$_____Mt_________S, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    batch_ke_format( $str8$_____Strength___S, strength, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    batch_ke_format( $str9$_____Dir________S, dir, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/batch-ke.lisp", position = 4287L)
  public static SubLObject batch_ke_mapping_function(final SubLObject inclusion_level)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject function = conses_high.second( conses_high.assoc( inclusion_level, $batch_ke_mapping_methods$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) );
    if( NIL == function )
    {
      Errors.error( $str11$_S_was_not_a_valid_batch_ke_inclu, inclusion_level );
    }
    return function;
  }

  @SubLTranslatedFile.SubL(source = "cycl/batch-ke.lisp", position = 4549L)
  public static SubLObject batch_ke_local(final SubLObject ass)
  {
    if( NIL != assertions_high.asserted_assertionP( ass ) )
    {
      if( NIL != assertions_high.code_assertionP( ass ) )
      {
        batch_ke_output_commented( ass );
      }
      else
      {
        batch_ke_output_via_current_method( ass );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/batch-ke.lisp", position = 4745L)
  public static SubLObject batch_ke_local_comment_remote(final SubLObject ass)
  {
    if( NIL != assertions_high.asserted_assertionP( ass ) && NIL == assertions_high.code_assertionP( ass ) )
    {
      batch_ke_output_via_current_method( ass );
    }
    else
    {
      batch_ke_output_commented( ass );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/batch-ke.lisp", position = 4974L)
  public static SubLObject batch_ke_term_file(final SubLObject v_term, final SubLObject outfile, SubLObject inclusion_level, SubLObject output_method)
  {
    if( inclusion_level == UNPROVIDED )
    {
      inclusion_level = $kw12$LOCAL;
    }
    if( output_method == UNPROVIDED )
    {
      output_method = $kw13$UNASSERT_ASSERT;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject written = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = compatibility.open_text( outfile, $kw14$OUTPUT );
      if( !stream.isStream() )
      {
        Errors.error( $str15$Unable_to_open__S, outfile );
      }
      final SubLObject stream_$1 = stream;
      batch_ke_header( stream_$1 );
      final SubLObject mapping_func = batch_ke_mapping_function( inclusion_level );
      final SubLObject _prev_bind_0 = $batch_ke_current_output_method$.currentBinding( thread );
      final SubLObject _prev_bind_2 = $batch_ke_stream$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        $batch_ke_current_output_method$.bind( output_method, thread );
        $batch_ke_stream$.bind( stream_$1, thread );
        mt_relevance_macros.$relevant_mt_function$.bind( $sym16$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const17$EverythingPSC, thread );
        kb_mapping.map_term( mapping_func, v_term );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_4, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_3, thread );
        $batch_ke_stream$.rebind( _prev_bind_2, thread );
        $batch_ke_current_output_method$.rebind( _prev_bind_0, thread );
      }
      written = T;
    }
    finally
    {
      final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_5, thread );
      }
    }
    return written;
  }

  @SubLTranslatedFile.SubL(source = "cycl/batch-ke.lisp", position = 5725L)
  public static SubLObject batch_ke_arg_index_file(final SubLObject v_term, final SubLObject arg, final SubLObject pred, final SubLObject outfile, SubLObject inclusion_level, SubLObject output_method)
  {
    if( inclusion_level == UNPROVIDED )
    {
      inclusion_level = $kw12$LOCAL;
    }
    if( output_method == UNPROVIDED )
    {
      output_method = $kw13$UNASSERT_ASSERT;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject written = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = compatibility.open_text( outfile, $kw14$OUTPUT );
      if( !stream.isStream() )
      {
        Errors.error( $str15$Unable_to_open__S, outfile );
      }
      final SubLObject stream_$2 = stream;
      batch_ke_header( stream_$2 );
      final SubLObject mapping_func = batch_ke_mapping_function( inclusion_level );
      final SubLObject _prev_bind_0 = $batch_ke_current_output_method$.currentBinding( thread );
      final SubLObject _prev_bind_2 = $batch_ke_stream$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        $batch_ke_current_output_method$.bind( output_method, thread );
        $batch_ke_stream$.bind( stream_$2, thread );
        mt_relevance_macros.$relevant_mt_function$.bind( $sym16$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const17$EverythingPSC, thread );
        kb_mapping.map_gaf_arg_index( mapping_func, v_term, arg, pred, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_4, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_3, thread );
        $batch_ke_stream$.rebind( _prev_bind_2, thread );
        $batch_ke_current_output_method$.rebind( _prev_bind_0, thread );
      }
      written = T;
    }
    finally
    {
      final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_5, thread );
      }
    }
    return written;
  }

  @SubLTranslatedFile.SubL(source = "cycl/batch-ke.lisp", position = 6312L)
  public static SubLObject batch_ke_other_index_file(final SubLObject v_term, final SubLObject outfile, SubLObject inclusion_level, SubLObject output_method)
  {
    if( inclusion_level == UNPROVIDED )
    {
      inclusion_level = $kw12$LOCAL;
    }
    if( output_method == UNPROVIDED )
    {
      output_method = $kw13$UNASSERT_ASSERT;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject written = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = compatibility.open_text( outfile, $kw14$OUTPUT );
      if( !stream.isStream() )
      {
        Errors.error( $str15$Unable_to_open__S, outfile );
      }
      final SubLObject stream_$3 = stream;
      batch_ke_header( stream_$3 );
      final SubLObject mapping_func = batch_ke_mapping_function( inclusion_level );
      final SubLObject _prev_bind_0 = $batch_ke_current_output_method$.currentBinding( thread );
      final SubLObject _prev_bind_2 = $batch_ke_stream$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        $batch_ke_current_output_method$.bind( output_method, thread );
        $batch_ke_stream$.bind( stream_$3, thread );
        mt_relevance_macros.$relevant_mt_function$.bind( $sym16$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const17$EverythingPSC, thread );
        kb_mapping.map_other_index( mapping_func, v_term, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_4, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_3, thread );
        $batch_ke_stream$.rebind( _prev_bind_2, thread );
        $batch_ke_current_output_method$.rebind( _prev_bind_0, thread );
      }
      written = T;
    }
    finally
    {
      final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_5, thread );
      }
    }
    return written;
  }

  @SubLTranslatedFile.SubL(source = "cycl/batch-ke.lisp", position = 6839L)
  public static SubLObject batch_ke_predicate_rule_index_file(final SubLObject pred, final SubLObject outfile, SubLObject inclusion_level, SubLObject output_method)
  {
    if( inclusion_level == UNPROVIDED )
    {
      inclusion_level = $kw12$LOCAL;
    }
    if( output_method == UNPROVIDED )
    {
      output_method = $kw13$UNASSERT_ASSERT;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject written = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = compatibility.open_text( outfile, $kw14$OUTPUT );
      if( !stream.isStream() )
      {
        Errors.error( $str15$Unable_to_open__S, outfile );
      }
      final SubLObject stream_$4 = stream;
      batch_ke_header( stream_$4 );
      final SubLObject mapping_func = batch_ke_mapping_function( inclusion_level );
      final SubLObject _prev_bind_0 = $batch_ke_current_output_method$.currentBinding( thread );
      final SubLObject _prev_bind_2 = $batch_ke_stream$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        $batch_ke_current_output_method$.bind( output_method, thread );
        $batch_ke_stream$.bind( stream_$4, thread );
        mt_relevance_macros.$relevant_mt_function$.bind( $sym16$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const17$EverythingPSC, thread );
        kb_mapping.map_predicate_rule_index( mapping_func, pred, $kw18$POS, UNPROVIDED, UNPROVIDED );
        kb_mapping.map_predicate_rule_index( mapping_func, pred, $kw19$NEG, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_4, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_3, thread );
        $batch_ke_stream$.rebind( _prev_bind_2, thread );
        $batch_ke_current_output_method$.rebind( _prev_bind_0, thread );
      }
      written = T;
    }
    finally
    {
      final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_5, thread );
      }
    }
    return written;
  }

  @SubLTranslatedFile.SubL(source = "cycl/batch-ke.lisp", position = 7532L)
  public static SubLObject batch_ke_isa_rule_index_file(final SubLObject col, final SubLObject outfile, SubLObject inclusion_level, SubLObject output_method)
  {
    if( inclusion_level == UNPROVIDED )
    {
      inclusion_level = $kw12$LOCAL;
    }
    if( output_method == UNPROVIDED )
    {
      output_method = $kw13$UNASSERT_ASSERT;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject written = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = compatibility.open_text( outfile, $kw14$OUTPUT );
      if( !stream.isStream() )
      {
        Errors.error( $str15$Unable_to_open__S, outfile );
      }
      final SubLObject stream_$5 = stream;
      batch_ke_header( stream_$5 );
      final SubLObject mapping_func = batch_ke_mapping_function( inclusion_level );
      final SubLObject _prev_bind_0 = $batch_ke_current_output_method$.currentBinding( thread );
      final SubLObject _prev_bind_2 = $batch_ke_stream$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        $batch_ke_current_output_method$.bind( output_method, thread );
        $batch_ke_stream$.bind( stream_$5, thread );
        mt_relevance_macros.$relevant_mt_function$.bind( $sym16$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const17$EverythingPSC, thread );
        kb_mapping.map_isa_rule_index( mapping_func, col, $kw18$POS, UNPROVIDED, UNPROVIDED );
        kb_mapping.map_isa_rule_index( mapping_func, col, $kw19$NEG, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_4, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_3, thread );
        $batch_ke_stream$.rebind( _prev_bind_2, thread );
        $batch_ke_current_output_method$.rebind( _prev_bind_0, thread );
      }
      written = T;
    }
    finally
    {
      final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_5, thread );
      }
    }
    return written;
  }

  @SubLTranslatedFile.SubL(source = "cycl/batch-ke.lisp", position = 8140L)
  public static SubLObject batch_ke_genls_rule_index_file(final SubLObject col, final SubLObject outfile, SubLObject inclusion_level, SubLObject output_method)
  {
    if( inclusion_level == UNPROVIDED )
    {
      inclusion_level = $kw12$LOCAL;
    }
    if( output_method == UNPROVIDED )
    {
      output_method = $kw13$UNASSERT_ASSERT;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject written = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = compatibility.open_text( outfile, $kw14$OUTPUT );
      if( !stream.isStream() )
      {
        Errors.error( $str15$Unable_to_open__S, outfile );
      }
      final SubLObject stream_$6 = stream;
      batch_ke_header( stream_$6 );
      final SubLObject mapping_func = batch_ke_mapping_function( inclusion_level );
      final SubLObject _prev_bind_0 = $batch_ke_current_output_method$.currentBinding( thread );
      final SubLObject _prev_bind_2 = $batch_ke_stream$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        $batch_ke_current_output_method$.bind( output_method, thread );
        $batch_ke_stream$.bind( stream_$6, thread );
        mt_relevance_macros.$relevant_mt_function$.bind( $sym16$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const17$EverythingPSC, thread );
        kb_mapping.map_genls_rule_index( mapping_func, col, $kw18$POS, UNPROVIDED, UNPROVIDED );
        kb_mapping.map_genls_rule_index( mapping_func, col, $kw19$NEG, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_4, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_3, thread );
        $batch_ke_stream$.rebind( _prev_bind_2, thread );
        $batch_ke_current_output_method$.rebind( _prev_bind_0, thread );
      }
      written = T;
    }
    finally
    {
      final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_5, thread );
      }
    }
    return written;
  }

  @SubLTranslatedFile.SubL(source = "cycl/batch-ke.lisp", position = 8682L)
  public static SubLObject batch_ke_genl_mt_rule_index_file(final SubLObject genl_mt, final SubLObject outfile, SubLObject inclusion_level, SubLObject output_method)
  {
    if( inclusion_level == UNPROVIDED )
    {
      inclusion_level = $kw12$LOCAL;
    }
    if( output_method == UNPROVIDED )
    {
      output_method = $kw13$UNASSERT_ASSERT;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject written = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = compatibility.open_text( outfile, $kw14$OUTPUT );
      if( !stream.isStream() )
      {
        Errors.error( $str15$Unable_to_open__S, outfile );
      }
      final SubLObject stream_$7 = stream;
      batch_ke_header( stream_$7 );
      final SubLObject mapping_func = batch_ke_mapping_function( inclusion_level );
      final SubLObject _prev_bind_0 = $batch_ke_current_output_method$.currentBinding( thread );
      final SubLObject _prev_bind_2 = $batch_ke_stream$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        $batch_ke_current_output_method$.bind( output_method, thread );
        $batch_ke_stream$.bind( stream_$7, thread );
        mt_relevance_macros.$relevant_mt_function$.bind( $sym16$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const17$EverythingPSC, thread );
        kb_mapping.map_genl_mt_rule_index( mapping_func, genl_mt, $kw18$POS, UNPROVIDED, UNPROVIDED );
        kb_mapping.map_genl_mt_rule_index( mapping_func, genl_mt, $kw19$NEG, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_4, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_3, thread );
        $batch_ke_stream$.rebind( _prev_bind_2, thread );
        $batch_ke_current_output_method$.rebind( _prev_bind_0, thread );
      }
      written = T;
    }
    finally
    {
      final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_5, thread );
      }
    }
    return written;
  }

  @SubLTranslatedFile.SubL(source = "cycl/batch-ke.lisp", position = 9242L)
  public static SubLObject batch_ke_mt_index_file(final SubLObject v_term, final SubLObject outfile, SubLObject inclusion_level, SubLObject output_method)
  {
    if( inclusion_level == UNPROVIDED )
    {
      inclusion_level = $kw12$LOCAL;
    }
    if( output_method == UNPROVIDED )
    {
      output_method = $kw13$UNASSERT_ASSERT;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject written = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = compatibility.open_text( outfile, $kw14$OUTPUT );
      if( !stream.isStream() )
      {
        Errors.error( $str15$Unable_to_open__S, outfile );
      }
      final SubLObject stream_$8 = stream;
      batch_ke_header( stream_$8 );
      final SubLObject mapping_func = batch_ke_mapping_function( inclusion_level );
      final SubLObject _prev_bind_0 = $batch_ke_current_output_method$.currentBinding( thread );
      final SubLObject _prev_bind_2 = $batch_ke_stream$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        $batch_ke_current_output_method$.bind( output_method, thread );
        $batch_ke_stream$.bind( stream_$8, thread );
        mt_relevance_macros.$relevant_mt_function$.bind( $sym16$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const17$EverythingPSC, thread );
        kb_mapping.map_mt_index( mapping_func, v_term, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_4, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_3, thread );
        $batch_ke_stream$.rebind( _prev_bind_2, thread );
        $batch_ke_current_output_method$.rebind( _prev_bind_0, thread );
      }
      written = T;
    }
    finally
    {
      final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_5, thread );
      }
    }
    return written;
  }

  @SubLTranslatedFile.SubL(source = "cycl/batch-ke.lisp", position = 9759L)
  public static SubLObject output_lisp_attribute_comment(final SubLObject stream)
  {
    PrintLow.format( stream, $str20$________Mode__LISP__Package__CYC_ );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/batch-ke.lisp", position = 9929L)
  public static SubLObject batch_ke_header(final SubLObject stream)
  {
    output_lisp_attribute_comment( stream );
    PrintLow.format( stream, $str21$____ );
    PrintLow.format( stream, $str22$_____Created_on__A, numeric_date_utilities.timestring( UNPROVIDED ) );
    PrintLow.format( stream, $str23$_____CycL__A__KB__S, system_info.cyc_revision_string(), control_vars.kb_loaded() );
    PrintLow.format( stream, $str24$____ );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/batch-ke.lisp", position = 10201L)
  public static SubLObject batch_ke_format(final SubLObject format_string, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4)
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
    return PrintLow.format( $batch_ke_stream$.getDynamicValue( thread ), format_string, new SubLObject[] { arg1, arg2, arg3, arg4
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/batch-ke.lisp", position = 10350L)
  public static SubLObject batch_ke_format_assert(final SubLObject formula, final SubLObject mt, final SubLObject strength, final SubLObject dir)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    batch_ke_format( $str25$___ke_assert__, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    format_cycl_expression.format_cycl_expression( formula, $batch_ke_stream$.getDynamicValue( thread ), ONE_INTEGER );
    batch_ke_format( $str26$____s__s__s_, mt, strength, dir, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/batch-ke.lisp", position = 10572L)
  public static SubLObject batch_ke_format_unassert(final SubLObject formula, final SubLObject mt)
  {
    batch_ke_format( $str27$_____ke_unassert___s__s_, formula, mt, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/batch-ke.lisp", position = 10698L)
  public static SubLObject load_api(final SubLObject filename, SubLObject skip)
  {
    if( skip == UNPROVIDED )
    {
      skip = ZERO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( filename ) : filename;
    assert NIL != Types.integerp( skip ) : skip;
    thread.resetMultipleValues();
    final SubLObject status = load_api_internal( filename, skip );
    final SubLObject count = thread.secondMultipleValue();
    final SubLObject position = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( status == $kw30$FILE_NOT_FOUND )
    {
      PrintLow.format( T, $str31$__File__A_was_not_found__or_is_in, filename );
      return NIL;
    }
    if( status == $kw32$SUCCESS )
    {
      PrintLow.format( T, $str33$__File_completely_processed );
      PrintLow.format( T, $str34$___S_initial_operations_skipped, skip );
      PrintLow.format( T, $str35$___S_operations_successfully_proc, Numbers.subtract( count, skip ) );
      return T;
    }
    PrintLow.format( T, $str36$__File_incompletely_processed_ );
    PrintLow.format( T, $str34$___S_initial_operations_skipped, skip );
    PrintLow.format( T, $str35$___S_operations_successfully_proc, Numbers.subtract( count, skip ) );
    PrintLow.format( T, $str37$__Error_after_file_position__S_, position );
    PrintLow.format( T, $str38$_____A, status );
    PrintLow.format( T, $str39$____After_fixing_the_file__use_a_, count );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/batch-ke.lisp", position = 11823L)
  public static SubLObject load_api_internal(final SubLObject filename, SubLObject skip)
  {
    if( skip == UNPROVIDED )
    {
      skip = ZERO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != Filesys.probe_file( filename ) )
    {
      SubLObject total_forms = ZERO_INTEGER;
      SubLObject last_form_position = ZERO_INTEGER;
      SubLObject abort_reason = $kw32$SUCCESS;
      SubLObject previous_ok_form = NIL;
      SubLObject stream = NIL;
      try
      {
        stream = compatibility.open_text( filename, $kw40$INPUT );
        if( !stream.isStream() )
        {
          Errors.error( $str15$Unable_to_open__S, filename );
        }
        final SubLObject stream_$9 = stream;
        try
        {
          thread.throwStack.push( $kw41$ABORT_KE_LOAD );
          final SubLObject file_length = streams_high.file_length( stream_$9 );
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
              utilities_macros.noting_percent_progress_preamble( $str42$Loading_KE_forms );
              SubLObject form;
              SubLObject error;
              for( form = NIL, form = read_api_form( stream_$9 ); form != $kw43$ERROR && form != $kw44$EOF; form = read_api_form( stream_$9 ) )
              {
                if( skip.numG( ZERO_INTEGER ) )
                {
                  skip = Numbers.subtract( skip, ONE_INTEGER );
                }
                else
                {
                  error = eval_api_form( form );
                  if( NIL != error )
                  {
                    PrintLow.format( T, $str45$Eval_error_in_form__S_starting_at, form, last_form_position );
                    Dynamic.sublisp_throw( $kw41$ABORT_KE_LOAD, error );
                  }
                }
                last_form_position = compatibility.get_file_position( stream_$9 );
                utilities_macros.note_percent_progress( last_form_position, file_length );
                total_forms = Numbers.add( total_forms, ONE_INTEGER );
                previous_ok_form = form;
              }
              if( form == $kw43$ERROR )
              {
                Dynamic.sublisp_throw( $kw41$ABORT_KE_LOAD, PrintLow.format( NIL, $str46$Read_error_in_form_after__S_start, previous_ok_form, last_form_position ) );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                utilities_macros.noting_percent_progress_postamble();
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$10, thread );
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
        }
        catch( final Throwable ccatch_env_var )
        {
          abort_reason = Errors.handleThrowable( ccatch_env_var, $kw41$ABORT_KE_LOAD );
        }
        finally
        {
          thread.throwStack.pop();
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
      return Values.values( abort_reason, total_forms, last_form_position );
    }
    return Values.values( $kw30$FILE_NOT_FOUND, ZERO_INTEGER, ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/batch-ke.lisp", position = 13459L)
  public static SubLObject read_api_form(final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject value = reader.read_ignoring_errors( stream, NIL, $kw44$EOF );
    final SubLObject error = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return ( NIL != value ) ? value : error;
  }

  @SubLTranslatedFile.SubL(source = "cycl/batch-ke.lisp", position = 13626L)
  public static SubLObject eval_api_form(final SubLObject form)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject error_message = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym47$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          final SubLObject _prev_bind_0_$11 = Errors.$continue_cerrorP$.currentBinding( thread );
          final SubLObject _prev_bind_2 = api_control_vars.$use_local_queueP$.currentBinding( thread );
          try
          {
            Errors.$continue_cerrorP$.bind( T, thread );
            api_control_vars.$use_local_queueP$.bind( NIL, thread );
            fi.reset_fi_error_state();
            eval_in_api.cyc_api_eval( form );
          }
          finally
          {
            api_control_vars.$use_local_queueP$.rebind( _prev_bind_2, thread );
            Errors.$continue_cerrorP$.rebind( _prev_bind_0_$11, thread );
          }
          if( NIL == error_message && NIL != fi.fi_error_signaledP() )
          {
            SubLObject current;
            final SubLObject datum = current = fi.fi_get_error_int();
            SubLObject error = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list48 );
            error = current.first();
            current = current.rest();
            final SubLObject format_string = current.isCons() ? current.first() : NIL;
            cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list48 );
            final SubLObject args;
            current = ( args = current.rest() );
            Functions.apply( Symbols.symbol_function( $sym49$ERROR ), Sequences.cconcatenate( $str50$Last_operation___S__, ( NIL != format_string ) ? format_string : PrintLow.format( NIL, $str51$FI_error___A, error ) ),
                new SubLObject[]
                { form, args
                } );
          }
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return error_message;
  }

  @SubLTranslatedFile.SubL(source = "cycl/batch-ke.lisp", position = 14361L)
  public static SubLObject archive_constant(final SubLObject constant, final SubLObject filename)
  {
    assert NIL != constant_handles.constant_p( constant ) : constant;
    assert NIL != Types.stringp( filename ) : filename;
    SubLObject stream = NIL;
    try
    {
      stream = compatibility.open_text( filename, $kw14$OUTPUT );
      if( !stream.isStream() )
      {
        Errors.error( $str15$Unable_to_open__S, filename );
      }
      final SubLObject stream_$12 = stream;
      archive_constant_to_stream( constant, stream_$12 );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/batch-ke.lisp", position = 14621L)
  public static SubLObject archive_constant_to_stream(final SubLObject constant, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    batch_ke_header( stream );
    PrintLow.format( stream, $str53$___Archive_of__S, constant );
    PrintLow.format( stream, $str54$_____fi_find_or_create__S__S_, constants_high.constant_name( constant ), constants_high.constant_external_id( constant ) );
    final SubLObject _prev_bind_0 = $archive_constant_table$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $archive_constant_stream$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      $archive_constant_table$.bind( Hashtables.make_hash_table( kb_indexing.num_index( constant ), UNPROVIDED, UNPROVIDED ), thread );
      $archive_constant_stream$.bind( stream, thread );
      mt_relevance_macros.$relevant_mt_function$.bind( $sym16$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const17$EverythingPSC, thread );
      SubLObject cdolist_list_var = $list56;
      SubLObject pred = NIL;
      pred = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        kb_mapping.map_gaf_arg_index( Symbols.symbol_function( $sym55$ARCHIVE_CONSTANT_INTERNAL ), constant, ONE_INTEGER, pred, UNPROVIDED, UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        pred = cdolist_list_var.first();
      }
      kb_mapping.map_gaf_arg_index( Symbols.symbol_function( $sym55$ARCHIVE_CONSTANT_INTERNAL ), constant, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      kb_mapping.map_term( Symbols.symbol_function( $sym55$ARCHIVE_CONSTANT_INTERNAL ), constant );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_4, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_3, thread );
      $archive_constant_stream$.rebind( _prev_bind_2, thread );
      $archive_constant_table$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/batch-ke.lisp", position = 15439L)
  public static SubLObject archive_constant_internal(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Hashtables.gethash( assertion, $archive_constant_table$.getDynamicValue( thread ), UNPROVIDED ) )
    {
      Hashtables.sethash( assertion, $archive_constant_table$.getDynamicValue( thread ), T );
      if( NIL != assertions_high.asserted_assertionP( assertion ) )
      {
        final SubLObject stream = $archive_constant_stream$.getDynamicValue( thread );
        final SubLObject formula = uncanonicalizer.assertion_el_formula( assertion );
        final SubLObject mt = forts.fort_el_formula( assertions_high.assertion_mt( assertion ) );
        final SubLObject direction = assertions_high.assertion_direction( assertion );
        final SubLObject strength = assertions_high.assertion_strength( assertion );
        PrintLow.format( stream, $str57$_____ke_assert__ );
        format_cycl_expression.format_cycl_expression( formula, stream, ONE_INTEGER );
        PrintLow.format( stream, $str58$_____S, mt );
        PrintLow.format( stream, $str59$____S__S_, strength, direction );
      }
    }
    return NIL;
  }

  public static SubLObject declare_batch_ke_file()
  {
    SubLFiles.declareFunction( me, "batch_ke_output_method", "BATCH-KE-OUTPUT-METHOD", 0, 1, false );
    SubLFiles.declareFunction( me, "batch_ke_output_via_current_method", "BATCH-KE-OUTPUT-VIA-CURRENT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "batch_ke_output_ke_assert_unassert", "BATCH-KE-OUTPUT-KE-ASSERT-UNASSERT", 1, 0, false );
    SubLFiles.declareFunction( me, "batch_ke_output_ke_assert", "BATCH-KE-OUTPUT-KE-ASSERT", 1, 0, false );
    SubLFiles.declareFunction( me, "batch_ke_output_ke_unassert", "BATCH-KE-OUTPUT-KE-UNASSERT", 1, 0, false );
    SubLFiles.declareFunction( me, "batch_ke_output_commented", "BATCH-KE-OUTPUT-COMMENTED", 1, 0, false );
    SubLFiles.declareFunction( me, "batch_ke_mapping_function", "BATCH-KE-MAPPING-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "batch_ke_local", "BATCH-KE-LOCAL", 1, 0, false );
    SubLFiles.declareFunction( me, "batch_ke_local_comment_remote", "BATCH-KE-LOCAL-COMMENT-REMOTE", 1, 0, false );
    SubLFiles.declareFunction( me, "batch_ke_term_file", "BATCH-KE-TERM-FILE", 2, 2, false );
    SubLFiles.declareFunction( me, "batch_ke_arg_index_file", "BATCH-KE-ARG-INDEX-FILE", 4, 2, false );
    SubLFiles.declareFunction( me, "batch_ke_other_index_file", "BATCH-KE-OTHER-INDEX-FILE", 2, 2, false );
    SubLFiles.declareFunction( me, "batch_ke_predicate_rule_index_file", "BATCH-KE-PREDICATE-RULE-INDEX-FILE", 2, 2, false );
    SubLFiles.declareFunction( me, "batch_ke_isa_rule_index_file", "BATCH-KE-ISA-RULE-INDEX-FILE", 2, 2, false );
    SubLFiles.declareFunction( me, "batch_ke_genls_rule_index_file", "BATCH-KE-GENLS-RULE-INDEX-FILE", 2, 2, false );
    SubLFiles.declareFunction( me, "batch_ke_genl_mt_rule_index_file", "BATCH-KE-GENL-MT-RULE-INDEX-FILE", 2, 2, false );
    SubLFiles.declareFunction( me, "batch_ke_mt_index_file", "BATCH-KE-MT-INDEX-FILE", 2, 2, false );
    SubLFiles.declareFunction( me, "output_lisp_attribute_comment", "OUTPUT-LISP-ATTRIBUTE-COMMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "batch_ke_header", "BATCH-KE-HEADER", 1, 0, false );
    SubLFiles.declareFunction( me, "batch_ke_format", "BATCH-KE-FORMAT", 1, 4, false );
    SubLFiles.declareFunction( me, "batch_ke_format_assert", "BATCH-KE-FORMAT-ASSERT", 4, 0, false );
    SubLFiles.declareFunction( me, "batch_ke_format_unassert", "BATCH-KE-FORMAT-UNASSERT", 2, 0, false );
    SubLFiles.declareFunction( me, "load_api", "LOAD-API", 1, 1, false );
    SubLFiles.declareFunction( me, "load_api_internal", "LOAD-API-INTERNAL", 1, 1, false );
    SubLFiles.declareFunction( me, "read_api_form", "READ-API-FORM", 1, 0, false );
    SubLFiles.declareFunction( me, "eval_api_form", "EVAL-API-FORM", 1, 0, false );
    SubLFiles.declareFunction( me, "archive_constant", "ARCHIVE-CONSTANT", 2, 0, false );
    SubLFiles.declareFunction( me, "archive_constant_to_stream", "ARCHIVE-CONSTANT-TO-STREAM", 1, 1, false );
    SubLFiles.declareFunction( me, "archive_constant_internal", "ARCHIVE-CONSTANT-INTERNAL", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_batch_ke_file()
  {
    $batch_ke_stream$ = SubLFiles.defparameter( "*BATCH-KE-STREAM*", T );
    $batch_ke_current_output_method$ = SubLFiles.defparameter( "*BATCH-KE-CURRENT-OUTPUT-METHOD*", NIL );
    $batch_ke_output_methods$ = SubLFiles.defparameter( "*BATCH-KE-OUTPUT-METHODS*", $list0 );
    $batch_ke_current_mapping_method$ = SubLFiles.defparameter( "*BATCH-KE-CURRENT-MAPPING-METHOD*", NIL );
    $batch_ke_mapping_methods$ = SubLFiles.defparameter( "*BATCH-KE-MAPPING-METHODS*", $list10 );
    $archive_constant_table$ = SubLFiles.defparameter( "*ARCHIVE-CONSTANT-TABLE*", NIL );
    $archive_constant_stream$ = SubLFiles.defparameter( "*ARCHIVE-CONSTANT-STREAM*", NIL );
    return NIL;
  }

  public static SubLObject setup_batch_ke_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_batch_ke_file();
  }

  @Override
  public void initializeVariables()
  {
    init_batch_ke_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_batch_ke_file();
  }
  static
  {
    me = new batch_ke();
    $batch_ke_stream$ = null;
    $batch_ke_current_output_method$ = null;
    $batch_ke_output_methods$ = null;
    $batch_ke_current_mapping_method$ = null;
    $batch_ke_mapping_methods$ = null;
    $archive_constant_table$ = null;
    $archive_constant_stream$ = null;
    $list0 = ConsesLow.list( ConsesLow.list( makeKeyword( "UNASSERT-ASSERT" ), makeSymbol( "BATCH-KE-OUTPUT-KE-ASSERT-UNASSERT" ) ), ConsesLow.list( makeKeyword( "ASSERT" ), makeSymbol( "BATCH-KE-OUTPUT-KE-ASSERT" ) ),
        ConsesLow.list( makeKeyword( "UNASSERT" ), makeSymbol( "BATCH-KE-OUTPUT-KE-UNASSERT" ) ), ConsesLow.list( makeKeyword( "COMMENTED" ), makeSymbol( "BATCH-KE-OUTPUT-COMMENTED" ) ) );
    $str1$_S_was_not_a_valid_batch_ke_outpu = makeString( "~S was not a valid batch-ke output-method" );
    $str2$_a_is_not_a_known_batch_ke_output = makeString( "~a is not a known batch ke output method" );
    $str3$CODE_Assertion = makeString( "CODE Assertion" );
    $str4$REMOTE_Assertion = makeString( "REMOTE Assertion" );
    $str5$________A = makeString( "~%~%;; ~A" );
    $str6$_____Formula____S = makeString( "~%;; Formula:  ~S" );
    $str7$_____Mt_________S = makeString( "~%;; Mt:       ~S" );
    $str8$_____Strength___S = makeString( "~%;; Strength: ~S" );
    $str9$_____Dir________S = makeString( "~%;; Dir:      ~S" );
    $list10 = ConsesLow.list( ConsesLow.list( makeKeyword( "LOCAL" ), makeSymbol( "BATCH-KE-LOCAL" ) ), ConsesLow.list( makeKeyword( "LOCAL-AND-COMMENTED-REMOTE" ), makeSymbol( "BATCH-KE-LOCAL-COMMENT-REMOTE" ) ) );
    $str11$_S_was_not_a_valid_batch_ke_inclu = makeString( "~S was not a valid batch-ke inclusion-level" );
    $kw12$LOCAL = makeKeyword( "LOCAL" );
    $kw13$UNASSERT_ASSERT = makeKeyword( "UNASSERT-ASSERT" );
    $kw14$OUTPUT = makeKeyword( "OUTPUT" );
    $str15$Unable_to_open__S = makeString( "Unable to open ~S" );
    $sym16$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const17$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $kw18$POS = makeKeyword( "POS" );
    $kw19$NEG = makeKeyword( "NEG" );
    $str20$________Mode__LISP__Package__CYC_ = makeString( ";;; -*- Mode: LISP; Package: CYC; Syntax: ANSI-Common-Lisp -*-" );
    $str21$____ = makeString( "~%;;" );
    $str22$_____Created_on__A = makeString( "~%;; Created on ~A" );
    $str23$_____CycL__A__KB__S = makeString( "~%;; CycL ~A  KB ~S" );
    $str24$____ = makeString( "~%~%" );
    $str25$___ke_assert__ = makeString( "~%(ke-assert '" );
    $str26$____s__s__s_ = makeString( "~% ~s ~s ~s)" );
    $str27$_____ke_unassert___s__s_ = makeString( "~%~%(ke-unassert '~s ~s)" );
    $sym28$STRINGP = makeSymbol( "STRINGP" );
    $sym29$INTEGERP = makeSymbol( "INTEGERP" );
    $kw30$FILE_NOT_FOUND = makeKeyword( "FILE-NOT-FOUND" );
    $str31$__File__A_was_not_found__or_is_in = makeString( "~%File ~A was not found, or is inaccessible" );
    $kw32$SUCCESS = makeKeyword( "SUCCESS" );
    $str33$__File_completely_processed = makeString( "~%File completely processed" );
    $str34$___S_initial_operations_skipped = makeString( "~%~S initial operations skipped" );
    $str35$___S_operations_successfully_proc = makeString( "~%~S operations successfully processed" );
    $str36$__File_incompletely_processed_ = makeString( "~%File incompletely processed:" );
    $str37$__Error_after_file_position__S_ = makeString( "~%Error after file position ~S:" );
    $str38$_____A = makeString( "~%~%~A" );
    $str39$____After_fixing_the_file__use_a_ = makeString( "~%~%After fixing the file, use a skip value of ~S to continue." );
    $kw40$INPUT = makeKeyword( "INPUT" );
    $kw41$ABORT_KE_LOAD = makeKeyword( "ABORT-KE-LOAD" );
    $str42$Loading_KE_forms = makeString( "Loading KE forms" );
    $kw43$ERROR = makeKeyword( "ERROR" );
    $kw44$EOF = makeKeyword( "EOF" );
    $str45$Eval_error_in_form__S_starting_at = makeString( "Eval error in form ~S starting at position ~S" );
    $str46$Read_error_in_form_after__S_start = makeString( "Read error in form after ~S starting at position ~S" );
    $sym47$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $list48 = ConsesLow.list( makeSymbol( "ERROR" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "FORMAT-STRING" ), makeSymbol( "&REST" ), makeSymbol( "ARGS" ) );
    $sym49$ERROR = makeSymbol( "ERROR" );
    $str50$Last_operation___S__ = makeString( "Last operation: ~S~%" );
    $str51$FI_error___A = makeString( "FI error: ~A" );
    $sym52$CONSTANT_P = makeSymbol( "CONSTANT-P" );
    $str53$___Archive_of__S = makeString( ";; Archive of ~S" );
    $str54$_____fi_find_or_create__S__S_ = makeString( "~%~%(fi-find-or-create ~S ~S)" );
    $sym55$ARCHIVE_CONSTANT_INTERNAL = makeSymbol( "ARCHIVE-CONSTANT-INTERNAL" );
    $list56 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "genls" ) ), constant_handles.reader_make_constant_shell(
        makeString( "genlMt" ) ), constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) ), constant_handles.reader_make_constant_shell( makeString( "genlInverse" ) ) );
    $str57$_____ke_assert__ = makeString( "~%~%(ke-assert '" );
    $str58$_____S = makeString( "~% '~S" );
    $str59$____S__S_ = makeString( "~% ~S ~S)" );
  }
}
/*
 * 
 * Total time: 336 ms
 * 
 */