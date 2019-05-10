package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class similarity
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.similarity";
  public static final String myFingerPrint = "44eef388647cb7349a3dca02bdfe9c7a59ca574ac839275864555246870e1abd";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 452L)
  public static SubLSymbol $similarity_relation_hash$;
  private static final SubLInteger $int0$512;
  private static final SubLSymbol $kw1$ASSERTED;
  private static final SubLSymbol $sym2$ASSERTED_ASSERTION_;
  private static final SubLSymbol $kw3$BASIS;
  private static final SubLSymbol $sym4$GENERALITY_ESTIMATE_;
  private static final SubLSymbol $kw5$IMPLIED;
  private static final SubLInteger $int6$64;
  private static final SubLSymbol $sym7$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const8$EverythingPSC;
  private static final SubLSymbol $kw9$TRUE;
  private static final SubLSymbol $sym10$RELEVANT_MT_IS_EQ;
  private static final SubLSymbol $kw11$GAF;
  private static final SubLList $list12;
  private static final SubLObject $const13$isa;
  private static final SubLObject $const14$genls;
  private static final SubLObject $const15$genlPreds;
  private static final SubLObject $const16$genlMt;
  private static final SubLSymbol $sym17$ST_NODE_WITH_NUMBER_;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1261L)
  public static SubLObject sim_add_relation(final SubLObject nodepair, final SubLObject relation)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    hash_table_utilities.pushnew_hash( nodepair, relation, $similarity_relation_hash$.getDynamicValue( thread ), UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1996L)
  public static SubLObject sim_get_relations(final SubLObject nodepair)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Hashtables.gethash( nodepair, $similarity_relation_hash$.getDynamicValue( thread ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2538L)
  public static SubLObject sim_check_relation(final SubLObject nodepair, final SubLObject relation)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject relation_list = Hashtables.gethash( nodepair, $similarity_relation_hash$.getDynamicValue( thread ), UNPROVIDED );
    return subl_promotions.memberP( relation, relation_list, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3320L)
  public static SubLObject make_similarity_tree(final SubLObject cols, final SubLObject pred, final SubLObject mt)
  {
    SubLObject superiors_list = NIL;
    SubLObject cdolist_list_var = cols;
    SubLObject c = NIL;
    c = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$1;
      final SubLObject assertion_list = cdolist_list_var_$1 = pred_term_gafs( c, pred, mt, UNPROVIDED, UNPROVIDED );
      SubLObject assertion = NIL;
      assertion = cdolist_list_var_$1.first();
      while ( NIL != cdolist_list_var_$1)
      {
        final SubLObject item_var = assertions_high.gaf_arg2( assertion );
        if( NIL == conses_high.member( item_var, superiors_list, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          superiors_list = ConsesLow.cons( item_var, superiors_list );
        }
        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
        assertion = cdolist_list_var_$1.first();
      }
      SubLObject cdolist_list_var_$2 = list_utilities.remove_if_not( Symbols.symbol_function( $sym2$ASSERTED_ASSERTION_ ), assertion_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      assertion = NIL;
      assertion = cdolist_list_var_$2.first();
      while ( NIL != cdolist_list_var_$2)
      {
        sim_add_relation( ConsesLow.list( c, assertions_high.gaf_arg2( assertion ) ), $kw1$ASSERTED );
        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
        assertion = cdolist_list_var_$2.first();
      }
      SubLObject cdolist_list_var_$3 = st_find_basis_cols( c, pred, mt );
      SubLObject col = NIL;
      col = cdolist_list_var_$3.first();
      while ( NIL != cdolist_list_var_$3)
      {
        sim_add_relation( ConsesLow.list( c, col ), $kw3$BASIS );
        cdolist_list_var_$3 = cdolist_list_var_$3.rest();
        col = cdolist_list_var_$3.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      c = cdolist_list_var.first();
    }
    final SubLObject simtree = Sequences.nreverse( make_relation_tree( Sort.sort( superiors_list, Symbols.symbol_function( $sym4$GENERALITY_ESTIMATE_ ), UNPROVIDED ), mt, UNPROVIDED ) );
    SubLObject cdolist_list_var2 = edge_list_nodes( simtree );
    SubLObject n = NIL;
    n = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      SubLObject cdolist_list_var_$4 = cols;
      SubLObject c2 = NIL;
      c2 = cdolist_list_var_$4.first();
      while ( NIL != cdolist_list_var_$4)
      {
        if( NIL != st_check_implied( c2, n, pred, mt ) )
        {
          sim_add_relation( ConsesLow.list( c2, n ), $kw5$IMPLIED );
        }
        cdolist_list_var_$4 = cdolist_list_var_$4.rest();
        c2 = cdolist_list_var_$4.first();
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      n = cdolist_list_var2.first();
    }
    return simtree;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5423L)
  public static SubLObject make_relation_tree(final SubLObject cols, SubLObject mt, SubLObject recurse_entry)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( recurse_entry == UNPROVIDED )
    {
      recurse_entry = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == cols )
    {
      return NIL;
    }
    SubLObject edge_list = NIL;
    SubLObject reprocess_list = NIL;
    final SubLObject col_queue = Hashtables.make_hash_table( $int6$64, UNPROVIDED, UNPROVIDED );
    final SubLObject first_col = cols.first();
    final SubLObject col_more = cols.rest();
    SubLObject index_end = ZERO_INTEGER;
    SubLObject doneP = NIL;
    if( NIL == recurse_entry && ONE_INTEGER.equal( Sequences.length( cols ) ) )
    {
      edge_list = ConsesLow.cons( ConsesLow.list( first_col, first_col ), edge_list );
    }
    SubLObject cdolist_list_var = col_more;
    SubLObject this_col = NIL;
    this_col = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      Hashtables.sethash( index_end, col_queue, this_col );
      index_end = Numbers.add( index_end, ONE_INTEGER );
      reprocess_list = ConsesLow.cons( this_col, reprocess_list );
      cdolist_list_var = cdolist_list_var.rest();
      this_col = cdolist_list_var.first();
    }
    SubLObject count = NIL;
    count = ZERO_INTEGER;
    while ( NIL == doneP)
    {
      this_col = Hashtables.gethash( count, col_queue, UNPROVIDED );
      if( NIL == this_col )
      {
        doneP = T;
      }
      else
      {
        SubLObject ceiling_cols = NIL;
        if( NIL == mt )
        {
          final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$relevant_mt_function$.bind( $sym7$RELEVANT_MT_IS_EVERYTHING, thread );
            mt_relevance_macros.$mt$.bind( $const8$EverythingPSC, thread );
            ceiling_cols = genls.min_ceiling_cols( ConsesLow.list( first_col, this_col ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          finally
          {
            mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
          }
        }
        else
        {
          ceiling_cols = genls.min_ceiling_cols( ConsesLow.list( first_col, this_col ), NIL, mt, UNPROVIDED );
        }
        SubLObject cdolist_list_var2 = ceiling_cols;
        SubLObject ceiling_col = NIL;
        ceiling_col = cdolist_list_var2.first();
        while ( NIL != cdolist_list_var2)
        {
          if( ceiling_col.equal( first_col ) )
          {
            edge_list = ConsesLow.cons( ConsesLow.list( first_col, this_col ), edge_list );
          }
          else if( ceiling_col.equal( this_col ) )
          {
            edge_list = ConsesLow.cons( ConsesLow.list( this_col, first_col ), edge_list );
          }
          else if( NIL == subl_promotions.memberP( ceiling_col, reprocess_list, UNPROVIDED, UNPROVIDED ) )
          {
            edge_list = ConsesLow.cons( ConsesLow.list( ceiling_col, first_col ), edge_list );
            edge_list = ConsesLow.cons( ConsesLow.list( ceiling_col, this_col ), edge_list );
            Hashtables.sethash( index_end, col_queue, ceiling_col );
            index_end = Numbers.add( index_end, ONE_INTEGER );
            reprocess_list = ConsesLow.cons( ceiling_col, reprocess_list );
          }
          cdolist_list_var2 = cdolist_list_var2.rest();
          ceiling_col = cdolist_list_var2.first();
        }
      }
      count = Numbers.add( count, ONE_INTEGER );
    }
    return edge_list_remove_redundant( conses_high.union( edge_list, make_relation_tree( Sequences.nreverse( reprocess_list ), mt, T ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8745L)
  public static SubLObject pred_term_gafs(final SubLObject v_term, final SubLObject pred, final SubLObject mt, SubLObject index_arg, SubLObject truth)
  {
    if( index_arg == UNPROVIDED )
    {
      index_arg = ONE_INTEGER;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw9$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject assertion_list = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym10$RELEVANT_MT_IS_EQ, thread );
      mt_relevance_macros.$mt$.bind( mt, thread );
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( v_term, index_arg, pred ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( v_term, index_arg, pred );
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
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw11$GAF, truth, NIL );
              SubLObject done_var_$5 = NIL;
              final SubLObject token_var_$6 = NIL;
              while ( NIL == done_var_$5)
              {
                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$6 );
                final SubLObject valid_$7 = makeBoolean( !token_var_$6.eql( assertion ) );
                if( NIL != valid_$7 )
                {
                  final SubLObject item_var = assertion;
                  if( NIL == conses_high.member( item_var, assertion_list, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                  {
                    assertion_list = ConsesLow.cons( item_var, assertion_list );
                  }
                }
                done_var_$5 = makeBoolean( NIL == valid_$7 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$8, thread );
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
    return assertion_list;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9722L)
  public static SubLObject find_relevant_mts(final SubLObject constants, final SubLObject pred)
  {
    SubLObject mts = NIL;
    SubLObject cdolist_list_var = constants;
    SubLObject c = NIL;
    c = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      mts = ConsesLow.append( mts, kb_accessors.pred_mts( c, pred, $list12 ) );
      cdolist_list_var = cdolist_list_var.rest();
      c = cdolist_list_var.first();
    }
    return Sequences.nreverse( Sort.sort( Sequences.remove_duplicates( mts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), Symbols.symbol_function( $sym4$GENERALITY_ESTIMATE_ ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10555L)
  public static SubLObject st_find_basis_cols(final SubLObject v_term, final SubLObject pred, final SubLObject mt)
  {
    if( pred.equal( $const13$isa ) || NIL != genl_predicates.genl_predicateP( pred, $const13$isa, mt, UNPROVIDED ) )
    {
      return isa.min_isa( v_term, mt, UNPROVIDED );
    }
    if( pred.equal( $const14$genls ) || NIL != genl_predicates.genl_predicateP( pred, $const14$genls, mt, UNPROVIDED ) )
    {
      return genls.min_cols( genls.min_genls( v_term, mt, UNPROVIDED ), mt, UNPROVIDED );
    }
    if( pred.equal( $const15$genlPreds ) || NIL != genl_predicates.genl_predicateP( pred, $const15$genlPreds, mt, UNPROVIDED ) )
    {
      return genl_predicates.min_genl_predicates( v_term, mt, UNPROVIDED );
    }
    if( pred.equal( $const16$genlMt ) || NIL != genl_predicates.genl_predicateP( pred, $const16$genlMt, mt, UNPROVIDED ) )
    {
      return genl_mts.min_genl_mts( v_term, mt, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11574L)
  public static SubLObject st_check_implied(final SubLObject v_term, final SubLObject col, final SubLObject pred, final SubLObject mt)
  {
    if( pred.equal( $const13$isa ) || NIL != genl_predicates.genl_predicateP( pred, $const13$isa, mt, UNPROVIDED ) )
    {
      return isa.isaP( v_term, col, mt, UNPROVIDED );
    }
    if( pred.equal( $const14$genls ) || NIL != genl_predicates.genl_predicateP( pred, $const14$genls, mt, UNPROVIDED ) )
    {
      return genls.genlsP( v_term, col, mt, UNPROVIDED );
    }
    if( pred.equal( $const15$genlPreds ) || NIL != genl_predicates.genl_predicateP( pred, $const15$genlPreds, mt, UNPROVIDED ) )
    {
      return genl_predicates.genl_predP( v_term, col, mt, UNPROVIDED );
    }
    if( pred.equal( $const16$genlMt ) || NIL != genl_predicates.genl_predicateP( pred, $const16$genlMt, mt, UNPROVIDED ) )
    {
      return genl_mts.genl_mtP( v_term, col, mt, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12573L)
  public static SubLObject st_order_nodes_in_dag(final SubLObject edge_list, SubLObject node, SubLObject indent, SubLObject node_numbering, SubLObject forward_links)
  {
    if( node == UNPROVIDED )
    {
      node = NIL;
    }
    if( indent == UNPROVIDED )
    {
      indent = ZERO_INTEGER;
    }
    if( node_numbering == UNPROVIDED )
    {
      node_numbering = NIL;
    }
    if( forward_links == UNPROVIDED )
    {
      forward_links = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == node )
    {
      node = edge_list_roots( edge_list ).first();
    }
    if( NIL == node_numbering )
    {
      node_numbering = st_number_edge_list_nodes( edge_list, node );
    }
    SubLObject node_ordering = NIL;
    final SubLObject children = st_node_number_sort( edge_list_node_children( edge_list, node ), node_numbering );
    node_ordering = ConsesLow.cons( ConsesLow.list( node, indent ), node_ordering );
    SubLObject cdolist_list_var = children;
    SubLObject child = NIL;
    child = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( !node.equal( child ) )
      {
        if( NIL != st_has_other_parents( edge_list, node, child, forward_links ) )
        {
          forward_links = ConsesLow.cons( ConsesLow.list( node, child ), forward_links );
        }
        else
        {
          thread.resetMultipleValues();
          final SubLObject child_node_ordering = st_order_nodes_in_dag( edge_list, child, Numbers.add( ONE_INTEGER, indent ), node_numbering, forward_links );
          final SubLObject child_forward_links = thread.secondMultipleValue();
          thread.resetMultipleValues();
          forward_links = conses_high.union( forward_links, child_forward_links, Symbols.symbol_function( EQUAL ), UNPROVIDED );
          node_ordering = ConsesLow.append( node_ordering, child_node_ordering );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      child = cdolist_list_var.first();
    }
    return Values.values( node_ordering, forward_links );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14678L)
  public static SubLObject st_get_node_number(final SubLObject numbering_list, final SubLObject node)
  {
    SubLObject cdolist_list_var = numbering_list;
    SubLObject numbering = NIL;
    numbering = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject this_node = numbering.first();
      final SubLObject this_number = conses_high.second( numbering );
      if( this_node.equal( node ) )
      {
        return this_number;
      }
      cdolist_list_var = cdolist_list_var.rest();
      numbering = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15320L)
  public static SubLObject st_number_edge_list_nodes(final SubLObject edge_list, SubLObject node)
  {
    if( node == UNPROVIDED )
    {
      node = NIL;
    }
    if( NIL == node )
    {
      node = edge_list_roots( edge_list ).first();
    }
    SubLObject numbering_list = NIL;
    SubLObject node_number = ZERO_INTEGER;
    final SubLObject children = edge_list_node_children( edge_list, node );
    if( NIL != children )
    {
      SubLObject cdolist_list_var = children;
      SubLObject child = NIL;
      child = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject child_number = st_get_node_number( numbering_list, child );
        if( NIL == child_number )
        {
          final SubLObject numbering_list_new_and_child_number = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( st_number_edge_list_nodes( edge_list, child ) ) );
          final SubLObject numbering_list_new = numbering_list_new_and_child_number.first();
          numbering_list = conses_high.union( numbering_list, numbering_list_new, Symbols.symbol_function( EQUAL ), UNPROVIDED );
          child_number = conses_high.second( numbering_list_new_and_child_number );
        }
        node_number = Numbers.add( node_number, Numbers.add( ONE_INTEGER, child_number ) );
        cdolist_list_var = cdolist_list_var.rest();
        child = cdolist_list_var.first();
      }
    }
    numbering_list = ConsesLow.cons( ConsesLow.list( node, node_number ), numbering_list );
    return Values.values( numbering_list, node_number );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16675L)
  public static SubLObject st_has_other_parents(final SubLObject edge_list, final SubLObject parent, final SubLObject child, SubLObject forward_links)
  {
    if( forward_links == UNPROVIDED )
    {
      forward_links = NIL;
    }
    return conses_high.set_difference( edge_list_node_parents( edge_list, child ), conses_high.union( ConsesLow.list( parent ), edge_list_node_parents( forward_links, child ), UNPROVIDED, UNPROVIDED ), UNPROVIDED,
        UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17517L)
  public static SubLObject st_node_with_numberL(final SubLObject node1_with_number, final SubLObject node2_with_number)
  {
    final SubLObject node1 = node1_with_number.first();
    final SubLObject node2 = node2_with_number.first();
    final SubLObject number1 = conses_high.second( node1_with_number );
    final SubLObject number2 = conses_high.second( node2_with_number );
    if( number1.numE( number2 ) )
    {
      if( NIL != Strings.stringL( string_utilities.str( node1 ), string_utilities.str( node2 ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        return T;
      }
      return NIL;
    }
    else
    {
      if( number1.numL( number2 ) )
      {
        return T;
      }
      return NIL;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18399L)
  public static SubLObject st_node_number_sort(final SubLObject node_list, final SubLObject node_numbering)
  {
    SubLObject node_with_number_list = NIL;
    SubLObject sorted_node_list = NIL;
    SubLObject cdolist_list_var = node_list;
    SubLObject node = NIL;
    node = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject node_number = st_get_node_number( node_numbering, node );
      node_with_number_list = ConsesLow.cons( ConsesLow.list( node, node_number ), node_with_number_list );
      cdolist_list_var = cdolist_list_var.rest();
      node = cdolist_list_var.first();
    }
    cdolist_list_var = Sort.sort( node_with_number_list, Symbols.symbol_function( $sym17$ST_NODE_WITH_NUMBER_ ), UNPROVIDED );
    SubLObject node_with_number = NIL;
    node_with_number = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sorted_node_list = ConsesLow.cons( node_with_number.first(), sorted_node_list );
      cdolist_list_var = cdolist_list_var.rest();
      node_with_number = cdolist_list_var.first();
    }
    return Sequences.nreverse( sorted_node_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19452L)
  public static SubLObject edge_list_nodes(final SubLObject edge_list)
  {
    SubLObject nodelist = NIL;
    SubLObject cdolist_list_var = edge_list;
    SubLObject edge = NIL;
    edge = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject node1 = edge.first();
      SubLObject item_var;
      final SubLObject node2 = item_var = conses_high.second( edge );
      if( NIL == conses_high.member( item_var, nodelist, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        nodelist = ConsesLow.cons( item_var, nodelist );
      }
      item_var = node1;
      if( NIL == conses_high.member( item_var, nodelist, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        nodelist = ConsesLow.cons( item_var, nodelist );
      }
      cdolist_list_var = cdolist_list_var.rest();
      edge = cdolist_list_var.first();
    }
    return Sequences.nreverse( nodelist );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20106L)
  public static SubLObject edge_list_roots(final SubLObject edge_list)
  {
    SubLObject roots = NIL;
    SubLObject notroots = NIL;
    SubLObject cdolist_list_var = edge_list;
    SubLObject edge = NIL;
    edge = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject parent = edge.first();
      final SubLObject child = conses_high.second( edge );
      roots = ConsesLow.cons( parent, roots );
      if( !parent.equal( child ) )
      {
        notroots = ConsesLow.cons( child, notroots );
      }
      cdolist_list_var = cdolist_list_var.rest();
      edge = cdolist_list_var.first();
    }
    return Sequences.remove_duplicates( conses_high.set_difference( roots, notroots, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20818L)
  public static SubLObject edge_list_leaves(final SubLObject edge_list)
  {
    SubLObject leaves = NIL;
    SubLObject notleaves = NIL;
    SubLObject cdolist_list_var = edge_list;
    SubLObject edge = NIL;
    edge = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject parent = edge.first();
      final SubLObject child = conses_high.second( edge );
      leaves = ConsesLow.cons( child, leaves );
      if( !parent.equal( child ) )
      {
        notleaves = ConsesLow.cons( parent, notleaves );
      }
      cdolist_list_var = cdolist_list_var.rest();
      edge = cdolist_list_var.first();
    }
    return Sequences.remove_duplicates( conses_high.set_difference( leaves, notleaves, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21523L)
  public static SubLObject edge_list_node_children(final SubLObject edge_list, final SubLObject node)
  {
    SubLObject children = NIL;
    SubLObject cdolist_list_var = edge_list;
    SubLObject edge = NIL;
    edge = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject parent = edge.first();
      final SubLObject child = conses_high.second( edge );
      if( node.equal( parent ) && !child.equal( parent ) )
      {
        children = ConsesLow.cons( child, children );
      }
      cdolist_list_var = cdolist_list_var.rest();
      edge = cdolist_list_var.first();
    }
    return children;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22170L)
  public static SubLObject edge_list_node_parents(final SubLObject edge_list, final SubLObject node)
  {
    SubLObject parents = NIL;
    SubLObject cdolist_list_var = edge_list;
    SubLObject edge = NIL;
    edge = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject parent = edge.first();
      final SubLObject child = conses_high.second( edge );
      if( node.equal( child ) && !child.equal( parent ) )
      {
        parents = ConsesLow.cons( parent, parents );
      }
      cdolist_list_var = cdolist_list_var.rest();
      edge = cdolist_list_var.first();
    }
    return parents;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22809L)
  public static SubLObject remove_self_edges(final SubLObject edge_list)
  {
    SubLObject out = NIL;
    SubLObject cdolist_list_var = edge_list;
    SubLObject edge = NIL;
    edge = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject parent = edge.first();
      final SubLObject child = conses_high.second( edge );
      if( !parent.equal( child ) )
      {
        out = ConsesLow.cons( edge, out );
      }
      cdolist_list_var = cdolist_list_var.rest();
      edge = cdolist_list_var.first();
    }
    return Sequences.nreverse( out );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23400L)
  public static SubLObject edge_list_remove_redundant(final SubLObject edge_list)
  {
    SubLObject removethese = NIL;
    SubLObject cdolist_list_var = edge_list;
    SubLObject edge1 = NIL;
    edge1 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$9 = edge_list;
      SubLObject edge2 = NIL;
      edge2 = cdolist_list_var_$9.first();
      while ( NIL != cdolist_list_var_$9)
      {
        final SubLObject edge1_parent = edge1.first();
        final SubLObject edge1_child = conses_high.second( edge1 );
        final SubLObject edge2_parent = edge2.first();
        final SubLObject edge2_child = conses_high.second( edge2 );
        if( !edge1_parent.equal( edge1_child ) && !edge2_parent.equal( edge2_child ) )
        {
          if( edge2_parent.equal( edge1_child ) && !edge1_parent.equal( edge2_child ) )
          {
            removethese = ConsesLow.cons( ConsesLow.list( edge1_parent, edge2_child ), removethese );
          }
          if( edge1_parent.equal( edge2_child ) && !edge2_parent.equal( edge1_child ) )
          {
            removethese = ConsesLow.cons( ConsesLow.list( edge2_parent, edge1_child ), removethese );
          }
        }
        cdolist_list_var_$9 = cdolist_list_var_$9.rest();
        edge2 = cdolist_list_var_$9.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      edge1 = cdolist_list_var.first();
    }
    return Sequences.nreverse( Sequences.remove_duplicates( conses_high.set_difference( edge_list, removethese, Symbols.symbol_function( EQUAL ), UNPROVIDED ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED,
        UNPROVIDED ) );
  }

  public static SubLObject declare_similarity_file()
  {
    SubLFiles.declareFunction( me, "sim_add_relation", "SIM-ADD-RELATION", 2, 0, false );
    SubLFiles.declareFunction( me, "sim_get_relations", "SIM-GET-RELATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "sim_check_relation", "SIM-CHECK-RELATION", 2, 0, false );
    SubLFiles.declareFunction( me, "make_similarity_tree", "MAKE-SIMILARITY-TREE", 3, 0, false );
    SubLFiles.declareFunction( me, "make_relation_tree", "MAKE-RELATION-TREE", 1, 2, false );
    SubLFiles.declareFunction( me, "pred_term_gafs", "PRED-TERM-GAFS", 3, 2, false );
    SubLFiles.declareFunction( me, "find_relevant_mts", "FIND-RELEVANT-MTS", 2, 0, false );
    SubLFiles.declareFunction( me, "st_find_basis_cols", "ST-FIND-BASIS-COLS", 3, 0, false );
    SubLFiles.declareFunction( me, "st_check_implied", "ST-CHECK-IMPLIED", 4, 0, false );
    SubLFiles.declareFunction( me, "st_order_nodes_in_dag", "ST-ORDER-NODES-IN-DAG", 1, 4, false );
    SubLFiles.declareFunction( me, "st_get_node_number", "ST-GET-NODE-NUMBER", 2, 0, false );
    SubLFiles.declareFunction( me, "st_number_edge_list_nodes", "ST-NUMBER-EDGE-LIST-NODES", 1, 1, false );
    SubLFiles.declareFunction( me, "st_has_other_parents", "ST-HAS-OTHER-PARENTS", 3, 1, false );
    SubLFiles.declareFunction( me, "st_node_with_numberL", "ST-NODE-WITH-NUMBER<", 2, 0, false );
    SubLFiles.declareFunction( me, "st_node_number_sort", "ST-NODE-NUMBER-SORT", 2, 0, false );
    SubLFiles.declareFunction( me, "edge_list_nodes", "EDGE-LIST-NODES", 1, 0, false );
    SubLFiles.declareFunction( me, "edge_list_roots", "EDGE-LIST-ROOTS", 1, 0, false );
    SubLFiles.declareFunction( me, "edge_list_leaves", "EDGE-LIST-LEAVES", 1, 0, false );
    SubLFiles.declareFunction( me, "edge_list_node_children", "EDGE-LIST-NODE-CHILDREN", 2, 0, false );
    SubLFiles.declareFunction( me, "edge_list_node_parents", "EDGE-LIST-NODE-PARENTS", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_self_edges", "REMOVE-SELF-EDGES", 1, 0, false );
    SubLFiles.declareFunction( me, "edge_list_remove_redundant", "EDGE-LIST-REMOVE-REDUNDANT", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_similarity_file()
  {
    $similarity_relation_hash$ = SubLFiles.defparameter( "*SIMILARITY-RELATION-HASH*", Hashtables.make_hash_table( $int0$512, Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
    return NIL;
  }

  public static SubLObject setup_similarity_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_similarity_file();
  }

  @Override
  public void initializeVariables()
  {
    init_similarity_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_similarity_file();
  }
  static
  {
    me = new similarity();
    $similarity_relation_hash$ = null;
    $int0$512 = makeInteger( 512 );
    $kw1$ASSERTED = makeKeyword( "ASSERTED" );
    $sym2$ASSERTED_ASSERTION_ = makeSymbol( "ASSERTED-ASSERTION?" );
    $kw3$BASIS = makeKeyword( "BASIS" );
    $sym4$GENERALITY_ESTIMATE_ = makeSymbol( "GENERALITY-ESTIMATE<" );
    $kw5$IMPLIED = makeKeyword( "IMPLIED" );
    $int6$64 = makeInteger( 64 );
    $sym7$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const8$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $kw9$TRUE = makeKeyword( "TRUE" );
    $sym10$RELEVANT_MT_IS_EQ = makeSymbol( "RELEVANT-MT-IS-EQ" );
    $kw11$GAF = makeKeyword( "GAF" );
    $list12 = ConsesLow.list( ONE_INTEGER );
    $const13$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const14$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $const15$genlPreds = constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) );
    $const16$genlMt = constant_handles.reader_make_constant_shell( makeString( "genlMt" ) );
    $sym17$ST_NODE_WITH_NUMBER_ = makeSymbol( "ST-NODE-WITH-NUMBER<" );
  }
}
/*
 * 
 * Total time: 248 ms
 * 
 */