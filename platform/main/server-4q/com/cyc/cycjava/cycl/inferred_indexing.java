package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inferred_indexing
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inferred_indexing";
  public static final String myFingerPrint = "a12ea05530dd493ba376d0dffb065f2fcb2072f156a659c4d09db070aaadeb65";
  @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 10078L)
  private static SubLSymbol $cached_middle_upper_ontology_boundary_generality_estimate_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 10227L)
  private static SubLSymbol $cached_lower_middle_ontology_boundary_generality_estimate_caching_state$;
  private static final SubLObject $const0$Thing;
  private static final SubLObject $const1$EverythingPSC;
  private static final SubLSymbol $kw2$SELF;
  private static final SubLSymbol $kw3$MIDDLE;
  private static final SubLSymbol $kw4$LOWER;
  private static final SubLSymbol $kw5$ASCENDING;
  private static final SubLSymbol $kw6$PREDICATE;
  private static final SubLSymbol $kw7$ONTOLOGY_HORIZON;
  private static final SubLSymbol $kw8$MICROTHEORY;
  private static final SubLObject $const9$genls;
  private static final SubLObject $const10$isa;
  private static final SubLObject $const11$equals;
  private static final SubLSymbol $sym12$FIRST;
  private static final SubLSymbol $sym13$FOURTH;
  private static final SubLSymbol $kw14$ONTOLOGY;
  private static final SubLSymbol $sym15$SECOND;
  private static final SubLString $str16$Unexpected_inheritance_pred__S;
  private static final SubLObject $const17$quotedIsa;
  private static final SubLObject $const18$relationAllInstance;
  private static final SubLSymbol $kw19$QUERY_ISA;
  private static final SubLSymbol $kw20$TRUE;
  private static final SubLObject $const21$relationInstanceAll;
  private static final SubLObject $const22$relationAllExists;
  private static final SubLObject $const23$relationExistsAll;
  private static final SubLObject $const24$transitiveViaArgInverse;
  private static final SubLSymbol $sym25$CACHED_TRANSITIVE_VIA_ARG_INVERSE_GENLS_IN_ANY_MT_;
  private static final SubLSymbol $sym26$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLSymbol $sym27$CACHED_MIDDLE_UPPER_ONTOLOGY_BOUNDARY_GENERALITY_ESTIMATE;
  private static final SubLSymbol $sym28$_CACHED_MIDDLE_UPPER_ONTOLOGY_BOUNDARY_GENERALITY_ESTIMATE_CACHIN;
  private static final SubLSymbol $sym29$CACHED_LOWER_MIDDLE_ONTOLOGY_BOUNDARY_GENERALITY_ESTIMATE;
  private static final SubLSymbol $sym30$_CACHED_LOWER_MIDDLE_ONTOLOGY_BOUNDARY_GENERALITY_ESTIMATE_CACHIN;
  private static final SubLList $list31;
  private static final SubLSymbol $sym32$NUM_INFERRED_GAF_ARG_INDEX_TUPLE;
  private static final SubLSymbol $sym33$NUM_INFERRED_GAF_ARG_INDEX_TUPLES;
  private static final SubLSymbol $kw34$ALLOW_PREDICATES;
  private static final SubLSymbol $kw35$ALLOW_PREDICATE_TYPES;
  private static final SubLSymbol $kw36$FORBID_PREDICATES;
  private static final SubLSymbol $kw37$FORBID_PREDICATE_TYPES;
  private static final SubLSymbol $sym38$GENERALITY_ESTIMATE_;
  private static final SubLList $list39;
  private static final SubLSymbol $sym40$_;
  private static final SubLSymbol $sym41$THIRD;
  private static final SubLString $str42$Unexpected_order_by____S;
  private static final SubLSymbol $kw43$UNINITIALIZED;

  @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 840L)
  public static SubLObject term_inheritance_collections(final SubLObject v_term, SubLObject ontology_horizon, SubLObject mt)
  {
    if( ontology_horizon == UNPROVIDED )
    {
      ontology_horizon = $const0$Thing;
    }
    if( mt == UNPROVIDED )
    {
      mt = $const1$EverythingPSC;
    }
    if( NIL == ontology_horizon )
    {
      ontology_horizon = $const0$Thing;
    }
    final SubLObject pcase_var = ontology_horizon;
    if( pcase_var.eql( $kw2$SELF ) )
    {
      return ConsesLow.list( v_term );
    }
    if( pcase_var.eql( $kw3$MIDDLE ) )
    {
      ontology_horizon = middle_upper_ontology_boundary_generality_estimate();
    }
    else if( pcase_var.eql( $kw4$LOWER ) )
    {
      ontology_horizon = lower_middle_ontology_boundary_generality_estimate();
    }
    SubLObject candidates = ( NIL != fort_types_interface.isa_collection_in_any_mtP( v_term ) ) ? genls.all_genls( v_term, mt, UNPROVIDED ) : isa.all_isa( v_term, mt, UNPROVIDED );
    if( !ontology_horizon.eql( $const0$Thing ) )
    {
      if( !ontology_horizon.isNumber() )
      {
        ontology_horizon = cardinality_estimates.generality_estimate( ontology_horizon );
      }
      SubLObject filtered_candidates = NIL;
      SubLObject cdolist_list_var = candidates;
      SubLObject candidate = NIL;
      candidate = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject generality = cardinality_estimates.generality_estimate( candidate );
        if( !generality.numG( ontology_horizon ) )
        {
          filtered_candidates = ConsesLow.cons( candidate, filtered_candidates );
        }
        cdolist_list_var = cdolist_list_var.rest();
        candidate = cdolist_list_var.first();
      }
      candidates = filtered_candidates;
    }
    candidates = cardinality_estimates.sort_by_generality_estimate( candidates, $kw5$ASCENDING );
    return candidates;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 2019L)
  public static SubLObject new_term_inheritance_iterator(final SubLObject v_term, SubLObject ontology_horizon, SubLObject mt)
  {
    if( ontology_horizon == UNPROVIDED )
    {
      ontology_horizon = $const0$Thing;
    }
    if( mt == UNPROVIDED )
    {
      mt = $const1$EverythingPSC;
    }
    final SubLObject candidates = term_inheritance_collections( v_term, ontology_horizon, mt );
    return iteration.new_list_iterator( conses_high.adjoin( v_term, candidates, Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 2390L)
  public static SubLObject all_inferred_gaf_arg_index_tuples(final SubLObject v_term, SubLObject filters, SubLObject order_by)
  {
    if( filters == UNPROVIDED )
    {
      filters = NIL;
    }
    if( order_by == UNPROVIDED )
    {
      order_by = $kw6$PREDICATE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject all_tuples = NIL;
    final SubLObject local_state;
    final SubLObject state = local_state = memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        SubLObject sbhl_ms_resource = sbhl_marking_vars.new_sbhl_marking_space_resource( TWO_INTEGER );
        final SubLObject _prev_bind_0_$1 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_ms_resource, thread );
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_marking_space_limit( sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue( thread ) ), thread );
          try
          {
            final SubLObject current;
            final SubLObject datum = current = filters;
            final SubLObject ontology_horizon_tail = cdestructuring_bind.property_list_member( $kw7$ONTOLOGY_HORIZON, current );
            final SubLObject ontology_horizon = ( NIL != ontology_horizon_tail ) ? conses_high.cadr( ontology_horizon_tail ) : NIL;
            final SubLObject microtheory_tail = cdestructuring_bind.property_list_member( $kw8$MICROTHEORY, current );
            final SubLObject microtheory = ( NIL != microtheory_tail ) ? conses_high.cadr( microtheory_tail ) : $const1$EverythingPSC;
            final SubLObject default_infer_pred = ( NIL != fort_types_interface.isa_collection_in_any_mtP( v_term ) ) ? $const9$genls : $const10$isa;
            final SubLObject iterator_var = new_term_inheritance_iterator( v_term, ontology_horizon, microtheory );
            SubLObject valid;
            for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
            {
              thread.resetMultipleValues();
              final SubLObject item = iteration.iteration_next( iterator_var );
              valid = thread.secondMultipleValue();
              thread.resetMultipleValues();
              if( NIL != valid )
              {
                final SubLObject infer_pred = item.equal( v_term ) ? $const11$equals : default_infer_pred;
                SubLObject cdolist_list_var;
                final SubLObject tuples = cdolist_list_var = inferred_gaf_arg_index_tuples( v_term, infer_pred, item, filters );
                SubLObject tuple = NIL;
                tuple = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  all_tuples = ConsesLow.cons( tuple, all_tuples );
                  cdolist_list_var = cdolist_list_var.rest();
                  tuple = cdolist_list_var.first();
                }
              }
            }
            all_tuples = sort_inferred_gaf_arg_index_tuples( v_term, all_tuples, order_by );
          }
          finally
          {
            final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              sbhl_ms_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue( thread );
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
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_3, thread );
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_2, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_0_$1, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$3, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return all_tuples;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 3312L)
  public static SubLObject all_inferred_gaf_arg_index_predicates(final SubLObject v_term)
  {
    final SubLObject all_tuples = all_inferred_gaf_arg_index_tuples( v_term, NIL, $kw6$PREDICATE );
    final SubLObject tuple_groups = categorize_inferred_gaf_arg_index_tuples( v_term, all_tuples, $kw6$PREDICATE );
    final SubLObject first_tuples = list_utilities.nmapcar( Symbols.symbol_function( $sym12$FIRST ), tuple_groups );
    SubLObject predicates = list_utilities.nmapcar( Symbols.symbol_function( $sym13$FOURTH ), first_tuples );
    predicates = list_utilities.delete_duplicates_sorted( predicates, UNPROVIDED );
    return predicates;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 3723L)
  public static SubLObject all_inferred_gaf_arg_index_ontology_terms(final SubLObject v_term)
  {
    final SubLObject all_tuples = all_inferred_gaf_arg_index_tuples( v_term, NIL, $kw14$ONTOLOGY );
    final SubLObject tuple_groups = categorize_inferred_gaf_arg_index_tuples( v_term, all_tuples, $kw14$ONTOLOGY );
    final SubLObject first_tuples = list_utilities.nmapcar( Symbols.symbol_function( $sym12$FIRST ), tuple_groups );
    SubLObject qua_terms = list_utilities.nmapcar( Symbols.symbol_function( $sym15$SECOND ), first_tuples );
    qua_terms = list_utilities.delete_duplicates_sorted( qua_terms, UNPROVIDED );
    return qua_terms;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 4134L)
  public static SubLObject inferred_index_filters_extract_microtheory(final SubLObject filters)
  {
    return conses_high.getf( filters, $kw8$MICROTHEORY, $const1$EverythingPSC );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 4370L)
  public static SubLObject inferred_gaf_arg_index_tuples(final SubLObject v_term, final SubLObject infer_pred, final SubLObject qua, final SubLObject filters)
  {
    if( infer_pred.eql( $const11$equals ) )
    {
      return direct_gaf_arg_index_tuples( v_term, filters );
    }
    if( infer_pred.eql( $const10$isa ) )
    {
      return inferred_gaf_arg_index_tuples_via_isa( v_term, qua, filters );
    }
    if( infer_pred.eql( $const9$genls ) )
    {
      return inferred_gaf_arg_index_tuples_via_genls( v_term, qua, filters );
    }
    return Errors.error( $str16$Unexpected_inheritance_pred__S, infer_pred );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 5329L)
  public static SubLObject direct_gaf_arg_index_tuples(final SubLObject v_term, final SubLObject filters)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject tuples = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( inferred_index_filters_extract_microtheory( filters ) );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject argnums = kb_indexing.relevant_key_gaf_arg_index( v_term, UNPROVIDED, UNPROVIDED );
      if( NIL != forts.fort_p( v_term ) && NIL != fort_types_interface.collectionP( v_term ) )
      {
        final SubLObject item_var = TWO_INTEGER;
        if( NIL == conses_high.member( item_var, argnums, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          argnums = ConsesLow.cons( item_var, argnums );
        }
      }
      SubLObject cdolist_list_var = argnums;
      SubLObject argnum = NIL;
      argnum = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject preds = kb_indexing.relevant_key_gaf_arg_index( v_term, argnum, UNPROVIDED );
        if( NIL != forts.fort_p( v_term ) && NIL != fort_types_interface.collectionP( v_term ) && argnum.numE( TWO_INTEGER ) )
        {
          if( cardinality_estimates.instance_cardinality( v_term ).isPositive() )
          {
            final SubLObject item_var2 = $const10$isa;
            if( NIL == conses_high.member( item_var2, preds, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              preds = ConsesLow.cons( item_var2, preds );
            }
          }
          if( cardinality_estimates.quoted_instance_cardinality( v_term ).isPositive() )
          {
            final SubLObject item_var2 = $const17$quotedIsa;
            if( NIL == conses_high.member( item_var2, preds, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              preds = ConsesLow.cons( item_var2, preds );
            }
          }
        }
        SubLObject cdolist_list_var_$4 = preds;
        SubLObject pred = NIL;
        pred = cdolist_list_var_$4.first();
        while ( NIL != cdolist_list_var_$4)
        {
          if( NIL != pred_filters_allowP( filters, pred ) )
          {
            tuples = ConsesLow.cons( ConsesLow.list( $const11$equals, v_term, argnum, pred ), tuples );
          }
          cdolist_list_var_$4 = cdolist_list_var_$4.rest();
          pred = cdolist_list_var_$4.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        argnum = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return sort_inferred_gaf_arg_index_tuples( v_term, tuples, $kw6$PREDICATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 6213L)
  public static SubLObject inferred_gaf_arg_index_tuples_via_isa(final SubLObject v_term, final SubLObject qua, final SubLObject filters)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject tuples = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( inferred_index_filters_extract_microtheory( filters ) );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      if( kb_indexing.relevant_num_gaf_arg_index( qua, TWO_INTEGER, $const18$relationAllInstance ).isPositive() )
      {
        if( NIL != pred_filters_allowP( filters, $const18$relationAllInstance ) )
        {
          tuples = ConsesLow.cons( ConsesLow.list( $const10$isa, qua, TWO_INTEGER, $const18$relationAllInstance ), tuples );
        }
        SubLObject cdolist_list_var = kb_mapping.gather_gaf_arg_index( qua, TWO_INTEGER, $const18$relationAllInstance, NIL, $kw20$TRUE );
        SubLObject gaf = NIL;
        gaf = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject pred = assertions_high.gaf_arg1( gaf );
          if( NIL != pred_filters_allowP( filters, pred ) )
          {
            tuples = ConsesLow.cons( ConsesLow.list( $kw19$QUERY_ISA, qua, ONE_INTEGER, pred ), tuples );
          }
          cdolist_list_var = cdolist_list_var.rest();
          gaf = cdolist_list_var.first();
        }
      }
      if( kb_indexing.relevant_num_gaf_arg_index( qua, THREE_INTEGER, $const21$relationInstanceAll ).isPositive() )
      {
        if( NIL != pred_filters_allowP( filters, $const21$relationInstanceAll ) )
        {
          tuples = ConsesLow.cons( ConsesLow.list( $const10$isa, qua, THREE_INTEGER, $const21$relationInstanceAll ), tuples );
        }
        SubLObject cdolist_list_var = kb_mapping.gather_gaf_arg_index( qua, THREE_INTEGER, $const21$relationInstanceAll, NIL, $kw20$TRUE );
        SubLObject gaf = NIL;
        gaf = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject pred = assertions_high.gaf_arg1( gaf );
          if( NIL != pred_filters_allowP( filters, pred ) )
          {
            tuples = ConsesLow.cons( ConsesLow.list( $kw19$QUERY_ISA, qua, TWO_INTEGER, pred ), tuples );
          }
          cdolist_list_var = cdolist_list_var.rest();
          gaf = cdolist_list_var.first();
        }
      }
      if( kb_indexing.relevant_num_gaf_arg_index( qua, TWO_INTEGER, $const22$relationAllExists ).isPositive() && NIL != pred_filters_allowP( filters, $const22$relationAllExists ) )
      {
        tuples = ConsesLow.cons( ConsesLow.list( $const10$isa, qua, TWO_INTEGER, $const22$relationAllExists ), tuples );
      }
      if( kb_indexing.relevant_num_gaf_arg_index( qua, THREE_INTEGER, $const23$relationExistsAll ).isPositive() && NIL != pred_filters_allowP( filters, $const23$relationExistsAll ) )
      {
        tuples = ConsesLow.cons( ConsesLow.list( $const10$isa, qua, THREE_INTEGER, $const23$relationExistsAll ), tuples );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return sort_inferred_gaf_arg_index_tuples( v_term, tuples, $kw6$PREDICATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 8187L)
  public static SubLObject inferred_gaf_arg_index_tuples_via_genls(final SubLObject v_term, final SubLObject qua, final SubLObject filters)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject tuples = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( inferred_index_filters_extract_microtheory( filters ) );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject cdolist_list_var = kb_indexing.relevant_key_gaf_arg_index( qua, UNPROVIDED, UNPROVIDED );
      SubLObject argnum = NIL;
      argnum = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cdolist_list_var_$5;
        final SubLObject preds = cdolist_list_var_$5 = kb_indexing.relevant_key_gaf_arg_index( qua, argnum, UNPROVIDED );
        SubLObject pred = NIL;
        pred = cdolist_list_var_$5.first();
        while ( NIL != cdolist_list_var_$5)
        {
          if( !pred.eql( $const9$genls ) && NIL != somewhere_cache.some_pred_assertion_somewhereP( $const24$transitiveViaArgInverse, pred, ONE_INTEGER, UNPROVIDED ) && NIL != pred_filters_allowP( filters, pred )
              && NIL != cached_transitive_via_arg_inverse_genls_in_any_mtP( pred, argnum ) )
          {
            tuples = ConsesLow.cons( ConsesLow.list( $const9$genls, qua, argnum, pred ), tuples );
          }
          cdolist_list_var_$5 = cdolist_list_var_$5.rest();
          pred = cdolist_list_var_$5.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        argnum = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return sort_inferred_gaf_arg_index_tuples( v_term, tuples, $kw6$PREDICATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 8983L)
  public static SubLObject transitive_via_arg_inverse_genlsP(final SubLObject pred, final SubLObject argnum, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return makeBoolean( NIL != somewhere_cache.some_pred_assertion_somewhereP( $const24$transitiveViaArgInverse, pred, ONE_INTEGER, UNPROVIDED ) && NIL != kb_mapping_utilities.tuple_holds_in_relevant_mts( ConsesLow.list(
        $const24$transitiveViaArgInverse, pred, $const9$genls, argnum ), mt, ONE_INTEGER, $kw20$TRUE ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 9278L)
  public static SubLObject cached_transitive_via_arg_inverse_genls_in_any_mtP_internal(final SubLObject pred, final SubLObject argnum)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym26$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const1$EverythingPSC, thread );
      result = transitive_via_arg_inverse_genlsP( pred, argnum, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 9278L)
  public static SubLObject cached_transitive_via_arg_inverse_genls_in_any_mtP(final SubLObject pred, final SubLObject argnum)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return cached_transitive_via_arg_inverse_genls_in_any_mtP_internal( pred, argnum );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym25$CACHED_TRANSITIVE_VIA_ARG_INVERSE_GENLS_IN_ANY_MT_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym25$CACHED_TRANSITIVE_VIA_ARG_INVERSE_GENLS_IN_ANY_MT_, TWO_INTEGER, NIL, EQL,
          UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym25$CACHED_TRANSITIVE_VIA_ARG_INVERSE_GENLS_IN_ANY_MT_, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( pred, argnum );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( pred.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && argnum.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( cached_transitive_via_arg_inverse_genls_in_any_mtP_internal( pred, argnum ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( pred, argnum ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 9518L)
  public static SubLObject middle_upper_ontology_boundary_generality_estimate()
  {
    return Numbers.truncate( Numbers.expt( number_utilities.$e$.getGlobalValue(), Numbers.multiply( Numbers.divide( TWO_INTEGER, THREE_INTEGER ), Numbers.log( cardinality_estimates.generality_estimate( $const0$Thing ),
        UNPROVIDED ) ) ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 9827L)
  public static SubLObject lower_middle_ontology_boundary_generality_estimate()
  {
    return Numbers.truncate( Numbers.expt( number_utilities.$e$.getGlobalValue(), Numbers.multiply( Numbers.divide( ONE_INTEGER, THREE_INTEGER ), Numbers.log( cardinality_estimates.generality_estimate( $const0$Thing ),
        UNPROVIDED ) ) ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 10078L)
  public static SubLObject clear_cached_middle_upper_ontology_boundary_generality_estimate()
  {
    final SubLObject cs = $cached_middle_upper_ontology_boundary_generality_estimate_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 10078L)
  public static SubLObject remove_cached_middle_upper_ontology_boundary_generality_estimate()
  {
    return memoization_state.caching_state_remove_function_results_with_args( $cached_middle_upper_ontology_boundary_generality_estimate_caching_state$.getGlobalValue(), ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY ),
        UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 10078L)
  public static SubLObject cached_middle_upper_ontology_boundary_generality_estimate_internal()
  {
    return middle_upper_ontology_boundary_generality_estimate();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 10078L)
  public static SubLObject cached_middle_upper_ontology_boundary_generality_estimate()
  {
    SubLObject caching_state = $cached_middle_upper_ontology_boundary_generality_estimate_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym27$CACHED_MIDDLE_UPPER_ONTOLOGY_BOUNDARY_GENERALITY_ESTIMATE, $sym28$_CACHED_MIDDLE_UPPER_ONTOLOGY_BOUNDARY_GENERALITY_ESTIMATE_CACHIN,
          NIL, EQL, ZERO_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_get_zero_arg_results( caching_state, UNPROVIDED );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( cached_middle_upper_ontology_boundary_generality_estimate_internal() ) );
      memoization_state.caching_state_set_zero_arg_results( caching_state, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 10227L)
  public static SubLObject clear_cached_lower_middle_ontology_boundary_generality_estimate()
  {
    final SubLObject cs = $cached_lower_middle_ontology_boundary_generality_estimate_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 10227L)
  public static SubLObject remove_cached_lower_middle_ontology_boundary_generality_estimate()
  {
    return memoization_state.caching_state_remove_function_results_with_args( $cached_lower_middle_ontology_boundary_generality_estimate_caching_state$.getGlobalValue(), ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY ),
        UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 10227L)
  public static SubLObject cached_lower_middle_ontology_boundary_generality_estimate_internal()
  {
    return lower_middle_ontology_boundary_generality_estimate();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 10227L)
  public static SubLObject cached_lower_middle_ontology_boundary_generality_estimate()
  {
    SubLObject caching_state = $cached_lower_middle_ontology_boundary_generality_estimate_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym29$CACHED_LOWER_MIDDLE_ONTOLOGY_BOUNDARY_GENERALITY_ESTIMATE, $sym30$_CACHED_LOWER_MIDDLE_ONTOLOGY_BOUNDARY_GENERALITY_ESTIMATE_CACHIN,
          NIL, EQL, ZERO_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_get_zero_arg_results( caching_state, UNPROVIDED );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( cached_lower_middle_ontology_boundary_generality_estimate_internal() ) );
      memoization_state.caching_state_set_zero_arg_results( caching_state, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 10375L)
  public static SubLObject upper_ontology_collection_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != forts.fort_p( v_object ) && NIL != fort_types_interface.collection_p( v_object ) && cardinality_estimates.generality_estimate( v_object ).numG(
        cached_middle_upper_ontology_boundary_generality_estimate() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 10587L)
  public static SubLObject middle_ontology_collection_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != forts.fort_p( v_object ) && NIL != fort_types_interface.collection_p( v_object ) && cardinality_estimates.generality_estimate( v_object ).numLE(
        cached_middle_upper_ontology_boundary_generality_estimate() ) && cardinality_estimates.generality_estimate( v_object ).numG( cached_lower_middle_ontology_boundary_generality_estimate() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 10901L)
  public static SubLObject lower_ontology_collection_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != forts.fort_p( v_object ) && NIL != fort_types_interface.collection_p( v_object ) && cardinality_estimates.generality_estimate( v_object ).numLE(
        cached_lower_middle_ontology_boundary_generality_estimate() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 11114L)
  public static SubLObject num_inferred_gaf_arg_index_tuple(final SubLObject tuple, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject num = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject infer_pred = NIL;
      SubLObject qua = NIL;
      SubLObject argnum = NIL;
      SubLObject pred = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( tuple, tuple, $list31 );
      infer_pred = tuple.first();
      SubLObject current = tuple.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, tuple, $list31 );
      qua = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, tuple, $list31 );
      argnum = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, tuple, $list31 );
      pred = current.first();
      current = current.rest();
      if( NIL == current )
      {
        num = kb_indexing.relevant_num_gaf_arg_index( qua, argnum, pred );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( tuple, $list31 );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return num;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 11456L)
  public static SubLObject num_inferred_gaf_arg_index_tuples(final SubLObject tuples, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject num = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      num = number_utilities.summation( Mapping.mapcar( Symbols.symbol_function( $sym32$NUM_INFERRED_GAF_ARG_INDEX_TUPLE ), tuples ) );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return num;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 11688L)
  public static SubLObject num_inferred_gaf_arg_index_tuple_groups(final SubLObject tuple_groups, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject num = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      num = number_utilities.summation( Mapping.mapcar( Symbols.symbol_function( $sym33$NUM_INFERRED_GAF_ARG_INDEX_TUPLES ), tuple_groups ) );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return num;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 11939L)
  public static SubLObject categorize_via_pred_filters(final SubLObject predicates, final SubLObject pred_filters)
  {
    if( NIL == pred_filters )
    {
      return Values.values( conses_high.copy_list( predicates ), NIL );
    }
    SubLObject allowed_predicates = NIL;
    SubLObject disallowed_predicates = NIL;
    SubLObject cdolist_list_var = predicates;
    SubLObject predicate = NIL;
    predicate = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != pred_filters_allowP( pred_filters, predicate ) )
      {
        allowed_predicates = ConsesLow.cons( predicate, allowed_predicates );
      }
      else
      {
        disallowed_predicates = ConsesLow.cons( predicate, disallowed_predicates );
      }
      cdolist_list_var = cdolist_list_var.rest();
      predicate = cdolist_list_var.first();
    }
    return Values.values( Sequences.nreverse( allowed_predicates ), Sequences.nreverse( disallowed_predicates ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 12526L)
  public static SubLObject pred_filters_allowP(final SubLObject pred_filters, final SubLObject pred)
  {
    if( NIL == pred_filters )
    {
      return T;
    }
    final SubLObject allow_predicates_tail = cdestructuring_bind.property_list_member( $kw34$ALLOW_PREDICATES, pred_filters );
    final SubLObject allow_predicates = ( NIL != allow_predicates_tail ) ? conses_high.cadr( allow_predicates_tail ) : NIL;
    final SubLObject allow_predicate_types_tail = cdestructuring_bind.property_list_member( $kw35$ALLOW_PREDICATE_TYPES, pred_filters );
    final SubLObject allow_predicate_types = ( NIL != allow_predicate_types_tail ) ? conses_high.cadr( allow_predicate_types_tail ) : NIL;
    final SubLObject forbid_predicates_tail = cdestructuring_bind.property_list_member( $kw36$FORBID_PREDICATES, pred_filters );
    final SubLObject forbid_predicates = ( NIL != forbid_predicates_tail ) ? conses_high.cadr( forbid_predicates_tail ) : NIL;
    final SubLObject forbid_predicate_types_tail = cdestructuring_bind.property_list_member( $kw37$FORBID_PREDICATE_TYPES, pred_filters );
    final SubLObject forbid_predicate_types = ( NIL != forbid_predicate_types_tail ) ? conses_high.cadr( forbid_predicate_types_tail ) : NIL;
    if( NIL != list_utilities.member_eqP( pred, allow_predicates ) )
    {
      return T;
    }
    if( NIL != list_utilities.member_eqP( pred, forbid_predicates ) )
    {
      return NIL;
    }
    SubLObject cdolist_list_var = allow_predicate_types;
    SubLObject type = NIL;
    type = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != isa.isa_in_any_mtP( pred, type ) || NIL != isa.quoted_isa_in_any_mtP( pred, type ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      type = cdolist_list_var.first();
    }
    cdolist_list_var = forbid_predicate_types;
    type = NIL;
    type = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != isa.isa_in_any_mtP( pred, type ) || NIL != isa.quoted_isa_in_any_mtP( pred, type ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      type = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 13270L)
  public static SubLObject sort_inferred_gaf_arg_index_tuples(final SubLObject v_term, SubLObject tuples, SubLObject order_by)
  {
    if( order_by == UNPROVIDED )
    {
      order_by = $kw6$PREDICATE;
    }
    final SubLObject pcase_var = order_by;
    if( pcase_var.eql( $kw6$PREDICATE ) )
    {
      tuples = kb_utilities.sort_terms( tuples, NIL, T, T, T, Symbols.symbol_function( $sym15$SECOND ), UNPROVIDED );
      tuples = Sort.stable_sort( tuples, $sym38$GENERALITY_ESTIMATE_, Symbols.symbol_function( $sym15$SECOND ) );
      tuples = list_utilities.stable_sort_via_position( tuples, $list39, Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym12$FIRST ) );
      tuples = Sort.stable_sort( tuples, $sym40$_, Symbols.symbol_function( $sym41$THIRD ) );
      tuples = sort_inferred_gaf_arg_index_tuples_by_predicates( v_term, tuples );
    }
    else if( pcase_var.eql( $kw14$ONTOLOGY ) )
    {
      tuples = Sort.stable_sort( tuples, $sym40$_, Symbols.symbol_function( $sym41$THIRD ) );
      tuples = sort_inferred_gaf_arg_index_tuples_by_predicates( v_term, tuples );
      tuples = kb_utilities.sort_terms( tuples, NIL, T, T, T, Symbols.symbol_function( $sym15$SECOND ), UNPROVIDED );
      tuples = Sort.stable_sort( tuples, $sym38$GENERALITY_ESTIMATE_, Symbols.symbol_function( $sym15$SECOND ) );
      tuples = list_utilities.stable_sort_via_position( tuples, $list39, Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym12$FIRST ) );
    }
    else
    {
      Errors.error( $str42$Unexpected_order_by____S, order_by );
    }
    return tuples;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 14564L)
  public static SubLObject sort_inferred_gaf_arg_index_tuples_by_predicates(final SubLObject v_term, final SubLObject tuples)
  {
    return cb_utilities.cb_sort_preds_for_display( v_term, tuples, Symbols.symbol_function( $sym13$FOURTH ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inferred-indexing.lisp", position = 14782L)
  public static SubLObject categorize_inferred_gaf_arg_index_tuples(final SubLObject v_term, final SubLObject all_tuples, final SubLObject order_by)
  {
    SubLObject tuple_groups = NIL;
    if( order_by.eql( $kw14$ONTOLOGY ) )
    {
      SubLObject last_qua = $kw43$UNINITIALIZED;
      SubLObject tuples = NIL;
      SubLObject cdolist_list_var = all_tuples;
      SubLObject tuple = NIL;
      tuple = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject qua = conses_high.second( tuple );
        if( !qua.equal( last_qua ) )
        {
          last_qua = qua;
          if( NIL != tuples )
          {
            tuple_groups = ConsesLow.cons( Sequences.nreverse( tuples ), tuple_groups );
            tuples = NIL;
          }
        }
        tuples = ConsesLow.cons( tuple, tuples );
        cdolist_list_var = cdolist_list_var.rest();
        tuple = cdolist_list_var.first();
      }
      if( NIL != tuples )
      {
        tuple_groups = ConsesLow.cons( Sequences.nreverse( tuples ), tuple_groups );
      }
    }
    else if( order_by.eql( $kw6$PREDICATE ) )
    {
      SubLObject last_argnum = $kw43$UNINITIALIZED;
      SubLObject last_pred = $kw43$UNINITIALIZED;
      SubLObject tuples2 = NIL;
      SubLObject cdolist_list_var2 = all_tuples;
      SubLObject tuple2 = NIL;
      tuple2 = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        final SubLObject argnum = conses_high.third( tuple2 );
        final SubLObject pred = conses_high.fourth( tuple2 );
        if( !argnum.equal( last_argnum ) || !pred.equal( last_pred ) )
        {
          last_argnum = argnum;
          last_pred = pred;
          if( NIL != tuples2 )
          {
            tuple_groups = ConsesLow.cons( Sequences.nreverse( tuples2 ), tuple_groups );
            tuples2 = NIL;
          }
        }
        tuples2 = ConsesLow.cons( tuple2, tuples2 );
        cdolist_list_var2 = cdolist_list_var2.rest();
        tuple2 = cdolist_list_var2.first();
      }
      if( NIL != tuples2 )
      {
        tuple_groups = ConsesLow.cons( Sequences.nreverse( tuples2 ), tuple_groups );
      }
    }
    return Sequences.nreverse( tuple_groups );
  }

  public static SubLObject declare_inferred_indexing_file()
  {
    SubLFiles.declareFunction( me, "term_inheritance_collections", "TERM-INHERITANCE-COLLECTIONS", 1, 2, false );
    SubLFiles.declareFunction( me, "new_term_inheritance_iterator", "NEW-TERM-INHERITANCE-ITERATOR", 1, 2, false );
    SubLFiles.declareFunction( me, "all_inferred_gaf_arg_index_tuples", "ALL-INFERRED-GAF-ARG-INDEX-TUPLES", 1, 2, false );
    SubLFiles.declareFunction( me, "all_inferred_gaf_arg_index_predicates", "ALL-INFERRED-GAF-ARG-INDEX-PREDICATES", 1, 0, false );
    SubLFiles.declareFunction( me, "all_inferred_gaf_arg_index_ontology_terms", "ALL-INFERRED-GAF-ARG-INDEX-ONTOLOGY-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "inferred_index_filters_extract_microtheory", "INFERRED-INDEX-FILTERS-EXTRACT-MICROTHEORY", 1, 0, false );
    SubLFiles.declareFunction( me, "inferred_gaf_arg_index_tuples", "INFERRED-GAF-ARG-INDEX-TUPLES", 4, 0, false );
    SubLFiles.declareFunction( me, "direct_gaf_arg_index_tuples", "DIRECT-GAF-ARG-INDEX-TUPLES", 2, 0, false );
    SubLFiles.declareFunction( me, "inferred_gaf_arg_index_tuples_via_isa", "INFERRED-GAF-ARG-INDEX-TUPLES-VIA-ISA", 3, 0, false );
    SubLFiles.declareFunction( me, "inferred_gaf_arg_index_tuples_via_genls", "INFERRED-GAF-ARG-INDEX-TUPLES-VIA-GENLS", 3, 0, false );
    SubLFiles.declareFunction( me, "transitive_via_arg_inverse_genlsP", "TRANSITIVE-VIA-ARG-INVERSE-GENLS?", 2, 1, false );
    SubLFiles.declareFunction( me, "cached_transitive_via_arg_inverse_genls_in_any_mtP_internal", "CACHED-TRANSITIVE-VIA-ARG-INVERSE-GENLS-IN-ANY-MT?-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "cached_transitive_via_arg_inverse_genls_in_any_mtP", "CACHED-TRANSITIVE-VIA-ARG-INVERSE-GENLS-IN-ANY-MT?", 2, 0, false );
    SubLFiles.declareFunction( me, "middle_upper_ontology_boundary_generality_estimate", "MIDDLE-UPPER-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE", 0, 0, false );
    SubLFiles.declareFunction( me, "lower_middle_ontology_boundary_generality_estimate", "LOWER-MIDDLE-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_cached_middle_upper_ontology_boundary_generality_estimate", "CLEAR-CACHED-MIDDLE-UPPER-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_cached_middle_upper_ontology_boundary_generality_estimate", "REMOVE-CACHED-MIDDLE-UPPER-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE", 0, 0, false );
    SubLFiles.declareFunction( me, "cached_middle_upper_ontology_boundary_generality_estimate_internal", "CACHED-MIDDLE-UPPER-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE-INTERNAL", 0, 0, false );
    SubLFiles.declareFunction( me, "cached_middle_upper_ontology_boundary_generality_estimate", "CACHED-MIDDLE-UPPER-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_cached_lower_middle_ontology_boundary_generality_estimate", "CLEAR-CACHED-LOWER-MIDDLE-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_cached_lower_middle_ontology_boundary_generality_estimate", "REMOVE-CACHED-LOWER-MIDDLE-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE", 0, 0, false );
    SubLFiles.declareFunction( me, "cached_lower_middle_ontology_boundary_generality_estimate_internal", "CACHED-LOWER-MIDDLE-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE-INTERNAL", 0, 0, false );
    SubLFiles.declareFunction( me, "cached_lower_middle_ontology_boundary_generality_estimate", "CACHED-LOWER-MIDDLE-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE", 0, 0, false );
    SubLFiles.declareFunction( me, "upper_ontology_collection_p", "UPPER-ONTOLOGY-COLLECTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "middle_ontology_collection_p", "MIDDLE-ONTOLOGY-COLLECTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "lower_ontology_collection_p", "LOWER-ONTOLOGY-COLLECTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "num_inferred_gaf_arg_index_tuple", "NUM-INFERRED-GAF-ARG-INDEX-TUPLE", 1, 1, false );
    SubLFiles.declareFunction( me, "num_inferred_gaf_arg_index_tuples", "NUM-INFERRED-GAF-ARG-INDEX-TUPLES", 1, 1, false );
    SubLFiles.declareFunction( me, "num_inferred_gaf_arg_index_tuple_groups", "NUM-INFERRED-GAF-ARG-INDEX-TUPLE-GROUPS", 1, 1, false );
    SubLFiles.declareFunction( me, "categorize_via_pred_filters", "CATEGORIZE-VIA-PRED-FILTERS", 2, 0, false );
    SubLFiles.declareFunction( me, "pred_filters_allowP", "PRED-FILTERS-ALLOW?", 2, 0, false );
    SubLFiles.declareFunction( me, "sort_inferred_gaf_arg_index_tuples", "SORT-INFERRED-GAF-ARG-INDEX-TUPLES", 2, 1, false );
    SubLFiles.declareFunction( me, "sort_inferred_gaf_arg_index_tuples_by_predicates", "SORT-INFERRED-GAF-ARG-INDEX-TUPLES-BY-PREDICATES", 2, 0, false );
    SubLFiles.declareFunction( me, "categorize_inferred_gaf_arg_index_tuples", "CATEGORIZE-INFERRED-GAF-ARG-INDEX-TUPLES", 3, 0, false );
    return NIL;
  }

  public static SubLObject init_inferred_indexing_file()
  {
    $cached_middle_upper_ontology_boundary_generality_estimate_caching_state$ = SubLFiles.deflexical( "*CACHED-MIDDLE-UPPER-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE-CACHING-STATE*", NIL );
    $cached_lower_middle_ontology_boundary_generality_estimate_caching_state$ = SubLFiles.deflexical( "*CACHED-LOWER-MIDDLE-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE-CACHING-STATE*", NIL );
    return NIL;
  }

  public static SubLObject setup_inferred_indexing_file()
  {
    memoization_state.note_memoized_function( $sym25$CACHED_TRANSITIVE_VIA_ARG_INVERSE_GENLS_IN_ANY_MT_ );
    memoization_state.note_globally_cached_function( $sym27$CACHED_MIDDLE_UPPER_ONTOLOGY_BOUNDARY_GENERALITY_ESTIMATE );
    memoization_state.note_globally_cached_function( $sym29$CACHED_LOWER_MIDDLE_ONTOLOGY_BOUNDARY_GENERALITY_ESTIMATE );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_inferred_indexing_file();
  }

  @Override
  public void initializeVariables()
  {
    init_inferred_indexing_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_inferred_indexing_file();
  }
  static
  {
    me = new inferred_indexing();
    $cached_middle_upper_ontology_boundary_generality_estimate_caching_state$ = null;
    $cached_lower_middle_ontology_boundary_generality_estimate_caching_state$ = null;
    $const0$Thing = constant_handles.reader_make_constant_shell( makeString( "Thing" ) );
    $const1$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $kw2$SELF = makeKeyword( "SELF" );
    $kw3$MIDDLE = makeKeyword( "MIDDLE" );
    $kw4$LOWER = makeKeyword( "LOWER" );
    $kw5$ASCENDING = makeKeyword( "ASCENDING" );
    $kw6$PREDICATE = makeKeyword( "PREDICATE" );
    $kw7$ONTOLOGY_HORIZON = makeKeyword( "ONTOLOGY-HORIZON" );
    $kw8$MICROTHEORY = makeKeyword( "MICROTHEORY" );
    $const9$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $const10$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const11$equals = constant_handles.reader_make_constant_shell( makeString( "equals" ) );
    $sym12$FIRST = makeSymbol( "FIRST" );
    $sym13$FOURTH = makeSymbol( "FOURTH" );
    $kw14$ONTOLOGY = makeKeyword( "ONTOLOGY" );
    $sym15$SECOND = makeSymbol( "SECOND" );
    $str16$Unexpected_inheritance_pred__S = makeString( "Unexpected inheritance pred ~S" );
    $const17$quotedIsa = constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) );
    $const18$relationAllInstance = constant_handles.reader_make_constant_shell( makeString( "relationAllInstance" ) );
    $kw19$QUERY_ISA = makeKeyword( "QUERY-ISA" );
    $kw20$TRUE = makeKeyword( "TRUE" );
    $const21$relationInstanceAll = constant_handles.reader_make_constant_shell( makeString( "relationInstanceAll" ) );
    $const22$relationAllExists = constant_handles.reader_make_constant_shell( makeString( "relationAllExists" ) );
    $const23$relationExistsAll = constant_handles.reader_make_constant_shell( makeString( "relationExistsAll" ) );
    $const24$transitiveViaArgInverse = constant_handles.reader_make_constant_shell( makeString( "transitiveViaArgInverse" ) );
    $sym25$CACHED_TRANSITIVE_VIA_ARG_INVERSE_GENLS_IN_ANY_MT_ = makeSymbol( "CACHED-TRANSITIVE-VIA-ARG-INVERSE-GENLS-IN-ANY-MT?" );
    $sym26$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $sym27$CACHED_MIDDLE_UPPER_ONTOLOGY_BOUNDARY_GENERALITY_ESTIMATE = makeSymbol( "CACHED-MIDDLE-UPPER-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE" );
    $sym28$_CACHED_MIDDLE_UPPER_ONTOLOGY_BOUNDARY_GENERALITY_ESTIMATE_CACHIN = makeSymbol( "*CACHED-MIDDLE-UPPER-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE-CACHING-STATE*" );
    $sym29$CACHED_LOWER_MIDDLE_ONTOLOGY_BOUNDARY_GENERALITY_ESTIMATE = makeSymbol( "CACHED-LOWER-MIDDLE-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE" );
    $sym30$_CACHED_LOWER_MIDDLE_ONTOLOGY_BOUNDARY_GENERALITY_ESTIMATE_CACHIN = makeSymbol( "*CACHED-LOWER-MIDDLE-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE-CACHING-STATE*" );
    $list31 = ConsesLow.list( makeSymbol( "INFER-PRED" ), makeSymbol( "QUA" ), makeSymbol( "ARGNUM" ), makeSymbol( "PRED" ) );
    $sym32$NUM_INFERRED_GAF_ARG_INDEX_TUPLE = makeSymbol( "NUM-INFERRED-GAF-ARG-INDEX-TUPLE" );
    $sym33$NUM_INFERRED_GAF_ARG_INDEX_TUPLES = makeSymbol( "NUM-INFERRED-GAF-ARG-INDEX-TUPLES" );
    $kw34$ALLOW_PREDICATES = makeKeyword( "ALLOW-PREDICATES" );
    $kw35$ALLOW_PREDICATE_TYPES = makeKeyword( "ALLOW-PREDICATE-TYPES" );
    $kw36$FORBID_PREDICATES = makeKeyword( "FORBID-PREDICATES" );
    $kw37$FORBID_PREDICATE_TYPES = makeKeyword( "FORBID-PREDICATE-TYPES" );
    $sym38$GENERALITY_ESTIMATE_ = makeSymbol( "GENERALITY-ESTIMATE<" );
    $list39 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "equals" ) ) );
    $sym40$_ = makeSymbol( "<" );
    $sym41$THIRD = makeSymbol( "THIRD" );
    $str42$Unexpected_order_by____S = makeString( "Unexpected order-by : ~S" );
    $kw43$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
  }
}
/*
 * 
 * Total time: 429 ms
 * 
 */