package com.cyc.cycjava.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kb_text_dump
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.kb_text_dump";
  public static final String myFingerPrint = "462e52903d1041a717bb1fc91ae493bf1e66466307e35224ab95c1fab2edb3ce";
  @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 822L)
  private static SubLSymbol $kb_text_hl_prototypical_terms$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 15602L)
  private static SubLSymbol $kb_text_compact_hl_external_id_string_cached_caching_state$;
  private static final SubLObject $const0$HLPrototypicalTerm;
  private static final SubLSymbol $sym1$KB_TEXT_HL_PROTOTYPICAL_TERM_;
  private static final SubLSymbol $sym2$CONSTANT_NAME;
  private static final SubLSymbol $sym3$KB_TEXT_DUMP_ESSENTIAL_KB;
  private static final SubLSymbol $sym4$KB_TEXT_DUMP_KB;
  private static final SubLString $str5$constants;
  private static final SubLSymbol $kw6$OUTPUT;
  private static final SubLString $str7$Unable_to_open__S;
  private static final SubLString $str8$Text_dumping_constants;
  private static final SubLSymbol $sym9$STRINGP;
  private static final SubLSymbol $kw10$SKIP;
  private static final SubLString $str11$_;
  private static final SubLString $str12$narts;
  private static final SubLString $str13$Text_dumping_narts;
  private static final SubLString $str14$assertions;
  private static final SubLString $str15$Text_dumping_assertions;
  private static final SubLSymbol $sym16$STREAMP;
  private static final SubLSymbol $sym17$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const18$EverythingPSC;
  private static final SubLString $str19$Mapping_meta_assertions;
  private static final SubLSymbol $sym20$ASSERTION_P;
  private static final SubLString $str21$_A_;
  private static final SubLString $str22$deductions;
  private static final SubLString $str23$Text_dumping_deductions;
  private static final SubLString $str24$_A__A__A__A;
  private static final SubLString $str25$kb_hl_supports;
  private static final SubLString $str26$Text_dumping_KB_HL_supports;
  private static final SubLString $str27$unrepresented_terms;
  private static final SubLString $str28$Text_dumping_unrepresented_terms;
  private static final SubLSymbol $sym29$LOOKUP_UNREPRESENTED_TERM_SUID;
  private static final SubLString $str30$constant_indexing;
  private static final SubLSymbol $kw31$STREAM;
  private static final SubLString $str32$Text_dumping_constant_indexing;
  private static final SubLString $str33$Unsupported_index_type__A___;
  private static final SubLString $str34$nart_indexing;
  private static final SubLString $str35$Text_dumping_NAT_indexing;
  private static final SubLString $str36$unrepresented_term_indexing;
  private static final SubLString $str37$Text_dumping_unrepresented_term_i;
  private static final SubLString $str38$____Old_Space;
  private static final SubLString $str39$____New_Space;
  private static final SubLString $str40$cdolist;
  private static final SubLSymbol $kw41$PATH;
  private static final SubLSymbol $sym42$KB_TEXT_DUMP_COMPINX_VISIT_BEGIN_VISIT;
  private static final SubLSymbol $sym43$KB_TEXT_DUMP_COMPINX_VISIT_BEGIN_SUBINDEX;
  private static final SubLSymbol $sym44$KB_TEXT_DUMP_COMPINX_VISIT_FINAL_INDEX;
  private static final SubLSymbol $sym45$KB_TEXT_DUMP_COMPINX_VISIT_END_SUBINDEX;
  private static final SubLSymbol $sym46$KB_TEXT_DUMP_COMPINX_VISIT_END_VISIT;
  private static final SubLString $str47$Skipping_final_top_N_index__A___;
  private static final SubLSymbol $sym48$_;
  private static final SubLSymbol $sym49$FINAL_INDEX_P;
  private static final SubLSymbol $sym50$DO_STACK_ELEMENTS_STACK_ELEMENTS;
  private static final SubLList $list51;
  private static final SubLString $str52$A_;
  private static final SubLSymbol $sym53$KB_TEXT_CONVERT_DEDUCTION_SUPPORT_TO_RECIPE;
  private static final SubLSymbol $sym54$STRING_;
  private static final SubLSymbol $sym55$KB_TEXT_COMPACT_HL_EXTERNAL_ID_STRING_CACHED;
  private static final SubLSymbol $sym56$_KB_TEXT_COMPACT_HL_EXTERNAL_ID_STRING_CACHED_CACHING_STATE_;
  private static final SubLInteger $int57$10000;
  private static final SubLString $str58$kbtext;

  @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 998L)
  public static SubLObject get_hl_prototypical_terms()
  {
    return set_utilities.construct_set_from_list( isa.quoted_instances( $const0$HLPrototypicalTerm, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 1111L)
  public static SubLObject kb_text_hl_prototypical_termP(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return set.set_memberP( v_term, $kb_text_hl_prototypical_terms$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 1217L)
  public static SubLObject kb_text_convert_potential_prototypical_terms(final SubLObject cons)
  {
    if( NIL == list_utilities.tree_find_if( $sym1$KB_TEXT_HL_PROTOTYPICAL_TERM_, cons, UNPROVIDED ) )
    {
      return cons;
    }
    return list_utilities.tree_transform_if( cons, $sym1$KB_TEXT_HL_PROTOTYPICAL_TERM_, $sym2$CONSTANT_NAME, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 1553L)
  public static SubLObject kb_text_dump_essential_kb(final SubLObject directory)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = $kb_text_hl_prototypical_terms$.currentBinding( thread );
    final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding( thread );
    final SubLObject _prev_bind_3 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding( thread );
    try
    {
      $kb_text_hl_prototypical_terms$.bind( get_hl_prototypical_terms(), thread );
      StreamsLow.$stream_initial_input_buffer_size$.bind( file_utilities.$default_big_stream_buffer_size$.getDynamicValue( thread ), thread );
      StreamsLow.$stream_initial_output_buffer_size$.bind( StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue( thread ), thread );
      kb_text_dump_constants( directory );
      kb_text_dump_narts( directory );
      kb_text_dump_assertions( directory );
      kb_text_dump_deductions( directory );
      kb_text_dump_kb_hl_supports( directory );
    }
    finally
    {
      StreamsLow.$stream_initial_output_buffer_size$.rebind( _prev_bind_3, thread );
      StreamsLow.$stream_initial_input_buffer_size$.rebind( _prev_bind_2, thread );
      $kb_text_hl_prototypical_terms$.rebind( _prev_bind_0, thread );
    }
    return directory;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 2036L)
  public static SubLObject kb_text_dump_kb(final SubLObject directory)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    kb_text_dump_essential_kb( directory );
    final SubLObject _prev_bind_0 = $kb_text_hl_prototypical_terms$.currentBinding( thread );
    final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding( thread );
    final SubLObject _prev_bind_3 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding( thread );
    try
    {
      $kb_text_hl_prototypical_terms$.bind( get_hl_prototypical_terms(), thread );
      StreamsLow.$stream_initial_input_buffer_size$.bind( file_utilities.$default_big_stream_buffer_size$.getDynamicValue( thread ), thread );
      StreamsLow.$stream_initial_output_buffer_size$.bind( StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue( thread ), thread );
      kb_text_dump_unrepresented_terms( directory );
      kb_text_dump_indexing( directory );
    }
    finally
    {
      StreamsLow.$stream_initial_output_buffer_size$.rebind( _prev_bind_3, thread );
      StreamsLow.$stream_initial_input_buffer_size$.rebind( _prev_bind_2, thread );
      $kb_text_hl_prototypical_terms$.rebind( _prev_bind_0, thread );
    }
    return directory;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 2432L)
  public static SubLObject kb_text_dump_indexing(final SubLObject directory)
  {
    kb_text_dump_constant_indexing( directory );
    kb_text_dump_nart_indexing( directory );
    kb_text_dump_unrepresented_term_indexing( directory );
    return directory;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 2703L)
  public static SubLObject kb_text_dump_constants(final SubLObject directory)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject file = kb_text_dump_file( directory, $str5$constants );
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( file, $kw6$OUTPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str7$Unable_to_open__S, file );
      }
      final SubLObject s = stream;
      final SubLObject idx = constant_handles.do_constants_table();
      final SubLObject mess = $str8$Text_dumping_constants;
      final SubLObject total = id_index.id_index_count( idx );
      SubLObject sofar = ZERO_INTEGER;
      assert NIL != Types.stringp( mess ) : mess;
      final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( mess );
          final SubLObject idx_$1 = idx;
          if( NIL == id_index.id_index_objects_empty_p( idx_$1, $kw10$SKIP ) )
          {
            final SubLObject idx_$2 = idx_$1;
            if( NIL == id_index.id_index_dense_objects_empty_p( idx_$2, $kw10$SKIP ) )
            {
              final SubLObject vector_var = id_index.id_index_dense_objects( idx_$2 );
              final SubLObject backwardP_var = NIL;
              SubLObject length;
              SubLObject v_iteration;
              SubLObject id;
              SubLObject constant;
              SubLObject name;
              SubLObject suid;
              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
              {
                id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                constant = Vectors.aref( vector_var, id );
                if( NIL == id_index.id_index_tombstone_p( constant ) || NIL == id_index.id_index_skip_tombstones_p( $kw10$SKIP ) )
                {
                  if( NIL != id_index.id_index_tombstone_p( constant ) )
                  {
                    constant = $kw10$SKIP;
                  }
                  name = constants_high.constant_name( constant );
                  suid = constants_high.constant_internal_id( constant );
                  streams_high.write_string( kb_text_term_tag( constant ), s, UNPROVIDED, UNPROVIDED );
                  streams_high.write_string( $str11$_, s, UNPROVIDED, UNPROVIDED );
                  streams_high.write_string( name, s, UNPROVIDED, UNPROVIDED );
                  streams_high.write_string( $str11$_, s, UNPROVIDED, UNPROVIDED );
                  print_high.princ( suid, s );
                  streams_high.terpri( s );
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                }
              }
            }
            final SubLObject idx_$3 = idx_$1;
            if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$3 ) || NIL == id_index.id_index_skip_tombstones_p( $kw10$SKIP ) )
            {
              final SubLObject sparse = id_index.id_index_sparse_objects( idx_$3 );
              SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$3 );
              final SubLObject end_id = id_index.id_index_next_id( idx_$3 );
              final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw10$SKIP ) ) ? NIL : $kw10$SKIP;
              while ( id2.numL( end_id ))
              {
                final SubLObject constant2 = Hashtables.gethash_without_values( id2, sparse, v_default );
                if( NIL == id_index.id_index_skip_tombstones_p( $kw10$SKIP ) || NIL == id_index.id_index_tombstone_p( constant2 ) )
                {
                  final SubLObject name2 = constants_high.constant_name( constant2 );
                  final SubLObject suid2 = constants_high.constant_internal_id( constant2 );
                  streams_high.write_string( kb_text_term_tag( constant2 ), s, UNPROVIDED, UNPROVIDED );
                  streams_high.write_string( $str11$_, s, UNPROVIDED, UNPROVIDED );
                  streams_high.write_string( name2, s, UNPROVIDED, UNPROVIDED );
                  streams_high.write_string( $str11$_, s, UNPROVIDED, UNPROVIDED );
                  print_high.princ( suid2, s );
                  streams_high.terpri( s );
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                }
                id2 = Numbers.add( id2, ONE_INTEGER );
              }
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$4, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_5, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_4, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_2, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_6, thread );
      }
    }
    return directory;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 3261L)
  public static SubLObject kb_text_dump_narts(final SubLObject directory)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject file = kb_text_dump_file( directory, $str12$narts );
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( file, $kw6$OUTPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str7$Unable_to_open__S, file );
      }
      final SubLObject s = stream;
      final SubLObject idx = nart_handles.do_narts_table();
      final SubLObject mess = $str13$Text_dumping_narts;
      final SubLObject total = id_index.id_index_count( idx );
      SubLObject sofar = ZERO_INTEGER;
      assert NIL != Types.stringp( mess ) : mess;
      final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( mess );
          final SubLObject idx_$5 = idx;
          if( NIL == id_index.id_index_objects_empty_p( idx_$5, $kw10$SKIP ) )
          {
            final SubLObject idx_$6 = idx_$5;
            if( NIL == id_index.id_index_dense_objects_empty_p( idx_$6, $kw10$SKIP ) )
            {
              final SubLObject vector_var = id_index.id_index_dense_objects( idx_$6 );
              final SubLObject backwardP_var = NIL;
              SubLObject length;
              SubLObject v_iteration;
              SubLObject id;
              SubLObject nart;
              SubLObject suid;
              SubLObject formula;
              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
              {
                id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                nart = Vectors.aref( vector_var, id );
                if( NIL == id_index.id_index_tombstone_p( nart ) || NIL == id_index.id_index_skip_tombstones_p( $kw10$SKIP ) )
                {
                  if( NIL != id_index.id_index_tombstone_p( nart ) )
                  {
                    nart = $kw10$SKIP;
                  }
                  suid = nart_handles.nart_id( nart );
                  formula = kb_text_cons_id_string( narts_high.nart_hl_formula( nart ) );
                  streams_high.write_string( formula, s, UNPROVIDED, UNPROVIDED );
                  streams_high.write_string( $str11$_, s, UNPROVIDED, UNPROVIDED );
                  print_high.princ( suid, s );
                  streams_high.terpri( s );
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                }
              }
            }
            final SubLObject idx_$7 = idx_$5;
            if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$7 ) || NIL == id_index.id_index_skip_tombstones_p( $kw10$SKIP ) )
            {
              final SubLObject sparse = id_index.id_index_sparse_objects( idx_$7 );
              SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$7 );
              final SubLObject end_id = id_index.id_index_next_id( idx_$7 );
              final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw10$SKIP ) ) ? NIL : $kw10$SKIP;
              while ( id2.numL( end_id ))
              {
                final SubLObject nart2 = Hashtables.gethash_without_values( id2, sparse, v_default );
                if( NIL == id_index.id_index_skip_tombstones_p( $kw10$SKIP ) || NIL == id_index.id_index_tombstone_p( nart2 ) )
                {
                  final SubLObject suid2 = nart_handles.nart_id( nart2 );
                  final SubLObject formula2 = kb_text_cons_id_string( narts_high.nart_hl_formula( nart2 ) );
                  streams_high.write_string( formula2, s, UNPROVIDED, UNPROVIDED );
                  streams_high.write_string( $str11$_, s, UNPROVIDED, UNPROVIDED );
                  print_high.princ( suid2, s );
                  streams_high.terpri( s );
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                }
                id2 = Numbers.add( id2, ONE_INTEGER );
              }
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$8, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_5, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_4, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_2, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_6, thread );
      }
    }
    return directory;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 3699L)
  public static SubLObject kb_text_dump_assertions(final SubLObject directory)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject file = kb_text_dump_file( directory, $str14$assertions );
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( file, $kw6$OUTPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str7$Unable_to_open__S, file );
      }
      final SubLObject stream_$9 = stream;
      final SubLObject idx = assertion_handles.do_assertions_table();
      final SubLObject mess = $str15$Text_dumping_assertions;
      final SubLObject total = id_index.id_index_count( idx );
      SubLObject sofar = ZERO_INTEGER;
      assert NIL != Types.stringp( mess ) : mess;
      final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( mess );
          final SubLObject idx_$10 = idx;
          if( NIL == id_index.id_index_objects_empty_p( idx_$10, $kw10$SKIP ) )
          {
            final SubLObject idx_$11 = idx_$10;
            if( NIL == id_index.id_index_dense_objects_empty_p( idx_$11, $kw10$SKIP ) )
            {
              final SubLObject vector_var = id_index.id_index_dense_objects( idx_$11 );
              final SubLObject backwardP_var = NIL;
              SubLObject length;
              SubLObject v_iteration;
              SubLObject a_id;
              SubLObject a_handle;
              SubLObject assertion;
              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
              {
                a_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                a_handle = Vectors.aref( vector_var, a_id );
                if( NIL == id_index.id_index_tombstone_p( a_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw10$SKIP ) )
                {
                  if( NIL != id_index.id_index_tombstone_p( a_handle ) )
                  {
                    a_handle = $kw10$SKIP;
                  }
                  assertion = assertion_handles.resolve_assertion_id_value_pair( a_id, a_handle );
                  kb_text_dump_assertion_to_stream( assertion, stream_$9 );
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                }
              }
            }
            final SubLObject idx_$12 = idx_$10;
            if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$12 ) || NIL == id_index.id_index_skip_tombstones_p( $kw10$SKIP ) )
            {
              final SubLObject sparse = id_index.id_index_sparse_objects( idx_$12 );
              SubLObject a_id2 = id_index.id_index_sparse_id_threshold( idx_$12 );
              final SubLObject end_id = id_index.id_index_next_id( idx_$12 );
              final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw10$SKIP ) ) ? NIL : $kw10$SKIP;
              while ( a_id2.numL( end_id ))
              {
                final SubLObject a_handle2 = Hashtables.gethash_without_values( a_id2, sparse, v_default );
                if( NIL == id_index.id_index_skip_tombstones_p( $kw10$SKIP ) || NIL == id_index.id_index_tombstone_p( a_handle2 ) )
                {
                  final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair( a_id2, a_handle2 );
                  kb_text_dump_assertion_to_stream( assertion2, stream_$9 );
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
          final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$13, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_5, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_4, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_2, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_6, thread );
      }
    }
    return directory;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 3996L)
  public static SubLObject kb_text_dump_meta_assertions(final SubLObject filename, SubLObject test, SubLObject limit)
  {
    if( test == UNPROVIDED )
    {
      test = IDENTITY;
    }
    if( limit == UNPROVIDED )
    {
      limit = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( filename, $kw6$OUTPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str7$Unable_to_open__S, filename );
      }
      final SubLObject stream_$14 = stream;
      result = kb_text_dump_meta_assertions_to_stream( stream_$14, test, limit );
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 4386L)
  public static SubLObject kb_text_dump_meta_assertions_to_stream(final SubLObject stream, SubLObject test, SubLObject limit)
  {
    if( test == UNPROVIDED )
    {
      test = IDENTITY;
    }
    if( limit == UNPROVIDED )
    {
      limit = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.streamp( stream ) : stream;
    SubLObject total = ZERO_INTEGER;
    SubLObject doneP = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym17$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const18$EverythingPSC, thread );
      final SubLObject total_$15 = kb_indexing_datastructures.assertions_with_meta_assertions_count();
      SubLObject sofar = ZERO_INTEGER;
      final SubLObject _prev_bind_0_$16 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_1_$17 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
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
          utilities_macros.noting_percent_progress_preamble( $str19$Mapping_meta_assertions );
          final SubLObject iterator_var = kb_indexing_datastructures.new_assertions_with_meta_assertions_iterator();
          SubLObject valid;
          for( SubLObject done_var = doneP; NIL == done_var; done_var = makeBoolean( NIL == valid || NIL != doneP ) )
          {
            thread.resetMultipleValues();
            final SubLObject non_meta = iteration.iteration_next( iterator_var );
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if( NIL != valid )
            {
              if( NIL != kb_mapping_macros.do_term_index_key_validator( non_meta, NIL ) )
              {
                final SubLObject iterator_var_$18 = kb_mapping_macros.new_term_final_index_spec_iterator( non_meta, NIL );
                SubLObject done_var_$19 = doneP;
                final SubLObject token_var = NIL;
                while ( NIL == done_var_$19)
                {
                  final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var_$18, token_var );
                  final SubLObject valid_$20 = makeBoolean( !token_var.eql( final_index_spec ) );
                  if( NIL != valid_$20 )
                  {
                    SubLObject final_index_iterator = NIL;
                    try
                    {
                      final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, NIL, NIL, NIL );
                      SubLObject done_var_$20 = doneP;
                      final SubLObject token_var_$22 = NIL;
                      while ( NIL == done_var_$20)
                      {
                        final SubLObject meta = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$22 );
                        final SubLObject valid_$21 = makeBoolean( !token_var_$22.eql( meta ) );
                        if( NIL != valid_$21 && NIL != kb_mapping_macros.do_term_index_assertion_match_p( meta, final_index_spec ) && NIL != Functions.funcall( test, meta ) )
                        {
                          kb_text_dump_assertion_to_stream( meta, stream );
                          total = Numbers.add( total, ONE_INTEGER );
                          if( NIL != limit )
                          {
                            doneP = Numbers.numGE( total, limit );
                          }
                        }
                        done_var_$20 = makeBoolean( NIL == valid_$21 || NIL != doneP );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$17, thread );
                      }
                    }
                  }
                  done_var_$19 = makeBoolean( NIL == valid_$20 || NIL != doneP );
                }
              }
              sofar = Numbers.add( sofar, ONE_INTEGER );
              utilities_macros.note_percent_progress( sofar, total_$15 );
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$18, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1_$17, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$16, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return total;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 5017L)
  public static SubLObject kb_text_dump_assertion_to_stream(final SubLObject assertion, final SubLObject stream)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    final SubLObject suid = assertion_handles.assertion_id( assertion );
    final SubLObject elmt = kb_text_compact_hl_external_id_string_cached( uncanonicalizer.assertion_elmt( assertion ) );
    final SubLObject sentence = kb_text_cons_id_string( assertions_high.assertion_cnf( assertion ) );
    PrintLow.format( stream, $str21$_A_, suid );
    streams_high.write_string( elmt, stream, UNPROVIDED, UNPROVIDED );
    streams_high.write_string( $str11$_, stream, UNPROVIDED, UNPROVIDED );
    streams_high.write_string( sentence, stream, UNPROVIDED, UNPROVIDED );
    streams_high.write_string( $str11$_, stream, UNPROVIDED, UNPROVIDED );
    streams_high.terpri( stream );
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 5509L)
  public static SubLObject kb_text_dump_deductions(final SubLObject directory)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject file = kb_text_dump_file( directory, $str22$deductions );
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( file, $kw6$OUTPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str7$Unable_to_open__S, file );
      }
      final SubLObject s = stream;
      final SubLObject idx = deduction_handles.do_deductions_table();
      final SubLObject mess = $str23$Text_dumping_deductions;
      final SubLObject total = id_index.id_index_count( idx );
      SubLObject sofar = ZERO_INTEGER;
      assert NIL != Types.stringp( mess ) : mess;
      final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( mess );
          final SubLObject idx_$26 = idx;
          if( NIL == id_index.id_index_objects_empty_p( idx_$26, $kw10$SKIP ) )
          {
            final SubLObject idx_$27 = idx_$26;
            if( NIL == id_index.id_index_dense_objects_empty_p( idx_$27, $kw10$SKIP ) )
            {
              final SubLObject vector_var = id_index.id_index_dense_objects( idx_$27 );
              final SubLObject backwardP_var = NIL;
              SubLObject length;
              SubLObject v_iteration;
              SubLObject d_id;
              SubLObject d_handle;
              SubLObject d;
              SubLObject id;
              SubLObject supported_object;
              SubLObject supported_recipe;
              SubLObject support_recipes;
              SubLObject truth;
              SubLObject strength;
              SubLObject cdolist_list_var;
              SubLObject support_item;
              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
              {
                d_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                d_handle = Vectors.aref( vector_var, d_id );
                if( NIL == id_index.id_index_tombstone_p( d_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw10$SKIP ) )
                {
                  if( NIL != id_index.id_index_tombstone_p( d_handle ) )
                  {
                    d_handle = $kw10$SKIP;
                  }
                  d = deduction_handles.resolve_deduction_id_value_pair( d_id, d_handle );
                  id = deduction_handles.deduction_id( d );
                  supported_object = deductions_interface.kb_deduction_supported_object( d );
                  supported_recipe = kb_text_convert_deduction_support_to_recipe( supported_object );
                  support_recipes = ( NIL != assertion_handles.assertion_p( supported_object ) ) ? kb_text_convert_deduction_supports_to_support_recipe( deductions_interface.kb_deduction_supports( d ) ) : NIL;
                  truth = deductions_interface.kb_deduction_truth( d );
                  strength = deductions_interface.kb_deduction_strength( d );
                  PrintLow.format( s, $str24$_A__A__A__A, new SubLObject[] { id, supported_recipe, truth, strength
                  } );
                  cdolist_list_var = support_recipes;
                  support_item = NIL;
                  support_item = cdolist_list_var.first();
                  while ( NIL != cdolist_list_var)
                  {
                    print_high.princ( $str11$_, s );
                    print_high.princ( support_item, s );
                    cdolist_list_var = cdolist_list_var.rest();
                    support_item = cdolist_list_var.first();
                  }
                  streams_high.terpri( s );
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                }
              }
            }
            final SubLObject idx_$28 = idx_$26;
            if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$28 ) || NIL == id_index.id_index_skip_tombstones_p( $kw10$SKIP ) )
            {
              final SubLObject sparse = id_index.id_index_sparse_objects( idx_$28 );
              SubLObject d_id2 = id_index.id_index_sparse_id_threshold( idx_$28 );
              final SubLObject end_id = id_index.id_index_next_id( idx_$28 );
              final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw10$SKIP ) ) ? NIL : $kw10$SKIP;
              while ( d_id2.numL( end_id ))
              {
                final SubLObject d_handle2 = Hashtables.gethash_without_values( d_id2, sparse, v_default );
                if( NIL == id_index.id_index_skip_tombstones_p( $kw10$SKIP ) || NIL == id_index.id_index_tombstone_p( d_handle2 ) )
                {
                  final SubLObject d2 = deduction_handles.resolve_deduction_id_value_pair( d_id2, d_handle2 );
                  final SubLObject id2 = deduction_handles.deduction_id( d2 );
                  final SubLObject supported_object2 = deductions_interface.kb_deduction_supported_object( d2 );
                  final SubLObject supported_recipe2 = kb_text_convert_deduction_support_to_recipe( supported_object2 );
                  final SubLObject support_recipes2 = ( NIL != assertion_handles.assertion_p( supported_object2 ) ) ? kb_text_convert_deduction_supports_to_support_recipe( deductions_interface.kb_deduction_supports(
                      d2 ) ) : NIL;
                  final SubLObject truth2 = deductions_interface.kb_deduction_truth( d2 );
                  final SubLObject strength2 = deductions_interface.kb_deduction_strength( d2 );
                  PrintLow.format( s, $str24$_A__A__A__A, new SubLObject[] { id2, supported_recipe2, truth2, strength2
                  } );
                  SubLObject cdolist_list_var2 = support_recipes2;
                  SubLObject support_item2 = NIL;
                  support_item2 = cdolist_list_var2.first();
                  while ( NIL != cdolist_list_var2)
                  {
                    print_high.princ( $str11$_, s );
                    print_high.princ( support_item2, s );
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    support_item2 = cdolist_list_var2.first();
                  }
                  streams_high.terpri( s );
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                }
                d_id2 = Numbers.add( d_id2, ONE_INTEGER );
              }
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$29 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$29, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_5, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_4, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_2, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_6, thread );
      }
    }
    return directory;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 6481L)
  public static SubLObject kb_text_dump_kb_hl_supports(final SubLObject directory)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject file = kb_text_dump_file( directory, $str25$kb_hl_supports );
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( file, $kw6$OUTPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str7$Unable_to_open__S, file );
      }
      final SubLObject s = stream;
      final SubLObject idx = kb_hl_support_handles.do_kb_hl_supports_table();
      final SubLObject mess = $str26$Text_dumping_KB_HL_supports;
      final SubLObject total = id_index.id_index_count( idx );
      SubLObject sofar = ZERO_INTEGER;
      assert NIL != Types.stringp( mess ) : mess;
      final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( mess );
          final SubLObject idx_$30 = idx;
          if( NIL == id_index.id_index_objects_empty_p( idx_$30, $kw10$SKIP ) )
          {
            final SubLObject idx_$31 = idx_$30;
            if( NIL == id_index.id_index_dense_objects_empty_p( idx_$31, $kw10$SKIP ) )
            {
              final SubLObject vector_var = id_index.id_index_dense_objects( idx_$31 );
              final SubLObject backwardP_var = NIL;
              SubLObject length;
              SubLObject v_iteration;
              SubLObject s_id;
              SubLObject s_handle;
              SubLObject hl_support;
              SubLObject module;
              SubLObject elmt;
              SubLObject sentence;
              SubLObject tv;
              SubLObject support;
              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
              {
                s_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                s_handle = Vectors.aref( vector_var, s_id );
                if( NIL == id_index.id_index_tombstone_p( s_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw10$SKIP ) )
                {
                  if( NIL != id_index.id_index_tombstone_p( s_handle ) )
                  {
                    s_handle = $kw10$SKIP;
                  }
                  hl_support = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair( s_id, s_handle );
                  module = kb_hl_supports_high.kb_hl_support_module( hl_support );
                  elmt = kb_text_compact_hl_external_id_string_cached( cycl_utilities.hl_to_el( kb_hl_supports_high.kb_hl_support_mt( hl_support ) ) );
                  sentence = kb_text_cons_id_string( kb_hl_supports_high.kb_hl_support_el_sentence( hl_support ) );
                  tv = kb_hl_supports_high.kb_hl_support_tv( hl_support );
                  support = kb_text_cons_id_string( kb_hl_supports_high.kb_hl_support_hl_support( hl_support ) );
                  print_high.princ( module, s );
                  streams_high.write_string( $str11$_, s, UNPROVIDED, UNPROVIDED );
                  streams_high.write_string( sentence, s, UNPROVIDED, UNPROVIDED );
                  streams_high.write_string( $str11$_, s, UNPROVIDED, UNPROVIDED );
                  streams_high.write_string( elmt, s, UNPROVIDED, UNPROVIDED );
                  streams_high.write_string( $str11$_, s, UNPROVIDED, UNPROVIDED );
                  print_high.princ( tv, s );
                  streams_high.write_string( $str11$_, s, UNPROVIDED, UNPROVIDED );
                  streams_high.write_string( support, s, UNPROVIDED, UNPROVIDED );
                  streams_high.terpri( s );
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                }
              }
            }
            final SubLObject idx_$32 = idx_$30;
            if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$32 ) || NIL == id_index.id_index_skip_tombstones_p( $kw10$SKIP ) )
            {
              final SubLObject sparse = id_index.id_index_sparse_objects( idx_$32 );
              SubLObject s_id2 = id_index.id_index_sparse_id_threshold( idx_$32 );
              final SubLObject end_id = id_index.id_index_next_id( idx_$32 );
              final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw10$SKIP ) ) ? NIL : $kw10$SKIP;
              while ( s_id2.numL( end_id ))
              {
                final SubLObject s_handle2 = Hashtables.gethash_without_values( s_id2, sparse, v_default );
                if( NIL == id_index.id_index_skip_tombstones_p( $kw10$SKIP ) || NIL == id_index.id_index_tombstone_p( s_handle2 ) )
                {
                  final SubLObject hl_support2 = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair( s_id2, s_handle2 );
                  final SubLObject module2 = kb_hl_supports_high.kb_hl_support_module( hl_support2 );
                  final SubLObject elmt2 = kb_text_compact_hl_external_id_string_cached( cycl_utilities.hl_to_el( kb_hl_supports_high.kb_hl_support_mt( hl_support2 ) ) );
                  final SubLObject sentence2 = kb_text_cons_id_string( kb_hl_supports_high.kb_hl_support_el_sentence( hl_support2 ) );
                  final SubLObject tv2 = kb_hl_supports_high.kb_hl_support_tv( hl_support2 );
                  final SubLObject support2 = kb_text_cons_id_string( kb_hl_supports_high.kb_hl_support_hl_support( hl_support2 ) );
                  print_high.princ( module2, s );
                  streams_high.write_string( $str11$_, s, UNPROVIDED, UNPROVIDED );
                  streams_high.write_string( sentence2, s, UNPROVIDED, UNPROVIDED );
                  streams_high.write_string( $str11$_, s, UNPROVIDED, UNPROVIDED );
                  streams_high.write_string( elmt2, s, UNPROVIDED, UNPROVIDED );
                  streams_high.write_string( $str11$_, s, UNPROVIDED, UNPROVIDED );
                  print_high.princ( tv2, s );
                  streams_high.write_string( $str11$_, s, UNPROVIDED, UNPROVIDED );
                  streams_high.write_string( support2, s, UNPROVIDED, UNPROVIDED );
                  streams_high.terpri( s );
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                }
                s_id2 = Numbers.add( s_id2, ONE_INTEGER );
              }
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$33 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$33, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_5, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_4, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_2, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_6, thread );
      }
    }
    return directory;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 7464L)
  public static SubLObject kb_text_dump_unrepresented_terms(final SubLObject directory)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject file = kb_text_dump_file( directory, $str27$unrepresented_terms );
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( file, $kw6$OUTPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str7$Unable_to_open__S, file );
      }
      final SubLObject s = stream;
      final SubLObject str = $str28$Text_dumping_unrepresented_terms;
      final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$progress_notification_count$.currentBinding( thread );
      final SubLObject _prev_bind_6 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
      final SubLObject _prev_bind_7 = utilities_macros.$progress_count$.currentBinding( thread );
      final SubLObject _prev_bind_8 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
      final SubLObject _prev_bind_9 = utilities_macros.$silent_progressP$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
        utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
        utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
        utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
        utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
        utilities_macros.$is_noting_progressP$.bind( T, thread );
        utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
        utilities_macros.noting_progress_preamble( str );
        final SubLObject iterator_var = unrepresented_terms.new_unrepresented_terms_iterator();
        SubLObject valid;
        for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
        {
          thread.resetMultipleValues();
          final SubLObject v_term = iteration.iteration_next( iterator_var );
          valid = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( NIL != valid )
          {
            final SubLObject suid = Functions.funcall( $sym29$LOOKUP_UNREPRESENTED_TERM_SUID, v_term );
            print_high.princ( v_term, s );
            streams_high.write_string( $str11$_, s, UNPROVIDED, UNPROVIDED );
            print_high.princ( suid, s );
            streams_high.terpri( s );
          }
        }
        utilities_macros.noting_progress_postamble();
      }
      finally
      {
        utilities_macros.$silent_progressP$.rebind( _prev_bind_9, thread );
        utilities_macros.$is_noting_progressP$.rebind( _prev_bind_8, thread );
        utilities_macros.$progress_count$.rebind( _prev_bind_7, thread );
        utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_6, thread );
        utilities_macros.$progress_notification_count$.rebind( _prev_bind_5, thread );
        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_4, thread );
        utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_3, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_10 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_10, thread );
      }
    }
    return directory;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 7995L)
  public static SubLObject kb_text_dump_index_assertion(final SubLObject s, final SubLObject assertion)
  {
    return print_high.princ( assertion_handles.assertion_id( assertion ), s );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 8099L)
  public static SubLObject kb_text_dump_constant_indexing(final SubLObject directory)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject file = kb_text_dump_file( directory, $str30$constant_indexing );
    final SubLObject tag_stack = stacks.create_stack();
    thread.resetMultipleValues();
    final SubLObject visitor = new_kb_text_dump_complex_visitor( tag_stack );
    final SubLObject parameters = thread.secondMultipleValue();
    thread.resetMultipleValues();
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( file, $kw6$OUTPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str7$Unable_to_open__S, file );
      }
      final SubLObject s = stream;
      conses_high.putf( parameters, $kw31$STREAM, s );
      final SubLObject idx = constant_handles.do_constants_table();
      final SubLObject mess = $str32$Text_dumping_constant_indexing;
      final SubLObject total = id_index.id_index_count( idx );
      SubLObject sofar = ZERO_INTEGER;
      assert NIL != Types.stringp( mess ) : mess;
      final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( mess );
          final SubLObject idx_$34 = idx;
          if( NIL == id_index.id_index_objects_empty_p( idx_$34, $kw10$SKIP ) )
          {
            final SubLObject idx_$35 = idx_$34;
            if( NIL == id_index.id_index_dense_objects_empty_p( idx_$35, $kw10$SKIP ) )
            {
              final SubLObject vector_var = id_index.id_index_dense_objects( idx_$35 );
              final SubLObject backwardP_var = NIL;
              SubLObject length;
              SubLObject v_iteration;
              SubLObject id;
              SubLObject constant;
              SubLObject index;
              SubLObject tag;
              SubLObject cdolist_list_var;
              SubLObject assertion;
              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
              {
                id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                constant = Vectors.aref( vector_var, id );
                if( NIL == id_index.id_index_tombstone_p( constant ) || NIL == id_index.id_index_skip_tombstones_p( $kw10$SKIP ) )
                {
                  if( NIL != id_index.id_index_tombstone_p( constant ) )
                  {
                    constant = $kw10$SKIP;
                  }
                  index = kb_indexing_datastructures.term_index( constant );
                  tag = kb_text_term_tag( constant );
                  if( NIL != kb_indexing_datastructures.simple_index_p( index ) )
                  {
                    cdolist_list_var = kb_text_sorted_term_assertion_list( constant );
                    assertion = NIL;
                    assertion = cdolist_list_var.first();
                    while ( NIL != cdolist_list_var)
                    {
                      streams_high.write_string( tag, s, UNPROVIDED, UNPROVIDED );
                      streams_high.write_string( $str11$_, s, UNPROVIDED, UNPROVIDED );
                      kb_text_dump_index_assertion( s, assertion );
                      streams_high.terpri( s );
                      cdolist_list_var = cdolist_list_var.rest();
                      assertion = cdolist_list_var.first();
                    }
                  }
                  else if( NIL != kb_indexing_datastructures.complex_index_p( index ) )
                  {
                    stacks.clear_stack( tag_stack );
                    stacks.stack_push( tag, tag_stack );
                    indexing_utilities.visit_complex_index( index, visitor );
                  }
                  else
                  {
                    Errors.error( $str33$Unsupported_index_type__A___, index );
                  }
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                }
              }
            }
            final SubLObject idx_$36 = idx_$34;
            if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$36 ) || NIL == id_index.id_index_skip_tombstones_p( $kw10$SKIP ) )
            {
              final SubLObject sparse = id_index.id_index_sparse_objects( idx_$36 );
              SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$36 );
              final SubLObject end_id = id_index.id_index_next_id( idx_$36 );
              final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw10$SKIP ) ) ? NIL : $kw10$SKIP;
              while ( id2.numL( end_id ))
              {
                final SubLObject constant2 = Hashtables.gethash_without_values( id2, sparse, v_default );
                if( NIL == id_index.id_index_skip_tombstones_p( $kw10$SKIP ) || NIL == id_index.id_index_tombstone_p( constant2 ) )
                {
                  final SubLObject index2 = kb_indexing_datastructures.term_index( constant2 );
                  final SubLObject tag2 = kb_text_term_tag( constant2 );
                  if( NIL != kb_indexing_datastructures.simple_index_p( index2 ) )
                  {
                    SubLObject cdolist_list_var2 = kb_text_sorted_term_assertion_list( constant2 );
                    SubLObject assertion2 = NIL;
                    assertion2 = cdolist_list_var2.first();
                    while ( NIL != cdolist_list_var2)
                    {
                      streams_high.write_string( tag2, s, UNPROVIDED, UNPROVIDED );
                      streams_high.write_string( $str11$_, s, UNPROVIDED, UNPROVIDED );
                      kb_text_dump_index_assertion( s, assertion2 );
                      streams_high.terpri( s );
                      cdolist_list_var2 = cdolist_list_var2.rest();
                      assertion2 = cdolist_list_var2.first();
                    }
                  }
                  else if( NIL != kb_indexing_datastructures.complex_index_p( index2 ) )
                  {
                    stacks.clear_stack( tag_stack );
                    stacks.stack_push( tag2, tag_stack );
                    indexing_utilities.visit_complex_index( index2, visitor );
                  }
                  else
                  {
                    Errors.error( $str33$Unsupported_index_type__A___, index2 );
                  }
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                }
                id2 = Numbers.add( id2, ONE_INTEGER );
              }
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$37 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$37, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_5, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_4, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_2, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_6, thread );
      }
    }
    return directory;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 9180L)
  public static SubLObject kb_text_dump_nart_indexing(final SubLObject directory)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject file = kb_text_dump_file( directory, $str34$nart_indexing );
    final SubLObject tag_stack = stacks.create_stack();
    thread.resetMultipleValues();
    final SubLObject visitor = new_kb_text_dump_complex_visitor( tag_stack );
    final SubLObject parameters = thread.secondMultipleValue();
    thread.resetMultipleValues();
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( file, $kw6$OUTPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str7$Unable_to_open__S, file );
      }
      final SubLObject s = stream;
      conses_high.putf( parameters, $kw31$STREAM, s );
      final SubLObject idx = nart_handles.do_narts_table();
      final SubLObject mess = $str35$Text_dumping_NAT_indexing;
      final SubLObject total = id_index.id_index_count( idx );
      SubLObject sofar = ZERO_INTEGER;
      assert NIL != Types.stringp( mess ) : mess;
      final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( mess );
          final SubLObject idx_$38 = idx;
          if( NIL == id_index.id_index_objects_empty_p( idx_$38, $kw10$SKIP ) )
          {
            final SubLObject idx_$39 = idx_$38;
            if( NIL == id_index.id_index_dense_objects_empty_p( idx_$39, $kw10$SKIP ) )
            {
              final SubLObject vector_var = id_index.id_index_dense_objects( idx_$39 );
              final SubLObject backwardP_var = NIL;
              SubLObject length;
              SubLObject v_iteration;
              SubLObject id;
              SubLObject nart;
              SubLObject index;
              SubLObject tag;
              SubLObject cdolist_list_var;
              SubLObject assertion;
              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
              {
                id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                nart = Vectors.aref( vector_var, id );
                if( NIL == id_index.id_index_tombstone_p( nart ) || NIL == id_index.id_index_skip_tombstones_p( $kw10$SKIP ) )
                {
                  if( NIL != id_index.id_index_tombstone_p( nart ) )
                  {
                    nart = $kw10$SKIP;
                  }
                  index = kb_indexing_datastructures.term_index( nart );
                  tag = kb_text_term_tag( nart );
                  if( NIL != kb_indexing_datastructures.simple_index_p( index ) )
                  {
                    cdolist_list_var = kb_text_sorted_term_assertion_list( nart );
                    assertion = NIL;
                    assertion = cdolist_list_var.first();
                    while ( NIL != cdolist_list_var)
                    {
                      streams_high.write_string( tag, s, UNPROVIDED, UNPROVIDED );
                      streams_high.write_string( $str11$_, s, UNPROVIDED, UNPROVIDED );
                      kb_text_dump_index_assertion( s, assertion );
                      streams_high.terpri( s );
                      cdolist_list_var = cdolist_list_var.rest();
                      assertion = cdolist_list_var.first();
                    }
                  }
                  else if( NIL != kb_indexing_datastructures.complex_index_p( index ) )
                  {
                    stacks.clear_stack( tag_stack );
                    stacks.stack_push( tag, tag_stack );
                    indexing_utilities.visit_complex_index( index, visitor );
                  }
                  else
                  {
                    Errors.error( $str33$Unsupported_index_type__A___, index );
                  }
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                }
              }
            }
            final SubLObject idx_$40 = idx_$38;
            if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$40 ) || NIL == id_index.id_index_skip_tombstones_p( $kw10$SKIP ) )
            {
              final SubLObject sparse = id_index.id_index_sparse_objects( idx_$40 );
              SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$40 );
              final SubLObject end_id = id_index.id_index_next_id( idx_$40 );
              final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw10$SKIP ) ) ? NIL : $kw10$SKIP;
              while ( id2.numL( end_id ))
              {
                final SubLObject nart2 = Hashtables.gethash_without_values( id2, sparse, v_default );
                if( NIL == id_index.id_index_skip_tombstones_p( $kw10$SKIP ) || NIL == id_index.id_index_tombstone_p( nart2 ) )
                {
                  final SubLObject index2 = kb_indexing_datastructures.term_index( nart2 );
                  final SubLObject tag2 = kb_text_term_tag( nart2 );
                  if( NIL != kb_indexing_datastructures.simple_index_p( index2 ) )
                  {
                    SubLObject cdolist_list_var2 = kb_text_sorted_term_assertion_list( nart2 );
                    SubLObject assertion2 = NIL;
                    assertion2 = cdolist_list_var2.first();
                    while ( NIL != cdolist_list_var2)
                    {
                      streams_high.write_string( tag2, s, UNPROVIDED, UNPROVIDED );
                      streams_high.write_string( $str11$_, s, UNPROVIDED, UNPROVIDED );
                      kb_text_dump_index_assertion( s, assertion2 );
                      streams_high.terpri( s );
                      cdolist_list_var2 = cdolist_list_var2.rest();
                      assertion2 = cdolist_list_var2.first();
                    }
                  }
                  else if( NIL != kb_indexing_datastructures.complex_index_p( index2 ) )
                  {
                    stacks.clear_stack( tag_stack );
                    stacks.stack_push( tag2, tag_stack );
                    indexing_utilities.visit_complex_index( index2, visitor );
                  }
                  else
                  {
                    Errors.error( $str33$Unsupported_index_type__A___, index2 );
                  }
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                }
                id2 = Numbers.add( id2, ONE_INTEGER );
              }
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$41 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$41, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_5, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_4, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_2, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_6, thread );
      }
    }
    return directory;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 10226L)
  public static SubLObject kb_text_dump_unrepresented_term_indexing(final SubLObject directory)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject file = kb_text_dump_file( directory, $str36$unrepresented_term_indexing );
    final SubLObject tag_stack = stacks.create_stack();
    thread.resetMultipleValues();
    final SubLObject visitor = new_kb_text_dump_complex_visitor( tag_stack );
    final SubLObject parameters = thread.secondMultipleValue();
    thread.resetMultipleValues();
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( file, $kw6$OUTPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str7$Unable_to_open__S, file );
      }
      final SubLObject s = stream;
      conses_high.putf( parameters, $kw31$STREAM, s );
      if( NIL != unrepresented_terms.use_unrepresented_term_fhtP() )
      {
        SubLObject msg = Sequences.cconcatenate( $str37$Text_dumping_unrepresented_term_i, $str38$____Old_Space );
        SubLObject release = NIL;
        try
        {
          release = Locks.seize_lock( unrepresented_terms.$unrepresented_term_fht_lock$.getGlobalValue() );
          final SubLObject table_var = unrepresented_terms.get_unrepresented_term_fht();
          utilities_macros.$progress_note$.setDynamicValue( msg, thread );
          utilities_macros.$progress_start_time$.setDynamicValue( Time.get_universal_time(), thread );
          utilities_macros.$progress_total$.setDynamicValue( file_hash_table.file_hash_table_count( table_var ), thread );
          utilities_macros.$progress_sofar$.setDynamicValue( ZERO_INTEGER, thread );
          final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
          final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
          final SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
          final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
          try
          {
            utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
            utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
            utilities_macros.$within_noting_percent_progress$.bind( T, thread );
            utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
            try
            {
              utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
              SubLObject continuation = NIL;
              SubLObject next;
              for( SubLObject completeP = NIL; NIL == completeP; completeP = Types.sublisp_null( next ) )
              {
                thread.resetMultipleValues();
                final SubLObject the_key = file_hash_table.get_file_hash_table_any( table_var, continuation, NIL );
                final SubLObject the_value = thread.secondMultipleValue();
                next = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if( NIL != next )
                {
                  final SubLObject key = the_key;
                  final SubLObject v_term = the_value;
                  utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
                  utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
                  if( NIL == unrepresented_terms.deleted_unrepresented_term_itemP( key ) && NIL != unrepresented_terms.fht_suid_item_p( key ) )
                  {
                    final SubLObject id = unrepresented_terms.get_fht_suid_item_suid( key );
                    final SubLObject index = kb_indexing_datastructures.term_index( v_term );
                    final SubLObject tag = kb_text_term_tag( v_term );
                    if( NIL != kb_indexing_datastructures.simple_index_p( index ) )
                    {
                      SubLObject cdolist_list_var = kb_text_sorted_term_assertion_list( v_term );
                      SubLObject assertion = NIL;
                      assertion = cdolist_list_var.first();
                      while ( NIL != cdolist_list_var)
                      {
                        streams_high.write_string( tag, s, UNPROVIDED, UNPROVIDED );
                        streams_high.write_string( $str11$_, s, UNPROVIDED, UNPROVIDED );
                        kb_text_dump_index_assertion( s, assertion );
                        streams_high.terpri( s );
                        cdolist_list_var = cdolist_list_var.rest();
                        assertion = cdolist_list_var.first();
                      }
                    }
                    else if( NIL != kb_indexing_datastructures.complex_index_p( index ) )
                    {
                      stacks.clear_stack( tag_stack );
                      stacks.stack_push( tag, tag_stack );
                      indexing_utilities.visit_complex_index( index, visitor );
                    }
                    else
                    {
                      Errors.error( $str33$Unsupported_index_type__A___, index );
                    }
                  }
                }
                continuation = next;
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$42 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                utilities_macros.noting_percent_progress_postamble();
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$42, thread );
              }
            }
          }
          finally
          {
            utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_5, thread );
            utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_4, thread );
            utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_3, thread );
            utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_2, thread );
          }
        }
        finally
        {
          if( NIL != release )
          {
            Locks.release_lock( unrepresented_terms.$unrepresented_term_fht_lock$.getGlobalValue() );
          }
        }
        msg = Sequences.cconcatenate( $str37$Text_dumping_unrepresented_term_i, $str39$____New_Space );
        if( NIL != unrepresented_terms.use_unrepresented_term_fhtP() )
        {
          final SubLObject list_var = unrepresented_terms.get_unrepresented_term_new_space_ascending_suid_keys();
          final SubLObject _prev_bind_2 = utilities_macros.$progress_note$.currentBinding( thread );
          final SubLObject _prev_bind_3 = utilities_macros.$progress_start_time$.currentBinding( thread );
          final SubLObject _prev_bind_4 = utilities_macros.$progress_total$.currentBinding( thread );
          final SubLObject _prev_bind_5 = utilities_macros.$progress_sofar$.currentBinding( thread );
          final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
          final SubLObject _prev_bind_7 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
          final SubLObject _prev_bind_8 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
          final SubLObject _prev_bind_9 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
          try
          {
            utilities_macros.$progress_note$.bind( ( NIL != msg ) ? msg : $str40$cdolist, thread );
            utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
            utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
            utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
            utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
            utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
            utilities_macros.$within_noting_percent_progress$.bind( T, thread );
            utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
            try
            {
              utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
              SubLObject csome_list_var = list_var;
              SubLObject suid_item = NIL;
              suid_item = csome_list_var.first();
              while ( NIL != csome_list_var)
              {
                final SubLObject id2 = unrepresented_terms.get_fht_suid_item_suid( suid_item );
                final SubLObject v_term2 = unrepresented_terms.find_unrepresented_term_by_suid( id2 );
                final SubLObject index = kb_indexing_datastructures.term_index( v_term2 );
                final SubLObject tag = kb_text_term_tag( v_term2 );
                if( NIL != kb_indexing_datastructures.simple_index_p( index ) )
                {
                  SubLObject cdolist_list_var = kb_text_sorted_term_assertion_list( v_term2 );
                  SubLObject assertion = NIL;
                  assertion = cdolist_list_var.first();
                  while ( NIL != cdolist_list_var)
                  {
                    streams_high.write_string( tag, s, UNPROVIDED, UNPROVIDED );
                    streams_high.write_string( $str11$_, s, UNPROVIDED, UNPROVIDED );
                    kb_text_dump_index_assertion( s, assertion );
                    streams_high.terpri( s );
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion = cdolist_list_var.first();
                  }
                }
                else if( NIL != kb_indexing_datastructures.complex_index_p( index ) )
                {
                  stacks.clear_stack( tag_stack );
                  stacks.stack_push( tag, tag_stack );
                  indexing_utilities.visit_complex_index( index, visitor );
                }
                else
                {
                  Errors.error( $str33$Unsupported_index_type__A___, index );
                }
                utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
                utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
                csome_list_var = csome_list_var.rest();
                suid_item = csome_list_var.first();
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$43 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                utilities_macros.noting_percent_progress_postamble();
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$43, thread );
              }
            }
          }
          finally
          {
            utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_9, thread );
            utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_8, thread );
            utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_7, thread );
            utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_6, thread );
            utilities_macros.$progress_sofar$.rebind( _prev_bind_5, thread );
            utilities_macros.$progress_total$.rebind( _prev_bind_4, thread );
            utilities_macros.$progress_start_time$.rebind( _prev_bind_3, thread );
            utilities_macros.$progress_note$.rebind( _prev_bind_2, thread );
          }
        }
        else
        {
          final SubLObject table_var = unrepresented_terms.do_unrepresented_terms_table();
          final SubLObject first_id_var = unrepresented_terms.new_unrepresented_term_id_threshold();
          final SubLObject total = Numbers.subtract( id_index.id_index_next_id( table_var ), first_id_var );
          SubLObject sofar = ZERO_INTEGER;
          final SubLObject _prev_bind_10 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
          final SubLObject _prev_bind_11 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
          final SubLObject _prev_bind_12 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
          final SubLObject _prev_bind_13 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
          try
          {
            utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
            utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
            utilities_macros.$within_noting_percent_progress$.bind( T, thread );
            utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
            try
            {
              utilities_macros.noting_percent_progress_preamble( msg );
              SubLObject v_term;
              SubLObject index;
              SubLObject tag;
              SubLObject cdolist_list_var;
              SubLObject assertion;
              SubLObject end_var;
              SubLObject end;
              SubLObject id3;
              SubLObject id_$44;
              for( end = ( end_var = id_index.id_index_next_id( table_var ) ), id3 = NIL, id3 = first_id_var; !id3.numGE( end_var ); id3 = number_utilities.f_1X( id3 ) )
              {
                v_term = id_index.id_index_lookup( table_var, id3, UNPROVIDED );
                if( NIL != v_term )
                {
                  utilities_macros.note_percent_progress( sofar, total );
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  id_$44 = unrepresented_terms.unrepresented_term_suid( v_term );
                  index = kb_indexing_datastructures.term_index( v_term );
                  tag = kb_text_term_tag( v_term );
                  if( NIL != kb_indexing_datastructures.simple_index_p( index ) )
                  {
                    cdolist_list_var = kb_text_sorted_term_assertion_list( v_term );
                    assertion = NIL;
                    assertion = cdolist_list_var.first();
                    while ( NIL != cdolist_list_var)
                    {
                      streams_high.write_string( tag, s, UNPROVIDED, UNPROVIDED );
                      streams_high.write_string( $str11$_, s, UNPROVIDED, UNPROVIDED );
                      kb_text_dump_index_assertion( s, assertion );
                      streams_high.terpri( s );
                      cdolist_list_var = cdolist_list_var.rest();
                      assertion = cdolist_list_var.first();
                    }
                  }
                  else if( NIL != kb_indexing_datastructures.complex_index_p( index ) )
                  {
                    stacks.clear_stack( tag_stack );
                    stacks.stack_push( tag, tag_stack );
                    indexing_utilities.visit_complex_index( index, visitor );
                  }
                  else
                  {
                    Errors.error( $str33$Unsupported_index_type__A___, index );
                  }
                }
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$44 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values3 = Values.getValuesAsVector();
                utilities_macros.noting_percent_progress_postamble();
                Values.restoreValuesFromVector( _values3 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$44, thread );
              }
            }
          }
          finally
          {
            utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_13, thread );
            utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_12, thread );
            utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_11, thread );
            utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_10, thread );
          }
        }
      }
      else
      {
        final SubLObject idx = unrepresented_terms.do_unrepresented_terms_table();
        final SubLObject mess = $str37$Text_dumping_unrepresented_term_i;
        final SubLObject total2 = id_index.id_index_count( idx );
        SubLObject sofar2 = ZERO_INTEGER;
        assert NIL != Types.stringp( mess ) : mess;
        final SubLObject _prev_bind_14 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
        final SubLObject _prev_bind_15 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
        final SubLObject _prev_bind_16 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
        final SubLObject _prev_bind_17 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
        try
        {
          utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
          utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
          utilities_macros.$within_noting_percent_progress$.bind( T, thread );
          utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
          try
          {
            utilities_macros.noting_percent_progress_preamble( mess );
            final SubLObject idx_$46 = idx;
            if( NIL == id_index.id_index_objects_empty_p( idx_$46, $kw10$SKIP ) )
            {
              final SubLObject idx_$47 = idx_$46;
              if( NIL == id_index.id_index_dense_objects_empty_p( idx_$47, $kw10$SKIP ) )
              {
                final SubLObject vector_var = id_index.id_index_dense_objects( idx_$47 );
                final SubLObject backwardP_var = NIL;
                SubLObject id;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject v_term3;
                SubLObject index2;
                SubLObject tag2;
                SubLObject cdolist_list_var2;
                SubLObject assertion2;
                for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
                {
                  id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                  v_term3 = Vectors.aref( vector_var, id );
                  if( NIL == id_index.id_index_tombstone_p( v_term3 ) || NIL == id_index.id_index_skip_tombstones_p( $kw10$SKIP ) )
                  {
                    if( NIL != id_index.id_index_tombstone_p( v_term3 ) )
                    {
                      v_term3 = $kw10$SKIP;
                    }
                    index2 = kb_indexing_datastructures.term_index( v_term3 );
                    tag2 = kb_text_term_tag( v_term3 );
                    if( NIL != kb_indexing_datastructures.simple_index_p( index2 ) )
                    {
                      cdolist_list_var2 = kb_text_sorted_term_assertion_list( v_term3 );
                      assertion2 = NIL;
                      assertion2 = cdolist_list_var2.first();
                      while ( NIL != cdolist_list_var2)
                      {
                        streams_high.write_string( tag2, s, UNPROVIDED, UNPROVIDED );
                        streams_high.write_string( $str11$_, s, UNPROVIDED, UNPROVIDED );
                        kb_text_dump_index_assertion( s, assertion2 );
                        streams_high.terpri( s );
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        assertion2 = cdolist_list_var2.first();
                      }
                    }
                    else if( NIL != kb_indexing_datastructures.complex_index_p( index2 ) )
                    {
                      stacks.clear_stack( tag_stack );
                      stacks.stack_push( tag2, tag_stack );
                      indexing_utilities.visit_complex_index( index2, visitor );
                    }
                    else
                    {
                      Errors.error( $str33$Unsupported_index_type__A___, index2 );
                    }
                    sofar2 = Numbers.add( sofar2, ONE_INTEGER );
                    utilities_macros.note_percent_progress( sofar2, total2 );
                  }
                }
              }
              final SubLObject idx_$48 = idx_$46;
              if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$48 ) || NIL == id_index.id_index_skip_tombstones_p( $kw10$SKIP ) )
              {
                final SubLObject sparse = id_index.id_index_sparse_objects( idx_$48 );
                SubLObject id4 = id_index.id_index_sparse_id_threshold( idx_$48 );
                final SubLObject end_id = id_index.id_index_next_id( idx_$48 );
                final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw10$SKIP ) ) ? NIL : $kw10$SKIP;
                while ( id4.numL( end_id ))
                {
                  final SubLObject v_term2 = Hashtables.gethash_without_values( id4, sparse, v_default );
                  if( NIL == id_index.id_index_skip_tombstones_p( $kw10$SKIP ) || NIL == id_index.id_index_tombstone_p( v_term2 ) )
                  {
                    final SubLObject index = kb_indexing_datastructures.term_index( v_term2 );
                    final SubLObject tag = kb_text_term_tag( v_term2 );
                    if( NIL != kb_indexing_datastructures.simple_index_p( index ) )
                    {
                      SubLObject cdolist_list_var = kb_text_sorted_term_assertion_list( v_term2 );
                      SubLObject assertion = NIL;
                      assertion = cdolist_list_var.first();
                      while ( NIL != cdolist_list_var)
                      {
                        streams_high.write_string( tag, s, UNPROVIDED, UNPROVIDED );
                        streams_high.write_string( $str11$_, s, UNPROVIDED, UNPROVIDED );
                        kb_text_dump_index_assertion( s, assertion );
                        streams_high.terpri( s );
                        cdolist_list_var = cdolist_list_var.rest();
                        assertion = cdolist_list_var.first();
                      }
                    }
                    else if( NIL != kb_indexing_datastructures.complex_index_p( index ) )
                    {
                      stacks.clear_stack( tag_stack );
                      stacks.stack_push( tag, tag_stack );
                      indexing_utilities.visit_complex_index( index, visitor );
                    }
                    else
                    {
                      Errors.error( $str33$Unsupported_index_type__A___, index );
                    }
                    sofar2 = Numbers.add( sofar2, ONE_INTEGER );
                    utilities_macros.note_percent_progress( sofar2, total2 );
                  }
                  id4 = Numbers.add( id4, ONE_INTEGER );
                }
              }
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$45 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values4 = Values.getValuesAsVector();
              utilities_macros.noting_percent_progress_postamble();
              Values.restoreValuesFromVector( _values4 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$45, thread );
            }
          }
        }
        finally
        {
          utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_17, thread );
          utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_16, thread );
          utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_15, thread );
          utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_14, thread );
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_18 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values5 = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values5 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_18, thread );
      }
    }
    return directory;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 11351L)
  public static SubLObject kb_text_sorted_term_assertion_list(final SubLObject v_term)
  {
    final SubLObject raw_assertions = kb_indexing_datastructures.simple_term_assertion_list( v_term );
    final SubLObject sorted_assertions = assertion_utilities.sort_assertions( conses_high.copy_list( raw_assertions ) );
    return sorted_assertions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 11578L)
  public static SubLObject new_kb_text_dump_complex_visitor(final SubLObject tag_stack)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject parameters = ConsesLow.list( $kw31$STREAM, StreamsLow.$standard_output$.getDynamicValue( thread ), $kw41$PATH, tag_stack );
    final SubLObject visitor = indexing_utilities.new_complex_index_visitor( $sym42$KB_TEXT_DUMP_COMPINX_VISIT_BEGIN_VISIT, $sym43$KB_TEXT_DUMP_COMPINX_VISIT_BEGIN_SUBINDEX, $sym44$KB_TEXT_DUMP_COMPINX_VISIT_FINAL_INDEX,
        $sym45$KB_TEXT_DUMP_COMPINX_VISIT_END_SUBINDEX, $sym46$KB_TEXT_DUMP_COMPINX_VISIT_END_VISIT, parameters );
    return Values.values( visitor, parameters );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 12153L)
  public static SubLObject kb_text_term_tag(final SubLObject v_term)
  {
    if( NIL != constant_handles.constant_p( v_term ) )
    {
      return ( NIL != kb_text_hl_prototypical_termP( v_term ) ) ? constants_high.constant_name( v_term ) : Guids.guid_to_string( constants_high.constant_external_id( v_term ) );
    }
    if( v_term.isCons() )
    {
      return kb_text_cons_id_string( v_term );
    }
    return kb_text_compact_hl_external_id_string( v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 12496L)
  public static SubLObject kb_text_dump_compinx_visit_begin_visit(final SubLObject visitor, final SubLObject complex_index)
  {
    return visitor;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 12627L)
  public static SubLObject kb_text_dump_compinx_visit_end_visit(final SubLObject visitor, final SubLObject complex_index)
  {
    return visitor;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 12747L)
  public static SubLObject kb_text_dump_compinx_visit_begin_subindex(final SubLObject visitor, final SubLObject key, final SubLObject complex_index)
  {
    final SubLObject v_context = hierarchical_visitor.get_hierarchical_visitor_parameter( visitor );
    final SubLObject tag_stack = conses_high.getf( v_context, $kw41$PATH, UNPROVIDED );
    stacks.stack_push( kb_text_term_tag( key ), tag_stack );
    return visitor;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 13034L)
  public static SubLObject kb_text_dump_compinx_visit_final_index(final SubLObject visitor, final SubLObject final_key, final SubLObject final_index)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != kb_indexing_datastructures.final_topn_index_p( final_index ) )
    {
      Errors.warn( $str47$Skipping_final_top_N_index__A___, final_index );
      return visitor;
    }
    final SubLObject v_context = hierarchical_visitor.get_hierarchical_visitor_parameter( visitor );
    final SubLObject tag_stack = conses_high.getf( v_context, $kw41$PATH, UNPROVIDED );
    final SubLObject stream = conses_high.getf( v_context, $kw31$STREAM, UNPROVIDED );
    stacks.stack_push( kb_text_term_tag( final_key ), tag_stack );
    final SubLObject _prev_bind_0 = kb_indexing_datastructures.$ordered_final_index_resource$.currentBinding( thread );
    try
    {
      kb_indexing_datastructures.$ordered_final_index_resource$.bind( NIL, thread );
      if( NIL != final_index )
      {
        if( NIL != kb_indexing_datastructures.final_unified_index_p( final_index ) )
        {
          SubLObject leaf_items = set.set_element_list( kb_indexing_datastructures.final_unified_index_set( final_index ) );
          SubLObject csome_list_var;
          leaf_items = ( csome_list_var = assertion_utilities.sort_assertions( leaf_items ) );
          SubLObject leaf = NIL;
          leaf = csome_list_var.first();
          while ( NIL != csome_list_var)
          {
            kb_text_dump_dumpinx_visit_write_path( stream, tag_stack );
            streams_high.write_string( $str11$_, stream, UNPROVIDED, UNPROVIDED );
            kb_text_dump_index_assertion( stream, leaf );
            streams_high.terpri( stream );
            csome_list_var = csome_list_var.rest();
            leaf = csome_list_var.first();
          }
        }
        else if( NIL != kb_indexing_datastructures.final_sharded_index_p( final_index ) )
        {
          final SubLObject shard_key_list = Sort.sort( map_utilities.map_keys( kb_indexing_datastructures.final_sharded_index_shard_map( final_index ) ), $sym48$_, UNPROVIDED );
          SubLObject shard_contents = NIL;
          SubLObject csome_list_var2 = shard_key_list;
          SubLObject key = NIL;
          key = csome_list_var2.first();
          while ( NIL != csome_list_var2)
          {
            final SubLObject shard = map_utilities.map_get( kb_indexing_datastructures.final_sharded_index_shard_map( final_index ), key, UNPROVIDED );
            final SubLObject vector_var;
            shard_contents = ( vector_var = kb_indexing_datastructures.ordered_final_sharded_index_extract_contents( shard, shard_contents ) );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject leaf2;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              leaf2 = Vectors.aref( vector_var, element_num );
              if( NIL != assertion_handles.assertion_p( leaf2 ) )
              {
                kb_text_dump_dumpinx_visit_write_path( stream, tag_stack );
                streams_high.write_string( $str11$_, stream, UNPROVIDED, UNPROVIDED );
                kb_text_dump_index_assertion( stream, leaf2 );
                streams_high.terpri( stream );
              }
            }
            csome_list_var2 = csome_list_var2.rest();
            key = csome_list_var2.first();
          }
        }
        else if( NIL != kb_indexing_datastructures.final_topn_index_p( final_index ) )
        {
          final SubLObject iterator_var = kb_indexing_datastructures.new_ordered_final_topn_index_iterator( final_index );
          SubLObject valid;
          for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
          {
            thread.resetMultipleValues();
            final SubLObject leaf = iteration.iteration_next( iterator_var );
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if( NIL != valid )
            {
              kb_text_dump_dumpinx_visit_write_path( stream, tag_stack );
              streams_high.write_string( $str11$_, stream, UNPROVIDED, UNPROVIDED );
              kb_text_dump_index_assertion( stream, leaf );
              streams_high.terpri( stream );
            }
          }
        }
        else
        {
          enforceType( final_index, $sym49$FINAL_INDEX_P );
        }
      }
    }
    finally
    {
      kb_indexing_datastructures.$ordered_final_index_resource$.rebind( _prev_bind_0, thread );
    }
    stacks.stack_pop( tag_stack );
    return visitor;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 13776L)
  public static SubLObject kb_text_dump_compinx_visit_end_subindex(final SubLObject visitor, final SubLObject key, final SubLObject complex_index)
  {
    final SubLObject v_context = hierarchical_visitor.get_hierarchical_visitor_parameter( visitor );
    final SubLObject tag_stack = conses_high.getf( v_context, $kw41$PATH, UNPROVIDED );
    stacks.stack_pop( tag_stack );
    return visitor;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 14042L)
  public static SubLObject kb_text_dump_dumpinx_visit_write_path(final SubLObject stream, final SubLObject tag_stack)
  {
    final SubLObject elements = Functions.funcall( $sym50$DO_STACK_ELEMENTS_STACK_ELEMENTS, tag_stack );
    kb_text_dump_dumpinx_visit_write_path_item( stream, elements );
    return stream;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 14307L)
  public static SubLObject kb_text_dump_dumpinx_visit_write_path_item(final SubLObject stream, final SubLObject elements)
  {
    SubLObject item = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( elements, elements, $list51 );
    item = elements.first();
    final SubLObject items;
    final SubLObject current = items = elements.rest();
    if( NIL != list_utilities.sublisp_boolean( items ) )
    {
      kb_text_dump_dumpinx_visit_write_path_item( stream, items );
      streams_high.write_string( $str11$_, stream, UNPROVIDED, UNPROVIDED );
    }
    streams_high.write_string( item, stream, UNPROVIDED, UNPROVIDED );
    return stream;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 14618L)
  public static SubLObject kb_text_convert_deduction_support_to_recipe(final SubLObject support)
  {
    if( NIL != assertion_handles.assertion_p( support ) )
    {
      return Sequences.cconcatenate( $str52$A_, format_nil.format_nil_d_no_copy( assertion_handles.assertion_id( support ) ) );
    }
    if( NIL != kb_hl_support_handles.kb_hl_support_p( support ) )
    {
      return kb_text_convert_deduction_support_to_recipe( kb_hl_supports_high.kb_hl_support_hl_support( support ) );
    }
    return kb_text_cons_id_string( support );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 15131L)
  public static SubLObject kb_text_convert_deduction_supports_to_support_recipe(final SubLObject supports)
  {
    return Sort.sort( Mapping.mapcar( $sym53$KB_TEXT_CONVERT_DEDUCTION_SUPPORT_TO_RECIPE, supports ), $sym54$STRING_, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 15292L)
  public static SubLObject kb_text_cons_id_string(final SubLObject cons)
  {
    return kb_text_compact_hl_external_id_string( kb_text_convert_potential_prototypical_terms( cons ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 15490L)
  public static SubLObject kb_text_compact_hl_external_id_string(final SubLObject v_object)
  {
    return kb_utilities.compact_hl_external_id_string( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 15602L)
  public static SubLObject clear_kb_text_compact_hl_external_id_string_cached()
  {
    final SubLObject cs = $kb_text_compact_hl_external_id_string_cached_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 15602L)
  public static SubLObject remove_kb_text_compact_hl_external_id_string_cached(final SubLObject v_object)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $kb_text_compact_hl_external_id_string_cached_caching_state$.getGlobalValue(), ConsesLow.list( v_object ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 15602L)
  public static SubLObject kb_text_compact_hl_external_id_string_cached_internal(final SubLObject v_object)
  {
    return kb_text_compact_hl_external_id_string( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 15602L)
  public static SubLObject kb_text_compact_hl_external_id_string_cached(final SubLObject v_object)
  {
    SubLObject caching_state = $kb_text_compact_hl_external_id_string_cached_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym55$KB_TEXT_COMPACT_HL_EXTERNAL_ID_STRING_CACHED, $sym56$_KB_TEXT_COMPACT_HL_EXTERNAL_ID_STRING_CACHED_CACHING_STATE_, NIL, EQL,
          ONE_INTEGER, $int57$10000 );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, v_object, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( kb_text_compact_hl_external_id_string_cached_internal( v_object ) ) );
      memoization_state.caching_state_put( caching_state, v_object, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 15806L)
  public static SubLObject kb_text_dump_file(final SubLObject directory, final SubLObject file)
  {
    return file_utilities.relative_filename( directory, file, $str58$kbtext );
  }

  public static SubLObject declare_kb_text_dump_file()
  {
    SubLFiles.declareFunction( me, "get_hl_prototypical_terms", "GET-HL-PROTOTYPICAL-TERMS", 0, 0, false );
    SubLFiles.declareFunction( me, "kb_text_hl_prototypical_termP", "KB-TEXT-HL-PROTOTYPICAL-TERM?", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_text_convert_potential_prototypical_terms", "KB-TEXT-CONVERT-POTENTIAL-PROTOTYPICAL-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_text_dump_essential_kb", "KB-TEXT-DUMP-ESSENTIAL-KB", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_text_dump_kb", "KB-TEXT-DUMP-KB", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_text_dump_indexing", "KB-TEXT-DUMP-INDEXING", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_text_dump_constants", "KB-TEXT-DUMP-CONSTANTS", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_text_dump_narts", "KB-TEXT-DUMP-NARTS", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_text_dump_assertions", "KB-TEXT-DUMP-ASSERTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_text_dump_meta_assertions", "KB-TEXT-DUMP-META-ASSERTIONS", 1, 2, false );
    SubLFiles.declareFunction( me, "kb_text_dump_meta_assertions_to_stream", "KB-TEXT-DUMP-META-ASSERTIONS-TO-STREAM", 1, 2, false );
    SubLFiles.declareFunction( me, "kb_text_dump_assertion_to_stream", "KB-TEXT-DUMP-ASSERTION-TO-STREAM", 2, 0, false );
    SubLFiles.declareFunction( me, "kb_text_dump_deductions", "KB-TEXT-DUMP-DEDUCTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_text_dump_kb_hl_supports", "KB-TEXT-DUMP-KB-HL-SUPPORTS", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_text_dump_unrepresented_terms", "KB-TEXT-DUMP-UNREPRESENTED-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_text_dump_index_assertion", "KB-TEXT-DUMP-INDEX-ASSERTION", 2, 0, false );
    SubLFiles.declareFunction( me, "kb_text_dump_constant_indexing", "KB-TEXT-DUMP-CONSTANT-INDEXING", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_text_dump_nart_indexing", "KB-TEXT-DUMP-NART-INDEXING", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_text_dump_unrepresented_term_indexing", "KB-TEXT-DUMP-UNREPRESENTED-TERM-INDEXING", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_text_sorted_term_assertion_list", "KB-TEXT-SORTED-TERM-ASSERTION-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "new_kb_text_dump_complex_visitor", "NEW-KB-TEXT-DUMP-COMPLEX-VISITOR", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_text_term_tag", "KB-TEXT-TERM-TAG", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_text_dump_compinx_visit_begin_visit", "KB-TEXT-DUMP-COMPINX-VISIT-BEGIN-VISIT", 2, 0, false );
    SubLFiles.declareFunction( me, "kb_text_dump_compinx_visit_end_visit", "KB-TEXT-DUMP-COMPINX-VISIT-END-VISIT", 2, 0, false );
    SubLFiles.declareFunction( me, "kb_text_dump_compinx_visit_begin_subindex", "KB-TEXT-DUMP-COMPINX-VISIT-BEGIN-SUBINDEX", 3, 0, false );
    SubLFiles.declareFunction( me, "kb_text_dump_compinx_visit_final_index", "KB-TEXT-DUMP-COMPINX-VISIT-FINAL-INDEX", 3, 0, false );
    SubLFiles.declareFunction( me, "kb_text_dump_compinx_visit_end_subindex", "KB-TEXT-DUMP-COMPINX-VISIT-END-SUBINDEX", 3, 0, false );
    SubLFiles.declareFunction( me, "kb_text_dump_dumpinx_visit_write_path", "KB-TEXT-DUMP-DUMPINX-VISIT-WRITE-PATH", 2, 0, false );
    SubLFiles.declareFunction( me, "kb_text_dump_dumpinx_visit_write_path_item", "KB-TEXT-DUMP-DUMPINX-VISIT-WRITE-PATH-ITEM", 2, 0, false );
    SubLFiles.declareFunction( me, "kb_text_convert_deduction_support_to_recipe", "KB-TEXT-CONVERT-DEDUCTION-SUPPORT-TO-RECIPE", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_text_convert_deduction_supports_to_support_recipe", "KB-TEXT-CONVERT-DEDUCTION-SUPPORTS-TO-SUPPORT-RECIPE", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_text_cons_id_string", "KB-TEXT-CONS-ID-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_text_compact_hl_external_id_string", "KB-TEXT-COMPACT-HL-EXTERNAL-ID-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_kb_text_compact_hl_external_id_string_cached", "CLEAR-KB-TEXT-COMPACT-HL-EXTERNAL-ID-STRING-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_kb_text_compact_hl_external_id_string_cached", "REMOVE-KB-TEXT-COMPACT-HL-EXTERNAL-ID-STRING-CACHED", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_text_compact_hl_external_id_string_cached_internal", "KB-TEXT-COMPACT-HL-EXTERNAL-ID-STRING-CACHED-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_text_compact_hl_external_id_string_cached", "KB-TEXT-COMPACT-HL-EXTERNAL-ID-STRING-CACHED", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_text_dump_file", "KB-TEXT-DUMP-FILE", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_kb_text_dump_file()
  {
    $kb_text_hl_prototypical_terms$ = SubLFiles.defparameter( "*KB-TEXT-HL-PROTOTYPICAL-TERMS*", set.new_set( UNPROVIDED, UNPROVIDED ) );
    $kb_text_compact_hl_external_id_string_cached_caching_state$ = SubLFiles.deflexical( "*KB-TEXT-COMPACT-HL-EXTERNAL-ID-STRING-CACHED-CACHING-STATE*", NIL );
    return NIL;
  }

  public static SubLObject setup_kb_text_dump_file()
  {
    access_macros.register_external_symbol( $sym3$KB_TEXT_DUMP_ESSENTIAL_KB );
    access_macros.register_external_symbol( $sym4$KB_TEXT_DUMP_KB );
    memoization_state.note_globally_cached_function( $sym55$KB_TEXT_COMPACT_HL_EXTERNAL_ID_STRING_CACHED );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_kb_text_dump_file();
  }

  @Override
  public void initializeVariables()
  {
    init_kb_text_dump_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_kb_text_dump_file();
  }
  static
  {
    me = new kb_text_dump();
    $kb_text_hl_prototypical_terms$ = null;
    $kb_text_compact_hl_external_id_string_cached_caching_state$ = null;
    $const0$HLPrototypicalTerm = constant_handles.reader_make_constant_shell( makeString( "HLPrototypicalTerm" ) );
    $sym1$KB_TEXT_HL_PROTOTYPICAL_TERM_ = makeSymbol( "KB-TEXT-HL-PROTOTYPICAL-TERM?" );
    $sym2$CONSTANT_NAME = makeSymbol( "CONSTANT-NAME" );
    $sym3$KB_TEXT_DUMP_ESSENTIAL_KB = makeSymbol( "KB-TEXT-DUMP-ESSENTIAL-KB" );
    $sym4$KB_TEXT_DUMP_KB = makeSymbol( "KB-TEXT-DUMP-KB" );
    $str5$constants = makeString( "constants" );
    $kw6$OUTPUT = makeKeyword( "OUTPUT" );
    $str7$Unable_to_open__S = makeString( "Unable to open ~S" );
    $str8$Text_dumping_constants = makeString( "Text dumping constants" );
    $sym9$STRINGP = makeSymbol( "STRINGP" );
    $kw10$SKIP = makeKeyword( "SKIP" );
    $str11$_ = makeString( " " );
    $str12$narts = makeString( "narts" );
    $str13$Text_dumping_narts = makeString( "Text dumping narts" );
    $str14$assertions = makeString( "assertions" );
    $str15$Text_dumping_assertions = makeString( "Text dumping assertions" );
    $sym16$STREAMP = makeSymbol( "STREAMP" );
    $sym17$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const18$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $str19$Mapping_meta_assertions = makeString( "Mapping meta-assertions" );
    $sym20$ASSERTION_P = makeSymbol( "ASSERTION-P" );
    $str21$_A_ = makeString( "~A " );
    $str22$deductions = makeString( "deductions" );
    $str23$Text_dumping_deductions = makeString( "Text dumping deductions" );
    $str24$_A__A__A__A = makeString( "~A ~A ~A ~A" );
    $str25$kb_hl_supports = makeString( "kb-hl-supports" );
    $str26$Text_dumping_KB_HL_supports = makeString( "Text dumping KB HL supports" );
    $str27$unrepresented_terms = makeString( "unrepresented-terms" );
    $str28$Text_dumping_unrepresented_terms = makeString( "Text dumping unrepresented terms" );
    $sym29$LOOKUP_UNREPRESENTED_TERM_SUID = makeSymbol( "LOOKUP-UNREPRESENTED-TERM-SUID" );
    $str30$constant_indexing = makeString( "constant-indexing" );
    $kw31$STREAM = makeKeyword( "STREAM" );
    $str32$Text_dumping_constant_indexing = makeString( "Text dumping constant indexing" );
    $str33$Unsupported_index_type__A___ = makeString( "Unsupported index type ~A.~%" );
    $str34$nart_indexing = makeString( "nart-indexing" );
    $str35$Text_dumping_NAT_indexing = makeString( "Text dumping NAT indexing" );
    $str36$unrepresented_term_indexing = makeString( "unrepresented-term-indexing" );
    $str37$Text_dumping_unrepresented_term_i = makeString( "Text dumping unrepresented term indexing" );
    $str38$____Old_Space = makeString( " -- Old Space" );
    $str39$____New_Space = makeString( " -- New Space" );
    $str40$cdolist = makeString( "cdolist" );
    $kw41$PATH = makeKeyword( "PATH" );
    $sym42$KB_TEXT_DUMP_COMPINX_VISIT_BEGIN_VISIT = makeSymbol( "KB-TEXT-DUMP-COMPINX-VISIT-BEGIN-VISIT" );
    $sym43$KB_TEXT_DUMP_COMPINX_VISIT_BEGIN_SUBINDEX = makeSymbol( "KB-TEXT-DUMP-COMPINX-VISIT-BEGIN-SUBINDEX" );
    $sym44$KB_TEXT_DUMP_COMPINX_VISIT_FINAL_INDEX = makeSymbol( "KB-TEXT-DUMP-COMPINX-VISIT-FINAL-INDEX" );
    $sym45$KB_TEXT_DUMP_COMPINX_VISIT_END_SUBINDEX = makeSymbol( "KB-TEXT-DUMP-COMPINX-VISIT-END-SUBINDEX" );
    $sym46$KB_TEXT_DUMP_COMPINX_VISIT_END_VISIT = makeSymbol( "KB-TEXT-DUMP-COMPINX-VISIT-END-VISIT" );
    $str47$Skipping_final_top_N_index__A___ = makeString( "Skipping final top-N index ~A.~%" );
    $sym48$_ = makeSymbol( "<" );
    $sym49$FINAL_INDEX_P = makeSymbol( "FINAL-INDEX-P" );
    $sym50$DO_STACK_ELEMENTS_STACK_ELEMENTS = makeSymbol( "DO-STACK-ELEMENTS-STACK-ELEMENTS" );
    $list51 = ConsesLow.list( makeSymbol( "ITEM" ), makeSymbol( "&REST" ), makeSymbol( "ITEMS" ) );
    $str52$A_ = makeString( "A_" );
    $sym53$KB_TEXT_CONVERT_DEDUCTION_SUPPORT_TO_RECIPE = makeSymbol( "KB-TEXT-CONVERT-DEDUCTION-SUPPORT-TO-RECIPE" );
    $sym54$STRING_ = makeSymbol( "STRING<" );
    $sym55$KB_TEXT_COMPACT_HL_EXTERNAL_ID_STRING_CACHED = makeSymbol( "KB-TEXT-COMPACT-HL-EXTERNAL-ID-STRING-CACHED" );
    $sym56$_KB_TEXT_COMPACT_HL_EXTERNAL_ID_STRING_CACHED_CACHING_STATE_ = makeSymbol( "*KB-TEXT-COMPACT-HL-EXTERNAL-ID-STRING-CACHED-CACHING-STATE*" );
    $int57$10000 = makeInteger( 10000 );
    $str58$kbtext = makeString( "kbtext" );
  }
}
/*
 * 
 * Total time: 1330 ms
 * 
 */