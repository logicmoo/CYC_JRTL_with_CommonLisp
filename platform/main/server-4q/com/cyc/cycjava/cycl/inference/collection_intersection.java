package com.cyc.cycjava.cycl.inference;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.hl_storage_modules;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.genls;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class collection_intersection
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.collection_intersection";
  public static final String myFingerPrint = "357e0711f6c3c866c9bfc3e226db032de8321cfbd6344df58e3937acbed89dfa";
  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 1517L)
  private static SubLSymbol $collection_intersection_genls_support_enabledP$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 3068L)
  private static SubLSymbol $nart_indexing_bug_workaround_enabledP$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 21434L)
  private static SubLSymbol $collection_intersection_defining_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 21660L)
  private static SubLSymbol $collection_intersection_genls_rule$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 22240L)
  private static SubLSymbol $collection_intersection_specs_rule$;
  private static final SubLSymbol $sym0$CYC_COLLECTION_INTERSECTION_AFTER_ADDING;
  private static final SubLSymbol $sym1$CYC_COLLECTION_INTERSECTION_2_AFTER_ADDING;
  private static final SubLObject $const2$InferencePSC;
  private static final SubLList $list3;
  private static final SubLSymbol $kw4$CODE;
  private static final SubLObject $const5$collectionIntersection;
  private static final SubLList $list6;
  private static final SubLSymbol $kw7$GENLS;
  private static final SubLSymbol $kw8$FORWARD;
  private static final SubLString $str9$Computing___genls_between_collect;
  private static final SubLString $str10$cdolist;
  private static final SubLObject $const11$CollectionIntersectionFn;
  private static final SubLSymbol $sym12$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__;
  private static final SubLList $list13;
  private static final SubLSymbol $sym14$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLSymbol $sym15$CSETQ;
  private static final SubLString $str16$_A;
  private static final SubLSymbol $sym17$VALID_NART_;
  private static final SubLSymbol $sym18$GAF_ARG1;
  private static final SubLObject $const19$CollectionIntersection2Fn;
  private static final SubLSymbol $sym20$_NART;
  private static final SubLString $str21$_s_did_not_contain_a_variable_nam;
  private static final SubLObject $const22$EverythingPSC;
  private static final SubLList $list23;
  private static final SubLString $str24$Found__a_narts_for_a_total_of__a_;
  private static final SubLObject $const25$UniversalVocabularyMt;
  private static final SubLSymbol $kw26$GAF;
  private static final SubLSymbol $kw27$TRUE;
  private static final SubLObject $const28$termOfUnit;
  private static final SubLSymbol $sym29$FULLY_BOUND_COLLECTION_INTERSECTION_NAT_P;
  private static final SubLSymbol $sym30$COLLECTION_INTERSECTION_NART_P;
  private static final SubLString $str31$Unexpected_collection_intersectio;
  private static final SubLSymbol $sym32$RELEVANT_MT_IS_ANY_MT;
  private static final SubLList $list33;
  private static final SubLList $list34;
  private static final SubLSymbol $kw35$TRUE_MON;
  private static final SubLObject $const36$genls;
  private static final SubLSymbol $sym37$JUSTIFY_COLLECTION_INTERSECTION_GENLS_ASENT;

  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 3299L)
  public static SubLObject cyc_collection_intersection_after_adding(final SubLObject argument, final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $collection_intersection_genls_support_enabledP$.getDynamicValue( thread ) )
    {
      final SubLObject nart = assertions_high.gaf_arg1( assertion );
      return possibly_add_collection_intersection_nart( nart );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 3643L)
  public static SubLObject cyc_collection_intersection_2_after_adding(final SubLObject argument, final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $collection_intersection_genls_support_enabledP$.getDynamicValue( thread ) )
    {
      final SubLObject nart = assertions_high.gaf_arg1( assertion );
      return possibly_add_collection_intersection_nart( nart );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 3911L)
  public static SubLObject possibly_add_collection_intersection_nart(final SubLObject nart)
  {
    if( NIL != collection_intersection_nart_p( nart ) )
    {
      return add_collection_intersection_nart( nart );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 4128L)
  public static SubLObject add_collection_intersection_nart(final SubLObject nart)
  {
    add_collection_intersection_nart_genls_links( nart );
    add_collection_intersection_nart_specs_links( nart );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 4306L)
  public static SubLObject add_collection_intersection_nart_genls_links(final SubLObject spec_nart)
  {
    final SubLObject genls_narts = collection_intersection_nat_max_proper_genls( spec_nart );
    final SubLObject any_mt_justified_asents = justify_collection_intersection_genls_narts( spec_nart, genls_narts, $const2$InferencePSC );
    return add_collection_intersection_nart_genls_links_int( any_mt_justified_asents );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 4671L)
  public static SubLObject add_collection_intersection_nart_specs_links(final SubLObject genl_nart)
  {
    SubLObject specs = collection_intersection_nat_max_proper_specs( genl_nart );
    specs = list_utilities.fast_set_difference( specs, genls.all_specs( genl_nart, UNPROVIDED, UNPROVIDED ), UNPROVIDED );
    final SubLObject any_mt_justified_asents = justify_collection_intersection_specs( specs, genl_nart, $const2$InferencePSC );
    return add_collection_intersection_nart_genls_links_int( any_mt_justified_asents );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 5217L)
  public static SubLObject add_collection_intersection_nart_genls_links_int(final SubLObject any_mt_justified_asents)
  {
    SubLObject cdolist_list_var;
    final SubLObject v_hl_supports = cdolist_list_var = compute_mt_placement_for_collection_intersection_genls_justified_asents( any_mt_justified_asents );
    SubLObject hl_support = NIL;
    hl_support = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = hl_support;
      SubLObject hl_module = NIL;
      SubLObject asent = NIL;
      SubLObject mt = NIL;
      SubLObject tv = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
      hl_module = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
      asent = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
      mt = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
      tv = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject mt_specific_justification = compute_mt_specific_justification_for_collection_intersection_genls_asent( asent, mt );
        assert_collection_intersection_genls_link( asent, mt, mt_specific_justification );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list3 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      hl_support = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 5775L)
  public static SubLObject compute_mt_specific_justification_for_collection_intersection_genls_asent(final SubLObject asent, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject mt_specific_justification = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject mt_specific_justified_asent = justify_collection_intersection_genls_asent( asent );
      mt_specific_justification = mt_specific_justified_asent.rest();
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    final SubLObject items_var = compute_more_supports_for_collection_intersection_genls_asent( asent );
    if( items_var.isVector() )
    {
      final SubLObject vector_var = items_var;
      final SubLObject backwardP_var = NIL;
      SubLObject length;
      SubLObject v_iteration;
      SubLObject element_num;
      SubLObject item;
      for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
      {
        element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
        item = Vectors.aref( vector_var, element_num );
        mt_specific_justification = ConsesLow.cons( item, mt_specific_justification );
      }
    }
    else
    {
      SubLObject cdolist_list_var = items_var;
      SubLObject item2 = NIL;
      item2 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        mt_specific_justification = ConsesLow.cons( item2, mt_specific_justification );
        cdolist_list_var = cdolist_list_var.rest();
        item2 = cdolist_list_var.first();
      }
    }
    return Sequences.nreverse( mt_specific_justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 6278L)
  public static SubLObject compute_more_supports_for_collection_intersection_genls_asent(final SubLObject asent)
  {
    final SubLObject spec = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject genl = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject genl_cols = collection_intersection_nat_collections( genl );
    final SubLObject genl_cols_set = el_utilities.make_el_set( genl_cols, UNPROVIDED );
    final SubLObject genl_ci_support = arguments.make_hl_support( $kw4$CODE, ConsesLow.list( $const5$collectionIntersection, genl, genl_cols_set ), $collection_intersection_defining_mt$.getGlobalValue(), UNPROVIDED );
    if( NIL != fully_bound_collection_intersection_nat_p( spec ) )
    {
      final SubLObject spec_cols = collection_intersection_nat_collections( spec );
      final SubLObject spec_cols_set = el_utilities.make_el_set( spec_cols, UNPROVIDED );
      return ConsesLow.list( genl_ci_support, arguments.make_hl_support( $kw4$CODE, ConsesLow.list( $const5$collectionIntersection, spec, spec_cols_set ), $collection_intersection_defining_mt$.getGlobalValue(),
          UNPROVIDED ), collection_intersection_genls_rule_support() );
    }
    return ConsesLow.list( genl_ci_support, collection_intersection_specs_rule_support() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 7272L)
  public static SubLObject compute_mt_placement_for_collection_intersection_genls_justified_asents(final SubLObject any_mt_justified_asents)
  {
    SubLObject v_hl_supports = NIL;
    SubLObject cdolist_list_var = any_mt_justified_asents;
    SubLObject any_mt_justified_asent = NIL;
    any_mt_justified_asent = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = any_mt_justified_asent;
      SubLObject asent = NIL;
      SubLObject any_mt_justification = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
      asent = current.first();
      current = ( any_mt_justification = current.rest() );
      SubLObject cdolist_list_var_$1;
      final SubLObject mts = cdolist_list_var_$1 = max_floor_mts_of_genls_justification( any_mt_justification );
      SubLObject mt = NIL;
      mt = cdolist_list_var_$1.first();
      while ( NIL != cdolist_list_var_$1)
      {
        v_hl_supports = ConsesLow.cons( arguments.make_hl_support( $kw7$GENLS, asent, mt, UNPROVIDED ), v_hl_supports );
        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
        mt = cdolist_list_var_$1.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      any_mt_justified_asent = cdolist_list_var.first();
    }
    return minimize_genls_hl_supports( v_hl_supports );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 7769L)
  public static SubLObject minimize_genls_hl_supports(final SubLObject v_hl_supports)
  {
    return v_hl_supports;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 8354L)
  public static SubLObject max_floor_mts_of_genls_justification(final SubLObject any_mt_justification)
  {
    SubLObject mts = NIL;
    SubLObject cdolist_list_var = any_mt_justification;
    SubLObject hl_support = NIL;
    hl_support = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = hl_support;
      SubLObject hl_module = NIL;
      SubLObject asent = NIL;
      SubLObject mt = NIL;
      SubLObject tv = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
      hl_module = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
      asent = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
      mt = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
      tv = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject spec = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
        final SubLObject genl = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
        final SubLObject items_var = genls.max_floor_mts_of_genls_paths( spec, genl, UNPROVIDED );
        if( items_var.isVector() )
        {
          final SubLObject vector_var = items_var;
          final SubLObject backwardP_var = NIL;
          SubLObject length;
          SubLObject v_iteration;
          SubLObject element_num;
          SubLObject item;
          for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
          {
            element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
            item = Vectors.aref( vector_var, element_num );
            mts = ConsesLow.cons( item, mts );
          }
        }
        else
        {
          SubLObject cdolist_list_var_$2 = items_var;
          SubLObject item2 = NIL;
          item2 = cdolist_list_var_$2.first();
          while ( NIL != cdolist_list_var_$2)
          {
            mts = ConsesLow.cons( item2, mts );
            cdolist_list_var_$2 = cdolist_list_var_$2.rest();
            item2 = cdolist_list_var_$2.first();
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list3 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      hl_support = cdolist_list_var.first();
    }
    return genl_mts.min_mts( mts, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 8763L)
  public static SubLObject assert_collection_intersection_genls_link(final SubLObject asent, final SubLObject mt, final SubLObject justification)
  {
    return hl_storage_modules.hl_add_deduction( clause_utilities.make_gaf_cnf( asent ), mt, justification, $kw8$FORWARD, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 8922L)
  public static SubLObject genls_collection_intersection_after_adding_int(final SubLObject gaf)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $collection_intersection_genls_support_enabledP$.getDynamicValue( thread ) )
    {
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( assertions_high.assertion_mt( gaf ) );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        final SubLObject spec = assertions_high.gaf_arg1( gaf );
        final SubLObject genl = assertions_high.gaf_arg2( gaf );
        final SubLObject specs = genls.all_specs( spec, UNPROVIDED, UNPROVIDED );
        final SubLObject v_genls = genls.all_genls( genl, UNPROVIDED, UNPROVIDED );
        final SubLObject candidate_spec_narts = set.new_set( Symbols.symbol_function( EQL ), UNPROVIDED );
        final SubLObject candidate_genl_narts = set.new_set( Symbols.symbol_function( EQL ), UNPROVIDED );
        SubLObject cdolist_list_var = specs;
        SubLObject candidate_spec = NIL;
        candidate_spec = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          set_utilities.set_add_all( collection_intersection_narts_with_constituent_collection( candidate_spec ), candidate_spec_narts );
          cdolist_list_var = cdolist_list_var.rest();
          candidate_spec = cdolist_list_var.first();
        }
        cdolist_list_var = v_genls;
        SubLObject candidate_genl = NIL;
        candidate_genl = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          set_utilities.set_add_all( collection_intersection_narts_with_constituent_collection( candidate_genl ), candidate_genl_narts );
          cdolist_list_var = cdolist_list_var.rest();
          candidate_genl = cdolist_list_var.first();
        }
        consider_all_combinations_for_genls_collection_intersection( set.set_element_list( candidate_spec_narts ), set.set_element_list( candidate_genl_narts ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
        final SubLObject set_contents_var = set.do_set_internal( candidate_genl_narts );
        SubLObject basis_object;
        SubLObject state;
        SubLObject candidate_genl_nart;
        for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
            .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
        {
          candidate_genl_nart = set_contents.do_set_contents_next( basis_object, state );
          if( NIL != set_contents.do_set_contents_element_validP( state, candidate_genl_nart ) )
          {
            add_collection_intersection_nart_specs_links( candidate_genl_nart );
          }
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 10058L)
  public static SubLObject consider_all_combinations_for_genls_collection_intersection(final SubLObject candidate_spec_narts, final SubLObject candidate_genl_narts, SubLObject show_progressP, SubLObject warn_on_errorsP,
      SubLObject skip_collection_intersection_fn_pairsP)
  {
    if( show_progressP == UNPROVIDED )
    {
      show_progressP = NIL;
    }
    if( warn_on_errorsP == UNPROVIDED )
    {
      warn_on_errorsP = NIL;
    }
    if( skip_collection_intersection_fn_pairsP == UNPROVIDED )
    {
      skip_collection_intersection_fn_pairsP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    if( NIL != show_progressP )
    {
      final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( $str9$Computing___genls_between_collect, thread );
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_total$.bind( Sequences.length( candidate_spec_narts ), thread );
        utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
          SubLObject csome_list_var = candidate_spec_narts;
          SubLObject candidate_spec_nart = NIL;
          candidate_spec_nart = csome_list_var.first();
          while ( NIL != csome_list_var)
          {
            count = Numbers.add( count, consider_all_genl_narts_for_genls_collection_intersection( candidate_spec_nart, candidate_genl_narts, warn_on_errorsP, skip_collection_intersection_fn_pairsP ) );
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            csome_list_var = csome_list_var.rest();
            candidate_spec_nart = csome_list_var.first();
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
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
        utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
        utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      SubLObject cdolist_list_var = candidate_spec_narts;
      SubLObject candidate_spec_nart2 = NIL;
      candidate_spec_nart2 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        count = Numbers.add( count, consider_all_genl_narts_for_genls_collection_intersection( candidate_spec_nart2, candidate_genl_narts, warn_on_errorsP, skip_collection_intersection_fn_pairsP ) );
        cdolist_list_var = cdolist_list_var.rest();
        candidate_spec_nart2 = cdolist_list_var.first();
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 10848L)
  public static SubLObject consider_all_genl_narts_for_genls_collection_intersection(final SubLObject candidate_spec_nart, final SubLObject candidate_genl_narts, final SubLObject warn_on_errorsP,
      final SubLObject skip_collection_intersection_fn_pairsP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    final SubLObject all_genls_set = set_utilities.construct_set_from_list( genls.all_genls( candidate_spec_nart, UNPROVIDED, UNPROVIDED ), Symbols.symbol_function( EQL ), UNPROVIDED );
    SubLObject cdolist_list_var = candidate_genl_narts;
    SubLObject candidate_genl_nart = NIL;
    candidate_genl_nart = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( !candidate_spec_nart.eql( candidate_genl_nart ) && NIL == set.set_memberP( candidate_genl_nart, all_genls_set ) && ( NIL == skip_collection_intersection_fn_pairsP || NIL == narts_high.nart_with_functor_p(
          $const11$CollectionIntersectionFn, candidate_spec_nart ) || NIL == narts_high.nart_with_functor_p( $const11$CollectionIntersectionFn, candidate_genl_nart ) ) )
      {
        SubLObject genlsP = NIL;
        if( NIL != warn_on_errorsP )
        {
          SubLObject message_var = NIL;
          final SubLObject was_appendingP = Eval.eval( $sym12$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ );
          Eval.eval( $list13 );
          try
          {
            try
            {
              thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
              final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
              try
              {
                Errors.$error_handler$.bind( $sym14$CATCH_ERROR_MESSAGE_HANDLER, thread );
                try
                {
                  genlsP = genls_collection_intersection_fn_collection_intersection_fn_pos_check_in_any_mt( candidate_spec_nart, candidate_genl_nart );
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
              message_var = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
            }
            finally
            {
              thread.throwStack.pop();
            }
          }
          finally
          {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              Eval.eval( ConsesLow.list( $sym15$CSETQ, $sym12$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP ) );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
            }
          }
          if( message_var.isString() )
          {
            Errors.warn( $str16$_A, message_var );
          }
        }
        else
        {
          genlsP = genls_collection_intersection_fn_collection_intersection_fn_pos_check_in_any_mt( candidate_spec_nart, candidate_genl_nart );
        }
        if( NIL != genlsP )
        {
          count = Numbers.add( count, ONE_INTEGER );
          SubLObject any_mt_justified_asents = NIL;
          if( NIL != warn_on_errorsP )
          {
            SubLObject message_var2 = NIL;
            final SubLObject was_appendingP2 = Eval.eval( $sym12$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ );
            Eval.eval( $list13 );
            try
            {
              try
              {
                thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                final SubLObject _prev_bind_3 = Errors.$error_handler$.currentBinding( thread );
                try
                {
                  Errors.$error_handler$.bind( $sym14$CATCH_ERROR_MESSAGE_HANDLER, thread );
                  try
                  {
                    any_mt_justified_asents = justify_collection_intersection_genls_link_in_any_mt( candidate_spec_nart, candidate_genl_nart );
                  }
                  catch( final Throwable catch_var2 )
                  {
                    Errors.handleThrowable( catch_var2, NIL );
                  }
                }
                finally
                {
                  Errors.$error_handler$.rebind( _prev_bind_3, thread );
                }
              }
              catch( final Throwable ccatch_env_var2 )
              {
                message_var2 = Errors.handleThrowable( ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
              }
              finally
              {
                thread.throwStack.pop();
              }
            }
            finally
            {
              final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                Eval.eval( ConsesLow.list( $sym15$CSETQ, $sym12$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP2 ) );
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_4, thread );
              }
            }
            if( message_var2.isString() )
            {
              Errors.warn( $str16$_A, message_var2 );
            }
          }
          else
          {
            any_mt_justified_asents = justify_collection_intersection_genls_link_in_any_mt( candidate_spec_nart, candidate_genl_nart );
          }
          if( NIL != warn_on_errorsP )
          {
            SubLObject message_var2 = NIL;
            final SubLObject was_appendingP2 = Eval.eval( $sym12$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ );
            Eval.eval( $list13 );
            try
            {
              try
              {
                thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                final SubLObject _prev_bind_3 = Errors.$error_handler$.currentBinding( thread );
                try
                {
                  Errors.$error_handler$.bind( $sym14$CATCH_ERROR_MESSAGE_HANDLER, thread );
                  try
                  {
                    add_collection_intersection_nart_genls_links_int( any_mt_justified_asents );
                  }
                  catch( final Throwable catch_var2 )
                  {
                    Errors.handleThrowable( catch_var2, NIL );
                  }
                }
                finally
                {
                  Errors.$error_handler$.rebind( _prev_bind_3, thread );
                }
              }
              catch( final Throwable ccatch_env_var2 )
              {
                message_var2 = Errors.handleThrowable( ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
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
                final SubLObject _values3 = Values.getValuesAsVector();
                Eval.eval( ConsesLow.list( $sym15$CSETQ, $sym12$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP2 ) );
                Values.restoreValuesFromVector( _values3 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_5, thread );
              }
            }
            if( message_var2.isString() )
            {
              Errors.warn( $str16$_A, message_var2 );
            }
          }
          else
          {
            add_collection_intersection_nart_genls_links_int( any_mt_justified_asents );
          }
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      candidate_genl_nart = cdolist_list_var.first();
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 12153L)
  public static SubLObject collection_intersection_genls_sweep_part_1(SubLObject warn_on_errorsP)
  {
    if( warn_on_errorsP == UNPROVIDED )
    {
      warn_on_errorsP = T;
    }
    final SubLObject narts = list_utilities.remove_if_not( $sym17$VALID_NART_, Mapping.mapcar( Symbols.symbol_function( $sym18$GAF_ARG1 ), kb_mapping.gather_function_extent_index( $const11$CollectionIntersectionFn ) ),
        UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return consider_all_combinations_for_genls_collection_intersection( narts, narts, T, warn_on_errorsP, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 12533L)
  public static SubLObject collection_intersection_genls_sweep_part_2(SubLObject warn_on_errorsP)
  {
    if( warn_on_errorsP == UNPROVIDED )
    {
      warn_on_errorsP = T;
    }
    final SubLObject narts = list_utilities.remove_if_not( $sym17$VALID_NART_, Mapping.mapcar( Symbols.symbol_function( $sym18$GAF_ARG1 ), ConsesLow.append( kb_mapping.gather_function_extent_index(
        $const11$CollectionIntersectionFn ), kb_mapping.gather_function_extent_index( $const19$CollectionIntersection2Fn ) ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return consider_all_combinations_for_genls_collection_intersection( narts, narts, T, warn_on_errorsP, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 12952L)
  public static SubLObject collection_intersection_genls_sweep_by_query(final SubLObject cycl_query, SubLObject warn_on_errorsP)
  {
    if( warn_on_errorsP == UNPROVIDED )
    {
      warn_on_errorsP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == list_utilities.tree_find( $sym20$_NART, cycl_query, UNPROVIDED, UNPROVIDED ) )
    {
      Errors.error( $str21$_s_did_not_contain_a_variable_nam, cycl_query );
    }
    final SubLObject narts = list_utilities.remove_if_not( $sym17$VALID_NART_, ask_utilities.query_variable( $sym20$_NART, cycl_query, $const22$EverythingPSC, $list23 ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject count = Sequences.length( narts );
    format_nil.force_format( T, $str24$Found__a_narts_for_a_total_of__a_, count, Numbers.expt( count, TWO_INTEGER ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return consider_all_combinations_for_genls_collection_intersection( narts, narts, T, warn_on_errorsP, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 13505L)
  public static SubLObject collection_intersection_nat_max_proper_genls(final SubLObject spec_nat)
  {
    return genls.min_cols( collection_intersection_nat_proper_genls( spec_nat, $const2$InferencePSC ), $const25$UniversalVocabularyMt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 13972L)
  public static SubLObject collection_intersection_nat_proper_genls(final SubLObject spec_nat, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject constituent_cols = collection_intersection_nat_collections( spec_nat );
      final SubLObject candidate_collections = genls.union_all_genls( constituent_cols, UNPROVIDED, UNPROVIDED );
      final SubLObject candidate_narts = set.new_set( Symbols.symbol_function( EQL ), UNPROVIDED );
      SubLObject cdolist_list_var = candidate_collections;
      SubLObject candidate_col = NIL;
      candidate_col = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        set_utilities.set_add_all( collection_intersection_narts_with_constituent_collection( candidate_col ), candidate_narts );
        cdolist_list_var = cdolist_list_var.rest();
        candidate_col = cdolist_list_var.first();
      }
      final SubLObject set_contents_var = set.do_set_internal( candidate_narts );
      SubLObject basis_object;
      SubLObject state;
      SubLObject candidate_nart;
      SubLObject candidate_nat;
      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
          .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
      {
        candidate_nart = set_contents.do_set_contents_next( basis_object, state );
        if( NIL != set_contents.do_set_contents_element_validP( state, candidate_nart ) )
        {
          candidate_nat = ( ( NIL != nart_handles.nart_p( spec_nat ) ) ? candidate_nart : narts_high.nart_hl_formula( candidate_nart ) );
          if( !candidate_nat.equal( spec_nat ) && NIL != genls_collection_intersection_fn_collection_intersection_fn_pos_check( spec_nat, candidate_nart ) )
          {
            result = ConsesLow.cons( candidate_nart, result );
          }
        }
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 16236L)
  public static SubLObject collection_intersection_nat_max_proper_specs(final SubLObject genl_nat)
  {
    return genls.max_cols( collection_intersection_nat_proper_specs( genl_nat, $const2$InferencePSC ), $const25$UniversalVocabularyMt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 16543L)
  public static SubLObject collection_intersection_nat_proper_specs(final SubLObject genl_nat, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject constituent_cols = collection_intersection_nat_collections( genl_nat );
      final SubLObject candidate_collections = genls.all_common_specs( constituent_cols, UNPROVIDED, UNPROVIDED );
      result = Sequences.delete( genl_nat, candidate_collections, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 17087L)
  public static SubLObject collection_intersection_narts_with_constituent_collection(final SubLObject col)
  {
    return ConsesLow.nconc( collection_intersection_2_fn_narts_with_constituent_collection( col ), collection_intersection_fn_narts_with_constituent_collection( col ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 17921L)
  public static SubLObject collection_intersection_2_fn_narts_with_constituent_collection(final SubLObject col)
  {
    SubLObject narts = NIL;
    if( NIL != $nart_indexing_bug_workaround_enabledP$.getGlobalValue() )
    {
      if( NIL != kb_mapping_macros.do_nart_arg_index_key_validator( col, ONE_INTEGER, $const19$CollectionIntersection2Fn ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator( col, ONE_INTEGER, $const19$CollectionIntersection2Fn );
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
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw26$GAF, NIL, NIL );
              SubLObject done_var_$4 = NIL;
              final SubLObject token_var_$5 = NIL;
              while ( NIL == done_var_$4)
              {
                final SubLObject tou_gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$5 );
                final SubLObject valid_$6 = makeBoolean( !token_var_$5.eql( tou_gaf ) );
                if( NIL != valid_$6 )
                {
                  narts = ConsesLow.cons( assertions_high.gaf_arg1( tou_gaf ), narts );
                }
                done_var_$4 = makeBoolean( NIL == valid_$6 );
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
          done_var = makeBoolean( NIL == valid );
        }
      }
      if( NIL != kb_mapping_macros.do_nart_arg_index_key_validator( col, TWO_INTEGER, $const19$CollectionIntersection2Fn ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator( col, TWO_INTEGER, $const19$CollectionIntersection2Fn );
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
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw26$GAF, NIL, NIL );
              SubLObject done_var_$5 = NIL;
              final SubLObject token_var_$6 = NIL;
              while ( NIL == done_var_$5)
              {
                final SubLObject tou_gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$6 );
                final SubLObject valid_$7 = makeBoolean( !token_var_$6.eql( tou_gaf ) );
                if( NIL != valid_$7 )
                {
                  narts = ConsesLow.cons( assertions_high.gaf_arg1( tou_gaf ), narts );
                }
                done_var_$5 = makeBoolean( NIL == valid_$7 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_2 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
              try
              {
                Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                final SubLObject _values2 = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_2 );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    else if( NIL != kb_mapping_macros.do_nart_arg_index_key_validator( col, NIL, $const19$CollectionIntersection2Fn ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator( col, NIL, $const19$CollectionIntersection2Fn );
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
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw26$GAF, NIL, NIL );
            SubLObject done_var_$6 = NIL;
            final SubLObject token_var_$7 = NIL;
            while ( NIL == done_var_$6)
            {
              final SubLObject tou_gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$7 );
              final SubLObject valid_$8 = makeBoolean( !token_var_$7.eql( tou_gaf ) );
              if( NIL != valid_$8 )
              {
                narts = ConsesLow.cons( assertions_high.gaf_arg1( tou_gaf ), narts );
              }
              done_var_$6 = makeBoolean( NIL == valid_$8 );
            }
          }
          finally
          {
            final SubLObject _prev_bind_3 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
            try
            {
              Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
              final SubLObject _values3 = Values.getValuesAsVector();
              if( NIL != final_index_iterator )
              {
                kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
              }
              Values.restoreValuesFromVector( _values3 );
            }
            finally
            {
              Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_3 );
            }
          }
        }
        done_var = makeBoolean( NIL == valid );
      }
    }
    return Sequences.nreverse( list_utilities.remove_if_not( $sym17$VALID_NART_, narts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 18574L)
  public static SubLObject collection_intersection_fn_narts_with_constituent_collection(final SubLObject col)
  {
    SubLObject narts = NIL;
    if( NIL != kb_mapping_macros.do_other_index_key_validator( col, $kw26$GAF ) )
    {
      final SubLObject final_index_spec = kb_mapping_macros.other_final_index_spec( col );
      SubLObject final_index_iterator = NIL;
      try
      {
        final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw26$GAF, $kw27$TRUE, NIL );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( gaf ) );
          if( NIL != valid && NIL != kb_mapping_macros.do_other_index_assertion_match_p( gaf ) && NIL != assertion_utilities.gaf_assertion_with_pred_p( gaf, $const28$termOfUnit ) )
          {
            final SubLObject nart = assertions_high.gaf_arg1( gaf );
            if( NIL != collection_intersection_nart_p( nart ) )
            {
              narts = ConsesLow.cons( nart, narts );
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
    return Sequences.nreverse( narts );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 19012L)
  public static SubLObject fully_bound_collection_intersection_nat_p(final SubLObject v_object)
  {
    if( NIL != nart_handles.nart_p( v_object ) )
    {
      return fully_bound_collection_intersection_nat_formula_p( narts_high.nart_hl_formula( v_object ) );
    }
    if( NIL != el_utilities.possibly_naut_p( v_object ) && NIL != variables.fully_bound_p( v_object ) )
    {
      return fully_bound_collection_intersection_nat_formula_p( v_object );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 19463L)
  public static SubLObject collection_intersection_nart_p(final SubLObject v_object)
  {
    if( NIL != nart_handles.valid_nartP( v_object, UNPROVIDED ) )
    {
      final SubLObject formula = narts_high.nart_hl_formula( v_object );
      return fully_bound_collection_intersection_nat_formula_p( formula );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 19680L)
  public static SubLObject fully_bound_collection_intersection_nat_formula_p(final SubLObject formula)
  {
    final SubLObject pcase_var;
    final SubLObject functor = pcase_var = cycl_utilities.formula_operator( formula );
    if( pcase_var.eql( $const11$CollectionIntersectionFn ) )
    {
      return el_utilities.el_extensional_set_p( cycl_utilities.formula_arg1( formula, UNPROVIDED ) );
    }
    if( pcase_var.eql( $const19$CollectionIntersection2Fn ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 19983L)
  public static SubLObject collection_intersection_nat_collections(final SubLObject nat)
  {
    final SubLObject pcase_var;
    final SubLObject functor = pcase_var = cycl_utilities.nat_functor( nat );
    if( pcase_var.eql( $const11$CollectionIntersectionFn ) )
    {
      return el_utilities.extensional_set_elements( cycl_utilities.nat_arg1( nat, UNPROVIDED ) );
    }
    if( pcase_var.eql( $const19$CollectionIntersection2Fn ) )
    {
      return cycl_utilities.nat_args( nat, UNPROVIDED );
    }
    return Errors.error( $str31$Unexpected_collection_intersectio, nat );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 20347L)
  public static SubLObject term_constituent_collections(final SubLObject v_term)
  {
    return ( NIL != fully_bound_collection_intersection_nat_formula_p( v_term ) ) ? collection_intersection_nat_collections( v_term ) : ConsesLow.list( v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 20678L)
  public static SubLObject genls_collection_intersection_fn_collection_intersection_fn_pos_check_in_any_mt(final SubLObject spec_nat, final SubLObject genl_nat)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject genlsP = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym32$RELEVANT_MT_IS_ANY_MT, thread );
      mt_relevance_macros.$mt$.bind( $const2$InferencePSC, thread );
      genlsP = genls_collection_intersection_fn_collection_intersection_fn_pos_check( spec_nat, genl_nat );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return genlsP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 20960L)
  public static SubLObject genls_collection_intersection_fn_collection_intersection_fn_pos_check(final SubLObject spec_nat, final SubLObject genl_nat)
  {
    final SubLObject spec_cols = collection_intersection_nat_collections( spec_nat );
    final SubLObject genl_cols = collection_intersection_nat_collections( genl_nat );
    return genls_collection_intersection_fn_pos_check( spec_cols, genl_cols );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 21282L)
  public static SubLObject genls_collection_intersection_fn_pos_check(final SubLObject spec_cols, final SubLObject genl_cols)
  {
    return list_utilities.fast_subsetP( genl_cols, genls.union_all_genls( spec_cols, UNPROVIDED, UNPROVIDED ), Symbols.symbol_function( EQUAL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 22645L)
  public static SubLObject collection_intersection_genls_rule_support()
  {
    return arguments.make_hl_support( $kw4$CODE, $collection_intersection_genls_rule$.getGlobalValue(), $collection_intersection_defining_mt$.getGlobalValue(), $kw35$TRUE_MON );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 22830L)
  public static SubLObject collection_intersection_specs_rule_support()
  {
    return arguments.make_hl_support( $kw4$CODE, $collection_intersection_specs_rule$.getGlobalValue(), $collection_intersection_defining_mt$.getGlobalValue(), $kw35$TRUE_MON );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 23015L)
  public static SubLObject justify_collection_intersection_genls_narts(final SubLObject spec, final SubLObject v_genls, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject justified_asents = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject genls_asents = NIL;
      SubLObject cdolist_list_var = v_genls;
      SubLObject genl = NIL;
      genl = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        genls_asents = ConsesLow.cons( ConsesLow.list( $const36$genls, spec, genl ), genls_asents );
        cdolist_list_var = cdolist_list_var.rest();
        genl = cdolist_list_var.first();
      }
      justified_asents = Mapping.mapcar( $sym37$JUSTIFY_COLLECTION_INTERSECTION_GENLS_ASENT, Sequences.nreverse( genls_asents ) );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return justified_asents;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 23412L)
  public static SubLObject justify_collection_intersection_specs(final SubLObject specs, final SubLObject genl, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject justified_asents = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject genls_asents = NIL;
      SubLObject cdolist_list_var = specs;
      SubLObject spec = NIL;
      spec = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        genls_asents = ConsesLow.cons( ConsesLow.list( $const36$genls, spec, genl ), genls_asents );
        cdolist_list_var = cdolist_list_var.rest();
        spec = cdolist_list_var.first();
      }
      justified_asents = Mapping.mapcar( $sym37$JUSTIFY_COLLECTION_INTERSECTION_GENLS_ASENT, Sequences.nreverse( genls_asents ) );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return justified_asents;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 23803L)
  public static SubLObject justify_collection_intersection_genls_link_in_any_mt(final SubLObject spec_nart, final SubLObject genl_nart)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym32$RELEVANT_MT_IS_ANY_MT, thread );
      mt_relevance_macros.$mt$.bind( $const2$InferencePSC, thread );
      result = ConsesLow.list( justify_collection_intersection_genls_asent( ConsesLow.list( $const36$genls, spec_nart, genl_nart ) ) );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 24056L)
  public static SubLObject justify_collection_intersection_genls_asent(final SubLObject genls_asent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject spec = cycl_utilities.formula_arg1( genls_asent, UNPROVIDED );
    final SubLObject genl = cycl_utilities.formula_arg2( genls_asent, UNPROVIDED );
    final SubLObject spec_cols = term_constituent_collections( spec );
    final SubLObject genl_cols = term_constituent_collections( genl );
    final SubLObject genls_asents = why_genls_collection_intersection_fn( spec_cols, genl_cols );
    SubLObject v_hl_supports = NIL;
    SubLObject cdolist_list_var = genls_asents;
    SubLObject asent = NIL;
    asent = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      v_hl_supports = ConsesLow.cons( arguments.make_hl_support( $kw7$GENLS, asent, mt_relevance_macros.$mt$.getDynamicValue( thread ), UNPROVIDED ), v_hl_supports );
      cdolist_list_var = cdolist_list_var.rest();
      asent = cdolist_list_var.first();
    }
    final SubLObject justified_asent = ConsesLow.cons( genls_asent, Sequences.nreverse( v_hl_supports ) );
    return justified_asent;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/collection-intersection.lisp", position = 24638L)
  public static SubLObject why_genls_collection_intersection_fn(final SubLObject spec_cols, final SubLObject genl_cols)
  {
    SubLObject genls_asents = NIL;
    SubLObject cdolist_list_var = genl_cols;
    SubLObject genl = NIL;
    genl = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject done_with_this_genl_colP = NIL;
      SubLObject low_mt_genls_asent = NIL;
      if( NIL == done_with_this_genl_colP )
      {
        SubLObject csome_list_var = spec_cols;
        SubLObject spec = NIL;
        spec = csome_list_var.first();
        while ( NIL == done_with_this_genl_colP && NIL != csome_list_var)
        {
          if( NIL != genls.genlsP( spec, genl, UNPROVIDED, UNPROVIDED ) )
          {
            if( NIL != mt_relevance_macros.any_mt_is_relevantP() && NIL == genls.genlsP( spec, genl, $const25$UniversalVocabularyMt, UNPROVIDED ) )
            {
              low_mt_genls_asent = ConsesLow.list( $const36$genls, spec, genl );
            }
            else
            {
              genls_asents = ConsesLow.cons( ConsesLow.list( $const36$genls, spec, genl ), genls_asents );
              done_with_this_genl_colP = T;
            }
          }
          csome_list_var = csome_list_var.rest();
          spec = csome_list_var.first();
        }
      }
      if( NIL != low_mt_genls_asent && NIL == done_with_this_genl_colP )
      {
        genls_asents = ConsesLow.cons( low_mt_genls_asent, genls_asents );
      }
      cdolist_list_var = cdolist_list_var.rest();
      genl = cdolist_list_var.first();
    }
    return Sequences.nreverse( genls_asents );
  }

  public static SubLObject declare_collection_intersection_file()
  {
    SubLFiles.declareFunction( me, "cyc_collection_intersection_after_adding", "CYC-COLLECTION-INTERSECTION-AFTER-ADDING", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_collection_intersection_2_after_adding", "CYC-COLLECTION-INTERSECTION-2-AFTER-ADDING", 2, 0, false );
    SubLFiles.declareFunction( me, "possibly_add_collection_intersection_nart", "POSSIBLY-ADD-COLLECTION-INTERSECTION-NART", 1, 0, false );
    SubLFiles.declareFunction( me, "add_collection_intersection_nart", "ADD-COLLECTION-INTERSECTION-NART", 1, 0, false );
    SubLFiles.declareFunction( me, "add_collection_intersection_nart_genls_links", "ADD-COLLECTION-INTERSECTION-NART-GENLS-LINKS", 1, 0, false );
    SubLFiles.declareFunction( me, "add_collection_intersection_nart_specs_links", "ADD-COLLECTION-INTERSECTION-NART-SPECS-LINKS", 1, 0, false );
    SubLFiles.declareFunction( me, "add_collection_intersection_nart_genls_links_int", "ADD-COLLECTION-INTERSECTION-NART-GENLS-LINKS-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "compute_mt_specific_justification_for_collection_intersection_genls_asent", "COMPUTE-MT-SPECIFIC-JUSTIFICATION-FOR-COLLECTION-INTERSECTION-GENLS-ASENT", 2, 0, false );
    SubLFiles.declareFunction( me, "compute_more_supports_for_collection_intersection_genls_asent", "COMPUTE-MORE-SUPPORTS-FOR-COLLECTION-INTERSECTION-GENLS-ASENT", 1, 0, false );
    SubLFiles.declareFunction( me, "compute_mt_placement_for_collection_intersection_genls_justified_asents", "COMPUTE-MT-PLACEMENT-FOR-COLLECTION-INTERSECTION-GENLS-JUSTIFIED-ASENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "minimize_genls_hl_supports", "MINIMIZE-GENLS-HL-SUPPORTS", 1, 0, false );
    SubLFiles.declareFunction( me, "max_floor_mts_of_genls_justification", "MAX-FLOOR-MTS-OF-GENLS-JUSTIFICATION", 1, 0, false );
    SubLFiles.declareFunction( me, "assert_collection_intersection_genls_link", "ASSERT-COLLECTION-INTERSECTION-GENLS-LINK", 3, 0, false );
    SubLFiles.declareFunction( me, "genls_collection_intersection_after_adding_int", "GENLS-COLLECTION-INTERSECTION-AFTER-ADDING-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "consider_all_combinations_for_genls_collection_intersection", "CONSIDER-ALL-COMBINATIONS-FOR-GENLS-COLLECTION-INTERSECTION", 2, 3, false );
    SubLFiles.declareFunction( me, "consider_all_genl_narts_for_genls_collection_intersection", "CONSIDER-ALL-GENL-NARTS-FOR-GENLS-COLLECTION-INTERSECTION", 4, 0, false );
    SubLFiles.declareFunction( me, "collection_intersection_genls_sweep_part_1", "COLLECTION-INTERSECTION-GENLS-SWEEP-PART-1", 0, 1, false );
    SubLFiles.declareFunction( me, "collection_intersection_genls_sweep_part_2", "COLLECTION-INTERSECTION-GENLS-SWEEP-PART-2", 0, 1, false );
    SubLFiles.declareFunction( me, "collection_intersection_genls_sweep_by_query", "COLLECTION-INTERSECTION-GENLS-SWEEP-BY-QUERY", 1, 1, false );
    SubLFiles.declareFunction( me, "collection_intersection_nat_max_proper_genls", "COLLECTION-INTERSECTION-NAT-MAX-PROPER-GENLS", 1, 0, false );
    SubLFiles.declareFunction( me, "collection_intersection_nat_proper_genls", "COLLECTION-INTERSECTION-NAT-PROPER-GENLS", 1, 1, false );
    SubLFiles.declareFunction( me, "collection_intersection_nat_max_proper_specs", "COLLECTION-INTERSECTION-NAT-MAX-PROPER-SPECS", 1, 0, false );
    SubLFiles.declareFunction( me, "collection_intersection_nat_proper_specs", "COLLECTION-INTERSECTION-NAT-PROPER-SPECS", 1, 1, false );
    SubLFiles.declareFunction( me, "collection_intersection_narts_with_constituent_collection", "COLLECTION-INTERSECTION-NARTS-WITH-CONSTITUENT-COLLECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "collection_intersection_2_fn_narts_with_constituent_collection", "COLLECTION-INTERSECTION-2-FN-NARTS-WITH-CONSTITUENT-COLLECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "collection_intersection_fn_narts_with_constituent_collection", "COLLECTION-INTERSECTION-FN-NARTS-WITH-CONSTITUENT-COLLECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "fully_bound_collection_intersection_nat_p", "FULLY-BOUND-COLLECTION-INTERSECTION-NAT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "collection_intersection_nart_p", "COLLECTION-INTERSECTION-NART-P", 1, 0, false );
    SubLFiles.declareFunction( me, "fully_bound_collection_intersection_nat_formula_p", "FULLY-BOUND-COLLECTION-INTERSECTION-NAT-FORMULA-P", 1, 0, false );
    SubLFiles.declareFunction( me, "collection_intersection_nat_collections", "COLLECTION-INTERSECTION-NAT-COLLECTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "term_constituent_collections", "TERM-CONSTITUENT-COLLECTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "genls_collection_intersection_fn_collection_intersection_fn_pos_check_in_any_mt", "GENLS-COLLECTION-INTERSECTION-FN-COLLECTION-INTERSECTION-FN-POS-CHECK-IN-ANY-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "genls_collection_intersection_fn_collection_intersection_fn_pos_check", "GENLS-COLLECTION-INTERSECTION-FN-COLLECTION-INTERSECTION-FN-POS-CHECK", 2, 0, false );
    SubLFiles.declareFunction( me, "genls_collection_intersection_fn_pos_check", "GENLS-COLLECTION-INTERSECTION-FN-POS-CHECK", 2, 0, false );
    SubLFiles.declareFunction( me, "collection_intersection_genls_rule_support", "COLLECTION-INTERSECTION-GENLS-RULE-SUPPORT", 0, 0, false );
    SubLFiles.declareFunction( me, "collection_intersection_specs_rule_support", "COLLECTION-INTERSECTION-SPECS-RULE-SUPPORT", 0, 0, false );
    SubLFiles.declareFunction( me, "justify_collection_intersection_genls_narts", "JUSTIFY-COLLECTION-INTERSECTION-GENLS-NARTS", 2, 1, false );
    SubLFiles.declareFunction( me, "justify_collection_intersection_specs", "JUSTIFY-COLLECTION-INTERSECTION-SPECS", 2, 1, false );
    SubLFiles.declareFunction( me, "justify_collection_intersection_genls_link_in_any_mt", "JUSTIFY-COLLECTION-INTERSECTION-GENLS-LINK-IN-ANY-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "justify_collection_intersection_genls_asent", "JUSTIFY-COLLECTION-INTERSECTION-GENLS-ASENT", 1, 0, false );
    SubLFiles.declareFunction( me, "why_genls_collection_intersection_fn", "WHY-GENLS-COLLECTION-INTERSECTION-FN", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_collection_intersection_file()
  {
    $collection_intersection_genls_support_enabledP$ = SubLFiles.defparameter( "*COLLECTION-INTERSECTION-GENLS-SUPPORT-ENABLED?*", NIL );
    $nart_indexing_bug_workaround_enabledP$ = SubLFiles.deflexical( "*NART-INDEXING-BUG-WORKAROUND-ENABLED?*", NIL );
    $collection_intersection_defining_mt$ = SubLFiles.deflexical( "*COLLECTION-INTERSECTION-DEFINING-MT*", $const25$UniversalVocabularyMt );
    $collection_intersection_genls_rule$ = SubLFiles.deflexical( "*COLLECTION-INTERSECTION-GENLS-RULE*", $list33 );
    $collection_intersection_specs_rule$ = SubLFiles.deflexical( "*COLLECTION-INTERSECTION-SPECS-RULE*", $list34 );
    return NIL;
  }

  public static SubLObject setup_collection_intersection_file()
  {
    utilities_macros.register_kb_function( $sym0$CYC_COLLECTION_INTERSECTION_AFTER_ADDING );
    utilities_macros.register_kb_function( $sym1$CYC_COLLECTION_INTERSECTION_2_AFTER_ADDING );
    utilities_macros.note_funcall_helper_function( $sym29$FULLY_BOUND_COLLECTION_INTERSECTION_NAT_P );
    utilities_macros.note_funcall_helper_function( $sym30$COLLECTION_INTERSECTION_NART_P );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_collection_intersection_file();
  }

  @Override
  public void initializeVariables()
  {
    init_collection_intersection_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_collection_intersection_file();
  }
  static
  {
    me = new collection_intersection();
    $collection_intersection_genls_support_enabledP$ = null;
    $nart_indexing_bug_workaround_enabledP$ = null;
    $collection_intersection_defining_mt$ = null;
    $collection_intersection_genls_rule$ = null;
    $collection_intersection_specs_rule$ = null;
    $sym0$CYC_COLLECTION_INTERSECTION_AFTER_ADDING = makeSymbol( "CYC-COLLECTION-INTERSECTION-AFTER-ADDING" );
    $sym1$CYC_COLLECTION_INTERSECTION_2_AFTER_ADDING = makeSymbol( "CYC-COLLECTION-INTERSECTION-2-AFTER-ADDING" );
    $const2$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $list3 = ConsesLow.list( makeSymbol( "HL-MODULE" ), makeSymbol( "ASENT" ), makeSymbol( "MT" ), makeSymbol( "TV" ) );
    $kw4$CODE = makeKeyword( "CODE" );
    $const5$collectionIntersection = constant_handles.reader_make_constant_shell( makeString( "collectionIntersection" ) );
    $list6 = ConsesLow.cons( makeSymbol( "ASENT" ), makeSymbol( "ANY-MT-JUSTIFICATION" ) );
    $kw7$GENLS = makeKeyword( "GENLS" );
    $kw8$FORWARD = makeKeyword( "FORWARD" );
    $str9$Computing___genls_between_collect = makeString( "Computing #$genls between collection intersection narts..." );
    $str10$cdolist = makeString( "cdolist" );
    $const11$CollectionIntersectionFn = constant_handles.reader_make_constant_shell( makeString( "CollectionIntersectionFn" ) );
    $sym12$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ = makeSymbol( "*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*" );
    $list13 = ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*" ), NIL );
    $sym14$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $sym15$CSETQ = makeSymbol( "CSETQ" );
    $str16$_A = makeString( "~A" );
    $sym17$VALID_NART_ = makeSymbol( "VALID-NART?" );
    $sym18$GAF_ARG1 = makeSymbol( "GAF-ARG1" );
    $const19$CollectionIntersection2Fn = constant_handles.reader_make_constant_shell( makeString( "CollectionIntersection2Fn" ) );
    $sym20$_NART = makeSymbol( "?NART" );
    $str21$_s_did_not_contain_a_variable_nam = makeString( "~s did not contain a variable named ?NART" );
    $const22$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $list23 = ConsesLow.list( makeKeyword( "ANSWER-LANGUAGE" ), makeKeyword( "HL" ) );
    $str24$Found__a_narts_for_a_total_of__a_ = makeString( "Found ~a narts for a total of ~a pairs.~%" );
    $const25$UniversalVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) );
    $kw26$GAF = makeKeyword( "GAF" );
    $kw27$TRUE = makeKeyword( "TRUE" );
    $const28$termOfUnit = constant_handles.reader_make_constant_shell( makeString( "termOfUnit" ) );
    $sym29$FULLY_BOUND_COLLECTION_INTERSECTION_NAT_P = makeSymbol( "FULLY-BOUND-COLLECTION-INTERSECTION-NAT-P" );
    $sym30$COLLECTION_INTERSECTION_NART_P = makeSymbol( "COLLECTION-INTERSECTION-NART-P" );
    $str31$Unexpected_collection_intersectio = makeString( "Unexpected collection intersection nat ~s" );
    $sym32$RELEVANT_MT_IS_ANY_MT = makeSymbol( "RELEVANT-MT-IS-ANY-MT" );
    $list33 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "collectionIntersection" ) ), makeSymbol( "?SPEC" ), makeSymbol( "?SPEC-CONSTITUENT-COLS" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
            "collectionIntersection" ) ), makeSymbol( "?GENL" ), makeSymbol( "?GENL-CONSTITUENT-COLS" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "forAll" ) ), makeSymbol(
                "?GENL-CONSTIT-COL" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "elementOf" ) ),
                    makeSymbol( "?GENL-CONSTIT-COL" ), makeSymbol( "?GENL-CONSTITUENT-COLS" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ), makeSymbol(
                        "?SPEC-CONSTIT-COL" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "elementOf" ) ),
                            makeSymbol( "?SPEC-CONSTIT-COL" ), makeSymbol( "?SPEC-CONSTITUENT-COLS" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ), makeSymbol(
                                "?SPEC-CONSTIT-COL" ), makeSymbol( "?GENL-CONSTIT-COL" ) ) ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ), makeSymbol( "?SPEC" ),
                                    makeSymbol( "?GENL" ) ) );
    $list34 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "collectionIntersection" ) ), makeSymbol( "?GENL" ), makeSymbol( "?GENL-CONSTITUENT-COLS" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
            "isa" ) ), makeSymbol( "?SPEC" ), constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "forAll" ) ),
                makeSymbol( "?GENL-CONSTIT-COL" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                    "elementOf" ) ), makeSymbol( "?GENL-CONSTIT-COL" ), makeSymbol( "?GENL-CONSTITUENT-COLS" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ), makeSymbol(
                        "?SPEC" ), makeSymbol( "?GENL-CONSTIT-COL" ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ), makeSymbol( "?SPEC" ), makeSymbol( "?GENL" ) ) );
    $kw35$TRUE_MON = makeKeyword( "TRUE-MON" );
    $const36$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $sym37$JUSTIFY_COLLECTION_INTERSECTION_GENLS_ASENT = makeSymbol( "JUSTIFY-COLLECTION-INTERSECTION-GENLS-ASENT" );
  }
}
/*
 *
 * Total time: 429 ms
 *
 */