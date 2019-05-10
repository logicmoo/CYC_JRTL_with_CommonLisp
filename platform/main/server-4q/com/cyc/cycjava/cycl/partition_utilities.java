package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class partition_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.partition_utilities";
  public static final String myFingerPrint = "5661e6ef928787d495a9aff632259403c4d53b2bcbd436e41f089e2379dae2f1";
  @SubLTranslatedFile.SubL(source = "cycl/partition-utilities.lisp", position = 5624L)
  private static SubLSymbol $assertion_partition$;
  @SubLTranslatedFile.SubL(source = "cycl/partition-utilities.lisp", position = 5888L)
  private static SubLSymbol $assertion_list_for_assertion_partition$;
  @SubLTranslatedFile.SubL(source = "cycl/partition-utilities.lisp", position = 6700L)
  private static SubLSymbol $kb_diff_partition$;
  @SubLTranslatedFile.SubL(source = "cycl/partition-utilities.lisp", position = 6994L)
  private static SubLSymbol $kb_diff_for_partition$;
  private static final SubLSymbol $sym0$LISTP;
  private static final SubLSymbol $sym1$HASH_TABLE_P;
  private static final SubLString $str2$Mismatch_between_parameterization;
  private static final SubLList $list3;
  private static final SubLSymbol $kw4$TERM;
  private static final SubLSymbol $kw5$FUNCTION;
  private static final SubLSymbol $sym6$SCOPE_PARTITION_MT_INDEX;
  private static final SubLList $list7;
  private static final SubLSymbol $sym8$NON_DOTTED_LIST_P;
  private static final SubLSymbol $sym9$ASSERTION_P;
  private static final SubLSymbol $sym10$_EXIT;
  private static final SubLSymbol $sym11$SCOPE_ASSERTION_PARTITION;
  private static final SubLList $list12;
  private static final SubLSymbol $sym13$KB_DIFFERENCE_P;
  private static final SubLSymbol $sym14$SCOPE_KB_DIFF_CONSTANTS;
  private static final SubLSymbol $sym15$SCOPE_KB_DIFF_NARTS;
  private static final SubLSymbol $sym16$SCOPE_KB_DIFF_ASSERTIONS;
  private static final SubLSymbol $sym17$SCOPE_KB_DIFF_DEDUCTIONS;
  private static final SubLSymbol $sym18$SCOPE_MICROTHEORY_CONTENTS_AND_IMPLICITLY_DEFINED_TERMS;
  private static final SubLSymbol $sym19$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const20$EverythingPSC;
  private static final SubLSymbol $sym21$SK_SOURCE_P;
  private static final SubLSymbol $kw22$GAF;
  private static final SubLSymbol $sym23$NART_P;
  private static final SubLSymbol $sym24$SCOPE_SK_SOURCE;

  @SubLTranslatedFile.SubL(source = "cycl/partition-utilities.lisp", position = 818L)
  public static SubLObject instantiate_prepared_assertion_set(final SubLObject stream, final SubLObject exemplars, final SubLObject parameterized, SubLObject reset_sbhl_linksP)
  {
    if( reset_sbhl_linksP == UNPROVIDED )
    {
      reset_sbhl_linksP = partitions.$reset_sbhl_links$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.listp( exemplars ) : exemplars;
    assert NIL != Types.hash_table_p( parameterized ) : parameterized;
    thread.resetMultipleValues();
    final SubLObject preseeding = instantiate_prepared_assertion_set_constants( exemplars, parameterized );
    final SubLObject introduced = thread.secondMultipleValue();
    thread.resetMultipleValues();
    partitions.load_partition_from_stream_with_preseeding( stream, preseeding, reset_sbhl_linksP );
    return introduced;
  }

  @SubLTranslatedFile.SubL(source = "cycl/partition-utilities.lisp", position = 1676L)
  public static SubLObject instantiate_prepared_assertion_set_constants(final SubLObject exemplars, final SubLObject parametized)
  {
    assert NIL != Types.listp( exemplars ) : exemplars;
    assert NIL != Types.hash_table_p( parametized ) : parametized;
    final SubLObject estimated_size = Numbers.add( Sequences.length( exemplars ), Hashtables.hash_table_count( parametized ) );
    final SubLObject preseeding = partitions.new_load_partition_constants_store( estimated_size );
    SubLObject introduced = NIL;
    SubLObject cdolist_list_var = exemplars;
    SubLObject exemplar = NIL;
    exemplar = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject name = constants_high.constant_name( exemplar );
      final SubLObject external_id = constants_high.constant_external_id( exemplar );
      final SubLObject internal_id = constants_high.constant_internal_id( exemplar );
      final SubLObject instance = cyc_kernel.cyc_create_new_permanent( constant_completion_high.uniquify_constant_name( name, UNPROVIDED ) );
      Hashtables.sethash( external_id, preseeding, instance );
      Hashtables.sethash( internal_id, preseeding, instance );
      introduced = ConsesLow.cons( instance, introduced );
      cdolist_list_var = cdolist_list_var.rest();
      exemplar = cdolist_list_var.first();
    }
    SubLObject param_id = NIL;
    SubLObject actual = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( parametized );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        param_id = Hashtables.getEntryKey( cdohash_entry );
        actual = Hashtables.getEntryValue( cdohash_entry );
        Hashtables.sethash( param_id, preseeding, actual );
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return Values.values( preseeding, introduced );
  }

  @SubLTranslatedFile.SubL(source = "cycl/partition-utilities.lisp", position = 2919L)
  public static SubLObject unserialize_prepared_assertion_set(final SubLObject stream, final SubLObject actuals_map, SubLObject reset_sbhl_linksP)
  {
    if( reset_sbhl_linksP == UNPROVIDED )
    {
      reset_sbhl_linksP = partitions.$reset_sbhl_links$.getDynamicValue();
    }
    assert NIL != Types.hash_table_p( actuals_map ) : actuals_map;
    final SubLObject exemplars = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var;
    final SubLObject parameterized = cdolist_list_var = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    SubLObject parameter = NIL;
    parameter = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == Hashtables.gethash_without_values( constants_high.constant_external_id( parameter ), actuals_map, UNPROVIDED ) )
      {
        Errors.error( $str2$Mismatch_between_parameterization, parameter );
      }
      cdolist_list_var = cdolist_list_var.rest();
      parameter = cdolist_list_var.first();
    }
    return instantiate_prepared_assertion_set( stream, exemplars, actuals_map, reset_sbhl_linksP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/partition-utilities.lisp", position = 3988L)
  public static SubLObject serialize_prepared_assertion_set(final SubLObject stream, final SubLObject exemplars, final SubLObject parameterized)
  {
    assert NIL != Types.listp( exemplars ) : exemplars;
    assert NIL != Types.listp( parameterized ) : parameterized;
    final SubLObject partition = determine_prepared_assertion_set_partition( exemplars );
    cfasl.cfasl_output( exemplars, stream );
    cfasl.cfasl_output( parameterized, stream );
    partitions.save_partition_to_stream( stream, partition );
    return stream;
  }

  @SubLTranslatedFile.SubL(source = "cycl/partition-utilities.lisp", position = 4524L)
  public static SubLObject generate_prepared_assertion_actuals_for_parameters_map(final SubLObject actual_parameter_tuples)
  {
    assert NIL != Types.listp( actual_parameter_tuples ) : actual_parameter_tuples;
    final SubLObject map = Hashtables.make_hash_table( Sequences.length( actual_parameter_tuples ), Symbols.symbol_function( EQL ), UNPROVIDED );
    SubLObject cdolist_list_var = actual_parameter_tuples;
    SubLObject tuple = NIL;
    tuple = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = tuple;
      SubLObject parameter = NIL;
      SubLObject actual = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
      parameter = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
      actual = current.first();
      current = current.rest();
      if( NIL == current )
      {
        Hashtables.sethash( constants_high.constant_external_id( parameter ), map, actual );
        Hashtables.sethash( constants_high.constant_internal_id( parameter ), map, actual );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list3 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      tuple = cdolist_list_var.first();
    }
    return map;
  }

  @SubLTranslatedFile.SubL(source = "cycl/partition-utilities.lisp", position = 5175L)
  public static SubLObject determine_prepared_assertion_set_partition(final SubLObject exemplars)
  {
    SubLObject partition_spec = NIL;
    SubLObject mts = NIL;
    SubLObject cdolist_list_var = exemplars;
    SubLObject constant = NIL;
    constant = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      partition_spec = ConsesLow.cons( ConsesLow.list( $kw4$TERM, constant ), partition_spec );
      if( NIL != fort_types_interface.microtheory_p( constant ) )
      {
        mts = ConsesLow.cons( constant, mts );
      }
      cdolist_list_var = cdolist_list_var.rest();
      constant = cdolist_list_var.first();
    }
    cdolist_list_var = Sequences.nreverse( mts );
    SubLObject mt = NIL;
    mt = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      partition_spec = ConsesLow.cons( ConsesLow.list( $kw5$FUNCTION, $sym6$SCOPE_PARTITION_MT_INDEX, mt ), partition_spec );
      cdolist_list_var = cdolist_list_var.rest();
      mt = cdolist_list_var.first();
    }
    return Sequences.nreverse( partition_spec );
  }

  @SubLTranslatedFile.SubL(source = "cycl/partition-utilities.lisp", position = 5957L)
  public static SubLObject save_assertion_partition(final SubLObject assertion_list, final SubLObject filename, SubLObject fort_filter_function)
  {
    if( fort_filter_function == UNPROVIDED )
    {
      fort_filter_function = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != list_utilities.non_dotted_list_p( assertion_list ) : assertion_list;
    SubLObject cdolist_list_var = assertion_list;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != assertion_handles.assertion_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    final SubLObject _prev_bind_0 = $assertion_list_for_assertion_partition$.currentBinding( thread );
    final SubLObject _prev_bind_2 = partitions.$assertion_partition_fort_filter_function$.currentBinding( thread );
    try
    {
      $assertion_list_for_assertion_partition$.bind( assertion_list, thread );
      partitions.$assertion_partition_fort_filter_function$.bind( fort_filter_function, thread );
      return partitions.save_partition( filename, $assertion_partition$.getDynamicValue( thread ) );
    }
    finally
    {
      partitions.$assertion_partition_fort_filter_function$.rebind( _prev_bind_2, thread );
      $assertion_list_for_assertion_partition$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/partition-utilities.lisp", position = 6523L)
  public static SubLObject scope_assertion_partition()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cdolist_list_var = $assertion_list_for_assertion_partition$.getDynamicValue( thread );
    SubLObject as = NIL;
    as = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      partitions.scope_partition_assertion_and_constituents( as );
      cdolist_list_var = cdolist_list_var.rest();
      as = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/partition-utilities.lisp", position = 7079L)
  public static SubLObject save_kb_diff_partition(final SubLObject kb_diff, final SubLObject filename)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != kb_compare.kb_difference_p( kb_diff ) : kb_diff;
    final SubLObject _prev_bind_0 = $kb_diff_for_partition$.currentBinding( thread );
    try
    {
      $kb_diff_for_partition$.bind( kb_diff, thread );
      return partitions.save_partition( filename, $kb_diff_partition$.getDynamicValue( thread ) );
    }
    finally
    {
      $kb_diff_for_partition$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/partition-utilities.lisp", position = 7281L)
  public static SubLObject scope_kb_diff_constants()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    final SubLObject set_var = kb_compare.kb_difference_constants( $kb_diff_partition$.getDynamicValue( thread ) );
    final SubLObject set_contents_var = set.do_set_internal( set_var );
    SubLObject basis_object;
    SubLObject state;
    SubLObject v_const;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      v_const = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, v_const ) )
      {
        partitions.scope_partition_object_only( v_const );
        count = Numbers.add( count, ONE_INTEGER );
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/partition-utilities.lisp", position = 7493L)
  public static SubLObject scope_kb_diff_narts()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    final SubLObject set_var = kb_compare.kb_difference_narts( $kb_diff_partition$.getDynamicValue( thread ) );
    final SubLObject set_contents_var = set.do_set_internal( set_var );
    SubLObject basis_object;
    SubLObject state;
    SubLObject nart;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      nart = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, nart ) )
      {
        partitions.scope_partition_object_only( nart );
        count = Numbers.add( count, ONE_INTEGER );
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/partition-utilities.lisp", position = 7695L)
  public static SubLObject scope_kb_diff_assertions()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    final SubLObject set_var = kb_compare.kb_difference_assertions( $kb_diff_partition$.getDynamicValue( thread ) );
    final SubLObject set_contents_var = set.do_set_internal( set_var );
    SubLObject basis_object;
    SubLObject state;
    SubLObject ass;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      ass = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, ass ) )
      {
        partitions.scope_partition_object_only( ass );
        count = Numbers.add( count, ONE_INTEGER );
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/partition-utilities.lisp", position = 7905L)
  public static SubLObject scope_kb_diff_deductions()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    final SubLObject set_var = kb_compare.kb_difference_deductions( $kb_diff_partition$.getDynamicValue( thread ) );
    final SubLObject set_contents_var = set.do_set_internal( set_var );
    SubLObject basis_object;
    SubLObject state;
    SubLObject ded;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      ded = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, ded ) )
      {
        partitions.scope_partition_object_only( ded );
        count = Numbers.add( count, ONE_INTEGER );
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/partition-utilities.lisp", position = 8115L)
  public static SubLObject scope_microtheory_contents_and_implicitly_defined_terms(final SubLObject mt)
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
            partitions.scope_partition_object_only( ass );
            SubLObject cdolist_list_var = cycl_utilities.subrfs( ass, T );
            SubLObject rf = NIL;
            rf = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              if( NIL != rf_defined_in_mtP( rf, mt ) )
              {
                partitions.scope_partition_rf_and_super_rfs( rf );
              }
              cdolist_list_var = cdolist_list_var.rest();
              rf = cdolist_list_var.first();
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
        try
        {
          Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
          final SubLObject _values = Values.getValuesAsVector();
          if( NIL != final_index_iterator )
          {
            kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/partition-utilities.lisp", position = 8689L)
  public static SubLObject rf_defined_in_mtP(final SubLObject rf, final SubLObject mt)
  {
    if( NIL != assertion_handles.assertion_p( rf ) )
    {
      return hlmt.hlmt_equalP( mt, assertions_high.assertion_mt( rf ) );
    }
    SubLObject cdolist_list_var = narts_high.nart_independent_assertions( rf );
    SubLObject independent_assertion = NIL;
    independent_assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == hlmt.hlmt_equalP( mt, assertions_high.assertion_mt( independent_assertion ) ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      independent_assertion = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/partition-utilities.lisp", position = 9069L)
  public static SubLObject scope_sk_source(final SubLObject sk_source)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    partitions.scope_partition_term_and_narts( sk_source );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym19$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const20$EverythingPSC, thread );
      assert NIL != sksi_kb_accessors.sk_source_p( sk_source ) : sk_source;
      final SubLObject defining_mt = kb_accessors.defining_mt( sk_source );
      final SubLObject content_mt = sksi_kb_accessors.sk_source_content_mt( sk_source );
      if( NIL != fort_types_interface.microtheory_p( defining_mt ) )
      {
        scope_microtheory_contents_and_implicitly_defined_terms( defining_mt );
      }
      if( NIL != fort_types_interface.microtheory_p( content_mt ) )
      {
        scope_microtheory_contents_and_implicitly_defined_terms( content_mt );
      }
      if( NIL != kb_mapping_macros.do_nart_arg_index_key_validator( sk_source, NIL, NIL ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator( sk_source, NIL, NIL );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw22$GAF, NIL, NIL );
              SubLObject done_var_$1 = NIL;
              final SubLObject token_var_$2 = NIL;
              while ( NIL == done_var_$1)
              {
                final SubLObject tou_gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$2 );
                final SubLObject valid_$3 = makeBoolean( !token_var_$2.eql( tou_gaf ) );
                if( NIL != valid_$3 )
                {
                  final SubLObject nart = assertions_high.gaf_arg1( tou_gaf );
                  assert NIL != nart_handles.nart_p( nart ) : nart;
                  if( NIL != fort_types_interface.microtheory_p( nart ) )
                  {
                    scope_microtheory_contents_and_implicitly_defined_terms( nart );
                  }
                }
                done_var_$1 = makeBoolean( NIL == valid_$3 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$4, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  public static SubLObject declare_partition_utilities_file()
  {
    SubLFiles.declareFunction( me, "instantiate_prepared_assertion_set", "INSTANTIATE-PREPARED-ASSERTION-SET", 3, 1, false );
    SubLFiles.declareFunction( me, "instantiate_prepared_assertion_set_constants", "INSTANTIATE-PREPARED-ASSERTION-SET-CONSTANTS", 2, 0, false );
    SubLFiles.declareFunction( me, "unserialize_prepared_assertion_set", "UNSERIALIZE-PREPARED-ASSERTION-SET", 2, 1, false );
    SubLFiles.declareFunction( me, "serialize_prepared_assertion_set", "SERIALIZE-PREPARED-ASSERTION-SET", 3, 0, false );
    SubLFiles.declareFunction( me, "generate_prepared_assertion_actuals_for_parameters_map", "GENERATE-PREPARED-ASSERTION-ACTUALS-FOR-PARAMETERS-MAP", 1, 0, false );
    SubLFiles.declareFunction( me, "determine_prepared_assertion_set_partition", "DETERMINE-PREPARED-ASSERTION-SET-PARTITION", 1, 0, false );
    SubLFiles.declareFunction( me, "save_assertion_partition", "SAVE-ASSERTION-PARTITION", 2, 1, false );
    SubLFiles.declareFunction( me, "scope_assertion_partition", "SCOPE-ASSERTION-PARTITION", 0, 0, false );
    SubLFiles.declareFunction( me, "save_kb_diff_partition", "SAVE-KB-DIFF-PARTITION", 2, 0, false );
    SubLFiles.declareFunction( me, "scope_kb_diff_constants", "SCOPE-KB-DIFF-CONSTANTS", 0, 0, false );
    SubLFiles.declareFunction( me, "scope_kb_diff_narts", "SCOPE-KB-DIFF-NARTS", 0, 0, false );
    SubLFiles.declareFunction( me, "scope_kb_diff_assertions", "SCOPE-KB-DIFF-ASSERTIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "scope_kb_diff_deductions", "SCOPE-KB-DIFF-DEDUCTIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "scope_microtheory_contents_and_implicitly_defined_terms", "SCOPE-MICROTHEORY-CONTENTS-AND-IMPLICITLY-DEFINED-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "rf_defined_in_mtP", "RF-DEFINED-IN-MT?", 2, 0, false );
    SubLFiles.declareFunction( me, "scope_sk_source", "SCOPE-SK-SOURCE", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_partition_utilities_file()
  {
    $assertion_partition$ = SubLFiles.defparameter( "*ASSERTION-PARTITION*", $list7 );
    $assertion_list_for_assertion_partition$ = SubLFiles.defparameter( "*ASSERTION-LIST-FOR-ASSERTION-PARTITION*", NIL );
    $kb_diff_partition$ = SubLFiles.defparameter( "*KB-DIFF-PARTITION*", $list12 );
    $kb_diff_for_partition$ = SubLFiles.defparameter( "*KB-DIFF-FOR-PARTITION*", NIL );
    return NIL;
  }

  public static SubLObject setup_partition_utilities_file()
  {
    utilities_macros.note_funcall_helper_function( $sym11$SCOPE_ASSERTION_PARTITION );
    utilities_macros.note_funcall_helper_function( $sym14$SCOPE_KB_DIFF_CONSTANTS );
    utilities_macros.note_funcall_helper_function( $sym15$SCOPE_KB_DIFF_NARTS );
    utilities_macros.note_funcall_helper_function( $sym16$SCOPE_KB_DIFF_ASSERTIONS );
    utilities_macros.note_funcall_helper_function( $sym17$SCOPE_KB_DIFF_DEDUCTIONS );
    utilities_macros.note_funcall_helper_function( $sym18$SCOPE_MICROTHEORY_CONTENTS_AND_IMPLICITLY_DEFINED_TERMS );
    utilities_macros.note_funcall_helper_function( $sym24$SCOPE_SK_SOURCE );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_partition_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_partition_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_partition_utilities_file();
  }
  static
  {
    me = new partition_utilities();
    $assertion_partition$ = null;
    $assertion_list_for_assertion_partition$ = null;
    $kb_diff_partition$ = null;
    $kb_diff_for_partition$ = null;
    $sym0$LISTP = makeSymbol( "LISTP" );
    $sym1$HASH_TABLE_P = makeSymbol( "HASH-TABLE-P" );
    $str2$Mismatch_between_parameterization = makeString( "Mismatch between parameterization and actualization list: no actual for ~S~%" );
    $list3 = ConsesLow.list( makeSymbol( "PARAMETER" ), makeSymbol( "ACTUAL" ) );
    $kw4$TERM = makeKeyword( "TERM" );
    $kw5$FUNCTION = makeKeyword( "FUNCTION" );
    $sym6$SCOPE_PARTITION_MT_INDEX = makeSymbol( "SCOPE-PARTITION-MT-INDEX" );
    $list7 = ConsesLow.list( ConsesLow.list( makeKeyword( "FUNCTION" ), makeSymbol( "SCOPE-ASSERTION-PARTITION" ) ) );
    $sym8$NON_DOTTED_LIST_P = makeSymbol( "NON-DOTTED-LIST-P" );
    $sym9$ASSERTION_P = makeSymbol( "ASSERTION-P" );
    $sym10$_EXIT = makeSymbol( "%EXIT" );
    $sym11$SCOPE_ASSERTION_PARTITION = makeSymbol( "SCOPE-ASSERTION-PARTITION" );
    $list12 = ConsesLow.list( ConsesLow.list( makeKeyword( "FUNCTION" ), makeSymbol( "SCOPE-KB-DIFF-CONSTANTS" ) ), ConsesLow.list( makeKeyword( "FUNCTION" ), makeSymbol( "SCOPE-KB-DIFF-NARTS" ) ), ConsesLow.list(
        makeKeyword( "FUNCTION" ), makeSymbol( "SCOPE-KB-DIFF-ASSERTIONS" ) ), ConsesLow.list( makeKeyword( "FUNCTION" ), makeSymbol( "SCOPE-KB-DIFF-DEDUCTIONS" ) ) );
    $sym13$KB_DIFFERENCE_P = makeSymbol( "KB-DIFFERENCE-P" );
    $sym14$SCOPE_KB_DIFF_CONSTANTS = makeSymbol( "SCOPE-KB-DIFF-CONSTANTS" );
    $sym15$SCOPE_KB_DIFF_NARTS = makeSymbol( "SCOPE-KB-DIFF-NARTS" );
    $sym16$SCOPE_KB_DIFF_ASSERTIONS = makeSymbol( "SCOPE-KB-DIFF-ASSERTIONS" );
    $sym17$SCOPE_KB_DIFF_DEDUCTIONS = makeSymbol( "SCOPE-KB-DIFF-DEDUCTIONS" );
    $sym18$SCOPE_MICROTHEORY_CONTENTS_AND_IMPLICITLY_DEFINED_TERMS = makeSymbol( "SCOPE-MICROTHEORY-CONTENTS-AND-IMPLICITLY-DEFINED-TERMS" );
    $sym19$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const20$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $sym21$SK_SOURCE_P = makeSymbol( "SK-SOURCE-P" );
    $kw22$GAF = makeKeyword( "GAF" );
    $sym23$NART_P = makeSymbol( "NART-P" );
    $sym24$SCOPE_SK_SOURCE = makeSymbol( "SCOPE-SK-SOURCE" );
  }
}
/*
 * 
 * Total time: 214 ms
 * 
 */