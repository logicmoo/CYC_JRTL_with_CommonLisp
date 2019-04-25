package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class genls_hierarchy_problems
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.genls_hierarchy_problems";
  public static final String myFingerPrint = "16ab13d6460d342c092b84088b9bbcb6a1fbd67bd5d99088b9894380941ff26f";
  private static final SubLString $str0$mapping_Cyc_FORTs;
  private static final SubLSymbol $kw1$SKIP;
  private static final SubLSymbol $sym2$FORT_P;
  private static final SubLObject $const3$Thing;
  private static final SubLObject $const4$genls;

  @SubLTranslatedFile.SubL(source = "cycl/genls-hierarchy-problems.lisp", position = 1384L)
  public static SubLObject forts_meeting_criterion(final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject message = $str0$mapping_Cyc_FORTs;
    final SubLObject total = forts.fort_count();
    SubLObject sofar = ZERO_INTEGER;
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
        utilities_macros.noting_percent_progress_preamble( message );
        SubLObject cdolist_list_var = forts.do_forts_tables();
        SubLObject table_var = NIL;
        table_var = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject idx = table_var;
          if( NIL == id_index.id_index_objects_empty_p( idx, $kw1$SKIP ) )
          {
            final SubLObject idx_$1 = idx;
            if( NIL == id_index.id_index_dense_objects_empty_p( idx_$1, $kw1$SKIP ) )
            {
              final SubLObject vector_var = id_index.id_index_dense_objects( idx_$1 );
              final SubLObject backwardP_var = NIL;
              SubLObject length;
              SubLObject v_iteration;
              SubLObject id;
              SubLObject fort;
              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
              {
                id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                fort = Vectors.aref( vector_var, id );
                if( NIL == id_index.id_index_tombstone_p( fort ) || NIL == id_index.id_index_skip_tombstones_p( $kw1$SKIP ) )
                {
                  if( NIL != id_index.id_index_tombstone_p( fort ) )
                  {
                    fort = $kw1$SKIP;
                  }
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                  if( NIL != Functions.funcall( pred, fort ) )
                  {
                    result = ConsesLow.cons( fort, result );
                  }
                }
              }
            }
            final SubLObject idx_$2 = idx;
            if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$2 ) || NIL == id_index.id_index_skip_tombstones_p( $kw1$SKIP ) )
            {
              final SubLObject sparse = id_index.id_index_sparse_objects( idx_$2 );
              SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$2 );
              final SubLObject end_id = id_index.id_index_next_id( idx_$2 );
              final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw1$SKIP ) ) ? NIL : $kw1$SKIP;
              while ( id2.numL( end_id ))
              {
                final SubLObject fort2 = Hashtables.gethash_without_values( id2, sparse, v_default );
                if( NIL == id_index.id_index_skip_tombstones_p( $kw1$SKIP ) || NIL == id_index.id_index_tombstone_p( fort2 ) )
                {
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                  if( NIL != Functions.funcall( pred, fort2 ) )
                  {
                    result = ConsesLow.cons( fort2, result );
                  }
                }
                id2 = Numbers.add( id2, ONE_INTEGER );
              }
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          table_var = cdolist_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$3, thread );
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
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/genls-hierarchy-problems.lisp", position = 1685L)
  public static SubLObject fort_not_a_thingP(final SubLObject fort)
  {
    assert NIL != forts.fort_p( fort ) : fort;
    return makeBoolean( NIL == kb_accessors.kb_thing_p( fort ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genls-hierarchy-problems.lisp", position = 1787L)
  public static SubLObject fort_isa_collection_but_not_a_spec_of_thingP(final SubLObject fort)
  {
    assert NIL != forts.fort_p( fort ) : fort;
    return makeBoolean( NIL != fort_types_interface.collection_p( fort ) && NIL == genls.genl_in_any_mtP( fort, $const3$Thing ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genls-hierarchy-problems.lisp", position = 1962L)
  public static SubLObject fort_not_a_collection_but_has_specs_or_genlsP(final SubLObject fort)
  {
    assert NIL != forts.fort_p( fort ) : fort;
    return makeBoolean( NIL == fort_types_interface.collection_p( fort ) && ( NIL != kb_mapping_utilities.some_pred_value_in_any_mt( fort, $const4$genls, ONE_INTEGER, UNPROVIDED ) || NIL != kb_mapping_utilities
        .some_pred_value_in_any_mt( fort, $const4$genls, TWO_INTEGER, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genls-hierarchy-problems.lisp", position = 2203L)
  public static SubLObject fort_isa_thing_but_neither_a_set_or_collection_nor_individualP(final SubLObject fort)
  {
    assert NIL != forts.fort_p( fort ) : fort;
    return makeBoolean( NIL != kb_accessors.kb_thing_p( fort ) && NIL == kb_accessors.kb_set_or_collection_p( fort ) && NIL == kb_accessors.kb_individual_p( fort ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genls-hierarchy-problems.lisp", position = 2429L)
  public static SubLObject fort_neither_a_set_or_collection_nor_individualP(final SubLObject fort)
  {
    assert NIL != forts.fort_p( fort ) : fort;
    return makeBoolean( NIL == kb_accessors.kb_set_or_collection_p( fort ) && NIL == kb_accessors.kb_individual_p( fort ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genls-hierarchy-problems.lisp", position = 2617L)
  public static SubLObject fort_both_a_set_or_collection_and_individualP(final SubLObject fort)
  {
    assert NIL != forts.fort_p( fort ) : fort;
    return makeBoolean( NIL != kb_accessors.kb_set_or_collection_p( fort ) && NIL != kb_accessors.kb_individual_p( fort ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/genls-hierarchy-problems.lisp", position = 2788L)
  public static SubLObject fort_not_properly_in_genls_hierarchyP(final SubLObject fort)
  {
    assert NIL != forts.fort_p( fort ) : fort;
    if( NIL != fort_types_interface.collection_p( fort ) )
    {
      return makeBoolean( NIL == genls.genl_in_any_mtP( fort, $const3$Thing ) );
    }
    if( NIL != kb_accessors.kb_individual_p( fort ) )
    {
      return makeBoolean( NIL != kb_mapping_utilities.some_pred_value_in_any_mt( fort, $const4$genls, ONE_INTEGER, UNPROVIDED ) || NIL != kb_mapping_utilities.some_pred_value_in_any_mt( fort, $const4$genls, TWO_INTEGER,
          UNPROVIDED ) );
    }
    if( NIL != kb_accessors.kb_set_mathematical_p( fort ) )
    {
      return NIL;
    }
    return T;
  }

  public static SubLObject declare_genls_hierarchy_problems_file()
  {
    SubLFiles.declareFunction( me, "forts_meeting_criterion", "FORTS-MEETING-CRITERION", 1, 0, false );
    SubLFiles.declareFunction( me, "fort_not_a_thingP", "FORT-NOT-A-THING?", 1, 0, false );
    SubLFiles.declareFunction( me, "fort_isa_collection_but_not_a_spec_of_thingP", "FORT-ISA-COLLECTION-BUT-NOT-A-SPEC-OF-THING?", 1, 0, false );
    SubLFiles.declareFunction( me, "fort_not_a_collection_but_has_specs_or_genlsP", "FORT-NOT-A-COLLECTION-BUT-HAS-SPECS-OR-GENLS?", 1, 0, false );
    SubLFiles.declareFunction( me, "fort_isa_thing_but_neither_a_set_or_collection_nor_individualP", "FORT-ISA-THING-BUT-NEITHER-A-SET-OR-COLLECTION-NOR-INDIVIDUAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "fort_neither_a_set_or_collection_nor_individualP", "FORT-NEITHER-A-SET-OR-COLLECTION-NOR-INDIVIDUAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "fort_both_a_set_or_collection_and_individualP", "FORT-BOTH-A-SET-OR-COLLECTION-AND-INDIVIDUAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "fort_not_properly_in_genls_hierarchyP", "FORT-NOT-PROPERLY-IN-GENLS-HIERARCHY?", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_genls_hierarchy_problems_file()
  {
    return NIL;
  }

  public static SubLObject setup_genls_hierarchy_problems_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_genls_hierarchy_problems_file();
  }

  @Override
  public void initializeVariables()
  {
    init_genls_hierarchy_problems_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_genls_hierarchy_problems_file();
  }
  static
  {
    me = new genls_hierarchy_problems();
    $str0$mapping_Cyc_FORTs = makeString( "mapping Cyc FORTs" );
    $kw1$SKIP = makeKeyword( "SKIP" );
    $sym2$FORT_P = makeSymbol( "FORT-P" );
    $const3$Thing = constant_handles.reader_make_constant_shell( makeString( "Thing" ) );
    $const4$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
  }
}
/*
 * 
 * Total time: 129 ms
 * 
 */