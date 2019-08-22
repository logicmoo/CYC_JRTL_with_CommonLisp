/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/
package com.cyc.cycjava_1.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;

public final class dumper_larkc
    extends dumper

{
  //// Constructor
  private dumper_larkc()
  {}
  public static final SubLFile me = new dumper_larkc();
  public static final String myName = "com.cyc.cycjava_1.cycl.dumper";
  //// Definitions
  /**
   * Force the KB to be completely stored in memory and therefore able written
   * out as a single image file with no other dependencies.
   */
  //@SubL(source = "cycl/dumper.lisp", position = 1024)
  // public static SubLSymbol $force_monolithic_kb_assumption$ = null;

//  @SubL(source = "cycl/dumper.lisp", position = 1696)
//  public static final SubLObject force_monolithic_kb_assumptionP()
//  {
//    return $force_monolithic_kb_assumption$.getGlobalValue();
//  }

  @SubL(source = "cycl/dumper.lisp", position = 4072)
  public static final SubLObject discard_dump_filename(SubLObject filename)
  {
    checkType( filename, $sym20$STRINGP );
    return Sequences.fill( filename, Characters.CHAR_space, UNPROVIDED, UNPROVIDED );
  }
  /** The default directory chain for KB dumps under the Cyc Home directory. */
  //@SubL(source = "cycl/dumper.lisp", position = 4190)
  // public static SubLSymbol $default_dump_path$ = null;
  /** The default extension for all KB dump files. */
  //@SubL(source = "cycl/dumper.lisp", position = 4630)
  // public static SubLSymbol $default_dump_extension$ = null;
  /** The default extension for all KB dump product files. */
  //@SubL(source = "cycl/dumper.lisp", position = 4744)
  // public static SubLSymbol $default_dump_product_extension$ = null;

  /**
   * Return the KB dump file NAME.EXTENSION in the dump directory DIRECTORY-PATH
   */
//  @SubL(source = "cycl/dumper.lisp", position = 5298)
//  public static final SubLObject kb_dump_file(SubLObject name, SubLObject directory_path, SubLObject extension)
//  {
//    if( ( extension == UNPROVIDED ) )
//    {
//      extension = $default_dump_extension$.getDynamicValue();
//    }
//    return file_utilities.relative_filename( directory_path, name, extension );
//  }
  /** Dump size scaling factor in number of bytes per assertion. */
  //@SubL(source = "cycl/dumper.lisp", position = 5794)
  // public static SubLSymbol $dump_bytes_per_assertion$ = null;
  /** Verify the existence of dump files when non-nil. */
 // @SubL(source = "cycl/dumper.lisp", position = 6513)
  // public static SubLSymbol $dump_verify$ = null;

  /**
   * Generate an error if FILENAME does not exist.
   *
   * @param WARN-ONLY?; if t, warns instead of errors if FILENAME does not
   *        exist.
   */
//  @SubL(source = "cycl/dumper.lisp", position = 6612)
//  public static final SubLObject verify_file_existence(SubLObject filename, SubLObject warn_onlyP)
//  {
//    if( ( warn_onlyP == UNPROVIDED ) )
//    {
//      warn_onlyP = NIL;
//    }
//    {
//      final SubLThread thread = SubLProcess.currentSubLThread();
//      checkType( filename, $sym20$STRINGP );
//      if( ( NIL != $dump_verify$.getDynamicValue( thread ) ) )
//      {
//        if( ( NIL == Filesys.probe_file( filename ) ) )
//        {
//          if( ( NIL != warn_onlyP ) )
//          {
//            Errors.warn( $str26$file__s_not_found, filename );
//          }
//          else
//          {
//            Errors.error( $str26$file__s_not_found, filename );
//          }
//          return NIL;
//        }
//      }
//      return T;
//    }
//  }
  /**
   * When T, the load process attempts to GC and make static the memory that has
   * been recently allocated after each key point where a major chunk of KB
   * content has been loaded.
   */
  //@SubL(source = "cycl/dumper.lisp", position = 7613)
  // public static SubLSymbol $kb_load_gc_checkpoints_enabledP$ = null;

//  @SubL(source = "cycl/dumper.lisp", position = 7918)
//  public static final SubLObject kb_load_gc_checkpoint()
//  {
//    {
//      final SubLThread thread = SubLProcess.currentSubLThread();
//      if( ( NIL != $kb_load_gc_checkpoints_enabledP$.getDynamicValue( thread ) ) )
//      {
//      }
//      return NIL;
//    }
//  }
  //@SubL(source = "cycl/dumper.lisp", position = 13241)
  // public static SubLSymbol $dump_verbose$ = null;

  /** Load the KB from the dump directory in DIRECTORY-PATH. */
  @SubL(source = "cycl/dumper.lisp", position = 14801)
  public static final SubLObject load_kb(SubLObject directory_path)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if( ( NIL != $dump_verbose$.getDynamicValue( thread ) ) )
      {
        PrintLow.format( StreamsLow.$standard_output$.getDynamicValue( thread ), $str47$________Loading_KB_from__A_at__A_, directory_path, numeric_date_utilities.timestring( UNPROVIDED ) );
        streams_high.force_output( StreamsLow.$standard_output$.getDynamicValue( thread ) );
      }
      {
        SubLObject load_time = NIL;
        {
          SubLObject _prev_bind_0 = control_vars.$save_asked_queriesP$.currentBinding( thread );
          try
          {
            control_vars.$save_asked_queriesP$.bind( NIL, thread );
            {
              SubLObject time_var = Time.get_internal_real_time();
              kb_load_from_directory( directory_path );
              load_kb_initializations();
              if( ( NIL != force_monolithic_kb_assumptionP() ) )
              {
                Errors.handleMissingMethodError( "This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2354" );
                kb_load_gc_checkpoint();
              }
              else
              {
                kb_utilities.swap_out_all_pristine_kb_objects();
                sbhl_caching_policies.enforce_standard_kb_sbhl_caching_policies( directory_path );
                kb_load_gc_checkpoint();
              }
              load_time = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
              if( ( NIL != $dump_verbose$.getDynamicValue( thread ) ) )
              {
                PrintLow.format( T, $str48$________Load_of_KB__A_completed__, new SubLObject[] { control_vars.kb_loaded(), numeric_date_utilities.elapsed_time_abbreviation_string( load_time ), numeric_date_utilities
                    .timestring( UNPROVIDED )
                } );
                kb_utilities.kb_statistics( StreamsLow.$standard_output$.getDynamicValue( thread ) );
                streams_high.force_output( StreamsLow.$standard_output$.getDynamicValue( thread ) );
              }
            }
          }
          finally
          {
            control_vars.$save_asked_queriesP$.rebind( _prev_bind_0, thread );
          }
        }
      }
      return control_vars.kb_loaded();
    }
  }

  @SubL(source = "cycl/dumper.lisp", position = 16198)
  public static final SubLObject kb_load_from_directory(SubLObject directory_path)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      kb_load_gc_checkpoint();
      {
        SubLObject common_symbols = load_special_objects( directory_path );
        if( ( NIL == $force_monolithic_kb_assumption$.getGlobalValue() ) )
        {
          misc_utilities.initialize_hl_store_cache_directory_and_shared_symbols( directory_path, common_symbols );
          kb_load_gc_checkpoint();
        }
        {
          SubLObject _prev_bind_0 = cfasl.$cfasl_common_symbols$.currentBinding( thread );
          try
          {
            cfasl.$cfasl_common_symbols$.bind( NIL, thread );
            cfasl.cfasl_set_common_symbols( common_symbols );
            {
              SubLObject _prev_bind_0_5 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding( thread );
              SubLObject _prev_bind_1 = api_control_vars.$cfasl_nart_handle_lookup_func$.currentBinding( thread );
              SubLObject _prev_bind_2 = api_control_vars.$cfasl_assertion_handle_lookup_func$.currentBinding( thread );
              SubLObject _prev_bind_3 = api_control_vars.$cfasl_deduction_handle_lookup_func$.currentBinding( thread );
              SubLObject _prev_bind_4 = api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.currentBinding( thread );
              SubLObject _prev_bind_5 = api_control_vars.$cfasl_clause_struc_handle_lookup_func$.currentBinding( thread );
              try
              {
                api_control_vars.$cfasl_constant_handle_lookup_func$.bind( $sym37$FIND_CONSTANT_BY_DUMP_ID, thread );
                api_control_vars.$cfasl_nart_handle_lookup_func$.bind( $sym38$FIND_NART_BY_DUMP_ID, thread );
                api_control_vars.$cfasl_assertion_handle_lookup_func$.bind( $sym39$FIND_ASSERTION_BY_DUMP_ID, thread );
                api_control_vars.$cfasl_deduction_handle_lookup_func$.bind( $sym40$FIND_DEDUCTION_BY_DUMP_ID, thread );
                api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.bind( $sym41$FIND_KB_HL_SUPPORT_BY_DUMP_ID, thread );
                api_control_vars.$cfasl_clause_struc_handle_lookup_func$.bind( $sym42$FIND_CLAUSE_STRUC_BY_DUMP_ID, thread );
                load_essential_kb( directory_path );
                load_computable_content( directory_path );
              }
              finally
              {
                api_control_vars.$cfasl_clause_struc_handle_lookup_func$.rebind( _prev_bind_5, thread );
                api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.rebind( _prev_bind_4, thread );
                api_control_vars.$cfasl_deduction_handle_lookup_func$.rebind( _prev_bind_3, thread );
                api_control_vars.$cfasl_assertion_handle_lookup_func$.rebind( _prev_bind_2, thread );
                api_control_vars.$cfasl_nart_handle_lookup_func$.rebind( _prev_bind_1, thread );
                api_control_vars.$cfasl_constant_handle_lookup_func$.rebind( _prev_bind_0_5, thread );
              }
            }
          }
          finally
          {
            cfasl.$cfasl_common_symbols$.rebind( _prev_bind_0, thread );
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/dumper.lisp", position = 17811)
  public static final SubLObject load_essential_kb(SubLObject directory_path)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if( ( NIL != $dump_verbose$.getDynamicValue( thread ) ) )
      {
        PrintLow.format( StreamsLow.$standard_output$.getDynamicValue( thread ), $str50$________Loading_essential_KB_at__, numeric_date_utilities.timestring( UNPROVIDED ) );
        streams_high.force_output( StreamsLow.$standard_output$.getDynamicValue( thread ) );
      }
      {
        SubLObject _prev_bind_0 = utilities_macros.$structure_resourcing_make_static$.currentBinding( thread );
        SubLObject _prev_bind_1 = cfasl.$cfasl_input_to_static_area$.currentBinding( thread );
        try
        {
          utilities_macros.$structure_resourcing_make_static$.bind( T, thread );
          cfasl.$cfasl_input_to_static_area$.bind( T, thread );
          setup_kb_state_from_dump( directory_path );
          kb_load_gc_checkpoint();
          load_constant_shells( directory_path );
          kb_load_gc_checkpoint();
          load_nart_shells( directory_path );
          kb_load_gc_checkpoint();
          load_assertion_shells( directory_path );
          kb_load_gc_checkpoint();
          load_kb_hl_support_shells( directory_path );
          kb_load_gc_checkpoint();
          load_clause_struc_defs( directory_path );
          kb_load_gc_checkpoint();
          load_deduction_defs( directory_path );
          kb_load_gc_checkpoint();
          load_assertion_defs( directory_path );
          kb_load_gc_checkpoint();
          load_kb_hl_support_defs( directory_path );
          kb_load_gc_checkpoint();
          load_bookkeeping_assertions( directory_path );
          kb_load_gc_checkpoint();
          load_experience( directory_path );
          kb_load_gc_checkpoint();
        }
        finally
        {
          cfasl.$cfasl_input_to_static_area$.rebind( _prev_bind_1, thread );
          utilities_macros.$structure_resourcing_make_static$.rebind( _prev_bind_0, thread );
        }
      }
      load_essential_kb_initializations();
      return NIL;
    }
  }

  /**
   * Initialize the non-dumpable but computable KB aspects exclusively dependent
   * on the essential KB that other computable KB aspects, whether dumpable or
   * not, are dependent upon
   */
  @SubL(source = "cycl/dumper.lisp", position = 19115)
  public static final SubLObject load_essential_kb_initializations()
  {
    initialize_kb_features();
    return NIL;
  }

  /**
   * Initialize the non-dumpable but computable KB aspects exclusively dependent
   * on the computable KB (e.g.indexing), but not on the remaining HL
   */
  @SubL(source = "cycl/dumper.lisp", position = 19399)
  public static final SubLObject load_computable_kb_initializations()
  {
    return NIL;
  }

  /**
   * Initialize the non-dumpable but computable KB aspects dependent on SBHL and
   * arg type caches.
   */
  @SubL(source = "cycl/dumper.lisp", position = 19618)
  public static final SubLObject load_computable_remaining_hl_low_initializations()
  {
    subl_identifier.initialize_sublid_mappings();
    return NIL;
  }

  @SubL(source = "cycl/dumper.lisp", position = 20233)
  public static final SubLObject load_computable_content(SubLObject directory_path)
  {
    load_computable_kb( directory_path );
    load_computable_remaining_hl( directory_path );
    return NIL;
  }

  @SubL(source = "cycl/dumper.lisp", position = 21326)
  public static final SubLObject load_computable_kb(SubLObject directory_path)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if( ( NIL != $dump_verbose$.getDynamicValue( thread ) ) )
      {
        PrintLow.format( StreamsLow.$standard_output$.getDynamicValue( thread ), $str51$________Loading_computable_KB_at_, numeric_date_utilities.timestring( UNPROVIDED ) );
        streams_high.force_output( StreamsLow.$standard_output$.getDynamicValue( thread ) );
      }
      {
        SubLObject _prev_bind_0 = utilities_macros.$structure_resourcing_make_static$.currentBinding( thread );
        SubLObject _prev_bind_1 = cfasl.$cfasl_input_to_static_area$.currentBinding( thread );
        try
        {
          utilities_macros.$structure_resourcing_make_static$.bind( T, thread );
          cfasl.$cfasl_input_to_static_area$.bind( T, thread );
          load_kb_unrepresented_terms( directory_path );
          kb_load_gc_checkpoint();
          load_kb_indexing( directory_path );
          kb_load_gc_checkpoint();
          load_rule_set( directory_path );
          kb_load_gc_checkpoint();
        }
        finally
        {
          cfasl.$cfasl_input_to_static_area$.rebind( _prev_bind_1, thread );
          utilities_macros.$structure_resourcing_make_static$.rebind( _prev_bind_0, thread );
        }
      }
      load_computable_kb_initializations();
      return NIL;
    }
  }

  @SubL(source = "cycl/dumper.lisp", position = 23364)
  public static final SubLObject load_computable_remaining_hl(SubLObject directory_path)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if( ( NIL != $dump_verbose$.getDynamicValue( thread ) ) )
      {
        PrintLow.format( StreamsLow.$standard_output$.getDynamicValue( thread ), $str52$________Loading_computable_remain, numeric_date_utilities.timestring( UNPROVIDED ) );
        streams_high.force_output( StreamsLow.$standard_output$.getDynamicValue( thread ) );
      }
      {
        SubLObject _prev_bind_0 = utilities_macros.$structure_resourcing_make_static$.currentBinding( thread );
        SubLObject _prev_bind_1 = cfasl.$cfasl_input_to_static_area$.currentBinding( thread );
        try
        {
          utilities_macros.$structure_resourcing_make_static$.bind( T, thread );
          cfasl.$cfasl_input_to_static_area$.bind( T, thread );
          load_nart_hl_formulas( directory_path );
          kb_load_gc_checkpoint();
          load_miscellaneous( directory_path );
          kb_load_gc_checkpoint();
          load_sbhl_data( directory_path );
          kb_load_gc_checkpoint();
          load_sbhl_cache( directory_path );
          kb_load_gc_checkpoint();
          load_cardinality_estimates( directory_path );
          kb_load_gc_checkpoint();
          load_arg_type_cache( directory_path );
          kb_load_gc_checkpoint();
          load_defns_cache( directory_path );
          kb_load_gc_checkpoint();
          load_somewhere_cache( directory_path );
          kb_load_gc_checkpoint();
          load_arity_cache( directory_path );
          kb_load_gc_checkpoint();
          load_tva_cache( directory_path );
          kb_load_gc_checkpoint();
          load_computable_remaining_hl_low_initializations();
        }
        finally
        {
          cfasl.$cfasl_input_to_static_area$.rebind( _prev_bind_1, thread );
          utilities_macros.$structure_resourcing_make_static$.rebind( _prev_bind_0, thread );
        }
      }
      return NIL;
    }
  }

  /**
   * These are former 'initializations' that are rebuilding expensive (in both
   * time and space) structures and so should *not* be part of
   * load-kb-initializations, but part of
   * [dump/load/rebuild]-computable-remaining-hl. The refactoring to do that
   * requires: identifying the initializations the rebuild depends on and adding
   * it before the rebuild in rebuild-computable-remaining-hl (@see
   * lexicon-cache's dependency on initialize-lexicon-modules), then making the
   * structures dump/loadable, which in the case of most of these is
   * non-trivial.
   */
  @SubL(source = "cycl/dumper.lisp", position = 27320)
  public static final SubLObject rebuild_computable_but_not_dumpable_yet()
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if( ( NIL != $dump_verbose$.getDynamicValue( thread ) ) )
      {
        PrintLow.format( StreamsLow.$standard_output$.getDynamicValue( thread ), $str53$________Rebuilding_computable_but, numeric_date_utilities.timestring( UNPROVIDED ) );
        streams_high.force_output( StreamsLow.$standard_output$.getDynamicValue( thread ) );
      }
      {
        SubLObject _prev_bind_0 = wff_vars.$wff_memoization_state$.currentBinding( thread );
        try
        {
          wff_vars.$wff_memoization_state$.bind( wff_macros.possibly_new_wff_memoization_state(), thread );
          {
            SubLObject local_state = wff_vars.$wff_memoization_state$.getDynamicValue( thread );
            {
              SubLObject _prev_bind_0_6 = memoization_state.$memoization_state$.currentBinding( thread );
              try
              {
                memoization_state.$memoization_state$.bind( local_state, thread );
                {
                  SubLObject original_memoization_process = NIL;
                  if( ( ( NIL != local_state ) && ( NIL == memoization_state.memoization_state_lock( local_state ) ) ) )
                  {
                    original_memoization_process = memoization_state.memoization_state_get_current_process_internal( local_state );
                    {
                      SubLObject current_proc = Threads.current_process();
                      if( ( NIL == original_memoization_process ) )
                      {
                        memoization_state.memoization_state_set_current_process_internal( local_state, current_proc );
                      }
                      else
                      {
                        if( ( original_memoization_process != current_proc ) )
                        {
                          Errors.error( $str54$Invalid_attempt_to_reuse_memoizat );
                        }
                      }
                    }
                  }
                  try
                  {
                    if( ( NIL == wff_macros.within_wffP() ) )
                    {
                      wff.reset_wff_state();
                    }
                  }
                  finally
                  {
                    {
                      SubLObject _prev_bind_0_7 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                      try
                      {
                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                        {
                          SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
                          {
                            SubLObject _prev_bind_0_8 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
                            SubLObject _prev_bind_1 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
                            SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
                            try
                            {
                              sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, TWELVE_INTEGER ), thread );
                              sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
                              sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
                            }
                            finally
                            {
                              sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_2, thread );
                              sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_1, thread );
                              sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_8, thread );
                            }
                          }
                        }
                        if( ( ( NIL != local_state ) && ( NIL == original_memoization_process ) ) )
                        {
                          memoization_state.memoization_state_set_current_process_internal( local_state, NIL );
                        }
                      }
                      finally
                      {
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_7, thread );
                      }
                    }
                  }
                }
              }
              finally
              {
                memoization_state.$memoization_state$.rebind( _prev_bind_0_6, thread );
              }
            }
          }
        }
        finally
        {
          wff_vars.$wff_memoization_state$.rebind( _prev_bind_0, thread );
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/dumper.lisp", position = 29608)
  public static final SubLObject load_copyright(SubLObject stream)
  {
    {
      SubLObject copyright = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
      checkType( copyright, $sym20$STRINGP );
      return copyright;
    }
  }

  /**
   * A helper used for a few of the KB object load methods.
   *
   * @param LOAD-FUNC; a unary function-spec-p that takes a stream as its single
   *        argument.
   */
  @SubL(source = "cycl/dumper.lisp", position = 29749)
  public static final SubLObject load_unit_file(SubLObject dump_directory, SubLObject filename, SubLObject load_func, SubLObject progress_message)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType( dump_directory, $sym20$STRINGP );
      checkType( filename, $sym20$STRINGP );
      checkType( load_func, $sym55$SYMBOLP );
      checkType( progress_message, $sym20$STRINGP );
      {
        SubLObject unit_file = kb_dump_file( filename, dump_directory, UNPROVIDED );
        if( ( NIL != verify_file_existence( unit_file, T ) ) )
        {
          {
            SubLObject filename_var = unit_file;
            SubLObject stream = NIL;
            try
            {
              {
                SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
                try
                {
                  stream_macros.$stream_requires_locking$.bind( NIL, thread );
                  stream = compatibility.open_binary( filename_var, $kw56$INPUT );
                }
                finally
                {
                  stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
                }
              }
              if( ( !( stream.isStream() ) ) )
              {
                Errors.error( $str57$Unable_to_open__S, filename_var );
              }
              {
                SubLObject stream_9 = stream;
                SubLObject total = streams_high.file_length( stream_9 );
                load_copyright( stream_9 );
                {
                  SubLObject _prev_bind_0 = utilities_macros.$noting_progress_start_time$.currentBinding( thread );
                  try
                  {
                    utilities_macros.$noting_progress_start_time$.bind( Time.get_universal_time(), thread );
                    utilities_macros.noting_progress_preamble( progress_message );
                    Functions.funcall( load_func, stream_9 );
                    if( ( cfasl.cfasl_input( stream_9, NIL, $kw58$EOF ) != $kw58$EOF ) )
                    {
                      Errors.warn( $str59$_d_bytes_of_unread_stuff_in__S, Numbers.subtract( total, compatibility.get_file_position( stream_9 ) ), unit_file );
                    }
                    utilities_macros.noting_progress_postamble();
                  }
                  finally
                  {
                    utilities_macros.$noting_progress_start_time$.rebind( _prev_bind_0, thread );
                  }
                }
              }
            }
            finally
            {
              {
                SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  if( stream.isStream() )
                  {
                    streams_high.close( stream, UNPROVIDED );
                  }
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
                }
              }
            }
            discard_dump_filename( filename_var );
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/dumper.lisp", position = 30917)
  public static final SubLObject load_kb_object_count(SubLObject directory_path, SubLObject filename)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        SubLObject text_file = kb_dump_file( filename, directory_path, $str60$text );
        if( ( NIL != verify_file_existence( text_file, T ) ) )
        {
          {
            SubLObject filename_var = text_file;
            SubLObject stream = NIL;
            try
            {
              {
                SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
                try
                {
                  stream_macros.$stream_requires_locking$.bind( NIL, thread );
                  stream = compatibility.open_text( filename_var, $kw56$INPUT );
                }
                finally
                {
                  stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
                }
              }
              if( ( !( stream.isStream() ) ) )
              {
                Errors.error( $str57$Unable_to_open__S, filename_var );
              }
              {
                SubLObject stream_11 = stream;
                SubLObject count = reader.read( stream_11, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                checkType( count, $sym63$NON_NEGATIVE_INTEGER_P );
                result = count;
              }
            }
            finally
            {
              {
                SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  if( stream.isStream() )
                  {
                    streams_high.close( stream, UNPROVIDED );
                  }
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
                }
              }
            }
            discard_dump_filename( filename_var );
          }
        }
        return result;
      }
    }
  }
  //@SubL(source = "cycl/dumper.lisp", position = 31364)
  // public static SubLSymbol $kb_dump_common_symbols$ = null;

  @SubL(source = "cycl/dumper.lisp", position = 32660)
  public static final SubLObject load_special_objects(SubLObject directory_path)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject special_objects_file = kb_dump_file( $str66$special, directory_path, UNPROVIDED );
        SubLObject ans = NIL;
        if( ( NIL != verify_file_existence( special_objects_file, UNPROVIDED ) ) )
        {
          {
            SubLObject _prev_bind_0 = utilities_macros.$noting_progress_start_time$.currentBinding( thread );
            try
            {
              utilities_macros.$noting_progress_start_time$.bind( Time.get_universal_time(), thread );
              utilities_macros.noting_progress_preamble( $str67$Loading_special_objects___ );
              {
                SubLObject filename_var = special_objects_file;
                SubLObject stream = NIL;
                try
                {
                  {
                    SubLObject _prev_bind_0_15 = stream_macros.$stream_requires_locking$.currentBinding( thread );
                    try
                    {
                      stream_macros.$stream_requires_locking$.bind( NIL, thread );
                      stream = compatibility.open_binary( filename_var, $kw56$INPUT );
                    }
                    finally
                    {
                      stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_15, thread );
                    }
                  }
                  if( ( !( stream.isStream() ) ) )
                  {
                    Errors.error( $str57$Unable_to_open__S, filename_var );
                  }
                  {
                    SubLObject stream_16 = stream;
                    {
                      SubLObject _prev_bind_0_17 = cfasl.$cfasl_common_symbols$.currentBinding( thread );
                      try
                      {
                        cfasl.$cfasl_common_symbols$.bind( NIL, thread );
                        cfasl.cfasl_set_common_symbols( NIL );
                        load_copyright( stream_16 );
                        ans = cfasl.cfasl_input( stream_16, UNPROVIDED, UNPROVIDED );
                      }
                      finally
                      {
                        cfasl.$cfasl_common_symbols$.rebind( _prev_bind_0_17, thread );
                      }
                    }
                  }
                }
                finally
                {
                  {
                    SubLObject _prev_bind_0_18 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                    try
                    {
                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                      if( stream.isStream() )
                      {
                        streams_high.close( stream, UNPROVIDED );
                      }
                    }
                    finally
                    {
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_18, thread );
                    }
                  }
                }
                discard_dump_filename( filename_var );
              }
              utilities_macros.noting_progress_postamble();
            }
            finally
            {
              utilities_macros.$noting_progress_start_time$.rebind( _prev_bind_0, thread );
            }
          }
        }
        return ans;
      }
    }
  }

  /**
   * An accessor for load-special-objects, currently required by HL module
   * stores. Also quieter than load-special-objects since callers should print
   * their own progress at a higher level.
   */
  @SubL(source = "cycl/dumper.lisp", position = 33112)
  public static final SubLObject load_kb_product_shared_symbols(SubLObject directory_path)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = $dump_verbose$.currentBinding( thread );
          SubLObject _prev_bind_1 = utilities_macros.$silent_progressP$.currentBinding( thread );
          try
          {
            $dump_verbose$.bind( NIL, thread );
            utilities_macros.$silent_progressP$.bind( T, thread );
            result = load_special_objects( directory_path );
          }
          finally
          {
            utilities_macros.$silent_progressP$.rebind( _prev_bind_1, thread );
            $dump_verbose$.rebind( _prev_bind_0, thread );
          }
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/dumper.lisp", position = 33522)
  public static final SubLObject setup_kb_state_from_dump(SubLObject directory_path)
  {
    {
      SubLObject constant_count = load_constant_count( directory_path );
      SubLObject nart_count = load_nart_count( directory_path );
      SubLObject assertion_count = load_assertion_count( directory_path );
      SubLObject deduction_count = load_deduction_count( directory_path );
      SubLObject kb_hl_support_count = load_kb_hl_support_count( directory_path );
      SubLObject clause_struc_count = load_clause_struc_count( directory_path );
      SubLObject kb_unrepresented_term_count = load_kb_unrepresented_term_count( directory_path );
      checkType( constant_count, $sym68$INTEGERP );
      if( ( ( NIL != nart_count ) && ( NIL != assertion_count ) && ( NIL != deduction_count ) && ( NIL != kb_hl_support_count ) && ( NIL != clause_struc_count ) && ( NIL != kb_unrepresented_term_count ) ) )
      {
        kb_utilities.setup_kb_tables_int( T, constant_count, nart_count, assertion_count, deduction_count, kb_hl_support_count, clause_struc_count, kb_unrepresented_term_count );
        kb_utilities.clear_kb_state_int();
      }
      else
      {
        Errors.handleMissingMethodError( "This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4883" );
      }
    }
    return NIL;
  }

  /**
   * @return 0 integerp; the constant count
   * @return 1 booleanp; whether the constants are dense
   */
  @SubL(source = "cycl/dumper.lisp", position = 35362)
  public static final SubLObject load_constant_count(SubLObject directory_path)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject count = load_kb_object_count( directory_path, $str69$constant_count );
        if( ( NIL != count ) )
        {
          return Values.values( count, T );
        }
        else
        {
          {
            SubLObject result = NIL;
            SubLObject cfasl_file = kb_dump_file( $str70$constant_shell, directory_path, UNPROVIDED );
            if( ( NIL != verify_file_existence( cfasl_file, UNPROVIDED ) ) )
            {
              {
                SubLObject filename_var = cfasl_file;
                SubLObject stream = NIL;
                try
                {
                  {
                    SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
                    try
                    {
                      stream_macros.$stream_requires_locking$.bind( NIL, thread );
                      stream = compatibility.open_binary( filename_var, $kw56$INPUT );
                    }
                    finally
                    {
                      stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
                    }
                  }
                  if( ( !( stream.isStream() ) ) )
                  {
                    Errors.error( $str57$Unable_to_open__S, filename_var );
                  }
                  {
                    SubLObject stream_23 = stream;
                    load_copyright( stream_23 );
                    {
                      SubLObject constant_count = cfasl.cfasl_input( stream_23, UNPROVIDED, UNPROVIDED );
                      result = constant_count;
                    }
                  }
                }
                finally
                {
                  {
                    SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                    try
                    {
                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                      if( stream.isStream() )
                      {
                        streams_high.close( stream, UNPROVIDED );
                      }
                    }
                    finally
                    {
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
                    }
                  }
                }
                discard_dump_filename( filename_var );
              }
            }
            return Values.values( result, NIL );
          }
        }
      }
    }
  }

  @SubL(source = "cycl/dumper.lisp", position = 36058)
  public static final SubLObject load_constant_shells(SubLObject directory_path)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject cfasl_file = kb_dump_file( $str70$constant_shell, directory_path, UNPROVIDED );
        if( ( NIL != verify_file_existence( cfasl_file, UNPROVIDED ) ) )
        {
          {
            SubLObject filename_var = cfasl_file;
            SubLObject stream = NIL;
            try
            {
              {
                SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
                try
                {
                  stream_macros.$stream_requires_locking$.bind( NIL, thread );
                  stream = compatibility.open_binary( filename_var, $kw56$INPUT );
                }
                finally
                {
                  stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
                }
              }
              if( ( !( stream.isStream() ) ) )
              {
                Errors.error( $str57$Unable_to_open__S, filename_var );
              }
              {
                SubLObject stream_24 = stream;
                SubLObject total = streams_high.file_length( stream_24 );
                load_copyright( stream_24 );
                {
                  SubLObject constant_count = cfasl.cfasl_input( stream_24, UNPROVIDED, UNPROVIDED );
                }
                {
                  SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
                  SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
                  SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
                  SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
                  try
                  {
                    utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
                    utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
                    utilities_macros.$within_noting_percent_progress$.bind( T, thread );
                    utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
                    utilities_macros.noting_percent_progress_preamble( $str73$Loading_constant_shells );
                    {
                      SubLObject dump_id = NIL;
                      for( dump_id = cfasl.cfasl_input( stream_24, NIL, UNPROVIDED ); ( dump_id != $kw58$EOF ); dump_id = cfasl.cfasl_input( stream_24, NIL, UNPROVIDED ) )
                      {
                        utilities_macros.note_percent_progress( compatibility.get_file_position( stream_24 ), total );
                        if( dump_id.isInteger() )
                        {
                          load_constant_shell( dump_id, stream_24 );
                        }
                      }
                    }
                    utilities_macros.noting_percent_progress_postamble();
                  }
                  finally
                  {
                    utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_3, thread );
                    utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_2, thread );
                    utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1, thread );
                    utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
                  }
                }
              }
            }
            finally
            {
              {
                SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  if( stream.isStream() )
                  {
                    streams_high.close( stream, UNPROVIDED );
                  }
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
                }
              }
            }
            discard_dump_filename( filename_var );
          }
        }
      }
      thread.resetMultipleValues();
      {
        SubLObject constant_count = load_constant_count( directory_path );
        SubLObject exactP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( ( NIL == exactP ) )
        {
          constant_count = NIL;
        }
        constant_handles.finalize_constants( constant_count );
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/dumper.lisp", position = 37583)
  public static final SubLObject load_constant_shell(SubLObject dump_id, SubLObject stream)
  {
    {
      SubLObject name = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
      SubLObject guid = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
      return load_constant_shell_internal( dump_id, name, guid );
    }
  }

  @SubL(source = "cycl/dumper.lisp", position = 37766)
  public static final SubLObject load_constant_shell_internal(SubLObject dump_id, SubLObject name, SubLObject guid)
  {
    {
      SubLObject constant = constant_handles.make_constant_shell( name, T );
      constants_low.load_install_constant_ids( constant, dump_id, guid );
      return constant;
    }
  }

  @SubL(source = "cycl/dumper.lisp", position = 39148)
  public static final SubLObject load_nart_shells(SubLObject directory_path)
  {
    {
      SubLObject nart_count = load_nart_count( directory_path );
      if( ( NIL != nart_count ) )
      {
        initialize_nart_shells( nart_count );
      }
      else
      {
        Errors.handleMissingMethodError( "This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10574" );
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/dumper.lisp", position = 39371)
  public static final SubLObject load_nart_count(SubLObject directory_path)
  {
    return load_kb_object_count( directory_path, $str74$nart_count );
  }

  @SubL(source = "cycl/dumper.lisp", position = 39490)
  public static final SubLObject initialize_nart_shells(SubLObject nart_count)
  {
    {
      SubLObject id = NIL;
      for( id = ZERO_INTEGER; id.numL( nart_count ); id = Numbers.add( id, ONE_INTEGER ) )
      {
        nart_handles.make_nart_shell( id );
      }
    }
    return nart_handles.finalize_narts( nart_count );
  }

  @SubL(source = "cycl/dumper.lisp", position = 40796)
  public static final SubLObject load_assertion_shells(SubLObject directory_path)
  {
    {
      SubLObject assertion_count = load_assertion_count( directory_path );
      if( ( NIL != assertion_count ) )
      {
        initialize_assertion_shells( assertion_count );
      }
      else
      {
        Errors.handleMissingMethodError( "This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10565" );
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/dumper.lisp", position = 41054)
  public static final SubLObject load_assertion_count(SubLObject directory_path)
  {
    return load_kb_object_count( directory_path, $str77$assertion_count );
  }

  @SubL(source = "cycl/dumper.lisp", position = 41183)
  public static final SubLObject initialize_assertion_shells(SubLObject assertion_count)
  {
    {
      SubLObject id = NIL;
      for( id = ZERO_INTEGER; id.numL( assertion_count ); id = Numbers.add( id, ONE_INTEGER ) )
      {
        assertion_handles.make_assertion_shell( id );
      }
    }
    assertion_handles.finalize_assertions( assertion_count );
    return NIL;
  }

  @SubL(source = "cycl/dumper.lisp", position = 42620)
  public static final SubLObject load_kb_hl_support_shells(SubLObject directory_path)
  {
    {
      SubLObject kb_hl_support_count = load_kb_hl_support_count( directory_path );
      if( ( NIL != kb_hl_support_count ) )
      {
        initialize_kb_hl_support_shells( kb_hl_support_count );
      }
      else
      {
        Errors.handleMissingMethodError( "This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10567" );
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/dumper.lisp", position = 42906)
  public static final SubLObject load_kb_hl_support_count(SubLObject directory_path)
  {
    return load_kb_object_count( directory_path, $str80$kb_hl_support_count );
  }

  @SubL(source = "cycl/dumper.lisp", position = 43045)
  public static final SubLObject initialize_kb_hl_support_shells(SubLObject kb_hl_support_count)
  {
    {
      SubLObject id = NIL;
      for( id = ZERO_INTEGER; id.numL( kb_hl_support_count ); id = Numbers.add( id, ONE_INTEGER ) )
      {
        kb_hl_supports.make_kb_hl_support_shell( id );
      }
    }
    return kb_hl_supports.finalize_kb_hl_supports( kb_hl_support_count );
  }

  @SubL(source = "cycl/dumper.lisp", position = 44976)
  public static final SubLObject load_kb_unrepresented_terms(SubLObject directory_path)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject cfasl_file = kb_dump_file( $str84$unrepresented_terms, directory_path, UNPROVIDED );
        if( ( NIL != verify_file_existence( cfasl_file, T ) ) )
        {
          {
            SubLObject filename_var = cfasl_file;
            SubLObject stream = NIL;
            try
            {
              {
                SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
                try
                {
                  stream_macros.$stream_requires_locking$.bind( NIL, thread );
                  stream = compatibility.open_binary( filename_var, $kw56$INPUT );
                }
                finally
                {
                  stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
                }
              }
              if( ( !( stream.isStream() ) ) )
              {
                Errors.error( $str57$Unable_to_open__S, filename_var );
              }
              {
                SubLObject stream_36 = stream;
                SubLObject total = streams_high.file_length( stream_36 );
                load_copyright( stream_36 );
                {
                  SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
                  SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
                  SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
                  SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
                  try
                  {
                    utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
                    utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
                    utilities_macros.$within_noting_percent_progress$.bind( T, thread );
                    utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
                    utilities_macros.noting_percent_progress_preamble( $str86$Loading_KB_unrepresented_terms );
                    {
                      SubLObject dump_id = NIL;
                      for( dump_id = cfasl.cfasl_input( stream_36, NIL, UNPROVIDED ); ( dump_id != $kw58$EOF ); dump_id = cfasl.cfasl_input( stream_36, NIL, UNPROVIDED ) )
                      {
                        utilities_macros.note_percent_progress( compatibility.get_file_position( stream_36 ), total );
                        if( dump_id.isInteger() )
                        {
                          load_kb_unrepresented_term( dump_id, stream_36 );
                        }
                      }
                    }
                    utilities_macros.noting_percent_progress_postamble();
                  }
                  finally
                  {
                    utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_3, thread );
                    utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_2, thread );
                    utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1, thread );
                    utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
                  }
                }
              }
            }
            finally
            {
              {
                SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  if( stream.isStream() )
                  {
                    streams_high.close( stream, UNPROVIDED );
                  }
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
                }
              }
            }
            discard_dump_filename( filename_var );
          }
        }
      }
      {
        SubLObject unrepresented_term_count = load_kb_unrepresented_term_count( directory_path );
        unrepresented_terms.finalize_unrepresented_terms( unrepresented_term_count );
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/dumper.lisp", position = 46007)
  public static final SubLObject load_kb_unrepresented_term(SubLObject dump_id, SubLObject stream)
  {
    {
      SubLObject v_term = cfasl.cfasl_input( stream, NIL, UNPROVIDED );
      if( ( NIL != kb_indexing_datastructures.indexed_unrepresented_term_p( v_term ) ) )
      {
        unrepresented_terms.register_unrepresented_term_suid( v_term, dump_id );
        return v_term;
      }
      else
      {
        return NIL;
      }
    }
  }

  @SubL(source = "cycl/dumper.lisp", position = 46276)
  public static final SubLObject load_kb_unrepresented_term_count(SubLObject directory_path)
  {
    return load_kb_object_count( directory_path, $str83$unrepresented_term_count );
  }

  @SubL(source = "cycl/dumper.lisp", position = 47058)
  public static final SubLObject load_clause_struc_defs(SubLObject directory_path)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject cfasl_file = kb_dump_file( $str88$clause_struc, directory_path, UNPROVIDED );
        if( ( NIL != verify_file_existence( cfasl_file, UNPROVIDED ) ) )
        {
          {
            SubLObject filename_var = cfasl_file;
            SubLObject stream = NIL;
            try
            {
              {
                SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
                try
                {
                  stream_macros.$stream_requires_locking$.bind( NIL, thread );
                  stream = compatibility.open_binary( filename_var, $kw56$INPUT );
                }
                finally
                {
                  stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
                }
              }
              if( ( !( stream.isStream() ) ) )
              {
                Errors.error( $str57$Unable_to_open__S, filename_var );
              }
              {
                SubLObject stream_41 = stream;
                SubLObject total = streams_high.file_length( stream_41 );
                load_copyright( stream_41 );
                {
                  SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
                  SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
                  SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
                  SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
                  try
                  {
                    utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
                    utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
                    utilities_macros.$within_noting_percent_progress$.bind( T, thread );
                    utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
                    utilities_macros.noting_percent_progress_preamble( $str90$Loading_clause_struc_definitions );
                    {
                      SubLObject dump_id = NIL;
                      for( dump_id = cfasl.cfasl_input( stream_41, NIL, UNPROVIDED ); ( dump_id != $kw58$EOF ); dump_id = cfasl.cfasl_input( stream_41, NIL, UNPROVIDED ) )
                      {
                        utilities_macros.note_percent_progress( compatibility.get_file_position( stream_41 ), total );
                        if( dump_id.isInteger() )
                        {
                          load_clause_struc_def( dump_id, stream_41 );
                        }
                      }
                    }
                    utilities_macros.noting_percent_progress_postamble();
                  }
                  finally
                  {
                    utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_3, thread );
                    utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_2, thread );
                    utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1, thread );
                    utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
                  }
                }
              }
            }
            finally
            {
              {
                SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  if( stream.isStream() )
                  {
                    streams_high.close( stream, UNPROVIDED );
                  }
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
                }
              }
            }
            discard_dump_filename( filename_var );
          }
        }
      }
      {
        SubLObject clause_struc_count = load_clause_struc_count( directory_path );
        clause_strucs.finalize_clause_strucs( clause_struc_count );
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/dumper.lisp", position = 48179)
  public static final SubLObject load_clause_struc_def(SubLObject dump_id, SubLObject stream)
  {
    {
      SubLObject cnf = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
      SubLObject clause_struc = clause_strucs.make_clause_struc_shell( cnf, dump_id );
      clause_strucs.reset_clause_struc_assertions( clause_struc, cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
      return clause_struc;
    }
  }

  @SubL(source = "cycl/dumper.lisp", position = 48466)
  public static final SubLObject load_clause_struc_count(SubLObject directory_path)
  {
    return load_kb_object_count( directory_path, $str87$clause_struc_count );
  }

  @SubL(source = "cycl/dumper.lisp", position = 49434)
  public static final SubLObject load_deduction_defs(SubLObject directory_path)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject deduction_cfasl_file = kb_dump_file( $str92$deduction, directory_path, UNPROVIDED );
        SubLObject deduction_index_file = kb_dump_file( $str93$deduction_index, directory_path, UNPROVIDED );
        if( ( ( NIL == $force_monolithic_kb_assumption$.getGlobalValue() ) && ( NIL != Filesys.probe_file( deduction_index_file ) ) ) )
        {
          // PrintLow.format(T, $str95$__Deduction_definitions_will_be_s,
          // deduction_cfasl_file, deduction_index_file);
          {
            SubLObject max_dump_id = NIL;
            {
              SubLObject _prev_bind_0 = utilities_macros.$structure_resourcing_make_static$.currentBinding( thread );
              SubLObject _prev_bind_1 = cfasl.$cfasl_input_to_static_area$.currentBinding( thread );
              try
              {
                utilities_macros.$structure_resourcing_make_static$.bind( NIL, thread );
                cfasl.$cfasl_input_to_static_area$.bind( NIL, thread );
                max_dump_id = file_vector.file_vector_length_from_index( deduction_index_file );
              }
              finally
              {
                cfasl.$cfasl_input_to_static_area$.rebind( _prev_bind_1, thread );
                utilities_macros.$structure_resourcing_make_static$.rebind( _prev_bind_0, thread );
              }
            }
            utilities_macros.$progress_note$.setDynamicValue( $str96$Initializing_deduction_handles_on, thread );
            utilities_macros.$progress_start_time$.setDynamicValue( Time.get_universal_time(), thread );
            utilities_macros.$progress_total$.setDynamicValue( max_dump_id, thread );
            utilities_macros.$progress_sofar$.setDynamicValue( ZERO_INTEGER, thread );
            {
              SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
              SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
              SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
              SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
              try
              {
                utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
                utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
                utilities_macros.$within_noting_percent_progress$.bind( T, thread );
                utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
                utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
                {
                  SubLObject dump_id = NIL;
                  for( dump_id = ZERO_INTEGER; dump_id.numL( utilities_macros.$progress_total$.getDynamicValue( thread ) ); dump_id = Numbers.add( dump_id, ONE_INTEGER ) )
                  {
                    utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
                    utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
                    {
                      SubLObject _prev_bind_0_48 = utilities_macros.$structure_resourcing_make_static$.currentBinding( thread );
                      SubLObject _prev_bind_1_49 = cfasl.$cfasl_input_to_static_area$.currentBinding( thread );
                      try
                      {
                        utilities_macros.$structure_resourcing_make_static$.bind( T, thread );
                        cfasl.$cfasl_input_to_static_area$.bind( T, thread );
                        deduction_handles.make_deduction_shell( dump_id );
                      }
                      finally
                      {
                        cfasl.$cfasl_input_to_static_area$.rebind( _prev_bind_1_49, thread );
                        utilities_macros.$structure_resourcing_make_static$.rebind( _prev_bind_0_48, thread );
                      }
                    }
                  }
                }
                utilities_macros.noting_percent_progress_postamble();
              }
              finally
              {
                utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_3, thread );
                utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_2, thread );
                utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1, thread );
                utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
              }
            }
          }
          deduction_manager.initialize_deduction_hl_store_cache();
        }
        else if( ( NIL != verify_file_existence( deduction_cfasl_file, UNPROVIDED ) ) )
        {
          {
            SubLObject deduction_file = deduction_cfasl_file;
            SubLObject filename_var = deduction_file;
            SubLObject stream = NIL;
            try
            {
              {
                SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
                try
                {
                  stream_macros.$stream_requires_locking$.bind( NIL, thread );
                  stream = compatibility.open_binary( filename_var, $kw56$INPUT );
                }
                finally
                {
                  stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
                }
              }
              if( ( !( stream.isStream() ) ) )
              {
                Errors.error( $str57$Unable_to_open__S, filename_var );
              }
              {
                SubLObject stream_50 = stream;
                SubLObject total = streams_high.file_length( stream_50 );
                load_copyright( stream_50 );
                {
                  SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
                  SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
                  SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
                  SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
                  try
                  {
                    utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
                    utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
                    utilities_macros.$within_noting_percent_progress$.bind( T, thread );
                    utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
                    utilities_macros.noting_percent_progress_preamble( $str97$Loading_deduction_definitions );
                    {
                      SubLObject dump_id = NIL;
                      for( dump_id = cfasl.cfasl_input( stream_50, NIL, UNPROVIDED ); ( dump_id != $kw58$EOF ); dump_id = cfasl.cfasl_input( stream_50, NIL, UNPROVIDED ) )
                      {
                        utilities_macros.note_percent_progress( compatibility.get_file_position( stream_50 ), total );
                        if( dump_id.isInteger() )
                        {
                          deduction_handles.make_deduction_shell( dump_id );
                          load_deduction_def( dump_id, stream_50 );
                        }
                      }
                    }
                    utilities_macros.noting_percent_progress_postamble();
                  }
                  finally
                  {
                    utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_3, thread );
                    utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_2, thread );
                    utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1, thread );
                    utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
                  }
                }
              }
            }
            finally
            {
              {
                SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  if( stream.isStream() )
                  {
                    streams_high.close( stream, UNPROVIDED );
                  }
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
                }
              }
            }
            discard_dump_filename( filename_var );
          }
        }
      }
      {
        SubLObject deduction_count = load_deduction_count( directory_path );
        deduction_handles.finalize_deductions( deduction_count );
      } 
      return NIL;
    }
  }

  @SubL(source = "cycl/dumper.lisp", position = 51621)
  public static final SubLObject load_deduction_def(SubLObject dump_id, SubLObject stream)
  {
    {
      SubLObject deduction = deductions_high.find_deduction_by_dump_id( dump_id );
      deductions_low.load_deduction_content( deduction, stream );
      return deduction;
    }
  }

  @SubL(source = "cycl/dumper.lisp", position = 51841)
  public static final SubLObject load_deduction_def_from_cache(SubLObject dump_id, SubLObject stream)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject deduction = NIL;
        {
          SubLObject _prev_bind_0 = cfasl.$within_cfasl_externalization$.currentBinding( thread );
          try
          {
            cfasl.$within_cfasl_externalization$.bind( NIL, thread );
            deduction = load_deduction_def( dump_id, stream );
          }
          finally
          {
            cfasl.$within_cfasl_externalization$.rebind( _prev_bind_0, thread );
          }
        }
        return deduction;
      }
    }
  }

  public static final class $load_deduction_def_from_cache$BinaryFunction
      extends
        BinaryFunction
  {
    public $load_deduction_def_from_cache$BinaryFunction()
    {
      super( extractFunctionNamed( "LOAD-DEDUCTION-DEF-FROM-CACHE" ) );
    }

    @Override
    public SubLObject processItem(SubLObject arg1, SubLObject arg2)
    {
      return load_deduction_def_from_cache( arg1, arg2 );
    }
  }

  @SubL(source = "cycl/dumper.lisp", position = 52051)
  public static final SubLObject load_deduction_count(SubLObject directory_path)
  {
    return load_kb_object_count( directory_path, $str91$deduction_count );
  }

  @SubL(source = "cycl/dumper.lisp", position = 52887)
  public static final SubLObject load_assertion_defs(SubLObject directory_path)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject assertion_cfasl_file = kb_dump_file( $str99$assertion, directory_path, UNPROVIDED );
        SubLObject assertion_index_file = kb_dump_file( $str100$assertion_index, directory_path, UNPROVIDED );
        if( ( ( NIL == $force_monolithic_kb_assumption$.getGlobalValue() ) && ( NIL != Filesys.probe_file( assertion_index_file ) ) ) )
        {
          // PrintLow.format(T, $str102$__Assertion_definitions_will_be_s,
          // assertion_cfasl_file, assertion_index_file);
          assertion_manager.initialize_assertion_hl_store_cache();
        }
        else if( ( NIL != verify_file_existence( assertion_cfasl_file, UNPROVIDED ) ) )
        {
          {
            SubLObject assertion_file = assertion_cfasl_file;
            SubLObject filename_var = assertion_file;
            SubLObject stream = NIL;
            try
            {
              {
                SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
                try
                {
                  stream_macros.$stream_requires_locking$.bind( NIL, thread );
                  stream = compatibility.open_binary( filename_var, $kw56$INPUT );
                }
                finally
                {
                  stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
                }
              }
              if( ( !( stream.isStream() ) ) )
              {
                Errors.error( $str57$Unable_to_open__S, filename_var );
              }
              {
                SubLObject stream_57 = stream;
                SubLObject total = streams_high.file_length( stream_57 );
                load_copyright( stream_57 );
                {
                  SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
                  SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
                  SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
                  SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
                  try
                  {
                    utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
                    utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
                    utilities_macros.$within_noting_percent_progress$.bind( T, thread );
                    utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
                    utilities_macros.noting_percent_progress_preamble( $str103$Loading_assertion_definitions );
                    {
                      SubLObject dump_id = NIL;
                      for( dump_id = cfasl.cfasl_input( stream_57, NIL, UNPROVIDED ); ( dump_id != $kw58$EOF ); dump_id = cfasl.cfasl_input( stream_57, NIL, UNPROVIDED ) )
                      {
                        utilities_macros.note_percent_progress( compatibility.get_file_position( stream_57 ), total );
                        if( dump_id.isInteger() )
                        {
                          load_assertion_def( dump_id, stream_57 );
                        }
                      }
                    }
                    utilities_macros.noting_percent_progress_postamble();
                  }
                  finally
                  {
                    utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_3, thread );
                    utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_2, thread );
                    utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1, thread );
                    utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
                  }
                }
              }
            }
            finally
            {
              {
                SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  if( stream.isStream() )
                  {
                    streams_high.close( stream, UNPROVIDED );
                  }
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
                }
              }
            }
            discard_dump_filename( filename_var );
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/dumper.lisp", position = 54631)
  public static final SubLObject load_assertion_def(SubLObject dump_id, SubLObject stream)
  {
    {
      SubLObject assertion = assertions_high.find_assertion_by_dump_id( dump_id );
      assertions_low.load_assertion_content( assertion, stream );
      return assertion;
    }
  }

  @SubL(source = "cycl/dumper.lisp", position = 54810)
  public static final SubLObject load_assertion_def_from_cache(SubLObject dump_id, SubLObject stream)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject assertion = NIL;
        {
          SubLObject _prev_bind_0 = cfasl.$within_cfasl_externalization$.currentBinding( thread );
          try
          {
            cfasl.$within_cfasl_externalization$.bind( NIL, thread );
            assertion = load_assertion_def( dump_id, stream );
          }
          finally
          {
            cfasl.$within_cfasl_externalization$.rebind( _prev_bind_0, thread );
          }
        }
        return assertion;
      }
    }
  }

  public static final class $load_assertion_def_from_cache$BinaryFunction
      extends
        BinaryFunction
  {
    public $load_assertion_def_from_cache$BinaryFunction()
    {
      super( extractFunctionNamed( "LOAD-ASSERTION-DEF-FROM-CACHE" ) );
    }

    @Override
    public SubLObject processItem(SubLObject arg1, SubLObject arg2)
    {
      return load_assertion_def_from_cache( arg1, arg2 );
    }
  }

  @SubL(source = "cycl/dumper.lisp", position = 55808)
  public static final SubLObject load_kb_hl_support_defs(SubLObject directory_path)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject cfasl_file = kb_dump_file( $str105$kb_hl_support, directory_path, UNPROVIDED );
        SubLObject index_file = kb_dump_file( $str106$kb_hl_support_index, directory_path, UNPROVIDED );
        if( ( ( NIL == $force_monolithic_kb_assumption$.getGlobalValue() ) && ( NIL != Filesys.probe_file( index_file ) ) ) )
        {
          // PrintLow.format(T, $str108$__KB_HL_supports_will_be_swapped_,
          // cfasl_file, index_file);
          kb_hl_support_manager.initialize_kb_hl_support_hl_store_cache();
        }
        else if( ( NIL != verify_file_existence( cfasl_file, T ) ) )
        {
          {
            SubLObject filename_var = cfasl_file;
            SubLObject stream = NIL;
            try
            {
              {
                SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
                try
                {
                  stream_macros.$stream_requires_locking$.bind( NIL, thread );
                  stream = compatibility.open_binary( filename_var, $kw56$INPUT );
                }
                finally
                {
                  stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
                }
              }
              if( ( !( stream.isStream() ) ) )
              {
                Errors.error( $str57$Unable_to_open__S, filename_var );
              }
              {
                SubLObject stream_64 = stream;
                SubLObject total = kb_hl_supports.kb_hl_support_count();
                SubLObject sofar = ZERO_INTEGER;
                load_copyright( stream_64 );
                {
                  SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
                  SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
                  SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
                  SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
                  try
                  {
                    utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
                    utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
                    utilities_macros.$within_noting_percent_progress$.bind( T, thread );
                    utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
                    utilities_macros.noting_percent_progress_preamble( $str109$Loading_KB_HL_support_definitions );
                    {
                      SubLObject dump_id = NIL;
                      for( dump_id = cfasl.cfasl_input( stream_64, NIL, UNPROVIDED ); ( dump_id != $kw58$EOF ); dump_id = cfasl.cfasl_input( stream_64, NIL, UNPROVIDED ) )
                      {
                        sofar = Numbers.add( sofar, ONE_INTEGER );
                        utilities_macros.note_percent_progress( sofar, total );
                        if( dump_id.isInteger() )
                        {
                          load_kb_hl_support_def( dump_id, stream_64 );
                        }
                      }
                    }
                    utilities_macros.noting_percent_progress_postamble();
                  }
                  finally
                  {
                    utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_3, thread );
                    utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_2, thread );
                    utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1, thread );
                    utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
                  }
                }
              }
            }
            finally
            {
              {
                SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  if( stream.isStream() )
                  {
                    streams_high.close( stream, UNPROVIDED );
                  }
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
                }
              }
            }
            discard_dump_filename( filename_var );
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/dumper.lisp", position = 57057)
  public static final SubLObject load_kb_hl_support_def(SubLObject dump_id, SubLObject stream)
  {
    {
      SubLObject kb_hl_support = kb_hl_supports.find_kb_hl_support_by_dump_id( dump_id );
      kb_hl_supports.load_kb_hl_support_content( kb_hl_support, stream );
      return kb_hl_support;
    }
  }

  @SubL(source = "cycl/dumper.lisp", position = 57307)
  public static final SubLObject load_kb_hl_support_def_from_cache(SubLObject dump_id, SubLObject stream)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject index = NIL;
        {
          SubLObject _prev_bind_0 = cfasl.$within_cfasl_externalization$.currentBinding( thread );
          try
          {
            cfasl.$within_cfasl_externalization$.bind( NIL, thread );
            index = load_kb_hl_support_def( dump_id, stream );
          }
          finally
          {
            cfasl.$within_cfasl_externalization$.rebind( _prev_bind_0, thread );
          }
        }
        return index;
      }
    }
  }

  @SubL(source = "cycl/dumper.lisp", position = 57855)
  public static final SubLObject load_kb_hl_support_indexing(SubLObject directory_path)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject index_file = kb_dump_file( $str111$kb_hl_support_indexing, directory_path, UNPROVIDED );
        if( ( NIL != verify_file_existence( index_file, T ) ) )
        {
          {
            SubLObject _prev_bind_0 = utilities_macros.$noting_progress_start_time$.currentBinding( thread );
            try
            {
              utilities_macros.$noting_progress_start_time$.bind( Time.get_universal_time(), thread );
              utilities_macros.noting_progress_preamble( $str113$Loading_KB_HL_support_indexing___ );
              kb_hl_supports.load_kb_hl_support_indexing_int( index_file );
              utilities_macros.noting_progress_postamble();
            }
            finally
            {
              utilities_macros.$noting_progress_start_time$.rebind( _prev_bind_0, thread );
            }
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/dumper.lisp", position = 59485)
  public static final SubLObject load_bookkeeping_assertions(SubLObject directory_path)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject cfasl_file = kb_dump_file( $str114$bookkeeping_assertions, directory_path, UNPROVIDED );
        if( ( NIL != verify_file_existence( cfasl_file, UNPROVIDED ) ) )
        {
          {
            SubLObject _prev_bind_0 = utilities_macros.$noting_progress_start_time$.currentBinding( thread );
            try
            {
              utilities_macros.$noting_progress_start_time$.bind( Time.get_universal_time(), thread );
              utilities_macros.noting_progress_preamble( $str117$Loading_bookkeeping_assertions___ );
              {
                SubLObject filename_var = cfasl_file;
                SubLObject stream = NIL;
                try
                {
                  {
                    SubLObject _prev_bind_0_68 = stream_macros.$stream_requires_locking$.currentBinding( thread );
                    try
                    {
                      stream_macros.$stream_requires_locking$.bind( NIL, thread );
                      stream = compatibility.open_binary( filename_var, $kw56$INPUT );
                    }
                    finally
                    {
                      stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_68, thread );
                    }
                  }
                  if( ( !( stream.isStream() ) ) )
                  {
                    Errors.error( $str57$Unable_to_open__S, filename_var );
                  }
                  {
                    SubLObject stream_69 = stream;
                    SubLObject total = streams_high.file_length( stream_69 );
                    load_copyright( stream_69 );
                    bookkeeping_store.dumper_clear_bookkeeping_binary_gaf_store();
                    {
                      SubLObject num_bookkeeping_preds = cfasl.cfasl_input( stream_69, UNPROVIDED, UNPROVIDED );
                      SubLObject n = NIL;
                      for( n = ZERO_INTEGER; n.numL( num_bookkeeping_preds ); n = Numbers.add( n, ONE_INTEGER ) )
                      {
                        load_bookkeeping_assertions_for_pred( stream_69 );
                      }
                    }
                    cfasl.cfasl_input( stream_69, UNPROVIDED, UNPROVIDED );
                    cfasl.cfasl_input( stream_69, UNPROVIDED, UNPROVIDED );
                    cfasl.cfasl_input( stream_69, UNPROVIDED, UNPROVIDED );
                    if( ( cfasl.cfasl_input( stream_69, NIL, $kw58$EOF ) != $kw58$EOF ) )
                    {
                      Errors.warn( $str59$_d_bytes_of_unread_stuff_in__S, Numbers.subtract( total, compatibility.get_file_position( stream_69 ) ), cfasl_file );
                    }
                  }
                }
                finally
                {
                  {
                    SubLObject _prev_bind_0_70 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                    try
                    {
                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                      if( stream.isStream() )
                      {
                        streams_high.close( stream, UNPROVIDED );
                      }
                    }
                    finally
                    {
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_70, thread );
                    }
                  }
                }
                discard_dump_filename( filename_var );
              }
              utilities_macros.noting_progress_postamble();
            }
            finally
            {
              utilities_macros.$noting_progress_start_time$.rebind( _prev_bind_0, thread );
            }
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/dumper.lisp", position = 60547)
  public static final SubLObject load_bookkeeping_assertions_for_pred(SubLObject stream)
  {
    {
      SubLObject pred = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
      SubLObject num_assertions = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
      SubLObject i = NIL;
      for( i = ZERO_INTEGER; i.numL( num_assertions ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        load_bookkeeping_assertion( pred, stream );
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/dumper.lisp", position = 60876)
  public static final SubLObject load_bookkeeping_assertion(SubLObject pred, SubLObject stream)
  {
    {
      SubLObject arg1 = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
      SubLObject arg2 = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
      bookkeeping_store.dumper_load_bookkeeping_binary_gaf( pred, arg1, arg2 );
    }
    return NIL;
  }

  @SubL(source = "cycl/dumper.lisp", position = 61698)
  public static final SubLObject load_experience(SubLObject directory_path)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject _prev_bind_0 = utilities_macros.$noting_progress_start_time$.currentBinding( thread );
        try
        {
          utilities_macros.$noting_progress_start_time$.bind( Time.get_universal_time(), thread );
          utilities_macros.noting_progress_preamble( $str119$Loading_rule_utility_experience__ );
          load_rule_utility_experience( directory_path );
          utilities_macros.noting_progress_postamble();
        }
        finally
        {
          utilities_macros.$noting_progress_start_time$.rebind( _prev_bind_0, thread );
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/dumper.lisp", position = 61908)
  public static final SubLObject load_rule_utility_experience(SubLObject directory_path)
  {
    {
      SubLObject experience_file = kb_dump_file( $str30$rule_utility_experience, directory_path, UNPROVIDED );
      if( ( NIL != verify_file_existence( experience_file, T ) ) )
      {
       // inference_analysis.load_transformation_rule_statistics( experience_file, NIL );
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/dumper.lisp", position = 63897)
  public static final SubLObject load_kb_indexing(SubLObject directory_path)
  {
    load_constant_indices( directory_path );
    kb_load_gc_checkpoint();
    load_nart_indices( directory_path );
    kb_load_gc_checkpoint();
    load_unrepresented_term_indices( directory_path );
    kb_load_gc_checkpoint();
    load_assertion_indices( directory_path );
    kb_load_gc_checkpoint();
    load_auxiliary_indices_file( directory_path );
    kb_load_gc_checkpoint();
    load_bookkeeping_indices_file( directory_path );
    kb_load_gc_checkpoint();
    load_kb_hl_support_indexing( directory_path );
    kb_load_gc_checkpoint();
    return NIL;
  }

  @SubL(source = "cycl/dumper.lisp", position = 65814)
  public static final SubLObject load_constant_indices(SubLObject directory_path)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject cfasl_file = kb_dump_file( $str120$indices, directory_path, UNPROVIDED );
        SubLObject index_file = kb_dump_file( $str121$indices_index, directory_path, UNPROVIDED );
        if( ( ( NIL == $force_monolithic_kb_assumption$.getGlobalValue() ) && ( NIL != Filesys.probe_file( index_file ) ) ) )
        {
          // PrintLow.format(T, $str123$__Constant_indexing_will_be_swapp,
          // cfasl_file, index_file);
          constant_index_manager.initialize_constant_index_hl_store_cache();
        }
        else if( ( NIL != verify_file_existence( cfasl_file, UNPROVIDED ) ) )
        {
          {
            SubLObject filename_var = cfasl_file;
            SubLObject stream = NIL;
            try
            {
              {
                SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
                try
                {
                  stream_macros.$stream_requires_locking$.bind( NIL, thread );
                  stream = compatibility.open_binary( filename_var, $kw56$INPUT );
                }
                finally
                {
                  stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
                }
              }
              if( ( !( stream.isStream() ) ) )
              {
                Errors.error( $str57$Unable_to_open__S, filename_var );
              }
              {
                SubLObject stream_79 = stream;
                SubLObject total = constant_handles.constant_count();
                SubLObject sofar = ZERO_INTEGER;
                load_copyright( stream_79 );
                {
                  SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
                  SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
                  SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
                  SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
                  try
                  {
                    utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
                    utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
                    utilities_macros.$within_noting_percent_progress$.bind( T, thread );
                    utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
                    utilities_macros.noting_percent_progress_preamble( $str124$Loading_constant_indices );
                    {
                      SubLObject dump_id = NIL;
                      for( dump_id = cfasl.cfasl_input( stream_79, NIL, UNPROVIDED ); ( dump_id != $kw58$EOF ); dump_id = cfasl.cfasl_input( stream_79, NIL, UNPROVIDED ) )
                      {
                        sofar = Numbers.add( sofar, ONE_INTEGER );
                        utilities_macros.note_percent_progress( sofar, total );
                        if( dump_id.isInteger() )
                        {
                          load_constant_index( dump_id, stream_79 );
                        }
                      }
                    }
                    utilities_macros.noting_percent_progress_postamble();
                  }
                  finally
                  {
                    utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_3, thread );
                    utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_2, thread );
                    utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1, thread );
                    utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
                  }
                }
              }
            }
            finally
            {
              {
                SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  if( stream.isStream() )
                  {
                    streams_high.close( stream, UNPROVIDED );
                  }
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
                }
              }
            }
            discard_dump_filename( filename_var );
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/dumper.lisp", position = 67044)
  public static final SubLObject load_constant_index(SubLObject dump_id, SubLObject stream)
  {
    {
      SubLObject constant = constants_high.find_constant_by_dump_id( dump_id );
      return constants_low.reset_constant_index( constant, cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    }
  }

  @SubL(source = "cycl/dumper.lisp", position = 67219)
  public static final SubLObject load_constant_index_from_cache(SubLObject dump_id, SubLObject stream)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject index = NIL;
        {
          SubLObject _prev_bind_0 = cfasl.$within_cfasl_externalization$.currentBinding( thread );
          try
          {
            cfasl.$within_cfasl_externalization$.bind( NIL, thread );
            index = load_constant_index( dump_id, stream );
          }
          finally
          {
            cfasl.$within_cfasl_externalization$.rebind( _prev_bind_0, thread );
          }
        }
        return index;
      }
    }
  }

  @SubL(source = "cycl/dumper.lisp", position = 68075)
  public static final SubLObject load_nart_indices(SubLObject directory_path)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject cfasl_file = kb_dump_file( $str126$nat_indices, directory_path, UNPROVIDED );
        SubLObject index_file = kb_dump_file( $str127$nat_indices_index, directory_path, UNPROVIDED );
        if( ( ( NIL == $force_monolithic_kb_assumption$.getGlobalValue() ) && ( NIL != Filesys.probe_file( index_file ) ) ) )
        {
          // PrintLow.format(T, $str129$__NART_indexing_will_be_swapped_i,
          // cfasl_file, index_file);
          nart_index_manager.initialize_nart_index_hl_store_cache();
        }
        else if( ( NIL != verify_file_existence( cfasl_file, UNPROVIDED ) ) )
        {
          {
            SubLObject filename_var = cfasl_file;
            SubLObject stream = NIL;
            try
            {
              {
                SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
                try
                {
                  stream_macros.$stream_requires_locking$.bind( NIL, thread );
                  stream = compatibility.open_binary( filename_var, $kw56$INPUT );
                }
                finally
                {
                  stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
                }
              }
              if( ( !( stream.isStream() ) ) )
              {
                Errors.error( $str57$Unable_to_open__S, filename_var );
              }
              {
                SubLObject stream_86 = stream;
                SubLObject total = nart_handles.nart_count();
                SubLObject sofar = ZERO_INTEGER;
                load_copyright( stream_86 );
                {
                  SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
                  SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
                  SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
                  SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
                  try
                  {
                    utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
                    utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
                    utilities_macros.$within_noting_percent_progress$.bind( T, thread );
                    utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
                    utilities_macros.noting_percent_progress_preamble( $str130$Loading_NART_indices );
                    {
                      SubLObject dump_id = NIL;
                      for( dump_id = cfasl.cfasl_input( stream_86, NIL, UNPROVIDED ); ( dump_id != $kw58$EOF ); dump_id = cfasl.cfasl_input( stream_86, NIL, UNPROVIDED ) )
                      {
                        sofar = Numbers.add( sofar, ONE_INTEGER );
                        utilities_macros.note_percent_progress( sofar, total );
                        if( dump_id.isInteger() )
                        {
                          Errors.handleMissingMethodError( "This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10571" );
                        }
                      }
                    }
                    utilities_macros.noting_percent_progress_postamble();
                  }
                  finally
                  {
                    utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_3, thread );
                    utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_2, thread );
                    utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1, thread );
                    utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
                  }
                }
              }
            }
            finally
            {
              {
                SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  if( stream.isStream() )
                  {
                    streams_high.close( stream, UNPROVIDED );
                  }
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
                }
              }
            }
            discard_dump_filename( filename_var );
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/dumper.lisp", position = 70438)
  public static final SubLObject load_unrepresented_term_indices(SubLObject directory_path)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject cfasl_file = kb_dump_file( $str132$unrepresented_term_indices, directory_path, UNPROVIDED );
        SubLObject index_file = kb_dump_file( $str133$unrepresented_term_indices_index, directory_path, UNPROVIDED );
        if( ( ( NIL == $force_monolithic_kb_assumption$.getGlobalValue() ) && ( NIL != Filesys.probe_file( index_file ) ) ) )
        {
          // PrintLow.format(T, $str135$__Unrepresented_term_indexing_wil,
          // cfasl_file, index_file);
          unrepresented_term_index_manager.initialize_unrepresented_term_index_hl_store_cache();
        }
        else if( ( NIL != verify_file_existence( cfasl_file, T ) ) )
        {
          {
            SubLObject filename_var = cfasl_file;
            SubLObject stream = NIL;
            try
            {
              {
                SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
                try
                {
                  stream_macros.$stream_requires_locking$.bind( NIL, thread );
                  stream = compatibility.open_binary( filename_var, $kw56$INPUT );
                }
                finally
                {
                  stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
                }
              }
              if( ( !( stream.isStream() ) ) )
              {
                Errors.error( $str57$Unable_to_open__S, filename_var );
              }
              {
                SubLObject stream_93 = stream;
                SubLObject total = unrepresented_terms.kb_unrepresented_term_count();
                SubLObject sofar = ZERO_INTEGER;
                load_copyright( stream_93 );
                {
                  SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
                  SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
                  SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
                  SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
                  try
                  {
                    utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
                    utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
                    utilities_macros.$within_noting_percent_progress$.bind( T, thread );
                    utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
                    utilities_macros.noting_percent_progress_preamble( $str136$Loading_unrepresented_term_indice );
                    {
                      SubLObject dump_id = NIL;
                      for( dump_id = cfasl.cfasl_input( stream_93, NIL, UNPROVIDED ); ( dump_id != $kw58$EOF ); dump_id = cfasl.cfasl_input( stream_93, NIL, UNPROVIDED ) )
                      {
                        sofar = Numbers.add( sofar, ONE_INTEGER );
                        utilities_macros.note_percent_progress( sofar, total );
                        if( dump_id.isInteger() )
                        {
                          load_unrepresented_term_index( dump_id, stream_93 );
                        }
                      }
                    }
                    utilities_macros.noting_percent_progress_postamble();
                  }
                  finally
                  {
                    utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_3, thread );
                    utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_2, thread );
                    utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1, thread );
                    utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
                  }
                }
              }
            }
            finally
            {
              {
                SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  if( stream.isStream() )
                  {
                    streams_high.close( stream, UNPROVIDED );
                  }
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
                }
              }
            }
            discard_dump_filename( filename_var );
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/dumper.lisp", position = 71836)
  public static final SubLObject load_unrepresented_term_index(SubLObject dump_id, SubLObject stream)
  {
    {
      SubLObject unrepresented_term = unrepresented_terms.find_unrepresented_term_by_dump_id( dump_id );
      return unrepresented_terms.reset_unrepresented_term_index( unrepresented_term, cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ), UNPROVIDED );
    }
  }

  @SubL(source = "cycl/dumper.lisp", position = 72061)
  public static final SubLObject load_unrepresented_term_index_from_cache(SubLObject dump_id, SubLObject stream)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject index = NIL;
        {
          SubLObject _prev_bind_0 = cfasl.$within_cfasl_externalization$.currentBinding( thread );
          try
          {
            cfasl.$within_cfasl_externalization$.bind( NIL, thread );
            index = load_unrepresented_term_index( dump_id, stream );
          }
          finally
          {
            cfasl.$within_cfasl_externalization$.rebind( _prev_bind_0, thread );
          }
        }
        return index;
      }
    }
  }

  @SubL(source = "cycl/dumper.lisp", position = 72783)
  public static final SubLObject load_assertion_indices(SubLObject directory_path)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject cfasl_file = kb_dump_file( $str138$assertion_indices, directory_path, UNPROVIDED );
        if( ( NIL != verify_file_existence( cfasl_file, UNPROVIDED ) ) )
        {
          {
            SubLObject filename_var = cfasl_file;
            SubLObject stream = NIL;
            try
            {
              {
                SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
                try
                {
                  stream_macros.$stream_requires_locking$.bind( NIL, thread );
                  stream = compatibility.open_binary( filename_var, $kw56$INPUT );
                }
                finally
                {
                  stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
                }
              }
              if( ( !( stream.isStream() ) ) )
              {
                Errors.error( $str57$Unable_to_open__S, filename_var );
              }
              {
                SubLObject stream_98 = stream;
                SubLObject total = streams_high.file_length( stream_98 );
                load_copyright( stream_98 );
                {
                  SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
                  SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
                  SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
                  SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
                  try
                  {
                    utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
                    utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
                    utilities_macros.$within_noting_percent_progress$.bind( T, thread );
                    utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
                    utilities_macros.noting_percent_progress_preamble( $str140$Loading_assertion_indices );
                    {
                      SubLObject dump_id = NIL;
                      for( dump_id = cfasl.cfasl_input( stream_98, NIL, UNPROVIDED ); ( dump_id != $kw58$EOF ); dump_id = cfasl.cfasl_input( stream_98, NIL, UNPROVIDED ) )
                      {
                        utilities_macros.note_percent_progress( compatibility.get_file_position( stream_98 ), total );
                        if( dump_id.isInteger() )
                        {
                          load_assertion_index( dump_id, stream_98 );
                        }
                      }
                    }
                    utilities_macros.noting_percent_progress_postamble();
                  }
                  finally
                  {
                    utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_3, thread );
                    utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_2, thread );
                    utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1, thread );
                    utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
                  }
                }
              }
            }
            finally
            {
              {
                SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  if( stream.isStream() )
                  {
                    streams_high.close( stream, UNPROVIDED );
                  }
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
                }
              }
            }
            discard_dump_filename( filename_var );
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/dumper.lisp", position = 73659)
  public static final SubLObject load_assertion_index(SubLObject dump_id, SubLObject stream)
  {
    {
      SubLObject assertion = assertions_high.find_assertion_by_dump_id( dump_id );
      return assertions_low.reset_assertion_index( assertion, cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    }
  }

  @SubL(source = "cycl/dumper.lisp", position = 74271)
  public static final SubLObject load_auxiliary_indices_file(SubLObject directory_path)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject cfasl_file = kb_dump_file( $str141$auxiliary_indices, directory_path, UNPROVIDED );
        if( ( NIL != verify_file_existence( cfasl_file, UNPROVIDED ) ) )
        {
          {
            SubLObject filename_var = cfasl_file;
            SubLObject stream = NIL;
            try
            {
              {
                SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
                try
                {
                  stream_macros.$stream_requires_locking$.bind( NIL, thread );
                  stream = compatibility.open_binary( filename_var, $kw56$INPUT );
                }
                finally
                {
                  stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
                }
              }
              if( ( !( stream.isStream() ) ) )
              {
                Errors.error( $str57$Unable_to_open__S, filename_var );
              }
              {
                SubLObject stream_100 = stream;
                SubLObject total = streams_high.file_length( stream_100 );
                load_copyright( stream_100 );
                {
                  SubLObject _prev_bind_0 = utilities_macros.$noting_progress_start_time$.currentBinding( thread );
                  try
                  {
                    utilities_macros.$noting_progress_start_time$.bind( Time.get_universal_time(), thread );
                    utilities_macros.noting_progress_preamble( $str143$Loading_auxiliary_indices );
                    auxiliary_indexing.load_auxiliary_indices( stream_100 );
                    if( ( cfasl.cfasl_input( stream_100, NIL, $kw58$EOF ) != $kw58$EOF ) )
                    {
                      Errors.warn( $str59$_d_bytes_of_unread_stuff_in__S, Numbers.subtract( total, compatibility.get_file_position( stream_100 ) ), cfasl_file );
                    }
                    utilities_macros.noting_progress_postamble();
                  }
                  finally
                  {
                    utilities_macros.$noting_progress_start_time$.rebind( _prev_bind_0, thread );
                  }
                }
              }
            }
            finally
            {
              {
                SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  if( stream.isStream() )
                  {
                    streams_high.close( stream, UNPROVIDED );
                  }
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
                }
              }
            }
            discard_dump_filename( filename_var );
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/dumper.lisp", position = 75336)
  public static final SubLObject load_bookkeeping_indices_file(SubLObject directory_path)
  {
    return load_unit_file( directory_path, $str144$bookkeeping_indices, $sym146$LOAD_BOOKKEEPING_INDICES, $str147$Loading_bookkeeping_indices___ );
  }

  @SubL(source = "cycl/dumper.lisp", position = 75655)
  public static final SubLObject load_bookkeeping_indices(SubLObject stream)
  {
    {
      SubLObject index = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
      bookkeeping_store.dumper_load_bookkeeping_index( index );
    }
    return NIL;
  }

  @SubL(source = "cycl/dumper.lisp", position = 76171)
  public static final SubLObject load_rule_set(SubLObject directory_path)
  {
    return load_unit_file( directory_path, $str148$rule_set, $sym150$LOAD_RULE_SET_FROM_STREAM, $str151$Loading_rule_set___ );
  }

  @SubL(source = "cycl/dumper.lisp", position = 77130)
  public static final SubLObject load_nart_hl_formulas(SubLObject directory_path)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject nart_hl_formula_cfasl_file = kb_dump_file( $str152$nart_hl_formula, directory_path, UNPROVIDED );
        SubLObject nart_hl_formula_index_file = kb_dump_file( $str153$nart_hl_formula_index, directory_path, UNPROVIDED );
        if( ( ( NIL == $force_monolithic_kb_assumption$.getGlobalValue() ) && ( NIL != Filesys.probe_file( nart_hl_formula_index_file ) ) ) )
        {
          // PrintLow.format(T, $str157$__NART_HL_formulas_will_be_swappe,
          // nart_hl_formula_cfasl_file, nart_hl_formula_index_file);
          nart_hl_formula_manager.initialize_nart_hl_formula_hl_store_cache();
        }
        else if( ( NIL != verify_file_existence( nart_hl_formula_cfasl_file, T ) ) )
        {
          {
            SubLObject nart_hl_formula_file = nart_hl_formula_cfasl_file;
            SubLObject filename_var = nart_hl_formula_file;
            SubLObject stream = NIL;
            try
            {
              {
                SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
                try
                {
                  stream_macros.$stream_requires_locking$.bind( NIL, thread );
                  stream = compatibility.open_binary( filename_var, $kw56$INPUT );
                }
                finally
                {
                  stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
                }
              }
              if( ( !( stream.isStream() ) ) )
              {
                Errors.error( $str57$Unable_to_open__S, filename_var );
              }
              {
                SubLObject stream_112 = stream;
                SubLObject total = streams_high.file_length( stream_112 );
                load_copyright( stream_112 );
                {
                  SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
                  SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
                  SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
                  SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
                  try
                  {
                    utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
                    utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
                    utilities_macros.$within_noting_percent_progress$.bind( T, thread );
                    utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
                    utilities_macros.noting_percent_progress_preamble( $str158$Loading_nart_hl_formula_definitio );
                    {
                      SubLObject dump_id = NIL;
                      for( dump_id = cfasl.cfasl_input( stream_112, NIL, UNPROVIDED ); ( dump_id != $kw58$EOF ); dump_id = cfasl.cfasl_input( stream_112, NIL, UNPROVIDED ) )
                      {
                        utilities_macros.note_percent_progress( compatibility.get_file_position( stream_112 ), total );
                        if( dump_id.isInteger() )
                        {
                          Errors.handleMissingMethodError( "This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10568" );
                        }
                      }
                    }
                    utilities_macros.noting_percent_progress_postamble();
                  }
                  finally
                  {
                    utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_3, thread );
                    utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_2, thread );
                    utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1, thread );
                    utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
                  }
                }
              }
            }
            finally
            {
              {
                SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  if( stream.isStream() )
                  {
                    streams_high.close( stream, UNPROVIDED );
                  }
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
                }
              }
            }
            discard_dump_filename( filename_var );
          }
        }
      }
      return NIL;
    }
  }

  public static final class $load_nart_hl_formula_from_cache$BinaryFunction
      extends
        BinaryFunction
  {
    public $load_nart_hl_formula_from_cache$BinaryFunction()
    {
      super( extractFunctionNamed( "LOAD-NART-HL-FORMULA-FROM-CACHE" ) );
    }

    @Override
    public SubLObject processItem(SubLObject arg1, SubLObject arg2)
    {
      return Errors.handleMissingMethodError( "This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10570" );
    }
  }

  @SubL(source = "cycl/dumper.lisp", position = 80024)
  public static final SubLObject load_miscellaneous(SubLObject directory_path)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject cfasl_file = kb_dump_file( $str159$misc, directory_path, UNPROVIDED );
        if( ( NIL != verify_file_existence( cfasl_file, UNPROVIDED ) ) )
        {
          {
            SubLObject filename_var = cfasl_file;
            SubLObject stream = NIL;
            try
            {
              {
                SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
                try
                {
                  stream_macros.$stream_requires_locking$.bind( NIL, thread );
                  stream = compatibility.open_binary( filename_var, $kw56$INPUT );
                }
                finally
                {
                  stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
                }
              }
              if( ( !( stream.isStream() ) ) )
              {
                Errors.error( $str57$Unable_to_open__S, filename_var );
              }
              {
                SubLObject stream_114 = stream;
                SubLObject total = streams_high.file_length( stream_114 );
                load_copyright( stream_114 );
                {
                  SubLObject _prev_bind_0 = utilities_macros.$noting_progress_start_time$.currentBinding( thread );
                  try
                  {
                    utilities_macros.$noting_progress_start_time$.bind( Time.get_universal_time(), thread );
                    utilities_macros.noting_progress_preamble( $str161$Loading_miscellaneous_stuff___ );
                    cfasl.cfasl_input( stream_114, UNPROVIDED, UNPROVIDED );
                    czer_vars.$skolem_axiom_table$.setGlobalValue( cfasl.cfasl_input( stream_114, UNPROVIDED, UNPROVIDED ) );
                    cfasl.cfasl_input( stream_114, UNPROVIDED, UNPROVIDED );
                    control_vars.set_build_kb_loaded( cfasl.cfasl_input( stream_114, UNPROVIDED, UNPROVIDED ) );
                    if( ( cfasl.cfasl_input( stream_114, NIL, $kw58$EOF ) != $kw58$EOF ) )
                    {
                      Errors.warn( $str59$_d_bytes_of_unread_stuff_in__S, Numbers.subtract( total, compatibility.get_file_position( stream_114 ) ), cfasl_file );
                    }
                    utilities_macros.noting_progress_postamble();
                  }
                  finally
                  {
                    utilities_macros.$noting_progress_start_time$.rebind( _prev_bind_0, thread );
                  }
                }
              }
            }
            finally
            {
              {
                SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  if( stream.isStream() )
                  {
                    streams_high.close( stream, UNPROVIDED );
                  }
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
                }
              }
            }
            discard_dump_filename( filename_var );
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/dumper.lisp", position = 84202)
  public static final SubLObject load_sbhl_data(SubLObject directory_path)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject cfasl_file = kb_dump_file( $str162$sbhl_modules, directory_path, UNPROVIDED );
        SubLObject data_file = kb_dump_file( $str163$sbhl_module_graphs, directory_path, UNPROVIDED );
        SubLObject index_file = kb_dump_file( $str164$sbhl_module_graphs_index, directory_path, UNPROVIDED );
        if( ( NIL != verify_file_existence( cfasl_file, UNPROVIDED ) ) )
        {
          if( ( ( NIL != verify_file_existence( data_file, $kw168$WARN_ONLY ) ) && ( NIL != verify_file_existence( index_file, $kw168$WARN_ONLY ) ) ) )
          {
            sbhl_graphs.initialize_sbhl_graph_caches_during_load_kb( data_file, index_file );
          }
          {
            SubLObject filename_var = cfasl_file;
            SubLObject stream = NIL;
            try
            {
              {
                SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
                try
                {
                  stream_macros.$stream_requires_locking$.bind( NIL, thread );
                  stream = compatibility.open_binary( filename_var, $kw56$INPUT );
                }
                finally
                {
                  stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
                }
              }
              if( ( !( stream.isStream() ) ) )
              {
                Errors.error( $str57$Unable_to_open__S, filename_var );
              }
              {
                SubLObject stream_117 = stream;
                SubLObject total = streams_high.file_length( stream_117 );
                load_copyright( stream_117 );
                {
                  SubLObject graph_count = cfasl.cfasl_input( stream_117, UNPROVIDED, UNPROVIDED );
                  {
                    SubLObject _prev_bind_0 = cfasl.$cfasl_stream_extensions_enabled$.currentBinding( thread );
                    SubLObject _prev_bind_1 = cfasl.$cfasl_unread_byte$.currentBinding( thread );
                    SubLObject _prev_bind_2 = utilities_macros.$noting_progress_start_time$.currentBinding( thread );
                    try
                    {
                      cfasl.$cfasl_stream_extensions_enabled$.bind( T, thread );
                      cfasl.$cfasl_unread_byte$.bind( NIL, thread );
                      utilities_macros.$noting_progress_start_time$.bind( Time.get_universal_time(), thread );
                      utilities_macros.noting_progress_preamble( $str169$Loading_SBHL_graphs___ );
                      sbhl_module_declarations.initialize_sbhl_modules( T );
                      {
                        SubLObject n = NIL;
                        for( n = ZERO_INTEGER; n.numL( graph_count ); n = Numbers.add( n, ONE_INTEGER ) )
                        {
                          if( ( cfasl.cfasl_opcode_peek( stream_117, UNPROVIDED, UNPROVIDED ) == $int170$30 ) )
                          {
                            {
                              SubLObject predicate = cfasl.cfasl_input( stream_117, UNPROVIDED, UNPROVIDED );
                              SubLObject graph = cfasl.cfasl_input( stream_117, UNPROVIDED, UNPROVIDED );
                              SubLObject module = sbhl_module_vars.get_sbhl_module( predicate );
                              if( ( ( NIL != constant_handles.valid_constantP( predicate, UNPROVIDED ) ) && graph.isHashtable() && ( NIL != sbhl_module_vars.sbhl_module_p( module ) ) ) )
                              {
                                sbhl_module_vars.set_sbhl_module_property( module, $kw171$GRAPH, graph );
                              }
                            }
                          }
                        }
                      }
                      if( ( NIL != sbhl_module_vars.get_sbhl_modules() ) )
                      {
                        sbhl_module_declarations.note_sbhl_modules_initialized();
                      }
                      load_sbhl_miscellany( stream_117 );
                      if( ( cfasl.cfasl_input( stream_117, NIL, $kw58$EOF ) != $kw58$EOF ) )
                      {
                        Errors.warn( $str59$_d_bytes_of_unread_stuff_in__S, Numbers.subtract( total, compatibility.get_file_position( stream_117 ) ), cfasl_file );
                      }
                      utilities_macros.noting_progress_postamble();
                    }
                    finally
                    {
                      utilities_macros.$noting_progress_start_time$.rebind( _prev_bind_2, thread );
                      cfasl.$cfasl_unread_byte$.rebind( _prev_bind_1, thread );
                      cfasl.$cfasl_stream_extensions_enabled$.rebind( _prev_bind_0, thread );
                    }
                  }
                }
              }
            }
            finally
            {
              {
                SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  if( stream.isStream() )
                  {
                    streams_high.close( stream, UNPROVIDED );
                  }
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
                }
              }
            }
            discard_dump_filename( filename_var );
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/dumper.lisp", position = 87805)
  public static final SubLObject load_sbhl_miscellany(SubLObject stream)
  {
    {
      SubLObject token = NIL;
      while ( ( $kw172$END != token ))
      {
        token = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
        if( token.isHashtable() )
        {
          sbhl_link_methods.$isa_arg2_naut_table$.setGlobalValue( token );
          Errors.handleMissingMethodError( "This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1805" );
          token = $kw172$END;
        }
        else
        {
          {
            SubLObject pcase_var = token;
            if( pcase_var.eql( $kw173$ISA_ARG2_NAUT_TABLE ) )
            {
              load_isa_arg2_naut_table( stream );
            }
            else if( pcase_var.eql( $kw174$NON_FORT_ISA_TABLE ) )
            {
              load_non_fort_isa_table( stream );
            }
            else if( pcase_var.eql( $kw175$NON_FORT_INSTANCE_TABLE ) )
            {
              load_non_fort_instance_table( stream );
            }
            else if( pcase_var.eql( $kw172$END ) )
            {
            }
            else
            {
              Errors.warn( $str176$Could_not_handle_SBHL_miscellany_, token );
            }
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/dumper.lisp", position = 88672)
  public static final SubLObject load_isa_arg2_naut_table(SubLObject stream)
  {
    sbhl_link_methods.$isa_arg2_naut_table$.setGlobalValue( cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    return NIL;
  }

  @SubL(source = "cycl/dumper.lisp", position = 88789)
  public static final SubLObject load_non_fort_isa_table(SubLObject stream)
  {
    sbhl_link_methods.set_non_fort_isa_table( cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    return NIL;
  }

  @SubL(source = "cycl/dumper.lisp", position = 88900)
  public static final SubLObject load_non_fort_instance_table(SubLObject stream)
  {
    sbhl_link_methods.set_non_fort_instance_table( cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    return NIL;
  }

  @SubL(source = "cycl/dumper.lisp", position = 89689)
  public static final SubLObject load_sbhl_cache(SubLObject directory_path)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject cfasl_file = kb_dump_file( $str177$sbhl_cache, directory_path, UNPROVIDED );
        if( ( NIL != verify_file_existence( cfasl_file, UNPROVIDED ) ) )
        {
          {
            SubLObject filename_var = cfasl_file;
            SubLObject stream = NIL;
            try
            {
              {
                SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
                try
                {
                  stream_macros.$stream_requires_locking$.bind( NIL, thread );
                  stream = compatibility.open_binary( filename_var, $kw56$INPUT );
                }
                finally
                {
                  stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
                }
              }
              if( ( !( stream.isStream() ) ) )
              {
                Errors.error( $str57$Unable_to_open__S, filename_var );
              }
              {
                SubLObject stream_119 = stream;
                SubLObject total = streams_high.file_length( stream_119 );
                load_copyright( stream_119 );
                {
                  SubLObject _prev_bind_0 = utilities_macros.$noting_progress_start_time$.currentBinding( thread );
                  try
                  {
                    utilities_macros.$noting_progress_start_time$.bind( Time.get_universal_time(), thread );
                    utilities_macros.noting_progress_preamble( $str179$Loading_SBHL_cache___ );
                    sbhl_cache.$isa_cache$.setGlobalValue( cfasl.cfasl_input( stream_119, UNPROVIDED, UNPROVIDED ) );
                    sbhl_cache.$all_mts_isa_cache$.setGlobalValue( cfasl.cfasl_input( stream_119, UNPROVIDED, UNPROVIDED ) );
                    sbhl_cache.$genls_cache$.setGlobalValue( cfasl.cfasl_input( stream_119, UNPROVIDED, UNPROVIDED ) );
                    sbhl_cache.$all_mts_genls_cache$.setGlobalValue( cfasl.cfasl_input( stream_119, UNPROVIDED, UNPROVIDED ) );
                    sbhl_cache.$genl_predicate_cache$.setGlobalValue( cfasl.cfasl_input( stream_119, UNPROVIDED, UNPROVIDED ) );
                    sbhl_cache.$genl_inverse_cache$.setGlobalValue( cfasl.cfasl_input( stream_119, UNPROVIDED, UNPROVIDED ) );
                    sbhl_cache.$all_mts_genl_predicate_cache$.setGlobalValue( cfasl.cfasl_input( stream_119, UNPROVIDED, UNPROVIDED ) );
                    sbhl_cache.$all_mts_genl_inverse_cache$.setGlobalValue( cfasl.cfasl_input( stream_119, UNPROVIDED, UNPROVIDED ) );
                    sbhl_cache.note_sbhl_caches_initialized();
                    if( ( cfasl.cfasl_input( stream_119, NIL, $kw58$EOF ) != $kw58$EOF ) )
                    {
                      Errors.warn( $str59$_d_bytes_of_unread_stuff_in__S, Numbers.subtract( total, compatibility.get_file_position( stream_119 ) ), cfasl_file );
                    }
                    utilities_macros.noting_progress_postamble();
                  }
                  finally
                  {
                    utilities_macros.$noting_progress_start_time$.rebind( _prev_bind_0, thread );
                  }
                }
              }
            }
            finally
            {
              {
                SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  if( stream.isStream() )
                  {
                    streams_high.close( stream, UNPROVIDED );
                  }
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
                }
              }
            }
            discard_dump_filename( filename_var );
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/dumper.lisp", position = 91232)
  public static final SubLObject load_cardinality_estimates(SubLObject directory_path)
  {
    return load_unit_file( directory_path, $str180$cardinality_estimates, $sym182$LOAD_CARDINALITY_ESTIMATES_FROM_STREAM, $str183$Loading_cardinality_estimates___ );
  }
  //@SubL(source = "cycl/dumper.lisp", position = 91433)
  // public static SubLSymbol $compute_arg_type_cache_on_dumpP$ = null;

  @SubL(source = "cycl/dumper.lisp", position = 92271)
  public static final SubLObject load_arg_type_cache(SubLObject directory_path)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject cfasl_file = kb_dump_file( $str185$arg_type_cache, directory_path, UNPROVIDED );
        if( ( NIL != verify_file_existence( cfasl_file, T ) ) )
        {
          {
            SubLObject filename_var = cfasl_file;
            SubLObject stream = NIL;
            try
            {
              {
                SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
                try
                {
                  stream_macros.$stream_requires_locking$.bind( NIL, thread );
                  stream = compatibility.open_binary( filename_var, $kw56$INPUT );
                }
                finally
                {
                  stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
                }
              }
              if( ( !( stream.isStream() ) ) )
              {
                Errors.error( $str57$Unable_to_open__S, filename_var );
              }
              {
                SubLObject stream_122 = stream;
                SubLObject total = streams_high.file_length( stream_122 );
                load_copyright( stream_122 );
                {
                  SubLObject _prev_bind_0 = utilities_macros.$noting_progress_start_time$.currentBinding( thread );
                  try
                  {
                    utilities_macros.$noting_progress_start_time$.bind( Time.get_universal_time(), thread );
                    utilities_macros.noting_progress_preamble( $str187$Loading_arg_type_cache___ );
                    {
                      SubLObject dummy = NIL;
                      at_cache.$arg_type_cache$.setGlobalValue( cfasl.cfasl_input( stream_122, UNPROVIDED, UNPROVIDED ) );
                      dummy = cfasl.cfasl_input( stream_122, UNPROVIDED, UNPROVIDED );
                      dummy = cfasl.cfasl_input( stream_122, UNPROVIDED, UNPROVIDED );
                      dummy = cfasl.cfasl_input( stream_122, UNPROVIDED, UNPROVIDED );
                    }
                    at_cache.note_at_cache_initialized();
                    if( ( cfasl.cfasl_input( stream_122, NIL, $kw58$EOF ) != $kw58$EOF ) )
                    {
                      Errors.warn( $str59$_d_bytes_of_unread_stuff_in__S, Numbers.subtract( total, compatibility.get_file_position( stream_122 ) ), cfasl_file );
                    }
                    utilities_macros.noting_progress_postamble();
                  }
                  finally
                  {
                    utilities_macros.$noting_progress_start_time$.rebind( _prev_bind_0, thread );
                  }
                }
              }
            }
            finally
            {
              {
                SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  if( stream.isStream() )
                  {
                    streams_high.close( stream, UNPROVIDED );
                  }
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
                }
              }
            }
            discard_dump_filename( filename_var );
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/dumper.lisp", position = 93674)
  public static final SubLObject load_defns_cache(SubLObject directory_path)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject cfasl_file = kb_dump_file( $str189$defns_cache, directory_path, UNPROVIDED );
        if( ( NIL != verify_file_existence( cfasl_file, T ) ) )
        {
          {
            SubLObject filename_var = cfasl_file;
            SubLObject stream = NIL;
            try
            {
              {
                SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
                try
                {
                  stream_macros.$stream_requires_locking$.bind( NIL, thread );
                  stream = compatibility.open_binary( filename_var, $kw56$INPUT );
                }
                finally
                {
                  stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
                }
              }
              if( ( !( stream.isStream() ) ) )
              {
                Errors.error( $str57$Unable_to_open__S, filename_var );
              }
              {
                SubLObject stream_124 = stream;
                SubLObject total = streams_high.file_length( stream_124 );
                load_copyright( stream_124 );
                {
                  SubLObject _prev_bind_0 = utilities_macros.$noting_progress_start_time$.currentBinding( thread );
                  try
                  {
                    utilities_macros.$noting_progress_start_time$.bind( Time.get_universal_time(), thread );
                    utilities_macros.noting_progress_preamble( $str191$Loading_defns_cache___ );
                    defns.load_defns_cache_from_stream( stream_124 );
                    if( ( cfasl.cfasl_input( stream_124, NIL, $kw58$EOF ) != $kw58$EOF ) )
                    {
                      Errors.warn( $str59$_d_bytes_of_unread_stuff_in__S, Numbers.subtract( total, compatibility.get_file_position( stream_124 ) ), cfasl_file );
                    }
                    utilities_macros.noting_progress_postamble();
                  }
                  finally
                  {
                    utilities_macros.$noting_progress_start_time$.rebind( _prev_bind_0, thread );
                  }
                }
              }
            }
            finally
            {
              {
                SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  if( stream.isStream() )
                  {
                    streams_high.close( stream, UNPROVIDED );
                  }
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
                }
              }
            }
            discard_dump_filename( filename_var );
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/dumper.lisp", position = 95662)
  public static final SubLObject load_tva_cache(SubLObject dump_directory)
  {
    {
      SubLObject result = load_unit_file( dump_directory, $str192$tva_cache, $sym194$LOAD_TVA_CACHE_FROM_STREAM, $str195$Loading_TVA_cache___ );
      tva_cache.reconnect_tva_cache_registry( dump_directory, cfasl.cfasl_current_common_symbols() );
      return result;
    }
  }

  @SubL(source = "cycl/dumper.lisp", position = 102562)
  public static final SubLObject load_somewhere_cache(SubLObject directory_path)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject cfasl_file = kb_dump_file( $str196$somewhere_cache, directory_path, UNPROVIDED );
        if( ( NIL != verify_file_existence( cfasl_file, T ) ) )
        {
          {
            SubLObject filename_var = cfasl_file;
            SubLObject stream = NIL;
            try
            {
              {
                SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
                try
                {
                  stream_macros.$stream_requires_locking$.bind( NIL, thread );
                  stream = compatibility.open_binary( filename_var, $kw56$INPUT );
                }
                finally
                {
                  stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
                }
              }
              if( ( !( stream.isStream() ) ) )
              {
                Errors.error( $str57$Unable_to_open__S, filename_var );
              }
              {
                SubLObject stream_127 = stream;
                SubLObject total = streams_high.file_length( stream_127 );
                load_copyright( stream_127 );
                {
                  SubLObject _prev_bind_0 = utilities_macros.$noting_progress_start_time$.currentBinding( thread );
                  try
                  {
                    utilities_macros.$noting_progress_start_time$.bind( Time.get_universal_time(), thread );
                    utilities_macros.noting_progress_preamble( $str198$Loading_somewhere_cache___ );
                    somewhere_cache.load_somewhere_cache_from_stream( stream_127 );
                    if( ( cfasl.cfasl_input( stream_127, NIL, $kw58$EOF ) != $kw58$EOF ) )
                    {
                      Errors.warn( $str59$_d_bytes_of_unread_stuff_in__S, Numbers.subtract( total, compatibility.get_file_position( stream_127 ) ), cfasl_file );
                    }
                    utilities_macros.noting_progress_postamble();
                  }
                  finally
                  {
                    utilities_macros.$noting_progress_start_time$.rebind( _prev_bind_0, thread );
                  }
                }
              }
            }
            finally
            {
              {
                SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  if( stream.isStream() )
                  {
                    streams_high.close( stream, UNPROVIDED );
                  }
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
                }
              }
            }
            discard_dump_filename( filename_var );
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/dumper.lisp", position = 103602)
  public static final SubLObject load_arity_cache(SubLObject directory_path)
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject cfasl_file = kb_dump_file( $str199$arity_cache, directory_path, UNPROVIDED );
        if( ( NIL != verify_file_existence( cfasl_file, T ) ) )
        {
          {
            SubLObject filename_var = cfasl_file;
            SubLObject stream = NIL;
            try
            {
              {
                SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
                try
                {
                  stream_macros.$stream_requires_locking$.bind( NIL, thread );
                  stream = compatibility.open_binary( filename_var, $kw56$INPUT );
                }
                finally
                {
                  stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
                }
              }
              if( ( !( stream.isStream() ) ) )
              {
                Errors.error( $str57$Unable_to_open__S, filename_var );
              }
              {
                SubLObject stream_129 = stream;
                SubLObject total = streams_high.file_length( stream_129 );
                load_copyright( stream_129 );
                {
                  SubLObject _prev_bind_0 = utilities_macros.$noting_progress_start_time$.currentBinding( thread );
                  try
                  {
                    utilities_macros.$noting_progress_start_time$.bind( Time.get_universal_time(), thread );
                    utilities_macros.noting_progress_preamble( $str201$Loading_arity_cache___ );
                    arity.load_arity_cache_from_stream( stream_129 );
                    if( ( cfasl.cfasl_input( stream_129, NIL, $kw58$EOF ) != $kw58$EOF ) )
                    {
                      Errors.warn( $str59$_d_bytes_of_unread_stuff_in__S, Numbers.subtract( total, compatibility.get_file_position( stream_129 ) ), cfasl_file );
                    }
                    utilities_macros.noting_progress_postamble();
                  }
                  finally
                  {
                    utilities_macros.$noting_progress_start_time$.rebind( _prev_bind_0, thread );
                  }
                }
              }
            }
            finally
            {
              {
                SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  if( stream.isStream() )
                  {
                    streams_high.close( stream, UNPROVIDED );
                  }
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
                }
              }
            }
            discard_dump_filename( filename_var );
          }
        }
      }
      return NIL;
    }
  }

  /**
   * Initializations which should be run whenever the KB is loaded. Note that
   * the definition of initialization has stretched to include the building of
   * huge structures. Large structures must be loaded and dumped like other
   * large structure. Initialization need to be FAST to support starting up a
   * Cyc image without a world from units.
   */
  @SubL(source = "cycl/dumper.lisp", position = 111832)
  public static final SubLObject load_kb_initializations()
  {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if( ( NIL != $dump_verbose$.getDynamicValue( thread ) ) )
      {
        PrintLow.format( StreamsLow.$standard_output$.getDynamicValue( thread ), $str203$________Performing_KB_initializat, numeric_date_utilities.timestring( UNPROVIDED ) );
        streams_high.force_output( StreamsLow.$standard_output$.getDynamicValue( thread ) );
      }
      sbhl_module_vars.clean_sbhl_modules();
      kb_load_gc_checkpoint();
      constant_completion.compute_bogus_constant_names_in_code();
      kb_load_gc_checkpoint();
      kb_utilities.initialize_kb_state_hashes();
      kb_load_gc_checkpoint();
      ke.initialize_old_constant_names();
      kb_load_gc_checkpoint();
      utilities_macros.initialize_kb_variables();
      kb_load_gc_checkpoint();
      rebuild_computable_but_not_dumpable_yet();
      kb_load_gc_checkpoint();
      if( ( NIL == control_vars.non_tiny_kb_loadedP() ) )
      {
        system_parameters.$allow_guest_to_editP$.setDynamicValue( T, thread );
      }
      return NIL;
    }
  }

  /**
   * If the code is missing, assume the relevant portion of the KB is also
   * missing, because it won't matter if it's there.
   */
  @SubL(source = "cycl/dumper.lisp", position = 114015)
  public static final SubLObject initialize_kb_features()
  {
    kct_utils.initialize_kct_kb_feature();
    return NIL;
  }

  public static final SubLObject declare_dumper_file()
  {
    declareFunction( myName, "force_monolithic_kb_assumptionP", "FORCE-MONOLITHIC-KB-ASSUMPTION?", 0, 0, false );
    // declareMacro(myName, "with_kb_dump_ids", "WITH-KB-DUMP-IDS");
    // declareMacro(myName, "with_kb_load_ids", "WITH-KB-LOAD-IDS");
    // declareMacro(myName, "with_kb_load_area_allocation",
    // "WITH-KB-LOAD-AREA-ALLOCATION");
    // declareMacro(myName, "without_kb_load_area_allocation",
    // "WITHOUT-KB-LOAD-AREA-ALLOCATION");
    // declareMacro(myName, "with_kb_dump_filename", "WITH-KB-DUMP-FILENAME");
    // declareMacro(myName, "with_kb_dump_binary_file",
    // "WITH-KB-DUMP-BINARY-FILE");
    // declareMacro(myName, "with_kb_dump_text_file", "WITH-KB-DUMP-TEXT-FILE");
    declareFunction( myName, "discard_dump_filename", "DISCARD-DUMP-FILENAME", 1, 0, false );
    // declareFunction(myName, "kb_dump_directory", "KB-DUMP-DIRECTORY", 0, 2,
    // false);
    declareFunction( myName, "kb_dump_file", "KB-DUMP-FILE", 2, 1, false );
    // declareFunction(myName, "kb_dump_product_file", "KB-DUMP-PRODUCT-FILE",
    // 2, 1, false);
    // declareFunction(myName, "dump_estimated_size", "DUMP-ESTIMATED-SIZE", 0,
    // 1, false);
    declareFunction( myName, "verify_file_existence", "VERIFY-FILE-EXISTENCE", 1, 1, false );
    // declareFunction(myName, "validate_dump_directory",
    // "VALIDATE-DUMP-DIRECTORY", 1, 0, false);
    declareFunction( myName, "kb_load_gc_checkpoint", "KB-LOAD-GC-CHECKPOINT", 0, 0, false );
    // declareFunction(myName, "preprocess_experience_and_dump_standard_kb",
    // "PREPROCESS-EXPERIENCE-AND-DUMP-STANDARD-KB", 0, 3, false);
    // declareFunction(myName, "dump_standard_kb", "DUMP-STANDARD-KB", 0, 1,
    // false);
    // declareFunction(myName, "perform_standard_pre_dump_kb_cleanups",
    // "PERFORM-STANDARD-PRE-DUMP-KB-CLEANUPS", 0, 0, false);
    // declareFunction(myName, "perform_kb_cleanups", "PERFORM-KB-CLEANUPS", 0,
    // 0, false);
    // declareFunction(myName, "preprocess_experience", "PREPROCESS-EXPERIENCE",
    // 0, 2, false);
    // declareFunction(myName,
    // "preprocess_experience_and_dump_non_computable_kb",
    // "PREPROCESS-EXPERIENCE-AND-DUMP-NON-COMPUTABLE-KB", 0, 3, false);
    // declareFunction(myName, "dump_non_computable_kb",
    // "DUMP-NON-COMPUTABLE-KB", 1, 0, false);
    // declareFunction(myName,
    // "load_non_computable_kb_and_rebuild_computable_kb_and_write_image",
    // "LOAD-NON-COMPUTABLE-KB-AND-REBUILD-COMPUTABLE-KB-AND-WRITE-IMAGE", 3, 0,
    // false);
    // declareFunction(myName, "load_non_computable_kb",
    // "LOAD-NON-COMPUTABLE-KB", 1, 0, false);
    // declareFunction(myName, "dump_computable_kb_and_content",
    // "DUMP-COMPUTABLE-KB-AND-CONTENT", 2, 0, false);
    // declareFunction(myName, "dump_kb", "DUMP-KB", 0, 1, false);
    declareFunction( myName, "load_kb", "LOAD-KB", 1, 0, false );
    // declareFunction(myName, "kb_dump_to_directory", "KB-DUMP-TO-DIRECTORY",
    // 1, 0, false);
    declareFunction( myName, "kb_load_from_directory", "KB-LOAD-FROM-DIRECTORY", 1, 0, false );
    // declareFunction(myName, "dump_kb_ids", "DUMP-KB-IDS", 1, 0, false);
    // declareFunction(myName, "dump_essential_kb", "DUMP-ESSENTIAL-KB", 1, 0,
    // false);
    declareFunction( myName, "load_essential_kb", "LOAD-ESSENTIAL-KB", 1, 0, false );
    declareFunction( myName, "load_essential_kb_initializations", "LOAD-ESSENTIAL-KB-INITIALIZATIONS", 0, 0, false );
    declareFunction( myName, "load_computable_kb_initializations", "LOAD-COMPUTABLE-KB-INITIALIZATIONS", 0, 0, false );
    declareFunction( myName, "load_computable_remaining_hl_low_initializations", "LOAD-COMPUTABLE-REMAINING-HL-LOW-INITIALIZATIONS", 0, 0, false );
    // declareFunction(myName, "dump_computable_content",
    // "DUMP-COMPUTABLE-CONTENT", 1, 0, false);
    declareFunction( myName, "load_computable_content", "LOAD-COMPUTABLE-CONTENT", 1, 0, false );
    // declareFunction(myName, "rebuild_computable_content",
    // "REBUILD-COMPUTABLE-CONTENT", 0, 0, false);
    // declareFunction(myName, "rebuild_computable_content_dumpable",
    // "REBUILD-COMPUTABLE-CONTENT-DUMPABLE", 0, 0, false);
    // declareFunction(myName, "rebuild_computable_content_dumpable_low",
    // "REBUILD-COMPUTABLE-CONTENT-DUMPABLE-LOW", 0, 0, false);
    // declareFunction(myName, "dump_computable_kb", "DUMP-COMPUTABLE-KB", 1, 0,
    // false);
    declareFunction( myName, "load_computable_kb", "LOAD-COMPUTABLE-KB", 1, 0, false );
    // declareFunction(myName, "rebuild_computable_kb", "REBUILD-COMPUTABLE-KB",
    // 0, 0, false);
    // declareFunction(myName, "dump_computable_remaining_hl",
    // "DUMP-COMPUTABLE-REMAINING-HL", 1, 0, false);
    declareFunction( myName, "load_computable_remaining_hl", "LOAD-COMPUTABLE-REMAINING-HL", 1, 0, false );
    // declareFunction(myName, "rebuild_computable_remaining_hl",
    // "REBUILD-COMPUTABLE-REMAINING-HL", 0, 0, false);
    // declareFunction(myName, "rebuild_computable_remaining_hl_low",
    // "REBUILD-COMPUTABLE-REMAINING-HL-LOW", 0, 0, false);
    // declareFunction(myName, "rebuild_computable_remaining_hl_high",
    // "REBUILD-COMPUTABLE-REMAINING-HL-HIGH", 0, 0, false);
    declareFunction( myName, "rebuild_computable_but_not_dumpable_yet", "REBUILD-COMPUTABLE-BUT-NOT-DUMPABLE-YET", 0, 0, false );
    // declareFunction(myName, "dump_copyright", "DUMP-COPYRIGHT", 1, 0, false);
    declareFunction( myName, "load_copyright", "LOAD-COPYRIGHT", 1, 0, false );
    declareFunction( myName, "load_unit_file", "LOAD-UNIT-FILE", 4, 0, false );
    // declareFunction(myName, "dump_kb_object_count", "DUMP-KB-OBJECT-COUNT",
    // 3, 0, false);
    declareFunction( myName, "load_kb_object_count", "LOAD-KB-OBJECT-COUNT", 2, 0, false );
    // declareFunction(myName, "kb_dump_common_symbols",
    // "KB-DUMP-COMMON-SYMBOLS", 0, 0, false);
    // declareFunction(myName, "dump_special_objects", "DUMP-SPECIAL-OBJECTS",
    // 1, 0, false);
    // declareFunction(myName, "dump_special_objects_internal",
    // "DUMP-SPECIAL-OBJECTS-INTERNAL", 2, 0, false);
    declareFunction( myName, "load_special_objects", "LOAD-SPECIAL-OBJECTS", 1, 0, false );
    declareFunction( myName, "load_kb_product_shared_symbols", "LOAD-KB-PRODUCT-SHARED-SYMBOLS", 1, 0, false );
    declareFunction( myName, "setup_kb_state_from_dump", "SETUP-KB-STATE-FROM-DUMP", 1, 0, false );
    // declareFunction(myName, "dump_constant_shells", "DUMP-CONSTANT-SHELLS",
    // 1, 0, false);
    declareFunction( myName, "load_constant_count", "LOAD-CONSTANT-COUNT", 1, 0, false );
    declareFunction( myName, "load_constant_shells", "LOAD-CONSTANT-SHELLS", 1, 0, false );
    // declareFunction(myName, "dump_constant_shell", "DUMP-CONSTANT-SHELL", 2,
    // 0, false);
    // declareFunction(myName, "dump_constant_shell_internal",
    // "DUMP-CONSTANT-SHELL-INTERNAL", 4, 0, false);
    declareFunction( myName, "load_constant_shell", "LOAD-CONSTANT-SHELL", 2, 0, false );
    declareFunction( myName, "load_constant_shell_internal", "LOAD-CONSTANT-SHELL-INTERNAL", 3, 0, false );
    // declareFunction(myName, "generate_constant_shell_file",
    // "GENERATE-CONSTANT-SHELL-FILE", 1, 0, false);
    // declareFunction(myName, "dump_nart_count", "DUMP-NART-COUNT", 1, 0,
    // false);
    declareFunction( myName, "load_nart_shells", "LOAD-NART-SHELLS", 1, 0, false );
    declareFunction( myName, "load_nart_count", "LOAD-NART-COUNT", 1, 0, false );
    declareFunction( myName, "initialize_nart_shells", "INITIALIZE-NART-SHELLS", 1, 0, false );
    // declareFunction(myName, "load_nart_shells_legacy",
    // "LOAD-NART-SHELLS-LEGACY", 1, 0, false);
    // declareFunction(myName, "dump_nart_shell", "DUMP-NART-SHELL", 2, 0,
    // false);
    // declareFunction(myName, "load_nart_shell", "LOAD-NART-SHELL", 2, 0,
    // false);
    // declareFunction(myName, "dump_assertion_count", "DUMP-ASSERTION-COUNT",
    // 1, 0, false);
    declareFunction( myName, "load_assertion_shells", "LOAD-ASSERTION-SHELLS", 1, 0, false );
    declareFunction( myName, "load_assertion_count", "LOAD-ASSERTION-COUNT", 1, 0, false );
    declareFunction( myName, "initialize_assertion_shells", "INITIALIZE-ASSERTION-SHELLS", 1, 0, false );
    // declareFunction(myName, "load_assertion_shells_legacy",
    // "LOAD-ASSERTION-SHELLS-LEGACY", 1, 0, false);
    // declareFunction(myName, "dump_assertion_shell", "DUMP-ASSERTION-SHELL",
    // 2, 0, false);
    // declareFunction(myName, "load_assertion_shell", "LOAD-ASSERTION-SHELL",
    // 2, 0, false);
    // declareFunction(myName, "dump_kb_hl_support_count",
    // "DUMP-KB-HL-SUPPORT-COUNT", 1, 0, false);
    declareFunction( myName, "load_kb_hl_support_shells", "LOAD-KB-HL-SUPPORT-SHELLS", 1, 0, false );
    declareFunction( myName, "load_kb_hl_support_count", "LOAD-KB-HL-SUPPORT-COUNT", 1, 0, false );
    declareFunction( myName, "initialize_kb_hl_support_shells", "INITIALIZE-KB-HL-SUPPORT-SHELLS", 1, 0, false );
    // declareFunction(myName, "load_kb_hl_support_shells_legacy",
    // "LOAD-KB-HL-SUPPORT-SHELLS-LEGACY", 1, 0, false);
    // declareFunction(myName, "dump_kb_hl_support_shell",
    // "DUMP-KB-HL-SUPPORT-SHELL", 2, 0, false);
    // declareFunction(myName, "load_kb_hl_support_shell",
    // "LOAD-KB-HL-SUPPORT-SHELL", 2, 0, false);
    // declareFunction(myName, "dump_kb_unrepresented_terms",
    // "DUMP-KB-UNREPRESENTED-TERMS", 1, 0, false);
    declareFunction( myName, "load_kb_unrepresented_terms", "LOAD-KB-UNREPRESENTED-TERMS", 1, 0, false );
    // declareFunction(myName, "dump_kb_unrepresented_term",
    // "DUMP-KB-UNREPRESENTED-TERM", 2, 0, false);
    declareFunction( myName, "load_kb_unrepresented_term", "LOAD-KB-UNREPRESENTED-TERM", 2, 0, false );
    declareFunction( myName, "load_kb_unrepresented_term_count", "LOAD-KB-UNREPRESENTED-TERM-COUNT", 1, 0, false );
    // declareFunction(myName, "dump_clause_struc_defs",
    // "DUMP-CLAUSE-STRUC-DEFS", 1, 0, false);
    declareFunction( myName, "load_clause_struc_defs", "LOAD-CLAUSE-STRUC-DEFS", 1, 0, false );
    // declareFunction(myName, "dump_clause_struc_def", "DUMP-CLAUSE-STRUC-DEF",
    // 2, 0, false);
    declareFunction( myName, "load_clause_struc_def", "LOAD-CLAUSE-STRUC-DEF", 2, 0, false );
    declareFunction( myName, "load_clause_struc_count", "LOAD-CLAUSE-STRUC-COUNT", 1, 0, false );
    // declareFunction(myName, "dump_deduction_defs", "DUMP-DEDUCTION-DEFS", 1,
    // 0, false);
    declareFunction( myName, "load_deduction_defs", "LOAD-DEDUCTION-DEFS", 1, 0, false );
    // declareFunction(myName, "dump_deduction_def", "DUMP-DEDUCTION-DEF", 2, 0,
    // false);
    declareFunction( myName, "load_deduction_def", "LOAD-DEDUCTION-DEF", 2, 0, false );
    declareFunction( myName, "load_deduction_def_from_cache", "LOAD-DEDUCTION-DEF-FROM-CACHE", 2, 0, false );
    new $load_deduction_def_from_cache$BinaryFunction();
    declareFunction( myName, "load_deduction_count", "LOAD-DEDUCTION-COUNT", 1, 0, false );
    // declareFunction(myName, "dump_assertion_defs", "DUMP-ASSERTION-DEFS", 1,
    // 0, false);
    declareFunction( myName, "load_assertion_defs", "LOAD-ASSERTION-DEFS", 1, 0, false );
    // declareFunction(myName, "dump_assertion_def", "DUMP-ASSERTION-DEF", 2, 0,
    // false);
    declareFunction( myName, "load_assertion_def", "LOAD-ASSERTION-DEF", 2, 0, false );
    declareFunction( myName, "load_assertion_def_from_cache", "LOAD-ASSERTION-DEF-FROM-CACHE", 2, 0, false );
    new $load_assertion_def_from_cache$BinaryFunction();
    // declareFunction(myName, "dump_kb_hl_support_defs",
    // "DUMP-KB-HL-SUPPORT-DEFS", 1, 0, false);
    declareFunction( myName, "load_kb_hl_support_defs", "LOAD-KB-HL-SUPPORT-DEFS", 1, 0, false );
    // declareFunction(myName, "dump_kb_hl_support_def",
    // "DUMP-KB-HL-SUPPORT-DEF", 2, 0, false);
    declareFunction( myName, "load_kb_hl_support_def", "LOAD-KB-HL-SUPPORT-DEF", 2, 0, false );
    declareFunction( myName, "load_kb_hl_support_def_from_cache", "LOAD-KB-HL-SUPPORT-DEF-FROM-CACHE", 2, 0, false );
    // declareFunction(myName, "dump_kb_hl_support_indexing",
    // "DUMP-KB-HL-SUPPORT-INDEXING", 1, 0, false);
    declareFunction( myName, "load_kb_hl_support_indexing", "LOAD-KB-HL-SUPPORT-INDEXING", 1, 0, false );
    // declareFunction(myName, "dump_bookkeeping_assertions",
    // "DUMP-BOOKKEEPING-ASSERTIONS", 1, 0, false);
    // declareFunction(myName, "dump_bookkeeping_assertions_for_pred",
    // "DUMP-BOOKKEEPING-ASSERTIONS-FOR-PRED", 3, 0, false);
    // declareFunction(myName, "dump_bookkeeping_assertion",
    // "DUMP-BOOKKEEPING-ASSERTION", 3, 0, false);
    declareFunction( myName, "load_bookkeeping_assertions", "LOAD-BOOKKEEPING-ASSERTIONS", 1, 0, false );
    declareFunction( myName, "load_bookkeeping_assertions_for_pred", "LOAD-BOOKKEEPING-ASSERTIONS-FOR-PRED", 1, 0, false );
    declareFunction( myName, "load_bookkeeping_assertion", "LOAD-BOOKKEEPING-ASSERTION", 2, 0, false );
    // declareFunction(myName, "dump_experience", "DUMP-EXPERIENCE", 1, 0,
    // false);
    // declareFunction(myName, "dump_rule_utility_experience",
    // "DUMP-RULE-UTILITY-EXPERIENCE", 1, 1, false);
    declareFunction( myName, "load_experience", "LOAD-EXPERIENCE", 1, 0, false );
    declareFunction( myName, "load_rule_utility_experience", "LOAD-RULE-UTILITY-EXPERIENCE", 1, 0, false );
    // declareFunction(myName, "reload_experience", "RELOAD-EXPERIENCE", 0, 1,
    // false);
    // declareFunction(myName, "dump_kb_indexing", "DUMP-KB-INDEXING", 1, 0,
    // false);
    declareFunction( myName, "load_kb_indexing", "LOAD-KB-INDEXING", 1, 0, false );
    // declareFunction(myName, "rebuild_kb_indexing", "REBUILD-KB-INDEXING", 0,
    // 0, false);
    // declareFunction(myName, "test_dump_kb_indexing", "TEST-DUMP-KB-INDEXING",
    // 1, 0, false);
    // declareFunction(myName, "test_load_kb_indexing", "TEST-LOAD-KB-INDEXING",
    // 1, 0, false);
    // declareFunction(myName, "dump_constant_indices", "DUMP-CONSTANT-INDICES",
    // 1, 0, false);
    declareFunction( myName, "load_constant_indices", "LOAD-CONSTANT-INDICES", 1, 0, false );
    // declareFunction(myName, "dump_constant_index", "DUMP-CONSTANT-INDEX", 2,
    // 0, false);
    declareFunction( myName, "load_constant_index", "LOAD-CONSTANT-INDEX", 2, 0, false );
    declareFunction( myName, "load_constant_index_from_cache", "LOAD-CONSTANT-INDEX-FROM-CACHE", 2, 0, false );
    // declareFunction(myName, "dump_nart_indices", "DUMP-NART-INDICES", 1, 0,
    // false);
    declareFunction( myName, "load_nart_indices", "LOAD-NART-INDICES", 1, 0, false );
    // declareFunction(myName, "dump_nart_index", "DUMP-NART-INDEX", 2, 0,
    // false);
    // declareFunction(myName, "load_nart_index", "LOAD-NART-INDEX", 2, 0,
    // false);
    // declareFunction(myName, "load_nart_index_from_cache",
    // "LOAD-NART-INDEX-FROM-CACHE", 2, 0, false);
    // declareFunction(myName, "dump_unrepresented_term_indices",
    // "DUMP-UNREPRESENTED-TERM-INDICES", 1, 0, false);
    declareFunction( myName, "load_unrepresented_term_indices", "LOAD-UNREPRESENTED-TERM-INDICES", 1, 0, false );
    // declareFunction(myName, "dump_unrepresented_term_index",
    // "DUMP-UNREPRESENTED-TERM-INDEX", 2, 0, false);
    declareFunction( myName, "load_unrepresented_term_index", "LOAD-UNREPRESENTED-TERM-INDEX", 2, 0, false );
    declareFunction( myName, "load_unrepresented_term_index_from_cache", "LOAD-UNREPRESENTED-TERM-INDEX-FROM-CACHE", 2, 0, false );
    // declareFunction(myName, "dump_assertion_indices",
    // "DUMP-ASSERTION-INDICES", 1, 0, false);
    declareFunction( myName, "load_assertion_indices", "LOAD-ASSERTION-INDICES", 1, 0, false );
    // declareFunction(myName, "dump_assertion_index", "DUMP-ASSERTION-INDEX",
    // 2, 0, false);
    declareFunction( myName, "load_assertion_index", "LOAD-ASSERTION-INDEX", 2, 0, false );
    // declareFunction(myName, "dump_auxiliary_indices_file",
    // "DUMP-AUXILIARY-INDICES-FILE", 1, 0, false);
    declareFunction( myName, "load_auxiliary_indices_file", "LOAD-AUXILIARY-INDICES-FILE", 1, 0, false );
    // declareFunction(myName, "dump_bookkeeping_indices_file",
    // "DUMP-BOOKKEEPING-INDICES-FILE", 1, 0, false);
    declareFunction( myName, "load_bookkeeping_indices_file", "LOAD-BOOKKEEPING-INDICES-FILE", 1, 0, false );
    // declareFunction(myName, "dump_bookkeeping_indices",
    // "DUMP-BOOKKEEPING-INDICES", 1, 0, false);
    declareFunction( myName, "load_bookkeeping_indices", "LOAD-BOOKKEEPING-INDICES", 1, 0, false );
    // declareFunction(myName, "dump_rule_set", "DUMP-RULE-SET", 1, 0, false);
    declareFunction( myName, "load_rule_set", "LOAD-RULE-SET", 1, 0, false );
    // declareFunction(myName, "dump_nart_hl_formulas", "DUMP-NART-HL-FORMULAS",
    // 1, 0, false);
    declareFunction( myName, "load_nart_hl_formulas", "LOAD-NART-HL-FORMULAS", 1, 0, false );
    // declareFunction(myName, "dump_nart_hl_formula", "DUMP-NART-HL-FORMULA",
    // 3, 0, false);
    // declareFunction(myName, "load_nart_hl_formula", "LOAD-NART-HL-FORMULA",
    // 2, 0, false);
    // declareFunction(myName, "load_nart_hl_formula_from_cache",
    // "LOAD-NART-HL-FORMULA-FROM-CACHE", 2, 0, false); new
    // $load_nart_hl_formula_from_cache$BinaryFunction();
    // declareFunction(myName, "dump_miscellaneous", "DUMP-MISCELLANEOUS", 1, 0,
    // false);
    declareFunction( myName, "load_miscellaneous", "LOAD-MISCELLANEOUS", 1, 0, false );
    // declareFunction(myName, "dump_sbhl_data", "DUMP-SBHL-DATA", 1, 0, false);
    // declareFunction(myName, "old_dump_sbhl_data", "OLD-DUMP-SBHL-DATA", 1, 0,
    // false);
    declareFunction( myName, "load_sbhl_data", "LOAD-SBHL-DATA", 1, 0, false );
    // declareFunction(myName, "rebuild_sbhl_data", "REBUILD-SBHL-DATA", 0, 0,
    // false);
    // declareFunction(myName, "dump_sbhl_miscellany", "DUMP-SBHL-MISCELLANY",
    // 1, 0, false);
    // declareFunction(myName, "dump_isa_arg2_naut_table",
    // "DUMP-ISA-ARG2-NAUT-TABLE", 1, 0, false);
    // declareFunction(myName, "dump_non_fort_isa_table",
    // "DUMP-NON-FORT-ISA-TABLE", 1, 0, false);
    // declareFunction(myName, "dump_non_fort_instance_table",
    // "DUMP-NON-FORT-INSTANCE-TABLE", 1, 0, false);
    declareFunction( myName, "load_sbhl_miscellany", "LOAD-SBHL-MISCELLANY", 1, 0, false );
    declareFunction( myName, "load_isa_arg2_naut_table", "LOAD-ISA-ARG2-NAUT-TABLE", 1, 0, false );
    declareFunction( myName, "load_non_fort_isa_table", "LOAD-NON-FORT-ISA-TABLE", 1, 0, false );
    declareFunction( myName, "load_non_fort_instance_table", "LOAD-NON-FORT-INSTANCE-TABLE", 1, 0, false );
    // declareFunction(myName, "dump_sbhl_cache", "DUMP-SBHL-CACHE", 1, 0,
    // false);
    declareFunction( myName, "load_sbhl_cache", "LOAD-SBHL-CACHE", 1, 0, false );
    // declareFunction(myName, "rebuild_sbhl_cache", "REBUILD-SBHL-CACHE", 0, 0,
    // false);
    // declareFunction(myName, "dump_cardinality_estimates",
    // "DUMP-CARDINALITY-ESTIMATES", 1, 0, false);
    declareFunction( myName, "load_cardinality_estimates", "LOAD-CARDINALITY-ESTIMATES", 1, 0, false );
    // declareMacro(myName, "not_computing_arg_type_cache",
    // "NOT-COMPUTING-ARG-TYPE-CACHE");
    // declareFunction(myName, "dump_arg_type_cache", "DUMP-ARG-TYPE-CACHE", 1,
    // 0, false);
    declareFunction( myName, "load_arg_type_cache", "LOAD-ARG-TYPE-CACHE", 1, 0, false );
    // declareFunction(myName, "rebuild_arg_type_cache",
    // "REBUILD-ARG-TYPE-CACHE", 0, 0, false);
    // declareFunction(myName, "dump_defns_cache", "DUMP-DEFNS-CACHE", 1, 0,
    // false);
    declareFunction( myName, "load_defns_cache", "LOAD-DEFNS-CACHE", 1, 0, false );
    // declareFunction(myName, "dump_tva_cache", "DUMP-TVA-CACHE", 1, 0, false);
    declareFunction( myName, "load_tva_cache", "LOAD-TVA-CACHE", 1, 0, false );
    // declareFunction(myName, "dump_somewhere_cache", "DUMP-SOMEWHERE-CACHE",
    // 1, 0, false);
    declareFunction( myName, "load_somewhere_cache", "LOAD-SOMEWHERE-CACHE", 1, 0, false );
    // declareFunction(myName, "dump_arity_cache", "DUMP-ARITY-CACHE", 1, 0,
    // false);
    declareFunction( myName, "load_arity_cache", "LOAD-ARITY-CACHE", 1, 0, false );
    // declareFunction(myName, "dump_kb_activities", "DUMP-KB-ACTIVITIES", 1, 0,
    // false);
    declareFunction( myName, "load_kb_initializations", "LOAD-KB-INITIALIZATIONS", 0, 0, false );
    declareFunction( myName, "initialize_kb_features", "INITIALIZE-KB-FEATURES", 0, 0, false );
    // declareFunction(myName, "show_kb_features", "SHOW-KB-FEATURES", 0, 0,
    // false);
    return NIL;
  }

  public static final SubLObject init_dumper_file()
  {
//    $force_monolithic_kb_assumption$ = deflexical( "*FORCE-MONOLITHIC-KB-ASSUMPTION*", maybeDefault( $sym0$_FORCE_MONOLITHIC_KB_ASSUMPTION_, $force_monolithic_kb_assumption$, NIL ) );
//    $default_dump_path$ = defparameter( "*DEFAULT-DUMP-PATH*", $list21 );
//    $default_dump_extension$ = defparameter( "*DEFAULT-DUMP-EXTENSION*", $str22$cfasl );
//    $default_dump_product_extension$ = defparameter( "*DEFAULT-DUMP-PRODUCT-EXTENSION*", $str23$fht );
//    $dump_bytes_per_assertion$ = deflexical( "*DUMP-BYTES-PER-ASSERTION*", $int25$192 );
//    $dump_verify$ = defparameter( "*DUMP-VERIFY*", T );
//    $kb_load_gc_checkpoints_enabledP$ = defparameter( "*KB-LOAD-GC-CHECKPOINTS-ENABLED?*", NIL );
//    $dump_verbose$ = defparameter( "*DUMP-VERBOSE*", T );
//    $kb_dump_common_symbols$ = defparameter( "*KB-DUMP-COMMON-SYMBOLS*", ConsesLow.append( new SubLObject[] { enumeration_types.valid_hl_truth_values(), enumeration_types.valid_directions(), arguments
//        .asserted_argument_tokens(), hl_supports.hl_support_modules(), hash_table_utilities.valid_hash_test_symbols(), $list64
//    } ) );
//    $compute_arg_type_cache_on_dumpP$ = defparameter( "*COMPUTE-ARG-TYPE-CACHE-ON-DUMP?*", T );
    return NIL;
  }

  public static final SubLObject setup_dumper_file()
  {
        subl_macro_promotions.declare_defglobal( $sym0$_FORCE_MONOLITHIC_KB_ASSUMPTION_ );
//    utilities_macros.note_funcall_helper_function( $sym98$LOAD_DEDUCTION_DEF_FROM_CACHE );
//    utilities_macros.note_funcall_helper_function( $sym104$LOAD_ASSERTION_DEF_FROM_CACHE );
//    utilities_macros.note_funcall_helper_function( $sym110$LOAD_KB_HL_SUPPORT_DEF_FROM_CACHE );
//    utilities_macros.note_funcall_helper_function( $sym125$LOAD_CONSTANT_INDEX_FROM_CACHE );
//    utilities_macros.note_funcall_helper_function( $sym131$LOAD_NART_INDEX_FROM_CACHE );
//    utilities_macros.note_funcall_helper_function( $sym137$LOAD_UNREPRESENTED_TERM_INDEX_FROM_CACHE );
    return NIL;
  }
  //// Internal Constants
  public static final SubLSymbol $sym0$_FORCE_MONOLITHIC_KB_ASSUMPTION_ = makeSymbol( "*FORCE-MONOLITHIC-KB-ASSUMPTION*" );
  public static final SubLSymbol $sym1$WITH_CONSTANT_DUMP_ID_TABLE = makeSymbol( "WITH-CONSTANT-DUMP-ID-TABLE" );
  public static final SubLSymbol $sym2$WITH_NART_DUMP_ID_TABLE = makeSymbol( "WITH-NART-DUMP-ID-TABLE" );
  public static final SubLSymbol $sym3$WITH_UNREPRESENTED_TERM_DUMP_ID_TABLE = makeSymbol( "WITH-UNREPRESENTED-TERM-DUMP-ID-TABLE" );
  public static final SubLSymbol $sym4$WITH_ASSERTION_DUMP_ID_TABLE = makeSymbol( "WITH-ASSERTION-DUMP-ID-TABLE" );
  public static final SubLSymbol $sym5$WITH_DEDUCTION_DUMP_ID_TABLE = makeSymbol( "WITH-DEDUCTION-DUMP-ID-TABLE" );
  public static final SubLSymbol $sym6$WITH_KB_HL_SUPPORT_DUMP_ID_TABLE = makeSymbol( "WITH-KB-HL-SUPPORT-DUMP-ID-TABLE" );
  public static final SubLSymbol $sym7$WITH_CLAUSE_STRUC_DUMP_ID_TABLE = makeSymbol( "WITH-CLAUSE-STRUC-DUMP-ID-TABLE" );
  public static final SubLSymbol $sym8$CLET = makeSymbol( "CLET" );
  public static final SubLList $list9 = list( list( makeSymbol( "*CFASL-CONSTANT-HANDLE-LOOKUP-FUNC*" ), list( makeSymbol( "QUOTE" ), makeSymbol( "FIND-CONSTANT-BY-DUMP-ID" ) ) ), list( makeSymbol(
      "*CFASL-NART-HANDLE-LOOKUP-FUNC*" ), list( makeSymbol( "QUOTE" ), makeSymbol( "FIND-NART-BY-DUMP-ID" ) ) ), list( makeSymbol( "*CFASL-ASSERTION-HANDLE-LOOKUP-FUNC*" ), list( makeSymbol( "QUOTE" ), makeSymbol(
          "FIND-ASSERTION-BY-DUMP-ID" ) ) ), list( makeSymbol( "*CFASL-DEDUCTION-HANDLE-LOOKUP-FUNC*" ), list( makeSymbol( "QUOTE" ), makeSymbol( "FIND-DEDUCTION-BY-DUMP-ID" ) ) ), list( makeSymbol(
              "*CFASL-KB-HL-SUPPORT-HANDLE-LOOKUP-FUNC*" ), list( makeSymbol( "QUOTE" ), makeSymbol( "FIND-KB-HL-SUPPORT-BY-DUMP-ID" ) ) ), list( makeSymbol( "*CFASL-CLAUSE-STRUC-HANDLE-LOOKUP-FUNC*" ), list( makeSymbol(
                  "QUOTE" ), makeSymbol( "FIND-CLAUSE-STRUC-BY-DUMP-ID" ) ) ) );
  public static final SubLList $list10 = list( list( makeSymbol( "*STRUCTURE-RESOURCING-MAKE-STATIC*" ), T ), list( makeSymbol( "*CFASL-INPUT-TO-STATIC-AREA*" ), T ) );
  public static final SubLList $list11 = list( list( makeSymbol( "*STRUCTURE-RESOURCING-MAKE-STATIC*" ), NIL ), list( makeSymbol( "*CFASL-INPUT-TO-STATIC-AREA*" ), NIL ) );
  public static final SubLList $list12 = list( list( makeSymbol( "FILENAME-VAR" ), makeSymbol( "FILENAME" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
  public static final SubLSymbol $sym13$DISCARD_DUMP_FILENAME = makeSymbol( "DISCARD-DUMP-FILENAME" );
  public static final SubLList $list14 = list( list( makeSymbol( "STREAM" ), makeSymbol( "FILENAME" ), makeSymbol( "DIRECTION" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
  public static final SubLSymbol $sym15$FILENAME_VAR = makeUninternedSymbol( "FILENAME-VAR" );
  public static final SubLSymbol $sym16$WITH_KB_DUMP_FILENAME = makeSymbol( "WITH-KB-DUMP-FILENAME" );
  public static final SubLSymbol $sym17$WITH_PRIVATE_BINARY_FILE = makeSymbol( "WITH-PRIVATE-BINARY-FILE" );
  public static final SubLSymbol $sym18$FILENAME_VAR = makeUninternedSymbol( "FILENAME-VAR" );
  public static final SubLSymbol $sym19$WITH_PRIVATE_TEXT_FILE = makeSymbol( "WITH-PRIVATE-TEXT-FILE" );
  public static final SubLSymbol $sym20$STRINGP = makeSymbol( "STRINGP" );
  public static final SubLList $list21 = list( makeString( "units" ) );
  public static final SubLString $str22$cfasl = makeString( "cfasl" );
  public static final SubLString $str23$fht = makeString( "fht" );
  public static final SubLString $str24$_4__0D = makeString( "~4,'0D" );
  public static final SubLInteger $int25$192 = makeInteger( 192 );
  public static final SubLString $str26$file__s_not_found = makeString( "file ~s not found" );
  public static final SubLString $str27$Directory__S_does_not_exist_ = makeString( "Directory ~S does not exist." );
  public static final SubLString $str28$Directory__S_cannot_be_written_to = makeString( "Directory ~S cannot be written to." );
  public static final SubLString $str29$Directory__S_does_not_have_enough = makeString( "Directory ~S does not have enough space available, ~S bytes, for the KB dump." );
  public static final SubLString $str30$rule_utility_experience = makeString( "rule-utility-experience" );
  public static final SubLSymbol $sym31$CONSTANT_DUMP_ID = makeSymbol( "CONSTANT-DUMP-ID" );
  public static final SubLSymbol $sym32$NART_DUMP_ID = makeSymbol( "NART-DUMP-ID" );
  public static final SubLSymbol $sym33$ASSERTION_DUMP_ID = makeSymbol( "ASSERTION-DUMP-ID" );
  public static final SubLSymbol $sym34$DEDUCTION_DUMP_ID = makeSymbol( "DEDUCTION-DUMP-ID" );
  public static final SubLSymbol $sym35$KB_HL_SUPPORT_DUMP_ID = makeSymbol( "KB-HL-SUPPORT-DUMP-ID" );
  public static final SubLSymbol $sym36$CLAUSE_STRUC_DUMP_ID = makeSymbol( "CLAUSE-STRUC-DUMP-ID" );
  public static final SubLSymbol $sym37$FIND_CONSTANT_BY_DUMP_ID = makeSymbol( "FIND-CONSTANT-BY-DUMP-ID" );
  public static final SubLSymbol $sym38$FIND_NART_BY_DUMP_ID = makeSymbol( "FIND-NART-BY-DUMP-ID" );
  public static final SubLSymbol $sym39$FIND_ASSERTION_BY_DUMP_ID = makeSymbol( "FIND-ASSERTION-BY-DUMP-ID" );
  public static final SubLSymbol $sym40$FIND_DEDUCTION_BY_DUMP_ID = makeSymbol( "FIND-DEDUCTION-BY-DUMP-ID" );
  public static final SubLSymbol $sym41$FIND_KB_HL_SUPPORT_BY_DUMP_ID = makeSymbol( "FIND-KB-HL-SUPPORT-BY-DUMP-ID" );
  public static final SubLSymbol $sym42$FIND_CLAUSE_STRUC_BY_DUMP_ID = makeSymbol( "FIND-CLAUSE-STRUC-BY-DUMP-ID" );
  public static final SubLString $str43$Create_directory_and_continue_ = makeString( "Create directory and continue." );
  public static final SubLString $str44$________Dumping_KB__A_to__A_at__A = makeString( "~&~%;;; Dumping KB ~A to ~A at ~A~%" );
  public static final SubLString $str45$_____S_transcript_operations_proc = makeString( "~&  ~S transcript operations processed~%" );
  public static final SubLString $str46$________Dump_of_KB__A_completed__ = makeString( "~&~%;;; Dump of KB ~A completed (~A) at ~A~%" );
  public static final SubLString $str47$________Loading_KB_from__A_at__A_ = makeString( "~&~%;;; Loading KB from ~A at ~A~%" );
  public static final SubLString $str48$________Load_of_KB__A_completed__ = makeString( "~&~%;;; Load of KB ~A completed (~A) at ~A~%" );
  public static final SubLString $str49$________Dumping_essential_KB__ = makeString( "~&~%;;; Dumping essential KB~%" );
  public static final SubLString $str50$________Loading_essential_KB_at__ = makeString( "~&~%;;; Loading essential KB at ~A~%" );
  public static final SubLString $str51$________Loading_computable_KB_at_ = makeString( "~&~%;;; Loading computable KB at ~A~%" );
  public static final SubLString $str52$________Loading_computable_remain = makeString( "~&~%;;; Loading computable remaining HL at ~A~%" );
  public static final SubLString $str53$________Rebuilding_computable_but = makeString( "~&~%;;; Rebuilding computable-but-not-dumpable-yet-KB at ~A~%" );
  public static final SubLString $str54$Invalid_attempt_to_reuse_memoizat = makeString( "Invalid attempt to reuse memoization state in multiple threads simultaneously." );
  public static final SubLSymbol $sym55$SYMBOLP = makeSymbol( "SYMBOLP" );
  public static final SubLSymbol $kw56$INPUT = makeKeyword( "INPUT" );
  public static final SubLString $str57$Unable_to_open__S = makeString( "Unable to open ~S" );
  public static final SubLSymbol $kw58$EOF = makeKeyword( "EOF" );
  public static final SubLString $str59$_d_bytes_of_unread_stuff_in__S = makeString( "~d bytes of unread stuff in ~S" );
  public static final SubLString $str60$text = makeString( "text" );
  public static final SubLSymbol $kw61$OUTPUT = makeKeyword( "OUTPUT" );
  public static final SubLString $str62$_a__ = makeString( "~a~%" );
  public static final SubLSymbol $sym63$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
  public static final SubLList $list64 = list( makeKeyword( "UNNAMED" ), makeKeyword( "VARIABLE-NAMES" ), makeKeyword( "DEPENDENTS" ), makeKeyword( "INDEX" ), makeKeyword( "ASSERT-INFO" ) );
  public static final SubLString $str65$Dumping_special_objects_at__A___ = makeString( "Dumping special objects at ~A..." );
  public static final SubLString $str66$special = makeString( "special" );
  public static final SubLString $str67$Loading_special_objects___ = makeString( "Loading special objects..." );
  public static final SubLSymbol $sym68$INTEGERP = makeSymbol( "INTEGERP" );
  public static final SubLString $str69$constant_count = makeString( "constant-count" );
  public static final SubLString $str70$constant_shell = makeString( "constant-shell" );
  public static final SubLString $str71$Dumping_constant_shells = makeString( "Dumping constant shells" );
  public static final SubLSymbol $kw72$SKIP = makeKeyword( "SKIP" );
  public static final SubLString $str73$Loading_constant_shells = makeString( "Loading constant shells" );
  public static final SubLString $str74$nart_count = makeString( "nart-count" );
  public static final SubLString $str75$nat_shell = makeString( "nat-shell" );
  public static final SubLString $str76$Loading_NART_shells = makeString( "Loading NART shells" );
  public static final SubLString $str77$assertion_count = makeString( "assertion-count" );
  public static final SubLString $str78$assertion_shell = makeString( "assertion-shell" );
  public static final SubLString $str79$Loading_assertion_shells = makeString( "Loading assertion shells" );
  public static final SubLString $str80$kb_hl_support_count = makeString( "kb-hl-support-count" );
  public static final SubLString $str81$kb_hl_support_shell = makeString( "kb-hl-support-shell" );
  public static final SubLString $str82$Loading_KB_HL_support_shells = makeString( "Loading KB HL support shells" );
  public static final SubLString $str83$unrepresented_term_count = makeString( "unrepresented-term-count" );
  public static final SubLString $str84$unrepresented_terms = makeString( "unrepresented-terms" );
  public static final SubLString $str85$Dumping_KB_unrepresented_terms = makeString( "Dumping KB unrepresented terms" );
  public static final SubLString $str86$Loading_KB_unrepresented_terms = makeString( "Loading KB unrepresented terms" );
  public static final SubLString $str87$clause_struc_count = makeString( "clause-struc-count" );
  public static final SubLString $str88$clause_struc = makeString( "clause-struc" );
  public static final SubLString $str89$Dumping_clause_struc_definitions = makeString( "Dumping clause-struc definitions" );
  public static final SubLString $str90$Loading_clause_struc_definitions = makeString( "Loading clause-struc definitions" );
  public static final SubLString $str91$deduction_count = makeString( "deduction-count" );
  public static final SubLString $str92$deduction = makeString( "deduction" );
  public static final SubLString $str93$deduction_index = makeString( "deduction-index" );
  public static final SubLString $str94$Dumping_deduction_definitions = makeString( "Dumping deduction definitions" );
  public static final SubLString $str95$__Deduction_definitions_will_be_s = makeString( "~&Deduction definitions will be swapped in lazily from ~A and ~A~%" );
  public static final SubLString $str96$Initializing_deduction_handles_on = makeString( "Initializing deduction handles only" );
  public static final SubLString $str97$Loading_deduction_definitions = makeString( "Loading deduction definitions" );
  public static final SubLSymbol $sym98$LOAD_DEDUCTION_DEF_FROM_CACHE = makeSymbol( "LOAD-DEDUCTION-DEF-FROM-CACHE" );
  public static final SubLString $str99$assertion = makeString( "assertion" );
  public static final SubLString $str100$assertion_index = makeString( "assertion-index" );
  public static final SubLString $str101$Dumping_assertion_definitions = makeString( "Dumping assertion definitions" );
  public static final SubLString $str102$__Assertion_definitions_will_be_s = makeString( "~&Assertion definitions will be swapped in lazily from ~A and ~A~%" );
  public static final SubLString $str103$Loading_assertion_definitions = makeString( "Loading assertion definitions" );
  public static final SubLSymbol $sym104$LOAD_ASSERTION_DEF_FROM_CACHE = makeSymbol( "LOAD-ASSERTION-DEF-FROM-CACHE" );
  public static final SubLString $str105$kb_hl_support = makeString( "kb-hl-support" );
  public static final SubLString $str106$kb_hl_support_index = makeString( "kb-hl-support-index" );
  public static final SubLString $str107$Dumping_KB_HL_support_definitions = makeString( "Dumping KB HL support definitions" );
  public static final SubLString $str108$__KB_HL_supports_will_be_swapped_ = makeString( "~&KB HL supports will be swapped in lazily from ~A and ~A~%" );
  public static final SubLString $str109$Loading_KB_HL_support_definitions = makeString( "Loading KB HL support definitions" );
  public static final SubLSymbol $sym110$LOAD_KB_HL_SUPPORT_DEF_FROM_CACHE = makeSymbol( "LOAD-KB-HL-SUPPORT-DEF-FROM-CACHE" );
  public static final SubLString $str111$kb_hl_support_indexing = makeString( "kb-hl-support-indexing" );
  public static final SubLString $str112$Dumping_KB_HL_support_indexing___ = makeString( "Dumping KB HL support indexing..." );
  public static final SubLString $str113$Loading_KB_HL_support_indexing___ = makeString( "Loading KB HL support indexing..." );
  public static final SubLString $str114$bookkeeping_assertions = makeString( "bookkeeping-assertions" );
  public static final SubLString $str115$Dumping_bookkeeping_assertions___ = makeString( "Dumping bookkeeping assertions..." );
  public static final SubLList $list116 = cons( makeSymbol( "PRED" ), makeSymbol( "SUBINDEX" ) );
  public static final SubLString $str117$Loading_bookkeeping_assertions___ = makeString( "Loading bookkeeping assertions..." );
  public static final SubLString $str118$Dumping_rule_utility_experience__ = makeString( "Dumping rule utility experience..." );
  public static final SubLString $str119$Loading_rule_utility_experience__ = makeString( "Loading rule utility experience..." );
  public static final SubLString $str120$indices = makeString( "indices" );
  public static final SubLString $str121$indices_index = makeString( "indices-index" );
  public static final SubLString $str122$Dumping_constant_indices = makeString( "Dumping constant indices" );
  public static final SubLString $str123$__Constant_indexing_will_be_swapp = makeString( "~&Constant indexing will be swapped in lazily from ~A and ~A~%" );
  public static final SubLString $str124$Loading_constant_indices = makeString( "Loading constant indices" );
  public static final SubLSymbol $sym125$LOAD_CONSTANT_INDEX_FROM_CACHE = makeSymbol( "LOAD-CONSTANT-INDEX-FROM-CACHE" );
  public static final SubLString $str126$nat_indices = makeString( "nat-indices" );
  public static final SubLString $str127$nat_indices_index = makeString( "nat-indices-index" );
  public static final SubLString $str128$Dumping_NART_indices = makeString( "Dumping NART indices" );
  public static final SubLString $str129$__NART_indexing_will_be_swapped_i = makeString( "~&NART indexing will be swapped in lazily from ~A and ~A~%" );
  public static final SubLString $str130$Loading_NART_indices = makeString( "Loading NART indices" );
  public static final SubLSymbol $sym131$LOAD_NART_INDEX_FROM_CACHE = makeSymbol( "LOAD-NART-INDEX-FROM-CACHE" );
  public static final SubLString $str132$unrepresented_term_indices = makeString( "unrepresented-term-indices" );
  public static final SubLString $str133$unrepresented_term_indices_index = makeString( "unrepresented-term-indices-index" );
  public static final SubLString $str134$Dumping_unrepresented_term_indice = makeString( "Dumping unrepresented term indices" );
  public static final SubLString $str135$__Unrepresented_term_indexing_wil = makeString( "~&Unrepresented term indexing will be swapped in lazily from ~A and ~A~%" );
  public static final SubLString $str136$Loading_unrepresented_term_indice = makeString( "Loading unrepresented term indices" );
  public static final SubLSymbol $sym137$LOAD_UNREPRESENTED_TERM_INDEX_FROM_CACHE = makeSymbol( "LOAD-UNREPRESENTED-TERM-INDEX-FROM-CACHE" );
  public static final SubLString $str138$assertion_indices = makeString( "assertion-indices" );
  public static final SubLString $str139$Dumping_assertion_indices = makeString( "Dumping assertion indices" );
  public static final SubLString $str140$Loading_assertion_indices = makeString( "Loading assertion indices" );
  public static final SubLString $str141$auxiliary_indices = makeString( "auxiliary-indices" );
  public static final SubLString $str142$Dumping_auxiliary_indices___ = makeString( "Dumping auxiliary indices..." );
  public static final SubLString $str143$Loading_auxiliary_indices = makeString( "Loading auxiliary indices" );
  public static final SubLString $str144$bookkeeping_indices = makeString( "bookkeeping-indices" );
  public static final SubLString $str145$Dumping_bookkeeping_indices = makeString( "Dumping bookkeeping indices" );
  public static final SubLSymbol $sym146$LOAD_BOOKKEEPING_INDICES = makeSymbol( "LOAD-BOOKKEEPING-INDICES" );
  public static final SubLString $str147$Loading_bookkeeping_indices___ = makeString( "Loading bookkeeping indices..." );
  public static final SubLString $str148$rule_set = makeString( "rule-set" );
  public static final SubLString $str149$Dumping_rule_set___ = makeString( "Dumping rule set..." );
  public static final SubLSymbol $sym150$LOAD_RULE_SET_FROM_STREAM = makeSymbol( "LOAD-RULE-SET-FROM-STREAM" );
  public static final SubLString $str151$Loading_rule_set___ = makeString( "Loading rule set..." );
  public static final SubLString $str152$nart_hl_formula = makeString( "nart-hl-formula" );
  public static final SubLString $str153$nart_hl_formula_index = makeString( "nart-hl-formula-index" );
  public static final SubLSymbol $sym154$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
  public static final SubLString $str155$Dumping_NART_HL_formulas = makeString( "Dumping NART HL formulas" );
  public static final SubLString $str156$_A = makeString( "~A" );
  public static final SubLString $str157$__NART_HL_formulas_will_be_swappe = makeString( "~&NART HL formulas will be swapped in lazily from ~A and ~A~%" );
  public static final SubLString $str158$Loading_nart_hl_formula_definitio = makeString( "Loading nart-hl-formula definitions" );
  public static final SubLString $str159$misc = makeString( "misc" );
  public static final SubLString $str160$Dumping_miscellaneous_stuff___ = makeString( "Dumping miscellaneous stuff..." );
  public static final SubLString $str161$Loading_miscellaneous_stuff___ = makeString( "Loading miscellaneous stuff..." );
  public static final SubLString $str162$sbhl_modules = makeString( "sbhl-modules" );
  public static final SubLString $str163$sbhl_module_graphs = makeString( "sbhl-module-graphs" );
  public static final SubLString $str164$sbhl_module_graphs_index = makeString( "sbhl-module-graphs-index" );
  public static final SubLString $str165$Dumping_SBHL_modules_and_graphs__ = makeString( "Dumping SBHL modules and graphs..." );
  public static final SubLSymbol $kw166$SWAPPED_OUT = makeKeyword( "SWAPPED-OUT" );
  public static final SubLString $str167$Dumping_SBHL_graphs___ = makeString( "Dumping SBHL graphs..." );
  public static final SubLSymbol $kw168$WARN_ONLY = makeKeyword( "WARN-ONLY" );
  public static final SubLString $str169$Loading_SBHL_graphs___ = makeString( "Loading SBHL graphs..." );
  public static final SubLInteger $int170$30 = makeInteger( 30 );
  public static final SubLSymbol $kw171$GRAPH = makeKeyword( "GRAPH" );
  public static final SubLSymbol $kw172$END = makeKeyword( "END" );
  public static final SubLSymbol $kw173$ISA_ARG2_NAUT_TABLE = makeKeyword( "ISA-ARG2-NAUT-TABLE" );
  public static final SubLSymbol $kw174$NON_FORT_ISA_TABLE = makeKeyword( "NON-FORT-ISA-TABLE" );
  public static final SubLSymbol $kw175$NON_FORT_INSTANCE_TABLE = makeKeyword( "NON-FORT-INSTANCE-TABLE" );
  public static final SubLString $str176$Could_not_handle_SBHL_miscellany_ = makeString( "Could not handle SBHL miscellany token ~s" );
  public static final SubLString $str177$sbhl_cache = makeString( "sbhl-cache" );
  public static final SubLString $str178$Dumping_SBHL_cache___ = makeString( "Dumping SBHL cache..." );
  public static final SubLString $str179$Loading_SBHL_cache___ = makeString( "Loading SBHL cache..." );
  public static final SubLString $str180$cardinality_estimates = makeString( "cardinality-estimates" );
  public static final SubLString $str181$Dumping_cardinality_estimates___ = makeString( "Dumping cardinality estimates..." );
  public static final SubLSymbol $sym182$LOAD_CARDINALITY_ESTIMATES_FROM_STREAM = makeSymbol( "LOAD-CARDINALITY-ESTIMATES-FROM-STREAM" );
  public static final SubLString $str183$Loading_cardinality_estimates___ = makeString( "Loading cardinality estimates..." );
  public static final SubLList $list184 = list( list( makeSymbol( "*COMPUTE-ARG-TYPE-CACHE-ON-DUMP?*" ), NIL ) );
  public static final SubLString $str185$arg_type_cache = makeString( "arg-type-cache" );
  public static final SubLString $str186$Dumping_arg_type_cache___ = makeString( "Dumping arg-type cache..." );
  public static final SubLString $str187$Loading_arg_type_cache___ = makeString( "Loading arg-type cache..." );
  public static final SubLString $str188$Rebuilding_arg_type_cache = makeString( "Rebuilding arg-type cache" );
  public static final SubLString $str189$defns_cache = makeString( "defns-cache" );
  public static final SubLString $str190$Dumping_defns_cache___ = makeString( "Dumping defns cache..." );
  public static final SubLString $str191$Loading_defns_cache___ = makeString( "Loading defns cache..." );
  public static final SubLString $str192$tva_cache = makeString( "tva-cache" );
  public static final SubLString $str193$Dumping_TVA_cache___ = makeString( "Dumping TVA cache..." );
  public static final SubLSymbol $sym194$LOAD_TVA_CACHE_FROM_STREAM = makeSymbol( "LOAD-TVA-CACHE-FROM-STREAM" );
  public static final SubLString $str195$Loading_TVA_cache___ = makeString( "Loading TVA cache..." );
  public static final SubLString $str196$somewhere_cache = makeString( "somewhere-cache" );
  public static final SubLString $str197$Dumping_somewhere_rules_cache___ = makeString( "Dumping somewhere rules cache..." );
  public static final SubLString $str198$Loading_somewhere_cache___ = makeString( "Loading somewhere cache..." );
  public static final SubLString $str199$arity_cache = makeString( "arity-cache" );
  public static final SubLString $str200$Dumping_arity_cache___ = makeString( "Dumping arity cache..." );
  public static final SubLString $str201$Loading_arity_cache___ = makeString( "Loading arity cache..." );
  public static final SubLString $str202$________Performing_other_KB_dump_ = makeString( "~&~%;;; Performing other KB dump activities at ~A~%" );
  public static final SubLString $str203$________Performing_KB_initializat = makeString( "~&~%;;; Performing KB initializations at ~A~%" );
  public static final SubLString $str204$Reformulator___A__ = makeString( "Reformulator: ~A~%" );
  public static final SubLString $str205$Paraphrase___A__ = makeString( "Paraphrase: ~A~%" );
  public static final SubLString $str206$Cyc_Task_Scheduler___A__ = makeString( "Cyc Task Scheduler: ~A~%" );
  public static final SubLString $str207$SKSI___A__ = makeString( "SKSI: ~A~%" );
  public static final SubLString $str208$Quant___A__ = makeString( "Quant: ~A~%" );
  public static final SubLString $str209$Date___A__ = makeString( "Date: ~A~%" );
  public static final SubLString $str210$Time___A__ = makeString( "Time: ~A~%" );
  public static final SubLString $str211$Lexicon___A__ = makeString( "Lexicon: ~A~%" );
  public static final SubLString $str212$NL___A__ = makeString( "NL: ~A~%" );
  public static final SubLString $str213$RTP___A__ = makeString( "RTP: ~A~%" );
  public static final SubLString $str214$RKF___A__ = makeString( "RKF: ~A~%" );
  public static final SubLString $str215$Thesaurus___A__ = makeString( "Thesaurus: ~A~%" );
  public static final SubLString $str216$Wordnet___A__ = makeString( "Wordnet: ~A~%" );
  public static final SubLString $str217$Planner___A__ = makeString( "Planner: ~A~%" );
  public static final SubLString $str218$Secure___A__ = makeString( "Secure: ~A~%" );

  //// Initializers
  @Override
  public void declareFunctions()
  {
    declare_dumper_file();
  }

  @Override
  public void initializeVariables()
  {
    init_dumper_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_dumper_file();
  }
}
