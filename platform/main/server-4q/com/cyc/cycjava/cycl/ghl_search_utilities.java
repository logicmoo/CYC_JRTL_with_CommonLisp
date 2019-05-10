package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_tva_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class ghl_search_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.ghl_search_utilities";
  public static final String myFingerPrint = "73841efc4c29225ce49dcc5e559d81fe3a50b4ec29822e9d63d0a2b87f5c35a9";
  private static final SubLSymbol $kw0$ISA;
  private static final SubLObject $const1$isa;
  private static final SubLList $list2;
  private static final SubLSymbol $kw3$GAF;
  private static final SubLObject $const4$ReflexiveBinaryPredicate;

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-utilities.lisp", position = 855L)
  public static SubLObject ghl_table_p(final SubLObject obj)
  {
    return Types.hash_table_p( obj );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-utilities.lisp", position = 926L)
  public static SubLObject ghl_goal_nodeP(final SubLObject v_search, final SubLObject node, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQUAL );
    }
    if( NIL != list_utilities.sublisp_boolean( ghl_search_vars.ghl_goal_fn( v_search ) ) )
    {
      return Functions.funcall( ghl_search_vars.ghl_goal_fn( v_search ), v_search, node );
    }
    if( ghl_search_vars.ghl_goal( v_search ).isList() )
    {
      return subl_promotions.memberP( node, ghl_search_vars.ghl_goal( v_search ), test, UNPROVIDED );
    }
    return Functions.funcall( test, ghl_search_vars.ghl_goal( v_search ), node );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-utilities.lisp", position = 1286L)
  public static SubLObject ghl_goal_or_marked_as_goalP(final SubLObject v_search, final SubLObject node, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQUAL );
    }
    if( NIL != ghl_table_p( ghl_search_vars.ghl_goal_space( v_search ) ) && NIL != ghl_marking_utilities.ghl_node_marked_in_space_p( node, ghl_search_vars.ghl_goal_space( v_search ) ) )
    {
      return T;
    }
    if( NIL != ghl_graph_utilities.ghl_node_p( ghl_search_vars.ghl_goal( v_search ) ) )
    {
      return Functions.funcall( test, ghl_search_vars.ghl_goal( v_search ), node );
    }
    if( ghl_search_vars.ghl_goal( v_search ).isList() )
    {
      return subl_promotions.memberP( node, ghl_search_vars.ghl_goal( v_search ), test, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-utilities.lisp", position = 1741L)
  public static SubLObject ghl_node_satisfies_pred_arg_typeP(final SubLObject pred, final SubLObject node)
  {
    if( NIL != sbhl_module_utilities.sbhl_predicate_p( pred ) )
    {
      return sbhl_module_utilities.sbhl_node_has_type_associated_to_predicate_p( node, sbhl_module_vars.get_sbhl_module( pred ) );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-utilities.lisp", position = 1961L)
  public static SubLObject ghl_inverse_cardinality(final SubLObject pred, final SubLObject node)
  {
    final SubLObject kb_cardinality = ( NIL != sbhl_module_utilities.sbhl_predicate_p( pred ) ) ? sbhl_module_utilities.sbhl_inverse_cardinality( sbhl_module_vars.get_sbhl_module( pred ), node )
        : cardinality_estimates.gt_inverse_cardinality( pred, node );
    SubLObject sksi_cardinality = ZERO_INTEGER;
    if( NIL != sksi_tva_utilities.sksi_transitivity_possibleP() )
    {
      sksi_cardinality = sksi_tva_utilities.sksi_inverse_cardinality( pred, node, UNPROVIDED );
    }
    return Numbers.add( kb_cardinality, sksi_cardinality );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-utilities.lisp", position = 2414L)
  public static SubLObject ghl_predicate_cardinality(final SubLObject pred, final SubLObject node)
  {
    final SubLObject kb_cardinality = ( NIL != sbhl_module_utilities.sbhl_predicate_p( pred ) ) ? sbhl_module_utilities.sbhl_predicate_cardinality( sbhl_module_vars.get_sbhl_module( pred ), node )
        : cardinality_estimates.gt_predicate_cardinality( pred, node );
    SubLObject sksi_cardinality = ZERO_INTEGER;
    if( NIL != sksi_tva_utilities.sksi_transitivity_possibleP() )
    {
      sksi_cardinality = sksi_tva_utilities.sksi_predicate_cardinality( pred, node, UNPROVIDED );
    }
    return Numbers.add( kb_cardinality, sksi_cardinality );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-utilities.lisp", position = 2854L)
  public static SubLObject ghl_resolve_goal_found(final SubLObject v_search, final SubLObject node)
  {
    if( NIL == ghl_search_vars.ghl_compute_justifyP( v_search ) )
    {
      ghl_search_vars.ghl_set_result( v_search, node );
    }
    ghl_search_vars.set_ghl_goal_found_p( v_search, T );
    graphl_graph_utilities.$graphl_finishedP$.setDynamicValue( T );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-utilities.lisp", position = 3106L)
  public static SubLObject ghl_add_gt_assertion_to_result(final SubLObject v_search, final SubLObject assertion)
  {
    ghl_search_vars.ghl_add_to_result( v_search, assertion, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-utilities.lisp", position = 3248L)
  public static SubLObject ghl_add_sbhl_assertion_to_result(final SubLObject v_search, final SubLObject pred, final SubLObject node, final SubLObject link_node, final SubLObject direction, final SubLObject mt)
  {
    SubLObject formula = NIL;
    SubLObject result = NIL;
    if( NIL != ghl_search_vars.ghl_forward_direction_p( direction ) )
    {
      formula = ConsesLow.list( pred, node, link_node );
    }
    else
    {
      formula = ConsesLow.list( pred, link_node, node );
    }
    result = kb_indexing.find_gaf( formula, mt );
    if( NIL != result )
    {
      ghl_search_vars.ghl_add_to_result( v_search, result, UNPROVIDED );
      return NIL;
    }
    if( NIL == sbhl_module_utilities.sbhl_module_directed_linksP( sbhl_module_vars.get_sbhl_module( pred ) ) )
    {
      if( NIL != ghl_search_vars.ghl_forward_direction_p( direction ) )
      {
        result = kb_indexing.find_gaf( ConsesLow.list( pred, link_node, node ), mt );
      }
      else
      {
        result = kb_indexing.find_gaf( ConsesLow.list( pred, node, link_node ), mt );
      }
      if( NIL != result )
      {
        ghl_search_vars.ghl_add_to_result( v_search, result, UNPROVIDED );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-utilities.lisp", position = 3931L)
  public static SubLObject ghl_add_reflexivity_justification(final SubLObject v_search, final SubLObject node, final SubLObject reflexive_assertion)
  {
    final SubLObject reflexive_just = ConsesLow.list( reflexive_assertion, arguments.make_hl_support( $kw0$ISA, ConsesLow.listS( $const1$isa, assertions_high.gaf_predicate( reflexive_assertion ), $list2 ), UNPROVIDED,
        UNPROVIDED ) );
    ghl_search_vars.ghl_append_to_result( v_search, reflexive_just );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ghl-search-utilities.lisp", position = 4259L)
  public static SubLObject ghl_node_admitted_by_some_reflexive_gaf(final SubLObject v_search, final SubLObject node)
  {
    SubLObject reflexiveP = NIL;
    SubLObject pred_var = NIL;
    if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( node, ONE_INTEGER, pred_var ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( node, ONE_INTEGER, pred_var );
      SubLObject done_var = reflexiveP;
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
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw3$GAF, NIL, NIL );
            SubLObject done_var_$1 = reflexiveP;
            final SubLObject token_var_$2 = NIL;
            while ( NIL == done_var_$1)
            {
              final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$2 );
              final SubLObject valid_$3 = makeBoolean( !token_var_$2.eql( assertion ) );
              if( NIL != valid_$3 )
              {
                final SubLObject pred = assertions_high.gaf_predicate( assertion );
                if( NIL != mt_relevance_macros.relevant_mtP( assertions_high.assertion_mt( assertion ) ) && NIL != ghl_search_vars.ghl_relevant_predP( v_search, pred ) && NIL != isa.isaP( pred,
                    $const4$ReflexiveBinaryPredicate, UNPROVIDED, UNPROVIDED ) )
                {
                  reflexiveP = assertion;
                }
              }
              done_var_$1 = makeBoolean( NIL == valid_$3 || NIL != reflexiveP );
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
        done_var = makeBoolean( NIL == valid || NIL != reflexiveP );
      }
    }
    pred_var = NIL;
    if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( node, TWO_INTEGER, pred_var ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( node, TWO_INTEGER, pred_var );
      SubLObject done_var = reflexiveP;
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
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw3$GAF, NIL, NIL );
            SubLObject done_var_$2 = reflexiveP;
            final SubLObject token_var_$3 = NIL;
            while ( NIL == done_var_$2)
            {
              final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$3 );
              final SubLObject valid_$4 = makeBoolean( !token_var_$3.eql( assertion ) );
              if( NIL != valid_$4 )
              {
                final SubLObject pred = assertions_high.gaf_predicate( assertion );
                if( NIL != mt_relevance_macros.relevant_mtP( assertions_high.assertion_mt( assertion ) ) && NIL != ghl_search_vars.ghl_relevant_predP( v_search, pred ) && NIL != isa.isaP( pred,
                    $const4$ReflexiveBinaryPredicate, UNPROVIDED, UNPROVIDED ) )
                {
                  reflexiveP = assertion;
                }
              }
              done_var_$2 = makeBoolean( NIL == valid_$4 || NIL != reflexiveP );
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
        done_var = makeBoolean( NIL == valid || NIL != reflexiveP );
      }
    }
    return reflexiveP;
  }

  public static SubLObject declare_ghl_search_utilities_file()
  {
    SubLFiles.declareFunction( me, "ghl_table_p", "GHL-TABLE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "ghl_goal_nodeP", "GHL-GOAL-NODE?", 2, 1, false );
    SubLFiles.declareFunction( me, "ghl_goal_or_marked_as_goalP", "GHL-GOAL-OR-MARKED-AS-GOAL?", 2, 1, false );
    SubLFiles.declareFunction( me, "ghl_node_satisfies_pred_arg_typeP", "GHL-NODE-SATISFIES-PRED-ARG-TYPE?", 2, 0, false );
    SubLFiles.declareFunction( me, "ghl_inverse_cardinality", "GHL-INVERSE-CARDINALITY", 2, 0, false );
    SubLFiles.declareFunction( me, "ghl_predicate_cardinality", "GHL-PREDICATE-CARDINALITY", 2, 0, false );
    SubLFiles.declareFunction( me, "ghl_resolve_goal_found", "GHL-RESOLVE-GOAL-FOUND", 2, 0, false );
    SubLFiles.declareFunction( me, "ghl_add_gt_assertion_to_result", "GHL-ADD-GT-ASSERTION-TO-RESULT", 2, 0, false );
    SubLFiles.declareFunction( me, "ghl_add_sbhl_assertion_to_result", "GHL-ADD-SBHL-ASSERTION-TO-RESULT", 6, 0, false );
    SubLFiles.declareFunction( me, "ghl_add_reflexivity_justification", "GHL-ADD-REFLEXIVITY-JUSTIFICATION", 3, 0, false );
    SubLFiles.declareFunction( me, "ghl_node_admitted_by_some_reflexive_gaf", "GHL-NODE-ADMITTED-BY-SOME-REFLEXIVE-GAF", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_ghl_search_utilities_file()
  {
    return NIL;
  }

  public static SubLObject setup_ghl_search_utilities_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_ghl_search_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_ghl_search_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_ghl_search_utilities_file();
  }
  static
  {
    me = new ghl_search_utilities();
    $kw0$ISA = makeKeyword( "ISA" );
    $const1$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $list2 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ReflexiveBinaryPredicate" ) ) );
    $kw3$GAF = makeKeyword( "GAF" );
    $const4$ReflexiveBinaryPredicate = constant_handles.reader_make_constant_shell( makeString( "ReflexiveBinaryPredicate" ) );
  }
}
/*
 * 
 * Total time: 130 ms
 * 
 */