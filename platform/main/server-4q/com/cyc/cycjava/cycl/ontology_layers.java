package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class ontology_layers
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.ontology_layers";
  public static final String myFingerPrint = "cec6c278f21e400b91be2428fc57dc84aab16ce4684dfa8d2a830034bc7d3c42";
  @SubLTranslatedFile.SubL(source = "cycl/ontology-layers.lisp", position = 1183L)
  private static SubLSymbol $ontology_layers$;
  @SubLTranslatedFile.SubL(source = "cycl/ontology-layers.lisp", position = 1672L)
  private static SubLSymbol $upper_ontology_core_terms$;
  @SubLTranslatedFile.SubL(source = "cycl/ontology-layers.lisp", position = 1835L)
  private static SubLSymbol $upper_ontology_collections$;
  @SubLTranslatedFile.SubL(source = "cycl/ontology-layers.lisp", position = 1889L)
  private static SubLSymbol $middle_ontology_collections$;
  @SubLTranslatedFile.SubL(source = "cycl/ontology-layers.lisp", position = 1943L)
  private static SubLSymbol $upper_ontology_relations$;
  @SubLTranslatedFile.SubL(source = "cycl/ontology-layers.lisp", position = 1997L)
  private static SubLSymbol $middle_ontology_relations$;
  private static final SubLList $list0;
  private static final SubLSymbol $kw1$UNKNOWN;
  private static final SubLSymbol $sym2$_UPPER_ONTOLOGY_CORE_TERMS_;
  private static final SubLSymbol $sym3$_UPPER_ONTOLOGY_COLLECTIONS_;
  private static final SubLSymbol $sym4$_MIDDLE_ONTOLOGY_COLLECTIONS_;
  private static final SubLSymbol $sym5$_UPPER_ONTOLOGY_RELATIONS_;
  private static final SubLSymbol $sym6$_MIDDLE_ONTOLOGY_RELATIONS_;
  private static final SubLSymbol $sym7$FORT_P;
  private static final SubLSymbol $kw8$UPPER;
  private static final SubLSymbol $kw9$MIDDLE;
  private static final SubLSymbol $kw10$LOWER;
  private static final SubLSymbol $sym11$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const12$EverythingPSC;
  private static final SubLString $str13$Computing_collection_generalizati;
  private static final SubLSymbol $kw14$SKIP;
  private static final SubLSymbol $sym15$_;
  private static final SubLSymbol $sym16$CDR;
  private static final SubLFloat $float17$0_9;
  private static final SubLFloat $float18$0_99;
  private static final SubLList $list19;
  private static final SubLList $list20;
  private static final SubLString $str21$Computing_relation_ontology_layer;
  private static final SubLSymbol $sym22$NUM_INDEX;
  private static final SubLObject $const23$CoreUnionConstant;
  private static final SubLSymbol $kw24$OUTPUT;
  private static final SubLString $str25$Unable_to_open__S;
  private static final SubLSymbol $kw26$INCLUDE_INDIVIDUALS_;
  private static final SubLSymbol $kw27$UPPER_THRESHOLD;
  private static final SubLSymbol $kw28$MIDDLE_THRESHOLD;
  private static final SubLSymbol $kw29$UPPER_CORE_TERMS;
  private static final SubLSymbol $kw30$UPPER_COLS;
  private static final SubLSymbol $kw31$MIDDLE_COLS;
  private static final SubLSymbol $kw32$UPPER_RELS;
  private static final SubLSymbol $kw33$MIDDLE_RELS;
  private static final SubLSymbol $kw34$INPUT;
  private static final SubLString $str35$Skipping_unrecognized_marker__A_f;
  private static final SubLString $str36$Expected_set__got__A_of_type__A_i;
  private static final SubLList $list37;
  private static final SubLList $list38;
  private static final SubLString $str39$Computing_assertion_ontology_laye;
  private static final SubLSymbol $sym40$STRINGP;
  private static final SubLSymbol $sym41$COLLECTION_P;
  private static final SubLSymbol $kw42$DESCENDING;

  @SubLTranslatedFile.SubL(source = "cycl/ontology-layers.lisp", position = 1309L)
  public static SubLObject ontology_layer_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $ontology_layers$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ontology-layers.lisp", position = 1398L)
  public static SubLObject lower_ontology_layer(final SubLObject layer1, final SubLObject layer2)
  {
    if( layer1 == $kw1$UNKNOWN )
    {
      return layer2;
    }
    if( layer2 == $kw1$UNKNOWN )
    {
      return layer1;
    }
    if( layer1.eql( layer2 ) )
    {
      return layer1;
    }
    if( NIL != list_utilities.position_L( layer1, layer2, $ontology_layers$.getGlobalValue(), Symbols.symbol_function( EQ ), UNPROVIDED ) )
    {
      return layer2;
    }
    return layer1;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ontology-layers.lisp", position = 2051L)
  public static SubLObject fort_ontology_layer(final SubLObject fort)
  {
    assert NIL != forts.fort_p( fort ) : fort;
    if( NIL == $upper_ontology_core_terms$.getGlobalValue() )
    {
      return $kw1$UNKNOWN;
    }
    if( NIL != set.set_memberP( fort, $upper_ontology_core_terms$.getGlobalValue() ) )
    {
      return $kw8$UPPER;
    }
    if( NIL != fort_types_interface.collectionP( fort ) )
    {
      if( NIL != set.set_memberP( fort, $upper_ontology_collections$.getGlobalValue() ) )
      {
        return $kw8$UPPER;
      }
      if( NIL != set.set_memberP( fort, $middle_ontology_collections$.getGlobalValue() ) )
      {
        return $kw9$MIDDLE;
      }
      return $kw10$LOWER;
    }
    else
    {
      if( NIL == kb_accessors.relationP( fort ) )
      {
        return $kw10$LOWER;
      }
      if( NIL != set.set_memberP( fort, $upper_ontology_relations$.getGlobalValue() ) )
      {
        return $kw8$UPPER;
      }
      if( NIL != set.set_memberP( fort, $middle_ontology_relations$.getGlobalValue() ) )
      {
        return $kw9$MIDDLE;
      }
      return $kw10$LOWER;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/ontology-layers.lisp", position = 2909L)
  public static SubLObject assertion_ontology_layer(final SubLObject assertion)
  {
    return assertion_ontology_layer_recursive( assertion, $kw1$UNKNOWN );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ontology-layers.lisp", position = 3027L)
  public static SubLObject assertion_ontology_layer_recursive(final SubLObject v_object, SubLObject layer)
  {
    if( layer != $kw10$LOWER )
    {
      if( NIL != forts.fort_p( v_object ) )
      {
        layer = lower_ontology_layer( layer, fort_ontology_layer( v_object ) );
      }
      else if( v_object.isCons() )
      {
        layer = assertion_ontology_layer_recursive( v_object.first(), layer );
        layer = assertion_ontology_layer_recursive( v_object.rest(), layer );
      }
      else if( NIL != assertion_handles.assertion_p( v_object ) )
      {
        layer = assertion_ontology_layer_recursive( assertions_high.assertion_cons( v_object ), layer );
      }
    }
    return layer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ontology-layers.lisp", position = 3607L)
  public static SubLObject compute_collection_generalization_counts(SubLObject include_individualsP)
  {
    if( include_individualsP == UNPROVIDED )
    {
      include_individualsP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject estimated_collection_count = Numbers.integerDivide( forts.fort_count(), FIVE_INTEGER );
    final SubLObject generalization_count_table = Hashtables.make_hash_table( estimated_collection_count, Symbols.symbol_function( EQ ), UNPROVIDED );
    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
    final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_5 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, TEN_INTEGER ), thread );
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
      mt_relevance_macros.$relevant_mt_function$.bind( $sym11$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const12$EverythingPSC, thread );
      final SubLObject message = $str13$Computing_collection_generalizati;
      final SubLObject total = forts.fort_count();
      SubLObject sofar = ZERO_INTEGER;
      final SubLObject _prev_bind_0_$1 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_1_$2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_2_$3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_3_$4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
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
            if( NIL == id_index.id_index_objects_empty_p( idx, $kw14$SKIP ) )
            {
              final SubLObject idx_$5 = idx;
              if( NIL == id_index.id_index_dense_objects_empty_p( idx_$5, $kw14$SKIP ) )
              {
                final SubLObject vector_var = id_index.id_index_dense_objects( idx_$5 );
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject fort;
                SubLObject cdolist_list_var_$6;
                SubLObject generalizations;
                SubLObject generalization;
                for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
                {
                  id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                  fort = Vectors.aref( vector_var, id );
                  if( NIL == id_index.id_index_tombstone_p( fort ) || NIL == id_index.id_index_skip_tombstones_p( $kw14$SKIP ) )
                  {
                    if( NIL != id_index.id_index_tombstone_p( fort ) )
                    {
                      fort = $kw14$SKIP;
                    }
                    sofar = Numbers.add( sofar, ONE_INTEGER );
                    utilities_macros.note_percent_progress( sofar, total );
                    generalizations = ( cdolist_list_var_$6 = ( NIL != fort_types_interface.collectionP( fort ) ) ? genls.all_genls( fort, UNPROVIDED, UNPROVIDED )
                        : ( ( NIL != include_individualsP ) ? isa.all_isa( fort, UNPROVIDED, UNPROVIDED ) : NIL ) );
                    generalization = NIL;
                    generalization = cdolist_list_var_$6.first();
                    while ( NIL != cdolist_list_var_$6)
                    {
                      if( NIL != forts.fort_p( generalization ) )
                      {
                        Hashtables.sethash( generalization, generalization_count_table, Numbers.add( Hashtables.gethash_without_values( generalization, generalization_count_table, ZERO_INTEGER ), ONE_INTEGER ) );
                      }
                      cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                      generalization = cdolist_list_var_$6.first();
                    }
                  }
                }
              }
              final SubLObject idx_$6 = idx;
              if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$6 ) || NIL == id_index.id_index_skip_tombstones_p( $kw14$SKIP ) )
              {
                final SubLObject sparse = id_index.id_index_sparse_objects( idx_$6 );
                SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$6 );
                final SubLObject end_id = id_index.id_index_next_id( idx_$6 );
                final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw14$SKIP ) ) ? NIL : $kw14$SKIP;
                while ( id2.numL( end_id ))
                {
                  final SubLObject fort2 = Hashtables.gethash_without_values( id2, sparse, v_default );
                  if( NIL == id_index.id_index_skip_tombstones_p( $kw14$SKIP ) || NIL == id_index.id_index_tombstone_p( fort2 ) )
                  {
                    sofar = Numbers.add( sofar, ONE_INTEGER );
                    utilities_macros.note_percent_progress( sofar, total );
                    SubLObject cdolist_list_var_$7;
                    final SubLObject generalizations2 = cdolist_list_var_$7 = ( NIL != fort_types_interface.collectionP( fort2 ) ) ? genls.all_genls( fort2, UNPROVIDED, UNPROVIDED )
                        : ( ( NIL != include_individualsP ) ? isa.all_isa( fort2, UNPROVIDED, UNPROVIDED ) : NIL );
                    SubLObject generalization2 = NIL;
                    generalization2 = cdolist_list_var_$7.first();
                    while ( NIL != cdolist_list_var_$7)
                    {
                      if( NIL != forts.fort_p( generalization2 ) )
                      {
                        Hashtables.sethash( generalization2, generalization_count_table, Numbers.add( Hashtables.gethash_without_values( generalization2, generalization_count_table, ZERO_INTEGER ), ONE_INTEGER ) );
                      }
                      cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                      generalization2 = cdolist_list_var_$7.first();
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
          final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_3_$4, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_2_$3, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1_$2, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$1, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_5, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_4, thread );
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_2, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0, thread );
    }
    SubLObject generalization_count_pairs = hash_table_utilities.hash_table_to_alist( generalization_count_table );
    generalization_count_pairs = Sort.sort( generalization_count_pairs, Symbols.symbol_function( $sym15$_ ), Symbols.symbol_function( $sym16$CDR ) );
    SubLObject total_generalizations = ZERO_INTEGER;
    SubLObject cdolist_list_var2 = generalization_count_pairs;
    SubLObject pair = NIL;
    pair = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      total_generalizations = Numbers.add( total_generalizations, pair.rest() );
      cdolist_list_var2 = cdolist_list_var2.rest();
      pair = cdolist_list_var2.first();
    }
    return Values.values( generalization_count_pairs, total_generalizations );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ontology-layers.lisp", position = 4707L)
  public static SubLObject compute_collection_ontology_layer_sets(final SubLObject generalization_count_pairs, SubLObject upper_threshold, SubLObject middle_threshold)
  {
    if( upper_threshold == UNPROVIDED )
    {
      upper_threshold = $float17$0_9;
    }
    if( middle_threshold == UNPROVIDED )
    {
      middle_threshold = $float18$0_99;
    }
    SubLObject total_generalizations = ZERO_INTEGER;
    SubLObject cdolist_list_var = generalization_count_pairs;
    SubLObject pair = NIL;
    pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      total_generalizations = Numbers.add( total_generalizations, pair.rest() );
      cdolist_list_var = cdolist_list_var.rest();
      pair = cdolist_list_var.first();
    }
    SubLObject upper = NIL;
    SubLObject middle = NIL;
    SubLObject lower = NIL;
    final SubLObject upper_limit = Numbers.floor( Numbers.multiply( total_generalizations, upper_threshold ), UNPROVIDED );
    final SubLObject middle_limit = Numbers.floor( Numbers.multiply( total_generalizations, middle_threshold ), UNPROVIDED );
    SubLObject layer = $kw8$UPPER;
    SubLObject sofar = ZERO_INTEGER;
    SubLObject cdolist_list_var2 = generalization_count_pairs;
    SubLObject pair2 = NIL;
    pair2 = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      SubLObject current;
      final SubLObject datum = current = pair2;
      SubLObject fort = NIL;
      SubLObject count = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list19 );
      fort = current.first();
      current = ( count = current.rest() );
      final SubLObject pcase_var = layer;
      if( pcase_var.eql( $kw10$LOWER ) )
      {
        lower = ConsesLow.cons( fort, lower );
      }
      else if( pcase_var.eql( $kw9$MIDDLE ) )
      {
        middle = ConsesLow.cons( fort, middle );
        sofar = Numbers.add( sofar, count );
        if( sofar.numG( middle_limit ) )
        {
          layer = $kw10$LOWER;
        }
      }
      else if( pcase_var.eql( $kw8$UPPER ) )
      {
        upper = ConsesLow.cons( fort, upper );
        sofar = Numbers.add( sofar, count );
        if( sofar.numG( upper_limit ) )
        {
          layer = $kw9$MIDDLE;
        }
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      pair2 = cdolist_list_var2.first();
    }
    upper = Sequences.nreverse( upper );
    middle = Sequences.nreverse( middle );
    lower = Sequences.nreverse( lower );
    return Values.values( ConsesLow.list( upper, middle, lower ), ConsesLow.list( Sequences.length( upper ), Sequences.length( middle ), Sequences.length( lower ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ontology-layers.lisp", position = 5847L)
  public static SubLObject compute_relation_ontology_layer_sets(final SubLObject collection_ontology_layer_sets)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject upper_collections = NIL;
    SubLObject middle_collections = NIL;
    SubLObject lower_collections = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( collection_ontology_layer_sets, collection_ontology_layer_sets, $list20 );
    upper_collections = collection_ontology_layer_sets.first();
    SubLObject current = collection_ontology_layer_sets.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, collection_ontology_layer_sets, $list20 );
    middle_collections = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, collection_ontology_layer_sets, $list20 );
    lower_collections = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject upper_collection_set = set_utilities.construct_set_from_list( upper_collections, Symbols.symbol_function( EQ ), UNPROVIDED );
      final SubLObject middle_collection_set = set_utilities.construct_set_from_list( middle_collections, Symbols.symbol_function( EQ ), UNPROVIDED );
      SubLObject upper_relations = NIL;
      SubLObject middle_relations = NIL;
      SubLObject lower_relations = NIL;
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym11$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const12$EverythingPSC, thread );
        final SubLObject message = $str21$Computing_relation_ontology_layer;
        final SubLObject total = forts.fort_count();
        SubLObject sofar = ZERO_INTEGER;
        final SubLObject _prev_bind_0_$10 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
        final SubLObject _prev_bind_1_$11 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
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
              if( NIL == id_index.id_index_objects_empty_p( idx, $kw14$SKIP ) )
              {
                final SubLObject idx_$12 = idx;
                if( NIL == id_index.id_index_dense_objects_empty_p( idx_$12, $kw14$SKIP ) )
                {
                  final SubLObject vector_var = id_index.id_index_dense_objects( idx_$12 );
                  final SubLObject backwardP_var = NIL;
                  SubLObject length;
                  SubLObject v_iteration;
                  SubLObject id;
                  SubLObject relation;
                  SubLObject collections;
                  SubLObject layer;
                  SubLObject doneP;
                  SubLObject rest;
                  SubLObject collection;
                  SubLObject collection_layer;
                  SubLObject pcase_var;
                  SubLObject pcase_var2;
                  for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
                  {
                    id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                    relation = Vectors.aref( vector_var, id );
                    if( NIL == id_index.id_index_tombstone_p( relation ) || NIL == id_index.id_index_skip_tombstones_p( $kw14$SKIP ) )
                    {
                      if( NIL != id_index.id_index_tombstone_p( relation ) )
                      {
                        relation = $kw14$SKIP;
                      }
                      sofar = Numbers.add( sofar, ONE_INTEGER );
                      utilities_macros.note_percent_progress( sofar, total );
                      if( NIL != kb_accessors.relationP( relation ) )
                      {
                        collections = relation_constraining_collections( relation, UNPROVIDED );
                        if( NIL != collections )
                        {
                          layer = $kw8$UPPER;
                          for( doneP = NIL, rest = NIL, rest = collections; NIL == doneP && NIL != rest; rest = rest.rest() )
                          {
                            collection = rest.first();
                            collection_layer = NIL;
                            if( NIL != set.set_memberP( collection, upper_collection_set ) )
                            {
                              collection_layer = $kw8$UPPER;
                            }
                            else if( NIL != set.set_memberP( collection, middle_collection_set ) )
                            {
                              collection_layer = $kw9$MIDDLE;
                            }
                            else
                            {
                              collection_layer = $kw10$LOWER;
                            }
                            pcase_var = collection_layer;
                            if( pcase_var.eql( $kw10$LOWER ) )
                            {
                              layer = $kw10$LOWER;
                              doneP = T;
                            }
                            else if( pcase_var.eql( $kw9$MIDDLE ) )
                            {
                              layer = $kw9$MIDDLE;
                            }
                          }
                          pcase_var2 = layer;
                          if( pcase_var2.eql( $kw8$UPPER ) )
                          {
                            upper_relations = ConsesLow.cons( relation, upper_relations );
                          }
                          else if( pcase_var2.eql( $kw9$MIDDLE ) )
                          {
                            middle_relations = ConsesLow.cons( relation, middle_relations );
                          }
                          else if( pcase_var2.eql( $kw10$LOWER ) )
                          {
                            lower_relations = ConsesLow.cons( relation, lower_relations );
                          }
                        }
                        else
                        {
                          lower_relations = ConsesLow.cons( relation, lower_relations );
                        }
                      }
                    }
                  }
                }
                final SubLObject idx_$13 = idx;
                if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$13 ) || NIL == id_index.id_index_skip_tombstones_p( $kw14$SKIP ) )
                {
                  final SubLObject sparse = id_index.id_index_sparse_objects( idx_$13 );
                  SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$13 );
                  final SubLObject end_id = id_index.id_index_next_id( idx_$13 );
                  final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw14$SKIP ) ) ? NIL : $kw14$SKIP;
                  while ( id2.numL( end_id ))
                  {
                    final SubLObject relation2 = Hashtables.gethash_without_values( id2, sparse, v_default );
                    if( NIL == id_index.id_index_skip_tombstones_p( $kw14$SKIP ) || NIL == id_index.id_index_tombstone_p( relation2 ) )
                    {
                      sofar = Numbers.add( sofar, ONE_INTEGER );
                      utilities_macros.note_percent_progress( sofar, total );
                      if( NIL != kb_accessors.relationP( relation2 ) )
                      {
                        final SubLObject collections2 = relation_constraining_collections( relation2, UNPROVIDED );
                        if( NIL != collections2 )
                        {
                          SubLObject layer2 = $kw8$UPPER;
                          SubLObject doneP2;
                          SubLObject rest2;
                          SubLObject collection2;
                          SubLObject collection_layer2;
                          SubLObject pcase_var3;
                          for( doneP2 = NIL, rest2 = NIL, rest2 = collections2; NIL == doneP2 && NIL != rest2; rest2 = rest2.rest() )
                          {
                            collection2 = rest2.first();
                            collection_layer2 = NIL;
                            if( NIL != set.set_memberP( collection2, upper_collection_set ) )
                            {
                              collection_layer2 = $kw8$UPPER;
                            }
                            else if( NIL != set.set_memberP( collection2, middle_collection_set ) )
                            {
                              collection_layer2 = $kw9$MIDDLE;
                            }
                            else
                            {
                              collection_layer2 = $kw10$LOWER;
                            }
                            pcase_var3 = collection_layer2;
                            if( pcase_var3.eql( $kw10$LOWER ) )
                            {
                              layer2 = $kw10$LOWER;
                              doneP2 = T;
                            }
                            else if( pcase_var3.eql( $kw9$MIDDLE ) )
                            {
                              layer2 = $kw9$MIDDLE;
                            }
                          }
                          final SubLObject pcase_var4 = layer2;
                          if( pcase_var4.eql( $kw8$UPPER ) )
                          {
                            upper_relations = ConsesLow.cons( relation2, upper_relations );
                          }
                          else if( pcase_var4.eql( $kw9$MIDDLE ) )
                          {
                            middle_relations = ConsesLow.cons( relation2, middle_relations );
                          }
                          else if( pcase_var4.eql( $kw10$LOWER ) )
                          {
                            lower_relations = ConsesLow.cons( relation2, lower_relations );
                          }
                        }
                        else
                        {
                          lower_relations = ConsesLow.cons( relation2, lower_relations );
                        }
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
            final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              utilities_macros.noting_percent_progress_postamble();
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$11, thread );
            }
          }
        }
        finally
        {
          utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
          utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
          utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1_$11, thread );
          utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$10, thread );
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
      upper_relations = Sort.sort( upper_relations, Symbols.symbol_function( $sym15$_ ), Symbols.symbol_function( $sym22$NUM_INDEX ) );
      middle_relations = Sort.sort( middle_relations, Symbols.symbol_function( $sym15$_ ), Symbols.symbol_function( $sym22$NUM_INDEX ) );
      lower_relations = Sort.sort( lower_relations, Symbols.symbol_function( $sym15$_ ), Symbols.symbol_function( $sym22$NUM_INDEX ) );
      return Values.values( ConsesLow.list( upper_relations, middle_relations, lower_relations ), ConsesLow.list( Sequences.length( upper_relations ), Sequences.length( middle_relations ), Sequences.length(
          lower_relations ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( collection_ontology_layer_sets, $list20 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ontology-layers.lisp", position = 7660L)
  public static SubLObject relation_constraining_collections(final SubLObject relation, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject arg_isa = kb_accessors.arg_isa( relation, mt );
    final SubLObject arg_genl = kb_accessors.arg_genls( relation, mt );
    SubLObject result_isa = NIL;
    SubLObject result_genl = NIL;
    if( NIL != fort_types_interface.functionP( relation ) )
    {
      result_isa = kb_accessors.result_isa( relation, mt );
      result_genl = kb_accessors.result_genl( relation, mt, UNPROVIDED );
    }
    return ConsesLow.nconc( new SubLObject[] { arg_isa, arg_genl, result_isa, result_genl
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ontology-layers.lisp", position = 8039L)
  public static SubLObject all_core_union_constants()
  {
    return isa.all_quoted_instances_in_all_mts( $const23$CoreUnionConstant );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ontology-layers.lisp", position = 8147L)
  public static SubLObject initialize_ontology_layers(SubLObject include_individualsP, SubLObject upper_threshold, SubLObject middle_threshold)
  {
    if( include_individualsP == UNPROVIDED )
    {
      include_individualsP = T;
    }
    if( upper_threshold == UNPROVIDED )
    {
      upper_threshold = $float17$0_9;
    }
    if( middle_threshold == UNPROVIDED )
    {
      middle_threshold = $float18$0_99;
    }
    final SubLObject generalization_count_pairs = compute_collection_generalization_counts( include_individualsP );
    final SubLObject collection_ontology_layers = compute_collection_ontology_layer_sets( generalization_count_pairs, upper_threshold, middle_threshold );
    final SubLObject relation_ontology_layers = compute_relation_ontology_layer_sets( collection_ontology_layers );
    final SubLObject core_terms = all_core_union_constants();
    return initialize_ontology_layers_internal( collection_ontology_layers, relation_ontology_layers, core_terms );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ontology-layers.lisp", position = 8877L)
  public static SubLObject possibly_initialize_ontology_layers()
  {
    SubLObject initializedP = NIL;
    if( NIL == ontology_layers_initializedP() )
    {
      initialize_ontology_layers( UNPROVIDED, UNPROVIDED, UNPROVIDED );
      initializedP = T;
    }
    return initializedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ontology-layers.lisp", position = 9092L)
  public static SubLObject ontology_layers_initializedP()
  {
    return makeBoolean( NIL != set.set_p( $upper_ontology_core_terms$.getGlobalValue() ) && NIL != set.set_p( $upper_ontology_collections$.getGlobalValue() ) && NIL != set.set_p( $middle_ontology_collections$
        .getGlobalValue() ) && NIL != set.set_p( $upper_ontology_relations$.getGlobalValue() ) && NIL != set.set_p( $middle_ontology_relations$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ontology-layers.lisp", position = 9444L)
  public static SubLObject save_ontology_layers(final SubLObject filename, SubLObject include_individualsP, SubLObject upper_threshold, SubLObject middle_threshold)
  {
    if( include_individualsP == UNPROVIDED )
    {
      include_individualsP = T;
    }
    if( upper_threshold == UNPROVIDED )
    {
      upper_threshold = $float17$0_9;
    }
    if( middle_threshold == UNPROVIDED )
    {
      middle_threshold = $float18$0_99;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    initialize_ontology_layers( include_individualsP, upper_threshold, middle_threshold );
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_binary( filename, $kw24$OUTPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str25$Unable_to_open__S, filename );
      }
      final SubLObject s = stream;
      cfasl.cfasl_output_externalized( ConsesLow.list( $kw26$INCLUDE_INDIVIDUALS_, include_individualsP, $kw27$UPPER_THRESHOLD, upper_threshold, $kw28$MIDDLE_THRESHOLD, middle_threshold ), s );
      cfasl.cfasl_output_externalized( ConsesLow.list( new SubLObject[] { $kw29$UPPER_CORE_TERMS, $upper_ontology_core_terms$.getGlobalValue(), $kw30$UPPER_COLS, $upper_ontology_collections$.getGlobalValue(),
        $kw31$MIDDLE_COLS, $middle_ontology_collections$.getGlobalValue(), $kw32$UPPER_RELS, $upper_ontology_relations$.getGlobalValue(), $kw33$MIDDLE_RELS, $middle_ontology_relations$.getGlobalValue()
      } ), s );
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
    return filename;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ontology-layers.lisp", position = 10285L)
  public static SubLObject load_ontology_layers(final SubLObject filename)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != Filesys.probe_file( filename ) )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_binary( filename, $kw34$INPUT );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str25$Unable_to_open__S, filename );
        }
        final SubLObject s = stream;
        cfasl.cfasl_input( s, UNPROVIDED, UNPROVIDED );
        final SubLObject sets = cfasl.cfasl_input( s, UNPROVIDED, UNPROVIDED );
        SubLObject cdolist_list_var = $list37;
        SubLObject marker = NIL;
        marker = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject v_set = conses_high.getf( sets, marker, UNPROVIDED );
          if( NIL != set.set_p( v_set ) )
          {
            final SubLObject pcase_var = marker;
            if( pcase_var.eql( $kw29$UPPER_CORE_TERMS ) )
            {
              $upper_ontology_core_terms$.setGlobalValue( v_set );
            }
            else if( pcase_var.eql( $kw30$UPPER_COLS ) )
            {
              $upper_ontology_collections$.setGlobalValue( v_set );
            }
            else if( pcase_var.eql( $kw32$UPPER_RELS ) )
            {
              $upper_ontology_relations$.setGlobalValue( v_set );
            }
            else if( pcase_var.eql( $kw31$MIDDLE_COLS ) )
            {
              $middle_ontology_collections$.setGlobalValue( v_set );
            }
            else if( pcase_var.eql( $kw33$MIDDLE_RELS ) )
            {
              $middle_ontology_relations$.setGlobalValue( v_set );
            }
            else
            {
              Errors.warn( $str35$Skipping_unrecognized_marker__A_f, marker, v_set );
            }
          }
          else
          {
            Errors.warn( $str36$Expected_set__got__A_of_type__A_i, v_set, Types.type_of( v_set ) );
          }
          cdolist_list_var = cdolist_list_var.rest();
          marker = cdolist_list_var.first();
        }
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
      return ontology_layers_initializedP();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ontology-layers.lisp", position = 11538L)
  public static SubLObject initialize_ontology_layers_internal(final SubLObject collection_ontology_layers, final SubLObject relation_ontology_layers, final SubLObject core_terms)
  {
    $upper_ontology_core_terms$.setGlobalValue( set_utilities.construct_set_from_list( core_terms, Symbols.symbol_function( EQ ), UNPROVIDED ) );
    SubLObject upper_collections = NIL;
    SubLObject middle_collections = NIL;
    SubLObject lower_collections = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( collection_ontology_layers, collection_ontology_layers, $list20 );
    upper_collections = collection_ontology_layers.first();
    SubLObject current = collection_ontology_layers.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, collection_ontology_layers, $list20 );
    middle_collections = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, collection_ontology_layers, $list20 );
    lower_collections = current.first();
    current = current.rest();
    if( NIL == current )
    {
      $upper_ontology_collections$.setGlobalValue( set_utilities.construct_set_from_list( upper_collections, Symbols.symbol_function( EQ ), UNPROVIDED ) );
      $middle_ontology_collections$.setGlobalValue( set_utilities.construct_set_from_list( middle_collections, Symbols.symbol_function( EQ ), UNPROVIDED ) );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( collection_ontology_layers, $list20 );
    }
    SubLObject upper_relations = NIL;
    SubLObject middle_relations = NIL;
    SubLObject lower_relations = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( relation_ontology_layers, relation_ontology_layers, $list38 );
    upper_relations = relation_ontology_layers.first();
    current = relation_ontology_layers.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, relation_ontology_layers, $list38 );
    middle_relations = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, relation_ontology_layers, $list38 );
    lower_relations = current.first();
    current = current.rest();
    if( NIL == current )
    {
      $upper_ontology_relations$.setGlobalValue( set_utilities.construct_set_from_list( upper_relations, Symbols.symbol_function( EQ ), UNPROVIDED ) );
      $middle_ontology_relations$.setGlobalValue( set_utilities.construct_set_from_list( middle_relations, Symbols.symbol_function( EQ ), UNPROVIDED ) );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( relation_ontology_layers, $list38 );
    }
    SubLObject core_upper_collection_count = ZERO_INTEGER;
    SubLObject core_middle_collection_count = ZERO_INTEGER;
    SubLObject core_lower_collection_count = ZERO_INTEGER;
    SubLObject core_upper_relation_count = ZERO_INTEGER;
    SubLObject core_middle_relation_count = ZERO_INTEGER;
    SubLObject core_lower_relation_count = ZERO_INTEGER;
    SubLObject core_lower_individual_count = ZERO_INTEGER;
    final SubLObject set_contents_var = set.do_set_internal( $upper_ontology_core_terms$.getGlobalValue() );
    SubLObject basis_object;
    SubLObject state;
    SubLObject v_term;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      v_term = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, v_term ) )
      {
        if( NIL != fort_types_interface.collectionP( v_term ) )
        {
          if( NIL != set.set_memberP( v_term, $upper_ontology_collections$.getGlobalValue() ) )
          {
            core_upper_collection_count = Numbers.add( core_upper_collection_count, ONE_INTEGER );
            set.set_remove( v_term, $upper_ontology_collections$.getGlobalValue() );
          }
          else if( NIL != set.set_memberP( v_term, $middle_ontology_collections$.getGlobalValue() ) )
          {
            core_middle_collection_count = Numbers.add( core_middle_collection_count, ONE_INTEGER );
            set.set_remove( v_term, $middle_ontology_collections$.getGlobalValue() );
          }
          else
          {
            core_lower_collection_count = Numbers.add( core_lower_collection_count, ONE_INTEGER );
          }
        }
        else if( NIL != kb_accessors.relationP( v_term ) )
        {
          if( NIL != set.set_memberP( v_term, $upper_ontology_relations$.getGlobalValue() ) )
          {
            core_upper_relation_count = Numbers.add( core_upper_relation_count, ONE_INTEGER );
            set.set_remove( v_term, $upper_ontology_relations$.getGlobalValue() );
          }
          else if( NIL != set.set_memberP( v_term, $middle_ontology_relations$.getGlobalValue() ) )
          {
            core_middle_relation_count = Numbers.add( core_middle_relation_count, ONE_INTEGER );
            set.set_remove( v_term, $middle_ontology_relations$.getGlobalValue() );
          }
          else
          {
            core_lower_relation_count = Numbers.add( core_lower_relation_count, ONE_INTEGER );
          }
        }
        else
        {
          core_lower_individual_count = Numbers.add( core_lower_individual_count, ONE_INTEGER );
        }
      }
    }
    final SubLObject upper_count = Numbers.add( set.set_size( $upper_ontology_core_terms$.getGlobalValue() ), set.set_size( $upper_ontology_collections$.getGlobalValue() ), set.set_size( $upper_ontology_relations$
        .getGlobalValue() ) );
    final SubLObject middle_count = Numbers.add( set.set_size( $middle_ontology_collections$.getGlobalValue() ), set.set_size( $middle_ontology_relations$.getGlobalValue() ) );
    final SubLObject lower_count = Numbers.subtract( forts.fort_count(), Numbers.add( upper_count, middle_count ) );
    return Values.values( ConsesLow.list( upper_count, middle_count, lower_count ), ConsesLow.list( ConsesLow.list( core_upper_collection_count, core_upper_relation_count ), ConsesLow.list( core_middle_collection_count,
        core_middle_relation_count ), ConsesLow.list( core_lower_collection_count, core_lower_relation_count, core_lower_individual_count ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ontology-layers.lisp", position = 14163L)
  public static SubLObject compute_assertion_ontology_layer_statistics()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject upper_count = ZERO_INTEGER;
    SubLObject middle_count = ZERO_INTEGER;
    SubLObject lower_count = ZERO_INTEGER;
    final SubLObject idx = assertion_handles.do_assertions_table();
    final SubLObject mess = $str39$Computing_assertion_ontology_laye;
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
        final SubLObject idx_$15 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$15, $kw14$SKIP ) )
        {
          final SubLObject idx_$16 = idx_$15;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$16, $kw14$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$16 );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject a_id;
            SubLObject a_handle;
            SubLObject ass;
            SubLObject pcase_var;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              a_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              a_handle = Vectors.aref( vector_var, a_id );
              if( NIL == id_index.id_index_tombstone_p( a_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw14$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( a_handle ) )
                {
                  a_handle = $kw14$SKIP;
                }
                ass = assertion_handles.resolve_assertion_id_value_pair( a_id, a_handle );
                pcase_var = assertion_ontology_layer( ass );
                if( pcase_var.eql( $kw8$UPPER ) )
                {
                  upper_count = Numbers.add( upper_count, ONE_INTEGER );
                }
                else if( pcase_var.eql( $kw9$MIDDLE ) )
                {
                  middle_count = Numbers.add( middle_count, ONE_INTEGER );
                }
                else if( pcase_var.eql( $kw10$LOWER ) )
                {
                  lower_count = Numbers.add( lower_count, ONE_INTEGER );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$17 = idx_$15;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$17 ) || NIL == id_index.id_index_skip_tombstones_p( $kw14$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$17 );
            SubLObject a_id2 = id_index.id_index_sparse_id_threshold( idx_$17 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$17 );
            final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw14$SKIP ) ) ? NIL : $kw14$SKIP;
            while ( a_id2.numL( end_id ))
            {
              final SubLObject a_handle2 = Hashtables.gethash_without_values( a_id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw14$SKIP ) || NIL == id_index.id_index_tombstone_p( a_handle2 ) )
              {
                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair( a_id2, a_handle2 );
                final SubLObject pcase_var2 = assertion_ontology_layer( ass2 );
                if( pcase_var2.eql( $kw8$UPPER ) )
                {
                  upper_count = Numbers.add( upper_count, ONE_INTEGER );
                }
                else if( pcase_var2.eql( $kw9$MIDDLE ) )
                {
                  middle_count = Numbers.add( middle_count, ONE_INTEGER );
                }
                else if( pcase_var2.eql( $kw10$LOWER ) )
                {
                  lower_count = Numbers.add( lower_count, ONE_INTEGER );
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
        final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
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
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return ConsesLow.list( upper_count, middle_count, lower_count );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ontology-layers.lisp", position = 14619L)
  public static SubLObject all_upper_ontology_layer_collections()
  {
    possibly_initialize_ontology_layers();
    final SubLObject upper_core_terms = set.set_element_list( $upper_ontology_core_terms$.getGlobalValue() );
    final SubLObject upper_core_collections = list_utilities.delete_if_not( Symbols.symbol_function( $sym41$COLLECTION_P ), upper_core_terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject upper_non_core_collections = set.set_element_list( $upper_ontology_collections$.getGlobalValue() );
    final SubLObject upper_collections = ConsesLow.nconc( upper_core_collections, upper_non_core_collections );
    return cardinality_estimates.sort_by_generality_estimate( upper_collections, $kw42$DESCENDING );
  }

  public static SubLObject declare_ontology_layers_file()
  {
    SubLFiles.declareFunction( me, "ontology_layer_p", "ONTOLOGY-LAYER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "lower_ontology_layer", "LOWER-ONTOLOGY-LAYER", 2, 0, false );
    SubLFiles.declareFunction( me, "fort_ontology_layer", "FORT-ONTOLOGY-LAYER", 1, 0, false );
    SubLFiles.declareFunction( me, "assertion_ontology_layer", "ASSERTION-ONTOLOGY-LAYER", 1, 0, false );
    SubLFiles.declareFunction( me, "assertion_ontology_layer_recursive", "ASSERTION-ONTOLOGY-LAYER-RECURSIVE", 2, 0, false );
    SubLFiles.declareFunction( me, "compute_collection_generalization_counts", "COMPUTE-COLLECTION-GENERALIZATION-COUNTS", 0, 1, false );
    SubLFiles.declareFunction( me, "compute_collection_ontology_layer_sets", "COMPUTE-COLLECTION-ONTOLOGY-LAYER-SETS", 1, 2, false );
    SubLFiles.declareFunction( me, "compute_relation_ontology_layer_sets", "COMPUTE-RELATION-ONTOLOGY-LAYER-SETS", 1, 0, false );
    SubLFiles.declareFunction( me, "relation_constraining_collections", "RELATION-CONSTRAINING-COLLECTIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "all_core_union_constants", "ALL-CORE-UNION-CONSTANTS", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_ontology_layers", "INITIALIZE-ONTOLOGY-LAYERS", 0, 3, false );
    SubLFiles.declareFunction( me, "possibly_initialize_ontology_layers", "POSSIBLY-INITIALIZE-ONTOLOGY-LAYERS", 0, 0, false );
    SubLFiles.declareFunction( me, "ontology_layers_initializedP", "ONTOLOGY-LAYERS-INITIALIZED?", 0, 0, false );
    SubLFiles.declareFunction( me, "save_ontology_layers", "SAVE-ONTOLOGY-LAYERS", 1, 3, false );
    SubLFiles.declareFunction( me, "load_ontology_layers", "LOAD-ONTOLOGY-LAYERS", 1, 0, false );
    SubLFiles.declareFunction( me, "initialize_ontology_layers_internal", "INITIALIZE-ONTOLOGY-LAYERS-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "compute_assertion_ontology_layer_statistics", "COMPUTE-ASSERTION-ONTOLOGY-LAYER-STATISTICS", 0, 0, false );
    SubLFiles.declareFunction( me, "all_upper_ontology_layer_collections", "ALL-UPPER-ONTOLOGY-LAYER-COLLECTIONS", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_ontology_layers_file()
  {
    $ontology_layers$ = SubLFiles.deflexical( "*ONTOLOGY-LAYERS*", $list0 );
    $upper_ontology_core_terms$ = SubLFiles.deflexical( "*UPPER-ONTOLOGY-CORE-TERMS*", ( maybeDefault( $sym2$_UPPER_ONTOLOGY_CORE_TERMS_, $upper_ontology_core_terms$, NIL ) ) );
    $upper_ontology_collections$ = SubLFiles.deflexical( "*UPPER-ONTOLOGY-COLLECTIONS*", ( maybeDefault( $sym3$_UPPER_ONTOLOGY_COLLECTIONS_, $upper_ontology_collections$, NIL ) ) );
    $middle_ontology_collections$ = SubLFiles.deflexical( "*MIDDLE-ONTOLOGY-COLLECTIONS*", ( maybeDefault( $sym4$_MIDDLE_ONTOLOGY_COLLECTIONS_, $middle_ontology_collections$, NIL ) ) );
    $upper_ontology_relations$ = SubLFiles.deflexical( "*UPPER-ONTOLOGY-RELATIONS*", ( maybeDefault( $sym5$_UPPER_ONTOLOGY_RELATIONS_, $upper_ontology_relations$, NIL ) ) );
    $middle_ontology_relations$ = SubLFiles.deflexical( "*MIDDLE-ONTOLOGY-RELATIONS*", ( maybeDefault( $sym6$_MIDDLE_ONTOLOGY_RELATIONS_, $middle_ontology_relations$, NIL ) ) );
    return NIL;
  }

  public static SubLObject setup_ontology_layers_file()
  {
    subl_macro_promotions.declare_defglobal( $sym2$_UPPER_ONTOLOGY_CORE_TERMS_ );
    subl_macro_promotions.declare_defglobal( $sym3$_UPPER_ONTOLOGY_COLLECTIONS_ );
    subl_macro_promotions.declare_defglobal( $sym4$_MIDDLE_ONTOLOGY_COLLECTIONS_ );
    subl_macro_promotions.declare_defglobal( $sym5$_UPPER_ONTOLOGY_RELATIONS_ );
    subl_macro_promotions.declare_defglobal( $sym6$_MIDDLE_ONTOLOGY_RELATIONS_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_ontology_layers_file();
  }

  @Override
  public void initializeVariables()
  {
    init_ontology_layers_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_ontology_layers_file();
  }
  static
  {
    me = new ontology_layers();
    $ontology_layers$ = null;
    $upper_ontology_core_terms$ = null;
    $upper_ontology_collections$ = null;
    $middle_ontology_collections$ = null;
    $upper_ontology_relations$ = null;
    $middle_ontology_relations$ = null;
    $list0 = ConsesLow.list( makeKeyword( "UPPER" ), makeKeyword( "MIDDLE" ), makeKeyword( "LOWER" ) );
    $kw1$UNKNOWN = makeKeyword( "UNKNOWN" );
    $sym2$_UPPER_ONTOLOGY_CORE_TERMS_ = makeSymbol( "*UPPER-ONTOLOGY-CORE-TERMS*" );
    $sym3$_UPPER_ONTOLOGY_COLLECTIONS_ = makeSymbol( "*UPPER-ONTOLOGY-COLLECTIONS*" );
    $sym4$_MIDDLE_ONTOLOGY_COLLECTIONS_ = makeSymbol( "*MIDDLE-ONTOLOGY-COLLECTIONS*" );
    $sym5$_UPPER_ONTOLOGY_RELATIONS_ = makeSymbol( "*UPPER-ONTOLOGY-RELATIONS*" );
    $sym6$_MIDDLE_ONTOLOGY_RELATIONS_ = makeSymbol( "*MIDDLE-ONTOLOGY-RELATIONS*" );
    $sym7$FORT_P = makeSymbol( "FORT-P" );
    $kw8$UPPER = makeKeyword( "UPPER" );
    $kw9$MIDDLE = makeKeyword( "MIDDLE" );
    $kw10$LOWER = makeKeyword( "LOWER" );
    $sym11$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const12$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $str13$Computing_collection_generalizati = makeString( "Computing collection generalization counts" );
    $kw14$SKIP = makeKeyword( "SKIP" );
    $sym15$_ = makeSymbol( ">" );
    $sym16$CDR = makeSymbol( "CDR" );
    $float17$0_9 = makeDouble( 0.9 );
    $float18$0_99 = makeDouble( 0.99 );
    $list19 = ConsesLow.cons( makeSymbol( "FORT" ), makeSymbol( "COUNT" ) );
    $list20 = ConsesLow.list( makeSymbol( "UPPER-COLLECTIONS" ), makeSymbol( "MIDDLE-COLLECTIONS" ), makeSymbol( "LOWER-COLLECTIONS" ) );
    $str21$Computing_relation_ontology_layer = makeString( "Computing relation ontology layers" );
    $sym22$NUM_INDEX = makeSymbol( "NUM-INDEX" );
    $const23$CoreUnionConstant = constant_handles.reader_make_constant_shell( makeString( "CoreUnionConstant" ) );
    $kw24$OUTPUT = makeKeyword( "OUTPUT" );
    $str25$Unable_to_open__S = makeString( "Unable to open ~S" );
    $kw26$INCLUDE_INDIVIDUALS_ = makeKeyword( "INCLUDE-INDIVIDUALS?" );
    $kw27$UPPER_THRESHOLD = makeKeyword( "UPPER-THRESHOLD" );
    $kw28$MIDDLE_THRESHOLD = makeKeyword( "MIDDLE-THRESHOLD" );
    $kw29$UPPER_CORE_TERMS = makeKeyword( "UPPER-CORE-TERMS" );
    $kw30$UPPER_COLS = makeKeyword( "UPPER-COLS" );
    $kw31$MIDDLE_COLS = makeKeyword( "MIDDLE-COLS" );
    $kw32$UPPER_RELS = makeKeyword( "UPPER-RELS" );
    $kw33$MIDDLE_RELS = makeKeyword( "MIDDLE-RELS" );
    $kw34$INPUT = makeKeyword( "INPUT" );
    $str35$Skipping_unrecognized_marker__A_f = makeString( "Skipping unrecognized marker ~A for set ~A.~%" );
    $str36$Expected_set__got__A_of_type__A_i = makeString( "Expected set, got ~A of type ~A instead ... bad file format?" );
    $list37 = ConsesLow.list( makeKeyword( "UPPER-CORE-TERMS" ), makeKeyword( "UPPER-COLS" ), makeKeyword( "UPPER-RELS" ), makeKeyword( "MIDDLE-COLS" ), makeKeyword( "MIDDLE-RELS" ) );
    $list38 = ConsesLow.list( makeSymbol( "UPPER-RELATIONS" ), makeSymbol( "MIDDLE-RELATIONS" ), makeSymbol( "LOWER-RELATIONS" ) );
    $str39$Computing_assertion_ontology_laye = makeString( "Computing assertion ontology layer" );
    $sym40$STRINGP = makeSymbol( "STRINGP" );
    $sym41$COLLECTION_P = makeSymbol( "COLLECTION-P" );
    $kw42$DESCENDING = makeKeyword( "DESCENDING" );
  }
}
/*
 * 
 * Total time: 421 ms
 * 
 */