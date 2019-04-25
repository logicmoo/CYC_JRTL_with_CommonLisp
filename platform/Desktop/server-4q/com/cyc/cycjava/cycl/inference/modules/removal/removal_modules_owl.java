package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.quantities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_owl
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_owl";
  public static final String myFingerPrint = "f40be090bfa082d89be83a0b3d5015dc1053c86df662e226c5121077c6888ea3";
  private static final SubLObject $const0$owlExportTermFromContextsWithIsaF;
  private static final SubLSymbol $kw1$POS;
  private static final SubLSymbol $kw2$MT;
  private static final SubLSymbol $kw3$BROAD_MT;
  private static final SubLString $str4$do_broad_mt_index;
  private static final SubLSymbol $sym5$STRINGP;
  private static final SubLSymbol $kw6$SKIP;
  private static final SubLSymbol $kw7$OPAQUE;
  private static final SubLObject $const8$UniversalVocabularyMt;
  private static final SubLSymbol $kw9$TRUE_MON;
  private static final SubLSymbol $kw10$REMOVAL_OWL_EXPORT_TERM_FROM_CONTEXTS_WITH_ISA_FILTERS;
  private static final SubLList $list11;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-owl.lisp", position = 1092L)
  public static SubLObject removal_owl_export_term_from_contexts_with_isa_filters_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    SubLObject cost = ZERO_INTEGER;
    final SubLObject mt_set = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    SubLObject cdolist_list_var = quantities.set_extent( mt_set, UNPROVIDED, UNPROVIDED );
    SubLObject mt = NIL;
    mt = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      cost = Numbers.add( cost, kb_indexing.num_mt_index( mt ) );
      cdolist_list_var = cdolist_list_var.rest();
      mt = cdolist_list_var.first();
    }
    return cost;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-owl.lisp", position = 1369L)
  public static SubLObject removal_owl_export_term_from_contexts_with_isa_filters_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject fort_set = set.new_set( Symbols.symbol_function( EQL ), UNPROVIDED );
    final SubLObject arg3 = cycl_utilities.atomic_sentence_arg3( asent, UNPROVIDED );
    final SubLObject mt_set = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject col_set = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject mts = quantities.set_extent( mt_set, UNPROVIDED, UNPROVIDED );
    final SubLObject cols = quantities.set_extent( col_set, UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var = mts;
    SubLObject mt = NIL;
    mt = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method( mt );
      if( pcase_var.eql( $kw2$MT ) )
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
              final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( ass ) );
              if( NIL != valid )
              {
                SubLObject cdolist_list_var_$1 = assertions_high.assertion_forts( ass, T, T, T, NIL );
                SubLObject fort = NIL;
                fort = cdolist_list_var_$1.first();
                while ( NIL != cdolist_list_var_$1)
                {
                  if( NIL != forts.fort_p( fort ) && NIL == isa.isa_anyP( fort, cols, mt, UNPROVIDED ) )
                  {
                    set.set_add( fort, fort_set );
                  }
                  cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                  fort = cdolist_list_var_$1.first();
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
            }
          }
        }
      }
      else if( pcase_var.eql( $kw3$BROAD_MT ) && NIL != kb_mapping_macros.do_broad_mt_index_key_validator( mt, NIL ) )
      {
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = $str4$do_broad_mt_index;
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
            final SubLObject idx_$2 = idx;
            if( NIL == id_index.id_index_objects_empty_p( idx_$2, $kw6$SKIP ) )
            {
              final SubLObject idx_$3 = idx_$2;
              if( NIL == id_index.id_index_dense_objects_empty_p( idx_$3, $kw6$SKIP ) )
              {
                final SubLObject vector_var = id_index.id_index_dense_objects( idx_$3 );
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject a_id;
                SubLObject a_handle;
                SubLObject ass2;
                SubLObject cdolist_list_var_$2;
                SubLObject fort2;
                for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
                {
                  a_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                  a_handle = Vectors.aref( vector_var, a_id );
                  if( NIL == id_index.id_index_tombstone_p( a_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw6$SKIP ) )
                  {
                    if( NIL != id_index.id_index_tombstone_p( a_handle ) )
                    {
                      a_handle = $kw6$SKIP;
                    }
                    ass2 = assertion_handles.resolve_assertion_id_value_pair( a_id, a_handle );
                    if( NIL != kb_mapping_macros.do_broad_mt_index_match_p( ass2, mt, NIL, NIL ) )
                    {
                      cdolist_list_var_$2 = assertions_high.assertion_forts( ass2, T, T, T, NIL );
                      fort2 = NIL;
                      fort2 = cdolist_list_var_$2.first();
                      while ( NIL != cdolist_list_var_$2)
                      {
                        if( NIL != forts.fort_p( fort2 ) && NIL == isa.isa_anyP( fort2, cols, mt, UNPROVIDED ) )
                        {
                          set.set_add( fort2, fort_set );
                        }
                        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                        fort2 = cdolist_list_var_$2.first();
                      }
                    }
                    sofar = Numbers.add( sofar, ONE_INTEGER );
                    utilities_macros.note_percent_progress( sofar, total );
                  }
                }
              }
              final SubLObject idx_$4 = idx_$2;
              if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$4 ) || NIL == id_index.id_index_skip_tombstones_p( $kw6$SKIP ) )
              {
                final SubLObject sparse = id_index.id_index_sparse_objects( idx_$4 );
                SubLObject a_id2 = id_index.id_index_sparse_id_threshold( idx_$4 );
                final SubLObject end_id = id_index.id_index_next_id( idx_$4 );
                final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw6$SKIP ) ) ? NIL : $kw6$SKIP;
                while ( a_id2.numL( end_id ))
                {
                  final SubLObject a_handle2 = Hashtables.gethash_without_values( a_id2, sparse, v_default );
                  if( NIL == id_index.id_index_skip_tombstones_p( $kw6$SKIP ) || NIL == id_index.id_index_tombstone_p( a_handle2 ) )
                  {
                    final SubLObject ass3 = assertion_handles.resolve_assertion_id_value_pair( a_id2, a_handle2 );
                    if( NIL != kb_mapping_macros.do_broad_mt_index_match_p( ass3, mt, NIL, NIL ) )
                    {
                      SubLObject cdolist_list_var_$3 = assertions_high.assertion_forts( ass3, T, T, T, NIL );
                      SubLObject fort3 = NIL;
                      fort3 = cdolist_list_var_$3.first();
                      while ( NIL != cdolist_list_var_$3)
                      {
                        if( NIL != forts.fort_p( fort3 ) && NIL == isa.isa_anyP( fort3, cols, mt, UNPROVIDED ) )
                        {
                          set.set_add( fort3, fort_set );
                        }
                        cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                        fort3 = cdolist_list_var_$3.first();
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
            final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              utilities_macros.noting_percent_progress_postamble();
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$7, thread );
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
      cdolist_list_var = cdolist_list_var.rest();
      mt = cdolist_list_var.first();
    }
    final SubLObject set_contents_var = set.do_set_internal( fort_set );
    SubLObject basis_object;
    SubLObject state;
    SubLObject fort4;
    SubLObject v_bindings;
    SubLObject unify_justification;
    SubLObject unified_arg3;
    SubLObject support_asent;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      fort4 = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, fort4 ) )
      {
        thread.resetMultipleValues();
        v_bindings = unification_utilities.term_unify( arg3, fort4, T, T );
        unify_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != v_bindings )
        {
          unified_arg3 = bindings.subst_bindings( v_bindings, arg3 );
          support_asent = el_utilities.replace_formula_arg( THREE_INTEGER, unified_arg3, asent );
          backward.removal_add_node( arguments.make_hl_support( $kw7$OPAQUE, support_asent, $const8$UniversalVocabularyMt, $kw9$TRUE_MON ), v_bindings, unify_justification );
        }
      }
    }
    return NIL;
  }

  public static SubLObject declare_removal_modules_owl_file()
  {
    SubLFiles.declareFunction( me, "removal_owl_export_term_from_contexts_with_isa_filters_cost", "REMOVAL-OWL-EXPORT-TERM-FROM-CONTEXTS-WITH-ISA-FILTERS-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_owl_export_term_from_contexts_with_isa_filters_expand", "REMOVAL-OWL-EXPORT-TERM-FROM-CONTEXTS-WITH-ISA-FILTERS-EXPAND", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_owl_file()
  {
    return NIL;
  }

  public static SubLObject setup_removal_modules_owl_file()
  {
    inference_modules.register_solely_specific_removal_module_predicate( $const0$owlExportTermFromContextsWithIsaF );
    preference_modules.doomed_unless_arg_bindable( $kw1$POS, $const0$owlExportTermFromContextsWithIsaF, ONE_INTEGER );
    preference_modules.doomed_unless_arg_bindable( $kw1$POS, $const0$owlExportTermFromContextsWithIsaF, TWO_INTEGER );
    inference_modules.inference_removal_module( $kw10$REMOVAL_OWL_EXPORT_TERM_FROM_CONTEXTS_WITH_ISA_FILTERS, $list11 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_owl_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_owl_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_owl_file();
  }
  static
  {
    me = new removal_modules_owl();
    $const0$owlExportTermFromContextsWithIsaF = constant_handles.reader_make_constant_shell( makeString( "owlExportTermFromContextsWithIsaFilters" ) );
    $kw1$POS = makeKeyword( "POS" );
    $kw2$MT = makeKeyword( "MT" );
    $kw3$BROAD_MT = makeKeyword( "BROAD-MT" );
    $str4$do_broad_mt_index = makeString( "do-broad-mt-index" );
    $sym5$STRINGP = makeSymbol( "STRINGP" );
    $kw6$SKIP = makeKeyword( "SKIP" );
    $kw7$OPAQUE = makeKeyword( "OPAQUE" );
    $const8$UniversalVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) );
    $kw9$TRUE_MON = makeKeyword( "TRUE-MON" );
    $kw10$REMOVAL_OWL_EXPORT_TERM_FROM_CONTEXTS_WITH_ISA_FILTERS = makeKeyword( "REMOVAL-OWL-EXPORT-TERM-FROM-CONTEXTS-WITH-ISA-FILTERS" );
    $list11 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString(
        "owlExportTermFromContextsWithIsaFilters" ) ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "owlExportTermFromContextsWithIsaFilters" ) ),
            makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-OWL-EXPORT-TERM-FROM-CONTEXTS-WITH-ISA-FILTERS-COST" ), makeKeyword(
                "EXPAND" ), makeSymbol( "REMOVAL-OWL-EXPORT-TERM-FROM-CONTEXTS-WITH-ISA-FILTERS-EXPAND" )
    } );
  }
}
/*
 * 
 * Total time: 242 ms
 * 
 */